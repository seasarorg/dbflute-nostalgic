package com.example.dbflute.slim3.unit;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.dbflute.AccessContext;
import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.BehaviorReadable;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.slim3.container.S3Container;
import org.slim3.container.S3ContainerFactory;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import com.atomikos.jdbc.nonxa.AtomikosNonXADataSourceBean;
import com.example.dbflute.slim3.EmbeddedH2UrlFactoryBean;
import com.example.dbflute.slim3.dbflute.allcommon.DBCurrent;
import com.example.dbflute.slim3.dbflute.allcommon.DBFluteModule;
import com.example.dbflute.slim3.dbflute.exbhv.MemberAddressBhv;
import com.example.dbflute.slim3.dbflute.exbhv.MemberLoginBhv;
import com.example.dbflute.slim3.dbflute.exbhv.MemberSecurityBhv;
import com.example.dbflute.slim3.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.slim3.dbflute.exbhv.PurchaseBhv;

/**
 * The test case with container.
 * @author jflute
 * @since 0.9.4 (2009/03/17 Tuesday)
 */
public abstract class ContainerTestCase extends AppSlim3TestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final Log _log = LogFactory.getLog(ContainerTestCase.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                         Common Column
    //                                         -------------
    /** The current session value of accessTimestamp. {Common Column on database} */
    protected Timestamp accessTimestamp;

    /** The current session value of accessUser. {Common Column on database} */
    protected String accessUser;

    /** The current session value of accessProcess. {Common Column on database} */
    protected String accessProcess;

    // -----------------------------------------------------
    //                                    Transaction Object
    //                                    ------------------
    /** The transaction manager for platform. {Transaction Object} */
    protected TransactionManager transactionManager;

    // -----------------------------------------------------
    //                                           Data Source
    //                                           -----------
    /** The data source for database connection. */
    protected DataSource dataSource;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() {
        setupDataSource();
        super.setUp(); // is initializing the container
        initializeAccessContext();
    }

    protected void setupDataSource() {
        dataSource = createDataSource();
    }

    protected DataSource createDataSource() {
        AtomikosNonXADataSourceBean bean = new AtomikosNonXADataSourceBean();
        bean.setUniqueResourceName("NONXADBMS");
        bean.setDriverClassName("org.h2.jdbcx.JdbcDataSource");
        EmbeddedH2UrlFactoryBean factoryBean = new EmbeddedH2UrlFactoryBean();
        factoryBean.setUrlSuffix("/exampledb/exampledb");
        factoryBean.setReferenceClassName(DBCurrent.class.getName());
        String url;
        try {
            url = factoryBean.getObject().toString();
        } catch (Exception e) {
            String msg = "The factoryBean was invalid: " + factoryBean;
            throw new IllegalStateException(msg, e);
        }
        bean.setUrl(url.toString());
        bean.setUser("sa");
        bean.setPassword("");
        bean.setPoolSize(20);
        bean.setBorrowConnectionTimeout(60);
        return bean;
    }

    @Override
    protected void setupApplicationModule() {
        new DBFluteModule(dataSource).configure();
    }

    @Override
    protected void setupTransactionModule() {
        new TransactionModule(dataSource).configure();
    }

    protected static class TransactionModule {

        protected DataSource dataSource;

        public TransactionModule(DataSource dataSource) {
            if (dataSource == null) {
                String msg = "The argument 'dataSource' should not be null!";
                throw new IllegalArgumentException(msg);
            }
            this.dataSource = dataSource;
        }

        public void configure() {
            try {
                UserTransactionImp userTransactionImp = new UserTransactionImp();
                userTransactionImp.setTransactionTimeout(300);
                UserTransactionManager userTransactionManager = new UserTransactionManager();
                userTransactionManager.setForceShutdown(true);
                userTransactionManager.init();
                bind(UserTransaction.class).toInstance(userTransactionImp);
                bind(TransactionManager.class).toInstance(userTransactionManager);

                bind(DataSource.class).toInstance(dataSource);
            } catch (SystemException e) {
                throw new IllegalStateException(e);
            }
        }

        protected Setupper bind(Class<?> type) {
            final S3Container container = S3ContainerFactory.getInstance().getContainer();
            final String name;
            if (BehaviorReadable.class.isAssignableFrom(type)) {
                name = type.getSimpleName();
            } else {
                name = type.getName();
            }
            return new Setupper() {
                public void toInstance(Object instance) {
                    container.bind(name, instance);
                }
            };
        }

        protected static interface Setupper {
            void toInstance(Object instance);
        }
    }

    @Override
    protected void beginTransaction() {
        try {
            transactionManager.begin();
        } catch (NotSupportedException e) {
            throw new IllegalStateException(e);
        } catch (SystemException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Initialize the context of access for common column auto set-up. <br />
     * You should implement this in your AOP class of front class
     * (for example Page class) at your real project.
     */
    protected void initializeAccessContext() {
        accessTimestamp = currentTimestamp();
        accessUser = "testUser";
        accessProcess = getClass().getSimpleName();
        AccessContext context = new AccessContext();
        context.setAccessTimestamp(accessTimestamp);
        context.setAccessUser(accessUser);
        context.setAccessProcess(accessProcess);
        AccessContext.setAccessContextOnThread(context);
    }

    @Override
    public void tearDown() {
        destroyAccessContext();
        super.tearDown();
    }

    /**
     * Destroy the context of access in thread local.
     * You should implement this in your AOP class of front class
     * (for example Page class) at your real project.
     */
    protected void destroyAccessContext() {
        AccessContext.clearAccessContextOnThread();
    }

    @Override
    protected void rollbackTransaction() {
        try {
            transactionManager.rollback();
        } catch (SystemException e) {
            throw new IllegalStateException(e);
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    private BehaviorSelector _behaviorSelector;

    protected void deleteMemberReferrers() {
        {
            PurchaseBhv bhv = _behaviorSelector.select(PurchaseBhv.class);
            bhv.queryDelete(bhv.newMyConditionBean());
        }
        {
            MemberWithdrawalBhv bhv = _behaviorSelector.select(MemberWithdrawalBhv.class);
            bhv.queryDelete(bhv.newMyConditionBean());
        }
        {
            MemberSecurityBhv bhv = _behaviorSelector.select(MemberSecurityBhv.class);
            bhv.queryDelete(bhv.newMyConditionBean());
        }
        {
            MemberLoginBhv bhv = _behaviorSelector.select(MemberLoginBhv.class);
            bhv.queryDelete(bhv.newMyConditionBean());
        }
        {
            MemberAddressBhv bhv = _behaviorSelector.select(MemberAddressBhv.class);
            bhv.queryDelete(bhv.newMyConditionBean());
        }
    }

    protected void showPage(PagingResultBean<? extends Object>... pages) {
        for (PagingResultBean<? extends Object> page : pages) {
            log(page);
        }
        int count = 1;
        for (PagingResultBean<? extends Object> page : pages) {
            log("[page" + count + "]");
            for (Object entity : page) {
                log("  " + entity);
            }
            ++count;
        }
    }

    protected void showList(List<? extends Object>... lss) {
        for (List<? extends Object> ls : lss) {
            log(ls);
        }
        int count = 1;
        for (List<? extends Object> ls : lss) {
            log("[page" + count + "]");
            for (Object entity : ls) {
                log("  " + entity);
            }
            ++count;
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected void log(Object msg) {
        _log.debug(msg);
    }

    protected Date currentDate() {
        return new Date(System.currentTimeMillis());
    }

    protected Timestamp currentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }

    protected static String getLineSeparator() {
        return "\n";
    }
}

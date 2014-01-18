package com.example.dbflute.lucy.unit;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.dbflute.AccessContext;
import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.DeleteOption;
import org.seasar.dbflute.cbean.PagingResultBean;

import com.example.dbflute.lucy.dbflute.cbean.MemberAddressCB;
import com.example.dbflute.lucy.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.lucy.dbflute.cbean.MemberSecurityCB;
import com.example.dbflute.lucy.dbflute.cbean.MemberWithdrawalCB;
import com.example.dbflute.lucy.dbflute.cbean.PurchaseCB;
import com.example.dbflute.lucy.dbflute.exbhv.MemberAddressBhv;
import com.example.dbflute.lucy.dbflute.exbhv.MemberLoginBhv;
import com.example.dbflute.lucy.dbflute.exbhv.MemberSecurityBhv;
import com.example.dbflute.lucy.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.lucy.dbflute.exbhv.PurchaseBhv;

/**
 * The test case with container.
 * @author jflute
 * @since 0.9.0 (2009/01/17 Saturday)
 */
public abstract class ContainerTestCase extends BasicLucyTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance for sub class. */
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

    /** The data source for database connection. (NotNull) */
    protected DataSource dataSource;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() {
        super.setUp();
        initializeAccessContext();
    }

    @Override
    protected String[] getConfigurations() {
        return new String[] { "dbfluteBeans.xml", "jdbcBeans.xml" };
    }

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

    protected void destroyAccessContext() {
        AccessContext.clearAccessContextOnThread();
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    private BehaviorSelector _behaviorSelector;

    protected void deleteMemberReferrer() {
        {
            MemberAddressBhv bhv = _behaviorSelector.select(MemberAddressBhv.class);
            MemberAddressCB cb = bhv.newMyConditionBean();
            bhv.varyingQueryDelete(cb, new DeleteOption<MemberAddressCB>().allowNonQueryDelete());
        }
        {
            MemberLoginBhv bhv = _behaviorSelector.select(MemberLoginBhv.class);
            MemberLoginCB cb = bhv.newMyConditionBean();
            bhv.varyingQueryDelete(cb, new DeleteOption<MemberLoginCB>().allowNonQueryDelete());
        }
        {
            MemberSecurityBhv bhv = _behaviorSelector.select(MemberSecurityBhv.class);
            MemberSecurityCB cb = bhv.newMyConditionBean();
            bhv.varyingQueryDelete(cb, new DeleteOption<MemberSecurityCB>().allowNonQueryDelete());
        }
        {
            MemberWithdrawalBhv bhv = _behaviorSelector.select(MemberWithdrawalBhv.class);
            MemberWithdrawalCB cb = bhv.newMyConditionBean();
            bhv.varyingQueryDelete(cb, new DeleteOption<MemberWithdrawalCB>().allowNonQueryDelete());
        }
        {
            PurchaseBhv bhv = _behaviorSelector.select(PurchaseBhv.class);
            PurchaseCB cb = bhv.newMyConditionBean();
            bhv.varyingQueryDelete(cb, new DeleteOption<PurchaseCB>().allowNonQueryDelete());
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

package com.example.dbflute.slim3.dbflute.allcommon;

import javax.sql.DataSource;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.bhv.core.InvokerAssistant;
import org.seasar.dbflute.bhv.core.supplement.SequenceCacheHandler;
import org.seasar.dbflute.bhv.core.supplement.SequenceCacheKeyGenerator;
import org.seasar.dbflute.cbean.cipher.GearedCipherManager;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.exception.factory.SQLExceptionHandlerFactory;
import org.seasar.dbflute.exception.factory.DefaultSQLExceptionHandlerFactory;
import org.seasar.dbflute.exception.thrower.BehaviorExceptionThrower;
import org.seasar.dbflute.jdbc.DataSourceHandler;
import org.seasar.dbflute.jdbc.HandlingDataSourceWrapper;
import org.seasar.dbflute.jdbc.SQLExceptionDigger;
import org.seasar.dbflute.jdbc.StatementConfig;
import org.seasar.dbflute.jdbc.StatementFactory;
import org.seasar.dbflute.outsidesql.factory.DefaultOutsideSqlExecutorFactory;
import org.seasar.dbflute.outsidesql.factory.OutsideSqlExecutorFactory;
import org.seasar.dbflute.resource.ResourceParameter;
import org.seasar.dbflute.s2dao.extension.TnBeanMetaDataFactoryExtension;
import org.seasar.dbflute.s2dao.jdbc.TnStatementFactoryImpl;
import org.seasar.dbflute.s2dao.metadata.TnBeanMetaDataFactory;
import org.seasar.dbflute.twowaysql.factory.DefaultSqlAnalyzerFactory;
import org.seasar.dbflute.twowaysql.factory.SqlAnalyzerFactory;

/**
 * @author DBFlute(AutoGenerator)
 */
public class ImplementedInvokerAssistant implements InvokerAssistant {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected static final String[] DEFAULT_CLIENT_INVOKE_NAMES
        = new String[] { "Page", "Action", "Controller", "ControllerImpl", "Task", "Test" };

    protected static final String[] DEFAULT_BYPASS_INVOKE_NAMES
        = new String[] { "Service", "ServiceImpl", "Facade", "FacadeImpl", "Logic", "LogicImpl" };

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                          DI Component
    //                                          ------------
    protected DataSource _dataSource;
    protected DBFluteInitializer _introduction;

    // -----------------------------------------------------
    //                                        Lazy Component
    //                                        --------------
    protected volatile DBMetaProvider _dbmetaProvider;
    protected volatile SqlClauseCreator _sqlClauseCreator;
    protected volatile StatementFactory _statementFactory;
    protected volatile TnBeanMetaDataFactory _beanMetaDataFactory;
    protected volatile SqlAnalyzerFactory _sqlAnalyzerFactory;
    protected volatile OutsideSqlExecutorFactory _outsideSqlExecutorFactory;
    protected volatile SQLExceptionHandlerFactory _sqlExceptionHandlerFactory;
    protected volatile SequenceCacheHandler _sequenceCacheHandler;

    // -----------------------------------------------------
    //                                       Disposable Flag
    //                                       ---------------
    protected volatile boolean _disposable;

    // ===================================================================================
    //                                                                 Assistant Main Work
    //                                                                 ===================
    // -----------------------------------------------------
    //                                         Current DBDef
    //                                         -------------
    public DBDef assistCurrentDBDef() {
        return DBCurrent.getInstance().currentDBDef();
    }

    // -----------------------------------------------------
    //                                           Data Source
    //                                           -----------
    public DataSource assistDataSource() { // DI component
        // this instance will be cached in SQL executions
        // so the handler should be set before initialization of DBFlute
        // (and it means you cannot switch data source after initialization)
        DataSourceHandler handler = DBFluteConfig.getInstance().getDataSourceHandler();
        return handler != null ? new HandlingDataSourceWrapper(_dataSource, handler) : _dataSource;
    }

    // -----------------------------------------------------
    //                                       DBMeta Provider
    //                                       ---------------
    public DBMetaProvider assistDBMetaProvider() { // lazy component
        if (_dbmetaProvider != null) {
            return _dbmetaProvider;
        }
        synchronized (this) {
            if (_dbmetaProvider != null) {
                return _dbmetaProvider;
            }
            _dbmetaProvider = createDBMetaProvider();
        }
        return _dbmetaProvider;
    }

    protected DBMetaProvider createDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // -----------------------------------------------------
    //                                    SQL Clause Creator
    //                                    ------------------
    public SqlClauseCreator assistSqlClauseCreator() { // lazy component
        if (_sqlClauseCreator != null) {
            return _sqlClauseCreator;
        }
        synchronized (this) {
            if (_sqlClauseCreator != null) {
                return _sqlClauseCreator;
            }
            _sqlClauseCreator = createSqlClauseCreator();
        }
        return _sqlClauseCreator;
    }

    protected SqlClauseCreator createSqlClauseCreator() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator;
        }
        return new ImplementedSqlClauseCreator(); // as default
    }

    // -----------------------------------------------------
    //                                     Statement Factory
    //                                     -----------------
    public StatementFactory assistStatementFactory() { // lazy component
        if (_statementFactory != null) {
            return _statementFactory;
        }
        synchronized (this) {
            if (_statementFactory != null) {
                return _statementFactory;
            }
            _statementFactory = createStatementFactory();
        }
        return _statementFactory;
    }

    protected StatementFactory createStatementFactory() {
        final TnStatementFactoryImpl factory = new TnStatementFactoryImpl();
        factory.setDefaultStatementConfig(assistDefaultStatementConfig());
        factory.setInternalDebug(DBFluteConfig.getInstance().isInternalDebug());
        factory.setCursorSelectFetchSize(DBFluteConfig.getInstance().getCursorSelectFetchSize());
        return factory;
    }

    // -----------------------------------------------------
    //                                Bean Meta Data Factory
    //                                ----------------------
    public TnBeanMetaDataFactory assistBeanMetaDataFactory() { // lazy component
        if (_beanMetaDataFactory != null) {
            return _beanMetaDataFactory;
        }
        synchronized (this) {
            if (_beanMetaDataFactory != null) {
                return _beanMetaDataFactory;
            }
            _beanMetaDataFactory = createBeanMetaDataFactory();
        }
        return _beanMetaDataFactory;
    }

    protected TnBeanMetaDataFactory createBeanMetaDataFactory() {
        final TnBeanMetaDataFactoryExtension factory = new TnBeanMetaDataFactoryExtension();
        factory.setDataSource(_dataSource);
        factory.setInternalDebug(DBFluteConfig.getInstance().isInternalDebug());
        return factory;
    }

    // -----------------------------------------------------
    //                                  SQL Analyzer Factory
    //                                  --------------------
    /**
     * {@inheritDoc}
     */
    public SqlAnalyzerFactory assistSqlAnalyzerFactory() { // lazy component
        if (_sqlAnalyzerFactory != null) {
            return _sqlAnalyzerFactory;
        }
        synchronized (this) {
            if (_sqlAnalyzerFactory != null) {
                return _sqlAnalyzerFactory;
            }
            _sqlAnalyzerFactory = createSqlAnalyzerFactory();
        }
        return _sqlAnalyzerFactory;
    }

    protected SqlAnalyzerFactory createSqlAnalyzerFactory() {
        return new DefaultSqlAnalyzerFactory();
    }

    // -----------------------------------------------------
    //                           OutsideSql Executor Factory
    //                           ---------------------------
    /**
     * {@inheritDoc}
     */
    public OutsideSqlExecutorFactory assistOutsideSqlExecutorFactory() {
        if (_outsideSqlExecutorFactory != null) {
            return _outsideSqlExecutorFactory;
        }
        synchronized (this) {
            if (_outsideSqlExecutorFactory != null) {
                return _outsideSqlExecutorFactory;
            }
            _outsideSqlExecutorFactory = createOutsideSqlExecutorFactory();
        }
        return _outsideSqlExecutorFactory;
    }

    protected OutsideSqlExecutorFactory createOutsideSqlExecutorFactory() {
        OutsideSqlExecutorFactory factory = DBFluteConfig.getInstance().getOutsideSqlExecutorFactory();
        if (factory != null) {
            return factory;
        }
        return new DefaultOutsideSqlExecutorFactory();
    }

    // -----------------------------------------------------
    //                                   SQLException Digger
    //                                   -------------------
    /**
     * {@inheritDoc}
     */
    public SQLExceptionDigger assistSQLExceptionDigger() {
        return DBFluteConfig.getInstance().getSQLExceptionDigger();
    }

    // -----------------------------------------------------
    //                          SQLException Handler Factory
    //                          ----------------------------
    /**
     * {@inheritDoc}
     */
    public SQLExceptionHandlerFactory assistSQLExceptionHandlerFactory() { // lazy component
        if (_sqlExceptionHandlerFactory != null) {
            return _sqlExceptionHandlerFactory;
        }
        synchronized (this) {
            if (_sqlExceptionHandlerFactory != null) {
                return _sqlExceptionHandlerFactory;
            }
            _sqlExceptionHandlerFactory = createSQLExceptionHandlerFactory();
        }
        return _sqlExceptionHandlerFactory;
    }

    protected SQLExceptionHandlerFactory createSQLExceptionHandlerFactory() {
        return new DefaultSQLExceptionHandlerFactory();
    }

    // -----------------------------------------------------
    //                                Sequence Cache Handler
    //                                ----------------------
    /**
     * {@inheritDoc}
     */
    public SequenceCacheHandler assistSequenceCacheHandler() { // lazy component
        if (_sequenceCacheHandler != null) {
            return _sequenceCacheHandler;
        }
        synchronized (this) {
            if (_sequenceCacheHandler != null) {
                return _sequenceCacheHandler;
            }
            _sequenceCacheHandler = createSequenceCacheHandler();
        }
        return _sequenceCacheHandler;
    }

    protected SequenceCacheHandler createSequenceCacheHandler() {
        SequenceCacheHandler handler = new SequenceCacheHandler();
        SequenceCacheKeyGenerator generator = DBFluteConfig.getInstance().getSequenceCacheKeyGenerator();
        if (generator != null) {
            handler.setSequenceCacheKeyGenerator(generator);
        }
        handler.setInternalDebug(DBFluteConfig.getInstance().isInternalDebug());
        return handler;
    }

    // -----------------------------------------------------
    //                                     SQL File Encoding
    //                                     -----------------
    public String assistSqlFileEncoding() {
        return "UTF-8";
    }

    // -----------------------------------------------------
    //                               Statement Configuration
    //                               -----------------------
    public StatementConfig assistDefaultStatementConfig() {
        return DBFluteConfig.getInstance().getDefaultStatementConfig();
    }

    // -----------------------------------------------------
    //                            Behavior Exception Thrower
    //                            --------------------------
    public BehaviorExceptionThrower assistBehaviorExceptionThrower() {
        return new BehaviorExceptionThrower();
    }

    // -----------------------------------------------------
    //                                 Geared Cipher Manager
    //                                 ---------------------
    public GearedCipherManager assistGearedCipherManager() {
        return DBFluteConfig.getInstance().getGearedCipherManager();
    }

    // -----------------------------------------------------
    //                                    Resource Parameter
    //                                    ------------------
    public ResourceParameter assistResourceParameter() {
        ResourceParameter resourceParameter = new ResourceParameter();
        resourceParameter.setOutsideSqlPackage(DBFluteConfig.getInstance().getOutsideSqlPackage());
        resourceParameter.setLogDateFormat(DBFluteConfig.getInstance().getLogDateFormat());
        resourceParameter.setLogTimestampFormat(DBFluteConfig.getInstance().getLogTimestampFormat());
        resourceParameter.setInternalDebug(DBFluteConfig.getInstance().isInternalDebug());
        return resourceParameter;
    }

    // -----------------------------------------------------
    //                                          Invoke Names
    //                                          ------------
    public String[] assistClientInvokeNames() {
        return DEFAULT_CLIENT_INVOKE_NAMES;
    }

    public String[] assistByPassInvokeNames() {
        return DEFAULT_BYPASS_INVOKE_NAMES;
    }

    // ===================================================================================
    //                                                                             Dispose
    //                                                                             =======
    public void toBeDisposable(final DisposableProcess callerProcess) { // for HotDeploy
        // do nothing: unsupported at this DI container
    }

    public boolean isDisposable() {
        return _disposable;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setDataSource(DataSource dataSource) {
        _dataSource = dataSource;
    }

    // to check the initializer is an instance of DBFluteInitializer
    // when the initializer is extended by DBFlute property
    // so this variable is actually unused in this class
    // (needs to be injected only when the DI container
    // is set by its DI setting file)
    public void setIntroduction(DBFluteInitializer introduction) {
        _introduction = introduction;
    }
}

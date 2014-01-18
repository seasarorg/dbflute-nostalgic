/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core;

import dbflute.ldb.allcommon.LdDBDef;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaProvider;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClauseCreator;

/**
 * The context of resource.
 * @author DBFlute(AutoGenerator)
 */
public class LdResourceContext {

    // ===================================================================================
    //                                                                        Thread Local
    //                                                                        ============
    /** The thread-local for this. */
    private static final ThreadLocal<LdResourceContext> threadLocal = new ThreadLocal<LdResourceContext>();

    /**
     * Get the context of resource by the key.
     * @return The context of resource. (Nullable)
     */
    public static LdResourceContext getResourceContextOnThread() {
        return threadLocal.get();
    }

    /**
     * Set the context of resource.
     * @param resourceCountext The context of resource. (NotNull)
     */
    public static void setResourceContextOnThread(LdResourceContext resourceCountext) {
        threadLocal.set(resourceCountext);
    }

    /**
     * Is existing the context of resource on thread?
     * @return Determination.
     */
    public static boolean isExistResourceContextOnThread() {
        return (threadLocal.get() != null);
    }

    /**
     * Clear the context of resource on thread.
     */
    public static void clearResourceContextOnThread() {
        threadLocal.set(null);
    }

    // ===================================================================================
    //                                                                         Easy-to-Use
    //                                                                         ===========
    /**
     * @return The current database definition. (NotNull)
     */
    public static LdDBDef currentDBDef() {
        if (!isExistResourceContextOnThread()) {
            return LdDBDef.Unknown;
        }
        LdDBDef currentDBDef = getResourceContextOnThread().getCurrentDBDef();
        if (currentDBDef == null) {
            return LdDBDef.Unknown;
        }
        return currentDBDef;
    }

    public static boolean isCurrentDBDef(LdDBDef targetDBDef) {
        return currentDBDef().equals(targetDBDef);
    }

    /**
     * @return The provider of DB meta. (NotNull)
     */
    public static LdDBMetaProvider dbmetaProvider() {
        if (!isExistResourceContextOnThread()) {
            String msg = "The resource context should exist!";
            throw new IllegalStateException(msg);
        }
        LdDBMetaProvider provider = getResourceContextOnThread().getDBMetaProvider();
        if (provider == null) {
            String msg = "The provider of DB meta should exist!";
            throw new IllegalStateException(msg);
        }
        return provider;
    }

    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (Nullable)
     */
    public static LdDBMeta provideDBMeta(String tableFlexibleName) {
        if (!isExistResourceContextOnThread()) {
            return null;
        }
        LdDBMetaProvider provider = getResourceContextOnThread().getDBMetaProvider();
        if (provider == null) {
            return null;
        }
        return provider.provideDBMeta(tableFlexibleName);
    }

    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     */
    public static LdDBMeta provideDBMetaChecked(String tableFlexibleName) {
        if (!isExistResourceContextOnThread()) {
            String msg = "The resource context should exist: " + tableFlexibleName;
            throw new IllegalStateException(msg);
        }
        LdDBMetaProvider provider = getResourceContextOnThread().getDBMetaProvider();
        if (provider == null) {
            String msg = "The provider of DB meta should exist: " + tableFlexibleName;
            throw new IllegalStateException(msg);
        }
        return provider.provideDBMetaChecked(tableFlexibleName);
    }

    /**
     * Is the SQLException from unique constraint? {Use both SQLState and ErrorCode}
     * @param sqlState SQLState of the SQLException. (Nullable)
     * @param errorCode ErrorCode of the SQLException. (Nullable)
     * @return Is the SQLException from unique constraint?
     */
    public static boolean isUniqueConstraintException(String sqlState, Integer errorCode) {
        if (!isExistResourceContextOnThread()) {
            return false;
        }
        LdSqlClauseCreator sqlClauseCreator = getResourceContextOnThread().getSqlClauseCreator();
        if (sqlClauseCreator == null) {
            return false;
        }
        return sqlClauseCreator.createSqlClause("dummy").isUniqueConstraintException(sqlState, errorCode);
    }
    
    public static String getOutsideSqlPackage() {
        LdResourceParameter resourceParameter = resourceParameter();
        if (resourceParameter == null) {
            return null;
        }
        return resourceParameter.getOutsideSqlPackage();
    }
    
    public static String getLogDateFormat() {
        LdResourceParameter resourceParameter = resourceParameter();
        if (resourceParameter == null) {
            return null;
        }
        return resourceParameter.getLogDateFormat();
    }
    
    public static String getLogTimestampFormat() {
        LdResourceParameter resourceParameter = resourceParameter();
        if (resourceParameter == null) {
            return null;
        }
        return resourceParameter.getLogTimestampFormat();
    }
    
    protected static LdResourceParameter resourceParameter() {
        if (!isExistResourceContextOnThread()) {
            return null;
        }
        LdResourceParameter resourceParameter = getResourceContextOnThread().getResourceParameter();
        if (resourceParameter == null) {
            return null;
        }
        return resourceParameter;
    }

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdDBDef _currentDBDef;
    protected LdDBMetaProvider _dbmetaProvider;
    protected LdSqlClauseCreator _sqlClauseCreator;
    protected LdResourceParameter _resourceParameter;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public LdDBDef getCurrentDBDef() {
        return _currentDBDef;
    }

    public void setCurrentDBDef(LdDBDef currentDBDef) {
        _currentDBDef = currentDBDef;
    }

    public LdDBMetaProvider getDBMetaProvider() {
        return _dbmetaProvider;
    }

    public void setDBMetaProvider(LdDBMetaProvider dbmetaProvider) {
        _dbmetaProvider = dbmetaProvider;
    }

    public LdSqlClauseCreator getSqlClauseCreator() {
        return _sqlClauseCreator;
    }

    public void setSqlClauseCreator(LdSqlClauseCreator sqlClauseCreator) {
        _sqlClauseCreator = sqlClauseCreator;
    }

    public LdResourceParameter getResourceParameter() {
        return _resourceParameter;
    }

    public void setResourceParameter(LdResourceParameter resourceParameter) {
        _resourceParameter = resourceParameter;
    }
}

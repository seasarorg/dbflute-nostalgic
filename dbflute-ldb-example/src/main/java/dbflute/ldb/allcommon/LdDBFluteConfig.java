/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon;

import dbflute.ldb.allcommon.jdbc.LdStatementConfig;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdDBFluteConfig {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(LdDBFluteConfig.class);

    /** Singleton instance. */
    private static final LdDBFluteConfig _instance = new LdDBFluteConfig();

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
	protected LdStatementConfig _defaultStatementConfig;
	protected boolean _queryLogLevelInfo;
	protected boolean _executeStatusLogLevelInfo;
	protected String _logDateFormat;
	protected String _logTimestampFormat;
	protected boolean _useSqlLogRegistry;
    protected String _outsideSqlPackage;
	protected boolean _internalDebug;
	protected boolean _locked = true;
	
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     */
    private LdDBFluteConfig() {
    }

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    /**
     * Get instance.
     * @return Singleton instance. (NotNull)
     */
    public static LdDBFluteConfig getInstance() {
        return _instance;
    }

    // ===================================================================================
    //                                                            Default Statement Config
    //                                                            ========================
    public LdStatementConfig getDefaultStatementConfig() {
        return _defaultStatementConfig;
    }
	
    public void setDefaultStatementConfig(LdStatementConfig defaultStatementConfig) {
	    assertNotLocked();
	    if (_log.isInfoEnabled()) {
		    _log.info("...Setting defaultStatementConfig: " + defaultStatementConfig);
		}
        _defaultStatementConfig = defaultStatementConfig;
    }
	
    // ===================================================================================
    //                                                                Query Log Level Info
    //                                                                ====================
	public void setQueryLogLevelInfo(boolean queryLogLevelInfo) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting queryLogLevelInfo: " + queryLogLevelInfo);
		}
		LdQLog.unlock();
		LdQLog.setQueryLogLevelInfo(queryLogLevelInfo);
		LdQLog.lock();
	}
	
    // ===================================================================================
    //                                                       Execute Status Log Level Info
    //                                                       =============================
	public void setExecuteStatusLogLevelInfo(boolean executeStatusLogLevelInfo) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting executeStatusLogLevelInfo: " + executeStatusLogLevelInfo);
		}
		LdXLog.unlock();
        LdXLog.setExecuteStatusLogLevelInfo(executeStatusLogLevelInfo);
		LdXLog.lock();
	}

    // ===================================================================================
    //                                                                          Log Format
    //                                                                          ==========
	public String getLogDateFormat() {
	    return _logDateFormat;
	}
	
	public void setLogDateFormat(String logDateFormat) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting logDateFormat: " + logDateFormat);
		}
	    _logDateFormat = logDateFormat;
	}

	public String getLogTimestampFormat() {
	    return _logTimestampFormat;
	}
	
	public void setLogTimestampFormat(String logTimestampFormat) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting logTimestampFormat: " + logTimestampFormat);
		}
	    _logTimestampFormat = logTimestampFormat;
	}
	
    // [DBFlute-0.8.2]
    // ===================================================================================
    //                                                                    SQL Log Registry
    //                                                                    ================
	public boolean isUseSqlLogRegistry() {
	    return _useSqlLogRegistry;
	}
	
	public void setUseSqlLogRegistry(boolean useSqlLogRegistry) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting useSqlLogRegistry: " + useSqlLogRegistry);
		}
	    _useSqlLogRegistry = useSqlLogRegistry;
	}

    // ===================================================================================
    //                                                                  OutsideSql Package
    //                                                                  ==================
	public String getOutsideSqlPackage() {
	    return _outsideSqlPackage;
	}
	
	public void setOutsideSqlPackage(String outsideSqlPackage) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting outsideSqlPackage: " + outsideSqlPackage);
		}
	    _outsideSqlPackage = outsideSqlPackage;
	}
    
    // ===================================================================================
    //                                                                      Internal Debug
    //                                                                      ==============
	public boolean isInternalDebug() {
	    return _internalDebug;
	}
	
	public void setInternalDebug(boolean internalDebug) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting internalDebug: " + internalDebug);
		}
	    _internalDebug = internalDebug;
	}
	
    // ===================================================================================
    //                                                                         Config Lock
    //                                                                         ===========
	public boolean isLocked() {
	    return _locked;
	}
	
	public void lock() {
		if (_log.isInfoEnabled()) {
		    _log.info("...Locking the config of dbflute!");
		}
	    _locked = true;
	}
	
	public void unlock() {
		if (_log.isInfoEnabled()) {
		    _log.info("...Unlocking the config of dbflute!");
		}
	    _locked = false;
	}
	
	protected void assertNotLocked() {
	    if (!isLocked()) {
		    return;
		}
		String msg = "The config of dbflute is locked! Don't access at this timing!";
		throw new IllegalStateException(msg);
	}
	
    // ===================================================================================
    //                                                                        Config Clear
    //                                                                        ============
	public void clear() { // the only properties that update OK while executing
	    _defaultStatementConfig = null;
	    _queryLogLevelInfo = false;
	    _executeStatusLogLevelInfo = false;
	    _logDateFormat = null;
	    _logTimestampFormat = null;
	    _useSqlLogRegistry = false;
	    _outsideSqlPackage = null;
		_internalDebug = false;
	}
}
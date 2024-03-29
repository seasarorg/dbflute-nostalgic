package com.example.dbflute.basic.dbflute.allcommon;

/**
 * @author DBFlute(AutoGenerator)
 */
public class XLog {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(XLog.class);
	protected static boolean _executeStatusLogLevelInfo;
	protected static boolean _locked = true;

    // ===================================================================================
    //                                                                             Logging
    //                                                                             =======
	public static void log(String msg) {// Very Internal
		if (isExecuteStatusLogLevelInfo()) {
	        _log.info(msg);
		} else {
	        _log.debug(msg);
		}
	}
	
    public static boolean isLogEnabled() {// Very Internal
		if (isExecuteStatusLogLevelInfo()) {
	        return _log.isInfoEnabled();
		} else {
	        return _log.isDebugEnabled();
		}
	}
	
	protected static boolean isExecuteStatusLogLevelInfo() {
	    return _executeStatusLogLevelInfo;
	}

	public static void setExecuteStatusLogLevelInfo(boolean executeStatusLogLevelInfo) {
	    assertNotLocked();
		if (_log.isInfoEnabled()) {
		    _log.info("...Setting executeStatusLogLevelInfo: " + executeStatusLogLevelInfo);
		}
	    _executeStatusLogLevelInfo = executeStatusLogLevelInfo;
	}
	
    // ===================================================================================
    //                                                                                Lock
    //                                                                                ====
	public static boolean isLocked() {
	    return _locked;
	}
	
	public static void lock() {
		if (_log.isInfoEnabled()) {
		    _log.info("...Locking the log object for execute status!");
		}
	    _locked = true;
	}
	
	public static void unlock() {
		if (_log.isInfoEnabled()) {
		    _log.info("...Unlocking the log object for execute status!");
		}
	    _locked = false;
	}
	
	protected static void assertNotLocked() {
	    if (!isLocked()) {
		    return;
		}
		String msg = "The QLog is locked! Don't access at this timing!";
		throw new IllegalStateException(msg);
	}
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon;

import dbflute.ldb.allcommon.jdbc.LdSqlLogHandler;

/**
 * The context of callback.
 * @author DBFlute(AutoGenerator)
 */
public class LdCallbackContext {

    // ===================================================================================
    //                                                                        Thread Local
    //                                                                        ============
    /** The thread-local for this. */
    private static final ThreadLocal<LdCallbackContext> _threadLocal = new ThreadLocal<LdCallbackContext>();

    /**
     * Get callback-context on thread.
     * @return The context of callback. (Nullable)
     */
    public static LdCallbackContext getCallbackContextOnThread() {
        return (LdCallbackContext) _threadLocal.get();
    }

    /**
     * Set callback-context on thread.
     * @param callbackContext The context of callback. (NotNull)
     */
    public static void setCallbackContextOnThread(LdCallbackContext callbackContext) {
        if (callbackContext == null) {
            String msg = "The argument[callbackContext] must not be null.";
            throw new IllegalArgumentException(msg);
        }
        _threadLocal.set(callbackContext);
    }

    /**
     * Is existing callback-context on thread?
     * @return Determination.
     */
    public static boolean isExistCallbackContextOnThread() {
        return (_threadLocal.get() != null);
    }

    /**
     * Clear callback-context on thread.
     */
    public static void clearCallbackContextOnThread() {
        _threadLocal.set(null);
    }

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdSqlLogHandler _sqlLogHandler;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public LdSqlLogHandler getSqlLogHandler() {
        return _sqlLogHandler;
    }

    public void setSqlLogHandler(LdSqlLogHandler sqlLogHandler) {
        this._sqlLogHandler = sqlLogHandler;
    }
}

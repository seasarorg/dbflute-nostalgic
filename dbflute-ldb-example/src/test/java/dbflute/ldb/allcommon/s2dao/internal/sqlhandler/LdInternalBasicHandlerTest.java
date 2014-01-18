package dbflute.ldb.allcommon.s2dao.internal.sqlhandler;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import dbflute.PlainTestCase;
import dbflute.ldb.allcommon.LdCallbackContext;
import dbflute.ldb.allcommon.exception.LdSQLFailureException;
import dbflute.ldb.allcommon.jdbc.LdSqlLogHandler;
import dbflute.ldb.allcommon.s2dao.internal.sqllog.LdInternalSqlLogRegistry;

/**
 * @author jflute
 * @since 0.8.2 (2008/10/18 Saturday)
 */
public class LdInternalBasicHandlerTest extends PlainTestCase {

    // ===================================================================================
    //                                                                        Common Logic
    //                                                                        ============
    // -----------------------------------------------------
    //                                         Args Handling
    //                                         -------------

    // -----------------------------------------------------
    //                                           SQL Logging
    //                                           -----------
    @Override
    protected void setUp() throws Exception {
        // The same as after DBFlute initialized.
        LdInternalSqlLogRegistry.closeRegistration();
        LdCallbackContext.clearCallbackContextOnThread();
        super.setUp();
    }

    public void test_logSql_CheckDetermination_NoLogging() {
        final Set<String> markSet = new HashSet<String>();
        new LdInternalBasicHandler(null, null) {
            @Override
            protected boolean isLogEnabled() {
                markSet.add("isLogEnabled() called");
                return false;
            }

            @Override
            protected void log(String msg) {
                fail("This method should not be called: " + msg);
            }
        }.logSql(null, null);
        assertTrue(markSet.contains("isLogEnabled() called"));
        assertNull(LdInternalSqlLogRegistry.findContainerSqlLogRegistry());
    }

    public void test_logSql_CheckDetermination_with_SqlLogHandler() {
        LdCallbackContext callbackContext = new LdCallbackContext();
        final Set<String> markSet = new HashSet<String>();
        callbackContext.setSqlLogHandler(new LdSqlLogHandler() {
            public void handle(String executedSql, String displaySql, Object[] args, Class<?>[] argTypes) {
                markSet.add("handle() called");
            }
        });
        LdCallbackContext.setCallbackContextOnThread(callbackContext);
        try {
            new LdInternalBasicHandler(null, null) {
                @Override
                protected boolean isLogEnabled() {
                    markSet.add("isLogEnabled() called");
                    return false;
                }

                @Override
                protected void log(String msg) {
                    fail("This method should not be called: " + msg);
                }
            }.logSql(null, null);
            assertTrue(markSet.contains("isLogEnabled() called"));
            assertTrue(markSet.contains("handle() called"));
            assertNull(LdInternalSqlLogRegistry.findContainerSqlLogRegistry());
        } finally {
            LdCallbackContext.clearCallbackContextOnThread();
        }
    }

    public void test_logSql_CheckDetermination_with_SqlLogRegistry() {
        final Set<String> markSet = new HashSet<String>();
        assertTrue(LdInternalSqlLogRegistry.setupSqlLogRegistry());
        try {
            new LdInternalBasicHandler(null, null) {
                @Override
                protected boolean isLogEnabled() {
                    markSet.add("isLogEnabled() called");
                    return false;
                }

                @Override
                protected void log(String msg) {
                    fail("This method should not be called: " + msg);
                }
            }.logSql(null, null);
            assertTrue(markSet.contains("isLogEnabled() called"));
            assertNotNull(LdInternalSqlLogRegistry.findContainerSqlLogRegistry());
        } finally {
            LdInternalSqlLogRegistry.closeRegistration();
        }
    }

    public void test_logSql_CheckDetermination_with_SqlLogHandler_and_Registry() {
        LdCallbackContext callbackContext = new LdCallbackContext();
        final Set<String> markSet = new HashSet<String>();
        callbackContext.setSqlLogHandler(new LdSqlLogHandler() {
            public void handle(String executedSql, String displaySql, Object[] args, Class<?>[] argTypes) {
                markSet.add("handle() called");
            }
        });
        LdCallbackContext.setCallbackContextOnThread(callbackContext);
        assertTrue(LdInternalSqlLogRegistry.setupSqlLogRegistry());
        try {
            new LdInternalBasicHandler(null, null) {
                @Override
                protected boolean isLogEnabled() {
                    markSet.add("isLogEnabled() called");
                    return false;
                }

                @Override
                protected void log(String msg) {
                    fail("This method should not be called: " + msg);
                }
            }.logSql(null, null);
            assertTrue(markSet.contains("isLogEnabled() called"));
            assertTrue(markSet.contains("handle() called"));
            assertNotNull(LdInternalSqlLogRegistry.findContainerSqlLogRegistry());
        } finally {
            LdCallbackContext.clearCallbackContextOnThread();
        }
    }

    public void test_logSql_CheckDetermination_with_LoggingOnly() {
        final Set<String> markSet = new HashSet<String>();
        new LdInternalBasicHandler(null, null) {
            @Override
            protected boolean isLogEnabled() {
                markSet.add("isLogEnabled() called");
                return true;
            }

            @Override
            protected void log(String msg) {
                markSet.add("log() called");
            }
        }.logSql(null, null);
        assertTrue(markSet.contains("isLogEnabled() called"));
        assertTrue(markSet.contains("log() called"));
        assertNull(LdInternalSqlLogRegistry.findContainerSqlLogRegistry());
    }

    // ===================================================================================
    //                                                                   Exception Handler
    //                                                                   =================
    public void test_handleSQLException() {
        try {
            new LdInternalBasicHandler(null, null).handleSQLException(new SQLException(), null);
            fail();
        } catch (LdSQLFailureException e) {
            // OK
            log(e.getMessage());
        }
        try {
            new LdInternalBasicHandler(null, null).handleSQLException(new SQLException(), null, true);
            fail();
        } catch (LdSQLFailureException e) {
            // OK
            log(e.getMessage());
        }
    }
}

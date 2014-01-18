package dbflute.ldb.various;

import java.sql.Timestamp;
import java.util.Calendar;

import dbflute.ldb.allcommon.LdDBFluteConfig;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.jdbc.LdStatementConfig;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.exbhv.LdBookBhv;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

public class LdDBFluteConfigSettingTest extends LdBookAllDbTestCase {

    protected LdBookBhv ldBookBhv;

    @Override
    public void setUpContainer() throws Throwable {
        LdDBFluteConfig.getInstance().unlock();
        final LdStatementConfig config = new LdStatementConfig();
        config.typeForwardOnly().queryTimeout(10).maxRows(3);
        LdDBFluteConfig.getInstance().setDefaultStatementConfig(config);
        LdDBFluteConfig.getInstance().setInternalDebug(true);
        super.setUpContainer();
    }

    public void tearDownContainer() throws Throwable {
        LdDBFluteConfig.getInstance().clear();
    }

    @Override
    protected String getTestDiconPath() {
        return "dbflute.dicon";
    }

    public void test_setDefaultStatementConfig_Locked() throws Exception {
        // ## Arrange ##
        final LdStatementConfig expected = new LdStatementConfig();

        // ## Act & Assert ##
        try {
            LdDBFluteConfig.getInstance().setDefaultStatementConfig(expected);
            fail();
        } catch (IllegalStateException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }

    public void test_setInternalDebug_Locked() throws Exception {
        // ## Arrange ##
        final boolean expected = false;

        // ## Act & Assert ##
        try {
            LdDBFluteConfig.getInstance().setInternalDebug(expected);
            fail();
        } catch (IllegalStateException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }

    public void test_ConditionBean_configure_Config_is_Request_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();
        final LdBookCB cb = new LdBookCB();
        final LdStatementConfig statementConfig = new LdStatementConfig();
        statementConfig.typeScrollSensitive().fetchSize(123).maxRows(1);
        cb.configure(statementConfig);

        // ## Act ##
        final LdListResultBean<LdBook> bookList = ldBookBhv.selectList(cb);

        // ## Assert ##
        assertEquals(1, bookList.size());
    }

    public void test_ConditionBean_no_configure_Config_is_Default_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();
        final LdBookCB cb = new LdBookCB();

        // ## Act ##
        final LdListResultBean<LdBook> bookList = ldBookBhv.selectList(cb);

        // ## Assert ##
        assertEquals(3, bookList.size());
    }

    // ===================================================================================
    //                                                                          Log Format
    //                                                                          ==========
    // @jflute -- Date Type Column does not exist in LDB, so this test moved to DBFluteBasicExample.
    //    public void test_LogDateFormat_Tx() {
    //        // ## Arrange ##
    //        Calendar cal = Calendar.getInstance();
    //        cal.set(2008, 5, 15, 12, 34, 56);
    //        cal.set(Calendar.MILLISECOND, 123);
    //        LdBookCB cb = new LdBookCB();
    //        cb.query().setRTimestamp_FromTo(new Date(cal.getTimeInMillis()), new Date(cal.getTimeInMillis()), new LdFromToOption());
    //        LdDBFluteConfig.getInstance().unlock();
    //        LdDBFluteConfig.getInstance().setLogDateFormat("yyyy/MM/dd HH$mm$ss.SSS");
    //        try {
    //            // ## Act & Assert ##
    //            String sql = cb.toDisplaySql();
    //            log(sql);
    //            assertTrue(sql.contains("2008/06/15 12$34$56.123"));
    //        } finally {
    //            LdDBFluteConfig.getInstance().setLogDateFormat(null);
    //            LdDBFluteConfig.getInstance().lock();
    //        }
    //    }

    public void test_LogTimestampFormat_Tx() {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 123);
        LdBookCB cb = new LdBookCB();
        cb.query().setRTimestamp_GreaterEqual(new Timestamp(cal.getTimeInMillis()));
        LdDBFluteConfig.getInstance().unlock();
        LdDBFluteConfig.getInstance().setLogTimestampFormat("yyyy/MM/dd HH-mm-ss.SSS");
        try {
            // ## Act & Assert ##
            String sql = cb.toDisplaySql();
            log(sql);
            assertTrue(sql.contains("2008/06/15 12-34-56.123"));
        } finally {
            LdDBFluteConfig.getInstance().setLogTimestampFormat(null);
            LdDBFluteConfig.getInstance().lock();
        }
    }
}

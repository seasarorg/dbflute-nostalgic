package dbflute.ldb.allcommon.dbmeta;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Test of DaoSelector
 * 
 * @author jflute
 */
public class LdAbstractDBMetaTest extends TestCase {

    /** Log instance. */
    public static final Log _log = LogFactory.getLog(LdAbstractDBMetaTest.class);

    // ==========================================================================================
    //                                                                                Common Test
    //                                                                                ===========
    public void test_LdAbstractDBMeta_MapStringUtil_parseDateStringAsMillis() {
        LdAbstractDBMeta.MapStringUtil.parseDateStringAsMillis("2007-01-01", "aaa", "String");// Expect no exception!
        LdAbstractDBMeta.MapStringUtil.parseDateStringAsMillis("2007-01-01 12:34:56", "aaa", "String");// Expect no exception!
        LdAbstractDBMeta.MapStringUtil.parseDateStringAsMillis("  2007-01-01 ", "aaa", "String");// Expect no exception!

        LdAbstractDBMeta.MapStringUtil.parseDateStringAsMillis("2007/01/01", "aaa", "String");// Expect no exception!
        LdAbstractDBMeta.MapStringUtil.parseDateStringAsMillis("2007/01/01 12:34:56", "aaa", "String");// Expect no exception!
        LdAbstractDBMeta.MapStringUtil.parseDateStringAsMillis("  2007/01/01 ", "aaa", "String");// Expect no exception!

        try {
            LdAbstractDBMeta.MapStringUtil.parseDateStringAsMillis("2007/01-01", "aaa", "String");
            fail();
        } catch (RuntimeException e) {
            // OK
        }

        try {
            LdAbstractDBMeta.MapStringUtil.parseDateStringAsMillis("2007-01-01 あいう", "aaa", "String");
            fail();
        } catch (RuntimeException e) {
            // OK
        }
        try {
            LdAbstractDBMeta.MapStringUtil.parseDateStringAsMillis("2007/01/01 あいう", "aaa", "String");
            fail();
        } catch (RuntimeException e) {
            // OK
        }
    }
}

package dbflute;

import java.sql.Timestamp;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author jflute
 * @since 0.6.0 (2008/01/17)
 */
public abstract class PlainTestCase extends TestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance for sub class. */
    protected static final Log _log = LogFactory.getLog(PlainTestCase.class);

    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    protected void log(Object msg) {
        _log.debug(msg);
    }

    protected Timestamp currentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }
    
    protected static String getLineSeparator() {
        return System.getProperty("line.separator");
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected <T> void assertListEmtpy(List<T> ls) {
        if (!ls.isEmpty()) {
            fail("The list shuold be empty: ls=" + ls);
        }
    }

    protected <T> void assertListNotEmtpy(List<T> ls) {
        if (ls.isEmpty()) {
            fail("The list shuold not be empty: ls=" + ls);
        }
    }
}

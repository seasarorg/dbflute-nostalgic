package dbflute;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.extension.unit.S2TestCase;

/**
 * @author jflute
 * @since 0.5.5 (2008/08/09)
 */
public abstract class ContainerTestCase extends S2TestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance for sub class. */
    protected static final Log _log = LogFactory.getLog(ContainerTestCase.class);

    // ===================================================================================
    //                                                                            Override
    //                                                                            ========
    protected void setUp() throws Exception {
        super.setUp();

        include(getTestDiconPath());
    }

    /**
     * Override this!
     * @return The path of test dicon. (NotNull)
     */
    abstract protected String getTestDiconPath();

    // ===================================================================================
    //                                                                      Logging Helper
    //                                                                      ==============
    protected void log(Object msg) {
        _log.debug(msg);
    }

    // ===================================================================================
    //                                                                       String Helper
    //                                                                       =============
    protected String getLineSeparator() {
        return System.getProperty("line.separator");
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void assertListEmtpy(List<?> ls) {
        if (!ls.isEmpty()) {
            fail("The list shuold be empty: ls=" + ls);
        }
    }

    protected void assertListNotEmtpy(List<?> ls) {
        if (ls.isEmpty()) {
            fail("The list shuold not be empty: ls=" + ls);
        }
    }
}

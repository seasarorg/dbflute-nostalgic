package dbflute.ldb.allcommon.cbean;

import junit.framework.TestCase;
import dbflute.ldb.cbean.LdBookCB;

/**
 * @author jflute
 * @since 0.5.8 (2007/11/28 Wednesday)
 */
public class LdConditionBeanTest extends TestCase {

    public void test_localCQ() throws Exception {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();

        // ## Act ##
        final LdConditionQuery localCQ = cb.localCQ();

        // ## Assert ##
        assertEquals(cb.query(), localCQ);
    }
}

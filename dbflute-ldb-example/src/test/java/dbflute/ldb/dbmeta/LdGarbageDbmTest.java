package dbflute.ldb.dbmeta;

import dbflute.PlainTestCase;
import dbflute.ldb.bsentity.dbmeta.LdGarbageDbm;

/**
 * @author jflute
 */
public class LdGarbageDbmTest extends PlainTestCase {

    // ==========================================================================================
    //                                                                                     DBMeta
    //                                                                                     ======
    public void test_hasIdentity() {
        assertFalse(LdGarbageDbm.getInstance().hasIdentity());
    }
}

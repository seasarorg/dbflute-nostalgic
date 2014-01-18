package dbflute.ldb.exbhv;

import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdGarbagePlusDbm;
import dbflute.ldb.exentity.LdGarbagePlus;
import dbflute.ldb.testbase.LdAllDbTestCase;

/**
 * @author jflute
 */
public class LdGarbagePlusBhvTest extends LdAllDbTestCase {

    @Override
    protected LdDBMeta getDBMeta() {
        return LdGarbagePlusDbm.getInstance();
    }

    public void test_insert_Basic_Tx() {
        LdGarbagePlus entity = new LdGarbagePlus();
        assertFalse(entity instanceof LdEntityDefinedCommonColumn);
    }
}

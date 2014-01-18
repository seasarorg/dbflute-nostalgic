package dbflute.ldb.testbase;

import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdLibraryDbm;
import dbflute.ldb.exbhv.LdLibraryBhv;

/**
 * @author jflute
 */
public abstract class LdLibraryAllDbTestCase extends LdAllDbTestCase {

    @Override
    final protected LdDBMeta getDBMeta() {
        return LdLibraryDbm.getInstance();
    }

    final protected LdLibraryBhv getMyBhv() {
        return getBehaviorSelector().select(LdLibraryBhv.class);
    }
}

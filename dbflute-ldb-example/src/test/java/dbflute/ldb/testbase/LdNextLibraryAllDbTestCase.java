package dbflute.ldb.testbase;

import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdNextLibraryDbm;
import dbflute.ldb.exbhv.LdNextLibraryBhv;

/**
 * @author jflute
 */
public abstract class LdNextLibraryAllDbTestCase extends LdAllDbTestCase {

    @Override
    final protected LdDBMeta getDBMeta() {
        return LdNextLibraryDbm.getInstance();
    }

    final protected LdNextLibraryBhv getMyBhv() {
        return getBehaviorSelector().select(LdNextLibraryBhv.class);
    }
}

package dbflute.ldb.testbase;

import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdCollectionDbm;
import dbflute.ldb.exbhv.LdCollectionBhv;

/**
 * @author jflute
 */
public abstract class LdCollectionAllDbTestCase extends LdAllDbTestCase {

    @Override
    final protected LdDBMeta getDBMeta() {
        return LdCollectionDbm.getInstance();
    }

    final protected LdCollectionBhv getMyBhv() {
        return getBehaviorSelector().select(LdCollectionBhv.class);
    }
}

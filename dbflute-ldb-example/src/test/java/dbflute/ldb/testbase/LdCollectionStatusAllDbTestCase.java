package dbflute.ldb.testbase;

import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdCollectionStatusDbm;
import dbflute.ldb.exbhv.LdCollectionStatusBhv;

/**
 * @author jflute
 */
public abstract class LdCollectionStatusAllDbTestCase extends LdAllDbTestCase {

    @Override
    final protected LdDBMeta getDBMeta() {
        return LdCollectionStatusDbm.getInstance();
    }

    final protected LdCollectionStatusBhv getMyBhv() {
        return getBehaviorSelector().select(LdCollectionStatusBhv.class);
    }
}

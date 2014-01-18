package dbflute.ldb.testbase;

import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdCollectionStatusLookupDbm;
import dbflute.ldb.exbhv.LdCollectionStatusLookupBhv;

/**
 * @author jflute
 */
public abstract class LdCollectionStatusLookupAllDbTestCase extends LdAllDbTestCase {

    @Override
    final protected LdDBMeta getDBMeta() {
        return LdCollectionStatusLookupDbm.getInstance();
    }

    final protected LdCollectionStatusLookupBhv getMyBhv() {
        return getBehaviorSelector().select(LdCollectionStatusLookupBhv.class);
    }
}

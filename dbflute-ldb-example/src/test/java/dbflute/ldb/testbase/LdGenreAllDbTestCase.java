package dbflute.ldb.testbase;

import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdGenreDbm;
import dbflute.ldb.exbhv.LdGenreBhv;

/**
 * @author jflute
 */
public abstract class LdGenreAllDbTestCase extends LdAllDbTestCase {

    @Override
    final protected LdDBMeta getDBMeta() {
        return LdGenreDbm.getInstance();
    }

    final protected LdGenreBhv getMyBhv() {
        return getBehaviorSelector().select(LdGenreBhv.class);
    }
}

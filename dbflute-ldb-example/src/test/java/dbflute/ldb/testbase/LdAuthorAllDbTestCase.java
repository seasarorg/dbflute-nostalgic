package dbflute.ldb.testbase;

import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdAuthorDbm;
import dbflute.ldb.exbhv.LdAuthorBhv;

/**
 * @author jflute
 */
public abstract class LdAuthorAllDbTestCase extends LdAllDbTestCase {

    @Override
    final protected LdDBMeta getDBMeta() {
        return LdAuthorDbm.getInstance();
    }

    final protected LdAuthorBhv getMyBhv() {
        return getBehaviorSelector().select(LdAuthorBhv.class);
    }
}

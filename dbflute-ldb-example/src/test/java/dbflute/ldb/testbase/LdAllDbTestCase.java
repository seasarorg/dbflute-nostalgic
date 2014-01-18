package dbflute.ldb.testbase;

import java.sql.Timestamp;

import dbflute.ldb.LdbTestCase;
import dbflute.ldb.allcommon.LdAccessContext;
import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.bhv.LdBehaviorReadable;
import dbflute.ldb.allcommon.bhv.LdBehaviorWritable;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;

public abstract class LdAllDbTestCase extends LdbTestCase {

    @Override
    protected void setUp() throws Exception {
        LdAccessContext accessContext = new LdAccessContext();
        accessContext.setAccessUser("test");
        accessContext.setAccessModule(this.getClass().getSimpleName());
        accessContext.setAccessTimestamp(new Timestamp(System.currentTimeMillis()));
        LdAccessContext.setAccessContextOnThread(accessContext);
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        LdAccessContext.clearAccessContextOnThread();
    }

    protected LdBehaviorReadable getBehaviorReadable() {
        return getBehaviorSelector().byName(getDBMeta().getTableDbName());
    }

    protected LdBehaviorWritable getBehaviorWritable() {
        return (LdBehaviorWritable) getBehaviorReadable();
    }

    protected abstract LdDBMeta getDBMeta();

    /**
     * Select my entity by the entity's primary key.
     * @param entity Entity that has primary key for condition.
     * @return My entity.
     */
    protected LdEntity selectMyEntityByEntityzPK(LdEntity entity) {
        final LdConditionBean cb = getBehaviorReadable().newConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return getBehaviorReadable().readEntity(cb);
    }
}

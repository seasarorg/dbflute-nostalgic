package dbflute.ldb.exbhv;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import dbflute.ldb.allcommon.cbean.LdScalarQuery;
import dbflute.ldb.allcommon.cbean.LdUnionQuery;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdGarbageDbm;
import dbflute.ldb.cbean.LdGarbageCB;
import dbflute.ldb.exentity.LdGarbage;
import dbflute.ldb.testbase.LdAllDbTestCase;

/**
 * @author jflute
 */
public class LdGarbageBhvTest extends LdAllDbTestCase {

    @Override
    protected LdDBMeta getDBMeta() {
        return LdGarbageDbm.getInstance();
    }

    public void test_insert_Basic_Tx() {
        // ## Arrange ##
        LdGarbage entity = new LdGarbage();
        entity.setGarbageMemo("Test Insert");
        entity.setGarbageTime(new Timestamp(System.currentTimeMillis()));
        LdGarbageBhv bhv = getBehaviorSelector().select(LdGarbageBhv.class);

        // ## Act ##
        bhv.insert(entity);

        // ## Assert ##
        LdGarbageCB cb = new LdGarbageCB();
        cb.query().setGarbageMemo_Equal("Test Insert");
        LdGarbage actualEntity = getBehaviorSelector().select(LdGarbageBhv.class).selectEntity(cb);
        assertNotNull(actualEntity);
        assertEquals(entity.getGarbageMemo(), actualEntity.getGarbageMemo());
        assertNotNull(actualEntity.getGarbageTime());
    }

    public void test_insert_NullInsert_with_BehaviorFilter_Tx() {
        // ## Arrange ##
        LdGarbage entity = new LdGarbage();
        entity.setGarbageCount(999999999);
        LdGarbageBhv bhv = getBehaviorSelector().select(LdGarbageBhv.class);

        // ## Act ##
        bhv.insert(entity);

        // ## Assert ##
        LdGarbageCB cb = new LdGarbageCB();
        cb.query().setGarbageCount_Equal(999999999);
        LdGarbage actualEntity = getBehaviorSelector().select(LdGarbageBhv.class).selectEntity(cb);
        assertNotNull(actualEntity);
        assertNull(actualEntity.getGarbageMemo());
        assertNotNull(actualEntity.getGarbageTime()); // for BehaviorFilter
        assertEquals(entity.getGarbageCount(), actualEntity.getGarbageCount());
        assertNotNull(actualEntity.getRUser()); // for BehaviorFilter
        assertNotNull(actualEntity.getRTimestamp()); // for BehaviorFilter
        assertNull(actualEntity.getUUser());
        assertNull(actualEntity.getUTimestamp());
    }

    public void test_scalarSelect_max_Tx() {
        // ## Arrange ##
        List<LdGarbage> testDataList = registerTestData();
        LdGarbageBhv bhv = getBehaviorSelector().select(LdGarbageBhv.class);

        // ## Act ##
        Timestamp max = bhv.scalarSelect(Timestamp.class).max(new LdScalarQuery<LdGarbageCB>() {
            public void query(LdGarbageCB cb) {
                cb.specify().columnGarbageTime();
            }
        });

        // ## Assert ##
        Timestamp expected = null;
        for (LdGarbage garbage : testDataList) {
            Timestamp garbageTime = garbage.getGarbageTime();
            if (expected == null || expected.getTime() < garbageTime.getTime()) {
                expected = garbageTime;
            }
        }
        log("max = " + max);
        assertEquals(expected, max);
    }

    public void test_scalarSelect_max_union_Tx() {
        // ## Arrange ##
        List<LdGarbage> testDataList = registerTestData();
        LdGarbageBhv bhv = getBehaviorSelector().select(LdGarbageBhv.class);

        // ## Act ##
        Timestamp max = bhv.scalarSelect(Timestamp.class).max(new LdScalarQuery<LdGarbageCB>() {
            public void query(LdGarbageCB cb) {
                cb.specify().columnGarbageTime();
                cb.union(new LdUnionQuery<LdGarbageCB>() {
                    public void query(LdGarbageCB unionCB) {
                    }
                });
            }
        });

        // ## Assert ##
        Timestamp expected = null;
        for (LdGarbage garbage : testDataList) {
            Timestamp garbageTime = garbage.getGarbageTime();
            if (expected == null || expected.getTime() < garbageTime.getTime()) {
                expected = garbageTime;
            }
        }
        log("max = " + max);
    }

    public void test_scalarSelect_sum_union_Tx() {
        // ## Arrange ##
        List<LdGarbage> testDataList = registerTestData();
        LdGarbageBhv bhv = getBehaviorSelector().select(LdGarbageBhv.class);

        // ## Act ##
        Integer sum = bhv.scalarSelect(Integer.class).sum(new LdScalarQuery<LdGarbageCB>() {
            public void query(LdGarbageCB cb) {
                cb.specify().columnGarbageCount();
                cb.union(new LdUnionQuery<LdGarbageCB>() {
                    public void query(LdGarbageCB unionCB) {
                    }
                });
            }
        });

        // ## Assert ##
        Integer expected = 0;
        for (LdGarbage garbage : testDataList) {
            Integer garbageCount = garbage.getGarbageCount();
            expected = expected + garbageCount;
        }
        log("sum = " + sum);
    }

    protected List<LdGarbage> registerTestData() {
        ArrayList<LdGarbage> list = new ArrayList<LdGarbage>();
        LdGarbageBhv bhv = getBehaviorSelector().select(LdGarbageBhv.class);
        {
            LdGarbage garbage = new LdGarbage();
            garbage.setGarbageMemo("1-Test Insert");
            garbage.setGarbageTime(Timestamp.valueOf("2007-12-25 12:34:56.147"));
            garbage.setGarbageCount(7);
            bhv.insert(garbage);
            list.add(garbage);
        }
        {
            LdGarbage garbage = new LdGarbage();
            garbage.setGarbageMemo("2-Test Insert");
            garbage.setGarbageTime(Timestamp.valueOf("2002-12-25 12:34:56.147"));
            garbage.setGarbageCount(4);
            bhv.insert(garbage);
            list.add(garbage);
        }
        {
            LdGarbage garbage = new LdGarbage();
            garbage.setGarbageMemo("3-Test Insert");
            garbage.setGarbageTime(Timestamp.valueOf("2004-12-25 12:34:56.147"));
            garbage.setGarbageCount(4);
            bhv.insert(garbage);
            list.add(garbage);
        }
        return list;
    }
}

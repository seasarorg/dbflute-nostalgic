package com.example.dbflute.slim3.dbflute.allcommon;


import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.bhv.BehaviorReadable;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.dbmeta.DBMeta;

import com.example.dbflute.slim3.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.slim3.dbflute.cbean.MemberCB;
import com.example.dbflute.slim3.dbflute.exbhv.MemberBhv;
import com.example.dbflute.slim3.dbflute.exentity.Member;
import com.example.dbflute.slim3.unit.ContainerTestCase;

/**
 * The test of behaviorSelector.
 * @author jflute
 * @since 0.5.8 (2007/11/28 Wednesday)
 */
public class BehaviorSelectorTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private BehaviorSelector behaviorSelector;

    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                              byName
    //                                                                              ======
    /**
     * テーブル名からBehaviorを取得して、テーブルのプロパティ名を取得する。
     */
    public void test_BehaviorSelector_byName_and_getTablePropertyName_Tx() {
        // ## Arrange ##
        final String tableDbName = "MEMBER";

        // ## Act ##
        final BehaviorReadable bhv = behaviorSelector.byName(tableDbName);
        final DBMeta dbmeta = bhv.getDBMeta();
        final String tablePropertyName = dbmeta.getTablePropertyName();

        // ## Assert ##
        assertNotNull(tablePropertyName);
        log("/********************************");
        log("tablePropertyName=" + tablePropertyName);
        log("**********/");
        assertNotNull(MemberDbm.getInstance().getTablePropertyName(), tablePropertyName);
    }

    /**
     * テーブル名からBehaviorを取得して、ConditionBeanを生成して(条件なし)、件数を検索する。
     */
    public void test_BehaviorSelector_byName_and_readCount_Tx() {
        // ## Arrange ##
        final String tableDbName = "MEMBER";

        // ## Act ##
        final BehaviorReadable bhv = behaviorSelector.byName(tableDbName);
        final ConditionBean cb = bhv.newConditionBean();
        final int count = bhv.readCount(cb);

        // ## Assert ##
        log("/********************************");
        log("count=" + count);
        log("**********/");
        assertEquals(memberBhv.selectCount(new MemberCB()), count);
    }

    /**
     * テーブル名からBehaviorを取得して、ConditionBeanを生成して(ソート条件のみ)、リストを検索する。
     */
    public void test_BehaviorSelector_byName_and_readList_Tx() {
        // ## Arrange ##
        final String tableDbName = "MEMBER";

        // ## Act ##
        final BehaviorReadable bhv = behaviorSelector.byName(tableDbName);
        final ConditionBean cb = bhv.newConditionBean();
        cb.addOrderBy_PK_Desc();
        final ListResultBean<Entity> entityList = bhv.readList(cb);

        // ## Assert ##
        assertNotNull(entityList);
        log("/********************************");
        final DBMeta dbmeta = bhv.getDBMeta();
        for (Entity entity : entityList) {
            log("entity=" + dbmeta.convertToColumnStringValueMap(entity));
        }
        log("**********/");
        final MemberCB expectedCB = new MemberCB();
        expectedCB.addOrderBy_PK_Desc();
        final ListResultBean<Member> expectedList = memberBhv.selectList(expectedCB);
        assertEquals(expectedList, entityList);
    }
}

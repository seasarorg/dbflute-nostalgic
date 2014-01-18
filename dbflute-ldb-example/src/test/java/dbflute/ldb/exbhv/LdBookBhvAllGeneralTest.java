package dbflute.ldb.exbhv;

import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookBhvAllGeneralTest extends LdBookAllDbTestCase {

    // ===================================================================================
    //                                                                        Basic Select
    //                                                                        ============
    public void test_selectXxx_ByPK_Basic_Tx() {
        doTest_selectEntity_ByPK(_help);
        doTest_selectList_ByPK(_help);
    }

    public void test_selectXxx_OrderBy_Basic_Tx() {
        doTest_selectEntity_addOrderBy_PK_Asc(_help);
        doTest_selectList_addOrderBy_PK_Asc(_help);
        doTest_selectEntity_addOrderBy_PK_Desc(_help);
        doTest_selectList_addOrderBy_PK_Desc(_help);
    }

    public void test_selectXxx_FetchXxx_Basic_Tx() {
        doTest_selectEntity_fetchFirst_One(_help);
        doTest_selectList_fetchFirst_One(_help);
        doTest_selectCount_fetchScope_OneThree(_help);
        doTest_selectEntity_fetchScope_OneOne(_help);
        doTest_selectList_fetchScope_OneThree(_help);
        doTest_selectList_fetchPage_OneTwo(_help);
    }

    // ===================================================================================
    //                                                                        Basic Update
    //                                                                        ============
    public void test_insert_Basic_Tx() {
        doTest_create(_help);
    }

    public void test_update_Basic_Tx() {
        doTest_modify(_help);
    }

    public void test_delete_Basic_Tx() {
        deleteReferrers();
        doTest_remove(_help);
    }

    public void test_update_TimestampConcurrencyControl_Tx() {
        doTest_modify_TimestampConcurrencyControl(_help);
        doTest_update_TimestampConcurrencyControl(_help);
    }

    public void test_DBMeta_TypeAndInstanceGetter() {
        doTest_DBMeta_TypeAndInstanceGetter(getDBMeta().newEntity());
    }
}

package dbflute.ldb.tableobject;

import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.framework.util.ClassUtil;
import org.seasar.framework.util.MethodUtil;

import dbflute.helper.stateless.FlMethodUtil;
import dbflute.ldb.allcommon.LdDaoWritable;
import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;
import dbflute.ldb.allcommon.bhv.LdBehaviorWritable;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdPagingResultBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.cbean.LdBookCB;

public abstract class LdLdbTableObjectDbTestCase extends LdLdbTableObjectTestCase {

    private static final Log _log = LogFactory.getLog(LdLdbTableObjectDbTestCase.class);

    // ==========================================================================================
    //                                                                                 Dao Common
    //                                                                                 ==========

    public void doTest_create(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_create(): help=" + help);
        _log.debug("- - - - - - - -/");
        final String msgPreifx = getMsgPrefix("create()");

        // ## Arrange ##
        help.replaceMyForeignTable();
        final List ls = help.getMyEntityList_BeforeInsert();

        for (final Iterator ite = ls.iterator(); ite.hasNext();) {
            final LdEntity entity = (LdEntity) ite.next();

            // ## Act ##
            final int insertedCount = getMyWBhv().delegateCreateTx(entity);

            // ## Assert ##
            assertEquals(msgPreifx + "one. (after inserting)", 1, insertedCount);
            help.assertMyEntity(entity, selectMyEntityByEntityzPK(entity));

            // ## After Care ##
            getMyWBhv().delegateRemoveTx(entity);
        }
    }

    public void doTest_insert(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_insert(): help=" + help);
        _log.debug("- - - - - - - -/");
        final String msgPreifx = getMsgPrefix("insert()");

        // ## Arrange ##
        help.replaceMyForeignTable();
        final List ls = help.getMyEntityList_BeforeInsert();

        for (final Iterator ite = ls.iterator(); ite.hasNext();) {
            final LdEntity entity = (LdEntity) ite.next();

            // ## Act ##
            final int insertedCount = getMyWBhv().delegateCreateTx(entity);

            // ## Assert ##
            assertEquals(msgPreifx + "one. (after inserting)", 1, insertedCount);
            help.assertMyEntity(entity, selectMyEntityByEntityzPK(entity));

            // ## After Care ##
            getMyWBhv().delegateRemoveTx(entity);
        }
    }

    public void doTest_modify(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_modify(): help=" + help);
        _log.debug("- - - - - - - -/");
        final String msgPreifx = getMsgPrefix("modify()");

        // ## Arrange ##
        help.replaceMyTableWithForeign();
        final List ls = help.getMyEntityList_BeforeUpdate();

        for (final Iterator ite = ls.iterator(); ite.hasNext();) {
            final LdEntity entity = (LdEntity) ite.next();

            // ## Act ##
            final int updatedCount = getMyWBhv().delegateModifyTx(entity);

            // ## Assert ##
            assertEquals(msgPreifx + "one.", 1, updatedCount);
            help.assertMyEntity(entity, selectMyEntityByEntityzPK(entity));
        }
    }

    public void doTest_update(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_update(): help=" + help);
        _log.debug("- - - - - - - -/");
        final String msgPreifx = getMsgPrefix("update()");

        // ## Arrange ##
        help.replaceMyTableWithForeign();
        final List ls = help.getMyEntityList_BeforeUpdate();

        for (final Iterator ite = ls.iterator(); ite.hasNext();) {
            final LdEntity entity = (LdEntity) ite.next();

            // ## Act ##
            final int updatedCount = getMyWBhv().delegateModifyTx(entity);

            // ## Assert ##
            assertEquals(msgPreifx + "one.", 1, updatedCount);
            help.assertMyEntity(entity, selectMyEntityByEntityzPK(entity));
        }
    }

    public void doTest_remove(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_remove(): help=" + help);
        _log.debug("- - - - - - - -/");
        final String msgPreifx = getMsgPrefix("deleteObj()");

        // ## Arrange ##
        help.replaceMyTableWithForeign();
        final List ls = help.getMyEntityList_BeforeDelete();

        for (final Iterator ite = ls.iterator(); ite.hasNext();) {
            final LdEntity entity = (LdEntity) ite.next();

            // ## Act ##
            final int deletedCount = getMyWBhv().delegateRemoveTx(entity);

            // ## Assert ##
            assertEquals(msgPreifx + "one.", 1, deletedCount);
            assertNull(selectMyEntityByEntityzPK(entity));
        }
    }

    public void doTest_delete(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_delete(): help=" + help);
        _log.debug("- - - - - - - -/");
        final String msgPreifx = getMsgPrefix("delete()");

        // ## Arrange ##
        help.replaceMyTableWithForeign();
        final List ls = help.getMyEntityList_BeforeDelete();

        for (final Iterator ite = ls.iterator(); ite.hasNext();) {
            final LdEntity entity = (LdEntity) ite.next();

            // ## Act ##
            final int deletedCount = getMyWBhv().delegateRemoveTx(entity);

            // ## Assert ##
            assertEquals(msgPreifx + "one.", 1, deletedCount);
            assertNull(selectMyEntityByEntityzPK(entity));
        }
    }

    // ==========================================================================================
    //                                                                                 Bhv Common
    //                                                                                 ==========

    public void doTest_selectPageTx(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_selectPageTx(): help=" + help);
        _log.debug("- - - - - - - -/");
        help.replaceMyTableWithForeign();
        final LdBehaviorWritable bhv = getDaoSelector().getWBhv(getDBMeta().getTableDbName());

        final String methodName = "selectPageTx";
        final Class cbType = getDBMeta().getConditionBeanType();
        final LdConditionBean cb = getDBMeta().newConditionBean().addOrderBy_PK_Asc();
        final LdConditionBean cbListAll = getDBMeta().newConditionBean().addOrderBy_PK_Asc();
        final Method method = ClassUtil.getMethod(bhv.getClass(), methodName, new Class[] { cbType });
        final Object[] args = new Object[] { cb };
        {
            final LdPagingResultBean rb = (LdPagingResultBean) MethodUtil.invoke(method, bhv, args);
            assertEquals(bhv.delegateReadListTx(cbListAll), rb.getSelectedList());
        }
        final int pageSize = 1;
        {
            cb.fetchFirst(pageSize);
            final LdPagingResultBean rb = (LdPagingResultBean) MethodUtil.invoke(method, bhv, args);
            final List allList = bhv.delegateReadListTx(cbListAll);
            assertEquals(allList.subList(0, 1), rb.getSelectedList());
            assertEquals(allList.size(), rb.getAllRecordCount());
            assertEquals(1, rb.getCurrentPageNumber());
            assertEquals(1, rb.getPageSize());
            assertEquals(allList.size(), rb.getAllPageCount());
            assertEquals(1, rb.calculateCurrentPageGroupStartPageNumber());
            assertEquals(2, rb.getCurrentPageGroupPageNumberArray().length);
            assertEquals(1, rb.getCurrentPageGroupPageNumberArray()[0]);
            assertEquals(2, rb.getCurrentPageGroupPageNumberArray()[1]);
            assertFalse(rb.isExistPrePage());
            assertTrue(rb.isExistNextPage());
            assertFalse(rb.isExistPrePageGroup());
            assertTrue(rb.isExistNextPageGroup());
        }
        {
            final int pageNumber = 2;
            cb.fetchPage(pageNumber);
            final LdPagingResultBean rb = (LdPagingResultBean) MethodUtil.invoke(method, bhv, args);
            final List allList = bhv.delegateReadListTx(cbListAll);
            assertEquals(allList.subList(1, 2), rb.getSelectedList());
            assertEquals(allList.size(), rb.getAllRecordCount());
            assertEquals(pageNumber, rb.getCurrentPageNumber());
            assertEquals(pageSize, rb.getPageSize());
            assertEquals(allList.size(), rb.getAllPageCount());
            assertEquals(1, rb.calculateCurrentPageGroupStartPageNumber());
            assertEquals(2, rb.getCurrentPageGroupPageNumberArray().length);
            assertEquals(1, rb.getCurrentPageGroupPageNumberArray()[0]);
            assertEquals(2, rb.getCurrentPageGroupPageNumberArray()[1]);
            assertTrue(rb.isExistPrePage());
            assertTrue(rb.isExistNextPage());
            assertFalse(rb.isExistPrePageGroup());
            assertTrue(rb.isExistNextPageGroup());
        }
        {
            final int pageNumber = 1;
            cb.fetchPage(pageNumber);
            final LdPagingResultBean rb = (LdPagingResultBean) MethodUtil.invoke(method, bhv, args);
            final List allList = bhv.delegateReadListTx(cbListAll);
            assertEquals(allList.subList(0, 1), rb.getSelectedList());
            assertEquals(allList.size(), rb.getAllRecordCount());
            assertEquals(pageNumber, rb.getCurrentPageNumber());
            assertEquals(pageSize, rb.getPageSize());
            assertEquals(allList.size(), rb.getAllPageCount());
            assertEquals(1, rb.calculateCurrentPageGroupStartPageNumber());
            assertEquals(2, rb.getCurrentPageGroupPageNumberArray().length);
            assertEquals(1, rb.getCurrentPageGroupPageNumberArray()[0]);
            assertEquals(2, rb.getCurrentPageGroupPageNumberArray()[1]);
            assertFalse(rb.isExistPrePage());
            assertTrue(rb.isExistNextPage());
            assertFalse(rb.isExistPrePageGroup());
            assertTrue(rb.isExistNextPageGroup());
        }
        {
            final int pageNumber = 3;
            cb.fetchPage(pageNumber);
            final LdPagingResultBean rb = (LdPagingResultBean) MethodUtil.invoke(method, bhv, args);
            final List allList = bhv.delegateReadListTx(cbListAll);
            assertEquals(allList.subList(2, 3), rb.getSelectedList());
            assertEquals(allList.size(), rb.getAllRecordCount());
            assertEquals(pageNumber, rb.getCurrentPageNumber());
            assertEquals(pageSize, rb.getPageSize());
            assertEquals(allList.size(), rb.getAllPageCount());
            assertEquals(3, rb.calculateCurrentPageGroupStartPageNumber());
            assertEquals(2, rb.getCurrentPageGroupPageNumberArray().length);
            assertEquals(3, rb.getCurrentPageGroupPageNumberArray()[0]);
            assertEquals(4, rb.getCurrentPageGroupPageNumberArray()[1]);
            assertTrue(rb.isExistPrePage());
            assertTrue(rb.isExistNextPage());
            assertTrue(rb.isExistPrePageGroup());
            assertTrue(rb.isExistNextPageGroup());
        }
    }

    public void doTest_createOrModifyAfterSelectForUpdateTx(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_createOrModifyAfterSelectForUpdateTx(): help=" + help);
        _log.debug("- - - - - - - -/");

        help.replaceMyTableWithForeign();
        final LdBehaviorWritable bhv = getDaoSelector().getWBhv(getDBMeta().getTableDbName());

        {
            final java.util.List entityList = help.getMyEntityList_BeforeInsert();
            for (Object entityObject : entityList) {
                final LdEntity entity = (LdEntity) entityObject;

                LdEntity actual = null;
                {
                    final Integer updatedCount = bhv.createOrModifyAfterSelectForUpdateTx(entity);
                    assertEquals(1, updatedCount.intValue());
                    final LdBookCB cb = new LdBookCB();
                    cb.acceptPrimaryKeyMapString(entity.extractColumnValueMapString());
                    actual = bhv.delegateReadEntityTx(cb);
                    help.assertMyEntity(entity, actual);
                }
                {
                    final Integer updatedCount = bhv.createOrModifyAfterSelectForUpdateTx(entity);
                    assertEquals(1, updatedCount.intValue());
                    final LdBookCB cb = new LdBookCB();
                    cb.acceptPrimaryKeyMapString(entity.extractColumnValueMapString());
                    help.assertMyEntity(entity, actual);
                }
            }
        }
    }

    public void doTest_insertOrUpdateAfterSelectForUpdateTx(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_insertOrUpdateAfterSelectForUpdateTx(): help=" + help);
        _log.debug("- - - - - - - -/");

        help.replaceMyTableWithForeign();
        final LdBehaviorWritable bhv = getDaoSelector().getWBhv(getDBMeta().getTableDbName());

        final String methodName = "insertOrUpdateAfterSelectForUpdateTx";
        {
            final java.util.List entityList = help.getMyEntityList_BeforeInsert();
            for (Object entityObject : entityList) {
                final LdEntity entity = (LdEntity) entityObject;
                final Class[] argsType = new Class[] { getDBMeta().getEntityType() };
                final Method method = ClassUtil.getMethod(bhv.getClass(), methodName, argsType);

                LdEntity actual = null;
                {
                    final Integer updatedCount = (Integer) MethodUtil.invoke(method, bhv, new Object[] { entity });
                    assertEquals(1, updatedCount.intValue());
                    final LdBookCB cb = new LdBookCB();
                    cb.acceptPrimaryKeyMapString(entity.extractColumnValueMapString());
                    actual = bhv.delegateReadEntityTx(cb);
                    help.assertMyEntity(entity, actual);
                }
                {
                    final Integer updatedCount = (Integer) MethodUtil.invoke(method, bhv, new Object[] { entity });
                    assertEquals(1, updatedCount.intValue());
                    final LdBookCB cb = new LdBookCB();
                    cb.acceptPrimaryKeyMapString(entity.extractColumnValueMapString());
                    help.assertMyEntity(entity, actual);
                }
            }
        }
    }

    public void doTest_modifyAfterSelectForUpdateTx(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_modifyAfterSelectForUpdateTx(): help=" + help);
        _log.debug("- - - - - - - -/");

        help.replaceMyTableWithForeign();
        final LdBehaviorWritable bhv = getDaoSelector().getWBhv(getDBMeta().getTableDbName());
        final String methodName = "updateAfterSelectForUpdateTx";
        final java.util.List entityList = help.getMyEntityList_BeforeUpdate();
        for (Object entityObject : entityList) {
            final LdEntity entity = (LdEntity) entityObject;
            final Class[] argsType = new Class[] { getDBMeta().getEntityType() };
            final Method method = ClassUtil.getMethod(bhv.getClass(), methodName, argsType);
            final int updatedCount = bhv.modifyAfterSelectForUpdateTx(entity);
            assertEquals(1, updatedCount);
            final LdBookCB cb = new LdBookCB();
            cb.acceptPrimaryKeyMapString(entity.extractColumnValueMapString());
            final LdEntity actual = bhv.delegateReadEntityTx(cb);
            help.assertMyEntity(entity, actual);
        }
    }

    public void doTest_updateAfterSelectForUpdateTx(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_updateAfterSelectForUpdateTx(): help=" + help);
        _log.debug("- - - - - - - -/");

        help.replaceMyTableWithForeign();
        final LdBehaviorWritable bhv = getDaoSelector().getWBhv(getDBMeta().getTableDbName());
        final String methodName = "updateAfterSelectForUpdateTx";
        final java.util.List entityList = help.getMyEntityList_BeforeUpdate();
        for (Object entityObject : entityList) {
            final LdEntity entity = (LdEntity) entityObject;
            final Class[] argsType = new Class[] { getDBMeta().getEntityType() };
            final Method method = ClassUtil.getMethod(bhv.getClass(), methodName, argsType);
            final Integer updatedCount = (Integer) MethodUtil.invoke(method, bhv, new Object[] { entity });
            assertEquals(1, updatedCount.intValue());
            final LdBookCB cb = new LdBookCB();
            cb.acceptPrimaryKeyMapString(entity.extractColumnValueMapString());
            final LdEntity actual = bhv.delegateReadEntityTx(cb);
            help.assertMyEntity(entity, actual);
        }
    }

    // ------------------------------------------------------------------
    //                                      selectXxx acceptPrimaryKeyMap
    //                                      -----------------------------
    public void doTest_selectEntity_ByPK(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_selectEntity_ByPK(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();
        final List expectedList = selectListAll();

        for (final Iterator ite = expectedList.iterator(); ite.hasNext();) {
            final LdEntity expectedEntity = (LdEntity) ite.next();

            // ## Act ##
            final LdConditionBean cb = getDBMeta().newConditionBean();
            cb.acceptPrimaryKeyMapString(expectedEntity.extractPrimaryKeyMapString());
            final LdEntity actualEntity = getMyRBhv().delegateReadEntityTx(cb);

            // ## Assert ##
            help.assertMyEntity(expectedEntity, actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
    }

    public void doTest_selectList_ByPK(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_selectList_ByPK(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();
        final List expectedList = selectListAll();

        for (final Iterator ite = expectedList.iterator(); ite.hasNext();) {
            final LdEntity expectedEntity = (LdEntity) ite.next();

            // ## Act ##
            final LdConditionBean cb = getDBMeta().newConditionBean();
            cb.acceptPrimaryKeyMapString(expectedEntity.extractPrimaryKeyMapString());
            final List actualList = getMyRBhv().delegateReadListTx(cb);

            // ## Assert ##
            if (actualList.size() != 1) {
                fail("selectList() must return the list that has only one record: " + actualList);
            }
            final LdEntity actualEntity = (LdEntity) actualList.get(0);
            help.assertMyEntity(expectedEntity, actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
    }

    // ------------------------------------------------------------------
    //                                       selectXxx add_OrderBy_PK_Asc
    //                                       ----------------------------
    public void doTest_selectEntity_addOrderBy_PK_Asc(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_selectEntity_addOrderBy_PK_Asc(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();

        // ## Act ##
        final LdConditionBean cb = getDBMeta().newConditionBean();
        {
            final LdEntity actualEntity = getMyRBhv().delegateReadEntityTx(cb.addOrderBy_PK_Asc());

            // ## Assert ##
            final List expectedList = selectListAll();
            Collections.sort(expectedList, help.getPrimaryKeyAscComparator());
            help.assertMyEntity((LdEntity) expectedList.get(0), actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
        {
            cb.getSqlClause().clearOrderBy();
            final LdEntity actualEntity = getMyRBhv().delegateReadEntityTx(cb.addOrderBy_PK_Desc());

            // ## Assert ##
            final List expectedList = selectListAll();
            Collections.sort(expectedList, Collections.reverseOrder(help.getPrimaryKeyAscComparator()));
            help.assertMyEntity((LdEntity) expectedList.get(0), actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
    }

    public void doTest_selectList_addOrderBy_PK_Asc(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_selectList_addOrderBy_PK_Asc(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();

        // ## Act ##
        final LdConditionBean cb = getDBMeta().newConditionBean();
        {
            final List actualList = getMyRBhv().delegateReadListTx(cb.addOrderBy_PK_Asc());

            // ## Assert ##
            final List expectedList = selectListAll();
            Collections.sort(expectedList, help.getPrimaryKeyAscComparator());
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }
        {
            cb.getSqlClause().clearOrderBy();
            final List actualList = getMyRBhv().delegateReadListTx(cb.addOrderBy_PK_Desc());

            // ## Assert ##
            final List expectedList = selectListAll();
            Collections.sort(expectedList, Collections.reverseOrder(help.getPrimaryKeyAscComparator()));
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }
    }

    // ------------------------------------------------------------------
    //                                      selectXxx add_OrderBy_PK_Desc
    //                                      -----------------------------
    public void doTest_selectEntity_addOrderBy_PK_Desc(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_selectEntity_addOrderBy_PK_Desc(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();

        // ## Act ##
        final LdConditionBean cb = getDBMeta().newConditionBean();
        {
            final LdEntity actualEntity = getMyRBhv().delegateReadEntityTx(cb.addOrderBy_PK_Desc());

            // ## Assert ##
            final List expectedList = selectListAll();
            assertListNotEmtpy(expectedList);
            Collections.sort(expectedList, Collections.reverseOrder(help.getPrimaryKeyAscComparator()));
            help.assertMyEntity((LdEntity) expectedList.get(0), actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
        {
            cb.getSqlClause().clearOrderBy();
            final LdEntity actualEntity = getMyRBhv().delegateReadEntityTx(cb.addOrderBy_PK_Asc());

            // ## Assert ##
            final List expectedList = selectListAll();
            assertListNotEmtpy(expectedList);
            Collections.sort(expectedList, help.getPrimaryKeyAscComparator());
            help.assertMyEntity((LdEntity) expectedList.get(0), actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
    }

    public void doTest_selectList_addOrderBy_PK_Desc(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_selectList_addOrderBy_PK_Desc(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();

        // ## Act ##
        final LdConditionBean cb = getDBMeta().newConditionBean();
        {
            final List actualList = getMyRBhv().delegateReadListTx(cb.addOrderBy_PK_Desc());

            // ## Assert ##
            final List expectedList = selectListAll();
            assertListNotEmtpy(expectedList);
            Collections.sort(expectedList, Collections.reverseOrder(help.getPrimaryKeyAscComparator()));
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }
        {
            cb.getSqlClause().clearOrderBy();
            final List actualList = getMyRBhv().delegateReadListTx(cb.addOrderBy_PK_Asc());

            // ## Assert ##
            final List expectedList = selectListAll();
            assertListNotEmtpy(expectedList);
            Collections.sort(expectedList, help.getPrimaryKeyAscComparator());
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }
    }

    // ------------------------------------------------------------------
    //                                           selectXxx fetchFirst One
    //                                           ------------------------
    public void doTest_selectEntity_fetchFirst_One(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_selectEntity_fetchFirst_One(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();

        final LdConditionBean cb = getDBMeta().newConditionBean().addOrderBy_PK_Asc();
        cb.fetchFirst(1);
        {
            // ## Act ##
            final LdEntity actualEntity = getMyRBhv().delegateReadEntityTx(cb);
            assertNotNull(actualEntity);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc()).subList(0, 1);
            final LdEntity expectedEntity = (LdEntity) expectedList.get(0);

            help.assertMyEntity(expectedEntity, actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
        {
            // ## Act ##
            cb.fetchFirst(4);
            final LdEntity actualEntity = getMyRBhv().delegateReadEntityTx(cb);
            assertNotNull(actualEntity);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc()).subList(0, 1);
            final LdEntity expectedEntity = (LdEntity) expectedList.get(0);

            help.assertMyEntity(expectedEntity, actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
    }

    public void doTest_selectList_fetchFirst_One(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_selectList_fetchFirst_One(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();

        final LdConditionBean cb = getDBMeta().newConditionBean().addOrderBy_PK_Desc();
        cb.fetchFirst(1);
        {
            // ## Act ##
            final List actualList = getMyRBhv().delegateReadListTx(cb);
            if (actualList.size() != 1) {
                String msg = "selectList() must return the list that has only one record: ";
                fail(msg + "size=" + actualList.size() + " actualList=" + actualList);
            }

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Desc()).subList(0, 1);
            final LdEntity expectedEntity = (LdEntity) expectedList.get(0);
            final LdEntity actualEntity = (LdEntity) actualList.get(0);
            help.assertMyEntity(expectedEntity, actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
        {
            // ## Act ##
            cb.fetchFirst(4);
            final List actualList = getMyRBhv().delegateReadListTx(cb);
            if (actualList.size() != 4) {
                fail("selectList() must return the list that has only one record: " + actualList);
            }

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Desc()).subList(0, 4);
            assertEquals(expectedList.size(), actualList.size());
            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }
    }

    // ------------------------------------------------------------------
    //                                      selectXxx fetchScope OneThree
    //                                      -----------------------------

    public void doTest_selectCountIgnoreFetchScope_fetchScope_OneThree(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_selectCountIgnoreFetchScope_fetchScope_OneThree(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();

        // ## Act ##
        final LdConditionBean cb = getDBMeta().newConditionBean().addOrderBy_PK_Asc();
        final LdConditionBean cbListAll = getDBMeta().newConditionBean().addOrderBy_PK_Asc();
        cb.fetchScope(1, 3);
        {
            final int count = getMyRBhv().delegateReadCountIgnoreFetchScopeTx(cb);

            // ## Assert ##
            final int expectedCount = getMyRBhv().delegateReadListTx(cbListAll).size();
            assertEquals(expectedCount, count);

            final List actualList = getMyRBhv().delegateReadListTx(cb);
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc()).subList(1, 4);
            assertEquals(expectedList.size(), actualList.size());
            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }

        // ## Act ##
        {
            final int count = getMyRBhv().delegateReadCountIgnoreFetchScopeTx(cb);

            // ## Assert ##
            final int expectedCount = getMyRBhv().delegateReadListTx(cbListAll).size();
            assertEquals(expectedCount, count);

            cb.getSqlClause().ignoreFetchScope();
            final List actualList = getMyRBhv().delegateReadListTx(cb);
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc());
            assertEquals(expectedList.size(), actualList.size());
            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }

        // ## Act ##
        {
            cb.getSqlClause().makeFetchScopeEffective();
            final int count = getMyRBhv().delegateReadCountIgnoreFetchScopeTx(cb);

            // ## Assert ##
            final int expectedCount = getMyRBhv().delegateReadListTx(cbListAll).size();
            assertEquals(expectedCount, count);

            final List actualList = getMyRBhv().delegateReadListTx(cb);
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc()).subList(1, 4);
            assertEquals(expectedList.size(), actualList.size());
            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }
    }

    public void doTest_selectEntity_fetchScope_OneThree(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_selectEntity_fetchScope_OneThree(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();

        final LdConditionBean cb = getDBMeta().newConditionBean().addOrderBy_PK_Asc();
        cb.fetchScope(1, 3);
        {
            // ## Act ##
            final LdEntity actualEntity = getMyRBhv().delegateReadEntityTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc()).subList(1, 4);
            help.assertMyEntity((LdEntity) expectedList.get(0), actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
        {
            // ## Act ##
            cb.getSqlClause().ignoreFetchScope();
            final LdEntity actualEntity = getMyRBhv().delegateReadEntityTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc());
            help.assertMyEntity((LdEntity) expectedList.get(0), actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
        {
            // ## Act ##
            cb.getSqlClause().makeFetchScopeEffective();
            final LdEntity actualEntity = getMyRBhv().delegateReadEntityTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc()).subList(1, 4);
            help.assertMyEntity((LdEntity) expectedList.get(0), actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
    }

    public void doTest_selectList_fetchScope_OneThree(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_selectList_fetchScope_OneThree(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();

        // ## Act ##
        final LdConditionBean cb = getDBMeta().newConditionBean().addOrderBy_PK_Asc();
        cb.fetchScope(1, 3);
        {
            final List actualList = getMyRBhv().delegateReadListTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc()).subList(1, 4);
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }

        // ## Act ##
        {
            cb.getSqlClause().ignoreFetchScope();
            final List actualList = getMyRBhv().delegateReadListTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc());
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }

        // ## Act ##
        {
            cb.getSqlClause().makeFetchScopeEffective();
            final List actualList = getMyRBhv().delegateReadListTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc()).subList(1, 4);
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }

        // ## Act ##
        {
            cb.fetchScope(2, 3);
            final List actualList = getMyRBhv().delegateReadListTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc()).subList(2, 5);
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }

        // ## Act ##
        {
            System.out.println("****************************************************");
            cb.getSqlClause().clearOrderBy();
            cb.addOrderBy_PK_Desc();
            cb.fetchFirst(2);
            final List actualList = getMyRBhv().delegateReadListTx(cb);
            System.out.println("****************************************************");
            System.out.println("actualList=" + actualList);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Desc()).subList(0, 2);
            System.out.println("expectedList=" + expectedList);
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }

        // ## Act ##
        {
            cb.fetchScope(0, 2);
            final List actualList = getMyRBhv().delegateReadListTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Desc()).subList(0, 2);
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }

        // ## Act ##
        {
            cb.fetchPage(2);
            final List actualList = getMyRBhv().delegateReadListTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Desc()).subList(2, 4);
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }

        // ## Act ##
        {
            cb.fetchScope(4, 1);
            final List actualList = getMyRBhv().delegateReadListTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Desc()).subList(4, 5);
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }
    }

    /**
     * Do test selectList_fetchPage_OneTwo.
     * 
     * @param help Help.
     */
    public void doTest_selectList_fetchPage_OneTwo(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_selectList_fetchPage_OneTwo(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();

        // ## Act ##
        final LdConditionBean cb = getDBMeta().newConditionBean().addOrderBy_PK_Asc();
        cb.fetchScope(1, 2).fetchPage(1);
        {
            final List actualList = getMyRBhv().delegateReadListTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc()).subList(1, 3);
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }

        // ## Act ##
        {
            cb.getSqlClause().ignoreFetchScope();
            final List actualList = getMyRBhv().delegateReadListTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc());
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }

        // ## Act ##
        {
            cb.getSqlClause().makeFetchScopeEffective();
            final List actualList = getMyRBhv().delegateReadListTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc()).subList(1, 3);
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }

        // ## Act ##
        {
            cb.fetchPage(2);
            final List actualList = getMyRBhv().delegateReadListTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc()).subList(3, 5);
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }

        // ## Act ##
        {
            cb.fetchPage(3);
            final List actualList = getMyRBhv().delegateReadListTx(cb);

            // ## Assert ##
            final List expectedList = getMyRBhv().delegateReadListTx(
                    getDBMeta().newConditionBean().addOrderBy_PK_Asc()).subList(5, 7);
            assertEquals(expectedList.size(), actualList.size());

            for (int i = 0; i < expectedList.size(); i++) {
                final LdEntity expectedEntity = (LdEntity) expectedList.get(i);
                final LdEntity actualEntity = (LdEntity) actualList.get(i);
                help.assertMyEntity(expectedEntity, actualEntity);
                help.assertMyParentEntityNull(actualEntity);
                help.assertMyChildEntityNull(actualEntity);
            }
        }
    }

    public void doTest_modify_TimestampConcurrencyControl(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_modify_TimestampConcurrencyControl(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();
        final List ls = help.getMyEntityList_BeforeUpdate();

        for (final Iterator ite = ls.iterator(); ite.hasNext();) {
            final LdEntity entity = (LdEntity) ite.next();
            if (entity instanceof LdEntityDefinedCommonColumn) {
                ((LdEntityDefinedCommonColumn) entity).setUTime(new Timestamp(System.currentTimeMillis() + 10000L));
            }

            // ## Act ##
            try {
                getMyWBhv().delegateModifyTx(entity);
            } catch (org.seasar.dao.NotSingleRowUpdatedRuntimeException e) {
                _log.debug("NotSingleRowUpdatedRuntimeException#getMessage()=" + e.getMessage());
                // OK
            }
        }
    }

    public void doTest_update_TimestampConcurrencyControl(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_update_timestampConcurrencyControl(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();
        final List ls = help.getMyEntityList_BeforeUpdate();

        for (final Iterator ite = ls.iterator(); ite.hasNext();) {
            final LdEntity entity = (LdEntity) ite.next();
            if (entity instanceof LdEntityDefinedCommonColumn) {
                ((LdEntityDefinedCommonColumn) entity).setUTime(new Timestamp(System.currentTimeMillis() + 10000L));
            }

            // ## Act ##
            final LdDaoWritable wdao = getMyWDao();
            final Class type = entity.getClass();
            try {
                ((Integer) FlMethodUtil.invoke("update", type, wdao, entity)).intValue();
                fail("The mehotd 'update' must throw the exception by timestampConcurrencyControl: " + entity);
            } catch (RuntimeException e) {
                if (e.getCause() instanceof org.seasar.dao.NotSingleRowUpdatedRuntimeException) {
                    _log.debug("NotSingleRowUpdatedRuntimeException#getMessage()=" + e.getMessage());
                    // OK
                } else {
                    throw e;
                }
            }
        }
    }

    // ==========================================================================================
    //                                                                               Limit Select
    //                                                                               ============
    public void doTest_CB_limitSetup_PKOnly_and_Off(MyHelpObject help) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_CB_limitSetup_PKOnly_and_Off(): help=" + help);
        _log.debug("- - - - - - - -/");

        // ## Arrange ##
        help.replaceMyTableWithForeign();

        // ## Act ##
        final LdConditionBean cb = getDBMeta().newConditionBean();
        assertFalse(cb.isLimitSelect_PKOnly());
        cb.limitSelect_PKOnly();
        assertTrue(cb.isLimitSelect_PKOnly());
        cb.limitSelect_Off();
        assertFalse(cb.isLimitSelect_PKOnly());
        cb.limitSelect_PKOnly();
        assertTrue(cb.isLimitSelect_PKOnly());
        final List<LdEntity> ls = getMyRBhv().delegateReadListTx(cb);

        // ## Assert ##
        for (final LdEntity entity : ls) {
            assertTrue(entity.hasPrimaryKeyValue());
            final LdEntity expectedEntity = getDBMeta().newEntity();
            expectedEntity.acceptPrimaryKeyMapString(entity.extractPrimaryKeyMapString());
            help.assertMyEntity(expectedEntity, entity);
        }
    }

    public void doTest_DBMeta_TypeAndInstanceGetter(LdEntity entity) {
        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        _log.debug("doTest_DBMeta_TypeAndInstanceGetter(): entity=" + entity);
        _log.debug("- - - - - - - -/");

        final String name = entity.getTableDbName();
        final LdDBMeta xx = LdDBMetaInstanceHandler.getInstanceByTableDbName(name);
        final LdDBMeta yy = entity.getDBMeta();
        assertEquals(xx, yy);

        final LdDBMeta dbmeta = entity.getDBMeta();

        assertNotNull(dbmeta.getEntityType());
        assertEquals(getDBMeta().getEntityType(), dbmeta.getEntityType());

        assertNotNull(dbmeta.newEntity());
        assertEquals(getDBMeta().getEntityType(), dbmeta.newEntity().getClass());

        assertNotNull(dbmeta.getConditionBeanType());
        assertEquals(getDBMeta().getConditionBeanType(), dbmeta.getConditionBeanType());

        assertNotNull(dbmeta.newConditionBean());
        assertEquals(getDBMeta().getConditionBeanType(), dbmeta.newConditionBean().getClass());

        assertEquals(getDBMeta().getDaoType(), dbmeta.getDaoType());
    }

    // ==========================================================================================
    //                                                                                Help Object
    //                                                                                ===========
    /**
     * My help object. {Interface}
     */
    public static interface MyHelpObject {
        public void deleteMyTableWithForeign();

        public void deleteMyForeignTable();

        public void registerMyTableWithForeign();

        public void registerMyForeignTable();

        public void replaceMyTableWithForeign();

        public void replaceMyForeignTable();

        public void deleteMyTableWithAll();

        public void registerMyTableWithAll();

        public void replaceMyTableWithAll();

        public List getMyEntityList_BeforeInsert();

        public List getMyEntityList_BeforeUpdate();

        public List getMyEntityList_BeforeDelete();

        public void assertMyEntity(LdEntity expectedEntity, LdEntity actualEntity);

        public void assertMyParentEntityNull(LdEntity actualEntity);

        public void assertMyChildEntityNull(LdEntity actualEntity);

        public Comparator getPrimaryKeyAscComparator();
    }
}

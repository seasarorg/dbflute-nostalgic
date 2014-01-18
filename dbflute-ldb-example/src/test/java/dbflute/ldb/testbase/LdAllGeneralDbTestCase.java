package dbflute.ldb.testbase;

import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.seasar.framework.util.ClassUtil;
import org.seasar.framework.util.MethodUtil;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;
import dbflute.ldb.allcommon.bhv.LdBehaviorWritable;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException;
import dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException;
import dbflute.ldb.allcommon.exception.LdRecordHasOverlappedException;

public abstract class LdAllGeneralDbTestCase extends LdAllDbTestCase {

    protected void doTest_create(MyHelpObject help) {
        // ## Arrange ##
        final List<LdEntity> ls = help.getMyEntityList_BeforeInsert();

        for (final Iterator<LdEntity> ite = ls.iterator(); ite.hasNext();) {
            final LdEntity entity = (LdEntity) ite.next();

            // ## Act ##
            assertFalse(entity.hasPrimaryKeyValue());
            try {
                getBehaviorWritable().create(entity);
            } catch (LdEntityAlreadyExistsException ignored) {
                // [Problem]: Why does the exception occurred? Derby's Bug!?
                log(ignored.getMessage());
                continue;
            }
            assertTrue(entity.hasPrimaryKeyValue());

            // ## Assert ##
            help.assertMyEntity(entity, selectMyEntityByEntityzPK(entity));

            // ## After Care ##
            getBehaviorWritable().remove(entity);
        }
    }

    protected void doTest_modify(MyHelpObject help) {
        // ## Arrange ##
        final List<LdEntity> ls = getBehaviorReadable().readList(getBehaviorReadable().newConditionBean());

        for (final Iterator<LdEntity> ite = ls.iterator(); ite.hasNext();) {
            final LdEntity entity = ite.next();
            final LdEntity updateEntity = getDBMeta().newEntity();
            if (entity instanceof LdEntityDefinedCommonColumn) {
                final LdEntityDefinedCommonColumn commonEntity = (LdEntityDefinedCommonColumn) entity;
                final LdEntityDefinedCommonColumn updateCommonEntity = (LdEntityDefinedCommonColumn) updateEntity;
                updateCommonEntity.setRModule(commonEntity.getRModule());
                updateCommonEntity.setRTimestamp(commonEntity.getRTimestamp());
                updateCommonEntity.setRUser(commonEntity.getRUser());
                updateCommonEntity.setUModule(commonEntity.getUModule());
                updateCommonEntity.setUTimestamp(commonEntity.getUTimestamp());
                updateCommonEntity.setUUser(commonEntity.getUUser());
            }
            getDBMeta().acceptPrimaryKeyMapString(updateEntity, getDBMeta().extractPrimaryKeyMapString(entity));

            // ## Act ##
            getBehaviorWritable().modify(updateEntity);

            // ## Assert ##
            help.assertMyEntity(entity, selectMyEntityByEntityzPK(entity));
        }
    }

    protected void doTest_remove(MyHelpObject help) {
        // ## Arrange ##
        final List<LdEntity> ls = help.getMyEntityList_BeforeDelete();

        for (final Iterator<LdEntity> ite = ls.iterator(); ite.hasNext();) {
            final LdEntity entity = (LdEntity) ite.next();

            // ## Act ##
            getBehaviorWritable().remove(entity);

            // ## Assert ##
            assertNull(selectMyEntityByEntityzPK(entity));
        }
    }

    protected void doTest_createOrModify(MyHelpObject help) {
        final LdBehaviorWritable bhv = getBehaviorWritable();
        {
            final java.util.List<?> entityList = help.getMyEntityList_BeforeInsert();
            for (Object entityObject : entityList) {
                final LdEntity entity = (LdEntity) entityObject;

                LdEntity actual = null;
                {
                    bhv.createOrModify(entity);
                    bhv.newConditionBean();
                    final LdConditionBean cb = bhv.newConditionBean();
                    cb.acceptPrimaryKeyMapString(getDBMeta().extractColumnValueMapString(entity));
                    actual = bhv.readEntity(cb);
                    help.assertMyEntity(entity, actual);
                }
                {
                    bhv.createOrModify(entity);
                    final LdConditionBean cb = bhv.newConditionBean();
                    cb.acceptPrimaryKeyMapString(getDBMeta().extractColumnValueMapString(entity));
                    help.assertMyEntity(entity, actual);
                }
            }
        }
    }

    protected void doTest_insertOrUpdate(MyHelpObject help) {
        final LdBehaviorWritable bhv = getBehaviorWritable();
        final String methodName = "insertOrUpdate";
        {
            final java.util.List<LdEntity> entityList = help.getMyEntityList_BeforeInsert();
            for (Object entityObject : entityList) {
                final LdEntity entity = (LdEntity) entityObject;
                final Class<?>[] argsType = new Class[] { getDBMeta().getEntityType() };
                final Method method = ClassUtil.getMethod(bhv.getClass(), methodName, argsType);

                LdEntity actual = null;
                {
                    MethodUtil.invoke(method, bhv, new Object[] { entity });
                    final LdConditionBean cb = bhv.newConditionBean();
                    cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
                    actual = bhv.readEntity(cb);
                    help.assertMyEntity(entity, actual);
                }
                {
                    MethodUtil.invoke(method, bhv, new Object[] { entity });
                    final LdConditionBean cb = bhv.newConditionBean();
                    cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
                    help.assertMyEntity(entity, actual);
                }
            }
        }
    }

    protected void doTest_updateAfterSelectForUpdate(MyHelpObject help) {
        final LdBehaviorWritable bhv = getBehaviorWritable();
        final String methodName = "updateAfterSelectForUpdate";
        final java.util.List<LdEntity> entityList = help.getMyEntityList_BeforeUpdate();
        for (Object entityObject : entityList) {
            final LdEntity entity = (LdEntity) entityObject;
            final Class<?>[] argsType = new Class[] { getDBMeta().getEntityType() };
            final Method method = ClassUtil.getMethod(bhv.getClass(), methodName, argsType);
            MethodUtil.invoke(method, bhv, new Object[] { entity });
            final LdConditionBean cb = bhv.newConditionBean();
            cb.acceptPrimaryKeyMapString(getDBMeta().extractColumnValueMapString(entity));
            final LdEntity actual = bhv.readEntity(cb);
            help.assertMyEntity(entity, actual);
        }
    }

    // ------------------------------------------------------------------
    //                                      selectXxx acceptPrimaryKeyMap
    //                                      -----------------------------
    protected void doTest_selectEntity_ByPK(MyHelpObject help) {
        // ## Arrange ##
        final List<LdEntity> expectedList = getBehaviorReadable().readList(getBehaviorReadable().newConditionBean());
        for (final Iterator<LdEntity> ite = expectedList.iterator(); ite.hasNext();) {
            final LdEntity expectedEntity = (LdEntity) ite.next();

            // ## Act ##
            final LdConditionBean cb = getBehaviorReadable().newConditionBean();

            cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(expectedEntity));
            final LdEntity actualEntity = getBehaviorReadable().readEntity(cb);

            // ## Assert ##
            help.assertMyEntity(expectedEntity, actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
    }

    protected void doTest_selectList_ByPK(MyHelpObject help) {
        // ## Arrange ##
        final List<LdEntity> expectedList = getBehaviorReadable().readList(getBehaviorReadable().newConditionBean());
        for (final Iterator<LdEntity> ite = expectedList.iterator(); ite.hasNext();) {
            final LdEntity expectedEntity = (LdEntity) ite.next();

            // ## Act ##
            final LdConditionBean cb = getBehaviorReadable().newConditionBean();
            cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(expectedEntity));
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);

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
    @SuppressWarnings("unchecked")
    protected void doTest_selectEntity_addOrderBy_PK_Asc(MyHelpObject help) {
        // ## Arrange ##

        // ## Act ##
        final LdConditionBean cb = getBehaviorReadable().newConditionBean();
        {
            cb.addOrderBy_PK_Asc();
            cb.fetchFirst(1);
            final LdEntity actualEntity = getBehaviorReadable().readEntity(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable()
                    .readList(getBehaviorReadable().newConditionBean());
            Collections.sort(expectedList, help.getPrimaryKeyAscComparator());
            help.assertMyEntity((LdEntity) expectedList.get(0), actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
        {
            cb.getSqlClause().clearOrderBy();
            cb.addOrderBy_PK_Desc();
            cb.fetchFirst(1);
            final LdEntity actualEntity = getBehaviorReadable().readEntity(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable()
                    .readList(getBehaviorReadable().newConditionBean());
            Collections.sort(expectedList, Collections.reverseOrder(help.getPrimaryKeyAscComparator()));
            help.assertMyEntity((LdEntity) expectedList.get(0), actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
    }

    @SuppressWarnings("unchecked")
    protected void doTest_selectList_addOrderBy_PK_Asc(MyHelpObject help) {
        // ## Arrange ##

        // ## Act ##
        final LdConditionBean cb = getBehaviorReadable().newConditionBean();
        {
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb.addOrderBy_PK_Asc());

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable()
                    .readList(getBehaviorReadable().newConditionBean());
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
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb.addOrderBy_PK_Desc());

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable()
                    .readList(getBehaviorReadable().newConditionBean());
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
    @SuppressWarnings("unchecked")
    protected void doTest_selectEntity_addOrderBy_PK_Desc(MyHelpObject help) {
        // ## Arrange ##

        // ## Act ##
        final LdConditionBean cb = getBehaviorReadable().newConditionBean();
        {
            cb.addOrderBy_PK_Desc();
            cb.fetchFirst(1);
            final LdEntity actualEntity = getBehaviorReadable().readEntity(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable()
                    .readList(getBehaviorReadable().newConditionBean());
            assertListNotEmtpy(expectedList);
            Collections.sort(expectedList, Collections.reverseOrder(help.getPrimaryKeyAscComparator()));
            help.assertMyEntity((LdEntity) expectedList.get(0), actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
        {
            cb.getSqlClause().clearOrderBy();
            cb.addOrderBy_PK_Asc();
            cb.fetchFirst(1);
            final LdEntity actualEntity = getBehaviorReadable().readEntity(cb.addOrderBy_PK_Asc());

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable()
                    .readList(getBehaviorReadable().newConditionBean());
            assertListNotEmtpy(expectedList);
            Collections.sort(expectedList, help.getPrimaryKeyAscComparator());
            help.assertMyEntity((LdEntity) expectedList.get(0), actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
    }

    @SuppressWarnings("unchecked")
    protected void doTest_selectList_addOrderBy_PK_Desc(MyHelpObject help) {
        // ## Arrange ##

        // ## Act ##
        final LdConditionBean cb = getBehaviorReadable().newConditionBean();
        {
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb.addOrderBy_PK_Desc());

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable()
                    .readList(getBehaviorReadable().newConditionBean());
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
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb.addOrderBy_PK_Asc());

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable()
                    .readList(getBehaviorReadable().newConditionBean());
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
    protected void doTest_selectEntity_fetchFirst_One(MyHelpObject help) {
        // ## Arrange ##
        final LdConditionBean cb = getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc();
        cb.fetchFirst(1);
        {
            // ## Act ##
            final LdEntity actualEntity = getBehaviorReadable().readEntity(cb);
            assertNotNull(actualEntity);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc()).subList(0, 1);
            final LdEntity expectedEntity = (LdEntity) expectedList.get(0);

            help.assertMyEntity(expectedEntity, actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
        {
            // ## Act ##
            cb.fetchFirst(1);
            final LdEntity actualEntity = getBehaviorReadable().readEntity(cb);
            assertNotNull(actualEntity);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc()).subList(0, 1);
            final LdEntity expectedEntity = (LdEntity) expectedList.get(0);

            help.assertMyEntity(expectedEntity, actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
    }

    protected void doTest_selectList_fetchFirst_One(MyHelpObject help) {
        // ## Arrange ##
        final LdConditionBean cb = getBehaviorReadable().newConditionBean().addOrderBy_PK_Desc();
        cb.fetchFirst(1);
        {
            // ## Act ##
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);
            if (actualList.size() != 1) {
                String msg = "selectList() must return the list that has only one record: ";
                fail(msg + "size=" + actualList.size() + " actualList=" + actualList);
            }

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Desc()).subList(0, 1);
            final LdEntity expectedEntity = (LdEntity) expectedList.get(0);
            final LdEntity actualEntity = (LdEntity) actualList.get(0);
            help.assertMyEntity(expectedEntity, actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
        {
            // ## Act ##
            cb.fetchFirst(4);
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);
            if (actualList.size() != 4) {
                fail("selectList() must return the list that has only one record: " + actualList);
            }

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Desc()).subList(0, 4);
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
    protected void doTest_selectCount_fetchScope_OneThree(MyHelpObject help) {
        // ## Arrange ##

        // ## Act ##
        final LdConditionBean cb = getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc();
        final LdConditionBean cbListAll = getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc();
        cb.fetchScope(1, 3);
        {
            final int count = getBehaviorReadable().readCount(cb);

            // ## Assert ##
            final int expectedCount = getBehaviorReadable().readList(cbListAll).size();
            assertEquals(expectedCount, count);

            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc()).subList(1, 4);
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
            final int count = getBehaviorReadable().readCount(cb);

            // ## Assert ##
            final int expectedCount = getBehaviorReadable().readList(cbListAll).size();
            assertEquals(expectedCount, count);

            cb.getSqlClause().ignoreFetchScope();
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc());
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
            final int count = getBehaviorReadable().readCount(cb);

            // ## Assert ##
            final int expectedCount = getBehaviorReadable().readList(cbListAll).size();
            assertEquals(expectedCount, count);

            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc()).subList(1, 4);
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

    protected void doTest_selectEntity_fetchScope_OneOne(MyHelpObject help) {
        // ## Arrange ##
        final LdConditionBean cb = getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc();
        cb.fetchScope(1, 1);
        {
            // ## Act ##
            final LdEntity actualEntity = getBehaviorReadable().readEntity(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc()).subList(1, 4);
            help.assertMyEntity((LdEntity) expectedList.get(0), actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
        {
            // ## Act ##
            cb.getSqlClause().ignoreFetchScope();
            try {
                getBehaviorReadable().readEntity(cb);
                fail();
            } catch (LdRecordHasOverlappedException e) {
                // OK
            }
        }
        {
            // ## Act ##
            cb.getSqlClause().makeFetchScopeEffective();
            final LdEntity actualEntity = getBehaviorReadable().readEntity(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc()).subList(1, 4);
            help.assertMyEntity((LdEntity) expectedList.get(0), actualEntity);
            help.assertMyParentEntityNull(actualEntity);
            help.assertMyChildEntityNull(actualEntity);
        }
    }

    protected void doTest_selectList_fetchScope_OneThree(MyHelpObject help) {
        // ## Arrange ##

        // ## Act ##
        final LdConditionBean cb = getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc();
        cb.fetchScope(1, 3);
        {
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc()).subList(1, 4);
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
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc());
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
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc()).subList(1, 4);
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
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc()).subList(2, 5);
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
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);
            System.out.println("****************************************************");
            System.out.println("actualList=" + actualList);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Desc()).subList(0, 2);
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
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Desc()).subList(0, 2);
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
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Desc()).subList(2, 4);
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
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Desc()).subList(4, 5);
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

    protected void doTest_selectList_fetchPage_OneTwo(MyHelpObject help) {
        // ## Arrange ##

        // ## Act ##
        final LdConditionBean cb = getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc();
        cb.fetchScope(1, 2).fetchPage(1);
        {
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc()).subList(1, 3);
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
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc());
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
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc()).subList(1, 3);
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
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc()).subList(3, 5);
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
            final List<LdEntity> actualList = getBehaviorReadable().readList(cb);

            // ## Assert ##
            final List<LdEntity> expectedList = getBehaviorReadable().readList(
                    getBehaviorReadable().newConditionBean().addOrderBy_PK_Asc()).subList(5, 7);
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

    protected void doTest_modify_TimestampConcurrencyControl(MyHelpObject help) {
        // ## Arrange ##
        final List<LdEntity> ls = help.getMyEntityList_BeforeUpdate();
        for (final Iterator<LdEntity> ite = ls.iterator(); ite.hasNext();) {
            final LdEntity entity = (LdEntity) ite.next();
            if (entity instanceof LdEntityDefinedCommonColumn) {
                ((LdEntityDefinedCommonColumn) entity)
                        .setUTimestamp(new Timestamp(System.currentTimeMillis() + 10000L));
            }

            // ## Act ##
            try {
                getBehaviorWritable().modify(entity);
            } catch (LdEntityAlreadyUpdatedException e) {
                _log.debug("NotSingleRowUpdatedRuntimeException#getMessage()=" + e.getMessage());
                // OK
            }
        }
    }

    protected void doTest_update_TimestampConcurrencyControl(MyHelpObject help) {
        // ## Arrange ##
        final List<LdEntity> ls = help.getMyEntityList_BeforeUpdate();
        for (final Iterator<LdEntity> ite = ls.iterator(); ite.hasNext();) {
            final LdEntity entity = (LdEntity) ite.next();
            if (entity instanceof LdEntityDefinedCommonColumn) {
                ((LdEntityDefinedCommonColumn) entity)
                        .setUTimestamp(new Timestamp(System.currentTimeMillis() + 10000L));
            }

            // ## Act ##
            try {
                getBehaviorWritable().modify(entity);
                fail("The mehotd 'update' must throw the exception by timestampConcurrencyControl: " + entity);
            } catch (RuntimeException e) {
                if (e instanceof LdEntityAlreadyUpdatedException) {
                    _log.debug("NotSingleRowUpdatedRuntimeException#getMessage()=" + e.getMessage());
                    // OK
                } else {
                    throw e;
                }
            }
        }
    }

    protected void doTest_DBMeta_TypeAndInstanceGetter(LdEntity entity) {
        final String name = entity.getTableDbName();
        final LdDBMeta xx = LdDBMetaInstanceHandler.findDBMeta(name);
        final LdDBMeta yy = entity.getDBMeta();
        assertEquals(xx, yy);

        final LdDBMeta dbmeta = entity.getDBMeta();

        assertNotNull(dbmeta.getEntityType());
        assertEquals(getDBMeta().getEntityType(), dbmeta.getEntityType());

        assertNotNull(dbmeta.newEntity());
        assertEquals(getDBMeta().getEntityType(), dbmeta.newEntity().getClass());

        assertNotNull(dbmeta.getConditionBeanTypeName());
        assertEquals(getDBMeta().getConditionBeanTypeName(), dbmeta.getConditionBeanTypeName());

        assertEquals(getDBMeta().getDaoTypeName(), dbmeta.getDaoTypeName());
    }

    public static interface MyHelpObject {

        public void replaceMyTableWithForeign();

        public void replaceMyForeignTable();

        public void replaceMyTableWithAll();

        public List<LdEntity> getMyEntityList_BeforeInsert();

        public List<LdEntity> getMyEntityList_BeforeUpdate();

        public List<LdEntity> getMyEntityList_BeforeDelete();

        public void assertMyEntity(LdEntity expectedEntity, LdEntity actualEntity);

        public void assertMyParentEntityNull(LdEntity actualEntity);

        public void assertMyChildEntityNull(LdEntity actualEntity);

        public Comparator<LdEntity> getPrimaryKeyAscComparator();
    }

    public abstract class AbstractMyHelpObject implements MyHelpObject {

        final public void replaceMyTableWithAll() {
        }

        final public void replaceMyTableWithForeign() {
        }

        final public void replaceMyForeignTable() {
        }
    }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsbhv;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.*;
import dbflute.ldb.allcommon.bhv.setup.LdValueLabelSetupper;
import dbflute.ldb.allcommon.dbmeta.hierarchy.LdHierarchyArranger;
import dbflute.ldb.allcommon.dbmeta.hierarchy.LdHierarchyBasicRequest;
import dbflute.ldb.allcommon.dbmeta.hierarchy.LdHierarchyRequest;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdResultBeanBuilder;
import dbflute.ldb.allcommon.cbean.LdPagingHandler;
import dbflute.ldb.allcommon.cbean.LdPagingInvoker;
import dbflute.ldb.allcommon.cbean.LdPagingBean;
import dbflute.ldb.allcommon.cbean.LdPagingResultBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.jdbc.LdStatementConfig;
import dbflute.ldb.exentity.*;
import dbflute.ldb.bsentity.dbmeta.*;
import dbflute.ldb.cbean.*;

/**
 * The behavior of NEXT_LIBRARY that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, NEXT_LIBRARY_ID
 * 
 * [column]
 *     LIBRARY_ID, NEXT_LIBRARY_ID, DISTANCE_KM, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     LIBRARY
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     libraryByNextId, libraryByBaseId
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsNextLibraryBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "NEXT_LIBRARY"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdNextLibraryDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdNextLibraryDbm getMyDBMeta() { return LdNextLibraryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdNextLibrary newMyEntity() { return new LdNextLibrary(); }
    public LdNextLibraryCB newMyConditionBean() { return new LdNextLibraryCB(); }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    @Override
    protected LdDBDef getCurrentDBDef() {
        return LdDBCurrent.getInstance().currentDBDef();
    }

    // ===================================================================================
    //                                                             Default StatementConfig
    //                                                             =======================
    @Override
    protected LdStatementConfig getDefaultStatementConfig() {
        return LdDBFluteConfig.getInstance().getDefaultStatementConfig();
    }
    
    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of the condition-bean. {IgnorePagingCondition}
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdNextLibraryCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdNextLibrary selectEntity(final LdNextLibraryCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdNextLibrary, LdNextLibraryCB>() {
            public List<LdNextLibrary> callbackSelectList(LdNextLibraryCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdNextLibrary selectEntityWithDeletedCheck(final LdNextLibraryCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdNextLibrary, LdNextLibraryCB>() {
            public List<LdNextLibrary> callbackSelectList(LdNextLibraryCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdNextLibrary selectByPKValueWithDeletedCheck(Integer libraryId, Integer nextLibraryId) {
        LdNextLibrary entity = new LdNextLibrary();
        entity.setLibraryId(libraryId);entity.setNextLibraryId(nextLibraryId);
        final LdNextLibraryCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdNextLibrary> selectList(LdNextLibraryCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdNextLibrary>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdNextLibrary> selectPage(final LdNextLibraryCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdNextLibrary> invoker = new LdPagingInvoker<LdNextLibrary>(getTableDbName());
        final LdPagingHandler<LdNextLibrary> handler = new LdPagingHandler<LdNextLibrary>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdNextLibrary> paging() { return selectList(cb); }
        };
        return invoker.invokePaging(handler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function. <br />
     * Call a function method after this method called like as follows:
     * <pre>
     * nextLibraryBhv.scalarSelect(Date.class).max(new ScalarQuery(LdNextLibraryCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdNextLibraryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdNextLibraryCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdNextLibraryCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdNextLibrary. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdNextLibraryCB cb, LdValueLabelSetupper<LdNextLibrary> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'LdLibrary'.
     * @param nextLibraryList The list of nextLibrary. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdLibrary> pulloutLibraryByNextId(List<LdNextLibrary> nextLibraryList) {
        return helpPulloutInternally(nextLibraryList, new InternalPulloutCallback<LdNextLibrary, LdLibrary>() {
            public LdLibrary callbackGetForeignEntity(LdNextLibrary entity) { return entity.getLibraryByNextId(); } });
    }
    /**
     * Pull out the list of foreign table 'LdLibrary'.
     * @param nextLibraryList The list of nextLibrary. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdLibrary> pulloutLibraryByBaseId(List<LdNextLibrary> nextLibraryList) {
        return helpPulloutInternally(nextLibraryList, new InternalPulloutCallback<LdNextLibrary, LdLibrary>() {
            public LdLibrary callbackGetForeignEntity(LdNextLibrary entity) { return entity.getLibraryByBaseId(); } });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param nextLibrary The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdNextLibrary nextLibrary) {
        assertEntityNotNull(nextLibrary);
        delegateInsert(nextLibrary);
    }

    @Override
    protected void doCreate(LdEntity nextLibrary) {
        insert((LdNextLibrary)nextLibrary);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param nextLibrary The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdNextLibrary nextLibrary) {
        helpUpdateInternally(nextLibrary, new InternalUpdateCallback<LdNextLibrary>() {
            public int callbackDelegateUpdate(LdNextLibrary entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdNextLibrary)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param nextLibrary The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdNextLibrary nextLibrary) {
        helpUpdateNonstrictInternally(nextLibrary, new InternalUpdateNonstrictCallback<LdNextLibrary>() {
            public int callbackDelegateUpdateNonstrict(LdNextLibrary entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdNextLibrary)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param nextLibrary The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdNextLibrary nextLibrary) {
        helpInsertOrUpdateInternally(nextLibrary, new InternalInsertOrUpdateCallback<LdNextLibrary, LdNextLibraryCB>() {
            public void callbackInsert(LdNextLibrary entity) { insert(entity); }
            public void callbackUpdate(LdNextLibrary entity) { update(entity); }
            public LdNextLibraryCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdNextLibraryCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity nextLibrary) {
        insertOrUpdate((LdNextLibrary)nextLibrary);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param nextLibrary The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdNextLibrary nextLibrary) {
        helpInsertOrUpdateInternally(nextLibrary, new InternalInsertOrUpdateNonstrictCallback<LdNextLibrary>() {
            public void callbackInsert(LdNextLibrary entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdNextLibrary entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdNextLibrary)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param nextLibrary The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdNextLibrary nextLibrary) {
        helpDeleteInternally(nextLibrary, new InternalDeleteCallback<LdNextLibrary>() {
            public int callbackDelegateDelete(LdNextLibrary entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity nextLibrary) {
        delete((LdNextLibrary)nextLibrary);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param nextLibrary Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdNextLibrary nextLibrary) {
        helpDeleteNonstrictInternally(nextLibrary, new InternalDeleteNonstrictCallback<LdNextLibrary>() {
            public int callbackDelegateDeleteNonstrict(LdNextLibrary entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param nextLibrary Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdNextLibrary nextLibrary) {
        helpDeleteNonstrictIgnoreDeletedInternally(nextLibrary, new InternalDeleteNonstrictIgnoreDeletedCallback<LdNextLibrary>() {
            public int callbackDelegateDeleteNonstrict(LdNextLibrary entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param nextLibraryList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdNextLibrary> nextLibraryList) {
        assertObjectNotNull("nextLibraryList", nextLibraryList);
        return delegateInsertList(nextLibraryList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param nextLibraryList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdNextLibrary> nextLibraryList) {
        assertObjectNotNull("nextLibraryList", nextLibraryList);
        return delegateUpdateList(nextLibraryList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param nextLibraryList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdNextLibrary> nextLibraryList) {
        assertObjectNotNull("nextLibraryList", nextLibraryList);
        return delegateUpdateListNonstrict(nextLibraryList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param nextLibraryList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdNextLibrary> nextLibraryList) {
        assertObjectNotNull("nextLibraryList", nextLibraryList);
        return delegateDeleteList(nextLibraryList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param nextLibraryList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdNextLibrary> nextLibraryList) {
        assertObjectNotNull("nextLibraryList", nextLibraryList);
        return delegateDeleteListNonstrict(nextLibraryList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    
    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCount(LdNextLibraryCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdNextLibraryCB)cb); }
    protected List<LdNextLibrary> delegateSelectList(LdNextLibraryCB cb) {
        return invoke(createSelectListCBCommand(cb, LdNextLibrary.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdNextLibraryCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdNextLibrary e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdNextLibrary e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdNextLibrary e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdNextLibrary e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdNextLibrary e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdNextLibrary> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdNextLibrary> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdNextLibrary> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdNextLibrary> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdNextLibrary> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdNextLibrary..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdNextLibrary. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdNextLibrary, LdNextLibraryDbm.NextLibraryRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdNextLibrary, LdNextLibraryDbm.NextLibraryRelationTrace> request = new LdHierarchyBasicRequest<LdNextLibrary, LdNextLibraryDbm.NextLibraryRelationTrace>(LdNextLibrary.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdNextLibrary. (NotNull)
     * @return The list of LdNextLibrary. (NotNull)
     */
    public List<LdNextLibrary> arrangeHierarchy(LdHierarchyRequest<LdNextLibrary> request) {
        return new LdHierarchyArranger<LdNextLibrary>().arrangeHierarchy(request);
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(LdEntity entity) {
        return false;
    }

    @Override
    protected boolean hasUpdateDateValue(LdEntity entity) {
        return downcast(entity).getUTimestamp() != null;
    }

    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    protected LdNextLibrary downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdNextLibrary.class);
    }
}

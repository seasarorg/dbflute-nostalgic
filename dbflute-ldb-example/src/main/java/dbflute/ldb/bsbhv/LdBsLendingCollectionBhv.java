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
 * The behavior of LENDING_COLLECTION that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID
 * 
 * [column]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID, RETURN_LIMIT_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION, LENDING, LIBRARY_USER
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     collection, lending, libraryUser
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLendingCollectionBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "LENDING_COLLECTION"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdLendingCollectionDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLendingCollectionDbm getMyDBMeta() { return LdLendingCollectionDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdLendingCollection newMyEntity() { return new LdLendingCollection(); }
    public LdLendingCollectionCB newMyConditionBean() { return new LdLendingCollectionCB(); }

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
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdLendingCollectionCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLendingCollection selectEntity(final LdLendingCollectionCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdLendingCollection, LdLendingCollectionCB>() {
            public List<LdLendingCollection> callbackSelectList(LdLendingCollectionCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLendingCollection selectEntityWithDeletedCheck(final LdLendingCollectionCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdLendingCollection, LdLendingCollectionCB>() {
            public List<LdLendingCollection> callbackSelectList(LdLendingCollectionCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLendingCollection selectByPKValueWithDeletedCheck(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate, Integer collectionId) {
        LdLendingCollection entity = new LdLendingCollection();
        entity.setLibraryId(libraryId);entity.setLbUserId(lbUserId);entity.setLendingDate(lendingDate);entity.setCollectionId(collectionId);
        final LdLendingCollectionCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdLendingCollection> selectList(LdLendingCollectionCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdLendingCollection>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdLendingCollection> selectPage(final LdLendingCollectionCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdLendingCollection> invoker = new LdPagingInvoker<LdLendingCollection>(getTableDbName());
        final LdPagingHandler<LdLendingCollection> handler = new LdPagingHandler<LdLendingCollection>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdLendingCollection> paging() { return selectList(cb); }
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
     * lendingCollectionBhv.scalarSelect(Date.class).max(new ScalarQuery(LdLendingCollectionCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdLendingCollectionCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdLendingCollectionCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdLendingCollectionCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdLendingCollection. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdLendingCollectionCB cb, LdValueLabelSetupper<LdLendingCollection> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'LdCollection'.
     * @param lendingCollectionList The list of lendingCollection. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdCollection> pulloutCollection(List<LdLendingCollection> lendingCollectionList) {
        return helpPulloutInternally(lendingCollectionList, new InternalPulloutCallback<LdLendingCollection, LdCollection>() {
            public LdCollection callbackGetForeignEntity(LdLendingCollection entity) { return entity.getCollection(); } });
    }
    /**
     * Pull out the list of foreign table 'LdLending'.
     * @param lendingCollectionList The list of lendingCollection. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdLending> pulloutLending(List<LdLendingCollection> lendingCollectionList) {
        return helpPulloutInternally(lendingCollectionList, new InternalPulloutCallback<LdLendingCollection, LdLending>() {
            public LdLending callbackGetForeignEntity(LdLendingCollection entity) { return entity.getLending(); } });
    }
    /**
     * Pull out the list of foreign table 'LdLibraryUser'.
     * @param lendingCollectionList The list of lendingCollection. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdLibraryUser> pulloutLibraryUser(List<LdLendingCollection> lendingCollectionList) {
        return helpPulloutInternally(lendingCollectionList, new InternalPulloutCallback<LdLendingCollection, LdLibraryUser>() {
            public LdLibraryUser callbackGetForeignEntity(LdLendingCollection entity) { return entity.getLibraryUser(); } });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param lendingCollection The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdLendingCollection lendingCollection) {
        assertEntityNotNull(lendingCollection);
        delegateInsert(lendingCollection);
    }

    @Override
    protected void doCreate(LdEntity lendingCollection) {
        insert((LdLendingCollection)lendingCollection);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param lendingCollection The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdLendingCollection lendingCollection) {
        helpUpdateInternally(lendingCollection, new InternalUpdateCallback<LdLendingCollection>() {
            public int callbackDelegateUpdate(LdLendingCollection entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdLendingCollection)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param lendingCollection The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdLendingCollection lendingCollection) {
        helpUpdateNonstrictInternally(lendingCollection, new InternalUpdateNonstrictCallback<LdLendingCollection>() {
            public int callbackDelegateUpdateNonstrict(LdLendingCollection entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdLendingCollection)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param lendingCollection The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdLendingCollection lendingCollection) {
        helpInsertOrUpdateInternally(lendingCollection, new InternalInsertOrUpdateCallback<LdLendingCollection, LdLendingCollectionCB>() {
            public void callbackInsert(LdLendingCollection entity) { insert(entity); }
            public void callbackUpdate(LdLendingCollection entity) { update(entity); }
            public LdLendingCollectionCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdLendingCollectionCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity lendingCollection) {
        insertOrUpdate((LdLendingCollection)lendingCollection);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param lendingCollection The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdLendingCollection lendingCollection) {
        helpInsertOrUpdateInternally(lendingCollection, new InternalInsertOrUpdateNonstrictCallback<LdLendingCollection>() {
            public void callbackInsert(LdLendingCollection entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdLendingCollection entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdLendingCollection)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param lendingCollection The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLendingCollection lendingCollection) {
        helpDeleteInternally(lendingCollection, new InternalDeleteCallback<LdLendingCollection>() {
            public int callbackDelegateDelete(LdLendingCollection entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity lendingCollection) {
        delete((LdLendingCollection)lendingCollection);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param lendingCollection Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLendingCollection lendingCollection) {
        helpDeleteNonstrictInternally(lendingCollection, new InternalDeleteNonstrictCallback<LdLendingCollection>() {
            public int callbackDelegateDeleteNonstrict(LdLendingCollection entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param lendingCollection Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLendingCollection lendingCollection) {
        helpDeleteNonstrictIgnoreDeletedInternally(lendingCollection, new InternalDeleteNonstrictIgnoreDeletedCallback<LdLendingCollection>() {
            public int callbackDelegateDeleteNonstrict(LdLendingCollection entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lendingCollectionList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdLendingCollection> lendingCollectionList) {
        assertObjectNotNull("lendingCollectionList", lendingCollectionList);
        return delegateInsertList(lendingCollectionList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lendingCollectionList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdLendingCollection> lendingCollectionList) {
        assertObjectNotNull("lendingCollectionList", lendingCollectionList);
        return delegateUpdateList(lendingCollectionList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lendingCollectionList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdLendingCollection> lendingCollectionList) {
        assertObjectNotNull("lendingCollectionList", lendingCollectionList);
        return delegateUpdateListNonstrict(lendingCollectionList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lendingCollectionList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdLendingCollection> lendingCollectionList) {
        assertObjectNotNull("lendingCollectionList", lendingCollectionList);
        return delegateDeleteList(lendingCollectionList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lendingCollectionList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdLendingCollection> lendingCollectionList) {
        assertObjectNotNull("lendingCollectionList", lendingCollectionList);
        return delegateDeleteListNonstrict(lendingCollectionList);
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
    protected int delegateSelectCount(LdLendingCollectionCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdLendingCollectionCB)cb); }
    protected List<LdLendingCollection> delegateSelectList(LdLendingCollectionCB cb) {
        return invoke(createSelectListCBCommand(cb, LdLendingCollection.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdLendingCollectionCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdLendingCollection e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdLendingCollection e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdLendingCollection e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdLendingCollection e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdLendingCollection e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdLendingCollection> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdLendingCollection> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdLendingCollection> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdLendingCollection> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdLendingCollection> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdLendingCollection..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdLendingCollection. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdLendingCollection, LdLendingCollectionDbm.LendingCollectionRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdLendingCollection, LdLendingCollectionDbm.LendingCollectionRelationTrace> request = new LdHierarchyBasicRequest<LdLendingCollection, LdLendingCollectionDbm.LendingCollectionRelationTrace>(LdLendingCollection.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdLendingCollection. (NotNull)
     * @return The list of LdLendingCollection. (NotNull)
     */
    public List<LdLendingCollection> arrangeHierarchy(LdHierarchyRequest<LdLendingCollection> request) {
        return new LdHierarchyArranger<LdLendingCollection>().arrangeHierarchy(request);
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
    protected LdLendingCollection downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdLendingCollection.class);
    }
}

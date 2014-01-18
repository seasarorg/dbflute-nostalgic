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
 * The behavior of COLLECTION_STATUS that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     COLLECTION_ID
 * 
 * [column]
 *     COLLECTION_ID, COLLECTION_STATUS_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION, COLLECTION_STATUS_LOOKUP
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     collection, collectionStatusLookup
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsCollectionStatusBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "COLLECTION_STATUS"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdCollectionStatusDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdCollectionStatusDbm getMyDBMeta() { return LdCollectionStatusDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdCollectionStatus newMyEntity() { return new LdCollectionStatus(); }
    public LdCollectionStatusCB newMyConditionBean() { return new LdCollectionStatusCB(); }

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
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdCollectionStatusCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdCollectionStatus selectEntity(final LdCollectionStatusCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdCollectionStatus, LdCollectionStatusCB>() {
            public List<LdCollectionStatus> callbackSelectList(LdCollectionStatusCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdCollectionStatus selectEntityWithDeletedCheck(final LdCollectionStatusCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdCollectionStatus, LdCollectionStatusCB>() {
            public List<LdCollectionStatus> callbackSelectList(LdCollectionStatusCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdCollectionStatus selectByPKValueWithDeletedCheck(Integer collectionId) {
        LdCollectionStatus entity = new LdCollectionStatus();
        entity.setCollectionId(collectionId);
        final LdCollectionStatusCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdCollectionStatus> selectList(LdCollectionStatusCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdCollectionStatus>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdCollectionStatus> selectPage(final LdCollectionStatusCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdCollectionStatus> invoker = new LdPagingInvoker<LdCollectionStatus>(getTableDbName());
        final LdPagingHandler<LdCollectionStatus> handler = new LdPagingHandler<LdCollectionStatus>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdCollectionStatus> paging() { return selectList(cb); }
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
     * collectionStatusBhv.scalarSelect(Date.class).max(new ScalarQuery(LdCollectionStatusCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdCollectionStatusCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdCollectionStatusCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdCollectionStatusCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdCollectionStatus. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdCollectionStatusCB cb, LdValueLabelSetupper<LdCollectionStatus> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'LdCollection'.
     * @param collectionStatusList The list of collectionStatus. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdCollection> pulloutCollection(List<LdCollectionStatus> collectionStatusList) {
        return helpPulloutInternally(collectionStatusList, new InternalPulloutCallback<LdCollectionStatus, LdCollection>() {
            public LdCollection callbackGetForeignEntity(LdCollectionStatus entity) { return entity.getCollection(); } });
    }
    /**
     * Pull out the list of foreign table 'LdCollectionStatusLookup'.
     * @param collectionStatusList The list of collectionStatus. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdCollectionStatusLookup> pulloutCollectionStatusLookup(List<LdCollectionStatus> collectionStatusList) {
        return helpPulloutInternally(collectionStatusList, new InternalPulloutCallback<LdCollectionStatus, LdCollectionStatusLookup>() {
            public LdCollectionStatusLookup callbackGetForeignEntity(LdCollectionStatus entity) { return entity.getCollectionStatusLookup(); } });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param collectionStatus The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdCollectionStatus collectionStatus) {
        assertEntityNotNull(collectionStatus);
        delegateInsert(collectionStatus);
    }

    @Override
    protected void doCreate(LdEntity collectionStatus) {
        insert((LdCollectionStatus)collectionStatus);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param collectionStatus The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdCollectionStatus collectionStatus) {
        helpUpdateInternally(collectionStatus, new InternalUpdateCallback<LdCollectionStatus>() {
            public int callbackDelegateUpdate(LdCollectionStatus entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdCollectionStatus)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param collectionStatus The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdCollectionStatus collectionStatus) {
        helpUpdateNonstrictInternally(collectionStatus, new InternalUpdateNonstrictCallback<LdCollectionStatus>() {
            public int callbackDelegateUpdateNonstrict(LdCollectionStatus entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdCollectionStatus)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param collectionStatus The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdCollectionStatus collectionStatus) {
        helpInsertOrUpdateInternally(collectionStatus, new InternalInsertOrUpdateCallback<LdCollectionStatus, LdCollectionStatusCB>() {
            public void callbackInsert(LdCollectionStatus entity) { insert(entity); }
            public void callbackUpdate(LdCollectionStatus entity) { update(entity); }
            public LdCollectionStatusCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdCollectionStatusCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity collectionStatus) {
        insertOrUpdate((LdCollectionStatus)collectionStatus);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param collectionStatus The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdCollectionStatus collectionStatus) {
        helpInsertOrUpdateInternally(collectionStatus, new InternalInsertOrUpdateNonstrictCallback<LdCollectionStatus>() {
            public void callbackInsert(LdCollectionStatus entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdCollectionStatus entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdCollectionStatus)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param collectionStatus The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdCollectionStatus collectionStatus) {
        helpDeleteInternally(collectionStatus, new InternalDeleteCallback<LdCollectionStatus>() {
            public int callbackDelegateDelete(LdCollectionStatus entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity collectionStatus) {
        delete((LdCollectionStatus)collectionStatus);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param collectionStatus Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdCollectionStatus collectionStatus) {
        helpDeleteNonstrictInternally(collectionStatus, new InternalDeleteNonstrictCallback<LdCollectionStatus>() {
            public int callbackDelegateDeleteNonstrict(LdCollectionStatus entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param collectionStatus Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdCollectionStatus collectionStatus) {
        helpDeleteNonstrictIgnoreDeletedInternally(collectionStatus, new InternalDeleteNonstrictIgnoreDeletedCallback<LdCollectionStatus>() {
            public int callbackDelegateDeleteNonstrict(LdCollectionStatus entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionStatusList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdCollectionStatus> collectionStatusList) {
        assertObjectNotNull("collectionStatusList", collectionStatusList);
        return delegateInsertList(collectionStatusList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionStatusList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdCollectionStatus> collectionStatusList) {
        assertObjectNotNull("collectionStatusList", collectionStatusList);
        return delegateUpdateList(collectionStatusList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionStatusList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdCollectionStatus> collectionStatusList) {
        assertObjectNotNull("collectionStatusList", collectionStatusList);
        return delegateUpdateListNonstrict(collectionStatusList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionStatusList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdCollectionStatus> collectionStatusList) {
        assertObjectNotNull("collectionStatusList", collectionStatusList);
        return delegateDeleteList(collectionStatusList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionStatusList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdCollectionStatus> collectionStatusList) {
        assertObjectNotNull("collectionStatusList", collectionStatusList);
        return delegateDeleteListNonstrict(collectionStatusList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Query update the several entities. {NoConcurrencyControl}
     * @param collectionStatus Entity. (NotNull) {PrimaryKeyNotRequired}
     * @param cb Condition-bean. (NotNull)
     * @return The updated count.
     */
    public int queryUpdate(LdCollectionStatus collectionStatus, LdCollectionStatusCB cb) {
        assertObjectNotNull("collectionStatus", collectionStatus); assertCBNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(collectionStatus);
        filterEntityOfUpdate(collectionStatus); assertEntityOfUpdate(collectionStatus);
        return invoke(createQueryUpdateEntityCBCommand(collectionStatus, cb));
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(LdCollectionStatusCB cb) {
        assertCBNotNull(cb);
        return invoke(createQueryDeleteCBCommand(cb));
    }
    
    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCount(LdCollectionStatusCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdCollectionStatusCB)cb); }
    protected List<LdCollectionStatus> delegateSelectList(LdCollectionStatusCB cb) {
        return invoke(createSelectListCBCommand(cb, LdCollectionStatus.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdCollectionStatusCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdCollectionStatus e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdCollectionStatus e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdCollectionStatus e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdCollectionStatus e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdCollectionStatus e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdCollectionStatus> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdCollectionStatus> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdCollectionStatus> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdCollectionStatus> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdCollectionStatus> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdCollectionStatus..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdCollectionStatus. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdCollectionStatus, LdCollectionStatusDbm.CollectionStatusRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdCollectionStatus, LdCollectionStatusDbm.CollectionStatusRelationTrace> request = new LdHierarchyBasicRequest<LdCollectionStatus, LdCollectionStatusDbm.CollectionStatusRelationTrace>(LdCollectionStatus.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdCollectionStatus. (NotNull)
     * @return The list of LdCollectionStatus. (NotNull)
     */
    public List<LdCollectionStatus> arrangeHierarchy(LdHierarchyRequest<LdCollectionStatus> request) {
        return new LdHierarchyArranger<LdCollectionStatus>().arrangeHierarchy(request);
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
    protected LdCollectionStatus downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdCollectionStatus.class);
    }
}

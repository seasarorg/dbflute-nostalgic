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
 * The behavior of BLACK_ACTION that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     BLACK_ACTION_ID
 * 
 * [column]
 *     BLACK_ACTION_ID, BLACK_LIST_ID, BLACK_ACTION_CODE, BLACK_LEVEL, ACTION_DATE, EVIDENCE_PHOTOGRAPH, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     BLACK_ACTION_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     BLACK_ACTION_LOOKUP, BLACK_LIST
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     blackActionLookup, blackList
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBlackActionBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BLACK_ACTION"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdBlackActionDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdBlackActionDbm getMyDBMeta() { return LdBlackActionDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdBlackAction newMyEntity() { return new LdBlackAction(); }
    public LdBlackActionCB newMyConditionBean() { return new LdBlackActionCB(); }

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
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdBlackActionCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdBlackAction selectEntity(final LdBlackActionCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdBlackAction, LdBlackActionCB>() {
            public List<LdBlackAction> callbackSelectList(LdBlackActionCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdBlackAction selectEntityWithDeletedCheck(final LdBlackActionCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdBlackAction, LdBlackActionCB>() {
            public List<LdBlackAction> callbackSelectList(LdBlackActionCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdBlackAction selectByPKValueWithDeletedCheck(Integer blackActionId) {
        LdBlackAction entity = new LdBlackAction();
        entity.setBlackActionId(blackActionId);
        final LdBlackActionCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdBlackAction> selectList(LdBlackActionCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdBlackAction>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdBlackAction> selectPage(final LdBlackActionCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdBlackAction> invoker = new LdPagingInvoker<LdBlackAction>(getTableDbName());
        final LdPagingHandler<LdBlackAction> handler = new LdPagingHandler<LdBlackAction>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdBlackAction> paging() { return selectList(cb); }
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
     * blackActionBhv.scalarSelect(Date.class).max(new ScalarQuery(LdBlackActionCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdBlackActionCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdBlackActionCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdBlackActionCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdBlackAction. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdBlackActionCB cb, LdValueLabelSetupper<LdBlackAction> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'LdBlackActionLookup'.
     * @param blackActionList The list of blackAction. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdBlackActionLookup> pulloutBlackActionLookup(List<LdBlackAction> blackActionList) {
        return helpPulloutInternally(blackActionList, new InternalPulloutCallback<LdBlackAction, LdBlackActionLookup>() {
            public LdBlackActionLookup callbackGetForeignEntity(LdBlackAction entity) { return entity.getBlackActionLookup(); } });
    }
    /**
     * Pull out the list of foreign table 'LdBlackList'.
     * @param blackActionList The list of blackAction. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdBlackList> pulloutBlackList(List<LdBlackAction> blackActionList) {
        return helpPulloutInternally(blackActionList, new InternalPulloutCallback<LdBlackAction, LdBlackList>() {
            public LdBlackList callbackGetForeignEntity(LdBlackAction entity) { return entity.getBlackList(); } });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param blackAction The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdBlackAction blackAction) {
        assertEntityNotNull(blackAction);
        delegateInsert(blackAction);
    }

    @Override
    protected void doCreate(LdEntity blackAction) {
        insert((LdBlackAction)blackAction);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param blackAction The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdBlackAction blackAction) {
        helpUpdateInternally(blackAction, new InternalUpdateCallback<LdBlackAction>() {
            public int callbackDelegateUpdate(LdBlackAction entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdBlackAction)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param blackAction The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdBlackAction blackAction) {
        helpUpdateNonstrictInternally(blackAction, new InternalUpdateNonstrictCallback<LdBlackAction>() {
            public int callbackDelegateUpdateNonstrict(LdBlackAction entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdBlackAction)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param blackAction The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdBlackAction blackAction) {
        helpInsertOrUpdateInternally(blackAction, new InternalInsertOrUpdateCallback<LdBlackAction, LdBlackActionCB>() {
            public void callbackInsert(LdBlackAction entity) { insert(entity); }
            public void callbackUpdate(LdBlackAction entity) { update(entity); }
            public LdBlackActionCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdBlackActionCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity blackAction) {
        insertOrUpdate((LdBlackAction)blackAction);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param blackAction The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdBlackAction blackAction) {
        helpInsertOrUpdateInternally(blackAction, new InternalInsertOrUpdateNonstrictCallback<LdBlackAction>() {
            public void callbackInsert(LdBlackAction entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdBlackAction entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdBlackAction)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param blackAction The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdBlackAction blackAction) {
        helpDeleteInternally(blackAction, new InternalDeleteCallback<LdBlackAction>() {
            public int callbackDelegateDelete(LdBlackAction entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity blackAction) {
        delete((LdBlackAction)blackAction);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param blackAction Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdBlackAction blackAction) {
        helpDeleteNonstrictInternally(blackAction, new InternalDeleteNonstrictCallback<LdBlackAction>() {
            public int callbackDelegateDeleteNonstrict(LdBlackAction entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param blackAction Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdBlackAction blackAction) {
        helpDeleteNonstrictIgnoreDeletedInternally(blackAction, new InternalDeleteNonstrictIgnoreDeletedCallback<LdBlackAction>() {
            public int callbackDelegateDeleteNonstrict(LdBlackAction entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackActionList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdBlackAction> blackActionList) {
        assertObjectNotNull("blackActionList", blackActionList);
        return delegateInsertList(blackActionList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackActionList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdBlackAction> blackActionList) {
        assertObjectNotNull("blackActionList", blackActionList);
        return delegateUpdateList(blackActionList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackActionList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdBlackAction> blackActionList) {
        assertObjectNotNull("blackActionList", blackActionList);
        return delegateUpdateListNonstrict(blackActionList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackActionList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdBlackAction> blackActionList) {
        assertObjectNotNull("blackActionList", blackActionList);
        return delegateDeleteList(blackActionList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackActionList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdBlackAction> blackActionList) {
        assertObjectNotNull("blackActionList", blackActionList);
        return delegateDeleteListNonstrict(blackActionList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Query update the several entities. {NoConcurrencyControl}
     * @param blackAction Entity. (NotNull) {PrimaryKeyNotRequired}
     * @param cb Condition-bean. (NotNull)
     * @return The updated count.
     */
    public int queryUpdate(LdBlackAction blackAction, LdBlackActionCB cb) {
        assertObjectNotNull("blackAction", blackAction); assertCBNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(blackAction);
        filterEntityOfUpdate(blackAction); assertEntityOfUpdate(blackAction);
        return invoke(createQueryUpdateEntityCBCommand(blackAction, cb));
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(LdBlackActionCB cb) {
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
    protected int delegateSelectCount(LdBlackActionCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdBlackActionCB)cb); }
    protected List<LdBlackAction> delegateSelectList(LdBlackActionCB cb) {
        return invoke(createSelectListCBCommand(cb, LdBlackAction.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdBlackActionCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdBlackAction e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdBlackAction e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdBlackAction e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdBlackAction e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdBlackAction e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdBlackAction> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdBlackAction> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdBlackAction> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdBlackAction> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdBlackAction> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(LdEntity targetEntity) {
        super.filterEntityOfInsert(targetEntity);
        LdBlackAction entity = downcast(targetEntity);
        entity.setActionDate(dbflute.ldb.allcommon.LdAccessContext.getAccessTimestampOnThread());
    }
    @Override
    protected void filterEntityOfUpdate(LdEntity targetEntity) {
        super.filterEntityOfUpdate(targetEntity);
        LdBlackAction entity = downcast(targetEntity);
        entity.setActionDate(dbflute.ldb.allcommon.LdAccessContext.getAccessTimestampOnThread());
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdBlackAction..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdBlackAction. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdBlackAction, LdBlackActionDbm.BlackActionRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdBlackAction, LdBlackActionDbm.BlackActionRelationTrace> request = new LdHierarchyBasicRequest<LdBlackAction, LdBlackActionDbm.BlackActionRelationTrace>(LdBlackAction.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdBlackAction. (NotNull)
     * @return The list of LdBlackAction. (NotNull)
     */
    public List<LdBlackAction> arrangeHierarchy(LdHierarchyRequest<LdBlackAction> request) {
        return new LdHierarchyArranger<LdBlackAction>().arrangeHierarchy(request);
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
    protected LdBlackAction downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdBlackAction.class);
    }
}

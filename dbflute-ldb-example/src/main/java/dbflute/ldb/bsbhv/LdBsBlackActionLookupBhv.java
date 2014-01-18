/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsbhv;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.*;
import dbflute.ldb.allcommon.bhv.load.LdLoadReferrerOption;
import dbflute.ldb.allcommon.bhv.setup.LdConditionBeanSetupper;
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
import dbflute.ldb.exbhv.*;
import dbflute.ldb.exentity.*;
import dbflute.ldb.bsentity.dbmeta.*;
import dbflute.ldb.cbean.*;

/**
 * The behavior of BLACK_ACTION_LOOKUP that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     BLACK_ACTION_CODE
 * 
 * [column]
 *     BLACK_ACTION_CODE, BLACK_ACTION_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     
 * 
 * [referrer-table]
 *     BLACK_ACTION
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     blackActionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBlackActionLookupBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BLACK_ACTION_LOOKUP"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdBlackActionLookupDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdBlackActionLookupDbm getMyDBMeta() { return LdBlackActionLookupDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdBlackActionLookup newMyEntity() { return new LdBlackActionLookup(); }
    public LdBlackActionLookupCB newMyConditionBean() { return new LdBlackActionLookupCB(); }

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
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdBlackActionLookupCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdBlackActionLookup selectEntity(final LdBlackActionLookupCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdBlackActionLookup, LdBlackActionLookupCB>() {
            public List<LdBlackActionLookup> callbackSelectList(LdBlackActionLookupCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdBlackActionLookup selectEntityWithDeletedCheck(final LdBlackActionLookupCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdBlackActionLookup, LdBlackActionLookupCB>() {
            public List<LdBlackActionLookup> callbackSelectList(LdBlackActionLookupCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdBlackActionLookup selectByPKValueWithDeletedCheck(String blackActionCode) {
        LdBlackActionLookup entity = new LdBlackActionLookup();
        entity.setBlackActionCode(blackActionCode);
        final LdBlackActionLookupCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdBlackActionLookup> selectList(LdBlackActionLookupCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdBlackActionLookup>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdBlackActionLookup> selectPage(final LdBlackActionLookupCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdBlackActionLookup> invoker = new LdPagingInvoker<LdBlackActionLookup>(getTableDbName());
        final LdPagingHandler<LdBlackActionLookup> handler = new LdPagingHandler<LdBlackActionLookup>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdBlackActionLookup> paging() { return selectList(cb); }
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
     * blackActionLookupBhv.scalarSelect(Date.class).max(new ScalarQuery(LdBlackActionLookupCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdBlackActionLookupCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdBlackActionLookupCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdBlackActionLookupCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdBlackActionLookup. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdBlackActionLookupCB cb, LdValueLabelSetupper<LdBlackActionLookup> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of blackActionList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setBlackActionCode_InScope(pkList);
     * cb.query().addOrderBy_BlackActionCode_Asc();
     * </pre>
     * @param blackActionLookupList The entity list of blackActionLookup. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadBlackActionList(List<LdBlackActionLookup> blackActionLookupList, LdConditionBeanSetupper<LdBlackActionCB> conditionBeanSetupper) {
        assertObjectNotNull("blackActionLookupList<LdBlackActionLookup>", blackActionLookupList);
        assertObjectNotNull("conditionBeanSetupper<LdBlackActionCB>", conditionBeanSetupper);
        if (blackActionLookupList.isEmpty()) { return; }
        loadBlackActionList(blackActionLookupList, new LdLoadReferrerOption<LdBlackActionCB, LdBlackAction>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param blackActionLookupList The entity list of blackActionLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBlackActionList(List<LdBlackActionLookup> blackActionLookupList, LdLoadReferrerOption<LdBlackActionCB, LdBlackAction> loadReferrerOption) {
        assertObjectNotNull("blackActionLookupList<LdBlackActionLookup>", blackActionLookupList);
        assertObjectNotNull("loadReferrerOption<LdBlackAction, LdBlackActionCB>", loadReferrerOption);
        if (blackActionLookupList.isEmpty()) { return; }
        final LdBlackActionBhv referrerBhv = xgetBSFLR().select(LdBlackActionBhv.class);
        helpLoadReferrerInternally(blackActionLookupList, loadReferrerOption, new InternalLoadReferrerCallback<LdBlackActionLookup, String, LdBlackActionCB, LdBlackAction>() {
            public String callbackBase_getPrimaryKeyValue(LdBlackActionLookup entity) { return entity.getBlackActionCode(); }
            public void callbackBase_setReferrerList(LdBlackActionLookup entity, List<LdBlackAction> referrerList) { entity.setBlackActionList(referrerList); }
            public LdBlackActionCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(LdBlackActionCB cb, List<String> pkList) { cb.query().setBlackActionCode_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(LdBlackActionCB cb) { cb.query().addOrderBy_BlackActionCode_Asc(); }
            public List<LdBlackAction> callbackReferrer_selectList(LdBlackActionCB cb) { return referrerBhv.selectList(cb); }
            public String callbackReferrer_getForeignKeyValue(LdBlackAction entity) { return entity.getBlackActionCode(); }
            public void callbackReferrer_setForeignEntity(LdBlackAction referrerEntity, LdBlackActionLookup baseEntity) { referrerEntity.setBlackActionLookup(baseEntity); }
        } );
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
  
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param blackActionLookup The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdBlackActionLookup blackActionLookup) {
        assertEntityNotNull(blackActionLookup);
        delegateInsert(blackActionLookup);
    }

    @Override
    protected void doCreate(LdEntity blackActionLookup) {
        insert((LdBlackActionLookup)blackActionLookup);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param blackActionLookup The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdBlackActionLookup blackActionLookup) {
        helpUpdateInternally(blackActionLookup, new InternalUpdateCallback<LdBlackActionLookup>() {
            public int callbackDelegateUpdate(LdBlackActionLookup entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdBlackActionLookup)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param blackActionLookup The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdBlackActionLookup blackActionLookup) {
        helpUpdateNonstrictInternally(blackActionLookup, new InternalUpdateNonstrictCallback<LdBlackActionLookup>() {
            public int callbackDelegateUpdateNonstrict(LdBlackActionLookup entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdBlackActionLookup)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param blackActionLookup The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdBlackActionLookup blackActionLookup) {
        helpInsertOrUpdateInternally(blackActionLookup, new InternalInsertOrUpdateCallback<LdBlackActionLookup, LdBlackActionLookupCB>() {
            public void callbackInsert(LdBlackActionLookup entity) { insert(entity); }
            public void callbackUpdate(LdBlackActionLookup entity) { update(entity); }
            public LdBlackActionLookupCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdBlackActionLookupCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity blackActionLookup) {
        insertOrUpdate((LdBlackActionLookup)blackActionLookup);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param blackActionLookup The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdBlackActionLookup blackActionLookup) {
        helpInsertOrUpdateInternally(blackActionLookup, new InternalInsertOrUpdateNonstrictCallback<LdBlackActionLookup>() {
            public void callbackInsert(LdBlackActionLookup entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdBlackActionLookup entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdBlackActionLookup)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param blackActionLookup The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdBlackActionLookup blackActionLookup) {
        helpDeleteInternally(blackActionLookup, new InternalDeleteCallback<LdBlackActionLookup>() {
            public int callbackDelegateDelete(LdBlackActionLookup entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity blackActionLookup) {
        delete((LdBlackActionLookup)blackActionLookup);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param blackActionLookup Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdBlackActionLookup blackActionLookup) {
        helpDeleteNonstrictInternally(blackActionLookup, new InternalDeleteNonstrictCallback<LdBlackActionLookup>() {
            public int callbackDelegateDeleteNonstrict(LdBlackActionLookup entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param blackActionLookup Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdBlackActionLookup blackActionLookup) {
        helpDeleteNonstrictIgnoreDeletedInternally(blackActionLookup, new InternalDeleteNonstrictIgnoreDeletedCallback<LdBlackActionLookup>() {
            public int callbackDelegateDeleteNonstrict(LdBlackActionLookup entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackActionLookupList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdBlackActionLookup> blackActionLookupList) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        return delegateInsertList(blackActionLookupList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackActionLookupList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdBlackActionLookup> blackActionLookupList) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        return delegateUpdateList(blackActionLookupList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackActionLookupList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdBlackActionLookup> blackActionLookupList) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        return delegateUpdateListNonstrict(blackActionLookupList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackActionLookupList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdBlackActionLookup> blackActionLookupList) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        return delegateDeleteList(blackActionLookupList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackActionLookupList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdBlackActionLookup> blackActionLookupList) {
        assertObjectNotNull("blackActionLookupList", blackActionLookupList);
        return delegateDeleteListNonstrict(blackActionLookupList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Query update the several entities. {NoConcurrencyControl}
     * @param blackActionLookup Entity. (NotNull) {PrimaryKeyNotRequired}
     * @param cb Condition-bean. (NotNull)
     * @return The updated count.
     */
    public int queryUpdate(LdBlackActionLookup blackActionLookup, LdBlackActionLookupCB cb) {
        assertObjectNotNull("blackActionLookup", blackActionLookup); assertCBNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(blackActionLookup);
        filterEntityOfUpdate(blackActionLookup); assertEntityOfUpdate(blackActionLookup);
        return invoke(createQueryUpdateEntityCBCommand(blackActionLookup, cb));
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(LdBlackActionLookupCB cb) {
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
    protected int delegateSelectCount(LdBlackActionLookupCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdBlackActionLookupCB)cb); }
    protected List<LdBlackActionLookup> delegateSelectList(LdBlackActionLookupCB cb) {
        return invoke(createSelectListCBCommand(cb, LdBlackActionLookup.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdBlackActionLookupCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdBlackActionLookup e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdBlackActionLookup e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdBlackActionLookup e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdBlackActionLookup e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdBlackActionLookup e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdBlackActionLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdBlackActionLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdBlackActionLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdBlackActionLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdBlackActionLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdBlackActionLookup..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdBlackActionLookup. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdBlackActionLookup, LdBlackActionLookupDbm.BlackActionLookupRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdBlackActionLookup, LdBlackActionLookupDbm.BlackActionLookupRelationTrace> request = new LdHierarchyBasicRequest<LdBlackActionLookup, LdBlackActionLookupDbm.BlackActionLookupRelationTrace>(LdBlackActionLookup.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdBlackActionLookup. (NotNull)
     * @return The list of LdBlackActionLookup. (NotNull)
     */
    public List<LdBlackActionLookup> arrangeHierarchy(LdHierarchyRequest<LdBlackActionLookup> request) {
        return new LdHierarchyArranger<LdBlackActionLookup>().arrangeHierarchy(request);
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
    protected LdBlackActionLookup downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdBlackActionLookup.class);
    }
}

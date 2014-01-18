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
 * The behavior of BLACK_LIST that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     BLACK_LIST_ID
 * 
 * [column]
 *     BLACK_LIST_ID, LB_USER_ID, BLACK_RANK, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     BLACK_LIST_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     LB_USER
 * 
 * [referrer-table]
 *     BLACK_ACTION
 * 
 * [foreign-property]
 *     lbUser
 * 
 * [referrer-property]
 *     blackActionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBlackListBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BLACK_LIST"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdBlackListDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdBlackListDbm getMyDBMeta() { return LdBlackListDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdBlackList newMyEntity() { return new LdBlackList(); }
    public LdBlackListCB newMyConditionBean() { return new LdBlackListCB(); }

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
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdBlackListCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdBlackList selectEntity(final LdBlackListCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdBlackList, LdBlackListCB>() {
            public List<LdBlackList> callbackSelectList(LdBlackListCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdBlackList selectEntityWithDeletedCheck(final LdBlackListCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdBlackList, LdBlackListCB>() {
            public List<LdBlackList> callbackSelectList(LdBlackListCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdBlackList selectByPKValueWithDeletedCheck(Integer blackListId) {
        LdBlackList entity = new LdBlackList();
        entity.setBlackListId(blackListId);
        final LdBlackListCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdBlackList> selectList(LdBlackListCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdBlackList>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdBlackList> selectPage(final LdBlackListCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdBlackList> invoker = new LdPagingInvoker<LdBlackList>(getTableDbName());
        final LdPagingHandler<LdBlackList> handler = new LdPagingHandler<LdBlackList>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdBlackList> paging() { return selectList(cb); }
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
     * blackListBhv.scalarSelect(Date.class).max(new ScalarQuery(LdBlackListCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdBlackListCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdBlackListCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdBlackListCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdBlackList. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdBlackListCB cb, LdValueLabelSetupper<LdBlackList> valueLabelSetupper) {
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
     * cb.query().setBlackListId_InScope(pkList);
     * cb.query().addOrderBy_BlackListId_Asc();
     * </pre>
     * @param blackListList The entity list of blackList. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadBlackActionList(List<LdBlackList> blackListList, LdConditionBeanSetupper<LdBlackActionCB> conditionBeanSetupper) {
        assertObjectNotNull("blackListList<LdBlackList>", blackListList);
        assertObjectNotNull("conditionBeanSetupper<LdBlackActionCB>", conditionBeanSetupper);
        if (blackListList.isEmpty()) { return; }
        loadBlackActionList(blackListList, new LdLoadReferrerOption<LdBlackActionCB, LdBlackAction>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param blackListList The entity list of blackList. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBlackActionList(List<LdBlackList> blackListList, LdLoadReferrerOption<LdBlackActionCB, LdBlackAction> loadReferrerOption) {
        assertObjectNotNull("blackListList<LdBlackList>", blackListList);
        assertObjectNotNull("loadReferrerOption<LdBlackAction, LdBlackActionCB>", loadReferrerOption);
        if (blackListList.isEmpty()) { return; }
        final LdBlackActionBhv referrerBhv = xgetBSFLR().select(LdBlackActionBhv.class);
        helpLoadReferrerInternally(blackListList, loadReferrerOption, new InternalLoadReferrerCallback<LdBlackList, Integer, LdBlackActionCB, LdBlackAction>() {
            public Integer callbackBase_getPrimaryKeyValue(LdBlackList entity) { return entity.getBlackListId(); }
            public void callbackBase_setReferrerList(LdBlackList entity, List<LdBlackAction> referrerList) { entity.setBlackActionList(referrerList); }
            public LdBlackActionCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(LdBlackActionCB cb, List<Integer> pkList) { cb.query().setBlackListId_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(LdBlackActionCB cb) { cb.query().addOrderBy_BlackListId_Asc(); }
            public List<LdBlackAction> callbackReferrer_selectList(LdBlackActionCB cb) { return referrerBhv.selectList(cb); }
            public Integer callbackReferrer_getForeignKeyValue(LdBlackAction entity) { return entity.getBlackListId(); }
            public void callbackReferrer_setForeignEntity(LdBlackAction referrerEntity, LdBlackList baseEntity) { referrerEntity.setBlackList(baseEntity); }
        } );
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'LdLbUser'.
     * @param blackListList The list of blackList. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdLbUser> pulloutLbUser(List<LdBlackList> blackListList) {
        return helpPulloutInternally(blackListList, new InternalPulloutCallback<LdBlackList, LdLbUser>() {
            public LdLbUser callbackGetForeignEntity(LdBlackList entity) { return entity.getLbUser(); } });
    }
  
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param blackList The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdBlackList blackList) {
        assertEntityNotNull(blackList);
        delegateInsert(blackList);
    }

    @Override
    protected void doCreate(LdEntity blackList) {
        insert((LdBlackList)blackList);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param blackList The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdBlackList blackList) {
        helpUpdateInternally(blackList, new InternalUpdateCallback<LdBlackList>() {
            public int callbackDelegateUpdate(LdBlackList entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdBlackList)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param blackList The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdBlackList blackList) {
        helpUpdateNonstrictInternally(blackList, new InternalUpdateNonstrictCallback<LdBlackList>() {
            public int callbackDelegateUpdateNonstrict(LdBlackList entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdBlackList)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param blackList The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdBlackList blackList) {
        helpInsertOrUpdateInternally(blackList, new InternalInsertOrUpdateCallback<LdBlackList, LdBlackListCB>() {
            public void callbackInsert(LdBlackList entity) { insert(entity); }
            public void callbackUpdate(LdBlackList entity) { update(entity); }
            public LdBlackListCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdBlackListCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity blackList) {
        insertOrUpdate((LdBlackList)blackList);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param blackList The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdBlackList blackList) {
        helpInsertOrUpdateInternally(blackList, new InternalInsertOrUpdateNonstrictCallback<LdBlackList>() {
            public void callbackInsert(LdBlackList entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdBlackList entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdBlackList)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param blackList The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdBlackList blackList) {
        helpDeleteInternally(blackList, new InternalDeleteCallback<LdBlackList>() {
            public int callbackDelegateDelete(LdBlackList entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity blackList) {
        delete((LdBlackList)blackList);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param blackList Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdBlackList blackList) {
        helpDeleteNonstrictInternally(blackList, new InternalDeleteNonstrictCallback<LdBlackList>() {
            public int callbackDelegateDeleteNonstrict(LdBlackList entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param blackList Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdBlackList blackList) {
        helpDeleteNonstrictIgnoreDeletedInternally(blackList, new InternalDeleteNonstrictIgnoreDeletedCallback<LdBlackList>() {
            public int callbackDelegateDeleteNonstrict(LdBlackList entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackListList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdBlackList> blackListList) {
        assertObjectNotNull("blackListList", blackListList);
        return delegateInsertList(blackListList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackListList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdBlackList> blackListList) {
        assertObjectNotNull("blackListList", blackListList);
        return delegateUpdateList(blackListList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackListList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdBlackList> blackListList) {
        assertObjectNotNull("blackListList", blackListList);
        return delegateUpdateListNonstrict(blackListList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackListList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdBlackList> blackListList) {
        assertObjectNotNull("blackListList", blackListList);
        return delegateDeleteList(blackListList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param blackListList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdBlackList> blackListList) {
        assertObjectNotNull("blackListList", blackListList);
        return delegateDeleteListNonstrict(blackListList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Query update the several entities. {NoConcurrencyControl}
     * @param blackList Entity. (NotNull) {PrimaryKeyNotRequired}
     * @param cb Condition-bean. (NotNull)
     * @return The updated count.
     */
    public int queryUpdate(LdBlackList blackList, LdBlackListCB cb) {
        assertObjectNotNull("blackList", blackList); assertCBNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(blackList);
        filterEntityOfUpdate(blackList); assertEntityOfUpdate(blackList);
        return invoke(createQueryUpdateEntityCBCommand(blackList, cb));
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(LdBlackListCB cb) {
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
    protected int delegateSelectCount(LdBlackListCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdBlackListCB)cb); }
    protected List<LdBlackList> delegateSelectList(LdBlackListCB cb) {
        return invoke(createSelectListCBCommand(cb, LdBlackList.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdBlackListCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdBlackList e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdBlackList e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdBlackList e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdBlackList e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdBlackList e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdBlackList> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdBlackList> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdBlackList> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdBlackList> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdBlackList> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdBlackList..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdBlackList. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdBlackList, LdBlackListDbm.BlackListRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdBlackList, LdBlackListDbm.BlackListRelationTrace> request = new LdHierarchyBasicRequest<LdBlackList, LdBlackListDbm.BlackListRelationTrace>(LdBlackList.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdBlackList. (NotNull)
     * @return The list of LdBlackList. (NotNull)
     */
    public List<LdBlackList> arrangeHierarchy(LdHierarchyRequest<LdBlackList> request) {
        return new LdHierarchyArranger<LdBlackList>().arrangeHierarchy(request);
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
    protected LdBlackList downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdBlackList.class);
    }
}

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
 * The behavior of LB_USER that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     LB_USER_ID
 * 
 * [column]
 *     LB_USER_ID, LB_USER_NAME, USER_PASSWORD, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     LB_USER_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     BLACK_LIST(AsOne)
 * 
 * [referrer-table]
 *     LIBRARY_USER, BLACK_LIST
 * 
 * [foreign-property]
 *     blackListAsOne
 * 
 * [referrer-property]
 *     libraryUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLbUserBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "LB_USER"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdLbUserDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLbUserDbm getMyDBMeta() { return LdLbUserDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdLbUser newMyEntity() { return new LdLbUser(); }
    public LdLbUserCB newMyConditionBean() { return new LdLbUserCB(); }

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
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdLbUserCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLbUser selectEntity(final LdLbUserCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdLbUser, LdLbUserCB>() {
            public List<LdLbUser> callbackSelectList(LdLbUserCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLbUser selectEntityWithDeletedCheck(final LdLbUserCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdLbUser, LdLbUserCB>() {
            public List<LdLbUser> callbackSelectList(LdLbUserCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLbUser selectByPKValueWithDeletedCheck(Integer lbUserId) {
        LdLbUser entity = new LdLbUser();
        entity.setLbUserId(lbUserId);
        final LdLbUserCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdLbUser> selectList(LdLbUserCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdLbUser>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdLbUser> selectPage(final LdLbUserCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdLbUser> invoker = new LdPagingInvoker<LdLbUser>(getTableDbName());
        final LdPagingHandler<LdLbUser> handler = new LdPagingHandler<LdLbUser>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdLbUser> paging() { return selectList(cb); }
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
     * lbUserBhv.scalarSelect(Date.class).max(new ScalarQuery(LdLbUserCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdLbUserCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdLbUserCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdLbUserCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdLbUser. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdLbUserCB cb, LdValueLabelSetupper<LdLbUser> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of libraryUserList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setLbUserId_InScope(pkList);
     * cb.query().addOrderBy_LbUserId_Asc();
     * </pre>
     * @param lbUserList The entity list of lbUser. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadLibraryUserList(List<LdLbUser> lbUserList, LdConditionBeanSetupper<LdLibraryUserCB> conditionBeanSetupper) {
        assertObjectNotNull("lbUserList<LdLbUser>", lbUserList);
        assertObjectNotNull("conditionBeanSetupper<LdLibraryUserCB>", conditionBeanSetupper);
        if (lbUserList.isEmpty()) { return; }
        loadLibraryUserList(lbUserList, new LdLoadReferrerOption<LdLibraryUserCB, LdLibraryUser>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param lbUserList The entity list of lbUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLibraryUserList(List<LdLbUser> lbUserList, LdLoadReferrerOption<LdLibraryUserCB, LdLibraryUser> loadReferrerOption) {
        assertObjectNotNull("lbUserList<LdLbUser>", lbUserList);
        assertObjectNotNull("loadReferrerOption<LdLibraryUser, LdLibraryUserCB>", loadReferrerOption);
        if (lbUserList.isEmpty()) { return; }
        final LdLibraryUserBhv referrerBhv = xgetBSFLR().select(LdLibraryUserBhv.class);
        helpLoadReferrerInternally(lbUserList, loadReferrerOption, new InternalLoadReferrerCallback<LdLbUser, Integer, LdLibraryUserCB, LdLibraryUser>() {
            public Integer callbackBase_getPrimaryKeyValue(LdLbUser entity) { return entity.getLbUserId(); }
            public void callbackBase_setReferrerList(LdLbUser entity, List<LdLibraryUser> referrerList) { entity.setLibraryUserList(referrerList); }
            public LdLibraryUserCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(LdLibraryUserCB cb, List<Integer> pkList) { cb.query().setLbUserId_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(LdLibraryUserCB cb) { cb.query().addOrderBy_LbUserId_Asc(); }
            public List<LdLibraryUser> callbackReferrer_selectList(LdLibraryUserCB cb) { return referrerBhv.selectList(cb); }
            public Integer callbackReferrer_getForeignKeyValue(LdLibraryUser entity) { return entity.getLbUserId(); }
            public void callbackReferrer_setForeignEntity(LdLibraryUser referrerEntity, LdLbUser baseEntity) { referrerEntity.setLbUser(baseEntity); }
        } );
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
      /**
     * Pull out the list of referrer-as-one table 'LdBlackList'.
     * @param lbUserList The list of lbUser. (NotNull)
     * @return The list of referrer-as-one table. (NotNull)
     */
    public List<LdBlackList> pulloutBlackListAsOne(List<LdLbUser> lbUserList) {
        return helpPulloutInternally(lbUserList, new InternalPulloutCallback<LdLbUser, LdBlackList>() {
            public LdBlackList callbackGetForeignEntity(LdLbUser entity) { return entity.getBlackListAsOne(); } });
    }
    
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param lbUser The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdLbUser lbUser) {
        assertEntityNotNull(lbUser);
        delegateInsert(lbUser);
    }

    @Override
    protected void doCreate(LdEntity lbUser) {
        insert((LdLbUser)lbUser);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param lbUser The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdLbUser lbUser) {
        helpUpdateInternally(lbUser, new InternalUpdateCallback<LdLbUser>() {
            public int callbackDelegateUpdate(LdLbUser entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdLbUser)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param lbUser The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdLbUser lbUser) {
        helpUpdateNonstrictInternally(lbUser, new InternalUpdateNonstrictCallback<LdLbUser>() {
            public int callbackDelegateUpdateNonstrict(LdLbUser entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdLbUser)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param lbUser The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdLbUser lbUser) {
        helpInsertOrUpdateInternally(lbUser, new InternalInsertOrUpdateCallback<LdLbUser, LdLbUserCB>() {
            public void callbackInsert(LdLbUser entity) { insert(entity); }
            public void callbackUpdate(LdLbUser entity) { update(entity); }
            public LdLbUserCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdLbUserCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity lbUser) {
        insertOrUpdate((LdLbUser)lbUser);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param lbUser The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdLbUser lbUser) {
        helpInsertOrUpdateInternally(lbUser, new InternalInsertOrUpdateNonstrictCallback<LdLbUser>() {
            public void callbackInsert(LdLbUser entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdLbUser entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdLbUser)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param lbUser The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLbUser lbUser) {
        helpDeleteInternally(lbUser, new InternalDeleteCallback<LdLbUser>() {
            public int callbackDelegateDelete(LdLbUser entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity lbUser) {
        delete((LdLbUser)lbUser);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param lbUser Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLbUser lbUser) {
        helpDeleteNonstrictInternally(lbUser, new InternalDeleteNonstrictCallback<LdLbUser>() {
            public int callbackDelegateDeleteNonstrict(LdLbUser entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param lbUser Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLbUser lbUser) {
        helpDeleteNonstrictIgnoreDeletedInternally(lbUser, new InternalDeleteNonstrictIgnoreDeletedCallback<LdLbUser>() {
            public int callbackDelegateDeleteNonstrict(LdLbUser entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lbUserList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdLbUser> lbUserList) {
        assertObjectNotNull("lbUserList", lbUserList);
        return delegateInsertList(lbUserList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lbUserList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdLbUser> lbUserList) {
        assertObjectNotNull("lbUserList", lbUserList);
        return delegateUpdateList(lbUserList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lbUserList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdLbUser> lbUserList) {
        assertObjectNotNull("lbUserList", lbUserList);
        return delegateUpdateListNonstrict(lbUserList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lbUserList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdLbUser> lbUserList) {
        assertObjectNotNull("lbUserList", lbUserList);
        return delegateDeleteList(lbUserList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lbUserList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdLbUser> lbUserList) {
        assertObjectNotNull("lbUserList", lbUserList);
        return delegateDeleteListNonstrict(lbUserList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Query update the several entities. {NoConcurrencyControl}
     * @param lbUser Entity. (NotNull) {PrimaryKeyNotRequired}
     * @param cb Condition-bean. (NotNull)
     * @return The updated count.
     */
    public int queryUpdate(LdLbUser lbUser, LdLbUserCB cb) {
        assertObjectNotNull("lbUser", lbUser); assertCBNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(lbUser);
        filterEntityOfUpdate(lbUser); assertEntityOfUpdate(lbUser);
        return invoke(createQueryUpdateEntityCBCommand(lbUser, cb));
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(LdLbUserCB cb) {
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
    protected int delegateSelectCount(LdLbUserCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdLbUserCB)cb); }
    protected List<LdLbUser> delegateSelectList(LdLbUserCB cb) {
        return invoke(createSelectListCBCommand(cb, LdLbUser.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdLbUserCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdLbUser e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdLbUser e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdLbUser e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdLbUser e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdLbUser e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdLbUser> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdLbUser> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdLbUser> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdLbUser> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdLbUser> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdLbUser..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdLbUser. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdLbUser, LdLbUserDbm.LbUserRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdLbUser, LdLbUserDbm.LbUserRelationTrace> request = new LdHierarchyBasicRequest<LdLbUser, LdLbUserDbm.LbUserRelationTrace>(LdLbUser.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdLbUser. (NotNull)
     * @return The list of LdLbUser. (NotNull)
     */
    public List<LdLbUser> arrangeHierarchy(LdHierarchyRequest<LdLbUser> request) {
        return new LdHierarchyArranger<LdLbUser>().arrangeHierarchy(request);
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
    protected LdLbUser downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdLbUser.class);
    }
}

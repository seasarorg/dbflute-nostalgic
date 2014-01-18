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
 * The behavior of LENDING that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE
 * 
 * [column]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LIBRARY_USER
 * 
 * [referrer-table]
 *     LENDING_COLLECTION
 * 
 * [foreign-property]
 *     libraryUser
 * 
 * [referrer-property]
 *     lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLendingBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "LENDING"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdLendingDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLendingDbm getMyDBMeta() { return LdLendingDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdLending newMyEntity() { return new LdLending(); }
    public LdLendingCB newMyConditionBean() { return new LdLendingCB(); }

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
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdLendingCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLending selectEntity(final LdLendingCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdLending, LdLendingCB>() {
            public List<LdLending> callbackSelectList(LdLendingCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLending selectEntityWithDeletedCheck(final LdLendingCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdLending, LdLendingCB>() {
            public List<LdLending> callbackSelectList(LdLendingCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLending selectByPKValueWithDeletedCheck(Integer libraryId, Integer lbUserId, java.sql.Timestamp lendingDate) {
        LdLending entity = new LdLending();
        entity.setLibraryId(libraryId);entity.setLbUserId(lbUserId);entity.setLendingDate(lendingDate);
        final LdLendingCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdLending> selectList(LdLendingCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdLending>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdLending. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdLending> selectPage(final LdLendingCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdLending> invoker = new LdPagingInvoker<LdLending>(getTableDbName());
        final LdPagingHandler<LdLending> handler = new LdPagingHandler<LdLending>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdLending> paging() { return selectList(cb); }
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
     * lendingBhv.scalarSelect(Date.class).max(new ScalarQuery(LdLendingCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdLendingCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdLendingCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdLendingCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdLending. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdLendingCB cb, LdValueLabelSetupper<LdLending> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'LdLibraryUser'.
     * @param lendingList The list of lending. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdLibraryUser> pulloutLibraryUser(List<LdLending> lendingList) {
        return helpPulloutInternally(lendingList, new InternalPulloutCallback<LdLending, LdLibraryUser>() {
            public LdLibraryUser callbackGetForeignEntity(LdLending entity) { return entity.getLibraryUser(); } });
    }
  
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param lending The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdLending lending) {
        assertEntityNotNull(lending);
        delegateInsert(lending);
    }

    @Override
    protected void doCreate(LdEntity lending) {
        insert((LdLending)lending);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param lending The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdLending lending) {
        helpUpdateInternally(lending, new InternalUpdateCallback<LdLending>() {
            public int callbackDelegateUpdate(LdLending entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdLending)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param lending The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdLending lending) {
        helpUpdateNonstrictInternally(lending, new InternalUpdateNonstrictCallback<LdLending>() {
            public int callbackDelegateUpdateNonstrict(LdLending entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdLending)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param lending The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdLending lending) {
        helpInsertOrUpdateInternally(lending, new InternalInsertOrUpdateCallback<LdLending, LdLendingCB>() {
            public void callbackInsert(LdLending entity) { insert(entity); }
            public void callbackUpdate(LdLending entity) { update(entity); }
            public LdLendingCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdLendingCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity lending) {
        insertOrUpdate((LdLending)lending);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param lending The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdLending lending) {
        helpInsertOrUpdateInternally(lending, new InternalInsertOrUpdateNonstrictCallback<LdLending>() {
            public void callbackInsert(LdLending entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdLending entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdLending)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param lending The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLending lending) {
        helpDeleteInternally(lending, new InternalDeleteCallback<LdLending>() {
            public int callbackDelegateDelete(LdLending entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity lending) {
        delete((LdLending)lending);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param lending Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLending lending) {
        helpDeleteNonstrictInternally(lending, new InternalDeleteNonstrictCallback<LdLending>() {
            public int callbackDelegateDeleteNonstrict(LdLending entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param lending Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLending lending) {
        helpDeleteNonstrictIgnoreDeletedInternally(lending, new InternalDeleteNonstrictIgnoreDeletedCallback<LdLending>() {
            public int callbackDelegateDeleteNonstrict(LdLending entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lendingList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdLending> lendingList) {
        assertObjectNotNull("lendingList", lendingList);
        return delegateInsertList(lendingList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lendingList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdLending> lendingList) {
        assertObjectNotNull("lendingList", lendingList);
        return delegateUpdateList(lendingList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lendingList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdLending> lendingList) {
        assertObjectNotNull("lendingList", lendingList);
        return delegateUpdateListNonstrict(lendingList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lendingList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdLending> lendingList) {
        assertObjectNotNull("lendingList", lendingList);
        return delegateDeleteList(lendingList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param lendingList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdLending> lendingList) {
        assertObjectNotNull("lendingList", lendingList);
        return delegateDeleteListNonstrict(lendingList);
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
    protected int delegateSelectCount(LdLendingCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdLendingCB)cb); }
    protected List<LdLending> delegateSelectList(LdLendingCB cb) {
        return invoke(createSelectListCBCommand(cb, LdLending.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdLendingCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdLending e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdLending e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdLending e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdLending e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdLending e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdLending> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdLending> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdLending> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdLending> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdLending> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdLending..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdLending. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdLending, LdLendingDbm.LendingRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdLending, LdLendingDbm.LendingRelationTrace> request = new LdHierarchyBasicRequest<LdLending, LdLendingDbm.LendingRelationTrace>(LdLending.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdLending. (NotNull)
     * @return The list of LdLending. (NotNull)
     */
    public List<LdLending> arrangeHierarchy(LdHierarchyRequest<LdLending> request) {
        return new LdHierarchyArranger<LdLending>().arrangeHierarchy(request);
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
    protected LdLending downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdLending.class);
    }
}

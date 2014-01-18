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
 * The behavior of LIBRARY_USER that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, LB_USER_ID
 * 
 * [column]
 *     LIBRARY_ID, LB_USER_ID, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LB_USER, LIBRARY
 * 
 * [referrer-table]
 *     LENDING, LENDING_COLLECTION
 * 
 * [foreign-property]
 *     lbUser, library
 * 
 * [referrer-property]
 *     lendingList, lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLibraryUserBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "LIBRARY_USER"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdLibraryUserDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLibraryUserDbm getMyDBMeta() { return LdLibraryUserDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdLibraryUser newMyEntity() { return new LdLibraryUser(); }
    public LdLibraryUserCB newMyConditionBean() { return new LdLibraryUserCB(); }

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
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdLibraryUserCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLibraryUser selectEntity(final LdLibraryUserCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdLibraryUser, LdLibraryUserCB>() {
            public List<LdLibraryUser> callbackSelectList(LdLibraryUserCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLibraryUser selectEntityWithDeletedCheck(final LdLibraryUserCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdLibraryUser, LdLibraryUserCB>() {
            public List<LdLibraryUser> callbackSelectList(LdLibraryUserCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLibraryUser selectByPKValueWithDeletedCheck(Integer libraryId, Integer lbUserId) {
        LdLibraryUser entity = new LdLibraryUser();
        entity.setLibraryId(libraryId);entity.setLbUserId(lbUserId);
        final LdLibraryUserCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdLibraryUser> selectList(LdLibraryUserCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdLibraryUser>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdLibraryUser> selectPage(final LdLibraryUserCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdLibraryUser> invoker = new LdPagingInvoker<LdLibraryUser>(getTableDbName());
        final LdPagingHandler<LdLibraryUser> handler = new LdPagingHandler<LdLibraryUser>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdLibraryUser> paging() { return selectList(cb); }
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
     * libraryUserBhv.scalarSelect(Date.class).max(new ScalarQuery(LdLibraryUserCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdLibraryUserCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdLibraryUserCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdLibraryUserCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdLibraryUser. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdLibraryUserCB cb, LdValueLabelSetupper<LdLibraryUser> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'LdLbUser'.
     * @param libraryUserList The list of libraryUser. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdLbUser> pulloutLbUser(List<LdLibraryUser> libraryUserList) {
        return helpPulloutInternally(libraryUserList, new InternalPulloutCallback<LdLibraryUser, LdLbUser>() {
            public LdLbUser callbackGetForeignEntity(LdLibraryUser entity) { return entity.getLbUser(); } });
    }
    /**
     * Pull out the list of foreign table 'LdLibrary'.
     * @param libraryUserList The list of libraryUser. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdLibrary> pulloutLibrary(List<LdLibraryUser> libraryUserList) {
        return helpPulloutInternally(libraryUserList, new InternalPulloutCallback<LdLibraryUser, LdLibrary>() {
            public LdLibrary callbackGetForeignEntity(LdLibraryUser entity) { return entity.getLibrary(); } });
    }
    
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param libraryUser The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdLibraryUser libraryUser) {
        assertEntityNotNull(libraryUser);
        delegateInsert(libraryUser);
    }

    @Override
    protected void doCreate(LdEntity libraryUser) {
        insert((LdLibraryUser)libraryUser);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param libraryUser The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdLibraryUser libraryUser) {
        helpUpdateInternally(libraryUser, new InternalUpdateCallback<LdLibraryUser>() {
            public int callbackDelegateUpdate(LdLibraryUser entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdLibraryUser)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param libraryUser The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdLibraryUser libraryUser) {
        helpUpdateNonstrictInternally(libraryUser, new InternalUpdateNonstrictCallback<LdLibraryUser>() {
            public int callbackDelegateUpdateNonstrict(LdLibraryUser entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdLibraryUser)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param libraryUser The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdLibraryUser libraryUser) {
        helpInsertOrUpdateInternally(libraryUser, new InternalInsertOrUpdateCallback<LdLibraryUser, LdLibraryUserCB>() {
            public void callbackInsert(LdLibraryUser entity) { insert(entity); }
            public void callbackUpdate(LdLibraryUser entity) { update(entity); }
            public LdLibraryUserCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdLibraryUserCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity libraryUser) {
        insertOrUpdate((LdLibraryUser)libraryUser);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param libraryUser The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdLibraryUser libraryUser) {
        helpInsertOrUpdateInternally(libraryUser, new InternalInsertOrUpdateNonstrictCallback<LdLibraryUser>() {
            public void callbackInsert(LdLibraryUser entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdLibraryUser entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdLibraryUser)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param libraryUser The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLibraryUser libraryUser) {
        helpDeleteInternally(libraryUser, new InternalDeleteCallback<LdLibraryUser>() {
            public int callbackDelegateDelete(LdLibraryUser entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity libraryUser) {
        delete((LdLibraryUser)libraryUser);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param libraryUser Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLibraryUser libraryUser) {
        helpDeleteNonstrictInternally(libraryUser, new InternalDeleteNonstrictCallback<LdLibraryUser>() {
            public int callbackDelegateDeleteNonstrict(LdLibraryUser entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param libraryUser Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLibraryUser libraryUser) {
        helpDeleteNonstrictIgnoreDeletedInternally(libraryUser, new InternalDeleteNonstrictIgnoreDeletedCallback<LdLibraryUser>() {
            public int callbackDelegateDeleteNonstrict(LdLibraryUser entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryUserList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdLibraryUser> libraryUserList) {
        assertObjectNotNull("libraryUserList", libraryUserList);
        return delegateInsertList(libraryUserList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryUserList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdLibraryUser> libraryUserList) {
        assertObjectNotNull("libraryUserList", libraryUserList);
        return delegateUpdateList(libraryUserList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryUserList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdLibraryUser> libraryUserList) {
        assertObjectNotNull("libraryUserList", libraryUserList);
        return delegateUpdateListNonstrict(libraryUserList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryUserList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdLibraryUser> libraryUserList) {
        assertObjectNotNull("libraryUserList", libraryUserList);
        return delegateDeleteList(libraryUserList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryUserList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdLibraryUser> libraryUserList) {
        assertObjectNotNull("libraryUserList", libraryUserList);
        return delegateDeleteListNonstrict(libraryUserList);
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
    protected int delegateSelectCount(LdLibraryUserCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdLibraryUserCB)cb); }
    protected List<LdLibraryUser> delegateSelectList(LdLibraryUserCB cb) {
        return invoke(createSelectListCBCommand(cb, LdLibraryUser.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdLibraryUserCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdLibraryUser e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdLibraryUser e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdLibraryUser e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdLibraryUser e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdLibraryUser e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdLibraryUser> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdLibraryUser> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdLibraryUser> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdLibraryUser> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdLibraryUser> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdLibraryUser..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdLibraryUser. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdLibraryUser, LdLibraryUserDbm.LibraryUserRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdLibraryUser, LdLibraryUserDbm.LibraryUserRelationTrace> request = new LdHierarchyBasicRequest<LdLibraryUser, LdLibraryUserDbm.LibraryUserRelationTrace>(LdLibraryUser.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdLibraryUser. (NotNull)
     * @return The list of LdLibraryUser. (NotNull)
     */
    public List<LdLibraryUser> arrangeHierarchy(LdHierarchyRequest<LdLibraryUser> request) {
        return new LdHierarchyArranger<LdLibraryUser>().arrangeHierarchy(request);
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
    protected LdLibraryUser downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdLibraryUser.class);
    }
}

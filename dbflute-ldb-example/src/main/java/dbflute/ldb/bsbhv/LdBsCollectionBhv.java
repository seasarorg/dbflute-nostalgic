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
 * The behavior of COLLECTION that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     COLLECTION_ID
 * 
 * [column]
 *     COLLECTION_ID, LIBRARY_ID, BOOK_ID, ARRIVAL_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     COLLECTION_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     BOOK, LIBRARY, COLLECTION_STATUS(AsOne)
 * 
 * [referrer-table]
 *     LENDING_COLLECTION, COLLECTION_STATUS
 * 
 * [foreign-property]
 *     book, library, collectionStatusAsOne
 * 
 * [referrer-property]
 *     lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsCollectionBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "COLLECTION"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdCollectionDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdCollectionDbm getMyDBMeta() { return LdCollectionDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdCollection newMyEntity() { return new LdCollection(); }
    public LdCollectionCB newMyConditionBean() { return new LdCollectionCB(); }

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
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdCollectionCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdCollection selectEntity(final LdCollectionCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdCollection, LdCollectionCB>() {
            public List<LdCollection> callbackSelectList(LdCollectionCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdCollection selectEntityWithDeletedCheck(final LdCollectionCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdCollection, LdCollectionCB>() {
            public List<LdCollection> callbackSelectList(LdCollectionCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdCollection selectByPKValueWithDeletedCheck(Integer collectionId) {
        LdCollection entity = new LdCollection();
        entity.setCollectionId(collectionId);
        final LdCollectionCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdCollection> selectList(LdCollectionCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdCollection>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdCollection> selectPage(final LdCollectionCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdCollection> invoker = new LdPagingInvoker<LdCollection>(getTableDbName());
        final LdPagingHandler<LdCollection> handler = new LdPagingHandler<LdCollection>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdCollection> paging() { return selectList(cb); }
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
     * collectionBhv.scalarSelect(Date.class).max(new ScalarQuery(LdCollectionCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdCollectionCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdCollectionCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdCollectionCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdCollection. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdCollectionCB cb, LdValueLabelSetupper<LdCollection> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of lendingCollectionList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setCollectionId_InScope(pkList);
     * cb.query().addOrderBy_CollectionId_Asc();
     * </pre>
     * @param collectionList The entity list of collection. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadLendingCollectionList(List<LdCollection> collectionList, LdConditionBeanSetupper<LdLendingCollectionCB> conditionBeanSetupper) {
        assertObjectNotNull("collectionList<LdCollection>", collectionList);
        assertObjectNotNull("conditionBeanSetupper<LdLendingCollectionCB>", conditionBeanSetupper);
        if (collectionList.isEmpty()) { return; }
        loadLendingCollectionList(collectionList, new LdLoadReferrerOption<LdLendingCollectionCB, LdLendingCollection>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param collectionList The entity list of collection. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLendingCollectionList(List<LdCollection> collectionList, LdLoadReferrerOption<LdLendingCollectionCB, LdLendingCollection> loadReferrerOption) {
        assertObjectNotNull("collectionList<LdCollection>", collectionList);
        assertObjectNotNull("loadReferrerOption<LdLendingCollection, LdLendingCollectionCB>", loadReferrerOption);
        if (collectionList.isEmpty()) { return; }
        final LdLendingCollectionBhv referrerBhv = xgetBSFLR().select(LdLendingCollectionBhv.class);
        helpLoadReferrerInternally(collectionList, loadReferrerOption, new InternalLoadReferrerCallback<LdCollection, Integer, LdLendingCollectionCB, LdLendingCollection>() {
            public Integer callbackBase_getPrimaryKeyValue(LdCollection entity) { return entity.getCollectionId(); }
            public void callbackBase_setReferrerList(LdCollection entity, List<LdLendingCollection> referrerList) { entity.setLendingCollectionList(referrerList); }
            public LdLendingCollectionCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(LdLendingCollectionCB cb, List<Integer> pkList) { cb.query().setCollectionId_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(LdLendingCollectionCB cb) { cb.query().addOrderBy_CollectionId_Asc(); }
            public List<LdLendingCollection> callbackReferrer_selectList(LdLendingCollectionCB cb) { return referrerBhv.selectList(cb); }
            public Integer callbackReferrer_getForeignKeyValue(LdLendingCollection entity) { return entity.getCollectionId(); }
            public void callbackReferrer_setForeignEntity(LdLendingCollection referrerEntity, LdCollection baseEntity) { referrerEntity.setCollection(baseEntity); }
        } );
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'LdBook'.
     * @param collectionList The list of collection. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdBook> pulloutBook(List<LdCollection> collectionList) {
        return helpPulloutInternally(collectionList, new InternalPulloutCallback<LdCollection, LdBook>() {
            public LdBook callbackGetForeignEntity(LdCollection entity) { return entity.getBook(); } });
    }
    /**
     * Pull out the list of foreign table 'LdLibrary'.
     * @param collectionList The list of collection. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdLibrary> pulloutLibrary(List<LdCollection> collectionList) {
        return helpPulloutInternally(collectionList, new InternalPulloutCallback<LdCollection, LdLibrary>() {
            public LdLibrary callbackGetForeignEntity(LdCollection entity) { return entity.getLibrary(); } });
    }
      /**
     * Pull out the list of referrer-as-one table 'LdCollectionStatus'.
     * @param collectionList The list of collection. (NotNull)
     * @return The list of referrer-as-one table. (NotNull)
     */
    public List<LdCollectionStatus> pulloutCollectionStatusAsOne(List<LdCollection> collectionList) {
        return helpPulloutInternally(collectionList, new InternalPulloutCallback<LdCollection, LdCollectionStatus>() {
            public LdCollectionStatus callbackGetForeignEntity(LdCollection entity) { return entity.getCollectionStatusAsOne(); } });
    }
    
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param collection The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdCollection collection) {
        assertEntityNotNull(collection);
        delegateInsert(collection);
    }

    @Override
    protected void doCreate(LdEntity collection) {
        insert((LdCollection)collection);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param collection The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdCollection collection) {
        helpUpdateInternally(collection, new InternalUpdateCallback<LdCollection>() {
            public int callbackDelegateUpdate(LdCollection entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdCollection)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param collection The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdCollection collection) {
        helpUpdateNonstrictInternally(collection, new InternalUpdateNonstrictCallback<LdCollection>() {
            public int callbackDelegateUpdateNonstrict(LdCollection entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdCollection)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param collection The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdCollection collection) {
        helpInsertOrUpdateInternally(collection, new InternalInsertOrUpdateCallback<LdCollection, LdCollectionCB>() {
            public void callbackInsert(LdCollection entity) { insert(entity); }
            public void callbackUpdate(LdCollection entity) { update(entity); }
            public LdCollectionCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdCollectionCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity collection) {
        insertOrUpdate((LdCollection)collection);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param collection The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdCollection collection) {
        helpInsertOrUpdateInternally(collection, new InternalInsertOrUpdateNonstrictCallback<LdCollection>() {
            public void callbackInsert(LdCollection entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdCollection entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdCollection)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param collection The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdCollection collection) {
        helpDeleteInternally(collection, new InternalDeleteCallback<LdCollection>() {
            public int callbackDelegateDelete(LdCollection entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity collection) {
        delete((LdCollection)collection);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param collection Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdCollection collection) {
        helpDeleteNonstrictInternally(collection, new InternalDeleteNonstrictCallback<LdCollection>() {
            public int callbackDelegateDeleteNonstrict(LdCollection entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param collection Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdCollection collection) {
        helpDeleteNonstrictIgnoreDeletedInternally(collection, new InternalDeleteNonstrictIgnoreDeletedCallback<LdCollection>() {
            public int callbackDelegateDeleteNonstrict(LdCollection entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdCollection> collectionList) {
        assertObjectNotNull("collectionList", collectionList);
        return delegateInsertList(collectionList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdCollection> collectionList) {
        assertObjectNotNull("collectionList", collectionList);
        return delegateUpdateList(collectionList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdCollection> collectionList) {
        assertObjectNotNull("collectionList", collectionList);
        return delegateUpdateListNonstrict(collectionList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdCollection> collectionList) {
        assertObjectNotNull("collectionList", collectionList);
        return delegateDeleteList(collectionList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdCollection> collectionList) {
        assertObjectNotNull("collectionList", collectionList);
        return delegateDeleteListNonstrict(collectionList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Query update the several entities. {NoConcurrencyControl}
     * @param collection Entity. (NotNull) {PrimaryKeyNotRequired}
     * @param cb Condition-bean. (NotNull)
     * @return The updated count.
     */
    public int queryUpdate(LdCollection collection, LdCollectionCB cb) {
        assertObjectNotNull("collection", collection); assertCBNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(collection);
        filterEntityOfUpdate(collection); assertEntityOfUpdate(collection);
        return invoke(createQueryUpdateEntityCBCommand(collection, cb));
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(LdCollectionCB cb) {
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
    protected int delegateSelectCount(LdCollectionCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdCollectionCB)cb); }
    protected List<LdCollection> delegateSelectList(LdCollectionCB cb) {
        return invoke(createSelectListCBCommand(cb, LdCollection.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdCollectionCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdCollection e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdCollection e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdCollection e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdCollection e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdCollection e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdCollection> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdCollection> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdCollection> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdCollection> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdCollection> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdCollection..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdCollection. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdCollection, LdCollectionDbm.CollectionRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdCollection, LdCollectionDbm.CollectionRelationTrace> request = new LdHierarchyBasicRequest<LdCollection, LdCollectionDbm.CollectionRelationTrace>(LdCollection.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdCollection. (NotNull)
     * @return The list of LdCollection. (NotNull)
     */
    public List<LdCollection> arrangeHierarchy(LdHierarchyRequest<LdCollection> request) {
        return new LdHierarchyArranger<LdCollection>().arrangeHierarchy(request);
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
    protected LdCollection downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdCollection.class);
    }
}

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
 * The behavior of COLLECTION_STATUS_LOOKUP that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     COLLECTION_STATUS_CODE
 * 
 * [column]
 *     COLLECTION_STATUS_CODE, COLLECTION_STATUS_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     testSeq
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
 *     COLLECTION_STATUS
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     collectionStatusList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsCollectionStatusLookupBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "COLLECTION_STATUS_LOOKUP"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdCollectionStatusLookupDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdCollectionStatusLookupDbm getMyDBMeta() { return LdCollectionStatusLookupDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdCollectionStatusLookup newMyEntity() { return new LdCollectionStatusLookup(); }
    public LdCollectionStatusLookupCB newMyConditionBean() { return new LdCollectionStatusLookupCB(); }

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
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdCollectionStatusLookupCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdCollectionStatusLookup selectEntity(final LdCollectionStatusLookupCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdCollectionStatusLookup, LdCollectionStatusLookupCB>() {
            public List<LdCollectionStatusLookup> callbackSelectList(LdCollectionStatusLookupCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdCollectionStatusLookup selectEntityWithDeletedCheck(final LdCollectionStatusLookupCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdCollectionStatusLookup, LdCollectionStatusLookupCB>() {
            public List<LdCollectionStatusLookup> callbackSelectList(LdCollectionStatusLookupCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdCollectionStatusLookup selectByPKValueWithDeletedCheck(String collectionStatusCode) {
        LdCollectionStatusLookup entity = new LdCollectionStatusLookup();
        entity.setCollectionStatusCode(collectionStatusCode);
        final LdCollectionStatusLookupCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdCollectionStatusLookup> selectList(LdCollectionStatusLookupCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdCollectionStatusLookup>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdCollectionStatusLookup> selectPage(final LdCollectionStatusLookupCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdCollectionStatusLookup> invoker = new LdPagingInvoker<LdCollectionStatusLookup>(getTableDbName());
        final LdPagingHandler<LdCollectionStatusLookup> handler = new LdPagingHandler<LdCollectionStatusLookup>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdCollectionStatusLookup> paging() { return selectList(cb); }
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
     * collectionStatusLookupBhv.scalarSelect(Date.class).max(new ScalarQuery(LdCollectionStatusLookupCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdCollectionStatusLookupCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdCollectionStatusLookupCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdCollectionStatusLookupCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdCollectionStatusLookup. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdCollectionStatusLookupCB cb, LdValueLabelSetupper<LdCollectionStatusLookup> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    /**
     * Select the next value as sequence.
     * @return The next value. (NotNull)
     */
    public java.math.BigDecimal selectNextVal() {
        return delegateSelectNextVal();
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of collectionStatusList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setCollectionStatusCode_InScope(pkList);
     * cb.query().addOrderBy_CollectionStatusCode_Asc();
     * </pre>
     * @param collectionStatusLookupList The entity list of collectionStatusLookup. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadCollectionStatusList(List<LdCollectionStatusLookup> collectionStatusLookupList, LdConditionBeanSetupper<LdCollectionStatusCB> conditionBeanSetupper) {
        assertObjectNotNull("collectionStatusLookupList<LdCollectionStatusLookup>", collectionStatusLookupList);
        assertObjectNotNull("conditionBeanSetupper<LdCollectionStatusCB>", conditionBeanSetupper);
        if (collectionStatusLookupList.isEmpty()) { return; }
        loadCollectionStatusList(collectionStatusLookupList, new LdLoadReferrerOption<LdCollectionStatusCB, LdCollectionStatus>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param collectionStatusLookupList The entity list of collectionStatusLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadCollectionStatusList(List<LdCollectionStatusLookup> collectionStatusLookupList, LdLoadReferrerOption<LdCollectionStatusCB, LdCollectionStatus> loadReferrerOption) {
        assertObjectNotNull("collectionStatusLookupList<LdCollectionStatusLookup>", collectionStatusLookupList);
        assertObjectNotNull("loadReferrerOption<LdCollectionStatus, LdCollectionStatusCB>", loadReferrerOption);
        if (collectionStatusLookupList.isEmpty()) { return; }
        final LdCollectionStatusBhv referrerBhv = xgetBSFLR().select(LdCollectionStatusBhv.class);
        helpLoadReferrerInternally(collectionStatusLookupList, loadReferrerOption, new InternalLoadReferrerCallback<LdCollectionStatusLookup, String, LdCollectionStatusCB, LdCollectionStatus>() {
            public String callbackBase_getPrimaryKeyValue(LdCollectionStatusLookup entity) { return entity.getCollectionStatusCode(); }
            public void callbackBase_setReferrerList(LdCollectionStatusLookup entity, List<LdCollectionStatus> referrerList) { entity.setCollectionStatusList(referrerList); }
            public LdCollectionStatusCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(LdCollectionStatusCB cb, List<String> pkList) { cb.query().setCollectionStatusCode_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(LdCollectionStatusCB cb) { cb.query().addOrderBy_CollectionStatusCode_Asc(); }
            public List<LdCollectionStatus> callbackReferrer_selectList(LdCollectionStatusCB cb) { return referrerBhv.selectList(cb); }
            public String callbackReferrer_getForeignKeyValue(LdCollectionStatus entity) { return entity.getCollectionStatusCode(); }
            public void callbackReferrer_setForeignEntity(LdCollectionStatus referrerEntity, LdCollectionStatusLookup baseEntity) { referrerEntity.setCollectionStatusLookup(baseEntity); }
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
     * @param collectionStatusLookup The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdCollectionStatusLookup collectionStatusLookup) {
        assertEntityNotNull(collectionStatusLookup);
        delegateInsert(collectionStatusLookup);
    }

    @Override
    protected void doCreate(LdEntity collectionStatusLookup) {
        insert((LdCollectionStatusLookup)collectionStatusLookup);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param collectionStatusLookup The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdCollectionStatusLookup collectionStatusLookup) {
        helpUpdateInternally(collectionStatusLookup, new InternalUpdateCallback<LdCollectionStatusLookup>() {
            public int callbackDelegateUpdate(LdCollectionStatusLookup entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdCollectionStatusLookup)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param collectionStatusLookup The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdCollectionStatusLookup collectionStatusLookup) {
        helpUpdateNonstrictInternally(collectionStatusLookup, new InternalUpdateNonstrictCallback<LdCollectionStatusLookup>() {
            public int callbackDelegateUpdateNonstrict(LdCollectionStatusLookup entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdCollectionStatusLookup)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param collectionStatusLookup The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdCollectionStatusLookup collectionStatusLookup) {
        helpInsertOrUpdateInternally(collectionStatusLookup, new InternalInsertOrUpdateCallback<LdCollectionStatusLookup, LdCollectionStatusLookupCB>() {
            public void callbackInsert(LdCollectionStatusLookup entity) { insert(entity); }
            public void callbackUpdate(LdCollectionStatusLookup entity) { update(entity); }
            public LdCollectionStatusLookupCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdCollectionStatusLookupCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity collectionStatusLookup) {
        insertOrUpdate((LdCollectionStatusLookup)collectionStatusLookup);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param collectionStatusLookup The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdCollectionStatusLookup collectionStatusLookup) {
        helpInsertOrUpdateInternally(collectionStatusLookup, new InternalInsertOrUpdateNonstrictCallback<LdCollectionStatusLookup>() {
            public void callbackInsert(LdCollectionStatusLookup entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdCollectionStatusLookup entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdCollectionStatusLookup)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param collectionStatusLookup The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdCollectionStatusLookup collectionStatusLookup) {
        helpDeleteInternally(collectionStatusLookup, new InternalDeleteCallback<LdCollectionStatusLookup>() {
            public int callbackDelegateDelete(LdCollectionStatusLookup entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity collectionStatusLookup) {
        delete((LdCollectionStatusLookup)collectionStatusLookup);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param collectionStatusLookup Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdCollectionStatusLookup collectionStatusLookup) {
        helpDeleteNonstrictInternally(collectionStatusLookup, new InternalDeleteNonstrictCallback<LdCollectionStatusLookup>() {
            public int callbackDelegateDeleteNonstrict(LdCollectionStatusLookup entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param collectionStatusLookup Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdCollectionStatusLookup collectionStatusLookup) {
        helpDeleteNonstrictIgnoreDeletedInternally(collectionStatusLookup, new InternalDeleteNonstrictIgnoreDeletedCallback<LdCollectionStatusLookup>() {
            public int callbackDelegateDeleteNonstrict(LdCollectionStatusLookup entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionStatusLookupList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        assertObjectNotNull("collectionStatusLookupList", collectionStatusLookupList);
        return delegateInsertList(collectionStatusLookupList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionStatusLookupList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        assertObjectNotNull("collectionStatusLookupList", collectionStatusLookupList);
        return delegateUpdateList(collectionStatusLookupList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionStatusLookupList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        assertObjectNotNull("collectionStatusLookupList", collectionStatusLookupList);
        return delegateUpdateListNonstrict(collectionStatusLookupList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionStatusLookupList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        assertObjectNotNull("collectionStatusLookupList", collectionStatusLookupList);
        return delegateDeleteList(collectionStatusLookupList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param collectionStatusLookupList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        assertObjectNotNull("collectionStatusLookupList", collectionStatusLookupList);
        return delegateDeleteListNonstrict(collectionStatusLookupList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Query update the several entities. {NoConcurrencyControl}
     * @param collectionStatusLookup Entity. (NotNull) {PrimaryKeyNotRequired}
     * @param cb Condition-bean. (NotNull)
     * @return The updated count.
     */
    public int queryUpdate(LdCollectionStatusLookup collectionStatusLookup, LdCollectionStatusLookupCB cb) {
        assertObjectNotNull("collectionStatusLookup", collectionStatusLookup); assertCBNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(collectionStatusLookup);
        filterEntityOfUpdate(collectionStatusLookup); assertEntityOfUpdate(collectionStatusLookup);
        return invoke(createQueryUpdateEntityCBCommand(collectionStatusLookup, cb));
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(LdCollectionStatusLookupCB cb) {
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
    protected int delegateSelectCount(LdCollectionStatusLookupCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdCollectionStatusLookupCB)cb); }
    protected List<LdCollectionStatusLookup> delegateSelectList(LdCollectionStatusLookupCB cb) {
        return invoke(createSelectListCBCommand(cb, LdCollectionStatusLookup.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdCollectionStatusLookupCB)cb); }
    protected java.math.BigDecimal delegateSelectNextVal() { return invoke(createSelectNextValCommand(java.math.BigDecimal.class)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdCollectionStatusLookup e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdCollectionStatusLookup e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdCollectionStatusLookup e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdCollectionStatusLookup e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdCollectionStatusLookup e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdCollectionStatusLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdCollectionStatusLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdCollectionStatusLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdCollectionStatusLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdCollectionStatusLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdCollectionStatusLookup..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdCollectionStatusLookup. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdCollectionStatusLookup, LdCollectionStatusLookupDbm.CollectionStatusLookupRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdCollectionStatusLookup, LdCollectionStatusLookupDbm.CollectionStatusLookupRelationTrace> request = new LdHierarchyBasicRequest<LdCollectionStatusLookup, LdCollectionStatusLookupDbm.CollectionStatusLookupRelationTrace>(LdCollectionStatusLookup.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdCollectionStatusLookup. (NotNull)
     * @return The list of LdCollectionStatusLookup. (NotNull)
     */
    public List<LdCollectionStatusLookup> arrangeHierarchy(LdHierarchyRequest<LdCollectionStatusLookup> request) {
        return new LdHierarchyArranger<LdCollectionStatusLookup>().arrangeHierarchy(request);
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
    protected LdCollectionStatusLookup downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdCollectionStatusLookup.class);
    }
}

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
 * The behavior of LIBRARY_TYPE_LOOKUP that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     LIBRARY_TYPE_CODE
 * 
 * [column]
 *     LIBRARY_TYPE_CODE, LIBRARY_TYPE_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LIBRARY
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     libraryList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLibraryTypeLookupBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "LIBRARY_TYPE_LOOKUP"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdLibraryTypeLookupDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLibraryTypeLookupDbm getMyDBMeta() { return LdLibraryTypeLookupDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdLibraryTypeLookup newMyEntity() { return new LdLibraryTypeLookup(); }
    public LdLibraryTypeLookupCB newMyConditionBean() { return new LdLibraryTypeLookupCB(); }

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
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdLibraryTypeLookupCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLibraryTypeLookup selectEntity(final LdLibraryTypeLookupCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdLibraryTypeLookup, LdLibraryTypeLookupCB>() {
            public List<LdLibraryTypeLookup> callbackSelectList(LdLibraryTypeLookupCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLibraryTypeLookup selectEntityWithDeletedCheck(final LdLibraryTypeLookupCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdLibraryTypeLookup, LdLibraryTypeLookupCB>() {
            public List<LdLibraryTypeLookup> callbackSelectList(LdLibraryTypeLookupCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLibraryTypeLookup selectByPKValueWithDeletedCheck(String libraryTypeCode) {
        LdLibraryTypeLookup entity = new LdLibraryTypeLookup();
        entity.setLibraryTypeCode(libraryTypeCode);
        final LdLibraryTypeLookupCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdLibraryTypeLookup> selectList(LdLibraryTypeLookupCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdLibraryTypeLookup>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdLibraryTypeLookup> selectPage(final LdLibraryTypeLookupCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdLibraryTypeLookup> invoker = new LdPagingInvoker<LdLibraryTypeLookup>(getTableDbName());
        final LdPagingHandler<LdLibraryTypeLookup> handler = new LdPagingHandler<LdLibraryTypeLookup>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdLibraryTypeLookup> paging() { return selectList(cb); }
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
     * libraryTypeLookupBhv.scalarSelect(Date.class).max(new ScalarQuery(LdLibraryTypeLookupCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdLibraryTypeLookupCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdLibraryTypeLookupCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdLibraryTypeLookupCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdLibraryTypeLookup. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdLibraryTypeLookupCB cb, LdValueLabelSetupper<LdLibraryTypeLookup> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of libraryList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setLibraryTypeCode_InScope(pkList);
     * cb.query().addOrderBy_LibraryTypeCode_Asc();
     * </pre>
     * @param libraryTypeLookupList The entity list of libraryTypeLookup. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadLibraryList(List<LdLibraryTypeLookup> libraryTypeLookupList, LdConditionBeanSetupper<LdLibraryCB> conditionBeanSetupper) {
        assertObjectNotNull("libraryTypeLookupList<LdLibraryTypeLookup>", libraryTypeLookupList);
        assertObjectNotNull("conditionBeanSetupper<LdLibraryCB>", conditionBeanSetupper);
        if (libraryTypeLookupList.isEmpty()) { return; }
        loadLibraryList(libraryTypeLookupList, new LdLoadReferrerOption<LdLibraryCB, LdLibrary>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param libraryTypeLookupList The entity list of libraryTypeLookup. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLibraryList(List<LdLibraryTypeLookup> libraryTypeLookupList, LdLoadReferrerOption<LdLibraryCB, LdLibrary> loadReferrerOption) {
        assertObjectNotNull("libraryTypeLookupList<LdLibraryTypeLookup>", libraryTypeLookupList);
        assertObjectNotNull("loadReferrerOption<LdLibrary, LdLibraryCB>", loadReferrerOption);
        if (libraryTypeLookupList.isEmpty()) { return; }
        final LdLibraryBhv referrerBhv = xgetBSFLR().select(LdLibraryBhv.class);
        helpLoadReferrerInternally(libraryTypeLookupList, loadReferrerOption, new InternalLoadReferrerCallback<LdLibraryTypeLookup, String, LdLibraryCB, LdLibrary>() {
            public String callbackBase_getPrimaryKeyValue(LdLibraryTypeLookup entity) { return entity.getLibraryTypeCode(); }
            public void callbackBase_setReferrerList(LdLibraryTypeLookup entity, List<LdLibrary> referrerList) { entity.setLibraryList(referrerList); }
            public LdLibraryCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(LdLibraryCB cb, List<String> pkList) { cb.query().setLibraryTypeCode_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(LdLibraryCB cb) { cb.query().addOrderBy_LibraryTypeCode_Asc(); }
            public List<LdLibrary> callbackReferrer_selectList(LdLibraryCB cb) { return referrerBhv.selectList(cb); }
            public String callbackReferrer_getForeignKeyValue(LdLibrary entity) { return entity.getLibraryTypeCode(); }
            public void callbackReferrer_setForeignEntity(LdLibrary referrerEntity, LdLibraryTypeLookup baseEntity) { referrerEntity.setLibraryTypeLookup(baseEntity); }
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
     * @param libraryTypeLookup The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdLibraryTypeLookup libraryTypeLookup) {
        assertEntityNotNull(libraryTypeLookup);
        delegateInsert(libraryTypeLookup);
    }

    @Override
    protected void doCreate(LdEntity libraryTypeLookup) {
        insert((LdLibraryTypeLookup)libraryTypeLookup);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param libraryTypeLookup The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdLibraryTypeLookup libraryTypeLookup) {
        helpUpdateInternally(libraryTypeLookup, new InternalUpdateCallback<LdLibraryTypeLookup>() {
            public int callbackDelegateUpdate(LdLibraryTypeLookup entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdLibraryTypeLookup)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param libraryTypeLookup The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdLibraryTypeLookup libraryTypeLookup) {
        helpUpdateNonstrictInternally(libraryTypeLookup, new InternalUpdateNonstrictCallback<LdLibraryTypeLookup>() {
            public int callbackDelegateUpdateNonstrict(LdLibraryTypeLookup entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdLibraryTypeLookup)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param libraryTypeLookup The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdLibraryTypeLookup libraryTypeLookup) {
        helpInsertOrUpdateInternally(libraryTypeLookup, new InternalInsertOrUpdateCallback<LdLibraryTypeLookup, LdLibraryTypeLookupCB>() {
            public void callbackInsert(LdLibraryTypeLookup entity) { insert(entity); }
            public void callbackUpdate(LdLibraryTypeLookup entity) { update(entity); }
            public LdLibraryTypeLookupCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdLibraryTypeLookupCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity libraryTypeLookup) {
        insertOrUpdate((LdLibraryTypeLookup)libraryTypeLookup);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param libraryTypeLookup The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdLibraryTypeLookup libraryTypeLookup) {
        helpInsertOrUpdateInternally(libraryTypeLookup, new InternalInsertOrUpdateNonstrictCallback<LdLibraryTypeLookup>() {
            public void callbackInsert(LdLibraryTypeLookup entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdLibraryTypeLookup entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdLibraryTypeLookup)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param libraryTypeLookup The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLibraryTypeLookup libraryTypeLookup) {
        helpDeleteInternally(libraryTypeLookup, new InternalDeleteCallback<LdLibraryTypeLookup>() {
            public int callbackDelegateDelete(LdLibraryTypeLookup entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity libraryTypeLookup) {
        delete((LdLibraryTypeLookup)libraryTypeLookup);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param libraryTypeLookup Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLibraryTypeLookup libraryTypeLookup) {
        helpDeleteNonstrictInternally(libraryTypeLookup, new InternalDeleteNonstrictCallback<LdLibraryTypeLookup>() {
            public int callbackDelegateDeleteNonstrict(LdLibraryTypeLookup entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param libraryTypeLookup Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLibraryTypeLookup libraryTypeLookup) {
        helpDeleteNonstrictIgnoreDeletedInternally(libraryTypeLookup, new InternalDeleteNonstrictIgnoreDeletedCallback<LdLibraryTypeLookup>() {
            public int callbackDelegateDeleteNonstrict(LdLibraryTypeLookup entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryTypeLookupList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        assertObjectNotNull("libraryTypeLookupList", libraryTypeLookupList);
        return delegateInsertList(libraryTypeLookupList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryTypeLookupList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        assertObjectNotNull("libraryTypeLookupList", libraryTypeLookupList);
        return delegateUpdateList(libraryTypeLookupList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryTypeLookupList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        assertObjectNotNull("libraryTypeLookupList", libraryTypeLookupList);
        return delegateUpdateListNonstrict(libraryTypeLookupList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryTypeLookupList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        assertObjectNotNull("libraryTypeLookupList", libraryTypeLookupList);
        return delegateDeleteList(libraryTypeLookupList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryTypeLookupList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        assertObjectNotNull("libraryTypeLookupList", libraryTypeLookupList);
        return delegateDeleteListNonstrict(libraryTypeLookupList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Query update the several entities. {NoConcurrencyControl}
     * @param libraryTypeLookup Entity. (NotNull) {PrimaryKeyNotRequired}
     * @param cb Condition-bean. (NotNull)
     * @return The updated count.
     */
    public int queryUpdate(LdLibraryTypeLookup libraryTypeLookup, LdLibraryTypeLookupCB cb) {
        assertObjectNotNull("libraryTypeLookup", libraryTypeLookup); assertCBNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(libraryTypeLookup);
        filterEntityOfUpdate(libraryTypeLookup); assertEntityOfUpdate(libraryTypeLookup);
        return invoke(createQueryUpdateEntityCBCommand(libraryTypeLookup, cb));
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(LdLibraryTypeLookupCB cb) {
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
    protected int delegateSelectCount(LdLibraryTypeLookupCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdLibraryTypeLookupCB)cb); }
    protected List<LdLibraryTypeLookup> delegateSelectList(LdLibraryTypeLookupCB cb) {
        return invoke(createSelectListCBCommand(cb, LdLibraryTypeLookup.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdLibraryTypeLookupCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdLibraryTypeLookup e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdLibraryTypeLookup e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdLibraryTypeLookup e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdLibraryTypeLookup e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdLibraryTypeLookup e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdLibraryTypeLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdLibraryTypeLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdLibraryTypeLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdLibraryTypeLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdLibraryTypeLookup> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdLibraryTypeLookup..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdLibraryTypeLookup. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdLibraryTypeLookup, LdLibraryTypeLookupDbm.LibraryTypeLookupRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdLibraryTypeLookup, LdLibraryTypeLookupDbm.LibraryTypeLookupRelationTrace> request = new LdHierarchyBasicRequest<LdLibraryTypeLookup, LdLibraryTypeLookupDbm.LibraryTypeLookupRelationTrace>(LdLibraryTypeLookup.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdLibraryTypeLookup. (NotNull)
     * @return The list of LdLibraryTypeLookup. (NotNull)
     */
    public List<LdLibraryTypeLookup> arrangeHierarchy(LdHierarchyRequest<LdLibraryTypeLookup> request) {
        return new LdHierarchyArranger<LdLibraryTypeLookup>().arrangeHierarchy(request);
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
    protected LdLibraryTypeLookup downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdLibraryTypeLookup.class);
    }
}

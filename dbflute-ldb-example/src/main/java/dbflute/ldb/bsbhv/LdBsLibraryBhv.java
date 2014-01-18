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
 * The behavior of LIBRARY that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     LIBRARY_ID
 * 
 * [column]
 *     LIBRARY_ID, LIBRARY_NAME, LIBRARY_TYPE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     LIBRARY_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     LIBRARY_TYPE_LOOKUP, NEXT_LIBRARY(AsNext), LIBRARY_USER(AsUser)
 * 
 * [referrer-table]
 *     COLLECTION, LIBRARY_USER, NEXT_LIBRARY
 * 
 * [foreign-property]
 *     libraryTypeLookup, nextLibraryAsNext, libraryUserAsUser
 * 
 * [referrer-property]
 *     collectionList, libraryUserList, nextLibraryByNextIdList, nextLibraryByBaseIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLibraryBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "LIBRARY"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdLibraryDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdLibraryDbm getMyDBMeta() { return LdLibraryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdLibrary newMyEntity() { return new LdLibrary(); }
    public LdLibraryCB newMyConditionBean() { return new LdLibraryCB(); }

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
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdLibraryCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLibrary selectEntity(final LdLibraryCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdLibrary, LdLibraryCB>() {
            public List<LdLibrary> callbackSelectList(LdLibraryCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLibrary selectEntityWithDeletedCheck(final LdLibraryCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdLibrary, LdLibraryCB>() {
            public List<LdLibrary> callbackSelectList(LdLibraryCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdLibrary selectByPKValueWithDeletedCheck(Integer libraryId) {
        LdLibrary entity = new LdLibrary();
        entity.setLibraryId(libraryId);
        final LdLibraryCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdLibrary> selectList(LdLibraryCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdLibrary>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdLibrary> selectPage(final LdLibraryCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdLibrary> invoker = new LdPagingInvoker<LdLibrary>(getTableDbName());
        final LdPagingHandler<LdLibrary> handler = new LdPagingHandler<LdLibrary>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdLibrary> paging() { return selectList(cb); }
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
     * libraryBhv.scalarSelect(Date.class).max(new ScalarQuery(LdLibraryCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdLibraryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdLibraryCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdLibraryCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdLibrary. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdLibraryCB cb, LdValueLabelSetupper<LdLibrary> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of collectionList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadCollectionList(List<LdLibrary> libraryList, LdConditionBeanSetupper<LdCollectionCB> conditionBeanSetupper) {
        assertObjectNotNull("libraryList<LdLibrary>", libraryList);
        assertObjectNotNull("conditionBeanSetupper<LdCollectionCB>", conditionBeanSetupper);
        if (libraryList.isEmpty()) { return; }
        loadCollectionList(libraryList, new LdLoadReferrerOption<LdCollectionCB, LdCollection>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadCollectionList(List<LdLibrary> libraryList, LdLoadReferrerOption<LdCollectionCB, LdCollection> loadReferrerOption) {
        assertObjectNotNull("libraryList<LdLibrary>", libraryList);
        assertObjectNotNull("loadReferrerOption<LdCollection, LdCollectionCB>", loadReferrerOption);
        if (libraryList.isEmpty()) { return; }
        final LdCollectionBhv referrerBhv = xgetBSFLR().select(LdCollectionBhv.class);
        helpLoadReferrerInternally(libraryList, loadReferrerOption, new InternalLoadReferrerCallback<LdLibrary, Integer, LdCollectionCB, LdCollection>() {
            public Integer callbackBase_getPrimaryKeyValue(LdLibrary entity) { return entity.getLibraryId(); }
            public void callbackBase_setReferrerList(LdLibrary entity, List<LdCollection> referrerList) { entity.setCollectionList(referrerList); }
            public LdCollectionCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(LdCollectionCB cb, List<Integer> pkList) { cb.query().setLibraryId_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(LdCollectionCB cb) { cb.query().addOrderBy_LibraryId_Asc(); }
            public List<LdCollection> callbackReferrer_selectList(LdCollectionCB cb) { return referrerBhv.selectList(cb); }
            public Integer callbackReferrer_getForeignKeyValue(LdCollection entity) { return entity.getLibraryId(); }
            public void callbackReferrer_setForeignEntity(LdCollection referrerEntity, LdLibrary baseEntity) { referrerEntity.setLibrary(baseEntity); }
        } );
    }
    /**
     * Load referrer of libraryUserList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadLibraryUserList(List<LdLibrary> libraryList, LdConditionBeanSetupper<LdLibraryUserCB> conditionBeanSetupper) {
        assertObjectNotNull("libraryList<LdLibrary>", libraryList);
        assertObjectNotNull("conditionBeanSetupper<LdLibraryUserCB>", conditionBeanSetupper);
        if (libraryList.isEmpty()) { return; }
        loadLibraryUserList(libraryList, new LdLoadReferrerOption<LdLibraryUserCB, LdLibraryUser>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadLibraryUserList(List<LdLibrary> libraryList, LdLoadReferrerOption<LdLibraryUserCB, LdLibraryUser> loadReferrerOption) {
        assertObjectNotNull("libraryList<LdLibrary>", libraryList);
        assertObjectNotNull("loadReferrerOption<LdLibraryUser, LdLibraryUserCB>", loadReferrerOption);
        if (libraryList.isEmpty()) { return; }
        final LdLibraryUserBhv referrerBhv = xgetBSFLR().select(LdLibraryUserBhv.class);
        helpLoadReferrerInternally(libraryList, loadReferrerOption, new InternalLoadReferrerCallback<LdLibrary, Integer, LdLibraryUserCB, LdLibraryUser>() {
            public Integer callbackBase_getPrimaryKeyValue(LdLibrary entity) { return entity.getLibraryId(); }
            public void callbackBase_setReferrerList(LdLibrary entity, List<LdLibraryUser> referrerList) { entity.setLibraryUserList(referrerList); }
            public LdLibraryUserCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(LdLibraryUserCB cb, List<Integer> pkList) { cb.query().setLibraryId_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(LdLibraryUserCB cb) { cb.query().addOrderBy_LibraryId_Asc(); }
            public List<LdLibraryUser> callbackReferrer_selectList(LdLibraryUserCB cb) { return referrerBhv.selectList(cb); }
            public Integer callbackReferrer_getForeignKeyValue(LdLibraryUser entity) { return entity.getLibraryId(); }
            public void callbackReferrer_setForeignEntity(LdLibraryUser referrerEntity, LdLibrary baseEntity) { referrerEntity.setLibrary(baseEntity); }
        } );
    }
    /**
     * Load referrer of nextLibraryByNextIdList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setNextLibraryId_InScope(pkList);
     * cb.query().addOrderBy_NextLibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadNextLibraryByNextIdList(List<LdLibrary> libraryList, LdConditionBeanSetupper<LdNextLibraryCB> conditionBeanSetupper) {
        assertObjectNotNull("libraryList<LdLibrary>", libraryList);
        assertObjectNotNull("conditionBeanSetupper<LdNextLibraryCB>", conditionBeanSetupper);
        if (libraryList.isEmpty()) { return; }
        loadNextLibraryByNextIdList(libraryList, new LdLoadReferrerOption<LdNextLibraryCB, LdNextLibrary>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadNextLibraryByNextIdList(List<LdLibrary> libraryList, LdLoadReferrerOption<LdNextLibraryCB, LdNextLibrary> loadReferrerOption) {
        assertObjectNotNull("libraryList<LdLibrary>", libraryList);
        assertObjectNotNull("loadReferrerOption<LdNextLibrary, LdNextLibraryCB>", loadReferrerOption);
        if (libraryList.isEmpty()) { return; }
        final LdNextLibraryBhv referrerBhv = xgetBSFLR().select(LdNextLibraryBhv.class);
        helpLoadReferrerInternally(libraryList, loadReferrerOption, new InternalLoadReferrerCallback<LdLibrary, Integer, LdNextLibraryCB, LdNextLibrary>() {
            public Integer callbackBase_getPrimaryKeyValue(LdLibrary entity) { return entity.getLibraryId(); }
            public void callbackBase_setReferrerList(LdLibrary entity, List<LdNextLibrary> referrerList) { entity.setNextLibraryByNextIdList(referrerList); }
            public LdNextLibraryCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(LdNextLibraryCB cb, List<Integer> pkList) { cb.query().setNextLibraryId_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(LdNextLibraryCB cb) { cb.query().addOrderBy_NextLibraryId_Asc(); }
            public List<LdNextLibrary> callbackReferrer_selectList(LdNextLibraryCB cb) { return referrerBhv.selectList(cb); }
            public Integer callbackReferrer_getForeignKeyValue(LdNextLibrary entity) { return entity.getNextLibraryId(); }
            public void callbackReferrer_setForeignEntity(LdNextLibrary referrerEntity, LdLibrary baseEntity) { referrerEntity.setLibraryByNextId(baseEntity); }
        } );
    }
    /**
     * Load referrer of nextLibraryByBaseIdList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setLibraryId_InScope(pkList);
     * cb.query().addOrderBy_LibraryId_Asc();
     * </pre>
     * @param libraryList The entity list of library. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadNextLibraryByBaseIdList(List<LdLibrary> libraryList, LdConditionBeanSetupper<LdNextLibraryCB> conditionBeanSetupper) {
        assertObjectNotNull("libraryList<LdLibrary>", libraryList);
        assertObjectNotNull("conditionBeanSetupper<LdNextLibraryCB>", conditionBeanSetupper);
        if (libraryList.isEmpty()) { return; }
        loadNextLibraryByBaseIdList(libraryList, new LdLoadReferrerOption<LdNextLibraryCB, LdNextLibrary>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param libraryList The entity list of library. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadNextLibraryByBaseIdList(List<LdLibrary> libraryList, LdLoadReferrerOption<LdNextLibraryCB, LdNextLibrary> loadReferrerOption) {
        assertObjectNotNull("libraryList<LdLibrary>", libraryList);
        assertObjectNotNull("loadReferrerOption<LdNextLibrary, LdNextLibraryCB>", loadReferrerOption);
        if (libraryList.isEmpty()) { return; }
        final LdNextLibraryBhv referrerBhv = xgetBSFLR().select(LdNextLibraryBhv.class);
        helpLoadReferrerInternally(libraryList, loadReferrerOption, new InternalLoadReferrerCallback<LdLibrary, Integer, LdNextLibraryCB, LdNextLibrary>() {
            public Integer callbackBase_getPrimaryKeyValue(LdLibrary entity) { return entity.getLibraryId(); }
            public void callbackBase_setReferrerList(LdLibrary entity, List<LdNextLibrary> referrerList) { entity.setNextLibraryByBaseIdList(referrerList); }
            public LdNextLibraryCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(LdNextLibraryCB cb, List<Integer> pkList) { cb.query().setLibraryId_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(LdNextLibraryCB cb) { cb.query().addOrderBy_LibraryId_Asc(); }
            public List<LdNextLibrary> callbackReferrer_selectList(LdNextLibraryCB cb) { return referrerBhv.selectList(cb); }
            public Integer callbackReferrer_getForeignKeyValue(LdNextLibrary entity) { return entity.getLibraryId(); }
            public void callbackReferrer_setForeignEntity(LdNextLibrary referrerEntity, LdLibrary baseEntity) { referrerEntity.setLibraryByBaseId(baseEntity); }
        } );
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'LdLibraryTypeLookup'.
     * @param libraryList The list of library. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdLibraryTypeLookup> pulloutLibraryTypeLookup(List<LdLibrary> libraryList) {
        return helpPulloutInternally(libraryList, new InternalPulloutCallback<LdLibrary, LdLibraryTypeLookup>() {
            public LdLibraryTypeLookup callbackGetForeignEntity(LdLibrary entity) { return entity.getLibraryTypeLookup(); } });
    }
    /**
     * Pull out the list of foreign table 'LdNextLibrary'.
     * @param libraryList The list of library. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdNextLibrary> pulloutNextLibraryAsNext(List<LdLibrary> libraryList) {
        return helpPulloutInternally(libraryList, new InternalPulloutCallback<LdLibrary, LdNextLibrary>() {
            public LdNextLibrary callbackGetForeignEntity(LdLibrary entity) { return entity.getNextLibraryAsNext(); } });
    }
    /**
     * Pull out the list of foreign table 'LdLibraryUser'.
     * @param libraryList The list of library. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdLibraryUser> pulloutLibraryUserAsUser(List<LdLibrary> libraryList) {
        return helpPulloutInternally(libraryList, new InternalPulloutCallback<LdLibrary, LdLibraryUser>() {
            public LdLibraryUser callbackGetForeignEntity(LdLibrary entity) { return entity.getLibraryUserAsUser(); } });
    }
        
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param library The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdLibrary library) {
        assertEntityNotNull(library);
        delegateInsert(library);
    }

    @Override
    protected void doCreate(LdEntity library) {
        insert((LdLibrary)library);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param library The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdLibrary library) {
        helpUpdateInternally(library, new InternalUpdateCallback<LdLibrary>() {
            public int callbackDelegateUpdate(LdLibrary entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdLibrary)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param library The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdLibrary library) {
        helpUpdateNonstrictInternally(library, new InternalUpdateNonstrictCallback<LdLibrary>() {
            public int callbackDelegateUpdateNonstrict(LdLibrary entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdLibrary)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param library The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdLibrary library) {
        helpInsertOrUpdateInternally(library, new InternalInsertOrUpdateCallback<LdLibrary, LdLibraryCB>() {
            public void callbackInsert(LdLibrary entity) { insert(entity); }
            public void callbackUpdate(LdLibrary entity) { update(entity); }
            public LdLibraryCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdLibraryCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity library) {
        insertOrUpdate((LdLibrary)library);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param library The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdLibrary library) {
        helpInsertOrUpdateInternally(library, new InternalInsertOrUpdateNonstrictCallback<LdLibrary>() {
            public void callbackInsert(LdLibrary entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdLibrary entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdLibrary)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param library The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdLibrary library) {
        helpDeleteInternally(library, new InternalDeleteCallback<LdLibrary>() {
            public int callbackDelegateDelete(LdLibrary entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity library) {
        delete((LdLibrary)library);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param library Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdLibrary library) {
        helpDeleteNonstrictInternally(library, new InternalDeleteNonstrictCallback<LdLibrary>() {
            public int callbackDelegateDeleteNonstrict(LdLibrary entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param library Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdLibrary library) {
        helpDeleteNonstrictIgnoreDeletedInternally(library, new InternalDeleteNonstrictIgnoreDeletedCallback<LdLibrary>() {
            public int callbackDelegateDeleteNonstrict(LdLibrary entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdLibrary> libraryList) {
        assertObjectNotNull("libraryList", libraryList);
        return delegateInsertList(libraryList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdLibrary> libraryList) {
        assertObjectNotNull("libraryList", libraryList);
        return delegateUpdateList(libraryList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdLibrary> libraryList) {
        assertObjectNotNull("libraryList", libraryList);
        return delegateUpdateListNonstrict(libraryList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdLibrary> libraryList) {
        assertObjectNotNull("libraryList", libraryList);
        return delegateDeleteList(libraryList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param libraryList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdLibrary> libraryList) {
        assertObjectNotNull("libraryList", libraryList);
        return delegateDeleteListNonstrict(libraryList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Query update the several entities. {NoConcurrencyControl}
     * @param library Entity. (NotNull) {PrimaryKeyNotRequired}
     * @param cb Condition-bean. (NotNull)
     * @return The updated count.
     */
    public int queryUpdate(LdLibrary library, LdLibraryCB cb) {
        assertObjectNotNull("library", library); assertCBNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(library);
        filterEntityOfUpdate(library); assertEntityOfUpdate(library);
        return invoke(createQueryUpdateEntityCBCommand(library, cb));
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(LdLibraryCB cb) {
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
    protected int delegateSelectCount(LdLibraryCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdLibraryCB)cb); }
    protected List<LdLibrary> delegateSelectList(LdLibraryCB cb) {
        return invoke(createSelectListCBCommand(cb, LdLibrary.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdLibraryCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdLibrary e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdLibrary e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdLibrary e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdLibrary e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdLibrary e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdLibrary> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdLibrary> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdLibrary> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdLibrary> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdLibrary> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdLibrary..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdLibrary. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdLibrary, LdLibraryDbm.LibraryRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdLibrary, LdLibraryDbm.LibraryRelationTrace> request = new LdHierarchyBasicRequest<LdLibrary, LdLibraryDbm.LibraryRelationTrace>(LdLibrary.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdLibrary. (NotNull)
     * @return The list of LdLibrary. (NotNull)
     */
    public List<LdLibrary> arrangeHierarchy(LdHierarchyRequest<LdLibrary> request) {
        return new LdHierarchyArranger<LdLibrary>().arrangeHierarchy(request);
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
    protected LdLibrary downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdLibrary.class);
    }
}

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
 * The behavior of GENRE that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     GENRE_CODE
 * 
 * [column]
 *     GENRE_CODE, GENRE_NAME, HIERARCHY_LEVEL, HIERARCHY_ORDER, PARENT_GENRE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     GENRE
 * 
 * [referrer-table]
 *     BOOK, GENRE
 * 
 * [foreign-property]
 *     genreSelf
 * 
 * [referrer-property]
 *     bookList, genreSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsGenreBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "GENRE"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdGenreDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdGenreDbm getMyDBMeta() { return LdGenreDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdGenre newMyEntity() { return new LdGenre(); }
    public LdGenreCB newMyConditionBean() { return new LdGenreCB(); }

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
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdGenreCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdGenre selectEntity(final LdGenreCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdGenre, LdGenreCB>() {
            public List<LdGenre> callbackSelectList(LdGenreCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdGenre selectEntityWithDeletedCheck(final LdGenreCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdGenre, LdGenreCB>() {
            public List<LdGenre> callbackSelectList(LdGenreCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdGenre selectByPKValueWithDeletedCheck(String genreCode) {
        LdGenre entity = new LdGenre();
        entity.setGenreCode(genreCode);
        final LdGenreCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdGenre> selectList(LdGenreCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdGenre>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdGenre> selectPage(final LdGenreCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdGenre> invoker = new LdPagingInvoker<LdGenre>(getTableDbName());
        final LdPagingHandler<LdGenre> handler = new LdPagingHandler<LdGenre>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdGenre> paging() { return selectList(cb); }
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
     * genreBhv.scalarSelect(Date.class).max(new ScalarQuery(LdGenreCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdGenreCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdGenreCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdGenreCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdGenre. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdGenreCB cb, LdValueLabelSetupper<LdGenre> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer of bookList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setGenreCode_InScope(pkList);
     * cb.query().addOrderBy_GenreCode_Asc();
     * </pre>
     * @param genreList The entity list of genre. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadBookList(List<LdGenre> genreList, LdConditionBeanSetupper<LdBookCB> conditionBeanSetupper) {
        assertObjectNotNull("genreList<LdGenre>", genreList);
        assertObjectNotNull("conditionBeanSetupper<LdBookCB>", conditionBeanSetupper);
        if (genreList.isEmpty()) { return; }
        loadBookList(genreList, new LdLoadReferrerOption<LdBookCB, LdBook>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param genreList The entity list of genre. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBookList(List<LdGenre> genreList, LdLoadReferrerOption<LdBookCB, LdBook> loadReferrerOption) {
        assertObjectNotNull("genreList<LdGenre>", genreList);
        assertObjectNotNull("loadReferrerOption<LdBook, LdBookCB>", loadReferrerOption);
        if (genreList.isEmpty()) { return; }
        final LdBookBhv referrerBhv = xgetBSFLR().select(LdBookBhv.class);
        helpLoadReferrerInternally(genreList, loadReferrerOption, new InternalLoadReferrerCallback<LdGenre, String, LdBookCB, LdBook>() {
            public String callbackBase_getPrimaryKeyValue(LdGenre entity) { return entity.getGenreCode(); }
            public void callbackBase_setReferrerList(LdGenre entity, List<LdBook> referrerList) { entity.setBookList(referrerList); }
            public LdBookCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(LdBookCB cb, List<String> pkList) { cb.query().setGenreCode_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(LdBookCB cb) { cb.query().addOrderBy_GenreCode_Asc(); }
            public List<LdBook> callbackReferrer_selectList(LdBookCB cb) { return referrerBhv.selectList(cb); }
            public String callbackReferrer_getForeignKeyValue(LdBook entity) { return entity.getGenreCode(); }
            public void callbackReferrer_setForeignEntity(LdBook referrerEntity, LdGenre baseEntity) { referrerEntity.setGenre(baseEntity); }
        } );
    }
    /**
     * Load referrer of genreSelfList with the setupper for condition-bean of referrer. <br />
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the setupper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setParentGenreCode_InScope(pkList);
     * cb.query().addOrderBy_ParentGenreCode_Asc();
     * </pre>
     * @param genreList The entity list of genre. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadGenreSelfList(List<LdGenre> genreList, LdConditionBeanSetupper<LdGenreCB> conditionBeanSetupper) {
        assertObjectNotNull("genreList<LdGenre>", genreList);
        assertObjectNotNull("conditionBeanSetupper<LdGenreCB>", conditionBeanSetupper);
        if (genreList.isEmpty()) { return; }
        loadGenreSelfList(genreList, new LdLoadReferrerOption<LdGenreCB, LdGenre>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param genreList The entity list of genre. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadGenreSelfList(List<LdGenre> genreList, LdLoadReferrerOption<LdGenreCB, LdGenre> loadReferrerOption) {
        assertObjectNotNull("genreList<LdGenre>", genreList);
        assertObjectNotNull("loadReferrerOption<LdGenre, LdGenreCB>", loadReferrerOption);
        if (genreList.isEmpty()) { return; }
        final LdGenreBhv referrerBhv = xgetBSFLR().select(LdGenreBhv.class);
        helpLoadReferrerInternally(genreList, loadReferrerOption, new InternalLoadReferrerCallback<LdGenre, String, LdGenreCB, LdGenre>() {
            public String callbackBase_getPrimaryKeyValue(LdGenre entity) { return entity.getGenreCode(); }
            public void callbackBase_setReferrerList(LdGenre entity, List<LdGenre> referrerList) { entity.setGenreSelfList(referrerList); }
            public LdGenreCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(LdGenreCB cb, List<String> pkList) { cb.query().setParentGenreCode_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(LdGenreCB cb) { cb.query().addOrderBy_ParentGenreCode_Asc(); }
            public List<LdGenre> callbackReferrer_selectList(LdGenreCB cb) { return referrerBhv.selectList(cb); }
            public String callbackReferrer_getForeignKeyValue(LdGenre entity) { return entity.getParentGenreCode(); }
            public void callbackReferrer_setForeignEntity(LdGenre referrerEntity, LdGenre baseEntity) { referrerEntity.setGenreSelf(baseEntity); }
        } );
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'LdGenre'.
     * @param genreList The list of genre. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdGenre> pulloutGenreSelf(List<LdGenre> genreList) {
        return helpPulloutInternally(genreList, new InternalPulloutCallback<LdGenre, LdGenre>() {
            public LdGenre callbackGetForeignEntity(LdGenre entity) { return entity.getGenreSelf(); } });
    }
    
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param genre The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdGenre genre) {
        assertEntityNotNull(genre);
        delegateInsert(genre);
    }

    @Override
    protected void doCreate(LdEntity genre) {
        insert((LdGenre)genre);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param genre The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdGenre genre) {
        helpUpdateInternally(genre, new InternalUpdateCallback<LdGenre>() {
            public int callbackDelegateUpdate(LdGenre entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdGenre)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param genre The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdGenre genre) {
        helpUpdateNonstrictInternally(genre, new InternalUpdateNonstrictCallback<LdGenre>() {
            public int callbackDelegateUpdateNonstrict(LdGenre entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdGenre)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param genre The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdGenre genre) {
        helpInsertOrUpdateInternally(genre, new InternalInsertOrUpdateCallback<LdGenre, LdGenreCB>() {
            public void callbackInsert(LdGenre entity) { insert(entity); }
            public void callbackUpdate(LdGenre entity) { update(entity); }
            public LdGenreCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdGenreCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity genre) {
        insertOrUpdate((LdGenre)genre);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param genre The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdGenre genre) {
        helpInsertOrUpdateInternally(genre, new InternalInsertOrUpdateNonstrictCallback<LdGenre>() {
            public void callbackInsert(LdGenre entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdGenre entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdGenre)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param genre The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdGenre genre) {
        helpDeleteInternally(genre, new InternalDeleteCallback<LdGenre>() {
            public int callbackDelegateDelete(LdGenre entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity genre) {
        delete((LdGenre)genre);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param genre Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdGenre genre) {
        helpDeleteNonstrictInternally(genre, new InternalDeleteNonstrictCallback<LdGenre>() {
            public int callbackDelegateDeleteNonstrict(LdGenre entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param genre Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdGenre genre) {
        helpDeleteNonstrictIgnoreDeletedInternally(genre, new InternalDeleteNonstrictIgnoreDeletedCallback<LdGenre>() {
            public int callbackDelegateDeleteNonstrict(LdGenre entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param genreList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdGenre> genreList) {
        assertObjectNotNull("genreList", genreList);
        return delegateInsertList(genreList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param genreList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdGenre> genreList) {
        assertObjectNotNull("genreList", genreList);
        return delegateUpdateList(genreList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param genreList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdGenre> genreList) {
        assertObjectNotNull("genreList", genreList);
        return delegateUpdateListNonstrict(genreList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param genreList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdGenre> genreList) {
        assertObjectNotNull("genreList", genreList);
        return delegateDeleteList(genreList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param genreList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdGenre> genreList) {
        assertObjectNotNull("genreList", genreList);
        return delegateDeleteListNonstrict(genreList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Query update the several entities. {NoConcurrencyControl}
     * @param genre Entity. (NotNull) {PrimaryKeyNotRequired}
     * @param cb Condition-bean. (NotNull)
     * @return The updated count.
     */
    public int queryUpdate(LdGenre genre, LdGenreCB cb) {
        assertObjectNotNull("genre", genre); assertCBNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(genre);
        filterEntityOfUpdate(genre); assertEntityOfUpdate(genre);
        return invoke(createQueryUpdateEntityCBCommand(genre, cb));
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(LdGenreCB cb) {
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
    protected int delegateSelectCount(LdGenreCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdGenreCB)cb); }
    protected List<LdGenre> delegateSelectList(LdGenreCB cb) {
        return invoke(createSelectListCBCommand(cb, LdGenre.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdGenreCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdGenre e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdGenre e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdGenre e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdGenre e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdGenre e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdGenre> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdGenre> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdGenre> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdGenre> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdGenre> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdGenre..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdGenre. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdGenre, LdGenreDbm.GenreRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdGenre, LdGenreDbm.GenreRelationTrace> request = new LdHierarchyBasicRequest<LdGenre, LdGenreDbm.GenreRelationTrace>(LdGenre.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdGenre. (NotNull)
     * @return The list of LdGenre. (NotNull)
     */
    public List<LdGenre> arrangeHierarchy(LdHierarchyRequest<LdGenre> request) {
        return new LdHierarchyArranger<LdGenre>().arrangeHierarchy(request);
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
    protected LdGenre downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdGenre.class);
    }
}

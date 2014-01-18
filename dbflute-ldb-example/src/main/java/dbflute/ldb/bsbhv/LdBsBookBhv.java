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
 * The behavior of BOOK that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     BOOK_ID
 * 
 * [column]
 *     BOOK_ID, ISBN, BOOK_NAME, AUTHOR_ID, PUBLISHER_ID, GENRE_CODE, OPENING_PART, MAX_LENDING_DATE_COUNT, OUT_OF_USER_SELECT_YN, OUT_OF_USER_SELECT_REASON, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     BOOK_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     AUTHOR, GENRE, PUBLISHER, COLLECTION_STATUS_LOOKUP(AsNonExist)
 * 
 * [referrer-table]
 *     COLLECTION
 * 
 * [foreign-property]
 *     author, genre, publisher, collectionStatusLookupAsNonExist
 * 
 * [referrer-property]
 *     collectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBookBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    public static final String PATH_selectList = "selectList";
    public static final String PATH_update = "update";
    public static final String PATH_updateNoPmb = "updateNoPmb";
    public static final String PATH_updateTwiceTest = "updateTwiceTest";
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BOOK"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdBookDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdBookDbm getMyDBMeta() { return LdBookDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdBook newMyEntity() { return new LdBook(); }
    public LdBookCB newMyConditionBean() { return new LdBookCB(); }

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
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdBookCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdBook selectEntity(final LdBookCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdBook, LdBookCB>() {
            public List<LdBook> callbackSelectList(LdBookCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdBook selectEntityWithDeletedCheck(final LdBookCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdBook, LdBookCB>() {
            public List<LdBook> callbackSelectList(LdBookCB cb) { return selectList(cb); } });
    }

    /* (non-javadoc)
     * Select the entity with deleted check. {by primary-key value}
     * @param primaryKey The keys of primary.
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdBook selectByPKValueWithDeletedCheck(Integer bookId) {
        LdBook entity = new LdBook();
        entity.setBookId(bookId);
        final LdBookCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
        return selectEntityWithDeletedCheck(cb);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdBook> selectList(LdBookCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdBook>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdBook. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdBook> selectPage(final LdBookCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdBook> invoker = new LdPagingInvoker<LdBook>(getTableDbName());
        final LdPagingHandler<LdBook> handler = new LdPagingHandler<LdBook>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdBook> paging() { return selectList(cb); }
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
     * bookBhv.scalarSelect(Date.class).max(new ScalarQuery(LdBookCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdBookCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdBookCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdBookCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdBook. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdBookCB cb, LdValueLabelSetupper<LdBook> valueLabelSetupper) {
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
     * cb.query().setBookId_InScope(pkList);
     * cb.query().addOrderBy_BookId_Asc();
     * </pre>
     * @param bookList The entity list of book. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean setupper for registering referrer condition. (NotNull)
     */
    public void loadCollectionList(List<LdBook> bookList, LdConditionBeanSetupper<LdCollectionCB> conditionBeanSetupper) {
        assertObjectNotNull("bookList<LdBook>", bookList);
        assertObjectNotNull("conditionBeanSetupper<LdCollectionCB>", conditionBeanSetupper);
        if (bookList.isEmpty()) { return; }
        loadCollectionList(bookList, new LdLoadReferrerOption<LdCollectionCB, LdCollection>(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param bookList The entity list of book. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadCollectionList(List<LdBook> bookList, LdLoadReferrerOption<LdCollectionCB, LdCollection> loadReferrerOption) {
        assertObjectNotNull("bookList<LdBook>", bookList);
        assertObjectNotNull("loadReferrerOption<LdCollection, LdCollectionCB>", loadReferrerOption);
        if (bookList.isEmpty()) { return; }
        final LdCollectionBhv referrerBhv = xgetBSFLR().select(LdCollectionBhv.class);
        helpLoadReferrerInternally(bookList, loadReferrerOption, new InternalLoadReferrerCallback<LdBook, Integer, LdCollectionCB, LdCollection>() {
            public Integer callbackBase_getPrimaryKeyValue(LdBook entity) { return entity.getBookId(); }
            public void callbackBase_setReferrerList(LdBook entity, List<LdCollection> referrerList) { entity.setCollectionList(referrerList); }
            public LdCollectionCB callbackReferrer_newMyConditionBean() { return referrerBhv.newMyConditionBean(); }
            public void callbackReferrer_queryForeignKeyInScope(LdCollectionCB cb, List<Integer> pkList) { cb.query().setBookId_InScope(pkList); }
            public void callbackReferrer_queryAddOrderByForeignKeyAsc(LdCollectionCB cb) { cb.query().addOrderBy_BookId_Asc(); }
            public List<LdCollection> callbackReferrer_selectList(LdCollectionCB cb) { return referrerBhv.selectList(cb); }
            public Integer callbackReferrer_getForeignKeyValue(LdCollection entity) { return entity.getBookId(); }
            public void callbackReferrer_setForeignEntity(LdCollection referrerEntity, LdBook baseEntity) { referrerEntity.setBook(baseEntity); }
        } );
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'LdAuthor'.
     * @param bookList The list of book. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdAuthor> pulloutAuthor(List<LdBook> bookList) {
        return helpPulloutInternally(bookList, new InternalPulloutCallback<LdBook, LdAuthor>() {
            public LdAuthor callbackGetForeignEntity(LdBook entity) { return entity.getAuthor(); } });
    }
    /**
     * Pull out the list of foreign table 'LdGenre'.
     * @param bookList The list of book. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdGenre> pulloutGenre(List<LdBook> bookList) {
        return helpPulloutInternally(bookList, new InternalPulloutCallback<LdBook, LdGenre>() {
            public LdGenre callbackGetForeignEntity(LdBook entity) { return entity.getGenre(); } });
    }
    /**
     * Pull out the list of foreign table 'LdPublisher'.
     * @param bookList The list of book. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdPublisher> pulloutPublisher(List<LdBook> bookList) {
        return helpPulloutInternally(bookList, new InternalPulloutCallback<LdBook, LdPublisher>() {
            public LdPublisher callbackGetForeignEntity(LdBook entity) { return entity.getPublisher(); } });
    }
    /**
     * Pull out the list of foreign table 'LdCollectionStatusLookup'.
     * @param bookList The list of book. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<LdCollectionStatusLookup> pulloutCollectionStatusLookupAsNonExist(List<LdBook> bookList) {
        return helpPulloutInternally(bookList, new InternalPulloutCallback<LdBook, LdCollectionStatusLookup>() {
            public LdCollectionStatusLookup callbackGetForeignEntity(LdBook entity) { return entity.getCollectionStatusLookupAsNonExist(); } });
    }
  
    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * @param book The entity of insert target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(LdBook book) {
        assertEntityNotNull(book);
        delegateInsert(book);
    }

    @Override
    protected void doCreate(LdEntity book) {
        insert((LdBook)book);
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ConcurrencyControl}
     * @param book The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final LdBook book) {
        helpUpdateInternally(book, new InternalUpdateCallback<LdBook>() {
            public int callbackDelegateUpdate(LdBook entity) { return delegateUpdate(entity); } });
    }

    @Override
    protected void doModify(LdEntity entity) {
        update((LdBook)entity);
    }
    
    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonConcurrencyControl}
     * @param book The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final LdBook book) {
        helpUpdateNonstrictInternally(book, new InternalUpdateNonstrictCallback<LdBook>() {
            public int callbackDelegateUpdateNonstrict(LdBook entity) { return delegateUpdateNonstrict(entity); } });
    }

    @Override
    protected void doModifyNonstrict(LdEntity entity) {
        updateNonstrict((LdBook)entity);
    }

    /**
     * Insert or update the entity modified-only. {ConcurrencyControl(when update)}
     * @param book The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(final LdBook book) {
        helpInsertOrUpdateInternally(book, new InternalInsertOrUpdateCallback<LdBook, LdBookCB>() {
            public void callbackInsert(LdBook entity) { insert(entity); }
            public void callbackUpdate(LdBook entity) { update(entity); }
            public LdBookCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(LdBookCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrUpdate(LdEntity book) {
        insertOrUpdate((LdBook)book);
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonConcurrencyControl(when update)}
     * @param book The entity of insert or update target. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(LdBook book) {
        helpInsertOrUpdateInternally(book, new InternalInsertOrUpdateNonstrictCallback<LdBook>() {
            public void callbackInsert(LdBook entity) { insert(entity); }
            public void callbackUpdateNonstrict(LdBook entity) { updateNonstrict(entity); }
        });
    }

    @Override
    protected void doCreateOrUpdateNonstrict(LdEntity entity) {
        insertOrUpdateNonstrict((LdBook)entity);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ConcurrencyControl}
     * @param book The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(LdBook book) {
        helpDeleteInternally(book, new InternalDeleteCallback<LdBook>() {
            public int callbackDelegateDelete(LdBook entity) { return delegateDelete(entity); } });
    }

    @Override
    protected void doRemove(LdEntity book) {
        delete((LdBook)book);
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonConcurrencyControl}
     * @param book Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(LdBook book) {
        helpDeleteNonstrictInternally(book, new InternalDeleteNonstrictCallback<LdBook>() {
            public int callbackDelegateDeleteNonstrict(LdBook entity) { return delegateDeleteNonstrict(entity); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonConcurrencyControl}
     * @param book Entity. (NotNull) {PrimaryKeyRequired}
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(LdBook book) {
        helpDeleteNonstrictIgnoreDeletedInternally(book, new InternalDeleteNonstrictIgnoreDeletedCallback<LdBook>() {
            public int callbackDelegateDeleteNonstrict(LdBook entity) { return delegateDeleteNonstrict(entity); } });
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch insert the list. This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param bookList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<LdBook> bookList) {
        assertObjectNotNull("bookList", bookList);
        return delegateInsertList(bookList);
    }

    /**
     * Batch update the list. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param bookList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchUpdate(List<LdBook> bookList) {
        assertObjectNotNull("bookList", bookList);
        return delegateUpdateList(bookList);
    }

    /**
     * Batch update the list non-strictly. All columns are update target. {NOT modified only} <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param bookList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<LdBook> bookList) {
        assertObjectNotNull("bookList", bookList);
        return delegateUpdateListNonstrict(bookList);
    }

    /**
     * Batch delete the list. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param bookList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdBatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends ${glEntityAlreadyUpdateException}.
     */
    public int[] batchDelete(List<LdBook> bookList) {
        assertObjectNotNull("bookList", bookList);
        return delegateDeleteList(bookList);
    }

    /**
     * Batch delete the list non-strictly. <br />
     * This method use 'Batch Update' of java.sql.PreparedStatement.
     * @param bookList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<LdBook> bookList) {
        assertObjectNotNull("bookList", bookList);
        return delegateDeleteListNonstrict(bookList);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Query update the several entities. {NoConcurrencyControl}
     * @param book Entity. (NotNull) {PrimaryKeyNotRequired}
     * @param cb Condition-bean. (NotNull)
     * @return The updated count.
     */
    public int queryUpdate(LdBook book, LdBookCB cb) {
        assertObjectNotNull("book", book); assertCBNotNull(cb);
        setupCommonColumnOfUpdateIfNeeds(book);
        filterEntityOfUpdate(book); assertEntityOfUpdate(book);
        return invoke(createQueryUpdateEntityCBCommand(book, cb));
    }

    /**
     * Query delete the several entities. {NoConcurrencyControl}
     * @param cb Condition-bean. (NotNull)
     * @return The deleted count.
     */
    public int queryDelete(LdBookCB cb) {
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
    protected int delegateSelectCount(LdBookCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdBookCB)cb); }
    protected List<LdBook> delegateSelectList(LdBookCB cb) {
        return invoke(createSelectListCBCommand(cb, LdBook.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdBookCB)cb); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(LdBook e) {
        if (!processBeforeInsert(e)) { return 1; } return invoke(createInsertEntityCommand(e));
    }
    protected int doCallCreate(LdEntity entity) {return delegateInsert(downcast(entity)); }
    protected int delegateUpdate(LdBook e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateEntityCommand(e));
    }
    protected int doCallModify(LdEntity entity) { return delegateUpdate(downcast(entity)); }
    protected int delegateUpdateNonstrict(LdBook e) {
        if (!processBeforeUpdate(e)) { return 1; } return invoke(createUpdateNonstrictEntityCommand(e));
    }
    protected int delegateDelete(LdBook e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteEntityCommand(e));
    }
    protected int doCallRemove(LdEntity entity) { return delegateDelete(downcast(entity)); }
    protected int delegateDeleteNonstrict(LdBook e) {
        if (!processBeforeDelete(e)) { return 1; } return invoke(createDeleteNonstrictEntityCommand(e));
    }

    protected int[] delegateInsertList(List<LdBook> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchInsertEntityCommand(helpFilterBeforeInsertInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doCreateList(List<LdEntity> ls) { return delegateInsertList((List)ls); }
    protected int[] delegateUpdateList(List<LdBook> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doModifyList(List<LdEntity> ls) { return delegateUpdateList((List)ls); }
    protected int[] delegateUpdateListNonstrict(List<LdBook> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchUpdateNonstrictEntityCommand(helpFilterBeforeUpdateInternally(ls)));
    }
    protected int[] delegateDeleteList(List<LdBook> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }
    @SuppressWarnings("unchecked")
    protected int[] doRemoveList(List<LdEntity> ls) { return delegateDeleteList((List)ls); }
    protected int[] delegateDeleteListNonstrict(List<LdBook> ls) {
        if (ls.isEmpty()) { return new int[]{}; }
        return invoke(createBatchDeleteNonstrictEntityCommand(helpFilterBeforeDeleteInternally(ls)));
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdBook..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdBook. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdBook, LdBookDbm.BookRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdBook, LdBookDbm.BookRelationTrace> request = new LdHierarchyBasicRequest<LdBook, LdBookDbm.BookRelationTrace>(LdBook.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdBook. (NotNull)
     * @return The list of LdBook. (NotNull)
     */
    public List<LdBook> arrangeHierarchy(LdHierarchyRequest<LdBook> request) {
        return new LdHierarchyArranger<LdBook>().arrangeHierarchy(request);
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
    protected LdBook downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdBook.class);
    }
}


package dbflute.ldb.bsbhv;

import dbflute.ldb.allcommon.*;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdPagingBean;
import dbflute.ldb.allcommon.cbean.LdPagingResultBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
  
import dbflute.ldb.exbhv.*;
  
import dbflute.ldb.exdao.*;
import dbflute.ldb.exentity.*;
import dbflute.ldb.bsentity.dbmeta.*;
import dbflute.ldb.cbean.*;



/**
 * The behavior of BOOK.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBookBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Dao instance. */
    protected LdBookDao _dao;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBsBookBhv() {
    }

    // =====================================================================================
    //                                                                            Table name
    //                                                                            ==========
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Table db-name. (NotNull)
     */
    public String getTableDbName() {
        return "BOOK";
    }

    // =====================================================================================
    //                                                                                DBMeta
    //                                                                                ======
    /**
     * This method implements the method that is declared at super.
     * 
     * @return DBMeta. (NotNull)
     */
    public LdDBMeta getDBMeta() {
        return LdBookDbm.getInstance();
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    /**
     * Get my dao.
     * 
     * @return My dao.
     */
    public LdBookDao getMyDao() {
        return _dao;
    }

    /**
     * Set my dao.
     * 
     * @param dao My dao. (NotNull)
     */
    public void setMyDao(LdBookDao dao) {
        assertObjectNotNull("dao", dao);
        _dao = dao;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Dao-readable. (NotNull)
     */
    public LdDaoReadable getDaoReadable() {
        return getMyDao();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Dao-writable. (NotNull)
     */
    public LdDaoWritable getDaoWritable() {
        return getMyDao();
    }

    // =====================================================================================
    //                                                                          New Instance
    //                                                                          ============

    /**
     * New my entity.
     * 
     * @return My entity. (NotNull)
     */
    public LdBook newMyEntity() {
        return new LdBook();
    }

    /**
     * New my condition-bean.
     * 
     * @return My condition-bean. (NotNull)
     */
    public LdBookCB newMyConditionBean() {
        return new LdBookCB();
    }

    // =====================================================================================
    //                                                                       Delegate Method
    //                                                                       ===============
    /**
     * Get count as all. (Delegate-Method)
     * 
     * @return All count. (NotNull)
     */
    public int delegateGetCountAllTx() {
        return getMyDao().getCountAll();
    }

    /**
     * Get list as all. (Delegate-Method)
     * 
     * @return All list. (NotNull)
     */
    public java.util.List<LdBook> delegateGetListAllTx() {
        return getMyDao().getListAll();
    }

    //
    // Get entity. (Delegate-Method)
    // 
    // @param Primary-keys (NotNull)
    // @return Entity. (NotNull)
    //
    public LdBook delegateGetEntityTx(java.math.BigDecimal bookId) {
        return getMyDao().getEntity(bookId);
    }

    /**
     * Select count by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int delegateSelectCountIgnoreFetchScopeTx(LdBookCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectCountIgnoreFetchScope(cb);
    }

    /**
     * Select entity by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdBook delegateSelectEntityTx(LdBookCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectEntity(cb);
    }

    /**
     * Select list by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected list. If the select result is zero, it returns empty list. (NotNull)
     */
    public java.util.List<LdBook> delegateSelectListTx(LdBookCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectList(cb);
    }


    /**
     * Select next value as sequence. (Delegate-Method)
     * 
     * @return Next value. (NotNull)
     */
    public java.math.BigDecimal delegateSelectNextValTx() {
        return getMyDao().selectNextVal();
    }


    /**
     * Insert one entity. (Delegate-Method)
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int delegateInsertTx(LdBook entity) {
        assertEntityNotNull(entity);// If this table use identity, the entity does not have primary-key.
        filterEntityOfInsert(entity);
        assertEntityOfInsert(entity);
        return getMyDao().insert(entity);
    }

    /**
     * Update one entity. (Delegate-Method)
     * 
     * @param entity Entity. (NotNull)
     * @return Updated count.
     */
    public int delegateUpdateTx(LdBook entity) {
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        filterEntityOfUpdate(entity);
        assertEntityOfUpdate(entity);
        return getMyDao().update(entity);
    }

    /**
     * Delete one entity. (Delegate-Method)
     * 
     * @param entity Entity. (NotNull)
     * @return Deleted count.
     */
    public int delegateDeleteTx(LdBook entity) {
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        filterEntityOfDelete(entity);
        assertEntityOfDelete(entity);
        return getMyDao().delete(entity);
    }

    /**
     * Insert several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Inserted count.
     */
    public int delegateInsertListTx(java.util.List<LdBook> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().insertList(entityList);
    }

    /**
     * Update several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Updated count.
     */
    public int delegateUpdateListTx(java.util.List<LdBook> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().updateList(entityList);
    }

    /**
     * Delete several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Deleted count.
     */
    public int delegateDeleteListTx(java.util.List<LdBook> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().deleteList(entityList);
    }

    // =====================================================================================
    //                                                                          Basic Select
    //                                                                          ============
    /**
     * Select list.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return List-result-bean. (NotNull)
     */
    public LdListResultBean<LdBook> selectListTx(LdBookCB cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<LdBook>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }

    /**
     * Select page.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected page as first page. (NotNull)
     */
    public LdPagingResultBean<LdBook> selectPageTx(final LdBookCB cb) {
        assertConditionBeanNotNull(cb);
        final SelectPageCallback<LdBook> pageCallback = new SelectPageCallback<LdBook>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int selectCountIgnoreFetchScope() {
                return delegateSelectCountIgnoreFetchScopeTx(cb);
            }
            public java.util.List<LdBook> selectList() {
                return delegateSelectListTx(cb);
            }
        };
        return new SelectPageInvoker<LdBook>(this).invokeSelectPage(pageCallback);
    }

    /**
     * Select entity by condition-bean with deleted check.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdBook selectEntityWithDeletedCheckTx(LdBookCB cb) {
        assertConditionBeanNotNull(cb);
        dbflute.ldb.exentity.LdBook currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, cb.toString());
        return currentEntity;
    }

    // =====================================================================================
    //                                                                        Various Select
    //                                                                        ==============

    /**
     * Select list after checking count(ignore fetch scope).
     * 
     * @param cb Condition-bean. (NotNull)
     * @param maxCount Max count.
     * @return List-result-bean. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdSelectedCountExceedMaxCountException
     */
    public LdListResultBean selectListAfterCheckingCountIgnoreFetchScopeTx(LdBookCB cb, int maxCount) {
        assertConditionBeanNotNull(cb);
        final int selectedCount = delegateSelectCountIgnoreFetchScopeTx(cb);
        assertSelectedCountHasNotExceededMaxCount(selectedCount, maxCount, cb.toString());
        return new ResultBeanBuilder<LdBook>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }


    public LdBook selectForReadOnlyByPKValueWithDeletedCheckTx(java.math.BigDecimal bookId) {
        LdBook entity = new LdBook();
        entity.setBookId(bookId);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for read only with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-read-only. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdBook selectForReadOnlyByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdBookCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString);
        final dbflute.ldb.exentity.LdBook currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }

    public LdBook selectForUpdateByPKValueWithDeletedCheckTx(java.math.BigDecimal bookId) {
        LdBook entity = new LdBook();
        entity.setBookId(bookId);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for update with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdBook selectForUpdateByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdBookCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString).lockForUpdate();
        final dbflute.ldb.exentity.LdBook currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }


    // =====================================================================================
    //                                                                         Load Refferer
    //                                                                         =============
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ReffererTable    = [COLLECTION]
    //   ReffererProperty = [collectionList]
    // * * * * * * * * */

    /**
     * Load refferer of collectionList.
     * 
     * Default refferer order-by is 'primary-key asc'.
     * <pre>
     *   ex) Refferer order-by is BookId.
     * 
     *     final LdBsBookBhv bhv = (LdBsBookBhv)getDaoSelector().getRBhv(LdBsBookBhv.class);
     *     final LdBookCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdBook> ls = bhv.delegateSelectList(cb);
     *     bhv.loadCollectionList(ls);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     */
    public void loadCollectionList(java.util.List<LdBook> ls) {
        final ReffererConditionCollectionList reffererCondition = new ReffererConditionCollectionList() {
            public void setup(LdCollectionCB cb) {
                cb.addOrderBy_PK_Asc();// Default OrderBy for Refferer.
            }
        };
        loadCollectionList(ls, reffererCondition);
    }

    /**
     * Load refferer of collectionList.
     * 
     * <pre>
     *   ex) Refferer order-by is BookId.
     * 
     *     final LdBsBookBhv bhv = (LdBsBookBhv)getDaoSelector().getRBhv(LdBsBookBhv.class);
     *     final LdBookCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdBook> ls = bhv.delegateSelectList(cb);
     *     final ReffererConditionCollectionList reffererCondition = new ReffererConditionCollectionList() {
     *         public void setup(LdCollectionCB cb) {
     *             cb.query().addOrderBy_BookId_Asc();
     *         }
     *     };
     *     bhv.loadCollectionList(ls, reffererCondition);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     * @param reffererCondition Refferer condition instance for registering refferer condition. (NotNull)
     */
    public void loadCollectionList(java.util.List<LdBook> ls, ReffererConditionCollectionList reffererCondition) {
        assertObjectNotNull("ls", ls);
        assertObjectNotNull("reffererCondition", reffererCondition);
        if (ls.isEmpty()) {
            return;
        }

        final java.util.Map<java.math.BigDecimal, LdBook> pkMyEntityMap = new java.util.LinkedHashMap<java.math.BigDecimal, LdBook>();
        final java.util.List<java.math.BigDecimal> pkList = new java.util.ArrayList<java.math.BigDecimal>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdBook entity = (LdBook)ite.next();
            pkList.add(entity.getBookId());
            pkMyEntityMap.put(entity.getBookId(), entity);
        }
        final LdCollectionBhv reffererBhv = (LdCollectionBhv)getDaoSelector().getRBhv(LdCollectionBhv.class);
        final LdCollectionCB cb = reffererBhv.newMyConditionBean();
        cb.query().setBookId_InScope(pkList);
        cb.query().addOrderBy_BookId_Asc();
        reffererCondition.setup(cb);
        final java.util.List<LdCollection> reffererList = reffererBhv.delegateSelectListTx(cb);

        final java.util.Map<java.math.BigDecimal, java.util.List<LdCollection>> pkReffererListMap;
        pkReffererListMap = new java.util.LinkedHashMap<java.math.BigDecimal, java.util.List<LdCollection>>();
        for (final java.util.Iterator ite = reffererList.iterator(); ite.hasNext(); ) {
            final LdCollection reffererEntity = (LdCollection)ite.next();
            if (!pkReffererListMap.containsKey(reffererEntity.getBookId())) {
                pkReffererListMap.put(reffererEntity.getBookId(), new java.util.ArrayList<LdCollection>());
            }
            ((java.util.List<LdCollection>)pkReffererListMap.get(reffererEntity.getBookId())).add(reffererEntity);

            // for Reverse Reference.
            final LdBook myEntity = (LdBook)pkMyEntityMap.get(reffererEntity.getBookId());
            reffererEntity.setBook(myEntity);
        }

        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdBook entity = (LdBook)ite.next();
            entity.setCollectionList((java.util.List<LdCollection>)pkReffererListMap.get(entity.getBookId()));
        }
    }

    /**
     * The interface of refferer condition for collectionList.
     */
    public static interface ReffererConditionCollectionList {
        /**
         * Set up refferer condition.
         * 
         * @param cb Condition-bean for refferer. (NotNull)
         */
        public void setup(LdCollectionCB cb);
    }
  
    // =====================================================================================
    //                                                                          Basic Update
    //                                                                          ============


    /**
     * Insert or update after select-for-update.
     * 
     * @param entity Entity. This must contain primary-key value at least. (NotNull)
     * @return Updated count.
     */
    public int insertOrUpdateAfterSelectForUpdateTx(LdBook entity) {
        assertEntityNotNull(entity);
        final String mapString = entity.extractPrimaryKeyMapString();
        LdBook currentEntity = null;
        try {
            currentEntity = selectForUpdateByPKMapStringWithDeletedCheckTx(mapString);
        } catch (dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException e) {
            return delegateInsertTx(entity);
        }
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        mergeEntity(entity, currentEntity);
        return delegateUpdateTx(currentEntity);
    }

    /**
     * Update after select-for-update.
     * 
     * @param entity Entity. This must contain primary-key value at least. (NotNull)
     * @return Updated count.
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public int updateAfterSelectForUpdateTx(LdBook entity) {
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        final LdBook currentEntity = selectForUpdateByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
        mergeEntity(entity, currentEntity);
        return delegateUpdateTx(currentEntity);
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param sourceEntity Source entity. (NotNull)
     * @param destinationEntity Destination entity. (NotNull)
     */
    protected void mergeEntity(LdEntity sourceEntity, LdEntity destinationEntity) {
        assertEntityNotNull(sourceEntity);
        assertEntityNotNull(destinationEntity);
        final LdBook sourceMyEntity = (LdBook)sourceEntity;
        final LdBook destinationMyEntity = (LdBook)destinationEntity;
  
        if (sourceMyEntity.isSetterInvokedBookId()) {
            destinationMyEntity.setBookId(sourceMyEntity.getBookId());
        }
  
        if (sourceMyEntity.isSetterInvokedIsbnNo()) {
            destinationMyEntity.setIsbnNo(sourceMyEntity.getIsbnNo());
        }
  
        if (sourceMyEntity.isSetterInvokedBookName()) {
            destinationMyEntity.setBookName(sourceMyEntity.getBookName());
        }
  
        if (sourceMyEntity.isSetterInvokedAuthorId()) {
            destinationMyEntity.setAuthorId(sourceMyEntity.getAuthorId());
        }
  
        if (sourceMyEntity.isSetterInvokedPublisherId()) {
            destinationMyEntity.setPublisherId(sourceMyEntity.getPublisherId());
        }
  
        if (sourceMyEntity.isSetterInvokedMaxLendingDateCount()) {
            destinationMyEntity.setMaxLendingDateCount(sourceMyEntity.getMaxLendingDateCount());
        }
  
        if (sourceMyEntity.isSetterInvokedGenreCode()) {
            destinationMyEntity.setGenreCode(sourceMyEntity.getGenreCode());
        }
  
        if (sourceMyEntity.isSetterInvokedOpeningPart()) {
            destinationMyEntity.setOpeningPart(sourceMyEntity.getOpeningPart());
        }
  
        if (sourceMyEntity.isSetterInvokedRTime()) {
            destinationMyEntity.setRTime(sourceMyEntity.getRTime());
        }
  
        if (sourceMyEntity.isSetterInvokedUTime()) {
            destinationMyEntity.setUTime(sourceMyEntity.getUTime());
        }
  
        if (sourceMyEntity.isSetterInvokedRStaff()) {
            destinationMyEntity.setRStaff(sourceMyEntity.getRStaff());
        }
  
        if (sourceMyEntity.isSetterInvokedUStaff()) {
            destinationMyEntity.setUStaff(sourceMyEntity.getUStaff());
        }
  
    }

    // =====================================================================================
    //                                                                        Various Update
    //                                                                        ==============

  
  
      
    // 
    // Copy-insert after select-for-update.
    // 
    // @param primaryKey Primary-keys. (NotNull)
    // @return Inserted count.
    // @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
    // 
    public int copyInsertByPKValueAfterSelectForReadOnlyTx(java.math.BigDecimal bookId) {
        LdBook entity = new LdBook();
        entity.setBookId(bookId);
        return copyInsertByPKMapStringAfterSelectForReadOnlyTx(entity.extractPrimaryKeyMapString());
    }
    
    /**
     * Copy-insert after select for read only.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Inserted count.
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public int copyInsertByPKMapStringAfterSelectForReadOnlyTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdBook currentEntity = selectForReadOnlyByPKMapStringWithDeletedCheckTx(primaryKeyMapString);
        filterCopyInsertEntity(currentEntity);
        return delegateInsertTx(currentEntity);
    }

    /**
     * Filter 'copy-insert' entity.
     * 
     * @param entity Entity. (NotNull)
     */
    protected void filterCopyInsertEntity(LdBook entity) {
    }

  
}

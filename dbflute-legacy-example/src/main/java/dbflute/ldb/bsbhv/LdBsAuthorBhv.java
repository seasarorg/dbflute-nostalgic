
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
 * The behavior of AUTHOR.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsAuthorBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Dao instance. */
    protected LdAuthorDao _dao;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBsAuthorBhv() {
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
        return "AUTHOR";
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
        return LdAuthorDbm.getInstance();
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    /**
     * Get my dao.
     * 
     * @return My dao.
     */
    public LdAuthorDao getMyDao() {
        return _dao;
    }

    /**
     * Set my dao.
     * 
     * @param dao My dao. (NotNull)
     */
    public void setMyDao(LdAuthorDao dao) {
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
    public LdAuthor newMyEntity() {
        return new LdAuthor();
    }

    /**
     * New my condition-bean.
     * 
     * @return My condition-bean. (NotNull)
     */
    public LdAuthorCB newMyConditionBean() {
        return new LdAuthorCB();
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
    public java.util.List<LdAuthor> delegateGetListAllTx() {
        return getMyDao().getListAll();
    }

    //
    // Get entity. (Delegate-Method)
    // 
    // @param Primary-keys (NotNull)
    // @return Entity. (NotNull)
    //
    public LdAuthor delegateGetEntityTx(java.math.BigDecimal authorId) {
        return getMyDao().getEntity(authorId);
    }

    /**
     * Select count by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int delegateSelectCountIgnoreFetchScopeTx(LdAuthorCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectCountIgnoreFetchScope(cb);
    }

    /**
     * Select entity by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdAuthor delegateSelectEntityTx(LdAuthorCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectEntity(cb);
    }

    /**
     * Select list by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected list. If the select result is zero, it returns empty list. (NotNull)
     */
    public java.util.List<LdAuthor> delegateSelectListTx(LdAuthorCB cb) {
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
    public int delegateInsertTx(LdAuthor entity) {
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
    public int delegateUpdateTx(LdAuthor entity) {
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
    public int delegateDeleteTx(LdAuthor entity) {
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
    public int delegateInsertListTx(java.util.List<LdAuthor> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().insertList(entityList);
    }

    /**
     * Update several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Updated count.
     */
    public int delegateUpdateListTx(java.util.List<LdAuthor> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().updateList(entityList);
    }

    /**
     * Delete several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Deleted count.
     */
    public int delegateDeleteListTx(java.util.List<LdAuthor> entityList) {
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
    public LdListResultBean<LdAuthor> selectListTx(LdAuthorCB cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<LdAuthor>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }

    /**
     * Select page.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected page as first page. (NotNull)
     */
    public LdPagingResultBean<LdAuthor> selectPageTx(final LdAuthorCB cb) {
        assertConditionBeanNotNull(cb);
        final SelectPageCallback<LdAuthor> pageCallback = new SelectPageCallback<LdAuthor>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int selectCountIgnoreFetchScope() {
                return delegateSelectCountIgnoreFetchScopeTx(cb);
            }
            public java.util.List<LdAuthor> selectList() {
                return delegateSelectListTx(cb);
            }
        };
        return new SelectPageInvoker<LdAuthor>(this).invokeSelectPage(pageCallback);
    }

    /**
     * Select entity by condition-bean with deleted check.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdAuthor selectEntityWithDeletedCheckTx(LdAuthorCB cb) {
        assertConditionBeanNotNull(cb);
        dbflute.ldb.exentity.LdAuthor currentEntity = delegateSelectEntityTx(cb);
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
    public LdListResultBean selectListAfterCheckingCountIgnoreFetchScopeTx(LdAuthorCB cb, int maxCount) {
        assertConditionBeanNotNull(cb);
        final int selectedCount = delegateSelectCountIgnoreFetchScopeTx(cb);
        assertSelectedCountHasNotExceededMaxCount(selectedCount, maxCount, cb.toString());
        return new ResultBeanBuilder<LdAuthor>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }


    public LdAuthor selectForReadOnlyByPKValueWithDeletedCheckTx(java.math.BigDecimal authorId) {
        LdAuthor entity = new LdAuthor();
        entity.setAuthorId(authorId);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for read only with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-read-only. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdAuthor selectForReadOnlyByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdAuthorCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString);
        final dbflute.ldb.exentity.LdAuthor currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }

    public LdAuthor selectForUpdateByPKValueWithDeletedCheckTx(java.math.BigDecimal authorId) {
        LdAuthor entity = new LdAuthor();
        entity.setAuthorId(authorId);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for update with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdAuthor selectForUpdateByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdAuthorCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString).lockForUpdate();
        final dbflute.ldb.exentity.LdAuthor currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }


    // =====================================================================================
    //                                                                         Load Refferer
    //                                                                         =============
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ReffererTable    = [BOOK]
    //   ReffererProperty = [bookList]
    // * * * * * * * * */

    /**
     * Load refferer of bookList.
     * 
     * Default refferer order-by is 'primary-key asc'.
     * <pre>
     *   ex) Refferer order-by is AuthorId.
     * 
     *     final LdBsAuthorBhv bhv = (LdBsAuthorBhv)getDaoSelector().getRBhv(LdBsAuthorBhv.class);
     *     final LdAuthorCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdAuthor> ls = bhv.delegateSelectList(cb);
     *     bhv.loadBookList(ls);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     */
    public void loadBookList(java.util.List<LdAuthor> ls) {
        final ReffererConditionBookList reffererCondition = new ReffererConditionBookList() {
            public void setup(LdBookCB cb) {
                cb.addOrderBy_PK_Asc();// Default OrderBy for Refferer.
            }
        };
        loadBookList(ls, reffererCondition);
    }

    /**
     * Load refferer of bookList.
     * 
     * <pre>
     *   ex) Refferer order-by is AuthorId.
     * 
     *     final LdBsAuthorBhv bhv = (LdBsAuthorBhv)getDaoSelector().getRBhv(LdBsAuthorBhv.class);
     *     final LdAuthorCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdAuthor> ls = bhv.delegateSelectList(cb);
     *     final ReffererConditionBookList reffererCondition = new ReffererConditionBookList() {
     *         public void setup(LdBookCB cb) {
     *             cb.query().addOrderBy_AuthorId_Asc();
     *         }
     *     };
     *     bhv.loadBookList(ls, reffererCondition);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     * @param reffererCondition Refferer condition instance for registering refferer condition. (NotNull)
     */
    public void loadBookList(java.util.List<LdAuthor> ls, ReffererConditionBookList reffererCondition) {
        assertObjectNotNull("ls", ls);
        assertObjectNotNull("reffererCondition", reffererCondition);
        if (ls.isEmpty()) {
            return;
        }

        final java.util.Map<java.math.BigDecimal, LdAuthor> pkMyEntityMap = new java.util.LinkedHashMap<java.math.BigDecimal, LdAuthor>();
        final java.util.List<java.math.BigDecimal> pkList = new java.util.ArrayList<java.math.BigDecimal>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdAuthor entity = (LdAuthor)ite.next();
            pkList.add(entity.getAuthorId());
            pkMyEntityMap.put(entity.getAuthorId(), entity);
        }
        final LdBookBhv reffererBhv = (LdBookBhv)getDaoSelector().getRBhv(LdBookBhv.class);
        final LdBookCB cb = reffererBhv.newMyConditionBean();
        cb.query().setAuthorId_InScope(pkList);
        cb.query().addOrderBy_AuthorId_Asc();
        reffererCondition.setup(cb);
        final java.util.List<LdBook> reffererList = reffererBhv.delegateSelectListTx(cb);

        final java.util.Map<java.math.BigDecimal, java.util.List<LdBook>> pkReffererListMap;
        pkReffererListMap = new java.util.LinkedHashMap<java.math.BigDecimal, java.util.List<LdBook>>();
        for (final java.util.Iterator ite = reffererList.iterator(); ite.hasNext(); ) {
            final LdBook reffererEntity = (LdBook)ite.next();
            if (!pkReffererListMap.containsKey(reffererEntity.getAuthorId())) {
                pkReffererListMap.put(reffererEntity.getAuthorId(), new java.util.ArrayList<LdBook>());
            }
            ((java.util.List<LdBook>)pkReffererListMap.get(reffererEntity.getAuthorId())).add(reffererEntity);

            // for Reverse Reference.
            final LdAuthor myEntity = (LdAuthor)pkMyEntityMap.get(reffererEntity.getAuthorId());
            reffererEntity.setAuthor(myEntity);
        }

        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdAuthor entity = (LdAuthor)ite.next();
            entity.setBookList((java.util.List<LdBook>)pkReffererListMap.get(entity.getAuthorId()));
        }
    }

    /**
     * The interface of refferer condition for bookList.
     */
    public static interface ReffererConditionBookList {
        /**
         * Set up refferer condition.
         * 
         * @param cb Condition-bean for refferer. (NotNull)
         */
        public void setup(LdBookCB cb);
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
    public int insertOrUpdateAfterSelectForUpdateTx(LdAuthor entity) {
        assertEntityNotNull(entity);
        final String mapString = entity.extractPrimaryKeyMapString();
        LdAuthor currentEntity = null;
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
    public int updateAfterSelectForUpdateTx(LdAuthor entity) {
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        final LdAuthor currentEntity = selectForUpdateByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
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
        final LdAuthor sourceMyEntity = (LdAuthor)sourceEntity;
        final LdAuthor destinationMyEntity = (LdAuthor)destinationEntity;
  
        if (sourceMyEntity.isSetterInvokedAuthorId()) {
            destinationMyEntity.setAuthorId(sourceMyEntity.getAuthorId());
        }
  
        if (sourceMyEntity.isSetterInvokedAuthorName()) {
            destinationMyEntity.setAuthorName(sourceMyEntity.getAuthorName());
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
    public int copyInsertByPKValueAfterSelectForReadOnlyTx(java.math.BigDecimal authorId) {
        LdAuthor entity = new LdAuthor();
        entity.setAuthorId(authorId);
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
        final LdAuthor currentEntity = selectForReadOnlyByPKMapStringWithDeletedCheckTx(primaryKeyMapString);
        filterCopyInsertEntity(currentEntity);
        return delegateInsertTx(currentEntity);
    }

    /**
     * Filter 'copy-insert' entity.
     * 
     * @param entity Entity. (NotNull)
     */
    protected void filterCopyInsertEntity(LdAuthor entity) {
    }

  
}

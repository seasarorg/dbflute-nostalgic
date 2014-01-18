
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
 * The behavior of GENRE.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsGenreBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Dao instance. */
    protected LdGenreDao _dao;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBsGenreBhv() {
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
        return "GENRE";
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
        return LdGenreDbm.getInstance();
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    /**
     * Get my dao.
     * 
     * @return My dao.
     */
    public LdGenreDao getMyDao() {
        return _dao;
    }

    /**
     * Set my dao.
     * 
     * @param dao My dao. (NotNull)
     */
    public void setMyDao(LdGenreDao dao) {
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
    public LdGenre newMyEntity() {
        return new LdGenre();
    }

    /**
     * New my condition-bean.
     * 
     * @return My condition-bean. (NotNull)
     */
    public LdGenreCB newMyConditionBean() {
        return new LdGenreCB();
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
    public java.util.List<LdGenre> delegateGetListAllTx() {
        return getMyDao().getListAll();
    }

    //
    // Get entity. (Delegate-Method)
    // 
    // @param Primary-keys (NotNull)
    // @return Entity. (NotNull)
    //
    public LdGenre delegateGetEntityTx(String genreCode) {
        return getMyDao().getEntity(genreCode);
    }

    /**
     * Select count by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int delegateSelectCountIgnoreFetchScopeTx(LdGenreCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectCountIgnoreFetchScope(cb);
    }

    /**
     * Select entity by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdGenre delegateSelectEntityTx(LdGenreCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectEntity(cb);
    }

    /**
     * Select list by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected list. If the select result is zero, it returns empty list. (NotNull)
     */
    public java.util.List<LdGenre> delegateSelectListTx(LdGenreCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectList(cb);
    }



    /**
     * Insert one entity. (Delegate-Method)
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int delegateInsertTx(LdGenre entity) {
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
    public int delegateUpdateTx(LdGenre entity) {
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
    public int delegateDeleteTx(LdGenre entity) {
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
    public int delegateInsertListTx(java.util.List<LdGenre> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().insertList(entityList);
    }

    /**
     * Update several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Updated count.
     */
    public int delegateUpdateListTx(java.util.List<LdGenre> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().updateList(entityList);
    }

    /**
     * Delete several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Deleted count.
     */
    public int delegateDeleteListTx(java.util.List<LdGenre> entityList) {
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
    public LdListResultBean<LdGenre> selectListTx(LdGenreCB cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<LdGenre>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }

    /**
     * Select page.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected page as first page. (NotNull)
     */
    public LdPagingResultBean<LdGenre> selectPageTx(final LdGenreCB cb) {
        assertConditionBeanNotNull(cb);
        final SelectPageCallback<LdGenre> pageCallback = new SelectPageCallback<LdGenre>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int selectCountIgnoreFetchScope() {
                return delegateSelectCountIgnoreFetchScopeTx(cb);
            }
            public java.util.List<LdGenre> selectList() {
                return delegateSelectListTx(cb);
            }
        };
        return new SelectPageInvoker<LdGenre>(this).invokeSelectPage(pageCallback);
    }

    /**
     * Select entity by condition-bean with deleted check.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdGenre selectEntityWithDeletedCheckTx(LdGenreCB cb) {
        assertConditionBeanNotNull(cb);
        dbflute.ldb.exentity.LdGenre currentEntity = delegateSelectEntityTx(cb);
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
    public LdListResultBean selectListAfterCheckingCountIgnoreFetchScopeTx(LdGenreCB cb, int maxCount) {
        assertConditionBeanNotNull(cb);
        final int selectedCount = delegateSelectCountIgnoreFetchScopeTx(cb);
        assertSelectedCountHasNotExceededMaxCount(selectedCount, maxCount, cb.toString());
        return new ResultBeanBuilder<LdGenre>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }


    public LdGenre selectForReadOnlyByPKValueWithDeletedCheckTx(String genreCode) {
        LdGenre entity = new LdGenre();
        entity.setGenreCode(genreCode);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for read only with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-read-only. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdGenre selectForReadOnlyByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdGenreCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString);
        final dbflute.ldb.exentity.LdGenre currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }

    public LdGenre selectForUpdateByPKValueWithDeletedCheckTx(String genreCode) {
        LdGenre entity = new LdGenre();
        entity.setGenreCode(genreCode);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for update with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdGenre selectForUpdateByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdGenreCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString).lockForUpdate();
        final dbflute.ldb.exentity.LdGenre currentEntity = delegateSelectEntityTx(cb);
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
     *   ex) Refferer order-by is GenreCode.
     * 
     *     final LdBsGenreBhv bhv = (LdBsGenreBhv)getDaoSelector().getRBhv(LdBsGenreBhv.class);
     *     final LdGenreCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdGenre> ls = bhv.delegateSelectList(cb);
     *     bhv.loadBookList(ls);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     */
    public void loadBookList(java.util.List<LdGenre> ls) {
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
     *   ex) Refferer order-by is GenreCode.
     * 
     *     final LdBsGenreBhv bhv = (LdBsGenreBhv)getDaoSelector().getRBhv(LdBsGenreBhv.class);
     *     final LdGenreCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdGenre> ls = bhv.delegateSelectList(cb);
     *     final ReffererConditionBookList reffererCondition = new ReffererConditionBookList() {
     *         public void setup(LdBookCB cb) {
     *             cb.query().addOrderBy_GenreCode_Asc();
     *         }
     *     };
     *     bhv.loadBookList(ls, reffererCondition);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     * @param reffererCondition Refferer condition instance for registering refferer condition. (NotNull)
     */
    public void loadBookList(java.util.List<LdGenre> ls, ReffererConditionBookList reffererCondition) {
        assertObjectNotNull("ls", ls);
        assertObjectNotNull("reffererCondition", reffererCondition);
        if (ls.isEmpty()) {
            return;
        }

        final java.util.Map<String, LdGenre> pkMyEntityMap = new java.util.LinkedHashMap<String, LdGenre>();
        final java.util.List<String> pkList = new java.util.ArrayList<String>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdGenre entity = (LdGenre)ite.next();
            pkList.add(entity.getGenreCode());
            pkMyEntityMap.put(entity.getGenreCode(), entity);
        }
        final LdBookBhv reffererBhv = (LdBookBhv)getDaoSelector().getRBhv(LdBookBhv.class);
        final LdBookCB cb = reffererBhv.newMyConditionBean();
        cb.query().setGenreCode_InScope(pkList);
        cb.query().addOrderBy_GenreCode_Asc();
        reffererCondition.setup(cb);
        final java.util.List<LdBook> reffererList = reffererBhv.delegateSelectListTx(cb);

        final java.util.Map<String, java.util.List<LdBook>> pkReffererListMap;
        pkReffererListMap = new java.util.LinkedHashMap<String, java.util.List<LdBook>>();
        for (final java.util.Iterator ite = reffererList.iterator(); ite.hasNext(); ) {
            final LdBook reffererEntity = (LdBook)ite.next();
            if (!pkReffererListMap.containsKey(reffererEntity.getGenreCode())) {
                pkReffererListMap.put(reffererEntity.getGenreCode(), new java.util.ArrayList<LdBook>());
            }
            ((java.util.List<LdBook>)pkReffererListMap.get(reffererEntity.getGenreCode())).add(reffererEntity);

            // for Reverse Reference.
            final LdGenre myEntity = (LdGenre)pkMyEntityMap.get(reffererEntity.getGenreCode());
            reffererEntity.setGenre(myEntity);
        }

        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdGenre entity = (LdGenre)ite.next();
            entity.setBookList((java.util.List<LdBook>)pkReffererListMap.get(entity.getGenreCode()));
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
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ReffererTable    = [GENRE]
    //   ReffererProperty = [genreSelfList]
    // * * * * * * * * */

    /**
     * Load refferer of genreSelfList.
     * 
     * Default refferer order-by is 'primary-key asc'.
     * <pre>
     *   ex) Refferer order-by is ParentGenreCode.
     * 
     *     final LdBsGenreBhv bhv = (LdBsGenreBhv)getDaoSelector().getRBhv(LdBsGenreBhv.class);
     *     final LdGenreCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdGenre> ls = bhv.delegateSelectList(cb);
     *     bhv.loadGenreSelfList(ls);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     */
    public void loadGenreSelfList(java.util.List<LdGenre> ls) {
        final ReffererConditionGenreSelfList reffererCondition = new ReffererConditionGenreSelfList() {
            public void setup(LdGenreCB cb) {
                cb.addOrderBy_PK_Asc();// Default OrderBy for Refferer.
            }
        };
        loadGenreSelfList(ls, reffererCondition);
    }

    /**
     * Load refferer of genreSelfList.
     * 
     * <pre>
     *   ex) Refferer order-by is ParentGenreCode.
     * 
     *     final LdBsGenreBhv bhv = (LdBsGenreBhv)getDaoSelector().getRBhv(LdBsGenreBhv.class);
     *     final LdGenreCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdGenre> ls = bhv.delegateSelectList(cb);
     *     final ReffererConditionGenreSelfList reffererCondition = new ReffererConditionGenreSelfList() {
     *         public void setup(LdGenreCB cb) {
     *             cb.query().addOrderBy_ParentGenreCode_Asc();
     *         }
     *     };
     *     bhv.loadGenreSelfList(ls, reffererCondition);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     * @param reffererCondition Refferer condition instance for registering refferer condition. (NotNull)
     */
    public void loadGenreSelfList(java.util.List<LdGenre> ls, ReffererConditionGenreSelfList reffererCondition) {
        assertObjectNotNull("ls", ls);
        assertObjectNotNull("reffererCondition", reffererCondition);
        if (ls.isEmpty()) {
            return;
        }

        final java.util.Map<String, LdGenre> pkMyEntityMap = new java.util.LinkedHashMap<String, LdGenre>();
        final java.util.List<String> pkList = new java.util.ArrayList<String>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdGenre entity = (LdGenre)ite.next();
            pkList.add(entity.getGenreCode());
            pkMyEntityMap.put(entity.getGenreCode(), entity);
        }
        final LdGenreBhv reffererBhv = (LdGenreBhv)getDaoSelector().getRBhv(LdGenreBhv.class);
        final LdGenreCB cb = reffererBhv.newMyConditionBean();
        cb.query().setParentGenreCode_InScope(pkList);
        cb.query().addOrderBy_ParentGenreCode_Asc();
        reffererCondition.setup(cb);
        final java.util.List<LdGenre> reffererList = reffererBhv.delegateSelectListTx(cb);

        final java.util.Map<String, java.util.List<LdGenre>> pkReffererListMap;
        pkReffererListMap = new java.util.LinkedHashMap<String, java.util.List<LdGenre>>();
        for (final java.util.Iterator ite = reffererList.iterator(); ite.hasNext(); ) {
            final LdGenre reffererEntity = (LdGenre)ite.next();
            if (!pkReffererListMap.containsKey(reffererEntity.getParentGenreCode())) {
                pkReffererListMap.put(reffererEntity.getParentGenreCode(), new java.util.ArrayList<LdGenre>());
            }
            ((java.util.List<LdGenre>)pkReffererListMap.get(reffererEntity.getParentGenreCode())).add(reffererEntity);

            // for Reverse Reference.
            final LdGenre myEntity = (LdGenre)pkMyEntityMap.get(reffererEntity.getParentGenreCode());
            reffererEntity.setGenreSelf(myEntity);
        }

        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdGenre entity = (LdGenre)ite.next();
            entity.setGenreSelfList((java.util.List<LdGenre>)pkReffererListMap.get(entity.getGenreCode()));
        }
    }

    /**
     * The interface of refferer condition for genreSelfList.
     */
    public static interface ReffererConditionGenreSelfList {
        /**
         * Set up refferer condition.
         * 
         * @param cb Condition-bean for refferer. (NotNull)
         */
        public void setup(LdGenreCB cb);
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
    public int insertOrUpdateAfterSelectForUpdateTx(LdGenre entity) {
        assertEntityNotNull(entity);
        final String mapString = entity.extractPrimaryKeyMapString();
        LdGenre currentEntity = null;
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
    public int updateAfterSelectForUpdateTx(LdGenre entity) {
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        final LdGenre currentEntity = selectForUpdateByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
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
        final LdGenre sourceMyEntity = (LdGenre)sourceEntity;
        final LdGenre destinationMyEntity = (LdGenre)destinationEntity;
  
        if (sourceMyEntity.isSetterInvokedGenreCode()) {
            destinationMyEntity.setGenreCode(sourceMyEntity.getGenreCode());
        }
  
        if (sourceMyEntity.isSetterInvokedGenreName()) {
            destinationMyEntity.setGenreName(sourceMyEntity.getGenreName());
        }
  
        if (sourceMyEntity.isSetterInvokedParentGenreCode()) {
            destinationMyEntity.setParentGenreCode(sourceMyEntity.getParentGenreCode());
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

  
  
  
}

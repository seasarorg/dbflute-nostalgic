
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
 * The behavior of LIBRARY.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLibraryBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Dao instance. */
    protected LdLibraryDao _dao;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBsLibraryBhv() {
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
        return "LIBRARY";
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
        return LdLibraryDbm.getInstance();
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    /**
     * Get my dao.
     * 
     * @return My dao.
     */
    public LdLibraryDao getMyDao() {
        return _dao;
    }

    /**
     * Set my dao.
     * 
     * @param dao My dao. (NotNull)
     */
    public void setMyDao(LdLibraryDao dao) {
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
    public LdLibrary newMyEntity() {
        return new LdLibrary();
    }

    /**
     * New my condition-bean.
     * 
     * @return My condition-bean. (NotNull)
     */
    public LdLibraryCB newMyConditionBean() {
        return new LdLibraryCB();
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
    public java.util.List<LdLibrary> delegateGetListAllTx() {
        return getMyDao().getListAll();
    }

    //
    // Get entity. (Delegate-Method)
    // 
    // @param Primary-keys (NotNull)
    // @return Entity. (NotNull)
    //
    public LdLibrary delegateGetEntityTx(java.math.BigDecimal libraryId) {
        return getMyDao().getEntity(libraryId);
    }

    /**
     * Select count by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int delegateSelectCountIgnoreFetchScopeTx(LdLibraryCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectCountIgnoreFetchScope(cb);
    }

    /**
     * Select entity by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdLibrary delegateSelectEntityTx(LdLibraryCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectEntity(cb);
    }

    /**
     * Select list by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected list. If the select result is zero, it returns empty list. (NotNull)
     */
    public java.util.List<LdLibrary> delegateSelectListTx(LdLibraryCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectList(cb);
    }



    /**
     * Insert one entity. (Delegate-Method)
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int delegateInsertTx(LdLibrary entity) {
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
    public int delegateUpdateTx(LdLibrary entity) {
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
    public int delegateDeleteTx(LdLibrary entity) {
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
    public int delegateInsertListTx(java.util.List<LdLibrary> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().insertList(entityList);
    }

    /**
     * Update several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Updated count.
     */
    public int delegateUpdateListTx(java.util.List<LdLibrary> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().updateList(entityList);
    }

    /**
     * Delete several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Deleted count.
     */
    public int delegateDeleteListTx(java.util.List<LdLibrary> entityList) {
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
    public LdListResultBean<LdLibrary> selectListTx(LdLibraryCB cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<LdLibrary>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }

    /**
     * Select page.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected page as first page. (NotNull)
     */
    public LdPagingResultBean<LdLibrary> selectPageTx(final LdLibraryCB cb) {
        assertConditionBeanNotNull(cb);
        final SelectPageCallback<LdLibrary> pageCallback = new SelectPageCallback<LdLibrary>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int selectCountIgnoreFetchScope() {
                return delegateSelectCountIgnoreFetchScopeTx(cb);
            }
            public java.util.List<LdLibrary> selectList() {
                return delegateSelectListTx(cb);
            }
        };
        return new SelectPageInvoker<LdLibrary>(this).invokeSelectPage(pageCallback);
    }

    /**
     * Select entity by condition-bean with deleted check.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdLibrary selectEntityWithDeletedCheckTx(LdLibraryCB cb) {
        assertConditionBeanNotNull(cb);
        dbflute.ldb.exentity.LdLibrary currentEntity = delegateSelectEntityTx(cb);
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
    public LdListResultBean selectListAfterCheckingCountIgnoreFetchScopeTx(LdLibraryCB cb, int maxCount) {
        assertConditionBeanNotNull(cb);
        final int selectedCount = delegateSelectCountIgnoreFetchScopeTx(cb);
        assertSelectedCountHasNotExceededMaxCount(selectedCount, maxCount, cb.toString());
        return new ResultBeanBuilder<LdLibrary>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }


    public LdLibrary selectForReadOnlyByPKValueWithDeletedCheckTx(java.math.BigDecimal libraryId) {
        LdLibrary entity = new LdLibrary();
        entity.setLibraryId(libraryId);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for read only with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-read-only. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdLibrary selectForReadOnlyByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdLibraryCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString);
        final dbflute.ldb.exentity.LdLibrary currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }

    public LdLibrary selectForUpdateByPKValueWithDeletedCheckTx(java.math.BigDecimal libraryId) {
        LdLibrary entity = new LdLibrary();
        entity.setLibraryId(libraryId);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for update with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdLibrary selectForUpdateByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdLibraryCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString).lockForUpdate();
        final dbflute.ldb.exentity.LdLibrary currentEntity = delegateSelectEntityTx(cb);
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
     *   ex) Refferer order-by is LibraryId.
     * 
     *     final LdBsLibraryBhv bhv = (LdBsLibraryBhv)getDaoSelector().getRBhv(LdBsLibraryBhv.class);
     *     final LdLibraryCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdLibrary> ls = bhv.delegateSelectList(cb);
     *     bhv.loadCollectionList(ls);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     */
    public void loadCollectionList(java.util.List<LdLibrary> ls) {
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
     *   ex) Refferer order-by is LibraryId.
     * 
     *     final LdBsLibraryBhv bhv = (LdBsLibraryBhv)getDaoSelector().getRBhv(LdBsLibraryBhv.class);
     *     final LdLibraryCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdLibrary> ls = bhv.delegateSelectList(cb);
     *     final ReffererConditionCollectionList reffererCondition = new ReffererConditionCollectionList() {
     *         public void setup(LdCollectionCB cb) {
     *             cb.query().addOrderBy_LibraryId_Asc();
     *         }
     *     };
     *     bhv.loadCollectionList(ls, reffererCondition);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     * @param reffererCondition Refferer condition instance for registering refferer condition. (NotNull)
     */
    public void loadCollectionList(java.util.List<LdLibrary> ls, ReffererConditionCollectionList reffererCondition) {
        assertObjectNotNull("ls", ls);
        assertObjectNotNull("reffererCondition", reffererCondition);
        if (ls.isEmpty()) {
            return;
        }

        final java.util.Map<java.math.BigDecimal, LdLibrary> pkMyEntityMap = new java.util.LinkedHashMap<java.math.BigDecimal, LdLibrary>();
        final java.util.List<java.math.BigDecimal> pkList = new java.util.ArrayList<java.math.BigDecimal>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdLibrary entity = (LdLibrary)ite.next();
            pkList.add(entity.getLibraryId());
            pkMyEntityMap.put(entity.getLibraryId(), entity);
        }
        final LdCollectionBhv reffererBhv = (LdCollectionBhv)getDaoSelector().getRBhv(LdCollectionBhv.class);
        final LdCollectionCB cb = reffererBhv.newMyConditionBean();
        cb.query().setLibraryId_InScope(pkList);
        cb.query().addOrderBy_LibraryId_Asc();
        reffererCondition.setup(cb);
        final java.util.List<LdCollection> reffererList = reffererBhv.delegateSelectListTx(cb);

        final java.util.Map<java.math.BigDecimal, java.util.List<LdCollection>> pkReffererListMap;
        pkReffererListMap = new java.util.LinkedHashMap<java.math.BigDecimal, java.util.List<LdCollection>>();
        for (final java.util.Iterator ite = reffererList.iterator(); ite.hasNext(); ) {
            final LdCollection reffererEntity = (LdCollection)ite.next();
            if (!pkReffererListMap.containsKey(reffererEntity.getLibraryId())) {
                pkReffererListMap.put(reffererEntity.getLibraryId(), new java.util.ArrayList<LdCollection>());
            }
            ((java.util.List<LdCollection>)pkReffererListMap.get(reffererEntity.getLibraryId())).add(reffererEntity);

            // for Reverse Reference.
            final LdLibrary myEntity = (LdLibrary)pkMyEntityMap.get(reffererEntity.getLibraryId());
            reffererEntity.setLibrary(myEntity);
        }

        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdLibrary entity = (LdLibrary)ite.next();
            entity.setCollectionList((java.util.List<LdCollection>)pkReffererListMap.get(entity.getLibraryId()));
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
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ReffererTable    = [LB_USER]
    //   ReffererProperty = [lbUserList]
    // * * * * * * * * */

    /**
     * Load refferer of lbUserList.
     * 
     * Default refferer order-by is 'primary-key asc'.
     * <pre>
     *   ex) Refferer order-by is LibraryId.
     * 
     *     final LdBsLibraryBhv bhv = (LdBsLibraryBhv)getDaoSelector().getRBhv(LdBsLibraryBhv.class);
     *     final LdLibraryCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdLibrary> ls = bhv.delegateSelectList(cb);
     *     bhv.loadLbUserList(ls);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     */
    public void loadLbUserList(java.util.List<LdLibrary> ls) {
        final ReffererConditionLbUserList reffererCondition = new ReffererConditionLbUserList() {
            public void setup(LdLbUserCB cb) {
                cb.addOrderBy_PK_Asc();// Default OrderBy for Refferer.
            }
        };
        loadLbUserList(ls, reffererCondition);
    }

    /**
     * Load refferer of lbUserList.
     * 
     * <pre>
     *   ex) Refferer order-by is LibraryId.
     * 
     *     final LdBsLibraryBhv bhv = (LdBsLibraryBhv)getDaoSelector().getRBhv(LdBsLibraryBhv.class);
     *     final LdLibraryCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdLibrary> ls = bhv.delegateSelectList(cb);
     *     final ReffererConditionLbUserList reffererCondition = new ReffererConditionLbUserList() {
     *         public void setup(LdLbUserCB cb) {
     *             cb.query().addOrderBy_LibraryId_Asc();
     *         }
     *     };
     *     bhv.loadLbUserList(ls, reffererCondition);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     * @param reffererCondition Refferer condition instance for registering refferer condition. (NotNull)
     */
    public void loadLbUserList(java.util.List<LdLibrary> ls, ReffererConditionLbUserList reffererCondition) {
        assertObjectNotNull("ls", ls);
        assertObjectNotNull("reffererCondition", reffererCondition);
        if (ls.isEmpty()) {
            return;
        }

        final java.util.Map<java.math.BigDecimal, LdLibrary> pkMyEntityMap = new java.util.LinkedHashMap<java.math.BigDecimal, LdLibrary>();
        final java.util.List<java.math.BigDecimal> pkList = new java.util.ArrayList<java.math.BigDecimal>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdLibrary entity = (LdLibrary)ite.next();
            pkList.add(entity.getLibraryId());
            pkMyEntityMap.put(entity.getLibraryId(), entity);
        }
        final LdLbUserBhv reffererBhv = (LdLbUserBhv)getDaoSelector().getRBhv(LdLbUserBhv.class);
        final LdLbUserCB cb = reffererBhv.newMyConditionBean();
        cb.query().setLibraryId_InScope(pkList);
        cb.query().addOrderBy_LibraryId_Asc();
        reffererCondition.setup(cb);
        final java.util.List<LdLbUser> reffererList = reffererBhv.delegateSelectListTx(cb);

        final java.util.Map<java.math.BigDecimal, java.util.List<LdLbUser>> pkReffererListMap;
        pkReffererListMap = new java.util.LinkedHashMap<java.math.BigDecimal, java.util.List<LdLbUser>>();
        for (final java.util.Iterator ite = reffererList.iterator(); ite.hasNext(); ) {
            final LdLbUser reffererEntity = (LdLbUser)ite.next();
            if (!pkReffererListMap.containsKey(reffererEntity.getLibraryId())) {
                pkReffererListMap.put(reffererEntity.getLibraryId(), new java.util.ArrayList<LdLbUser>());
            }
            ((java.util.List<LdLbUser>)pkReffererListMap.get(reffererEntity.getLibraryId())).add(reffererEntity);

            // for Reverse Reference.
            final LdLibrary myEntity = (LdLibrary)pkMyEntityMap.get(reffererEntity.getLibraryId());
            reffererEntity.setLibrary(myEntity);
        }

        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdLibrary entity = (LdLibrary)ite.next();
            entity.setLbUserList((java.util.List<LdLbUser>)pkReffererListMap.get(entity.getLibraryId()));
        }
    }

    /**
     * The interface of refferer condition for lbUserList.
     */
    public static interface ReffererConditionLbUserList {
        /**
         * Set up refferer condition.
         * 
         * @param cb Condition-bean for refferer. (NotNull)
         */
        public void setup(LdLbUserCB cb);
    }
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ReffererTable    = [LENDING]
    //   ReffererProperty = [lendingList]
    // * * * * * * * * */

    /**
     * Load refferer of lendingList.
     * 
     * Default refferer order-by is 'primary-key asc'.
     * <pre>
     *   ex) Refferer order-by is LibraryId.
     * 
     *     final LdBsLibraryBhv bhv = (LdBsLibraryBhv)getDaoSelector().getRBhv(LdBsLibraryBhv.class);
     *     final LdLibraryCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdLibrary> ls = bhv.delegateSelectList(cb);
     *     bhv.loadLendingList(ls);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     */
    public void loadLendingList(java.util.List<LdLibrary> ls) {
        final ReffererConditionLendingList reffererCondition = new ReffererConditionLendingList() {
            public void setup(LdLendingCB cb) {
                cb.addOrderBy_PK_Asc();// Default OrderBy for Refferer.
            }
        };
        loadLendingList(ls, reffererCondition);
    }

    /**
     * Load refferer of lendingList.
     * 
     * <pre>
     *   ex) Refferer order-by is LibraryId.
     * 
     *     final LdBsLibraryBhv bhv = (LdBsLibraryBhv)getDaoSelector().getRBhv(LdBsLibraryBhv.class);
     *     final LdLibraryCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdLibrary> ls = bhv.delegateSelectList(cb);
     *     final ReffererConditionLendingList reffererCondition = new ReffererConditionLendingList() {
     *         public void setup(LdLendingCB cb) {
     *             cb.query().addOrderBy_LibraryId_Asc();
     *         }
     *     };
     *     bhv.loadLendingList(ls, reffererCondition);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     * @param reffererCondition Refferer condition instance for registering refferer condition. (NotNull)
     */
    public void loadLendingList(java.util.List<LdLibrary> ls, ReffererConditionLendingList reffererCondition) {
        assertObjectNotNull("ls", ls);
        assertObjectNotNull("reffererCondition", reffererCondition);
        if (ls.isEmpty()) {
            return;
        }

        final java.util.Map<java.math.BigDecimal, LdLibrary> pkMyEntityMap = new java.util.LinkedHashMap<java.math.BigDecimal, LdLibrary>();
        final java.util.List<java.math.BigDecimal> pkList = new java.util.ArrayList<java.math.BigDecimal>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdLibrary entity = (LdLibrary)ite.next();
            pkList.add(entity.getLibraryId());
            pkMyEntityMap.put(entity.getLibraryId(), entity);
        }
        final LdLendingBhv reffererBhv = (LdLendingBhv)getDaoSelector().getRBhv(LdLendingBhv.class);
        final LdLendingCB cb = reffererBhv.newMyConditionBean();
        cb.query().setLibraryId_InScope(pkList);
        cb.query().addOrderBy_LibraryId_Asc();
        reffererCondition.setup(cb);
        final java.util.List<LdLending> reffererList = reffererBhv.delegateSelectListTx(cb);

        final java.util.Map<java.math.BigDecimal, java.util.List<LdLending>> pkReffererListMap;
        pkReffererListMap = new java.util.LinkedHashMap<java.math.BigDecimal, java.util.List<LdLending>>();
        for (final java.util.Iterator ite = reffererList.iterator(); ite.hasNext(); ) {
            final LdLending reffererEntity = (LdLending)ite.next();
            if (!pkReffererListMap.containsKey(reffererEntity.getLibraryId())) {
                pkReffererListMap.put(reffererEntity.getLibraryId(), new java.util.ArrayList<LdLending>());
            }
            ((java.util.List<LdLending>)pkReffererListMap.get(reffererEntity.getLibraryId())).add(reffererEntity);

            // for Reverse Reference.
            final LdLibrary myEntity = (LdLibrary)pkMyEntityMap.get(reffererEntity.getLibraryId());
            reffererEntity.setLibrary(myEntity);
        }

        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdLibrary entity = (LdLibrary)ite.next();
            entity.setLendingList((java.util.List<LdLending>)pkReffererListMap.get(entity.getLibraryId()));
        }
    }

    /**
     * The interface of refferer condition for lendingList.
     */
    public static interface ReffererConditionLendingList {
        /**
         * Set up refferer condition.
         * 
         * @param cb Condition-bean for refferer. (NotNull)
         */
        public void setup(LdLendingCB cb);
    }
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ReffererTable    = [NEXT_LIBRARY]
    //   ReffererProperty = [nextLibraryByNextLibraryIdList]
    // * * * * * * * * */

    /**
     * Load refferer of nextLibraryByNextLibraryIdList.
     * 
     * Default refferer order-by is 'primary-key asc'.
     * <pre>
     *   ex) Refferer order-by is NextLibraryId.
     * 
     *     final LdBsLibraryBhv bhv = (LdBsLibraryBhv)getDaoSelector().getRBhv(LdBsLibraryBhv.class);
     *     final LdLibraryCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdLibrary> ls = bhv.delegateSelectList(cb);
     *     bhv.loadNextLibraryByNextLibraryIdList(ls);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     */
    public void loadNextLibraryByNextLibraryIdList(java.util.List<LdLibrary> ls) {
        final ReffererConditionNextLibraryByNextLibraryIdList reffererCondition = new ReffererConditionNextLibraryByNextLibraryIdList() {
            public void setup(LdNextLibraryCB cb) {
                cb.addOrderBy_PK_Asc();// Default OrderBy for Refferer.
            }
        };
        loadNextLibraryByNextLibraryIdList(ls, reffererCondition);
    }

    /**
     * Load refferer of nextLibraryByNextLibraryIdList.
     * 
     * <pre>
     *   ex) Refferer order-by is NextLibraryId.
     * 
     *     final LdBsLibraryBhv bhv = (LdBsLibraryBhv)getDaoSelector().getRBhv(LdBsLibraryBhv.class);
     *     final LdLibraryCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdLibrary> ls = bhv.delegateSelectList(cb);
     *     final ReffererConditionNextLibraryByNextLibraryIdList reffererCondition = new ReffererConditionNextLibraryByNextLibraryIdList() {
     *         public void setup(LdNextLibraryCB cb) {
     *             cb.query().addOrderBy_NextLibraryId_Asc();
     *         }
     *     };
     *     bhv.loadNextLibraryByNextLibraryIdList(ls, reffererCondition);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     * @param reffererCondition Refferer condition instance for registering refferer condition. (NotNull)
     */
    public void loadNextLibraryByNextLibraryIdList(java.util.List<LdLibrary> ls, ReffererConditionNextLibraryByNextLibraryIdList reffererCondition) {
        assertObjectNotNull("ls", ls);
        assertObjectNotNull("reffererCondition", reffererCondition);
        if (ls.isEmpty()) {
            return;
        }

        final java.util.Map<java.math.BigDecimal, LdLibrary> pkMyEntityMap = new java.util.LinkedHashMap<java.math.BigDecimal, LdLibrary>();
        final java.util.List<java.math.BigDecimal> pkList = new java.util.ArrayList<java.math.BigDecimal>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdLibrary entity = (LdLibrary)ite.next();
            pkList.add(entity.getLibraryId());
            pkMyEntityMap.put(entity.getLibraryId(), entity);
        }
        final LdNextLibraryBhv reffererBhv = (LdNextLibraryBhv)getDaoSelector().getRBhv(LdNextLibraryBhv.class);
        final LdNextLibraryCB cb = reffererBhv.newMyConditionBean();
        cb.query().setNextLibraryId_InScope(pkList);
        cb.query().addOrderBy_NextLibraryId_Asc();
        reffererCondition.setup(cb);
        final java.util.List<LdNextLibrary> reffererList = reffererBhv.delegateSelectListTx(cb);

        final java.util.Map<java.math.BigDecimal, java.util.List<LdNextLibrary>> pkReffererListMap;
        pkReffererListMap = new java.util.LinkedHashMap<java.math.BigDecimal, java.util.List<LdNextLibrary>>();
        for (final java.util.Iterator ite = reffererList.iterator(); ite.hasNext(); ) {
            final LdNextLibrary reffererEntity = (LdNextLibrary)ite.next();
            if (!pkReffererListMap.containsKey(reffererEntity.getNextLibraryId())) {
                pkReffererListMap.put(reffererEntity.getNextLibraryId(), new java.util.ArrayList<LdNextLibrary>());
            }
            ((java.util.List<LdNextLibrary>)pkReffererListMap.get(reffererEntity.getNextLibraryId())).add(reffererEntity);

            // for Reverse Reference.
            final LdLibrary myEntity = (LdLibrary)pkMyEntityMap.get(reffererEntity.getNextLibraryId());
            reffererEntity.setLibraryByNextLibraryId(myEntity);
        }

        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdLibrary entity = (LdLibrary)ite.next();
            entity.setNextLibraryByNextLibraryIdList((java.util.List<LdNextLibrary>)pkReffererListMap.get(entity.getLibraryId()));
        }
    }

    /**
     * The interface of refferer condition for nextLibraryByNextLibraryIdList.
     */
    public static interface ReffererConditionNextLibraryByNextLibraryIdList {
        /**
         * Set up refferer condition.
         * 
         * @param cb Condition-bean for refferer. (NotNull)
         */
        public void setup(LdNextLibraryCB cb);
    }
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ReffererTable    = [NEXT_LIBRARY]
    //   ReffererProperty = [nextLibraryByLibraryIdList]
    // * * * * * * * * */

    /**
     * Load refferer of nextLibraryByLibraryIdList.
     * 
     * Default refferer order-by is 'primary-key asc'.
     * <pre>
     *   ex) Refferer order-by is LibraryId.
     * 
     *     final LdBsLibraryBhv bhv = (LdBsLibraryBhv)getDaoSelector().getRBhv(LdBsLibraryBhv.class);
     *     final LdLibraryCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdLibrary> ls = bhv.delegateSelectList(cb);
     *     bhv.loadNextLibraryByLibraryIdList(ls);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     */
    public void loadNextLibraryByLibraryIdList(java.util.List<LdLibrary> ls) {
        final ReffererConditionNextLibraryByLibraryIdList reffererCondition = new ReffererConditionNextLibraryByLibraryIdList() {
            public void setup(LdNextLibraryCB cb) {
                cb.addOrderBy_PK_Asc();// Default OrderBy for Refferer.
            }
        };
        loadNextLibraryByLibraryIdList(ls, reffererCondition);
    }

    /**
     * Load refferer of nextLibraryByLibraryIdList.
     * 
     * <pre>
     *   ex) Refferer order-by is LibraryId.
     * 
     *     final LdBsLibraryBhv bhv = (LdBsLibraryBhv)getDaoSelector().getRBhv(LdBsLibraryBhv.class);
     *     final LdLibraryCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdLibrary> ls = bhv.delegateSelectList(cb);
     *     final ReffererConditionNextLibraryByLibraryIdList reffererCondition = new ReffererConditionNextLibraryByLibraryIdList() {
     *         public void setup(LdNextLibraryCB cb) {
     *             cb.query().addOrderBy_LibraryId_Asc();
     *         }
     *     };
     *     bhv.loadNextLibraryByLibraryIdList(ls, reffererCondition);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     * @param reffererCondition Refferer condition instance for registering refferer condition. (NotNull)
     */
    public void loadNextLibraryByLibraryIdList(java.util.List<LdLibrary> ls, ReffererConditionNextLibraryByLibraryIdList reffererCondition) {
        assertObjectNotNull("ls", ls);
        assertObjectNotNull("reffererCondition", reffererCondition);
        if (ls.isEmpty()) {
            return;
        }

        final java.util.Map<java.math.BigDecimal, LdLibrary> pkMyEntityMap = new java.util.LinkedHashMap<java.math.BigDecimal, LdLibrary>();
        final java.util.List<java.math.BigDecimal> pkList = new java.util.ArrayList<java.math.BigDecimal>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdLibrary entity = (LdLibrary)ite.next();
            pkList.add(entity.getLibraryId());
            pkMyEntityMap.put(entity.getLibraryId(), entity);
        }
        final LdNextLibraryBhv reffererBhv = (LdNextLibraryBhv)getDaoSelector().getRBhv(LdNextLibraryBhv.class);
        final LdNextLibraryCB cb = reffererBhv.newMyConditionBean();
        cb.query().setLibraryId_InScope(pkList);
        cb.query().addOrderBy_LibraryId_Asc();
        reffererCondition.setup(cb);
        final java.util.List<LdNextLibrary> reffererList = reffererBhv.delegateSelectListTx(cb);

        final java.util.Map<java.math.BigDecimal, java.util.List<LdNextLibrary>> pkReffererListMap;
        pkReffererListMap = new java.util.LinkedHashMap<java.math.BigDecimal, java.util.List<LdNextLibrary>>();
        for (final java.util.Iterator ite = reffererList.iterator(); ite.hasNext(); ) {
            final LdNextLibrary reffererEntity = (LdNextLibrary)ite.next();
            if (!pkReffererListMap.containsKey(reffererEntity.getLibraryId())) {
                pkReffererListMap.put(reffererEntity.getLibraryId(), new java.util.ArrayList<LdNextLibrary>());
            }
            ((java.util.List<LdNextLibrary>)pkReffererListMap.get(reffererEntity.getLibraryId())).add(reffererEntity);

            // for Reverse Reference.
            final LdLibrary myEntity = (LdLibrary)pkMyEntityMap.get(reffererEntity.getLibraryId());
            reffererEntity.setLibraryByLibraryId(myEntity);
        }

        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdLibrary entity = (LdLibrary)ite.next();
            entity.setNextLibraryByLibraryIdList((java.util.List<LdNextLibrary>)pkReffererListMap.get(entity.getLibraryId()));
        }
    }

    /**
     * The interface of refferer condition for nextLibraryByLibraryIdList.
     */
    public static interface ReffererConditionNextLibraryByLibraryIdList {
        /**
         * Set up refferer condition.
         * 
         * @param cb Condition-bean for refferer. (NotNull)
         */
        public void setup(LdNextLibraryCB cb);
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
    public int insertOrUpdateAfterSelectForUpdateTx(LdLibrary entity) {
        assertEntityNotNull(entity);
        final String mapString = entity.extractPrimaryKeyMapString();
        LdLibrary currentEntity = null;
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
    public int updateAfterSelectForUpdateTx(LdLibrary entity) {
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        final LdLibrary currentEntity = selectForUpdateByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
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
        final LdLibrary sourceMyEntity = (LdLibrary)sourceEntity;
        final LdLibrary destinationMyEntity = (LdLibrary)destinationEntity;
  
        if (sourceMyEntity.isSetterInvokedLibraryId()) {
            destinationMyEntity.setLibraryId(sourceMyEntity.getLibraryId());
        }
  
        if (sourceMyEntity.isSetterInvokedLibraryName()) {
            destinationMyEntity.setLibraryName(sourceMyEntity.getLibraryName());
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

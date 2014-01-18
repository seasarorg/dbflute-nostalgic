
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
 * The behavior of COLLECTION_STATUS_LOOKUP.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsCollectionStatusLookupBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Dao instance. */
    protected LdCollectionStatusLookupDao _dao;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBsCollectionStatusLookupBhv() {
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
        return "COLLECTION_STATUS_LOOKUP";
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
        return LdCollectionStatusLookupDbm.getInstance();
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    /**
     * Get my dao.
     * 
     * @return My dao.
     */
    public LdCollectionStatusLookupDao getMyDao() {
        return _dao;
    }

    /**
     * Set my dao.
     * 
     * @param dao My dao. (NotNull)
     */
    public void setMyDao(LdCollectionStatusLookupDao dao) {
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
    public LdCollectionStatusLookup newMyEntity() {
        return new LdCollectionStatusLookup();
    }

    /**
     * New my condition-bean.
     * 
     * @return My condition-bean. (NotNull)
     */
    public LdCollectionStatusLookupCB newMyConditionBean() {
        return new LdCollectionStatusLookupCB();
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
    public java.util.List<LdCollectionStatusLookup> delegateGetListAllTx() {
        return getMyDao().getListAll();
    }

    //
    // Get entity. (Delegate-Method)
    // 
    // @param Primary-keys (NotNull)
    // @return Entity. (NotNull)
    //
    public LdCollectionStatusLookup delegateGetEntityTx(String collectionStatusCode) {
        return getMyDao().getEntity(collectionStatusCode);
    }

    /**
     * Select count by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int delegateSelectCountIgnoreFetchScopeTx(LdCollectionStatusLookupCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectCountIgnoreFetchScope(cb);
    }

    /**
     * Select entity by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdCollectionStatusLookup delegateSelectEntityTx(LdCollectionStatusLookupCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectEntity(cb);
    }

    /**
     * Select list by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected list. If the select result is zero, it returns empty list. (NotNull)
     */
    public java.util.List<LdCollectionStatusLookup> delegateSelectListTx(LdCollectionStatusLookupCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectList(cb);
    }



    /**
     * Insert one entity. (Delegate-Method)
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int delegateInsertTx(LdCollectionStatusLookup entity) {
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
    public int delegateUpdateTx(LdCollectionStatusLookup entity) {
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
    public int delegateDeleteTx(LdCollectionStatusLookup entity) {
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
    public int delegateInsertListTx(java.util.List<LdCollectionStatusLookup> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().insertList(entityList);
    }

    /**
     * Update several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Updated count.
     */
    public int delegateUpdateListTx(java.util.List<LdCollectionStatusLookup> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().updateList(entityList);
    }

    /**
     * Delete several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Deleted count.
     */
    public int delegateDeleteListTx(java.util.List<LdCollectionStatusLookup> entityList) {
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
    public LdListResultBean<LdCollectionStatusLookup> selectListTx(LdCollectionStatusLookupCB cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<LdCollectionStatusLookup>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }

    /**
     * Select page.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected page as first page. (NotNull)
     */
    public LdPagingResultBean<LdCollectionStatusLookup> selectPageTx(final LdCollectionStatusLookupCB cb) {
        assertConditionBeanNotNull(cb);
        final SelectPageCallback<LdCollectionStatusLookup> pageCallback = new SelectPageCallback<LdCollectionStatusLookup>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int selectCountIgnoreFetchScope() {
                return delegateSelectCountIgnoreFetchScopeTx(cb);
            }
            public java.util.List<LdCollectionStatusLookup> selectList() {
                return delegateSelectListTx(cb);
            }
        };
        return new SelectPageInvoker<LdCollectionStatusLookup>(this).invokeSelectPage(pageCallback);
    }

    /**
     * Select entity by condition-bean with deleted check.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdCollectionStatusLookup selectEntityWithDeletedCheckTx(LdCollectionStatusLookupCB cb) {
        assertConditionBeanNotNull(cb);
        dbflute.ldb.exentity.LdCollectionStatusLookup currentEntity = delegateSelectEntityTx(cb);
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
    public LdListResultBean selectListAfterCheckingCountIgnoreFetchScopeTx(LdCollectionStatusLookupCB cb, int maxCount) {
        assertConditionBeanNotNull(cb);
        final int selectedCount = delegateSelectCountIgnoreFetchScopeTx(cb);
        assertSelectedCountHasNotExceededMaxCount(selectedCount, maxCount, cb.toString());
        return new ResultBeanBuilder<LdCollectionStatusLookup>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }


    public LdCollectionStatusLookup selectForReadOnlyByPKValueWithDeletedCheckTx(String collectionStatusCode) {
        LdCollectionStatusLookup entity = new LdCollectionStatusLookup();
        entity.setCollectionStatusCode(collectionStatusCode);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for read only with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-read-only. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdCollectionStatusLookup selectForReadOnlyByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdCollectionStatusLookupCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString);
        final dbflute.ldb.exentity.LdCollectionStatusLookup currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }

    public LdCollectionStatusLookup selectForUpdateByPKValueWithDeletedCheckTx(String collectionStatusCode) {
        LdCollectionStatusLookup entity = new LdCollectionStatusLookup();
        entity.setCollectionStatusCode(collectionStatusCode);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for update with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdCollectionStatusLookup selectForUpdateByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdCollectionStatusLookupCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString).lockForUpdate();
        final dbflute.ldb.exentity.LdCollectionStatusLookup currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }


    // =====================================================================================
    //                                                                         Load Refferer
    //                                                                         =============
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ReffererTable    = [COLLECTION_STATUS]
    //   ReffererProperty = [collectionStatusList]
    // * * * * * * * * */

    /**
     * Load refferer of collectionStatusList.
     * 
     * Default refferer order-by is 'primary-key asc'.
     * <pre>
     *   ex) Refferer order-by is CollectionStatusCode.
     * 
     *     final LdBsCollectionStatusLookupBhv bhv = (LdBsCollectionStatusLookupBhv)getDaoSelector().getRBhv(LdBsCollectionStatusLookupBhv.class);
     *     final LdCollectionStatusLookupCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdCollectionStatusLookup> ls = bhv.delegateSelectList(cb);
     *     bhv.loadCollectionStatusList(ls);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     */
    public void loadCollectionStatusList(java.util.List<LdCollectionStatusLookup> ls) {
        final ReffererConditionCollectionStatusList reffererCondition = new ReffererConditionCollectionStatusList() {
            public void setup(LdCollectionStatusCB cb) {
                cb.addOrderBy_PK_Asc();// Default OrderBy for Refferer.
            }
        };
        loadCollectionStatusList(ls, reffererCondition);
    }

    /**
     * Load refferer of collectionStatusList.
     * 
     * <pre>
     *   ex) Refferer order-by is CollectionStatusCode.
     * 
     *     final LdBsCollectionStatusLookupBhv bhv = (LdBsCollectionStatusLookupBhv)getDaoSelector().getRBhv(LdBsCollectionStatusLookupBhv.class);
     *     final LdCollectionStatusLookupCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdCollectionStatusLookup> ls = bhv.delegateSelectList(cb);
     *     final ReffererConditionCollectionStatusList reffererCondition = new ReffererConditionCollectionStatusList() {
     *         public void setup(LdCollectionStatusCB cb) {
     *             cb.query().addOrderBy_CollectionStatusCode_Asc();
     *         }
     *     };
     *     bhv.loadCollectionStatusList(ls, reffererCondition);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     * @param reffererCondition Refferer condition instance for registering refferer condition. (NotNull)
     */
    public void loadCollectionStatusList(java.util.List<LdCollectionStatusLookup> ls, ReffererConditionCollectionStatusList reffererCondition) {
        assertObjectNotNull("ls", ls);
        assertObjectNotNull("reffererCondition", reffererCondition);
        if (ls.isEmpty()) {
            return;
        }

        final java.util.Map<String, LdCollectionStatusLookup> pkMyEntityMap = new java.util.LinkedHashMap<String, LdCollectionStatusLookup>();
        final java.util.List<String> pkList = new java.util.ArrayList<String>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdCollectionStatusLookup entity = (LdCollectionStatusLookup)ite.next();
            pkList.add(entity.getCollectionStatusCode());
            pkMyEntityMap.put(entity.getCollectionStatusCode(), entity);
        }
        final LdCollectionStatusBhv reffererBhv = (LdCollectionStatusBhv)getDaoSelector().getRBhv(LdCollectionStatusBhv.class);
        final LdCollectionStatusCB cb = reffererBhv.newMyConditionBean();
        cb.query().setCollectionStatusCode_InScope(pkList);
        cb.query().addOrderBy_CollectionStatusCode_Asc();
        reffererCondition.setup(cb);
        final java.util.List<LdCollectionStatus> reffererList = reffererBhv.delegateSelectListTx(cb);

        final java.util.Map<String, java.util.List<LdCollectionStatus>> pkReffererListMap;
        pkReffererListMap = new java.util.LinkedHashMap<String, java.util.List<LdCollectionStatus>>();
        for (final java.util.Iterator ite = reffererList.iterator(); ite.hasNext(); ) {
            final LdCollectionStatus reffererEntity = (LdCollectionStatus)ite.next();
            if (!pkReffererListMap.containsKey(reffererEntity.getCollectionStatusCode())) {
                pkReffererListMap.put(reffererEntity.getCollectionStatusCode(), new java.util.ArrayList<LdCollectionStatus>());
            }
            ((java.util.List<LdCollectionStatus>)pkReffererListMap.get(reffererEntity.getCollectionStatusCode())).add(reffererEntity);

            // for Reverse Reference.
            final LdCollectionStatusLookup myEntity = (LdCollectionStatusLookup)pkMyEntityMap.get(reffererEntity.getCollectionStatusCode());
            reffererEntity.setCollectionStatusLookup(myEntity);
        }

        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdCollectionStatusLookup entity = (LdCollectionStatusLookup)ite.next();
            entity.setCollectionStatusList((java.util.List<LdCollectionStatus>)pkReffererListMap.get(entity.getCollectionStatusCode()));
        }
    }

    /**
     * The interface of refferer condition for collectionStatusList.
     */
    public static interface ReffererConditionCollectionStatusList {
        /**
         * Set up refferer condition.
         * 
         * @param cb Condition-bean for refferer. (NotNull)
         */
        public void setup(LdCollectionStatusCB cb);
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
    public int insertOrUpdateAfterSelectForUpdateTx(LdCollectionStatusLookup entity) {
        assertEntityNotNull(entity);
        final String mapString = entity.extractPrimaryKeyMapString();
        LdCollectionStatusLookup currentEntity = null;
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
    public int updateAfterSelectForUpdateTx(LdCollectionStatusLookup entity) {
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        final LdCollectionStatusLookup currentEntity = selectForUpdateByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
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
        final LdCollectionStatusLookup sourceMyEntity = (LdCollectionStatusLookup)sourceEntity;
        final LdCollectionStatusLookup destinationMyEntity = (LdCollectionStatusLookup)destinationEntity;
  
        if (sourceMyEntity.isSetterInvokedCollectionStatusCode()) {
            destinationMyEntity.setCollectionStatusCode(sourceMyEntity.getCollectionStatusCode());
        }
  
        if (sourceMyEntity.isSetterInvokedCollectionStatusName()) {
            destinationMyEntity.setCollectionStatusName(sourceMyEntity.getCollectionStatusName());
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


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
 * The behavior of BLACK_LIST.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBlackListBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Dao instance. */
    protected LdBlackListDao _dao;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBsBlackListBhv() {
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
        return "BLACK_LIST";
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
        return LdBlackListDbm.getInstance();
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    /**
     * Get my dao.
     * 
     * @return My dao.
     */
    public LdBlackListDao getMyDao() {
        return _dao;
    }

    /**
     * Set my dao.
     * 
     * @param dao My dao. (NotNull)
     */
    public void setMyDao(LdBlackListDao dao) {
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
    public LdBlackList newMyEntity() {
        return new LdBlackList();
    }

    /**
     * New my condition-bean.
     * 
     * @return My condition-bean. (NotNull)
     */
    public LdBlackListCB newMyConditionBean() {
        return new LdBlackListCB();
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
    public java.util.List<LdBlackList> delegateGetListAllTx() {
        return getMyDao().getListAll();
    }

    //
    // Get entity. (Delegate-Method)
    // 
    // @param Primary-keys (NotNull)
    // @return Entity. (NotNull)
    //
    public LdBlackList delegateGetEntityTx(java.math.BigDecimal blackListId) {
        return getMyDao().getEntity(blackListId);
    }

    /**
     * Select count by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int delegateSelectCountIgnoreFetchScopeTx(LdBlackListCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectCountIgnoreFetchScope(cb);
    }

    /**
     * Select entity by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdBlackList delegateSelectEntityTx(LdBlackListCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectEntity(cb);
    }

    /**
     * Select list by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected list. If the select result is zero, it returns empty list. (NotNull)
     */
    public java.util.List<LdBlackList> delegateSelectListTx(LdBlackListCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectList(cb);
    }



    /**
     * Insert one entity. (Delegate-Method)
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int delegateInsertTx(LdBlackList entity) {
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
    public int delegateUpdateTx(LdBlackList entity) {
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
    public int delegateDeleteTx(LdBlackList entity) {
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
    public int delegateInsertListTx(java.util.List<LdBlackList> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().insertList(entityList);
    }

    /**
     * Update several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Updated count.
     */
    public int delegateUpdateListTx(java.util.List<LdBlackList> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().updateList(entityList);
    }

    /**
     * Delete several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Deleted count.
     */
    public int delegateDeleteListTx(java.util.List<LdBlackList> entityList) {
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
    public LdListResultBean<LdBlackList> selectListTx(LdBlackListCB cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<LdBlackList>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }

    /**
     * Select page.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected page as first page. (NotNull)
     */
    public LdPagingResultBean<LdBlackList> selectPageTx(final LdBlackListCB cb) {
        assertConditionBeanNotNull(cb);
        final SelectPageCallback<LdBlackList> pageCallback = new SelectPageCallback<LdBlackList>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int selectCountIgnoreFetchScope() {
                return delegateSelectCountIgnoreFetchScopeTx(cb);
            }
            public java.util.List<LdBlackList> selectList() {
                return delegateSelectListTx(cb);
            }
        };
        return new SelectPageInvoker<LdBlackList>(this).invokeSelectPage(pageCallback);
    }

    /**
     * Select entity by condition-bean with deleted check.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdBlackList selectEntityWithDeletedCheckTx(LdBlackListCB cb) {
        assertConditionBeanNotNull(cb);
        dbflute.ldb.exentity.LdBlackList currentEntity = delegateSelectEntityTx(cb);
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
    public LdListResultBean selectListAfterCheckingCountIgnoreFetchScopeTx(LdBlackListCB cb, int maxCount) {
        assertConditionBeanNotNull(cb);
        final int selectedCount = delegateSelectCountIgnoreFetchScopeTx(cb);
        assertSelectedCountHasNotExceededMaxCount(selectedCount, maxCount, cb.toString());
        return new ResultBeanBuilder<LdBlackList>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }


    public LdBlackList selectForReadOnlyByPKValueWithDeletedCheckTx(java.math.BigDecimal blackListId) {
        LdBlackList entity = new LdBlackList();
        entity.setBlackListId(blackListId);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for read only with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-read-only. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdBlackList selectForReadOnlyByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdBlackListCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString);
        final dbflute.ldb.exentity.LdBlackList currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }

    public LdBlackList selectForUpdateByPKValueWithDeletedCheckTx(java.math.BigDecimal blackListId) {
        LdBlackList entity = new LdBlackList();
        entity.setBlackListId(blackListId);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for update with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdBlackList selectForUpdateByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdBlackListCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString).lockForUpdate();
        final dbflute.ldb.exentity.LdBlackList currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }


    // =====================================================================================
    //                                                                         Load Refferer
    //                                                                         =============
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ReffererTable    = [BLACK_ACTION]
    //   ReffererProperty = [blackActionList]
    // * * * * * * * * */

    /**
     * Load refferer of blackActionList.
     * 
     * Default refferer order-by is 'primary-key asc'.
     * <pre>
     *   ex) Refferer order-by is BlackListId.
     * 
     *     final LdBsBlackListBhv bhv = (LdBsBlackListBhv)getDaoSelector().getRBhv(LdBsBlackListBhv.class);
     *     final LdBlackListCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdBlackList> ls = bhv.delegateSelectList(cb);
     *     bhv.loadBlackActionList(ls);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     */
    public void loadBlackActionList(java.util.List<LdBlackList> ls) {
        final ReffererConditionBlackActionList reffererCondition = new ReffererConditionBlackActionList() {
            public void setup(LdBlackActionCB cb) {
                cb.addOrderBy_PK_Asc();// Default OrderBy for Refferer.
            }
        };
        loadBlackActionList(ls, reffererCondition);
    }

    /**
     * Load refferer of blackActionList.
     * 
     * <pre>
     *   ex) Refferer order-by is BlackListId.
     * 
     *     final LdBsBlackListBhv bhv = (LdBsBlackListBhv)getDaoSelector().getRBhv(LdBsBlackListBhv.class);
     *     final LdBlackListCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdBlackList> ls = bhv.delegateSelectList(cb);
     *     final ReffererConditionBlackActionList reffererCondition = new ReffererConditionBlackActionList() {
     *         public void setup(LdBlackActionCB cb) {
     *             cb.query().addOrderBy_BlackListId_Asc();
     *         }
     *     };
     *     bhv.loadBlackActionList(ls, reffererCondition);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     * @param reffererCondition Refferer condition instance for registering refferer condition. (NotNull)
     */
    public void loadBlackActionList(java.util.List<LdBlackList> ls, ReffererConditionBlackActionList reffererCondition) {
        assertObjectNotNull("ls", ls);
        assertObjectNotNull("reffererCondition", reffererCondition);
        if (ls.isEmpty()) {
            return;
        }

        final java.util.Map<java.math.BigDecimal, LdBlackList> pkMyEntityMap = new java.util.LinkedHashMap<java.math.BigDecimal, LdBlackList>();
        final java.util.List<java.math.BigDecimal> pkList = new java.util.ArrayList<java.math.BigDecimal>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdBlackList entity = (LdBlackList)ite.next();
            pkList.add(entity.getBlackListId());
            pkMyEntityMap.put(entity.getBlackListId(), entity);
        }
        final LdBlackActionBhv reffererBhv = (LdBlackActionBhv)getDaoSelector().getRBhv(LdBlackActionBhv.class);
        final LdBlackActionCB cb = reffererBhv.newMyConditionBean();
        cb.query().setBlackListId_InScope(pkList);
        cb.query().addOrderBy_BlackListId_Asc();
        reffererCondition.setup(cb);
        final java.util.List<LdBlackAction> reffererList = reffererBhv.delegateSelectListTx(cb);

        final java.util.Map<java.math.BigDecimal, java.util.List<LdBlackAction>> pkReffererListMap;
        pkReffererListMap = new java.util.LinkedHashMap<java.math.BigDecimal, java.util.List<LdBlackAction>>();
        for (final java.util.Iterator ite = reffererList.iterator(); ite.hasNext(); ) {
            final LdBlackAction reffererEntity = (LdBlackAction)ite.next();
            if (!pkReffererListMap.containsKey(reffererEntity.getBlackListId())) {
                pkReffererListMap.put(reffererEntity.getBlackListId(), new java.util.ArrayList<LdBlackAction>());
            }
            ((java.util.List<LdBlackAction>)pkReffererListMap.get(reffererEntity.getBlackListId())).add(reffererEntity);

            // for Reverse Reference.
            final LdBlackList myEntity = (LdBlackList)pkMyEntityMap.get(reffererEntity.getBlackListId());
            reffererEntity.setBlackList(myEntity);
        }

        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdBlackList entity = (LdBlackList)ite.next();
            entity.setBlackActionList((java.util.List<LdBlackAction>)pkReffererListMap.get(entity.getBlackListId()));
        }
    }

    /**
     * The interface of refferer condition for blackActionList.
     */
    public static interface ReffererConditionBlackActionList {
        /**
         * Set up refferer condition.
         * 
         * @param cb Condition-bean for refferer. (NotNull)
         */
        public void setup(LdBlackActionCB cb);
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
    public int insertOrUpdateAfterSelectForUpdateTx(LdBlackList entity) {
        assertEntityNotNull(entity);
        final String mapString = entity.extractPrimaryKeyMapString();
        LdBlackList currentEntity = null;
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
    public int updateAfterSelectForUpdateTx(LdBlackList entity) {
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        final LdBlackList currentEntity = selectForUpdateByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
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
        final LdBlackList sourceMyEntity = (LdBlackList)sourceEntity;
        final LdBlackList destinationMyEntity = (LdBlackList)destinationEntity;
  
        if (sourceMyEntity.isSetterInvokedBlackListId()) {
            destinationMyEntity.setBlackListId(sourceMyEntity.getBlackListId());
        }
  
        if (sourceMyEntity.isSetterInvokedLbUserId()) {
            destinationMyEntity.setLbUserId(sourceMyEntity.getLbUserId());
        }
  
        if (sourceMyEntity.isSetterInvokedBlackRank()) {
            destinationMyEntity.setBlackRank(sourceMyEntity.getBlackRank());
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


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
 * The behavior of LB_USER.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLbUserBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Dao instance. */
    protected LdLbUserDao _dao;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBsLbUserBhv() {
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
        return "LB_USER";
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
        return LdLbUserDbm.getInstance();
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    /**
     * Get my dao.
     * 
     * @return My dao.
     */
    public LdLbUserDao getMyDao() {
        return _dao;
    }

    /**
     * Set my dao.
     * 
     * @param dao My dao. (NotNull)
     */
    public void setMyDao(LdLbUserDao dao) {
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
    public LdLbUser newMyEntity() {
        return new LdLbUser();
    }

    /**
     * New my condition-bean.
     * 
     * @return My condition-bean. (NotNull)
     */
    public LdLbUserCB newMyConditionBean() {
        return new LdLbUserCB();
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
    public java.util.List<LdLbUser> delegateGetListAllTx() {
        return getMyDao().getListAll();
    }

    //
    // Get entity. (Delegate-Method)
    // 
    // @param Primary-keys (NotNull)
    // @return Entity. (NotNull)
    //
    public LdLbUser delegateGetEntityTx(java.math.BigDecimal lbUserId) {
        return getMyDao().getEntity(lbUserId);
    }

    /**
     * Select count by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int delegateSelectCountIgnoreFetchScopeTx(LdLbUserCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectCountIgnoreFetchScope(cb);
    }

    /**
     * Select entity by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdLbUser delegateSelectEntityTx(LdLbUserCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectEntity(cb);
    }

    /**
     * Select list by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected list. If the select result is zero, it returns empty list. (NotNull)
     */
    public java.util.List<LdLbUser> delegateSelectListTx(LdLbUserCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectList(cb);
    }



    /**
     * Insert one entity. (Delegate-Method)
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int delegateInsertTx(LdLbUser entity) {
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
    public int delegateUpdateTx(LdLbUser entity) {
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
    public int delegateDeleteTx(LdLbUser entity) {
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
    public int delegateInsertListTx(java.util.List<LdLbUser> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().insertList(entityList);
    }

    /**
     * Update several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Updated count.
     */
    public int delegateUpdateListTx(java.util.List<LdLbUser> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().updateList(entityList);
    }

    /**
     * Delete several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Deleted count.
     */
    public int delegateDeleteListTx(java.util.List<LdLbUser> entityList) {
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
    public LdListResultBean<LdLbUser> selectListTx(LdLbUserCB cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<LdLbUser>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }

    /**
     * Select page.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected page as first page. (NotNull)
     */
    public LdPagingResultBean<LdLbUser> selectPageTx(final LdLbUserCB cb) {
        assertConditionBeanNotNull(cb);
        final SelectPageCallback<LdLbUser> pageCallback = new SelectPageCallback<LdLbUser>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int selectCountIgnoreFetchScope() {
                return delegateSelectCountIgnoreFetchScopeTx(cb);
            }
            public java.util.List<LdLbUser> selectList() {
                return delegateSelectListTx(cb);
            }
        };
        return new SelectPageInvoker<LdLbUser>(this).invokeSelectPage(pageCallback);
    }

    /**
     * Select entity by condition-bean with deleted check.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdLbUser selectEntityWithDeletedCheckTx(LdLbUserCB cb) {
        assertConditionBeanNotNull(cb);
        dbflute.ldb.exentity.LdLbUser currentEntity = delegateSelectEntityTx(cb);
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
    public LdListResultBean selectListAfterCheckingCountIgnoreFetchScopeTx(LdLbUserCB cb, int maxCount) {
        assertConditionBeanNotNull(cb);
        final int selectedCount = delegateSelectCountIgnoreFetchScopeTx(cb);
        assertSelectedCountHasNotExceededMaxCount(selectedCount, maxCount, cb.toString());
        return new ResultBeanBuilder<LdLbUser>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }


    public LdLbUser selectForReadOnlyByPKValueWithDeletedCheckTx(java.math.BigDecimal lbUserId) {
        LdLbUser entity = new LdLbUser();
        entity.setLbUserId(lbUserId);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for read only with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-read-only. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdLbUser selectForReadOnlyByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdLbUserCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString);
        final dbflute.ldb.exentity.LdLbUser currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }

    public LdLbUser selectForUpdateByPKValueWithDeletedCheckTx(java.math.BigDecimal lbUserId) {
        LdLbUser entity = new LdLbUser();
        entity.setLbUserId(lbUserId);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for update with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdLbUser selectForUpdateByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdLbUserCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString).lockForUpdate();
        final dbflute.ldb.exentity.LdLbUser currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }


    // =====================================================================================
    //                                                                         Load Refferer
    //                                                                         =============
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ReffererTable    = [BLACK_LIST]
    //   ReffererProperty = [blackListList]
    // * * * * * * * * */

    /**
     * Load refferer of blackListList.
     * 
     * Default refferer order-by is 'primary-key asc'.
     * <pre>
     *   ex) Refferer order-by is LbUserId.
     * 
     *     final LdBsLbUserBhv bhv = (LdBsLbUserBhv)getDaoSelector().getRBhv(LdBsLbUserBhv.class);
     *     final LdLbUserCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdLbUser> ls = bhv.delegateSelectList(cb);
     *     bhv.loadBlackListList(ls);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     */
    public void loadBlackListList(java.util.List<LdLbUser> ls) {
        final ReffererConditionBlackListList reffererCondition = new ReffererConditionBlackListList() {
            public void setup(LdBlackListCB cb) {
                cb.addOrderBy_PK_Asc();// Default OrderBy for Refferer.
            }
        };
        loadBlackListList(ls, reffererCondition);
    }

    /**
     * Load refferer of blackListList.
     * 
     * <pre>
     *   ex) Refferer order-by is LbUserId.
     * 
     *     final LdBsLbUserBhv bhv = (LdBsLbUserBhv)getDaoSelector().getRBhv(LdBsLbUserBhv.class);
     *     final LdLbUserCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdLbUser> ls = bhv.delegateSelectList(cb);
     *     final ReffererConditionBlackListList reffererCondition = new ReffererConditionBlackListList() {
     *         public void setup(LdBlackListCB cb) {
     *             cb.query().addOrderBy_LbUserId_Asc();
     *         }
     *     };
     *     bhv.loadBlackListList(ls, reffererCondition);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     * @param reffererCondition Refferer condition instance for registering refferer condition. (NotNull)
     */
    public void loadBlackListList(java.util.List<LdLbUser> ls, ReffererConditionBlackListList reffererCondition) {
        assertObjectNotNull("ls", ls);
        assertObjectNotNull("reffererCondition", reffererCondition);
        if (ls.isEmpty()) {
            return;
        }

        final java.util.Map<java.math.BigDecimal, LdLbUser> pkMyEntityMap = new java.util.LinkedHashMap<java.math.BigDecimal, LdLbUser>();
        final java.util.List<java.math.BigDecimal> pkList = new java.util.ArrayList<java.math.BigDecimal>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdLbUser entity = (LdLbUser)ite.next();
            pkList.add(entity.getLbUserId());
            pkMyEntityMap.put(entity.getLbUserId(), entity);
        }
        final LdBlackListBhv reffererBhv = (LdBlackListBhv)getDaoSelector().getRBhv(LdBlackListBhv.class);
        final LdBlackListCB cb = reffererBhv.newMyConditionBean();
        cb.query().setLbUserId_InScope(pkList);
        cb.query().addOrderBy_LbUserId_Asc();
        reffererCondition.setup(cb);
        final java.util.List<LdBlackList> reffererList = reffererBhv.delegateSelectListTx(cb);

        final java.util.Map<java.math.BigDecimal, java.util.List<LdBlackList>> pkReffererListMap;
        pkReffererListMap = new java.util.LinkedHashMap<java.math.BigDecimal, java.util.List<LdBlackList>>();
        for (final java.util.Iterator ite = reffererList.iterator(); ite.hasNext(); ) {
            final LdBlackList reffererEntity = (LdBlackList)ite.next();
            if (!pkReffererListMap.containsKey(reffererEntity.getLbUserId())) {
                pkReffererListMap.put(reffererEntity.getLbUserId(), new java.util.ArrayList<LdBlackList>());
            }
            ((java.util.List<LdBlackList>)pkReffererListMap.get(reffererEntity.getLbUserId())).add(reffererEntity);

            // for Reverse Reference.
            final LdLbUser myEntity = (LdLbUser)pkMyEntityMap.get(reffererEntity.getLbUserId());
            reffererEntity.setLbUser(myEntity);
        }

        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdLbUser entity = (LdLbUser)ite.next();
            entity.setBlackListList((java.util.List<LdBlackList>)pkReffererListMap.get(entity.getLbUserId()));
        }
    }

    /**
     * The interface of refferer condition for blackListList.
     */
    public static interface ReffererConditionBlackListList {
        /**
         * Set up refferer condition.
         * 
         * @param cb Condition-bean for refferer. (NotNull)
         */
        public void setup(LdBlackListCB cb);
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
     *   ex) Refferer order-by is LbUserId.
     * 
     *     final LdBsLbUserBhv bhv = (LdBsLbUserBhv)getDaoSelector().getRBhv(LdBsLbUserBhv.class);
     *     final LdLbUserCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdLbUser> ls = bhv.delegateSelectList(cb);
     *     bhv.loadLendingList(ls);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     */
    public void loadLendingList(java.util.List<LdLbUser> ls) {
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
     *   ex) Refferer order-by is LbUserId.
     * 
     *     final LdBsLbUserBhv bhv = (LdBsLbUserBhv)getDaoSelector().getRBhv(LdBsLbUserBhv.class);
     *     final LdLbUserCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdLbUser> ls = bhv.delegateSelectList(cb);
     *     final ReffererConditionLendingList reffererCondition = new ReffererConditionLendingList() {
     *         public void setup(LdLendingCB cb) {
     *             cb.query().addOrderBy_LbUserId_Asc();
     *         }
     *     };
     *     bhv.loadLendingList(ls, reffererCondition);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     * @param reffererCondition Refferer condition instance for registering refferer condition. (NotNull)
     */
    public void loadLendingList(java.util.List<LdLbUser> ls, ReffererConditionLendingList reffererCondition) {
        assertObjectNotNull("ls", ls);
        assertObjectNotNull("reffererCondition", reffererCondition);
        if (ls.isEmpty()) {
            return;
        }

        final java.util.Map<java.math.BigDecimal, LdLbUser> pkMyEntityMap = new java.util.LinkedHashMap<java.math.BigDecimal, LdLbUser>();
        final java.util.List<java.math.BigDecimal> pkList = new java.util.ArrayList<java.math.BigDecimal>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdLbUser entity = (LdLbUser)ite.next();
            pkList.add(entity.getLbUserId());
            pkMyEntityMap.put(entity.getLbUserId(), entity);
        }
        final LdLendingBhv reffererBhv = (LdLendingBhv)getDaoSelector().getRBhv(LdLendingBhv.class);
        final LdLendingCB cb = reffererBhv.newMyConditionBean();
        cb.query().setLbUserId_InScope(pkList);
        cb.query().addOrderBy_LbUserId_Asc();
        reffererCondition.setup(cb);
        final java.util.List<LdLending> reffererList = reffererBhv.delegateSelectListTx(cb);

        final java.util.Map<java.math.BigDecimal, java.util.List<LdLending>> pkReffererListMap;
        pkReffererListMap = new java.util.LinkedHashMap<java.math.BigDecimal, java.util.List<LdLending>>();
        for (final java.util.Iterator ite = reffererList.iterator(); ite.hasNext(); ) {
            final LdLending reffererEntity = (LdLending)ite.next();
            if (!pkReffererListMap.containsKey(reffererEntity.getLbUserId())) {
                pkReffererListMap.put(reffererEntity.getLbUserId(), new java.util.ArrayList<LdLending>());
            }
            ((java.util.List<LdLending>)pkReffererListMap.get(reffererEntity.getLbUserId())).add(reffererEntity);

            // for Reverse Reference.
            final LdLbUser myEntity = (LdLbUser)pkMyEntityMap.get(reffererEntity.getLbUserId());
            reffererEntity.setLbUser(myEntity);
        }

        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdLbUser entity = (LdLbUser)ite.next();
            entity.setLendingList((java.util.List<LdLending>)pkReffererListMap.get(entity.getLbUserId()));
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
  
    // =====================================================================================
    //                                                                          Basic Update
    //                                                                          ============


    /**
     * Insert or update after select-for-update.
     * 
     * @param entity Entity. This must contain primary-key value at least. (NotNull)
     * @return Updated count.
     */
    public int insertOrUpdateAfterSelectForUpdateTx(LdLbUser entity) {
        assertEntityNotNull(entity);
        final String mapString = entity.extractPrimaryKeyMapString();
        LdLbUser currentEntity = null;
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
    public int updateAfterSelectForUpdateTx(LdLbUser entity) {
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        final LdLbUser currentEntity = selectForUpdateByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
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
        final LdLbUser sourceMyEntity = (LdLbUser)sourceEntity;
        final LdLbUser destinationMyEntity = (LdLbUser)destinationEntity;
  
        if (sourceMyEntity.isSetterInvokedLbUserId()) {
            destinationMyEntity.setLbUserId(sourceMyEntity.getLbUserId());
        }
  
        if (sourceMyEntity.isSetterInvokedLbUserName()) {
            destinationMyEntity.setLbUserName(sourceMyEntity.getLbUserName());
        }
  
        if (sourceMyEntity.isSetterInvokedLibraryId()) {
            destinationMyEntity.setLibraryId(sourceMyEntity.getLibraryId());
        }
  
        if (sourceMyEntity.isSetterInvokedUserPassword()) {
            destinationMyEntity.setUserPassword(sourceMyEntity.getUserPassword());
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


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
 * The behavior of PUBLISHER.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsPublisherBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Dao instance. */
    protected LdPublisherDao _dao;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBsPublisherBhv() {
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
        return "PUBLISHER";
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
        return LdPublisherDbm.getInstance();
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    /**
     * Get my dao.
     * 
     * @return My dao.
     */
    public LdPublisherDao getMyDao() {
        return _dao;
    }

    /**
     * Set my dao.
     * 
     * @param dao My dao. (NotNull)
     */
    public void setMyDao(LdPublisherDao dao) {
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
    public LdPublisher newMyEntity() {
        return new LdPublisher();
    }

    /**
     * New my condition-bean.
     * 
     * @return My condition-bean. (NotNull)
     */
    public LdPublisherCB newMyConditionBean() {
        return new LdPublisherCB();
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
    public java.util.List<LdPublisher> delegateGetListAllTx() {
        return getMyDao().getListAll();
    }

    //
    // Get entity. (Delegate-Method)
    // 
    // @param Primary-keys (NotNull)
    // @return Entity. (NotNull)
    //
    public LdPublisher delegateGetEntityTx(java.math.BigDecimal publisherId) {
        return getMyDao().getEntity(publisherId);
    }

    /**
     * Select count by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int delegateSelectCountIgnoreFetchScopeTx(LdPublisherCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectCountIgnoreFetchScope(cb);
    }

    /**
     * Select entity by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdPublisher delegateSelectEntityTx(LdPublisherCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectEntity(cb);
    }

    /**
     * Select list by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected list. If the select result is zero, it returns empty list. (NotNull)
     */
    public java.util.List<LdPublisher> delegateSelectListTx(LdPublisherCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectList(cb);
    }



    /**
     * Insert one entity. (Delegate-Method)
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int delegateInsertTx(LdPublisher entity) {
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
    public int delegateUpdateTx(LdPublisher entity) {
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
    public int delegateDeleteTx(LdPublisher entity) {
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
    public int delegateInsertListTx(java.util.List<LdPublisher> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().insertList(entityList);
    }

    /**
     * Update several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Updated count.
     */
    public int delegateUpdateListTx(java.util.List<LdPublisher> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().updateList(entityList);
    }

    /**
     * Delete several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Deleted count.
     */
    public int delegateDeleteListTx(java.util.List<LdPublisher> entityList) {
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
    public LdListResultBean<LdPublisher> selectListTx(LdPublisherCB cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<LdPublisher>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }

    /**
     * Select page.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected page as first page. (NotNull)
     */
    public LdPagingResultBean<LdPublisher> selectPageTx(final LdPublisherCB cb) {
        assertConditionBeanNotNull(cb);
        final SelectPageCallback<LdPublisher> pageCallback = new SelectPageCallback<LdPublisher>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int selectCountIgnoreFetchScope() {
                return delegateSelectCountIgnoreFetchScopeTx(cb);
            }
            public java.util.List<LdPublisher> selectList() {
                return delegateSelectListTx(cb);
            }
        };
        return new SelectPageInvoker<LdPublisher>(this).invokeSelectPage(pageCallback);
    }

    /**
     * Select entity by condition-bean with deleted check.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdPublisher selectEntityWithDeletedCheckTx(LdPublisherCB cb) {
        assertConditionBeanNotNull(cb);
        dbflute.ldb.exentity.LdPublisher currentEntity = delegateSelectEntityTx(cb);
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
    public LdListResultBean selectListAfterCheckingCountIgnoreFetchScopeTx(LdPublisherCB cb, int maxCount) {
        assertConditionBeanNotNull(cb);
        final int selectedCount = delegateSelectCountIgnoreFetchScopeTx(cb);
        assertSelectedCountHasNotExceededMaxCount(selectedCount, maxCount, cb.toString());
        return new ResultBeanBuilder<LdPublisher>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }


    public LdPublisher selectForReadOnlyByPKValueWithDeletedCheckTx(java.math.BigDecimal publisherId) {
        LdPublisher entity = new LdPublisher();
        entity.setPublisherId(publisherId);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for read only with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-read-only. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdPublisher selectForReadOnlyByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdPublisherCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString);
        final dbflute.ldb.exentity.LdPublisher currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }

    public LdPublisher selectForUpdateByPKValueWithDeletedCheckTx(java.math.BigDecimal publisherId) {
        LdPublisher entity = new LdPublisher();
        entity.setPublisherId(publisherId);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for update with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdPublisher selectForUpdateByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdPublisherCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString).lockForUpdate();
        final dbflute.ldb.exentity.LdPublisher currentEntity = delegateSelectEntityTx(cb);
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
     *   ex) Refferer order-by is PublisherId.
     * 
     *     final LdBsPublisherBhv bhv = (LdBsPublisherBhv)getDaoSelector().getRBhv(LdBsPublisherBhv.class);
     *     final LdPublisherCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdPublisher> ls = bhv.delegateSelectList(cb);
     *     bhv.loadBookList(ls);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     */
    public void loadBookList(java.util.List<LdPublisher> ls) {
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
     *   ex) Refferer order-by is PublisherId.
     * 
     *     final LdBsPublisherBhv bhv = (LdBsPublisherBhv)getDaoSelector().getRBhv(LdBsPublisherBhv.class);
     *     final LdPublisherCB cb = bhv.newMyConditionBean();
     *     cb.query().setXxx_Equal("xxx");
     *     final List<LdPublisher> ls = bhv.delegateSelectList(cb);
     *     final ReffererConditionBookList reffererCondition = new ReffererConditionBookList() {
     *         public void setup(LdBookCB cb) {
     *             cb.query().addOrderBy_PublisherId_Asc();
     *         }
     *     };
     *     bhv.loadBookList(ls, reffererCondition);
     * 
     * </pre>
     * 
     * @param ls Entity list of main table. (NotNull)
     * @param reffererCondition Refferer condition instance for registering refferer condition. (NotNull)
     */
    public void loadBookList(java.util.List<LdPublisher> ls, ReffererConditionBookList reffererCondition) {
        assertObjectNotNull("ls", ls);
        assertObjectNotNull("reffererCondition", reffererCondition);
        if (ls.isEmpty()) {
            return;
        }

        final java.util.Map<java.math.BigDecimal, LdPublisher> pkMyEntityMap = new java.util.LinkedHashMap<java.math.BigDecimal, LdPublisher>();
        final java.util.List<java.math.BigDecimal> pkList = new java.util.ArrayList<java.math.BigDecimal>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdPublisher entity = (LdPublisher)ite.next();
            pkList.add(entity.getPublisherId());
            pkMyEntityMap.put(entity.getPublisherId(), entity);
        }
        final LdBookBhv reffererBhv = (LdBookBhv)getDaoSelector().getRBhv(LdBookBhv.class);
        final LdBookCB cb = reffererBhv.newMyConditionBean();
        cb.query().setPublisherId_InScope(pkList);
        cb.query().addOrderBy_PublisherId_Asc();
        reffererCondition.setup(cb);
        final java.util.List<LdBook> reffererList = reffererBhv.delegateSelectListTx(cb);

        final java.util.Map<java.math.BigDecimal, java.util.List<LdBook>> pkReffererListMap;
        pkReffererListMap = new java.util.LinkedHashMap<java.math.BigDecimal, java.util.List<LdBook>>();
        for (final java.util.Iterator ite = reffererList.iterator(); ite.hasNext(); ) {
            final LdBook reffererEntity = (LdBook)ite.next();
            if (!pkReffererListMap.containsKey(reffererEntity.getPublisherId())) {
                pkReffererListMap.put(reffererEntity.getPublisherId(), new java.util.ArrayList<LdBook>());
            }
            ((java.util.List<LdBook>)pkReffererListMap.get(reffererEntity.getPublisherId())).add(reffererEntity);

            // for Reverse Reference.
            final LdPublisher myEntity = (LdPublisher)pkMyEntityMap.get(reffererEntity.getPublisherId());
            reffererEntity.setPublisher(myEntity);
        }

        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final LdPublisher entity = (LdPublisher)ite.next();
            entity.setBookList((java.util.List<LdBook>)pkReffererListMap.get(entity.getPublisherId()));
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
    public int insertOrUpdateAfterSelectForUpdateTx(LdPublisher entity) {
        assertEntityNotNull(entity);
        final String mapString = entity.extractPrimaryKeyMapString();
        LdPublisher currentEntity = null;
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
    public int updateAfterSelectForUpdateTx(LdPublisher entity) {
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        final LdPublisher currentEntity = selectForUpdateByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
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
        final LdPublisher sourceMyEntity = (LdPublisher)sourceEntity;
        final LdPublisher destinationMyEntity = (LdPublisher)destinationEntity;
  
        if (sourceMyEntity.isSetterInvokedPublisherId()) {
            destinationMyEntity.setPublisherId(sourceMyEntity.getPublisherId());
        }
  
        if (sourceMyEntity.isSetterInvokedPublisherName()) {
            destinationMyEntity.setPublisherName(sourceMyEntity.getPublisherName());
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

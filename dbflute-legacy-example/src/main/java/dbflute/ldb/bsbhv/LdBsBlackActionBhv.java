
package dbflute.ldb.bsbhv;

import dbflute.ldb.allcommon.*;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdPagingBean;
import dbflute.ldb.allcommon.cbean.LdPagingResultBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
  
import dbflute.ldb.exdao.*;
import dbflute.ldb.exentity.*;
import dbflute.ldb.bsentity.dbmeta.*;
import dbflute.ldb.cbean.*;



/**
 * The behavior of BLACK_ACTION.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBlackActionBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorWritable {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Dao instance. */
    protected LdBlackActionDao _dao;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBsBlackActionBhv() {
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
        return "BLACK_ACTION";
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
        return LdBlackActionDbm.getInstance();
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    /**
     * Get my dao.
     * 
     * @return My dao.
     */
    public LdBlackActionDao getMyDao() {
        return _dao;
    }

    /**
     * Set my dao.
     * 
     * @param dao My dao. (NotNull)
     */
    public void setMyDao(LdBlackActionDao dao) {
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
    public LdBlackAction newMyEntity() {
        return new LdBlackAction();
    }

    /**
     * New my condition-bean.
     * 
     * @return My condition-bean. (NotNull)
     */
    public LdBlackActionCB newMyConditionBean() {
        return new LdBlackActionCB();
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
    public java.util.List<LdBlackAction> delegateGetListAllTx() {
        return getMyDao().getListAll();
    }

    //
    // Get entity. (Delegate-Method)
    // 
    // @param Primary-keys (NotNull)
    // @return Entity. (NotNull)
    //
    public LdBlackAction delegateGetEntityTx(java.math.BigDecimal blackActionId) {
        return getMyDao().getEntity(blackActionId);
    }

    /**
     * Select count by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int delegateSelectCountIgnoreFetchScopeTx(LdBlackActionCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectCountIgnoreFetchScope(cb);
    }

    /**
     * Select entity by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdBlackAction delegateSelectEntityTx(LdBlackActionCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectEntity(cb);
    }

    /**
     * Select list by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected list. If the select result is zero, it returns empty list. (NotNull)
     */
    public java.util.List<LdBlackAction> delegateSelectListTx(LdBlackActionCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectList(cb);
    }



    /**
     * Insert one entity. (Delegate-Method)
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int delegateInsertTx(LdBlackAction entity) {
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
    public int delegateUpdateTx(LdBlackAction entity) {
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
    public int delegateDeleteTx(LdBlackAction entity) {
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
    public int delegateInsertListTx(java.util.List<LdBlackAction> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().insertList(entityList);
    }

    /**
     * Update several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Updated count.
     */
    public int delegateUpdateListTx(java.util.List<LdBlackAction> entityList) {
        assertListNotNullAndEmpty(entityList);
        return getMyDao().updateList(entityList);
    }

    /**
     * Delete several entities. (Delegate-Method)
     * 
     * @param entityList Entity-list. (NotNull & NotEmpty)
     * @return Deleted count.
     */
    public int delegateDeleteListTx(java.util.List<LdBlackAction> entityList) {
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
    public LdListResultBean<LdBlackAction> selectListTx(LdBlackActionCB cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<LdBlackAction>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }

    /**
     * Select page.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected page as first page. (NotNull)
     */
    public LdPagingResultBean<LdBlackAction> selectPageTx(final LdBlackActionCB cb) {
        assertConditionBeanNotNull(cb);
        final SelectPageCallback<LdBlackAction> pageCallback = new SelectPageCallback<LdBlackAction>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int selectCountIgnoreFetchScope() {
                return delegateSelectCountIgnoreFetchScopeTx(cb);
            }
            public java.util.List<LdBlackAction> selectList() {
                return delegateSelectListTx(cb);
            }
        };
        return new SelectPageInvoker<LdBlackAction>(this).invokeSelectPage(pageCallback);
    }

    /**
     * Select entity by condition-bean with deleted check.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdBlackAction selectEntityWithDeletedCheckTx(LdBlackActionCB cb) {
        assertConditionBeanNotNull(cb);
        dbflute.ldb.exentity.LdBlackAction currentEntity = delegateSelectEntityTx(cb);
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
    public LdListResultBean selectListAfterCheckingCountIgnoreFetchScopeTx(LdBlackActionCB cb, int maxCount) {
        assertConditionBeanNotNull(cb);
        final int selectedCount = delegateSelectCountIgnoreFetchScopeTx(cb);
        assertSelectedCountHasNotExceededMaxCount(selectedCount, maxCount, cb.toString());
        return new ResultBeanBuilder<LdBlackAction>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }


    public LdBlackAction selectForReadOnlyByPKValueWithDeletedCheckTx(java.math.BigDecimal blackActionId) {
        LdBlackAction entity = new LdBlackAction();
        entity.setBlackActionId(blackActionId);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for read only with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-read-only. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdBlackAction selectForReadOnlyByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdBlackActionCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString);
        final dbflute.ldb.exentity.LdBlackAction currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }

    public LdBlackAction selectForUpdateByPKValueWithDeletedCheckTx(java.math.BigDecimal blackActionId) {
        LdBlackAction entity = new LdBlackAction();
        entity.setBlackActionId(blackActionId);
        return selectForReadOnlyByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
    }

    /**
     * Select for update with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdBlackAction selectForUpdateByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdBlackActionCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString).lockForUpdate();
        final dbflute.ldb.exentity.LdBlackAction currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }


    // =====================================================================================
    //                                                                         Load Refferer
    //                                                                         =============
  
    // =====================================================================================
    //                                                                          Basic Update
    //                                                                          ============


    /**
     * Insert or update after select-for-update.
     * 
     * @param entity Entity. This must contain primary-key value at least. (NotNull)
     * @return Updated count.
     */
    public int insertOrUpdateAfterSelectForUpdateTx(LdBlackAction entity) {
        assertEntityNotNull(entity);
        final String mapString = entity.extractPrimaryKeyMapString();
        LdBlackAction currentEntity = null;
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
    public int updateAfterSelectForUpdateTx(LdBlackAction entity) {
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        final LdBlackAction currentEntity = selectForUpdateByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
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
        final LdBlackAction sourceMyEntity = (LdBlackAction)sourceEntity;
        final LdBlackAction destinationMyEntity = (LdBlackAction)destinationEntity;
  
        if (sourceMyEntity.isSetterInvokedBlackActionId()) {
            destinationMyEntity.setBlackActionId(sourceMyEntity.getBlackActionId());
        }
  
        if (sourceMyEntity.isSetterInvokedBlackListId()) {
            destinationMyEntity.setBlackListId(sourceMyEntity.getBlackListId());
        }
  
        if (sourceMyEntity.isSetterInvokedBlackActionCode()) {
            destinationMyEntity.setBlackActionCode(sourceMyEntity.getBlackActionCode());
        }
  
        if (sourceMyEntity.isSetterInvokedBlackLevel()) {
            destinationMyEntity.setBlackLevel(sourceMyEntity.getBlackLevel());
        }
  
        if (sourceMyEntity.isSetterInvokedEvidencePhotograph()) {
            destinationMyEntity.setEvidencePhotograph(sourceMyEntity.getEvidencePhotograph());
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

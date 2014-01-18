
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
 * The behavior of GARBAGE.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsGarbageBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorReadable {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Dao instance. */
    protected LdGarbageDao _dao;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBsGarbageBhv() {
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
        return "GARBAGE";
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
        return LdGarbageDbm.getInstance();
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    /**
     * Get my dao.
     * 
     * @return My dao.
     */
    public LdGarbageDao getMyDao() {
        return _dao;
    }

    /**
     * Set my dao.
     * 
     * @param dao My dao. (NotNull)
     */
    public void setMyDao(LdGarbageDao dao) {
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


    // =====================================================================================
    //                                                                          New Instance
    //                                                                          ============

    /**
     * New my entity.
     * 
     * @return My entity. (NotNull)
     */
    public LdGarbage newMyEntity() {
        return new LdGarbage();
    }

    /**
     * New my condition-bean.
     * 
     * @return My condition-bean. (NotNull)
     */
    public LdGarbageCB newMyConditionBean() {
        return new LdGarbageCB();
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
    public java.util.List<LdGarbage> delegateGetListAllTx() {
        return getMyDao().getListAll();
    }

    /**
     * Select count by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int delegateSelectCountIgnoreFetchScopeTx(LdGarbageCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectCountIgnoreFetchScope(cb);
    }

    /**
     * Select entity by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdGarbage delegateSelectEntityTx(LdGarbageCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectEntity(cb);
    }

    /**
     * Select list by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected list. If the select result is zero, it returns empty list. (NotNull)
     */
    public java.util.List<LdGarbage> delegateSelectListTx(LdGarbageCB cb) {
        assertConditionBeanNotNull(cb);
        return getMyDao().selectList(cb);
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
    public LdListResultBean<LdGarbage> selectListTx(LdGarbageCB cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<LdGarbage>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }

    /**
     * Select page.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected page as first page. (NotNull)
     */
    public LdPagingResultBean<LdGarbage> selectPageTx(final LdGarbageCB cb) {
        assertConditionBeanNotNull(cb);
        final SelectPageCallback<LdGarbage> pageCallback = new SelectPageCallback<LdGarbage>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int selectCountIgnoreFetchScope() {
                return delegateSelectCountIgnoreFetchScopeTx(cb);
            }
            public java.util.List<LdGarbage> selectList() {
                return delegateSelectListTx(cb);
            }
        };
        return new SelectPageInvoker<LdGarbage>(this).invokeSelectPage(pageCallback);
    }

    /**
     * Select entity by condition-bean with deleted check.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdGarbage selectEntityWithDeletedCheckTx(LdGarbageCB cb) {
        assertConditionBeanNotNull(cb);
        dbflute.ldb.exentity.LdGarbage currentEntity = delegateSelectEntityTx(cb);
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
    public LdListResultBean selectListAfterCheckingCountIgnoreFetchScopeTx(LdGarbageCB cb, int maxCount) {
        assertConditionBeanNotNull(cb);
        final int selectedCount = delegateSelectCountIgnoreFetchScopeTx(cb);
        assertSelectedCountHasNotExceededMaxCount(selectedCount, maxCount, cb.toString());
        return new ResultBeanBuilder<LdGarbage>(this).buildListResultBean(cb, delegateSelectListTx(cb));
    }


    /**
     * Select for read only with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-read-only. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdGarbage selectForReadOnlyByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdGarbageCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString);
        final dbflute.ldb.exentity.LdGarbage currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }

    /**
     * Select for update with deleted check.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return Entity that is selected from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdGarbage selectForUpdateByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertStringNotNullAndNotTrimmedEmpty("primaryKeyMapString", primaryKeyMapString);
        final LdGarbageCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString).lockForUpdate();
        final dbflute.ldb.exentity.LdGarbage currentEntity = delegateSelectEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }


    // =====================================================================================
    //                                                                          Basic Update
    //                                                                          ============


}

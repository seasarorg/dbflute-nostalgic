
package dbflute.ldb.allcommon.bhv;

import dbflute.ldb.allcommon.LdDaoSelector;
import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdPagingBean;
import dbflute.ldb.allcommon.cbean.LdPagingResultBean;


/**
 * The abstract class of behavior-readable.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBehaviorReadable implements LdBehaviorReadable {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Dao-selector instance. */
    protected LdDaoSelector _daoSelector;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdAbstractBehaviorReadable() {
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Dao-selector.
     */
    public LdDaoSelector getDaoSelector() {
        return _daoSelector;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param value Dao-selector.
     */
    public void setDaoSelector(LdDaoSelector value) {
        _daoSelector = value;
    }

    // =====================================================================================
    //                                                                       Delegate Method
    //                                                                       ===============
    /**
     * This method implements the method that is declared at super.
     * 
     * @return All count.
     */
    public int delegateReadCountAllTx() {
        final Object target = getDaoReadable();
        final String name = "getCountAll";
        final java.lang.reflect.Method mtd = getMethod(target.getClass(), name, new Class[]{});
        final Object result = invoke(mtd, target, new Object[]{});
        return ((Integer)result).intValue();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return All list. (NotNull)
     */
    public java.util.List<LdEntity> delegateReadListAllTx() {
        final Object target = getDaoReadable();
        final String name = "getListAll";
        final java.lang.reflect.Method mtd = getMethod(target.getClass(), name, new Class[]{});
        final Object result = invoke(mtd, target, new Object[]{});
        return (java.util.List<LdEntity>)result;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param cb Condition-bean that the type is condition-bean-interface. (NotNull)
     * @return Read count. (NotNull)
     */
    public int delegateReadCountIgnoreFetchScopeTx(LdConditionBean cb) {
        assertConditionBeanNotNull(cb);
        final Object target = getDaoReadable();
        final String name = "selectCountIgnoreFetchScope";
        final Class[] types = new Class[]{cb.getClass()};
        final java.lang.reflect.Method mtd = getMethod(target.getClass(), name, types);
        final Object result = invoke(mtd, target, new Object[]{cb});
        return ((Integer)result).intValue();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param cb Condition-bean that the type is condition-bean-interface. (NotNull)
     * @return Read entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdEntity delegateReadEntityTx(LdConditionBean cb) {
        assertConditionBeanNotNull(cb);
        final Object target = getDaoReadable();
        final String name = "selectEntity";
        final Class[] types = new Class[]{cb.getClass()};
        final java.lang.reflect.Method mtd = getMethod(target.getClass(), name, types);
        final Object result = invoke(mtd, target, new Object[]{cb});
        return (LdEntity)result;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param cb Condition-bean that the type is condition-bean-interface. (NotNull)
     * @return Read list. If the select result is zero, it returns empty list. (NotNull)
     */
    public java.util.List<LdEntity> delegateReadListTx(LdConditionBean cb) {
        assertConditionBeanNotNull(cb);
        final Object target = getDaoReadable();
        final String name = "selectList";
        final Class[] types = new Class[]{cb.getClass()};
        final java.lang.reflect.Method mtd = getMethod(target.getClass(), name, types);
        final Object result = invoke(mtd, target, new Object[]{cb});
        return (java.util.List<LdEntity>)result;
    }

    private java.lang.reflect.Method getMethod(Class clazz, String methodName, Class[] argTypes) {
        try {
            return clazz.getMethod(methodName, argTypes);
        } catch (NoSuchMethodException ex) {
            String msg = "class=" + clazz + " method=" + methodName + "-" + java.util.Arrays.asList(argTypes);
            throw new RuntimeException(msg, ex);
        }
    }

    private Object invoke(java.lang.reflect.Method method, Object target, Object[] args) {
        try {
            return method.invoke(target, args);
        } catch (java.lang.reflect.InvocationTargetException ex) {
            Throwable t = ex.getCause();
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            }
            if (t instanceof Error) {
                throw (Error) t;
            }
            String msg = "target=" + target + " method=" + method + "-" + java.util.Arrays.asList(args);
            throw new RuntimeException(msg, ex);
        } catch (IllegalAccessException ex) {
            String msg = "target=" + target + " method=" + method + "-" + java.util.Arrays.asList(args);
            throw new RuntimeException(msg, ex);
        }
    }

    // =====================================================================================
    //                                                                          Basic Select
    //                                                                          ============
    /**
     * This method implements the method that is declared at super.
     * 
     * @param cb Condition-bean.
     * @return List-result-bean. If the select result is zero, it returns empty list. (NotNull)
     */
    public LdListResultBean<LdEntity> readListTx(LdConditionBean cb) {
        assertConditionBeanNotNull(cb);
        return new ResultBeanBuilder<LdEntity>(this).buildListResultBean(cb, delegateReadListTx(cb));
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Read page. (NotNull)
     */
    public LdPagingResultBean<LdEntity> readPageTx(final LdConditionBean cb) {
        assertConditionBeanNotNull(cb);
        final SelectPageCallback<LdEntity> pageCallback = new SelectPageCallback<LdEntity>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int selectCountIgnoreFetchScope() {
                return delegateReadCountIgnoreFetchScopeTx(cb);
            }
            public java.util.List<LdEntity> selectList() {
                return delegateReadListTx(cb);
            }
        };
        return new SelectPageInvoker<LdEntity>(this).invokeSelectPage(pageCallback);
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Entity that is read from database. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdEntity readEntityWithDeletedCheckTx(LdConditionBean cb) {
        assertConditionBeanNotNull(cb);
        LdEntity currentEntity = delegateReadEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, cb.toString());
        return currentEntity;
    }

    /**
     * Assert that record has not been deleted.
     * 
     * @param entity Selected entity.
     * @param searchKey4log Search-key for Logging.
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    protected void assertRecordHasNotBeenDeleted(dbflute.ldb.allcommon.LdEntity entity, Object searchKey4log) {
        if (entity == null) {
            String msg = "The record has already been deleted by other thread: searchKey=" + searchKey4log;
            throw new dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException(msg);
        }
    }

    /**
     * Assert that record has not been deleted.
     * 
     * @param ls Selected list.
     * @param searchKey4log Search-key for Logging.
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    protected void assertRecordHasNotBeenDeleted(java.util.List ls, Object searchKey4log) {
        if (ls == null || ls.isEmpty()) {
            String msg = "The record has already been deleted by other thread: searchKey=" + searchKey4log;
            throw new dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException(msg);
        }
    }

    /**
     * Assert that record has been selected as one.
     * 
     * @param ls Selected list.
     * @param searchKey4log Search-key for Logging.
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasOverlappedException
     */
    protected void assertRecordHasBeenSelectedAsOne(java.util.List ls, Object searchKey4log) {
        if (ls == null || ls.isEmpty()) {
            String msg = "The record has already been deleted by other thread: searchKey=" + searchKey4log;
            throw new dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException(msg);
        }
        if (ls.size() != 1) {
            String msg = "This selected contents should be only one: searchKey=" + searchKey4log;
            msg = msg + " resultCount=" + ls.size();
            throw new dbflute.ldb.allcommon.exception.LdRecordHasOverlappedException(msg);
        }
    }

    // =====================================================================================
    //                                                                        Various Select
    //                                                                        ==============

    /**
     * This method implements the method that is declared at super.
     * 
     * @param cb Condition-bean.
     * @param maxCount Max count.
     * @return List-result-bean. If the select result is zero, it returns empty list. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdSelectedCountExceedMaxCountException
     */
    public LdListResultBean readListAfterCheckingCountIgnoreFetchScopeTx(LdConditionBean cb, int maxCount) {
        assertConditionBeanNotNull(cb);
        final int selectedCount = delegateReadCountIgnoreFetchScopeTx(cb);
        assertSelectedCountHasNotExceededMaxCount(selectedCount, maxCount, cb.toString());
        return new ResultBeanBuilder<LdEntity>(this).buildListResultBean(cb, delegateReadListTx(cb));
    }

    /**
     * Assert that selected count has not exceeded max count.
     * 
     * @param selectedCount Selected count.
     * @param maxCount Max count.
     * @param clauseString Clause string for exception message.
     * @exception dbflute.ldb.allcommon.exception.LdSelectedCountExceedMaxCountException
     */
    protected void assertSelectedCountHasNotExceededMaxCount(int selectedCount, int maxCount, String clauseString) {
        if (selectedCount > maxCount) {
            String msg = "Selected count[" + selectedCount + "] has exceeded max count[" + maxCount + "]: clauseString=" + clauseString;
            throw new dbflute.ldb.allcommon.exception.LdSelectedCountExceedMaxCountException(msg, selectedCount, maxCount);
        }
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param primaryKeyMapString Primary-Key map-string. (NotNull)
     * @return Entity that is read from database by select-for-read-only. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdEntity readForReadOnlyByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertObjectNotNull("primaryKeyMapString", primaryKeyMapString);
        final LdConditionBean cb = getDBMeta().newConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString);
        final LdEntity currentEntity = delegateReadEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param primaryKeyMapString Primary-Key map-string. (NotNull)
     * @return Entity that is read from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdEntity readForUpdateByPKMapStringWithDeletedCheckTx(String primaryKeyMapString) {
        assertObjectNotNull("primaryKeyMapString", primaryKeyMapString);
        final LdConditionBean cb = getDBMeta().newConditionBean();
        cb.acceptPrimaryKeyMapString(primaryKeyMapString).lockForUpdate();
        final LdEntity currentEntity = delegateReadEntityTx(cb);
        assertRecordHasNotBeenDeleted(currentEntity, primaryKeyMapString);
        return currentEntity;
    }

    // =====================================================================================
    //                                                                         Helper Method
    //                                                                         =============
    // ----------------------------------------------------------------
    //                                                    Assert Object
    //                                                    -------------
    /**
     * Assert that the object is not null.
     * 
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     * @exception IllegalArgumentException
     */
    protected void assertObjectNotNull(String variableName, Object value) {
        if (variableName == null) {
            String msg = "The value should not be null: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            String msg = "The value should not be null: variableName=" + variableName;
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * Assert that the entity is not null.
     * 
     * @param entity Entity. (NotNull)
     */
    protected void assertEntityNotNull(LdEntity entity) {
        assertObjectNotNull("entity", entity);
    }

    /**
     * Assert that the condition-bean is not null.
     * 
     * @param cb Condition-bean. (NotNull)
     */
    protected void assertConditionBeanNotNull(dbflute.ldb.allcommon.cbean.LdConditionBean cb) {
        assertObjectNotNull("cb", cb);
    }

    /**
     * Assert that the entity has primary-key value.
     * 
     * @param entity Entity. (NotNull)
     */
    protected void assertEntityNotNullAndHasPrimaryKeyValue(LdEntity entity) {
        assertEntityNotNull(entity);
        if (!entity.hasPrimaryKeyValue()) {
            String msg = "The entity must should primary-key: entity=" + entity;
            throw new IllegalArgumentException(msg + entity);
        }
    }

    // ----------------------------------------------------------------
    //                                                    Assert String
    //                                                    -------------
    /**
     * Assert that the entity is not null and not trimmed empty.
     * 
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     */
    protected void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        assertObjectNotNull("variableName", variableName);
        assertObjectNotNull("value", value);
        if (value.trim().length() ==0) {
            String msg = "The value should not be empty: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
    }

    // ----------------------------------------------------------------
    //                                                      Assert List
    //                                                      -----------
    /**
     * Assert that the list is empty.
     * 
     * @param ls List. (NotNull)
     */
    protected void assertListNotNullAndEmpty(java.util.List ls) {
        assertObjectNotNull("ls", ls);
        if (!ls.isEmpty()) {
            String msg = "The list should be empty: ls=" + ls.toString();
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * Assert that the list is not empty.
     * 
     * @param ls List. (NotNull)
     */
    protected void assertListNotNullAndNotEmpty(java.util.List ls) {
        assertObjectNotNull("ls", ls);
        if (ls.isEmpty()) {
            String msg = "The list should not be empty: ls=" + ls.toString();
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * Assert that the list having only one.
     * 
     * @param ls List. (NotNull)
     */
    protected void assertListNotNullAndHasOnlyOne(java.util.List ls) {
        assertObjectNotNull("ls", ls);
        if (ls.size() != 1) {
            String msg = "The list should contain only one object: ls=" + ls.toString();
            throw new IllegalArgumentException(msg);
        }
    }
}

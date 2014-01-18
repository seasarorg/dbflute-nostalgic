package dbflute.ldb.allcommon.bhv;

import dbflute.ldb.allcommon.LdDaoSelector;
import dbflute.ldb.allcommon.LdDaoReadable;
import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdOrderByBean;
import dbflute.ldb.allcommon.cbean.LdPagingBean;
import dbflute.ldb.allcommon.cbean.LdPagingResultBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;

/**
 * The interface of behavior-readable.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface LdBehaviorReadable {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** Map-string map-mark. */
    public static final String MAP_STRING_MAP_MARK = "map:";

    /** Map-string list-mark. */
    public static final String MAP_STRING_LIST_MARK = "list:";

    /** Map-string start-brace. */
    public static final String MAP_STRING_START_BRACE = "@{";

    /** Map-string end-brace. */
    public static final String MAP_STRING_END_BRACE = "@}";

    /** Map-string delimiter. */
    public static final String MAP_STRING_DELIMITER = "@;";

    /** Map-string equal. */
    public static final String MAP_STRING_EQUAL = "@=";

    // =====================================================================================
    //                                                                            Table name
    //                                                                            ==========
    /**
     * Get table db-name.
     * 
     * @return Table db-name. (NotNull)
     */
    public String getTableDbName();

    // =====================================================================================
    //                                                                                DBMeta
    //                                                                                ======
    /**
     * Get dbmeta.
     * 
     * @return DBMeta. (NotNull)
     */
    public LdDBMeta getDBMeta();

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    /**
     * Get dao-readable.
     * 
     * @return Dao-readable. (NotNull)
     */
    public LdDaoReadable getDaoReadable();

    /**
     * Get dao-selector.
     * 
     * @return Dao-selector.
     */
    public LdDaoSelector getDaoSelector();

    /**
     * Set dao-selector.
     * 
     * @param value Dao-selector.
     */
    public void setDaoSelector(LdDaoSelector value);

    // =====================================================================================
    //                                                                       Delegate Method
    //                                                                       ===============
    /**
     * Read count as all. (Delegate-Method)
     * 
     * @return All count. (NotNull)
     */
    public int delegateReadCountAllTx() ;

    /**
     * Read list as all. (Delegate-Method)
     * 
     * @return All list. (NotNull)
     */
    public java.util.List<LdEntity> delegateReadListAllTx();

    /**
     * Read count by condition-bean. (Delegate-Method)
     * Ignore fetchFirst() and fetchScope() and fetchPage(). But the fetch status of the condition-bean remains as it is.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Read count. (NotNull)
     */
    public int delegateReadCountIgnoreFetchScopeTx(LdConditionBean cb);

    /**
     * Read entity by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Read entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdEntity delegateReadEntityTx(LdConditionBean cb);

    /**
     * Read list by condition-bean. (Delegate-Method)
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Read list. If the select result is zero, it returns empty list. (NotNull)
     */
    public java.util.List<LdEntity> delegateReadListTx(LdConditionBean cb);

    // =====================================================================================
    //                                                                          Basic Select
    //                                                                          ============
    /**
     * Read list.
     * 
     * @param cb Condition-bean.
     * @return List-result-bean. If the select result is zero, it returns empty list. (NotNull)
     */
    public LdListResultBean readListTx(LdConditionBean cb);

    /**
     * Read page.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Read page. (NotNull)
     */
    public LdPagingResultBean readPageTx(LdConditionBean cb);

    /**
     * This method implements the method that is declared at super.
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Entity that is selected from database. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdEntity readEntityWithDeletedCheckTx(LdConditionBean cb);

    // =====================================================================================
    //                                                                        Various Select
    //                                                                        ==============
    /**
     * Read list after checking count(ignore fetch scope).
     * 
     * @param cb Condition-bean.
     * @param maxCount Max count.
     * @return List-result-bean. If the select result is zero, it returns empty list. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdSelectedCountExceedMaxCountException
     */
    public LdListResultBean readListAfterCheckingCountIgnoreFetchScopeTx(LdConditionBean cb, int maxCount);

    /**
     * Read for read only by primary-key map-string with deleted check.
     * 
     * @param primaryKeyMapString Primary-Key map-string. (NotNull)
     * @return Entity that is read from database by select-for-read-only. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdEntity readForReadOnlyByPKMapStringWithDeletedCheckTx(String primaryKeyMapString);

    /**
     * Read for update by primary-key map-string with deleted check.
     * 
     * @param primaryKeyMapString Primary-Key map-string. (NotNull)
     * @return Entity that is read from database by select-for-update. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public LdEntity readForUpdateByPKMapStringWithDeletedCheckTx(String primaryKeyMapString);

    /**
     * The interface of select-page callback.
     * 
     * @param <T> The generic template for 'selectedList'.
     */
    public static interface SelectPageCallback<T> {
        public LdPagingBean getPagingBean();
        public int selectCountIgnoreFetchScope();
        public java.util.List<T> selectList();
    }

    /**
     * The object of result-bean builder.
     * 
     * @param <T> The generic template for 'resultBean'.
     */
    public static class ResultBeanBuilder<T> {
        protected LdBehaviorReadable _bhv;
        public ResultBeanBuilder(LdBehaviorReadable bhv) {
            _bhv = bhv;
        }
        /**
         * Build list-reuslt-bean.
         * 
         * @param ob Order-by-bean. (NotNull)
         * @param selectedList Selected list. (NotNull)
         * @return List-result-bean. (NotNull)
         */
        public LdListResultBean<T> buildListResultBean(LdOrderByBean ob, java.util.List<T> selectedList) {
            LdListResultBean<T> rb = new LdListResultBean<T>();
            rb.setTableDbName(_bhv.getTableDbName());
            rb.setAllRecordCount(selectedList.size());
            rb.setSelectedList(selectedList);
            rb.setOrderByClause(ob.getSqlComponentOfOrderByClause());
            return rb;
        }
        /**
         * Build paging-reuslt-bean.
         * 
         * @param pb Paging-bean. (NotNull)
         * @param allRecordCount All-record-count.
         * @param selectedList Selected list. (NotNull)
         * @return Paging-result-bean. (NotNull)
         */
        public LdPagingResultBean<T> buildPagingResultBean(LdPagingBean pb, int allRecordCount, java.util.List<T> selectedList) {
            LdPagingResultBean<T> rb = new LdPagingResultBean<T>();
            rb.setTableDbName(_bhv.getTableDbName());
            rb.setAllRecordCount(allRecordCount);
            rb.setSelectedList(selectedList);
            rb.setPageSize(pb.getFetchSize());
            rb.setCurrentPageNumber(pb.getFetchPageNumber());
            rb.setOrderByClause(pb.getSqlComponentOfOrderByClause());
            return rb;
        }
    }

    /**
     * The object of result-bean builder.
     * 
     * @param <T> The generic template for 'resultBean'.
     */
    public static class SelectPageInvoker<T> {
        protected LdBehaviorReadable _bhv;
        public SelectPageInvoker(LdBehaviorReadable bhv) {
            _bhv = bhv;
        }
        /**
         * Invoke select-page by callback.
         * 
         * @param callback Callback. (NotNull)
         * @return Paging-result-bean. (NotNull)
         */
        public LdPagingResultBean<T> invokeSelectPage(SelectPageCallback<T> callback) {
            assertObjectNotNull("callback", callback);
            final int allRecordCount = callback.selectCountIgnoreFetchScope();
            final java.util.List<T> selectedList = callback.selectList();
            final LdPagingResultBean<T> rb = new ResultBeanBuilder<T>(_bhv).buildPagingResultBean(callback.getPagingBean(), allRecordCount, selectedList);
            if (isNecessaryToReadPageAgain(rb)) {
                callback.getPagingBean().fetchPage(rb.getAllPageCount());
                int reAllRecordCount = callback.selectCountIgnoreFetchScope();
                java.util.List<T> reSelectedList = callback.selectList();
                return new ResultBeanBuilder<T>(_bhv).buildPagingResultBean(callback.getPagingBean(), reAllRecordCount, reSelectedList);
            } else {
                return rb;
            }
        }
        /**
         * Is it necessary to read page again?
         * 
         * @param rb Paging-result-bean. (NotNull)
         * @return Determination.
         */
        public boolean isNecessaryToReadPageAgain(LdPagingResultBean<T> rb) {
            return rb.getAllRecordCount() > 0 && rb.getSelectedList().isEmpty();
        }
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
    }
}

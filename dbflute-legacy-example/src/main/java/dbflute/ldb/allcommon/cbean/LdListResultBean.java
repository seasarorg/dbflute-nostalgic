package dbflute.ldb.allcommon.cbean;


import dbflute.ldb.allcommon.cbean.sqlclause.LdOrderByClause;

/**
 * The list-result-bean of LdListResultBean.
 * 
 * @param <T> The generic template for 'selectedList'.
 * @author DBFlute(AutoGenerator)
 */
public class LdListResultBean<T> implements java.io.Serializable {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** The value of table db-name. */
    protected String _tableDbName;

    /** The value of all record count. */
    protected int _allRecordCount;

    /** Selected list. */
    protected java.util.List<T> _selectedList;

    /** Order-by clause. */
    protected LdOrderByClause _orderByClause;

    /** Has the setter of selected list invoked? */
    protected boolean _isSetterInvokedSelectedList;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdListResultBean() {
    }

    // =====================================================================================
    //                                                                         Getter Setter
    //                                                                         =============
    /**
     * Get the value of tableDbName.
     * 
     * @return The value of tableDbName.
     */
    public String getTableDbName() {
        return _tableDbName;
    }

    /**
     * Set the value of tableDbName.
     * 
     * @param value The value of tableDbName.
     */
    public void setTableDbName(String value) {
        _tableDbName = value;
    }

    /**
     * Get the value of allRecordCount.
     * 
     * @return The value of allRecordCount.
     */
    public int getAllRecordCount() {
        return _allRecordCount;
    }

    /**
     * Set the value of allRecordCount.
     * 
     * @param value The value of allRecordCount.
     */
    public void setAllRecordCount(int value) {
        _allRecordCount = value;
    }

    /**
     * Get the value of selectedList.
     * 
     * @return Selected list.
     */
    public java.util.List<T> getSelectedList() {
        return _selectedList;
    }

    /**
     * Set the value of selectedList.
     * 
     * @param value Selected list.
     */
    public void setSelectedList(java.util.List<T> value) {
        _isSetterInvokedSelectedList = true; _selectedList = value;
    }

    /**
     * Get the value of orderByClause.
     * 
     * @return The value of orderByClause.
     */
    public LdOrderByClause getOrderByClause() {
        return _orderByClause;
    }

    /**
     * Set the value of orderByClause.
     * 
     * @param value The value of orderByClause.
     */
    public void setOrderByClause(LdOrderByClause value) {
        _orderByClause = value;
    }

    // =====================================================================================
    //                                                                         Determination
    //                                                                         =============
    /**
     * Has this result selected?
     * 
     * @return Determination.
     */
    public boolean isSelectedResult() {
        return _isSetterInvokedSelectedList;
    }

    // =====================================================================================
    //                                                                 Basic-Override Method
    //                                                                 =====================
    /**
     * This method overrides the method that is declared at super.
     * 
     * @return View-string of all-columns value.
     */
    public String toString() {
        final StringBuffer sb = new StringBuffer();

        sb.append(" tableDbName=").append(_tableDbName);
        sb.append(" allRecordCount=").append(_tableDbName);
        sb.append(" selectedList.size()=").append(_selectedList.size());
        sb.append(" orderByClause=").append(_orderByClause);

        return sb.toString();
    }
}

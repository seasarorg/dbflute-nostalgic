/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs.customize;



/**
 * The simple DTO of OutsideSqlDynamicAnalysisBook that the type is null.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     BOOK_ID, BOOK_NAME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class BsOutsideSqlDynamicAnalysisBookDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of bookId. {INTEGER(10,0)} */
    protected Integer _bookId;

    /** The value of bookName. {VARCHAR(80,0)} */
    protected String _bookName;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsOutsideSqlDynamicAnalysisBookDto() {
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * The override.
     * If the all-column value of the other is same as this one, returns true.
     * @param other Other entity. (Nullable)
     * @return Comparing result. If other is null, returns false.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsOutsideSqlDynamicAnalysisBookDto)) { return false; }
        final BsOutsideSqlDynamicAnalysisBookDto otherEntity = (BsOutsideSqlDynamicAnalysisBookDto)other;
        if (!helpComparingValue(getBookId(), otherEntity.getBookId())) { return false; }
        if (!helpComparingValue(getBookName(), otherEntity.getBookName())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * The override.
     * Calculates hash-code from all-columns.
     * @return Hash-code from all-columns.
     */
    public int hashCode() {
        int result = 0;
        if (this.getBookId() != null) { result = result + this.getBookId().hashCode(); }
        if (this.getBookName() != null) { result = result + this.getBookName().hashCode(); }
        return result;
    }

    /**
     * The override.
     * @return Column-value map-string. (NotNull)
     */
    public String toString() {
        final String delimiter = ",";
        final StringBuilder sb = new StringBuilder();

        sb.append(delimiter).append(getBookId());
        sb.append(delimiter).append(getBookName());

        sb.delete(0, delimiter.length());
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get the value of bookId. <br />
     * {INTEGER(10,0)}
     * @return The value of bookId. (Nullable)
     */
    public Integer getBookId() {
        return _bookId;
    }

    /**
     * Set the value of bookId. <br />
     * {INTEGER(10,0)}
     * @param bookId The value of bookId. (Nullable)
     */
    public void setBookId(Integer bookId) {
        this._bookId = bookId;
    }

    /**
     * Get the value of bookName. <br />
     * {VARCHAR(80,0)}
     * @return The value of bookName. (Nullable)
     */
    public String getBookName() {
        return _bookName;
    }

    /**
     * Set the value of bookName. <br />
     * {VARCHAR(80,0)}
     * @param bookName The value of bookName. (Nullable)
     */
    public void setBookName(String bookName) {
        this._bookName = bookName;
    }

}

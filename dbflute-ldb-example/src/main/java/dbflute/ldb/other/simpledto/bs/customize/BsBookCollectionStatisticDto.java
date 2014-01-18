/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs.customize;



/**
 * The simple DTO of BookCollectionStatistic that the type is null.
 * <pre>
 * [primary-key]
 *     BOOK_ID
 * 
 * [column]
 *     BOOK_ID, BOOK_NAME, COLLECTION_COUNT, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
public abstract class BsBookCollectionStatisticDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of bookId. {PK : INTEGER(10,0)} */
    protected Integer _bookId;

    /** The value of bookName. {VARCHAR(80,0)} */
    protected String _bookName;

    /** The value of collectionCount. {INTEGER(10,0)} */
    protected Integer _collectionCount;

    /** The value of RUser. {VARCHAR(100,0)} */
    protected String _rUser;

    /** The value of RModule. {VARCHAR(100,0)} */
    protected String _rModule;

    /** The value of RTimestamp. {TIMESTAMP(26,6)} */
    protected java.sql.Timestamp _rTimestamp;

    /** The value of UUser. {VARCHAR(100,0)} */
    protected String _uUser;

    /** The value of UModule. {VARCHAR(100,0)} */
    protected String _uModule;

    /** The value of UTimestamp. {TIMESTAMP(26,6)} */
    protected java.sql.Timestamp _uTimestamp;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBookCollectionStatisticDto() {
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
     * If the primary-key of the other is same as this one, returns true.
     * @param other Other entity.
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBookCollectionStatisticDto)) { return false; }
        final BsBookCollectionStatisticDto otherEntity = (BsBookCollectionStatisticDto)other;
        if (!helpComparingValue(getBookId(), otherEntity.getBookId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * The override.
     * Calculates hash-code from primary-key.
     * @return Hash-code from primary-keys.
     */
    public int hashCode() {
        int result = 0;
        if (this.getBookId() != null) { result = result + getBookId().hashCode(); }
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
        sb.append(delimiter).append(getCollectionCount());
        sb.append(delimiter).append(getRUser());
        sb.append(delimiter).append(getRModule());
        sb.append(delimiter).append(getRTimestamp());
        sb.append(delimiter).append(getUUser());
        sb.append(delimiter).append(getUModule());
        sb.append(delimiter).append(getUTimestamp());

        sb.delete(0, delimiter.length());
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get the value of bookId. <br />
     * {PK : INTEGER(10,0)}
     * @return The value of bookId. (Nullable)
     */
    public Integer getBookId() {
        return _bookId;
    }

    /**
     * Set the value of bookId. <br />
     * {PK : INTEGER(10,0)}
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

    /**
     * Get the value of collectionCount. <br />
     * {INTEGER(10,0)}
     * @return The value of collectionCount. (Nullable)
     */
    public Integer getCollectionCount() {
        return _collectionCount;
    }

    /**
     * Set the value of collectionCount. <br />
     * {INTEGER(10,0)}
     * @param collectionCount The value of collectionCount. (Nullable)
     */
    public void setCollectionCount(Integer collectionCount) {
        this._collectionCount = collectionCount;
    }

    /**
     * Get the value of rUser. <br />
     * {VARCHAR(100,0)}
     * @return The value of rUser. (Nullable)
     */
    public String getRUser() {
        return _rUser;
    }

    /**
     * Set the value of rUser. <br />
     * {VARCHAR(100,0)}
     * @param rUser The value of rUser. (Nullable)
     */
    public void setRUser(String rUser) {
        this._rUser = rUser;
    }

    /**
     * Get the value of rModule. <br />
     * {VARCHAR(100,0)}
     * @return The value of rModule. (Nullable)
     */
    public String getRModule() {
        return _rModule;
    }

    /**
     * Set the value of rModule. <br />
     * {VARCHAR(100,0)}
     * @param rModule The value of rModule. (Nullable)
     */
    public void setRModule(String rModule) {
        this._rModule = rModule;
    }

    /**
     * Get the value of rTimestamp. <br />
     * {TIMESTAMP(26,6)}
     * @return The value of rTimestamp. (Nullable)
     */
    public java.sql.Timestamp getRTimestamp() {
        return _rTimestamp;
    }

    /**
     * Set the value of rTimestamp. <br />
     * {TIMESTAMP(26,6)}
     * @param rTimestamp The value of rTimestamp. (Nullable)
     */
    public void setRTimestamp(java.sql.Timestamp rTimestamp) {
        this._rTimestamp = rTimestamp;
    }

    /**
     * Get the value of uUser. <br />
     * {VARCHAR(100,0)}
     * @return The value of uUser. (Nullable)
     */
    public String getUUser() {
        return _uUser;
    }

    /**
     * Set the value of uUser. <br />
     * {VARCHAR(100,0)}
     * @param uUser The value of uUser. (Nullable)
     */
    public void setUUser(String uUser) {
        this._uUser = uUser;
    }

    /**
     * Get the value of uModule. <br />
     * {VARCHAR(100,0)}
     * @return The value of uModule. (Nullable)
     */
    public String getUModule() {
        return _uModule;
    }

    /**
     * Set the value of uModule. <br />
     * {VARCHAR(100,0)}
     * @param uModule The value of uModule. (Nullable)
     */
    public void setUModule(String uModule) {
        this._uModule = uModule;
    }

    /**
     * Get the value of uTimestamp. <br />
     * {TIMESTAMP(26,6)}
     * @return The value of uTimestamp. (Nullable)
     */
    public java.sql.Timestamp getUTimestamp() {
        return _uTimestamp;
    }

    /**
     * Set the value of uTimestamp. <br />
     * {TIMESTAMP(26,6)}
     * @param uTimestamp The value of uTimestamp. (Nullable)
     */
    public void setUTimestamp(java.sql.Timestamp uTimestamp) {
        this._uTimestamp = uTimestamp;
    }

}

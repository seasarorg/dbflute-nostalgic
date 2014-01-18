/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs.customize;



/**
 * The simple DTO of BookContainsDoubleByte that the type is null.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     BOOK_ID, BOOK_NAME_WITH_SPACE, COLLECTION_COUNT, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
public abstract class BsBookContainsDoubleByteDto implements java.io.Serializable {

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

    /** The value of bookNameWithSpace. {VARCHAR(81,0)} */
    protected String _bookNameWithSpace;

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
    public BsBookContainsDoubleByteDto() {
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
     * {@inheritDoc}
     * If the all-column value of the other is same as this one, returns true.
     * @param other Other entity. (Nullable)
     * @return Comparing result. If other is null, returns false.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBookContainsDoubleByteDto)) { return false; }
        final BsBookContainsDoubleByteDto otherEntity = (BsBookContainsDoubleByteDto)other;
        if (!helpComparingValue(getBookId(), otherEntity.getBookId())) { return false; }
        if (!helpComparingValue(getBookNameWithSpace(), otherEntity.getBookNameWithSpace())) { return false; }
        if (!helpComparingValue(getCollectionCount(), otherEntity.getCollectionCount())) { return false; }
        if (!helpComparingValue(getRUser(), otherEntity.getRUser())) { return false; }
        if (!helpComparingValue(getRModule(), otherEntity.getRModule())) { return false; }
        if (!helpComparingValue(getRTimestamp(), otherEntity.getRTimestamp())) { return false; }
        if (!helpComparingValue(getUUser(), otherEntity.getUUser())) { return false; }
        if (!helpComparingValue(getUModule(), otherEntity.getUModule())) { return false; }
        if (!helpComparingValue(getUTimestamp(), otherEntity.getUTimestamp())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * {@inheritDoc}
     * Calculates hash-code from all-columns.
     * @return Hash-code from all-columns.
     */
    public int hashCode() {
        int result = 0;
        if (this.getBookId() != null) { result = result + this.getBookId().hashCode(); }
        if (this.getBookNameWithSpace() != null) { result = result + this.getBookNameWithSpace().hashCode(); }
        if (this.getCollectionCount() != null) { result = result + this.getCollectionCount().hashCode(); }
        if (this.getRUser() != null) { result = result + this.getRUser().hashCode(); }
        if (this.getRModule() != null) { result = result + this.getRModule().hashCode(); }
        if (this.getRTimestamp() != null) { result = result + this.getRTimestamp().hashCode(); }
        if (this.getUUser() != null) { result = result + this.getUUser().hashCode(); }
        if (this.getUModule() != null) { result = result + this.getUModule().hashCode(); }
        if (this.getUTimestamp() != null) { result = result + this.getUTimestamp().hashCode(); }
        return result;
    }

    /**
     * {@inheritDoc}
     * @return Column-value map-string. (NotNull)
     */
    public String toString() {
        final String delimiter = ",";
        final StringBuilder sb = new StringBuilder();

        sb.append(delimiter).append(getBookId());
        sb.append(delimiter).append(getBookNameWithSpace());
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
     * Get the value of bookNameWithSpace. <br />
     * {VARCHAR(81,0)}
     * @return The value of bookNameWithSpace. (Nullable)
     */
    public String getBookNameWithSpace() {
        return _bookNameWithSpace;
    }

    /**
     * Set the value of bookNameWithSpace. <br />
     * {VARCHAR(81,0)}
     * @param bookNameWithSpace The value of bookNameWithSpace. (Nullable)
     */
    public void setBookNameWithSpace(String bookNameWithSpace) {
        this._bookNameWithSpace = bookNameWithSpace;
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

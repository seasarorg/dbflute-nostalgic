/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs.customize;



/**
 * The simple DTO of SameBook that the type is null.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     BOOK_ID, ISBN, BOOK_NAME, AUTHOR_ID, PUBLISHER_ID, GENRE_CODE, OPENING_PART, MAX_LENDING_DATE_COUNT, OUT_OF_USER_SELECT_YN, OUT_OF_USER_SELECT_REASON, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
public abstract class BsSameBookDto implements java.io.Serializable {

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

    /** The value of isbn. {VARCHAR(20,0)} */
    protected String _isbn;

    /** The value of bookName. {VARCHAR(80,0)} */
    protected String _bookName;

    /** The value of authorId. {INTEGER(10,0)} */
    protected Integer _authorId;

    /** The value of publisherId. {INTEGER(10,0)} */
    protected Integer _publisherId;

    /** The value of genreCode. {VARCHAR(24,0)} */
    protected String _genreCode;

    /** The value of openingPart. {CLOB(2147483647,0)} */
    protected String _openingPart;

    /** The value of maxLendingDateCount. {SMALLINT(5,0)} */
    protected Integer _maxLendingDateCount;

    /** The value of outOfUserSelectYn. {CHAR(1,0)} */
    protected String _outOfUserSelectYn;

    /** The value of outOfUserSelectReason. {VARCHAR(200,0)} */
    protected String _outOfUserSelectReason;

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
    public BsSameBookDto() {
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
        if (other == null || !(other instanceof BsSameBookDto)) { return false; }
        final BsSameBookDto otherEntity = (BsSameBookDto)other;
        if (!helpComparingValue(getBookId(), otherEntity.getBookId())) { return false; }
        if (!helpComparingValue(getIsbn(), otherEntity.getIsbn())) { return false; }
        if (!helpComparingValue(getBookName(), otherEntity.getBookName())) { return false; }
        if (!helpComparingValue(getAuthorId(), otherEntity.getAuthorId())) { return false; }
        if (!helpComparingValue(getPublisherId(), otherEntity.getPublisherId())) { return false; }
        if (!helpComparingValue(getGenreCode(), otherEntity.getGenreCode())) { return false; }
        if (!helpComparingValue(getOpeningPart(), otherEntity.getOpeningPart())) { return false; }
        if (!helpComparingValue(getMaxLendingDateCount(), otherEntity.getMaxLendingDateCount())) { return false; }
        if (!helpComparingValue(getOutOfUserSelectYn(), otherEntity.getOutOfUserSelectYn())) { return false; }
        if (!helpComparingValue(getOutOfUserSelectReason(), otherEntity.getOutOfUserSelectReason())) { return false; }
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
     * The override.
     * Calculates hash-code from all-columns.
     * @return Hash-code from all-columns.
     */
    public int hashCode() {
        int result = 0;
        if (this.getBookId() != null) { result = result + this.getBookId().hashCode(); }
        if (this.getIsbn() != null) { result = result + this.getIsbn().hashCode(); }
        if (this.getBookName() != null) { result = result + this.getBookName().hashCode(); }
        if (this.getAuthorId() != null) { result = result + this.getAuthorId().hashCode(); }
        if (this.getPublisherId() != null) { result = result + this.getPublisherId().hashCode(); }
        if (this.getGenreCode() != null) { result = result + this.getGenreCode().hashCode(); }
        if (this.getOpeningPart() != null) { result = result + this.getOpeningPart().hashCode(); }
        if (this.getMaxLendingDateCount() != null) { result = result + this.getMaxLendingDateCount().hashCode(); }
        if (this.getOutOfUserSelectYn() != null) { result = result + this.getOutOfUserSelectYn().hashCode(); }
        if (this.getOutOfUserSelectReason() != null) { result = result + this.getOutOfUserSelectReason().hashCode(); }
        if (this.getRUser() != null) { result = result + this.getRUser().hashCode(); }
        if (this.getRModule() != null) { result = result + this.getRModule().hashCode(); }
        if (this.getRTimestamp() != null) { result = result + this.getRTimestamp().hashCode(); }
        if (this.getUUser() != null) { result = result + this.getUUser().hashCode(); }
        if (this.getUModule() != null) { result = result + this.getUModule().hashCode(); }
        if (this.getUTimestamp() != null) { result = result + this.getUTimestamp().hashCode(); }
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
        sb.append(delimiter).append(getIsbn());
        sb.append(delimiter).append(getBookName());
        sb.append(delimiter).append(getAuthorId());
        sb.append(delimiter).append(getPublisherId());
        sb.append(delimiter).append(getGenreCode());
        sb.append(delimiter).append(getOpeningPart());
        sb.append(delimiter).append(getMaxLendingDateCount());
        sb.append(delimiter).append(getOutOfUserSelectYn());
        sb.append(delimiter).append(getOutOfUserSelectReason());
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
     * Get the value of isbn. <br />
     * {VARCHAR(20,0)}
     * @return The value of isbn. (Nullable)
     */
    public String getIsbn() {
        return _isbn;
    }

    /**
     * Set the value of isbn. <br />
     * {VARCHAR(20,0)}
     * @param isbn The value of isbn. (Nullable)
     */
    public void setIsbn(String isbn) {
        this._isbn = isbn;
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
     * Get the value of authorId. <br />
     * {INTEGER(10,0)}
     * @return The value of authorId. (Nullable)
     */
    public Integer getAuthorId() {
        return _authorId;
    }

    /**
     * Set the value of authorId. <br />
     * {INTEGER(10,0)}
     * @param authorId The value of authorId. (Nullable)
     */
    public void setAuthorId(Integer authorId) {
        this._authorId = authorId;
    }

    /**
     * Get the value of publisherId. <br />
     * {INTEGER(10,0)}
     * @return The value of publisherId. (Nullable)
     */
    public Integer getPublisherId() {
        return _publisherId;
    }

    /**
     * Set the value of publisherId. <br />
     * {INTEGER(10,0)}
     * @param publisherId The value of publisherId. (Nullable)
     */
    public void setPublisherId(Integer publisherId) {
        this._publisherId = publisherId;
    }

    /**
     * Get the value of genreCode. <br />
     * {VARCHAR(24,0)}
     * @return The value of genreCode. (Nullable)
     */
    public String getGenreCode() {
        return _genreCode;
    }

    /**
     * Set the value of genreCode. <br />
     * {VARCHAR(24,0)}
     * @param genreCode The value of genreCode. (Nullable)
     */
    public void setGenreCode(String genreCode) {
        this._genreCode = genreCode;
    }

    /**
     * Get the value of openingPart. <br />
     * {CLOB(2147483647,0)}
     * @return The value of openingPart. (Nullable)
     */
    public String getOpeningPart() {
        return _openingPart;
    }

    /**
     * Set the value of openingPart. <br />
     * {CLOB(2147483647,0)}
     * @param openingPart The value of openingPart. (Nullable)
     */
    public void setOpeningPart(String openingPart) {
        this._openingPart = openingPart;
    }

    /**
     * Get the value of maxLendingDateCount. <br />
     * {SMALLINT(5,0)}
     * @return The value of maxLendingDateCount. (Nullable)
     */
    public Integer getMaxLendingDateCount() {
        return _maxLendingDateCount;
    }

    /**
     * Set the value of maxLendingDateCount. <br />
     * {SMALLINT(5,0)}
     * @param maxLendingDateCount The value of maxLendingDateCount. (Nullable)
     */
    public void setMaxLendingDateCount(Integer maxLendingDateCount) {
        this._maxLendingDateCount = maxLendingDateCount;
    }

    /**
     * Get the value of outOfUserSelectYn. <br />
     * {CHAR(1,0)}
     * @return The value of outOfUserSelectYn. (Nullable)
     */
    public String getOutOfUserSelectYn() {
        return _outOfUserSelectYn;
    }

    /**
     * Set the value of outOfUserSelectYn. <br />
     * {CHAR(1,0)}
     * @param outOfUserSelectYn The value of outOfUserSelectYn. (Nullable)
     */
    public void setOutOfUserSelectYn(String outOfUserSelectYn) {
        this._outOfUserSelectYn = outOfUserSelectYn;
    }

    /**
     * Get the value of outOfUserSelectReason. <br />
     * {VARCHAR(200,0)}
     * @return The value of outOfUserSelectReason. (Nullable)
     */
    public String getOutOfUserSelectReason() {
        return _outOfUserSelectReason;
    }

    /**
     * Set the value of outOfUserSelectReason. <br />
     * {VARCHAR(200,0)}
     * @param outOfUserSelectReason The value of outOfUserSelectReason. (Nullable)
     */
    public void setOutOfUserSelectReason(String outOfUserSelectReason) {
        this._outOfUserSelectReason = outOfUserSelectReason;
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

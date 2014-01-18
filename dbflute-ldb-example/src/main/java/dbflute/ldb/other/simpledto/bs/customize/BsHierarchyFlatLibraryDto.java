/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs.customize;



/**
 * The simple DTO of HierarchyFlatLibrary that the type is null.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     LIBRARY_ID, LIBRARY_NAME, R_USER, R_TIMESTAMP, BASE_LIBRARY_ID, NEXT_LIBRARY_ID, NEXT_LIBRARY_NEXT_LIBRARY_ID, NEXT_LIBRARY_NEXT_LIBRARY_NAME, COLLECTION_ID, COLLECTION_ARRIVAL_DATE, COLLECTION_STATUS_ID, COLLECTION_STATUS_CODE, COLLECTION_STATUS_NAME, COLLECTION_BOOK_ID, COLLECTION_BOOK_NAME, COLLECTION_BOOK_AUTHOR_ID, COLLECTION_BOOK_AUTHOR_NAME, LIBRARY_USER_LIBRARY_ID, LIBRARY_USER_LB_USER_ID, LENDING_LIBRARY_ID, LENDING_LB_USER_ID, LENDING_DATE, LENDING_U_USER, LENDING_U_MODULE, LB_USER_ID, LB_USER_NAME
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
public abstract class BsHierarchyFlatLibraryDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of libraryId. {SMALLINT(5,0)} */
    protected Integer _libraryId;

    /** The value of libraryName. {VARCHAR(80,0)} */
    protected String _libraryName;

    /** The value of RUser. {VARCHAR(100,0)} */
    protected String _rUser;

    /** The value of RTimestamp. {TIMESTAMP(26,6)} */
    protected java.sql.Timestamp _rTimestamp;

    /** The value of baseLibraryId. {SMALLINT(5,0)} */
    protected Integer _baseLibraryId;

    /** The value of nextLibraryId. {SMALLINT(5,0)} */
    protected Integer _nextLibraryId;

    /** The value of nextLibraryNextLibraryId. {SMALLINT(5,0)} */
    protected Integer _nextLibraryNextLibraryId;

    /** The value of nextLibraryNextLibraryName. {VARCHAR(80,0)} */
    protected String _nextLibraryNextLibraryName;

    /** The value of collectionId. {INTEGER(10,0)} */
    protected Integer _collectionId;

    /** The value of collectionArrivalDate. {TIMESTAMP(26,6)} */
    protected java.sql.Timestamp _collectionArrivalDate;

    /** The value of collectionStatusId. {INTEGER(10,0)} */
    protected Integer _collectionStatusId;

    /** The value of collectionStatusCode. {CHAR(3,0)} */
    protected String _collectionStatusCode;

    /** The value of collectionStatusName. {VARCHAR(80,0)} */
    protected String _collectionStatusName;

    /** The value of collectionBookId. {INTEGER(10,0)} */
    protected Integer _collectionBookId;

    /** The value of collectionBookName. {VARCHAR(80,0)} */
    protected String _collectionBookName;

    /** The value of collectionBookAuthorId. {INTEGER(10,0)} */
    protected Integer _collectionBookAuthorId;

    /** The value of collectionBookAuthorName. {VARCHAR(80,0)} */
    protected String _collectionBookAuthorName;

    /** The value of libraryUserLibraryId. {SMALLINT(5,0)} */
    protected Integer _libraryUserLibraryId;

    /** The value of libraryUserLbUserId. {INTEGER(10,0)} */
    protected Integer _libraryUserLbUserId;

    /** The value of lendingLibraryId. {SMALLINT(5,0)} */
    protected Integer _lendingLibraryId;

    /** The value of lendingLbUserId. {INTEGER(10,0)} */
    protected Integer _lendingLbUserId;

    /** The value of lendingDate. {TIMESTAMP(26,6)} */
    protected java.sql.Timestamp _lendingDate;

    /** The value of lendingUUser. {VARCHAR(100,0)} */
    protected String _lendingUUser;

    /** The value of lendingUModule. {VARCHAR(100,0)} */
    protected String _lendingUModule;

    /** The value of lbUserId. {INTEGER(10,0)} */
    protected Integer _lbUserId;

    /** The value of lbUserName. {VARCHAR(80,0)} */
    protected String _lbUserName;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHierarchyFlatLibraryDto() {
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
        if (other == null || !(other instanceof BsHierarchyFlatLibraryDto)) { return false; }
        final BsHierarchyFlatLibraryDto otherEntity = (BsHierarchyFlatLibraryDto)other;
        if (!helpComparingValue(getLibraryId(), otherEntity.getLibraryId())) { return false; }
        if (!helpComparingValue(getLibraryName(), otherEntity.getLibraryName())) { return false; }
        if (!helpComparingValue(getRUser(), otherEntity.getRUser())) { return false; }
        if (!helpComparingValue(getRTimestamp(), otherEntity.getRTimestamp())) { return false; }
        if (!helpComparingValue(getBaseLibraryId(), otherEntity.getBaseLibraryId())) { return false; }
        if (!helpComparingValue(getNextLibraryId(), otherEntity.getNextLibraryId())) { return false; }
        if (!helpComparingValue(getNextLibraryNextLibraryId(), otherEntity.getNextLibraryNextLibraryId())) { return false; }
        if (!helpComparingValue(getNextLibraryNextLibraryName(), otherEntity.getNextLibraryNextLibraryName())) { return false; }
        if (!helpComparingValue(getCollectionId(), otherEntity.getCollectionId())) { return false; }
        if (!helpComparingValue(getCollectionArrivalDate(), otherEntity.getCollectionArrivalDate())) { return false; }
        if (!helpComparingValue(getCollectionStatusId(), otherEntity.getCollectionStatusId())) { return false; }
        if (!helpComparingValue(getCollectionStatusCode(), otherEntity.getCollectionStatusCode())) { return false; }
        if (!helpComparingValue(getCollectionStatusName(), otherEntity.getCollectionStatusName())) { return false; }
        if (!helpComparingValue(getCollectionBookId(), otherEntity.getCollectionBookId())) { return false; }
        if (!helpComparingValue(getCollectionBookName(), otherEntity.getCollectionBookName())) { return false; }
        if (!helpComparingValue(getCollectionBookAuthorId(), otherEntity.getCollectionBookAuthorId())) { return false; }
        if (!helpComparingValue(getCollectionBookAuthorName(), otherEntity.getCollectionBookAuthorName())) { return false; }
        if (!helpComparingValue(getLibraryUserLibraryId(), otherEntity.getLibraryUserLibraryId())) { return false; }
        if (!helpComparingValue(getLibraryUserLbUserId(), otherEntity.getLibraryUserLbUserId())) { return false; }
        if (!helpComparingValue(getLendingLibraryId(), otherEntity.getLendingLibraryId())) { return false; }
        if (!helpComparingValue(getLendingLbUserId(), otherEntity.getLendingLbUserId())) { return false; }
        if (!helpComparingValue(getLendingDate(), otherEntity.getLendingDate())) { return false; }
        if (!helpComparingValue(getLendingUUser(), otherEntity.getLendingUUser())) { return false; }
        if (!helpComparingValue(getLendingUModule(), otherEntity.getLendingUModule())) { return false; }
        if (!helpComparingValue(getLbUserId(), otherEntity.getLbUserId())) { return false; }
        if (!helpComparingValue(getLbUserName(), otherEntity.getLbUserName())) { return false; }
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
        if (this.getLibraryId() != null) { result = result + this.getLibraryId().hashCode(); }
        if (this.getLibraryName() != null) { result = result + this.getLibraryName().hashCode(); }
        if (this.getRUser() != null) { result = result + this.getRUser().hashCode(); }
        if (this.getRTimestamp() != null) { result = result + this.getRTimestamp().hashCode(); }
        if (this.getBaseLibraryId() != null) { result = result + this.getBaseLibraryId().hashCode(); }
        if (this.getNextLibraryId() != null) { result = result + this.getNextLibraryId().hashCode(); }
        if (this.getNextLibraryNextLibraryId() != null) { result = result + this.getNextLibraryNextLibraryId().hashCode(); }
        if (this.getNextLibraryNextLibraryName() != null) { result = result + this.getNextLibraryNextLibraryName().hashCode(); }
        if (this.getCollectionId() != null) { result = result + this.getCollectionId().hashCode(); }
        if (this.getCollectionArrivalDate() != null) { result = result + this.getCollectionArrivalDate().hashCode(); }
        if (this.getCollectionStatusId() != null) { result = result + this.getCollectionStatusId().hashCode(); }
        if (this.getCollectionStatusCode() != null) { result = result + this.getCollectionStatusCode().hashCode(); }
        if (this.getCollectionStatusName() != null) { result = result + this.getCollectionStatusName().hashCode(); }
        if (this.getCollectionBookId() != null) { result = result + this.getCollectionBookId().hashCode(); }
        if (this.getCollectionBookName() != null) { result = result + this.getCollectionBookName().hashCode(); }
        if (this.getCollectionBookAuthorId() != null) { result = result + this.getCollectionBookAuthorId().hashCode(); }
        if (this.getCollectionBookAuthorName() != null) { result = result + this.getCollectionBookAuthorName().hashCode(); }
        if (this.getLibraryUserLibraryId() != null) { result = result + this.getLibraryUserLibraryId().hashCode(); }
        if (this.getLibraryUserLbUserId() != null) { result = result + this.getLibraryUserLbUserId().hashCode(); }
        if (this.getLendingLibraryId() != null) { result = result + this.getLendingLibraryId().hashCode(); }
        if (this.getLendingLbUserId() != null) { result = result + this.getLendingLbUserId().hashCode(); }
        if (this.getLendingDate() != null) { result = result + this.getLendingDate().hashCode(); }
        if (this.getLendingUUser() != null) { result = result + this.getLendingUUser().hashCode(); }
        if (this.getLendingUModule() != null) { result = result + this.getLendingUModule().hashCode(); }
        if (this.getLbUserId() != null) { result = result + this.getLbUserId().hashCode(); }
        if (this.getLbUserName() != null) { result = result + this.getLbUserName().hashCode(); }
        return result;
    }

    /**
     * The override.
     * @return Column-value map-string. (NotNull)
     */
    public String toString() {
        final String delimiter = ",";
        final StringBuilder sb = new StringBuilder();

        sb.append(delimiter).append(getLibraryId());
        sb.append(delimiter).append(getLibraryName());
        sb.append(delimiter).append(getRUser());
        sb.append(delimiter).append(getRTimestamp());
        sb.append(delimiter).append(getBaseLibraryId());
        sb.append(delimiter).append(getNextLibraryId());
        sb.append(delimiter).append(getNextLibraryNextLibraryId());
        sb.append(delimiter).append(getNextLibraryNextLibraryName());
        sb.append(delimiter).append(getCollectionId());
        sb.append(delimiter).append(getCollectionArrivalDate());
        sb.append(delimiter).append(getCollectionStatusId());
        sb.append(delimiter).append(getCollectionStatusCode());
        sb.append(delimiter).append(getCollectionStatusName());
        sb.append(delimiter).append(getCollectionBookId());
        sb.append(delimiter).append(getCollectionBookName());
        sb.append(delimiter).append(getCollectionBookAuthorId());
        sb.append(delimiter).append(getCollectionBookAuthorName());
        sb.append(delimiter).append(getLibraryUserLibraryId());
        sb.append(delimiter).append(getLibraryUserLbUserId());
        sb.append(delimiter).append(getLendingLibraryId());
        sb.append(delimiter).append(getLendingLbUserId());
        sb.append(delimiter).append(getLendingDate());
        sb.append(delimiter).append(getLendingUUser());
        sb.append(delimiter).append(getLendingUModule());
        sb.append(delimiter).append(getLbUserId());
        sb.append(delimiter).append(getLbUserName());

        sb.delete(0, delimiter.length());
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get the value of libraryId. <br />
     * {SMALLINT(5,0)}
     * @return The value of libraryId. (Nullable)
     */
    public Integer getLibraryId() {
        return _libraryId;
    }

    /**
     * Set the value of libraryId. <br />
     * {SMALLINT(5,0)}
     * @param libraryId The value of libraryId. (Nullable)
     */
    public void setLibraryId(Integer libraryId) {
        this._libraryId = libraryId;
    }

    /**
     * Get the value of libraryName. <br />
     * {VARCHAR(80,0)}
     * @return The value of libraryName. (Nullable)
     */
    public String getLibraryName() {
        return _libraryName;
    }

    /**
     * Set the value of libraryName. <br />
     * {VARCHAR(80,0)}
     * @param libraryName The value of libraryName. (Nullable)
     */
    public void setLibraryName(String libraryName) {
        this._libraryName = libraryName;
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
     * Get the value of baseLibraryId. <br />
     * {SMALLINT(5,0)}
     * @return The value of baseLibraryId. (Nullable)
     */
    public Integer getBaseLibraryId() {
        return _baseLibraryId;
    }

    /**
     * Set the value of baseLibraryId. <br />
     * {SMALLINT(5,0)}
     * @param baseLibraryId The value of baseLibraryId. (Nullable)
     */
    public void setBaseLibraryId(Integer baseLibraryId) {
        this._baseLibraryId = baseLibraryId;
    }

    /**
     * Get the value of nextLibraryId. <br />
     * {SMALLINT(5,0)}
     * @return The value of nextLibraryId. (Nullable)
     */
    public Integer getNextLibraryId() {
        return _nextLibraryId;
    }

    /**
     * Set the value of nextLibraryId. <br />
     * {SMALLINT(5,0)}
     * @param nextLibraryId The value of nextLibraryId. (Nullable)
     */
    public void setNextLibraryId(Integer nextLibraryId) {
        this._nextLibraryId = nextLibraryId;
    }

    /**
     * Get the value of nextLibraryNextLibraryId. <br />
     * {SMALLINT(5,0)}
     * @return The value of nextLibraryNextLibraryId. (Nullable)
     */
    public Integer getNextLibraryNextLibraryId() {
        return _nextLibraryNextLibraryId;
    }

    /**
     * Set the value of nextLibraryNextLibraryId. <br />
     * {SMALLINT(5,0)}
     * @param nextLibraryNextLibraryId The value of nextLibraryNextLibraryId. (Nullable)
     */
    public void setNextLibraryNextLibraryId(Integer nextLibraryNextLibraryId) {
        this._nextLibraryNextLibraryId = nextLibraryNextLibraryId;
    }

    /**
     * Get the value of nextLibraryNextLibraryName. <br />
     * {VARCHAR(80,0)}
     * @return The value of nextLibraryNextLibraryName. (Nullable)
     */
    public String getNextLibraryNextLibraryName() {
        return _nextLibraryNextLibraryName;
    }

    /**
     * Set the value of nextLibraryNextLibraryName. <br />
     * {VARCHAR(80,0)}
     * @param nextLibraryNextLibraryName The value of nextLibraryNextLibraryName. (Nullable)
     */
    public void setNextLibraryNextLibraryName(String nextLibraryNextLibraryName) {
        this._nextLibraryNextLibraryName = nextLibraryNextLibraryName;
    }

    /**
     * Get the value of collectionId. <br />
     * {INTEGER(10,0)}
     * @return The value of collectionId. (Nullable)
     */
    public Integer getCollectionId() {
        return _collectionId;
    }

    /**
     * Set the value of collectionId. <br />
     * {INTEGER(10,0)}
     * @param collectionId The value of collectionId. (Nullable)
     */
    public void setCollectionId(Integer collectionId) {
        this._collectionId = collectionId;
    }

    /**
     * Get the value of collectionArrivalDate. <br />
     * {TIMESTAMP(26,6)}
     * @return The value of collectionArrivalDate. (Nullable)
     */
    public java.sql.Timestamp getCollectionArrivalDate() {
        return _collectionArrivalDate;
    }

    /**
     * Set the value of collectionArrivalDate. <br />
     * {TIMESTAMP(26,6)}
     * @param collectionArrivalDate The value of collectionArrivalDate. (Nullable)
     */
    public void setCollectionArrivalDate(java.sql.Timestamp collectionArrivalDate) {
        this._collectionArrivalDate = collectionArrivalDate;
    }

    /**
     * Get the value of collectionStatusId. <br />
     * {INTEGER(10,0)}
     * @return The value of collectionStatusId. (Nullable)
     */
    public Integer getCollectionStatusId() {
        return _collectionStatusId;
    }

    /**
     * Set the value of collectionStatusId. <br />
     * {INTEGER(10,0)}
     * @param collectionStatusId The value of collectionStatusId. (Nullable)
     */
    public void setCollectionStatusId(Integer collectionStatusId) {
        this._collectionStatusId = collectionStatusId;
    }

    /**
     * Get the value of collectionStatusCode. <br />
     * {CHAR(3,0)}
     * @return The value of collectionStatusCode. (Nullable)
     */
    public String getCollectionStatusCode() {
        return _collectionStatusCode;
    }

    /**
     * Set the value of collectionStatusCode. <br />
     * {CHAR(3,0)}
     * @param collectionStatusCode The value of collectionStatusCode. (Nullable)
     */
    public void setCollectionStatusCode(String collectionStatusCode) {
        this._collectionStatusCode = collectionStatusCode;
    }

    /**
     * Get the value of collectionStatusName. <br />
     * {VARCHAR(80,0)}
     * @return The value of collectionStatusName. (Nullable)
     */
    public String getCollectionStatusName() {
        return _collectionStatusName;
    }

    /**
     * Set the value of collectionStatusName. <br />
     * {VARCHAR(80,0)}
     * @param collectionStatusName The value of collectionStatusName. (Nullable)
     */
    public void setCollectionStatusName(String collectionStatusName) {
        this._collectionStatusName = collectionStatusName;
    }

    /**
     * Get the value of collectionBookId. <br />
     * {INTEGER(10,0)}
     * @return The value of collectionBookId. (Nullable)
     */
    public Integer getCollectionBookId() {
        return _collectionBookId;
    }

    /**
     * Set the value of collectionBookId. <br />
     * {INTEGER(10,0)}
     * @param collectionBookId The value of collectionBookId. (Nullable)
     */
    public void setCollectionBookId(Integer collectionBookId) {
        this._collectionBookId = collectionBookId;
    }

    /**
     * Get the value of collectionBookName. <br />
     * {VARCHAR(80,0)}
     * @return The value of collectionBookName. (Nullable)
     */
    public String getCollectionBookName() {
        return _collectionBookName;
    }

    /**
     * Set the value of collectionBookName. <br />
     * {VARCHAR(80,0)}
     * @param collectionBookName The value of collectionBookName. (Nullable)
     */
    public void setCollectionBookName(String collectionBookName) {
        this._collectionBookName = collectionBookName;
    }

    /**
     * Get the value of collectionBookAuthorId. <br />
     * {INTEGER(10,0)}
     * @return The value of collectionBookAuthorId. (Nullable)
     */
    public Integer getCollectionBookAuthorId() {
        return _collectionBookAuthorId;
    }

    /**
     * Set the value of collectionBookAuthorId. <br />
     * {INTEGER(10,0)}
     * @param collectionBookAuthorId The value of collectionBookAuthorId. (Nullable)
     */
    public void setCollectionBookAuthorId(Integer collectionBookAuthorId) {
        this._collectionBookAuthorId = collectionBookAuthorId;
    }

    /**
     * Get the value of collectionBookAuthorName. <br />
     * {VARCHAR(80,0)}
     * @return The value of collectionBookAuthorName. (Nullable)
     */
    public String getCollectionBookAuthorName() {
        return _collectionBookAuthorName;
    }

    /**
     * Set the value of collectionBookAuthorName. <br />
     * {VARCHAR(80,0)}
     * @param collectionBookAuthorName The value of collectionBookAuthorName. (Nullable)
     */
    public void setCollectionBookAuthorName(String collectionBookAuthorName) {
        this._collectionBookAuthorName = collectionBookAuthorName;
    }

    /**
     * Get the value of libraryUserLibraryId. <br />
     * {SMALLINT(5,0)}
     * @return The value of libraryUserLibraryId. (Nullable)
     */
    public Integer getLibraryUserLibraryId() {
        return _libraryUserLibraryId;
    }

    /**
     * Set the value of libraryUserLibraryId. <br />
     * {SMALLINT(5,0)}
     * @param libraryUserLibraryId The value of libraryUserLibraryId. (Nullable)
     */
    public void setLibraryUserLibraryId(Integer libraryUserLibraryId) {
        this._libraryUserLibraryId = libraryUserLibraryId;
    }

    /**
     * Get the value of libraryUserLbUserId. <br />
     * {INTEGER(10,0)}
     * @return The value of libraryUserLbUserId. (Nullable)
     */
    public Integer getLibraryUserLbUserId() {
        return _libraryUserLbUserId;
    }

    /**
     * Set the value of libraryUserLbUserId. <br />
     * {INTEGER(10,0)}
     * @param libraryUserLbUserId The value of libraryUserLbUserId. (Nullable)
     */
    public void setLibraryUserLbUserId(Integer libraryUserLbUserId) {
        this._libraryUserLbUserId = libraryUserLbUserId;
    }

    /**
     * Get the value of lendingLibraryId. <br />
     * {SMALLINT(5,0)}
     * @return The value of lendingLibraryId. (Nullable)
     */
    public Integer getLendingLibraryId() {
        return _lendingLibraryId;
    }

    /**
     * Set the value of lendingLibraryId. <br />
     * {SMALLINT(5,0)}
     * @param lendingLibraryId The value of lendingLibraryId. (Nullable)
     */
    public void setLendingLibraryId(Integer lendingLibraryId) {
        this._lendingLibraryId = lendingLibraryId;
    }

    /**
     * Get the value of lendingLbUserId. <br />
     * {INTEGER(10,0)}
     * @return The value of lendingLbUserId. (Nullable)
     */
    public Integer getLendingLbUserId() {
        return _lendingLbUserId;
    }

    /**
     * Set the value of lendingLbUserId. <br />
     * {INTEGER(10,0)}
     * @param lendingLbUserId The value of lendingLbUserId. (Nullable)
     */
    public void setLendingLbUserId(Integer lendingLbUserId) {
        this._lendingLbUserId = lendingLbUserId;
    }

    /**
     * Get the value of lendingDate. <br />
     * {TIMESTAMP(26,6)}
     * @return The value of lendingDate. (Nullable)
     */
    public java.sql.Timestamp getLendingDate() {
        return _lendingDate;
    }

    /**
     * Set the value of lendingDate. <br />
     * {TIMESTAMP(26,6)}
     * @param lendingDate The value of lendingDate. (Nullable)
     */
    public void setLendingDate(java.sql.Timestamp lendingDate) {
        this._lendingDate = lendingDate;
    }

    /**
     * Get the value of lendingUUser. <br />
     * {VARCHAR(100,0)}
     * @return The value of lendingUUser. (Nullable)
     */
    public String getLendingUUser() {
        return _lendingUUser;
    }

    /**
     * Set the value of lendingUUser. <br />
     * {VARCHAR(100,0)}
     * @param lendingUUser The value of lendingUUser. (Nullable)
     */
    public void setLendingUUser(String lendingUUser) {
        this._lendingUUser = lendingUUser;
    }

    /**
     * Get the value of lendingUModule. <br />
     * {VARCHAR(100,0)}
     * @return The value of lendingUModule. (Nullable)
     */
    public String getLendingUModule() {
        return _lendingUModule;
    }

    /**
     * Set the value of lendingUModule. <br />
     * {VARCHAR(100,0)}
     * @param lendingUModule The value of lendingUModule. (Nullable)
     */
    public void setLendingUModule(String lendingUModule) {
        this._lendingUModule = lendingUModule;
    }

    /**
     * Get the value of lbUserId. <br />
     * {INTEGER(10,0)}
     * @return The value of lbUserId. (Nullable)
     */
    public Integer getLbUserId() {
        return _lbUserId;
    }

    /**
     * Set the value of lbUserId. <br />
     * {INTEGER(10,0)}
     * @param lbUserId The value of lbUserId. (Nullable)
     */
    public void setLbUserId(Integer lbUserId) {
        this._lbUserId = lbUserId;
    }

    /**
     * Get the value of lbUserName. <br />
     * {VARCHAR(80,0)}
     * @return The value of lbUserName. (Nullable)
     */
    public String getLbUserName() {
        return _lbUserName;
    }

    /**
     * Set the value of lbUserName. <br />
     * {VARCHAR(80,0)}
     * @param lbUserName The value of lbUserName. (Nullable)
     */
    public void setLbUserName(String lbUserName) {
        this._lbUserName = lbUserName;
    }

}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs;


import dbflute.ldb.other.simpledto.*;

/**
 * The simple DTO of LENDING_COLLECTION that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID
 * 
 * [column]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID, RETURN_LIMIT_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION, LENDING, LIBRARY_USER
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     collection, lending, libraryUser
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class BsLendingCollectionDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of libraryId. {PK : NotNull : SMALLINT : FK to LENDING} */
    protected Integer _libraryId;

    /** The value of lbUserId. {PK : NotNull : INTEGER : FK to LENDING} */
    protected Integer _lbUserId;

    /** The value of lendingDate. {PK : NotNull : TIMESTAMP : FK to LENDING} */
    protected java.sql.Timestamp _lendingDate;

    /** The value of collectionId. {PK : NotNull : INTEGER : FK to COLLECTION} */
    protected Integer _collectionId;

    /** The value of returnLimitDate. {NotNull : TIMESTAMP} */
    protected java.sql.Timestamp _returnLimitDate;

    /** The value of RUser. {NotNull : VARCHAR(100) : Default=[default-user]} */
    protected String _rUser;

    /** The value of RModule. {NotNull : VARCHAR(100) : Default=[default-module]} */
    protected String _rModule;

    /** The value of RTimestamp. {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _rTimestamp;

    /** The value of UUser. {NotNull : VARCHAR(100) : Default=[default-user]} */
    protected String _uUser;

    /** The value of UModule. {NotNull : VARCHAR(100) : Default=[default-module]} */
    protected String _uModule;

    /** The value of UTimestamp. {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _uTimestamp;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLendingCollectionDto() {
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    /** The entity of foreign table. */
    protected CollectionDto _parentCollection;

    /**
     * Get the entity of foreign table of collection. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public CollectionDto getCollection() {
        return _parentCollection;
    }

    /**
     * Set the entity of foreign table of collection.
     * @param collection The entity of foreign table. (Nullable)
     */
    public void setCollection(CollectionDto collection) {
        this._parentCollection = collection;
    }

    /** The entity of foreign table. */
    protected LendingDto _parentLending;

    /**
     * Get the entity of foreign table of lending. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public LendingDto getLending() {
        return _parentLending;
    }

    /**
     * Set the entity of foreign table of lending.
     * @param lending The entity of foreign table. (Nullable)
     */
    public void setLending(LendingDto lending) {
        this._parentLending = lending;
    }

    /** The entity of foreign table. */
    protected LibraryUserDto _parentLibraryUser;

    /**
     * Get the entity of foreign table of libraryUser. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public LibraryUserDto getLibraryUser() {
        return _parentLibraryUser;
    }

    /**
     * Set the entity of foreign table of libraryUser.
     * @param libraryUser The entity of foreign table. (Nullable)
     */
    public void setLibraryUser(LibraryUserDto libraryUser) {
        this._parentLibraryUser = libraryUser;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * {@inheritDoc}
     * If the primary-key of the other is same as this one, returns true.
     * @param other Other entity.
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsLendingCollectionDto)) { return false; }
        final BsLendingCollectionDto otherEntity = (BsLendingCollectionDto)other;
        if (!helpComparingValue(getLibraryId(), otherEntity.getLibraryId())) { return false; }
        if (!helpComparingValue(getLbUserId(), otherEntity.getLbUserId())) { return false; }
        if (!helpComparingValue(getLendingDate(), otherEntity.getLendingDate())) { return false; }
        if (!helpComparingValue(getCollectionId(), otherEntity.getCollectionId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * {@inheritDoc}
     * Calculates hash-code from primary-key.
     * @return Hash-code from primary-keys.
     */
    public int hashCode() {
        int result = 0;
        if (this.getLibraryId() != null) { result = result + getLibraryId().hashCode(); }
        if (this.getLbUserId() != null) { result = result + getLbUserId().hashCode(); }
        if (this.getLendingDate() != null) { result = result + getLendingDate().hashCode(); }
        if (this.getCollectionId() != null) { result = result + getCollectionId().hashCode(); }
        return result;
    }


    /**
     * {@inheritDoc}
     * @return Column-value map-string. (NotNull)
     */
    public String toString() {
        final String delimiter = ",";
        final StringBuilder sb = new StringBuilder();

        sb.append(delimiter).append(getLibraryId());
        sb.append(delimiter).append(getLbUserId());
        sb.append(delimiter).append(getLendingDate());
        sb.append(delimiter).append(getCollectionId());
        sb.append(delimiter).append(getReturnLimitDate());
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
     * Get the value of libraryId. <br />
     * {PK : NotNull : SMALLINT : FK to LENDING}
     * @return The value of libraryId. (Nullable)
     */
    public Integer getLibraryId() {
        return _libraryId;
    }

    /**
     * Set the value of libraryId. <br />
     * {PK : NotNull : SMALLINT : FK to LENDING}
     * @param libraryId The value of libraryId. (Nullable)
     */
    public void setLibraryId(Integer libraryId) {
        this._libraryId = libraryId;
    }

    /**
     * Get the value of lbUserId. <br />
     * {PK : NotNull : INTEGER : FK to LENDING}
     * @return The value of lbUserId. (Nullable)
     */
    public Integer getLbUserId() {
        return _lbUserId;
    }

    /**
     * Set the value of lbUserId. <br />
     * {PK : NotNull : INTEGER : FK to LENDING}
     * @param lbUserId The value of lbUserId. (Nullable)
     */
    public void setLbUserId(Integer lbUserId) {
        this._lbUserId = lbUserId;
    }

    /**
     * Get the value of lendingDate. <br />
     * {PK : NotNull : TIMESTAMP : FK to LENDING}
     * @return The value of lendingDate. (Nullable)
     */
    public java.sql.Timestamp getLendingDate() {
        return _lendingDate;
    }

    /**
     * Set the value of lendingDate. <br />
     * {PK : NotNull : TIMESTAMP : FK to LENDING}
     * @param lendingDate The value of lendingDate. (Nullable)
     */
    public void setLendingDate(java.sql.Timestamp lendingDate) {
        this._lendingDate = lendingDate;
    }

    /**
     * Get the value of collectionId. <br />
     * {PK : NotNull : INTEGER : FK to COLLECTION}
     * @return The value of collectionId. (Nullable)
     */
    public Integer getCollectionId() {
        return _collectionId;
    }

    /**
     * Set the value of collectionId. <br />
     * {PK : NotNull : INTEGER : FK to COLLECTION}
     * @param collectionId The value of collectionId. (Nullable)
     */
    public void setCollectionId(Integer collectionId) {
        this._collectionId = collectionId;
    }

    /**
     * Get the value of returnLimitDate. <br />
     * {NotNull : TIMESTAMP}
     * @return The value of returnLimitDate. (Nullable)
     */
    public java.sql.Timestamp getReturnLimitDate() {
        return _returnLimitDate;
    }

    /**
     * Set the value of returnLimitDate. <br />
     * {NotNull : TIMESTAMP}
     * @param returnLimitDate The value of returnLimitDate. (Nullable)
     */
    public void setReturnLimitDate(java.sql.Timestamp returnLimitDate) {
        this._returnLimitDate = returnLimitDate;
    }

    /**
     * Get the value of rUser. <br />
     * {NotNull : VARCHAR(100) : Default=[default-user]}
     * @return The value of rUser. (Nullable)
     */
    public String getRUser() {
        return _rUser;
    }

    /**
     * Set the value of rUser. <br />
     * {NotNull : VARCHAR(100) : Default=[default-user]}
     * @param rUser The value of rUser. (Nullable)
     */
    public void setRUser(String rUser) {
        this._rUser = rUser;
    }

    /**
     * Get the value of rModule. <br />
     * {NotNull : VARCHAR(100) : Default=[default-module]}
     * @return The value of rModule. (Nullable)
     */
    public String getRModule() {
        return _rModule;
    }

    /**
     * Set the value of rModule. <br />
     * {NotNull : VARCHAR(100) : Default=[default-module]}
     * @param rModule The value of rModule. (Nullable)
     */
    public void setRModule(String rModule) {
        this._rModule = rModule;
    }

    /**
     * Get the value of rTimestamp. <br />
     * {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]}
     * @return The value of rTimestamp. (Nullable)
     */
    public java.sql.Timestamp getRTimestamp() {
        return _rTimestamp;
    }

    /**
     * Set the value of rTimestamp. <br />
     * {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]}
     * @param rTimestamp The value of rTimestamp. (Nullable)
     */
    public void setRTimestamp(java.sql.Timestamp rTimestamp) {
        this._rTimestamp = rTimestamp;
    }

    /**
     * Get the value of uUser. <br />
     * {NotNull : VARCHAR(100) : Default=[default-user]}
     * @return The value of uUser. (Nullable)
     */
    public String getUUser() {
        return _uUser;
    }

    /**
     * Set the value of uUser. <br />
     * {NotNull : VARCHAR(100) : Default=[default-user]}
     * @param uUser The value of uUser. (Nullable)
     */
    public void setUUser(String uUser) {
        this._uUser = uUser;
    }

    /**
     * Get the value of uModule. <br />
     * {NotNull : VARCHAR(100) : Default=[default-module]}
     * @return The value of uModule. (Nullable)
     */
    public String getUModule() {
        return _uModule;
    }

    /**
     * Set the value of uModule. <br />
     * {NotNull : VARCHAR(100) : Default=[default-module]}
     * @param uModule The value of uModule. (Nullable)
     */
    public void setUModule(String uModule) {
        this._uModule = uModule;
    }

    /**
     * Get the value of uTimestamp. <br />
     * {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]}
     * @return The value of uTimestamp. (Nullable)
     */
    public java.sql.Timestamp getUTimestamp() {
        return _uTimestamp;
    }

    /**
     * Set the value of uTimestamp. <br />
     * {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]}
     * @param uTimestamp The value of uTimestamp. (Nullable)
     */
    public void setUTimestamp(java.sql.Timestamp uTimestamp) {
        this._uTimestamp = uTimestamp;
    }

}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs;


import dbflute.ldb.other.simpledto.*;

/**
 * The simple DTO of COLLECTION_STATUS that the type is TABLE.
 * <pre>
 * [primary-key]
 *     COLLECTION_ID
 * 
 * [column]
 *     COLLECTION_ID, COLLECTION_STATUS_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION, COLLECTION_STATUS_LOOKUP
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     collection, collectionStatusLookup
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class BsCollectionStatusDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of collectionId. {PK : NotNull : INTEGER : FK to COLLECTION} */
    protected Integer _collectionId;

    /** The value of collectionStatusCode. {NotNull : CHAR(3) : FK to COLLECTION_STATUS_LOOKUP} */
    protected String _collectionStatusCode;

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
    public BsCollectionStatusDto() {
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
    protected CollectionStatusLookupDto _parentCollectionStatusLookup;

    /**
     * Get the entity of foreign table of collectionStatusLookup. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public CollectionStatusLookupDto getCollectionStatusLookup() {
        return _parentCollectionStatusLookup;
    }

    /**
     * Set the entity of foreign table of collectionStatusLookup.
     * @param collectionStatusLookup The entity of foreign table. (Nullable)
     */
    public void setCollectionStatusLookup(CollectionStatusLookupDto collectionStatusLookup) {
        this._parentCollectionStatusLookup = collectionStatusLookup;
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
        if (other == null || !(other instanceof BsCollectionStatusDto)) { return false; }
        final BsCollectionStatusDto otherEntity = (BsCollectionStatusDto)other;
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

        sb.append(delimiter).append(getCollectionId());
        sb.append(delimiter).append(getCollectionStatusCode());
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
     * Get the value of collectionStatusCode. <br />
     * {NotNull : CHAR(3) : FK to COLLECTION_STATUS_LOOKUP}
     * @return The value of collectionStatusCode. (Nullable)
     */
    public String getCollectionStatusCode() {
        return _collectionStatusCode;
    }

    /**
     * Set the value of collectionStatusCode. <br />
     * {NotNull : CHAR(3) : FK to COLLECTION_STATUS_LOOKUP}
     * @param collectionStatusCode The value of collectionStatusCode. (Nullable)
     */
    public void setCollectionStatusCode(String collectionStatusCode) {
        this._collectionStatusCode = collectionStatusCode;
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

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity;

import java.util.*;

import dbflute.ldb.allcommon.LdCDef;
import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.exentity.*;

/**
 * The entity of COLLECTION_STATUS that the type is TABLE. <br />
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
public abstract class LdBsCollectionStatus implements LdEntityDefinedCommonColumn, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is COLLECTION_STATUS. */
    public static final String TABLE = "COLLECTION_STATUS";
    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "UTimestamp";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** COLLECTION_ID: {PK : NotNull : INTEGER : FK to COLLECTION} */
    protected Integer _collectionId;

    /** COLLECTION_STATUS_CODE: {NotNull : CHAR(3) : FK to COLLECTION_STATUS_LOOKUP} */
    protected String _collectionStatusCode;

    /** R_USER: {NotNull : VARCHAR(100) : Default=[default-user]} */
    protected String _rUser;

    /** R_MODULE: {NotNull : VARCHAR(100) : Default=[default-module]} */
    protected String _rModule;

    /** R_TIMESTAMP: {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _rTimestamp;

    /** U_USER: {NotNull : VARCHAR(100) : Default=[default-user]} */
    protected String _uUser;

    /** U_MODULE: {NotNull : VARCHAR(100) : Default=[default-module]} */
    protected String _uModule;

    /** U_TIMESTAMP: {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _uTimestamp;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();

    /** Is common column auto set up effective? */
    protected boolean _canCommonColumnAutoSetup = true;
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsCollectionStatus() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "COLLECTION_STATUS";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "collectionStatus";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public LdDBMeta getDBMeta() {
        return LdDBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                          Classification Classifying
    //                                                          ==========================
    /**
     * Classify the value of collectionStatusCode as the classification of CollectionStatus. <br />
     * 蔵書の状態を示す
     * @param cls The value of collectionStatusCode as the classification of CollectionStatus. (Nullable)
     */
    public void classifyCollectionStatusCode(LdCDef.CollectionStatus cls) {
        setCollectionStatusCode(cls != null ? new String(cls.code()) : null);
    }

    /**
     * Classify the value of collectionStatusCode as NOR. <br />
     * NOR: 通常状態を示す
     */
    public void classifyCollectionStatusCodeNOR() {
        classifyCollectionStatusCode(LdCDef.CollectionStatus.NOR);
    }

    /**
     * Classify the value of collectionStatusCode as WAT. <br />
     * WAT: 待ち状態を示す
     */
    public void classifyCollectionStatusCodeWAT() {
        classifyCollectionStatusCode(LdCDef.CollectionStatus.WAT);
    }

    /**
     * Classify the value of collectionStatusCode as OUT. <br />
     * OUT: 貸し出し中を示す
     */
    public void classifyCollectionStatusCodeOUT() {
        classifyCollectionStatusCode(LdCDef.CollectionStatus.OUT);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Get the value of collectionStatusCode as the classification of CollectionStatus. <br />
     * 蔵書の状態を示す
     * @return The value of collectionStatusCode as the classification of CollectionStatus. (Nullable)
     */
    public LdCDef.CollectionStatus getCollectionStatusCodeAsCollectionStatus() {
        return LdCDef.CollectionStatus.codeOf(_collectionStatusCode);
    }

    /**
     * Is the value of the column 'collectionStatusCode' 'NOR'? <br />
     * NOR: 通常状態を示す
     * <pre>
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * </pre>
     * @return Determination.
     */
    public boolean isCollectionStatusCodeNOR() {
        LdCDef.CollectionStatus cls = getCollectionStatusCodeAsCollectionStatus();
        return cls != null ? cls.equals(LdCDef.CollectionStatus.NOR) : false;
    }

    /**
     * Is the value of the column 'collectionStatusCode' 'WAT'? <br />
     * WAT: 待ち状態を示す
     * <pre>
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * </pre>
     * @return Determination.
     */
    public boolean isCollectionStatusCodeWAT() {
        LdCDef.CollectionStatus cls = getCollectionStatusCodeAsCollectionStatus();
        return cls != null ? cls.equals(LdCDef.CollectionStatus.WAT) : false;
    }

    /**
     * Is the value of the column 'collectionStatusCode' 'OUT'? <br />
     * OUT: 貸し出し中を示す
     * <pre>
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * </pre>
     * @return Determination.
     */
    public boolean isCollectionStatusCodeOUT() {
        LdCDef.CollectionStatus cls = getCollectionStatusCodeAsCollectionStatus();
        return cls != null ? cls.equals(LdCDef.CollectionStatus.OUT) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Foreign Property = [collection]
    // * * * * * * * * */
    public static final int collection_RELNO = 0;
    public static final String collection_RELKEYS = "COLLECTION_ID:COLLECTION_ID";

    /** COLLECTION as 'collection'. */
    protected LdCollection _parentCollection;

    /**
     * COLLECTION as 'collection'. {without lazy-load}
     * @return The entity of foreign property 'collection'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdCollection getCollection() {
        return _parentCollection;
    }

    /**
     * COLLECTION as 'collection'.
     * @param collection The entity of foreign property 'collection'. (Nullable)
     */
    public void setCollection(LdCollection collection) {
        _parentCollection = collection;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Foreign Property = [collectionStatusLookup]
    // * * * * * * * * */
    public static final int collectionStatusLookup_RELNO = 1;
    public static final String collectionStatusLookup_RELKEYS = "COLLECTION_STATUS_CODE:COLLECTION_STATUS_CODE";

    /** COLLECTION_STATUS_LOOKUP as 'collectionStatusLookup'. */
    protected LdCollectionStatusLookup _parentCollectionStatusLookup;

    /**
     * COLLECTION_STATUS_LOOKUP as 'collectionStatusLookup'. {without lazy-load}
     * @return The entity of foreign property 'collectionStatusLookup'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdCollectionStatusLookup getCollectionStatusLookup() {
        return _parentCollectionStatusLookup;
    }

    /**
     * COLLECTION_STATUS_LOOKUP as 'collectionStatusLookup'.
     * @param collectionStatusLookup The entity of foreign property 'collectionStatusLookup'. (Nullable)
     */
    public void setCollectionStatusLookup(LdCollectionStatusLookup collectionStatusLookup) {
        _parentCollectionStatusLookup = collectionStatusLookup;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================

    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        if (_collectionId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> getModifiedPropertyNames() {
        return _modifiedProperties.getPropertyNames();
    }

    protected EntityModifiedProperties newEntityModifiedProperties() {
        return new EntityModifiedProperties();
    }

    public void clearModifiedPropertyNames() {
        _modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !_modifiedProperties.isEmpty();
    }
    
    // ===================================================================================
    //                                                           Common Column Auto Filter
    //                                                           =========================
    /**
     * Enable common column auto set up. {for after disable because the default is enabled}
     */
    public void enableCommonColumnAutoSetup() {
        _canCommonColumnAutoSetup = true;
    }

    /**
     * Disables auto set-up of common columns.
     */
    public void disableCommonColumnAutoSetup() {
        _canCommonColumnAutoSetup = false;
    }
    
    /**
     * Can the entity set up common column by auto?
     * @return Determination.
     */
    public boolean canCommonColumnAutoSetup() { // for Framework
        return _canCommonColumnAutoSetup;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * If the primary-key of the other is same as this one, returns true.
     * @param other Other entity.
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof LdBsCollectionStatus)) { return false; }
        LdBsCollectionStatus otherEntity = (LdBsCollectionStatus)other;
        if (!helpComparingValue(getCollectionId(), otherEntity.getCollectionId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * Calculates hash-code from primary-key.
     * @return Hash-code from primary-keys.
     */
    public int hashCode() {
        int result = 17;
        if (this.getCollectionId() != null) { result = result + getCollectionId().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getCollectionId());
        sb.append(delimiter).append(getCollectionStatusCode());
        sb.append(delimiter).append(getRUser());
        sb.append(delimiter).append(getRModule());
        sb.append(delimiter).append(getRTimestamp());
        sb.append(delimiter).append(getUUser());
        sb.append(delimiter).append(getUModule());
        sb.append(delimiter).append(getUTimestamp());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {PK : NotNull : INTEGER : FK to COLLECTION} */
    public static final String collectionId_COLUMN = "COLLECTION_ID";

    /**
     * COLLECTION_ID: {PK : NotNull : INTEGER : FK to COLLECTION} <br />
     * @return The value of the column 'COLLECTION_ID'. (Nullable)
     */
    public Integer getCollectionId() {
        return _collectionId;
    }

    /**
     * COLLECTION_ID: {PK : NotNull : INTEGER : FK to COLLECTION} <br />
     * @param collectionId The value of the column 'COLLECTION_ID'. (Nullable)
     */
    public void setCollectionId(Integer collectionId) {
        _modifiedProperties.addPropertyName("collectionId");
        this._collectionId = collectionId;
    }

    /** The column annotation for S2Dao. {NotNull : CHAR(3) : FK to COLLECTION_STATUS_LOOKUP} */
    public static final String collectionStatusCode_COLUMN = "COLLECTION_STATUS_CODE";

    /**
     * COLLECTION_STATUS_CODE: {NotNull : CHAR(3) : FK to COLLECTION_STATUS_LOOKUP} <br />
     * @return The value of the column 'COLLECTION_STATUS_CODE'. (Nullable)
     */
    public String getCollectionStatusCode() {
        return _collectionStatusCode;
    }

    /**
     * COLLECTION_STATUS_CODE: {NotNull : CHAR(3) : FK to COLLECTION_STATUS_LOOKUP} <br />
     * @param collectionStatusCode The value of the column 'COLLECTION_STATUS_CODE'. (Nullable)
     */
    public void setCollectionStatusCode(String collectionStatusCode) {
        _modifiedProperties.addPropertyName("collectionStatusCode");
        this._collectionStatusCode = collectionStatusCode;
    }

    /** The column annotation for S2Dao. {NotNull : VARCHAR(100) : Default=[default-user]} */
    public static final String RUser_COLUMN = "R_USER";

    /**
     * R_USER: {NotNull : VARCHAR(100) : Default=[default-user]} <br />
     * @return The value of the column 'R_USER'. (Nullable)
     */
    public String getRUser() {
        return _rUser;
    }

    /**
     * R_USER: {NotNull : VARCHAR(100) : Default=[default-user]} <br />
     * @param rUser The value of the column 'R_USER'. (Nullable)
     */
    public void setRUser(String rUser) {
        _modifiedProperties.addPropertyName("RUser");
        this._rUser = rUser;
    }

    /** The column annotation for S2Dao. {NotNull : VARCHAR(100) : Default=[default-module]} */
    public static final String RModule_COLUMN = "R_MODULE";

    /**
     * R_MODULE: {NotNull : VARCHAR(100) : Default=[default-module]} <br />
     * @return The value of the column 'R_MODULE'. (Nullable)
     */
    public String getRModule() {
        return _rModule;
    }

    /**
     * R_MODULE: {NotNull : VARCHAR(100) : Default=[default-module]} <br />
     * @param rModule The value of the column 'R_MODULE'. (Nullable)
     */
    public void setRModule(String rModule) {
        _modifiedProperties.addPropertyName("RModule");
        this._rModule = rModule;
    }

    /** The column annotation for S2Dao. {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]} */
    public static final String RTimestamp_COLUMN = "R_TIMESTAMP";

    /**
     * R_TIMESTAMP: {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]} <br />
     * @return The value of the column 'R_TIMESTAMP'. (Nullable)
     */
    public java.sql.Timestamp getRTimestamp() {
        return _rTimestamp;
    }

    /**
     * R_TIMESTAMP: {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]} <br />
     * @param rTimestamp The value of the column 'R_TIMESTAMP'. (Nullable)
     */
    public void setRTimestamp(java.sql.Timestamp rTimestamp) {
        _modifiedProperties.addPropertyName("RTimestamp");
        this._rTimestamp = rTimestamp;
    }

    /** The column annotation for S2Dao. {NotNull : VARCHAR(100) : Default=[default-user]} */
    public static final String UUser_COLUMN = "U_USER";

    /**
     * U_USER: {NotNull : VARCHAR(100) : Default=[default-user]} <br />
     * @return The value of the column 'U_USER'. (Nullable)
     */
    public String getUUser() {
        return _uUser;
    }

    /**
     * U_USER: {NotNull : VARCHAR(100) : Default=[default-user]} <br />
     * @param uUser The value of the column 'U_USER'. (Nullable)
     */
    public void setUUser(String uUser) {
        _modifiedProperties.addPropertyName("UUser");
        this._uUser = uUser;
    }

    /** The column annotation for S2Dao. {NotNull : VARCHAR(100) : Default=[default-module]} */
    public static final String UModule_COLUMN = "U_MODULE";

    /**
     * U_MODULE: {NotNull : VARCHAR(100) : Default=[default-module]} <br />
     * @return The value of the column 'U_MODULE'. (Nullable)
     */
    public String getUModule() {
        return _uModule;
    }

    /**
     * U_MODULE: {NotNull : VARCHAR(100) : Default=[default-module]} <br />
     * @param uModule The value of the column 'U_MODULE'. (Nullable)
     */
    public void setUModule(String uModule) {
        _modifiedProperties.addPropertyName("UModule");
        this._uModule = uModule;
    }

    /** The column annotation for S2Dao. {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]} */
    public static final String UTimestamp_COLUMN = "U_TIMESTAMP";

    /**
     * U_TIMESTAMP: {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]} <br />
     * @return The value of the column 'U_TIMESTAMP'. (Nullable)
     */
    public java.sql.Timestamp getUTimestamp() {
        return _uTimestamp;
    }

    /**
     * U_TIMESTAMP: {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]} <br />
     * @param uTimestamp The value of the column 'U_TIMESTAMP'. (Nullable)
     */
    public void setUTimestamp(java.sql.Timestamp uTimestamp) {
        _modifiedProperties.addPropertyName("UTimestamp");
        this._uTimestamp = uTimestamp;
    }

}

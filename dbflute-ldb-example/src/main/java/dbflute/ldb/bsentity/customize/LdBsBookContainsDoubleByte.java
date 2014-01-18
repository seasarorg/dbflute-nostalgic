/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.customize;

import java.util.*;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;

/**
 * The entity of BookContainsDoubleByte that the type is null. <br />
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
public abstract class LdBsBookContainsDoubleByte implements LdEntity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is BookContainsDoubleByte. */
    public static final String TABLE = "BookContainsDoubleByte";
    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "UTimestamp";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** BOOK_ID: {INTEGER(10,0)} */
    protected Integer _bookId;

    /** BOOK_NAME_WITH_SPACE: {VARCHAR(81,0)} */
    protected String _bookNameWithSpace;

    /** COLLECTION_COUNT: {INTEGER(10,0)} */
    protected Integer _collectionCount;

    /** R_USER: {VARCHAR(100,0)} */
    protected String _rUser;

    /** R_MODULE: {VARCHAR(100,0)} */
    protected String _rModule;

    /** R_TIMESTAMP: {TIMESTAMP(26,6)} */
    protected java.sql.Timestamp _rTimestamp;

    /** U_USER: {VARCHAR(100,0)} */
    protected String _uUser;

    /** U_MODULE: {VARCHAR(100,0)} */
    protected String _uModule;

    /** U_TIMESTAMP: {TIMESTAMP(26,6)} */
    protected java.sql.Timestamp _uTimestamp;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsBookContainsDoubleByte() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "BookContainsDoubleByte";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "bookContainsDoubleByte";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public LdDBMeta getDBMeta() {
        return dbflute.ldb.bsentity.customize.dbmeta.LdBookContainsDoubleByteDbm.getInstance();
    }

    // ===================================================================================
    //                                                          Classification Classifying
    //                                                          ==========================
    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================

    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        return false;
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
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * If the all-column value of the other is same as this one, returns true.
     * @param other Other entity. (Nullable)
     * @return Comparing result. If other is null, returns false.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof LdBsBookContainsDoubleByte)) { return false; }
        final LdBsBookContainsDoubleByte otherEntity = (LdBsBookContainsDoubleByte)other;
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
     * Calculates hash-code from all columns.
     * @return Hash-code from all-columns.
     */
    public int hashCode() {
        int result = 17;
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
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getBookId());
        sb.append(delimiter).append(getBookNameWithSpace());
        sb.append(delimiter).append(getCollectionCount());
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

    /** The column annotation for S2Dao. {INTEGER(10,0)} */
    public static final String bookId_COLUMN = "BOOK_ID";

    /**
     * BOOK_ID: {INTEGER(10,0)} <br />
     * @return The value of the column 'BOOK_ID'. (Nullable)
     */
    public Integer getBookId() {
        return _bookId;
    }

    /**
     * BOOK_ID: {INTEGER(10,0)} <br />
     * @param bookId The value of the column 'BOOK_ID'. (Nullable)
     */
    public void setBookId(Integer bookId) {
        _modifiedProperties.addPropertyName("bookId");
        this._bookId = bookId;
    }

    /** The column annotation for S2Dao. {VARCHAR(81,0)} */
    public static final String bookNameWithSpace_COLUMN = "BOOK_NAME_WITH_SPACE";

    /**
     * BOOK_NAME_WITH_SPACE: {VARCHAR(81,0)} <br />
     * @return The value of the column 'BOOK_NAME_WITH_SPACE'. (Nullable)
     */
    public String getBookNameWithSpace() {
        return _bookNameWithSpace;
    }

    /**
     * BOOK_NAME_WITH_SPACE: {VARCHAR(81,0)} <br />
     * @param bookNameWithSpace The value of the column 'BOOK_NAME_WITH_SPACE'. (Nullable)
     */
    public void setBookNameWithSpace(String bookNameWithSpace) {
        _modifiedProperties.addPropertyName("bookNameWithSpace");
        this._bookNameWithSpace = bookNameWithSpace;
    }

    /** The column annotation for S2Dao. {INTEGER(10,0)} */
    public static final String collectionCount_COLUMN = "COLLECTION_COUNT";

    /**
     * COLLECTION_COUNT: {INTEGER(10,0)} <br />
     * @return The value of the column 'COLLECTION_COUNT'. (Nullable)
     */
    public Integer getCollectionCount() {
        return _collectionCount;
    }

    /**
     * COLLECTION_COUNT: {INTEGER(10,0)} <br />
     * @param collectionCount The value of the column 'COLLECTION_COUNT'. (Nullable)
     */
    public void setCollectionCount(Integer collectionCount) {
        _modifiedProperties.addPropertyName("collectionCount");
        this._collectionCount = collectionCount;
    }

    /** The column annotation for S2Dao. {VARCHAR(100,0)} */
    public static final String RUser_COLUMN = "R_USER";

    /**
     * R_USER: {VARCHAR(100,0)} <br />
     * @return The value of the column 'R_USER'. (Nullable)
     */
    public String getRUser() {
        return _rUser;
    }

    /**
     * R_USER: {VARCHAR(100,0)} <br />
     * @param rUser The value of the column 'R_USER'. (Nullable)
     */
    public void setRUser(String rUser) {
        _modifiedProperties.addPropertyName("RUser");
        this._rUser = rUser;
    }

    /** The column annotation for S2Dao. {VARCHAR(100,0)} */
    public static final String RModule_COLUMN = "R_MODULE";

    /**
     * R_MODULE: {VARCHAR(100,0)} <br />
     * @return The value of the column 'R_MODULE'. (Nullable)
     */
    public String getRModule() {
        return _rModule;
    }

    /**
     * R_MODULE: {VARCHAR(100,0)} <br />
     * @param rModule The value of the column 'R_MODULE'. (Nullable)
     */
    public void setRModule(String rModule) {
        _modifiedProperties.addPropertyName("RModule");
        this._rModule = rModule;
    }

    /** The column annotation for S2Dao. {TIMESTAMP(26,6)} */
    public static final String RTimestamp_COLUMN = "R_TIMESTAMP";

    /**
     * R_TIMESTAMP: {TIMESTAMP(26,6)} <br />
     * @return The value of the column 'R_TIMESTAMP'. (Nullable)
     */
    public java.sql.Timestamp getRTimestamp() {
        return _rTimestamp;
    }

    /**
     * R_TIMESTAMP: {TIMESTAMP(26,6)} <br />
     * @param rTimestamp The value of the column 'R_TIMESTAMP'. (Nullable)
     */
    public void setRTimestamp(java.sql.Timestamp rTimestamp) {
        _modifiedProperties.addPropertyName("RTimestamp");
        this._rTimestamp = rTimestamp;
    }

    /** The column annotation for S2Dao. {VARCHAR(100,0)} */
    public static final String UUser_COLUMN = "U_USER";

    /**
     * U_USER: {VARCHAR(100,0)} <br />
     * @return The value of the column 'U_USER'. (Nullable)
     */
    public String getUUser() {
        return _uUser;
    }

    /**
     * U_USER: {VARCHAR(100,0)} <br />
     * @param uUser The value of the column 'U_USER'. (Nullable)
     */
    public void setUUser(String uUser) {
        _modifiedProperties.addPropertyName("UUser");
        this._uUser = uUser;
    }

    /** The column annotation for S2Dao. {VARCHAR(100,0)} */
    public static final String UModule_COLUMN = "U_MODULE";

    /**
     * U_MODULE: {VARCHAR(100,0)} <br />
     * @return The value of the column 'U_MODULE'. (Nullable)
     */
    public String getUModule() {
        return _uModule;
    }

    /**
     * U_MODULE: {VARCHAR(100,0)} <br />
     * @param uModule The value of the column 'U_MODULE'. (Nullable)
     */
    public void setUModule(String uModule) {
        _modifiedProperties.addPropertyName("UModule");
        this._uModule = uModule;
    }

    /** The column annotation for S2Dao. {TIMESTAMP(26,6)} */
    public static final String UTimestamp_COLUMN = "U_TIMESTAMP";

    /**
     * U_TIMESTAMP: {TIMESTAMP(26,6)} <br />
     * @return The value of the column 'U_TIMESTAMP'. (Nullable)
     */
    public java.sql.Timestamp getUTimestamp() {
        return _uTimestamp;
    }

    /**
     * U_TIMESTAMP: {TIMESTAMP(26,6)} <br />
     * @param uTimestamp The value of the column 'U_TIMESTAMP'. (Nullable)
     */
    public void setUTimestamp(java.sql.Timestamp uTimestamp) {
        _modifiedProperties.addPropertyName("UTimestamp");
        this._uTimestamp = uTimestamp;
    }

}

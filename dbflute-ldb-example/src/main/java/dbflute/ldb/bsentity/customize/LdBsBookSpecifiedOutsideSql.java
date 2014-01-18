/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.customize;

import java.util.*;

import dbflute.ldb.allcommon.LdCDef;
import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;

/**
 * The entity of BookSpecifiedOutsideSql that the type is null. <br />
 * <pre>
 * [primary-key]
 *     BOOK_ID
 * 
 * [column]
 *     BOOK_ID, BOOK_NAME, COLLECTION_COUNT, OUT_OF_USER_SELECT_YN, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
public abstract class LdBsBookSpecifiedOutsideSql implements LdEntityDefinedCommonColumn, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is BookSpecifiedOutsideSql. */
    public static final String TABLE = "BookSpecifiedOutsideSql";
    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "UTimestamp";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** BOOK_ID: {PK : INTEGER(10,0)} */
    protected Integer _bookId;

    /** BOOK_NAME: {VARCHAR(80,0)} */
    protected String _bookName;

    /** COLLECTION_COUNT: {INTEGER(10,0)} */
    protected Integer _collectionCount;

    /** OUT_OF_USER_SELECT_YN: {CHAR(1,0)} */
    protected String _outOfUserSelectYn;

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

    /** Is common column auto set up effective? */
    protected boolean _canCommonColumnAutoSetup = true;
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsBookSpecifiedOutsideSql() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "BookSpecifiedOutsideSql";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "bookSpecifiedOutsideSql";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public LdDBMeta getDBMeta() {
        return dbflute.ldb.bsentity.customize.dbmeta.LdBookSpecifiedOutsideSqlDbm.getInstance();
    }

    // ===================================================================================
    //                                                          Classification Classifying
    //                                                          ==========================
    /**
     * Classify the value of outOfUserSelectYn as the classification of YesNo. <br />
     * はいいいえを示す
     * @param cls The value of outOfUserSelectYn as the classification of YesNo. (Nullable)
     */
    public void classifyOutOfUserSelectYn(LdCDef.YesNo cls) {
        setOutOfUserSelectYn(cls != null ? new String(cls.code()) : null);
    }

    /**
     * Classify the value of outOfUserSelectYn as Yes. <br />
     * はい
     */
    public void classifyOutOfUserSelectYnYes() {
        classifyOutOfUserSelectYn(LdCDef.YesNo.Yes);
    }

    /**
     * Classify the value of outOfUserSelectYn as No. <br />
     * いいえ
     */
    public void classifyOutOfUserSelectYnNo() {
        classifyOutOfUserSelectYn(LdCDef.YesNo.No);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Get the value of outOfUserSelectYn as the classification of YesNo. <br />
     * はいいいえを示す
     * @return The value of outOfUserSelectYn as the classification of YesNo. (Nullable)
     */
    public LdCDef.YesNo getOutOfUserSelectYnAsYesNo() {
        return LdCDef.YesNo.codeOf(_outOfUserSelectYn);
    }

    /**
     * Is the value of the column 'outOfUserSelectYn' 'Yes'? <br />
     * はい
     * <pre>
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * </pre>
     * @return Determination.
     */
    public boolean isOutOfUserSelectYnYes() {
        LdCDef.YesNo cls = getOutOfUserSelectYnAsYesNo();
        return cls != null ? cls.equals(LdCDef.YesNo.Yes) : false;
    }

    /**
     * Is the value of the column 'outOfUserSelectYn' 'No'? <br />
     * いいえ
     * <pre>
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * </pre>
     * @return Determination.
     */
    public boolean isOutOfUserSelectYnNo() {
        LdCDef.YesNo cls = getOutOfUserSelectYnAsYesNo();
        return cls != null ? cls.equals(LdCDef.YesNo.No) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'outOfUserSelectYn' as classification name.
     * @return The value of the column 'outOfUserSelectYn' as classification name. (Nullable)
     */
    public String getOutOfUserSelectYnName() {
        LdCDef.YesNo cls = getOutOfUserSelectYnAsYesNo();
        return cls != null ? cls.name() : null;
    }

    /**
     * Get the value of the column 'outOfUserSelectYn' as classification alias.
     * @return The value of the column 'outOfUserSelectYn' as classification alias. (Nullable)
     */
    public String getOutOfUserSelectYnAlias() {
        LdCDef.YesNo cls = getOutOfUserSelectYnAsYesNo();
        return cls != null ? cls.alias() : null;
    }

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
        if (_bookId == null) { return false; }
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
        if (other == null || !(other instanceof LdBsBookSpecifiedOutsideSql)) { return false; }
        LdBsBookSpecifiedOutsideSql otherEntity = (LdBsBookSpecifiedOutsideSql)other;
        if (!helpComparingValue(getBookId(), otherEntity.getBookId())) { return false; }
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
        if (this.getBookId() != null) { result = result + getBookId().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getBookId());
        sb.append(delimiter).append(getBookName());
        sb.append(delimiter).append(getCollectionCount());
        sb.append(delimiter).append(getOutOfUserSelectYn());
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

    /** The column annotation for S2Dao. {PK : INTEGER(10,0)} */
    public static final String bookId_COLUMN = "BOOK_ID";

    /**
     * BOOK_ID: {PK : INTEGER(10,0)} <br />
     * @return The value of the column 'BOOK_ID'. (Nullable)
     */
    public Integer getBookId() {
        return _bookId;
    }

    /**
     * BOOK_ID: {PK : INTEGER(10,0)} <br />
     * @param bookId The value of the column 'BOOK_ID'. (Nullable)
     */
    public void setBookId(Integer bookId) {
        _modifiedProperties.addPropertyName("bookId");
        this._bookId = bookId;
    }

    /** The column annotation for S2Dao. {VARCHAR(80,0)} */
    public static final String bookName_COLUMN = "BOOK_NAME";

    /**
     * BOOK_NAME: {VARCHAR(80,0)} <br />
     * @return The value of the column 'BOOK_NAME'. (Nullable)
     */
    public String getBookName() {
        return _bookName;
    }

    /**
     * BOOK_NAME: {VARCHAR(80,0)} <br />
     * @param bookName The value of the column 'BOOK_NAME'. (Nullable)
     */
    public void setBookName(String bookName) {
        _modifiedProperties.addPropertyName("bookName");
        this._bookName = bookName;
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

    /** The column annotation for S2Dao. {CHAR(1,0)} */
    public static final String outOfUserSelectYn_COLUMN = "OUT_OF_USER_SELECT_YN";

    /**
     * OUT_OF_USER_SELECT_YN: {CHAR(1,0)} <br />
     * @return The value of the column 'OUT_OF_USER_SELECT_YN'. (Nullable)
     */
    public String getOutOfUserSelectYn() {
        return _outOfUserSelectYn;
    }

    /**
     * OUT_OF_USER_SELECT_YN: {CHAR(1,0)} <br />
     * @param outOfUserSelectYn The value of the column 'OUT_OF_USER_SELECT_YN'. (Nullable)
     */
    public void setOutOfUserSelectYn(String outOfUserSelectYn) {
        _modifiedProperties.addPropertyName("outOfUserSelectYn");
        this._outOfUserSelectYn = outOfUserSelectYn;
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

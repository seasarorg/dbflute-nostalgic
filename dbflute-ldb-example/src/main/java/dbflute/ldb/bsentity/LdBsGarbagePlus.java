/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity;

import java.util.*;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;

/**
 * The entity of GARBAGE_PLUS that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     GARBAGE_MEMO, GARBAGE_TIME, GARBAGE_COUNT, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
public abstract class LdBsGarbagePlus implements LdEntity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is GARBAGE_PLUS. */
    public static final String TABLE = "GARBAGE_PLUS";
    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "UTimestamp";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** GARBAGE_MEMO: {VARCHAR(50)} */
    protected String _garbageMemo;

    /** GARBAGE_TIME: {TIMESTAMP} */
    protected java.sql.Timestamp _garbageTime;

    /** GARBAGE_COUNT: {INTEGER} */
    protected Integer _garbageCount;

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
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsGarbagePlus() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "GARBAGE_PLUS";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "garbagePlus";
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
        if (other == null || !(other instanceof LdBsGarbagePlus)) { return false; }
        final LdBsGarbagePlus otherEntity = (LdBsGarbagePlus)other;
        if (!helpComparingValue(getGarbageMemo(), otherEntity.getGarbageMemo())) { return false; }
        if (!helpComparingValue(getGarbageTime(), otherEntity.getGarbageTime())) { return false; }
        if (!helpComparingValue(getGarbageCount(), otherEntity.getGarbageCount())) { return false; }
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
        if (this.getGarbageMemo() != null) { result = result + this.getGarbageMemo().hashCode(); }
        if (this.getGarbageTime() != null) { result = result + this.getGarbageTime().hashCode(); }
        if (this.getGarbageCount() != null) { result = result + this.getGarbageCount().hashCode(); }
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
        sb.append(delimiter).append(getGarbageMemo());
        sb.append(delimiter).append(getGarbageTime());
        sb.append(delimiter).append(getGarbageCount());
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

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String garbageMemo_COLUMN = "GARBAGE_MEMO";

    /**
     * GARBAGE_MEMO: {VARCHAR(50)} <br />
     * @return The value of the column 'GARBAGE_MEMO'. (Nullable)
     */
    public String getGarbageMemo() {
        return _garbageMemo;
    }

    /**
     * GARBAGE_MEMO: {VARCHAR(50)} <br />
     * @param garbageMemo The value of the column 'GARBAGE_MEMO'. (Nullable)
     */
    public void setGarbageMemo(String garbageMemo) {
        _modifiedProperties.addPropertyName("garbageMemo");
        this._garbageMemo = garbageMemo;
    }

    /** The column annotation for S2Dao. {TIMESTAMP} */
    public static final String garbageTime_COLUMN = "GARBAGE_TIME";

    /**
     * GARBAGE_TIME: {TIMESTAMP} <br />
     * @return The value of the column 'GARBAGE_TIME'. (Nullable)
     */
    public java.sql.Timestamp getGarbageTime() {
        return _garbageTime;
    }

    /**
     * GARBAGE_TIME: {TIMESTAMP} <br />
     * @param garbageTime The value of the column 'GARBAGE_TIME'. (Nullable)
     */
    public void setGarbageTime(java.sql.Timestamp garbageTime) {
        _modifiedProperties.addPropertyName("garbageTime");
        this._garbageTime = garbageTime;
    }

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String garbageCount_COLUMN = "GARBAGE_COUNT";

    /**
     * GARBAGE_COUNT: {INTEGER} <br />
     * @return The value of the column 'GARBAGE_COUNT'. (Nullable)
     */
    public Integer getGarbageCount() {
        return _garbageCount;
    }

    /**
     * GARBAGE_COUNT: {INTEGER} <br />
     * @param garbageCount The value of the column 'GARBAGE_COUNT'. (Nullable)
     */
    public void setGarbageCount(Integer garbageCount) {
        _modifiedProperties.addPropertyName("garbageCount");
        this._garbageCount = garbageCount;
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

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity;

import java.util.*;

import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.exentity.*;

/**
 * The entity of BLACK_ACTION that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     BLACK_ACTION_ID
 * 
 * [column]
 *     BLACK_ACTION_ID, BLACK_LIST_ID, BLACK_ACTION_CODE, BLACK_LEVEL, ACTION_DATE, EVIDENCE_PHOTOGRAPH, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     BLACK_ACTION_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     BLACK_ACTION_LOOKUP, BLACK_LIST
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     blackActionLookup, blackList
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBlackAction implements LdEntityDefinedCommonColumn, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is BLACK_ACTION. */
    public static final String TABLE = "BLACK_ACTION";
    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "UTimestamp";

    /** ID-Annotation */
    public static final String blackActionId_ID = "identity";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** BLACK_ACTION_ID: {PK : ID : NotNull : INTEGER} */
    protected Integer _blackActionId;

    /** BLACK_LIST_ID: {NotNull : INTEGER : FK to BLACK_LIST} */
    protected Integer _blackListId;

    /** BLACK_ACTION_CODE: {NotNull : CHAR(3) : FK to BLACK_ACTION_LOOKUP} */
    protected String _blackActionCode;

    /** BLACK_LEVEL: {NotNull : SMALLINT} */
    protected Integer _blackLevel;

    /** ACTION_DATE: {TIMESTAMP} */
    protected java.sql.Timestamp _actionDate;

    /** EVIDENCE_PHOTOGRAPH: {BLOB} */
    protected byte[] _evidencePhotograph;

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
    public LdBsBlackAction() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "BLACK_ACTION";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "blackAction";
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
    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Foreign Property = [blackActionLookup]
    // * * * * * * * * */
    public static final int blackActionLookup_RELNO = 0;
    public static final String blackActionLookup_RELKEYS = "BLACK_ACTION_CODE:BLACK_ACTION_CODE";

    /** BLACK_ACTION_LOOKUP as 'blackActionLookup'. */
    protected LdBlackActionLookup _parentBlackActionLookup;

    /**
     * BLACK_ACTION_LOOKUP as 'blackActionLookup'. {without lazy-load}
     * @return The entity of foreign property 'blackActionLookup'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdBlackActionLookup getBlackActionLookup() {
        return _parentBlackActionLookup;
    }

    /**
     * BLACK_ACTION_LOOKUP as 'blackActionLookup'.
     * @param blackActionLookup The entity of foreign property 'blackActionLookup'. (Nullable)
     */
    public void setBlackActionLookup(LdBlackActionLookup blackActionLookup) {
        _parentBlackActionLookup = blackActionLookup;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Foreign Property = [blackList]
    // * * * * * * * * */
    public static final int blackList_RELNO = 1;
    public static final String blackList_RELKEYS = "BLACK_LIST_ID:BLACK_LIST_ID";

    /** BLACK_LIST as 'blackList'. */
    protected LdBlackList _parentBlackList;

    /**
     * BLACK_LIST as 'blackList'. {without lazy-load}
     * @return The entity of foreign property 'blackList'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdBlackList getBlackList() {
        return _parentBlackList;
    }

    /**
     * BLACK_LIST as 'blackList'.
     * @param blackList The entity of foreign property 'blackList'. (Nullable)
     */
    public void setBlackList(LdBlackList blackList) {
        _parentBlackList = blackList;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================

    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        if (_blackActionId == null) { return false; }
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
        if (other == null || !(other instanceof LdBsBlackAction)) { return false; }
        LdBsBlackAction otherEntity = (LdBsBlackAction)other;
        if (!helpComparingValue(getBlackActionId(), otherEntity.getBlackActionId())) { return false; }
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
        if (this.getBlackActionId() != null) { result = result + getBlackActionId().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getBlackActionId());
        sb.append(delimiter).append(getBlackListId());
        sb.append(delimiter).append(getBlackActionCode());
        sb.append(delimiter).append(getBlackLevel());
        sb.append(delimiter).append(getActionDate());
        sb.append(delimiter).append(getEvidencePhotograph());
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

    /** The column annotation for S2Dao. {PK : ID : NotNull : INTEGER} */
    public static final String blackActionId_COLUMN = "BLACK_ACTION_ID";

    /**
     * BLACK_ACTION_ID: {PK : ID : NotNull : INTEGER} <br />
     * @return The value of the column 'BLACK_ACTION_ID'. (Nullable)
     */
    public Integer getBlackActionId() {
        return _blackActionId;
    }

    /**
     * BLACK_ACTION_ID: {PK : ID : NotNull : INTEGER} <br />
     * @param blackActionId The value of the column 'BLACK_ACTION_ID'. (Nullable)
     */
    public void setBlackActionId(Integer blackActionId) {
        _modifiedProperties.addPropertyName("blackActionId");
        this._blackActionId = blackActionId;
    }

    /** The column annotation for S2Dao. {NotNull : INTEGER : FK to BLACK_LIST} */
    public static final String blackListId_COLUMN = "BLACK_LIST_ID";

    /**
     * BLACK_LIST_ID: {NotNull : INTEGER : FK to BLACK_LIST} <br />
     * @return The value of the column 'BLACK_LIST_ID'. (Nullable)
     */
    public Integer getBlackListId() {
        return _blackListId;
    }

    /**
     * BLACK_LIST_ID: {NotNull : INTEGER : FK to BLACK_LIST} <br />
     * @param blackListId The value of the column 'BLACK_LIST_ID'. (Nullable)
     */
    public void setBlackListId(Integer blackListId) {
        _modifiedProperties.addPropertyName("blackListId");
        this._blackListId = blackListId;
    }

    /** The column annotation for S2Dao. {NotNull : CHAR(3) : FK to BLACK_ACTION_LOOKUP} */
    public static final String blackActionCode_COLUMN = "BLACK_ACTION_CODE";

    /**
     * BLACK_ACTION_CODE: {NotNull : CHAR(3) : FK to BLACK_ACTION_LOOKUP} <br />
     * @return The value of the column 'BLACK_ACTION_CODE'. (Nullable)
     */
    public String getBlackActionCode() {
        return _blackActionCode;
    }

    /**
     * BLACK_ACTION_CODE: {NotNull : CHAR(3) : FK to BLACK_ACTION_LOOKUP} <br />
     * @param blackActionCode The value of the column 'BLACK_ACTION_CODE'. (Nullable)
     */
    public void setBlackActionCode(String blackActionCode) {
        _modifiedProperties.addPropertyName("blackActionCode");
        this._blackActionCode = blackActionCode;
    }

    /** The column annotation for S2Dao. {NotNull : SMALLINT} */
    public static final String blackLevel_COLUMN = "BLACK_LEVEL";

    /**
     * BLACK_LEVEL: {NotNull : SMALLINT} <br />
     * @return The value of the column 'BLACK_LEVEL'. (Nullable)
     */
    public Integer getBlackLevel() {
        return _blackLevel;
    }

    /**
     * BLACK_LEVEL: {NotNull : SMALLINT} <br />
     * @param blackLevel The value of the column 'BLACK_LEVEL'. (Nullable)
     */
    public void setBlackLevel(Integer blackLevel) {
        _modifiedProperties.addPropertyName("blackLevel");
        this._blackLevel = blackLevel;
    }

    /** The column annotation for S2Dao. {TIMESTAMP} */
    public static final String actionDate_COLUMN = "ACTION_DATE";

    /**
     * ACTION_DATE: {TIMESTAMP} <br />
     * @return The value of the column 'ACTION_DATE'. (Nullable)
     */
    public java.sql.Timestamp getActionDate() {
        return _actionDate;
    }

    /**
     * ACTION_DATE: {TIMESTAMP} <br />
     * @param actionDate The value of the column 'ACTION_DATE'. (Nullable)
     */
    public void setActionDate(java.sql.Timestamp actionDate) {
        _modifiedProperties.addPropertyName("actionDate");
        this._actionDate = actionDate;
    }

    /** The column annotation for S2Dao. {BLOB} */
    public static final String evidencePhotograph_COLUMN = "EVIDENCE_PHOTOGRAPH";

    /**
     * EVIDENCE_PHOTOGRAPH: {BLOB} <br />
     * @return The value of the column 'EVIDENCE_PHOTOGRAPH'. (Nullable)
     */
    public byte[] getEvidencePhotograph() {
        return _evidencePhotograph;
    }

    /**
     * EVIDENCE_PHOTOGRAPH: {BLOB} <br />
     * @param evidencePhotograph The value of the column 'EVIDENCE_PHOTOGRAPH'. (Nullable)
     */
    public void setEvidencePhotograph(byte[] evidencePhotograph) {
        _modifiedProperties.addPropertyName("evidencePhotograph");
        this._evidencePhotograph = evidencePhotograph;
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

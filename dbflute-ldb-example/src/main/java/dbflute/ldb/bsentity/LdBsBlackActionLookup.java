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
 * The entity of BLACK_ACTION_LOOKUP that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     BLACK_ACTION_CODE
 * 
 * [column]
 *     BLACK_ACTION_CODE, BLACK_ACTION_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     BLACK_ACTION
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     blackActionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBlackActionLookup implements LdEntityDefinedCommonColumn, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is BLACK_ACTION_LOOKUP. */
    public static final String TABLE = "BLACK_ACTION_LOOKUP";
    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "UTimestamp";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** BLACK_ACTION_CODE: {PK : NotNull : CHAR(3)} */
    protected String _blackActionCode;

    /** BLACK_ACTION_NAME: {NotNull : VARCHAR(80)} */
    protected String _blackActionName;

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
    public LdBsBlackActionLookup() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "BLACK_ACTION_LOOKUP";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "blackActionLookup";
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
    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Referrer Property = [blackActionList]
    // * * * * * * * * */
    /** BLACK_ACTION as 'blackActionList'. */
    protected List<LdBlackAction> _childrenBlackActionList;

    /**
     * BLACK_ACTION as 'blackActionList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'blackActionList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<LdBlackAction> getBlackActionList() {
        if (_childrenBlackActionList == null) { _childrenBlackActionList = new ArrayList<LdBlackAction>(); }
        return _childrenBlackActionList;
    }

    /**
     * BLACK_ACTION as 'blackActionList'.
     * @param blackActionList The entity list of referrer property 'blackActionList'. (Nullable)
     */
    public void setBlackActionList(List<LdBlackAction> blackActionList) {
        _childrenBlackActionList = blackActionList;
    }


    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        if (_blackActionCode == null) { return false; }
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
        if (other == null || !(other instanceof LdBsBlackActionLookup)) { return false; }
        LdBsBlackActionLookup otherEntity = (LdBsBlackActionLookup)other;
        if (!helpComparingValue(getBlackActionCode(), otherEntity.getBlackActionCode())) { return false; }
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
        if (this.getBlackActionCode() != null) { result = result + getBlackActionCode().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getBlackActionCode());
        sb.append(delimiter).append(getBlackActionName());
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

    /** The column annotation for S2Dao. {PK : NotNull : CHAR(3)} */
    public static final String blackActionCode_COLUMN = "BLACK_ACTION_CODE";

    /**
     * BLACK_ACTION_CODE: {PK : NotNull : CHAR(3)} <br />
     * @return The value of the column 'BLACK_ACTION_CODE'. (Nullable)
     */
    public String getBlackActionCode() {
        return _blackActionCode;
    }

    /**
     * BLACK_ACTION_CODE: {PK : NotNull : CHAR(3)} <br />
     * @param blackActionCode The value of the column 'BLACK_ACTION_CODE'. (Nullable)
     */
    public void setBlackActionCode(String blackActionCode) {
        _modifiedProperties.addPropertyName("blackActionCode");
        this._blackActionCode = blackActionCode;
    }

    /** The column annotation for S2Dao. {NotNull : VARCHAR(80)} */
    public static final String blackActionName_COLUMN = "BLACK_ACTION_NAME";

    /**
     * BLACK_ACTION_NAME: {NotNull : VARCHAR(80)} <br />
     * @return The value of the column 'BLACK_ACTION_NAME'. (Nullable)
     */
    public String getBlackActionName() {
        return _blackActionName;
    }

    /**
     * BLACK_ACTION_NAME: {NotNull : VARCHAR(80)} <br />
     * @param blackActionName The value of the column 'BLACK_ACTION_NAME'. (Nullable)
     */
    public void setBlackActionName(String blackActionName) {
        _modifiedProperties.addPropertyName("blackActionName");
        this._blackActionName = blackActionName;
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

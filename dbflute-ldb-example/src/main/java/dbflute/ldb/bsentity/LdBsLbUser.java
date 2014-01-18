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
 * The entity of LB_USER that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     LB_USER_ID
 * 
 * [column]
 *     LB_USER_ID, LB_USER_NAME, USER_PASSWORD, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     LB_USER_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     BLACK_LIST(AsOne)
 * 
 * [referrer-table]
 *     LIBRARY_USER, BLACK_LIST
 * 
 * [foreign-property]
 *     blackListAsOne
 * 
 * [referrer-property]
 *     libraryUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLbUser implements LdEntityDefinedCommonColumn, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is LB_USER. */
    public static final String TABLE = "LB_USER";
    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "UTimestamp";

    /** ID-Annotation */
    public static final String lbUserId_ID = "identity";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** LB_USER_ID: {PK : ID : NotNull : INTEGER} */
    protected Integer _lbUserId;

    /** LB_USER_NAME: {NotNull : VARCHAR(80)} */
    protected String _lbUserName;

    /** USER_PASSWORD: {NotNull : VARCHAR(50)} */
    protected String _userPassword;

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
    public LdBsLbUser() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "LB_USER";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "lbUser";
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
    //   Foreign Property = [blackListAsOne]
    // * * * * * * * * */
    public static final int blackListAsOne_RELNO = 0;
    public static final String blackListAsOne_RELKEYS = "LB_USER_ID:LB_USER_ID";
    
    /** BLACK_LIST as 'blackListAsOne'. */
    protected LdBlackList _childrenblackListAsOne;

    /**
     * BLACK_LIST as 'blackListAsOne'. {without lazy-load} <br />
     * @return the entity of foreign property(referrer-as-one) 'blackListAsOne'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdBlackList getBlackListAsOne() {
        return _childrenblackListAsOne;
    }

    /**
     * BLACK_LIST as 'blackListAsOne'.
     * @param blackListAsOne The entity of foreign property(referrer-as-one) 'blackListAsOne'. (Nullable)
     */
    public void setBlackListAsOne(LdBlackList blackListAsOne) {
        _childrenblackListAsOne = blackListAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Referrer Property = [libraryUserList]
    // * * * * * * * * */
    /** LIBRARY_USER as 'libraryUserList'. */
    protected List<LdLibraryUser> _childrenLibraryUserList;

    /**
     * LIBRARY_USER as 'libraryUserList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'libraryUserList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<LdLibraryUser> getLibraryUserList() {
        if (_childrenLibraryUserList == null) { _childrenLibraryUserList = new ArrayList<LdLibraryUser>(); }
        return _childrenLibraryUserList;
    }

    /**
     * LIBRARY_USER as 'libraryUserList'.
     * @param libraryUserList The entity list of referrer property 'libraryUserList'. (Nullable)
     */
    public void setLibraryUserList(List<LdLibraryUser> libraryUserList) {
        _childrenLibraryUserList = libraryUserList;
    }


    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        if (_lbUserId == null) { return false; }
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
        if (other == null || !(other instanceof LdBsLbUser)) { return false; }
        LdBsLbUser otherEntity = (LdBsLbUser)other;
        if (!helpComparingValue(getLbUserId(), otherEntity.getLbUserId())) { return false; }
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
        if (this.getLbUserId() != null) { result = result + getLbUserId().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getLbUserId());
        sb.append(delimiter).append(getLbUserName());
        sb.append(delimiter).append(getUserPassword());
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
    public static final String lbUserId_COLUMN = "LB_USER_ID";

    /**
     * LB_USER_ID: {PK : ID : NotNull : INTEGER} <br />
     * @return The value of the column 'LB_USER_ID'. (Nullable)
     */
    public Integer getLbUserId() {
        return _lbUserId;
    }

    /**
     * LB_USER_ID: {PK : ID : NotNull : INTEGER} <br />
     * @param lbUserId The value of the column 'LB_USER_ID'. (Nullable)
     */
    public void setLbUserId(Integer lbUserId) {
        _modifiedProperties.addPropertyName("lbUserId");
        this._lbUserId = lbUserId;
    }

    /** The column annotation for S2Dao. {NotNull : VARCHAR(80)} */
    public static final String lbUserName_COLUMN = "LB_USER_NAME";

    /**
     * LB_USER_NAME: {NotNull : VARCHAR(80)} <br />
     * @return The value of the column 'LB_USER_NAME'. (Nullable)
     */
    public String getLbUserName() {
        return _lbUserName;
    }

    /**
     * LB_USER_NAME: {NotNull : VARCHAR(80)} <br />
     * @param lbUserName The value of the column 'LB_USER_NAME'. (Nullable)
     */
    public void setLbUserName(String lbUserName) {
        _modifiedProperties.addPropertyName("lbUserName");
        this._lbUserName = lbUserName;
    }

    /** The column annotation for S2Dao. {NotNull : VARCHAR(50)} */
    public static final String userPassword_COLUMN = "USER_PASSWORD";

    /**
     * USER_PASSWORD: {NotNull : VARCHAR(50)} <br />
     * @return The value of the column 'USER_PASSWORD'. (Nullable)
     */
    public String getUserPassword() {
        return _userPassword;
    }

    /**
     * USER_PASSWORD: {NotNull : VARCHAR(50)} <br />
     * @param userPassword The value of the column 'USER_PASSWORD'. (Nullable)
     */
    public void setUserPassword(String userPassword) {
        _modifiedProperties.addPropertyName("userPassword");
        this._userPassword = userPassword;
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

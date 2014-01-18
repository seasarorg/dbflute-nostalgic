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
 * The entity of LIBRARY_USER that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, LB_USER_ID
 * 
 * [column]
 *     LIBRARY_ID, LB_USER_ID, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LB_USER, LIBRARY
 * 
 * [referrer-table]
 *     LENDING, LENDING_COLLECTION
 * 
 * [foreign-property]
 *     lbUser, library
 * 
 * [referrer-property]
 *     lendingList, lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLibraryUser implements LdEntityDefinedCommonColumn, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is LIBRARY_USER. */
    public static final String TABLE = "LIBRARY_USER";
    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "UTimestamp";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** LIBRARY_ID: {PK : NotNull : SMALLINT : FK to LIBRARY} */
    protected Integer _libraryId;

    /** LB_USER_ID: {PK : NotNull : INTEGER : FK to LB_USER} */
    protected Integer _lbUserId;

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
    public LdBsLibraryUser() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "LIBRARY_USER";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "libraryUser";
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
    //   Foreign Property = [lbUser]
    // * * * * * * * * */
    public static final int lbUser_RELNO = 0;
    public static final String lbUser_RELKEYS = "LB_USER_ID:LB_USER_ID";

    /** LB_USER as 'lbUser'. */
    protected LdLbUser _parentLbUser;

    /**
     * LB_USER as 'lbUser'. {without lazy-load}
     * @return The entity of foreign property 'lbUser'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdLbUser getLbUser() {
        return _parentLbUser;
    }

    /**
     * LB_USER as 'lbUser'.
     * @param lbUser The entity of foreign property 'lbUser'. (Nullable)
     */
    public void setLbUser(LdLbUser lbUser) {
        _parentLbUser = lbUser;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Foreign Property = [library]
    // * * * * * * * * */
    public static final int library_RELNO = 1;
    public static final String library_RELKEYS = "LIBRARY_ID:LIBRARY_ID";

    /** LIBRARY as 'library'. */
    protected LdLibrary _parentLibrary;

    /**
     * LIBRARY as 'library'. {without lazy-load}
     * @return The entity of foreign property 'library'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdLibrary getLibrary() {
        return _parentLibrary;
    }

    /**
     * LIBRARY as 'library'.
     * @param library The entity of foreign property 'library'. (Nullable)
     */
    public void setLibrary(LdLibrary library) {
        _parentLibrary = library;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Referrer Property = [lendingList]
    // * * * * * * * * */
    /** LENDING as 'lendingList'. */
    protected List<LdLending> _childrenLendingList;

    /**
     * LENDING as 'lendingList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'lendingList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<LdLending> getLendingList() {
        if (_childrenLendingList == null) { _childrenLendingList = new ArrayList<LdLending>(); }
        return _childrenLendingList;
    }

    /**
     * LENDING as 'lendingList'.
     * @param lendingList The entity list of referrer property 'lendingList'. (Nullable)
     */
    public void setLendingList(List<LdLending> lendingList) {
        _childrenLendingList = lendingList;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Referrer Property = [lendingCollectionList]
    // * * * * * * * * */
    /** LENDING_COLLECTION as 'lendingCollectionList'. */
    protected List<LdLendingCollection> _childrenLendingCollectionList;

    /**
     * LENDING_COLLECTION as 'lendingCollectionList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'lendingCollectionList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<LdLendingCollection> getLendingCollectionList() {
        if (_childrenLendingCollectionList == null) { _childrenLendingCollectionList = new ArrayList<LdLendingCollection>(); }
        return _childrenLendingCollectionList;
    }

    /**
     * LENDING_COLLECTION as 'lendingCollectionList'.
     * @param lendingCollectionList The entity list of referrer property 'lendingCollectionList'. (Nullable)
     */
    public void setLendingCollectionList(List<LdLendingCollection> lendingCollectionList) {
        _childrenLendingCollectionList = lendingCollectionList;
    }


    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        if (_libraryId == null) { return false; }
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
        if (other == null || !(other instanceof LdBsLibraryUser)) { return false; }
        LdBsLibraryUser otherEntity = (LdBsLibraryUser)other;
        if (!helpComparingValue(getLibraryId(), otherEntity.getLibraryId())) { return false; }
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
        if (this.getLibraryId() != null) { result = result + getLibraryId().hashCode(); }
        if (this.getLbUserId() != null) { result = result + getLbUserId().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getLibraryId());
        sb.append(delimiter).append(getLbUserId());
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

    /** The column annotation for S2Dao. {PK : NotNull : SMALLINT : FK to LIBRARY} */
    public static final String libraryId_COLUMN = "LIBRARY_ID";

    /**
     * LIBRARY_ID: {PK : NotNull : SMALLINT : FK to LIBRARY} <br />
     * @return The value of the column 'LIBRARY_ID'. (Nullable)
     */
    public Integer getLibraryId() {
        return _libraryId;
    }

    /**
     * LIBRARY_ID: {PK : NotNull : SMALLINT : FK to LIBRARY} <br />
     * @param libraryId The value of the column 'LIBRARY_ID'. (Nullable)
     */
    public void setLibraryId(Integer libraryId) {
        _modifiedProperties.addPropertyName("libraryId");
        this._libraryId = libraryId;
    }

    /** The column annotation for S2Dao. {PK : NotNull : INTEGER : FK to LB_USER} */
    public static final String lbUserId_COLUMN = "LB_USER_ID";

    /**
     * LB_USER_ID: {PK : NotNull : INTEGER : FK to LB_USER} <br />
     * @return The value of the column 'LB_USER_ID'. (Nullable)
     */
    public Integer getLbUserId() {
        return _lbUserId;
    }

    /**
     * LB_USER_ID: {PK : NotNull : INTEGER : FK to LB_USER} <br />
     * @param lbUserId The value of the column 'LB_USER_ID'. (Nullable)
     */
    public void setLbUserId(Integer lbUserId) {
        _modifiedProperties.addPropertyName("lbUserId");
        this._lbUserId = lbUserId;
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

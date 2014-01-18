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
 * The entity of LIBRARY that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     LIBRARY_ID
 * 
 * [column]
 *     LIBRARY_ID, LIBRARY_NAME, LIBRARY_TYPE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     LIBRARY_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     LIBRARY_TYPE_LOOKUP, NEXT_LIBRARY(AsNext), LIBRARY_USER(AsUser)
 * 
 * [referrer-table]
 *     COLLECTION, LIBRARY_USER, NEXT_LIBRARY
 * 
 * [foreign-property]
 *     libraryTypeLookup, nextLibraryAsNext, libraryUserAsUser
 * 
 * [referrer-property]
 *     collectionList, libraryUserList, nextLibraryByNextIdList, nextLibraryByBaseIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsLibrary implements LdEntityDefinedCommonColumn, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is LIBRARY. */
    public static final String TABLE = "LIBRARY";
    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "UTimestamp";

    /** ID-Annotation */
    public static final String libraryId_ID = "identity";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** LIBRARY_ID: {PK : ID : NotNull : SMALLINT : FK to NEXT_LIBRARY} */
    protected Integer _libraryId;

    /** LIBRARY_NAME: {UQ : NotNull : VARCHAR(80)} */
    protected String _libraryName;

    /** LIBRARY_TYPE_CODE: {NotNull : CHAR(3) : FK to LIBRARY_TYPE_LOOKUP} */
    protected String _libraryTypeCode;

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
    public LdBsLibrary() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "LIBRARY";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "library";
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
    //   Foreign Property = [libraryTypeLookup]
    // * * * * * * * * */
    public static final int libraryTypeLookup_RELNO = 0;
    public static final String libraryTypeLookup_RELKEYS = "LIBRARY_TYPE_CODE:LIBRARY_TYPE_CODE";

    /** LIBRARY_TYPE_LOOKUP as 'libraryTypeLookup'. */
    protected LdLibraryTypeLookup _parentLibraryTypeLookup;

    /**
     * LIBRARY_TYPE_LOOKUP as 'libraryTypeLookup'. {without lazy-load}
     * @return The entity of foreign property 'libraryTypeLookup'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdLibraryTypeLookup getLibraryTypeLookup() {
        return _parentLibraryTypeLookup;
    }

    /**
     * LIBRARY_TYPE_LOOKUP as 'libraryTypeLookup'.
     * @param libraryTypeLookup The entity of foreign property 'libraryTypeLookup'. (Nullable)
     */
    public void setLibraryTypeLookup(LdLibraryTypeLookup libraryTypeLookup) {
        _parentLibraryTypeLookup = libraryTypeLookup;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Foreign Property = [nextLibraryAsNext]
    // * * * * * * * * */
    public static final int nextLibraryAsNext_RELNO = 1;
    public static final String nextLibraryAsNext_RELKEYS = "LIBRARY_ID:LIBRARY_ID";

    /** NEXT_LIBRARY as 'nextLibraryAsNext'. */
    protected LdNextLibrary _parentNextLibraryAsNext;

    /**
     * NEXT_LIBRARY as 'nextLibraryAsNext'. {without lazy-load}
     * @return The entity of foreign property 'nextLibraryAsNext'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdNextLibrary getNextLibraryAsNext() {
        return _parentNextLibraryAsNext;
    }

    /**
     * NEXT_LIBRARY as 'nextLibraryAsNext'.
     * @param nextLibraryAsNext The entity of foreign property 'nextLibraryAsNext'. (Nullable)
     */
    public void setNextLibraryAsNext(LdNextLibrary nextLibraryAsNext) {
        _parentNextLibraryAsNext = nextLibraryAsNext;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Foreign Property = [libraryUserAsUser]
    // * * * * * * * * */
    public static final int libraryUserAsUser_RELNO = 2;
    public static final String libraryUserAsUser_RELKEYS = "LIBRARY_ID:LIBRARY_ID";

    /** LIBRARY_USER as 'libraryUserAsUser'. */
    protected LdLibraryUser _parentLibraryUserAsUser;

    /**
     * LIBRARY_USER as 'libraryUserAsUser'. {without lazy-load}
     * @return The entity of foreign property 'libraryUserAsUser'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdLibraryUser getLibraryUserAsUser() {
        return _parentLibraryUserAsUser;
    }

    /**
     * LIBRARY_USER as 'libraryUserAsUser'.
     * @param libraryUserAsUser The entity of foreign property 'libraryUserAsUser'. (Nullable)
     */
    public void setLibraryUserAsUser(LdLibraryUser libraryUserAsUser) {
        _parentLibraryUserAsUser = libraryUserAsUser;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Referrer Property = [collectionList]
    // * * * * * * * * */
    /** COLLECTION as 'collectionList'. */
    protected List<LdCollection> _childrenCollectionList;

    /**
     * COLLECTION as 'collectionList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'collectionList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<LdCollection> getCollectionList() {
        if (_childrenCollectionList == null) { _childrenCollectionList = new ArrayList<LdCollection>(); }
        return _childrenCollectionList;
    }

    /**
     * COLLECTION as 'collectionList'.
     * @param collectionList The entity list of referrer property 'collectionList'. (Nullable)
     */
    public void setCollectionList(List<LdCollection> collectionList) {
        _childrenCollectionList = collectionList;
    }

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

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Referrer Property = [nextLibraryByNextIdList]
    // * * * * * * * * */
    /** NEXT_LIBRARY as 'nextLibraryByNextIdList'. */
    protected List<LdNextLibrary> _childrenNextLibraryByNextIdList;

    /**
     * NEXT_LIBRARY as 'nextLibraryByNextIdList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'nextLibraryByNextIdList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<LdNextLibrary> getNextLibraryByNextIdList() {
        if (_childrenNextLibraryByNextIdList == null) { _childrenNextLibraryByNextIdList = new ArrayList<LdNextLibrary>(); }
        return _childrenNextLibraryByNextIdList;
    }

    /**
     * NEXT_LIBRARY as 'nextLibraryByNextIdList'.
     * @param nextLibraryByNextIdList The entity list of referrer property 'nextLibraryByNextIdList'. (Nullable)
     */
    public void setNextLibraryByNextIdList(List<LdNextLibrary> nextLibraryByNextIdList) {
        _childrenNextLibraryByNextIdList = nextLibraryByNextIdList;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Referrer Property = [nextLibraryByBaseIdList]
    // * * * * * * * * */
    /** NEXT_LIBRARY as 'nextLibraryByBaseIdList'. */
    protected List<LdNextLibrary> _childrenNextLibraryByBaseIdList;

    /**
     * NEXT_LIBRARY as 'nextLibraryByBaseIdList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'nextLibraryByBaseIdList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<LdNextLibrary> getNextLibraryByBaseIdList() {
        if (_childrenNextLibraryByBaseIdList == null) { _childrenNextLibraryByBaseIdList = new ArrayList<LdNextLibrary>(); }
        return _childrenNextLibraryByBaseIdList;
    }

    /**
     * NEXT_LIBRARY as 'nextLibraryByBaseIdList'.
     * @param nextLibraryByBaseIdList The entity list of referrer property 'nextLibraryByBaseIdList'. (Nullable)
     */
    public void setNextLibraryByBaseIdList(List<LdNextLibrary> nextLibraryByBaseIdList) {
        _childrenNextLibraryByBaseIdList = nextLibraryByBaseIdList;
    }


    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        if (_libraryId == null) { return false; }
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
        if (other == null || !(other instanceof LdBsLibrary)) { return false; }
        LdBsLibrary otherEntity = (LdBsLibrary)other;
        if (!helpComparingValue(getLibraryId(), otherEntity.getLibraryId())) { return false; }
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
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getLibraryId());
        sb.append(delimiter).append(getLibraryName());
        sb.append(delimiter).append(getLibraryTypeCode());
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

    /** The column annotation for S2Dao. {PK : ID : NotNull : SMALLINT : FK to NEXT_LIBRARY} */
    public static final String libraryId_COLUMN = "LIBRARY_ID";

    /**
     * LIBRARY_ID: {PK : ID : NotNull : SMALLINT : FK to NEXT_LIBRARY} <br />
     * @return The value of the column 'LIBRARY_ID'. (Nullable)
     */
    public Integer getLibraryId() {
        return _libraryId;
    }

    /**
     * LIBRARY_ID: {PK : ID : NotNull : SMALLINT : FK to NEXT_LIBRARY} <br />
     * @param libraryId The value of the column 'LIBRARY_ID'. (Nullable)
     */
    public void setLibraryId(Integer libraryId) {
        _modifiedProperties.addPropertyName("libraryId");
        this._libraryId = libraryId;
    }

    /** The column annotation for S2Dao. {UQ : NotNull : VARCHAR(80)} */
    public static final String libraryName_COLUMN = "LIBRARY_NAME";

    /**
     * LIBRARY_NAME: {UQ : NotNull : VARCHAR(80)} <br />
     * @return The value of the column 'LIBRARY_NAME'. (Nullable)
     */
    public String getLibraryName() {
        return _libraryName;
    }

    /**
     * LIBRARY_NAME: {UQ : NotNull : VARCHAR(80)} <br />
     * @param libraryName The value of the column 'LIBRARY_NAME'. (Nullable)
     */
    public void setLibraryName(String libraryName) {
        _modifiedProperties.addPropertyName("libraryName");
        this._libraryName = libraryName;
    }

    /** The column annotation for S2Dao. {NotNull : CHAR(3) : FK to LIBRARY_TYPE_LOOKUP} */
    public static final String libraryTypeCode_COLUMN = "LIBRARY_TYPE_CODE";

    /**
     * LIBRARY_TYPE_CODE: {NotNull : CHAR(3) : FK to LIBRARY_TYPE_LOOKUP} <br />
     * @return The value of the column 'LIBRARY_TYPE_CODE'. (Nullable)
     */
    public String getLibraryTypeCode() {
        return _libraryTypeCode;
    }

    /**
     * LIBRARY_TYPE_CODE: {NotNull : CHAR(3) : FK to LIBRARY_TYPE_LOOKUP} <br />
     * @param libraryTypeCode The value of the column 'LIBRARY_TYPE_CODE'. (Nullable)
     */
    public void setLibraryTypeCode(String libraryTypeCode) {
        _modifiedProperties.addPropertyName("libraryTypeCode");
        this._libraryTypeCode = libraryTypeCode;
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

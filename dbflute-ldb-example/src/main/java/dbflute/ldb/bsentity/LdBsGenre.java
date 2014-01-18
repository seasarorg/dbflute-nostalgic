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
 * The entity of GENRE that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     GENRE_CODE
 * 
 * [column]
 *     GENRE_CODE, GENRE_NAME, HIERARCHY_LEVEL, HIERARCHY_ORDER, PARENT_GENRE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     GENRE
 * 
 * [referrer-table]
 *     BOOK, GENRE
 * 
 * [foreign-property]
 *     genreSelf
 * 
 * [referrer-property]
 *     bookList, genreSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsGenre implements LdEntityDefinedCommonColumn, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is GENRE. */
    public static final String TABLE = "GENRE";
    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "UTimestamp";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** GENRE_CODE: {PK : NotNull : VARCHAR(24)} */
    protected String _genreCode;

    /** GENRE_NAME: {NotNull : VARCHAR(80)} */
    protected String _genreName;

    /** HIERARCHY_LEVEL: {NotNull : NUMERIC(9)} */
    protected Integer _hierarchyLevel;

    /** HIERARCHY_ORDER: {NotNull : NUMERIC(10)} */
    protected Long _hierarchyOrder;

    /** PARENT_GENRE_CODE: {VARCHAR(24) : FK to GENRE} */
    protected String _parentGenreCode;

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
    public LdBsGenre() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "GENRE";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "genre";
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
    //   Foreign Property = [genreSelf]
    // * * * * * * * * */
    public static final int genreSelf_RELNO = 0;
    public static final String genreSelf_RELKEYS = "PARENT_GENRE_CODE:GENRE_CODE";

    /** GENRE as 'genreSelf'. */
    protected LdGenre _parentGenreSelf;

    /**
     * GENRE as 'genreSelf'. {without lazy-load}
     * @return The entity of foreign property 'genreSelf'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdGenre getGenreSelf() {
        return _parentGenreSelf;
    }

    /**
     * GENRE as 'genreSelf'.
     * @param genreSelf The entity of foreign property 'genreSelf'. (Nullable)
     */
    public void setGenreSelf(LdGenre genreSelf) {
        _parentGenreSelf = genreSelf;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Referrer Property = [bookList]
    // * * * * * * * * */
    /** BOOK as 'bookList'. */
    protected List<LdBook> _childrenBookList;

    /**
     * BOOK as 'bookList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'bookList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<LdBook> getBookList() {
        if (_childrenBookList == null) { _childrenBookList = new ArrayList<LdBook>(); }
        return _childrenBookList;
    }

    /**
     * BOOK as 'bookList'.
     * @param bookList The entity list of referrer property 'bookList'. (Nullable)
     */
    public void setBookList(List<LdBook> bookList) {
        _childrenBookList = bookList;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Referrer Property = [genreSelfList]
    // * * * * * * * * */
    /** GENRE as 'genreSelfList'. */
    protected List<LdGenre> _childrenGenreSelfList;

    /**
     * GENRE as 'genreSelfList'. {without lazy-load} <br />
     * @return The entity list of referrer property 'genreSelfList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<LdGenre> getGenreSelfList() {
        if (_childrenGenreSelfList == null) { _childrenGenreSelfList = new ArrayList<LdGenre>(); }
        return _childrenGenreSelfList;
    }

    /**
     * GENRE as 'genreSelfList'.
     * @param genreSelfList The entity list of referrer property 'genreSelfList'. (Nullable)
     */
    public void setGenreSelfList(List<LdGenre> genreSelfList) {
        _childrenGenreSelfList = genreSelfList;
    }


    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        if (_genreCode == null) { return false; }
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
        if (other == null || !(other instanceof LdBsGenre)) { return false; }
        LdBsGenre otherEntity = (LdBsGenre)other;
        if (!helpComparingValue(getGenreCode(), otherEntity.getGenreCode())) { return false; }
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
        if (this.getGenreCode() != null) { result = result + getGenreCode().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getGenreCode());
        sb.append(delimiter).append(getGenreName());
        sb.append(delimiter).append(getHierarchyLevel());
        sb.append(delimiter).append(getHierarchyOrder());
        sb.append(delimiter).append(getParentGenreCode());
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

    /** The column annotation for S2Dao. {PK : NotNull : VARCHAR(24)} */
    public static final String genreCode_COLUMN = "GENRE_CODE";

    /**
     * GENRE_CODE: {PK : NotNull : VARCHAR(24)} <br />
     * @return The value of the column 'GENRE_CODE'. (Nullable)
     */
    public String getGenreCode() {
        return _genreCode;
    }

    /**
     * GENRE_CODE: {PK : NotNull : VARCHAR(24)} <br />
     * @param genreCode The value of the column 'GENRE_CODE'. (Nullable)
     */
    public void setGenreCode(String genreCode) {
        _modifiedProperties.addPropertyName("genreCode");
        this._genreCode = genreCode;
    }

    /** The column annotation for S2Dao. {NotNull : VARCHAR(80)} */
    public static final String genreName_COLUMN = "GENRE_NAME";

    /**
     * GENRE_NAME: {NotNull : VARCHAR(80)} <br />
     * @return The value of the column 'GENRE_NAME'. (Nullable)
     */
    public String getGenreName() {
        return _genreName;
    }

    /**
     * GENRE_NAME: {NotNull : VARCHAR(80)} <br />
     * @param genreName The value of the column 'GENRE_NAME'. (Nullable)
     */
    public void setGenreName(String genreName) {
        _modifiedProperties.addPropertyName("genreName");
        this._genreName = genreName;
    }

    /** The column annotation for S2Dao. {NotNull : NUMERIC(9)} */
    public static final String hierarchyLevel_COLUMN = "HIERARCHY_LEVEL";

    /**
     * HIERARCHY_LEVEL: {NotNull : NUMERIC(9)} <br />
     * @return The value of the column 'HIERARCHY_LEVEL'. (Nullable)
     */
    public Integer getHierarchyLevel() {
        return _hierarchyLevel;
    }

    /**
     * HIERARCHY_LEVEL: {NotNull : NUMERIC(9)} <br />
     * @param hierarchyLevel The value of the column 'HIERARCHY_LEVEL'. (Nullable)
     */
    public void setHierarchyLevel(Integer hierarchyLevel) {
        _modifiedProperties.addPropertyName("hierarchyLevel");
        this._hierarchyLevel = hierarchyLevel;
    }

    /** The column annotation for S2Dao. {NotNull : NUMERIC(10)} */
    public static final String hierarchyOrder_COLUMN = "HIERARCHY_ORDER";

    /**
     * HIERARCHY_ORDER: {NotNull : NUMERIC(10)} <br />
     * @return The value of the column 'HIERARCHY_ORDER'. (Nullable)
     */
    public Long getHierarchyOrder() {
        return _hierarchyOrder;
    }

    /**
     * HIERARCHY_ORDER: {NotNull : NUMERIC(10)} <br />
     * @param hierarchyOrder The value of the column 'HIERARCHY_ORDER'. (Nullable)
     */
    public void setHierarchyOrder(Long hierarchyOrder) {
        _modifiedProperties.addPropertyName("hierarchyOrder");
        this._hierarchyOrder = hierarchyOrder;
    }

    /** The column annotation for S2Dao. {VARCHAR(24) : FK to GENRE} */
    public static final String parentGenreCode_COLUMN = "PARENT_GENRE_CODE";

    /**
     * PARENT_GENRE_CODE: {VARCHAR(24) : FK to GENRE} <br />
     * @return The value of the column 'PARENT_GENRE_CODE'. (Nullable)
     */
    public String getParentGenreCode() {
        return _parentGenreCode;
    }

    /**
     * PARENT_GENRE_CODE: {VARCHAR(24) : FK to GENRE} <br />
     * @param parentGenreCode The value of the column 'PARENT_GENRE_CODE'. (Nullable)
     */
    public void setParentGenreCode(String parentGenreCode) {
        _modifiedProperties.addPropertyName("parentGenreCode");
        this._parentGenreCode = parentGenreCode;
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

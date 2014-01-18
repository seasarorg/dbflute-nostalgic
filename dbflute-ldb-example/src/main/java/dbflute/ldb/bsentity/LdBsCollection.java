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
 * The entity of COLLECTION that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     COLLECTION_ID
 * 
 * [column]
 *     COLLECTION_ID, LIBRARY_ID, BOOK_ID, ARRIVAL_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     COLLECTION_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     BOOK, LIBRARY, COLLECTION_STATUS(AsOne)
 * 
 * [referrer-table]
 *     LENDING_COLLECTION, COLLECTION_STATUS
 * 
 * [foreign-property]
 *     book, library, collectionStatusAsOne
 * 
 * [referrer-property]
 *     lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsCollection implements LdEntityDefinedCommonColumn, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is COLLECTION. */
    public static final String TABLE = "COLLECTION";
    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "UTimestamp";

    /** ID-Annotation */
    public static final String collectionId_ID = "identity";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** COLLECTION_ID: {PK : ID : NotNull : INTEGER} */
    protected Integer _collectionId;

    /** LIBRARY_ID: {UQ : NotNull : SMALLINT : FK to LIBRARY} */
    protected Integer _libraryId;

    /** BOOK_ID: {UQ : NotNull : INTEGER : FK to BOOK} */
    protected Integer _bookId;

    /** ARRIVAL_DATE: {NotNull : TIMESTAMP} */
    protected java.sql.Timestamp _arrivalDate;

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
    public LdBsCollection() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "COLLECTION";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "collection";
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
    //   Foreign Property = [book]
    // * * * * * * * * */
    public static final int book_RELNO = 0;
    public static final String book_RELKEYS = "BOOK_ID:BOOK_ID";

    /** BOOK as 'book'. */
    protected LdBook _parentBook;

    /**
     * BOOK as 'book'. {without lazy-load}
     * @return The entity of foreign property 'book'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdBook getBook() {
        return _parentBook;
    }

    /**
     * BOOK as 'book'.
     * @param book The entity of foreign property 'book'. (Nullable)
     */
    public void setBook(LdBook book) {
        _parentBook = book;
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

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Foreign Property = [collectionStatusAsOne]
    // * * * * * * * * */
    public static final int collectionStatusAsOne_RELNO = 2;
    public static final String collectionStatusAsOne_RELKEYS = "COLLECTION_ID:COLLECTION_ID";
    
    /** COLLECTION_STATUS as 'collectionStatusAsOne'. */
    protected LdCollectionStatus _childrencollectionStatusAsOne;

    /**
     * COLLECTION_STATUS as 'collectionStatusAsOne'. {without lazy-load} <br />
     * @return the entity of foreign property(referrer-as-one) 'collectionStatusAsOne'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdCollectionStatus getCollectionStatusAsOne() {
        return _childrencollectionStatusAsOne;
    }

    /**
     * COLLECTION_STATUS as 'collectionStatusAsOne'.
     * @param collectionStatusAsOne The entity of foreign property(referrer-as-one) 'collectionStatusAsOne'. (Nullable)
     */
    public void setCollectionStatusAsOne(LdCollectionStatus collectionStatusAsOne) {
        _childrencollectionStatusAsOne = collectionStatusAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
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
        if (other == null || !(other instanceof LdBsCollection)) { return false; }
        LdBsCollection otherEntity = (LdBsCollection)other;
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
        sb.append(delimiter).append(getLibraryId());
        sb.append(delimiter).append(getBookId());
        sb.append(delimiter).append(getArrivalDate());
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
    public static final String collectionId_COLUMN = "COLLECTION_ID";

    /**
     * COLLECTION_ID: {PK : ID : NotNull : INTEGER} <br />
     * @return The value of the column 'COLLECTION_ID'. (Nullable)
     */
    public Integer getCollectionId() {
        return _collectionId;
    }

    /**
     * COLLECTION_ID: {PK : ID : NotNull : INTEGER} <br />
     * @param collectionId The value of the column 'COLLECTION_ID'. (Nullable)
     */
    public void setCollectionId(Integer collectionId) {
        _modifiedProperties.addPropertyName("collectionId");
        this._collectionId = collectionId;
    }

    /** The column annotation for S2Dao. {UQ : NotNull : SMALLINT : FK to LIBRARY} */
    public static final String libraryId_COLUMN = "LIBRARY_ID";

    /**
     * LIBRARY_ID: {UQ : NotNull : SMALLINT : FK to LIBRARY} <br />
     * @return The value of the column 'LIBRARY_ID'. (Nullable)
     */
    public Integer getLibraryId() {
        return _libraryId;
    }

    /**
     * LIBRARY_ID: {UQ : NotNull : SMALLINT : FK to LIBRARY} <br />
     * @param libraryId The value of the column 'LIBRARY_ID'. (Nullable)
     */
    public void setLibraryId(Integer libraryId) {
        _modifiedProperties.addPropertyName("libraryId");
        this._libraryId = libraryId;
    }

    /** The column annotation for S2Dao. {UQ : NotNull : INTEGER : FK to BOOK} */
    public static final String bookId_COLUMN = "BOOK_ID";

    /**
     * BOOK_ID: {UQ : NotNull : INTEGER : FK to BOOK} <br />
     * @return The value of the column 'BOOK_ID'. (Nullable)
     */
    public Integer getBookId() {
        return _bookId;
    }

    /**
     * BOOK_ID: {UQ : NotNull : INTEGER : FK to BOOK} <br />
     * @param bookId The value of the column 'BOOK_ID'. (Nullable)
     */
    public void setBookId(Integer bookId) {
        _modifiedProperties.addPropertyName("bookId");
        this._bookId = bookId;
    }

    /** The column annotation for S2Dao. {NotNull : TIMESTAMP} */
    public static final String arrivalDate_COLUMN = "ARRIVAL_DATE";

    /**
     * ARRIVAL_DATE: {NotNull : TIMESTAMP} <br />
     * @return The value of the column 'ARRIVAL_DATE'. (Nullable)
     */
    public java.sql.Timestamp getArrivalDate() {
        return _arrivalDate;
    }

    /**
     * ARRIVAL_DATE: {NotNull : TIMESTAMP} <br />
     * @param arrivalDate The value of the column 'ARRIVAL_DATE'. (Nullable)
     */
    public void setArrivalDate(java.sql.Timestamp arrivalDate) {
        _modifiedProperties.addPropertyName("arrivalDate");
        this._arrivalDate = arrivalDate;
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

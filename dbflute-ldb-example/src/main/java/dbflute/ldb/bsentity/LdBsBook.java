/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity;

import java.util.*;

import dbflute.ldb.allcommon.LdCDef;
import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.exentity.*;

/**
 * The entity of BOOK that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     BOOK_ID
 * 
 * [column]
 *     BOOK_ID, ISBN, BOOK_NAME, AUTHOR_ID, PUBLISHER_ID, GENRE_CODE, OPENING_PART, MAX_LENDING_DATE_COUNT, OUT_OF_USER_SELECT_YN, OUT_OF_USER_SELECT_REASON, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     BOOK_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     AUTHOR, GENRE, PUBLISHER, COLLECTION_STATUS_LOOKUP(AsNonExist)
 * 
 * [referrer-table]
 *     COLLECTION
 * 
 * [foreign-property]
 *     author, genre, publisher, collectionStatusLookupAsNonExist
 * 
 * [referrer-property]
 *     collectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBook implements LdEntityDefinedCommonColumn, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is BOOK. */
    public static final String TABLE = "BOOK";
    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "UTimestamp";

    /** ID-Annotation */
    public static final String bookId_ID = "identity";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** BOOK_ID: {PK : ID : NotNull : INTEGER} */
    protected Integer _bookId;

    /** ISBN: {UQ : NotNull : VARCHAR(20)} */
    protected String _isbn;

    /** BOOK_NAME: {NotNull : VARCHAR(80)} */
    protected String _bookName;

    /** AUTHOR_ID: {NotNull : INTEGER : FK to AUTHOR} */
    protected Integer _authorId;

    /** PUBLISHER_ID: {NotNull : INTEGER : FK to PUBLISHER} */
    protected Integer _publisherId;

    /** GENRE_CODE: {VARCHAR(24) : FK to GENRE} */
    protected String _genreCode;

    /** OPENING_PART: {CLOB} */
    protected String _openingPart;

    /** MAX_LENDING_DATE_COUNT: {NotNull : SMALLINT} */
    protected Integer _maxLendingDateCount;

    /** OUT_OF_USER_SELECT_YN: {NotNull : CHAR(1)} */
    protected String _outOfUserSelectYn;

    /** OUT_OF_USER_SELECT_REASON: {VARCHAR(200)} */
    protected String _outOfUserSelectReason;

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
    public LdBsBook() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "BOOK";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "book";
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
    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Foreign Property = [author]
    // * * * * * * * * */
    public static final int author_RELNO = 0;
    public static final String author_RELKEYS = "AUTHOR_ID:AUTHOR_ID";

    /** AUTHOR as 'author'. */
    protected LdAuthor _parentAuthor;

    /**
     * AUTHOR as 'author'. {without lazy-load}
     * @return The entity of foreign property 'author'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdAuthor getAuthor() {
        return _parentAuthor;
    }

    /**
     * AUTHOR as 'author'.
     * @param author The entity of foreign property 'author'. (Nullable)
     */
    public void setAuthor(LdAuthor author) {
        _parentAuthor = author;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Foreign Property = [genre]
    // * * * * * * * * */
    public static final int genre_RELNO = 1;
    public static final String genre_RELKEYS = "GENRE_CODE:GENRE_CODE";

    /** GENRE as 'genre'. */
    protected LdGenre _parentGenre;

    /**
     * GENRE as 'genre'. {without lazy-load}
     * @return The entity of foreign property 'genre'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdGenre getGenre() {
        return _parentGenre;
    }

    /**
     * GENRE as 'genre'.
     * @param genre The entity of foreign property 'genre'. (Nullable)
     */
    public void setGenre(LdGenre genre) {
        _parentGenre = genre;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Foreign Property = [publisher]
    // * * * * * * * * */
    public static final int publisher_RELNO = 2;
    public static final String publisher_RELKEYS = "PUBLISHER_ID:PUBLISHER_ID";

    /** PUBLISHER as 'publisher'. */
    protected LdPublisher _parentPublisher;

    /**
     * PUBLISHER as 'publisher'. {without lazy-load}
     * @return The entity of foreign property 'publisher'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdPublisher getPublisher() {
        return _parentPublisher;
    }

    /**
     * PUBLISHER as 'publisher'.
     * @param publisher The entity of foreign property 'publisher'. (Nullable)
     */
    public void setPublisher(LdPublisher publisher) {
        _parentPublisher = publisher;
    }

    // /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    //   Foreign Property = [collectionStatusLookupAsNonExist]
    // * * * * * * * * */
    public static final int collectionStatusLookupAsNonExist_RELNO = 3;
    public static final String collectionStatusLookupAsNonExist_RELKEYS = "GENRE_CODE:COLLECTION_STATUS_CODE";

    /** COLLECTION_STATUS_LOOKUP as 'collectionStatusLookupAsNonExist'. */
    protected LdCollectionStatusLookup _parentCollectionStatusLookupAsNonExist;

    /**
     * COLLECTION_STATUS_LOOKUP as 'collectionStatusLookupAsNonExist'. {without lazy-load}
     * @return The entity of foreign property 'collectionStatusLookupAsNonExist'. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public LdCollectionStatusLookup getCollectionStatusLookupAsNonExist() {
        return _parentCollectionStatusLookupAsNonExist;
    }

    /**
     * COLLECTION_STATUS_LOOKUP as 'collectionStatusLookupAsNonExist'.
     * @param collectionStatusLookupAsNonExist The entity of foreign property 'collectionStatusLookupAsNonExist'. (Nullable)
     */
    public void setCollectionStatusLookupAsNonExist(LdCollectionStatusLookup collectionStatusLookupAsNonExist) {
        _parentCollectionStatusLookupAsNonExist = collectionStatusLookupAsNonExist;
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
        if (other == null || !(other instanceof LdBsBook)) { return false; }
        LdBsBook otherEntity = (LdBsBook)other;
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
        sb.append(delimiter).append(getIsbn());
        sb.append(delimiter).append(getBookName());
        sb.append(delimiter).append(getAuthorId());
        sb.append(delimiter).append(getPublisherId());
        sb.append(delimiter).append(getGenreCode());
        sb.append(delimiter).append(getOpeningPart());
        sb.append(delimiter).append(getMaxLendingDateCount());
        sb.append(delimiter).append(getOutOfUserSelectYn());
        sb.append(delimiter).append(getOutOfUserSelectReason());
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
    public static final String bookId_COLUMN = "BOOK_ID";

    /**
     * BOOK_ID: {PK : ID : NotNull : INTEGER} <br />
     * @return The value of the column 'BOOK_ID'. (Nullable)
     */
    public Integer getBookId() {
        return _bookId;
    }

    /**
     * BOOK_ID: {PK : ID : NotNull : INTEGER} <br />
     * @param bookId The value of the column 'BOOK_ID'. (Nullable)
     */
    public void setBookId(Integer bookId) {
        _modifiedProperties.addPropertyName("bookId");
        this._bookId = bookId;
    }

    /** The column annotation for S2Dao. {UQ : NotNull : VARCHAR(20)} */
    public static final String isbn_COLUMN = "ISBN";

    /**
     * ISBN: {UQ : NotNull : VARCHAR(20)} <br />
     * @return The value of the column 'ISBN'. (Nullable)
     */
    public String getIsbn() {
        return _isbn;
    }

    /**
     * ISBN: {UQ : NotNull : VARCHAR(20)} <br />
     * @param isbn The value of the column 'ISBN'. (Nullable)
     */
    public void setIsbn(String isbn) {
        _modifiedProperties.addPropertyName("isbn");
        this._isbn = isbn;
    }

    /** The column annotation for S2Dao. {NotNull : VARCHAR(80)} */
    public static final String bookName_COLUMN = "BOOK_NAME";

    /**
     * BOOK_NAME: {NotNull : VARCHAR(80)} <br />
     * @return The value of the column 'BOOK_NAME'. (Nullable)
     */
    public String getBookName() {
        return _bookName;
    }

    /**
     * BOOK_NAME: {NotNull : VARCHAR(80)} <br />
     * @param bookName The value of the column 'BOOK_NAME'. (Nullable)
     */
    public void setBookName(String bookName) {
        _modifiedProperties.addPropertyName("bookName");
        this._bookName = bookName;
    }

    /** The column annotation for S2Dao. {NotNull : INTEGER : FK to AUTHOR} */
    public static final String authorId_COLUMN = "AUTHOR_ID";

    /**
     * AUTHOR_ID: {NotNull : INTEGER : FK to AUTHOR} <br />
     * @return The value of the column 'AUTHOR_ID'. (Nullable)
     */
    public Integer getAuthorId() {
        return _authorId;
    }

    /**
     * AUTHOR_ID: {NotNull : INTEGER : FK to AUTHOR} <br />
     * @param authorId The value of the column 'AUTHOR_ID'. (Nullable)
     */
    public void setAuthorId(Integer authorId) {
        _modifiedProperties.addPropertyName("authorId");
        this._authorId = authorId;
    }

    /** The column annotation for S2Dao. {NotNull : INTEGER : FK to PUBLISHER} */
    public static final String publisherId_COLUMN = "PUBLISHER_ID";

    /**
     * PUBLISHER_ID: {NotNull : INTEGER : FK to PUBLISHER} <br />
     * @return The value of the column 'PUBLISHER_ID'. (Nullable)
     */
    public Integer getPublisherId() {
        return _publisherId;
    }

    /**
     * PUBLISHER_ID: {NotNull : INTEGER : FK to PUBLISHER} <br />
     * @param publisherId The value of the column 'PUBLISHER_ID'. (Nullable)
     */
    public void setPublisherId(Integer publisherId) {
        _modifiedProperties.addPropertyName("publisherId");
        this._publisherId = publisherId;
    }

    /** The column annotation for S2Dao. {VARCHAR(24) : FK to GENRE} */
    public static final String genreCode_COLUMN = "GENRE_CODE";

    /**
     * GENRE_CODE: {VARCHAR(24) : FK to GENRE} <br />
     * @return The value of the column 'GENRE_CODE'. (Nullable)
     */
    public String getGenreCode() {
        return _genreCode;
    }

    /**
     * GENRE_CODE: {VARCHAR(24) : FK to GENRE} <br />
     * @param genreCode The value of the column 'GENRE_CODE'. (Nullable)
     */
    public void setGenreCode(String genreCode) {
        _modifiedProperties.addPropertyName("genreCode");
        this._genreCode = genreCode;
    }

    /** The column annotation for S2Dao. {CLOB} */
    public static final String openingPart_COLUMN = "OPENING_PART";

    /**
     * OPENING_PART: {CLOB} <br />
     * @return The value of the column 'OPENING_PART'. (Nullable)
     */
    public String getOpeningPart() {
        return _openingPart;
    }

    /**
     * OPENING_PART: {CLOB} <br />
     * @param openingPart The value of the column 'OPENING_PART'. (Nullable)
     */
    public void setOpeningPart(String openingPart) {
        _modifiedProperties.addPropertyName("openingPart");
        this._openingPart = openingPart;
    }

    /** The column annotation for S2Dao. {NotNull : SMALLINT} */
    public static final String maxLendingDateCount_COLUMN = "MAX_LENDING_DATE_COUNT";

    /**
     * MAX_LENDING_DATE_COUNT: {NotNull : SMALLINT} <br />
     * @return The value of the column 'MAX_LENDING_DATE_COUNT'. (Nullable)
     */
    public Integer getMaxLendingDateCount() {
        return _maxLendingDateCount;
    }

    /**
     * MAX_LENDING_DATE_COUNT: {NotNull : SMALLINT} <br />
     * @param maxLendingDateCount The value of the column 'MAX_LENDING_DATE_COUNT'. (Nullable)
     */
    public void setMaxLendingDateCount(Integer maxLendingDateCount) {
        _modifiedProperties.addPropertyName("maxLendingDateCount");
        this._maxLendingDateCount = maxLendingDateCount;
    }

    /** The column annotation for S2Dao. {NotNull : CHAR(1)} */
    public static final String outOfUserSelectYn_COLUMN = "OUT_OF_USER_SELECT_YN";

    /**
     * OUT_OF_USER_SELECT_YN: {NotNull : CHAR(1)} <br />
     * @return The value of the column 'OUT_OF_USER_SELECT_YN'. (Nullable)
     */
    public String getOutOfUserSelectYn() {
        return _outOfUserSelectYn;
    }

    /**
     * OUT_OF_USER_SELECT_YN: {NotNull : CHAR(1)} <br />
     * @param outOfUserSelectYn The value of the column 'OUT_OF_USER_SELECT_YN'. (Nullable)
     */
    public void setOutOfUserSelectYn(String outOfUserSelectYn) {
        _modifiedProperties.addPropertyName("outOfUserSelectYn");
        this._outOfUserSelectYn = outOfUserSelectYn;
    }

    /** The column annotation for S2Dao. {VARCHAR(200)} */
    public static final String outOfUserSelectReason_COLUMN = "OUT_OF_USER_SELECT_REASON";

    /**
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)} <br />
     * @return The value of the column 'OUT_OF_USER_SELECT_REASON'. (Nullable)
     */
    public String getOutOfUserSelectReason() {
        return _outOfUserSelectReason;
    }

    /**
     * OUT_OF_USER_SELECT_REASON: {VARCHAR(200)} <br />
     * @param outOfUserSelectReason The value of the column 'OUT_OF_USER_SELECT_REASON'. (Nullable)
     */
    public void setOutOfUserSelectReason(String outOfUserSelectReason) {
        _modifiedProperties.addPropertyName("outOfUserSelectReason");
        this._outOfUserSelectReason = outOfUserSelectReason;
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

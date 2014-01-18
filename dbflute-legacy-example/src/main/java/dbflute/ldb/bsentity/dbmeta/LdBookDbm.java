package dbflute.ldb.bsentity.dbmeta;


import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exdao.*;
import dbflute.ldb.exentity.*;

import dbflute.ldb.cbean.*;

/**
 * The dbmeta of BOOK. (Singleton)
 * 
 * <pre>
 * [primary-key]
 *     BOOK_ID
 * 
 * [column-property]
 *     BOOK_ID, ISBN_NO, BOOK_NAME, AUTHOR_ID, PUBLISHER_ID, MAX_LENDING_DATE_COUNT, GENRE_CODE, OPENING_PART, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     author, publisher, genre
 * 
 * [refferer-property]
 *     collectionList
 * 
 * [sequence]
 *     BOOK_BOOK_ID_INC
 * 
 * [identity]
 *     bookId
 * 
 * [update-date]
 *     UTime
 * 
 * [version-no]
 *     
 * 
 * </pre>
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdBookDbm extends LdAbstractDBMeta {

    /** The type of entity. */
    public static final Class DAO_TYPE = LdBookDao.class;

    /** The type of entity. */
    public static final Class ENTITY_TYPE = LdBook.class;

    /** The type of condition-bean. */
    public static final Class CONDITION_BEAN_TYPE = LdBookCB.class;

    /** Singleton instance. */
    private static final LdBookDbm _instance = new LdBookDbm();

    /**
     * Constructor
     */
    private LdBookDbm() {
    }

    /**
     * Get instance.
     * 
     * @return Singleton instance. (NotNull)
     */
    public static LdBookDbm getInstance() {
        return _instance;
    }

    // =====================================================================================
    //                                                                       Name Definition
    //                                                                       ===============
    /** Table db name. */
    public static final String TABLE_DB_NAME = "BOOK";

    /** Table cap-prop name. */
    public static final String TABLE_CAP_PROP_NAME = "Book";

    /** Table uncap-prop name. */
    public static final String TABLE_UNCAP_PROP_NAME = "book";


    /** Db-name of BookId. */
    public static final String COLUMN_DB_NAME_OF_BookId = "BOOK_ID";

    /** Db-name of IsbnNo. */
    public static final String COLUMN_DB_NAME_OF_IsbnNo = "ISBN_NO";

    /** Db-name of BookName. */
    public static final String COLUMN_DB_NAME_OF_BookName = "BOOK_NAME";

    /** Db-name of AuthorId. */
    public static final String COLUMN_DB_NAME_OF_AuthorId = "AUTHOR_ID";

    /** Db-name of PublisherId. */
    public static final String COLUMN_DB_NAME_OF_PublisherId = "PUBLISHER_ID";

    /** Db-name of MaxLendingDateCount. */
    public static final String COLUMN_DB_NAME_OF_MaxLendingDateCount = "MAX_LENDING_DATE_COUNT";

    /** Db-name of GenreCode. */
    public static final String COLUMN_DB_NAME_OF_GenreCode = "GENRE_CODE";

    /** Db-name of OpeningPart. */
    public static final String COLUMN_DB_NAME_OF_OpeningPart = "OPENING_PART";

    /** Db-name of RTime. */
    public static final String COLUMN_DB_NAME_OF_RTime = "R_TIME";

    /** Db-name of UTime. */
    public static final String COLUMN_DB_NAME_OF_UTime = "U_TIME";

    /** Db-name of RStaff. */
    public static final String COLUMN_DB_NAME_OF_RStaff = "R_STAFF";

    /** Db-name of UStaff. */
    public static final String COLUMN_DB_NAME_OF_UStaff = "U_STAFF";


    /** Cap-prop-name of BookId. */
    public static final String COLUMN_CAP_PROP_NAME_OF_BookId = "BookId";

    /** Cap-prop-name of IsbnNo. */
    public static final String COLUMN_CAP_PROP_NAME_OF_IsbnNo = "IsbnNo";

    /** Cap-prop-name of BookName. */
    public static final String COLUMN_CAP_PROP_NAME_OF_BookName = "BookName";

    /** Cap-prop-name of AuthorId. */
    public static final String COLUMN_CAP_PROP_NAME_OF_AuthorId = "AuthorId";

    /** Cap-prop-name of PublisherId. */
    public static final String COLUMN_CAP_PROP_NAME_OF_PublisherId = "PublisherId";

    /** Cap-prop-name of MaxLendingDateCount. */
    public static final String COLUMN_CAP_PROP_NAME_OF_MaxLendingDateCount = "MaxLendingDateCount";

    /** Cap-prop-name of GenreCode. */
    public static final String COLUMN_CAP_PROP_NAME_OF_GenreCode = "GenreCode";

    /** Cap-prop-name of OpeningPart. */
    public static final String COLUMN_CAP_PROP_NAME_OF_OpeningPart = "OpeningPart";

    /** Cap-prop-name of RTime. */
    public static final String COLUMN_CAP_PROP_NAME_OF_RTime = "RTime";

    /** Cap-prop-name of UTime. */
    public static final String COLUMN_CAP_PROP_NAME_OF_UTime = "UTime";

    /** Cap-prop-name of RStaff. */
    public static final String COLUMN_CAP_PROP_NAME_OF_RStaff = "RStaff";

    /** Cap-prop-name of UStaff. */
    public static final String COLUMN_CAP_PROP_NAME_OF_UStaff = "UStaff";

    /** Cap-prop-name of author. */
    public static final String COLUMN_CAP_PROP_NAME_OF_Author = "Author";

    /** Cap-prop-name of publisher. */
    public static final String COLUMN_CAP_PROP_NAME_OF_Publisher = "Publisher";

    /** Cap-prop-name of genre. */
    public static final String COLUMN_CAP_PROP_NAME_OF_Genre = "Genre";

    /** Cap-prop-name of CollectionList. */
    public static final String COLUMN_CAP_PROP_NAME_OF_CollectionList = "CollectionList";


    /** Uncap-prop-name of BookId. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_BookId = "bookId";

    /** Uncap-prop-name of IsbnNo. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_IsbnNo = "isbnNo";

    /** Uncap-prop-name of BookName. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_BookName = "bookName";

    /** Uncap-prop-name of AuthorId. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_AuthorId = "authorId";

    /** Uncap-prop-name of PublisherId. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_PublisherId = "publisherId";

    /** Uncap-prop-name of MaxLendingDateCount. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_MaxLendingDateCount = "maxLendingDateCount";

    /** Uncap-prop-name of GenreCode. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_GenreCode = "genreCode";

    /** Uncap-prop-name of OpeningPart. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_OpeningPart = "openingPart";

    /** Uncap-prop-name of RTime. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_RTime = "rTime";

    /** Uncap-prop-name of UTime. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_UTime = "uTime";

    /** Uncap-prop-name of RStaff. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_RStaff = "rStaff";

    /** Uncap-prop-name of UStaff. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_UStaff = "uStaff";

    /** Uncap-prop-name of author. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_Author = "author";

    /** Uncap-prop-name of publisher. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_Publisher = "publisher";

    /** Uncap-prop-name of genre. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_Genre = "genre";

    /** Uncap-prop-name of collectionList. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_CollectionList = "collectionList";

    /** {db-name : cap-prop-name} map. */
    protected static final java.util.Map<String, String> _dbNameCapPropNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_DB_NAME, TABLE_CAP_PROP_NAME);

        map.put(COLUMN_DB_NAME_OF_BookId, COLUMN_CAP_PROP_NAME_OF_BookId);

        map.put(COLUMN_DB_NAME_OF_IsbnNo, COLUMN_CAP_PROP_NAME_OF_IsbnNo);

        map.put(COLUMN_DB_NAME_OF_BookName, COLUMN_CAP_PROP_NAME_OF_BookName);

        map.put(COLUMN_DB_NAME_OF_AuthorId, COLUMN_CAP_PROP_NAME_OF_AuthorId);

        map.put(COLUMN_DB_NAME_OF_PublisherId, COLUMN_CAP_PROP_NAME_OF_PublisherId);

        map.put(COLUMN_DB_NAME_OF_MaxLendingDateCount, COLUMN_CAP_PROP_NAME_OF_MaxLendingDateCount);

        map.put(COLUMN_DB_NAME_OF_GenreCode, COLUMN_CAP_PROP_NAME_OF_GenreCode);

        map.put(COLUMN_DB_NAME_OF_OpeningPart, COLUMN_CAP_PROP_NAME_OF_OpeningPart);

        map.put(COLUMN_DB_NAME_OF_RTime, COLUMN_CAP_PROP_NAME_OF_RTime);

        map.put(COLUMN_DB_NAME_OF_UTime, COLUMN_CAP_PROP_NAME_OF_UTime);

        map.put(COLUMN_DB_NAME_OF_RStaff, COLUMN_CAP_PROP_NAME_OF_RStaff);

        map.put(COLUMN_DB_NAME_OF_UStaff, COLUMN_CAP_PROP_NAME_OF_UStaff);

        _dbNameCapPropNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {db-name : uncap-prop-name} map. */
    protected static final java.util.Map<String, String> _dbNameUncapPropNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_DB_NAME, TABLE_UNCAP_PROP_NAME);

        map.put(COLUMN_DB_NAME_OF_BookId, COLUMN_UNCAP_PROP_NAME_OF_BookId);

        map.put(COLUMN_DB_NAME_OF_IsbnNo, COLUMN_UNCAP_PROP_NAME_OF_IsbnNo);

        map.put(COLUMN_DB_NAME_OF_BookName, COLUMN_UNCAP_PROP_NAME_OF_BookName);

        map.put(COLUMN_DB_NAME_OF_AuthorId, COLUMN_UNCAP_PROP_NAME_OF_AuthorId);

        map.put(COLUMN_DB_NAME_OF_PublisherId, COLUMN_UNCAP_PROP_NAME_OF_PublisherId);

        map.put(COLUMN_DB_NAME_OF_MaxLendingDateCount, COLUMN_UNCAP_PROP_NAME_OF_MaxLendingDateCount);

        map.put(COLUMN_DB_NAME_OF_GenreCode, COLUMN_UNCAP_PROP_NAME_OF_GenreCode);

        map.put(COLUMN_DB_NAME_OF_OpeningPart, COLUMN_UNCAP_PROP_NAME_OF_OpeningPart);

        map.put(COLUMN_DB_NAME_OF_RTime, COLUMN_UNCAP_PROP_NAME_OF_RTime);

        map.put(COLUMN_DB_NAME_OF_UTime, COLUMN_UNCAP_PROP_NAME_OF_UTime);

        map.put(COLUMN_DB_NAME_OF_RStaff, COLUMN_UNCAP_PROP_NAME_OF_RStaff);

        map.put(COLUMN_DB_NAME_OF_UStaff, COLUMN_UNCAP_PROP_NAME_OF_UStaff);

        _dbNameUncapPropNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {cap-prop-name : db-name} map. */
    protected static final java.util.Map<String, String> _capPropNameDbNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_CAP_PROP_NAME, TABLE_DB_NAME);

        map.put(COLUMN_CAP_PROP_NAME_OF_BookId, COLUMN_DB_NAME_OF_BookId);

        map.put(COLUMN_CAP_PROP_NAME_OF_IsbnNo, COLUMN_DB_NAME_OF_IsbnNo);

        map.put(COLUMN_CAP_PROP_NAME_OF_BookName, COLUMN_DB_NAME_OF_BookName);

        map.put(COLUMN_CAP_PROP_NAME_OF_AuthorId, COLUMN_DB_NAME_OF_AuthorId);

        map.put(COLUMN_CAP_PROP_NAME_OF_PublisherId, COLUMN_DB_NAME_OF_PublisherId);

        map.put(COLUMN_CAP_PROP_NAME_OF_MaxLendingDateCount, COLUMN_DB_NAME_OF_MaxLendingDateCount);

        map.put(COLUMN_CAP_PROP_NAME_OF_GenreCode, COLUMN_DB_NAME_OF_GenreCode);

        map.put(COLUMN_CAP_PROP_NAME_OF_OpeningPart, COLUMN_DB_NAME_OF_OpeningPart);

        map.put(COLUMN_CAP_PROP_NAME_OF_RTime, COLUMN_DB_NAME_OF_RTime);

        map.put(COLUMN_CAP_PROP_NAME_OF_UTime, COLUMN_DB_NAME_OF_UTime);

        map.put(COLUMN_CAP_PROP_NAME_OF_RStaff, COLUMN_DB_NAME_OF_RStaff);

        map.put(COLUMN_CAP_PROP_NAME_OF_UStaff, COLUMN_DB_NAME_OF_UStaff);

        _capPropNameDbNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {cap-prop-name : uncap-prop-name} map. */
    protected static final java.util.Map<String, String> _capPropNameUncapPropNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_CAP_PROP_NAME, TABLE_UNCAP_PROP_NAME);

        map.put(COLUMN_CAP_PROP_NAME_OF_BookId, COLUMN_UNCAP_PROP_NAME_OF_BookId);

        map.put(COLUMN_CAP_PROP_NAME_OF_IsbnNo, COLUMN_UNCAP_PROP_NAME_OF_IsbnNo);

        map.put(COLUMN_CAP_PROP_NAME_OF_BookName, COLUMN_UNCAP_PROP_NAME_OF_BookName);

        map.put(COLUMN_CAP_PROP_NAME_OF_AuthorId, COLUMN_UNCAP_PROP_NAME_OF_AuthorId);

        map.put(COLUMN_CAP_PROP_NAME_OF_PublisherId, COLUMN_UNCAP_PROP_NAME_OF_PublisherId);

        map.put(COLUMN_CAP_PROP_NAME_OF_MaxLendingDateCount, COLUMN_UNCAP_PROP_NAME_OF_MaxLendingDateCount);

        map.put(COLUMN_CAP_PROP_NAME_OF_GenreCode, COLUMN_UNCAP_PROP_NAME_OF_GenreCode);

        map.put(COLUMN_CAP_PROP_NAME_OF_OpeningPart, COLUMN_UNCAP_PROP_NAME_OF_OpeningPart);

        map.put(COLUMN_CAP_PROP_NAME_OF_RTime, COLUMN_UNCAP_PROP_NAME_OF_RTime);

        map.put(COLUMN_CAP_PROP_NAME_OF_UTime, COLUMN_UNCAP_PROP_NAME_OF_UTime);

        map.put(COLUMN_CAP_PROP_NAME_OF_RStaff, COLUMN_UNCAP_PROP_NAME_OF_RStaff);

        map.put(COLUMN_CAP_PROP_NAME_OF_UStaff, COLUMN_UNCAP_PROP_NAME_OF_UStaff);

        _capPropNameUncapPropNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {uncap-prop-name : db-name} map. */
    protected static final java.util.Map<String, String> _uncapPropNameDbNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_UNCAP_PROP_NAME, TABLE_DB_NAME);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BookId, COLUMN_DB_NAME_OF_BookId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_IsbnNo, COLUMN_DB_NAME_OF_IsbnNo);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BookName, COLUMN_DB_NAME_OF_BookName);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_AuthorId, COLUMN_DB_NAME_OF_AuthorId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_PublisherId, COLUMN_DB_NAME_OF_PublisherId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_MaxLendingDateCount, COLUMN_DB_NAME_OF_MaxLendingDateCount);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_GenreCode, COLUMN_DB_NAME_OF_GenreCode);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_OpeningPart, COLUMN_DB_NAME_OF_OpeningPart);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_RTime, COLUMN_DB_NAME_OF_RTime);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_UTime, COLUMN_DB_NAME_OF_UTime);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_RStaff, COLUMN_DB_NAME_OF_RStaff);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_UStaff, COLUMN_DB_NAME_OF_UStaff);

        _uncapPropNameDbNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {uncap-prop-name : cap-prop-name} map. */
    protected static final java.util.Map<String, String> _uncapPropNameCapPropNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_UNCAP_PROP_NAME, TABLE_CAP_PROP_NAME);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BookId, COLUMN_CAP_PROP_NAME_OF_BookId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_IsbnNo, COLUMN_CAP_PROP_NAME_OF_IsbnNo);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BookName, COLUMN_CAP_PROP_NAME_OF_BookName);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_AuthorId, COLUMN_CAP_PROP_NAME_OF_AuthorId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_PublisherId, COLUMN_CAP_PROP_NAME_OF_PublisherId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_MaxLendingDateCount, COLUMN_CAP_PROP_NAME_OF_MaxLendingDateCount);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_GenreCode, COLUMN_CAP_PROP_NAME_OF_GenreCode);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_OpeningPart, COLUMN_CAP_PROP_NAME_OF_OpeningPart);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_RTime, COLUMN_CAP_PROP_NAME_OF_RTime);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_UTime, COLUMN_CAP_PROP_NAME_OF_UTime);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_RStaff, COLUMN_CAP_PROP_NAME_OF_RStaff);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_UStaff, COLUMN_CAP_PROP_NAME_OF_UStaff);

        _uncapPropNameCapPropNameMap = java.util.Collections.unmodifiableMap(map);
    }

    // =====================================================================================
    //                                                                            Table Name
    //                                                                            ==========
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Table db-name. (NotNull)
     */
    public String getTableDbName() {
        return TABLE_DB_NAME;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Table cap-prop-name. (NotNull)
     */
    public String getTableCapPropName() {
        return TABLE_CAP_PROP_NAME;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Table property-name. (NotNull)
     */
    public String getTableUncapPropName() {
        return TABLE_UNCAP_PROP_NAME;
    }

    // =====================================================================================
    //                                                                    DB-Name-Map Getter
    //                                                                    ==================
    /**
     * This method implements the method that is declared at super.
     * 
     * @return {db-name : cap-prop-name} map.
     */
    public java.util.Map<String, String> getDbNameCapPropNameMap() {
        return _dbNameCapPropNameMap;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return {db-name : uncap-prop-name} map.
     */
    public java.util.Map<String, String> getDbNameUncapPropNameMap() {
        return _dbNameUncapPropNameMap;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return {cap-prop-name : db-name} map.
     */
    public java.util.Map<String, String> getCapPropNameDbNameMap() {
        return _capPropNameDbNameMap;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return {cap-prop-name : uncap-prop-name} map.
     */
    public java.util.Map<String, String> getCapPropNameUncapPropNameMap() {
        return _capPropNameUncapPropNameMap;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return {uncap-prop-name : db-name} map.
     */
    public java.util.Map<String, String> getUncapPropNameDbNameMap() {
        return _uncapPropNameDbNameMap;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return {uncap-prop-name : cap-prop-name} map.
     */
    public java.util.Map<String, String> getUncapPropNameCapPropNameMap() {
        return _uncapPropNameCapPropNameMap;
    }


    // =====================================================================================
    //                                                                          Class Getter
    //                                                                          ============
    /**
     * This method implements the method that is declared at super.
     * 
     * @return The type of dao. (NotNull)
     */ 
    public Class getDaoType() {
        return DAO_TYPE;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The type of entity. (NotNull)
     */ 
    public Class getEntityType() {
        return ENTITY_TYPE;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The type of condition-bean. (NotNull)
     */ 
    public Class getConditionBeanType() {

        return CONDITION_BEAN_TYPE;
    }

    // =====================================================================================
    //                                                                       Instance Getter
    //                                                                       ===============
    /**
     * This method implements the method that is declared at super.
     * 
     * @return The type of entity. (NotNull)
     */ 
    public LdEntity newEntity() {
        return newMyEntity();
    }

    /**
     * New the instance of my entity.
     * 
     * @return The instance of my entity. (NotNull)
     */ 
    public LdBook newMyEntity() {
        return new LdBook();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The type of condition-bean. (NotNull)
     */ 
    public LdConditionBean newConditionBean() {

        return newMyConditionBean();
    }

    /**
     * New the instance of my condition-bean.
     * 
     * @return The instance of condition-bean. (NotNull)
     */ 
    public LdBookCB newMyConditionBean() {
        return new LdBookCB();
    }

    // =====================================================================================
    //                                                                         Entity Method
    //                                                                         =============

    /** The getter method of bookId. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_BookId;
    static {
        try {
            ENTITY_GETTER_METHOD_BookId = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_BookId, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_BookId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of bookId. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_BookId;
    static {
        try {
            ENTITY_SETTER_METHOD_BookId = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_BookId, new Class[] {java.math.BigDecimal.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_BookId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of isbnNo. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_IsbnNo;
    static {
        try {
            ENTITY_GETTER_METHOD_IsbnNo = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_IsbnNo, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_IsbnNo + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of isbnNo. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_IsbnNo;
    static {
        try {
            ENTITY_SETTER_METHOD_IsbnNo = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_IsbnNo, new Class[] {String.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_IsbnNo + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of bookName. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_BookName;
    static {
        try {
            ENTITY_GETTER_METHOD_BookName = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_BookName, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_BookName + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of bookName. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_BookName;
    static {
        try {
            ENTITY_SETTER_METHOD_BookName = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_BookName, new Class[] {String.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_BookName + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of authorId. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_AuthorId;
    static {
        try {
            ENTITY_GETTER_METHOD_AuthorId = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_AuthorId, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_AuthorId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of authorId. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_AuthorId;
    static {
        try {
            ENTITY_SETTER_METHOD_AuthorId = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_AuthorId, new Class[] {java.math.BigDecimal.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_AuthorId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of publisherId. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_PublisherId;
    static {
        try {
            ENTITY_GETTER_METHOD_PublisherId = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_PublisherId, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_PublisherId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of publisherId. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_PublisherId;
    static {
        try {
            ENTITY_SETTER_METHOD_PublisherId = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_PublisherId, new Class[] {java.math.BigDecimal.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_PublisherId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of maxLendingDateCount. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_MaxLendingDateCount;
    static {
        try {
            ENTITY_GETTER_METHOD_MaxLendingDateCount = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_MaxLendingDateCount, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_MaxLendingDateCount + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of maxLendingDateCount. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_MaxLendingDateCount;
    static {
        try {
            ENTITY_SETTER_METHOD_MaxLendingDateCount = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_MaxLendingDateCount, new Class[] {java.math.BigDecimal.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_MaxLendingDateCount + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of genreCode. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_GenreCode;
    static {
        try {
            ENTITY_GETTER_METHOD_GenreCode = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_GenreCode, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_GenreCode + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of genreCode. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_GenreCode;
    static {
        try {
            ENTITY_SETTER_METHOD_GenreCode = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_GenreCode, new Class[] {String.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_GenreCode + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of openingPart. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_OpeningPart;
    static {
        try {
            ENTITY_GETTER_METHOD_OpeningPart = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_OpeningPart, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_OpeningPart + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of openingPart. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_OpeningPart;
    static {
        try {
            ENTITY_SETTER_METHOD_OpeningPart = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_OpeningPart, new Class[] {String.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_OpeningPart + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of rTime. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_RTime;
    static {
        try {
            ENTITY_GETTER_METHOD_RTime = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_RTime, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_RTime + " argsType=java.sql.Timestamp";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of rTime. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_RTime;
    static {
        try {
            ENTITY_SETTER_METHOD_RTime = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_RTime, new Class[] {java.sql.Timestamp.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_RTime + " argsType=java.sql.Timestamp";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of uTime. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_UTime;
    static {
        try {
            ENTITY_GETTER_METHOD_UTime = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_UTime, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_UTime + " argsType=java.sql.Timestamp";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of uTime. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_UTime;
    static {
        try {
            ENTITY_SETTER_METHOD_UTime = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_UTime, new Class[] {java.sql.Timestamp.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_UTime + " argsType=java.sql.Timestamp";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of rStaff. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_RStaff;
    static {
        try {
            ENTITY_GETTER_METHOD_RStaff = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_RStaff, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_RStaff + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of rStaff. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_RStaff;
    static {
        try {
            ENTITY_SETTER_METHOD_RStaff = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_RStaff, new Class[] {String.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_RStaff + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of uStaff. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_UStaff;
    static {
        try {
            ENTITY_GETTER_METHOD_UStaff = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_UStaff, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_UStaff + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of uStaff. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_UStaff;
    static {
        try {
            ENTITY_SETTER_METHOD_UStaff = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_UStaff, new Class[] {String.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_UStaff + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }



    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of bookId. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_BookId() {
        return ENTITY_GETTER_METHOD_BookId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of bookId. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_BookId() {
        return ENTITY_SETTER_METHOD_BookId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of isbnNo. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_IsbnNo() {
        return ENTITY_GETTER_METHOD_IsbnNo;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of isbnNo. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_IsbnNo() {
        return ENTITY_SETTER_METHOD_IsbnNo;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of bookName. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_BookName() {
        return ENTITY_GETTER_METHOD_BookName;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of bookName. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_BookName() {
        return ENTITY_SETTER_METHOD_BookName;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of authorId. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_AuthorId() {
        return ENTITY_GETTER_METHOD_AuthorId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of authorId. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_AuthorId() {
        return ENTITY_SETTER_METHOD_AuthorId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of publisherId. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_PublisherId() {
        return ENTITY_GETTER_METHOD_PublisherId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of publisherId. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_PublisherId() {
        return ENTITY_SETTER_METHOD_PublisherId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of maxLendingDateCount. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_MaxLendingDateCount() {
        return ENTITY_GETTER_METHOD_MaxLendingDateCount;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of maxLendingDateCount. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_MaxLendingDateCount() {
        return ENTITY_SETTER_METHOD_MaxLendingDateCount;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of genreCode. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_GenreCode() {
        return ENTITY_GETTER_METHOD_GenreCode;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of genreCode. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_GenreCode() {
        return ENTITY_SETTER_METHOD_GenreCode;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of openingPart. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_OpeningPart() {
        return ENTITY_GETTER_METHOD_OpeningPart;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of openingPart. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_OpeningPart() {
        return ENTITY_SETTER_METHOD_OpeningPart;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of rTime. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_RTime() {
        return ENTITY_GETTER_METHOD_RTime;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of rTime. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_RTime() {
        return ENTITY_SETTER_METHOD_RTime;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of uTime. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_UTime() {
        return ENTITY_GETTER_METHOD_UTime;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of uTime. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_UTime() {
        return ENTITY_SETTER_METHOD_UTime;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of rStaff. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_RStaff() {
        return ENTITY_GETTER_METHOD_RStaff;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of rStaff. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_RStaff() {
        return ENTITY_SETTER_METHOD_RStaff;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of uStaff. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_UStaff() {
        return ENTITY_GETTER_METHOD_UStaff;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of uStaff. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_UStaff() {
        return ENTITY_SETTER_METHOD_UStaff;
    }

    /**
     * Get entity getter method by multi-name.
     * 
     * @param multiName Multi-name. (NotNull)
     * @return Entity getter method of entity. (NotNull)
     */ 
    public java.lang.reflect.Method getEntityGetterMethodByMultiName(String multiName) {
        assertStringNotNullAndNotTrimmedEmpty("multiName", multiName);
        final String capPropName = getCapPropNameByMultiName(multiName);
        final String methodName = "getEntityGetterMethod_" + capPropName;

        java.lang.reflect.Method method = null;
        try {
            method = this.getClass().getMethod(methodName);
        } catch (NoSuchMethodException e) {
            String msg = "The multiName is not found: multiName=" + multiName;
            msg = msg + " tableName=" + TABLE_DB_NAME + " methodName=" + methodName;
            throw new RuntimeException(msg, e);
        }
        try {
            return (java.lang.reflect.Method)method.invoke(this, new Object[]{});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    /**
     * Get entity setter method by multi-name.
     * 
     * @param multiName Multi-name. (NotNull)
     * @return Entity setter method of entity. (NotNull)
     */ 
    public java.lang.reflect.Method getEntitySetterMethodByMultiName(String multiName) {
        assertStringNotNullAndNotTrimmedEmpty("multiName", multiName);
        final String capPropName = getCapPropNameByMultiName(multiName);
        final String methodName = "getEntitySetterMethod_" + capPropName;

        java.lang.reflect.Method method = null;
        try {
            method = this.getClass().getMethod(methodName);
        } catch (NoSuchMethodException e) {
            String msg = "The multiName is not found: multiName=" + multiName;
            msg = msg + " tableName=" + TABLE_DB_NAME + " methodName=" + methodName;
            throw new RuntimeException(msg, e);
        }
        try {
            return (java.lang.reflect.Method)method.invoke(this, new Object[]{});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    // =====================================================================================
    //                                                                        Foreign DBMeta
    //                                                                        ==============
    /**
     * This method implements the method that is declared at super.
     * 
     * @param foreignPropertyName Foreign-property-name(Both OK - InitCap or not). (NotNull)
     * @return Foreign DBMeta. (NotNull)
     */ 
    public LdDBMeta getForeignDBMeta(String foreignPropertyName) {
        assertStringNotNullAndNotTrimmedEmpty("foreignPropertyName", foreignPropertyName);
        final String methodName = "getForeignDBMeta_" + foreignPropertyName.substring(0, 1) + foreignPropertyName.substring(1);

        java.lang.reflect.Method method = null;
        try {
            method = this.getClass().getMethod(methodName);
        } catch (NoSuchMethodException e) {
            String msg = "The foreignPropertyName is not found: foreignPropertyName=" + foreignPropertyName;
            msg = msg + " tableName=" + TABLE_DB_NAME + " methodName=" + methodName;
            throw new RuntimeException(msg, e);
        }
        try {
            return (LdDBMeta)method.invoke(this, new Object[]{});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }


    /**
     * Get foreign dbmeta of Author.
     * 
     * @return Foreign DBMeta. (NotNull)
     */
    public LdAuthorDbm getForeignDBMeta_Author() {
        return LdAuthorDbm.getInstance();
    }

    /**
     * Get foreign dbmeta of Publisher.
     * 
     * @return Foreign DBMeta. (NotNull)
     */
    public LdPublisherDbm getForeignDBMeta_Publisher() {
        return LdPublisherDbm.getInstance();
    }

    /**
     * Get foreign dbmeta of Genre.
     * 
     * @return Foreign DBMeta. (NotNull)
     */
    public LdGenreDbm getForeignDBMeta_Genre() {
        return LdGenreDbm.getInstance();
    }


    // =====================================================================================
    //                                                                         Determination
    //                                                                         =============
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Determination.
     */
    public boolean hasTwoOrMorePrimaryKeys() {
        return false;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Determination.
     */
    public boolean hasCommonColumn() {
        return true;
    }
}

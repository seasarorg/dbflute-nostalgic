package dbflute.ldb.bsentity.customize.dbmeta;


import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exdao.customize.*;
import dbflute.ldb.exentity.customize.*;

/**
 * The dbmeta of BOOK_AUTHOR. (Singleton)
 * 
 * <pre>
 * [primary-key]
 *     BOOK_ID
 * 
 * [column-property]
 *     BOOK_ID, BOOK_NAME, AUTHOR_NAME
 * 
 * [foreign-property]
 *     
 * 
 * [refferer-property]
 *     
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [update-date]
 *     
 * 
 * [version-no]
 *     
 * 
 * </pre>
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdBookAuthorDbm extends LdAbstractDBMeta {

    /** The type of entity. */
    public static final Class DAO_TYPE = LdBookAuthorDao.class;

    /** The type of entity. */
    public static final Class ENTITY_TYPE = LdBookAuthor.class;

    /** Singleton instance. */
    private static final LdBookAuthorDbm _instance = new LdBookAuthorDbm();

    /**
     * Constructor
     */
    private LdBookAuthorDbm() {
    }

    /**
     * Get instance.
     * 
     * @return Singleton instance. (NotNull)
     */
    public static LdBookAuthorDbm getInstance() {
        return _instance;
    }

    // =====================================================================================
    //                                                                       Name Definition
    //                                                                       ===============
    /** Table db name. */
    public static final String TABLE_DB_NAME = "BOOK_AUTHOR";

    /** Table cap-prop name. */
    public static final String TABLE_CAP_PROP_NAME = "BookAuthor";

    /** Table uncap-prop name. */
    public static final String TABLE_UNCAP_PROP_NAME = "bookAuthor";


    /** Db-name of BookId. */
    public static final String COLUMN_DB_NAME_OF_BookId = "BOOK_ID";

    /** Db-name of BookName. */
    public static final String COLUMN_DB_NAME_OF_BookName = "BOOK_NAME";

    /** Db-name of AuthorName. */
    public static final String COLUMN_DB_NAME_OF_AuthorName = "AUTHOR_NAME";


    /** Cap-prop-name of BookId. */
    public static final String COLUMN_CAP_PROP_NAME_OF_BookId = "BookId";

    /** Cap-prop-name of BookName. */
    public static final String COLUMN_CAP_PROP_NAME_OF_BookName = "BookName";

    /** Cap-prop-name of AuthorName. */
    public static final String COLUMN_CAP_PROP_NAME_OF_AuthorName = "AuthorName";


    /** Uncap-prop-name of BookId. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_BookId = "bookId";

    /** Uncap-prop-name of BookName. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_BookName = "bookName";

    /** Uncap-prop-name of AuthorName. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_AuthorName = "authorName";

    /** {db-name : cap-prop-name} map. */
    protected static final java.util.Map<String, String> _dbNameCapPropNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_DB_NAME, TABLE_CAP_PROP_NAME);

        map.put(COLUMN_DB_NAME_OF_BookId, COLUMN_CAP_PROP_NAME_OF_BookId);

        map.put(COLUMN_DB_NAME_OF_BookName, COLUMN_CAP_PROP_NAME_OF_BookName);

        map.put(COLUMN_DB_NAME_OF_AuthorName, COLUMN_CAP_PROP_NAME_OF_AuthorName);

        _dbNameCapPropNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {db-name : uncap-prop-name} map. */
    protected static final java.util.Map<String, String> _dbNameUncapPropNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_DB_NAME, TABLE_UNCAP_PROP_NAME);

        map.put(COLUMN_DB_NAME_OF_BookId, COLUMN_UNCAP_PROP_NAME_OF_BookId);

        map.put(COLUMN_DB_NAME_OF_BookName, COLUMN_UNCAP_PROP_NAME_OF_BookName);

        map.put(COLUMN_DB_NAME_OF_AuthorName, COLUMN_UNCAP_PROP_NAME_OF_AuthorName);

        _dbNameUncapPropNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {cap-prop-name : db-name} map. */
    protected static final java.util.Map<String, String> _capPropNameDbNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_CAP_PROP_NAME, TABLE_DB_NAME);

        map.put(COLUMN_CAP_PROP_NAME_OF_BookId, COLUMN_DB_NAME_OF_BookId);

        map.put(COLUMN_CAP_PROP_NAME_OF_BookName, COLUMN_DB_NAME_OF_BookName);

        map.put(COLUMN_CAP_PROP_NAME_OF_AuthorName, COLUMN_DB_NAME_OF_AuthorName);

        _capPropNameDbNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {cap-prop-name : uncap-prop-name} map. */
    protected static final java.util.Map<String, String> _capPropNameUncapPropNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_CAP_PROP_NAME, TABLE_UNCAP_PROP_NAME);

        map.put(COLUMN_CAP_PROP_NAME_OF_BookId, COLUMN_UNCAP_PROP_NAME_OF_BookId);

        map.put(COLUMN_CAP_PROP_NAME_OF_BookName, COLUMN_UNCAP_PROP_NAME_OF_BookName);

        map.put(COLUMN_CAP_PROP_NAME_OF_AuthorName, COLUMN_UNCAP_PROP_NAME_OF_AuthorName);

        _capPropNameUncapPropNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {uncap-prop-name : db-name} map. */
    protected static final java.util.Map<String, String> _uncapPropNameDbNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_UNCAP_PROP_NAME, TABLE_DB_NAME);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BookId, COLUMN_DB_NAME_OF_BookId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BookName, COLUMN_DB_NAME_OF_BookName);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_AuthorName, COLUMN_DB_NAME_OF_AuthorName);

        _uncapPropNameDbNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {uncap-prop-name : cap-prop-name} map. */
    protected static final java.util.Map<String, String> _uncapPropNameCapPropNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_UNCAP_PROP_NAME, TABLE_CAP_PROP_NAME);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BookId, COLUMN_CAP_PROP_NAME_OF_BookId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BookName, COLUMN_CAP_PROP_NAME_OF_BookName);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_AuthorName, COLUMN_CAP_PROP_NAME_OF_AuthorName);

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

        String msg = "The entity does not have condition-bean. So this method is invalid.";
        throw new IllegalStateException(msg + " dbmeta=" + toString());
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
    public LdBookAuthor newMyEntity() {
        return new LdBookAuthor();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The type of condition-bean. (NotNull)
     */ 
    public LdConditionBean newConditionBean() {

        String msg = "The entity does not have condition-bean. So this method is invalid.";
        throw new IllegalStateException(msg + " dbmeta=" + toString());
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
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_BookId + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of bookId. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_BookId;
    static {
        try {
            ENTITY_SETTER_METHOD_BookId = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_BookId, new Class[] {String.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_BookId + " argsType=String";
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


    /** The getter method of authorName. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_AuthorName;
    static {
        try {
            ENTITY_GETTER_METHOD_AuthorName = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_AuthorName, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_AuthorName + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of authorName. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_AuthorName;
    static {
        try {
            ENTITY_SETTER_METHOD_AuthorName = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_AuthorName, new Class[] {String.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_AuthorName + " argsType=String";
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
     * @return The getter method of authorName. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_AuthorName() {
        return ENTITY_GETTER_METHOD_AuthorName;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of authorName. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_AuthorName() {
        return ENTITY_SETTER_METHOD_AuthorName;
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
        return false;
    }
}

package dbflute.ldb.bsentity.dbmeta;


import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exdao.*;
import dbflute.ldb.exentity.*;

import dbflute.ldb.cbean.*;

/**
 * The dbmeta of LENDING. (Singleton)
 * 
 * <pre>
 * [primary-key]
 *     LENDING_ID
 * 
 * [column-property]
 *     LENDING_ID, LIBRARY_ID, LB_USER_ID, LENDING_DATE, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     library, lbUser
 * 
 * [refferer-property]
 *     lendingCollectionList
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
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
public class LdLendingDbm extends LdAbstractDBMeta {

    /** The type of entity. */
    public static final Class DAO_TYPE = LdLendingDao.class;

    /** The type of entity. */
    public static final Class ENTITY_TYPE = LdLending.class;

    /** The type of condition-bean. */
    public static final Class CONDITION_BEAN_TYPE = LdLendingCB.class;

    /** Singleton instance. */
    private static final LdLendingDbm _instance = new LdLendingDbm();

    /**
     * Constructor
     */
    private LdLendingDbm() {
    }

    /**
     * Get instance.
     * 
     * @return Singleton instance. (NotNull)
     */
    public static LdLendingDbm getInstance() {
        return _instance;
    }

    // =====================================================================================
    //                                                                       Name Definition
    //                                                                       ===============
    /** Table db name. */
    public static final String TABLE_DB_NAME = "LENDING";

    /** Table cap-prop name. */
    public static final String TABLE_CAP_PROP_NAME = "Lending";

    /** Table uncap-prop name. */
    public static final String TABLE_UNCAP_PROP_NAME = "lending";


    /** Db-name of LendingId. */
    public static final String COLUMN_DB_NAME_OF_LendingId = "LENDING_ID";

    /** Db-name of LibraryId. */
    public static final String COLUMN_DB_NAME_OF_LibraryId = "LIBRARY_ID";

    /** Db-name of LbUserId. */
    public static final String COLUMN_DB_NAME_OF_LbUserId = "LB_USER_ID";

    /** Db-name of LendingDate. */
    public static final String COLUMN_DB_NAME_OF_LendingDate = "LENDING_DATE";

    /** Db-name of RTime. */
    public static final String COLUMN_DB_NAME_OF_RTime = "R_TIME";

    /** Db-name of UTime. */
    public static final String COLUMN_DB_NAME_OF_UTime = "U_TIME";

    /** Db-name of RStaff. */
    public static final String COLUMN_DB_NAME_OF_RStaff = "R_STAFF";

    /** Db-name of UStaff. */
    public static final String COLUMN_DB_NAME_OF_UStaff = "U_STAFF";


    /** Cap-prop-name of LendingId. */
    public static final String COLUMN_CAP_PROP_NAME_OF_LendingId = "LendingId";

    /** Cap-prop-name of LibraryId. */
    public static final String COLUMN_CAP_PROP_NAME_OF_LibraryId = "LibraryId";

    /** Cap-prop-name of LbUserId. */
    public static final String COLUMN_CAP_PROP_NAME_OF_LbUserId = "LbUserId";

    /** Cap-prop-name of LendingDate. */
    public static final String COLUMN_CAP_PROP_NAME_OF_LendingDate = "LendingDate";

    /** Cap-prop-name of RTime. */
    public static final String COLUMN_CAP_PROP_NAME_OF_RTime = "RTime";

    /** Cap-prop-name of UTime. */
    public static final String COLUMN_CAP_PROP_NAME_OF_UTime = "UTime";

    /** Cap-prop-name of RStaff. */
    public static final String COLUMN_CAP_PROP_NAME_OF_RStaff = "RStaff";

    /** Cap-prop-name of UStaff. */
    public static final String COLUMN_CAP_PROP_NAME_OF_UStaff = "UStaff";

    /** Cap-prop-name of library. */
    public static final String COLUMN_CAP_PROP_NAME_OF_Library = "Library";

    /** Cap-prop-name of lbUser. */
    public static final String COLUMN_CAP_PROP_NAME_OF_LbUser = "LbUser";

    /** Cap-prop-name of LendingCollectionList. */
    public static final String COLUMN_CAP_PROP_NAME_OF_LendingCollectionList = "LendingCollectionList";


    /** Uncap-prop-name of LendingId. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_LendingId = "lendingId";

    /** Uncap-prop-name of LibraryId. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_LibraryId = "libraryId";

    /** Uncap-prop-name of LbUserId. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_LbUserId = "lbUserId";

    /** Uncap-prop-name of LendingDate. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_LendingDate = "lendingDate";

    /** Uncap-prop-name of RTime. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_RTime = "rTime";

    /** Uncap-prop-name of UTime. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_UTime = "uTime";

    /** Uncap-prop-name of RStaff. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_RStaff = "rStaff";

    /** Uncap-prop-name of UStaff. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_UStaff = "uStaff";

    /** Uncap-prop-name of library. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_Library = "library";

    /** Uncap-prop-name of lbUser. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_LbUser = "lbUser";

    /** Uncap-prop-name of lendingCollectionList. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_LendingCollectionList = "lendingCollectionList";

    /** {db-name : cap-prop-name} map. */
    protected static final java.util.Map<String, String> _dbNameCapPropNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_DB_NAME, TABLE_CAP_PROP_NAME);

        map.put(COLUMN_DB_NAME_OF_LendingId, COLUMN_CAP_PROP_NAME_OF_LendingId);

        map.put(COLUMN_DB_NAME_OF_LibraryId, COLUMN_CAP_PROP_NAME_OF_LibraryId);

        map.put(COLUMN_DB_NAME_OF_LbUserId, COLUMN_CAP_PROP_NAME_OF_LbUserId);

        map.put(COLUMN_DB_NAME_OF_LendingDate, COLUMN_CAP_PROP_NAME_OF_LendingDate);

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

        map.put(COLUMN_DB_NAME_OF_LendingId, COLUMN_UNCAP_PROP_NAME_OF_LendingId);

        map.put(COLUMN_DB_NAME_OF_LibraryId, COLUMN_UNCAP_PROP_NAME_OF_LibraryId);

        map.put(COLUMN_DB_NAME_OF_LbUserId, COLUMN_UNCAP_PROP_NAME_OF_LbUserId);

        map.put(COLUMN_DB_NAME_OF_LendingDate, COLUMN_UNCAP_PROP_NAME_OF_LendingDate);

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

        map.put(COLUMN_CAP_PROP_NAME_OF_LendingId, COLUMN_DB_NAME_OF_LendingId);

        map.put(COLUMN_CAP_PROP_NAME_OF_LibraryId, COLUMN_DB_NAME_OF_LibraryId);

        map.put(COLUMN_CAP_PROP_NAME_OF_LbUserId, COLUMN_DB_NAME_OF_LbUserId);

        map.put(COLUMN_CAP_PROP_NAME_OF_LendingDate, COLUMN_DB_NAME_OF_LendingDate);

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

        map.put(COLUMN_CAP_PROP_NAME_OF_LendingId, COLUMN_UNCAP_PROP_NAME_OF_LendingId);

        map.put(COLUMN_CAP_PROP_NAME_OF_LibraryId, COLUMN_UNCAP_PROP_NAME_OF_LibraryId);

        map.put(COLUMN_CAP_PROP_NAME_OF_LbUserId, COLUMN_UNCAP_PROP_NAME_OF_LbUserId);

        map.put(COLUMN_CAP_PROP_NAME_OF_LendingDate, COLUMN_UNCAP_PROP_NAME_OF_LendingDate);

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

        map.put(COLUMN_UNCAP_PROP_NAME_OF_LendingId, COLUMN_DB_NAME_OF_LendingId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_LibraryId, COLUMN_DB_NAME_OF_LibraryId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_LbUserId, COLUMN_DB_NAME_OF_LbUserId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_LendingDate, COLUMN_DB_NAME_OF_LendingDate);

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

        map.put(COLUMN_UNCAP_PROP_NAME_OF_LendingId, COLUMN_CAP_PROP_NAME_OF_LendingId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_LibraryId, COLUMN_CAP_PROP_NAME_OF_LibraryId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_LbUserId, COLUMN_CAP_PROP_NAME_OF_LbUserId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_LendingDate, COLUMN_CAP_PROP_NAME_OF_LendingDate);

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
    public LdLending newMyEntity() {
        return new LdLending();
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
    public LdLendingCB newMyConditionBean() {
        return new LdLendingCB();
    }

    // =====================================================================================
    //                                                                         Entity Method
    //                                                                         =============

    /** The getter method of lendingId. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_LendingId;
    static {
        try {
            ENTITY_GETTER_METHOD_LendingId = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_LendingId, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_LendingId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of lendingId. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_LendingId;
    static {
        try {
            ENTITY_SETTER_METHOD_LendingId = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_LendingId, new Class[] {java.math.BigDecimal.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_LendingId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of libraryId. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_LibraryId;
    static {
        try {
            ENTITY_GETTER_METHOD_LibraryId = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_LibraryId, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_LibraryId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of libraryId. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_LibraryId;
    static {
        try {
            ENTITY_SETTER_METHOD_LibraryId = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_LibraryId, new Class[] {java.math.BigDecimal.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_LibraryId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of lbUserId. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_LbUserId;
    static {
        try {
            ENTITY_GETTER_METHOD_LbUserId = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_LbUserId, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_LbUserId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of lbUserId. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_LbUserId;
    static {
        try {
            ENTITY_SETTER_METHOD_LbUserId = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_LbUserId, new Class[] {java.math.BigDecimal.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_LbUserId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of lendingDate. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_LendingDate;
    static {
        try {
            ENTITY_GETTER_METHOD_LendingDate = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_LendingDate, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_LendingDate + " argsType=java.sql.Timestamp";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of lendingDate. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_LendingDate;
    static {
        try {
            ENTITY_SETTER_METHOD_LendingDate = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_LendingDate, new Class[] {java.sql.Timestamp.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_LendingDate + " argsType=java.sql.Timestamp";
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
     * @return The getter method of lendingId. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_LendingId() {
        return ENTITY_GETTER_METHOD_LendingId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of lendingId. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_LendingId() {
        return ENTITY_SETTER_METHOD_LendingId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of libraryId. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_LibraryId() {
        return ENTITY_GETTER_METHOD_LibraryId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of libraryId. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_LibraryId() {
        return ENTITY_SETTER_METHOD_LibraryId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of lbUserId. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_LbUserId() {
        return ENTITY_GETTER_METHOD_LbUserId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of lbUserId. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_LbUserId() {
        return ENTITY_SETTER_METHOD_LbUserId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of lendingDate. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_LendingDate() {
        return ENTITY_GETTER_METHOD_LendingDate;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of lendingDate. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_LendingDate() {
        return ENTITY_SETTER_METHOD_LendingDate;
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
     * Get foreign dbmeta of Library.
     * 
     * @return Foreign DBMeta. (NotNull)
     */
    public LdLibraryDbm getForeignDBMeta_Library() {
        return LdLibraryDbm.getInstance();
    }

    /**
     * Get foreign dbmeta of LbUser.
     * 
     * @return Foreign DBMeta. (NotNull)
     */
    public LdLbUserDbm getForeignDBMeta_LbUser() {
        return LdLbUserDbm.getInstance();
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

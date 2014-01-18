package dbflute.ldb.bsentity.dbmeta;


import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exdao.*;
import dbflute.ldb.exentity.*;

import dbflute.ldb.cbean.*;

/**
 * The dbmeta of BLACK_ACTION. (Singleton)
 * 
 * <pre>
 * [primary-key]
 *     BLACK_ACTION_ID
 * 
 * [column-property]
 *     BLACK_ACTION_ID, BLACK_LIST_ID, BLACK_ACTION_CODE, BLACK_LEVEL, EVIDENCE_PHOTOGRAPH, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     blackList, blackActionLookup
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
 *     UTime
 * 
 * [version-no]
 *     
 * 
 * </pre>
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdBlackActionDbm extends LdAbstractDBMeta {

    /** The type of entity. */
    public static final Class DAO_TYPE = LdBlackActionDao.class;

    /** The type of entity. */
    public static final Class ENTITY_TYPE = LdBlackAction.class;

    /** The type of condition-bean. */
    public static final Class CONDITION_BEAN_TYPE = LdBlackActionCB.class;

    /** Singleton instance. */
    private static final LdBlackActionDbm _instance = new LdBlackActionDbm();

    /**
     * Constructor
     */
    private LdBlackActionDbm() {
    }

    /**
     * Get instance.
     * 
     * @return Singleton instance. (NotNull)
     */
    public static LdBlackActionDbm getInstance() {
        return _instance;
    }

    // =====================================================================================
    //                                                                       Name Definition
    //                                                                       ===============
    /** Table db name. */
    public static final String TABLE_DB_NAME = "BLACK_ACTION";

    /** Table cap-prop name. */
    public static final String TABLE_CAP_PROP_NAME = "BlackAction";

    /** Table uncap-prop name. */
    public static final String TABLE_UNCAP_PROP_NAME = "blackAction";


    /** Db-name of BlackActionId. */
    public static final String COLUMN_DB_NAME_OF_BlackActionId = "BLACK_ACTION_ID";

    /** Db-name of BlackListId. */
    public static final String COLUMN_DB_NAME_OF_BlackListId = "BLACK_LIST_ID";

    /** Db-name of BlackActionCode. */
    public static final String COLUMN_DB_NAME_OF_BlackActionCode = "BLACK_ACTION_CODE";

    /** Db-name of BlackLevel. */
    public static final String COLUMN_DB_NAME_OF_BlackLevel = "BLACK_LEVEL";

    /** Db-name of EvidencePhotograph. */
    public static final String COLUMN_DB_NAME_OF_EvidencePhotograph = "EVIDENCE_PHOTOGRAPH";

    /** Db-name of RTime. */
    public static final String COLUMN_DB_NAME_OF_RTime = "R_TIME";

    /** Db-name of UTime. */
    public static final String COLUMN_DB_NAME_OF_UTime = "U_TIME";

    /** Db-name of RStaff. */
    public static final String COLUMN_DB_NAME_OF_RStaff = "R_STAFF";

    /** Db-name of UStaff. */
    public static final String COLUMN_DB_NAME_OF_UStaff = "U_STAFF";


    /** Cap-prop-name of BlackActionId. */
    public static final String COLUMN_CAP_PROP_NAME_OF_BlackActionId = "BlackActionId";

    /** Cap-prop-name of BlackListId. */
    public static final String COLUMN_CAP_PROP_NAME_OF_BlackListId = "BlackListId";

    /** Cap-prop-name of BlackActionCode. */
    public static final String COLUMN_CAP_PROP_NAME_OF_BlackActionCode = "BlackActionCode";

    /** Cap-prop-name of BlackLevel. */
    public static final String COLUMN_CAP_PROP_NAME_OF_BlackLevel = "BlackLevel";

    /** Cap-prop-name of EvidencePhotograph. */
    public static final String COLUMN_CAP_PROP_NAME_OF_EvidencePhotograph = "EvidencePhotograph";

    /** Cap-prop-name of RTime. */
    public static final String COLUMN_CAP_PROP_NAME_OF_RTime = "RTime";

    /** Cap-prop-name of UTime. */
    public static final String COLUMN_CAP_PROP_NAME_OF_UTime = "UTime";

    /** Cap-prop-name of RStaff. */
    public static final String COLUMN_CAP_PROP_NAME_OF_RStaff = "RStaff";

    /** Cap-prop-name of UStaff. */
    public static final String COLUMN_CAP_PROP_NAME_OF_UStaff = "UStaff";

    /** Cap-prop-name of blackList. */
    public static final String COLUMN_CAP_PROP_NAME_OF_BlackList = "BlackList";

    /** Cap-prop-name of blackActionLookup. */
    public static final String COLUMN_CAP_PROP_NAME_OF_BlackActionLookup = "BlackActionLookup";


    /** Uncap-prop-name of BlackActionId. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_BlackActionId = "blackActionId";

    /** Uncap-prop-name of BlackListId. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_BlackListId = "blackListId";

    /** Uncap-prop-name of BlackActionCode. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_BlackActionCode = "blackActionCode";

    /** Uncap-prop-name of BlackLevel. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_BlackLevel = "blackLevel";

    /** Uncap-prop-name of EvidencePhotograph. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_EvidencePhotograph = "evidencePhotograph";

    /** Uncap-prop-name of RTime. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_RTime = "rTime";

    /** Uncap-prop-name of UTime. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_UTime = "uTime";

    /** Uncap-prop-name of RStaff. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_RStaff = "rStaff";

    /** Uncap-prop-name of UStaff. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_UStaff = "uStaff";

    /** Uncap-prop-name of blackList. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_BlackList = "blackList";

    /** Uncap-prop-name of blackActionLookup. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_BlackActionLookup = "blackActionLookup";

    /** {db-name : cap-prop-name} map. */
    protected static final java.util.Map<String, String> _dbNameCapPropNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_DB_NAME, TABLE_CAP_PROP_NAME);

        map.put(COLUMN_DB_NAME_OF_BlackActionId, COLUMN_CAP_PROP_NAME_OF_BlackActionId);

        map.put(COLUMN_DB_NAME_OF_BlackListId, COLUMN_CAP_PROP_NAME_OF_BlackListId);

        map.put(COLUMN_DB_NAME_OF_BlackActionCode, COLUMN_CAP_PROP_NAME_OF_BlackActionCode);

        map.put(COLUMN_DB_NAME_OF_BlackLevel, COLUMN_CAP_PROP_NAME_OF_BlackLevel);

        map.put(COLUMN_DB_NAME_OF_EvidencePhotograph, COLUMN_CAP_PROP_NAME_OF_EvidencePhotograph);

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

        map.put(COLUMN_DB_NAME_OF_BlackActionId, COLUMN_UNCAP_PROP_NAME_OF_BlackActionId);

        map.put(COLUMN_DB_NAME_OF_BlackListId, COLUMN_UNCAP_PROP_NAME_OF_BlackListId);

        map.put(COLUMN_DB_NAME_OF_BlackActionCode, COLUMN_UNCAP_PROP_NAME_OF_BlackActionCode);

        map.put(COLUMN_DB_NAME_OF_BlackLevel, COLUMN_UNCAP_PROP_NAME_OF_BlackLevel);

        map.put(COLUMN_DB_NAME_OF_EvidencePhotograph, COLUMN_UNCAP_PROP_NAME_OF_EvidencePhotograph);

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

        map.put(COLUMN_CAP_PROP_NAME_OF_BlackActionId, COLUMN_DB_NAME_OF_BlackActionId);

        map.put(COLUMN_CAP_PROP_NAME_OF_BlackListId, COLUMN_DB_NAME_OF_BlackListId);

        map.put(COLUMN_CAP_PROP_NAME_OF_BlackActionCode, COLUMN_DB_NAME_OF_BlackActionCode);

        map.put(COLUMN_CAP_PROP_NAME_OF_BlackLevel, COLUMN_DB_NAME_OF_BlackLevel);

        map.put(COLUMN_CAP_PROP_NAME_OF_EvidencePhotograph, COLUMN_DB_NAME_OF_EvidencePhotograph);

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

        map.put(COLUMN_CAP_PROP_NAME_OF_BlackActionId, COLUMN_UNCAP_PROP_NAME_OF_BlackActionId);

        map.put(COLUMN_CAP_PROP_NAME_OF_BlackListId, COLUMN_UNCAP_PROP_NAME_OF_BlackListId);

        map.put(COLUMN_CAP_PROP_NAME_OF_BlackActionCode, COLUMN_UNCAP_PROP_NAME_OF_BlackActionCode);

        map.put(COLUMN_CAP_PROP_NAME_OF_BlackLevel, COLUMN_UNCAP_PROP_NAME_OF_BlackLevel);

        map.put(COLUMN_CAP_PROP_NAME_OF_EvidencePhotograph, COLUMN_UNCAP_PROP_NAME_OF_EvidencePhotograph);

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

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BlackActionId, COLUMN_DB_NAME_OF_BlackActionId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BlackListId, COLUMN_DB_NAME_OF_BlackListId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BlackActionCode, COLUMN_DB_NAME_OF_BlackActionCode);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BlackLevel, COLUMN_DB_NAME_OF_BlackLevel);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_EvidencePhotograph, COLUMN_DB_NAME_OF_EvidencePhotograph);

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

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BlackActionId, COLUMN_CAP_PROP_NAME_OF_BlackActionId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BlackListId, COLUMN_CAP_PROP_NAME_OF_BlackListId);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BlackActionCode, COLUMN_CAP_PROP_NAME_OF_BlackActionCode);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_BlackLevel, COLUMN_CAP_PROP_NAME_OF_BlackLevel);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_EvidencePhotograph, COLUMN_CAP_PROP_NAME_OF_EvidencePhotograph);

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
    public LdBlackAction newMyEntity() {
        return new LdBlackAction();
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
    public LdBlackActionCB newMyConditionBean() {
        return new LdBlackActionCB();
    }

    // =====================================================================================
    //                                                                         Entity Method
    //                                                                         =============

    /** The getter method of blackActionId. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_BlackActionId;
    static {
        try {
            ENTITY_GETTER_METHOD_BlackActionId = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_BlackActionId, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_BlackActionId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of blackActionId. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_BlackActionId;
    static {
        try {
            ENTITY_SETTER_METHOD_BlackActionId = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_BlackActionId, new Class[] {java.math.BigDecimal.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_BlackActionId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of blackListId. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_BlackListId;
    static {
        try {
            ENTITY_GETTER_METHOD_BlackListId = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_BlackListId, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_BlackListId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of blackListId. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_BlackListId;
    static {
        try {
            ENTITY_SETTER_METHOD_BlackListId = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_BlackListId, new Class[] {java.math.BigDecimal.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_BlackListId + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of blackActionCode. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_BlackActionCode;
    static {
        try {
            ENTITY_GETTER_METHOD_BlackActionCode = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_BlackActionCode, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_BlackActionCode + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of blackActionCode. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_BlackActionCode;
    static {
        try {
            ENTITY_SETTER_METHOD_BlackActionCode = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_BlackActionCode, new Class[] {String.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_BlackActionCode + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of blackLevel. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_BlackLevel;
    static {
        try {
            ENTITY_GETTER_METHOD_BlackLevel = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_BlackLevel, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_BlackLevel + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of blackLevel. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_BlackLevel;
    static {
        try {
            ENTITY_SETTER_METHOD_BlackLevel = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_BlackLevel, new Class[] {java.math.BigDecimal.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_BlackLevel + " argsType=java.math.BigDecimal";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of evidencePhotograph. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_EvidencePhotograph;
    static {
        try {
            ENTITY_GETTER_METHOD_EvidencePhotograph = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_EvidencePhotograph, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_EvidencePhotograph + " argsType=byte[]";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of evidencePhotograph. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_EvidencePhotograph;
    static {
        try {
            ENTITY_SETTER_METHOD_EvidencePhotograph = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_EvidencePhotograph, new Class[] {byte[].class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_EvidencePhotograph + " argsType=byte[]";
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
     * @return The getter method of blackActionId. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_BlackActionId() {
        return ENTITY_GETTER_METHOD_BlackActionId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of blackActionId. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_BlackActionId() {
        return ENTITY_SETTER_METHOD_BlackActionId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of blackListId. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_BlackListId() {
        return ENTITY_GETTER_METHOD_BlackListId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of blackListId. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_BlackListId() {
        return ENTITY_SETTER_METHOD_BlackListId;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of blackActionCode. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_BlackActionCode() {
        return ENTITY_GETTER_METHOD_BlackActionCode;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of blackActionCode. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_BlackActionCode() {
        return ENTITY_SETTER_METHOD_BlackActionCode;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of blackLevel. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_BlackLevel() {
        return ENTITY_GETTER_METHOD_BlackLevel;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of blackLevel. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_BlackLevel() {
        return ENTITY_SETTER_METHOD_BlackLevel;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of evidencePhotograph. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_EvidencePhotograph() {
        return ENTITY_GETTER_METHOD_EvidencePhotograph;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of evidencePhotograph. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_EvidencePhotograph() {
        return ENTITY_SETTER_METHOD_EvidencePhotograph;
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
     * Get foreign dbmeta of BlackList.
     * 
     * @return Foreign DBMeta. (NotNull)
     */
    public LdBlackListDbm getForeignDBMeta_BlackList() {
        return LdBlackListDbm.getInstance();
    }

    /**
     * Get foreign dbmeta of BlackActionLookup.
     * 
     * @return Foreign DBMeta. (NotNull)
     */
    public LdBlackActionLookupDbm getForeignDBMeta_BlackActionLookup() {
        return LdBlackActionLookupDbm.getInstance();
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

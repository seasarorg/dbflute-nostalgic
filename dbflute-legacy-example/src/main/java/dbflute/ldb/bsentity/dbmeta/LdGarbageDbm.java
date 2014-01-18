package dbflute.ldb.bsentity.dbmeta;


import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exdao.*;
import dbflute.ldb.exentity.*;

import dbflute.ldb.cbean.*;

/**
 * The dbmeta of GARBAGE. (Singleton)
 * 
 * <pre>
 * [primary-key]
 *     
 * 
 * [column-property]
 *     GARBAGE_MEMO, GARBAGE_TIME
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
public class LdGarbageDbm extends LdAbstractDBMeta {

    /** The type of entity. */
    public static final Class DAO_TYPE = LdGarbageDao.class;

    /** The type of entity. */
    public static final Class ENTITY_TYPE = LdGarbage.class;

    /** The type of condition-bean. */
    public static final Class CONDITION_BEAN_TYPE = LdGarbageCB.class;

    /** Singleton instance. */
    private static final LdGarbageDbm _instance = new LdGarbageDbm();

    /**
     * Constructor
     */
    private LdGarbageDbm() {
    }

    /**
     * Get instance.
     * 
     * @return Singleton instance. (NotNull)
     */
    public static LdGarbageDbm getInstance() {
        return _instance;
    }

    // =====================================================================================
    //                                                                       Name Definition
    //                                                                       ===============
    /** Table db name. */
    public static final String TABLE_DB_NAME = "GARBAGE";

    /** Table cap-prop name. */
    public static final String TABLE_CAP_PROP_NAME = "Garbage";

    /** Table uncap-prop name. */
    public static final String TABLE_UNCAP_PROP_NAME = "garbage";


    /** Db-name of GarbageMemo. */
    public static final String COLUMN_DB_NAME_OF_GarbageMemo = "GARBAGE_MEMO";

    /** Db-name of GarbageTime. */
    public static final String COLUMN_DB_NAME_OF_GarbageTime = "GARBAGE_TIME";


    /** Cap-prop-name of GarbageMemo. */
    public static final String COLUMN_CAP_PROP_NAME_OF_GarbageMemo = "GarbageMemo";

    /** Cap-prop-name of GarbageTime. */
    public static final String COLUMN_CAP_PROP_NAME_OF_GarbageTime = "GarbageTime";


    /** Uncap-prop-name of GarbageMemo. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_GarbageMemo = "garbageMemo";

    /** Uncap-prop-name of GarbageTime. */
    public static final String COLUMN_UNCAP_PROP_NAME_OF_GarbageTime = "garbageTime";

    /** {db-name : cap-prop-name} map. */
    protected static final java.util.Map<String, String> _dbNameCapPropNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_DB_NAME, TABLE_CAP_PROP_NAME);

        map.put(COLUMN_DB_NAME_OF_GarbageMemo, COLUMN_CAP_PROP_NAME_OF_GarbageMemo);

        map.put(COLUMN_DB_NAME_OF_GarbageTime, COLUMN_CAP_PROP_NAME_OF_GarbageTime);

        _dbNameCapPropNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {db-name : uncap-prop-name} map. */
    protected static final java.util.Map<String, String> _dbNameUncapPropNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_DB_NAME, TABLE_UNCAP_PROP_NAME);

        map.put(COLUMN_DB_NAME_OF_GarbageMemo, COLUMN_UNCAP_PROP_NAME_OF_GarbageMemo);

        map.put(COLUMN_DB_NAME_OF_GarbageTime, COLUMN_UNCAP_PROP_NAME_OF_GarbageTime);

        _dbNameUncapPropNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {cap-prop-name : db-name} map. */
    protected static final java.util.Map<String, String> _capPropNameDbNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_CAP_PROP_NAME, TABLE_DB_NAME);

        map.put(COLUMN_CAP_PROP_NAME_OF_GarbageMemo, COLUMN_DB_NAME_OF_GarbageMemo);

        map.put(COLUMN_CAP_PROP_NAME_OF_GarbageTime, COLUMN_DB_NAME_OF_GarbageTime);

        _capPropNameDbNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {cap-prop-name : uncap-prop-name} map. */
    protected static final java.util.Map<String, String> _capPropNameUncapPropNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_CAP_PROP_NAME, TABLE_UNCAP_PROP_NAME);

        map.put(COLUMN_CAP_PROP_NAME_OF_GarbageMemo, COLUMN_UNCAP_PROP_NAME_OF_GarbageMemo);

        map.put(COLUMN_CAP_PROP_NAME_OF_GarbageTime, COLUMN_UNCAP_PROP_NAME_OF_GarbageTime);

        _capPropNameUncapPropNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {uncap-prop-name : db-name} map. */
    protected static final java.util.Map<String, String> _uncapPropNameDbNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_UNCAP_PROP_NAME, TABLE_DB_NAME);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_GarbageMemo, COLUMN_DB_NAME_OF_GarbageMemo);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_GarbageTime, COLUMN_DB_NAME_OF_GarbageTime);

        _uncapPropNameDbNameMap = java.util.Collections.unmodifiableMap(map);
    }

    /** {uncap-prop-name : cap-prop-name} map. */
    protected static final java.util.Map<String, String> _uncapPropNameCapPropNameMap;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
        map.put(TABLE_UNCAP_PROP_NAME, TABLE_CAP_PROP_NAME);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_GarbageMemo, COLUMN_CAP_PROP_NAME_OF_GarbageMemo);

        map.put(COLUMN_UNCAP_PROP_NAME_OF_GarbageTime, COLUMN_CAP_PROP_NAME_OF_GarbageTime);

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
    public LdGarbage newMyEntity() {
        return new LdGarbage();
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
    public LdGarbageCB newMyConditionBean() {
        return new LdGarbageCB();
    }

    // =====================================================================================
    //                                                                         Entity Method
    //                                                                         =============

    /** The getter method of garbageMemo. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_GarbageMemo;
    static {
        try {
            ENTITY_GETTER_METHOD_GarbageMemo = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_GarbageMemo, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_GarbageMemo + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of garbageMemo. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_GarbageMemo;
    static {
        try {
            ENTITY_SETTER_METHOD_GarbageMemo = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_GarbageMemo, new Class[] {String.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_GarbageMemo + " argsType=String";
            throw new IllegalStateException(msg, e);
        }
    }


    /** The getter method of garbageTime. */
    public static final java.lang.reflect.Method ENTITY_GETTER_METHOD_GarbageTime;
    static {
        try {
            ENTITY_GETTER_METHOD_GarbageTime = ENTITY_TYPE.getMethod("get" + COLUMN_CAP_PROP_NAME_OF_GarbageTime, new Class[] {});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_GarbageTime + " argsType=java.sql.Timestamp";
            throw new IllegalStateException(msg, e);
        }
    }

    /** <summary>The setter method of garbageTime. */
    public static final java.lang.reflect.Method ENTITY_SETTER_METHOD_GarbageTime;
    static {
        try {
            ENTITY_SETTER_METHOD_GarbageTime = ENTITY_TYPE.getMethod("set" + COLUMN_CAP_PROP_NAME_OF_GarbageTime, new Class[] {java.sql.Timestamp.class});
        } catch (NoSuchMethodException e) {
            String msg = "The method doen not exist: methodName=" + "get" + COLUMN_CAP_PROP_NAME_OF_GarbageTime + " argsType=java.sql.Timestamp";
            throw new IllegalStateException(msg, e);
        }
    }



    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of garbageMemo. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_GarbageMemo() {
        return ENTITY_GETTER_METHOD_GarbageMemo;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of garbageMemo. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_GarbageMemo() {
        return ENTITY_SETTER_METHOD_GarbageMemo;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The getter method of garbageTime. (NotNull)
     */
    public java.lang.reflect.Method getEntityGetterMethod_GarbageTime() {
        return ENTITY_GETTER_METHOD_GarbageTime;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return The setter method of garbageTime. (NotNull)
     */
    public java.lang.reflect.Method getEntitySetterMethod_GarbageTime() {
        return ENTITY_SETTER_METHOD_GarbageTime;
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

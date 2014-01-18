/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.dbmeta;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;

import dbflute.ldb.allcommon.exception.LdDBMetaNotFoundException;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;
import dbflute.ldb.allcommon.util.LdSimpleAssertUtil;

/**
 * The handler of the instance of DB meta.
 * @author DBFlute(AutoGenerator)
 */
public class LdDBMetaInstanceHandler implements LdDBMetaProvider {

    // ===================================================================================
    //                                                                        Resource Map
    //                                                                        ============
    /** Table DB-name instance map. */
    protected static final Map<String, LdDBMeta> _tableDbNameInstanceMap = newConcurrentHashMap();

    /** The map of table DB name and class name. This is for initialization. */
    protected static final Map<String, String> _tableDbNameClassNameMap;
    static {
        final Map<String, String> tmpMap = newConcurrentHashMap();
        tmpMap.put("AUTHOR", "dbflute.ldb.bsentity.dbmeta.LdAuthorDbm");
        tmpMap.put("BLACK_ACTION", "dbflute.ldb.bsentity.dbmeta.LdBlackActionDbm");
        tmpMap.put("BLACK_ACTION_LOOKUP", "dbflute.ldb.bsentity.dbmeta.LdBlackActionLookupDbm");
        tmpMap.put("BLACK_LIST", "dbflute.ldb.bsentity.dbmeta.LdBlackListDbm");
        tmpMap.put("BOOK", "dbflute.ldb.bsentity.dbmeta.LdBookDbm");
        tmpMap.put("COLLECTION", "dbflute.ldb.bsentity.dbmeta.LdCollectionDbm");
        tmpMap.put("COLLECTION_STATUS", "dbflute.ldb.bsentity.dbmeta.LdCollectionStatusDbm");
        tmpMap.put("COLLECTION_STATUS_LOOKUP", "dbflute.ldb.bsentity.dbmeta.LdCollectionStatusLookupDbm");
        tmpMap.put("GARBAGE", "dbflute.ldb.bsentity.dbmeta.LdGarbageDbm");
        tmpMap.put("GARBAGE_PLUS", "dbflute.ldb.bsentity.dbmeta.LdGarbagePlusDbm");
        tmpMap.put("GENRE", "dbflute.ldb.bsentity.dbmeta.LdGenreDbm");
        tmpMap.put("LB_USER", "dbflute.ldb.bsentity.dbmeta.LdLbUserDbm");
        tmpMap.put("LENDING", "dbflute.ldb.bsentity.dbmeta.LdLendingDbm");
        tmpMap.put("LENDING_COLLECTION", "dbflute.ldb.bsentity.dbmeta.LdLendingCollectionDbm");
        tmpMap.put("LIBRARY", "dbflute.ldb.bsentity.dbmeta.LdLibraryDbm");
        tmpMap.put("LIBRARY_TYPE_LOOKUP", "dbflute.ldb.bsentity.dbmeta.LdLibraryTypeLookupDbm");
        tmpMap.put("LIBRARY_USER", "dbflute.ldb.bsentity.dbmeta.LdLibraryUserDbm");
        tmpMap.put("NEXT_LIBRARY", "dbflute.ldb.bsentity.dbmeta.LdNextLibraryDbm");
        tmpMap.put("PUBLISHER", "dbflute.ldb.bsentity.dbmeta.LdPublisherDbm");
        _tableDbNameClassNameMap = Collections.unmodifiableMap(tmpMap);
    }

    /** The flexible map of table DB name. This is for conversion at finding. */
    protected static final Map<String, String> _tableDbNameFlexibleMap = LdStringKeyMap.createAsFlexibleConcurrent();
    static {
        final Set<String> tableDbNameSet = _tableDbNameClassNameMap.keySet();
        for (String tableDbName : tableDbNameSet) {
            _tableDbNameFlexibleMap.put(tableDbName, tableDbName);
        }
    }

    /**
     * @return The initialized map that contains all instances of DB meta. (NotNull & NotEmpty)
     */
    public static Map<String, LdDBMeta> getDBMetaMap() {
        initializeDBMetaMap();
        return _tableDbNameInstanceMap;
    }

    /**
     * Initialize the map of DB meta.
     */
    protected static void initializeDBMetaMap() {
        if (isInitialized()) {
            return;
        }
        final Set<String> tableDbNameSet = _tableDbNameClassNameMap.keySet();
        for (String tableDbName : tableDbNameSet) {
            findDBMeta(tableDbName); // Initialize!
        }
        if (!isInitialized()) {
            String msg = "Failed to initialize tableDbNameInstanceMap:";
            msg = msg + " tableDbNameInstanceMap=" + _tableDbNameInstanceMap;
            throw new IllegalStateException(msg);
        }
    }

    protected static boolean isInitialized() {
        return _tableDbNameInstanceMap.size() == _tableDbNameClassNameMap.size();
    }

    // ===================================================================================
    //                                                                         Main Method
    //                                                                         ===========
    /**
     * Find DB meta by table flexible name.
     * <pre>
     * If the table name is 'ORDER_DETAIL', you can find the DB meta by ...(as follows)
     *     'ORDER_DETAIL', 'ORDer_DeTAiL', 'order_detail'
     *     , 'OrderDetail', 'orderdetail', 'oRderDetaIl'
     * </pre>
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdDBMetaNotFoundException When the DB meta is not found.
     */
    public static LdDBMeta findDBMeta(String tableFlexibleName) {
        LdDBMeta dbmeta = byTableFlexibleName(tableFlexibleName);
        if (dbmeta == null) {
            String msg = "The DB meta was not found by the table flexible name: " + tableFlexibleName;
            msg = msg + " key=" + tableFlexibleName + " instanceMap=" + _tableDbNameInstanceMap;
            throw new LdDBMetaNotFoundException(msg);
        }
        return dbmeta;
    }

    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (Nullable: If the DB meta is not found, it returns null)
     */
    protected static LdDBMeta byTableFlexibleName(String tableFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("tableFlexibleName", tableFlexibleName);
        final int dotLastIndex = tableFlexibleName.lastIndexOf(".");
        if (dotLastIndex >= 0) {
            tableFlexibleName = tableFlexibleName.substring(dotLastIndex + ".".length());
        }
        final String tableDbName = _tableDbNameFlexibleMap.get(tableFlexibleName);
        if (tableDbName != null) {
            return byTableDbName(tableDbName);
        }
        return null;
    }

    /**
     * @param tableDbName The DB name of table. (NotNull)
     * @return The instance of DB meta. (Nullable: If the DB meta is not found, it returns null)
     */
    protected static LdDBMeta byTableDbName(String tableDbName) {
        assertStringNotNullAndNotTrimmedEmpty("tableDbName", tableDbName);
        return getCachedDBMeta(tableDbName);
    }
    
    protected static LdDBMeta getCachedDBMeta(String tableName) {// For lazy-load! Thank you koyak!
        if (_tableDbNameInstanceMap.containsKey(tableName)) {
            return _tableDbNameInstanceMap.get(tableName);
        }
        synchronized (_tableDbNameInstanceMap) {
            if (_tableDbNameInstanceMap.containsKey(tableName)) {
                return _tableDbNameInstanceMap.get(tableName);
            }
            String entityName = _tableDbNameClassNameMap.get(tableName);
            _tableDbNameInstanceMap.put(tableName, getDBMeta(entityName));
        }
        return _tableDbNameInstanceMap.get(tableName);
    }

    protected static LdDBMeta getDBMeta(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            Method methoz = clazz.getMethod("getInstance", (Class[])null);
            Object result = methoz.invoke(null, (Object[])null);
            return (LdDBMeta)result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // ===================================================================================
    //                                                             Provider Implementation
    //                                                             =======================
    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (Nullable: If the DB meta is not found, it returns null)
     */
    public LdDBMeta provideDBMeta(String tableFlexibleName) {
        return byTableFlexibleName(tableFlexibleName);
    }

    /**
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdDBMetaNotFoundException When the DB meta is not found.
     */
    public LdDBMeta provideDBMetaChecked(String tableFlexibleName) {
        return findDBMeta(tableFlexibleName);
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected static <KEY, VALUE> ConcurrentHashMap<KEY, VALUE> newConcurrentHashMap() {
        return new ConcurrentHashMap<KEY, VALUE>();
    }

    // -----------------------------------------------------
    //                                         Assert Object
    //                                         -------------
    protected static void assertObjectNotNull(String variableName, Object value) {
        LdSimpleAssertUtil.assertObjectNotNull(variableName, value);
    }

    // -----------------------------------------------------
    //                                         Assert String
    //                                         -------------
    protected static void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        LdSimpleAssertUtil.assertStringNotNullAndNotTrimmedEmpty(variableName, value);
    }
}

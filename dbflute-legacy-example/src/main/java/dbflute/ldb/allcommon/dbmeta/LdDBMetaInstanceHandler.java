package dbflute.ldb.allcommon.dbmeta;


import java.util.Map;
import java.util.LinkedHashMap;

/**
 * DBMeta instance handler.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdDBMetaInstanceHandler {

    /** Table db-name instance map. */
    protected static final Map<String, LdDBMeta> _tableDbNameInstanceMap;
    static {
        Map<String, LdDBMeta> tmpMap = new LinkedHashMap<String, LdDBMeta>();


        tmpMap.put("AUTHOR", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdAuthorDbm"));

        tmpMap.put("BLACK_ACTION", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdBlackActionDbm"));

        tmpMap.put("BLACK_ACTION_LOOKUP", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdBlackActionLookupDbm"));

        tmpMap.put("BLACK_LIST", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdBlackListDbm"));

        tmpMap.put("BOOK", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdBookDbm"));

        tmpMap.put("COLLECTION", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdCollectionDbm"));

        tmpMap.put("COLLECTION_STATUS", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdCollectionStatusDbm"));

        tmpMap.put("COLLECTION_STATUS_LOOKUP", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdCollectionStatusLookupDbm"));

        tmpMap.put("GARBAGE", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdGarbageDbm"));

        tmpMap.put("GENRE", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdGenreDbm"));

        tmpMap.put("LB_USER", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdLbUserDbm"));

        tmpMap.put("LENDING", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdLendingDbm"));

        tmpMap.put("LENDING_COLLECTION", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdLendingCollectionDbm"));

        tmpMap.put("LIBRARY", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdLibraryDbm"));

        tmpMap.put("NEXT_LIBRARY", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdNextLibraryDbm"));

        tmpMap.put("PUBLISHER", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdPublisherDbm"));

        _tableDbNameInstanceMap = java.util.Collections.unmodifiableMap(tmpMap);
    }

    /** Table cap-prop-name instance map. */
    protected static final Map<String, LdDBMeta> _tableCapPropNameInstanceMap;
    static {
        Map<String, LdDBMeta> tmpMap = new LinkedHashMap<String, LdDBMeta>();


        tmpMap.put("Author", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdAuthorDbm"));

        tmpMap.put("BlackAction", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdBlackActionDbm"));

        tmpMap.put("BlackActionLookup", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdBlackActionLookupDbm"));

        tmpMap.put("BlackList", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdBlackListDbm"));

        tmpMap.put("Book", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdBookDbm"));

        tmpMap.put("Collection", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdCollectionDbm"));

        tmpMap.put("CollectionStatus", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdCollectionStatusDbm"));

        tmpMap.put("CollectionStatusLookup", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdCollectionStatusLookupDbm"));

        tmpMap.put("Garbage", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdGarbageDbm"));

        tmpMap.put("Genre", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdGenreDbm"));

        tmpMap.put("LbUser", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdLbUserDbm"));

        tmpMap.put("Lending", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdLendingDbm"));

        tmpMap.put("LendingCollection", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdLendingCollectionDbm"));

        tmpMap.put("Library", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdLibraryDbm"));

        tmpMap.put("NextLibrary", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdNextLibraryDbm"));

        tmpMap.put("Publisher", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdPublisherDbm"));

        _tableCapPropNameInstanceMap = java.util.Collections.unmodifiableMap(tmpMap);
    }

    /** Table uncap-prop-name instance map. */
    protected static final Map<String, LdDBMeta> _tableUncapPropNameInstanceMap;
    static {
        Map<String, LdDBMeta> tmpMap = new LinkedHashMap<String, LdDBMeta>();


        tmpMap.put("author", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdAuthorDbm"));

        tmpMap.put("blackAction", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdBlackActionDbm"));

        tmpMap.put("blackActionLookup", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdBlackActionLookupDbm"));

        tmpMap.put("blackList", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdBlackListDbm"));

        tmpMap.put("book", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdBookDbm"));

        tmpMap.put("collection", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdCollectionDbm"));

        tmpMap.put("collectionStatus", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdCollectionStatusDbm"));

        tmpMap.put("collectionStatusLookup", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdCollectionStatusLookupDbm"));

        tmpMap.put("garbage", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdGarbageDbm"));

        tmpMap.put("genre", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdGenreDbm"));

        tmpMap.put("lbUser", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdLbUserDbm"));

        tmpMap.put("lending", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdLendingDbm"));

        tmpMap.put("lendingCollection", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdLendingCollectionDbm"));

        tmpMap.put("library", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdLibraryDbm"));

        tmpMap.put("nextLibrary", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdNextLibraryDbm"));

        tmpMap.put("publisher", getDBMeta("dbflute.ldb.bsentity.dbmeta.LdPublisherDbm"));

        _tableUncapPropNameInstanceMap = java.util.Collections.unmodifiableMap(tmpMap);
    }

    protected static LdDBMeta getDBMeta(String className) {
        try {
            final Class clazz = Class.forName(className);
            final java.lang.reflect.Method methoz = clazz.getMethod("getInstance", (Class[])null);
            final Object result = methoz.invoke(null, (Object[])null);
            return (LdDBMeta)result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get instance by table db-name.
     * 
     * @param tableDbName Table db-name. (NotNull)
     * @return Instance. (NotNull)
     */
    public static LdDBMeta getInstanceByTableDbName(String tableDbName) {
        assertStringNotNullAndNotTrimmedEmpty("tableDbName", tableDbName);
        final LdDBMeta instance = (LdDBMeta)_tableDbNameInstanceMap.get(tableDbName);
        if (instance == null) {
            String msg = "The instance map returned null by the key: key=" + tableDbName + " instanceMap=" + _tableDbNameInstanceMap;
            throw new IllegalStateException(msg);
        }
        return instance;
    }

    /**
     * Get instance by table cap-prop-name.
     * 
     * @param tableCapPropName Table cap-prop-name. (NotNull)
     * @return Instance. (NotNull)
     */
    public static LdDBMeta getInstanceByTableCapPropName(String tableCapPropName) {
        assertStringNotNullAndNotTrimmedEmpty("tableCapPropName", tableCapPropName);
        final LdDBMeta instance = (LdDBMeta)_tableCapPropNameInstanceMap.get(tableCapPropName);
        if (instance == null) {
            String msg = "The instance map returned null by the key: key=" + tableCapPropName + " instanceMap=" + _tableCapPropNameInstanceMap;
            throw new IllegalStateException(msg);
        }
        return instance;
    }

    /**
     * Get instance by table uncap-prop-name.
     * 
     * @param tableUncapPropName Table uncap-prop-name. (NotNull)
     * @return Instance. (NotNull)
     */
    public static LdDBMeta getInstanceByTableUncapPropName(String tableUncapPropName) {
        assertStringNotNullAndNotTrimmedEmpty("tableUncapPropName", tableUncapPropName);
        final LdDBMeta instance = (LdDBMeta)_tableUncapPropNameInstanceMap.get(tableUncapPropName);
        if (instance == null) {
            String msg = "The instance map returned null by the key: key=" + tableUncapPropName + " instanceMap=" + _tableUncapPropNameInstanceMap;
            throw new IllegalStateException(msg);
        }
        return instance;
    }

    /**
     * Get instance by table uncap-prop-name.
     * 
     * @param tableMultiName Table multi-name. (NotNull)
     * @return Instance. (NotNull)
     */
    public static LdDBMeta getInstanceByTableMultiName(String tableMultiName) {
        assertStringNotNullAndNotTrimmedEmpty("tableMultiName", tableMultiName);
        {
            final LdDBMeta instance = (LdDBMeta)_tableDbNameInstanceMap.get(tableMultiName);
            if (instance != null) {
                return instance;
            }
        }
        {
            final LdDBMeta instance = (LdDBMeta)_tableCapPropNameInstanceMap.get(tableMultiName);
            if (instance != null) {
                return instance;
            }
        }
        {
            final LdDBMeta instance = (LdDBMeta)_tableUncapPropNameInstanceMap.get(tableMultiName);
            if (instance != null) {
                return instance;
            }
        }
        String msg = "The tableMultiName does not exist in all-instance-map: tableMultiName=" + tableMultiName;
        msg = msg + " tableDbNameInstanceMap=" + _tableDbNameInstanceMap;
        msg = msg + " tableCapPropNameInstanceMap=" + _tableCapPropNameInstanceMap;
        msg = msg + " tableUncapPropNameInstanceMap=" + _tableUncapPropNameInstanceMap;
        throw new IllegalStateException(msg);
    }

    // ----------------------------------------------------------------
    //                                                    Assert Object
    //                                                    -------------
    /**
     * Assert that the argument is not null.
     * 
     * @param variableName Variable name. (NotNull)
     * @param arg Argument. (NotNull)
     */
    protected static void assertObjectNotNull(String variableName, Object arg) {
        if (variableName == null) {
            String msg = "Argument[variableName] should not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (arg == null) {
            String msg = "Argument[" + variableName + "] should not be null.";
            throw new IllegalArgumentException(msg);
        }
    }

    // ----------------------------------------------------------------
    //                                                    Assert String
    //                                                    -------------
    /**
     * Assert that the string is not null and not trimmed empty.
     * 
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     */
    protected static void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        if (variableName == null) {
            String msg = "Variable[variableName] should not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            String msg = "Variable[" + variableName + "] should not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (value.trim().length() == 0) {
            String msg = "Variable[" + variableName + "] should not be empty: [" + value + "]";
            throw new IllegalArgumentException(msg);
        }
    }
}

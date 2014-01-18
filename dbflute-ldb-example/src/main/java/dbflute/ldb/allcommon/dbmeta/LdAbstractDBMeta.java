/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.dbmeta;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.helper.LdMapListString;
import dbflute.ldb.allcommon.helper.LdMapListStringImpl;
import dbflute.ldb.allcommon.helper.LdMapStringBuilder;
import dbflute.ldb.allcommon.helper.LdMapStringBuilderImpl;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;
import dbflute.ldb.allcommon.dbmeta.info.LdColumnInfo;
import dbflute.ldb.allcommon.dbmeta.info.LdForeignInfo;
import dbflute.ldb.allcommon.dbmeta.info.LdReferrerInfo;
import dbflute.ldb.allcommon.dbmeta.info.LdRelationInfo;
import dbflute.ldb.allcommon.dbmeta.info.LdUniqueInfo;
import dbflute.ldb.allcommon.util.LdSimpleAssertUtil;
import dbflute.ldb.allcommon.util.LdSimpleStringUtil;
import dbflute.ldb.allcommon.util.LdSimpleSystemUtil;

/**
 * The abstract class of DB meta.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractDBMeta implements LdDBMeta {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    protected static final Object DUMMY_VALUE = new Object();

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                  Information Resource
    //                                  --------------------
    // Initialized at its getter.
    private LdStringKeyMap<String> _tableDbNameFlexibleMap;
    private LdStringKeyMap<String> _tablePropertyNameFlexibleMap;
    private List<LdColumnInfo> _columnInfoList;
    private LdStringKeyMap<LdColumnInfo> _columnInfoFlexibleMap;
    private List<LdForeignInfo> _foreignInfoList;
    private LdStringKeyMap<LdForeignInfo> _foreignInfoFlexibleMap;
    private List<LdReferrerInfo> _referrerInfoList;
    private LdStringKeyMap<LdReferrerInfo> _referrerInfoFlexibleMap;

    // Initialized at hasMethod().
    private Map<String, Object> _methodNameMap = newConcurrentHashMap();

    // ===================================================================================
    //                                                             Resource Initialization
    //                                                             =======================
    protected void initializeInformationResource() { // for instance initializer of subclass.
        // Initialize the flexible map of table DB name.
        getTableDbNameFlexibleMap();

        // Initialize the flexible map of table property name.
        getTablePropertyNameFlexibleMap();

        // Initialize the list of column information.
        getColumnInfoList();

        // Initialize the flexible map of column information. 
        getColumnInfoFlexibleMap();

        // These should not be initialized here!
        // because the problem 'cyclic reference' occurred! 
        // So these are initialized as lazy.
        // getForeignInfoList();
        // getForeignInfoFlexibleMap();
        // getReferrerInfoList();
        // getReferrerInfoFlexibleMap();

        // Initialize the map of (public)method name. 
        hasMethod("dummy");
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    /**
     * Get the flexible map of table DB name.
     * @return The flexible map of table DB name. (NotNull, NotEmpty)
     */
    protected Map<String, String> getTableDbNameFlexibleMap() {
        if (_tableDbNameFlexibleMap != null) {
            return _tableDbNameFlexibleMap;
        }
        synchronized (this) {
            if (_tableDbNameFlexibleMap != null) {
                return _tableDbNameFlexibleMap;
            }
            _tableDbNameFlexibleMap = LdStringKeyMap.createAsFlexibleConcurrent();
            _tableDbNameFlexibleMap.put(getTableDbName(), getTableDbName());
            return _tableDbNameFlexibleMap;
        }
    }

    /**
     * Get the flexible map of table property name.
     * @return The flexible map of table property name. (NotNull, NotEmpty)
     */
    protected Map<String, String> getTablePropertyNameFlexibleMap() {
        if (_tablePropertyNameFlexibleMap != null) {
            return _tablePropertyNameFlexibleMap;
        }
        synchronized (this) {
            if (_tablePropertyNameFlexibleMap != null) {
                return _tablePropertyNameFlexibleMap;
            }
            _tablePropertyNameFlexibleMap = LdStringKeyMap.createAsFlexibleConcurrent();
            _tablePropertyNameFlexibleMap.put(getTableDbName(), getTablePropertyName());
            return _tableDbNameFlexibleMap;
        }
    }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    /**
     * {@inheritDoc}
     * @param columnFlexibleName The flexible name(IgnoreCase, IgnoreUnderscore) of the column. (NotNull, NotEmpty)
     * @return Determination.
     */
    public boolean hasColumn(String columnFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("columnFlexibleName", columnFlexibleName);
        return getColumnInfoFlexibleMap().containsKey(columnFlexibleName);
    }

    /**
     * {@inheritDoc}
     * @param columnFlexibleName The flexible name(IgnoreCase, IgnoreUnderscore) of the column. (NotNull, NotEmpty)
     * @return The information of the column. (NotNull)
     */ 
    public LdColumnInfo findColumnInfo(String columnFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("columnFlexibleName", columnFlexibleName);
        final LdColumnInfo columnInfo = getColumnInfoFlexibleMap().get(columnFlexibleName);
        if (columnInfo == null) {
            String msg = "Not found column by columnFlexibleName: " + columnFlexibleName;
            msg = msg + " tableName=" + getTableDbName();
            throw new IllegalArgumentException(msg);
        }
        return columnInfo;
    }

    protected LdColumnInfo cci(String columnDbName, String columnAlias, String propertyName
                           , Class<?> propertyType, boolean primary
                           , Integer columnSize, Integer columnDecimalDigits) {// createColumnInfo()
        return new LdColumnInfo(this, columnDbName, columnAlias, propertyName, propertyType, primary, columnSize, columnDecimalDigits);
    }

    protected LdColumnInfo cci(String columnDbName, String columnAlias, String propertyName
                           , Class<?> propertyType, boolean primary
                           , Integer columnSize, Integer columnDecimalDigits, OptimisticLockType optimisticLockType) {// createColumnInfo()
        return new LdColumnInfo(this, columnDbName, columnAlias, propertyName, propertyType, primary, columnSize, columnDecimalDigits, optimisticLockType);
    }

    /**
	 * {@inheritDoc}
     * @return The list of columns. (NotNull, NotEmpty)
     */
    public List<LdColumnInfo> getColumnInfoList() {
        if (_columnInfoList != null) {
            return _columnInfoList;
        }
        synchronized (this) {
            if (_columnInfoList != null) {
                return _columnInfoList;
            }
            Method[] methods = this.getClass().getMethods();
            _columnInfoList = newArrayList();
            String prefix = "column";
            Class<LdColumnInfo> returnType = LdColumnInfo.class;
            Object[] args = new Object[]{};
            try {
                for (Method method : methods) {
                    if (method.getName().startsWith(prefix) && returnType.equals(method.getReturnType())) {
                        _columnInfoList.add((LdColumnInfo)method.invoke(this, args));
                    }
                }
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
            return _columnInfoList;
        }
    }

    /**
     * Get the flexible map of column information.
     * @return The flexible map of column information. (NotNull, NotEmpty)
     */
    protected Map<String, LdColumnInfo> getColumnInfoFlexibleMap() {
        if (_columnInfoFlexibleMap != null) {
            return _columnInfoFlexibleMap;
        }
        final List<LdColumnInfo> columnInfoList = getColumnInfoList();
        synchronized (this) {
            if (_columnInfoFlexibleMap != null) {
                return _columnInfoFlexibleMap;
            }
            _columnInfoFlexibleMap = LdStringKeyMap.createAsFlexibleConcurrent();
            for (LdColumnInfo columnInfo : columnInfoList) {
                _columnInfoFlexibleMap.put(columnInfo.getColumnDbName(), columnInfo);
            }
            return _columnInfoFlexibleMap;
        }
    }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    protected LdUniqueInfo cpui(LdColumnInfo uniqueColumnInfo) { // createPrimaryUniqueInfo()
        return cpui(Arrays.asList(uniqueColumnInfo));
    }

    protected LdUniqueInfo cpui(List<LdColumnInfo> uniqueColumnInfoList) { // createPrimaryUniqueInfo()
        LdUniqueInfo uniqueInfo = new LdUniqueInfo(this, uniqueColumnInfoList, true);
        return uniqueInfo;
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    /**
     * @param relationPropertyName The flexible name of the relation property. (NotNull)
     * @return The information of relation. (NotNull)
     */ 
    public LdRelationInfo findRelationInfo(String relationPropertyName) {
        assertStringNotNullAndNotTrimmedEmpty("relationPropertyName", relationPropertyName);
        return hasForeign(relationPropertyName) ? (LdRelationInfo)findForeignInfo(relationPropertyName) : (LdRelationInfo)findReferrerInfo(relationPropertyName);
    }

    // -----------------------------------------------------
    //                                       Foreign Element
    //                                       ---------------
    /**
     * {@inheritDoc}
     * @param foreignPropertyName The flexible name of the foreign property. (NotNull)
     * @return Determination. (NotNull)
     */ 
    public boolean hasForeign(String foreignPropertyName) {
        assertStringNotNullAndNotTrimmedEmpty("foreignPropertyName", foreignPropertyName);
        final String methodName = buildRelationInfoGetterMethodNameInitCap("foreign", foreignPropertyName);
        return hasMethod(methodName);
    }

    /**
     * {@inheritDoc}
     * @param foreignPropertyName The flexible name of the foreign property. (NotNull)
     * @return Foreign DBMeta. (NotNull)
     */ 
    public LdDBMeta findForeignDBMeta(String foreignPropertyName) {
        return findForeignInfo(foreignPropertyName).getForeignDBMeta();
    }

    /**
     * {@inheritDoc}
     * @param foreignPropertyName The flexible name of the foreign property. (NotNull)
     * @return Foreign information. (NotNull)
     */ 
    public LdForeignInfo findForeignInfo(String foreignPropertyName) {
        assertStringNotNullAndNotTrimmedEmpty("foreignPropertyName", foreignPropertyName);
        final String methodName = buildRelationInfoGetterMethodNameInitCap("foreign", foreignPropertyName);
        Method method = null;
        try {
            method = this.getClass().getMethod(methodName, new Class[]{});
        } catch (NoSuchMethodException e) {
            String msg = "Not found foreign by foreignPropertyName: foreignPropertyName=" + foreignPropertyName;
            msg = msg + " tableName=" + getTableDbName() + " methodName=" + methodName;
            throw new RuntimeException(msg, e);
        }
        try {
            return (LdForeignInfo)method.invoke(this, new Object[]{});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }
    
    protected LdForeignInfo cfi(String propName
                            , LdDBMeta localDbm, LdDBMeta foreignDbm
                            , Map<LdColumnInfo, LdColumnInfo> localForeignColumnInfoMap
                            , int relNo, boolean oneToOne) { // createForeignInfo()
        return new LdForeignInfo(propName, localDbm, foreignDbm, localForeignColumnInfoMap, relNo, oneToOne);
    }

    /**
     * {@inheritDoc}
     * @return The list of foreign information. (NotNull)
     */
    public List<LdForeignInfo> getForeignInfoList() {
        if (_foreignInfoList != null) {
            return _foreignInfoList;
        }
        synchronized (this) {
            if (_foreignInfoList != null) {
                return _foreignInfoList;
            }
            Method[] methods = this.getClass().getMethods();
            _foreignInfoList = newArrayList();
            String prefix = "foreign";
            Class<LdForeignInfo> returnType = LdForeignInfo.class;
            Object[] args = new Object[]{};
            try {
                for (Method method : methods) {
                    if (method.getName().startsWith(prefix) && returnType.equals(method.getReturnType())) {
                        _foreignInfoList.add((LdForeignInfo)method.invoke(this, args));
                    }
                }
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
            return _foreignInfoList;
        }
    }

    /**
     * Get the flexible map of foreign information.
     * @return The flexible map of foreign information. (NotNull, NotEmpty)
     */
    protected Map<String, LdForeignInfo> getForeignInfoFlexibleMap() {
        if (_foreignInfoFlexibleMap != null) {
            return _foreignInfoFlexibleMap;
        }
        final List<LdForeignInfo> foreignInfoList = getForeignInfoList();
        synchronized (this) {
            if (_foreignInfoFlexibleMap != null) {
                return _foreignInfoFlexibleMap;
            }
            _foreignInfoFlexibleMap = LdStringKeyMap.createAsFlexibleConcurrent();
            for (LdForeignInfo foreignInfo : foreignInfoList) {
                _foreignInfoFlexibleMap.put(foreignInfo.getForeignPropertyName(), foreignInfo);
            }
            return _foreignInfoFlexibleMap;
        }
    }

    // -----------------------------------------------------
    //                                      Referrer Element
    //                                      ----------------
    /**
     * @param referrerPropertyName The flexible name of the referrer property. (NotNull)
     * @return Determination. (NotNull)
     */ 
    public boolean hasReferrer(String referrerPropertyName) {
        assertStringNotNullAndNotTrimmedEmpty("referrerPropertyName", referrerPropertyName);
        final String methodName = buildRelationInfoGetterMethodNameInitCap("referrer", referrerPropertyName);
        return hasMethod(methodName);
    }

    /**
     * @param referrerPropertyName The flexible name of the referrer property. (NotNull)
     * @return Referrer DBMeta. (NotNull)
     */ 
    public LdDBMeta findReferrerDBMeta(String referrerPropertyName) {
        assertStringNotNullAndNotTrimmedEmpty("referrerPropertyName", referrerPropertyName);
        return findReferrerInfo(referrerPropertyName).getReferrerDBMeta();
    }

    /**
     * @param referrerPropertyName The flexible name of the referrer property. (NotNull)
     * @return Referrer information. (NotNull)
     */ 
    public LdReferrerInfo findReferrerInfo(String referrerPropertyName) {
        assertStringNotNullAndNotTrimmedEmpty("referrerPropertyName", referrerPropertyName);
        final String methodName = buildRelationInfoGetterMethodNameInitCap("referrer", referrerPropertyName);
        java.lang.reflect.Method method = null;
        try {
            method = this.getClass().getMethod(methodName, new Class[]{});
        } catch (NoSuchMethodException e) {
            String msg = "Not found referrer by referrerPropertyName: referrerPropertyName=" + referrerPropertyName;
            msg = msg + " tableName=" + getTableDbName() + " methodName=" + methodName;
            throw new RuntimeException(msg, e);
        }
        try {
            return (LdReferrerInfo)method.invoke(this, new Object[]{});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    protected LdReferrerInfo cri(String propName
                             , LdDBMeta localDbm, LdDBMeta referrerDbm
                             , Map<LdColumnInfo, LdColumnInfo> localReferrerColumnInfoMap
                             , boolean oneToOne) { // createReferrerInfo()
        return new LdReferrerInfo(propName, localDbm, referrerDbm, localReferrerColumnInfoMap, oneToOne);
    }

    /**
     * {@inheritDoc}
     * @return The list of referrer information. (NotNull)
     */
    public List<LdReferrerInfo> getReferrerInfoList() {
        if (_referrerInfoList != null) {
            return _referrerInfoList;
        }
        synchronized (this) {
            if (_referrerInfoList != null) {
                return _referrerInfoList;
            }
            Method[] methods = this.getClass().getMethods();
            _referrerInfoList = newArrayList();
            String prefix = "referrer";
            Class<LdReferrerInfo> returnType = LdReferrerInfo.class;
            Object[] args = new Object[]{};
            try {
                for (Method method : methods) {
                    if (method.getName().startsWith(prefix) && returnType.equals(method.getReturnType())) {
                        _referrerInfoList.add((LdReferrerInfo)method.invoke(this, args));
                    }
                }
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
            return _referrerInfoList;
        }
    }

    /**
     * Get the flexible map of referrer information.
     * @return The flexible map of referrer information. (NotNull, NotEmpty)
     */
    protected Map<String, LdReferrerInfo> getReferrerInfoFlexibleMap() {
        if (_referrerInfoFlexibleMap != null) {
            return _referrerInfoFlexibleMap;
        }
        final List<LdReferrerInfo> referrerInfoList = getReferrerInfoList();
        synchronized (this) {
            if (_referrerInfoFlexibleMap != null) {
                return _referrerInfoFlexibleMap;
            }
            _referrerInfoFlexibleMap = LdStringKeyMap.createAsFlexibleConcurrent();
            for (LdReferrerInfo referrerInfo : referrerInfoList) {
                _referrerInfoFlexibleMap.put(referrerInfo.getReferrerPropertyName(), referrerInfo);
            }
            return _referrerInfoFlexibleMap;
        }
    }

    // -----------------------------------------------------
    //                                          Common Logic
    //                                          ------------
    protected String buildRelationInfoGetterMethodNameInitCap(String targetName, String relationPropertyName) {
        return  targetName + relationPropertyName.substring(0, 1).toUpperCase() + relationPropertyName.substring(1);
    }
	
    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    /**
     * Relation trace.
     */
    protected static abstract class AbstractRelationTrace implements RelationTrace {

        /** The list of relation. */
        protected List<LdRelationInfo> _relationList;

        /** The list of relation trace. */
        protected List<AbstractRelationTrace> _relationTraceList;

        /** The list of relation info as trace. */
        protected List<LdRelationInfo> _traceRelationInfoList;

        /** The column info as trace. */
        protected LdColumnInfo _traceColumnInfo;

        /** The handler of fixed relation trace. */
        protected RelationTraceFixHandler _relationTraceFixHandler;

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public AbstractRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            this(new ArrayList<LdRelationInfo>(), new ArrayList<AbstractRelationTrace>());
            this._relationTraceFixHandler = relationTraceFixHandler;
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public AbstractRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            this._relationList = relationList;
            this._relationTraceList = relationTraceList;
            this._relationTraceList.add(this);
        }

        /**
         * {@inheritDoc}
         * @return The trace of relation as the list of relation info. (NotNull)
         */
        public List<LdRelationInfo> getTraceRelation() {
            return _traceRelationInfoList;
        }

        /**
         * {@inheritDoc}
         * @return The trace of column as column info. (Nullable)
         */
        public LdColumnInfo getTraceColumn() {
            return _traceColumnInfo;
        }

        /**
         * Fix trace.
         * @param traceRelationInfoList The trace of relation as the list of relation info. (NotNull)
         * @param traceColumnInfo The trace of column as column info. (Nullable)
         * @return Relation trace(result). (NotNull)
         */
        protected RelationTrace fixTrace(List<LdRelationInfo> traceRelationInfoList, LdColumnInfo traceColumnInfo) {
            final AbstractRelationTrace localRelationTrace = (AbstractRelationTrace)_relationTraceList.get(0);
            localRelationTrace.setTraceRelation(traceRelationInfoList);
            localRelationTrace.setTraceColumn(traceColumnInfo);
            localRelationTrace.recycle();
            localRelationTrace.handleFixedRelationTrace();
            return localRelationTrace;
        }

        protected void setTraceRelation(List<LdRelationInfo> traceRelationInfoList) {
            this._traceRelationInfoList = traceRelationInfoList;
        }

        protected void setTraceColumn(LdColumnInfo traceColumn) {
            this._traceColumnInfo = traceColumn;
        }

        protected void recycle() {
            this._relationList = new ArrayList<LdRelationInfo>();
            this._relationTraceList = new ArrayList<AbstractRelationTrace>();
            this._relationTraceList.add(this);
        }

        protected void handleFixedRelationTrace() {
            if (_relationTraceFixHandler != null) {
                _relationTraceFixHandler.handleFixedTrace(this);
            }
        }
    }

    // ===================================================================================
    //                                                                          Map String
    //                                                                          ==========
    /**
     * {@inheritDoc}
     * @return Map list string that is prepared. (NotNull)
     */
    public LdMapListString createMapListString() {
        return MapStringUtil.createMapListString();
    }

    /**
     * {@inheritDoc}
     * @return Map string builder that is prepared. (NotNull)
     */
    public LdMapStringBuilder createMapStringBuilder() {
        final List<String> columnDbNameList = new ArrayList<String>();
        for (final Iterator<LdColumnInfo> ite = getColumnInfoList().iterator(); ite.hasNext(); ) {
            final LdColumnInfo columnInfo = (LdColumnInfo)ite.next();
            columnDbNameList.add(columnInfo.getColumnDbName());
        }
        return MapStringUtil.createMapStringBuilder(columnDbNameList);
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    // These methods is expected to override if it needs.
    public boolean hasIdentity() { return false; }
    public boolean hasSequence() { return false; }
    public String getSequenceNextValSql() { return null; }
    public boolean hasVersionNo() { return false; }
    public LdColumnInfo getVersionNoColumnInfo() { return null; }
    public boolean hasUpdateDate() { return false; }
    public LdColumnInfo getUpdateDateColumnInfo() { return null; }
    public boolean hasCommonColumn() { return false; }

    // ===================================================================================
    //                                                                       Name Handling
    //                                                                       =============
    /**
     * {@inheritDoc}
     * @param flexibleName The flexible name(IgnoreCase, IgnoreUnderscore). (NotNull, NotEmpty)
     * @return Determination.
     */
    public boolean hasFlexibleName(String flexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("flexibleName", flexibleName);

        // It uses column before table because column is used much more than table.
        // This is the same consideration at other methods.
        return getColumnInfoFlexibleMap().containsKey(flexibleName)
               || getTableDbNameFlexibleMap().containsKey(flexibleName);
    }

    /**
     * {@inheritDoc}
     * @param flexibleName The flexible name(IgnoreCase, IgnoreUnderscore). (NotNull, NotEmpty)
     * @return DB name. (NotNull, NotEmpty)
     */
    public String findDbName(String flexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("flexibleName", flexibleName);
        final LdColumnInfo columnInfoMap = getColumnInfoFlexibleMap().get(flexibleName);
        if (columnInfoMap != null) {
            return columnInfoMap.getColumnDbName();
        }
        final String tableDbName = getTableDbNameFlexibleMap().get(flexibleName);
        if (tableDbName != null) {
            return tableDbName;
        }
        String msg = "Not found DB name by the flexible name: flexibleName=" + flexibleName;
        throw new IllegalArgumentException(msg);
    }

    /**
     * {@inheritDoc}
     * @param flexibleName The flexible name(IgnoreCase, IgnoreUnderscore). (NotNull, NotEmpty)
     * @return DB name. (NotNull, NotEmpty)
     */
    public String findPropertyName(String flexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("flexibleName", flexibleName);
        final LdColumnInfo columnInfoMap = getColumnInfoFlexibleMap().get(flexibleName);
        if (columnInfoMap != null) {
            return columnInfoMap.getPropertyName();
        }
        final String tablePropertyName = getTablePropertyNameFlexibleMap().get(flexibleName);
        if (tablePropertyName != null) {
            return tablePropertyName;
        }
        String msg = "Not found property name by the flexible name: flexibleName=" + flexibleName;
        throw new IllegalArgumentException(msg);
    }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    protected <ENTITY extends LdEntity> void doAcceptPrimaryKeyMap(ENTITY entity
            , Map<String, ? extends Object> columnValueMap
            , Map<String, Eps<ENTITY>> entityPropertySetupperMap) {
        MapAssertUtil.assertColumnValueMapNotNullAndNotEmpty(columnValueMap);
        MapStringValueAnalyzer analyzer = new MapStringValueAnalyzer(columnValueMap, entity.getModifiedPropertyNames());
        List<LdColumnInfo> columnInfoList = getPrimaryUniqueInfo().getUniqueColumnList();
        for (LdColumnInfo columnInfo : columnInfoList) {
            String columnName = columnInfo.getColumnDbName();
            String propertyName = columnInfo.getPropertyName();
            String uncapPropName = initUncap(propertyName);
            Class<?> propertyType = columnInfo.getPropertyType();
            if (analyzer.init(columnName, uncapPropName, propertyName)) {
                final Object value;
                if (String.class.isAssignableFrom(propertyType)) {
                    value = analyzer.analyzeString(propertyType);
                } else if (Number.class.isAssignableFrom(propertyType)) {
                    value = analyzer.analyzeNumber(propertyType);
                } else if (java.util.Date.class.isAssignableFrom(propertyType)) {
                    value = analyzer.analyzeDate(propertyType);
                } else {
                    value = analyzer.analyzeOther(propertyType);
                }
                findEps(entityPropertySetupperMap, propertyName).setup(entity, value);
            }
        }
    }

    protected <ENTITY extends LdEntity> void doAcceptColumnValueMap(ENTITY entity
            , Map<String, ? extends Object> columnValueMap
            , Map<String, Eps<ENTITY>> entityPropertySetupperMap) {
        MapAssertUtil.assertColumnValueMapNotNullAndNotEmpty(columnValueMap);
        MapStringValueAnalyzer analyzer = new MapStringValueAnalyzer(columnValueMap, entity.getModifiedPropertyNames());
        List<LdColumnInfo> columnInfoList = getColumnInfoList();
        for (LdColumnInfo columnInfo : columnInfoList) {
            String columnName = columnInfo.getColumnDbName();
            String propertyName = columnInfo.getPropertyName();
            String uncapPropName = initUncap(propertyName);
            Class<?> propertyType = columnInfo.getPropertyType();
            if (analyzer.init(columnName, uncapPropName, propertyName)) {
                final Object value;
                if (String.class.isAssignableFrom(propertyType)) {
                    value = analyzer.analyzeString(propertyType);
                } else if (Number.class.isAssignableFrom(propertyType)) {
                    value = analyzer.analyzeNumber(propertyType);
                } else if (java.util.Date.class.isAssignableFrom(propertyType)) {
                    value = analyzer.analyzeDate(propertyType);
                } else {
                    value = analyzer.analyzeOther(propertyType);
                }
                findEps(entityPropertySetupperMap, propertyName).setup(entity, value);
            }
        }
    }

    protected String doExtractPrimaryKeyMapString(LdEntity entity
                                                , String startBrace
                                                , String endBrace
                                                , String delimiter
                                                , String equal) {
        String mapMarkAndStartBrace = MAP_STRING_MAP_MARK + startBrace;
        StringBuilder sb = new StringBuilder();
        List<LdColumnInfo> columnInfoList = getPrimaryUniqueInfo().getUniqueColumnList();
		try {
            for (LdColumnInfo columnInfo : columnInfoList) {
                String columnName = columnInfo.getColumnDbName();
                Method getterMethod = columnInfo.findGetter();
				Object value = getterMethod.invoke(entity, (Object[])null);
                helpAppendingColumnValueString(sb, delimiter, equal, columnName, value);
            }
		} catch (Exception e) {
		    throw new IllegalStateException(e);
		}
		sb.delete(0, delimiter.length()).insert(0, mapMarkAndStartBrace).append(endBrace);
		return sb.toString();
	}

    protected String doExtractColumnValueMapString(LdEntity entity
                                                 , String startBrace
                                                 , String endBrace
                                                 , String delimiter
                                                 , String equal) {
        String mapMarkAndStartBrace = MAP_STRING_MAP_MARK + startBrace;
        StringBuilder sb = new StringBuilder();
        List<LdColumnInfo> columnInfoList = getColumnInfoList();
		try {
            for (LdColumnInfo columnInfo : columnInfoList) {
                String columnName = columnInfo.getColumnDbName();
                Method getterMethod = columnInfo.findGetter();
				Object value = getterMethod.invoke(entity, (Object[])null);
                helpAppendingColumnValueString(sb, delimiter, equal, columnName, value);
            }
		} catch (Exception e) {
		    throw new IllegalStateException(e);
		}
		sb.delete(0, delimiter.length()).insert(0, mapMarkAndStartBrace).append(endBrace);
		return sb.toString();
	}

    // -----------------------------------------------------
    //                                               Convert
    //                                               -------
    protected Map<String, Object> doConvertToColumnValueMap(LdEntity entity) {
        Map<String, Object> valueMap = newLinkedHashMap();
		try {
            List<LdColumnInfo> columnInfoList = getColumnInfoList();
            for (LdColumnInfo columnInfo : columnInfoList) {
                String columnName = columnInfo.getColumnDbName();
                Method getterMethod = columnInfo.findGetter();
                Object value = getterMethod.invoke(entity, (Object[])null);
                valueMap.put(columnName, value);
            }
		} catch (Exception e) {
		    throw new IllegalStateException(e);
		}
        return valueMap;
    }
	
    protected Map<String, String> doConvertToColumnStringValueMap(LdEntity entity) {
        Map<String, String> valueMap = newLinkedHashMap();
		try {
            List<LdColumnInfo> columnInfoList = getColumnInfoList();
            for (LdColumnInfo columnInfo : columnInfoList) {
                String columnName = columnInfo.getColumnDbName();
                Method getterMethod = columnInfo.findGetter();
                Object value = getterMethod.invoke(entity, (Object[])null);
                valueMap.put(columnName, helpGettingColumnStringValue(value));
            }
		} catch (Exception e) {
		    throw new IllegalStateException(e);
		}
        return valueMap;
    }
	
	// ===================================================================================
    //                                                               Entity Property Setup
    //                                                               =====================
	// It's very INTERNAL!
    protected <ENTITY extends LdEntity> void setupEps(Map<String, Eps<ENTITY>> entityPropertySetupperMap
                                                           , Eps<ENTITY> setupper
                                                           , LdColumnInfo columnInfo) {
        String columnName = columnInfo.getColumnDbName();
        String propertyName = columnInfo.getPropertyName();
        registerEntityPropertySetupper(columnName, propertyName, setupper, entityPropertySetupperMap);
    }

    protected <ENTITY extends LdEntity> void registerEntityPropertySetupper(
		                                          String columnName
												, String propertyName
	                                            , Eps<ENTITY> setupper
											    , Map<String, Eps<ENTITY>> entityPropertySetupperMap) {
		// Only column name is registered because the map must be flexible map.
		entityPropertySetupperMap.put(columnName, setupper);
	}

    protected <ENTITY extends LdEntity> Eps<ENTITY> findEps(Map<String, Eps<ENTITY>> entityPropertySetupperMap, String propertyName) {
        Eps<ENTITY> setupper = entityPropertySetupperMap.get(propertyName);
        if (setupper == null) {
            String msg = "The propertyName was Not Found in the map of setupper of entity property:";
            msg = msg + " propertyName=" + propertyName + " _entityPropertySetupperMap.keySet()=" + entityPropertySetupperMap.keySet();
            throw new IllegalStateException(msg);
        }
        return setupper;
    }
	
    // ===================================================================================
    //                                                                          Util Class
    //                                                                          ==========
    /**
     * This class is for Internal. Don't use this!
     */
    protected static class MapStringUtil {

        public static void acceptPrimaryKeyMapString(String primaryKeyMapString, LdEntity entity) {
            if (primaryKeyMapString == null) {
                String msg = "The argument[primaryKeyMapString] should not be null.";
                throw new IllegalArgumentException(msg);
            }
            final String prefix = MAP_STRING_MAP_MARK + MAP_STRING_START_BRACE;
            final String suffix = MAP_STRING_END_BRACE;
            if (!primaryKeyMapString.trim().startsWith(prefix)) {
                primaryKeyMapString = prefix + primaryKeyMapString;
            }
            if (!primaryKeyMapString.trim().endsWith(suffix)) {
                primaryKeyMapString = primaryKeyMapString + suffix;
            }
            LdMapListString mapListString = createMapListString();
            entity.getDBMeta().acceptPrimaryKeyMap(entity, mapListString.generateMap(primaryKeyMapString));
        }

        public static void acceptColumnValueMapString(String columnValueMapString, LdEntity entity) {
            if (columnValueMapString == null) {
                String msg = "The argument[columnValueMapString] should not be null.";
                throw new IllegalArgumentException(msg);
            }
            final String prefix = MAP_STRING_MAP_MARK + MAP_STRING_START_BRACE;
            final String suffix = MAP_STRING_END_BRACE;
            if (!columnValueMapString.trim().startsWith(prefix)) {
                columnValueMapString = prefix + columnValueMapString;
            }
            if (!columnValueMapString.trim().endsWith(suffix)) {
                columnValueMapString = columnValueMapString + suffix;
            }
            LdMapListString mapListString = createMapListString();
            entity.getDBMeta().acceptColumnValueMap(entity, mapListString.generateMap(columnValueMapString));
        }

        public static String extractPrimaryKeyMapString(LdEntity entity) {
            final String startBrace = MAP_STRING_START_BRACE;
            final String endBrace = MAP_STRING_END_BRACE;
            final String delimiter = MAP_STRING_DELIMITER;
            final String equal = MAP_STRING_EQUAL;
            return entity.getDBMeta().extractPrimaryKeyMapString(entity, startBrace, endBrace, delimiter, equal);
        }

        public static String extractColumnValueMapString(LdEntity entity) {
            final String startBrace = MAP_STRING_START_BRACE;
            final String endBrace = MAP_STRING_END_BRACE;
            final String delimiter = MAP_STRING_DELIMITER;
            final String equal = MAP_STRING_EQUAL;
            return entity.getDBMeta().extractColumnValueMapString(entity, startBrace, endBrace, delimiter, equal);
        }

        public static void checkTypeString(Object value, String propertyName, String typeName) {
            if (value == null) {
                throw new IllegalArgumentException("The value should not be null: " + propertyName);
            }
            if (!(value instanceof String)) {
                String msg = "The value of " + propertyName + " should be " + typeName + " or String: ";
                msg = msg + "valueType=" + value.getClass() + " value=" + value;
                throw new IllegalArgumentException(msg);
            }
        }

        public static long parseDateStringAsMillis(Object value, String propertyName, String typeName) {
            checkTypeString(value, propertyName, typeName);
            try {
                final String valueString = filterTimestampValue(((String)value).trim());
                return java.sql.Timestamp.valueOf(valueString).getTime();
            } catch (RuntimeException e) {
                String msg = "The value of " + propertyName + " should be " + typeName + ". but: " + value;
                throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
            }
        }

        public static String filterTimestampValue(String value) {
            value = value.trim();
            if (value.indexOf("/") == 4 && value.lastIndexOf("/") == 7) {
                value = value.replaceAll("/", "-");
            }
            if (value.indexOf("-") == 4 && value.lastIndexOf("-") == 7) {
                if (value.length() == "2007-07-09".length()) {
                    value = value + " 00:00:00";
                }
            }
            return value;
        }

        public static String formatDate(java.util.Date value) {
            return getFormatDateFormat().format(value);
        }

        public static String formatTimestamp(java.sql.Timestamp value) {
            return getFormatDateFormat().format(value);
        }

        public static java.text.DateFormat getParseDateFormat() {
            return java.text.DateFormat.getDateInstance();
        }

        public static java.text.DateFormat getFormatDateFormat() {
            return new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        }

        public static LdMapListString createMapListString() {
            final LdMapListString mapListString = new LdMapListStringImpl();
            mapListString.setMapMark(MAP_STRING_MAP_MARK);
            mapListString.setListMark(MAP_STRING_LIST_MARK);
            mapListString.setStartBrace(MAP_STRING_START_BRACE);
            mapListString.setEndBrace(MAP_STRING_END_BRACE);
            mapListString.setEqual(MAP_STRING_EQUAL);
            mapListString.setDelimiter(MAP_STRING_DELIMITER);
            return mapListString;
        }

        public static LdMapStringBuilder createMapStringBuilder(List<String> columnNameList) {
            LdMapStringBuilder mapStringBuilder = new LdMapStringBuilderImpl();
            mapStringBuilder.setMsMapMark(MAP_STRING_MAP_MARK);
            mapStringBuilder.setMsStartBrace(MAP_STRING_START_BRACE);
            mapStringBuilder.setMsEndBrace(MAP_STRING_END_BRACE);
            mapStringBuilder.setMsEqual(MAP_STRING_EQUAL);
            mapStringBuilder.setMsDelimiter(MAP_STRING_DELIMITER);
            mapStringBuilder.setColumnNameList(columnNameList);
            return mapStringBuilder;
        }
    }

    /**
     * This class is for Internal. Don't use this!
     */
    protected static class MapAssertUtil {
        public static void assertPrimaryKeyMapNotNullAndNotEmpty(java.util.Map<String, ? extends Object> primaryKeyMap) {
            if (primaryKeyMap == null) {
                String msg = "The argument[primaryKeyMap] should not be null.";
                throw new IllegalArgumentException(msg);
            }
            if (primaryKeyMap.isEmpty()) {
                String msg = "The argument[primaryKeyMap] should not be empty.";
                throw new IllegalArgumentException(msg);
            }
        }
        public static void assertColumnExistingInPrimaryKeyMap(java.util.Map<String, ? extends Object> primaryKeyMap, String columnName) {
            if (!primaryKeyMap.containsKey(columnName)) {
                String msg = "The primaryKeyMap must have the value of " + columnName;
                throw new IllegalStateException(msg + ": primaryKeyMap --> " + primaryKeyMap);
            }
        }
        public static void assertColumnValueMapNotNullAndNotEmpty(java.util.Map<String, ? extends Object> columnValueMap) {
            if (columnValueMap == null) {
                String msg = "The argument[columnValueMap] should not be null.";
                throw new IllegalArgumentException(msg);
            }
            if (columnValueMap.isEmpty()) {
                String msg = "The argument[columnValueMap] should not be empty.";
                throw new IllegalArgumentException(msg);
            }
        }
    }

    /**
     * This class is for Internal. Don't use this!
     */
	@SuppressWarnings("unchecked")
    protected static class MapStringValueAnalyzer {
        protected java.util.Map<String, ? extends Object> _valueMap;
        protected java.util.Set<String> _modifiedPropertyNames;
        protected String _columnName;
        protected String _uncapPropName;
        protected String _propertyName;

        public MapStringValueAnalyzer(java.util.Map<String, ? extends Object> valueMap, java.util.Set<String> modifiedPropertyNames) {
            this._valueMap = valueMap;
            this._modifiedPropertyNames = modifiedPropertyNames;
        }

        public boolean init(String columnName, String uncapPropName, String propertyName) {
            this._columnName = columnName;
            this._uncapPropName = uncapPropName;
            this._propertyName = propertyName;
            return _valueMap.containsKey(_columnName);
        }

        public <COLUMN_TYPE> COLUMN_TYPE analyzeString(Class<COLUMN_TYPE> javaType) {
            final Object obj = _valueMap.get(_columnName);
            if (obj == null) {
                _modifiedPropertyNames.remove(_propertyName);
                return null;
            }
            helpCheckingTypeString(obj, _uncapPropName, javaType.getName());
            return (COLUMN_TYPE)obj;
        }

        public <COLUMN_TYPE> COLUMN_TYPE analyzeNumber(Class<COLUMN_TYPE> javaType) {
            final Object obj = _valueMap.get(_columnName);
            if (obj == null) {
                _modifiedPropertyNames.remove(_propertyName);
                return null;
            }
            if (javaType.isAssignableFrom(obj.getClass())) {
                return (COLUMN_TYPE)obj;
            }
            return (COLUMN_TYPE)newInstanceByConstructor(javaType, String.class, obj.toString());
        }

        public <COLUMN_TYPE> COLUMN_TYPE analyzeDate(Class<COLUMN_TYPE> javaType) {
            final Object obj = _valueMap.get(_columnName);
            if (obj == null) {
                _modifiedPropertyNames.remove(_propertyName);
                return null;
            }
            if (javaType.isAssignableFrom(obj.getClass())) {
                return (COLUMN_TYPE)obj;
            }
            return (COLUMN_TYPE)newInstanceByConstructor(javaType, long.class, helpParsingDateString(obj, _uncapPropName, javaType.getName()));
        }

        public <COLUMN_TYPE> COLUMN_TYPE analyzeOther(Class<COLUMN_TYPE> javaType) {
            final Object obj = _valueMap.get(_columnName);
            if (obj == null) {
                _modifiedPropertyNames.remove(_propertyName);
                return null;
            }
            return (COLUMN_TYPE)obj;
        }

	    private void helpCheckingTypeString(Object value, String uncapPropName, String typeName) {
	        MapStringUtil.checkTypeString(value, uncapPropName, typeName);
	    }

	    private long helpParsingDateString(Object value, String uncapPropName, String typeName) {
	        return MapStringUtil.parseDateStringAsMillis(value, uncapPropName, typeName);
	    }

        protected Object newInstanceByConstructor(Class targetType, Class argType, Object arg) {
            java.lang.reflect.Constructor constructor;
            try {
                constructor = targetType.getConstructor(new Class[]{argType});
            } catch (SecurityException e) {
                String msg = "targetType=" + targetType + " argType=" + argType + " arg=" + arg;
                throw new RuntimeException(msg, e);
            } catch (NoSuchMethodException e) {
                String msg = "targetType=" + targetType + " argType=" + argType + " arg=" + arg;
                throw new RuntimeException(msg, e);
            }
            try {
                return constructor.newInstance(new Object[]{arg});
            } catch (IllegalArgumentException e) {
                String msg = "targetType=" + targetType + " argType=" + argType + " arg=" + arg;
                throw new RuntimeException(msg, e);
            } catch (InstantiationException e) {
                String msg = "targetType=" + targetType + " argType=" + argType + " arg=" + arg;
                throw new RuntimeException(msg, e);
            } catch (IllegalAccessException e) {
                String msg = "targetType=" + targetType + " argType=" + argType + " arg=" + arg;
                throw new RuntimeException(msg, e);
            } catch (java.lang.reflect.InvocationTargetException e) {
                String msg = "targetType=" + targetType + " argType=" + argType + " arg=" + arg;
                throw new RuntimeException(msg, e);
            }
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
	@SuppressWarnings("unchecked")
	protected <ENTITY> ENTITY downcast(LdEntity entity) {
		checkDowncast(entity);
		return (ENTITY)entity;
	}

    protected void checkDowncast(LdEntity entity) {
        assertObjectNotNull("entity", entity);
        Class<? extends LdEntity> entityType = getEntityType();
        Class<? extends LdEntity> targetType = entity.getClass();
        if (!entityType.isAssignableFrom(targetType)) {
            String name = entityType.getSimpleName();
            String msg = "The entity should be " + name + " but it was: " + targetType;
            throw new IllegalStateException(msg);
        }
    }

    protected void helpAppendingColumnValueString(StringBuilder sb, String delimiter, String equal, String colName, Object value) {
        sb.append(delimiter).append(colName).append(equal);
        sb.append(helpGettingColumnStringValue(value));
    }

    protected String helpGettingColumnStringValue(Object value) {
        if (value instanceof java.sql.Timestamp) {
            return (value != null ? helpFormatingTimestamp((java.sql.Timestamp)value) : "");
        } else if (value instanceof java.util.Date) {
            return (value != null ? helpFormatingDate((java.util.Date)value) : "");
        } else {
            return (value != null ? value.toString() : "");
        }
    }

    protected String helpFormatingDate(java.util.Date date) {
        return MapStringUtil.formatDate(date);
    }

    protected String helpFormatingTimestamp(java.sql.Timestamp timestamp) {
        return MapStringUtil.formatTimestamp(timestamp);
    }

    protected Map<String, String> setupKeyToLowerMap(boolean dbNameKey) {
        final Map<String, String> map;
		if (dbNameKey) {
		    map = newConcurrentHashMap(getTableDbName().toLowerCase(), getTablePropertyName());
		} else {
		    map = newConcurrentHashMap(getTablePropertyName().toLowerCase(), getTableDbName());
		}
        Method[] methods = this.getClass().getMethods();
        String columnInfoMethodPrefix = "column";
        try {
            for (Method method : methods) {
                String name = method.getName();
                if (!name.startsWith(columnInfoMethodPrefix)) {
                    continue;
                }
                LdColumnInfo columnInfo = (LdColumnInfo)method.invoke(this);
                String dbName = columnInfo.getColumnDbName();
                String propertyName = columnInfo.getPropertyName();
                if (dbNameKey) {
                    map.put(dbName.toLowerCase(), propertyName);
                } else {
                    map.put(propertyName.toLowerCase(), dbName);                    
                }
            }
			return Collections.unmodifiableMap(map);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
	
    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    // -----------------------------------------------------
    //                                       String Handling
    //                                       ---------------
    protected final String replaceString(String text, String fromText, String toText) {
	    return LdSimpleStringUtil.replace(text, fromText, toText);
    }

    protected String initCap(String str) {
	    return LdSimpleStringUtil.initCap(str);
    }

    protected String initUncap(String str) {
	    return LdSimpleStringUtil.initUncap(str);
    }

    protected String getLineSeparator() {
	    return LdSimpleSystemUtil.getLineSeparator();
    }
		
    // -----------------------------------------------------
    //                                  Collection Generator
    //                                  --------------------
	protected <KEY, VALUE> HashMap<KEY, VALUE> newHashMap() {
        return new HashMap<KEY, VALUE>();
    }

	protected <KEY, VALUE> ConcurrentHashMap<KEY, VALUE> newConcurrentHashMap() {
        return new ConcurrentHashMap<KEY, VALUE>();
    }

	protected <KEY, VALUE> ConcurrentHashMap<KEY, VALUE> newConcurrentHashMap(KEY key, VALUE value) {
		ConcurrentHashMap<KEY, VALUE> map = newConcurrentHashMap();
		map.put(key, value);
        return map;
    }

	protected <KEY, VALUE> LinkedHashMap<KEY, VALUE> newLinkedHashMap() {
        return new LinkedHashMap<KEY, VALUE>();
    }
	
	protected <KEY, VALUE> LinkedHashMap<KEY, VALUE> newLinkedHashMap(KEY key, VALUE value) {
		LinkedHashMap<KEY, VALUE> map = newLinkedHashMap();
		map.put(key, value);
        return map;
    }
	
	protected <ELEMENT> ArrayList<ELEMENT> newArrayList() {
	    return new ArrayList<ELEMENT>();
	}
	
	protected <ELEMENT> ArrayList<ELEMENT> newArrayList(Collection<ELEMENT> collection) {
	    return new ArrayList<ELEMENT>(collection);
	}
	
    // -----------------------------------------------------
    //                                   Reflection Handling
    //                                   -------------------
    /**
     * Does it have the method?
     * @param methodName The name of method. (NotNull, NotEmpty, PublicMethodOnly)
     * @return Determination.
     */
    protected boolean hasMethod(String methodName) {
        assertStringNotNullAndNotTrimmedEmpty("methodName", methodName);
        if (_methodNameMap.isEmpty()) {
            synchronized (_methodNameMap) {
                if (_methodNameMap.isEmpty()) {
                    final Method[] methods = this.getClass().getMethods();
                    for (Method method : methods) {
                        _methodNameMap.put(method.getName(), DUMMY_VALUE);
                    }
                }
            }
        }
        return _methodNameMap.containsKey(methodName);
    }
	
    // -----------------------------------------------------
    //                                         Assert Object
    //                                         -------------
    /**
     * Assert that the argument is not null.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     */
    protected void assertObjectNotNull(String variableName, Object value) {
        LdSimpleAssertUtil.assertObjectNotNull(variableName, value);
    }

    // -----------------------------------------------------
    //                                         Assert String
    //                                         -------------
    /**
     * Assert that the string is not null and not trimmed empty.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     */
    protected void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        LdSimpleAssertUtil.assertStringNotNullAndNotTrimmedEmpty(variableName, value);
    }
}

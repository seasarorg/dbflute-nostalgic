/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import dbflute.ldb.allcommon.cbean.ckey.LdConditionKey;
import dbflute.ldb.allcommon.cbean.coption.LdConditionOption;
import dbflute.ldb.allcommon.cbean.coption.LdFromToOption;
import dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption;
import dbflute.ldb.allcommon.cbean.coption.LdInScopeOption;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaProvider;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.allcommon.exception.LdRequiredOptionNotFoundException;
import dbflute.ldb.allcommon.util.LdSimpleStringUtil;
import dbflute.ldb.allcommon.util.LdSimpleSystemUtil;
import dbflute.ldb.allcommon.util.LdTraceViewUtil;

/**
 * The abstract class of condition-query.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractConditionQuery implements LdConditionQuery {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    protected static final LdConditionKey CK_EQ = LdConditionKey.CK_EQUAL;
    protected static final LdConditionKey CK_NE = LdConditionKey.CK_NOT_EQUAL;
    protected static final LdConditionKey CK_GE = LdConditionKey.CK_GREATER_EQUAL;
    protected static final LdConditionKey CK_GT = LdConditionKey.CK_GREATER_THAN;
    protected static final LdConditionKey CK_LE = LdConditionKey.CK_LESS_EQUAL;
    protected static final LdConditionKey CK_LT = LdConditionKey.CK_LESS_THAN;
    protected static final LdConditionKey CK_PS = LdConditionKey.CK_PREFIX_SEARCH;
    protected static final LdConditionKey CK_INS = LdConditionKey.CK_IN_SCOPE;
    protected static final LdConditionKey CK_NINS = LdConditionKey.CK_NOT_IN_SCOPE;
    protected static final LdConditionKey CK_LS = LdConditionKey.CK_LIKE_SEARCH;
    protected static final LdConditionKey CK_NLS = LdConditionKey.CK_NOT_LIKE_SEARCH;
    protected static final LdConditionKey CK_ISN = LdConditionKey.CK_IS_NULL;
    protected static final LdConditionKey CK_ISNN = LdConditionKey.CK_IS_NOT_NULL;

    /** Condition value for DUMMY. */
    protected static final LdConditionValue DUMMY_CONDITION_VALUE = new LdConditionValue();

    /** Object for DUMMY. */
    protected static final Object DUMMY_OBJECT = new Object();

    /** The property of condition-query. */
    protected static final String CQ_PROPERTY = "conditionQuery";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SQL clause. */
    protected final LdSqlClause _sqlClause;

    /** My alias name. */
    protected final String _aliasName;

    /** The level of nest. */
    protected final int _nestLevel;
    
    /** The level of subQuery. */
    protected int _subQueryLevel;

    // -----------------------------------------------------
    //                                          Foreign Info
    //                                          ------------
    /** The property name of foreign. */
    protected String _foreignPropertyName;

    /** The path of relation. */
    protected String _relationPath;

    /** The query of child. */
    protected final LdConditionQuery _childQuery;

    // -----------------------------------------------------
    //                                                Inline
    //                                                ------
    /** Is it the inline for on-clause. (Property for Inline Only) */
    protected boolean _onClauseInline;
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * @param childQuery Child query. (Nullable: If null, this is base instance.)
     * @param sqlClause SQL clause instance. (NotNull)
     * @param aliasName My alias name. (NotNull)
     * @param nestLevel Nest level.
     */
    public LdAbstractConditionQuery(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        _childQuery = childQuery;
        _sqlClause = sqlClause;
        _aliasName = aliasName;
        _nestLevel = nestLevel;
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    /**
     * Get the provider of DB meta.
     * @return The provider of DB meta. (NotNull)
     */
    protected abstract LdDBMetaProvider getDBMetaProvider();

    protected LdDBMeta findDBMeta(String tableFlexibleName) {
        return getDBMetaProvider().provideDBMetaChecked(tableFlexibleName);
    }

    // ===================================================================================
    //                                                                  Important Accessor
    //                                                                  ==================
    /**
     * Get child query.
     * @return Child query. (Nullable)
     */
    public LdConditionQuery getChildQuery() {
        return _childQuery;
    }

    /**
     * Get sql clause.
     * @return Sql clause. (NotNull)
     */
    public LdSqlClause getSqlClause() {
        return _sqlClause;
    }

    /**
     * Get alias name.
     * @return Alias name. (NotNull)
     */
    public String getAliasName() {
        return _aliasName;
    }

    /**
     * Get nest level.
     * @return Nest level.
     */
    public int getNestLevel() {
        return _nestLevel;
    }

    /**
     * Get next nest level.
     * @return Next nest level.
     */
    public int getNextNestLevel() {
        return _nestLevel+1;
    }

    /**
     * Is base query?
     * @param query Condition query. (NotNull)
     * @return Determination.
     */
    public boolean isBaseQuery(LdConditionQuery query) {
        return (query.getChildQuery() == null);
    }

    /**
     * Get the level of subQuery.
     * @return The level of subQuery.
     */
    public int getSubQueryLevel() {
        return _subQueryLevel;
    }
    
    // -----------------------------------------------------
    //                                             Real Name
    //                                             ---------
    /**
     * Get real alias name(that has nest level mark).
     * @return Real alias name.
     */
    public String getRealAliasName() {
        return getAliasName();
    }

    /**
     * Get real column name(with real alias name).
     * @param columnName Column name without alias name. This should not contain comma. (NotNull)
     * @return Real column name.
     */
    public String getRealColumnName(String columnName) {
        assertColumnName(columnName);
        return buildRealColumnName(getRealAliasName(), columnName);
    }

    /**
     * Build real column name.
     * @param aliasName Alias name. (NotNull)
     * @param columnName Column name. (NotNull)
     * @return Real column name. (NotNull)
     */
    protected String buildRealColumnName(String aliasName, String columnName) {
        return aliasName + "." + columnName;
    }

    // -----------------------------------------------------
    //                                          Foreign Info
    //                                          ------------
    public String getForeignPropertyName() {
        return _foreignPropertyName;
    }

    public void xsetForeignPropertyName(String foreignPropertyName) {
        this._foreignPropertyName = foreignPropertyName;
    }

    public String getRelationPath() {
        return _relationPath;
    }

    public void xsetRelationPath(String relationPath) {
        this._relationPath = relationPath;
    }

    // -----------------------------------------------------
    //                                                Inline
    //                                                ------
    public void xsetOnClauseInline(boolean onClauseInline) {
        _onClauseInline = onClauseInline;
    }
    
    // ===================================================================================
    //                                                                            Location
    //                                                                            ========
    /**
     * Get location.
     * @param columnPropertyName Column property name.
     * @param key Condition key.
     * @return Next nest level.
     */
    protected String getLocation(String columnPropertyName, LdConditionKey key) {
        return getLocationBase(columnPropertyName) + "." + key.getConditionKey();
    }

    protected String getLocationBase() {
        final StringBuffer sb = new StringBuffer();
        LdConditionQuery query = this;
        while (true) {
            if (query.isBaseQuery(query)) {
                sb.insert(0, CQ_PROPERTY + ".");
                break;
            } else {
                final String foreignPropertyName = query.getForeignPropertyName();
                if (foreignPropertyName == null) {
                    String msg = "The foreignPropertyName of the query should not be null:";
                    msg = msg + " query=" + query;
                    throw new IllegalStateException(msg);
                }
                sb.insert(0, CQ_PROPERTY + initCap(foreignPropertyName) + ".");
            }
            query = query.getChildQuery();
        }
        return sb.toString();
    }

    protected String getLocationBase(String columnPropertyName) {
        return getLocationBase() + columnPropertyName;
    }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    /** The map of union query. */
    protected Map<String, LdConditionQuery> _unionQueryMap;

    /**
     * Get the map of union query.
     * @return The map of union query. (NotNull)
     */
    public Map<String, LdConditionQuery> getUnionQueryMap() {// for Internal
        if (_unionQueryMap == null) {
            _unionQueryMap = new LinkedHashMap<String, LdConditionQuery>();
        }
        return _unionQueryMap;
    }

    /**
     * Set union query. {Internal}
     * @param unionQuery Union query. (NotNull)
     */
    public void xsetUnionQuery(LdConditionQuery unionQuery) {
        xsetupUnion(unionQuery, false, getUnionQueryMap());
    }

    /** The map of union all query. */
    protected Map<String, LdConditionQuery> _unionAllQueryMap;

    /**
     * Get the map of union all query.
     * @return The map of union all query. (NotNull)
     */
    public Map<String, LdConditionQuery> getUnionAllQueryMap() {// for Internal
        if (_unionAllQueryMap == null) {
            _unionAllQueryMap = new LinkedHashMap<String, LdConditionQuery>();
        }
        return _unionAllQueryMap;
    }

    /**
     * Set union all query. {Internal}
     * @param unionAllQuery Union all query. (NotNull)
     */
    public void xsetUnionAllQuery(LdConditionQuery unionAllQuery) {
        xsetupUnion(unionAllQuery, true, getUnionAllQueryMap());
    }

    protected void xsetupUnion(LdConditionQuery unionQuery, boolean unionAll, Map<String, LdConditionQuery> unionQueryMap) {
        if (unionQuery == null) {
            String msg = "The argument[unionQuery] should not be null.";
            throw new IllegalArgumentException(msg);
        }
        reflectRelationOnUnionQuery(this, unionQuery); // Reflect Relation!
        String key = (unionAll ? "unionAllQuery" : "unionQuery") + unionQueryMap.size();
        unionQueryMap.put(key, unionQuery);
        registerUnionQuery(unionQuery, unionAll, (unionAll ? "unionAllQueryMap" : "unionQueryMap") + "." + key);
    }

    /**
     * Reflect relation on union query.
     * @param baseQueryAsSuper Base query as super. (NotNull)
     * @param unionQueryAsSuper Union query as super. (NotNull)
     */
    abstract protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper);

    /**
     * Has union query or union all query?
     * @return Determination.
     */
    public boolean hasUnionQueryOrUnionAllQuery() {
        return (_unionQueryMap != null && !_unionQueryMap.isEmpty()) || (_unionAllQueryMap != null && !_unionAllQueryMap.isEmpty());
    }

    /**
     * Get the list of union query.
     * @return The list of union query. (NotNull)
     */
    public List<LdConditionQuery> getUnionQueryList() {
        if (_unionQueryMap == null) { return new ArrayList<LdConditionQuery>(); }
        return new ArrayList<LdConditionQuery>(_unionQueryMap.values());
    }

    /**
     * Get the list of union all query.
     * @return The list of union all query. (NotNull)
     */
    public List<LdConditionQuery> getUnionAllQueryList() {
        if (_unionAllQueryMap == null) { return new ArrayList<LdConditionQuery>(); }
        return new ArrayList<LdConditionQuery>(_unionAllQueryMap.values());
    }

    // ===================================================================================
    //                                                                            Register
    //                                                                            ========
    // -----------------------------------------------------
    //                                                 Query
    //                                                 -----
    protected void registerQuery(LdConditionKey key, Object value, LdConditionValue cvalue
                                 , String colName, String capPropName, String uncapPropName) {
        if (key.isValidRegistration(cvalue, value, key.getConditionKey() + " of " + getRealAliasName() + "." + colName)) {
            setupConditionValueAndRegisterWhereClause(key, value, cvalue, colName, capPropName, uncapPropName);
        }
    }

    protected void registerQuery(LdConditionKey key, Object value, LdConditionValue cvalue
                                 , String colName, String capPropName, String uncapPropName, LdConditionOption option) {
        if (key.isValidRegistration(cvalue, value, key.getConditionKey() + " of " + getRealAliasName() + "." + colName)) {
            setupConditionValueAndRegisterWhereClause(key, value, cvalue, colName, capPropName, uncapPropName, option);
        }
    }

    // -----------------------------------------------------
    //                                          FromTo Query
    //                                          ------------
    protected void registerFromToQuery(java.util.Date fromDate, java.util.Date toDate, LdConditionValue cvalue
                                 , String colName, String capPropName, String uncapPropName, LdFromToOption option) {
        {
            final java.util.Date filteredFromDate = option.filterFromDate(fromDate);
            final LdConditionKey fromKey = option.getFromDateConditionKey();
            if (fromKey.isValidRegistration(cvalue, filteredFromDate, fromKey.getConditionKey() + " of " + getRealAliasName() + "." + uncapPropName)) {
                setupConditionValueAndRegisterWhereClause(fromKey, filteredFromDate, cvalue, colName, capPropName, uncapPropName);
            }
        }
        {
            final java.util.Date filteredToDate = option.filterToDate(toDate);
            final LdConditionKey toKey = option.getToDateConditionKey();
            if (toKey.isValidRegistration(cvalue, filteredToDate, toKey.getConditionKey() + " of " + getRealAliasName() + "." + uncapPropName)) {
                setupConditionValueAndRegisterWhereClause(toKey, filteredToDate, cvalue, colName, capPropName, uncapPropName);
            }
        }
    }

    // -----------------------------------------------------
    //                                      LikeSearch Query
    //                                      ----------------
    protected void regLSQ(LdConditionKey key
                        , String value
                        , LdConditionValue cvalue
                        , String colName
                        , String capPropName
                        , String uncapPropName
                        , LdLikeSearchOption option) {
        registerLikeSearchQuery(key, value, cvalue, colName, capPropName, uncapPropName, option);
    }

    @SuppressWarnings("deprecation")
    protected void registerLikeSearchQuery(LdConditionKey key
                                         , String value
                                         , LdConditionValue cvalue
                                         , String colName
                                         , String capPropName
                                         , String uncapPropName
                                         , LdLikeSearchOption option) {
        final String validationMsg = key.getConditionKey() + " of " + getRealAliasName() + "." + colName;
        if (!key.isValidRegistration(cvalue, value, validationMsg)) {
            return;
        }
        if (option == null) {
            throwLikeSearchOptionNotFoundException(capPropName, value);
            return;// Unreachable!
        }
        if (value == null || !option.isSplit()) {
            // As Normal Condition.
            setupConditionValueAndRegisterWhereClause(key, value, cvalue, colName, capPropName, uncapPropName, option);
            return;
        }
        // - - - - - - - - -
        // Use splitByXxx().
        // - - - - - - - - -
        final String[] strArray = option.generateSplitValueArray(value);
        if (!option.isAsOrSplit()) {
            // As 'and' Condition
            for (int i = 0; i < strArray.length; i++) {
                final String currentValue = strArray[i];
                setupConditionValueAndRegisterWhereClause(key, currentValue, cvalue, colName, capPropName, uncapPropName, option);
                
                // Callback for LikeAsOr!
                final List<LdLikeSearchOption.LikeAsOrCallback> callbackList = option.getLikeAsOrCallbackList();
                if (!callbackList.isEmpty()) {
                    getSqlClause().makeAdditionalConditionAsOrEffective();
                    for (Iterator<LdLikeSearchOption.LikeAsOrCallback> ite = callbackList.iterator(); ite.hasNext();) {
                        final LdLikeSearchOption.LikeAsOrCallback likeAsOrCallback = (LdLikeSearchOption.LikeAsOrCallback) ite.next();
                        final String additionalTargetPropertyName = likeAsOrCallback.getAdditionalTargetPropertyName();
                        final String filteredValue = likeAsOrCallback.filterValue(currentValue);
                        final LdLikeSearchOption optionDeepCopy = (LdLikeSearchOption) option.createDeepCopy();
                        optionDeepCopy.clearLikeAsOrCallback();
                        final LdLikeSearchOption filteredOption = likeAsOrCallback.filterOption(optionDeepCopy);
                        invokeSetterLikeSearch(additionalTargetPropertyName, filteredValue, filteredOption);
                    }
                    getSqlClause().ignoreAdditionalConditionAsOr();
                }
            }
        } else {
            // As 'or' Condition
            for (int i = 0; i < strArray.length; i++) {
                final String currentValue = strArray[i];
                if (i == 0) {
                    setupConditionValueAndRegisterWhereClause(key, currentValue, cvalue, colName, capPropName, uncapPropName, option);
                } else {
                    getSqlClause().makeAdditionalConditionAsOrEffective();
                    invokeSetterLikeSearch(uncapPropName, currentValue, option);
                }
            }
            
            // @jflute -- Callback for LikeAsOr!
            // final List<LdLikeSearchOption.LikeAsOrCallback> callbackList = option.getLikeAsOrCallbackList();
            // ...
            
            getSqlClause().ignoreAdditionalConditionAsOr();
        }
    }

    protected void throwLikeSearchOptionNotFoundException(String capPropName, String value) {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The likeSearchOption was Not Found! (Should not be null!)" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "Please confirm your method call:"  + getLineSeparator();
        final String beanName = getClass().getSimpleName();
        final String methodName = "set" + capPropName + "_LikeSearch('" + value + "', likeSearchOption);";
        msg = msg + "    " + beanName + "." + methodName + getLineSeparator();
        msg = msg + "* * * * * * * * * */" + getLineSeparator();
        throw new LdRequiredOptionNotFoundException(msg);
    }
        
    protected void invokeSetterLikeSearch(String columnFlexibleName, Object value, LdLikeSearchOption option) {
        if (value == null) {
            return;
        }
        final LdDBMeta dbmeta = findDBMeta(getTableDbName());
        final String columnCapPropName = initCap(dbmeta.findPropertyName(columnFlexibleName));
        final String methodName = "set" + columnCapPropName + "_LikeSearch";
        Method method = null;
        try {
            method = this.getClass().getMethod(methodName, new Class[]{value.getClass(), LdLikeSearchOption.class});
        } catch (NoSuchMethodException e) {
            String msg = "The columnFlexibleName is not existing in this table: columnFlexibleName=" + columnFlexibleName;
            msg = msg + " tableName=" + getTableDbName() + " methodName=" + methodName;
            throw new RuntimeException(msg, e);
        }
        try {
            method.invoke(this, new Object[]{value, option});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    // -----------------------------------------------------
    //                                         InScope Query
    //                                         -------------
    protected void registerInScopeQuery(LdConditionKey key, String value, LdConditionValue cvalue
                                     , String colName, String capPropName, String uncapPropName, LdInScopeOption option) {
        if (key.isValidRegistration(cvalue, value, key.getConditionKey() + " of " + getRealAliasName() + "." + colName)) {
            if (value != null && option.isSplit()) {
                final String[] strArray = option.generateSplitValueArray(value);
                final List<String> realValueList = new ArrayList<String>();
                for (int i=0; i < strArray.length; i++) {
                    final String currentValue = strArray[i];
                    realValueList.add(currentValue);
                }
                setupConditionValueAndRegisterWhereClause(key, realValueList, cvalue, colName, capPropName, uncapPropName, option);
            } else {
                setupConditionValueAndRegisterWhereClause(key, value, cvalue, colName, capPropName, uncapPropName, option);
            }
        }
    }

    // -----------------------------------------------------
    //                                          Inline Query
    //                                          ------------
    protected void registerInlineQuery(LdConditionKey key, Object value, LdConditionValue cvalue
                                       , String colName, String capPropName, String uncapPropName) {
        if (key.isValidRegistration(cvalue, value, key.getConditionKey() + " of " + getRealAliasName() + "." + colName)) {
            key.setupConditionValue(cvalue, value, getLocation(uncapPropName, key));// If Java, it is necessary to use uncapPropName!
            if (isBaseQuery(this)) {
                getSqlClause().registerBaseTableInlineWhereClause(colName, key, cvalue);
            } else {
                getSqlClause().registerOuterJoinInlineWhereClause(getRealAliasName(), colName, key, cvalue, _onClauseInline);
            }
        }
    }

    protected void registerInlineQuery(LdConditionKey key, Object value, LdConditionValue cvalue
                                       , String colName, String capPropName, String uncapPropName, LdConditionOption option) {
        if (key.isValidRegistration(cvalue, value, key.getConditionKey() + " of " + getRealAliasName() + "." + colName)) {
            key.setupConditionValue(cvalue, value, getLocation(uncapPropName, key), option);// If Java, it is necessary to use uncapPropName!
            if (isBaseQuery(this)) {
                getSqlClause().registerBaseTableInlineWhereClause(colName, key, cvalue, option);
            } else {
                getSqlClause().registerOuterJoinInlineWhereClause(getRealAliasName(), colName, key, cvalue, option, _onClauseInline);
            }
        }
    }

    // -----------------------------------------------------
    //                                       InScopeSubQuery
    //                                       ---------------
    // {Modified at DBFlute-0.7.5}
    protected void registerInScopeSubQuery(LdConditionQuery subQuery
                                 , String columnName, String relatedColumnName, String propertyName) {
        registerInScopeSubQuery(subQuery, columnName, relatedColumnName, propertyName, null);
    }

    protected void registerNotInScopeSubQuery(LdConditionQuery subQuery
                                 , String columnName, String relatedColumnName, String propertyName) {
        registerInScopeSubQuery(subQuery, columnName, relatedColumnName, propertyName, "not");
    }

    protected void registerInScopeSubQuery(LdConditionQuery subQuery
                                 , String columnName, String relatedColumnName, String propertyName
                                 , String inScopeOption) {
        assertObjectNotNull("InScopeSubQyery(" + columnName + ")", subQuery);
        inScopeOption = inScopeOption != null ? inScopeOption + " " : "";
        String realColumnName = getInScopeSubQueryRealColumnName(columnName);
        xincrementLocalSubQueryLevelIfNeeds(subQuery);
        String subQueryClause = getInScopeSubQuerySql(subQuery, relatedColumnName, propertyName);
        String ln = getLineSeparator();
        int subQueryLevel = subQuery.getSubQueryLevel();
        String subQueryIdentity = propertyName + "[" + subQueryLevel + "]";
        String beginMark = getSqlClause().resolveSubQueryBeginMark(subQueryIdentity) + ln;
        String endMark = getSqlClause().resolveSubQueryEndMark(subQueryIdentity);
        String endIndent = "       ";
        String clause = realColumnName + " " + inScopeOption + "in (" + beginMark + subQueryClause + ln + endIndent + ")" + endMark;
        registerWhereClause(clause);
    }

    protected String getInScopeSubQueryRealColumnName(String columnName) {
        return getRealColumnName(columnName);
    }

    protected String getInScopeSubQuerySql(LdConditionQuery subQuery
                                 , String relatedColumnName, String propertyName) {
        String tableAliasName = getSqlClause().getLocalTableAliasName();
        String selectClause = "select " + tableAliasName+ "." + relatedColumnName;
        String fromWhereClause = buildPlainSubQueryFromWhereClause(subQuery, relatedColumnName, propertyName
                                                                 , selectClause, tableAliasName);
        return selectClause + " " + fromWhereClause;
    }

    // -----------------------------------------------------
    //                                        ExistsSubQuery
    //                                        --------------
    // {Modified at DBFlute-0.7.5}
    protected void registerExistsSubQuery(LdConditionQuery subQuery
                                 , String columnName, String relatedColumnName, String propertyName) {
        registerExistsSubQuery(subQuery, columnName, relatedColumnName, propertyName, null);
    }

    protected void registerNotExistsSubQuery(LdConditionQuery subQuery
                                 , String columnName, String relatedColumnName, String propertyName) {
        registerExistsSubQuery(subQuery, columnName, relatedColumnName, propertyName, "not");
    }

    protected void registerExistsSubQuery(LdConditionQuery subQuery
                                 , String columnName, String relatedColumnName, String propertyName
                                 , String existsOption) {
        assertObjectNotNull("ExistsSubQyery(" + columnName + ")", subQuery);
        existsOption = existsOption != null ? existsOption + " " : "";
        String realColumnName = getExistsSubQueryRealColumnName(columnName);
        xincrementLocalSubQueryLevelIfNeeds(subQuery);
        String subQueryClause = getExistsSubQuerySql(subQuery, realColumnName, relatedColumnName, propertyName);
        String ln = getLineSeparator();
        int subQueryLevel = subQuery.getSubQueryLevel();
        String subQueryIdentity = propertyName + "[" + subQueryLevel + "]";
        String beginMark = getSqlClause().resolveSubQueryBeginMark(subQueryIdentity) + ln;
        String endMark = getSqlClause().resolveSubQueryEndMark(subQueryIdentity);
        String endIndent = "       ";
        String clause = existsOption + "exists (" + beginMark + subQueryClause + ln + endIndent + ")" + endMark;
        registerWhereClause(clause);
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    // *Unsupport ExistsSubQuery as inline because it's so dangerous.
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    protected String getExistsSubQueryRealColumnName(String columnName) {
        return getRealColumnName(columnName);
    }

    protected String getExistsSubQuerySql(LdConditionQuery subQuery
                                 , String realColumnName, String relatedColumnName, String propertyName) {
        int subQueryLevel = subQuery.getSubQueryLevel();
        String tableAliasName = "dfsublocal_" + subQueryLevel;
        String selectClause = "select " + tableAliasName + "." + relatedColumnName;
        String fromWhereClause = buildCorrelationSubQueryFromWhereClause(subQuery, relatedColumnName, propertyName
                                                                       , selectClause, tableAliasName, realColumnName);
        return selectClause + " " + fromWhereClause;
    }

    // [DBFlute-0.7.4]
    // -----------------------------------------------------
    //                              (Specify)DerivedReferrer
    //                              ------------------------
    protected void registerSpecifyDerivedReferrer(String function, LdConditionQuery subQuery
                                                , String columnName, String relatedColumnName
                                                , String propertyName, String aliasName) {
        assertObjectNotNull("SpecifyDerivedReferrer(function)", function);
        assertObjectNotNull("SpecifyDerivedReferrer(" + columnName + ")", subQuery);
        String realColumnName = getSpecifyDerivedReferrerRealColumnName(columnName);
        xincrementLocalSubQueryLevelIfNeeds(subQuery);
        String subQueryClause = getSpecifyDerivedReferrerSubQuerySql(function, subQuery, realColumnName
                                                                   , relatedColumnName, propertyName, aliasName);
        String ln = getLineSeparator();
        int subQueryLevel = subQuery.getSubQueryLevel();
        String subQueryIdentity = propertyName + "[" + subQueryLevel + "]";
        String beginMark = getSqlClause().resolveSubQueryBeginMark(subQueryIdentity) + ln;
        String endMark = getSqlClause().resolveSubQueryEndMark(subQueryIdentity);
        String endIndent = "       ";
        String clause = "(" + beginMark + subQueryClause + ln + endIndent + ") as " + aliasName + endMark;
        getSqlClause().specifyDeriveSubQuery(aliasName, clause);
    }

    protected String getSpecifyDerivedReferrerRealColumnName(String columnName) {
        return getRealColumnName(columnName);
    }

    protected String getSpecifyDerivedReferrerSubQuerySql(String function, LdConditionQuery subQuery
                                                        , String realColumnName, String relatedColumnName
                                                        , String propertyName, String aliasName) {
        int subQueryLevel = subQuery.getSubQueryLevel();
        String tableAliasName = "dfsublocal_" + subQueryLevel;
        String deriveColumnName = subQuery.getSqlClause().getSpecifiedColumnNameAsOne();
        if (deriveColumnName == null || deriveColumnName.trim().length() == 0) {
            throwSpecifyDerivedReferrerInvalidColumnSpecificationException(function, aliasName);
        }
        assertSpecifyDerivedReferrerColumnType(function, subQuery, deriveColumnName);
        subQuery.getSqlClause().clearSpecifiedSelectColumn(); // specified columns disappear at this timing
        String connect = xbuildFunctionConnector(function);
        if (subQuery.getSqlClause().hasUnionQuery()) {
            String ln = getLineSeparator();
            String subQueryIdentity = propertyName + "[" + subQueryLevel + ":subquerymain]";
            String beginMark = getSqlClause().resolveSubQueryBeginMark(subQueryIdentity) + ln;
            String endMark = getSqlClause().resolveSubQueryEndMark(subQueryIdentity);
            LdDBMeta dbmeta = findDBMeta(subQuery.getTableDbName());
            if (!dbmeta.hasPrimaryKey() || dbmeta.hasTwoOrMorePrimaryKeys()) {
                String msg = "The derived-referrer is unsupported when no primary key or two-or-more primary keys:";
                msg = msg + " table=" + subQuery.getTableDbName();
                throw new UnsupportedOperationException(msg);
            }
            String primaryKeyName = dbmeta.getPrimaryUniqueInfo().getFirstColumn().getColumnDbName();
            String selectClause = "select " + tableAliasName + "." + primaryKeyName 
                                     + ", " + tableAliasName + "." + relatedColumnName
                                     + ", " + tableAliasName + "." + deriveColumnName;
            String fromWhereClause = buildPlainSubQueryFromWhereClause(subQuery, relatedColumnName, propertyName
                                                                     , selectClause, tableAliasName);
            String mainSql = selectClause + " " + fromWhereClause;
            String joinCondition = "dfsubquerymain." + relatedColumnName + " = " + realColumnName;
            return "select " + function + connect + "dfsubquerymain." + deriveColumnName + ")" + ln
                 + "  from (" + beginMark
                 + mainSql + ln
                 + "       ) dfsubquerymain" + endMark + ln + " where " + joinCondition;
        } else {
            String selectClause = "select " + function + connect + tableAliasName + "." + deriveColumnName + ")";
            String fromWhereClause = buildCorrelationSubQueryFromWhereClause(subQuery, relatedColumnName, propertyName
                                                                           , selectClause, tableAliasName, realColumnName);
            return selectClause + " " + fromWhereClause;
        }
    }

    protected void throwSpecifyDerivedReferrerInvalidColumnSpecificationException(String function, String aliasName) {
        String method = xconvertFunctionToMethod(function);
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The specified the column for derived-referrer was Invalid!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + " You should call specify().column[TargetColumn]() only once." + getLineSeparator();
        msg = msg + "  For example:" + getLineSeparator();
        msg = msg + "    " + getLineSeparator();
        msg = msg + "    [Wrong]" + getLineSeparator();
        msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
        msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
        msg = msg + "    cb.specify().derivePurchaseList()." + method + "(new SubQuery<PurchaseCB>() {" + getLineSeparator();
        msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
        msg = msg + "            // *No! It's empty!" + getLineSeparator();
        msg = msg + "        }" + getLineSeparator();
        msg = msg + "    }, \"LATEST_PURCHASE_DATETIME\");" + getLineSeparator();
        msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
        msg = msg + "    " + getLineSeparator();
        msg = msg + "    [Wrong]" + getLineSeparator();
        msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
        msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
        msg = msg + "    cb.specify().derivePurchaseList()." + method + "(new SubQuery<PurchaseCB>() {" + getLineSeparator();
        msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
        msg = msg + "            subCB.specify().columnPurchaseDatetime();" + getLineSeparator();
        msg = msg + "            subCB.specify().columnPurchaseCount(); // *No! It's duplicated!" + getLineSeparator();
        msg = msg + "        }" + getLineSeparator();
        msg = msg + "    }, \"LATEST_PURCHASE_DATETIME\");" + getLineSeparator();
        msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
        msg = msg + "    " + getLineSeparator();
        msg = msg + "    [Good!]" + getLineSeparator();
        msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
        msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
        msg = msg + "    cb.specify().derivePurchaseList()." + method + "(new SubQuery<PurchaseCB>() {" + getLineSeparator();
        msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
        msg = msg + "            subCB.specify().columnPurchaseDatetime(); // *Point!" + getLineSeparator();
        msg = msg + "        }" + getLineSeparator();
        msg = msg + "    }, \"LATEST_PURCHASE_DATETIME\");" + getLineSeparator();
        msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Alias Name]" + getLineSeparator() + aliasName + getLineSeparator();
        msg = msg + "* * * * * * * * * */";
        throw new SpecifyDerivedReferrerInvalidColumnSpecificationException(msg);
    }

    public static class SpecifyDerivedReferrerInvalidColumnSpecificationException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public SpecifyDerivedReferrerInvalidColumnSpecificationException(String msg) {
            super(msg);
        }
    }

    protected void assertSpecifyDerivedReferrerColumnType(String function, LdConditionQuery subQuery, String deriveColumnName) {
        final LdDBMeta dbmeta = findDBMeta(subQuery.getTableDbName());
        final Class<?> deriveColumnType = dbmeta.findColumnInfo(deriveColumnName).getPropertyType();
        if ("sum".equalsIgnoreCase(function) || "avg".equalsIgnoreCase(function)) {
            if (!Number.class.isAssignableFrom(deriveColumnType)) {
                throwSpecifyDerivedReferrerUnmatchedColumnTypeException(function, deriveColumnName, deriveColumnType);
            }
        }
    }

    protected void throwSpecifyDerivedReferrerUnmatchedColumnTypeException(String function, String deriveColumnName, Class<?> deriveColumnType) {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The type of the specified the column unmatched with the function!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "You should confirm the list as follow:" + getLineSeparator();
        msg = msg + "    count() : String, Number, Date *with distinct same" + getLineSeparator();
        msg = msg + "    max()   : String, Number, Date" + getLineSeparator();
        msg = msg + "    min()   : String, Number, Date" + getLineSeparator();
        msg = msg + "    sum()   : Number" + getLineSeparator();
        msg = msg + "    avg()   : Number" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Function]" + getLineSeparator() + function + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Derive Column]" + getLineSeparator() + deriveColumnName + "(" + deriveColumnType.getName() + ")" + getLineSeparator();
        msg = msg + "* * * * * * * * * */";
        throw new SpecifyDerivedReferrerUnmatchedColumnTypeException(msg);
    }

    public static class SpecifyDerivedReferrerUnmatchedColumnTypeException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public SpecifyDerivedReferrerUnmatchedColumnTypeException(String msg) {
            super(msg);
        }
    }

    // [DBFlute-0.8.8.1]
    // -----------------------------------------------------
    //                                (Query)DerivedReferrer
    //                                ----------------------
    protected void registerQueryDerivedReferrer(String function, LdConditionQuery subQuery
                                              , String columnName, String relatedColumnName, String propertyName
                                              , String operand, Object value, String parameterPropertyName) {
        assertObjectNotNull("QueryDerivedReferrer(function)", function);
        assertObjectNotNull("QueryDerivedReferrer(" + columnName + ")", subQuery);
        String realColumnName = getQueryDerivedReferrerRealColumnName(columnName);
        xincrementLocalSubQueryLevelIfNeeds(subQuery);
        String subQueryClause = getQueryDerivedReferrerSubQuerySql(function, subQuery, realColumnName
                                                                 , relatedColumnName, propertyName, value);
        String ln = getLineSeparator();
        int subQueryLevel = subQuery.getSubQueryLevel();
        String subQueryIdentity = propertyName + "[" + subQueryLevel + "]";
        String beginMark = getSqlClause().resolveSubQueryBeginMark(subQueryIdentity) + ln;
        String endMark = getSqlClause().resolveSubQueryEndMark(subQueryIdentity);
        String endIndent = "       ";
        String parameter = "/*dto." + getLocationBase(parameterPropertyName) + "*/" + value;
        String clause = "(" + beginMark
                      + subQueryClause + ln + endIndent
                      + ") " + operand + " " + parameter + " " + endMark;
        registerWhereClause(clause);
    }

    protected String getQueryDerivedReferrerRealColumnName(String columnName) {
        return getRealColumnName(columnName);
    }

    protected String getQueryDerivedReferrerSubQuerySql(String function, LdConditionQuery subQuery
                                                      , String realColumnName, String relatedColumnName
                                                      , String propertyName, Object value) {
        int subQueryLevel = subQuery.getSubQueryLevel();
        String tableAliasName = "dfsublocal_" + subQueryLevel;
        String deriveColumnName = subQuery.getSqlClause().getSpecifiedColumnNameAsOne();
        if (deriveColumnName == null || deriveColumnName.trim().length() == 0) {
            throwQueryDerivedReferrerInvalidColumnSpecificationException(function);
        }
        assertQueryDerivedReferrerColumnType(function, subQuery, deriveColumnName, value);
        subQuery.getSqlClause().clearSpecifiedSelectColumn(); // specified columns disappear at this timing
        String connect = xbuildFunctionConnector(function);
        if (subQuery.getSqlClause().hasUnionQuery()) {
            String ln = getLineSeparator();
            String subQueryIdentity = propertyName + "[" + subQueryLevel + ":subquerymain]";
            String beginMark = getSqlClause().resolveSubQueryBeginMark(subQueryIdentity) + ln;
            String endMark = getSqlClause().resolveSubQueryEndMark(subQueryIdentity);
            LdDBMeta dbmeta = findDBMeta(subQuery.getTableDbName());
            if (!dbmeta.hasPrimaryKey() || dbmeta.hasTwoOrMorePrimaryKeys()) {
                String msg = "The derived-referrer is unsupported when no primary key or two-or-more primary keys:";
                msg = msg + " table=" + subQuery.getTableDbName();
                throw new UnsupportedOperationException(msg);
            }
            String primaryKeyName = dbmeta.getPrimaryUniqueInfo().getFirstColumn().getColumnDbName();
            String selectClause = "select " + tableAliasName + "." + primaryKeyName 
                                     + ", " + tableAliasName + "." + relatedColumnName
                                     + ", " + tableAliasName + "." + deriveColumnName;
            String fromWhereClause = buildPlainSubQueryFromWhereClause(subQuery, relatedColumnName, propertyName
                                                                     , selectClause, tableAliasName);
            String mainSql = selectClause + " " + fromWhereClause;
            String joinCondition = "dfsubquerymain." + relatedColumnName + " = " + realColumnName;
            return "select " + function + connect + "dfsubquerymain." + deriveColumnName + ")" + ln
                 + "  from (" + beginMark
                 + mainSql + ln
                 + "       ) dfsubquerymain" + endMark + ln + " where " + joinCondition;
        } else {
            String selectClause = "select " + function + connect + tableAliasName + "." + deriveColumnName + ")";
            String fromWhereClause = buildCorrelationSubQueryFromWhereClause(subQuery, relatedColumnName, propertyName
                                                                           , selectClause, tableAliasName, realColumnName);
            return selectClause + " " + fromWhereClause;
        }
    }

    protected void throwQueryDerivedReferrerInvalidColumnSpecificationException(String function) {
        String method = xconvertFunctionToMethod(function);
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The specified the column for derived-referrer was Invalid!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + " You should call specify().column[TargetColumn]() only once." + getLineSeparator();
        msg = msg + "  For example:" + getLineSeparator();
        msg = msg + "    " + getLineSeparator();
        msg = msg + "    [Wrong]" + getLineSeparator();
        msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
        msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
        msg = msg + "    cb.query().scalarPurchaseList()." + method + "(new SubQuery<PurchaseCB>() {" + getLineSeparator();
        msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
        msg = msg + "            // *No! It's empty!" + getLineSeparator();
        msg = msg + "        }" + getLineSeparator();
        msg = msg + "    }).greaterEqual(123);" + getLineSeparator();
        msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
        msg = msg + "    " + getLineSeparator();
        msg = msg + "    [Wrong]" + getLineSeparator();
        msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
        msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
        msg = msg + "    cb.query().scalarPurchaseList()." + method + "(new SubQuery<PurchaseCB>() {" + getLineSeparator();
        msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
        msg = msg + "            subCB.specify().columnPurchaseDatetime();" + getLineSeparator();
        msg = msg + "            subCB.specify().columnPurchaseCount(); // *No! It's duplicated!" + getLineSeparator();
        msg = msg + "        }" + getLineSeparator();
        msg = msg + "    }).greaterEqual(123);" + getLineSeparator();
        msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
        msg = msg + "    " + getLineSeparator();
        msg = msg + "    [Good!]" + getLineSeparator();
        msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
        msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
        msg = msg + "    cb.query().scalarPurchaseList()." + method + "(new SubQuery<PurchaseCB>() {" + getLineSeparator();
        msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
        msg = msg + "            subCB.specify().columnPurchaseDatetime(); // *Point!" + getLineSeparator();
        msg = msg + "        }" + getLineSeparator();
        msg = msg + "    }).greaterEqual(123);" + getLineSeparator();
        msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "* * * * * * * * * */";
        throw new QueryDerivedReferrerInvalidColumnSpecificationException(msg);
    }

    public static class QueryDerivedReferrerInvalidColumnSpecificationException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public QueryDerivedReferrerInvalidColumnSpecificationException(String msg) {
            super(msg);
        }
    }

    protected void assertQueryDerivedReferrerColumnType(String function, LdConditionQuery subQuery, String deriveColumnName, Object value) {
        LdDBMeta dbmeta = findDBMeta(subQuery.getTableDbName());
        Class<?> deriveColumnType = dbmeta.findColumnInfo(deriveColumnName).getPropertyType();
        if ("sum".equalsIgnoreCase(function) || "avg".equalsIgnoreCase(function)) {
            if (!Number.class.isAssignableFrom(deriveColumnType)) {
                throwQueryDerivedReferrerUnmatchedColumnTypeException(function, deriveColumnName, deriveColumnType, value);
            }
        }
        if (value != null) {
            Class<?> parameterType = value.getClass();
            if (String.class.isAssignableFrom(deriveColumnType)) {
                if (!String.class.isAssignableFrom(parameterType)) {
                    throwQueryDerivedReferrerUnmatchedColumnTypeException(function, deriveColumnName, deriveColumnType, value);
                }
            }
            if (Number.class.isAssignableFrom(deriveColumnType)) {
                if (!Number.class.isAssignableFrom(parameterType)) {
                    throwQueryDerivedReferrerUnmatchedColumnTypeException(function, deriveColumnName, deriveColumnType, value);
                }
            }
            if (java.util.Date.class.isAssignableFrom(deriveColumnType)) {
                if (!java.util.Date.class.isAssignableFrom(parameterType)) {
                    throwQueryDerivedReferrerUnmatchedColumnTypeException(function, deriveColumnName, deriveColumnType, value);
                }
            }
        }
    }

    protected void throwQueryDerivedReferrerUnmatchedColumnTypeException(String function, String deriveColumnName, Class<?> deriveColumnType, Object value) {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The type of the specified the column unmatched with the function or the parameter!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "You should confirm the list as follow:" + getLineSeparator();
        msg = msg + "    count() : String, Number, Date *with distinct same" + getLineSeparator();
        msg = msg + "    max()   : String, Number, Date" + getLineSeparator();
        msg = msg + "    min()   : String, Number, Date" + getLineSeparator();
        msg = msg + "    sum()   : Number" + getLineSeparator();
        msg = msg + "    avg()   : Number" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Function]" + getLineSeparator() + function + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Derive Column]" + getLineSeparator() + deriveColumnName + "(" + deriveColumnType.getName() + ")" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Parameter Type]" + getLineSeparator() + (value != null ? value.getClass() : null) + getLineSeparator();
        msg = msg + "* * * * * * * * * */";
        throw new QueryDerivedReferrerUnmatchedColumnTypeException(msg);
    }

    public static class QueryDerivedReferrerUnmatchedColumnTypeException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public QueryDerivedReferrerUnmatchedColumnTypeException(String msg) {
            super(msg);
        }
    }

    public static class QDRFunction<CB extends LdConditionBean> { // Internal
        protected QDRSetupper<CB> _setupper;
        public QDRFunction(QDRSetupper<CB> setupper) {
            _setupper = setupper;
        }
        
        /**
         * Set up the sub query of referrer for the scalar 'count'.
         * <pre>
         * cb.query().scalarPurchaseList().count(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchaseId(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }).greaterEqual(123); // *Don't forget the parameter!
         * </pre> 
         * @param subQuery The sub query of referrer. (NotNull) 
         * @return The parameter for comparing with scalar. (NotNull)
         */
        public QDRParameter<CB, Integer> count(LdSubQuery<CB> subQuery) {
            return new QDRParameter<CB, Integer>("count", subQuery, _setupper);
        }
        
        /**
         * Set up the sub query of referrer for the scalar 'count(with distinct)'.
         * <pre>
         * cb.query().scalarPurchaseList().countDistinct(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }).greaterEqual(123); // *Don't forget the parameter!
         * </pre> 
         * @param subQuery The sub query of referrer. (NotNull) 
         * @return The parameter for comparing with scalar. (NotNull)
         */
        public QDRParameter<CB, Integer> countDistinct(LdSubQuery<CB> subQuery) {
            return new QDRParameter<CB, Integer>("count(distinct", subQuery, _setupper);
        }

        /**
         * Set up the sub query of referrer for the scalar 'max'.
         * <pre>
         * cb.query().scalarPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }).greaterEqual(123); // *Don't forget the parameter!
         * </pre> 
         * @param subQuery The sub query of referrer. (NotNull) 
         * @return The parameter for comparing with scalar. (NotNull)
         */
        public QDRParameter<CB, Object> max(LdSubQuery<CB> subQuery) {
            return new QDRParameter<CB, Object>("max", subQuery, _setupper);
        }
        
        /**
         * Set up the sub query of referrer for the scalar 'min'.
         * <pre>
         * cb.query().scalarPurchaseList().min(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }).greaterEqual(123); // *Don't forget the parameter!
         * </pre> 
         * @param subQuery The sub query of referrer. (NotNull) 
         * @return The parameter for comparing with scalar. (NotNull)
         */
        public QDRParameter<CB, Object> min(LdSubQuery<CB> subQuery) {
            return new QDRParameter<CB, Object>("min", subQuery, _setupper);
        }
        
        /**
         * Set up the sub query of referrer for the scalar 'sum'.
         * <pre>
         * cb.query().scalarPurchaseList().sum(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }).greaterEqual(123); // *Don't forget the parameter!
         * </pre> 
         * @param subQuery The sub query of referrer. (NotNull) 
         * @return The parameter for comparing with scalar. (NotNull)
         */
        public QDRParameter<CB, Number> sum(LdSubQuery<CB> subQuery) {
            return new QDRParameter<CB, Number>("sum", subQuery, _setupper);
        }
        
        /**
         * Set up the sub query of referrer for the scalar 'avg'.
         * <pre>
         * cb.query().scalarPurchaseList().avg(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }).greaterEqual(123); // *Don't forget the parameter!
         * </pre> 
         * @param subQuery The sub query of referrer. (NotNull) 
         * @return The parameter for comparing with scalar. (NotNull)
         */
        public QDRParameter<CB, Number> avg(LdSubQuery<CB> subQuery) {
            return new QDRParameter<CB, Number>("avg", subQuery, _setupper);
        }
    }

    protected static interface QDRSetupper<CB extends LdConditionBean> { // Internal
        public void setup(String function, LdSubQuery<CB> subQuery, String operand, Object value);
    }

    public static class QDRParameter<CB extends LdConditionBean, PARAMETER> { // Internal
        protected String _function;
        protected LdSubQuery<CB> _subQuery;
        protected QDRSetupper<CB> _setupper;
        public QDRParameter(String function, LdSubQuery<CB> subQuery, QDRSetupper<CB> setupper) {
            _function = function;
            _subQuery = subQuery;
            _setupper = setupper;
        }

        /**
         * Set up the operand 'equal' and the value of parameter. <br />
         * The type of the parameter should be same as the type of target column. 
         * <pre>
         * cb.query().scalarPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // If the type is Integer...
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }).equal(123); // This parameter should be Integer!
         * </pre> 
         * @param value The value of parameter. (NotNull) 
         */
        public void equal(PARAMETER value) {
            _setupper.setup(_function, _subQuery, "=", value);
        }
        
        /**
         * Set up the operand 'greaterThan' and the value of parameter. <br />
         * The type of the parameter should be same as the type of target column. 
         * <pre>
         * cb.query().scalarPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // If the type is Integer...
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }).greaterThan(123); // This parameter should be Integer!
         * </pre> 
         * @param value The value of parameter. (NotNull) 
         */
        public void greaterThan(PARAMETER value) {
            _setupper.setup(_function, _subQuery, ">", value);
        }
        
        /**
         * Set up the operand 'lessThan' and the value of parameter. <br />
         * The type of the parameter should be same as the type of target column. 
         * <pre>
         * cb.query().scalarPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // If the type is Integer...
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }).lessThan(123); // This parameter should be Integer!
         * </pre> 
         * @param value The value of parameter. (NotNull) 
         */
        public void lessThan(PARAMETER value) {
            _setupper.setup(_function, _subQuery, "<", value);
        }
        
        /**
         * Set up the operand 'greaterEqual' and the value of parameter. <br />
         * The type of the parameter should be same as the type of target column. 
         * <pre>
         * cb.query().scalarPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // If the type is Integer...
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }).greaterEqual(123); // This parameter should be Integer!
         * </pre> 
         * @param value The value of parameter. (NotNull) 
         */
        public void greaterEqual(PARAMETER value) {
            _setupper.setup(_function, _subQuery, ">=", value);
        }
        
        /**
         * Set up the operand 'lessEqual' and the value of parameter. <br />
         * The type of the parameter should be same as the type of target column. 
         * <pre>
         * cb.query().scalarPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // If the type is Integer...
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }).lessEqual(123); // This parameter should be Integer!
         * </pre> 
         * @param value The value of parameter. (NotNull) 
         */
        public void lessEqual(PARAMETER value) {
            _setupper.setup(_function, _subQuery, "<=", value);
        }
    }

    // [DBFlute-0.8.8]
    // -----------------------------------------------------
    //                                        ScalarSubQuery
    //                                        --------------
    protected void registerScalarSubQuery(String function, LdConditionQuery subQuery
                                        , String propertyName, String operand) {
        assertObjectNotNull("ScalarSubQuery(" + propertyName + ")", subQuery);
        
        // Get the specified column before it disappears at sub-query making.
        String deriveRealColumnName;
        {
            String deriveColumnName = subQuery.getSqlClause().getSpecifiedColumnNameAsOne();
            if (deriveColumnName == null || deriveColumnName.trim().length() == 0) {
                throwScalarSubQueryInvalidColumnSpecificationException(function);
            }
            deriveRealColumnName = getScalarSubQueryRealColumnName(deriveColumnName);
        }

        xincrementLocalSubQueryLevelIfNeeds(subQuery);
        String subQueryClause = getScalarSubQuerySql(function, subQuery, propertyName);
        String ln = getLineSeparator();
        int subQueryLevel = subQuery.getSubQueryLevel();
        String subQueryIdentity = propertyName + "[" + subQueryLevel + "]";
        String beginMark = getSqlClause().resolveSubQueryBeginMark(subQueryIdentity) + ln;
        String endMark = getSqlClause().resolveSubQueryEndMark(subQueryIdentity);
        String endIndent = "       ";
        String clause = deriveRealColumnName + " " + operand + " ("
                      + beginMark + subQueryClause + ln + endIndent
                      + ") " + endMark;
        registerWhereClause(clause);
    }

    protected String getScalarSubQueryRealColumnName(String columnName) {
        return getRealColumnName(columnName);
    }

    protected String getScalarSubQuerySql(String function, LdConditionQuery subQuery
                                        , String propertyName) {
        int subQueryLevel = subQuery.getSubQueryLevel();
        String tableAliasName = "dfsublocal_" + subQueryLevel;
        String deriveColumnName = subQuery.getSqlClause().getSpecifiedColumnNameAsOne();
        if (deriveColumnName == null || deriveColumnName.trim().length() == 0) {
            throwScalarSubQueryInvalidColumnSpecificationException(function);
        }
        assertScalarSubQueryColumnType(function, subQuery, deriveColumnName);
        subQuery.getSqlClause().clearSpecifiedSelectColumn(); // specified columns disappear at this timing
        LdDBMeta dbmeta = findDBMeta(subQuery.getTableDbName());
        if (!dbmeta.hasPrimaryKey() || dbmeta.hasTwoOrMorePrimaryKeys()) {
            String msg = "The scalar-sub-query is unsupported when no primary key or two-or-more primary keys:";
            msg = msg + " table=" + subQuery.getTableDbName();
            throw new UnsupportedOperationException(msg);
        }
        String primaryKeyName = dbmeta.getPrimaryUniqueInfo().getFirstColumn().getColumnDbName();
        if (subQuery.getSqlClause().hasUnionQuery()) {
            String ln = getLineSeparator();
            String subQueryIdentity = propertyName + "[" + subQueryLevel + ":subquerymain]";
            String beginMark = getSqlClause().resolveSubQueryBeginMark(subQueryIdentity) + ln;
            String endMark = getSqlClause().resolveSubQueryEndMark(subQueryIdentity);
            String selectClause = "select " + tableAliasName + "." + primaryKeyName
                                     + ", " + tableAliasName + "." + deriveColumnName;
            String fromWhereClause = buildPlainSubQueryFromWhereClause(subQuery, primaryKeyName, propertyName
                                                                     , selectClause, tableAliasName);
            String mainSql = selectClause + " " + fromWhereClause;
            return "select " + function + "(dfsubquerymain." + deriveColumnName + ")" + ln
                 + "  from (" + beginMark
                 + mainSql + ln
                 + "       ) dfsubquerymain" + endMark;
        } else {
            String selectClause = "select " + function + "(" + tableAliasName + "." + deriveColumnName + ")";
            String fromWhereClause = buildPlainSubQueryFromWhereClause(subQuery, primaryKeyName, propertyName
                                                                     , selectClause, tableAliasName);
            return selectClause + " " + fromWhereClause;
        }
    }

    protected void throwScalarSubQueryInvalidColumnSpecificationException(String function) {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The specified the column for derived-referrer was Invalid!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + " You should call specify().column[TargetColumn]() only once." + getLineSeparator();
        msg = msg + "  For example:" + getLineSeparator();
        msg = msg + "    " + getLineSeparator();
        msg = msg + "    [Wrong]" + getLineSeparator();
        msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
        msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
        msg = msg + "    cb.query().scalar_Equal()." + function + "(new SubQuery<MemberCB>() {" + getLineSeparator();
        msg = msg + "        public void query(MemberCB subCB) {" + getLineSeparator();
        msg = msg + "            // *No! It's empty!" + getLineSeparator();
        msg = msg + "        }" + getLineSeparator();
        msg = msg + "    });" + getLineSeparator();
        msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
        msg = msg + "    " + getLineSeparator();
        msg = msg + "    [Wrong]" + getLineSeparator();
        msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
        msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
        msg = msg + "    cb.query().scalar_Equal()." + function + "(new SubQuery<MemberCB>() {" + getLineSeparator();
        msg = msg + "        public void query(MemberCB subCB) {" + getLineSeparator();
        msg = msg + "            subCB.specify().columnMemberBirthday();" + getLineSeparator();
        msg = msg + "            subCB.specify().columnMemberName(); // *No! It's duplicated!" + getLineSeparator();
        msg = msg + "        }" + getLineSeparator();
        msg = msg + "    });" + getLineSeparator();
        msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
        msg = msg + "    " + getLineSeparator();
        msg = msg + "    [Good!]" + getLineSeparator();
        msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
        msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
        msg = msg + "    cb.query().scalar_Equal()." + function + "(new SubQuery<MemberCB>() {" + getLineSeparator();
        msg = msg + "        public void query(MemberCB subCB) {" + getLineSeparator();
        msg = msg + "            subCB.specify().columnPurchaseDatetime(); // *Point!" + getLineSeparator();
        msg = msg + "        }" + getLineSeparator();
        msg = msg + "    });" + getLineSeparator();
        msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
        msg = msg + "* * * * * * * * * */";
        throw new ScalarSubQueryInvalidColumnSpecificationException(msg);
    }

    public static class ScalarSubQueryInvalidColumnSpecificationException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public ScalarSubQueryInvalidColumnSpecificationException(String msg) {
            super(msg);
        }
    }

    protected void assertScalarSubQueryColumnType(String function, LdConditionQuery subQuery, String deriveColumnName) {
        final LdDBMeta dbmeta = findDBMeta(subQuery.getTableDbName());
        final Class<?> deriveColumnType = dbmeta.findColumnInfo(deriveColumnName).getPropertyType();
        if ("sum".equalsIgnoreCase(function) || "avg".equalsIgnoreCase(function)) {
            if (!Number.class.isAssignableFrom(deriveColumnType)) {
                throwScalarSubQueryUnmatchedColumnTypeException(function, deriveColumnName, deriveColumnType);
            }
        }
    }

    protected void throwScalarSubQueryUnmatchedColumnTypeException(String function, String deriveColumnName, Class<?> deriveColumnType) {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The type of the specified the column unmatched with the function!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "You should confirm the list as follow:" + getLineSeparator();
        msg = msg + "    max()   : String, Number, Date" + getLineSeparator();
        msg = msg + "    min()   : String, Number, Date" + getLineSeparator();
        msg = msg + "    sum()   : Number" + getLineSeparator();
        msg = msg + "    avg()   : Number" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Function]" + getLineSeparator() + function + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Derive Column]" + getLineSeparator() + deriveColumnName + "(" + deriveColumnType.getName() + ")" + getLineSeparator();
        msg = msg + "* * * * * * * * * */";
        throw new ScalarSubQueryUnmatchedColumnTypeException(msg);
    }

    public static class ScalarSubQueryUnmatchedColumnTypeException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public ScalarSubQueryUnmatchedColumnTypeException(String msg) {
            super(msg);
        }
    }

    public static class SSQFunction<CB extends LdConditionBean> { // Internal
        protected SSQSetupper<CB> _setupper;
        public SSQFunction(SSQSetupper<CB> setupper) {
            _setupper = setupper;
        }

        /**
         * Set up the sub query of myself for the scalar 'max'.
         * <pre>
         * cb.query().scalar_Equal().max(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * });
         * </pre> 
         * @param subQuery The sub query of myself. (NotNull) 
         */
        public void max(LdSubQuery<CB> subQuery) {
            _setupper.setup("max", subQuery);
        }

        /**
         * Set up the sub query of myself for the scalar 'min'.
         * <pre>
         * cb.query().scalar_Equal().min(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * });
         * </pre> 
         * @param subQuery The sub query of myself. (NotNull) 
         */
        public void min(LdSubQuery<CB> subQuery) {
            _setupper.setup("min", subQuery);
        }

        /**
         * Set up the sub query of myself for the scalar 'sum'.
         * <pre>
         * cb.query().scalar_Equal().sum(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * });
         * </pre> 
         * @param subQuery The sub query of myself. (NotNull) 
         */
        public void sum(LdSubQuery<CB> subQuery) {
            _setupper.setup("sum", subQuery);
        }

        /**
         * Set up the sub query of myself for the scalar 'avg'.
         * <pre>
         * cb.query().scalar_Equal().avg(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * });
         * </pre> 
         * @param subQuery The sub query of myself. (NotNull) 
         */
        public void avg(LdSubQuery<CB> subQuery) {
            _setupper.setup("avg", subQuery);
        }
    }

    protected static interface SSQSetupper<CB extends LdConditionBean> { // Internal
        public void setup(String function, LdSubQuery<CB> subQuery);
    }

    // -----------------------------------------------------
    //                                       SubQuery Common
    //                                       ---------------
    protected String buildPlainSubQueryFromWhereClause(LdConditionQuery subQuery
                                                     , String relatedColumnName
                                                     , String propertyName
                                                     , String selectClause
                                                     , String tableAliasName) {
        String fromWhereClause = subQuery.getSqlClause().getClauseFromWhereWithUnionTemplate();

        // Replace the alias names for local table with alias name of sub-query unique.
        // However when it's inScope this replacement is unnecessary so comment out here. 
        // (Override base alias name at sub-query on SQL)
        // So if the argument 'tableAliasName' is not null, replace it. 
        if (tableAliasName != null) {
            fromWhereClause = replaceString(fromWhereClause, "dflocal", tableAliasName);
        }

        // Resolve the location path for the condition-query of sub-query. 
        fromWhereClause = replaceString(fromWhereClause, ".conditionQuery.", "." + getLocationBase(propertyName) + ".");

        // Replace template marks. These are very important!
        fromWhereClause = replaceString(fromWhereClause, getSqlClause().getUnionSelectClauseMark(), selectClause);
        fromWhereClause = replaceString(fromWhereClause, getSqlClause().getUnionWhereClauseMark(), "");
        fromWhereClause = replaceString(fromWhereClause, getSqlClause().getUnionWhereFirstConditionMark(), "");
        return fromWhereClause;
    }

    protected String buildCorrelationSubQueryFromWhereClause(LdConditionQuery subQuery
                                                           , String relatedColumnName
                                                           , String propertyName
                                                           , String selectClause
                                                           , String tableAliasName
                                                           , String realColumnName) {
        String fromWhereClause = subQuery.getSqlClause().getClauseFromWhereWithWhereUnionTemplate();

        // Replace the alias names for local table with alias name of sub-query unique. 
        fromWhereClause = replaceString(fromWhereClause, "dflocal", tableAliasName);

        // Resolve the location path for the condition-query of sub-query. 
        fromWhereClause = replaceString(fromWhereClause, ".conditionQuery.", "." + getLocationBase(propertyName) + ".");
        
        String joinCondition = tableAliasName + "." + relatedColumnName + " = " + realColumnName;
        String firstConditionAfter = getLineSeparator() + "   and ";

        // Replace template marks. These are very important!
        fromWhereClause = replaceString(fromWhereClause, getSqlClause().getWhereClauseMark(), "where " + joinCondition);
        fromWhereClause = replaceString(fromWhereClause, getSqlClause().getWhereFirstConditionMark(), joinCondition + firstConditionAfter);
        fromWhereClause = replaceString(fromWhereClause, getSqlClause().getUnionSelectClauseMark(), selectClause);
        fromWhereClause = replaceString(fromWhereClause, getSqlClause().getUnionWhereClauseMark(), "where " + joinCondition);
        fromWhereClause = replaceString(fromWhereClause, getSqlClause().getUnionWhereFirstConditionMark(), joinCondition + firstConditionAfter);
        return fromWhereClause;
    }

    protected void xincrementLocalSubQueryLevelIfNeeds(LdConditionQuery subQuery) { // Very Internal
        int subQueryLevel = subQuery.getSubQueryLevel();
        if (_subQueryLevel <= subQueryLevel) {
            _subQueryLevel = subQueryLevel + 1;
        }
    }

    protected String xbuildFunctionConnector(String function) {
        if (function != null && function.endsWith("(distinct")) { // For example 'count(distinct'
            return " ";
        } else {
            return "(";
        }
    }

    protected String xconvertFunctionToMethod(String function) {
        if (function != null && function.contains("(")) { // For example 'count(distinct'
            int index = function.indexOf("(");
            String front = function.substring(0, index);
            if (function.length() > front.length() + "(".length()) {
                String rear = function.substring(index + "(".length());
                function = front + initCap(rear);
            } else {
                function = front;
            }
        }
        return function;
    }

    // -----------------------------------------------------
    //                                          Where Clause
    //                                          ------------
    protected void setupConditionValueAndRegisterWhereClause(LdConditionKey key, Object value, LdConditionValue cvalue
                                                             , String colName, String capPropName, String uncapPropName) {
        key.setupConditionValue(cvalue, value, getLocation(uncapPropName, key));// If Java, it is necessary to use uncapPropName!
        getSqlClause().registerWhereClause(getRealColumnName(colName), key, cvalue);
    }

    protected void setupConditionValueAndRegisterWhereClause(LdConditionKey key, Object value, LdConditionValue cvalue
                                                             , String colName, String capPropName, String uncapPropName, LdConditionOption option) {
        key.setupConditionValue(cvalue, value, getLocation(uncapPropName, key), option);// If Java, it is necessary to use uncapPropName!
        getSqlClause().registerWhereClause(getRealColumnName(colName), key, cvalue, option);
    }

    protected void registerWhereClause(String whereClause) {
        getSqlClause().registerWhereClause(whereClause);
    }

    protected void registerInlineWhereClause(String whereClause) {
        if (isBaseQuery(this)) {
            getSqlClause().registerBaseTableInlineWhereClause(whereClause);
        } else {
            getSqlClause().registerOuterJoinInlineWhereClause(getRealAliasName(), whereClause, _onClauseInline);
        }
    }

    // -----------------------------------------------------
    //                                           Union Query
    //                                           -----------
    public void registerUnionQuery(LdConditionQuery unionQuery, boolean unionAll, String unionQueryPropertyName) {
        final String unionQueryClause = getUnionQuerySql(unionQuery, unionQueryPropertyName);
        
        // At the future, building SQL will be moved to sqlClause.
        getSqlClause().registerUnionQuery(unionQueryClause, unionAll);
    }

    protected String getUnionQuerySql(LdConditionQuery unionQuery, String unionQueryPropertyName) {
        final String fromClause = unionQuery.getSqlClause().getFromClause();
        final String whereClause = unionQuery.getSqlClause().getWhereClause();
        final String unionQueryClause;
        if (whereClause.trim().length() <= 0) {
            unionQueryClause = fromClause + " " + getSqlClause().getUnionWhereClauseMark();
        } else {
            final int whereIndex = whereClause.indexOf("where ");
            if (whereIndex < 0) {
                String msg = "The whereClause should have 'where' string: " + whereClause;
                throw new IllegalStateException(msg);
            }
            final int clauseIndex = whereIndex + "where ".length();
            final String mark = getSqlClause().getUnionWhereFirstConditionMark();
            unionQueryClause = fromClause + " " + whereClause.substring(0, clauseIndex) + mark + whereClause.substring(clauseIndex);
        }
        final String oldStr = ".conditionQuery.";
        final String newStr = ".conditionQuery." + unionQueryPropertyName + ".";
        return replaceString(unionQueryClause, oldStr, newStr);// Very Important!
    }

    // -----------------------------------------------------
    //                                               OrderBy
    //                                               -------
    public void withNullsFirst() {// is User Public!
        getSqlClause().addNullsFirstToPreviousOrderBy();
    }
    
    public void withNullsLast() {// is User Public!
        getSqlClause().addNullsLastToPreviousOrderBy();
    }

    protected void registerSpecifiedDerivedOrderBy_Asc(String aliasName) {
        if (!getSqlClause().hasSpecifiedDeriveSubQuery(aliasName)) {
            throwSpecifiedDerivedOrderByAliasNameNotFoundException(aliasName);
        }
        getSqlClause().registerOrderBy(aliasName, null, true);
    }

    protected void registerSpecifiedDerivedOrderBy_Desc(String aliasName) {
        if (!getSqlClause().hasSpecifiedDeriveSubQuery(aliasName)) {
            throwSpecifiedDerivedOrderByAliasNameNotFoundException(aliasName);
        }
        getSqlClause().registerOrderBy(aliasName, null, false);
    }

    protected void throwSpecifiedDerivedOrderByAliasNameNotFoundException(String aliasName) {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The aliasName was Not Found in specified alias names." + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "You should specified an alias name that is the same as one in specify-derived-referrer." + getLineSeparator();
        msg = msg + "  For example:" + getLineSeparator();
        msg = msg + "    " + getLineSeparator();
        msg = msg + "    [Wrong]" + getLineSeparator();
        msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
        msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
        msg = msg + "    cb.specify().derivePurchaseList().max(new SubQuery<PurchaseCB>() {" + getLineSeparator();
        msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
        msg = msg + "            subCB.specify().specifyProduct().columnProductName(); // *No!" + getLineSeparator();
        msg = msg + "        }" + getLineSeparator();
        msg = msg + "    }, \"LATEST_PURCHASE_DATETIME\");" + getLineSeparator();
        msg = msg + "    cb.query().addSpecifiedDerivedOrderBy_Desc(\"WRONG_NAME_DATETIME\");" + getLineSeparator();
        msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
        msg = msg + "    " + getLineSeparator();
        msg = msg + "    [Good!]" + getLineSeparator();
        msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
        msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
        msg = msg + "    cb.specify().derivePurchaseList().max(new SubQuery<PurchaseCB>() {" + getLineSeparator();
        msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
        msg = msg + "            subCB.specify().columnPurchaseDatetime();// *Point!" + getLineSeparator();
        msg = msg + "        }" + getLineSeparator();
        msg = msg + "    }, \"LATEST_PURCHASE_DATETIME\");" + getLineSeparator();
        msg = msg + "    cb.query().addSpecifiedDerivedOrderBy_Desc(\"LATEST_PURCHASE_DATETIME\");" + getLineSeparator();
        msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Not Found Alias Name]" + getLineSeparator() + aliasName + getLineSeparator();
        msg = msg + "* * * * * * * * * */";
        throw new SpecifiedDerivedOrderByAliasNameNotFoundException(msg);
    }

    public static class SpecifiedDerivedOrderByAliasNameNotFoundException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public SpecifiedDerivedOrderByAliasNameNotFoundException(String msg) {
            super(msg);
        }
    }

    protected void registerOrderBy(String columnName, boolean ascOrDesc) {
        getSqlClause().registerOrderBy(getRealColumnName(columnName), null, ascOrDesc);
    }

    protected void regOBA(String columnName) {
        registerOrderBy(columnName, true);
    }

    protected void regOBD(String columnName) {
        registerOrderBy(columnName, false);
    }
    
    // ===================================================================================
    //                                                                       Name Resolver
    //                                                                       =============
    /**
     * Resolve join alias name.
     * @param relationPath Relation path. (NotNull)
     * @param nestLevel Nest level.
     * @return Resolved join alias name. (NotNull)
     */
    protected String resolveJoinAliasName(String relationPath, int nestLevel) {
        return getSqlClause().resolveJoinAliasName(relationPath, nestLevel);
    }

    protected String resolveNestLevelExpression(String name) {
        return getSqlClause().resolveNestLevelExpression(name, getNestLevel());
    }

    protected String resolveNextRelationPath(String tableName, String relationPropertyName) {
        final int relationNo = getSqlClause().resolveRelationNo(tableName, relationPropertyName);
        String nextRelationPath = "_" + relationNo;
        if (_relationPath != null) {
            nextRelationPath = _relationPath + nextRelationPath;
        }
        return nextRelationPath;
    }
    
    // ===================================================================================
    //                                                                     Fixed Condition
    //                                                                     ===============
    protected String ppFxCd(String fixedCondition, String localAliasName, String foreignAliasName) { // prepareFixedCondition
        fixedCondition = replaceString(fixedCondition, "$$alias$$", foreignAliasName);
        fixedCondition = replaceString(fixedCondition, "$$foreignAlias$$", foreignAliasName);
        fixedCondition = replaceString(fixedCondition, "$$localAlias$$", localAliasName);
        fixedCondition = replaceString(fixedCondition, "$$locationBase$$.", "dto." + getLocationBase());
        return fixedCondition;
    }
    
    // ===================================================================================
    //                                                                 Reflection Invoking
    //                                                                 ===================
    /**
     * {@inheritDoc}
     * @param columnFlexibleName The flexible name of the column. (NotNull and NotEmpty)
     * @return The conditionValue. (NotNull)
     */
    public LdConditionValue invokeValue(String columnFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("columnFlexibleName", columnFlexibleName);
        final LdDBMeta dbmeta = findDBMeta(getTableDbName());
        final String columnCapPropName = initCap(dbmeta.findPropertyName(columnFlexibleName));
        final String methodName = "get" + columnCapPropName;
        final Method method = helpGettingCQMethod(this, methodName, new Class<?>[]{}, columnFlexibleName);
        return (LdConditionValue)helpInvokingCQMethod(this, method, new Object[]{});
    }

    /**
     * {@inheritDoc}
     * @param columnFlexibleName The flexible name of the column allowed to contain relations. (NotNull and NotEmpty)
     * @param conditionKeyName The name of the conditionKey. (NotNull)
     * @param value The value of the condition. (NotNull)
     */
    public void invokeQuery(String columnFlexibleName, String conditionKeyName, Object value) {
        assertStringNotNullAndNotTrimmedEmpty("columnFlexibleName", columnFlexibleName);
        assertStringNotNullAndNotTrimmedEmpty("conditionKeyName", conditionKeyName);
        if (value == null) {
            return;
        }
        final PropertyNameCQContainer container = helpExtractingPropertyNameCQContainer(columnFlexibleName);
        final String propertyName = container.getPropertyName();
        final LdConditionQuery cq = container.getConditionQuery();
        final LdDBMeta dbmeta = findDBMeta(cq.getTableDbName());
        final String columnCapPropName = initCap(dbmeta.findPropertyName(propertyName));
        final String methodName = "set" + columnCapPropName + "_" + initCap(conditionKeyName);
        final Method method = helpGettingCQMethod(cq, methodName, new Class<?>[]{value.getClass()}, propertyName);
        helpInvokingCQMethod(cq, method, new Object[]{value});
    }

    /**
     * {@inheritDoc}
     * @param columnFlexibleName The flexible name of a column allowed to contain relations. (NotNull and NotEmpty)
     * @param isAsc Is it ascend?
     */
    public void invokeOrderBy(String columnFlexibleName, boolean isAsc) {
        assertStringNotNullAndNotTrimmedEmpty("columnFlexibleName", columnFlexibleName);
        final PropertyNameCQContainer container = helpExtractingPropertyNameCQContainer(columnFlexibleName);
        final String propertyName = container.getPropertyName();
        final LdConditionQuery cq = container.getConditionQuery();
        final String ascDesc = isAsc ? "Asc" : "Desc";
        final LdDBMeta dbmeta = findDBMeta(cq.getTableDbName());
        final String columnCapPropName = initCap(dbmeta.findPropertyName(propertyName));
        final String methodName = "addOrderBy_" + columnCapPropName + "_" + ascDesc;
        final Method method = helpGettingCQMethod(cq, methodName, new Class<?>[]{}, propertyName);
        helpInvokingCQMethod(cq, method, new Object[]{});
    }

    /**
     * {@inheritDoc}
     * @param foreignPropertyName The property name of foreign. (NotNull and NotEmpty)
     * @return The conditionQuery of foreign as interface. (NotNull)
     */
    public LdConditionQuery invokeForeignCQ(String foreignPropertyName) {
        assertStringNotNullAndNotTrimmedEmpty("foreignPropertyName", foreignPropertyName);
        final String methodName = "query" + initCap(foreignPropertyName);
        final Method method = helpGettingCQMethod(this, methodName, new Class<?>[]{}, foreignPropertyName);
        return (LdConditionQuery)helpInvokingCQMethod(this, method, new Object[]{});
    }

    private PropertyNameCQContainer helpExtractingPropertyNameCQContainer(String name) {
        final String[] strings = name.split("\\.");
        final int length = strings.length;
        String propertyName = null;
        LdConditionQuery cq = this;
        int index = 0;
        for (String element : strings) {
            if (length == (index+1)) {// at last loop!
                propertyName = element;
                break;
            }
            cq = cq.invokeForeignCQ(element);
            ++index;
        }
        return new PropertyNameCQContainer(propertyName, cq);
    }

    private static class PropertyNameCQContainer {
        protected String _propertyName;
        protected LdConditionQuery _cq;
        public PropertyNameCQContainer(String propertyName, LdConditionQuery cq) {
            this._propertyName = propertyName;
            this._cq = cq;
        }
        public String getPropertyName() {
            return _propertyName;
        }
        public LdConditionQuery getConditionQuery() {
            return _cq;
        }
    }

    private Method helpGettingCQMethod(LdConditionQuery cq, String methodName, Class<?>[] argTypes, String property) {
        try {
            return cq.getClass().getMethod(methodName, argTypes);
        } catch (NoSuchMethodException e) {
            String msg = "The method is not existing:";
            msg = msg + " methodName=" + methodName;
            msg = msg + " argTypes=" + convertObjectArrayToStringView(argTypes);
            msg = msg + " tableName=" + cq.getTableDbName();
            msg = msg + " property=" + property;
            throw new IllegalStateException(msg, e);
        }
    }

    private Object helpInvokingCQMethod(LdConditionQuery cq, Method method, Object[] args) {
        try {
            return method.invoke(cq, args);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        } catch (InvocationTargetException e) {
            throw new IllegalStateException(e.getCause());
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    /**
     * @param value Query-value-string. (Nullable)
     * @return Filtered value. (Nullable)
     */
    protected String fRES(String value) {
        return filterRemoveEmptyString(value);
    }

    /**
     * @param value Query-value-string. (Nullable)
     * @return Filtered value. (Nullable)
     */
    private String filterRemoveEmptyString(String value) {
        return ((value != null && !"".equals(value)) ? value : null);
    }
    
    /**
     * @param col Target collection. (Nullable)
     * @param <PROPERTY_TYPE> The type of property.
     * @return List. (Nullable: If the argument is null, returns null.)
     */
    protected <PROPERTY_TYPE> List<PROPERTY_TYPE> cTL(Collection<PROPERTY_TYPE> col) {
        return convertToList(col);
    }
    
    /**
     * @param col Target collection. (Nullable)
     * @param <PROPERTY_TYPE> The type of property.
     * @return List. (Nullable: If the argument is null, returns null.)
     */
    private <PROPERTY_TYPE> List<PROPERTY_TYPE> convertToList(Collection<PROPERTY_TYPE> col) {
        if (col == null) {
            return null;
        }
        if (col instanceof List) {
            return filterRemoveNullOrEmptyValueFromList((List<PROPERTY_TYPE>)col);
        }
        return filterRemoveNullOrEmptyValueFromList(new ArrayList<PROPERTY_TYPE>(col));
    }

    private <PROPERTY_TYPE> List<PROPERTY_TYPE> filterRemoveNullOrEmptyValueFromList(List<PROPERTY_TYPE> ls) {
        if (ls == null) {
            return null;
        }
        List<PROPERTY_TYPE> newList = new ArrayList<PROPERTY_TYPE>();
        for (Iterator<PROPERTY_TYPE> ite = ls.iterator(); ite.hasNext(); ) {
            final PROPERTY_TYPE element = ite.next();
            if (element == null) {
                continue;
            }
            if (element instanceof String) {
                if (((String)element).length() == 0) {
                    continue;
                }
            }
            newList.add(element);
        }
        return newList;
    }
    
    public void doNss(NssCall callback) { // Very Internal
        String foreignPropertyName = callback.qf().getForeignPropertyName();
        String foreignTableAliasName = callback.qf().getRealAliasName();
        getSqlClause().registerSelectedSelectColumn(foreignTableAliasName, getTableDbName(), foreignPropertyName, getRelationPath());
        getSqlClause().registerSelectedForeignInfo(callback.qf().getRelationPath(), foreignPropertyName);
    }
    
    public static interface NssCall { // Very Internal
        public LdConditionQuery qf();
    }

    protected void registerOuterJoin(LdConditionQuery cq, Map<String, String> joinOnMap) {
        getSqlClause().registerOuterJoin(cq.getTableSqlName(), cq.getRealAliasName(), joinOnMap);
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected final String replaceString(String text, String fromText, String toText) {
        return LdSimpleStringUtil.replace(text, fromText, toText);
    }

    protected String initCap(String str) {
        return LdSimpleStringUtil.initCap(str);
    }

    protected String getLineSeparator() {
        return LdSimpleSystemUtil.getLineSeparator();
    }

    protected String convertObjectArrayToStringView(Object[] objArray) {
        return LdTraceViewUtil.convertObjectArrayToStringView(objArray);
    }

    // -----------------------------------------------------
    //                                  Collection Generator
    //                                  --------------------
    protected <KEY, VALUE> LinkedHashMap<KEY, VALUE> newLinkedHashMap() {
        return new LinkedHashMap<KEY, VALUE>();
    }

    // -----------------------------------------------------
    //                                         Assert Object
    //                                         -------------
    /**
     * Assert that the object is not null.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     * @exception IllegalArgumentException
     */
    protected void assertObjectNotNull(String variableName, Object value) {
        if (variableName == null) {
            String msg = "The value should not be null: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            String msg = "The value should not be null: variableName=" + variableName;
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * Assert that the column-name is not null and is not empty and does not contain comma.
     * @param columnName Column-name. (NotNull)
     * @exception IllegalArgumentException
     */
    protected void assertColumnName(String columnName) {
        if (columnName == null) {
            String msg = "The columnName should not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (columnName.trim().length() == 0) {
            String msg = "The columnName should not be empty-string.";
            throw new IllegalArgumentException(msg);
        }
        if (columnName.indexOf(",") >= 0) {
            String msg = "The columnName should not contain comma ',': " + columnName;
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * Assert that the alias-name is not null and is not empty and does not contain comma.
     * @param aliasName Alias-name. (NotNull)
     * @exception IllegalArgumentException
     */
    protected void assertAliasName(String aliasName) {
        if (aliasName == null) {
            String msg = "The aliasName should not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (aliasName.trim().length() == 0) {
            String msg = "The aliasName should not be empty-string.";
            throw new IllegalArgumentException(msg);
        }
        if (aliasName.indexOf(",") >= 0) {
            String msg = "The aliasName should not contain comma ',': " + aliasName;
            throw new IllegalArgumentException(msg);
        }
    }

    // -----------------------------------------------------
    //                                         Assert String
    //                                         -------------
    /**
     * Assert that the entity is not null and not trimmed empty.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     */
    protected void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        assertObjectNotNull("variableName", variableName);
        assertObjectNotNull("value", value);
        if (value.trim().length() ==0) {
            String msg = "The value should not be empty: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
    }
    
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return getClass().getSimpleName() + ":{aliasName=" + _aliasName + ", nestLevel=" + _nestLevel
             + ", subQueryLevel=" + _subQueryLevel + ", foreignPropertyName=" + _foreignPropertyName
             + ", relationPath=" + _relationPath + ", onClauseInline=" + _onClauseInline + "}";
    }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.cq.bs;

import java.util.Map;

import dbflute.ldb.allcommon.cbean.*;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.cbean.cq.ciq.*;
import dbflute.ldb.cbean.*;
import dbflute.ldb.cbean.cq.*;

/**
 * The base condition-query of COLLECTION_STATUS_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsCollectionStatusLookupCQ extends LdAbstractBsCollectionStatusLookupCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdCollectionStatusLookupCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsCollectionStatusLookupCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from COLLECTION_STATUS_LOOKUP) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdCollectionStatusLookupCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdCollectionStatusLookupCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join COLLECTION_STATUS_LOOKUP on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdCollectionStatusLookupCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdCollectionStatusLookupCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _collectionStatusCode;
    public LdConditionValue getCollectionStatusCode() {
        if (_collectionStatusCode == null) { _collectionStatusCode = new LdConditionValue(); }
        return _collectionStatusCode;
    }
    protected LdConditionValue getCValueCollectionStatusCode() { return getCollectionStatusCode(); }

    protected Map<String, LdCollectionStatusCQ> _collectionStatusCode_InScopeSubQuery_CollectionStatusListMap;
    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_InScopeSubQuery_CollectionStatusList() { return _collectionStatusCode_InScopeSubQuery_CollectionStatusListMap; }
    public String keepCollectionStatusCode_InScopeSubQuery_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        if (_collectionStatusCode_InScopeSubQuery_CollectionStatusListMap == null) { _collectionStatusCode_InScopeSubQuery_CollectionStatusListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionStatusCode_InScopeSubQuery_CollectionStatusListMap.size() + 1);
        _collectionStatusCode_InScopeSubQuery_CollectionStatusListMap.put(key, subQuery); return "collectionStatusCode_InScopeSubQuery_CollectionStatusList." + key;
    }

    protected Map<String, LdBookCQ> _collectionStatusCode_InScopeSubQuery_BookAsNonExistListMap;
    public Map<String, LdBookCQ> getCollectionStatusCode_InScopeSubQuery_BookAsNonExistList() { return _collectionStatusCode_InScopeSubQuery_BookAsNonExistListMap; }
    public String keepCollectionStatusCode_InScopeSubQuery_BookAsNonExistList(LdBookCQ subQuery) {
        if (_collectionStatusCode_InScopeSubQuery_BookAsNonExistListMap == null) { _collectionStatusCode_InScopeSubQuery_BookAsNonExistListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionStatusCode_InScopeSubQuery_BookAsNonExistListMap.size() + 1);
        _collectionStatusCode_InScopeSubQuery_BookAsNonExistListMap.put(key, subQuery); return "collectionStatusCode_InScopeSubQuery_BookAsNonExistList." + key;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionStatusCode_NotInScopeSubQuery_CollectionStatusListMap;
    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_NotInScopeSubQuery_CollectionStatusList() { return _collectionStatusCode_NotInScopeSubQuery_CollectionStatusListMap; }
    public String keepCollectionStatusCode_NotInScopeSubQuery_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        if (_collectionStatusCode_NotInScopeSubQuery_CollectionStatusListMap == null) { _collectionStatusCode_NotInScopeSubQuery_CollectionStatusListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionStatusCode_NotInScopeSubQuery_CollectionStatusListMap.size() + 1);
        _collectionStatusCode_NotInScopeSubQuery_CollectionStatusListMap.put(key, subQuery); return "collectionStatusCode_NotInScopeSubQuery_CollectionStatusList." + key;
    }

    protected Map<String, LdBookCQ> _collectionStatusCode_NotInScopeSubQuery_BookAsNonExistListMap;
    public Map<String, LdBookCQ> getCollectionStatusCode_NotInScopeSubQuery_BookAsNonExistList() { return _collectionStatusCode_NotInScopeSubQuery_BookAsNonExistListMap; }
    public String keepCollectionStatusCode_NotInScopeSubQuery_BookAsNonExistList(LdBookCQ subQuery) {
        if (_collectionStatusCode_NotInScopeSubQuery_BookAsNonExistListMap == null) { _collectionStatusCode_NotInScopeSubQuery_BookAsNonExistListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionStatusCode_NotInScopeSubQuery_BookAsNonExistListMap.size() + 1);
        _collectionStatusCode_NotInScopeSubQuery_BookAsNonExistListMap.put(key, subQuery); return "collectionStatusCode_NotInScopeSubQuery_BookAsNonExistList." + key;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionStatusCode_ExistsSubQuery_CollectionStatusListMap;
    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_ExistsSubQuery_CollectionStatusList() { return _collectionStatusCode_ExistsSubQuery_CollectionStatusListMap; }
    public String keepCollectionStatusCode_ExistsSubQuery_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        if (_collectionStatusCode_ExistsSubQuery_CollectionStatusListMap == null) { _collectionStatusCode_ExistsSubQuery_CollectionStatusListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionStatusCode_ExistsSubQuery_CollectionStatusListMap.size() + 1);
        _collectionStatusCode_ExistsSubQuery_CollectionStatusListMap.put(key, subQuery); return "collectionStatusCode_ExistsSubQuery_CollectionStatusList." + key;
    }

    protected Map<String, LdBookCQ> _collectionStatusCode_ExistsSubQuery_BookAsNonExistListMap;
    public Map<String, LdBookCQ> getCollectionStatusCode_ExistsSubQuery_BookAsNonExistList() { return _collectionStatusCode_ExistsSubQuery_BookAsNonExistListMap; }
    public String keepCollectionStatusCode_ExistsSubQuery_BookAsNonExistList(LdBookCQ subQuery) {
        if (_collectionStatusCode_ExistsSubQuery_BookAsNonExistListMap == null) { _collectionStatusCode_ExistsSubQuery_BookAsNonExistListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionStatusCode_ExistsSubQuery_BookAsNonExistListMap.size() + 1);
        _collectionStatusCode_ExistsSubQuery_BookAsNonExistListMap.put(key, subQuery); return "collectionStatusCode_ExistsSubQuery_BookAsNonExistList." + key;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionStatusCode_NotExistsSubQuery_CollectionStatusListMap;
    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_NotExistsSubQuery_CollectionStatusList() { return _collectionStatusCode_NotExistsSubQuery_CollectionStatusListMap; }
    public String keepCollectionStatusCode_NotExistsSubQuery_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        if (_collectionStatusCode_NotExistsSubQuery_CollectionStatusListMap == null) { _collectionStatusCode_NotExistsSubQuery_CollectionStatusListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionStatusCode_NotExistsSubQuery_CollectionStatusListMap.size() + 1);
        _collectionStatusCode_NotExistsSubQuery_CollectionStatusListMap.put(key, subQuery); return "collectionStatusCode_NotExistsSubQuery_CollectionStatusList." + key;
    }

    protected Map<String, LdBookCQ> _collectionStatusCode_NotExistsSubQuery_BookAsNonExistListMap;
    public Map<String, LdBookCQ> getCollectionStatusCode_NotExistsSubQuery_BookAsNonExistList() { return _collectionStatusCode_NotExistsSubQuery_BookAsNonExistListMap; }
    public String keepCollectionStatusCode_NotExistsSubQuery_BookAsNonExistList(LdBookCQ subQuery) {
        if (_collectionStatusCode_NotExistsSubQuery_BookAsNonExistListMap == null) { _collectionStatusCode_NotExistsSubQuery_BookAsNonExistListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionStatusCode_NotExistsSubQuery_BookAsNonExistListMap.size() + 1);
        _collectionStatusCode_NotExistsSubQuery_BookAsNonExistListMap.put(key, subQuery); return "collectionStatusCode_NotExistsSubQuery_BookAsNonExistList." + key;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusListMap;
    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList() { return _collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusListMap; }
    public String keepCollectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        if (_collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusListMap == null) { _collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusListMap.size() + 1);
        _collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusListMap.put(key, subQuery); return "collectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList." + key;
    }

    protected Map<String, LdBookCQ> _collectionStatusCode_SpecifyDerivedReferrer_BookAsNonExistListMap;
    public Map<String, LdBookCQ> getCollectionStatusCode_SpecifyDerivedReferrer_BookAsNonExistList() { return _collectionStatusCode_SpecifyDerivedReferrer_BookAsNonExistListMap; }
    public String keepCollectionStatusCode_SpecifyDerivedReferrer_BookAsNonExistList(LdBookCQ subQuery) {
        if (_collectionStatusCode_SpecifyDerivedReferrer_BookAsNonExistListMap == null) { _collectionStatusCode_SpecifyDerivedReferrer_BookAsNonExistListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionStatusCode_SpecifyDerivedReferrer_BookAsNonExistListMap.size() + 1);
        _collectionStatusCode_SpecifyDerivedReferrer_BookAsNonExistListMap.put(key, subQuery); return "collectionStatusCode_SpecifyDerivedReferrer_BookAsNonExistList." + key;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListMap;
    public Map<String, LdCollectionStatusCQ> getCollectionStatusCode_QueryDerivedReferrer_CollectionStatusList() { return _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListMap; }
    public String keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        if (_collectionStatusCode_QueryDerivedReferrer_CollectionStatusListMap == null) { _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionStatusCode_QueryDerivedReferrer_CollectionStatusListMap.size() + 1);
        _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListMap.put(key, subQuery); return "collectionStatusCode_QueryDerivedReferrer_CollectionStatusList." + key;
    }
    protected Map<String, Object> _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameterMap;
    public Map<String, Object> getCollectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameter() { return _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameterMap; }
    public String keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameter(Object parameterValue) {
        if (_collectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameterMap == null) { _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_collectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameterMap.size() + 1);
        _collectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameterMap.put(key, parameterValue); return "collectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameter." + key;
    }

    protected Map<String, LdBookCQ> _collectionStatusCode_QueryDerivedReferrer_BookAsNonExistListMap;
    public Map<String, LdBookCQ> getCollectionStatusCode_QueryDerivedReferrer_BookAsNonExistList() { return _collectionStatusCode_QueryDerivedReferrer_BookAsNonExistListMap; }
    public String keepCollectionStatusCode_QueryDerivedReferrer_BookAsNonExistList(LdBookCQ subQuery) {
        if (_collectionStatusCode_QueryDerivedReferrer_BookAsNonExistListMap == null) { _collectionStatusCode_QueryDerivedReferrer_BookAsNonExistListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionStatusCode_QueryDerivedReferrer_BookAsNonExistListMap.size() + 1);
        _collectionStatusCode_QueryDerivedReferrer_BookAsNonExistListMap.put(key, subQuery); return "collectionStatusCode_QueryDerivedReferrer_BookAsNonExistList." + key;
    }
    protected Map<String, Object> _collectionStatusCode_QueryDerivedReferrer_BookAsNonExistListParameterMap;
    public Map<String, Object> getCollectionStatusCode_QueryDerivedReferrer_BookAsNonExistListParameter() { return _collectionStatusCode_QueryDerivedReferrer_BookAsNonExistListParameterMap; }
    public String keepCollectionStatusCode_QueryDerivedReferrer_BookAsNonExistListParameter(Object parameterValue) {
        if (_collectionStatusCode_QueryDerivedReferrer_BookAsNonExistListParameterMap == null) { _collectionStatusCode_QueryDerivedReferrer_BookAsNonExistListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_collectionStatusCode_QueryDerivedReferrer_BookAsNonExistListParameterMap.size() + 1);
        _collectionStatusCode_QueryDerivedReferrer_BookAsNonExistListParameterMap.put(key, parameterValue); return "collectionStatusCode_QueryDerivedReferrer_BookAsNonExistListParameter." + key;
    }

    public LdBsCollectionStatusLookupCQ addOrderBy_CollectionStatusCode_Asc() { regOBA("COLLECTION_STATUS_CODE"); return this; }
    public LdBsCollectionStatusLookupCQ addOrderBy_CollectionStatusCode_Desc() { regOBD("COLLECTION_STATUS_CODE"); return this; }

    protected LdConditionValue _collectionStatusName;
    public LdConditionValue getCollectionStatusName() {
        if (_collectionStatusName == null) { _collectionStatusName = new LdConditionValue(); }
        return _collectionStatusName;
    }
    protected LdConditionValue getCValueCollectionStatusName() { return getCollectionStatusName(); }

    public LdBsCollectionStatusLookupCQ addOrderBy_CollectionStatusName_Asc() { regOBA("COLLECTION_STATUS_NAME"); return this; }
    public LdBsCollectionStatusLookupCQ addOrderBy_CollectionStatusName_Desc() { regOBD("COLLECTION_STATUS_NAME"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsCollectionStatusLookupCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsCollectionStatusLookupCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsCollectionStatusLookupCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsCollectionStatusLookupCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsCollectionStatusLookupCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsCollectionStatusLookupCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsCollectionStatusLookupCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsCollectionStatusLookupCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsCollectionStatusLookupCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsCollectionStatusLookupCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsCollectionStatusLookupCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsCollectionStatusLookupCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsCollectionStatusLookupCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsCollectionStatusLookupCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    protected Map<String, LdCollectionStatusLookupCQ> _scalarSubQueryMap;
    public Map<String, LdCollectionStatusLookupCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(LdCollectionStatusLookupCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdCollectionStatusLookupCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdCollectionStatusLookupCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

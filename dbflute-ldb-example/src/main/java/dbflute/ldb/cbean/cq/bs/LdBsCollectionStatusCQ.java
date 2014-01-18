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
 * The base condition-query of COLLECTION_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsCollectionStatusCQ extends LdAbstractBsCollectionStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdCollectionStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsCollectionStatusCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from COLLECTION_STATUS) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdCollectionStatusCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdCollectionStatusCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join COLLECTION_STATUS on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdCollectionStatusCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdCollectionStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _collectionId;
    public LdConditionValue getCollectionId() {
        if (_collectionId == null) { _collectionId = new LdConditionValue(); }
        return _collectionId;
    }
    protected LdConditionValue getCValueCollectionId() { return getCollectionId(); }

    protected Map<String, LdCollectionCQ> _collectionId_InScopeSubQuery_CollectionMap;
    public Map<String, LdCollectionCQ> getCollectionId_InScopeSubQuery_Collection() { return _collectionId_InScopeSubQuery_CollectionMap; }
    public String keepCollectionId_InScopeSubQuery_Collection(LdCollectionCQ subQuery) {
        if (_collectionId_InScopeSubQuery_CollectionMap == null) { _collectionId_InScopeSubQuery_CollectionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionId_InScopeSubQuery_CollectionMap.size() + 1);
        _collectionId_InScopeSubQuery_CollectionMap.put(key, subQuery); return "collectionId_InScopeSubQuery_Collection." + key;
    }
      
    public LdBsCollectionStatusCQ addOrderBy_CollectionId_Asc() { regOBA("COLLECTION_ID"); return this; }
    public LdBsCollectionStatusCQ addOrderBy_CollectionId_Desc() { regOBD("COLLECTION_ID"); return this; }

    protected LdConditionValue _collectionStatusCode;
    public LdConditionValue getCollectionStatusCode() {
        if (_collectionStatusCode == null) { _collectionStatusCode = new LdConditionValue(); }
        return _collectionStatusCode;
    }
    protected LdConditionValue getCValueCollectionStatusCode() { return getCollectionStatusCode(); }

    protected Map<String, LdCollectionStatusLookupCQ> _collectionStatusCode_InScopeSubQuery_CollectionStatusLookupMap;
    public Map<String, LdCollectionStatusLookupCQ> getCollectionStatusCode_InScopeSubQuery_CollectionStatusLookup() { return _collectionStatusCode_InScopeSubQuery_CollectionStatusLookupMap; }
    public String keepCollectionStatusCode_InScopeSubQuery_CollectionStatusLookup(LdCollectionStatusLookupCQ subQuery) {
        if (_collectionStatusCode_InScopeSubQuery_CollectionStatusLookupMap == null) { _collectionStatusCode_InScopeSubQuery_CollectionStatusLookupMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionStatusCode_InScopeSubQuery_CollectionStatusLookupMap.size() + 1);
        _collectionStatusCode_InScopeSubQuery_CollectionStatusLookupMap.put(key, subQuery); return "collectionStatusCode_InScopeSubQuery_CollectionStatusLookup." + key;
    }

    public LdBsCollectionStatusCQ addOrderBy_CollectionStatusCode_Asc() { regOBA("COLLECTION_STATUS_CODE"); return this; }
    public LdBsCollectionStatusCQ addOrderBy_CollectionStatusCode_Desc() { regOBD("COLLECTION_STATUS_CODE"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsCollectionStatusCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsCollectionStatusCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsCollectionStatusCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsCollectionStatusCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsCollectionStatusCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsCollectionStatusCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsCollectionStatusCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsCollectionStatusCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsCollectionStatusCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsCollectionStatusCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsCollectionStatusCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsCollectionStatusCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsCollectionStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsCollectionStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
        LdCollectionStatusCQ baseQuery = (LdCollectionStatusCQ)baseQueryAsSuper;
        LdCollectionStatusCQ unionQuery = (LdCollectionStatusCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryCollection()) {
            unionQuery.queryCollection().reflectRelationOnUnionQuery(baseQuery.queryCollection(), unionQuery.queryCollection());
        }
        if (baseQuery.hasConditionQueryCollectionStatusLookup()) {
            unionQuery.queryCollectionStatusLookup().reflectRelationOnUnionQuery(baseQuery.queryCollectionStatusLookup(), unionQuery.queryCollectionStatusLookup());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    public LdCollectionCQ queryCollection() {
        return getConditionQueryCollection();
    }
    protected LdCollectionCQ _conditionQueryCollection;
    public LdCollectionCQ getConditionQueryCollection() {
        if (_conditionQueryCollection == null) {
            _conditionQueryCollection = xcreateQueryCollection();
            xsetupOuterJoinCollection();
        }
        return _conditionQueryCollection;
    }
    protected LdCollectionCQ xcreateQueryCollection() {
        String nrp = resolveNextRelationPath("COLLECTION_STATUS", "collection");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdCollectionCQ cq = new LdCollectionCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("collection"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinCollection() {
        LdCollectionCQ cq = getConditionQueryCollection();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("COLLECTION_ID"), cq.getRealColumnName("COLLECTION_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryCollection() {
        return _conditionQueryCollection != null;
    }

    public LdCollectionStatusLookupCQ queryCollectionStatusLookup() {
        return getConditionQueryCollectionStatusLookup();
    }
    protected LdCollectionStatusLookupCQ _conditionQueryCollectionStatusLookup;
    public LdCollectionStatusLookupCQ getConditionQueryCollectionStatusLookup() {
        if (_conditionQueryCollectionStatusLookup == null) {
            _conditionQueryCollectionStatusLookup = xcreateQueryCollectionStatusLookup();
            xsetupOuterJoinCollectionStatusLookup();
        }
        return _conditionQueryCollectionStatusLookup;
    }
    protected LdCollectionStatusLookupCQ xcreateQueryCollectionStatusLookup() {
        String nrp = resolveNextRelationPath("COLLECTION_STATUS", "collectionStatusLookup");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdCollectionStatusLookupCQ cq = new LdCollectionStatusLookupCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("collectionStatusLookup"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinCollectionStatusLookup() {
        LdCollectionStatusLookupCQ cq = getConditionQueryCollectionStatusLookup();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("COLLECTION_STATUS_CODE"), cq.getRealColumnName("COLLECTION_STATUS_CODE"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryCollectionStatusLookup() {
        return _conditionQueryCollectionStatusLookup != null;
    }

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    protected Map<String, LdCollectionStatusCQ> _scalarSubQueryMap;
    public Map<String, LdCollectionStatusCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(LdCollectionStatusCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdCollectionStatusCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdCollectionStatusCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

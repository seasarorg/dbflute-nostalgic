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
 * The base condition-query of NEXT_LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsNextLibraryCQ extends LdAbstractBsNextLibraryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdNextLibraryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsNextLibraryCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from NEXT_LIBRARY) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdNextLibraryCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdNextLibraryCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join NEXT_LIBRARY on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdNextLibraryCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdNextLibraryCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _libraryId;
    public LdConditionValue getLibraryId() {
        if (_libraryId == null) { _libraryId = new LdConditionValue(); }
        return _libraryId;
    }
    protected LdConditionValue getCValueLibraryId() { return getLibraryId(); }

    protected Map<String, LdLibraryCQ> _libraryId_InScopeSubQuery_LibraryByBaseIdMap;
    public Map<String, LdLibraryCQ> getLibraryId_InScopeSubQuery_LibraryByBaseId() { return _libraryId_InScopeSubQuery_LibraryByBaseIdMap; }
    public String keepLibraryId_InScopeSubQuery_LibraryByBaseId(LdLibraryCQ subQuery) {
        if (_libraryId_InScopeSubQuery_LibraryByBaseIdMap == null) { _libraryId_InScopeSubQuery_LibraryByBaseIdMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_InScopeSubQuery_LibraryByBaseIdMap.size() + 1);
        _libraryId_InScopeSubQuery_LibraryByBaseIdMap.put(key, subQuery); return "libraryId_InScopeSubQuery_LibraryByBaseId." + key;
    }
      
    protected Map<String, LdLibraryCQ> _libraryId_InScopeSubQuery_LibraryAsOneMap;
    public Map<String, LdLibraryCQ> getLibraryId_InScopeSubQuery_LibraryAsOne() { return _libraryId_InScopeSubQuery_LibraryAsOneMap; }
    public String keepLibraryId_InScopeSubQuery_LibraryAsOne(LdLibraryCQ subQuery) {
        if (_libraryId_InScopeSubQuery_LibraryAsOneMap == null) { _libraryId_InScopeSubQuery_LibraryAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_InScopeSubQuery_LibraryAsOneMap.size() + 1);
        _libraryId_InScopeSubQuery_LibraryAsOneMap.put(key, subQuery); return "libraryId_InScopeSubQuery_LibraryAsOne." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryId_NotInScopeSubQuery_LibraryAsOneMap;
    public Map<String, LdLibraryCQ> getLibraryId_NotInScopeSubQuery_LibraryAsOne() { return _libraryId_NotInScopeSubQuery_LibraryAsOneMap; }
    public String keepLibraryId_NotInScopeSubQuery_LibraryAsOne(LdLibraryCQ subQuery) {
        if (_libraryId_NotInScopeSubQuery_LibraryAsOneMap == null) { _libraryId_NotInScopeSubQuery_LibraryAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_NotInScopeSubQuery_LibraryAsOneMap.size() + 1);
        _libraryId_NotInScopeSubQuery_LibraryAsOneMap.put(key, subQuery); return "libraryId_NotInScopeSubQuery_LibraryAsOne." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryId_ExistsSubQuery_LibraryAsOneMap;
    public Map<String, LdLibraryCQ> getLibraryId_ExistsSubQuery_LibraryAsOne() { return _libraryId_ExistsSubQuery_LibraryAsOneMap; }
    public String keepLibraryId_ExistsSubQuery_LibraryAsOne(LdLibraryCQ subQuery) {
        if (_libraryId_ExistsSubQuery_LibraryAsOneMap == null) { _libraryId_ExistsSubQuery_LibraryAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_ExistsSubQuery_LibraryAsOneMap.size() + 1);
        _libraryId_ExistsSubQuery_LibraryAsOneMap.put(key, subQuery); return "libraryId_ExistsSubQuery_LibraryAsOne." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryId_NotExistsSubQuery_LibraryAsOneMap;
    public Map<String, LdLibraryCQ> getLibraryId_NotExistsSubQuery_LibraryAsOne() { return _libraryId_NotExistsSubQuery_LibraryAsOneMap; }
    public String keepLibraryId_NotExistsSubQuery_LibraryAsOne(LdLibraryCQ subQuery) {
        if (_libraryId_NotExistsSubQuery_LibraryAsOneMap == null) { _libraryId_NotExistsSubQuery_LibraryAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_NotExistsSubQuery_LibraryAsOneMap.size() + 1);
        _libraryId_NotExistsSubQuery_LibraryAsOneMap.put(key, subQuery); return "libraryId_NotExistsSubQuery_LibraryAsOne." + key;
    }

    public LdBsNextLibraryCQ addOrderBy_LibraryId_Asc() { regOBA("LIBRARY_ID"); return this; }
    public LdBsNextLibraryCQ addOrderBy_LibraryId_Desc() { regOBD("LIBRARY_ID"); return this; }

    protected LdConditionValue _nextLibraryId;
    public LdConditionValue getNextLibraryId() {
        if (_nextLibraryId == null) { _nextLibraryId = new LdConditionValue(); }
        return _nextLibraryId;
    }
    protected LdConditionValue getCValueNextLibraryId() { return getNextLibraryId(); }

    protected Map<String, LdLibraryCQ> _nextLibraryId_InScopeSubQuery_LibraryByNextIdMap;
    public Map<String, LdLibraryCQ> getNextLibraryId_InScopeSubQuery_LibraryByNextId() { return _nextLibraryId_InScopeSubQuery_LibraryByNextIdMap; }
    public String keepNextLibraryId_InScopeSubQuery_LibraryByNextId(LdLibraryCQ subQuery) {
        if (_nextLibraryId_InScopeSubQuery_LibraryByNextIdMap == null) { _nextLibraryId_InScopeSubQuery_LibraryByNextIdMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_nextLibraryId_InScopeSubQuery_LibraryByNextIdMap.size() + 1);
        _nextLibraryId_InScopeSubQuery_LibraryByNextIdMap.put(key, subQuery); return "nextLibraryId_InScopeSubQuery_LibraryByNextId." + key;
    }
      
    public LdBsNextLibraryCQ addOrderBy_NextLibraryId_Asc() { regOBA("NEXT_LIBRARY_ID"); return this; }
    public LdBsNextLibraryCQ addOrderBy_NextLibraryId_Desc() { regOBD("NEXT_LIBRARY_ID"); return this; }

    protected LdConditionValue _distanceKm;
    public LdConditionValue getDistanceKm() {
        if (_distanceKm == null) { _distanceKm = new LdConditionValue(); }
        return _distanceKm;
    }
    protected LdConditionValue getCValueDistanceKm() { return getDistanceKm(); }

    public LdBsNextLibraryCQ addOrderBy_DistanceKm_Asc() { regOBA("DISTANCE_KM"); return this; }
    public LdBsNextLibraryCQ addOrderBy_DistanceKm_Desc() { regOBD("DISTANCE_KM"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsNextLibraryCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsNextLibraryCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsNextLibraryCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsNextLibraryCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsNextLibraryCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsNextLibraryCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsNextLibraryCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsNextLibraryCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsNextLibraryCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsNextLibraryCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsNextLibraryCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsNextLibraryCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsNextLibraryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsNextLibraryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
        LdNextLibraryCQ baseQuery = (LdNextLibraryCQ)baseQueryAsSuper;
        LdNextLibraryCQ unionQuery = (LdNextLibraryCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryLibraryByNextId()) {
            unionQuery.queryLibraryByNextId().reflectRelationOnUnionQuery(baseQuery.queryLibraryByNextId(), unionQuery.queryLibraryByNextId());
        }
        if (baseQuery.hasConditionQueryLibraryByBaseId()) {
            unionQuery.queryLibraryByBaseId().reflectRelationOnUnionQuery(baseQuery.queryLibraryByBaseId(), unionQuery.queryLibraryByBaseId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    public LdLibraryCQ queryLibraryByNextId() {
        return getConditionQueryLibraryByNextId();
    }
    protected LdLibraryCQ _conditionQueryLibraryByNextId;
    public LdLibraryCQ getConditionQueryLibraryByNextId() {
        if (_conditionQueryLibraryByNextId == null) {
            _conditionQueryLibraryByNextId = xcreateQueryLibraryByNextId();
            xsetupOuterJoinLibraryByNextId();
        }
        return _conditionQueryLibraryByNextId;
    }
    protected LdLibraryCQ xcreateQueryLibraryByNextId() {
        String nrp = resolveNextRelationPath("NEXT_LIBRARY", "libraryByNextId");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdLibraryCQ cq = new LdLibraryCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("libraryByNextId"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLibraryByNextId() {
        LdLibraryCQ cq = getConditionQueryLibraryByNextId();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("NEXT_LIBRARY_ID"), cq.getRealColumnName("LIBRARY_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryLibraryByNextId() {
        return _conditionQueryLibraryByNextId != null;
    }

    public LdLibraryCQ queryLibraryByBaseId() {
        return getConditionQueryLibraryByBaseId();
    }
    protected LdLibraryCQ _conditionQueryLibraryByBaseId;
    public LdLibraryCQ getConditionQueryLibraryByBaseId() {
        if (_conditionQueryLibraryByBaseId == null) {
            _conditionQueryLibraryByBaseId = xcreateQueryLibraryByBaseId();
            xsetupOuterJoinLibraryByBaseId();
        }
        return _conditionQueryLibraryByBaseId;
    }
    protected LdLibraryCQ xcreateQueryLibraryByBaseId() {
        String nrp = resolveNextRelationPath("NEXT_LIBRARY", "libraryByBaseId");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdLibraryCQ cq = new LdLibraryCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("libraryByBaseId"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLibraryByBaseId() {
        LdLibraryCQ cq = getConditionQueryLibraryByBaseId();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("LIBRARY_ID"), cq.getRealColumnName("LIBRARY_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryLibraryByBaseId() {
        return _conditionQueryLibraryByBaseId != null;
    }


    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdNextLibraryCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdNextLibraryCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

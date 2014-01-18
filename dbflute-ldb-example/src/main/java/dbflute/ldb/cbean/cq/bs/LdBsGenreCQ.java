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
 * The base condition-query of GENRE.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsGenreCQ extends LdAbstractBsGenreCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdGenreCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsGenreCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from GENRE) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdGenreCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdGenreCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join GENRE on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdGenreCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdGenreCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _genreCode;
    public LdConditionValue getGenreCode() {
        if (_genreCode == null) { _genreCode = new LdConditionValue(); }
        return _genreCode;
    }
    protected LdConditionValue getCValueGenreCode() { return getGenreCode(); }

    protected Map<String, LdBookCQ> _genreCode_InScopeSubQuery_BookListMap;
    public Map<String, LdBookCQ> getGenreCode_InScopeSubQuery_BookList() { return _genreCode_InScopeSubQuery_BookListMap; }
    public String keepGenreCode_InScopeSubQuery_BookList(LdBookCQ subQuery) {
        if (_genreCode_InScopeSubQuery_BookListMap == null) { _genreCode_InScopeSubQuery_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_genreCode_InScopeSubQuery_BookListMap.size() + 1);
        _genreCode_InScopeSubQuery_BookListMap.put(key, subQuery); return "genreCode_InScopeSubQuery_BookList." + key;
    }

    protected Map<String, LdGenreCQ> _genreCode_InScopeSubQuery_GenreSelfListMap;
    public Map<String, LdGenreCQ> getGenreCode_InScopeSubQuery_GenreSelfList() { return _genreCode_InScopeSubQuery_GenreSelfListMap; }
    public String keepGenreCode_InScopeSubQuery_GenreSelfList(LdGenreCQ subQuery) {
        if (_genreCode_InScopeSubQuery_GenreSelfListMap == null) { _genreCode_InScopeSubQuery_GenreSelfListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_genreCode_InScopeSubQuery_GenreSelfListMap.size() + 1);
        _genreCode_InScopeSubQuery_GenreSelfListMap.put(key, subQuery); return "genreCode_InScopeSubQuery_GenreSelfList." + key;
    }

    protected Map<String, LdBookCQ> _genreCode_NotInScopeSubQuery_BookListMap;
    public Map<String, LdBookCQ> getGenreCode_NotInScopeSubQuery_BookList() { return _genreCode_NotInScopeSubQuery_BookListMap; }
    public String keepGenreCode_NotInScopeSubQuery_BookList(LdBookCQ subQuery) {
        if (_genreCode_NotInScopeSubQuery_BookListMap == null) { _genreCode_NotInScopeSubQuery_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_genreCode_NotInScopeSubQuery_BookListMap.size() + 1);
        _genreCode_NotInScopeSubQuery_BookListMap.put(key, subQuery); return "genreCode_NotInScopeSubQuery_BookList." + key;
    }

    protected Map<String, LdGenreCQ> _genreCode_NotInScopeSubQuery_GenreSelfListMap;
    public Map<String, LdGenreCQ> getGenreCode_NotInScopeSubQuery_GenreSelfList() { return _genreCode_NotInScopeSubQuery_GenreSelfListMap; }
    public String keepGenreCode_NotInScopeSubQuery_GenreSelfList(LdGenreCQ subQuery) {
        if (_genreCode_NotInScopeSubQuery_GenreSelfListMap == null) { _genreCode_NotInScopeSubQuery_GenreSelfListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_genreCode_NotInScopeSubQuery_GenreSelfListMap.size() + 1);
        _genreCode_NotInScopeSubQuery_GenreSelfListMap.put(key, subQuery); return "genreCode_NotInScopeSubQuery_GenreSelfList." + key;
    }

    protected Map<String, LdBookCQ> _genreCode_ExistsSubQuery_BookListMap;
    public Map<String, LdBookCQ> getGenreCode_ExistsSubQuery_BookList() { return _genreCode_ExistsSubQuery_BookListMap; }
    public String keepGenreCode_ExistsSubQuery_BookList(LdBookCQ subQuery) {
        if (_genreCode_ExistsSubQuery_BookListMap == null) { _genreCode_ExistsSubQuery_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_genreCode_ExistsSubQuery_BookListMap.size() + 1);
        _genreCode_ExistsSubQuery_BookListMap.put(key, subQuery); return "genreCode_ExistsSubQuery_BookList." + key;
    }

    protected Map<String, LdGenreCQ> _genreCode_ExistsSubQuery_GenreSelfListMap;
    public Map<String, LdGenreCQ> getGenreCode_ExistsSubQuery_GenreSelfList() { return _genreCode_ExistsSubQuery_GenreSelfListMap; }
    public String keepGenreCode_ExistsSubQuery_GenreSelfList(LdGenreCQ subQuery) {
        if (_genreCode_ExistsSubQuery_GenreSelfListMap == null) { _genreCode_ExistsSubQuery_GenreSelfListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_genreCode_ExistsSubQuery_GenreSelfListMap.size() + 1);
        _genreCode_ExistsSubQuery_GenreSelfListMap.put(key, subQuery); return "genreCode_ExistsSubQuery_GenreSelfList." + key;
    }

    protected Map<String, LdBookCQ> _genreCode_NotExistsSubQuery_BookListMap;
    public Map<String, LdBookCQ> getGenreCode_NotExistsSubQuery_BookList() { return _genreCode_NotExistsSubQuery_BookListMap; }
    public String keepGenreCode_NotExistsSubQuery_BookList(LdBookCQ subQuery) {
        if (_genreCode_NotExistsSubQuery_BookListMap == null) { _genreCode_NotExistsSubQuery_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_genreCode_NotExistsSubQuery_BookListMap.size() + 1);
        _genreCode_NotExistsSubQuery_BookListMap.put(key, subQuery); return "genreCode_NotExistsSubQuery_BookList." + key;
    }

    protected Map<String, LdGenreCQ> _genreCode_NotExistsSubQuery_GenreSelfListMap;
    public Map<String, LdGenreCQ> getGenreCode_NotExistsSubQuery_GenreSelfList() { return _genreCode_NotExistsSubQuery_GenreSelfListMap; }
    public String keepGenreCode_NotExistsSubQuery_GenreSelfList(LdGenreCQ subQuery) {
        if (_genreCode_NotExistsSubQuery_GenreSelfListMap == null) { _genreCode_NotExistsSubQuery_GenreSelfListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_genreCode_NotExistsSubQuery_GenreSelfListMap.size() + 1);
        _genreCode_NotExistsSubQuery_GenreSelfListMap.put(key, subQuery); return "genreCode_NotExistsSubQuery_GenreSelfList." + key;
    }

    protected Map<String, LdBookCQ> _genreCode_SpecifyDerivedReferrer_BookListMap;
    public Map<String, LdBookCQ> getGenreCode_SpecifyDerivedReferrer_BookList() { return _genreCode_SpecifyDerivedReferrer_BookListMap; }
    public String keepGenreCode_SpecifyDerivedReferrer_BookList(LdBookCQ subQuery) {
        if (_genreCode_SpecifyDerivedReferrer_BookListMap == null) { _genreCode_SpecifyDerivedReferrer_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_genreCode_SpecifyDerivedReferrer_BookListMap.size() + 1);
        _genreCode_SpecifyDerivedReferrer_BookListMap.put(key, subQuery); return "genreCode_SpecifyDerivedReferrer_BookList." + key;
    }

    protected Map<String, LdGenreCQ> _genreCode_SpecifyDerivedReferrer_GenreSelfListMap;
    public Map<String, LdGenreCQ> getGenreCode_SpecifyDerivedReferrer_GenreSelfList() { return _genreCode_SpecifyDerivedReferrer_GenreSelfListMap; }
    public String keepGenreCode_SpecifyDerivedReferrer_GenreSelfList(LdGenreCQ subQuery) {
        if (_genreCode_SpecifyDerivedReferrer_GenreSelfListMap == null) { _genreCode_SpecifyDerivedReferrer_GenreSelfListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_genreCode_SpecifyDerivedReferrer_GenreSelfListMap.size() + 1);
        _genreCode_SpecifyDerivedReferrer_GenreSelfListMap.put(key, subQuery); return "genreCode_SpecifyDerivedReferrer_GenreSelfList." + key;
    }

    protected Map<String, LdBookCQ> _genreCode_QueryDerivedReferrer_BookListMap;
    public Map<String, LdBookCQ> getGenreCode_QueryDerivedReferrer_BookList() { return _genreCode_QueryDerivedReferrer_BookListMap; }
    public String keepGenreCode_QueryDerivedReferrer_BookList(LdBookCQ subQuery) {
        if (_genreCode_QueryDerivedReferrer_BookListMap == null) { _genreCode_QueryDerivedReferrer_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_genreCode_QueryDerivedReferrer_BookListMap.size() + 1);
        _genreCode_QueryDerivedReferrer_BookListMap.put(key, subQuery); return "genreCode_QueryDerivedReferrer_BookList." + key;
    }
    protected Map<String, Object> _genreCode_QueryDerivedReferrer_BookListParameterMap;
    public Map<String, Object> getGenreCode_QueryDerivedReferrer_BookListParameter() { return _genreCode_QueryDerivedReferrer_BookListParameterMap; }
    public String keepGenreCode_QueryDerivedReferrer_BookListParameter(Object parameterValue) {
        if (_genreCode_QueryDerivedReferrer_BookListParameterMap == null) { _genreCode_QueryDerivedReferrer_BookListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_genreCode_QueryDerivedReferrer_BookListParameterMap.size() + 1);
        _genreCode_QueryDerivedReferrer_BookListParameterMap.put(key, parameterValue); return "genreCode_QueryDerivedReferrer_BookListParameter." + key;
    }

    protected Map<String, LdGenreCQ> _genreCode_QueryDerivedReferrer_GenreSelfListMap;
    public Map<String, LdGenreCQ> getGenreCode_QueryDerivedReferrer_GenreSelfList() { return _genreCode_QueryDerivedReferrer_GenreSelfListMap; }
    public String keepGenreCode_QueryDerivedReferrer_GenreSelfList(LdGenreCQ subQuery) {
        if (_genreCode_QueryDerivedReferrer_GenreSelfListMap == null) { _genreCode_QueryDerivedReferrer_GenreSelfListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_genreCode_QueryDerivedReferrer_GenreSelfListMap.size() + 1);
        _genreCode_QueryDerivedReferrer_GenreSelfListMap.put(key, subQuery); return "genreCode_QueryDerivedReferrer_GenreSelfList." + key;
    }
    protected Map<String, Object> _genreCode_QueryDerivedReferrer_GenreSelfListParameterMap;
    public Map<String, Object> getGenreCode_QueryDerivedReferrer_GenreSelfListParameter() { return _genreCode_QueryDerivedReferrer_GenreSelfListParameterMap; }
    public String keepGenreCode_QueryDerivedReferrer_GenreSelfListParameter(Object parameterValue) {
        if (_genreCode_QueryDerivedReferrer_GenreSelfListParameterMap == null) { _genreCode_QueryDerivedReferrer_GenreSelfListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_genreCode_QueryDerivedReferrer_GenreSelfListParameterMap.size() + 1);
        _genreCode_QueryDerivedReferrer_GenreSelfListParameterMap.put(key, parameterValue); return "genreCode_QueryDerivedReferrer_GenreSelfListParameter." + key;
    }

    public LdBsGenreCQ addOrderBy_GenreCode_Asc() { regOBA("GENRE_CODE"); return this; }
    public LdBsGenreCQ addOrderBy_GenreCode_Desc() { regOBD("GENRE_CODE"); return this; }

    protected LdConditionValue _genreName;
    public LdConditionValue getGenreName() {
        if (_genreName == null) { _genreName = new LdConditionValue(); }
        return _genreName;
    }
    protected LdConditionValue getCValueGenreName() { return getGenreName(); }

    public LdBsGenreCQ addOrderBy_GenreName_Asc() { regOBA("GENRE_NAME"); return this; }
    public LdBsGenreCQ addOrderBy_GenreName_Desc() { regOBD("GENRE_NAME"); return this; }

    protected LdConditionValue _hierarchyLevel;
    public LdConditionValue getHierarchyLevel() {
        if (_hierarchyLevel == null) { _hierarchyLevel = new LdConditionValue(); }
        return _hierarchyLevel;
    }
    protected LdConditionValue getCValueHierarchyLevel() { return getHierarchyLevel(); }

    public LdBsGenreCQ addOrderBy_HierarchyLevel_Asc() { regOBA("HIERARCHY_LEVEL"); return this; }
    public LdBsGenreCQ addOrderBy_HierarchyLevel_Desc() { regOBD("HIERARCHY_LEVEL"); return this; }

    protected LdConditionValue _hierarchyOrder;
    public LdConditionValue getHierarchyOrder() {
        if (_hierarchyOrder == null) { _hierarchyOrder = new LdConditionValue(); }
        return _hierarchyOrder;
    }
    protected LdConditionValue getCValueHierarchyOrder() { return getHierarchyOrder(); }

    public LdBsGenreCQ addOrderBy_HierarchyOrder_Asc() { regOBA("HIERARCHY_ORDER"); return this; }
    public LdBsGenreCQ addOrderBy_HierarchyOrder_Desc() { regOBD("HIERARCHY_ORDER"); return this; }

    protected LdConditionValue _parentGenreCode;
    public LdConditionValue getParentGenreCode() {
        if (_parentGenreCode == null) { _parentGenreCode = new LdConditionValue(); }
        return _parentGenreCode;
    }
    protected LdConditionValue getCValueParentGenreCode() { return getParentGenreCode(); }

    protected Map<String, LdGenreCQ> _parentGenreCode_InScopeSubQuery_GenreSelfMap;
    public Map<String, LdGenreCQ> getParentGenreCode_InScopeSubQuery_GenreSelf() { return _parentGenreCode_InScopeSubQuery_GenreSelfMap; }
    public String keepParentGenreCode_InScopeSubQuery_GenreSelf(LdGenreCQ subQuery) {
        if (_parentGenreCode_InScopeSubQuery_GenreSelfMap == null) { _parentGenreCode_InScopeSubQuery_GenreSelfMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_parentGenreCode_InScopeSubQuery_GenreSelfMap.size() + 1);
        _parentGenreCode_InScopeSubQuery_GenreSelfMap.put(key, subQuery); return "parentGenreCode_InScopeSubQuery_GenreSelf." + key;
    }

    public LdBsGenreCQ addOrderBy_ParentGenreCode_Asc() { regOBA("PARENT_GENRE_CODE"); return this; }
    public LdBsGenreCQ addOrderBy_ParentGenreCode_Desc() { regOBD("PARENT_GENRE_CODE"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsGenreCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsGenreCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsGenreCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsGenreCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsGenreCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsGenreCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsGenreCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsGenreCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsGenreCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsGenreCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsGenreCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsGenreCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsGenreCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsGenreCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
        LdGenreCQ baseQuery = (LdGenreCQ)baseQueryAsSuper;
        LdGenreCQ unionQuery = (LdGenreCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryGenreSelf()) {
            unionQuery.queryGenreSelf().reflectRelationOnUnionQuery(baseQuery.queryGenreSelf(), unionQuery.queryGenreSelf());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    public LdGenreCQ queryGenreSelf() {
        return getConditionQueryGenreSelf();
    }
    protected LdGenreCQ _conditionQueryGenreSelf;
    public LdGenreCQ getConditionQueryGenreSelf() {
        if (_conditionQueryGenreSelf == null) {
            _conditionQueryGenreSelf = xcreateQueryGenreSelf();
            xsetupOuterJoinGenreSelf();
        }
        return _conditionQueryGenreSelf;
    }
    protected LdGenreCQ xcreateQueryGenreSelf() {
        String nrp = resolveNextRelationPath("GENRE", "genreSelf");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdGenreCQ cq = new LdGenreCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("genreSelf"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinGenreSelf() {
        LdGenreCQ cq = getConditionQueryGenreSelf();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("PARENT_GENRE_CODE"), cq.getRealColumnName("GENRE_CODE"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryGenreSelf() {
        return _conditionQueryGenreSelf != null;
    }

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    protected Map<String, LdGenreCQ> _scalarSubQueryMap;
    public Map<String, LdGenreCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(LdGenreCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdGenreCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdGenreCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

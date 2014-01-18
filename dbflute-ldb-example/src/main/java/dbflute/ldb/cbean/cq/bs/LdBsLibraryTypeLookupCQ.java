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
 * The base condition-query of LIBRARY_TYPE_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLibraryTypeLookupCQ extends LdAbstractBsLibraryTypeLookupCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLibraryTypeLookupCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLibraryTypeLookupCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from LIBRARY_TYPE_LOOKUP) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdLibraryTypeLookupCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdLibraryTypeLookupCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join LIBRARY_TYPE_LOOKUP on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdLibraryTypeLookupCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdLibraryTypeLookupCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _libraryTypeCode;
    public LdConditionValue getLibraryTypeCode() {
        if (_libraryTypeCode == null) { _libraryTypeCode = new LdConditionValue(); }
        return _libraryTypeCode;
    }
    protected LdConditionValue getCValueLibraryTypeCode() { return getLibraryTypeCode(); }

    protected Map<String, LdLibraryCQ> _libraryTypeCode_InScopeSubQuery_LibraryListMap;
    public Map<String, LdLibraryCQ> getLibraryTypeCode_InScopeSubQuery_LibraryList() { return _libraryTypeCode_InScopeSubQuery_LibraryListMap; }
    public String keepLibraryTypeCode_InScopeSubQuery_LibraryList(LdLibraryCQ subQuery) {
        if (_libraryTypeCode_InScopeSubQuery_LibraryListMap == null) { _libraryTypeCode_InScopeSubQuery_LibraryListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryTypeCode_InScopeSubQuery_LibraryListMap.size() + 1);
        _libraryTypeCode_InScopeSubQuery_LibraryListMap.put(key, subQuery); return "libraryTypeCode_InScopeSubQuery_LibraryList." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryTypeCode_NotInScopeSubQuery_LibraryListMap;
    public Map<String, LdLibraryCQ> getLibraryTypeCode_NotInScopeSubQuery_LibraryList() { return _libraryTypeCode_NotInScopeSubQuery_LibraryListMap; }
    public String keepLibraryTypeCode_NotInScopeSubQuery_LibraryList(LdLibraryCQ subQuery) {
        if (_libraryTypeCode_NotInScopeSubQuery_LibraryListMap == null) { _libraryTypeCode_NotInScopeSubQuery_LibraryListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryTypeCode_NotInScopeSubQuery_LibraryListMap.size() + 1);
        _libraryTypeCode_NotInScopeSubQuery_LibraryListMap.put(key, subQuery); return "libraryTypeCode_NotInScopeSubQuery_LibraryList." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryTypeCode_ExistsSubQuery_LibraryListMap;
    public Map<String, LdLibraryCQ> getLibraryTypeCode_ExistsSubQuery_LibraryList() { return _libraryTypeCode_ExistsSubQuery_LibraryListMap; }
    public String keepLibraryTypeCode_ExistsSubQuery_LibraryList(LdLibraryCQ subQuery) {
        if (_libraryTypeCode_ExistsSubQuery_LibraryListMap == null) { _libraryTypeCode_ExistsSubQuery_LibraryListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryTypeCode_ExistsSubQuery_LibraryListMap.size() + 1);
        _libraryTypeCode_ExistsSubQuery_LibraryListMap.put(key, subQuery); return "libraryTypeCode_ExistsSubQuery_LibraryList." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryTypeCode_NotExistsSubQuery_LibraryListMap;
    public Map<String, LdLibraryCQ> getLibraryTypeCode_NotExistsSubQuery_LibraryList() { return _libraryTypeCode_NotExistsSubQuery_LibraryListMap; }
    public String keepLibraryTypeCode_NotExistsSubQuery_LibraryList(LdLibraryCQ subQuery) {
        if (_libraryTypeCode_NotExistsSubQuery_LibraryListMap == null) { _libraryTypeCode_NotExistsSubQuery_LibraryListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryTypeCode_NotExistsSubQuery_LibraryListMap.size() + 1);
        _libraryTypeCode_NotExistsSubQuery_LibraryListMap.put(key, subQuery); return "libraryTypeCode_NotExistsSubQuery_LibraryList." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryTypeCode_SpecifyDerivedReferrer_LibraryListMap;
    public Map<String, LdLibraryCQ> getLibraryTypeCode_SpecifyDerivedReferrer_LibraryList() { return _libraryTypeCode_SpecifyDerivedReferrer_LibraryListMap; }
    public String keepLibraryTypeCode_SpecifyDerivedReferrer_LibraryList(LdLibraryCQ subQuery) {
        if (_libraryTypeCode_SpecifyDerivedReferrer_LibraryListMap == null) { _libraryTypeCode_SpecifyDerivedReferrer_LibraryListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryTypeCode_SpecifyDerivedReferrer_LibraryListMap.size() + 1);
        _libraryTypeCode_SpecifyDerivedReferrer_LibraryListMap.put(key, subQuery); return "libraryTypeCode_SpecifyDerivedReferrer_LibraryList." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryTypeCode_QueryDerivedReferrer_LibraryListMap;
    public Map<String, LdLibraryCQ> getLibraryTypeCode_QueryDerivedReferrer_LibraryList() { return _libraryTypeCode_QueryDerivedReferrer_LibraryListMap; }
    public String keepLibraryTypeCode_QueryDerivedReferrer_LibraryList(LdLibraryCQ subQuery) {
        if (_libraryTypeCode_QueryDerivedReferrer_LibraryListMap == null) { _libraryTypeCode_QueryDerivedReferrer_LibraryListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryTypeCode_QueryDerivedReferrer_LibraryListMap.size() + 1);
        _libraryTypeCode_QueryDerivedReferrer_LibraryListMap.put(key, subQuery); return "libraryTypeCode_QueryDerivedReferrer_LibraryList." + key;
    }
    protected Map<String, Object> _libraryTypeCode_QueryDerivedReferrer_LibraryListParameterMap;
    public Map<String, Object> getLibraryTypeCode_QueryDerivedReferrer_LibraryListParameter() { return _libraryTypeCode_QueryDerivedReferrer_LibraryListParameterMap; }
    public String keepLibraryTypeCode_QueryDerivedReferrer_LibraryListParameter(Object parameterValue) {
        if (_libraryTypeCode_QueryDerivedReferrer_LibraryListParameterMap == null) { _libraryTypeCode_QueryDerivedReferrer_LibraryListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_libraryTypeCode_QueryDerivedReferrer_LibraryListParameterMap.size() + 1);
        _libraryTypeCode_QueryDerivedReferrer_LibraryListParameterMap.put(key, parameterValue); return "libraryTypeCode_QueryDerivedReferrer_LibraryListParameter." + key;
    }

    public LdBsLibraryTypeLookupCQ addOrderBy_LibraryTypeCode_Asc() { regOBA("LIBRARY_TYPE_CODE"); return this; }
    public LdBsLibraryTypeLookupCQ addOrderBy_LibraryTypeCode_Desc() { regOBD("LIBRARY_TYPE_CODE"); return this; }

    protected LdConditionValue _libraryTypeName;
    public LdConditionValue getLibraryTypeName() {
        if (_libraryTypeName == null) { _libraryTypeName = new LdConditionValue(); }
        return _libraryTypeName;
    }
    protected LdConditionValue getCValueLibraryTypeName() { return getLibraryTypeName(); }

    public LdBsLibraryTypeLookupCQ addOrderBy_LibraryTypeName_Asc() { regOBA("LIBRARY_TYPE_NAME"); return this; }
    public LdBsLibraryTypeLookupCQ addOrderBy_LibraryTypeName_Desc() { regOBD("LIBRARY_TYPE_NAME"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsLibraryTypeLookupCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsLibraryTypeLookupCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsLibraryTypeLookupCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsLibraryTypeLookupCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsLibraryTypeLookupCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsLibraryTypeLookupCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsLibraryTypeLookupCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsLibraryTypeLookupCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsLibraryTypeLookupCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsLibraryTypeLookupCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsLibraryTypeLookupCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsLibraryTypeLookupCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsLibraryTypeLookupCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsLibraryTypeLookupCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    protected Map<String, LdLibraryTypeLookupCQ> _scalarSubQueryMap;
    public Map<String, LdLibraryTypeLookupCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(LdLibraryTypeLookupCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdLibraryTypeLookupCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLibraryTypeLookupCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

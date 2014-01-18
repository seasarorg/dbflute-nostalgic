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
 * The base condition-query of BLACK_ACTION_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBlackActionLookupCQ extends LdAbstractBsBlackActionLookupCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBlackActionLookupCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsBlackActionLookupCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from BLACK_ACTION_LOOKUP) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdBlackActionLookupCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdBlackActionLookupCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join BLACK_ACTION_LOOKUP on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdBlackActionLookupCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdBlackActionLookupCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _blackActionCode;
    public LdConditionValue getBlackActionCode() {
        if (_blackActionCode == null) { _blackActionCode = new LdConditionValue(); }
        return _blackActionCode;
    }
    protected LdConditionValue getCValueBlackActionCode() { return getBlackActionCode(); }

    protected Map<String, LdBlackActionCQ> _blackActionCode_InScopeSubQuery_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackActionCode_InScopeSubQuery_BlackActionList() { return _blackActionCode_InScopeSubQuery_BlackActionListMap; }
    public String keepBlackActionCode_InScopeSubQuery_BlackActionList(LdBlackActionCQ subQuery) {
        if (_blackActionCode_InScopeSubQuery_BlackActionListMap == null) { _blackActionCode_InScopeSubQuery_BlackActionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_blackActionCode_InScopeSubQuery_BlackActionListMap.size() + 1);
        _blackActionCode_InScopeSubQuery_BlackActionListMap.put(key, subQuery); return "blackActionCode_InScopeSubQuery_BlackActionList." + key;
    }

    protected Map<String, LdBlackActionCQ> _blackActionCode_NotInScopeSubQuery_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackActionCode_NotInScopeSubQuery_BlackActionList() { return _blackActionCode_NotInScopeSubQuery_BlackActionListMap; }
    public String keepBlackActionCode_NotInScopeSubQuery_BlackActionList(LdBlackActionCQ subQuery) {
        if (_blackActionCode_NotInScopeSubQuery_BlackActionListMap == null) { _blackActionCode_NotInScopeSubQuery_BlackActionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_blackActionCode_NotInScopeSubQuery_BlackActionListMap.size() + 1);
        _blackActionCode_NotInScopeSubQuery_BlackActionListMap.put(key, subQuery); return "blackActionCode_NotInScopeSubQuery_BlackActionList." + key;
    }

    protected Map<String, LdBlackActionCQ> _blackActionCode_ExistsSubQuery_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackActionCode_ExistsSubQuery_BlackActionList() { return _blackActionCode_ExistsSubQuery_BlackActionListMap; }
    public String keepBlackActionCode_ExistsSubQuery_BlackActionList(LdBlackActionCQ subQuery) {
        if (_blackActionCode_ExistsSubQuery_BlackActionListMap == null) { _blackActionCode_ExistsSubQuery_BlackActionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_blackActionCode_ExistsSubQuery_BlackActionListMap.size() + 1);
        _blackActionCode_ExistsSubQuery_BlackActionListMap.put(key, subQuery); return "blackActionCode_ExistsSubQuery_BlackActionList." + key;
    }

    protected Map<String, LdBlackActionCQ> _blackActionCode_NotExistsSubQuery_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackActionCode_NotExistsSubQuery_BlackActionList() { return _blackActionCode_NotExistsSubQuery_BlackActionListMap; }
    public String keepBlackActionCode_NotExistsSubQuery_BlackActionList(LdBlackActionCQ subQuery) {
        if (_blackActionCode_NotExistsSubQuery_BlackActionListMap == null) { _blackActionCode_NotExistsSubQuery_BlackActionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_blackActionCode_NotExistsSubQuery_BlackActionListMap.size() + 1);
        _blackActionCode_NotExistsSubQuery_BlackActionListMap.put(key, subQuery); return "blackActionCode_NotExistsSubQuery_BlackActionList." + key;
    }

    protected Map<String, LdBlackActionCQ> _blackActionCode_SpecifyDerivedReferrer_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackActionCode_SpecifyDerivedReferrer_BlackActionList() { return _blackActionCode_SpecifyDerivedReferrer_BlackActionListMap; }
    public String keepBlackActionCode_SpecifyDerivedReferrer_BlackActionList(LdBlackActionCQ subQuery) {
        if (_blackActionCode_SpecifyDerivedReferrer_BlackActionListMap == null) { _blackActionCode_SpecifyDerivedReferrer_BlackActionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_blackActionCode_SpecifyDerivedReferrer_BlackActionListMap.size() + 1);
        _blackActionCode_SpecifyDerivedReferrer_BlackActionListMap.put(key, subQuery); return "blackActionCode_SpecifyDerivedReferrer_BlackActionList." + key;
    }

    protected Map<String, LdBlackActionCQ> _blackActionCode_QueryDerivedReferrer_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackActionCode_QueryDerivedReferrer_BlackActionList() { return _blackActionCode_QueryDerivedReferrer_BlackActionListMap; }
    public String keepBlackActionCode_QueryDerivedReferrer_BlackActionList(LdBlackActionCQ subQuery) {
        if (_blackActionCode_QueryDerivedReferrer_BlackActionListMap == null) { _blackActionCode_QueryDerivedReferrer_BlackActionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_blackActionCode_QueryDerivedReferrer_BlackActionListMap.size() + 1);
        _blackActionCode_QueryDerivedReferrer_BlackActionListMap.put(key, subQuery); return "blackActionCode_QueryDerivedReferrer_BlackActionList." + key;
    }
    protected Map<String, Object> _blackActionCode_QueryDerivedReferrer_BlackActionListParameterMap;
    public Map<String, Object> getBlackActionCode_QueryDerivedReferrer_BlackActionListParameter() { return _blackActionCode_QueryDerivedReferrer_BlackActionListParameterMap; }
    public String keepBlackActionCode_QueryDerivedReferrer_BlackActionListParameter(Object parameterValue) {
        if (_blackActionCode_QueryDerivedReferrer_BlackActionListParameterMap == null) { _blackActionCode_QueryDerivedReferrer_BlackActionListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_blackActionCode_QueryDerivedReferrer_BlackActionListParameterMap.size() + 1);
        _blackActionCode_QueryDerivedReferrer_BlackActionListParameterMap.put(key, parameterValue); return "blackActionCode_QueryDerivedReferrer_BlackActionListParameter." + key;
    }

    public LdBsBlackActionLookupCQ addOrderBy_BlackActionCode_Asc() { regOBA("BLACK_ACTION_CODE"); return this; }
    public LdBsBlackActionLookupCQ addOrderBy_BlackActionCode_Desc() { regOBD("BLACK_ACTION_CODE"); return this; }

    protected LdConditionValue _blackActionName;
    public LdConditionValue getBlackActionName() {
        if (_blackActionName == null) { _blackActionName = new LdConditionValue(); }
        return _blackActionName;
    }
    protected LdConditionValue getCValueBlackActionName() { return getBlackActionName(); }

    public LdBsBlackActionLookupCQ addOrderBy_BlackActionName_Asc() { regOBA("BLACK_ACTION_NAME"); return this; }
    public LdBsBlackActionLookupCQ addOrderBy_BlackActionName_Desc() { regOBD("BLACK_ACTION_NAME"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsBlackActionLookupCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsBlackActionLookupCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsBlackActionLookupCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsBlackActionLookupCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsBlackActionLookupCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsBlackActionLookupCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsBlackActionLookupCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsBlackActionLookupCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsBlackActionLookupCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsBlackActionLookupCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsBlackActionLookupCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsBlackActionLookupCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsBlackActionLookupCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsBlackActionLookupCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    protected Map<String, LdBlackActionLookupCQ> _scalarSubQueryMap;
    public Map<String, LdBlackActionLookupCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(LdBlackActionLookupCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdBlackActionLookupCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdBlackActionLookupCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

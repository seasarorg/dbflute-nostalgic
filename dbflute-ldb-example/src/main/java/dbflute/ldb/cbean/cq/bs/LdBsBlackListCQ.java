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
 * The base condition-query of BLACK_LIST.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBlackListCQ extends LdAbstractBsBlackListCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBlackListCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsBlackListCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from BLACK_LIST) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdBlackListCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdBlackListCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join BLACK_LIST on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdBlackListCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdBlackListCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _blackListId;
    public LdConditionValue getBlackListId() {
        if (_blackListId == null) { _blackListId = new LdConditionValue(); }
        return _blackListId;
    }
    protected LdConditionValue getCValueBlackListId() { return getBlackListId(); }

    protected Map<String, LdBlackActionCQ> _blackListId_InScopeSubQuery_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackListId_InScopeSubQuery_BlackActionList() { return _blackListId_InScopeSubQuery_BlackActionListMap; }
    public String keepBlackListId_InScopeSubQuery_BlackActionList(LdBlackActionCQ subQuery) {
        if (_blackListId_InScopeSubQuery_BlackActionListMap == null) { _blackListId_InScopeSubQuery_BlackActionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_blackListId_InScopeSubQuery_BlackActionListMap.size() + 1);
        _blackListId_InScopeSubQuery_BlackActionListMap.put(key, subQuery); return "blackListId_InScopeSubQuery_BlackActionList." + key;
    }

    protected Map<String, LdBlackActionCQ> _blackListId_NotInScopeSubQuery_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackListId_NotInScopeSubQuery_BlackActionList() { return _blackListId_NotInScopeSubQuery_BlackActionListMap; }
    public String keepBlackListId_NotInScopeSubQuery_BlackActionList(LdBlackActionCQ subQuery) {
        if (_blackListId_NotInScopeSubQuery_BlackActionListMap == null) { _blackListId_NotInScopeSubQuery_BlackActionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_blackListId_NotInScopeSubQuery_BlackActionListMap.size() + 1);
        _blackListId_NotInScopeSubQuery_BlackActionListMap.put(key, subQuery); return "blackListId_NotInScopeSubQuery_BlackActionList." + key;
    }

    protected Map<String, LdBlackActionCQ> _blackListId_ExistsSubQuery_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackListId_ExistsSubQuery_BlackActionList() { return _blackListId_ExistsSubQuery_BlackActionListMap; }
    public String keepBlackListId_ExistsSubQuery_BlackActionList(LdBlackActionCQ subQuery) {
        if (_blackListId_ExistsSubQuery_BlackActionListMap == null) { _blackListId_ExistsSubQuery_BlackActionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_blackListId_ExistsSubQuery_BlackActionListMap.size() + 1);
        _blackListId_ExistsSubQuery_BlackActionListMap.put(key, subQuery); return "blackListId_ExistsSubQuery_BlackActionList." + key;
    }

    protected Map<String, LdBlackActionCQ> _blackListId_NotExistsSubQuery_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackListId_NotExistsSubQuery_BlackActionList() { return _blackListId_NotExistsSubQuery_BlackActionListMap; }
    public String keepBlackListId_NotExistsSubQuery_BlackActionList(LdBlackActionCQ subQuery) {
        if (_blackListId_NotExistsSubQuery_BlackActionListMap == null) { _blackListId_NotExistsSubQuery_BlackActionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_blackListId_NotExistsSubQuery_BlackActionListMap.size() + 1);
        _blackListId_NotExistsSubQuery_BlackActionListMap.put(key, subQuery); return "blackListId_NotExistsSubQuery_BlackActionList." + key;
    }

    protected Map<String, LdBlackActionCQ> _blackListId_SpecifyDerivedReferrer_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackListId_SpecifyDerivedReferrer_BlackActionList() { return _blackListId_SpecifyDerivedReferrer_BlackActionListMap; }
    public String keepBlackListId_SpecifyDerivedReferrer_BlackActionList(LdBlackActionCQ subQuery) {
        if (_blackListId_SpecifyDerivedReferrer_BlackActionListMap == null) { _blackListId_SpecifyDerivedReferrer_BlackActionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_blackListId_SpecifyDerivedReferrer_BlackActionListMap.size() + 1);
        _blackListId_SpecifyDerivedReferrer_BlackActionListMap.put(key, subQuery); return "blackListId_SpecifyDerivedReferrer_BlackActionList." + key;
    }

    protected Map<String, LdBlackActionCQ> _blackListId_QueryDerivedReferrer_BlackActionListMap;
    public Map<String, LdBlackActionCQ> getBlackListId_QueryDerivedReferrer_BlackActionList() { return _blackListId_QueryDerivedReferrer_BlackActionListMap; }
    public String keepBlackListId_QueryDerivedReferrer_BlackActionList(LdBlackActionCQ subQuery) {
        if (_blackListId_QueryDerivedReferrer_BlackActionListMap == null) { _blackListId_QueryDerivedReferrer_BlackActionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_blackListId_QueryDerivedReferrer_BlackActionListMap.size() + 1);
        _blackListId_QueryDerivedReferrer_BlackActionListMap.put(key, subQuery); return "blackListId_QueryDerivedReferrer_BlackActionList." + key;
    }
    protected Map<String, Object> _blackListId_QueryDerivedReferrer_BlackActionListParameterMap;
    public Map<String, Object> getBlackListId_QueryDerivedReferrer_BlackActionListParameter() { return _blackListId_QueryDerivedReferrer_BlackActionListParameterMap; }
    public String keepBlackListId_QueryDerivedReferrer_BlackActionListParameter(Object parameterValue) {
        if (_blackListId_QueryDerivedReferrer_BlackActionListParameterMap == null) { _blackListId_QueryDerivedReferrer_BlackActionListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_blackListId_QueryDerivedReferrer_BlackActionListParameterMap.size() + 1);
        _blackListId_QueryDerivedReferrer_BlackActionListParameterMap.put(key, parameterValue); return "blackListId_QueryDerivedReferrer_BlackActionListParameter." + key;
    }

    public LdBsBlackListCQ addOrderBy_BlackListId_Asc() { regOBA("BLACK_LIST_ID"); return this; }
    public LdBsBlackListCQ addOrderBy_BlackListId_Desc() { regOBD("BLACK_LIST_ID"); return this; }

    protected LdConditionValue _lbUserId;
    public LdConditionValue getLbUserId() {
        if (_lbUserId == null) { _lbUserId = new LdConditionValue(); }
        return _lbUserId;
    }
    protected LdConditionValue getCValueLbUserId() { return getLbUserId(); }

    protected Map<String, LdLbUserCQ> _lbUserId_InScopeSubQuery_LbUserMap;
    public Map<String, LdLbUserCQ> getLbUserId_InScopeSubQuery_LbUser() { return _lbUserId_InScopeSubQuery_LbUserMap; }
    public String keepLbUserId_InScopeSubQuery_LbUser(LdLbUserCQ subQuery) {
        if (_lbUserId_InScopeSubQuery_LbUserMap == null) { _lbUserId_InScopeSubQuery_LbUserMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_lbUserId_InScopeSubQuery_LbUserMap.size() + 1);
        _lbUserId_InScopeSubQuery_LbUserMap.put(key, subQuery); return "lbUserId_InScopeSubQuery_LbUser." + key;
    }
      
    public LdBsBlackListCQ addOrderBy_LbUserId_Asc() { regOBA("LB_USER_ID"); return this; }
    public LdBsBlackListCQ addOrderBy_LbUserId_Desc() { regOBD("LB_USER_ID"); return this; }

    protected LdConditionValue _blackRank;
    public LdConditionValue getBlackRank() {
        if (_blackRank == null) { _blackRank = new LdConditionValue(); }
        return _blackRank;
    }
    protected LdConditionValue getCValueBlackRank() { return getBlackRank(); }

    public LdBsBlackListCQ addOrderBy_BlackRank_Asc() { regOBA("BLACK_RANK"); return this; }
    public LdBsBlackListCQ addOrderBy_BlackRank_Desc() { regOBD("BLACK_RANK"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsBlackListCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsBlackListCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsBlackListCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsBlackListCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsBlackListCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsBlackListCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsBlackListCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsBlackListCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsBlackListCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsBlackListCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsBlackListCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsBlackListCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsBlackListCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsBlackListCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
        LdBlackListCQ baseQuery = (LdBlackListCQ)baseQueryAsSuper;
        LdBlackListCQ unionQuery = (LdBlackListCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryLbUser()) {
            unionQuery.queryLbUser().reflectRelationOnUnionQuery(baseQuery.queryLbUser(), unionQuery.queryLbUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    public LdLbUserCQ queryLbUser() {
        return getConditionQueryLbUser();
    }
    protected LdLbUserCQ _conditionQueryLbUser;
    public LdLbUserCQ getConditionQueryLbUser() {
        if (_conditionQueryLbUser == null) {
            _conditionQueryLbUser = xcreateQueryLbUser();
            xsetupOuterJoinLbUser();
        }
        return _conditionQueryLbUser;
    }
    protected LdLbUserCQ xcreateQueryLbUser() {
        String nrp = resolveNextRelationPath("BLACK_LIST", "lbUser");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdLbUserCQ cq = new LdLbUserCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("lbUser"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLbUser() {
        LdLbUserCQ cq = getConditionQueryLbUser();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("LB_USER_ID"), cq.getRealColumnName("LB_USER_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryLbUser() {
        return _conditionQueryLbUser != null;
    }

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    protected Map<String, LdBlackListCQ> _scalarSubQueryMap;
    public Map<String, LdBlackListCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(LdBlackListCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdBlackListCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdBlackListCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

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
 * The base condition-query of BLACK_ACTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBlackActionCQ extends LdAbstractBsBlackActionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBlackActionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsBlackActionCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from BLACK_ACTION) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdBlackActionCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdBlackActionCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join BLACK_ACTION on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdBlackActionCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdBlackActionCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _blackActionId;
    public LdConditionValue getBlackActionId() {
        if (_blackActionId == null) { _blackActionId = new LdConditionValue(); }
        return _blackActionId;
    }
    protected LdConditionValue getCValueBlackActionId() { return getBlackActionId(); }

    public LdBsBlackActionCQ addOrderBy_BlackActionId_Asc() { regOBA("BLACK_ACTION_ID"); return this; }
    public LdBsBlackActionCQ addOrderBy_BlackActionId_Desc() { regOBD("BLACK_ACTION_ID"); return this; }

    protected LdConditionValue _blackListId;
    public LdConditionValue getBlackListId() {
        if (_blackListId == null) { _blackListId = new LdConditionValue(); }
        return _blackListId;
    }
    protected LdConditionValue getCValueBlackListId() { return getBlackListId(); }

    protected Map<String, LdBlackListCQ> _blackListId_InScopeSubQuery_BlackListMap;
    public Map<String, LdBlackListCQ> getBlackListId_InScopeSubQuery_BlackList() { return _blackListId_InScopeSubQuery_BlackListMap; }
    public String keepBlackListId_InScopeSubQuery_BlackList(LdBlackListCQ subQuery) {
        if (_blackListId_InScopeSubQuery_BlackListMap == null) { _blackListId_InScopeSubQuery_BlackListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_blackListId_InScopeSubQuery_BlackListMap.size() + 1);
        _blackListId_InScopeSubQuery_BlackListMap.put(key, subQuery); return "blackListId_InScopeSubQuery_BlackList." + key;
    }
      
    public LdBsBlackActionCQ addOrderBy_BlackListId_Asc() { regOBA("BLACK_LIST_ID"); return this; }
    public LdBsBlackActionCQ addOrderBy_BlackListId_Desc() { regOBD("BLACK_LIST_ID"); return this; }

    protected LdConditionValue _blackActionCode;
    public LdConditionValue getBlackActionCode() {
        if (_blackActionCode == null) { _blackActionCode = new LdConditionValue(); }
        return _blackActionCode;
    }
    protected LdConditionValue getCValueBlackActionCode() { return getBlackActionCode(); }

    protected Map<String, LdBlackActionLookupCQ> _blackActionCode_InScopeSubQuery_BlackActionLookupMap;
    public Map<String, LdBlackActionLookupCQ> getBlackActionCode_InScopeSubQuery_BlackActionLookup() { return _blackActionCode_InScopeSubQuery_BlackActionLookupMap; }
    public String keepBlackActionCode_InScopeSubQuery_BlackActionLookup(LdBlackActionLookupCQ subQuery) {
        if (_blackActionCode_InScopeSubQuery_BlackActionLookupMap == null) { _blackActionCode_InScopeSubQuery_BlackActionLookupMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_blackActionCode_InScopeSubQuery_BlackActionLookupMap.size() + 1);
        _blackActionCode_InScopeSubQuery_BlackActionLookupMap.put(key, subQuery); return "blackActionCode_InScopeSubQuery_BlackActionLookup." + key;
    }

    public LdBsBlackActionCQ addOrderBy_BlackActionCode_Asc() { regOBA("BLACK_ACTION_CODE"); return this; }
    public LdBsBlackActionCQ addOrderBy_BlackActionCode_Desc() { regOBD("BLACK_ACTION_CODE"); return this; }

    protected LdConditionValue _blackLevel;
    public LdConditionValue getBlackLevel() {
        if (_blackLevel == null) { _blackLevel = new LdConditionValue(); }
        return _blackLevel;
    }
    protected LdConditionValue getCValueBlackLevel() { return getBlackLevel(); }

    public LdBsBlackActionCQ addOrderBy_BlackLevel_Asc() { regOBA("BLACK_LEVEL"); return this; }
    public LdBsBlackActionCQ addOrderBy_BlackLevel_Desc() { regOBD("BLACK_LEVEL"); return this; }

    protected LdConditionValue _actionDate;
    public LdConditionValue getActionDate() {
        if (_actionDate == null) { _actionDate = new LdConditionValue(); }
        return _actionDate;
    }
    protected LdConditionValue getCValueActionDate() { return getActionDate(); }

    public LdBsBlackActionCQ addOrderBy_ActionDate_Asc() { regOBA("ACTION_DATE"); return this; }
    public LdBsBlackActionCQ addOrderBy_ActionDate_Desc() { regOBD("ACTION_DATE"); return this; }

    protected LdConditionValue _evidencePhotograph;
    public LdConditionValue getEvidencePhotograph() {
        if (_evidencePhotograph == null) { _evidencePhotograph = new LdConditionValue(); }
        return _evidencePhotograph;
    }
    protected LdConditionValue getCValueEvidencePhotograph() { return getEvidencePhotograph(); }

    public LdBsBlackActionCQ addOrderBy_EvidencePhotograph_Asc() { regOBA("EVIDENCE_PHOTOGRAPH"); return this; }
    public LdBsBlackActionCQ addOrderBy_EvidencePhotograph_Desc() { regOBD("EVIDENCE_PHOTOGRAPH"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsBlackActionCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsBlackActionCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsBlackActionCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsBlackActionCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsBlackActionCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsBlackActionCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsBlackActionCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsBlackActionCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsBlackActionCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsBlackActionCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsBlackActionCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsBlackActionCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsBlackActionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsBlackActionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
        LdBlackActionCQ baseQuery = (LdBlackActionCQ)baseQueryAsSuper;
        LdBlackActionCQ unionQuery = (LdBlackActionCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryBlackActionLookup()) {
            unionQuery.queryBlackActionLookup().reflectRelationOnUnionQuery(baseQuery.queryBlackActionLookup(), unionQuery.queryBlackActionLookup());
        }
        if (baseQuery.hasConditionQueryBlackList()) {
            unionQuery.queryBlackList().reflectRelationOnUnionQuery(baseQuery.queryBlackList(), unionQuery.queryBlackList());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    public LdBlackActionLookupCQ queryBlackActionLookup() {
        return getConditionQueryBlackActionLookup();
    }
    protected LdBlackActionLookupCQ _conditionQueryBlackActionLookup;
    public LdBlackActionLookupCQ getConditionQueryBlackActionLookup() {
        if (_conditionQueryBlackActionLookup == null) {
            _conditionQueryBlackActionLookup = xcreateQueryBlackActionLookup();
            xsetupOuterJoinBlackActionLookup();
        }
        return _conditionQueryBlackActionLookup;
    }
    protected LdBlackActionLookupCQ xcreateQueryBlackActionLookup() {
        String nrp = resolveNextRelationPath("BLACK_ACTION", "blackActionLookup");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdBlackActionLookupCQ cq = new LdBlackActionLookupCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("blackActionLookup"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinBlackActionLookup() {
        LdBlackActionLookupCQ cq = getConditionQueryBlackActionLookup();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("BLACK_ACTION_CODE"), cq.getRealColumnName("BLACK_ACTION_CODE"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryBlackActionLookup() {
        return _conditionQueryBlackActionLookup != null;
    }

    public LdBlackListCQ queryBlackList() {
        return getConditionQueryBlackList();
    }
    protected LdBlackListCQ _conditionQueryBlackList;
    public LdBlackListCQ getConditionQueryBlackList() {
        if (_conditionQueryBlackList == null) {
            _conditionQueryBlackList = xcreateQueryBlackList();
            xsetupOuterJoinBlackList();
        }
        return _conditionQueryBlackList;
    }
    protected LdBlackListCQ xcreateQueryBlackList() {
        String nrp = resolveNextRelationPath("BLACK_ACTION", "blackList");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdBlackListCQ cq = new LdBlackListCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("blackList"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinBlackList() {
        LdBlackListCQ cq = getConditionQueryBlackList();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("BLACK_LIST_ID"), cq.getRealColumnName("BLACK_LIST_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryBlackList() {
        return _conditionQueryBlackList != null;
    }

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    protected Map<String, LdBlackActionCQ> _scalarSubQueryMap;
    public Map<String, LdBlackActionCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(LdBlackActionCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdBlackActionCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdBlackActionCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

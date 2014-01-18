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
 * The base condition-query of LB_USER.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLbUserCQ extends LdAbstractBsLbUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLbUserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLbUserCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from LB_USER) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdLbUserCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdLbUserCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join LB_USER on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdLbUserCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdLbUserCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _lbUserId;
    public LdConditionValue getLbUserId() {
        if (_lbUserId == null) { _lbUserId = new LdConditionValue(); }
        return _lbUserId;
    }
    protected LdConditionValue getCValueLbUserId() { return getLbUserId(); }

    protected Map<String, LdBlackListCQ> _lbUserId_InScopeSubQuery_BlackListAsOneMap;
    public Map<String, LdBlackListCQ> getLbUserId_InScopeSubQuery_BlackListAsOne() { return _lbUserId_InScopeSubQuery_BlackListAsOneMap; }
    public String keepLbUserId_InScopeSubQuery_BlackListAsOne(LdBlackListCQ subQuery) {
        if (_lbUserId_InScopeSubQuery_BlackListAsOneMap == null) { _lbUserId_InScopeSubQuery_BlackListAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_lbUserId_InScopeSubQuery_BlackListAsOneMap.size() + 1);
        _lbUserId_InScopeSubQuery_BlackListAsOneMap.put(key, subQuery); return "lbUserId_InScopeSubQuery_BlackListAsOne." + key;
    }

    protected Map<String, LdLibraryUserCQ> _lbUserId_InScopeSubQuery_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLbUserId_InScopeSubQuery_LibraryUserList() { return _lbUserId_InScopeSubQuery_LibraryUserListMap; }
    public String keepLbUserId_InScopeSubQuery_LibraryUserList(LdLibraryUserCQ subQuery) {
        if (_lbUserId_InScopeSubQuery_LibraryUserListMap == null) { _lbUserId_InScopeSubQuery_LibraryUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_lbUserId_InScopeSubQuery_LibraryUserListMap.size() + 1);
        _lbUserId_InScopeSubQuery_LibraryUserListMap.put(key, subQuery); return "lbUserId_InScopeSubQuery_LibraryUserList." + key;
    }

    protected Map<String, LdBlackListCQ> _lbUserId_NotInScopeSubQuery_BlackListAsOneMap;
    public Map<String, LdBlackListCQ> getLbUserId_NotInScopeSubQuery_BlackListAsOne() { return _lbUserId_NotInScopeSubQuery_BlackListAsOneMap; }
    public String keepLbUserId_NotInScopeSubQuery_BlackListAsOne(LdBlackListCQ subQuery) {
        if (_lbUserId_NotInScopeSubQuery_BlackListAsOneMap == null) { _lbUserId_NotInScopeSubQuery_BlackListAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_lbUserId_NotInScopeSubQuery_BlackListAsOneMap.size() + 1);
        _lbUserId_NotInScopeSubQuery_BlackListAsOneMap.put(key, subQuery); return "lbUserId_NotInScopeSubQuery_BlackListAsOne." + key;
    }

    protected Map<String, LdLibraryUserCQ> _lbUserId_NotInScopeSubQuery_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLbUserId_NotInScopeSubQuery_LibraryUserList() { return _lbUserId_NotInScopeSubQuery_LibraryUserListMap; }
    public String keepLbUserId_NotInScopeSubQuery_LibraryUserList(LdLibraryUserCQ subQuery) {
        if (_lbUserId_NotInScopeSubQuery_LibraryUserListMap == null) { _lbUserId_NotInScopeSubQuery_LibraryUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_lbUserId_NotInScopeSubQuery_LibraryUserListMap.size() + 1);
        _lbUserId_NotInScopeSubQuery_LibraryUserListMap.put(key, subQuery); return "lbUserId_NotInScopeSubQuery_LibraryUserList." + key;
    }

    protected Map<String, LdBlackListCQ> _lbUserId_ExistsSubQuery_BlackListAsOneMap;
    public Map<String, LdBlackListCQ> getLbUserId_ExistsSubQuery_BlackListAsOne() { return _lbUserId_ExistsSubQuery_BlackListAsOneMap; }
    public String keepLbUserId_ExistsSubQuery_BlackListAsOne(LdBlackListCQ subQuery) {
        if (_lbUserId_ExistsSubQuery_BlackListAsOneMap == null) { _lbUserId_ExistsSubQuery_BlackListAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_lbUserId_ExistsSubQuery_BlackListAsOneMap.size() + 1);
        _lbUserId_ExistsSubQuery_BlackListAsOneMap.put(key, subQuery); return "lbUserId_ExistsSubQuery_BlackListAsOne." + key;
    }

    protected Map<String, LdLibraryUserCQ> _lbUserId_ExistsSubQuery_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLbUserId_ExistsSubQuery_LibraryUserList() { return _lbUserId_ExistsSubQuery_LibraryUserListMap; }
    public String keepLbUserId_ExistsSubQuery_LibraryUserList(LdLibraryUserCQ subQuery) {
        if (_lbUserId_ExistsSubQuery_LibraryUserListMap == null) { _lbUserId_ExistsSubQuery_LibraryUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_lbUserId_ExistsSubQuery_LibraryUserListMap.size() + 1);
        _lbUserId_ExistsSubQuery_LibraryUserListMap.put(key, subQuery); return "lbUserId_ExistsSubQuery_LibraryUserList." + key;
    }

    protected Map<String, LdBlackListCQ> _lbUserId_NotExistsSubQuery_BlackListAsOneMap;
    public Map<String, LdBlackListCQ> getLbUserId_NotExistsSubQuery_BlackListAsOne() { return _lbUserId_NotExistsSubQuery_BlackListAsOneMap; }
    public String keepLbUserId_NotExistsSubQuery_BlackListAsOne(LdBlackListCQ subQuery) {
        if (_lbUserId_NotExistsSubQuery_BlackListAsOneMap == null) { _lbUserId_NotExistsSubQuery_BlackListAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_lbUserId_NotExistsSubQuery_BlackListAsOneMap.size() + 1);
        _lbUserId_NotExistsSubQuery_BlackListAsOneMap.put(key, subQuery); return "lbUserId_NotExistsSubQuery_BlackListAsOne." + key;
    }

    protected Map<String, LdLibraryUserCQ> _lbUserId_NotExistsSubQuery_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLbUserId_NotExistsSubQuery_LibraryUserList() { return _lbUserId_NotExistsSubQuery_LibraryUserListMap; }
    public String keepLbUserId_NotExistsSubQuery_LibraryUserList(LdLibraryUserCQ subQuery) {
        if (_lbUserId_NotExistsSubQuery_LibraryUserListMap == null) { _lbUserId_NotExistsSubQuery_LibraryUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_lbUserId_NotExistsSubQuery_LibraryUserListMap.size() + 1);
        _lbUserId_NotExistsSubQuery_LibraryUserListMap.put(key, subQuery); return "lbUserId_NotExistsSubQuery_LibraryUserList." + key;
    }

    protected Map<String, LdLibraryUserCQ> _lbUserId_SpecifyDerivedReferrer_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLbUserId_SpecifyDerivedReferrer_LibraryUserList() { return _lbUserId_SpecifyDerivedReferrer_LibraryUserListMap; }
    public String keepLbUserId_SpecifyDerivedReferrer_LibraryUserList(LdLibraryUserCQ subQuery) {
        if (_lbUserId_SpecifyDerivedReferrer_LibraryUserListMap == null) { _lbUserId_SpecifyDerivedReferrer_LibraryUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_lbUserId_SpecifyDerivedReferrer_LibraryUserListMap.size() + 1);
        _lbUserId_SpecifyDerivedReferrer_LibraryUserListMap.put(key, subQuery); return "lbUserId_SpecifyDerivedReferrer_LibraryUserList." + key;
    }

    protected Map<String, LdLibraryUserCQ> _lbUserId_QueryDerivedReferrer_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLbUserId_QueryDerivedReferrer_LibraryUserList() { return _lbUserId_QueryDerivedReferrer_LibraryUserListMap; }
    public String keepLbUserId_QueryDerivedReferrer_LibraryUserList(LdLibraryUserCQ subQuery) {
        if (_lbUserId_QueryDerivedReferrer_LibraryUserListMap == null) { _lbUserId_QueryDerivedReferrer_LibraryUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_lbUserId_QueryDerivedReferrer_LibraryUserListMap.size() + 1);
        _lbUserId_QueryDerivedReferrer_LibraryUserListMap.put(key, subQuery); return "lbUserId_QueryDerivedReferrer_LibraryUserList." + key;
    }
    protected Map<String, Object> _lbUserId_QueryDerivedReferrer_LibraryUserListParameterMap;
    public Map<String, Object> getLbUserId_QueryDerivedReferrer_LibraryUserListParameter() { return _lbUserId_QueryDerivedReferrer_LibraryUserListParameterMap; }
    public String keepLbUserId_QueryDerivedReferrer_LibraryUserListParameter(Object parameterValue) {
        if (_lbUserId_QueryDerivedReferrer_LibraryUserListParameterMap == null) { _lbUserId_QueryDerivedReferrer_LibraryUserListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_lbUserId_QueryDerivedReferrer_LibraryUserListParameterMap.size() + 1);
        _lbUserId_QueryDerivedReferrer_LibraryUserListParameterMap.put(key, parameterValue); return "lbUserId_QueryDerivedReferrer_LibraryUserListParameter." + key;
    }

    public LdBsLbUserCQ addOrderBy_LbUserId_Asc() { regOBA("LB_USER_ID"); return this; }
    public LdBsLbUserCQ addOrderBy_LbUserId_Desc() { regOBD("LB_USER_ID"); return this; }

    protected LdConditionValue _lbUserName;
    public LdConditionValue getLbUserName() {
        if (_lbUserName == null) { _lbUserName = new LdConditionValue(); }
        return _lbUserName;
    }
    protected LdConditionValue getCValueLbUserName() { return getLbUserName(); }

    public LdBsLbUserCQ addOrderBy_LbUserName_Asc() { regOBA("LB_USER_NAME"); return this; }
    public LdBsLbUserCQ addOrderBy_LbUserName_Desc() { regOBD("LB_USER_NAME"); return this; }

    protected LdConditionValue _userPassword;
    public LdConditionValue getUserPassword() {
        if (_userPassword == null) { _userPassword = new LdConditionValue(); }
        return _userPassword;
    }
    protected LdConditionValue getCValueUserPassword() { return getUserPassword(); }

    public LdBsLbUserCQ addOrderBy_UserPassword_Asc() { regOBA("USER_PASSWORD"); return this; }
    public LdBsLbUserCQ addOrderBy_UserPassword_Desc() { regOBD("USER_PASSWORD"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsLbUserCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsLbUserCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsLbUserCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsLbUserCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsLbUserCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsLbUserCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsLbUserCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsLbUserCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsLbUserCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsLbUserCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsLbUserCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsLbUserCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsLbUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsLbUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
        LdLbUserCQ baseQuery = (LdLbUserCQ)baseQueryAsSuper;
        LdLbUserCQ unionQuery = (LdLbUserCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryBlackListAsOne()) {
            unionQuery.queryBlackListAsOne().reflectRelationOnUnionQuery(baseQuery.queryBlackListAsOne(), unionQuery.queryBlackListAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    public LdBlackListCQ queryBlackListAsOne() {
        return getConditionQueryBlackListAsOne();
    }
    protected LdBlackListCQ _conditionQueryBlackListAsOne;
    public LdBlackListCQ getConditionQueryBlackListAsOne() {
        if (_conditionQueryBlackListAsOne == null) {
            _conditionQueryBlackListAsOne = xcreateQueryBlackListAsOne();
            xsetupOuterJoinBlackListAsOne();
        }
        return _conditionQueryBlackListAsOne;
    }
    protected LdBlackListCQ xcreateQueryBlackListAsOne() {
        String nrp = resolveNextRelationPath("LB_USER", "blackListAsOne");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdBlackListCQ cq = new LdBlackListCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("blackListAsOne"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinBlackListAsOne() {
        LdBlackListCQ cq = getConditionQueryBlackListAsOne();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("LB_USER_ID"), cq.getRealColumnName("LB_USER_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryBlackListAsOne() {
        return _conditionQueryBlackListAsOne != null;
    }

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    protected Map<String, LdLbUserCQ> _scalarSubQueryMap;
    public Map<String, LdLbUserCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(LdLbUserCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdLbUserCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLbUserCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

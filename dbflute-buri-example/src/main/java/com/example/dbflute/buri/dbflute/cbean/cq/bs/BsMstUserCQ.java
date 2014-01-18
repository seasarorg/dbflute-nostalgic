package com.example.dbflute.buri.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.buri.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.buri.dbflute.cbean.*;
import com.example.dbflute.buri.dbflute.cbean.cq.*;

/**
 * The base condition-query of MST_USER.
 * @author DBFlute(AutoGenerator)
 */
public class BsMstUserCQ extends AbstractBsMstUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MstUserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMstUserCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MST_USER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MstUserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MstUserCIQ xcreateCIQ() {
        MstUserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MstUserCIQ xnewCIQ() {
        return new MstUserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MST_USER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MstUserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MstUserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _userId;
    public ConditionValue getUserId() {
        if (_userId == null) { _userId = nCV(); }
        return _userId;
    }
    protected ConditionValue getCValueUserId() { return getUserId(); }

    protected Map<String, MstUserRoleCQ> _userId_ExistsReferrer_MstUserRoleListMap;
    public Map<String, MstUserRoleCQ> getUserId_ExistsReferrer_MstUserRoleList() { return _userId_ExistsReferrer_MstUserRoleListMap; }
    public String keepUserId_ExistsReferrer_MstUserRoleList(MstUserRoleCQ subQuery) {
        if (_userId_ExistsReferrer_MstUserRoleListMap == null) { _userId_ExistsReferrer_MstUserRoleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_ExistsReferrer_MstUserRoleListMap.size() + 1);
        _userId_ExistsReferrer_MstUserRoleListMap.put(key, subQuery); return "userId_ExistsReferrer_MstUserRoleList." + key;
    }

    protected Map<String, MstUserRoleCQ> _userId_NotExistsReferrer_MstUserRoleListMap;
    public Map<String, MstUserRoleCQ> getUserId_NotExistsReferrer_MstUserRoleList() { return _userId_NotExistsReferrer_MstUserRoleListMap; }
    public String keepUserId_NotExistsReferrer_MstUserRoleList(MstUserRoleCQ subQuery) {
        if (_userId_NotExistsReferrer_MstUserRoleListMap == null) { _userId_NotExistsReferrer_MstUserRoleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_NotExistsReferrer_MstUserRoleListMap.size() + 1);
        _userId_NotExistsReferrer_MstUserRoleListMap.put(key, subQuery); return "userId_NotExistsReferrer_MstUserRoleList." + key;
    }

    protected Map<String, MstUserRoleCQ> _userId_SpecifyDerivedReferrer_MstUserRoleListMap;
    public Map<String, MstUserRoleCQ> getUserId_SpecifyDerivedReferrer_MstUserRoleList() { return _userId_SpecifyDerivedReferrer_MstUserRoleListMap; }
    public String keepUserId_SpecifyDerivedReferrer_MstUserRoleList(MstUserRoleCQ subQuery) {
        if (_userId_SpecifyDerivedReferrer_MstUserRoleListMap == null) { _userId_SpecifyDerivedReferrer_MstUserRoleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_SpecifyDerivedReferrer_MstUserRoleListMap.size() + 1);
        _userId_SpecifyDerivedReferrer_MstUserRoleListMap.put(key, subQuery); return "userId_SpecifyDerivedReferrer_MstUserRoleList." + key;
    }

    protected Map<String, MstUserRoleCQ> _userId_InScopeRelation_MstUserRoleListMap;
    public Map<String, MstUserRoleCQ> getUserId_InScopeRelation_MstUserRoleList() { return _userId_InScopeRelation_MstUserRoleListMap; }
    public String keepUserId_InScopeRelation_MstUserRoleList(MstUserRoleCQ subQuery) {
        if (_userId_InScopeRelation_MstUserRoleListMap == null) { _userId_InScopeRelation_MstUserRoleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_InScopeRelation_MstUserRoleListMap.size() + 1);
        _userId_InScopeRelation_MstUserRoleListMap.put(key, subQuery); return "userId_InScopeRelation_MstUserRoleList." + key;
    }

    protected Map<String, MstUserRoleCQ> _userId_NotInScopeRelation_MstUserRoleListMap;
    public Map<String, MstUserRoleCQ> getUserId_NotInScopeRelation_MstUserRoleList() { return _userId_NotInScopeRelation_MstUserRoleListMap; }
    public String keepUserId_NotInScopeRelation_MstUserRoleList(MstUserRoleCQ subQuery) {
        if (_userId_NotInScopeRelation_MstUserRoleListMap == null) { _userId_NotInScopeRelation_MstUserRoleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_NotInScopeRelation_MstUserRoleListMap.size() + 1);
        _userId_NotInScopeRelation_MstUserRoleListMap.put(key, subQuery); return "userId_NotInScopeRelation_MstUserRoleList." + key;
    }

    protected Map<String, MstUserRoleCQ> _userId_QueryDerivedReferrer_MstUserRoleListMap;
    public Map<String, MstUserRoleCQ> getUserId_QueryDerivedReferrer_MstUserRoleList() { return _userId_QueryDerivedReferrer_MstUserRoleListMap; }
    public String keepUserId_QueryDerivedReferrer_MstUserRoleList(MstUserRoleCQ subQuery) {
        if (_userId_QueryDerivedReferrer_MstUserRoleListMap == null) { _userId_QueryDerivedReferrer_MstUserRoleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_QueryDerivedReferrer_MstUserRoleListMap.size() + 1);
        _userId_QueryDerivedReferrer_MstUserRoleListMap.put(key, subQuery); return "userId_QueryDerivedReferrer_MstUserRoleList." + key;
    }
    protected Map<String, Object> _userId_QueryDerivedReferrer_MstUserRoleListParameterMap;
    public Map<String, Object> getUserId_QueryDerivedReferrer_MstUserRoleListParameter() { return _userId_QueryDerivedReferrer_MstUserRoleListParameterMap; }
    public String keepUserId_QueryDerivedReferrer_MstUserRoleListParameter(Object parameterValue) {
        if (_userId_QueryDerivedReferrer_MstUserRoleListParameterMap == null) { _userId_QueryDerivedReferrer_MstUserRoleListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_userId_QueryDerivedReferrer_MstUserRoleListParameterMap.size() + 1);
        _userId_QueryDerivedReferrer_MstUserRoleListParameterMap.put(key, parameterValue); return "userId_QueryDerivedReferrer_MstUserRoleListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * USER_ID: {PK, NotNull, NUMBER(9)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * USER_ID: {PK, NotNull, NUMBER(9)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _userCode;
    public ConditionValue getUserCode() {
        if (_userCode == null) { _userCode = nCV(); }
        return _userCode;
    }
    protected ConditionValue getCValueUserCode() { return getUserCode(); }

    /** 
     * Add order-by as ascend. <br />
     * USER_CODE: {NotNull, VARCHAR2(20)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_UserCode_Asc() { regOBA("USER_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * USER_CODE: {NotNull, VARCHAR2(20)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_UserCode_Desc() { regOBD("USER_CODE"); return this; }

    protected ConditionValue _userName;
    public ConditionValue getUserName() {
        if (_userName == null) { _userName = nCV(); }
        return _userName;
    }
    protected ConditionValue getCValueUserName() { return getUserName(); }

    /** 
     * Add order-by as ascend. <br />
     * USER_NAME: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_UserName_Asc() { regOBA("USER_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * USER_NAME: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_UserName_Desc() { regOBD("USER_NAME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser() {
        if (_registerUser == null) { _registerUser = nCV(); }
        return _registerUser;
    }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(20)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(20)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime() {
        if (_registerDatetime == null) { _registerDatetime = nCV(); }
        return _registerDatetime;
    }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser() {
        if (_updateUser == null) { _updateUser = nCV(); }
        return _updateUser;
    }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(20)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(20)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime() {
        if (_updateDatetime == null) { _updateDatetime = nCV(); }
        return _updateDatetime;
    }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo() {
        if (_versionNo == null) { _versionNo = nCV(); }
        return _versionNo;
    }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * VERSION_NO: {NotNull, NUMBER(8)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, NUMBER(8)}
     * @return this. (NotNull)
     */
    public BsMstUserCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMstUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #FD4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #FD4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #FD4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMstUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, MstUserCQ> _scalarConditionMap;
    public Map<String, MstUserCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MstUserCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MstUserCQ> _specifyMyselfDerivedMap;
    public Map<String, MstUserCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MstUserCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, MstUserCQ> _queryMyselfDerivedMap;
    public Map<String, MstUserCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MstUserCQ subQuery) {
        if (_queryMyselfDerivedMap == null) { _queryMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_queryMyselfDerivedMap.size() + 1);
        _queryMyselfDerivedMap.put(key, subQuery); return "queryMyselfDerived." + key;
    }
    protected Map<String, Object> _qyeryMyselfDerivedParameterMap;
    public Map<String, Object> getQueryMyselfDerivedParameter() { return _qyeryMyselfDerivedParameterMap; }
    public String keepQueryMyselfDerivedParameter(Object parameterValue) {
        if (_qyeryMyselfDerivedParameterMap == null) { _qyeryMyselfDerivedParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_qyeryMyselfDerivedParameterMap.size() + 1);
        _qyeryMyselfDerivedParameterMap.put(key, parameterValue); return "queryMyselfDerivedParameter." + key;
    }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MstUserCQ> _myselfExistsMap;
    public Map<String, MstUserCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MstUserCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MstUserCQ> _myselfInScopeMap;
    public Map<String, MstUserCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MstUserCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MstUserCB.class.getName(); }
    protected String xCQ() { return MstUserCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

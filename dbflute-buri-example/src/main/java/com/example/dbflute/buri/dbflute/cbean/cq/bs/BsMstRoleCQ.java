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
 * The base condition-query of MST_ROLE.
 * @author DBFlute(AutoGenerator)
 */
public class BsMstRoleCQ extends AbstractBsMstRoleCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MstRoleCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMstRoleCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MST_ROLE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MstRoleCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MstRoleCIQ xcreateCIQ() {
        MstRoleCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MstRoleCIQ xnewCIQ() {
        return new MstRoleCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MST_ROLE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MstRoleCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MstRoleCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _roleId;
    public ConditionValue getRoleId() {
        if (_roleId == null) { _roleId = nCV(); }
        return _roleId;
    }
    protected ConditionValue getCValueRoleId() { return getRoleId(); }

    protected Map<String, MstUserRoleCQ> _roleId_ExistsReferrer_MstUserRoleListMap;
    public Map<String, MstUserRoleCQ> getRoleId_ExistsReferrer_MstUserRoleList() { return _roleId_ExistsReferrer_MstUserRoleListMap; }
    public String keepRoleId_ExistsReferrer_MstUserRoleList(MstUserRoleCQ subQuery) {
        if (_roleId_ExistsReferrer_MstUserRoleListMap == null) { _roleId_ExistsReferrer_MstUserRoleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_roleId_ExistsReferrer_MstUserRoleListMap.size() + 1);
        _roleId_ExistsReferrer_MstUserRoleListMap.put(key, subQuery); return "roleId_ExistsReferrer_MstUserRoleList." + key;
    }

    protected Map<String, MstUserRoleCQ> _roleId_NotExistsReferrer_MstUserRoleListMap;
    public Map<String, MstUserRoleCQ> getRoleId_NotExistsReferrer_MstUserRoleList() { return _roleId_NotExistsReferrer_MstUserRoleListMap; }
    public String keepRoleId_NotExistsReferrer_MstUserRoleList(MstUserRoleCQ subQuery) {
        if (_roleId_NotExistsReferrer_MstUserRoleListMap == null) { _roleId_NotExistsReferrer_MstUserRoleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_roleId_NotExistsReferrer_MstUserRoleListMap.size() + 1);
        _roleId_NotExistsReferrer_MstUserRoleListMap.put(key, subQuery); return "roleId_NotExistsReferrer_MstUserRoleList." + key;
    }

    protected Map<String, MstUserRoleCQ> _roleId_SpecifyDerivedReferrer_MstUserRoleListMap;
    public Map<String, MstUserRoleCQ> getRoleId_SpecifyDerivedReferrer_MstUserRoleList() { return _roleId_SpecifyDerivedReferrer_MstUserRoleListMap; }
    public String keepRoleId_SpecifyDerivedReferrer_MstUserRoleList(MstUserRoleCQ subQuery) {
        if (_roleId_SpecifyDerivedReferrer_MstUserRoleListMap == null) { _roleId_SpecifyDerivedReferrer_MstUserRoleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_roleId_SpecifyDerivedReferrer_MstUserRoleListMap.size() + 1);
        _roleId_SpecifyDerivedReferrer_MstUserRoleListMap.put(key, subQuery); return "roleId_SpecifyDerivedReferrer_MstUserRoleList." + key;
    }

    protected Map<String, MstUserRoleCQ> _roleId_InScopeRelation_MstUserRoleListMap;
    public Map<String, MstUserRoleCQ> getRoleId_InScopeRelation_MstUserRoleList() { return _roleId_InScopeRelation_MstUserRoleListMap; }
    public String keepRoleId_InScopeRelation_MstUserRoleList(MstUserRoleCQ subQuery) {
        if (_roleId_InScopeRelation_MstUserRoleListMap == null) { _roleId_InScopeRelation_MstUserRoleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_roleId_InScopeRelation_MstUserRoleListMap.size() + 1);
        _roleId_InScopeRelation_MstUserRoleListMap.put(key, subQuery); return "roleId_InScopeRelation_MstUserRoleList." + key;
    }

    protected Map<String, MstUserRoleCQ> _roleId_NotInScopeRelation_MstUserRoleListMap;
    public Map<String, MstUserRoleCQ> getRoleId_NotInScopeRelation_MstUserRoleList() { return _roleId_NotInScopeRelation_MstUserRoleListMap; }
    public String keepRoleId_NotInScopeRelation_MstUserRoleList(MstUserRoleCQ subQuery) {
        if (_roleId_NotInScopeRelation_MstUserRoleListMap == null) { _roleId_NotInScopeRelation_MstUserRoleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_roleId_NotInScopeRelation_MstUserRoleListMap.size() + 1);
        _roleId_NotInScopeRelation_MstUserRoleListMap.put(key, subQuery); return "roleId_NotInScopeRelation_MstUserRoleList." + key;
    }

    protected Map<String, MstUserRoleCQ> _roleId_QueryDerivedReferrer_MstUserRoleListMap;
    public Map<String, MstUserRoleCQ> getRoleId_QueryDerivedReferrer_MstUserRoleList() { return _roleId_QueryDerivedReferrer_MstUserRoleListMap; }
    public String keepRoleId_QueryDerivedReferrer_MstUserRoleList(MstUserRoleCQ subQuery) {
        if (_roleId_QueryDerivedReferrer_MstUserRoleListMap == null) { _roleId_QueryDerivedReferrer_MstUserRoleListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_roleId_QueryDerivedReferrer_MstUserRoleListMap.size() + 1);
        _roleId_QueryDerivedReferrer_MstUserRoleListMap.put(key, subQuery); return "roleId_QueryDerivedReferrer_MstUserRoleList." + key;
    }
    protected Map<String, Object> _roleId_QueryDerivedReferrer_MstUserRoleListParameterMap;
    public Map<String, Object> getRoleId_QueryDerivedReferrer_MstUserRoleListParameter() { return _roleId_QueryDerivedReferrer_MstUserRoleListParameterMap; }
    public String keepRoleId_QueryDerivedReferrer_MstUserRoleListParameter(Object parameterValue) {
        if (_roleId_QueryDerivedReferrer_MstUserRoleListParameterMap == null) { _roleId_QueryDerivedReferrer_MstUserRoleListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_roleId_QueryDerivedReferrer_MstUserRoleListParameterMap.size() + 1);
        _roleId_QueryDerivedReferrer_MstUserRoleListParameterMap.put(key, parameterValue); return "roleId_QueryDerivedReferrer_MstUserRoleListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * ROLE_ID: {PK, NotNull, NUMBER(9)}
     * @return this. (NotNull)
     */
    public BsMstRoleCQ addOrderBy_RoleId_Asc() { regOBA("ROLE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * ROLE_ID: {PK, NotNull, NUMBER(9)}
     * @return this. (NotNull)
     */
    public BsMstRoleCQ addOrderBy_RoleId_Desc() { regOBD("ROLE_ID"); return this; }

    protected ConditionValue _roleName;
    public ConditionValue getRoleName() {
        if (_roleName == null) { _roleName = nCV(); }
        return _roleName;
    }
    protected ConditionValue getCValueRoleName() { return getRoleName(); }

    /** 
     * Add order-by as ascend. <br />
     * ROLE_NAME: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMstRoleCQ addOrderBy_RoleName_Asc() { regOBA("ROLE_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * ROLE_NAME: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsMstRoleCQ addOrderBy_RoleName_Desc() { regOBD("ROLE_NAME"); return this; }

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
    public BsMstRoleCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(20)}
     * @return this. (NotNull)
     */
    public BsMstRoleCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsMstRoleCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsMstRoleCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsMstRoleCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(20)}
     * @return this. (NotNull)
     */
    public BsMstRoleCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsMstRoleCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsMstRoleCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsMstRoleCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, NUMBER(8)}
     * @return this. (NotNull)
     */
    public BsMstRoleCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMstRoleCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsMstRoleCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, MstRoleCQ> _scalarConditionMap;
    public Map<String, MstRoleCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MstRoleCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MstRoleCQ> _specifyMyselfDerivedMap;
    public Map<String, MstRoleCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MstRoleCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, MstRoleCQ> _queryMyselfDerivedMap;
    public Map<String, MstRoleCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MstRoleCQ subQuery) {
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
    protected Map<String, MstRoleCQ> _myselfExistsMap;
    public Map<String, MstRoleCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MstRoleCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MstRoleCQ> _myselfInScopeMap;
    public Map<String, MstRoleCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MstRoleCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MstRoleCB.class.getName(); }
    protected String xCQ() { return MstRoleCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

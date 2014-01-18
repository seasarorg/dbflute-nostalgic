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
 * The base condition-query of MST_USER_ROLE.
 * @author DBFlute(AutoGenerator)
 */
public class BsMstUserRoleCQ extends AbstractBsMstUserRoleCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MstUserRoleCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMstUserRoleCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from MST_USER_ROLE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MstUserRoleCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MstUserRoleCIQ xcreateCIQ() {
        MstUserRoleCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MstUserRoleCIQ xnewCIQ() {
        return new MstUserRoleCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join MST_USER_ROLE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MstUserRoleCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MstUserRoleCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _userRoleId;
    public ConditionValue getUserRoleId() {
        if (_userRoleId == null) { _userRoleId = nCV(); }
        return _userRoleId;
    }
    protected ConditionValue getCValueUserRoleId() { return getUserRoleId(); }

    /** 
     * Add order-by as ascend. <br />
     * USER_ROLE_ID: {PK, NotNull, NUMBER(9)}
     * @return this. (NotNull)
     */
    public BsMstUserRoleCQ addOrderBy_UserRoleId_Asc() { regOBA("USER_ROLE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * USER_ROLE_ID: {PK, NotNull, NUMBER(9)}
     * @return this. (NotNull)
     */
    public BsMstUserRoleCQ addOrderBy_UserRoleId_Desc() { regOBD("USER_ROLE_ID"); return this; }

    protected ConditionValue _userId;
    public ConditionValue getUserId() {
        if (_userId == null) { _userId = nCV(); }
        return _userId;
    }
    protected ConditionValue getCValueUserId() { return getUserId(); }

    protected Map<String, MstUserCQ> _userId_InScopeRelation_MstUserMap;
    public Map<String, MstUserCQ> getUserId_InScopeRelation_MstUser() { return _userId_InScopeRelation_MstUserMap; }
    public String keepUserId_InScopeRelation_MstUser(MstUserCQ subQuery) {
        if (_userId_InScopeRelation_MstUserMap == null) { _userId_InScopeRelation_MstUserMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_InScopeRelation_MstUserMap.size() + 1);
        _userId_InScopeRelation_MstUserMap.put(key, subQuery); return "userId_InScopeRelation_MstUser." + key;
    }

    protected Map<String, MstUserCQ> _userId_NotInScopeRelation_MstUserMap;
    public Map<String, MstUserCQ> getUserId_NotInScopeRelation_MstUser() { return _userId_NotInScopeRelation_MstUserMap; }
    public String keepUserId_NotInScopeRelation_MstUser(MstUserCQ subQuery) {
        if (_userId_NotInScopeRelation_MstUserMap == null) { _userId_NotInScopeRelation_MstUserMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_userId_NotInScopeRelation_MstUserMap.size() + 1);
        _userId_NotInScopeRelation_MstUserMap.put(key, subQuery); return "userId_NotInScopeRelation_MstUser." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * USER_ID: {NotNull, NUMBER(9), FK to MST_USER}
     * @return this. (NotNull)
     */
    public BsMstUserRoleCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * USER_ID: {NotNull, NUMBER(9), FK to MST_USER}
     * @return this. (NotNull)
     */
    public BsMstUserRoleCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _roleId;
    public ConditionValue getRoleId() {
        if (_roleId == null) { _roleId = nCV(); }
        return _roleId;
    }
    protected ConditionValue getCValueRoleId() { return getRoleId(); }

    protected Map<String, MstRoleCQ> _roleId_InScopeRelation_MstRoleMap;
    public Map<String, MstRoleCQ> getRoleId_InScopeRelation_MstRole() { return _roleId_InScopeRelation_MstRoleMap; }
    public String keepRoleId_InScopeRelation_MstRole(MstRoleCQ subQuery) {
        if (_roleId_InScopeRelation_MstRoleMap == null) { _roleId_InScopeRelation_MstRoleMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_roleId_InScopeRelation_MstRoleMap.size() + 1);
        _roleId_InScopeRelation_MstRoleMap.put(key, subQuery); return "roleId_InScopeRelation_MstRole." + key;
    }

    protected Map<String, MstRoleCQ> _roleId_NotInScopeRelation_MstRoleMap;
    public Map<String, MstRoleCQ> getRoleId_NotInScopeRelation_MstRole() { return _roleId_NotInScopeRelation_MstRoleMap; }
    public String keepRoleId_NotInScopeRelation_MstRole(MstRoleCQ subQuery) {
        if (_roleId_NotInScopeRelation_MstRoleMap == null) { _roleId_NotInScopeRelation_MstRoleMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_roleId_NotInScopeRelation_MstRoleMap.size() + 1);
        _roleId_NotInScopeRelation_MstRoleMap.put(key, subQuery); return "roleId_NotInScopeRelation_MstRole." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * ROLE_ID: {NotNull, NUMBER(9), FK to MST_ROLE}
     * @return this. (NotNull)
     */
    public BsMstUserRoleCQ addOrderBy_RoleId_Asc() { regOBA("ROLE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * ROLE_ID: {NotNull, NUMBER(9), FK to MST_ROLE}
     * @return this. (NotNull)
     */
    public BsMstUserRoleCQ addOrderBy_RoleId_Desc() { regOBD("ROLE_ID"); return this; }

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
    public BsMstUserRoleCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(20)}
     * @return this. (NotNull)
     */
    public BsMstUserRoleCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

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
    public BsMstUserRoleCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsMstUserRoleCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

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
    public BsMstUserRoleCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(20)}
     * @return this. (NotNull)
     */
    public BsMstUserRoleCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

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
    public BsMstUserRoleCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @return this. (NotNull)
     */
    public BsMstUserRoleCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

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
    public BsMstUserRoleCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, NUMBER(8)}
     * @return this. (NotNull)
     */
    public BsMstUserRoleCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsMstUserRoleCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsMstUserRoleCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        MstUserRoleCQ baseQuery = (MstUserRoleCQ)baseQueryAsSuper;
        MstUserRoleCQ unionQuery = (MstUserRoleCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryMstRole()) {
            unionQuery.queryMstRole().reflectRelationOnUnionQuery(baseQuery.queryMstRole(), unionQuery.queryMstRole());
        }
        if (baseQuery.hasConditionQueryMstUser()) {
            unionQuery.queryMstUser().reflectRelationOnUnionQuery(baseQuery.queryMstUser(), unionQuery.queryMstUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * MST_ROLE by my ROLE_ID, named 'mstRole'.
     * @return The instance of condition-query. (NotNull)
     */
    public MstRoleCQ queryMstRole() {
        return getConditionQueryMstRole();
    }
    protected MstRoleCQ _conditionQueryMstRole;
    public MstRoleCQ getConditionQueryMstRole() {
        if (_conditionQueryMstRole == null) {
            _conditionQueryMstRole = xcreateQueryMstRole();
            xsetupOuterJoinMstRole();
        }
        return _conditionQueryMstRole;
    }
    protected MstRoleCQ xcreateQueryMstRole() {
        String nrp = resolveNextRelationPath("MST_USER_ROLE", "mstRole");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MstRoleCQ cq = new MstRoleCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("mstRole");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMstRole() {
        MstRoleCQ cq = getConditionQueryMstRole();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("ROLE_ID", "ROLE_ID");
        registerOuterJoin(cq, joinOnMap, "mstRole");
    }
    public boolean hasConditionQueryMstRole() {
        return _conditionQueryMstRole != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * MST_USER by my USER_ID, named 'mstUser'.
     * @return The instance of condition-query. (NotNull)
     */
    public MstUserCQ queryMstUser() {
        return getConditionQueryMstUser();
    }
    protected MstUserCQ _conditionQueryMstUser;
    public MstUserCQ getConditionQueryMstUser() {
        if (_conditionQueryMstUser == null) {
            _conditionQueryMstUser = xcreateQueryMstUser();
            xsetupOuterJoinMstUser();
        }
        return _conditionQueryMstUser;
    }
    protected MstUserCQ xcreateQueryMstUser() {
        String nrp = resolveNextRelationPath("MST_USER_ROLE", "mstUser");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        MstUserCQ cq = new MstUserCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("mstUser");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinMstUser() {
        MstUserCQ cq = getConditionQueryMstUser();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("USER_ID", "USER_ID");
        registerOuterJoin(cq, joinOnMap, "mstUser");
    }
    public boolean hasConditionQueryMstUser() {
        return _conditionQueryMstUser != null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, MstUserRoleCQ> _scalarConditionMap;
    public Map<String, MstUserRoleCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(MstUserRoleCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, MstUserRoleCQ> _specifyMyselfDerivedMap;
    public Map<String, MstUserRoleCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(MstUserRoleCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, MstUserRoleCQ> _queryMyselfDerivedMap;
    public Map<String, MstUserRoleCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(MstUserRoleCQ subQuery) {
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
    protected Map<String, MstUserRoleCQ> _myselfExistsMap;
    public Map<String, MstUserRoleCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(MstUserRoleCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, MstUserRoleCQ> _myselfInScopeMap;
    public Map<String, MstUserRoleCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(MstUserRoleCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MstUserRoleCB.class.getName(); }
    protected String xCQ() { return MstUserRoleCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

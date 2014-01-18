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
 * The base condition-query of BURIUSER.
 * @author DBFlute(AutoGenerator)
 */
public class BsBuriUserCQ extends AbstractBsBuriUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriUserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBuriUserCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BURIUSER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BuriUserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BuriUserCIQ xcreateCIQ() {
        BuriUserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BuriUserCIQ xnewCIQ() {
        return new BuriUserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BURIUSER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BuriUserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BuriUserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _buriUserId;
    public ConditionValue getBuriUserId() {
        if (_buriUserId == null) { _buriUserId = nCV(); }
        return _buriUserId;
    }
    protected ConditionValue getCValueBuriUserId() { return getBuriUserId(); }

    protected Map<String, BuriStateUserCQ> _buriUserId_ExistsReferrer_BuriStateUserListMap;
    public Map<String, BuriStateUserCQ> getBuriUserId_ExistsReferrer_BuriStateUserList() { return _buriUserId_ExistsReferrer_BuriStateUserListMap; }
    public String keepBuriUserId_ExistsReferrer_BuriStateUserList(BuriStateUserCQ subQuery) {
        if (_buriUserId_ExistsReferrer_BuriStateUserListMap == null) { _buriUserId_ExistsReferrer_BuriStateUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_buriUserId_ExistsReferrer_BuriStateUserListMap.size() + 1);
        _buriUserId_ExistsReferrer_BuriStateUserListMap.put(key, subQuery); return "buriUserId_ExistsReferrer_BuriStateUserList." + key;
    }

    protected Map<String, BuriStateUserCQ> _buriUserId_NotExistsReferrer_BuriStateUserListMap;
    public Map<String, BuriStateUserCQ> getBuriUserId_NotExistsReferrer_BuriStateUserList() { return _buriUserId_NotExistsReferrer_BuriStateUserListMap; }
    public String keepBuriUserId_NotExistsReferrer_BuriStateUserList(BuriStateUserCQ subQuery) {
        if (_buriUserId_NotExistsReferrer_BuriStateUserListMap == null) { _buriUserId_NotExistsReferrer_BuriStateUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_buriUserId_NotExistsReferrer_BuriStateUserListMap.size() + 1);
        _buriUserId_NotExistsReferrer_BuriStateUserListMap.put(key, subQuery); return "buriUserId_NotExistsReferrer_BuriStateUserList." + key;
    }

    protected Map<String, BuriStateUserCQ> _buriUserId_SpecifyDerivedReferrer_BuriStateUserListMap;
    public Map<String, BuriStateUserCQ> getBuriUserId_SpecifyDerivedReferrer_BuriStateUserList() { return _buriUserId_SpecifyDerivedReferrer_BuriStateUserListMap; }
    public String keepBuriUserId_SpecifyDerivedReferrer_BuriStateUserList(BuriStateUserCQ subQuery) {
        if (_buriUserId_SpecifyDerivedReferrer_BuriStateUserListMap == null) { _buriUserId_SpecifyDerivedReferrer_BuriStateUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_buriUserId_SpecifyDerivedReferrer_BuriStateUserListMap.size() + 1);
        _buriUserId_SpecifyDerivedReferrer_BuriStateUserListMap.put(key, subQuery); return "buriUserId_SpecifyDerivedReferrer_BuriStateUserList." + key;
    }

    protected Map<String, BuriStateUserCQ> _buriUserId_InScopeRelation_BuriStateUserListMap;
    public Map<String, BuriStateUserCQ> getBuriUserId_InScopeRelation_BuriStateUserList() { return _buriUserId_InScopeRelation_BuriStateUserListMap; }
    public String keepBuriUserId_InScopeRelation_BuriStateUserList(BuriStateUserCQ subQuery) {
        if (_buriUserId_InScopeRelation_BuriStateUserListMap == null) { _buriUserId_InScopeRelation_BuriStateUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_buriUserId_InScopeRelation_BuriStateUserListMap.size() + 1);
        _buriUserId_InScopeRelation_BuriStateUserListMap.put(key, subQuery); return "buriUserId_InScopeRelation_BuriStateUserList." + key;
    }

    protected Map<String, BuriStateUserCQ> _buriUserId_NotInScopeRelation_BuriStateUserListMap;
    public Map<String, BuriStateUserCQ> getBuriUserId_NotInScopeRelation_BuriStateUserList() { return _buriUserId_NotInScopeRelation_BuriStateUserListMap; }
    public String keepBuriUserId_NotInScopeRelation_BuriStateUserList(BuriStateUserCQ subQuery) {
        if (_buriUserId_NotInScopeRelation_BuriStateUserListMap == null) { _buriUserId_NotInScopeRelation_BuriStateUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_buriUserId_NotInScopeRelation_BuriStateUserListMap.size() + 1);
        _buriUserId_NotInScopeRelation_BuriStateUserListMap.put(key, subQuery); return "buriUserId_NotInScopeRelation_BuriStateUserList." + key;
    }

    protected Map<String, BuriStateUserCQ> _buriUserId_QueryDerivedReferrer_BuriStateUserListMap;
    public Map<String, BuriStateUserCQ> getBuriUserId_QueryDerivedReferrer_BuriStateUserList() { return _buriUserId_QueryDerivedReferrer_BuriStateUserListMap; }
    public String keepBuriUserId_QueryDerivedReferrer_BuriStateUserList(BuriStateUserCQ subQuery) {
        if (_buriUserId_QueryDerivedReferrer_BuriStateUserListMap == null) { _buriUserId_QueryDerivedReferrer_BuriStateUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_buriUserId_QueryDerivedReferrer_BuriStateUserListMap.size() + 1);
        _buriUserId_QueryDerivedReferrer_BuriStateUserListMap.put(key, subQuery); return "buriUserId_QueryDerivedReferrer_BuriStateUserList." + key;
    }
    protected Map<String, Object> _buriUserId_QueryDerivedReferrer_BuriStateUserListParameterMap;
    public Map<String, Object> getBuriUserId_QueryDerivedReferrer_BuriStateUserListParameter() { return _buriUserId_QueryDerivedReferrer_BuriStateUserListParameterMap; }
    public String keepBuriUserId_QueryDerivedReferrer_BuriStateUserListParameter(Object parameterValue) {
        if (_buriUserId_QueryDerivedReferrer_BuriStateUserListParameterMap == null) { _buriUserId_QueryDerivedReferrer_BuriStateUserListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_buriUserId_QueryDerivedReferrer_BuriStateUserListParameterMap.size() + 1);
        _buriUserId_QueryDerivedReferrer_BuriStateUserListParameterMap.put(key, parameterValue); return "buriUserId_QueryDerivedReferrer_BuriStateUserListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * BURIUSERID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriUserCQ addOrderBy_BuriUserId_Asc() { regOBA("BURIUSERID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BURIUSERID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriUserCQ addOrderBy_BuriUserId_Desc() { regOBD("BURIUSERID"); return this; }

    protected ConditionValue _userIdVal;
    public ConditionValue getUserIdVal() {
        if (_userIdVal == null) { _userIdVal = nCV(); }
        return _userIdVal;
    }
    protected ConditionValue getCValueUserIdVal() { return getUserIdVal(); }

    /** 
     * Add order-by as ascend. <br />
     * USERIDVAL: {IX, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriUserCQ addOrderBy_UserIdVal_Asc() { regOBA("USERIDVAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * USERIDVAL: {IX, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriUserCQ addOrderBy_UserIdVal_Desc() { regOBD("USERIDVAL"); return this; }

    protected ConditionValue _userIdNum;
    public ConditionValue getUserIdNum() {
        if (_userIdNum == null) { _userIdNum = nCV(); }
        return _userIdNum;
    }
    protected ConditionValue getCValueUserIdNum() { return getUserIdNum(); }

    /** 
     * Add order-by as ascend. <br />
     * USERIDNUM: {IX+, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriUserCQ addOrderBy_UserIdNum_Asc() { regOBA("USERIDNUM"); return this; }

    /**
     * Add order-by as descend. <br />
     * USERIDNUM: {IX+, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriUserCQ addOrderBy_UserIdNum_Desc() { regOBD("USERIDNUM"); return this; }

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
    public BsBuriUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsBuriUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, BuriUserCQ> _scalarConditionMap;
    public Map<String, BuriUserCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(BuriUserCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, BuriUserCQ> _specifyMyselfDerivedMap;
    public Map<String, BuriUserCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(BuriUserCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, BuriUserCQ> _queryMyselfDerivedMap;
    public Map<String, BuriUserCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(BuriUserCQ subQuery) {
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
    protected Map<String, BuriUserCQ> _myselfExistsMap;
    public Map<String, BuriUserCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(BuriUserCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, BuriUserCQ> _myselfInScopeMap;
    public Map<String, BuriUserCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(BuriUserCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BuriUserCB.class.getName(); }
    protected String xCQ() { return BuriUserCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

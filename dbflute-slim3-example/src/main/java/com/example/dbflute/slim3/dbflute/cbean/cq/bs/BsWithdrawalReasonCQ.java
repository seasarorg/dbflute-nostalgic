package com.example.dbflute.slim3.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.slim3.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.slim3.dbflute.cbean.*;
import com.example.dbflute.slim3.dbflute.cbean.cq.*;

/**
 * The base condition-query of WITHDRAWAL_REASON.
 * @author DBFlute(AutoGenerator)
 */
public class BsWithdrawalReasonCQ extends AbstractBsWithdrawalReasonCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WithdrawalReasonCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWithdrawalReasonCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from WITHDRAWAL_REASON) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WithdrawalReasonCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WithdrawalReasonCIQ xcreateCIQ() {
        WithdrawalReasonCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WithdrawalReasonCIQ xnewCIQ() {
        return new WithdrawalReasonCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join WITHDRAWAL_REASON on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WithdrawalReasonCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WithdrawalReasonCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _withdrawalReasonCode;
    public ConditionValue getWithdrawalReasonCode() {
        if (_withdrawalReasonCode == null) { _withdrawalReasonCode = nCV(); }
        return _withdrawalReasonCode;
    }
    protected ConditionValue getCValueWithdrawalReasonCode() { return getWithdrawalReasonCode(); }

    protected Map<String, MemberWithdrawalCQ> _withdrawalReasonCode_ExistsReferrer_MemberWithdrawalListMap;
    public Map<String, MemberWithdrawalCQ> getWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList() { return _withdrawalReasonCode_ExistsReferrer_MemberWithdrawalListMap; }
    public String keepWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList(MemberWithdrawalCQ subQuery) {
        if (_withdrawalReasonCode_ExistsReferrer_MemberWithdrawalListMap == null) { _withdrawalReasonCode_ExistsReferrer_MemberWithdrawalListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_withdrawalReasonCode_ExistsReferrer_MemberWithdrawalListMap.size() + 1);
        _withdrawalReasonCode_ExistsReferrer_MemberWithdrawalListMap.put(key, subQuery); return "withdrawalReasonCode_ExistsReferrer_MemberWithdrawalList." + key;
    }

    protected Map<String, MemberWithdrawalCQ> _withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalListMap;
    public Map<String, MemberWithdrawalCQ> getWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList() { return _withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalListMap; }
    public String keepWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList(MemberWithdrawalCQ subQuery) {
        if (_withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalListMap == null) { _withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalListMap.size() + 1);
        _withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalListMap.put(key, subQuery); return "withdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList." + key;
    }

    protected Map<String, MemberWithdrawalCQ> _withdrawalReasonCode_InScopeRelation_MemberWithdrawalListMap;
    public Map<String, MemberWithdrawalCQ> getWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList() { return _withdrawalReasonCode_InScopeRelation_MemberWithdrawalListMap; }
    public String keepWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList(MemberWithdrawalCQ subQuery) {
        if (_withdrawalReasonCode_InScopeRelation_MemberWithdrawalListMap == null) { _withdrawalReasonCode_InScopeRelation_MemberWithdrawalListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_withdrawalReasonCode_InScopeRelation_MemberWithdrawalListMap.size() + 1);
        _withdrawalReasonCode_InScopeRelation_MemberWithdrawalListMap.put(key, subQuery); return "withdrawalReasonCode_InScopeRelation_MemberWithdrawalList." + key;
    }

    protected Map<String, MemberWithdrawalCQ> _withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalListMap;
    public Map<String, MemberWithdrawalCQ> getWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList() { return _withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalListMap; }
    public String keepWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList(MemberWithdrawalCQ subQuery) {
        if (_withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalListMap == null) { _withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalListMap.size() + 1);
        _withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalListMap.put(key, subQuery); return "withdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList." + key;
    }

    protected Map<String, MemberWithdrawalCQ> _withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalListMap;
    public Map<String, MemberWithdrawalCQ> getWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList() { return _withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalListMap; }
    public String keepWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList(MemberWithdrawalCQ subQuery) {
        if (_withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalListMap == null) { _withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalListMap.size() + 1);
        _withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalListMap.put(key, subQuery); return "withdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList." + key;
    }

    protected Map<String, MemberWithdrawalCQ> _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListMap;
    public Map<String, MemberWithdrawalCQ> getWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList() { return _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListMap; }
    public String keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList(MemberWithdrawalCQ subQuery) {
        if (_withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListMap == null) { _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListMap.size() + 1);
        _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListMap.put(key, subQuery); return "withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList." + key;
    }
    protected Map<String, Object> _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameterMap;
    public Map<String, Object> getWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter() { return _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameterMap; }
    public String keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter(Object parameterValue) {
        if (_withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameterMap == null) { _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameterMap.size() + 1);
        _withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameterMap.put(key, parameterValue); return "withdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_WithdrawalReasonCode_Asc() { regOBA("WITHDRAWAL_REASON_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_WithdrawalReasonCode_Desc() { regOBD("WITHDRAWAL_REASON_CODE"); return this; }

    protected ConditionValue _withdrawalReasonText;
    public ConditionValue getWithdrawalReasonText() {
        if (_withdrawalReasonText == null) { _withdrawalReasonText = nCV(); }
        return _withdrawalReasonText;
    }
    protected ConditionValue getCValueWithdrawalReasonText() { return getWithdrawalReasonText(); }

    /** 
     * Add order-by as ascend. <br />
     * WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_WithdrawalReasonText_Asc() { regOBA("WITHDRAWAL_REASON_TEXT"); return this; }

    /**
     * Add order-by as descend. <br />
     * WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_WithdrawalReasonText_Desc() { regOBD("WITHDRAWAL_REASON_TEXT"); return this; }

    protected ConditionValue _displayOrder;
    public ConditionValue getDisplayOrder() {
        if (_displayOrder == null) { _displayOrder = nCV(); }
        return _displayOrder;
    }
    protected ConditionValue getCValueDisplayOrder() { return getDisplayOrder(); }

    /** 
     * Add order-by as ascend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_DisplayOrder_Asc() { regOBA("DISPLAY_ORDER"); return this; }

    /**
     * Add order-by as descend. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWithdrawalReasonCQ addOrderBy_DisplayOrder_Desc() { regOBD("DISPLAY_ORDER"); return this; }

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
    public BsWithdrawalReasonCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsWithdrawalReasonCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, WithdrawalReasonCQ> _scalarConditionMap;
    public Map<String, WithdrawalReasonCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(WithdrawalReasonCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, WithdrawalReasonCQ> _specifyMyselfDerivedMap;
    public Map<String, WithdrawalReasonCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(WithdrawalReasonCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, WithdrawalReasonCQ> _queryMyselfDerivedMap;
    public Map<String, WithdrawalReasonCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(WithdrawalReasonCQ subQuery) {
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
    protected Map<String, WithdrawalReasonCQ> _myselfExistsMap;
    public Map<String, WithdrawalReasonCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(WithdrawalReasonCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, WithdrawalReasonCQ> _myselfInScopeMap;
    public Map<String, WithdrawalReasonCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(WithdrawalReasonCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WithdrawalReasonCB.class.getName(); }
    protected String xCQ() { return WithdrawalReasonCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

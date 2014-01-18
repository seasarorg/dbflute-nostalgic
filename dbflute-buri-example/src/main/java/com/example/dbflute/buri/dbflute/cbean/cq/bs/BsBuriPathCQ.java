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
 * The base condition-query of BURIPATH.
 * @author DBFlute(AutoGenerator)
 */
public class BsBuriPathCQ extends AbstractBsBuriPathCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriPathCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBuriPathCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BURIPATH) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BuriPathCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BuriPathCIQ xcreateCIQ() {
        BuriPathCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BuriPathCIQ xnewCIQ() {
        return new BuriPathCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BURIPATH on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BuriPathCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BuriPathCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _pathId;
    public ConditionValue getPathId() {
        if (_pathId == null) { _pathId = nCV(); }
        return _pathId;
    }
    protected ConditionValue getCValuePathId() { return getPathId(); }

    protected Map<String, BuriStateCQ> _pathId_ExistsReferrer_BuriStateListMap;
    public Map<String, BuriStateCQ> getPathId_ExistsReferrer_BuriStateList() { return _pathId_ExistsReferrer_BuriStateListMap; }
    public String keepPathId_ExistsReferrer_BuriStateList(BuriStateCQ subQuery) {
        if (_pathId_ExistsReferrer_BuriStateListMap == null) { _pathId_ExistsReferrer_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_pathId_ExistsReferrer_BuriStateListMap.size() + 1);
        _pathId_ExistsReferrer_BuriStateListMap.put(key, subQuery); return "pathId_ExistsReferrer_BuriStateList." + key;
    }

    protected Map<String, BuriBranchCQ> _pathId_ExistsReferrer_BuriBranchListMap;
    public Map<String, BuriBranchCQ> getPathId_ExistsReferrer_BuriBranchList() { return _pathId_ExistsReferrer_BuriBranchListMap; }
    public String keepPathId_ExistsReferrer_BuriBranchList(BuriBranchCQ subQuery) {
        if (_pathId_ExistsReferrer_BuriBranchListMap == null) { _pathId_ExistsReferrer_BuriBranchListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_pathId_ExistsReferrer_BuriBranchListMap.size() + 1);
        _pathId_ExistsReferrer_BuriBranchListMap.put(key, subQuery); return "pathId_ExistsReferrer_BuriBranchList." + key;
    }

    protected Map<String, BuriStateCQ> _pathId_NotExistsReferrer_BuriStateListMap;
    public Map<String, BuriStateCQ> getPathId_NotExistsReferrer_BuriStateList() { return _pathId_NotExistsReferrer_BuriStateListMap; }
    public String keepPathId_NotExistsReferrer_BuriStateList(BuriStateCQ subQuery) {
        if (_pathId_NotExistsReferrer_BuriStateListMap == null) { _pathId_NotExistsReferrer_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_pathId_NotExistsReferrer_BuriStateListMap.size() + 1);
        _pathId_NotExistsReferrer_BuriStateListMap.put(key, subQuery); return "pathId_NotExistsReferrer_BuriStateList." + key;
    }

    protected Map<String, BuriBranchCQ> _pathId_NotExistsReferrer_BuriBranchListMap;
    public Map<String, BuriBranchCQ> getPathId_NotExistsReferrer_BuriBranchList() { return _pathId_NotExistsReferrer_BuriBranchListMap; }
    public String keepPathId_NotExistsReferrer_BuriBranchList(BuriBranchCQ subQuery) {
        if (_pathId_NotExistsReferrer_BuriBranchListMap == null) { _pathId_NotExistsReferrer_BuriBranchListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_pathId_NotExistsReferrer_BuriBranchListMap.size() + 1);
        _pathId_NotExistsReferrer_BuriBranchListMap.put(key, subQuery); return "pathId_NotExistsReferrer_BuriBranchList." + key;
    }

    protected Map<String, BuriStateCQ> _pathId_SpecifyDerivedReferrer_BuriStateListMap;
    public Map<String, BuriStateCQ> getPathId_SpecifyDerivedReferrer_BuriStateList() { return _pathId_SpecifyDerivedReferrer_BuriStateListMap; }
    public String keepPathId_SpecifyDerivedReferrer_BuriStateList(BuriStateCQ subQuery) {
        if (_pathId_SpecifyDerivedReferrer_BuriStateListMap == null) { _pathId_SpecifyDerivedReferrer_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_pathId_SpecifyDerivedReferrer_BuriStateListMap.size() + 1);
        _pathId_SpecifyDerivedReferrer_BuriStateListMap.put(key, subQuery); return "pathId_SpecifyDerivedReferrer_BuriStateList." + key;
    }

    protected Map<String, BuriBranchCQ> _pathId_SpecifyDerivedReferrer_BuriBranchListMap;
    public Map<String, BuriBranchCQ> getPathId_SpecifyDerivedReferrer_BuriBranchList() { return _pathId_SpecifyDerivedReferrer_BuriBranchListMap; }
    public String keepPathId_SpecifyDerivedReferrer_BuriBranchList(BuriBranchCQ subQuery) {
        if (_pathId_SpecifyDerivedReferrer_BuriBranchListMap == null) { _pathId_SpecifyDerivedReferrer_BuriBranchListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_pathId_SpecifyDerivedReferrer_BuriBranchListMap.size() + 1);
        _pathId_SpecifyDerivedReferrer_BuriBranchListMap.put(key, subQuery); return "pathId_SpecifyDerivedReferrer_BuriBranchList." + key;
    }

    protected Map<String, BuriStateCQ> _pathId_InScopeRelation_BuriStateListMap;
    public Map<String, BuriStateCQ> getPathId_InScopeRelation_BuriStateList() { return _pathId_InScopeRelation_BuriStateListMap; }
    public String keepPathId_InScopeRelation_BuriStateList(BuriStateCQ subQuery) {
        if (_pathId_InScopeRelation_BuriStateListMap == null) { _pathId_InScopeRelation_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_pathId_InScopeRelation_BuriStateListMap.size() + 1);
        _pathId_InScopeRelation_BuriStateListMap.put(key, subQuery); return "pathId_InScopeRelation_BuriStateList." + key;
    }

    protected Map<String, BuriBranchCQ> _pathId_InScopeRelation_BuriBranchListMap;
    public Map<String, BuriBranchCQ> getPathId_InScopeRelation_BuriBranchList() { return _pathId_InScopeRelation_BuriBranchListMap; }
    public String keepPathId_InScopeRelation_BuriBranchList(BuriBranchCQ subQuery) {
        if (_pathId_InScopeRelation_BuriBranchListMap == null) { _pathId_InScopeRelation_BuriBranchListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_pathId_InScopeRelation_BuriBranchListMap.size() + 1);
        _pathId_InScopeRelation_BuriBranchListMap.put(key, subQuery); return "pathId_InScopeRelation_BuriBranchList." + key;
    }

    protected Map<String, BuriStateCQ> _pathId_NotInScopeRelation_BuriStateListMap;
    public Map<String, BuriStateCQ> getPathId_NotInScopeRelation_BuriStateList() { return _pathId_NotInScopeRelation_BuriStateListMap; }
    public String keepPathId_NotInScopeRelation_BuriStateList(BuriStateCQ subQuery) {
        if (_pathId_NotInScopeRelation_BuriStateListMap == null) { _pathId_NotInScopeRelation_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_pathId_NotInScopeRelation_BuriStateListMap.size() + 1);
        _pathId_NotInScopeRelation_BuriStateListMap.put(key, subQuery); return "pathId_NotInScopeRelation_BuriStateList." + key;
    }

    protected Map<String, BuriBranchCQ> _pathId_NotInScopeRelation_BuriBranchListMap;
    public Map<String, BuriBranchCQ> getPathId_NotInScopeRelation_BuriBranchList() { return _pathId_NotInScopeRelation_BuriBranchListMap; }
    public String keepPathId_NotInScopeRelation_BuriBranchList(BuriBranchCQ subQuery) {
        if (_pathId_NotInScopeRelation_BuriBranchListMap == null) { _pathId_NotInScopeRelation_BuriBranchListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_pathId_NotInScopeRelation_BuriBranchListMap.size() + 1);
        _pathId_NotInScopeRelation_BuriBranchListMap.put(key, subQuery); return "pathId_NotInScopeRelation_BuriBranchList." + key;
    }

    protected Map<String, BuriStateCQ> _pathId_QueryDerivedReferrer_BuriStateListMap;
    public Map<String, BuriStateCQ> getPathId_QueryDerivedReferrer_BuriStateList() { return _pathId_QueryDerivedReferrer_BuriStateListMap; }
    public String keepPathId_QueryDerivedReferrer_BuriStateList(BuriStateCQ subQuery) {
        if (_pathId_QueryDerivedReferrer_BuriStateListMap == null) { _pathId_QueryDerivedReferrer_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_pathId_QueryDerivedReferrer_BuriStateListMap.size() + 1);
        _pathId_QueryDerivedReferrer_BuriStateListMap.put(key, subQuery); return "pathId_QueryDerivedReferrer_BuriStateList." + key;
    }
    protected Map<String, Object> _pathId_QueryDerivedReferrer_BuriStateListParameterMap;
    public Map<String, Object> getPathId_QueryDerivedReferrer_BuriStateListParameter() { return _pathId_QueryDerivedReferrer_BuriStateListParameterMap; }
    public String keepPathId_QueryDerivedReferrer_BuriStateListParameter(Object parameterValue) {
        if (_pathId_QueryDerivedReferrer_BuriStateListParameterMap == null) { _pathId_QueryDerivedReferrer_BuriStateListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_pathId_QueryDerivedReferrer_BuriStateListParameterMap.size() + 1);
        _pathId_QueryDerivedReferrer_BuriStateListParameterMap.put(key, parameterValue); return "pathId_QueryDerivedReferrer_BuriStateListParameter." + key;
    }

    protected Map<String, BuriBranchCQ> _pathId_QueryDerivedReferrer_BuriBranchListMap;
    public Map<String, BuriBranchCQ> getPathId_QueryDerivedReferrer_BuriBranchList() { return _pathId_QueryDerivedReferrer_BuriBranchListMap; }
    public String keepPathId_QueryDerivedReferrer_BuriBranchList(BuriBranchCQ subQuery) {
        if (_pathId_QueryDerivedReferrer_BuriBranchListMap == null) { _pathId_QueryDerivedReferrer_BuriBranchListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_pathId_QueryDerivedReferrer_BuriBranchListMap.size() + 1);
        _pathId_QueryDerivedReferrer_BuriBranchListMap.put(key, subQuery); return "pathId_QueryDerivedReferrer_BuriBranchList." + key;
    }
    protected Map<String, Object> _pathId_QueryDerivedReferrer_BuriBranchListParameterMap;
    public Map<String, Object> getPathId_QueryDerivedReferrer_BuriBranchListParameter() { return _pathId_QueryDerivedReferrer_BuriBranchListParameterMap; }
    public String keepPathId_QueryDerivedReferrer_BuriBranchListParameter(Object parameterValue) {
        if (_pathId_QueryDerivedReferrer_BuriBranchListParameterMap == null) { _pathId_QueryDerivedReferrer_BuriBranchListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_pathId_QueryDerivedReferrer_BuriBranchListParameterMap.size() + 1);
        _pathId_QueryDerivedReferrer_BuriBranchListParameterMap.put(key, parameterValue); return "pathId_QueryDerivedReferrer_BuriBranchListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * PATHID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriPathCQ addOrderBy_PathId_Asc() { regOBA("PATHID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PATHID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriPathCQ addOrderBy_PathId_Desc() { regOBD("PATHID"); return this; }

    protected ConditionValue _pathName;
    public ConditionValue getPathName() {
        if (_pathName == null) { _pathName = nCV(); }
        return _pathName;
    }
    protected ConditionValue getCValuePathName() { return getPathName(); }

    /** 
     * Add order-by as ascend. <br />
     * PATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriPathCQ addOrderBy_PathName_Asc() { regOBA("PATHNAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriPathCQ addOrderBy_PathName_Desc() { regOBD("PATHNAME"); return this; }

    protected ConditionValue _realPathName;
    public ConditionValue getRealPathName() {
        if (_realPathName == null) { _realPathName = nCV(); }
        return _realPathName;
    }
    protected ConditionValue getCValueRealPathName() { return getRealPathName(); }

    /** 
     * Add order-by as ascend. <br />
     * REALPATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriPathCQ addOrderBy_RealPathName_Asc() { regOBA("REALPATHNAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REALPATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriPathCQ addOrderBy_RealPathName_Desc() { regOBD("REALPATHNAME"); return this; }

    protected ConditionValue _pathType;
    public ConditionValue getPathType() {
        if (_pathType == null) { _pathType = nCV(); }
        return _pathType;
    }
    protected ConditionValue getCValuePathType() { return getPathType(); }

    /** 
     * Add order-by as ascend. <br />
     * PATHTYPE: {IX, NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsBuriPathCQ addOrderBy_PathType_Asc() { regOBA("PATHTYPE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PATHTYPE: {IX, NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsBuriPathCQ addOrderBy_PathType_Desc() { regOBD("PATHTYPE"); return this; }

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
    public BsBuriPathCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsBuriPathCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, BuriPathCQ> _scalarConditionMap;
    public Map<String, BuriPathCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(BuriPathCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, BuriPathCQ> _specifyMyselfDerivedMap;
    public Map<String, BuriPathCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(BuriPathCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, BuriPathCQ> _queryMyselfDerivedMap;
    public Map<String, BuriPathCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(BuriPathCQ subQuery) {
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
    protected Map<String, BuriPathCQ> _myselfExistsMap;
    public Map<String, BuriPathCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(BuriPathCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, BuriPathCQ> _myselfInScopeMap;
    public Map<String, BuriPathCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(BuriPathCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BuriPathCB.class.getName(); }
    protected String xCQ() { return BuriPathCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

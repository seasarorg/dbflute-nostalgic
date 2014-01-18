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
 * The base condition-query of BURIDATAPATHHISTORY.
 * @author DBFlute(AutoGenerator)
 */
public class BsBuriDataPathHistoryCQ extends AbstractBsBuriDataPathHistoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriDataPathHistoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBuriDataPathHistoryCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BURIDATAPATHHISTORY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BuriDataPathHistoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BuriDataPathHistoryCIQ xcreateCIQ() {
        BuriDataPathHistoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BuriDataPathHistoryCIQ xnewCIQ() {
        return new BuriDataPathHistoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BURIDATAPATHHISTORY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BuriDataPathHistoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BuriDataPathHistoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _historyId;
    public ConditionValue getHistoryId() {
        if (_historyId == null) { _historyId = nCV(); }
        return _historyId;
    }
    protected ConditionValue getCValueHistoryId() { return getHistoryId(); }

    /** 
     * Add order-by as ascend. <br />
     * HISTORYID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_HistoryId_Asc() { regOBA("HISTORYID"); return this; }

    /**
     * Add order-by as descend. <br />
     * HISTORYID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_HistoryId_Desc() { regOBD("HISTORYID"); return this; }

    protected ConditionValue _pathId;
    public ConditionValue getPathId() {
        if (_pathId == null) { _pathId = nCV(); }
        return _pathId;
    }
    protected ConditionValue getCValuePathId() { return getPathId(); }

    /** 
     * Add order-by as ascend. <br />
     * PATHID: {IX, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_PathId_Asc() { regOBA("PATHID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PATHID: {IX, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_PathId_Desc() { regOBD("PATHID"); return this; }

    protected ConditionValue _pathName;
    public ConditionValue getPathName() {
        if (_pathName == null) { _pathName = nCV(); }
        return _pathName;
    }
    protected ConditionValue getCValuePathName() { return getPathName(); }

    /** 
     * Add order-by as ascend. <br />
     * PATHNAME: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_PathName_Asc() { regOBA("PATHNAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PATHNAME: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_PathName_Desc() { regOBD("PATHNAME"); return this; }

    protected ConditionValue _dataId;
    public ConditionValue getDataId() {
        if (_dataId == null) { _dataId = nCV(); }
        return _dataId;
    }
    protected ConditionValue getCValueDataId() { return getDataId(); }

    /** 
     * Add order-by as ascend. <br />
     * DATAID: {IX, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_DataId_Asc() { regOBA("DATAID"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATAID: {IX, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_DataId_Desc() { regOBD("DATAID"); return this; }

    protected ConditionValue _action;
    public ConditionValue getAction() {
        if (_action == null) { _action = nCV(); }
        return _action;
    }
    protected ConditionValue getCValueAction() { return getAction(); }

    /** 
     * Add order-by as ascend. <br />
     * ACTION: {VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_Action_Asc() { regOBA("ACTION"); return this; }

    /**
     * Add order-by as descend. <br />
     * ACTION: {VARCHAR2(50)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_Action_Desc() { regOBD("ACTION"); return this; }

    protected ConditionValue _buriUserId;
    public ConditionValue getBuriUserId() {
        if (_buriUserId == null) { _buriUserId = nCV(); }
        return _buriUserId;
    }
    protected ConditionValue getCValueBuriUserId() { return getBuriUserId(); }

    /** 
     * Add order-by as ascend. <br />
     * BURIUSERID: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_BuriUserId_Asc() { regOBA("BURIUSERID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BURIUSERID: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_BuriUserId_Desc() { regOBD("BURIUSERID"); return this; }

    protected ConditionValue _btid;
    public ConditionValue getBtid() {
        if (_btid == null) { _btid = nCV(); }
        return _btid;
    }
    protected ConditionValue getCValueBtid() { return getBtid(); }

    /** 
     * Add order-by as ascend. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_Btid_Asc() { regOBA("BTID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_Btid_Desc() { regOBD("BTID"); return this; }

    protected ConditionValue _insertDate;
    public ConditionValue getInsertDate() {
        if (_insertDate == null) { _insertDate = nCV(); }
        return _insertDate;
    }
    protected ConditionValue getCValueInsertDate() { return getInsertDate(); }

    /** 
     * Add order-by as ascend. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_InsertDate_Asc() { regOBA("INSERTDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriDataPathHistoryCQ addOrderBy_InsertDate_Desc() { regOBD("INSERTDATE"); return this; }

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
    public BsBuriDataPathHistoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsBuriDataPathHistoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, BuriDataPathHistoryCQ> _scalarConditionMap;
    public Map<String, BuriDataPathHistoryCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(BuriDataPathHistoryCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, BuriDataPathHistoryCQ> _specifyMyselfDerivedMap;
    public Map<String, BuriDataPathHistoryCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(BuriDataPathHistoryCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, BuriDataPathHistoryCQ> _queryMyselfDerivedMap;
    public Map<String, BuriDataPathHistoryCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(BuriDataPathHistoryCQ subQuery) {
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
    protected Map<String, BuriDataPathHistoryCQ> _myselfExistsMap;
    public Map<String, BuriDataPathHistoryCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(BuriDataPathHistoryCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, BuriDataPathHistoryCQ> _myselfInScopeMap;
    public Map<String, BuriDataPathHistoryCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(BuriDataPathHistoryCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BuriDataPathHistoryCB.class.getName(); }
    protected String xCQ() { return BuriDataPathHistoryCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

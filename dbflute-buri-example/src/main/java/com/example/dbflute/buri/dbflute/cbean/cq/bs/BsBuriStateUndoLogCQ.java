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
 * The base condition-query of BURISTATEUNDOLOG.
 * @author DBFlute(AutoGenerator)
 */
public class BsBuriStateUndoLogCQ extends AbstractBsBuriStateUndoLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriStateUndoLogCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBuriStateUndoLogCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BURISTATEUNDOLOG) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BuriStateUndoLogCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BuriStateUndoLogCIQ xcreateCIQ() {
        BuriStateUndoLogCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BuriStateUndoLogCIQ xnewCIQ() {
        return new BuriStateUndoLogCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BURISTATEUNDOLOG on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BuriStateUndoLogCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BuriStateUndoLogCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _stateUndoLogId;
    public ConditionValue getStateUndoLogId() {
        if (_stateUndoLogId == null) { _stateUndoLogId = nCV(); }
        return _stateUndoLogId;
    }
    protected ConditionValue getCValueStateUndoLogId() { return getStateUndoLogId(); }

    /** 
     * Add order-by as ascend. <br />
     * STATEUNDOLOGID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_StateUndoLogId_Asc() { regOBA("STATEUNDOLOGID"); return this; }

    /**
     * Add order-by as descend. <br />
     * STATEUNDOLOGID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_StateUndoLogId_Desc() { regOBD("STATEUNDOLOGID"); return this; }

    protected ConditionValue _stateId;
    public ConditionValue getStateId() {
        if (_stateId == null) { _stateId = nCV(); }
        return _stateId;
    }
    protected ConditionValue getCValueStateId() { return getStateId(); }

    /** 
     * Add order-by as ascend. <br />
     * STATEID: {IX, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_StateId_Asc() { regOBA("STATEID"); return this; }

    /**
     * Add order-by as descend. <br />
     * STATEID: {IX, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_StateId_Desc() { regOBD("STATEID"); return this; }

    protected ConditionValue _branchId;
    public ConditionValue getBranchId() {
        if (_branchId == null) { _branchId = nCV(); }
        return _branchId;
    }
    protected ConditionValue getCValueBranchId() { return getBranchId(); }

    /** 
     * Add order-by as ascend. <br />
     * BRANCHID: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_BranchId_Asc() { regOBA("BRANCHID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BRANCHID: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_BranchId_Desc() { regOBD("BRANCHID"); return this; }

    protected ConditionValue _pathId;
    public ConditionValue getPathId() {
        if (_pathId == null) { _pathId = nCV(); }
        return _pathId;
    }
    protected ConditionValue getCValuePathId() { return getPathId(); }

    /** 
     * Add order-by as ascend. <br />
     * PATHID: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_PathId_Asc() { regOBA("PATHID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PATHID: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_PathId_Desc() { regOBD("PATHID"); return this; }

    protected ConditionValue _dataId;
    public ConditionValue getDataId() {
        if (_dataId == null) { _dataId = nCV(); }
        return _dataId;
    }
    protected ConditionValue getCValueDataId() { return getDataId(); }

    /** 
     * Add order-by as ascend. <br />
     * DATAID: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_DataId_Asc() { regOBA("DATAID"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATAID: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_DataId_Desc() { regOBD("DATAID"); return this; }

    protected ConditionValue _userIdVal;
    public ConditionValue getUserIdVal() {
        if (_userIdVal == null) { _userIdVal = nCV(); }
        return _userIdVal;
    }
    protected ConditionValue getCValueUserIdVal() { return getUserIdVal(); }

    /** 
     * Add order-by as ascend. <br />
     * USERIDVAL: {VARCHAR2(20)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_UserIdVal_Asc() { regOBA("USERIDVAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * USERIDVAL: {VARCHAR2(20)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_UserIdVal_Desc() { regOBD("USERIDVAL"); return this; }

    protected ConditionValue _autoRunTime;
    public ConditionValue getAutoRunTime() {
        if (_autoRunTime == null) { _autoRunTime = nCV(); }
        return _autoRunTime;
    }
    protected ConditionValue getCValueAutoRunTime() { return getAutoRunTime(); }

    /** 
     * Add order-by as ascend. <br />
     * AUTORUNTIME: {TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_AutoRunTime_Asc() { regOBA("AUTORUNTIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * AUTORUNTIME: {TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_AutoRunTime_Desc() { regOBD("AUTORUNTIME"); return this; }

    protected ConditionValue _userIdNum;
    public ConditionValue getUserIdNum() {
        if (_userIdNum == null) { _userIdNum = nCV(); }
        return _userIdNum;
    }
    protected ConditionValue getCValueUserIdNum() { return getUserIdNum(); }

    /** 
     * Add order-by as ascend. <br />
     * USERIDNUM: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_UserIdNum_Asc() { regOBA("USERIDNUM"); return this; }

    /**
     * Add order-by as descend. <br />
     * USERIDNUM: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_UserIdNum_Desc() { regOBD("USERIDNUM"); return this; }

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
    public BsBuriStateUndoLogCQ addOrderBy_InsertDate_Asc() { regOBA("INSERTDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_InsertDate_Desc() { regOBD("INSERTDATE"); return this; }

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
    public BsBuriStateUndoLogCQ addOrderBy_Btid_Asc() { regOBA("BTID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_Btid_Desc() { regOBD("BTID"); return this; }

    protected ConditionValue _processDate;
    public ConditionValue getProcessDate() {
        if (_processDate == null) { _processDate = nCV(); }
        return _processDate;
    }
    protected ConditionValue getCValueProcessDate() { return getProcessDate(); }

    /** 
     * Add order-by as ascend. <br />
     * PROCESSDATE: {TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_ProcessDate_Asc() { regOBA("PROCESSDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PROCESSDATE: {TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_ProcessDate_Desc() { regOBD("PROCESSDATE"); return this; }

    protected ConditionValue _abortDate;
    public ConditionValue getAbortDate() {
        if (_abortDate == null) { _abortDate = nCV(); }
        return _abortDate;
    }
    protected ConditionValue getCValueAbortDate() { return getAbortDate(); }

    /** 
     * Add order-by as ascend. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_AbortDate_Asc() { regOBA("ABORTDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_AbortDate_Desc() { regOBD("ABORTDATE"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo() {
        if (_versionNo == null) { _versionNo = nCV(); }
        return _versionNo;
    }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * VERSIONNO: {NotNull, NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_VersionNo_Asc() { regOBA("VERSIONNO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSIONNO: {NotNull, NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_VersionNo_Desc() { regOBD("VERSIONNO"); return this; }

    protected ConditionValue _createBtid;
    public ConditionValue getCreateBtid() {
        if (_createBtid == null) { _createBtid = nCV(); }
        return _createBtid;
    }
    protected ConditionValue getCValueCreateBtid() { return getCreateBtid(); }

    /** 
     * Add order-by as ascend. <br />
     * CREATEBTID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_CreateBtid_Asc() { regOBA("CREATEBTID"); return this; }

    /**
     * Add order-by as descend. <br />
     * CREATEBTID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUndoLogCQ addOrderBy_CreateBtid_Desc() { regOBD("CREATEBTID"); return this; }

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
    public BsBuriStateUndoLogCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsBuriStateUndoLogCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, BuriStateUndoLogCQ> _scalarConditionMap;
    public Map<String, BuriStateUndoLogCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(BuriStateUndoLogCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, BuriStateUndoLogCQ> _specifyMyselfDerivedMap;
    public Map<String, BuriStateUndoLogCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(BuriStateUndoLogCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, BuriStateUndoLogCQ> _queryMyselfDerivedMap;
    public Map<String, BuriStateUndoLogCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(BuriStateUndoLogCQ subQuery) {
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
    protected Map<String, BuriStateUndoLogCQ> _myselfExistsMap;
    public Map<String, BuriStateUndoLogCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(BuriStateUndoLogCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, BuriStateUndoLogCQ> _myselfInScopeMap;
    public Map<String, BuriStateUndoLogCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(BuriStateUndoLogCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BuriStateUndoLogCB.class.getName(); }
    protected String xCQ() { return BuriStateUndoLogCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

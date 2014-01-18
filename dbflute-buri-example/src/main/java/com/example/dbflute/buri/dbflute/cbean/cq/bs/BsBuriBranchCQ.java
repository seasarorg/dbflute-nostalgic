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
 * The base condition-query of BURIBRANCH.
 * @author DBFlute(AutoGenerator)
 */
public class BsBuriBranchCQ extends AbstractBsBuriBranchCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriBranchCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBuriBranchCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BURIBRANCH) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BuriBranchCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BuriBranchCIQ xcreateCIQ() {
        BuriBranchCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BuriBranchCIQ xnewCIQ() {
        return new BuriBranchCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BURIBRANCH on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BuriBranchCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BuriBranchCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _branchId;
    public ConditionValue getBranchId() {
        if (_branchId == null) { _branchId = nCV(); }
        return _branchId;
    }
    protected ConditionValue getCValueBranchId() { return getBranchId(); }

    protected Map<String, BuriStateCQ> _branchId_ExistsReferrer_BuriStateListMap;
    public Map<String, BuriStateCQ> getBranchId_ExistsReferrer_BuriStateList() { return _branchId_ExistsReferrer_BuriStateListMap; }
    public String keepBranchId_ExistsReferrer_BuriStateList(BuriStateCQ subQuery) {
        if (_branchId_ExistsReferrer_BuriStateListMap == null) { _branchId_ExistsReferrer_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_branchId_ExistsReferrer_BuriStateListMap.size() + 1);
        _branchId_ExistsReferrer_BuriStateListMap.put(key, subQuery); return "branchId_ExistsReferrer_BuriStateList." + key;
    }

    protected Map<String, BuriStateCQ> _branchId_NotExistsReferrer_BuriStateListMap;
    public Map<String, BuriStateCQ> getBranchId_NotExistsReferrer_BuriStateList() { return _branchId_NotExistsReferrer_BuriStateListMap; }
    public String keepBranchId_NotExistsReferrer_BuriStateList(BuriStateCQ subQuery) {
        if (_branchId_NotExistsReferrer_BuriStateListMap == null) { _branchId_NotExistsReferrer_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_branchId_NotExistsReferrer_BuriStateListMap.size() + 1);
        _branchId_NotExistsReferrer_BuriStateListMap.put(key, subQuery); return "branchId_NotExistsReferrer_BuriStateList." + key;
    }

    protected Map<String, BuriStateCQ> _branchId_SpecifyDerivedReferrer_BuriStateListMap;
    public Map<String, BuriStateCQ> getBranchId_SpecifyDerivedReferrer_BuriStateList() { return _branchId_SpecifyDerivedReferrer_BuriStateListMap; }
    public String keepBranchId_SpecifyDerivedReferrer_BuriStateList(BuriStateCQ subQuery) {
        if (_branchId_SpecifyDerivedReferrer_BuriStateListMap == null) { _branchId_SpecifyDerivedReferrer_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_branchId_SpecifyDerivedReferrer_BuriStateListMap.size() + 1);
        _branchId_SpecifyDerivedReferrer_BuriStateListMap.put(key, subQuery); return "branchId_SpecifyDerivedReferrer_BuriStateList." + key;
    }

    protected Map<String, BuriStateCQ> _branchId_InScopeRelation_BuriStateListMap;
    public Map<String, BuriStateCQ> getBranchId_InScopeRelation_BuriStateList() { return _branchId_InScopeRelation_BuriStateListMap; }
    public String keepBranchId_InScopeRelation_BuriStateList(BuriStateCQ subQuery) {
        if (_branchId_InScopeRelation_BuriStateListMap == null) { _branchId_InScopeRelation_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_branchId_InScopeRelation_BuriStateListMap.size() + 1);
        _branchId_InScopeRelation_BuriStateListMap.put(key, subQuery); return "branchId_InScopeRelation_BuriStateList." + key;
    }

    protected Map<String, BuriStateCQ> _branchId_NotInScopeRelation_BuriStateListMap;
    public Map<String, BuriStateCQ> getBranchId_NotInScopeRelation_BuriStateList() { return _branchId_NotInScopeRelation_BuriStateListMap; }
    public String keepBranchId_NotInScopeRelation_BuriStateList(BuriStateCQ subQuery) {
        if (_branchId_NotInScopeRelation_BuriStateListMap == null) { _branchId_NotInScopeRelation_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_branchId_NotInScopeRelation_BuriStateListMap.size() + 1);
        _branchId_NotInScopeRelation_BuriStateListMap.put(key, subQuery); return "branchId_NotInScopeRelation_BuriStateList." + key;
    }

    protected Map<String, BuriStateCQ> _branchId_QueryDerivedReferrer_BuriStateListMap;
    public Map<String, BuriStateCQ> getBranchId_QueryDerivedReferrer_BuriStateList() { return _branchId_QueryDerivedReferrer_BuriStateListMap; }
    public String keepBranchId_QueryDerivedReferrer_BuriStateList(BuriStateCQ subQuery) {
        if (_branchId_QueryDerivedReferrer_BuriStateListMap == null) { _branchId_QueryDerivedReferrer_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_branchId_QueryDerivedReferrer_BuriStateListMap.size() + 1);
        _branchId_QueryDerivedReferrer_BuriStateListMap.put(key, subQuery); return "branchId_QueryDerivedReferrer_BuriStateList." + key;
    }
    protected Map<String, Object> _branchId_QueryDerivedReferrer_BuriStateListParameterMap;
    public Map<String, Object> getBranchId_QueryDerivedReferrer_BuriStateListParameter() { return _branchId_QueryDerivedReferrer_BuriStateListParameterMap; }
    public String keepBranchId_QueryDerivedReferrer_BuriStateListParameter(Object parameterValue) {
        if (_branchId_QueryDerivedReferrer_BuriStateListParameterMap == null) { _branchId_QueryDerivedReferrer_BuriStateListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_branchId_QueryDerivedReferrer_BuriStateListParameterMap.size() + 1);
        _branchId_QueryDerivedReferrer_BuriStateListParameterMap.put(key, parameterValue); return "branchId_QueryDerivedReferrer_BuriStateListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * BRANCHID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriBranchCQ addOrderBy_BranchId_Asc() { regOBA("BRANCHID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BRANCHID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriBranchCQ addOrderBy_BranchId_Desc() { regOBD("BRANCHID"); return this; }

    protected ConditionValue _parentBranchId;
    public ConditionValue getParentBranchId() {
        if (_parentBranchId == null) { _parentBranchId = nCV(); }
        return _parentBranchId;
    }
    protected ConditionValue getCValueParentBranchId() { return getParentBranchId(); }

    /** 
     * Add order-by as ascend. <br />
     * PARENTBRANCHID: {IX, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriBranchCQ addOrderBy_ParentBranchId_Asc() { regOBA("PARENTBRANCHID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PARENTBRANCHID: {IX, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriBranchCQ addOrderBy_ParentBranchId_Desc() { regOBD("PARENTBRANCHID"); return this; }

    protected ConditionValue _pathId;
    public ConditionValue getPathId() {
        if (_pathId == null) { _pathId = nCV(); }
        return _pathId;
    }
    protected ConditionValue getCValuePathId() { return getPathId(); }

    protected Map<String, BuriPathCQ> _pathId_InScopeRelation_BuriPathMap;
    public Map<String, BuriPathCQ> getPathId_InScopeRelation_BuriPath() { return _pathId_InScopeRelation_BuriPathMap; }
    public String keepPathId_InScopeRelation_BuriPath(BuriPathCQ subQuery) {
        if (_pathId_InScopeRelation_BuriPathMap == null) { _pathId_InScopeRelation_BuriPathMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_pathId_InScopeRelation_BuriPathMap.size() + 1);
        _pathId_InScopeRelation_BuriPathMap.put(key, subQuery); return "pathId_InScopeRelation_BuriPath." + key;
    }

    protected Map<String, BuriPathCQ> _pathId_NotInScopeRelation_BuriPathMap;
    public Map<String, BuriPathCQ> getPathId_NotInScopeRelation_BuriPath() { return _pathId_NotInScopeRelation_BuriPathMap; }
    public String keepPathId_NotInScopeRelation_BuriPath(BuriPathCQ subQuery) {
        if (_pathId_NotInScopeRelation_BuriPathMap == null) { _pathId_NotInScopeRelation_BuriPathMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_pathId_NotInScopeRelation_BuriPathMap.size() + 1);
        _pathId_NotInScopeRelation_BuriPathMap.put(key, subQuery); return "pathId_NotInScopeRelation_BuriPath." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * PATHID: {IX, NUMBER(18), FK to BURIPATH}
     * @return this. (NotNull)
     */
    public BsBuriBranchCQ addOrderBy_PathId_Asc() { regOBA("PATHID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PATHID: {IX, NUMBER(18), FK to BURIPATH}
     * @return this. (NotNull)
     */
    public BsBuriBranchCQ addOrderBy_PathId_Desc() { regOBD("PATHID"); return this; }

    protected ConditionValue _dataId;
    public ConditionValue getDataId() {
        if (_dataId == null) { _dataId = nCV(); }
        return _dataId;
    }
    protected ConditionValue getCValueDataId() { return getDataId(); }

    protected Map<String, BuriDataCQ> _dataId_InScopeRelation_BuriDataMap;
    public Map<String, BuriDataCQ> getDataId_InScopeRelation_BuriData() { return _dataId_InScopeRelation_BuriDataMap; }
    public String keepDataId_InScopeRelation_BuriData(BuriDataCQ subQuery) {
        if (_dataId_InScopeRelation_BuriDataMap == null) { _dataId_InScopeRelation_BuriDataMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_dataId_InScopeRelation_BuriDataMap.size() + 1);
        _dataId_InScopeRelation_BuriDataMap.put(key, subQuery); return "dataId_InScopeRelation_BuriData." + key;
    }

    protected Map<String, BuriDataCQ> _dataId_NotInScopeRelation_BuriDataMap;
    public Map<String, BuriDataCQ> getDataId_NotInScopeRelation_BuriData() { return _dataId_NotInScopeRelation_BuriDataMap; }
    public String keepDataId_NotInScopeRelation_BuriData(BuriDataCQ subQuery) {
        if (_dataId_NotInScopeRelation_BuriDataMap == null) { _dataId_NotInScopeRelation_BuriDataMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_dataId_NotInScopeRelation_BuriDataMap.size() + 1);
        _dataId_NotInScopeRelation_BuriDataMap.put(key, subQuery); return "dataId_NotInScopeRelation_BuriData." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * DATAID: {IX, NUMBER(18), FK to BURIDATA}
     * @return this. (NotNull)
     */
    public BsBuriBranchCQ addOrderBy_DataId_Asc() { regOBA("DATAID"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATAID: {IX, NUMBER(18), FK to BURIDATA}
     * @return this. (NotNull)
     */
    public BsBuriBranchCQ addOrderBy_DataId_Desc() { regOBD("DATAID"); return this; }

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
    public BsBuriBranchCQ addOrderBy_ProcessDate_Asc() { regOBA("PROCESSDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PROCESSDATE: {TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriBranchCQ addOrderBy_ProcessDate_Desc() { regOBD("PROCESSDATE"); return this; }

    protected ConditionValue _btid;
    public ConditionValue getBtid() {
        if (_btid == null) { _btid = nCV(); }
        return _btid;
    }
    protected ConditionValue getCValueBtid() { return getBtid(); }

    /** 
     * Add order-by as ascend. <br />
     * BTID: {NotNull, NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsBuriBranchCQ addOrderBy_Btid_Asc() { regOBA("BTID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BTID: {NotNull, NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsBuriBranchCQ addOrderBy_Btid_Desc() { regOBD("BTID"); return this; }

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
    public BsBuriBranchCQ addOrderBy_VersionNo_Asc() { regOBA("VERSIONNO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSIONNO: {NotNull, NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsBuriBranchCQ addOrderBy_VersionNo_Desc() { regOBD("VERSIONNO"); return this; }

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
    public BsBuriBranchCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsBuriBranchCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        BuriBranchCQ baseQuery = (BuriBranchCQ)baseQueryAsSuper;
        BuriBranchCQ unionQuery = (BuriBranchCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryBuriData()) {
            unionQuery.queryBuriData().reflectRelationOnUnionQuery(baseQuery.queryBuriData(), unionQuery.queryBuriData());
        }
        if (baseQuery.hasConditionQueryBuriPath()) {
            unionQuery.queryBuriPath().reflectRelationOnUnionQuery(baseQuery.queryBuriPath(), unionQuery.queryBuriPath());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * BURIDATA by my DATAID, named 'buriData'.
     * @return The instance of condition-query. (NotNull)
     */
    public BuriDataCQ queryBuriData() {
        return getConditionQueryBuriData();
    }
    protected BuriDataCQ _conditionQueryBuriData;
    public BuriDataCQ getConditionQueryBuriData() {
        if (_conditionQueryBuriData == null) {
            _conditionQueryBuriData = xcreateQueryBuriData();
            xsetupOuterJoinBuriData();
        }
        return _conditionQueryBuriData;
    }
    protected BuriDataCQ xcreateQueryBuriData() {
        String nrp = resolveNextRelationPath("BURIBRANCH", "buriData");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        BuriDataCQ cq = new BuriDataCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("buriData");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinBuriData() {
        BuriDataCQ cq = getConditionQueryBuriData();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("DATAID", "DATAID");
        registerOuterJoin(cq, joinOnMap, "buriData");
    }
    public boolean hasConditionQueryBuriData() {
        return _conditionQueryBuriData != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * BURIPATH by my PATHID, named 'buriPath'.
     * @return The instance of condition-query. (NotNull)
     */
    public BuriPathCQ queryBuriPath() {
        return getConditionQueryBuriPath();
    }
    protected BuriPathCQ _conditionQueryBuriPath;
    public BuriPathCQ getConditionQueryBuriPath() {
        if (_conditionQueryBuriPath == null) {
            _conditionQueryBuriPath = xcreateQueryBuriPath();
            xsetupOuterJoinBuriPath();
        }
        return _conditionQueryBuriPath;
    }
    protected BuriPathCQ xcreateQueryBuriPath() {
        String nrp = resolveNextRelationPath("BURIBRANCH", "buriPath");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        BuriPathCQ cq = new BuriPathCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("buriPath");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinBuriPath() {
        BuriPathCQ cq = getConditionQueryBuriPath();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("PATHID", "PATHID");
        registerOuterJoin(cq, joinOnMap, "buriPath");
    }
    public boolean hasConditionQueryBuriPath() {
        return _conditionQueryBuriPath != null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, BuriBranchCQ> _scalarConditionMap;
    public Map<String, BuriBranchCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(BuriBranchCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, BuriBranchCQ> _specifyMyselfDerivedMap;
    public Map<String, BuriBranchCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(BuriBranchCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, BuriBranchCQ> _queryMyselfDerivedMap;
    public Map<String, BuriBranchCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(BuriBranchCQ subQuery) {
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
    protected Map<String, BuriBranchCQ> _myselfExistsMap;
    public Map<String, BuriBranchCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(BuriBranchCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, BuriBranchCQ> _myselfInScopeMap;
    public Map<String, BuriBranchCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(BuriBranchCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BuriBranchCB.class.getName(); }
    protected String xCQ() { return BuriBranchCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

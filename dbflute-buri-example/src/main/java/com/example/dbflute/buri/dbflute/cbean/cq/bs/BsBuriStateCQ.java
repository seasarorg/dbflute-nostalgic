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
 * The base condition-query of BURISTATE.
 * @author DBFlute(AutoGenerator)
 */
public class BsBuriStateCQ extends AbstractBsBuriStateCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriStateCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBuriStateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BURISTATE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BuriStateCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BuriStateCIQ xcreateCIQ() {
        BuriStateCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BuriStateCIQ xnewCIQ() {
        return new BuriStateCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BURISTATE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BuriStateCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BuriStateCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _stateId;
    public ConditionValue getStateId() {
        if (_stateId == null) { _stateId = nCV(); }
        return _stateId;
    }
    protected ConditionValue getCValueStateId() { return getStateId(); }

    protected Map<String, BuriStateUserCQ> _stateId_ExistsReferrer_BuriStateUserListMap;
    public Map<String, BuriStateUserCQ> getStateId_ExistsReferrer_BuriStateUserList() { return _stateId_ExistsReferrer_BuriStateUserListMap; }
    public String keepStateId_ExistsReferrer_BuriStateUserList(BuriStateUserCQ subQuery) {
        if (_stateId_ExistsReferrer_BuriStateUserListMap == null) { _stateId_ExistsReferrer_BuriStateUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_stateId_ExistsReferrer_BuriStateUserListMap.size() + 1);
        _stateId_ExistsReferrer_BuriStateUserListMap.put(key, subQuery); return "stateId_ExistsReferrer_BuriStateUserList." + key;
    }

    protected Map<String, BuriStateUserCQ> _stateId_NotExistsReferrer_BuriStateUserListMap;
    public Map<String, BuriStateUserCQ> getStateId_NotExistsReferrer_BuriStateUserList() { return _stateId_NotExistsReferrer_BuriStateUserListMap; }
    public String keepStateId_NotExistsReferrer_BuriStateUserList(BuriStateUserCQ subQuery) {
        if (_stateId_NotExistsReferrer_BuriStateUserListMap == null) { _stateId_NotExistsReferrer_BuriStateUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_stateId_NotExistsReferrer_BuriStateUserListMap.size() + 1);
        _stateId_NotExistsReferrer_BuriStateUserListMap.put(key, subQuery); return "stateId_NotExistsReferrer_BuriStateUserList." + key;
    }

    protected Map<String, BuriStateUserCQ> _stateId_SpecifyDerivedReferrer_BuriStateUserListMap;
    public Map<String, BuriStateUserCQ> getStateId_SpecifyDerivedReferrer_BuriStateUserList() { return _stateId_SpecifyDerivedReferrer_BuriStateUserListMap; }
    public String keepStateId_SpecifyDerivedReferrer_BuriStateUserList(BuriStateUserCQ subQuery) {
        if (_stateId_SpecifyDerivedReferrer_BuriStateUserListMap == null) { _stateId_SpecifyDerivedReferrer_BuriStateUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_stateId_SpecifyDerivedReferrer_BuriStateUserListMap.size() + 1);
        _stateId_SpecifyDerivedReferrer_BuriStateUserListMap.put(key, subQuery); return "stateId_SpecifyDerivedReferrer_BuriStateUserList." + key;
    }

    protected Map<String, BuriStateUserCQ> _stateId_InScopeRelation_BuriStateUserListMap;
    public Map<String, BuriStateUserCQ> getStateId_InScopeRelation_BuriStateUserList() { return _stateId_InScopeRelation_BuriStateUserListMap; }
    public String keepStateId_InScopeRelation_BuriStateUserList(BuriStateUserCQ subQuery) {
        if (_stateId_InScopeRelation_BuriStateUserListMap == null) { _stateId_InScopeRelation_BuriStateUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_stateId_InScopeRelation_BuriStateUserListMap.size() + 1);
        _stateId_InScopeRelation_BuriStateUserListMap.put(key, subQuery); return "stateId_InScopeRelation_BuriStateUserList." + key;
    }

    protected Map<String, BuriStateUserCQ> _stateId_NotInScopeRelation_BuriStateUserListMap;
    public Map<String, BuriStateUserCQ> getStateId_NotInScopeRelation_BuriStateUserList() { return _stateId_NotInScopeRelation_BuriStateUserListMap; }
    public String keepStateId_NotInScopeRelation_BuriStateUserList(BuriStateUserCQ subQuery) {
        if (_stateId_NotInScopeRelation_BuriStateUserListMap == null) { _stateId_NotInScopeRelation_BuriStateUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_stateId_NotInScopeRelation_BuriStateUserListMap.size() + 1);
        _stateId_NotInScopeRelation_BuriStateUserListMap.put(key, subQuery); return "stateId_NotInScopeRelation_BuriStateUserList." + key;
    }

    protected Map<String, BuriStateUserCQ> _stateId_QueryDerivedReferrer_BuriStateUserListMap;
    public Map<String, BuriStateUserCQ> getStateId_QueryDerivedReferrer_BuriStateUserList() { return _stateId_QueryDerivedReferrer_BuriStateUserListMap; }
    public String keepStateId_QueryDerivedReferrer_BuriStateUserList(BuriStateUserCQ subQuery) {
        if (_stateId_QueryDerivedReferrer_BuriStateUserListMap == null) { _stateId_QueryDerivedReferrer_BuriStateUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_stateId_QueryDerivedReferrer_BuriStateUserListMap.size() + 1);
        _stateId_QueryDerivedReferrer_BuriStateUserListMap.put(key, subQuery); return "stateId_QueryDerivedReferrer_BuriStateUserList." + key;
    }
    protected Map<String, Object> _stateId_QueryDerivedReferrer_BuriStateUserListParameterMap;
    public Map<String, Object> getStateId_QueryDerivedReferrer_BuriStateUserListParameter() { return _stateId_QueryDerivedReferrer_BuriStateUserListParameterMap; }
    public String keepStateId_QueryDerivedReferrer_BuriStateUserListParameter(Object parameterValue) {
        if (_stateId_QueryDerivedReferrer_BuriStateUserListParameterMap == null) { _stateId_QueryDerivedReferrer_BuriStateUserListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_stateId_QueryDerivedReferrer_BuriStateUserListParameterMap.size() + 1);
        _stateId_QueryDerivedReferrer_BuriStateUserListParameterMap.put(key, parameterValue); return "stateId_QueryDerivedReferrer_BuriStateUserListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * STATEID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_StateId_Asc() { regOBA("STATEID"); return this; }

    /**
     * Add order-by as descend. <br />
     * STATEID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_StateId_Desc() { regOBD("STATEID"); return this; }

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
    public BsBuriStateCQ addOrderBy_PathId_Asc() { regOBA("PATHID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PATHID: {IX, NUMBER(18), FK to BURIPATH}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_PathId_Desc() { regOBD("PATHID"); return this; }

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
    public BsBuriStateCQ addOrderBy_DataId_Asc() { regOBA("DATAID"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATAID: {IX, NUMBER(18), FK to BURIDATA}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_DataId_Desc() { regOBD("DATAID"); return this; }

    protected ConditionValue _branchId;
    public ConditionValue getBranchId() {
        if (_branchId == null) { _branchId = nCV(); }
        return _branchId;
    }
    protected ConditionValue getCValueBranchId() { return getBranchId(); }

    protected Map<String, BuriBranchCQ> _branchId_InScopeRelation_BuriBranchMap;
    public Map<String, BuriBranchCQ> getBranchId_InScopeRelation_BuriBranch() { return _branchId_InScopeRelation_BuriBranchMap; }
    public String keepBranchId_InScopeRelation_BuriBranch(BuriBranchCQ subQuery) {
        if (_branchId_InScopeRelation_BuriBranchMap == null) { _branchId_InScopeRelation_BuriBranchMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_branchId_InScopeRelation_BuriBranchMap.size() + 1);
        _branchId_InScopeRelation_BuriBranchMap.put(key, subQuery); return "branchId_InScopeRelation_BuriBranch." + key;
    }

    protected Map<String, BuriBranchCQ> _branchId_NotInScopeRelation_BuriBranchMap;
    public Map<String, BuriBranchCQ> getBranchId_NotInScopeRelation_BuriBranch() { return _branchId_NotInScopeRelation_BuriBranchMap; }
    public String keepBranchId_NotInScopeRelation_BuriBranch(BuriBranchCQ subQuery) {
        if (_branchId_NotInScopeRelation_BuriBranchMap == null) { _branchId_NotInScopeRelation_BuriBranchMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_branchId_NotInScopeRelation_BuriBranchMap.size() + 1);
        _branchId_NotInScopeRelation_BuriBranchMap.put(key, subQuery); return "branchId_NotInScopeRelation_BuriBranch." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_BranchId_Asc() { regOBA("BRANCHID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_BranchId_Desc() { regOBD("BRANCHID"); return this; }

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
    public BsBuriStateCQ addOrderBy_UserIdVal_Asc() { regOBA("USERIDVAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * USERIDVAL: {VARCHAR2(20)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_UserIdVal_Desc() { regOBD("USERIDVAL"); return this; }

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
    public BsBuriStateCQ addOrderBy_UserIdNum_Asc() { regOBA("USERIDNUM"); return this; }

    /**
     * Add order-by as descend. <br />
     * USERIDNUM: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_UserIdNum_Desc() { regOBD("USERIDNUM"); return this; }

    protected ConditionValue _participantName;
    public ConditionValue getParticipantName() {
        if (_participantName == null) { _participantName = nCV(); }
        return _participantName;
    }
    protected ConditionValue getCValueParticipantName() { return getParticipantName(); }

    /** 
     * Add order-by as ascend. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_ParticipantName_Asc() { regOBA("PARTICIPANTNAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_ParticipantName_Desc() { regOBD("PARTICIPANTNAME"); return this; }

    protected ConditionValue _participantType;
    public ConditionValue getParticipantType() {
        if (_participantType == null) { _participantType = nCV(); }
        return _participantType;
    }
    protected ConditionValue getCValueParticipantType() { return getParticipantType(); }

    /** 
     * Add order-by as ascend. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_ParticipantType_Asc() { regOBA("PARTICIPANTTYPE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_ParticipantType_Desc() { regOBD("PARTICIPANTTYPE"); return this; }

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
    public BsBuriStateCQ addOrderBy_Btid_Asc() { regOBA("BTID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_Btid_Desc() { regOBD("BTID"); return this; }

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
    public BsBuriStateCQ addOrderBy_InsertDate_Asc() { regOBA("INSERTDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_InsertDate_Desc() { regOBD("INSERTDATE"); return this; }

    protected ConditionValue _autoRunTime;
    public ConditionValue getAutoRunTime() {
        if (_autoRunTime == null) { _autoRunTime = nCV(); }
        return _autoRunTime;
    }
    protected ConditionValue getCValueAutoRunTime() { return getAutoRunTime(); }

    /** 
     * Add order-by as ascend. <br />
     * AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_AutoRunTime_Asc() { regOBA("AUTORUNTIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_AutoRunTime_Desc() { regOBD("AUTORUNTIME"); return this; }

    protected ConditionValue _processDate;
    public ConditionValue getProcessDate() {
        if (_processDate == null) { _processDate = nCV(); }
        return _processDate;
    }
    protected ConditionValue getCValueProcessDate() { return getProcessDate(); }

    /** 
     * Add order-by as ascend. <br />
     * PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_ProcessDate_Asc() { regOBA("PROCESSDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_ProcessDate_Desc() { regOBD("PROCESSDATE"); return this; }

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
    public BsBuriStateCQ addOrderBy_AbortDate_Asc() { regOBA("ABORTDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_AbortDate_Desc() { regOBD("ABORTDATE"); return this; }

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
    public BsBuriStateCQ addOrderBy_VersionNo_Asc() { regOBA("VERSIONNO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSIONNO: {NotNull, NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsBuriStateCQ addOrderBy_VersionNo_Desc() { regOBD("VERSIONNO"); return this; }

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
    public BsBuriStateCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsBuriStateCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        BuriStateCQ baseQuery = (BuriStateCQ)baseQueryAsSuper;
        BuriStateCQ unionQuery = (BuriStateCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryBuriPath()) {
            unionQuery.queryBuriPath().reflectRelationOnUnionQuery(baseQuery.queryBuriPath(), unionQuery.queryBuriPath());
        }
        if (baseQuery.hasConditionQueryBuriData()) {
            unionQuery.queryBuriData().reflectRelationOnUnionQuery(baseQuery.queryBuriData(), unionQuery.queryBuriData());
        }
        if (baseQuery.hasConditionQueryBuriBranch()) {
            unionQuery.queryBuriBranch().reflectRelationOnUnionQuery(baseQuery.queryBuriBranch(), unionQuery.queryBuriBranch());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = resolveNextRelationPath("BURISTATE", "buriPath");
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
        String nrp = resolveNextRelationPath("BURISTATE", "buriData");
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
     * BURIBRANCH by my BRANCHID, named 'buriBranch'.
     * @return The instance of condition-query. (NotNull)
     */
    public BuriBranchCQ queryBuriBranch() {
        return getConditionQueryBuriBranch();
    }
    protected BuriBranchCQ _conditionQueryBuriBranch;
    public BuriBranchCQ getConditionQueryBuriBranch() {
        if (_conditionQueryBuriBranch == null) {
            _conditionQueryBuriBranch = xcreateQueryBuriBranch();
            xsetupOuterJoinBuriBranch();
        }
        return _conditionQueryBuriBranch;
    }
    protected BuriBranchCQ xcreateQueryBuriBranch() {
        String nrp = resolveNextRelationPath("BURISTATE", "buriBranch");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        BuriBranchCQ cq = new BuriBranchCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("buriBranch");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinBuriBranch() {
        BuriBranchCQ cq = getConditionQueryBuriBranch();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("BRANCHID", "BRANCHID");
        registerOuterJoin(cq, joinOnMap, "buriBranch");
    }
    public boolean hasConditionQueryBuriBranch() {
        return _conditionQueryBuriBranch != null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, BuriStateCQ> _scalarConditionMap;
    public Map<String, BuriStateCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(BuriStateCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, BuriStateCQ> _specifyMyselfDerivedMap;
    public Map<String, BuriStateCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(BuriStateCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, BuriStateCQ> _queryMyselfDerivedMap;
    public Map<String, BuriStateCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(BuriStateCQ subQuery) {
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
    protected Map<String, BuriStateCQ> _myselfExistsMap;
    public Map<String, BuriStateCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(BuriStateCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, BuriStateCQ> _myselfInScopeMap;
    public Map<String, BuriStateCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(BuriStateCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BuriStateCB.class.getName(); }
    protected String xCQ() { return BuriStateCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

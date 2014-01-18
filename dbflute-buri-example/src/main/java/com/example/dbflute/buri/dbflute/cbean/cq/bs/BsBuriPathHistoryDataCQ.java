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
 * The base condition-query of BURIPATHHISTORYDATA.
 * @author DBFlute(AutoGenerator)
 */
public class BsBuriPathHistoryDataCQ extends AbstractBsBuriPathHistoryDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriPathHistoryDataCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBuriPathHistoryDataCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BURIPATHHISTORYDATA) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BuriPathHistoryDataCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BuriPathHistoryDataCIQ xcreateCIQ() {
        BuriPathHistoryDataCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BuriPathHistoryDataCIQ xnewCIQ() {
        return new BuriPathHistoryDataCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BURIPATHHISTORYDATA on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BuriPathHistoryDataCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BuriPathHistoryDataCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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

    /** 
     * Add order-by as ascend. <br />
     * PATHID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_PathId_Asc() { regOBA("PATHID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PATHID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_PathId_Desc() { regOBD("PATHID"); return this; }

    protected ConditionValue _pathName;
    public ConditionValue getPathName() {
        if (_pathName == null) { _pathName = nCV(); }
        return _pathName;
    }
    protected ConditionValue getCValuePathName() { return getPathName(); }

    /** 
     * Add order-by as ascend. <br />
     * PATHNAME: {NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_PathName_Asc() { regOBA("PATHNAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PATHNAME: {NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_PathName_Desc() { regOBD("PATHNAME"); return this; }

    protected ConditionValue _realPathName;
    public ConditionValue getRealPathName() {
        if (_realPathName == null) { _realPathName = nCV(); }
        return _realPathName;
    }
    protected ConditionValue getCValueRealPathName() { return getRealPathName(); }

    /** 
     * Add order-by as ascend. <br />
     * REALPATHNAME: {NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_RealPathName_Asc() { regOBA("REALPATHNAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REALPATHNAME: {NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_RealPathName_Desc() { regOBD("REALPATHNAME"); return this; }

    protected ConditionValue _pathType;
    public ConditionValue getPathType() {
        if (_pathType == null) { _pathType = nCV(); }
        return _pathType;
    }
    protected ConditionValue getCValuePathType() { return getPathType(); }

    /** 
     * Add order-by as ascend. <br />
     * PATHTYPE: {NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_PathType_Asc() { regOBA("PATHTYPE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PATHTYPE: {NUMBER(22)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_PathType_Desc() { regOBD("PATHTYPE"); return this; }

    protected ConditionValue _pkeyNum;
    public ConditionValue getPkeyNum() {
        if (_pkeyNum == null) { _pkeyNum = nCV(); }
        return _pkeyNum;
    }
    protected ConditionValue getCValuePkeyNum() { return getPkeyNum(); }

    /** 
     * Add order-by as ascend. <br />
     * PKEYNUM: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_PkeyNum_Asc() { regOBA("PKEYNUM"); return this; }

    /**
     * Add order-by as descend. <br />
     * PKEYNUM: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_PkeyNum_Desc() { regOBD("PKEYNUM"); return this; }

    protected ConditionValue _pkeyVal;
    public ConditionValue getPkeyVal() {
        if (_pkeyVal == null) { _pkeyVal = nCV(); }
        return _pkeyVal;
    }
    protected ConditionValue getCValuePkeyVal() { return getPkeyVal(); }

    /** 
     * Add order-by as ascend. <br />
     * PKEYVAL: {VARCHAR2(250)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_PkeyVal_Asc() { regOBA("PKEYVAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * PKEYVAL: {VARCHAR2(250)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_PkeyVal_Desc() { regOBD("PKEYVAL"); return this; }

    protected ConditionValue _dataType;
    public ConditionValue getDataType() {
        if (_dataType == null) { _dataType = nCV(); }
        return _dataType;
    }
    protected ConditionValue getCValueDataType() { return getDataType(); }

    /** 
     * Add order-by as ascend. <br />
     * DATATYPE: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_DataType_Asc() { regOBA("DATATYPE"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATATYPE: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_DataType_Desc() { regOBD("DATATYPE"); return this; }

    protected ConditionValue _tableName;
    public ConditionValue getTableName() {
        if (_tableName == null) { _tableName = nCV(); }
        return _tableName;
    }
    protected ConditionValue getCValueTableName() { return getTableName(); }

    /** 
     * Add order-by as ascend. <br />
     * TABLENAME: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_TableName_Asc() { regOBA("TABLENAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * TABLENAME: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_TableName_Desc() { regOBD("TABLENAME"); return this; }

    protected ConditionValue _dataId;
    public ConditionValue getDataId() {
        if (_dataId == null) { _dataId = nCV(); }
        return _dataId;
    }
    protected ConditionValue getCValueDataId() { return getDataId(); }

    /** 
     * Add order-by as ascend. <br />
     * DATAID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_DataId_Asc() { regOBA("DATAID"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATAID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_DataId_Desc() { regOBD("DATAID"); return this; }

    protected ConditionValue _stateId;
    public ConditionValue getStateId() {
        if (_stateId == null) { _stateId = nCV(); }
        return _stateId;
    }
    protected ConditionValue getCValueStateId() { return getStateId(); }

    /** 
     * Add order-by as ascend. <br />
     * STATEID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_StateId_Asc() { regOBA("STATEID"); return this; }

    /**
     * Add order-by as descend. <br />
     * STATEID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_StateId_Desc() { regOBD("STATEID"); return this; }

    protected ConditionValue _autoRunTime;
    public ConditionValue getAutoRunTime() {
        if (_autoRunTime == null) { _autoRunTime = nCV(); }
        return _autoRunTime;
    }
    protected ConditionValue getCValueAutoRunTime() { return getAutoRunTime(); }

    /** 
     * Add order-by as ascend. <br />
     * AUTORUNTIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_AutoRunTime_Asc() { regOBA("AUTORUNTIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * AUTORUNTIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_AutoRunTime_Desc() { regOBD("AUTORUNTIME"); return this; }

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
    public BsBuriPathHistoryDataCQ addOrderBy_InsertDate_Asc() { regOBA("INSERTDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_InsertDate_Desc() { regOBD("INSERTDATE"); return this; }

    protected ConditionValue _processDate;
    public ConditionValue getProcessDate() {
        if (_processDate == null) { _processDate = nCV(); }
        return _processDate;
    }
    protected ConditionValue getCValueProcessDate() { return getProcessDate(); }

    /** 
     * Add order-by as ascend. <br />
     * PROCESSDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_ProcessDate_Asc() { regOBA("PROCESSDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PROCESSDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_ProcessDate_Desc() { regOBD("PROCESSDATE"); return this; }

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
    public BsBuriPathHistoryDataCQ addOrderBy_AbortDate_Asc() { regOBA("ABORTDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_AbortDate_Desc() { regOBD("ABORTDATE"); return this; }

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
    public BsBuriPathHistoryDataCQ addOrderBy_ParticipantName_Asc() { regOBA("PARTICIPANTNAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_ParticipantName_Desc() { regOBD("PARTICIPANTNAME"); return this; }

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
    public BsBuriPathHistoryDataCQ addOrderBy_ParticipantType_Asc() { regOBA("PARTICIPANTTYPE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriPathHistoryDataCQ addOrderBy_ParticipantType_Desc() { regOBD("PARTICIPANTTYPE"); return this; }

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
    public BsBuriPathHistoryDataCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsBuriPathHistoryDataCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BuriPathHistoryDataCB.class.getName(); }
    protected String xCQ() { return BuriPathHistoryDataCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

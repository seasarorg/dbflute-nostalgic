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
 * The base condition-query of BURI_ALL_ROUND_STATE_HISTORY.
 * @author DBFlute(AutoGenerator)
 */
public class BsBuriAllRoundStateHistoryCQ extends AbstractBsBuriAllRoundStateHistoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriAllRoundStateHistoryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBuriAllRoundStateHistoryCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BURI_ALL_ROUND_STATE_HISTORY) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BuriAllRoundStateHistoryCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BuriAllRoundStateHistoryCIQ xcreateCIQ() {
        BuriAllRoundStateHistoryCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BuriAllRoundStateHistoryCIQ xnewCIQ() {
        return new BuriAllRoundStateHistoryCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BURI_ALL_ROUND_STATE_HISTORY on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BuriAllRoundStateHistoryCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BuriAllRoundStateHistoryCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _internalStateId;
    public ConditionValue getInternalStateId() {
        if (_internalStateId == null) { _internalStateId = nCV(); }
        return _internalStateId;
    }
    protected ConditionValue getCValueInternalStateId() { return getInternalStateId(); }

    /** 
     * Add order-by as ascend. <br />
     * INTERNAL_STATE_ID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_InternalStateId_Asc() { regOBA("INTERNAL_STATE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * INTERNAL_STATE_ID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_InternalStateId_Desc() { regOBD("INTERNAL_STATE_ID"); return this; }

    protected ConditionValue _statusUpdateDatetime;
    public ConditionValue getStatusUpdateDatetime() {
        if (_statusUpdateDatetime == null) { _statusUpdateDatetime = nCV(); }
        return _statusUpdateDatetime;
    }
    protected ConditionValue getCValueStatusUpdateDatetime() { return getStatusUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_StatusUpdateDatetime_Asc() { regOBA("STATUS_UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_StatusUpdateDatetime_Desc() { regOBD("STATUS_UPDATE_DATETIME"); return this; }

    protected ConditionValue _participantName;
    public ConditionValue getParticipantName() {
        if (_participantName == null) { _participantName = nCV(); }
        return _participantName;
    }
    protected ConditionValue getCValueParticipantName() { return getParticipantName(); }

    /** 
     * Add order-by as ascend. <br />
     * PARTICIPANT_NAME: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_ParticipantName_Asc() { regOBA("PARTICIPANT_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PARTICIPANT_NAME: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_ParticipantName_Desc() { regOBD("PARTICIPANT_NAME"); return this; }

    protected ConditionValue _participantType;
    public ConditionValue getParticipantType() {
        if (_participantType == null) { _participantType = nCV(); }
        return _participantType;
    }
    protected ConditionValue getCValueParticipantType() { return getParticipantType(); }

    /** 
     * Add order-by as ascend. <br />
     * PARTICIPANT_TYPE: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_ParticipantType_Asc() { regOBA("PARTICIPANT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PARTICIPANT_TYPE: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_ParticipantType_Desc() { regOBD("PARTICIPANT_TYPE"); return this; }

    protected ConditionValue _internalPathId;
    public ConditionValue getInternalPathId() {
        if (_internalPathId == null) { _internalPathId = nCV(); }
        return _internalPathId;
    }
    protected ConditionValue getCValueInternalPathId() { return getInternalPathId(); }

    /** 
     * Add order-by as ascend. <br />
     * INTERNAL_PATH_ID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_InternalPathId_Asc() { regOBA("INTERNAL_PATH_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * INTERNAL_PATH_ID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_InternalPathId_Desc() { regOBD("INTERNAL_PATH_ID"); return this; }

    protected ConditionValue _statusPathName;
    public ConditionValue getStatusPathName() {
        if (_statusPathName == null) { _statusPathName = nCV(); }
        return _statusPathName;
    }
    protected ConditionValue getCValueStatusPathName() { return getStatusPathName(); }

    /** 
     * Add order-by as ascend. <br />
     * STATUS_PATH_NAME: {NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_StatusPathName_Asc() { regOBA("STATUS_PATH_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * STATUS_PATH_NAME: {NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_StatusPathName_Desc() { regOBD("STATUS_PATH_NAME"); return this; }

    protected ConditionValue _internalDataId;
    public ConditionValue getInternalDataId() {
        if (_internalDataId == null) { _internalDataId = nCV(); }
        return _internalDataId;
    }
    protected ConditionValue getCValueInternalDataId() { return getInternalDataId(); }

    /** 
     * Add order-by as ascend. <br />
     * INTERNAL_DATA_ID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_InternalDataId_Asc() { regOBA("INTERNAL_DATA_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * INTERNAL_DATA_ID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_InternalDataId_Desc() { regOBD("INTERNAL_DATA_ID"); return this; }

    protected ConditionValue _internalPkValue;
    public ConditionValue getInternalPkValue() {
        if (_internalPkValue == null) { _internalPkValue = nCV(); }
        return _internalPkValue;
    }
    protected ConditionValue getCValueInternalPkValue() { return getInternalPkValue(); }

    /** 
     * Add order-by as ascend. <br />
     * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_InternalPkValue_Asc() { regOBA("INTERNAL_PK_VALUE"); return this; }

    /**
     * Add order-by as descend. <br />
     * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_InternalPkValue_Desc() { regOBD("INTERNAL_PK_VALUE"); return this; }

    protected ConditionValue _internalDataType;
    public ConditionValue getInternalDataType() {
        if (_internalDataType == null) { _internalDataType = nCV(); }
        return _internalDataType;
    }
    protected ConditionValue getCValueInternalDataType() { return getInternalDataType(); }

    /** 
     * Add order-by as ascend. <br />
     * INTERNAL_DATA_TYPE: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_InternalDataType_Asc() { regOBA("INTERNAL_DATA_TYPE"); return this; }

    /**
     * Add order-by as descend. <br />
     * INTERNAL_DATA_TYPE: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_InternalDataType_Desc() { regOBD("INTERNAL_DATA_TYPE"); return this; }

    protected ConditionValue _internalUserId;
    public ConditionValue getInternalUserId() {
        if (_internalUserId == null) { _internalUserId = nCV(); }
        return _internalUserId;
    }
    protected ConditionValue getCValueInternalUserId() { return getInternalUserId(); }

    /** 
     * Add order-by as ascend. <br />
     * INTERNAL_USER_ID: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_InternalUserId_Asc() { regOBA("INTERNAL_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * INTERNAL_USER_ID: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_InternalUserId_Desc() { regOBD("INTERNAL_USER_ID"); return this; }

    protected ConditionValue _statusUpdateUser;
    public ConditionValue getStatusUpdateUser() {
        if (_statusUpdateUser == null) { _statusUpdateUser = nCV(); }
        return _statusUpdateUser;
    }
    protected ConditionValue getCValueStatusUpdateUser() { return getStatusUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * STATUS_UPDATE_USER: {VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_StatusUpdateUser_Asc() { regOBA("STATUS_UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * STATUS_UPDATE_USER: {VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateHistoryCQ addOrderBy_StatusUpdateUser_Desc() { regOBD("STATUS_UPDATE_USER"); return this; }

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
    public BsBuriAllRoundStateHistoryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsBuriAllRoundStateHistoryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        BuriAllRoundStateHistoryCQ baseQuery = (BuriAllRoundStateHistoryCQ)baseQueryAsSuper;
        BuriAllRoundStateHistoryCQ unionQuery = (BuriAllRoundStateHistoryCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryDocument_文書管理_文書公開()) {
            unionQuery.queryDocument_文書管理_文書公開().reflectRelationOnUnionQuery(baseQuery.queryDocument_文書管理_文書公開(), unionQuery.queryDocument_文書管理_文書公開());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * DOCUMENT by my INTERNAL_PK_VALUE, named 'document_文書管理_文書公開'.
     * @return The instance of condition-query. (NotNull)
     */
    public DocumentCQ queryDocument_文書管理_文書公開() {
        return getConditionQueryDocument_文書管理_文書公開();
    }
    protected DocumentCQ _conditionQueryDocument_文書管理_文書公開;
    public DocumentCQ getConditionQueryDocument_文書管理_文書公開() {
        if (_conditionQueryDocument_文書管理_文書公開 == null) {
            _conditionQueryDocument_文書管理_文書公開 = xcreateQueryDocument_文書管理_文書公開();
            xsetupOuterJoinDocument_文書管理_文書公開();
        }
        return _conditionQueryDocument_文書管理_文書公開;
    }
    protected DocumentCQ xcreateQueryDocument_文書管理_文書公開() {
        String nrp = resolveNextRelationPath("BURI_ALL_ROUND_STATE_HISTORY", "document_文書管理_文書公開");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        DocumentCQ cq = new DocumentCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("document_文書管理_文書公開");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinDocument_文書管理_文書公開() {
        DocumentCQ cq = getConditionQueryDocument_文書管理_文書公開();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("INTERNAL_PK_VALUE", "ID");
        registerOuterJoin(cq, joinOnMap, "document_文書管理_文書公開");
    }
    public boolean hasConditionQueryDocument_文書管理_文書公開() {
        return _conditionQueryDocument_文書管理_文書公開 != null;
    }

    // ===================================================================================
    //                                                                      Buri Interface
    //                                                                      ==============
    public void setStatus_Equal(com.example.dbflute.buri.dbflute.allcommon.plugin.buri.BuriDef.BuriStatus status) {
        if (status == null) { return; }
        setStatusPathName_Equal(status.path());
    }
    public void setStatus_InScope(java.util.List<com.example.dbflute.buri.dbflute.allcommon.plugin.buri.BuriDef.BuriStatus> statusList) {
        if (statusList == null || statusList.isEmpty()) { return; }
        java.util.List<String> statusPathList = new java.util.ArrayList<String>();
        for (com.example.dbflute.buri.dbflute.allcommon.plugin.buri.BuriDef.BuriStatus status : statusList) {
            statusPathList.add(status.path());
        }
        setStatusPathName_InScope(statusPathList);
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BuriAllRoundStateHistoryCB.class.getName(); }
    protected String xCQ() { return BuriAllRoundStateHistoryCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

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
 * The base condition-query of BURI_ALL_ROUND_STATE.
 * @author DBFlute(AutoGenerator)
 */
public class BsBuriAllRoundStateCQ extends AbstractBsBuriAllRoundStateCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriAllRoundStateCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBuriAllRoundStateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BURI_ALL_ROUND_STATE) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BuriAllRoundStateCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BuriAllRoundStateCIQ xcreateCIQ() {
        BuriAllRoundStateCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BuriAllRoundStateCIQ xnewCIQ() {
        return new BuriAllRoundStateCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BURI_ALL_ROUND_STATE on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BuriAllRoundStateCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BuriAllRoundStateCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
    public BsBuriAllRoundStateCQ addOrderBy_InternalStateId_Asc() { regOBA("INTERNAL_STATE_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * INTERNAL_STATE_ID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateCQ addOrderBy_InternalStateId_Desc() { regOBD("INTERNAL_STATE_ID"); return this; }

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
    public BsBuriAllRoundStateCQ addOrderBy_StatusUpdateDatetime_Asc() { regOBA("STATUS_UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateCQ addOrderBy_StatusUpdateDatetime_Desc() { regOBD("STATUS_UPDATE_DATETIME"); return this; }

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
    public BsBuriAllRoundStateCQ addOrderBy_ParticipantName_Asc() { regOBA("PARTICIPANT_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PARTICIPANT_NAME: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateCQ addOrderBy_ParticipantName_Desc() { regOBD("PARTICIPANT_NAME"); return this; }

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
    public BsBuriAllRoundStateCQ addOrderBy_ParticipantType_Asc() { regOBA("PARTICIPANT_TYPE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PARTICIPANT_TYPE: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateCQ addOrderBy_ParticipantType_Desc() { regOBD("PARTICIPANT_TYPE"); return this; }

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
    public BsBuriAllRoundStateCQ addOrderBy_InternalPathId_Asc() { regOBA("INTERNAL_PATH_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * INTERNAL_PATH_ID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateCQ addOrderBy_InternalPathId_Desc() { regOBD("INTERNAL_PATH_ID"); return this; }

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
    public BsBuriAllRoundStateCQ addOrderBy_StatusPathName_Asc() { regOBA("STATUS_PATH_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * STATUS_PATH_NAME: {NotNull, VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateCQ addOrderBy_StatusPathName_Desc() { regOBD("STATUS_PATH_NAME"); return this; }

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
    public BsBuriAllRoundStateCQ addOrderBy_InternalDataId_Asc() { regOBA("INTERNAL_DATA_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * INTERNAL_DATA_ID: {NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateCQ addOrderBy_InternalDataId_Desc() { regOBD("INTERNAL_DATA_ID"); return this; }

    protected ConditionValue _internalPkValue;
    public ConditionValue getInternalPkValue() {
        if (_internalPkValue == null) { _internalPkValue = nCV(); }
        return _internalPkValue;
    }
    protected ConditionValue getCValueInternalPkValue() { return getInternalPkValue(); }

    protected Map<String, DocumentCQ> _internalPkValue_InScopeRelation_DocumentMap;
    public Map<String, DocumentCQ> getInternalPkValue_InScopeRelation_Document() { return _internalPkValue_InScopeRelation_DocumentMap; }
    public String keepInternalPkValue_InScopeRelation_Document(DocumentCQ subQuery) {
        if (_internalPkValue_InScopeRelation_DocumentMap == null) { _internalPkValue_InScopeRelation_DocumentMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_internalPkValue_InScopeRelation_DocumentMap.size() + 1);
        _internalPkValue_InScopeRelation_DocumentMap.put(key, subQuery); return "internalPkValue_InScopeRelation_Document." + key;
    }

    protected Map<String, DocumentCQ> _internalPkValue_NotInScopeRelation_DocumentMap;
    public Map<String, DocumentCQ> getInternalPkValue_NotInScopeRelation_Document() { return _internalPkValue_NotInScopeRelation_DocumentMap; }
    public String keepInternalPkValue_NotInScopeRelation_Document(DocumentCQ subQuery) {
        if (_internalPkValue_NotInScopeRelation_DocumentMap == null) { _internalPkValue_NotInScopeRelation_DocumentMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_internalPkValue_NotInScopeRelation_DocumentMap.size() + 1);
        _internalPkValue_NotInScopeRelation_DocumentMap.put(key, subQuery); return "internalPkValue_NotInScopeRelation_Document." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateCQ addOrderBy_InternalPkValue_Asc() { regOBA("INTERNAL_PK_VALUE"); return this; }

    /**
     * Add order-by as descend. <br />
     * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateCQ addOrderBy_InternalPkValue_Desc() { regOBD("INTERNAL_PK_VALUE"); return this; }

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
    public BsBuriAllRoundStateCQ addOrderBy_InternalDataType_Asc() { regOBA("INTERNAL_DATA_TYPE"); return this; }

    /**
     * Add order-by as descend. <br />
     * INTERNAL_DATA_TYPE: {NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateCQ addOrderBy_InternalDataType_Desc() { regOBD("INTERNAL_DATA_TYPE"); return this; }

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
    public BsBuriAllRoundStateCQ addOrderBy_InternalUserId_Asc() { regOBA("INTERNAL_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * INTERNAL_USER_ID: {NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateCQ addOrderBy_InternalUserId_Desc() { regOBD("INTERNAL_USER_ID"); return this; }

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
    public BsBuriAllRoundStateCQ addOrderBy_StatusUpdateUser_Asc() { regOBA("STATUS_UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * STATUS_UPDATE_USER: {VARCHAR2(100)}
     * @return this. (NotNull)
     */
    public BsBuriAllRoundStateCQ addOrderBy_StatusUpdateUser_Desc() { regOBD("STATUS_UPDATE_USER"); return this; }

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
    public BsBuriAllRoundStateCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsBuriAllRoundStateCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        BuriAllRoundStateCQ baseQuery = (BuriAllRoundStateCQ)baseQueryAsSuper;
        BuriAllRoundStateCQ unionQuery = (BuriAllRoundStateCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryDocument()) {
            unionQuery.queryDocument().reflectRelationOnUnionQuery(baseQuery.queryDocument(), unionQuery.queryDocument());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * DOCUMENT by my INTERNAL_PK_VALUE, named 'document'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @return The instance of condition-query. (NotNull)
     */
    public DocumentCQ queryDocument() {
        return getConditionQueryDocument();
    }
    protected DocumentCQ _conditionQueryDocument;
    public DocumentCQ getConditionQueryDocument() {
        if (_conditionQueryDocument == null) {
            _conditionQueryDocument = xcreateQueryDocument();
            xsetupOuterJoinDocument();
        }
        return _conditionQueryDocument;
    }
    protected DocumentCQ xcreateQueryDocument() {
        String nrp = resolveNextRelationPath("BURI_ALL_ROUND_STATE", "document");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        DocumentCQ cq = new DocumentCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("document");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinDocument() {
        DocumentCQ cq = getConditionQueryDocument();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("INTERNAL_PK_VALUE", "ID");
        registerOuterJoin(cq, joinOnMap, "document");
    }
    public boolean hasConditionQueryDocument() {
        return _conditionQueryDocument != null;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BuriAllRoundStateCB.class.getName(); }
    protected String xCQ() { return BuriAllRoundStateCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

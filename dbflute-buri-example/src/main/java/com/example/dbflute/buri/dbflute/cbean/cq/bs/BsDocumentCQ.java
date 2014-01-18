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
 * The base condition-query of DOCUMENT.
 * @author DBFlute(AutoGenerator)
 */
public class BsDocumentCQ extends AbstractBsDocumentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DocumentCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsDocumentCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from DOCUMENT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public DocumentCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected DocumentCIQ xcreateCIQ() {
        DocumentCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected DocumentCIQ xnewCIQ() {
        return new DocumentCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join DOCUMENT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public DocumentCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        DocumentCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _id;
    public ConditionValue getId() {
        if (_id == null) { _id = nCV(); }
        return _id;
    }
    protected ConditionValue getCValueId() { return getId(); }

    protected Map<String, BuriAllRoundStateCQ> _id_ExistsReferrer_BuriAllRoundStateListMap;
    public Map<String, BuriAllRoundStateCQ> getId_ExistsReferrer_BuriAllRoundStateList() { return _id_ExistsReferrer_BuriAllRoundStateListMap; }
    public String keepId_ExistsReferrer_BuriAllRoundStateList(BuriAllRoundStateCQ subQuery) {
        if (_id_ExistsReferrer_BuriAllRoundStateListMap == null) { _id_ExistsReferrer_BuriAllRoundStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_id_ExistsReferrer_BuriAllRoundStateListMap.size() + 1);
        _id_ExistsReferrer_BuriAllRoundStateListMap.put(key, subQuery); return "id_ExistsReferrer_BuriAllRoundStateList." + key;
    }

    protected Map<String, BuriAllRoundStateCQ> _id_NotExistsReferrer_BuriAllRoundStateListMap;
    public Map<String, BuriAllRoundStateCQ> getId_NotExistsReferrer_BuriAllRoundStateList() { return _id_NotExistsReferrer_BuriAllRoundStateListMap; }
    public String keepId_NotExistsReferrer_BuriAllRoundStateList(BuriAllRoundStateCQ subQuery) {
        if (_id_NotExistsReferrer_BuriAllRoundStateListMap == null) { _id_NotExistsReferrer_BuriAllRoundStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_id_NotExistsReferrer_BuriAllRoundStateListMap.size() + 1);
        _id_NotExistsReferrer_BuriAllRoundStateListMap.put(key, subQuery); return "id_NotExistsReferrer_BuriAllRoundStateList." + key;
    }

    protected Map<String, BuriAllRoundStateCQ> _id_SpecifyDerivedReferrer_BuriAllRoundStateListMap;
    public Map<String, BuriAllRoundStateCQ> getId_SpecifyDerivedReferrer_BuriAllRoundStateList() { return _id_SpecifyDerivedReferrer_BuriAllRoundStateListMap; }
    public String keepId_SpecifyDerivedReferrer_BuriAllRoundStateList(BuriAllRoundStateCQ subQuery) {
        if (_id_SpecifyDerivedReferrer_BuriAllRoundStateListMap == null) { _id_SpecifyDerivedReferrer_BuriAllRoundStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_id_SpecifyDerivedReferrer_BuriAllRoundStateListMap.size() + 1);
        _id_SpecifyDerivedReferrer_BuriAllRoundStateListMap.put(key, subQuery); return "id_SpecifyDerivedReferrer_BuriAllRoundStateList." + key;
    }

    protected Map<String, BuriAllRoundStateCQ> _id_InScopeRelation_BuriAllRoundStateListMap;
    public Map<String, BuriAllRoundStateCQ> getId_InScopeRelation_BuriAllRoundStateList() { return _id_InScopeRelation_BuriAllRoundStateListMap; }
    public String keepId_InScopeRelation_BuriAllRoundStateList(BuriAllRoundStateCQ subQuery) {
        if (_id_InScopeRelation_BuriAllRoundStateListMap == null) { _id_InScopeRelation_BuriAllRoundStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_id_InScopeRelation_BuriAllRoundStateListMap.size() + 1);
        _id_InScopeRelation_BuriAllRoundStateListMap.put(key, subQuery); return "id_InScopeRelation_BuriAllRoundStateList." + key;
    }

    protected Map<String, BuriAllRoundStateCQ> _id_NotInScopeRelation_BuriAllRoundStateListMap;
    public Map<String, BuriAllRoundStateCQ> getId_NotInScopeRelation_BuriAllRoundStateList() { return _id_NotInScopeRelation_BuriAllRoundStateListMap; }
    public String keepId_NotInScopeRelation_BuriAllRoundStateList(BuriAllRoundStateCQ subQuery) {
        if (_id_NotInScopeRelation_BuriAllRoundStateListMap == null) { _id_NotInScopeRelation_BuriAllRoundStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_id_NotInScopeRelation_BuriAllRoundStateListMap.size() + 1);
        _id_NotInScopeRelation_BuriAllRoundStateListMap.put(key, subQuery); return "id_NotInScopeRelation_BuriAllRoundStateList." + key;
    }

    protected Map<String, BuriAllRoundStateCQ> _id_QueryDerivedReferrer_BuriAllRoundStateListMap;
    public Map<String, BuriAllRoundStateCQ> getId_QueryDerivedReferrer_BuriAllRoundStateList() { return _id_QueryDerivedReferrer_BuriAllRoundStateListMap; }
    public String keepId_QueryDerivedReferrer_BuriAllRoundStateList(BuriAllRoundStateCQ subQuery) {
        if (_id_QueryDerivedReferrer_BuriAllRoundStateListMap == null) { _id_QueryDerivedReferrer_BuriAllRoundStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_id_QueryDerivedReferrer_BuriAllRoundStateListMap.size() + 1);
        _id_QueryDerivedReferrer_BuriAllRoundStateListMap.put(key, subQuery); return "id_QueryDerivedReferrer_BuriAllRoundStateList." + key;
    }
    protected Map<String, Object> _id_QueryDerivedReferrer_BuriAllRoundStateListParameterMap;
    public Map<String, Object> getId_QueryDerivedReferrer_BuriAllRoundStateListParameter() { return _id_QueryDerivedReferrer_BuriAllRoundStateListParameterMap; }
    public String keepId_QueryDerivedReferrer_BuriAllRoundStateListParameter(Object parameterValue) {
        if (_id_QueryDerivedReferrer_BuriAllRoundStateListParameterMap == null) { _id_QueryDerivedReferrer_BuriAllRoundStateListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_id_QueryDerivedReferrer_BuriAllRoundStateListParameterMap.size() + 1);
        _id_QueryDerivedReferrer_BuriAllRoundStateListParameterMap.put(key, parameterValue); return "id_QueryDerivedReferrer_BuriAllRoundStateListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE}
     * @return this. (NotNull)
     */
    public BsDocumentCQ addOrderBy_Id_Asc() { regOBA("ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE}
     * @return this. (NotNull)
     */
    public BsDocumentCQ addOrderBy_Id_Desc() { regOBD("ID"); return this; }

    protected ConditionValue _title;
    public ConditionValue getTitle() {
        if (_title == null) { _title = nCV(); }
        return _title;
    }
    protected ConditionValue getCValueTitle() { return getTitle(); }

    /** 
     * Add order-by as ascend. <br />
     * TITLE: {NotNull, VARCHAR2(64)}
     * @return this. (NotNull)
     */
    public BsDocumentCQ addOrderBy_Title_Asc() { regOBA("TITLE"); return this; }

    /**
     * Add order-by as descend. <br />
     * TITLE: {NotNull, VARCHAR2(64)}
     * @return this. (NotNull)
     */
    public BsDocumentCQ addOrderBy_Title_Desc() { regOBD("TITLE"); return this; }

    protected ConditionValue _content;
    public ConditionValue getContent() {
        if (_content == null) { _content = nCV(); }
        return _content;
    }
    protected ConditionValue getCValueContent() { return getContent(); }

    /** 
     * Add order-by as ascend. <br />
     * CONTENT: {NotNull, VARCHAR2(1024)}
     * @return this. (NotNull)
     */
    public BsDocumentCQ addOrderBy_Content_Asc() { regOBA("CONTENT"); return this; }

    /**
     * Add order-by as descend. <br />
     * CONTENT: {NotNull, VARCHAR2(1024)}
     * @return this. (NotNull)
     */
    public BsDocumentCQ addOrderBy_Content_Desc() { regOBD("CONTENT"); return this; }

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
    public BsDocumentCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsDocumentCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        DocumentCQ baseQuery = (DocumentCQ)baseQueryAsSuper;
        DocumentCQ unionQuery = (DocumentCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryBuriAllRoundState_文書管理_文書公開()) {
            unionQuery.queryBuriAllRoundState_文書管理_文書公開().reflectRelationOnUnionQuery(baseQuery.queryBuriAllRoundState_文書管理_文書公開(), unionQuery.queryBuriAllRoundState_文書管理_文書公開());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * BURI_ALL_ROUND_STATE by my ID, named 'buriAllRoundState_文書管理_文書公開'.
     * @return The instance of condition-query. (NotNull)
     */
    public BuriAllRoundStateCQ queryBuriAllRoundState_文書管理_文書公開() {
        return getConditionQueryBuriAllRoundState_文書管理_文書公開();
    }
    protected BuriAllRoundStateCQ _conditionQueryBuriAllRoundState_文書管理_文書公開;
    public BuriAllRoundStateCQ getConditionQueryBuriAllRoundState_文書管理_文書公開() {
        if (_conditionQueryBuriAllRoundState_文書管理_文書公開 == null) {
            _conditionQueryBuriAllRoundState_文書管理_文書公開 = xcreateQueryBuriAllRoundState_文書管理_文書公開();
            xsetupOuterJoinBuriAllRoundState_文書管理_文書公開();
        }
        return _conditionQueryBuriAllRoundState_文書管理_文書公開;
    }
    protected BuriAllRoundStateCQ xcreateQueryBuriAllRoundState_文書管理_文書公開() {
        String nrp = resolveNextRelationPath("DOCUMENT", "buriAllRoundState_文書管理_文書公開");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        BuriAllRoundStateCQ cq = new BuriAllRoundStateCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("buriAllRoundState_文書管理_文書公開");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinBuriAllRoundState_文書管理_文書公開() {
        BuriAllRoundStateCQ cq = getConditionQueryBuriAllRoundState_文書管理_文書公開();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("ID", "INTERNAL_PK_VALUE");
        registerOuterJoin(cq, joinOnMap, "buriAllRoundState_文書管理_文書公開");
    }
    public boolean hasConditionQueryBuriAllRoundState_文書管理_文書公開() {
        return _conditionQueryBuriAllRoundState_文書管理_文書公開 != null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, DocumentCQ> _scalarConditionMap;
    public Map<String, DocumentCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(DocumentCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, DocumentCQ> _specifyMyselfDerivedMap;
    public Map<String, DocumentCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(DocumentCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, DocumentCQ> _queryMyselfDerivedMap;
    public Map<String, DocumentCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(DocumentCQ subQuery) {
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
    protected Map<String, DocumentCQ> _myselfExistsMap;
    public Map<String, DocumentCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(DocumentCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, DocumentCQ> _myselfInScopeMap;
    public Map<String, DocumentCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(DocumentCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                      Buri Interface
    //                                                                      ==============
    public void existsBuriAllRoundStateHistory_文書管理_文書公開(SubQuery<BuriAllRoundStateHistoryCB> subQuery) {
        assertObjectNotNull("subQuery<BuriAllRoundStateHistoryCB>", subQuery);
        BuriAllRoundStateHistoryCB cb = new BuriAllRoundStateHistoryCB(); cb.xsetupForExistsReferrer(this);
        cb.query().setInternalDataType_Equal("com.example.dbflute.buri.dbflute.exentity.Document"); subQuery.query(cb);
        String subQueryPropertyName = keepBuriAllRoundStateHistory_文書管理_文書公開(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "ID", "INTERNAL_PK_VALUE", subQueryPropertyName, "buriAllRoundStateHistory");
    }
    protected Map<String, BuriAllRoundStateHistoryCQ> _buriAllRoundStateHistory_文書管理_文書公開Map;
    public Map<String, BuriAllRoundStateHistoryCQ> getBuriAllRoundStateHistory文書管理_文書公開() { return _buriAllRoundStateHistory_文書管理_文書公開Map; }
    public String keepBuriAllRoundStateHistory_文書管理_文書公開(BuriAllRoundStateHistoryCQ subQuery) {
        if (_buriAllRoundStateHistory_文書管理_文書公開Map == null) { _buriAllRoundStateHistory_文書管理_文書公開Map = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_buriAllRoundStateHistory_文書管理_文書公開Map.size() + 1);
        _buriAllRoundStateHistory_文書管理_文書公開Map.put(key, subQuery); return "buriAllRoundStateHistory文書管理_文書公開." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return DocumentCB.class.getName(); }
    protected String xCQ() { return DocumentCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

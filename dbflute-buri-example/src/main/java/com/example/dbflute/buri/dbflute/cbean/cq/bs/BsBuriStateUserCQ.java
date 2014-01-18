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
 * The base condition-query of BURISTATEUSER.
 * @author DBFlute(AutoGenerator)
 */
public class BsBuriStateUserCQ extends AbstractBsBuriStateUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriStateUserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBuriStateUserCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BURISTATEUSER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BuriStateUserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BuriStateUserCIQ xcreateCIQ() {
        BuriStateUserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BuriStateUserCIQ xnewCIQ() {
        return new BuriStateUserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BURISTATEUSER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BuriStateUserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BuriStateUserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _stateUserId;
    public ConditionValue getStateUserId() {
        if (_stateUserId == null) { _stateUserId = nCV(); }
        return _stateUserId;
    }
    protected ConditionValue getCValueStateUserId() { return getStateUserId(); }

    /** 
     * Add order-by as ascend. <br />
     * STATEUSERID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUserCQ addOrderBy_StateUserId_Asc() { regOBA("STATEUSERID"); return this; }

    /**
     * Add order-by as descend. <br />
     * STATEUSERID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriStateUserCQ addOrderBy_StateUserId_Desc() { regOBD("STATEUSERID"); return this; }

    protected ConditionValue _stateId;
    public ConditionValue getStateId() {
        if (_stateId == null) { _stateId = nCV(); }
        return _stateId;
    }
    protected ConditionValue getCValueStateId() { return getStateId(); }

    protected Map<String, BuriStateCQ> _stateId_InScopeRelation_BuriStateMap;
    public Map<String, BuriStateCQ> getStateId_InScopeRelation_BuriState() { return _stateId_InScopeRelation_BuriStateMap; }
    public String keepStateId_InScopeRelation_BuriState(BuriStateCQ subQuery) {
        if (_stateId_InScopeRelation_BuriStateMap == null) { _stateId_InScopeRelation_BuriStateMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_stateId_InScopeRelation_BuriStateMap.size() + 1);
        _stateId_InScopeRelation_BuriStateMap.put(key, subQuery); return "stateId_InScopeRelation_BuriState." + key;
    }

    protected Map<String, BuriStateCQ> _stateId_NotInScopeRelation_BuriStateMap;
    public Map<String, BuriStateCQ> getStateId_NotInScopeRelation_BuriState() { return _stateId_NotInScopeRelation_BuriStateMap; }
    public String keepStateId_NotInScopeRelation_BuriState(BuriStateCQ subQuery) {
        if (_stateId_NotInScopeRelation_BuriStateMap == null) { _stateId_NotInScopeRelation_BuriStateMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_stateId_NotInScopeRelation_BuriStateMap.size() + 1);
        _stateId_NotInScopeRelation_BuriStateMap.put(key, subQuery); return "stateId_NotInScopeRelation_BuriState." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * STATEID: {IX, NUMBER(18), FK to BURISTATE}
     * @return this. (NotNull)
     */
    public BsBuriStateUserCQ addOrderBy_StateId_Asc() { regOBA("STATEID"); return this; }

    /**
     * Add order-by as descend. <br />
     * STATEID: {IX, NUMBER(18), FK to BURISTATE}
     * @return this. (NotNull)
     */
    public BsBuriStateUserCQ addOrderBy_StateId_Desc() { regOBD("STATEID"); return this; }

    protected ConditionValue _buriUserId;
    public ConditionValue getBuriUserId() {
        if (_buriUserId == null) { _buriUserId = nCV(); }
        return _buriUserId;
    }
    protected ConditionValue getCValueBuriUserId() { return getBuriUserId(); }

    protected Map<String, BuriUserCQ> _buriUserId_InScopeRelation_BuriUserMap;
    public Map<String, BuriUserCQ> getBuriUserId_InScopeRelation_BuriUser() { return _buriUserId_InScopeRelation_BuriUserMap; }
    public String keepBuriUserId_InScopeRelation_BuriUser(BuriUserCQ subQuery) {
        if (_buriUserId_InScopeRelation_BuriUserMap == null) { _buriUserId_InScopeRelation_BuriUserMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_buriUserId_InScopeRelation_BuriUserMap.size() + 1);
        _buriUserId_InScopeRelation_BuriUserMap.put(key, subQuery); return "buriUserId_InScopeRelation_BuriUser." + key;
    }

    protected Map<String, BuriUserCQ> _buriUserId_NotInScopeRelation_BuriUserMap;
    public Map<String, BuriUserCQ> getBuriUserId_NotInScopeRelation_BuriUser() { return _buriUserId_NotInScopeRelation_BuriUserMap; }
    public String keepBuriUserId_NotInScopeRelation_BuriUser(BuriUserCQ subQuery) {
        if (_buriUserId_NotInScopeRelation_BuriUserMap == null) { _buriUserId_NotInScopeRelation_BuriUserMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_buriUserId_NotInScopeRelation_BuriUserMap.size() + 1);
        _buriUserId_NotInScopeRelation_BuriUserMap.put(key, subQuery); return "buriUserId_NotInScopeRelation_BuriUser." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * BURIUSERID: {IX, NUMBER(18), FK to BURIUSER}
     * @return this. (NotNull)
     */
    public BsBuriStateUserCQ addOrderBy_BuriUserId_Asc() { regOBA("BURIUSERID"); return this; }

    /**
     * Add order-by as descend. <br />
     * BURIUSERID: {IX, NUMBER(18), FK to BURIUSER}
     * @return this. (NotNull)
     */
    public BsBuriStateUserCQ addOrderBy_BuriUserId_Desc() { regOBD("BURIUSERID"); return this; }

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
    public BsBuriStateUserCQ addOrderBy_InsertDate_Asc() { regOBA("INSERTDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateUserCQ addOrderBy_InsertDate_Desc() { regOBD("INSERTDATE"); return this; }

    protected ConditionValue _deleteDate;
    public ConditionValue getDeleteDate() {
        if (_deleteDate == null) { _deleteDate = nCV(); }
        return _deleteDate;
    }
    protected ConditionValue getCValueDeleteDate() { return getDeleteDate(); }

    /** 
     * Add order-by as ascend. <br />
     * DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateUserCQ addOrderBy_DeleteDate_Asc() { regOBA("DELETEDATE"); return this; }

    /**
     * Add order-by as descend. <br />
     * DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @return this. (NotNull)
     */
    public BsBuriStateUserCQ addOrderBy_DeleteDate_Desc() { regOBD("DELETEDATE"); return this; }

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
    public BsBuriStateUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsBuriStateUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        BuriStateUserCQ baseQuery = (BuriStateUserCQ)baseQueryAsSuper;
        BuriStateUserCQ unionQuery = (BuriStateUserCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryBuriState()) {
            unionQuery.queryBuriState().reflectRelationOnUnionQuery(baseQuery.queryBuriState(), unionQuery.queryBuriState());
        }
        if (baseQuery.hasConditionQueryBuriUser()) {
            unionQuery.queryBuriUser().reflectRelationOnUnionQuery(baseQuery.queryBuriUser(), unionQuery.queryBuriUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * BURISTATE by my STATEID, named 'buriState'.
     * @return The instance of condition-query. (NotNull)
     */
    public BuriStateCQ queryBuriState() {
        return getConditionQueryBuriState();
    }
    protected BuriStateCQ _conditionQueryBuriState;
    public BuriStateCQ getConditionQueryBuriState() {
        if (_conditionQueryBuriState == null) {
            _conditionQueryBuriState = xcreateQueryBuriState();
            xsetupOuterJoinBuriState();
        }
        return _conditionQueryBuriState;
    }
    protected BuriStateCQ xcreateQueryBuriState() {
        String nrp = resolveNextRelationPath("BURISTATEUSER", "buriState");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        BuriStateCQ cq = new BuriStateCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("buriState");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinBuriState() {
        BuriStateCQ cq = getConditionQueryBuriState();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("STATEID", "STATEID");
        registerOuterJoin(cq, joinOnMap, "buriState");
    }
    public boolean hasConditionQueryBuriState() {
        return _conditionQueryBuriState != null;
    }

    /**
     * Get the condition-query for relation table. <br />
     * BURIUSER by my BURIUSERID, named 'buriUser'.
     * @return The instance of condition-query. (NotNull)
     */
    public BuriUserCQ queryBuriUser() {
        return getConditionQueryBuriUser();
    }
    protected BuriUserCQ _conditionQueryBuriUser;
    public BuriUserCQ getConditionQueryBuriUser() {
        if (_conditionQueryBuriUser == null) {
            _conditionQueryBuriUser = xcreateQueryBuriUser();
            xsetupOuterJoinBuriUser();
        }
        return _conditionQueryBuriUser;
    }
    protected BuriUserCQ xcreateQueryBuriUser() {
        String nrp = resolveNextRelationPath("BURISTATEUSER", "buriUser");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        BuriUserCQ cq = new BuriUserCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("buriUser");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinBuriUser() {
        BuriUserCQ cq = getConditionQueryBuriUser();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("BURIUSERID", "BURIUSERID");
        registerOuterJoin(cq, joinOnMap, "buriUser");
    }
    public boolean hasConditionQueryBuriUser() {
        return _conditionQueryBuriUser != null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, BuriStateUserCQ> _scalarConditionMap;
    public Map<String, BuriStateUserCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(BuriStateUserCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, BuriStateUserCQ> _specifyMyselfDerivedMap;
    public Map<String, BuriStateUserCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(BuriStateUserCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, BuriStateUserCQ> _queryMyselfDerivedMap;
    public Map<String, BuriStateUserCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(BuriStateUserCQ subQuery) {
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
    protected Map<String, BuriStateUserCQ> _myselfExistsMap;
    public Map<String, BuriStateUserCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(BuriStateUserCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, BuriStateUserCQ> _myselfInScopeMap;
    public Map<String, BuriStateUserCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(BuriStateUserCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BuriStateUserCB.class.getName(); }
    protected String xCQ() { return BuriStateUserCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

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
 * The base condition-query of BURIDATA.
 * @author DBFlute(AutoGenerator)
 */
public class BsBuriDataCQ extends AbstractBsBuriDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriDataCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBuriDataCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from BURIDATA) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public BuriDataCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected BuriDataCIQ xcreateCIQ() {
        BuriDataCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected BuriDataCIQ xnewCIQ() {
        return new BuriDataCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join BURIDATA on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public BuriDataCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        BuriDataCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _dataId;
    public ConditionValue getDataId() {
        if (_dataId == null) { _dataId = nCV(); }
        return _dataId;
    }
    protected ConditionValue getCValueDataId() { return getDataId(); }

    protected Map<String, BuriStateCQ> _dataId_ExistsReferrer_BuriStateListMap;
    public Map<String, BuriStateCQ> getDataId_ExistsReferrer_BuriStateList() { return _dataId_ExistsReferrer_BuriStateListMap; }
    public String keepDataId_ExistsReferrer_BuriStateList(BuriStateCQ subQuery) {
        if (_dataId_ExistsReferrer_BuriStateListMap == null) { _dataId_ExistsReferrer_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_dataId_ExistsReferrer_BuriStateListMap.size() + 1);
        _dataId_ExistsReferrer_BuriStateListMap.put(key, subQuery); return "dataId_ExistsReferrer_BuriStateList." + key;
    }

    protected Map<String, BuriBranchCQ> _dataId_ExistsReferrer_BuriBranchListMap;
    public Map<String, BuriBranchCQ> getDataId_ExistsReferrer_BuriBranchList() { return _dataId_ExistsReferrer_BuriBranchListMap; }
    public String keepDataId_ExistsReferrer_BuriBranchList(BuriBranchCQ subQuery) {
        if (_dataId_ExistsReferrer_BuriBranchListMap == null) { _dataId_ExistsReferrer_BuriBranchListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_dataId_ExistsReferrer_BuriBranchListMap.size() + 1);
        _dataId_ExistsReferrer_BuriBranchListMap.put(key, subQuery); return "dataId_ExistsReferrer_BuriBranchList." + key;
    }

    protected Map<String, BuriStateCQ> _dataId_NotExistsReferrer_BuriStateListMap;
    public Map<String, BuriStateCQ> getDataId_NotExistsReferrer_BuriStateList() { return _dataId_NotExistsReferrer_BuriStateListMap; }
    public String keepDataId_NotExistsReferrer_BuriStateList(BuriStateCQ subQuery) {
        if (_dataId_NotExistsReferrer_BuriStateListMap == null) { _dataId_NotExistsReferrer_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_dataId_NotExistsReferrer_BuriStateListMap.size() + 1);
        _dataId_NotExistsReferrer_BuriStateListMap.put(key, subQuery); return "dataId_NotExistsReferrer_BuriStateList." + key;
    }

    protected Map<String, BuriBranchCQ> _dataId_NotExistsReferrer_BuriBranchListMap;
    public Map<String, BuriBranchCQ> getDataId_NotExistsReferrer_BuriBranchList() { return _dataId_NotExistsReferrer_BuriBranchListMap; }
    public String keepDataId_NotExistsReferrer_BuriBranchList(BuriBranchCQ subQuery) {
        if (_dataId_NotExistsReferrer_BuriBranchListMap == null) { _dataId_NotExistsReferrer_BuriBranchListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_dataId_NotExistsReferrer_BuriBranchListMap.size() + 1);
        _dataId_NotExistsReferrer_BuriBranchListMap.put(key, subQuery); return "dataId_NotExistsReferrer_BuriBranchList." + key;
    }

    protected Map<String, BuriStateCQ> _dataId_SpecifyDerivedReferrer_BuriStateListMap;
    public Map<String, BuriStateCQ> getDataId_SpecifyDerivedReferrer_BuriStateList() { return _dataId_SpecifyDerivedReferrer_BuriStateListMap; }
    public String keepDataId_SpecifyDerivedReferrer_BuriStateList(BuriStateCQ subQuery) {
        if (_dataId_SpecifyDerivedReferrer_BuriStateListMap == null) { _dataId_SpecifyDerivedReferrer_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_dataId_SpecifyDerivedReferrer_BuriStateListMap.size() + 1);
        _dataId_SpecifyDerivedReferrer_BuriStateListMap.put(key, subQuery); return "dataId_SpecifyDerivedReferrer_BuriStateList." + key;
    }

    protected Map<String, BuriBranchCQ> _dataId_SpecifyDerivedReferrer_BuriBranchListMap;
    public Map<String, BuriBranchCQ> getDataId_SpecifyDerivedReferrer_BuriBranchList() { return _dataId_SpecifyDerivedReferrer_BuriBranchListMap; }
    public String keepDataId_SpecifyDerivedReferrer_BuriBranchList(BuriBranchCQ subQuery) {
        if (_dataId_SpecifyDerivedReferrer_BuriBranchListMap == null) { _dataId_SpecifyDerivedReferrer_BuriBranchListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_dataId_SpecifyDerivedReferrer_BuriBranchListMap.size() + 1);
        _dataId_SpecifyDerivedReferrer_BuriBranchListMap.put(key, subQuery); return "dataId_SpecifyDerivedReferrer_BuriBranchList." + key;
    }

    protected Map<String, BuriStateCQ> _dataId_InScopeRelation_BuriStateListMap;
    public Map<String, BuriStateCQ> getDataId_InScopeRelation_BuriStateList() { return _dataId_InScopeRelation_BuriStateListMap; }
    public String keepDataId_InScopeRelation_BuriStateList(BuriStateCQ subQuery) {
        if (_dataId_InScopeRelation_BuriStateListMap == null) { _dataId_InScopeRelation_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_dataId_InScopeRelation_BuriStateListMap.size() + 1);
        _dataId_InScopeRelation_BuriStateListMap.put(key, subQuery); return "dataId_InScopeRelation_BuriStateList." + key;
    }

    protected Map<String, BuriBranchCQ> _dataId_InScopeRelation_BuriBranchListMap;
    public Map<String, BuriBranchCQ> getDataId_InScopeRelation_BuriBranchList() { return _dataId_InScopeRelation_BuriBranchListMap; }
    public String keepDataId_InScopeRelation_BuriBranchList(BuriBranchCQ subQuery) {
        if (_dataId_InScopeRelation_BuriBranchListMap == null) { _dataId_InScopeRelation_BuriBranchListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_dataId_InScopeRelation_BuriBranchListMap.size() + 1);
        _dataId_InScopeRelation_BuriBranchListMap.put(key, subQuery); return "dataId_InScopeRelation_BuriBranchList." + key;
    }

    protected Map<String, BuriStateCQ> _dataId_NotInScopeRelation_BuriStateListMap;
    public Map<String, BuriStateCQ> getDataId_NotInScopeRelation_BuriStateList() { return _dataId_NotInScopeRelation_BuriStateListMap; }
    public String keepDataId_NotInScopeRelation_BuriStateList(BuriStateCQ subQuery) {
        if (_dataId_NotInScopeRelation_BuriStateListMap == null) { _dataId_NotInScopeRelation_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_dataId_NotInScopeRelation_BuriStateListMap.size() + 1);
        _dataId_NotInScopeRelation_BuriStateListMap.put(key, subQuery); return "dataId_NotInScopeRelation_BuriStateList." + key;
    }

    protected Map<String, BuriBranchCQ> _dataId_NotInScopeRelation_BuriBranchListMap;
    public Map<String, BuriBranchCQ> getDataId_NotInScopeRelation_BuriBranchList() { return _dataId_NotInScopeRelation_BuriBranchListMap; }
    public String keepDataId_NotInScopeRelation_BuriBranchList(BuriBranchCQ subQuery) {
        if (_dataId_NotInScopeRelation_BuriBranchListMap == null) { _dataId_NotInScopeRelation_BuriBranchListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_dataId_NotInScopeRelation_BuriBranchListMap.size() + 1);
        _dataId_NotInScopeRelation_BuriBranchListMap.put(key, subQuery); return "dataId_NotInScopeRelation_BuriBranchList." + key;
    }

    protected Map<String, BuriStateCQ> _dataId_QueryDerivedReferrer_BuriStateListMap;
    public Map<String, BuriStateCQ> getDataId_QueryDerivedReferrer_BuriStateList() { return _dataId_QueryDerivedReferrer_BuriStateListMap; }
    public String keepDataId_QueryDerivedReferrer_BuriStateList(BuriStateCQ subQuery) {
        if (_dataId_QueryDerivedReferrer_BuriStateListMap == null) { _dataId_QueryDerivedReferrer_BuriStateListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_dataId_QueryDerivedReferrer_BuriStateListMap.size() + 1);
        _dataId_QueryDerivedReferrer_BuriStateListMap.put(key, subQuery); return "dataId_QueryDerivedReferrer_BuriStateList." + key;
    }
    protected Map<String, Object> _dataId_QueryDerivedReferrer_BuriStateListParameterMap;
    public Map<String, Object> getDataId_QueryDerivedReferrer_BuriStateListParameter() { return _dataId_QueryDerivedReferrer_BuriStateListParameterMap; }
    public String keepDataId_QueryDerivedReferrer_BuriStateListParameter(Object parameterValue) {
        if (_dataId_QueryDerivedReferrer_BuriStateListParameterMap == null) { _dataId_QueryDerivedReferrer_BuriStateListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_dataId_QueryDerivedReferrer_BuriStateListParameterMap.size() + 1);
        _dataId_QueryDerivedReferrer_BuriStateListParameterMap.put(key, parameterValue); return "dataId_QueryDerivedReferrer_BuriStateListParameter." + key;
    }

    protected Map<String, BuriBranchCQ> _dataId_QueryDerivedReferrer_BuriBranchListMap;
    public Map<String, BuriBranchCQ> getDataId_QueryDerivedReferrer_BuriBranchList() { return _dataId_QueryDerivedReferrer_BuriBranchListMap; }
    public String keepDataId_QueryDerivedReferrer_BuriBranchList(BuriBranchCQ subQuery) {
        if (_dataId_QueryDerivedReferrer_BuriBranchListMap == null) { _dataId_QueryDerivedReferrer_BuriBranchListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_dataId_QueryDerivedReferrer_BuriBranchListMap.size() + 1);
        _dataId_QueryDerivedReferrer_BuriBranchListMap.put(key, subQuery); return "dataId_QueryDerivedReferrer_BuriBranchList." + key;
    }
    protected Map<String, Object> _dataId_QueryDerivedReferrer_BuriBranchListParameterMap;
    public Map<String, Object> getDataId_QueryDerivedReferrer_BuriBranchListParameter() { return _dataId_QueryDerivedReferrer_BuriBranchListParameterMap; }
    public String keepDataId_QueryDerivedReferrer_BuriBranchListParameter(Object parameterValue) {
        if (_dataId_QueryDerivedReferrer_BuriBranchListParameterMap == null) { _dataId_QueryDerivedReferrer_BuriBranchListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_dataId_QueryDerivedReferrer_BuriBranchListParameterMap.size() + 1);
        _dataId_QueryDerivedReferrer_BuriBranchListParameterMap.put(key, parameterValue); return "dataId_QueryDerivedReferrer_BuriBranchListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * DATAID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataCQ addOrderBy_DataId_Asc() { regOBA("DATAID"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATAID: {PK, NotNull, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataCQ addOrderBy_DataId_Desc() { regOBD("DATAID"); return this; }

    protected ConditionValue _pkeyVal;
    public ConditionValue getPkeyVal() {
        if (_pkeyVal == null) { _pkeyVal = nCV(); }
        return _pkeyVal;
    }
    protected ConditionValue getCValuePkeyVal() { return getPkeyVal(); }

    /** 
     * Add order-by as ascend. <br />
     * PKEYVAL: {IX, VARCHAR2(250)}
     * @return this. (NotNull)
     */
    public BsBuriDataCQ addOrderBy_PkeyVal_Asc() { regOBA("PKEYVAL"); return this; }

    /**
     * Add order-by as descend. <br />
     * PKEYVAL: {IX, VARCHAR2(250)}
     * @return this. (NotNull)
     */
    public BsBuriDataCQ addOrderBy_PkeyVal_Desc() { regOBD("PKEYVAL"); return this; }

    protected ConditionValue _pkeyNum;
    public ConditionValue getPkeyNum() {
        if (_pkeyNum == null) { _pkeyNum = nCV(); }
        return _pkeyNum;
    }
    protected ConditionValue getCValuePkeyNum() { return getPkeyNum(); }

    /** 
     * Add order-by as ascend. <br />
     * PKEYNUM: {IX, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataCQ addOrderBy_PkeyNum_Asc() { regOBA("PKEYNUM"); return this; }

    /**
     * Add order-by as descend. <br />
     * PKEYNUM: {IX, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataCQ addOrderBy_PkeyNum_Desc() { regOBD("PKEYNUM"); return this; }

    protected ConditionValue _dataType;
    public ConditionValue getDataType() {
        if (_dataType == null) { _dataType = nCV(); }
        return _dataType;
    }
    protected ConditionValue getCValueDataType() { return getDataType(); }

    /** 
     * Add order-by as ascend. <br />
     * DATATYPE: {IX+, NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriDataCQ addOrderBy_DataType_Asc() { regOBA("DATATYPE"); return this; }

    /**
     * Add order-by as descend. <br />
     * DATATYPE: {IX+, NotNull, VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriDataCQ addOrderBy_DataType_Desc() { regOBD("DATATYPE"); return this; }

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
    public BsBuriDataCQ addOrderBy_TableName_Asc() { regOBA("TABLENAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * TABLENAME: {VARCHAR2(200)}
     * @return this. (NotNull)
     */
    public BsBuriDataCQ addOrderBy_TableName_Desc() { regOBD("TABLENAME"); return this; }

    protected ConditionValue _insertUserId;
    public ConditionValue getInsertUserId() {
        if (_insertUserId == null) { _insertUserId = nCV(); }
        return _insertUserId;
    }
    protected ConditionValue getCValueInsertUserId() { return getInsertUserId(); }

    /** 
     * Add order-by as ascend. <br />
     * INSERTUSERID: {IX, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataCQ addOrderBy_InsertUserId_Asc() { regOBA("INSERTUSERID"); return this; }

    /**
     * Add order-by as descend. <br />
     * INSERTUSERID: {IX, NUMBER(18)}
     * @return this. (NotNull)
     */
    public BsBuriDataCQ addOrderBy_InsertUserId_Desc() { regOBD("INSERTUSERID"); return this; }

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
    public BsBuriDataCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsBuriDataCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, BuriDataCQ> _scalarConditionMap;
    public Map<String, BuriDataCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(BuriDataCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, BuriDataCQ> _specifyMyselfDerivedMap;
    public Map<String, BuriDataCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(BuriDataCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, BuriDataCQ> _queryMyselfDerivedMap;
    public Map<String, BuriDataCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(BuriDataCQ subQuery) {
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
    protected Map<String, BuriDataCQ> _myselfExistsMap;
    public Map<String, BuriDataCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(BuriDataCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, BuriDataCQ> _myselfInScopeMap;
    public Map<String, BuriDataCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(BuriDataCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return BuriDataCB.class.getName(); }
    protected String xCQ() { return BuriDataCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

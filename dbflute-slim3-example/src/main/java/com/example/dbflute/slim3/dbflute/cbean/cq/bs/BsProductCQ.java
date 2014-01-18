package com.example.dbflute.slim3.dbflute.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.slim3.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.slim3.dbflute.cbean.*;
import com.example.dbflute.slim3.dbflute.cbean.cq.*;

/**
 * The base condition-query of PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class BsProductCQ extends AbstractBsProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PRODUCT) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ProductCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ProductCIQ xcreateCIQ() {
        ProductCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ProductCIQ xnewCIQ() {
        return new ProductCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PRODUCT on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ProductCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _productId;
    public ConditionValue getProductId() {
        if (_productId == null) { _productId = nCV(); }
        return _productId;
    }
    protected ConditionValue getCValueProductId() { return getProductId(); }

    protected Map<String, PurchaseCQ> _productId_ExistsReferrer_PurchaseListMap;
    public Map<String, PurchaseCQ> getProductId_ExistsReferrer_PurchaseList() { return _productId_ExistsReferrer_PurchaseListMap; }
    public String keepProductId_ExistsReferrer_PurchaseList(PurchaseCQ subQuery) {
        if (_productId_ExistsReferrer_PurchaseListMap == null) { _productId_ExistsReferrer_PurchaseListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productId_ExistsReferrer_PurchaseListMap.size() + 1);
        _productId_ExistsReferrer_PurchaseListMap.put(key, subQuery); return "productId_ExistsReferrer_PurchaseList." + key;
    }

    protected Map<String, PurchaseCQ> _productId_NotExistsReferrer_PurchaseListMap;
    public Map<String, PurchaseCQ> getProductId_NotExistsReferrer_PurchaseList() { return _productId_NotExistsReferrer_PurchaseListMap; }
    public String keepProductId_NotExistsReferrer_PurchaseList(PurchaseCQ subQuery) {
        if (_productId_NotExistsReferrer_PurchaseListMap == null) { _productId_NotExistsReferrer_PurchaseListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productId_NotExistsReferrer_PurchaseListMap.size() + 1);
        _productId_NotExistsReferrer_PurchaseListMap.put(key, subQuery); return "productId_NotExistsReferrer_PurchaseList." + key;
    }

    protected Map<String, PurchaseCQ> _productId_SpecifyDerivedReferrer_PurchaseListMap;
    public Map<String, PurchaseCQ> getProductId_SpecifyDerivedReferrer_PurchaseList() { return _productId_SpecifyDerivedReferrer_PurchaseListMap; }
    public String keepProductId_SpecifyDerivedReferrer_PurchaseList(PurchaseCQ subQuery) {
        if (_productId_SpecifyDerivedReferrer_PurchaseListMap == null) { _productId_SpecifyDerivedReferrer_PurchaseListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productId_SpecifyDerivedReferrer_PurchaseListMap.size() + 1);
        _productId_SpecifyDerivedReferrer_PurchaseListMap.put(key, subQuery); return "productId_SpecifyDerivedReferrer_PurchaseList." + key;
    }

    protected Map<String, PurchaseCQ> _productId_InScopeRelation_PurchaseListMap;
    public Map<String, PurchaseCQ> getProductId_InScopeRelation_PurchaseList() { return _productId_InScopeRelation_PurchaseListMap; }
    public String keepProductId_InScopeRelation_PurchaseList(PurchaseCQ subQuery) {
        if (_productId_InScopeRelation_PurchaseListMap == null) { _productId_InScopeRelation_PurchaseListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productId_InScopeRelation_PurchaseListMap.size() + 1);
        _productId_InScopeRelation_PurchaseListMap.put(key, subQuery); return "productId_InScopeRelation_PurchaseList." + key;
    }

    protected Map<String, PurchaseCQ> _productId_NotInScopeRelation_PurchaseListMap;
    public Map<String, PurchaseCQ> getProductId_NotInScopeRelation_PurchaseList() { return _productId_NotInScopeRelation_PurchaseListMap; }
    public String keepProductId_NotInScopeRelation_PurchaseList(PurchaseCQ subQuery) {
        if (_productId_NotInScopeRelation_PurchaseListMap == null) { _productId_NotInScopeRelation_PurchaseListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productId_NotInScopeRelation_PurchaseListMap.size() + 1);
        _productId_NotInScopeRelation_PurchaseListMap.put(key, subQuery); return "productId_NotInScopeRelation_PurchaseList." + key;
    }

    protected Map<String, PurchaseCQ> _productId_QueryDerivedReferrer_PurchaseListMap;
    public Map<String, PurchaseCQ> getProductId_QueryDerivedReferrer_PurchaseList() { return _productId_QueryDerivedReferrer_PurchaseListMap; }
    public String keepProductId_QueryDerivedReferrer_PurchaseList(PurchaseCQ subQuery) {
        if (_productId_QueryDerivedReferrer_PurchaseListMap == null) { _productId_QueryDerivedReferrer_PurchaseListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productId_QueryDerivedReferrer_PurchaseListMap.size() + 1);
        _productId_QueryDerivedReferrer_PurchaseListMap.put(key, subQuery); return "productId_QueryDerivedReferrer_PurchaseList." + key;
    }
    protected Map<String, Object> _productId_QueryDerivedReferrer_PurchaseListParameterMap;
    public Map<String, Object> getProductId_QueryDerivedReferrer_PurchaseListParameter() { return _productId_QueryDerivedReferrer_PurchaseListParameterMap; }
    public String keepProductId_QueryDerivedReferrer_PurchaseListParameter(Object parameterValue) {
        if (_productId_QueryDerivedReferrer_PurchaseListParameterMap == null) { _productId_QueryDerivedReferrer_PurchaseListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_productId_QueryDerivedReferrer_PurchaseListParameterMap.size() + 1);
        _productId_QueryDerivedReferrer_PurchaseListParameterMap.put(key, parameterValue); return "productId_QueryDerivedReferrer_PurchaseListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_ID: {PK, ID, NotNull, INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productName;
    public ConditionValue getProductName() {
        if (_productName == null) { _productName = nCV(); }
        return _productName;
    }
    protected ConditionValue getCValueProductName() { return getProductName(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_NAME: {IX, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductName_Asc() { regOBA("PRODUCT_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_NAME: {IX, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductName_Desc() { regOBD("PRODUCT_NAME"); return this; }

    protected ConditionValue _productHandleCode;
    public ConditionValue getProductHandleCode() {
        if (_productHandleCode == null) { _productHandleCode = nCV(); }
        return _productHandleCode;
    }
    protected ConditionValue getCValueProductHandleCode() { return getProductHandleCode(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductHandleCode_Asc() { regOBA("PRODUCT_HANDLE_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_HANDLE_CODE: {UQ, NotNull, VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductHandleCode_Desc() { regOBD("PRODUCT_HANDLE_CODE"); return this; }

    protected ConditionValue _productStatusCode;
    public ConditionValue getProductStatusCode() {
        if (_productStatusCode == null) { _productStatusCode = nCV(); }
        return _productStatusCode;
    }
    protected ConditionValue getCValueProductStatusCode() { return getProductStatusCode(); }

    protected Map<String, ProductStatusCQ> _productStatusCode_InScopeRelation_ProductStatusMap;
    public Map<String, ProductStatusCQ> getProductStatusCode_InScopeRelation_ProductStatus() { return _productStatusCode_InScopeRelation_ProductStatusMap; }
    public String keepProductStatusCode_InScopeRelation_ProductStatus(ProductStatusCQ subQuery) {
        if (_productStatusCode_InScopeRelation_ProductStatusMap == null) { _productStatusCode_InScopeRelation_ProductStatusMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productStatusCode_InScopeRelation_ProductStatusMap.size() + 1);
        _productStatusCode_InScopeRelation_ProductStatusMap.put(key, subQuery); return "productStatusCode_InScopeRelation_ProductStatus." + key;
    }

    protected Map<String, ProductStatusCQ> _productStatusCode_NotInScopeRelation_ProductStatusMap;
    public Map<String, ProductStatusCQ> getProductStatusCode_NotInScopeRelation_ProductStatus() { return _productStatusCode_NotInScopeRelation_ProductStatusMap; }
    public String keepProductStatusCode_NotInScopeRelation_ProductStatus(ProductStatusCQ subQuery) {
        if (_productStatusCode_NotInScopeRelation_ProductStatusMap == null) { _productStatusCode_NotInScopeRelation_ProductStatusMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productStatusCode_NotInScopeRelation_ProductStatusMap.size() + 1);
        _productStatusCode_NotInScopeRelation_ProductStatusMap.put(key, subQuery); return "productStatusCode_NotInScopeRelation_ProductStatus." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_STATUS_CODE: {IX, NotNull, CHAR(3), FK to PRODUCT_STATUS}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue getRegisterDatetime() {
        if (_registerDatetime == null) { _registerDatetime = nCV(); }
        return _registerDatetime;
    }
    protected ConditionValue getCValueRegisterDatetime() { return getRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _registerUser;
    public ConditionValue getRegisterUser() {
        if (_registerUser == null) { _registerUser = nCV(); }
        return _registerUser;
    }
    protected ConditionValue getCValueRegisterUser() { return getRegisterUser(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterUser_Asc() { regOBA("REGISTER_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterUser_Desc() { regOBD("REGISTER_USER"); return this; }

    protected ConditionValue _registerProcess;
    public ConditionValue getRegisterProcess() {
        if (_registerProcess == null) { _registerProcess = nCV(); }
        return _registerProcess;
    }
    protected ConditionValue getCValueRegisterProcess() { return getRegisterProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * REGISTER_PROCESS: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterProcess_Asc() { regOBA("REGISTER_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br />
     * REGISTER_PROCESS: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_RegisterProcess_Desc() { regOBD("REGISTER_PROCESS"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue getUpdateDatetime() {
        if (_updateDatetime == null) { _updateDatetime = nCV(); }
        return _updateDatetime;
    }
    protected ConditionValue getCValueUpdateDatetime() { return getUpdateDatetime(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateDatetime_Asc() { regOBA("UPDATE_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateDatetime_Desc() { regOBD("UPDATE_DATETIME"); return this; }

    protected ConditionValue _updateUser;
    public ConditionValue getUpdateUser() {
        if (_updateUser == null) { _updateUser = nCV(); }
        return _updateUser;
    }
    protected ConditionValue getCValueUpdateUser() { return getUpdateUser(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateUser_Asc() { regOBA("UPDATE_USER"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_USER: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateUser_Desc() { regOBD("UPDATE_USER"); return this; }

    protected ConditionValue _updateProcess;
    public ConditionValue getUpdateProcess() {
        if (_updateProcess == null) { _updateProcess = nCV(); }
        return _updateProcess;
    }
    protected ConditionValue getCValueUpdateProcess() { return getUpdateProcess(); }

    /** 
     * Add order-by as ascend. <br />
     * UPDATE_PROCESS: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateProcess_Asc() { regOBA("UPDATE_PROCESS"); return this; }

    /**
     * Add order-by as descend. <br />
     * UPDATE_PROCESS: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_UpdateProcess_Desc() { regOBD("UPDATE_PROCESS"); return this; }

    protected ConditionValue _versionNo;
    public ConditionValue getVersionNo() {
        if (_versionNo == null) { _versionNo = nCV(); }
        return _versionNo;
    }
    protected ConditionValue getCValueVersionNo() { return getVersionNo(); }

    /** 
     * Add order-by as ascend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_VersionNo_Asc() { regOBA("VERSION_NO"); return this; }

    /**
     * Add order-by as descend. <br />
     * VERSION_NO: {NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsProductCQ addOrderBy_VersionNo_Desc() { regOBD("VERSION_NO"); return this; }

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
    public BsProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
    { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        ProductCQ baseQuery = (ProductCQ)baseQueryAsSuper;
        ProductCQ unionQuery = (ProductCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryProductStatus()) {
            unionQuery.queryProductStatus().reflectRelationOnUnionQuery(baseQuery.queryProductStatus(), unionQuery.queryProductStatus());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br />
     * PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @return The instance of condition-query. (NotNull)
     */
    public ProductStatusCQ queryProductStatus() {
        return getConditionQueryProductStatus();
    }
    protected ProductStatusCQ _conditionQueryProductStatus;
    public ProductStatusCQ getConditionQueryProductStatus() {
        if (_conditionQueryProductStatus == null) {
            _conditionQueryProductStatus = xcreateQueryProductStatus();
            xsetupOuterJoinProductStatus();
        }
        return _conditionQueryProductStatus;
    }
    protected ProductStatusCQ xcreateQueryProductStatus() {
        String nrp = resolveNextRelationPath("PRODUCT", "productStatus");
        String jan = resolveJoinAliasName(nrp, xgetNextNestLevel());
        ProductStatusCQ cq = new ProductStatusCQ(this, xgetSqlClause(), jan, xgetNextNestLevel());
        cq.xsetBaseCB(_baseCB);
        cq.xsetForeignPropertyName("productStatus");
        cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinProductStatus() {
        ProductStatusCQ cq = getConditionQueryProductStatus();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put("PRODUCT_STATUS_CODE", "PRODUCT_STATUS_CODE");
        registerOuterJoin(cq, joinOnMap, "productStatus");
    }
    public boolean hasConditionQueryProductStatus() {
        return _conditionQueryProductStatus != null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    protected Map<String, ProductCQ> _scalarConditionMap;
    public Map<String, ProductCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(ProductCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, ProductCQ> _specifyMyselfDerivedMap;
    public Map<String, ProductCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(ProductCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, ProductCQ> _queryMyselfDerivedMap;
    public Map<String, ProductCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(ProductCQ subQuery) {
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
    protected Map<String, ProductCQ> _myselfExistsMap;
    public Map<String, ProductCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(ProductCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, ProductCQ> _myselfInScopeMap;
    public Map<String, ProductCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(ProductCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ProductCB.class.getName(); }
    protected String xCQ() { return ProductCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

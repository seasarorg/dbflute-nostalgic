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
 * The base condition-query of PRODUCT_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class BsProductStatusCQ extends AbstractBsProductStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProductStatusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsProductStatusCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from PRODUCT_STATUS) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public ProductStatusCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected ProductStatusCIQ xcreateCIQ() {
        ProductStatusCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected ProductStatusCIQ xnewCIQ() {
        return new ProductStatusCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join PRODUCT_STATUS on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public ProductStatusCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        ProductStatusCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _productStatusCode;
    public ConditionValue getProductStatusCode() {
        if (_productStatusCode == null) { _productStatusCode = nCV(); }
        return _productStatusCode;
    }
    protected ConditionValue getCValueProductStatusCode() { return getProductStatusCode(); }

    protected Map<String, ProductCQ> _productStatusCode_ExistsReferrer_ProductListMap;
    public Map<String, ProductCQ> getProductStatusCode_ExistsReferrer_ProductList() { return _productStatusCode_ExistsReferrer_ProductListMap; }
    public String keepProductStatusCode_ExistsReferrer_ProductList(ProductCQ subQuery) {
        if (_productStatusCode_ExistsReferrer_ProductListMap == null) { _productStatusCode_ExistsReferrer_ProductListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productStatusCode_ExistsReferrer_ProductListMap.size() + 1);
        _productStatusCode_ExistsReferrer_ProductListMap.put(key, subQuery); return "productStatusCode_ExistsReferrer_ProductList." + key;
    }

    protected Map<String, SummaryProductCQ> _productStatusCode_ExistsReferrer_SummaryProductListMap;
    public Map<String, SummaryProductCQ> getProductStatusCode_ExistsReferrer_SummaryProductList() { return _productStatusCode_ExistsReferrer_SummaryProductListMap; }
    public String keepProductStatusCode_ExistsReferrer_SummaryProductList(SummaryProductCQ subQuery) {
        if (_productStatusCode_ExistsReferrer_SummaryProductListMap == null) { _productStatusCode_ExistsReferrer_SummaryProductListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productStatusCode_ExistsReferrer_SummaryProductListMap.size() + 1);
        _productStatusCode_ExistsReferrer_SummaryProductListMap.put(key, subQuery); return "productStatusCode_ExistsReferrer_SummaryProductList." + key;
    }

    protected Map<String, ProductCQ> _productStatusCode_NotExistsReferrer_ProductListMap;
    public Map<String, ProductCQ> getProductStatusCode_NotExistsReferrer_ProductList() { return _productStatusCode_NotExistsReferrer_ProductListMap; }
    public String keepProductStatusCode_NotExistsReferrer_ProductList(ProductCQ subQuery) {
        if (_productStatusCode_NotExistsReferrer_ProductListMap == null) { _productStatusCode_NotExistsReferrer_ProductListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productStatusCode_NotExistsReferrer_ProductListMap.size() + 1);
        _productStatusCode_NotExistsReferrer_ProductListMap.put(key, subQuery); return "productStatusCode_NotExistsReferrer_ProductList." + key;
    }

    protected Map<String, SummaryProductCQ> _productStatusCode_NotExistsReferrer_SummaryProductListMap;
    public Map<String, SummaryProductCQ> getProductStatusCode_NotExistsReferrer_SummaryProductList() { return _productStatusCode_NotExistsReferrer_SummaryProductListMap; }
    public String keepProductStatusCode_NotExistsReferrer_SummaryProductList(SummaryProductCQ subQuery) {
        if (_productStatusCode_NotExistsReferrer_SummaryProductListMap == null) { _productStatusCode_NotExistsReferrer_SummaryProductListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productStatusCode_NotExistsReferrer_SummaryProductListMap.size() + 1);
        _productStatusCode_NotExistsReferrer_SummaryProductListMap.put(key, subQuery); return "productStatusCode_NotExistsReferrer_SummaryProductList." + key;
    }

    protected Map<String, ProductCQ> _productStatusCode_InScopeRelation_ProductListMap;
    public Map<String, ProductCQ> getProductStatusCode_InScopeRelation_ProductList() { return _productStatusCode_InScopeRelation_ProductListMap; }
    public String keepProductStatusCode_InScopeRelation_ProductList(ProductCQ subQuery) {
        if (_productStatusCode_InScopeRelation_ProductListMap == null) { _productStatusCode_InScopeRelation_ProductListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productStatusCode_InScopeRelation_ProductListMap.size() + 1);
        _productStatusCode_InScopeRelation_ProductListMap.put(key, subQuery); return "productStatusCode_InScopeRelation_ProductList." + key;
    }

    protected Map<String, SummaryProductCQ> _productStatusCode_InScopeRelation_SummaryProductListMap;
    public Map<String, SummaryProductCQ> getProductStatusCode_InScopeRelation_SummaryProductList() { return _productStatusCode_InScopeRelation_SummaryProductListMap; }
    public String keepProductStatusCode_InScopeRelation_SummaryProductList(SummaryProductCQ subQuery) {
        if (_productStatusCode_InScopeRelation_SummaryProductListMap == null) { _productStatusCode_InScopeRelation_SummaryProductListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productStatusCode_InScopeRelation_SummaryProductListMap.size() + 1);
        _productStatusCode_InScopeRelation_SummaryProductListMap.put(key, subQuery); return "productStatusCode_InScopeRelation_SummaryProductList." + key;
    }

    protected Map<String, ProductCQ> _productStatusCode_NotInScopeRelation_ProductListMap;
    public Map<String, ProductCQ> getProductStatusCode_NotInScopeRelation_ProductList() { return _productStatusCode_NotInScopeRelation_ProductListMap; }
    public String keepProductStatusCode_NotInScopeRelation_ProductList(ProductCQ subQuery) {
        if (_productStatusCode_NotInScopeRelation_ProductListMap == null) { _productStatusCode_NotInScopeRelation_ProductListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productStatusCode_NotInScopeRelation_ProductListMap.size() + 1);
        _productStatusCode_NotInScopeRelation_ProductListMap.put(key, subQuery); return "productStatusCode_NotInScopeRelation_ProductList." + key;
    }

    protected Map<String, SummaryProductCQ> _productStatusCode_NotInScopeRelation_SummaryProductListMap;
    public Map<String, SummaryProductCQ> getProductStatusCode_NotInScopeRelation_SummaryProductList() { return _productStatusCode_NotInScopeRelation_SummaryProductListMap; }
    public String keepProductStatusCode_NotInScopeRelation_SummaryProductList(SummaryProductCQ subQuery) {
        if (_productStatusCode_NotInScopeRelation_SummaryProductListMap == null) { _productStatusCode_NotInScopeRelation_SummaryProductListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productStatusCode_NotInScopeRelation_SummaryProductListMap.size() + 1);
        _productStatusCode_NotInScopeRelation_SummaryProductListMap.put(key, subQuery); return "productStatusCode_NotInScopeRelation_SummaryProductList." + key;
    }

    protected Map<String, ProductCQ> _productStatusCode_SpecifyDerivedReferrer_ProductListMap;
    public Map<String, ProductCQ> getProductStatusCode_SpecifyDerivedReferrer_ProductList() { return _productStatusCode_SpecifyDerivedReferrer_ProductListMap; }
    public String keepProductStatusCode_SpecifyDerivedReferrer_ProductList(ProductCQ subQuery) {
        if (_productStatusCode_SpecifyDerivedReferrer_ProductListMap == null) { _productStatusCode_SpecifyDerivedReferrer_ProductListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productStatusCode_SpecifyDerivedReferrer_ProductListMap.size() + 1);
        _productStatusCode_SpecifyDerivedReferrer_ProductListMap.put(key, subQuery); return "productStatusCode_SpecifyDerivedReferrer_ProductList." + key;
    }

    protected Map<String, SummaryProductCQ> _productStatusCode_SpecifyDerivedReferrer_SummaryProductListMap;
    public Map<String, SummaryProductCQ> getProductStatusCode_SpecifyDerivedReferrer_SummaryProductList() { return _productStatusCode_SpecifyDerivedReferrer_SummaryProductListMap; }
    public String keepProductStatusCode_SpecifyDerivedReferrer_SummaryProductList(SummaryProductCQ subQuery) {
        if (_productStatusCode_SpecifyDerivedReferrer_SummaryProductListMap == null) { _productStatusCode_SpecifyDerivedReferrer_SummaryProductListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productStatusCode_SpecifyDerivedReferrer_SummaryProductListMap.size() + 1);
        _productStatusCode_SpecifyDerivedReferrer_SummaryProductListMap.put(key, subQuery); return "productStatusCode_SpecifyDerivedReferrer_SummaryProductList." + key;
    }

    protected Map<String, ProductCQ> _productStatusCode_QueryDerivedReferrer_ProductListMap;
    public Map<String, ProductCQ> getProductStatusCode_QueryDerivedReferrer_ProductList() { return _productStatusCode_QueryDerivedReferrer_ProductListMap; }
    public String keepProductStatusCode_QueryDerivedReferrer_ProductList(ProductCQ subQuery) {
        if (_productStatusCode_QueryDerivedReferrer_ProductListMap == null) { _productStatusCode_QueryDerivedReferrer_ProductListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productStatusCode_QueryDerivedReferrer_ProductListMap.size() + 1);
        _productStatusCode_QueryDerivedReferrer_ProductListMap.put(key, subQuery); return "productStatusCode_QueryDerivedReferrer_ProductList." + key;
    }
    protected Map<String, Object> _productStatusCode_QueryDerivedReferrer_ProductListParameterMap;
    public Map<String, Object> getProductStatusCode_QueryDerivedReferrer_ProductListParameter() { return _productStatusCode_QueryDerivedReferrer_ProductListParameterMap; }
    public String keepProductStatusCode_QueryDerivedReferrer_ProductListParameter(Object parameterValue) {
        if (_productStatusCode_QueryDerivedReferrer_ProductListParameterMap == null) { _productStatusCode_QueryDerivedReferrer_ProductListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_productStatusCode_QueryDerivedReferrer_ProductListParameterMap.size() + 1);
        _productStatusCode_QueryDerivedReferrer_ProductListParameterMap.put(key, parameterValue); return "productStatusCode_QueryDerivedReferrer_ProductListParameter." + key;
    }

    protected Map<String, SummaryProductCQ> _productStatusCode_QueryDerivedReferrer_SummaryProductListMap;
    public Map<String, SummaryProductCQ> getProductStatusCode_QueryDerivedReferrer_SummaryProductList() { return _productStatusCode_QueryDerivedReferrer_SummaryProductListMap; }
    public String keepProductStatusCode_QueryDerivedReferrer_SummaryProductList(SummaryProductCQ subQuery) {
        if (_productStatusCode_QueryDerivedReferrer_SummaryProductListMap == null) { _productStatusCode_QueryDerivedReferrer_SummaryProductListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_productStatusCode_QueryDerivedReferrer_SummaryProductListMap.size() + 1);
        _productStatusCode_QueryDerivedReferrer_SummaryProductListMap.put(key, subQuery); return "productStatusCode_QueryDerivedReferrer_SummaryProductList." + key;
    }
    protected Map<String, Object> _productStatusCode_QueryDerivedReferrer_SummaryProductListParameterMap;
    public Map<String, Object> getProductStatusCode_QueryDerivedReferrer_SummaryProductListParameter() { return _productStatusCode_QueryDerivedReferrer_SummaryProductListParameterMap; }
    public String keepProductStatusCode_QueryDerivedReferrer_SummaryProductListParameter(Object parameterValue) {
        if (_productStatusCode_QueryDerivedReferrer_SummaryProductListParameterMap == null) { _productStatusCode_QueryDerivedReferrer_SummaryProductListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_productStatusCode_QueryDerivedReferrer_SummaryProductListParameterMap.size() + 1);
        _productStatusCode_QueryDerivedReferrer_SummaryProductListParameterMap.put(key, parameterValue); return "productStatusCode_QueryDerivedReferrer_SummaryProductListParameter." + key;
    }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_STATUS_CODE: {PK, NotNull, CHAR(3)}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _productStatusName;
    public ConditionValue getProductStatusName() {
        if (_productStatusName == null) { _productStatusName = nCV(); }
        return _productStatusName;
    }
    protected ConditionValue getCValueProductStatusName() { return getProductStatusName(); }

    /** 
     * Add order-by as ascend. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_ProductStatusName_Asc() { regOBA("PRODUCT_STATUS_NAME"); return this; }

    /**
     * Add order-by as descend. <br />
     * PRODUCT_STATUS_NAME: {UQ, NotNull, VARCHAR(50)}
     * @return this. (NotNull)
     */
    public BsProductStatusCQ addOrderBy_ProductStatusName_Desc() { regOBD("PRODUCT_STATUS_NAME"); return this; }

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
    public BsProductStatusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsProductStatusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, ProductStatusCQ> _scalarConditionMap;
    public Map<String, ProductStatusCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(ProductStatusCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, ProductStatusCQ> _specifyMyselfDerivedMap;
    public Map<String, ProductStatusCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(ProductStatusCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, ProductStatusCQ> _queryMyselfDerivedMap;
    public Map<String, ProductStatusCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(ProductStatusCQ subQuery) {
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
    protected Map<String, ProductStatusCQ> _myselfExistsMap;
    public Map<String, ProductStatusCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(ProductStatusCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, ProductStatusCQ> _myselfInScopeMap;
    public Map<String, ProductStatusCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(ProductStatusCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return ProductStatusCB.class.getName(); }
    protected String xCQ() { return ProductStatusCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

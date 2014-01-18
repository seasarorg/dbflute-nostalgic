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
 * The base condition-query of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public class BsVendorCheckCQ extends AbstractBsVendorCheckCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorCheckCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsVendorCheckCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br />
     * {select ... from ... left outer join (select * from VENDOR_CHECK) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public VendorCheckCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected VendorCheckCIQ xcreateCIQ() {
        VendorCheckCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected VendorCheckCIQ xnewCIQ() {
        return new VendorCheckCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br />
     * {select ... from ... left outer join VENDOR_CHECK on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #FD4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public VendorCheckCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        VendorCheckCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _vendorCheckId;
    public ConditionValue getVendorCheckId() {
        if (_vendorCheckId == null) { _vendorCheckId = nCV(); }
        return _vendorCheckId;
    }
    protected ConditionValue getCValueVendorCheckId() { return getVendorCheckId(); }

    /** 
     * Add order-by as ascend. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Asc() { regOBA("VENDOR_CHECK_ID"); return this; }

    /**
     * Add order-by as descend. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_VendorCheckId_Desc() { regOBD("VENDOR_CHECK_ID"); return this; }

    protected ConditionValue _decimalDigit;
    public ConditionValue getDecimalDigit() {
        if (_decimalDigit == null) { _decimalDigit = nCV(); }
        return _decimalDigit;
    }
    protected ConditionValue getCValueDecimalDigit() { return getDecimalDigit(); }

    /** 
     * Add order-by as ascend. <br />
     * DECIMAL_DIGIT: {NotNull, DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_DecimalDigit_Asc() { regOBA("DECIMAL_DIGIT"); return this; }

    /**
     * Add order-by as descend. <br />
     * DECIMAL_DIGIT: {NotNull, DECIMAL(5, 3)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_DecimalDigit_Desc() { regOBD("DECIMAL_DIGIT"); return this; }

    protected ConditionValue _integerNonDigit;
    public ConditionValue getIntegerNonDigit() {
        if (_integerNonDigit == null) { _integerNonDigit = nCV(); }
        return _integerNonDigit;
    }
    protected ConditionValue getCValueIntegerNonDigit() { return getIntegerNonDigit(); }

    /** 
     * Add order-by as ascend. <br />
     * INTEGER_NON_DIGIT: {NotNull, DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_IntegerNonDigit_Asc() { regOBA("INTEGER_NON_DIGIT"); return this; }

    /**
     * Add order-by as descend. <br />
     * INTEGER_NON_DIGIT: {NotNull, DECIMAL(5)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_IntegerNonDigit_Desc() { regOBD("INTEGER_NON_DIGIT"); return this; }

    protected ConditionValue _typeOfBoolean;
    public ConditionValue getTypeOfBoolean() {
        if (_typeOfBoolean == null) { _typeOfBoolean = nCV(); }
        return _typeOfBoolean;
    }
    protected ConditionValue getCValueTypeOfBoolean() { return getTypeOfBoolean(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_BOOLEAN: {NotNull, BOOLEAN(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBoolean_Asc() { regOBA("TYPE_OF_BOOLEAN"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_BOOLEAN: {NotNull, BOOLEAN(1)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfBoolean_Desc() { regOBD("TYPE_OF_BOOLEAN"); return this; }

    protected ConditionValue _typeOfText;
    public ConditionValue getTypeOfText() {
        if (_typeOfText == null) { _typeOfText = nCV(); }
        return _typeOfText;
    }
    protected ConditionValue getCValueTypeOfText() { return getTypeOfText(); }

    /** 
     * Add order-by as ascend. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfText_Asc() { regOBA("TYPE_OF_TEXT"); return this; }

    /**
     * Add order-by as descend. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     * @return this. (NotNull)
     */
    public BsVendorCheckCQ addOrderBy_TypeOfText_Desc() { regOBD("TYPE_OF_TEXT"); return this; }

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
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Asc(String aliasName)
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
    public BsVendorCheckCQ addSpecifiedDerivedOrderBy_Desc(String aliasName)
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
    protected Map<String, VendorCheckCQ> _scalarConditionMap;
    public Map<String, VendorCheckCQ> getScalarCondition() { return _scalarConditionMap; }
    public String keepScalarCondition(VendorCheckCQ subQuery) {
        if (_scalarConditionMap == null) { _scalarConditionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarConditionMap.size() + 1);
        _scalarConditionMap.put(key, subQuery); return "scalarCondition." + key;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    protected Map<String, VendorCheckCQ> _specifyMyselfDerivedMap;
    public Map<String, VendorCheckCQ> getSpecifyMyselfDerived() { return _specifyMyselfDerivedMap; }
    public String keepSpecifyMyselfDerived(VendorCheckCQ subQuery) {
        if (_specifyMyselfDerivedMap == null) { _specifyMyselfDerivedMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_specifyMyselfDerivedMap.size() + 1);
        _specifyMyselfDerivedMap.put(key, subQuery); return "specifyMyselfDerived." + key;
    }

    protected Map<String, VendorCheckCQ> _queryMyselfDerivedMap;
    public Map<String, VendorCheckCQ> getQueryMyselfDerived() { return _queryMyselfDerivedMap; }
    public String keepQueryMyselfDerived(VendorCheckCQ subQuery) {
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
    protected Map<String, VendorCheckCQ> _myselfExistsMap;
    public Map<String, VendorCheckCQ> getMyselfExists() { return _myselfExistsMap; }
    public String keepMyselfExists(VendorCheckCQ subQuery) {
        if (_myselfExistsMap == null) { _myselfExistsMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfExistsMap.size() + 1);
        _myselfExistsMap.put(key, subQuery); return "myselfExists." + key;
    }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    protected Map<String, VendorCheckCQ> _myselfInScopeMap;
    public Map<String, VendorCheckCQ> getMyselfInScope() { return _myselfInScopeMap; }
    public String keepMyselfInScope(VendorCheckCQ subQuery) {
        if (_myselfInScopeMap == null) { _myselfInScopeMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_myselfInScopeMap.size() + 1);
        _myselfInScopeMap.put(key, subQuery); return "myselfInScope." + key;
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return VendorCheckCB.class.getName(); }
    protected String xCQ() { return VendorCheckCQ.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

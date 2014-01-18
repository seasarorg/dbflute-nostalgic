package com.example.dbflute.teeda.dbflute.cbean.cq.bs;

import java.util.Map;

import com.example.dbflute.teeda.dbflute.allcommon.cbean.*;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.cvalue.ConditionValue;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.sqlclause.SqlClause;
import com.example.dbflute.teeda.dbflute.cbean.cq.ciq.*;
import com.example.dbflute.teeda.dbflute.cbean.*;
import com.example.dbflute.teeda.dbflute.cbean.cq.*;

/**
 * The base condition-query of SUMMARY_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class BsSummaryProductCQ extends AbstractBsSummaryProductCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected SummaryProductCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSummaryProductCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from SUMMARY_PRODUCT) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public SummaryProductCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new SummaryProductCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join SUMMARY_PRODUCT on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public SummaryProductCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        SummaryProductCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _productId;
    public ConditionValue getProductId() {
        if (_productId == null) { _productId = new ConditionValue(); }
        return _productId;
    }
    protected ConditionValue getCValueProductId() { return getProductId(); }

    public BsSummaryProductCQ addOrderBy_ProductId_Asc() { regOBA("PRODUCT_ID"); return this; }
    public BsSummaryProductCQ addOrderBy_ProductId_Desc() { regOBD("PRODUCT_ID"); return this; }

    protected ConditionValue _productName;
    public ConditionValue getProductName() {
        if (_productName == null) { _productName = new ConditionValue(); }
        return _productName;
    }
    protected ConditionValue getCValueProductName() { return getProductName(); }

    public BsSummaryProductCQ addOrderBy_ProductName_Asc() { regOBA("PRODUCT_NAME"); return this; }
    public BsSummaryProductCQ addOrderBy_ProductName_Desc() { regOBD("PRODUCT_NAME"); return this; }

    protected ConditionValue _productStatusCode;
    public ConditionValue getProductStatusCode() {
        if (_productStatusCode == null) { _productStatusCode = new ConditionValue(); }
        return _productStatusCode;
    }
    protected ConditionValue getCValueProductStatusCode() { return getProductStatusCode(); }

    public BsSummaryProductCQ addOrderBy_ProductStatusCode_Asc() { regOBA("PRODUCT_STATUS_CODE"); return this; }
    public BsSummaryProductCQ addOrderBy_ProductStatusCode_Desc() { regOBD("PRODUCT_STATUS_CODE"); return this; }

    protected ConditionValue _latestPurchaseDatetime;
    public ConditionValue getLatestPurchaseDatetime() {
        if (_latestPurchaseDatetime == null) { _latestPurchaseDatetime = new ConditionValue(); }
        return _latestPurchaseDatetime;
    }
    protected ConditionValue getCValueLatestPurchaseDatetime() { return getLatestPurchaseDatetime(); }

    public BsSummaryProductCQ addOrderBy_LatestPurchaseDatetime_Asc() { regOBA("LATEST_PURCHASE_DATETIME"); return this; }
    public BsSummaryProductCQ addOrderBy_LatestPurchaseDatetime_Desc() { regOBD("LATEST_PURCHASE_DATETIME"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsSummaryProductCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsSummaryProductCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return SummaryProductCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return SummaryProductCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

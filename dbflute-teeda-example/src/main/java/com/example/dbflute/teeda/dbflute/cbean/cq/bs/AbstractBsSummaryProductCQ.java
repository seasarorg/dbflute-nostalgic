package com.example.dbflute.teeda.dbflute.cbean.cq.bs;

import java.util.Collection;

import com.example.dbflute.teeda.dbflute.allcommon.dbmeta.DBMetaInstanceHandler;
import com.example.dbflute.teeda.dbflute.allcommon.dbmeta.DBMetaProvider;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.*;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.ckey.*;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.cvalue.ConditionValue;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.sqlclause.SqlClause;
import com.example.dbflute.teeda.dbflute.cbean.*;
import com.example.dbflute.teeda.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of SUMMARY_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsSummaryProductCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsSummaryProductCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return _dbmetaProvider;
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "SUMMARY_PRODUCT";
    }
    
    public String getTableSqlName() {
        return "SUMMARY_PRODUCT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param productId The value of productId as equal.
     */
    public void setProductId_Equal(Integer productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param productId The value of productId as greaterThan.
     */
    public void setProductId_GreaterThan(Integer productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param productId The value of productId as lessThan.
     */
    public void setProductId_LessThan(Integer productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param productId The value of productId as greaterEqual.
     */
    public void setProductId_GreaterEqual(Integer productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param productId The value of productId as lessEqual.
     */
    public void setProductId_LessEqual(Integer productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param productIdList The collection of productId as inScope.
     */
    public void setProductId_InScope(Collection<Integer> productIdList) {
        regProductId(CK_INS, cTL(productIdList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param productIdList The collection of productId as notInScope.
     */
    public void setProductId_NotInScope(Collection<Integer> productIdList) {
        regProductId(CK_NINS, cTL(productIdList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DUMMY_OBJECT); }

    protected void regProductId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueProductId(), "PRODUCT_ID", "ProductId", "productId");
    }
    protected void registerInlineProductId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueProductId(), "PRODUCT_ID", "ProductId", "productId");
    }
    abstract protected ConditionValue getCValueProductId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param productName The value of productName as equal.
     */
    public void setProductName_Equal(String productName) {
        regProductName(CK_EQ, fRES(productName));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productName The value of productName as notEqual.
     */
    public void setProductName_NotEqual(String productName) {
        regProductName(CK_NE, fRES(productName));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productName The value of productName as greaterThan.
     */
    public void setProductName_GreaterThan(String productName) {
        regProductName(CK_GT, fRES(productName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productName The value of productName as lessThan.
     */
    public void setProductName_LessThan(String productName) {
        regProductName(CK_LT, fRES(productName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productName The value of productName as greaterEqual.
     */
    public void setProductName_GreaterEqual(String productName) {
        regProductName(CK_GE, fRES(productName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productName The value of productName as lessEqual.
     */
    public void setProductName_LessEqual(String productName) {
        regProductName(CK_LE, fRES(productName));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productName The value of productName as prefixSearch.
     */
    public void setProductName_PrefixSearch(String productName) {
        regProductName(CK_PS, fRES(productName));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param productNameList The collection of productName as inScope.
     */
    public void setProductName_InScope(Collection<String> productNameList) {
        regProductName(CK_INS, cTL(productNameList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param productNameList The collection of productName as notInScope.
     */
    public void setProductName_NotInScope(Collection<String> productNameList) {
        regProductName(CK_NINS, cTL(productNameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param productName The value of productName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductName_LikeSearch(String productName, com.example.dbflute.teeda.dbflute.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productName), getCValueProductName(), "PRODUCT_NAME", "ProductName", "productName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param productName The value of productName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductName_NotLikeSearch(String productName, com.example.dbflute.teeda.dbflute.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productName), getCValueProductName(), "PRODUCT_NAME", "ProductName", "productName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setProductName_IsNull() { regProductName(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setProductName_IsNotNull() { regProductName(CK_ISNN, DUMMY_OBJECT); }

    protected void regProductName(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueProductName(), "PRODUCT_NAME", "ProductName", "productName");
    }
    protected void registerInlineProductName(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueProductName(), "PRODUCT_NAME", "ProductName", "productName");
    }
    abstract protected ConditionValue getCValueProductName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {CHAR(3)}
     * @param productStatusCode The value of productStatusCode as equal.
     */
    public void setProductStatusCode_Equal(String productStatusCode) {
        regProductStatusCode(CK_EQ, fRES(productStatusCode));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productStatusCode The value of productStatusCode as notEqual.
     */
    public void setProductStatusCode_NotEqual(String productStatusCode) {
        regProductStatusCode(CK_NE, fRES(productStatusCode));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productStatusCode The value of productStatusCode as greaterThan.
     */
    public void setProductStatusCode_GreaterThan(String productStatusCode) {
        regProductStatusCode(CK_GT, fRES(productStatusCode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productStatusCode The value of productStatusCode as lessThan.
     */
    public void setProductStatusCode_LessThan(String productStatusCode) {
        regProductStatusCode(CK_LT, fRES(productStatusCode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productStatusCode The value of productStatusCode as greaterEqual.
     */
    public void setProductStatusCode_GreaterEqual(String productStatusCode) {
        regProductStatusCode(CK_GE, fRES(productStatusCode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productStatusCode The value of productStatusCode as lessEqual.
     */
    public void setProductStatusCode_LessEqual(String productStatusCode) {
        regProductStatusCode(CK_LE, fRES(productStatusCode));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productStatusCode The value of productStatusCode as prefixSearch.
     */
    public void setProductStatusCode_PrefixSearch(String productStatusCode) {
        regProductStatusCode(CK_PS, fRES(productStatusCode));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param productStatusCodeList The collection of productStatusCode as inScope.
     */
    public void setProductStatusCode_InScope(Collection<String> productStatusCodeList) {
        regProductStatusCode(CK_INS, cTL(productStatusCodeList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param productStatusCodeList The collection of productStatusCode as notInScope.
     */
    public void setProductStatusCode_NotInScope(Collection<String> productStatusCodeList) {
        regProductStatusCode(CK_NINS, cTL(productStatusCodeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param productStatusCode The value of productStatusCode as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductStatusCode_LikeSearch(String productStatusCode, com.example.dbflute.teeda.dbflute.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productStatusCode), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE", "ProductStatusCode", "productStatusCode", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param productStatusCode The value of productStatusCode as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductStatusCode_NotLikeSearch(String productStatusCode, com.example.dbflute.teeda.dbflute.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productStatusCode), getCValueProductStatusCode(), "PRODUCT_STATUS_CODE", "ProductStatusCode", "productStatusCode", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setProductStatusCode_IsNull() { regProductStatusCode(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setProductStatusCode_IsNotNull() { regProductStatusCode(CK_ISNN, DUMMY_OBJECT); }

    protected void regProductStatusCode(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueProductStatusCode(), "PRODUCT_STATUS_CODE", "ProductStatusCode", "productStatusCode");
    }
    protected void registerInlineProductStatusCode(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueProductStatusCode(), "PRODUCT_STATUS_CODE", "ProductStatusCode", "productStatusCode");
    }
    abstract protected ConditionValue getCValueProductStatusCode();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {TIMESTAMP}
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as equal.
     */
    public void setLatestPurchaseDatetime_Equal(java.sql.Timestamp latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_EQ, latestPurchaseDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as greaterThan.
     */
    public void setLatestPurchaseDatetime_GreaterThan(java.sql.Timestamp latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_GT, latestPurchaseDatetime);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as lessThan.
     */
    public void setLatestPurchaseDatetime_LessThan(java.sql.Timestamp latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_LT, latestPurchaseDatetime);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as greaterEqual.
     */
    public void setLatestPurchaseDatetime_GreaterEqual(java.sql.Timestamp latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_GE, latestPurchaseDatetime);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param latestPurchaseDatetime The value of latestPurchaseDatetime as lessEqual.
     */
    public void setLatestPurchaseDatetime_LessEqual(java.sql.Timestamp latestPurchaseDatetime) {
        regLatestPurchaseDatetime(CK_LE, latestPurchaseDatetime);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnlyOnceRegistered. {TIMESTAMP}
     * @param fromDate The from-date of latestPurchaseDatetime. (Nullable)
     * @param toDate The to-date of latestPurchaseDatetime. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setLatestPurchaseDatetime_FromTo(java.util.Date fromDate, java.util.Date toDate, com.example.dbflute.teeda.dbflute.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueLatestPurchaseDatetime(), "LATEST_PURCHASE_DATETIME", "LatestPurchaseDatetime", "latestPurchaseDatetime", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnlyOnceRegistered. {TIMESTAMP}
     * @param fromDate The from-date of latestPurchaseDatetime. (Nullable)
     * @param toDate The to-date of latestPurchaseDatetime. (Nullable)
     */
    public void setLatestPurchaseDatetime_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setLatestPurchaseDatetime_FromTo(fromDate, toDate, new com.example.dbflute.teeda.dbflute.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setLatestPurchaseDatetime_IsNull() { regLatestPurchaseDatetime(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setLatestPurchaseDatetime_IsNotNull() { regLatestPurchaseDatetime(CK_ISNN, DUMMY_OBJECT); }

    protected void regLatestPurchaseDatetime(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueLatestPurchaseDatetime(), "LATEST_PURCHASE_DATETIME", "LatestPurchaseDatetime", "latestPurchaseDatetime");
    }
    protected void registerInlineLatestPurchaseDatetime(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLatestPurchaseDatetime(), "LATEST_PURCHASE_DATETIME", "LatestPurchaseDatetime", "latestPurchaseDatetime");
    }
    abstract protected ConditionValue getCValueLatestPurchaseDatetime();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return SummaryProductCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return SummaryProductCQ.class.getName(); }
}

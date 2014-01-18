/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.cq.bs;

import java.util.Collection;

import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaProvider;
import dbflute.ldb.allcommon.cbean.*;
import dbflute.ldb.allcommon.cbean.ckey.*;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.cbean.*;
import dbflute.ldb.cbean.cq.*;

/**
 * The abstract condition-query of BLACK_ACTION_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsBlackActionLookupCQ extends LdAbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsBlackActionLookupCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected LdDBMetaProvider getDBMetaProvider() {
        return _dbmetaProvider;
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "BLACK_ACTION_LOOKUP";
    }
    
    public String getTableSqlName() {
        return "BLACK_ACTION_LOOKUP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {PK : NotNull : CHAR(3)}
     * @param blackActionCode The value of blackActionCode as equal.
     */
    public void setBlackActionCode_Equal(String blackActionCode) {
        regBlackActionCode(CK_EQ, fRES(blackActionCode));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setBlackActionCode_Equal_EmptyString() {
        regBlackActionCode(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param blackActionCode The value of blackActionCode as notEqual.
     */
    public void setBlackActionCode_NotEqual(String blackActionCode) {
        regBlackActionCode(CK_NE, fRES(blackActionCode));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param blackActionCode The value of blackActionCode as prefixSearch.
     */
    public void setBlackActionCode_PrefixSearch(String blackActionCode) {
        regBlackActionCode(CK_PS, fRES(blackActionCode));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param blackActionCodeList The collection of blackActionCode as inScope.
     */
    public void setBlackActionCode_InScope(Collection<String> blackActionCodeList) {
        regBlackActionCode(CK_INS, cTL(blackActionCodeList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param blackActionCodeList The collection of blackActionCode as notInScope.
     */
    public void setBlackActionCode_NotInScope(Collection<String> blackActionCodeList) {
        regBlackActionCode(CK_NINS, cTL(blackActionCodeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param blackActionCode The value of blackActionCode as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBlackActionCode_LikeSearch(String blackActionCode, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(blackActionCode), getCValueBlackActionCode(), "BLACK_ACTION_CODE", "BlackActionCode", "blackActionCode", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param blackActionCode The value of blackActionCode as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBlackActionCode_NotLikeSearch(String blackActionCode, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(blackActionCode), getCValueBlackActionCode(), "BLACK_ACTION_CODE", "BlackActionCode", "blackActionCode", likeSearchOption);
    }

    public void inScopeBlackActionList(LdSubQuery<LdBlackActionCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepBlackActionCode_InScopeSubQuery_BlackActionList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "BLACK_ACTION_CODE", "BLACK_ACTION_CODE", subQueryPropertyName);
    }
    public abstract String keepBlackActionCode_InScopeSubQuery_BlackActionList(LdBlackActionCQ subQuery);

    public void notInScopeBlackActionList(LdSubQuery<LdBlackActionCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepBlackActionCode_NotInScopeSubQuery_BlackActionList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "BLACK_ACTION_CODE", "BLACK_ACTION_CODE", subQueryPropertyName);
    }
    public abstract String keepBlackActionCode_NotInScopeSubQuery_BlackActionList(LdBlackActionCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select BLACK_ACTION_CODE from BLACK_ACTION where ...)}
     * @param subQuery The sub-query of BlackActionCode_ExistsSubQuery_BlackActionList for 'exists'. (NotNull)
     */
    public void existsBlackActionList(LdSubQuery<LdBlackActionCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepBlackActionCode_ExistsSubQuery_BlackActionList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "BLACK_ACTION_CODE", "BLACK_ACTION_CODE", subQueryPropertyName);
    }
    public abstract String keepBlackActionCode_ExistsSubQuery_BlackActionList(LdBlackActionCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select BLACK_ACTION_CODE from BLACK_ACTION where ...)}
     * @param subQuery The sub-query of BlackActionCode_NotExistsSubQuery_BlackActionList for 'not exists'. (NotNull)
     */
    public void notExistsBlackActionList(LdSubQuery<LdBlackActionCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepBlackActionCode_NotExistsSubQuery_BlackActionList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "BLACK_ACTION_CODE", "BLACK_ACTION_CODE", subQueryPropertyName);
    }
    public abstract String keepBlackActionCode_NotExistsSubQuery_BlackActionList(LdBlackActionCQ subQuery);

    public void xsderiveBlackActionList(String function, LdSubQuery<LdBlackActionCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepBlackActionCode_SpecifyDerivedReferrer_BlackActionList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "BLACK_ACTION_CODE", "BLACK_ACTION_CODE", subQueryPropertyName, aliasName);
    }
    public abstract String keepBlackActionCode_SpecifyDerivedReferrer_BlackActionList(LdBlackActionCQ subQuery);

    public QDRFunction<LdBlackActionCB> derivedBlackActionList() {
        return xcreateQDRFunctionBlackActionList();
    }
    protected QDRFunction<LdBlackActionCB> xcreateQDRFunctionBlackActionList() {
        return new QDRFunction<LdBlackActionCB>(new QDRSetupper<LdBlackActionCB>() {
            public void setup(String function, LdSubQuery<LdBlackActionCB> subQuery, String operand, Object value) {
                xqderiveBlackActionList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveBlackActionList(String function, LdSubQuery<LdBlackActionCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepBlackActionCode_QueryDerivedReferrer_BlackActionList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepBlackActionCode_QueryDerivedReferrer_BlackActionListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "BLACK_ACTION_CODE", "BLACK_ACTION_CODE", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepBlackActionCode_QueryDerivedReferrer_BlackActionList(LdBlackActionCQ subQuery);
    public abstract String keepBlackActionCode_QueryDerivedReferrer_BlackActionListParameter(Object parameterValue);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBlackActionCode_IsNull() { regBlackActionCode(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBlackActionCode_IsNotNull() { regBlackActionCode(CK_ISNN, DUMMY_OBJECT); }

    protected void regBlackActionCode(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueBlackActionCode(), "BLACK_ACTION_CODE", "BlackActionCode", "blackActionCode");
    }
    protected void registerInlineBlackActionCode(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBlackActionCode(), "BLACK_ACTION_CODE", "BlackActionCode", "blackActionCode");
    }
    abstract protected LdConditionValue getCValueBlackActionCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {NotNull : VARCHAR(80)}
     * @param blackActionName The value of blackActionName as equal.
     */
    public void setBlackActionName_Equal(String blackActionName) {
        regBlackActionName(CK_EQ, fRES(blackActionName));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setBlackActionName_Equal_EmptyString() {
        regBlackActionName(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param blackActionName The value of blackActionName as notEqual.
     */
    public void setBlackActionName_NotEqual(String blackActionName) {
        regBlackActionName(CK_NE, fRES(blackActionName));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param blackActionName The value of blackActionName as prefixSearch.
     */
    public void setBlackActionName_PrefixSearch(String blackActionName) {
        regBlackActionName(CK_PS, fRES(blackActionName));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param blackActionNameList The collection of blackActionName as inScope.
     */
    public void setBlackActionName_InScope(Collection<String> blackActionNameList) {
        regBlackActionName(CK_INS, cTL(blackActionNameList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param blackActionNameList The collection of blackActionName as notInScope.
     */
    public void setBlackActionName_NotInScope(Collection<String> blackActionNameList) {
        regBlackActionName(CK_NINS, cTL(blackActionNameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param blackActionName The value of blackActionName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBlackActionName_LikeSearch(String blackActionName, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(blackActionName), getCValueBlackActionName(), "BLACK_ACTION_NAME", "BlackActionName", "blackActionName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param blackActionName The value of blackActionName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBlackActionName_NotLikeSearch(String blackActionName, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(blackActionName), getCValueBlackActionName(), "BLACK_ACTION_NAME", "BlackActionName", "blackActionName", likeSearchOption);
    }

    protected void regBlackActionName(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueBlackActionName(), "BLACK_ACTION_NAME", "BlackActionName", "blackActionName");
    }
    protected void registerInlineBlackActionName(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBlackActionName(), "BLACK_ACTION_NAME", "BlackActionName", "blackActionName");
    }
    abstract protected LdConditionValue getCValueBlackActionName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {NotNull : VARCHAR(100) : Default=[default-user]}
     * @param rUser The value of rUser as equal.
     */
    public void setRUser_Equal(String rUser) {
        regRUser(CK_EQ, fRES(rUser));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setRUser_Equal_EmptyString() {
        regRUser(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param rUser The value of rUser as notEqual.
     */
    public void setRUser_NotEqual(String rUser) {
        regRUser(CK_NE, fRES(rUser));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param rUser The value of rUser as prefixSearch.
     */
    public void setRUser_PrefixSearch(String rUser) {
        regRUser(CK_PS, fRES(rUser));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param rUserList The collection of rUser as inScope.
     */
    public void setRUser_InScope(Collection<String> rUserList) {
        regRUser(CK_INS, cTL(rUserList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param rUserList The collection of rUser as notInScope.
     */
    public void setRUser_NotInScope(Collection<String> rUserList) {
        regRUser(CK_NINS, cTL(rUserList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param rUser The value of rUser as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRUser_LikeSearch(String rUser, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rUser), getCValueRUser(), "R_USER", "RUser", "rUser", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param rUser The value of rUser as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRUser_NotLikeSearch(String rUser, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rUser), getCValueRUser(), "R_USER", "RUser", "rUser", likeSearchOption);
    }

    protected void regRUser(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueRUser(), "R_USER", "RUser", "rUser");
    }
    protected void registerInlineRUser(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRUser(), "R_USER", "RUser", "rUser");
    }
    abstract protected LdConditionValue getCValueRUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {NotNull : VARCHAR(100) : Default=[default-module]}
     * @param rModule The value of rModule as equal.
     */
    public void setRModule_Equal(String rModule) {
        regRModule(CK_EQ, fRES(rModule));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setRModule_Equal_EmptyString() {
        regRModule(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param rModule The value of rModule as notEqual.
     */
    public void setRModule_NotEqual(String rModule) {
        regRModule(CK_NE, fRES(rModule));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param rModule The value of rModule as prefixSearch.
     */
    public void setRModule_PrefixSearch(String rModule) {
        regRModule(CK_PS, fRES(rModule));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param rModuleList The collection of rModule as inScope.
     */
    public void setRModule_InScope(Collection<String> rModuleList) {
        regRModule(CK_INS, cTL(rModuleList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param rModuleList The collection of rModule as notInScope.
     */
    public void setRModule_NotInScope(Collection<String> rModuleList) {
        regRModule(CK_NINS, cTL(rModuleList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param rModule The value of rModule as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRModule_LikeSearch(String rModule, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rModule), getCValueRModule(), "R_MODULE", "RModule", "rModule", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param rModule The value of rModule as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRModule_NotLikeSearch(String rModule, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rModule), getCValueRModule(), "R_MODULE", "RModule", "rModule", likeSearchOption);
    }

    protected void regRModule(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueRModule(), "R_MODULE", "RModule", "rModule");
    }
    protected void registerInlineRModule(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRModule(), "R_MODULE", "RModule", "rModule");
    }
    abstract protected LdConditionValue getCValueRModule();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]}
     * @param rTimestamp The value of rTimestamp as equal.
     */
    public void setRTimestamp_Equal(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_EQ, rTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param rTimestamp The value of rTimestamp as greaterThan.
     */
    public void setRTimestamp_GreaterThan(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_GT, rTimestamp);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param rTimestamp The value of rTimestamp as lessThan.
     */
    public void setRTimestamp_LessThan(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_LT, rTimestamp);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param rTimestamp The value of rTimestamp as greaterEqual.
     */
    public void setRTimestamp_GreaterEqual(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_GE, rTimestamp);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param rTimestamp The value of rTimestamp as lessEqual.
     */
    public void setRTimestamp_LessEqual(java.sql.Timestamp rTimestamp) {
        regRTimestamp(CK_LE, rTimestamp);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnlyOnceRegistered. {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]}
     * @param fromDate The from-date of rTimestamp. (Nullable)
     * @param toDate The to-date of rTimestamp. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setRTimestamp_FromTo(java.util.Date fromDate, java.util.Date toDate, dbflute.ldb.allcommon.cbean.coption.LdFromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueRTimestamp(), "R_TIMESTAMP", "RTimestamp", "rTimestamp", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnlyOnceRegistered. {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]}
     * @param fromDate The from-date of rTimestamp. (Nullable)
     * @param toDate The to-date of rTimestamp. (Nullable)
     */
    public void setRTimestamp_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setRTimestamp_FromTo(fromDate, toDate, new dbflute.ldb.allcommon.cbean.coption.LdDateFromToOption());
    }

    protected void regRTimestamp(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueRTimestamp(), "R_TIMESTAMP", "RTimestamp", "rTimestamp");
    }
    protected void registerInlineRTimestamp(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRTimestamp(), "R_TIMESTAMP", "RTimestamp", "rTimestamp");
    }
    abstract protected LdConditionValue getCValueRTimestamp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {NotNull : VARCHAR(100) : Default=[default-user]}
     * @param uUser The value of uUser as equal.
     */
    public void setUUser_Equal(String uUser) {
        regUUser(CK_EQ, fRES(uUser));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setUUser_Equal_EmptyString() {
        regUUser(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param uUser The value of uUser as notEqual.
     */
    public void setUUser_NotEqual(String uUser) {
        regUUser(CK_NE, fRES(uUser));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param uUser The value of uUser as prefixSearch.
     */
    public void setUUser_PrefixSearch(String uUser) {
        regUUser(CK_PS, fRES(uUser));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param uUserList The collection of uUser as inScope.
     */
    public void setUUser_InScope(Collection<String> uUserList) {
        regUUser(CK_INS, cTL(uUserList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param uUserList The collection of uUser as notInScope.
     */
    public void setUUser_NotInScope(Collection<String> uUserList) {
        regUUser(CK_NINS, cTL(uUserList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param uUser The value of uUser as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUUser_LikeSearch(String uUser, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uUser), getCValueUUser(), "U_USER", "UUser", "uUser", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param uUser The value of uUser as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUUser_NotLikeSearch(String uUser, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uUser), getCValueUUser(), "U_USER", "UUser", "uUser", likeSearchOption);
    }

    protected void regUUser(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueUUser(), "U_USER", "UUser", "uUser");
    }
    protected void registerInlineUUser(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueUUser(), "U_USER", "UUser", "uUser");
    }
    abstract protected LdConditionValue getCValueUUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {NotNull : VARCHAR(100) : Default=[default-module]}
     * @param uModule The value of uModule as equal.
     */
    public void setUModule_Equal(String uModule) {
        regUModule(CK_EQ, fRES(uModule));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setUModule_Equal_EmptyString() {
        regUModule(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param uModule The value of uModule as notEqual.
     */
    public void setUModule_NotEqual(String uModule) {
        regUModule(CK_NE, fRES(uModule));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param uModule The value of uModule as prefixSearch.
     */
    public void setUModule_PrefixSearch(String uModule) {
        regUModule(CK_PS, fRES(uModule));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param uModuleList The collection of uModule as inScope.
     */
    public void setUModule_InScope(Collection<String> uModuleList) {
        regUModule(CK_INS, cTL(uModuleList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param uModuleList The collection of uModule as notInScope.
     */
    public void setUModule_NotInScope(Collection<String> uModuleList) {
        regUModule(CK_NINS, cTL(uModuleList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param uModule The value of uModule as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUModule_LikeSearch(String uModule, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uModule), getCValueUModule(), "U_MODULE", "UModule", "uModule", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param uModule The value of uModule as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUModule_NotLikeSearch(String uModule, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uModule), getCValueUModule(), "U_MODULE", "UModule", "uModule", likeSearchOption);
    }

    protected void regUModule(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueUModule(), "U_MODULE", "UModule", "uModule");
    }
    protected void registerInlineUModule(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueUModule(), "U_MODULE", "UModule", "uModule");
    }
    abstract protected LdConditionValue getCValueUModule();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]}
     * @param uTimestamp The value of uTimestamp as equal.
     */
    public void setUTimestamp_Equal(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_EQ, uTimestamp);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param uTimestamp The value of uTimestamp as greaterThan.
     */
    public void setUTimestamp_GreaterThan(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_GT, uTimestamp);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param uTimestamp The value of uTimestamp as lessThan.
     */
    public void setUTimestamp_LessThan(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_LT, uTimestamp);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param uTimestamp The value of uTimestamp as greaterEqual.
     */
    public void setUTimestamp_GreaterEqual(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_GE, uTimestamp);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param uTimestamp The value of uTimestamp as lessEqual.
     */
    public void setUTimestamp_LessEqual(java.sql.Timestamp uTimestamp) {
        regUTimestamp(CK_LE, uTimestamp);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnlyOnceRegistered. {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]}
     * @param fromDate The from-date of uTimestamp. (Nullable)
     * @param toDate The to-date of uTimestamp. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setUTimestamp_FromTo(java.util.Date fromDate, java.util.Date toDate, dbflute.ldb.allcommon.cbean.coption.LdFromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueUTimestamp(), "U_TIMESTAMP", "UTimestamp", "uTimestamp", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnlyOnceRegistered. {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]}
     * @param fromDate The from-date of uTimestamp. (Nullable)
     * @param toDate The to-date of uTimestamp. (Nullable)
     */
    public void setUTimestamp_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setUTimestamp_FromTo(fromDate, toDate, new dbflute.ldb.allcommon.cbean.coption.LdDateFromToOption());
    }

    protected void regUTimestamp(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueUTimestamp(), "U_TIMESTAMP", "UTimestamp", "uTimestamp");
    }
    protected void registerInlineUTimestamp(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueUTimestamp(), "U_TIMESTAMP", "UTimestamp", "uTimestamp");
    }
    abstract protected LdConditionValue getCValueUTimestamp();

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    public SSQFunction<LdBlackActionLookupCB> scalar_Equal() {
        return xcreateSSQFunction("=");
    }

    public SSQFunction<LdBlackActionLookupCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(">=");
    }

    public SSQFunction<LdBlackActionLookupCB> scalar_GreaterThan() {
        return xcreateSSQFunction(">");
    }

    public SSQFunction<LdBlackActionLookupCB> scalar_LessEqual() {
        return xcreateSSQFunction("<=");
    }
    
    public SSQFunction<LdBlackActionLookupCB> scalar_LessThan() {
        return xcreateSSQFunction("<");
    }
    
    protected SSQFunction<LdBlackActionLookupCB> xcreateSSQFunction(final String operand) {
        return new SSQFunction<LdBlackActionLookupCB>(new SSQSetupper<LdBlackActionLookupCB>() {
            public void setup(String function, LdSubQuery<LdBlackActionLookupCB> subQuery) {
                xscalarSubQuery(function, subQuery, operand);
            }
        });
    }

    protected void xscalarSubQuery(String function, LdSubQuery<LdBlackActionLookupCB> subQuery, String operand) {
        assertObjectNotNull("subQuery<LdBlackActionLookupCB>", subQuery);
        LdBlackActionLookupCB cb = new LdBlackActionLookupCB(); cb.xsetupForScalarSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarSubQuery(cb.query()); // for saving query-value.
        registerScalarSubQuery(function, cb.query(), subQueryPropertyName, operand);
    }
    public abstract String keepScalarSubQuery(LdBlackActionLookupCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdBlackActionLookupCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdBlackActionLookupCQ.class.getName(); }
}

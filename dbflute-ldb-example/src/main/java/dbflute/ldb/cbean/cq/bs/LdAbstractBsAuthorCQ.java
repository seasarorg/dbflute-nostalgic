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
 * The abstract condition-query of AUTHOR.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsAuthorCQ extends LdAbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsAuthorCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "AUTHOR";
    }
    
    public String getTableSqlName() {
        return "AUTHOR";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {PK : ID : NotNull : INTEGER}
     * @param authorId The value of authorId as equal.
     */
    public void setAuthorId_Equal(Integer authorId) {
        regAuthorId(CK_EQ, authorId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param authorId The value of authorId as greaterThan.
     */
    public void setAuthorId_GreaterThan(Integer authorId) {
        regAuthorId(CK_GT, authorId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param authorId The value of authorId as lessThan.
     */
    public void setAuthorId_LessThan(Integer authorId) {
        regAuthorId(CK_LT, authorId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param authorId The value of authorId as greaterEqual.
     */
    public void setAuthorId_GreaterEqual(Integer authorId) {
        regAuthorId(CK_GE, authorId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param authorId The value of authorId as lessEqual.
     */
    public void setAuthorId_LessEqual(Integer authorId) {
        regAuthorId(CK_LE, authorId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param authorIdList The collection of authorId as inScope.
     */
    public void setAuthorId_InScope(Collection<Integer> authorIdList) {
        regAuthorId(CK_INS, cTL(authorIdList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param authorIdList The collection of authorId as notInScope.
     */
    public void setAuthorId_NotInScope(Collection<Integer> authorIdList) {
        regAuthorId(CK_NINS, cTL(authorIdList));
    }

    public void inScopeBookList(LdSubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepAuthorId_InScopeSubQuery_BookList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "AUTHOR_ID", "AUTHOR_ID", subQueryPropertyName);
    }
    public abstract String keepAuthorId_InScopeSubQuery_BookList(LdBookCQ subQuery);

    public void notInScopeBookList(LdSubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepAuthorId_NotInScopeSubQuery_BookList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "AUTHOR_ID", "AUTHOR_ID", subQueryPropertyName);
    }
    public abstract String keepAuthorId_NotInScopeSubQuery_BookList(LdBookCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select AUTHOR_ID from BOOK where ...)}
     * @param subQuery The sub-query of AuthorId_ExistsSubQuery_BookList for 'exists'. (NotNull)
     */
    public void existsBookList(LdSubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepAuthorId_ExistsSubQuery_BookList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "AUTHOR_ID", "AUTHOR_ID", subQueryPropertyName);
    }
    public abstract String keepAuthorId_ExistsSubQuery_BookList(LdBookCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select AUTHOR_ID from BOOK where ...)}
     * @param subQuery The sub-query of AuthorId_NotExistsSubQuery_BookList for 'not exists'. (NotNull)
     */
    public void notExistsBookList(LdSubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepAuthorId_NotExistsSubQuery_BookList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "AUTHOR_ID", "AUTHOR_ID", subQueryPropertyName);
    }
    public abstract String keepAuthorId_NotExistsSubQuery_BookList(LdBookCQ subQuery);

    public void xsderiveBookList(String function, LdSubQuery<LdBookCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepAuthorId_SpecifyDerivedReferrer_BookList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "AUTHOR_ID", "AUTHOR_ID", subQueryPropertyName, aliasName);
    }
    public abstract String keepAuthorId_SpecifyDerivedReferrer_BookList(LdBookCQ subQuery);

    public QDRFunction<LdBookCB> derivedBookList() {
        return xcreateQDRFunctionBookList();
    }
    protected QDRFunction<LdBookCB> xcreateQDRFunctionBookList() {
        return new QDRFunction<LdBookCB>(new QDRSetupper<LdBookCB>() {
            public void setup(String function, LdSubQuery<LdBookCB> subQuery, String operand, Object value) {
                xqderiveBookList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveBookList(String function, LdSubQuery<LdBookCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepAuthorId_QueryDerivedReferrer_BookList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepAuthorId_QueryDerivedReferrer_BookListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "AUTHOR_ID", "AUTHOR_ID", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepAuthorId_QueryDerivedReferrer_BookList(LdBookCQ subQuery);
    public abstract String keepAuthorId_QueryDerivedReferrer_BookListParameter(Object parameterValue);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setAuthorId_IsNull() { regAuthorId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setAuthorId_IsNotNull() { regAuthorId(CK_ISNN, DUMMY_OBJECT); }

    protected void regAuthorId(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueAuthorId(), "AUTHOR_ID", "AuthorId", "authorId");
    }
    protected void registerInlineAuthorId(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAuthorId(), "AUTHOR_ID", "AuthorId", "authorId");
    }
    abstract protected LdConditionValue getCValueAuthorId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {NotNull : VARCHAR(80)}
     * @param authorName The value of authorName as equal.
     */
    public void setAuthorName_Equal(String authorName) {
        regAuthorName(CK_EQ, fRES(authorName));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setAuthorName_Equal_EmptyString() {
        regAuthorName(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param authorName The value of authorName as notEqual.
     */
    public void setAuthorName_NotEqual(String authorName) {
        regAuthorName(CK_NE, fRES(authorName));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param authorName The value of authorName as prefixSearch.
     */
    public void setAuthorName_PrefixSearch(String authorName) {
        regAuthorName(CK_PS, fRES(authorName));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param authorNameList The collection of authorName as inScope.
     */
    public void setAuthorName_InScope(Collection<String> authorNameList) {
        regAuthorName(CK_INS, cTL(authorNameList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param authorNameList The collection of authorName as notInScope.
     */
    public void setAuthorName_NotInScope(Collection<String> authorNameList) {
        regAuthorName(CK_NINS, cTL(authorNameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param authorName The value of authorName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAuthorName_LikeSearch(String authorName, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(authorName), getCValueAuthorName(), "AUTHOR_NAME", "AuthorName", "authorName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param authorName The value of authorName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAuthorName_NotLikeSearch(String authorName, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(authorName), getCValueAuthorName(), "AUTHOR_NAME", "AuthorName", "authorName", likeSearchOption);
    }

    protected void regAuthorName(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueAuthorName(), "AUTHOR_NAME", "AuthorName", "authorName");
    }
    protected void registerInlineAuthorName(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAuthorName(), "AUTHOR_NAME", "AuthorName", "authorName");
    }
    abstract protected LdConditionValue getCValueAuthorName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {SMALLINT}
     * @param authorAge The value of authorAge as equal.
     */
    public void setAuthorAge_Equal(Integer authorAge) {
        regAuthorAge(CK_EQ, authorAge);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param authorAge The value of authorAge as greaterThan.
     */
    public void setAuthorAge_GreaterThan(Integer authorAge) {
        regAuthorAge(CK_GT, authorAge);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param authorAge The value of authorAge as lessThan.
     */
    public void setAuthorAge_LessThan(Integer authorAge) {
        regAuthorAge(CK_LT, authorAge);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param authorAge The value of authorAge as greaterEqual.
     */
    public void setAuthorAge_GreaterEqual(Integer authorAge) {
        regAuthorAge(CK_GE, authorAge);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param authorAge The value of authorAge as lessEqual.
     */
    public void setAuthorAge_LessEqual(Integer authorAge) {
        regAuthorAge(CK_LE, authorAge);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param authorAgeList The collection of authorAge as inScope.
     */
    public void setAuthorAge_InScope(Collection<Integer> authorAgeList) {
        regAuthorAge(CK_INS, cTL(authorAgeList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param authorAgeList The collection of authorAge as notInScope.
     */
    public void setAuthorAge_NotInScope(Collection<Integer> authorAgeList) {
        regAuthorAge(CK_NINS, cTL(authorAgeList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setAuthorAge_IsNull() { regAuthorAge(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setAuthorAge_IsNotNull() { regAuthorAge(CK_ISNN, DUMMY_OBJECT); }

    protected void regAuthorAge(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueAuthorAge(), "AUTHOR_AGE", "AuthorAge", "authorAge");
    }
    protected void registerInlineAuthorAge(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAuthorAge(), "AUTHOR_AGE", "AuthorAge", "authorAge");
    }
    abstract protected LdConditionValue getCValueAuthorAge();

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
    public SSQFunction<LdAuthorCB> scalar_Equal() {
        return xcreateSSQFunction("=");
    }

    public SSQFunction<LdAuthorCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(">=");
    }

    public SSQFunction<LdAuthorCB> scalar_GreaterThan() {
        return xcreateSSQFunction(">");
    }

    public SSQFunction<LdAuthorCB> scalar_LessEqual() {
        return xcreateSSQFunction("<=");
    }
    
    public SSQFunction<LdAuthorCB> scalar_LessThan() {
        return xcreateSSQFunction("<");
    }
    
    protected SSQFunction<LdAuthorCB> xcreateSSQFunction(final String operand) {
        return new SSQFunction<LdAuthorCB>(new SSQSetupper<LdAuthorCB>() {
            public void setup(String function, LdSubQuery<LdAuthorCB> subQuery) {
                xscalarSubQuery(function, subQuery, operand);
            }
        });
    }

    protected void xscalarSubQuery(String function, LdSubQuery<LdAuthorCB> subQuery, String operand) {
        assertObjectNotNull("subQuery<LdAuthorCB>", subQuery);
        LdAuthorCB cb = new LdAuthorCB(); cb.xsetupForScalarSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarSubQuery(cb.query()); // for saving query-value.
        registerScalarSubQuery(function, cb.query(), subQueryPropertyName, operand);
    }
    public abstract String keepScalarSubQuery(LdAuthorCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdAuthorCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdAuthorCQ.class.getName(); }
}

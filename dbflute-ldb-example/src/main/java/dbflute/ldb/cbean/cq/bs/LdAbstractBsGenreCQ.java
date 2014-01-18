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
 * The abstract condition-query of GENRE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsGenreCQ extends LdAbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsGenreCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "GENRE";
    }
    
    public String getTableSqlName() {
        return "GENRE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {PK : NotNull : VARCHAR(24)}
     * @param genreCode The value of genreCode as equal.
     */
    public void setGenreCode_Equal(String genreCode) {
        regGenreCode(CK_EQ, fRES(genreCode));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setGenreCode_Equal_EmptyString() {
        regGenreCode(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genreCode The value of genreCode as notEqual.
     */
    public void setGenreCode_NotEqual(String genreCode) {
        regGenreCode(CK_NE, fRES(genreCode));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genreCode The value of genreCode as prefixSearch.
     */
    public void setGenreCode_PrefixSearch(String genreCode) {
        regGenreCode(CK_PS, fRES(genreCode));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genreCodeList The collection of genreCode as inScope.
     */
    public void setGenreCode_InScope(Collection<String> genreCodeList) {
        regGenreCode(CK_INS, cTL(genreCodeList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genreCodeList The collection of genreCode as notInScope.
     */
    public void setGenreCode_NotInScope(Collection<String> genreCodeList) {
        regGenreCode(CK_NINS, cTL(genreCodeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genreCode The value of genreCode as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenreCode_LikeSearch(String genreCode, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genreCode), getCValueGenreCode(), "GENRE_CODE", "GenreCode", "genreCode", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genreCode The value of genreCode as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGenreCode_NotLikeSearch(String genreCode, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genreCode), getCValueGenreCode(), "GENRE_CODE", "GenreCode", "genreCode", likeSearchOption);
    }

    public void inScopeBookList(LdSubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepGenreCode_InScopeSubQuery_BookList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "GENRE_CODE", "GENRE_CODE", subQueryPropertyName);
    }
    public abstract String keepGenreCode_InScopeSubQuery_BookList(LdBookCQ subQuery);

    public void inScopeGenreSelfList(LdSubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery<LdGenreCB>", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepGenreCode_InScopeSubQuery_GenreSelfList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "GENRE_CODE", "PARENT_GENRE_CODE", subQueryPropertyName);
    }
    public abstract String keepGenreCode_InScopeSubQuery_GenreSelfList(LdGenreCQ subQuery);

    public void notInScopeBookList(LdSubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepGenreCode_NotInScopeSubQuery_BookList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "GENRE_CODE", "GENRE_CODE", subQueryPropertyName);
    }
    public abstract String keepGenreCode_NotInScopeSubQuery_BookList(LdBookCQ subQuery);

    public void notInScopeGenreSelfList(LdSubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery<LdGenreCB>", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepGenreCode_NotInScopeSubQuery_GenreSelfList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "GENRE_CODE", "PARENT_GENRE_CODE", subQueryPropertyName);
    }
    public abstract String keepGenreCode_NotInScopeSubQuery_GenreSelfList(LdGenreCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select GENRE_CODE from BOOK where ...)}
     * @param subQuery The sub-query of GenreCode_ExistsSubQuery_BookList for 'exists'. (NotNull)
     */
    public void existsBookList(LdSubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepGenreCode_ExistsSubQuery_BookList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "GENRE_CODE", "GENRE_CODE", subQueryPropertyName);
    }
    public abstract String keepGenreCode_ExistsSubQuery_BookList(LdBookCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select PARENT_GENRE_CODE from GENRE where ...)}
     * @param subQuery The sub-query of GenreCode_ExistsSubQuery_GenreSelfList for 'exists'. (NotNull)
     */
    public void existsGenreSelfList(LdSubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery<LdGenreCB>", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepGenreCode_ExistsSubQuery_GenreSelfList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "GENRE_CODE", "PARENT_GENRE_CODE", subQueryPropertyName);
    }
    public abstract String keepGenreCode_ExistsSubQuery_GenreSelfList(LdGenreCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select GENRE_CODE from BOOK where ...)}
     * @param subQuery The sub-query of GenreCode_NotExistsSubQuery_BookList for 'not exists'. (NotNull)
     */
    public void notExistsBookList(LdSubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepGenreCode_NotExistsSubQuery_BookList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "GENRE_CODE", "GENRE_CODE", subQueryPropertyName);
    }
    public abstract String keepGenreCode_NotExistsSubQuery_BookList(LdBookCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select PARENT_GENRE_CODE from GENRE where ...)}
     * @param subQuery The sub-query of GenreCode_NotExistsSubQuery_GenreSelfList for 'not exists'. (NotNull)
     */
    public void notExistsGenreSelfList(LdSubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery<LdGenreCB>", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepGenreCode_NotExistsSubQuery_GenreSelfList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "GENRE_CODE", "PARENT_GENRE_CODE", subQueryPropertyName);
    }
    public abstract String keepGenreCode_NotExistsSubQuery_GenreSelfList(LdGenreCQ subQuery);

    public void xsderiveBookList(String function, LdSubQuery<LdBookCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepGenreCode_SpecifyDerivedReferrer_BookList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "GENRE_CODE", "GENRE_CODE", subQueryPropertyName, aliasName);
    }
    public abstract String keepGenreCode_SpecifyDerivedReferrer_BookList(LdBookCQ subQuery);

    public void xsderiveGenreSelfList(String function, LdSubQuery<LdGenreCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<LdGenreCB>", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepGenreCode_SpecifyDerivedReferrer_GenreSelfList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "GENRE_CODE", "PARENT_GENRE_CODE", subQueryPropertyName, aliasName);
    }
    public abstract String keepGenreCode_SpecifyDerivedReferrer_GenreSelfList(LdGenreCQ subQuery);

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
        String subQueryPropertyName = keepGenreCode_QueryDerivedReferrer_BookList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepGenreCode_QueryDerivedReferrer_BookListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "GENRE_CODE", "GENRE_CODE", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepGenreCode_QueryDerivedReferrer_BookList(LdBookCQ subQuery);
    public abstract String keepGenreCode_QueryDerivedReferrer_BookListParameter(Object parameterValue);

    public QDRFunction<LdGenreCB> derivedGenreSelfList() {
        return xcreateQDRFunctionGenreSelfList();
    }
    protected QDRFunction<LdGenreCB> xcreateQDRFunctionGenreSelfList() {
        return new QDRFunction<LdGenreCB>(new QDRSetupper<LdGenreCB>() {
            public void setup(String function, LdSubQuery<LdGenreCB> subQuery, String operand, Object value) {
                xqderiveGenreSelfList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveGenreSelfList(String function, LdSubQuery<LdGenreCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<LdGenreCB>", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepGenreCode_QueryDerivedReferrer_GenreSelfList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepGenreCode_QueryDerivedReferrer_GenreSelfListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "GENRE_CODE", "PARENT_GENRE_CODE", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepGenreCode_QueryDerivedReferrer_GenreSelfList(LdGenreCQ subQuery);
    public abstract String keepGenreCode_QueryDerivedReferrer_GenreSelfListParameter(Object parameterValue);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setGenreCode_IsNull() { regGenreCode(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setGenreCode_IsNotNull() { regGenreCode(CK_ISNN, DUMMY_OBJECT); }

    protected void regGenreCode(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueGenreCode(), "GENRE_CODE", "GenreCode", "genreCode");
    }
    protected void registerInlineGenreCode(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueGenreCode(), "GENRE_CODE", "GenreCode", "genreCode");
    }
    abstract protected LdConditionValue getCValueGenreCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {NotNull : VARCHAR(80)}
     * @param genreName The value of genreName as equal.
     */
    public void setGenreName_Equal(String genreName) {
        regGenreName(CK_EQ, fRES(genreName));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setGenreName_Equal_EmptyString() {
        regGenreName(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genreName The value of genreName as notEqual.
     */
    public void setGenreName_NotEqual(String genreName) {
        regGenreName(CK_NE, fRES(genreName));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genreName The value of genreName as prefixSearch.
     */
    public void setGenreName_PrefixSearch(String genreName) {
        regGenreName(CK_PS, fRES(genreName));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genreNameList The collection of genreName as inScope.
     */
    public void setGenreName_InScope(Collection<String> genreNameList) {
        regGenreName(CK_INS, cTL(genreNameList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genreNameList The collection of genreName as notInScope.
     */
    public void setGenreName_NotInScope(Collection<String> genreNameList) {
        regGenreName(CK_NINS, cTL(genreNameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genreName The value of genreName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenreName_LikeSearch(String genreName, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genreName), getCValueGenreName(), "GENRE_NAME", "GenreName", "genreName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genreName The value of genreName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGenreName_NotLikeSearch(String genreName, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genreName), getCValueGenreName(), "GENRE_NAME", "GenreName", "genreName", likeSearchOption);
    }

    protected void regGenreName(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueGenreName(), "GENRE_NAME", "GenreName", "genreName");
    }
    protected void registerInlineGenreName(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueGenreName(), "GENRE_NAME", "GenreName", "genreName");
    }
    abstract protected LdConditionValue getCValueGenreName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : NUMERIC(9)}
     * @param hierarchyLevel The value of hierarchyLevel as equal.
     */
    public void setHierarchyLevel_Equal(Integer hierarchyLevel) {
        regHierarchyLevel(CK_EQ, hierarchyLevel);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param hierarchyLevel The value of hierarchyLevel as greaterThan.
     */
    public void setHierarchyLevel_GreaterThan(Integer hierarchyLevel) {
        regHierarchyLevel(CK_GT, hierarchyLevel);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param hierarchyLevel The value of hierarchyLevel as lessThan.
     */
    public void setHierarchyLevel_LessThan(Integer hierarchyLevel) {
        regHierarchyLevel(CK_LT, hierarchyLevel);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param hierarchyLevel The value of hierarchyLevel as greaterEqual.
     */
    public void setHierarchyLevel_GreaterEqual(Integer hierarchyLevel) {
        regHierarchyLevel(CK_GE, hierarchyLevel);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param hierarchyLevel The value of hierarchyLevel as lessEqual.
     */
    public void setHierarchyLevel_LessEqual(Integer hierarchyLevel) {
        regHierarchyLevel(CK_LE, hierarchyLevel);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param hierarchyLevelList The collection of hierarchyLevel as inScope.
     */
    public void setHierarchyLevel_InScope(Collection<Integer> hierarchyLevelList) {
        regHierarchyLevel(CK_INS, cTL(hierarchyLevelList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param hierarchyLevelList The collection of hierarchyLevel as notInScope.
     */
    public void setHierarchyLevel_NotInScope(Collection<Integer> hierarchyLevelList) {
        regHierarchyLevel(CK_NINS, cTL(hierarchyLevelList));
    }

    protected void regHierarchyLevel(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueHierarchyLevel(), "HIERARCHY_LEVEL", "HierarchyLevel", "hierarchyLevel");
    }
    protected void registerInlineHierarchyLevel(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueHierarchyLevel(), "HIERARCHY_LEVEL", "HierarchyLevel", "hierarchyLevel");
    }
    abstract protected LdConditionValue getCValueHierarchyLevel();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : NUMERIC(10)}
     * @param hierarchyOrder The value of hierarchyOrder as equal.
     */
    public void setHierarchyOrder_Equal(Long hierarchyOrder) {
        regHierarchyOrder(CK_EQ, hierarchyOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param hierarchyOrder The value of hierarchyOrder as greaterThan.
     */
    public void setHierarchyOrder_GreaterThan(Long hierarchyOrder) {
        regHierarchyOrder(CK_GT, hierarchyOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param hierarchyOrder The value of hierarchyOrder as lessThan.
     */
    public void setHierarchyOrder_LessThan(Long hierarchyOrder) {
        regHierarchyOrder(CK_LT, hierarchyOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param hierarchyOrder The value of hierarchyOrder as greaterEqual.
     */
    public void setHierarchyOrder_GreaterEqual(Long hierarchyOrder) {
        regHierarchyOrder(CK_GE, hierarchyOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param hierarchyOrder The value of hierarchyOrder as lessEqual.
     */
    public void setHierarchyOrder_LessEqual(Long hierarchyOrder) {
        regHierarchyOrder(CK_LE, hierarchyOrder);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param hierarchyOrderList The collection of hierarchyOrder as inScope.
     */
    public void setHierarchyOrder_InScope(Collection<Long> hierarchyOrderList) {
        regHierarchyOrder(CK_INS, cTL(hierarchyOrderList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param hierarchyOrderList The collection of hierarchyOrder as notInScope.
     */
    public void setHierarchyOrder_NotInScope(Collection<Long> hierarchyOrderList) {
        regHierarchyOrder(CK_NINS, cTL(hierarchyOrderList));
    }

    protected void regHierarchyOrder(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueHierarchyOrder(), "HIERARCHY_ORDER", "HierarchyOrder", "hierarchyOrder");
    }
    protected void registerInlineHierarchyOrder(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueHierarchyOrder(), "HIERARCHY_ORDER", "HierarchyOrder", "hierarchyOrder");
    }
    abstract protected LdConditionValue getCValueHierarchyOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(24) : FK to GENRE}
     * @param parentGenreCode The value of parentGenreCode as equal.
     */
    public void setParentGenreCode_Equal(String parentGenreCode) {
        regParentGenreCode(CK_EQ, fRES(parentGenreCode));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setParentGenreCode_Equal_EmptyString() {
        regParentGenreCode(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param parentGenreCode The value of parentGenreCode as notEqual.
     */
    public void setParentGenreCode_NotEqual(String parentGenreCode) {
        regParentGenreCode(CK_NE, fRES(parentGenreCode));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param parentGenreCode The value of parentGenreCode as prefixSearch.
     */
    public void setParentGenreCode_PrefixSearch(String parentGenreCode) {
        regParentGenreCode(CK_PS, fRES(parentGenreCode));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param parentGenreCodeList The collection of parentGenreCode as inScope.
     */
    public void setParentGenreCode_InScope(Collection<String> parentGenreCodeList) {
        regParentGenreCode(CK_INS, cTL(parentGenreCodeList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param parentGenreCodeList The collection of parentGenreCode as notInScope.
     */
    public void setParentGenreCode_NotInScope(Collection<String> parentGenreCodeList) {
        regParentGenreCode(CK_NINS, cTL(parentGenreCodeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param parentGenreCode The value of parentGenreCode as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setParentGenreCode_LikeSearch(String parentGenreCode, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(parentGenreCode), getCValueParentGenreCode(), "PARENT_GENRE_CODE", "ParentGenreCode", "parentGenreCode", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param parentGenreCode The value of parentGenreCode as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setParentGenreCode_NotLikeSearch(String parentGenreCode, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(parentGenreCode), getCValueParentGenreCode(), "PARENT_GENRE_CODE", "ParentGenreCode", "parentGenreCode", likeSearchOption);
    }

    public void inScopeGenreSelf(LdSubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery<LdGenreCB>", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepParentGenreCode_InScopeSubQuery_GenreSelf(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "PARENT_GENRE_CODE", "GENRE_CODE", subQueryPropertyName);
    }
    public abstract String keepParentGenreCode_InScopeSubQuery_GenreSelf(dbflute.ldb.cbean.cq.LdGenreCQ subQuery);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setParentGenreCode_IsNull() { regParentGenreCode(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setParentGenreCode_IsNotNull() { regParentGenreCode(CK_ISNN, DUMMY_OBJECT); }

    protected void regParentGenreCode(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueParentGenreCode(), "PARENT_GENRE_CODE", "ParentGenreCode", "parentGenreCode");
    }
    protected void registerInlineParentGenreCode(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueParentGenreCode(), "PARENT_GENRE_CODE", "ParentGenreCode", "parentGenreCode");
    }
    abstract protected LdConditionValue getCValueParentGenreCode();

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
    public SSQFunction<LdGenreCB> scalar_Equal() {
        return xcreateSSQFunction("=");
    }

    public SSQFunction<LdGenreCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(">=");
    }

    public SSQFunction<LdGenreCB> scalar_GreaterThan() {
        return xcreateSSQFunction(">");
    }

    public SSQFunction<LdGenreCB> scalar_LessEqual() {
        return xcreateSSQFunction("<=");
    }
    
    public SSQFunction<LdGenreCB> scalar_LessThan() {
        return xcreateSSQFunction("<");
    }
    
    protected SSQFunction<LdGenreCB> xcreateSSQFunction(final String operand) {
        return new SSQFunction<LdGenreCB>(new SSQSetupper<LdGenreCB>() {
            public void setup(String function, LdSubQuery<LdGenreCB> subQuery) {
                xscalarSubQuery(function, subQuery, operand);
            }
        });
    }

    protected void xscalarSubQuery(String function, LdSubQuery<LdGenreCB> subQuery, String operand) {
        assertObjectNotNull("subQuery<LdGenreCB>", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForScalarSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarSubQuery(cb.query()); // for saving query-value.
        registerScalarSubQuery(function, cb.query(), subQueryPropertyName, operand);
    }
    public abstract String keepScalarSubQuery(LdGenreCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdGenreCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdGenreCQ.class.getName(); }
}

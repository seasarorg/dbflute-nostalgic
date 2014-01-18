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
 * The abstract condition-query of COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsCollectionCQ extends LdAbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsCollectionCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "COLLECTION";
    }
    
    public String getTableSqlName() {
        return "COLLECTION";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {PK : ID : NotNull : INTEGER}
     * @param collectionId The value of collectionId as equal.
     */
    public void setCollectionId_Equal(Integer collectionId) {
        regCollectionId(CK_EQ, collectionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param collectionId The value of collectionId as greaterThan.
     */
    public void setCollectionId_GreaterThan(Integer collectionId) {
        regCollectionId(CK_GT, collectionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param collectionId The value of collectionId as lessThan.
     */
    public void setCollectionId_LessThan(Integer collectionId) {
        regCollectionId(CK_LT, collectionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param collectionId The value of collectionId as greaterEqual.
     */
    public void setCollectionId_GreaterEqual(Integer collectionId) {
        regCollectionId(CK_GE, collectionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param collectionId The value of collectionId as lessEqual.
     */
    public void setCollectionId_LessEqual(Integer collectionId) {
        regCollectionId(CK_LE, collectionId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param collectionIdList The collection of collectionId as inScope.
     */
    public void setCollectionId_InScope(Collection<Integer> collectionIdList) {
        regCollectionId(CK_INS, cTL(collectionIdList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param collectionIdList The collection of collectionId as notInScope.
     */
    public void setCollectionId_NotInScope(Collection<Integer> collectionIdList) {
        regCollectionId(CK_NINS, cTL(collectionIdList));
    }

    public void inScopeCollectionStatusAsOne(LdSubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionStatusCB>", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_InScopeSubQuery_CollectionStatusAsOne(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName);
    }
    public abstract String keepCollectionId_InScopeSubQuery_CollectionStatusAsOne(LdCollectionStatusCQ subQuery);

    public void inScopeLendingCollectionList(LdSubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_InScopeSubQuery_LendingCollectionList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName);
    }
    public abstract String keepCollectionId_InScopeSubQuery_LendingCollectionList(LdLendingCollectionCQ subQuery);

    public void notInScopeCollectionStatusAsOne(LdSubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionStatusCB>", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_NotInScopeSubQuery_CollectionStatusAsOne(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName);
    }
    public abstract String keepCollectionId_NotInScopeSubQuery_CollectionStatusAsOne(LdCollectionStatusCQ subQuery);

    public void notInScopeLendingCollectionList(LdSubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_NotInScopeSubQuery_LendingCollectionList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName);
    }
    public abstract String keepCollectionId_NotInScopeSubQuery_LendingCollectionList(LdLendingCollectionCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select COLLECTION_ID from COLLECTION_STATUS where ...)}
     * @param subQuery The sub-query of CollectionId_ExistsSubQuery_CollectionStatusAsOne for 'exists'. (NotNull)
     */
    public void existsCollectionStatusAsOne(LdSubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionStatusCB>", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_ExistsSubQuery_CollectionStatusAsOne(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName);
    }
    public abstract String keepCollectionId_ExistsSubQuery_CollectionStatusAsOne(LdCollectionStatusCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select COLLECTION_ID from LENDING_COLLECTION where ...)}
     * @param subQuery The sub-query of CollectionId_ExistsSubQuery_LendingCollectionList for 'exists'. (NotNull)
     */
    public void existsLendingCollectionList(LdSubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_ExistsSubQuery_LendingCollectionList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName);
    }
    public abstract String keepCollectionId_ExistsSubQuery_LendingCollectionList(LdLendingCollectionCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select COLLECTION_ID from COLLECTION_STATUS where ...)}
     * @param subQuery The sub-query of CollectionId_NotExistsSubQuery_CollectionStatusAsOne for 'not exists'. (NotNull)
     */
    public void notExistsCollectionStatusAsOne(LdSubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionStatusCB>", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_NotExistsSubQuery_CollectionStatusAsOne(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName);
    }
    public abstract String keepCollectionId_NotExistsSubQuery_CollectionStatusAsOne(LdCollectionStatusCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select COLLECTION_ID from LENDING_COLLECTION where ...)}
     * @param subQuery The sub-query of CollectionId_NotExistsSubQuery_LendingCollectionList for 'not exists'. (NotNull)
     */
    public void notExistsLendingCollectionList(LdSubQuery<LdLendingCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_NotExistsSubQuery_LendingCollectionList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName);
    }
    public abstract String keepCollectionId_NotExistsSubQuery_LendingCollectionList(LdLendingCollectionCQ subQuery);

    public void xsderiveLendingCollectionList(String function, LdSubQuery<LdLendingCollectionCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_SpecifyDerivedReferrer_LendingCollectionList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName, aliasName);
    }
    public abstract String keepCollectionId_SpecifyDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ subQuery);

    public QDRFunction<LdLendingCollectionCB> derivedLendingCollectionList() {
        return xcreateQDRFunctionLendingCollectionList();
    }
    protected QDRFunction<LdLendingCollectionCB> xcreateQDRFunctionLendingCollectionList() {
        return new QDRFunction<LdLendingCollectionCB>(new QDRSetupper<LdLendingCollectionCB>() {
            public void setup(String function, LdSubQuery<LdLendingCollectionCB> subQuery, String operand, Object value) {
                xqderiveLendingCollectionList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveLendingCollectionList(String function, LdSubQuery<LdLendingCollectionCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<LdLendingCollectionCB>", subQuery);
        LdLendingCollectionCB cb = new LdLendingCollectionCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionId_QueryDerivedReferrer_LendingCollectionList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepCollectionId_QueryDerivedReferrer_LendingCollectionListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "COLLECTION_ID", "COLLECTION_ID", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepCollectionId_QueryDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ subQuery);
    public abstract String keepCollectionId_QueryDerivedReferrer_LendingCollectionListParameter(Object parameterValue);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setCollectionId_IsNull() { regCollectionId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setCollectionId_IsNotNull() { regCollectionId(CK_ISNN, DUMMY_OBJECT); }

    protected void regCollectionId(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueCollectionId(), "COLLECTION_ID", "CollectionId", "collectionId");
    }
    protected void registerInlineCollectionId(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCollectionId(), "COLLECTION_ID", "CollectionId", "collectionId");
    }
    abstract protected LdConditionValue getCValueCollectionId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : NotNull : SMALLINT : FK to LIBRARY}
     * @param libraryId The value of libraryId as equal.
     */
    public void setLibraryId_Equal(Integer libraryId) {
        regLibraryId(CK_EQ, libraryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param libraryId The value of libraryId as greaterThan.
     */
    public void setLibraryId_GreaterThan(Integer libraryId) {
        regLibraryId(CK_GT, libraryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param libraryId The value of libraryId as lessThan.
     */
    public void setLibraryId_LessThan(Integer libraryId) {
        regLibraryId(CK_LT, libraryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param libraryId The value of libraryId as greaterEqual.
     */
    public void setLibraryId_GreaterEqual(Integer libraryId) {
        regLibraryId(CK_GE, libraryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param libraryId The value of libraryId as lessEqual.
     */
    public void setLibraryId_LessEqual(Integer libraryId) {
        regLibraryId(CK_LE, libraryId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param libraryIdList The collection of libraryId as inScope.
     */
    public void setLibraryId_InScope(Collection<Integer> libraryIdList) {
        regLibraryId(CK_INS, cTL(libraryIdList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param libraryIdList The collection of libraryId as notInScope.
     */
    public void setLibraryId_NotInScope(Collection<Integer> libraryIdList) {
        regLibraryId(CK_NINS, cTL(libraryIdList));
    }

    public void inScopeLibrary(LdSubQuery<LdLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_InScopeSubQuery_Library(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_InScopeSubQuery_Library(LdLibraryCQ subQuery);

    protected void regLibraryId(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueLibraryId(), "LIBRARY_ID", "LibraryId", "libraryId");
    }
    protected void registerInlineLibraryId(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLibraryId(), "LIBRARY_ID", "LibraryId", "libraryId");
    }
    abstract protected LdConditionValue getCValueLibraryId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : NotNull : INTEGER : FK to BOOK}
     * @param bookId The value of bookId as equal.
     */
    public void setBookId_Equal(Integer bookId) {
        regBookId(CK_EQ, bookId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param bookId The value of bookId as greaterThan.
     */
    public void setBookId_GreaterThan(Integer bookId) {
        regBookId(CK_GT, bookId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param bookId The value of bookId as lessThan.
     */
    public void setBookId_LessThan(Integer bookId) {
        regBookId(CK_LT, bookId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param bookId The value of bookId as greaterEqual.
     */
    public void setBookId_GreaterEqual(Integer bookId) {
        regBookId(CK_GE, bookId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param bookId The value of bookId as lessEqual.
     */
    public void setBookId_LessEqual(Integer bookId) {
        regBookId(CK_LE, bookId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param bookIdList The collection of bookId as inScope.
     */
    public void setBookId_InScope(Collection<Integer> bookIdList) {
        regBookId(CK_INS, cTL(bookIdList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param bookIdList The collection of bookId as notInScope.
     */
    public void setBookId_NotInScope(Collection<Integer> bookIdList) {
        regBookId(CK_NINS, cTL(bookIdList));
    }

    public void inScopeBook(LdSubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepBookId_InScopeSubQuery_Book(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "BOOK_ID", "BOOK_ID", subQueryPropertyName);
    }
    public abstract String keepBookId_InScopeSubQuery_Book(LdBookCQ subQuery);

    protected void regBookId(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueBookId(), "BOOK_ID", "BookId", "bookId");
    }
    protected void registerInlineBookId(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBookId(), "BOOK_ID", "BookId", "bookId");
    }
    abstract protected LdConditionValue getCValueBookId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : TIMESTAMP}
     * @param arrivalDate The value of arrivalDate as equal.
     */
    public void setArrivalDate_Equal(java.sql.Timestamp arrivalDate) {
        regArrivalDate(CK_EQ, arrivalDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param arrivalDate The value of arrivalDate as greaterThan.
     */
    public void setArrivalDate_GreaterThan(java.sql.Timestamp arrivalDate) {
        regArrivalDate(CK_GT, arrivalDate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param arrivalDate The value of arrivalDate as lessThan.
     */
    public void setArrivalDate_LessThan(java.sql.Timestamp arrivalDate) {
        regArrivalDate(CK_LT, arrivalDate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param arrivalDate The value of arrivalDate as greaterEqual.
     */
    public void setArrivalDate_GreaterEqual(java.sql.Timestamp arrivalDate) {
        regArrivalDate(CK_GE, arrivalDate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param arrivalDate The value of arrivalDate as lessEqual.
     */
    public void setArrivalDate_LessEqual(java.sql.Timestamp arrivalDate) {
        regArrivalDate(CK_LE, arrivalDate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnlyOnceRegistered. {NotNull : TIMESTAMP}
     * @param fromDate The from-date of arrivalDate. (Nullable)
     * @param toDate The to-date of arrivalDate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setArrivalDate_FromTo(java.util.Date fromDate, java.util.Date toDate, dbflute.ldb.allcommon.cbean.coption.LdFromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueArrivalDate(), "ARRIVAL_DATE", "ArrivalDate", "arrivalDate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnlyOnceRegistered. {NotNull : TIMESTAMP}
     * @param fromDate The from-date of arrivalDate. (Nullable)
     * @param toDate The to-date of arrivalDate. (Nullable)
     */
    public void setArrivalDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setArrivalDate_FromTo(fromDate, toDate, new dbflute.ldb.allcommon.cbean.coption.LdDateFromToOption());
    }

    protected void regArrivalDate(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueArrivalDate(), "ARRIVAL_DATE", "ArrivalDate", "arrivalDate");
    }
    protected void registerInlineArrivalDate(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueArrivalDate(), "ARRIVAL_DATE", "ArrivalDate", "arrivalDate");
    }
    abstract protected LdConditionValue getCValueArrivalDate();

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
    public SSQFunction<LdCollectionCB> scalar_Equal() {
        return xcreateSSQFunction("=");
    }

    public SSQFunction<LdCollectionCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(">=");
    }

    public SSQFunction<LdCollectionCB> scalar_GreaterThan() {
        return xcreateSSQFunction(">");
    }

    public SSQFunction<LdCollectionCB> scalar_LessEqual() {
        return xcreateSSQFunction("<=");
    }
    
    public SSQFunction<LdCollectionCB> scalar_LessThan() {
        return xcreateSSQFunction("<");
    }
    
    protected SSQFunction<LdCollectionCB> xcreateSSQFunction(final String operand) {
        return new SSQFunction<LdCollectionCB>(new SSQSetupper<LdCollectionCB>() {
            public void setup(String function, LdSubQuery<LdCollectionCB> subQuery) {
                xscalarSubQuery(function, subQuery, operand);
            }
        });
    }

    protected void xscalarSubQuery(String function, LdSubQuery<LdCollectionCB> subQuery, String operand) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForScalarSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarSubQuery(cb.query()); // for saving query-value.
        registerScalarSubQuery(function, cb.query(), subQueryPropertyName, operand);
    }
    public abstract String keepScalarSubQuery(LdCollectionCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdCollectionCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdCollectionCQ.class.getName(); }
}

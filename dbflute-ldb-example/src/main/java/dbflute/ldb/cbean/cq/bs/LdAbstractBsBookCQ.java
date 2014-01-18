/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.cq.bs;

import java.util.Collection;

import dbflute.ldb.allcommon.LdCDef;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaProvider;
import dbflute.ldb.allcommon.cbean.*;
import dbflute.ldb.allcommon.cbean.ckey.*;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.cbean.*;
import dbflute.ldb.cbean.cq.*;

/**
 * The abstract condition-query of BOOK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsBookCQ extends LdAbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsBookCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BOOK";
    }
    
    public String getTableSqlName() {
        return "BOOK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {PK : ID : NotNull : INTEGER}
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

    public void inScopeCollectionList(LdSubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepBookId_InScopeSubQuery_CollectionList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "BOOK_ID", "BOOK_ID", subQueryPropertyName);
    }
    public abstract String keepBookId_InScopeSubQuery_CollectionList(LdCollectionCQ subQuery);

    public void notInScopeCollectionList(LdSubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepBookId_NotInScopeSubQuery_CollectionList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "BOOK_ID", "BOOK_ID", subQueryPropertyName);
    }
    public abstract String keepBookId_NotInScopeSubQuery_CollectionList(LdCollectionCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select BOOK_ID from COLLECTION where ...)}
     * @param subQuery The sub-query of BookId_ExistsSubQuery_CollectionList for 'exists'. (NotNull)
     */
    public void existsCollectionList(LdSubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepBookId_ExistsSubQuery_CollectionList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "BOOK_ID", "BOOK_ID", subQueryPropertyName);
    }
    public abstract String keepBookId_ExistsSubQuery_CollectionList(LdCollectionCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select BOOK_ID from COLLECTION where ...)}
     * @param subQuery The sub-query of BookId_NotExistsSubQuery_CollectionList for 'not exists'. (NotNull)
     */
    public void notExistsCollectionList(LdSubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepBookId_NotExistsSubQuery_CollectionList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "BOOK_ID", "BOOK_ID", subQueryPropertyName);
    }
    public abstract String keepBookId_NotExistsSubQuery_CollectionList(LdCollectionCQ subQuery);

    public void xsderiveCollectionList(String function, LdSubQuery<LdCollectionCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepBookId_SpecifyDerivedReferrer_CollectionList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "BOOK_ID", "BOOK_ID", subQueryPropertyName, aliasName);
    }
    public abstract String keepBookId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ subQuery);

    public QDRFunction<LdCollectionCB> derivedCollectionList() {
        return xcreateQDRFunctionCollectionList();
    }
    protected QDRFunction<LdCollectionCB> xcreateQDRFunctionCollectionList() {
        return new QDRFunction<LdCollectionCB>(new QDRSetupper<LdCollectionCB>() {
            public void setup(String function, LdSubQuery<LdCollectionCB> subQuery, String operand, Object value) {
                xqderiveCollectionList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveCollectionList(String function, LdSubQuery<LdCollectionCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepBookId_QueryDerivedReferrer_CollectionList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepBookId_QueryDerivedReferrer_CollectionListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "BOOK_ID", "BOOK_ID", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepBookId_QueryDerivedReferrer_CollectionList(LdCollectionCQ subQuery);
    public abstract String keepBookId_QueryDerivedReferrer_CollectionListParameter(Object parameterValue);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBookId_IsNull() { regBookId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBookId_IsNotNull() { regBookId(CK_ISNN, DUMMY_OBJECT); }

    protected void regBookId(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueBookId(), "BOOK_ID", "BookId", "bookId");
    }
    protected void registerInlineBookId(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBookId(), "BOOK_ID", "BookId", "bookId");
    }
    abstract protected LdConditionValue getCValueBookId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : NotNull : VARCHAR(20)}
     * @param isbn The value of isbn as equal.
     */
    public void setIsbn_Equal(String isbn) {
        regIsbn(CK_EQ, fRES(isbn));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setIsbn_Equal_EmptyString() {
        regIsbn(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param isbn The value of isbn as notEqual.
     */
    public void setIsbn_NotEqual(String isbn) {
        regIsbn(CK_NE, fRES(isbn));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param isbn The value of isbn as prefixSearch.
     */
    public void setIsbn_PrefixSearch(String isbn) {
        regIsbn(CK_PS, fRES(isbn));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param isbnList The collection of isbn as inScope.
     */
    public void setIsbn_InScope(Collection<String> isbnList) {
        regIsbn(CK_INS, cTL(isbnList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param isbnList The collection of isbn as notInScope.
     */
    public void setIsbn_NotInScope(Collection<String> isbnList) {
        regIsbn(CK_NINS, cTL(isbnList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param isbn The value of isbn as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIsbn_LikeSearch(String isbn, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(isbn), getCValueIsbn(), "ISBN", "Isbn", "isbn", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param isbn The value of isbn as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIsbn_NotLikeSearch(String isbn, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(isbn), getCValueIsbn(), "ISBN", "Isbn", "isbn", likeSearchOption);
    }

    protected void regIsbn(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueIsbn(), "ISBN", "Isbn", "isbn");
    }
    protected void registerInlineIsbn(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueIsbn(), "ISBN", "Isbn", "isbn");
    }
    abstract protected LdConditionValue getCValueIsbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {NotNull : VARCHAR(80)}
     * @param bookName The value of bookName as equal.
     */
    public void setBookName_Equal(String bookName) {
        regBookName(CK_EQ, fRES(bookName));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setBookName_Equal_EmptyString() {
        regBookName(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param bookName The value of bookName as notEqual.
     */
    public void setBookName_NotEqual(String bookName) {
        regBookName(CK_NE, fRES(bookName));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param bookName The value of bookName as prefixSearch.
     */
    public void setBookName_PrefixSearch(String bookName) {
        regBookName(CK_PS, fRES(bookName));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param bookNameList The collection of bookName as inScope.
     */
    public void setBookName_InScope(Collection<String> bookNameList) {
        regBookName(CK_INS, cTL(bookNameList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param bookNameList The collection of bookName as notInScope.
     */
    public void setBookName_NotInScope(Collection<String> bookNameList) {
        regBookName(CK_NINS, cTL(bookNameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param bookName The value of bookName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBookName_LikeSearch(String bookName, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bookName), getCValueBookName(), "BOOK_NAME", "BookName", "bookName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param bookName The value of bookName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBookName_NotLikeSearch(String bookName, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bookName), getCValueBookName(), "BOOK_NAME", "BookName", "bookName", likeSearchOption);
    }

    protected void regBookName(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueBookName(), "BOOK_NAME", "BookName", "bookName");
    }
    protected void registerInlineBookName(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBookName(), "BOOK_NAME", "BookName", "bookName");
    }
    abstract protected LdConditionValue getCValueBookName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : INTEGER : FK to AUTHOR}
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

    public void inScopeAuthor(LdSubQuery<LdAuthorCB> subQuery) {
        assertObjectNotNull("subQuery<LdAuthorCB>", subQuery);
        LdAuthorCB cb = new LdAuthorCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepAuthorId_InScopeSubQuery_Author(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "AUTHOR_ID", "AUTHOR_ID", subQueryPropertyName);
    }
    public abstract String keepAuthorId_InScopeSubQuery_Author(LdAuthorCQ subQuery);

    protected void regAuthorId(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueAuthorId(), "AUTHOR_ID", "AuthorId", "authorId");
    }
    protected void registerInlineAuthorId(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAuthorId(), "AUTHOR_ID", "AuthorId", "authorId");
    }
    abstract protected LdConditionValue getCValueAuthorId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : INTEGER : FK to PUBLISHER}
     * @param publisherId The value of publisherId as equal.
     */
    public void setPublisherId_Equal(Integer publisherId) {
        regPublisherId(CK_EQ, publisherId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param publisherId The value of publisherId as greaterThan.
     */
    public void setPublisherId_GreaterThan(Integer publisherId) {
        regPublisherId(CK_GT, publisherId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param publisherId The value of publisherId as lessThan.
     */
    public void setPublisherId_LessThan(Integer publisherId) {
        regPublisherId(CK_LT, publisherId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param publisherId The value of publisherId as greaterEqual.
     */
    public void setPublisherId_GreaterEqual(Integer publisherId) {
        regPublisherId(CK_GE, publisherId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param publisherId The value of publisherId as lessEqual.
     */
    public void setPublisherId_LessEqual(Integer publisherId) {
        regPublisherId(CK_LE, publisherId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param publisherIdList The collection of publisherId as inScope.
     */
    public void setPublisherId_InScope(Collection<Integer> publisherIdList) {
        regPublisherId(CK_INS, cTL(publisherIdList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param publisherIdList The collection of publisherId as notInScope.
     */
    public void setPublisherId_NotInScope(Collection<Integer> publisherIdList) {
        regPublisherId(CK_NINS, cTL(publisherIdList));
    }

    public void inScopePublisher(LdSubQuery<LdPublisherCB> subQuery) {
        assertObjectNotNull("subQuery<LdPublisherCB>", subQuery);
        LdPublisherCB cb = new LdPublisherCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepPublisherId_InScopeSubQuery_Publisher(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "PUBLISHER_ID", "PUBLISHER_ID", subQueryPropertyName);
    }
    public abstract String keepPublisherId_InScopeSubQuery_Publisher(LdPublisherCQ subQuery);

    protected void regPublisherId(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValuePublisherId(), "PUBLISHER_ID", "PublisherId", "publisherId");
    }
    protected void registerInlinePublisherId(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePublisherId(), "PUBLISHER_ID", "PublisherId", "publisherId");
    }
    abstract protected LdConditionValue getCValuePublisherId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(24) : FK to GENRE}
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

    public void inScopeGenre(LdSubQuery<LdGenreCB> subQuery) {
        assertObjectNotNull("subQuery<LdGenreCB>", subQuery);
        LdGenreCB cb = new LdGenreCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepGenreCode_InScopeSubQuery_Genre(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "GENRE_CODE", "GENRE_CODE", subQueryPropertyName);
    }
    public abstract String keepGenreCode_InScopeSubQuery_Genre(dbflute.ldb.cbean.cq.LdGenreCQ subQuery);

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {CLOB}
     * @param openingPart The value of openingPart as equal.
     */
    public void setOpeningPart_Equal(String openingPart) {
        regOpeningPart(CK_EQ, fRES(openingPart));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setOpeningPart_Equal_EmptyString() {
        regOpeningPart(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param openingPart The value of openingPart as notEqual.
     */
    public void setOpeningPart_NotEqual(String openingPart) {
        regOpeningPart(CK_NE, fRES(openingPart));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param openingPart The value of openingPart as prefixSearch.
     */
    public void setOpeningPart_PrefixSearch(String openingPart) {
        regOpeningPart(CK_PS, fRES(openingPart));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param openingPartList The collection of openingPart as inScope.
     */
    public void setOpeningPart_InScope(Collection<String> openingPartList) {
        regOpeningPart(CK_INS, cTL(openingPartList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param openingPartList The collection of openingPart as notInScope.
     */
    public void setOpeningPart_NotInScope(Collection<String> openingPartList) {
        regOpeningPart(CK_NINS, cTL(openingPartList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param openingPart The value of openingPart as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOpeningPart_LikeSearch(String openingPart, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(openingPart), getCValueOpeningPart(), "OPENING_PART", "OpeningPart", "openingPart", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param openingPart The value of openingPart as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOpeningPart_NotLikeSearch(String openingPart, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(openingPart), getCValueOpeningPart(), "OPENING_PART", "OpeningPart", "openingPart", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setOpeningPart_IsNull() { regOpeningPart(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setOpeningPart_IsNotNull() { regOpeningPart(CK_ISNN, DUMMY_OBJECT); }

    protected void regOpeningPart(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueOpeningPart(), "OPENING_PART", "OpeningPart", "openingPart");
    }
    protected void registerInlineOpeningPart(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueOpeningPart(), "OPENING_PART", "OpeningPart", "openingPart");
    }
    abstract protected LdConditionValue getCValueOpeningPart();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : SMALLINT}
     * @param maxLendingDateCount The value of maxLendingDateCount as equal.
     */
    public void setMaxLendingDateCount_Equal(Integer maxLendingDateCount) {
        regMaxLendingDateCount(CK_EQ, maxLendingDateCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param maxLendingDateCount The value of maxLendingDateCount as greaterThan.
     */
    public void setMaxLendingDateCount_GreaterThan(Integer maxLendingDateCount) {
        regMaxLendingDateCount(CK_GT, maxLendingDateCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param maxLendingDateCount The value of maxLendingDateCount as lessThan.
     */
    public void setMaxLendingDateCount_LessThan(Integer maxLendingDateCount) {
        regMaxLendingDateCount(CK_LT, maxLendingDateCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param maxLendingDateCount The value of maxLendingDateCount as greaterEqual.
     */
    public void setMaxLendingDateCount_GreaterEqual(Integer maxLendingDateCount) {
        regMaxLendingDateCount(CK_GE, maxLendingDateCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param maxLendingDateCount The value of maxLendingDateCount as lessEqual.
     */
    public void setMaxLendingDateCount_LessEqual(Integer maxLendingDateCount) {
        regMaxLendingDateCount(CK_LE, maxLendingDateCount);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param maxLendingDateCountList The collection of maxLendingDateCount as inScope.
     */
    public void setMaxLendingDateCount_InScope(Collection<Integer> maxLendingDateCountList) {
        regMaxLendingDateCount(CK_INS, cTL(maxLendingDateCountList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param maxLendingDateCountList The collection of maxLendingDateCount as notInScope.
     */
    public void setMaxLendingDateCount_NotInScope(Collection<Integer> maxLendingDateCountList) {
        regMaxLendingDateCount(CK_NINS, cTL(maxLendingDateCountList));
    }

    protected void regMaxLendingDateCount(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueMaxLendingDateCount(), "MAX_LENDING_DATE_COUNT", "MaxLendingDateCount", "maxLendingDateCount");
    }
    protected void registerInlineMaxLendingDateCount(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueMaxLendingDateCount(), "MAX_LENDING_DATE_COUNT", "MaxLendingDateCount", "maxLendingDateCount");
    }
    abstract protected LdConditionValue getCValueMaxLendingDateCount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {NotNull : CHAR(1)}
     * @param outOfUserSelectYn The value of outOfUserSelectYn as equal.
     */
    public void setOutOfUserSelectYn_Equal(String outOfUserSelectYn) {
        regOutOfUserSelectYn(CK_EQ, fRES(outOfUserSelectYn));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setOutOfUserSelectYn_Equal_EmptyString() {
        regOutOfUserSelectYn(CK_EQ, "");
    }

    /**
     * Equal(=). As Yes. And OnlyOnceRegistered. <br />
     * はい
     */
    public void setOutOfUserSelectYn_Equal_Yes() {
        regOutOfUserSelectYn(CK_EQ, LdCDef.YesNo.Yes.code());
    }

    /**
     * Equal(=). As No. And OnlyOnceRegistered. <br />
     * いいえ
     */
    public void setOutOfUserSelectYn_Equal_No() {
        regOutOfUserSelectYn(CK_EQ, LdCDef.YesNo.No.code());
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param outOfUserSelectYnList The collection of outOfUserSelectYn as inScope.
     */
    public void setOutOfUserSelectYn_InScope(Collection<String> outOfUserSelectYnList) {
        regOutOfUserSelectYn(CK_INS, cTL(outOfUserSelectYnList));
    }

    protected void regOutOfUserSelectYn(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueOutOfUserSelectYn(), "OUT_OF_USER_SELECT_YN", "OutOfUserSelectYn", "outOfUserSelectYn");
    }
    protected void registerInlineOutOfUserSelectYn(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueOutOfUserSelectYn(), "OUT_OF_USER_SELECT_YN", "OutOfUserSelectYn", "outOfUserSelectYn");
    }
    abstract protected LdConditionValue getCValueOutOfUserSelectYn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(200)}
     * @param outOfUserSelectReason The value of outOfUserSelectReason as equal.
     */
    public void setOutOfUserSelectReason_Equal(String outOfUserSelectReason) {
        regOutOfUserSelectReason(CK_EQ, fRES(outOfUserSelectReason));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setOutOfUserSelectReason_Equal_EmptyString() {
        regOutOfUserSelectReason(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param outOfUserSelectReason The value of outOfUserSelectReason as notEqual.
     */
    public void setOutOfUserSelectReason_NotEqual(String outOfUserSelectReason) {
        regOutOfUserSelectReason(CK_NE, fRES(outOfUserSelectReason));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param outOfUserSelectReason The value of outOfUserSelectReason as prefixSearch.
     */
    public void setOutOfUserSelectReason_PrefixSearch(String outOfUserSelectReason) {
        regOutOfUserSelectReason(CK_PS, fRES(outOfUserSelectReason));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param outOfUserSelectReasonList The collection of outOfUserSelectReason as inScope.
     */
    public void setOutOfUserSelectReason_InScope(Collection<String> outOfUserSelectReasonList) {
        regOutOfUserSelectReason(CK_INS, cTL(outOfUserSelectReasonList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param outOfUserSelectReasonList The collection of outOfUserSelectReason as notInScope.
     */
    public void setOutOfUserSelectReason_NotInScope(Collection<String> outOfUserSelectReasonList) {
        regOutOfUserSelectReason(CK_NINS, cTL(outOfUserSelectReasonList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param outOfUserSelectReason The value of outOfUserSelectReason as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOutOfUserSelectReason_LikeSearch(String outOfUserSelectReason, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(outOfUserSelectReason), getCValueOutOfUserSelectReason(), "OUT_OF_USER_SELECT_REASON", "OutOfUserSelectReason", "outOfUserSelectReason", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param outOfUserSelectReason The value of outOfUserSelectReason as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOutOfUserSelectReason_NotLikeSearch(String outOfUserSelectReason, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(outOfUserSelectReason), getCValueOutOfUserSelectReason(), "OUT_OF_USER_SELECT_REASON", "OutOfUserSelectReason", "outOfUserSelectReason", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setOutOfUserSelectReason_IsNull() { regOutOfUserSelectReason(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setOutOfUserSelectReason_IsNotNull() { regOutOfUserSelectReason(CK_ISNN, DUMMY_OBJECT); }

    protected void regOutOfUserSelectReason(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueOutOfUserSelectReason(), "OUT_OF_USER_SELECT_REASON", "OutOfUserSelectReason", "outOfUserSelectReason");
    }
    protected void registerInlineOutOfUserSelectReason(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueOutOfUserSelectReason(), "OUT_OF_USER_SELECT_REASON", "OutOfUserSelectReason", "outOfUserSelectReason");
    }
    abstract protected LdConditionValue getCValueOutOfUserSelectReason();

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
    public SSQFunction<LdBookCB> scalar_Equal() {
        return xcreateSSQFunction("=");
    }

    public SSQFunction<LdBookCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(">=");
    }

    public SSQFunction<LdBookCB> scalar_GreaterThan() {
        return xcreateSSQFunction(">");
    }

    public SSQFunction<LdBookCB> scalar_LessEqual() {
        return xcreateSSQFunction("<=");
    }
    
    public SSQFunction<LdBookCB> scalar_LessThan() {
        return xcreateSSQFunction("<");
    }
    
    protected SSQFunction<LdBookCB> xcreateSSQFunction(final String operand) {
        return new SSQFunction<LdBookCB>(new SSQSetupper<LdBookCB>() {
            public void setup(String function, LdSubQuery<LdBookCB> subQuery) {
                xscalarSubQuery(function, subQuery, operand);
            }
        });
    }

    protected void xscalarSubQuery(String function, LdSubQuery<LdBookCB> subQuery, String operand) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForScalarSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarSubQuery(cb.query()); // for saving query-value.
        registerScalarSubQuery(function, cb.query(), subQueryPropertyName, operand);
    }
    public abstract String keepScalarSubQuery(LdBookCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdBookCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdBookCQ.class.getName(); }
}

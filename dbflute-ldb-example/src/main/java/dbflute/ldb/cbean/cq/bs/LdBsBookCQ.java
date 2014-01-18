/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.cq.bs;

import java.util.Map;

import dbflute.ldb.allcommon.cbean.*;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.cbean.cq.ciq.*;
import dbflute.ldb.cbean.*;
import dbflute.ldb.cbean.cq.*;

/**
 * The base condition-query of BOOK.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBookCQ extends LdAbstractBsBookCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBookCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsBookCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from BOOK) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdBookCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdBookCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join BOOK on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdBookCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdBookCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _bookId;
    public LdConditionValue getBookId() {
        if (_bookId == null) { _bookId = new LdConditionValue(); }
        return _bookId;
    }
    protected LdConditionValue getCValueBookId() { return getBookId(); }

    protected Map<String, LdCollectionCQ> _bookId_InScopeSubQuery_CollectionListMap;
    public Map<String, LdCollectionCQ> getBookId_InScopeSubQuery_CollectionList() { return _bookId_InScopeSubQuery_CollectionListMap; }
    public String keepBookId_InScopeSubQuery_CollectionList(LdCollectionCQ subQuery) {
        if (_bookId_InScopeSubQuery_CollectionListMap == null) { _bookId_InScopeSubQuery_CollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_bookId_InScopeSubQuery_CollectionListMap.size() + 1);
        _bookId_InScopeSubQuery_CollectionListMap.put(key, subQuery); return "bookId_InScopeSubQuery_CollectionList." + key;
    }

    protected Map<String, LdCollectionCQ> _bookId_NotInScopeSubQuery_CollectionListMap;
    public Map<String, LdCollectionCQ> getBookId_NotInScopeSubQuery_CollectionList() { return _bookId_NotInScopeSubQuery_CollectionListMap; }
    public String keepBookId_NotInScopeSubQuery_CollectionList(LdCollectionCQ subQuery) {
        if (_bookId_NotInScopeSubQuery_CollectionListMap == null) { _bookId_NotInScopeSubQuery_CollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_bookId_NotInScopeSubQuery_CollectionListMap.size() + 1);
        _bookId_NotInScopeSubQuery_CollectionListMap.put(key, subQuery); return "bookId_NotInScopeSubQuery_CollectionList." + key;
    }

    protected Map<String, LdCollectionCQ> _bookId_ExistsSubQuery_CollectionListMap;
    public Map<String, LdCollectionCQ> getBookId_ExistsSubQuery_CollectionList() { return _bookId_ExistsSubQuery_CollectionListMap; }
    public String keepBookId_ExistsSubQuery_CollectionList(LdCollectionCQ subQuery) {
        if (_bookId_ExistsSubQuery_CollectionListMap == null) { _bookId_ExistsSubQuery_CollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_bookId_ExistsSubQuery_CollectionListMap.size() + 1);
        _bookId_ExistsSubQuery_CollectionListMap.put(key, subQuery); return "bookId_ExistsSubQuery_CollectionList." + key;
    }

    protected Map<String, LdCollectionCQ> _bookId_NotExistsSubQuery_CollectionListMap;
    public Map<String, LdCollectionCQ> getBookId_NotExistsSubQuery_CollectionList() { return _bookId_NotExistsSubQuery_CollectionListMap; }
    public String keepBookId_NotExistsSubQuery_CollectionList(LdCollectionCQ subQuery) {
        if (_bookId_NotExistsSubQuery_CollectionListMap == null) { _bookId_NotExistsSubQuery_CollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_bookId_NotExistsSubQuery_CollectionListMap.size() + 1);
        _bookId_NotExistsSubQuery_CollectionListMap.put(key, subQuery); return "bookId_NotExistsSubQuery_CollectionList." + key;
    }

    protected Map<String, LdCollectionCQ> _bookId_SpecifyDerivedReferrer_CollectionListMap;
    public Map<String, LdCollectionCQ> getBookId_SpecifyDerivedReferrer_CollectionList() { return _bookId_SpecifyDerivedReferrer_CollectionListMap; }
    public String keepBookId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ subQuery) {
        if (_bookId_SpecifyDerivedReferrer_CollectionListMap == null) { _bookId_SpecifyDerivedReferrer_CollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_bookId_SpecifyDerivedReferrer_CollectionListMap.size() + 1);
        _bookId_SpecifyDerivedReferrer_CollectionListMap.put(key, subQuery); return "bookId_SpecifyDerivedReferrer_CollectionList." + key;
    }

    protected Map<String, LdCollectionCQ> _bookId_QueryDerivedReferrer_CollectionListMap;
    public Map<String, LdCollectionCQ> getBookId_QueryDerivedReferrer_CollectionList() { return _bookId_QueryDerivedReferrer_CollectionListMap; }
    public String keepBookId_QueryDerivedReferrer_CollectionList(LdCollectionCQ subQuery) {
        if (_bookId_QueryDerivedReferrer_CollectionListMap == null) { _bookId_QueryDerivedReferrer_CollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_bookId_QueryDerivedReferrer_CollectionListMap.size() + 1);
        _bookId_QueryDerivedReferrer_CollectionListMap.put(key, subQuery); return "bookId_QueryDerivedReferrer_CollectionList." + key;
    }
    protected Map<String, Object> _bookId_QueryDerivedReferrer_CollectionListParameterMap;
    public Map<String, Object> getBookId_QueryDerivedReferrer_CollectionListParameter() { return _bookId_QueryDerivedReferrer_CollectionListParameterMap; }
    public String keepBookId_QueryDerivedReferrer_CollectionListParameter(Object parameterValue) {
        if (_bookId_QueryDerivedReferrer_CollectionListParameterMap == null) { _bookId_QueryDerivedReferrer_CollectionListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_bookId_QueryDerivedReferrer_CollectionListParameterMap.size() + 1);
        _bookId_QueryDerivedReferrer_CollectionListParameterMap.put(key, parameterValue); return "bookId_QueryDerivedReferrer_CollectionListParameter." + key;
    }

    public LdBsBookCQ addOrderBy_BookId_Asc() { regOBA("BOOK_ID"); return this; }
    public LdBsBookCQ addOrderBy_BookId_Desc() { regOBD("BOOK_ID"); return this; }

    protected LdConditionValue _isbn;
    public LdConditionValue getIsbn() {
        if (_isbn == null) { _isbn = new LdConditionValue(); }
        return _isbn;
    }
    protected LdConditionValue getCValueIsbn() { return getIsbn(); }

    public LdBsBookCQ addOrderBy_Isbn_Asc() { regOBA("ISBN"); return this; }
    public LdBsBookCQ addOrderBy_Isbn_Desc() { regOBD("ISBN"); return this; }

    protected LdConditionValue _bookName;
    public LdConditionValue getBookName() {
        if (_bookName == null) { _bookName = new LdConditionValue(); }
        return _bookName;
    }
    protected LdConditionValue getCValueBookName() { return getBookName(); }

    public LdBsBookCQ addOrderBy_BookName_Asc() { regOBA("BOOK_NAME"); return this; }
    public LdBsBookCQ addOrderBy_BookName_Desc() { regOBD("BOOK_NAME"); return this; }

    protected LdConditionValue _authorId;
    public LdConditionValue getAuthorId() {
        if (_authorId == null) { _authorId = new LdConditionValue(); }
        return _authorId;
    }
    protected LdConditionValue getCValueAuthorId() { return getAuthorId(); }

    protected Map<String, LdAuthorCQ> _authorId_InScopeSubQuery_AuthorMap;
    public Map<String, LdAuthorCQ> getAuthorId_InScopeSubQuery_Author() { return _authorId_InScopeSubQuery_AuthorMap; }
    public String keepAuthorId_InScopeSubQuery_Author(LdAuthorCQ subQuery) {
        if (_authorId_InScopeSubQuery_AuthorMap == null) { _authorId_InScopeSubQuery_AuthorMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_authorId_InScopeSubQuery_AuthorMap.size() + 1);
        _authorId_InScopeSubQuery_AuthorMap.put(key, subQuery); return "authorId_InScopeSubQuery_Author." + key;
    }
      
    public LdBsBookCQ addOrderBy_AuthorId_Asc() { regOBA("AUTHOR_ID"); return this; }
    public LdBsBookCQ addOrderBy_AuthorId_Desc() { regOBD("AUTHOR_ID"); return this; }

    protected LdConditionValue _publisherId;
    public LdConditionValue getPublisherId() {
        if (_publisherId == null) { _publisherId = new LdConditionValue(); }
        return _publisherId;
    }
    protected LdConditionValue getCValuePublisherId() { return getPublisherId(); }

    protected Map<String, LdPublisherCQ> _publisherId_InScopeSubQuery_PublisherMap;
    public Map<String, LdPublisherCQ> getPublisherId_InScopeSubQuery_Publisher() { return _publisherId_InScopeSubQuery_PublisherMap; }
    public String keepPublisherId_InScopeSubQuery_Publisher(LdPublisherCQ subQuery) {
        if (_publisherId_InScopeSubQuery_PublisherMap == null) { _publisherId_InScopeSubQuery_PublisherMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_publisherId_InScopeSubQuery_PublisherMap.size() + 1);
        _publisherId_InScopeSubQuery_PublisherMap.put(key, subQuery); return "publisherId_InScopeSubQuery_Publisher." + key;
    }
      
    public LdBsBookCQ addOrderBy_PublisherId_Asc() { regOBA("PUBLISHER_ID"); return this; }
    public LdBsBookCQ addOrderBy_PublisherId_Desc() { regOBD("PUBLISHER_ID"); return this; }

    protected LdConditionValue _genreCode;
    public LdConditionValue getGenreCode() {
        if (_genreCode == null) { _genreCode = new LdConditionValue(); }
        return _genreCode;
    }
    protected LdConditionValue getCValueGenreCode() { return getGenreCode(); }

    protected Map<String, LdGenreCQ> _genreCode_InScopeSubQuery_GenreMap;
    public Map<String, LdGenreCQ> getGenreCode_InScopeSubQuery_Genre() { return _genreCode_InScopeSubQuery_GenreMap; }
    public String keepGenreCode_InScopeSubQuery_Genre(LdGenreCQ subQuery) {
        if (_genreCode_InScopeSubQuery_GenreMap == null) { _genreCode_InScopeSubQuery_GenreMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_genreCode_InScopeSubQuery_GenreMap.size() + 1);
        _genreCode_InScopeSubQuery_GenreMap.put(key, subQuery); return "genreCode_InScopeSubQuery_Genre." + key;
    }

    public LdBsBookCQ addOrderBy_GenreCode_Asc() { regOBA("GENRE_CODE"); return this; }
    public LdBsBookCQ addOrderBy_GenreCode_Desc() { regOBD("GENRE_CODE"); return this; }

    protected LdConditionValue _openingPart;
    public LdConditionValue getOpeningPart() {
        if (_openingPart == null) { _openingPart = new LdConditionValue(); }
        return _openingPart;
    }
    protected LdConditionValue getCValueOpeningPart() { return getOpeningPart(); }

    public LdBsBookCQ addOrderBy_OpeningPart_Asc() { regOBA("OPENING_PART"); return this; }
    public LdBsBookCQ addOrderBy_OpeningPart_Desc() { regOBD("OPENING_PART"); return this; }

    protected LdConditionValue _maxLendingDateCount;
    public LdConditionValue getMaxLendingDateCount() {
        if (_maxLendingDateCount == null) { _maxLendingDateCount = new LdConditionValue(); }
        return _maxLendingDateCount;
    }
    protected LdConditionValue getCValueMaxLendingDateCount() { return getMaxLendingDateCount(); }

    public LdBsBookCQ addOrderBy_MaxLendingDateCount_Asc() { regOBA("MAX_LENDING_DATE_COUNT"); return this; }
    public LdBsBookCQ addOrderBy_MaxLendingDateCount_Desc() { regOBD("MAX_LENDING_DATE_COUNT"); return this; }

    protected LdConditionValue _outOfUserSelectYn;
    public LdConditionValue getOutOfUserSelectYn() {
        if (_outOfUserSelectYn == null) { _outOfUserSelectYn = new LdConditionValue(); }
        return _outOfUserSelectYn;
    }
    protected LdConditionValue getCValueOutOfUserSelectYn() { return getOutOfUserSelectYn(); }

    public LdBsBookCQ addOrderBy_OutOfUserSelectYn_Asc() { regOBA("OUT_OF_USER_SELECT_YN"); return this; }
    public LdBsBookCQ addOrderBy_OutOfUserSelectYn_Desc() { regOBD("OUT_OF_USER_SELECT_YN"); return this; }

    protected LdConditionValue _outOfUserSelectReason;
    public LdConditionValue getOutOfUserSelectReason() {
        if (_outOfUserSelectReason == null) { _outOfUserSelectReason = new LdConditionValue(); }
        return _outOfUserSelectReason;
    }
    protected LdConditionValue getCValueOutOfUserSelectReason() { return getOutOfUserSelectReason(); }

    public LdBsBookCQ addOrderBy_OutOfUserSelectReason_Asc() { regOBA("OUT_OF_USER_SELECT_REASON"); return this; }
    public LdBsBookCQ addOrderBy_OutOfUserSelectReason_Desc() { regOBD("OUT_OF_USER_SELECT_REASON"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsBookCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsBookCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsBookCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsBookCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsBookCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsBookCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsBookCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsBookCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsBookCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsBookCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsBookCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsBookCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsBookCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsBookCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
        LdBookCQ baseQuery = (LdBookCQ)baseQueryAsSuper;
        LdBookCQ unionQuery = (LdBookCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryAuthor()) {
            unionQuery.queryAuthor().reflectRelationOnUnionQuery(baseQuery.queryAuthor(), unionQuery.queryAuthor());
        }
        if (baseQuery.hasConditionQueryGenre()) {
            unionQuery.queryGenre().reflectRelationOnUnionQuery(baseQuery.queryGenre(), unionQuery.queryGenre());
        }
        if (baseQuery.hasConditionQueryPublisher()) {
            unionQuery.queryPublisher().reflectRelationOnUnionQuery(baseQuery.queryPublisher(), unionQuery.queryPublisher());
        }
        if (baseQuery.hasConditionQueryCollectionStatusLookupAsNonExist()) {
            unionQuery.queryCollectionStatusLookupAsNonExist().reflectRelationOnUnionQuery(baseQuery.queryCollectionStatusLookupAsNonExist(), unionQuery.queryCollectionStatusLookupAsNonExist());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    public LdAuthorCQ queryAuthor() {
        return getConditionQueryAuthor();
    }
    protected LdAuthorCQ _conditionQueryAuthor;
    public LdAuthorCQ getConditionQueryAuthor() {
        if (_conditionQueryAuthor == null) {
            _conditionQueryAuthor = xcreateQueryAuthor();
            xsetupOuterJoinAuthor();
        }
        return _conditionQueryAuthor;
    }
    protected LdAuthorCQ xcreateQueryAuthor() {
        String nrp = resolveNextRelationPath("BOOK", "author");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdAuthorCQ cq = new LdAuthorCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("author"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinAuthor() {
        LdAuthorCQ cq = getConditionQueryAuthor();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("AUTHOR_ID"), cq.getRealColumnName("AUTHOR_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryAuthor() {
        return _conditionQueryAuthor != null;
    }

    public LdGenreCQ queryGenre() {
        return getConditionQueryGenre();
    }
    protected LdGenreCQ _conditionQueryGenre;
    public LdGenreCQ getConditionQueryGenre() {
        if (_conditionQueryGenre == null) {
            _conditionQueryGenre = xcreateQueryGenre();
            xsetupOuterJoinGenre();
        }
        return _conditionQueryGenre;
    }
    protected LdGenreCQ xcreateQueryGenre() {
        String nrp = resolveNextRelationPath("BOOK", "genre");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdGenreCQ cq = new LdGenreCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("genre"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinGenre() {
        LdGenreCQ cq = getConditionQueryGenre();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("GENRE_CODE"), cq.getRealColumnName("GENRE_CODE"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryGenre() {
        return _conditionQueryGenre != null;
    }

    public LdPublisherCQ queryPublisher() {
        return getConditionQueryPublisher();
    }
    protected LdPublisherCQ _conditionQueryPublisher;
    public LdPublisherCQ getConditionQueryPublisher() {
        if (_conditionQueryPublisher == null) {
            _conditionQueryPublisher = xcreateQueryPublisher();
            xsetupOuterJoinPublisher();
        }
        return _conditionQueryPublisher;
    }
    protected LdPublisherCQ xcreateQueryPublisher() {
        String nrp = resolveNextRelationPath("BOOK", "publisher");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdPublisherCQ cq = new LdPublisherCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("publisher"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinPublisher() {
        LdPublisherCQ cq = getConditionQueryPublisher();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("PUBLISHER_ID"), cq.getRealColumnName("PUBLISHER_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryPublisher() {
        return _conditionQueryPublisher != null;
    }

    public LdCollectionStatusLookupCQ queryCollectionStatusLookupAsNonExist() {
        return getConditionQueryCollectionStatusLookupAsNonExist();
    }
    protected LdCollectionStatusLookupCQ _conditionQueryCollectionStatusLookupAsNonExist;
    public LdCollectionStatusLookupCQ getConditionQueryCollectionStatusLookupAsNonExist() {
        if (_conditionQueryCollectionStatusLookupAsNonExist == null) {
            _conditionQueryCollectionStatusLookupAsNonExist = xcreateQueryCollectionStatusLookupAsNonExist();
            xsetupOuterJoinCollectionStatusLookupAsNonExist();
        }
        return _conditionQueryCollectionStatusLookupAsNonExist;
    }
    protected LdCollectionStatusLookupCQ xcreateQueryCollectionStatusLookupAsNonExist() {
        String nrp = resolveNextRelationPath("BOOK", "collectionStatusLookupAsNonExist");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdCollectionStatusLookupCQ cq = new LdCollectionStatusLookupCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("collectionStatusLookupAsNonExist"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinCollectionStatusLookupAsNonExist() {
        LdCollectionStatusLookupCQ cq = getConditionQueryCollectionStatusLookupAsNonExist();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("GENRE_CODE"), cq.getRealColumnName("COLLECTION_STATUS_CODE"));
        joinOnMap.put("$$fixedCondition$$", ppFxCd("$$foreignAlias$$.COLLECTION_STATUS_NAME = 'nonexist'", getRealAliasName(), cq.getRealAliasName()));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryCollectionStatusLookupAsNonExist() {
        return _conditionQueryCollectionStatusLookupAsNonExist != null;
    }

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    protected Map<String, LdBookCQ> _scalarSubQueryMap;
    public Map<String, LdBookCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(LdBookCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdBookCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdBookCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

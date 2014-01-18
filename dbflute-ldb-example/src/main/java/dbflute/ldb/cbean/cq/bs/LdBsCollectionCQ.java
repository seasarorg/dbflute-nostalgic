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
 * The base condition-query of COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsCollectionCQ extends LdAbstractBsCollectionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdCollectionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsCollectionCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from COLLECTION) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdCollectionCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdCollectionCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join COLLECTION on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdCollectionCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdCollectionCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _collectionId;
    public LdConditionValue getCollectionId() {
        if (_collectionId == null) { _collectionId = new LdConditionValue(); }
        return _collectionId;
    }
    protected LdConditionValue getCValueCollectionId() { return getCollectionId(); }

    protected Map<String, LdCollectionStatusCQ> _collectionId_InScopeSubQuery_CollectionStatusAsOneMap;
    public Map<String, LdCollectionStatusCQ> getCollectionId_InScopeSubQuery_CollectionStatusAsOne() { return _collectionId_InScopeSubQuery_CollectionStatusAsOneMap; }
    public String keepCollectionId_InScopeSubQuery_CollectionStatusAsOne(LdCollectionStatusCQ subQuery) {
        if (_collectionId_InScopeSubQuery_CollectionStatusAsOneMap == null) { _collectionId_InScopeSubQuery_CollectionStatusAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionId_InScopeSubQuery_CollectionStatusAsOneMap.size() + 1);
        _collectionId_InScopeSubQuery_CollectionStatusAsOneMap.put(key, subQuery); return "collectionId_InScopeSubQuery_CollectionStatusAsOne." + key;
    }

    protected Map<String, LdLendingCollectionCQ> _collectionId_InScopeSubQuery_LendingCollectionListMap;
    public Map<String, LdLendingCollectionCQ> getCollectionId_InScopeSubQuery_LendingCollectionList() { return _collectionId_InScopeSubQuery_LendingCollectionListMap; }
    public String keepCollectionId_InScopeSubQuery_LendingCollectionList(LdLendingCollectionCQ subQuery) {
        if (_collectionId_InScopeSubQuery_LendingCollectionListMap == null) { _collectionId_InScopeSubQuery_LendingCollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionId_InScopeSubQuery_LendingCollectionListMap.size() + 1);
        _collectionId_InScopeSubQuery_LendingCollectionListMap.put(key, subQuery); return "collectionId_InScopeSubQuery_LendingCollectionList." + key;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionId_NotInScopeSubQuery_CollectionStatusAsOneMap;
    public Map<String, LdCollectionStatusCQ> getCollectionId_NotInScopeSubQuery_CollectionStatusAsOne() { return _collectionId_NotInScopeSubQuery_CollectionStatusAsOneMap; }
    public String keepCollectionId_NotInScopeSubQuery_CollectionStatusAsOne(LdCollectionStatusCQ subQuery) {
        if (_collectionId_NotInScopeSubQuery_CollectionStatusAsOneMap == null) { _collectionId_NotInScopeSubQuery_CollectionStatusAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionId_NotInScopeSubQuery_CollectionStatusAsOneMap.size() + 1);
        _collectionId_NotInScopeSubQuery_CollectionStatusAsOneMap.put(key, subQuery); return "collectionId_NotInScopeSubQuery_CollectionStatusAsOne." + key;
    }

    protected Map<String, LdLendingCollectionCQ> _collectionId_NotInScopeSubQuery_LendingCollectionListMap;
    public Map<String, LdLendingCollectionCQ> getCollectionId_NotInScopeSubQuery_LendingCollectionList() { return _collectionId_NotInScopeSubQuery_LendingCollectionListMap; }
    public String keepCollectionId_NotInScopeSubQuery_LendingCollectionList(LdLendingCollectionCQ subQuery) {
        if (_collectionId_NotInScopeSubQuery_LendingCollectionListMap == null) { _collectionId_NotInScopeSubQuery_LendingCollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionId_NotInScopeSubQuery_LendingCollectionListMap.size() + 1);
        _collectionId_NotInScopeSubQuery_LendingCollectionListMap.put(key, subQuery); return "collectionId_NotInScopeSubQuery_LendingCollectionList." + key;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionId_ExistsSubQuery_CollectionStatusAsOneMap;
    public Map<String, LdCollectionStatusCQ> getCollectionId_ExistsSubQuery_CollectionStatusAsOne() { return _collectionId_ExistsSubQuery_CollectionStatusAsOneMap; }
    public String keepCollectionId_ExistsSubQuery_CollectionStatusAsOne(LdCollectionStatusCQ subQuery) {
        if (_collectionId_ExistsSubQuery_CollectionStatusAsOneMap == null) { _collectionId_ExistsSubQuery_CollectionStatusAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionId_ExistsSubQuery_CollectionStatusAsOneMap.size() + 1);
        _collectionId_ExistsSubQuery_CollectionStatusAsOneMap.put(key, subQuery); return "collectionId_ExistsSubQuery_CollectionStatusAsOne." + key;
    }

    protected Map<String, LdLendingCollectionCQ> _collectionId_ExistsSubQuery_LendingCollectionListMap;
    public Map<String, LdLendingCollectionCQ> getCollectionId_ExistsSubQuery_LendingCollectionList() { return _collectionId_ExistsSubQuery_LendingCollectionListMap; }
    public String keepCollectionId_ExistsSubQuery_LendingCollectionList(LdLendingCollectionCQ subQuery) {
        if (_collectionId_ExistsSubQuery_LendingCollectionListMap == null) { _collectionId_ExistsSubQuery_LendingCollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionId_ExistsSubQuery_LendingCollectionListMap.size() + 1);
        _collectionId_ExistsSubQuery_LendingCollectionListMap.put(key, subQuery); return "collectionId_ExistsSubQuery_LendingCollectionList." + key;
    }

    protected Map<String, LdCollectionStatusCQ> _collectionId_NotExistsSubQuery_CollectionStatusAsOneMap;
    public Map<String, LdCollectionStatusCQ> getCollectionId_NotExistsSubQuery_CollectionStatusAsOne() { return _collectionId_NotExistsSubQuery_CollectionStatusAsOneMap; }
    public String keepCollectionId_NotExistsSubQuery_CollectionStatusAsOne(LdCollectionStatusCQ subQuery) {
        if (_collectionId_NotExistsSubQuery_CollectionStatusAsOneMap == null) { _collectionId_NotExistsSubQuery_CollectionStatusAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionId_NotExistsSubQuery_CollectionStatusAsOneMap.size() + 1);
        _collectionId_NotExistsSubQuery_CollectionStatusAsOneMap.put(key, subQuery); return "collectionId_NotExistsSubQuery_CollectionStatusAsOne." + key;
    }

    protected Map<String, LdLendingCollectionCQ> _collectionId_NotExistsSubQuery_LendingCollectionListMap;
    public Map<String, LdLendingCollectionCQ> getCollectionId_NotExistsSubQuery_LendingCollectionList() { return _collectionId_NotExistsSubQuery_LendingCollectionListMap; }
    public String keepCollectionId_NotExistsSubQuery_LendingCollectionList(LdLendingCollectionCQ subQuery) {
        if (_collectionId_NotExistsSubQuery_LendingCollectionListMap == null) { _collectionId_NotExistsSubQuery_LendingCollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionId_NotExistsSubQuery_LendingCollectionListMap.size() + 1);
        _collectionId_NotExistsSubQuery_LendingCollectionListMap.put(key, subQuery); return "collectionId_NotExistsSubQuery_LendingCollectionList." + key;
    }

    protected Map<String, LdLendingCollectionCQ> _collectionId_SpecifyDerivedReferrer_LendingCollectionListMap;
    public Map<String, LdLendingCollectionCQ> getCollectionId_SpecifyDerivedReferrer_LendingCollectionList() { return _collectionId_SpecifyDerivedReferrer_LendingCollectionListMap; }
    public String keepCollectionId_SpecifyDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ subQuery) {
        if (_collectionId_SpecifyDerivedReferrer_LendingCollectionListMap == null) { _collectionId_SpecifyDerivedReferrer_LendingCollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionId_SpecifyDerivedReferrer_LendingCollectionListMap.size() + 1);
        _collectionId_SpecifyDerivedReferrer_LendingCollectionListMap.put(key, subQuery); return "collectionId_SpecifyDerivedReferrer_LendingCollectionList." + key;
    }

    protected Map<String, LdLendingCollectionCQ> _collectionId_QueryDerivedReferrer_LendingCollectionListMap;
    public Map<String, LdLendingCollectionCQ> getCollectionId_QueryDerivedReferrer_LendingCollectionList() { return _collectionId_QueryDerivedReferrer_LendingCollectionListMap; }
    public String keepCollectionId_QueryDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ subQuery) {
        if (_collectionId_QueryDerivedReferrer_LendingCollectionListMap == null) { _collectionId_QueryDerivedReferrer_LendingCollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionId_QueryDerivedReferrer_LendingCollectionListMap.size() + 1);
        _collectionId_QueryDerivedReferrer_LendingCollectionListMap.put(key, subQuery); return "collectionId_QueryDerivedReferrer_LendingCollectionList." + key;
    }
    protected Map<String, Object> _collectionId_QueryDerivedReferrer_LendingCollectionListParameterMap;
    public Map<String, Object> getCollectionId_QueryDerivedReferrer_LendingCollectionListParameter() { return _collectionId_QueryDerivedReferrer_LendingCollectionListParameterMap; }
    public String keepCollectionId_QueryDerivedReferrer_LendingCollectionListParameter(Object parameterValue) {
        if (_collectionId_QueryDerivedReferrer_LendingCollectionListParameterMap == null) { _collectionId_QueryDerivedReferrer_LendingCollectionListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_collectionId_QueryDerivedReferrer_LendingCollectionListParameterMap.size() + 1);
        _collectionId_QueryDerivedReferrer_LendingCollectionListParameterMap.put(key, parameterValue); return "collectionId_QueryDerivedReferrer_LendingCollectionListParameter." + key;
    }

    public LdBsCollectionCQ addOrderBy_CollectionId_Asc() { regOBA("COLLECTION_ID"); return this; }
    public LdBsCollectionCQ addOrderBy_CollectionId_Desc() { regOBD("COLLECTION_ID"); return this; }

    protected LdConditionValue _libraryId;
    public LdConditionValue getLibraryId() {
        if (_libraryId == null) { _libraryId = new LdConditionValue(); }
        return _libraryId;
    }
    protected LdConditionValue getCValueLibraryId() { return getLibraryId(); }

    protected Map<String, LdLibraryCQ> _libraryId_InScopeSubQuery_LibraryMap;
    public Map<String, LdLibraryCQ> getLibraryId_InScopeSubQuery_Library() { return _libraryId_InScopeSubQuery_LibraryMap; }
    public String keepLibraryId_InScopeSubQuery_Library(LdLibraryCQ subQuery) {
        if (_libraryId_InScopeSubQuery_LibraryMap == null) { _libraryId_InScopeSubQuery_LibraryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_InScopeSubQuery_LibraryMap.size() + 1);
        _libraryId_InScopeSubQuery_LibraryMap.put(key, subQuery); return "libraryId_InScopeSubQuery_Library." + key;
    }
      
    public LdBsCollectionCQ addOrderBy_LibraryId_Asc() { regOBA("LIBRARY_ID"); return this; }
    public LdBsCollectionCQ addOrderBy_LibraryId_Desc() { regOBD("LIBRARY_ID"); return this; }

    protected LdConditionValue _bookId;
    public LdConditionValue getBookId() {
        if (_bookId == null) { _bookId = new LdConditionValue(); }
        return _bookId;
    }
    protected LdConditionValue getCValueBookId() { return getBookId(); }

    protected Map<String, LdBookCQ> _bookId_InScopeSubQuery_BookMap;
    public Map<String, LdBookCQ> getBookId_InScopeSubQuery_Book() { return _bookId_InScopeSubQuery_BookMap; }
    public String keepBookId_InScopeSubQuery_Book(LdBookCQ subQuery) {
        if (_bookId_InScopeSubQuery_BookMap == null) { _bookId_InScopeSubQuery_BookMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_bookId_InScopeSubQuery_BookMap.size() + 1);
        _bookId_InScopeSubQuery_BookMap.put(key, subQuery); return "bookId_InScopeSubQuery_Book." + key;
    }
      
    public LdBsCollectionCQ addOrderBy_BookId_Asc() { regOBA("BOOK_ID"); return this; }
    public LdBsCollectionCQ addOrderBy_BookId_Desc() { regOBD("BOOK_ID"); return this; }

    protected LdConditionValue _arrivalDate;
    public LdConditionValue getArrivalDate() {
        if (_arrivalDate == null) { _arrivalDate = new LdConditionValue(); }
        return _arrivalDate;
    }
    protected LdConditionValue getCValueArrivalDate() { return getArrivalDate(); }

    public LdBsCollectionCQ addOrderBy_ArrivalDate_Asc() { regOBA("ARRIVAL_DATE"); return this; }
    public LdBsCollectionCQ addOrderBy_ArrivalDate_Desc() { regOBD("ARRIVAL_DATE"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsCollectionCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsCollectionCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsCollectionCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsCollectionCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsCollectionCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsCollectionCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsCollectionCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsCollectionCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsCollectionCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsCollectionCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsCollectionCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsCollectionCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsCollectionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsCollectionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
        LdCollectionCQ baseQuery = (LdCollectionCQ)baseQueryAsSuper;
        LdCollectionCQ unionQuery = (LdCollectionCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryBook()) {
            unionQuery.queryBook().reflectRelationOnUnionQuery(baseQuery.queryBook(), unionQuery.queryBook());
        }
        if (baseQuery.hasConditionQueryLibrary()) {
            unionQuery.queryLibrary().reflectRelationOnUnionQuery(baseQuery.queryLibrary(), unionQuery.queryLibrary());
        }
        if (baseQuery.hasConditionQueryCollectionStatusAsOne()) {
            unionQuery.queryCollectionStatusAsOne().reflectRelationOnUnionQuery(baseQuery.queryCollectionStatusAsOne(), unionQuery.queryCollectionStatusAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    public LdBookCQ queryBook() {
        return getConditionQueryBook();
    }
    protected LdBookCQ _conditionQueryBook;
    public LdBookCQ getConditionQueryBook() {
        if (_conditionQueryBook == null) {
            _conditionQueryBook = xcreateQueryBook();
            xsetupOuterJoinBook();
        }
        return _conditionQueryBook;
    }
    protected LdBookCQ xcreateQueryBook() {
        String nrp = resolveNextRelationPath("COLLECTION", "book");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdBookCQ cq = new LdBookCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("book"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinBook() {
        LdBookCQ cq = getConditionQueryBook();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("BOOK_ID"), cq.getRealColumnName("BOOK_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryBook() {
        return _conditionQueryBook != null;
    }

    public LdLibraryCQ queryLibrary() {
        return getConditionQueryLibrary();
    }
    protected LdLibraryCQ _conditionQueryLibrary;
    public LdLibraryCQ getConditionQueryLibrary() {
        if (_conditionQueryLibrary == null) {
            _conditionQueryLibrary = xcreateQueryLibrary();
            xsetupOuterJoinLibrary();
        }
        return _conditionQueryLibrary;
    }
    protected LdLibraryCQ xcreateQueryLibrary() {
        String nrp = resolveNextRelationPath("COLLECTION", "library");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdLibraryCQ cq = new LdLibraryCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("library"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLibrary() {
        LdLibraryCQ cq = getConditionQueryLibrary();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("LIBRARY_ID"), cq.getRealColumnName("LIBRARY_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryLibrary() {
        return _conditionQueryLibrary != null;
    }

    public LdCollectionStatusCQ queryCollectionStatusAsOne() {
        return getConditionQueryCollectionStatusAsOne();
    }
    protected LdCollectionStatusCQ _conditionQueryCollectionStatusAsOne;
    public LdCollectionStatusCQ getConditionQueryCollectionStatusAsOne() {
        if (_conditionQueryCollectionStatusAsOne == null) {
            _conditionQueryCollectionStatusAsOne = xcreateQueryCollectionStatusAsOne();
            xsetupOuterJoinCollectionStatusAsOne();
        }
        return _conditionQueryCollectionStatusAsOne;
    }
    protected LdCollectionStatusCQ xcreateQueryCollectionStatusAsOne() {
        String nrp = resolveNextRelationPath("COLLECTION", "collectionStatusAsOne");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdCollectionStatusCQ cq = new LdCollectionStatusCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("collectionStatusAsOne"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinCollectionStatusAsOne() {
        LdCollectionStatusCQ cq = getConditionQueryCollectionStatusAsOne();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("COLLECTION_ID"), cq.getRealColumnName("COLLECTION_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryCollectionStatusAsOne() {
        return _conditionQueryCollectionStatusAsOne != null;
    }

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    protected Map<String, LdCollectionCQ> _scalarSubQueryMap;
    public Map<String, LdCollectionCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(LdCollectionCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdCollectionCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdCollectionCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

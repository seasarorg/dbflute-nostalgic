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
 * The base condition-query of AUTHOR.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsAuthorCQ extends LdAbstractBsAuthorCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdAuthorCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsAuthorCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from AUTHOR) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdAuthorCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdAuthorCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join AUTHOR on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdAuthorCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdAuthorCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _authorId;
    public LdConditionValue getAuthorId() {
        if (_authorId == null) { _authorId = new LdConditionValue(); }
        return _authorId;
    }
    protected LdConditionValue getCValueAuthorId() { return getAuthorId(); }

    protected Map<String, LdBookCQ> _authorId_InScopeSubQuery_BookListMap;
    public Map<String, LdBookCQ> getAuthorId_InScopeSubQuery_BookList() { return _authorId_InScopeSubQuery_BookListMap; }
    public String keepAuthorId_InScopeSubQuery_BookList(LdBookCQ subQuery) {
        if (_authorId_InScopeSubQuery_BookListMap == null) { _authorId_InScopeSubQuery_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_authorId_InScopeSubQuery_BookListMap.size() + 1);
        _authorId_InScopeSubQuery_BookListMap.put(key, subQuery); return "authorId_InScopeSubQuery_BookList." + key;
    }

    protected Map<String, LdBookCQ> _authorId_NotInScopeSubQuery_BookListMap;
    public Map<String, LdBookCQ> getAuthorId_NotInScopeSubQuery_BookList() { return _authorId_NotInScopeSubQuery_BookListMap; }
    public String keepAuthorId_NotInScopeSubQuery_BookList(LdBookCQ subQuery) {
        if (_authorId_NotInScopeSubQuery_BookListMap == null) { _authorId_NotInScopeSubQuery_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_authorId_NotInScopeSubQuery_BookListMap.size() + 1);
        _authorId_NotInScopeSubQuery_BookListMap.put(key, subQuery); return "authorId_NotInScopeSubQuery_BookList." + key;
    }

    protected Map<String, LdBookCQ> _authorId_ExistsSubQuery_BookListMap;
    public Map<String, LdBookCQ> getAuthorId_ExistsSubQuery_BookList() { return _authorId_ExistsSubQuery_BookListMap; }
    public String keepAuthorId_ExistsSubQuery_BookList(LdBookCQ subQuery) {
        if (_authorId_ExistsSubQuery_BookListMap == null) { _authorId_ExistsSubQuery_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_authorId_ExistsSubQuery_BookListMap.size() + 1);
        _authorId_ExistsSubQuery_BookListMap.put(key, subQuery); return "authorId_ExistsSubQuery_BookList." + key;
    }

    protected Map<String, LdBookCQ> _authorId_NotExistsSubQuery_BookListMap;
    public Map<String, LdBookCQ> getAuthorId_NotExistsSubQuery_BookList() { return _authorId_NotExistsSubQuery_BookListMap; }
    public String keepAuthorId_NotExistsSubQuery_BookList(LdBookCQ subQuery) {
        if (_authorId_NotExistsSubQuery_BookListMap == null) { _authorId_NotExistsSubQuery_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_authorId_NotExistsSubQuery_BookListMap.size() + 1);
        _authorId_NotExistsSubQuery_BookListMap.put(key, subQuery); return "authorId_NotExistsSubQuery_BookList." + key;
    }

    protected Map<String, LdBookCQ> _authorId_SpecifyDerivedReferrer_BookListMap;
    public Map<String, LdBookCQ> getAuthorId_SpecifyDerivedReferrer_BookList() { return _authorId_SpecifyDerivedReferrer_BookListMap; }
    public String keepAuthorId_SpecifyDerivedReferrer_BookList(LdBookCQ subQuery) {
        if (_authorId_SpecifyDerivedReferrer_BookListMap == null) { _authorId_SpecifyDerivedReferrer_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_authorId_SpecifyDerivedReferrer_BookListMap.size() + 1);
        _authorId_SpecifyDerivedReferrer_BookListMap.put(key, subQuery); return "authorId_SpecifyDerivedReferrer_BookList." + key;
    }

    protected Map<String, LdBookCQ> _authorId_QueryDerivedReferrer_BookListMap;
    public Map<String, LdBookCQ> getAuthorId_QueryDerivedReferrer_BookList() { return _authorId_QueryDerivedReferrer_BookListMap; }
    public String keepAuthorId_QueryDerivedReferrer_BookList(LdBookCQ subQuery) {
        if (_authorId_QueryDerivedReferrer_BookListMap == null) { _authorId_QueryDerivedReferrer_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_authorId_QueryDerivedReferrer_BookListMap.size() + 1);
        _authorId_QueryDerivedReferrer_BookListMap.put(key, subQuery); return "authorId_QueryDerivedReferrer_BookList." + key;
    }
    protected Map<String, Object> _authorId_QueryDerivedReferrer_BookListParameterMap;
    public Map<String, Object> getAuthorId_QueryDerivedReferrer_BookListParameter() { return _authorId_QueryDerivedReferrer_BookListParameterMap; }
    public String keepAuthorId_QueryDerivedReferrer_BookListParameter(Object parameterValue) {
        if (_authorId_QueryDerivedReferrer_BookListParameterMap == null) { _authorId_QueryDerivedReferrer_BookListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_authorId_QueryDerivedReferrer_BookListParameterMap.size() + 1);
        _authorId_QueryDerivedReferrer_BookListParameterMap.put(key, parameterValue); return "authorId_QueryDerivedReferrer_BookListParameter." + key;
    }

    public LdBsAuthorCQ addOrderBy_AuthorId_Asc() { regOBA("AUTHOR_ID"); return this; }
    public LdBsAuthorCQ addOrderBy_AuthorId_Desc() { regOBD("AUTHOR_ID"); return this; }

    protected LdConditionValue _authorName;
    public LdConditionValue getAuthorName() {
        if (_authorName == null) { _authorName = new LdConditionValue(); }
        return _authorName;
    }
    protected LdConditionValue getCValueAuthorName() { return getAuthorName(); }

    public LdBsAuthorCQ addOrderBy_AuthorName_Asc() { regOBA("AUTHOR_NAME"); return this; }
    public LdBsAuthorCQ addOrderBy_AuthorName_Desc() { regOBD("AUTHOR_NAME"); return this; }

    protected LdConditionValue _authorAge;
    public LdConditionValue getAuthorAge() {
        if (_authorAge == null) { _authorAge = new LdConditionValue(); }
        return _authorAge;
    }
    protected LdConditionValue getCValueAuthorAge() { return getAuthorAge(); }

    public LdBsAuthorCQ addOrderBy_AuthorAge_Asc() { regOBA("AUTHOR_AGE"); return this; }
    public LdBsAuthorCQ addOrderBy_AuthorAge_Desc() { regOBD("AUTHOR_AGE"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsAuthorCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsAuthorCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsAuthorCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsAuthorCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsAuthorCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsAuthorCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsAuthorCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsAuthorCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsAuthorCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsAuthorCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsAuthorCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsAuthorCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsAuthorCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsAuthorCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    protected Map<String, LdAuthorCQ> _scalarSubQueryMap;
    public Map<String, LdAuthorCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(LdAuthorCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdAuthorCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdAuthorCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

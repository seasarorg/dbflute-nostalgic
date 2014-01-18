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
 * The base condition-query of PUBLISHER.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsPublisherCQ extends LdAbstractBsPublisherCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdPublisherCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsPublisherCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from PUBLISHER) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdPublisherCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdPublisherCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join PUBLISHER on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdPublisherCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdPublisherCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _publisherId;
    public LdConditionValue getPublisherId() {
        if (_publisherId == null) { _publisherId = new LdConditionValue(); }
        return _publisherId;
    }
    protected LdConditionValue getCValuePublisherId() { return getPublisherId(); }

    protected Map<String, LdBookCQ> _publisherId_InScopeSubQuery_BookListMap;
    public Map<String, LdBookCQ> getPublisherId_InScopeSubQuery_BookList() { return _publisherId_InScopeSubQuery_BookListMap; }
    public String keepPublisherId_InScopeSubQuery_BookList(LdBookCQ subQuery) {
        if (_publisherId_InScopeSubQuery_BookListMap == null) { _publisherId_InScopeSubQuery_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_publisherId_InScopeSubQuery_BookListMap.size() + 1);
        _publisherId_InScopeSubQuery_BookListMap.put(key, subQuery); return "publisherId_InScopeSubQuery_BookList." + key;
    }

    protected Map<String, LdBookCQ> _publisherId_NotInScopeSubQuery_BookListMap;
    public Map<String, LdBookCQ> getPublisherId_NotInScopeSubQuery_BookList() { return _publisherId_NotInScopeSubQuery_BookListMap; }
    public String keepPublisherId_NotInScopeSubQuery_BookList(LdBookCQ subQuery) {
        if (_publisherId_NotInScopeSubQuery_BookListMap == null) { _publisherId_NotInScopeSubQuery_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_publisherId_NotInScopeSubQuery_BookListMap.size() + 1);
        _publisherId_NotInScopeSubQuery_BookListMap.put(key, subQuery); return "publisherId_NotInScopeSubQuery_BookList." + key;
    }

    protected Map<String, LdBookCQ> _publisherId_ExistsSubQuery_BookListMap;
    public Map<String, LdBookCQ> getPublisherId_ExistsSubQuery_BookList() { return _publisherId_ExistsSubQuery_BookListMap; }
    public String keepPublisherId_ExistsSubQuery_BookList(LdBookCQ subQuery) {
        if (_publisherId_ExistsSubQuery_BookListMap == null) { _publisherId_ExistsSubQuery_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_publisherId_ExistsSubQuery_BookListMap.size() + 1);
        _publisherId_ExistsSubQuery_BookListMap.put(key, subQuery); return "publisherId_ExistsSubQuery_BookList." + key;
    }

    protected Map<String, LdBookCQ> _publisherId_NotExistsSubQuery_BookListMap;
    public Map<String, LdBookCQ> getPublisherId_NotExistsSubQuery_BookList() { return _publisherId_NotExistsSubQuery_BookListMap; }
    public String keepPublisherId_NotExistsSubQuery_BookList(LdBookCQ subQuery) {
        if (_publisherId_NotExistsSubQuery_BookListMap == null) { _publisherId_NotExistsSubQuery_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_publisherId_NotExistsSubQuery_BookListMap.size() + 1);
        _publisherId_NotExistsSubQuery_BookListMap.put(key, subQuery); return "publisherId_NotExistsSubQuery_BookList." + key;
    }

    protected Map<String, LdBookCQ> _publisherId_SpecifyDerivedReferrer_BookListMap;
    public Map<String, LdBookCQ> getPublisherId_SpecifyDerivedReferrer_BookList() { return _publisherId_SpecifyDerivedReferrer_BookListMap; }
    public String keepPublisherId_SpecifyDerivedReferrer_BookList(LdBookCQ subQuery) {
        if (_publisherId_SpecifyDerivedReferrer_BookListMap == null) { _publisherId_SpecifyDerivedReferrer_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_publisherId_SpecifyDerivedReferrer_BookListMap.size() + 1);
        _publisherId_SpecifyDerivedReferrer_BookListMap.put(key, subQuery); return "publisherId_SpecifyDerivedReferrer_BookList." + key;
    }

    protected Map<String, LdBookCQ> _publisherId_QueryDerivedReferrer_BookListMap;
    public Map<String, LdBookCQ> getPublisherId_QueryDerivedReferrer_BookList() { return _publisherId_QueryDerivedReferrer_BookListMap; }
    public String keepPublisherId_QueryDerivedReferrer_BookList(LdBookCQ subQuery) {
        if (_publisherId_QueryDerivedReferrer_BookListMap == null) { _publisherId_QueryDerivedReferrer_BookListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_publisherId_QueryDerivedReferrer_BookListMap.size() + 1);
        _publisherId_QueryDerivedReferrer_BookListMap.put(key, subQuery); return "publisherId_QueryDerivedReferrer_BookList." + key;
    }
    protected Map<String, Object> _publisherId_QueryDerivedReferrer_BookListParameterMap;
    public Map<String, Object> getPublisherId_QueryDerivedReferrer_BookListParameter() { return _publisherId_QueryDerivedReferrer_BookListParameterMap; }
    public String keepPublisherId_QueryDerivedReferrer_BookListParameter(Object parameterValue) {
        if (_publisherId_QueryDerivedReferrer_BookListParameterMap == null) { _publisherId_QueryDerivedReferrer_BookListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_publisherId_QueryDerivedReferrer_BookListParameterMap.size() + 1);
        _publisherId_QueryDerivedReferrer_BookListParameterMap.put(key, parameterValue); return "publisherId_QueryDerivedReferrer_BookListParameter." + key;
    }

    public LdBsPublisherCQ addOrderBy_PublisherId_Asc() { regOBA("PUBLISHER_ID"); return this; }
    public LdBsPublisherCQ addOrderBy_PublisherId_Desc() { regOBD("PUBLISHER_ID"); return this; }

    protected LdConditionValue _publisherName;
    public LdConditionValue getPublisherName() {
        if (_publisherName == null) { _publisherName = new LdConditionValue(); }
        return _publisherName;
    }
    protected LdConditionValue getCValuePublisherName() { return getPublisherName(); }

    public LdBsPublisherCQ addOrderBy_PublisherName_Asc() { regOBA("PUBLISHER_NAME"); return this; }
    public LdBsPublisherCQ addOrderBy_PublisherName_Desc() { regOBD("PUBLISHER_NAME"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsPublisherCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsPublisherCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsPublisherCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsPublisherCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsPublisherCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsPublisherCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsPublisherCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsPublisherCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsPublisherCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsPublisherCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsPublisherCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsPublisherCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsPublisherCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsPublisherCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    protected Map<String, LdPublisherCQ> _scalarSubQueryMap;
    public Map<String, LdPublisherCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(LdPublisherCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdPublisherCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdPublisherCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

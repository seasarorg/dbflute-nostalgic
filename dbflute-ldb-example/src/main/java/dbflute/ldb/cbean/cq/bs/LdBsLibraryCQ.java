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
 * The base condition-query of LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLibraryCQ extends LdAbstractBsLibraryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLibraryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLibraryCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from LIBRARY) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdLibraryCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdLibraryCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join LIBRARY on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdLibraryCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdLibraryCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _libraryId;
    public LdConditionValue getLibraryId() {
        if (_libraryId == null) { _libraryId = new LdConditionValue(); }
        return _libraryId;
    }
    protected LdConditionValue getCValueLibraryId() { return getLibraryId(); }

    protected Map<String, LdCollectionCQ> _libraryId_InScopeSubQuery_CollectionListMap;
    public Map<String, LdCollectionCQ> getLibraryId_InScopeSubQuery_CollectionList() { return _libraryId_InScopeSubQuery_CollectionListMap; }
    public String keepLibraryId_InScopeSubQuery_CollectionList(LdCollectionCQ subQuery) {
        if (_libraryId_InScopeSubQuery_CollectionListMap == null) { _libraryId_InScopeSubQuery_CollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_InScopeSubQuery_CollectionListMap.size() + 1);
        _libraryId_InScopeSubQuery_CollectionListMap.put(key, subQuery); return "libraryId_InScopeSubQuery_CollectionList." + key;
    }

    protected Map<String, LdLibraryUserCQ> _libraryId_InScopeSubQuery_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLibraryId_InScopeSubQuery_LibraryUserList() { return _libraryId_InScopeSubQuery_LibraryUserListMap; }
    public String keepLibraryId_InScopeSubQuery_LibraryUserList(LdLibraryUserCQ subQuery) {
        if (_libraryId_InScopeSubQuery_LibraryUserListMap == null) { _libraryId_InScopeSubQuery_LibraryUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_InScopeSubQuery_LibraryUserListMap.size() + 1);
        _libraryId_InScopeSubQuery_LibraryUserListMap.put(key, subQuery); return "libraryId_InScopeSubQuery_LibraryUserList." + key;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_InScopeSubQuery_NextLibraryByNextIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_InScopeSubQuery_NextLibraryByNextIdList() { return _libraryId_InScopeSubQuery_NextLibraryByNextIdListMap; }
    public String keepLibraryId_InScopeSubQuery_NextLibraryByNextIdList(LdNextLibraryCQ subQuery) {
        if (_libraryId_InScopeSubQuery_NextLibraryByNextIdListMap == null) { _libraryId_InScopeSubQuery_NextLibraryByNextIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_InScopeSubQuery_NextLibraryByNextIdListMap.size() + 1);
        _libraryId_InScopeSubQuery_NextLibraryByNextIdListMap.put(key, subQuery); return "libraryId_InScopeSubQuery_NextLibraryByNextIdList." + key;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_InScopeSubQuery_NextLibraryByBaseIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_InScopeSubQuery_NextLibraryByBaseIdList() { return _libraryId_InScopeSubQuery_NextLibraryByBaseIdListMap; }
    public String keepLibraryId_InScopeSubQuery_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery) {
        if (_libraryId_InScopeSubQuery_NextLibraryByBaseIdListMap == null) { _libraryId_InScopeSubQuery_NextLibraryByBaseIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_InScopeSubQuery_NextLibraryByBaseIdListMap.size() + 1);
        _libraryId_InScopeSubQuery_NextLibraryByBaseIdListMap.put(key, subQuery); return "libraryId_InScopeSubQuery_NextLibraryByBaseIdList." + key;
    }

    protected Map<String, LdCollectionCQ> _libraryId_NotInScopeSubQuery_CollectionListMap;
    public Map<String, LdCollectionCQ> getLibraryId_NotInScopeSubQuery_CollectionList() { return _libraryId_NotInScopeSubQuery_CollectionListMap; }
    public String keepLibraryId_NotInScopeSubQuery_CollectionList(LdCollectionCQ subQuery) {
        if (_libraryId_NotInScopeSubQuery_CollectionListMap == null) { _libraryId_NotInScopeSubQuery_CollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_NotInScopeSubQuery_CollectionListMap.size() + 1);
        _libraryId_NotInScopeSubQuery_CollectionListMap.put(key, subQuery); return "libraryId_NotInScopeSubQuery_CollectionList." + key;
    }

    protected Map<String, LdLibraryUserCQ> _libraryId_NotInScopeSubQuery_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLibraryId_NotInScopeSubQuery_LibraryUserList() { return _libraryId_NotInScopeSubQuery_LibraryUserListMap; }
    public String keepLibraryId_NotInScopeSubQuery_LibraryUserList(LdLibraryUserCQ subQuery) {
        if (_libraryId_NotInScopeSubQuery_LibraryUserListMap == null) { _libraryId_NotInScopeSubQuery_LibraryUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_NotInScopeSubQuery_LibraryUserListMap.size() + 1);
        _libraryId_NotInScopeSubQuery_LibraryUserListMap.put(key, subQuery); return "libraryId_NotInScopeSubQuery_LibraryUserList." + key;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_NotInScopeSubQuery_NextLibraryByNextIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_NotInScopeSubQuery_NextLibraryByNextIdList() { return _libraryId_NotInScopeSubQuery_NextLibraryByNextIdListMap; }
    public String keepLibraryId_NotInScopeSubQuery_NextLibraryByNextIdList(LdNextLibraryCQ subQuery) {
        if (_libraryId_NotInScopeSubQuery_NextLibraryByNextIdListMap == null) { _libraryId_NotInScopeSubQuery_NextLibraryByNextIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_NotInScopeSubQuery_NextLibraryByNextIdListMap.size() + 1);
        _libraryId_NotInScopeSubQuery_NextLibraryByNextIdListMap.put(key, subQuery); return "libraryId_NotInScopeSubQuery_NextLibraryByNextIdList." + key;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_NotInScopeSubQuery_NextLibraryByBaseIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_NotInScopeSubQuery_NextLibraryByBaseIdList() { return _libraryId_NotInScopeSubQuery_NextLibraryByBaseIdListMap; }
    public String keepLibraryId_NotInScopeSubQuery_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery) {
        if (_libraryId_NotInScopeSubQuery_NextLibraryByBaseIdListMap == null) { _libraryId_NotInScopeSubQuery_NextLibraryByBaseIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_NotInScopeSubQuery_NextLibraryByBaseIdListMap.size() + 1);
        _libraryId_NotInScopeSubQuery_NextLibraryByBaseIdListMap.put(key, subQuery); return "libraryId_NotInScopeSubQuery_NextLibraryByBaseIdList." + key;
    }

    protected Map<String, LdCollectionCQ> _libraryId_ExistsSubQuery_CollectionListMap;
    public Map<String, LdCollectionCQ> getLibraryId_ExistsSubQuery_CollectionList() { return _libraryId_ExistsSubQuery_CollectionListMap; }
    public String keepLibraryId_ExistsSubQuery_CollectionList(LdCollectionCQ subQuery) {
        if (_libraryId_ExistsSubQuery_CollectionListMap == null) { _libraryId_ExistsSubQuery_CollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_ExistsSubQuery_CollectionListMap.size() + 1);
        _libraryId_ExistsSubQuery_CollectionListMap.put(key, subQuery); return "libraryId_ExistsSubQuery_CollectionList." + key;
    }

    protected Map<String, LdLibraryUserCQ> _libraryId_ExistsSubQuery_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLibraryId_ExistsSubQuery_LibraryUserList() { return _libraryId_ExistsSubQuery_LibraryUserListMap; }
    public String keepLibraryId_ExistsSubQuery_LibraryUserList(LdLibraryUserCQ subQuery) {
        if (_libraryId_ExistsSubQuery_LibraryUserListMap == null) { _libraryId_ExistsSubQuery_LibraryUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_ExistsSubQuery_LibraryUserListMap.size() + 1);
        _libraryId_ExistsSubQuery_LibraryUserListMap.put(key, subQuery); return "libraryId_ExistsSubQuery_LibraryUserList." + key;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_ExistsSubQuery_NextLibraryByNextIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_ExistsSubQuery_NextLibraryByNextIdList() { return _libraryId_ExistsSubQuery_NextLibraryByNextIdListMap; }
    public String keepLibraryId_ExistsSubQuery_NextLibraryByNextIdList(LdNextLibraryCQ subQuery) {
        if (_libraryId_ExistsSubQuery_NextLibraryByNextIdListMap == null) { _libraryId_ExistsSubQuery_NextLibraryByNextIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_ExistsSubQuery_NextLibraryByNextIdListMap.size() + 1);
        _libraryId_ExistsSubQuery_NextLibraryByNextIdListMap.put(key, subQuery); return "libraryId_ExistsSubQuery_NextLibraryByNextIdList." + key;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_ExistsSubQuery_NextLibraryByBaseIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_ExistsSubQuery_NextLibraryByBaseIdList() { return _libraryId_ExistsSubQuery_NextLibraryByBaseIdListMap; }
    public String keepLibraryId_ExistsSubQuery_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery) {
        if (_libraryId_ExistsSubQuery_NextLibraryByBaseIdListMap == null) { _libraryId_ExistsSubQuery_NextLibraryByBaseIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_ExistsSubQuery_NextLibraryByBaseIdListMap.size() + 1);
        _libraryId_ExistsSubQuery_NextLibraryByBaseIdListMap.put(key, subQuery); return "libraryId_ExistsSubQuery_NextLibraryByBaseIdList." + key;
    }

    protected Map<String, LdCollectionCQ> _libraryId_NotExistsSubQuery_CollectionListMap;
    public Map<String, LdCollectionCQ> getLibraryId_NotExistsSubQuery_CollectionList() { return _libraryId_NotExistsSubQuery_CollectionListMap; }
    public String keepLibraryId_NotExistsSubQuery_CollectionList(LdCollectionCQ subQuery) {
        if (_libraryId_NotExistsSubQuery_CollectionListMap == null) { _libraryId_NotExistsSubQuery_CollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_NotExistsSubQuery_CollectionListMap.size() + 1);
        _libraryId_NotExistsSubQuery_CollectionListMap.put(key, subQuery); return "libraryId_NotExistsSubQuery_CollectionList." + key;
    }

    protected Map<String, LdLibraryUserCQ> _libraryId_NotExistsSubQuery_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLibraryId_NotExistsSubQuery_LibraryUserList() { return _libraryId_NotExistsSubQuery_LibraryUserListMap; }
    public String keepLibraryId_NotExistsSubQuery_LibraryUserList(LdLibraryUserCQ subQuery) {
        if (_libraryId_NotExistsSubQuery_LibraryUserListMap == null) { _libraryId_NotExistsSubQuery_LibraryUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_NotExistsSubQuery_LibraryUserListMap.size() + 1);
        _libraryId_NotExistsSubQuery_LibraryUserListMap.put(key, subQuery); return "libraryId_NotExistsSubQuery_LibraryUserList." + key;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_NotExistsSubQuery_NextLibraryByNextIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_NotExistsSubQuery_NextLibraryByNextIdList() { return _libraryId_NotExistsSubQuery_NextLibraryByNextIdListMap; }
    public String keepLibraryId_NotExistsSubQuery_NextLibraryByNextIdList(LdNextLibraryCQ subQuery) {
        if (_libraryId_NotExistsSubQuery_NextLibraryByNextIdListMap == null) { _libraryId_NotExistsSubQuery_NextLibraryByNextIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_NotExistsSubQuery_NextLibraryByNextIdListMap.size() + 1);
        _libraryId_NotExistsSubQuery_NextLibraryByNextIdListMap.put(key, subQuery); return "libraryId_NotExistsSubQuery_NextLibraryByNextIdList." + key;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_NotExistsSubQuery_NextLibraryByBaseIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_NotExistsSubQuery_NextLibraryByBaseIdList() { return _libraryId_NotExistsSubQuery_NextLibraryByBaseIdListMap; }
    public String keepLibraryId_NotExistsSubQuery_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery) {
        if (_libraryId_NotExistsSubQuery_NextLibraryByBaseIdListMap == null) { _libraryId_NotExistsSubQuery_NextLibraryByBaseIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_NotExistsSubQuery_NextLibraryByBaseIdListMap.size() + 1);
        _libraryId_NotExistsSubQuery_NextLibraryByBaseIdListMap.put(key, subQuery); return "libraryId_NotExistsSubQuery_NextLibraryByBaseIdList." + key;
    }

    protected Map<String, LdCollectionCQ> _libraryId_SpecifyDerivedReferrer_CollectionListMap;
    public Map<String, LdCollectionCQ> getLibraryId_SpecifyDerivedReferrer_CollectionList() { return _libraryId_SpecifyDerivedReferrer_CollectionListMap; }
    public String keepLibraryId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ subQuery) {
        if (_libraryId_SpecifyDerivedReferrer_CollectionListMap == null) { _libraryId_SpecifyDerivedReferrer_CollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_SpecifyDerivedReferrer_CollectionListMap.size() + 1);
        _libraryId_SpecifyDerivedReferrer_CollectionListMap.put(key, subQuery); return "libraryId_SpecifyDerivedReferrer_CollectionList." + key;
    }

    protected Map<String, LdLibraryUserCQ> _libraryId_SpecifyDerivedReferrer_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLibraryId_SpecifyDerivedReferrer_LibraryUserList() { return _libraryId_SpecifyDerivedReferrer_LibraryUserListMap; }
    public String keepLibraryId_SpecifyDerivedReferrer_LibraryUserList(LdLibraryUserCQ subQuery) {
        if (_libraryId_SpecifyDerivedReferrer_LibraryUserListMap == null) { _libraryId_SpecifyDerivedReferrer_LibraryUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_SpecifyDerivedReferrer_LibraryUserListMap.size() + 1);
        _libraryId_SpecifyDerivedReferrer_LibraryUserListMap.put(key, subQuery); return "libraryId_SpecifyDerivedReferrer_LibraryUserList." + key;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_SpecifyDerivedReferrer_NextLibraryByNextIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_SpecifyDerivedReferrer_NextLibraryByNextIdList() { return _libraryId_SpecifyDerivedReferrer_NextLibraryByNextIdListMap; }
    public String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByNextIdList(LdNextLibraryCQ subQuery) {
        if (_libraryId_SpecifyDerivedReferrer_NextLibraryByNextIdListMap == null) { _libraryId_SpecifyDerivedReferrer_NextLibraryByNextIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_SpecifyDerivedReferrer_NextLibraryByNextIdListMap.size() + 1);
        _libraryId_SpecifyDerivedReferrer_NextLibraryByNextIdListMap.put(key, subQuery); return "libraryId_SpecifyDerivedReferrer_NextLibraryByNextIdList." + key;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_SpecifyDerivedReferrer_NextLibraryByBaseIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_SpecifyDerivedReferrer_NextLibraryByBaseIdList() { return _libraryId_SpecifyDerivedReferrer_NextLibraryByBaseIdListMap; }
    public String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery) {
        if (_libraryId_SpecifyDerivedReferrer_NextLibraryByBaseIdListMap == null) { _libraryId_SpecifyDerivedReferrer_NextLibraryByBaseIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_SpecifyDerivedReferrer_NextLibraryByBaseIdListMap.size() + 1);
        _libraryId_SpecifyDerivedReferrer_NextLibraryByBaseIdListMap.put(key, subQuery); return "libraryId_SpecifyDerivedReferrer_NextLibraryByBaseIdList." + key;
    }

    protected Map<String, LdCollectionCQ> _libraryId_QueryDerivedReferrer_CollectionListMap;
    public Map<String, LdCollectionCQ> getLibraryId_QueryDerivedReferrer_CollectionList() { return _libraryId_QueryDerivedReferrer_CollectionListMap; }
    public String keepLibraryId_QueryDerivedReferrer_CollectionList(LdCollectionCQ subQuery) {
        if (_libraryId_QueryDerivedReferrer_CollectionListMap == null) { _libraryId_QueryDerivedReferrer_CollectionListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_QueryDerivedReferrer_CollectionListMap.size() + 1);
        _libraryId_QueryDerivedReferrer_CollectionListMap.put(key, subQuery); return "libraryId_QueryDerivedReferrer_CollectionList." + key;
    }
    protected Map<String, Object> _libraryId_QueryDerivedReferrer_CollectionListParameterMap;
    public Map<String, Object> getLibraryId_QueryDerivedReferrer_CollectionListParameter() { return _libraryId_QueryDerivedReferrer_CollectionListParameterMap; }
    public String keepLibraryId_QueryDerivedReferrer_CollectionListParameter(Object parameterValue) {
        if (_libraryId_QueryDerivedReferrer_CollectionListParameterMap == null) { _libraryId_QueryDerivedReferrer_CollectionListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_libraryId_QueryDerivedReferrer_CollectionListParameterMap.size() + 1);
        _libraryId_QueryDerivedReferrer_CollectionListParameterMap.put(key, parameterValue); return "libraryId_QueryDerivedReferrer_CollectionListParameter." + key;
    }

    protected Map<String, LdLibraryUserCQ> _libraryId_QueryDerivedReferrer_LibraryUserListMap;
    public Map<String, LdLibraryUserCQ> getLibraryId_QueryDerivedReferrer_LibraryUserList() { return _libraryId_QueryDerivedReferrer_LibraryUserListMap; }
    public String keepLibraryId_QueryDerivedReferrer_LibraryUserList(LdLibraryUserCQ subQuery) {
        if (_libraryId_QueryDerivedReferrer_LibraryUserListMap == null) { _libraryId_QueryDerivedReferrer_LibraryUserListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_QueryDerivedReferrer_LibraryUserListMap.size() + 1);
        _libraryId_QueryDerivedReferrer_LibraryUserListMap.put(key, subQuery); return "libraryId_QueryDerivedReferrer_LibraryUserList." + key;
    }
    protected Map<String, Object> _libraryId_QueryDerivedReferrer_LibraryUserListParameterMap;
    public Map<String, Object> getLibraryId_QueryDerivedReferrer_LibraryUserListParameter() { return _libraryId_QueryDerivedReferrer_LibraryUserListParameterMap; }
    public String keepLibraryId_QueryDerivedReferrer_LibraryUserListParameter(Object parameterValue) {
        if (_libraryId_QueryDerivedReferrer_LibraryUserListParameterMap == null) { _libraryId_QueryDerivedReferrer_LibraryUserListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_libraryId_QueryDerivedReferrer_LibraryUserListParameterMap.size() + 1);
        _libraryId_QueryDerivedReferrer_LibraryUserListParameterMap.put(key, parameterValue); return "libraryId_QueryDerivedReferrer_LibraryUserListParameter." + key;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_QueryDerivedReferrer_NextLibraryByNextIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_QueryDerivedReferrer_NextLibraryByNextIdList() { return _libraryId_QueryDerivedReferrer_NextLibraryByNextIdListMap; }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextIdList(LdNextLibraryCQ subQuery) {
        if (_libraryId_QueryDerivedReferrer_NextLibraryByNextIdListMap == null) { _libraryId_QueryDerivedReferrer_NextLibraryByNextIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_QueryDerivedReferrer_NextLibraryByNextIdListMap.size() + 1);
        _libraryId_QueryDerivedReferrer_NextLibraryByNextIdListMap.put(key, subQuery); return "libraryId_QueryDerivedReferrer_NextLibraryByNextIdList." + key;
    }
    protected Map<String, Object> _libraryId_QueryDerivedReferrer_NextLibraryByNextIdListParameterMap;
    public Map<String, Object> getLibraryId_QueryDerivedReferrer_NextLibraryByNextIdListParameter() { return _libraryId_QueryDerivedReferrer_NextLibraryByNextIdListParameterMap; }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextIdListParameter(Object parameterValue) {
        if (_libraryId_QueryDerivedReferrer_NextLibraryByNextIdListParameterMap == null) { _libraryId_QueryDerivedReferrer_NextLibraryByNextIdListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_libraryId_QueryDerivedReferrer_NextLibraryByNextIdListParameterMap.size() + 1);
        _libraryId_QueryDerivedReferrer_NextLibraryByNextIdListParameterMap.put(key, parameterValue); return "libraryId_QueryDerivedReferrer_NextLibraryByNextIdListParameter." + key;
    }

    protected Map<String, LdNextLibraryCQ> _libraryId_QueryDerivedReferrer_NextLibraryByBaseIdListMap;
    public Map<String, LdNextLibraryCQ> getLibraryId_QueryDerivedReferrer_NextLibraryByBaseIdList() { return _libraryId_QueryDerivedReferrer_NextLibraryByBaseIdListMap; }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery) {
        if (_libraryId_QueryDerivedReferrer_NextLibraryByBaseIdListMap == null) { _libraryId_QueryDerivedReferrer_NextLibraryByBaseIdListMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_QueryDerivedReferrer_NextLibraryByBaseIdListMap.size() + 1);
        _libraryId_QueryDerivedReferrer_NextLibraryByBaseIdListMap.put(key, subQuery); return "libraryId_QueryDerivedReferrer_NextLibraryByBaseIdList." + key;
    }
    protected Map<String, Object> _libraryId_QueryDerivedReferrer_NextLibraryByBaseIdListParameterMap;
    public Map<String, Object> getLibraryId_QueryDerivedReferrer_NextLibraryByBaseIdListParameter() { return _libraryId_QueryDerivedReferrer_NextLibraryByBaseIdListParameterMap; }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByBaseIdListParameter(Object parameterValue) {
        if (_libraryId_QueryDerivedReferrer_NextLibraryByBaseIdListParameterMap == null) { _libraryId_QueryDerivedReferrer_NextLibraryByBaseIdListParameterMap = newLinkedHashMap(); }
        String key = "subQueryParameterKey" + (_libraryId_QueryDerivedReferrer_NextLibraryByBaseIdListParameterMap.size() + 1);
        _libraryId_QueryDerivedReferrer_NextLibraryByBaseIdListParameterMap.put(key, parameterValue); return "libraryId_QueryDerivedReferrer_NextLibraryByBaseIdListParameter." + key;
    }

    public LdBsLibraryCQ addOrderBy_LibraryId_Asc() { regOBA("LIBRARY_ID"); return this; }
    public LdBsLibraryCQ addOrderBy_LibraryId_Desc() { regOBD("LIBRARY_ID"); return this; }

    protected LdConditionValue _libraryName;
    public LdConditionValue getLibraryName() {
        if (_libraryName == null) { _libraryName = new LdConditionValue(); }
        return _libraryName;
    }
    protected LdConditionValue getCValueLibraryName() { return getLibraryName(); }

    public LdBsLibraryCQ addOrderBy_LibraryName_Asc() { regOBA("LIBRARY_NAME"); return this; }
    public LdBsLibraryCQ addOrderBy_LibraryName_Desc() { regOBD("LIBRARY_NAME"); return this; }

    protected LdConditionValue _libraryTypeCode;
    public LdConditionValue getLibraryTypeCode() {
        if (_libraryTypeCode == null) { _libraryTypeCode = new LdConditionValue(); }
        return _libraryTypeCode;
    }
    protected LdConditionValue getCValueLibraryTypeCode() { return getLibraryTypeCode(); }

    protected Map<String, LdLibraryTypeLookupCQ> _libraryTypeCode_InScopeSubQuery_LibraryTypeLookupMap;
    public Map<String, LdLibraryTypeLookupCQ> getLibraryTypeCode_InScopeSubQuery_LibraryTypeLookup() { return _libraryTypeCode_InScopeSubQuery_LibraryTypeLookupMap; }
    public String keepLibraryTypeCode_InScopeSubQuery_LibraryTypeLookup(LdLibraryTypeLookupCQ subQuery) {
        if (_libraryTypeCode_InScopeSubQuery_LibraryTypeLookupMap == null) { _libraryTypeCode_InScopeSubQuery_LibraryTypeLookupMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryTypeCode_InScopeSubQuery_LibraryTypeLookupMap.size() + 1);
        _libraryTypeCode_InScopeSubQuery_LibraryTypeLookupMap.put(key, subQuery); return "libraryTypeCode_InScopeSubQuery_LibraryTypeLookup." + key;
    }

    public LdBsLibraryCQ addOrderBy_LibraryTypeCode_Asc() { regOBA("LIBRARY_TYPE_CODE"); return this; }
    public LdBsLibraryCQ addOrderBy_LibraryTypeCode_Desc() { regOBD("LIBRARY_TYPE_CODE"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsLibraryCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsLibraryCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsLibraryCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsLibraryCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsLibraryCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsLibraryCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsLibraryCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsLibraryCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsLibraryCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsLibraryCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsLibraryCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsLibraryCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsLibraryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsLibraryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
        LdLibraryCQ baseQuery = (LdLibraryCQ)baseQueryAsSuper;
        LdLibraryCQ unionQuery = (LdLibraryCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryLibraryTypeLookup()) {
            unionQuery.queryLibraryTypeLookup().reflectRelationOnUnionQuery(baseQuery.queryLibraryTypeLookup(), unionQuery.queryLibraryTypeLookup());
        }
        if (baseQuery.hasConditionQueryNextLibraryAsNext()) {
            unionQuery.xsetParameterMapNextLibraryAsNext(baseQuery.getParameterMapNextLibraryAsNext());
            unionQuery.getConditionQueryNextLibraryAsNext().reflectRelationOnUnionQuery(baseQuery.getConditionQueryNextLibraryAsNext(), unionQuery.getConditionQueryNextLibraryAsNext());
        }
        if (baseQuery.hasConditionQueryLibraryUserAsUser()) {
            unionQuery.xsetParameterMapLibraryUserAsUser(baseQuery.getParameterMapLibraryUserAsUser());
            unionQuery.getConditionQueryLibraryUserAsUser().reflectRelationOnUnionQuery(baseQuery.getConditionQueryLibraryUserAsUser(), unionQuery.getConditionQueryLibraryUserAsUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    public LdLibraryTypeLookupCQ queryLibraryTypeLookup() {
        return getConditionQueryLibraryTypeLookup();
    }
    protected LdLibraryTypeLookupCQ _conditionQueryLibraryTypeLookup;
    public LdLibraryTypeLookupCQ getConditionQueryLibraryTypeLookup() {
        if (_conditionQueryLibraryTypeLookup == null) {
            _conditionQueryLibraryTypeLookup = xcreateQueryLibraryTypeLookup();
            xsetupOuterJoinLibraryTypeLookup();
        }
        return _conditionQueryLibraryTypeLookup;
    }
    protected LdLibraryTypeLookupCQ xcreateQueryLibraryTypeLookup() {
        String nrp = resolveNextRelationPath("LIBRARY", "libraryTypeLookup");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdLibraryTypeLookupCQ cq = new LdLibraryTypeLookupCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("libraryTypeLookup"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLibraryTypeLookup() {
        LdLibraryTypeLookupCQ cq = getConditionQueryLibraryTypeLookup();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("LIBRARY_TYPE_CODE"), cq.getRealColumnName("LIBRARY_TYPE_CODE"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryLibraryTypeLookup() {
        return _conditionQueryLibraryTypeLookup != null;
    }

    public LdNextLibraryCQ queryNextLibraryAsNext(Integer nextLibraryId) {
        Map<String, Object> parameterMap = getParameterMapNextLibraryAsNext();
        parameterMap.put("nextLibraryId", nextLibraryId);
        return getConditionQueryNextLibraryAsNext();
    }
    protected LdNextLibraryCQ _conditionQueryNextLibraryAsNext;
    public LdNextLibraryCQ getConditionQueryNextLibraryAsNext() {
        if (_conditionQueryNextLibraryAsNext == null) {
            _conditionQueryNextLibraryAsNext = xcreateQueryNextLibraryAsNext();
            xsetupOuterJoinNextLibraryAsNext();
        }
        return _conditionQueryNextLibraryAsNext;
    }
    protected Map<String, Object> _parameterMapNextLibraryAsNext;
    public Map<String, Object> getParameterMapNextLibraryAsNext() {
        if (_parameterMapNextLibraryAsNext == null) {
            _parameterMapNextLibraryAsNext = newLinkedHashMap();
        }
        return _parameterMapNextLibraryAsNext;
    }
    public void xsetParameterMapNextLibraryAsNext(Map<String, Object> parameterMap) {
        _parameterMapNextLibraryAsNext = parameterMap; // for UnionQuery
    }
    protected LdNextLibraryCQ xcreateQueryNextLibraryAsNext() {
        String nrp = resolveNextRelationPath("LIBRARY", "nextLibraryAsNext");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdNextLibraryCQ cq = new LdNextLibraryCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("nextLibraryAsNext"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinNextLibraryAsNext() {
        LdNextLibraryCQ cq = getConditionQueryNextLibraryAsNext();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("LIBRARY_ID"), cq.getRealColumnName("LIBRARY_ID"));
        joinOnMap.put("$$fixedCondition$$", ppFxCd("$$foreignAlias$$.NEXT_LIBRARY_ID = /*$$locationBase$$.parameterMapNextLibraryAsNext.nextLibraryId*/null", getRealAliasName(), cq.getRealAliasName()));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryNextLibraryAsNext() {
        return _conditionQueryNextLibraryAsNext != null;
    }

    public LdLibraryUserCQ queryLibraryUserAsUser(Integer userId, String secondString, java.util.List<Integer> thirdList) {
        Map<String, Object> parameterMap = getParameterMapLibraryUserAsUser();
        parameterMap.put("userId", userId);parameterMap.put("secondString", secondString);parameterMap.put("thirdList", thirdList);
        return getConditionQueryLibraryUserAsUser();
    }
    protected LdLibraryUserCQ _conditionQueryLibraryUserAsUser;
    public LdLibraryUserCQ getConditionQueryLibraryUserAsUser() {
        if (_conditionQueryLibraryUserAsUser == null) {
            _conditionQueryLibraryUserAsUser = xcreateQueryLibraryUserAsUser();
            xsetupOuterJoinLibraryUserAsUser();
        }
        return _conditionQueryLibraryUserAsUser;
    }
    protected Map<String, Object> _parameterMapLibraryUserAsUser;
    public Map<String, Object> getParameterMapLibraryUserAsUser() {
        if (_parameterMapLibraryUserAsUser == null) {
            _parameterMapLibraryUserAsUser = newLinkedHashMap();
        }
        return _parameterMapLibraryUserAsUser;
    }
    public void xsetParameterMapLibraryUserAsUser(Map<String, Object> parameterMap) {
        _parameterMapLibraryUserAsUser = parameterMap; // for UnionQuery
    }
    protected LdLibraryUserCQ xcreateQueryLibraryUserAsUser() {
        String nrp = resolveNextRelationPath("LIBRARY", "libraryUserAsUser");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdLibraryUserCQ cq = new LdLibraryUserCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("libraryUserAsUser"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLibraryUserAsUser() {
        LdLibraryUserCQ cq = getConditionQueryLibraryUserAsUser();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("LIBRARY_ID"), cq.getRealColumnName("LIBRARY_ID"));
        joinOnMap.put("$$fixedCondition$$", ppFxCd("$$foreignAlias$$.LB_USER_ID = /*$$locationBase$$.parameterMapLibraryUserAsUser.userId*/null and 'str' = /*$$locationBase$$.parameterMapLibraryUserAsUser.secondString*/'dummy' and 2 in /*$$locationBase$$.parameterMapLibraryUserAsUser.thirdList*/(3, 4)", getRealAliasName(), cq.getRealAliasName()));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryLibraryUserAsUser() {
        return _conditionQueryLibraryUserAsUser != null;
    }

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    protected Map<String, LdLibraryCQ> _scalarSubQueryMap;
    public Map<String, LdLibraryCQ> getScalarSubQuery() { return _scalarSubQueryMap; }
    public String keepScalarSubQuery(LdLibraryCQ subQuery) {
        if (_scalarSubQueryMap == null) { _scalarSubQueryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_scalarSubQueryMap.size() + 1);
        _scalarSubQueryMap.put(key, subQuery); return "scalarSubQuery." + key;
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdLibraryCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLibraryCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

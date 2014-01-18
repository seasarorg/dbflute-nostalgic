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
 * The base condition-query of LIBRARY_USER.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLibraryUserCQ extends LdAbstractBsLibraryUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLibraryUserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLibraryUserCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from LIBRARY_USER) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdLibraryUserCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdLibraryUserCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join LIBRARY_USER on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdLibraryUserCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdLibraryUserCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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

    protected Map<String, LdLibraryCQ> _libraryId_InScopeSubQuery_LibraryMap;
    public Map<String, LdLibraryCQ> getLibraryId_InScopeSubQuery_Library() { return _libraryId_InScopeSubQuery_LibraryMap; }
    public String keepLibraryId_InScopeSubQuery_Library(LdLibraryCQ subQuery) {
        if (_libraryId_InScopeSubQuery_LibraryMap == null) { _libraryId_InScopeSubQuery_LibraryMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_InScopeSubQuery_LibraryMap.size() + 1);
        _libraryId_InScopeSubQuery_LibraryMap.put(key, subQuery); return "libraryId_InScopeSubQuery_Library." + key;
    }
      
    protected Map<String, LdLibraryCQ> _libraryId_InScopeSubQuery_LibraryAsOneMap;
    public Map<String, LdLibraryCQ> getLibraryId_InScopeSubQuery_LibraryAsOne() { return _libraryId_InScopeSubQuery_LibraryAsOneMap; }
    public String keepLibraryId_InScopeSubQuery_LibraryAsOne(LdLibraryCQ subQuery) {
        if (_libraryId_InScopeSubQuery_LibraryAsOneMap == null) { _libraryId_InScopeSubQuery_LibraryAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_InScopeSubQuery_LibraryAsOneMap.size() + 1);
        _libraryId_InScopeSubQuery_LibraryAsOneMap.put(key, subQuery); return "libraryId_InScopeSubQuery_LibraryAsOne." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryId_NotInScopeSubQuery_LibraryAsOneMap;
    public Map<String, LdLibraryCQ> getLibraryId_NotInScopeSubQuery_LibraryAsOne() { return _libraryId_NotInScopeSubQuery_LibraryAsOneMap; }
    public String keepLibraryId_NotInScopeSubQuery_LibraryAsOne(LdLibraryCQ subQuery) {
        if (_libraryId_NotInScopeSubQuery_LibraryAsOneMap == null) { _libraryId_NotInScopeSubQuery_LibraryAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_NotInScopeSubQuery_LibraryAsOneMap.size() + 1);
        _libraryId_NotInScopeSubQuery_LibraryAsOneMap.put(key, subQuery); return "libraryId_NotInScopeSubQuery_LibraryAsOne." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryId_ExistsSubQuery_LibraryAsOneMap;
    public Map<String, LdLibraryCQ> getLibraryId_ExistsSubQuery_LibraryAsOne() { return _libraryId_ExistsSubQuery_LibraryAsOneMap; }
    public String keepLibraryId_ExistsSubQuery_LibraryAsOne(LdLibraryCQ subQuery) {
        if (_libraryId_ExistsSubQuery_LibraryAsOneMap == null) { _libraryId_ExistsSubQuery_LibraryAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_ExistsSubQuery_LibraryAsOneMap.size() + 1);
        _libraryId_ExistsSubQuery_LibraryAsOneMap.put(key, subQuery); return "libraryId_ExistsSubQuery_LibraryAsOne." + key;
    }

    protected Map<String, LdLibraryCQ> _libraryId_NotExistsSubQuery_LibraryAsOneMap;
    public Map<String, LdLibraryCQ> getLibraryId_NotExistsSubQuery_LibraryAsOne() { return _libraryId_NotExistsSubQuery_LibraryAsOneMap; }
    public String keepLibraryId_NotExistsSubQuery_LibraryAsOne(LdLibraryCQ subQuery) {
        if (_libraryId_NotExistsSubQuery_LibraryAsOneMap == null) { _libraryId_NotExistsSubQuery_LibraryAsOneMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_libraryId_NotExistsSubQuery_LibraryAsOneMap.size() + 1);
        _libraryId_NotExistsSubQuery_LibraryAsOneMap.put(key, subQuery); return "libraryId_NotExistsSubQuery_LibraryAsOne." + key;
    }

    public LdBsLibraryUserCQ addOrderBy_LibraryId_Asc() { regOBA("LIBRARY_ID"); return this; }
    public LdBsLibraryUserCQ addOrderBy_LibraryId_Desc() { regOBD("LIBRARY_ID"); return this; }

    protected LdConditionValue _lbUserId;
    public LdConditionValue getLbUserId() {
        if (_lbUserId == null) { _lbUserId = new LdConditionValue(); }
        return _lbUserId;
    }
    protected LdConditionValue getCValueLbUserId() { return getLbUserId(); }

    protected Map<String, LdLbUserCQ> _lbUserId_InScopeSubQuery_LbUserMap;
    public Map<String, LdLbUserCQ> getLbUserId_InScopeSubQuery_LbUser() { return _lbUserId_InScopeSubQuery_LbUserMap; }
    public String keepLbUserId_InScopeSubQuery_LbUser(LdLbUserCQ subQuery) {
        if (_lbUserId_InScopeSubQuery_LbUserMap == null) { _lbUserId_InScopeSubQuery_LbUserMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_lbUserId_InScopeSubQuery_LbUserMap.size() + 1);
        _lbUserId_InScopeSubQuery_LbUserMap.put(key, subQuery); return "lbUserId_InScopeSubQuery_LbUser." + key;
    }
      
    public LdBsLibraryUserCQ addOrderBy_LbUserId_Asc() { regOBA("LB_USER_ID"); return this; }
    public LdBsLibraryUserCQ addOrderBy_LbUserId_Desc() { regOBD("LB_USER_ID"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsLibraryUserCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsLibraryUserCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsLibraryUserCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsLibraryUserCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsLibraryUserCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsLibraryUserCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsLibraryUserCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsLibraryUserCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsLibraryUserCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsLibraryUserCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsLibraryUserCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsLibraryUserCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsLibraryUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsLibraryUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
        LdLibraryUserCQ baseQuery = (LdLibraryUserCQ)baseQueryAsSuper;
        LdLibraryUserCQ unionQuery = (LdLibraryUserCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryLbUser()) {
            unionQuery.queryLbUser().reflectRelationOnUnionQuery(baseQuery.queryLbUser(), unionQuery.queryLbUser());
        }
        if (baseQuery.hasConditionQueryLibrary()) {
            unionQuery.queryLibrary().reflectRelationOnUnionQuery(baseQuery.queryLibrary(), unionQuery.queryLibrary());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    public LdLbUserCQ queryLbUser() {
        return getConditionQueryLbUser();
    }
    protected LdLbUserCQ _conditionQueryLbUser;
    public LdLbUserCQ getConditionQueryLbUser() {
        if (_conditionQueryLbUser == null) {
            _conditionQueryLbUser = xcreateQueryLbUser();
            xsetupOuterJoinLbUser();
        }
        return _conditionQueryLbUser;
    }
    protected LdLbUserCQ xcreateQueryLbUser() {
        String nrp = resolveNextRelationPath("LIBRARY_USER", "lbUser");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdLbUserCQ cq = new LdLbUserCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("lbUser"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLbUser() {
        LdLbUserCQ cq = getConditionQueryLbUser();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("LB_USER_ID"), cq.getRealColumnName("LB_USER_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryLbUser() {
        return _conditionQueryLbUser != null;
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
        String nrp = resolveNextRelationPath("LIBRARY_USER", "library");
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


    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdLibraryUserCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLibraryUserCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

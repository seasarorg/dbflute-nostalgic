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
 * The base condition-query of LENDING_COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLendingCollectionCQ extends LdAbstractBsLendingCollectionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLendingCollectionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLendingCollectionCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from LENDING_COLLECTION) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdLendingCollectionCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdLendingCollectionCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join LENDING_COLLECTION on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdLendingCollectionCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdLendingCollectionCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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

    public LdBsLendingCollectionCQ addOrderBy_LibraryId_Asc() { regOBA("LIBRARY_ID"); return this; }
    public LdBsLendingCollectionCQ addOrderBy_LibraryId_Desc() { regOBD("LIBRARY_ID"); return this; }

    protected LdConditionValue _lbUserId;
    public LdConditionValue getLbUserId() {
        if (_lbUserId == null) { _lbUserId = new LdConditionValue(); }
        return _lbUserId;
    }
    protected LdConditionValue getCValueLbUserId() { return getLbUserId(); }

    public LdBsLendingCollectionCQ addOrderBy_LbUserId_Asc() { regOBA("LB_USER_ID"); return this; }
    public LdBsLendingCollectionCQ addOrderBy_LbUserId_Desc() { regOBD("LB_USER_ID"); return this; }

    protected LdConditionValue _lendingDate;
    public LdConditionValue getLendingDate() {
        if (_lendingDate == null) { _lendingDate = new LdConditionValue(); }
        return _lendingDate;
    }
    protected LdConditionValue getCValueLendingDate() { return getLendingDate(); }

    public LdBsLendingCollectionCQ addOrderBy_LendingDate_Asc() { regOBA("LENDING_DATE"); return this; }
    public LdBsLendingCollectionCQ addOrderBy_LendingDate_Desc() { regOBD("LENDING_DATE"); return this; }

    protected LdConditionValue _collectionId;
    public LdConditionValue getCollectionId() {
        if (_collectionId == null) { _collectionId = new LdConditionValue(); }
        return _collectionId;
    }
    protected LdConditionValue getCValueCollectionId() { return getCollectionId(); }

    protected Map<String, LdCollectionCQ> _collectionId_InScopeSubQuery_CollectionMap;
    public Map<String, LdCollectionCQ> getCollectionId_InScopeSubQuery_Collection() { return _collectionId_InScopeSubQuery_CollectionMap; }
    public String keepCollectionId_InScopeSubQuery_Collection(LdCollectionCQ subQuery) {
        if (_collectionId_InScopeSubQuery_CollectionMap == null) { _collectionId_InScopeSubQuery_CollectionMap = newLinkedHashMap(); }
        String key = "subQueryMapKey" + (_collectionId_InScopeSubQuery_CollectionMap.size() + 1);
        _collectionId_InScopeSubQuery_CollectionMap.put(key, subQuery); return "collectionId_InScopeSubQuery_Collection." + key;
    }
      
    public LdBsLendingCollectionCQ addOrderBy_CollectionId_Asc() { regOBA("COLLECTION_ID"); return this; }
    public LdBsLendingCollectionCQ addOrderBy_CollectionId_Desc() { regOBD("COLLECTION_ID"); return this; }

    protected LdConditionValue _returnLimitDate;
    public LdConditionValue getReturnLimitDate() {
        if (_returnLimitDate == null) { _returnLimitDate = new LdConditionValue(); }
        return _returnLimitDate;
    }
    protected LdConditionValue getCValueReturnLimitDate() { return getReturnLimitDate(); }

    public LdBsLendingCollectionCQ addOrderBy_ReturnLimitDate_Asc() { regOBA("RETURN_LIMIT_DATE"); return this; }
    public LdBsLendingCollectionCQ addOrderBy_ReturnLimitDate_Desc() { regOBD("RETURN_LIMIT_DATE"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsLendingCollectionCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsLendingCollectionCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsLendingCollectionCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsLendingCollectionCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsLendingCollectionCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsLendingCollectionCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsLendingCollectionCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsLendingCollectionCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsLendingCollectionCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsLendingCollectionCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsLendingCollectionCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsLendingCollectionCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsLendingCollectionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsLendingCollectionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
        LdLendingCollectionCQ baseQuery = (LdLendingCollectionCQ)baseQueryAsSuper;
        LdLendingCollectionCQ unionQuery = (LdLendingCollectionCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryCollection()) {
            unionQuery.queryCollection().reflectRelationOnUnionQuery(baseQuery.queryCollection(), unionQuery.queryCollection());
        }
        if (baseQuery.hasConditionQueryLending()) {
            unionQuery.queryLending().reflectRelationOnUnionQuery(baseQuery.queryLending(), unionQuery.queryLending());
        }
        if (baseQuery.hasConditionQueryLibraryUser()) {
            unionQuery.queryLibraryUser().reflectRelationOnUnionQuery(baseQuery.queryLibraryUser(), unionQuery.queryLibraryUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    public LdCollectionCQ queryCollection() {
        return getConditionQueryCollection();
    }
    protected LdCollectionCQ _conditionQueryCollection;
    public LdCollectionCQ getConditionQueryCollection() {
        if (_conditionQueryCollection == null) {
            _conditionQueryCollection = xcreateQueryCollection();
            xsetupOuterJoinCollection();
        }
        return _conditionQueryCollection;
    }
    protected LdCollectionCQ xcreateQueryCollection() {
        String nrp = resolveNextRelationPath("LENDING_COLLECTION", "collection");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdCollectionCQ cq = new LdCollectionCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("collection"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinCollection() {
        LdCollectionCQ cq = getConditionQueryCollection();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("COLLECTION_ID"), cq.getRealColumnName("COLLECTION_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryCollection() {
        return _conditionQueryCollection != null;
    }

    public LdLendingCQ queryLending() {
        return getConditionQueryLending();
    }
    protected LdLendingCQ _conditionQueryLending;
    public LdLendingCQ getConditionQueryLending() {
        if (_conditionQueryLending == null) {
            _conditionQueryLending = xcreateQueryLending();
            xsetupOuterJoinLending();
        }
        return _conditionQueryLending;
    }
    protected LdLendingCQ xcreateQueryLending() {
        String nrp = resolveNextRelationPath("LENDING_COLLECTION", "lending");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdLendingCQ cq = new LdLendingCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("lending"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLending() {
        LdLendingCQ cq = getConditionQueryLending();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("LIBRARY_ID"), cq.getRealColumnName("LIBRARY_ID"));
        joinOnMap.put(getRealColumnName("LB_USER_ID"), cq.getRealColumnName("LB_USER_ID"));
        joinOnMap.put(getRealColumnName("LENDING_DATE"), cq.getRealColumnName("LENDING_DATE"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryLending() {
        return _conditionQueryLending != null;
    }

    public LdLibraryUserCQ queryLibraryUser() {
        return getConditionQueryLibraryUser();
    }
    protected LdLibraryUserCQ _conditionQueryLibraryUser;
    public LdLibraryUserCQ getConditionQueryLibraryUser() {
        if (_conditionQueryLibraryUser == null) {
            _conditionQueryLibraryUser = xcreateQueryLibraryUser();
            xsetupOuterJoinLibraryUser();
        }
        return _conditionQueryLibraryUser;
    }
    protected LdLibraryUserCQ xcreateQueryLibraryUser() {
        String nrp = resolveNextRelationPath("LENDING_COLLECTION", "libraryUser");
        String jan = resolveJoinAliasName(nrp, getNextNestLevel());
        LdLibraryUserCQ cq = new LdLibraryUserCQ(this, getSqlClause(), jan, getNextNestLevel());
        cq.xsetForeignPropertyName("libraryUser"); cq.xsetRelationPath(nrp); return cq;
    }
    protected void xsetupOuterJoinLibraryUser() {
        LdLibraryUserCQ cq = getConditionQueryLibraryUser();
        Map<String, String> joinOnMap = newLinkedHashMap();
        joinOnMap.put(getRealColumnName("LIBRARY_ID"), cq.getRealColumnName("LIBRARY_ID"));
        joinOnMap.put(getRealColumnName("LB_USER_ID"), cq.getRealColumnName("LB_USER_ID"));
        registerOuterJoin(cq, joinOnMap);
    }
    public boolean hasConditionQueryLibraryUser() {
        return _conditionQueryLibraryUser != null;
    }


    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdLendingCollectionCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLendingCollectionCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

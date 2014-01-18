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
 * The base condition-query of LENDING.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLendingCQ extends LdAbstractBsLendingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdLendingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsLendingCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from LENDING) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdLendingCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdLendingCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join LENDING on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdLendingCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdLendingCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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

    public LdBsLendingCQ addOrderBy_LibraryId_Asc() { regOBA("LIBRARY_ID"); return this; }
    public LdBsLendingCQ addOrderBy_LibraryId_Desc() { regOBD("LIBRARY_ID"); return this; }

    protected LdConditionValue _lbUserId;
    public LdConditionValue getLbUserId() {
        if (_lbUserId == null) { _lbUserId = new LdConditionValue(); }
        return _lbUserId;
    }
    protected LdConditionValue getCValueLbUserId() { return getLbUserId(); }

    public LdBsLendingCQ addOrderBy_LbUserId_Asc() { regOBA("LB_USER_ID"); return this; }
    public LdBsLendingCQ addOrderBy_LbUserId_Desc() { regOBD("LB_USER_ID"); return this; }

    protected LdConditionValue _lendingDate;
    public LdConditionValue getLendingDate() {
        if (_lendingDate == null) { _lendingDate = new LdConditionValue(); }
        return _lendingDate;
    }
    protected LdConditionValue getCValueLendingDate() { return getLendingDate(); }

    public LdBsLendingCQ addOrderBy_LendingDate_Asc() { regOBA("LENDING_DATE"); return this; }
    public LdBsLendingCQ addOrderBy_LendingDate_Desc() { regOBD("LENDING_DATE"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsLendingCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsLendingCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsLendingCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsLendingCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsLendingCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsLendingCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsLendingCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsLendingCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsLendingCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsLendingCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsLendingCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsLendingCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsLendingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsLendingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
        LdLendingCQ baseQuery = (LdLendingCQ)baseQueryAsSuper;
        LdLendingCQ unionQuery = (LdLendingCQ)unionQueryAsSuper;
        if (baseQuery.hasConditionQueryLibraryUser()) {
            unionQuery.queryLibraryUser().reflectRelationOnUnionQuery(baseQuery.queryLibraryUser(), unionQuery.queryLibraryUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
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
        String nrp = resolveNextRelationPath("LENDING", "libraryUser");
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
    protected String getConditionBeanClassNameInternally() { return LdLendingCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLendingCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

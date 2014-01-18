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
 * The base condition-query of GARBAGE_PLUS.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsGarbagePlusCQ extends LdAbstractBsGarbagePlusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdGarbagePlusCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsGarbagePlusCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from GARBAGE_PLUS) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public LdGarbagePlusCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new LdGarbagePlusCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join GARBAGE_PLUS on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public LdGarbagePlusCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        LdGarbagePlusCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected LdConditionValue _garbageMemo;
    public LdConditionValue getGarbageMemo() {
        if (_garbageMemo == null) { _garbageMemo = new LdConditionValue(); }
        return _garbageMemo;
    }
    protected LdConditionValue getCValueGarbageMemo() { return getGarbageMemo(); }

    public LdBsGarbagePlusCQ addOrderBy_GarbageMemo_Asc() { regOBA("GARBAGE_MEMO"); return this; }
    public LdBsGarbagePlusCQ addOrderBy_GarbageMemo_Desc() { regOBD("GARBAGE_MEMO"); return this; }

    protected LdConditionValue _garbageTime;
    public LdConditionValue getGarbageTime() {
        if (_garbageTime == null) { _garbageTime = new LdConditionValue(); }
        return _garbageTime;
    }
    protected LdConditionValue getCValueGarbageTime() { return getGarbageTime(); }

    public LdBsGarbagePlusCQ addOrderBy_GarbageTime_Asc() { regOBA("GARBAGE_TIME"); return this; }
    public LdBsGarbagePlusCQ addOrderBy_GarbageTime_Desc() { regOBD("GARBAGE_TIME"); return this; }

    protected LdConditionValue _garbageCount;
    public LdConditionValue getGarbageCount() {
        if (_garbageCount == null) { _garbageCount = new LdConditionValue(); }
        return _garbageCount;
    }
    protected LdConditionValue getCValueGarbageCount() { return getGarbageCount(); }

    public LdBsGarbagePlusCQ addOrderBy_GarbageCount_Asc() { regOBA("GARBAGE_COUNT"); return this; }
    public LdBsGarbagePlusCQ addOrderBy_GarbageCount_Desc() { regOBD("GARBAGE_COUNT"); return this; }

    protected LdConditionValue _rUser;
    public LdConditionValue getRUser() {
        if (_rUser == null) { _rUser = new LdConditionValue(); }
        return _rUser;
    }
    protected LdConditionValue getCValueRUser() { return getRUser(); }

    public LdBsGarbagePlusCQ addOrderBy_RUser_Asc() { regOBA("R_USER"); return this; }
    public LdBsGarbagePlusCQ addOrderBy_RUser_Desc() { regOBD("R_USER"); return this; }

    protected LdConditionValue _rModule;
    public LdConditionValue getRModule() {
        if (_rModule == null) { _rModule = new LdConditionValue(); }
        return _rModule;
    }
    protected LdConditionValue getCValueRModule() { return getRModule(); }

    public LdBsGarbagePlusCQ addOrderBy_RModule_Asc() { regOBA("R_MODULE"); return this; }
    public LdBsGarbagePlusCQ addOrderBy_RModule_Desc() { regOBD("R_MODULE"); return this; }

    protected LdConditionValue _rTimestamp;
    public LdConditionValue getRTimestamp() {
        if (_rTimestamp == null) { _rTimestamp = new LdConditionValue(); }
        return _rTimestamp;
    }
    protected LdConditionValue getCValueRTimestamp() { return getRTimestamp(); }

    public LdBsGarbagePlusCQ addOrderBy_RTimestamp_Asc() { regOBA("R_TIMESTAMP"); return this; }
    public LdBsGarbagePlusCQ addOrderBy_RTimestamp_Desc() { regOBD("R_TIMESTAMP"); return this; }

    protected LdConditionValue _uUser;
    public LdConditionValue getUUser() {
        if (_uUser == null) { _uUser = new LdConditionValue(); }
        return _uUser;
    }
    protected LdConditionValue getCValueUUser() { return getUUser(); }

    public LdBsGarbagePlusCQ addOrderBy_UUser_Asc() { regOBA("U_USER"); return this; }
    public LdBsGarbagePlusCQ addOrderBy_UUser_Desc() { regOBD("U_USER"); return this; }

    protected LdConditionValue _uModule;
    public LdConditionValue getUModule() {
        if (_uModule == null) { _uModule = new LdConditionValue(); }
        return _uModule;
    }
    protected LdConditionValue getCValueUModule() { return getUModule(); }

    public LdBsGarbagePlusCQ addOrderBy_UModule_Asc() { regOBA("U_MODULE"); return this; }
    public LdBsGarbagePlusCQ addOrderBy_UModule_Desc() { regOBD("U_MODULE"); return this; }

    protected LdConditionValue _uTimestamp;
    public LdConditionValue getUTimestamp() {
        if (_uTimestamp == null) { _uTimestamp = new LdConditionValue(); }
        return _uTimestamp;
    }
    protected LdConditionValue getCValueUTimestamp() { return getUTimestamp(); }

    public LdBsGarbagePlusCQ addOrderBy_UTimestamp_Asc() { regOBA("U_TIMESTAMP"); return this; }
    public LdBsGarbagePlusCQ addOrderBy_UTimestamp_Desc() { regOBD("U_TIMESTAMP"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public LdBsGarbagePlusCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public LdBsGarbagePlusCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdGarbagePlusCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdGarbagePlusCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}

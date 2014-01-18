/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.cq.bs;

import java.util.Collection;

import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaProvider;
import dbflute.ldb.allcommon.cbean.*;
import dbflute.ldb.allcommon.cbean.ckey.*;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.cbean.*;
import dbflute.ldb.cbean.cq.*;

/**
 * The abstract condition-query of NEXT_LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsNextLibraryCQ extends LdAbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsNextLibraryCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "NEXT_LIBRARY";
    }
    
    public String getTableSqlName() {
        return "NEXT_LIBRARY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {PK : NotNull : SMALLINT : FK to LIBRARY}
     * @param libraryId The value of libraryId as equal.
     */
    public void setLibraryId_Equal(Integer libraryId) {
        regLibraryId(CK_EQ, libraryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param libraryId The value of libraryId as greaterThan.
     */
    public void setLibraryId_GreaterThan(Integer libraryId) {
        regLibraryId(CK_GT, libraryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param libraryId The value of libraryId as lessThan.
     */
    public void setLibraryId_LessThan(Integer libraryId) {
        regLibraryId(CK_LT, libraryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param libraryId The value of libraryId as greaterEqual.
     */
    public void setLibraryId_GreaterEqual(Integer libraryId) {
        regLibraryId(CK_GE, libraryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param libraryId The value of libraryId as lessEqual.
     */
    public void setLibraryId_LessEqual(Integer libraryId) {
        regLibraryId(CK_LE, libraryId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param libraryIdList The collection of libraryId as inScope.
     */
    public void setLibraryId_InScope(Collection<Integer> libraryIdList) {
        regLibraryId(CK_INS, cTL(libraryIdList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param libraryIdList The collection of libraryId as notInScope.
     */
    public void setLibraryId_NotInScope(Collection<Integer> libraryIdList) {
        regLibraryId(CK_NINS, cTL(libraryIdList));
    }

    public void inScopeLibraryByBaseId(LdSubQuery<LdLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_InScopeSubQuery_LibraryByBaseId(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_InScopeSubQuery_LibraryByBaseId(LdLibraryCQ subQuery);

    public void inScopeLibraryAsOne(LdSubQuery<LdLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_InScopeSubQuery_LibraryAsOne(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_InScopeSubQuery_LibraryAsOne(LdLibraryCQ subQuery);

    public void notInScopeLibraryAsOne(LdSubQuery<LdLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotInScopeSubQuery_LibraryAsOne(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_NotInScopeSubQuery_LibraryAsOne(LdLibraryCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select LIBRARY_ID from LIBRARY where ...)}
     * @param subQuery The sub-query of LibraryId_ExistsSubQuery_LibraryAsOne for 'exists'. (NotNull)
     */
    public void existsLibraryAsOne(LdSubQuery<LdLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_ExistsSubQuery_LibraryAsOne(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_ExistsSubQuery_LibraryAsOne(LdLibraryCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select LIBRARY_ID from LIBRARY where ...)}
     * @param subQuery The sub-query of LibraryId_NotExistsSubQuery_LibraryAsOne for 'not exists'. (NotNull)
     */
    public void notExistsLibraryAsOne(LdSubQuery<LdLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotExistsSubQuery_LibraryAsOne(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_NotExistsSubQuery_LibraryAsOne(LdLibraryCQ subQuery);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setLibraryId_IsNull() { regLibraryId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setLibraryId_IsNotNull() { regLibraryId(CK_ISNN, DUMMY_OBJECT); }

    protected void regLibraryId(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueLibraryId(), "LIBRARY_ID", "LibraryId", "libraryId");
    }
    protected void registerInlineLibraryId(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLibraryId(), "LIBRARY_ID", "LibraryId", "libraryId");
    }
    abstract protected LdConditionValue getCValueLibraryId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {PK : NotNull : SMALLINT : FK to LIBRARY}
     * @param nextLibraryId The value of nextLibraryId as equal.
     */
    public void setNextLibraryId_Equal(Integer nextLibraryId) {
        regNextLibraryId(CK_EQ, nextLibraryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param nextLibraryId The value of nextLibraryId as greaterThan.
     */
    public void setNextLibraryId_GreaterThan(Integer nextLibraryId) {
        regNextLibraryId(CK_GT, nextLibraryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param nextLibraryId The value of nextLibraryId as lessThan.
     */
    public void setNextLibraryId_LessThan(Integer nextLibraryId) {
        regNextLibraryId(CK_LT, nextLibraryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param nextLibraryId The value of nextLibraryId as greaterEqual.
     */
    public void setNextLibraryId_GreaterEqual(Integer nextLibraryId) {
        regNextLibraryId(CK_GE, nextLibraryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param nextLibraryId The value of nextLibraryId as lessEqual.
     */
    public void setNextLibraryId_LessEqual(Integer nextLibraryId) {
        regNextLibraryId(CK_LE, nextLibraryId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param nextLibraryIdList The collection of nextLibraryId as inScope.
     */
    public void setNextLibraryId_InScope(Collection<Integer> nextLibraryIdList) {
        regNextLibraryId(CK_INS, cTL(nextLibraryIdList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param nextLibraryIdList The collection of nextLibraryId as notInScope.
     */
    public void setNextLibraryId_NotInScope(Collection<Integer> nextLibraryIdList) {
        regNextLibraryId(CK_NINS, cTL(nextLibraryIdList));
    }

    public void inScopeLibraryByNextId(LdSubQuery<LdLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepNextLibraryId_InScopeSubQuery_LibraryByNextId(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "NEXT_LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepNextLibraryId_InScopeSubQuery_LibraryByNextId(LdLibraryCQ subQuery);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNextLibraryId_IsNull() { regNextLibraryId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNextLibraryId_IsNotNull() { regNextLibraryId(CK_ISNN, DUMMY_OBJECT); }

    protected void regNextLibraryId(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueNextLibraryId(), "NEXT_LIBRARY_ID", "NextLibraryId", "nextLibraryId");
    }
    protected void registerInlineNextLibraryId(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNextLibraryId(), "NEXT_LIBRARY_ID", "NextLibraryId", "nextLibraryId");
    }
    abstract protected LdConditionValue getCValueNextLibraryId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : NUMERIC(4, 2)}
     * @param distanceKm The value of distanceKm as equal.
     */
    public void setDistanceKm_Equal(java.math.BigDecimal distanceKm) {
        regDistanceKm(CK_EQ, distanceKm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param distanceKm The value of distanceKm as greaterThan.
     */
    public void setDistanceKm_GreaterThan(java.math.BigDecimal distanceKm) {
        regDistanceKm(CK_GT, distanceKm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param distanceKm The value of distanceKm as lessThan.
     */
    public void setDistanceKm_LessThan(java.math.BigDecimal distanceKm) {
        regDistanceKm(CK_LT, distanceKm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param distanceKm The value of distanceKm as greaterEqual.
     */
    public void setDistanceKm_GreaterEqual(java.math.BigDecimal distanceKm) {
        regDistanceKm(CK_GE, distanceKm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param distanceKm The value of distanceKm as lessEqual.
     */
    public void setDistanceKm_LessEqual(java.math.BigDecimal distanceKm) {
        regDistanceKm(CK_LE, distanceKm);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param distanceKmList The collection of distanceKm as inScope.
     */
    public void setDistanceKm_InScope(Collection<java.math.BigDecimal> distanceKmList) {
        regDistanceKm(CK_INS, cTL(distanceKmList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param distanceKmList The collection of distanceKm as notInScope.
     */
    public void setDistanceKm_NotInScope(Collection<java.math.BigDecimal> distanceKmList) {
        regDistanceKm(CK_NINS, cTL(distanceKmList));
    }

    protected void regDistanceKm(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueDistanceKm(), "DISTANCE_KM", "DistanceKm", "distanceKm");
    }
    protected void registerInlineDistanceKm(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDistanceKm(), "DISTANCE_KM", "DistanceKm", "distanceKm");
    }
    abstract protected LdConditionValue getCValueDistanceKm();

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
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdNextLibraryCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdNextLibraryCQ.class.getName(); }
}

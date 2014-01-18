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
 * The abstract condition-query of BLACK_ACTION.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsBlackActionCQ extends LdAbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsBlackActionCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BLACK_ACTION";
    }
    
    public String getTableSqlName() {
        return "BLACK_ACTION";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {PK : ID : NotNull : INTEGER}
     * @param blackActionId The value of blackActionId as equal.
     */
    public void setBlackActionId_Equal(Integer blackActionId) {
        regBlackActionId(CK_EQ, blackActionId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param blackActionId The value of blackActionId as greaterThan.
     */
    public void setBlackActionId_GreaterThan(Integer blackActionId) {
        regBlackActionId(CK_GT, blackActionId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param blackActionId The value of blackActionId as lessThan.
     */
    public void setBlackActionId_LessThan(Integer blackActionId) {
        regBlackActionId(CK_LT, blackActionId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param blackActionId The value of blackActionId as greaterEqual.
     */
    public void setBlackActionId_GreaterEqual(Integer blackActionId) {
        regBlackActionId(CK_GE, blackActionId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param blackActionId The value of blackActionId as lessEqual.
     */
    public void setBlackActionId_LessEqual(Integer blackActionId) {
        regBlackActionId(CK_LE, blackActionId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param blackActionIdList The collection of blackActionId as inScope.
     */
    public void setBlackActionId_InScope(Collection<Integer> blackActionIdList) {
        regBlackActionId(CK_INS, cTL(blackActionIdList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param blackActionIdList The collection of blackActionId as notInScope.
     */
    public void setBlackActionId_NotInScope(Collection<Integer> blackActionIdList) {
        regBlackActionId(CK_NINS, cTL(blackActionIdList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBlackActionId_IsNull() { regBlackActionId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBlackActionId_IsNotNull() { regBlackActionId(CK_ISNN, DUMMY_OBJECT); }

    protected void regBlackActionId(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueBlackActionId(), "BLACK_ACTION_ID", "BlackActionId", "blackActionId");
    }
    protected void registerInlineBlackActionId(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBlackActionId(), "BLACK_ACTION_ID", "BlackActionId", "blackActionId");
    }
    abstract protected LdConditionValue getCValueBlackActionId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : INTEGER : FK to BLACK_LIST}
     * @param blackListId The value of blackListId as equal.
     */
    public void setBlackListId_Equal(Integer blackListId) {
        regBlackListId(CK_EQ, blackListId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param blackListId The value of blackListId as greaterThan.
     */
    public void setBlackListId_GreaterThan(Integer blackListId) {
        regBlackListId(CK_GT, blackListId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param blackListId The value of blackListId as lessThan.
     */
    public void setBlackListId_LessThan(Integer blackListId) {
        regBlackListId(CK_LT, blackListId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param blackListId The value of blackListId as greaterEqual.
     */
    public void setBlackListId_GreaterEqual(Integer blackListId) {
        regBlackListId(CK_GE, blackListId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param blackListId The value of blackListId as lessEqual.
     */
    public void setBlackListId_LessEqual(Integer blackListId) {
        regBlackListId(CK_LE, blackListId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param blackListIdList The collection of blackListId as inScope.
     */
    public void setBlackListId_InScope(Collection<Integer> blackListIdList) {
        regBlackListId(CK_INS, cTL(blackListIdList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param blackListIdList The collection of blackListId as notInScope.
     */
    public void setBlackListId_NotInScope(Collection<Integer> blackListIdList) {
        regBlackListId(CK_NINS, cTL(blackListIdList));
    }

    public void inScopeBlackList(LdSubQuery<LdBlackListCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackListCB>", subQuery);
        LdBlackListCB cb = new LdBlackListCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepBlackListId_InScopeSubQuery_BlackList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "BLACK_LIST_ID", "BLACK_LIST_ID", subQueryPropertyName);
    }
    public abstract String keepBlackListId_InScopeSubQuery_BlackList(LdBlackListCQ subQuery);

    protected void regBlackListId(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueBlackListId(), "BLACK_LIST_ID", "BlackListId", "blackListId");
    }
    protected void registerInlineBlackListId(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBlackListId(), "BLACK_LIST_ID", "BlackListId", "blackListId");
    }
    abstract protected LdConditionValue getCValueBlackListId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {NotNull : CHAR(3) : FK to BLACK_ACTION_LOOKUP}
     * @param blackActionCode The value of blackActionCode as equal.
     */
    public void setBlackActionCode_Equal(String blackActionCode) {
        regBlackActionCode(CK_EQ, fRES(blackActionCode));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setBlackActionCode_Equal_EmptyString() {
        regBlackActionCode(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param blackActionCode The value of blackActionCode as notEqual.
     */
    public void setBlackActionCode_NotEqual(String blackActionCode) {
        regBlackActionCode(CK_NE, fRES(blackActionCode));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param blackActionCode The value of blackActionCode as prefixSearch.
     */
    public void setBlackActionCode_PrefixSearch(String blackActionCode) {
        regBlackActionCode(CK_PS, fRES(blackActionCode));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param blackActionCodeList The collection of blackActionCode as inScope.
     */
    public void setBlackActionCode_InScope(Collection<String> blackActionCodeList) {
        regBlackActionCode(CK_INS, cTL(blackActionCodeList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param blackActionCodeList The collection of blackActionCode as notInScope.
     */
    public void setBlackActionCode_NotInScope(Collection<String> blackActionCodeList) {
        regBlackActionCode(CK_NINS, cTL(blackActionCodeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param blackActionCode The value of blackActionCode as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBlackActionCode_LikeSearch(String blackActionCode, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(blackActionCode), getCValueBlackActionCode(), "BLACK_ACTION_CODE", "BlackActionCode", "blackActionCode", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param blackActionCode The value of blackActionCode as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBlackActionCode_NotLikeSearch(String blackActionCode, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(blackActionCode), getCValueBlackActionCode(), "BLACK_ACTION_CODE", "BlackActionCode", "blackActionCode", likeSearchOption);
    }

    public void inScopeBlackActionLookup(LdSubQuery<LdBlackActionLookupCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackActionLookupCB>", subQuery);
        LdBlackActionLookupCB cb = new LdBlackActionLookupCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepBlackActionCode_InScopeSubQuery_BlackActionLookup(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "BLACK_ACTION_CODE", "BLACK_ACTION_CODE", subQueryPropertyName);
    }
    public abstract String keepBlackActionCode_InScopeSubQuery_BlackActionLookup(dbflute.ldb.cbean.cq.LdBlackActionLookupCQ subQuery);

    protected void regBlackActionCode(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueBlackActionCode(), "BLACK_ACTION_CODE", "BlackActionCode", "blackActionCode");
    }
    protected void registerInlineBlackActionCode(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBlackActionCode(), "BLACK_ACTION_CODE", "BlackActionCode", "blackActionCode");
    }
    abstract protected LdConditionValue getCValueBlackActionCode();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {NotNull : SMALLINT}
     * @param blackLevel The value of blackLevel as equal.
     */
    public void setBlackLevel_Equal(Integer blackLevel) {
        regBlackLevel(CK_EQ, blackLevel);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param blackLevel The value of blackLevel as greaterThan.
     */
    public void setBlackLevel_GreaterThan(Integer blackLevel) {
        regBlackLevel(CK_GT, blackLevel);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param blackLevel The value of blackLevel as lessThan.
     */
    public void setBlackLevel_LessThan(Integer blackLevel) {
        regBlackLevel(CK_LT, blackLevel);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param blackLevel The value of blackLevel as greaterEqual.
     */
    public void setBlackLevel_GreaterEqual(Integer blackLevel) {
        regBlackLevel(CK_GE, blackLevel);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param blackLevel The value of blackLevel as lessEqual.
     */
    public void setBlackLevel_LessEqual(Integer blackLevel) {
        regBlackLevel(CK_LE, blackLevel);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param blackLevelList The collection of blackLevel as inScope.
     */
    public void setBlackLevel_InScope(Collection<Integer> blackLevelList) {
        regBlackLevel(CK_INS, cTL(blackLevelList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param blackLevelList The collection of blackLevel as notInScope.
     */
    public void setBlackLevel_NotInScope(Collection<Integer> blackLevelList) {
        regBlackLevel(CK_NINS, cTL(blackLevelList));
    }

    protected void regBlackLevel(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueBlackLevel(), "BLACK_LEVEL", "BlackLevel", "blackLevel");
    }
    protected void registerInlineBlackLevel(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBlackLevel(), "BLACK_LEVEL", "BlackLevel", "blackLevel");
    }
    abstract protected LdConditionValue getCValueBlackLevel();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {TIMESTAMP}
     * @param actionDate The value of actionDate as equal.
     */
    public void setActionDate_Equal(java.sql.Timestamp actionDate) {
        regActionDate(CK_EQ, actionDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param actionDate The value of actionDate as greaterThan.
     */
    public void setActionDate_GreaterThan(java.sql.Timestamp actionDate) {
        regActionDate(CK_GT, actionDate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param actionDate The value of actionDate as lessThan.
     */
    public void setActionDate_LessThan(java.sql.Timestamp actionDate) {
        regActionDate(CK_LT, actionDate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param actionDate The value of actionDate as greaterEqual.
     */
    public void setActionDate_GreaterEqual(java.sql.Timestamp actionDate) {
        regActionDate(CK_GE, actionDate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param actionDate The value of actionDate as lessEqual.
     */
    public void setActionDate_LessEqual(java.sql.Timestamp actionDate) {
        regActionDate(CK_LE, actionDate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnlyOnceRegistered. {TIMESTAMP}
     * @param fromDate The from-date of actionDate. (Nullable)
     * @param toDate The to-date of actionDate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setActionDate_FromTo(java.util.Date fromDate, java.util.Date toDate, dbflute.ldb.allcommon.cbean.coption.LdFromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueActionDate(), "ACTION_DATE", "ActionDate", "actionDate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnlyOnceRegistered. {TIMESTAMP}
     * @param fromDate The from-date of actionDate. (Nullable)
     * @param toDate The to-date of actionDate. (Nullable)
     */
    public void setActionDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setActionDate_FromTo(fromDate, toDate, new dbflute.ldb.allcommon.cbean.coption.LdDateFromToOption());
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setActionDate_IsNull() { regActionDate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setActionDate_IsNotNull() { regActionDate(CK_ISNN, DUMMY_OBJECT); }

    protected void regActionDate(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueActionDate(), "ACTION_DATE", "ActionDate", "actionDate");
    }
    protected void registerInlineActionDate(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueActionDate(), "ACTION_DATE", "ActionDate", "actionDate");
    }
    abstract protected LdConditionValue getCValueActionDate();

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEvidencePhotograph_IsNull() { regEvidencePhotograph(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEvidencePhotograph_IsNotNull() { regEvidencePhotograph(CK_ISNN, DUMMY_OBJECT); }

    protected void regEvidencePhotograph(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueEvidencePhotograph(), "EVIDENCE_PHOTOGRAPH", "EvidencePhotograph", "evidencePhotograph");
    }
    protected void registerInlineEvidencePhotograph(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueEvidencePhotograph(), "EVIDENCE_PHOTOGRAPH", "EvidencePhotograph", "evidencePhotograph");
    }
    abstract protected LdConditionValue getCValueEvidencePhotograph();

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
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    public SSQFunction<LdBlackActionCB> scalar_Equal() {
        return xcreateSSQFunction("=");
    }

    public SSQFunction<LdBlackActionCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(">=");
    }

    public SSQFunction<LdBlackActionCB> scalar_GreaterThan() {
        return xcreateSSQFunction(">");
    }

    public SSQFunction<LdBlackActionCB> scalar_LessEqual() {
        return xcreateSSQFunction("<=");
    }
    
    public SSQFunction<LdBlackActionCB> scalar_LessThan() {
        return xcreateSSQFunction("<");
    }
    
    protected SSQFunction<LdBlackActionCB> xcreateSSQFunction(final String operand) {
        return new SSQFunction<LdBlackActionCB>(new SSQSetupper<LdBlackActionCB>() {
            public void setup(String function, LdSubQuery<LdBlackActionCB> subQuery) {
                xscalarSubQuery(function, subQuery, operand);
            }
        });
    }

    protected void xscalarSubQuery(String function, LdSubQuery<LdBlackActionCB> subQuery, String operand) {
        assertObjectNotNull("subQuery<LdBlackActionCB>", subQuery);
        LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForScalarSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarSubQuery(cb.query()); // for saving query-value.
        registerScalarSubQuery(function, cb.query(), subQueryPropertyName, operand);
    }
    public abstract String keepScalarSubQuery(LdBlackActionCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdBlackActionCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdBlackActionCQ.class.getName(); }
}

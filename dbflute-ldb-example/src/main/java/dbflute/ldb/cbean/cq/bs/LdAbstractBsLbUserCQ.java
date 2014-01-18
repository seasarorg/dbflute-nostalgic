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
 * The abstract condition-query of LB_USER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsLbUserCQ extends LdAbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsLbUserCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "LB_USER";
    }
    
    public String getTableSqlName() {
        return "LB_USER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {PK : ID : NotNull : INTEGER}
     * @param lbUserId The value of lbUserId as equal.
     */
    public void setLbUserId_Equal(Integer lbUserId) {
        regLbUserId(CK_EQ, lbUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param lbUserId The value of lbUserId as greaterThan.
     */
    public void setLbUserId_GreaterThan(Integer lbUserId) {
        regLbUserId(CK_GT, lbUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param lbUserId The value of lbUserId as lessThan.
     */
    public void setLbUserId_LessThan(Integer lbUserId) {
        regLbUserId(CK_LT, lbUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param lbUserId The value of lbUserId as greaterEqual.
     */
    public void setLbUserId_GreaterEqual(Integer lbUserId) {
        regLbUserId(CK_GE, lbUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param lbUserId The value of lbUserId as lessEqual.
     */
    public void setLbUserId_LessEqual(Integer lbUserId) {
        regLbUserId(CK_LE, lbUserId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param lbUserIdList The collection of lbUserId as inScope.
     */
    public void setLbUserId_InScope(Collection<Integer> lbUserIdList) {
        regLbUserId(CK_INS, cTL(lbUserIdList));
    }

    /**
     * NotInScope(not in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param lbUserIdList The collection of lbUserId as notInScope.
     */
    public void setLbUserId_NotInScope(Collection<Integer> lbUserIdList) {
        regLbUserId(CK_NINS, cTL(lbUserIdList));
    }

    public void inScopeBlackListAsOne(LdSubQuery<LdBlackListCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackListCB>", subQuery);
        LdBlackListCB cb = new LdBlackListCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLbUserId_InScopeSubQuery_BlackListAsOne(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "LB_USER_ID", "LB_USER_ID", subQueryPropertyName);
    }
    public abstract String keepLbUserId_InScopeSubQuery_BlackListAsOne(LdBlackListCQ subQuery);

    public void inScopeLibraryUserList(LdSubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLbUserId_InScopeSubQuery_LibraryUserList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "LB_USER_ID", "LB_USER_ID", subQueryPropertyName);
    }
    public abstract String keepLbUserId_InScopeSubQuery_LibraryUserList(LdLibraryUserCQ subQuery);

    public void notInScopeBlackListAsOne(LdSubQuery<LdBlackListCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackListCB>", subQuery);
        LdBlackListCB cb = new LdBlackListCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLbUserId_NotInScopeSubQuery_BlackListAsOne(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "LB_USER_ID", "LB_USER_ID", subQueryPropertyName);
    }
    public abstract String keepLbUserId_NotInScopeSubQuery_BlackListAsOne(LdBlackListCQ subQuery);

    public void notInScopeLibraryUserList(LdSubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLbUserId_NotInScopeSubQuery_LibraryUserList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "LB_USER_ID", "LB_USER_ID", subQueryPropertyName);
    }
    public abstract String keepLbUserId_NotInScopeSubQuery_LibraryUserList(LdLibraryUserCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select LB_USER_ID from BLACK_LIST where ...)}
     * @param subQuery The sub-query of LbUserId_ExistsSubQuery_BlackListAsOne for 'exists'. (NotNull)
     */
    public void existsBlackListAsOne(LdSubQuery<LdBlackListCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackListCB>", subQuery);
        LdBlackListCB cb = new LdBlackListCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLbUserId_ExistsSubQuery_BlackListAsOne(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "LB_USER_ID", "LB_USER_ID", subQueryPropertyName);
    }
    public abstract String keepLbUserId_ExistsSubQuery_BlackListAsOne(LdBlackListCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select LB_USER_ID from LIBRARY_USER where ...)}
     * @param subQuery The sub-query of LbUserId_ExistsSubQuery_LibraryUserList for 'exists'. (NotNull)
     */
    public void existsLibraryUserList(LdSubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLbUserId_ExistsSubQuery_LibraryUserList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "LB_USER_ID", "LB_USER_ID", subQueryPropertyName);
    }
    public abstract String keepLbUserId_ExistsSubQuery_LibraryUserList(LdLibraryUserCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select LB_USER_ID from BLACK_LIST where ...)}
     * @param subQuery The sub-query of LbUserId_NotExistsSubQuery_BlackListAsOne for 'not exists'. (NotNull)
     */
    public void notExistsBlackListAsOne(LdSubQuery<LdBlackListCB> subQuery) {
        assertObjectNotNull("subQuery<LdBlackListCB>", subQuery);
        LdBlackListCB cb = new LdBlackListCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLbUserId_NotExistsSubQuery_BlackListAsOne(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "LB_USER_ID", "LB_USER_ID", subQueryPropertyName);
    }
    public abstract String keepLbUserId_NotExistsSubQuery_BlackListAsOne(LdBlackListCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select LB_USER_ID from LIBRARY_USER where ...)}
     * @param subQuery The sub-query of LbUserId_NotExistsSubQuery_LibraryUserList for 'not exists'. (NotNull)
     */
    public void notExistsLibraryUserList(LdSubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLbUserId_NotExistsSubQuery_LibraryUserList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "LB_USER_ID", "LB_USER_ID", subQueryPropertyName);
    }
    public abstract String keepLbUserId_NotExistsSubQuery_LibraryUserList(LdLibraryUserCQ subQuery);

    public void xsderiveLibraryUserList(String function, LdSubQuery<LdLibraryUserCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepLbUserId_SpecifyDerivedReferrer_LibraryUserList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "LB_USER_ID", "LB_USER_ID", subQueryPropertyName, aliasName);
    }
    public abstract String keepLbUserId_SpecifyDerivedReferrer_LibraryUserList(LdLibraryUserCQ subQuery);

    public QDRFunction<LdLibraryUserCB> derivedLibraryUserList() {
        return xcreateQDRFunctionLibraryUserList();
    }
    protected QDRFunction<LdLibraryUserCB> xcreateQDRFunctionLibraryUserList() {
        return new QDRFunction<LdLibraryUserCB>(new QDRSetupper<LdLibraryUserCB>() {
            public void setup(String function, LdSubQuery<LdLibraryUserCB> subQuery, String operand, Object value) {
                xqderiveLibraryUserList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveLibraryUserList(String function, LdSubQuery<LdLibraryUserCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepLbUserId_QueryDerivedReferrer_LibraryUserList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepLbUserId_QueryDerivedReferrer_LibraryUserListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "LB_USER_ID", "LB_USER_ID", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepLbUserId_QueryDerivedReferrer_LibraryUserList(LdLibraryUserCQ subQuery);
    public abstract String keepLbUserId_QueryDerivedReferrer_LibraryUserListParameter(Object parameterValue);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setLbUserId_IsNull() { regLbUserId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setLbUserId_IsNotNull() { regLbUserId(CK_ISNN, DUMMY_OBJECT); }

    protected void regLbUserId(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueLbUserId(), "LB_USER_ID", "LbUserId", "lbUserId");
    }
    protected void registerInlineLbUserId(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLbUserId(), "LB_USER_ID", "LbUserId", "lbUserId");
    }
    abstract protected LdConditionValue getCValueLbUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {NotNull : VARCHAR(80)}
     * @param lbUserName The value of lbUserName as equal.
     */
    public void setLbUserName_Equal(String lbUserName) {
        regLbUserName(CK_EQ, fRES(lbUserName));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setLbUserName_Equal_EmptyString() {
        regLbUserName(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param lbUserName The value of lbUserName as notEqual.
     */
    public void setLbUserName_NotEqual(String lbUserName) {
        regLbUserName(CK_NE, fRES(lbUserName));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param lbUserName The value of lbUserName as prefixSearch.
     */
    public void setLbUserName_PrefixSearch(String lbUserName) {
        regLbUserName(CK_PS, fRES(lbUserName));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param lbUserNameList The collection of lbUserName as inScope.
     */
    public void setLbUserName_InScope(Collection<String> lbUserNameList) {
        regLbUserName(CK_INS, cTL(lbUserNameList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param lbUserNameList The collection of lbUserName as notInScope.
     */
    public void setLbUserName_NotInScope(Collection<String> lbUserNameList) {
        regLbUserName(CK_NINS, cTL(lbUserNameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param lbUserName The value of lbUserName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLbUserName_LikeSearch(String lbUserName, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lbUserName), getCValueLbUserName(), "LB_USER_NAME", "LbUserName", "lbUserName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param lbUserName The value of lbUserName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLbUserName_NotLikeSearch(String lbUserName, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lbUserName), getCValueLbUserName(), "LB_USER_NAME", "LbUserName", "lbUserName", likeSearchOption);
    }

    protected void regLbUserName(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueLbUserName(), "LB_USER_NAME", "LbUserName", "lbUserName");
    }
    protected void registerInlineLbUserName(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLbUserName(), "LB_USER_NAME", "LbUserName", "lbUserName");
    }
    abstract protected LdConditionValue getCValueLbUserName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {NotNull : VARCHAR(50)}
     * @param userPassword The value of userPassword as equal.
     */
    public void setUserPassword_Equal(String userPassword) {
        regUserPassword(CK_EQ, fRES(userPassword));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setUserPassword_Equal_EmptyString() {
        regUserPassword(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param userPassword The value of userPassword as notEqual.
     */
    public void setUserPassword_NotEqual(String userPassword) {
        regUserPassword(CK_NE, fRES(userPassword));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param userPassword The value of userPassword as prefixSearch.
     */
    public void setUserPassword_PrefixSearch(String userPassword) {
        regUserPassword(CK_PS, fRES(userPassword));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param userPasswordList The collection of userPassword as inScope.
     */
    public void setUserPassword_InScope(Collection<String> userPasswordList) {
        regUserPassword(CK_INS, cTL(userPasswordList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param userPasswordList The collection of userPassword as notInScope.
     */
    public void setUserPassword_NotInScope(Collection<String> userPasswordList) {
        regUserPassword(CK_NINS, cTL(userPasswordList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param userPassword The value of userPassword as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserPassword_LikeSearch(String userPassword, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userPassword), getCValueUserPassword(), "USER_PASSWORD", "UserPassword", "userPassword", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param userPassword The value of userPassword as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserPassword_NotLikeSearch(String userPassword, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userPassword), getCValueUserPassword(), "USER_PASSWORD", "UserPassword", "userPassword", likeSearchOption);
    }

    protected void regUserPassword(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueUserPassword(), "USER_PASSWORD", "UserPassword", "userPassword");
    }
    protected void registerInlineUserPassword(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueUserPassword(), "USER_PASSWORD", "UserPassword", "userPassword");
    }
    abstract protected LdConditionValue getCValueUserPassword();

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
    public SSQFunction<LdLbUserCB> scalar_Equal() {
        return xcreateSSQFunction("=");
    }

    public SSQFunction<LdLbUserCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(">=");
    }

    public SSQFunction<LdLbUserCB> scalar_GreaterThan() {
        return xcreateSSQFunction(">");
    }

    public SSQFunction<LdLbUserCB> scalar_LessEqual() {
        return xcreateSSQFunction("<=");
    }
    
    public SSQFunction<LdLbUserCB> scalar_LessThan() {
        return xcreateSSQFunction("<");
    }
    
    protected SSQFunction<LdLbUserCB> xcreateSSQFunction(final String operand) {
        return new SSQFunction<LdLbUserCB>(new SSQSetupper<LdLbUserCB>() {
            public void setup(String function, LdSubQuery<LdLbUserCB> subQuery) {
                xscalarSubQuery(function, subQuery, operand);
            }
        });
    }

    protected void xscalarSubQuery(String function, LdSubQuery<LdLbUserCB> subQuery, String operand) {
        assertObjectNotNull("subQuery<LdLbUserCB>", subQuery);
        LdLbUserCB cb = new LdLbUserCB(); cb.xsetupForScalarSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarSubQuery(cb.query()); // for saving query-value.
        registerScalarSubQuery(function, cb.query(), subQueryPropertyName, operand);
    }
    public abstract String keepScalarSubQuery(LdLbUserCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdLbUserCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLbUserCQ.class.getName(); }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.cq.bs;

import java.util.Collection;

import dbflute.ldb.allcommon.LdCDef;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaProvider;
import dbflute.ldb.allcommon.cbean.*;
import dbflute.ldb.allcommon.cbean.ckey.*;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.cbean.*;
import dbflute.ldb.cbean.cq.*;

/**
 * The abstract condition-query of COLLECTION_STATUS_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsCollectionStatusLookupCQ extends LdAbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsCollectionStatusLookupCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "COLLECTION_STATUS_LOOKUP";
    }
    
    public String getTableSqlName() {
        return "COLLECTION_STATUS_LOOKUP";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {PK : NotNull : CHAR(3)}
     * @param collectionStatusCode The value of collectionStatusCode as equal.
     */
    public void setCollectionStatusCode_Equal(String collectionStatusCode) {
        regCollectionStatusCode(CK_EQ, fRES(collectionStatusCode));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setCollectionStatusCode_Equal_EmptyString() {
        regCollectionStatusCode(CK_EQ, "");
    }

    /**
     * Equal(=). As NOR. And OnlyOnceRegistered. <br />
     * NOR: 通常状態を示す
     */
    public void setCollectionStatusCode_Equal_NOR() {
        regCollectionStatusCode(CK_EQ, LdCDef.CollectionStatus.NOR.code());
    }

    /**
     * Equal(=). As WAT. And OnlyOnceRegistered. <br />
     * WAT: 待ち状態を示す
     */
    public void setCollectionStatusCode_Equal_WAT() {
        regCollectionStatusCode(CK_EQ, LdCDef.CollectionStatus.WAT.code());
    }

    /**
     * Equal(=). As OUT. And OnlyOnceRegistered. <br />
     * OUT: 貸し出し中を示す
     */
    public void setCollectionStatusCode_Equal_OUT() {
        regCollectionStatusCode(CK_EQ, LdCDef.CollectionStatus.OUT.code());
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param collectionStatusCode The value of collectionStatusCode as notEqual.
     */
    public void setCollectionStatusCode_NotEqual(String collectionStatusCode) {
        regCollectionStatusCode(CK_NE, fRES(collectionStatusCode));
    }

    /**
     * NotEqual(=). As NOR. And OnlyOnceRegistered. <br />
     * NOR: 通常状態を示す
     */
    public void setCollectionStatusCode_NotEqual_NOR() {
        regCollectionStatusCode(CK_NE, LdCDef.CollectionStatus.NOR.code());
    }

    /**
     * NotEqual(=). As WAT. And OnlyOnceRegistered. <br />
     * WAT: 待ち状態を示す
     */
    public void setCollectionStatusCode_NotEqual_WAT() {
        regCollectionStatusCode(CK_NE, LdCDef.CollectionStatus.WAT.code());
    }

    /**
     * NotEqual(=). As OUT. And OnlyOnceRegistered. <br />
     * OUT: 貸し出し中を示す
     */
    public void setCollectionStatusCode_NotEqual_OUT() {
        regCollectionStatusCode(CK_NE, LdCDef.CollectionStatus.OUT.code());
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param collectionStatusCodeList The collection of collectionStatusCode as inScope.
     */
    public void setCollectionStatusCode_InScope(Collection<String> collectionStatusCodeList) {
        regCollectionStatusCode(CK_INS, cTL(collectionStatusCodeList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param collectionStatusCodeList The collection of collectionStatusCode as notInScope.
     */
    public void setCollectionStatusCode_NotInScope(Collection<String> collectionStatusCodeList) {
        regCollectionStatusCode(CK_NINS, cTL(collectionStatusCodeList));
    }

    public void inScopeCollectionStatusList(LdSubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionStatusCB>", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionStatusCode_InScopeSubQuery_CollectionStatusList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE", subQueryPropertyName);
    }
    public abstract String keepCollectionStatusCode_InScopeSubQuery_CollectionStatusList(LdCollectionStatusCQ subQuery);

    public void inScopeBookAsNonExistList(LdSubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionStatusCode_InScopeSubQuery_BookAsNonExistList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "COLLECTION_STATUS_CODE", "GENRE_CODE", subQueryPropertyName);
    }
    public abstract String keepCollectionStatusCode_InScopeSubQuery_BookAsNonExistList(LdBookCQ subQuery);

    public void notInScopeCollectionStatusList(LdSubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionStatusCB>", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionStatusCode_NotInScopeSubQuery_CollectionStatusList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE", subQueryPropertyName);
    }
    public abstract String keepCollectionStatusCode_NotInScopeSubQuery_CollectionStatusList(LdCollectionStatusCQ subQuery);

    public void notInScopeBookAsNonExistList(LdSubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionStatusCode_NotInScopeSubQuery_BookAsNonExistList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "COLLECTION_STATUS_CODE", "GENRE_CODE", subQueryPropertyName);
    }
    public abstract String keepCollectionStatusCode_NotInScopeSubQuery_BookAsNonExistList(LdBookCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select COLLECTION_STATUS_CODE from COLLECTION_STATUS where ...)}
     * @param subQuery The sub-query of CollectionStatusCode_ExistsSubQuery_CollectionStatusList for 'exists'. (NotNull)
     */
    public void existsCollectionStatusList(LdSubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionStatusCB>", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionStatusCode_ExistsSubQuery_CollectionStatusList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE", subQueryPropertyName);
    }
    public abstract String keepCollectionStatusCode_ExistsSubQuery_CollectionStatusList(LdCollectionStatusCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select GENRE_CODE from BOOK where ...)}
     * @param subQuery The sub-query of CollectionStatusCode_ExistsSubQuery_BookAsNonExistList for 'exists'. (NotNull)
     */
    public void existsBookAsNonExistList(LdSubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionStatusCode_ExistsSubQuery_BookAsNonExistList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "COLLECTION_STATUS_CODE", "GENRE_CODE", subQueryPropertyName);
    }
    public abstract String keepCollectionStatusCode_ExistsSubQuery_BookAsNonExistList(LdBookCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select COLLECTION_STATUS_CODE from COLLECTION_STATUS where ...)}
     * @param subQuery The sub-query of CollectionStatusCode_NotExistsSubQuery_CollectionStatusList for 'not exists'. (NotNull)
     */
    public void notExistsCollectionStatusList(LdSubQuery<LdCollectionStatusCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionStatusCB>", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionStatusCode_NotExistsSubQuery_CollectionStatusList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE", subQueryPropertyName);
    }
    public abstract String keepCollectionStatusCode_NotExistsSubQuery_CollectionStatusList(LdCollectionStatusCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select GENRE_CODE from BOOK where ...)}
     * @param subQuery The sub-query of CollectionStatusCode_NotExistsSubQuery_BookAsNonExistList for 'not exists'. (NotNull)
     */
    public void notExistsBookAsNonExistList(LdSubQuery<LdBookCB> subQuery) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionStatusCode_NotExistsSubQuery_BookAsNonExistList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "COLLECTION_STATUS_CODE", "GENRE_CODE", subQueryPropertyName);
    }
    public abstract String keepCollectionStatusCode_NotExistsSubQuery_BookAsNonExistList(LdBookCQ subQuery);

    public void xsderiveCollectionStatusList(String function, LdSubQuery<LdCollectionStatusCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<LdCollectionStatusCB>", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE", subQueryPropertyName, aliasName);
    }
    public abstract String keepCollectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList(LdCollectionStatusCQ subQuery);

    public void xsderiveBookAsNonExistList(String function, LdSubQuery<LdBookCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionStatusCode_SpecifyDerivedReferrer_BookAsNonExistList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "COLLECTION_STATUS_CODE", "GENRE_CODE", subQueryPropertyName, aliasName);
    }
    public abstract String keepCollectionStatusCode_SpecifyDerivedReferrer_BookAsNonExistList(LdBookCQ subQuery);

    public QDRFunction<LdCollectionStatusCB> derivedCollectionStatusList() {
        return xcreateQDRFunctionCollectionStatusList();
    }
    protected QDRFunction<LdCollectionStatusCB> xcreateQDRFunctionCollectionStatusList() {
        return new QDRFunction<LdCollectionStatusCB>(new QDRSetupper<LdCollectionStatusCB>() {
            public void setup(String function, LdSubQuery<LdCollectionStatusCB> subQuery, String operand, Object value) {
                xqderiveCollectionStatusList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveCollectionStatusList(String function, LdSubQuery<LdCollectionStatusCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<LdCollectionStatusCB>", subQuery);
        LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "COLLECTION_STATUS_CODE", "COLLECTION_STATUS_CODE", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusList(LdCollectionStatusCQ subQuery);
    public abstract String keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameter(Object parameterValue);

    public QDRFunction<LdBookCB> derivedBookAsNonExistList() {
        return xcreateQDRFunctionBookAsNonExistList();
    }
    protected QDRFunction<LdBookCB> xcreateQDRFunctionBookAsNonExistList() {
        return new QDRFunction<LdBookCB>(new QDRSetupper<LdBookCB>() {
            public void setup(String function, LdSubQuery<LdBookCB> subQuery, String operand, Object value) {
                xqderiveBookAsNonExistList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveBookAsNonExistList(String function, LdSubQuery<LdBookCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<LdBookCB>", subQuery);
        LdBookCB cb = new LdBookCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepCollectionStatusCode_QueryDerivedReferrer_BookAsNonExistList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepCollectionStatusCode_QueryDerivedReferrer_BookAsNonExistListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "COLLECTION_STATUS_CODE", "GENRE_CODE", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepCollectionStatusCode_QueryDerivedReferrer_BookAsNonExistList(LdBookCQ subQuery);
    public abstract String keepCollectionStatusCode_QueryDerivedReferrer_BookAsNonExistListParameter(Object parameterValue);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setCollectionStatusCode_IsNull() { regCollectionStatusCode(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setCollectionStatusCode_IsNotNull() { regCollectionStatusCode(CK_ISNN, DUMMY_OBJECT); }

    protected void regCollectionStatusCode(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueCollectionStatusCode(), "COLLECTION_STATUS_CODE", "CollectionStatusCode", "collectionStatusCode");
    }
    protected void registerInlineCollectionStatusCode(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCollectionStatusCode(), "COLLECTION_STATUS_CODE", "CollectionStatusCode", "collectionStatusCode");
    }
    abstract protected LdConditionValue getCValueCollectionStatusCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {NotNull : VARCHAR(80)}
     * @param collectionStatusName The value of collectionStatusName as equal.
     */
    public void setCollectionStatusName_Equal(String collectionStatusName) {
        regCollectionStatusName(CK_EQ, fRES(collectionStatusName));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setCollectionStatusName_Equal_EmptyString() {
        regCollectionStatusName(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param collectionStatusName The value of collectionStatusName as notEqual.
     */
    public void setCollectionStatusName_NotEqual(String collectionStatusName) {
        regCollectionStatusName(CK_NE, fRES(collectionStatusName));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param collectionStatusName The value of collectionStatusName as prefixSearch.
     */
    public void setCollectionStatusName_PrefixSearch(String collectionStatusName) {
        regCollectionStatusName(CK_PS, fRES(collectionStatusName));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param collectionStatusNameList The collection of collectionStatusName as inScope.
     */
    public void setCollectionStatusName_InScope(Collection<String> collectionStatusNameList) {
        regCollectionStatusName(CK_INS, cTL(collectionStatusNameList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param collectionStatusNameList The collection of collectionStatusName as notInScope.
     */
    public void setCollectionStatusName_NotInScope(Collection<String> collectionStatusNameList) {
        regCollectionStatusName(CK_NINS, cTL(collectionStatusNameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param collectionStatusName The value of collectionStatusName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCollectionStatusName_LikeSearch(String collectionStatusName, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(collectionStatusName), getCValueCollectionStatusName(), "COLLECTION_STATUS_NAME", "CollectionStatusName", "collectionStatusName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param collectionStatusName The value of collectionStatusName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCollectionStatusName_NotLikeSearch(String collectionStatusName, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(collectionStatusName), getCValueCollectionStatusName(), "COLLECTION_STATUS_NAME", "CollectionStatusName", "collectionStatusName", likeSearchOption);
    }

    protected void regCollectionStatusName(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueCollectionStatusName(), "COLLECTION_STATUS_NAME", "CollectionStatusName", "collectionStatusName");
    }
    protected void registerInlineCollectionStatusName(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCollectionStatusName(), "COLLECTION_STATUS_NAME", "CollectionStatusName", "collectionStatusName");
    }
    abstract protected LdConditionValue getCValueCollectionStatusName();

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
    public SSQFunction<LdCollectionStatusLookupCB> scalar_Equal() {
        return xcreateSSQFunction("=");
    }

    public SSQFunction<LdCollectionStatusLookupCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(">=");
    }

    public SSQFunction<LdCollectionStatusLookupCB> scalar_GreaterThan() {
        return xcreateSSQFunction(">");
    }

    public SSQFunction<LdCollectionStatusLookupCB> scalar_LessEqual() {
        return xcreateSSQFunction("<=");
    }
    
    public SSQFunction<LdCollectionStatusLookupCB> scalar_LessThan() {
        return xcreateSSQFunction("<");
    }
    
    protected SSQFunction<LdCollectionStatusLookupCB> xcreateSSQFunction(final String operand) {
        return new SSQFunction<LdCollectionStatusLookupCB>(new SSQSetupper<LdCollectionStatusLookupCB>() {
            public void setup(String function, LdSubQuery<LdCollectionStatusLookupCB> subQuery) {
                xscalarSubQuery(function, subQuery, operand);
            }
        });
    }

    protected void xscalarSubQuery(String function, LdSubQuery<LdCollectionStatusLookupCB> subQuery, String operand) {
        assertObjectNotNull("subQuery<LdCollectionStatusLookupCB>", subQuery);
        LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB(); cb.xsetupForScalarSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarSubQuery(cb.query()); // for saving query-value.
        registerScalarSubQuery(function, cb.query(), subQueryPropertyName, operand);
    }
    public abstract String keepScalarSubQuery(LdCollectionStatusLookupCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdCollectionStatusLookupCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdCollectionStatusLookupCQ.class.getName(); }
}

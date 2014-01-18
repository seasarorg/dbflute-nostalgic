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
 * The abstract condition-query of LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBsLibraryCQ extends LdAbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAbstractBsLibraryCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "LIBRARY";
    }
    
    public String getTableSqlName() {
        return "LIBRARY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {PK : ID : NotNull : SMALLINT : FK to NEXT_LIBRARY}
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

    public void inScopeCollectionList(LdSubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_InScopeSubQuery_CollectionList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_InScopeSubQuery_CollectionList(LdCollectionCQ subQuery);

    public void inScopeLibraryUserList(LdSubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_InScopeSubQuery_LibraryUserList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_InScopeSubQuery_LibraryUserList(LdLibraryUserCQ subQuery);

    public void inScopeNextLibraryByNextIdList(LdSubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_InScopeSubQuery_NextLibraryByNextIdList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_InScopeSubQuery_NextLibraryByNextIdList(LdNextLibraryCQ subQuery);

    public void inScopeNextLibraryByBaseIdList(LdSubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_InScopeSubQuery_NextLibraryByBaseIdList(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_InScopeSubQuery_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery);

    public void notInScopeCollectionList(LdSubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotInScopeSubQuery_CollectionList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_NotInScopeSubQuery_CollectionList(LdCollectionCQ subQuery);

    public void notInScopeLibraryUserList(LdSubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotInScopeSubQuery_LibraryUserList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_NotInScopeSubQuery_LibraryUserList(LdLibraryUserCQ subQuery);

    public void notInScopeNextLibraryByNextIdList(LdSubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotInScopeSubQuery_NextLibraryByNextIdList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_NotInScopeSubQuery_NextLibraryByNextIdList(LdNextLibraryCQ subQuery);

    public void notInScopeNextLibraryByBaseIdList(LdSubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotInScopeSubQuery_NextLibraryByBaseIdList(cb.query()); // for saving query-value.
        registerNotInScopeSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_NotInScopeSubQuery_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select LIBRARY_ID from COLLECTION where ...)}
     * @param subQuery The sub-query of LibraryId_ExistsSubQuery_CollectionList for 'exists'. (NotNull)
     */
    public void existsCollectionList(LdSubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_ExistsSubQuery_CollectionList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_ExistsSubQuery_CollectionList(LdCollectionCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select LIBRARY_ID from LIBRARY_USER where ...)}
     * @param subQuery The sub-query of LibraryId_ExistsSubQuery_LibraryUserList for 'exists'. (NotNull)
     */
    public void existsLibraryUserList(LdSubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_ExistsSubQuery_LibraryUserList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_ExistsSubQuery_LibraryUserList(LdLibraryUserCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select NEXT_LIBRARY_ID from NEXT_LIBRARY where ...)}
     * @param subQuery The sub-query of LibraryId_ExistsSubQuery_NextLibraryByNextIdList for 'exists'. (NotNull)
     */
    public void existsNextLibraryByNextIdList(LdSubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_ExistsSubQuery_NextLibraryByNextIdList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_ExistsSubQuery_NextLibraryByNextIdList(LdNextLibraryCQ subQuery);

    /**
     * Set up 'exists' sub-query. {exists (select LIBRARY_ID from NEXT_LIBRARY where ...)}
     * @param subQuery The sub-query of LibraryId_ExistsSubQuery_NextLibraryByBaseIdList for 'exists'. (NotNull)
     */
    public void existsNextLibraryByBaseIdList(LdSubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_ExistsSubQuery_NextLibraryByBaseIdList(cb.query()); // for saving query-value.
        registerExistsSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_ExistsSubQuery_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select LIBRARY_ID from COLLECTION where ...)}
     * @param subQuery The sub-query of LibraryId_NotExistsSubQuery_CollectionList for 'not exists'. (NotNull)
     */
    public void notExistsCollectionList(LdSubQuery<LdCollectionCB> subQuery) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotExistsSubQuery_CollectionList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_NotExistsSubQuery_CollectionList(LdCollectionCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select LIBRARY_ID from LIBRARY_USER where ...)}
     * @param subQuery The sub-query of LibraryId_NotExistsSubQuery_LibraryUserList for 'not exists'. (NotNull)
     */
    public void notExistsLibraryUserList(LdSubQuery<LdLibraryUserCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotExistsSubQuery_LibraryUserList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_NotExistsSubQuery_LibraryUserList(LdLibraryUserCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select NEXT_LIBRARY_ID from NEXT_LIBRARY where ...)}
     * @param subQuery The sub-query of LibraryId_NotExistsSubQuery_NextLibraryByNextIdList for 'not exists'. (NotNull)
     */
    public void notExistsNextLibraryByNextIdList(LdSubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotExistsSubQuery_NextLibraryByNextIdList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_NotExistsSubQuery_NextLibraryByNextIdList(LdNextLibraryCQ subQuery);

    /**
     * Set up 'not exists' sub-query. {not exists (select LIBRARY_ID from NEXT_LIBRARY where ...)}
     * @param subQuery The sub-query of LibraryId_NotExistsSubQuery_NextLibraryByBaseIdList for 'not exists'. (NotNull)
     */
    public void notExistsNextLibraryByBaseIdList(LdSubQuery<LdNextLibraryCB> subQuery) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForExistsSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_NotExistsSubQuery_NextLibraryByBaseIdList(cb.query()); // for saving query-value.
        registerNotExistsSubQuery(cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName);
    }
    public abstract String keepLibraryId_NotExistsSubQuery_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery);

    public void xsderiveCollectionList(String function, LdSubQuery<LdCollectionCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_SpecifyDerivedReferrer_CollectionList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, aliasName);
    }
    public abstract String keepLibraryId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ subQuery);

    public void xsderiveLibraryUserList(String function, LdSubQuery<LdLibraryUserCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<LdLibraryUserCB>", subQuery);
        LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_SpecifyDerivedReferrer_LibraryUserList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, aliasName);
    }
    public abstract String keepLibraryId_SpecifyDerivedReferrer_LibraryUserList(LdLibraryUserCQ subQuery);

    public void xsderiveNextLibraryByNextIdList(String function, LdSubQuery<LdNextLibraryCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_SpecifyDerivedReferrer_NextLibraryByNextIdList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", subQueryPropertyName, aliasName);
    }
    public abstract String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByNextIdList(LdNextLibraryCQ subQuery);

    public void xsderiveNextLibraryByBaseIdList(String function, LdSubQuery<LdNextLibraryCB> subQuery, String aliasName) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_SpecifyDerivedReferrer_NextLibraryByBaseIdList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, aliasName);
    }
    public abstract String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery);

    public QDRFunction<LdCollectionCB> derivedCollectionList() {
        return xcreateQDRFunctionCollectionList();
    }
    protected QDRFunction<LdCollectionCB> xcreateQDRFunctionCollectionList() {
        return new QDRFunction<LdCollectionCB>(new QDRSetupper<LdCollectionCB>() {
            public void setup(String function, LdSubQuery<LdCollectionCB> subQuery, String operand, Object value) {
                xqderiveCollectionList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveCollectionList(String function, LdSubQuery<LdCollectionCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<LdCollectionCB>", subQuery);
        LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_QueryDerivedReferrer_CollectionList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepLibraryId_QueryDerivedReferrer_CollectionListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepLibraryId_QueryDerivedReferrer_CollectionList(LdCollectionCQ subQuery);
    public abstract String keepLibraryId_QueryDerivedReferrer_CollectionListParameter(Object parameterValue);

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
        String subQueryPropertyName = keepLibraryId_QueryDerivedReferrer_LibraryUserList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepLibraryId_QueryDerivedReferrer_LibraryUserListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepLibraryId_QueryDerivedReferrer_LibraryUserList(LdLibraryUserCQ subQuery);
    public abstract String keepLibraryId_QueryDerivedReferrer_LibraryUserListParameter(Object parameterValue);

    public QDRFunction<LdNextLibraryCB> derivedNextLibraryByNextIdList() {
        return xcreateQDRFunctionNextLibraryByNextIdList();
    }
    protected QDRFunction<LdNextLibraryCB> xcreateQDRFunctionNextLibraryByNextIdList() {
        return new QDRFunction<LdNextLibraryCB>(new QDRSetupper<LdNextLibraryCB>() {
            public void setup(String function, LdSubQuery<LdNextLibraryCB> subQuery, String operand, Object value) {
                xqderiveNextLibraryByNextIdList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveNextLibraryByNextIdList(String function, LdSubQuery<LdNextLibraryCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_QueryDerivedReferrer_NextLibraryByNextIdList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepLibraryId_QueryDerivedReferrer_NextLibraryByNextIdListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "LIBRARY_ID", "NEXT_LIBRARY_ID", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextIdList(LdNextLibraryCQ subQuery);
    public abstract String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextIdListParameter(Object parameterValue);

    public QDRFunction<LdNextLibraryCB> derivedNextLibraryByBaseIdList() {
        return xcreateQDRFunctionNextLibraryByBaseIdList();
    }
    protected QDRFunction<LdNextLibraryCB> xcreateQDRFunctionNextLibraryByBaseIdList() {
        return new QDRFunction<LdNextLibraryCB>(new QDRSetupper<LdNextLibraryCB>() {
            public void setup(String function, LdSubQuery<LdNextLibraryCB> subQuery, String operand, Object value) {
                xqderiveNextLibraryByBaseIdList(function, subQuery, operand, value);
            }
        });
    }
    public void xqderiveNextLibraryByBaseIdList(String function, LdSubQuery<LdNextLibraryCB> subQuery, String operand, Object value) {
        assertObjectNotNull("subQuery<LdNextLibraryCB>", subQuery);
        LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForDerivedReferrer(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryId_QueryDerivedReferrer_NextLibraryByBaseIdList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepLibraryId_QueryDerivedReferrer_NextLibraryByBaseIdListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "LIBRARY_ID", "LIBRARY_ID", subQueryPropertyName, operand, value, parameterPropertyName);
    }
    public abstract String keepLibraryId_QueryDerivedReferrer_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery);
    public abstract String keepLibraryId_QueryDerivedReferrer_NextLibraryByBaseIdListParameter(Object parameterValue);

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : NotNull : VARCHAR(80)}
     * @param libraryName The value of libraryName as equal.
     */
    public void setLibraryName_Equal(String libraryName) {
        regLibraryName(CK_EQ, fRES(libraryName));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setLibraryName_Equal_EmptyString() {
        regLibraryName(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param libraryName The value of libraryName as notEqual.
     */
    public void setLibraryName_NotEqual(String libraryName) {
        regLibraryName(CK_NE, fRES(libraryName));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param libraryName The value of libraryName as prefixSearch.
     */
    public void setLibraryName_PrefixSearch(String libraryName) {
        regLibraryName(CK_PS, fRES(libraryName));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param libraryNameList The collection of libraryName as inScope.
     */
    public void setLibraryName_InScope(Collection<String> libraryNameList) {
        regLibraryName(CK_INS, cTL(libraryNameList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param libraryNameList The collection of libraryName as notInScope.
     */
    public void setLibraryName_NotInScope(Collection<String> libraryNameList) {
        regLibraryName(CK_NINS, cTL(libraryNameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param libraryName The value of libraryName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLibraryName_LikeSearch(String libraryName, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(libraryName), getCValueLibraryName(), "LIBRARY_NAME", "LibraryName", "libraryName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param libraryName The value of libraryName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLibraryName_NotLikeSearch(String libraryName, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(libraryName), getCValueLibraryName(), "LIBRARY_NAME", "LibraryName", "libraryName", likeSearchOption);
    }

    protected void regLibraryName(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueLibraryName(), "LIBRARY_NAME", "LibraryName", "libraryName");
    }
    protected void registerInlineLibraryName(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLibraryName(), "LIBRARY_NAME", "LibraryName", "libraryName");
    }
    abstract protected LdConditionValue getCValueLibraryName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {NotNull : CHAR(3) : FK to LIBRARY_TYPE_LOOKUP}
     * @param libraryTypeCode The value of libraryTypeCode as equal.
     */
    public void setLibraryTypeCode_Equal(String libraryTypeCode) {
        regLibraryTypeCode(CK_EQ, fRES(libraryTypeCode));
    }

    /**
     * Equal(=). As the empty-string. And NullOrEmptyIgnored, OnlyOnceRegistered.
     */
    public void setLibraryTypeCode_Equal_EmptyString() {
        regLibraryTypeCode(CK_EQ, "");
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param libraryTypeCode The value of libraryTypeCode as notEqual.
     */
    public void setLibraryTypeCode_NotEqual(String libraryTypeCode) {
        regLibraryTypeCode(CK_NE, fRES(libraryTypeCode));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param libraryTypeCode The value of libraryTypeCode as prefixSearch.
     */
    public void setLibraryTypeCode_PrefixSearch(String libraryTypeCode) {
        regLibraryTypeCode(CK_PS, fRES(libraryTypeCode));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param libraryTypeCodeList The collection of libraryTypeCode as inScope.
     */
    public void setLibraryTypeCode_InScope(Collection<String> libraryTypeCodeList) {
        regLibraryTypeCode(CK_INS, cTL(libraryTypeCodeList));
    }

    /**
     * NotInScope(not in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param libraryTypeCodeList The collection of libraryTypeCode as notInScope.
     */
    public void setLibraryTypeCode_NotInScope(Collection<String> libraryTypeCodeList) {
        regLibraryTypeCode(CK_NINS, cTL(libraryTypeCodeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param libraryTypeCode The value of libraryTypeCode as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLibraryTypeCode_LikeSearch(String libraryTypeCode, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(libraryTypeCode), getCValueLibraryTypeCode(), "LIBRARY_TYPE_CODE", "LibraryTypeCode", "libraryTypeCode", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param libraryTypeCode The value of libraryTypeCode as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLibraryTypeCode_NotLikeSearch(String libraryTypeCode, dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(libraryTypeCode), getCValueLibraryTypeCode(), "LIBRARY_TYPE_CODE", "LibraryTypeCode", "libraryTypeCode", likeSearchOption);
    }

    public void inScopeLibraryTypeLookup(LdSubQuery<LdLibraryTypeLookupCB> subQuery) {
        assertObjectNotNull("subQuery<LdLibraryTypeLookupCB>", subQuery);
        LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepLibraryTypeCode_InScopeSubQuery_LibraryTypeLookup(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "LIBRARY_TYPE_CODE", "LIBRARY_TYPE_CODE", subQueryPropertyName);
    }
    public abstract String keepLibraryTypeCode_InScopeSubQuery_LibraryTypeLookup(dbflute.ldb.cbean.cq.LdLibraryTypeLookupCQ subQuery);

    protected void regLibraryTypeCode(LdConditionKey key, Object value) {
        registerQuery(key, value, getCValueLibraryTypeCode(), "LIBRARY_TYPE_CODE", "LibraryTypeCode", "libraryTypeCode");
    }
    protected void registerInlineLibraryTypeCode(LdConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLibraryTypeCode(), "LIBRARY_TYPE_CODE", "LibraryTypeCode", "libraryTypeCode");
    }
    abstract protected LdConditionValue getCValueLibraryTypeCode();

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
    public SSQFunction<LdLibraryCB> scalar_Equal() {
        return xcreateSSQFunction("=");
    }

    public SSQFunction<LdLibraryCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(">=");
    }

    public SSQFunction<LdLibraryCB> scalar_GreaterThan() {
        return xcreateSSQFunction(">");
    }

    public SSQFunction<LdLibraryCB> scalar_LessEqual() {
        return xcreateSSQFunction("<=");
    }
    
    public SSQFunction<LdLibraryCB> scalar_LessThan() {
        return xcreateSSQFunction("<");
    }
    
    protected SSQFunction<LdLibraryCB> xcreateSSQFunction(final String operand) {
        return new SSQFunction<LdLibraryCB>(new SSQSetupper<LdLibraryCB>() {
            public void setup(String function, LdSubQuery<LdLibraryCB> subQuery) {
                xscalarSubQuery(function, subQuery, operand);
            }
        });
    }

    protected void xscalarSubQuery(String function, LdSubQuery<LdLibraryCB> subQuery, String operand) {
        assertObjectNotNull("subQuery<LdLibraryCB>", subQuery);
        LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForScalarSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarSubQuery(cb.query()); // for saving query-value.
        registerScalarSubQuery(function, cb.query(), subQueryPropertyName, operand);
    }
    public abstract String keepScalarSubQuery(LdLibraryCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdLibraryCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLibraryCQ.class.getName(); }
}

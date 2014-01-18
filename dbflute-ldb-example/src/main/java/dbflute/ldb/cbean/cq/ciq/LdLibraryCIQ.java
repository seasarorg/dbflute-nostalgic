/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.cq.ciq;

import dbflute.ldb.allcommon.cbean.*;
import dbflute.ldb.allcommon.cbean.ckey.*;
import dbflute.ldb.allcommon.cbean.coption.LdConditionOption;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.cbean.*;
import dbflute.ldb.cbean.cq.bs.*;
import dbflute.ldb.cbean.cq.*;

/**
 * The condition-inline-query of LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public class LdLibraryCIQ extends LdAbstractBsLibraryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsLibraryCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdLibraryCIQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel, LdBsLibraryCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.getForeignPropertyName();// Accept foreign property name.
        _relationPath = _myCQ.getRelationPath();// Accept relation path.
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(LdConditionQuery baseQueryAsSuper, LdConditionQuery unionQueryAsSuper) {
        throw new UnsupportedOperationException("InlineQuery must not need UNION method: " + baseQueryAsSuper + " : " + unionQueryAsSuper);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(LdConditionKey key, Object value, LdConditionValue cvalue
                                                             , String colName, String capPropName, String uncapPropName) {
        registerInlineQuery(key, value, cvalue, colName, capPropName, uncapPropName);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(LdConditionKey key, Object value, LdConditionValue cvalue
                                                             , String colName, String capPropName, String uncapPropName, LdConditionOption option) {
        registerInlineQuery(key, value, cvalue, colName, capPropName, uncapPropName, option);
    }

    @Override
    protected void registerWhereClause(String whereClause) {
        registerInlineWhereClause(whereClause);
    }

    @Override
    protected String getInScopeSubQueryRealColumnName(String columnName) {
        if (_onClauseInline) {
            throw new UnsupportedOperationException("InScopeSubQuery of on-clause is unsupported");
        }
        return _onClauseInline ? getRealAliasName() + "." + columnName : columnName;
    }

    @Override
    protected void registerExistsSubQuery(LdConditionQuery subQuery
                                 , String columnName, String relatedColumnName, String propertyName) {
        throw new UnsupportedOperationException("Sorry! ExistsSubQuery at inline view is unsupported. So please use InScopeSubQyery.");
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected LdConditionValue getCValueLibraryId() {
        return _myCQ.getLibraryId();
    }
    public String keepLibraryId_InScopeSubQuery_CollectionList(LdCollectionCQ subQuery) {
        return _myCQ.keepLibraryId_InScopeSubQuery_CollectionList(subQuery);
    }
    public String keepLibraryId_InScopeSubQuery_LibraryUserList(LdLibraryUserCQ subQuery) {
        return _myCQ.keepLibraryId_InScopeSubQuery_LibraryUserList(subQuery);
    }
    public String keepLibraryId_InScopeSubQuery_NextLibraryByNextIdList(LdNextLibraryCQ subQuery) {
        return _myCQ.keepLibraryId_InScopeSubQuery_NextLibraryByNextIdList(subQuery);
    }
    public String keepLibraryId_InScopeSubQuery_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery) {
        return _myCQ.keepLibraryId_InScopeSubQuery_NextLibraryByBaseIdList(subQuery);
    }
    public String keepLibraryId_NotInScopeSubQuery_CollectionList(LdCollectionCQ subQuery) {
        return _myCQ.keepLibraryId_NotInScopeSubQuery_CollectionList(subQuery);
    }
    public String keepLibraryId_NotInScopeSubQuery_LibraryUserList(LdLibraryUserCQ subQuery) {
        return _myCQ.keepLibraryId_NotInScopeSubQuery_LibraryUserList(subQuery);
    }
    public String keepLibraryId_NotInScopeSubQuery_NextLibraryByNextIdList(LdNextLibraryCQ subQuery) {
        return _myCQ.keepLibraryId_NotInScopeSubQuery_NextLibraryByNextIdList(subQuery);
    }
    public String keepLibraryId_NotInScopeSubQuery_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery) {
        return _myCQ.keepLibraryId_NotInScopeSubQuery_NextLibraryByBaseIdList(subQuery);
    }
    public String keepLibraryId_ExistsSubQuery_CollectionList(LdCollectionCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_ExistsSubQuery_LibraryUserList(LdLibraryUserCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_ExistsSubQuery_NextLibraryByNextIdList(LdNextLibraryCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_ExistsSubQuery_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_NotExistsSubQuery_CollectionList(LdCollectionCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_NotExistsSubQuery_LibraryUserList(LdLibraryUserCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_NotExistsSubQuery_NextLibraryByNextIdList(LdNextLibraryCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_NotExistsSubQuery_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_SpecifyDerivedReferrer_LibraryUserList(LdLibraryUserCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByNextIdList(LdNextLibraryCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_SpecifyDerivedReferrer_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_QueryDerivedReferrer_CollectionList(LdCollectionCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_QueryDerivedReferrer_CollectionListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_QueryDerivedReferrer_LibraryUserList(LdLibraryUserCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_QueryDerivedReferrer_LibraryUserListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextIdList(LdNextLibraryCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByNextIdListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByBaseIdList(LdNextLibraryCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_QueryDerivedReferrer_NextLibraryByBaseIdListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    protected LdConditionValue getCValueLibraryName() {
        return _myCQ.getLibraryName();
    }
    protected LdConditionValue getCValueLibraryTypeCode() {
        return _myCQ.getLibraryTypeCode();
    }
    public String keepLibraryTypeCode_InScopeSubQuery_LibraryTypeLookup(LdLibraryTypeLookupCQ subQuery) {
        return _myCQ.keepLibraryTypeCode_InScopeSubQuery_LibraryTypeLookup(subQuery);
    }
    protected LdConditionValue getCValueRUser() {
        return _myCQ.getRUser();
    }
    protected LdConditionValue getCValueRModule() {
        return _myCQ.getRModule();
    }
    protected LdConditionValue getCValueRTimestamp() {
        return _myCQ.getRTimestamp();
    }
    protected LdConditionValue getCValueUUser() {
        return _myCQ.getUUser();
    }
    protected LdConditionValue getCValueUModule() {
        return _myCQ.getUModule();
    }
    protected LdConditionValue getCValueUTimestamp() {
        return _myCQ.getUTimestamp();
    }

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    public String keepScalarSubQuery(LdLibraryCQ subQuery) {
        throw new UnsupportedOperationException("ScalarSubQuery at inline() is unsupported! Sorry!");
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdLibraryCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLibraryCQ.class.getName(); }
}

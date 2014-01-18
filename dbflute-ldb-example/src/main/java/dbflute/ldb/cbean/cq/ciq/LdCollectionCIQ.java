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
 * The condition-inline-query of COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionCIQ extends LdAbstractBsCollectionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsCollectionCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdCollectionCIQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel, LdBsCollectionCQ myCQ) {
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
    protected LdConditionValue getCValueCollectionId() {
        return _myCQ.getCollectionId();
    }
    public String keepCollectionId_InScopeSubQuery_CollectionStatusAsOne(LdCollectionStatusCQ subQuery) {
        return _myCQ.keepCollectionId_InScopeSubQuery_CollectionStatusAsOne(subQuery);
    }
    public String keepCollectionId_InScopeSubQuery_LendingCollectionList(LdLendingCollectionCQ subQuery) {
        return _myCQ.keepCollectionId_InScopeSubQuery_LendingCollectionList(subQuery);
    }
    public String keepCollectionId_NotInScopeSubQuery_CollectionStatusAsOne(LdCollectionStatusCQ subQuery) {
        return _myCQ.keepCollectionId_NotInScopeSubQuery_CollectionStatusAsOne(subQuery);
    }
    public String keepCollectionId_NotInScopeSubQuery_LendingCollectionList(LdLendingCollectionCQ subQuery) {
        return _myCQ.keepCollectionId_NotInScopeSubQuery_LendingCollectionList(subQuery);
    }
    public String keepCollectionId_ExistsSubQuery_CollectionStatusAsOne(LdCollectionStatusCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepCollectionId_ExistsSubQuery_LendingCollectionList(LdLendingCollectionCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepCollectionId_NotExistsSubQuery_CollectionStatusAsOne(LdCollectionStatusCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepCollectionId_NotExistsSubQuery_LendingCollectionList(LdLendingCollectionCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepCollectionId_SpecifyDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepCollectionId_QueryDerivedReferrer_LendingCollectionList(LdLendingCollectionCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepCollectionId_QueryDerivedReferrer_LendingCollectionListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    protected LdConditionValue getCValueLibraryId() {
        return _myCQ.getLibraryId();
    }
    public String keepLibraryId_InScopeSubQuery_Library(LdLibraryCQ subQuery) {
        return _myCQ.keepLibraryId_InScopeSubQuery_Library(subQuery);
    }
    protected LdConditionValue getCValueBookId() {
        return _myCQ.getBookId();
    }
    public String keepBookId_InScopeSubQuery_Book(LdBookCQ subQuery) {
        return _myCQ.keepBookId_InScopeSubQuery_Book(subQuery);
    }
    protected LdConditionValue getCValueArrivalDate() {
        return _myCQ.getArrivalDate();
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
    public String keepScalarSubQuery(LdCollectionCQ subQuery) {
        throw new UnsupportedOperationException("ScalarSubQuery at inline() is unsupported! Sorry!");
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdCollectionCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdCollectionCQ.class.getName(); }
}

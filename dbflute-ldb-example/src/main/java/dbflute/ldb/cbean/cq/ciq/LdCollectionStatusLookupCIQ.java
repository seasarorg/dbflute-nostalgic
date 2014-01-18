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
 * The condition-inline-query of COLLECTION_STATUS_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionStatusLookupCIQ extends LdAbstractBsCollectionStatusLookupCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsCollectionStatusLookupCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdCollectionStatusLookupCIQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel, LdBsCollectionStatusLookupCQ myCQ) {
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
    protected LdConditionValue getCValueCollectionStatusCode() {
        return _myCQ.getCollectionStatusCode();
    }
    public String keepCollectionStatusCode_InScopeSubQuery_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        return _myCQ.keepCollectionStatusCode_InScopeSubQuery_CollectionStatusList(subQuery);
    }
    public String keepCollectionStatusCode_InScopeSubQuery_BookAsNonExistList(LdBookCQ subQuery) {
        return _myCQ.keepCollectionStatusCode_InScopeSubQuery_BookAsNonExistList(subQuery);
    }
    public String keepCollectionStatusCode_NotInScopeSubQuery_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        return _myCQ.keepCollectionStatusCode_NotInScopeSubQuery_CollectionStatusList(subQuery);
    }
    public String keepCollectionStatusCode_NotInScopeSubQuery_BookAsNonExistList(LdBookCQ subQuery) {
        return _myCQ.keepCollectionStatusCode_NotInScopeSubQuery_BookAsNonExistList(subQuery);
    }
    public String keepCollectionStatusCode_ExistsSubQuery_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepCollectionStatusCode_ExistsSubQuery_BookAsNonExistList(LdBookCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepCollectionStatusCode_NotExistsSubQuery_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepCollectionStatusCode_NotExistsSubQuery_BookAsNonExistList(LdBookCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepCollectionStatusCode_SpecifyDerivedReferrer_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepCollectionStatusCode_SpecifyDerivedReferrer_BookAsNonExistList(LdBookCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepCollectionStatusCode_QueryDerivedReferrer_CollectionStatusListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepCollectionStatusCode_QueryDerivedReferrer_BookAsNonExistList(LdBookCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepCollectionStatusCode_QueryDerivedReferrer_BookAsNonExistListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    protected LdConditionValue getCValueCollectionStatusName() {
        return _myCQ.getCollectionStatusName();
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
    public String keepScalarSubQuery(LdCollectionStatusLookupCQ subQuery) {
        throw new UnsupportedOperationException("ScalarSubQuery at inline() is unsupported! Sorry!");
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdCollectionStatusLookupCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdCollectionStatusLookupCQ.class.getName(); }
}

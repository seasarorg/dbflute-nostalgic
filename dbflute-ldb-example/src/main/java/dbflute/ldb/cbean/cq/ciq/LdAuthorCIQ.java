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
 * The condition-inline-query of AUTHOR.
 * @author DBFlute(AutoGenerator)
 */
public class LdAuthorCIQ extends LdAbstractBsAuthorCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsAuthorCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdAuthorCIQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel, LdBsAuthorCQ myCQ) {
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
    protected LdConditionValue getCValueAuthorId() {
        return _myCQ.getAuthorId();
    }
    public String keepAuthorId_InScopeSubQuery_BookList(LdBookCQ subQuery) {
        return _myCQ.keepAuthorId_InScopeSubQuery_BookList(subQuery);
    }
    public String keepAuthorId_NotInScopeSubQuery_BookList(LdBookCQ subQuery) {
        return _myCQ.keepAuthorId_NotInScopeSubQuery_BookList(subQuery);
    }
    public String keepAuthorId_ExistsSubQuery_BookList(LdBookCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepAuthorId_NotExistsSubQuery_BookList(LdBookCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepAuthorId_SpecifyDerivedReferrer_BookList(LdBookCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepAuthorId_QueryDerivedReferrer_BookList(LdBookCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepAuthorId_QueryDerivedReferrer_BookListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    protected LdConditionValue getCValueAuthorName() {
        return _myCQ.getAuthorName();
    }
    protected LdConditionValue getCValueAuthorAge() {
        return _myCQ.getAuthorAge();
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
    public String keepScalarSubQuery(LdAuthorCQ subQuery) {
        throw new UnsupportedOperationException("ScalarSubQuery at inline() is unsupported! Sorry!");
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdAuthorCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdAuthorCQ.class.getName(); }
}

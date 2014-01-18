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
 * The condition-inline-query of GENRE.
 * @author DBFlute(AutoGenerator)
 */
public class LdGenreCIQ extends LdAbstractBsGenreCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsGenreCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdGenreCIQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel, LdBsGenreCQ myCQ) {
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
    protected LdConditionValue getCValueGenreCode() {
        return _myCQ.getGenreCode();
    }
    public String keepGenreCode_InScopeSubQuery_BookList(LdBookCQ subQuery) {
        return _myCQ.keepGenreCode_InScopeSubQuery_BookList(subQuery);
    }
    public String keepGenreCode_InScopeSubQuery_GenreSelfList(LdGenreCQ subQuery) {
        return _myCQ.keepGenreCode_InScopeSubQuery_GenreSelfList(subQuery);
    }
    public String keepGenreCode_NotInScopeSubQuery_BookList(LdBookCQ subQuery) {
        return _myCQ.keepGenreCode_NotInScopeSubQuery_BookList(subQuery);
    }
    public String keepGenreCode_NotInScopeSubQuery_GenreSelfList(LdGenreCQ subQuery) {
        return _myCQ.keepGenreCode_NotInScopeSubQuery_GenreSelfList(subQuery);
    }
    public String keepGenreCode_ExistsSubQuery_BookList(LdBookCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepGenreCode_ExistsSubQuery_GenreSelfList(LdGenreCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepGenreCode_NotExistsSubQuery_BookList(LdBookCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepGenreCode_NotExistsSubQuery_GenreSelfList(LdGenreCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepGenreCode_SpecifyDerivedReferrer_BookList(LdBookCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepGenreCode_SpecifyDerivedReferrer_GenreSelfList(LdGenreCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepGenreCode_QueryDerivedReferrer_BookList(LdBookCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepGenreCode_QueryDerivedReferrer_BookListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepGenreCode_QueryDerivedReferrer_GenreSelfList(LdGenreCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepGenreCode_QueryDerivedReferrer_GenreSelfListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    protected LdConditionValue getCValueGenreName() {
        return _myCQ.getGenreName();
    }
    protected LdConditionValue getCValueHierarchyLevel() {
        return _myCQ.getHierarchyLevel();
    }
    protected LdConditionValue getCValueHierarchyOrder() {
        return _myCQ.getHierarchyOrder();
    }
    protected LdConditionValue getCValueParentGenreCode() {
        return _myCQ.getParentGenreCode();
    }
    public String keepParentGenreCode_InScopeSubQuery_GenreSelf(LdGenreCQ subQuery) {
        return _myCQ.keepParentGenreCode_InScopeSubQuery_GenreSelf(subQuery);
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
    public String keepScalarSubQuery(LdGenreCQ subQuery) {
        throw new UnsupportedOperationException("ScalarSubQuery at inline() is unsupported! Sorry!");
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdGenreCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdGenreCQ.class.getName(); }
}

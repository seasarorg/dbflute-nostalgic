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
 * The condition-inline-query of BOOK.
 * @author DBFlute(AutoGenerator)
 */
public class LdBookCIQ extends LdAbstractBsBookCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsBookCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBookCIQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel, LdBsBookCQ myCQ) {
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
    protected LdConditionValue getCValueBookId() {
        return _myCQ.getBookId();
    }
    public String keepBookId_InScopeSubQuery_CollectionList(LdCollectionCQ subQuery) {
        return _myCQ.keepBookId_InScopeSubQuery_CollectionList(subQuery);
    }
    public String keepBookId_NotInScopeSubQuery_CollectionList(LdCollectionCQ subQuery) {
        return _myCQ.keepBookId_NotInScopeSubQuery_CollectionList(subQuery);
    }
    public String keepBookId_ExistsSubQuery_CollectionList(LdCollectionCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepBookId_NotExistsSubQuery_CollectionList(LdCollectionCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepBookId_SpecifyDerivedReferrer_CollectionList(LdCollectionCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepBookId_QueryDerivedReferrer_CollectionList(LdCollectionCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepBookId_QueryDerivedReferrer_CollectionListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    protected LdConditionValue getCValueIsbn() {
        return _myCQ.getIsbn();
    }
    protected LdConditionValue getCValueBookName() {
        return _myCQ.getBookName();
    }
    protected LdConditionValue getCValueAuthorId() {
        return _myCQ.getAuthorId();
    }
    public String keepAuthorId_InScopeSubQuery_Author(LdAuthorCQ subQuery) {
        return _myCQ.keepAuthorId_InScopeSubQuery_Author(subQuery);
    }
    protected LdConditionValue getCValuePublisherId() {
        return _myCQ.getPublisherId();
    }
    public String keepPublisherId_InScopeSubQuery_Publisher(LdPublisherCQ subQuery) {
        return _myCQ.keepPublisherId_InScopeSubQuery_Publisher(subQuery);
    }
    protected LdConditionValue getCValueGenreCode() {
        return _myCQ.getGenreCode();
    }
    public String keepGenreCode_InScopeSubQuery_Genre(LdGenreCQ subQuery) {
        return _myCQ.keepGenreCode_InScopeSubQuery_Genre(subQuery);
    }
    protected LdConditionValue getCValueOpeningPart() {
        return _myCQ.getOpeningPart();
    }
    protected LdConditionValue getCValueMaxLendingDateCount() {
        return _myCQ.getMaxLendingDateCount();
    }
    protected LdConditionValue getCValueOutOfUserSelectYn() {
        return _myCQ.getOutOfUserSelectYn();
    }
    protected LdConditionValue getCValueOutOfUserSelectReason() {
        return _myCQ.getOutOfUserSelectReason();
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
    public String keepScalarSubQuery(LdBookCQ subQuery) {
        throw new UnsupportedOperationException("ScalarSubQuery at inline() is unsupported! Sorry!");
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdBookCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdBookCQ.class.getName(); }
}

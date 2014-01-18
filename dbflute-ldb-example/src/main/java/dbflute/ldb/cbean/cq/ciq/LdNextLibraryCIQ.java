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
 * The condition-inline-query of NEXT_LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public class LdNextLibraryCIQ extends LdAbstractBsNextLibraryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBsNextLibraryCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdNextLibraryCIQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel, LdBsNextLibraryCQ myCQ) {
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
    public String keepLibraryId_InScopeSubQuery_LibraryByBaseId(LdLibraryCQ subQuery) {
        return _myCQ.keepLibraryId_InScopeSubQuery_LibraryByBaseId(subQuery);
    }
    public String keepLibraryId_InScopeSubQuery_LibraryAsOne(LdLibraryCQ subQuery) {
        return _myCQ.keepLibraryId_InScopeSubQuery_LibraryAsOne(subQuery);
    }
    public String keepLibraryId_NotInScopeSubQuery_LibraryAsOne(LdLibraryCQ subQuery) {
        return _myCQ.keepLibraryId_NotInScopeSubQuery_LibraryAsOne(subQuery);
    }
    public String keepLibraryId_ExistsSubQuery_LibraryAsOne(LdLibraryCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepLibraryId_NotExistsSubQuery_LibraryAsOne(LdLibraryCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    protected LdConditionValue getCValueNextLibraryId() {
        return _myCQ.getNextLibraryId();
    }
    public String keepNextLibraryId_InScopeSubQuery_LibraryByNextId(LdLibraryCQ subQuery) {
        return _myCQ.keepNextLibraryId_InScopeSubQuery_LibraryByNextId(subQuery);
    }
    protected LdConditionValue getCValueDistanceKm() {
        return _myCQ.getDistanceKm();
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

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdNextLibraryCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdNextLibraryCQ.class.getName(); }
}

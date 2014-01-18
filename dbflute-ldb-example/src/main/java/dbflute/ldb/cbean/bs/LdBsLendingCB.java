/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.bs;

import java.util.Map;

import dbflute.ldb.allcommon.LdDBFluteConfig;
import dbflute.ldb.allcommon.LdImplementedSqlClauseCreator;
import dbflute.ldb.allcommon.cbean.LdAbstractConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.allcommon.cbean.LdSubQuery;
import dbflute.ldb.allcommon.cbean.LdUnionQuery;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaProvider;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.cbean.*;
import dbflute.ldb.cbean.cq.*;
import dbflute.ldb.cbean.nss.*;

/**
 * The base condition-bean of LENDING.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLendingCB extends LdAbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();
    protected LdLendingCQ _conditionQuery;

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected LdSqlClause createSqlClause() {
        return new LdImplementedSqlClauseCreator().createSqlClause(this);
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
        return "LENDING";
    }

    public String getTableSqlName() {
        return "LENDING";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        assertPrimaryKeyMap(primaryKeyMap);
        {
            Object obj = primaryKeyMap.get("LIBRARY_ID");
            if (obj instanceof Integer) {
                query().setLibraryId_Equal((Integer)obj);
            } else {
                query().setLibraryId_Equal(new Integer((String)obj));
            }
        }
        {
            Object obj = primaryKeyMap.get("LB_USER_ID");
            if (obj instanceof Integer) {
                query().setLbUserId_Equal((Integer)obj);
            } else {
                query().setLbUserId_Equal(new Integer((String)obj));
            }
        }
        {
            Object obj = primaryKeyMap.get("LENDING_DATE");
            if (obj instanceof java.sql.Timestamp) {
                query().setLendingDate_Equal((java.sql.Timestamp)obj);
            } else {
                query().setLendingDate_Equal(new java.sql.Timestamp(parseDateStringAsMillis(obj, "lendingDate", "java.sql.Timestamp")));
            }
        }

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public LdConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_LibraryId_Asc();
        query().addOrderBy_LbUserId_Asc();
        query().addOrderBy_LendingDate_Asc();
        return this;
    }

    public LdConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_LibraryId_Desc();
        query().addOrderBy_LbUserId_Desc();
        query().addOrderBy_LendingDate_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public LdLendingCQ query() {
        return getConditionQuery();
    }

    public LdLendingCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdLendingCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
        }
        return _conditionQuery;
    }

    /**
     * {@inheritDoc}
     * @return The conditionQuery of the local table as interface. (NotNull)
     */
    public LdConditionQuery localCQ() {
        return getConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union'.
     * <pre>
     * cb.query().union(new LdUnionQuery&lt;LdLendingCB&gt;() {
     *     public void query(LdLendingCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(LdUnionQuery<LdLendingCB> unionQuery) {
        final LdLendingCB cb = new LdLendingCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdLendingCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new LdUnionQuery&lt;LdLendingCB&gt;() {
     *     public void query(LdLendingCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(LdUnionQuery<LdLendingCB> unionQuery) {
        final LdLendingCB cb = new LdLendingCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdLendingCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============
    protected LdLibraryUserNss _nssLibraryUser;
    public LdLibraryUserNss getNssLibraryUser() {
        if (_nssLibraryUser == null) { _nssLibraryUser = new LdLibraryUserNss(null); }
        return _nssLibraryUser;
    }
    public LdLibraryUserNss setupSelect_LibraryUser() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryLibraryUser(); } });
        if (_nssLibraryUser == null || !_nssLibraryUser.hasConditionQuery())
        { _nssLibraryUser = new LdLibraryUserNss(query().queryLibraryUser()); }
        return _nssLibraryUser;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<LdLendingCQ>() {
            public boolean has() { return true; } public LdLendingCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<LdLendingCQ> {
        protected SpQyCall<LdLendingCQ> _myQyCall;
        protected LdLibraryUserCB.Specification _libraryUser;
        public Specification(LdConditionBean baseCB, SpQyCall<LdLendingCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , LdDBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnLibraryId() { doColumn("LIBRARY_ID"); }
        public void columnLbUserId() { doColumn("LB_USER_ID"); }
        public void columnLendingDate() { doColumn("LENDING_DATE"); }
        public void columnRUser() { doColumn("R_USER"); }
        public void columnRModule() { doColumn("R_MODULE"); }
        public void columnRTimestamp() { doColumn("R_TIMESTAMP"); }
        public void columnUUser() { doColumn("U_USER"); }
        public void columnUModule() { doColumn("U_MODULE"); }
        public void columnUTimestamp() { doColumn("U_TIMESTAMP"); }
        protected void doSpecifyRequiredColumn() {
            columnLibraryId();// PK
            columnLbUserId();// PK
            columnLendingDate();// PK
            if (_myQyCall.qy().hasConditionQueryLibraryUser()) {
            }
        }
        protected String getTableDbName() { return "LENDING"; }
        public LdLibraryUserCB.Specification specifyLibraryUser() {
            assertForeign("libraryUser");
            if (_libraryUser == null) {
                _libraryUser = new LdLibraryUserCB.Specification(_baseCB, new SpQyCall<LdLibraryUserCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryLibraryUser(); }
                    public LdLibraryUserCQ qy() { return _myQyCall.qy().queryLibraryUser(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _libraryUser;
        }
    }

    // ===================================================================================
    //                                                                         Display SQL
    //                                                                         ===========
    @Override
    protected String getLogDateFormat() { return LdDBFluteConfig.getInstance().getLogDateFormat(); }
    @Override
    protected String getLogTimestampFormat() { return LdDBFluteConfig.getInstance().getLogTimestampFormat(); }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdLendingCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLendingCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return LdSubQuery.class.getName(); }
}

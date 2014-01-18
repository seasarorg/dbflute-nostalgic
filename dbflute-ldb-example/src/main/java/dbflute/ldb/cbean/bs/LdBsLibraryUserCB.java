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
 * The base condition-bean of LIBRARY_USER.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLibraryUserCB extends LdAbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();
    protected LdLibraryUserCQ _conditionQuery;

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
        return "LIBRARY_USER";
    }

    public String getTableSqlName() {
        return "LIBRARY_USER";
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

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public LdConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_LibraryId_Asc();
        query().addOrderBy_LbUserId_Asc();
        return this;
    }

    public LdConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_LibraryId_Desc();
        query().addOrderBy_LbUserId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public LdLibraryUserCQ query() {
        return getConditionQuery();
    }

    public LdLibraryUserCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdLibraryUserCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new LdUnionQuery&lt;LdLibraryUserCB&gt;() {
     *     public void query(LdLibraryUserCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(LdUnionQuery<LdLibraryUserCB> unionQuery) {
        final LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdLibraryUserCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new LdUnionQuery&lt;LdLibraryUserCB&gt;() {
     *     public void query(LdLibraryUserCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(LdUnionQuery<LdLibraryUserCB> unionQuery) {
        final LdLibraryUserCB cb = new LdLibraryUserCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdLibraryUserCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============
    protected LdLbUserNss _nssLbUser;
    public LdLbUserNss getNssLbUser() {
        if (_nssLbUser == null) { _nssLbUser = new LdLbUserNss(null); }
        return _nssLbUser;
    }
    public LdLbUserNss setupSelect_LbUser() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryLbUser(); } });
        if (_nssLbUser == null || !_nssLbUser.hasConditionQuery())
        { _nssLbUser = new LdLbUserNss(query().queryLbUser()); }
        return _nssLbUser;
    }
    protected LdLibraryNss _nssLibrary;
    public LdLibraryNss getNssLibrary() {
        if (_nssLibrary == null) { _nssLibrary = new LdLibraryNss(null); }
        return _nssLibrary;
    }
    public LdLibraryNss setupSelect_Library() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryLibrary(); } });
        if (_nssLibrary == null || !_nssLibrary.hasConditionQuery())
        { _nssLibrary = new LdLibraryNss(query().queryLibrary()); }
        return _nssLibrary;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<LdLibraryUserCQ>() {
            public boolean has() { return true; } public LdLibraryUserCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<LdLibraryUserCQ> {
        protected SpQyCall<LdLibraryUserCQ> _myQyCall;
        protected LdLbUserCB.Specification _lbUser;
        protected LdLibraryCB.Specification _library;
        public Specification(LdConditionBean baseCB, SpQyCall<LdLibraryUserCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , LdDBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnLibraryId() { doColumn("LIBRARY_ID"); }
        public void columnLbUserId() { doColumn("LB_USER_ID"); }
        public void columnRUser() { doColumn("R_USER"); }
        public void columnRModule() { doColumn("R_MODULE"); }
        public void columnRTimestamp() { doColumn("R_TIMESTAMP"); }
        public void columnUUser() { doColumn("U_USER"); }
        public void columnUModule() { doColumn("U_MODULE"); }
        public void columnUTimestamp() { doColumn("U_TIMESTAMP"); }
        protected void doSpecifyRequiredColumn() {
            columnLibraryId();// PK
            columnLbUserId();// PK
            if (_myQyCall.qy().hasConditionQueryLbUser()) {
            }
            if (_myQyCall.qy().hasConditionQueryLibrary()) {
            }
        }
        protected String getTableDbName() { return "LIBRARY_USER"; }
        public LdLbUserCB.Specification specifyLbUser() {
            assertForeign("lbUser");
            if (_lbUser == null) {
                _lbUser = new LdLbUserCB.Specification(_baseCB, new SpQyCall<LdLbUserCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryLbUser(); }
                    public LdLbUserCQ qy() { return _myQyCall.qy().queryLbUser(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _lbUser;
        }
        public LdLibraryCB.Specification specifyLibrary() {
            assertForeign("library");
            if (_library == null) {
                _library = new LdLibraryCB.Specification(_baseCB, new SpQyCall<LdLibraryCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryLibrary(); }
                    public LdLibraryCQ qy() { return _myQyCall.qy().queryLibrary(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _library;
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
    protected String getConditionBeanClassNameInternally() { return LdLibraryUserCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLibraryUserCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return LdSubQuery.class.getName(); }
}

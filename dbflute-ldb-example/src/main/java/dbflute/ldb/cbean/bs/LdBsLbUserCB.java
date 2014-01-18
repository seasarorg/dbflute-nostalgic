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
 * The base condition-bean of LB_USER.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLbUserCB extends LdAbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();
    protected LdLbUserCQ _conditionQuery;

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
        return "LB_USER";
    }

    public String getTableSqlName() {
        return "LB_USER";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        assertPrimaryKeyMap(primaryKeyMap);
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
        query().addOrderBy_LbUserId_Asc();
        return this;
    }

    public LdConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_LbUserId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public LdLbUserCQ query() {
        return getConditionQuery();
    }

    public LdLbUserCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdLbUserCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new LdUnionQuery&lt;LdLbUserCB&gt;() {
     *     public void query(LdLbUserCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(LdUnionQuery<LdLbUserCB> unionQuery) {
        final LdLbUserCB cb = new LdLbUserCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdLbUserCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new LdUnionQuery&lt;LdLbUserCB&gt;() {
     *     public void query(LdLbUserCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(LdUnionQuery<LdLbUserCB> unionQuery) {
        final LdLbUserCB cb = new LdLbUserCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdLbUserCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============

    protected LdBlackListNss _nssBlackListAsOne;
    public LdBlackListNss getNssBlackListAsOne() {
        if (_nssBlackListAsOne == null) { _nssBlackListAsOne = new LdBlackListNss(null); }
        return _nssBlackListAsOne;
    }
    public LdBlackListNss setupSelect_BlackListAsOne() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryBlackListAsOne(); } });
        if (_nssBlackListAsOne == null || !_nssBlackListAsOne.hasConditionQuery()) { _nssBlackListAsOne = new LdBlackListNss(query().queryBlackListAsOne()); }
        return _nssBlackListAsOne;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<LdLbUserCQ>() {
            public boolean has() { return true; } public LdLbUserCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<LdLbUserCQ> {
        protected SpQyCall<LdLbUserCQ> _myQyCall;
        protected LdBlackListCB.Specification _blackListAsOne;
        public Specification(LdConditionBean baseCB, SpQyCall<LdLbUserCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , LdDBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnLbUserId() { doColumn("LB_USER_ID"); }
        public void columnLbUserName() { doColumn("LB_USER_NAME"); }
        public void columnUserPassword() { doColumn("USER_PASSWORD"); }
        public void columnRUser() { doColumn("R_USER"); }
        public void columnRModule() { doColumn("R_MODULE"); }
        public void columnRTimestamp() { doColumn("R_TIMESTAMP"); }
        public void columnUUser() { doColumn("U_USER"); }
        public void columnUModule() { doColumn("U_MODULE"); }
        public void columnUTimestamp() { doColumn("U_TIMESTAMP"); }
        protected void doSpecifyRequiredColumn() {
            columnLbUserId();// PK
        }
        protected String getTableDbName() { return "LB_USER"; }
        public LdBlackListCB.Specification specifyBlackListAsOne() {
            assertForeign("blackListAsOne");
            if (_blackListAsOne == null) {
                _blackListAsOne = new LdBlackListCB.Specification(_baseCB, new SpQyCall<LdBlackListCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryBlackListAsOne(); }
                    public LdBlackListCQ qy() { return _myQyCall.qy().queryBlackListAsOne(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _blackListAsOne;
        }
        public RAFunction<LdLibraryUserCB, LdLbUserCQ> derivedLibraryUserList() {
            return new RAFunction<LdLibraryUserCB, LdLbUserCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<LdLibraryUserCB, LdLbUserCQ>() {
                public void setup(String function, LdSubQuery<LdLibraryUserCB> subQuery, LdLbUserCQ cq, String aliasName) {
                    cq.xsderiveLibraryUserList(function, subQuery, aliasName); } }, _dbmetaProvider);
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
    protected String getConditionBeanClassNameInternally() { return LdLbUserCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLbUserCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return LdSubQuery.class.getName(); }
}

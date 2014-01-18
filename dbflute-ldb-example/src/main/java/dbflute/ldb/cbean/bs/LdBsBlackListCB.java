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
 * The base condition-bean of BLACK_LIST.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBlackListCB extends LdAbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();
    protected LdBlackListCQ _conditionQuery;

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
        return "BLACK_LIST";
    }

    public String getTableSqlName() {
        return "BLACK_LIST";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        assertPrimaryKeyMap(primaryKeyMap);
        {
            Object obj = primaryKeyMap.get("BLACK_LIST_ID");
            if (obj instanceof Integer) {
                query().setBlackListId_Equal((Integer)obj);
            } else {
                query().setBlackListId_Equal(new Integer((String)obj));
            }
        }

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public LdConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_BlackListId_Asc();
        return this;
    }

    public LdConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_BlackListId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public LdBlackListCQ query() {
        return getConditionQuery();
    }

    public LdBlackListCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdBlackListCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new LdUnionQuery&lt;LdBlackListCB&gt;() {
     *     public void query(LdBlackListCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(LdUnionQuery<LdBlackListCB> unionQuery) {
        final LdBlackListCB cb = new LdBlackListCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdBlackListCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new LdUnionQuery&lt;LdBlackListCB&gt;() {
     *     public void query(LdBlackListCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(LdUnionQuery<LdBlackListCB> unionQuery) {
        final LdBlackListCB cb = new LdBlackListCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdBlackListCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<LdBlackListCQ>() {
            public boolean has() { return true; } public LdBlackListCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<LdBlackListCQ> {
        protected SpQyCall<LdBlackListCQ> _myQyCall;
        protected LdLbUserCB.Specification _lbUser;
        public Specification(LdConditionBean baseCB, SpQyCall<LdBlackListCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , LdDBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnBlackListId() { doColumn("BLACK_LIST_ID"); }
        public void columnLbUserId() { doColumn("LB_USER_ID"); }
        public void columnBlackRank() { doColumn("BLACK_RANK"); }
        public void columnRUser() { doColumn("R_USER"); }
        public void columnRModule() { doColumn("R_MODULE"); }
        public void columnRTimestamp() { doColumn("R_TIMESTAMP"); }
        public void columnUUser() { doColumn("U_USER"); }
        public void columnUModule() { doColumn("U_MODULE"); }
        public void columnUTimestamp() { doColumn("U_TIMESTAMP"); }
        protected void doSpecifyRequiredColumn() {
            columnBlackListId();// PK
            if (_myQyCall.qy().hasConditionQueryLbUser()) {
                columnLbUserId();// FK
            }
        }
        protected String getTableDbName() { return "BLACK_LIST"; }
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
        public RAFunction<LdBlackActionCB, LdBlackListCQ> derivedBlackActionList() {
            return new RAFunction<LdBlackActionCB, LdBlackListCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<LdBlackActionCB, LdBlackListCQ>() {
                public void setup(String function, LdSubQuery<LdBlackActionCB> subQuery, LdBlackListCQ cq, String aliasName) {
                    cq.xsderiveBlackActionList(function, subQuery, aliasName); } }, _dbmetaProvider);
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
    protected String getConditionBeanClassNameInternally() { return LdBlackListCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdBlackListCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return LdSubQuery.class.getName(); }
}

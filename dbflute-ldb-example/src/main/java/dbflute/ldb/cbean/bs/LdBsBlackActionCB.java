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
 * The base condition-bean of BLACK_ACTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBlackActionCB extends LdAbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();
    protected LdBlackActionCQ _conditionQuery;

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
        return "BLACK_ACTION";
    }

    public String getTableSqlName() {
        return "BLACK_ACTION";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        assertPrimaryKeyMap(primaryKeyMap);
        {
            Object obj = primaryKeyMap.get("BLACK_ACTION_ID");
            if (obj instanceof Integer) {
                query().setBlackActionId_Equal((Integer)obj);
            } else {
                query().setBlackActionId_Equal(new Integer((String)obj));
            }
        }

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public LdConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_BlackActionId_Asc();
        return this;
    }

    public LdConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_BlackActionId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public LdBlackActionCQ query() {
        return getConditionQuery();
    }

    public LdBlackActionCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdBlackActionCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new LdUnionQuery&lt;LdBlackActionCB&gt;() {
     *     public void query(LdBlackActionCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(LdUnionQuery<LdBlackActionCB> unionQuery) {
        final LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdBlackActionCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new LdUnionQuery&lt;LdBlackActionCB&gt;() {
     *     public void query(LdBlackActionCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(LdUnionQuery<LdBlackActionCB> unionQuery) {
        final LdBlackActionCB cb = new LdBlackActionCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdBlackActionCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============
    protected LdBlackActionLookupNss _nssBlackActionLookup;
    public LdBlackActionLookupNss getNssBlackActionLookup() {
        if (_nssBlackActionLookup == null) { _nssBlackActionLookup = new LdBlackActionLookupNss(null); }
        return _nssBlackActionLookup;
    }
    public LdBlackActionLookupNss setupSelect_BlackActionLookup() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryBlackActionLookup(); } });
        if (_nssBlackActionLookup == null || !_nssBlackActionLookup.hasConditionQuery())
        { _nssBlackActionLookup = new LdBlackActionLookupNss(query().queryBlackActionLookup()); }
        return _nssBlackActionLookup;
    }
    protected LdBlackListNss _nssBlackList;
    public LdBlackListNss getNssBlackList() {
        if (_nssBlackList == null) { _nssBlackList = new LdBlackListNss(null); }
        return _nssBlackList;
    }
    public LdBlackListNss setupSelect_BlackList() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryBlackList(); } });
        if (_nssBlackList == null || !_nssBlackList.hasConditionQuery())
        { _nssBlackList = new LdBlackListNss(query().queryBlackList()); }
        return _nssBlackList;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<LdBlackActionCQ>() {
            public boolean has() { return true; } public LdBlackActionCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<LdBlackActionCQ> {
        protected SpQyCall<LdBlackActionCQ> _myQyCall;
        protected LdBlackActionLookupCB.Specification _blackActionLookup;
        protected LdBlackListCB.Specification _blackList;
        public Specification(LdConditionBean baseCB, SpQyCall<LdBlackActionCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , LdDBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnBlackActionId() { doColumn("BLACK_ACTION_ID"); }
        public void columnBlackListId() { doColumn("BLACK_LIST_ID"); }
        public void columnBlackActionCode() { doColumn("BLACK_ACTION_CODE"); }
        public void columnBlackLevel() { doColumn("BLACK_LEVEL"); }
        public void columnActionDate() { doColumn("ACTION_DATE"); }
        public void columnEvidencePhotograph() { doColumn("EVIDENCE_PHOTOGRAPH"); }
        public void columnRUser() { doColumn("R_USER"); }
        public void columnRModule() { doColumn("R_MODULE"); }
        public void columnRTimestamp() { doColumn("R_TIMESTAMP"); }
        public void columnUUser() { doColumn("U_USER"); }
        public void columnUModule() { doColumn("U_MODULE"); }
        public void columnUTimestamp() { doColumn("U_TIMESTAMP"); }
        protected void doSpecifyRequiredColumn() {
            columnBlackActionId();// PK
            if (_myQyCall.qy().hasConditionQueryBlackActionLookup()) {
                columnBlackActionCode();// FK
            }
            if (_myQyCall.qy().hasConditionQueryBlackList()) {
                columnBlackListId();// FK
            }
        }
        protected String getTableDbName() { return "BLACK_ACTION"; }
        public LdBlackActionLookupCB.Specification specifyBlackActionLookup() {
            assertForeign("blackActionLookup");
            if (_blackActionLookup == null) {
                _blackActionLookup = new LdBlackActionLookupCB.Specification(_baseCB, new SpQyCall<LdBlackActionLookupCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryBlackActionLookup(); }
                    public LdBlackActionLookupCQ qy() { return _myQyCall.qy().queryBlackActionLookup(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _blackActionLookup;
        }
        public LdBlackListCB.Specification specifyBlackList() {
            assertForeign("blackList");
            if (_blackList == null) {
                _blackList = new LdBlackListCB.Specification(_baseCB, new SpQyCall<LdBlackListCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryBlackList(); }
                    public LdBlackListCQ qy() { return _myQyCall.qy().queryBlackList(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _blackList;
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
    protected String getConditionBeanClassNameInternally() { return LdBlackActionCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdBlackActionCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return LdSubQuery.class.getName(); }
}

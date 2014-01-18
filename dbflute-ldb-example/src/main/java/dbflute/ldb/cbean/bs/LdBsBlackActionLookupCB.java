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

/**
 * The base condition-bean of BLACK_ACTION_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBlackActionLookupCB extends LdAbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();
    protected LdBlackActionLookupCQ _conditionQuery;

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
        return "BLACK_ACTION_LOOKUP";
    }

    public String getTableSqlName() {
        return "BLACK_ACTION_LOOKUP";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        assertPrimaryKeyMap(primaryKeyMap);
        {
            Object obj = primaryKeyMap.get("BLACK_ACTION_CODE");
            if (obj instanceof String) {
                query().setBlackActionCode_Equal((String)obj);
            } else {
                checkTypeString(obj, "blackActionCode", "String");
                query().setBlackActionCode_Equal((String)obj);
            }
        }

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public LdConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_BlackActionCode_Asc();
        return this;
    }

    public LdConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_BlackActionCode_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public LdBlackActionLookupCQ query() {
        return getConditionQuery();
    }

    public LdBlackActionLookupCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdBlackActionLookupCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new LdUnionQuery&lt;LdBlackActionLookupCB&gt;() {
     *     public void query(LdBlackActionLookupCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(LdUnionQuery<LdBlackActionLookupCB> unionQuery) {
        final LdBlackActionLookupCB cb = new LdBlackActionLookupCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdBlackActionLookupCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new LdUnionQuery&lt;LdBlackActionLookupCB&gt;() {
     *     public void query(LdBlackActionLookupCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(LdUnionQuery<LdBlackActionLookupCB> unionQuery) {
        final LdBlackActionLookupCB cb = new LdBlackActionLookupCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdBlackActionLookupCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<LdBlackActionLookupCQ>() {
            public boolean has() { return true; } public LdBlackActionLookupCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<LdBlackActionLookupCQ> {
        protected SpQyCall<LdBlackActionLookupCQ> _myQyCall;
        public Specification(LdConditionBean baseCB, SpQyCall<LdBlackActionLookupCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , LdDBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnBlackActionCode() { doColumn("BLACK_ACTION_CODE"); }
        public void columnBlackActionName() { doColumn("BLACK_ACTION_NAME"); }
        public void columnRUser() { doColumn("R_USER"); }
        public void columnRModule() { doColumn("R_MODULE"); }
        public void columnRTimestamp() { doColumn("R_TIMESTAMP"); }
        public void columnUUser() { doColumn("U_USER"); }
        public void columnUModule() { doColumn("U_MODULE"); }
        public void columnUTimestamp() { doColumn("U_TIMESTAMP"); }
        protected void doSpecifyRequiredColumn() {
            columnBlackActionCode();// PK
        }
        protected String getTableDbName() { return "BLACK_ACTION_LOOKUP"; }
        public RAFunction<LdBlackActionCB, LdBlackActionLookupCQ> derivedBlackActionList() {
            return new RAFunction<LdBlackActionCB, LdBlackActionLookupCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<LdBlackActionCB, LdBlackActionLookupCQ>() {
                public void setup(String function, LdSubQuery<LdBlackActionCB> subQuery, LdBlackActionLookupCQ cq, String aliasName) {
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
    protected String getConditionBeanClassNameInternally() { return LdBlackActionLookupCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdBlackActionLookupCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return LdSubQuery.class.getName(); }
}

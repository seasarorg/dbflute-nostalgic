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
 * The base condition-bean of COLLECTION_STATUS_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsCollectionStatusLookupCB extends LdAbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();
    protected LdCollectionStatusLookupCQ _conditionQuery;

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
        return "COLLECTION_STATUS_LOOKUP";
    }

    public String getTableSqlName() {
        return "COLLECTION_STATUS_LOOKUP";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        assertPrimaryKeyMap(primaryKeyMap);
        {
            Object obj = primaryKeyMap.get("COLLECTION_STATUS_CODE");
            if (obj instanceof String) {
                query().setCollectionStatusCode_Equal((String)obj);
            } else {
                checkTypeString(obj, "collectionStatusCode", "String");
                query().setCollectionStatusCode_Equal((String)obj);
            }
        }

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public LdConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_CollectionStatusCode_Asc();
        return this;
    }

    public LdConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_CollectionStatusCode_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public LdCollectionStatusLookupCQ query() {
        return getConditionQuery();
    }

    public LdCollectionStatusLookupCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdCollectionStatusLookupCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new LdUnionQuery&lt;LdCollectionStatusLookupCB&gt;() {
     *     public void query(LdCollectionStatusLookupCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(LdUnionQuery<LdCollectionStatusLookupCB> unionQuery) {
        final LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdCollectionStatusLookupCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new LdUnionQuery&lt;LdCollectionStatusLookupCB&gt;() {
     *     public void query(LdCollectionStatusLookupCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(LdUnionQuery<LdCollectionStatusLookupCB> unionQuery) {
        final LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdCollectionStatusLookupCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<LdCollectionStatusLookupCQ>() {
            public boolean has() { return true; } public LdCollectionStatusLookupCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<LdCollectionStatusLookupCQ> {
        protected SpQyCall<LdCollectionStatusLookupCQ> _myQyCall;
        public Specification(LdConditionBean baseCB, SpQyCall<LdCollectionStatusLookupCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , LdDBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnCollectionStatusCode() { doColumn("COLLECTION_STATUS_CODE"); }
        public void columnCollectionStatusName() { doColumn("COLLECTION_STATUS_NAME"); }
        public void columnRUser() { doColumn("R_USER"); }
        public void columnRModule() { doColumn("R_MODULE"); }
        public void columnRTimestamp() { doColumn("R_TIMESTAMP"); }
        public void columnUUser() { doColumn("U_USER"); }
        public void columnUModule() { doColumn("U_MODULE"); }
        public void columnUTimestamp() { doColumn("U_TIMESTAMP"); }
        protected void doSpecifyRequiredColumn() {
            columnCollectionStatusCode();// PK
        }
        protected String getTableDbName() { return "COLLECTION_STATUS_LOOKUP"; }
        public RAFunction<LdCollectionStatusCB, LdCollectionStatusLookupCQ> derivedCollectionStatusList() {
            return new RAFunction<LdCollectionStatusCB, LdCollectionStatusLookupCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<LdCollectionStatusCB, LdCollectionStatusLookupCQ>() {
                public void setup(String function, LdSubQuery<LdCollectionStatusCB> subQuery, LdCollectionStatusLookupCQ cq, String aliasName) {
                    cq.xsderiveCollectionStatusList(function, subQuery, aliasName); } }, _dbmetaProvider);
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
    protected String getConditionBeanClassNameInternally() { return LdCollectionStatusLookupCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdCollectionStatusLookupCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return LdSubQuery.class.getName(); }
}

package com.example.dbflute.teeda.dbflute.cbean.bs;

import java.util.Map;

import com.example.dbflute.teeda.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.teeda.dbflute.allcommon.ImplementedSqlClauseCreator;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.AbstractConditionBean;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.ConditionBean;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.ConditionQuery;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.SubQuery;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.UnionQuery;
import com.example.dbflute.teeda.dbflute.allcommon.dbmeta.DBMetaInstanceHandler;
import com.example.dbflute.teeda.dbflute.allcommon.dbmeta.DBMetaProvider;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.sqlclause.SqlClause;
import com.example.dbflute.teeda.dbflute.cbean.*;
import com.example.dbflute.teeda.dbflute.cbean.cq.*;

/**
 * The base condition-bean of SUMMARY_PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class BsSummaryProductCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();
    protected SummaryProductCQ _conditionQuery;

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        return new ImplementedSqlClauseCreator().createSqlClause(this);
    }
    
    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return _dbmetaProvider;
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "SUMMARY_PRODUCT";
    }

    public String getTableSqlName() {
        return "SUMMARY_PRODUCT";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {

        String msg = "This table has no primary-keys: " + getTableDbName();
        throw new IllegalStateException(msg);

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public ConditionBean addOrderBy_PK_Asc() {
        String msg = "This table has no primary-keys: " + getTableDbName();
        throw new IllegalStateException(msg);
    }

    public ConditionBean addOrderBy_PK_Desc() {
        String msg = "This table has no primary-keys: " + getTableDbName();
        throw new IllegalStateException(msg);
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public SummaryProductCQ query() {
        return getConditionQuery();
    }

    public SummaryProductCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new SummaryProductCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
        }
        return _conditionQuery;
    }

    /**
     * {@inheritDoc}
     * @return The conditionQuery of the local table as interface. (NotNull)
     */
    public ConditionQuery localCQ() {
        return getConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union'.
     * <pre>
     * cb.query().union(new UnionQuery&lt;SummaryProductCB&gt;() {
     *     public void query(SummaryProductCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<SummaryProductCB> unionQuery) {
        final SummaryProductCB cb = new SummaryProductCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final SummaryProductCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;SummaryProductCB&gt;() {
     *     public void query(SummaryProductCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<SummaryProductCB> unionQuery) {
        final SummaryProductCB cb = new SummaryProductCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final SummaryProductCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<SummaryProductCQ>() {
            public boolean has() { return true; } public SummaryProductCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<SummaryProductCQ> {
        protected SpQyCall<SummaryProductCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<SummaryProductCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnProductId() { doColumn("PRODUCT_ID"); }
        public void columnProductName() { doColumn("PRODUCT_NAME"); }
        public void columnProductStatusCode() { doColumn("PRODUCT_STATUS_CODE"); }
        public void columnLatestPurchaseDatetime() { doColumn("LATEST_PURCHASE_DATETIME"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "SUMMARY_PRODUCT"; }
    }

    // ===================================================================================
    //                                                                         Display SQL
    //                                                                         ===========
    @Override
    protected String getLogDateFormat() { return DBFluteConfig.getInstance().getLogDateFormat(); }
    @Override
    protected String getLogTimestampFormat() { return DBFluteConfig.getInstance().getLogTimestampFormat(); }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return SummaryProductCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return SummaryProductCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}

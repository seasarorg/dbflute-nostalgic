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
 * The base condition-bean of COLLECTION_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsCollectionStatusCB extends LdAbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();
    protected LdCollectionStatusCQ _conditionQuery;

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
        return "COLLECTION_STATUS";
    }

    public String getTableSqlName() {
        return "COLLECTION_STATUS";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        assertPrimaryKeyMap(primaryKeyMap);
        {
            Object obj = primaryKeyMap.get("COLLECTION_ID");
            if (obj instanceof Integer) {
                query().setCollectionId_Equal((Integer)obj);
            } else {
                query().setCollectionId_Equal(new Integer((String)obj));
            }
        }

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public LdConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_CollectionId_Asc();
        return this;
    }

    public LdConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_CollectionId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public LdCollectionStatusCQ query() {
        return getConditionQuery();
    }

    public LdCollectionStatusCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdCollectionStatusCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new LdUnionQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(LdUnionQuery<LdCollectionStatusCB> unionQuery) {
        final LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdCollectionStatusCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new LdUnionQuery&lt;LdCollectionStatusCB&gt;() {
     *     public void query(LdCollectionStatusCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(LdUnionQuery<LdCollectionStatusCB> unionQuery) {
        final LdCollectionStatusCB cb = new LdCollectionStatusCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdCollectionStatusCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============
    protected LdCollectionNss _nssCollection;
    public LdCollectionNss getNssCollection() {
        if (_nssCollection == null) { _nssCollection = new LdCollectionNss(null); }
        return _nssCollection;
    }
    public LdCollectionNss setupSelect_Collection() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryCollection(); } });
        if (_nssCollection == null || !_nssCollection.hasConditionQuery())
        { _nssCollection = new LdCollectionNss(query().queryCollection()); }
        return _nssCollection;
    }
    protected LdCollectionStatusLookupNss _nssCollectionStatusLookup;
    public LdCollectionStatusLookupNss getNssCollectionStatusLookup() {
        if (_nssCollectionStatusLookup == null) { _nssCollectionStatusLookup = new LdCollectionStatusLookupNss(null); }
        return _nssCollectionStatusLookup;
    }
    public LdCollectionStatusLookupNss setupSelect_CollectionStatusLookup() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryCollectionStatusLookup(); } });
        if (_nssCollectionStatusLookup == null || !_nssCollectionStatusLookup.hasConditionQuery())
        { _nssCollectionStatusLookup = new LdCollectionStatusLookupNss(query().queryCollectionStatusLookup()); }
        return _nssCollectionStatusLookup;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<LdCollectionStatusCQ>() {
            public boolean has() { return true; } public LdCollectionStatusCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<LdCollectionStatusCQ> {
        protected SpQyCall<LdCollectionStatusCQ> _myQyCall;
        protected LdCollectionCB.Specification _collection;
        protected LdCollectionStatusLookupCB.Specification _collectionStatusLookup;
        public Specification(LdConditionBean baseCB, SpQyCall<LdCollectionStatusCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , LdDBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnCollectionId() { doColumn("COLLECTION_ID"); }
        public void columnCollectionStatusCode() { doColumn("COLLECTION_STATUS_CODE"); }
        public void columnRUser() { doColumn("R_USER"); }
        public void columnRModule() { doColumn("R_MODULE"); }
        public void columnRTimestamp() { doColumn("R_TIMESTAMP"); }
        public void columnUUser() { doColumn("U_USER"); }
        public void columnUModule() { doColumn("U_MODULE"); }
        public void columnUTimestamp() { doColumn("U_TIMESTAMP"); }
        protected void doSpecifyRequiredColumn() {
            columnCollectionId();// PK
            if (_myQyCall.qy().hasConditionQueryCollection()) {
            }
            if (_myQyCall.qy().hasConditionQueryCollectionStatusLookup()) {
                columnCollectionStatusCode();// FK
            }
        }
        protected String getTableDbName() { return "COLLECTION_STATUS"; }
        public LdCollectionCB.Specification specifyCollection() {
            assertForeign("collection");
            if (_collection == null) {
                _collection = new LdCollectionCB.Specification(_baseCB, new SpQyCall<LdCollectionCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryCollection(); }
                    public LdCollectionCQ qy() { return _myQyCall.qy().queryCollection(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _collection;
        }
        public LdCollectionStatusLookupCB.Specification specifyCollectionStatusLookup() {
            assertForeign("collectionStatusLookup");
            if (_collectionStatusLookup == null) {
                _collectionStatusLookup = new LdCollectionStatusLookupCB.Specification(_baseCB, new SpQyCall<LdCollectionStatusLookupCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryCollectionStatusLookup(); }
                    public LdCollectionStatusLookupCQ qy() { return _myQyCall.qy().queryCollectionStatusLookup(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _collectionStatusLookup;
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
    protected String getConditionBeanClassNameInternally() { return LdCollectionStatusCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdCollectionStatusCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return LdSubQuery.class.getName(); }
}

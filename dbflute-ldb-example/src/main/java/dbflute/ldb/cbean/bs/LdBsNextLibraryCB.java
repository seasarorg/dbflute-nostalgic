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
 * The base condition-bean of NEXT_LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsNextLibraryCB extends LdAbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();
    protected LdNextLibraryCQ _conditionQuery;

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
        return "NEXT_LIBRARY";
    }

    public String getTableSqlName() {
        return "NEXT_LIBRARY";
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
            Object obj = primaryKeyMap.get("NEXT_LIBRARY_ID");
            if (obj instanceof Integer) {
                query().setNextLibraryId_Equal((Integer)obj);
            } else {
                query().setNextLibraryId_Equal(new Integer((String)obj));
            }
        }

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public LdConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_LibraryId_Asc();
        query().addOrderBy_NextLibraryId_Asc();
        return this;
    }

    public LdConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_LibraryId_Desc();
        query().addOrderBy_NextLibraryId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public LdNextLibraryCQ query() {
        return getConditionQuery();
    }

    public LdNextLibraryCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdNextLibraryCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new LdUnionQuery&lt;LdNextLibraryCB&gt;() {
     *     public void query(LdNextLibraryCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(LdUnionQuery<LdNextLibraryCB> unionQuery) {
        final LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdNextLibraryCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new LdUnionQuery&lt;LdNextLibraryCB&gt;() {
     *     public void query(LdNextLibraryCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(LdUnionQuery<LdNextLibraryCB> unionQuery) {
        final LdNextLibraryCB cb = new LdNextLibraryCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdNextLibraryCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============
    protected LdLibraryNss _nssLibraryByNextId;
    public LdLibraryNss getNssLibraryByNextId() {
        if (_nssLibraryByNextId == null) { _nssLibraryByNextId = new LdLibraryNss(null); }
        return _nssLibraryByNextId;
    }
    public LdLibraryNss setupSelect_LibraryByNextId() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryLibraryByNextId(); } });
        if (_nssLibraryByNextId == null || !_nssLibraryByNextId.hasConditionQuery())
        { _nssLibraryByNextId = new LdLibraryNss(query().queryLibraryByNextId()); }
        return _nssLibraryByNextId;
    }
    protected LdLibraryNss _nssLibraryByBaseId;
    public LdLibraryNss getNssLibraryByBaseId() {
        if (_nssLibraryByBaseId == null) { _nssLibraryByBaseId = new LdLibraryNss(null); }
        return _nssLibraryByBaseId;
    }
    public LdLibraryNss setupSelect_LibraryByBaseId() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryLibraryByBaseId(); } });
        if (_nssLibraryByBaseId == null || !_nssLibraryByBaseId.hasConditionQuery())
        { _nssLibraryByBaseId = new LdLibraryNss(query().queryLibraryByBaseId()); }
        return _nssLibraryByBaseId;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<LdNextLibraryCQ>() {
            public boolean has() { return true; } public LdNextLibraryCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<LdNextLibraryCQ> {
        protected SpQyCall<LdNextLibraryCQ> _myQyCall;
        protected LdLibraryCB.Specification _libraryByNextId;
        protected LdLibraryCB.Specification _libraryByBaseId;
        public Specification(LdConditionBean baseCB, SpQyCall<LdNextLibraryCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , LdDBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnLibraryId() { doColumn("LIBRARY_ID"); }
        public void columnNextLibraryId() { doColumn("NEXT_LIBRARY_ID"); }
        public void columnDistanceKm() { doColumn("DISTANCE_KM"); }
        public void columnRUser() { doColumn("R_USER"); }
        public void columnRModule() { doColumn("R_MODULE"); }
        public void columnRTimestamp() { doColumn("R_TIMESTAMP"); }
        public void columnUUser() { doColumn("U_USER"); }
        public void columnUModule() { doColumn("U_MODULE"); }
        public void columnUTimestamp() { doColumn("U_TIMESTAMP"); }
        protected void doSpecifyRequiredColumn() {
            columnLibraryId();// PK
            columnNextLibraryId();// PK
            if (_myQyCall.qy().hasConditionQueryLibraryByNextId()) {
            }
            if (_myQyCall.qy().hasConditionQueryLibraryByBaseId()) {
            }
        }
        protected String getTableDbName() { return "NEXT_LIBRARY"; }
        public LdLibraryCB.Specification specifyLibraryByNextId() {
            assertForeign("libraryByNextId");
            if (_libraryByNextId == null) {
                _libraryByNextId = new LdLibraryCB.Specification(_baseCB, new SpQyCall<LdLibraryCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryLibraryByNextId(); }
                    public LdLibraryCQ qy() { return _myQyCall.qy().queryLibraryByNextId(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _libraryByNextId;
        }
        public LdLibraryCB.Specification specifyLibraryByBaseId() {
            assertForeign("libraryByBaseId");
            if (_libraryByBaseId == null) {
                _libraryByBaseId = new LdLibraryCB.Specification(_baseCB, new SpQyCall<LdLibraryCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryLibraryByBaseId(); }
                    public LdLibraryCQ qy() { return _myQyCall.qy().queryLibraryByBaseId(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _libraryByBaseId;
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
    protected String getConditionBeanClassNameInternally() { return LdNextLibraryCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdNextLibraryCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return LdSubQuery.class.getName(); }
}

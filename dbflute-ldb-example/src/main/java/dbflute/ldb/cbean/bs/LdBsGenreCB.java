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
 * The base condition-bean of GENRE.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsGenreCB extends LdAbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();
    protected LdGenreCQ _conditionQuery;

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
        return "GENRE";
    }

    public String getTableSqlName() {
        return "GENRE";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        assertPrimaryKeyMap(primaryKeyMap);
        {
            Object obj = primaryKeyMap.get("GENRE_CODE");
            if (obj instanceof String) {
                query().setGenreCode_Equal((String)obj);
            } else {
                checkTypeString(obj, "genreCode", "String");
                query().setGenreCode_Equal((String)obj);
            }
        }

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public LdConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_GenreCode_Asc();
        return this;
    }

    public LdConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_GenreCode_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public LdGenreCQ query() {
        return getConditionQuery();
    }

    public LdGenreCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdGenreCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new LdUnionQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(LdUnionQuery<LdGenreCB> unionQuery) {
        final LdGenreCB cb = new LdGenreCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdGenreCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new LdUnionQuery&lt;LdGenreCB&gt;() {
     *     public void query(LdGenreCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(LdUnionQuery<LdGenreCB> unionQuery) {
        final LdGenreCB cb = new LdGenreCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdGenreCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============
    protected LdGenreNss _nssGenreSelf;
    public LdGenreNss getNssGenreSelf() {
        if (_nssGenreSelf == null) { _nssGenreSelf = new LdGenreNss(null); }
        return _nssGenreSelf;
    }
    public LdGenreNss setupSelect_GenreSelf() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryGenreSelf(); } });
        if (_nssGenreSelf == null || !_nssGenreSelf.hasConditionQuery())
        { _nssGenreSelf = new LdGenreNss(query().queryGenreSelf()); }
        return _nssGenreSelf;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<LdGenreCQ>() {
            public boolean has() { return true; } public LdGenreCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<LdGenreCQ> {
        protected SpQyCall<LdGenreCQ> _myQyCall;
        protected LdGenreCB.Specification _genreSelf;
        public Specification(LdConditionBean baseCB, SpQyCall<LdGenreCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , LdDBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnGenreCode() { doColumn("GENRE_CODE"); }
        public void columnGenreName() { doColumn("GENRE_NAME"); }
        public void columnHierarchyLevel() { doColumn("HIERARCHY_LEVEL"); }
        public void columnHierarchyOrder() { doColumn("HIERARCHY_ORDER"); }
        public void columnParentGenreCode() { doColumn("PARENT_GENRE_CODE"); }
        public void columnRUser() { doColumn("R_USER"); }
        public void columnRModule() { doColumn("R_MODULE"); }
        public void columnRTimestamp() { doColumn("R_TIMESTAMP"); }
        public void columnUUser() { doColumn("U_USER"); }
        public void columnUModule() { doColumn("U_MODULE"); }
        public void columnUTimestamp() { doColumn("U_TIMESTAMP"); }
        protected void doSpecifyRequiredColumn() {
            columnGenreCode();// PK
            if (_myQyCall.qy().hasConditionQueryGenreSelf()) {
                columnParentGenreCode();// FK
            }
        }
        protected String getTableDbName() { return "GENRE"; }
        public LdGenreCB.Specification specifyGenreSelf() {
            assertForeign("genreSelf");
            if (_genreSelf == null) {
                _genreSelf = new LdGenreCB.Specification(_baseCB, new SpQyCall<LdGenreCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryGenreSelf(); }
                    public LdGenreCQ qy() { return _myQyCall.qy().queryGenreSelf(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _genreSelf;
        }
        public RAFunction<LdBookCB, LdGenreCQ> derivedBookList() {
            return new RAFunction<LdBookCB, LdGenreCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<LdBookCB, LdGenreCQ>() {
                public void setup(String function, LdSubQuery<LdBookCB> subQuery, LdGenreCQ cq, String aliasName) {
                    cq.xsderiveBookList(function, subQuery, aliasName); } }, _dbmetaProvider);
        }
        public RAFunction<LdGenreCB, LdGenreCQ> derivedGenreSelfList() {
            return new RAFunction<LdGenreCB, LdGenreCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<LdGenreCB, LdGenreCQ>() {
                public void setup(String function, LdSubQuery<LdGenreCB> subQuery, LdGenreCQ cq, String aliasName) {
                    cq.xsderiveGenreSelfList(function, subQuery, aliasName); } }, _dbmetaProvider);
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
    protected String getConditionBeanClassNameInternally() { return LdGenreCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdGenreCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return LdSubQuery.class.getName(); }
}

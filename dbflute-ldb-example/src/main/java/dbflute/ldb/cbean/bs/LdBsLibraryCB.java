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
 * The base condition-bean of LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLibraryCB extends LdAbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();
    protected LdLibraryCQ _conditionQuery;

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
        return "LIBRARY";
    }

    public String getTableSqlName() {
        return "LIBRARY";
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

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public LdConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_LibraryId_Asc();
        return this;
    }

    public LdConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_LibraryId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public LdLibraryCQ query() {
        return getConditionQuery();
    }

    public LdLibraryCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdLibraryCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new LdUnionQuery&lt;LdLibraryCB&gt;() {
     *     public void query(LdLibraryCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(LdUnionQuery<LdLibraryCB> unionQuery) {
        final LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdLibraryCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new LdUnionQuery&lt;LdLibraryCB&gt;() {
     *     public void query(LdLibraryCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(LdUnionQuery<LdLibraryCB> unionQuery) {
        final LdLibraryCB cb = new LdLibraryCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdLibraryCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============
    protected LdLibraryTypeLookupNss _nssLibraryTypeLookup;
    public LdLibraryTypeLookupNss getNssLibraryTypeLookup() {
        if (_nssLibraryTypeLookup == null) { _nssLibraryTypeLookup = new LdLibraryTypeLookupNss(null); }
        return _nssLibraryTypeLookup;
    }
    public LdLibraryTypeLookupNss setupSelect_LibraryTypeLookup() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryLibraryTypeLookup(); } });
        if (_nssLibraryTypeLookup == null || !_nssLibraryTypeLookup.hasConditionQuery())
        { _nssLibraryTypeLookup = new LdLibraryTypeLookupNss(query().queryLibraryTypeLookup()); }
        return _nssLibraryTypeLookup;
    }
    protected LdNextLibraryNss _nssNextLibraryAsNext;
    public LdNextLibraryNss getNssNextLibraryAsNext() {
        if (_nssNextLibraryAsNext == null) { _nssNextLibraryAsNext = new LdNextLibraryNss(null); }
        return _nssNextLibraryAsNext;
    }
    public LdNextLibraryNss setupSelect_NextLibraryAsNext(final Integer nextLibraryId) {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryNextLibraryAsNext(nextLibraryId); } });
        if (_nssNextLibraryAsNext == null || !_nssNextLibraryAsNext.hasConditionQuery())
        { _nssNextLibraryAsNext = new LdNextLibraryNss(query().queryNextLibraryAsNext(nextLibraryId)); }
        return _nssNextLibraryAsNext;
    }
    protected LdLibraryUserNss _nssLibraryUserAsUser;
    public LdLibraryUserNss getNssLibraryUserAsUser() {
        if (_nssLibraryUserAsUser == null) { _nssLibraryUserAsUser = new LdLibraryUserNss(null); }
        return _nssLibraryUserAsUser;
    }
    public LdLibraryUserNss setupSelect_LibraryUserAsUser(final Integer userId, final String secondString, final java.util.List<Integer> thirdList) {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryLibraryUserAsUser(userId, secondString, thirdList); } });
        if (_nssLibraryUserAsUser == null || !_nssLibraryUserAsUser.hasConditionQuery())
        { _nssLibraryUserAsUser = new LdLibraryUserNss(query().queryLibraryUserAsUser(userId, secondString, thirdList)); }
        return _nssLibraryUserAsUser;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<LdLibraryCQ>() {
            public boolean has() { return true; } public LdLibraryCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<LdLibraryCQ> {
        protected SpQyCall<LdLibraryCQ> _myQyCall;
        protected LdLibraryTypeLookupCB.Specification _libraryTypeLookup;
        protected LdNextLibraryCB.Specification _nextLibraryAsNext;
        protected LdLibraryUserCB.Specification _libraryUserAsUser;
        public Specification(LdConditionBean baseCB, SpQyCall<LdLibraryCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , LdDBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnLibraryId() { doColumn("LIBRARY_ID"); }
        public void columnLibraryName() { doColumn("LIBRARY_NAME"); }
        public void columnLibraryTypeCode() { doColumn("LIBRARY_TYPE_CODE"); }
        public void columnRUser() { doColumn("R_USER"); }
        public void columnRModule() { doColumn("R_MODULE"); }
        public void columnRTimestamp() { doColumn("R_TIMESTAMP"); }
        public void columnUUser() { doColumn("U_USER"); }
        public void columnUModule() { doColumn("U_MODULE"); }
        public void columnUTimestamp() { doColumn("U_TIMESTAMP"); }
        protected void doSpecifyRequiredColumn() {
            columnLibraryId();// PK
            if (_myQyCall.qy().hasConditionQueryLibraryTypeLookup()) {
                columnLibraryTypeCode();// FK
            }
            if (_myQyCall.qy().hasConditionQueryNextLibraryAsNext()) {
            }
            if (_myQyCall.qy().hasConditionQueryLibraryUserAsUser()) {
            }
        }
        protected String getTableDbName() { return "LIBRARY"; }
        public LdLibraryTypeLookupCB.Specification specifyLibraryTypeLookup() {
            assertForeign("libraryTypeLookup");
            if (_libraryTypeLookup == null) {
                _libraryTypeLookup = new LdLibraryTypeLookupCB.Specification(_baseCB, new SpQyCall<LdLibraryTypeLookupCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryLibraryTypeLookup(); }
                    public LdLibraryTypeLookupCQ qy() { return _myQyCall.qy().queryLibraryTypeLookup(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _libraryTypeLookup;
        }
        public LdNextLibraryCB.Specification specifyNextLibraryAsNext() {
            assertForeign("nextLibraryAsNext");
            if (_nextLibraryAsNext == null) {
                _nextLibraryAsNext = new LdNextLibraryCB.Specification(_baseCB, new SpQyCall<LdNextLibraryCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryNextLibraryAsNext(); }
                    public LdNextLibraryCQ qy() { return _myQyCall.qy().getConditionQueryNextLibraryAsNext(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _nextLibraryAsNext;
        }
        public LdLibraryUserCB.Specification specifyLibraryUserAsUser() {
            assertForeign("libraryUserAsUser");
            if (_libraryUserAsUser == null) {
                _libraryUserAsUser = new LdLibraryUserCB.Specification(_baseCB, new SpQyCall<LdLibraryUserCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryLibraryUserAsUser(); }
                    public LdLibraryUserCQ qy() { return _myQyCall.qy().getConditionQueryLibraryUserAsUser(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _libraryUserAsUser;
        }
        public RAFunction<LdCollectionCB, LdLibraryCQ> derivedCollectionList() {
            return new RAFunction<LdCollectionCB, LdLibraryCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<LdCollectionCB, LdLibraryCQ>() {
                public void setup(String function, LdSubQuery<LdCollectionCB> subQuery, LdLibraryCQ cq, String aliasName) {
                    cq.xsderiveCollectionList(function, subQuery, aliasName); } }, _dbmetaProvider);
        }
        public RAFunction<LdLibraryUserCB, LdLibraryCQ> derivedLibraryUserList() {
            return new RAFunction<LdLibraryUserCB, LdLibraryCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<LdLibraryUserCB, LdLibraryCQ>() {
                public void setup(String function, LdSubQuery<LdLibraryUserCB> subQuery, LdLibraryCQ cq, String aliasName) {
                    cq.xsderiveLibraryUserList(function, subQuery, aliasName); } }, _dbmetaProvider);
        }
        public RAFunction<LdNextLibraryCB, LdLibraryCQ> derivedNextLibraryByNextIdList() {
            return new RAFunction<LdNextLibraryCB, LdLibraryCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<LdNextLibraryCB, LdLibraryCQ>() {
                public void setup(String function, LdSubQuery<LdNextLibraryCB> subQuery, LdLibraryCQ cq, String aliasName) {
                    cq.xsderiveNextLibraryByNextIdList(function, subQuery, aliasName); } }, _dbmetaProvider);
        }
        public RAFunction<LdNextLibraryCB, LdLibraryCQ> derivedNextLibraryByBaseIdList() {
            return new RAFunction<LdNextLibraryCB, LdLibraryCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<LdNextLibraryCB, LdLibraryCQ>() {
                public void setup(String function, LdSubQuery<LdNextLibraryCB> subQuery, LdLibraryCQ cq, String aliasName) {
                    cq.xsderiveNextLibraryByBaseIdList(function, subQuery, aliasName); } }, _dbmetaProvider);
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
    protected String getConditionBeanClassNameInternally() { return LdLibraryCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLibraryCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return LdSubQuery.class.getName(); }
}

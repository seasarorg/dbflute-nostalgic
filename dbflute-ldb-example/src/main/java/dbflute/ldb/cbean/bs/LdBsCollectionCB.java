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
 * The base condition-bean of COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsCollectionCB extends LdAbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();
    protected LdCollectionCQ _conditionQuery;

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
        return "COLLECTION";
    }

    public String getTableSqlName() {
        return "COLLECTION";
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
    public LdCollectionCQ query() {
        return getConditionQuery();
    }

    public LdCollectionCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdCollectionCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new LdUnionQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(LdUnionQuery<LdCollectionCB> unionQuery) {
        final LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdCollectionCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new LdUnionQuery&lt;LdCollectionCB&gt;() {
     *     public void query(LdCollectionCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(LdUnionQuery<LdCollectionCB> unionQuery) {
        final LdCollectionCB cb = new LdCollectionCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdCollectionCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============
    protected LdBookNss _nssBook;
    public LdBookNss getNssBook() {
        if (_nssBook == null) { _nssBook = new LdBookNss(null); }
        return _nssBook;
    }
    public LdBookNss setupSelect_Book() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryBook(); } });
        if (_nssBook == null || !_nssBook.hasConditionQuery())
        { _nssBook = new LdBookNss(query().queryBook()); }
        return _nssBook;
    }
    protected LdLibraryNss _nssLibrary;
    public LdLibraryNss getNssLibrary() {
        if (_nssLibrary == null) { _nssLibrary = new LdLibraryNss(null); }
        return _nssLibrary;
    }
    public LdLibraryNss setupSelect_Library() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryLibrary(); } });
        if (_nssLibrary == null || !_nssLibrary.hasConditionQuery())
        { _nssLibrary = new LdLibraryNss(query().queryLibrary()); }
        return _nssLibrary;
    }

    protected LdCollectionStatusNss _nssCollectionStatusAsOne;
    public LdCollectionStatusNss getNssCollectionStatusAsOne() {
        if (_nssCollectionStatusAsOne == null) { _nssCollectionStatusAsOne = new LdCollectionStatusNss(null); }
        return _nssCollectionStatusAsOne;
    }
    public LdCollectionStatusNss setupSelect_CollectionStatusAsOne() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryCollectionStatusAsOne(); } });
        if (_nssCollectionStatusAsOne == null || !_nssCollectionStatusAsOne.hasConditionQuery()) { _nssCollectionStatusAsOne = new LdCollectionStatusNss(query().queryCollectionStatusAsOne()); }
        return _nssCollectionStatusAsOne;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<LdCollectionCQ>() {
            public boolean has() { return true; } public LdCollectionCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<LdCollectionCQ> {
        protected SpQyCall<LdCollectionCQ> _myQyCall;
        protected LdBookCB.Specification _book;
        protected LdLibraryCB.Specification _library;
        protected LdCollectionStatusCB.Specification _collectionStatusAsOne;
        public Specification(LdConditionBean baseCB, SpQyCall<LdCollectionCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , LdDBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnCollectionId() { doColumn("COLLECTION_ID"); }
        public void columnLibraryId() { doColumn("LIBRARY_ID"); }
        public void columnBookId() { doColumn("BOOK_ID"); }
        public void columnArrivalDate() { doColumn("ARRIVAL_DATE"); }
        public void columnRUser() { doColumn("R_USER"); }
        public void columnRModule() { doColumn("R_MODULE"); }
        public void columnRTimestamp() { doColumn("R_TIMESTAMP"); }
        public void columnUUser() { doColumn("U_USER"); }
        public void columnUModule() { doColumn("U_MODULE"); }
        public void columnUTimestamp() { doColumn("U_TIMESTAMP"); }
        protected void doSpecifyRequiredColumn() {
            columnCollectionId();// PK
            if (_myQyCall.qy().hasConditionQueryBook()) {
                columnBookId();// FK
            }
            if (_myQyCall.qy().hasConditionQueryLibrary()) {
                columnLibraryId();// FK
            }
        }
        protected String getTableDbName() { return "COLLECTION"; }
        public LdBookCB.Specification specifyBook() {
            assertForeign("book");
            if (_book == null) {
                _book = new LdBookCB.Specification(_baseCB, new SpQyCall<LdBookCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryBook(); }
                    public LdBookCQ qy() { return _myQyCall.qy().queryBook(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _book;
        }
        public LdLibraryCB.Specification specifyLibrary() {
            assertForeign("library");
            if (_library == null) {
                _library = new LdLibraryCB.Specification(_baseCB, new SpQyCall<LdLibraryCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryLibrary(); }
                    public LdLibraryCQ qy() { return _myQyCall.qy().queryLibrary(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _library;
        }
        public LdCollectionStatusCB.Specification specifyCollectionStatusAsOne() {
            assertForeign("collectionStatusAsOne");
            if (_collectionStatusAsOne == null) {
                _collectionStatusAsOne = new LdCollectionStatusCB.Specification(_baseCB, new SpQyCall<LdCollectionStatusCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryCollectionStatusAsOne(); }
                    public LdCollectionStatusCQ qy() { return _myQyCall.qy().queryCollectionStatusAsOne(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _collectionStatusAsOne;
        }
        public RAFunction<LdLendingCollectionCB, LdCollectionCQ> derivedLendingCollectionList() {
            return new RAFunction<LdLendingCollectionCB, LdCollectionCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<LdLendingCollectionCB, LdCollectionCQ>() {
                public void setup(String function, LdSubQuery<LdLendingCollectionCB> subQuery, LdCollectionCQ cq, String aliasName) {
                    cq.xsderiveLendingCollectionList(function, subQuery, aliasName); } }, _dbmetaProvider);
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
    protected String getConditionBeanClassNameInternally() { return LdCollectionCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdCollectionCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return LdSubQuery.class.getName(); }
}

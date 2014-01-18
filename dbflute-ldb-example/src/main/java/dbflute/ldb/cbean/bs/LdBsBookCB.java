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
 * The base condition-bean of BOOK.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBookCB extends LdAbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();
    protected LdBookCQ _conditionQuery;

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
        return "BOOK";
    }

    public String getTableSqlName() {
        return "BOOK";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        assertPrimaryKeyMap(primaryKeyMap);
        {
            Object obj = primaryKeyMap.get("BOOK_ID");
            if (obj instanceof Integer) {
                query().setBookId_Equal((Integer)obj);
            } else {
                query().setBookId_Equal(new Integer((String)obj));
            }
        }

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public LdConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_BookId_Asc();
        return this;
    }

    public LdConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_BookId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public LdBookCQ query() {
        return getConditionQuery();
    }

    public LdBookCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdBookCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new LdUnionQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(LdUnionQuery<LdBookCB> unionQuery) {
        final LdBookCB cb = new LdBookCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdBookCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new LdUnionQuery&lt;LdBookCB&gt;() {
     *     public void query(LdBookCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(LdUnionQuery<LdBookCB> unionQuery) {
        final LdBookCB cb = new LdBookCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdBookCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============
    protected LdAuthorNss _nssAuthor;
    public LdAuthorNss getNssAuthor() {
        if (_nssAuthor == null) { _nssAuthor = new LdAuthorNss(null); }
        return _nssAuthor;
    }
    public LdAuthorNss setupSelect_Author() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryAuthor(); } });
        if (_nssAuthor == null || !_nssAuthor.hasConditionQuery())
        { _nssAuthor = new LdAuthorNss(query().queryAuthor()); }
        return _nssAuthor;
    }
    protected LdGenreNss _nssGenre;
    public LdGenreNss getNssGenre() {
        if (_nssGenre == null) { _nssGenre = new LdGenreNss(null); }
        return _nssGenre;
    }
    public LdGenreNss setupSelect_Genre() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryGenre(); } });
        if (_nssGenre == null || !_nssGenre.hasConditionQuery())
        { _nssGenre = new LdGenreNss(query().queryGenre()); }
        return _nssGenre;
    }
    protected LdPublisherNss _nssPublisher;
    public LdPublisherNss getNssPublisher() {
        if (_nssPublisher == null) { _nssPublisher = new LdPublisherNss(null); }
        return _nssPublisher;
    }
    public LdPublisherNss setupSelect_Publisher() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryPublisher(); } });
        if (_nssPublisher == null || !_nssPublisher.hasConditionQuery())
        { _nssPublisher = new LdPublisherNss(query().queryPublisher()); }
        return _nssPublisher;
    }
    protected LdCollectionStatusLookupNss _nssCollectionStatusLookupAsNonExist;
    public LdCollectionStatusLookupNss getNssCollectionStatusLookupAsNonExist() {
        if (_nssCollectionStatusLookupAsNonExist == null) { _nssCollectionStatusLookupAsNonExist = new LdCollectionStatusLookupNss(null); }
        return _nssCollectionStatusLookupAsNonExist;
    }
    public LdCollectionStatusLookupNss setupSelect_CollectionStatusLookupAsNonExist() {
        doSetupSelect(new SsCall() { public LdConditionQuery qf() { return query().queryCollectionStatusLookupAsNonExist(); } });
        if (_nssCollectionStatusLookupAsNonExist == null || !_nssCollectionStatusLookupAsNonExist.hasConditionQuery())
        { _nssCollectionStatusLookupAsNonExist = new LdCollectionStatusLookupNss(query().queryCollectionStatusLookupAsNonExist()); }
        return _nssCollectionStatusLookupAsNonExist;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<LdBookCQ>() {
            public boolean has() { return true; } public LdBookCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<LdBookCQ> {
        protected SpQyCall<LdBookCQ> _myQyCall;
        protected LdAuthorCB.Specification _author;
        protected LdGenreCB.Specification _genre;
        protected LdPublisherCB.Specification _publisher;
        protected LdCollectionStatusLookupCB.Specification _collectionStatusLookupAsNonExist;
        public Specification(LdConditionBean baseCB, SpQyCall<LdBookCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , LdDBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnBookId() { doColumn("BOOK_ID"); }
        public void columnIsbn() { doColumn("ISBN"); }
        public void columnBookName() { doColumn("BOOK_NAME"); }
        public void columnAuthorId() { doColumn("AUTHOR_ID"); }
        public void columnPublisherId() { doColumn("PUBLISHER_ID"); }
        public void columnGenreCode() { doColumn("GENRE_CODE"); }
        public void columnOpeningPart() { doColumn("OPENING_PART"); }
        public void columnMaxLendingDateCount() { doColumn("MAX_LENDING_DATE_COUNT"); }
        public void columnOutOfUserSelectYn() { doColumn("OUT_OF_USER_SELECT_YN"); }
        public void columnOutOfUserSelectReason() { doColumn("OUT_OF_USER_SELECT_REASON"); }
        public void columnRUser() { doColumn("R_USER"); }
        public void columnRModule() { doColumn("R_MODULE"); }
        public void columnRTimestamp() { doColumn("R_TIMESTAMP"); }
        public void columnUUser() { doColumn("U_USER"); }
        public void columnUModule() { doColumn("U_MODULE"); }
        public void columnUTimestamp() { doColumn("U_TIMESTAMP"); }
        protected void doSpecifyRequiredColumn() {
            columnBookId();// PK
            if (_myQyCall.qy().hasConditionQueryAuthor()) {
                columnAuthorId();// FK
            }
            if (_myQyCall.qy().hasConditionQueryGenre()) {
                columnGenreCode();// FK
            }
            if (_myQyCall.qy().hasConditionQueryPublisher()) {
                columnPublisherId();// FK
            }
            if (_myQyCall.qy().hasConditionQueryCollectionStatusLookupAsNonExist()) {
                columnGenreCode();// FK
            }
        }
        protected String getTableDbName() { return "BOOK"; }
        public LdAuthorCB.Specification specifyAuthor() {
            assertForeign("author");
            if (_author == null) {
                _author = new LdAuthorCB.Specification(_baseCB, new SpQyCall<LdAuthorCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryAuthor(); }
                    public LdAuthorCQ qy() { return _myQyCall.qy().queryAuthor(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _author;
        }
        public LdGenreCB.Specification specifyGenre() {
            assertForeign("genre");
            if (_genre == null) {
                _genre = new LdGenreCB.Specification(_baseCB, new SpQyCall<LdGenreCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryGenre(); }
                    public LdGenreCQ qy() { return _myQyCall.qy().queryGenre(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _genre;
        }
        public LdPublisherCB.Specification specifyPublisher() {
            assertForeign("publisher");
            if (_publisher == null) {
                _publisher = new LdPublisherCB.Specification(_baseCB, new SpQyCall<LdPublisherCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryPublisher(); }
                    public LdPublisherCQ qy() { return _myQyCall.qy().queryPublisher(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _publisher;
        }
        public LdCollectionStatusLookupCB.Specification specifyCollectionStatusLookupAsNonExist() {
            assertForeign("collectionStatusLookupAsNonExist");
            if (_collectionStatusLookupAsNonExist == null) {
                _collectionStatusLookupAsNonExist = new LdCollectionStatusLookupCB.Specification(_baseCB, new SpQyCall<LdCollectionStatusLookupCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryCollectionStatusLookupAsNonExist(); }
                    public LdCollectionStatusLookupCQ qy() { return _myQyCall.qy().queryCollectionStatusLookupAsNonExist(); } }
                    , _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, _dbmetaProvider);
            }
            return _collectionStatusLookupAsNonExist;
        }
        public RAFunction<LdCollectionCB, LdBookCQ> derivedCollectionList() {
            return new RAFunction<LdCollectionCB, LdBookCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<LdCollectionCB, LdBookCQ>() {
                public void setup(String function, LdSubQuery<LdCollectionCB> subQuery, LdBookCQ cq, String aliasName) {
                    cq.xsderiveCollectionList(function, subQuery, aliasName); } }, _dbmetaProvider);
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
    protected String getConditionBeanClassNameInternally() { return LdBookCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdBookCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return LdSubQuery.class.getName(); }
}

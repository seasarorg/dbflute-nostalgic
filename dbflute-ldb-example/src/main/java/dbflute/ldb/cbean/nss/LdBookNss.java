/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.cbean.cq.LdBookCQ;

/**
 * The nest select set-upper of BOOK.
 * @author DBFlute(AutoGenerator)
 */
public class LdBookNss {

    protected LdBookCQ _query;
    public LdBookNss(LdBookCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public LdAuthorNss withAuthor() {
        _query.doNss(new LdBookCQ.NssCall() { public LdConditionQuery qf() { return _query.queryAuthor(); }});
		return new LdAuthorNss(_query.queryAuthor());
    }
    public LdGenreNss withGenre() {
        _query.doNss(new LdBookCQ.NssCall() { public LdConditionQuery qf() { return _query.queryGenre(); }});
		return new LdGenreNss(_query.queryGenre());
    }
    public LdPublisherNss withPublisher() {
        _query.doNss(new LdBookCQ.NssCall() { public LdConditionQuery qf() { return _query.queryPublisher(); }});
		return new LdPublisherNss(_query.queryPublisher());
    }
    public LdCollectionStatusLookupNss withCollectionStatusLookupAsNonExist() {
        _query.doNss(new LdBookCQ.NssCall() { public LdConditionQuery qf() { return _query.queryCollectionStatusLookupAsNonExist(); }});
		return new LdCollectionStatusLookupNss(_query.queryCollectionStatusLookupAsNonExist());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

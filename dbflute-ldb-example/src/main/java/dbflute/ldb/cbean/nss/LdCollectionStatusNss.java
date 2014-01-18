/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.cbean.cq.LdCollectionStatusCQ;

/**
 * The nest select set-upper of COLLECTION_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionStatusNss {

    protected LdCollectionStatusCQ _query;
    public LdCollectionStatusNss(LdCollectionStatusCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public LdCollectionNss withCollection() {
        _query.doNss(new LdCollectionStatusCQ.NssCall() { public LdConditionQuery qf() { return _query.queryCollection(); }});
		return new LdCollectionNss(_query.queryCollection());
    }
    public LdCollectionStatusLookupNss withCollectionStatusLookup() {
        _query.doNss(new LdCollectionStatusCQ.NssCall() { public LdConditionQuery qf() { return _query.queryCollectionStatusLookup(); }});
		return new LdCollectionStatusLookupNss(_query.queryCollectionStatusLookup());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

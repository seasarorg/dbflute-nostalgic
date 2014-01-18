/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.cbean.cq.LdCollectionStatusLookupCQ;

/**
 * The nest select set-upper of COLLECTION_STATUS_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionStatusLookupNss {

    protected LdCollectionStatusLookupCQ _query;
    public LdCollectionStatusLookupNss(LdCollectionStatusLookupCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

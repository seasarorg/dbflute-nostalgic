/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.cbean.cq.LdPublisherCQ;

/**
 * The nest select set-upper of PUBLISHER.
 * @author DBFlute(AutoGenerator)
 */
public class LdPublisherNss {

    protected LdPublisherCQ _query;
    public LdPublisherNss(LdPublisherCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

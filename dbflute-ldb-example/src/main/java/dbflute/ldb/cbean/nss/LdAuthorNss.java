/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.cbean.cq.LdAuthorCQ;

/**
 * The nest select set-upper of AUTHOR.
 * @author DBFlute(AutoGenerator)
 */
public class LdAuthorNss {

    protected LdAuthorCQ _query;
    public LdAuthorNss(LdAuthorCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

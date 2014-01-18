/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.cbean.cq.LdGarbageCQ;

/**
 * The nest select set-upper of GARBAGE.
 * @author DBFlute(AutoGenerator)
 */
public class LdGarbageNss {

    protected LdGarbageCQ _query;
    public LdGarbageNss(LdGarbageCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

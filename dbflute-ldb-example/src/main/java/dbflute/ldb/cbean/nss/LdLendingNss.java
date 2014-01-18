/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.cbean.cq.LdLendingCQ;

/**
 * The nest select set-upper of LENDING.
 * @author DBFlute(AutoGenerator)
 */
public class LdLendingNss {

    protected LdLendingCQ _query;
    public LdLendingNss(LdLendingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public LdLibraryUserNss withLibraryUser() {
        _query.doNss(new LdLendingCQ.NssCall() { public LdConditionQuery qf() { return _query.queryLibraryUser(); }});
		return new LdLibraryUserNss(_query.queryLibraryUser());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

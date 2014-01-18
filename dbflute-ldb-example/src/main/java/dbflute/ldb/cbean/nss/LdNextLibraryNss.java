/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.cbean.cq.LdNextLibraryCQ;

/**
 * The nest select set-upper of NEXT_LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public class LdNextLibraryNss {

    protected LdNextLibraryCQ _query;
    public LdNextLibraryNss(LdNextLibraryCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public LdLibraryNss withLibraryByNextId() {
        _query.doNss(new LdNextLibraryCQ.NssCall() { public LdConditionQuery qf() { return _query.queryLibraryByNextId(); }});
		return new LdLibraryNss(_query.queryLibraryByNextId());
    }
    public LdLibraryNss withLibraryByBaseId() {
        _query.doNss(new LdNextLibraryCQ.NssCall() { public LdConditionQuery qf() { return _query.queryLibraryByBaseId(); }});
		return new LdLibraryNss(_query.queryLibraryByBaseId());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

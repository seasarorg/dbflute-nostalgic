/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.cbean.cq.LdLendingCollectionCQ;

/**
 * The nest select set-upper of LENDING_COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdLendingCollectionNss {

    protected LdLendingCollectionCQ _query;
    public LdLendingCollectionNss(LdLendingCollectionCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public LdCollectionNss withCollection() {
        _query.doNss(new LdLendingCollectionCQ.NssCall() { public LdConditionQuery qf() { return _query.queryCollection(); }});
		return new LdCollectionNss(_query.queryCollection());
    }
    public LdLendingNss withLending() {
        _query.doNss(new LdLendingCollectionCQ.NssCall() { public LdConditionQuery qf() { return _query.queryLending(); }});
		return new LdLendingNss(_query.queryLending());
    }
    public LdLibraryUserNss withLibraryUser() {
        _query.doNss(new LdLendingCollectionCQ.NssCall() { public LdConditionQuery qf() { return _query.queryLibraryUser(); }});
		return new LdLibraryUserNss(_query.queryLibraryUser());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

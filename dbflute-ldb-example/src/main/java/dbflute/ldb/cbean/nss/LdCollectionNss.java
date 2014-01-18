/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.cbean.cq.LdCollectionCQ;

/**
 * The nest select set-upper of COLLECTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionNss {

    protected LdCollectionCQ _query;
    public LdCollectionNss(LdCollectionCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public LdBookNss withBook() {
        _query.doNss(new LdCollectionCQ.NssCall() { public LdConditionQuery qf() { return _query.queryBook(); }});
		return new LdBookNss(_query.queryBook());
    }
    public LdLibraryNss withLibrary() {
        _query.doNss(new LdCollectionCQ.NssCall() { public LdConditionQuery qf() { return _query.queryLibrary(); }});
		return new LdLibraryNss(_query.queryLibrary());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
    public LdCollectionStatusNss withCollectionStatusAsOne() {
        _query.doNss(new LdCollectionCQ.NssCall() { public LdConditionQuery qf() { return _query.queryCollectionStatusAsOne(); }});
		return new LdCollectionStatusNss(_query.queryCollectionStatusAsOne());
    }
}

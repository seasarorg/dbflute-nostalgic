/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.cbean.cq.LdLibraryUserCQ;

/**
 * The nest select set-upper of LIBRARY_USER.
 * @author DBFlute(AutoGenerator)
 */
public class LdLibraryUserNss {

    protected LdLibraryUserCQ _query;
    public LdLibraryUserNss(LdLibraryUserCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public LdLbUserNss withLbUser() {
        _query.doNss(new LdLibraryUserCQ.NssCall() { public LdConditionQuery qf() { return _query.queryLbUser(); }});
		return new LdLbUserNss(_query.queryLbUser());
    }
    public LdLibraryNss withLibrary() {
        _query.doNss(new LdLibraryUserCQ.NssCall() { public LdConditionQuery qf() { return _query.queryLibrary(); }});
		return new LdLibraryNss(_query.queryLibrary());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

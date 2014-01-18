/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.cbean.cq.LdLibraryCQ;

/**
 * The nest select set-upper of LIBRARY.
 * @author DBFlute(AutoGenerator)
 */
public class LdLibraryNss {

    protected LdLibraryCQ _query;
    public LdLibraryNss(LdLibraryCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public LdLibraryTypeLookupNss withLibraryTypeLookup() {
        _query.doNss(new LdLibraryCQ.NssCall() { public LdConditionQuery qf() { return _query.queryLibraryTypeLookup(); }});
		return new LdLibraryTypeLookupNss(_query.queryLibraryTypeLookup());
    }
    public LdNextLibraryNss withNextLibraryAsNext(final Integer nextLibraryId) {
        _query.doNss(new LdLibraryCQ.NssCall() { public LdConditionQuery qf() { return _query.queryNextLibraryAsNext(nextLibraryId); }});
		return new LdNextLibraryNss(_query.queryNextLibraryAsNext(nextLibraryId));
    }
    public LdLibraryUserNss withLibraryUserAsUser(final Integer userId, final String secondString, final java.util.List<Integer> thirdList) {
        _query.doNss(new LdLibraryCQ.NssCall() { public LdConditionQuery qf() { return _query.queryLibraryUserAsUser(userId, secondString, thirdList); }});
		return new LdLibraryUserNss(_query.queryLibraryUserAsUser(userId, secondString, thirdList));
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

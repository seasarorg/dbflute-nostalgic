/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.cbean.cq.LdGenreCQ;

/**
 * The nest select set-upper of GENRE.
 * @author DBFlute(AutoGenerator)
 */
public class LdGenreNss {

    protected LdGenreCQ _query;
    public LdGenreNss(LdGenreCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public LdGenreNss withGenreSelf() {
        _query.doNss(new LdGenreCQ.NssCall() { public LdConditionQuery qf() { return _query.queryGenreSelf(); }});
		return new LdGenreNss(_query.queryGenreSelf());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

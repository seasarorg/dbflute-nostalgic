/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.cbean.cq.LdBlackListCQ;

/**
 * The nest select set-upper of BLACK_LIST.
 * @author DBFlute(AutoGenerator)
 */
public class LdBlackListNss {

    protected LdBlackListCQ _query;
    public LdBlackListNss(LdBlackListCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public LdLbUserNss withLbUser() {
        _query.doNss(new LdBlackListCQ.NssCall() { public LdConditionQuery qf() { return _query.queryLbUser(); }});
		return new LdLbUserNss(_query.queryLbUser());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

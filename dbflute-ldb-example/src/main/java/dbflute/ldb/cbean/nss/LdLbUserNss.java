/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.cbean.cq.LdLbUserCQ;

/**
 * The nest select set-upper of LB_USER.
 * @author DBFlute(AutoGenerator)
 */
public class LdLbUserNss {

    protected LdLbUserCQ _query;
    public LdLbUserNss(LdLbUserCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
    public LdBlackListNss withBlackListAsOne() {
        _query.doNss(new LdLbUserCQ.NssCall() { public LdConditionQuery qf() { return _query.queryBlackListAsOne(); }});
		return new LdBlackListNss(_query.queryBlackListAsOne());
    }
}

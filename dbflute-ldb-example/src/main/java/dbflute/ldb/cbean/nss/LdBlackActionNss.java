/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.nss;

import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.cbean.cq.LdBlackActionCQ;

/**
 * The nest select set-upper of BLACK_ACTION.
 * @author DBFlute(AutoGenerator)
 */
public class LdBlackActionNss {

    protected LdBlackActionCQ _query;
    public LdBlackActionNss(LdBlackActionCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public LdBlackActionLookupNss withBlackActionLookup() {
        _query.doNss(new LdBlackActionCQ.NssCall() { public LdConditionQuery qf() { return _query.queryBlackActionLookup(); }});
		return new LdBlackActionLookupNss(_query.queryBlackActionLookup());
    }
    public LdBlackListNss withBlackList() {
        _query.doNss(new LdBlackActionCQ.NssCall() { public LdConditionQuery qf() { return _query.queryBlackList(); }});
		return new LdBlackListNss(_query.queryBlackList());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

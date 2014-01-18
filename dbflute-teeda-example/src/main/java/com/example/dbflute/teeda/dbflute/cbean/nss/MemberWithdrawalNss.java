package com.example.dbflute.teeda.dbflute.cbean.nss;

import com.example.dbflute.teeda.dbflute.allcommon.cbean.ConditionQuery;
import com.example.dbflute.teeda.dbflute.cbean.cq.MemberWithdrawalCQ;

/**
 * The nest select set-upper of MEMBER_WITHDRAWAL.
 * @author DBFlute(AutoGenerator)
 */
public class MemberWithdrawalNss {

    protected MemberWithdrawalCQ _query;
    public MemberWithdrawalNss(MemberWithdrawalCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public MemberNss withMember() {
        _query.doNss(new MemberWithdrawalCQ.NssCall() { public ConditionQuery qf() { return _query.queryMember(); }});
		return new MemberNss(_query.queryMember());
    }
    public WithdrawalReasonNss withWithdrawalReason() {
        _query.doNss(new MemberWithdrawalCQ.NssCall() { public ConditionQuery qf() { return _query.queryWithdrawalReason(); }});
		return new WithdrawalReasonNss(_query.queryWithdrawalReason());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

package com.example.dbflute.slim3.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.slim3.dbflute.cbean.cq.MemberAddressCQ;

/**
 * The nest select set-upper of MEMBER_ADDRESS.
 * @author DBFlute(AutoGenerator)
 */
public class MemberAddressNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberAddressCQ _query;
    public MemberAddressNss(MemberAddressCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public MemberNss withMember() {
        _query.doNss(new MemberAddressCQ.NssCall() { public ConditionQuery qf() { return _query.queryMember(); }});
		return new MemberNss(_query.queryMember());
    }

}

package com.example.dbflute.teeda.dbflute.cbean.nss;

import com.example.dbflute.teeda.dbflute.allcommon.cbean.ConditionQuery;
import com.example.dbflute.teeda.dbflute.cbean.cq.PurchaseCQ;

/**
 * The nest select set-upper of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
public class PurchaseNss {

    protected PurchaseCQ _query;
    public PurchaseNss(PurchaseCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public MemberNss withMember() {
        _query.doNss(new PurchaseCQ.NssCall() { public ConditionQuery qf() { return _query.queryMember(); }});
		return new MemberNss(_query.queryMember());
    }
    public ProductNss withProduct() {
        _query.doNss(new PurchaseCQ.NssCall() { public ConditionQuery qf() { return _query.queryProduct(); }});
		return new ProductNss(_query.queryProduct());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}

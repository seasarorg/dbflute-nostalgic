package com.example.dbflute.buri.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.buri.dbflute.cbean.cq.BuriBranchCQ;

/**
 * The nest select set-upper of BURIBRANCH.
 * @author DBFlute(AutoGenerator)
 */
public class BuriBranchNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriBranchCQ _query;
    public BuriBranchNss(BuriBranchCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public BuriDataNss withBuriData() {
        _query.doNss(new BuriBranchCQ.NssCall() { public ConditionQuery qf() { return _query.queryBuriData(); }});
		return new BuriDataNss(_query.queryBuriData());
    }
    public BuriPathNss withBuriPath() {
        _query.doNss(new BuriBranchCQ.NssCall() { public ConditionQuery qf() { return _query.queryBuriPath(); }});
		return new BuriPathNss(_query.queryBuriPath());
    }

}

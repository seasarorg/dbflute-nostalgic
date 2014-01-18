package com.example.dbflute.buri.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.buri.dbflute.cbean.cq.BuriStateCQ;

/**
 * The nest select set-upper of BURISTATE.
 * @author DBFlute(AutoGenerator)
 */
public class BuriStateNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriStateCQ _query;
    public BuriStateNss(BuriStateCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public BuriPathNss withBuriPath() {
        _query.doNss(new BuriStateCQ.NssCall() { public ConditionQuery qf() { return _query.queryBuriPath(); }});
		return new BuriPathNss(_query.queryBuriPath());
    }
    public BuriDataNss withBuriData() {
        _query.doNss(new BuriStateCQ.NssCall() { public ConditionQuery qf() { return _query.queryBuriData(); }});
		return new BuriDataNss(_query.queryBuriData());
    }
    public BuriBranchNss withBuriBranch() {
        _query.doNss(new BuriStateCQ.NssCall() { public ConditionQuery qf() { return _query.queryBuriBranch(); }});
		return new BuriBranchNss(_query.queryBuriBranch());
    }

}

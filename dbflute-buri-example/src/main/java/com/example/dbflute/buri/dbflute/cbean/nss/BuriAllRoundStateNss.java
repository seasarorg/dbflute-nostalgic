package com.example.dbflute.buri.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.buri.dbflute.cbean.cq.BuriAllRoundStateCQ;

/**
 * The nest select set-upper of BURI_ALL_ROUND_STATE.
 * @author DBFlute(AutoGenerator)
 */
public class BuriAllRoundStateNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriAllRoundStateCQ _query;
    public BuriAllRoundStateNss(BuriAllRoundStateCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public DocumentNss withDocument() {
        _query.doNss(new BuriAllRoundStateCQ.NssCall() { public ConditionQuery qf() { return _query.queryDocument(); }});
		return new DocumentNss(_query.queryDocument());
    }

}

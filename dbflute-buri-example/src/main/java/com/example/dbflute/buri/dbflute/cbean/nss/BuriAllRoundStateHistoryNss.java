package com.example.dbflute.buri.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.buri.dbflute.cbean.cq.BuriAllRoundStateHistoryCQ;

/**
 * The nest select set-upper of BURI_ALL_ROUND_STATE_HISTORY.
 * @author DBFlute(AutoGenerator)
 */
public class BuriAllRoundStateHistoryNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriAllRoundStateHistoryCQ _query;
    public BuriAllRoundStateHistoryNss(BuriAllRoundStateHistoryCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public DocumentNss withDocument_文書管理_文書公開() {
        _query.doNss(new BuriAllRoundStateHistoryCQ.NssCall() { public ConditionQuery qf() { return _query.queryDocument_文書管理_文書公開(); }});
		return new DocumentNss(_query.queryDocument_文書管理_文書公開());
    }

}

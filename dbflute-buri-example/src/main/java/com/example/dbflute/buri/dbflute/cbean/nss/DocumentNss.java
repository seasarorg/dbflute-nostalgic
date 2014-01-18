package com.example.dbflute.buri.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.buri.dbflute.cbean.cq.DocumentCQ;

/**
 * The nest select set-upper of DOCUMENT.
 * @author DBFlute(AutoGenerator)
 */
public class DocumentNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DocumentCQ _query;
    public DocumentNss(DocumentCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public BuriAllRoundStateNss withBuriAllRoundState_文書管理_文書公開() {
        _query.doNss(new DocumentCQ.NssCall() { public ConditionQuery qf() { return _query.queryBuriAllRoundState_文書管理_文書公開(); }});
		return new BuriAllRoundStateNss(_query.queryBuriAllRoundState_文書管理_文書公開());
    }

}

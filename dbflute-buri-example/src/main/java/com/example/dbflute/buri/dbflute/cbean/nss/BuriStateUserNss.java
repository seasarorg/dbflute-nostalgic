package com.example.dbflute.buri.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.buri.dbflute.cbean.cq.BuriStateUserCQ;

/**
 * The nest select set-upper of BURISTATEUSER.
 * @author DBFlute(AutoGenerator)
 */
public class BuriStateUserNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriStateUserCQ _query;
    public BuriStateUserNss(BuriStateUserCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public BuriStateNss withBuriState() {
        _query.doNss(new BuriStateUserCQ.NssCall() { public ConditionQuery qf() { return _query.queryBuriState(); }});
		return new BuriStateNss(_query.queryBuriState());
    }
    public BuriUserNss withBuriUser() {
        _query.doNss(new BuriStateUserCQ.NssCall() { public ConditionQuery qf() { return _query.queryBuriUser(); }});
		return new BuriUserNss(_query.queryBuriUser());
    }

}

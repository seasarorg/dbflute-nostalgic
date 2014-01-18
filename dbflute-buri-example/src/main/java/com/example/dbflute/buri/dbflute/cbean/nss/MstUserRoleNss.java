package com.example.dbflute.buri.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.buri.dbflute.cbean.cq.MstUserRoleCQ;

/**
 * The nest select set-upper of MST_USER_ROLE.
 * @author DBFlute(AutoGenerator)
 */
public class MstUserRoleNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MstUserRoleCQ _query;
    public MstUserRoleNss(MstUserRoleCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    public MstRoleNss withMstRole() {
        _query.doNss(new MstUserRoleCQ.NssCall() { public ConditionQuery qf() { return _query.queryMstRole(); }});
		return new MstRoleNss(_query.queryMstRole());
    }
    public MstUserNss withMstUser() {
        _query.doNss(new MstUserRoleCQ.NssCall() { public ConditionQuery qf() { return _query.queryMstUser(); }});
		return new MstUserNss(_query.queryMstUser());
    }

}

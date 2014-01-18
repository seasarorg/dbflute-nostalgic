package com.example.dbflute.buri.dbflute.cbean.cq.ciq;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.buri.dbflute.cbean.*;
import com.example.dbflute.buri.dbflute.cbean.cq.bs.*;
import com.example.dbflute.buri.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of BURIUSER.
 * @author DBFlute(AutoGenerator)
 */
public class BuriUserCIQ extends AbstractBsBuriUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBuriUserCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BuriUserCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBuriUserCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq) {
        String msg = "InlineView must not need UNION method: " + bq + " : " + uq;
        throw new IllegalConditionBeanOperationException(msg);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col) {
        regIQ(k, v, cv, col);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op) {
        regIQ(k, v, cv, col, op);
    }

    @Override
    protected void registerWhereClause(String wc) {
        registerInlineWhereClause(wc);
    }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) {
            throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported.");
        }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueBuriUserId() { return _myCQ.getBuriUserId(); }
    public String keepBuriUserId_ExistsReferrer_BuriStateUserList(BuriStateUserCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBuriUserId_NotExistsReferrer_BuriStateUserList(BuriStateUserCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBuriUserId_InScopeRelation_BuriStateUserList(BuriStateUserCQ sq)
    { return _myCQ.keepBuriUserId_InScopeRelation_BuriStateUserList(sq); }
    public String keepBuriUserId_NotInScopeRelation_BuriStateUserList(BuriStateUserCQ sq)
    { return _myCQ.keepBuriUserId_NotInScopeRelation_BuriStateUserList(sq); }
    public String keepBuriUserId_SpecifyDerivedReferrer_BuriStateUserList(BuriStateUserCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBuriUserId_QueryDerivedReferrer_BuriStateUserList(BuriStateUserCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBuriUserId_QueryDerivedReferrer_BuriStateUserListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueUserIdVal() { return _myCQ.getUserIdVal(); }
    protected ConditionValue getCValueUserIdNum() { return _myCQ.getUserIdNum(); }
    public String keepScalarCondition(BuriUserCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BuriUserCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BuriUserCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BuriUserCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(BuriUserCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BuriUserCB.class.getName(); }
    protected String xinCQ() { return BuriUserCQ.class.getName(); }
}

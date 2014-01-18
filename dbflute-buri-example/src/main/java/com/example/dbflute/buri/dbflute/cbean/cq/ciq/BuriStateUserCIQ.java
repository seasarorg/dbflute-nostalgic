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
 * The condition-query for in-line of BURISTATEUSER.
 * @author DBFlute(AutoGenerator)
 */
public class BuriStateUserCIQ extends AbstractBsBuriStateUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBuriStateUserCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BuriStateUserCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBuriStateUserCQ myCQ) {
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
    protected ConditionValue getCValueStateUserId() { return _myCQ.getStateUserId(); }
    protected ConditionValue getCValueStateId() { return _myCQ.getStateId(); }
    public String keepStateId_InScopeRelation_BuriState(BuriStateCQ sq)
    { return _myCQ.keepStateId_InScopeRelation_BuriState(sq); }
    public String keepStateId_NotInScopeRelation_BuriState(BuriStateCQ sq)
    { return _myCQ.keepStateId_NotInScopeRelation_BuriState(sq); }
    protected ConditionValue getCValueBuriUserId() { return _myCQ.getBuriUserId(); }
    public String keepBuriUserId_InScopeRelation_BuriUser(BuriUserCQ sq)
    { return _myCQ.keepBuriUserId_InScopeRelation_BuriUser(sq); }
    public String keepBuriUserId_NotInScopeRelation_BuriUser(BuriUserCQ sq)
    { return _myCQ.keepBuriUserId_NotInScopeRelation_BuriUser(sq); }
    protected ConditionValue getCValueInsertDate() { return _myCQ.getInsertDate(); }
    protected ConditionValue getCValueDeleteDate() { return _myCQ.getDeleteDate(); }
    public String keepScalarCondition(BuriStateUserCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BuriStateUserCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BuriStateUserCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BuriStateUserCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(BuriStateUserCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BuriStateUserCB.class.getName(); }
    protected String xinCQ() { return BuriStateUserCQ.class.getName(); }
}

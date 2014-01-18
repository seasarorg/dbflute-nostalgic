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
 * The condition-query for in-line of BURISTATEUNDOLOG.
 * @author DBFlute(AutoGenerator)
 */
public class BuriStateUndoLogCIQ extends AbstractBsBuriStateUndoLogCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBuriStateUndoLogCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BuriStateUndoLogCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBuriStateUndoLogCQ myCQ) {
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
    protected ConditionValue getCValueStateUndoLogId() { return _myCQ.getStateUndoLogId(); }
    protected ConditionValue getCValueStateId() { return _myCQ.getStateId(); }
    protected ConditionValue getCValueBranchId() { return _myCQ.getBranchId(); }
    protected ConditionValue getCValuePathId() { return _myCQ.getPathId(); }
    protected ConditionValue getCValueDataId() { return _myCQ.getDataId(); }
    protected ConditionValue getCValueUserIdVal() { return _myCQ.getUserIdVal(); }
    protected ConditionValue getCValueAutoRunTime() { return _myCQ.getAutoRunTime(); }
    protected ConditionValue getCValueUserIdNum() { return _myCQ.getUserIdNum(); }
    protected ConditionValue getCValueInsertDate() { return _myCQ.getInsertDate(); }
    protected ConditionValue getCValueBtid() { return _myCQ.getBtid(); }
    protected ConditionValue getCValueProcessDate() { return _myCQ.getProcessDate(); }
    protected ConditionValue getCValueAbortDate() { return _myCQ.getAbortDate(); }
    protected ConditionValue getCValueVersionNo() { return _myCQ.getVersionNo(); }
    protected ConditionValue getCValueCreateBtid() { return _myCQ.getCreateBtid(); }
    public String keepScalarCondition(BuriStateUndoLogCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BuriStateUndoLogCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BuriStateUndoLogCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BuriStateUndoLogCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(BuriStateUndoLogCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BuriStateUndoLogCB.class.getName(); }
    protected String xinCQ() { return BuriStateUndoLogCQ.class.getName(); }
}

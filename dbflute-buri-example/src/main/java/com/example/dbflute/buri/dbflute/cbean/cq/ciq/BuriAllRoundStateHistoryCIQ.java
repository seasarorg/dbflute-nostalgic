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
 * The condition-query for in-line of BURI_ALL_ROUND_STATE_HISTORY.
 * @author DBFlute(AutoGenerator)
 */
public class BuriAllRoundStateHistoryCIQ extends AbstractBsBuriAllRoundStateHistoryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBuriAllRoundStateHistoryCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BuriAllRoundStateHistoryCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBuriAllRoundStateHistoryCQ myCQ) {
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
    protected ConditionValue getCValueInternalStateId() { return _myCQ.getInternalStateId(); }
    protected ConditionValue getCValueStatusUpdateDatetime() { return _myCQ.getStatusUpdateDatetime(); }
    protected ConditionValue getCValueParticipantName() { return _myCQ.getParticipantName(); }
    protected ConditionValue getCValueParticipantType() { return _myCQ.getParticipantType(); }
    protected ConditionValue getCValueInternalPathId() { return _myCQ.getInternalPathId(); }
    protected ConditionValue getCValueStatusPathName() { return _myCQ.getStatusPathName(); }
    protected ConditionValue getCValueInternalDataId() { return _myCQ.getInternalDataId(); }
    protected ConditionValue getCValueInternalPkValue() { return _myCQ.getInternalPkValue(); }
    protected ConditionValue getCValueInternalDataType() { return _myCQ.getInternalDataType(); }
    protected ConditionValue getCValueInternalUserId() { return _myCQ.getInternalUserId(); }
    protected ConditionValue getCValueStatusUpdateUser() { return _myCQ.getStatusUpdateUser(); }

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BuriAllRoundStateHistoryCB.class.getName(); }
    protected String xinCQ() { return BuriAllRoundStateHistoryCQ.class.getName(); }
}

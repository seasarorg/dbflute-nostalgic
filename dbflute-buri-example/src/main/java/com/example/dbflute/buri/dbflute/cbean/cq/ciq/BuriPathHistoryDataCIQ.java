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
 * The condition-query for in-line of BURIPATHHISTORYDATA.
 * @author DBFlute(AutoGenerator)
 */
public class BuriPathHistoryDataCIQ extends AbstractBsBuriPathHistoryDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBuriPathHistoryDataCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BuriPathHistoryDataCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBuriPathHistoryDataCQ myCQ) {
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
    protected ConditionValue getCValuePathId() { return _myCQ.getPathId(); }
    protected ConditionValue getCValuePathName() { return _myCQ.getPathName(); }
    protected ConditionValue getCValueRealPathName() { return _myCQ.getRealPathName(); }
    protected ConditionValue getCValuePathType() { return _myCQ.getPathType(); }
    protected ConditionValue getCValuePkeyNum() { return _myCQ.getPkeyNum(); }
    protected ConditionValue getCValuePkeyVal() { return _myCQ.getPkeyVal(); }
    protected ConditionValue getCValueDataType() { return _myCQ.getDataType(); }
    protected ConditionValue getCValueTableName() { return _myCQ.getTableName(); }
    protected ConditionValue getCValueDataId() { return _myCQ.getDataId(); }
    protected ConditionValue getCValueStateId() { return _myCQ.getStateId(); }
    protected ConditionValue getCValueAutoRunTime() { return _myCQ.getAutoRunTime(); }
    protected ConditionValue getCValueInsertDate() { return _myCQ.getInsertDate(); }
    protected ConditionValue getCValueProcessDate() { return _myCQ.getProcessDate(); }
    protected ConditionValue getCValueAbortDate() { return _myCQ.getAbortDate(); }
    protected ConditionValue getCValueParticipantName() { return _myCQ.getParticipantName(); }
    protected ConditionValue getCValueParticipantType() { return _myCQ.getParticipantType(); }

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BuriPathHistoryDataCB.class.getName(); }
    protected String xinCQ() { return BuriPathHistoryDataCQ.class.getName(); }
}

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
 * The condition-query for in-line of BURIDATA.
 * @author DBFlute(AutoGenerator)
 */
public class BuriDataCIQ extends AbstractBsBuriDataCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBuriDataCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BuriDataCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBuriDataCQ myCQ) {
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
    protected ConditionValue getCValueDataId() { return _myCQ.getDataId(); }
    public String keepDataId_ExistsReferrer_BuriStateList(BuriStateCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDataId_ExistsReferrer_BuriBranchList(BuriBranchCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepDataId_NotExistsReferrer_BuriStateList(BuriStateCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDataId_NotExistsReferrer_BuriBranchList(BuriBranchCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepDataId_InScopeRelation_BuriStateList(BuriStateCQ sq)
    { return _myCQ.keepDataId_InScopeRelation_BuriStateList(sq); }
    public String keepDataId_InScopeRelation_BuriBranchList(BuriBranchCQ sq)
    { return _myCQ.keepDataId_InScopeRelation_BuriBranchList(sq); }
    public String keepDataId_NotInScopeRelation_BuriStateList(BuriStateCQ sq)
    { return _myCQ.keepDataId_NotInScopeRelation_BuriStateList(sq); }
    public String keepDataId_NotInScopeRelation_BuriBranchList(BuriBranchCQ sq)
    { return _myCQ.keepDataId_NotInScopeRelation_BuriBranchList(sq); }
    public String keepDataId_SpecifyDerivedReferrer_BuriStateList(BuriStateCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDataId_SpecifyDerivedReferrer_BuriBranchList(BuriBranchCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepDataId_QueryDerivedReferrer_BuriStateList(BuriStateCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDataId_QueryDerivedReferrer_BuriStateListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDataId_QueryDerivedReferrer_BuriBranchList(BuriBranchCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepDataId_QueryDerivedReferrer_BuriBranchListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValuePkeyVal() { return _myCQ.getPkeyVal(); }
    protected ConditionValue getCValuePkeyNum() { return _myCQ.getPkeyNum(); }
    protected ConditionValue getCValueDataType() { return _myCQ.getDataType(); }
    protected ConditionValue getCValueTableName() { return _myCQ.getTableName(); }
    protected ConditionValue getCValueInsertUserId() { return _myCQ.getInsertUserId(); }
    public String keepScalarCondition(BuriDataCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BuriDataCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BuriDataCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BuriDataCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(BuriDataCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BuriDataCB.class.getName(); }
    protected String xinCQ() { return BuriDataCQ.class.getName(); }
}

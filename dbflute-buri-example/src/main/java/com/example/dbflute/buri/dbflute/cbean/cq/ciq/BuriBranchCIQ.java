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
 * The condition-query for in-line of BURIBRANCH.
 * @author DBFlute(AutoGenerator)
 */
public class BuriBranchCIQ extends AbstractBsBuriBranchCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsBuriBranchCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BuriBranchCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsBuriBranchCQ myCQ) {
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
    protected ConditionValue getCValueBranchId() { return _myCQ.getBranchId(); }
    public String keepBranchId_ExistsReferrer_BuriStateList(BuriStateCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepBranchId_NotExistsReferrer_BuriStateList(BuriStateCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepBranchId_InScopeRelation_BuriStateList(BuriStateCQ sq)
    { return _myCQ.keepBranchId_InScopeRelation_BuriStateList(sq); }
    public String keepBranchId_NotInScopeRelation_BuriStateList(BuriStateCQ sq)
    { return _myCQ.keepBranchId_NotInScopeRelation_BuriStateList(sq); }
    public String keepBranchId_SpecifyDerivedReferrer_BuriStateList(BuriStateCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepBranchId_QueryDerivedReferrer_BuriStateList(BuriStateCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepBranchId_QueryDerivedReferrer_BuriStateListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueParentBranchId() { return _myCQ.getParentBranchId(); }
    protected ConditionValue getCValuePathId() { return _myCQ.getPathId(); }
    public String keepPathId_InScopeRelation_BuriPath(BuriPathCQ sq)
    { return _myCQ.keepPathId_InScopeRelation_BuriPath(sq); }
    public String keepPathId_NotInScopeRelation_BuriPath(BuriPathCQ sq)
    { return _myCQ.keepPathId_NotInScopeRelation_BuriPath(sq); }
    protected ConditionValue getCValueDataId() { return _myCQ.getDataId(); }
    public String keepDataId_InScopeRelation_BuriData(BuriDataCQ sq)
    { return _myCQ.keepDataId_InScopeRelation_BuriData(sq); }
    public String keepDataId_NotInScopeRelation_BuriData(BuriDataCQ sq)
    { return _myCQ.keepDataId_NotInScopeRelation_BuriData(sq); }
    protected ConditionValue getCValueProcessDate() { return _myCQ.getProcessDate(); }
    protected ConditionValue getCValueBtid() { return _myCQ.getBtid(); }
    protected ConditionValue getCValueVersionNo() { return _myCQ.getVersionNo(); }
    public String keepScalarCondition(BuriBranchCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(BuriBranchCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(BuriBranchCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(BuriBranchCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(BuriBranchCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return BuriBranchCB.class.getName(); }
    protected String xinCQ() { return BuriBranchCQ.class.getName(); }
}

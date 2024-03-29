package com.example.dbflute.slim3.dbflute.cbean.cq.ciq;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.exception.IllegalConditionBeanOperationException;
import com.example.dbflute.slim3.dbflute.cbean.*;
import com.example.dbflute.slim3.dbflute.cbean.cq.bs.*;
import com.example.dbflute.slim3.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of PURCHASE.
 * @author DBFlute(AutoGenerator)
 */
public class PurchaseCIQ extends AbstractBsPurchaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsPurchaseCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public PurchaseCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsPurchaseCQ myCQ) {
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
    protected ConditionValue getCValuePurchaseId() { return _myCQ.getPurchaseId(); }
    protected ConditionValue getCValueMemberId() { return _myCQ.getMemberId(); }
    public String keepMemberId_InScopeRelation_Member(MemberCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_Member(sq); }
    public String keepMemberId_NotInScopeRelation_Member(MemberCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_Member(sq); }
    protected ConditionValue getCValueProductId() { return _myCQ.getProductId(); }
    public String keepProductId_InScopeRelation_Product(ProductCQ sq)
    { return _myCQ.keepProductId_InScopeRelation_Product(sq); }
    public String keepProductId_NotInScopeRelation_Product(ProductCQ sq)
    { return _myCQ.keepProductId_NotInScopeRelation_Product(sq); }
    protected ConditionValue getCValuePurchaseDatetime() { return _myCQ.getPurchaseDatetime(); }
    protected ConditionValue getCValuePurchaseCount() { return _myCQ.getPurchaseCount(); }
    protected ConditionValue getCValuePurchasePrice() { return _myCQ.getPurchasePrice(); }
    protected ConditionValue getCValuePaymentCompleteFlg() { return _myCQ.getPaymentCompleteFlg(); }
    protected ConditionValue getCValueRegisterDatetime() { return _myCQ.getRegisterDatetime(); }
    protected ConditionValue getCValueRegisterUser() { return _myCQ.getRegisterUser(); }
    protected ConditionValue getCValueRegisterProcess() { return _myCQ.getRegisterProcess(); }
    protected ConditionValue getCValueUpdateDatetime() { return _myCQ.getUpdateDatetime(); }
    protected ConditionValue getCValueUpdateUser() { return _myCQ.getUpdateUser(); }
    protected ConditionValue getCValueUpdateProcess() { return _myCQ.getUpdateProcess(); }
    protected ConditionValue getCValueVersionNo() { return _myCQ.getVersionNo(); }
    public String keepScalarCondition(PurchaseCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(PurchaseCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(PurchaseCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(PurchaseCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(PurchaseCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return PurchaseCB.class.getName(); }
    protected String xinCQ() { return PurchaseCQ.class.getName(); }
}

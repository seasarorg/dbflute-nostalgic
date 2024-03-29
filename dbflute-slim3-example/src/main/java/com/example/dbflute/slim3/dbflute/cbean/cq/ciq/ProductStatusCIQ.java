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
 * The condition-query for in-line of PRODUCT_STATUS.
 * @author DBFlute(AutoGenerator)
 */
public class ProductStatusCIQ extends AbstractBsProductStatusCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsProductStatusCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ProductStatusCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsProductStatusCQ myCQ) {
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
    protected ConditionValue getCValueProductStatusCode() { return _myCQ.getProductStatusCode(); }
    public String keepProductStatusCode_ExistsReferrer_ProductList(ProductCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductStatusCode_ExistsReferrer_SummaryProductList(SummaryProductCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepProductStatusCode_NotExistsReferrer_ProductList(ProductCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductStatusCode_NotExistsReferrer_SummaryProductList(SummaryProductCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepProductStatusCode_InScopeRelation_ProductList(ProductCQ sq)
    { return _myCQ.keepProductStatusCode_InScopeRelation_ProductList(sq); }
    public String keepProductStatusCode_InScopeRelation_SummaryProductList(SummaryProductCQ sq)
    { return _myCQ.keepProductStatusCode_InScopeRelation_SummaryProductList(sq); }
    public String keepProductStatusCode_NotInScopeRelation_ProductList(ProductCQ sq)
    { return _myCQ.keepProductStatusCode_NotInScopeRelation_ProductList(sq); }
    public String keepProductStatusCode_NotInScopeRelation_SummaryProductList(SummaryProductCQ sq)
    { return _myCQ.keepProductStatusCode_NotInScopeRelation_SummaryProductList(sq); }
    public String keepProductStatusCode_SpecifyDerivedReferrer_ProductList(ProductCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductStatusCode_SpecifyDerivedReferrer_SummaryProductList(SummaryProductCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepProductStatusCode_QueryDerivedReferrer_ProductList(ProductCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductStatusCode_QueryDerivedReferrer_ProductListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductStatusCode_QueryDerivedReferrer_SummaryProductList(SummaryProductCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepProductStatusCode_QueryDerivedReferrer_SummaryProductListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueProductStatusName() { return _myCQ.getProductStatusName(); }
    public String keepScalarCondition(ProductStatusCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(ProductStatusCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(ProductStatusCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(ProductStatusCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(ProductStatusCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return ProductStatusCB.class.getName(); }
    protected String xinCQ() { return ProductStatusCQ.class.getName(); }
}

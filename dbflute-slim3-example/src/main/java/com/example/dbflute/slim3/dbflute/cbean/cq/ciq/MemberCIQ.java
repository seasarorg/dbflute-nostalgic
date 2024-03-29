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
 * The condition-query for in-line of MEMBER.
 * @author DBFlute(AutoGenerator)
 */
public class MemberCIQ extends AbstractBsMemberCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsMemberCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public MemberCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsMemberCQ myCQ) {
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
    protected ConditionValue getCValueMemberId() { return _myCQ.getMemberId(); }
    public String keepMemberId_ExistsReferrer_MemberAddressList(MemberAddressCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberId_ExistsReferrer_MemberLoginList(MemberLoginCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberId_ExistsReferrer_MemberSecurityAsOne(MemberSecurityCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberId_ExistsReferrer_MemberWithdrawalAsOne(MemberWithdrawalCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberId_ExistsReferrer_PurchaseList(PurchaseCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepMemberId_NotExistsReferrer_MemberAddressList(MemberAddressCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberId_NotExistsReferrer_MemberLoginList(MemberLoginCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberId_NotExistsReferrer_MemberSecurityAsOne(MemberSecurityCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberId_NotExistsReferrer_MemberWithdrawalAsOne(MemberWithdrawalCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberId_NotExistsReferrer_PurchaseList(PurchaseCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepMemberId_InScopeRelation_MemberAddressList(MemberAddressCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_MemberAddressList(sq); }
    public String keepMemberId_InScopeRelation_MemberLoginList(MemberLoginCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_MemberLoginList(sq); }
    public String keepMemberId_InScopeRelation_MemberSecurityAsOne(MemberSecurityCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_MemberSecurityAsOne(sq); }
    public String keepMemberId_InScopeRelation_MemberWithdrawalAsOne(MemberWithdrawalCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_MemberWithdrawalAsOne(sq); }
    public String keepMemberId_InScopeRelation_PurchaseList(PurchaseCQ sq)
    { return _myCQ.keepMemberId_InScopeRelation_PurchaseList(sq); }
    public String keepMemberId_NotInScopeRelation_MemberAddressList(MemberAddressCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_MemberAddressList(sq); }
    public String keepMemberId_NotInScopeRelation_MemberLoginList(MemberLoginCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_MemberLoginList(sq); }
    public String keepMemberId_NotInScopeRelation_MemberSecurityAsOne(MemberSecurityCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_MemberSecurityAsOne(sq); }
    public String keepMemberId_NotInScopeRelation_MemberWithdrawalAsOne(MemberWithdrawalCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_MemberWithdrawalAsOne(sq); }
    public String keepMemberId_NotInScopeRelation_PurchaseList(PurchaseCQ sq)
    { return _myCQ.keepMemberId_NotInScopeRelation_PurchaseList(sq); }
    public String keepMemberId_SpecifyDerivedReferrer_MemberAddressList(MemberAddressCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberId_SpecifyDerivedReferrer_MemberLoginList(MemberLoginCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberId_SpecifyDerivedReferrer_PurchaseList(PurchaseCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressList(MemberAddressCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberId_QueryDerivedReferrer_MemberAddressListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginList(MemberLoginCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberId_QueryDerivedReferrer_MemberLoginListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberId_QueryDerivedReferrer_PurchaseList(PurchaseCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepMemberId_QueryDerivedReferrer_PurchaseListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueMemberName() { return _myCQ.getMemberName(); }
    protected ConditionValue getCValueMemberAccount() { return _myCQ.getMemberAccount(); }
    protected ConditionValue getCValueMemberStatusCode() { return _myCQ.getMemberStatusCode(); }
    public String keepMemberStatusCode_InScopeRelation_MemberStatus(MemberStatusCQ sq)
    { return _myCQ.keepMemberStatusCode_InScopeRelation_MemberStatus(sq); }
    public String keepMemberStatusCode_NotInScopeRelation_MemberStatus(MemberStatusCQ sq)
    { return _myCQ.keepMemberStatusCode_NotInScopeRelation_MemberStatus(sq); }
    protected ConditionValue getCValueFormalizedDatetime() { return _myCQ.getFormalizedDatetime(); }
    protected ConditionValue getCValueBirthdate() { return _myCQ.getBirthdate(); }
    protected ConditionValue getCValueRegisterDatetime() { return _myCQ.getRegisterDatetime(); }
    protected ConditionValue getCValueRegisterUser() { return _myCQ.getRegisterUser(); }
    protected ConditionValue getCValueRegisterProcess() { return _myCQ.getRegisterProcess(); }
    protected ConditionValue getCValueUpdateDatetime() { return _myCQ.getUpdateDatetime(); }
    protected ConditionValue getCValueUpdateUser() { return _myCQ.getUpdateUser(); }
    protected ConditionValue getCValueUpdateProcess() { return _myCQ.getUpdateProcess(); }
    protected ConditionValue getCValueVersionNo() { return _myCQ.getVersionNo(); }
    public String keepScalarCondition(MemberCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(MemberCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(MemberCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(MemberCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(MemberCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return MemberCB.class.getName(); }
    protected String xinCQ() { return MemberCQ.class.getName(); }
}

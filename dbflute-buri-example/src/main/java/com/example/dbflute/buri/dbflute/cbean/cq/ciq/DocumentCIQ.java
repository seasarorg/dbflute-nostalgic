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
 * The condition-query for in-line of DOCUMENT.
 * @author DBFlute(AutoGenerator)
 */
public class DocumentCIQ extends AbstractBsDocumentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsDocumentCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public DocumentCIQ(ConditionQuery childQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsDocumentCQ myCQ) {
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
    protected ConditionValue getCValueId() { return _myCQ.getId(); }
    public String keepId_ExistsReferrer_BuriAllRoundStateList(BuriAllRoundStateCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepId_NotExistsReferrer_BuriAllRoundStateList(BuriAllRoundStateCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepId_InScopeRelation_BuriAllRoundStateList(BuriAllRoundStateCQ sq)
    { return _myCQ.keepId_InScopeRelation_BuriAllRoundStateList(sq); }
    public String keepId_NotInScopeRelation_BuriAllRoundStateList(BuriAllRoundStateCQ sq)
    { return _myCQ.keepId_NotInScopeRelation_BuriAllRoundStateList(sq); }
    public String keepId_SpecifyDerivedReferrer_BuriAllRoundStateList(BuriAllRoundStateCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_BuriAllRoundStateList(BuriAllRoundStateCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepId_QueryDerivedReferrer_BuriAllRoundStateListParameter(Object pv)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue getCValueTitle() { return _myCQ.getTitle(); }
    protected ConditionValue getCValueContent() { return _myCQ.getContent(); }
    public String keepScalarCondition(DocumentCQ subQuery)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(DocumentCQ subQuery)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(DocumentCQ subQuery)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object parameterValue)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(DocumentCQ subQuery)
    { throwIICBOE("MyselfExists"); return null;}
    public String keepMyselfInScope(DocumentCQ subQuery)
    { throwIICBOE("MyselfInScope"); return null;}

    protected void throwIICBOE(String name) { // throwInlineIllegalConditionBeanOperationException()
        throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported.");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return DocumentCB.class.getName(); }
    protected String xinCQ() { return DocumentCQ.class.getName(); }
}

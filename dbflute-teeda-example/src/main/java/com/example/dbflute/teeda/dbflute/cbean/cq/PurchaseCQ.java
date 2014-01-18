package com.example.dbflute.teeda.dbflute.cbean.cq;


import com.example.dbflute.teeda.dbflute.allcommon.cbean.ConditionQuery;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.sqlclause.SqlClause;
import com.example.dbflute.teeda.dbflute.cbean.cq.bs.BsPurchaseCQ;

/**
 * The condition-query of PURCHASE.
 * 
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class PurchaseCQ extends BsPurchaseCQ {

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     * 
     * @param childQuery Child query as abstract class. (Nullable: If null, this is base instance.)
     * @param sqlClause SQL clause instance. (NotNull)
     * @param aliasName My alias name. (NotNull)
     * @param nestLevel Nest level.
     */
    public PurchaseCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }
}

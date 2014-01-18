package com.example.dbflute.teeda.dbflute.cbean.cq;


import com.example.dbflute.teeda.dbflute.allcommon.cbean.ConditionQuery;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.sqlclause.SqlClause;
import com.example.dbflute.teeda.dbflute.cbean.cq.bs.BsProductCQ;

/**
 * The condition-query of PRODUCT.
 * 
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class ProductCQ extends BsProductCQ {

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
    public ProductCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }
}

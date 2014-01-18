package com.example.dbflute.lucy.dbflute.cbean.cq;


import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;

import com.example.dbflute.lucy.dbflute.cbean.cq.bs.BsVendorCheckCQ;

/**
 * The condition-query of VENDOR_CHECK. <br />
 * You can implement your original methods here. <br />
 * This class is NOT overrided when re-generating. <br />
 * 
 * @author DBFlute(AutoGenerator)
 */

public class VendorCheckCQ extends BsVendorCheckCQ {

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
    public VendorCheckCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }
}

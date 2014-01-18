package com.example.dbflute.buri.dbflute.cbean.cq;


import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;

import com.example.dbflute.buri.dbflute.cbean.cq.bs.BsBuriPathCQ;

/**
 * The condition-query of BURIPATH.
 * <p>
 * You can implement your original methods here.
 * This class is NOT overrided when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class BuriPathCQ extends BsBuriPathCQ {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * @param childQuery Child query as abstract class. (Nullable: If null, this is base instance.)
     * @param sqlClause SQL clause instance. (NotNull)
     * @param aliasName My alias name. (NotNull)
     * @param nestLevel Nest level.
     */
    public BuriPathCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }
	
    // ===================================================================================
    //                                                                      Arrange Method
    //                                                                      ==============
	// You can make original arrange query methods here.
	// public void arranegeXxx() {
	//     ...
	// }
}

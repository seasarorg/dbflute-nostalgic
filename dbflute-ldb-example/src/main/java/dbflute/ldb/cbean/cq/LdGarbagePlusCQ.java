/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.cq;


import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.cbean.cq.bs.LdBsGarbagePlusCQ;

/**
 * The condition-query of GARBAGE_PLUS.
 * <p>
 * You can implement your original methods here.
 * This class is NOT overrided when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class LdGarbagePlusCQ extends LdBsGarbagePlusCQ {

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
    public LdGarbagePlusCQ(LdConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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

package com.example.dbflute.basic.dbflute.cbean.cq;


import com.example.dbflute.basic.dbflute.allcommon.cbean.ConditionQuery;
import com.example.dbflute.basic.dbflute.allcommon.cbean.sqlclause.SqlClause;
import com.example.dbflute.basic.dbflute.cbean.cq.bs.BsMemberLoginCQ;

/**
 * The condition-query of MEMBER_LOGIN.
 * <p>
 * You can implement your original methods here.
 * This class is NOT overrided when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MemberLoginCQ extends BsMemberLoginCQ {

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
    public MemberLoginCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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

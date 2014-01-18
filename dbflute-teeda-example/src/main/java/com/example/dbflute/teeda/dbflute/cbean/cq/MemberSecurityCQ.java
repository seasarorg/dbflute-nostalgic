package com.example.dbflute.teeda.dbflute.cbean.cq;


import com.example.dbflute.teeda.dbflute.allcommon.cbean.ConditionQuery;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.sqlclause.SqlClause;
import com.example.dbflute.teeda.dbflute.cbean.cq.bs.BsMemberSecurityCQ;

/**
 * The condition-query of MEMBER_SECURITY.
 * 
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class MemberSecurityCQ extends BsMemberSecurityCQ {

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
    public MemberSecurityCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }
}

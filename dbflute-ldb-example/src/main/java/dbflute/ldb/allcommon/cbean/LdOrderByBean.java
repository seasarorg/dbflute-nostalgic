/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean;

import dbflute.ldb.allcommon.cbean.sqlclause.LdOrderByClause;

/**
 * The order-by-bean as interface.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface LdOrderByBean extends LdSelectResource {

    /**
     * Get sql component of order-by clause.
     * 
     * @return Sql component of order-by clause. (NotNull)
     */
    public LdOrderByClause getSqlComponentOfOrderByClause();

    /**
     * Get order-by clause.
     * 
     * @return Order-by clause. (NotNull)
     */
    public String getOrderByClause();

    /**
     * Clear order-by.
     * 
     * @return this. (NotNull)
     */
    public LdOrderByBean clearOrderBy();

    /**
     * Ignore order-by.
     * 
     * @return this. (NotNull)
     */
    public LdOrderByBean ignoreOrderBy();

    /**
     * Make order-by effective.
     * 
     * @return this. (NotNull)
     */
    public LdOrderByBean makeOrderByEffective();
}

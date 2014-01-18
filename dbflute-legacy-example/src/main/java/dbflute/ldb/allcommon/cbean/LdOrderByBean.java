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

    /**
     * Register order-by-asc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     */
    public LdOrderByBean registerOrderByAsc(String orderByProperty);

    /**
     * Register order-by-desc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     */
    public LdOrderByBean registerOrderByDesc(String orderByProperty);

    /**
     * Reverse order-by or Override order-by asc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     */
    public LdOrderByBean reverseOrderBy_Or_OverrideOrderByAsc(String orderByProperty);

    /**
     * Reverse order-by or Override order-by desc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     */
    public LdOrderByBean reverseOrderBy_Or_OverrideOrderByDesc(String orderByProperty);
}

package dbflute.ldb.allcommon.cbean;

import dbflute.ldb.allcommon.cbean.sqlclause.LdOrderByClause;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClauseDerby;

/// <summary>
/// The order-by-bean as simple implemetation.
/// Author: DBFlute(AutoGenerator)
/// </summary>
public class LdSimpleOrderByBean implements LdOrderByBean {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** SQL clause instance. */
    protected final LdSqlClause _sqlClause;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdSimpleOrderByBean() {
        _sqlClause = new LdSqlClauseDerby("Dummy");
    }

    // =====================================================================================
    //                                                                             SqlClause
    //                                                                             =========
    /**
     * Get sql-clause.
     * 
     * @return Sql clause. (NotNull)
     */
    protected LdSqlClause getSqlClause() {
        return _sqlClause;
    }

    // =====================================================================================
    //                                                                               OrderBy
    //                                                                               =======
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Sql component of order-by clause. (NotNull)
     */
    public LdOrderByClause getSqlComponentOfOrderByClause() {
        return getSqlClause().getSqlComponentOfOrderByClause();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Order-by clause. (NotNull)
     */
    public String getOrderByClause() {
        return getSqlClause().getOrderByClause();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return this. (NotNull)
     */
    public LdOrderByBean clearOrderBy() {
        getSqlClause().clearOrderBy();
        return this;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return this. (NotNull)
     */
    public LdOrderByBean ignoreOrderBy() {
        getSqlClause().ignoreOrderBy();
        return this;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return this. (NotNull)
     */
    public LdOrderByBean makeOrderByEffective() {
        getSqlClause().makeOrderByEffective();
        return this;
    }

    /**
     * Register order-by-asc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     */
    public LdOrderByBean registerOrderByAsc(String orderByProperty) {
        getSqlClause().registerOrderBy(orderByProperty, orderByProperty, true);
        return this;
    }

    /**
     * Register order-by-desc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     */
    public LdOrderByBean registerOrderByDesc(String orderByProperty) {
        getSqlClause().registerOrderBy(orderByProperty, orderByProperty, false);
        return this;
    }

    /**
     * Reverse order-by or Override order-by asc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     */
    public LdOrderByBean reverseOrderBy_Or_OverrideOrderByAsc(String orderByProperty) {
        getSqlClause().reverseOrderBy_Or_OverrideOrderBy(orderByProperty, orderByProperty, true);
        return this;
    }

    /**
     * Reverse order-by or Override order-by desc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     */
    public LdOrderByBean reverseOrderBy_Or_OverrideOrderByDesc(String orderByProperty) {
        getSqlClause().reverseOrderBy_Or_OverrideOrderBy(orderByProperty, orderByProperty, false);
        return this;
    }
}

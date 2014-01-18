package com.example.dbflute.teeda.dbflute.allcommon.cbean.sqlclause;


/**
 * SqlClause for Default.
 * @author DBFlute(AutoGenerator)
 */
public class SqlClauseDefault extends AbstractSqlClause {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * @param tableName Table name. (NotNull)
     **/
    public SqlClauseDefault(String tableName) {
        super(tableName);
    }

    // ===================================================================================
    //                                                                    OrderBy Override
    //                                                                    ================
	@Override
    protected OrderByClause.OrderByNullsSetupper createOrderByNullsSetupper() {
	    return createOrderByNullsSetupperByCaseWhen();
	}

    /**
     * {@inheritDoc}
     */
    protected void doFetchFirst() {
    }

    /**
     * {@inheritDoc}
     */
    protected void doFetchPage() {
    }

    /**
     * {@inheritDoc}
     */
    protected void doClearFetchPageClause() {
    }

    /**
     * {@inheritDoc}
     * 
     * @return Determination.
     */
    public boolean isFetchStartIndexSupported() {
        return false; // Default
    }

    /**
     * {@inheritDoc}
     * 
     * @return Determination.
     */
    public boolean isFetchSizeSupported() {
        return false; // Default
    }

    /**
     * {@inheritDoc}
     * 
     * @return this. (NotNull)
     */
    public SqlClause lockForUpdate() {
        String msg = "LockForUpdate-SQL is unsupported in the database. Sorry...: " + toString();
        throw new UnsupportedOperationException(msg);
    }

    /**
     * {@inheritDoc}
     * 
     * @return Select-hint. (NotNull)
     */
    protected String createSelectHint() {
        return "";
    }

    /**
     * {@inheritDoc}
     * 
     * @return From-base-table-hint. {select * from table [from-base-table-hint] where ...} (NotNull)
     */
    protected String createFromBaseTableHint() {
        return "";
    }

    /**
     * {@inheritDoc}
     * 
     * @return From-hint. (NotNull)
     */
    protected String createFromHint() {
        return "";
    }

    /**
     * {@inheritDoc}
     * 
     * @return Sql-suffix. (NotNull)
     */
    protected String createSqlSuffix() {
        return "";
    }
}

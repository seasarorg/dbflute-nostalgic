/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.sqlclause;


/**
 * SqlClause for Default.
 * @author DBFlute(AutoGenerator)
 */
public class LdSqlClauseDefault extends LdAbstractSqlClause {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * @param tableName Table name. (NotNull)
     **/
    public LdSqlClauseDefault(String tableName) {
        super(tableName);
    }

    // ===================================================================================
    //                                                                    OrderBy Override
    //                                                                    ================
	@Override
    protected LdOrderByClause.OrderByNullsSetupper createOrderByNullsSetupper() {
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
    public LdSqlClause lockForUpdate() {
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

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.sqlclause;


/**
 * SqlClause for PostreSQL.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdSqlClausePostgreSql extends LdAbstractSqlClause {

    /** String of fetch-scope as sql-suffix. */
    protected String _fetchScopeSqlSuffix = "";

    /** String of lock as sql-suffix. */
    protected String _lockSqlSuffix = "";

    /**
     * Constructor.
     * @param tableName Table name. (NotNull)
     **/
    public LdSqlClausePostgreSql(String tableName) {
        super(tableName);
    }

    /**
     * {@inheritDoc}
     */
    protected void doFetchFirst() {
        doFetchPage();
    }

    /**
     * {@inheritDoc}
     */
    protected void doFetchPage() {
        _fetchScopeSqlSuffix = " offset " + getPageStartIndex() + " limit " + getFetchSize();
    }

    /**
     * {@inheritDoc}
     */
    protected void doClearFetchPageClause() {
        _fetchScopeSqlSuffix = "";
    }

    /**
     * {@inheritDoc}
     * 
     * @return this. (NotNull)
     */
    public LdSqlClause lockForUpdate() {
        _lockSqlSuffix = " for update";
        return this;
    }

    /**
     * {@inheritDoc}
     * @return Select-hint. (NotNull)
     */
    protected String createSelectHint() {
        return "";
    }

    /**
     * {@inheritDoc}
     * @return From-base-table-hint. {select * from table [from-base-table-hint] where ...} (NotNull)
     */
    protected String createFromBaseTableHint() {
        return "";
    }

    /**
     * {@inheritDoc}
     * @return From-hint. (NotNull)
     */
    protected String createFromHint() {
        return "";
    }

    /**
     * {@inheritDoc}
     * @return Sql-suffix. (NotNull)
     */
    protected String createSqlSuffix() {
        return _fetchScopeSqlSuffix + _lockSqlSuffix;
    }

    // [DBFlute-0.7.7]
    // ===================================================================================
    //                                                          Unique Constraint Override
    //                                                          ==========================
    @Override
    public boolean isUniqueConstraintException(String sqlState, Integer errorCode) {
        return "23505".equals(sqlState);
    }
}

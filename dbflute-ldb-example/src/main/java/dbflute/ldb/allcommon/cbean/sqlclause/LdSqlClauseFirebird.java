/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.sqlclause;


/**
 * SqlClause for Firebird.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdSqlClauseFirebird extends LdAbstractSqlClause {

    /** String of fetch-scope as select-hint. */
    protected String _fetchScopeSelectHint = "";

    /** String of lock as sql-suffix. */
    protected String _lockSqlSuffix = "";

    /**
     * Constructor.
     * 
     * @param tableName Table name. (NotNull)
     **/
    public LdSqlClauseFirebird(String tableName) {
        super(tableName);
    }

    /**
     * {@inheritDoc}
     */
    protected void doFetchFirst() {
        if (isFetchSizeSupported()) {
            _fetchScopeSelectHint = " first " + getFetchSize();
        }
    }

    /**
     * {@inheritDoc}
     */
    protected void doFetchPage() {
        if (isFetchStartIndexSupported() && isFetchSizeSupported()) {
            _fetchScopeSelectHint = " first " + getFetchSize() + " skip " + getPageStartIndex();
        }
        if (isFetchStartIndexSupported() && !isFetchSizeSupported()) {
            _fetchScopeSelectHint = " skip " + getPageStartIndex();
        }
        if (!isFetchStartIndexSupported() && isFetchSizeSupported()) {
            _fetchScopeSelectHint = " first " + getPageEndIndex();
        }
    }

    /**
     * {@inheritDoc}
     */
    protected void doClearFetchPageClause() {
        _fetchScopeSelectHint = "";
    }

    /**
     * {@inheritDoc}
     * 
     * @return this. (NotNull)
     */
    public LdSqlClause lockForUpdate() {
        _lockSqlSuffix = " for update with lock";
        return this;
    }

    /**
     * {@inheritDoc}
     * 
     * @return Select-hint. (NotNull)
     */
    protected String createSelectHint() {
        return _fetchScopeSelectHint;
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
        return _lockSqlSuffix;
    }
}

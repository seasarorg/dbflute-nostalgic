package com.example.dbflute.teeda.dbflute.allcommon.cbean.sqlclause;


/**
 * SqlClause for MSSQL.
 * @author DBFlute(AutoGenerator)
 */
public class SqlClauseSqlServer extends AbstractSqlClause {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** String of fetch-first as select-hint. */
    protected String _fetchFirstSelectHint = "";

    /** String of lock as from-hint. */
    protected String _lockFromHint = "";

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * @param tableName Table name. (NotNull)
     **/
    public SqlClauseSqlServer(String tableName) {
        super(tableName);
    }

    // ===================================================================================
    //                                                                    OrderBy Override
    //                                                                    ================
	@Override
    protected OrderByClause.OrderByNullsSetupper createOrderByNullsSetupper() {
	    return createOrderByNullsSetupperByCaseWhen();
	}

    // ===================================================================================
    //                                                                 FetchScope Override
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    protected void doFetchFirst() {
        if (isFetchSizeSupported()) {
            _fetchFirstSelectHint = " top " + getFetchSize();
        }
    }

    /**
     * {@inheritDoc}
     */
    protected void doFetchPage() {
        if (isFetchSizeSupported()) {
            if (isFetchStartIndexSupported()) {
                _fetchFirstSelectHint = " top " + getFetchSize();
            } else {
                _fetchFirstSelectHint = " top " + getPageEndIndex();
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    protected void doClearFetchPageClause() {
        _fetchFirstSelectHint = "";
    }

    /**
     * @return Determination.
     */
    public boolean isFetchStartIndexSupported() {
        return false;
    }

    // ===================================================================================
    //                                                                       Lock Override
    //                                                                       =============
    /**
     * {@inheritDoc} {Implement}
     * @return this. (NotNull)
     */
    public SqlClause lockForUpdate() {
        _lockFromHint = " with (updlock)";
        return this;
    }

    // ===================================================================================
    //                                                                       Hint Override
    //                                                                       =============
    /**
     * {@inheritDoc}
     * @return Select-hint. (NotNull)
     */
    protected String createSelectHint() {
        return _fetchFirstSelectHint;
    }

    /**
     * {@inheritDoc}
     * @return From-base-table-hint. {select * from table [from-base-table-hint] where ...} (NotNull)
     */
    protected String createFromBaseTableHint() {
        return _lockFromHint;
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
        return "";
    }
	
    // [DBFlute-0.7.7]
    // ===================================================================================
    //                                                          Unique Constraint Override
    //                                                          ==========================
    @Override
    public boolean isUniqueConstraintException(String sqlState, Integer errorCode) {
        return errorCode != null && errorCode == 2627;
    }
}

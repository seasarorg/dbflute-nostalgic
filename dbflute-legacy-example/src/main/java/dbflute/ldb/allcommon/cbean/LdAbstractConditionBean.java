package dbflute.ldb.allcommon.cbean;


import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.allcommon.cbean.sqlclause.LdOrderByClause;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClauseDerby;


/**
 * The condition-bean as abstract.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractConditionBean implements LdConditionBean {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** SQL clause instance. */
    protected final LdSqlClause _sqlClause = new LdSqlClauseDerby(getTableDbName());

    // =====================================================================================
    //                                                                             SqlClause
    //                                                                             =========
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Sql clause. (NotNull)
     */
    public LdSqlClause getSqlClause() {
        return _sqlClause;
    }

    // =====================================================================================
    //                                                                        FetchNarrowing
    //                                                                        ==============
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Fetch start index.
     */
    public int getFetchNarrowingSkipStartIndex() {
        return getSqlClause().getFetchNarrowingSkipStartIndex();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Fetch size.
     */
    public int getFetchNarrowingLoopCount() {
        return getSqlClause().getFetchNarrowingLoopCount();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Determination.
     */
    public boolean isFetchNarrowingSkipStartIndexEffective() {
        return !getSqlClause().isFetchStartIndexSupported();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Determination.
     */
    public boolean isFetchNarrowingLoopCountEffective() {
        return !getSqlClause().isFetchSizeSupported();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Determiantion.
     */
    public boolean isFetchNarrowingEffective() {
        return getSqlClause().isFetchNarrowingEffective();
    }

    // =====================================================================================
    //                                                                                Paging
    //                                                                                ======
    /**
     * This method implements the method that is declared at super.
     * 
     * @param fetchSize Fetch-size. (NotMinus & NotZero)
     * @return this. (NotNUll)
     */
    public LdPagingBean fetchFirst(int fetchSize) {
        getSqlClause().fetchFirst(fetchSize);
        return this;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param fetchStartIndex Fetch-start-index. 0 origin. (NotMinus)
     * @param fetchSize Fetch-size. (NotMinus & NotZero)
     * @return this. (NotNUll)
     */
    public LdPagingBean fetchScope(int fetchStartIndex, int fetchSize) {
        getSqlClause().fetchScope(fetchStartIndex, fetchSize);
        return this;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param fetchPageNumber Fetch-page-number. 1 origin. (NotMinus & NotZero)
     * @return this. (NotNull)
     */
    public LdPagingBean fetchPage(int fetchPageNumber) {
        getSqlClause().fetchPage(fetchPageNumber);
        return this;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Fetch-start-index.
     */
    public int getFetchStartIndex() {
        return _sqlClause.getFetchStartIndex();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Fetch-size.
     */
    public int getFetchSize() {
        return _sqlClause.getFetchSize();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Fetch-page-number.
     */
    public int getFetchPageNumber() {
        return _sqlClause.getFetchPageNumber();
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
        return _sqlClause.getOrderByClause();
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
        getSqlClause().registerOrderBy(filterOrderByProperty(orderByProperty), orderByProperty, true);
        return this;
    }

    /**
     * Register order-by-desc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     */
    public LdOrderByBean registerOrderByDesc(String orderByProperty) {
        getSqlClause().registerOrderBy(filterOrderByProperty(orderByProperty), orderByProperty, false);
        return this;
    }

    /**
     * Reverse order-by or Override order-by asc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     */
    public LdOrderByBean reverseOrderBy_Or_OverrideOrderByAsc(String orderByProperty) {
        getSqlClause().reverseOrderBy_Or_OverrideOrderBy(filterOrderByProperty(orderByProperty), orderByProperty, true);
        return this;
    }

    /**
     * Reverse order-by or Override order-by desc.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @return this. (NotNull)
     */
    public LdOrderByBean reverseOrderBy_Or_OverrideOrderByDesc(String orderByProperty) {
        getSqlClause().reverseOrderBy_Or_OverrideOrderBy(filterOrderByProperty(orderByProperty), orderByProperty, false);
        return this;
    }

    protected String filterOrderByProperty(String orderByProperty) {
        final java.util.List<String> orderBySlashList = new java.util.ArrayList<String>();
        {
            final java.util.StringTokenizer st = new java.util.StringTokenizer(orderByProperty, "/");
            while (st.hasMoreElements()) {
                orderBySlashList.add(st.nextToken());
            }
        }

        final StringBuffer sb = new StringBuffer();
        LdDBMeta dbmeta = LdDBMetaInstanceHandler.getInstanceByTableDbName(getTableDbName());
        LdConditionQuery query = this.getConditionQueryAsInterface();
        for (final java.util.Iterator ite = orderBySlashList.iterator(); ite.hasNext(); ) {
            final String orderBySlashElement = (String)ite.next();
	        final java.util.List<String> orderByDotList = new java.util.ArrayList<String>();
	        {
	            final java.util.StringTokenizer st = new java.util.StringTokenizer(orderBySlashElement, "/");
	            while (st.hasMoreElements()) {
	                orderByDotList.add(st.nextToken());
	            }
	        }

            if (orderByDotList.size() == 1) {
                if (dbmeta.isExistMultiName(orderBySlashElement)) {
                    sb.append("/").append(query.getRealColumnName(dbmeta.getDbNameByMultiName(orderBySlashElement)));
                } else {
                    sb.append("/").append(orderBySlashElement);
                }
            } else {
                LdDBMeta foreignDBMeta = dbmeta;
                LdConditionQuery foreignQuery = query;
                int count = 0;
                for (final java.util.Iterator ite2 = orderByDotList.iterator(); ite2.hasNext(); ) {
                    String orderByDotElement = (String)ite2.next();
                    count++;

                    if (orderByDotList.size() == count) {// Last Loop!
                        if (!foreignDBMeta.isExistMultiName(orderByDotElement)) {
                            String msg = "The name for order-by is not existing: name=" + orderByDotElement;
                            msg = msg + " orderBySlashElement=" + orderBySlashElement + " orderByProperty=" + orderByProperty;
                            throw new IllegalStateException(msg);
                        }
                        sb.append("/").append(foreignQuery.getRealColumnName(foreignDBMeta.getDbNameByMultiName(orderByDotElement)));
                        break;
                    }

                    foreignDBMeta = foreignDBMeta.getForeignDBMeta(orderByDotElement);
                    foreignQuery = foreignQuery.getForeignConditionQuery(orderByDotElement);
                }
            }
        }
        sb.delete(0, "/".length());
        return sb.toString();
    }

    // =====================================================================================
    //                                                                               Advance
    //                                                                               =======
    /**
     * This method implements the method that is declared at super.
     * 
     * @return this. (NotNull)
     */
    public LdConditionBean lockForUpdate() {
        getSqlClause().lockForUpdate();
        return this;
    }

    // =====================================================================================
    //                                                                        For SqlComment
    //                                                                        ==============
    /**
     * Get select-hint. {select [select-hint] * from table...}
     * 
     * @return select-hint. (NotNull)
     */
    public String getSelectHint() {
        return getSqlClause().getSelectHint();
    }

    /**
     * Get from-base-table-hint. {select * from table [from-base-table-hint] where ...}
     * 
     * @return from-base-table-hint. (NotNull)
     */
    public String getFromBaseTableHint() {
        return getSqlClause().getFromBaseTableHint();
    }

    /**
     * Get from-hint. {select * from table left outer join ... on ... [from-hint] where ...}
     * 
     * @return from-hint. (NotNull)
     */
    public String getFromHint() {
        return getSqlClause().getFromHint();
    }

    /**
     * Get where clause.
     * 
     * @return Where clause. (NotNull)
     */
    public String getWhereClause() {
        return getSqlClause().getWhereClause();
    }

    /**
     * Get sql-suffix. {select * from table where ... order by ... [sql-suffix]}
     * 
     * @return Sql-suffix.  (NotNull)
     */
    public String getSqlSuffix() {
        return getSqlClause().getSqlSuffix();
    }
}

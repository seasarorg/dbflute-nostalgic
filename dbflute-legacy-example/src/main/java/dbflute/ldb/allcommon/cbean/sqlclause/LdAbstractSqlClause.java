package dbflute.ldb.allcommon.cbean.sqlclause;


import dbflute.ldb.allcommon.cbean.ckey.*;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;

/**
 * The abstract class of SqlClause.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractSqlClause implements LdSqlClause {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Target table name. */
    protected final String _tableName;

    /** Included select column map. */
    protected java.util.Map<String, String> _includedSelectColumnMap = new java.util.LinkedHashMap<String, String>();

    /** Outer join map. */
    protected java.util.Map<String, String> _outerJoinMap = new java.util.LinkedHashMap<String, String>();

    /** Where list. */
    protected java.util.List<String> _whereList = new java.util.ArrayList<String>();

    /** Order-by clause. */
    protected final LdOrderByClause _orderByClause = new LdOrderByClause();

    /** Is order-by effective? Default value is false. */
    protected boolean _isOrderByEffective = false;

    /** Fetch start index. (for fetchXxx()) */
    protected int _fetchStartIndex = 0;

    /** Fetch size. (for fetchXxx()) Default value is 20. */
    protected int _fetchSize = 20;

    /** Fetch page number. (for fetchXxx()) This value should be plus. */
    protected int _fetchPageNumber = 1;

    /** Is fetch-narrowing effective? Default value is false. */
    protected boolean _isFetchScopeEffective = false;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     * 
     * @param tableName Table name. (NotNull)
     **/
    public LdAbstractSqlClause(String tableName) {
        if (tableName == null) {
            String msg = "Argument[tableName] must not be null.";
            throw new IllegalArgumentException(msg);
        }
        _tableName = tableName;
    }

    // =====================================================================================
    //                                                                                Clause
    //                                                                                ======
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Clause string. (NotNull)
     */
    public String getClause() {
        final StringBuffer sb = new StringBuffer(128);
        if (!_includedSelectColumnMap.isEmpty()) {
            sb.append(" ").append(getIncludedSelectColumnClause());
        }
        sb.append(getFromClause());
        sb.append(" ");
        sb.append(getFromHint());
        sb.append(" ");
        sb.append(getWhereClause());

        if (_isOrderByEffective && !_orderByClause.isEmpty()) {
            sb.append(" ");
            sb.append(getOrderByClause());
        }
        sb.append(" ");
        sb.append(getSqlSuffix());
        return sb.toString();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return select-hint. {select [select-hint] * from table...} (NotNull)
     */
    public String getSelectHint() {
        return createSelectHint();
    }

    public String getIncludedSelectColumnClause() {
        final StringBuffer sb = new StringBuffer();
        int count = 0;
        for (final java.util.Iterator ite = _includedSelectColumnMap.keySet().iterator(); ite.hasNext(); count++) {
            final String aliasName = (String)ite.next();
            final String realColumnName = (String)_includedSelectColumnMap.get(aliasName);
            sb.append(", ").append(realColumnName).append(" as ").append(aliasName);
        }
        return sb.toString();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return From clause. (NotNull)
     */
    public String getFromClause() {
        final StringBuffer sb = new StringBuffer();
        sb.append(" from ").append(_tableName);
        sb.append(getFromBaseTableHint());
        for (final java.util.Iterator ite = _outerJoinMap.values().iterator(); ite.hasNext(); ) {
            sb.append(" ").append((String)ite.next());
        }
        return sb.toString();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return from-base-table-hint. {select * from table [from-base-table-hint] where ...} (NotNull)
     */
    public String getFromBaseTableHint() {
        return createFromBaseTableHint();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return from-hint. {select * from table left outer join ... on ... [from-hint] where ...} (NotNull)
     */
    public String getFromHint() {
        return createFromHint();
    }

    public String getWhereClause() {
        final StringBuffer sb = new StringBuffer();
        int count = 0;
        for (final java.util.Iterator ite = _whereList.iterator(); ite.hasNext(); count++) {
            if (count == 0) {
                sb.append("where ").append((String)ite.next());
            } else {
                sb.append(" and ").append((String)ite.next());
            }
        }
        return sb.toString();
    }

    public String getOrderByClause() {
        return _orderByClause.getOrderByClause();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return sql-suffix. {select * from table where ... order by ... [sql-suffix]} (NotNull)
     */
    public String getSqlSuffix() {
        return createSqlSuffix();
    }

    // =====================================================================================
    //                                                                  IncludedSelectColumn
    //                                                                  ====================
    public LdSqlClause registerIncludedSelectColumn(String aliasName, String realColumnName) {
        _includedSelectColumnMap.put(aliasName, realColumnName);
        return this;
    }

    // =====================================================================================
    //                                                                             OuterJoin
    //                                                                             =========
    /**
     * This method implements the method that is declared at super.
     * 
     * @param joinTableName Join table name(outer join [joinTableName]). (NotNull)
     * @param aliasName Alias name of join table. (NotNull and Unique per invoking method.)
     * @param joinOnMap Map that has conditions of 'on' clause. (NotNull)
     * @return this. (NotNull)
     */
    public LdSqlClause registerOuterJoin(String joinTableName, String aliasName, java.util.Map<String, String> joinOnMap) {
        assertAlreadyOuterJoin(aliasName);

        final StringBuffer sb = new StringBuffer();
        sb.append("left outer join ").append(joinTableName).append(" ").append(aliasName).append(" on ");
        int count = 0;
        for (final java.util.Iterator ite = joinOnMap.keySet().iterator(); ite.hasNext(); count++) {
            final String localColumnName = (String)ite.next();
            final String foreignColumnName = (String)joinOnMap.get(localColumnName);
            if (count != 0) {
                sb.append(" and ");
            }
            sb.append(localColumnName).append(" = ").append(foreignColumnName);
        }
        _outerJoinMap.put(aliasName, sb.toString());
        return this;
    }

    /**
     * Assert whether the alias name have already registered in outer join.
     * 
     * @param aliasName Alias name.
     * @return this.
     */
    protected LdAbstractSqlClause assertAlreadyOuterJoin(String aliasName) {
        if (_outerJoinMap.containsKey(aliasName)) {
            String msg = "The alias name have already registered in outer join: " + aliasName;
            throw new IllegalStateException(msg);
        }
        return this;
    }

    // =====================================================================================
    //                                                                                 Where
    //                                                                                 =====
    /**
     * This method implements the method that is declared at super.
     * 
     * @param readColumnName Real-column-name([table-name].[column-name]). (NotNull)
     * @param key Condition key. (NotNull)
     * @param value Condition value. (NotNull)
     * @return this. (NotNull)
     */
    public LdSqlClause registerWhereClause(String readColumnName, LdConditionKey key, LdConditionValue value) {
        assertStringNotNullAndNotTrimmedEmpty("readColumnName", readColumnName);
        key.addWhereClause(_whereList, readColumnName, value);
        return this;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param clause Where-clause. (NotNull)
     * @return this. (NotNull)
     */
    public LdSqlClause registerWhereClause(String clause) {
        assertStringNotNullAndNotTrimmedEmpty("clause", clause);
        _whereList.add(clause);
        return this;
    }

    // =====================================================================================
    //                                                                               OrderBy
    //                                                                               =======
    /**
     * This method implements the method that is declared at super.
     * 
     * @return this. (NotNull)
     */
    public LdOrderByClause getSqlComponentOfOrderByClause() {
        return _orderByClause;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return this. (NotNull)
     */
    public LdSqlClause clearOrderBy() {
        _isOrderByEffective = false;
        _orderByClause.clear();
        return this;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return this. (NotNull)
     */
    public LdSqlClause ignoreOrderBy() {
        _isOrderByEffective = false;
        return this;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return this. (NotNull)
     */
    public LdSqlClause makeOrderByEffective() {
        _isOrderByEffective = true;
        return this;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @param registeredOrderByProperty Registered-order-by-property. ([table-name].[column-name]) (Nullable)
     * @param isAsc Is asc?
     * @return this. (NotNull)
     */
    public LdSqlClause reverseOrderBy_Or_OverrideOrderBy(String orderByProperty, String registeredOrderByProperty, boolean isAsc) {
        _isOrderByEffective = true;
        if (!_orderByClause.isSameOrderByColumn(orderByProperty)) {
            clearOrderBy();
            if (isAsc) {
                registerOrderBy(orderByProperty, registeredOrderByProperty, isAsc);
            } else {
                registerOrderBy(orderByProperty, registeredOrderByProperty, isAsc);
            }
            return this;
        }

        _orderByClause.reverseAll();
        return this;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param orderByProperty Order-by-property. 'aliasName.columnName/aliasName.columnName/...' (NotNull)
     * @param registeredOrderByProperty Registered-order-by-property. ([table-name].[column-name]) (Nullable)
     * @param isAsc Is asc?
     * @return this. (NotNull)
     */
    public LdSqlClause registerOrderBy(String orderByProperty, String registeredOrderByProperty, boolean isAsc) {
        try {
            _isOrderByEffective = true;
            final java.util.List<String> orderByList = new java.util.ArrayList<String>();
            {
                final  java.util.StringTokenizer st = new java.util.StringTokenizer(orderByProperty, "/");
                while (st.hasMoreElements()) {
                    orderByList.add(st.nextToken());
                }
            }

            if (registeredOrderByProperty == null || registeredOrderByProperty.trim().length() ==0) {
                registeredOrderByProperty = orderByProperty;
            }

            final java.util.List<String> registeredOrderByList = new java.util.ArrayList<String>();
            {
                final java.util.StringTokenizer st = new java.util.StringTokenizer(registeredOrderByProperty, "/");
                while (st.hasMoreElements()) {
                    registeredOrderByList.add(st.nextToken());
                }
            }

            int count = 0;
            for (final java.util.Iterator ite = orderByList.iterator(); ite.hasNext(); ) {
                String orderBy = (String)ite.next();
                String registeredOrderBy = (String)registeredOrderByList.get(count);

                _isOrderByEffective = true;
                String aliasName = null;
                String columnName = null;
                String registeredAliasName = null;
                String registeredColumnName = null;

                if (orderBy.indexOf(".") < 0) {
                    columnName = orderBy;
                } else {
                    aliasName = orderBy.substring(0, orderBy.lastIndexOf("."));
                    columnName = orderBy.substring(orderBy.lastIndexOf(".") + 1);
                }

                if (registeredOrderBy.indexOf(".") < 0) {
                    registeredColumnName = registeredOrderBy;
                } else {
                    registeredAliasName = registeredOrderBy.substring(0, registeredOrderBy.lastIndexOf("."));
                    registeredColumnName = registeredOrderBy.substring(registeredOrderBy.lastIndexOf(".") + 1);
                }

                LdOrderByElement element = new LdOrderByElement();
                element.setAliasName(aliasName);
                element.setColumnName(columnName);
                element.setRegisteredAliasName(registeredAliasName);
                element.setRegisteredColumnName(registeredColumnName);
                if (isAsc) {
                    element.setupAsc();
                } else {
                    element.setupDesc();
                }
                _orderByClause.addOrderByElement(element);

                count++;
            }
            return this;
        } catch (RuntimeException e) {
            String msg = "registerOrderBy() threw the exception: orderByProperty=" + orderByProperty;
            msg = msg + " registeredColumnFullName=" + registeredOrderByProperty;
            msg = msg + " isAsc=" + isAsc;
            msg = msg + " sqlClause=" + this.toString();
            throw new RuntimeException(msg, e);
        }
    }

    // =====================================================================================
    //                                                                               Advance
    //                                                                               =======
    /**
     * This method implements the method that is declared at super.
     * 
     * @param fetchSize Fetch-size. (NotMinus & NotZero)
     * @return this. (NotNull)
     */
    public LdSqlClause fetchFirst(int fetchSize) {
        _isFetchScopeEffective = true;
        if (fetchSize <= 0) {
            String msg = "Argument[fetchSize] must be plus: " + fetchSize;
            throw new IllegalArgumentException(msg);
        }
        _fetchStartIndex = 0;
        _fetchSize = fetchSize;
        _fetchPageNumber = 1;
        doClearFetchPageClause();
        doFetchFirst();
        return this;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param fetchStartIndex Fetch-start-index. 0 origin. (NotMinus)
     * @param fetchSize Fetch size. (NotMinus)
     * @return this. (NotNull)
     */
    public LdSqlClause fetchScope(int fetchStartIndex, int fetchSize) {
        _isFetchScopeEffective = true;
        if (fetchStartIndex < 0) {
            String msg = "Argument[fetchStartIndex] must be plus or zero: " + fetchStartIndex;
            throw new IllegalArgumentException(msg);
        }
        if (fetchSize <= 0) {
            String msg = "Argument[fetchSize] must be plus: " + fetchSize;
            throw new IllegalArgumentException(msg);
        }
        _fetchStartIndex = fetchStartIndex;
        _fetchSize = fetchSize;
        return fetchPage(1);
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param fetchPageNumber Page-number. 1 origin. (NotMinus & NotZero)
     * @return this. (NotNull)
     */
    public LdSqlClause fetchPage(int fetchPageNumber) {
        _isFetchScopeEffective = true;
        if (fetchPageNumber <= 0) {
            String msg = "Argument[fetchPageNumber] must be plus: " + fetchPageNumber;
            throw new IllegalArgumentException(msg);
        }
        if (_fetchSize <= 0) {
            String msg = "Fetch size must not be minus or zero when you invoke this method. ";
            msg = msg + "When you invoke this, it is necessary to invoke 'fetchFirst()' or 'fetchScope()' ahead of that. ";
            msg = msg + ": fetchPageNumber=" + fetchPageNumber + " _fetchSize=" + _fetchSize;
            throw new IllegalStateException(msg);
        }
        _fetchPageNumber = fetchPageNumber;
        if (_fetchPageNumber == 1 && _fetchStartIndex == 0) {
            return fetchFirst(_fetchSize);
        }
        doClearFetchPageClause();
        doFetchPage();
        return this;
    }

    /**
     * Do fetch first.
     */
    abstract protected void doFetchFirst();

    /**
     * Do fetch page.
     */
    abstract protected void doFetchPage();

    /**
     * Do clear fetch-page clause.
     */
    abstract protected void doClearFetchPageClause();

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Fetch start index.
     */
    public int getFetchStartIndex() {
        return _fetchStartIndex;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Fetch size.
     */
    public int getFetchSize() {
        return _fetchSize;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Fetch page number.
     */
    public int getFetchPageNumber() {
        return _fetchPageNumber;
    }

    /**
     * Get page start index.
     * 
     * @return Page start index. 0 origin. (NotMinus)
     */
    public int getPageStartIndex() {
        if (_fetchPageNumber <= 0) {
            String msg = "_fetchPageNumber must be plus: " + _fetchPageNumber;
            throw new IllegalStateException(msg);
        }
        return _fetchStartIndex + (_fetchSize * (_fetchPageNumber - 1));
    }

    /**
     * Get page end index.
     * 
     * @return Page end index. 0 origin. (NotMinus)
     */
    public int getPageEndIndex() {
        if (_fetchPageNumber <= 0) {
            String msg = "_fetchPageNumber must be plus: " + _fetchPageNumber;
            throw new IllegalStateException(msg);
        }
        return _fetchStartIndex + (_fetchSize * _fetchPageNumber);
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return this. (NotNull)
     */
    public LdSqlClause ignoreFetchScope() {
        _isFetchScopeEffective = false;
        doClearFetchPageClause();
        return this;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return this. (NotNull)
     */
    public LdSqlClause makeFetchScopeEffective() {
        _isFetchScopeEffective = true;
        if (getFetchPageNumber() > 0) {
            fetchPage(getFetchPageNumber());
        }
        return this;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Determination.
     */
    public boolean isFetchStartIndexSupported() {
        return true; // Default
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Determination.
     */
    public boolean isFetchSizeSupported() {
        return true; // Default
    }

    /**
     * Create select-hint.
     * 
     * @return Select-hint. {select [select-hint] * from table...} (NotNull)
     */
    abstract protected String createSelectHint();

    /**
     * Create from-base-table-hint.
     * 
     * @return From-hint. {select * from table [from-base-table-hint] where ...} (NotNull)
     */
    abstract protected String createFromBaseTableHint();

    /**
     * Create from-hint.
     * 
     * @return From-hint. {select * from table left outer join ... on ... [from-hint] where ...} (NotNull)
     */
    abstract protected String createFromHint();

    /**
     * Create sql-suffix.
     * 
     * @return Sql-suffix. {select * from table where ... order by ... [sql-suffix]} (NotNull)
     */
    abstract protected String createSqlSuffix();

    // =====================================================================================
    //                                                                        FetchNarrowing
    //                                                                        ==============
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Fetch-narrowing start-index.
     */
    public int getFetchNarrowingSkipStartIndex() {
        if (isFetchStartIndexSupported()) {
            return 0;
        } else {
            return getPageStartIndex();
        }
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Fetch-narrowing size.
     */
    public int getFetchNarrowingLoopCount() {
        return getFetchSize();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Determiantion.
     */
    public boolean isFetchNarrowingEffective() {
        return _isFetchScopeEffective;
    }

    // =====================================================================================
    //                                                                         Helper Method
    //                                                                         =============
    // ----------------------------------------------------------------
    //                                                    Assert Object
    //                                                    -------------
    /**
     * Assert that the object is not null.
     * 
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     * @exception IllegalArgumentException
     */
    protected void assertObjectNotNull(String variableName, Object value) {
        if (variableName == null) {
            String msg = "The value should not be null: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            String msg = "The value should not be null: variableName=" + variableName;
            throw new IllegalArgumentException(msg);
        }
    }

    // ----------------------------------------------------------------
    //                                                    Assert String
    //                                                    -------------
    /**
     * Assert that the entity is not null and not trimmed empty.
     * 
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     */
    protected void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        assertObjectNotNull("variableName", variableName);
        assertObjectNotNull("value", value);
        if (value.trim().length() ==0) {
            String msg = "The value should not be empty: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
    }
}

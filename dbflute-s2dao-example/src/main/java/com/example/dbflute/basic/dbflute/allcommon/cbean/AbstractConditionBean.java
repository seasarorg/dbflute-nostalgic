package com.example.dbflute.basic.dbflute.allcommon.cbean;

import java.util.List;
import java.util.Map;
import java.lang.reflect.Method;

import com.example.dbflute.basic.dbflute.allcommon.cbean.ConditionBeanContext;
import com.example.dbflute.basic.dbflute.allcommon.helper.MapListString;
import com.example.dbflute.basic.dbflute.allcommon.helper.MapListStringImpl;
import com.example.dbflute.basic.dbflute.allcommon.cbean.sqlclause.OrderByClause;
import com.example.dbflute.basic.dbflute.allcommon.cbean.sqlclause.SqlClause;
import com.example.dbflute.basic.dbflute.allcommon.cbean.sqlclause.WhereClauseSimpleFilter;
import com.example.dbflute.basic.dbflute.allcommon.dbmeta.DBMeta;
import com.example.dbflute.basic.dbflute.allcommon.dbmeta.DBMetaProvider;
import com.example.dbflute.basic.dbflute.allcommon.dbmeta.info.ColumnInfo;
import com.example.dbflute.basic.dbflute.allcommon.jdbc.StatementConfig;
import com.example.dbflute.basic.dbflute.allcommon.util.SimpleStringUtil;
import com.example.dbflute.basic.dbflute.allcommon.util.SimpleSystemUtil;

/**
 * The condition-bean as abstract.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractConditionBean implements ConditionBean {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** Map-string map-mark. */
    private static final String MAP_STRING_MAP_MARK = "map:";

    /** Map-string list-mark. */
    private static final String MAP_STRING_LIST_MARK = "list:";

    /** Map-string start-brace. */
    private static final String MAP_STRING_START_BRACE = "@{";

    /** Map-string end-brace. */
    private static final String MAP_STRING_END_BRACE = "@}";

    /** Map-string delimiter. */
    private static final String MAP_STRING_DELIMITER = "@;";

    /** Map-string equal. */
    private static final String MAP_STRING_EQUAL = "@=";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SQL clause instance. */
    protected final SqlClause _sqlClause;
    {
        _sqlClause = createSqlClause();
    }

    /** Safety max result size. */
    protected int _safetyMaxResultSize;
    
    /** The config of statement. (Nullable) */
    protected StatementConfig _statementConfig;

    /** Can the paging re-select? */
    protected boolean _canPagingReSelect = true;

    // [DBFlute-0.7.4] @jflute -- At the future, I'll implement some check logics by these purpose types.
    protected boolean _forDerivedReferrer;
    protected boolean _forScalarSelect;
    protected boolean _forScalarSubQuery;
    protected boolean _forUnion;
    protected boolean _forExistsSubQuery;
    protected boolean _forInScopeSubQuery;

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    /**
     * {@inheritDoc}
     * @return Sql clause. (NotNull)
     */
    public SqlClause getSqlClause() {
        return _sqlClause;
    }

    /**
     * Create SQL clause. {for condition-bean}
     * @param cb Condition-bean. (NotNull) 
     * @return SQL clause. (NotNull)
     */
    protected abstract SqlClause createSqlClause();

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    /**
     * Get the provider of DB meta.
     * @return The provider of DB meta. (NotNull)
     */
    protected abstract DBMetaProvider getDBMetaProvider();

    // ===================================================================================
    //                                                                 Where Clause Filter
    //                                                                 ===================
    public void addWhereClauseSimpleFilter(WhereClauseSimpleFilter whereClauseSimpleFilter) {
        this._sqlClause.addWhereClauseSimpleFilter(whereClauseSimpleFilter);
    }

    // ===================================================================================
    //                                                                   Accept PrimaryKey
    //                                                                   =================
    /**
     * {@inheritDoc}
     * @param primaryKeyMapString Primary-key map. (NotNull and NotEmpty)
     */
    public void acceptPrimaryKeyMapString(String primaryKeyMapString) {
        if (primaryKeyMapString == null) {
            String msg = "The argument[primaryKeyMapString] must not be null.";
            throw new IllegalArgumentException(msg);
        }
        final String prefix = MAP_STRING_MAP_MARK + MAP_STRING_START_BRACE;
        final String suffix = MAP_STRING_END_BRACE;
        if (!primaryKeyMapString.trim().startsWith(prefix)) {
            primaryKeyMapString = prefix + primaryKeyMapString;
        }
        if (!primaryKeyMapString.trim().endsWith(suffix)) {
            primaryKeyMapString = primaryKeyMapString + suffix;
        }
        MapListString mapListString = new MapListStringImpl();
        mapListString.setMapMark(MAP_STRING_MAP_MARK);
        mapListString.setListMark(MAP_STRING_LIST_MARK);
        mapListString.setDelimiter(MAP_STRING_DELIMITER);
        mapListString.setStartBrace(MAP_STRING_START_BRACE);
        mapListString.setEndBrace(MAP_STRING_END_BRACE);
        mapListString.setEqual(MAP_STRING_EQUAL);
        acceptPrimaryKeyMap(mapListString.generateMap(primaryKeyMapString));
    }

    protected void checkTypeString(Object value, String propertyName, String typeName) {
        if (value == null) {
            throw new IllegalArgumentException("The value should not be null: " + propertyName);
        }
        if (!(value instanceof String)) {
            String msg = "The value of " + propertyName + " should be " + typeName + " or String: ";
            msg = msg + "valueType=" + value.getClass() + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
    }

    protected long parseDateStringAsMillis(Object value, String propertyName, String typeName) {
        checkTypeString(value, propertyName, typeName);
        try {
            final String valueString = (String)value;
            if (valueString.indexOf("-") >= 0 && valueString.indexOf("-") != valueString.lastIndexOf("-")) {
                return java.sql.Timestamp.valueOf(valueString).getTime();
            } else {
                return getParseDateFormat().parse((String)value).getTime();
            }
        } catch (java.text.ParseException e) {
            String msg = "The value of " + propertyName + " should be " + typeName + ". but: " + value;
            throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
        } catch (RuntimeException e) {
            String msg = "The value of " + propertyName + " should be " + typeName + ". but: " + value;
            throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
        }
    }

    private java.text.DateFormat getParseDateFormat() {
        return java.text.DateFormat.getDateTimeInstance();
    }

    // ===================================================================================
    //                                                        Implementation of PagingBean
    //                                                        ============================
    // -----------------------------------------------------
    //                                  Paging Determination
    //                                  --------------------
    // * * * * * * * *
    // For SQL Comment
    // * * * * * * * *
    /**
     * {@inheritDoc}
     * @return Determination.
     */
    public boolean isPaging() {
        String msg = "This method is unsupported on ConditionBean!";
        throw new UnsupportedOperationException(msg);
    }

    // * * * * * * * *
    // For Framework
    // * * * * * * * *
    /**
     * {@inheritDoc}
     * @return Determination.
     */
    public boolean isCountLater() {
        String msg = "This method is unsupported on ConditionBean!";
        throw new UnsupportedOperationException(msg);
    }

    // -----------------------------------------------------
    //                                        Paging Setting
    //                                        --------------
    /**
     * {@inheritDoc}
     * @param pageSize The page size per one page. (NotMinus & NotZero)
     * @param pageNumber The number of page. It's ONE origin. (NotMinus & NotZero: If it's minus or zero, it treats as one.)
     */
    public void paging(int pageSize, int pageNumber) {
        fetchFirst(pageSize);
        fetchPage(pageNumber);
    }
    
    /**
     * {@inheritDoc}
     * @param paging Determination.
     */
    public void xsetPaging(boolean paging) {// Very Internal!
        String msg = "This method is unsupported on ConditionBean!";
        throw new UnsupportedOperationException(msg);
    }

    /**
     * {@inheritDoc}
     */
    public void disablePagingReSelect() {
        _canPagingReSelect = false;
    }

    /**
     * {@inheritDoc}
     * @return Can the paging re-select execute?
     */
    public boolean canPagingReSelect() {
        return _canPagingReSelect;
    }

    // -----------------------------------------------------
    //                                         Fetch Setting
    //                                         -------------
    /**
     * {@inheritDoc}
     * @param fetchSize Fetch-size. (NotMinus & NotZero)
     * @return this. (NotNUll)
     */
    public PagingBean fetchFirst(int fetchSize) {
        getSqlClause().fetchFirst(fetchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     * @param fetchStartIndex Fetch-start-index. 0 origin. (NotMinus)
     * @param fetchSize Fetch-size. (NotMinus & NotZero)
     * @return this. (NotNUll)
     */
    public PagingBean fetchScope(int fetchStartIndex, int fetchSize) {
        getSqlClause().fetchScope(fetchStartIndex, fetchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     * @param fetchPageNumber Fetch-page-number. 1 origin. (NotMinus & NotZero: If minus or zero, set one.)
     * @return this. (NotNull)
     */
    public PagingBean fetchPage(int fetchPageNumber) {
        getSqlClause().fetchPage(fetchPageNumber);
        return this;
    }

    // -----------------------------------------------------
    //                                        Fetch Property
    //                                        --------------
    /**
     * {@inheritDoc}
     * @return Fetch-start-index.
     */
    public int getFetchStartIndex() {
        return getSqlClause().getFetchStartIndex();
    }

    /**
     * {@inheritDoc}
     * @return Fetch-size.
     */
    public int getFetchSize() {
        return getSqlClause().getFetchSize();
    }

    /**
     * {@inheritDoc}
     * @return Fetch-page-number.
     */
    public int getFetchPageNumber() {
        return getSqlClause().getFetchPageNumber();
    }

    /**
     * {@inheritDoc}
     * @return Page start index. 0 origin. (NotMinus)
     */
    public int getPageStartIndex() {
        return getSqlClause().getPageStartIndex();
    }

    /**
     * {@inheritDoc}
     * @return Page end index. 0 origin. (NotMinus)
     */
    public int getPageEndIndex() {
        return getSqlClause().getPageEndIndex();
    }

    /**
     * Is fetch scope effective?
     * @return Determiantion.
     */
    public boolean isFetchScopeEffective() {
        return getSqlClause().isFetchScopeEffective();
    }

    // -----------------------------------------------------
    //                                         Hint Property
    //                                         -------------
    /**
     * Get select-hint. {select [select-hint] * from table...}
     * @return select-hint. (NotNull)
     */
    public String getSelectHint() {
        return getSqlClause().getSelectHint();
    }

    /**
     * Get from-base-table-hint. {select * from table [from-base-table-hint] where ...}
     * @return from-base-table-hint. (NotNull)
     */
    public String getFromBaseTableHint() {
        return getSqlClause().getFromBaseTableHint();
    }

    /**
     * Get from-hint. {select * from table left outer join ... on ... [from-hint] where ...}
     * @return from-hint. (NotNull)
     */
    public String getFromHint() {
        return getSqlClause().getFromHint();
    }

    /**
     * Get sql-suffix. {select * from table where ... order by ... [sql-suffix]}
     * @return Sql-suffix.  (NotNull)
     */
    public String getSqlSuffix() {
        return getSqlClause().getSqlSuffix();
    }

    // ===================================================================================
    //                                                Implementation of FetchNarrowingBean
    //                                                ====================================
    /**
     * {@inheritDoc}
     * @return Fetch start index.
     */
    public int getFetchNarrowingSkipStartIndex() {
        return getSqlClause().getFetchNarrowingSkipStartIndex();
    }

    /**
     * {@inheritDoc}
     * @return Fetch size.
     */
    public int getFetchNarrowingLoopCount() {
        return getSqlClause().getFetchNarrowingLoopCount();
    }

    /**
     * {@inheritDoc}
     * @return Determination.
     */
    public boolean isFetchNarrowingSkipStartIndexEffective() {
        return !getSqlClause().isFetchStartIndexSupported();
    }

    /**
     * {@inheritDoc}
     * @return Determination.
     */
    public boolean isFetchNarrowingLoopCountEffective() {
        return !getSqlClause().isFetchSizeSupported();
    }

    /**
     * {@inheritDoc}
     * @return Determiantion.
     */
    public boolean isFetchNarrowingEffective() {
        return getSqlClause().isFetchNarrowingEffective();
    }

    /**
     * Ignore fetch narrowing. Only checking safety result size is valid. {INTERNAL METHOD}
     */
    public void ignoreFetchNarrowing() {
        String msg = "This method is unsupported on ConditionBean!";
        throw new UnsupportedOperationException(msg);
    }

    /**
     * Restore ignored fetch narrowing. {INTERNAL METHOD}
     */
    public void restoreIgnoredFetchNarrowing() {
        // Do nothing!
    }

    /**
     * Get safety max result size.
     * @return Safety max result size.
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    /**
     * Check safety result.
     * @param safetyMaxResultSize Safety max result size. (If zero or minus, ignore checking)
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        this._safetyMaxResultSize = safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                       Implementation of OrderByBean
    //                                                       =============================
    /**
     * {@inheritDoc}
     * @return Sql component of order-by clause. (NotNull)
     */
    public OrderByClause getSqlComponentOfOrderByClause() {
        return getSqlClause().getSqlComponentOfOrderByClause();
    }

    /**
     * {@inheritDoc}
     * @return Order-by clause. (NotNull)
     */
    public String getOrderByClause() {
        return _sqlClause.getOrderByClause();
    }

    /**
     * {@inheritDoc}
     * @return this. (NotNull)
     */
    public OrderByBean clearOrderBy() {
        getSqlClause().clearOrderBy();
        return this;
    }

    /**
     * {@inheritDoc}
     * @return this. (NotNull)
     */
    public OrderByBean ignoreOrderBy() {
        getSqlClause().ignoreOrderBy();
        return this;
    }

    /**
     * {@inheritDoc}
     * @return this. (NotNull)
     */
    public OrderByBean makeOrderByEffective() {
        getSqlClause().makeOrderByEffective();
        return this;
    }

    // ===================================================================================
    //                                                                        Lock Setting
    //                                                                        ============
    /**
     * {@inheritDoc}
     * @return this. (NotNull)
     */
    public ConditionBean lockForUpdate() {
        getSqlClause().lockForUpdate();
        return this;
    }
    
    // ===================================================================================
    //                                                                        Select Count
    //                                                                        ============
    /**
     * Set up various things for select-count-ignore-fetch-scope. {Internal}
     * This method is for INTERNAL. Don't invoke this!
     * @return this. (NotNull)
     */
    public ConditionBean xsetupSelectCountIgnoreFetchScope() {
        _isSelectCountIgnoreFetchScope = true;

        getSqlClause().classifySelectClauseType(SqlClause.SelectClauseType.COUNT);
        getSqlClause().ignoreOrderBy();
        getSqlClause().ignoreFetchScope();
        return this;
    }

    /**
     * Do after-care for select-count-ignore-fetch-scope. {Internal}
     * This method is for INTERNAL. Don't invoke this!
     * @return this. (NotNull)
     */
    public ConditionBean xafterCareSelectCountIgnoreFetchScope() {
        _isSelectCountIgnoreFetchScope = false;

        getSqlClause().rollbackSelectClauseType();
        getSqlClause().makeOrderByEffective();
        getSqlClause().makeFetchScopeEffective();
        return this;
    }

    /** Is set up various things for select-count-ignore-fetch-scope? */
    protected boolean _isSelectCountIgnoreFetchScope;

    /**
     * Is set up various things for select-count-ignore-fetch-scope?
     * This method is for INTERNAL. Don't invoke this!
     * @return Determination.
     */
    public boolean isSelectCountIgnoreFetchScope() {
        return _isSelectCountIgnoreFetchScope;
    }
    
    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected static abstract class AbstractSpecification<CQ extends ConditionQuery> {
        protected ConditionBean _baseCB;
        protected SpQyCall<CQ> _qyCall;
        protected CQ _query;
        protected boolean _forDerivedReferrer;
        protected boolean _forScalarSelect;
        protected boolean _forScalarSubQuery;
        protected boolean _alreadySpecifyRequiredColumn;
        protected DBMetaProvider _dbmetaProvider;

        /**
         * @param baseCB The condition-bean of base level. (NotNull)
         * @param qyCall The call-back for condition-query. (NotNull)
         * @param forDerivedReferrer Is this for derive referrer?
         * @param forScalarSelect Is this for scalar select?
         * @param forScalarSubQuery  Is this for scalar sub-query?
         * @param dbmetaProvider The provider of DB meta. (NotNull)
         */
        protected AbstractSpecification(ConditionBean baseCB, SpQyCall<CQ> qyCall
                                      , boolean forDerivedReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                                      , DBMetaProvider dbmetaProvider) {
            _baseCB = baseCB;
            _qyCall = qyCall;
            _forDerivedReferrer = forDerivedReferrer;
            _forScalarSelect = forScalarSelect;
            _forScalarSubQuery = forScalarSubQuery;
            _dbmetaProvider = dbmetaProvider;
        }

        protected void doColumn(String columnName) {
            assertColumn(columnName);
            if (_query == null) { _query = _qyCall.qy(); }
            if (isRequiredColumnSpecificationEnabled()) {
                _alreadySpecifyRequiredColumn = true;
                doSpecifyRequiredColumn();
            }
            String relationPath = _query.getRelationPath() != null ? _query.getRelationPath() : "";
            final String tableAliasName;
            if (_query.isBaseQuery(_query)) {
                tableAliasName = _baseCB.getSqlClause().getLocalTableAliasName();
            } else {
                tableAliasName = _baseCB.getSqlClause().resolveJoinAliasName(relationPath, _query.getNestLevel());
            }
            _baseCB.getSqlClause().specifySelectColumn(tableAliasName, columnName);
        }

        protected boolean isRequiredColumnSpecificationEnabled() {
            return !_forDerivedReferrer && !_forScalarSelect && !_forScalarSubQuery && !_alreadySpecifyRequiredColumn;
        }

        protected void assertColumn(String columnName) {
            if (_query == null && !_qyCall.has()) { throwSpecifyColumnNotSetupSelectColumnException(columnName); }
        }

        protected void assertForeign(String foreignPropertyName) {
            if (_forDerivedReferrer) { throwDerivedReferrerInvalidForeignSpecificationException(foreignPropertyName); }
            if (_forScalarSelect) { throwScalarSelectInvalidForeignSpecificationException(foreignPropertyName); }
            if (_forScalarSubQuery) { throwScalarSubQueryInvalidForeignSpecificationException(foreignPropertyName); }
        }

        protected abstract void doSpecifyRequiredColumn();
        protected abstract String getTableDbName();
        
        protected void throwSpecifyColumnNotSetupSelectColumnException(String columnName) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "You specified the column that had Not been Set up!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "You should call setupSelect_[ForeignTable]() before calling specify[ForeignTable]().column[TargetColumn]()." + getLineSeparator();
            msg = msg + "  For example:" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Wrong]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.specify().specifyMemberStatus().columnMemberStatusName(); // *No!" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Good!]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.setupSelect_MemberStatus(); // *Point!" + getLineSeparator();
            msg = msg + "    cb.specify().specifyMemberStatus().columnMemberStatusName();" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[ConditionBean]" + getLineSeparator() + _baseCB.getClass().getName() + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Specified Column]" + getLineSeparator() + getTableDbName() + "." + columnName + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new SpecifyColumnNotSetupSelectColumnException(msg);
        }

        protected void throwDerivedReferrerInvalidForeignSpecificationException(String foreignPropertyName) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "You specified a foreign table column in spite of derived-referrer!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "You should specified a local table column at condition-bean for derived-referrer." + getLineSeparator();
            msg = msg + "  For example(for SpecifyDerivedReferrer):" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Wrong]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {" + getLineSeparator();
            msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
            msg = msg + "            subCB.specify().specifyProduct().columnProductName(); // *No!" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    }, \"LATEST_PURCHASE_DATETIME\");" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Good!]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.specify().derivedPurchaseList().max(new SubQuery<PurchaseCB>() {" + getLineSeparator();
            msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
            msg = msg + "            subCB.specify().columnPurchaseDatetime();// *Point!" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    }, \"LATEST_PURCHASE_DATETIME\");" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Specified Foreign Property]" + getLineSeparator() + foreignPropertyName + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new DerivedReferrerInvalidForeignSpecificationException(msg);
        }

        protected void throwScalarSelectInvalidForeignSpecificationException(String foreignPropertyName) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "You specified a foreign table column in spite of scalar select!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "You should specified a local table column at condition-bean for scalar select." + getLineSeparator();
            msg = msg + "  For example:" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Wrong]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    memberBhv.scalarSelect(Integer.class).max(new ScalarSelect<MemberCB>() {" + getLineSeparator();
            msg = msg + "        public void query(MemberCB cb) {" + getLineSeparator();
            msg = msg + "            cb.specify().specifyMemberStatus().columnDisplayOrder(); // *No!" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    });" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Good!]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    memberBhv.scalarSelect(Date.class).max(new ScalarSelect() {" + getLineSeparator();
            msg = msg + "        public void query(MemberCB cb) {" + getLineSeparator();
            msg = msg + "            cb.specify().columnMemberBirthday(); // *Point!" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    });" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Specified Foreign Property]" + getLineSeparator() + foreignPropertyName + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new ScalarSelectInvalidForeignSpecificationException(msg);
        }

        protected void throwScalarSubQueryInvalidForeignSpecificationException(String foreignPropertyName) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "You specified a foreign table column in spite of derived-query!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "You should specified a local table column at condition-bean for derived-query." + getLineSeparator();
            msg = msg + "  For example:" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Wrong]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.query().scalar_Equal().max(new SubQuery<MemberCB>() {" + getLineSeparator();
            msg = msg + "        public void query(MemberCB subCB) {" + getLineSeparator();
            msg = msg + "            subCB.specify().specifyMemberStatusName().columnDisplayOrder(); // *No!" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    });" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Good!]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.query().scalar_Equal().max(new SubQuery<MemberCB>() {" + getLineSeparator();
            msg = msg + "        public void query(MemberCB subCB) {" + getLineSeparator();
            msg = msg + "            subCB.specify().columnMemberBirthday();// *Point!" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    });" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Specified Foreign Property]" + getLineSeparator() + foreignPropertyName + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new ScalarSubQueryInvalidForeignSpecificationException(msg);
        }

        protected String getLineSeparator() {
            return SimpleSystemUtil.getLineSeparator();
        }
    }
    
    protected static interface SpQyCall<CQ extends ConditionQuery> {
        public boolean has(); 
        public CQ qy(); 
    }
    
    public static class SpecifyColumnNotSetupSelectColumnException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public SpecifyColumnNotSetupSelectColumnException(String msg) {
            super(msg);
        }
    }
    
    public static class DerivedReferrerInvalidForeignSpecificationException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public DerivedReferrerInvalidForeignSpecificationException(String msg) {
            super(msg);
        }
    }
    
    public static class ScalarSubQueryInvalidForeignSpecificationException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public ScalarSubQueryInvalidForeignSpecificationException(String msg) {
            super(msg);
        }
    }
    
    public static class ScalarSelectInvalidForeignSpecificationException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public ScalarSelectInvalidForeignSpecificationException(String msg) {
            super(msg);
        }
    }

    public static class RAFunction<REFERRER_CB extends ConditionBean, LOCAL_CQ extends ConditionQuery> {
        protected ConditionBean _baseCB;
        protected LOCAL_CQ _localCQ;
        protected RAQSetupper<REFERRER_CB, LOCAL_CQ> _querySetupper;
        protected DBMetaProvider _dbmetaProvider;

        public RAFunction(ConditionBean baseCB
                        , LOCAL_CQ localCQ
                        , RAQSetupper<REFERRER_CB, LOCAL_CQ> querySetupper
                        , DBMetaProvider dbmetaProvider) {
            _baseCB = baseCB;
            _localCQ = localCQ;
            _querySetupper = querySetupper;
            _dbmetaProvider = dbmetaProvider;
        }

        /**
         * Set up the sub query of referrer for the scalar 'count'.
         * <pre>
         * cb.specify().derivePurchaseList().count(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchaseDatetime(); // *Point! (Basically PK)
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }, \"LATEST_PURCHASE_DATETIME\");
         * </pre> 
         * @param subQuery The sub query of referrer. (NotNull)
         * @param aliasName The alias of the name. The property should exists on the entity. (NotNull)
         */
        public void count(SubQuery<REFERRER_CB> subQuery, String aliasName) {
            assertAliasName(aliasName);
            _querySetupper.setup("count", subQuery, _localCQ, aliasName.trim());
        }

        /**
         * Set up the sub query of referrer for the scalar 'count(with distinct)'.
         * <pre>
         * cb.specify().derivePurchaseList().countDistinct(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchaseDatetime(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }, \"LATEST_PURCHASE_DATETIME\");
         * </pre> 
         * @param subQuery The sub query of referrer. (NotNull)
         * @param aliasName The alias of the name. The property should exists on the entity. (NotNull)
         */
        public void countDistinct(SubQuery<REFERRER_CB> subQuery, String aliasName) {
            assertAliasName(aliasName);
            _querySetupper.setup("count(distinct", subQuery, _localCQ, aliasName.trim());
        }

        /**
         * Set up the sub query of referrer for the scalar 'max'.
         * <pre>
         * cb.specify().derivePurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchaseDatetime(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }, \"LATEST_PURCHASE_DATETIME\");
         * </pre> 
         * @param subQuery The sub query of referrer. (NotNull)
         * @param aliasName The alias of the name. The property should exists on the entity. (NotNull)
         */
        public void max(SubQuery<REFERRER_CB> subQuery, String aliasName) {
            assertAliasName(aliasName);
            _querySetupper.setup("max", subQuery, _localCQ, aliasName.trim());
        }

        /**
         * Set up the sub query of referrer for the scalar 'min'.
         * <pre>
         * cb.specify().derivePurchaseList().min(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchaseDatetime(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }, \"LATEST_PURCHASE_DATETIME\");
         * </pre> 
         * @param subQuery The sub query of referrer. (NotNull)
         * @param aliasName The alias of the name. The property should exists on the entity. (NotNull)
         */
        public void min(SubQuery<REFERRER_CB> subQuery, String aliasName) {
            assertAliasName(aliasName);
            _querySetupper.setup("min", subQuery, _localCQ, aliasName.trim());
        }
        
        /**
         * Set up the sub query of referrer for the scalar 'sum'.
         * <pre>
         * cb.specify().derivePurchaseList().sum(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }, \"SUMMARY_PURCHASE_PRICE\");
         * </pre> 
         * @param subQuery The sub query of referrer. (NotNull)
         * @param aliasName The alias of the name. The property should exists on the entity. (NotNull)
         */
        public void sum(SubQuery<REFERRER_CB> subQuery, String aliasName) {
            assertAliasName(aliasName);
            _querySetupper.setup("sum", subQuery, _localCQ, aliasName.trim());
        }
        
        /**
         * Set up the sub query of referrer for the scalar 'avg'.
         * <pre>
         * cb.specify().derivePurchaseList().avg(new SubQuery&lt;PurchaseCB&gt;() {
         *     public void query(PurchaseCB subCB) {
         *         subCB.specify().columnPurchasePrice(); // *Point!
         *         subCB.query().setPaymentCompleteFlg_Equal_True();
         *     }
         * }, \"AVERAGE_PURCHASE_PRICE\");
         * </pre> 
         * @param subQuery The sub query of referrer. (NotNull)
         * @param aliasName The alias of the name. The property should exists on the entity. (NotNull)
         */
        public void avg(SubQuery<REFERRER_CB> subQuery, String aliasName) {
            assertAliasName(aliasName);
            _querySetupper.setup("avg", subQuery, _localCQ, aliasName.trim());
        }

        protected void assertAliasName(String aliasName) {
            if (aliasName == null || aliasName.trim().length() == 0) {
                throwDerivedReferrerInvalidAliasNameException();
            }
            String tableDbName = _baseCB.getTableDbName();
            DBMeta dbmeta = _dbmetaProvider.provideDBMetaChecked(tableDbName);
            Method[] methods = dbmeta.getEntityType().getMethods();
            String targetMethodName = "set" + replaceString(aliasName, "_", "").toLowerCase();
            boolean existsSetterMethod = false;
            for (Method method : methods) {
                if (!method.getName().startsWith("set")) {
                    continue;
                }
                if (targetMethodName.equals(method.getName().toLowerCase())) {
                    existsSetterMethod = true;
                    break;
                }
            }
            if (!existsSetterMethod) {
                throwDerivedReferrerEntityPropertyNotFoundException(aliasName, dbmeta.getEntityType());
            }
        }

        protected void throwDerivedReferrerInvalidAliasNameException() {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The alias name for derived-referrer was Invalid!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "You should set valid alias name. {NotNull, NotEmpty}" + getLineSeparator();
            msg = msg + "  For example:" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Wrong]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.specify().derivePurchaseList().max(new SubQuery<PurchaseCB>() {" + getLineSeparator();
            msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
            msg = msg + "            subCB.specify().columnPurchaseDatetime();" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    }, null); // *No! {null, \"\", \"   \"} are NG!" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Good!]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.specify().derivePurchaseList().max(new SubQuery<PurchaseCB>() {" + getLineSeparator();
            msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
            msg = msg + "            subCB.specify().columnPurchaseDatetime();" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    }, \"LATEST_PURCHASE_DATETIME\"); // *Point!" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Local Table]" + getLineSeparator() + _localCQ.getTableDbName() + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new DerivedReferrerInvalidAliasNameException(msg);
        }

        protected void throwDerivedReferrerEntityPropertyNotFoundException(String aliasName, Class<?> entityType) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "A property for derived-referrer was Not Found in the entity!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "You should implement a property(setter and getter) in the entity." + getLineSeparator();
            msg = msg + "Or you should confirm whether the alias name has typo or not." + getLineSeparator();
            msg = msg + "  For example:" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [ConditionBean Invoking]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.specify().derivePurchaseList().max(new SubQuery<PurchaseCB>() {" + getLineSeparator();
            msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
            msg = msg + "            subCB.specify().columnPurchaseDatetime();" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    }, \"LATEST_PURCHASE_DATETIME\");" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Extended Entity]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    // At the entity of Purchase..." + getLineSeparator();
            msg = msg + "    protected Date _latestPurchaseDatetime;" + getLineSeparator();
            msg = msg + "    public Date getLatestPurchaseDatetime() {" + getLineSeparator();
            msg = msg + "        return _latestPurchaseDatetime;" + getLineSeparator();
            msg = msg + "    }" + getLineSeparator();
            msg = msg + "    public void setLatestPurchaseDatetime(Date latestPurchaseDatetime) {" + getLineSeparator();
            msg = msg + "        _latestPurchaseDatetime = latestPurchaseDatetime;" + getLineSeparator();
            msg = msg + "    }" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Alias Name]" + getLineSeparator() + aliasName + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Target Entity]" + getLineSeparator() + entityType + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new DerivedReferrerEntityPropertyNotFoundException(msg);
        }
        protected String replaceString(String text, String fromText, String toText) {
            return SimpleStringUtil.replace(text, fromText, toText);
        }
        protected String getLineSeparator() {
            return SimpleSystemUtil.getLineSeparator();
        }
    }

    public static interface RAQSetupper<REFERRER_CB extends ConditionBean, LOCAL_CQ extends ConditionQuery> {
        public void setup(String function, SubQuery<REFERRER_CB> subQuery, LOCAL_CQ cq, String aliasName);
    }
    
    public static class DerivedReferrerInvalidAliasNameException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public DerivedReferrerInvalidAliasNameException(String msg) {
            super(msg);
        }
    }
    
    public static class DerivedReferrerEntityPropertyNotFoundException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public DerivedReferrerEntityPropertyNotFoundException(String msg) {
            super(msg);
        }
    }

    // =====================================================================================
    //                                                                      Statement Config
    //                                                                      ================
    /**
     * @param statementConfig The config of statement. (Nullable)
     */
    public void configure(StatementConfig statementConfig) {
        _statementConfig = statementConfig;
    }
    
    /**
     * @return The config of statement. (Nullable)
     */
    public StatementConfig getStatementConfig() {
        return _statementConfig;
    }

    // ===================================================================================
    //                                                                         Display SQL
    //                                                                         ===========
    /**
     * Convert this conditionBean to SQL for display.
     * @return SQL for display. (NotNull and NotEmpty)
     */
    public String toDisplaySql() {
        return ConditionBeanContext.convertConditionBean2DisplaySql(this, getLogDateFormat(), getLogTimestampFormat());
    }
    protected abstract String getLogDateFormat();
    protected abstract String getLogTimestampFormat();
    
    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    public void xsetupForDerivedReferrer() { // Very Internal
        _forDerivedReferrer = true;
    }

    public void xsetupForScalarSelect() { // Very Internal
        _forScalarSelect = true;
    }

    public void xsetupForScalarSubQuery() { // Very Internal
        _forScalarSubQuery = true;
    }

    public void xsetupForUnion() { // Very Internal
        _forUnion = true;
    }

    public void xsetupForExistsSubQuery() { // Very Internal
        _forExistsSubQuery = true;
    }

    public void xsetupForInScopeSubQuery() { // Very Internal
        _forInScopeSubQuery = true;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected void doSetupSelect(SsCall callback) {
        String foreignPropertyName = callback.qf().getForeignPropertyName();
        assertSetupSelectBeforeUnion(foreignPropertyName);
        String foreignTableAliasName = callback.qf().getRealAliasName();
        String localRelationPath = localCQ().getRelationPath();
        getSqlClause().registerSelectedSelectColumn(foreignTableAliasName, getTableDbName(), foreignPropertyName, localRelationPath);
        getSqlClause().registerSelectedForeignInfo(callback.qf().getRelationPath(), foreignPropertyName);
    }
    
    protected static interface SsCall {
        public ConditionQuery qf();
    }
    
    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void assertPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        if (primaryKeyMap == null) {
            String msg = "The argument[primaryKeyMap] must not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (primaryKeyMap.isEmpty()) {
            String msg = "The argument[primaryKeyMap] must not be empty.";
            throw new IllegalArgumentException(msg);
        }
        DBMeta dbmeta = getDBMetaProvider().provideDBMetaChecked(getTableDbName());
        List<ColumnInfo> columnInfoList = dbmeta.getPrimaryUniqueInfo().getUniqueColumnList();
        for (ColumnInfo columnInfo : columnInfoList) {
            String columnDbName = columnInfo.getColumnDbName();
            if (!primaryKeyMap.containsKey(columnDbName)) {
                String msg = "The primaryKeyMap must have the value of " + columnDbName;
                throw new IllegalStateException(msg + ": primaryKeyMap --> " + primaryKeyMap);
            }
        }
    }

    protected void assertSetupSelectBeforeUnion(String foreignPropertyName) {
        if (hasUnionQueryOrUnionAllQuery()) {
            throwSetupSelectAfterUnionException(this.getClass().getSimpleName(), foreignPropertyName);
        }
    }
    
    protected void throwSetupSelectAfterUnionException(String className, String foreignPropertyName) {
        String methodName = "setupSelect_" + initCap(foreignPropertyName) + "()";
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "You should NOT call " + methodName + " after calling union()!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + methodName + " should be called before calling union()." + getLineSeparator();
        msg = msg + "  For example:" + getLineSeparator();
        msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
        msg = msg + "    " + className + " cb = new " + className + "();" + getLineSeparator();
        msg = msg + "    cb." + methodName + "; // You should call here!" + getLineSeparator();
        msg = msg + "    cb.query().setXxx...;" + getLineSeparator();
        msg = msg + "    cb.union(new UnionQuery<" + className + ">() {" + getLineSeparator();
        msg = msg + "        public void query(" + className + " unionCB) {" + getLineSeparator();
        msg = msg + "            unionCB.query().setXxx...;" + getLineSeparator();
        msg = msg + "        }" + getLineSeparator();
        msg = msg + "    });" + getLineSeparator();
        msg = msg + "    // You should not call setupSelect after calling union()!" + getLineSeparator();
        msg = msg + "    // cb." + methodName + ";" + getLineSeparator();
        msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[SetupSelect Method]" + getLineSeparator() + methodName + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[ConditionBean SQL]" + getLineSeparator() + toDisplaySql() + getLineSeparator();
        msg = msg + "* * * * * * * * * */" + getLineSeparator();
        throw new IllegalStateException(msg);
    }
    
    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected String initCap(String str) {
        return SimpleStringUtil.initCap(str);
    }
    
    protected String getLineSeparator() {
        return SimpleSystemUtil.getLineSeparator();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * The override.
     * @return SQL for display. (NotNull)
     */
    public String toString() {
        try {
            return toDisplaySql();
        } catch (RuntimeException e) {
            return getSqlClause().getClause();
        }
    }
}

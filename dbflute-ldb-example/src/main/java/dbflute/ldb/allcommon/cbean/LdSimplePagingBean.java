/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean;

import java.util.Map;
import java.util.LinkedHashMap;

import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClauseDefault;
import dbflute.ldb.allcommon.cbean.sqlclause.LdOrderByClause;

/**
 * The simple paging-bean.
 * @author DBFlute(AutoGenerator)
 */
public class LdSimplePagingBean implements LdPagingBean, LdMapParameterBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SQL clause instance. */
    protected final LdSqlClause _sqlClause;
    {
        _sqlClause = new LdSqlClauseDefault("Dummy");
    }

    /** The map of parameter. (Nullable) */
    protected Map<String, Object> _parameterMap;

    /** Safety max result size. */
    protected int _safetyMaxResultSize;

    /** Is the execution for paging(NOT count)? */
    protected boolean _paging = true;

    /** Is the count executed later? */
    protected boolean _countLater;

    /** Can the paging re-select? */
    protected boolean _canPagingReSelect = true;

    /** Is fetch narrowing valid? */
    protected boolean _fetchNarrowing = true;

    /** The map for parameter. */
    protected Map<String, Object> _map;

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
        return _paging;
    }

    // * * * * * * * *
    // For Framework
    // * * * * * * * *
    /**
     * {@inheritDoc}
     * @return Determination.
     */
    public boolean isCountLater() {
        return _countLater;
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
     * {@inheritDoc} {INTERNAL METHOD: Don't Invoke This!}
     * @param paging Determination.
     */
    public void xsetPaging(boolean paging) {
        if (paging) {
            getSqlClause().makeFetchScopeEffective();
        } else {
            getSqlClause().ignoreFetchScope();
        }
        this._paging = paging;
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
     * @return this. (NotNull)
     */
    public LdPagingBean fetchFirst(int fetchSize) {
        getSqlClause().fetchFirst(fetchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     * @param fetchStartIndex Fetch-start-index. 0 origin. (NotMinus)
     * @param fetchSize Fetch-size. (NotMinus & NotZero)
     * @return this. (NotNull)
     */
    public LdPagingBean fetchScope(int fetchStartIndex, int fetchSize) {
        getSqlClause().fetchScope(fetchStartIndex, fetchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     * @param fetchPageNumber Fetch-page-number. 1 origin. (NotMinus & NotZero: If minus or zero, set one.)
     * @return this. (NotNull)
     */
    public LdPagingBean fetchPage(int fetchPageNumber) {
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
     * @return Determination.
     */
    public boolean isFetchScopeEffective() {
        return getSqlClause().isFetchScopeEffective();
    }

    // ===================================================================================
    //                                                Implementation of FetchNarrowingBean
    //                                                ====================================
    /**
     * Get fetch-narrowing start-index.
     * @return Fetch-narrowing start-index.
     */
    public int getFetchNarrowingSkipStartIndex() {
        return getSqlClause().getFetchNarrowingSkipStartIndex();
    }

    /**
     * Get fetch-narrowing size.
     * @return Fetch-narrowing size.
     */
    public int getFetchNarrowingLoopCount() {
        return getSqlClause().getFetchNarrowingLoopCount();
    }

    /**
     * Is fetch start index supported?
     * @return Determination.
     */
    public boolean isFetchNarrowingSkipStartIndexEffective() {
        return !getSqlClause().isFetchStartIndexSupported();
    }

    /**
     * Is fetch size supported?
     * @return Determination.
     */
    public boolean isFetchNarrowingLoopCountEffective() {
        return !getSqlClause().isFetchSizeSupported();
    }

    /**
     * Is fetch-narrowing effective?
     * @return Determination.
     */
    public boolean isFetchNarrowingEffective() {
        return _fetchNarrowing && getSqlClause().isFetchNarrowingEffective();
    }

    /**
     * Ignore fetch narrowing. Only checking safety result size is valid. {INTERNAL METHOD}
     */
    public void ignoreFetchNarrowing() {
        _fetchNarrowing = false;
    }

    /**
     * Restore ignored fetch narrowing. {INTERNAL METHOD}
     */
    public void restoreIgnoredFetchNarrowing() {
        _fetchNarrowing = true;
    }

    /**
     * Get safety max result size.
     * @return Safety max result size.
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                       Implementation of OrderByBean
    //                                                       =============================
    /**
     * {@inheritDoc}
     * @return Sql component of order-by clause. (NotNull)
     */
    public LdOrderByClause getSqlComponentOfOrderByClause() {
        return getSqlClause().getSqlComponentOfOrderByClause();
    }

    /**
     * {@inheritDoc}
     * @return Order-by clause. (NotNull)
     */
    public String getOrderByClause() {
        return getSqlClause().getOrderByClause();
    }

    /**
     * {@inheritDoc}
     * @return this. (NotNull)
     */
    public LdOrderByBean clearOrderBy() {
        getSqlClause().clearOrderBy();
        return this;
    }

    /**
     * {@inheritDoc}
     * @return this. (NotNull)
     */
    public LdOrderByBean ignoreOrderBy() {
        getSqlClause().ignoreOrderBy();
        return this;
    }

    /**
     * {@inheritDoc}
     * @return this. (NotNull)
     */
    public LdOrderByBean makeOrderByEffective() {
        getSqlClause().makeOrderByEffective();
        return this;
    }

    // ===================================================================================
    //                                                    Implementation of SelectResource
    //                                                    ================================
    /**
     * Check safety result.
     * @param safetyMaxResultSize Safety max result size. (If zero or minus, ignore checking)
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        this._safetyMaxResultSize = safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                  Implementation of MapParameterBean
    //                                                  ==================================
    /**
     * Get the map of parameter.
     * @return The map of parameter. (Nullable)
     */
    public Map<String, Object> getParameterMap() {
        return _parameterMap;
    }

    /**
     * Add the parameter to the map.
     * @param key The key of parameter. (NotNull)
     * @param value The value of parameter. (Nullable)
     */
    public void addParameter(String key, Object value) {
        if (_parameterMap == null) {
            _parameterMap = new LinkedHashMap<String, Object>();
        }
        _parameterMap.put(key, value);
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    // -----------------------------------------------------
    //                                             SqlClause
    //                                             ---------
    /**
     * Get sqlClause.
     * @return SqlClause. (NotNull)
     */
    protected LdSqlClause getSqlClause() {
        return _sqlClause;
    }
}

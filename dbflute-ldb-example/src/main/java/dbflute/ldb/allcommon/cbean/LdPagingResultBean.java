/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean;

import dbflute.ldb.allcommon.cbean.mapping.LdEntityDtoMapper;
import dbflute.ldb.allcommon.cbean.pagenavi.group.LdPageGroupBean;
import dbflute.ldb.allcommon.cbean.pagenavi.group.LdPageGroupOption;
import dbflute.ldb.allcommon.cbean.pagenavi.range.LdPageRangeBean;
import dbflute.ldb.allcommon.cbean.pagenavi.range.LdPageRangeOption;

/**
 * The result bean of paging.
 * @param <ENTITY> The type of entity for the element of selected list.
 * @author DBFlute(AutoGenerator)
 */
public class LdPagingResultBean<ENTITY> extends LdListResultBean<ENTITY> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                       Page Basic Info
    //                                       ---------------
    /** The value of current page number. */
    protected int _pageSize;

    /** The value of current page number. */
    protected int _currentPageNumber;

    // -----------------------------------------------------
    //                                            Page Group
    //                                            ----------
    /** The value of page-group bean. */
    protected LdPageGroupBean _pageGroupBean;

    /** The value of page-group option. */
    protected LdPageGroupOption _pageGroupOption;

    // -----------------------------------------------------
    //                                            Page Range
    //                                            ----------
    /** The value of page-range bean. */
    protected LdPageRangeBean _pageRangeBean;

    /** The value of page-range option. */
    protected LdPageRangeOption _pageRangeOption;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     */
    public LdPagingResultBean() {
    }

    // ===================================================================================
    //                                                                 Calculated Property
    //                                                                 ===================
    /**
     * Get the value of allPageCount that is calculated.
     * @return The value of allPageCount.
     */
    public int getAllPageCount() {
        return calculateAllPageCount(_allRecordCount, _pageSize);
    }

    /**
     * Get the value of currentStartRecordNumber that is calculated.
     * @return The value of currentStartRecordNumber.
     */
    public int getCurrentStartRecordNumber() {
        return calculateCurrentStartRecordNumber(_currentPageNumber, _pageSize);
    }

    /**
     * Get the value of currentEndRecordNumber that is calculated.
     * @return The value of currentEndRecordNumber.
     */
    public int getCurrentEndRecordNumber() {
        return calculateCurrentEndRecordNumber(_currentPageNumber, _pageSize);
    }
	
    // ===================================================================================
    //                                                                    Page Group/Range
    //                                                                    ================
    // -----------------------------------------------------
    //                                            Page Group
    //                                            ----------
    /**
     * Get the value of pageGroupSize.
     * @return The value of pageGroupSize.
     */
    public int getPageGroupSize() {
        return _pageGroupOption != null ? _pageGroupOption.getPageGroupSize() : 0;
    }

    /**
     * Set the value of pageGroupSize.
     * @param pageGroupSize The value of pageGroupSize.
     */
    public void setPageGroupSize(int pageGroupSize) {
        final LdPageGroupOption option = new LdPageGroupOption();
        option.setPageGroupSize(pageGroupSize);
        setPageGroupOption(option);
    }

    /**
     * Set the value of pageGroupOption.
     * @param pageGroupOption The value of pageGroupOption. (Nullable)
     */
    public void setPageGroupOption(LdPageGroupOption pageGroupOption) {
        _pageGroupOption = pageGroupOption;
    }

    /**
     * Get the value of pageGroupBean.
     * @return The value of pageGroupBean. (NotNull)
     */
    public LdPageGroupBean pageGroup() {
        assertPageGroupValid();
        if (_pageGroupBean == null) {
            _pageGroupBean = new LdPageGroupBean();
        }
        _pageGroupBean.setPageGroupOption(_pageGroupOption);
        _pageGroupBean.setCurrentPageNumber(getCurrentPageNumber());
        _pageGroupBean.setAllPageCount(getAllPageCount());
        return _pageGroupBean;
    }

    protected void assertPageGroupValid() {
        if (_pageGroupOption == null) {
            String msg = "The pageGroupOption should not be null. Please invoke setPageGroupOption().";
            throw new IllegalStateException(msg);
        }
        if (_pageGroupOption.getPageGroupSize() == 0) {
            String msg = "The pageGroupSize should be greater than 1. But the value is zero.";
            msg = msg + " pageGroupSize=" + _pageGroupOption.getPageGroupSize();
            throw new IllegalStateException(msg);
        }
        if (_pageGroupOption.getPageGroupSize() == 1) {
            String msg = "The pageGroupSize should be greater than 1. But the value is one.";
            msg = msg + " pageGroupSize=" + _pageGroupOption.getPageGroupSize();
            throw new IllegalStateException(msg);
        }
    }

    // -----------------------------------------------------
    //                                            Page Range
    //                                            ----------
    /**
     * Get the value of pageRangeSize.
     * @return The value of pageRangeSize.
     */
    public int getPageRangeSize() {
        return _pageRangeOption != null ? _pageRangeOption.getPageRangeSize() : 0;
    }

    /**
     * Set the value of pageRangeSize.
     * @param pageRangeSize The value of pageRangeSize.
     */
    public void setPageRangeSize(int pageRangeSize) {
        final LdPageRangeOption option = new LdPageRangeOption();
        option.setPageRangeSize(pageRangeSize);
        setPageRangeOption(option);
    }

    /**
     * Set the value of pageRangeOption.
     * @param pageRangeOption The value of pageRangeOption. (Nullable)
     */
    public void setPageRangeOption(LdPageRangeOption pageRangeOption) {
        this._pageRangeOption = pageRangeOption;
    }

    /**
     * Get the value of pageRangeBean.
     * @return The value of pageRangeBean. (NotNull)
     */
    public LdPageRangeBean pageRange() {
        assertPageRangeValid();
        if (_pageRangeBean == null) {
            _pageRangeBean = new LdPageRangeBean();
        }
        _pageRangeBean.setPageRangeOption(_pageRangeOption);
        _pageRangeBean.setCurrentPageNumber(getCurrentPageNumber());
        _pageRangeBean.setAllPageCount(getAllPageCount());
        return _pageRangeBean;
    }

    protected void assertPageRangeValid() {
        if (_pageRangeOption == null) {
            String msg = "The pageRangeOption should not be null. Please invoke setPageRangeOption().";
            throw new IllegalStateException(msg);
        }
        final int pageRangeSize = _pageRangeOption.getPageRangeSize();
        if (pageRangeSize == 0) {
            String msg = "The pageRangeSize should be greater than 1. But the value is zero.";
            throw new IllegalStateException(msg);
        }
    }

    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    /**
     * Is existing previous page?
     * Using values are currentPageNumber.
     * @return Determination.
     */
    public boolean isExistPrePage() {
        return (_allRecordCount > 0 && _currentPageNumber > 1);
    }

    /**
     * Is existing next page?
     * Using values are currentPageNumber and allPageCount.
     * @return Determination.
     */
    public boolean isExistNextPage() {
        return (_allRecordCount > 0 && _currentPageNumber < getAllPageCount());
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public <DTO> LdPagingResultBean<DTO> mappingList(LdEntityDtoMapper<ENTITY, DTO> entityDtoMapper) {
        final LdListResultBean<DTO> ls = super.mappingList(entityDtoMapper);
        final LdPagingResultBean<DTO> mappingList = new LdPagingResultBean<DTO>();
        mappingList.setSelectedList(ls.getSelectedList());
        mappingList.setTableDbName(getTableDbName());
        mappingList.setAllRecordCount(getAllRecordCount());
        mappingList.setOrderByClause(getOrderByClause());
        mappingList.setPageSize(getPageSize());
        mappingList.setCurrentPageNumber(getCurrentPageNumber());
        mappingList.setPageRangeOption(_pageRangeOption);
        mappingList.setPageGroupOption(_pageGroupOption);
        return mappingList;
    }

    // ===================================================================================
    //                                                                 Calculate(Internal)
    //                                                                 ===================
    /**
     * Calculate all page count.
     * @param allRecordCount All record count.
     * @param pageSize Fetch-size.
     * @return All page count.
     */
    protected int calculateAllPageCount(int allRecordCount, int pageSize) {
        if (allRecordCount == 0) {
            return 1;
        }
        int pageCountBase = (allRecordCount / pageSize);
        if (allRecordCount % pageSize > 0) {
            pageCountBase++;
        }
        return pageCountBase;
    }

    protected int calculateCurrentStartRecordNumber(int currentPageNumber, int pageSize) {
        return ((currentPageNumber - 1) * pageSize) + 1;
    }

    protected int calculateCurrentEndRecordNumber(int currentPageNumber, int pageSize) {
        return calculateCurrentStartRecordNumber(currentPageNumber, pageSize) + _selectedList.size() - 1;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The view string of all attribute values. (NotNull)
     */
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{").append(getCurrentPageNumber()).append("/").append(getAllPageCount());
        sb.append(" of ").append(getAllRecordCount());
        sb.append(" ").append(isExistPrePage()).append("/").append(isExistNextPage());
        if (_pageGroupOption != null) {
            sb.append(" group:{").append(getPageGroupSize()).append(",").append(pageGroup().createPageNumberList()).append("}");
        }
        if (_pageRangeOption != null) {
            sb.append(" range:{").append(getPageRangeSize()).append(",").append(_pageRangeOption.isFillLimit());
            sb.append(",").append(pageRange().createPageNumberList()).append("}");
        }
        sb.append(" list=").append(getSelectedList() != null ? Integer.valueOf(getSelectedList().size()) : null);
        sb.append(" page=").append(getPageSize());
        sb.append("}");
        sb.append(":selectedList=").append(getSelectedList());
        return sb.toString();
    }
	
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get the value of pageSize.
     * @return The value of pageSize.
     */
    public int getPageSize() {
        return _pageSize;
    }

    /**
     * Set the value of pageSize.
     * @param pageSize The value of pageSize.
     */
    public void setPageSize(int pageSize) {
        _pageSize = pageSize;
    }

    /**
     * Get the value of currentPageNumber.
     * @return The value of currentPageNumber.
     */
    public int getCurrentPageNumber() {
        return _currentPageNumber;
    }

    /**
     * Set the value of currentPageNumber.
     * @param currentPageNumber The value of currentPageNumber.
     */
    public void setCurrentPageNumber(int currentPageNumber) {
        _currentPageNumber = currentPageNumber;
    }
}

package dbflute.ldb.allcommon.cbean;


/**
 * The paging-result-bean of LdPagingResultBean.
 * 
 * @param <T> The generic template for 'selectedList'.
 * @author DBFlute(AutoGenerator)
 */
public class LdPagingResultBean<T> extends LdListResultBean<T> {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** The value of current page number. */
    protected int _pageSize;

    /** The value of current page number. */
    protected int _currentPageNumber;

    /** The value of page-group size. Default value is 2. */
    protected int _pageGroupSize = 2;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdPagingResultBean() {
    }

    // =====================================================================================
    //                                                                         Getter Setter
    //                                                                         =============
    /**
     * Get the value of pageSize.
     * 
     * @return The value of pageSize.
     */
    public int getPageSize() {
        return _pageSize;
    }

    /**
     * Set the value of pageSize.
     * 
     * @param value The value of pageSize.
     */
    public void setPageSize(int value) {
        _pageSize = value;
    }

    /**
     * Get the value of currentPageNumber.
     * 
     * @return The value of currentPageNumber.
     */
    public int getCurrentPageNumber() {
        return _currentPageNumber;
    }

    /**
     * Set the value of currentPageNumber.
     * 
     * @param value The value of currentPageNumber.
     */
    public void setCurrentPageNumber(int value) {
        _currentPageNumber = value;
    }

    /**
     * Get the value of allPageCount.
     * 
     * @return The value of allPageCount.
     */
    public int getAllPageCount() {
        return calculateAllPageCount(_allRecordCount, _pageSize);
    }

    /**
     * Get the value of pageGroupSize.
     * 
     * @return The value of pageGroupSize.
     */
    public int getPageGroupSize() {
        return _pageGroupSize;
    }

    /**
     * Set the value of pageGroupSize.
     * 
     * @param value The value of pageGroupSize.
     */
    public void setPageGroupSize(int value) {
        _pageGroupSize = value;
    }

    // =====================================================================================
    //                                                                             Calculate
    //                                                                             =========
    /**
     * Calculate all page count.
     * 
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

    /**
     * Calculate current page-group start-page-number.
     * Using values are currentPageNumber and pageGroupSize.
     * 
     * @return Current page-group start-page-number.
     */
    public int calculateCurrentPageGroupStartPageNumber() {
        if (_pageGroupSize == 0) {
            return 1;
        }
        if (_pageGroupSize == 1) {
            String msg = "The pageGroupSize should be greater than 1 or equal 0. {value > 1 || value == 0}";
            msg = msg + ": pageGroupSize=" + _pageGroupSize;
            throw new IllegalStateException(msg);
        }
        int currentPageGroupNumber = (_currentPageNumber / _pageGroupSize);
        if ((_currentPageNumber % _pageGroupSize) == 0)
        {
            currentPageGroupNumber--;
        }
        int currentPageGroupStartPageNumber = (_pageGroupSize * currentPageGroupNumber) + 1;
        if (!(_currentPageNumber >= currentPageGroupStartPageNumber)) {
            String msg = "currentPageNumber should be greater equal currentPageGroupStartPageNumber. But:";
            msg = msg + " currentPageNumber=" + _currentPageNumber;
            msg = msg + " currentPageGroupStartPageNumber=" + currentPageGroupStartPageNumber;
            throw new IllegalStateException(msg);
        }
        return currentPageGroupStartPageNumber;
    }

    /**
     * Get current page-group page-number-array.
     * Using values are currentPageNumber and pageGroupSize and allPageCount.
     * 
     * @return Current page-group page-number-array.
     */
    public int[] getCurrentPageGroupPageNumberArray() {
        int allPageCount = getAllPageCount();
        int currentPageGroupStartPageNumber = calculateCurrentPageGroupStartPageNumber();
        if (!(currentPageGroupStartPageNumber > 0)) {
            String msg = "currentPageGroupStartPageNumber should be greater than 0. {> 0} But:";
            msg = msg + " currentPageGroupStartPageNumber=" + currentPageGroupStartPageNumber;
            throw new IllegalStateException(msg);
        }
        int nextPageGroupStartPageNumber = currentPageGroupStartPageNumber + _pageGroupSize;
        int[] currentPageGroupArray = null;
        if (allPageCount < nextPageGroupStartPageNumber) {
            currentPageGroupArray = new int[(allPageCount-currentPageGroupStartPageNumber)+1];
        } else {
            currentPageGroupArray = new int[_pageGroupSize];
        }
        int arrayIndex = 0;
        for (int i=currentPageGroupStartPageNumber; i < nextPageGroupStartPageNumber && i <= allPageCount; i++, arrayIndex++) {
            currentPageGroupArray[arrayIndex] = i;
        }
        return currentPageGroupArray;
    }

    // =====================================================================================
    //                                                                         Determination
    //                                                                         =============
    /**
     * Is existing previous page?
     * Using values are currentPageNumber.
     * 
     * @return Determination.
     */
    public boolean isExistPrePage() {
        return (_currentPageNumber > 1);
    }

    /**
     * Is existing next page?
     * Using values are currentPageNumber and allPageCount.
     * 
     * @return Determination.
     */
    public boolean isExistNextPage() {
        return (_currentPageNumber < getAllPageCount());
    }

    /**
     * Is existing previous page-group?
     * Using values are currentPageNumber and pageGroupSize.
     * 
     * @return Determination.
     */
    public boolean isExistPrePageGroup() {
        return (_currentPageNumber > _pageGroupSize);
    }

    /**
     * Is existing next page-group?
     * Using values are currentPageNumber and pageGroupSize and allPageCount.
     * 
     * @return Determination.
     */
    public boolean isExistNextPageGroup() {
        int currentPageGroupStartPageNumber = calculateCurrentPageGroupStartPageNumber();
        if (!(currentPageGroupStartPageNumber > 0)) {
            String msg = "currentPageGroupStartPageNumber should be greater than 0. {> 0} But:";
            msg = msg + " currentPageGroupStartPageNumber=" + currentPageGroupStartPageNumber;
            throw new IllegalStateException(msg);
        }
        int nextPageGroupStartPageNumber = currentPageGroupStartPageNumber + _pageGroupSize;
        return (nextPageGroupStartPageNumber <= getAllPageCount());
    }

    // =====================================================================================
    //                                                                 Basic-Override Method
    //                                                                 =====================
    /**
     * This method overrides the method that is declared at super.
     * 
     * @return View-string of all-columns value.
     */
    public String toString() {
        final StringBuffer sb = new StringBuffer();

        sb.append(" ").append(getCurrentPageNumber()).append("/").append(getAllPageCount());
        sb.append(" ").append(getAllRecordCount());
        sb.append(" - ").append(isExistPrePage()).append(" ").append(isExistPrePageGroup());
        sb.append(" ").append(isExistPrePage());
        sb.append(" ");
        int[] currentPageGroupPageNumberArray = getCurrentPageGroupPageNumberArray();
        for (int i=0; i < currentPageGroupPageNumberArray.length; i++) {
            sb.append(currentPageGroupPageNumberArray[i]);
        }
        sb.append(" ").append(isExistNextPageGroup()).append(" ").append(isExistNextPage());
        sb.append(" pageSize=").append(getPageSize());
        sb.append(" selectedList=").append(getSelectedList());

        return sb.toString();
    }
}

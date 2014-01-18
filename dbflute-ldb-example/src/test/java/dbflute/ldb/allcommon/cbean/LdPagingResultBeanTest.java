package dbflute.ldb.allcommon.cbean;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import dbflute.ldb.allcommon.cbean.pagenavi.range.LdPageRangeOption;
import dbflute.ldb.exentity.LdBook;

/**
 * Test of DaoSelector
 * 
 * @author jflute
 */
public class LdPagingResultBeanTest extends TestCase {

    // ==========================================================================================
    //                                                                                Common Test
    //                                                                                ===========

    public void test_getCurrentPageRangePageNumberList_NonFillLimit() {
        final LdPagingResultBean<String> rb = new LdPagingResultBean<String>();
        rb.setAllRecordCount(5000);
        rb.setCurrentPageNumber(2);
        rb.setPageSize(20);

        final LdPageRangeOption pageRangeOption = new LdPageRangeOption();
        pageRangeOption.setPageRangeSize(5);
        rb.setPageRangeOption(pageRangeOption);
        final List<Integer> currentPageRangePageNumberList = rb.pageRange().createPageNumberList();

        final List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(new Integer(1));
        expectedList.add(new Integer(2));
        expectedList.add(new Integer(3));
        expectedList.add(new Integer(4));
        expectedList.add(new Integer(5));
        expectedList.add(new Integer(6));
        expectedList.add(new Integer(7));

        assertEquals(expectedList, currentPageRangePageNumberList);
    }

    public void test_getCurrentPageRangePageNumberList_FillLimit_FirstStart() {
        final LdPagingResultBean<String> rb = new LdPagingResultBean<String>();
        rb.setAllRecordCount(5000);
        rb.setCurrentPageNumber(2);
        rb.setPageSize(20);

        final LdPageRangeOption pageRangeOption = new LdPageRangeOption();
        pageRangeOption.setPageRangeSize(5);
        pageRangeOption.setFillLimit(true);
        rb.setPageRangeOption(pageRangeOption);
        final List<Integer> currentPageRangePageNumberList = rb.pageRange().createPageNumberList();

        final List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(new Integer(1));
        expectedList.add(new Integer(2));
        expectedList.add(new Integer(3));
        expectedList.add(new Integer(4));
        expectedList.add(new Integer(5));
        expectedList.add(new Integer(6));
        expectedList.add(new Integer(7));
        expectedList.add(new Integer(8));
        expectedList.add(new Integer(9));
        expectedList.add(new Integer(10));
        expectedList.add(new Integer(11));

        assertEquals(expectedList, currentPageRangePageNumberList);
    }

    public void test_getCurrentPageRangePageNumberList_FillLimit_HalfwayStart() {
        final LdPagingResultBean<String> rb = new LdPagingResultBean<String>();
        rb.setAllRecordCount(5000);
        rb.setCurrentPageNumber(25);
        rb.setPageSize(20);

        final LdPageRangeOption pageRangeOption = new LdPageRangeOption();
        pageRangeOption.setPageRangeSize(5);
        pageRangeOption.setFillLimit(true);
        rb.setPageRangeOption(pageRangeOption);
        final List<Integer> currentPageRangePageNumberList = rb.pageRange().createPageNumberList();

        final List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(new Integer(20));
        expectedList.add(new Integer(21));
        expectedList.add(new Integer(22));
        expectedList.add(new Integer(23));
        expectedList.add(new Integer(24));
        expectedList.add(new Integer(25));
        expectedList.add(new Integer(26));
        expectedList.add(new Integer(27));
        expectedList.add(new Integer(28));
        expectedList.add(new Integer(29));
        expectedList.add(new Integer(30));

        assertEquals(expectedList, currentPageRangePageNumberList);
    }

    public void test_getCurrentPageRangePageNumberList_NonFillLimit_HalfwayStartAndCloseLast() {
        final List<Integer> currentPageRangePageNumberList = createPageRangePageNumberList_HalfwayStartAndCloseLast(false);

        final List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(new Integer(3));
        expectedList.add(new Integer(4));
        expectedList.add(new Integer(5));
        expectedList.add(new Integer(6));
        expectedList.add(new Integer(7));
        expectedList.add(new Integer(8));
        expectedList.add(new Integer(9));
        expectedList.add(new Integer(10));

        assertEquals(expectedList, currentPageRangePageNumberList);
    }

    public void test_getCurrentPageRangePageNumberList_FillLimit_HalfwayStartAndCloseLast() {
        final List<Integer> currentPageRangePageNumberList = createPageRangePageNumberList_HalfwayStartAndCloseLast(true);

        final List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(new Integer(1));
        expectedList.add(new Integer(2));
        expectedList.add(new Integer(3));
        expectedList.add(new Integer(4));
        expectedList.add(new Integer(5));
        expectedList.add(new Integer(6));
        expectedList.add(new Integer(7));
        expectedList.add(new Integer(8));
        expectedList.add(new Integer(9));
        expectedList.add(new Integer(10));

        assertEquals(expectedList, currentPageRangePageNumberList);
    }

    private List<Integer> createPageRangePageNumberList_HalfwayStartAndCloseLast(boolean fillLimit) {
        final LdPagingResultBean<String> rb = new LdPagingResultBean<String>();
        rb.setAllRecordCount(20);
        rb.setCurrentPageNumber(8);
        rb.setPageSize(2);

        final LdPageRangeOption pageRangeOption = new LdPageRangeOption();
        pageRangeOption.setPageRangeSize(5);
        pageRangeOption.setFillLimit(fillLimit);
        rb.setPageRangeOption(pageRangeOption);

        final List<Integer> currentPageRangePageNumberList = rb.pageRange().createPageNumberList();
        return currentPageRangePageNumberList;
    }

    public void test_toString_empty() throws Exception {
        System.out.println(new LdPagingResultBean<LdBook>().toString()); // Expect no exception!
    }
}

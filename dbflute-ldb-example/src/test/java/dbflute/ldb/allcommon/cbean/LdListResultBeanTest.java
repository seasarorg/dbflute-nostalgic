package dbflute.ldb.allcommon.cbean;

import java.math.BigDecimal;
import java.util.List;

import junit.framework.TestCase;
import dbflute.ldb.allcommon.cbean.grouping.LdGroupingOption;
import dbflute.ldb.allcommon.cbean.grouping.LdGroupingRowResource;
import dbflute.ldb.allcommon.cbean.grouping.LdGroupingRowSetupper;
import dbflute.ldb.exentity.LdBook;

/**
 * 
 * @author jflute
 * @since 1.0 (2007/06/14 Thursday)
 */
public class LdListResultBeanTest extends TestCase {

    public void test_groupList() throws Exception {
        final LdListResultBean<LdBook> ls = createTargetWithTestData();
        final LdGroupingRowSetupper<GroupingRowBean, LdBook> groupingRowSetupper = new LdGroupingRowSetupper<GroupingRowBean, LdBook>() {
            public GroupingRowBean setup(LdGroupingRowResource<LdBook> groupingRowResource) {
                return new GroupingRowBean(groupingRowResource.getGroupingRowList());
            }
        };
        final List<GroupingRowBean> groupingList = ls
                .groupingList(groupingRowSetupper, new LdGroupingOption<LdBook>(3));
        assertEquals(4, groupingList.size());
        assertRowList(groupingList, 0, 0, 1);
        assertRowList(groupingList, 0, 1, 2);
        assertRowList(groupingList, 0, 2, 3);
        assertRowList(groupingList, 1, 0, 4);
        assertRowList(groupingList, 1, 1, 5);
        assertRowList(groupingList, 1, 2, 6);
        assertRowList(groupingList, 2, 0, 7);
        assertRowList(groupingList, 2, 1, 8);
        assertRowList(groupingList, 2, 2, 9);
        assertRowList(groupingList, 3, 0, 10);
        try {
            assertRowList(groupingList, 3, 1, 11);
        } catch (IndexOutOfBoundsException e) {
            // OK
        }
    }

    //    public void test_() throws Exception {
    //        final LdListResultBean<LdBook> ls = createTargetWithTestData();
    //        final LdGroupingRowSetupper<DtoGroupingBean, Dto> groupingRowSetupper = new LdGroupingRowSetupper<DtoGroupingBean, Dto>() {
    //            public DtoGroupingBean setup(LdGroupingRowResource<Dto> groupingRowResource) {
    //                return new DtoGroupingBean(groupingRowResource.getGroupingRowList());
    //            }
    //        };
    //        final LdGroupingOption<LdBook> groupingOption = new LdGroupingOption<LdBook>();
    //        groupingOption.setColumnCount(3);
    //        final List<DtoGroupingBean> groupingList = ls.groupingList(groupingRowSetupper, groupingOption);
    //        for (DtoGroupingBean bean : groupingList) {
    //            final List<Dto> rowList = bean.getRowList();
    //            for (Dto dto : rowList) {
    //                
    //            }
    //            
    //        }
    //    }

    private void assertRowList(final List<GroupingRowBean> groupingList, int groupRowIndex, int elementIndex, int bookId) {
        final GroupingRowBean groupingRowBean = groupingList.get(groupRowIndex);
        final List<LdBook> rowList = groupingRowBean.getRowList();
        final LdBook firstElement = rowList.get(elementIndex);
        assertEquals(new Integer(bookId), firstElement.getBookId());
    }

    private LdListResultBean<LdBook> createTargetWithTestData() {
        final LdListResultBean<LdBook> ls = new LdListResultBean<LdBook>();
        for (int i = 0; i < 10; i++) {
            addElementWithPrimaryKey(ls, i + 1);
        }
        return ls;
    }

    private void addElementWithPrimaryKey(final LdListResultBean<LdBook> ls, int bookId) {
        final LdBook entity = new LdBook();
        entity.setBookId(bookId);
        ls.add(entity);
    }

    public static class GroupingRowBean {
        private java.util.List<LdBook> rowList;

        public GroupingRowBean(java.util.List<LdBook> rowList) {
            this.rowList = rowList;
        }

        public java.util.List<LdBook> getRowList() {
            return rowList;
        }
    }

    public static class DtoGroupingBean {
        private java.util.List<Dto> rowList;

        public DtoGroupingBean(java.util.List<Dto> rowList) {
            this.rowList = rowList;
        }

        public java.util.List<Dto> getRowList() {
            return rowList;
        }
    }

    public static class Dto {
        private BigDecimal bookId;

        public BigDecimal getBookId() {
            return bookId;
        }

        public void setBookId(BigDecimal bookId) {
            this.bookId = bookId;
        }
    }

    public void test_toString_empty() throws Exception {
        System.out.println(new LdListResultBean<LdBook>().toString()); // Expect no exception!
    }
}

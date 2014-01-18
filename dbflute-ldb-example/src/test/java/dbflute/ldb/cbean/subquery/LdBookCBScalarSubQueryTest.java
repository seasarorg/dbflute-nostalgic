package dbflute.ldb.cbean.subquery;

import java.util.List;

import dbflute.ldb.allcommon.cbean.LdSubQuery;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookCBScalarSubQueryTest extends LdBookAllDbTestCase {

    public void test_scalar_equal_max_Integer_plain_no_conditon_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        final List<LdBook> expectedList = getMyBhv().selectList(cb);
        Integer expected = -1;
        for (LdBook book : expectedList) {
            if (expected < book.getMaxLendingDateCount()) {
                expected = book.getMaxLendingDateCount();
            }
        }
        cb.query().scalar_Equal().max(new LdSubQuery<LdBookCB>() {
            public void query(LdBookCB subCB) {
                subCB.specify().columnMaxLendingDateCount();
            }
        });

        // ## Act ##
        final List<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertNotSame(0, bookList.size());
        for (LdBook book : bookList) {
            log(book.getBookName() + ", " + book.getMaxLendingDateCount());
            assertEquals(expected, book.getMaxLendingDateCount());
        }
    }

    public void test_scalar_equal_max_Integer_plain_with_condition_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.query().setOutOfUserSelectYn_Equal_Yes();
        final List<LdBook> expectedList = getMyBhv().selectList(cb);
        Integer expected = -1;
        for (LdBook book : expectedList) {
            if (expected < book.getMaxLendingDateCount()) {
                expected = book.getMaxLendingDateCount();
            }
        }
        cb.query().scalar_Equal().max(new LdSubQuery<LdBookCB>() {
            public void query(LdBookCB subCB) {
                subCB.specify().columnMaxLendingDateCount();
                subCB.query().setOutOfUserSelectYn_Equal_Yes();
            }
        });

        // ## Act ##
        final List<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertNotSame(0, bookList.size());
        for (LdBook book : bookList) {
            log(book.getBookName() + ", " + book.getMaxLendingDateCount());
            assertEquals(expected, book.getMaxLendingDateCount());
        }
    }
}

package dbflute.ldb.cbean;

import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookCBOrderByTest extends LdBookAllDbTestCase {

    // ==========================================================================================
    //                                                                                    OrderBy
    //                                                                                    =======
    public void test_ConditionBean_OrderBy_NullsFirst_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithAll();

        final LdBookCB cb = new LdBookCB();
        cb.query().addOrderBy_GenreCode_Asc().withNullsFirst();

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        boolean nulls = true;
        boolean border = false;
        for (LdBook book : bookList) {
            final String genreCode = book.getGenreCode();
            log(book.getBookId() + ", " + book.getBookName() + ", " + genreCode);
            if (nulls) {
                if (genreCode != null && !border) {
                    nulls = false;
                    border = true;
                    continue;
                }
                assertNull(genreCode);
            } else {
                assertNotNull(genreCode);
            }
        }
        assertTrue(border);
    }

    public void test_ConditionBean_OrderBy_NullsLast_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithAll();

        final LdBookCB cb = new LdBookCB();
        cb.query().addOrderBy_GenreCode_Asc().withNullsLast();

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        boolean nulls = false;
        boolean border = false;
        for (LdBook book : bookList) {
            final String genreCode = book.getGenreCode();
            log(book.getBookId() + ", " + book.getBookName() + ", " + genreCode);
            if (nulls) {
                assertNull(genreCode);
            } else {
                if (genreCode == null && !border) {
                    nulls = true;
                    border = true;
                    continue;
                }
                assertNotNull(genreCode);
            }
        }
        assertTrue(border);
    }

    public void test_ConditionBean_OrderBy_NullsFirst_with_SecondOrderBy_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithAll();

        final LdBookCB cb = new LdBookCB();
        cb.query().addOrderBy_GenreCode_Asc().withNullsFirst();
        cb.query().addOrderBy_BookId_Desc();

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        boolean nulls = true;
        boolean border = false;
        for (LdBook book : bookList) {
            final String genreCode = book.getGenreCode();
            log(book.getBookId() + ", " + book.getBookName() + ", " + genreCode);
            if (nulls) {
                if (genreCode != null && !border) {
                    nulls = false;
                    border = true;
                    continue;
                }
                assertNull(genreCode);
            } else {
                assertNotNull(genreCode);
            }
        }
        assertTrue(border);
    }
    
    public void test_ConditionBean_OrderBy_NullsFirst_with_FirstOrderBy_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        
        final LdBookCB cb = new LdBookCB();
        cb.query().addOrderBy_MaxLendingDateCount_Desc();
        cb.query().addOrderBy_GenreCode_Asc().withNullsFirst();
        
        // ## Act & Assert ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);// Expect no exception!
        for (LdBook book : bookList) {
            final String genreCode = book.getGenreCode();
            log(book.getBookId() + ", " + book.getMaxLendingDateCount() + ", " + genreCode);
        }
    }
    
    public void test_ConditionBean_OrderBy_NullsFirst_by_ForeignTableColumn_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        
        final LdBookCB cb = new LdBookCB();
        cb.query().queryGenre().addOrderBy_ParentGenreCode_Asc().withNullsFirst();
        
        // ## Act & Assert ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);// Expect no exception!
        for (LdBook book : bookList) {
            final String genreCode = book.getGenreCode();
            log(book.getBookId() + ", " + book.getMaxLendingDateCount() + ", " + genreCode);
        }
    }
}

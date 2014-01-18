package dbflute.ldb.cbean.subquery;

import java.util.List;

import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdSubQuery;
import dbflute.ldb.allcommon.cbean.LdUnionQuery;
import dbflute.ldb.cbean.LdAuthorCB;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.exentity.LdAuthor;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookCBInScopeSubQueryForeignTest extends LdBookAllDbTestCase {

    public void test_selectList_InScopeSubQuery_Foreign_at_MyTable_Tx() {
        // ## Arrange ##
        final int expectedDateCount = 10;

        // ## Act ##
        // select BOOK.book_id
        //       , BOOK.author_id
        //       , BOOK.publisher_id
        //       , BOOK.book_name
        //       , BOOK.max_lending_date_count
        //       , BOOK.u_time
        //       , BOOK.isbn_no
        //       , BOOK.genre_code
        //       , BOOK.opening_part
        //       , BOOK.r_time
        //       , BOOK.r_staff
        //       , BOOK.u_staff
        //       , AUTHOR....
        //   from BOOK
        //  where BOOK.AUTHOR_ID in (select AUTHOR.AUTHOR_ID
        //                             from AUTHOR
        //                            where AUTHOR.BOOK_ID in (select BOOK.BOOK_ID
        //                                                       from BOOK
        //                                                      where BOOK.MAX_LENGING_DATE_COUNT < 10))
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.query().inScopeAuthor(new LdSubQuery<LdAuthorCB>() {
            public void query(LdAuthorCB subCB) {
                subCB.query().inScopeBookList(new LdSubQuery<LdBookCB>() {
                    public void query(LdBookCB subCB) {
                        subCB.query().setMaxLendingDateCount_LessThan(new Integer(expectedDateCount));
                    }
                });
            }
        });
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final LdBook entity : ls) {
            final LdAuthor parentEntity = entity.getAuthor();
            LdBookCB parentChildCB = new LdBookCB();
            parentChildCB.query().setAuthorId_Equal(parentEntity.getAuthorId());
            final LdListResultBean<LdBook> parentChildList = getMyBhv().selectList(parentChildCB);

            boolean existBookPrefix = false;
            for (LdBook parentChildEntity : parentChildList) {
                final String bookName = parentChildEntity.getBookName();
                final Integer maxLendingDateCount = parentChildEntity.getMaxLendingDateCount();
                _log.debug("...Checking maxLendingDateCount '" + maxLendingDateCount + "' of the book '" + bookName
                        + "' of " + parentEntity.getAuthorName() + "!");
                if (maxLendingDateCount.intValue() < expectedDateCount) {
                    existBookPrefix = true;
                }
            }
            if (!existBookPrefix) {
                fail("Parent should have the child its max lending date count is greater equal '" + expectedDateCount
                        + "' at least one record!");
            }
        }
    }

    public void test_selectList_InScopeSubQuery_Inline_at_ForeignTable_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();

        // ## Act ##
        cb.query().queryAuthor().inline().inScopeBookList(new LdSubQuery<LdBookCB>() {
            public void query(LdBookCB subCB) {
                subCB.query().setAuthorId_GreaterEqual(new Integer(3));
            }
        });
        cb.query().queryAuthor().setAuthorName_Equal(null);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        // Nothing because it expects no exception!
    }

    public void test_selectList_InScopeSubQuery_to_ForeignTable_Union_ExecuteOK_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();

        // ## Act ##
        cb.query().inScopeAuthor(new LdSubQuery<LdAuthorCB>() {
            public void query(LdAuthorCB subCB) {
                subCB.query().setAuthorId_Equal(3);
                subCB.union(new LdUnionQuery<LdAuthorCB>() {
                    public void query(LdAuthorCB unionCB) {
                        unionCB.query().setAuthorAge_GreaterEqual(40);
                    }
                });
            }
        });
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final LdBook book : ls) {
            final LdAuthor author = book.getAuthor();
            _log.debug(book.getBookName() + " -- " + author.getAuthorId() + " - " + author.getAuthorName() + " - "
                    + author.getAuthorAge());
            if (!(author.getAuthorId().equals(3) || author.getAuthorAge() >= 30)) {
                fail("Unexpected: " + author);
            }
        }
    }

    public void test_selectList_InScopeSubQuery_to_ForeignTable_Union_Union_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();

        // ## Act ##
        cb.query().inScopeAuthor(new LdSubQuery<LdAuthorCB>() {
            public void query(LdAuthorCB subCB) {
                subCB.query().setAuthorId_Equal(3);
                subCB.union(new LdUnionQuery<LdAuthorCB>() {
                    public void query(LdAuthorCB unionCB) {
                        unionCB.query().setAuthorAge_GreaterEqual(30);
                    }
                });
                subCB.union(new LdUnionQuery<LdAuthorCB>() {
                    public void query(LdAuthorCB unionCB) {
                        unionCB.query().setAuthorAge_LessEqual(10);
                    }
                });
            }
        });
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final LdBook book : ls) {
            final LdAuthor author = book.getAuthor();
            _log.debug(book.getBookName() + ", " + author.getAuthorId() + ", " + author.getAuthorName() + ", "
                    + author.getAuthorAge());
            if (!(author.getAuthorId().equals(3) || author.getAuthorAge() >= 30 || author.getAuthorAge() <= 10)) {
                fail("Unexpected: " + author);
            }
        }
    }

    public void test_selectList_InScopeSubQuery_to_ForeignTable_Union_UnionAll_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();

        // ## Act ##
        cb.query().inScopeAuthor(new LdSubQuery<LdAuthorCB>() {
            public void query(LdAuthorCB subCB) {
                subCB.query().setAuthorId_Equal(3);
                subCB.union(new LdUnionQuery<LdAuthorCB>() {
                    public void query(LdAuthorCB unionCB) {
                        unionCB.query().setAuthorAge_GreaterEqual(30);
                    }
                });
                subCB.unionAll(new LdUnionQuery<LdAuthorCB>() {
                    public void query(LdAuthorCB unionCB) {
                        unionCB.query().setAuthorAge_LessEqual(10);
                    }
                });
            }
        });
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final LdBook book : ls) {
            final LdAuthor author = book.getAuthor();
            _log.debug(book.getBookName() + " -- " + author.getAuthorId() + " - " + author.getAuthorName() + " - "
                    + author.getAuthorAge());
            if (!(author.getAuthorId().equals(3) || author.getAuthorAge() >= 30 || author.getAuthorAge() <= 10)) {
                fail("Unexpected: " + author);
            }
        }
    }
}

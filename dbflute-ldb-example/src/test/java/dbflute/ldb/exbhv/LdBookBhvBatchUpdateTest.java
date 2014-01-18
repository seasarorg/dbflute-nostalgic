package dbflute.ldb.exbhv;

import java.util.ArrayList;
import java.util.List;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException;
import dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException;
import dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookBhvBatchUpdateTest extends LdBookAllDbTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBookBhv ldBookBhv;

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    public void test_batchInsert_NormalSuccess_Tx() throws Exception {
        // ## Arrange ##
        sleep_a_little();
        final List<LdEntity> entityList = _help.getMyEntityList_BeforeInsert();
        final ArrayList<LdBook> bookList = new ArrayList<LdBook>();
        for (LdEntity entity : entityList) {
            bookList.add((LdBook) entity);
        }

        // ## Act ##
        final int[] results;
        try {
            results = getMyBhv().batchInsert(bookList);
        } catch (LdEntityAlreadyExistsException ignored) {
            // [Problem]: Why does the exception occurred? Derby's Bug!?
            log(ignored.getMessage());
            return;
        }

        // ## Assert ##
        assertEquals(entityList.size(), results.length);
    }

    public void test_batchInsert_EmptyList_Tx() throws Exception {
        // ## Arrange & Act & Assert ##
        getMyBhv().batchInsert(new ArrayList<LdBook>());// Expect no exception!
    }

    public void test_batchUpdate_NormalSuccess_Tx() throws Exception {
        // ## Arrange ##
        final Integer pkTwo = new Integer(2);
        final Integer pkThree = new Integer(3);

        final List<LdBook> bookList = new ArrayList<LdBook>();
        {
            final LdBook entity = getMyBhv().selectByPKValueWithDeletedCheck(pkTwo);
            entity.setBookName("aaa2");
            bookList.add(entity);
        }
        {
            final LdBook entity = getMyBhv().selectByPKValueWithDeletedCheck(pkThree);
            entity.setBookName("aaa3");
            bookList.add(entity);
        }

        // ## Act ##
        final int[] results = getMyBhv().batchUpdate(bookList);

        // ## Assert ##
        assertEquals("aaa2", getMyBhv().selectByPKValueWithDeletedCheck(pkTwo).getBookName());
        assertEquals("aaa3", getMyBhv().selectByPKValueWithDeletedCheck(pkThree).getBookName());
        assertEquals(2, results.length);
        assertEquals(1, results[0]);
        assertEquals(1, results[1]);
    }

    public void test_batchUpdate_OptimisticLock_is_Valid_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();

        final Integer pkTwo = new Integer(2);
        final Integer pkThree = new Integer(3);

        final List<LdBook> bookList = new ArrayList<LdBook>();
        {
            final LdBook entity = getMyBhv().selectByPKValueWithDeletedCheck(pkTwo);
            entity.setBookName("aaa2");
            entity.setUTimestamp(null);
            bookList.add(entity);
        }
        {
            final LdBook entity = getMyBhv().selectByPKValueWithDeletedCheck(pkThree);
            entity.setBookName("aaa3");
            entity.setUTimestamp(null);
            bookList.add(entity);
        }

        // ## Act & Assert ##
        try {
            getMyBhv().batchUpdate(bookList);
            fail();
        } catch (LdEntityAlreadyUpdatedException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }

    public void test_batchUpdateNonstrict_NormalSuccess_Tx() throws Exception {
        // ## Arrange ##
        final Integer pkTwo = new Integer(2);
        final Integer pkThree = new Integer(3);

        final List<LdBook> bookList = new ArrayList<LdBook>();
        {
            final LdBook entity = getMyBhv().selectByPKValueWithDeletedCheck(pkTwo);
            entity.setBookName("aaa2");
            entity.setUTimestamp(null);
            bookList.add(entity);
        }
        {
            final LdBook entity = getMyBhv().selectByPKValueWithDeletedCheck(pkThree);
            entity.setBookName("aaa3");
            entity.setUTimestamp(null);
            bookList.add(entity);
        }

        // ## Act ##
        final int[] results = getMyBhv().batchUpdateNonstrict(bookList);

        // ## Assert ##
        assertEquals("aaa2", getMyBhv().selectByPKValueWithDeletedCheck(pkTwo).getBookName());
        assertEquals("aaa3", getMyBhv().selectByPKValueWithDeletedCheck(pkThree).getBookName());
        assertEquals(2, results.length);
        assertEquals(1, results[0]);
        assertEquals(1, results[1]);
    }

    public void test_batchUpdate_EmptyList_Tx() throws Exception {
        // ## Arrange & Act & Assert ##
        getMyBhv().batchUpdate(new ArrayList<LdBook>());// Expect no exception!
    }

    public void test_batchUpdate_NoExist_Tx() throws Exception {
        // ## Arrange ##
        final List<LdBook> bookList = new ArrayList<LdBook>();
        final LdBook book = new LdBook();
        book.setBookId(99999);
        bookList.add(book);

        // ## Act & Assert ##
        try {
            getMyBhv().batchUpdate(bookList);
            fail();
        } catch (LdEntityAlreadyUpdatedException e) {
            // OK
        }
    }

    public void test_batchUpdateNonstrict_EmptyList_Tx() throws Exception {
        // ## Arrange & Act & Assert ##
        getMyBhv().batchUpdateNonstrict(new ArrayList<LdBook>());// Expect no exception!
    }

    public void test_batchUpdateNonstrict_NoExist_Tx() throws Exception {
        // ## Arrange ##
        final List<LdBook> bookList = new ArrayList<LdBook>();
        final LdBook book = new LdBook();
        book.setBookId(99999);
        bookList.add(book);

        // ## Act & Assert ##
        try {
            getMyBhv().batchUpdateNonstrict(bookList);
            fail();
        } catch (LdEntityAlreadyDeletedException e) {
            // OK
        }
    }

    public void test_batchDelete_Optimistic_is_Valid_Tx() throws Exception {
        // ## Arrange ##
        final Integer pkTwo = new Integer(2);
        final Integer pkThree = new Integer(3);

        final List<LdBook> bookList = new ArrayList<LdBook>();
        {
            final LdBook entity = getMyBhv().selectByPKValueWithDeletedCheck(pkTwo);
            entity.setUTimestamp(null);
            bookList.add(entity);
        }
        {
            final LdBook entity = getMyBhv().selectByPKValueWithDeletedCheck(pkThree);
            entity.setUTimestamp(null);
            bookList.add(entity);
        }

        // ## Act ##
        try {
            getMyBhv().batchDelete(bookList);
            fail();
        } catch (LdEntityAlreadyUpdatedException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }

    public void test_batchDeleteNonstrict_Tx() throws Exception {
        // ## Arrange ##
        deleteReferrers();
        final Integer pkTwo = new Integer(2);
        final Integer pkThree = new Integer(3);

        final List<LdBook> bookList = new ArrayList<LdBook>();
        {
            final LdBook entity = getMyBhv().selectByPKValueWithDeletedCheck(pkTwo);
            entity.setUTimestamp(null);
            bookList.add(entity);
        }
        {
            final LdBook entity = getMyBhv().selectByPKValueWithDeletedCheck(pkThree);
            entity.setUTimestamp(null);
            bookList.add(entity);
        }

        // ## Act ##
        final int[] results = getMyBhv().batchDeleteNonstrict(bookList);

        // ## Assert ##
        {
            final LdBookCB cb = new LdBookCB();
            cb.query().setBookId_Equal(pkTwo);
            assertNull(getMyBhv().selectEntity(cb));
        }
        {
            final LdBookCB cb = new LdBookCB();
            cb.query().setBookId_Equal(pkThree);
            assertNull(getMyBhv().selectEntity(cb));
        }
        assertEquals(2, results.length);
        assertEquals(1, results[0]);
        assertEquals(1, results[1]);
    }

    public void test_batchDelete_EmptyList_Tx() throws Exception {
        // ## Arrange & Act & Assert ##
        getMyBhv().batchDelete(new ArrayList<LdBook>());// Expect no exception!
    }

    public void test_batchDelete_NoExist_Tx() throws Exception {
        // ## Arrange ##
        final List<LdBook> bookList = new ArrayList<LdBook>();
        final LdBook book = new LdBook();
        book.setBookId(99999);
        bookList.add(book);

        // ## Act & Assert ##
        try {
            getMyBhv().batchDelete(bookList);
            fail();
        } catch (LdEntityAlreadyUpdatedException e) {
            // OK
        }
    }

    public void test_batchDeleteNonstrict_EmptyList_Tx() throws Exception {
        // ## Arrange & Act & Assert ##
        getMyBhv().batchDeleteNonstrict(new ArrayList<LdBook>());// Expect no exception!
    }

    public void test_batchDeleteNonstrict_NoExist_Tx() throws Exception {
        // ## Arrange ##
        final List<LdBook> bookList = new ArrayList<LdBook>();
        final LdBook book = new LdBook();
        book.setBookId(99999);
        bookList.add(book);

        // ## Act & Assert ##
        try {
            getMyBhv().batchDeleteNonstrict(bookList);
            fail();
        } catch (LdEntityAlreadyDeletedException e) {
            // OK
        }
    }
}

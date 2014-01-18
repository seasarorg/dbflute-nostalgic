package dbflute.ldb.various;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException;
import dbflute.ldb.allcommon.exception.LdSQLFailureException;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.exbhv.LdBookBhv;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 * @since 0.7.7 (2008/07/23 Wednesday)
 */
public class UniqueConstraintTest extends LdBookAllDbTestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final String MY_SQLSTATE = "23505";
    private static final int MY_ERRORCODE = 20000;
    private static final String MY_NOTNULL_SQLSTATE = "23502";
    private static final int MY_NOTNULL_ERRORCODE = 20000;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private LdBookBhv ldBookBhv;
    private final int bookIdTwo = 2;
    private final int bookIdThree = 3;

    // ===================================================================================
    //                                                                   Unique Constraint
    //                                                                   =================
    // -----------------------------------------------------
    //                                                Insert
    //                                                ------
    public void test_insert_unique_constraint_OriginalException_Tx() {
        // ## Arrange ##
        LdBook book = new LdBook();
        book.setBookName("testName");
        book.setIsbn("AAA");
        book.setAuthorId(3);
        book.setPublisherId(3);
        book.setMaxLendingDateCount(14);
        book.classifyOutOfUserSelectYnYes();

        // ## Act & Assert ##
        try {
            ldBookBhv.insert(book);
        } catch (LdEntityAlreadyExistsException ignored) {
            // [Problem]: Why does the exception occurred? Derby's Bug!?
            log(ignored.getMessage());
            return;
        }
        try {
            ldBookBhv.insert(book);
            fail();
        } catch (LdEntityAlreadyExistsException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, cause.getSQLState());
            assertEquals(MY_ERRORCODE, cause.getErrorCode());
        }
    }

    public void test_batchInsert_unique_constraint_OriginalException_Tx() {
        // ## Arrange ##

        List<LdBook> bookList = new ArrayList<LdBook>();
        {
            LdBook book = new LdBook();
            book.setBookName("testName");
            book.setIsbn("GSEBDE1");
            book.setAuthorId(3);
            book.setPublisherId(3);
            book.setMaxLendingDateCount(14);
            book.classifyOutOfUserSelectYnYes();
            bookList.add(book);
        }
        {
            LdBook book = new LdBook();
            book.setBookName("testName");
            book.setIsbn("KHHKDME2");
            book.setAuthorId(3);
            book.setPublisherId(3);
            book.setMaxLendingDateCount(14);
            book.classifyOutOfUserSelectYnYes();
            bookList.add(book);
        }

        // ## Act & Assert ##
        try {
            ldBookBhv.batchInsert(bookList);
        } catch (LdEntityAlreadyExistsException ignored) {
            // [Problem]: Why does the exception occurred? Derby's Bug!?
            log(ignored.getMessage());
            return;
        }
        try {
            ldBookBhv.batchInsert(bookList);
            fail();
        } catch (LdEntityAlreadyExistsException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, cause.getSQLState());
            assertEquals(MY_ERRORCODE, cause.getErrorCode());
        }
    }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    public void test_update_unique_constraint_OriginalException_Tx() {
        // ## Arrange ##

        LdBook book = ldBookBhv.selectByPKValueWithDeletedCheck(bookIdThree);
        book.setIsbn("X0000000001");

        // ## Act & Assert ##
        try {
            ldBookBhv.update(book);
            fail();
        } catch (LdEntityAlreadyExistsException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, cause.getSQLState());
            assertEquals(MY_ERRORCODE, cause.getErrorCode());
        }
    }

    public void test_updateNonstrict_unique_constraint_OriginalException_Tx() {
        // ## Arrange ##

        LdBook book = new LdBook();
        book.setBookId(bookIdThree);
        book.setIsbn("X0000000001");

        // ## Act & Assert ##
        try {
            ldBookBhv.updateNonstrict(book);
            fail();
        } catch (LdEntityAlreadyExistsException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, cause.getSQLState());
            assertEquals(MY_ERRORCODE, cause.getErrorCode());
        }
    }

    public void test_queryUpdate_unique_constraint_OriginalException_Tx() {
        // ## Arrange ##

        LdBook book = new LdBook();
        book.setIsbn("AAA");

        LdBookCB cb = new LdBookCB();
        cb.query().setMaxLendingDateCount_GreaterEqual(0);

        // ## Act & Assert ##
        try {
            ldBookBhv.queryUpdate(book, cb);
            fail();
        } catch (LdEntityAlreadyExistsException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, cause.getSQLState());
            assertEquals(MY_ERRORCODE, cause.getErrorCode());
        }
    }

    public void test_batchUpdate_unique_constraint_OriginalException_Tx() {
        // ## Arrange ##

        List<LdBook> bookList = new ArrayList<LdBook>();
        {
            LdBook book = ldBookBhv.selectByPKValueWithDeletedCheck(bookIdTwo);
            book.setIsbn("AAA");
            bookList.add(book);
        }
        {
            LdBook book = ldBookBhv.selectByPKValueWithDeletedCheck(bookIdThree);
            book.setIsbn("AAA");
            bookList.add(book);
        }

        // ## Act & Assert ##
        try {
            ldBookBhv.batchUpdate(bookList);
            fail();
        } catch (LdEntityAlreadyExistsException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, cause.getSQLState());
            assertEquals(MY_ERRORCODE, cause.getErrorCode());
        }
    }

    public void test_batchUpdateNonstrict_unique_constraint_OriginalException_Tx() {
        // ## Arrange ##
        List<LdBook> bookList = new ArrayList<LdBook>();
        {
            LdBook book = ldBookBhv.selectByPKValueWithDeletedCheck(bookIdTwo);
            book.setIsbn("AAA");
            bookList.add(book);
        }
        {
            LdBook book = ldBookBhv.selectByPKValueWithDeletedCheck(bookIdThree);
            book.setIsbn("AAA");
            bookList.add(book);
        }

        // ## Act & Assert ##
        try {
            ldBookBhv.batchUpdateNonstrict(bookList);
            fail();
        } catch (LdEntityAlreadyExistsException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_SQLSTATE, cause.getSQLState());
            assertEquals(MY_ERRORCODE, cause.getErrorCode());
        }
    }

    // -----------------------------------------------------
    //                                               NotNull
    //                                               -------
    public void test_insert_notnull_constraint_OriginalException_Tx() {
        // ## Arrange ##
        LdBook book = new LdBook();
        book.setBookName("testName");

        // ## Act & Assert ##
        try {
            ldBookBhv.insert(book);
            fail();
        } catch (LdSQLFailureException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
            assertEquals(MY_NOTNULL_SQLSTATE, cause.getSQLState());
            assertEquals(MY_NOTNULL_ERRORCODE, cause.getErrorCode());
        }
    }

    // -----------------------------------------------------
    //                                           Foreign Key
    //                                           -----------
    public void test_insert_foreign_constraint_OriginalException_Tx() {
        // ## Arrange ##
        LdBook book = new LdBook();
        book.setBookName("testName");
        book.setIsbn("AAA");
        book.setAuthorId(123456);
        book.setPublisherId(3);
        book.setMaxLendingDateCount(14);
        book.classifyOutOfUserSelectYnYes();

        // ## Act & Assert ##
        try {
            ldBookBhv.insert(book);
            fail();
        } catch (LdSQLFailureException e) {
            SQLException cause = e.getSQLException();
            log(e.getMessage());
            log("/* * * * * * * * * * * * * * * * *");
            log("SQLState=" + cause.getSQLState() + ", ErrorCode=" + cause.getErrorCode());
            log("* * * * * * * * * */");
        }
    }
}

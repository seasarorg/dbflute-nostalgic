package dbflute.ldb.exbhv;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.seasar.dao.NotSingleRowUpdatedRuntimeException;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;
import dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException;
import dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookBhvEntityUpdateTest extends LdBookAllDbTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Help object instance. */
    protected final MyHelpObject _help = this.new MyHelpObjectImpl();

    protected LdBookBhv ldBookBhv;

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    public void test_update_NoExist_Tx() {
        // ## Arrange ##
        final LdBook book = new LdBook();
        book.setBookId(99999);
        book.setUTimestamp(new Timestamp(System.currentTimeMillis()));

        // ## Act & Assert ##
        try {
            getMyBhv().update(book);
            fail();
        } catch (LdEntityAlreadyUpdatedException e) {
            // OK
        }
    }

    public void test_update_OptimisticLockValueAssertingValid_Tx() throws Exception {
        final LdBook book = new LdBook();
        book.setBookId(new Integer(1));
        try {
            getMyBhv().update(book);
            fail();
        } catch (NotSingleRowUpdatedRuntimeException e) {
            fail();
        } catch (RuntimeException e) {
            // OK
            _log.debug(e.getMessage());
        }
        try {
            book.setUTimestamp(null);
            getMyBhv().update(book);
            fail();
        } catch (NotSingleRowUpdatedRuntimeException e) {
            fail();
        } catch (RuntimeException e) {
            // OK
            _log.debug(e.getMessage());
        }
        final Timestamp timestamp = Timestamp.valueOf("1999-12-31 12:34:56");
        try {
            book.setUTimestamp(timestamp);
            getMyBhv().update(book);
            fail();
        } catch (LdEntityAlreadyUpdatedException e) {
            // OK
            _log.debug(e.getMessage());
            _log.debug("book.getUTimestamp() = " + book.getUTimestamp());
            assertEquals(timestamp, book.getUTimestamp()); // for [DBFLUTE-328]
        }
    }

    public void test_update_CommonColumnOnlyModified_Tx() throws Exception {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookId_Equal(3);
        final LdBook book = getMyBhv().selectEntityWithDeletedCheck(cb);

        // ## Act & Assert ##
        getMyBhv().update(book); // Expect no exception!
    }

    // ===================================================================================
    //                                                                    Update Nonstrict
    //                                                                    ================
    public void test_updateNonstrict_NormalExecution_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();
        final List<LdEntity> ls = _help.getMyEntityList_BeforeUpdate();

        for (final Iterator<LdEntity> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            entity.getModifiedPropertyNames().clear();
            entity.setBookName("kakura");
            if (entity instanceof LdEntityDefinedCommonColumn) {
                // This value must be ignored.
                ((LdEntityDefinedCommonColumn) entity)
                        .setUTimestamp(new Timestamp(System.currentTimeMillis() + 10000L));
            }

            // ## Act ##
            final LdBookBhv bhv = getBehaviorSelector().select(LdBookBhv.class);
            bhv.updateNonstrict(entity);// No Exception!
        }
    }

    public void test_updateNonstrict_NoExist_Tx() {
        // ## Arrange ##
        final LdBook book = new LdBook();
        book.setBookId(99999);

        // ## Act & Assert ##
        final LdBookBhv bhv = getBehaviorSelector().select(LdBookBhv.class);
        try {
            bhv.updateNonstrict(book);
            fail();
        } catch (LdEntityAlreadyDeletedException e) {
            // OK
        }
    }

    public void test_updateNonstrict_OptimisticLockValueAssertingInvalid_Tx() throws Exception {
        deleteSelf();
        final LdBook book = new LdBook();
        book.setBookId(new Integer(1));
        try {
            getMyBhv().updateNonstrict(book);
            fail();
        } catch (LdEntityAlreadyDeletedException e) {
            // OK
            _log.debug(e.getMessage());
        }
        try {
            book.setUTimestamp(null);
            getMyBhv().updateNonstrict(book);
            fail();
        } catch (LdEntityAlreadyDeletedException e) {
            // OK
            _log.debug(e.getMessage());
        }
        try {
            book.setUTimestamp(new Timestamp(System.currentTimeMillis()));
            getMyBhv().updateNonstrict(book);
            fail();
        } catch (LdEntityAlreadyDeletedException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                    Insert or Update
    //                                                                    ================
    public void test_createOrModify_Tx() {
        doTest_createOrModify(_help);
    }

    //    public void test_createOrModifyAfterSelect_Tx() {
    //        doTest_createOrModifyAfterSelect(_help);
    //    }

    public void test_insertOrUpdate_Tx() {
        doTest_insertOrUpdate(_help);
    }

    public void test_insertOrUpdate_CertainlyInsert_Tx() throws Exception {
        // ## Arrange ##
        final LdBook book = new LdBook();
        book.setBookId(99999);
        book.setBookName("BookName");
        book.setAuthorId(1);
        book.setPublisherId(1);
        book.setIsbn("X111");
        book.setMaxLendingDateCount(1);
        book.classifyOutOfUserSelectYnYes();

        final LdBookCB cb = new LdBookCB();
        cb.query().setBookId_Equal(99999);
        assertEquals(0, getMyBhv().selectCount(cb));

        // ## Act & Assert ##
        getMyBhv().insertOrUpdate(book);// No Exception!
    }

    // ===================================================================================
    //                                                                    Delete Nonstrict
    //                                                                    ================
    //    public void test_deleteNonstrict_Tx() {
    //        _log.debug("/- - - - - - - - - - - - - - - - - - - - - - - - - - -");
    //        _log.debug("doTest_deleteNonstrict(): help=" + _help);
    //        _log.debug("- - - - - - - -/");
    //
    //        // ## Arrange ##
    //        deleteReferrers();
    //        final List<LdEntity> ls = _help.getMyEntityList_BeforeUpdate();
    //
    //        for (final Iterator<LdEntity> ite = ls.iterator(); ite.hasNext();) {
    //            final LdBook entity = (LdBook) ite.next();
    //            if (entity instanceof LdEntityDefinedCommonColumn) {
    //                ((LdEntityDefinedCommonColumn) entity)
    //                        .setUTimestamp(new Timestamp(System.currentTimeMillis() + 10000L));
    //            }
    //
    //            // ## Act & Assert ##
    //            try {
    //                getMyBhv().delete(entity);
    //                fail();
    //            } catch (LdEntityAlreadyUpdatedException e) {
    //                // OK
    //            }
    //            getMyBhv().deleteNonstrict(entity);// No Exception!
    //        }
    //    }
}

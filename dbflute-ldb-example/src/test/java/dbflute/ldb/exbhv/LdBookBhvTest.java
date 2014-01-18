package dbflute.ldb.exbhv;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.seasar.framework.util.ResourceUtil;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.LdInternalMapContext;
import dbflute.ldb.allcommon.bhv.batch.LdTokenFileOutputOption;
import dbflute.ldb.allcommon.bhv.batch.LdTokenFileOutputResult;
import dbflute.ldb.allcommon.bhv.batch.LdTokenFileReflectionFailure;
import dbflute.ldb.allcommon.bhv.batch.LdTokenFileReflectionOption;
import dbflute.ldb.allcommon.bhv.batch.LdTokenFileReflectionResult;
import dbflute.ldb.allcommon.bhv.load.LdLoadRefererOption;
import dbflute.ldb.allcommon.bhv.setup.LdConditionBeanSetupper;
import dbflute.ldb.allcommon.bhv.setup.LdEntityListSetupper;
import dbflute.ldb.allcommon.cbean.LdConditionBeanContext;
import dbflute.ldb.allcommon.cbean.LdFetchNarrowingBeanContext;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdPagingResultBean;
import dbflute.ldb.allcommon.cbean.LdUnionQuery;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlContext;
import dbflute.ldb.allcommon.cbean.pagenavi.LdPageNumberLink;
import dbflute.ldb.allcommon.cbean.pagenavi.LdPageNumberLinkSetupper;
import dbflute.ldb.allcommon.cbean.pagenavi.group.LdPageGroupOption;
import dbflute.ldb.allcommon.cbean.pagenavi.range.LdPageRangeOption;
import dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException;
import dbflute.ldb.allcommon.exception.LdEntityDuplicatedException;
import dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException;
import dbflute.ldb.allcommon.exception.LdRecordHasOverlappedException;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.cbean.LdCollectionCB;
import dbflute.ldb.cbean.LdLendingCollectionCB;
import dbflute.ldb.exentity.LdAuthor;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.exentity.LdCollection;
import dbflute.ldb.helper.AaaPage;
import dbflute.ldb.helper.BbbService;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookBhvTest extends LdBookAllDbTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBookBhv ldBookBhv;

    // ===================================================================================
    //                                                                        Basic Select
    //                                                                        ============
    // -----------------------------------------------------
    //                                         Select Entity
    //                                         -------------
    public void test_selectEntityWithDeletedCheck_Success_Tx() {
        _help.replaceMyTableWithForeign();
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookId_Equal(new Integer(1));
        final LdBook entity = ldBookBhv.selectEntityWithDeletedCheck(cb);
        assertEquals(new Integer(1), entity.getBookId());
    }

    public void test_selectEntityWithDeletedCheck_HasAlreadyBeenDeleted_Tx() {
        _help.replaceMyTableWithForeign();
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookId_Equal(new Integer(999));
        try {
            ldBookBhv.selectEntityWithDeletedCheck(cb);
            fail();
        } catch (LdRecordHasAlreadyBeenDeletedException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }

    public void test_selectEntityWithDeletedCheck_AlreadyDeleted_Tx() {
        _help.replaceMyTableWithForeign();
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookId_Equal(new Integer(999));
        try {
            ldBookBhv.selectEntityWithDeletedCheck(cb);
            fail();
        } catch (LdEntityAlreadyDeletedException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }

    public void test_selectEntityWithDeletedCheck_Overlapped_Tx() {
        _help.replaceMyTableWithForeign();
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_NotEqual("aaa");
        try {
            ldBookBhv.selectEntityWithDeletedCheck(cb);
            fail();
        } catch (LdRecordHasOverlappedException e) {
            // OK
            String message = e.getMessage();
            final Throwable cause = e.getCause();
            assertNotNull(cause);
            if (cause != null) {
                message = message + getLineSeparator() + cause.getMessage();
            }
            _log.debug(message);
        }
    }

    public void test_selectEntityWithDeletedCheck_Duplicated_Tx() {
        _help.replaceMyTableWithForeign();
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_NotEqual("aaa");
        try {
            ldBookBhv.selectEntityWithDeletedCheck(cb);
            fail();
        } catch (LdEntityDuplicatedException e) {
            // OK
            String message = e.getMessage();
            final Throwable cause = e.getCause();
            assertNotNull(cause);
            if (cause != null) {
                message = message + getLineSeparator() + cause.getMessage();
            }
            _log.debug(message);
        }
    }

    // -----------------------------------------------------
    //                                           Select Page
    //                                           -----------
    public void test_selectPage_Tx() {
        final LdBookBhv bookBhv = getMyBhv();
        final List<LdBook> allList;
        {
            final LdBookCB cb = new LdBookCB();
            cb.addOrderBy_PK_Asc();
            allList = bookBhv.selectList(cb);
            if (allList.size() < 7) {
                fail("The test data record count is so short! " + allList.size());
            }
        }

        {
            try {
                bookBhv.selectPage(new LdBookCB());
                fail("Not fetchFirst() or fetchScope(), throws exception!");
            } catch (RuntimeException e) {
                // OK
            }
        }
        final LdBookCB cb = new LdBookCB();
        final int pageSize = 2;
        final int allPageCount = (allList.size() / pageSize) + ((allList.size() % pageSize) > 0 ? 1 : 0);
        {
            cb.fetchFirst(pageSize);
            final LdPagingResultBean<LdBook> rb = bookBhv.selectPage(cb);
            try {
                rb.pageGroup().calculateStartPageNumber();
                fail("Not setPageGroupSize(), throws exception!");
            } catch (RuntimeException e) {
                // OK
            }
            try {
                rb.pageRange().createPageNumberArray();
                fail("Not setPageGroupSize(), throws exception!");
            } catch (RuntimeException e) {
                // OK
            }
            rb.setPageGroupSize(2);
            rb.setPageRangeSize(2);
            _log.debug(rb);

            final LdPageNumberLinkSetupper<LdPageNumberLink> pageNumberLinkSetupper = new LdPageNumberLinkSetupper<LdPageNumberLink>() {
                public LdPageNumberLink setup(int pageNumberElement, boolean current) {
                    return new LdPageNumberLink()
                            .initialize(pageNumberElement, current, "?number=" + pageNumberElement);
                }
            };

            assertEquals(allList.subList(0, 2), rb.getSelectedList());
            assertEquals(allList.size(), rb.getAllRecordCount());
            assertEquals(1, rb.getCurrentPageNumber());
            assertEquals(pageSize, rb.getPageSize());
            assertEquals(allPageCount, rb.getAllPageCount());
            assertEquals(1, rb.getCurrentStartRecordNumber());
            assertEquals(2, rb.getCurrentEndRecordNumber());

            {
                final List<LdPageNumberLink> pageNumberLinkList = rb.pageGroup().buildPageNumberLinkList(
                        pageNumberLinkSetupper);
                assertNotNull(pageNumberLinkList);
                assertEquals(rb.pageGroup().createPageNumberArray().length, pageNumberLinkList.size());
                assertEquals(2, pageNumberLinkList.size());
                assertEquals(1, pageNumberLinkList.get(0).getPageNumberElement());
                assertEquals(2, pageNumberLinkList.get(1).getPageNumberElement());
            }

            assertEquals(1, rb.pageGroup().calculateStartPageNumber());
            assertEquals(rb.pageGroup().createPageNumberArray().length, rb.pageGroup().createPageNumberList().size());
            assertEquals(2, rb.pageGroup().createPageNumberArray().length);
            assertEquals(1, rb.pageGroup().createPageNumberArray()[0]);
            assertEquals(2, rb.pageGroup().createPageNumberArray()[1]);

            {
                final List<LdPageNumberLink> pageNumberLinkList = rb.pageRange().buildPageNumberLinkList(
                        pageNumberLinkSetupper);
                assertNotNull(pageNumberLinkList);
                assertEquals(rb.pageRange().createPageNumberArray().length, pageNumberLinkList.size());
                assertEquals(3, pageNumberLinkList.size());
                assertEquals(1, pageNumberLinkList.get(0).getPageNumberElement());
                assertEquals(2, pageNumberLinkList.get(1).getPageNumberElement());
                assertEquals(3, pageNumberLinkList.get(2).getPageNumberElement());
            }

            assertEquals(rb.pageRange().createPageNumberArray().length, rb.pageRange().createPageNumberList().size());
            assertEquals(3, rb.pageRange().createPageNumberArray().length);
            assertEquals(1, rb.pageRange().createPageNumberArray()[0]);
            assertEquals(2, rb.pageRange().createPageNumberArray()[1]);
            assertEquals(3, rb.pageRange().createPageNumberArray()[2]);

            assertFalse(rb.isExistPrePage());
            assertTrue(rb.isExistNextPage());
            assertFalse(rb.pageGroup().isExistPrePageGroup());
            assertTrue(rb.pageGroup().isExistNextPageGroup());

            assertFalse(rb.pageRange().isExistPrePageRange());
            assertTrue(rb.pageRange().isExistNextPageRange());
        }
        {
            final int pageNumber = 2;
            cb.fetchPage(pageNumber);
            final LdPagingResultBean<LdBook> rb = bookBhv.selectPage(cb);
            final LdPageGroupOption pageGroupOption = new LdPageGroupOption();
            pageGroupOption.setPageGroupSize(2);
            final LdPageRangeOption pageRangeOption = new LdPageRangeOption();
            pageRangeOption.setPageRangeSize(2);
            rb.setPageGroupOption(pageGroupOption);
            rb.setPageRangeOption(pageRangeOption);
            _log.debug(rb);

            assertEquals(allList.subList(2, 4), rb.getSelectedList());
            assertEquals(allList.size(), rb.getAllRecordCount());
            assertEquals(pageNumber, rb.getCurrentPageNumber());
            assertEquals(pageSize, rb.getPageSize());
            assertEquals(allPageCount, rb.getAllPageCount());
            assertEquals(3, rb.getCurrentStartRecordNumber());
            assertEquals(4, rb.getCurrentEndRecordNumber());

            assertEquals(1, rb.pageGroup().calculateStartPageNumber());
            assertEquals(rb.pageGroup().createPageNumberArray().length, rb.pageGroup().createPageNumberList().size());
            assertEquals(2, rb.pageGroup().createPageNumberArray().length);
            assertEquals(1, rb.pageGroup().createPageNumberArray()[0]);
            assertEquals(2, rb.pageGroup().createPageNumberArray()[1]);

            assertEquals(rb.pageRange().createPageNumberArray().length, rb.pageRange().createPageNumberList().size());
            assertEquals(4, rb.pageRange().createPageNumberArray().length);
            assertEquals(1, rb.pageRange().createPageNumberArray()[0]);
            assertEquals(2, rb.pageRange().createPageNumberArray()[1]);
            assertEquals(3, rb.pageRange().createPageNumberArray()[2]);
            assertEquals(4, rb.pageRange().createPageNumberArray()[3]);

            assertTrue(rb.isExistPrePage());
            assertTrue(rb.isExistNextPage());
            assertFalse(rb.pageGroup().isExistPrePageGroup());
            assertTrue(rb.pageGroup().isExistNextPageGroup());

            assertFalse(rb.pageRange().isExistPrePageRange());
            if (allPageCount <= 4) {
                assertFalse(rb.pageRange().isExistNextPageRange());
            } else {
                assertTrue(rb.pageRange().isExistNextPageRange());
            }
        }
        {
            final int pageNumber = 1;
            cb.fetchPage(pageNumber);
            final LdPagingResultBean<LdBook> rb = bookBhv.selectPage(cb);
            final LdPageGroupOption pageGroupOption = new LdPageGroupOption();
            pageGroupOption.setPageGroupSize(2);
            final LdPageRangeOption pageRangeOption = new LdPageRangeOption();
            pageRangeOption.setPageRangeSize(8);
            rb.setPageGroupOption(pageGroupOption);
            rb.setPageRangeOption(pageRangeOption);
            _log.debug(rb);

            assertEquals(allList.subList(0, 2), rb.getSelectedList());
            assertEquals(allList.size(), rb.getAllRecordCount());
            assertEquals(pageNumber, rb.getCurrentPageNumber());
            assertEquals(pageSize, rb.getPageSize());
            assertEquals(allPageCount, rb.getAllPageCount());
            assertEquals(1, rb.getCurrentStartRecordNumber());
            assertEquals(2, rb.getCurrentEndRecordNumber());

            assertEquals(1, rb.pageGroup().calculateStartPageNumber());
            assertEquals(rb.pageGroup().createPageNumberArray().length, rb.pageGroup().createPageNumberList().size());
            assertEquals(2, rb.pageGroup().createPageNumberArray().length);
            assertEquals(1, rb.pageGroup().createPageNumberArray()[0]);
            assertEquals(2, rb.pageGroup().createPageNumberArray()[1]);

            assertEquals(rb.pageRange().createPageNumberArray().length, rb.pageRange().createPageNumberList().size());
            assertEquals(4, rb.pageRange().createPageNumberArray().length);
            assertEquals(1, rb.pageRange().createPageNumberArray()[0]);
            assertEquals(2, rb.pageRange().createPageNumberArray()[1]);
            assertEquals(3, rb.pageRange().createPageNumberArray()[2]);
            assertEquals(4, rb.pageRange().createPageNumberArray()[3]);

            assertFalse(rb.isExistPrePage());
            assertTrue(rb.isExistNextPage());
            assertFalse(rb.pageGroup().isExistPrePageGroup());
            assertTrue(rb.pageGroup().isExistNextPageGroup());

            assertFalse(rb.pageRange().isExistPrePageRange());
            if (allPageCount <= 9) {
                assertFalse(rb.pageRange().isExistNextPageRange());
            } else {
                assertTrue(rb.pageRange().isExistNextPageRange());
            }
        }
        {
            final int pageNumber = 3;
            cb.fetchPage(pageNumber);
            final LdPagingResultBean<LdBook> rb = bookBhv.selectPage(cb);
            final LdPageGroupOption pageGroupOption = new LdPageGroupOption();
            pageGroupOption.setPageGroupSize(2);
            final LdPageRangeOption pageRangeOption = new LdPageRangeOption();
            pageRangeOption.setPageRangeSize(1);
            rb.setPageGroupOption(pageGroupOption);
            rb.setPageRangeOption(pageRangeOption);
            _log.debug(rb);

            assertEquals(allList.subList(4, 6), rb.getSelectedList());
            assertEquals(allList.size(), rb.getAllRecordCount());
            assertEquals(pageNumber, rb.getCurrentPageNumber());
            assertEquals(pageSize, rb.getPageSize());
            assertEquals(allPageCount, rb.getAllPageCount());
            assertEquals(5, rb.getCurrentStartRecordNumber());
            assertEquals(6, rb.getCurrentEndRecordNumber());

            assertEquals(3, rb.pageGroup().calculateStartPageNumber());
            assertEquals(rb.pageGroup().createPageNumberArray().length, rb.pageGroup().createPageNumberList().size());
            assertEquals(2, rb.pageGroup().createPageNumberArray().length);
            assertEquals(3, rb.pageGroup().createPageNumberArray()[0]);
            assertEquals(4, rb.pageGroup().createPageNumberArray()[1]);

            assertEquals(rb.pageRange().createPageNumberArray().length, rb.pageRange().createPageNumberList().size());
            assertEquals(3, rb.pageRange().createPageNumberArray().length);
            assertEquals(2, rb.pageRange().createPageNumberArray()[0]);
            assertEquals(3, rb.pageRange().createPageNumberArray()[1]);
            assertEquals(4, rb.pageRange().createPageNumberArray()[2]);

            assertTrue(rb.isExistPrePage());
            assertTrue(rb.isExistNextPage());
            assertTrue(rb.pageGroup().isExistPrePageGroup());

            assertTrue(rb.pageRange().isExistPrePageRange());
            assertFalse(rb.pageRange().isExistNextPageRange());
        }
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    public void test_queryDelete_Tx() {
        // ## Arrange ##
        deleteReferrers();
        LdBook book = new LdBook();
        book.classifyOutOfUserSelectYnNo();
        LdBookCB cb = new LdBookCB();
        cb.query().setAuthorId_Equal(3);

        // ## Act ##
        int deletedCount = getMyBhv().queryDelete(cb);

        // ## Assert ##
        assertTrue(deletedCount > 0);
        LdBookCB actualCB = new LdBookCB();
        actualCB.query().setAuthorId_Equal(3);
        LdListResultBean<LdBook> actualList = getMyBhv().selectList(actualCB);
        assertListEmtpy(actualList);
    }

    public void test_queryDelete_by_foreignColumn_Tx() {
        // ## Arrange ##
        deleteReferrers();
        final LdBookCB cb = new LdBookCB();
        final int allCount = getMyBhv().selectCount(cb);
        cb.query().queryAuthor().setAuthorAge_GreaterEqual(30);
        final int expected = getMyBhv().selectCount(cb);

        // ## Act ##
        final int actual = getMyBhv().queryDelete(cb);

        // ## Assert ##
        assertEquals(expected, actual);
        assertEquals(0, getMyBhv().selectCount(cb));
        final LdBookCB confirmCB = new LdBookCB();
        confirmCB.query().queryAuthor().setAuthorAge_LessThan(30);
        assertEquals(allCount - actual, getMyBhv().selectCount(confirmCB));
    }

    public void test_queryDelete_Union_Tx() {
        // ## Arrange ##
        deleteReferrers();
        final LdBookCB cb = new LdBookCB();
        cb.query().queryAuthor().setAuthorAge_GreaterEqual(30);
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().queryAuthor().setAuthorAge_LessEqual(10);
            }
        });

        // ## Act ##
        final int actual = getMyBhv().queryDelete(cb);

        // DerbyがBLOBのUNIONができないので、厳密なテストがしにくい...

        // ## Assert ##
        assertNotSame(0, actual);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    public void test_queryUpdate_Tx() {
        // ## Arrange ##
        LdBook book = new LdBook();
        book.classifyOutOfUserSelectYnNo();
        LdBookCB cb = new LdBookCB();
        cb.query().setAuthorId_Equal(3);

        // ## Act ##
        int updatedCount = getMyBhv().queryUpdate(book, cb);

        // ## Assert ##
        assertTrue(updatedCount > 0);
        LdBookCB actualCB = new LdBookCB();
        actualCB.query().setAuthorId_Equal(3);
        LdListResultBean<LdBook> actualList = getMyBhv().selectList(actualCB);
        for (LdBook actual : actualList) {
            assertTrue(actual.isOutOfUserSelectYnNo());
        }
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    public void test_loadReferer_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();

        final LdBookCB cb = new LdBookCB();

        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            for (LdBook entity : ls) {
                assertFalse(entity.getCollectionList().size() > 0);
                final List<LdCollection> colList = entity.getCollectionList();
                assertNotNull(colList);
            }
            getMyBhv().loadCollectionList(ls, new LdConditionBeanSetupper<LdCollectionCB>() {
                public void setup(LdCollectionCB cb) {
                    cb.query().addOrderBy_CollectionId_Asc();
                }
            });

            final LdCollectionBhv referrerBhv = getBehaviorSelector().select(LdCollectionBhv.class);
            for (LdBook entity : ls) {
                if (!entity.getCollectionList().isEmpty()) {
                    assertTrue(entity.getCollectionList().size() > 0);
                } else {
                    assertFalse(entity.getCollectionList().size() > 0);
                }
                final List<LdCollection> colList = entity.getCollectionList();
                assertNotNull(colList);

                final LdCollectionCB referrerCB = referrerBhv.newMyConditionBean();
                referrerCB.query().setBookId_Equal(entity.getBookId());
                referrerCB.query().addOrderBy_CollectionId_Asc();
                assertEquals(referrerBhv.selectList(referrerCB), colList);

                for (LdCollection collection : colList) {
                    assertTrue(collection.getBook() != null);
                    assertNotNull(collection.getBook());
                }
            }
        }
        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            final LdConditionBeanSetupper<LdCollectionCB> conditionBeanSetupper = new LdConditionBeanSetupper<LdCollectionCB>() {
                public void setup(LdCollectionCB cb) {
                    cb.query().addOrderBy_ArrivalDate_Desc();
                }
            };
            for (LdBook entity : ls) {
                assertFalse(entity.getCollectionList().size() > 0);
                final List<LdCollection> colList = entity.getCollectionList();
                assertNotNull(colList);
            }
            getMyBhv().loadCollectionList(ls, conditionBeanSetupper);

            final LdCollectionBhv reffererBhv = getBehaviorSelector().select(LdCollectionBhv.class);
            for (LdBook entity : ls) {
                if (!entity.getCollectionList().isEmpty()) {
                    assertTrue(entity.getCollectionList().size() > 0);
                } else {
                    assertFalse(entity.getCollectionList().size() > 0);
                }
                final List<LdCollection> colList = entity.getCollectionList();
                assertNotNull(colList);

                final LdCollectionCB reffererCB = reffererBhv.newMyConditionBean();
                reffererCB.query().setBookId_Equal(entity.getBookId());
                reffererCB.query().addOrderBy_ArrivalDate_Desc();
                assertEquals(reffererBhv.selectList(reffererCB), colList);

                for (LdCollection collection : colList) {
                    assertTrue(collection.getBook() != null);
                    assertNotNull(collection.getBook());
                }
            }
        }
        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            getMyBhv().loadCollectionList(ls, new LdConditionBeanSetupper<LdCollectionCB>() {
                public void setup(LdCollectionCB cb) {
                    cb.query().queryCollectionStatusAsOne().addOrderBy_CollectionStatusCode_Desc();
                }
            });

            final LdCollectionBhv reffererBhv = getBehaviorSelector().select(LdCollectionBhv.class);
            for (Object object : ls) {
                final LdBook entity = (LdBook) object;
                final List<LdCollection> colList = entity.getCollectionList();
                assertNotNull(colList);

                final LdCollectionCB reffererCB = reffererBhv.newMyConditionBean();
                reffererCB.query().setBookId_Equal(entity.getBookId());
                reffererCB.query().queryCollectionStatusAsOne().addOrderBy_CollectionStatusCode_Desc();
                assertEquals(reffererBhv.selectList(reffererCB), colList);

                for (LdCollection collection : colList) {
                    assertNotNull(collection.getBook());
                }
            }
        }
    }

    public void test_loadReferer_OptionXxx_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();

        final LdBookCB cb = new LdBookCB();

        {
            final List<LdBook> entityList = getMyBhv().selectList(cb);
            final LdConditionBeanSetupper<LdCollectionCB> conditionBeanSetupper = new LdConditionBeanSetupper<LdCollectionCB>() {
                public void setup(LdCollectionCB cb) {
                    cb.query().addOrderBy_ArrivalDate_Desc();
                }
            };
            final LdEntityListSetupper<LdCollection> entityListSetupper = new LdEntityListSetupper<LdCollection>() {
                public void setup(List<LdCollection> entityList) {
                    final LdCollectionBhv collectionBhv = getBehaviorSelector().select(LdCollectionBhv.class);
                    collectionBhv.loadLendingCollectionList(entityList,
                            new LdConditionBeanSetupper<LdLendingCollectionCB>() {
                                public void setup(LdLendingCollectionCB cb) {
                                }
                            });
                }
            };
            final LdLoadRefererOption<LdCollectionCB, LdCollection> loadRefererOption = new LdLoadRefererOption<LdCollectionCB, LdCollection>();
            loadRefererOption.setConditionBeanSetupper(conditionBeanSetupper);
            loadRefererOption.setEntityListSetupper(entityListSetupper);
            getMyBhv().loadCollectionList(entityList, loadRefererOption.toLastKeyCondition().stopOrderByKey());

            // TODO: @jflute - To Assert
            //            final LdCollectionBhv reffererBhv = (LdCollectionBhv) getRBhv(LdCollectionBhv.class);
            //            for (Object object : ls) {
            //                final LdBook entity = (LdBook) object;
            //                final List<LdCollection> colList = entity.getCollectionList();
            //                assertNotNull(colList);
            //
            //                final LdCollectionCB reffererCB = reffererBhv.newMyConditionBean();
            //                reffererCB.query().setBookId_Equal(entity.getBookId());
            //                reffererCB.query().addOrderBy_ArrivalDate_Desc();
            //                assertEquals(reffererBhv.selectList(reffererCB), colList);
            //
            //                for (LdCollection collection : colList) {
            //                    assertNotNull(collection.getBook());
            //                }
            //            }
        }
    }

    public void test_Bhv_LoadReferer_Option_OriginalConditionBean_Tx() {
        _help.replaceMyTableWithAll();

        final LdBookCB cb = new LdBookCB();

        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            final LdConditionBeanSetupper<LdCollectionCB> conditionBeanSetupper = new LdConditionBeanSetupper<LdCollectionCB>() {
                public void setup(LdCollectionCB cb) {
                    cb.query().addOrderBy_ArrivalDate_Desc();
                }
            };
            final LdCollectionCB reffererCB = new LdCollectionCB();
            reffererCB.query().setArrivalDate_LessEqual(new Timestamp(System.currentTimeMillis()));
            reffererCB.query().addOrderBy_RModule_Desc();
            final LdLoadRefererOption<LdCollectionCB, LdCollection> loadRefererOption = new LdLoadRefererOption<LdCollectionCB, LdCollection>(
                    conditionBeanSetupper);
            loadRefererOption.setRefererConditionBean(reffererCB);
            getMyBhv().loadCollectionList(ls, loadRefererOption);

            // TODO: @jflute - To Assert
            //            final LdCollectionBhv reffererBhv = (LdCollectionBhv) getRBhv(LdCollectionBhv.class);
            //            for (Object object : ls) {
            //                final LdBook entity = (LdBook) object;
            //                final List<LdCollection> colList = entity.getCollectionList();
            //                assertNotNull(colList);
            //
            //                final LdCollectionCB reffererCB = reffererBhv.newMyConditionBean();
            //                reffererCB.query().setBookId_Equal(entity.getBookId());
            //                reffererCB.query().addOrderBy_ArrivalDate_Desc();
            //                assertEquals(reffererBhv.selectList(reffererCB), colList);
            //
            //                for (LdCollection collection : colList) {
            //                    assertNotNull(collection.getBook());
            //                }
            //            }
        }
    }

    // ===================================================================================
    //                                                                     PullOut Foreign
    //                                                                     ===============
    public void test_pulloutForeign_doSetupSelect_Tx() throws Exception {
        final LdBookBhv bhv = getMyBhv();
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        final LdListResultBean<LdBook> ls = bhv.selectList(cb);
        final List<LdAuthor> authorList = bhv.pulloutAuthor(ls);
        final LdAuthorBhv authorBhv = getBehaviorSelector().select(LdAuthorBhv.class);
        authorBhv.loadBookList(authorList, new LdConditionBeanSetupper<LdBookCB>() {
            public void setup(LdBookCB cb) {
            }
        });
        assertTrue(authorList.size() > 0);
        for (LdBook book : ls) {
            final LdAuthor author = book.getAuthor();
            _log.debug("author -- " + author);
            final List<LdBook> bookList = author.getBookList();
            for (LdBook book2 : bookList) {
                _log.debug("    book2 -- " + book2);
            }
        }
    }

    public void test_pulloutForeign_doNotSetupSelect_Tx() throws Exception {
        final LdBookBhv bhv = getMyBhv();
        final LdBookCB cb = new LdBookCB();// Not Join
        final LdListResultBean<LdBook> ls = bhv.selectList(cb);
        final List<LdAuthor> authorList = bhv.pulloutAuthor(ls);
        final LdAuthorBhv authorBhv = getBehaviorSelector().select(LdAuthorBhv.class);
        authorBhv.loadBookList(authorList, new LdConditionBeanSetupper<LdBookCB>() {
            public void setup(LdBookCB cb) {
            }
        });
        assertEquals(0, authorList.size());
    }

    // ===================================================================================
    //                                                                  Reflect Token File
    //                                                                  ==================
    public void test_tokenFileReflection_reflectTokenFile_Tx() throws Exception {
        deleteReferrers();
        getMyBhv().queryDelete(new LdBookCB());

        int beforeCount = getMyBhv().getCountAll();

        String filename = getInputFilename();
        LdTokenFileReflectionOption tokenFileReflectionOption = new LdTokenFileReflectionOption();
        tokenFileReflectionOption.encodeAsUTF8().delimitateByComma();
        LdTokenFileReflectionResult result = getMyBhv().tokenFileReflection().reflectTokenFile(filename,
                tokenFileReflectionOption);
        assertNotNull(result);
        assertNotSame(0, result.getSuccessCount());
        List<LdTokenFileReflectionFailure> failureList = result.getFailureList();
        assertFalse(failureList.isEmpty());

        for (LdTokenFileReflectionFailure failure : failureList) {
            final List<String> columnNameList = failure.getColumnNameList();
            assertNotNull(columnNameList);
            final List<String> valueList = failure.getValueList();
            assertNotNull(valueList);

            final String rowString = failure.getRowString();
            assertNotNull(rowString);

            final int rowNumber = failure.getRowNumber();
            assertTrue(rowNumber > 0);

            final int lineNumber = failure.getLineNumber();
            assertTrue(lineNumber > 0);

            final LdEntity entity = failure.getEntity();
            _log.debug("rowNumber(" + rowNumber + ") lineNumber(" + lineNumber + ") - " + entity);

            final Exception exception = failure.getException();
            assertNotNull(exception);
            _log.debug("exception: " + exception.getMessage());
        }

        final int afterCount = getMyBhv().getCountAll();
        _log.debug("beforeCount:" + beforeCount + " - afterCount:" + afterCount + " == successCount:"
                + result.getSuccessCount());
        assertTrue(beforeCount < afterCount);
        assertTrue((afterCount - beforeCount) == result.getSuccessCount());
    }

    protected String getInputFilename() throws IOException {
        final File buildDir = ResourceUtil.getBuildDir(this.getClass());
        final String canonicalPath = buildDir.getCanonicalPath();
        final String packageName = this.getClass().getPackage().getName();
        final String packagePath = packageName.replaceAll("\\.", "/");
        return canonicalPath + "/" + packagePath + "/" + "BookTokenFile.txt";
    }

    // ===================================================================================
    //                                                                   Output Token File
    //                                                                   =================
    public void test_tokenFileOutput_outputTokenFile_Tx() throws Exception {
        // ## Arrange ##
        String filename = getOutputFilename();
        LdBookCB cb = new LdBookCB();
        cb.query().setGenreCode_IsNotNull();
        LdTokenFileOutputOption tokenFileOutputOption = new LdTokenFileOutputOption();
        tokenFileOutputOption.delimitateByComma().encodeAsUTF8();

        // ## Act ##
        LdTokenFileOutputResult outputResult = getMyBhv().tokenFileOutput().outputTokenFile(cb, filename,
                tokenFileOutputOption);

        // ## Assert ##
        List<LdEntity> ls = outputResult.getSelectedList();
        for (LdEntity entity : ls) {
            _log.debug(entity);
        }
        LdTokenFileReflectionOption tokenFileReflectionOption = new LdTokenFileReflectionOption();
        tokenFileReflectionOption.delimitateByComma().encodeAsUTF8();
        LdTokenFileReflectionResult reflectionResult = getMyBhv().tokenFileReflection().reflectTokenFile(filename,
                tokenFileReflectionOption);
        int successCount = reflectionResult.getSuccessCount();
        assertEquals(successCount, ls.size());
    }

    protected String getOutputFilename() throws IOException {
        final File buildDir = ResourceUtil.getBuildDir(this.getClass());
        final String canonicalPath = buildDir.getCanonicalPath();
        final String packageName = this.getClass().getPackage().getName();
        final String packagePath = packageName.replaceAll("\\.", "/");
        return canonicalPath + "/" + packagePath + "/" + "BookOutputTokenFile.txt";
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    // TODO: @jflute: Migration to outsideSql
    //    public void test_selectListBookFromHierarchyFlat_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        // ## Act ##
    //        final List<LdBook> ls = getMyBhv().selectListBookFromHierarchyFlat();
    //
    //        // ## Assert ##
    //        for (LdBook book : ls) {
    //            final LdAuthor author = book.getAuthor();
    //
    //            _log.debug("Book{" + book.getBookId() + "} -- modifiedPropertyNames:" + book.getModifiedPropertyNames());
    //            _log.debug("Author{" + author.getAuthorId() + "} -- modifiedPropertyNames:"
    //                    + book.getModifiedPropertyNames());
    //            final List<LdCollection> collectionList = book.getCollectionList();
    //            for (LdCollection collection : collectionList) {
    //                _log.debug("    Collection{" + collection.getCollectionId() + "} -- modifiedPropertyNames:"
    //                        + book.getModifiedPropertyNames());
    //            }
    //            assertEquals(0, book.getModifiedPropertyNames().size());
    //            assertEquals(0, author.getModifiedPropertyNames().size());
    //        }
    //    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    public void test_helpConvertingSequenceObject() throws Exception {
        doTest_helpConvertingSequenceObject(new Integer(3));
        doTest_helpConvertingSequenceObject(new Long(3));
        doTest_helpConvertingSequenceObject(new BigDecimal(3));
        doTest_helpConvertingSequenceObject("3");
    }

    protected void doTest_helpConvertingSequenceObject(final Object value) throws Exception {
        // ## Arrange ##
        final Map<String, Object> resultMap = new HashMap<String, Object>();
        final LdBookBhv bhv = new LdBookBhv() {
            @Override
            public String toString() {
                final Object result = helpConvertingSequenceObject(BigDecimal.class, value);
                resultMap.put("result", result);
                return "test";
            }
        };

        // ## Act ##
        final String evidence = bhv.toString();

        // ## Assert ##
        assertEquals("test", evidence);
        final Object actualValue = resultMap.get("result");
        _log.debug("actualValue=" + actualValue + " actualValueType=" + actualValue.getClass());
        assertEquals(new BigDecimal("3"), actualValue);
    }

    // ===================================================================================
    //                                                                        Thread Local
    //                                                                        ============
    public void test_selectList_clearThread_afterExecutingSuccess_Tx() throws Exception {
        // ## Assert ##
        final LdBookCB cb = new LdBookCB();

        // ## Act ##
        final List<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertNotNull(bookList);
        assertFalse(LdInternalMapContext.isExistInternalMapContextOnThread());
        assertFalse(LdConditionBeanContext.isExistConditionBeanOnThread());
        assertFalse(LdOutsideSqlContext.isExistOutsideSqlContextOnThread());
        assertFalse(LdFetchNarrowingBeanContext.isExistFetchNarrowingBeanOnThread());
    }

    public void test_selectList_clearThread_afterExecutingException_Tx() throws Exception {
        // ## Assert ##
        final LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
            }
        });
        cb.query().addOrderBy_GenreCode_Asc();// No specifed column

        // ## Act ##
        try {
            getMyBhv().selectList(cb);
            fail();
        } catch (RuntimeException e) {
            // OK
        }

        // ## Assert ##
        assertFalse(LdInternalMapContext.isExistInternalMapContextOnThread());
        assertFalse(LdConditionBeanContext.isExistConditionBeanOnThread());
        assertFalse(LdOutsideSqlContext.isExistOutsideSqlContextOnThread());
        assertFalse(LdFetchNarrowingBeanContext.isExistFetchNarrowingBeanOnThread());
    }

    // ===================================================================================
    //                                                                       Trace Logging
    //                                                                       =============
    public void test_traceLogging_WatchingCheck_Tx() {
        new AaaPage(getMyBhv()).callBehavior();
        new AaaPage(getMyBhv()).callSelfAndCallBehavior();
        new AaaPage(getMyBhv()).callService();
        new AaaPage(getMyBhv()).callServiceOfCallSelf();
        new BbbService(getMyBhv()).callBehavior();
        new BbbService(getMyBhv()).callSelfAndCallBehavior();
        new BbbService(getMyBhv()).callPageOfCallBehavior();
        new BbbService(getMyBhv()).callPageOfCallServiceOfCallSelf();
    }
}

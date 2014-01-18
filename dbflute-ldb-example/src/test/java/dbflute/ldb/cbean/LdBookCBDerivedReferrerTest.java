package dbflute.ldb.cbean;

import java.sql.Timestamp;
import java.util.List;

import dbflute.ldb.allcommon.bhv.setup.LdConditionBeanSetupper;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdSubQuery;
import dbflute.ldb.allcommon.cbean.LdUnionQuery;
import dbflute.ldb.allcommon.cbean.LdAbstractConditionBean.DerivedReferrerEntityPropertyNotFoundException;
import dbflute.ldb.allcommon.cbean.LdAbstractConditionBean.DerivedReferrerInvalidAliasNameException;
import dbflute.ldb.allcommon.cbean.LdAbstractConditionBean.DerivedReferrerInvalidForeignSpecificationException;
import dbflute.ldb.allcommon.cbean.LdAbstractConditionQuery.SpecifyDerivedReferrerInvalidColumnSpecificationException;
import dbflute.ldb.allcommon.cbean.LdAbstractConditionQuery.SpecifyDerivedReferrerUnmatchedColumnTypeException;
import dbflute.ldb.allcommon.exception.LdSQLFailureException;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.exentity.LdCollection;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 * @since 0.7.4 (2008/06/14 Saturday)
 */
public class LdBookCBDerivedReferrerTest extends LdBookAllDbTestCase {

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_derivedReferrer_max_Timestamp_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnArrivalDate();
            }
        }, "GENERAL_TIMESTAMP");

        // ## Act ##
        final List<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertNotSame(0, bookList.size());
        getMyBhv().loadCollectionList(bookList, new LdConditionBeanSetupper<LdCollectionCB>() {
            public void setup(LdCollectionCB cb) {
            }
        });
        boolean existsDerived = false;
        for (LdBook book : bookList) {
            Timestamp generalTimestamp = book.getGeneralTimestamp();
            log(book.getBookName() + ", " + generalTimestamp);
            if (generalTimestamp == null) {
                continue;
            }
            existsDerived = true;
            List<LdCollection> collectionList = book.getCollectionList();
            Timestamp expectedDate = null;
            for (LdCollection collection : collectionList) {
                Timestamp arrivalDate = collection.getArrivalDate();
                if (expectedDate == null) {
                    expectedDate = arrivalDate;
                } else if (arrivalDate.getTime() > expectedDate.getTime()) {
                    expectedDate = arrivalDate;
                }
            }
            assertEquals(expectedDate.getTime(), generalTimestamp.getTime());
        }
        assertTrue(existsDerived);
    }

    public void test_derivedReferrer_min_Timestamp_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.specify().derivedCollectionList().min(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnArrivalDate();
            }
        }, "GENERAL_TIMESTAMP");

        // ## Act ##
        final List<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertNotSame(0, bookList.size());
        getMyBhv().loadCollectionList(bookList, new LdConditionBeanSetupper<LdCollectionCB>() {
            public void setup(LdCollectionCB cb) {
            }
        });
        boolean existsDerived = false;
        for (LdBook book : bookList) {
            Timestamp generalTimestamp = book.getGeneralTimestamp();
            log(book.getBookName() + ", " + generalTimestamp);
            if (generalTimestamp == null) {
                continue;
            }
            existsDerived = true;
            List<LdCollection> collectionList = book.getCollectionList();
            Timestamp expectedDate = null;
            for (LdCollection collection : collectionList) {
                Timestamp arrivalDate = collection.getArrivalDate();
                if (expectedDate == null) {
                    expectedDate = arrivalDate;
                } else if (arrivalDate.getTime() < expectedDate.getTime()) {
                    expectedDate = arrivalDate;
                }
            }
            assertEquals(expectedDate.getTime(), generalTimestamp.getTime());
        }
        assertTrue(existsDerived);
    }

    public void test_derivedReferrer_sum_Integer_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.specify().derivedCollectionList().avg(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnLibraryId();
            }
        }, "GENERAL_INTEGER");

        // ## Act ##
        final List<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertNotSame(0, bookList.size());
        boolean existsDerived = false;
        for (LdBook book : bookList) {
            Integer generalInteger = book.getGeneralInteger();
            if (generalInteger != null) {
                existsDerived = true;
            }
            log(book.getBookName() + ", " + generalInteger);
        }
        assertTrue(existsDerived);
    }

    public void test_derivedReferrer_avg_Integer_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.specify().derivedCollectionList().avg(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnLibraryId();
            }
        }, "GENERAL_INTEGER");

        // ## Act ##
        final List<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertNotSame(0, bookList.size());
        boolean existsDerived = false;
        for (LdBook book : bookList) {
            Integer generalInteger = book.getGeneralInteger();
            if (generalInteger != null) {
                existsDerived = true;
            }
            log(book.getBookName() + ", " + generalInteger);
        }
        assertTrue(existsDerived);
    }

    public void test_derivedReferrer_count_Integer_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.specify().derivedCollectionList().count(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnCollectionId();
            }
        }, "GENERAL_INTEGER");

        // ## Act ##
        final List<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertNotSame(0, bookList.size());
        getMyBhv().loadCollectionList(bookList, new LdConditionBeanSetupper<LdCollectionCB>() {
            public void setup(LdCollectionCB cb) {
            }
        });
        for (LdBook book : bookList) {
            Integer generalInteger = book.getGeneralInteger();
            assertNotNull(generalInteger); // Because count
            log(book.getBookName() + ", " + generalInteger);
            List<LdCollection> collectionList = book.getCollectionList();
            assertEquals(collectionList.size(), generalInteger.intValue());
        }
    }

    public void test_derivedReferrer_countDistinct_Integer_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.specify().derivedCollectionList().countDistinct(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnArrivalDate();
            }
        }, "GENERAL_INTEGER");

        // ## Act ##
        final List<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertNotSame(0, bookList.size());
        getMyBhv().loadCollectionList(bookList, new LdConditionBeanSetupper<LdCollectionCB>() {
            public void setup(LdCollectionCB cb) {
            }
        });
        assertTrue(cb.toDisplaySql().contains("count(distinct"));
        for (LdBook book : bookList) {
            Integer generalInteger = book.getGeneralInteger();
            assertNotNull(generalInteger); // Because count
            log(book.getBookName() + ", " + generalInteger);
            List<LdCollection> collectionList = book.getCollectionList();
            assertTrue(collectionList.size() >= generalInteger.intValue());
        }
    }

    public void test_derivedReferrer_max_union_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.specify().derivedCollectionList().min(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnArrivalDate();
                subCB.query().queryCollectionStatusAsOne().setCollectionStatusCode_Equal_OUT();
                subCB.union(new LdUnionQuery<LdCollectionCB>() {
                    public void query(LdCollectionCB unionCB) {
                        unionCB.query().queryCollectionStatusAsOne().setCollectionStatusCode_Equal_NOR();
                    }
                });
                subCB.union(new LdUnionQuery<LdCollectionCB>() {
                    public void query(LdCollectionCB unionCB) {
                        unionCB.query().queryCollectionStatusAsOne().setCollectionStatusCode_Equal_WAT();
                    }
                });
            }
        }, "GENERAL_TIMESTAMP");

        // ## Act ##
        try {
            getMyBhv().selectList(cb);
        } catch (LdSQLFailureException ignored) {
            // TODO: @jflute [DBFLUTE-391]
            log(ignored.getMessage());
        }
        // ## Assert ##
        //        assertNotSame(0, bookList.size());
        //        boolean existsDerived = false;
        //        for (LdBook book : bookList) {
        //            Timestamp generalTimestamp = book.getGeneralTimestamp();
        //            log(book.getBookName() + ", " + generalTimestamp);
        //            if (generalTimestamp == null) {
        //                continue;
        //            }
        //            existsDerived = true;
        //            List<LdCollection> collectionList = book.getCollectionList();
        //            Timestamp expectedDate = null;
        //            for (LdCollection collection : collectionList) {
        //                Timestamp arrivalDate = collection.getArrivalDate();
        //                if (expectedDate == null) {
        //                    expectedDate = arrivalDate;
        //                } else if (arrivalDate.getTime() > expectedDate.getTime()) {
        //                    expectedDate = arrivalDate;
        //                }
        //            }
        //            assertEquals(expectedDate.getTime(), generalTimestamp.getTime());
        //        }
        //        assertTrue(existsDerived);
    }

    public void test_union_derivedReferrer_max_Timestamp_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnArrivalDate();
            }
        }, "GENERAL_TIMESTAMP");
        cb.query().setGenreCode_IsNotNull();
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setGenreCode_IsNull();
            }
        });

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertNotSame(0, bookList.size());
        getMyBhv().loadCollectionList(bookList, new LdConditionBeanSetupper<LdCollectionCB>() {
            public void setup(LdCollectionCB cb) {
            }
        });
        boolean existsDerived = false;
        for (LdBook book : bookList) {
            Timestamp generalTimestamp = book.getGeneralTimestamp();
            log(book.getBookName() + ", " + generalTimestamp);
            if (generalTimestamp == null) {
                continue;
            }
            existsDerived = true;
            List<LdCollection> collectionList = book.getCollectionList();
            Timestamp expectedDate = null;
            for (LdCollection collection : collectionList) {
                Timestamp arrivalDate = collection.getArrivalDate();
                if (expectedDate == null) {
                    expectedDate = arrivalDate;
                } else if (arrivalDate.getTime() > expectedDate.getTime()) {
                    expectedDate = arrivalDate;
                }
            }
            assertEquals(expectedDate.getTime(), generalTimestamp.getTime());
        }
        assertTrue(existsDerived);
    }

    public void test_derivedOrderBy_Timestamp_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnArrivalDate();
            }
        }, "GENERAL_TIMESTAMP");
        cb.query().addSpecifiedDerivedOrderBy_Asc("GENERAL_TIMESTAMP");

        // ## Act ##
        final List<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertNotSame(0, bookList.size());
        getMyBhv().loadCollectionList(bookList, new LdConditionBeanSetupper<LdCollectionCB>() {
            public void setup(LdCollectionCB cb) {
            }
        });
        boolean existsDerived = false;
        Timestamp preDate = null;
        for (LdBook book : bookList) {
            Timestamp generalTimestamp = book.getGeneralTimestamp();
            log(book.getBookName() + ", " + generalTimestamp);
            if (generalTimestamp == null) {
                continue;
            }
            existsDerived = true;
            if (preDate == null) {
                preDate = generalTimestamp;
                continue;
            }
            if (preDate.getTime() >= generalTimestamp.getTime()) {
                fail();
            }
        }
        assertTrue(existsDerived);
    }

    // ===================================================================================
    //                                                                              Detail
    //                                                                              ======
    public void test_specify_deriveReferrerList_max_Timestamp_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnOpeningPart();
        cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnArrivalDate();
            }
        }, "GENERAL_TIMESTAMP");

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        boolean existsGeneralTimestamp = false;
        for (LdBook book : bookList) {
            String bookName = book.getBookName();
            Timestamp generalTimestamp = book.getGeneralTimestamp();
            log("bookName=" + bookName + ", generalTimestamp=" + generalTimestamp);
            if (generalTimestamp != null) {
                existsGeneralTimestamp = true;
            }
        }
        assertTrue(existsGeneralTimestamp);
    }

    public void test_specify_deriveReferrerList_min_Integer_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnOpeningPart();
        cb.specify().derivedCollectionList().min(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnLibraryId();
                subCB.query().queryCollectionStatusAsOne().setCollectionStatusCode_Equal_NOR();
            }
        }, "generalInteger");

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        boolean existsGeneralInteger = false;
        for (LdBook book : bookList) {
            String bookName = book.getBookName();
            Integer generalInteger = book.getGeneralInteger();
            log("bookName=" + bookName + ", generalInteger=" + generalInteger);
            if (generalInteger != null) {
                existsGeneralInteger = true;
            }
        }
        assertTrue(existsGeneralInteger);
    }

    public void test_specify_deriveReferrerList_sum_Integer_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnOpeningPart();
        cb.specify().derivedCollectionList().sum(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnCollectionId();
                subCB.query().queryCollectionStatusAsOne().setCollectionStatusCode_Equal_NOR();
            }
        }, "GENERAL_INTEGER");

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        boolean existsGeneralInteger = false;
        for (LdBook book : bookList) {
            String bookName = book.getBookName();
            Integer generalInteger = book.getGeneralInteger();
            log("bookName=" + bookName + ", generalInteger=" + generalInteger);
            if (generalInteger != null) {
                existsGeneralInteger = true;
            }
        }
        assertTrue(existsGeneralInteger);
    }

    public void test_specify_deriveReferrerList_avg_Integer_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.specify().derivedCollectionList().avg(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnCollectionId();
                subCB.query().queryCollectionStatusAsOne().setCollectionStatusCode_Equal_NOR();
            }
        }, "generalInteger");

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        boolean existsGeneralInteger = false;
        for (LdBook book : bookList) {
            String bookName = book.getBookName();
            Integer generalInteger = book.getGeneralInteger();
            log("bookName=" + bookName + ", generalInteger=" + generalInteger);
            if (generalInteger != null) {
                existsGeneralInteger = true;
            }
        }
        assertTrue(existsGeneralInteger);
    }

    public void test_specify_deriveReferrerList_count_Integer_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.specify().derivedCollectionList().count(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnCollectionId();
            }
        }, "generalInteger");

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        getMyBhv().loadCollectionList(bookList, new LdConditionBeanSetupper<LdCollectionCB>() {
            public void setup(LdCollectionCB cb) {
            }
        });
        boolean existsGeneralInteger = false;
        for (LdBook book : bookList) {
            String bookName = book.getBookName();
            Integer generalInteger = book.getGeneralInteger();
            log("bookName=" + bookName + ", count=" + generalInteger);
            if (generalInteger != null) {
                existsGeneralInteger = true;
            }
            List<LdCollection> collectionList = book.getCollectionList();
            assertEquals(collectionList.size(), generalInteger.intValue());
        }
        assertTrue(existsGeneralInteger);
    }

    // ===================================================================================
    //                                                                         Combination
    //                                                                         ===========
    public void test_specify_deriveReferrerList_max_and_min_Timestamp_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnOpeningPart();
        cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnRTimestamp();
            }
        }, "generalTimestamp");
        cb.specify().derivedCollectionList().min(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnRTimestamp();
            }
        }, "generalTimestamp2");

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        boolean existsGeneralTimestamp = false;
        boolean existsGeneralTimestamp2 = false;
        for (LdBook book : bookList) {
            String bookName = book.getBookName();
            Timestamp generalTimestamp = book.getGeneralTimestamp();
            Timestamp generalTimestamp2 = book.getGeneralTimestamp2();
            log("bookName=" + bookName + ", max=" + generalTimestamp + ", min=" + generalTimestamp2);
            if (generalTimestamp != null) {
                existsGeneralTimestamp = true;
            }
            if (generalTimestamp2 != null) {
                existsGeneralTimestamp2 = true;
            }
        }
        assertTrue(existsGeneralTimestamp);
        assertTrue(existsGeneralTimestamp2);
    }

    public void test_specify_deriveReferrerList_max_and_sum_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnOpeningPart();
        cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnArrivalDate();
            }
        }, "generalTimestamp");
        cb.specify().derivedCollectionList().sum(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnCollectionId();
                subCB.query().queryCollectionStatusAsOne().setCollectionStatusCode_Equal_NOR();
            }
        }, "generalInteger");

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        boolean existsGeneralInteger = false;
        boolean existsGeneralTimestamp = false;
        for (LdBook book : bookList) {
            String bookName = book.getBookName();
            Integer generalInteger = book.getGeneralInteger();
            Timestamp generalTimestamp = book.getGeneralTimestamp();
            log("bookName=" + bookName + ", generalInteger=" + generalInteger + ", generalTimestamp="
                    + generalTimestamp);
            if (generalInteger != null) {
                existsGeneralInteger = true;
            }
            if (generalTimestamp != null) {
                existsGeneralTimestamp = true;
            }
        }
        assertTrue(existsGeneralInteger);
        assertTrue(existsGeneralTimestamp);
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    public void test_specify_deriveReferrerList_max_Timestamp_with_union_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.specify().columnArrivalDate();
            }
        }, "GENERAL_TIMESTAMP");
        cb.query().setGenreCode_IsNull();
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setGenreCode_IsNotNull();
            }
        });

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        boolean existsGeneralTimestamp = false;
        for (LdBook book : bookList) {
            String bookName = book.getBookName();
            Timestamp generalTimestamp = book.getGeneralTimestamp();
            log("bookName=" + bookName + ", generalTimestamp=" + generalTimestamp);
            if (generalTimestamp != null) {
                existsGeneralTimestamp = true;
            }
        }
        assertTrue(existsGeneralTimestamp);
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    public void test_specify_specifyForeign_deriveReferrerList_count_Integer_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.specify().specifyAuthor().derivedBookList().count(new LdSubQuery<LdBookCB>() {
            public void query(LdBookCB subCB) {
                subCB.specify().columnBookId();
            }
        }, "generalInteger");

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        boolean existsGeneralInteger = false;
        for (LdBook book : bookList) {
            assertNull(book.getAuthor());
            String bookName = book.getBookName();
            Integer generalInteger = book.getGeneralInteger();
            log("bookName=" + bookName + ", count=" + generalInteger);
            if (generalInteger != null) {
                existsGeneralInteger = true;
            }
        }
        assertTrue(existsGeneralInteger);
    }

    public void test_specify_specifyForeign_deriveReferrerList_AlreadySetupSelect_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.specify().specifyAuthor().columnAuthorName();
        cb.specify().specifyAuthor().derivedBookList().count(new LdSubQuery<LdBookCB>() {
            public void query(LdBookCB subCB) {
                subCB.specify().columnBookId();
            }
        }, "generalInteger");

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        boolean existsGeneralInteger = false;
        for (LdBook book : bookList) {
            assertNotNull(book.getAuthor());
            String bookName = book.getBookName();
            Integer generalInteger = book.getGeneralInteger();
            log("bookName=" + bookName + ", count=" + generalInteger);
            if (generalInteger != null) {
                existsGeneralInteger = true;
            }
        }
        assertTrue(existsGeneralInteger);
    }

    public void test_specify_specifyForeignForeign_deriveReferrerList_count_Integer_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.specify().specifyGenre().specifyGenreSelf().derivedGenreSelfList().max(new LdSubQuery<LdGenreCB>() {
            public void query(LdGenreCB subCB) {
                subCB.specify().columnHierarchyOrder();
            }
        }, "generalInteger");

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        boolean existsGeneralInteger = false;
        for (LdBook book : bookList) {
            assertNull(book.getAuthor());
            String bookName = book.getBookName();
            Integer generalInteger = book.getGeneralInteger();
            log("bookName=" + bookName + ", count=" + generalInteger);
            if (generalInteger != null) {
                existsGeneralInteger = true;
            }
        }
        assertTrue(existsGeneralInteger);
    }

    // ===================================================================================
    //                                                                      Irregular Case
    //                                                                      ==============
    public void test_specify_deriveReferrerList_InvalidAliasName_Tx() {
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnOpeningPart();

        // ## Act & Assert ##
        try {
            cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
                public void query(LdCollectionCB subCB) {
                }
            }, null);
        } catch (DerivedReferrerInvalidAliasNameException e) {
            // OK
            log(e.getMessage());
        }
        try {
            cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
                public void query(LdCollectionCB subCB) {
                }
            }, "");
        } catch (DerivedReferrerInvalidAliasNameException e) {
            // OK
            log(e.getMessage());
        }
        try {
            cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
                public void query(LdCollectionCB subCB) {
                }
            }, "  ");
        } catch (DerivedReferrerInvalidAliasNameException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_specify_deriveReferrerList_InvalidSpecifyColumn_Tx() {
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnOpeningPart();

        // ## Act & Assert ##
        try {
            cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
                public void query(LdCollectionCB subCB) {
                }
            }, "generalTimestamp");
            fail();
        } catch (SpecifyDerivedReferrerInvalidColumnSpecificationException e) {
            // OK
            log(e.getMessage());
        }
        try {
            cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
                public void query(LdCollectionCB subCB) {
                    subCB.specify().columnArrivalDate();
                    subCB.specify().columnRUser();
                }
            }, "generalTimestamp");
            fail();
        } catch (SpecifyDerivedReferrerInvalidColumnSpecificationException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_specify_deriveReferrerList_InvalidForeignSpecification_Tx() {
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnOpeningPart();

        // ## Act & Assert ##
        try {
            cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
                public void query(LdCollectionCB subCB) {
                    subCB.specify().specifyLibrary().columnRTimestamp();
                }
            }, "generalTimestamp");
            fail();
        } catch (DerivedReferrerInvalidForeignSpecificationException e) {
            // OK
            log(e.getMessage());
        }
        try {
            cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
                public void query(LdCollectionCB subCB) {
                    subCB.specify().specifyCollectionStatusAsOne().columnRTimestamp();
                }
            }, "generalTimestamp");
            fail();
        } catch (DerivedReferrerInvalidForeignSpecificationException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_specify_deriveReferrerList_UnmatchedColumnType_Tx() {
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnOpeningPart();

        // ## Act & Assert ##
        try {
            cb.specify().derivedCollectionList().sum(new LdSubQuery<LdCollectionCB>() {
                public void query(LdCollectionCB subCB) {
                    subCB.specify().columnRModule();// String
                }
            }, "generalString");
            fail();
        } catch (SpecifyDerivedReferrerUnmatchedColumnTypeException e) {
            // OK
            log(e.getMessage());
        }
        try {
            cb.specify().derivedCollectionList().sum(new LdSubQuery<LdCollectionCB>() {
                public void query(LdCollectionCB subCB) {
                    subCB.specify().columnRTimestamp();// Timestamp
                }
            }, "generalTimestamp");
            fail();
        } catch (SpecifyDerivedReferrerUnmatchedColumnTypeException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_specify_deriveReferrerList_EntityPropertyNotFound_Tx() {
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();

        // ## Act & Assert ##
        try {
            cb.specify().derivedCollectionList().max(new LdSubQuery<LdCollectionCB>() {
                public void query(LdCollectionCB subCB) {
                }
            }, "noexist");
        } catch (DerivedReferrerEntityPropertyNotFoundException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                         Test Helper
    //                                                                         ===========
    protected LdBookDbm getMyDBMeta() {
        return LdBookDbm.getInstance();
    }
}

package dbflute.ldb.cbean.subquery;

import java.util.Arrays;
import java.util.List;

import dbflute.ldb.allcommon.bhv.setup.LdConditionBeanSetupper;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdSubQuery;
import dbflute.ldb.allcommon.cbean.LdUnionQuery;
import dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.cbean.LdCollectionCB;
import dbflute.ldb.cbean.LdLendingCollectionCB;
import dbflute.ldb.exbhv.LdCollectionBhv;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.exentity.LdCollection;
import dbflute.ldb.exentity.LdLibrary;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookCBExistsSubQueryTest extends LdBookAllDbTestCase {

    public void test_existsSubQuery_NoExist_Tx() {
        final LdBookCB cb = new LdBookCB();
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().setLibraryId_Equal(new Integer(2));
                subCB.query().existsLendingCollectionList(new LdSubQuery<LdLendingCollectionCB>() {
                    public void query(LdLendingCollectionCB subCB) {
                        subCB.query().setUUser_Equal("noexist");
                    }
                });
            }
        });
        cb.query().setAuthorId_Equal(new Integer(3));
        final List<LdBook> ls = getMyBhv().selectList(cb); // Expect no SQLException!
        assertEquals(0, ls.size());
        for (LdBook book : ls) {
            _log.debug(" - " + book);
        }
    }

    public void test_exists_NoExist_Tx() {
        final LdBookCB cb = new LdBookCB();
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().setLibraryId_Equal(new Integer(2));
                subCB.query().existsLendingCollectionList(new LdSubQuery<LdLendingCollectionCB>() {
                    public void query(LdLendingCollectionCB subCB) {
                        subCB.query().setUUser_Equal("noexist");
                    }
                });
            }
        });
        cb.query().setAuthorId_Equal(new Integer(3));
        final List<LdBook> ls = getMyBhv().selectList(cb);// Expected No SQLException!
        assertEquals(0, ls.size());
        for (LdBook book : ls) {
            _log.debug(" - " + book);
        }
    }

    public void test_ExistsSubQuery_DoubleSuccess_Tx() {
        final LdBookCB cb = new LdBookCB();
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().setLibraryId_Equal(new Integer(2));
            }
        });
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().setLibraryId_Equal(new Integer(4));
            }
        });
        final List<LdBook> ls = getMyBhv().selectList(cb);// Expected No SQLException!
        assertNotSame(0, ls.size());
        for (LdBook book : ls) {
            _log.debug("book -- " + book);
            final Integer bookId = book.getBookId();
            final LdCollectionCB collectionCB = new LdCollectionCB();
            collectionCB.query().setBookId_Equal(bookId);
            collectionCB.query().setLibraryId_InScope(Arrays.asList(new Integer[] { 2, 4 }));
            final LdCollectionBhv collectionBhv = getBehaviorSelector().select(LdCollectionBhv.class);
            final LdListResultBean<LdCollection> collectionList = collectionBhv.selectList(collectionCB);
            assertEquals(2, collectionList.size());
        }
    }

    public void test_exists_DoubleSuccess_Tx() {
        final LdBookCB cb = new LdBookCB();
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subQueryCB) {
                subQueryCB.query().setLibraryId_Equal(new Integer(2));
            }
        });
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subQueryCB) {
                subQueryCB.query().setLibraryId_Equal(new Integer(4));
            }
        });
        final List<LdBook> ls = getMyBhv().selectList(cb);// Expected No SQLException!
        assertNotSame(0, ls.size());
        for (LdBook book : ls) {
            _log.debug("book -- " + book);
            final Integer bookId = book.getBookId();
            final LdCollectionCB collectionCB = new LdCollectionCB();
            collectionCB.query().setBookId_Equal(bookId);
            collectionCB.query().setLibraryId_InScope(Arrays.asList(new Integer[] { 2, 4 }));
            final LdCollectionBhv collectionBhv = getBehaviorSelector().select(LdCollectionBhv.class);
            final LdListResultBean<LdCollection> collectionList = collectionBhv.selectList(collectionCB);
            assertEquals(2, collectionList.size());
        }
    }

    public void test_existsSubQuery_SubQuery_is_NoCondition_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();

        // ## Act ##
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
            }
        });
        cb.query().setGenreCode_IsNotNull();
        final List<LdBook> ls = getMyBhv().selectList(cb); // Expect no SQLException!

        // ## Assert ##
        assertNotSame(0, ls.size());
        for (LdBook book : ls) {
            _log.debug(" - " + book);
        }
    }

    public void test_existsSubQuery_subCB_inline_ExpectException_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().queryLibrary().inline().setLibraryName_PrefixSearch("中目");
                subCB.query().queryLibrary().setLibraryName_LikeSearch("目", new LdLikeSearchOption().likeContain());
            }
        });

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        // 基本的に実行時エラーにならなければOK
        assertListNotEmtpy(bookList);
        final LdConditionBeanSetupper<LdCollectionCB> cbSetupper = new LdConditionBeanSetupper<LdCollectionCB>() {
            public void setup(LdCollectionCB cb) {
                cb.setupSelect_Library();
            }
        };
        getMyBhv().loadCollectionList(bookList, cbSetupper);
        for (LdBook book : bookList) {
            _log.debug(book);
            List<LdCollection> collectionList = book.getCollectionList();
            boolean existsNakameLibrary = false;
            for (LdCollection collection : collectionList) {
                final LdLibrary library = collection.getLibrary();
                _log.debug("    " + collection.getCollectionId() + " - " + library.getLibraryName());
                if (library.getLibraryName().startsWith("中目")) {
                    existsNakameLibrary = true;
                }
            }
            assertTrue(existsNakameLibrary);
        }
    }

    public void test_ExistsSubQuery_inline_ExpectException_Tx() {
        // ## Arrange ##
        final LdCollectionCB cb = new LdCollectionCB();

        // ## Act & Assert ##
        try {
            cb.query().inline().existsLendingCollectionList(new LdSubQuery<LdLendingCollectionCB>() {
                public void query(LdLendingCollectionCB subCB) {
                    subCB.query().setUUser_Equal("noexist");
                }
            });
            fail();
        } catch (UnsupportedOperationException e) {
            // OK
        }
    }

    public void test_selectList_ExistsSubQuery_Inline_Unsupport_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();

        // ## Act & Assert ##
        try {
            cb.query().queryAuthor().inline().existsBookList(new LdSubQuery<LdBookCB>() {
                public void query(LdBookCB subCB) {
                    subCB.query().setAuthorId_GreaterEqual(new Integer(3));
                }
            });
            fail();
        } catch (UnsupportedOperationException e) {
            // OK
        }
    }

    public void test_selectList_ExistsSubQuery_Union_ExecuteOK_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();

        // ## Act ##
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().setLibraryId_Equal(2);
                subCB.union(new LdUnionQuery<LdCollectionCB>() {
                    public void query(LdCollectionCB unionCB) {
                        unionCB.query().setLibraryId_Equal(1);
                    }
                });
            }
        });
        final List<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        getMyBhv().loadCollectionList(bookList, new LdConditionBeanSetupper<LdCollectionCB>() {
            public void setup(LdCollectionCB cb) {
            }
        });
        for (final LdBook book : bookList) {
            _log.debug(book.getBookId() + ": " + book.getBookName());
            final List<LdCollection> collectionList = book.getCollectionList();
            boolean existsTargetLibraryId = false;
            for (LdCollection collection : collectionList) {
                final Integer libraryId = collection.getLibraryId();
                _log.debug("    colId=" + collection.getCollectionId() + ": libId=" + collection.getLibraryId());
                if (libraryId.equals(2) || libraryId.equals(1)) {
                    existsTargetLibraryId = true;
                }
            }
            assertTrue("Unexpected: " + book, existsTargetLibraryId);
        }
    }

    public void test_selectList_ExistsSubQuery_Union_Union_ExecuteOK_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();

        // ## Act ##
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().setLibraryId_Equal(2);
                subCB.union(new LdUnionQuery<LdCollectionCB>() {
                    public void query(LdCollectionCB unionCB) {
                        unionCB.query().setLibraryId_Equal(3);
                    }
                });
                subCB.union(new LdUnionQuery<LdCollectionCB>() {
                    public void query(LdCollectionCB unionCB) {
                        unionCB.query().setLibraryId_Equal(4);
                    }
                });
            }
        });
        final List<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        getMyBhv().loadCollectionList(bookList, new LdConditionBeanSetupper<LdCollectionCB>() {
            public void setup(LdCollectionCB cb) {
            }
        });
        for (final LdBook book : bookList) {
            _log.debug(book.getBookId() + ": " + book.getBookName());
            final List<LdCollection> collectionList = book.getCollectionList();
            boolean existsTargetLibraryId = false;
            for (LdCollection collection : collectionList) {
                final Integer libraryId = collection.getLibraryId();
                _log.debug("    colId=" + collection.getCollectionId() + ": libId=" + collection.getLibraryId());
                if (libraryId.equals(2) || libraryId.equals(3) || libraryId.equals(4)) {
                    existsTargetLibraryId = true;
                }
            }
            assertTrue("Unexpected: " + book, existsTargetLibraryId);
        }
    }

    public void test_existsSubQuery_unionAll_union_ExecuteOK_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();

        // ## Act ##
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().setLibraryId_Equal(2);
                subCB.unionAll(new LdUnionQuery<LdCollectionCB>() {
                    public void query(LdCollectionCB unionCB) {
                        unionCB.query().setLibraryId_Equal(3);
                    }
                });
                subCB.union(new LdUnionQuery<LdCollectionCB>() {
                    public void query(LdCollectionCB unionCB) {
                        unionCB.query().setLibraryId_Equal(4);
                    }
                });
            }
        });
        final List<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        getMyBhv().loadCollectionList(bookList, new LdConditionBeanSetupper<LdCollectionCB>() {
            public void setup(LdCollectionCB cb) {
            }
        });
        for (final LdBook book : bookList) {
            _log.debug(book.getBookId() + ": " + book.getBookName());
            final List<LdCollection> collectionList = book.getCollectionList();
            boolean existsTargetLibraryId = false;
            for (LdCollection collection : collectionList) {
                final Integer libraryId = collection.getLibraryId();
                _log.debug("    colId=" + collection.getCollectionId() + ": libId=" + collection.getLibraryId());
                if (libraryId.equals(2) || libraryId.equals(3) || libraryId.equals(4)) {
                    existsTargetLibraryId = true;
                }
            }
            assertTrue("Unexpected: " + book, existsTargetLibraryId);
        }
    }
}

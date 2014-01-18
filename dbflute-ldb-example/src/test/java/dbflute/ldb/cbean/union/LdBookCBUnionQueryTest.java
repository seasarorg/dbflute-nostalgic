package dbflute.ldb.cbean.union;

import java.util.ArrayList;
import java.util.List;

import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdPagingResultBean;
import dbflute.ldb.allcommon.cbean.LdUnionQuery;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * The test of Book's condition-bean about union-query.
 * <pre>
 * Apache Derby が Union の場合にCLOB(BLOB sub type 1)がNGなため、
 * 結合してのUNIONのTestはCollection(蔵書)にて行う。
 * </pre>
 * @author jflute
 */
public class LdBookCBUnionQueryTest extends LdBookAllDbTestCase {

    // ==========================================================================================
    //                                                                                 selectList
    //                                                                                 ==========
    public void test_selectList_query_union_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();

        // Apache Derby が Union の場合にCLOB(BLOB sub type 1)がNGなので除外している。
        final LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnGenreCode();
        cb.query().setBookId_Equal(new Integer(1));
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(2));
            }
        });
        cb.query().addOrderBy_BookId_Desc();

        // ## Act ##
        final LdListResultBean<LdBook> ls = getMyBhv().selectList(cb);

        // ## Assert ##
        assertEquals(2, ls.size());
        final LdBook firstBook = ls.get(0);
        assertEquals(new Integer(2), firstBook.getBookId());
        final LdBook secondBook = ls.get(1);
        assertEquals(new Integer(1), secondBook.getBookId());
    }

    public void test_selectList_query_unionAll_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();

        // Apache Derby が Union の場合にCLOB(BLOB sub type 1)がNGなので除外している。
        final LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnGenreCode();
        cb.query().setBookId_Equal(new Integer(1));
        cb.unionAll(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(2));
            }
        });
        cb.query().addOrderBy_BookId_Desc();

        // ## Act ##
        final LdListResultBean<LdBook> ls = getMyBhv().selectList(cb);

        // ## Assert ##
        assertEquals(2, ls.size());
        final LdBook firstBook = ls.get(0);
        assertEquals(new Integer(2), firstBook.getBookId());
        final LdBook secondBook = ls.get(1);
        assertEquals(new Integer(1), secondBook.getBookId());
    }

    public void test_selectList_union_Tx() {
        doTest_selectList(true);
    }

    public void test_selectList_unionAll_Tx() {
        doTest_selectList(false);
    }

    protected void doTest_selectList(boolean unionOnly) {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();

        // Apache Derby が Union の場合にCLOB(BLOB sub type 1)がNGなので除外している。
        final LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnGenreCode();
        cb.query().setBookId_Equal(new Integer(1));
        if (unionOnly) {
            cb.union(new LdUnionQuery<LdBookCB>() {
                public void query(LdBookCB unionCB) {
                    unionCB.query().setBookId_Equal(new Integer(2));
                }
            });
        } else {
            cb.unionAll(new LdUnionQuery<LdBookCB>() {
                public void query(LdBookCB unionCB) {
                    unionCB.query().setBookId_Equal(new Integer(2));
                }
            });
        }
        cb.query().addOrderBy_BookId_Desc();

        // ## Act ##
        final LdListResultBean<LdBook> ls = getMyBhv().selectList(cb);

        // ## Assert ##
        assertEquals(2, ls.size());
        final LdBook firstBook = ls.get(0);
        assertEquals(new Integer(2), firstBook.getBookId());
        final LdBook secondBook = ls.get(1);
        assertEquals(new Integer(1), secondBook.getBookId());
    }

    public void test_selectList_union_with_InScope_Tx() {
        doTest_selectList_union_with_InScope_Tx(true);
    }

    public void doTest_selectList_union_with_InScope_Tx(boolean unionOnly) {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();

        // Apache Derby が Union の場合にCLOB(BLOB sub type 1)がNGなので除外している。
        final LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnGenreCode();
        cb.query().setBookId_Equal(new Integer(1));
        if (unionOnly) {
            cb.union(new LdUnionQuery<LdBookCB>() {
                public void query(LdBookCB unionCB) {
                    final List<Integer> bookIdList = new ArrayList<Integer>();
                    bookIdList.add(2);
                    bookIdList.add(5);
                    unionCB.query().setBookId_InScope(bookIdList);
                }
            });
        } else {
            cb.unionAll(new LdUnionQuery<LdBookCB>() {
                public void query(LdBookCB unionCB) {
                    final List<Integer> bookIdList = new ArrayList<Integer>();
                    bookIdList.add(2);
                    bookIdList.add(5);
                    unionCB.query().setBookId_InScope(bookIdList);
                }
            });
        }
        cb.query().addOrderBy_BookId_Desc();

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertEquals(3, bookList.size());
    }

    public void test_selectList_union_with_InvalidOrderBy_Tx() {
        doTest_selectList_union_with_InvalidOrderBy_Tx(true);
    }

    public void doTest_selectList_union_with_InvalidOrderBy_Tx(boolean unionOnly) {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();

        // Apache Derby が Union の場合にCLOB(BLOB sub type 1)がNGなので除外している。
        final LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnGenreCode();
        cb.query().setBookId_Equal(new Integer(1));
        if (unionOnly) {
            cb.union(new LdUnionQuery<LdBookCB>() {
                public void query(LdBookCB unionCB) {
                    final List<Integer> bookIdList = new ArrayList<Integer>();
                    bookIdList.add(2);
                    bookIdList.add(5);
                    unionCB.query().setBookId_InScope(bookIdList);
                }
            });
        } else {
            cb.unionAll(new LdUnionQuery<LdBookCB>() {
                public void query(LdBookCB unionCB) {
                    final List<Integer> bookIdList = new ArrayList<Integer>();
                    bookIdList.add(2);
                    bookIdList.add(5);
                    unionCB.query().setBookId_InScope(bookIdList);
                }
            });
        }
        cb.query().queryAuthor().addOrderBy_AuthorAge_Asc();// InvalidOrderBy

        // ## Act & Assert ##
        try {
            getMyBhv().selectList(cb);
            fail();
        } catch (IllegalStateException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ==========================================================================================
    //                                                                                selectCount
    //                                                                                ===========
    public void test_selectCount_union_Tx() {
        doTest_selectCount_union_Tx(true);
    }

    public void test_selectCount_unionAll_Tx() {
        doTest_selectCount_union_Tx(false);
    }

    public void doTest_selectCount_union_Tx(boolean unionOnly) {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();

        // Apache Derby が Union の場合にCLOB(BLOB sub type 1)がNGなので除外している。
        final LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnGenreCode();
        cb.query().setBookId_Equal(new Integer(1));
        if (unionOnly) {
            cb.union(new LdUnionQuery<LdBookCB>() {
                public void query(LdBookCB unionCB) {
                    unionCB.query().setBookId_Equal(new Integer(2));
                }
            });
        } else {
            cb.unionAll(new LdUnionQuery<LdBookCB>() {
                public void query(LdBookCB unionCB) {
                    unionCB.query().setBookId_Equal(new Integer(2));
                }
            });
        }
        cb.query().addOrderBy_BookId_Desc();

        // ## Act ##
        final int count = getMyBhv().selectCount(cb);

        // ## Assert ##
        assertEquals(2, count);
    }

    // ==========================================================================================
    //                                                                                 selectPage
    //                                                                                 ==========
    public void test_selectPage_union_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();

        // Apache Derby が Union の場合にCLOB(BLOB sub type 1)がNGなので除外している。
        final LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnGenreCode();
        cb.query().setBookId_Equal(new Integer(1));
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(2));
            }
        });
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(3));
            }
        });
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(2)); // Duplicated
            }
        });
        cb.query().addOrderBy_BookId_Desc();
        cb.fetchFirst(2);
        cb.fetchPage(1);

        {
            // ## Act ##
            final LdPagingResultBean<LdBook> rb = getMyBhv().selectPage(cb);

            // ## Assert ##
            assertEquals(1, rb.getCurrentPageNumber());
            assertEquals(3, rb.getAllRecordCount());
            assertEquals(2, rb.getAllPageCount());
            assertEquals(2, rb.getSelectedList().size());
        }

        cb.fetchPage(2);
        {
            // ## Act ##
            final LdPagingResultBean<LdBook> rb = getMyBhv().selectPage(cb);

            // ## Assert ##
            assertEquals(2, rb.getCurrentPageNumber());
            assertEquals(3, rb.getAllRecordCount());
            assertEquals(2, rb.getAllPageCount());
            assertEquals(1, rb.getSelectedList().size());
        }
    }

    public void test_selectPage_unionAll_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();

        // Apache Derby が Union の場合にCLOB(BLOB sub type 1)がNGなので除外している。
        final LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnGenreCode();
        cb.query().setBookId_Equal(new Integer(1));
        cb.unionAll(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(2));
            }
        });
        cb.unionAll(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(3));
            }
        });
        cb.unionAll(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(2)); // Duplicated
            }
        });
        cb.query().addOrderBy_BookId_Desc();
        cb.fetchFirst(2);
        cb.fetchPage(1);

        {
            // ## Act ##
            final LdPagingResultBean<LdBook> rb = getMyBhv().selectPage(cb);

            // ## Assert ##
            assertEquals(1, rb.getCurrentPageNumber());
            assertEquals(4, rb.getAllRecordCount());
            assertEquals(2, rb.getAllPageCount());
            assertEquals(2, rb.getSelectedList().size());
        }

        cb.fetchPage(2);
        {
            // ## Act ##
            final LdPagingResultBean<LdBook> rb = getMyBhv().selectPage(cb);

            // ## Assert ##
            assertEquals(2, rb.getCurrentPageNumber());
            assertEquals(4, rb.getAllRecordCount());
            assertEquals(2, rb.getAllPageCount());
            assertEquals(2, rb.getSelectedList().size());
        }
    }

    public void test_selectPage_union_and_unionAll_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();

        // Apache Derby が Union の場合にCLOB(BLOB sub type 1)がNGなので除外している。
        final LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnGenreCode();
        cb.query().setBookId_Equal(new Integer(1));
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(2));
            }
        });
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(3));
            }
        });
        cb.unionAll(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(2)); // Duplicated
            }
        });
        cb.query().addOrderBy_BookId_Desc();
        cb.fetchFirst(2);
        cb.fetchPage(1);

        {
            // ## Act ##
            final LdPagingResultBean<LdBook> rb = getMyBhv().selectPage(cb);

            // ## Assert ##
            assertEquals(1, rb.getCurrentPageNumber());
            assertEquals(4, rb.getAllRecordCount());
            assertEquals(2, rb.getAllPageCount());
            assertEquals(2, rb.getSelectedList().size());
        }

        cb.fetchPage(2);
        {
            // ## Act ##
            final LdPagingResultBean<LdBook> rb = getMyBhv().selectPage(cb);

            // ## Assert ##
            assertEquals(2, rb.getCurrentPageNumber());
            assertEquals(4, rb.getAllRecordCount());
            assertEquals(2, rb.getAllPageCount());
            assertEquals(2, rb.getSelectedList().size());
        }
    }

    // ==========================================================================================
    //                                                               hasUnionQueryOrUnionAllQuery
    //                                                               ============================
    public void test_hasUnionQueryOrUnionAllQuery_union_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        assertFalse(cb.query().hasUnionQueryOrUnionAllQuery());
        cb.query().setBookId_Equal(new Integer(1));
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(2));
            }
        });
        assertTrue(cb.query().hasUnionQueryOrUnionAllQuery());
    }

    public void test_hasUnionQueryOrUnionAllQuery_unionAll_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        assertFalse(cb.query().hasUnionQueryOrUnionAllQuery());
        cb.query().setBookId_Equal(new Integer(1));
        cb.unionAll(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(2));
            }
        });
        assertTrue(cb.query().hasUnionQueryOrUnionAllQuery());
    }

    // ==========================================================================================
    //                                                                          getUnionQueryList
    //                                                                          =================
    public void test_getUnionQueryList_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        assertFalse(cb.query().getUnionQueryList().size() == 1);
        assertFalse(cb.query().getUnionAllQueryList().size() == 1);
        cb.query().setBookId_Equal(new Integer(1));
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(2));
            }
        });
        assertTrue(cb.query().getUnionQueryList().size() == 1);
        assertFalse(cb.query().getUnionAllQueryList().size() == 1);
    }

    public void test_getUnionAllQueryList_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        assertFalse(cb.query().getUnionQueryList().size() == 1);
        assertFalse(cb.query().getUnionAllQueryList().size() == 1);
        cb.query().setBookId_Equal(new Integer(1));
        cb.unionAll(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(new Integer(2));
            }
        });
        assertFalse(cb.query().getUnionQueryList().size() == 1);
        assertTrue(cb.query().getUnionAllQueryList().size() == 1);
    }

    public void test_setupSelect_after_union_ExceptionMessage_Tx() {
        LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
                unionCB.query().setBookId_Equal(3);
            }
        });
        try {
            cb.setupSelect_Genre();
        } catch (IllegalStateException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }

    // ==========================================================================================
    //                                                                              Assist Helper
    //                                                                              =============
    protected static interface UnionCallback {
        public void union(LdBookCB cb, LdBookCB unionCB);
    }

}

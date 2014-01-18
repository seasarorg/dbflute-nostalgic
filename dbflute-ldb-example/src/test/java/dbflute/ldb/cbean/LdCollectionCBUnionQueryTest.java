package dbflute.ldb.cbean;

import dbflute.ldb.allcommon.cbean.LdPagingResultBean;
import dbflute.ldb.allcommon.cbean.LdUnionQuery;
import dbflute.ldb.exentity.LdCollection;
import dbflute.ldb.testbase.LdCollectionAllDbTestCase;

/**
 * The test of Collection's condition-bean about union-query.
 * <pre>
 * Union のMainのTestはBook(本)にて行う。ここでは主に結合してのUnionのTestを行う。
 * </pre>
 * @author jflute
 */
public class LdCollectionCBUnionQueryTest extends LdCollectionAllDbTestCase {

    // ==========================================================================================
    //                                                                                selectCount
    //                                                                                ===========
    public void test_selectCount_union_Tx() {
        doTest_selectCount_union_Tx();
    }

    public void doTest_selectCount_union_Tx() {
        // ## Arrange ##
        final LdCollectionCB cb = new LdCollectionCB();
        cb.setupSelect_Library();
        cb.query().setCollectionId_Equal(new Integer(1));
        cb.union(new LdUnionQuery<LdCollectionCB>() {
            public void query(LdCollectionCB unionCB) {
                unionCB.query().setCollectionId_Equal(new Integer(2));
            }
        });
        cb.query().addOrderBy_CollectionId_Desc();

        // ## Act ##
        final int count = getMyBhv().selectCount(cb);

        // ## Assert ##
        assertEquals(2, count);
    }

    protected static interface UnionCallback {
        public void union(LdCollectionCB cb, LdCollectionCB unionCB);
    }

    // ==========================================================================================
    //                                                                                 selectPage
    //                                                                                 ==========
    public void test_selectPage_union_Tx() {
        // ## Arrange ##
        final LdCollectionCB cb = new LdCollectionCB();
        cb.setupSelect_CollectionStatusAsOne().withCollectionStatusLookup();
        cb.setupSelect_Library();
        cb.query().setCollectionId_Equal(new Integer(1));
        cb.union(new LdUnionQuery<LdCollectionCB>() {
            public void query(LdCollectionCB unionCB) {
                unionCB.query().setCollectionId_Equal(new Integer(2));
            }
        });
        cb.union(new LdUnionQuery<LdCollectionCB>() {
            public void query(LdCollectionCB unionCB) {
                unionCB.query().setCollectionId_Equal(new Integer(3));
            }
        });
        cb.union(new LdUnionQuery<LdCollectionCB>() {
            public void query(LdCollectionCB unionCB) {
                unionCB.query().setCollectionId_Equal(new Integer(2));
            }
        });
        cb.query().addOrderBy_CollectionId_Desc();
        cb.fetchFirst(2);
        cb.fetchPage(1);

        {
            // ## Act ##
            final LdPagingResultBean<LdCollection> rb = getMyBhv().selectPage(cb);

            // ## Assert ##
            assertEquals(1, rb.getCurrentPageNumber());
            assertEquals(3, rb.getAllRecordCount());
            assertEquals(2, rb.getAllPageCount());
            assertEquals(2, rb.getSelectedList().size());

            for (LdCollection collection : rb) {
                assertNull(collection.getBook());
                assertNotNull(collection.getLibrary());
                assertNotNull(collection.getCollectionStatusAsOne());
                assertNotNull(collection.getCollectionStatusAsOne().getCollectionStatusLookup());
            }
        }

        cb.fetchPage(2);
        {
            // ## Act ##
            final LdPagingResultBean<LdCollection> rb = getMyBhv().selectPage(cb);

            // ## Assert ##
            assertEquals(2, rb.getCurrentPageNumber());
            assertEquals(3, rb.getAllRecordCount());
            assertEquals(2, rb.getAllPageCount());
            assertEquals(1, rb.getSelectedList().size());

            for (LdCollection collection : rb) {
                assertNull(collection.getBook());
                assertNotNull(collection.getLibrary());
                assertNotNull(collection.getCollectionStatusAsOne());
                assertNotNull(collection.getCollectionStatusAsOne().getCollectionStatusLookup());
            }
        }
    }

    public void test_selectPage_unionAll_Tx() {
        // ## Arrange ##
        // Apache Derby が Union の場合にCLOB(BLOB sub type 1)がNGなので除外している。
        final LdCollectionCB cb = new LdCollectionCB();
        cb.setupSelect_CollectionStatusAsOne().withCollectionStatusLookup();
        cb.setupSelect_Book().withAuthor();// Unionなので大丈夫なはず
        cb.setupSelect_Book().withPublisher();// Unionなので大丈夫なはず
        cb.setupSelect_Library();
        cb.query().setCollectionId_Equal(new Integer(1));
        cb.unionAll(new LdUnionQuery<LdCollectionCB>() {
            public void query(LdCollectionCB unionCB) {
                unionCB.query().setCollectionId_Equal(new Integer(2));
            }
        });
        cb.unionAll(new LdUnionQuery<LdCollectionCB>() {
            public void query(LdCollectionCB unionCB) {
                unionCB.query().setCollectionId_Equal(new Integer(3));
            }
        });
        cb.unionAll(new LdUnionQuery<LdCollectionCB>() {
            public void query(LdCollectionCB unionCB) {
                unionCB.query().setCollectionId_Equal(new Integer(2));
            }
        });
        cb.query().addOrderBy_CollectionId_Desc();
        cb.fetchFirst(2);
        cb.fetchPage(1);

        {
            // ## Act ##
            final LdPagingResultBean<LdCollection> rb = getMyBhv().selectPage(cb);

            // ## Assert ##
            assertEquals(1, rb.getCurrentPageNumber());
            assertEquals(4, rb.getAllRecordCount());
            assertEquals(2, rb.getAllPageCount());
            assertEquals(2, rb.getSelectedList().size());

            for (LdCollection collection : rb) {
                assertNotNull(collection.getBook());
                assertNotNull(collection.getBook().getAuthor());
                assertNotNull(collection.getBook().getPublisher());
                assertNull(collection.getBook().getGenre());
                assertNotNull(collection.getLibrary());
                assertNotNull(collection.getCollectionStatusAsOne());
                assertNotNull(collection.getCollectionStatusAsOne().getCollectionStatusLookup());
            }
        }

        cb.fetchPage(2);
        {
            // ## Act ##
            final LdPagingResultBean<LdCollection> rb = getMyBhv().selectPage(cb);

            // ## Assert ##
            assertEquals(2, rb.getCurrentPageNumber());
            assertEquals(4, rb.getAllRecordCount());
            assertEquals(2, rb.getAllPageCount());
            assertEquals(2, rb.getSelectedList().size());

            for (LdCollection collection : rb) {
                assertNotNull(collection.getBook());
                assertNotNull(collection.getBook().getAuthor());
                assertNotNull(collection.getBook().getPublisher());
                assertNull(collection.getBook().getGenre());
                assertNotNull(collection.getLibrary());
                assertNotNull(collection.getCollectionStatusAsOne());
                assertNotNull(collection.getCollectionStatusAsOne().getCollectionStatusLookup());
            }
        }
    }

    public void test_selectPage_union_and_unionAll_Tx() {
        // ## Arrange ##
        // Apache Derby が Union の場合にCLOB(BLOB sub type 1)がNGなので除外している。
        final LdCollectionCB cb = new LdCollectionCB();
        cb.query().setCollectionId_Equal(new Integer(1));
        cb.union(new LdUnionQuery<LdCollectionCB>() {
            public void query(LdCollectionCB unionCB) {
                unionCB.query().setCollectionId_Equal(new Integer(2));
            }
        });
        cb.union(new LdUnionQuery<LdCollectionCB>() {
            public void query(LdCollectionCB unionCB) {
                unionCB.query().setCollectionId_Equal(new Integer(3));
            }
        });
        cb.unionAll(new LdUnionQuery<LdCollectionCB>() {
            public void query(LdCollectionCB unionCB) {
                unionCB.query().setCollectionId_Equal(new Integer(2));
            }
        });
        cb.query().addOrderBy_CollectionId_Desc();
        cb.fetchFirst(2);
        cb.fetchPage(1);

        {
            // ## Act ##
            final LdPagingResultBean<LdCollection> rb = getMyBhv().selectPage(cb);

            // ## Assert ##
            assertEquals(1, rb.getCurrentPageNumber());
            assertEquals(4, rb.getAllRecordCount());
            assertEquals(2, rb.getAllPageCount());
            assertEquals(2, rb.getSelectedList().size());
        }

        cb.fetchPage(2);
        {
            // ## Act ##
            final LdPagingResultBean<LdCollection> rb = getMyBhv().selectPage(cb);

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
        final LdCollectionCB cb = new LdCollectionCB();
        assertFalse(cb.query().hasUnionQueryOrUnionAllQuery());
        cb.query().setCollectionId_Equal(new Integer(1));
        cb.union(new LdUnionQuery<LdCollectionCB>() {
            public void query(LdCollectionCB unionCB) {
                unionCB.query().setCollectionId_Equal(new Integer(2));
            }
        });
        assertTrue(cb.query().hasUnionQueryOrUnionAllQuery());
    }

    public void test_hasUnionQueryOrUnionAllQuery_unionAll_Tx() {
        // ## Arrange ##
        final LdCollectionCB cb = new LdCollectionCB();
        assertFalse(cb.query().hasUnionQueryOrUnionAllQuery());
        cb.query().setCollectionId_Equal(new Integer(1));
        cb.unionAll(new LdUnionQuery<LdCollectionCB>() {
            public void query(LdCollectionCB unionCB) {
                unionCB.query().setCollectionId_Equal(new Integer(2));
            }
        });
        assertTrue(cb.query().hasUnionQueryOrUnionAllQuery());
    }

    // ==========================================================================================
    //                                                                          getUnionQueryList
    //                                                                          =================
    public void test_getUnionQueryList_Tx() {
        // ## Arrange ##
        final LdCollectionCB cb = new LdCollectionCB();
        assertFalse(cb.query().getUnionQueryList().size() == 1);
        assertFalse(cb.query().getUnionAllQueryList().size() == 1);
        cb.query().setCollectionId_Equal(new Integer(1));
        cb.union(new LdUnionQuery<LdCollectionCB>() {
            public void query(LdCollectionCB unionCB) {
                unionCB.query().setCollectionId_Equal(new Integer(2));
            }
        });
        assertTrue(cb.query().getUnionQueryList().size() == 1);
        assertFalse(cb.query().getUnionAllQueryList().size() == 1);
    }

    public void test_getUnionAllQueryList_Tx() {
        // ## Arrange ##
        final LdCollectionCB cb = new LdCollectionCB();
        assertFalse(cb.query().getUnionQueryList().size() == 1);
        assertFalse(cb.query().getUnionAllQueryList().size() == 1);
        cb.query().setCollectionId_Equal(new Integer(1));
        cb.unionAll(new LdUnionQuery<LdCollectionCB>() {
            public void query(LdCollectionCB unionCB) {
                unionCB.query().setCollectionId_Equal(new Integer(2));
            }
        });
        assertFalse(cb.query().getUnionQueryList().size() == 1);
        assertTrue(cb.query().getUnionAllQueryList().size() == 1);
    }
}

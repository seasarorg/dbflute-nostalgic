package dbflute.ldb.cbean;

import dbflute.ldb.allcommon.cbean.LdSubQuery;
import dbflute.ldb.allcommon.cbean.LdUnionQuery;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookCBFormatTest extends LdBookAllDbTestCase {

    public void test_selectList_SubQueryFormat_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();
        final int expectedDateCount = 10;

        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().queryLibrary().setLibraryId_GreaterEqual(3);
                subCB.query().queryLibrary().queryLibraryTypeLookup().setLibraryTypeCode_Equal("aaa");
                subCB.query().existsLendingCollectionList(new LdSubQuery<LdLendingCollectionCB>() {
                    public void query(LdLendingCollectionCB subCB) {
                        subCB.query().inScopeCollection(new LdSubQuery<LdCollectionCB>() {
                            public void query(LdCollectionCB subCB) {
                            }
                        });
                    }
                });
            }
        });
        cb.query().inScopeAuthor(new LdSubQuery<LdAuthorCB>() {
            public void query(LdAuthorCB subCB) {
                subCB.query().inScopeBookList(new LdSubQuery<LdBookCB>() {
                    public void query(LdBookCB subCB) {
                        subCB.query().setMaxLendingDateCount_LessThan(new Integer(expectedDateCount));
                    }
                });
            }
        });
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().queryLibrary().setLibraryId_GreaterEqual(3);
                subCB.query().queryLibrary().queryLibraryTypeLookup().setLibraryTypeCode_Equal("bbb");
                subCB.query().existsLendingCollectionList(new LdSubQuery<LdLendingCollectionCB>() {
                    public void query(LdLendingCollectionCB subCB) {
                        subCB.query().inScopeCollection(new LdSubQuery<LdCollectionCB>() {
                            public void query(LdCollectionCB subCB) {
                            }
                        });
                    }
                });
                subCB.union(new LdUnionQuery<LdCollectionCB>() {
                    public void query(LdCollectionCB unionCB) {
                        unionCB.query().existsLendingCollectionList(new LdSubQuery<LdLendingCollectionCB>() {
                            public void query(LdLendingCollectionCB subCB) {
                            }
                        });
                    }
                });
            }
        });

        // ## Act & Assert ##
        getMyBhv().selectList(cb);
    }

    public void test_selectCount_SubQueryFormat_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();
        final int expectedDateCount = 10;

        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().queryLibrary().setLibraryId_GreaterEqual(3);
                subCB.query().queryLibrary().queryLibraryTypeLookup().setLibraryTypeCode_Equal("aaa");
                subCB.query().existsLendingCollectionList(new LdSubQuery<LdLendingCollectionCB>() {
                    public void query(LdLendingCollectionCB subCB) {
                        subCB.query().inScopeCollection(new LdSubQuery<LdCollectionCB>() {
                            public void query(LdCollectionCB subCB) {
                            }
                        });
                    }
                });
            }
        });
        cb.query().inScopeAuthor(new LdSubQuery<LdAuthorCB>() {
            public void query(LdAuthorCB subCB) {
                subCB.query().inScopeBookList(new LdSubQuery<LdBookCB>() {
                    public void query(LdBookCB subCB) {
                        subCB.query().setMaxLendingDateCount_LessThan(new Integer(expectedDateCount));
                    }
                });
            }
        });
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().queryLibrary().setLibraryId_GreaterEqual(3);
                subCB.query().queryLibrary().queryLibraryTypeLookup().setLibraryTypeCode_Equal("bbb");
                subCB.query().existsLendingCollectionList(new LdSubQuery<LdLendingCollectionCB>() {
                    public void query(LdLendingCollectionCB subCB) {
                        subCB.query().inScopeCollection(new LdSubQuery<LdCollectionCB>() {
                            public void query(LdCollectionCB subCB) {
                            }
                        });
                    }
                });
                subCB.union(new LdUnionQuery<LdCollectionCB>() {
                    public void query(LdCollectionCB unionCB) {
                        unionCB.query().existsLendingCollectionList(new LdSubQuery<LdLendingCollectionCB>() {
                            public void query(LdLendingCollectionCB subCB) {
                            }
                        });
                    }
                });
            }
        });

        // ## Act & Assert ##
        getMyBhv().selectCount(cb);
    }

    public void test_queryDelete_SubQueryFormat_Tx() throws Exception {
        final LdBookCB cb = new LdBookCB();
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().existsLendingCollectionList(new LdSubQuery<LdLendingCollectionCB>() {
                    public void query(LdLendingCollectionCB subCB) {
                    }
                });
            }
        });
        getMyBhv().queryDelete(cb);
    }
}

package dbflute.ldb.cbean;

import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdSubQuery;
import dbflute.ldb.exentity.LdGenre;
import dbflute.ldb.testbase.LdGenreAllDbTestCase;

/**
 * @author jflute
 * @since 1.0 (2007/06/06)
 */
public class LdGenreCBTest extends LdGenreAllDbTestCase {

    // ==========================================================================================
    //                                                                            inScopeSubQuery
    //                                                                            ===============
    public void test_inScopeSubQuery_SelfReference_Foreign_Referrer_Tx() {
        final LdGenreCB cb = new LdGenreCB();
        cb.query().inScopeGenreSelf(new LdSubQuery<LdGenreCB>() {
            public void query(LdGenreCB subCB) {
                subCB.query().inScopeGenreSelfList(new LdSubQuery<LdGenreCB>() {
                    public void query(LdGenreCB subCB) {
                        subCB.query().setParentGenreCode_IsNotNull();
                    }
                });
            }
        });
        cb.query().addOrderBy_GenreCode_Asc();

        // ## Act ##
        final LdListResultBean<LdGenre> ls = getMyBhv().selectList(cb);

        // ## Assert ##
        final LdGenreCB cb4expected = new LdGenreCB();
        cb4expected.query().setParentGenreCode_IsNotNull();
        cb4expected.query().addOrderBy_GenreCode_Asc();
        final LdListResultBean<LdGenre> expectedList = getMyBhv().selectList(cb);
        for (LdGenre genre : ls) {
            _log.debug(genre);
        }
        assertNotSame(0, ls.size());
        assertEquals(expectedList.size(), ls.size());
        int index = 0;
        for (LdGenre genre : ls) {
            assertEquals(expectedList.get(index), genre);
            ++index;
        }
    }

    public void test_inScopeSubQuery_SelfReference_Foreign_Foreign_Tx() {
        final LdGenreCB cb = new LdGenreCB();
        cb.query().inScopeGenreSelf(new LdSubQuery<LdGenreCB>() {
            public void query(LdGenreCB subCB) {
                subCB.query().inScopeGenreSelf(new LdSubQuery<LdGenreCB>() {
                    public void query(LdGenreCB subCB) {
                        subCB.query().setParentGenreCode_IsNotNull();
                    }
                });
            }
        });
        cb.query().addOrderBy_GenreCode_Asc();

        // ## Act ##
        getMyBhv().selectList(cb);
    }

    public void test_inScopeSubQuery_SelfReference_Referrer_Referrer_Tx() {
        final LdGenreCB cb = new LdGenreCB();
        cb.query().inScopeGenreSelfList(new LdSubQuery<LdGenreCB>() {
            public void query(LdGenreCB subCB) {
                subCB.query().inScopeGenreSelfList(new LdSubQuery<LdGenreCB>() {
                    public void query(LdGenreCB subCB) {
                        subCB.query().setParentGenreCode_IsNotNull();
                    }
                });
            }
        });
        cb.query().addOrderBy_GenreCode_Asc();

        // ## Act ##
        getMyBhv().selectList(cb);
    }

    // ==========================================================================================
    //                                                                            Exists SubQuery
    //                                                                            ===============
    public void test_existsSubQuery_SelfReference_Referrer_Referrer_Tx() {
        final LdGenreCB cb = new LdGenreCB();
        cb.query().existsGenreSelfList(new LdSubQuery<LdGenreCB>() {
            public void query(LdGenreCB subCB) {
                subCB.query().existsGenreSelfList(new LdSubQuery<LdGenreCB>() {
                    public void query(LdGenreCB subCB) {
                        subCB.query().setParentGenreCode_IsNotNull();
                    }
                });
            }
        });
        cb.query().addOrderBy_GenreCode_Asc();

        // ## Act & Assert ##
        getMyBhv().selectList(cb); // Expect no exception!
    }

    public void test_existsSubQuery_parallel_SelfReference_Referrer_Referrer_Tx() {
        final LdGenreCB cb = new LdGenreCB();
        cb.query().existsGenreSelfList(new LdSubQuery<LdGenreCB>() {
            public void query(LdGenreCB subCB) {
                subCB.query().existsGenreSelfList(new LdSubQuery<LdGenreCB>() {
                    public void query(LdGenreCB subCB) {
                        subCB.query().setParentGenreCode_IsNotNull();
                        subCB.query().existsGenreSelfList(new LdSubQuery<LdGenreCB>() {
                            public void query(LdGenreCB subCB) {
                                subCB.query().setParentGenreCode_Equal("ABC");
                            }
                        });
                    }
                });
                subCB.query().existsGenreSelfList(new LdSubQuery<LdGenreCB>() {
                    public void query(LdGenreCB subCB) {
                        subCB.query().setParentGenreCode_Equal("DEF");
                    }
                });
            }
        });
        cb.query().existsGenreSelfList(new LdSubQuery<LdGenreCB>() {
            public void query(LdGenreCB subCB) {
                subCB.query().existsGenreSelfList(new LdSubQuery<LdGenreCB>() {
                    public void query(LdGenreCB subCB) {
                        subCB.query().setParentGenreCode_IsNotNull();
                    }
                });
            }
        });
        cb.query().addOrderBy_GenreCode_Asc();

        // ## Act & Assert ##
        getMyBhv().selectList(cb); // Expect no exception!
    }

    // ==========================================================================================
    //                                                                              Both SubQuery
    //                                                                              =============
    public void test_inScopeSubQuery_existsSubQuery_SelfReference_Foreign_Referrer_Tx() {
        final LdGenreCB cb = new LdGenreCB();
        cb.query().inScopeGenreSelf(new LdSubQuery<LdGenreCB>() {
            public void query(LdGenreCB subCB) {
                subCB.query().existsGenreSelfList(new LdSubQuery<LdGenreCB>() {
                    public void query(LdGenreCB subCB) {
                        subCB.query().setParentGenreCode_IsNotNull();
                    }
                });
            }
        });
        cb.query().addOrderBy_GenreCode_Asc();

        // ## Act ##
        final LdListResultBean<LdGenre> ls = getMyBhv().selectList(cb);

        // ## Assert ##
        final LdGenreCB cb4expected = new LdGenreCB();
        cb4expected.query().setParentGenreCode_IsNotNull();
        cb4expected.query().addOrderBy_GenreCode_Asc();
        final LdListResultBean<LdGenre> expectedList = getMyBhv().selectList(cb);
        for (LdGenre genre : ls) {
            _log.debug(genre);
        }
        assertNotSame(0, ls.size());
        assertEquals(expectedList.size(), ls.size());
        int index = 0;
        for (LdGenre genre : ls) {
            assertEquals(expectedList.get(index), genre);
            ++index;
        }
    }

    public void test_inScopeSubQuery_existsSubQuery_SelfReference_Referrer_Referrer_Tx() {
        final LdGenreCB cb = new LdGenreCB();
        cb.query().inScopeGenreSelfList(new LdSubQuery<LdGenreCB>() {
            public void query(LdGenreCB subCB) {
                subCB.query().existsGenreSelfList(new LdSubQuery<LdGenreCB>() {
                    public void query(LdGenreCB subCB) {
                        subCB.query().setParentGenreCode_IsNotNull();
                    }
                });
            }
        });
        cb.query().addOrderBy_GenreCode_Asc();

        // ## Act ##
        getMyBhv().selectList(cb);
    }

    public void test_existsSubQuery_inScopeSubQuery_SelfReference_Referrer_Referrer_Tx() {
        final LdGenreCB cb = new LdGenreCB();
        cb.query().existsGenreSelfList(new LdSubQuery<LdGenreCB>() {
            public void query(LdGenreCB subCB) {
                subCB.query().inScopeGenreSelfList(new LdSubQuery<LdGenreCB>() {
                    public void query(LdGenreCB subCB) {
                        subCB.query().setParentGenreCode_IsNotNull();
                    }
                });
            }
        });
        cb.query().addOrderBy_GenreCode_Asc();

        // ## Act ##
        getMyBhv().selectList(cb);
    }

    public void test_existsSubQuery_inScopeSubQuery_parallel_SelfReference_Referrer_Referrer_Tx() {
        final LdGenreCB cb = new LdGenreCB();
        cb.query().existsGenreSelfList(new LdSubQuery<LdGenreCB>() {
            public void query(LdGenreCB subCB) {
                subCB.query().existsGenreSelfList(new LdSubQuery<LdGenreCB>() {
                    public void query(LdGenreCB subCB) {
                        subCB.query().setParentGenreCode_IsNotNull();
                        subCB.query().inScopeGenreSelfList(new LdSubQuery<LdGenreCB>() {
                            public void query(LdGenreCB subCB) {
                                subCB.query().setParentGenreCode_Equal("ABC");
                            }
                        });
                    }
                });
                subCB.query().inScopeGenreSelfList(new LdSubQuery<LdGenreCB>() {
                    public void query(LdGenreCB subCB) {
                        subCB.query().setParentGenreCode_Equal("DEF");
                    }
                });
            }
        });
        cb.query().inScopeGenreSelfList(new LdSubQuery<LdGenreCB>() {
            public void query(LdGenreCB subCB) {
                subCB.query().existsGenreSelfList(new LdSubQuery<LdGenreCB>() {
                    public void query(LdGenreCB subCB) {
                        subCB.query().setParentGenreCode_IsNotNull();
                    }
                });
            }
        });
        cb.query().addOrderBy_GenreCode_Asc();

        // ## Act & Assert ##
        getMyBhv().selectList(cb); // Expect no exception!
    }
}

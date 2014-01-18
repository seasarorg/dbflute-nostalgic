package dbflute.ldb.exbhv;

import dbflute.ldb.allcommon.bhv.LdAbstractBehaviorReadable.ScalarSelectInvalidColumnSpecificationException;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdScalarQuery;
import dbflute.ldb.allcommon.cbean.LdUnionQuery;
import dbflute.ldb.allcommon.cbean.LdAbstractConditionBean.ScalarSelectInvalidForeignSpecificationException;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookBhvScalarSelectTest extends LdBookAllDbTestCase {

    protected LdBookBhv ldBookBhv;

    public void test_scalarSelect_max_Tx() {
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.specify().columnMaxLendingDateCount();
        cb.query().addOrderBy_MaxLendingDateCount_Desc();
        cb.fetchFirst(1);
        Integer expected = ldBookBhv.selectEntityWithDeletedCheck(cb).getMaxLendingDateCount();

        // ## Act ##
        Integer actual = ldBookBhv.scalarSelect(Integer.class).max(new LdScalarQuery<LdBookCB>() {
            public void query(LdBookCB cb) {
                cb.specify().columnMaxLendingDateCount();
            }
        });

        // ## Assert ##
        log("actual=" + actual);
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    public void test_scalarSelect_min_Tx() {
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.specify().columnMaxLendingDateCount();
        cb.query().addOrderBy_MaxLendingDateCount_Asc();
        cb.fetchFirst(1);
        Integer expected = ldBookBhv.selectEntityWithDeletedCheck(cb).getMaxLendingDateCount();

        // ## Act ##
        Integer actual = ldBookBhv.scalarSelect(Integer.class).min(new LdScalarQuery<LdBookCB>() {
            public void query(LdBookCB cb) {
                cb.specify().columnMaxLendingDateCount();
            }
        });

        // ## Assert ##
        log("actual=" + actual);
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    public void test_scalarSelect_sum_Tx() {
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.specify().columnMaxLendingDateCount();
        cb.query().addOrderBy_MaxLendingDateCount_Asc();
        LdListResultBean<LdBook> bookList = ldBookBhv.selectList(cb);
        Integer expected = 0;
        for (LdBook book : bookList) {
            expected = expected + book.getMaxLendingDateCount();
        }

        // ## Act ##
        Integer actual = ldBookBhv.scalarSelect(Integer.class).sum(new LdScalarQuery<LdBookCB>() {
            public void query(LdBookCB cb) {
                cb.specify().columnMaxLendingDateCount();
            }
        });

        // ## Assert ##
        log("actual=" + actual);
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    public void test_scalarSelect_avg_Tx() {
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.specify().columnMaxLendingDateCount();
        cb.query().addOrderBy_MaxLendingDateCount_Asc();
        LdListResultBean<LdBook> bookList = ldBookBhv.selectList(cb);
        Integer expected = 0;
        for (LdBook book : bookList) {
            expected = expected + book.getMaxLendingDateCount();
        }
        expected = expected / ldBookBhv.getCountAll();

        // ## Act ##
        Integer actual = ldBookBhv.scalarSelect(Integer.class).avg(new LdScalarQuery<LdBookCB>() {
            public void query(LdBookCB cb) {
                cb.specify().columnMaxLendingDateCount();
            }
        });

        // ## Assert ##
        log("actual=" + actual);
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    public void test_scalarSelect_no_column_Tx() {
        // ## Arrange & Act & Assert ##
        try {
            ldBookBhv.scalarSelect(Integer.class).max(new LdScalarQuery<LdBookCB>() {
                public void query(LdBookCB cb) {
                }
            });
        } catch (ScalarSelectInvalidColumnSpecificationException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_scalarSelect_duplicated_column_Tx() {
        // ## Arrange & Act & Assert ##
        try {
            ldBookBhv.scalarSelect(Integer.class).max(new LdScalarQuery<LdBookCB>() {
                public void query(LdBookCB cb) {
                    cb.specify().columnIsbn();
                    cb.specify().columnOpeningPart();
                }
            });
        } catch (ScalarSelectInvalidColumnSpecificationException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_scalarSelect_foreign_column_Tx() {
        // ## Arrange & Act & Assert ##
        try {
            ldBookBhv.scalarSelect(Integer.class).max(new LdScalarQuery<LdBookCB>() {
                public void query(LdBookCB cb) {
                    cb.specify().specifyAuthor().columnAuthorAge();
                }
            });
        } catch (ScalarSelectInvalidForeignSpecificationException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_scalarSelect_max_union_Tx() {
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.specify().columnMaxLendingDateCount();
        cb.query().addOrderBy_MaxLendingDateCount_Desc();
        cb.fetchFirst(1);
        Integer expected = ldBookBhv.selectEntityWithDeletedCheck(cb).getMaxLendingDateCount();

        // ## Act ##
        Integer actual = ldBookBhv.scalarSelect(Integer.class).max(new LdScalarQuery<LdBookCB>() {
            public void query(LdBookCB cb) {
                cb.specify().columnMaxLendingDateCount();
                cb.query().setGenreCode_IsNull();
                cb.union(new LdUnionQuery<LdBookCB>() {
                    public void query(LdBookCB unionCB) {
                        unionCB.query().setGenreCode_IsNotNull();
                    }
                });
            }
        });

        // ## Assert ##
        log("actual=" + actual);
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    public void test_scalarSelect_sum_union_Tx() {
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.specify().columnMaxLendingDateCount();
        LdListResultBean<LdBook> bookList = ldBookBhv.selectList(cb);
        Integer expected = 0;
        for (LdBook book : bookList) {
            Integer maxLendingDateCount = book.getMaxLendingDateCount();
            expected = expected + maxLendingDateCount;
        }

        // ## Act ##
        Integer actual = ldBookBhv.scalarSelect(Integer.class).sum(new LdScalarQuery<LdBookCB>() {
            public void query(LdBookCB cb) {
                cb.specify().columnMaxLendingDateCount();
                cb.query().setGenreCode_IsNull();
                cb.union(new LdUnionQuery<LdBookCB>() {
                    public void query(LdBookCB unionCB) {
                        unionCB.query().setGenreCode_IsNotNull();
                    }
                });
            }
        });

        // ## Assert ##
        log("actual=" + actual);
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

    public void test_scalarSelect_sum_unionAll_Tx() {
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.specify().columnMaxLendingDateCount();
        LdListResultBean<LdBook> bookList = ldBookBhv.selectList(cb);
        Integer expected = 0;
        for (LdBook book : bookList) {
            Integer maxLendingDateCount = book.getMaxLendingDateCount();
            expected = expected + maxLendingDateCount;
        }

        // ## Act ##
        Integer actual = ldBookBhv.scalarSelect(Integer.class).sum(new LdScalarQuery<LdBookCB>() {
            public void query(LdBookCB cb) {
                cb.specify().columnMaxLendingDateCount();
                cb.query().setGenreCode_IsNull();
                cb.unionAll(new LdUnionQuery<LdBookCB>() {
                    public void query(LdBookCB unionCB) {
                        unionCB.query().setGenreCode_IsNotNull();
                    }
                });
            }
        });

        // ## Assert ##
        log("actual=" + actual);
        assertNotNull(actual);
        assertEquals(expected, actual);
    }
}

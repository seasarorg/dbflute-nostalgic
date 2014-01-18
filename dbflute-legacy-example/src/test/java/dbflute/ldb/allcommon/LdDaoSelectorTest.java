package dbflute.ldb.allcommon;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.LdLdbTestCase;
import dbflute.ldb.allcommon.LdDaoReadable;
import dbflute.ldb.allcommon.LdDaoSelector;
import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.bhv.LdBehaviorReadable;
import dbflute.ldb.exbhv.LdAuthorBhv;
import dbflute.ldb.exbhv.LdBookBhv;
import dbflute.ldb.exdao.LdAuthorDao;
import dbflute.ldb.exdao.LdBookDao;
import dbflute.ldb.exentity.LdAuthor;
import dbflute.ldb.exentity.LdBook;


/**
 * Test of DaoSelector
 * 
 * @author jflute
 */
public class LdDaoSelectorTest extends LdLdbTestCase {

    /** Log instance. */
    public static final Log _log = LogFactory.getLog(LdDaoSelectorTest.class);

    // ==========================================================================================
    //                                                                                Common Test
    //                                                                                ===========

    protected static interface DownCastChecker {
        public Object downcastDao(LdDaoReadable dao);

        public Object downcastBhv(LdBehaviorReadable bhv);
    }

    public void test_DaoSelector() {
        {
            final DownCastChecker dc = new DownCastChecker() {
                public Object downcastDao(LdDaoReadable dao) {
                    return (LdBookDao) dao;
                }

                public Object downcastBhv(LdBehaviorReadable bhv) {
                    return (LdBookBhv) bhv;
                }
            };
            assertDaoSelector(new LdBook(), LdBookDao.class, LdBookBhv.class, dc);
        }
        {
            final DownCastChecker checker = new DownCastChecker() {
                public Object downcastDao(LdDaoReadable dao) {
                    return (LdAuthorDao) dao;
                }

                public Object downcastBhv(LdBehaviorReadable bhv) {
                    return (LdAuthorBhv) bhv;
                }
            };
            assertDaoSelector(new LdAuthor(), LdAuthorDao.class, LdAuthorBhv.class, checker);
        }

        assertDaoSelector_NullArgument();
    }

    protected void assertDaoSelector(LdEntity entity, Class daoType, Class bhvType, DownCastChecker dc) {
        final LdDaoSelector selector = (LdDaoSelector) getComponent(LdDaoSelector.class);
        {
            assertNotNull(dc.downcastDao(selector.getRDao(daoType)));
            assertNotNull(dc.downcastDao(selector.getRDao(entity)));
            assertNotNull(dc.downcastDao(selector.getRDao(entity.getTableDbName())));
            assertNotNull(dc.downcastDao(selector.getRDao(entity.getTableCapPropName())));
            assertNotNull(dc.downcastDao(selector.getRDao(entity.getTableUncapPropName())));
            assertNotNull(dc.downcastDao(selector.getWDao(daoType)));
            assertNotNull(dc.downcastDao(selector.getWDao(entity)));
            assertNotNull(dc.downcastDao(selector.getWDao(entity.getTableDbName())));
            assertNotNull(dc.downcastDao(selector.getWDao(entity.getTableCapPropName())));
            assertNotNull(dc.downcastDao(selector.getWDao(entity.getTableUncapPropName())));
        }
        {
            assertNotNull(dc.downcastBhv(selector.getRBhv(bhvType)));
            assertNotNull(dc.downcastBhv(selector.getRBhv(entity)));
            assertNotNull(dc.downcastBhv(selector.getRBhv(entity.getTableDbName())));
            assertNotNull(dc.downcastBhv(selector.getRBhv(entity.getTableCapPropName())));
            assertNotNull(dc.downcastBhv(selector.getRBhv(entity.getTableUncapPropName())));
            assertNotNull(dc.downcastBhv(selector.getWBhv(bhvType)));
            assertNotNull(dc.downcastBhv(selector.getWBhv(entity)));
            assertNotNull(dc.downcastBhv(selector.getWBhv(entity.getTableDbName())));
            assertNotNull(dc.downcastBhv(selector.getWBhv(entity.getTableCapPropName())));
            assertNotNull(dc.downcastBhv(selector.getWBhv(entity.getTableUncapPropName())));
        }
    }

    protected void assertDaoSelector_NullArgument() {
        final LdDaoSelector selector = (LdDaoSelector) getComponent(LdDaoSelector.class);
        try {
            selector.getRDao((Class)null);
            fail("selector.getRDao(null) should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getRDao((LdEntity)null);
            fail("selector.getRDao(null) should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getRDao((String)null);
            fail("selector.getRDao(null) should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getRDao("");
            fail("selector.getRDao(\"\") should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getRDao("   ");
            fail("selector.getRDao(\"   \") should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getWDao((Class)null);
            fail("selector.getWDao(null) should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getWDao((LdEntity)null);
            fail("selector.getWDao(null) should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getWDao((String)null);
            fail("selector.getWDao(null) should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getWDao("");
            fail("selector.getWDao(\"\") should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getWDao("   ");
            fail("selector.getWDao(\"   \") should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getRBhv((Class)null);
            fail("selector.getRBhv(null) should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getRBhv((LdEntity)null);
            fail("selector.getRBhv(null) should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getRBhv((String)null);
            fail("selector.getRBhv(null) should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getRBhv("");
            fail("selector.getRBhv(\"\") should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getRBhv("   ");
            fail("selector.getRBhv(\"   \") should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getWBhv((Class)null);
            fail("selector.getWBhv(null) should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getWBhv((LdEntity)null);
            fail("selector.getWBhv(null) should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getWBhv((String)null);
            fail("selector.getWBhv(null) should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getWBhv("");
            fail("selector.getWBhv(\"\") should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            selector.getWBhv("   ");
            fail("selector.getWBhv(\"   \") should throw the exception!");
        } catch (IllegalArgumentException e) {
            // OK
        }
    }
}

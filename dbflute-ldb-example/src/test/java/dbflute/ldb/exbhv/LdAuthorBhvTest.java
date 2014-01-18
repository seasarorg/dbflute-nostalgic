package dbflute.ldb.exbhv;

import java.util.List;

import dbflute.ldb.allcommon.bhv.setup.LdConditionBeanSetupper;
import dbflute.ldb.cbean.LdAuthorCB;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.exentity.LdAuthor;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdAuthorAllDbTestCase;

/**
 * @author jflute
 */
public class LdAuthorBhvTest extends LdAuthorAllDbTestCase {

    // ==========================================================================================
    //                                                                                 Bhv Detail
    //                                                                                 ==========
    public void test_Bhv_LoadReferrer_Tx() {
        final LdAuthorCB cb = new LdAuthorCB();
        {
            final List<LdAuthor> ls = getMyBhv().selectList(cb);
            getMyBhv().loadBookList(ls, new LdConditionBeanSetupper<LdBookCB>() {
                public void setup(LdBookCB cb) {
                }
            });

            final LdBookBhv reffererBhv = getBehaviorSelector().select(LdBookBhv.class);
            for (Object object : ls) {
                final LdAuthor entity = (LdAuthor) object;
                final List<LdBook> reffererList = entity.getBookList();
                assertNotNull(reffererList);

                final LdBookCB reffererCB = reffererBhv.newMyConditionBean();
                reffererCB.query().setAuthorId_Equal(entity.getAuthorId());
                // OrderBy指定がないためsize()で比較
                assertEquals(reffererBhv.selectList(reffererCB).size(), reffererList.size());

                for (LdBook book : reffererList) {
                    assertNotNull(book.getAuthor());
                }
            }
        }
        {
            final List<LdAuthor> ls = getMyBhv().selectList(cb);
            getMyBhv().loadBookList(ls, new LdConditionBeanSetupper<LdBookCB>() {
                public void setup(LdBookCB cb) {
                    cb.query().addOrderBy_BookName_Desc();
                }
            });

            final LdBookBhv reffererBhv = getBehaviorSelector().select(LdBookBhv.class);
            for (Object object : ls) {
                final LdAuthor entity = (LdAuthor) object;
                final List<LdBook> reffererList = entity.getBookList();
                assertNotNull(reffererList);

                final LdBookCB reffererCB = reffererBhv.newMyConditionBean();
                reffererCB.query().setAuthorId_Equal(entity.getAuthorId());
                reffererCB.query().addOrderBy_BookName_Desc();
                assertEquals(reffererBhv.selectList(reffererCB), reffererList);

                for (LdBook refferer : reffererList) {
                    assertNotNull(refferer.getAuthor());
                }
            }
        }
    }
}

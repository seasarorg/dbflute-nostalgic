package dbflute.ldb.cbean;

import java.util.Iterator;
import java.util.List;

import dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption;
import dbflute.ldb.allcommon.exception.LdRequiredOptionNotFoundException;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookCBNotLikeSearchTest extends LdBookAllDbTestCase {

    public void test_selectList_NotLikeSearch_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final String contain1 = "test_selectList_NotLikeSearch_at_MyTable_Tx()";
        final String contain4 = "S2_a%o";

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_NotLikeSearch(contain1, new LdLikeSearchOption().likeContain().escapeByBackSlash());
        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListNotEmtpy(ls);

            // ## Assert ##
            for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                final String bookName = entity.getBookName();
                if (bookName.contains(contain1)) {
                    fail("The book name shuold start with '" + contain1 + "': " + bookName);
                }
            }
        }
        cb.query().setBookName_NotLikeSearch(contain4, new LdLikeSearchOption().likePrefix().escapeByPipeLine());
        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListNotEmtpy(ls);
        }
    }

    // ===================================================================================
    //                                                                     Illegal Pattern
    //                                                                     ===============
    public void test_selectList_NotLikeSearch_LikeSearchOption_is_Null_Tx() {
        final LdBookCB cb = new LdBookCB();
        try {
            cb.query().setBookName_NotLikeSearch("S2Dao", null);
            fail();
        } catch (LdRequiredOptionNotFoundException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }
}

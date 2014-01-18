package dbflute.ldb.cbean;

import java.util.Iterator;
import java.util.List;

import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption;
import dbflute.ldb.allcommon.exception.LdRequiredOptionNotFoundException;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookCBLikeSearchTest extends LdBookAllDbTestCase {

    public void test_selectList_LikeSearch_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final String contain1 = "S2";
        final String contain2 = "S2Dao";
        final String contain3 = "S2_a%o";
        final String contain4 = "S2_a%o";

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_LikeSearch(contain1, new LdLikeSearchOption().likeContain().escapeByBackSlash());
        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListNotEmtpy(ls);

            // ## Assert ##
            for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                final String bookName = entity.getBookName();
                if (!bookName.contains(contain1)) {
                    fail("The book name shuold start with '" + contain1 + "': " + bookName);
                }
            }
        }

        // ## Act ##
        cb.query().setBookName_LikeSearch(contain2, new LdLikeSearchOption().likePrefix().escapeBySlash());
        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListNotEmtpy(ls);

            // ## Assert ##
            for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                final String bookName = entity.getBookName();
                if (!bookName.contains(contain2) && !bookName.startsWith(contain2)) {
                    fail("The book name shuold start with '" + contain2 + "': " + bookName);
                }
            }
        }

        cb.query().setBookName_LikeSearch(contain3, new LdLikeSearchOption().likePrefix());
        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListNotEmtpy(ls);

            // ## Assert ##
            for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                final String bookName = entity.getBookName();
                if (!bookName.contains(contain2) && !bookName.startsWith(contain2)) {
                    fail("The book name shuold start with '" + contain2 + "': " + bookName);
                }
            }
        }

        cb.query().setBookName_LikeSearch(contain4, new LdLikeSearchOption().likePrefix().escapeByPipeLine());
        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListEmtpy(ls);
        }
    }

    public void test_selectList_LikeSearch_AsInline_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final String contain1 = "S2";
        final String contain2 = "S2Dao";
        final String contain3 = "S2_a%o";
        final String contain4 = "S2_a%o";

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        final LdLikeSearchOption likeSearchOption = new LdLikeSearchOption().likeContain().escapeByBackSlash();
        cb.query().inline().setBookName_LikeSearch(contain1, likeSearchOption);
        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListNotEmtpy(ls);

            // ## Assert ##
            for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                final String bookName = entity.getBookName();
                if (!bookName.contains(contain1)) {
                    fail("The book name shuold start with '" + contain1 + "': " + bookName);
                }
            }
        }

        // ## Act ##
        cb.query().inline().setBookName_LikeSearch(contain2, new LdLikeSearchOption().likePrefix().escapeBySlash());
        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListNotEmtpy(ls);

            // ## Assert ##
            for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                final String bookName = entity.getBookName();
                if (!bookName.contains(contain2) && !bookName.startsWith(contain2)) {
                    fail("The book name shuold start with '" + contain2 + "': " + bookName);
                }
            }
        }

        cb.query().inline().setBookName_LikeSearch(contain3, new LdLikeSearchOption().likePrefix());
        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListNotEmtpy(ls);

            // ## Assert ##
            for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                final String bookName = entity.getBookName();
                if (!bookName.contains(contain2) && !bookName.startsWith(contain2)) {
                    fail("The book name shuold start with '" + contain2 + "': " + bookName);
                }
            }
        }

        cb.query().inline().setBookName_LikeSearch(contain4, new LdLikeSearchOption().likePrefix().escapeByPipeLine());
        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListEmtpy(ls);
        }
    }

    public void test_selectList_LikeSearch_AsInline_at_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final String contain1 = "20の";

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        final LdLikeSearchOption likeSearchOption = new LdLikeSearchOption().likePrefix().escapeByBackSlash();
        cb.query().queryAuthor().inline().setAuthorName_LikeSearch(contain1, likeSearchOption);
        {
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListNotEmtpy(ls);

            // ## Assert ##
            assertEquals(getMyBhv().getCountAll(), ls.size());
        }
    }

    // ===================================================================================
    //                                                             AdditionalConditionAsOr
    //                                                             =======================
    public void test_selectList_LikeSearch_with_SameColumnAdditionalConditionAsOr_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final String bookName = "戦う|貴様、S2Daoをなめるなー！";

        final LdBookCB cb = new LdBookCB();
        final LdLikeSearchOption likeSearchOption = new LdLikeSearchOption();
        likeSearchOption.likePrefix().splitByPipeLine();
        cb.query().inline().setBookName_LikeSearch(bookName, likeSearchOption);

        // ## Act && Assert ##
        final List<LdBook> ls = getMyBhv().selectList(cb);// Expect no exception!

        // ## Assert ##
        assertListEmtpy(ls);
    }

    @SuppressWarnings("deprecation")
    public void test_selectList_LikeSearch_with_AdditionalConditionAsOr_at_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final String contain1 = "戦う|貴様、S2Daoをなめるなー！";

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        final LdLikeSearchOption likeSearchOption = new LdLikeSearchOption();
        likeSearchOption.likePrefix().splitByPipeLine();
        final LdLikeSearchOption.LikeAsOrCallback likeAsOrCallbackOpeningPart = new LdLikeSearchOption.DefaultLikeAsOrCallback() {
            public String getAdditionalTargetPropertyName() {
                return LdBookDbm.getInstance().columnOpeningPart().getPropertyName();
            }

            public LdLikeSearchOption filterOption(LdLikeSearchOption optionDeepCopyWithoutCallback) {
                return optionDeepCopyWithoutCallback.likeContain();
            }
        };
        final LdLikeSearchOption.LikeAsOrCallback likeAsOrCallbackIsbnNo = new LdLikeSearchOption.DefaultLikeAsOrCallback() {
            public String getAdditionalTargetPropertyName() {
                return LdBookDbm.getInstance().columnIsbn().getPropertyName();
            }

            public LdLikeSearchOption filterOption(LdLikeSearchOption optionDeepCopyWithoutCallback) {
                return optionDeepCopyWithoutCallback.likeSuffix();
            }
        };
        likeSearchOption.addLikeAsOrCallback(likeAsOrCallbackOpeningPart);
        likeSearchOption.addLikeAsOrCallback(likeAsOrCallbackIsbnNo);
        cb.query().inline().setBookName_LikeSearch(contain1, likeSearchOption);
        cb.query().setBookId_Equal(new Integer(6));

        // ## Act ##
        final List<LdBook> ls = getMyBhv().selectList(cb);// Expect no exception!

        // ## Assert ##
        assertListNotEmtpy(ls);
    }

    // ===================================================================================
    //                                                                               Split
    //                                                                               =====
    public void test_selectList_LikeSearch_LikeSearchOption_splitBySpace_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final String keyword = "カト 様 S2Dao な";

        final LdBookCB cb = new LdBookCB();
        final LdLikeSearchOption likeSearchOption = new LdLikeSearchOption();
        likeSearchOption.likeContain().splitBySpace();
        cb.query().setOpeningPart_LikeSearch(keyword, likeSearchOption);

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertNotNull(bookList);
        assertFalse(bookList.isEmpty());
        final StringBuilder sb = new StringBuilder();
        sb.append(getLineSeparator());
        for (LdBook book : bookList) {
            final String openingPart = book.getOpeningPart();
            sb.append("openingPart=" + openingPart).append(getLineSeparator());
            assertTrue(openingPart.contains("カト"));
            assertTrue(openingPart.contains("様"));
            assertTrue(openingPart.contains("S2Dao"));
            assertTrue(openingPart.contains("な"));
        }
        log(sb.toString());
    }

    public void test_selectList_LikeSearch_LikeSearchOption_splitBySpace_asOrSplit_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final String keyword = "こんにちは 枕元 カトラー なめるなー";

        final LdBookCB cb = new LdBookCB();
        final LdLikeSearchOption likeSearchOption = new LdLikeSearchOption();
        likeSearchOption.likeContain().splitBySpace().asOrSplit();
        cb.query().setOpeningPart_LikeSearch(keyword, likeSearchOption);

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertNotNull(bookList);
        assertFalse(bookList.isEmpty());
        final StringBuilder sb = new StringBuilder();
        sb.append(getLineSeparator());
        for (LdBook book : bookList) {
            final String openingPart = book.getOpeningPart();
            sb.append("openingPart=" + openingPart).append(getLineSeparator());
            assertTrue(openingPart.contains("こんにちは") || openingPart.contains("枕元") || openingPart.contains("カトラー")
                    || openingPart.contains("なめるなー"));
        }
        log(sb.toString());
    }

    public void test_selectList_LikeSearch_LikeSearchOption_splitBySpace_asOrSplit_with_OtherCondition_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final String keyword = "こんにちは 枕元 カトラー なめるなー";

        final LdBookCB cb = new LdBookCB();
        final LdLikeSearchOption likeSearchOption = new LdLikeSearchOption();
        likeSearchOption.likeContain().splitBySpace().asOrSplit();
        cb.query().setBookName_PrefixSearch("S2Dao");
        cb.query().setOpeningPart_LikeSearch(keyword, likeSearchOption);

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertNotNull(bookList);
        assertFalse(bookList.isEmpty());
        final StringBuilder sb = new StringBuilder();
        sb.append(getLineSeparator());
        for (LdBook book : bookList) {
            final String bookName = book.getBookName();
            final String openingPart = book.getOpeningPart();
            sb.append("bookName=" + bookName + " openingPart=" + openingPart).append(getLineSeparator());
            assertTrue(bookName.startsWith("S2Dao"));
            assertTrue(openingPart.contains("こんにちは"));
        }
        log(sb.toString());
    }

    // ===================================================================================
    //                                                                    Argument Pattern
    //                                                                    ================
    public void test_selectList_LikeSearch_ArgumentNull_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_LikeSearch(null, new LdLikeSearchOption().likeContain());

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        assertEquals(getMyBhv().getCountAll(), bookList.size());
    }

    public void test_selectList_LikeSearch_split_ArgumentNull_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_LikeSearch(null, new LdLikeSearchOption().likeContain().splitByPipeLine());

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        assertEquals(getMyBhv().getCountAll(), bookList.size());
    }

    public void test_selectList_LikeSearch_ArgumentEmpty_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_LikeSearch("", new LdLikeSearchOption().likeContain());

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        assertEquals(getMyBhv().getCountAll(), bookList.size());
    }

    public void test_selectList_LikeSearch_split_ArgumentEmpty_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_LikeSearch("", new LdLikeSearchOption().likeContain().splitByPipeLine().toUpperCase());

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        assertEquals(getMyBhv().getCountAll(), bookList.size());
    }

    public void test_selectList_LikeSearch_ArgumentSpace_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_LikeSearch(" ", new LdLikeSearchOption().likeContain());

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        for (LdBook book : bookList) {
            assertTrue(book.getBookName().contains(" "));
        }
    }

    public void test_selectList_LikeSearch_split_ArgumentSpace_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_LikeSearch(" ", new LdLikeSearchOption().likeContain().splitByPipeLine().toLowerCase());

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        for (LdBook book : bookList) {
            assertTrue(book.getBookName().contains(" "));
        }
    }

    // ===================================================================================
    //                                                                     Illegal Pattern
    //                                                                     ===============
    public void test_selectList_LikeSearch_LikeSearchOption_is_Null_Tx() {
        final LdBookCB cb = new LdBookCB();
        try {
            cb.query().setBookName_LikeSearch("S2Dao", null);
            fail();
        } catch (LdRequiredOptionNotFoundException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }
}

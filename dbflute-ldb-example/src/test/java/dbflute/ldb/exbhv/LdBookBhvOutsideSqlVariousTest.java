package dbflute.ldb.exbhv;

import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookBhvOutsideSqlVariousTest extends LdBookAllDbTestCase {

    public void test_dummy_Tx() throws Exception {
    }
    
    //    // ===================================================================================
    //    //                                                                          Definition
    //    //                                                                          ==========
    //    protected static String SQL_BASE = "dbflute/ldb/sqldir";
    //    protected static String SQL_BOOK_BASE = SQL_BASE + "/book";
    //    protected static String SQL_BOOK_VARIOUS_BASE = SQL_BOOK_BASE + "/various";
    //    protected static String SQL_selectByBindCharacter = SQL_BOOK_VARIOUS_BASE + "/selectByBindCharacter.sql";
    //    protected static String SQL_selectContainsBindCharacterOnLineComment = SQL_BOOK_VARIOUS_BASE
    //            + "/selectContainsBindCharacterOnLineComment.sql";
    //    protected static String SQL_selectContainsDoubleByte = SQL_BOOK_VARIOUS_BASE + "/selectContainsDoubleByte.sql";
    //    protected static String SQL_selectIfCommentVariousExpression = SQL_BOOK_VARIOUS_BASE
    //            + "/selectIfCommentVariousExpression.sql";
    //    protected static String SQL_selectInScopeBind = SQL_BOOK_VARIOUS_BASE + "/selectInScopeBind.sql";
    //    protected static String SQL_selectInScopeEmbedded = SQL_BOOK_VARIOUS_BASE + "/selectInScopeEmbedded.sql";
    //    protected static String SQL_selectInScopeWithoutIf = SQL_BOOK_VARIOUS_BASE + "/selectInScopeWithoutIf.sql";
    //    protected static String SQL_selectResolvedPackageName = SQL_BOOK_VARIOUS_BASE + "/selectResolvedPackageName.sql";
    //
    //    // ===================================================================================
    //    //                                                                           Attribute
    //    //                                                                           =========
    //    protected LdBookBhv ldBookBhv;
    //
    //    // ===================================================================================
    //    //                                                                     ByBindCharacter
    //    //                                                                     ===============
    //    public void test_outsideSql_selectList_ByBindCharacter_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectByBindCharacter;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act & Assert ##
    //        final LdBook book1 = bhv.outsideSql().entityHandling().selectEntity(path, 1, LdBook.class);
    //        assertNotNull(book1);
    //        assertEquals(new Integer(1), book1.getBookId());
    //        final LdBook book2 = bhv.outsideSql().entityHandling().selectEntity(path, 2, LdBook.class);
    //        assertNotNull(book2);
    //        assertEquals(new Integer(2), book2.getBookId());
    //    }
    //
    //    // ===================================================================================
    //    //                                                  ContainsBindCharacterOnLineComment
    //    //                                                  ==================================
    //    public void test_outsideSql_selectList_BindCharacterOnLineComment_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectContainsBindCharacterOnLineComment;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act & Assert ##
    //        bhv.outsideSql().selectList(path, pmb, LdBook.class);// Expect no exception!
    //        bhv.outsideSql().selectList(path, pmb, LdBook.class);// Expect no exception!
    //    }
    //
    //    // ===================================================================================
    //    //                                                                  ContainsDoubleByte
    //    //                                                                  ==================
    //    public void test_outsideSql_selectList_ContainsDoubleByte_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectContainsDoubleByte;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act & Assert ##
    //        bhv.outsideSql().selectList(path, pmb, LdBookContainsDoubleByte.class);// Expect no exception!
    //        bhv.outsideSql().selectList(path, pmb, LdBookContainsDoubleByte.class);// Expect no exception!
    //    }
    //
    //    // ===================================================================================
    //    //                                                          IfCommentVariousExpression
    //    //                                                          ==========================
    //    public void test_outsideSql_selectList_IfCommentVariousExpression_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectIfCommentVariousExpression;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act & Assert ##
    //        bhv.outsideSql().selectList(path, pmb, LdBookSpecifiedOutsideSql.class);// Expect no exception!
    //        bhv.outsideSql().selectList(path, pmb, LdBookSpecifiedOutsideSql.class);// Expect no exception!
    //    }
    //
    //    // ===================================================================================
    //    //                                                                   InScope Parameter
    //    //                                                                   =================
    //    // -----------------------------------------------------
    //    //                                                  Bind
    //    //                                                  ----
    //    public void test_outsideSql_selectInScopeBind_IntegerList_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectInScopeBind;
    //        final LdBookInScopePmb pmb = new LdBookInScopePmb();
    //        final List<Integer> bookIdList = new ArrayList<Integer>();
    //        bookIdList.add(1);
    //        bookIdList.add(3);
    //        pmb.setBookIdList(bookIdList);
    //
    //        // ## Act ##
    //        final List<LdBook> bookList = getMyBhv().outsideSql().selectList(path, pmb, LdBook.class);
    //
    //        // ## Assert ##
    //        _log.debug("bookList=" + bookList);
    //        assertNotNull(bookList);
    //        assertEquals(2, bookList.size());
    //    }
    //
    //    public void test_outsideSql_selectInScopeBind_IntegerList_ContainsNullElement_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectInScopeBind;
    //        final LdBookInScopePmb pmb = new LdBookInScopePmb();
    //        final List<Integer> bookIdList = new ArrayList<Integer>();
    //        bookIdList.add(null);
    //        bookIdList.add(3);
    //        pmb.setBookIdList(bookIdList);
    //
    //        // ## Act ##
    //        final List<LdBook> bookList = getMyBhv().outsideSql().selectList(path, pmb, LdBook.class);
    //
    //        // ## Assert ##
    //        _log.debug("bookList=" + bookList);
    //        assertNotNull(bookList);
    //        assertEquals(1, bookList.size());
    //    }
    //
    //    public void test_outsideSql_selectInScopeBind_StringList_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectInScopeBind;
    //        final LdBookInScopePmb pmb = new LdBookInScopePmb();
    //        final List<String> genreCodeList = new ArrayList<String>();
    //        genreCodeList.add("HOWTO-COOK");
    //        genreCodeList.add("MAG-MAHJONG");
    //        pmb.setGenreCodeList(genreCodeList);
    //
    //        // ## Act ##
    //        final List<LdBook> bookList = getMyBhv().outsideSql().selectList(path, pmb, LdBook.class);
    //
    //        // ## Assert ##
    //        _log.debug("bookList=" + bookList);
    //        assertNotNull(bookList);
    //        assertEquals(2, bookList.size());
    //    }
    //
    //    public void test_outsideSql_selectInScopeBind_StringList_ContainsNullElement_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectInScopeBind;
    //        final LdBookInScopePmb pmb = new LdBookInScopePmb();
    //        final List<String> genreCodeList = new ArrayList<String>();
    //        genreCodeList.add(null);
    //        genreCodeList.add("MAG-MAHJONG");
    //        pmb.setGenreCodeList(genreCodeList);
    //
    //        // ## Act ##
    //        final List<LdBook> bookList = getMyBhv().outsideSql().selectList(path, pmb, LdBook.class);
    //
    //        // ## Assert ##
    //        _log.debug("bookList=" + bookList);
    //        assertNotNull(bookList);
    //        assertEquals(1, bookList.size());
    //    }
    //
    //    public void test_outsideSql_selectInScopeBind_IntegerList_Empty_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectInScopeBind;
    //        final LdBookInScopePmb pmb = new LdBookInScopePmb();
    //        final List<Integer> bookIdList = new ArrayList<Integer>();
    //        pmb.setBookIdList(bookIdList);
    //
    //        // ## Act & Assert ##
    //        try {
    //            getMyBhv().outsideSql().selectList(path, pmb, LdBook.class);
    //            fail();
    //        } catch (IllegalArgumentException e) {
    //            // OK
    //            _log.debug(e.getMessage());
    //        }
    //    }
    //
    //    public void test_outsideSql_selectInScopeBind_IntegerList_NullOnly_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectInScopeBind;
    //        final LdBookInScopePmb pmb = new LdBookInScopePmb();
    //        final List<Integer> bookIdList = new ArrayList<Integer>();
    //        bookIdList.add(null);
    //        bookIdList.add(null);
    //        pmb.setBookIdList(bookIdList);
    //
    //        // ## Act & Assert ##
    //        try {
    //            getMyBhv().outsideSql().selectList(path, pmb, LdBook.class);
    //            fail();
    //        } catch (IllegalArgumentException e) {
    //            // OK
    //            _log.debug(e.getMessage());
    //        }
    //    }
    //
    //    // -----------------------------------------------------
    //    //                                              Embedded
    //    //                                              --------
    //    public void test_outsideSql_selectInScopeEmbedded_IntegerList_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectInScopeEmbedded;
    //        final LdBookInScopePmb pmb = new LdBookInScopePmb();
    //        final List<Integer> bookIdList = new ArrayList<Integer>();
    //        bookIdList.add(1);
    //        bookIdList.add(3);
    //        pmb.setBookIdList(bookIdList);
    //
    //        // ## Act ##
    //        final List<LdBook> bookList = getMyBhv().outsideSql().selectList(path, pmb, LdBook.class);
    //
    //        // ## Assert ##
    //        _log.debug("bookList=" + bookList);
    //        assertNotNull(bookList);
    //        assertEquals(2, bookList.size());
    //    }
    //
    //    public void test_outsideSql_selectInScopeEmbedded_IntegerList_ContainsNullElement_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectInScopeEmbedded;
    //        final LdBookInScopePmb pmb = new LdBookInScopePmb();
    //        final List<Integer> bookIdList = new ArrayList<Integer>();
    //        bookIdList.add(null);
    //        bookIdList.add(3);
    //        pmb.setBookIdList(bookIdList);
    //
    //        // ## Act ##
    //        final List<LdBook> bookList = getMyBhv().outsideSql().selectList(path, pmb, LdBook.class);
    //
    //        // ## Assert ##
    //        _log.debug("bookList=" + bookList);
    //        assertNotNull(bookList);
    //        assertEquals(1, bookList.size());
    //    }
    //
    //    public void test_outsideSql_selectInScopeEmbedded_StringList_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectInScopeEmbedded;
    //        final LdBookInScopePmb pmb = new LdBookInScopePmb();
    //        final List<String> genreCodeList = new ArrayList<String>();
    //        genreCodeList.add("HOWTO-COOK");
    //        genreCodeList.add("MAG-MAHJONG");
    //        pmb.setGenreCodeList(genreCodeList);
    //
    //        // ## Act ##
    //        final List<LdBook> bookList = getMyBhv().outsideSql().selectList(path, pmb, LdBook.class);
    //
    //        // ## Assert ##
    //        _log.debug("bookList=" + bookList);
    //        assertNotNull(bookList);
    //        assertEquals(2, bookList.size());
    //    }
    //
    //    public void test_outsideSql_selectInScopeEmbedded_StringList_ContainsNullElement_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectInScopeEmbedded;
    //        final LdBookInScopePmb pmb = new LdBookInScopePmb();
    //        final List<String> genreCodeList = new ArrayList<String>();
    //        genreCodeList.add(null);
    //        genreCodeList.add("MAG-MAHJONG");
    //        pmb.setGenreCodeList(genreCodeList);
    //
    //        // ## Act ##
    //        final List<LdBook> bookList = getMyBhv().outsideSql().selectList(path, pmb, LdBook.class);
    //
    //        // ## Assert ##
    //        _log.debug("bookList=" + bookList);
    //        assertNotNull(bookList);
    //        assertEquals(1, bookList.size());
    //    }
    //
    //    // -----------------------------------------------------
    //    //                                            Without If
    //    //                                            ----------
    //    public void test_outsideSql_selectInScopeWithoutBegin_NullList_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectInScopeWithoutIf;
    //        final LdBookInScopePmb pmb = new LdBookInScopePmb();
    //        pmb.setBookIdList(null);
    //
    //        // ## Act & Assert ##
    //        try {
    //            getMyBhv().outsideSql().selectList(path, pmb, LdBook.class);
    //            fail();
    //        } catch (LdBindVariableParameterNullValueException e) {
    //            // OK
    //            _log.debug(e.getMessage());
    //        }
    //    }
    //
    //    public void test_outsideSql_selectInScopeWithoutIf_ContainsNullElement_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectInScopeWithoutIf;
    //        final LdBookInScopePmb pmb = new LdBookInScopePmb();
    //        final List<Integer> bookIdList = new ArrayList<Integer>();
    //        bookIdList.add(null);
    //        bookIdList.add(3);
    //        pmb.setBookIdList(bookIdList);
    //
    //        // ## Act ##
    //        final List<LdBook> bookList = getMyBhv().outsideSql().selectList(path, pmb, LdBook.class);
    //
    //        // ## Assert ##
    //        _log.debug("bookList=" + bookList);
    //        assertNotNull(bookList);
    //        assertEquals(1, bookList.size());
    //    }
    //
    //    // -----------------------------------------------------
    //    //                                 Resolved Package Name
    //    //                                 ---------------------
    //    public void test_outsideSql_SQL_selectResolvedPackageName_Tx() throws Exception {
    //        // ## Arrange ##
    //        _help.replaceMyTableWithForeign();
    //
    //        final String path = SQL_selectResolvedPackageName;
    //        final LdResolvedPackageNamePmb pmb = new LdResolvedPackageNamePmb();
    //        Calendar cal = Calendar.getInstance();
    //        cal.set(2050, 7, 12);
    //        pmb.setDate1(new java.util.Date(cal.getTimeInMillis()));
    //        pmb.setDate3(new java.sql.Date(cal.getTimeInMillis()));
    //
    //        // ## Act ##
    //        final List<LdBook> bookList = getMyBhv().outsideSql().selectList(path, pmb, LdBook.class);
    //
    //        // ## Assert ##
    //        _log.debug("bookList=" + bookList);
    //        assertNotNull(bookList);
    //        assertListNotEmtpy(bookList);
    //    }
}

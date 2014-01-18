package dbflute.ldb.cbean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdPagingBean;
import dbflute.ldb.allcommon.cbean.LdSubQuery;
import dbflute.ldb.allcommon.cbean.coption.LdDateFromToOption;
import dbflute.ldb.allcommon.cbean.coption.LdFromToOption;
import dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption;
import dbflute.ldb.allcommon.cbean.sqlclause.LdWhereClauseSimpleFilter.WhereClauseToEmbeddedQuotedSimpleFilter;
import dbflute.ldb.allcommon.cbean.sqlclause.LdWhereClauseSimpleFilter.WhereClauseToEmbeddedSimpleFilter;
import dbflute.ldb.allcommon.dbmeta.info.LdColumnInfo;
import dbflute.ldb.allcommon.jdbc.LdStatementConfig;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;
import dbflute.ldb.exbhv.LdPublisherBhv;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.exentity.LdPublisher;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * Test of BsBookDao
 * 
 * @author jflute
 */
public class LdBookCBTest extends LdBookAllDbTestCase {

    private static final Log _log = LogFactory.getLog(LdBookCBTest.class);

    // ==========================================================================================
    //                                                                               Setup Select
    //                                                                               ============
    public void test_selectList_setupSelect_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final int countAll = getMyBhv().getCountAll();

        // ## Act & Assert {setupSelect_Non} ##
        {
            final LdBookCB cb = (LdBookCB) getBehaviorReadable().newConditionBean();
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListNotEmtpy(ls);
            assertEquals(countAll, ls.size());
            for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                assertNull(entity.getAuthor());
                assertNull(entity.getPublisher());
                assertFalse(entity.getCollectionList().size() > 0);
                assertNotNull(entity.getCollectionList());
            }
        }
        // ## Act & Assert {setupSelect_Author} ##
        {
            final LdBookCB cb = (LdBookCB) getBehaviorReadable().newConditionBean();
            cb.setupSelect_Author();
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListNotEmtpy(ls);
            assertEquals(countAll, ls.size());
            for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                assertNotNull(entity.getAuthor());
                assertNull(entity.getPublisher());
                assertNull(entity.getGenre());
                assertFalse(entity.getCollectionList().size() > 0);
                assertNotNull(entity.getCollectionList());
            }
        }
        // ## Act & Assert {setupSelect_Publisher} ##
        {
            final LdBookCB cb = (LdBookCB) getBehaviorReadable().newConditionBean();
            cb.setupSelect_Publisher();
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListNotEmtpy(ls);
            assertEquals(countAll, ls.size());
            for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                assertNull(entity.getAuthor());
                assertNotNull(entity.getPublisher());
                assertNull(entity.getGenre());
                assertFalse(entity.getCollectionList().size() > 0);
                assertNotNull(entity.getCollectionList());
            }
        }
        // ## Act & Assert {setupSelect_Genre().withGenreSelf()} ##
        {
            final LdBookCB cb = (LdBookCB) getBehaviorReadable().newConditionBean();
            cb.setupSelect_Genre().withGenreSelf();
            cb.query().setGenreCode_IsNotNull();
            cb.query().queryGenre().setParentGenreCode_IsNotNull();
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListNotEmtpy(ls);
            for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                assertNull(entity.getAuthor());
                assertNull(entity.getPublisher());
                assertFalse(entity.getCollectionList().size() > 0);
                assertNotNull(entity.getCollectionList());
                assertNotNull(entity.getGenre());
                assertNotNull(entity.getGenre().getGenreSelf());
                assertFalse(entity.getGenre().getGenreSelfList().size() > 0);
            }
        }
        // ## Act & Assert {setupSelect_All} ##
        {
            final LdBookCB cb = (LdBookCB) getBehaviorReadable().newConditionBean();
            cb.setupSelect_Author();
            cb.setupSelect_Publisher();
            cb.setupSelect_Genre().withGenreSelf();
            final List<LdBook> ls = getMyBhv().selectList(cb);
            assertListNotEmtpy(ls);
            assertEquals(countAll, ls.size());
            for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                assertNotNull(entity.getAuthor());
                assertNotNull(entity.getPublisher());
                if (entity.getGenreCode() != null) {
                    assertNotNull(entity.getGenre());
                    if (entity.getGenre().getParentGenreCode() != null) {
                        assertNotNull(entity.getGenre().getGenreSelf());
                        System.out.println(entity.getGenre().getGenreSelf());
                    } else {
                        assertNull(entity.getGenre().getGenreSelf());
                    }
                }
                assertFalse(entity.getCollectionList().size() > 0);
                assertNotNull(entity.getCollectionList());
            }
        }
    }

    // ==========================================================================================
    //                                                                      Primary Key isNotNull
    //                                                                      =====================
    public void test_primaryKey_isNull_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();
        final int allCount = getMyBhv().selectCount(new LdBookCB());
        final LdBookCB cb = getMyBhv().newMyConditionBean();
        cb.query().queryGenre().setGenreCode_IsNotNull(); // Same as Inner Join

        // ## Act ##
        final LdListResultBean<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (LdBook book : ls) {
            assertNotNull(book.getGenreCode());
        }
        assertTrue(ls.size() < allCount);
    }

    // ==========================================================================================
    //                                                                                      Query
    //                                                                                      =====
    public void test_selectList_ParentParentCondition_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();

        final LdBookCB cb = getMyBhv().newMyConditionBean();
        cb.setupSelect_Genre().withGenreSelf();
        final LdLikeSearchOption option = new LdLikeSearchOption().likeContain();
        cb.query().queryGenre().queryGenreSelf().setGenreName_LikeSearch("小説", option.likeContain());

        // ## Act ##
        final LdListResultBean<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (LdBook book : ls) {
            assertNotNull("book.getGenre() should not be null!", book.getGenre());
            assertNotNull("book.getGenre().getGenreSelf() should not be null!", book.getGenre().getGenreSelf());
            assertTrue(book.getGenre().getGenreSelf().getGenreName().contains("小説"));
        }
    }

    public void test_selectList_Equal_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Integer authorId = new Integer(3);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().setAuthorId_Equal(authorId);
        cb.query().setBookName_Equal(null);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            assertEquals(new Integer(String.valueOf(authorId)), entity.getAuthorId());
        }
    }

    public void test_selectList_Equal_at_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Integer authorId = new Integer(3);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.query().queryAuthor().setAuthorId_Equal(authorId);
        cb.query().queryAuthor().setAuthorName_Equal(null);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            assertEquals(authorId, entity.getAuthor().getAuthorId());
        }
    }

    public void test_selectList_NotEqual_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final int countAll = getMyBhv().getCountAll();
        final LdBookCB arrangeCB = new LdBookCB();
        arrangeCB.query().setBookId_Equal(3);
        final LdBook arrangeEntity = getMyBhv().selectEntityWithDeletedCheck(arrangeCB);
        final String bookName = arrangeEntity.getBookName();

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_NotEqual(bookName);
        cb.query().setUUser_NotEqual(null);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        assertEquals(countAll - 1, ls.size());
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            assertNotSame(bookName, entity.getBookName());
        }
    }

    /**
     * Test selectList_NotEqual_at_ForeignTable_Tx.
     */
    public void test_selectList_NotEqual_at_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final LdPublisherCB arrangeCB = new LdPublisherCB();
        arrangeCB.query().setPublisherId_Equal(3);
        final LdPublisherBhv publisherBhv = getBehaviorSelector().select(LdPublisherBhv.class);
        final LdPublisher publisher = publisherBhv.selectEntityWithDeletedCheck(arrangeCB);
        final String publisherName = publisher.getPublisherName();

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Publisher();
        cb.query().queryPublisher().setPublisherName_NotEqual(publisherName);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            assertNotSame(publisherName, entity.getPublisher().getPublisherName());
        }
    }

    public void test_selectList_GreaterThan_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Timestamp updDate = new Timestamp(0);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().setUTimestamp_GreaterThan(updDate);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        // for (final Iterator ite = ls.iterator(); ite.hasNext();) {
        // final LdBook entity = (LdBook) ite.next();
        // assertNotSame(publisherId, entity.getPublisherId());
        // }
    }

    public void test_selectList_FromTo_Plain_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Timestamp fromDate = new Timestamp(10000);
        final Timestamp toDate = new Timestamp(System.currentTimeMillis());

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        final LdFromToOption option = new LdFromToOption();
        cb.query().setUTimestamp_FromTo(fromDate, toDate, option);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            final Timestamp uTime = entity.getUTimestamp();
            if (uTime.before(fromDate)) {
                fail();
            }
            if (uTime.after(toDate)) {
                fail();
            }
        }
    }

    public void test_selectList_FromTo_DateOnlyCompare_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Timestamp fromDate = new Timestamp(10000);
        final Timestamp toDate = new Timestamp(System.currentTimeMillis());
        System.out.println(toDate);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        final LdFromToOption compareAsDate = new LdFromToOption().compareAsDate();
        cb.query().setRTimestamp_FromTo(fromDate, toDate, compareAsDate);
        cb.query().setUTimestamp_FromTo(fromDate, toDate, compareAsDate);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            final Timestamp uTime = entity.getUTimestamp();
            if (uTime.before(fromDate)) {
                fail();
            }
            if (uTime.after(toDate)) {
                fail();
            }
        }
    }

    public void test_selectList_FromTo_FromNull_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Timestamp fromDate = null;
        final Timestamp toDate = new Timestamp(System.currentTimeMillis());

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        final LdFromToOption option = new LdFromToOption();
        cb.query().setUTimestamp_FromTo(fromDate, toDate, option);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            final Timestamp uTime = entity.getUTimestamp();
            if (uTime.after(toDate)) {
                fail();
            }
        }
    }

    public void test_selectList_DateFromTo_SameAsDateOnlyCompare_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Timestamp fromDate = new Timestamp(10000);
        final Timestamp toDate = new Timestamp(System.currentTimeMillis());
        System.out.println(toDate);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        final LdFromToOption compareAsDate = new LdDateFromToOption();
        cb.query().setRTimestamp_FromTo(fromDate, toDate, compareAsDate);
        cb.query().setUTimestamp_FromTo(fromDate, toDate, compareAsDate);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            final Timestamp uTime = entity.getUTimestamp();
            if (uTime.before(fromDate)) {
                fail();
            }
            if (uTime.after(toDate)) {
                fail();
            }
        }
    }

    /**
     * test_selectList_PrefixSearch_at_MyTable_Tx.
     */
    public void test_selectList_PrefixSearch_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final String prefix = "S2Dao";

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_PrefixSearch(prefix);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            final String bookName = entity.getBookName();
            if (!bookName.startsWith(prefix)) {
                fail("The book name must start with '" + prefix + "': " + bookName);
            }
        }
    }

    public void test_selectList_Equal_with_BindVariable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Integer authorId = new Integer(3);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().setAuthorId_Equal(authorId);
        cb.query().setBookName_Equal("bookName");
        _log.debug(cb);
        final List<LdBook> ls = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListEmtpy(ls);
    }

    public void test_selectList_Equal_without_BindVariable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Integer authorId = new Integer(3);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        final LdColumnInfo bookName = LdBookDbm.getInstance().columnBookName();
        cb.addWhereClauseSimpleFilter(new WhereClauseToEmbeddedQuotedSimpleFilter(bookName));
        final LdColumnInfo columnAuthorId = LdBookDbm.getInstance().columnAuthorId();
        cb.addWhereClauseSimpleFilter(new WhereClauseToEmbeddedSimpleFilter(columnAuthorId));
        cb.query().setAuthorId_Equal(authorId);
        cb.query().setBookName_Equal("bookName");// Non bind

        // ## Assert ##
        _log.debug(cb);
        assertTrue(cb.getSqlClause().getClauseFromWhereWithUnionTemplate().contains("/*$"));
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListEmtpy(ls);
    }

    // ==========================================================================================
    //                                                                                   Argument
    //                                                                                   ========
    public void test_ConditionBean_SameValueRegistration_Tx() {
        final LdBookCB cb = new LdBookCB();
        final Integer bookId = 1;
        final Integer bookId2 = 2;
        final String bookName = "aaa";
        final String bookName2 = "bbb";
        cb.query().setBookId_Equal(bookId);
        assertEquals(bookId, cb.query().getBookId().getEqual());
        cb.query().setBookId_Equal(bookId);// Expect that this does not throw the exception.
        assertEquals(bookId, cb.query().getBookId().getEqual());
        cb.query().setBookId_Equal(bookId2);// Expect that this override.
        assertEquals(bookId2, cb.query().getBookId().getEqual());
        cb.query().setBookName_NotEqual(bookName);
        assertEquals(bookName, cb.query().getBookName().getNotEqual());
        cb.query().setBookName_NotEqual(bookName);// Expect that this does not throw the exception.
        assertEquals(bookName, cb.query().getBookName().getNotEqual());
        cb.query().setBookName_NotEqual(bookName2);// Expect that this override.
        assertEquals(bookName2, cb.query().getBookName().getNotEqual());
        assertFalse(cb.toDisplaySql().contains(bookName));
        assertTrue(cb.toDisplaySql().contains(bookName2));
        getMyBhv().selectList(cb);// Expect that this does not throw the exception.
    }

    public void test_ConditionBean_fetchPage_Argument_is_Minus_or_Zero_Tx() {
        final LdBookCB cb = new LdBookCB();
        cb.fetchFirst(20);
        cb.fetchPage(-1);
        assertEquals(1, cb.getSqlClause().getFetchPageNumber());
        cb.fetchPage(0);
        assertEquals(1, cb.getSqlClause().getFetchPageNumber());
    }

    public void test_ConditionBean_paging_Tx() {
        // ## Arrange ##
        final Set<String> markSet = new HashSet<String>();
        final LdBookCB cb = new LdBookCB() {
            @Override
            public LdPagingBean fetchFirst(int fetchSize) {
                assertEquals(20, fetchSize);
                markSet.add("fetchFirst");
                return super.fetchFirst(fetchSize);
            }

            @Override
            public LdPagingBean fetchPage(int fetchPageNumber) {
                assertEquals(3, fetchPageNumber);
                markSet.add("fetchPage");
                return super.fetchPage(fetchPageNumber);
            }
        };

        // ## Act & Assert ##
        assertFalse(markSet.contains("fetchFirst"));
        assertFalse(markSet.contains("fetchPage"));
        cb.paging(20, 3);
        assertTrue(markSet.contains("fetchFirst"));
        assertTrue(markSet.contains("fetchPage"));
    }

    // ==========================================================================================
    //                                                                           Statement Config
    //                                                                           ================
    public void test_configure_statementConfig_ExecuteOK_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();
        final LdBookCB cb = new LdBookCB();
        final LdStatementConfig statementConfig = new LdStatementConfig();
        statementConfig.typeForwardOnly().queryTimeout(7).fetchSize(4).maxRows(3);
        cb.configure(statementConfig);

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);// Expect no exception!

        // ## Assert ##
        assertListNotEmtpy(bookList);
    }

    public void test_configure_statementConfig_maxRows_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();
        final LdBookCB cb = new LdBookCB();
        final LdStatementConfig statementConfig = new LdStatementConfig();
        statementConfig.maxRows(3);
        cb.configure(statementConfig);

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);// Expect no exception!

        // ## Assert ##
        assertListNotEmtpy(bookList);
        assertTrue(getMyBhv().getCountAll() > 3);
        assertEquals(3, bookList.size());
    }

    // ==========================================================================================
    //                                                                                 Format SQL
    //                                                                                 ==========
    public void test_formatSql_NormalExecution_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.setupSelect_Genre().withGenreSelf();
        cb.query().queryGenre().setParentGenreCode_IsNotNull();
        LdLikeSearchOption likeSearchOption = new LdLikeSearchOption().likeContain();
        cb.query().setBookName_LikeSearch("S2Dao", likeSearchOption);
        cb.query().setOpeningPart_LikeSearch("な", likeSearchOption);
        ;
        cb.query().queryPublisher().addOrderBy_PublisherName_Desc();
        cb.query().addOrderBy_BookId_Asc();

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);// Expect no exception!

        // ## Assert ##
        assertListNotEmtpy(bookList);
    }

    public void test_formatSql_inline_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.setupSelect_Genre().withGenreSelf();
        cb.query().queryGenre().setParentGenreCode_IsNotNull();
        LdLikeSearchOption likeSearchOption = new LdLikeSearchOption().likeContain();
        cb.query().setBookName_LikeSearch("S2Dao", likeSearchOption);
        cb.query().queryAuthor().inline().setAuthorAge_GreaterEqual(15);
        cb.query().queryPublisher().addOrderBy_PublisherName_Desc();
        cb.query().addOrderBy_BookId_Asc();

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);// Expect no exception!

        // ## Assert ##
        assertListNotEmtpy(bookList);
    }

    public void test_formatSql_lockForUpdate_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookId_Equal(3);
        cb.lockForUpdate();

        // ## Act ##
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);// Expect no exception!

        // ## Assert ##
        assertListNotEmtpy(bookList);
    }

    // ==========================================================================================
    //                                                                                Display SQL
    //                                                                                ===========
    public void test_toDisplaySql_Basic_Tx() throws Exception {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.query().setBookId_Equal(1);
        cb.query().setBookName_LikeSearch("S2Dao", new LdLikeSearchOption().likePrefix().escapeByAtMark());
        cb.addOrderBy_PK_Asc();
        cb.lockForUpdate();

        // ## Act ##
        final String displaySql = cb.toDisplaySql();

        // ## Assert ##
        final StringBuilder sb = new StringBuilder();
        sb.append("{SQL}" + getLineSeparator());
        sb.append("*******************************************").append(getLineSeparator());
        final int fromIndex = displaySql.indexOf(" from ");
        sb.append("  " + displaySql.substring(0, fromIndex) + getLineSeparator());
        sb.append("   " + displaySql.substring(fromIndex));
        sb.append(getLineSeparator());
        sb.append("*******************************************");
        _log.debug(sb);
        assertTrue(displaySql.contains(LdBookDbm.getInstance().columnMaxLendingDateCount().getColumnDbName()));
        assertTrue(displaySql.contains("1"));
        assertTrue(displaySql.contains("S2Dao"));
        assertTrue(displaySql.contains("for update"));
        assertTrue(displaySql.contains(" order by "));
    }

    public void test_toDisplaySql_limitSelect_PKOnly_Tx() throws Exception {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.specify().columnBookId();
        cb.query().setBookId_LessEqual(456);
        cb.query().setBookName_PrefixSearch("limitSelect_PKOnly");
        cb.query().addOrderBy_AuthorId_Desc().addOrderBy_GenreCode_Asc();

        // ## Act ##
        final String displaySql = cb.toDisplaySql();

        // ## Assert ##
        final StringBuilder sb = new StringBuilder();
        sb.append("{SQL}" + getLineSeparator());
        sb.append("*******************************************").append(getLineSeparator());
        final int fromIndex = displaySql.indexOf(" from ");
        sb.append("  " + displaySql.substring(0, fromIndex) + getLineSeparator());
        sb.append("   " + displaySql.substring(fromIndex));
        sb.append(getLineSeparator());
        sb.append("*******************************************");
        _log.debug(sb);
        assertFalse(displaySql.contains(LdBookDbm.getInstance().columnMaxLendingDateCount().getColumnDbName()));
        assertTrue(displaySql.contains("456"));
        assertTrue(displaySql.contains("limitSelect_PKOnly"));
        assertTrue(displaySql.contains(" order by "));
    }

    public void test_toDisplaySql_ExistsSubQuery_Tx() throws Exception {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.specify().columnBookId();
        cb.query().setBookName_PrefixSearch("ExistsSubQuery");
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().setArrivalDate_Equal(new Timestamp(System.currentTimeMillis()));
            }
        });
        cb.query().addOrderBy_AuthorId_Desc().addOrderBy_GenreCode_Asc();

        // ## Act ##
        final String displaySql = cb.toDisplaySql();

        // ## Assert ##
        final StringBuilder sb = new StringBuilder();
        sb.append("{SQL}" + getLineSeparator());
        sb.append("*******************************************").append(getLineSeparator());
        final int fromIndex = displaySql.indexOf(" from ");
        sb.append("  " + displaySql.substring(0, fromIndex) + getLineSeparator());
        sb.append("   " + displaySql.substring(fromIndex));
        sb.append(getLineSeparator());
        sb.append("*******************************************");
        _log.debug(sb);
        assertTrue(displaySql.contains(" exists "));
        assertTrue(displaySql.contains("ExistsSubQuery"));
    }

    // ==========================================================================================
    //                                                                          Exception Message
    //                                                                          =================
    public void test_fetchPage_without_fetchFirst_Tx() throws Exception {
        LdBookCB cb = new LdBookCB();
        try {
            cb.fetchPage(3);
            fail();
        } catch (IllegalStateException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }
}

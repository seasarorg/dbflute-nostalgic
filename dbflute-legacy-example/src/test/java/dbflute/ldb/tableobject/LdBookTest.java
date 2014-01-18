package dbflute.ldb.tableobject;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.extension.dataset.DataRow;
import org.seasar.framework.exception.EmptyRuntimeException;
import org.seasar.framework.exception.SQLRuntimeException;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsbhv.LdBsBookBhv.ReffererConditionCollectionList;
import dbflute.ldb.bsentity.dbmeta.LdAuthorDbm;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;
import dbflute.ldb.bsentity.dbmeta.LdCollectionDbm;
import dbflute.ldb.bsentity.dbmeta.LdCollectionStatusDbm;
import dbflute.ldb.bsentity.dbmeta.LdCollectionStatusLookupDbm;
import dbflute.ldb.bsentity.dbmeta.LdGenreDbm;
import dbflute.ldb.bsentity.dbmeta.LdLibraryDbm;
import dbflute.ldb.bsentity.dbmeta.LdPublisherDbm;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.cbean.LdCollectionCB;
import dbflute.ldb.cbean.LdCollectionStatusCB;
import dbflute.ldb.exbhv.LdBookBhv;
import dbflute.ldb.exbhv.LdCollectionBhv;
import dbflute.ldb.exdao.LdBookDao;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.exentity.LdCollection;
import dbflute.ldb.exentity.LdGenre;

/**
 * Test of BsBookDao
 * 
 * @author kubo
 */
public class LdBookTest extends LdLdbTableObjectDbTestCase {

    private static final Log _log = LogFactory.getLog(LdBookTest.class);
    
    /** Help object instance. */
    protected final MyHelpObject _help = this.new MyHelpObjectImpl();

    protected LdDBMeta getDBMeta() {
        return LdBookDbm.getInstance();
    }

    public void test_dynamic_Tx() {
        _help.registerMyTableWithAll();
        
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_PrefixSearch("foo");
        final LdCollectionCB subCB = new LdCollectionCB();
        {
            subCB.query().queryLibrary().setLibraryName_PrefixSearch("bar");
            LdCollectionStatusCB subsubCB = new LdCollectionStatusCB();
            {
                subsubCB.query().setCollectionStatusCode_Equal("qux");
                subCB.query().setCollectionId_InScopeSubQuery_CollectionStatusList(subsubCB.query());
            }
        }
        cb.query().setBookId_InScopeSubQuery_CollectionList(subCB.query());
        LdBookBhv bookBhv = (LdBookBhv) getMyRBhv();
        LdListResultBean<LdBook> bookList = bookBhv.selectListTx(cb);
        for (LdBook book : bookList.getSelectedList()) {
            _log.debug(book);
        }
    }

    // ==========================================================================================
    //                                                                                 Dao Common
    //                                                                                 ==========

    public void test_insert_Basic_Tx() {
        doTest_create(_help);
        doTest_insert(_help);
    }

    public void test_update_Basic_Tx() {
        doTest_modify(_help);
        doTest_update(_help);
    }

    public void test_delete_Basic_Tx() {
        doTest_remove(_help);
        doTest_delete(_help);
    }

    public void test_selectXxx_ByPK_Basic_Tx() {
        doTest_selectEntity_ByPK(_help);
        doTest_selectList_ByPK(_help);
    }

    public void test_selectXxx_OrderBy_Basic_Tx() {
        doTest_selectEntity_addOrderBy_PK_Asc(_help);
        doTest_selectList_addOrderBy_PK_Asc(_help);
        doTest_selectEntity_addOrderBy_PK_Desc(_help);
        doTest_selectList_addOrderBy_PK_Desc(_help);
    }

    public void test_selectXxx_FetchXxx_Basic_Tx() {
        doTest_selectEntity_fetchFirst_One(_help);
        doTest_selectList_fetchFirst_One(_help);
        doTest_selectCountIgnoreFetchScope_fetchScope_OneThree(_help);
        doTest_selectEntity_fetchScope_OneThree(_help);
        doTest_selectList_fetchScope_OneThree(_help);
        doTest_selectList_fetchPage_OneTwo(_help);
    }

    public void test_update_TimestampConcurrencyControl_Tx() {
        doTest_modify_TimestampConcurrencyControl(_help);
        doTest_update_TimestampConcurrencyControl(_help);
    }

    // ==========================================================================================
    //                                                                                 Bhv Common
    //                                                                                 ==========

    public void test_selectPage_Tx() {
        doTest_selectPageTx(_help);
    }

    public void test_createOrModifyAfterSelectForUpdate_Tx() {
        doTest_createOrModifyAfterSelectForUpdateTx(_help);
    }

    public void test_insertOrUpdateAfterSelectForUpdate_Tx() {
        doTest_insertOrUpdateAfterSelectForUpdateTx(_help);
    }

    public void test_modifyAfterSelectForUpdate_Tx() {
        doTest_modifyAfterSelectForUpdateTx(_help);
    }

    public void test_updateAfterSelectForUpdateTx() {
        doTest_updateAfterSelectForUpdateTx(_help);
    }

    // ==========================================================================================
    //                                                                                 Bhv Detail
    //                                                                                 ==========

    public void test_Bhv_LoadRefferer_Tx() {
        _help.replaceMyTableWithAll();

        final LdBookBhv bhv = (LdBookBhv) getRBhv(LdBookBhv.class);
        final LdBookCB cb = (LdBookCB) getDBMeta().newConditionBean();

        {
            final List<LdBook> ls = bhv.delegateSelectListTx(cb);
            bhv.loadCollectionList(ls);

            final LdCollectionBhv reffererBhv = (LdCollectionBhv) getRBhv(LdCollectionBhv.class);
            for (Object object : ls) {
                final LdBook entity = (LdBook) object;
                final List<LdCollection> colList = entity.getCollectionList();
                assertNotNull(colList);

                final LdCollectionCB reffererCB = reffererBhv.newMyConditionBean();
                reffererCB.query().setBookId_Equal(entity.getBookId());
                reffererCB.query().addOrderBy_CollectionId_Asc();
                assertEquals(reffererBhv.delegateSelectListTx(reffererCB), colList);
                
                for (LdCollection collection : colList) {
                    assertNotNull(collection.getBook());
                }
            }
        }
        {
            final List<LdBook> ls = bhv.delegateSelectListTx(cb);
            final ReffererConditionCollectionList reffererOrderBy = new ReffererConditionCollectionList() {
                public void setup(LdCollectionCB cb) {
                    cb.query().addOrderBy_ArrivalDate_Desc();
                }
            };
            bhv.loadCollectionList(ls, reffererOrderBy);

            final LdCollectionBhv reffererBhv = (LdCollectionBhv) getRBhv(LdCollectionBhv.class);
            for (Object object : ls) {
                final LdBook entity = (LdBook) object;
                final List<LdCollection> colList = entity.getCollectionList();
                assertNotNull(colList);

                final LdCollectionCB reffererCB = reffererBhv.newMyConditionBean();
                reffererCB.query().setBookId_Equal(entity.getBookId());
                reffererCB.query().addOrderBy_ArrivalDate_Desc();
                assertEquals(reffererBhv.delegateSelectListTx(reffererCB), colList);
                
                for (LdCollection collection : colList) {
                    assertNotNull(collection.getBook());
                }
            }
        }
        {
            final List<LdBook> ls = bhv.delegateSelectListTx(cb);
            final ReffererConditionCollectionList reffererOrderBy = new ReffererConditionCollectionList() {
                public void setup(LdCollectionCB cb) {
                    cb.query().queryCollectionStatusAsOne().addOrderBy_CollectionStatusCode_Desc();
                }
            };
            bhv.loadCollectionList(ls, reffererOrderBy);

            final LdCollectionBhv reffererBhv = (LdCollectionBhv) getRBhv(LdCollectionBhv.class);
            for (Object object : ls) {
                final LdBook entity = (LdBook) object;
                final List<LdCollection> colList = entity.getCollectionList();
                assertNotNull(colList);

                final LdCollectionCB reffererCB = reffererBhv.newMyConditionBean();
                reffererCB.query().setBookId_Equal(entity.getBookId());
                reffererCB.query().queryCollectionStatusAsOne().addOrderBy_CollectionStatusCode_Desc();
                assertEquals(reffererBhv.delegateSelectListTx(reffererCB), colList);
                
                for (LdCollection collection : colList) {
                    assertNotNull(collection.getBook());
                }
            }
        }
    }

    public void test_updateAfterSelectForUpdate_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();

        {
            final String bookName = "test_updateAfterSelectForUpdate()";
            LdEntity expectedEntity = null;
            {
                // ## Arrange ##
                final LdBook entity = new LdBook();
                final LdConditionBean cb = getDBMeta().newConditionBean();
                cb.fetchFirst(1);
                expectedEntity = getMyRBhv().delegateReadEntityTx(cb);
                entity.acceptPrimaryKeyMapString(expectedEntity.extractPrimaryKeyMapString());
                entity.setBookName(bookName);

                // ## Act ##
                final int updatedCount = ((LdBookBhv) getMyWBhv()).updateAfterSelectForUpdateTx(entity);
                assertEquals(1, updatedCount);
            }

            // ## Assert ##
            final String primaryKeyMapString = expectedEntity.extractPrimaryKeyMapString();
            final LdConditionBean cb = getDBMeta().newConditionBean().acceptPrimaryKeyMapString(primaryKeyMapString);
            final LdEntity actualEntity = getMyRBhv().delegateReadEntityTx(cb);
            ((LdBook) expectedEntity).setBookName(bookName);
            _help.assertMyEntity(expectedEntity, actualEntity);
        }
        {
            final BigDecimal maxLendingDateCount = new BigDecimal(999);
            LdEntity expectedEntity = null;
            {
                // ## Arrange ##
                final LdBook entity = new LdBook();
                final LdConditionBean cb = getDBMeta().newConditionBean();
                cb.fetchScope(3, 1);
                expectedEntity = getMyRBhv().delegateReadEntityTx(cb);
                entity.acceptPrimaryKeyMapString(expectedEntity.extractPrimaryKeyMapString());
                entity.setMaxLendingDateCount(maxLendingDateCount);

                // ## Act ##
                final int updatedCount = ((LdBookBhv) getMyWBhv()).updateAfterSelectForUpdateTx(entity);
                assertEquals(1, updatedCount);
            }

            // ## Assert ##
            final String primaryKeyMapString = expectedEntity.extractPrimaryKeyMapString();
            final LdConditionBean cb = getDBMeta().newConditionBean().acceptPrimaryKeyMapString(primaryKeyMapString);
            final LdEntity actualEntity = getMyRBhv().delegateReadEntityTx(cb);
            ((LdBook) expectedEntity).setMaxLendingDateCount(maxLendingDateCount);
            _help.assertMyEntity(expectedEntity, actualEntity);
        }
    }

    // ==========================================================================================
    //                                                                                     DBMeta
    //                                                                                     ======
    public void test_DBMeta_TypeAndInstanceGetter_Tx() {
        doTest_DBMeta_TypeAndInstanceGetter(new LdBook());
    }

    // ==========================================================================================
    //                                                                                     Entity
    //                                                                                     ======

    public void test_Entity_extractAcceptPrimaryKeyMap_Tx() {
        {
            final List ls = _help.getMyEntityList_BeforeInsert();
            for (Object object : ls) {
                final LdBook entity = (LdBook) object;
                entity.setBookId(new BigDecimal(99999999));
                final LdBookCB cb = new LdBookCB();
                cb.acceptPrimaryKeyMapString(entity.extractPrimaryKeyMapString());
                assertEquals(entity.getBookId(), cb.query().getBookId().getEqual());
            }
        }
        {
            final List ls = _help.getMyEntityList_BeforeInsert();
            for (Object object : ls) {
                final LdBook entity = (LdBook) object;
                entity.setBookId(new BigDecimal(99999999));
                final LdBook acceptEntity = new LdBook();
                acceptEntity.acceptPrimaryKeyMapString(entity.extractPrimaryKeyMapString());
                assertEquals(entity.getBookId(), acceptEntity.getBookId());
            }
        }
    }

    public void test_Entity_extractAcceptColumnValueMap_Tx() {
        final List ls = _help.getMyEntityList_BeforeInsert();

        for (final Object object : ls) {
            final LdBook entity = (LdBook) object;
            final LdBook acceptEntity = new LdBook();
            acceptEntity.acceptColumnValueMapString(entity.extractColumnValueMapString());
            _help.assertMyEntity(entity, acceptEntity);
        }
        for (final Object object : ls) {
            final LdBook entity = (LdBook) object;
            final LdBook acceptEntity = new LdBook();
            String mapString = entity.extractColumnValueMapString();
            final String prefix = LdBook.MAP_STRING_MAP_MARK + LdBook.MAP_STRING_START_BRACE;
            if (!mapString.startsWith(prefix)) {
                fail("entity.extractColumnValueMapString() should start with " + prefix + " actual=" + mapString);
            }
            mapString = mapString.substring((LdBook.MAP_STRING_MAP_MARK + LdBook.MAP_STRING_START_BRACE).length());

            final String suffix = LdBook.MAP_STRING_END_BRACE;
            if (!mapString.endsWith(suffix)) {
                fail("entity.extractColumnValueMapString() should end with " + suffix + " actual=" + mapString);
            }
            mapString = mapString.substring(0, mapString.length() - LdBook.MAP_STRING_END_BRACE.length());
            acceptEntity.acceptColumnValueMapString(mapString);
            _help.assertMyEntity(entity, acceptEntity);
        }
    }

    public void test_Entity_toString_Tx() {
        // Assert not throwing excetpion.
        final String toString = getDBMeta().newEntity().toString();
        assertNotNull(toString);
        _log.debug(toString);
    }

    // ==========================================================================================
    //                                                                              ConditionBean
    //                                                                              =============

    public void test_ConditionBean_SameValueRegistration_Tx() {
        final LdBookCB cb = new LdBookCB();
        final BigDecimal bookId = new BigDecimal(1);
        cb.query().setBookId_Equal(bookId);
        cb.query().setBookId_Equal(bookId);// Expect that this does not throw the exception.
        cb.query().setBookId_NotEqual(bookId);
        cb.query().setBookId_NotEqual(bookId);// Expect that this does not throw the exception.
        final LdBookDao dao = (LdBookDao) getMyRDao();
        dao.selectList(cb);// Expect that this does not throw the exception.
    }

    public void test_ConditionBean_ArgumentNull_Tx() {
        final LdBookDao dao = (LdBookDao) getMyRDao();
        try {
            dao.selectList(null);
            fail("If the argument of condition-bean is null, this method should throw the exception: "
                    + EmptyRuntimeException.class);
        } catch (EmptyRuntimeException e) {
            // OK!
        }
    }

    public void test_ConditionBean_IncludeAsMine_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Genre();
        cb.query().setGenreCode_IsNotNull();
        cb.query().queryGenre().queryGenreSelf().includeAsMine_GenreName("parentGenreName");
        final LdBookDao dao = (LdBookDao) getMyRDao();
        final List<LdBook> ls = dao.selectList(cb);
        assertListEmtpy(ls);

        // ## Assert ##
        for (final LdBook entity : ls) {
            final LdGenre genreEntity = entity.getGenre();
            final String genreName = genreEntity.getGenreName();
            final String actualOne = entity.getParentGenreName();
            _log.debug(entity.getBookName() + " : " + genreName + " : " + actualOne);

            final LdGenre parentGenreEntity = genreEntity.getGenreSelf();
            if (parentGenreEntity == null) {
                assertNull(actualOne);
            } else {
                final String expectedOne = parentGenreEntity.getGenreName();
                assertEquals(expectedOne, actualOne);
            }
        }
    }

    public void test_ConditionBean_IncludeAsMine_Exception_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();

        // ## Act & Assert ##
        final LdBookCB cb = new LdBookCB();
        try {
            cb.query().includeAsMine_AuthorId(null);
            fail("If the argument of includeAsMine_AuthorId() is null, thrown the exception!!!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            cb.query().includeAsMine_AuthorId("");
            fail("If the argument of includeAsMine_AuthorId() is empty-string, thrown the exception!!!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            cb.query().includeAsMine_AuthorId("   ");
            fail("If the argument of includeAsMine_AuthorId() is blank-space, thrown the exception!!!");
        } catch (IllegalArgumentException e) {
            // OK
        }
        try {
            cb.query().includeAsMine_AuthorId("AUTHOR, SSS");
            fail("If the argument of includeAsMine_AuthorId() contains comma, thrown the exception!!!");
        } catch (IllegalArgumentException e) {
            // OK
        }
    }

    // ==========================================================================================
    //                                                                               Limit Select
    //                                                                               ============
    public void test_selectList_limitSelect_Tx() {
        doTest_CB_limitSetup_PKOnly_and_Off(_help);
    }

    // ==========================================================================================
    //                                                                               Setup Select
    //                                                                               ============
    public void test_selectList_setupSelect_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final LdBookDao dao = (LdBookDao) getMyRDao();
        
        // ## Act & Assert {setupSelect_Non} ##
        {
            final LdBookCB cb = (LdBookCB) getDBMeta().newConditionBean();
            final List ls = dao.selectList(cb);
            assertEquals(dao.getCountAll(), ls.size());
            for (final Iterator ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                assertNull(entity.getAuthor());
                assertNull(entity.getPublisher());
                assertNull(entity.getCollectionList());
            }
        }
        // ## Act & Assert {setupSelect_Author} ##
        {
            final LdBookCB cb = (LdBookCB) getDBMeta().newConditionBean();
            cb.setupSelect_Author();
            final List ls = dao.selectList(cb);
            assertEquals(dao.getCountAll(), ls.size());
            for (final Iterator ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                assertNotNull(entity.getAuthor());
                assertNull(entity.getPublisher());
                assertNull(entity.getCollectionList());
            }
        }
        // ## Act & Assert {setupSelect_Publisher} ##
        {
            final LdBookCB cb = (LdBookCB) getDBMeta().newConditionBean();
            cb.setupSelect_Publisher();
            final List ls = dao.selectList(cb);
            assertEquals(dao.getCountAll(), ls.size());
            for (final Iterator ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                assertNull(entity.getAuthor());
                assertNotNull(entity.getPublisher());
                assertNull(entity.getCollectionList());
            }
        }
        // ## Act & Assert {setupSelect_All} ##
        {
            final LdBookCB cb = (LdBookCB) getDBMeta().newConditionBean();
            cb.setupSelect_Author().setupSelect_Publisher();
            final List ls = dao.selectList(cb);
            assertEquals(dao.getCountAll(), ls.size());
            for (final Iterator ite = ls.iterator(); ite.hasNext();) {
                final LdBook entity = (LdBook) ite.next();
                assertNotNull(entity.getAuthor());
                assertNotNull(entity.getPublisher());
                assertNull(entity.getCollectionList());
            }
        }
    }

    public void test_selectList_Equal_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final long authorId = 3;

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().setAuthorId_Equal(authorId);
        cb.query().setBookName_Equal(null);
        final List ls = ((LdBookBhv) getMyRBhv()).delegateSelectListTx(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            assertEquals(new BigDecimal(String.valueOf(authorId)), entity.getAuthorId());
        }
    }

    public void test_selectList_Equal_at_ForeignTable() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final BigDecimal authorId = new BigDecimal(3);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().queryAuthor().setAuthorId_Equal(authorId);
        cb.query().queryAuthor().setAuthorName_Equal(null);
        final List ls = ((LdBookBhv) getMyRBhv()).delegateSelectListTx(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            assertEquals(authorId, entity.getAuthor().getAuthorId());
        }
    }

    public void test_selectList_NotEqual_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final BigDecimal publisherId = new BigDecimal(3);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().setPublisherId_NotEqual(publisherId);
        cb.query().setBookName_NotEqual(null);
        final List ls = ((LdBookBhv) getMyRBhv()).delegateSelectListTx(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            assertNotSame(publisherId, entity.getPublisherId());
        }
    }

    /**
     * Test selectList_NotEqual_at_ForeignTable_Tx.
     */
    public void test_selectList_NotEqual_at_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final long publisherId = 3;

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().queryPublisher().setPublisherId_NotEqual(publisherId);
        final List ls = ((LdBookBhv) getMyRBhv()).delegateSelectListTx(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            assertNotSame(new BigDecimal(String.valueOf(publisherId)), entity.getPublisher().getPublisherId());
        }
    }

    public void test_selectList_GreaterThan_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Timestamp updDate = new Timestamp(0);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().setUTime_GreaterThan(updDate);
        final List ls = ((LdBookBhv) getMyRBhv()).delegateSelectListTx(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        // for (final Iterator ite = ls.iterator(); ite.hasNext();) {
        // final LdBook entity = (LdBook) ite.next();
        // assertNotSame(publisherId, entity.getPublisherId());
        // }
    }

    /**
     * Test selectList_InScope_at_ForeignTable_Tx.
     */
    public void test_selectList_InScope_at_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final BigDecimal publisherId = new BigDecimal(3);
        final BigDecimal nonExistPublisherId = new BigDecimal(9999);
        final List<BigDecimal> publisherIdList = new ArrayList<BigDecimal>();
        publisherIdList.add(publisherId);
        publisherIdList.add(nonExistPublisherId);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().queryPublisher().setPublisherId_InScope(publisherIdList);
        final List ls = ((LdBookBhv) getMyRBhv()).delegateSelectListTx(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            assertNotSame(new BigDecimal(String.valueOf(publisherId)), entity.getPublisher().getPublisherId());
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
        final List ls = ((LdBookBhv) getMyRBhv()).delegateSelectListTx(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            final String bookName = entity.getBookName();
            if (!bookName.startsWith(prefix)) {
                fail("The book name must start with '" + prefix + "': " + bookName);
            }
        }
    }

    /**
     * test_selectList_InScopeSubQuery_at_MyTable_Tx.
     */
    public void test_selectList_InScopeSubQuery_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final String bookNamePrefix = "S2Dao";
        final String libraryNamePrefix = "中目";
        final String statusCodeNormal = "NOR";

        // ## Act ##
        // select BOOK.book_id
        //       , BOOK.author_id
        //       , BOOK.publisher_id
        //       , BOOK.book_name
        //       , BOOK.max_lending_date_count
        //       , BOOK.u_time
        //       , BOOK.isbn_no
        //       , BOOK.genre_code
        //       , BOOK.opening_part
        //       , BOOK.r_time
        //       , BOOK.r_staff
        //       , BOOK.u_staff
        //   from BOOK
        //  where BOOK.BOOK_NAME like 'S2Dao%'
        //    and BOOK.BOOK_ID in (select COLLECTION.BOOK_ID
        //                           from COLLECTION
        //                             left outer join LIBRARY Library
        //                               on COLLECTION.LIBRARY_ID = Library.LIBRARY_ID
        //                          where Library.LIBRARY_NAME like '中目%'
        //                            and COLLECTION.COLLECTION_ID in (select COLLECTION_STATUS.COLLECTION_ID
        //                                                               from COLLECTION_STATUS
        //                                                              where COLLECTION_STATUS.COLLECTION_STATUS_CODE = 'NOR'))
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_PrefixSearch(bookNamePrefix);
        final LdCollectionCB subCB = new LdCollectionCB();
        {
            subCB.query().queryLibrary().setLibraryName_PrefixSearch(libraryNamePrefix);
            LdCollectionStatusCB subsubCB = new LdCollectionStatusCB();
            {
                subsubCB.query().setCollectionStatusCode_Equal(statusCodeNormal);
                subCB.query().setCollectionId_InScopeSubQuery_CollectionStatusList(subsubCB.query());
            }
        }
        cb.query().setBookId_InScopeSubQuery_CollectionList(subCB.query());
        final List<LdBook> ls = ((LdBookBhv) getMyRBhv()).delegateSelectListTx(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final LdBook entity : ls) {
            final String bookName = entity.getBookName();
            if (!bookName.startsWith(bookNamePrefix)) {
                fail("The book name must start with '" + bookNamePrefix + "': " + bookName);
            }

            final LdCollectionBhv collectionBhv = (LdCollectionBhv) getDaoSelector().getRBhv(LdCollectionBhv.class);
            final LdCollectionCB collectionCB = new LdCollectionCB();
            collectionCB.setupSelect_Library();

            collectionCB.setupSelect_CollectionStatusAsOne();
            collectionCB.query().setBookId_Equal(entity.getBookId());
            final LdListResultBean collectionRB = collectionBhv.selectListTx(collectionCB);
            final List collectionList = collectionRB.getSelectedList();

            boolean isContainsLibraryName = false;
            boolean isContainsStatusCode = false;
            for (final Object object : collectionList) {
                final LdCollection collectionEntity = (LdCollection) object;
                final String libraryName = collectionEntity.getLibrary().getLibraryName();
                if (libraryName.startsWith(libraryNamePrefix)) {
                    isContainsLibraryName = true;
                }
                final String statusCode = collectionEntity.getCollectionStatusAsOne()
                        .getCollectionStatusCode();
                assertNotNull(statusCode);
                if (statusCode.equals(statusCodeNormal)) {
                    isContainsStatusCode = true;
                }
            }
            assertTrue(isContainsLibraryName);
            assertTrue(isContainsStatusCode);
        }
    }

    public void test_selectNextVal_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();

        for (int i = 0; i < 10; i++) {
            try {
                final BigDecimal nextVal = ((LdBookBhv) getMyRBhv()).delegateSelectNextValTx();
                fail("delegateSelectNextValTx() should throw exception because Derby has no sequence.");
                assertNotNull(nextVal);
            } catch (SQLRuntimeException e) {
                // OK
            }
        }
    }

    // ==========================================================================================
    //                                                                                     Helper
    //                                                                                     ======

    public class MyHelpObjectImpl implements MyHelpObject {

        public void deleteMyTableWithForeign() {
            deleteTable(LdBookDbm.TABLE_DB_NAME);
            deleteMyForeignTable();
        }

        public void deleteMyForeignTable() {
            deleteTable(LdAuthorDbm.TABLE_DB_NAME);
            deleteTable(LdPublisherDbm.TABLE_DB_NAME);
            deleteTable(LdGenreDbm.TABLE_DB_NAME);
        }

        public void registerMyTableWithForeign() {
            registerMyForeignTable();
            readXlsReplaceDbInEachTable(LdBookDbm.TABLE_DB_NAME);
        }

        public void registerMyForeignTable() {
            readXlsReplaceDbInEachTable(LdGenreDbm.TABLE_DB_NAME);
            readXlsReplaceDbInEachTable(LdAuthorDbm.TABLE_DB_NAME);
            readXlsReplaceDbInEachTable(LdPublisherDbm.TABLE_DB_NAME);
        }

        public void replaceMyTableWithForeign() {
            deleteMyTableWithForeign();
            registerMyTableWithForeign();
        }

        public void replaceMyForeignTable() {
            deleteMyForeignTable();
            registerMyForeignTable();
        }

        public void deleteMyTableWithAll() {
            deleteTable(LdBookDbm.TABLE_DB_NAME);
            deleteTable(LdAuthorDbm.TABLE_DB_NAME);
            deleteTable(LdPublisherDbm.TABLE_DB_NAME);
            deleteTable(LdGenreDbm.TABLE_DB_NAME);
            deleteTable(LdCollectionStatusDbm.TABLE_DB_NAME);
            deleteTable(LdCollectionStatusLookupDbm.TABLE_DB_NAME);
            deleteTable(LdCollectionDbm.TABLE_DB_NAME);
            deleteTable(LdLibraryDbm.TABLE_DB_NAME);
        }

        /**
         * This method overrides the method that is declared at super.
         */
        public void registerMyTableWithAll() {
            readXlsReplaceDbInEachTable(LdGenreDbm.TABLE_DB_NAME);
            readXlsReplaceDbInEachTable(LdAuthorDbm.TABLE_DB_NAME);
            readXlsReplaceDbInEachTable(LdPublisherDbm.TABLE_DB_NAME);
            readXlsReplaceDbInEachTable(LdBookDbm.TABLE_DB_NAME);
            readXlsReplaceDbInEachTable(LdLibraryDbm.TABLE_DB_NAME);
            readXlsReplaceDbInEachTable(LdCollectionDbm.TABLE_DB_NAME);
            readXlsReplaceDbInEachTable(LdCollectionStatusLookupDbm.TABLE_DB_NAME);
            readXlsReplaceDbInEachTable(LdCollectionStatusDbm.TABLE_DB_NAME);
        }

        /**
         * This method overrides the method that is declared at super.
         */
        public void replaceMyTableWithAll() {
            deleteMyTableWithAll();
            registerMyTableWithAll();
        }

        public List getMyEntityList_BeforeInsert() {
            final List entityList = new ArrayList();
            {
                final LdBook entity = new LdBook();
                //                entity.setBookId(new BigDecimal("9999901"));
                entity.setBookName("test_insertObj01 of " + LdBookDbm.TABLE_CAP_PROP_NAME);
                entity.setIsbnNo("X999999901");
                entity.setMaxLendingDateCount(new BigDecimal("11"));
                final String authorIdName = LdAuthorDbm.COLUMN_DB_NAME_OF_AuthorId;
                entity.setAuthorId((BigDecimal) getValue_FirstRow_Author(authorIdName));
                final String publisherIdName = LdPublisherDbm.COLUMN_DB_NAME_OF_PublisherId;
                entity.setPublisherId((BigDecimal) getValue_FirstRow_Publisher(publisherIdName));
                entity.setGenreCode("HOW-TO-BOOK");
                entity.setOpeningPart("getMyEntityList_BeforeInsert() of 9999901");
                entityList.add(entity);
            }
            {
                final LdBook entity = new LdBook();
                //                entity.setBookId(new BigDecimal("9999902"));
                entity.setBookName("test_insertObj02 of " + LdBookDbm.TABLE_CAP_PROP_NAME);
                entity.setIsbnNo("X999999902");
                entity.setMaxLendingDateCount(new BigDecimal("12"));
                final String authorIdName = LdAuthorDbm.COLUMN_DB_NAME_OF_AuthorId;
                entity.setAuthorId((BigDecimal) getValue_FirstRow_Author(authorIdName));
                final String publisherIdName = LdPublisherDbm.COLUMN_DB_NAME_OF_PublisherId;
                entity.setPublisherId((BigDecimal) getValue_FirstRow_Publisher(publisherIdName));
                entityList.add(entity);
            }
            return entityList;
        }

        public List getMyEntityList_BeforeUpdate() {
            final List entityList = new ArrayList();
            {
                final LdBookCB cb = (LdBookCB) getDBMeta().newConditionBean();
                final DataRow dataRow = getDataTable_Book().getRow(0);
                cb.query().setBookId_Equal((BigDecimal) dataRow.getValue(LdBookDbm.COLUMN_DB_NAME_OF_BookId));
                final LdBook entity = ((LdBookDao) getMyWDao()).selectEntity(cb);
                entity.setMaxLendingDateCount(new BigDecimal("11"));
                entity.setIsbnNo("X999999901");
                entity.setGenreCode("NOVEL");
                entityList.add(entity);
            }
            {
                final LdBookCB cb = (LdBookCB) getDBMeta().newConditionBean();
                final DataRow dataRow = getDataTable_Book().getRow(1);
                cb.query().setBookId_Equal((BigDecimal) dataRow.getValue(LdBookDbm.COLUMN_DB_NAME_OF_BookId));
                final LdBook entity = ((LdBookDao) getMyWDao()).selectEntity(cb);
                entity.setMaxLendingDateCount(new BigDecimal("12"));
                entity.setIsbnNo("X999999902");
                entity.setOpeningPart("getMyEntityList_BeforeUpdate() of getDataTable_Book().getRow(1)");
                entityList.add(entity);
            }
            return entityList;
        }

        public List getMyEntityList_BeforeDelete() {
            final List entityList = new ArrayList();
            {
                final LdBookCB cb = (LdBookCB) getDBMeta().newConditionBean();
                final DataRow dataRow = getDataTable_Book().getRow(0);
                cb.query().setBookId_Equal((BigDecimal) dataRow.getValue(LdBookDbm.COLUMN_DB_NAME_OF_BookId));
                entityList.add(((LdBookDao) getMyWDao()).selectEntity(cb));
            }
            {
                final LdBookCB cb = (LdBookCB) getDBMeta().newConditionBean();
                final DataRow dataRow = getDataTable_Book().getRow(1);
                cb.query().setBookId_Equal((BigDecimal) dataRow.getValue(LdBookDbm.COLUMN_DB_NAME_OF_BookId));
                entityList.add(((LdBookDao) getMyWDao()).selectEntity(cb));
            }
            return entityList;
        }

        public void assertMyEntity(LdEntity expectedEntity, LdEntity actualEntity) {
            assertNotNull("The argument[expectedEntity] must not be null.", expectedEntity);
            assertNotNull("The argument[actualEntity] must not be null.", actualEntity);

            final LdBook expected = (LdBook) expectedEntity;
            final LdBook actual = (LdBook) actualEntity;

            assertEquals(expected.getBookId(), actual.getBookId());
            assertEquals(expected.getBookName(), actual.getBookName());
            assertEquals(expected.getIsbnNo(), actual.getIsbnNo());
            assertEquals(expected.getMaxLendingDateCount(), actual.getMaxLendingDateCount());
            assertEquals(expected.getAuthorId(), actual.getAuthorId());
            assertEquals(expected.getPublisherId(), actual.getPublisherId());

            assertEquals(expected.getGenreCode(), actual.getGenreCode());
            assertEquals(expected.getOpeningPart(), actual.getOpeningPart());

            assertEquals(expected.getAuthor(), actual.getAuthor());
            assertEquals(expected.getPublisher(), actual.getPublisher());
        }

        public void assertMyParentEntityNull(LdEntity actualEntity) {
            final LdBook actual = (LdBook) actualEntity;
            {
                String msg = "Author must be null: But --> " + actual.getAuthor();
                assertNull(msg, actual.getAuthor());
            }
            {
                String msg = "Publisher must be null: But --> " + actual.getPublisher();
                assertNull(msg, actual.getPublisher());
            }
        }

        public void assertMyChildEntityNull(LdEntity actualEntity) {
            final LdBook actual = (LdBook) actualEntity;

            {
                String msg = "CollectionList must be null: But --> " + actual.getCollectionList();
                assertNull(msg, actual.getCollectionList());
            }
        }

        public Comparator getPrimaryKeyAscComparator() {
            return new Comparator() {
                public int compare(Object arg0, Object arg1) {
                    final LdBook xx = (LdBook) arg0;
                    final LdBook yy = (LdBook) arg1;
                    return xx.getBookId().compareTo(yy.getBookId());
                }
            };
        }
    }
}

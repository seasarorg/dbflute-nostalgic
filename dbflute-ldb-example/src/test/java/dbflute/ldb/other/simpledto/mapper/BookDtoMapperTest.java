package dbflute.ldb.other.simpledto.mapper;

import java.util.List;

import dbflute.ldb.allcommon.bhv.setup.LdConditionBeanSetupper;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdSubQuery;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.cbean.LdCollectionCB;
import dbflute.ldb.exbhv.LdBookBhv;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.other.simpledto.BookDto;
import dbflute.ldb.other.simpledto.CollectionDto;
import dbflute.ldb.other.simpledto.CollectionStatusDto;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class BookDtoMapperTest extends LdBookAllDbTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Help object instance. */
    protected final MyHelpObject _help = this.new MyHelpObjectImpl();

    protected LdBookBhv bookBhv;

    // ===================================================================================
    //                                                                        Basic Select
    //                                                                        ============
    // -----------------------------------------------------
    //                                         Select Entity
    //                                         -------------
    public void test_map_SingleMapping_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();
        final LdBookCB cb = new LdBookCB();
        final LdListResultBean<LdBook> bookList = bookBhv.selectList(cb);
        assertListNotEmtpy(bookList);
        
        // ## Act ##
        final BookDtoMapper mapper = new BookDtoMapper();
        final List<BookDto> bookDtoList = mapper.map(bookList);

        // ## Assert ##
        assertEquals(bookList.size(), bookDtoList.size());
        int index = 0;
        for (BookDto bookDto : bookDtoList) {
            final LdBook book = bookList.get(index);
            log(index + ": " + bookDto.getBookName() + " -- " + book.getBookName());
            assertEquals(book.getBookId(), bookDto.getBookId());
            assertEquals(book.getBookName(), bookDto.getBookName());
            assertNull(bookDto.getAuthor());
            assertNull(bookDto.getPublisher());
            assertNull(bookDto.getGenre());
            assertListEmtpy(bookDto.getCollectionList());
            ++index;
        }
    }

    public void test_map_ForeignMapping_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithForeign();
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        final LdListResultBean<LdBook> bookList = bookBhv.selectList(cb);
        assertListNotEmtpy(bookList);

        // ## Act ##
        final BookDtoMapper mapper = new BookDtoMapper();
        final List<BookDto> bookDtoList = mapper.map(bookList);

        // ## Assert ##
        assertEquals(bookList.size(), bookDtoList.size());
        int index = 0;
        for (BookDto bookDto : bookDtoList) {
            final LdBook book = bookList.get(index);
            log(index + ": " + bookDto.getBookName() + " -- " + book.getBookName());
            assertEquals(book.getBookId(), bookDto.getBookId());
            assertEquals(book.getBookName(), bookDto.getBookName());
            log("    " + bookDto.getAuthor());
            assertNotNull(bookDto.getAuthor());
            assertEquals(book.getAuthor().getAuthorName(), bookDto.getAuthor().getAuthorName());
            assertNull(bookDto.getPublisher());
            assertNull(bookDto.getGenre());
            assertListEmtpy(bookDto.getCollectionList());
            ++index;
        }
    }

    public void test_map_ReferrerMapping_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.query().existsCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
            }
        });
        final LdListResultBean<LdBook> bookList = bookBhv.selectList(cb);
        LdConditionBeanSetupper<LdCollectionCB> setupper = new LdConditionBeanSetupper<LdCollectionCB>() {
            public void setup(LdCollectionCB cb) {
                cb.setupSelect_CollectionStatusAsOne();
            }
        };
        bookBhv.loadCollectionList(bookList, setupper);
        assertListNotEmtpy(bookList);

        // ## Act ##
        final BookDtoMapper mapper = new BookDtoMapper();
        final List<BookDto> bookDtoList = mapper.map(bookList);

        // ## Assert ##
        assertEquals(bookList.size(), bookDtoList.size());
        int index = 0;
        for (BookDto bookDto : bookDtoList) {
            final LdBook book = bookList.get(index);
            log(bookDto.getBookId() + ": " + bookDto.getBookName());
            assertEquals(book.getBookId(), bookDto.getBookId());
            assertEquals(book.getBookName(), bookDto.getBookName());
            assertNotNull(bookDto.getAuthor());
            assertEquals(book.getAuthor().getAuthorName(), bookDto.getAuthor().getAuthorName());
            assertNull(bookDto.getPublisher());
            assertNull(bookDto.getGenre());
            final List<CollectionDto> collectionList = bookDto.getCollectionList();
            assertListNotEmtpy(collectionList);
            for (CollectionDto collectionDto : collectionList) {
                final CollectionStatusDto collectionStatus = collectionDto.getCollectionStatusAsOne();
                assertNotNull(collectionStatus);
                final Integer collectionId = collectionDto.getCollectionId();
                final Integer bookId = collectionDto.getBookId();
                final Integer libraryId = collectionDto.getLibraryId();
                final String collectionStatusCode = collectionStatus.getCollectionStatusCode();
                log("    " + collectionId + ", " + bookId + ", " + libraryId + ", " + collectionStatusCode);
                assertEquals(book.getBookId(), bookId);
                final BookDto collectionBook = collectionDto.getBook();
                assertEquals(bookDto, collectionBook);
            }
            ++index;
        }
    }
}

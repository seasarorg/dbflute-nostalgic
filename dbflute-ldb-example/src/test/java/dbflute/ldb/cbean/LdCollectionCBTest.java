package dbflute.ldb.cbean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.cbean.LdCollectionCB;
import dbflute.ldb.exentity.LdAuthor;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.exentity.LdCollection;
import dbflute.ldb.exentity.LdCollectionStatus;
import dbflute.ldb.exentity.LdGenre;
import dbflute.ldb.exentity.LdPublisher;
import dbflute.ldb.testbase.LdCollectionAllDbTestCase;

/**
 * The test of Collection's condition-bean.
 * 
 * @author jflute
 */
public class LdCollectionCBTest extends LdCollectionAllDbTestCase {

    private static final Log _log = LogFactory.getLog(LdCollectionCBTest.class);

    public void test_setupSelect_ForeignTable_Tx() {
        // ## Arrange ##
        final LdCollectionCB cb = new LdCollectionCB();
        cb.setupSelect_CollectionStatusAsOne();
        final LdListResultBean<LdCollection> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);
        for (LdCollection entity : ls) {
            final LdCollectionStatus collectionStatusAsOne = entity.getCollectionStatusAsOne();
            assertNotNull(collectionStatusAsOne);
        }
    }

    public void test_setupSelect_ForeignTable_withManyForeignTable_Tx() {
        // ## Arrange ##
        final LdCollectionCB cb = new LdCollectionCB();
        cb.setupSelect_Book().withAuthor();
        cb.setupSelect_Book().withPublisher();
        final LdListResultBean<LdCollection> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);
        for (LdCollection collection : ls) {
            _log.debug("collection=" + collection.getDBMeta().convertToColumnStringValueMap(collection));
            final LdAuthor author = collection.getBook().getAuthor();
            assertNotNull(author);
            _log.debug("  author=" + author.getDBMeta().convertToColumnStringValueMap(author));
            final LdPublisher publisher = collection.getBook().getPublisher();
            assertNotNull(publisher);
            _log.debug("  publisher=" + publisher.getDBMeta().convertToColumnStringValueMap(publisher));
        }
    }
    
    public void test_setupSelect_SameForeignTable_withManyForeignTable_withForeign_Tx() {
        // ## Arrange ##
        final LdCollectionCB cb = new LdCollectionCB();
        cb.setupSelect_Book().withAuthor();
        cb.setupSelect_Book().withGenre();
        cb.query().queryBook().setGenreCode_IsNotNull();
        final LdListResultBean<LdCollection> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);
        for (LdCollection collection : ls) {
            _log.debug("collection=" + collection.getDBMeta().convertToColumnStringValueMap(collection));
            final LdAuthor author = collection.getBook().getAuthor();
            assertNotNull(author);
            _log.debug("  author=" + author.getDBMeta().convertToColumnStringValueMap(author));
            final LdGenre genre = collection.getBook().getGenre();
            assertNotNull(genre);
            _log.debug("  genre=" + genre.getDBMeta().convertToColumnStringValueMap(genre));
        }
    }
    
    public void test_setupSelect_ForeignTable_withForeignForeignTable_Tx() {
        // ## Arrange ##
        final LdCollectionCB cb = new LdCollectionCB();
        cb.setupSelect_Book().withGenre().withGenreSelf();
        cb.query().queryBook().setGenreCode_IsNotNull();
        cb.query().queryBook().queryGenre().setParentGenreCode_IsNotNull();
        final LdListResultBean<LdCollection> collectionList = getMyBhv().selectList(cb);
        assertListNotEmtpy(collectionList);
        for (LdCollection collection : collectionList) {
            _log.debug("collection=" + collection);
            final LdBook book = collection.getBook();
            _log.debug("  book=" + book);
            assertNotNull(book);
            final LdGenre genre = book.getGenre();
            _log.debug("    genre=" + genre);
            assertNotNull(genre);
            final LdGenre genreSelf = genre.getGenreSelf();
            _log.debug("      genreSelf=" + genreSelf);
            assertNotNull(genreSelf);
            assertEquals(genre.getParentGenreCode(), genreSelf.getGenreCode());
            assertNull(genreSelf.getGenreSelf());
        }
    }
}

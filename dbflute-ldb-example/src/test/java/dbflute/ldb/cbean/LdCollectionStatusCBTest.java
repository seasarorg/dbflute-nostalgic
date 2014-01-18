package dbflute.ldb.cbean;

import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.exentity.LdCollection;
import dbflute.ldb.exentity.LdCollectionStatus;
import dbflute.ldb.exentity.LdGenre;
import dbflute.ldb.testbase.LdCollectionStatusAllDbTestCase;

/**
 * @author jflute
 */
public class LdCollectionStatusCBTest extends LdCollectionStatusAllDbTestCase {

    public void test_setupSelect_ForeignTable_Tx() {
        // ## Arrange ##
        final LdCollectionStatusCB cb = new LdCollectionStatusCB();
        cb.setupSelect_Collection().withBook().withGenre().withGenreSelf();
        cb.query().queryCollection().queryBook().setGenreCode_IsNotNull();
        cb.query().queryCollection().queryBook().queryGenre().setParentGenreCode_IsNotNull();
        
        // ## Act ##
        final LdListResultBean<LdCollectionStatus> ls = getMyBhv().selectList(cb);
        
        // ## Assert ##
        assertListNotEmtpy(ls);
        for (LdCollectionStatus entity : ls) {
            final LdCollection collection = entity.getCollection();
            LdBook book = collection.getBook();
            assertNotNull(book);
            LdGenre genre1 = book.getGenre();
            assertNotNull(genre1);
            LdGenre genre2 = genre1.getGenreSelf();
            _log.debug(genre1.getGenreName() + ", " + genre2.getGenreName());
            assertNotNull(genre2);
        }
    }
}

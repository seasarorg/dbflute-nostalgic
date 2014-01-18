package dbflute.ldb.cbean;

import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookCBInternalTest extends LdBookAllDbTestCase {

    public void test_additionalForeignKeyFixedCondition_Tx() {
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_CollectionStatusLookupAsNonExist();
        if (!cb.toString().contains("COLLECTION_STATUS_NAME = 'nonexist'")) {
            fail();
        }
        final LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);
        for (LdBook book : bookList) {
            _log.debug(book.getBookId() + " - " + book.getBookName() + " - " + book.getCollectionStatusLookupAsNonExist());
            assertNull(book.getCollectionStatusLookupAsNonExist());
        }
    }
}

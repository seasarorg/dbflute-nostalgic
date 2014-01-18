package dbflute.ldb.cbean.subquery;

import java.util.List;

import dbflute.ldb.allcommon.bhv.setup.LdConditionBeanSetupper;
import dbflute.ldb.allcommon.cbean.LdSubQuery;
import dbflute.ldb.allcommon.cbean.LdUnionQuery;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.cbean.LdCollectionCB;
import dbflute.ldb.exbhv.LdCollectionBhv;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.exentity.LdCollection;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookCBInScopeSubQueryReferrerTest extends LdBookAllDbTestCase {

    public void test_selectList_InScopeSubQuery_Referrer_at_MyTable_Tx() {
        // ## Arrange ##
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
        //                               on COLLECTION.LIBRARY_ID = library.LIBRARY_ID
        //                             left outer join COLLECTION_STATUS collectionStatus
        //                               on COLLECTION.COLLECTION_ID = collectionStatus.COLLECTION_ID
        //                          where library.LIBRARY_NAME like '中目%'
        //                            and collectionStatus.COLLECTION_STATUS_CODE = 'NOR')
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_PrefixSearch(bookNamePrefix);
        cb.query().inScopeCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().queryLibrary().setLibraryName_PrefixSearch(libraryNamePrefix);
                subCB.query().queryCollectionStatusAsOne().setCollectionStatusCode_Equal(statusCodeNormal);
            }
        });
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final LdBook entity : ls) {
            final String bookName = entity.getBookName();
            if (!bookName.startsWith(bookNamePrefix)) {
                fail("The book name must start with '" + bookNamePrefix + "': " + bookName);
            }

            final LdCollectionBhv collectionBhv = getBehaviorSelector().select(LdCollectionBhv.class);
            final LdCollectionCB collectionCB = new LdCollectionCB();
            collectionCB.setupSelect_Library();

            collectionCB.setupSelect_CollectionStatusAsOne();
            collectionCB.query().setBookId_Equal(entity.getBookId());
            final List<LdCollection> collectionList = collectionBhv.selectList(collectionCB);

            boolean isContainsLibraryName = false;
            boolean isContainsStatusCode = false;
            for (final Object object : collectionList) {
                final LdCollection collectionEntity = (LdCollection) object;
                final String libraryName = collectionEntity.getLibrary().getLibraryName();
                if (libraryName.startsWith(libraryNamePrefix)) {
                    isContainsLibraryName = true;
                }
                final String statusCode = collectionEntity.getCollectionStatusAsOne().getCollectionStatusCode();
                assertNotNull(statusCode);
                if (statusCode.equals(statusCodeNormal)) {
                    isContainsStatusCode = true;
                }
            }
            assertTrue(isContainsLibraryName);
            assertTrue(isContainsStatusCode);
        }
    }

    public void test_inScopeSubQuery_referrer_unionAll_union_ExecuteOK_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();

        // ## Act ##
        cb.query().inScopeCollectionList(new LdSubQuery<LdCollectionCB>() {
            public void query(LdCollectionCB subCB) {
                subCB.query().setLibraryId_Equal(2);
                subCB.unionAll(new LdUnionQuery<LdCollectionCB>() {
                    public void query(LdCollectionCB unionCB) {
                        unionCB.query().setLibraryId_Equal(3);
                    }
                });
                subCB.union(new LdUnionQuery<LdCollectionCB>() {
                    public void query(LdCollectionCB unionCB) {
                        unionCB.query().setLibraryId_Equal(4);
                    }
                });
            }
        });
        final List<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        getMyBhv().loadCollectionList(bookList, new LdConditionBeanSetupper<LdCollectionCB>() {
            public void setup(LdCollectionCB cb) {
            }
        });
        for (final LdBook book : bookList) {
            _log.debug(book.getBookId() + ": " + book.getBookName());
            final List<LdCollection> collectionList = book.getCollectionList();
            boolean existsTargetLibraryId = false;
            for (LdCollection collection : collectionList) {
                final Integer libraryId = collection.getLibraryId();
                _log.debug("    colId=" + collection.getCollectionId() + ": libId=" + collection.getLibraryId());
                if (libraryId.equals(2) || libraryId.equals(3) || libraryId.equals(4)) {
                    existsTargetLibraryId = true;
                }
            }
            assertTrue("Unexpected: " + book, existsTargetLibraryId);
        }
    }
}

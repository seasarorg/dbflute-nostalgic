package dbflute.ldb.cbean;

import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdUnionQuery;
import dbflute.ldb.allcommon.cbean.LdAbstractConditionBean.SpecifyColumnNotSetupSelectColumnException;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 * @since 0.7.4 (2008/06/14 Saturday)
 */
public class LdBookCBSpecifyColumnTest extends LdBookAllDbTestCase {

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_specify_SelectsSpecifiedColumns_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.specify().columnBookName();
        cb.specify().specifyAuthor().columnAuthorName();

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        for (LdBook book : bookList) {
            // BOOK
            assertNotNull(book.getBookId());// PK
            assertNotNull(book.getBookName());
            assertNull(book.getOpeningPart());
            assertNull(book.getMaxLendingDateCount());
            assertNull(book.getOutOfUserSelectYn());
            assertNull(book.getRModule());
            assertNull(book.getRTimestamp());
            assertNull(book.getRUser());
            assertNull(book.getUModule());
            assertNull(book.getUTimestamp());
            assertNull(book.getUUser());
            assertNull(book.getGenreCode());// Non SetupSelect FK
            assertNull(book.getPublisherId());// Non SetupSelect FK
            assertNotNull(book.getAuthorId());// SetupSelect FK

            // AUTHOR
            assertNotNull(book.getAuthor().getAuthorId());// PK
            assertNotNull(book.getAuthor().getAuthorName());
            assertNull(book.getAuthor().getAuthorAge());
            assertNull(book.getAuthor().getRModule());
            assertNull(book.getAuthor().getRTimestamp());
            assertNull(book.getAuthor().getRUser());
            assertNull(book.getAuthor().getUModule());
            assertNull(book.getAuthor().getUTimestamp());
            assertNull(book.getAuthor().getUUser());

            // PUBLISHER
            assertNull(book.getPublisher());

            // GENRE
            assertNull(book.getGenre());

            // COLLECTION
            assertListEmtpy(book.getCollectionList());
        }
    }
    
    public void test_specify_SelectsSpecifiedColumns_with_addOrderBy_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.specify().columnBookName();
        cb.specify().specifyAuthor().columnAuthorName();
        cb.query().addOrderBy_Isbn_Desc();

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        for (LdBook book : bookList) {
            // BOOK
            assertNotNull(book.getBookId());// PK
            assertNotNull(book.getBookName());
            assertNull(book.getOpeningPart());
            assertNull(book.getMaxLendingDateCount());
            assertNull(book.getOutOfUserSelectYn());
            assertNull(book.getRModule());
            assertNull(book.getRTimestamp());
            assertNull(book.getRUser());
            assertNull(book.getUModule());
            assertNull(book.getUTimestamp());
            assertNull(book.getUUser());
            assertNull(book.getGenreCode());// Non SetupSelect FK
            assertNull(book.getPublisherId());// Non SetupSelect FK
            assertNotNull(book.getAuthorId());// SetupSelect FK

            // AUTHOR
            assertNotNull(book.getAuthor().getAuthorId());// PK
            assertNotNull(book.getAuthor().getAuthorName());
            assertNull(book.getAuthor().getAuthorAge());
            assertNull(book.getAuthor().getRModule());
            assertNull(book.getAuthor().getRTimestamp());
            assertNull(book.getAuthor().getRUser());
            assertNull(book.getAuthor().getUModule());
            assertNull(book.getAuthor().getUTimestamp());
            assertNull(book.getAuthor().getUUser());

            // PUBLISHER
            assertNull(book.getPublisher());

            // GENRE
            assertNull(book.getGenre());

            // COLLECTION
            assertListEmtpy(book.getCollectionList());
        }
    }

    // ===================================================================================
    //                                                                          Union Case
    //                                                                          ==========
    public void test_specify_SelectsSpecifiedColumns_with_union_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.specify().columnBookName();
        cb.specify().specifyAuthor().columnAuthorName();
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
            }
        });

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        for (LdBook book : bookList) {
            // BOOK
            assertNotNull(book.getBookId());// PK
            assertNotNull(book.getBookName());
            assertNull(book.getOpeningPart());
            assertNull(book.getMaxLendingDateCount());
            assertNull(book.getOutOfUserSelectYn());
            assertNull(book.getRModule());
            assertNull(book.getRTimestamp());
            assertNull(book.getRUser());
            assertNull(book.getUModule());
            assertNull(book.getUTimestamp());
            assertNull(book.getUUser());
            assertNull(book.getGenreCode());// Non SetupSelect FK
            assertNull(book.getPublisherId());// Non SetupSelect FK
            assertNotNull(book.getAuthorId());// SetupSelect FK

            // AUTHOR
            assertNotNull(book.getAuthor().getAuthorId());// PK
            assertNotNull(book.getAuthor().getAuthorName());
            assertNull(book.getAuthor().getAuthorAge());
            assertNull(book.getAuthor().getRModule());
            assertNull(book.getAuthor().getRTimestamp());
            assertNull(book.getAuthor().getRUser());
            assertNull(book.getAuthor().getUModule());
            assertNull(book.getAuthor().getUTimestamp());
            assertNull(book.getAuthor().getUUser());

            // PUBLISHER
            assertNull(book.getPublisher());

            // GENRE
            assertNull(book.getGenre());

            // COLLECTION
            assertListEmtpy(book.getCollectionList());
        }
    }

    public void test_specify_SelectsSpecifiedColumns_with_union_addOrderBy_specifiedColumn_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.specify().columnBookName();
        cb.specify().specifyAuthor().columnAuthorName();
        cb.union(new LdUnionQuery<LdBookCB>() {
            public void query(LdBookCB unionCB) {
            }
        });
        cb.query().addOrderBy_BookName_Asc();

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        for (LdBook book : bookList) {
            // BOOK
            assertNotNull(book.getBookId());// PK
            assertNotNull(book.getBookName());
            assertNull(book.getOpeningPart());
            assertNull(book.getMaxLendingDateCount());
            assertNull(book.getOutOfUserSelectYn());
            assertNull(book.getRModule());
            assertNull(book.getRTimestamp());
            assertNull(book.getRUser());
            assertNull(book.getUModule());
            assertNull(book.getUTimestamp());
            assertNull(book.getUUser());
            assertNull(book.getGenreCode());// Non SetupSelect FK
            assertNull(book.getPublisherId());// Non SetupSelect FK
            assertNotNull(book.getAuthorId());// SetupSelect FK

            // AUTHOR
            assertNotNull(book.getAuthor().getAuthorId());// PK
            assertNotNull(book.getAuthor().getAuthorName());
            assertNull(book.getAuthor().getAuthorAge());
            assertNull(book.getAuthor().getRModule());
            assertNull(book.getAuthor().getRTimestamp());
            assertNull(book.getAuthor().getRUser());
            assertNull(book.getAuthor().getUModule());
            assertNull(book.getAuthor().getUTimestamp());
            assertNull(book.getAuthor().getUUser());

            // PUBLISHER
            assertNull(book.getPublisher());

            // GENRE
            assertNull(book.getGenre());

            // COLLECTION
            assertListEmtpy(book.getCollectionList());
        }
    }
    
// TODO: @jflute -- Now it's exception! If it's add order-by column, should the column be specified?
//    public void test_specify_SelectsSpecifiedColumns_with_union_addOrderBy_unspecifiedColumn_Tx() {
//        // ## Arrange ##
//        _help.replaceMyTableWithAll();
//        LdBookCB cb = new LdBookCB();
//        cb.setupSelect_Author();
//        cb.specify().columnBookName();
//        cb.specify().specifyAuthor().columnAuthorName();
//        cb.union(new LdUnionQuery<LdBookCB>() {
//            public void query(LdBookCB unionCB) {
//            }
//        });
//        cb.query().addOrderBy_Isbn_Desc();
//        
//        // ## Act ##
//        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);
//        
//        // ## Assert ##
//        assertListNotEmtpy(bookList);
//        for (LdBook book : bookList) {
//            // BOOK
//            assertNotNull(book.getBookId());// PK
//            assertNotNull(book.getBookName());
//            assertNull(book.getOpeningPart());
//            assertNull(book.getMaxLendingDateCount());
//            assertNull(book.getOutOfUserSelectYn());
//            assertNull(book.getRModule());
//            assertNull(book.getRTimestamp());
//            assertNull(book.getRUser());
//            assertNull(book.getUModule());
//            assertNull(book.getUTimestamp());
//            assertNull(book.getUUser());
//            assertNull(book.getGenreCode());// Non SetupSelect FK
//            assertNull(book.getPublisherId());// Non SetupSelect FK
//            assertNotNull(book.getAuthorId());// SetupSelect FK
//            
//            // AUTHOR
//            assertNotNull(book.getAuthor().getAuthorId());// PK
//            assertNotNull(book.getAuthor().getAuthorName());
//            assertNull(book.getAuthor().getAuthorAge());
//            assertNull(book.getAuthor().getRModule());
//            assertNull(book.getAuthor().getRTimestamp());
//            assertNull(book.getAuthor().getRUser());
//            assertNull(book.getAuthor().getUModule());
//            assertNull(book.getAuthor().getUTimestamp());
//            assertNull(book.getAuthor().getUUser());
//            
//            // PUBLISHER
//            assertNull(book.getPublisher());
//            
//            // GENRE
//            assertNull(book.getGenre());
//            
//            // COLLECTION
//            assertListEmtpy(book.getCollectionList());
//        }
//    }
    
    // ===================================================================================
    //                                                                Foreign Various Case
    //                                                                ====================
    public void test_specifyColumn_OnlyForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.specify().specifyAuthor().columnAuthorName();

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        for (LdBook book : bookList) {
            // BOOK
            assertNotNull(book.getBookId());// PK
            assertNotNull(book.getBookName());
            assertNotNull(book.getMaxLendingDateCount());
            assertNotNull(book.getOutOfUserSelectYn());
            assertNotNull(book.getRModule());
            assertNotNull(book.getRTimestamp());
            assertNotNull(book.getRUser());
            assertNotNull(book.getUModule());
            assertNotNull(book.getUTimestamp());
            assertNotNull(book.getUUser());
            assertNotNull(book.getPublisherId());// FK
            assertNotNull(book.getAuthorId());// FK

            // AUTHOR
            assertNotNull(book.getAuthor().getAuthorId());// PK
            assertNotNull(book.getAuthor().getAuthorName());
            assertNull(book.getAuthor().getAuthorAge());
            assertNull(book.getAuthor().getRModule());
            assertNull(book.getAuthor().getRTimestamp());
            assertNull(book.getAuthor().getRUser());
            assertNull(book.getAuthor().getUModule());
            assertNull(book.getAuthor().getUTimestamp());
            assertNull(book.getAuthor().getUUser());

            // PUBLISHER
            assertNull(book.getPublisher());

            // GENRE
            assertNull(book.getGenre());

            // COLLECTION
            assertListEmtpy(book.getCollectionList());
        }
    }
    
    public void test_specifyColumn_OnlyLocalTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.specify().columnBookName();
        cb.specify().columnUTimestamp();

        // ## Act ##
        LdListResultBean<LdBook> bookList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(bookList);
        for (LdBook book : bookList) {
            // BOOK
            assertNotNull(book.getBookId());// PK
            assertNotNull(book.getBookName());
            assertNull(book.getMaxLendingDateCount());
            assertNull(book.getOutOfUserSelectYn());
            assertNull(book.getRModule());
            assertNull(book.getRTimestamp());
            assertNull(book.getRUser());
            assertNull(book.getUModule());
            assertNotNull(book.getUTimestamp());
            assertNull(book.getUUser());
            assertNull(book.getGenreCode());// Non SetupSelect FK
            assertNull(book.getPublisherId());// Non SetupSelect FK
            assertNotNull(book.getAuthorId());// SetupSelect FK

            // AUTHOR
            assertNotNull(book.getAuthor().getAuthorId());// PK
            assertNotNull(book.getAuthor().getAuthorName());
            assertNotNull(book.getAuthor().getAuthorAge());
            assertNotNull(book.getAuthor().getRModule());
            assertNotNull(book.getAuthor().getRTimestamp());
            assertNotNull(book.getAuthor().getRUser());
            assertNotNull(book.getAuthor().getUModule());
            assertNotNull(book.getAuthor().getUTimestamp());
            assertNotNull(book.getAuthor().getUUser());

            // PUBLISHER
            assertNull(book.getPublisher());

            // GENRE
            assertNull(book.getGenre());

            // COLLECTION
            assertListEmtpy(book.getCollectionList());
        }
    }
    // ===================================================================================
    //                                                                      Irregular Case
    //                                                                      ==============
    public void test_specify_NotSetupForeignColumnInvoking_Tx() {
        // ## Arrange ##
        LdBookCB cb = new LdBookCB();
        cb.specify().columnBookName();
        cb.specify().columnOpeningPart();

        // ## Act & Assert ##
        try {
            cb.specify().specifyAuthor().columnAuthorName();
            fail();
        } catch (SpecifyColumnNotSetupSelectColumnException e) {
            // OK
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                         Test Helper
    //                                                                         ===========
    protected LdBookDbm getMyDBMeta() {
        return LdBookDbm.getInstance();
    }
}

package dbflute.ldb.allcommon.dbmeta.hierarchy;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.dbmeta.hierarchy.basic.LdHierarchySourceEntityListIterator;
import dbflute.ldb.bsentity.customize.dbmeta.LdHierarchyFlatBookDbm;
import dbflute.ldb.bsentity.customize.dbmeta.LdHierarchyFlatLibraryDbm;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;
import dbflute.ldb.bsentity.dbmeta.LdLibraryDbm;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm.BookRelationTrace;
import dbflute.ldb.bsentity.dbmeta.LdLibraryDbm.LibraryRelationTrace;
import dbflute.ldb.exentity.LdAuthor;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.exentity.LdCollection;
import dbflute.ldb.exentity.LdCollectionStatus;
import dbflute.ldb.exentity.LdCollectionStatusLookup;
import dbflute.ldb.exentity.LdLbUser;
import dbflute.ldb.exentity.LdLending;
import dbflute.ldb.exentity.LdLibrary;
import dbflute.ldb.exentity.LdLibraryUser;
import dbflute.ldb.exentity.LdNextLibrary;
import dbflute.ldb.exentity.customize.LdHierarchyFlatBook;
import dbflute.ldb.exentity.customize.LdHierarchyFlatLibrary;

public class LdHierarchyArrangerTest extends TestCase {

    private static final Log _log = LogFactory.getLog(LdHierarchyArrangerTest.class);

    // ===================================================================================
    //                                                                             LIBRARY
    //                                                                             =======
    public void test_HierarchyArranger_Library() throws Exception {
        final LdHierarchyRequest<LdLibrary> request = createLibraryHierarchyRequest(createFlatLibraryList());

        final LdHierarchyArranger<LdLibrary> arranger = new LdHierarchyArranger<LdLibrary>();
        final List<LdLibrary> libraryList = arranger.arrangeHierarchy(request);
        final String tableIndent = "  ";

        boolean expectExistNextLibraryList = false;
        boolean expectExistCollectionList = false;

        final StringBuilder sb = new StringBuilder();
        sb.append("[LibraryList]").append(getLineSeparator());
        for (LdLibrary library : libraryList) {
            sb.append("[Library]");
            sb.append(getLineSeparator());
            sb.append(tableIndent + tableIndent);
            sb.append("libraryId=").append(library.getLibraryId());
            sb.append(" libraryName=").append(library.getLibraryName());
            sb.append(" RUser=").append(library.getRUser());
            sb.append(" RTimestamp=").append(library.getRTimestamp());
            sb.append(getLineSeparator());

            final List<LdNextLibrary> nextLibraryList = library.getNextLibraryByBaseIdList();
            if (!nextLibraryList.isEmpty()) {
                expectExistNextLibraryList = true;
                for (LdNextLibrary nextLibrary : nextLibraryList) {
                    sb.append(tableIndent);
                    sb.append("[NEXT_LIBRARY]");
                    sb.append(getLineSeparator());
                    sb.append(tableIndent + tableIndent + tableIndent);
                    sb.append("baseLibraryId=").append(nextLibrary.getLibraryId());
                    sb.append(" nextLibraryId=").append(nextLibrary.getNextLibraryId());
                    sb.append(getLineSeparator());
                    final LdLibrary libraryByNextId = nextLibrary.getLibraryByNextId();
                    sb.append(tableIndent + tableIndent);
                    if (libraryByNextId != null) {
                        sb.append("[LIBRARY]");
                        sb.append(getLineSeparator());
                        sb.append(tableIndent + tableIndent + tableIndent + tableIndent);
                        sb.append(" nextLibraryNextLibraryName=").append(libraryByNextId.getLibraryName());
                    } else {
                        sb.append("[LIBRARY] null");
                    }
                    sb.append(getLineSeparator());
                }
            } else {
                sb.append(tableIndent);
                sb.append("[NEXT_LIBRARY] empty");
                sb.append(getLineSeparator());
            }

            final List<LdCollection> collectionList = library.getCollectionList();
            sb.append(tableIndent);
            if (!collectionList.isEmpty()) {
                expectExistCollectionList = true;
                sb.append("[COLLECTION]");
                sb.append(getLineSeparator());
                for (LdCollection collection : collectionList) {
                    sb.append(tableIndent + tableIndent + tableIndent);
                    sb.append("collectionId=").append(collection.getCollectionId());
                    sb.append(" libraryId=").append(collection.getLibraryId());
                    sb.append(" bookId=").append(collection.getBookId());
                    sb.append(" arrivalDate=").append(collection.getArrivalDate());
                    final LdCollectionStatus status = collection.getCollectionStatusAsOne();
                    if (status != null) {
                        sb.append(" collectionStatusCode=").append(status.getCollectionStatusCode());
                        final LdCollectionStatusLookup lookup = status.getCollectionStatusLookup();
                        if (lookup != null) {
                            sb.append(" collectionStatusName=").append(lookup.getCollectionStatusName());
                        }
                    }
                    sb.append(getLineSeparator());
                }
            } else {
                sb.append("[COLLECTION] empty");
                sb.append(getLineSeparator());
            }

            final List<LdLibraryUser> libraryUserList = library.getLibraryUserList();
            sb.append(tableIndent);
            if (!libraryUserList.isEmpty()) {
                sb.append("[LIBRARY_USER]");
                sb.append(getLineSeparator());
                for (LdLibraryUser libraryUser : libraryUserList) {
                    sb.append(tableIndent + tableIndent + tableIndent);
                    sb.append("libraryId=").append(libraryUser.getLibraryId());
                    sb.append(" userId=").append(libraryUser.getLbUserId());
                    sb.append(getLineSeparator());
                    final List<LdLending> lendingList = libraryUser.getLendingList();
                    sb.append(tableIndent + tableIndent);
                    if (!lendingList.isEmpty()) {
                        sb.append("[LENDING]");
                        sb.append(getLineSeparator());
                        for (LdLending lending : lendingList) {
                            sb.append(tableIndent + tableIndent + tableIndent + tableIndent);
                            sb.append("libraryId=").append(lending.getLibraryId());
                            sb.append(" userId=").append(lending.getLbUserId());
                            sb.append(" lendingDate=").append(lending.getLendingDate());
                            sb.append(" UUser=").append(lending.getUUser());
                            sb.append(" UModule=").append(lending.getUModule());
                        }
                    } else {
                        sb.append("[LENDING] empty");
                    }
                    sb.append(getLineSeparator());
                    final LdLbUser lbUser = libraryUser.getLbUser();
                    sb.append(tableIndent + tableIndent);
                    if (lbUser != null) {
                        sb.append("[LB_USER]");
                        sb.append(getLineSeparator());
                        sb.append(tableIndent + tableIndent + tableIndent + tableIndent);
                        sb.append(" userName=").append(lbUser.getLbUserName());
                    } else {
                        sb.append("[LB_USER] null");
                    }
                    sb.append(getLineSeparator());
                }
            } else {
                sb.append("[LIBRARY_USER] empty");
                sb.append(getLineSeparator());
            }
        }
        _log.debug(sb);

        assertTrue(expectExistNextLibraryList);
        assertTrue(expectExistCollectionList);
    }

    private LdHierarchyRequest<LdLibrary> createLibraryHierarchyRequest(List<LdHierarchyFlatLibrary> flatLibraryList) {
        // Define dbmeta.
        final LdHierarchyFlatLibraryDbm sourceDbm = LdHierarchyFlatLibraryDbm.getInstance();

        //   select library.LIBRARY_ID as LIBRARY_ID
        //        , library.LIBRARY_NAME as LIBRARY_NAME
        //        , library.R_USER as R_USER
        //        , library.R_TIMESTAMP as R_TIMESTAMP
        //        , nextBase.LIBRARY_ID as BASE_LIBRARY_ID
        //        , nextBase.NEXT_LIBRARY_ID as NEXT_LIBRARY_ID
        //        , nextBaseNextLibrary.LIBRARY_ID as NEXT_LIBRARY_NEXT_LIBRARY_ID
        //        , nextBaseNextLibrary.LIBRARY_NAME as NEXT_LIBRARY_NEXT_LIBRARY_NAME
        //        , collection.COLLECTION_ID as COLLECTION_ID
        //        , collection.ARRIVAL_DATE as COLLECTION_ARRIVAL_DATE
        //        , collectionStatus.COLLECTION_ID as COLLECTION_STATUS_ID
        //        , collectionStatus.COLLECTION_STATUS_CODE as COLLECTION_STATUS_CODE
        //        , collectionStatusLookup.COLLECTION_STATUS_CODE as COLLECTION_STATUS_CODE
        //        , collectionStatusLookup.COLLECTION_STATUS_NAME as COLLECTION_STATUS_NAME
        //        , book.BOOK_ID as COLLECTION_BOOK_ID
        //        , book.BOOK_NAME as COLLECTION_BOOK_NAME
        //        , author.AUTHOR_ID as COLLECTION_BOOK_AUTHOR_ID
        //        , author.AUTHOR_NAME as COLLECTION_BOOK_AUTHOR_NAME
        //        , libraryUser.LIBRARY_ID as LIBRARY_USER_LIBRARY_ID 
        //        , libraryUser.LB_USER_ID as LIBRARY_USER_LB_USER_ID
        //        , lending.LIBRARY_ID as LENDING_LIBRARY_ID
        //        , lending.LB_USER_ID as LENDING_LB_USER_ID
        //        , lending.LENDING_DATE as LENDING_DATE
        //        , lending.U_USER as LENDING_U_USER
        //        , lending.U_MODULE as LENDING_U_MODULE
        //        , lbUser.LB_USER_ID as LB_USER_ID
        //        , lbUser.LB_USER_NAME as LB_USER_NAME

        // Define hierarychy request as library.
        final LdHierarchyRequest<LdLibrary> request = new LdHierarchyRequest<LdLibrary>(LdLibrary.class);

        // Register source iterator. (by calling creator for flat library list)
        request.registerSourceList(flatLibraryList);

        // Create relation trace.
        final LibraryRelationTrace trace = LdLibraryDbm.getInstance().createRelationTrace(null);

        // Register column [libraryId]
        request.mapping(sourceDbm.columnLibraryId(), trace.columnLibraryId());

        // Register column [libraryName]
        request.mapping(sourceDbm.columnLibraryName(), trace.columnLibraryName());

        // Register column [RUser]
        request.mapping(sourceDbm.columnRUser(), trace.columnRUser());

        // Register column [RTimestamp]
        request.mapping(sourceDbm.columnRTimestamp(), trace.columnRTimestamp());

        // Register column [baseLibraryId]
        request.mapping(sourceDbm.columnBaseLibraryId(), trace.referrerNextLibraryByBaseIdList().columnLibraryId());

        // Register column [nextLibraryId]
        request.mapping(sourceDbm.columnNextLibraryId(), trace.referrerNextLibraryByBaseIdList().columnNextLibraryId());

        // Register column [nextLibraryNextLibraryId]
        request.mapping(sourceDbm.columnNextLibraryNextLibraryId(), trace.referrerNextLibraryByBaseIdList()
                .foreignLibraryByNextId().columnLibraryId());

        // Register column [nextLibraryNextLibraryName]
        request.mapping(sourceDbm.columnNextLibraryNextLibraryName(), trace.referrerNextLibraryByBaseIdList()
                .foreignLibraryByNextId().columnLibraryName());

        // Register column [collectionId]
        request.mapping(sourceDbm.columnCollectionId(), trace.referrerCollectionList().columnCollectionId());

        // Register column [arrivalDate]
        request.mapping(sourceDbm.columnCollectionArrivalDate(), trace.referrerCollectionList().columnArrivalDate());

        // Register column [collectionStatusId]
        request.mapping(sourceDbm.columnCollectionStatusId(), trace.referrerCollectionList()
                .foreignCollectionStatusAsOne().columnCollectionId());

        // Register column [collectionStatusCode]
        request.mapping(sourceDbm.columnCollectionStatusCode(), trace.referrerCollectionList()
                .foreignCollectionStatusAsOne().foreignCollectionStatusLookup().columnCollectionStatusCode());

        // Register column [collectionStatusName]
        request.mapping(sourceDbm.columnCollectionStatusName(), trace.referrerCollectionList()
                .foreignCollectionStatusAsOne().foreignCollectionStatusLookup().columnCollectionStatusName());

        // Register column [collectionBookId]
        request.mapping(sourceDbm.columnCollectionBookId(), trace.referrerCollectionList().foreignBook().columnBookId());

        // Register column [collectionBookName]
        request.mapping(sourceDbm.columnCollectionBookName(), trace.referrerCollectionList().foreignBook()
                .columnBookName());

        // Register column [collectionBookAuthorId]
        request.mapping(sourceDbm.columnCollectionBookAuthorId(), trace.referrerCollectionList().foreignBook()
                .foreignAuthor().columnAuthorId());

        // Register column [collectionBookAuthorName]
        request.mapping(sourceDbm.columnCollectionBookAuthorName(), trace.referrerCollectionList().foreignBook()
                .foreignAuthor().columnAuthorName());

        // Register column [libraryUserLibraryId]
        request.mapping(sourceDbm.columnLibraryUserLibraryId(), trace.referrerLibraryUserList().columnLibraryId());

        // Register column [libraryUserLbUserId]
        request.mapping(sourceDbm.columnLibraryUserLbUserId(), trace.referrerLibraryUserList().columnLbUserId());

        // Register column [lendingLibraryId]
        request.mapping(sourceDbm.columnLendingLibraryId(), trace.referrerLibraryUserList().referrerLendingList()
                .columnLibraryId());

        // Register column [lendingLbUserId]
        request.mapping(sourceDbm.columnLendingLbUserId(), trace.referrerLibraryUserList().referrerLendingList()
                .columnLbUserId());

        // Register column [lendingDate]
        request.mapping(sourceDbm.columnLendingDate(), trace.referrerLibraryUserList().referrerLendingList()
                .columnLendingDate());

        // Register column [lendingUUser]
        request.mapping(sourceDbm.columnLendingUUser(), trace.referrerLibraryUserList().referrerLendingList()
                .columnUUser());

        // Register column [lendingUModule]
        request.mapping(sourceDbm.columnLendingUModule(), trace.referrerLibraryUserList().referrerLendingList()
                .columnUModule());

        // Register column [lbUserId]
        request.mapping(sourceDbm.columnLbUserId(), trace.referrerLibraryUserList().foreignLbUser().columnLbUserId());

        // Register column [lbUserName]
        request
                .mapping(sourceDbm.columnLbUserName(), trace.referrerLibraryUserList().foreignLbUser()
                        .columnLbUserName());

        return request;
    }

    protected LdHierarchySourceIterator createSourceBeanLibraryListIterator(
            java.util.List<LdHierarchyFlatLibrary> flatLibraryList) {
        return new LdHierarchySourceEntityListIterator<LdHierarchyFlatLibrary>(flatLibraryList);
    }

    protected java.util.List<LdHierarchyFlatLibrary> createFlatLibraryList() {
        final List<LdHierarchyFlatLibrary> ls = new ArrayList<LdHierarchyFlatLibrary>();
        {
            final LdHierarchyFlatLibrary library = new LdHierarchyFlatLibrary();
            final Integer libraryId = decimal(1);
            final Integer nextLibraryId = decimal(11);
            final Integer userId = decimal(6);
            final Integer collectionId = decimal(22);
            final Integer bookId = decimal(222);
            final Integer authorId = decimal(2222);

            library.setLibraryId(libraryId);
            library.setLibraryName("libraryId(1)");
            library.setRUser(null);
            library.setRTimestamp(Timestamp.valueOf("2007-02-02 22:22:22"));
            library.setBaseLibraryId(libraryId);
            library.setNextLibraryId(nextLibraryId);
            library.setNextLibraryNextLibraryId(nextLibraryId);
            library.setNextLibraryNextLibraryName("nextLibraryNextLibraryName(" + nextLibraryId + ")");
            library.setCollectionId(collectionId);
            library.setCollectionArrivalDate(Timestamp.valueOf("2007-08-04 12:34:56"));
            library.setCollectionStatusId(collectionId);
            library.setCollectionStatusCode("OUT");
            library.setCollectionStatusName("貸し出し中");
            library.setCollectionBookId(bookId);
            library.setCollectionBookName("collectionBookName(" + bookId + ")");
            library.setCollectionBookAuthorId(authorId);
            library.setCollectionBookAuthorName("collectionBookAuthorName(" + authorId + ")");
            library.setLibraryUserLibraryId(libraryId);
            library.setLibraryUserLbUserId(userId);
            library.setLendingLibraryId(libraryId);
            library.setLendingLbUserId(userId);
            library.setLendingDate(Timestamp.valueOf("2007-11-11 11:11:11"));
            library.setLendingUUser("lendingUUser");
            library.setLendingUModule("lendingUModule");
            library.setLbUserId(userId);
            library.setLbUserName("userId(" + userId + ")");
            ls.add(library);
        }
        {
            final LdHierarchyFlatLibrary library = new LdHierarchyFlatLibrary();
            final Integer libraryId = decimal(1);
            final Integer nextLibraryId = decimal(12);
            final Integer userId = decimal(6);
            final Integer collectionId = decimal(22);
            final Integer bookId = decimal(222);
            final Integer authorId = decimal(2222);

            library.setLibraryId(libraryId);
            library.setLibraryName("libraryId(1)");
            library.setRUser(null);
            library.setRTimestamp(Timestamp.valueOf("2007-02-02 22:22:22"));
            library.setBaseLibraryId(libraryId);
            library.setNextLibraryId(nextLibraryId);
            library.setNextLibraryNextLibraryId(nextLibraryId);
            library.setNextLibraryNextLibraryName("nextLibraryNextLibraryName(" + nextLibraryId + ")");
            library.setCollectionId(collectionId);
            library.setCollectionArrivalDate(Timestamp.valueOf("2007-08-04 12:34:56"));
            library.setCollectionStatusId(collectionId);
            library.setCollectionStatusCode("OUT");
            library.setCollectionStatusName("貸し出し中");
            library.setCollectionBookId(bookId);
            library.setCollectionBookName("collectionBookName(" + bookId + ")");
            library.setCollectionBookAuthorId(authorId);
            library.setCollectionBookAuthorName("collectionBookAuthorName(" + authorId + ")");
            library.setLibraryUserLibraryId(libraryId);
            library.setLibraryUserLbUserId(userId);
            library.setLendingLibraryId(libraryId);
            library.setLendingLbUserId(userId);
            library.setLendingDate(Timestamp.valueOf("2007-11-11 11:11:11"));
            library.setLendingUUser("lendingUUser");
            library.setLendingUModule("lendingUModule");
            library.setLbUserId(userId);
            library.setLbUserName("userId(" + userId + ")");
            ls.add(library);
        }
        return ls;
    }

    // ===================================================================================
    //                                                                                BOOK
    //                                                                                ====
    public void test_HierarchyArranger_Book() throws Exception {
        final LdHierarchyRequest<LdBook> request = createBookHierarchyRequest();

        final LdHierarchyArranger<LdBook> arranger = new LdHierarchyArranger<LdBook>();
        final List<LdBook> bookList = arranger.arrangeHierarchy(request);

        final StringBuilder sb = new StringBuilder();
        sb.append("[bookList]").append(getLineSeparator());
        for (LdBook book : bookList) {
            sb.append("[BOOK] bookId=").append(book.getBookId());
            sb.append(" bookName=").append(book.getBookName());
            sb.append(" authorId=").append(book.getAuthorId());
            sb.append(getLineSeparator());

            final LdAuthor author = book.getAuthor();
            sb.append("    ");
            if (author != null) {
                sb.append("[AUTHOR] authorId=").append(author.getAuthorId());
                sb.append(" authorName=").append(author.getAuthorName());
            } else {
                sb.append("[AUTHOR] null");
            }
            sb.append(getLineSeparator());

            final List<LdCollection> collectionList = book.getCollectionList();
            sb.append("    ");
            if (!collectionList.isEmpty()) {
                sb.append("[COLLECTION]");
                sb.append(getLineSeparator());
                for (LdCollection collection : collectionList) {
                    sb.append("        ");
                    sb.append("collectionId=").append(collection.getCollectionId());
                    sb.append(" bookId=").append(collection.getBookId());
                    sb.append(" arrivalDate=").append(collection.getArrivalDate());
                    sb.append(getLineSeparator());
                }
            } else {
                sb.append("[COLLECTION] empty");
                sb.append(getLineSeparator());
            }

            sb.append(getLineSeparator());
        }
        _log.debug(sb);
    }

    private LdHierarchyRequest<LdBook> createBookHierarchyRequest() {
        // Define dbmeta.
        final LdHierarchyFlatBookDbm sourceDbm = LdHierarchyFlatBookDbm.getInstance();

        // Define hierarychy request.
        final LdHierarchyRequest<LdBook> request = new LdHierarchyRequest<LdBook>(LdBook.class);

        final BookRelationTrace trace = LdBookDbm.getInstance().createRelationTrace(null);

        // Register source iterator. (by calling creator for flat book list)
        request.setSourceIterator(createSourceBeanBookListIterator(createFlatBookList()));

        // Register column [primaryBookId]
        request.mapping(sourceDbm.columnPrimaryBookId(), trace.columnBookId());

        // Register column [attributeBookName]
        request.mapping(sourceDbm.columnAttributeBookName(), trace.columnBookName());

        // Register column [primaryAuthorId]
        request.mapping(sourceDbm.columnPrimaryAuthorId(), trace.foreignAuthor().columnAuthorId());

        // Register column [attributeAuthorName]
        request.mapping(sourceDbm.columnAttributeAuthorName(), trace.foreignAuthor().columnAuthorName());

        // Register column [primaryCollectionId]
        request.mapping(sourceDbm.columnPrimaryCollectionId(), trace.referrerCollectionList().columnCollectionId());

        // Register column [attributeArrivalDate]
        request.mapping(sourceDbm.columnAttributeArrivalDate(), trace.referrerCollectionList().columnArrivalDate());

        return request;
    }

    protected LdHierarchySourceIterator createSourceBeanBookListIterator(
            java.util.List<LdHierarchyFlatBook> flatBookList) {
        return new LdHierarchySourceEntityListIterator<LdHierarchyFlatBook>(flatBookList);
    }

    protected java.util.List<LdHierarchyFlatBook> createFlatBookList() {
        final ArrayList<LdHierarchyFlatBook> ls = new ArrayList<LdHierarchyFlatBook>();
        {
            final LdHierarchyFlatBook book = new LdHierarchyFlatBook();
            book.setPrimaryBookId(decimal(1));
            book.setAttributeBookName("bookId(1)");
            book.setPrimaryAuthorId(decimal(1));
            book.setAttributeAuthorName("author(1)");
            book.setPrimaryCollectionId(decimal(1));
            book.setAttributeArrivalDate(Timestamp.valueOf("2007-01-01 12:34:56"));
            ls.add(book);
        }
        {
            final LdHierarchyFlatBook book = new LdHierarchyFlatBook();
            book.setPrimaryBookId(decimal(2));
            book.setAttributeBookName("bookId(2)");
            book.setPrimaryAuthorId(decimal(2));
            book.setAttributeAuthorName("author(2)");
            book.setPrimaryCollectionId(decimal(2));
            book.setAttributeArrivalDate(Timestamp.valueOf("2007-01-02 12:34:56"));
            ls.add(book);
        }
        {
            final LdHierarchyFlatBook book = new LdHierarchyFlatBook();
            book.setPrimaryBookId(decimal(2));
            book.setAttributeBookName("bookId(2)");
            book.setPrimaryAuthorId(decimal(99));
            book.setPrimaryCollectionId(decimal(3));
            book.setAttributeArrivalDate(Timestamp.valueOf("2007-01-03 12:34:56"));
            ls.add(book);
        }
        {
            final LdHierarchyFlatBook book = new LdHierarchyFlatBook();
            book.setPrimaryBookId(decimal(3));
            book.setAttributeBookName("bookId(3)");
            book.setPrimaryAuthorId(decimal(4));
            ls.add(book);
        }
        {
            final LdHierarchyFlatBook book = new LdHierarchyFlatBook();
            book.setPrimaryBookId(decimal(4));
            book.setAttributeBookName("bookId(4)");
            book.setPrimaryAuthorId(decimal(1));
            book.setAttributeAuthorName("author(1)");
            book.setPrimaryCollectionId(decimal(4));
            book.setAttributeArrivalDate(Timestamp.valueOf("2007-01-04 12:34:56"));
            ls.add(book);
        }
        {
            final LdHierarchyFlatBook book = new LdHierarchyFlatBook();
            book.setPrimaryBookId(decimal(4));
            book.setAttributeBookName("bookId(4)");
            book.setAttributeAuthorName("author(dummy)");
            book.setPrimaryCollectionId(decimal(5));
            book.setAttributeArrivalDate(Timestamp.valueOf("2007-01-05 12:34:56"));
            ls.add(book);
        }
        {
            final LdHierarchyFlatBook book = new LdHierarchyFlatBook();
            book.setPrimaryBookId(decimal(4));
            book.setAttributeBookName("bookId(4)");
            book.setPrimaryAuthorId(decimal(2));
            book.setAttributeAuthorName("author(2)");
            book.setPrimaryCollectionId(decimal(6));
            book.setAttributeArrivalDate(Timestamp.valueOf("2007-01-06 12:34:56"));
            ls.add(book);
        }
        return ls;
    }

    protected Integer decimal(int value) {
        return new Integer(value);
    }

    protected String getLineSeparator() {
        return System.getProperty("line.separator");
    }
}

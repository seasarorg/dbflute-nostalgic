package dbflute.ldb.allcommon.cbean.sqlclause;

import java.util.ArrayList;
import java.util.List;

import dbflute.PlainTestCase;
import dbflute.ldb.allcommon.cbean.sqlclause.LdAbstractSqlClause.SubQueryIndentFailureException;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;

/**
 * 
 * @author jflute
 * @since 0.5.4 (2007/07/24)
 */
public class LdAbstractSqlClauseTest extends PlainTestCase {

    public void test_filterSubQueryIndent() throws Exception {
        // ## Arrange ##
        final LdSqlClauseDefault sqlClause = new LdSqlClauseDefault(LdBookDbm.getInstance().getTableDbName());
        sqlClause._formatClause = true;

        final List<String> lineList = new ArrayList<String>();
        lineList
                .add("select/*$dto.selectHint*/ dflocal.BOOK_ID as BOOK_ID, dflocal.ISBN as ISBN, dflocal.BOOK_NAME as BOOK_NAME, dflocal.AUTHOR_ID as AUTHOR_ID, dflocal.PUBLISHER_ID as PUBLISHER_ID, dflocal.GENRE_CODE as GENRE_CODE, dflocal.OPENING_PART as OPENING_PART, dflocal.MAX_LENDING_DATE_COUNT as MAX_LENDING_DATE_COUNT, dflocal.OUT_OF_USER_SELECT_YN as OUT_OF_USER_SELECT_YN, dflocal.OUT_OF_USER_SELECT_REASON as OUT_OF_USER_SELECT_REASON, dflocal.R_USER as R_USER, dflocal.R_MODULE as R_MODULE, dflocal.R_TIMESTAMP as R_TIMESTAMP, dflocal.U_USER as U_USER, dflocal.U_MODULE as U_MODULE, dflocal.U_TIMESTAMP as U_TIMESTAMP, dfrelation_0.AUTHOR_ID as AUTHOR_ID_0, dfrelation_0.AUTHOR_NAME as AUTHOR_NAME_0, dfrelation_0.AUTHOR_AGE as AUTHOR_AGE_0, dfrelation_0.R_USER as R_USER_0, dfrelation_0.R_MODULE as R_MODULE_0, dfrelation_0.R_TIMESTAMP as R_TIMESTAMP_0, dfrelation_0.U_USER as U_USER_0, dfrelation_0.U_MODULE as U_MODULE_0, dfrelation_0.U_TIMESTAMP as U_TIMESTAMP_0");
        lineList.add("  from BOOK dflocal");
        lineList.add("    left outer join AUTHOR dfrelation_0 on dflocal.AUTHOR_ID = dfrelation_0.AUTHOR_ID ");
        lineList.add(" where exists (--df:SubQueryBegin#bookId_ExistsSubQuery_CollectionList.subQueryMapKey1[1]#IdentityTerminal#");
        lineList.add("select dfsublocal_1.BOOK_ID ");
        lineList.add("  from COLLECTION dfsublocal_1");
        lineList.add("    left outer join LIBRARY dfrelation_1 on dfsublocal_1.LIBRARY_ID = dfrelation_1.LIBRARY_ID");
        lineList
                .add("    left outer join LIBRARY_TYPE_LOOKUP dfrelation_1_0 on dfrelation_1.LIBRARY_TYPE_CODE = dfrelation_1_0.LIBRARY_TYPE_CODE ");
        lineList.add(" where dfsublocal_1.BOOK_ID = dflocal.BOOK_ID");
        lineList
                .add("   and dfrelation_1.LIBRARY_ID >= /*dto.conditionQuery.bookId_ExistsSubQuery_CollectionList.subQueryMapKey1.conditionQueryLibrary.libraryId.greaterEqual*/null");
        lineList
                .add("   and dfrelation_1_0.LIBRARY_TYPE_CODE = /*dto.conditionQuery.bookId_ExistsSubQuery_CollectionList.subQueryMapKey1.conditionQueryLibrary.conditionQueryLibraryTypeLookup.libraryTypeCode.equal*/null");
        lineList
                .add("   and exists (--df:SubQueryBegin#collectionId_ExistsSubQuery_LendingCollectionList.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("select dfsublocal_0.COLLECTION_ID ");
        lineList.add("  from LENDING_COLLECTION dfsublocal_0 ");
        lineList.add(" where dfsublocal_0.COLLECTION_ID = dfsublocal_1.COLLECTION_ID");
        lineList
                .add("   and dfsublocal_0.COLLECTION_ID in (--df:SubQueryBegin#collectionId_InScopeSubQuery_Collection.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("select dfsublocal_0.COLLECTION_ID ");
        lineList.add("  from COLLECTION dfsublocal_0 ");
        lineList.add("       )--df:SubQueryEnd#collectionId_InScopeSubQuery_Collection.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("       )--df:SubQueryEnd#collectionId_ExistsSubQuery_LendingCollectionList.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("       )--df:SubQueryEnd#bookId_ExistsSubQuery_CollectionList.subQueryMapKey1[1]#IdentityTerminal#");
        lineList
                .add("   and dflocal.AUTHOR_ID in (--df:SubQueryBegin#authorId_InScopeSubQuery_Author.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("select dflocal.AUTHOR_ID ");
        lineList.add("  from AUTHOR dflocal ");
        lineList
                .add(" where dflocal.AUTHOR_ID in (--df:SubQueryBegin#authorId_InScopeSubQuery_BookList.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("select dflocal.AUTHOR_ID");
        lineList.add("  from BOOK dflocal ");
        lineList
                .add(" where dflocal.MAX_LENDING_DATE_COUNT < /*dto.conditionQuery.authorId_InScopeSubQuery_Author.subQueryMapKey1.authorId_InScopeSubQuery_BookList.subQueryMapKey1.maxLendingDateCount.lessThan*/null");
        lineList.add("       )--df:SubQueryEnd#authorId_InScopeSubQuery_BookList.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("       )--df:SubQueryEnd#authorId_InScopeSubQuery_Author.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("   and exists (--df:SubQueryBegin#bookId_ExistsSubQuery_CollectionList.subQueryMapKey2[1]#IdentityTerminal#");
        lineList.add("select dfsublocal_1.BOOK_ID ");
        lineList.add("  from COLLECTION dfsublocal_1");
        lineList.add("    left outer join LIBRARY dfrelation_1 on dfsublocal_1.LIBRARY_ID = dfrelation_1.LIBRARY_ID");
        lineList
                .add("    left outer join LIBRARY_TYPE_LOOKUP dfrelation_1_0 on dfrelation_1.LIBRARY_TYPE_CODE = dfrelation_1_0.LIBRARY_TYPE_CODE");
        lineList.add(" where dfsublocal_1.BOOK_ID = dflocal.BOOK_ID");
        lineList
                .add("   and dfrelation_1.LIBRARY_ID >= /*dto.conditionQuery.bookId_ExistsSubQuery_CollectionList.subQueryMapKey2.conditionQueryLibrary.libraryId.greaterEqual*/null");
        lineList
                .add("   and dfrelation_1_0.LIBRARY_TYPE_CODE = /*dto.conditionQuery.bookId_ExistsSubQuery_CollectionList.subQueryMapKey2.conditionQueryLibrary.conditionQueryLibraryTypeLookup.libraryTypeCode.equal*/null");
        lineList
                .add("   and exists (--df:SubQueryBegin#collectionId_ExistsSubQuery_LendingCollectionList.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("select dfsublocal_0.COLLECTION_ID ");
        lineList.add("  from LENDING_COLLECTION dfsublocal_0 ");
        lineList.add(" where dfsublocal_0.COLLECTION_ID = dfsublocal_1.COLLECTION_ID");
        lineList
                .add("   and dfsublocal_0.COLLECTION_ID in (--df:SubQueryBegin#collectionId_InScopeSubQuery_Collection.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("select dfsublocal_0.COLLECTION_ID ");
        lineList.add("  from COLLECTION dfsublocal_0 ");
        lineList.add("       )--df:SubQueryEnd#collectionId_InScopeSubQuery_Collection.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("       )--df:SubQueryEnd#collectionId_ExistsSubQuery_LendingCollectionList.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("       )--df:SubQueryEnd#bookId_ExistsSubQuery_CollectionList.subQueryMapKey2[1]#IdentityTerminal#");

        final StringBuilder sb = new StringBuilder();
        for (String line : lineList) {
            sb.append(line).append(getLineSeparator());
        }
        final String sql = sb.toString();

        // ## Act ##
        final String filteredSql = sqlClause.filterSubQueryIndent(sql);// Expect no exception!

        // ## Assert ##
        log(getLineSeparator() + filteredSql);
    }

    public void test_filterSubQueryIndent_TooManyBegin() throws Exception {
        // ## Arrange ##
        final LdSqlClauseDefault sqlClause = new LdSqlClauseDefault(LdBookDbm.getInstance().getTableDbName());
        sqlClause._formatClause = true;

        final List<String> lineList = new ArrayList<String>();
        lineList
                .add("select/*$dto.selectHint*/ dflocal.BOOK_ID as BOOK_ID, dflocal.ISBN as ISBN, dflocal.BOOK_NAME as BOOK_NAME, dflocal.AUTHOR_ID as AUTHOR_ID, dflocal.PUBLISHER_ID as PUBLISHER_ID, dflocal.GENRE_CODE as GENRE_CODE, dflocal.OPENING_PART as OPENING_PART, dflocal.MAX_LENDING_DATE_COUNT as MAX_LENDING_DATE_COUNT, dflocal.OUT_OF_USER_SELECT_YN as OUT_OF_USER_SELECT_YN, dflocal.OUT_OF_USER_SELECT_REASON as OUT_OF_USER_SELECT_REASON, dflocal.R_USER as R_USER, dflocal.R_MODULE as R_MODULE, dflocal.R_TIMESTAMP as R_TIMESTAMP, dflocal.U_USER as U_USER, dflocal.U_MODULE as U_MODULE, dflocal.U_TIMESTAMP as U_TIMESTAMP, dfrelation_0.AUTHOR_ID as AUTHOR_ID_0, dfrelation_0.AUTHOR_NAME as AUTHOR_NAME_0, dfrelation_0.AUTHOR_AGE as AUTHOR_AGE_0, dfrelation_0.R_USER as R_USER_0, dfrelation_0.R_MODULE as R_MODULE_0, dfrelation_0.R_TIMESTAMP as R_TIMESTAMP_0, dfrelation_0.U_USER as U_USER_0, dfrelation_0.U_MODULE as U_MODULE_0, dfrelation_0.U_TIMESTAMP as U_TIMESTAMP_0");
        lineList.add("  from BOOK dflocal");
        lineList.add("    left outer join AUTHOR dfrelation_0 on dflocal.AUTHOR_ID = dfrelation_0.AUTHOR_ID ");
        lineList.add(" where exists (--df:SubQueryBegin#bookId_ExistsSubQuery_CollectionList.subQueryMapKey1[1]#IdentityTerminal#");
        lineList.add("select dfsublocal_1.BOOK_ID ");
        lineList.add("  from COLLECTION dfsublocal_1");
        lineList.add("    left outer join LIBRARY dfrelation_1 on dfsublocal_1.LIBRARY_ID = dfrelation_1.LIBRARY_ID");
        lineList
                .add("    left outer join LIBRARY_TYPE_LOOKUP dfrelation_1_0 on dfrelation_1.LIBRARY_TYPE_CODE = dfrelation_1_0.LIBRARY_TYPE_CODE ");
        lineList.add(" where dfsublocal_1.BOOK_ID = dflocal.BOOK_ID");
        lineList
                .add("   and dfrelation_1.LIBRARY_ID >= /*dto.conditionQuery.bookId_ExistsSubQuery_CollectionList.subQueryMapKey1.conditionQueryLibrary.libraryId.greaterEqual*/null");
        lineList
                .add("   and dfrelation_1_0.LIBRARY_TYPE_CODE = /*dto.conditionQuery.bookId_ExistsSubQuery_CollectionList.subQueryMapKey1.conditionQueryLibrary.conditionQueryLibraryTypeLookup.libraryTypeCode.equal*/null");
        lineList
                .add("   and exists (--df:SubQueryBegin#collectionId_ExistsSubQuery_LendingCollectionList.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("select dfsublocal_0.COLLECTION_ID ");
        lineList.add("  from LENDING_COLLECTION dfsublocal_0 ");
        lineList.add(" where dfsublocal_0.COLLECTION_ID = dfsublocal_1.COLLECTION_ID");
        lineList
                .add("   and dfsublocal_0.COLLECTION_ID in (--df:SubQueryBegin#collectionId_InScopeSubQuery_Collection.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("select dfsublocal_0.COLLECTION_ID ");
        lineList.add("  from COLLECTION dfsublocal_0 ");
        lineList.add("       )--df:SubQueryEnd#collectionId_InScopeSubQuery_Collection.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("       )--df:SubQueryEnd#collectionId_ExistsSubQuery_LendingCollectionList.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("       )--df:SubQueryEnd#bookId_ExistsSubQuery_CollectionList.subQueryMapKey1[1]#IdentityTerminal#");
        lineList
                .add("   and dflocal.AUTHOR_ID in (--df:SubQueryBegin#authorId_InScopeSubQuery_Author.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("select dflocal.AUTHOR_ID ");
        lineList.add("  from AUTHOR dflocal ");
        lineList
                .add(" where dflocal.AUTHOR_ID in (--df:SubQueryBegin#authorId_InScopeSubQuery_BookList.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("select dflocal.AUTHOR_ID");
        lineList.add("  from BOOK dflocal ");
        lineList
                .add(" where dflocal.MAX_LENDING_DATE_COUNT < /*dto.conditionQuery.authorId_InScopeSubQuery_Author.subQueryMapKey1.authorId_InScopeSubQuery_BookList.subQueryMapKey1.maxLendingDateCount.lessThan*/null");
        lineList.add("       )--df:SubQueryEnd#authorId_InScopeSubQuery_BookList.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("       )--df:SubQueryEnd#authorId_InScopeSubQuery_Author.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("   and exists (--df:SubQueryBegin#bookId_ExistsSubQuery_CollectionList.subQueryMapKey2[1]#IdentityTerminal#");
        lineList.add("select dfsublocal_1.BOOK_ID ");
        lineList.add("  from COLLECTION dfsublocal_1");
        lineList.add("    left outer join LIBRARY dfrelation_1 on dfsublocal_1.LIBRARY_ID = dfrelation_1.LIBRARY_ID");

        // Too Many Begin!
        lineList.add(" where exists (--df:SubQueryBegin#Dummy!#IdentityTerminal#");

        lineList
                .add("    left outer join LIBRARY_TYPE_LOOKUP dfrelation_1_0 on dfrelation_1.LIBRARY_TYPE_CODE = dfrelation_1_0.LIBRARY_TYPE_CODE");
        lineList.add(" where dfsublocal_1.BOOK_ID = dflocal.BOOK_ID");
        lineList
                .add("   and dfrelation_1.LIBRARY_ID >= /*dto.conditionQuery.bookId_ExistsSubQuery_CollectionList.subQueryMapKey2.conditionQueryLibrary.libraryId.greaterEqual*/null");
        lineList
                .add("   and dfrelation_1_0.LIBRARY_TYPE_CODE = /*dto.conditionQuery.bookId_ExistsSubQuery_CollectionList.subQueryMapKey2.conditionQueryLibrary.conditionQueryLibraryTypeLookup.libraryTypeCode.equal*/null");
        lineList
                .add("   and exists (--df:SubQueryBegin#collectionId_ExistsSubQuery_LendingCollectionList.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("select dfsublocal_0.COLLECTION_ID ");
        lineList.add("  from LENDING_COLLECTION dfsublocal_0 ");
        lineList.add(" where dfsublocal_0.COLLECTION_ID = dfsublocal_1.COLLECTION_ID");
        lineList
                .add("   and dfsublocal_0.COLLECTION_ID in (--df:SubQueryBegin#collectionId_InScopeSubQuery_Collection.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("select dfsublocal_0.COLLECTION_ID ");
        lineList.add("  from COLLECTION dfsublocal_0 ");
        lineList.add("       )--df:SubQueryEnd#collectionId_InScopeSubQuery_Collection.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("       )--df:SubQueryEnd#collectionId_ExistsSubQuery_LendingCollectionList.subQueryMapKey1[0]#IdentityTerminal#");
        lineList.add("       )--df:SubQueryEnd#bookId_ExistsSubQuery_CollectionList.subQueryMapKey2[1]#IdentityTerminal#");

        final StringBuilder sb = new StringBuilder();
        for (String line : lineList) {
            sb.append(line).append(getLineSeparator());
        }
        final String sql = sb.toString();

        // ## Act & Assert ##
        try {
            String filteredSql = sqlClause.filterSubQueryIndent(sql);
            log(filteredSql);
            fail(getLineSeparator() + filteredSql);
        } catch (SubQueryIndentFailureException e) {
            // OK
            log(e.getMessage());
        }
    }
}

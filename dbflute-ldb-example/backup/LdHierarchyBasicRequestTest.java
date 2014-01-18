package dbflute.ldb.allcommon.dbmeta.hierarchy;

import java.util.List;

import dbflute.ContainerTestCase;
import dbflute.ldb.allcommon.dbmeta.info.LdColumnInfo;
import dbflute.ldb.allcommon.dbmeta.info.LdRelationInfo;
import dbflute.ldb.bsentity.customize.dbmeta.LdHierarchyFlatBookDbm;
import dbflute.ldb.bsentity.dbmeta.LdAuthorDbm;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;
import dbflute.ldb.exentity.LdBook;

/**
 * @author jflute
 * @since 0.5.5 (2007/08/08)
 */
public class LdHierarchyBasicRequestTest extends ContainerTestCase {

    @Override
    protected String getTestDiconPath() {
        return "test-ldb.dicon";
    }

    public void test_HierarchyBasicRequest_src_dst_Normal() throws Exception {
        // ## Arrange ##
        final LdHierarchyBasicRequest<LdBook, LdBookDbm.BookRelationTrace> request = createTarget();
        final LdHierarchyFlatBookDbm sourceDbm = LdHierarchyFlatBookDbm.getInstance();
        final LdBookDbm bookDbm = LdBookDbm.getInstance();
        final LdAuthorDbm authorDbm = LdAuthorDbm.getInstance();

        {
            // ## Act ##
            final LdColumnInfo bookId = sourceDbm.columnPrimaryBookId();
            request.src(bookId).dst().columnBookId();

            // ## Assert ##
            assertEquals(bookDbm, request.getDestinationDBMeta());
            final List<LdHierarchyRequestElement> requestElementList = request.getRequestElementList();
            assertFalse(requestElementList.isEmpty());
            assertEquals(1, requestElementList.size());
            final LdHierarchyRequestElement element = requestElementList.get(0);
            assertNotNull(element.getSourceColumnInfo());
            assertEquals(bookId.getColumnDbName(), element.getSourceColumnInfo().getColumnName());
            assertEquals(bookDbm.columnBookId(), element.getDestinationColumnInfo());
            assertTrue(element.getRelationInfoList().isEmpty());
        }
        {
            // ## Act ##
            final LdColumnInfo bookName = sourceDbm.columnAttributeBookName();
            request.src(bookName);
            request.dst().columnBookName();

            // ## Assert ##
            assertEquals(bookDbm, request.getDestinationDBMeta());
            final List<LdHierarchyRequestElement> requestElementList = request.getRequestElementList();
            assertFalse(requestElementList.isEmpty());
            assertEquals(2, requestElementList.size());
            final LdHierarchyRequestElement element = requestElementList.get(1);
            assertNotNull(element.getSourceColumnInfo());
            assertEquals(bookName.getColumnDbName(), element.getSourceColumnInfo().getColumnName());
            assertEquals(bookDbm.columnBookName(), element.getDestinationColumnInfo());
            assertTrue(element.getRelationInfoList().isEmpty());
        }
        {
            // ## Act ##
            final LdColumnInfo authorName = sourceDbm.columnAttributeAuthorName();
            request.src(authorName).dst().foreignAuthor().columnAuthorName();

            // ## Assert ##
            assertEquals(bookDbm, request.getDestinationDBMeta());
            final List<LdHierarchyRequestElement> requestElementList = request.getRequestElementList();
            assertFalse(requestElementList.isEmpty());
            assertEquals(3, requestElementList.size());
            final LdHierarchyRequestElement element = requestElementList.get(2);
            assertNotNull(element.getSourceColumnInfo());
            assertEquals(authorName.getColumnDbName(), element.getSourceColumnInfo().getColumnName());
            assertEquals(authorDbm.columnAuthorName(), element.getDestinationColumnInfo());
            assertFalse(element.getRelationInfoList().isEmpty());
            assertEquals(1, element.getRelationInfoList().size());
            final LdRelationInfo relationInfo = element.getRelationInfoList().get(0);
            assertEquals(bookDbm.foreignAuthor().getForeignPropertyName(), relationInfo.getRelationPropertyName());
        }
    }

    protected LdHierarchyBasicRequest<LdBook, LdBookDbm.BookRelationTrace> createTarget() {
        return new LdHierarchyBasicRequest<LdBook, LdBookDbm.BookRelationTrace>(LdBook.class);
    }
}

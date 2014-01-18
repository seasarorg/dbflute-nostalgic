package dbflute.ldb.allcommon.dbmeta.hierarchy;

import java.util.ArrayList;

import junit.framework.TestCase;
import dbflute.ldb.allcommon.dbmeta.info.LdRelationInfo;
import dbflute.ldb.bsentity.customize.dbmeta.LdHierarchyFlatBookDbm;
import dbflute.ldb.bsentity.customize.dbmeta.LdHierarchyFlatLibraryDbm;
import dbflute.ldb.bsentity.dbmeta.LdAuthorDbm;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;
import dbflute.ldb.exentity.LdBook;

/**
 * 
 * @author jflute
 * @since 0.5.5 (2007/08/07)
 */
public class LdHierarchyRequestTest extends TestCase {

    public void test_HierarchyRequest_relation_WithoutInvokingMapping() throws Exception {
        final LdHierarchyRequest<LdBook> request = new LdHierarchyRequest<LdBook>(LdBook.class);
        try {
            request.addRelationToLastElement(new ArrayList<LdRelationInfo>());
            fail();
        } catch (IllegalStateException e) {
            // OK
            System.out.println(e.getMessage());
        }
    }

    public void test_HierarchyRequest_mapping_SameSourceColumnInfoCheck() throws Exception {
        final LdHierarchyRequest<LdBook> request = new LdHierarchyRequest<LdBook>(LdBook.class);
        final LdHierarchyFlatBookDbm bookSourceDbm = LdHierarchyFlatBookDbm.getInstance();

        request.setupElement(bookSourceDbm.columnAttributeBookName(), LdBookDbm.getInstance().columnBookId());
        try {
            request.setupElement(bookSourceDbm.columnAttributeBookName(), LdBookDbm.getInstance().columnBookName());
            fail();
        } catch (IllegalStateException e) {
            // OK
            System.out.println(e.getMessage());
        }
    }

    public void test_HierarchyRequest_mapping_SameSourceDBMetaCheck() throws Exception {
        final LdHierarchyRequest<LdBook> request = new LdHierarchyRequest<LdBook>(LdBook.class);
        final LdHierarchyFlatBookDbm bookSourceDbm = LdHierarchyFlatBookDbm.getInstance();
        final LdHierarchyFlatLibraryDbm librarySourceDbm = LdHierarchyFlatLibraryDbm.getInstance();

        request.setupElement(bookSourceDbm.columnAttributeBookName(), LdBookDbm.getInstance().columnBookName());
        try {
            request.setupElement(librarySourceDbm.columnCollectionBookId(), LdBookDbm.getInstance().columnBookId());
            fail();
        } catch (IllegalStateException e) {
            // OK
            System.out.println(e.getMessage());
        }
    }

    public void test_HierarchyRequest_mapping_CurrentElementSameLocalDestinationDBMetaCheck() throws Exception {
        final LdHierarchyRequest<LdBook> request = new LdHierarchyRequest<LdBook>(LdBook.class);
        final LdHierarchyFlatBookDbm sourceDbm = LdHierarchyFlatBookDbm.getInstance();

        request.setupElement(sourceDbm.columnAttributeBookName(), LdBookDbm.getInstance().columnBookName());
        request.setupElement(sourceDbm.columnAttributeAuthorName(), LdAuthorDbm.getInstance().columnAuthorAge());
        try {
            request.setupElement(sourceDbm.columnPrimaryCollectionStatusCode(), LdBookDbm.getInstance().columnBookId());
            fail();
        } catch (IllegalStateException e) {
            // OK
            System.out.println(e.getMessage());
        }
    }
}

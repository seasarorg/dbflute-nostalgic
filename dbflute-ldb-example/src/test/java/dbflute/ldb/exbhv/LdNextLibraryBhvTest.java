package dbflute.ldb.exbhv;

import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.cbean.LdNextLibraryCB;
import dbflute.ldb.exentity.LdLibrary;
import dbflute.ldb.exentity.LdLibraryTypeLookup;
import dbflute.ldb.exentity.LdNextLibrary;
import dbflute.ldb.testbase.LdNextLibraryAllDbTestCase;

/**
 * @author jflute
 */
public class LdNextLibraryBhvTest extends LdNextLibraryAllDbTestCase {

    public void test_dynamic_Tx() {
        final LdNextLibraryCB cb = new LdNextLibraryCB();
        cb.setupSelect_LibraryByBaseId();
        cb.setupSelect_LibraryByNextId();
        final LdListResultBean<LdNextLibrary> ls = getMyBhv().selectList(cb);
        for (LdNextLibrary nextLibrary : ls) {
            final LdLibrary libraryByBaseId = nextLibrary.getLibraryByBaseId();
            final LdLibrary libraryByNextId = nextLibrary.getLibraryByNextId();
            log(libraryByBaseId.getLibraryName() + " : " + libraryByNextId.getLibraryName());
        }
    }

    public void test_MultipleFK_and_withParentParent_GetOK_Tx() {
        // ## Arrange ##
        final LdNextLibraryCB cb = getMyBhv().newMyConditionBean();
        cb.setupSelect_LibraryByBaseId().withLibraryTypeLookup();
        cb.setupSelect_LibraryByNextId().withLibraryTypeLookup();

        // ## Act ##
        final LdListResultBean<LdNextLibrary> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (LdNextLibrary nextLibrary : ls) {
            final LdLibrary libraryByBaseId = nextLibrary.getLibraryByBaseId();
            assertNotNull(libraryByBaseId);
            final LdLibraryTypeLookup libraryTypeLookupByBaseId = libraryByBaseId.getLibraryTypeLookup();
            log("baseId's lookup: " + libraryTypeLookupByBaseId);
            assertNotNull(libraryTypeLookupByBaseId);

            final LdLibrary libraryByNextId = nextLibrary.getLibraryByNextId();
            assertNotNull(libraryByNextId);
            final LdLibraryTypeLookup libraryTypeLookupByNextId = libraryByNextId.getLibraryTypeLookup();
            log("nextId's lookup: " + libraryTypeLookupByNextId);
            assertNotNull(libraryTypeLookupByNextId);
        }
    }
}

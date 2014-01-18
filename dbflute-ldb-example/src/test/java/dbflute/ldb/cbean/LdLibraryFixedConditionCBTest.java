package dbflute.ldb.cbean;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import dbflute.ldb.allcommon.bhv.setup.LdConditionBeanSetupper;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdSubQuery;
import dbflute.ldb.exentity.LdLibrary;
import dbflute.ldb.exentity.LdNextLibrary;
import dbflute.ldb.testbase.LdLibraryAllDbTestCase;

/**
 * @author jflute
 */
public class LdLibraryFixedConditionCBTest extends LdLibraryAllDbTestCase {

    public void test_setupSelect_NextLibraryAsNext_Tx() {
        // ## Arrange ##
        final int targetNextLibraryId = 9;
        LdLibraryCB cb = new LdLibraryCB();
        cb.setupSelect_NextLibraryAsNext(targetNextLibraryId).withLibraryByNextId();
        cb.query().existsNextLibraryByBaseIdList(new LdSubQuery<LdNextLibraryCB>() {
            public void query(LdNextLibraryCB subCB) {
                subCB.query().setNextLibraryId_Equal(targetNextLibraryId);
            }
        });

        // ## Act ##
        LdListResultBean<LdLibrary> libraryList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(libraryList);
        for (LdLibrary library : libraryList) {
            Integer libraryId = library.getLibraryId();
            String libraryName = library.getLibraryName();
            LdNextLibrary nextLibraryAsNext = library.getNextLibraryAsNext();
            assertNotNull(nextLibraryAsNext);
            assertEquals(library.getLibraryId(), nextLibraryAsNext.getLibraryId());
            BigDecimal distanceKm = nextLibraryAsNext.getDistanceKm();
            assertNotNull(distanceKm);
            LdLibrary libraryByNextId = nextLibraryAsNext.getLibraryByNextId();
            String nextLibraryName = libraryByNextId.getLibraryName();
            log(libraryId + ", " + libraryName + ", " + distanceKm + ", " + nextLibraryName);
        }
    }

    public void test_query_NextLibraryAsNext_Tx() {
        // ## Arrange ##
        final int targetNextLibraryId = 9;
        final BigDecimal targetDistanceKm = new BigDecimal(7);
        LdLibraryCB cb = new LdLibraryCB();
        cb.query().queryNextLibraryAsNext(targetNextLibraryId).setDistanceKm_LessEqual(targetDistanceKm);

        // ## Act ##
        LdListResultBean<LdLibrary> libraryList = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(libraryList);
        getMyBhv().selectList(cb);
        for (LdLibrary library : libraryList) {
            assertNull(library.getNextLibraryAsNext());
        }
        getMyBhv().loadNextLibraryByBaseIdList(libraryList, new LdConditionBeanSetupper<LdNextLibraryCB>() {
            public void setup(LdNextLibraryCB cb) {
                cb.setupSelect_LibraryByNextId();
                cb.query().setNextLibraryId_Equal(targetNextLibraryId);
                cb.query().setDistanceKm_LessEqual(targetDistanceKm);
            }
        });
        for (LdLibrary library : libraryList) {
            Integer libraryId = library.getLibraryId();
            String libraryName = library.getLibraryName();
            final List<LdNextLibrary> nextLibraryByBaseIdList = library.getNextLibraryByBaseIdList();
            assertListNotEmtpy(nextLibraryByBaseIdList);
            log(libraryId + ", " + libraryName);
            for (LdNextLibrary nextLibrary : nextLibraryByBaseIdList) {
                BigDecimal distanceKm = nextLibrary.getDistanceKm();
                assertTrue(distanceKm.compareTo(targetDistanceKm) < 0);
                LdLibrary libraryByNextId = nextLibrary.getLibraryByNextId();
                String nextLibraryName = libraryByNextId.getLibraryName();
                log("    " + distanceKm + ", " + nextLibraryName);
            }
        }
    }

    public void test_setupSelect_LibraryUserAsUser_Tx() {
        // ## Arrange ##
        LdLibraryCB cb = new LdLibraryCB();
        cb.setupSelect_LibraryUserAsUser(3, "str", Arrays.asList(1, 2));

        // ## Act & Assert ##
        getMyBhv().selectList(cb); // Expect no exception
    }
}

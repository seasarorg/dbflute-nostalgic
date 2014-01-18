package dbflute.ldb.allcommon.dbmeta;

import dbflute.PlainTestCase;
import dbflute.ldb.allcommon.exception.LdDBMetaNotFoundException;
import dbflute.ldb.bsentity.dbmeta.LdAuthorDbm;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;
import dbflute.ldb.bsentity.dbmeta.LdCollectionDbm;

/**
 * The test of DBMetaInstanceHandler.
 * 
 * @author jflute
 * @since 0.5.5 (2007/08/07)
 */
public class LdDBMetaInstanceHandlerTest extends PlainTestCase {

    // ===================================================================================
    //                                                                                Main
    //                                                                                ====
    public void test_DBMetaInstanceHandler_findDBMeta() throws Exception {
        assert_findDBMeta(LdBookDbm.getInstance());
        assert_findDBMeta(LdAuthorDbm.getInstance());
        assert_findDBMeta(LdCollectionDbm.getInstance());
    }

    public void test_DBMetaInstanceHandler_findDBMeta_SchemaNameHandling() throws Exception {
        assert_findDBMeta(LdBookDbm.getInstance(), "xxx");
        assert_findDBMeta(LdAuthorDbm.getInstance(), "xxx.yyy");
        assert_findDBMeta(LdCollectionDbm.getInstance(), "xxx.yyy...");
    }

    public void test_DBMetaInstanceHandler_findDBMeta_NoExist() throws Exception {
        try {
            execute_findDBMeta("NoExist");
            fail();
        } catch (LdDBMetaNotFoundException e) {
            // OK
            System.out.println(e.getMessage());
        }
        try {
            execute_findDBMeta("xxx.NoExist");
            fail();
        } catch (LdDBMetaNotFoundException e) {
            // OK
            System.out.println(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                              Assert
    //                                                                              ======
    protected void assert_findDBMeta(LdDBMeta dbmeta) {
        assertEquals(dbmeta, execute_findDBMeta(dbmeta.getTableDbName()));
        assertEquals(dbmeta, execute_findDBMeta(dbmeta.getTableDbName().toLowerCase()));
        assertEquals(dbmeta, execute_findDBMeta(dbmeta.getTableDbName().toUpperCase()));
        assertEquals(dbmeta, execute_findDBMeta(dbmeta.getTablePropertyName()));
        assertEquals(dbmeta, execute_findDBMeta(dbmeta.getTablePropertyName().toLowerCase()));
        assertEquals(dbmeta, execute_findDBMeta(dbmeta.getTablePropertyName().toUpperCase()));
    }

    protected void assert_findDBMeta(LdDBMeta dbmeta, String schema) {
        assertEquals(dbmeta, execute_findDBMeta(schema + "." + dbmeta.getTableDbName()));
        assertEquals(dbmeta, execute_findDBMeta(schema + "." + dbmeta.getTableDbName().toLowerCase()));
        assertEquals(dbmeta, execute_findDBMeta(schema + "." + dbmeta.getTableDbName().toUpperCase()));
        assertEquals(dbmeta, execute_findDBMeta(schema + "." + dbmeta.getTablePropertyName()));
        assertEquals(dbmeta, execute_findDBMeta(schema + "." + dbmeta.getTablePropertyName().toLowerCase()));
        assertEquals(dbmeta, execute_findDBMeta(schema + "." + dbmeta.getTablePropertyName().toUpperCase()));
    }

    protected LdDBMeta execute_findDBMeta(String name) {
        return LdDBMetaInstanceHandler.findDBMeta(name);
    }
}

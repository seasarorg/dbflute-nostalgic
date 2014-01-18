package dbflute.ldb.dbmeta;

import java.util.List;

import dbflute.ldb.allcommon.dbmeta.info.LdColumnInfo;
import dbflute.ldb.allcommon.dbmeta.info.LdForeignInfo;
import dbflute.ldb.allcommon.dbmeta.info.LdReferrerInfo;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookDbmTest extends LdBookAllDbTestCase {

    public void test_columnInfo() {
        // ## Arrange & Act ##
        LdColumnInfo columnInfo = LdBookDbm.getInstance().columnBookId();

        // ## Assert ##
        assertNotNull(columnInfo);
        assertNotNull(columnInfo.getColumnDbName());
        assertNotNull(columnInfo.getPropertyName());
        assertNotNull(columnInfo.getPropertyType());
        assertNull(columnInfo.getColumnAlias()); // because it does not use alias definition.
    }
    
    public void test_getForeignInfoList() {
        // ## Arrange & Act ##
        List<LdForeignInfo> foreignInfoList = LdBookDbm.getInstance().getForeignInfoList();
        
        // ## Assert ##
        assertNotNull(foreignInfoList);
        for (LdForeignInfo foreignInfo : foreignInfoList) {
            log(foreignInfo);
        }
    }
    
    public void test_getReferrerInfoList() {
        // ## Arrange & Act ##
        List<LdReferrerInfo> referrerInfoList = LdBookDbm.getInstance().getReferrerInfoList();
        
        // ## Assert ##
        assertNotNull(referrerInfoList);
        for (LdReferrerInfo referrerInfo : referrerInfoList) {
            log(referrerInfo);
        }
    }

    public void test_hasIdentity() {
        assertTrue(getDBMeta().hasIdentity());
    }

    public void test_DBMeta_findDbName() {
        assertEquals("BOOK_ID", getDBMeta().findDbName("BookId"));
    }

    public void test_DBMeta_findColumnInfo() {
        assertEquals("bookId", getDBMeta().findColumnInfo("BOOK_ID").getPropertyName());
    }

    public void test_DBMeta_getColumnInfoList() throws Exception {
        final List<LdColumnInfo> columnDbNameList = getDBMeta().getColumnInfoList();
        if (columnDbNameList.contains(LdBookDbm.getInstance().getTableDbName())) {
            fail();
        }
        for (LdColumnInfo columnInfo : columnDbNameList) {
            final String dbName = getDBMeta().findDbName(columnInfo.getColumnDbName());// Expected no exception!
            assertNotNull(dbName);
        }
    }

    public void test_DBMeta_column() throws Exception {
        final LdColumnInfo columnBookName = LdBookDbm.getInstance().columnBookName();
        final Integer columnSize = columnBookName.getColumnSize();
        _log.debug(columnBookName.getColumnDbName() + ": columnSize=" + columnSize);
        assertNotSame(0, columnSize);
    }

    public void test_columnXxx_updateDate() {
        assertFalse(LdBookDbm.getInstance().columnBookName().isUpdateDate());
        assertFalse(LdBookDbm.getInstance().columnBookName().isVersionNo());
        assertTrue(LdBookDbm.getInstance().columnUTimestamp().isUpdateDate());
        assertFalse(LdBookDbm.getInstance().columnUTimestamp().isVersionNo());

    }
}

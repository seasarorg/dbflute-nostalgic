package dbflute.ldb.allcommon.cbean.outsidesql;

import java.util.LinkedHashMap;
import java.util.Map;

import dbflute.ContainerTestCase;
import dbflute.ldb.allcommon.LdDBFluteConfig;
import dbflute.ldb.allcommon.bhv.core.LdResourceContext;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaProvider;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;
import dbflute.ldb.exbhv.LdBookBhv;

/**
 * @author jflute
 * @since 0.5.7 (2007/11/05 Monday)
 */
public class LdOutsideSqlContextTest extends ContainerTestCase {

    @Override
    protected String getTestDiconPath() {
        return "dbflute.dicon";
    }

    public void test_readOutsideSqlPath_StandardPathExists() throws Exception {
        // ## Arrange ##
        final String expectedText = "readText";
        final String outsideSqlPath = "outsideSqlPath/xxx.sql";
        final String sqlFileEncoding = "sqlFileEncoding";
        final String dbmsSuffix = "_dbflute";
        final Map<String, String> actualPath = new LinkedHashMap<String, String>();
        final LdOutsideSqlContext context = new LdOutsideSqlContext(provider(), null) {
            @Override
            protected boolean isExistResource(String path) {
                return !path.contains(dbmsSuffix);
            }

            @Override
            protected String readText(String path, String sqlFileEncoding) {
                actualPath.put("path", path);
                actualPath.put("sqlFileEncoding", sqlFileEncoding);
                return expectedText;
            }
        };
        context.setOutsideSqlPath(outsideSqlPath);

        // ## Act ##
        final String actualSql = context.readOutsideSql(sqlFileEncoding, dbmsSuffix);

        // ## Assert ##
        assertEquals(expectedText, actualSql);
        assertEquals(outsideSqlPath, actualPath.get("path"));
        assertEquals(sqlFileEncoding, actualPath.get("sqlFileEncoding"));
    }

    public void test_readOutsideSqlPath_DbmsPathExists() throws Exception {
        // ## Arrange ##
        final String expectedText = "readText";
        final String outsideSqlPath = "outsideSqlPath/xxx.sql";
        final String sqlFileEncoding = "sqlFileEncoding";
        final String dbmsSuffix = "_dbflute";
        final Map<String, String> actualPath = new LinkedHashMap<String, String>();
        final LdOutsideSqlContext context = new LdOutsideSqlContext(provider(), null) {
            @Override
            protected boolean isExistResource(String path) {
                return path.contains(dbmsSuffix);
            }

            @Override
            protected String readText(String path, String sqlFileEncoding) {
                actualPath.put("path", path);
                actualPath.put("sqlFileEncoding", sqlFileEncoding);
                return expectedText;
            }
        };
        context.setOutsideSqlPath(outsideSqlPath);

        // ## Act ##
        final String actualSql = context.readOutsideSql(sqlFileEncoding, dbmsSuffix);

        // ## Assert ##
        assertEquals(expectedText, actualSql);
        assertEquals("outsideSqlPath/xxx_dbflute.sql", actualPath.get("path"));
        assertEquals(sqlFileEncoding, actualPath.get("sqlFileEncoding"));
    }

    public void test_buildDbmsPath_FileExtensionExists_Normally() throws Exception {
        // ## Arrange ##
        final String standardPathBase = "outsideSqlPath/xxx";
        final String standardPathExtension = ".sql";
        final String dbmsSuffix = "_dbflute";
        final LdOutsideSqlContext context = new LdOutsideSqlContext(provider(), null);

        // ## Act ##
        final String dbmsPath = context.buildDbmsPath(standardPathBase + standardPathExtension, dbmsSuffix);

        // ## Assert ##
        assertEquals(standardPathBase + dbmsSuffix + standardPathExtension, dbmsPath);
    }

    public void test_buildDbmsPath_FileExtensionNotExists_Normally() throws Exception {
        // ## Arrange ##
        final String standardPathBase = "outsideSqlPath/xxx";
        final String standardPathExtension = "";
        final String dbmsSuffix = "_dbflute";
        final LdOutsideSqlContext context = new LdOutsideSqlContext(provider(), null);

        // ## Act ##
        final String dbmsPath = context.buildDbmsPath(standardPathBase + standardPathExtension, dbmsSuffix);

        // ## Assert ##
        assertEquals(standardPathBase + dbmsSuffix + standardPathExtension, dbmsPath);
    }

    public void test_buildDbmsPath_FileExtensionNotExists_ButDirectoryHasDot() throws Exception {
        // ## Arrange ##
        final String standardPathBase = "outside.SqlPath/xxx";
        final String standardPathExtension = "";
        final String dbmsSuffix = "_dbflute";
        final LdOutsideSqlContext context = new LdOutsideSqlContext(provider(), null);

        // ## Act ##
        final String dbmsPath = context.buildDbmsPath(standardPathBase + standardPathExtension, dbmsSuffix);

        // ## Assert ##
        assertEquals(standardPathBase + dbmsSuffix + standardPathExtension, dbmsPath);
    }

    public void test_buildBehaviorSqlPackageName_when_sqlPackage_is_null_Tx() {
        // ## Arrange ##
        final LdOutsideSqlContext context = new LdOutsideSqlContext(provider(), null);
        context.setTableDbName(LdBookDbm.getInstance().getTableDbName());

        // ## Act ##
        final String sqlPackageName = context.buildBehaviorSqlPackageName();

        // ## Assert ##
        // This project's default is that sqlPackage is null.
        assertEquals(LdBookDbm.getInstance().getBehaviorTypeName(), sqlPackageName);
    }

    public void test_buildBehaviorSqlPackageName_when_sqlPackage_is_valid_Tx() {
        // ## Arrange ##
        final String original = LdDBFluteConfig.getInstance().getOutsideSqlPackage();
        LdDBFluteConfig.getInstance().unlock();
        LdDBFluteConfig.getInstance().setOutsideSqlPackage("abc.def.ghi");
        LdDBFluteConfig.getInstance().lock();
        try {
            String outsideSqlPackage = LdDBFluteConfig.getInstance().getOutsideSqlPackage();
            final LdOutsideSqlContext context = new LdOutsideSqlContext(provider(), outsideSqlPackage);
            context.setTableDbName(LdBookDbm.getInstance().getTableDbName());

            // ## Act ##
            final String sqlPackageName = context.buildBehaviorSqlPackageName();

            // ## Assert ##
            assertEquals("abc.def.ghi.exbhv." + LdBookBhv.class.getSimpleName(), sqlPackageName);
        } finally {
            LdDBFluteConfig.getInstance().unlock();
            LdDBFluteConfig.getInstance().setOutsideSqlPackage(original);
            LdDBFluteConfig.getInstance().lock();
            LdResourceContext.clearResourceContextOnThread();
        }
    }
    
    protected LdDBMetaProvider provider() {
        return new LdDBMetaInstanceHandler();
    }
}

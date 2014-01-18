package dbflute.ldb.allcommon.cbean.sqlclause;

import dbflute.ContainerTestCase;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;
import dbflute.ldb.bsentity.dbmeta.LdGarbageDbm;

/**
 * 
 * @author jflute
 * @since 0.5.4 (2007/07/24)
 */
public class LdSqlClauseOracleTest extends ContainerTestCase {

    @Override
    protected String getTestDiconPath() {
        return "dbflute.dicon";
    }

    public void test_lockForUpdate_ExistingPrimaryKey() throws Exception {
        // ## Arrange ##
        final LdSqlClauseOracle sqlClauseOracle = new LdSqlClauseOracle(LdBookDbm.getInstance().getTableDbName());
        sqlClauseOracle.provider(new LdDBMetaInstanceHandler());

        // ## Act ##
        sqlClauseOracle.lockForUpdate();

        // ## Assert ##
        log(sqlClauseOracle._lockSqlSuffix);
        final String localTableAliasName = sqlClauseOracle.getLocalTableAliasName();
        final String columnName = LdBookDbm.getInstance().getPrimaryUniqueInfo().getFirstColumn().getColumnDbName();
        assertEquals(" for update of " + localTableAliasName + "." + columnName, sqlClauseOracle._lockSqlSuffix);
    }

    public void test_lockForUpdate_NotExistingPrimaryKey() throws Exception {
        // ## Arrange ##
        final LdSqlClauseOracle sqlClauseOracle = new LdSqlClauseOracle(LdGarbageDbm.getInstance().getTableDbName());
        sqlClauseOracle.provider(new LdDBMetaInstanceHandler());

        // ## Act ##
        sqlClauseOracle.lockForUpdate();

        // ## Assert ##
        log(sqlClauseOracle._lockSqlSuffix);
        final String localTableAliasName = sqlClauseOracle.getLocalTableAliasName();
        final String columnName = LdGarbageDbm.getInstance().getColumnInfoList().get(0).getColumnDbName();
        assertEquals(" for update of " + localTableAliasName + "." + columnName, sqlClauseOracle._lockSqlSuffix);
    }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon;

import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaProvider;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.sqlclause.*;

/**
 * The creator of SQL clause.
 * @author DBFlute(AutoGenerator)
 */
public class LdImplementedSqlClauseCreator implements LdSqlClauseCreator {

	/**
	 * Create SQL clause. {for condition-bean}
	 * @param cb Condition-bean. (NotNull) 
	 * @return SQL clause. (NotNull)
	 */
    public LdSqlClause createSqlClause(LdConditionBean cb) {
        final String tableSqlName = cb.getTableSqlName();
		final LdSqlClause sqlClause = createSqlClause(tableSqlName);
        return sqlClause;
    }

	/**
	 * Create SQL clause.
	 * @param tableDbName The DB name of table. (NotNull) 
	 * @return SQL clause. (NotNull)
	 */
    public LdSqlClause createSqlClause(String tableDbName) {
        LdDBMetaProvider dbmetaProvider = new LdDBMetaInstanceHandler();
        if (isCurrentDBDef(LdDBDef.MySQL)) {
            return new LdSqlClauseMySql(tableDbName).provider(dbmetaProvider);
        } else if (isCurrentDBDef(LdDBDef.PostgreSQL)) {
            return new LdSqlClausePostgreSql(tableDbName).provider(dbmetaProvider);
        } else if (isCurrentDBDef(LdDBDef.Oracle)) {
            return new LdSqlClauseOracle(tableDbName).provider(dbmetaProvider);
        } else if (isCurrentDBDef(LdDBDef.DB2)) {
            return new LdSqlClauseDb2(tableDbName).provider(dbmetaProvider);
        } else if (isCurrentDBDef(LdDBDef.SQLServer)) {
            return new LdSqlClauseSqlServer(tableDbName).provider(dbmetaProvider);
        } else if (isCurrentDBDef(LdDBDef.FireBird)) {
            return new LdSqlClauseFirebird(tableDbName).provider(dbmetaProvider);
        } else if (isCurrentDBDef(LdDBDef.H2)) {
            return new LdSqlClauseH2(tableDbName).provider(dbmetaProvider);
        } else if (isCurrentDBDef(LdDBDef.Derby)) {
            return new LdSqlClauseDerby(tableDbName).provider(dbmetaProvider);
        } else {
            return new LdSqlClauseDerby(tableDbName).provider(dbmetaProvider);
        }
    }

    protected boolean isCurrentDBDef(LdDBDef currentDBDef) {
	    return LdDBCurrent.getInstance().isCurrentDBDef(currentDBDef);
    }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao;

import dbflute.ldb.allcommon.jdbc.LdLatestSqlProvider;
import dbflute.ldb.allcommon.s2dao.internal.sqllog.LdInternalSqlLogRegistry;

/**
 * The provider of latest SQL using SqlLogRegistry.
 * This instance should be singleton.
 * @author DBFlute(AutoGenerator)
 */
public class LdSqlLogRegistryLatestSqlProvider implements LdLatestSqlProvider {

    public String getDisplaySql() {
        return LdInternalSqlLogRegistry.peekCompleteSql();
    }

	public void clearSqlCache() {
        LdInternalSqlLogRegistry.clearSqlLogRegistry();
	}
}

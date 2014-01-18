package com.example.dbflute.teeda.dbflute.allcommon.s2dao;

import com.example.dbflute.teeda.dbflute.allcommon.jdbc.LatestSqlProvider;
import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqllog.InternalSqlLogRegistry;

/**
 * The provider of latest SQL using SqlLogRegistry.
 * This instance should be singleton.
 * @author DBFlute(AutoGenerator)
 */
public class SqlLogRegistryLatestSqlProvider implements LatestSqlProvider {

    public String getDisplaySql() {
        return InternalSqlLogRegistry.peekCompleteSql();
    }

	public void clearSqlCache() {
        InternalSqlLogRegistry.clearSqlLogRegistry();
	}
}

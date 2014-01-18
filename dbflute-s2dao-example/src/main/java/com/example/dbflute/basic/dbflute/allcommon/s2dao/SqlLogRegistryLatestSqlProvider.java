package com.example.dbflute.basic.dbflute.allcommon.s2dao;

import com.example.dbflute.basic.dbflute.allcommon.jdbc.LatestSqlProvider;
import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqllog.InternalSqlLogRegistry;

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

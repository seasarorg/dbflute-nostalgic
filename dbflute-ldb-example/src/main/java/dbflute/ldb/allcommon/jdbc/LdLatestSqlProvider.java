/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.jdbc;

/**
 * The provider of latest SQL.
 * @author DBFlute(AutoGenerator)
 */
public interface LdLatestSqlProvider {

    /**
     * Get display SQL.
     * @return Display SQL. (Nullable: If it was not found, returns null.)
     */
    public String getDisplaySql();

	/**
	 * Clear the cache of SQL.
	 */
	public void clearSqlCache();
}

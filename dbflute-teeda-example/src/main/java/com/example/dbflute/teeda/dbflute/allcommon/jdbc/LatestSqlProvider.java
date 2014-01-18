package com.example.dbflute.teeda.dbflute.allcommon.jdbc;

/**
 * The provider of latest SQL.
 * @author DBFlute(AutoGenerator)
 */
public interface LatestSqlProvider {

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

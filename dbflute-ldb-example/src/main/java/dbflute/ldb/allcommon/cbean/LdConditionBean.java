/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean;

import java.util.Map;

import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.allcommon.jdbc.LdStatementConfig;

/**
 * The interface of condition-bean.
 * @author DBFlute(AutoGenerator)
 */
public interface LdConditionBean extends LdPagingBean {

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * Get table DB-name.
     * @return Table DB-name. (NotNull)
     */
    public String getTableDbName();

    /**
     * Get table SQL-name.
     * @return Table SQL-name. (NotNull)
     */
    public String getTableSqlName();

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    /**
     * Get SQL-clause instance.
     * @return SQL-clause. (NotNull)
     */
    public LdSqlClause getSqlClause();

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    /**
     * Accept primary-key map-string.
     * @param primaryKeyMap Primary-key map. (NotNull and NotEmpty)
     */
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap);

    /**
     * Accept primary-key map-string. Delimiter is at-mark and semicolon.
     * @param primaryKeyMapString Primary-key map. (NotNull and NotEmpty)
     */
    public void acceptPrimaryKeyMapString(String primaryKeyMapString);

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    /**
     * Add order-by PrimaryKey asc. {order by primaryKey1 asc, primaryKey2 asc...}
     * @return this. (NotNull)
     */
    public LdConditionBean addOrderBy_PK_Asc();

    /**
     * Add order-by PrimaryKey desc. {order by primaryKey1 desc, primaryKey2 desc...}
     * @return this. (NotNull)
     */
    public LdConditionBean addOrderBy_PK_Desc();

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Get the conditionQuery of the local table as interface.
     * @return The conditionQuery of the local table as interface. (NotNull)
     */
    public LdConditionQuery localCQ();

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    /**
     * Has union query or union all query?
     * @return Determination.
     */
    public boolean hasUnionQueryOrUnionAllQuery();

    // =====================================================================================
    //                                                                          Lock Setting
    //                                                                          ============
    /**
     * Lock for update.
	 * <p>
     * If you invoke this, your SQL lock target records for update.
     * It depends whether this method supports this on the database type.
     * </p>
     * @return this. (NotNull)
     */
    public LdConditionBean lockForUpdate();

    // =====================================================================================
    //                                                                          Select Count
    //                                                                          ============
    /**
     * Set up various things for select-count-ignore-fetch-scope. {Internal}
     * This method is for INTERNAL. Don't invoke this!
     * @return this. (NotNull)
     */
    public LdConditionBean xsetupSelectCountIgnoreFetchScope();

    /**
     * Do after-care for select-count-ignore-fetch-scope. {Internal}
     * This method is for INTERNAL. Don't invoke this!
     * @return this. (NotNull)
     */
    public LdConditionBean xafterCareSelectCountIgnoreFetchScope();

    /**
     * Is set up various things for select-count-ignore-fetch-scope? {Internal}
     * This method is for INTERNAL. Don't invoke this!
     * @return Determination.
     */
    public boolean isSelectCountIgnoreFetchScope();
	
    // =====================================================================================
    //                                                                      Statement Config
    //                                                                      ================
    /**
     * @param statementConfig The config of statement. (Nullable)
     */
	public void configure(LdStatementConfig statementConfig);
	
    /**
     * @return The config of statement. (Nullable)
     */
	public LdStatementConfig getStatementConfig();

    // ===================================================================================
    //                                                                         Display SQL
    //                                                                         ===========
	/**
	 * Convert this conditionBean to SQL for display.
	 * @return SQL for display. (NotNull and NotEmpty)
	 */
	public String toDisplaySql();
}

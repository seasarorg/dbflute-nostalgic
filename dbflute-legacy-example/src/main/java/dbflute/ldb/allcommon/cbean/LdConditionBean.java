package dbflute.ldb.allcommon.cbean;

import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;

/**
 * The condition-bean as interface.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface LdConditionBean extends LdPagingBean {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** Map-string map-mark. */
    public static final String MAP_STRING_MAP_MARK = "map:";

    /** Map-string list-mark. */
    public static final String MAP_STRING_LIST_MARK = "list:";

    /** Map-string start-brace. */
    public static final String MAP_STRING_START_BRACE = "@{";

    /** Map-string end-brace. */
    public static final String MAP_STRING_END_BRACE = "@}";

    /** Map-string delimiter. */
    public static final String MAP_STRING_DELIMITER = "@;";

    /** Map-string equal. */
    public static final String MAP_STRING_EQUAL = "@=";

    // =====================================================================================
    //                                                                            Table name
    //                                                                            ==========
    /**
     * Get table db-name.
     * 
     * @return Table db-name. (NotNull)
     */
    public String getTableDbName();

    // =====================================================================================
    //                                                                             SqlClause
    //                                                                             =========
    /**
     * Get sql-clause instance.
     * 
     * @return Sql-clause. (NotNull)
     */
    public LdSqlClause getSqlClause();

    // =====================================================================================
    //                                                                            PrimaryKey
    //                                                                            ==========
    /**
     * Accept primary-key map-string.
     * 
     * @param primaryKeyMap Primary-key map. (NotNull and NotEmpty)
     * @return this. (NotNull)
     */
    public LdConditionBean acceptPrimaryKeyMap(java.util.Map<String, ? extends Object> primaryKeyMap);

    /**
     * Accept primary-key map-string. Delimiter is at-mark and semicolon.
     * 
     * @param primaryKeyMapString Primary-key map. (NotNull and NotEmpty)
     * @return this. (NotNull)
     */
    public LdConditionBean acceptPrimaryKeyMapString(String primaryKeyMapString);

    // =====================================================================================
    //                                                                               OrderBy
    //                                                                               =======
    /**
     * Add order-by PrimaryKey asc. {order by primaryKey1 asc, primaryKey2 asc...}
     * 
     * @return this. (NotNull)
     */
    public LdConditionBean addOrderBy_PK_Asc();

    /**
     * Add order-by PrimaryKey desc. {order by primaryKey1 desc, primaryKey2 desc...}
     * 
     * @return this. (NotNull)
     */
    public LdConditionBean addOrderBy_PK_Desc();

    // =====================================================================================
    //                                                                                 Query
    //                                                                                 =====
    /**
     * Get condition-query as interface.
     * 
     * @return Instance of query as interface. (NotNull)
     */
    public LdConditionQuery getConditionQueryAsInterface();

    // =====================================================================================
    //                                                                          Limit Select
    //                                                                          ============
    /**
     * Is limit-select PK only?
     * 
     * @return Determination.
     */
    public boolean isLimitSelect_PKOnly();

    /**
     * Limit select PK only.
     *
     * @return this. (NotNull)
     */
    public LdConditionBean limitSelect_PKOnly();

    /**
     * Limit select off.
     *
     * @return this. (NotNull)
     */
    public LdConditionBean limitSelect_Off();

    // =====================================================================================
    //                                                                               Advance
    //                                                                               =======
    /**
     * Lock for update.
     * 
     * If you invoke this, your SQL lock target records for update.
     * It depends whether this method supports this on the database type.
     * 
     * @return this. (NotNull)
     */
    public LdConditionBean lockForUpdate();
}

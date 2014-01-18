package dbflute.ldb.allcommon;

import dbflute.ldb.allcommon.dbmeta.LdDBMeta;

/**
 * The interface of entity.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface LdEntity {

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
    //                                                                                DBMeta
    //                                                                                ======
    /**
     * Get dbmeta.
     * 
     * @return DBMeta. (NotNull)
     */
    public LdDBMeta getDBMeta();

    // =====================================================================================
    //                                                                            Table Name
    //                                                                            ==========
    /**
     * Get table db-name.
     * 
     * @return Table db-name. (NotNull)
     */
    public String getTableDbName();

    /**
     * Get table cap-prop-name.
     * 
     * @return Table cap-prop-name. (NotNull)
     */
    public String getTableCapPropName();

    /**
     * Get table uncap-prop-name.
     * 
     * @return Table uncap-prop-name. (NotNull)
     */
    public String getTableUncapPropName();

    // =====================================================================================
    //                                                                                Accept
    //                                                                                ======
    /**
     * Accept primary-key map.
     * 
     * @param primaryKeyMap Primary-key map. (NotNull and NotEmpty)
     * @return Instance of query. (NotNull)
     */
    public LdEntity acceptPrimaryKeyMap(java.util.Map<String, ? extends Object> primaryKeyMap);

    /**
     * Accept primary-key map-string.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     * @return this. (NotNull)
     */
    public LdEntity acceptPrimaryKeyMapString(String primaryKeyMapString);

    /**
     * Accept column-value map.
     * 
     * @param columnValueMap Column-value map. (NotNull and NotEmpty)
     * @return Instance of query. (NotNull)
     */
    public LdEntity acceptColumnValueMap(java.util.Map<String, ? extends Object> columnValueMap);

    /**
     * Accept column-value map-string.
     * 
     * @param columnValueMapString Column-value map-string. (NotNull)
     * @return this. (NotNull)
     */
    public LdEntity acceptColumnValueMapString(String columnValueMapString);

    // =====================================================================================
    //                                                                               Extract
    //                                                                               =======
    /**
     * Extract primary-key map-string. Delimiter is at-mark and semicolon.
     * <p>
     * <pre>
     * ex) Uses that this method have.
     *   final String primaryKeyMapString = entity.extractPrimaryKeyMapString();
     *   final LdBook entity = dao.selectEntity(new LdBookCB().acceptPrimaryKeyMapString(primaryKeyMapString));
     *   ... // as primary key for condition.
     * </pre>
     * 
     * @return Primary-key map-string. (NotNull)
     */
    public String extractPrimaryKeyMapString();

    /**
     * Extract column-value map-string. Delimiter is at-mark and semicolon.
     * 
     * @return Column-value map-string. (NotNull)
     */
    public String extractColumnValueMapString();

    // =====================================================================================
    //                                                                         Determination
    //                                                                         =============
    /**
     * Has primary-key value?
     * 
     * @return Determination.
     */
    public boolean hasPrimaryKeyValue();
}

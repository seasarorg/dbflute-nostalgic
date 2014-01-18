package dbflute.ldb.cbean;


import dbflute.ldb.allcommon.cbean.*;
import dbflute.ldb.allcommon.cbean.ckey.*;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;


/**
 * The condition-query of {table.Name}.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdLbUserCQ extends LdAbstractConditionQuery {

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     * 
     * @param childQuery Child query as abstract class. (Nullable: If null, this is base instance.)
     * @param sqlClause SQL clause instance. (NotNull)
     * @param aliasName My alias name. (NotNull)
     * @param nestLevel Nest level.
     */
    LdLbUserCQ(LdAbstractConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // =====================================================================================
    //                                                                            Table name
    //                                                                            ==========
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Table db-name. (NotNull)
     */
    final public String getTableDbName() {
        return "LB_USER";
    }

    // =====================================================================================
    //                                                                             Real name
    //                                                                             =========
    /**
     * Get real alias name(that has nest level mark).
     * 
     * @return Real alias name.
     */
    public String getRealAliasName() {
        if (getNestLevel() > 1) {
            return getAliasName() + "_n" + getNestLevel();
        } else {
            return getAliasName();
        }
    }

    /**
     * Get real column name(with real alias name).
     * 
     * @param columnName Column name without alias name. This should not contain comma. (NotNull)
     * @return Real column name.
     */
    public String getRealColumnName(String columnName) {
        assertColumnName(columnName);
        return getRealAliasName() + "." + columnName;
    }

    // =====================================================================================
    //                                                                         IncludeAsMine
    //                                                                         =============
  
    /**
     * Include select-column of lbUserId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_LbUserId() {
        return registerIncludedSelectColumn("LbUserId", getRealColumnName("LB_USER_ID"));
    }

    /**
     * Include select-column of lbUserId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_LbUserId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("LB_USER_ID"));
    }
  
    /**
     * Include select-column of lbUserName as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_LbUserName() {
        return registerIncludedSelectColumn("LbUserName", getRealColumnName("LB_USER_NAME"));
    }

    /**
     * Include select-column of lbUserName as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_LbUserName(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("LB_USER_NAME"));
    }
  
    /**
     * Include select-column of libraryId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_LibraryId() {
        return registerIncludedSelectColumn("LibraryId", getRealColumnName("LIBRARY_ID"));
    }

    /**
     * Include select-column of libraryId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_LibraryId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("LIBRARY_ID"));
    }
  
    /**
     * Include select-column of userPassword as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_UserPassword() {
        return registerIncludedSelectColumn("UserPassword", getRealColumnName("USER_PASSWORD"));
    }

    /**
     * Include select-column of userPassword as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_UserPassword(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("USER_PASSWORD"));
    }
  
    /**
     * Include select-column of rTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_RTime() {
        return registerIncludedSelectColumn("RTime", getRealColumnName("R_TIME"));
    }

    /**
     * Include select-column of rTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_RTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_TIME"));
    }
  
    /**
     * Include select-column of uTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_UTime() {
        return registerIncludedSelectColumn("UTime", getRealColumnName("U_TIME"));
    }

    /**
     * Include select-column of uTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_UTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_TIME"));
    }
  
    /**
     * Include select-column of rStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_RStaff() {
        return registerIncludedSelectColumn("RStaff", getRealColumnName("R_STAFF"));
    }

    /**
     * Include select-column of rStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_RStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_STAFF"));
    }
  
    /**
     * Include select-column of uStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_UStaff() {
        return registerIncludedSelectColumn("UStaff", getRealColumnName("U_STAFF"));
    }

    /**
     * Include select-column of uStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLbUserCQ includeAsMine_UStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_STAFF"));
    }
  
    /**
     * Register included-select-column.
     * 
     * @param aliasName Alias name. This should not contain comma. (NotNull)
     * @param realColumnName Real column name. This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    protected LdLbUserCQ registerIncludedSelectColumn(String aliasName, String realColumnName) {
        assertAliasName(aliasName);
        assertColumnName(realColumnName);
        getSqlClause().registerIncludedSelectColumn(aliasName, realColumnName);
        return this;
    }

    // =====================================================================================
    //                                                                                 Query
    //                                                                                 =====
      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   MyTable = [LB_USER]
    // * * * * * * * * */

      
    /** Column db name of lbUserId. */
    protected static final String COL_LB_USER_ID = "LB_USER_ID";

    /** Column java name of lbUserId. */
    protected static final String J_LbUserId = "LbUserId";

    /** Column uncapitalised java name of lbUserId. */
    protected static final String UJ_lbUserId = "lbUserId";

    /** The attribute of lbUserId. */
    protected LdConditionValue _lbUserId;

    /**
     * Get the value of lbUserId.
     * 
     * @return The value of lbUserId.
     */
    public LdConditionValue getLbUserId() {
        if (_lbUserId == null) {
            _lbUserId = new LdConditionValue();
        }
        return _lbUserId;
    }
            
    /**
     * Set the value of lbUserId as equal. { = }
     * 
     * @param value The value of lbUserId as equal.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_Equal(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of lbUserId as equal. { = }
     * 
     * @param value The value of lbUserId as equal.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_Equal(long value) {
        return registerLbUserId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as notEqual. { != }
     * 
     * @param value The value of lbUserId as notEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_NotEqual(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of lbUserId as notEqual. { != }
     * 
     * @param value The value of lbUserId as notEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_NotEqual(long value) {
        return registerLbUserId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as greaterThan. { &gt; }
     * 
     * @param value The value of lbUserId as greaterThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_GreaterThan(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of lbUserId as greaterThan. { &gt; }
     * 
     * @param value The value of lbUserId as greaterThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_GreaterThan(long value) {
        return registerLbUserId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as lessThan. { &lt; }
     * 
     * @param value The value of lbUserId as lessThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_LessThan(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of lbUserId as lessThan. { &lt; }
     * 
     * @param value The value of lbUserId as lessThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_LessThan(long value) {
        return registerLbUserId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as greaterEqual. { &gt;= }
     * 
     * @param value The value of lbUserId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_GreaterEqual(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of lbUserId as greaterEqual. { &gt;= }
     * 
     * @param value The value of lbUserId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_GreaterEqual(long value) {
        return registerLbUserId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as lessEqual. { &lt;= }
     * 
     * @param value The value of lbUserId as lessEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_LessEqual(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of lbUserId as lessEqual. { &lt;= }
     * 
     * @param value The value of lbUserId as lessEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_LessEqual(long value) {
        return registerLbUserId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of lbUserId as inScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLbUserId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of lbUserId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of lbUserId as notInScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLbUserId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
              
    /** The sub-query of LbUserId_InScopeSubQuery_BlackListList as inScopeSubQuery. */
    protected LdBlackListCQ _lbUserId_InScopeSubQuery_BlackListList;

    /**
     * Get the sub-query of LbUserId_InScopeSubQuery_BlackListList as inScopeSubQuery.
     * 
     * @return The sub-query of LbUserId_InScopeSubQuery_BlackListList as inScopeSubQuery. (Nullable)
     */
    public LdBlackListCQ getLbUserId_InScopeSubQuery_BlackListList() {
        return _lbUserId_InScopeSubQuery_BlackListList;
    }

    /**
     * Set the sub-query of LbUserId_InScopeSubQuery_BlackListList as inScopeSubQuery.
     * { in (select xxx.LB_USER_ID from BLACK_LIST where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of LbUserId_InScopeSubQuery_BlackListList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_InScopeSubQuery_BlackListList(LdBlackListCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _lbUserId_InScopeSubQuery_BlackListList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_LB_USER_ID), "LB_USER_ID", "lbUserId_InScopeSubQuery_BlackListList");
        return this;
    }
        
    /** The sub-query of LbUserId_InScopeSubQuery_LendingList as inScopeSubQuery. */
    protected LdLendingCQ _lbUserId_InScopeSubQuery_LendingList;

    /**
     * Get the sub-query of LbUserId_InScopeSubQuery_LendingList as inScopeSubQuery.
     * 
     * @return The sub-query of LbUserId_InScopeSubQuery_LendingList as inScopeSubQuery. (Nullable)
     */
    public LdLendingCQ getLbUserId_InScopeSubQuery_LendingList() {
        return _lbUserId_InScopeSubQuery_LendingList;
    }

    /**
     * Set the sub-query of LbUserId_InScopeSubQuery_LendingList as inScopeSubQuery.
     * { in (select xxx.LB_USER_ID from LENDING where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of LbUserId_InScopeSubQuery_LendingList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserId_InScopeSubQuery_LendingList(LdLendingCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _lbUserId_InScopeSubQuery_LendingList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_LB_USER_ID), "LB_USER_ID", "lbUserId_InScopeSubQuery_LendingList");
        return this;
    }
                                      
    /**
     * Register condition of lbUserId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of lbUserId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLbUserCQ registerLbUserId(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getLbUserId(), value)) {
            key.setupConditionValue(getLbUserId(), value, getLocation(UJ_lbUserId, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_LB_USER_ID), key, getLbUserId());
        }
        return this;
    }
    
    /**
     * Add order-by of lbUserId as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_LbUserId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LB_USER_ID), null, true);return this;
    }

    /**
     * Add order-by of lbUserId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_LbUserId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LB_USER_ID), null, false);return this;
    }
          
    /** Column db name of lbUserName. */
    protected static final String COL_LB_USER_NAME = "LB_USER_NAME";

    /** Column java name of lbUserName. */
    protected static final String J_LbUserName = "LbUserName";

    /** Column uncapitalised java name of lbUserName. */
    protected static final String UJ_lbUserName = "lbUserName";

    /** The attribute of lbUserName. */
    protected LdConditionValue _lbUserName;

    /**
     * Get the value of lbUserName.
     * 
     * @return The value of lbUserName.
     */
    public LdConditionValue getLbUserName() {
        if (_lbUserName == null) {
            _lbUserName = new LdConditionValue();
        }
        return _lbUserName;
    }
        
    /**
     * Set the value of lbUserName as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of lbUserName as equal.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserName_Equal(String value) {
        return registerLbUserName(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of lbUserName as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserName_Equal_EmptyString() {
        return registerLbUserName(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of lbUserName as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of lbUserName as notEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserName_NotEqual(String value) {
        return registerLbUserName(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of lbUserName as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of lbUserName as greaterThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserName_GreaterThan(String value) {
        return registerLbUserName(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of lbUserName as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of lbUserName as lessThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserName_LessThan(String value) {
        return registerLbUserName(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of lbUserName as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of lbUserName as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserName_GreaterEqual(String value) {
        return registerLbUserName(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of lbUserName as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of lbUserName as lessEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserName_LessEqual(String value) {
        return registerLbUserName(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of lbUserName as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of lbUserName as prefixSearch.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserName_PrefixSearch(String value) {
        return registerLbUserName(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of lbUserName as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of lbUserName as inScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserName_InScope(java.util.List<String> valueList) {
        return registerLbUserName(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of lbUserName as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of lbUserName as notInScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLbUserName_NotInScope(java.util.List<String> valueList) {
        return registerLbUserName(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of lbUserName.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of lbUserName. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLbUserCQ registerLbUserName(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getLbUserName(), value)) {
            key.setupConditionValue(getLbUserName(), value, getLocation(UJ_lbUserName, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_LB_USER_NAME), key, getLbUserName());
        }
        return this;
    }
    
    /**
     * Add order-by of lbUserName as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_LbUserName_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LB_USER_NAME), null, true);return this;
    }

    /**
     * Add order-by of lbUserName as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_LbUserName_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LB_USER_NAME), null, false);return this;
    }
          
    /** Column db name of libraryId. */
    protected static final String COL_LIBRARY_ID = "LIBRARY_ID";

    /** Column java name of libraryId. */
    protected static final String J_LibraryId = "LibraryId";

    /** Column uncapitalised java name of libraryId. */
    protected static final String UJ_libraryId = "libraryId";

    /** The attribute of libraryId. */
    protected LdConditionValue _libraryId;

    /**
     * Get the value of libraryId.
     * 
     * @return The value of libraryId.
     */
    public LdConditionValue getLibraryId() {
        if (_libraryId == null) {
            _libraryId = new LdConditionValue();
        }
        return _libraryId;
    }
            
    /**
     * Set the value of libraryId as equal. { = }
     * 
     * @param value The value of libraryId as equal.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLibraryId_Equal(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of libraryId as equal. { = }
     * 
     * @param value The value of libraryId as equal.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLibraryId_Equal(long value) {
        return registerLibraryId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as notEqual. { != }
     * 
     * @param value The value of libraryId as notEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLibraryId_NotEqual(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of libraryId as notEqual. { != }
     * 
     * @param value The value of libraryId as notEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLibraryId_NotEqual(long value) {
        return registerLibraryId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as greaterThan. { &gt; }
     * 
     * @param value The value of libraryId as greaterThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLibraryId_GreaterThan(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of libraryId as greaterThan. { &gt; }
     * 
     * @param value The value of libraryId as greaterThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLibraryId_GreaterThan(long value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as lessThan. { &lt; }
     * 
     * @param value The value of libraryId as lessThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLibraryId_LessThan(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of libraryId as lessThan. { &lt; }
     * 
     * @param value The value of libraryId as lessThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLibraryId_LessThan(long value) {
        return registerLibraryId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as greaterEqual. { &gt;= }
     * 
     * @param value The value of libraryId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLibraryId_GreaterEqual(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of libraryId as greaterEqual. { &gt;= }
     * 
     * @param value The value of libraryId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLibraryId_GreaterEqual(long value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as lessEqual. { &lt;= }
     * 
     * @param value The value of libraryId as lessEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLibraryId_LessEqual(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of libraryId as lessEqual. { &lt;= }
     * 
     * @param value The value of libraryId as lessEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLibraryId_LessEqual(long value) {
        return registerLibraryId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of libraryId as inScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLibraryId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLibraryId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of libraryId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of libraryId as notInScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setLibraryId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLibraryId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                              
    /**
     * Register condition of libraryId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of libraryId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLbUserCQ registerLibraryId(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getLibraryId(), value)) {
            key.setupConditionValue(getLibraryId(), value, getLocation(UJ_libraryId, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_LIBRARY_ID), key, getLibraryId());
        }
        return this;
    }
    
    /**
     * Add order-by of libraryId as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_LibraryId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LIBRARY_ID), null, true);return this;
    }

    /**
     * Add order-by of libraryId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_LibraryId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LIBRARY_ID), null, false);return this;
    }
          
    /** Column db name of userPassword. */
    protected static final String COL_USER_PASSWORD = "USER_PASSWORD";

    /** Column java name of userPassword. */
    protected static final String J_UserPassword = "UserPassword";

    /** Column uncapitalised java name of userPassword. */
    protected static final String UJ_userPassword = "userPassword";

    /** The attribute of userPassword. */
    protected LdConditionValue _userPassword;

    /**
     * Get the value of userPassword.
     * 
     * @return The value of userPassword.
     */
    public LdConditionValue getUserPassword() {
        if (_userPassword == null) {
            _userPassword = new LdConditionValue();
        }
        return _userPassword;
    }
        
    /**
     * Set the value of userPassword as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of userPassword as equal.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUserPassword_Equal(String value) {
        return registerUserPassword(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of userPassword as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUserPassword_Equal_EmptyString() {
        return registerUserPassword(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of userPassword as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of userPassword as notEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUserPassword_NotEqual(String value) {
        return registerUserPassword(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of userPassword as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of userPassword as greaterThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUserPassword_GreaterThan(String value) {
        return registerUserPassword(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of userPassword as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of userPassword as lessThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUserPassword_LessThan(String value) {
        return registerUserPassword(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of userPassword as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of userPassword as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUserPassword_GreaterEqual(String value) {
        return registerUserPassword(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of userPassword as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of userPassword as lessEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUserPassword_LessEqual(String value) {
        return registerUserPassword(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of userPassword as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of userPassword as prefixSearch.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUserPassword_PrefixSearch(String value) {
        return registerUserPassword(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of userPassword as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of userPassword as inScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUserPassword_InScope(java.util.List<String> valueList) {
        return registerUserPassword(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of userPassword as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of userPassword as notInScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUserPassword_NotInScope(java.util.List<String> valueList) {
        return registerUserPassword(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of userPassword.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of userPassword. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLbUserCQ registerUserPassword(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getUserPassword(), value)) {
            key.setupConditionValue(getUserPassword(), value, getLocation(UJ_userPassword, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_USER_PASSWORD), key, getUserPassword());
        }
        return this;
    }
    
    /**
     * Add order-by of userPassword as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_UserPassword_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_USER_PASSWORD), null, true);return this;
    }

    /**
     * Add order-by of userPassword as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_UserPassword_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_USER_PASSWORD), null, false);return this;
    }
          
    /** Column db name of rTime. */
    protected static final String COL_R_TIME = "R_TIME";

    /** Column java name of rTime. */
    protected static final String J_RTime = "RTime";

    /** Column uncapitalised java name of rTime. */
    protected static final String UJ_rTime = "rTime";

    /** The attribute of rTime. */
    protected LdConditionValue _rTime;

    /**
     * Get the value of rTime.
     * 
     * @return The value of rTime.
     */
    public LdConditionValue getRTime() {
        if (_rTime == null) {
            _rTime = new LdConditionValue();
        }
        return _rTime;
    }
                
    /**
     * Set the value of rTime as equal. { = }
     * 
     * @param value The value of rTime as equal.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRTime_Equal(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of rTime as notEqual. { != }
     * 
     * @param value The value of rTime as notEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRTime_NotEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of rTime as greaterThan. { &gt; }
     * 
     * @param value The value of rTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRTime_GreaterThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of rTime as lessThan. { &lt; }
     * 
     * @param value The value of rTime as lessThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRTime_LessThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of rTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of rTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRTime_GreaterEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of rTime as lessEqual. { &lt;= }
     * 
     * @param value The value of rTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRTime_LessEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of rTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as inScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of rTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as notInScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of rTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLbUserCQ registerRTime(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getRTime(), value)) {
            key.setupConditionValue(getRTime(), value, getLocation(UJ_rTime, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_R_TIME), key, getRTime());
        }
        return this;
    }
    
    /**
     * Add order-by of rTime as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_RTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_TIME), null, true);return this;
    }

    /**
     * Add order-by of rTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_RTime_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_TIME), null, false);return this;
    }
          
    /** Column db name of uTime. */
    protected static final String COL_U_TIME = "U_TIME";

    /** Column java name of uTime. */
    protected static final String J_UTime = "UTime";

    /** Column uncapitalised java name of uTime. */
    protected static final String UJ_uTime = "uTime";

    /** The attribute of uTime. */
    protected LdConditionValue _uTime;

    /**
     * Get the value of uTime.
     * 
     * @return The value of uTime.
     */
    public LdConditionValue getUTime() {
        if (_uTime == null) {
            _uTime = new LdConditionValue();
        }
        return _uTime;
    }
                
    /**
     * Set the value of uTime as equal. { = }
     * 
     * @param value The value of uTime as equal.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUTime_Equal(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of uTime as notEqual. { != }
     * 
     * @param value The value of uTime as notEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUTime_NotEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of uTime as greaterThan. { &gt; }
     * 
     * @param value The value of uTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUTime_GreaterThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of uTime as lessThan. { &lt; }
     * 
     * @param value The value of uTime as lessThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUTime_LessThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of uTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of uTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUTime_GreaterEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of uTime as lessEqual. { &lt;= }
     * 
     * @param value The value of uTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUTime_LessEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of uTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as inScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of uTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as notInScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of uTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLbUserCQ registerUTime(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getUTime(), value)) {
            key.setupConditionValue(getUTime(), value, getLocation(UJ_uTime, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_U_TIME), key, getUTime());
        }
        return this;
    }
    
    /**
     * Add order-by of uTime as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_UTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_TIME), null, true);return this;
    }

    /**
     * Add order-by of uTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_UTime_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_TIME), null, false);return this;
    }
          
    /** Column db name of rStaff. */
    protected static final String COL_R_STAFF = "R_STAFF";

    /** Column java name of rStaff. */
    protected static final String J_RStaff = "RStaff";

    /** Column uncapitalised java name of rStaff. */
    protected static final String UJ_rStaff = "rStaff";

    /** The attribute of rStaff. */
    protected LdConditionValue _rStaff;

    /**
     * Get the value of rStaff.
     * 
     * @return The value of rStaff.
     */
    public LdConditionValue getRStaff() {
        if (_rStaff == null) {
            _rStaff = new LdConditionValue();
        }
        return _rStaff;
    }
        
    /**
     * Set the value of rStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as equal.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRStaff_Equal(String value) {
        return registerRStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of rStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRStaff_Equal_EmptyString() {
        return registerRStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of rStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRStaff_NotEqual(String value) {
        return registerRStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRStaff_GreaterThan(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRStaff_LessThan(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRStaff_GreaterEqual(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRStaff_LessEqual(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRStaff_PrefixSearch(String value) {
        return registerRStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as inScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRStaff_InScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of rStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setRStaff_NotInScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of rStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLbUserCQ registerRStaff(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getRStaff(), value)) {
            key.setupConditionValue(getRStaff(), value, getLocation(UJ_rStaff, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_R_STAFF), key, getRStaff());
        }
        return this;
    }
    
    /**
     * Add order-by of rStaff as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_RStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_STAFF), null, true);return this;
    }

    /**
     * Add order-by of rStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_RStaff_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_STAFF), null, false);return this;
    }
          
    /** Column db name of uStaff. */
    protected static final String COL_U_STAFF = "U_STAFF";

    /** Column java name of uStaff. */
    protected static final String J_UStaff = "UStaff";

    /** Column uncapitalised java name of uStaff. */
    protected static final String UJ_uStaff = "uStaff";

    /** The attribute of uStaff. */
    protected LdConditionValue _uStaff;

    /**
     * Get the value of uStaff.
     * 
     * @return The value of uStaff.
     */
    public LdConditionValue getUStaff() {
        if (_uStaff == null) {
            _uStaff = new LdConditionValue();
        }
        return _uStaff;
    }
        
    /**
     * Set the value of uStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as equal.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUStaff_Equal(String value) {
        return registerUStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of uStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUStaff_Equal_EmptyString() {
        return registerUStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of uStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUStaff_NotEqual(String value) {
        return registerUStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUStaff_GreaterThan(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUStaff_LessThan(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUStaff_GreaterEqual(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUStaff_LessEqual(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUStaff_PrefixSearch(String value) {
        return registerUStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as inScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUStaff_InScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of uStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdLbUserCQ setUStaff_NotInScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of uStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLbUserCQ registerUStaff(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getUStaff(), value)) {
            key.setupConditionValue(getUStaff(), value, getLocation(UJ_uStaff, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_U_STAFF), key, getUStaff());
        }
        return this;
    }
    
    /**
     * Add order-by of uStaff as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_UStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, true);return this;
    }

    /**
     * Add order-by of uStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLbUserCQ addOrderBy_UStaff_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, false);return this;
    }
      
    // =====================================================================================
    //                                                               Query-SetupOuter-Method
    //                                                               =======================

      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [LIBRARY]
    //   ForeignProperty = [library]
    // * * * * * * * * */

    /**
     * Query for library.
     * 
     * @return Instance of LdLibraryCQ as library. (NotNull)
     */
    public LdLibraryCQ queryLibrary() {
        return getConditionQueryLibrary();
    }

    /**
     * Setup outer join for ${foreignPropertyName}.
     */
    public void setupOuterJoin_Library() {
        final java.util.Map<String, String> joinOnMap = new java.util.LinkedHashMap<String, String>();
        String key = null;
        String value = null;
    
        key = getRealColumnName("LIBRARY_ID");
        value = getConditionQueryLibrary().getRealColumnName("LIBRARY_ID");
        joinOnMap.put(key, value);
    
        final String joinTableName = "LIBRARY";
        final String aliasName = getConditionQueryLibrary().getRealAliasName();
        getSqlClause().registerOuterJoin(joinTableName, aliasName, joinOnMap);
    }

    /** Condition-query for library. */
    protected LdLibraryCQ _conditionQueryLibrary;

    /**
     * Get condition-query for library.
     * 
     * @return Instance of LdLibraryCQ as library. (NotNull)
     */
    public LdLibraryCQ getConditionQueryLibrary() {
        if (_conditionQueryLibrary == null) {
            _conditionQueryLibrary = newQueryLibrary();
            setupOuterJoin_Library();
        }
        return _conditionQueryLibrary;
    }

    /**
     * New query for library.
     * 
     * @return Query for library. (NotNull)
     */
    protected LdLibraryCQ newQueryLibrary() {
        return new LdLibraryCQ(this, getSqlClause(), "Library", getNextNestLevel());
    }
  
      
    // /* * * * * * * * * * * * * * * * * * * * * * * {as one}
    //   ReffererTable    = [BLACK_LIST]
    //   ReffererProperty = [blackListAsOne]
    // * * * * * * * * */

    /**
     * Query for blackListAsOne.
     * 
     * @return Instance of LdBlackListCQ as blackListAsOne. (NotNull)
     */
    public LdBlackListCQ queryBlackListAsOne() {
        return getConditionQueryBlackListAsOne();
    }

    /**
     * Setup outer join for blackListList.
     */
    public void setupOuterJoin_BlackListAsOne() {
        final java.util.Map<String, String> joinOnMap = new java.util.LinkedHashMap<String, String>();
        String key = null;
        String value = null;
      
        key = getRealColumnName("LB_USER_ID");
        value = getConditionQueryBlackListAsOne().getRealColumnName("LB_USER_ID");
        joinOnMap.put(key, value);
      
        final String joinTableName = "BLACK_LIST";
        final String aliasName = getConditionQueryBlackListAsOne().getRealAliasName();
        getSqlClause().registerOuterJoin(joinTableName, aliasName, joinOnMap);
    }

    /** Condition-query for blackListAsOne. */
    protected LdBlackListCQ _conditionQueryBlackListAsOne;

    /**
     * Get condition-query for blackListAsOne.
     * 
     * @return Instance of LdBlackListCQ as blackListAsOne. (NotNull)
     */
    public LdBlackListCQ getConditionQueryBlackListAsOne() {
        if (_conditionQueryBlackListAsOne == null) {
            _conditionQueryBlackListAsOne = newQueryBlackListAsOne();
            setupOuterJoin_BlackListAsOne();
        }
        return _conditionQueryBlackListAsOne;
    }

    /**
     * New query for blackListAsOne.
     * 
     * @return Query for blackListAsOne. (NotNull)
     */
    protected LdBlackListCQ newQueryBlackListAsOne() {
        return new LdBlackListCQ(this, getSqlClause(), "BlackListAsOne", getNextNestLevel());
    }
            
    // =====================================================================================
    //                                                                                Helper
    //                                                                                ======
    /**
     * Filter removing empty-string.
     * If the value is null or empty-string, returns null.
     * 
     * @param value Query-value-string. (Nullable)
     * @return Filtered value. (Nullable)
     */
    protected String filterRemoveEmptyString(String value) {
        return ((value != null && !"".equals(value)) ? value : null);
    }

    /**
     * Filter removing empty-string from the list.
     * If the list is null or empty-string, returns null.
     * 
     * @param ls List. (Nullable)
     * @return Filtered list. (Nullable)
     */
    protected java.util.List<String> filterRemoveEmptyStringFromList(java.util.List<String> ls) {
        if (ls == null) {
            return null;
        }
        java.util.List<String> newList = new java.util.ArrayList<String>();
        for (final java.util.Iterator ite = ls.iterator(); ite.hasNext(); ) {
            final String str = (String)ite.next();
            if ("".equals(str)) {
                continue;
            }
            newList.add(str);
        }
        return newList;
    }

    // =====================================================================================
    //                                                                 Basic-Override Method
    //                                                                 =====================
    /**
     * This method overrides the method that is declared at super.
     * 
     * @return Clause string. (NotNull)
     */
    public String toString() {
        return getSqlClause().getClause();
    }
}

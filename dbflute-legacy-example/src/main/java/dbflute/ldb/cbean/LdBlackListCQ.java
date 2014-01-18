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
public class LdBlackListCQ extends LdAbstractConditionQuery {

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
    LdBlackListCQ(LdAbstractConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BLACK_LIST";
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
     * Include select-column of blackListId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ includeAsMine_BlackListId() {
        return registerIncludedSelectColumn("BlackListId", getRealColumnName("BLACK_LIST_ID"));
    }

    /**
     * Include select-column of blackListId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackListCQ includeAsMine_BlackListId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("BLACK_LIST_ID"));
    }
  
    /**
     * Include select-column of lbUserId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ includeAsMine_LbUserId() {
        return registerIncludedSelectColumn("LbUserId", getRealColumnName("LB_USER_ID"));
    }

    /**
     * Include select-column of lbUserId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackListCQ includeAsMine_LbUserId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("LB_USER_ID"));
    }
  
    /**
     * Include select-column of blackRank as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ includeAsMine_BlackRank() {
        return registerIncludedSelectColumn("BlackRank", getRealColumnName("BLACK_RANK"));
    }

    /**
     * Include select-column of blackRank as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackListCQ includeAsMine_BlackRank(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("BLACK_RANK"));
    }
  
    /**
     * Include select-column of rTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ includeAsMine_RTime() {
        return registerIncludedSelectColumn("RTime", getRealColumnName("R_TIME"));
    }

    /**
     * Include select-column of rTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackListCQ includeAsMine_RTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_TIME"));
    }
  
    /**
     * Include select-column of uTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ includeAsMine_UTime() {
        return registerIncludedSelectColumn("UTime", getRealColumnName("U_TIME"));
    }

    /**
     * Include select-column of uTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackListCQ includeAsMine_UTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_TIME"));
    }
  
    /**
     * Include select-column of rStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ includeAsMine_RStaff() {
        return registerIncludedSelectColumn("RStaff", getRealColumnName("R_STAFF"));
    }

    /**
     * Include select-column of rStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackListCQ includeAsMine_RStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_STAFF"));
    }
  
    /**
     * Include select-column of uStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ includeAsMine_UStaff() {
        return registerIncludedSelectColumn("UStaff", getRealColumnName("U_STAFF"));
    }

    /**
     * Include select-column of uStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackListCQ includeAsMine_UStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_STAFF"));
    }
  
    /**
     * Register included-select-column.
     * 
     * @param aliasName Alias name. This should not contain comma. (NotNull)
     * @param realColumnName Real column name. This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    protected LdBlackListCQ registerIncludedSelectColumn(String aliasName, String realColumnName) {
        assertAliasName(aliasName);
        assertColumnName(realColumnName);
        getSqlClause().registerIncludedSelectColumn(aliasName, realColumnName);
        return this;
    }

    // =====================================================================================
    //                                                                                 Query
    //                                                                                 =====
      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   MyTable = [BLACK_LIST]
    // * * * * * * * * */

      
    /** Column db name of blackListId. */
    protected static final String COL_BLACK_LIST_ID = "BLACK_LIST_ID";

    /** Column java name of blackListId. */
    protected static final String J_BlackListId = "BlackListId";

    /** Column uncapitalised java name of blackListId. */
    protected static final String UJ_blackListId = "blackListId";

    /** The attribute of blackListId. */
    protected LdConditionValue _blackListId;

    /**
     * Get the value of blackListId.
     * 
     * @return The value of blackListId.
     */
    public LdConditionValue getBlackListId() {
        if (_blackListId == null) {
            _blackListId = new LdConditionValue();
        }
        return _blackListId;
    }
            
    /**
     * Set the value of blackListId as equal. { = }
     * 
     * @param value The value of blackListId as equal.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_Equal(java.math.BigDecimal value) {
        return registerBlackListId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of blackListId as equal. { = }
     * 
     * @param value The value of blackListId as equal.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_Equal(long value) {
        return registerBlackListId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackListId as notEqual. { != }
     * 
     * @param value The value of blackListId as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_NotEqual(java.math.BigDecimal value) {
        return registerBlackListId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of blackListId as notEqual. { != }
     * 
     * @param value The value of blackListId as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_NotEqual(long value) {
        return registerBlackListId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackListId as greaterThan. { &gt; }
     * 
     * @param value The value of blackListId as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_GreaterThan(java.math.BigDecimal value) {
        return registerBlackListId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of blackListId as greaterThan. { &gt; }
     * 
     * @param value The value of blackListId as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_GreaterThan(long value) {
        return registerBlackListId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackListId as lessThan. { &lt; }
     * 
     * @param value The value of blackListId as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_LessThan(java.math.BigDecimal value) {
        return registerBlackListId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of blackListId as lessThan. { &lt; }
     * 
     * @param value The value of blackListId as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_LessThan(long value) {
        return registerBlackListId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackListId as greaterEqual. { &gt;= }
     * 
     * @param value The value of blackListId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_GreaterEqual(java.math.BigDecimal value) {
        return registerBlackListId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of blackListId as greaterEqual. { &gt;= }
     * 
     * @param value The value of blackListId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_GreaterEqual(long value) {
        return registerBlackListId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackListId as lessEqual. { &lt;= }
     * 
     * @param value The value of blackListId as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_LessEqual(java.math.BigDecimal value) {
        return registerBlackListId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of blackListId as lessEqual. { &lt;= }
     * 
     * @param value The value of blackListId as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_LessEqual(long value) {
        return registerBlackListId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackListId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of blackListId as inScope.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerBlackListId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of blackListId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of blackListId as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerBlackListId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
              
    /** The sub-query of BlackListId_InScopeSubQuery_BlackActionList as inScopeSubQuery. */
    protected LdBlackActionCQ _blackListId_InScopeSubQuery_BlackActionList;

    /**
     * Get the sub-query of BlackListId_InScopeSubQuery_BlackActionList as inScopeSubQuery.
     * 
     * @return The sub-query of BlackListId_InScopeSubQuery_BlackActionList as inScopeSubQuery. (Nullable)
     */
    public LdBlackActionCQ getBlackListId_InScopeSubQuery_BlackActionList() {
        return _blackListId_InScopeSubQuery_BlackActionList;
    }

    /**
     * Set the sub-query of BlackListId_InScopeSubQuery_BlackActionList as inScopeSubQuery.
     * { in (select xxx.BLACK_LIST_ID from BLACK_ACTION where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of BlackListId_InScopeSubQuery_BlackActionList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackListId_InScopeSubQuery_BlackActionList(LdBlackActionCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _blackListId_InScopeSubQuery_BlackActionList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_BLACK_LIST_ID), "BLACK_LIST_ID", "blackListId_InScopeSubQuery_BlackActionList");
        return this;
    }
                                      
    /**
     * Register condition of blackListId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of blackListId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackListCQ registerBlackListId(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getBlackListId(), value)) {
            key.setupConditionValue(getBlackListId(), value, getLocation(UJ_blackListId, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_BLACK_LIST_ID), key, getBlackListId());
        }
        return this;
    }
    
    /**
     * Add order-by of blackListId as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ addOrderBy_BlackListId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BLACK_LIST_ID), null, true);return this;
    }

    /**
     * Add order-by of blackListId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ addOrderBy_BlackListId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BLACK_LIST_ID), null, false);return this;
    }
          
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
    public LdBlackListCQ setLbUserId_Equal(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of lbUserId as equal. { = }
     * 
     * @param value The value of lbUserId as equal.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setLbUserId_Equal(long value) {
        return registerLbUserId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as notEqual. { != }
     * 
     * @param value The value of lbUserId as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setLbUserId_NotEqual(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of lbUserId as notEqual. { != }
     * 
     * @param value The value of lbUserId as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setLbUserId_NotEqual(long value) {
        return registerLbUserId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as greaterThan. { &gt; }
     * 
     * @param value The value of lbUserId as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setLbUserId_GreaterThan(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of lbUserId as greaterThan. { &gt; }
     * 
     * @param value The value of lbUserId as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setLbUserId_GreaterThan(long value) {
        return registerLbUserId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as lessThan. { &lt; }
     * 
     * @param value The value of lbUserId as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setLbUserId_LessThan(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of lbUserId as lessThan. { &lt; }
     * 
     * @param value The value of lbUserId as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setLbUserId_LessThan(long value) {
        return registerLbUserId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as greaterEqual. { &gt;= }
     * 
     * @param value The value of lbUserId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setLbUserId_GreaterEqual(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of lbUserId as greaterEqual. { &gt;= }
     * 
     * @param value The value of lbUserId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setLbUserId_GreaterEqual(long value) {
        return registerLbUserId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as lessEqual. { &lt;= }
     * 
     * @param value The value of lbUserId as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setLbUserId_LessEqual(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of lbUserId as lessEqual. { &lt;= }
     * 
     * @param value The value of lbUserId as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setLbUserId_LessEqual(long value) {
        return registerLbUserId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of lbUserId as inScope.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setLbUserId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLbUserId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of lbUserId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of lbUserId as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setLbUserId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLbUserId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                              
    /**
     * Register condition of lbUserId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of lbUserId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackListCQ registerLbUserId(LdConditionKey key, Object value) {
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
    public LdBlackListCQ addOrderBy_LbUserId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LB_USER_ID), null, true);return this;
    }

    /**
     * Add order-by of lbUserId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ addOrderBy_LbUserId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LB_USER_ID), null, false);return this;
    }
          
    /** Column db name of blackRank. */
    protected static final String COL_BLACK_RANK = "BLACK_RANK";

    /** Column java name of blackRank. */
    protected static final String J_BlackRank = "BlackRank";

    /** Column uncapitalised java name of blackRank. */
    protected static final String UJ_blackRank = "blackRank";

    /** The attribute of blackRank. */
    protected LdConditionValue _blackRank;

    /**
     * Get the value of blackRank.
     * 
     * @return The value of blackRank.
     */
    public LdConditionValue getBlackRank() {
        if (_blackRank == null) {
            _blackRank = new LdConditionValue();
        }
        return _blackRank;
    }
        
    /**
     * Set the value of blackRank as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of blackRank as equal.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackRank_Equal(String value) {
        return registerBlackRank(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of blackRank as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackRank_Equal_EmptyString() {
        return registerBlackRank(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of blackRank as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of blackRank as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackRank_NotEqual(String value) {
        return registerBlackRank(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of blackRank as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of blackRank as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackRank_GreaterThan(String value) {
        return registerBlackRank(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of blackRank as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of blackRank as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackRank_LessThan(String value) {
        return registerBlackRank(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of blackRank as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of blackRank as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackRank_GreaterEqual(String value) {
        return registerBlackRank(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of blackRank as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of blackRank as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackRank_LessEqual(String value) {
        return registerBlackRank(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of blackRank as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of blackRank as prefixSearch.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackRank_PrefixSearch(String value) {
        return registerBlackRank(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of blackRank as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of blackRank as inScope.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackRank_InScope(java.util.List<String> valueList) {
        return registerBlackRank(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of blackRank as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of blackRank as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setBlackRank_NotInScope(java.util.List<String> valueList) {
        return registerBlackRank(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of blackRank.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of blackRank. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackListCQ registerBlackRank(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getBlackRank(), value)) {
            key.setupConditionValue(getBlackRank(), value, getLocation(UJ_blackRank, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_BLACK_RANK), key, getBlackRank());
        }
        return this;
    }
    
    /**
     * Add order-by of blackRank as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ addOrderBy_BlackRank_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BLACK_RANK), null, true);return this;
    }

    /**
     * Add order-by of blackRank as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ addOrderBy_BlackRank_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BLACK_RANK), null, false);return this;
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
    public LdBlackListCQ setRTime_Equal(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of rTime as notEqual. { != }
     * 
     * @param value The value of rTime as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRTime_NotEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of rTime as greaterThan. { &gt; }
     * 
     * @param value The value of rTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRTime_GreaterThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of rTime as lessThan. { &lt; }
     * 
     * @param value The value of rTime as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRTime_LessThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of rTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of rTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRTime_GreaterEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of rTime as lessEqual. { &lt;= }
     * 
     * @param value The value of rTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRTime_LessEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of rTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as inScope.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of rTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of rTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackListCQ registerRTime(LdConditionKey key, Object value) {
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
    public LdBlackListCQ addOrderBy_RTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_TIME), null, true);return this;
    }

    /**
     * Add order-by of rTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ addOrderBy_RTime_Desc() {
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
    public LdBlackListCQ setUTime_Equal(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of uTime as notEqual. { != }
     * 
     * @param value The value of uTime as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUTime_NotEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of uTime as greaterThan. { &gt; }
     * 
     * @param value The value of uTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUTime_GreaterThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of uTime as lessThan. { &lt; }
     * 
     * @param value The value of uTime as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUTime_LessThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of uTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of uTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUTime_GreaterEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of uTime as lessEqual. { &lt;= }
     * 
     * @param value The value of uTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUTime_LessEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of uTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as inScope.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of uTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of uTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackListCQ registerUTime(LdConditionKey key, Object value) {
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
    public LdBlackListCQ addOrderBy_UTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_TIME), null, true);return this;
    }

    /**
     * Add order-by of uTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ addOrderBy_UTime_Desc() {
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
    public LdBlackListCQ setRStaff_Equal(String value) {
        return registerRStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of rStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRStaff_Equal_EmptyString() {
        return registerRStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of rStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRStaff_NotEqual(String value) {
        return registerRStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRStaff_GreaterThan(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRStaff_LessThan(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRStaff_GreaterEqual(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRStaff_LessEqual(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRStaff_PrefixSearch(String value) {
        return registerRStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as inScope.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRStaff_InScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of rStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setRStaff_NotInScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of rStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackListCQ registerRStaff(LdConditionKey key, Object value) {
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
    public LdBlackListCQ addOrderBy_RStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_STAFF), null, true);return this;
    }

    /**
     * Add order-by of rStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ addOrderBy_RStaff_Desc() {
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
    public LdBlackListCQ setUStaff_Equal(String value) {
        return registerUStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of uStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUStaff_Equal_EmptyString() {
        return registerUStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of uStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUStaff_NotEqual(String value) {
        return registerUStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUStaff_GreaterThan(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUStaff_LessThan(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUStaff_GreaterEqual(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUStaff_LessEqual(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUStaff_PrefixSearch(String value) {
        return registerUStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as inScope.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUStaff_InScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of uStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackListCQ setUStaff_NotInScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of uStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackListCQ registerUStaff(LdConditionKey key, Object value) {
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
    public LdBlackListCQ addOrderBy_UStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, true);return this;
    }

    /**
     * Add order-by of uStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackListCQ addOrderBy_UStaff_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, false);return this;
    }
      
    // =====================================================================================
    //                                                               Query-SetupOuter-Method
    //                                                               =======================

      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [LB_USER]
    //   ForeignProperty = [lbUser]
    // * * * * * * * * */

    /**
     * Query for lbUser.
     * 
     * @return Instance of LdLbUserCQ as lbUser. (NotNull)
     */
    public LdLbUserCQ queryLbUser() {
        return getConditionQueryLbUser();
    }

    /**
     * Setup outer join for ${foreignPropertyName}.
     */
    public void setupOuterJoin_LbUser() {
        final java.util.Map<String, String> joinOnMap = new java.util.LinkedHashMap<String, String>();
        String key = null;
        String value = null;
    
        key = getRealColumnName("LB_USER_ID");
        value = getConditionQueryLbUser().getRealColumnName("LB_USER_ID");
        joinOnMap.put(key, value);
    
        final String joinTableName = "LB_USER";
        final String aliasName = getConditionQueryLbUser().getRealAliasName();
        getSqlClause().registerOuterJoin(joinTableName, aliasName, joinOnMap);
    }

    /** Condition-query for lbUser. */
    protected LdLbUserCQ _conditionQueryLbUser;

    /**
     * Get condition-query for lbUser.
     * 
     * @return Instance of LdLbUserCQ as lbUser. (NotNull)
     */
    public LdLbUserCQ getConditionQueryLbUser() {
        if (_conditionQueryLbUser == null) {
            _conditionQueryLbUser = newQueryLbUser();
            setupOuterJoin_LbUser();
        }
        return _conditionQueryLbUser;
    }

    /**
     * New query for lbUser.
     * 
     * @return Query for lbUser. (NotNull)
     */
    protected LdLbUserCQ newQueryLbUser() {
        return new LdLbUserCQ(this, getSqlClause(), "LbUser", getNextNestLevel());
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

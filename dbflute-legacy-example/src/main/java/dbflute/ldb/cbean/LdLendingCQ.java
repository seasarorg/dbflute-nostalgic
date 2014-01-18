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
public class LdLendingCQ extends LdAbstractConditionQuery {

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
    LdLendingCQ(LdAbstractConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "LENDING";
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
     * Include select-column of lendingId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_LendingId() {
        return registerIncludedSelectColumn("LendingId", getRealColumnName("LENDING_ID"));
    }

    /**
     * Include select-column of lendingId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_LendingId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("LENDING_ID"));
    }
  
    /**
     * Include select-column of libraryId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_LibraryId() {
        return registerIncludedSelectColumn("LibraryId", getRealColumnName("LIBRARY_ID"));
    }

    /**
     * Include select-column of libraryId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_LibraryId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("LIBRARY_ID"));
    }
  
    /**
     * Include select-column of lbUserId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_LbUserId() {
        return registerIncludedSelectColumn("LbUserId", getRealColumnName("LB_USER_ID"));
    }

    /**
     * Include select-column of lbUserId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_LbUserId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("LB_USER_ID"));
    }
  
    /**
     * Include select-column of lendingDate as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_LendingDate() {
        return registerIncludedSelectColumn("LendingDate", getRealColumnName("LENDING_DATE"));
    }

    /**
     * Include select-column of lendingDate as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_LendingDate(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("LENDING_DATE"));
    }
  
    /**
     * Include select-column of rTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_RTime() {
        return registerIncludedSelectColumn("RTime", getRealColumnName("R_TIME"));
    }

    /**
     * Include select-column of rTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_RTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_TIME"));
    }
  
    /**
     * Include select-column of uTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_UTime() {
        return registerIncludedSelectColumn("UTime", getRealColumnName("U_TIME"));
    }

    /**
     * Include select-column of uTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_UTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_TIME"));
    }
  
    /**
     * Include select-column of rStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_RStaff() {
        return registerIncludedSelectColumn("RStaff", getRealColumnName("R_STAFF"));
    }

    /**
     * Include select-column of rStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_RStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_STAFF"));
    }
  
    /**
     * Include select-column of uStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_UStaff() {
        return registerIncludedSelectColumn("UStaff", getRealColumnName("U_STAFF"));
    }

    /**
     * Include select-column of uStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLendingCQ includeAsMine_UStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_STAFF"));
    }
  
    /**
     * Register included-select-column.
     * 
     * @param aliasName Alias name. This should not contain comma. (NotNull)
     * @param realColumnName Real column name. This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    protected LdLendingCQ registerIncludedSelectColumn(String aliasName, String realColumnName) {
        assertAliasName(aliasName);
        assertColumnName(realColumnName);
        getSqlClause().registerIncludedSelectColumn(aliasName, realColumnName);
        return this;
    }

    // =====================================================================================
    //                                                                                 Query
    //                                                                                 =====
      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   MyTable = [LENDING]
    // * * * * * * * * */

      
    /** Column db name of lendingId. */
    protected static final String COL_LENDING_ID = "LENDING_ID";

    /** Column java name of lendingId. */
    protected static final String J_LendingId = "LendingId";

    /** Column uncapitalised java name of lendingId. */
    protected static final String UJ_lendingId = "lendingId";

    /** The attribute of lendingId. */
    protected LdConditionValue _lendingId;

    /**
     * Get the value of lendingId.
     * 
     * @return The value of lendingId.
     */
    public LdConditionValue getLendingId() {
        if (_lendingId == null) {
            _lendingId = new LdConditionValue();
        }
        return _lendingId;
    }
            
    /**
     * Set the value of lendingId as equal. { = }
     * 
     * @param value The value of lendingId as equal.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_Equal(java.math.BigDecimal value) {
        return registerLendingId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of lendingId as equal. { = }
     * 
     * @param value The value of lendingId as equal.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_Equal(long value) {
        return registerLendingId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lendingId as notEqual. { != }
     * 
     * @param value The value of lendingId as notEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_NotEqual(java.math.BigDecimal value) {
        return registerLendingId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of lendingId as notEqual. { != }
     * 
     * @param value The value of lendingId as notEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_NotEqual(long value) {
        return registerLendingId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lendingId as greaterThan. { &gt; }
     * 
     * @param value The value of lendingId as greaterThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_GreaterThan(java.math.BigDecimal value) {
        return registerLendingId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of lendingId as greaterThan. { &gt; }
     * 
     * @param value The value of lendingId as greaterThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_GreaterThan(long value) {
        return registerLendingId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lendingId as lessThan. { &lt; }
     * 
     * @param value The value of lendingId as lessThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_LessThan(java.math.BigDecimal value) {
        return registerLendingId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of lendingId as lessThan. { &lt; }
     * 
     * @param value The value of lendingId as lessThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_LessThan(long value) {
        return registerLendingId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lendingId as greaterEqual. { &gt;= }
     * 
     * @param value The value of lendingId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_GreaterEqual(java.math.BigDecimal value) {
        return registerLendingId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of lendingId as greaterEqual. { &gt;= }
     * 
     * @param value The value of lendingId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_GreaterEqual(long value) {
        return registerLendingId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lendingId as lessEqual. { &lt;= }
     * 
     * @param value The value of lendingId as lessEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_LessEqual(java.math.BigDecimal value) {
        return registerLendingId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of lendingId as lessEqual. { &lt;= }
     * 
     * @param value The value of lendingId as lessEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_LessEqual(long value) {
        return registerLendingId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lendingId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of lendingId as inScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLendingId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of lendingId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of lendingId as notInScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLendingId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
              
    /** The sub-query of LendingId_InScopeSubQuery_LendingCollectionList as inScopeSubQuery. */
    protected LdLendingCollectionCQ _lendingId_InScopeSubQuery_LendingCollectionList;

    /**
     * Get the sub-query of LendingId_InScopeSubQuery_LendingCollectionList as inScopeSubQuery.
     * 
     * @return The sub-query of LendingId_InScopeSubQuery_LendingCollectionList as inScopeSubQuery. (Nullable)
     */
    public LdLendingCollectionCQ getLendingId_InScopeSubQuery_LendingCollectionList() {
        return _lendingId_InScopeSubQuery_LendingCollectionList;
    }

    /**
     * Set the sub-query of LendingId_InScopeSubQuery_LendingCollectionList as inScopeSubQuery.
     * { in (select xxx.LENDING_ID from LENDING_COLLECTION where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of LendingId_InScopeSubQuery_LendingCollectionList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingId_InScopeSubQuery_LendingCollectionList(LdLendingCollectionCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _lendingId_InScopeSubQuery_LendingCollectionList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_LENDING_ID), "LENDING_ID", "lendingId_InScopeSubQuery_LendingCollectionList");
        return this;
    }
                                      
    /**
     * Register condition of lendingId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of lendingId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLendingCQ registerLendingId(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getLendingId(), value)) {
            key.setupConditionValue(getLendingId(), value, getLocation(UJ_lendingId, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_LENDING_ID), key, getLendingId());
        }
        return this;
    }
    
    /**
     * Add order-by of lendingId as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ addOrderBy_LendingId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LENDING_ID), null, true);return this;
    }

    /**
     * Add order-by of lendingId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ addOrderBy_LendingId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LENDING_ID), null, false);return this;
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
    public LdLendingCQ setLibraryId_Equal(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of libraryId as equal. { = }
     * 
     * @param value The value of libraryId as equal.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLibraryId_Equal(long value) {
        return registerLibraryId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as notEqual. { != }
     * 
     * @param value The value of libraryId as notEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLibraryId_NotEqual(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of libraryId as notEqual. { != }
     * 
     * @param value The value of libraryId as notEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLibraryId_NotEqual(long value) {
        return registerLibraryId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as greaterThan. { &gt; }
     * 
     * @param value The value of libraryId as greaterThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLibraryId_GreaterThan(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of libraryId as greaterThan. { &gt; }
     * 
     * @param value The value of libraryId as greaterThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLibraryId_GreaterThan(long value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as lessThan. { &lt; }
     * 
     * @param value The value of libraryId as lessThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLibraryId_LessThan(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of libraryId as lessThan. { &lt; }
     * 
     * @param value The value of libraryId as lessThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLibraryId_LessThan(long value) {
        return registerLibraryId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as greaterEqual. { &gt;= }
     * 
     * @param value The value of libraryId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLibraryId_GreaterEqual(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of libraryId as greaterEqual. { &gt;= }
     * 
     * @param value The value of libraryId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLibraryId_GreaterEqual(long value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as lessEqual. { &lt;= }
     * 
     * @param value The value of libraryId as lessEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLibraryId_LessEqual(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of libraryId as lessEqual. { &lt;= }
     * 
     * @param value The value of libraryId as lessEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLibraryId_LessEqual(long value) {
        return registerLibraryId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of libraryId as inScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLibraryId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLibraryId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of libraryId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of libraryId as notInScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLibraryId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLibraryId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                              
    /**
     * Register condition of libraryId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of libraryId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLendingCQ registerLibraryId(LdConditionKey key, Object value) {
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
    public LdLendingCQ addOrderBy_LibraryId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LIBRARY_ID), null, true);return this;
    }

    /**
     * Add order-by of libraryId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ addOrderBy_LibraryId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LIBRARY_ID), null, false);return this;
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
    public LdLendingCQ setLbUserId_Equal(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of lbUserId as equal. { = }
     * 
     * @param value The value of lbUserId as equal.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLbUserId_Equal(long value) {
        return registerLbUserId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as notEqual. { != }
     * 
     * @param value The value of lbUserId as notEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLbUserId_NotEqual(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of lbUserId as notEqual. { != }
     * 
     * @param value The value of lbUserId as notEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLbUserId_NotEqual(long value) {
        return registerLbUserId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as greaterThan. { &gt; }
     * 
     * @param value The value of lbUserId as greaterThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLbUserId_GreaterThan(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of lbUserId as greaterThan. { &gt; }
     * 
     * @param value The value of lbUserId as greaterThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLbUserId_GreaterThan(long value) {
        return registerLbUserId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as lessThan. { &lt; }
     * 
     * @param value The value of lbUserId as lessThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLbUserId_LessThan(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of lbUserId as lessThan. { &lt; }
     * 
     * @param value The value of lbUserId as lessThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLbUserId_LessThan(long value) {
        return registerLbUserId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as greaterEqual. { &gt;= }
     * 
     * @param value The value of lbUserId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLbUserId_GreaterEqual(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of lbUserId as greaterEqual. { &gt;= }
     * 
     * @param value The value of lbUserId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLbUserId_GreaterEqual(long value) {
        return registerLbUserId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as lessEqual. { &lt;= }
     * 
     * @param value The value of lbUserId as lessEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLbUserId_LessEqual(java.math.BigDecimal value) {
        return registerLbUserId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of lbUserId as lessEqual. { &lt;= }
     * 
     * @param value The value of lbUserId as lessEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLbUserId_LessEqual(long value) {
        return registerLbUserId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of lbUserId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of lbUserId as inScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLbUserId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLbUserId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of lbUserId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of lbUserId as notInScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLbUserId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLbUserId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                              
    /**
     * Register condition of lbUserId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of lbUserId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLendingCQ registerLbUserId(LdConditionKey key, Object value) {
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
    public LdLendingCQ addOrderBy_LbUserId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LB_USER_ID), null, true);return this;
    }

    /**
     * Add order-by of lbUserId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ addOrderBy_LbUserId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LB_USER_ID), null, false);return this;
    }
          
    /** Column db name of lendingDate. */
    protected static final String COL_LENDING_DATE = "LENDING_DATE";

    /** Column java name of lendingDate. */
    protected static final String J_LendingDate = "LendingDate";

    /** Column uncapitalised java name of lendingDate. */
    protected static final String UJ_lendingDate = "lendingDate";

    /** The attribute of lendingDate. */
    protected LdConditionValue _lendingDate;

    /**
     * Get the value of lendingDate.
     * 
     * @return The value of lendingDate.
     */
    public LdConditionValue getLendingDate() {
        if (_lendingDate == null) {
            _lendingDate = new LdConditionValue();
        }
        return _lendingDate;
    }
                
    /**
     * Set the value of lendingDate as equal. { = }
     * 
     * @param value The value of lendingDate as equal.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingDate_Equal(java.sql.Timestamp value) {
        return registerLendingDate(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of lendingDate as notEqual. { != }
     * 
     * @param value The value of lendingDate as notEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingDate_NotEqual(java.sql.Timestamp value) {
        return registerLendingDate(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of lendingDate as greaterThan. { &gt; }
     * 
     * @param value The value of lendingDate as greaterThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingDate_GreaterThan(java.sql.Timestamp value) {
        return registerLendingDate(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of lendingDate as lessThan. { &lt; }
     * 
     * @param value The value of lendingDate as lessThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingDate_LessThan(java.sql.Timestamp value) {
        return registerLendingDate(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of lendingDate as greaterEqual. { &gt;= }
     * 
     * @param value The value of lendingDate as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingDate_GreaterEqual(java.sql.Timestamp value) {
        return registerLendingDate(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of lendingDate as lessEqual. { &lt;= }
     * 
     * @param value The value of lendingDate as lessEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingDate_LessEqual(java.sql.Timestamp value) {
        return registerLendingDate(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of lendingDate as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of lendingDate as inScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingDate_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerLendingDate(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of lendingDate as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of lendingDate as notInScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setLendingDate_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerLendingDate(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of lendingDate.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of lendingDate. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLendingCQ registerLendingDate(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getLendingDate(), value)) {
            key.setupConditionValue(getLendingDate(), value, getLocation(UJ_lendingDate, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_LENDING_DATE), key, getLendingDate());
        }
        return this;
    }
    
    /**
     * Add order-by of lendingDate as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ addOrderBy_LendingDate_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LENDING_DATE), null, true);return this;
    }

    /**
     * Add order-by of lendingDate as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ addOrderBy_LendingDate_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LENDING_DATE), null, false);return this;
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
    public LdLendingCQ setRTime_Equal(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of rTime as notEqual. { != }
     * 
     * @param value The value of rTime as notEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRTime_NotEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of rTime as greaterThan. { &gt; }
     * 
     * @param value The value of rTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRTime_GreaterThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of rTime as lessThan. { &lt; }
     * 
     * @param value The value of rTime as lessThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRTime_LessThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of rTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of rTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRTime_GreaterEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of rTime as lessEqual. { &lt;= }
     * 
     * @param value The value of rTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRTime_LessEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of rTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as inScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of rTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as notInScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of rTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLendingCQ registerRTime(LdConditionKey key, Object value) {
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
    public LdLendingCQ addOrderBy_RTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_TIME), null, true);return this;
    }

    /**
     * Add order-by of rTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ addOrderBy_RTime_Desc() {
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
    public LdLendingCQ setUTime_Equal(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of uTime as notEqual. { != }
     * 
     * @param value The value of uTime as notEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUTime_NotEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of uTime as greaterThan. { &gt; }
     * 
     * @param value The value of uTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUTime_GreaterThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of uTime as lessThan. { &lt; }
     * 
     * @param value The value of uTime as lessThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUTime_LessThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of uTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of uTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUTime_GreaterEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of uTime as lessEqual. { &lt;= }
     * 
     * @param value The value of uTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUTime_LessEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of uTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as inScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of uTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as notInScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of uTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLendingCQ registerUTime(LdConditionKey key, Object value) {
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
    public LdLendingCQ addOrderBy_UTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_TIME), null, true);return this;
    }

    /**
     * Add order-by of uTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ addOrderBy_UTime_Desc() {
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
    public LdLendingCQ setRStaff_Equal(String value) {
        return registerRStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of rStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ setRStaff_Equal_EmptyString() {
        return registerRStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of rStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRStaff_NotEqual(String value) {
        return registerRStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRStaff_GreaterThan(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRStaff_LessThan(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRStaff_GreaterEqual(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRStaff_LessEqual(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRStaff_PrefixSearch(String value) {
        return registerRStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as inScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRStaff_InScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of rStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setRStaff_NotInScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of rStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLendingCQ registerRStaff(LdConditionKey key, Object value) {
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
    public LdLendingCQ addOrderBy_RStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_STAFF), null, true);return this;
    }

    /**
     * Add order-by of rStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ addOrderBy_RStaff_Desc() {
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
    public LdLendingCQ setUStaff_Equal(String value) {
        return registerUStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of uStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ setUStaff_Equal_EmptyString() {
        return registerUStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of uStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUStaff_NotEqual(String value) {
        return registerUStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUStaff_GreaterThan(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUStaff_LessThan(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUStaff_GreaterEqual(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUStaff_LessEqual(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUStaff_PrefixSearch(String value) {
        return registerUStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as inScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUStaff_InScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of uStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdLendingCQ setUStaff_NotInScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of uStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLendingCQ registerUStaff(LdConditionKey key, Object value) {
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
    public LdLendingCQ addOrderBy_UStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, true);return this;
    }

    /**
     * Add order-by of uStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLendingCQ addOrderBy_UStaff_Desc() {
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

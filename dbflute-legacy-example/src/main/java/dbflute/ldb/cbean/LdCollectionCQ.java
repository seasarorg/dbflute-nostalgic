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
public class LdCollectionCQ extends LdAbstractConditionQuery {

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
    LdCollectionCQ(LdAbstractConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "COLLECTION";
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
     * Include select-column of collectionId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_CollectionId() {
        return registerIncludedSelectColumn("CollectionId", getRealColumnName("COLLECTION_ID"));
    }

    /**
     * Include select-column of collectionId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_CollectionId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("COLLECTION_ID"));
    }
  
    /**
     * Include select-column of libraryId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_LibraryId() {
        return registerIncludedSelectColumn("LibraryId", getRealColumnName("LIBRARY_ID"));
    }

    /**
     * Include select-column of libraryId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_LibraryId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("LIBRARY_ID"));
    }
  
    /**
     * Include select-column of bookId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_BookId() {
        return registerIncludedSelectColumn("BookId", getRealColumnName("BOOK_ID"));
    }

    /**
     * Include select-column of bookId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_BookId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("BOOK_ID"));
    }
  
    /**
     * Include select-column of arrivalDate as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_ArrivalDate() {
        return registerIncludedSelectColumn("ArrivalDate", getRealColumnName("ARRIVAL_DATE"));
    }

    /**
     * Include select-column of arrivalDate as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_ArrivalDate(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("ARRIVAL_DATE"));
    }
  
    /**
     * Include select-column of rTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_RTime() {
        return registerIncludedSelectColumn("RTime", getRealColumnName("R_TIME"));
    }

    /**
     * Include select-column of rTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_RTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_TIME"));
    }
  
    /**
     * Include select-column of uTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_UTime() {
        return registerIncludedSelectColumn("UTime", getRealColumnName("U_TIME"));
    }

    /**
     * Include select-column of uTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_UTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_TIME"));
    }
  
    /**
     * Include select-column of rStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_RStaff() {
        return registerIncludedSelectColumn("RStaff", getRealColumnName("R_STAFF"));
    }

    /**
     * Include select-column of rStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_RStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_STAFF"));
    }
  
    /**
     * Include select-column of uStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_UStaff() {
        return registerIncludedSelectColumn("UStaff", getRealColumnName("U_STAFF"));
    }

    /**
     * Include select-column of uStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionCQ includeAsMine_UStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_STAFF"));
    }
  
    /**
     * Register included-select-column.
     * 
     * @param aliasName Alias name. This should not contain comma. (NotNull)
     * @param realColumnName Real column name. This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    protected LdCollectionCQ registerIncludedSelectColumn(String aliasName, String realColumnName) {
        assertAliasName(aliasName);
        assertColumnName(realColumnName);
        getSqlClause().registerIncludedSelectColumn(aliasName, realColumnName);
        return this;
    }

    // =====================================================================================
    //                                                                                 Query
    //                                                                                 =====
      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   MyTable = [COLLECTION]
    // * * * * * * * * */

      
    /** Column db name of collectionId. */
    protected static final String COL_COLLECTION_ID = "COLLECTION_ID";

    /** Column java name of collectionId. */
    protected static final String J_CollectionId = "CollectionId";

    /** Column uncapitalised java name of collectionId. */
    protected static final String UJ_collectionId = "collectionId";

    /** The attribute of collectionId. */
    protected LdConditionValue _collectionId;

    /**
     * Get the value of collectionId.
     * 
     * @return The value of collectionId.
     */
    public LdConditionValue getCollectionId() {
        if (_collectionId == null) {
            _collectionId = new LdConditionValue();
        }
        return _collectionId;
    }
            
    /**
     * Set the value of collectionId as equal. { = }
     * 
     * @param value The value of collectionId as equal.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_Equal(java.math.BigDecimal value) {
        return registerCollectionId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of collectionId as equal. { = }
     * 
     * @param value The value of collectionId as equal.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_Equal(long value) {
        return registerCollectionId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of collectionId as notEqual. { != }
     * 
     * @param value The value of collectionId as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_NotEqual(java.math.BigDecimal value) {
        return registerCollectionId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of collectionId as notEqual. { != }
     * 
     * @param value The value of collectionId as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_NotEqual(long value) {
        return registerCollectionId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of collectionId as greaterThan. { &gt; }
     * 
     * @param value The value of collectionId as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_GreaterThan(java.math.BigDecimal value) {
        return registerCollectionId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of collectionId as greaterThan. { &gt; }
     * 
     * @param value The value of collectionId as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_GreaterThan(long value) {
        return registerCollectionId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of collectionId as lessThan. { &lt; }
     * 
     * @param value The value of collectionId as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_LessThan(java.math.BigDecimal value) {
        return registerCollectionId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of collectionId as lessThan. { &lt; }
     * 
     * @param value The value of collectionId as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_LessThan(long value) {
        return registerCollectionId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of collectionId as greaterEqual. { &gt;= }
     * 
     * @param value The value of collectionId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_GreaterEqual(java.math.BigDecimal value) {
        return registerCollectionId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of collectionId as greaterEqual. { &gt;= }
     * 
     * @param value The value of collectionId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_GreaterEqual(long value) {
        return registerCollectionId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of collectionId as lessEqual. { &lt;= }
     * 
     * @param value The value of collectionId as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_LessEqual(java.math.BigDecimal value) {
        return registerCollectionId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of collectionId as lessEqual. { &lt;= }
     * 
     * @param value The value of collectionId as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_LessEqual(long value) {
        return registerCollectionId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of collectionId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of collectionId as inScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerCollectionId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of collectionId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of collectionId as notInScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerCollectionId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
              
    /** The sub-query of CollectionId_InScopeSubQuery_CollectionStatusList as inScopeSubQuery. */
    protected LdCollectionStatusCQ _collectionId_InScopeSubQuery_CollectionStatusList;

    /**
     * Get the sub-query of CollectionId_InScopeSubQuery_CollectionStatusList as inScopeSubQuery.
     * 
     * @return The sub-query of CollectionId_InScopeSubQuery_CollectionStatusList as inScopeSubQuery. (Nullable)
     */
    public LdCollectionStatusCQ getCollectionId_InScopeSubQuery_CollectionStatusList() {
        return _collectionId_InScopeSubQuery_CollectionStatusList;
    }

    /**
     * Set the sub-query of CollectionId_InScopeSubQuery_CollectionStatusList as inScopeSubQuery.
     * { in (select xxx.COLLECTION_ID from COLLECTION_STATUS where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of CollectionId_InScopeSubQuery_CollectionStatusList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_InScopeSubQuery_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _collectionId_InScopeSubQuery_CollectionStatusList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_COLLECTION_ID), "COLLECTION_ID", "collectionId_InScopeSubQuery_CollectionStatusList");
        return this;
    }
        
    /** The sub-query of CollectionId_InScopeSubQuery_LendingCollectionList as inScopeSubQuery. */
    protected LdLendingCollectionCQ _collectionId_InScopeSubQuery_LendingCollectionList;

    /**
     * Get the sub-query of CollectionId_InScopeSubQuery_LendingCollectionList as inScopeSubQuery.
     * 
     * @return The sub-query of CollectionId_InScopeSubQuery_LendingCollectionList as inScopeSubQuery. (Nullable)
     */
    public LdLendingCollectionCQ getCollectionId_InScopeSubQuery_LendingCollectionList() {
        return _collectionId_InScopeSubQuery_LendingCollectionList;
    }

    /**
     * Set the sub-query of CollectionId_InScopeSubQuery_LendingCollectionList as inScopeSubQuery.
     * { in (select xxx.COLLECTION_ID from LENDING_COLLECTION where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of CollectionId_InScopeSubQuery_LendingCollectionList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionCQ setCollectionId_InScopeSubQuery_LendingCollectionList(LdLendingCollectionCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _collectionId_InScopeSubQuery_LendingCollectionList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_COLLECTION_ID), "COLLECTION_ID", "collectionId_InScopeSubQuery_LendingCollectionList");
        return this;
    }
                                      
    /**
     * Register condition of collectionId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of collectionId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdCollectionCQ registerCollectionId(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getCollectionId(), value)) {
            key.setupConditionValue(getCollectionId(), value, getLocation(UJ_collectionId, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_COLLECTION_ID), key, getCollectionId());
        }
        return this;
    }
    
    /**
     * Add order-by of collectionId as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ addOrderBy_CollectionId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_COLLECTION_ID), null, true);return this;
    }

    /**
     * Add order-by of collectionId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ addOrderBy_CollectionId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_COLLECTION_ID), null, false);return this;
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
    public LdCollectionCQ setLibraryId_Equal(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of libraryId as equal. { = }
     * 
     * @param value The value of libraryId as equal.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setLibraryId_Equal(long value) {
        return registerLibraryId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as notEqual. { != }
     * 
     * @param value The value of libraryId as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setLibraryId_NotEqual(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of libraryId as notEqual. { != }
     * 
     * @param value The value of libraryId as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setLibraryId_NotEqual(long value) {
        return registerLibraryId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as greaterThan. { &gt; }
     * 
     * @param value The value of libraryId as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setLibraryId_GreaterThan(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of libraryId as greaterThan. { &gt; }
     * 
     * @param value The value of libraryId as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setLibraryId_GreaterThan(long value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as lessThan. { &lt; }
     * 
     * @param value The value of libraryId as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setLibraryId_LessThan(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of libraryId as lessThan. { &lt; }
     * 
     * @param value The value of libraryId as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setLibraryId_LessThan(long value) {
        return registerLibraryId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as greaterEqual. { &gt;= }
     * 
     * @param value The value of libraryId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setLibraryId_GreaterEqual(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of libraryId as greaterEqual. { &gt;= }
     * 
     * @param value The value of libraryId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setLibraryId_GreaterEqual(long value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as lessEqual. { &lt;= }
     * 
     * @param value The value of libraryId as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setLibraryId_LessEqual(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of libraryId as lessEqual. { &lt;= }
     * 
     * @param value The value of libraryId as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setLibraryId_LessEqual(long value) {
        return registerLibraryId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of libraryId as inScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setLibraryId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLibraryId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of libraryId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of libraryId as notInScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setLibraryId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLibraryId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                              
    /**
     * Register condition of libraryId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of libraryId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdCollectionCQ registerLibraryId(LdConditionKey key, Object value) {
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
    public LdCollectionCQ addOrderBy_LibraryId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LIBRARY_ID), null, true);return this;
    }

    /**
     * Add order-by of libraryId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ addOrderBy_LibraryId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LIBRARY_ID), null, false);return this;
    }
          
    /** Column db name of bookId. */
    protected static final String COL_BOOK_ID = "BOOK_ID";

    /** Column java name of bookId. */
    protected static final String J_BookId = "BookId";

    /** Column uncapitalised java name of bookId. */
    protected static final String UJ_bookId = "bookId";

    /** The attribute of bookId. */
    protected LdConditionValue _bookId;

    /**
     * Get the value of bookId.
     * 
     * @return The value of bookId.
     */
    public LdConditionValue getBookId() {
        if (_bookId == null) {
            _bookId = new LdConditionValue();
        }
        return _bookId;
    }
            
    /**
     * Set the value of bookId as equal. { = }
     * 
     * @param value The value of bookId as equal.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setBookId_Equal(java.math.BigDecimal value) {
        return registerBookId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of bookId as equal. { = }
     * 
     * @param value The value of bookId as equal.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setBookId_Equal(long value) {
        return registerBookId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of bookId as notEqual. { != }
     * 
     * @param value The value of bookId as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setBookId_NotEqual(java.math.BigDecimal value) {
        return registerBookId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of bookId as notEqual. { != }
     * 
     * @param value The value of bookId as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setBookId_NotEqual(long value) {
        return registerBookId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of bookId as greaterThan. { &gt; }
     * 
     * @param value The value of bookId as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setBookId_GreaterThan(java.math.BigDecimal value) {
        return registerBookId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of bookId as greaterThan. { &gt; }
     * 
     * @param value The value of bookId as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setBookId_GreaterThan(long value) {
        return registerBookId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of bookId as lessThan. { &lt; }
     * 
     * @param value The value of bookId as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setBookId_LessThan(java.math.BigDecimal value) {
        return registerBookId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of bookId as lessThan. { &lt; }
     * 
     * @param value The value of bookId as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setBookId_LessThan(long value) {
        return registerBookId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of bookId as greaterEqual. { &gt;= }
     * 
     * @param value The value of bookId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setBookId_GreaterEqual(java.math.BigDecimal value) {
        return registerBookId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of bookId as greaterEqual. { &gt;= }
     * 
     * @param value The value of bookId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setBookId_GreaterEqual(long value) {
        return registerBookId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of bookId as lessEqual. { &lt;= }
     * 
     * @param value The value of bookId as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setBookId_LessEqual(java.math.BigDecimal value) {
        return registerBookId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of bookId as lessEqual. { &lt;= }
     * 
     * @param value The value of bookId as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setBookId_LessEqual(long value) {
        return registerBookId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of bookId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of bookId as inScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setBookId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerBookId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of bookId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of bookId as notInScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setBookId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerBookId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                              
    /**
     * Register condition of bookId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of bookId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdCollectionCQ registerBookId(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getBookId(), value)) {
            key.setupConditionValue(getBookId(), value, getLocation(UJ_bookId, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_BOOK_ID), key, getBookId());
        }
        return this;
    }
    
    /**
     * Add order-by of bookId as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ addOrderBy_BookId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BOOK_ID), null, true);return this;
    }

    /**
     * Add order-by of bookId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ addOrderBy_BookId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BOOK_ID), null, false);return this;
    }
          
    /** Column db name of arrivalDate. */
    protected static final String COL_ARRIVAL_DATE = "ARRIVAL_DATE";

    /** Column java name of arrivalDate. */
    protected static final String J_ArrivalDate = "ArrivalDate";

    /** Column uncapitalised java name of arrivalDate. */
    protected static final String UJ_arrivalDate = "arrivalDate";

    /** The attribute of arrivalDate. */
    protected LdConditionValue _arrivalDate;

    /**
     * Get the value of arrivalDate.
     * 
     * @return The value of arrivalDate.
     */
    public LdConditionValue getArrivalDate() {
        if (_arrivalDate == null) {
            _arrivalDate = new LdConditionValue();
        }
        return _arrivalDate;
    }
                
    /**
     * Set the value of arrivalDate as equal. { = }
     * 
     * @param value The value of arrivalDate as equal.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setArrivalDate_Equal(java.sql.Timestamp value) {
        return registerArrivalDate(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of arrivalDate as notEqual. { != }
     * 
     * @param value The value of arrivalDate as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setArrivalDate_NotEqual(java.sql.Timestamp value) {
        return registerArrivalDate(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of arrivalDate as greaterThan. { &gt; }
     * 
     * @param value The value of arrivalDate as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setArrivalDate_GreaterThan(java.sql.Timestamp value) {
        return registerArrivalDate(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of arrivalDate as lessThan. { &lt; }
     * 
     * @param value The value of arrivalDate as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setArrivalDate_LessThan(java.sql.Timestamp value) {
        return registerArrivalDate(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of arrivalDate as greaterEqual. { &gt;= }
     * 
     * @param value The value of arrivalDate as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setArrivalDate_GreaterEqual(java.sql.Timestamp value) {
        return registerArrivalDate(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of arrivalDate as lessEqual. { &lt;= }
     * 
     * @param value The value of arrivalDate as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setArrivalDate_LessEqual(java.sql.Timestamp value) {
        return registerArrivalDate(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of arrivalDate as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of arrivalDate as inScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setArrivalDate_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerArrivalDate(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of arrivalDate as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of arrivalDate as notInScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setArrivalDate_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerArrivalDate(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of arrivalDate.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of arrivalDate. (Nullable)
     * @return this. (NotNull)
     */
    protected LdCollectionCQ registerArrivalDate(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getArrivalDate(), value)) {
            key.setupConditionValue(getArrivalDate(), value, getLocation(UJ_arrivalDate, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_ARRIVAL_DATE), key, getArrivalDate());
        }
        return this;
    }
    
    /**
     * Add order-by of arrivalDate as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ addOrderBy_ArrivalDate_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_ARRIVAL_DATE), null, true);return this;
    }

    /**
     * Add order-by of arrivalDate as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ addOrderBy_ArrivalDate_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_ARRIVAL_DATE), null, false);return this;
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
    public LdCollectionCQ setRTime_Equal(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of rTime as notEqual. { != }
     * 
     * @param value The value of rTime as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRTime_NotEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of rTime as greaterThan. { &gt; }
     * 
     * @param value The value of rTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRTime_GreaterThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of rTime as lessThan. { &lt; }
     * 
     * @param value The value of rTime as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRTime_LessThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of rTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of rTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRTime_GreaterEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of rTime as lessEqual. { &lt;= }
     * 
     * @param value The value of rTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRTime_LessEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of rTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as inScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of rTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as notInScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of rTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdCollectionCQ registerRTime(LdConditionKey key, Object value) {
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
    public LdCollectionCQ addOrderBy_RTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_TIME), null, true);return this;
    }

    /**
     * Add order-by of rTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ addOrderBy_RTime_Desc() {
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
    public LdCollectionCQ setUTime_Equal(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of uTime as notEqual. { != }
     * 
     * @param value The value of uTime as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUTime_NotEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of uTime as greaterThan. { &gt; }
     * 
     * @param value The value of uTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUTime_GreaterThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of uTime as lessThan. { &lt; }
     * 
     * @param value The value of uTime as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUTime_LessThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of uTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of uTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUTime_GreaterEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of uTime as lessEqual. { &lt;= }
     * 
     * @param value The value of uTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUTime_LessEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of uTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as inScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of uTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as notInScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of uTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdCollectionCQ registerUTime(LdConditionKey key, Object value) {
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
    public LdCollectionCQ addOrderBy_UTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_TIME), null, true);return this;
    }

    /**
     * Add order-by of uTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ addOrderBy_UTime_Desc() {
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
    public LdCollectionCQ setRStaff_Equal(String value) {
        return registerRStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of rStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRStaff_Equal_EmptyString() {
        return registerRStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of rStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRStaff_NotEqual(String value) {
        return registerRStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRStaff_GreaterThan(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRStaff_LessThan(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRStaff_GreaterEqual(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRStaff_LessEqual(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRStaff_PrefixSearch(String value) {
        return registerRStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as inScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRStaff_InScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of rStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setRStaff_NotInScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of rStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdCollectionCQ registerRStaff(LdConditionKey key, Object value) {
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
    public LdCollectionCQ addOrderBy_RStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_STAFF), null, true);return this;
    }

    /**
     * Add order-by of rStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ addOrderBy_RStaff_Desc() {
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
    public LdCollectionCQ setUStaff_Equal(String value) {
        return registerUStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of uStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUStaff_Equal_EmptyString() {
        return registerUStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of uStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUStaff_NotEqual(String value) {
        return registerUStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUStaff_GreaterThan(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUStaff_LessThan(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUStaff_GreaterEqual(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUStaff_LessEqual(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUStaff_PrefixSearch(String value) {
        return registerUStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as inScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUStaff_InScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of uStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdCollectionCQ setUStaff_NotInScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of uStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdCollectionCQ registerUStaff(LdConditionKey key, Object value) {
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
    public LdCollectionCQ addOrderBy_UStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, true);return this;
    }

    /**
     * Add order-by of uStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionCQ addOrderBy_UStaff_Desc() {
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
    //   ForeignTable    = [BOOK]
    //   ForeignProperty = [book]
    // * * * * * * * * */

    /**
     * Query for book.
     * 
     * @return Instance of LdBookCQ as book. (NotNull)
     */
    public LdBookCQ queryBook() {
        return getConditionQueryBook();
    }

    /**
     * Setup outer join for ${foreignPropertyName}.
     */
    public void setupOuterJoin_Book() {
        final java.util.Map<String, String> joinOnMap = new java.util.LinkedHashMap<String, String>();
        String key = null;
        String value = null;
    
        key = getRealColumnName("BOOK_ID");
        value = getConditionQueryBook().getRealColumnName("BOOK_ID");
        joinOnMap.put(key, value);
    
        final String joinTableName = "BOOK";
        final String aliasName = getConditionQueryBook().getRealAliasName();
        getSqlClause().registerOuterJoin(joinTableName, aliasName, joinOnMap);
    }

    /** Condition-query for book. */
    protected LdBookCQ _conditionQueryBook;

    /**
     * Get condition-query for book.
     * 
     * @return Instance of LdBookCQ as book. (NotNull)
     */
    public LdBookCQ getConditionQueryBook() {
        if (_conditionQueryBook == null) {
            _conditionQueryBook = newQueryBook();
            setupOuterJoin_Book();
        }
        return _conditionQueryBook;
    }

    /**
     * New query for book.
     * 
     * @return Query for book. (NotNull)
     */
    protected LdBookCQ newQueryBook() {
        return new LdBookCQ(this, getSqlClause(), "Book", getNextNestLevel());
    }
  
      
    // /* * * * * * * * * * * * * * * * * * * * * * * {as one}
    //   ReffererTable    = [COLLECTION_STATUS]
    //   ReffererProperty = [collectionStatusAsOne]
    // * * * * * * * * */

    /**
     * Query for collectionStatusAsOne.
     * 
     * @return Instance of LdCollectionStatusCQ as collectionStatusAsOne. (NotNull)
     */
    public LdCollectionStatusCQ queryCollectionStatusAsOne() {
        return getConditionQueryCollectionStatusAsOne();
    }

    /**
     * Setup outer join for collectionStatusList.
     */
    public void setupOuterJoin_CollectionStatusAsOne() {
        final java.util.Map<String, String> joinOnMap = new java.util.LinkedHashMap<String, String>();
        String key = null;
        String value = null;
      
        key = getRealColumnName("COLLECTION_ID");
        value = getConditionQueryCollectionStatusAsOne().getRealColumnName("COLLECTION_ID");
        joinOnMap.put(key, value);
      
        final String joinTableName = "COLLECTION_STATUS";
        final String aliasName = getConditionQueryCollectionStatusAsOne().getRealAliasName();
        getSqlClause().registerOuterJoin(joinTableName, aliasName, joinOnMap);
    }

    /** Condition-query for collectionStatusAsOne. */
    protected LdCollectionStatusCQ _conditionQueryCollectionStatusAsOne;

    /**
     * Get condition-query for collectionStatusAsOne.
     * 
     * @return Instance of LdCollectionStatusCQ as collectionStatusAsOne. (NotNull)
     */
    public LdCollectionStatusCQ getConditionQueryCollectionStatusAsOne() {
        if (_conditionQueryCollectionStatusAsOne == null) {
            _conditionQueryCollectionStatusAsOne = newQueryCollectionStatusAsOne();
            setupOuterJoin_CollectionStatusAsOne();
        }
        return _conditionQueryCollectionStatusAsOne;
    }

    /**
     * New query for collectionStatusAsOne.
     * 
     * @return Query for collectionStatusAsOne. (NotNull)
     */
    protected LdCollectionStatusCQ newQueryCollectionStatusAsOne() {
        return new LdCollectionStatusCQ(this, getSqlClause(), "CollectionStatusAsOne", getNextNestLevel());
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

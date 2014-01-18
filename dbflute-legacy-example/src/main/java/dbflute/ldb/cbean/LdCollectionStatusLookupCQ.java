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
public class LdCollectionStatusLookupCQ extends LdAbstractConditionQuery {

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
    LdCollectionStatusLookupCQ(LdAbstractConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "COLLECTION_STATUS_LOOKUP";
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
     * Include select-column of collectionStatusCode as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ includeAsMine_CollectionStatusCode() {
        return registerIncludedSelectColumn("CollectionStatusCode", getRealColumnName("COLLECTION_STATUS_CODE"));
    }

    /**
     * Include select-column of collectionStatusCode as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ includeAsMine_CollectionStatusCode(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("COLLECTION_STATUS_CODE"));
    }
  
    /**
     * Include select-column of collectionStatusName as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ includeAsMine_CollectionStatusName() {
        return registerIncludedSelectColumn("CollectionStatusName", getRealColumnName("COLLECTION_STATUS_NAME"));
    }

    /**
     * Include select-column of collectionStatusName as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ includeAsMine_CollectionStatusName(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("COLLECTION_STATUS_NAME"));
    }
  
    /**
     * Include select-column of rTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ includeAsMine_RTime() {
        return registerIncludedSelectColumn("RTime", getRealColumnName("R_TIME"));
    }

    /**
     * Include select-column of rTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ includeAsMine_RTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_TIME"));
    }
  
    /**
     * Include select-column of uTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ includeAsMine_UTime() {
        return registerIncludedSelectColumn("UTime", getRealColumnName("U_TIME"));
    }

    /**
     * Include select-column of uTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ includeAsMine_UTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_TIME"));
    }
  
    /**
     * Include select-column of rStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ includeAsMine_RStaff() {
        return registerIncludedSelectColumn("RStaff", getRealColumnName("R_STAFF"));
    }

    /**
     * Include select-column of rStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ includeAsMine_RStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_STAFF"));
    }
  
    /**
     * Include select-column of uStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ includeAsMine_UStaff() {
        return registerIncludedSelectColumn("UStaff", getRealColumnName("U_STAFF"));
    }

    /**
     * Include select-column of uStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ includeAsMine_UStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_STAFF"));
    }
  
    /**
     * Register included-select-column.
     * 
     * @param aliasName Alias name. This should not contain comma. (NotNull)
     * @param realColumnName Real column name. This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    protected LdCollectionStatusLookupCQ registerIncludedSelectColumn(String aliasName, String realColumnName) {
        assertAliasName(aliasName);
        assertColumnName(realColumnName);
        getSqlClause().registerIncludedSelectColumn(aliasName, realColumnName);
        return this;
    }

    // =====================================================================================
    //                                                                                 Query
    //                                                                                 =====
      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   MyTable = [COLLECTION_STATUS_LOOKUP]
    // * * * * * * * * */

      
    /** Column db name of collectionStatusCode. */
    protected static final String COL_COLLECTION_STATUS_CODE = "COLLECTION_STATUS_CODE";

    /** Column java name of collectionStatusCode. */
    protected static final String J_CollectionStatusCode = "CollectionStatusCode";

    /** Column uncapitalised java name of collectionStatusCode. */
    protected static final String UJ_collectionStatusCode = "collectionStatusCode";

    /** The attribute of collectionStatusCode. */
    protected LdConditionValue _collectionStatusCode;

    /**
     * Get the value of collectionStatusCode.
     * 
     * @return The value of collectionStatusCode.
     */
    public LdConditionValue getCollectionStatusCode() {
        if (_collectionStatusCode == null) {
            _collectionStatusCode = new LdConditionValue();
        }
        return _collectionStatusCode;
    }
        
    /**
     * Set the value of collectionStatusCode as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of collectionStatusCode as equal.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusCode_Equal(String value) {
        return registerCollectionStatusCode(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of collectionStatusCode as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusCode_Equal_EmptyString() {
        return registerCollectionStatusCode(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of collectionStatusCode as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of collectionStatusCode as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusCode_NotEqual(String value) {
        return registerCollectionStatusCode(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of collectionStatusCode as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of collectionStatusCode as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusCode_GreaterThan(String value) {
        return registerCollectionStatusCode(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of collectionStatusCode as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of collectionStatusCode as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusCode_LessThan(String value) {
        return registerCollectionStatusCode(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of collectionStatusCode as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of collectionStatusCode as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusCode_GreaterEqual(String value) {
        return registerCollectionStatusCode(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of collectionStatusCode as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of collectionStatusCode as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusCode_LessEqual(String value) {
        return registerCollectionStatusCode(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of collectionStatusCode as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of collectionStatusCode as prefixSearch.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusCode_PrefixSearch(String value) {
        return registerCollectionStatusCode(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of collectionStatusCode as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of collectionStatusCode as inScope.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusCode_InScope(java.util.List<String> valueList) {
        return registerCollectionStatusCode(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of collectionStatusCode as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of collectionStatusCode as notInScope.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusCode_NotInScope(java.util.List<String> valueList) {
        return registerCollectionStatusCode(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
              
    /** The sub-query of CollectionStatusCode_InScopeSubQuery_CollectionStatusList as inScopeSubQuery. */
    protected LdCollectionStatusCQ _collectionStatusCode_InScopeSubQuery_CollectionStatusList;

    /**
     * Get the sub-query of CollectionStatusCode_InScopeSubQuery_CollectionStatusList as inScopeSubQuery.
     * 
     * @return The sub-query of CollectionStatusCode_InScopeSubQuery_CollectionStatusList as inScopeSubQuery. (Nullable)
     */
    public LdCollectionStatusCQ getCollectionStatusCode_InScopeSubQuery_CollectionStatusList() {
        return _collectionStatusCode_InScopeSubQuery_CollectionStatusList;
    }

    /**
     * Set the sub-query of CollectionStatusCode_InScopeSubQuery_CollectionStatusList as inScopeSubQuery.
     * { in (select xxx.COLLECTION_STATUS_CODE from COLLECTION_STATUS where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of CollectionStatusCode_InScopeSubQuery_CollectionStatusList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusCode_InScopeSubQuery_CollectionStatusList(LdCollectionStatusCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _collectionStatusCode_InScopeSubQuery_CollectionStatusList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_COLLECTION_STATUS_CODE), "COLLECTION_STATUS_CODE", "collectionStatusCode_InScopeSubQuery_CollectionStatusList");
        return this;
    }
                                          
    /**
     * Register condition of collectionStatusCode.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of collectionStatusCode. (Nullable)
     * @return this. (NotNull)
     */
    protected LdCollectionStatusLookupCQ registerCollectionStatusCode(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getCollectionStatusCode(), value)) {
            key.setupConditionValue(getCollectionStatusCode(), value, getLocation(UJ_collectionStatusCode, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_COLLECTION_STATUS_CODE), key, getCollectionStatusCode());
        }
        return this;
    }
    
    /**
     * Add order-by of collectionStatusCode as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ addOrderBy_CollectionStatusCode_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_COLLECTION_STATUS_CODE), null, true);return this;
    }

    /**
     * Add order-by of collectionStatusCode as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ addOrderBy_CollectionStatusCode_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_COLLECTION_STATUS_CODE), null, false);return this;
    }
          
    /** Column db name of collectionStatusName. */
    protected static final String COL_COLLECTION_STATUS_NAME = "COLLECTION_STATUS_NAME";

    /** Column java name of collectionStatusName. */
    protected static final String J_CollectionStatusName = "CollectionStatusName";

    /** Column uncapitalised java name of collectionStatusName. */
    protected static final String UJ_collectionStatusName = "collectionStatusName";

    /** The attribute of collectionStatusName. */
    protected LdConditionValue _collectionStatusName;

    /**
     * Get the value of collectionStatusName.
     * 
     * @return The value of collectionStatusName.
     */
    public LdConditionValue getCollectionStatusName() {
        if (_collectionStatusName == null) {
            _collectionStatusName = new LdConditionValue();
        }
        return _collectionStatusName;
    }
        
    /**
     * Set the value of collectionStatusName as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of collectionStatusName as equal.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusName_Equal(String value) {
        return registerCollectionStatusName(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of collectionStatusName as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusName_Equal_EmptyString() {
        return registerCollectionStatusName(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of collectionStatusName as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of collectionStatusName as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusName_NotEqual(String value) {
        return registerCollectionStatusName(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of collectionStatusName as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of collectionStatusName as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusName_GreaterThan(String value) {
        return registerCollectionStatusName(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of collectionStatusName as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of collectionStatusName as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusName_LessThan(String value) {
        return registerCollectionStatusName(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of collectionStatusName as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of collectionStatusName as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusName_GreaterEqual(String value) {
        return registerCollectionStatusName(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of collectionStatusName as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of collectionStatusName as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusName_LessEqual(String value) {
        return registerCollectionStatusName(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of collectionStatusName as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of collectionStatusName as prefixSearch.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusName_PrefixSearch(String value) {
        return registerCollectionStatusName(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of collectionStatusName as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of collectionStatusName as inScope.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusName_InScope(java.util.List<String> valueList) {
        return registerCollectionStatusName(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of collectionStatusName as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of collectionStatusName as notInScope.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setCollectionStatusName_NotInScope(java.util.List<String> valueList) {
        return registerCollectionStatusName(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of collectionStatusName.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of collectionStatusName. (Nullable)
     * @return this. (NotNull)
     */
    protected LdCollectionStatusLookupCQ registerCollectionStatusName(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getCollectionStatusName(), value)) {
            key.setupConditionValue(getCollectionStatusName(), value, getLocation(UJ_collectionStatusName, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_COLLECTION_STATUS_NAME), key, getCollectionStatusName());
        }
        return this;
    }
    
    /**
     * Add order-by of collectionStatusName as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ addOrderBy_CollectionStatusName_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_COLLECTION_STATUS_NAME), null, true);return this;
    }

    /**
     * Add order-by of collectionStatusName as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ addOrderBy_CollectionStatusName_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_COLLECTION_STATUS_NAME), null, false);return this;
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
    public LdCollectionStatusLookupCQ setRTime_Equal(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of rTime as notEqual. { != }
     * 
     * @param value The value of rTime as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRTime_NotEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of rTime as greaterThan. { &gt; }
     * 
     * @param value The value of rTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRTime_GreaterThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of rTime as lessThan. { &lt; }
     * 
     * @param value The value of rTime as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRTime_LessThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of rTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of rTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRTime_GreaterEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of rTime as lessEqual. { &lt;= }
     * 
     * @param value The value of rTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRTime_LessEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of rTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as inScope.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of rTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as notInScope.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of rTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdCollectionStatusLookupCQ registerRTime(LdConditionKey key, Object value) {
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
    public LdCollectionStatusLookupCQ addOrderBy_RTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_TIME), null, true);return this;
    }

    /**
     * Add order-by of rTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ addOrderBy_RTime_Desc() {
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
    public LdCollectionStatusLookupCQ setUTime_Equal(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of uTime as notEqual. { != }
     * 
     * @param value The value of uTime as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUTime_NotEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of uTime as greaterThan. { &gt; }
     * 
     * @param value The value of uTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUTime_GreaterThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of uTime as lessThan. { &lt; }
     * 
     * @param value The value of uTime as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUTime_LessThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of uTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of uTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUTime_GreaterEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of uTime as lessEqual. { &lt;= }
     * 
     * @param value The value of uTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUTime_LessEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of uTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as inScope.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of uTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as notInScope.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of uTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdCollectionStatusLookupCQ registerUTime(LdConditionKey key, Object value) {
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
    public LdCollectionStatusLookupCQ addOrderBy_UTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_TIME), null, true);return this;
    }

    /**
     * Add order-by of uTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ addOrderBy_UTime_Desc() {
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
    public LdCollectionStatusLookupCQ setRStaff_Equal(String value) {
        return registerRStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of rStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRStaff_Equal_EmptyString() {
        return registerRStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of rStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRStaff_NotEqual(String value) {
        return registerRStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRStaff_GreaterThan(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRStaff_LessThan(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRStaff_GreaterEqual(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRStaff_LessEqual(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRStaff_PrefixSearch(String value) {
        return registerRStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as inScope.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRStaff_InScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of rStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setRStaff_NotInScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of rStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdCollectionStatusLookupCQ registerRStaff(LdConditionKey key, Object value) {
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
    public LdCollectionStatusLookupCQ addOrderBy_RStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_STAFF), null, true);return this;
    }

    /**
     * Add order-by of rStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ addOrderBy_RStaff_Desc() {
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
    public LdCollectionStatusLookupCQ setUStaff_Equal(String value) {
        return registerUStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of uStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUStaff_Equal_EmptyString() {
        return registerUStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of uStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUStaff_NotEqual(String value) {
        return registerUStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUStaff_GreaterThan(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUStaff_LessThan(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUStaff_GreaterEqual(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUStaff_LessEqual(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUStaff_PrefixSearch(String value) {
        return registerUStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as inScope.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUStaff_InScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of uStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ setUStaff_NotInScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of uStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdCollectionStatusLookupCQ registerUStaff(LdConditionKey key, Object value) {
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
    public LdCollectionStatusLookupCQ addOrderBy_UStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, true);return this;
    }

    /**
     * Add order-by of uStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdCollectionStatusLookupCQ addOrderBy_UStaff_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, false);return this;
    }
      
    // =====================================================================================
    //                                                               Query-SetupOuter-Method
    //                                                               =======================

  
        
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

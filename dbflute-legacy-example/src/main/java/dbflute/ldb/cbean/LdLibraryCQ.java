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
public class LdLibraryCQ extends LdAbstractConditionQuery {

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
    LdLibraryCQ(LdAbstractConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "LIBRARY";
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
     * Include select-column of libraryId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ includeAsMine_LibraryId() {
        return registerIncludedSelectColumn("LibraryId", getRealColumnName("LIBRARY_ID"));
    }

    /**
     * Include select-column of libraryId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLibraryCQ includeAsMine_LibraryId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("LIBRARY_ID"));
    }
  
    /**
     * Include select-column of libraryName as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ includeAsMine_LibraryName() {
        return registerIncludedSelectColumn("LibraryName", getRealColumnName("LIBRARY_NAME"));
    }

    /**
     * Include select-column of libraryName as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLibraryCQ includeAsMine_LibraryName(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("LIBRARY_NAME"));
    }
  
    /**
     * Include select-column of rTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ includeAsMine_RTime() {
        return registerIncludedSelectColumn("RTime", getRealColumnName("R_TIME"));
    }

    /**
     * Include select-column of rTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLibraryCQ includeAsMine_RTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_TIME"));
    }
  
    /**
     * Include select-column of uTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ includeAsMine_UTime() {
        return registerIncludedSelectColumn("UTime", getRealColumnName("U_TIME"));
    }

    /**
     * Include select-column of uTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLibraryCQ includeAsMine_UTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_TIME"));
    }
  
    /**
     * Include select-column of rStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ includeAsMine_RStaff() {
        return registerIncludedSelectColumn("RStaff", getRealColumnName("R_STAFF"));
    }

    /**
     * Include select-column of rStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLibraryCQ includeAsMine_RStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_STAFF"));
    }
  
    /**
     * Include select-column of uStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ includeAsMine_UStaff() {
        return registerIncludedSelectColumn("UStaff", getRealColumnName("U_STAFF"));
    }

    /**
     * Include select-column of uStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdLibraryCQ includeAsMine_UStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_STAFF"));
    }
  
    /**
     * Register included-select-column.
     * 
     * @param aliasName Alias name. This should not contain comma. (NotNull)
     * @param realColumnName Real column name. This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    protected LdLibraryCQ registerIncludedSelectColumn(String aliasName, String realColumnName) {
        assertAliasName(aliasName);
        assertColumnName(realColumnName);
        getSqlClause().registerIncludedSelectColumn(aliasName, realColumnName);
        return this;
    }

    // =====================================================================================
    //                                                                                 Query
    //                                                                                 =====
      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   MyTable = [LIBRARY]
    // * * * * * * * * */

      
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
    public LdLibraryCQ setLibraryId_Equal(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of libraryId as equal. { = }
     * 
     * @param value The value of libraryId as equal.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_Equal(long value) {
        return registerLibraryId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as notEqual. { != }
     * 
     * @param value The value of libraryId as notEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_NotEqual(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of libraryId as notEqual. { != }
     * 
     * @param value The value of libraryId as notEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_NotEqual(long value) {
        return registerLibraryId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as greaterThan. { &gt; }
     * 
     * @param value The value of libraryId as greaterThan.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_GreaterThan(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of libraryId as greaterThan. { &gt; }
     * 
     * @param value The value of libraryId as greaterThan.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_GreaterThan(long value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as lessThan. { &lt; }
     * 
     * @param value The value of libraryId as lessThan.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_LessThan(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of libraryId as lessThan. { &lt; }
     * 
     * @param value The value of libraryId as lessThan.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_LessThan(long value) {
        return registerLibraryId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as greaterEqual. { &gt;= }
     * 
     * @param value The value of libraryId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_GreaterEqual(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of libraryId as greaterEqual. { &gt;= }
     * 
     * @param value The value of libraryId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_GreaterEqual(long value) {
        return registerLibraryId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as lessEqual. { &lt;= }
     * 
     * @param value The value of libraryId as lessEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_LessEqual(java.math.BigDecimal value) {
        return registerLibraryId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of libraryId as lessEqual. { &lt;= }
     * 
     * @param value The value of libraryId as lessEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_LessEqual(long value) {
        return registerLibraryId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of libraryId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of libraryId as inScope.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLibraryId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of libraryId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of libraryId as notInScope.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerLibraryId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
              
    /** The sub-query of LibraryId_InScopeSubQuery_CollectionList as inScopeSubQuery. */
    protected LdCollectionCQ _libraryId_InScopeSubQuery_CollectionList;

    /**
     * Get the sub-query of LibraryId_InScopeSubQuery_CollectionList as inScopeSubQuery.
     * 
     * @return The sub-query of LibraryId_InScopeSubQuery_CollectionList as inScopeSubQuery. (Nullable)
     */
    public LdCollectionCQ getLibraryId_InScopeSubQuery_CollectionList() {
        return _libraryId_InScopeSubQuery_CollectionList;
    }

    /**
     * Set the sub-query of LibraryId_InScopeSubQuery_CollectionList as inScopeSubQuery.
     * { in (select xxx.LIBRARY_ID from COLLECTION where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of LibraryId_InScopeSubQuery_CollectionList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_InScopeSubQuery_CollectionList(LdCollectionCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _libraryId_InScopeSubQuery_CollectionList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_LIBRARY_ID), "LIBRARY_ID", "libraryId_InScopeSubQuery_CollectionList");
        return this;
    }
        
    /** The sub-query of LibraryId_InScopeSubQuery_LbUserList as inScopeSubQuery. */
    protected LdLbUserCQ _libraryId_InScopeSubQuery_LbUserList;

    /**
     * Get the sub-query of LibraryId_InScopeSubQuery_LbUserList as inScopeSubQuery.
     * 
     * @return The sub-query of LibraryId_InScopeSubQuery_LbUserList as inScopeSubQuery. (Nullable)
     */
    public LdLbUserCQ getLibraryId_InScopeSubQuery_LbUserList() {
        return _libraryId_InScopeSubQuery_LbUserList;
    }

    /**
     * Set the sub-query of LibraryId_InScopeSubQuery_LbUserList as inScopeSubQuery.
     * { in (select xxx.LIBRARY_ID from LB_USER where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of LibraryId_InScopeSubQuery_LbUserList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_InScopeSubQuery_LbUserList(LdLbUserCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _libraryId_InScopeSubQuery_LbUserList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_LIBRARY_ID), "LIBRARY_ID", "libraryId_InScopeSubQuery_LbUserList");
        return this;
    }
        
    /** The sub-query of LibraryId_InScopeSubQuery_LendingList as inScopeSubQuery. */
    protected LdLendingCQ _libraryId_InScopeSubQuery_LendingList;

    /**
     * Get the sub-query of LibraryId_InScopeSubQuery_LendingList as inScopeSubQuery.
     * 
     * @return The sub-query of LibraryId_InScopeSubQuery_LendingList as inScopeSubQuery. (Nullable)
     */
    public LdLendingCQ getLibraryId_InScopeSubQuery_LendingList() {
        return _libraryId_InScopeSubQuery_LendingList;
    }

    /**
     * Set the sub-query of LibraryId_InScopeSubQuery_LendingList as inScopeSubQuery.
     * { in (select xxx.LIBRARY_ID from LENDING where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of LibraryId_InScopeSubQuery_LendingList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_InScopeSubQuery_LendingList(LdLendingCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _libraryId_InScopeSubQuery_LendingList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_LIBRARY_ID), "LIBRARY_ID", "libraryId_InScopeSubQuery_LendingList");
        return this;
    }
        
    /** The sub-query of LibraryId_InScopeSubQuery_NextLibraryByNextLibraryIdList as inScopeSubQuery. */
    protected LdNextLibraryCQ _libraryId_InScopeSubQuery_NextLibraryByNextLibraryIdList;

    /**
     * Get the sub-query of LibraryId_InScopeSubQuery_NextLibraryByNextLibraryIdList as inScopeSubQuery.
     * 
     * @return The sub-query of LibraryId_InScopeSubQuery_NextLibraryByNextLibraryIdList as inScopeSubQuery. (Nullable)
     */
    public LdNextLibraryCQ getLibraryId_InScopeSubQuery_NextLibraryByNextLibraryIdList() {
        return _libraryId_InScopeSubQuery_NextLibraryByNextLibraryIdList;
    }

    /**
     * Set the sub-query of LibraryId_InScopeSubQuery_NextLibraryByNextLibraryIdList as inScopeSubQuery.
     * { in (select xxx.NEXT_LIBRARY_ID from NEXT_LIBRARY where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of LibraryId_InScopeSubQuery_NextLibraryByNextLibraryIdList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_InScopeSubQuery_NextLibraryByNextLibraryIdList(LdNextLibraryCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _libraryId_InScopeSubQuery_NextLibraryByNextLibraryIdList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_LIBRARY_ID), "NEXT_LIBRARY_ID", "libraryId_InScopeSubQuery_NextLibraryByNextLibraryIdList");
        return this;
    }
        
    /** The sub-query of LibraryId_InScopeSubQuery_NextLibraryByLibraryIdList as inScopeSubQuery. */
    protected LdNextLibraryCQ _libraryId_InScopeSubQuery_NextLibraryByLibraryIdList;

    /**
     * Get the sub-query of LibraryId_InScopeSubQuery_NextLibraryByLibraryIdList as inScopeSubQuery.
     * 
     * @return The sub-query of LibraryId_InScopeSubQuery_NextLibraryByLibraryIdList as inScopeSubQuery. (Nullable)
     */
    public LdNextLibraryCQ getLibraryId_InScopeSubQuery_NextLibraryByLibraryIdList() {
        return _libraryId_InScopeSubQuery_NextLibraryByLibraryIdList;
    }

    /**
     * Set the sub-query of LibraryId_InScopeSubQuery_NextLibraryByLibraryIdList as inScopeSubQuery.
     * { in (select xxx.LIBRARY_ID from NEXT_LIBRARY where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of LibraryId_InScopeSubQuery_NextLibraryByLibraryIdList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryId_InScopeSubQuery_NextLibraryByLibraryIdList(LdNextLibraryCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _libraryId_InScopeSubQuery_NextLibraryByLibraryIdList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_LIBRARY_ID), "LIBRARY_ID", "libraryId_InScopeSubQuery_NextLibraryByLibraryIdList");
        return this;
    }
                                      
    /**
     * Register condition of libraryId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of libraryId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLibraryCQ registerLibraryId(LdConditionKey key, Object value) {
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
    public LdLibraryCQ addOrderBy_LibraryId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LIBRARY_ID), null, true);return this;
    }

    /**
     * Add order-by of libraryId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ addOrderBy_LibraryId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LIBRARY_ID), null, false);return this;
    }
          
    /** Column db name of libraryName. */
    protected static final String COL_LIBRARY_NAME = "LIBRARY_NAME";

    /** Column java name of libraryName. */
    protected static final String J_LibraryName = "LibraryName";

    /** Column uncapitalised java name of libraryName. */
    protected static final String UJ_libraryName = "libraryName";

    /** The attribute of libraryName. */
    protected LdConditionValue _libraryName;

    /**
     * Get the value of libraryName.
     * 
     * @return The value of libraryName.
     */
    public LdConditionValue getLibraryName() {
        if (_libraryName == null) {
            _libraryName = new LdConditionValue();
        }
        return _libraryName;
    }
        
    /**
     * Set the value of libraryName as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of libraryName as equal.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryName_Equal(String value) {
        return registerLibraryName(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of libraryName as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryName_Equal_EmptyString() {
        return registerLibraryName(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of libraryName as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of libraryName as notEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryName_NotEqual(String value) {
        return registerLibraryName(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of libraryName as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of libraryName as greaterThan.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryName_GreaterThan(String value) {
        return registerLibraryName(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of libraryName as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of libraryName as lessThan.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryName_LessThan(String value) {
        return registerLibraryName(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of libraryName as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of libraryName as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryName_GreaterEqual(String value) {
        return registerLibraryName(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of libraryName as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of libraryName as lessEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryName_LessEqual(String value) {
        return registerLibraryName(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of libraryName as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of libraryName as prefixSearch.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryName_PrefixSearch(String value) {
        return registerLibraryName(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of libraryName as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of libraryName as inScope.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryName_InScope(java.util.List<String> valueList) {
        return registerLibraryName(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of libraryName as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of libraryName as notInScope.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setLibraryName_NotInScope(java.util.List<String> valueList) {
        return registerLibraryName(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of libraryName.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of libraryName. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLibraryCQ registerLibraryName(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getLibraryName(), value)) {
            key.setupConditionValue(getLibraryName(), value, getLocation(UJ_libraryName, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_LIBRARY_NAME), key, getLibraryName());
        }
        return this;
    }
    
    /**
     * Add order-by of libraryName as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ addOrderBy_LibraryName_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LIBRARY_NAME), null, true);return this;
    }

    /**
     * Add order-by of libraryName as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ addOrderBy_LibraryName_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_LIBRARY_NAME), null, false);return this;
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
    public LdLibraryCQ setRTime_Equal(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of rTime as notEqual. { != }
     * 
     * @param value The value of rTime as notEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRTime_NotEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of rTime as greaterThan. { &gt; }
     * 
     * @param value The value of rTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRTime_GreaterThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of rTime as lessThan. { &lt; }
     * 
     * @param value The value of rTime as lessThan.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRTime_LessThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of rTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of rTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRTime_GreaterEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of rTime as lessEqual. { &lt;= }
     * 
     * @param value The value of rTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRTime_LessEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of rTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as inScope.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of rTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as notInScope.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of rTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLibraryCQ registerRTime(LdConditionKey key, Object value) {
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
    public LdLibraryCQ addOrderBy_RTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_TIME), null, true);return this;
    }

    /**
     * Add order-by of rTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ addOrderBy_RTime_Desc() {
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
    public LdLibraryCQ setUTime_Equal(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of uTime as notEqual. { != }
     * 
     * @param value The value of uTime as notEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUTime_NotEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of uTime as greaterThan. { &gt; }
     * 
     * @param value The value of uTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUTime_GreaterThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of uTime as lessThan. { &lt; }
     * 
     * @param value The value of uTime as lessThan.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUTime_LessThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of uTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of uTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUTime_GreaterEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of uTime as lessEqual. { &lt;= }
     * 
     * @param value The value of uTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUTime_LessEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of uTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as inScope.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of uTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as notInScope.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of uTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLibraryCQ registerUTime(LdConditionKey key, Object value) {
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
    public LdLibraryCQ addOrderBy_UTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_TIME), null, true);return this;
    }

    /**
     * Add order-by of uTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ addOrderBy_UTime_Desc() {
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
    public LdLibraryCQ setRStaff_Equal(String value) {
        return registerRStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of rStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRStaff_Equal_EmptyString() {
        return registerRStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of rStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRStaff_NotEqual(String value) {
        return registerRStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRStaff_GreaterThan(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRStaff_LessThan(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRStaff_GreaterEqual(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRStaff_LessEqual(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRStaff_PrefixSearch(String value) {
        return registerRStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as inScope.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRStaff_InScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of rStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setRStaff_NotInScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of rStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLibraryCQ registerRStaff(LdConditionKey key, Object value) {
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
    public LdLibraryCQ addOrderBy_RStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_STAFF), null, true);return this;
    }

    /**
     * Add order-by of rStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ addOrderBy_RStaff_Desc() {
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
    public LdLibraryCQ setUStaff_Equal(String value) {
        return registerUStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of uStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUStaff_Equal_EmptyString() {
        return registerUStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of uStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUStaff_NotEqual(String value) {
        return registerUStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUStaff_GreaterThan(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUStaff_LessThan(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUStaff_GreaterEqual(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUStaff_LessEqual(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUStaff_PrefixSearch(String value) {
        return registerUStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as inScope.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUStaff_InScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of uStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdLibraryCQ setUStaff_NotInScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of uStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdLibraryCQ registerUStaff(LdConditionKey key, Object value) {
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
    public LdLibraryCQ addOrderBy_UStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, true);return this;
    }

    /**
     * Add order-by of uStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdLibraryCQ addOrderBy_UStaff_Desc() {
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

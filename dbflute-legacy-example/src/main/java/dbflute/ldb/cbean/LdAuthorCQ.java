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
public class LdAuthorCQ extends LdAbstractConditionQuery {

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
    LdAuthorCQ(LdAbstractConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "AUTHOR";
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
     * Include select-column of authorId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ includeAsMine_AuthorId() {
        return registerIncludedSelectColumn("AuthorId", getRealColumnName("AUTHOR_ID"));
    }

    /**
     * Include select-column of authorId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdAuthorCQ includeAsMine_AuthorId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("AUTHOR_ID"));
    }
  
    /**
     * Include select-column of authorName as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ includeAsMine_AuthorName() {
        return registerIncludedSelectColumn("AuthorName", getRealColumnName("AUTHOR_NAME"));
    }

    /**
     * Include select-column of authorName as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdAuthorCQ includeAsMine_AuthorName(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("AUTHOR_NAME"));
    }
  
    /**
     * Include select-column of rTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ includeAsMine_RTime() {
        return registerIncludedSelectColumn("RTime", getRealColumnName("R_TIME"));
    }

    /**
     * Include select-column of rTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdAuthorCQ includeAsMine_RTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_TIME"));
    }
  
    /**
     * Include select-column of uTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ includeAsMine_UTime() {
        return registerIncludedSelectColumn("UTime", getRealColumnName("U_TIME"));
    }

    /**
     * Include select-column of uTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdAuthorCQ includeAsMine_UTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_TIME"));
    }
  
    /**
     * Include select-column of rStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ includeAsMine_RStaff() {
        return registerIncludedSelectColumn("RStaff", getRealColumnName("R_STAFF"));
    }

    /**
     * Include select-column of rStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdAuthorCQ includeAsMine_RStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_STAFF"));
    }
  
    /**
     * Include select-column of uStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ includeAsMine_UStaff() {
        return registerIncludedSelectColumn("UStaff", getRealColumnName("U_STAFF"));
    }

    /**
     * Include select-column of uStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdAuthorCQ includeAsMine_UStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_STAFF"));
    }
  
    /**
     * Register included-select-column.
     * 
     * @param aliasName Alias name. This should not contain comma. (NotNull)
     * @param realColumnName Real column name. This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    protected LdAuthorCQ registerIncludedSelectColumn(String aliasName, String realColumnName) {
        assertAliasName(aliasName);
        assertColumnName(realColumnName);
        getSqlClause().registerIncludedSelectColumn(aliasName, realColumnName);
        return this;
    }

    // =====================================================================================
    //                                                                                 Query
    //                                                                                 =====
      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   MyTable = [AUTHOR]
    // * * * * * * * * */

      
    /** Column db name of authorId. */
    protected static final String COL_AUTHOR_ID = "AUTHOR_ID";

    /** Column java name of authorId. */
    protected static final String J_AuthorId = "AuthorId";

    /** Column uncapitalised java name of authorId. */
    protected static final String UJ_authorId = "authorId";

    /** The attribute of authorId. */
    protected LdConditionValue _authorId;

    /**
     * Get the value of authorId.
     * 
     * @return The value of authorId.
     */
    public LdConditionValue getAuthorId() {
        if (_authorId == null) {
            _authorId = new LdConditionValue();
        }
        return _authorId;
    }
            
    /**
     * Set the value of authorId as equal. { = }
     * 
     * @param value The value of authorId as equal.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_Equal(java.math.BigDecimal value) {
        return registerAuthorId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of authorId as equal. { = }
     * 
     * @param value The value of authorId as equal.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_Equal(long value) {
        return registerAuthorId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of authorId as notEqual. { != }
     * 
     * @param value The value of authorId as notEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_NotEqual(java.math.BigDecimal value) {
        return registerAuthorId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of authorId as notEqual. { != }
     * 
     * @param value The value of authorId as notEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_NotEqual(long value) {
        return registerAuthorId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of authorId as greaterThan. { &gt; }
     * 
     * @param value The value of authorId as greaterThan.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_GreaterThan(java.math.BigDecimal value) {
        return registerAuthorId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of authorId as greaterThan. { &gt; }
     * 
     * @param value The value of authorId as greaterThan.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_GreaterThan(long value) {
        return registerAuthorId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of authorId as lessThan. { &lt; }
     * 
     * @param value The value of authorId as lessThan.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_LessThan(java.math.BigDecimal value) {
        return registerAuthorId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of authorId as lessThan. { &lt; }
     * 
     * @param value The value of authorId as lessThan.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_LessThan(long value) {
        return registerAuthorId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of authorId as greaterEqual. { &gt;= }
     * 
     * @param value The value of authorId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_GreaterEqual(java.math.BigDecimal value) {
        return registerAuthorId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of authorId as greaterEqual. { &gt;= }
     * 
     * @param value The value of authorId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_GreaterEqual(long value) {
        return registerAuthorId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of authorId as lessEqual. { &lt;= }
     * 
     * @param value The value of authorId as lessEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_LessEqual(java.math.BigDecimal value) {
        return registerAuthorId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of authorId as lessEqual. { &lt;= }
     * 
     * @param value The value of authorId as lessEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_LessEqual(long value) {
        return registerAuthorId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of authorId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of authorId as inScope.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerAuthorId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of authorId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of authorId as notInScope.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerAuthorId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
              
    /** The sub-query of AuthorId_InScopeSubQuery_BookList as inScopeSubQuery. */
    protected LdBookCQ _authorId_InScopeSubQuery_BookList;

    /**
     * Get the sub-query of AuthorId_InScopeSubQuery_BookList as inScopeSubQuery.
     * 
     * @return The sub-query of AuthorId_InScopeSubQuery_BookList as inScopeSubQuery. (Nullable)
     */
    public LdBookCQ getAuthorId_InScopeSubQuery_BookList() {
        return _authorId_InScopeSubQuery_BookList;
    }

    /**
     * Set the sub-query of AuthorId_InScopeSubQuery_BookList as inScopeSubQuery.
     * { in (select xxx.AUTHOR_ID from BOOK where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of AuthorId_InScopeSubQuery_BookList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorId_InScopeSubQuery_BookList(LdBookCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _authorId_InScopeSubQuery_BookList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_AUTHOR_ID), "AUTHOR_ID", "authorId_InScopeSubQuery_BookList");
        return this;
    }
                                      
    /**
     * Register condition of authorId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of authorId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdAuthorCQ registerAuthorId(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getAuthorId(), value)) {
            key.setupConditionValue(getAuthorId(), value, getLocation(UJ_authorId, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_AUTHOR_ID), key, getAuthorId());
        }
        return this;
    }
    
    /**
     * Add order-by of authorId as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ addOrderBy_AuthorId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_AUTHOR_ID), null, true);return this;
    }

    /**
     * Add order-by of authorId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ addOrderBy_AuthorId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_AUTHOR_ID), null, false);return this;
    }
          
    /** Column db name of authorName. */
    protected static final String COL_AUTHOR_NAME = "AUTHOR_NAME";

    /** Column java name of authorName. */
    protected static final String J_AuthorName = "AuthorName";

    /** Column uncapitalised java name of authorName. */
    protected static final String UJ_authorName = "authorName";

    /** The attribute of authorName. */
    protected LdConditionValue _authorName;

    /**
     * Get the value of authorName.
     * 
     * @return The value of authorName.
     */
    public LdConditionValue getAuthorName() {
        if (_authorName == null) {
            _authorName = new LdConditionValue();
        }
        return _authorName;
    }
        
    /**
     * Set the value of authorName as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of authorName as equal.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorName_Equal(String value) {
        return registerAuthorName(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of authorName as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorName_Equal_EmptyString() {
        return registerAuthorName(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of authorName as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of authorName as notEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorName_NotEqual(String value) {
        return registerAuthorName(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of authorName as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of authorName as greaterThan.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorName_GreaterThan(String value) {
        return registerAuthorName(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of authorName as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of authorName as lessThan.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorName_LessThan(String value) {
        return registerAuthorName(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of authorName as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of authorName as greaterEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorName_GreaterEqual(String value) {
        return registerAuthorName(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of authorName as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of authorName as lessEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorName_LessEqual(String value) {
        return registerAuthorName(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of authorName as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of authorName as prefixSearch.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorName_PrefixSearch(String value) {
        return registerAuthorName(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of authorName as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of authorName as inScope.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorName_InScope(java.util.List<String> valueList) {
        return registerAuthorName(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of authorName as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of authorName as notInScope.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setAuthorName_NotInScope(java.util.List<String> valueList) {
        return registerAuthorName(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of authorName.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of authorName. (Nullable)
     * @return this. (NotNull)
     */
    protected LdAuthorCQ registerAuthorName(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getAuthorName(), value)) {
            key.setupConditionValue(getAuthorName(), value, getLocation(UJ_authorName, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_AUTHOR_NAME), key, getAuthorName());
        }
        return this;
    }
    
    /**
     * Add order-by of authorName as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ addOrderBy_AuthorName_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_AUTHOR_NAME), null, true);return this;
    }

    /**
     * Add order-by of authorName as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ addOrderBy_AuthorName_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_AUTHOR_NAME), null, false);return this;
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
    public LdAuthorCQ setRTime_Equal(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of rTime as notEqual. { != }
     * 
     * @param value The value of rTime as notEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRTime_NotEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of rTime as greaterThan. { &gt; }
     * 
     * @param value The value of rTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRTime_GreaterThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of rTime as lessThan. { &lt; }
     * 
     * @param value The value of rTime as lessThan.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRTime_LessThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of rTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of rTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRTime_GreaterEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of rTime as lessEqual. { &lt;= }
     * 
     * @param value The value of rTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRTime_LessEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of rTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as inScope.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of rTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as notInScope.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of rTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdAuthorCQ registerRTime(LdConditionKey key, Object value) {
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
    public LdAuthorCQ addOrderBy_RTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_TIME), null, true);return this;
    }

    /**
     * Add order-by of rTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ addOrderBy_RTime_Desc() {
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
    public LdAuthorCQ setUTime_Equal(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of uTime as notEqual. { != }
     * 
     * @param value The value of uTime as notEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUTime_NotEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of uTime as greaterThan. { &gt; }
     * 
     * @param value The value of uTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUTime_GreaterThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of uTime as lessThan. { &lt; }
     * 
     * @param value The value of uTime as lessThan.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUTime_LessThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of uTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of uTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUTime_GreaterEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of uTime as lessEqual. { &lt;= }
     * 
     * @param value The value of uTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUTime_LessEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of uTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as inScope.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of uTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as notInScope.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of uTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdAuthorCQ registerUTime(LdConditionKey key, Object value) {
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
    public LdAuthorCQ addOrderBy_UTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_TIME), null, true);return this;
    }

    /**
     * Add order-by of uTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ addOrderBy_UTime_Desc() {
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
    public LdAuthorCQ setRStaff_Equal(String value) {
        return registerRStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of rStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRStaff_Equal_EmptyString() {
        return registerRStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of rStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRStaff_NotEqual(String value) {
        return registerRStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRStaff_GreaterThan(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRStaff_LessThan(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRStaff_GreaterEqual(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRStaff_LessEqual(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRStaff_PrefixSearch(String value) {
        return registerRStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as inScope.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRStaff_InScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of rStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setRStaff_NotInScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of rStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdAuthorCQ registerRStaff(LdConditionKey key, Object value) {
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
    public LdAuthorCQ addOrderBy_RStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_STAFF), null, true);return this;
    }

    /**
     * Add order-by of rStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ addOrderBy_RStaff_Desc() {
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
    public LdAuthorCQ setUStaff_Equal(String value) {
        return registerUStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of uStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUStaff_Equal_EmptyString() {
        return registerUStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of uStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUStaff_NotEqual(String value) {
        return registerUStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUStaff_GreaterThan(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUStaff_LessThan(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUStaff_GreaterEqual(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUStaff_LessEqual(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUStaff_PrefixSearch(String value) {
        return registerUStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as inScope.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUStaff_InScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of uStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdAuthorCQ setUStaff_NotInScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of uStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdAuthorCQ registerUStaff(LdConditionKey key, Object value) {
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
    public LdAuthorCQ addOrderBy_UStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, true);return this;
    }

    /**
     * Add order-by of uStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdAuthorCQ addOrderBy_UStaff_Desc() {
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

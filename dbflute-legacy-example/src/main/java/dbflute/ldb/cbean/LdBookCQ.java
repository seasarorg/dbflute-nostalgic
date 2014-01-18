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
public class LdBookCQ extends LdAbstractConditionQuery {

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
    LdBookCQ(LdAbstractConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BOOK";
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
     * Include select-column of bookId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_BookId() {
        return registerIncludedSelectColumn("BookId", getRealColumnName("BOOK_ID"));
    }

    /**
     * Include select-column of bookId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_BookId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("BOOK_ID"));
    }
  
    /**
     * Include select-column of isbnNo as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_IsbnNo() {
        return registerIncludedSelectColumn("IsbnNo", getRealColumnName("ISBN_NO"));
    }

    /**
     * Include select-column of isbnNo as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_IsbnNo(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("ISBN_NO"));
    }
  
    /**
     * Include select-column of bookName as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_BookName() {
        return registerIncludedSelectColumn("BookName", getRealColumnName("BOOK_NAME"));
    }

    /**
     * Include select-column of bookName as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_BookName(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("BOOK_NAME"));
    }
  
    /**
     * Include select-column of authorId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_AuthorId() {
        return registerIncludedSelectColumn("AuthorId", getRealColumnName("AUTHOR_ID"));
    }

    /**
     * Include select-column of authorId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_AuthorId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("AUTHOR_ID"));
    }
  
    /**
     * Include select-column of publisherId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_PublisherId() {
        return registerIncludedSelectColumn("PublisherId", getRealColumnName("PUBLISHER_ID"));
    }

    /**
     * Include select-column of publisherId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_PublisherId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("PUBLISHER_ID"));
    }
  
    /**
     * Include select-column of maxLendingDateCount as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_MaxLendingDateCount() {
        return registerIncludedSelectColumn("MaxLendingDateCount", getRealColumnName("MAX_LENDING_DATE_COUNT"));
    }

    /**
     * Include select-column of maxLendingDateCount as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_MaxLendingDateCount(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("MAX_LENDING_DATE_COUNT"));
    }
  
    /**
     * Include select-column of genreCode as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_GenreCode() {
        return registerIncludedSelectColumn("GenreCode", getRealColumnName("GENRE_CODE"));
    }

    /**
     * Include select-column of genreCode as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_GenreCode(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("GENRE_CODE"));
    }
  
    /**
     * Include select-column of openingPart as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_OpeningPart() {
        return registerIncludedSelectColumn("OpeningPart", getRealColumnName("OPENING_PART"));
    }

    /**
     * Include select-column of openingPart as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_OpeningPart(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("OPENING_PART"));
    }
  
    /**
     * Include select-column of rTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_RTime() {
        return registerIncludedSelectColumn("RTime", getRealColumnName("R_TIME"));
    }

    /**
     * Include select-column of rTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_RTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_TIME"));
    }
  
    /**
     * Include select-column of uTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_UTime() {
        return registerIncludedSelectColumn("UTime", getRealColumnName("U_TIME"));
    }

    /**
     * Include select-column of uTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_UTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_TIME"));
    }
  
    /**
     * Include select-column of rStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_RStaff() {
        return registerIncludedSelectColumn("RStaff", getRealColumnName("R_STAFF"));
    }

    /**
     * Include select-column of rStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_RStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_STAFF"));
    }
  
    /**
     * Include select-column of uStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_UStaff() {
        return registerIncludedSelectColumn("UStaff", getRealColumnName("U_STAFF"));
    }

    /**
     * Include select-column of uStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCQ includeAsMine_UStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_STAFF"));
    }
  
    /**
     * Register included-select-column.
     * 
     * @param aliasName Alias name. This should not contain comma. (NotNull)
     * @param realColumnName Real column name. This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    protected LdBookCQ registerIncludedSelectColumn(String aliasName, String realColumnName) {
        assertAliasName(aliasName);
        assertColumnName(realColumnName);
        getSqlClause().registerIncludedSelectColumn(aliasName, realColumnName);
        return this;
    }

    // =====================================================================================
    //                                                                                 Query
    //                                                                                 =====
      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   MyTable = [BOOK]
    // * * * * * * * * */

      
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
    public LdBookCQ setBookId_Equal(java.math.BigDecimal value) {
        return registerBookId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of bookId as equal. { = }
     * 
     * @param value The value of bookId as equal.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookId_Equal(long value) {
        return registerBookId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of bookId as notEqual. { != }
     * 
     * @param value The value of bookId as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookId_NotEqual(java.math.BigDecimal value) {
        return registerBookId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of bookId as notEqual. { != }
     * 
     * @param value The value of bookId as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookId_NotEqual(long value) {
        return registerBookId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of bookId as greaterThan. { &gt; }
     * 
     * @param value The value of bookId as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookId_GreaterThan(java.math.BigDecimal value) {
        return registerBookId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of bookId as greaterThan. { &gt; }
     * 
     * @param value The value of bookId as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookId_GreaterThan(long value) {
        return registerBookId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of bookId as lessThan. { &lt; }
     * 
     * @param value The value of bookId as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookId_LessThan(java.math.BigDecimal value) {
        return registerBookId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of bookId as lessThan. { &lt; }
     * 
     * @param value The value of bookId as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookId_LessThan(long value) {
        return registerBookId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of bookId as greaterEqual. { &gt;= }
     * 
     * @param value The value of bookId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookId_GreaterEqual(java.math.BigDecimal value) {
        return registerBookId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of bookId as greaterEqual. { &gt;= }
     * 
     * @param value The value of bookId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookId_GreaterEqual(long value) {
        return registerBookId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of bookId as lessEqual. { &lt;= }
     * 
     * @param value The value of bookId as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookId_LessEqual(java.math.BigDecimal value) {
        return registerBookId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of bookId as lessEqual. { &lt;= }
     * 
     * @param value The value of bookId as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookId_LessEqual(long value) {
        return registerBookId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of bookId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of bookId as inScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerBookId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of bookId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of bookId as notInScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerBookId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
              
    /** The sub-query of BookId_InScopeSubQuery_CollectionList as inScopeSubQuery. */
    protected LdCollectionCQ _bookId_InScopeSubQuery_CollectionList;

    /**
     * Get the sub-query of BookId_InScopeSubQuery_CollectionList as inScopeSubQuery.
     * 
     * @return The sub-query of BookId_InScopeSubQuery_CollectionList as inScopeSubQuery. (Nullable)
     */
    public LdCollectionCQ getBookId_InScopeSubQuery_CollectionList() {
        return _bookId_InScopeSubQuery_CollectionList;
    }

    /**
     * Set the sub-query of BookId_InScopeSubQuery_CollectionList as inScopeSubQuery.
     * { in (select xxx.BOOK_ID from COLLECTION where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of BookId_InScopeSubQuery_CollectionList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdBookCQ setBookId_InScopeSubQuery_CollectionList(LdCollectionCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _bookId_InScopeSubQuery_CollectionList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_BOOK_ID), "BOOK_ID", "bookId_InScopeSubQuery_CollectionList");
        return this;
    }
                                      
    /**
     * Register condition of bookId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of bookId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBookCQ registerBookId(LdConditionKey key, Object value) {
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
    public LdBookCQ addOrderBy_BookId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BOOK_ID), null, true);return this;
    }

    /**
     * Add order-by of bookId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_BookId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BOOK_ID), null, false);return this;
    }
          
    /** Column db name of isbnNo. */
    protected static final String COL_ISBN_NO = "ISBN_NO";

    /** Column java name of isbnNo. */
    protected static final String J_IsbnNo = "IsbnNo";

    /** Column uncapitalised java name of isbnNo. */
    protected static final String UJ_isbnNo = "isbnNo";

    /** The attribute of isbnNo. */
    protected LdConditionValue _isbnNo;

    /**
     * Get the value of isbnNo.
     * 
     * @return The value of isbnNo.
     */
    public LdConditionValue getIsbnNo() {
        if (_isbnNo == null) {
            _isbnNo = new LdConditionValue();
        }
        return _isbnNo;
    }
        
    /**
     * Set the value of isbnNo as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of isbnNo as equal.
     * @return this. (NotNull)
     */
    public LdBookCQ setIsbnNo_Equal(String value) {
        return registerIsbnNo(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of isbnNo as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ setIsbnNo_Equal_EmptyString() {
        return registerIsbnNo(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of isbnNo as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of isbnNo as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setIsbnNo_NotEqual(String value) {
        return registerIsbnNo(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of isbnNo as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of isbnNo as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setIsbnNo_GreaterThan(String value) {
        return registerIsbnNo(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of isbnNo as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of isbnNo as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setIsbnNo_LessThan(String value) {
        return registerIsbnNo(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of isbnNo as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of isbnNo as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setIsbnNo_GreaterEqual(String value) {
        return registerIsbnNo(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of isbnNo as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of isbnNo as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setIsbnNo_LessEqual(String value) {
        return registerIsbnNo(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of isbnNo as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of isbnNo as prefixSearch.
     * @return this. (NotNull)
     */
    public LdBookCQ setIsbnNo_PrefixSearch(String value) {
        return registerIsbnNo(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of isbnNo as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of isbnNo as inScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setIsbnNo_InScope(java.util.List<String> valueList) {
        return registerIsbnNo(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of isbnNo as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of isbnNo as notInScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setIsbnNo_NotInScope(java.util.List<String> valueList) {
        return registerIsbnNo(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of isbnNo.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of isbnNo. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBookCQ registerIsbnNo(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getIsbnNo(), value)) {
            key.setupConditionValue(getIsbnNo(), value, getLocation(UJ_isbnNo, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_ISBN_NO), key, getIsbnNo());
        }
        return this;
    }
    
    /**
     * Add order-by of isbnNo as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_IsbnNo_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_ISBN_NO), null, true);return this;
    }

    /**
     * Add order-by of isbnNo as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_IsbnNo_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_ISBN_NO), null, false);return this;
    }
          
    /** Column db name of bookName. */
    protected static final String COL_BOOK_NAME = "BOOK_NAME";

    /** Column java name of bookName. */
    protected static final String J_BookName = "BookName";

    /** Column uncapitalised java name of bookName. */
    protected static final String UJ_bookName = "bookName";

    /** The attribute of bookName. */
    protected LdConditionValue _bookName;

    /**
     * Get the value of bookName.
     * 
     * @return The value of bookName.
     */
    public LdConditionValue getBookName() {
        if (_bookName == null) {
            _bookName = new LdConditionValue();
        }
        return _bookName;
    }
        
    /**
     * Set the value of bookName as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of bookName as equal.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookName_Equal(String value) {
        return registerBookName(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of bookName as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ setBookName_Equal_EmptyString() {
        return registerBookName(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of bookName as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of bookName as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookName_NotEqual(String value) {
        return registerBookName(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of bookName as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of bookName as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookName_GreaterThan(String value) {
        return registerBookName(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of bookName as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of bookName as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookName_LessThan(String value) {
        return registerBookName(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of bookName as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of bookName as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookName_GreaterEqual(String value) {
        return registerBookName(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of bookName as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of bookName as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookName_LessEqual(String value) {
        return registerBookName(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of bookName as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of bookName as prefixSearch.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookName_PrefixSearch(String value) {
        return registerBookName(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of bookName as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of bookName as inScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookName_InScope(java.util.List<String> valueList) {
        return registerBookName(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of bookName as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of bookName as notInScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setBookName_NotInScope(java.util.List<String> valueList) {
        return registerBookName(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of bookName.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of bookName. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBookCQ registerBookName(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getBookName(), value)) {
            key.setupConditionValue(getBookName(), value, getLocation(UJ_bookName, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_BOOK_NAME), key, getBookName());
        }
        return this;
    }
    
    /**
     * Add order-by of bookName as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_BookName_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BOOK_NAME), null, true);return this;
    }

    /**
     * Add order-by of bookName as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_BookName_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BOOK_NAME), null, false);return this;
    }
          
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
    public LdBookCQ setAuthorId_Equal(java.math.BigDecimal value) {
        return registerAuthorId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of authorId as equal. { = }
     * 
     * @param value The value of authorId as equal.
     * @return this. (NotNull)
     */
    public LdBookCQ setAuthorId_Equal(long value) {
        return registerAuthorId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of authorId as notEqual. { != }
     * 
     * @param value The value of authorId as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setAuthorId_NotEqual(java.math.BigDecimal value) {
        return registerAuthorId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of authorId as notEqual. { != }
     * 
     * @param value The value of authorId as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setAuthorId_NotEqual(long value) {
        return registerAuthorId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of authorId as greaterThan. { &gt; }
     * 
     * @param value The value of authorId as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setAuthorId_GreaterThan(java.math.BigDecimal value) {
        return registerAuthorId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of authorId as greaterThan. { &gt; }
     * 
     * @param value The value of authorId as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setAuthorId_GreaterThan(long value) {
        return registerAuthorId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of authorId as lessThan. { &lt; }
     * 
     * @param value The value of authorId as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setAuthorId_LessThan(java.math.BigDecimal value) {
        return registerAuthorId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of authorId as lessThan. { &lt; }
     * 
     * @param value The value of authorId as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setAuthorId_LessThan(long value) {
        return registerAuthorId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of authorId as greaterEqual. { &gt;= }
     * 
     * @param value The value of authorId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setAuthorId_GreaterEqual(java.math.BigDecimal value) {
        return registerAuthorId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of authorId as greaterEqual. { &gt;= }
     * 
     * @param value The value of authorId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setAuthorId_GreaterEqual(long value) {
        return registerAuthorId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of authorId as lessEqual. { &lt;= }
     * 
     * @param value The value of authorId as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setAuthorId_LessEqual(java.math.BigDecimal value) {
        return registerAuthorId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of authorId as lessEqual. { &lt;= }
     * 
     * @param value The value of authorId as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setAuthorId_LessEqual(long value) {
        return registerAuthorId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of authorId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of authorId as inScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setAuthorId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerAuthorId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of authorId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of authorId as notInScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setAuthorId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerAuthorId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                              
    /**
     * Register condition of authorId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of authorId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBookCQ registerAuthorId(LdConditionKey key, Object value) {
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
    public LdBookCQ addOrderBy_AuthorId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_AUTHOR_ID), null, true);return this;
    }

    /**
     * Add order-by of authorId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_AuthorId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_AUTHOR_ID), null, false);return this;
    }
          
    /** Column db name of publisherId. */
    protected static final String COL_PUBLISHER_ID = "PUBLISHER_ID";

    /** Column java name of publisherId. */
    protected static final String J_PublisherId = "PublisherId";

    /** Column uncapitalised java name of publisherId. */
    protected static final String UJ_publisherId = "publisherId";

    /** The attribute of publisherId. */
    protected LdConditionValue _publisherId;

    /**
     * Get the value of publisherId.
     * 
     * @return The value of publisherId.
     */
    public LdConditionValue getPublisherId() {
        if (_publisherId == null) {
            _publisherId = new LdConditionValue();
        }
        return _publisherId;
    }
            
    /**
     * Set the value of publisherId as equal. { = }
     * 
     * @param value The value of publisherId as equal.
     * @return this. (NotNull)
     */
    public LdBookCQ setPublisherId_Equal(java.math.BigDecimal value) {
        return registerPublisherId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of publisherId as equal. { = }
     * 
     * @param value The value of publisherId as equal.
     * @return this. (NotNull)
     */
    public LdBookCQ setPublisherId_Equal(long value) {
        return registerPublisherId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of publisherId as notEqual. { != }
     * 
     * @param value The value of publisherId as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setPublisherId_NotEqual(java.math.BigDecimal value) {
        return registerPublisherId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of publisherId as notEqual. { != }
     * 
     * @param value The value of publisherId as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setPublisherId_NotEqual(long value) {
        return registerPublisherId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of publisherId as greaterThan. { &gt; }
     * 
     * @param value The value of publisherId as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setPublisherId_GreaterThan(java.math.BigDecimal value) {
        return registerPublisherId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of publisherId as greaterThan. { &gt; }
     * 
     * @param value The value of publisherId as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setPublisherId_GreaterThan(long value) {
        return registerPublisherId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of publisherId as lessThan. { &lt; }
     * 
     * @param value The value of publisherId as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setPublisherId_LessThan(java.math.BigDecimal value) {
        return registerPublisherId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of publisherId as lessThan. { &lt; }
     * 
     * @param value The value of publisherId as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setPublisherId_LessThan(long value) {
        return registerPublisherId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of publisherId as greaterEqual. { &gt;= }
     * 
     * @param value The value of publisherId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setPublisherId_GreaterEqual(java.math.BigDecimal value) {
        return registerPublisherId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of publisherId as greaterEqual. { &gt;= }
     * 
     * @param value The value of publisherId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setPublisherId_GreaterEqual(long value) {
        return registerPublisherId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of publisherId as lessEqual. { &lt;= }
     * 
     * @param value The value of publisherId as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setPublisherId_LessEqual(java.math.BigDecimal value) {
        return registerPublisherId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of publisherId as lessEqual. { &lt;= }
     * 
     * @param value The value of publisherId as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setPublisherId_LessEqual(long value) {
        return registerPublisherId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of publisherId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of publisherId as inScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setPublisherId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerPublisherId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of publisherId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of publisherId as notInScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setPublisherId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerPublisherId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                              
    /**
     * Register condition of publisherId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of publisherId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBookCQ registerPublisherId(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getPublisherId(), value)) {
            key.setupConditionValue(getPublisherId(), value, getLocation(UJ_publisherId, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_PUBLISHER_ID), key, getPublisherId());
        }
        return this;
    }
    
    /**
     * Add order-by of publisherId as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_PublisherId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_PUBLISHER_ID), null, true);return this;
    }

    /**
     * Add order-by of publisherId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_PublisherId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_PUBLISHER_ID), null, false);return this;
    }
          
    /** Column db name of maxLendingDateCount. */
    protected static final String COL_MAX_LENDING_DATE_COUNT = "MAX_LENDING_DATE_COUNT";

    /** Column java name of maxLendingDateCount. */
    protected static final String J_MaxLendingDateCount = "MaxLendingDateCount";

    /** Column uncapitalised java name of maxLendingDateCount. */
    protected static final String UJ_maxLendingDateCount = "maxLendingDateCount";

    /** The attribute of maxLendingDateCount. */
    protected LdConditionValue _maxLendingDateCount;

    /**
     * Get the value of maxLendingDateCount.
     * 
     * @return The value of maxLendingDateCount.
     */
    public LdConditionValue getMaxLendingDateCount() {
        if (_maxLendingDateCount == null) {
            _maxLendingDateCount = new LdConditionValue();
        }
        return _maxLendingDateCount;
    }
            
    /**
     * Set the value of maxLendingDateCount as equal. { = }
     * 
     * @param value The value of maxLendingDateCount as equal.
     * @return this. (NotNull)
     */
    public LdBookCQ setMaxLendingDateCount_Equal(java.math.BigDecimal value) {
        return registerMaxLendingDateCount(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of maxLendingDateCount as equal. { = }
     * 
     * @param value The value of maxLendingDateCount as equal.
     * @return this. (NotNull)
     */
    public LdBookCQ setMaxLendingDateCount_Equal(long value) {
        return registerMaxLendingDateCount(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of maxLendingDateCount as notEqual. { != }
     * 
     * @param value The value of maxLendingDateCount as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setMaxLendingDateCount_NotEqual(java.math.BigDecimal value) {
        return registerMaxLendingDateCount(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of maxLendingDateCount as notEqual. { != }
     * 
     * @param value The value of maxLendingDateCount as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setMaxLendingDateCount_NotEqual(long value) {
        return registerMaxLendingDateCount(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of maxLendingDateCount as greaterThan. { &gt; }
     * 
     * @param value The value of maxLendingDateCount as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setMaxLendingDateCount_GreaterThan(java.math.BigDecimal value) {
        return registerMaxLendingDateCount(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of maxLendingDateCount as greaterThan. { &gt; }
     * 
     * @param value The value of maxLendingDateCount as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setMaxLendingDateCount_GreaterThan(long value) {
        return registerMaxLendingDateCount(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of maxLendingDateCount as lessThan. { &lt; }
     * 
     * @param value The value of maxLendingDateCount as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setMaxLendingDateCount_LessThan(java.math.BigDecimal value) {
        return registerMaxLendingDateCount(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of maxLendingDateCount as lessThan. { &lt; }
     * 
     * @param value The value of maxLendingDateCount as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setMaxLendingDateCount_LessThan(long value) {
        return registerMaxLendingDateCount(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of maxLendingDateCount as greaterEqual. { &gt;= }
     * 
     * @param value The value of maxLendingDateCount as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setMaxLendingDateCount_GreaterEqual(java.math.BigDecimal value) {
        return registerMaxLendingDateCount(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of maxLendingDateCount as greaterEqual. { &gt;= }
     * 
     * @param value The value of maxLendingDateCount as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setMaxLendingDateCount_GreaterEqual(long value) {
        return registerMaxLendingDateCount(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of maxLendingDateCount as lessEqual. { &lt;= }
     * 
     * @param value The value of maxLendingDateCount as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setMaxLendingDateCount_LessEqual(java.math.BigDecimal value) {
        return registerMaxLendingDateCount(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of maxLendingDateCount as lessEqual. { &lt;= }
     * 
     * @param value The value of maxLendingDateCount as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setMaxLendingDateCount_LessEqual(long value) {
        return registerMaxLendingDateCount(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of maxLendingDateCount as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of maxLendingDateCount as inScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setMaxLendingDateCount_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerMaxLendingDateCount(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of maxLendingDateCount as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of maxLendingDateCount as notInScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setMaxLendingDateCount_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerMaxLendingDateCount(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                              
    /**
     * Register condition of maxLendingDateCount.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of maxLendingDateCount. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBookCQ registerMaxLendingDateCount(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getMaxLendingDateCount(), value)) {
            key.setupConditionValue(getMaxLendingDateCount(), value, getLocation(UJ_maxLendingDateCount, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_MAX_LENDING_DATE_COUNT), key, getMaxLendingDateCount());
        }
        return this;
    }
    
    /**
     * Add order-by of maxLendingDateCount as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_MaxLendingDateCount_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_MAX_LENDING_DATE_COUNT), null, true);return this;
    }

    /**
     * Add order-by of maxLendingDateCount as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_MaxLendingDateCount_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_MAX_LENDING_DATE_COUNT), null, false);return this;
    }
          
    /** Column db name of genreCode. */
    protected static final String COL_GENRE_CODE = "GENRE_CODE";

    /** Column java name of genreCode. */
    protected static final String J_GenreCode = "GenreCode";

    /** Column uncapitalised java name of genreCode. */
    protected static final String UJ_genreCode = "genreCode";

    /** The attribute of genreCode. */
    protected LdConditionValue _genreCode;

    /**
     * Get the value of genreCode.
     * 
     * @return The value of genreCode.
     */
    public LdConditionValue getGenreCode() {
        if (_genreCode == null) {
            _genreCode = new LdConditionValue();
        }
        return _genreCode;
    }
        
    /**
     * Set the value of genreCode as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreCode as equal.
     * @return this. (NotNull)
     */
    public LdBookCQ setGenreCode_Equal(String value) {
        return registerGenreCode(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of genreCode as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ setGenreCode_Equal_EmptyString() {
        return registerGenreCode(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of genreCode as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreCode as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setGenreCode_NotEqual(String value) {
        return registerGenreCode(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreCode as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreCode as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setGenreCode_GreaterThan(String value) {
        return registerGenreCode(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreCode as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreCode as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setGenreCode_LessThan(String value) {
        return registerGenreCode(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreCode as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreCode as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setGenreCode_GreaterEqual(String value) {
        return registerGenreCode(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreCode as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreCode as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setGenreCode_LessEqual(String value) {
        return registerGenreCode(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreCode as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreCode as prefixSearch.
     * @return this. (NotNull)
     */
    public LdBookCQ setGenreCode_PrefixSearch(String value) {
        return registerGenreCode(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreCode as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of genreCode as inScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setGenreCode_InScope(java.util.List<String> valueList) {
        return registerGenreCode(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of genreCode as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of genreCode as notInScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setGenreCode_NotInScope(java.util.List<String> valueList) {
        return registerGenreCode(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                              
    /**
     * Set the value of genreCode as isNull. { is null }
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ setGenreCode_IsNull() {
        return registerGenreCode(LdConditionKey.CK_IS_NULL, DUMMY_OBJECT);
    }

    /**
     * Set the value of genreCode as isNotNull. { is not null }
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ setGenreCode_IsNotNull() {
        return registerGenreCode(LdConditionKey.CK_IS_NOT_NULL, DUMMY_OBJECT);
    }
        
    /**
     * Register condition of genreCode.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of genreCode. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBookCQ registerGenreCode(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getGenreCode(), value)) {
            key.setupConditionValue(getGenreCode(), value, getLocation(UJ_genreCode, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_GENRE_CODE), key, getGenreCode());
        }
        return this;
    }
    
    /**
     * Add order-by of genreCode as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_GenreCode_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_GENRE_CODE), null, true);return this;
    }

    /**
     * Add order-by of genreCode as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_GenreCode_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_GENRE_CODE), null, false);return this;
    }
          
    /** Column db name of openingPart. */
    protected static final String COL_OPENING_PART = "OPENING_PART";

    /** Column java name of openingPart. */
    protected static final String J_OpeningPart = "OpeningPart";

    /** Column uncapitalised java name of openingPart. */
    protected static final String UJ_openingPart = "openingPart";

    /** The attribute of openingPart. */
    protected LdConditionValue _openingPart;

    /**
     * Get the value of openingPart.
     * 
     * @return The value of openingPart.
     */
    public LdConditionValue getOpeningPart() {
        if (_openingPart == null) {
            _openingPart = new LdConditionValue();
        }
        return _openingPart;
    }
        
    /**
     * Set the value of openingPart as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of openingPart as equal.
     * @return this. (NotNull)
     */
    public LdBookCQ setOpeningPart_Equal(String value) {
        return registerOpeningPart(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of openingPart as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ setOpeningPart_Equal_EmptyString() {
        return registerOpeningPart(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of openingPart as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of openingPart as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setOpeningPart_NotEqual(String value) {
        return registerOpeningPart(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of openingPart as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of openingPart as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setOpeningPart_GreaterThan(String value) {
        return registerOpeningPart(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of openingPart as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of openingPart as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setOpeningPart_LessThan(String value) {
        return registerOpeningPart(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of openingPart as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of openingPart as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setOpeningPart_GreaterEqual(String value) {
        return registerOpeningPart(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of openingPart as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of openingPart as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setOpeningPart_LessEqual(String value) {
        return registerOpeningPart(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of openingPart as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of openingPart as prefixSearch.
     * @return this. (NotNull)
     */
    public LdBookCQ setOpeningPart_PrefixSearch(String value) {
        return registerOpeningPart(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of openingPart as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of openingPart as inScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setOpeningPart_InScope(java.util.List<String> valueList) {
        return registerOpeningPart(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of openingPart as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of openingPart as notInScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setOpeningPart_NotInScope(java.util.List<String> valueList) {
        return registerOpeningPart(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                              
    /**
     * Set the value of openingPart as isNull. { is null }
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ setOpeningPart_IsNull() {
        return registerOpeningPart(LdConditionKey.CK_IS_NULL, DUMMY_OBJECT);
    }

    /**
     * Set the value of openingPart as isNotNull. { is not null }
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ setOpeningPart_IsNotNull() {
        return registerOpeningPart(LdConditionKey.CK_IS_NOT_NULL, DUMMY_OBJECT);
    }
        
    /**
     * Register condition of openingPart.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of openingPart. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBookCQ registerOpeningPart(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getOpeningPart(), value)) {
            key.setupConditionValue(getOpeningPart(), value, getLocation(UJ_openingPart, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_OPENING_PART), key, getOpeningPart());
        }
        return this;
    }
    
    /**
     * Add order-by of openingPart as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_OpeningPart_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_OPENING_PART), null, true);return this;
    }

    /**
     * Add order-by of openingPart as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_OpeningPart_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_OPENING_PART), null, false);return this;
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
    public LdBookCQ setRTime_Equal(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of rTime as notEqual. { != }
     * 
     * @param value The value of rTime as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setRTime_NotEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of rTime as greaterThan. { &gt; }
     * 
     * @param value The value of rTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setRTime_GreaterThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of rTime as lessThan. { &lt; }
     * 
     * @param value The value of rTime as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setRTime_LessThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of rTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of rTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setRTime_GreaterEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of rTime as lessEqual. { &lt;= }
     * 
     * @param value The value of rTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setRTime_LessEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of rTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as inScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setRTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of rTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as notInScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setRTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of rTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBookCQ registerRTime(LdConditionKey key, Object value) {
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
    public LdBookCQ addOrderBy_RTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_TIME), null, true);return this;
    }

    /**
     * Add order-by of rTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_RTime_Desc() {
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
    public LdBookCQ setUTime_Equal(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of uTime as notEqual. { != }
     * 
     * @param value The value of uTime as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setUTime_NotEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of uTime as greaterThan. { &gt; }
     * 
     * @param value The value of uTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setUTime_GreaterThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of uTime as lessThan. { &lt; }
     * 
     * @param value The value of uTime as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setUTime_LessThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of uTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of uTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setUTime_GreaterEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of uTime as lessEqual. { &lt;= }
     * 
     * @param value The value of uTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setUTime_LessEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of uTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as inScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setUTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of uTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as notInScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setUTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of uTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBookCQ registerUTime(LdConditionKey key, Object value) {
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
    public LdBookCQ addOrderBy_UTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_TIME), null, true);return this;
    }

    /**
     * Add order-by of uTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_UTime_Desc() {
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
    public LdBookCQ setRStaff_Equal(String value) {
        return registerRStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of rStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ setRStaff_Equal_EmptyString() {
        return registerRStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of rStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setRStaff_NotEqual(String value) {
        return registerRStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setRStaff_GreaterThan(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setRStaff_LessThan(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setRStaff_GreaterEqual(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setRStaff_LessEqual(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdBookCQ setRStaff_PrefixSearch(String value) {
        return registerRStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as inScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setRStaff_InScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of rStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setRStaff_NotInScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of rStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBookCQ registerRStaff(LdConditionKey key, Object value) {
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
    public LdBookCQ addOrderBy_RStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_STAFF), null, true);return this;
    }

    /**
     * Add order-by of rStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_RStaff_Desc() {
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
    public LdBookCQ setUStaff_Equal(String value) {
        return registerUStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of uStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ setUStaff_Equal_EmptyString() {
        return registerUStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of uStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setUStaff_NotEqual(String value) {
        return registerUStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setUStaff_GreaterThan(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdBookCQ setUStaff_LessThan(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setUStaff_GreaterEqual(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdBookCQ setUStaff_LessEqual(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdBookCQ setUStaff_PrefixSearch(String value) {
        return registerUStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as inScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setUStaff_InScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of uStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdBookCQ setUStaff_NotInScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of uStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBookCQ registerUStaff(LdConditionKey key, Object value) {
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
    public LdBookCQ addOrderBy_UStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, true);return this;
    }

    /**
     * Add order-by of uStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBookCQ addOrderBy_UStaff_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, false);return this;
    }
      
    // =====================================================================================
    //                                                               Query-SetupOuter-Method
    //                                                               =======================

      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [AUTHOR]
    //   ForeignProperty = [author]
    // * * * * * * * * */

    /**
     * Query for author.
     * 
     * @return Instance of LdAuthorCQ as author. (NotNull)
     */
    public LdAuthorCQ queryAuthor() {
        return getConditionQueryAuthor();
    }

    /**
     * Setup outer join for ${foreignPropertyName}.
     */
    public void setupOuterJoin_Author() {
        final java.util.Map<String, String> joinOnMap = new java.util.LinkedHashMap<String, String>();
        String key = null;
        String value = null;
    
        key = getRealColumnName("AUTHOR_ID");
        value = getConditionQueryAuthor().getRealColumnName("AUTHOR_ID");
        joinOnMap.put(key, value);
    
        final String joinTableName = "AUTHOR";
        final String aliasName = getConditionQueryAuthor().getRealAliasName();
        getSqlClause().registerOuterJoin(joinTableName, aliasName, joinOnMap);
    }

    /** Condition-query for author. */
    protected LdAuthorCQ _conditionQueryAuthor;

    /**
     * Get condition-query for author.
     * 
     * @return Instance of LdAuthorCQ as author. (NotNull)
     */
    public LdAuthorCQ getConditionQueryAuthor() {
        if (_conditionQueryAuthor == null) {
            _conditionQueryAuthor = newQueryAuthor();
            setupOuterJoin_Author();
        }
        return _conditionQueryAuthor;
    }

    /**
     * New query for author.
     * 
     * @return Query for author. (NotNull)
     */
    protected LdAuthorCQ newQueryAuthor() {
        return new LdAuthorCQ(this, getSqlClause(), "Author", getNextNestLevel());
    }
      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [PUBLISHER]
    //   ForeignProperty = [publisher]
    // * * * * * * * * */

    /**
     * Query for publisher.
     * 
     * @return Instance of LdPublisherCQ as publisher. (NotNull)
     */
    public LdPublisherCQ queryPublisher() {
        return getConditionQueryPublisher();
    }

    /**
     * Setup outer join for ${foreignPropertyName}.
     */
    public void setupOuterJoin_Publisher() {
        final java.util.Map<String, String> joinOnMap = new java.util.LinkedHashMap<String, String>();
        String key = null;
        String value = null;
    
        key = getRealColumnName("PUBLISHER_ID");
        value = getConditionQueryPublisher().getRealColumnName("PUBLISHER_ID");
        joinOnMap.put(key, value);
    
        final String joinTableName = "PUBLISHER";
        final String aliasName = getConditionQueryPublisher().getRealAliasName();
        getSqlClause().registerOuterJoin(joinTableName, aliasName, joinOnMap);
    }

    /** Condition-query for publisher. */
    protected LdPublisherCQ _conditionQueryPublisher;

    /**
     * Get condition-query for publisher.
     * 
     * @return Instance of LdPublisherCQ as publisher. (NotNull)
     */
    public LdPublisherCQ getConditionQueryPublisher() {
        if (_conditionQueryPublisher == null) {
            _conditionQueryPublisher = newQueryPublisher();
            setupOuterJoin_Publisher();
        }
        return _conditionQueryPublisher;
    }

    /**
     * New query for publisher.
     * 
     * @return Query for publisher. (NotNull)
     */
    protected LdPublisherCQ newQueryPublisher() {
        return new LdPublisherCQ(this, getSqlClause(), "Publisher", getNextNestLevel());
    }
      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [GENRE]
    //   ForeignProperty = [genre]
    // * * * * * * * * */

    /**
     * Query for genre.
     * 
     * @return Instance of LdGenreCQ as genre. (NotNull)
     */
    public LdGenreCQ queryGenre() {
        return getConditionQueryGenre();
    }

    /**
     * Setup outer join for ${foreignPropertyName}.
     */
    public void setupOuterJoin_Genre() {
        final java.util.Map<String, String> joinOnMap = new java.util.LinkedHashMap<String, String>();
        String key = null;
        String value = null;
    
        key = getRealColumnName("GENRE_CODE");
        value = getConditionQueryGenre().getRealColumnName("GENRE_CODE");
        joinOnMap.put(key, value);
    
        final String joinTableName = "GENRE";
        final String aliasName = getConditionQueryGenre().getRealAliasName();
        getSqlClause().registerOuterJoin(joinTableName, aliasName, joinOnMap);
    }

    /** Condition-query for genre. */
    protected LdGenreCQ _conditionQueryGenre;

    /**
     * Get condition-query for genre.
     * 
     * @return Instance of LdGenreCQ as genre. (NotNull)
     */
    public LdGenreCQ getConditionQueryGenre() {
        if (_conditionQueryGenre == null) {
            _conditionQueryGenre = newQueryGenre();
            setupOuterJoin_Genre();
        }
        return _conditionQueryGenre;
    }

    /**
     * New query for genre.
     * 
     * @return Query for genre. (NotNull)
     */
    protected LdGenreCQ newQueryGenre() {
        return new LdGenreCQ(this, getSqlClause(), "Genre", getNextNestLevel());
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

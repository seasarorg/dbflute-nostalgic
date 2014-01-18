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
public class LdGenreCQ extends LdAbstractConditionQuery {

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
    LdGenreCQ(LdAbstractConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "GENRE";
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
     * Include select-column of genreCode as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ includeAsMine_GenreCode() {
        return registerIncludedSelectColumn("GenreCode", getRealColumnName("GENRE_CODE"));
    }

    /**
     * Include select-column of genreCode as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdGenreCQ includeAsMine_GenreCode(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("GENRE_CODE"));
    }
  
    /**
     * Include select-column of genreName as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ includeAsMine_GenreName() {
        return registerIncludedSelectColumn("GenreName", getRealColumnName("GENRE_NAME"));
    }

    /**
     * Include select-column of genreName as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdGenreCQ includeAsMine_GenreName(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("GENRE_NAME"));
    }
  
    /**
     * Include select-column of parentGenreCode as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ includeAsMine_ParentGenreCode() {
        return registerIncludedSelectColumn("ParentGenreCode", getRealColumnName("PARENT_GENRE_CODE"));
    }

    /**
     * Include select-column of parentGenreCode as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdGenreCQ includeAsMine_ParentGenreCode(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("PARENT_GENRE_CODE"));
    }
  
    /**
     * Include select-column of rTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ includeAsMine_RTime() {
        return registerIncludedSelectColumn("RTime", getRealColumnName("R_TIME"));
    }

    /**
     * Include select-column of rTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdGenreCQ includeAsMine_RTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_TIME"));
    }
  
    /**
     * Include select-column of uTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ includeAsMine_UTime() {
        return registerIncludedSelectColumn("UTime", getRealColumnName("U_TIME"));
    }

    /**
     * Include select-column of uTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdGenreCQ includeAsMine_UTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_TIME"));
    }
  
    /**
     * Include select-column of rStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ includeAsMine_RStaff() {
        return registerIncludedSelectColumn("RStaff", getRealColumnName("R_STAFF"));
    }

    /**
     * Include select-column of rStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdGenreCQ includeAsMine_RStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_STAFF"));
    }
  
    /**
     * Include select-column of uStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ includeAsMine_UStaff() {
        return registerIncludedSelectColumn("UStaff", getRealColumnName("U_STAFF"));
    }

    /**
     * Include select-column of uStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdGenreCQ includeAsMine_UStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_STAFF"));
    }
  
    /**
     * Register included-select-column.
     * 
     * @param aliasName Alias name. This should not contain comma. (NotNull)
     * @param realColumnName Real column name. This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    protected LdGenreCQ registerIncludedSelectColumn(String aliasName, String realColumnName) {
        assertAliasName(aliasName);
        assertColumnName(realColumnName);
        getSqlClause().registerIncludedSelectColumn(aliasName, realColumnName);
        return this;
    }

    // =====================================================================================
    //                                                                                 Query
    //                                                                                 =====
      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   MyTable = [GENRE]
    // * * * * * * * * */

      
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
    public LdGenreCQ setGenreCode_Equal(String value) {
        return registerGenreCode(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of genreCode as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreCode_Equal_EmptyString() {
        return registerGenreCode(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of genreCode as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreCode as notEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreCode_NotEqual(String value) {
        return registerGenreCode(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreCode as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreCode as greaterThan.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreCode_GreaterThan(String value) {
        return registerGenreCode(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreCode as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreCode as lessThan.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreCode_LessThan(String value) {
        return registerGenreCode(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreCode as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreCode as greaterEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreCode_GreaterEqual(String value) {
        return registerGenreCode(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreCode as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreCode as lessEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreCode_LessEqual(String value) {
        return registerGenreCode(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreCode as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreCode as prefixSearch.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreCode_PrefixSearch(String value) {
        return registerGenreCode(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreCode as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of genreCode as inScope.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreCode_InScope(java.util.List<String> valueList) {
        return registerGenreCode(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of genreCode as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of genreCode as notInScope.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreCode_NotInScope(java.util.List<String> valueList) {
        return registerGenreCode(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
              
    /** The sub-query of GenreCode_InScopeSubQuery_BookList as inScopeSubQuery. */
    protected LdBookCQ _genreCode_InScopeSubQuery_BookList;

    /**
     * Get the sub-query of GenreCode_InScopeSubQuery_BookList as inScopeSubQuery.
     * 
     * @return The sub-query of GenreCode_InScopeSubQuery_BookList as inScopeSubQuery. (Nullable)
     */
    public LdBookCQ getGenreCode_InScopeSubQuery_BookList() {
        return _genreCode_InScopeSubQuery_BookList;
    }

    /**
     * Set the sub-query of GenreCode_InScopeSubQuery_BookList as inScopeSubQuery.
     * { in (select xxx.GENRE_CODE from BOOK where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of GenreCode_InScopeSubQuery_BookList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreCode_InScopeSubQuery_BookList(LdBookCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _genreCode_InScopeSubQuery_BookList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_GENRE_CODE), "GENRE_CODE", "genreCode_InScopeSubQuery_BookList");
        return this;
    }
        
    /** The sub-query of GenreCode_InScopeSubQuery_GenreSelfList as inScopeSubQuery. */
    protected LdGenreCQ _genreCode_InScopeSubQuery_GenreSelfList;

    /**
     * Get the sub-query of GenreCode_InScopeSubQuery_GenreSelfList as inScopeSubQuery.
     * 
     * @return The sub-query of GenreCode_InScopeSubQuery_GenreSelfList as inScopeSubQuery. (Nullable)
     */
    public LdGenreCQ getGenreCode_InScopeSubQuery_GenreSelfList() {
        return _genreCode_InScopeSubQuery_GenreSelfList;
    }

    /**
     * Set the sub-query of GenreCode_InScopeSubQuery_GenreSelfList as inScopeSubQuery.
     * { in (select xxx.PARENT_GENRE_CODE from GENRE where ...) }
     * This method use from clause and where clause of the sub-query instance.
     * this query save the sub-query instance for query-value.
     * After you invoke this, If you set query in the argument[subQuery], the query is ignored.
     * 
     * @param subQuery The sub-query of GenreCode_InScopeSubQuery_GenreSelfList as inScopeSubQuery. (NotNull)
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreCode_InScopeSubQuery_GenreSelfList(LdGenreCQ subQuery) {
        assertObjectNotNull("subQuery", subQuery);
        _genreCode_InScopeSubQuery_GenreSelfList = subQuery;// for saving query-value.
        registerInScopeSubQuery(subQuery, getRealColumnName(COL_GENRE_CODE), "PARENT_GENRE_CODE", "genreCode_InScopeSubQuery_GenreSelfList");
        return this;
    }
                                          
    /**
     * Register condition of genreCode.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of genreCode. (Nullable)
     * @return this. (NotNull)
     */
    protected LdGenreCQ registerGenreCode(LdConditionKey key, Object value) {
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
    public LdGenreCQ addOrderBy_GenreCode_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_GENRE_CODE), null, true);return this;
    }

    /**
     * Add order-by of genreCode as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ addOrderBy_GenreCode_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_GENRE_CODE), null, false);return this;
    }
          
    /** Column db name of genreName. */
    protected static final String COL_GENRE_NAME = "GENRE_NAME";

    /** Column java name of genreName. */
    protected static final String J_GenreName = "GenreName";

    /** Column uncapitalised java name of genreName. */
    protected static final String UJ_genreName = "genreName";

    /** The attribute of genreName. */
    protected LdConditionValue _genreName;

    /**
     * Get the value of genreName.
     * 
     * @return The value of genreName.
     */
    public LdConditionValue getGenreName() {
        if (_genreName == null) {
            _genreName = new LdConditionValue();
        }
        return _genreName;
    }
        
    /**
     * Set the value of genreName as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreName as equal.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreName_Equal(String value) {
        return registerGenreName(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of genreName as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreName_Equal_EmptyString() {
        return registerGenreName(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of genreName as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreName as notEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreName_NotEqual(String value) {
        return registerGenreName(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreName as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreName as greaterThan.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreName_GreaterThan(String value) {
        return registerGenreName(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreName as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreName as lessThan.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreName_LessThan(String value) {
        return registerGenreName(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreName as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreName as greaterEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreName_GreaterEqual(String value) {
        return registerGenreName(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreName as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreName as lessEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreName_LessEqual(String value) {
        return registerGenreName(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreName as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of genreName as prefixSearch.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreName_PrefixSearch(String value) {
        return registerGenreName(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of genreName as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of genreName as inScope.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreName_InScope(java.util.List<String> valueList) {
        return registerGenreName(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of genreName as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of genreName as notInScope.
     * @return this. (NotNull)
     */
    public LdGenreCQ setGenreName_NotInScope(java.util.List<String> valueList) {
        return registerGenreName(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of genreName.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of genreName. (Nullable)
     * @return this. (NotNull)
     */
    protected LdGenreCQ registerGenreName(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getGenreName(), value)) {
            key.setupConditionValue(getGenreName(), value, getLocation(UJ_genreName, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_GENRE_NAME), key, getGenreName());
        }
        return this;
    }
    
    /**
     * Add order-by of genreName as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ addOrderBy_GenreName_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_GENRE_NAME), null, true);return this;
    }

    /**
     * Add order-by of genreName as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ addOrderBy_GenreName_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_GENRE_NAME), null, false);return this;
    }
          
    /** Column db name of parentGenreCode. */
    protected static final String COL_PARENT_GENRE_CODE = "PARENT_GENRE_CODE";

    /** Column java name of parentGenreCode. */
    protected static final String J_ParentGenreCode = "ParentGenreCode";

    /** Column uncapitalised java name of parentGenreCode. */
    protected static final String UJ_parentGenreCode = "parentGenreCode";

    /** The attribute of parentGenreCode. */
    protected LdConditionValue _parentGenreCode;

    /**
     * Get the value of parentGenreCode.
     * 
     * @return The value of parentGenreCode.
     */
    public LdConditionValue getParentGenreCode() {
        if (_parentGenreCode == null) {
            _parentGenreCode = new LdConditionValue();
        }
        return _parentGenreCode;
    }
        
    /**
     * Set the value of parentGenreCode as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of parentGenreCode as equal.
     * @return this. (NotNull)
     */
    public LdGenreCQ setParentGenreCode_Equal(String value) {
        return registerParentGenreCode(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of parentGenreCode as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ setParentGenreCode_Equal_EmptyString() {
        return registerParentGenreCode(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of parentGenreCode as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of parentGenreCode as notEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setParentGenreCode_NotEqual(String value) {
        return registerParentGenreCode(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of parentGenreCode as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of parentGenreCode as greaterThan.
     * @return this. (NotNull)
     */
    public LdGenreCQ setParentGenreCode_GreaterThan(String value) {
        return registerParentGenreCode(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of parentGenreCode as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of parentGenreCode as lessThan.
     * @return this. (NotNull)
     */
    public LdGenreCQ setParentGenreCode_LessThan(String value) {
        return registerParentGenreCode(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of parentGenreCode as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of parentGenreCode as greaterEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setParentGenreCode_GreaterEqual(String value) {
        return registerParentGenreCode(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of parentGenreCode as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of parentGenreCode as lessEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setParentGenreCode_LessEqual(String value) {
        return registerParentGenreCode(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of parentGenreCode as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of parentGenreCode as prefixSearch.
     * @return this. (NotNull)
     */
    public LdGenreCQ setParentGenreCode_PrefixSearch(String value) {
        return registerParentGenreCode(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of parentGenreCode as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of parentGenreCode as inScope.
     * @return this. (NotNull)
     */
    public LdGenreCQ setParentGenreCode_InScope(java.util.List<String> valueList) {
        return registerParentGenreCode(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of parentGenreCode as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of parentGenreCode as notInScope.
     * @return this. (NotNull)
     */
    public LdGenreCQ setParentGenreCode_NotInScope(java.util.List<String> valueList) {
        return registerParentGenreCode(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                              
    /**
     * Set the value of parentGenreCode as isNull. { is null }
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ setParentGenreCode_IsNull() {
        return registerParentGenreCode(LdConditionKey.CK_IS_NULL, DUMMY_OBJECT);
    }

    /**
     * Set the value of parentGenreCode as isNotNull. { is not null }
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ setParentGenreCode_IsNotNull() {
        return registerParentGenreCode(LdConditionKey.CK_IS_NOT_NULL, DUMMY_OBJECT);
    }
        
    /**
     * Register condition of parentGenreCode.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of parentGenreCode. (Nullable)
     * @return this. (NotNull)
     */
    protected LdGenreCQ registerParentGenreCode(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getParentGenreCode(), value)) {
            key.setupConditionValue(getParentGenreCode(), value, getLocation(UJ_parentGenreCode, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_PARENT_GENRE_CODE), key, getParentGenreCode());
        }
        return this;
    }
    
    /**
     * Add order-by of parentGenreCode as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ addOrderBy_ParentGenreCode_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_PARENT_GENRE_CODE), null, true);return this;
    }

    /**
     * Add order-by of parentGenreCode as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ addOrderBy_ParentGenreCode_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_PARENT_GENRE_CODE), null, false);return this;
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
    public LdGenreCQ setRTime_Equal(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of rTime as notEqual. { != }
     * 
     * @param value The value of rTime as notEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRTime_NotEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of rTime as greaterThan. { &gt; }
     * 
     * @param value The value of rTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRTime_GreaterThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of rTime as lessThan. { &lt; }
     * 
     * @param value The value of rTime as lessThan.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRTime_LessThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of rTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of rTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRTime_GreaterEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of rTime as lessEqual. { &lt;= }
     * 
     * @param value The value of rTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRTime_LessEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of rTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as inScope.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of rTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as notInScope.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of rTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdGenreCQ registerRTime(LdConditionKey key, Object value) {
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
    public LdGenreCQ addOrderBy_RTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_TIME), null, true);return this;
    }

    /**
     * Add order-by of rTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ addOrderBy_RTime_Desc() {
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
    public LdGenreCQ setUTime_Equal(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of uTime as notEqual. { != }
     * 
     * @param value The value of uTime as notEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUTime_NotEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of uTime as greaterThan. { &gt; }
     * 
     * @param value The value of uTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUTime_GreaterThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of uTime as lessThan. { &lt; }
     * 
     * @param value The value of uTime as lessThan.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUTime_LessThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of uTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of uTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUTime_GreaterEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of uTime as lessEqual. { &lt;= }
     * 
     * @param value The value of uTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUTime_LessEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of uTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as inScope.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of uTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as notInScope.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of uTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdGenreCQ registerUTime(LdConditionKey key, Object value) {
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
    public LdGenreCQ addOrderBy_UTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_TIME), null, true);return this;
    }

    /**
     * Add order-by of uTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ addOrderBy_UTime_Desc() {
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
    public LdGenreCQ setRStaff_Equal(String value) {
        return registerRStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of rStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ setRStaff_Equal_EmptyString() {
        return registerRStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of rStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRStaff_NotEqual(String value) {
        return registerRStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRStaff_GreaterThan(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRStaff_LessThan(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRStaff_GreaterEqual(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRStaff_LessEqual(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRStaff_PrefixSearch(String value) {
        return registerRStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as inScope.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRStaff_InScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of rStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdGenreCQ setRStaff_NotInScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of rStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdGenreCQ registerRStaff(LdConditionKey key, Object value) {
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
    public LdGenreCQ addOrderBy_RStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_STAFF), null, true);return this;
    }

    /**
     * Add order-by of rStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ addOrderBy_RStaff_Desc() {
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
    public LdGenreCQ setUStaff_Equal(String value) {
        return registerUStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of uStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ setUStaff_Equal_EmptyString() {
        return registerUStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of uStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUStaff_NotEqual(String value) {
        return registerUStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUStaff_GreaterThan(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUStaff_LessThan(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUStaff_GreaterEqual(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUStaff_LessEqual(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUStaff_PrefixSearch(String value) {
        return registerUStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as inScope.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUStaff_InScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of uStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdGenreCQ setUStaff_NotInScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of uStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdGenreCQ registerUStaff(LdConditionKey key, Object value) {
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
    public LdGenreCQ addOrderBy_UStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, true);return this;
    }

    /**
     * Add order-by of uStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdGenreCQ addOrderBy_UStaff_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, false);return this;
    }
      
    // =====================================================================================
    //                                                               Query-SetupOuter-Method
    //                                                               =======================

      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [GENRE]
    //   ForeignProperty = [genreSelf]
    // * * * * * * * * */

    /**
     * Query for genreSelf.
     * 
     * @return Instance of LdGenreCQ as genreSelf. (NotNull)
     */
    public LdGenreCQ queryGenreSelf() {
        return getConditionQueryGenreSelf();
    }

    /**
     * Setup outer join for ${foreignPropertyName}.
     */
    public void setupOuterJoin_GenreSelf() {
        final java.util.Map<String, String> joinOnMap = new java.util.LinkedHashMap<String, String>();
        String key = null;
        String value = null;
    
        key = getRealColumnName("PARENT_GENRE_CODE");
        value = getConditionQueryGenreSelf().getRealColumnName("GENRE_CODE");
        joinOnMap.put(key, value);
    
        final String joinTableName = "GENRE";
        final String aliasName = getConditionQueryGenreSelf().getRealAliasName();
        getSqlClause().registerOuterJoin(joinTableName, aliasName, joinOnMap);
    }

    /** Condition-query for genreSelf. */
    protected LdGenreCQ _conditionQueryGenreSelf;

    /**
     * Get condition-query for genreSelf.
     * 
     * @return Instance of LdGenreCQ as genreSelf. (NotNull)
     */
    public LdGenreCQ getConditionQueryGenreSelf() {
        if (_conditionQueryGenreSelf == null) {
            _conditionQueryGenreSelf = newQueryGenreSelf();
            setupOuterJoin_GenreSelf();
        }
        return _conditionQueryGenreSelf;
    }

    /**
     * New query for genreSelf.
     * 
     * @return Query for genreSelf. (NotNull)
     */
    protected LdGenreCQ newQueryGenreSelf() {
        return new LdGenreCQ(this, getSqlClause(), "GenreSelf", getNextNestLevel());
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

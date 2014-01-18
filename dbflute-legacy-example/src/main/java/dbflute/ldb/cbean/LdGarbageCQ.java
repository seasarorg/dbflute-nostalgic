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
public class LdGarbageCQ extends LdAbstractConditionQuery {

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
    LdGarbageCQ(LdAbstractConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "GARBAGE";
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
     * Include select-column of garbageMemo as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdGarbageCQ includeAsMine_GarbageMemo() {
        return registerIncludedSelectColumn("GarbageMemo", getRealColumnName("GARBAGE_MEMO"));
    }

    /**
     * Include select-column of garbageMemo as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdGarbageCQ includeAsMine_GarbageMemo(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("GARBAGE_MEMO"));
    }
  
    /**
     * Include select-column of garbageTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdGarbageCQ includeAsMine_GarbageTime() {
        return registerIncludedSelectColumn("GarbageTime", getRealColumnName("GARBAGE_TIME"));
    }

    /**
     * Include select-column of garbageTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdGarbageCQ includeAsMine_GarbageTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("GARBAGE_TIME"));
    }
  
    /**
     * Register included-select-column.
     * 
     * @param aliasName Alias name. This should not contain comma. (NotNull)
     * @param realColumnName Real column name. This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    protected LdGarbageCQ registerIncludedSelectColumn(String aliasName, String realColumnName) {
        assertAliasName(aliasName);
        assertColumnName(realColumnName);
        getSqlClause().registerIncludedSelectColumn(aliasName, realColumnName);
        return this;
    }

    // =====================================================================================
    //                                                                                 Query
    //                                                                                 =====
      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   MyTable = [GARBAGE]
    // * * * * * * * * */

      
    /** Column db name of garbageMemo. */
    protected static final String COL_GARBAGE_MEMO = "GARBAGE_MEMO";

    /** Column java name of garbageMemo. */
    protected static final String J_GarbageMemo = "GarbageMemo";

    /** Column uncapitalised java name of garbageMemo. */
    protected static final String UJ_garbageMemo = "garbageMemo";

    /** The attribute of garbageMemo. */
    protected LdConditionValue _garbageMemo;

    /**
     * Get the value of garbageMemo.
     * 
     * @return The value of garbageMemo.
     */
    public LdConditionValue getGarbageMemo() {
        if (_garbageMemo == null) {
            _garbageMemo = new LdConditionValue();
        }
        return _garbageMemo;
    }
        
    /**
     * Set the value of garbageMemo as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of garbageMemo as equal.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageMemo_Equal(String value) {
        return registerGarbageMemo(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of garbageMemo as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageMemo_Equal_EmptyString() {
        return registerGarbageMemo(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of garbageMemo as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of garbageMemo as notEqual.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageMemo_NotEqual(String value) {
        return registerGarbageMemo(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of garbageMemo as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of garbageMemo as greaterThan.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageMemo_GreaterThan(String value) {
        return registerGarbageMemo(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of garbageMemo as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of garbageMemo as lessThan.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageMemo_LessThan(String value) {
        return registerGarbageMemo(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of garbageMemo as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of garbageMemo as greaterEqual.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageMemo_GreaterEqual(String value) {
        return registerGarbageMemo(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of garbageMemo as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of garbageMemo as lessEqual.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageMemo_LessEqual(String value) {
        return registerGarbageMemo(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of garbageMemo as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of garbageMemo as prefixSearch.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageMemo_PrefixSearch(String value) {
        return registerGarbageMemo(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of garbageMemo as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of garbageMemo as inScope.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageMemo_InScope(java.util.List<String> valueList) {
        return registerGarbageMemo(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of garbageMemo as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of garbageMemo as notInScope.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageMemo_NotInScope(java.util.List<String> valueList) {
        return registerGarbageMemo(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                              
    /**
     * Set the value of garbageMemo as isNull. { is null }
     * 
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageMemo_IsNull() {
        return registerGarbageMemo(LdConditionKey.CK_IS_NULL, DUMMY_OBJECT);
    }

    /**
     * Set the value of garbageMemo as isNotNull. { is not null }
     * 
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageMemo_IsNotNull() {
        return registerGarbageMemo(LdConditionKey.CK_IS_NOT_NULL, DUMMY_OBJECT);
    }
        
    /**
     * Register condition of garbageMemo.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of garbageMemo. (Nullable)
     * @return this. (NotNull)
     */
    protected LdGarbageCQ registerGarbageMemo(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getGarbageMemo(), value)) {
            key.setupConditionValue(getGarbageMemo(), value, getLocation(UJ_garbageMemo, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_GARBAGE_MEMO), key, getGarbageMemo());
        }
        return this;
    }
    
    /**
     * Add order-by of garbageMemo as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdGarbageCQ addOrderBy_GarbageMemo_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_GARBAGE_MEMO), null, true);return this;
    }

    /**
     * Add order-by of garbageMemo as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdGarbageCQ addOrderBy_GarbageMemo_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_GARBAGE_MEMO), null, false);return this;
    }
          
    /** Column db name of garbageTime. */
    protected static final String COL_GARBAGE_TIME = "GARBAGE_TIME";

    /** Column java name of garbageTime. */
    protected static final String J_GarbageTime = "GarbageTime";

    /** Column uncapitalised java name of garbageTime. */
    protected static final String UJ_garbageTime = "garbageTime";

    /** The attribute of garbageTime. */
    protected LdConditionValue _garbageTime;

    /**
     * Get the value of garbageTime.
     * 
     * @return The value of garbageTime.
     */
    public LdConditionValue getGarbageTime() {
        if (_garbageTime == null) {
            _garbageTime = new LdConditionValue();
        }
        return _garbageTime;
    }
                
    /**
     * Set the value of garbageTime as equal. { = }
     * 
     * @param value The value of garbageTime as equal.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageTime_Equal(java.sql.Timestamp value) {
        return registerGarbageTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of garbageTime as notEqual. { != }
     * 
     * @param value The value of garbageTime as notEqual.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageTime_NotEqual(java.sql.Timestamp value) {
        return registerGarbageTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of garbageTime as greaterThan. { &gt; }
     * 
     * @param value The value of garbageTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageTime_GreaterThan(java.sql.Timestamp value) {
        return registerGarbageTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of garbageTime as lessThan. { &lt; }
     * 
     * @param value The value of garbageTime as lessThan.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageTime_LessThan(java.sql.Timestamp value) {
        return registerGarbageTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of garbageTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of garbageTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageTime_GreaterEqual(java.sql.Timestamp value) {
        return registerGarbageTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of garbageTime as lessEqual. { &lt;= }
     * 
     * @param value The value of garbageTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageTime_LessEqual(java.sql.Timestamp value) {
        return registerGarbageTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of garbageTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of garbageTime as inScope.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerGarbageTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of garbageTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of garbageTime as notInScope.
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerGarbageTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                      
    /**
     * Set the value of garbageTime as isNull. { is null }
     * 
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageTime_IsNull() {
        return registerGarbageTime(LdConditionKey.CK_IS_NULL, DUMMY_OBJECT);
    }

    /**
     * Set the value of garbageTime as isNotNull. { is not null }
     * 
     * @return this. (NotNull)
     */
    public LdGarbageCQ setGarbageTime_IsNotNull() {
        return registerGarbageTime(LdConditionKey.CK_IS_NOT_NULL, DUMMY_OBJECT);
    }
        
    /**
     * Register condition of garbageTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of garbageTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdGarbageCQ registerGarbageTime(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getGarbageTime(), value)) {
            key.setupConditionValue(getGarbageTime(), value, getLocation(UJ_garbageTime, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_GARBAGE_TIME), key, getGarbageTime());
        }
        return this;
    }
    
    /**
     * Add order-by of garbageTime as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdGarbageCQ addOrderBy_GarbageTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_GARBAGE_TIME), null, true);return this;
    }

    /**
     * Add order-by of garbageTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdGarbageCQ addOrderBy_GarbageTime_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_GARBAGE_TIME), null, false);return this;
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

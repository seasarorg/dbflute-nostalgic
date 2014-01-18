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
public class LdBlackActionCQ extends LdAbstractConditionQuery {

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
    LdBlackActionCQ(LdAbstractConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BLACK_ACTION";
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
     * Include select-column of blackActionId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_BlackActionId() {
        return registerIncludedSelectColumn("BlackActionId", getRealColumnName("BLACK_ACTION_ID"));
    }

    /**
     * Include select-column of blackActionId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_BlackActionId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("BLACK_ACTION_ID"));
    }
  
    /**
     * Include select-column of blackListId as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_BlackListId() {
        return registerIncludedSelectColumn("BlackListId", getRealColumnName("BLACK_LIST_ID"));
    }

    /**
     * Include select-column of blackListId as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_BlackListId(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("BLACK_LIST_ID"));
    }
  
    /**
     * Include select-column of blackActionCode as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_BlackActionCode() {
        return registerIncludedSelectColumn("BlackActionCode", getRealColumnName("BLACK_ACTION_CODE"));
    }

    /**
     * Include select-column of blackActionCode as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_BlackActionCode(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("BLACK_ACTION_CODE"));
    }
  
    /**
     * Include select-column of blackLevel as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_BlackLevel() {
        return registerIncludedSelectColumn("BlackLevel", getRealColumnName("BLACK_LEVEL"));
    }

    /**
     * Include select-column of blackLevel as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_BlackLevel(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("BLACK_LEVEL"));
    }
  
    /**
     * Include select-column of evidencePhotograph as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_EvidencePhotograph() {
        return registerIncludedSelectColumn("EvidencePhotograph", getRealColumnName("EVIDENCE_PHOTOGRAPH"));
    }

    /**
     * Include select-column of evidencePhotograph as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_EvidencePhotograph(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("EVIDENCE_PHOTOGRAPH"));
    }
  
    /**
     * Include select-column of rTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_RTime() {
        return registerIncludedSelectColumn("RTime", getRealColumnName("R_TIME"));
    }

    /**
     * Include select-column of rTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_RTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_TIME"));
    }
  
    /**
     * Include select-column of uTime as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_UTime() {
        return registerIncludedSelectColumn("UTime", getRealColumnName("U_TIME"));
    }

    /**
     * Include select-column of uTime as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_UTime(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_TIME"));
    }
  
    /**
     * Include select-column of rStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_RStaff() {
        return registerIncludedSelectColumn("RStaff", getRealColumnName("R_STAFF"));
    }

    /**
     * Include select-column of rStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_RStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("R_STAFF"));
    }
  
    /**
     * Include select-column of uStaff as mine.
     * Alias name is java-name of this column.
     * Be careful to whether your table have the same column.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_UStaff() {
        return registerIncludedSelectColumn("UStaff", getRealColumnName("U_STAFF"));
    }

    /**
     * Include select-column of uStaff as mine.
     * 
     * @param aliasName Alias name. {select columnName as aliasName from ...} This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    public LdBlackActionCQ includeAsMine_UStaff(String aliasName) {
        return registerIncludedSelectColumn(aliasName, getRealColumnName("U_STAFF"));
    }
  
    /**
     * Register included-select-column.
     * 
     * @param aliasName Alias name. This should not contain comma. (NotNull)
     * @param realColumnName Real column name. This should not contain comma. (NotNull)
     * @return this. (NotNull)
     */
    protected LdBlackActionCQ registerIncludedSelectColumn(String aliasName, String realColumnName) {
        assertAliasName(aliasName);
        assertColumnName(realColumnName);
        getSqlClause().registerIncludedSelectColumn(aliasName, realColumnName);
        return this;
    }

    // =====================================================================================
    //                                                                                 Query
    //                                                                                 =====
      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   MyTable = [BLACK_ACTION]
    // * * * * * * * * */

      
    /** Column db name of blackActionId. */
    protected static final String COL_BLACK_ACTION_ID = "BLACK_ACTION_ID";

    /** Column java name of blackActionId. */
    protected static final String J_BlackActionId = "BlackActionId";

    /** Column uncapitalised java name of blackActionId. */
    protected static final String UJ_blackActionId = "blackActionId";

    /** The attribute of blackActionId. */
    protected LdConditionValue _blackActionId;

    /**
     * Get the value of blackActionId.
     * 
     * @return The value of blackActionId.
     */
    public LdConditionValue getBlackActionId() {
        if (_blackActionId == null) {
            _blackActionId = new LdConditionValue();
        }
        return _blackActionId;
    }
            
    /**
     * Set the value of blackActionId as equal. { = }
     * 
     * @param value The value of blackActionId as equal.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionId_Equal(java.math.BigDecimal value) {
        return registerBlackActionId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of blackActionId as equal. { = }
     * 
     * @param value The value of blackActionId as equal.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionId_Equal(long value) {
        return registerBlackActionId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackActionId as notEqual. { != }
     * 
     * @param value The value of blackActionId as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionId_NotEqual(java.math.BigDecimal value) {
        return registerBlackActionId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of blackActionId as notEqual. { != }
     * 
     * @param value The value of blackActionId as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionId_NotEqual(long value) {
        return registerBlackActionId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackActionId as greaterThan. { &gt; }
     * 
     * @param value The value of blackActionId as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionId_GreaterThan(java.math.BigDecimal value) {
        return registerBlackActionId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of blackActionId as greaterThan. { &gt; }
     * 
     * @param value The value of blackActionId as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionId_GreaterThan(long value) {
        return registerBlackActionId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackActionId as lessThan. { &lt; }
     * 
     * @param value The value of blackActionId as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionId_LessThan(java.math.BigDecimal value) {
        return registerBlackActionId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of blackActionId as lessThan. { &lt; }
     * 
     * @param value The value of blackActionId as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionId_LessThan(long value) {
        return registerBlackActionId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackActionId as greaterEqual. { &gt;= }
     * 
     * @param value The value of blackActionId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionId_GreaterEqual(java.math.BigDecimal value) {
        return registerBlackActionId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of blackActionId as greaterEqual. { &gt;= }
     * 
     * @param value The value of blackActionId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionId_GreaterEqual(long value) {
        return registerBlackActionId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackActionId as lessEqual. { &lt;= }
     * 
     * @param value The value of blackActionId as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionId_LessEqual(java.math.BigDecimal value) {
        return registerBlackActionId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of blackActionId as lessEqual. { &lt;= }
     * 
     * @param value The value of blackActionId as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionId_LessEqual(long value) {
        return registerBlackActionId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackActionId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of blackActionId as inScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerBlackActionId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of blackActionId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of blackActionId as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerBlackActionId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                              
    /**
     * Register condition of blackActionId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of blackActionId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackActionCQ registerBlackActionId(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getBlackActionId(), value)) {
            key.setupConditionValue(getBlackActionId(), value, getLocation(UJ_blackActionId, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_BLACK_ACTION_ID), key, getBlackActionId());
        }
        return this;
    }
    
    /**
     * Add order-by of blackActionId as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ addOrderBy_BlackActionId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BLACK_ACTION_ID), null, true);return this;
    }

    /**
     * Add order-by of blackActionId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ addOrderBy_BlackActionId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BLACK_ACTION_ID), null, false);return this;
    }
          
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
    public LdBlackActionCQ setBlackListId_Equal(java.math.BigDecimal value) {
        return registerBlackListId(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of blackListId as equal. { = }
     * 
     * @param value The value of blackListId as equal.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackListId_Equal(long value) {
        return registerBlackListId(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackListId as notEqual. { != }
     * 
     * @param value The value of blackListId as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackListId_NotEqual(java.math.BigDecimal value) {
        return registerBlackListId(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of blackListId as notEqual. { != }
     * 
     * @param value The value of blackListId as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackListId_NotEqual(long value) {
        return registerBlackListId(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackListId as greaterThan. { &gt; }
     * 
     * @param value The value of blackListId as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackListId_GreaterThan(java.math.BigDecimal value) {
        return registerBlackListId(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of blackListId as greaterThan. { &gt; }
     * 
     * @param value The value of blackListId as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackListId_GreaterThan(long value) {
        return registerBlackListId(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackListId as lessThan. { &lt; }
     * 
     * @param value The value of blackListId as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackListId_LessThan(java.math.BigDecimal value) {
        return registerBlackListId(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of blackListId as lessThan. { &lt; }
     * 
     * @param value The value of blackListId as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackListId_LessThan(long value) {
        return registerBlackListId(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackListId as greaterEqual. { &gt;= }
     * 
     * @param value The value of blackListId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackListId_GreaterEqual(java.math.BigDecimal value) {
        return registerBlackListId(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of blackListId as greaterEqual. { &gt;= }
     * 
     * @param value The value of blackListId as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackListId_GreaterEqual(long value) {
        return registerBlackListId(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackListId as lessEqual. { &lt;= }
     * 
     * @param value The value of blackListId as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackListId_LessEqual(java.math.BigDecimal value) {
        return registerBlackListId(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of blackListId as lessEqual. { &lt;= }
     * 
     * @param value The value of blackListId as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackListId_LessEqual(long value) {
        return registerBlackListId(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackListId as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of blackListId as inScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackListId_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerBlackListId(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of blackListId as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of blackListId as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackListId_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerBlackListId(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                              
    /**
     * Register condition of blackListId.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of blackListId. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackActionCQ registerBlackListId(LdConditionKey key, Object value) {
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
    public LdBlackActionCQ addOrderBy_BlackListId_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BLACK_LIST_ID), null, true);return this;
    }

    /**
     * Add order-by of blackListId as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ addOrderBy_BlackListId_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BLACK_LIST_ID), null, false);return this;
    }
          
    /** Column db name of blackActionCode. */
    protected static final String COL_BLACK_ACTION_CODE = "BLACK_ACTION_CODE";

    /** Column java name of blackActionCode. */
    protected static final String J_BlackActionCode = "BlackActionCode";

    /** Column uncapitalised java name of blackActionCode. */
    protected static final String UJ_blackActionCode = "blackActionCode";

    /** The attribute of blackActionCode. */
    protected LdConditionValue _blackActionCode;

    /**
     * Get the value of blackActionCode.
     * 
     * @return The value of blackActionCode.
     */
    public LdConditionValue getBlackActionCode() {
        if (_blackActionCode == null) {
            _blackActionCode = new LdConditionValue();
        }
        return _blackActionCode;
    }
        
    /**
     * Set the value of blackActionCode as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of blackActionCode as equal.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionCode_Equal(String value) {
        return registerBlackActionCode(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of blackActionCode as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionCode_Equal_EmptyString() {
        return registerBlackActionCode(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of blackActionCode as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of blackActionCode as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionCode_NotEqual(String value) {
        return registerBlackActionCode(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of blackActionCode as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of blackActionCode as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionCode_GreaterThan(String value) {
        return registerBlackActionCode(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of blackActionCode as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of blackActionCode as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionCode_LessThan(String value) {
        return registerBlackActionCode(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of blackActionCode as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of blackActionCode as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionCode_GreaterEqual(String value) {
        return registerBlackActionCode(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of blackActionCode as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of blackActionCode as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionCode_LessEqual(String value) {
        return registerBlackActionCode(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of blackActionCode as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of blackActionCode as prefixSearch.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionCode_PrefixSearch(String value) {
        return registerBlackActionCode(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of blackActionCode as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of blackActionCode as inScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionCode_InScope(java.util.List<String> valueList) {
        return registerBlackActionCode(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of blackActionCode as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of blackActionCode as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackActionCode_NotInScope(java.util.List<String> valueList) {
        return registerBlackActionCode(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of blackActionCode.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of blackActionCode. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackActionCQ registerBlackActionCode(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getBlackActionCode(), value)) {
            key.setupConditionValue(getBlackActionCode(), value, getLocation(UJ_blackActionCode, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_BLACK_ACTION_CODE), key, getBlackActionCode());
        }
        return this;
    }
    
    /**
     * Add order-by of blackActionCode as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ addOrderBy_BlackActionCode_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BLACK_ACTION_CODE), null, true);return this;
    }

    /**
     * Add order-by of blackActionCode as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ addOrderBy_BlackActionCode_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BLACK_ACTION_CODE), null, false);return this;
    }
          
    /** Column db name of blackLevel. */
    protected static final String COL_BLACK_LEVEL = "BLACK_LEVEL";

    /** Column java name of blackLevel. */
    protected static final String J_BlackLevel = "BlackLevel";

    /** Column uncapitalised java name of blackLevel. */
    protected static final String UJ_blackLevel = "blackLevel";

    /** The attribute of blackLevel. */
    protected LdConditionValue _blackLevel;

    /**
     * Get the value of blackLevel.
     * 
     * @return The value of blackLevel.
     */
    public LdConditionValue getBlackLevel() {
        if (_blackLevel == null) {
            _blackLevel = new LdConditionValue();
        }
        return _blackLevel;
    }
            
    /**
     * Set the value of blackLevel as equal. { = }
     * 
     * @param value The value of blackLevel as equal.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackLevel_Equal(java.math.BigDecimal value) {
        return registerBlackLevel(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of blackLevel as equal. { = }
     * 
     * @param value The value of blackLevel as equal.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackLevel_Equal(long value) {
        return registerBlackLevel(LdConditionKey.CK_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackLevel as notEqual. { != }
     * 
     * @param value The value of blackLevel as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackLevel_NotEqual(java.math.BigDecimal value) {
        return registerBlackLevel(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of blackLevel as notEqual. { != }
     * 
     * @param value The value of blackLevel as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackLevel_NotEqual(long value) {
        return registerBlackLevel(LdConditionKey.CK_NOT_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackLevel as greaterThan. { &gt; }
     * 
     * @param value The value of blackLevel as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackLevel_GreaterThan(java.math.BigDecimal value) {
        return registerBlackLevel(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of blackLevel as greaterThan. { &gt; }
     * 
     * @param value The value of blackLevel as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackLevel_GreaterThan(long value) {
        return registerBlackLevel(LdConditionKey.CK_GREATER_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackLevel as lessThan. { &lt; }
     * 
     * @param value The value of blackLevel as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackLevel_LessThan(java.math.BigDecimal value) {
        return registerBlackLevel(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of blackLevel as lessThan. { &lt; }
     * 
     * @param value The value of blackLevel as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackLevel_LessThan(long value) {
        return registerBlackLevel(LdConditionKey.CK_LESS_THAN, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackLevel as greaterEqual. { &gt;= }
     * 
     * @param value The value of blackLevel as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackLevel_GreaterEqual(java.math.BigDecimal value) {
        return registerBlackLevel(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of blackLevel as greaterEqual. { &gt;= }
     * 
     * @param value The value of blackLevel as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackLevel_GreaterEqual(long value) {
        return registerBlackLevel(LdConditionKey.CK_GREATER_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackLevel as lessEqual. { &lt;= }
     * 
     * @param value The value of blackLevel as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackLevel_LessEqual(java.math.BigDecimal value) {
        return registerBlackLevel(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of blackLevel as lessEqual. { &lt;= }
     * 
     * @param value The value of blackLevel as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackLevel_LessEqual(long value) {
        return registerBlackLevel(LdConditionKey.CK_LESS_EQUAL, new java.math.BigDecimal(String.valueOf(value)));
    }

    /**
     * Set the value of blackLevel as inScope. { in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of blackLevel as inScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackLevel_InScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerBlackLevel(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of blackLevel as notInScope. { not in (a, b) }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of blackLevel as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setBlackLevel_NotInScope(java.util.List<java.math.BigDecimal> valueList) {
        return registerBlackLevel(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                              
    /**
     * Register condition of blackLevel.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of blackLevel. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackActionCQ registerBlackLevel(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getBlackLevel(), value)) {
            key.setupConditionValue(getBlackLevel(), value, getLocation(UJ_blackLevel, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_BLACK_LEVEL), key, getBlackLevel());
        }
        return this;
    }
    
    /**
     * Add order-by of blackLevel as ASC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ addOrderBy_BlackLevel_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BLACK_LEVEL), null, true);return this;
    }

    /**
     * Add order-by of blackLevel as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ addOrderBy_BlackLevel_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_BLACK_LEVEL), null, false);return this;
    }
          
    /** Column db name of evidencePhotograph. */
    protected static final String COL_EVIDENCE_PHOTOGRAPH = "EVIDENCE_PHOTOGRAPH";

    /** Column java name of evidencePhotograph. */
    protected static final String J_EvidencePhotograph = "EvidencePhotograph";

    /** Column uncapitalised java name of evidencePhotograph. */
    protected static final String UJ_evidencePhotograph = "evidencePhotograph";

    /** The attribute of evidencePhotograph. */
    protected LdConditionValue _evidencePhotograph;

    /**
     * Get the value of evidencePhotograph.
     * 
     * @return The value of evidencePhotograph.
     */
    public LdConditionValue getEvidencePhotograph() {
        if (_evidencePhotograph == null) {
            _evidencePhotograph = new LdConditionValue();
        }
        return _evidencePhotograph;
    }
                            
    /**
     * Set the value of evidencePhotograph as isNull. { is null }
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setEvidencePhotograph_IsNull() {
        return registerEvidencePhotograph(LdConditionKey.CK_IS_NULL, DUMMY_OBJECT);
    }

    /**
     * Set the value of evidencePhotograph as isNotNull. { is not null }
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setEvidencePhotograph_IsNotNull() {
        return registerEvidencePhotograph(LdConditionKey.CK_IS_NOT_NULL, DUMMY_OBJECT);
    }
        
    /**
     * Register condition of evidencePhotograph.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of evidencePhotograph. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackActionCQ registerEvidencePhotograph(LdConditionKey key, Object value) {
        if (key.isValidRegistration(getEvidencePhotograph(), value)) {
            key.setupConditionValue(getEvidencePhotograph(), value, getLocation(UJ_evidencePhotograph, key));
            getSqlClause().registerWhereClause(getRealColumnName(COL_EVIDENCE_PHOTOGRAPH), key, getEvidencePhotograph());
        }
        return this;
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
    public LdBlackActionCQ setRTime_Equal(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of rTime as notEqual. { != }
     * 
     * @param value The value of rTime as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRTime_NotEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of rTime as greaterThan. { &gt; }
     * 
     * @param value The value of rTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRTime_GreaterThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of rTime as lessThan. { &lt; }
     * 
     * @param value The value of rTime as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRTime_LessThan(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of rTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of rTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRTime_GreaterEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of rTime as lessEqual. { &lt;= }
     * 
     * @param value The value of rTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRTime_LessEqual(java.sql.Timestamp value) {
        return registerRTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of rTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as inScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of rTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rTime as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerRTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of rTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackActionCQ registerRTime(LdConditionKey key, Object value) {
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
    public LdBlackActionCQ addOrderBy_RTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_TIME), null, true);return this;
    }

    /**
     * Add order-by of rTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ addOrderBy_RTime_Desc() {
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
    public LdBlackActionCQ setUTime_Equal(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_EQUAL, value);
    }

    /**
     * Set the value of uTime as notEqual. { != }
     * 
     * @param value The value of uTime as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUTime_NotEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_NOT_EQUAL, value);
    }

    /**
     * Set the value of uTime as greaterThan. { &gt; }
     * 
     * @param value The value of uTime as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUTime_GreaterThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_THAN, value);
    }

    /**
     * Set the value of uTime as lessThan. { &lt; }
     * 
     * @param value The value of uTime as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUTime_LessThan(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_THAN, value);
    }

    /**
     * Set the value of uTime as greaterEqual. { &gt;= }
     * 
     * @param value The value of uTime as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUTime_GreaterEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_GREATER_EQUAL, value);
    }

    /**
     * Set the value of uTime as lessEqual. { &lt;= }
     * 
     * @param value The value of uTime as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUTime_LessEqual(java.sql.Timestamp value) {
        return registerUTime(LdConditionKey.CK_LESS_EQUAL, value);
    }

    /**
     * Set the value of uTime as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as inScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUTime_InScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_IN_SCOPE, valueList);
    }

    /**
     * Set the value of uTime as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uTime as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUTime_NotInScope(java.util.List<java.sql.Timestamp> valueList) {
        return registerUTime(LdConditionKey.CK_NOT_IN_SCOPE, valueList);
    }
                          
    /**
     * Register condition of uTime.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uTime. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackActionCQ registerUTime(LdConditionKey key, Object value) {
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
    public LdBlackActionCQ addOrderBy_UTime_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_TIME), null, true);return this;
    }

    /**
     * Add order-by of uTime as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ addOrderBy_UTime_Desc() {
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
    public LdBlackActionCQ setRStaff_Equal(String value) {
        return registerRStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of rStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRStaff_Equal_EmptyString() {
        return registerRStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of rStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRStaff_NotEqual(String value) {
        return registerRStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRStaff_GreaterThan(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRStaff_LessThan(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRStaff_GreaterEqual(String value) {
        return registerRStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRStaff_LessEqual(String value) {
        return registerRStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of rStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRStaff_PrefixSearch(String value) {
        return registerRStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of rStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as inScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRStaff_InScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of rStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of rStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setRStaff_NotInScope(java.util.List<String> valueList) {
        return registerRStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of rStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of rStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackActionCQ registerRStaff(LdConditionKey key, Object value) {
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
    public LdBlackActionCQ addOrderBy_RStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_R_STAFF), null, true);return this;
    }

    /**
     * Add order-by of rStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ addOrderBy_RStaff_Desc() {
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
    public LdBlackActionCQ setUStaff_Equal(String value) {
        return registerUStaff(LdConditionKey.CK_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the empty-string of uStaff as equal. { = }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUStaff_Equal_EmptyString() {
        return registerUStaff(LdConditionKey.CK_EQUAL, "");
    }

    /**
     * Set the value of uStaff as notEqual. { != }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as notEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUStaff_NotEqual(String value) {
        return registerUStaff(LdConditionKey.CK_NOT_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterThan. { &gt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUStaff_GreaterThan(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessThan. { &lt; }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessThan.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUStaff_LessThan(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_THAN, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as greaterEqual. { &gt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as greaterEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUStaff_GreaterEqual(String value) {
        return registerUStaff(LdConditionKey.CK_GREATER_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as lessEqual. { &lt;= }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as lessEqual.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUStaff_LessEqual(String value) {
        return registerUStaff(LdConditionKey.CK_LESS_EQUAL, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as prefixSearch. { like 'xxx%' }
     * If the value is null or empty-string, this condition is ignored.
     * 
     * @param value The value of uStaff as prefixSearch.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUStaff_PrefixSearch(String value) {
        return registerUStaff(LdConditionKey.CK_PREFIX_SEARCH, filterRemoveEmptyString(value));
    }

    /**
     * Set the value of uStaff as inScope. { in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as inScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUStaff_InScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }

    /**
     * Set the value of uStaff as notInScope. { not in ('a', 'b') }
     * If the element in the list is null or empty-string, the condition-element is ignored.
     * 
     * @param valueList The value of uStaff as notInScope.
     * @return this. (NotNull)
     */
    public LdBlackActionCQ setUStaff_NotInScope(java.util.List<String> valueList) {
        return registerUStaff(LdConditionKey.CK_NOT_IN_SCOPE, filterRemoveEmptyStringFromList(valueList));
    }
                                  
    /**
     * Register condition of uStaff.
     * 
     * @param key Condition key. (NotNull)
     * @param value The value of uStaff. (Nullable)
     * @return this. (NotNull)
     */
    protected LdBlackActionCQ registerUStaff(LdConditionKey key, Object value) {
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
    public LdBlackActionCQ addOrderBy_UStaff_Asc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, true);return this;
    }

    /**
     * Add order-by of uStaff as DESC.
     * 
     * @return this. (NotNull)
     */
    public LdBlackActionCQ addOrderBy_UStaff_Desc() {
        getSqlClause().registerOrderBy(getRealColumnName(COL_U_STAFF), null, false);return this;
    }
      
    // =====================================================================================
    //                                                               Query-SetupOuter-Method
    //                                                               =======================

      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [BLACK_LIST]
    //   ForeignProperty = [blackList]
    // * * * * * * * * */

    /**
     * Query for blackList.
     * 
     * @return Instance of LdBlackListCQ as blackList. (NotNull)
     */
    public LdBlackListCQ queryBlackList() {
        return getConditionQueryBlackList();
    }

    /**
     * Setup outer join for ${foreignPropertyName}.
     */
    public void setupOuterJoin_BlackList() {
        final java.util.Map<String, String> joinOnMap = new java.util.LinkedHashMap<String, String>();
        String key = null;
        String value = null;
    
        key = getRealColumnName("BLACK_LIST_ID");
        value = getConditionQueryBlackList().getRealColumnName("BLACK_LIST_ID");
        joinOnMap.put(key, value);
    
        final String joinTableName = "BLACK_LIST";
        final String aliasName = getConditionQueryBlackList().getRealAliasName();
        getSqlClause().registerOuterJoin(joinTableName, aliasName, joinOnMap);
    }

    /** Condition-query for blackList. */
    protected LdBlackListCQ _conditionQueryBlackList;

    /**
     * Get condition-query for blackList.
     * 
     * @return Instance of LdBlackListCQ as blackList. (NotNull)
     */
    public LdBlackListCQ getConditionQueryBlackList() {
        if (_conditionQueryBlackList == null) {
            _conditionQueryBlackList = newQueryBlackList();
            setupOuterJoin_BlackList();
        }
        return _conditionQueryBlackList;
    }

    /**
     * New query for blackList.
     * 
     * @return Query for blackList. (NotNull)
     */
    protected LdBlackListCQ newQueryBlackList() {
        return new LdBlackListCQ(this, getSqlClause(), "BlackList", getNextNestLevel());
    }
      
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [BLACK_ACTION_LOOKUP]
    //   ForeignProperty = [blackActionLookup]
    // * * * * * * * * */

    /**
     * Query for blackActionLookup.
     * 
     * @return Instance of LdBlackActionLookupCQ as blackActionLookup. (NotNull)
     */
    public LdBlackActionLookupCQ queryBlackActionLookup() {
        return getConditionQueryBlackActionLookup();
    }

    /**
     * Setup outer join for ${foreignPropertyName}.
     */
    public void setupOuterJoin_BlackActionLookup() {
        final java.util.Map<String, String> joinOnMap = new java.util.LinkedHashMap<String, String>();
        String key = null;
        String value = null;
    
        key = getRealColumnName("BLACK_ACTION_CODE");
        value = getConditionQueryBlackActionLookup().getRealColumnName("BLACK_ACTION_CODE");
        joinOnMap.put(key, value);
    
        final String joinTableName = "BLACK_ACTION_LOOKUP";
        final String aliasName = getConditionQueryBlackActionLookup().getRealAliasName();
        getSqlClause().registerOuterJoin(joinTableName, aliasName, joinOnMap);
    }

    /** Condition-query for blackActionLookup. */
    protected LdBlackActionLookupCQ _conditionQueryBlackActionLookup;

    /**
     * Get condition-query for blackActionLookup.
     * 
     * @return Instance of LdBlackActionLookupCQ as blackActionLookup. (NotNull)
     */
    public LdBlackActionLookupCQ getConditionQueryBlackActionLookup() {
        if (_conditionQueryBlackActionLookup == null) {
            _conditionQueryBlackActionLookup = newQueryBlackActionLookup();
            setupOuterJoin_BlackActionLookup();
        }
        return _conditionQueryBlackActionLookup;
    }

    /**
     * New query for blackActionLookup.
     * 
     * @return Query for blackActionLookup. (NotNull)
     */
    protected LdBlackActionLookupCQ newQueryBlackActionLookup() {
        return new LdBlackActionLookupCQ(this, getSqlClause(), "BlackActionLookup", getNextNestLevel());
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

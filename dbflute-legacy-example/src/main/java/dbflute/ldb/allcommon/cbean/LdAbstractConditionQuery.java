package dbflute.ldb.allcommon.cbean;


import dbflute.ldb.allcommon.cbean.ckey.LdConditionKey;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;

/**
 * The abstract class of condition-query.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractConditionQuery implements LdConditionQuery {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Condition value for DUMMY. */
    protected static final LdConditionValue DUMMY_CONDITION_VALUE = new LdConditionValue();

    /** Object for DUMMY. */
    protected static final Object DUMMY_OBJECT = new Object();

    /** SQL clause. */
    protected final LdSqlClause _sqlClause;

    /** My alias name. */
    protected final String _aliasName;

    /** Nest level. */
    protected final int _nestLevel;

    /** Child query. */
    protected final LdAbstractConditionQuery _childQuery;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     * 
     * @param childQuery Child query. (Nullable: If null, this is base instance.)
     * @param sqlClause SQL clause instance. (NotNull)
     * @param aliasName My alias name. (NotNull)
     * @param nestLevel Nest level.
     */
    public LdAbstractConditionQuery(LdAbstractConditionQuery childQuery, LdSqlClause sqlClause, String aliasName, int nestLevel) {
        _childQuery = childQuery;
        _sqlClause = sqlClause;
        _aliasName = aliasName;
        _nestLevel = nestLevel;
    }

    // =====================================================================================
    //                                                                                Getter
    //                                                                                ======
    /**
     * Get child query.
     * 
     * @return Child query. (Nullable)
     */
    public LdConditionQuery getChildQuery() {
        return _childQuery;
    }

    /**
     * Get sql clause.
     * 
     * @return Sql clause. (NotNull)
     */
    public LdSqlClause getSqlClause() {
        return _sqlClause;
    }

    /**
     * Get alias name.
     * 
     * @return Alias name. (NotNull)
     */
    public String getAliasName() {
        return _aliasName;
    }

    /**
     * Get nest level.
     * 
     * @return Nest level.
     */
    public int getNestLevel() {
        return _nestLevel;
    }

    /**
     * Get next nest level.
     * 
     * @return Next nest level.
     */
    public int getNextNestLevel() {
        return _nestLevel+1;
    }

    /**
     * Is base query?
     * 
     * @param query Condition query. (NotNull)
     * @return Determination.
     */
    public boolean isBaseQuery(LdConditionQuery query) {
        return (query.getChildQuery() == null);
    }

    // =====================================================================================
    //                                                                                Invoke
    //                                                                                ======
    public LdConditionValue invokeGetter(String columnMultiName) {
        final LdDBMeta dbmeta = LdDBMetaInstanceHandler.getInstanceByTableDbName(getTableDbName());
        final String columnCapPropName = dbmeta.getCapPropNameByMultiName(columnMultiName);
        String methodName = "get" + columnCapPropName;
        java.lang.reflect.Method method = null;
        try {
            method = this.getClass().getMethod(methodName);
        } catch (NoSuchMethodException e) {
            String msg = "The columnMultiName is not existing in this table: columnMultiName=" + columnMultiName;
            msg = msg + " tableName=" + getTableDbName() + " methodName=" + methodName;
            throw new RuntimeException(msg, e);
        }
        try {
            final Object result = method.invoke(this, new Object[]{});
            return (LdConditionValue)result;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    public void invokeSetterEqual(String columnMultiName, Object value) {
        invokeSetter(columnMultiName, value, "equal");
    }

    public void invokeSetterNotEqual(String columnMultiName, Object value) {
        invokeSetter(columnMultiName, value, "notEqual");
    }

    public void invokeSetterGreaterThan(String columnMultiName, Object value) {
        invokeSetter(columnMultiName, value, "greaterThan");
    }

    public void invokeSetterLessThan(String columnMultiName, Object value) {
        invokeSetter(columnMultiName, value, "lessThan");
    }

    public void invokeSetterGreaterEqual(String columnMultiName, Object value) {
        invokeSetter(columnMultiName, value, "greaterEqual");
    }

    public void invokeSetterLessEqual(String columnMultiName, Object value) {
        invokeSetter(columnMultiName, value, "lessEqual");
    }

    protected void invokeSetter(String columnMultiName, Object value, String conditionKeyName) {
        final LdDBMeta dbmeta = LdDBMetaInstanceHandler.getInstanceByTableDbName(getTableDbName());
        final String columnCapPropName = dbmeta.getCapPropNameByMultiName(columnMultiName);
        String methodName = "set" + columnCapPropName + "_" + conditionKeyName.substring(0, 1).toUpperCase() + conditionKeyName.substring(1);
        java.lang.reflect.Method method = null;
        try {
            method = this.getClass().getMethod(methodName);
        } catch (NoSuchMethodException e) {
            String msg = "The columnMultiName is not existing in this table: columnMultiName=" + columnMultiName;
            msg = msg + " tableName=" + getTableDbName() + " methodName=" + methodName;
            throw new RuntimeException(msg, e);
        }
        try {
            method.invoke(this, new Object[]{});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    public void invokeAddOrderByAsc(String columnMultiName) {
        invokeOrderBy(columnMultiName, true);
    }

    public void invokeAddOrderByDesc(String columnMultiName) {
        invokeOrderBy(columnMultiName, false);
    }

    protected void invokeOrderBy(String columnMultiName, boolean isAsc) {
        String ascDesc = null;
        if (isAsc) {
            ascDesc = "Asc";
        } else {
            ascDesc = "Desc";
        }
        final LdDBMeta dbmeta = LdDBMetaInstanceHandler.getInstanceByTableDbName(getTableDbName());
        final String methodName = "addOrderBy_" + dbmeta.getCapPropNameByMultiName(columnMultiName) + "_" + ascDesc;

        java.lang.reflect.Method method = null;
        try {
            method = this.getClass().getMethod(methodName);
        } catch (NoSuchMethodException e) {
            String msg = "The columnMultiName is not existing in this table: columnMultiName=" + columnMultiName;
            msg = msg + " tableName=" + getTableDbName() + " methodName=" + methodName;
            throw new RuntimeException(msg, e);
        }
        try {
            method.invoke(this, new Object[]{});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    // =====================================================================================
    //                                                                         Foreign Query
    //                                                                         =============
    /// <summary>
    /// This method implements the method that is declared at super.
    /// </summary>
    /// <param name="foreignPropertyName">Foreign-property-name(Both OK - InitCap or not). (NotNull)</param>
    /// <returns>Foreign condition-query as interface.</returns>
    public LdConditionQuery getForeignConditionQuery(String foreignPropertyName) {
        final String methodName = "Query" + foreignPropertyName.substring(0, 1) + foreignPropertyName.substring(1);
        java.lang.reflect.Method method = null;
        try {
            method = this.getClass().getMethod(methodName);
        } catch (NoSuchMethodException e) {
            String msg = "The foreignPropertyName is not existing in this table: foreignPropertyName=" + foreignPropertyName;
            msg = msg + " tableName=" + getTableDbName() + " methodName=" + methodName;
            throw new RuntimeException(msg, e);
        }
        try {
            return (LdConditionQuery)method.invoke(this, new Object[]{});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    // =====================================================================================
    //                                                                                 Other
    //                                                                                 =====
    /**
     * Get location.
     * 
     * @param columnPropertyName Column property name.
     * @param key Condition key.
     * @return Next nest level.
     */
    protected String getLocation(String columnPropertyName, LdConditionKey key) {
        return getLocationBase(columnPropertyName) + "." + key.getConditionKey();
    }

    protected String getLocationBase() {
        final StringBuffer sb = new StringBuffer();
        LdConditionQuery query = this;
        while (true) {
            if (query.isBaseQuery(query)) {
                sb.insert(0, "conditionQuery.");
                break;
            } else {
                sb.insert(0, "conditionQuery" + query.getAliasName() + ".");
            }
            query = query.getChildQuery();
        }
        return sb.toString();
    }

    protected String getLocationBase(String columnPropertyName) {
        return getLocationBase() + columnPropertyName;
    }

    protected LdConditionQuery registerInScopeSubQuery(LdConditionQuery subQuery
                                 , String realColumnName, String firstReffererColumnName, String propertyName) {
        final String selectClause = "select " + subQuery.getAliasName() + "." + firstReffererColumnName;
        final String fromClause = subQuery.getSqlClause().getFromClause();
        final String oldStr = ".conditionQuery.";
        final String newStr = "." + getLocationBase(propertyName) + ".";
        final String whereClause = replaceString(subQuery.getSqlClause().getWhereClause(), oldStr, newStr);
        getSqlClause().registerWhereClause(realColumnName + " in (" + selectClause + " " + fromClause + " " + whereClause + ")");
        return this;
    }

    // =====================================================================================
    //                                                                                Helper
    //                                                                                ======

    protected final String replaceString(String text, String fromText, String toText) {
        if(text == null || fromText == null || toText == null)
            return null;
        StringBuffer buf = new StringBuffer(100);
        int pos = 0;
        int pos2 = 0;
        do {
            pos = text.indexOf(fromText, pos2);
            if(pos == 0) {
                buf.append(toText);
                pos2 = fromText.length();
            } else
            if(pos > 0) {
                buf.append(text.substring(pos2, pos));
                buf.append(toText);
                pos2 = pos + fromText.length();
            } else {
                buf.append(text.substring(pos2));
                return buf.toString();
            }
        } while(true);
    }

    // ----------------------------------------------------------------
    //                                                    Assert Object
    //                                                    -------------
    /**
     * Assert that the object is not null.
     * 
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     * @exception IllegalArgumentException
     */
    protected void assertObjectNotNull(String variableName, Object value) {
        if (variableName == null) {
            String msg = "The value should not be null: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            String msg = "The value should not be null: variableName=" + variableName;
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * Assert that the column-name is not null and is not emtpy and does not contain comma.
     * 
     * @param columnName Column-name. (NotNull)
     * @exception IllegalArgumentException
     */
    protected void assertColumnName(String columnName) {
        if (columnName == null) {
            String msg = "The columnName should not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (columnName.trim().length() == 0) {
            String msg = "The columnName should not be empty-string.";
            throw new IllegalArgumentException(msg);
        }
        if (columnName.indexOf(",") >= 0) {
            String msg = "The columnName should not contain comma ',': " + columnName;
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * Assert that the alias-name is not null and is not emtpy and does not contain comma.
     * 
     * @param aliasName Alias-name. (NotNull)
     * @exception IllegalArgumentException
     */
    protected void assertAliasName(String aliasName) {
        if (aliasName == null) {
            String msg = "The aliasName should not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (aliasName.trim().length() == 0) {
            String msg = "The aliasName should not be empty-string.";
            throw new IllegalArgumentException(msg);
        }
        if (aliasName.indexOf(",") >= 0) {
            String msg = "The aliasName should not contain comma ',': " + aliasName;
            throw new IllegalArgumentException(msg);
        }
    }


    // ----------------------------------------------------------------
    //                                                    Assert String
    //                                                    -------------
    /**
     * Assert that the entity is not null and not trimmed empty.
     * 
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     */
    protected void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        assertObjectNotNull("variableName", variableName);
        assertObjectNotNull("value", value);
        if (value.trim().length() ==0) {
            String msg = "The value should not be empty: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
    }
}

package dbflute.ldb.cbean;


import dbflute.ldb.allcommon.cbean.LdAbstractConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.allcommon.helper.LdMapListString;
import dbflute.ldb.allcommon.helper.LdMapListStringImpl;

/**
 * The condition-bean of GARBAGE.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdGarbageCB extends LdAbstractConditionBean {

    // =====================================================================================
    //                                                                            Annotation
    //                                                                            ==========
    /** TABLE-Annotation */
    public static final String TABLE = "GARBAGE";

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Condition query. */
    protected LdGarbageCQ _conditionQuery;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdGarbageCB() {
    }

    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   MyTable = [GARBAGE]
    // * * * * * * * * */

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
    //                                                                    Accept Primary-Key
    //                                                                    ==================
    /**
     * This method implements the method that is declared at super.
     * 
     * @param primaryKeyMap Primary key map. (NotNull and NotEmpty)
     * @return Instance of query. (NotNull)
     */
    public LdConditionBean acceptPrimaryKeyMap(java.util.Map<String, ? extends Object> primaryKeyMap) {
        if (primaryKeyMap == null) {
            String msg = "The argument[primaryKeyMap] must not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (primaryKeyMap.isEmpty()) {
            String msg = "The argument[primaryKeyMap] must not be empty.";
            throw new IllegalArgumentException(msg);
        }
  
        if (!primaryKeyMap.containsKey("GARBAGE_MEMO")) {
            String msg = "The primaryKeyMap must have the value of GARBAGE_MEMO";
            throw new IllegalStateException(msg + ": primaryKeyMap --> " + primaryKeyMap);
        }
        {
            final Object obj = primaryKeyMap.get("GARBAGE_MEMO");
            if (obj == null) {
                query().setGarbageMemo_Equal(null);
            } else {
                if (obj instanceof String) {
                    query().setGarbageMemo_Equal((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    query().setGarbageMemo_Equal((String)obj);
    
                }
            }
        }
  
        if (!primaryKeyMap.containsKey("GARBAGE_TIME")) {
            String msg = "The primaryKeyMap must have the value of GARBAGE_TIME";
            throw new IllegalStateException(msg + ": primaryKeyMap --> " + primaryKeyMap);
        }
        {
            final Object obj = primaryKeyMap.get("GARBAGE_TIME");
            if (obj == null) {
                query().setGarbageTime_Equal(null);
            } else {
                if (obj instanceof java.sql.Timestamp) {
                    query().setGarbageTime_Equal((java.sql.Timestamp)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.sql.Timestamp or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
          
                    final String value = (String)obj;
                    try {
                        query().setGarbageTime_Equal((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value));
                    } catch (java.text.ParseException e) {
                        String msg = "query().setGarbageTime_Equal((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    } catch (RuntimeException e) {
                        String msg = "query().setGarbageTime_Equal((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
          
                }
            }
        }
  
        return this;

    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param primaryKeyMapString Primary-key map. (NotNull and NotEmpty)
     * @return this. (NotNull)
     */
    public LdConditionBean acceptPrimaryKeyMapString(String primaryKeyMapString) {
        if (primaryKeyMapString == null) {
            String msg = "The argument[primaryKeyMapString] must not be null.";
            throw new IllegalArgumentException(msg);
        }
        final String prefix = MAP_STRING_MAP_MARK + MAP_STRING_START_BRACE;
        final String suffix = MAP_STRING_END_BRACE;
        if (!primaryKeyMapString.trim().startsWith(prefix)) {
            primaryKeyMapString = prefix + primaryKeyMapString;
        }
        if (!primaryKeyMapString.trim().endsWith(suffix)) {
            primaryKeyMapString = primaryKeyMapString + suffix;
        }
        LdMapListString mapListString = new LdMapListStringImpl();
        mapListString.setMapMark(MAP_STRING_MAP_MARK);
        mapListString.setListMark(MAP_STRING_LIST_MARK);
        mapListString.setDelimiter(MAP_STRING_DELIMITER);
        mapListString.setStartBrace(MAP_STRING_START_BRACE);
        mapListString.setEndBrace(MAP_STRING_END_BRACE);
        mapListString.setEqual(MAP_STRING_EQUAL);
        return acceptPrimaryKeyMap(mapListString.generateMap(primaryKeyMapString));
    }

    // =====================================================================================
    //                                                                 Add-OrderBy-PK Method
    //                                                                 =====================
    /**
     * This method implements the method that is declared at super.
     * 
     * @return this. (NotNull)
     */
    public LdConditionBean addOrderBy_PK_Asc() {
  
        query().addOrderBy_GarbageMemo_Asc();
  
        query().addOrderBy_GarbageTime_Asc();
  
        return this;

    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return this. (NotNull)
     */
    public LdConditionBean addOrderBy_PK_Desc() {
  
        query().addOrderBy_GarbageMemo_Desc();
  
        query().addOrderBy_GarbageTime_Desc();
  
        return this;

    }

    // =====================================================================================
    //                                                                                 Query
    //                                                                                 =====
    /**
     * Query.
     * 
     * @return Instance of query. (NotNull)
     */
    public LdGarbageCQ query() {
        return getConditionQuery();
    }

    /**
     * Get condition query. {Internal method for s2dao}
     * 
     * @return Instance of condition query. (NotNull)
     */
    public LdGarbageCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdGarbageCQ(null, getSqlClause(), getTableDbName(), 0);
        }
        return _conditionQuery;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Instance of query as interface. (NotNull)
     */
    public LdConditionQuery getConditionQueryAsInterface() {
        return getConditionQuery();
    }

    // =====================================================================================
    //                                                                          Limit Select
    //                                                                          ============
    /** Is limit-select PK only? */
    protected boolean _isLimitSelectPKOnly;

    /**
     * Is limit-select PK only?
     * 
     * @return Determination.
     */
    public boolean isLimitSelect_PKOnly() {
        return _isLimitSelectPKOnly;
    }

    /**
     * Limit select PK only.
     *
     * @return this. (NotNull)
     */
    public LdConditionBean limitSelect_PKOnly() {
        _isLimitSelectPKOnly = true;
        return this;
    }

    /**
     * Limit select off.
     *
     * @return this. (NotNull)
     */
    public LdConditionBean limitSelect_Off() {
        _isLimitSelectPKOnly = false;
        return this;
    }

    // =====================================================================================
    //                                                                          Setup Select
    //                                                                          ============
  
  
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

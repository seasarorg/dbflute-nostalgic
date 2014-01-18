package dbflute.ldb.cbean;


import dbflute.ldb.allcommon.cbean.LdAbstractConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.allcommon.helper.LdMapListString;
import dbflute.ldb.allcommon.helper.LdMapListStringImpl;

/**
 * The condition-bean of BLACK_ACTION.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdBlackActionCB extends LdAbstractConditionBean {

    // =====================================================================================
    //                                                                            Annotation
    //                                                                            ==========
    /** TABLE-Annotation */
    public static final String TABLE = "BLACK_ACTION";

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Condition query. */
    protected LdBlackActionCQ _conditionQuery;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBlackActionCB() {
    }

    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   MyTable = [BLACK_ACTION]
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
        return "BLACK_ACTION";
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
  
        if (!primaryKeyMap.containsKey("BLACK_ACTION_ID")) {
            String msg = "The primaryKeyMap must have the value of BLACK_ACTION_ID";
            throw new IllegalStateException(msg + ": primaryKeyMap --> " + primaryKeyMap);
        }
        {
            Object obj = primaryKeyMap.get("BLACK_ACTION_ID");
            if (obj instanceof java.math.BigDecimal) {
                query().setBlackActionId_Equal((java.math.BigDecimal)obj);
            } else {
                if (!(obj instanceof String)) {
                    String msg = "The value should be java.math.BigDecimal or String: ";
                    msg = msg + "valueType=" + (obj != null ? obj.getClass() : null) + " value=" + obj;
                    throw new IllegalArgumentException(msg);
                }
                  
                String value = (String)obj;
                if (value != null) {
                    try {
                        query().setBlackActionId_Equal(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "query().setBlackActionId_Equal(new java.math.BigDecimal(value))";
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
  
        query().addOrderBy_BlackActionId_Asc();
  
        return this;

    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return this. (NotNull)
     */
    public LdConditionBean addOrderBy_PK_Desc() {
  
        query().addOrderBy_BlackActionId_Desc();
  
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
    public LdBlackActionCQ query() {
        return getConditionQuery();
    }

    /**
     * Get condition query. {Internal method for s2dao}
     * 
     * @return Instance of condition query. (NotNull)
     */
    public LdBlackActionCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdBlackActionCQ(null, getSqlClause(), getTableDbName(), 0);
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
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [BLACK_LIST]
    //   ForeignProperty = [blackList]
    // * * * * * * * * */

    /** Mark of select for blackList */
    protected String _selectBlackList;
    /**
     * Get mark of select for blackList.
     * 
     * @return Mark of select. (If null, this foreign entity is out of select.)
     */
    public String getBlackList_isSelect() {
        return _selectBlackList;
    }
    /**
     * Set up select for blackList.
     * If you invoke this, this foreign entity is target of select.
     *
     * @return this.
     */
    public LdBlackActionCB setupSelect_BlackList() {
        // For setting outer join.
        query().queryBlackList();

        // Set dummy string that means this foreign entity is target of select.
        _selectBlackList = "dummy";

        limitSelect_Off();
        return this;
    }
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [BLACK_ACTION_LOOKUP]
    //   ForeignProperty = [blackActionLookup]
    // * * * * * * * * */

    /** Mark of select for blackActionLookup */
    protected String _selectBlackActionLookup;
    /**
     * Get mark of select for blackActionLookup.
     * 
     * @return Mark of select. (If null, this foreign entity is out of select.)
     */
    public String getBlackActionLookup_isSelect() {
        return _selectBlackActionLookup;
    }
    /**
     * Set up select for blackActionLookup.
     * If you invoke this, this foreign entity is target of select.
     *
     * @return this.
     */
    public LdBlackActionCB setupSelect_BlackActionLookup() {
        // For setting outer join.
        query().queryBlackActionLookup();

        // Set dummy string that means this foreign entity is target of select.
        _selectBlackActionLookup = "dummy";

        limitSelect_Off();
        return this;
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

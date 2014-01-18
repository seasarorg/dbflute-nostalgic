package dbflute.ldb.cbean;


import dbflute.ldb.allcommon.cbean.LdAbstractConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.allcommon.helper.LdMapListString;
import dbflute.ldb.allcommon.helper.LdMapListStringImpl;

/**
 * The condition-bean of COLLECTION.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionCB extends LdAbstractConditionBean {

    // =====================================================================================
    //                                                                            Annotation
    //                                                                            ==========
    /** TABLE-Annotation */
    public static final String TABLE = "COLLECTION";

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Condition query. */
    protected LdCollectionCQ _conditionQuery;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdCollectionCB() {
    }

    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   MyTable = [COLLECTION]
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
        return "COLLECTION";
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
  
        if (!primaryKeyMap.containsKey("COLLECTION_ID")) {
            String msg = "The primaryKeyMap must have the value of COLLECTION_ID";
            throw new IllegalStateException(msg + ": primaryKeyMap --> " + primaryKeyMap);
        }
        {
            Object obj = primaryKeyMap.get("COLLECTION_ID");
            if (obj instanceof java.math.BigDecimal) {
                query().setCollectionId_Equal((java.math.BigDecimal)obj);
            } else {
                if (!(obj instanceof String)) {
                    String msg = "The value should be java.math.BigDecimal or String: ";
                    msg = msg + "valueType=" + (obj != null ? obj.getClass() : null) + " value=" + obj;
                    throw new IllegalArgumentException(msg);
                }
                  
                String value = (String)obj;
                if (value != null) {
                    try {
                        query().setCollectionId_Equal(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "query().setCollectionId_Equal(new java.math.BigDecimal(value))";
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
  
        query().addOrderBy_CollectionId_Asc();
  
        return this;

    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return this. (NotNull)
     */
    public LdConditionBean addOrderBy_PK_Desc() {
  
        query().addOrderBy_CollectionId_Desc();
  
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
    public LdCollectionCQ query() {
        return getConditionQuery();
    }

    /**
     * Get condition query. {Internal method for s2dao}
     * 
     * @return Instance of condition query. (NotNull)
     */
    public LdCollectionCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdCollectionCQ(null, getSqlClause(), getTableDbName(), 0);
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
    //   ForeignTable    = [LIBRARY]
    //   ForeignProperty = [library]
    // * * * * * * * * */

    /** Mark of select for library */
    protected String _selectLibrary;
    /**
     * Get mark of select for library.
     * 
     * @return Mark of select. (If null, this foreign entity is out of select.)
     */
    public String getLibrary_isSelect() {
        return _selectLibrary;
    }
    /**
     * Set up select for library.
     * If you invoke this, this foreign entity is target of select.
     *
     * @return this.
     */
    public LdCollectionCB setupSelect_Library() {
        // For setting outer join.
        query().queryLibrary();

        // Set dummy string that means this foreign entity is target of select.
        _selectLibrary = "dummy";

        limitSelect_Off();
        return this;
    }
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [BOOK]
    //   ForeignProperty = [book]
    // * * * * * * * * */

    /** Mark of select for book */
    protected String _selectBook;
    /**
     * Get mark of select for book.
     * 
     * @return Mark of select. (If null, this foreign entity is out of select.)
     */
    public String getBook_isSelect() {
        return _selectBook;
    }
    /**
     * Set up select for book.
     * If you invoke this, this foreign entity is target of select.
     *
     * @return this.
     */
    public LdCollectionCB setupSelect_Book() {
        // For setting outer join.
        query().queryBook();

        // Set dummy string that means this foreign entity is target of select.
        _selectBook = "dummy";

        limitSelect_Off();
        return this;
    }
  
      
    // /* * * * * * * * * * * * * * * * * * * * * * * {as one}
    //   RefferTable    = [COLLECTION_STATUS]
    //   RefferProperty = [collectionStatusAsOne]
    // * * * * * * * * */

    /** Mark of select for collectionStatusAsOne */
    protected String _selectCollectionStatusAsOne;
    /**
     * Get mark of select for collectionStatusAsOne.
     * 
     * @return Mark of select. (If null, this refferer entity is out of select.)
     */
    public String getCollectionStatusAsOne_isSelect() {
        return _selectCollectionStatusAsOne;
    }
    /**
     * Set up select for collectionStatusAsOne.
     * If you invoke this, this refferer entity is target of select.
     *
     * @return this.
     */
    public LdCollectionCB setupSelect_CollectionStatusAsOne() {
        // For setting outer join.
        query().queryCollectionStatusAsOne();

        // Set dummy string that means this refferer entity is target of select.
        _selectCollectionStatusAsOne = "dummy";

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


package dbflute.ldb.bsentity;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdGarbageDbm;

import dbflute.ldb.allcommon.helper.LdMapListString;
import dbflute.ldb.allcommon.helper.LdMapListStringImpl;


/**
 * The entity of GARBAGE.
 * 
 * <pre>
 * [primary-key]
 *     
 * 
 * [column-property]
 *     GARBAGE_MEMO, GARBAGE_TIME
 * 
 * [foreign-property]
 *     
 * 
 * [refferer-property]
 *     
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [update-date]
 *     
 * 
 * [version-no]
 *     
 * 
 * </pre>
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsGarbage implements LdEntity, java.io.Serializable {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao */
    public static final String TABLE = "GARBAGE";


    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    
    /** The value of garbageMemo. */
    protected String _garbageMemo;

    /** Has the setter of garbageMemo been invoked? */
    protected boolean _isSetterInvokedGarbageMemo;
    
    /** The value of garbageTime. */
    protected java.sql.Timestamp _garbageTime;

    /** Has the setter of garbageTime been invoked? */
    protected boolean _isSetterInvokedGarbageTime;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBsGarbage() {
    }

    // =====================================================================================
    //                                                                                DBMeta
    //                                                                                ======
    /**
     * This method implements the method that is declared at super.
     * 
     * @return DBMeta. (NotNull)
     */
    public LdDBMeta getDBMeta() {
        return LdGarbageDbm.getInstance();
    }

    // =====================================================================================
    //                                                                            Table Name
    //                                                                            ==========
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Table db-name. (NotNull)
     */
    public String getTableDbName() {
        return getDBMeta().getTableDbName();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Table cap-prop-name. (NotNull)
     */
    public String getTableCapPropName() {
        return getDBMeta().getTableCapPropName();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Table uncap-prop-name. (NotNull)
     */
    public String getTableUncapPropName() {
        return getDBMeta().getTableUncapPropName();
    }

    // =====================================================================================
    //                                                                         Getter Setter
    //                                                                         =============

    /**
     * Get the value of garbageMemo.
     * 
     * @return The value of garbageMemo. (Nullable)
     */
    public String getGarbageMemo() {
        return _garbageMemo;
    }

    /**
     * Set the value of garbageMemo.
     * 
     * @param v The value of garbageMemo. (Nullable)
     */
    public void setGarbageMemo(String v) {
        _isSetterInvokedGarbageMemo = true;
        _garbageMemo = v;
    }

    /**
     * Get the value of garbageTime.
     * 
     * @return The value of garbageTime. (Nullable)
     */
    public java.sql.Timestamp getGarbageTime() {
        return _garbageTime;
    }

    /**
     * Set the value of garbageTime.
     * 
     * @param v The value of garbageTime. (Nullable)
     */
    public void setGarbageTime(java.sql.Timestamp v) {
        _isSetterInvokedGarbageTime = true;
        _garbageTime = v;
    }

    // =====================================================================================
    //                                                                Invoking Determination
    //                                                                ======================

    /**
     * Has the setter of garbageMemo been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedGarbageMemo() {
        return _isSetterInvokedGarbageMemo;
    }

    /**
     * Has the setter of garbageTime been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedGarbageTime() {
        return _isSetterInvokedGarbageTime;
    }

    // =====================================================================================
    //                                                                       Classify Method
    //                                                                       ===============
    
    // =====================================================================================
    //                                                                 Classification Getter
    //                                                                 =====================
    
    // =====================================================================================
    //                                                          Classification Determination
    //                                                          ============================
    
    // =====================================================================================
    //                                                                         Foreign Table
    //                                                                         =============

    // =====================================================================================
    //                                                                        Refferer Table
    //                                                                        ==============

    // =====================================================================================
    //                                                                                Accept
    //                                                                                ======
    /**
     * This method implements the method that is declared at super.
     * 
     * @param primaryKeyMap Primary key map. (NotNull and NotEmpty)
     * @return Instance of query. (NotNull)
     */
    public LdEntity acceptPrimaryKeyMap(java.util.Map<String, ? extends Object> primaryKeyMap) {
        if (primaryKeyMap == null) {
            String msg = "The argument[primaryKeyMap] should not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (primaryKeyMap.isEmpty()) {
            String msg = "The argument[primaryKeyMap] should not be empty.";
            throw new IllegalArgumentException(msg);
        }

        return acceptColumnValueMap(primaryKeyMap);

    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull and NotEmpty)
     * @return this. (NotNull)
     */
    public LdEntity acceptPrimaryKeyMapString(String primaryKeyMapString) {
        if (primaryKeyMapString == null) {
            String msg = "The argument[primaryKeyMapString] should not be null.";
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
        mapListString.setStartBrace(MAP_STRING_START_BRACE);
        mapListString.setEndBrace(MAP_STRING_END_BRACE);
        mapListString.setEqual(MAP_STRING_EQUAL);
        mapListString.setDelimiter(MAP_STRING_DELIMITER);
        return acceptPrimaryKeyMap(mapListString.generateMap(primaryKeyMapString));
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param columnValueMap Column-value map. (NotNull and NotEmpty)
     * @return Instance of query. (NotNull)
     */
    public LdEntity acceptColumnValueMap(java.util.Map<String, ? extends Object> columnValueMap) {
        if (columnValueMap == null) {
            String msg = "The argument[columnValueMap] should not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (columnValueMap.isEmpty()) {
            String msg = "The argument[columnValueMap] should not be empty.";
            throw new IllegalArgumentException(msg);
        }
  
        {
            final Object obj = columnValueMap.get("GARBAGE_MEMO");
            if (obj == null) {
                setGarbageMemo(null);
            } else {
                if (obj instanceof String) {
                    setGarbageMemo((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setGarbageMemo((String)obj);
    
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("GARBAGE_TIME");
            if (obj == null) {
                setGarbageTime(null);
            } else {
                if (obj instanceof java.sql.Timestamp) {
                    setGarbageTime((java.sql.Timestamp)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.sql.Timestamp or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
          
                    final String value = (String)obj;
                    try {
                        setGarbageTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value));
                    } catch (java.text.ParseException e) {
                        String msg = "setGarbageTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    } catch (RuntimeException e) {
                        String msg = "setGarbageTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value))";
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
     * @param columnValueMapString Column-value map-string. (NotNull and NotEmpty)
     * @return this. (NotNull)
     */
    public LdEntity acceptColumnValueMapString(String columnValueMapString) {
        if (columnValueMapString == null) {
            String msg = "The argument[columnValueMapString] should not be null.";
            throw new IllegalArgumentException(msg);
        }
        final String prefix = MAP_STRING_MAP_MARK + MAP_STRING_START_BRACE;
        final String suffix = MAP_STRING_END_BRACE;
        if (!columnValueMapString.trim().startsWith(prefix)) {
            columnValueMapString = prefix + columnValueMapString;
        }
        if (!columnValueMapString.trim().endsWith(suffix)) {
            columnValueMapString = columnValueMapString + suffix;
        }
        LdMapListString mapListString = new LdMapListStringImpl();
        mapListString.setMapMark(MAP_STRING_MAP_MARK);
        mapListString.setListMark(MAP_STRING_LIST_MARK);
        mapListString.setStartBrace(MAP_STRING_START_BRACE);
        mapListString.setEndBrace(MAP_STRING_END_BRACE);
        mapListString.setEqual(MAP_STRING_EQUAL);
        mapListString.setDelimiter(MAP_STRING_DELIMITER);
        return acceptColumnValueMap(mapListString.generateMap(columnValueMapString));
    }

    // =====================================================================================
    //                                                                               Extract
    //                                                                               =======
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Primary-key map-string. (NotNull)
     */
    public String extractPrimaryKeyMapString() {
        final String startBrace = MAP_STRING_START_BRACE;
        final String endBrace = MAP_STRING_END_BRACE;
        final String delimiter = MAP_STRING_DELIMITER;
        final String equal = MAP_STRING_EQUAL;
        return extractPrimaryKeyMapString(startBrace, endBrace, delimiter, equal);
    }

    /**
     * Extract primary-key map-string.
     * 
     * @param startBrace Start-brace. (NotNull)
     * @param endBrace End-brace. (NotNull)
     * @param delimiter Delimiter. (NotNull)
     * @param equal Equal. (NotNull)
     * @return Primary-key map-string. (NotNull)
     */
    public String extractPrimaryKeyMapString(String startBrace, String endBrace, String delimiter, String equal) {

        return extractColumnValueMapString(startBrace, endBrace, delimiter, equal);

    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Column-value map-string. (NotNull)
     */
    public String extractColumnValueMapString() {
        final String startBrace = MAP_STRING_START_BRACE;
        final String endBrace = MAP_STRING_END_BRACE;
        final String delimiter = MAP_STRING_DELIMITER;
        final String equal = MAP_STRING_EQUAL;
        return extractColumnValueMapString(startBrace, endBrace, delimiter, equal);
    }

    /**
     * Extract column-value map-string.
     * 
     * @param startBrace Start-brace. (NotNull)
     * @param endBrace End-brace. (NotNull)
     * @param delimiter Delimiter. (NotNull)
     * @param equal Equal. (NotNull)
     * @return Column-value map-string. (NotNull)
     */
    public String extractColumnValueMapString(String startBrace, String endBrace, String delimiter, String equal) {
        final String mapMarkAndStartBrace = MAP_STRING_MAP_MARK + startBrace;
        final StringBuffer sb = new StringBuffer();

    
        sb.append(delimiter).append("GARBAGE_MEMO").append(equal);
        sb.append((_garbageMemo != null ? _garbageMemo.toString() : ""));
        
        sb.append(delimiter).append("GARBAGE_TIME").append(equal);
        sb.append((_garbageTime != null ? java.text.DateFormat.getDateTimeInstance().format(_garbageTime) : ""));
    
        sb.delete(0, delimiter.length()).insert(0, mapMarkAndStartBrace).append(endBrace);
        return sb.toString();
    }


    // =====================================================================================
    //                                                                         Determination
    //                                                                         =============
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Determination.
     */
    public boolean hasPrimaryKeyValue() {
  
        return true;
    }

    // =====================================================================================
    //                                                                 Basic-Override Method
    //                                                                 =====================
    
    /**
     * This method overrides the method that is declared at super.
     * If the all-column value of the other is same as this one, returns true.
     * 
     * @param other Other entity. (Nullable)
     * @return Comparing result. If other is null, returns false.
     */
    public boolean equals(Object other) {
        if (!(other instanceof LdBsGarbage)) {
            return false;
        }
        if (other == null) {
            return false;
        }
        final String thisMapString = extractColumnValueMapString();
        final String otherMapString = ((LdBsGarbage)other).extractColumnValueMapString();

        return thisMapString.equals(otherMapString);
    }

    /**
     * This method overrides the method that is declared at super.
     * Calculates hash-code from all-columns.
     * 
     * @return Hash-code from all-columns.
     */
    public int hashCode() {
        int result = 0;
  
        if (this.getGarbageMemo() != null) {
            result = result + this.getGarbageMemo().hashCode();
        }
  
        if (this.getGarbageTime() != null) {
            result = result + this.getGarbageTime().hashCode();
        }
  
        return result;
    }

    /**
     * This method overrides the method that is declared at super.
     * 
     * @return Column-value map-string. (NotNull)
     */
    public String toString() {
        final String startBrace = "{";
        final String endBrace = "}";
        final String delimiter = ";";
        final String equal = "=";
        final String primaryKeyMapString = extractPrimaryKeyMapString(startBrace, endBrace, delimiter, equal);
        final String columnValueMapString = extractColumnValueMapString(startBrace, endBrace, delimiter, equal);
        return "[PK] " + primaryKeyMapString + " [ALL] " + columnValueMapString;
    }
}

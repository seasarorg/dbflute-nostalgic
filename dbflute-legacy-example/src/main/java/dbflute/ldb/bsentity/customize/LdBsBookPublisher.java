
package dbflute.ldb.bsentity.customize;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.customize.dbmeta.LdBookPublisherDbm;

import dbflute.ldb.allcommon.helper.LdMapListString;
import dbflute.ldb.allcommon.helper.LdMapListStringImpl;


/**
 * The entity of BOOK_PUBLISHER.
 * 
 * <pre>
 * [primary-key]
 *     BOOK_ID
 * 
 * [column-property]
 *     BOOK_ID, BOOK_NAME, PUBLISHER_NAME
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
public abstract class LdBsBookPublisher implements LdEntity, java.io.Serializable {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao */
    public static final String TABLE = "BOOK";


    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    
    /** The value of bookId. */
    protected String _bookId;

    /** Has the setter of bookId been invoked? */
    protected boolean _isSetterInvokedBookId;
    
    /** The value of bookName. */
    protected String _bookName;

    /** Has the setter of bookName been invoked? */
    protected boolean _isSetterInvokedBookName;
    
    /** The value of publisherName. */
    protected String _publisherName;

    /** Has the setter of publisherName been invoked? */
    protected boolean _isSetterInvokedPublisherName;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBsBookPublisher() {
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
        return LdBookPublisherDbm.getInstance();
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
     * Get the value of bookId.
     * 
     * @return The value of bookId. (Nullable)
     */
    public String getBookId() {
        return _bookId;
    }

    /**
     * Set the value of bookId.
     * 
     * @param v The value of bookId. (Nullable)
     */
    public void setBookId(String v) {
        _isSetterInvokedBookId = true;
        _bookId = v;
    }

    /**
     * Get the value of bookName.
     * 
     * @return The value of bookName. (Nullable)
     */
    public String getBookName() {
        return _bookName;
    }

    /**
     * Set the value of bookName.
     * 
     * @param v The value of bookName. (Nullable)
     */
    public void setBookName(String v) {
        _isSetterInvokedBookName = true;
        _bookName = v;
    }

    /**
     * Get the value of publisherName.
     * 
     * @return The value of publisherName. (Nullable)
     */
    public String getPublisherName() {
        return _publisherName;
    }

    /**
     * Set the value of publisherName.
     * 
     * @param v The value of publisherName. (Nullable)
     */
    public void setPublisherName(String v) {
        _isSetterInvokedPublisherName = true;
        _publisherName = v;
    }

    // =====================================================================================
    //                                                                Invoking Determination
    //                                                                ======================

    /**
     * Has the setter of bookId been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedBookId() {
        return _isSetterInvokedBookId;
    }

    /**
     * Has the setter of bookName been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedBookName() {
        return _isSetterInvokedBookName;
    }

    /**
     * Has the setter of publisherName been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedPublisherName() {
        return _isSetterInvokedPublisherName;
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
  
        if (!primaryKeyMap.containsKey("BOOK_ID")) {
            String msg = "The primaryKeyMap must have the value of BOOK_ID";
            throw new IllegalStateException(msg + ": primaryKeyMap --> " + primaryKeyMap);
        }
        {
            final Object obj = primaryKeyMap.get("BOOK_ID");
            if (obj == null) {
                setBookId(null);
            } else {
                if (obj instanceof String) {
                    setBookId((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setBookId((String)obj);
    
                }
            }
        }
  
        return this;

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
            final Object obj = columnValueMap.get("BOOK_ID");
            if (obj == null) {
                setBookId(null);
            } else {
                if (obj instanceof String) {
                    setBookId((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setBookId((String)obj);
    
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("BOOK_NAME");
            if (obj == null) {
                setBookName(null);
            } else {
                if (obj instanceof String) {
                    setBookName((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setBookName((String)obj);
    
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("PUBLISHER_NAME");
            if (obj == null) {
                setPublisherName(null);
            } else {
                if (obj instanceof String) {
                    setPublisherName((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setPublisherName((String)obj);
    
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

        final String mapMarkAndStartBrace = MAP_STRING_MAP_MARK + startBrace;
        final StringBuffer sb = new StringBuffer();

      
        sb.append(delimiter).append("BOOK_ID").append(equal);
        sb.append((_bookId != null ? _bookId.toString() : ""));
      
        sb.delete(0, delimiter.length()).insert(0, mapMarkAndStartBrace).append(endBrace);
        return sb.toString();

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

    
        sb.append(delimiter).append("BOOK_ID").append(equal);
        sb.append((_bookId != null ? _bookId.toString() : ""));
        
        sb.append(delimiter).append("BOOK_NAME").append(equal);
        sb.append((_bookName != null ? _bookName.toString() : ""));
        
        sb.append(delimiter).append("PUBLISHER_NAME").append(equal);
        sb.append((_publisherName != null ? _publisherName.toString() : ""));
    
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
  
        if (_bookId == null) {
            return false;
        }
  
        return true;
    }

    // =====================================================================================
    //                                                                 Basic-Override Method
    //                                                                 =====================
    
    /**
     * This method overrides the method that is declared at super.
     * If the primary-key of the other is same as this one, returns true.
     * 
     * @param other Other entity.
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (!(other instanceof LdBsBookPublisher)) {
            return false;
        }
        if (other == null) {
            return false;
        }
        final String thisMapString = extractPrimaryKeyMapString();
        final String otherMapString = ((LdBsBookPublisher)other).extractPrimaryKeyMapString();

        return thisMapString.equals(otherMapString);
    }

    /**
     * This method overrides the method that is declared at super.
     * Calculates hash-code from primary-key.
     * 
     * @return Hash-code from primary-keys.
     */
    public int hashCode() {
        int result = 0;
  
        if (this.getBookId() != null) {
            result = result + this.getBookId().hashCode();
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

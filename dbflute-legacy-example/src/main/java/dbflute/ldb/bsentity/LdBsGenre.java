
package dbflute.ldb.bsentity;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdGenreDbm;

import dbflute.ldb.allcommon.helper.LdMapListString;
import dbflute.ldb.allcommon.helper.LdMapListStringImpl;


import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;

/**
 * The entity of GENRE.
 * 
 * <pre>
 * [primary-key]
 *     GENRE_CODE
 * 
 * [column-property]
 *     GENRE_CODE, GENRE_NAME, PARENT_GENRE_CODE, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     genreSelf
 * 
 * [refferer-property]
 *     bookList, genreSelfList
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [update-date]
 *     UTime
 * 
 * [version-no]
 *     
 * 
 * </pre>
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsGenre implements LdEntityDefinedCommonColumn, java.io.Serializable {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao */
    public static final String TABLE = "GENRE";

    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "uTime";

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    
    /** The value of genreCode. */
    protected String _genreCode;

    /** Has the setter of genreCode been invoked? */
    protected boolean _isSetterInvokedGenreCode;
    
    /** The value of genreName. */
    protected String _genreName;

    /** Has the setter of genreName been invoked? */
    protected boolean _isSetterInvokedGenreName;
    
    /** The value of parentGenreCode. */
    protected String _parentGenreCode;

    /** Has the setter of parentGenreCode been invoked? */
    protected boolean _isSetterInvokedParentGenreCode;
    
    /** The value of rTime. */
    protected java.sql.Timestamp _rTime;

    /** Has the setter of rTime been invoked? */
    protected boolean _isSetterInvokedRTime;
    
    /** The value of uTime. */
    protected java.sql.Timestamp _uTime;

    /** Has the setter of uTime been invoked? */
    protected boolean _isSetterInvokedUTime;
    
    /** The value of rStaff. */
    protected String _rStaff;

    /** Has the setter of rStaff been invoked? */
    protected boolean _isSetterInvokedRStaff;
    
    /** The value of uStaff. */
    protected String _uStaff;

    /** Has the setter of uStaff been invoked? */
    protected boolean _isSetterInvokedUStaff;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBsGenre() {
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
        return LdGenreDbm.getInstance();
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
     * Get the value of genreCode.
     * 
     * @return The value of genreCode. (Nullable)
     */
    public String getGenreCode() {
        return _genreCode;
    }

    /**
     * Set the value of genreCode.
     * 
     * @param v The value of genreCode. (Nullable)
     */
    public void setGenreCode(String v) {
        _isSetterInvokedGenreCode = true;
        _genreCode = v;
    }

    /**
     * Get the value of genreName.
     * 
     * @return The value of genreName. (Nullable)
     */
    public String getGenreName() {
        return _genreName;
    }

    /**
     * Set the value of genreName.
     * 
     * @param v The value of genreName. (Nullable)
     */
    public void setGenreName(String v) {
        _isSetterInvokedGenreName = true;
        _genreName = v;
    }

    /**
     * Get the value of parentGenreCode.
     * 
     * @return The value of parentGenreCode. (Nullable)
     */
    public String getParentGenreCode() {
        return _parentGenreCode;
    }

    /**
     * Set the value of parentGenreCode.
     * 
     * @param v The value of parentGenreCode. (Nullable)
     */
    public void setParentGenreCode(String v) {
        _isSetterInvokedParentGenreCode = true;
        _parentGenreCode = v;
    }

    /**
     * Get the value of rTime.
     * 
     * @return The value of rTime. (Nullable)
     */
    public java.sql.Timestamp getRTime() {
        return _rTime;
    }

    /**
     * Set the value of rTime.
     * 
     * @param v The value of rTime. (Nullable)
     */
    public void setRTime(java.sql.Timestamp v) {
        _isSetterInvokedRTime = true;
        _rTime = v;
    }

    /**
     * Get the value of uTime.
     * 
     * @return The value of uTime. (Nullable)
     */
    public java.sql.Timestamp getUTime() {
        return _uTime;
    }

    /**
     * Set the value of uTime.
     * 
     * @param v The value of uTime. (Nullable)
     */
    public void setUTime(java.sql.Timestamp v) {
        _isSetterInvokedUTime = true;
        _uTime = v;
    }

    /**
     * Get the value of rStaff.
     * 
     * @return The value of rStaff. (Nullable)
     */
    public String getRStaff() {
        return _rStaff;
    }

    /**
     * Set the value of rStaff.
     * 
     * @param v The value of rStaff. (Nullable)
     */
    public void setRStaff(String v) {
        _isSetterInvokedRStaff = true;
        _rStaff = v;
    }

    /**
     * Get the value of uStaff.
     * 
     * @return The value of uStaff. (Nullable)
     */
    public String getUStaff() {
        return _uStaff;
    }

    /**
     * Set the value of uStaff.
     * 
     * @param v The value of uStaff. (Nullable)
     */
    public void setUStaff(String v) {
        _isSetterInvokedUStaff = true;
        _uStaff = v;
    }

    // =====================================================================================
    //                                                                Invoking Determination
    //                                                                ======================

    /**
     * Has the setter of genreCode been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedGenreCode() {
        return _isSetterInvokedGenreCode;
    }

    /**
     * Has the setter of genreName been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedGenreName() {
        return _isSetterInvokedGenreName;
    }

    /**
     * Has the setter of parentGenreCode been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedParentGenreCode() {
        return _isSetterInvokedParentGenreCode;
    }

    /**
     * Has the setter of rTime been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedRTime() {
        return _isSetterInvokedRTime;
    }

    /**
     * Has the setter of uTime been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedUTime() {
        return _isSetterInvokedUTime;
    }

    /**
     * Has the setter of rStaff been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedRStaff() {
        return _isSetterInvokedRStaff;
    }

    /**
     * Has the setter of uStaff been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedUStaff() {
        return _isSetterInvokedUStaff;
    }

    // =====================================================================================
    //                                                                       Classify Method
    //                                                                       ===============
                
    /**
     * Classify the value of rStaff as Administrator.
     */
    public void classifyRStaffAdministrator() {
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_Administrator;
        setRStaff(new String(code));
    }
    
    /**
     * Classify the value of rStaff as User.
     */
    public void classifyRStaffUser() {
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_User;
        setRStaff(new String(code));
    }
    
    /**
     * Classify the value of rStaff as UtterStranger.
     */
    public void classifyRStaffUtterStranger() {
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_UtterStranger;
        setRStaff(new String(code));
    }
            
    /**
     * Classify the value of uStaff as Administrator.
     */
    public void classifyUStaffAdministrator() {
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_Administrator;
        setUStaff(new String(code));
    }
    
    /**
     * Classify the value of uStaff as User.
     */
    public void classifyUStaffUser() {
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_User;
        setUStaff(new String(code));
    }
    
    /**
     * Classify the value of uStaff as UtterStranger.
     */
    public void classifyUStaffUtterStranger() {
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_UtterStranger;
        setUStaff(new String(code));
    }
      
    // =====================================================================================
    //                                                                 Classification Getter
    //                                                                 =====================
            
    /**
     * Get the value of rStaff as classification-name.
     * 
     * @return The value of rStaff as classification-name. (Nullable)
     */
    public String getRStaffName() {
        if (_rStaff == null) {
            return null;
        }
        final java.util.Map<String, String> map = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_NAME_MAP_Staff;
        return (String)map.get(_rStaff.toString());
    }

    /**
     * Get the value of rStaff as classification-alias.
     * 
     * @return The value of rStaff as classification-alias. (Nullable)
     */
    public String getRStaffAlias() {
        if (_rStaff == null) {
            return null;
        }
        final java.util.Map<String, String> map = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_ALIAS_MAP_Staff;
        return (String)map.get(_rStaff.toString());
    }
    
    /**
     * Get the value of uStaff as classification-name.
     * 
     * @return The value of uStaff as classification-name. (Nullable)
     */
    public String getUStaffName() {
        if (_uStaff == null) {
            return null;
        }
        final java.util.Map<String, String> map = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_NAME_MAP_Staff;
        return (String)map.get(_uStaff.toString());
    }

    /**
     * Get the value of uStaff as classification-alias.
     * 
     * @return The value of uStaff as classification-alias. (Nullable)
     */
    public String getUStaffAlias() {
        if (_uStaff == null) {
            return null;
        }
        final java.util.Map<String, String> map = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_ALIAS_MAP_Staff;
        return (String)map.get(_uStaff.toString());
    }
  
    // =====================================================================================
    //                                                          Classification Determination
    //                                                          ============================
                
    /**
     * Is the value of rStaff 'Administrator'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isRStaffAdministrator() {
        if (_rStaff == null) {
            return false;
        }
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_Administrator;
        return code.equalsIgnoreCase(_rStaff.toString());
    }

    /**
     * Is the value of rStaff 'Administrator'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isRStaffAdministratorIfNullException() {
        if (_rStaff == null) {
            String msg = "If the value of rStaff is null, this method throws exception!";
            throw new IllegalStateException(msg + " rStaff=" + _rStaff);
        }
        return isRStaffAdministrator();
    }
    
    /**
     * Is the value of rStaff 'User'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isRStaffUser() {
        if (_rStaff == null) {
            return false;
        }
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_User;
        return code.equalsIgnoreCase(_rStaff.toString());
    }

    /**
     * Is the value of rStaff 'User'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isRStaffUserIfNullException() {
        if (_rStaff == null) {
            String msg = "If the value of rStaff is null, this method throws exception!";
            throw new IllegalStateException(msg + " rStaff=" + _rStaff);
        }
        return isRStaffUser();
    }
    
    /**
     * Is the value of rStaff 'UtterStranger'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isRStaffUtterStranger() {
        if (_rStaff == null) {
            return false;
        }
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_UtterStranger;
        return code.equalsIgnoreCase(_rStaff.toString());
    }

    /**
     * Is the value of rStaff 'UtterStranger'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isRStaffUtterStrangerIfNullException() {
        if (_rStaff == null) {
            String msg = "If the value of rStaff is null, this method throws exception!";
            throw new IllegalStateException(msg + " rStaff=" + _rStaff);
        }
        return isRStaffUtterStranger();
    }
            
    /**
     * Is the value of uStaff 'Administrator'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isUStaffAdministrator() {
        if (_uStaff == null) {
            return false;
        }
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_Administrator;
        return code.equalsIgnoreCase(_uStaff.toString());
    }

    /**
     * Is the value of uStaff 'Administrator'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isUStaffAdministratorIfNullException() {
        if (_uStaff == null) {
            String msg = "If the value of uStaff is null, this method throws exception!";
            throw new IllegalStateException(msg + " uStaff=" + _uStaff);
        }
        return isUStaffAdministrator();
    }
    
    /**
     * Is the value of uStaff 'User'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isUStaffUser() {
        if (_uStaff == null) {
            return false;
        }
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_User;
        return code.equalsIgnoreCase(_uStaff.toString());
    }

    /**
     * Is the value of uStaff 'User'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isUStaffUserIfNullException() {
        if (_uStaff == null) {
            String msg = "If the value of uStaff is null, this method throws exception!";
            throw new IllegalStateException(msg + " uStaff=" + _uStaff);
        }
        return isUStaffUser();
    }
    
    /**
     * Is the value of uStaff 'UtterStranger'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isUStaffUtterStranger() {
        if (_uStaff == null) {
            return false;
        }
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_UtterStranger;
        return code.equalsIgnoreCase(_uStaff.toString());
    }

    /**
     * Is the value of uStaff 'UtterStranger'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isUStaffUtterStrangerIfNullException() {
        if (_uStaff == null) {
            String msg = "If the value of uStaff is null, this method throws exception!";
            throw new IllegalStateException(msg + " uStaff=" + _uStaff);
        }
        return isUStaffUtterStranger();
    }
      
    // =====================================================================================
    //                                                                         Foreign Table
    //                                                                         =============

    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [GENRE]
    //   ForeignProperty = [genreSelf]
    // * * * * * * * * */

    /** RELNO of foreign table for s2dao. */
    public static final int genreSelf_RELNO = 0;

    /** RELKEYS of foreign table for s2dao. */
    public static final String genreSelf_RELKEYS = "PARENT_GENRE_CODE:GENRE_CODE";

    /** The entity of foreign table. */
    protected dbflute.ldb.exentity.LdGenre _parentGenreSelf;
  
    /**
     * Get the entity of foreign table without lazyload.
     * 
     * @return The entity of foreign table.
     */
    public dbflute.ldb.exentity.LdGenre getGenreSelf() {
        return _parentGenreSelf;
    }
  
    /**
     * Set the entity of foreign table.
     * 
     * @param v The entity of foreign table.
     */
    public void setGenreSelf(dbflute.ldb.exentity.LdGenre v) {
        _parentGenreSelf = v;
    }
  
    // =====================================================================================
    //                                                                        Refferer Table
    //                                                                        ==============

  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ReffererTable    = [BOOK]
    //   ReffererProperty = [bookList]
    // * * * * * * * * */
  
    /** The list of refferer table. */
    protected java.util.List<dbflute.ldb.exentity.LdBook> _childrenBookList;
  
    /**
     * Get the list of refferer table without lazyload.
     * If it's not loaded yet, returns null.
     * 
     * @return The list of refferer table. (Nullable)
     */
    public java.util.List<dbflute.ldb.exentity.LdBook> getBookList() {
        return _childrenBookList;
    }

    /**
     * Set the list of refferer table.
     * 
     * @param value The list of refferer table. (Nullable)
     */
    public void setBookList(java.util.List<dbflute.ldb.exentity.LdBook> value) {
        _childrenBookList = value;
    }
      
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ReffererTable    = [GENRE]
    //   ReffererProperty = [genreSelfList]
    // * * * * * * * * */
  
    /** The list of refferer table. */
    protected java.util.List<dbflute.ldb.exentity.LdGenre> _childrenGenreSelfList;
  
    /**
     * Get the list of refferer table without lazyload.
     * If it's not loaded yet, returns null.
     * 
     * @return The list of refferer table. (Nullable)
     */
    public java.util.List<dbflute.ldb.exentity.LdGenre> getGenreSelfList() {
        return _childrenGenreSelfList;
    }

    /**
     * Set the list of refferer table.
     * 
     * @param value The list of refferer table. (Nullable)
     */
    public void setGenreSelfList(java.util.List<dbflute.ldb.exentity.LdGenre> value) {
        _childrenGenreSelfList = value;
    }
      
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
  
        if (!primaryKeyMap.containsKey("GENRE_CODE")) {
            String msg = "The primaryKeyMap must have the value of GENRE_CODE";
            throw new IllegalStateException(msg + ": primaryKeyMap --> " + primaryKeyMap);
        }
        {
            final Object obj = primaryKeyMap.get("GENRE_CODE");
            if (obj == null) {
                setGenreCode(null);
            } else {
                if (obj instanceof String) {
                    setGenreCode((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setGenreCode((String)obj);
    
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
            final Object obj = columnValueMap.get("GENRE_CODE");
            if (obj == null) {
                setGenreCode(null);
            } else {
                if (obj instanceof String) {
                    setGenreCode((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setGenreCode((String)obj);
    
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("GENRE_NAME");
            if (obj == null) {
                setGenreName(null);
            } else {
                if (obj instanceof String) {
                    setGenreName((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setGenreName((String)obj);
    
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("PARENT_GENRE_CODE");
            if (obj == null) {
                setParentGenreCode(null);
            } else {
                if (obj instanceof String) {
                    setParentGenreCode((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setParentGenreCode((String)obj);
    
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("R_TIME");
            if (obj == null) {
                setRTime(null);
            } else {
                if (obj instanceof java.sql.Timestamp) {
                    setRTime((java.sql.Timestamp)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.sql.Timestamp or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
          
                    final String value = (String)obj;
                    try {
                        setRTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value));
                    } catch (java.text.ParseException e) {
                        String msg = "setRTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    } catch (RuntimeException e) {
                        String msg = "setRTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
          
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("U_TIME");
            if (obj == null) {
                setUTime(null);
            } else {
                if (obj instanceof java.sql.Timestamp) {
                    setUTime((java.sql.Timestamp)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.sql.Timestamp or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
          
                    final String value = (String)obj;
                    try {
                        setUTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value));
                    } catch (java.text.ParseException e) {
                        String msg = "setUTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    } catch (RuntimeException e) {
                        String msg = "setUTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
          
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("R_STAFF");
            if (obj == null) {
                setRStaff(null);
            } else {
                if (obj instanceof String) {
                    setRStaff((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setRStaff((String)obj);
    
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("U_STAFF");
            if (obj == null) {
                setUStaff(null);
            } else {
                if (obj instanceof String) {
                    setUStaff((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setUStaff((String)obj);
    
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

      
        sb.append(delimiter).append("GENRE_CODE").append(equal);
        sb.append((_genreCode != null ? _genreCode.toString() : ""));
      
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

    
        sb.append(delimiter).append("GENRE_CODE").append(equal);
        sb.append((_genreCode != null ? _genreCode.toString() : ""));
        
        sb.append(delimiter).append("GENRE_NAME").append(equal);
        sb.append((_genreName != null ? _genreName.toString() : ""));
        
        sb.append(delimiter).append("PARENT_GENRE_CODE").append(equal);
        sb.append((_parentGenreCode != null ? _parentGenreCode.toString() : ""));
        
        sb.append(delimiter).append("R_TIME").append(equal);
        sb.append((_rTime != null ? java.text.DateFormat.getDateTimeInstance().format(_rTime) : ""));
        
        sb.append(delimiter).append("U_TIME").append(equal);
        sb.append((_uTime != null ? java.text.DateFormat.getDateTimeInstance().format(_uTime) : ""));
        
        sb.append(delimiter).append("R_STAFF").append(equal);
        sb.append((_rStaff != null ? _rStaff.toString() : ""));
        
        sb.append(delimiter).append("U_STAFF").append(equal);
        sb.append((_uStaff != null ? _uStaff.toString() : ""));
    
        sb.delete(0, delimiter.length()).insert(0, mapMarkAndStartBrace).append(endBrace);
        return sb.toString();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Column-value map-string. (NotNull)
     */
    public String extractCommonColumnValueMapString() {
        final String startBrace = MAP_STRING_START_BRACE;
        final String endBrace = MAP_STRING_END_BRACE;
        final String delimiter = MAP_STRING_DELIMITER;
        final String equal = MAP_STRING_EQUAL;
        return extractCommonColumnValueMapString(startBrace, endBrace, delimiter, equal);
    }

    /**
     * Extract common-column-value map-string.
     * 
     * @param startBrace Start-brace. (NotNull)
     * @param endBrace End-brace. (NotNull)
     * @param delimiter Delimiter. (NotNull)
     * @param equal Equal. (NotNull)
     * @return Common-column-value map-string. (NotNull)
     */
    public String extractCommonColumnValueMapString(String startBrace, String endBrace, String delimiter, String equal) {
        final String mapMarkAndStartBrace = MAP_STRING_MAP_MARK + startBrace;
        final StringBuffer sb = new StringBuffer();
      
        sb.append(delimiter).append("R_TIME").append(equal);
        sb.append((_rTime != null ? java.text.DateFormat.getDateTimeInstance().format(_rTime) : ""));
          
        sb.append(delimiter).append("U_TIME").append(equal);
        sb.append((_uTime != null ? java.text.DateFormat.getDateTimeInstance().format(_uTime) : ""));
          
        sb.append(delimiter).append("R_STAFF").append(equal);
        sb.append((_rStaff != null ? _rStaff.toString() : ""));
          
        sb.append(delimiter).append("U_STAFF").append(equal);
        sb.append((_uStaff != null ? _uStaff.toString() : ""));
      
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
  
        if (_genreCode == null) {
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
        if (!(other instanceof LdBsGenre)) {
            return false;
        }
        if (other == null) {
            return false;
        }
        final String thisMapString = extractPrimaryKeyMapString();
        final String otherMapString = ((LdBsGenre)other).extractPrimaryKeyMapString();

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
  
        if (this.getGenreCode() != null) {
            result = result + this.getGenreCode().hashCode();
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
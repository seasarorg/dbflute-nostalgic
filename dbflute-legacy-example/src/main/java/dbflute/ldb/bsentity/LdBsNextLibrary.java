
package dbflute.ldb.bsentity;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdNextLibraryDbm;

import dbflute.ldb.allcommon.helper.LdMapListString;
import dbflute.ldb.allcommon.helper.LdMapListStringImpl;


import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;

/**
 * The entity of NEXT_LIBRARY.
 * 
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, NEXT_LIBRARY_ID
 * 
 * [column-property]
 *     LIBRARY_ID, NEXT_LIBRARY_ID, DISTANCE_KM, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     libraryByNextLibraryId, libraryByLibraryId
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
 *     UTime
 * 
 * [version-no]
 *     
 * 
 * </pre>
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsNextLibrary implements LdEntityDefinedCommonColumn, java.io.Serializable {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao */
    public static final String TABLE = "NEXT_LIBRARY";

    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "uTime";

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    
    /** The value of libraryId. */
    protected java.math.BigDecimal _libraryId;

    /** Has the setter of libraryId been invoked? */
    protected boolean _isSetterInvokedLibraryId;
    
    /** The value of nextLibraryId. */
    protected java.math.BigDecimal _nextLibraryId;

    /** Has the setter of nextLibraryId been invoked? */
    protected boolean _isSetterInvokedNextLibraryId;
    
    /** The value of distanceKm. */
    protected java.math.BigDecimal _distanceKm;

    /** Has the setter of distanceKm been invoked? */
    protected boolean _isSetterInvokedDistanceKm;
    
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
    public LdBsNextLibrary() {
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
        return LdNextLibraryDbm.getInstance();
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
     * Get the value of libraryId.
     * 
     * @return The value of libraryId. (Nullable)
     */
    public java.math.BigDecimal getLibraryId() {
        return _libraryId;
    }

    /**
     * Set the value of libraryId.
     * 
     * @param v The value of libraryId. (Nullable)
     */
    public void setLibraryId(java.math.BigDecimal v) {
        _isSetterInvokedLibraryId = true;
        _libraryId = v;
    }

    /**
     * Get the value of nextLibraryId.
     * 
     * @return The value of nextLibraryId. (Nullable)
     */
    public java.math.BigDecimal getNextLibraryId() {
        return _nextLibraryId;
    }

    /**
     * Set the value of nextLibraryId.
     * 
     * @param v The value of nextLibraryId. (Nullable)
     */
    public void setNextLibraryId(java.math.BigDecimal v) {
        _isSetterInvokedNextLibraryId = true;
        _nextLibraryId = v;
    }

    /**
     * Get the value of distanceKm.
     * 
     * @return The value of distanceKm. (Nullable)
     */
    public java.math.BigDecimal getDistanceKm() {
        return _distanceKm;
    }

    /**
     * Set the value of distanceKm.
     * 
     * @param v The value of distanceKm. (Nullable)
     */
    public void setDistanceKm(java.math.BigDecimal v) {
        _isSetterInvokedDistanceKm = true;
        _distanceKm = v;
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
     * Has the setter of libraryId been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedLibraryId() {
        return _isSetterInvokedLibraryId;
    }

    /**
     * Has the setter of nextLibraryId been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedNextLibraryId() {
        return _isSetterInvokedNextLibraryId;
    }

    /**
     * Has the setter of distanceKm been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedDistanceKm() {
        return _isSetterInvokedDistanceKm;
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
    //   ForeignTable    = [LIBRARY]
    //   ForeignProperty = [libraryByNextLibraryId]
    // * * * * * * * * */

    /** RELNO of foreign table for s2dao. */
    public static final int libraryByNextLibraryId_RELNO = 0;

    /** RELKEYS of foreign table for s2dao. */
    public static final String libraryByNextLibraryId_RELKEYS = "NEXT_LIBRARY_ID:LIBRARY_ID";

    /** The entity of foreign table. */
    protected dbflute.ldb.exentity.LdLibrary _parentLibraryByNextLibraryId;
  
    /**
     * Get the entity of foreign table without lazyload.
     * 
     * @return The entity of foreign table.
     */
    public dbflute.ldb.exentity.LdLibrary getLibraryByNextLibraryId() {
        return _parentLibraryByNextLibraryId;
    }
  
    /**
     * Set the entity of foreign table.
     * 
     * @param v The entity of foreign table.
     */
    public void setLibraryByNextLibraryId(dbflute.ldb.exentity.LdLibrary v) {
        _parentLibraryByNextLibraryId = v;
    }
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [LIBRARY]
    //   ForeignProperty = [libraryByLibraryId]
    // * * * * * * * * */

    /** RELNO of foreign table for s2dao. */
    public static final int libraryByLibraryId_RELNO = 1;

    /** RELKEYS of foreign table for s2dao. */
    public static final String libraryByLibraryId_RELKEYS = "LIBRARY_ID:LIBRARY_ID";

    /** The entity of foreign table. */
    protected dbflute.ldb.exentity.LdLibrary _parentLibraryByLibraryId;
  
    /**
     * Get the entity of foreign table without lazyload.
     * 
     * @return The entity of foreign table.
     */
    public dbflute.ldb.exentity.LdLibrary getLibraryByLibraryId() {
        return _parentLibraryByLibraryId;
    }
  
    /**
     * Set the entity of foreign table.
     * 
     * @param v The entity of foreign table.
     */
    public void setLibraryByLibraryId(dbflute.ldb.exentity.LdLibrary v) {
        _parentLibraryByLibraryId = v;
    }
  
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
  
        if (!primaryKeyMap.containsKey("LIBRARY_ID")) {
            String msg = "The primaryKeyMap must have the value of LIBRARY_ID";
            throw new IllegalStateException(msg + ": primaryKeyMap --> " + primaryKeyMap);
        }
        {
            final Object obj = primaryKeyMap.get("LIBRARY_ID");
            if (obj == null) {
                setLibraryId(null);
            } else {
                if (obj instanceof java.math.BigDecimal) {
                    setLibraryId((java.math.BigDecimal)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.math.BigDecimal or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    final String value = (String)obj;
                    try {
                        setLibraryId(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "setLibraryId(new java.math.BigDecimal(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
                  
                }
            }
        }
  
        if (!primaryKeyMap.containsKey("NEXT_LIBRARY_ID")) {
            String msg = "The primaryKeyMap must have the value of NEXT_LIBRARY_ID";
            throw new IllegalStateException(msg + ": primaryKeyMap --> " + primaryKeyMap);
        }
        {
            final Object obj = primaryKeyMap.get("NEXT_LIBRARY_ID");
            if (obj == null) {
                setNextLibraryId(null);
            } else {
                if (obj instanceof java.math.BigDecimal) {
                    setNextLibraryId((java.math.BigDecimal)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.math.BigDecimal or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    final String value = (String)obj;
                    try {
                        setNextLibraryId(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "setNextLibraryId(new java.math.BigDecimal(value))";
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
            final Object obj = columnValueMap.get("LIBRARY_ID");
            if (obj == null) {
                setLibraryId(null);
            } else {
                if (obj instanceof java.math.BigDecimal) {
                    setLibraryId((java.math.BigDecimal)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.math.BigDecimal or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    final String value = (String)obj;
                    try {
                        setLibraryId(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "setLibraryId(new java.math.BigDecimal(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
                  
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("NEXT_LIBRARY_ID");
            if (obj == null) {
                setNextLibraryId(null);
            } else {
                if (obj instanceof java.math.BigDecimal) {
                    setNextLibraryId((java.math.BigDecimal)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.math.BigDecimal or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    final String value = (String)obj;
                    try {
                        setNextLibraryId(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "setNextLibraryId(new java.math.BigDecimal(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
                  
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("DISTANCE_KM");
            if (obj == null) {
                setDistanceKm(null);
            } else {
                if (obj instanceof java.math.BigDecimal) {
                    setDistanceKm((java.math.BigDecimal)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.math.BigDecimal or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    final String value = (String)obj;
                    try {
                        setDistanceKm(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "setDistanceKm(new java.math.BigDecimal(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
                  
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

      
        sb.append(delimiter).append("LIBRARY_ID").append(equal);
        sb.append((_libraryId != null ? _libraryId.toString() : ""));
          
        sb.append(delimiter).append("NEXT_LIBRARY_ID").append(equal);
        sb.append((_nextLibraryId != null ? _nextLibraryId.toString() : ""));
      
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

    
        sb.append(delimiter).append("LIBRARY_ID").append(equal);
        sb.append((_libraryId != null ? _libraryId.toString() : ""));
        
        sb.append(delimiter).append("NEXT_LIBRARY_ID").append(equal);
        sb.append((_nextLibraryId != null ? _nextLibraryId.toString() : ""));
        
        sb.append(delimiter).append("DISTANCE_KM").append(equal);
        sb.append((_distanceKm != null ? _distanceKm.toString() : ""));
        
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
  
        if (_libraryId == null) {
            return false;
        }
  
        if (_nextLibraryId == null) {
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
        if (!(other instanceof LdBsNextLibrary)) {
            return false;
        }
        if (other == null) {
            return false;
        }
        final String thisMapString = extractPrimaryKeyMapString();
        final String otherMapString = ((LdBsNextLibrary)other).extractPrimaryKeyMapString();

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
  
        if (this.getLibraryId() != null) {
            result = result + this.getLibraryId().hashCode();
        }
  
        if (this.getNextLibraryId() != null) {
            result = result + this.getNextLibraryId().hashCode();
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

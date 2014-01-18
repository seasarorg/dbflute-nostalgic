
package dbflute.ldb.bsentity;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdBlackActionDbm;

import dbflute.ldb.allcommon.helper.LdMapListString;
import dbflute.ldb.allcommon.helper.LdMapListStringImpl;


import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;

/**
 * The entity of BLACK_ACTION.
 * 
 * <pre>
 * [primary-key]
 *     BLACK_ACTION_ID
 * 
 * [column-property]
 *     BLACK_ACTION_ID, BLACK_LIST_ID, BLACK_ACTION_CODE, BLACK_LEVEL, EVIDENCE_PHOTOGRAPH, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     blackList, blackActionLookup
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
public abstract class LdBsBlackAction implements LdEntityDefinedCommonColumn, java.io.Serializable {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao */
    public static final String TABLE = "BLACK_ACTION";

    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "uTime";

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    
    /** The value of blackActionId. */
    protected java.math.BigDecimal _blackActionId;

    /** Has the setter of blackActionId been invoked? */
    protected boolean _isSetterInvokedBlackActionId;
    
    /** The value of blackListId. */
    protected java.math.BigDecimal _blackListId;

    /** Has the setter of blackListId been invoked? */
    protected boolean _isSetterInvokedBlackListId;
    
    /** The value of blackActionCode. */
    protected String _blackActionCode;

    /** Has the setter of blackActionCode been invoked? */
    protected boolean _isSetterInvokedBlackActionCode;
    
    /** The value of blackLevel. */
    protected java.math.BigDecimal _blackLevel;

    /** Has the setter of blackLevel been invoked? */
    protected boolean _isSetterInvokedBlackLevel;
    
    /** The value of evidencePhotograph. */
    protected byte[] _evidencePhotograph;

    /** Has the setter of evidencePhotograph been invoked? */
    protected boolean _isSetterInvokedEvidencePhotograph;
    
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
    public LdBsBlackAction() {
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
        return LdBlackActionDbm.getInstance();
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
     * Get the value of blackActionId.
     * 
     * @return The value of blackActionId. (Nullable)
     */
    public java.math.BigDecimal getBlackActionId() {
        return _blackActionId;
    }

    /**
     * Set the value of blackActionId.
     * 
     * @param v The value of blackActionId. (Nullable)
     */
    public void setBlackActionId(java.math.BigDecimal v) {
        _isSetterInvokedBlackActionId = true;
        _blackActionId = v;
    }

    /**
     * Get the value of blackListId.
     * 
     * @return The value of blackListId. (Nullable)
     */
    public java.math.BigDecimal getBlackListId() {
        return _blackListId;
    }

    /**
     * Set the value of blackListId.
     * 
     * @param v The value of blackListId. (Nullable)
     */
    public void setBlackListId(java.math.BigDecimal v) {
        _isSetterInvokedBlackListId = true;
        _blackListId = v;
    }

    /**
     * Get the value of blackActionCode.
     * 
     * @return The value of blackActionCode. (Nullable)
     */
    public String getBlackActionCode() {
        return _blackActionCode;
    }

    /**
     * Set the value of blackActionCode.
     * 
     * @param v The value of blackActionCode. (Nullable)
     */
    public void setBlackActionCode(String v) {
        _isSetterInvokedBlackActionCode = true;
        _blackActionCode = v;
    }

    /**
     * Get the value of blackLevel.
     * 
     * @return The value of blackLevel. (Nullable)
     */
    public java.math.BigDecimal getBlackLevel() {
        return _blackLevel;
    }

    /**
     * Set the value of blackLevel.
     * 
     * @param v The value of blackLevel. (Nullable)
     */
    public void setBlackLevel(java.math.BigDecimal v) {
        _isSetterInvokedBlackLevel = true;
        _blackLevel = v;
    }

    /**
     * Get the value of evidencePhotograph.
     * 
     * @return The value of evidencePhotograph. (Nullable)
     */
    public byte[] getEvidencePhotograph() {
        return _evidencePhotograph;
    }

    /**
     * Set the value of evidencePhotograph.
     * 
     * @param v The value of evidencePhotograph. (Nullable)
     */
    public void setEvidencePhotograph(byte[] v) {
        _isSetterInvokedEvidencePhotograph = true;
        _evidencePhotograph = v;
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
     * Has the setter of blackActionId been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedBlackActionId() {
        return _isSetterInvokedBlackActionId;
    }

    /**
     * Has the setter of blackListId been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedBlackListId() {
        return _isSetterInvokedBlackListId;
    }

    /**
     * Has the setter of blackActionCode been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedBlackActionCode() {
        return _isSetterInvokedBlackActionCode;
    }

    /**
     * Has the setter of blackLevel been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedBlackLevel() {
        return _isSetterInvokedBlackLevel;
    }

    /**
     * Has the setter of evidencePhotograph been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedEvidencePhotograph() {
        return _isSetterInvokedEvidencePhotograph;
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
     * Classify the value of blackActionCode as Destoroy.
     */
    public void classifyBlackActionCodeDestoroy() {
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_BlackAction_Destoroy;
        setBlackActionCode(new String(code));
    }
    
    /**
     * Classify the value of blackActionCode as Losting.
     */
    public void classifyBlackActionCodeLosting() {
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_BlackAction_Losting;
        setBlackActionCode(new String(code));
    }
                    
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
     * Get the value of blackActionCode as classification-name.
     * 
     * @return The value of blackActionCode as classification-name. (Nullable)
     */
    public String getBlackActionCodeName() {
        if (_blackActionCode == null) {
            return null;
        }
        final java.util.Map<String, String> map = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_NAME_MAP_BlackAction;
        return (String)map.get(_blackActionCode.toString());
    }

    /**
     * Get the value of blackActionCode as classification-alias.
     * 
     * @return The value of blackActionCode as classification-alias. (Nullable)
     */
    public String getBlackActionCodeAlias() {
        if (_blackActionCode == null) {
            return null;
        }
        final java.util.Map<String, String> map = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_ALIAS_MAP_BlackAction;
        return (String)map.get(_blackActionCode.toString());
    }
            
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
     * Is the value of blackActionCode 'Destoroy'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isBlackActionCodeDestoroy() {
        if (_blackActionCode == null) {
            return false;
        }
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_BlackAction_Destoroy;
        return code.equalsIgnoreCase(_blackActionCode.toString());
    }

    /**
     * Is the value of blackActionCode 'Destoroy'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isBlackActionCodeDestoroyIfNullException() {
        if (_blackActionCode == null) {
            String msg = "If the value of blackActionCode is null, this method throws exception!";
            throw new IllegalStateException(msg + " blackActionCode=" + _blackActionCode);
        }
        return isBlackActionCodeDestoroy();
    }
    
    /**
     * Is the value of blackActionCode 'Losting'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isBlackActionCodeLosting() {
        if (_blackActionCode == null) {
            return false;
        }
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_BlackAction_Losting;
        return code.equalsIgnoreCase(_blackActionCode.toString());
    }

    /**
     * Is the value of blackActionCode 'Losting'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isBlackActionCodeLostingIfNullException() {
        if (_blackActionCode == null) {
            String msg = "If the value of blackActionCode is null, this method throws exception!";
            throw new IllegalStateException(msg + " blackActionCode=" + _blackActionCode);
        }
        return isBlackActionCodeLosting();
    }
                    
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
    //   ForeignTable    = [BLACK_LIST]
    //   ForeignProperty = [blackList]
    // * * * * * * * * */

    /** RELNO of foreign table for s2dao. */
    public static final int blackList_RELNO = 0;

    /** RELKEYS of foreign table for s2dao. */
    public static final String blackList_RELKEYS = "BLACK_LIST_ID:BLACK_LIST_ID";

    /** The entity of foreign table. */
    protected dbflute.ldb.exentity.LdBlackList _parentBlackList;
  
    /**
     * Get the entity of foreign table without lazyload.
     * 
     * @return The entity of foreign table.
     */
    public dbflute.ldb.exentity.LdBlackList getBlackList() {
        return _parentBlackList;
    }
  
    /**
     * Set the entity of foreign table.
     * 
     * @param v The entity of foreign table.
     */
    public void setBlackList(dbflute.ldb.exentity.LdBlackList v) {
        _parentBlackList = v;
    }
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [BLACK_ACTION_LOOKUP]
    //   ForeignProperty = [blackActionLookup]
    // * * * * * * * * */

    /** RELNO of foreign table for s2dao. */
    public static final int blackActionLookup_RELNO = 1;

    /** RELKEYS of foreign table for s2dao. */
    public static final String blackActionLookup_RELKEYS = "BLACK_ACTION_CODE:BLACK_ACTION_CODE";

    /** The entity of foreign table. */
    protected dbflute.ldb.exentity.LdBlackActionLookup _parentBlackActionLookup;
  
    /**
     * Get the entity of foreign table without lazyload.
     * 
     * @return The entity of foreign table.
     */
    public dbflute.ldb.exentity.LdBlackActionLookup getBlackActionLookup() {
        return _parentBlackActionLookup;
    }
  
    /**
     * Set the entity of foreign table.
     * 
     * @param v The entity of foreign table.
     */
    public void setBlackActionLookup(dbflute.ldb.exentity.LdBlackActionLookup v) {
        _parentBlackActionLookup = v;
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
  
        if (!primaryKeyMap.containsKey("BLACK_ACTION_ID")) {
            String msg = "The primaryKeyMap must have the value of BLACK_ACTION_ID";
            throw new IllegalStateException(msg + ": primaryKeyMap --> " + primaryKeyMap);
        }
        {
            final Object obj = primaryKeyMap.get("BLACK_ACTION_ID");
            if (obj == null) {
                setBlackActionId(null);
            } else {
                if (obj instanceof java.math.BigDecimal) {
                    setBlackActionId((java.math.BigDecimal)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.math.BigDecimal or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    final String value = (String)obj;
                    try {
                        setBlackActionId(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "setBlackActionId(new java.math.BigDecimal(value))";
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
            final Object obj = columnValueMap.get("BLACK_ACTION_ID");
            if (obj == null) {
                setBlackActionId(null);
            } else {
                if (obj instanceof java.math.BigDecimal) {
                    setBlackActionId((java.math.BigDecimal)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.math.BigDecimal or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    final String value = (String)obj;
                    try {
                        setBlackActionId(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "setBlackActionId(new java.math.BigDecimal(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
                  
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("BLACK_LIST_ID");
            if (obj == null) {
                setBlackListId(null);
            } else {
                if (obj instanceof java.math.BigDecimal) {
                    setBlackListId((java.math.BigDecimal)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.math.BigDecimal or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    final String value = (String)obj;
                    try {
                        setBlackListId(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "setBlackListId(new java.math.BigDecimal(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
                  
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("BLACK_ACTION_CODE");
            if (obj == null) {
                setBlackActionCode(null);
            } else {
                if (obj instanceof String) {
                    setBlackActionCode((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setBlackActionCode((String)obj);
    
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("BLACK_LEVEL");
            if (obj == null) {
                setBlackLevel(null);
            } else {
                if (obj instanceof java.math.BigDecimal) {
                    setBlackLevel((java.math.BigDecimal)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.math.BigDecimal or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    final String value = (String)obj;
                    try {
                        setBlackLevel(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "setBlackLevel(new java.math.BigDecimal(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
                  
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("EVIDENCE_PHOTOGRAPH");
            if (obj == null) {
                setEvidencePhotograph(null);
            } else {
                if (obj instanceof byte[]) {
                    setEvidencePhotograph((byte[])obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be byte[] or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    setEvidencePhotograph(null);// Binary as String is out of target.
                  
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

      
        sb.append(delimiter).append("BLACK_ACTION_ID").append(equal);
        sb.append((_blackActionId != null ? _blackActionId.toString() : ""));
      
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

    
        sb.append(delimiter).append("BLACK_ACTION_ID").append(equal);
        sb.append((_blackActionId != null ? _blackActionId.toString() : ""));
        
        sb.append(delimiter).append("BLACK_LIST_ID").append(equal);
        sb.append((_blackListId != null ? _blackListId.toString() : ""));
        
        sb.append(delimiter).append("BLACK_ACTION_CODE").append(equal);
        sb.append((_blackActionCode != null ? _blackActionCode.toString() : ""));
        
        sb.append(delimiter).append("BLACK_LEVEL").append(equal);
        sb.append((_blackLevel != null ? _blackLevel.toString() : ""));
        
        sb.append(delimiter).append("EVIDENCE_PHOTOGRAPH").append(equal);
        sb.append((_evidencePhotograph != null ? _evidencePhotograph.toString() : ""));
        
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
  
        if (_blackActionId == null) {
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
        if (!(other instanceof LdBsBlackAction)) {
            return false;
        }
        if (other == null) {
            return false;
        }
        final String thisMapString = extractPrimaryKeyMapString();
        final String otherMapString = ((LdBsBlackAction)other).extractPrimaryKeyMapString();

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
  
        if (this.getBlackActionId() != null) {
            result = result + this.getBlackActionId().hashCode();
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

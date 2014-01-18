package com.example.dbflute.buri.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Date;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.buri.dbflute.allcommon.EntityDefinedCommonColumn;
import com.example.dbflute.buri.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.buri.dbflute.exentity.*;

/**
 * The entity of MST_USER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     USER_ID
 * 
 * [column]
 *     USER_ID, USER_CODE, USER_NAME, REGISTER_USER, REGISTER_DATETIME, UPDATE_USER, UPDATE_DATETIME, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     MST_USER_ROLE
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     mstUserRoleList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userId = entity.getUserId();
 * String userCode = entity.getUserCode();
 * String userName = entity.getUserName();
 * String registerUser = entity.getRegisterUser();
 * java.util.Date registerDatetime = entity.getRegisterDatetime();
 * String updateUser = entity.getUpdateUser();
 * java.util.Date updateDatetime = entity.getUpdateDatetime();
 * Integer versionNo = entity.getVersionNo();
 * entity.setUserId(userId);
 * entity.setUserCode(userCode);
 * entity.setUserName(userName);
 * entity.setRegisterUser(registerUser);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateUser(updateUser);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMstUser implements EntityDefinedCommonColumn, Serializable, Cloneable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** USER_ID: {PK, NotNull, NUMBER(9)} */
    protected Integer _userId;

    /** USER_CODE: {NotNull, VARCHAR2(20)} */
    protected String _userCode;

    /** USER_NAME: {NotNull, VARCHAR2(200)} */
    protected String _userName;

    /** REGISTER_USER: {NotNull, VARCHAR2(20)} */
    protected String _registerUser;

    /** REGISTER_DATETIME: {NotNull, DATE(7)} */
    protected java.util.Date _registerDatetime;

    /** UPDATE_USER: {NotNull, VARCHAR2(20)} */
    protected String _updateUser;

    /** UPDATE_DATETIME: {NotNull, DATE(7)} */
    protected java.util.Date _updateDatetime;

    /** VERSION_NO: {NotNull, NUMBER(8)} */
    protected Integer _versionNo;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    /** Is common column auto set up effective? */
    protected boolean __canCommonColumnAutoSetup = true;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "MST_USER";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "mstUser";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /**
     * {@inheritDoc}
     */
    public boolean hasPrimaryKeyValue() {
        if (getUserId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** MST_USER_ROLE by your USER_ID, named 'mstUserRoleList'. */
    protected List<MstUserRole> _mstUserRoleList;

    /**
     * MST_USER_ROLE by your USER_ID, named 'mstUserRoleList'.
     * @return The entity list of referrer property 'mstUserRoleList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<MstUserRole> getMstUserRoleList() {
        if (_mstUserRoleList == null) { _mstUserRoleList = newReferrerList(); }
        return _mstUserRoleList;
    }

    /**
     * MST_USER_ROLE by your USER_ID, named 'mstUserRoleList'.
     * @param mstUserRoleList The entity list of referrer property 'mstUserRoleList'. (NullAllowed)
     */
    public void setMstUserRoleList(List<MstUserRole> mstUserRoleList) {
        _mstUserRoleList = mstUserRoleList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    /**
     * {@inheritDoc}
     */
    public Set<String> modifiedProperties() {
        return __modifiedProperties.getPropertyNames();
    }

    /**
     * {@inheritDoc}
     */
    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    /**
     * {@inheritDoc}
     */
    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    protected EntityModifiedProperties newModifiedProperties() {
        return new EntityModifiedProperties();
    }
    
    // ===================================================================================
    //                                                              Common Column Handling
    //                                                              ======================
    /**
     * {@inheritDoc}
     */
    public void enableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = true;
    }

    /**
     * {@inheritDoc}
     */
    public void disableCommonColumnAutoSetup() {
        __canCommonColumnAutoSetup = false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean canCommonColumnAutoSetup() {
        return __canCommonColumnAutoSetup;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param other The other entity. (NullAllowed)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMstUser)) { return false; }
        BsMstUser otherEntity = (BsMstUser)other;
        if (!xSV(getUserId(), otherEntity.getUserId())) { return false; }
        return true;
    }
    protected boolean xSV(Object value1, Object value2) { // isSameValue()
        return InternalUtil.isSameValue(value1, value2);
    }

    /**
     * Calculate the hash-code from primary-keys or columns.
     * @return The hash-code from primary-key or columns.
     */
    public int hashCode() {
        int result = 17;
        result = xCH(result, getTableDbName());
        result = xCH(result, getUserId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        return InternalUtil.calculateHashcode(result, value);
    }

    /**
     * {@inheritDoc}
     */
    public int instanceHash() {
        return super.hashCode();
    }

    /**
     * Convert to display string of entity's data. (no relation data)
     * @return The display string of all columns and relation existences. (NotNull)
     */
    public String toString() {
        return buildDisplayString(InternalUtil.toClassTitle(this), true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String toStringWithRelation() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        String l = "\n  ";
        if (_mstUserRoleList != null) { for (Entity e : _mstUserRoleList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "mstUserRoleList")); } } }
        return sb.toString();
    }
    protected String xbRDS(Entity e, String name) { // buildRelationDisplayString()
        return e.buildDisplayString(name, true, true);
    }

    /**
     * {@inheritDoc}
     */
    public String buildDisplayString(String name, boolean column, boolean relation) {
        StringBuilder sb = new StringBuilder();
        if (name != null) { sb.append(name).append(column || relation ? ":" : ""); }
        if (column) { sb.append(buildColumnString()); }
        if (relation) { sb.append(buildRelationString()); }
        sb.append("@").append(Integer.toHexString(hashCode()));
        return sb.toString();
    }
    protected String buildColumnString() {
        StringBuilder sb = new StringBuilder();
        String delimiter = ", ";
        sb.append(delimiter).append(getUserId());
        sb.append(delimiter).append(getUserCode());
        sb.append(delimiter).append(getUserName());
        sb.append(delimiter).append(getRegisterUser());
        sb.append(delimiter).append(xfUD(getRegisterDatetime()));
        sb.append(delimiter).append(getUpdateUser());
        sb.append(delimiter).append(xfUD(getUpdateDatetime()));
        sb.append(delimiter).append(getVersionNo());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String xfUD(Date date) { // formatUtilDate()
        return InternalUtil.toString(date, xgDP());
    }
    protected String xgDP() { // getDatePattern
        return "yyyy-MM-dd HH:mm:ss"; // time parts for Oracle only
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_mstUserRoleList != null && !_mstUserRoleList.isEmpty())
        { sb.append(c).append("mstUserRoleList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public MstUser clone() {
        try {
            return (MstUser)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] USER_ID: {PK, NotNull, NUMBER(9)} <br />
     * @return The value of the column 'USER_ID'. (NullAllowed)
     */
    public Integer getUserId() {
        return _userId;
    }

    /**
     * [set] USER_ID: {PK, NotNull, NUMBER(9)} <br />
     * @param userId The value of the column 'USER_ID'. (NullAllowed)
     */
    public void setUserId(Integer userId) {
        __modifiedProperties.addPropertyName("userId");
        this._userId = userId;
    }

    /**
     * [get] USER_CODE: {NotNull, VARCHAR2(20)} <br />
     * @return The value of the column 'USER_CODE'. (NullAllowed)
     */
    public String getUserCode() {
        return _userCode;
    }

    /**
     * [set] USER_CODE: {NotNull, VARCHAR2(20)} <br />
     * @param userCode The value of the column 'USER_CODE'. (NullAllowed)
     */
    public void setUserCode(String userCode) {
        __modifiedProperties.addPropertyName("userCode");
        this._userCode = userCode;
    }

    /**
     * [get] USER_NAME: {NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'USER_NAME'. (NullAllowed)
     */
    public String getUserName() {
        return _userName;
    }

    /**
     * [set] USER_NAME: {NotNull, VARCHAR2(200)} <br />
     * @param userName The value of the column 'USER_NAME'. (NullAllowed)
     */
    public void setUserName(String userName) {
        __modifiedProperties.addPropertyName("userName");
        this._userName = userName;
    }

    /**
     * [get] REGISTER_USER: {NotNull, VARCHAR2(20)} <br />
     * @return The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public String getRegisterUser() {
        return _registerUser;
    }

    /**
     * [set] REGISTER_USER: {NotNull, VARCHAR2(20)} <br />
     * @param registerUser The value of the column 'REGISTER_USER'. (NullAllowed)
     */
    public void setRegisterUser(String registerUser) {
        __modifiedProperties.addPropertyName("registerUser");
        this._registerUser = registerUser;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, DATE(7)} <br />
     * @return The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    public java.util.Date getRegisterDatetime() {
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, DATE(7)} <br />
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (NullAllowed)
     */
    public void setRegisterDatetime(java.util.Date registerDatetime) {
        __modifiedProperties.addPropertyName("registerDatetime");
        this._registerDatetime = registerDatetime;
    }

    /**
     * [get] UPDATE_USER: {NotNull, VARCHAR2(20)} <br />
     * @return The value of the column 'UPDATE_USER'. (NullAllowed)
     */
    public String getUpdateUser() {
        return _updateUser;
    }

    /**
     * [set] UPDATE_USER: {NotNull, VARCHAR2(20)} <br />
     * @param updateUser The value of the column 'UPDATE_USER'. (NullAllowed)
     */
    public void setUpdateUser(String updateUser) {
        __modifiedProperties.addPropertyName("updateUser");
        this._updateUser = updateUser;
    }

    /**
     * [get] UPDATE_DATETIME: {NotNull, DATE(7)} <br />
     * @return The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    public java.util.Date getUpdateDatetime() {
        return _updateDatetime;
    }

    /**
     * [set] UPDATE_DATETIME: {NotNull, DATE(7)} <br />
     * @param updateDatetime The value of the column 'UPDATE_DATETIME'. (NullAllowed)
     */
    public void setUpdateDatetime(java.util.Date updateDatetime) {
        __modifiedProperties.addPropertyName("updateDatetime");
        this._updateDatetime = updateDatetime;
    }

    /**
     * [get] VERSION_NO: {NotNull, NUMBER(8)} <br />
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Integer getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, NUMBER(8)} <br />
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Integer versionNo) {
        __modifiedProperties.addPropertyName("versionNo");
        this._versionNo = versionNo;
    }
}

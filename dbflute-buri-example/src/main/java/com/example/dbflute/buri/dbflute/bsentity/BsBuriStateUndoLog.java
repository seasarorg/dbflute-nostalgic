package com.example.dbflute.buri.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.buri.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.buri.dbflute.exentity.*;

/**
 * The entity of BURISTATEUNDOLOG as TABLE. <br />
 * <pre>
 * [primary-key]
 *     STATEUNDOLOGID
 * 
 * [column]
 *     STATEUNDOLOGID, STATEID, BRANCHID, PATHID, DATAID, USERIDVAL, AUTORUNTIME, USERIDNUM, INSERTDATE, BTID, PROCESSDATE, ABORTDATE, VERSIONNO, CREATEBTID
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     VERSIONNO
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long stateUndoLogId = entity.getStateUndoLogId();
 * Long stateId = entity.getStateId();
 * Long branchId = entity.getBranchId();
 * Long pathId = entity.getPathId();
 * Long dataId = entity.getDataId();
 * String userIdVal = entity.getUserIdVal();
 * java.sql.Timestamp autoRunTime = entity.getAutoRunTime();
 * Long userIdNum = entity.getUserIdNum();
 * java.sql.Timestamp insertDate = entity.getInsertDate();
 * Long btid = entity.getBtid();
 * java.sql.Timestamp processDate = entity.getProcessDate();
 * java.sql.Timestamp abortDate = entity.getAbortDate();
 * java.math.BigDecimal versionNo = entity.getVersionNo();
 * Long createBtid = entity.getCreateBtid();
 * entity.setStateUndoLogId(stateUndoLogId);
 * entity.setStateId(stateId);
 * entity.setBranchId(branchId);
 * entity.setPathId(pathId);
 * entity.setDataId(dataId);
 * entity.setUserIdVal(userIdVal);
 * entity.setAutoRunTime(autoRunTime);
 * entity.setUserIdNum(userIdNum);
 * entity.setInsertDate(insertDate);
 * entity.setBtid(btid);
 * entity.setProcessDate(processDate);
 * entity.setAbortDate(abortDate);
 * entity.setVersionNo(versionNo);
 * entity.setCreateBtid(createBtid);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriStateUndoLog implements Entity, Serializable, Cloneable {

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
    /** STATEUNDOLOGID: {PK, NotNull, NUMBER(18)} */
    protected Long _stateUndoLogId;

    /** STATEID: {IX, NotNull, NUMBER(18)} */
    protected Long _stateId;

    /** BRANCHID: {NUMBER(18)} */
    protected Long _branchId;

    /** PATHID: {NUMBER(18)} */
    protected Long _pathId;

    /** DATAID: {NUMBER(18)} */
    protected Long _dataId;

    /** USERIDVAL: {VARCHAR2(20)} */
    protected String _userIdVal;

    /** AUTORUNTIME: {TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _autoRunTime;

    /** USERIDNUM: {NUMBER(18)} */
    protected Long _userIdNum;

    /** INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _insertDate;

    /** BTID: {NotNull, NUMBER(18)} */
    protected Long _btid;

    /** PROCESSDATE: {TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _processDate;

    /** ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _abortDate;

    /** VERSIONNO: {NotNull, NUMBER(22)} */
    protected java.math.BigDecimal _versionNo;

    /** CREATEBTID: {NotNull, NUMBER(18)} */
    protected Long _createBtid;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this entity. (NotNull) */
    protected final EntityModifiedProperties __modifiedProperties = newModifiedProperties();

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /**
     * {@inheritDoc}
     */
    public String getTableDbName() {
        return "BURISTATEUNDOLOG";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "buriStateUndoLog";
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
        if (getStateUndoLogId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
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
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param other The other entity. (NullAllowed)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBuriStateUndoLog)) { return false; }
        BsBuriStateUndoLog otherEntity = (BsBuriStateUndoLog)other;
        if (!xSV(getStateUndoLogId(), otherEntity.getStateUndoLogId())) { return false; }
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
        result = xCH(result, getStateUndoLogId());
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
        return sb.toString();
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
        sb.append(delimiter).append(getStateUndoLogId());
        sb.append(delimiter).append(getStateId());
        sb.append(delimiter).append(getBranchId());
        sb.append(delimiter).append(getPathId());
        sb.append(delimiter).append(getDataId());
        sb.append(delimiter).append(getUserIdVal());
        sb.append(delimiter).append(getAutoRunTime());
        sb.append(delimiter).append(getUserIdNum());
        sb.append(delimiter).append(getInsertDate());
        sb.append(delimiter).append(getBtid());
        sb.append(delimiter).append(getProcessDate());
        sb.append(delimiter).append(getAbortDate());
        sb.append(delimiter).append(getVersionNo());
        sb.append(delimiter).append(getCreateBtid());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        return "";
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public BuriStateUndoLog clone() {
        try {
            return (BuriStateUndoLog)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STATEUNDOLOGID: {PK, NotNull, NUMBER(18)} <br />
     * @return The value of the column 'STATEUNDOLOGID'. (NullAllowed)
     */
    public Long getStateUndoLogId() {
        return _stateUndoLogId;
    }

    /**
     * [set] STATEUNDOLOGID: {PK, NotNull, NUMBER(18)} <br />
     * @param stateUndoLogId The value of the column 'STATEUNDOLOGID'. (NullAllowed)
     */
    public void setStateUndoLogId(Long stateUndoLogId) {
        __modifiedProperties.addPropertyName("stateUndoLogId");
        this._stateUndoLogId = stateUndoLogId;
    }

    /**
     * [get] STATEID: {IX, NotNull, NUMBER(18)} <br />
     * @return The value of the column 'STATEID'. (NullAllowed)
     */
    public Long getStateId() {
        return _stateId;
    }

    /**
     * [set] STATEID: {IX, NotNull, NUMBER(18)} <br />
     * @param stateId The value of the column 'STATEID'. (NullAllowed)
     */
    public void setStateId(Long stateId) {
        __modifiedProperties.addPropertyName("stateId");
        this._stateId = stateId;
    }

    /**
     * [get] BRANCHID: {NUMBER(18)} <br />
     * @return The value of the column 'BRANCHID'. (NullAllowed)
     */
    public Long getBranchId() {
        return _branchId;
    }

    /**
     * [set] BRANCHID: {NUMBER(18)} <br />
     * @param branchId The value of the column 'BRANCHID'. (NullAllowed)
     */
    public void setBranchId(Long branchId) {
        __modifiedProperties.addPropertyName("branchId");
        this._branchId = branchId;
    }

    /**
     * [get] PATHID: {NUMBER(18)} <br />
     * @return The value of the column 'PATHID'. (NullAllowed)
     */
    public Long getPathId() {
        return _pathId;
    }

    /**
     * [set] PATHID: {NUMBER(18)} <br />
     * @param pathId The value of the column 'PATHID'. (NullAllowed)
     */
    public void setPathId(Long pathId) {
        __modifiedProperties.addPropertyName("pathId");
        this._pathId = pathId;
    }

    /**
     * [get] DATAID: {NUMBER(18)} <br />
     * @return The value of the column 'DATAID'. (NullAllowed)
     */
    public Long getDataId() {
        return _dataId;
    }

    /**
     * [set] DATAID: {NUMBER(18)} <br />
     * @param dataId The value of the column 'DATAID'. (NullAllowed)
     */
    public void setDataId(Long dataId) {
        __modifiedProperties.addPropertyName("dataId");
        this._dataId = dataId;
    }

    /**
     * [get] USERIDVAL: {VARCHAR2(20)} <br />
     * @return The value of the column 'USERIDVAL'. (NullAllowed)
     */
    public String getUserIdVal() {
        return _userIdVal;
    }

    /**
     * [set] USERIDVAL: {VARCHAR2(20)} <br />
     * @param userIdVal The value of the column 'USERIDVAL'. (NullAllowed)
     */
    public void setUserIdVal(String userIdVal) {
        __modifiedProperties.addPropertyName("userIdVal");
        this._userIdVal = userIdVal;
    }

    /**
     * [get] AUTORUNTIME: {TIMESTAMP(6)(11, 6)} <br />
     * @return The value of the column 'AUTORUNTIME'. (NullAllowed)
     */
    public java.sql.Timestamp getAutoRunTime() {
        return _autoRunTime;
    }

    /**
     * [set] AUTORUNTIME: {TIMESTAMP(6)(11, 6)} <br />
     * @param autoRunTime The value of the column 'AUTORUNTIME'. (NullAllowed)
     */
    public void setAutoRunTime(java.sql.Timestamp autoRunTime) {
        __modifiedProperties.addPropertyName("autoRunTime");
        this._autoRunTime = autoRunTime;
    }

    /**
     * [get] USERIDNUM: {NUMBER(18)} <br />
     * @return The value of the column 'USERIDNUM'. (NullAllowed)
     */
    public Long getUserIdNum() {
        return _userIdNum;
    }

    /**
     * [set] USERIDNUM: {NUMBER(18)} <br />
     * @param userIdNum The value of the column 'USERIDNUM'. (NullAllowed)
     */
    public void setUserIdNum(Long userIdNum) {
        __modifiedProperties.addPropertyName("userIdNum");
        this._userIdNum = userIdNum;
    }

    /**
     * [get] INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)} <br />
     * @return The value of the column 'INSERTDATE'. (NullAllowed)
     */
    public java.sql.Timestamp getInsertDate() {
        return _insertDate;
    }

    /**
     * [set] INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)} <br />
     * @param insertDate The value of the column 'INSERTDATE'. (NullAllowed)
     */
    public void setInsertDate(java.sql.Timestamp insertDate) {
        __modifiedProperties.addPropertyName("insertDate");
        this._insertDate = insertDate;
    }

    /**
     * [get] BTID: {NotNull, NUMBER(18)} <br />
     * @return The value of the column 'BTID'. (NullAllowed)
     */
    public Long getBtid() {
        return _btid;
    }

    /**
     * [set] BTID: {NotNull, NUMBER(18)} <br />
     * @param btid The value of the column 'BTID'. (NullAllowed)
     */
    public void setBtid(Long btid) {
        __modifiedProperties.addPropertyName("btid");
        this._btid = btid;
    }

    /**
     * [get] PROCESSDATE: {TIMESTAMP(6)(11, 6)} <br />
     * @return The value of the column 'PROCESSDATE'. (NullAllowed)
     */
    public java.sql.Timestamp getProcessDate() {
        return _processDate;
    }

    /**
     * [set] PROCESSDATE: {TIMESTAMP(6)(11, 6)} <br />
     * @param processDate The value of the column 'PROCESSDATE'. (NullAllowed)
     */
    public void setProcessDate(java.sql.Timestamp processDate) {
        __modifiedProperties.addPropertyName("processDate");
        this._processDate = processDate;
    }

    /**
     * [get] ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)} <br />
     * @return The value of the column 'ABORTDATE'. (NullAllowed)
     */
    public java.sql.Timestamp getAbortDate() {
        return _abortDate;
    }

    /**
     * [set] ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)} <br />
     * @param abortDate The value of the column 'ABORTDATE'. (NullAllowed)
     */
    public void setAbortDate(java.sql.Timestamp abortDate) {
        __modifiedProperties.addPropertyName("abortDate");
        this._abortDate = abortDate;
    }

    /**
     * [get] VERSIONNO: {NotNull, NUMBER(22)} <br />
     * @return The value of the column 'VERSIONNO'. (NullAllowed)
     */
    public java.math.BigDecimal getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSIONNO: {NotNull, NUMBER(22)} <br />
     * @param versionNo The value of the column 'VERSIONNO'. (NullAllowed)
     */
    public void setVersionNo(java.math.BigDecimal versionNo) {
        __modifiedProperties.addPropertyName("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CREATEBTID: {NotNull, NUMBER(18)} <br />
     * @return The value of the column 'CREATEBTID'. (NullAllowed)
     */
    public Long getCreateBtid() {
        return _createBtid;
    }

    /**
     * [set] CREATEBTID: {NotNull, NUMBER(18)} <br />
     * @param createBtid The value of the column 'CREATEBTID'. (NullAllowed)
     */
    public void setCreateBtid(Long createBtid) {
        __modifiedProperties.addPropertyName("createBtid");
        this._createBtid = createBtid;
    }
}

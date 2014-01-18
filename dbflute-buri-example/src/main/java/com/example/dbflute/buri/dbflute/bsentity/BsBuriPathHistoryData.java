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
 * The entity of BURIPATHHISTORYDATA as VIEW. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PATHID, PATHNAME, REALPATHNAME, PATHTYPE, PKEYNUM, PKEYVAL, DATATYPE, TABLENAME, DATAID, STATEID, AUTORUNTIME, INSERTDATE, PROCESSDATE, ABORTDATE, PARTICIPANTNAME, PARTICIPANTTYPE
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
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
 * Long pathId = entity.getPathId();
 * String pathName = entity.getPathName();
 * String realPathName = entity.getRealPathName();
 * java.math.BigDecimal pathType = entity.getPathType();
 * Long pkeyNum = entity.getPkeyNum();
 * String pkeyVal = entity.getPkeyVal();
 * String dataType = entity.getDataType();
 * String tableName = entity.getTableName();
 * Long dataId = entity.getDataId();
 * Long stateId = entity.getStateId();
 * java.sql.Timestamp autoRunTime = entity.getAutoRunTime();
 * java.sql.Timestamp insertDate = entity.getInsertDate();
 * java.sql.Timestamp processDate = entity.getProcessDate();
 * java.sql.Timestamp abortDate = entity.getAbortDate();
 * String participantName = entity.getParticipantName();
 * String participantType = entity.getParticipantType();
 * entity.setPathId(pathId);
 * entity.setPathName(pathName);
 * entity.setRealPathName(realPathName);
 * entity.setPathType(pathType);
 * entity.setPkeyNum(pkeyNum);
 * entity.setPkeyVal(pkeyVal);
 * entity.setDataType(dataType);
 * entity.setTableName(tableName);
 * entity.setDataId(dataId);
 * entity.setStateId(stateId);
 * entity.setAutoRunTime(autoRunTime);
 * entity.setInsertDate(insertDate);
 * entity.setProcessDate(processDate);
 * entity.setAbortDate(abortDate);
 * entity.setParticipantName(participantName);
 * entity.setParticipantType(participantType);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriPathHistoryData implements Entity, Serializable, Cloneable {

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
    /** PATHID: {NotNull, NUMBER(18)} */
    protected Long _pathId;

    /** PATHNAME: {NotNull, VARCHAR2(100)} */
    protected String _pathName;

    /** REALPATHNAME: {NotNull, VARCHAR2(100)} */
    protected String _realPathName;

    /** PATHTYPE: {NUMBER(22)} */
    protected java.math.BigDecimal _pathType;

    /** PKEYNUM: {NUMBER(18)} */
    protected Long _pkeyNum;

    /** PKEYVAL: {VARCHAR2(250)} */
    protected String _pkeyVal;

    /** DATATYPE: {NotNull, VARCHAR2(200)} */
    protected String _dataType;

    /** TABLENAME: {VARCHAR2(200)} */
    protected String _tableName;

    /** DATAID: {NotNull, NUMBER(18)} */
    protected Long _dataId;

    /** STATEID: {NotNull, NUMBER(18)} */
    protected Long _stateId;

    /** AUTORUNTIME: {NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _autoRunTime;

    /** INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _insertDate;

    /** PROCESSDATE: {NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _processDate;

    /** ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _abortDate;

    /** PARTICIPANTNAME: {VARCHAR2(200)} */
    protected String _participantName;

    /** PARTICIPANTTYPE: {VARCHAR2(200)} */
    protected String _participantType;

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
        return "BURIPATHHISTORYDATA";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "buriPathHistoryData";
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
        return false;
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
        if (other == null || !(other instanceof BsBuriPathHistoryData)) { return false; }
        BsBuriPathHistoryData otherEntity = (BsBuriPathHistoryData)other;
        if (!xSV(getPathId(), otherEntity.getPathId())) { return false; }
        if (!xSV(getPathName(), otherEntity.getPathName())) { return false; }
        if (!xSV(getRealPathName(), otherEntity.getRealPathName())) { return false; }
        if (!xSV(getPathType(), otherEntity.getPathType())) { return false; }
        if (!xSV(getPkeyNum(), otherEntity.getPkeyNum())) { return false; }
        if (!xSV(getPkeyVal(), otherEntity.getPkeyVal())) { return false; }
        if (!xSV(getDataType(), otherEntity.getDataType())) { return false; }
        if (!xSV(getTableName(), otherEntity.getTableName())) { return false; }
        if (!xSV(getDataId(), otherEntity.getDataId())) { return false; }
        if (!xSV(getStateId(), otherEntity.getStateId())) { return false; }
        if (!xSV(getAutoRunTime(), otherEntity.getAutoRunTime())) { return false; }
        if (!xSV(getInsertDate(), otherEntity.getInsertDate())) { return false; }
        if (!xSV(getProcessDate(), otherEntity.getProcessDate())) { return false; }
        if (!xSV(getAbortDate(), otherEntity.getAbortDate())) { return false; }
        if (!xSV(getParticipantName(), otherEntity.getParticipantName())) { return false; }
        if (!xSV(getParticipantType(), otherEntity.getParticipantType())) { return false; }
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
        result = xCH(result, getPathId());
        result = xCH(result, getPathName());
        result = xCH(result, getRealPathName());
        result = xCH(result, getPathType());
        result = xCH(result, getPkeyNum());
        result = xCH(result, getPkeyVal());
        result = xCH(result, getDataType());
        result = xCH(result, getTableName());
        result = xCH(result, getDataId());
        result = xCH(result, getStateId());
        result = xCH(result, getAutoRunTime());
        result = xCH(result, getInsertDate());
        result = xCH(result, getProcessDate());
        result = xCH(result, getAbortDate());
        result = xCH(result, getParticipantName());
        result = xCH(result, getParticipantType());
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
        sb.append(delimiter).append(getPathId());
        sb.append(delimiter).append(getPathName());
        sb.append(delimiter).append(getRealPathName());
        sb.append(delimiter).append(getPathType());
        sb.append(delimiter).append(getPkeyNum());
        sb.append(delimiter).append(getPkeyVal());
        sb.append(delimiter).append(getDataType());
        sb.append(delimiter).append(getTableName());
        sb.append(delimiter).append(getDataId());
        sb.append(delimiter).append(getStateId());
        sb.append(delimiter).append(getAutoRunTime());
        sb.append(delimiter).append(getInsertDate());
        sb.append(delimiter).append(getProcessDate());
        sb.append(delimiter).append(getAbortDate());
        sb.append(delimiter).append(getParticipantName());
        sb.append(delimiter).append(getParticipantType());
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
    public BuriPathHistoryData clone() {
        try {
            return (BuriPathHistoryData)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PATHID: {NotNull, NUMBER(18)} <br />
     * @return The value of the column 'PATHID'. (NullAllowed)
     */
    public Long getPathId() {
        return _pathId;
    }

    /**
     * [set] PATHID: {NotNull, NUMBER(18)} <br />
     * @param pathId The value of the column 'PATHID'. (NullAllowed)
     */
    public void setPathId(Long pathId) {
        __modifiedProperties.addPropertyName("pathId");
        this._pathId = pathId;
    }

    /**
     * [get] PATHNAME: {NotNull, VARCHAR2(100)} <br />
     * @return The value of the column 'PATHNAME'. (NullAllowed)
     */
    public String getPathName() {
        return _pathName;
    }

    /**
     * [set] PATHNAME: {NotNull, VARCHAR2(100)} <br />
     * @param pathName The value of the column 'PATHNAME'. (NullAllowed)
     */
    public void setPathName(String pathName) {
        __modifiedProperties.addPropertyName("pathName");
        this._pathName = pathName;
    }

    /**
     * [get] REALPATHNAME: {NotNull, VARCHAR2(100)} <br />
     * @return The value of the column 'REALPATHNAME'. (NullAllowed)
     */
    public String getRealPathName() {
        return _realPathName;
    }

    /**
     * [set] REALPATHNAME: {NotNull, VARCHAR2(100)} <br />
     * @param realPathName The value of the column 'REALPATHNAME'. (NullAllowed)
     */
    public void setRealPathName(String realPathName) {
        __modifiedProperties.addPropertyName("realPathName");
        this._realPathName = realPathName;
    }

    /**
     * [get] PATHTYPE: {NUMBER(22)} <br />
     * @return The value of the column 'PATHTYPE'. (NullAllowed)
     */
    public java.math.BigDecimal getPathType() {
        return _pathType;
    }

    /**
     * [set] PATHTYPE: {NUMBER(22)} <br />
     * @param pathType The value of the column 'PATHTYPE'. (NullAllowed)
     */
    public void setPathType(java.math.BigDecimal pathType) {
        __modifiedProperties.addPropertyName("pathType");
        this._pathType = pathType;
    }

    /**
     * [get] PKEYNUM: {NUMBER(18)} <br />
     * @return The value of the column 'PKEYNUM'. (NullAllowed)
     */
    public Long getPkeyNum() {
        return _pkeyNum;
    }

    /**
     * [set] PKEYNUM: {NUMBER(18)} <br />
     * @param pkeyNum The value of the column 'PKEYNUM'. (NullAllowed)
     */
    public void setPkeyNum(Long pkeyNum) {
        __modifiedProperties.addPropertyName("pkeyNum");
        this._pkeyNum = pkeyNum;
    }

    /**
     * [get] PKEYVAL: {VARCHAR2(250)} <br />
     * @return The value of the column 'PKEYVAL'. (NullAllowed)
     */
    public String getPkeyVal() {
        return _pkeyVal;
    }

    /**
     * [set] PKEYVAL: {VARCHAR2(250)} <br />
     * @param pkeyVal The value of the column 'PKEYVAL'. (NullAllowed)
     */
    public void setPkeyVal(String pkeyVal) {
        __modifiedProperties.addPropertyName("pkeyVal");
        this._pkeyVal = pkeyVal;
    }

    /**
     * [get] DATATYPE: {NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'DATATYPE'. (NullAllowed)
     */
    public String getDataType() {
        return _dataType;
    }

    /**
     * [set] DATATYPE: {NotNull, VARCHAR2(200)} <br />
     * @param dataType The value of the column 'DATATYPE'. (NullAllowed)
     */
    public void setDataType(String dataType) {
        __modifiedProperties.addPropertyName("dataType");
        this._dataType = dataType;
    }

    /**
     * [get] TABLENAME: {VARCHAR2(200)} <br />
     * @return The value of the column 'TABLENAME'. (NullAllowed)
     */
    public String getTableName() {
        return _tableName;
    }

    /**
     * [set] TABLENAME: {VARCHAR2(200)} <br />
     * @param tableName The value of the column 'TABLENAME'. (NullAllowed)
     */
    public void setTableName(String tableName) {
        __modifiedProperties.addPropertyName("tableName");
        this._tableName = tableName;
    }

    /**
     * [get] DATAID: {NotNull, NUMBER(18)} <br />
     * @return The value of the column 'DATAID'. (NullAllowed)
     */
    public Long getDataId() {
        return _dataId;
    }

    /**
     * [set] DATAID: {NotNull, NUMBER(18)} <br />
     * @param dataId The value of the column 'DATAID'. (NullAllowed)
     */
    public void setDataId(Long dataId) {
        __modifiedProperties.addPropertyName("dataId");
        this._dataId = dataId;
    }

    /**
     * [get] STATEID: {NotNull, NUMBER(18)} <br />
     * @return The value of the column 'STATEID'. (NullAllowed)
     */
    public Long getStateId() {
        return _stateId;
    }

    /**
     * [set] STATEID: {NotNull, NUMBER(18)} <br />
     * @param stateId The value of the column 'STATEID'. (NullAllowed)
     */
    public void setStateId(Long stateId) {
        __modifiedProperties.addPropertyName("stateId");
        this._stateId = stateId;
    }

    /**
     * [get] AUTORUNTIME: {NotNull, TIMESTAMP(6)(11, 6)} <br />
     * @return The value of the column 'AUTORUNTIME'. (NullAllowed)
     */
    public java.sql.Timestamp getAutoRunTime() {
        return _autoRunTime;
    }

    /**
     * [set] AUTORUNTIME: {NotNull, TIMESTAMP(6)(11, 6)} <br />
     * @param autoRunTime The value of the column 'AUTORUNTIME'. (NullAllowed)
     */
    public void setAutoRunTime(java.sql.Timestamp autoRunTime) {
        __modifiedProperties.addPropertyName("autoRunTime");
        this._autoRunTime = autoRunTime;
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
     * [get] PROCESSDATE: {NotNull, TIMESTAMP(6)(11, 6)} <br />
     * @return The value of the column 'PROCESSDATE'. (NullAllowed)
     */
    public java.sql.Timestamp getProcessDate() {
        return _processDate;
    }

    /**
     * [set] PROCESSDATE: {NotNull, TIMESTAMP(6)(11, 6)} <br />
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
     * [get] PARTICIPANTNAME: {VARCHAR2(200)} <br />
     * @return The value of the column 'PARTICIPANTNAME'. (NullAllowed)
     */
    public String getParticipantName() {
        return _participantName;
    }

    /**
     * [set] PARTICIPANTNAME: {VARCHAR2(200)} <br />
     * @param participantName The value of the column 'PARTICIPANTNAME'. (NullAllowed)
     */
    public void setParticipantName(String participantName) {
        __modifiedProperties.addPropertyName("participantName");
        this._participantName = participantName;
    }

    /**
     * [get] PARTICIPANTTYPE: {VARCHAR2(200)} <br />
     * @return The value of the column 'PARTICIPANTTYPE'. (NullAllowed)
     */
    public String getParticipantType() {
        return _participantType;
    }

    /**
     * [set] PARTICIPANTTYPE: {VARCHAR2(200)} <br />
     * @param participantType The value of the column 'PARTICIPANTTYPE'. (NullAllowed)
     */
    public void setParticipantType(String participantType) {
        __modifiedProperties.addPropertyName("participantType");
        this._participantType = participantType;
    }
}

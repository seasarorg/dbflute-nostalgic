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
 * The entity of BURISTATE as TABLE. <br />
 * <pre>
 * [primary-key]
 *     STATEID
 * 
 * [column]
 *     STATEID, PATHID, DATAID, BRANCHID, USERIDVAL, USERIDNUM, PARTICIPANTNAME, PARTICIPANTTYPE, BTID, INSERTDATE, AUTORUNTIME, PROCESSDATE, ABORTDATE, VERSIONNO
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
 *     BURIPATH, BURIDATA, BURIBRANCH
 * 
 * [referrer table]
 *     BURISTATEUSER
 * 
 * [foreign property]
 *     buriPath, buriData, buriBranch
 * 
 * [referrer property]
 *     buriStateUserList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long stateId = entity.getStateId();
 * Long pathId = entity.getPathId();
 * Long dataId = entity.getDataId();
 * Long branchId = entity.getBranchId();
 * String userIdVal = entity.getUserIdVal();
 * Long userIdNum = entity.getUserIdNum();
 * String participantName = entity.getParticipantName();
 * String participantType = entity.getParticipantType();
 * Long btid = entity.getBtid();
 * java.sql.Timestamp insertDate = entity.getInsertDate();
 * java.sql.Timestamp autoRunTime = entity.getAutoRunTime();
 * java.sql.Timestamp processDate = entity.getProcessDate();
 * java.sql.Timestamp abortDate = entity.getAbortDate();
 * java.math.BigDecimal versionNo = entity.getVersionNo();
 * entity.setStateId(stateId);
 * entity.setPathId(pathId);
 * entity.setDataId(dataId);
 * entity.setBranchId(branchId);
 * entity.setUserIdVal(userIdVal);
 * entity.setUserIdNum(userIdNum);
 * entity.setParticipantName(participantName);
 * entity.setParticipantType(participantType);
 * entity.setBtid(btid);
 * entity.setInsertDate(insertDate);
 * entity.setAutoRunTime(autoRunTime);
 * entity.setProcessDate(processDate);
 * entity.setAbortDate(abortDate);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriState implements Entity, Serializable, Cloneable {

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
    /** STATEID: {PK, NotNull, NUMBER(18)} */
    protected Long _stateId;

    /** PATHID: {IX, NUMBER(18), FK to BURIPATH} */
    protected Long _pathId;

    /** DATAID: {IX, NUMBER(18), FK to BURIDATA} */
    protected Long _dataId;

    /** BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH} */
    protected Long _branchId;

    /** USERIDVAL: {VARCHAR2(20)} */
    protected String _userIdVal;

    /** USERIDNUM: {NUMBER(18)} */
    protected Long _userIdNum;

    /** PARTICIPANTNAME: {VARCHAR2(200)} */
    protected String _participantName;

    /** PARTICIPANTTYPE: {VARCHAR2(200)} */
    protected String _participantType;

    /** BTID: {NotNull, NUMBER(18)} */
    protected Long _btid;

    /** INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _insertDate;

    /** AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _autoRunTime;

    /** PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _processDate;

    /** ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _abortDate;

    /** VERSIONNO: {NotNull, NUMBER(22)} */
    protected java.math.BigDecimal _versionNo;

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
        return "BURISTATE";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "buriState";
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
        if (getStateId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** BURIPATH by my PATHID, named 'buriPath'. */
    protected BuriPath _buriPath;

    /**
     * BURIPATH by my PATHID, named 'buriPath'.
     * @return The entity of foreign property 'buriPath'. (NullAllowed: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public BuriPath getBuriPath() {
        return _buriPath;
    }

    /**
     * BURIPATH by my PATHID, named 'buriPath'.
     * @param buriPath The entity of foreign property 'buriPath'. (NullAllowed)
     */
    public void setBuriPath(BuriPath buriPath) {
        _buriPath = buriPath;
    }

    /** BURIDATA by my DATAID, named 'buriData'. */
    protected BuriData _buriData;

    /**
     * BURIDATA by my DATAID, named 'buriData'.
     * @return The entity of foreign property 'buriData'. (NullAllowed: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public BuriData getBuriData() {
        return _buriData;
    }

    /**
     * BURIDATA by my DATAID, named 'buriData'.
     * @param buriData The entity of foreign property 'buriData'. (NullAllowed)
     */
    public void setBuriData(BuriData buriData) {
        _buriData = buriData;
    }

    /** BURIBRANCH by my BRANCHID, named 'buriBranch'. */
    protected BuriBranch _buriBranch;

    /**
     * BURIBRANCH by my BRANCHID, named 'buriBranch'.
     * @return The entity of foreign property 'buriBranch'. (NullAllowed: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public BuriBranch getBuriBranch() {
        return _buriBranch;
    }

    /**
     * BURIBRANCH by my BRANCHID, named 'buriBranch'.
     * @param buriBranch The entity of foreign property 'buriBranch'. (NullAllowed)
     */
    public void setBuriBranch(BuriBranch buriBranch) {
        _buriBranch = buriBranch;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** BURISTATEUSER by your STATEID, named 'buriStateUserList'. */
    protected List<BuriStateUser> _buriStateUserList;

    /**
     * BURISTATEUSER by your STATEID, named 'buriStateUserList'.
     * @return The entity list of referrer property 'buriStateUserList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<BuriStateUser> getBuriStateUserList() {
        if (_buriStateUserList == null) { _buriStateUserList = newReferrerList(); }
        return _buriStateUserList;
    }

    /**
     * BURISTATEUSER by your STATEID, named 'buriStateUserList'.
     * @param buriStateUserList The entity list of referrer property 'buriStateUserList'. (NullAllowed)
     */
    public void setBuriStateUserList(List<BuriStateUser> buriStateUserList) {
        _buriStateUserList = buriStateUserList;
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
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * Determine the object is equal with this. <br />
     * If primary-keys or columns of the other are same as this one, returns true.
     * @param other The other entity. (NullAllowed)
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBuriState)) { return false; }
        BsBuriState otherEntity = (BsBuriState)other;
        if (!xSV(getStateId(), otherEntity.getStateId())) { return false; }
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
        result = xCH(result, getStateId());
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
        if (_buriPath != null)
        { sb.append(l).append(xbRDS(_buriPath, "buriPath")); }
        if (_buriData != null)
        { sb.append(l).append(xbRDS(_buriData, "buriData")); }
        if (_buriBranch != null)
        { sb.append(l).append(xbRDS(_buriBranch, "buriBranch")); }
        if (_buriStateUserList != null) { for (Entity e : _buriStateUserList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "buriStateUserList")); } } }
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
        sb.append(delimiter).append(getStateId());
        sb.append(delimiter).append(getPathId());
        sb.append(delimiter).append(getDataId());
        sb.append(delimiter).append(getBranchId());
        sb.append(delimiter).append(getUserIdVal());
        sb.append(delimiter).append(getUserIdNum());
        sb.append(delimiter).append(getParticipantName());
        sb.append(delimiter).append(getParticipantType());
        sb.append(delimiter).append(getBtid());
        sb.append(delimiter).append(getInsertDate());
        sb.append(delimiter).append(getAutoRunTime());
        sb.append(delimiter).append(getProcessDate());
        sb.append(delimiter).append(getAbortDate());
        sb.append(delimiter).append(getVersionNo());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_buriPath != null) { sb.append(c).append("buriPath"); }
        if (_buriData != null) { sb.append(c).append("buriData"); }
        if (_buriBranch != null) { sb.append(c).append("buriBranch"); }
        if (_buriStateUserList != null && !_buriStateUserList.isEmpty())
        { sb.append(c).append("buriStateUserList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public BuriState clone() {
        try {
            return (BuriState)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STATEID: {PK, NotNull, NUMBER(18)} <br />
     * @return The value of the column 'STATEID'. (NullAllowed)
     */
    public Long getStateId() {
        return _stateId;
    }

    /**
     * [set] STATEID: {PK, NotNull, NUMBER(18)} <br />
     * @param stateId The value of the column 'STATEID'. (NullAllowed)
     */
    public void setStateId(Long stateId) {
        __modifiedProperties.addPropertyName("stateId");
        this._stateId = stateId;
    }

    /**
     * [get] PATHID: {IX, NUMBER(18), FK to BURIPATH} <br />
     * @return The value of the column 'PATHID'. (NullAllowed)
     */
    public Long getPathId() {
        return _pathId;
    }

    /**
     * [set] PATHID: {IX, NUMBER(18), FK to BURIPATH} <br />
     * @param pathId The value of the column 'PATHID'. (NullAllowed)
     */
    public void setPathId(Long pathId) {
        __modifiedProperties.addPropertyName("pathId");
        this._pathId = pathId;
    }

    /**
     * [get] DATAID: {IX, NUMBER(18), FK to BURIDATA} <br />
     * @return The value of the column 'DATAID'. (NullAllowed)
     */
    public Long getDataId() {
        return _dataId;
    }

    /**
     * [set] DATAID: {IX, NUMBER(18), FK to BURIDATA} <br />
     * @param dataId The value of the column 'DATAID'. (NullAllowed)
     */
    public void setDataId(Long dataId) {
        __modifiedProperties.addPropertyName("dataId");
        this._dataId = dataId;
    }

    /**
     * [get] BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH} <br />
     * @return The value of the column 'BRANCHID'. (NullAllowed)
     */
    public Long getBranchId() {
        return _branchId;
    }

    /**
     * [set] BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH} <br />
     * @param branchId The value of the column 'BRANCHID'. (NullAllowed)
     */
    public void setBranchId(Long branchId) {
        __modifiedProperties.addPropertyName("branchId");
        this._branchId = branchId;
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
     * [get] AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)} <br />
     * @return The value of the column 'AUTORUNTIME'. (NullAllowed)
     */
    public java.sql.Timestamp getAutoRunTime() {
        return _autoRunTime;
    }

    /**
     * [set] AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)} <br />
     * @param autoRunTime The value of the column 'AUTORUNTIME'. (NullAllowed)
     */
    public void setAutoRunTime(java.sql.Timestamp autoRunTime) {
        __modifiedProperties.addPropertyName("autoRunTime");
        this._autoRunTime = autoRunTime;
    }

    /**
     * [get] PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)} <br />
     * @return The value of the column 'PROCESSDATE'. (NullAllowed)
     */
    public java.sql.Timestamp getProcessDate() {
        return _processDate;
    }

    /**
     * [set] PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)} <br />
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
}

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
 * The entity of BURI_ALL_ROUND_STATE_HISTORY as VIEW. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     INTERNAL_STATE_ID, STATUS_UPDATE_DATETIME, PARTICIPANT_NAME, PARTICIPANT_TYPE, INTERNAL_PATH_ID, STATUS_PATH_NAME, INTERNAL_DATA_ID, INTERNAL_PK_VALUE, INTERNAL_DATA_TYPE, INTERNAL_USER_ID, STATUS_UPDATE_USER
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
 *     DOCUMENT(_文書管理_文書公開)
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     document_文書管理_文書公開
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long internalStateId = entity.getInternalStateId();
 * java.sql.Timestamp statusUpdateDatetime = entity.getStatusUpdateDatetime();
 * String participantName = entity.getParticipantName();
 * String participantType = entity.getParticipantType();
 * Long internalPathId = entity.getInternalPathId();
 * String statusPathName = entity.getStatusPathName();
 * Long internalDataId = entity.getInternalDataId();
 * Long internalPkValue = entity.getInternalPkValue();
 * String internalDataType = entity.getInternalDataType();
 * Long internalUserId = entity.getInternalUserId();
 * String statusUpdateUser = entity.getStatusUpdateUser();
 * entity.setInternalStateId(internalStateId);
 * entity.setStatusUpdateDatetime(statusUpdateDatetime);
 * entity.setParticipantName(participantName);
 * entity.setParticipantType(participantType);
 * entity.setInternalPathId(internalPathId);
 * entity.setStatusPathName(statusPathName);
 * entity.setInternalDataId(internalDataId);
 * entity.setInternalPkValue(internalPkValue);
 * entity.setInternalDataType(internalDataType);
 * entity.setInternalUserId(internalUserId);
 * entity.setStatusUpdateUser(statusUpdateUser);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriAllRoundStateHistory implements Entity, Serializable, Cloneable {

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
    /** INTERNAL_STATE_ID: {NotNull, NUMBER(18)} */
    protected Long _internalStateId;

    /** STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _statusUpdateDatetime;

    /** PARTICIPANT_NAME: {VARCHAR2(200)} */
    protected String _participantName;

    /** PARTICIPANT_TYPE: {VARCHAR2(200)} */
    protected String _participantType;

    /** INTERNAL_PATH_ID: {NotNull, NUMBER(18)} */
    protected Long _internalPathId;

    /** STATUS_PATH_NAME: {NotNull, VARCHAR2(100)} */
    protected String _statusPathName;

    /** INTERNAL_DATA_ID: {NotNull, NUMBER(18)} */
    protected Long _internalDataId;

    /** INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT} */
    protected Long _internalPkValue;

    /** INTERNAL_DATA_TYPE: {NotNull, VARCHAR2(200)} */
    protected String _internalDataType;

    /** INTERNAL_USER_ID: {NUMBER(18)} */
    protected Long _internalUserId;

    /** STATUS_UPDATE_USER: {VARCHAR2(100)} */
    protected String _statusUpdateUser;

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
        return "BURI_ALL_ROUND_STATE_HISTORY";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "buriAllRoundStateHistory";
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
    /** DOCUMENT by my INTERNAL_PK_VALUE, named 'document_文書管理_文書公開'. */
    protected Document _document_文書管理_文書公開;

    /**
     * DOCUMENT by my INTERNAL_PK_VALUE, named 'document_文書管理_文書公開'.
     * @return The entity of foreign property 'document_文書管理_文書公開'. (NullAllowed: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public Document getDocument_文書管理_文書公開() {
        return _document_文書管理_文書公開;
    }

    /**
     * DOCUMENT by my INTERNAL_PK_VALUE, named 'document_文書管理_文書公開'.
     * @param document_文書管理_文書公開 The entity of foreign property 'document_文書管理_文書公開'. (NullAllowed)
     */
    public void setDocument_文書管理_文書公開(Document document_文書管理_文書公開) {
        _document_文書管理_文書公開 = document_文書管理_文書公開;
    }

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
        if (other == null || !(other instanceof BsBuriAllRoundStateHistory)) { return false; }
        BsBuriAllRoundStateHistory otherEntity = (BsBuriAllRoundStateHistory)other;
        if (!xSV(getInternalStateId(), otherEntity.getInternalStateId())) { return false; }
        if (!xSV(getStatusUpdateDatetime(), otherEntity.getStatusUpdateDatetime())) { return false; }
        if (!xSV(getParticipantName(), otherEntity.getParticipantName())) { return false; }
        if (!xSV(getParticipantType(), otherEntity.getParticipantType())) { return false; }
        if (!xSV(getInternalPathId(), otherEntity.getInternalPathId())) { return false; }
        if (!xSV(getStatusPathName(), otherEntity.getStatusPathName())) { return false; }
        if (!xSV(getInternalDataId(), otherEntity.getInternalDataId())) { return false; }
        if (!xSV(getInternalPkValue(), otherEntity.getInternalPkValue())) { return false; }
        if (!xSV(getInternalDataType(), otherEntity.getInternalDataType())) { return false; }
        if (!xSV(getInternalUserId(), otherEntity.getInternalUserId())) { return false; }
        if (!xSV(getStatusUpdateUser(), otherEntity.getStatusUpdateUser())) { return false; }
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
        result = xCH(result, getInternalStateId());
        result = xCH(result, getStatusUpdateDatetime());
        result = xCH(result, getParticipantName());
        result = xCH(result, getParticipantType());
        result = xCH(result, getInternalPathId());
        result = xCH(result, getStatusPathName());
        result = xCH(result, getInternalDataId());
        result = xCH(result, getInternalPkValue());
        result = xCH(result, getInternalDataType());
        result = xCH(result, getInternalUserId());
        result = xCH(result, getStatusUpdateUser());
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
        if (_document_文書管理_文書公開 != null)
        { sb.append(l).append(xbRDS(_document_文書管理_文書公開, "document_文書管理_文書公開")); }
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
        sb.append(delimiter).append(getInternalStateId());
        sb.append(delimiter).append(getStatusUpdateDatetime());
        sb.append(delimiter).append(getParticipantName());
        sb.append(delimiter).append(getParticipantType());
        sb.append(delimiter).append(getInternalPathId());
        sb.append(delimiter).append(getStatusPathName());
        sb.append(delimiter).append(getInternalDataId());
        sb.append(delimiter).append(getInternalPkValue());
        sb.append(delimiter).append(getInternalDataType());
        sb.append(delimiter).append(getInternalUserId());
        sb.append(delimiter).append(getStatusUpdateUser());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_document_文書管理_文書公開 != null) { sb.append(c).append("document_文書管理_文書公開"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public BuriAllRoundStateHistory clone() {
        try {
            return (BuriAllRoundStateHistory)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INTERNAL_STATE_ID: {NotNull, NUMBER(18)} <br />
     * @return The value of the column 'INTERNAL_STATE_ID'. (NullAllowed)
     */
    public Long getInternalStateId() {
        return _internalStateId;
    }

    /**
     * [set] INTERNAL_STATE_ID: {NotNull, NUMBER(18)} <br />
     * @param internalStateId The value of the column 'INTERNAL_STATE_ID'. (NullAllowed)
     */
    public void setInternalStateId(Long internalStateId) {
        __modifiedProperties.addPropertyName("internalStateId");
        this._internalStateId = internalStateId;
    }

    /**
     * [get] STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)} <br />
     * @return The value of the column 'STATUS_UPDATE_DATETIME'. (NullAllowed)
     */
    public java.sql.Timestamp getStatusUpdateDatetime() {
        return _statusUpdateDatetime;
    }

    /**
     * [set] STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)} <br />
     * @param statusUpdateDatetime The value of the column 'STATUS_UPDATE_DATETIME'. (NullAllowed)
     */
    public void setStatusUpdateDatetime(java.sql.Timestamp statusUpdateDatetime) {
        __modifiedProperties.addPropertyName("statusUpdateDatetime");
        this._statusUpdateDatetime = statusUpdateDatetime;
    }

    /**
     * [get] PARTICIPANT_NAME: {VARCHAR2(200)} <br />
     * @return The value of the column 'PARTICIPANT_NAME'. (NullAllowed)
     */
    public String getParticipantName() {
        return _participantName;
    }

    /**
     * [set] PARTICIPANT_NAME: {VARCHAR2(200)} <br />
     * @param participantName The value of the column 'PARTICIPANT_NAME'. (NullAllowed)
     */
    public void setParticipantName(String participantName) {
        __modifiedProperties.addPropertyName("participantName");
        this._participantName = participantName;
    }

    /**
     * [get] PARTICIPANT_TYPE: {VARCHAR2(200)} <br />
     * @return The value of the column 'PARTICIPANT_TYPE'. (NullAllowed)
     */
    public String getParticipantType() {
        return _participantType;
    }

    /**
     * [set] PARTICIPANT_TYPE: {VARCHAR2(200)} <br />
     * @param participantType The value of the column 'PARTICIPANT_TYPE'. (NullAllowed)
     */
    public void setParticipantType(String participantType) {
        __modifiedProperties.addPropertyName("participantType");
        this._participantType = participantType;
    }

    /**
     * [get] INTERNAL_PATH_ID: {NotNull, NUMBER(18)} <br />
     * @return The value of the column 'INTERNAL_PATH_ID'. (NullAllowed)
     */
    public Long getInternalPathId() {
        return _internalPathId;
    }

    /**
     * [set] INTERNAL_PATH_ID: {NotNull, NUMBER(18)} <br />
     * @param internalPathId The value of the column 'INTERNAL_PATH_ID'. (NullAllowed)
     */
    public void setInternalPathId(Long internalPathId) {
        __modifiedProperties.addPropertyName("internalPathId");
        this._internalPathId = internalPathId;
    }

    /**
     * [get] STATUS_PATH_NAME: {NotNull, VARCHAR2(100)} <br />
     * @return The value of the column 'STATUS_PATH_NAME'. (NullAllowed)
     */
    public String getStatusPathName() {
        return _statusPathName;
    }

    /**
     * [set] STATUS_PATH_NAME: {NotNull, VARCHAR2(100)} <br />
     * @param statusPathName The value of the column 'STATUS_PATH_NAME'. (NullAllowed)
     */
    public void setStatusPathName(String statusPathName) {
        __modifiedProperties.addPropertyName("statusPathName");
        this._statusPathName = statusPathName;
    }

    /**
     * [get] INTERNAL_DATA_ID: {NotNull, NUMBER(18)} <br />
     * @return The value of the column 'INTERNAL_DATA_ID'. (NullAllowed)
     */
    public Long getInternalDataId() {
        return _internalDataId;
    }

    /**
     * [set] INTERNAL_DATA_ID: {NotNull, NUMBER(18)} <br />
     * @param internalDataId The value of the column 'INTERNAL_DATA_ID'. (NullAllowed)
     */
    public void setInternalDataId(Long internalDataId) {
        __modifiedProperties.addPropertyName("internalDataId");
        this._internalDataId = internalDataId;
    }

    /**
     * [get] INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT} <br />
     * @return The value of the column 'INTERNAL_PK_VALUE'. (NullAllowed)
     */
    public Long getInternalPkValue() {
        return _internalPkValue;
    }

    /**
     * [set] INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT} <br />
     * @param internalPkValue The value of the column 'INTERNAL_PK_VALUE'. (NullAllowed)
     */
    public void setInternalPkValue(Long internalPkValue) {
        __modifiedProperties.addPropertyName("internalPkValue");
        this._internalPkValue = internalPkValue;
    }

    /**
     * [get] INTERNAL_DATA_TYPE: {NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'INTERNAL_DATA_TYPE'. (NullAllowed)
     */
    public String getInternalDataType() {
        return _internalDataType;
    }

    /**
     * [set] INTERNAL_DATA_TYPE: {NotNull, VARCHAR2(200)} <br />
     * @param internalDataType The value of the column 'INTERNAL_DATA_TYPE'. (NullAllowed)
     */
    public void setInternalDataType(String internalDataType) {
        __modifiedProperties.addPropertyName("internalDataType");
        this._internalDataType = internalDataType;
    }

    /**
     * [get] INTERNAL_USER_ID: {NUMBER(18)} <br />
     * @return The value of the column 'INTERNAL_USER_ID'. (NullAllowed)
     */
    public Long getInternalUserId() {
        return _internalUserId;
    }

    /**
     * [set] INTERNAL_USER_ID: {NUMBER(18)} <br />
     * @param internalUserId The value of the column 'INTERNAL_USER_ID'. (NullAllowed)
     */
    public void setInternalUserId(Long internalUserId) {
        __modifiedProperties.addPropertyName("internalUserId");
        this._internalUserId = internalUserId;
    }

    /**
     * [get] STATUS_UPDATE_USER: {VARCHAR2(100)} <br />
     * @return The value of the column 'STATUS_UPDATE_USER'. (NullAllowed)
     */
    public String getStatusUpdateUser() {
        return _statusUpdateUser;
    }

    /**
     * [set] STATUS_UPDATE_USER: {VARCHAR2(100)} <br />
     * @param statusUpdateUser The value of the column 'STATUS_UPDATE_USER'. (NullAllowed)
     */
    public void setStatusUpdateUser(String statusUpdateUser) {
        __modifiedProperties.addPropertyName("statusUpdateUser");
        this._statusUpdateUser = statusUpdateUser;
    }
}

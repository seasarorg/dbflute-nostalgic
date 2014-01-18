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
 * The entity of BURIDATAPATHHISTORY as TABLE. <br />
 * <pre>
 * [primary-key]
 *     HISTORYID
 * 
 * [column]
 *     HISTORYID, PATHID, PATHNAME, DATAID, ACTION, BURIUSERID, BTID, INSERTDATE
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
 * Long historyId = entity.getHistoryId();
 * Long pathId = entity.getPathId();
 * String pathName = entity.getPathName();
 * Long dataId = entity.getDataId();
 * String action = entity.getAction();
 * Long buriUserId = entity.getBuriUserId();
 * Long btid = entity.getBtid();
 * java.sql.Timestamp insertDate = entity.getInsertDate();
 * entity.setHistoryId(historyId);
 * entity.setPathId(pathId);
 * entity.setPathName(pathName);
 * entity.setDataId(dataId);
 * entity.setAction(action);
 * entity.setBuriUserId(buriUserId);
 * entity.setBtid(btid);
 * entity.setInsertDate(insertDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriDataPathHistory implements Entity, Serializable, Cloneable {

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
    /** HISTORYID: {PK, NotNull, NUMBER(18)} */
    protected Long _historyId;

    /** PATHID: {IX, NUMBER(18)} */
    protected Long _pathId;

    /** PATHNAME: {VARCHAR2(200)} */
    protected String _pathName;

    /** DATAID: {IX, NUMBER(18)} */
    protected Long _dataId;

    /** ACTION: {VARCHAR2(50)} */
    protected String _action;

    /** BURIUSERID: {NUMBER(18)} */
    protected Long _buriUserId;

    /** BTID: {NotNull, NUMBER(18)} */
    protected Long _btid;

    /** INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _insertDate;

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
        return "BURIDATAPATHHISTORY";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "buriDataPathHistory";
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
        if (getHistoryId() == null) { return false; }
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
        if (other == null || !(other instanceof BsBuriDataPathHistory)) { return false; }
        BsBuriDataPathHistory otherEntity = (BsBuriDataPathHistory)other;
        if (!xSV(getHistoryId(), otherEntity.getHistoryId())) { return false; }
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
        result = xCH(result, getHistoryId());
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
        sb.append(delimiter).append(getHistoryId());
        sb.append(delimiter).append(getPathId());
        sb.append(delimiter).append(getPathName());
        sb.append(delimiter).append(getDataId());
        sb.append(delimiter).append(getAction());
        sb.append(delimiter).append(getBuriUserId());
        sb.append(delimiter).append(getBtid());
        sb.append(delimiter).append(getInsertDate());
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
    public BuriDataPathHistory clone() {
        try {
            return (BuriDataPathHistory)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] HISTORYID: {PK, NotNull, NUMBER(18)} <br />
     * @return The value of the column 'HISTORYID'. (NullAllowed)
     */
    public Long getHistoryId() {
        return _historyId;
    }

    /**
     * [set] HISTORYID: {PK, NotNull, NUMBER(18)} <br />
     * @param historyId The value of the column 'HISTORYID'. (NullAllowed)
     */
    public void setHistoryId(Long historyId) {
        __modifiedProperties.addPropertyName("historyId");
        this._historyId = historyId;
    }

    /**
     * [get] PATHID: {IX, NUMBER(18)} <br />
     * @return The value of the column 'PATHID'. (NullAllowed)
     */
    public Long getPathId() {
        return _pathId;
    }

    /**
     * [set] PATHID: {IX, NUMBER(18)} <br />
     * @param pathId The value of the column 'PATHID'. (NullAllowed)
     */
    public void setPathId(Long pathId) {
        __modifiedProperties.addPropertyName("pathId");
        this._pathId = pathId;
    }

    /**
     * [get] PATHNAME: {VARCHAR2(200)} <br />
     * @return The value of the column 'PATHNAME'. (NullAllowed)
     */
    public String getPathName() {
        return _pathName;
    }

    /**
     * [set] PATHNAME: {VARCHAR2(200)} <br />
     * @param pathName The value of the column 'PATHNAME'. (NullAllowed)
     */
    public void setPathName(String pathName) {
        __modifiedProperties.addPropertyName("pathName");
        this._pathName = pathName;
    }

    /**
     * [get] DATAID: {IX, NUMBER(18)} <br />
     * @return The value of the column 'DATAID'. (NullAllowed)
     */
    public Long getDataId() {
        return _dataId;
    }

    /**
     * [set] DATAID: {IX, NUMBER(18)} <br />
     * @param dataId The value of the column 'DATAID'. (NullAllowed)
     */
    public void setDataId(Long dataId) {
        __modifiedProperties.addPropertyName("dataId");
        this._dataId = dataId;
    }

    /**
     * [get] ACTION: {VARCHAR2(50)} <br />
     * @return The value of the column 'ACTION'. (NullAllowed)
     */
    public String getAction() {
        return _action;
    }

    /**
     * [set] ACTION: {VARCHAR2(50)} <br />
     * @param action The value of the column 'ACTION'. (NullAllowed)
     */
    public void setAction(String action) {
        __modifiedProperties.addPropertyName("action");
        this._action = action;
    }

    /**
     * [get] BURIUSERID: {NUMBER(18)} <br />
     * @return The value of the column 'BURIUSERID'. (NullAllowed)
     */
    public Long getBuriUserId() {
        return _buriUserId;
    }

    /**
     * [set] BURIUSERID: {NUMBER(18)} <br />
     * @param buriUserId The value of the column 'BURIUSERID'. (NullAllowed)
     */
    public void setBuriUserId(Long buriUserId) {
        __modifiedProperties.addPropertyName("buriUserId");
        this._buriUserId = buriUserId;
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
}

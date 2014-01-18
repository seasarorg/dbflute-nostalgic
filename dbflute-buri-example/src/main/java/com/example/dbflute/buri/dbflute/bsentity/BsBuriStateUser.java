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
 * The entity of BURISTATEUSER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     STATEUSERID
 * 
 * [column]
 *     STATEUSERID, STATEID, BURIUSERID, INSERTDATE, DELETEDATE
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
 *     BURISTATE, BURIUSER
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     buriState, buriUser
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long stateUserId = entity.getStateUserId();
 * Long stateId = entity.getStateId();
 * Long buriUserId = entity.getBuriUserId();
 * java.sql.Timestamp insertDate = entity.getInsertDate();
 * java.sql.Timestamp deleteDate = entity.getDeleteDate();
 * entity.setStateUserId(stateUserId);
 * entity.setStateId(stateId);
 * entity.setBuriUserId(buriUserId);
 * entity.setInsertDate(insertDate);
 * entity.setDeleteDate(deleteDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriStateUser implements Entity, Serializable, Cloneable {

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
    /** STATEUSERID: {PK, NotNull, NUMBER(18)} */
    protected Long _stateUserId;

    /** STATEID: {IX, NUMBER(18), FK to BURISTATE} */
    protected Long _stateId;

    /** BURIUSERID: {IX, NUMBER(18), FK to BURIUSER} */
    protected Long _buriUserId;

    /** INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _insertDate;

    /** DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _deleteDate;

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
        return "BURISTATEUSER";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "buriStateUser";
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
        if (getStateUserId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** BURISTATE by my STATEID, named 'buriState'. */
    protected BuriState _buriState;

    /**
     * BURISTATE by my STATEID, named 'buriState'.
     * @return The entity of foreign property 'buriState'. (NullAllowed: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public BuriState getBuriState() {
        return _buriState;
    }

    /**
     * BURISTATE by my STATEID, named 'buriState'.
     * @param buriState The entity of foreign property 'buriState'. (NullAllowed)
     */
    public void setBuriState(BuriState buriState) {
        _buriState = buriState;
    }

    /** BURIUSER by my BURIUSERID, named 'buriUser'. */
    protected BuriUser _buriUser;

    /**
     * BURIUSER by my BURIUSERID, named 'buriUser'.
     * @return The entity of foreign property 'buriUser'. (NullAllowed: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public BuriUser getBuriUser() {
        return _buriUser;
    }

    /**
     * BURIUSER by my BURIUSERID, named 'buriUser'.
     * @param buriUser The entity of foreign property 'buriUser'. (NullAllowed)
     */
    public void setBuriUser(BuriUser buriUser) {
        _buriUser = buriUser;
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
        if (other == null || !(other instanceof BsBuriStateUser)) { return false; }
        BsBuriStateUser otherEntity = (BsBuriStateUser)other;
        if (!xSV(getStateUserId(), otherEntity.getStateUserId())) { return false; }
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
        result = xCH(result, getStateUserId());
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
        if (_buriState != null)
        { sb.append(l).append(xbRDS(_buriState, "buriState")); }
        if (_buriUser != null)
        { sb.append(l).append(xbRDS(_buriUser, "buriUser")); }
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
        sb.append(delimiter).append(getStateUserId());
        sb.append(delimiter).append(getStateId());
        sb.append(delimiter).append(getBuriUserId());
        sb.append(delimiter).append(getInsertDate());
        sb.append(delimiter).append(getDeleteDate());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_buriState != null) { sb.append(c).append("buriState"); }
        if (_buriUser != null) { sb.append(c).append("buriUser"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public BuriStateUser clone() {
        try {
            return (BuriStateUser)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] STATEUSERID: {PK, NotNull, NUMBER(18)} <br />
     * @return The value of the column 'STATEUSERID'. (NullAllowed)
     */
    public Long getStateUserId() {
        return _stateUserId;
    }

    /**
     * [set] STATEUSERID: {PK, NotNull, NUMBER(18)} <br />
     * @param stateUserId The value of the column 'STATEUSERID'. (NullAllowed)
     */
    public void setStateUserId(Long stateUserId) {
        __modifiedProperties.addPropertyName("stateUserId");
        this._stateUserId = stateUserId;
    }

    /**
     * [get] STATEID: {IX, NUMBER(18), FK to BURISTATE} <br />
     * @return The value of the column 'STATEID'. (NullAllowed)
     */
    public Long getStateId() {
        return _stateId;
    }

    /**
     * [set] STATEID: {IX, NUMBER(18), FK to BURISTATE} <br />
     * @param stateId The value of the column 'STATEID'. (NullAllowed)
     */
    public void setStateId(Long stateId) {
        __modifiedProperties.addPropertyName("stateId");
        this._stateId = stateId;
    }

    /**
     * [get] BURIUSERID: {IX, NUMBER(18), FK to BURIUSER} <br />
     * @return The value of the column 'BURIUSERID'. (NullAllowed)
     */
    public Long getBuriUserId() {
        return _buriUserId;
    }

    /**
     * [set] BURIUSERID: {IX, NUMBER(18), FK to BURIUSER} <br />
     * @param buriUserId The value of the column 'BURIUSERID'. (NullAllowed)
     */
    public void setBuriUserId(Long buriUserId) {
        __modifiedProperties.addPropertyName("buriUserId");
        this._buriUserId = buriUserId;
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
     * [get] DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)} <br />
     * @return The value of the column 'DELETEDATE'. (NullAllowed)
     */
    public java.sql.Timestamp getDeleteDate() {
        return _deleteDate;
    }

    /**
     * [set] DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)} <br />
     * @param deleteDate The value of the column 'DELETEDATE'. (NullAllowed)
     */
    public void setDeleteDate(java.sql.Timestamp deleteDate) {
        __modifiedProperties.addPropertyName("deleteDate");
        this._deleteDate = deleteDate;
    }
}

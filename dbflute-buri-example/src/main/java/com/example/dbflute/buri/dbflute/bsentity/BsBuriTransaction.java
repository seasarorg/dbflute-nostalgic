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
 * The entity of BURITRANSACTION as TABLE. <br />
 * <pre>
 * [primary-key]
 *     BTID
 * 
 * [column]
 *     BTID, INSERTDATE, VERSIONNO
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
 * Long btid = entity.getBtid();
 * java.sql.Timestamp insertDate = entity.getInsertDate();
 * java.math.BigDecimal versionNo = entity.getVersionNo();
 * entity.setBtid(btid);
 * entity.setInsertDate(insertDate);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriTransaction implements Entity, Serializable, Cloneable {

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
    /** BTID: {PK, NotNull, NUMBER(18)} */
    protected Long _btid;

    /** INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _insertDate;

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
        return "BURITRANSACTION";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "buriTransaction";
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
        if (getBtid() == null) { return false; }
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
        if (other == null || !(other instanceof BsBuriTransaction)) { return false; }
        BsBuriTransaction otherEntity = (BsBuriTransaction)other;
        if (!xSV(getBtid(), otherEntity.getBtid())) { return false; }
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
        result = xCH(result, getBtid());
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
        sb.append(delimiter).append(getBtid());
        sb.append(delimiter).append(getInsertDate());
        sb.append(delimiter).append(getVersionNo());
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
    public BuriTransaction clone() {
        try {
            return (BuriTransaction)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BTID: {PK, NotNull, NUMBER(18)} <br />
     * @return The value of the column 'BTID'. (NullAllowed)
     */
    public Long getBtid() {
        return _btid;
    }

    /**
     * [set] BTID: {PK, NotNull, NUMBER(18)} <br />
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

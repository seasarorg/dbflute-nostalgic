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
 * The entity of BURIPATH as TABLE. <br />
 * <pre>
 * [primary-key]
 *     PATHID
 * 
 * [column]
 *     PATHID, PATHNAME, REALPATHNAME, PATHTYPE
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
 *     BURISTATE, BURIBRANCH
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     buriStateList, buriBranchList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long pathId = entity.getPathId();
 * String pathName = entity.getPathName();
 * String realPathName = entity.getRealPathName();
 * java.math.BigDecimal pathType = entity.getPathType();
 * entity.setPathId(pathId);
 * entity.setPathName(pathName);
 * entity.setRealPathName(realPathName);
 * entity.setPathType(pathType);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriPath implements Entity, Serializable, Cloneable {

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
    /** PATHID: {PK, NotNull, NUMBER(18)} */
    protected Long _pathId;

    /** PATHNAME: {IX, NotNull, VARCHAR2(100)} */
    protected String _pathName;

    /** REALPATHNAME: {IX, NotNull, VARCHAR2(100)} */
    protected String _realPathName;

    /** PATHTYPE: {IX, NUMBER(22)} */
    protected java.math.BigDecimal _pathType;

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
        return "BURIPATH";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "buriPath";
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
        if (getPathId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** BURISTATE by your PATHID, named 'buriStateList'. */
    protected List<BuriState> _buriStateList;

    /**
     * BURISTATE by your PATHID, named 'buriStateList'.
     * @return The entity list of referrer property 'buriStateList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<BuriState> getBuriStateList() {
        if (_buriStateList == null) { _buriStateList = newReferrerList(); }
        return _buriStateList;
    }

    /**
     * BURISTATE by your PATHID, named 'buriStateList'.
     * @param buriStateList The entity list of referrer property 'buriStateList'. (NullAllowed)
     */
    public void setBuriStateList(List<BuriState> buriStateList) {
        _buriStateList = buriStateList;
    }

    /** BURIBRANCH by your PATHID, named 'buriBranchList'. */
    protected List<BuriBranch> _buriBranchList;

    /**
     * BURIBRANCH by your PATHID, named 'buriBranchList'.
     * @return The entity list of referrer property 'buriBranchList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<BuriBranch> getBuriBranchList() {
        if (_buriBranchList == null) { _buriBranchList = newReferrerList(); }
        return _buriBranchList;
    }

    /**
     * BURIBRANCH by your PATHID, named 'buriBranchList'.
     * @param buriBranchList The entity list of referrer property 'buriBranchList'. (NullAllowed)
     */
    public void setBuriBranchList(List<BuriBranch> buriBranchList) {
        _buriBranchList = buriBranchList;
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
        if (other == null || !(other instanceof BsBuriPath)) { return false; }
        BsBuriPath otherEntity = (BsBuriPath)other;
        if (!xSV(getPathId(), otherEntity.getPathId())) { return false; }
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
        if (_buriStateList != null) { for (Entity e : _buriStateList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "buriStateList")); } } }
        if (_buriBranchList != null) { for (Entity e : _buriBranchList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "buriBranchList")); } } }
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
        sb.append(delimiter).append(getPathId());
        sb.append(delimiter).append(getPathName());
        sb.append(delimiter).append(getRealPathName());
        sb.append(delimiter).append(getPathType());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_buriStateList != null && !_buriStateList.isEmpty())
        { sb.append(c).append("buriStateList"); }
        if (_buriBranchList != null && !_buriBranchList.isEmpty())
        { sb.append(c).append("buriBranchList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public BuriPath clone() {
        try {
            return (BuriPath)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PATHID: {PK, NotNull, NUMBER(18)} <br />
     * @return The value of the column 'PATHID'. (NullAllowed)
     */
    public Long getPathId() {
        return _pathId;
    }

    /**
     * [set] PATHID: {PK, NotNull, NUMBER(18)} <br />
     * @param pathId The value of the column 'PATHID'. (NullAllowed)
     */
    public void setPathId(Long pathId) {
        __modifiedProperties.addPropertyName("pathId");
        this._pathId = pathId;
    }

    /**
     * [get] PATHNAME: {IX, NotNull, VARCHAR2(100)} <br />
     * @return The value of the column 'PATHNAME'. (NullAllowed)
     */
    public String getPathName() {
        return _pathName;
    }

    /**
     * [set] PATHNAME: {IX, NotNull, VARCHAR2(100)} <br />
     * @param pathName The value of the column 'PATHNAME'. (NullAllowed)
     */
    public void setPathName(String pathName) {
        __modifiedProperties.addPropertyName("pathName");
        this._pathName = pathName;
    }

    /**
     * [get] REALPATHNAME: {IX, NotNull, VARCHAR2(100)} <br />
     * @return The value of the column 'REALPATHNAME'. (NullAllowed)
     */
    public String getRealPathName() {
        return _realPathName;
    }

    /**
     * [set] REALPATHNAME: {IX, NotNull, VARCHAR2(100)} <br />
     * @param realPathName The value of the column 'REALPATHNAME'. (NullAllowed)
     */
    public void setRealPathName(String realPathName) {
        __modifiedProperties.addPropertyName("realPathName");
        this._realPathName = realPathName;
    }

    /**
     * [get] PATHTYPE: {IX, NUMBER(22)} <br />
     * @return The value of the column 'PATHTYPE'. (NullAllowed)
     */
    public java.math.BigDecimal getPathType() {
        return _pathType;
    }

    /**
     * [set] PATHTYPE: {IX, NUMBER(22)} <br />
     * @param pathType The value of the column 'PATHTYPE'. (NullAllowed)
     */
    public void setPathType(java.math.BigDecimal pathType) {
        __modifiedProperties.addPropertyName("pathType");
        this._pathType = pathType;
    }
}

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
 * The entity of BURIBRANCH as TABLE. <br />
 * <pre>
 * [primary-key]
 *     BRANCHID
 * 
 * [column]
 *     BRANCHID, PARENTBRANCHID, PATHID, DATAID, PROCESSDATE, BTID, VERSIONNO
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
 *     BURIDATA, BURIPATH
 * 
 * [referrer table]
 *     BURISTATE
 * 
 * [foreign property]
 *     buriData, buriPath
 * 
 * [referrer property]
 *     buriStateList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long branchId = entity.getBranchId();
 * Long parentBranchId = entity.getParentBranchId();
 * Long pathId = entity.getPathId();
 * Long dataId = entity.getDataId();
 * java.sql.Timestamp processDate = entity.getProcessDate();
 * java.math.BigDecimal btid = entity.getBtid();
 * java.math.BigDecimal versionNo = entity.getVersionNo();
 * entity.setBranchId(branchId);
 * entity.setParentBranchId(parentBranchId);
 * entity.setPathId(pathId);
 * entity.setDataId(dataId);
 * entity.setProcessDate(processDate);
 * entity.setBtid(btid);
 * entity.setVersionNo(versionNo);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriBranch implements Entity, Serializable, Cloneable {

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
    /** BRANCHID: {PK, NotNull, NUMBER(18)} */
    protected Long _branchId;

    /** PARENTBRANCHID: {IX, NUMBER(18)} */
    protected Long _parentBranchId;

    /** PATHID: {IX, NUMBER(18), FK to BURIPATH} */
    protected Long _pathId;

    /** DATAID: {IX, NUMBER(18), FK to BURIDATA} */
    protected Long _dataId;

    /** PROCESSDATE: {TIMESTAMP(6)(11, 6)} */
    protected java.sql.Timestamp _processDate;

    /** BTID: {NotNull, NUMBER(22)} */
    protected java.math.BigDecimal _btid;

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
        return "BURIBRANCH";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "buriBranch";
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
        if (getBranchId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** BURISTATE by your BRANCHID, named 'buriStateList'. */
    protected List<BuriState> _buriStateList;

    /**
     * BURISTATE by your BRANCHID, named 'buriStateList'.
     * @return The entity list of referrer property 'buriStateList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<BuriState> getBuriStateList() {
        if (_buriStateList == null) { _buriStateList = newReferrerList(); }
        return _buriStateList;
    }

    /**
     * BURISTATE by your BRANCHID, named 'buriStateList'.
     * @param buriStateList The entity list of referrer property 'buriStateList'. (NullAllowed)
     */
    public void setBuriStateList(List<BuriState> buriStateList) {
        _buriStateList = buriStateList;
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
        if (other == null || !(other instanceof BsBuriBranch)) { return false; }
        BsBuriBranch otherEntity = (BsBuriBranch)other;
        if (!xSV(getBranchId(), otherEntity.getBranchId())) { return false; }
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
        result = xCH(result, getBranchId());
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
        if (_buriData != null)
        { sb.append(l).append(xbRDS(_buriData, "buriData")); }
        if (_buriPath != null)
        { sb.append(l).append(xbRDS(_buriPath, "buriPath")); }
        if (_buriStateList != null) { for (Entity e : _buriStateList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "buriStateList")); } } }
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
        sb.append(delimiter).append(getBranchId());
        sb.append(delimiter).append(getParentBranchId());
        sb.append(delimiter).append(getPathId());
        sb.append(delimiter).append(getDataId());
        sb.append(delimiter).append(getProcessDate());
        sb.append(delimiter).append(getBtid());
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
        if (_buriData != null) { sb.append(c).append("buriData"); }
        if (_buriPath != null) { sb.append(c).append("buriPath"); }
        if (_buriStateList != null && !_buriStateList.isEmpty())
        { sb.append(c).append("buriStateList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public BuriBranch clone() {
        try {
            return (BuriBranch)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BRANCHID: {PK, NotNull, NUMBER(18)} <br />
     * @return The value of the column 'BRANCHID'. (NullAllowed)
     */
    public Long getBranchId() {
        return _branchId;
    }

    /**
     * [set] BRANCHID: {PK, NotNull, NUMBER(18)} <br />
     * @param branchId The value of the column 'BRANCHID'. (NullAllowed)
     */
    public void setBranchId(Long branchId) {
        __modifiedProperties.addPropertyName("branchId");
        this._branchId = branchId;
    }

    /**
     * [get] PARENTBRANCHID: {IX, NUMBER(18)} <br />
     * @return The value of the column 'PARENTBRANCHID'. (NullAllowed)
     */
    public Long getParentBranchId() {
        return _parentBranchId;
    }

    /**
     * [set] PARENTBRANCHID: {IX, NUMBER(18)} <br />
     * @param parentBranchId The value of the column 'PARENTBRANCHID'. (NullAllowed)
     */
    public void setParentBranchId(Long parentBranchId) {
        __modifiedProperties.addPropertyName("parentBranchId");
        this._parentBranchId = parentBranchId;
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
     * [get] BTID: {NotNull, NUMBER(22)} <br />
     * @return The value of the column 'BTID'. (NullAllowed)
     */
    public java.math.BigDecimal getBtid() {
        return _btid;
    }

    /**
     * [set] BTID: {NotNull, NUMBER(22)} <br />
     * @param btid The value of the column 'BTID'. (NullAllowed)
     */
    public void setBtid(java.math.BigDecimal btid) {
        __modifiedProperties.addPropertyName("btid");
        this._btid = btid;
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

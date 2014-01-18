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
 * The entity of BURIDATA as TABLE. <br />
 * <pre>
 * [primary-key]
 *     DATAID
 * 
 * [column]
 *     DATAID, PKEYVAL, PKEYNUM, DATATYPE, TABLENAME, INSERTUSERID
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
 * Long dataId = entity.getDataId();
 * String pkeyVal = entity.getPkeyVal();
 * Long pkeyNum = entity.getPkeyNum();
 * String dataType = entity.getDataType();
 * String tableName = entity.getTableName();
 * Long insertUserId = entity.getInsertUserId();
 * entity.setDataId(dataId);
 * entity.setPkeyVal(pkeyVal);
 * entity.setPkeyNum(pkeyNum);
 * entity.setDataType(dataType);
 * entity.setTableName(tableName);
 * entity.setInsertUserId(insertUserId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriData implements Entity, Serializable, Cloneable {

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
    /** DATAID: {PK, NotNull, NUMBER(18)} */
    protected Long _dataId;

    /** PKEYVAL: {IX, VARCHAR2(250)} */
    protected String _pkeyVal;

    /** PKEYNUM: {IX, NUMBER(18)} */
    protected Long _pkeyNum;

    /** DATATYPE: {IX+, NotNull, VARCHAR2(200)} */
    protected String _dataType;

    /** TABLENAME: {VARCHAR2(200)} */
    protected String _tableName;

    /** INSERTUSERID: {IX, NUMBER(18)} */
    protected Long _insertUserId;

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
        return "BURIDATA";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "buriData";
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
        if (getDataId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** BURISTATE by your DATAID, named 'buriStateList'. */
    protected List<BuriState> _buriStateList;

    /**
     * BURISTATE by your DATAID, named 'buriStateList'.
     * @return The entity list of referrer property 'buriStateList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<BuriState> getBuriStateList() {
        if (_buriStateList == null) { _buriStateList = newReferrerList(); }
        return _buriStateList;
    }

    /**
     * BURISTATE by your DATAID, named 'buriStateList'.
     * @param buriStateList The entity list of referrer property 'buriStateList'. (NullAllowed)
     */
    public void setBuriStateList(List<BuriState> buriStateList) {
        _buriStateList = buriStateList;
    }

    /** BURIBRANCH by your DATAID, named 'buriBranchList'. */
    protected List<BuriBranch> _buriBranchList;

    /**
     * BURIBRANCH by your DATAID, named 'buriBranchList'.
     * @return The entity list of referrer property 'buriBranchList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<BuriBranch> getBuriBranchList() {
        if (_buriBranchList == null) { _buriBranchList = newReferrerList(); }
        return _buriBranchList;
    }

    /**
     * BURIBRANCH by your DATAID, named 'buriBranchList'.
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
        if (other == null || !(other instanceof BsBuriData)) { return false; }
        BsBuriData otherEntity = (BsBuriData)other;
        if (!xSV(getDataId(), otherEntity.getDataId())) { return false; }
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
        result = xCH(result, getDataId());
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
        sb.append(delimiter).append(getDataId());
        sb.append(delimiter).append(getPkeyVal());
        sb.append(delimiter).append(getPkeyNum());
        sb.append(delimiter).append(getDataType());
        sb.append(delimiter).append(getTableName());
        sb.append(delimiter).append(getInsertUserId());
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
    public BuriData clone() {
        try {
            return (BuriData)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DATAID: {PK, NotNull, NUMBER(18)} <br />
     * @return The value of the column 'DATAID'. (NullAllowed)
     */
    public Long getDataId() {
        return _dataId;
    }

    /**
     * [set] DATAID: {PK, NotNull, NUMBER(18)} <br />
     * @param dataId The value of the column 'DATAID'. (NullAllowed)
     */
    public void setDataId(Long dataId) {
        __modifiedProperties.addPropertyName("dataId");
        this._dataId = dataId;
    }

    /**
     * [get] PKEYVAL: {IX, VARCHAR2(250)} <br />
     * @return The value of the column 'PKEYVAL'. (NullAllowed)
     */
    public String getPkeyVal() {
        return _pkeyVal;
    }

    /**
     * [set] PKEYVAL: {IX, VARCHAR2(250)} <br />
     * @param pkeyVal The value of the column 'PKEYVAL'. (NullAllowed)
     */
    public void setPkeyVal(String pkeyVal) {
        __modifiedProperties.addPropertyName("pkeyVal");
        this._pkeyVal = pkeyVal;
    }

    /**
     * [get] PKEYNUM: {IX, NUMBER(18)} <br />
     * @return The value of the column 'PKEYNUM'. (NullAllowed)
     */
    public Long getPkeyNum() {
        return _pkeyNum;
    }

    /**
     * [set] PKEYNUM: {IX, NUMBER(18)} <br />
     * @param pkeyNum The value of the column 'PKEYNUM'. (NullAllowed)
     */
    public void setPkeyNum(Long pkeyNum) {
        __modifiedProperties.addPropertyName("pkeyNum");
        this._pkeyNum = pkeyNum;
    }

    /**
     * [get] DATATYPE: {IX+, NotNull, VARCHAR2(200)} <br />
     * @return The value of the column 'DATATYPE'. (NullAllowed)
     */
    public String getDataType() {
        return _dataType;
    }

    /**
     * [set] DATATYPE: {IX+, NotNull, VARCHAR2(200)} <br />
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
     * [get] INSERTUSERID: {IX, NUMBER(18)} <br />
     * @return The value of the column 'INSERTUSERID'. (NullAllowed)
     */
    public Long getInsertUserId() {
        return _insertUserId;
    }

    /**
     * [set] INSERTUSERID: {IX, NUMBER(18)} <br />
     * @param insertUserId The value of the column 'INSERTUSERID'. (NullAllowed)
     */
    public void setInsertUserId(Long insertUserId) {
        __modifiedProperties.addPropertyName("insertUserId");
        this._insertUserId = insertUserId;
    }
}

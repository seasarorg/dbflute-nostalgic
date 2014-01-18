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
 * The entity of BURIUSER as TABLE. <br />
 * <pre>
 * [primary-key]
 *     BURIUSERID
 * 
 * [column]
 *     BURIUSERID, USERIDVAL, USERIDNUM
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
 *     BURISTATEUSER
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     buriStateUserList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long buriUserId = entity.getBuriUserId();
 * String userIdVal = entity.getUserIdVal();
 * Long userIdNum = entity.getUserIdNum();
 * entity.setBuriUserId(buriUserId);
 * entity.setUserIdVal(userIdVal);
 * entity.setUserIdNum(userIdNum);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriUser implements Entity, Serializable, Cloneable {

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
    /** BURIUSERID: {PK, NotNull, NUMBER(18)} */
    protected Long _buriUserId;

    /** USERIDVAL: {IX, VARCHAR2(100)} */
    protected String _userIdVal;

    /** USERIDNUM: {IX+, NUMBER(18)} */
    protected Long _userIdNum;

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
        return "BURIUSER";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "buriUser";
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
        if (getBuriUserId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** BURISTATEUSER by your BURIUSERID, named 'buriStateUserList'. */
    protected List<BuriStateUser> _buriStateUserList;

    /**
     * BURISTATEUSER by your BURIUSERID, named 'buriStateUserList'.
     * @return The entity list of referrer property 'buriStateUserList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<BuriStateUser> getBuriStateUserList() {
        if (_buriStateUserList == null) { _buriStateUserList = newReferrerList(); }
        return _buriStateUserList;
    }

    /**
     * BURISTATEUSER by your BURIUSERID, named 'buriStateUserList'.
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
        if (other == null || !(other instanceof BsBuriUser)) { return false; }
        BsBuriUser otherEntity = (BsBuriUser)other;
        if (!xSV(getBuriUserId(), otherEntity.getBuriUserId())) { return false; }
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
        result = xCH(result, getBuriUserId());
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
        sb.append(delimiter).append(getBuriUserId());
        sb.append(delimiter).append(getUserIdVal());
        sb.append(delimiter).append(getUserIdNum());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
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
    public BuriUser clone() {
        try {
            return (BuriUser)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] BURIUSERID: {PK, NotNull, NUMBER(18)} <br />
     * @return The value of the column 'BURIUSERID'. (NullAllowed)
     */
    public Long getBuriUserId() {
        return _buriUserId;
    }

    /**
     * [set] BURIUSERID: {PK, NotNull, NUMBER(18)} <br />
     * @param buriUserId The value of the column 'BURIUSERID'. (NullAllowed)
     */
    public void setBuriUserId(Long buriUserId) {
        __modifiedProperties.addPropertyName("buriUserId");
        this._buriUserId = buriUserId;
    }

    /**
     * [get] USERIDVAL: {IX, VARCHAR2(100)} <br />
     * @return The value of the column 'USERIDVAL'. (NullAllowed)
     */
    public String getUserIdVal() {
        return _userIdVal;
    }

    /**
     * [set] USERIDVAL: {IX, VARCHAR2(100)} <br />
     * @param userIdVal The value of the column 'USERIDVAL'. (NullAllowed)
     */
    public void setUserIdVal(String userIdVal) {
        __modifiedProperties.addPropertyName("userIdVal");
        this._userIdVal = userIdVal;
    }

    /**
     * [get] USERIDNUM: {IX+, NUMBER(18)} <br />
     * @return The value of the column 'USERIDNUM'. (NullAllowed)
     */
    public Long getUserIdNum() {
        return _userIdNum;
    }

    /**
     * [set] USERIDNUM: {IX+, NUMBER(18)} <br />
     * @param userIdNum The value of the column 'USERIDNUM'. (NullAllowed)
     */
    public void setUserIdNum(Long userIdNum) {
        __modifiedProperties.addPropertyName("userIdNum");
        this._userIdNum = userIdNum;
    }
}

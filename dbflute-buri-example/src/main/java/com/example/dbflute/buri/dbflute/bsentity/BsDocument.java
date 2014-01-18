package com.example.dbflute.buri.dbflute.bsentity;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.buri.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.buri.dbflute.allcommon.plugin.buri.BuriDef;
import com.example.dbflute.buri.dbflute.exentity.*;

/**
 * The entity of DOCUMENT as TABLE. <br />
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, TITLE, CONTENT
 * 
 * [sequence]
 *     SEQ_DOCUMENT_ID
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     BURI_ALL_ROUND_STATE(_文書管理_文書公開)
 * 
 * [referrer table]
 *     BURI_ALL_ROUND_STATE
 * 
 * [foreign property]
 *     buriAllRoundState_文書管理_文書公開
 * 
 * [referrer property]
 *     buriAllRoundStateList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * String title = entity.getTitle();
 * String content = entity.getContent();
 * entity.setId(id);
 * entity.setTitle(title);
 * entity.setContent(content);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsDocument implements Entity, Serializable, Cloneable {

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
    /** ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE} */
    protected Long _id;

    /** TITLE: {NotNull, VARCHAR2(64)} */
    protected String _title;

    /** CONTENT: {NotNull, VARCHAR2(1024)} */
    protected String _content;

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
        return "DOCUMENT";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "document";
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
        if (getId() == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** BURI_ALL_ROUND_STATE by my ID, named 'buriAllRoundState_文書管理_文書公開'. */
    protected BuriAllRoundState _buriAllRoundState_文書管理_文書公開;

    /**
     * BURI_ALL_ROUND_STATE by my ID, named 'buriAllRoundState_文書管理_文書公開'.
     * @return The entity of foreign property 'buriAllRoundState_文書管理_文書公開'. (NullAllowed: If the foreign key does not have 'NotNull' constraint, please check null.)
     */
    public BuriAllRoundState getBuriAllRoundState_文書管理_文書公開() {
        return _buriAllRoundState_文書管理_文書公開;
    }

    /**
     * BURI_ALL_ROUND_STATE by my ID, named 'buriAllRoundState_文書管理_文書公開'.
     * @param buriAllRoundState_文書管理_文書公開 The entity of foreign property 'buriAllRoundState_文書管理_文書公開'. (NullAllowed)
     */
    public void setBuriAllRoundState_文書管理_文書公開(BuriAllRoundState buriAllRoundState_文書管理_文書公開) {
        _buriAllRoundState_文書管理_文書公開 = buriAllRoundState_文書管理_文書公開;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** BURI_ALL_ROUND_STATE by your INTERNAL_PK_VALUE, named 'buriAllRoundStateList'. */
    protected List<BuriAllRoundState> _buriAllRoundStateList;

    /**
     * BURI_ALL_ROUND_STATE by your INTERNAL_PK_VALUE, named 'buriAllRoundStateList'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @return The entity list of referrer property 'buriAllRoundStateList'. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<BuriAllRoundState> getBuriAllRoundStateList() {
        if (_buriAllRoundStateList == null) { _buriAllRoundStateList = newReferrerList(); }
        return _buriAllRoundStateList;
    }

    /**
     * BURI_ALL_ROUND_STATE by your INTERNAL_PK_VALUE, named 'buriAllRoundStateList'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @param buriAllRoundStateList The entity list of referrer property 'buriAllRoundStateList'. (NullAllowed)
     */
    public void setBuriAllRoundStateList(List<BuriAllRoundState> buriAllRoundStateList) {
        _buriAllRoundStateList = buriAllRoundStateList;
    }

    protected List<BuriAllRoundStateHistory> _buriAllRoundStateHistory_文書管理_文書公開;

    public List<BuriAllRoundStateHistory> getBuriAllRoundStateHistory_文書管理_文書公開List() {
        if (_buriAllRoundStateHistory_文書管理_文書公開 == null) { _buriAllRoundStateHistory_文書管理_文書公開 = newReferrerList(); }
        return _buriAllRoundStateHistory_文書管理_文書公開;
    }

    public void setBuriAllRoundStateHistory_文書管理_文書公開List(List<BuriAllRoundStateHistory> buriAllRoundStateHistory_文書管理_文書公開) {
        _buriAllRoundStateHistory_文書管理_文書公開 = buriAllRoundStateHistory_文書管理_文書公開;
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
    //                                                                      Buri Interface
    //                                                                      ==============
    public BuriDef.文書管理_文書公開_Status getStatus_文書管理_文書公開() {
        if (getBuriAllRoundState_文書管理_文書公開() == null) { return null; }
        return BuriDef.文書管理_文書公開_Status.codeOf(getBuriAllRoundState_文書管理_文書公開().getStatusPathName());
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
        if (other == null || !(other instanceof BsDocument)) { return false; }
        BsDocument otherEntity = (BsDocument)other;
        if (!xSV(getId(), otherEntity.getId())) { return false; }
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
        result = xCH(result, getId());
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
        if (_buriAllRoundState_文書管理_文書公開 != null)
        { sb.append(l).append(xbRDS(_buriAllRoundState_文書管理_文書公開, "buriAllRoundState_文書管理_文書公開")); }
        if (_buriAllRoundStateList != null) { for (Entity e : _buriAllRoundStateList)
        { if (e != null) { sb.append(l).append(xbRDS(e, "buriAllRoundStateList")); } } }
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
        sb.append(delimiter).append(getId());
        sb.append(delimiter).append(getTitle());
        sb.append(delimiter).append(getContent());
        if (sb.length() > delimiter.length()) {
            sb.delete(0, delimiter.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }
    protected String buildRelationString() {
        StringBuilder sb = new StringBuilder();
        String c = ",";
        if (_buriAllRoundState_文書管理_文書公開 != null) { sb.append(c).append("buriAllRoundState_文書管理_文書公開"); }
        if (_buriAllRoundStateList != null && !_buriAllRoundStateList.isEmpty())
        { sb.append(c).append("buriAllRoundStateList"); }
        if (sb.length() > c.length()) {
            sb.delete(0, c.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    /**
     * Clone entity instance using super.clone(). (shallow copy) 
     * @return The cloned instance of this entity. (NotNull)
     */
    public Document clone() {
        try {
            return (Document)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE} <br />
     * @return The value of the column 'ID'. (NullAllowed)
     */
    public Long getId() {
        return _id;
    }

    /**
     * [set] ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE} <br />
     * @param id The value of the column 'ID'. (NullAllowed)
     */
    public void setId(Long id) {
        __modifiedProperties.addPropertyName("id");
        this._id = id;
    }

    /**
     * [get] TITLE: {NotNull, VARCHAR2(64)} <br />
     * @return The value of the column 'TITLE'. (NullAllowed)
     */
    public String getTitle() {
        return _title;
    }

    /**
     * [set] TITLE: {NotNull, VARCHAR2(64)} <br />
     * @param title The value of the column 'TITLE'. (NullAllowed)
     */
    public void setTitle(String title) {
        __modifiedProperties.addPropertyName("title");
        this._title = title;
    }

    /**
     * [get] CONTENT: {NotNull, VARCHAR2(1024)} <br />
     * @return The value of the column 'CONTENT'. (NullAllowed)
     */
    public String getContent() {
        return _content;
    }

    /**
     * [set] CONTENT: {NotNull, VARCHAR2(1024)} <br />
     * @param content The value of the column 'CONTENT'. (NullAllowed)
     */
    public void setContent(String content) {
        __modifiedProperties.addPropertyName("content");
        this._content = content;
    }
}

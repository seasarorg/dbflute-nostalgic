package com.example.dbflute.slim3.dbflute.bsentity.customize;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.Entity;
import com.example.dbflute.slim3.dbflute.exentity.customize.*;

/**
 * The entity of SimpleVendorCheck. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     VENDOR_CHECK_ID, DECIMAL_DIGIT, INTEGER_NON_DIGIT, TYPE_OF_BOOLEAN, TYPE_OF_TEXT
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
 * Long vendorCheckId = entity.getVendorCheckId();
 * java.math.BigDecimal decimalDigit = entity.getDecimalDigit();
 * Integer integerNonDigit = entity.getIntegerNonDigit();
 * Boolean typeOfBoolean = entity.getTypeOfBoolean();
 * String typeOfText = entity.getTypeOfText();
 * entity.setVendorCheckId(vendorCheckId);
 * entity.setDecimalDigit(decimalDigit);
 * entity.setIntegerNonDigit(integerNonDigit);
 * entity.setTypeOfBoolean(typeOfBoolean);
 * entity.setTypeOfText(typeOfText);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSimpleVendorCheck implements Entity, Serializable, Cloneable {

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
    /** VENDOR_CHECK_ID: {DECIMAL(16), refers to VENDOR_CHECK.VENDOR_CHECK_ID} */
    protected Long _vendorCheckId;

    /** DECIMAL_DIGIT: {DECIMAL(5, 3), refers to VENDOR_CHECK.DECIMAL_DIGIT} */
    protected java.math.BigDecimal _decimalDigit;

    /** INTEGER_NON_DIGIT: {DECIMAL(5), refers to VENDOR_CHECK.INTEGER_NON_DIGIT} */
    protected Integer _integerNonDigit;

    /** TYPE_OF_BOOLEAN: {BOOLEAN(1), refers to VENDOR_CHECK.TYPE_OF_BOOLEAN} */
    protected Boolean _typeOfBoolean;

    /** TYPE_OF_TEXT: {CLOB(2147483647), refers to VENDOR_CHECK.TYPE_OF_TEXT} */
    protected String _typeOfText;

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
        return "SimpleVendorCheck";
    }

    /**
     * {@inheritDoc}
     */
    public String getTablePropertyName() { // according to Java Beans rule
        return "simpleVendorCheck";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * {@inheritDoc}
     */
    public DBMeta getDBMeta() {
        return com.example.dbflute.slim3.dbflute.bsentity.customize.dbmeta.SimpleVendorCheckDbm.getInstance();
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
        if (other == null || !(other instanceof BsSimpleVendorCheck)) { return false; }
        BsSimpleVendorCheck otherEntity = (BsSimpleVendorCheck)other;
        if (!xSV(getVendorCheckId(), otherEntity.getVendorCheckId())) { return false; }
        if (!xSV(getDecimalDigit(), otherEntity.getDecimalDigit())) { return false; }
        if (!xSV(getIntegerNonDigit(), otherEntity.getIntegerNonDigit())) { return false; }
        if (!xSV(getTypeOfBoolean(), otherEntity.getTypeOfBoolean())) { return false; }
        if (!xSV(getTypeOfText(), otherEntity.getTypeOfText())) { return false; }
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
        result = xCH(result, getVendorCheckId());
        result = xCH(result, getDecimalDigit());
        result = xCH(result, getIntegerNonDigit());
        result = xCH(result, getTypeOfBoolean());
        result = xCH(result, getTypeOfText());
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
        sb.append(delimiter).append(getVendorCheckId());
        sb.append(delimiter).append(getDecimalDigit());
        sb.append(delimiter).append(getIntegerNonDigit());
        sb.append(delimiter).append(getTypeOfBoolean());
        sb.append(delimiter).append(getTypeOfText());
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
    public SimpleVendorCheck clone() {
        try {
            return (SimpleVendorCheck)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Failed to clone the entity: " + toString(), e);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] VENDOR_CHECK_ID: {DECIMAL(16), refers to VENDOR_CHECK.VENDOR_CHECK_ID} <br />
     * @return The value of the column 'VENDOR_CHECK_ID'. (NullAllowed)
     */
    public Long getVendorCheckId() {
        return _vendorCheckId;
    }

    /**
     * [set] VENDOR_CHECK_ID: {DECIMAL(16), refers to VENDOR_CHECK.VENDOR_CHECK_ID} <br />
     * @param vendorCheckId The value of the column 'VENDOR_CHECK_ID'. (NullAllowed)
     */
    public void setVendorCheckId(Long vendorCheckId) {
        __modifiedProperties.addPropertyName("vendorCheckId");
        this._vendorCheckId = vendorCheckId;
    }

    /**
     * [get] DECIMAL_DIGIT: {DECIMAL(5, 3), refers to VENDOR_CHECK.DECIMAL_DIGIT} <br />
     * @return The value of the column 'DECIMAL_DIGIT'. (NullAllowed)
     */
    public java.math.BigDecimal getDecimalDigit() {
        return _decimalDigit;
    }

    /**
     * [set] DECIMAL_DIGIT: {DECIMAL(5, 3), refers to VENDOR_CHECK.DECIMAL_DIGIT} <br />
     * @param decimalDigit The value of the column 'DECIMAL_DIGIT'. (NullAllowed)
     */
    public void setDecimalDigit(java.math.BigDecimal decimalDigit) {
        __modifiedProperties.addPropertyName("decimalDigit");
        this._decimalDigit = decimalDigit;
    }

    /**
     * [get] INTEGER_NON_DIGIT: {DECIMAL(5), refers to VENDOR_CHECK.INTEGER_NON_DIGIT} <br />
     * @return The value of the column 'INTEGER_NON_DIGIT'. (NullAllowed)
     */
    public Integer getIntegerNonDigit() {
        return _integerNonDigit;
    }

    /**
     * [set] INTEGER_NON_DIGIT: {DECIMAL(5), refers to VENDOR_CHECK.INTEGER_NON_DIGIT} <br />
     * @param integerNonDigit The value of the column 'INTEGER_NON_DIGIT'. (NullAllowed)
     */
    public void setIntegerNonDigit(Integer integerNonDigit) {
        __modifiedProperties.addPropertyName("integerNonDigit");
        this._integerNonDigit = integerNonDigit;
    }

    /**
     * [get] TYPE_OF_BOOLEAN: {BOOLEAN(1), refers to VENDOR_CHECK.TYPE_OF_BOOLEAN} <br />
     * @return The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed)
     */
    public Boolean getTypeOfBoolean() {
        return _typeOfBoolean;
    }

    /**
     * [set] TYPE_OF_BOOLEAN: {BOOLEAN(1), refers to VENDOR_CHECK.TYPE_OF_BOOLEAN} <br />
     * @param typeOfBoolean The value of the column 'TYPE_OF_BOOLEAN'. (NullAllowed)
     */
    public void setTypeOfBoolean(Boolean typeOfBoolean) {
        __modifiedProperties.addPropertyName("typeOfBoolean");
        this._typeOfBoolean = typeOfBoolean;
    }

    /**
     * [get] TYPE_OF_TEXT: {CLOB(2147483647), refers to VENDOR_CHECK.TYPE_OF_TEXT} <br />
     * @return The value of the column 'TYPE_OF_TEXT'. (NullAllowed)
     */
    public String getTypeOfText() {
        return _typeOfText;
    }

    /**
     * [set] TYPE_OF_TEXT: {CLOB(2147483647), refers to VENDOR_CHECK.TYPE_OF_TEXT} <br />
     * @param typeOfText The value of the column 'TYPE_OF_TEXT'. (NullAllowed)
     */
    public void setTypeOfText(String typeOfText) {
        __modifiedProperties.addPropertyName("typeOfText");
        this._typeOfText = typeOfText;
    }
}

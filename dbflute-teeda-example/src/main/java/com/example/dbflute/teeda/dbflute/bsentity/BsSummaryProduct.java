package com.example.dbflute.teeda.dbflute.bsentity;

import java.util.*;

import com.example.dbflute.teeda.dbflute.allcommon.Entity;
import com.example.dbflute.teeda.dbflute.allcommon.dbmeta.DBMeta;
import com.example.dbflute.teeda.dbflute.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of SUMMARY_PRODUCT that the type is VIEW. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_STATUS_CODE, LATEST_PURCHASE_DATETIME
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
 * [foreign-table]
 *     
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSummaryProduct implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is SUMMARY_PRODUCT. */
    public static final String TABLE = "SUMMARY_PRODUCT";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** PRODUCT_ID: {INTEGER} */
    protected Integer _productId;

    /** PRODUCT_NAME: {VARCHAR(50)} */
    protected String _productName;

    /** PRODUCT_STATUS_CODE: {CHAR(3)} */
    protected String _productStatusCode;

    /** LATEST_PURCHASE_DATETIME: {TIMESTAMP} */
    protected java.sql.Timestamp _latestPurchaseDatetime;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSummaryProduct() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "SUMMARY_PRODUCT";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "summaryProduct";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                          Classification Classifying
    //                                                          ==========================
    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================

    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> getModifiedPropertyNames() {
        return _modifiedProperties.getPropertyNames();
    }

    protected EntityModifiedProperties newEntityModifiedProperties() {
        return new EntityModifiedProperties();
    }

    public void clearModifiedPropertyNames() {
        _modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !_modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * If the all-column value of the other is same as this one, returns true.
     * @param other Other entity. (Nullable)
     * @return Comparing result. If other is null, returns false.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsSummaryProduct)) { return false; }
        final BsSummaryProduct otherEntity = (BsSummaryProduct)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        if (!helpComparingValue(getProductName(), otherEntity.getProductName())) { return false; }
        if (!helpComparingValue(getProductStatusCode(), otherEntity.getProductStatusCode())) { return false; }
        if (!helpComparingValue(getLatestPurchaseDatetime(), otherEntity.getLatestPurchaseDatetime())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * Calculates hash-code from all columns.
     * @return Hash-code from all-columns.
     */
    public int hashCode() {
        int result = 17;
        if (this.getProductId() != null) { result = result + this.getProductId().hashCode(); }
        if (this.getProductName() != null) { result = result + this.getProductName().hashCode(); }
        if (this.getProductStatusCode() != null) { result = result + this.getProductStatusCode().hashCode(); }
        if (this.getLatestPurchaseDatetime() != null) { result = result + this.getLatestPurchaseDatetime().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getProductId());
        sb.append(delimiter).append(getProductName());
        sb.append(delimiter).append(getProductStatusCode());
        sb.append(delimiter).append(getLatestPurchaseDatetime());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {INTEGER} */
    public static final String productId_COLUMN = "PRODUCT_ID";

    /**
     * PRODUCT_ID: {INTEGER} <br />
     * @return The value of the column 'PRODUCT_ID'. (Nullable)
     */
    public Integer getProductId() {
        return _productId;
    }

    /**
     * PRODUCT_ID: {INTEGER} <br />
     * @param productId The value of the column 'PRODUCT_ID'. (Nullable)
     */
    public void setProductId(Integer productId) {
        _modifiedProperties.addPropertyName("productId");
        this._productId = productId;
    }

    /** The column annotation for S2Dao. {VARCHAR(50)} */
    public static final String productName_COLUMN = "PRODUCT_NAME";

    /**
     * PRODUCT_NAME: {VARCHAR(50)} <br />
     * @return The value of the column 'PRODUCT_NAME'. (Nullable)
     */
    public String getProductName() {
        return _productName;
    }

    /**
     * PRODUCT_NAME: {VARCHAR(50)} <br />
     * @param productName The value of the column 'PRODUCT_NAME'. (Nullable)
     */
    public void setProductName(String productName) {
        _modifiedProperties.addPropertyName("productName");
        this._productName = productName;
    }

    /** The column annotation for S2Dao. {CHAR(3)} */
    public static final String productStatusCode_COLUMN = "PRODUCT_STATUS_CODE";

    /**
     * PRODUCT_STATUS_CODE: {CHAR(3)} <br />
     * @return The value of the column 'PRODUCT_STATUS_CODE'. (Nullable)
     */
    public String getProductStatusCode() {
        return _productStatusCode;
    }

    /**
     * PRODUCT_STATUS_CODE: {CHAR(3)} <br />
     * @param productStatusCode The value of the column 'PRODUCT_STATUS_CODE'. (Nullable)
     */
    public void setProductStatusCode(String productStatusCode) {
        _modifiedProperties.addPropertyName("productStatusCode");
        this._productStatusCode = productStatusCode;
    }

    /** The column annotation for S2Dao. {TIMESTAMP} */
    public static final String latestPurchaseDatetime_COLUMN = "LATEST_PURCHASE_DATETIME";

    /**
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP} <br />
     * @return The value of the column 'LATEST_PURCHASE_DATETIME'. (Nullable)
     */
    public java.sql.Timestamp getLatestPurchaseDatetime() {
        return _latestPurchaseDatetime;
    }

    /**
     * LATEST_PURCHASE_DATETIME: {TIMESTAMP} <br />
     * @param latestPurchaseDatetime The value of the column 'LATEST_PURCHASE_DATETIME'. (Nullable)
     */
    public void setLatestPurchaseDatetime(java.sql.Timestamp latestPurchaseDatetime) {
        _modifiedProperties.addPropertyName("latestPurchaseDatetime");
        this._latestPurchaseDatetime = latestPurchaseDatetime;
    }

}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs.customize;



/**
 * The simple DTO of HierarchyFlatBook that the type is null.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PRIMARY_BOOK_ID, ATTRIBUTE_BOOK_NAME, PRIMARY_AUTHOR_ID, ATTRIBUTE_AUTHOR_NAME, PRIMARY_COLLECTION_ID, ATTRIBUTE_ARRIVAL_DATE, ATTRIBUTE_COLLECTION_STATUS_CODE, PRIMARY_COLLECTION_STATUS_CODE, ATTRIBUTE_COLLECTION_STATUS_NAME
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
@SuppressWarnings("unchecked")
public abstract class BsHierarchyFlatBookDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of primaryBookId. {INTEGER(10,0)} */
    protected Integer _primaryBookId;

    /** The value of attributeBookName. {VARCHAR(80,0)} */
    protected String _attributeBookName;

    /** The value of primaryAuthorId. {INTEGER(10,0)} */
    protected Integer _primaryAuthorId;

    /** The value of attributeAuthorName. {VARCHAR(80,0)} */
    protected String _attributeAuthorName;

    /** The value of primaryCollectionId. {INTEGER(10,0)} */
    protected Integer _primaryCollectionId;

    /** The value of attributeArrivalDate. {TIMESTAMP(26,6)} */
    protected java.sql.Timestamp _attributeArrivalDate;

    /** The value of attributeCollectionStatusCode. {CHAR(3,0)} */
    protected String _attributeCollectionStatusCode;

    /** The value of primaryCollectionStatusCode. {CHAR(3,0)} */
    protected String _primaryCollectionStatusCode;

    /** The value of attributeCollectionStatusName. {VARCHAR(80,0)} */
    protected String _attributeCollectionStatusName;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsHierarchyFlatBookDto() {
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * The override.
     * If the all-column value of the other is same as this one, returns true.
     * @param other Other entity. (Nullable)
     * @return Comparing result. If other is null, returns false.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsHierarchyFlatBookDto)) { return false; }
        final BsHierarchyFlatBookDto otherEntity = (BsHierarchyFlatBookDto)other;
        if (!helpComparingValue(getPrimaryBookId(), otherEntity.getPrimaryBookId())) { return false; }
        if (!helpComparingValue(getAttributeBookName(), otherEntity.getAttributeBookName())) { return false; }
        if (!helpComparingValue(getPrimaryAuthorId(), otherEntity.getPrimaryAuthorId())) { return false; }
        if (!helpComparingValue(getAttributeAuthorName(), otherEntity.getAttributeAuthorName())) { return false; }
        if (!helpComparingValue(getPrimaryCollectionId(), otherEntity.getPrimaryCollectionId())) { return false; }
        if (!helpComparingValue(getAttributeArrivalDate(), otherEntity.getAttributeArrivalDate())) { return false; }
        if (!helpComparingValue(getAttributeCollectionStatusCode(), otherEntity.getAttributeCollectionStatusCode())) { return false; }
        if (!helpComparingValue(getPrimaryCollectionStatusCode(), otherEntity.getPrimaryCollectionStatusCode())) { return false; }
        if (!helpComparingValue(getAttributeCollectionStatusName(), otherEntity.getAttributeCollectionStatusName())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * The override.
     * Calculates hash-code from all-columns.
     * @return Hash-code from all-columns.
     */
    public int hashCode() {
        int result = 0;
        if (this.getPrimaryBookId() != null) { result = result + this.getPrimaryBookId().hashCode(); }
        if (this.getAttributeBookName() != null) { result = result + this.getAttributeBookName().hashCode(); }
        if (this.getPrimaryAuthorId() != null) { result = result + this.getPrimaryAuthorId().hashCode(); }
        if (this.getAttributeAuthorName() != null) { result = result + this.getAttributeAuthorName().hashCode(); }
        if (this.getPrimaryCollectionId() != null) { result = result + this.getPrimaryCollectionId().hashCode(); }
        if (this.getAttributeArrivalDate() != null) { result = result + this.getAttributeArrivalDate().hashCode(); }
        if (this.getAttributeCollectionStatusCode() != null) { result = result + this.getAttributeCollectionStatusCode().hashCode(); }
        if (this.getPrimaryCollectionStatusCode() != null) { result = result + this.getPrimaryCollectionStatusCode().hashCode(); }
        if (this.getAttributeCollectionStatusName() != null) { result = result + this.getAttributeCollectionStatusName().hashCode(); }
        return result;
    }

    /**
     * The override.
     * @return Column-value map-string. (NotNull)
     */
    public String toString() {
        final String delimiter = ",";
        final StringBuilder sb = new StringBuilder();

        sb.append(delimiter).append(getPrimaryBookId());
        sb.append(delimiter).append(getAttributeBookName());
        sb.append(delimiter).append(getPrimaryAuthorId());
        sb.append(delimiter).append(getAttributeAuthorName());
        sb.append(delimiter).append(getPrimaryCollectionId());
        sb.append(delimiter).append(getAttributeArrivalDate());
        sb.append(delimiter).append(getAttributeCollectionStatusCode());
        sb.append(delimiter).append(getPrimaryCollectionStatusCode());
        sb.append(delimiter).append(getAttributeCollectionStatusName());

        sb.delete(0, delimiter.length());
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get the value of primaryBookId. <br />
     * {INTEGER(10,0)}
     * @return The value of primaryBookId. (Nullable)
     */
    public Integer getPrimaryBookId() {
        return _primaryBookId;
    }

    /**
     * Set the value of primaryBookId. <br />
     * {INTEGER(10,0)}
     * @param primaryBookId The value of primaryBookId. (Nullable)
     */
    public void setPrimaryBookId(Integer primaryBookId) {
        this._primaryBookId = primaryBookId;
    }

    /**
     * Get the value of attributeBookName. <br />
     * {VARCHAR(80,0)}
     * @return The value of attributeBookName. (Nullable)
     */
    public String getAttributeBookName() {
        return _attributeBookName;
    }

    /**
     * Set the value of attributeBookName. <br />
     * {VARCHAR(80,0)}
     * @param attributeBookName The value of attributeBookName. (Nullable)
     */
    public void setAttributeBookName(String attributeBookName) {
        this._attributeBookName = attributeBookName;
    }

    /**
     * Get the value of primaryAuthorId. <br />
     * {INTEGER(10,0)}
     * @return The value of primaryAuthorId. (Nullable)
     */
    public Integer getPrimaryAuthorId() {
        return _primaryAuthorId;
    }

    /**
     * Set the value of primaryAuthorId. <br />
     * {INTEGER(10,0)}
     * @param primaryAuthorId The value of primaryAuthorId. (Nullable)
     */
    public void setPrimaryAuthorId(Integer primaryAuthorId) {
        this._primaryAuthorId = primaryAuthorId;
    }

    /**
     * Get the value of attributeAuthorName. <br />
     * {VARCHAR(80,0)}
     * @return The value of attributeAuthorName. (Nullable)
     */
    public String getAttributeAuthorName() {
        return _attributeAuthorName;
    }

    /**
     * Set the value of attributeAuthorName. <br />
     * {VARCHAR(80,0)}
     * @param attributeAuthorName The value of attributeAuthorName. (Nullable)
     */
    public void setAttributeAuthorName(String attributeAuthorName) {
        this._attributeAuthorName = attributeAuthorName;
    }

    /**
     * Get the value of primaryCollectionId. <br />
     * {INTEGER(10,0)}
     * @return The value of primaryCollectionId. (Nullable)
     */
    public Integer getPrimaryCollectionId() {
        return _primaryCollectionId;
    }

    /**
     * Set the value of primaryCollectionId. <br />
     * {INTEGER(10,0)}
     * @param primaryCollectionId The value of primaryCollectionId. (Nullable)
     */
    public void setPrimaryCollectionId(Integer primaryCollectionId) {
        this._primaryCollectionId = primaryCollectionId;
    }

    /**
     * Get the value of attributeArrivalDate. <br />
     * {TIMESTAMP(26,6)}
     * @return The value of attributeArrivalDate. (Nullable)
     */
    public java.sql.Timestamp getAttributeArrivalDate() {
        return _attributeArrivalDate;
    }

    /**
     * Set the value of attributeArrivalDate. <br />
     * {TIMESTAMP(26,6)}
     * @param attributeArrivalDate The value of attributeArrivalDate. (Nullable)
     */
    public void setAttributeArrivalDate(java.sql.Timestamp attributeArrivalDate) {
        this._attributeArrivalDate = attributeArrivalDate;
    }

    /**
     * Get the value of attributeCollectionStatusCode. <br />
     * {CHAR(3,0)}
     * @return The value of attributeCollectionStatusCode. (Nullable)
     */
    public String getAttributeCollectionStatusCode() {
        return _attributeCollectionStatusCode;
    }

    /**
     * Set the value of attributeCollectionStatusCode. <br />
     * {CHAR(3,0)}
     * @param attributeCollectionStatusCode The value of attributeCollectionStatusCode. (Nullable)
     */
    public void setAttributeCollectionStatusCode(String attributeCollectionStatusCode) {
        this._attributeCollectionStatusCode = attributeCollectionStatusCode;
    }

    /**
     * Get the value of primaryCollectionStatusCode. <br />
     * {CHAR(3,0)}
     * @return The value of primaryCollectionStatusCode. (Nullable)
     */
    public String getPrimaryCollectionStatusCode() {
        return _primaryCollectionStatusCode;
    }

    /**
     * Set the value of primaryCollectionStatusCode. <br />
     * {CHAR(3,0)}
     * @param primaryCollectionStatusCode The value of primaryCollectionStatusCode. (Nullable)
     */
    public void setPrimaryCollectionStatusCode(String primaryCollectionStatusCode) {
        this._primaryCollectionStatusCode = primaryCollectionStatusCode;
    }

    /**
     * Get the value of attributeCollectionStatusName. <br />
     * {VARCHAR(80,0)}
     * @return The value of attributeCollectionStatusName. (Nullable)
     */
    public String getAttributeCollectionStatusName() {
        return _attributeCollectionStatusName;
    }

    /**
     * Set the value of attributeCollectionStatusName. <br />
     * {VARCHAR(80,0)}
     * @param attributeCollectionStatusName The value of attributeCollectionStatusName. (Nullable)
     */
    public void setAttributeCollectionStatusName(String attributeCollectionStatusName) {
        this._attributeCollectionStatusName = attributeCollectionStatusName;
    }

}

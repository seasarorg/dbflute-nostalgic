/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs;



/**
 * The simple DTO of GARBAGE_PLUS that the type is TABLE.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     GARBAGE_MEMO, GARBAGE_TIME, GARBAGE_COUNT, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
public abstract class BsGarbagePlusDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of garbageMemo. {VARCHAR(50)} */
    protected String _garbageMemo;

    /** The value of garbageTime. {TIMESTAMP} */
    protected java.sql.Timestamp _garbageTime;

    /** The value of garbageCount. {INTEGER} */
    protected Integer _garbageCount;

    /** The value of RUser. {NotNull : VARCHAR(100) : Default=[default-user]} */
    protected String _rUser;

    /** The value of RModule. {NotNull : VARCHAR(100) : Default=[default-module]} */
    protected String _rModule;

    /** The value of RTimestamp. {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _rTimestamp;

    /** The value of UUser. {NotNull : VARCHAR(100) : Default=[default-user]} */
    protected String _uUser;

    /** The value of UModule. {NotNull : VARCHAR(100) : Default=[default-module]} */
    protected String _uModule;

    /** The value of UTimestamp. {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]} */
    protected java.sql.Timestamp _uTimestamp;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsGarbagePlusDto() {
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
     * {@inheritDoc}
     * If the all-column value of the other is same as this one, returns true.
     * @param other Other entity. (Nullable)
     * @return Comparing result. If other is null, returns false.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsGarbagePlusDto)) { return false; }
        final BsGarbagePlusDto otherEntity = (BsGarbagePlusDto)other;
        if (!helpComparingValue(getGarbageMemo(), otherEntity.getGarbageMemo())) { return false; }
        if (!helpComparingValue(getGarbageTime(), otherEntity.getGarbageTime())) { return false; }
        if (!helpComparingValue(getGarbageCount(), otherEntity.getGarbageCount())) { return false; }
        if (!helpComparingValue(getRUser(), otherEntity.getRUser())) { return false; }
        if (!helpComparingValue(getRModule(), otherEntity.getRModule())) { return false; }
        if (!helpComparingValue(getRTimestamp(), otherEntity.getRTimestamp())) { return false; }
        if (!helpComparingValue(getUUser(), otherEntity.getUUser())) { return false; }
        if (!helpComparingValue(getUModule(), otherEntity.getUModule())) { return false; }
        if (!helpComparingValue(getUTimestamp(), otherEntity.getUTimestamp())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * {@inheritDoc}
     * Calculates hash-code from all-columns.
     * @return Hash-code from all-columns.
     */
    public int hashCode() {
        int result = 0;
        if (this.getGarbageMemo() != null) { result = result + this.getGarbageMemo().hashCode(); }
        if (this.getGarbageTime() != null) { result = result + this.getGarbageTime().hashCode(); }
        if (this.getGarbageCount() != null) { result = result + this.getGarbageCount().hashCode(); }
        if (this.getRUser() != null) { result = result + this.getRUser().hashCode(); }
        if (this.getRModule() != null) { result = result + this.getRModule().hashCode(); }
        if (this.getRTimestamp() != null) { result = result + this.getRTimestamp().hashCode(); }
        if (this.getUUser() != null) { result = result + this.getUUser().hashCode(); }
        if (this.getUModule() != null) { result = result + this.getUModule().hashCode(); }
        if (this.getUTimestamp() != null) { result = result + this.getUTimestamp().hashCode(); }
        return result;
    }

    /**
     * {@inheritDoc}
     * @return Column-value map-string. (NotNull)
     */
    public String toString() {
        final String delimiter = ",";
        final StringBuilder sb = new StringBuilder();

        sb.append(delimiter).append(getGarbageMemo());
        sb.append(delimiter).append(getGarbageTime());
        sb.append(delimiter).append(getGarbageCount());
        sb.append(delimiter).append(getRUser());
        sb.append(delimiter).append(getRModule());
        sb.append(delimiter).append(getRTimestamp());
        sb.append(delimiter).append(getUUser());
        sb.append(delimiter).append(getUModule());
        sb.append(delimiter).append(getUTimestamp());

        sb.delete(0, delimiter.length());
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get the value of garbageMemo. <br />
     * {VARCHAR(50)}
     * @return The value of garbageMemo. (Nullable)
     */
    public String getGarbageMemo() {
        return _garbageMemo;
    }

    /**
     * Set the value of garbageMemo. <br />
     * {VARCHAR(50)}
     * @param garbageMemo The value of garbageMemo. (Nullable)
     */
    public void setGarbageMemo(String garbageMemo) {
        this._garbageMemo = garbageMemo;
    }

    /**
     * Get the value of garbageTime. <br />
     * {TIMESTAMP}
     * @return The value of garbageTime. (Nullable)
     */
    public java.sql.Timestamp getGarbageTime() {
        return _garbageTime;
    }

    /**
     * Set the value of garbageTime. <br />
     * {TIMESTAMP}
     * @param garbageTime The value of garbageTime. (Nullable)
     */
    public void setGarbageTime(java.sql.Timestamp garbageTime) {
        this._garbageTime = garbageTime;
    }

    /**
     * Get the value of garbageCount. <br />
     * {INTEGER}
     * @return The value of garbageCount. (Nullable)
     */
    public Integer getGarbageCount() {
        return _garbageCount;
    }

    /**
     * Set the value of garbageCount. <br />
     * {INTEGER}
     * @param garbageCount The value of garbageCount. (Nullable)
     */
    public void setGarbageCount(Integer garbageCount) {
        this._garbageCount = garbageCount;
    }

    /**
     * Get the value of rUser. <br />
     * {NotNull : VARCHAR(100) : Default=[default-user]}
     * @return The value of rUser. (Nullable)
     */
    public String getRUser() {
        return _rUser;
    }

    /**
     * Set the value of rUser. <br />
     * {NotNull : VARCHAR(100) : Default=[default-user]}
     * @param rUser The value of rUser. (Nullable)
     */
    public void setRUser(String rUser) {
        this._rUser = rUser;
    }

    /**
     * Get the value of rModule. <br />
     * {NotNull : VARCHAR(100) : Default=[default-module]}
     * @return The value of rModule. (Nullable)
     */
    public String getRModule() {
        return _rModule;
    }

    /**
     * Set the value of rModule. <br />
     * {NotNull : VARCHAR(100) : Default=[default-module]}
     * @param rModule The value of rModule. (Nullable)
     */
    public void setRModule(String rModule) {
        this._rModule = rModule;
    }

    /**
     * Get the value of rTimestamp. <br />
     * {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]}
     * @return The value of rTimestamp. (Nullable)
     */
    public java.sql.Timestamp getRTimestamp() {
        return _rTimestamp;
    }

    /**
     * Set the value of rTimestamp. <br />
     * {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]}
     * @param rTimestamp The value of rTimestamp. (Nullable)
     */
    public void setRTimestamp(java.sql.Timestamp rTimestamp) {
        this._rTimestamp = rTimestamp;
    }

    /**
     * Get the value of uUser. <br />
     * {NotNull : VARCHAR(100) : Default=[default-user]}
     * @return The value of uUser. (Nullable)
     */
    public String getUUser() {
        return _uUser;
    }

    /**
     * Set the value of uUser. <br />
     * {NotNull : VARCHAR(100) : Default=[default-user]}
     * @param uUser The value of uUser. (Nullable)
     */
    public void setUUser(String uUser) {
        this._uUser = uUser;
    }

    /**
     * Get the value of uModule. <br />
     * {NotNull : VARCHAR(100) : Default=[default-module]}
     * @return The value of uModule. (Nullable)
     */
    public String getUModule() {
        return _uModule;
    }

    /**
     * Set the value of uModule. <br />
     * {NotNull : VARCHAR(100) : Default=[default-module]}
     * @param uModule The value of uModule. (Nullable)
     */
    public void setUModule(String uModule) {
        this._uModule = uModule;
    }

    /**
     * Get the value of uTimestamp. <br />
     * {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]}
     * @return The value of uTimestamp. (Nullable)
     */
    public java.sql.Timestamp getUTimestamp() {
        return _uTimestamp;
    }

    /**
     * Set the value of uTimestamp. <br />
     * {NotNull : TIMESTAMP : Default=[CURRENT_TIMESTAMP]}
     * @param uTimestamp The value of uTimestamp. (Nullable)
     */
    public void setUTimestamp(java.sql.Timestamp uTimestamp) {
        this._uTimestamp = uTimestamp;
    }

}

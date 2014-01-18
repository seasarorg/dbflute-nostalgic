/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs;


import dbflute.ldb.other.simpledto.*;

/**
 * The simple DTO of BLACK_ACTION that the type is TABLE.
 * <pre>
 * [primary-key]
 *     BLACK_ACTION_ID
 * 
 * [column]
 *     BLACK_ACTION_ID, BLACK_LIST_ID, BLACK_ACTION_CODE, BLACK_LEVEL, ACTION_DATE, EVIDENCE_PHOTOGRAPH, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     BLACK_ACTION_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     BLACK_ACTION_LOOKUP, BLACK_LIST
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     blackActionLookup, blackList
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class BsBlackActionDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of blackActionId. {PK : ID : NotNull : INTEGER} */
    protected Integer _blackActionId;

    /** The value of blackListId. {NotNull : INTEGER : FK to BLACK_LIST} */
    protected Integer _blackListId;

    /** The value of blackActionCode. {NotNull : CHAR(3) : FK to BLACK_ACTION_LOOKUP} */
    protected String _blackActionCode;

    /** The value of blackLevel. {NotNull : SMALLINT} */
    protected Integer _blackLevel;

    /** The value of actionDate. {TIMESTAMP} */
    protected java.sql.Timestamp _actionDate;

    /** The value of evidencePhotograph. {BLOB} */
    protected byte[] _evidencePhotograph;

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
    public BsBlackActionDto() {
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    /** The entity of foreign table. */
    protected BlackActionLookupDto _parentBlackActionLookup;

    /**
     * Get the entity of foreign table of blackActionLookup. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public BlackActionLookupDto getBlackActionLookup() {
        return _parentBlackActionLookup;
    }

    /**
     * Set the entity of foreign table of blackActionLookup.
     * @param blackActionLookup The entity of foreign table. (Nullable)
     */
    public void setBlackActionLookup(BlackActionLookupDto blackActionLookup) {
        this._parentBlackActionLookup = blackActionLookup;
    }

    /** The entity of foreign table. */
    protected BlackListDto _parentBlackList;

    /**
     * Get the entity of foreign table of blackList. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public BlackListDto getBlackList() {
        return _parentBlackList;
    }

    /**
     * Set the entity of foreign table of blackList.
     * @param blackList The entity of foreign table. (Nullable)
     */
    public void setBlackList(BlackListDto blackList) {
        this._parentBlackList = blackList;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * {@inheritDoc}
     * If the primary-key of the other is same as this one, returns true.
     * @param other Other entity.
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsBlackActionDto)) { return false; }
        final BsBlackActionDto otherEntity = (BsBlackActionDto)other;
        if (!helpComparingValue(getBlackActionId(), otherEntity.getBlackActionId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * {@inheritDoc}
     * Calculates hash-code from primary-key.
     * @return Hash-code from primary-keys.
     */
    public int hashCode() {
        int result = 0;
        if (this.getBlackActionId() != null) { result = result + getBlackActionId().hashCode(); }
        return result;
    }


    /**
     * {@inheritDoc}
     * @return Column-value map-string. (NotNull)
     */
    public String toString() {
        final String delimiter = ",";
        final StringBuilder sb = new StringBuilder();

        sb.append(delimiter).append(getBlackActionId());
        sb.append(delimiter).append(getBlackListId());
        sb.append(delimiter).append(getBlackActionCode());
        sb.append(delimiter).append(getBlackLevel());
        sb.append(delimiter).append(getActionDate());
        sb.append(delimiter).append(getEvidencePhotograph());
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
     * Get the value of blackActionId. <br />
     * {PK : ID : NotNull : INTEGER}
     * @return The value of blackActionId. (Nullable)
     */
    public Integer getBlackActionId() {
        return _blackActionId;
    }

    /**
     * Set the value of blackActionId. <br />
     * {PK : ID : NotNull : INTEGER}
     * @param blackActionId The value of blackActionId. (Nullable)
     */
    public void setBlackActionId(Integer blackActionId) {
        this._blackActionId = blackActionId;
    }

    /**
     * Get the value of blackListId. <br />
     * {NotNull : INTEGER : FK to BLACK_LIST}
     * @return The value of blackListId. (Nullable)
     */
    public Integer getBlackListId() {
        return _blackListId;
    }

    /**
     * Set the value of blackListId. <br />
     * {NotNull : INTEGER : FK to BLACK_LIST}
     * @param blackListId The value of blackListId. (Nullable)
     */
    public void setBlackListId(Integer blackListId) {
        this._blackListId = blackListId;
    }

    /**
     * Get the value of blackActionCode. <br />
     * {NotNull : CHAR(3) : FK to BLACK_ACTION_LOOKUP}
     * @return The value of blackActionCode. (Nullable)
     */
    public String getBlackActionCode() {
        return _blackActionCode;
    }

    /**
     * Set the value of blackActionCode. <br />
     * {NotNull : CHAR(3) : FK to BLACK_ACTION_LOOKUP}
     * @param blackActionCode The value of blackActionCode. (Nullable)
     */
    public void setBlackActionCode(String blackActionCode) {
        this._blackActionCode = blackActionCode;
    }

    /**
     * Get the value of blackLevel. <br />
     * {NotNull : SMALLINT}
     * @return The value of blackLevel. (Nullable)
     */
    public Integer getBlackLevel() {
        return _blackLevel;
    }

    /**
     * Set the value of blackLevel. <br />
     * {NotNull : SMALLINT}
     * @param blackLevel The value of blackLevel. (Nullable)
     */
    public void setBlackLevel(Integer blackLevel) {
        this._blackLevel = blackLevel;
    }

    /**
     * Get the value of actionDate. <br />
     * {TIMESTAMP}
     * @return The value of actionDate. (Nullable)
     */
    public java.sql.Timestamp getActionDate() {
        return _actionDate;
    }

    /**
     * Set the value of actionDate. <br />
     * {TIMESTAMP}
     * @param actionDate The value of actionDate. (Nullable)
     */
    public void setActionDate(java.sql.Timestamp actionDate) {
        this._actionDate = actionDate;
    }

    /**
     * Get the value of evidencePhotograph. <br />
     * {BLOB}
     * @return The value of evidencePhotograph. (Nullable)
     */
    public byte[] getEvidencePhotograph() {
        return _evidencePhotograph;
    }

    /**
     * Set the value of evidencePhotograph. <br />
     * {BLOB}
     * @param evidencePhotograph The value of evidencePhotograph. (Nullable)
     */
    public void setEvidencePhotograph(byte[] evidencePhotograph) {
        this._evidencePhotograph = evidencePhotograph;
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

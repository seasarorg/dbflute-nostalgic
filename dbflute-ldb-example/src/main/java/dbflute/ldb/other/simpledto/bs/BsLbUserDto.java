/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs;

import java.util.*;

import dbflute.ldb.other.simpledto.*;

/**
 * The simple DTO of LB_USER that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LB_USER_ID
 * 
 * [column]
 *     LB_USER_ID, LB_USER_NAME, USER_PASSWORD, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     LB_USER_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     BLACK_LIST(AsOne)
 * 
 * [referrer-table]
 *     LIBRARY_USER, BLACK_LIST
 * 
 * [foreign-property]
 *     blackListAsOne
 * 
 * [referrer-property]
 *     libraryUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class BsLbUserDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of lbUserId. {PK : ID : NotNull : INTEGER} */
    protected Integer _lbUserId;

    /** The value of lbUserName. {NotNull : VARCHAR(80)} */
    protected String _lbUserName;

    /** The value of userPassword. {NotNull : VARCHAR(50)} */
    protected String _userPassword;

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
    public BsLbUserDto() {
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    /** The entity of referrer-as-one table. */
    protected BlackListDto _childrenBlackListList;

    /**
     * Get the entity of referrer-as-one table of blackListAsOne. {without lazy-load} <br />
     * @return The entity of referrer-as-one table. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     * @exception IllegalStateException When the size of the referrer table list is duplicate.
     */
    public BlackListDto getBlackListAsOne() {
        return _childrenBlackListList;
    }

    /**
     * Set the entity of referrer-as-one table of blackListAsOne.
     * @param blackListAsOne The entity of referrer-as-one table. (Nullable)
     */
    public void setBlackListAsOne(BlackListDto blackListAsOne) {
        _childrenBlackListList = blackListAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    /** The list of referrer table 'LIBRARY_USER'. */
    protected List<LibraryUserDto> _childrenLibraryUserList;

    /**
     * Get the list of referrer table. {without lazyload} <br />
     * @return The list of referrer table. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<LibraryUserDto> getLibraryUserList() {
        if (_childrenLibraryUserList == null) { _childrenLibraryUserList = new ArrayList<LibraryUserDto>(); }
        return _childrenLibraryUserList;
    }

    /**
     * Set the list of referrer table.
     * @param libraryUserList The list of referrer table. (Nullable)
     */
    public void setLibraryUserList(List<LibraryUserDto> libraryUserList) {
        _childrenLibraryUserList = libraryUserList;
    }


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
        if (other == null || !(other instanceof BsLbUserDto)) { return false; }
        final BsLbUserDto otherEntity = (BsLbUserDto)other;
        if (!helpComparingValue(getLbUserId(), otherEntity.getLbUserId())) { return false; }
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
        if (this.getLbUserId() != null) { result = result + getLbUserId().hashCode(); }
        return result;
    }


    /**
     * {@inheritDoc}
     * @return Column-value map-string. (NotNull)
     */
    public String toString() {
        final String delimiter = ",";
        final StringBuilder sb = new StringBuilder();

        sb.append(delimiter).append(getLbUserId());
        sb.append(delimiter).append(getLbUserName());
        sb.append(delimiter).append(getUserPassword());
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
     * Get the value of lbUserId. <br />
     * {PK : ID : NotNull : INTEGER}
     * @return The value of lbUserId. (Nullable)
     */
    public Integer getLbUserId() {
        return _lbUserId;
    }

    /**
     * Set the value of lbUserId. <br />
     * {PK : ID : NotNull : INTEGER}
     * @param lbUserId The value of lbUserId. (Nullable)
     */
    public void setLbUserId(Integer lbUserId) {
        this._lbUserId = lbUserId;
    }

    /**
     * Get the value of lbUserName. <br />
     * {NotNull : VARCHAR(80)}
     * @return The value of lbUserName. (Nullable)
     */
    public String getLbUserName() {
        return _lbUserName;
    }

    /**
     * Set the value of lbUserName. <br />
     * {NotNull : VARCHAR(80)}
     * @param lbUserName The value of lbUserName. (Nullable)
     */
    public void setLbUserName(String lbUserName) {
        this._lbUserName = lbUserName;
    }

    /**
     * Get the value of userPassword. <br />
     * {NotNull : VARCHAR(50)}
     * @return The value of userPassword. (Nullable)
     */
    public String getUserPassword() {
        return _userPassword;
    }

    /**
     * Set the value of userPassword. <br />
     * {NotNull : VARCHAR(50)}
     * @param userPassword The value of userPassword. (Nullable)
     */
    public void setUserPassword(String userPassword) {
        this._userPassword = userPassword;
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

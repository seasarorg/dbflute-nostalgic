/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs;

import java.util.*;

import dbflute.ldb.other.simpledto.*;

/**
 * The simple DTO of LIBRARY_USER that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, LB_USER_ID
 * 
 * [column]
 *     LIBRARY_ID, LB_USER_ID, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LB_USER, LIBRARY
 * 
 * [referrer-table]
 *     LENDING, LENDING_COLLECTION
 * 
 * [foreign-property]
 *     lbUser, library
 * 
 * [referrer-property]
 *     lendingList, lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class BsLibraryUserDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of libraryId. {PK : NotNull : SMALLINT : FK to LIBRARY} */
    protected Integer _libraryId;

    /** The value of lbUserId. {PK : NotNull : INTEGER : FK to LB_USER} */
    protected Integer _lbUserId;

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
    public BsLibraryUserDto() {
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    /** The entity of foreign table. */
    protected LbUserDto _parentLbUser;

    /**
     * Get the entity of foreign table of lbUser. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public LbUserDto getLbUser() {
        return _parentLbUser;
    }

    /**
     * Set the entity of foreign table of lbUser.
     * @param lbUser The entity of foreign table. (Nullable)
     */
    public void setLbUser(LbUserDto lbUser) {
        this._parentLbUser = lbUser;
    }

    /** The entity of foreign table. */
    protected LibraryDto _parentLibrary;

    /**
     * Get the entity of foreign table of library. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public LibraryDto getLibrary() {
        return _parentLibrary;
    }

    /**
     * Set the entity of foreign table of library.
     * @param library The entity of foreign table. (Nullable)
     */
    public void setLibrary(LibraryDto library) {
        this._parentLibrary = library;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    /** The list of referrer table 'LENDING'. */
    protected List<LendingDto> _childrenLendingList;

    /**
     * Get the list of referrer table. {without lazyload} <br />
     * @return The list of referrer table. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<LendingDto> getLendingList() {
        if (_childrenLendingList == null) { _childrenLendingList = new ArrayList<LendingDto>(); }
        return _childrenLendingList;
    }

    /**
     * Set the list of referrer table.
     * @param lendingList The list of referrer table. (Nullable)
     */
    public void setLendingList(List<LendingDto> lendingList) {
        _childrenLendingList = lendingList;
    }

    /** The list of referrer table 'LENDING_COLLECTION'. */
    protected List<LendingCollectionDto> _childrenLendingCollectionList;

    /**
     * Get the list of referrer table. {without lazyload} <br />
     * @return The list of referrer table. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<LendingCollectionDto> getLendingCollectionList() {
        if (_childrenLendingCollectionList == null) { _childrenLendingCollectionList = new ArrayList<LendingCollectionDto>(); }
        return _childrenLendingCollectionList;
    }

    /**
     * Set the list of referrer table.
     * @param lendingCollectionList The list of referrer table. (Nullable)
     */
    public void setLendingCollectionList(List<LendingCollectionDto> lendingCollectionList) {
        _childrenLendingCollectionList = lendingCollectionList;
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
        if (other == null || !(other instanceof BsLibraryUserDto)) { return false; }
        final BsLibraryUserDto otherEntity = (BsLibraryUserDto)other;
        if (!helpComparingValue(getLibraryId(), otherEntity.getLibraryId())) { return false; }
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
        if (this.getLibraryId() != null) { result = result + getLibraryId().hashCode(); }
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

        sb.append(delimiter).append(getLibraryId());
        sb.append(delimiter).append(getLbUserId());
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
     * Get the value of libraryId. <br />
     * {PK : NotNull : SMALLINT : FK to LIBRARY}
     * @return The value of libraryId. (Nullable)
     */
    public Integer getLibraryId() {
        return _libraryId;
    }

    /**
     * Set the value of libraryId. <br />
     * {PK : NotNull : SMALLINT : FK to LIBRARY}
     * @param libraryId The value of libraryId. (Nullable)
     */
    public void setLibraryId(Integer libraryId) {
        this._libraryId = libraryId;
    }

    /**
     * Get the value of lbUserId. <br />
     * {PK : NotNull : INTEGER : FK to LB_USER}
     * @return The value of lbUserId. (Nullable)
     */
    public Integer getLbUserId() {
        return _lbUserId;
    }

    /**
     * Set the value of lbUserId. <br />
     * {PK : NotNull : INTEGER : FK to LB_USER}
     * @param lbUserId The value of lbUserId. (Nullable)
     */
    public void setLbUserId(Integer lbUserId) {
        this._lbUserId = lbUserId;
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

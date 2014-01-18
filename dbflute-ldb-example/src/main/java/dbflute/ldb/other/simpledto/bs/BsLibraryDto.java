/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs;

import java.util.*;

import dbflute.ldb.other.simpledto.*;

/**
 * The simple DTO of LIBRARY that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LIBRARY_ID
 * 
 * [column]
 *     LIBRARY_ID, LIBRARY_NAME, LIBRARY_TYPE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     LIBRARY_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     LIBRARY_TYPE_LOOKUP, NEXT_LIBRARY(AsNext), LIBRARY_USER(AsUser)
 * 
 * [referrer-table]
 *     COLLECTION, LIBRARY_USER, NEXT_LIBRARY
 * 
 * [foreign-property]
 *     libraryTypeLookup, nextLibraryAsNext, libraryUserAsUser
 * 
 * [referrer-property]
 *     collectionList, libraryUserList, nextLibraryByNextIdList, nextLibraryByBaseIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class BsLibraryDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of libraryId. {PK : ID : NotNull : SMALLINT : FK to NEXT_LIBRARY} */
    protected Integer _libraryId;

    /** The value of libraryName. {UQ : NotNull : VARCHAR(80)} */
    protected String _libraryName;

    /** The value of libraryTypeCode. {NotNull : CHAR(3) : FK to LIBRARY_TYPE_LOOKUP} */
    protected String _libraryTypeCode;

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
    public BsLibraryDto() {
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    /** The entity of foreign table. */
    protected LibraryTypeLookupDto _parentLibraryTypeLookup;

    /**
     * Get the entity of foreign table of libraryTypeLookup. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public LibraryTypeLookupDto getLibraryTypeLookup() {
        return _parentLibraryTypeLookup;
    }

    /**
     * Set the entity of foreign table of libraryTypeLookup.
     * @param libraryTypeLookup The entity of foreign table. (Nullable)
     */
    public void setLibraryTypeLookup(LibraryTypeLookupDto libraryTypeLookup) {
        this._parentLibraryTypeLookup = libraryTypeLookup;
    }

    /** The entity of foreign table. */
    protected NextLibraryDto _parentNextLibraryAsNext;

    /**
     * Get the entity of foreign table of nextLibraryAsNext. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public NextLibraryDto getNextLibraryAsNext() {
        return _parentNextLibraryAsNext;
    }

    /**
     * Set the entity of foreign table of nextLibraryAsNext.
     * @param nextLibraryAsNext The entity of foreign table. (Nullable)
     */
    public void setNextLibraryAsNext(NextLibraryDto nextLibraryAsNext) {
        this._parentNextLibraryAsNext = nextLibraryAsNext;
    }

    /** The entity of foreign table. */
    protected LibraryUserDto _parentLibraryUserAsUser;

    /**
     * Get the entity of foreign table of libraryUserAsUser. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public LibraryUserDto getLibraryUserAsUser() {
        return _parentLibraryUserAsUser;
    }

    /**
     * Set the entity of foreign table of libraryUserAsUser.
     * @param libraryUserAsUser The entity of foreign table. (Nullable)
     */
    public void setLibraryUserAsUser(LibraryUserDto libraryUserAsUser) {
        this._parentLibraryUserAsUser = libraryUserAsUser;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    /** The list of referrer table 'COLLECTION'. */
    protected List<CollectionDto> _childrenCollectionList;

    /**
     * Get the list of referrer table. {without lazyload} <br />
     * @return The list of referrer table. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<CollectionDto> getCollectionList() {
        if (_childrenCollectionList == null) { _childrenCollectionList = new ArrayList<CollectionDto>(); }
        return _childrenCollectionList;
    }

    /**
     * Set the list of referrer table.
     * @param collectionList The list of referrer table. (Nullable)
     */
    public void setCollectionList(List<CollectionDto> collectionList) {
        _childrenCollectionList = collectionList;
    }

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

    /** The list of referrer table 'NEXT_LIBRARY'. */
    protected List<NextLibraryDto> _childrenNextLibraryByNextIdList;

    /**
     * Get the list of referrer table. {without lazyload} <br />
     * @return The list of referrer table. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<NextLibraryDto> getNextLibraryByNextIdList() {
        if (_childrenNextLibraryByNextIdList == null) { _childrenNextLibraryByNextIdList = new ArrayList<NextLibraryDto>(); }
        return _childrenNextLibraryByNextIdList;
    }

    /**
     * Set the list of referrer table.
     * @param nextLibraryByNextIdList The list of referrer table. (Nullable)
     */
    public void setNextLibraryByNextIdList(List<NextLibraryDto> nextLibraryByNextIdList) {
        _childrenNextLibraryByNextIdList = nextLibraryByNextIdList;
    }

    /** The list of referrer table 'NEXT_LIBRARY'. */
    protected List<NextLibraryDto> _childrenNextLibraryByBaseIdList;

    /**
     * Get the list of referrer table. {without lazyload} <br />
     * @return The list of referrer table. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<NextLibraryDto> getNextLibraryByBaseIdList() {
        if (_childrenNextLibraryByBaseIdList == null) { _childrenNextLibraryByBaseIdList = new ArrayList<NextLibraryDto>(); }
        return _childrenNextLibraryByBaseIdList;
    }

    /**
     * Set the list of referrer table.
     * @param nextLibraryByBaseIdList The list of referrer table. (Nullable)
     */
    public void setNextLibraryByBaseIdList(List<NextLibraryDto> nextLibraryByBaseIdList) {
        _childrenNextLibraryByBaseIdList = nextLibraryByBaseIdList;
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
        if (other == null || !(other instanceof BsLibraryDto)) { return false; }
        final BsLibraryDto otherEntity = (BsLibraryDto)other;
        if (!helpComparingValue(getLibraryId(), otherEntity.getLibraryId())) { return false; }
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
        sb.append(delimiter).append(getLibraryName());
        sb.append(delimiter).append(getLibraryTypeCode());
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
     * {PK : ID : NotNull : SMALLINT : FK to NEXT_LIBRARY}
     * @return The value of libraryId. (Nullable)
     */
    public Integer getLibraryId() {
        return _libraryId;
    }

    /**
     * Set the value of libraryId. <br />
     * {PK : ID : NotNull : SMALLINT : FK to NEXT_LIBRARY}
     * @param libraryId The value of libraryId. (Nullable)
     */
    public void setLibraryId(Integer libraryId) {
        this._libraryId = libraryId;
    }

    /**
     * Get the value of libraryName. <br />
     * {UQ : NotNull : VARCHAR(80)}
     * @return The value of libraryName. (Nullable)
     */
    public String getLibraryName() {
        return _libraryName;
    }

    /**
     * Set the value of libraryName. <br />
     * {UQ : NotNull : VARCHAR(80)}
     * @param libraryName The value of libraryName. (Nullable)
     */
    public void setLibraryName(String libraryName) {
        this._libraryName = libraryName;
    }

    /**
     * Get the value of libraryTypeCode. <br />
     * {NotNull : CHAR(3) : FK to LIBRARY_TYPE_LOOKUP}
     * @return The value of libraryTypeCode. (Nullable)
     */
    public String getLibraryTypeCode() {
        return _libraryTypeCode;
    }

    /**
     * Set the value of libraryTypeCode. <br />
     * {NotNull : CHAR(3) : FK to LIBRARY_TYPE_LOOKUP}
     * @param libraryTypeCode The value of libraryTypeCode. (Nullable)
     */
    public void setLibraryTypeCode(String libraryTypeCode) {
        this._libraryTypeCode = libraryTypeCode;
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

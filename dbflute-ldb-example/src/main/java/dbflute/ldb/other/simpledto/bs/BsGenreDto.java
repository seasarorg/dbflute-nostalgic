/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs;

import java.util.*;

import dbflute.ldb.other.simpledto.*;

/**
 * The simple DTO of GENRE that the type is TABLE.
 * <pre>
 * [primary-key]
 *     GENRE_CODE
 * 
 * [column]
 *     GENRE_CODE, GENRE_NAME, HIERARCHY_LEVEL, HIERARCHY_ORDER, PARENT_GENRE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     GENRE
 * 
 * [referrer-table]
 *     BOOK, GENRE
 * 
 * [foreign-property]
 *     genreSelf
 * 
 * [referrer-property]
 *     bookList, genreSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class BsGenreDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of genreCode. {PK : NotNull : VARCHAR(24)} */
    protected String _genreCode;

    /** The value of genreName. {NotNull : VARCHAR(80)} */
    protected String _genreName;

    /** The value of hierarchyLevel. {NotNull : NUMERIC(9)} */
    protected Integer _hierarchyLevel;

    /** The value of hierarchyOrder. {NotNull : NUMERIC(10)} */
    protected Long _hierarchyOrder;

    /** The value of parentGenreCode. {VARCHAR(24) : FK to GENRE} */
    protected String _parentGenreCode;

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
    public BsGenreDto() {
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    /** The entity of foreign table. */
    protected GenreDto _parentGenreSelf;

    /**
     * Get the entity of foreign table of genreSelf. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public GenreDto getGenreSelf() {
        return _parentGenreSelf;
    }

    /**
     * Set the entity of foreign table of genreSelf.
     * @param genreSelf The entity of foreign table. (Nullable)
     */
    public void setGenreSelf(GenreDto genreSelf) {
        this._parentGenreSelf = genreSelf;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    /** The list of referrer table 'BOOK'. */
    protected List<BookDto> _childrenBookList;

    /**
     * Get the list of referrer table. {without lazyload} <br />
     * @return The list of referrer table. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<BookDto> getBookList() {
        if (_childrenBookList == null) { _childrenBookList = new ArrayList<BookDto>(); }
        return _childrenBookList;
    }

    /**
     * Set the list of referrer table.
     * @param bookList The list of referrer table. (Nullable)
     */
    public void setBookList(List<BookDto> bookList) {
        _childrenBookList = bookList;
    }

    /** The list of referrer table 'GENRE'. */
    protected List<GenreDto> _childrenGenreSelfList;

    /**
     * Get the list of referrer table. {without lazyload} <br />
     * @return The list of referrer table. (NotNull: If it's not loaded yet, initializes the list instance of referrer as empty and returns it.)
     */
    public List<GenreDto> getGenreSelfList() {
        if (_childrenGenreSelfList == null) { _childrenGenreSelfList = new ArrayList<GenreDto>(); }
        return _childrenGenreSelfList;
    }

    /**
     * Set the list of referrer table.
     * @param genreSelfList The list of referrer table. (Nullable)
     */
    public void setGenreSelfList(List<GenreDto> genreSelfList) {
        _childrenGenreSelfList = genreSelfList;
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
        if (other == null || !(other instanceof BsGenreDto)) { return false; }
        final BsGenreDto otherEntity = (BsGenreDto)other;
        if (!helpComparingValue(getGenreCode(), otherEntity.getGenreCode())) { return false; }
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
        if (this.getGenreCode() != null) { result = result + getGenreCode().hashCode(); }
        return result;
    }


    /**
     * {@inheritDoc}
     * @return Column-value map-string. (NotNull)
     */
    public String toString() {
        final String delimiter = ",";
        final StringBuilder sb = new StringBuilder();

        sb.append(delimiter).append(getGenreCode());
        sb.append(delimiter).append(getGenreName());
        sb.append(delimiter).append(getHierarchyLevel());
        sb.append(delimiter).append(getHierarchyOrder());
        sb.append(delimiter).append(getParentGenreCode());
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
     * Get the value of genreCode. <br />
     * {PK : NotNull : VARCHAR(24)}
     * @return The value of genreCode. (Nullable)
     */
    public String getGenreCode() {
        return _genreCode;
    }

    /**
     * Set the value of genreCode. <br />
     * {PK : NotNull : VARCHAR(24)}
     * @param genreCode The value of genreCode. (Nullable)
     */
    public void setGenreCode(String genreCode) {
        this._genreCode = genreCode;
    }

    /**
     * Get the value of genreName. <br />
     * {NotNull : VARCHAR(80)}
     * @return The value of genreName. (Nullable)
     */
    public String getGenreName() {
        return _genreName;
    }

    /**
     * Set the value of genreName. <br />
     * {NotNull : VARCHAR(80)}
     * @param genreName The value of genreName. (Nullable)
     */
    public void setGenreName(String genreName) {
        this._genreName = genreName;
    }

    /**
     * Get the value of hierarchyLevel. <br />
     * {NotNull : NUMERIC(9)}
     * @return The value of hierarchyLevel. (Nullable)
     */
    public Integer getHierarchyLevel() {
        return _hierarchyLevel;
    }

    /**
     * Set the value of hierarchyLevel. <br />
     * {NotNull : NUMERIC(9)}
     * @param hierarchyLevel The value of hierarchyLevel. (Nullable)
     */
    public void setHierarchyLevel(Integer hierarchyLevel) {
        this._hierarchyLevel = hierarchyLevel;
    }

    /**
     * Get the value of hierarchyOrder. <br />
     * {NotNull : NUMERIC(10)}
     * @return The value of hierarchyOrder. (Nullable)
     */
    public Long getHierarchyOrder() {
        return _hierarchyOrder;
    }

    /**
     * Set the value of hierarchyOrder. <br />
     * {NotNull : NUMERIC(10)}
     * @param hierarchyOrder The value of hierarchyOrder. (Nullable)
     */
    public void setHierarchyOrder(Long hierarchyOrder) {
        this._hierarchyOrder = hierarchyOrder;
    }

    /**
     * Get the value of parentGenreCode. <br />
     * {VARCHAR(24) : FK to GENRE}
     * @return The value of parentGenreCode. (Nullable)
     */
    public String getParentGenreCode() {
        return _parentGenreCode;
    }

    /**
     * Set the value of parentGenreCode. <br />
     * {VARCHAR(24) : FK to GENRE}
     * @param parentGenreCode The value of parentGenreCode. (Nullable)
     */
    public void setParentGenreCode(String parentGenreCode) {
        this._parentGenreCode = parentGenreCode;
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

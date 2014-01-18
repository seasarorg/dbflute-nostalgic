/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs;

import java.util.*;

import dbflute.ldb.other.simpledto.*;

/**
 * The simple DTO of COLLECTION that the type is TABLE.
 * <pre>
 * [primary-key]
 *     COLLECTION_ID
 * 
 * [column]
 *     COLLECTION_ID, LIBRARY_ID, BOOK_ID, ARRIVAL_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     COLLECTION_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     BOOK, LIBRARY, COLLECTION_STATUS(AsOne)
 * 
 * [referrer-table]
 *     LENDING_COLLECTION, COLLECTION_STATUS
 * 
 * [foreign-property]
 *     book, library, collectionStatusAsOne
 * 
 * [referrer-property]
 *     lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class BsCollectionDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of collectionId. {PK : ID : NotNull : INTEGER} */
    protected Integer _collectionId;

    /** The value of libraryId. {UQ : NotNull : SMALLINT : FK to LIBRARY} */
    protected Integer _libraryId;

    /** The value of bookId. {UQ : NotNull : INTEGER : FK to BOOK} */
    protected Integer _bookId;

    /** The value of arrivalDate. {NotNull : TIMESTAMP} */
    protected java.sql.Timestamp _arrivalDate;

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
    public BsCollectionDto() {
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    /** The entity of foreign table. */
    protected BookDto _parentBook;

    /**
     * Get the entity of foreign table of book. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public BookDto getBook() {
        return _parentBook;
    }

    /**
     * Set the entity of foreign table of book.
     * @param book The entity of foreign table. (Nullable)
     */
    public void setBook(BookDto book) {
        this._parentBook = book;
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

    /** The entity of referrer-as-one table. */
    protected CollectionStatusDto _childrenCollectionStatusList;

    /**
     * Get the entity of referrer-as-one table of collectionStatusAsOne. {without lazy-load} <br />
     * @return The entity of referrer-as-one table. (Nullable: If the foreign key does not have 'NotNull' constraint, please check null.)
     * @exception IllegalStateException When the size of the referrer table list is duplicate.
     */
    public CollectionStatusDto getCollectionStatusAsOne() {
        return _childrenCollectionStatusList;
    }

    /**
     * Set the entity of referrer-as-one table of collectionStatusAsOne.
     * @param collectionStatusAsOne The entity of referrer-as-one table. (Nullable)
     */
    public void setCollectionStatusAsOne(CollectionStatusDto collectionStatusAsOne) {
        _childrenCollectionStatusList = collectionStatusAsOne;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
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
        if (other == null || !(other instanceof BsCollectionDto)) { return false; }
        final BsCollectionDto otherEntity = (BsCollectionDto)other;
        if (!helpComparingValue(getCollectionId(), otherEntity.getCollectionId())) { return false; }
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
        if (this.getCollectionId() != null) { result = result + getCollectionId().hashCode(); }
        return result;
    }


    /**
     * {@inheritDoc}
     * @return Column-value map-string. (NotNull)
     */
    public String toString() {
        final String delimiter = ",";
        final StringBuilder sb = new StringBuilder();

        sb.append(delimiter).append(getCollectionId());
        sb.append(delimiter).append(getLibraryId());
        sb.append(delimiter).append(getBookId());
        sb.append(delimiter).append(getArrivalDate());
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
     * Get the value of collectionId. <br />
     * {PK : ID : NotNull : INTEGER}
     * @return The value of collectionId. (Nullable)
     */
    public Integer getCollectionId() {
        return _collectionId;
    }

    /**
     * Set the value of collectionId. <br />
     * {PK : ID : NotNull : INTEGER}
     * @param collectionId The value of collectionId. (Nullable)
     */
    public void setCollectionId(Integer collectionId) {
        this._collectionId = collectionId;
    }

    /**
     * Get the value of libraryId. <br />
     * {UQ : NotNull : SMALLINT : FK to LIBRARY}
     * @return The value of libraryId. (Nullable)
     */
    public Integer getLibraryId() {
        return _libraryId;
    }

    /**
     * Set the value of libraryId. <br />
     * {UQ : NotNull : SMALLINT : FK to LIBRARY}
     * @param libraryId The value of libraryId. (Nullable)
     */
    public void setLibraryId(Integer libraryId) {
        this._libraryId = libraryId;
    }

    /**
     * Get the value of bookId. <br />
     * {UQ : NotNull : INTEGER : FK to BOOK}
     * @return The value of bookId. (Nullable)
     */
    public Integer getBookId() {
        return _bookId;
    }

    /**
     * Set the value of bookId. <br />
     * {UQ : NotNull : INTEGER : FK to BOOK}
     * @param bookId The value of bookId. (Nullable)
     */
    public void setBookId(Integer bookId) {
        this._bookId = bookId;
    }

    /**
     * Get the value of arrivalDate. <br />
     * {NotNull : TIMESTAMP}
     * @return The value of arrivalDate. (Nullable)
     */
    public java.sql.Timestamp getArrivalDate() {
        return _arrivalDate;
    }

    /**
     * Set the value of arrivalDate. <br />
     * {NotNull : TIMESTAMP}
     * @param arrivalDate The value of arrivalDate. (Nullable)
     */
    public void setArrivalDate(java.sql.Timestamp arrivalDate) {
        this._arrivalDate = arrivalDate;
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

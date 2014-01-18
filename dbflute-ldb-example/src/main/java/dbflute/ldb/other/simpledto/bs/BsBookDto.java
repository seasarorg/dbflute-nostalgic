/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.bs;

import java.util.*;

import dbflute.ldb.other.simpledto.*;

/**
 * The simple DTO of BOOK that the type is TABLE.
 * <pre>
 * [primary-key]
 *     BOOK_ID
 * 
 * [column]
 *     BOOK_ID, ISBN, BOOK_NAME, AUTHOR_ID, PUBLISHER_ID, GENRE_CODE, OPENING_PART, MAX_LENDING_DATE_COUNT, OUT_OF_USER_SELECT_YN, OUT_OF_USER_SELECT_REASON, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     BOOK_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     AUTHOR, GENRE, PUBLISHER, COLLECTION_STATUS_LOOKUP(AsNonExist)
 * 
 * [referrer-table]
 *     COLLECTION
 * 
 * [foreign-property]
 *     author, genre, publisher, collectionStatusLookupAsNonExist
 * 
 * [referrer-property]
 *     collectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class BsBookDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of bookId. {PK : ID : NotNull : INTEGER} */
    protected Integer _bookId;

    /** The value of isbn. {UQ : NotNull : VARCHAR(20)} */
    protected String _isbn;

    /** The value of bookName. {NotNull : VARCHAR(80)} */
    protected String _bookName;

    /** The value of authorId. {NotNull : INTEGER : FK to AUTHOR} */
    protected Integer _authorId;

    /** The value of publisherId. {NotNull : INTEGER : FK to PUBLISHER} */
    protected Integer _publisherId;

    /** The value of genreCode. {VARCHAR(24) : FK to GENRE} */
    protected String _genreCode;

    /** The value of openingPart. {CLOB} */
    protected String _openingPart;

    /** The value of maxLendingDateCount. {NotNull : SMALLINT} */
    protected Integer _maxLendingDateCount;

    /** The value of outOfUserSelectYn. {NotNull : CHAR(1)} */
    protected String _outOfUserSelectYn;

    /** The value of outOfUserSelectReason. {VARCHAR(200)} */
    protected String _outOfUserSelectReason;

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
    public BsBookDto() {
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    /** The entity of foreign table. */
    protected AuthorDto _parentAuthor;

    /**
     * Get the entity of foreign table of author. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public AuthorDto getAuthor() {
        return _parentAuthor;
    }

    /**
     * Set the entity of foreign table of author.
     * @param author The entity of foreign table. (Nullable)
     */
    public void setAuthor(AuthorDto author) {
        this._parentAuthor = author;
    }

    /** The entity of foreign table. */
    protected GenreDto _parentGenre;

    /**
     * Get the entity of foreign table of genre. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public GenreDto getGenre() {
        return _parentGenre;
    }

    /**
     * Set the entity of foreign table of genre.
     * @param genre The entity of foreign table. (Nullable)
     */
    public void setGenre(GenreDto genre) {
        this._parentGenre = genre;
    }

    /** The entity of foreign table. */
    protected PublisherDto _parentPublisher;

    /**
     * Get the entity of foreign table of publisher. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public PublisherDto getPublisher() {
        return _parentPublisher;
    }

    /**
     * Set the entity of foreign table of publisher.
     * @param publisher The entity of foreign table. (Nullable)
     */
    public void setPublisher(PublisherDto publisher) {
        this._parentPublisher = publisher;
    }

    /** The entity of foreign table. */
    protected CollectionStatusLookupDto _parentCollectionStatusLookupAsNonExist;

    /**
     * Get the entity of foreign table of collectionStatusLookupAsNonExist. {without lazyload}
     * @return The entity of foreign table. (Nullable: If the foreign key does not have NotNull-constraint, please check null.)
     */
    public CollectionStatusLookupDto getCollectionStatusLookupAsNonExist() {
        return _parentCollectionStatusLookupAsNonExist;
    }

    /**
     * Set the entity of foreign table of collectionStatusLookupAsNonExist.
     * @param collectionStatusLookupAsNonExist The entity of foreign table. (Nullable)
     */
    public void setCollectionStatusLookupAsNonExist(CollectionStatusLookupDto collectionStatusLookupAsNonExist) {
        this._parentCollectionStatusLookupAsNonExist = collectionStatusLookupAsNonExist;
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
        if (other == null || !(other instanceof BsBookDto)) { return false; }
        final BsBookDto otherEntity = (BsBookDto)other;
        if (!helpComparingValue(getBookId(), otherEntity.getBookId())) { return false; }
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
        if (this.getBookId() != null) { result = result + getBookId().hashCode(); }
        return result;
    }


    /**
     * {@inheritDoc}
     * @return Column-value map-string. (NotNull)
     */
    public String toString() {
        final String delimiter = ",";
        final StringBuilder sb = new StringBuilder();

        sb.append(delimiter).append(getBookId());
        sb.append(delimiter).append(getIsbn());
        sb.append(delimiter).append(getBookName());
        sb.append(delimiter).append(getAuthorId());
        sb.append(delimiter).append(getPublisherId());
        sb.append(delimiter).append(getGenreCode());
        sb.append(delimiter).append(getOpeningPart());
        sb.append(delimiter).append(getMaxLendingDateCount());
        sb.append(delimiter).append(getOutOfUserSelectYn());
        sb.append(delimiter).append(getOutOfUserSelectReason());
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
     * Get the value of bookId. <br />
     * {PK : ID : NotNull : INTEGER}
     * @return The value of bookId. (Nullable)
     */
    public Integer getBookId() {
        return _bookId;
    }

    /**
     * Set the value of bookId. <br />
     * {PK : ID : NotNull : INTEGER}
     * @param bookId The value of bookId. (Nullable)
     */
    public void setBookId(Integer bookId) {
        this._bookId = bookId;
    }

    /**
     * Get the value of isbn. <br />
     * {UQ : NotNull : VARCHAR(20)}
     * @return The value of isbn. (Nullable)
     */
    public String getIsbn() {
        return _isbn;
    }

    /**
     * Set the value of isbn. <br />
     * {UQ : NotNull : VARCHAR(20)}
     * @param isbn The value of isbn. (Nullable)
     */
    public void setIsbn(String isbn) {
        this._isbn = isbn;
    }

    /**
     * Get the value of bookName. <br />
     * {NotNull : VARCHAR(80)}
     * @return The value of bookName. (Nullable)
     */
    public String getBookName() {
        return _bookName;
    }

    /**
     * Set the value of bookName. <br />
     * {NotNull : VARCHAR(80)}
     * @param bookName The value of bookName. (Nullable)
     */
    public void setBookName(String bookName) {
        this._bookName = bookName;
    }

    /**
     * Get the value of authorId. <br />
     * {NotNull : INTEGER : FK to AUTHOR}
     * @return The value of authorId. (Nullable)
     */
    public Integer getAuthorId() {
        return _authorId;
    }

    /**
     * Set the value of authorId. <br />
     * {NotNull : INTEGER : FK to AUTHOR}
     * @param authorId The value of authorId. (Nullable)
     */
    public void setAuthorId(Integer authorId) {
        this._authorId = authorId;
    }

    /**
     * Get the value of publisherId. <br />
     * {NotNull : INTEGER : FK to PUBLISHER}
     * @return The value of publisherId. (Nullable)
     */
    public Integer getPublisherId() {
        return _publisherId;
    }

    /**
     * Set the value of publisherId. <br />
     * {NotNull : INTEGER : FK to PUBLISHER}
     * @param publisherId The value of publisherId. (Nullable)
     */
    public void setPublisherId(Integer publisherId) {
        this._publisherId = publisherId;
    }

    /**
     * Get the value of genreCode. <br />
     * {VARCHAR(24) : FK to GENRE}
     * @return The value of genreCode. (Nullable)
     */
    public String getGenreCode() {
        return _genreCode;
    }

    /**
     * Set the value of genreCode. <br />
     * {VARCHAR(24) : FK to GENRE}
     * @param genreCode The value of genreCode. (Nullable)
     */
    public void setGenreCode(String genreCode) {
        this._genreCode = genreCode;
    }

    /**
     * Get the value of openingPart. <br />
     * {CLOB}
     * @return The value of openingPart. (Nullable)
     */
    public String getOpeningPart() {
        return _openingPart;
    }

    /**
     * Set the value of openingPart. <br />
     * {CLOB}
     * @param openingPart The value of openingPart. (Nullable)
     */
    public void setOpeningPart(String openingPart) {
        this._openingPart = openingPart;
    }

    /**
     * Get the value of maxLendingDateCount. <br />
     * {NotNull : SMALLINT}
     * @return The value of maxLendingDateCount. (Nullable)
     */
    public Integer getMaxLendingDateCount() {
        return _maxLendingDateCount;
    }

    /**
     * Set the value of maxLendingDateCount. <br />
     * {NotNull : SMALLINT}
     * @param maxLendingDateCount The value of maxLendingDateCount. (Nullable)
     */
    public void setMaxLendingDateCount(Integer maxLendingDateCount) {
        this._maxLendingDateCount = maxLendingDateCount;
    }

    /**
     * Get the value of outOfUserSelectYn. <br />
     * {NotNull : CHAR(1)}
     * @return The value of outOfUserSelectYn. (Nullable)
     */
    public String getOutOfUserSelectYn() {
        return _outOfUserSelectYn;
    }

    /**
     * Set the value of outOfUserSelectYn. <br />
     * {NotNull : CHAR(1)}
     * @param outOfUserSelectYn The value of outOfUserSelectYn. (Nullable)
     */
    public void setOutOfUserSelectYn(String outOfUserSelectYn) {
        this._outOfUserSelectYn = outOfUserSelectYn;
    }

    /**
     * Get the value of outOfUserSelectReason. <br />
     * {VARCHAR(200)}
     * @return The value of outOfUserSelectReason. (Nullable)
     */
    public String getOutOfUserSelectReason() {
        return _outOfUserSelectReason;
    }

    /**
     * Set the value of outOfUserSelectReason. <br />
     * {VARCHAR(200)}
     * @param outOfUserSelectReason The value of outOfUserSelectReason. (Nullable)
     */
    public void setOutOfUserSelectReason(String outOfUserSelectReason) {
        this._outOfUserSelectReason = outOfUserSelectReason;
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

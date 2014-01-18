
package dbflute.ldb.bsentity;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;

import dbflute.ldb.allcommon.helper.LdMapListString;
import dbflute.ldb.allcommon.helper.LdMapListStringImpl;


import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;

/**
 * The entity of BOOK.
 * 
 * <pre>
 * [primary-key]
 *     BOOK_ID
 * 
 * [column-property]
 *     BOOK_ID, ISBN_NO, BOOK_NAME, AUTHOR_ID, PUBLISHER_ID, MAX_LENDING_DATE_COUNT, GENRE_CODE, OPENING_PART, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     author, publisher, genre
 * 
 * [refferer-property]
 *     collectionList
 * 
 * [sequence]
 *     BOOK_BOOK_ID_INC
 * 
 * [identity]
 *     bookId
 * 
 * [update-date]
 *     UTime
 * 
 * [version-no]
 *     
 * 
 * </pre>
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdBsBook implements LdEntityDefinedCommonColumn, java.io.Serializable {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao */
    public static final String TABLE = "BOOK";

    
    /** TIMESTAMP-Annotation */
    public static final String TIMESTAMP_PROPERTY = "uTime";
    
    /** ID-Annotation */
    public static final String bookId_ID = "identity";

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    
    /** The value of bookId. */
    protected java.math.BigDecimal _bookId;

    /** Has the setter of bookId been invoked? */
    protected boolean _isSetterInvokedBookId;
    
    /** The value of isbnNo. */
    protected String _isbnNo;

    /** Has the setter of isbnNo been invoked? */
    protected boolean _isSetterInvokedIsbnNo;
    
    /** The value of bookName. */
    protected String _bookName;

    /** Has the setter of bookName been invoked? */
    protected boolean _isSetterInvokedBookName;
    
    /** The value of authorId. */
    protected java.math.BigDecimal _authorId;

    /** Has the setter of authorId been invoked? */
    protected boolean _isSetterInvokedAuthorId;
    
    /** The value of publisherId. */
    protected java.math.BigDecimal _publisherId;

    /** Has the setter of publisherId been invoked? */
    protected boolean _isSetterInvokedPublisherId;
    
    /** The value of maxLendingDateCount. */
    protected java.math.BigDecimal _maxLendingDateCount;

    /** Has the setter of maxLendingDateCount been invoked? */
    protected boolean _isSetterInvokedMaxLendingDateCount;
    
    /** The value of genreCode. */
    protected String _genreCode;

    /** Has the setter of genreCode been invoked? */
    protected boolean _isSetterInvokedGenreCode;
    
    /** The value of openingPart. */
    protected String _openingPart;

    /** Has the setter of openingPart been invoked? */
    protected boolean _isSetterInvokedOpeningPart;
    
    /** The value of rTime. */
    protected java.sql.Timestamp _rTime;

    /** Has the setter of rTime been invoked? */
    protected boolean _isSetterInvokedRTime;
    
    /** The value of uTime. */
    protected java.sql.Timestamp _uTime;

    /** Has the setter of uTime been invoked? */
    protected boolean _isSetterInvokedUTime;
    
    /** The value of rStaff. */
    protected String _rStaff;

    /** Has the setter of rStaff been invoked? */
    protected boolean _isSetterInvokedRStaff;
    
    /** The value of uStaff. */
    protected String _uStaff;

    /** Has the setter of uStaff been invoked? */
    protected boolean _isSetterInvokedUStaff;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdBsBook() {
    }

    // =====================================================================================
    //                                                                                DBMeta
    //                                                                                ======
    /**
     * This method implements the method that is declared at super.
     * 
     * @return DBMeta. (NotNull)
     */
    public LdDBMeta getDBMeta() {
        return LdBookDbm.getInstance();
    }

    // =====================================================================================
    //                                                                            Table Name
    //                                                                            ==========
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Table db-name. (NotNull)
     */
    public String getTableDbName() {
        return getDBMeta().getTableDbName();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Table cap-prop-name. (NotNull)
     */
    public String getTableCapPropName() {
        return getDBMeta().getTableCapPropName();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Table uncap-prop-name. (NotNull)
     */
    public String getTableUncapPropName() {
        return getDBMeta().getTableUncapPropName();
    }

    // =====================================================================================
    //                                                                         Getter Setter
    //                                                                         =============

    /**
     * Get the value of bookId.
     * 
     * @return The value of bookId. (Nullable)
     */
    public java.math.BigDecimal getBookId() {
        return _bookId;
    }

    /**
     * Set the value of bookId.
     * 
     * @param v The value of bookId. (Nullable)
     */
    public void setBookId(java.math.BigDecimal v) {
        _isSetterInvokedBookId = true;
        _bookId = v;
    }

    /**
     * Get the value of isbnNo.
     * 
     * @return The value of isbnNo. (Nullable)
     */
    public String getIsbnNo() {
        return _isbnNo;
    }

    /**
     * Set the value of isbnNo.
     * 
     * @param v The value of isbnNo. (Nullable)
     */
    public void setIsbnNo(String v) {
        _isSetterInvokedIsbnNo = true;
        _isbnNo = v;
    }

    /**
     * Get the value of bookName.
     * 
     * @return The value of bookName. (Nullable)
     */
    public String getBookName() {
        return _bookName;
    }

    /**
     * Set the value of bookName.
     * 
     * @param v The value of bookName. (Nullable)
     */
    public void setBookName(String v) {
        _isSetterInvokedBookName = true;
        _bookName = v;
    }

    /**
     * Get the value of authorId.
     * 
     * @return The value of authorId. (Nullable)
     */
    public java.math.BigDecimal getAuthorId() {
        return _authorId;
    }

    /**
     * Set the value of authorId.
     * 
     * @param v The value of authorId. (Nullable)
     */
    public void setAuthorId(java.math.BigDecimal v) {
        _isSetterInvokedAuthorId = true;
        _authorId = v;
    }

    /**
     * Get the value of publisherId.
     * 
     * @return The value of publisherId. (Nullable)
     */
    public java.math.BigDecimal getPublisherId() {
        return _publisherId;
    }

    /**
     * Set the value of publisherId.
     * 
     * @param v The value of publisherId. (Nullable)
     */
    public void setPublisherId(java.math.BigDecimal v) {
        _isSetterInvokedPublisherId = true;
        _publisherId = v;
    }

    /**
     * Get the value of maxLendingDateCount.
     * 
     * @return The value of maxLendingDateCount. (Nullable)
     */
    public java.math.BigDecimal getMaxLendingDateCount() {
        return _maxLendingDateCount;
    }

    /**
     * Set the value of maxLendingDateCount.
     * 
     * @param v The value of maxLendingDateCount. (Nullable)
     */
    public void setMaxLendingDateCount(java.math.BigDecimal v) {
        _isSetterInvokedMaxLendingDateCount = true;
        _maxLendingDateCount = v;
    }

    /**
     * Get the value of genreCode.
     * 
     * @return The value of genreCode. (Nullable)
     */
    public String getGenreCode() {
        return _genreCode;
    }

    /**
     * Set the value of genreCode.
     * 
     * @param v The value of genreCode. (Nullable)
     */
    public void setGenreCode(String v) {
        _isSetterInvokedGenreCode = true;
        _genreCode = v;
    }

    /**
     * Get the value of openingPart.
     * 
     * @return The value of openingPart. (Nullable)
     */
    public String getOpeningPart() {
        return _openingPart;
    }

    /**
     * Set the value of openingPart.
     * 
     * @param v The value of openingPart. (Nullable)
     */
    public void setOpeningPart(String v) {
        _isSetterInvokedOpeningPart = true;
        _openingPart = v;
    }

    /**
     * Get the value of rTime.
     * 
     * @return The value of rTime. (Nullable)
     */
    public java.sql.Timestamp getRTime() {
        return _rTime;
    }

    /**
     * Set the value of rTime.
     * 
     * @param v The value of rTime. (Nullable)
     */
    public void setRTime(java.sql.Timestamp v) {
        _isSetterInvokedRTime = true;
        _rTime = v;
    }

    /**
     * Get the value of uTime.
     * 
     * @return The value of uTime. (Nullable)
     */
    public java.sql.Timestamp getUTime() {
        return _uTime;
    }

    /**
     * Set the value of uTime.
     * 
     * @param v The value of uTime. (Nullable)
     */
    public void setUTime(java.sql.Timestamp v) {
        _isSetterInvokedUTime = true;
        _uTime = v;
    }

    /**
     * Get the value of rStaff.
     * 
     * @return The value of rStaff. (Nullable)
     */
    public String getRStaff() {
        return _rStaff;
    }

    /**
     * Set the value of rStaff.
     * 
     * @param v The value of rStaff. (Nullable)
     */
    public void setRStaff(String v) {
        _isSetterInvokedRStaff = true;
        _rStaff = v;
    }

    /**
     * Get the value of uStaff.
     * 
     * @return The value of uStaff. (Nullable)
     */
    public String getUStaff() {
        return _uStaff;
    }

    /**
     * Set the value of uStaff.
     * 
     * @param v The value of uStaff. (Nullable)
     */
    public void setUStaff(String v) {
        _isSetterInvokedUStaff = true;
        _uStaff = v;
    }

    // =====================================================================================
    //                                                                Invoking Determination
    //                                                                ======================

    /**
     * Has the setter of bookId been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedBookId() {
        return _isSetterInvokedBookId;
    }

    /**
     * Has the setter of isbnNo been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedIsbnNo() {
        return _isSetterInvokedIsbnNo;
    }

    /**
     * Has the setter of bookName been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedBookName() {
        return _isSetterInvokedBookName;
    }

    /**
     * Has the setter of authorId been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedAuthorId() {
        return _isSetterInvokedAuthorId;
    }

    /**
     * Has the setter of publisherId been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedPublisherId() {
        return _isSetterInvokedPublisherId;
    }

    /**
     * Has the setter of maxLendingDateCount been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedMaxLendingDateCount() {
        return _isSetterInvokedMaxLendingDateCount;
    }

    /**
     * Has the setter of genreCode been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedGenreCode() {
        return _isSetterInvokedGenreCode;
    }

    /**
     * Has the setter of openingPart been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedOpeningPart() {
        return _isSetterInvokedOpeningPart;
    }

    /**
     * Has the setter of rTime been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedRTime() {
        return _isSetterInvokedRTime;
    }

    /**
     * Has the setter of uTime been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedUTime() {
        return _isSetterInvokedUTime;
    }

    /**
     * Has the setter of rStaff been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedRStaff() {
        return _isSetterInvokedRStaff;
    }

    /**
     * Has the setter of uStaff been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedUStaff() {
        return _isSetterInvokedUStaff;
    }

    // =====================================================================================
    //                                                                       Classify Method
    //                                                                       ===============
                          
    /**
     * Classify the value of rStaff as Administrator.
     */
    public void classifyRStaffAdministrator() {
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_Administrator;
        setRStaff(new String(code));
    }
    
    /**
     * Classify the value of rStaff as User.
     */
    public void classifyRStaffUser() {
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_User;
        setRStaff(new String(code));
    }
    
    /**
     * Classify the value of rStaff as UtterStranger.
     */
    public void classifyRStaffUtterStranger() {
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_UtterStranger;
        setRStaff(new String(code));
    }
            
    /**
     * Classify the value of uStaff as Administrator.
     */
    public void classifyUStaffAdministrator() {
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_Administrator;
        setUStaff(new String(code));
    }
    
    /**
     * Classify the value of uStaff as User.
     */
    public void classifyUStaffUser() {
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_User;
        setUStaff(new String(code));
    }
    
    /**
     * Classify the value of uStaff as UtterStranger.
     */
    public void classifyUStaffUtterStranger() {
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_UtterStranger;
        setUStaff(new String(code));
    }
      
    // =====================================================================================
    //                                                                 Classification Getter
    //                                                                 =====================
                      
    /**
     * Get the value of rStaff as classification-name.
     * 
     * @return The value of rStaff as classification-name. (Nullable)
     */
    public String getRStaffName() {
        if (_rStaff == null) {
            return null;
        }
        final java.util.Map<String, String> map = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_NAME_MAP_Staff;
        return (String)map.get(_rStaff.toString());
    }

    /**
     * Get the value of rStaff as classification-alias.
     * 
     * @return The value of rStaff as classification-alias. (Nullable)
     */
    public String getRStaffAlias() {
        if (_rStaff == null) {
            return null;
        }
        final java.util.Map<String, String> map = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_ALIAS_MAP_Staff;
        return (String)map.get(_rStaff.toString());
    }
    
    /**
     * Get the value of uStaff as classification-name.
     * 
     * @return The value of uStaff as classification-name. (Nullable)
     */
    public String getUStaffName() {
        if (_uStaff == null) {
            return null;
        }
        final java.util.Map<String, String> map = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_NAME_MAP_Staff;
        return (String)map.get(_uStaff.toString());
    }

    /**
     * Get the value of uStaff as classification-alias.
     * 
     * @return The value of uStaff as classification-alias. (Nullable)
     */
    public String getUStaffAlias() {
        if (_uStaff == null) {
            return null;
        }
        final java.util.Map<String, String> map = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_ALIAS_MAP_Staff;
        return (String)map.get(_uStaff.toString());
    }
  
    // =====================================================================================
    //                                                          Classification Determination
    //                                                          ============================
                          
    /**
     * Is the value of rStaff 'Administrator'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isRStaffAdministrator() {
        if (_rStaff == null) {
            return false;
        }
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_Administrator;
        return code.equalsIgnoreCase(_rStaff.toString());
    }

    /**
     * Is the value of rStaff 'Administrator'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isRStaffAdministratorIfNullException() {
        if (_rStaff == null) {
            String msg = "If the value of rStaff is null, this method throws exception!";
            throw new IllegalStateException(msg + " rStaff=" + _rStaff);
        }
        return isRStaffAdministrator();
    }
    
    /**
     * Is the value of rStaff 'User'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isRStaffUser() {
        if (_rStaff == null) {
            return false;
        }
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_User;
        return code.equalsIgnoreCase(_rStaff.toString());
    }

    /**
     * Is the value of rStaff 'User'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isRStaffUserIfNullException() {
        if (_rStaff == null) {
            String msg = "If the value of rStaff is null, this method throws exception!";
            throw new IllegalStateException(msg + " rStaff=" + _rStaff);
        }
        return isRStaffUser();
    }
    
    /**
     * Is the value of rStaff 'UtterStranger'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isRStaffUtterStranger() {
        if (_rStaff == null) {
            return false;
        }
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_UtterStranger;
        return code.equalsIgnoreCase(_rStaff.toString());
    }

    /**
     * Is the value of rStaff 'UtterStranger'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isRStaffUtterStrangerIfNullException() {
        if (_rStaff == null) {
            String msg = "If the value of rStaff is null, this method throws exception!";
            throw new IllegalStateException(msg + " rStaff=" + _rStaff);
        }
        return isRStaffUtterStranger();
    }
            
    /**
     * Is the value of uStaff 'Administrator'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isUStaffAdministrator() {
        if (_uStaff == null) {
            return false;
        }
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_Administrator;
        return code.equalsIgnoreCase(_uStaff.toString());
    }

    /**
     * Is the value of uStaff 'Administrator'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isUStaffAdministratorIfNullException() {
        if (_uStaff == null) {
            String msg = "If the value of uStaff is null, this method throws exception!";
            throw new IllegalStateException(msg + " uStaff=" + _uStaff);
        }
        return isUStaffAdministrator();
    }
    
    /**
     * Is the value of uStaff 'User'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isUStaffUser() {
        if (_uStaff == null) {
            return false;
        }
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_User;
        return code.equalsIgnoreCase(_uStaff.toString());
    }

    /**
     * Is the value of uStaff 'User'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isUStaffUserIfNullException() {
        if (_uStaff == null) {
            String msg = "If the value of uStaff is null, this method throws exception!";
            throw new IllegalStateException(msg + " uStaff=" + _uStaff);
        }
        return isUStaffUser();
    }
    
    /**
     * Is the value of uStaff 'UtterStranger'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isUStaffUtterStranger() {
        if (_uStaff == null) {
            return false;
        }
        String code = dbflute.ldb.allcommon.LdClassificationDefinition.CODE_Staff_UtterStranger;
        return code.equalsIgnoreCase(_uStaff.toString());
    }

    /**
     * Is the value of uStaff 'UtterStranger'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isUStaffUtterStrangerIfNullException() {
        if (_uStaff == null) {
            String msg = "If the value of uStaff is null, this method throws exception!";
            throw new IllegalStateException(msg + " uStaff=" + _uStaff);
        }
        return isUStaffUtterStranger();
    }
      
    // =====================================================================================
    //                                                                         Foreign Table
    //                                                                         =============

    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [AUTHOR]
    //   ForeignProperty = [author]
    // * * * * * * * * */

    /** RELNO of foreign table for s2dao. */
    public static final int author_RELNO = 0;

    /** RELKEYS of foreign table for s2dao. */
    public static final String author_RELKEYS = "AUTHOR_ID:AUTHOR_ID";

    /** The entity of foreign table. */
    protected dbflute.ldb.exentity.LdAuthor _parentAuthor;
  
    /**
     * Get the entity of foreign table without lazyload.
     * 
     * @return The entity of foreign table.
     */
    public dbflute.ldb.exentity.LdAuthor getAuthor() {
        return _parentAuthor;
    }
  
    /**
     * Set the entity of foreign table.
     * 
     * @param v The entity of foreign table.
     */
    public void setAuthor(dbflute.ldb.exentity.LdAuthor v) {
        _parentAuthor = v;
    }
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [PUBLISHER]
    //   ForeignProperty = [publisher]
    // * * * * * * * * */

    /** RELNO of foreign table for s2dao. */
    public static final int publisher_RELNO = 1;

    /** RELKEYS of foreign table for s2dao. */
    public static final String publisher_RELKEYS = "PUBLISHER_ID:PUBLISHER_ID";

    /** The entity of foreign table. */
    protected dbflute.ldb.exentity.LdPublisher _parentPublisher;
  
    /**
     * Get the entity of foreign table without lazyload.
     * 
     * @return The entity of foreign table.
     */
    public dbflute.ldb.exentity.LdPublisher getPublisher() {
        return _parentPublisher;
    }
  
    /**
     * Set the entity of foreign table.
     * 
     * @param v The entity of foreign table.
     */
    public void setPublisher(dbflute.ldb.exentity.LdPublisher v) {
        _parentPublisher = v;
    }
  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ForeignTable    = [GENRE]
    //   ForeignProperty = [genre]
    // * * * * * * * * */

    /** RELNO of foreign table for s2dao. */
    public static final int genre_RELNO = 2;

    /** RELKEYS of foreign table for s2dao. */
    public static final String genre_RELKEYS = "GENRE_CODE:GENRE_CODE";

    /** The entity of foreign table. */
    protected dbflute.ldb.exentity.LdGenre _parentGenre;
  
    /**
     * Get the entity of foreign table without lazyload.
     * 
     * @return The entity of foreign table.
     */
    public dbflute.ldb.exentity.LdGenre getGenre() {
        return _parentGenre;
    }
  
    /**
     * Set the entity of foreign table.
     * 
     * @param v The entity of foreign table.
     */
    public void setGenre(dbflute.ldb.exentity.LdGenre v) {
        _parentGenre = v;
    }
  
    // =====================================================================================
    //                                                                        Refferer Table
    //                                                                        ==============

  
    // /* * * * * * * * * * * * * * * * * * * * * * *
    //   ReffererTable    = [COLLECTION]
    //   ReffererProperty = [collectionList]
    // * * * * * * * * */
  
    /** The list of refferer table. */
    protected java.util.List<dbflute.ldb.exentity.LdCollection> _childrenCollectionList;
  
    /**
     * Get the list of refferer table without lazyload.
     * If it's not loaded yet, returns null.
     * 
     * @return The list of refferer table. (Nullable)
     */
    public java.util.List<dbflute.ldb.exentity.LdCollection> getCollectionList() {
        return _childrenCollectionList;
    }

    /**
     * Set the list of refferer table.
     * 
     * @param value The list of refferer table. (Nullable)
     */
    public void setCollectionList(java.util.List<dbflute.ldb.exentity.LdCollection> value) {
        _childrenCollectionList = value;
    }
      
    // =====================================================================================
    //                                                                                Accept
    //                                                                                ======
    /**
     * This method implements the method that is declared at super.
     * 
     * @param primaryKeyMap Primary key map. (NotNull and NotEmpty)
     * @return Instance of query. (NotNull)
     */
    public LdEntity acceptPrimaryKeyMap(java.util.Map<String, ? extends Object> primaryKeyMap) {
        if (primaryKeyMap == null) {
            String msg = "The argument[primaryKeyMap] should not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (primaryKeyMap.isEmpty()) {
            String msg = "The argument[primaryKeyMap] should not be empty.";
            throw new IllegalArgumentException(msg);
        }
  
        if (!primaryKeyMap.containsKey("BOOK_ID")) {
            String msg = "The primaryKeyMap must have the value of BOOK_ID";
            throw new IllegalStateException(msg + ": primaryKeyMap --> " + primaryKeyMap);
        }
        {
            final Object obj = primaryKeyMap.get("BOOK_ID");
            if (obj == null) {
                setBookId(null);
            } else {
                if (obj instanceof java.math.BigDecimal) {
                    setBookId((java.math.BigDecimal)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.math.BigDecimal or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    final String value = (String)obj;
                    try {
                        setBookId(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "setBookId(new java.math.BigDecimal(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
                  
                }
            }
        }
  
        return this;

    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param primaryKeyMapString Primary-key map-string. (NotNull and NotEmpty)
     * @return this. (NotNull)
     */
    public LdEntity acceptPrimaryKeyMapString(String primaryKeyMapString) {
        if (primaryKeyMapString == null) {
            String msg = "The argument[primaryKeyMapString] should not be null.";
            throw new IllegalArgumentException(msg);
        }
        final String prefix = MAP_STRING_MAP_MARK + MAP_STRING_START_BRACE;
        final String suffix = MAP_STRING_END_BRACE;
        if (!primaryKeyMapString.trim().startsWith(prefix)) {
            primaryKeyMapString = prefix + primaryKeyMapString;
        }
        if (!primaryKeyMapString.trim().endsWith(suffix)) {
            primaryKeyMapString = primaryKeyMapString + suffix;
        }
        LdMapListString mapListString = new LdMapListStringImpl();
        mapListString.setMapMark(MAP_STRING_MAP_MARK);
        mapListString.setListMark(MAP_STRING_LIST_MARK);
        mapListString.setStartBrace(MAP_STRING_START_BRACE);
        mapListString.setEndBrace(MAP_STRING_END_BRACE);
        mapListString.setEqual(MAP_STRING_EQUAL);
        mapListString.setDelimiter(MAP_STRING_DELIMITER);
        return acceptPrimaryKeyMap(mapListString.generateMap(primaryKeyMapString));
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param columnValueMap Column-value map. (NotNull and NotEmpty)
     * @return Instance of query. (NotNull)
     */
    public LdEntity acceptColumnValueMap(java.util.Map<String, ? extends Object> columnValueMap) {
        if (columnValueMap == null) {
            String msg = "The argument[columnValueMap] should not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (columnValueMap.isEmpty()) {
            String msg = "The argument[columnValueMap] should not be empty.";
            throw new IllegalArgumentException(msg);
        }
  
        {
            final Object obj = columnValueMap.get("BOOK_ID");
            if (obj == null) {
                setBookId(null);
            } else {
                if (obj instanceof java.math.BigDecimal) {
                    setBookId((java.math.BigDecimal)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.math.BigDecimal or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    final String value = (String)obj;
                    try {
                        setBookId(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "setBookId(new java.math.BigDecimal(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
                  
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("ISBN_NO");
            if (obj == null) {
                setIsbnNo(null);
            } else {
                if (obj instanceof String) {
                    setIsbnNo((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setIsbnNo((String)obj);
    
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("BOOK_NAME");
            if (obj == null) {
                setBookName(null);
            } else {
                if (obj instanceof String) {
                    setBookName((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setBookName((String)obj);
    
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("AUTHOR_ID");
            if (obj == null) {
                setAuthorId(null);
            } else {
                if (obj instanceof java.math.BigDecimal) {
                    setAuthorId((java.math.BigDecimal)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.math.BigDecimal or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    final String value = (String)obj;
                    try {
                        setAuthorId(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "setAuthorId(new java.math.BigDecimal(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
                  
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("PUBLISHER_ID");
            if (obj == null) {
                setPublisherId(null);
            } else {
                if (obj instanceof java.math.BigDecimal) {
                    setPublisherId((java.math.BigDecimal)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.math.BigDecimal or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    final String value = (String)obj;
                    try {
                        setPublisherId(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "setPublisherId(new java.math.BigDecimal(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
                  
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("MAX_LENDING_DATE_COUNT");
            if (obj == null) {
                setMaxLendingDateCount(null);
            } else {
                if (obj instanceof java.math.BigDecimal) {
                    setMaxLendingDateCount((java.math.BigDecimal)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.math.BigDecimal or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
                  
                    final String value = (String)obj;
                    try {
                        setMaxLendingDateCount(new java.math.BigDecimal(value));
                    } catch (RuntimeException e) {
                        String msg = "setMaxLendingDateCount(new java.math.BigDecimal(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
                  
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("GENRE_CODE");
            if (obj == null) {
                setGenreCode(null);
            } else {
                if (obj instanceof String) {
                    setGenreCode((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setGenreCode((String)obj);
    
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("OPENING_PART");
            if (obj == null) {
                setOpeningPart(null);
            } else {
                if (obj instanceof String) {
                    setOpeningPart((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setOpeningPart((String)obj);
    
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("R_TIME");
            if (obj == null) {
                setRTime(null);
            } else {
                if (obj instanceof java.sql.Timestamp) {
                    setRTime((java.sql.Timestamp)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.sql.Timestamp or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
          
                    final String value = (String)obj;
                    try {
                        setRTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value));
                    } catch (java.text.ParseException e) {
                        String msg = "setRTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    } catch (RuntimeException e) {
                        String msg = "setRTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
          
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("U_TIME");
            if (obj == null) {
                setUTime(null);
            } else {
                if (obj instanceof java.sql.Timestamp) {
                    setUTime((java.sql.Timestamp)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be java.sql.Timestamp or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
          
                    final String value = (String)obj;
                    try {
                        setUTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value));
                    } catch (java.text.ParseException e) {
                        String msg = "setUTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    } catch (RuntimeException e) {
                        String msg = "setUTime((java.sql.Timestamp)java.text.DateFormat.getDateTimeInstance().parse(value))";
                        throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
                    }
          
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("R_STAFF");
            if (obj == null) {
                setRStaff(null);
            } else {
                if (obj instanceof String) {
                    setRStaff((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setRStaff((String)obj);
    
                }
            }
        }
  
        {
            final Object obj = columnValueMap.get("U_STAFF");
            if (obj == null) {
                setUStaff(null);
            } else {
                if (obj instanceof String) {
                    setUStaff((String)obj);
                } else {
                    if (!(obj instanceof String)) {
                        String msg = "The value should be String or String: ";
                        msg = msg + "valueType=" + obj.getClass() + " value=" + obj;
                        throw new IllegalArgumentException(msg);
                    }
    
                    setUStaff((String)obj);
    
                }
            }
        }
  
        return this;
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param columnValueMapString Column-value map-string. (NotNull and NotEmpty)
     * @return this. (NotNull)
     */
    public LdEntity acceptColumnValueMapString(String columnValueMapString) {
        if (columnValueMapString == null) {
            String msg = "The argument[columnValueMapString] should not be null.";
            throw new IllegalArgumentException(msg);
        }
        final String prefix = MAP_STRING_MAP_MARK + MAP_STRING_START_BRACE;
        final String suffix = MAP_STRING_END_BRACE;
        if (!columnValueMapString.trim().startsWith(prefix)) {
            columnValueMapString = prefix + columnValueMapString;
        }
        if (!columnValueMapString.trim().endsWith(suffix)) {
            columnValueMapString = columnValueMapString + suffix;
        }
        LdMapListString mapListString = new LdMapListStringImpl();
        mapListString.setMapMark(MAP_STRING_MAP_MARK);
        mapListString.setListMark(MAP_STRING_LIST_MARK);
        mapListString.setStartBrace(MAP_STRING_START_BRACE);
        mapListString.setEndBrace(MAP_STRING_END_BRACE);
        mapListString.setEqual(MAP_STRING_EQUAL);
        mapListString.setDelimiter(MAP_STRING_DELIMITER);
        return acceptColumnValueMap(mapListString.generateMap(columnValueMapString));
    }

    // =====================================================================================
    //                                                                               Extract
    //                                                                               =======
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Primary-key map-string. (NotNull)
     */
    public String extractPrimaryKeyMapString() {
        final String startBrace = MAP_STRING_START_BRACE;
        final String endBrace = MAP_STRING_END_BRACE;
        final String delimiter = MAP_STRING_DELIMITER;
        final String equal = MAP_STRING_EQUAL;
        return extractPrimaryKeyMapString(startBrace, endBrace, delimiter, equal);
    }

    /**
     * Extract primary-key map-string.
     * 
     * @param startBrace Start-brace. (NotNull)
     * @param endBrace End-brace. (NotNull)
     * @param delimiter Delimiter. (NotNull)
     * @param equal Equal. (NotNull)
     * @return Primary-key map-string. (NotNull)
     */
    public String extractPrimaryKeyMapString(String startBrace, String endBrace, String delimiter, String equal) {

        final String mapMarkAndStartBrace = MAP_STRING_MAP_MARK + startBrace;
        final StringBuffer sb = new StringBuffer();

      
        sb.append(delimiter).append("BOOK_ID").append(equal);
        sb.append((_bookId != null ? _bookId.toString() : ""));
      
        sb.delete(0, delimiter.length()).insert(0, mapMarkAndStartBrace).append(endBrace);
        return sb.toString();

    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Column-value map-string. (NotNull)
     */
    public String extractColumnValueMapString() {
        final String startBrace = MAP_STRING_START_BRACE;
        final String endBrace = MAP_STRING_END_BRACE;
        final String delimiter = MAP_STRING_DELIMITER;
        final String equal = MAP_STRING_EQUAL;
        return extractColumnValueMapString(startBrace, endBrace, delimiter, equal);
    }

    /**
     * Extract column-value map-string.
     * 
     * @param startBrace Start-brace. (NotNull)
     * @param endBrace End-brace. (NotNull)
     * @param delimiter Delimiter. (NotNull)
     * @param equal Equal. (NotNull)
     * @return Column-value map-string. (NotNull)
     */
    public String extractColumnValueMapString(String startBrace, String endBrace, String delimiter, String equal) {
        final String mapMarkAndStartBrace = MAP_STRING_MAP_MARK + startBrace;
        final StringBuffer sb = new StringBuffer();

    
        sb.append(delimiter).append("BOOK_ID").append(equal);
        sb.append((_bookId != null ? _bookId.toString() : ""));
        
        sb.append(delimiter).append("ISBN_NO").append(equal);
        sb.append((_isbnNo != null ? _isbnNo.toString() : ""));
        
        sb.append(delimiter).append("BOOK_NAME").append(equal);
        sb.append((_bookName != null ? _bookName.toString() : ""));
        
        sb.append(delimiter).append("AUTHOR_ID").append(equal);
        sb.append((_authorId != null ? _authorId.toString() : ""));
        
        sb.append(delimiter).append("PUBLISHER_ID").append(equal);
        sb.append((_publisherId != null ? _publisherId.toString() : ""));
        
        sb.append(delimiter).append("MAX_LENDING_DATE_COUNT").append(equal);
        sb.append((_maxLendingDateCount != null ? _maxLendingDateCount.toString() : ""));
        
        sb.append(delimiter).append("GENRE_CODE").append(equal);
        sb.append((_genreCode != null ? _genreCode.toString() : ""));
        
        sb.append(delimiter).append("OPENING_PART").append(equal);
        sb.append((_openingPart != null ? _openingPart.toString() : ""));
        
        sb.append(delimiter).append("R_TIME").append(equal);
        sb.append((_rTime != null ? java.text.DateFormat.getDateTimeInstance().format(_rTime) : ""));
        
        sb.append(delimiter).append("U_TIME").append(equal);
        sb.append((_uTime != null ? java.text.DateFormat.getDateTimeInstance().format(_uTime) : ""));
        
        sb.append(delimiter).append("R_STAFF").append(equal);
        sb.append((_rStaff != null ? _rStaff.toString() : ""));
        
        sb.append(delimiter).append("U_STAFF").append(equal);
        sb.append((_uStaff != null ? _uStaff.toString() : ""));
    
        sb.delete(0, delimiter.length()).insert(0, mapMarkAndStartBrace).append(endBrace);
        return sb.toString();
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @return Column-value map-string. (NotNull)
     */
    public String extractCommonColumnValueMapString() {
        final String startBrace = MAP_STRING_START_BRACE;
        final String endBrace = MAP_STRING_END_BRACE;
        final String delimiter = MAP_STRING_DELIMITER;
        final String equal = MAP_STRING_EQUAL;
        return extractCommonColumnValueMapString(startBrace, endBrace, delimiter, equal);
    }

    /**
     * Extract common-column-value map-string.
     * 
     * @param startBrace Start-brace. (NotNull)
     * @param endBrace End-brace. (NotNull)
     * @param delimiter Delimiter. (NotNull)
     * @param equal Equal. (NotNull)
     * @return Common-column-value map-string. (NotNull)
     */
    public String extractCommonColumnValueMapString(String startBrace, String endBrace, String delimiter, String equal) {
        final String mapMarkAndStartBrace = MAP_STRING_MAP_MARK + startBrace;
        final StringBuffer sb = new StringBuffer();
      
        sb.append(delimiter).append("R_TIME").append(equal);
        sb.append((_rTime != null ? java.text.DateFormat.getDateTimeInstance().format(_rTime) : ""));
          
        sb.append(delimiter).append("U_TIME").append(equal);
        sb.append((_uTime != null ? java.text.DateFormat.getDateTimeInstance().format(_uTime) : ""));
          
        sb.append(delimiter).append("R_STAFF").append(equal);
        sb.append((_rStaff != null ? _rStaff.toString() : ""));
          
        sb.append(delimiter).append("U_STAFF").append(equal);
        sb.append((_uStaff != null ? _uStaff.toString() : ""));
      
        sb.delete(0, delimiter.length()).insert(0, mapMarkAndStartBrace).append(endBrace);
        return sb.toString();
    }


    // =====================================================================================
    //                                                                         Determination
    //                                                                         =============
    /**
     * This method implements the method that is declared at super.
     * 
     * @return Determination.
     */
    public boolean hasPrimaryKeyValue() {
  
        if (_bookId == null) {
            return false;
        }
  
        return true;
    }

    // =====================================================================================
    //                                                                 Basic-Override Method
    //                                                                 =====================
    
    /**
     * This method overrides the method that is declared at super.
     * If the primary-key of the other is same as this one, returns true.
     * 
     * @param other Other entity.
     * @return Comparing result.
     */
    public boolean equals(Object other) {
        if (!(other instanceof LdBsBook)) {
            return false;
        }
        if (other == null) {
            return false;
        }
        final String thisMapString = extractPrimaryKeyMapString();
        final String otherMapString = ((LdBsBook)other).extractPrimaryKeyMapString();

        return thisMapString.equals(otherMapString);
    }

    /**
     * This method overrides the method that is declared at super.
     * Calculates hash-code from primary-key.
     * 
     * @return Hash-code from primary-keys.
     */
    public int hashCode() {
        int result = 0;
  
        if (this.getBookId() != null) {
            result = result + this.getBookId().hashCode();
        }
  
        return result;
    }

    /**
     * This method overrides the method that is declared at super.
     * 
     * @return Column-value map-string. (NotNull)
     */
    public String toString() {
        final String startBrace = "{";
        final String endBrace = "}";
        final String delimiter = ";";
        final String equal = "=";
        final String primaryKeyMapString = extractPrimaryKeyMapString(startBrace, endBrace, delimiter, equal);
        final String columnValueMapString = extractColumnValueMapString(startBrace, endBrace, delimiter, equal);
        return "[PK] " + primaryKeyMapString + " [ALL] " + columnValueMapString;
    }
}

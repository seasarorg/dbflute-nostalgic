/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsbhv.pmbean;


/**
 * The parameter-bean of BookSpecifiedOutsideSqlPmb.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBookSpecifiedOutsideSqlPmb extends dbflute.ldb.allcommon.cbean.LdSimplePagingBean  {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of bookId. */
    protected java.math.BigDecimal _bookId;

    /** The value of bookName. */
    protected String _bookName;

    /** The value of collectionStatusCode. */
    protected String _collectionStatusCode;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsBookSpecifiedOutsideSqlPmb() {
    }
    
    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    /**
     * @param value Query value. (Nullable)
     * @return Converted value. (Nullable)
     */
    protected String convertEmptyToNullIfString(String value) {
        return filterRemoveEmptyString(value);
    }

    /**
     * @param value Query value string. (Nullable)
     * @return Removed-empty value. (Nullable)
     */
    protected String filterRemoveEmptyString(String value) {
        return ((value != null && !"".equals(value)) ? value : null);
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * {@inheritDoc}
     * @return The view of properties. (NotNull)
     */
    @Override
    public String toString() {
        final String delimiter = ",";
        final StringBuffer sb = new StringBuffer();
        sb.append(delimiter).append(_bookId);
        sb.append(delimiter).append(_bookName);
        sb.append(delimiter).append(_collectionStatusCode);
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get the value of bookId. (Converted empty to null)
     * @return The value of bookId. (Nullable & NotEmptyString: if the value is empty string, returns null)
     */
    public java.math.BigDecimal getBookId() {
        return _bookId;
    }

    /**
     * Set the value of bookId.
     * @param bookId The value of bookId. (Nullable)
     */
    public void setBookId(java.math.BigDecimal bookId) {
        _bookId = bookId;
    }

    /**
     * Get the value of bookName. (Converted empty to null)
     * @return The value of bookName. (Nullable & NotEmptyString: if the value is empty string, returns null)
     */
    public String getBookName() {
        return (String)convertEmptyToNullIfString(_bookName);
    }

    /**
     * Set the value of bookName.
     * @param bookName The value of bookName. (Nullable)
     */
    public void setBookName(String bookName) {
        _bookName = bookName;
    }

    /**
     * Get the value of collectionStatusCode. (Converted empty to null)
     * @return The value of collectionStatusCode. (Nullable & NotEmptyString: if the value is empty string, returns null)
     */
    public String getCollectionStatusCode() {
        return (String)convertEmptyToNullIfString(_collectionStatusCode);
    }

    /**
     * Set the value of collectionStatusCode.
     * @param collectionStatusCode The value of collectionStatusCode. (Nullable)
     */
    public void setCollectionStatusCode(String collectionStatusCode) {
        _collectionStatusCode = collectionStatusCode;
    }

    /**
     * Set the value of collectionStatusCode as NOR. <br />
     * 通常状態を示す
     */
    public void setCollectionStatusCode_NOR() {
        _collectionStatusCode = dbflute.ldb.allcommon.LdCDef.CollectionStatus.NOR.code();
    }

    /**
     * Set the value of collectionStatusCode as WAT. <br />
     * 待ち状態を示す
     */
    public void setCollectionStatusCode_WAT() {
        _collectionStatusCode = dbflute.ldb.allcommon.LdCDef.CollectionStatus.WAT.code();
    }

    /**
     * Set the value of collectionStatusCode as OUT. <br />
     * 貸し出し中を示す
     */
    public void setCollectionStatusCode_OUT() {
        _collectionStatusCode = dbflute.ldb.allcommon.LdCDef.CollectionStatus.OUT.code();
    }

}

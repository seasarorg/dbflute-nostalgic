/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsbhv.pmbean;


/**
 * The parameter-bean of BookInScopePmb.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsBookInScopePmb  {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of bookIdList. */
    protected java.util.List<Integer> _bookIdList;

    /** The value of genreCodeList. */
    protected java.util.List<String> _genreCodeList;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsBookInScopePmb() {
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
        sb.append(delimiter).append(_bookIdList);
        sb.append(delimiter).append(_genreCodeList);
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get the value of bookIdList. (Converted empty to null)
     * @return The value of bookIdList. (Nullable & NotEmptyString: if the value is empty string, returns null)
     */
    public java.util.List<Integer> getBookIdList() {
        return _bookIdList;
    }

    /**
     * Set the value of bookIdList.
     * @param bookIdList The value of bookIdList. (Nullable)
     */
    public void setBookIdList(java.util.List<Integer> bookIdList) {
        _bookIdList = bookIdList;
    }

    /**
     * Get the value of genreCodeList. (Converted empty to null)
     * @return The value of genreCodeList. (Nullable & NotEmptyString: if the value is empty string, returns null)
     */
    public java.util.List<String> getGenreCodeList() {
        return _genreCodeList;
    }

    /**
     * Set the value of genreCodeList.
     * @param genreCodeList The value of genreCodeList. (Nullable)
     */
    public void setGenreCodeList(java.util.List<String> genreCodeList) {
        _genreCodeList = genreCodeList;
    }

}

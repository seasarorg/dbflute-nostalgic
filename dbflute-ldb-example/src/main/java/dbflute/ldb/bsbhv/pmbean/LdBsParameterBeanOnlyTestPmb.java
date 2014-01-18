/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsbhv.pmbean;


/**
 * The parameter-bean of ParameterBeanOnlyTestPmb.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsParameterBeanOnlyTestPmb  {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of test1. */
    protected String _test1;

    /** The value of test2. */
    protected java.math.BigDecimal _test2;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBsParameterBeanOnlyTestPmb() {
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
        sb.append(delimiter).append(_test1);
        sb.append(delimiter).append(_test2);
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get the value of test1. (Converted empty to null)
     * @return The value of test1. (Nullable & NotEmptyString: if the value is empty string, returns null)
     */
    public String getTest1() {
        return (String)convertEmptyToNullIfString(_test1);
    }

    /**
     * Set the value of test1.
     * @param test1 The value of test1. (Nullable)
     */
    public void setTest1(String test1) {
        _test1 = test1;
    }

    /**
     * Get the value of test2. (Converted empty to null)
     * @return The value of test2. (Nullable & NotEmptyString: if the value is empty string, returns null)
     */
    public java.math.BigDecimal getTest2() {
        return _test2;
    }

    /**
     * Set the value of test2.
     * @param test2 The value of test2. (Nullable)
     */
    public void setTest2(java.math.BigDecimal test2) {
        _test2 = test2;
    }

}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.helper.token.line;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdLineTokenizingOption {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    protected String _delimiter;

    protected boolean _trimDoubleQuotation;

    protected boolean _handleEmtpyAsNull;

    // =====================================================================================
    //                                                                           Easy-to-Use
    //                                                                           ===========
    public LdLineTokenizingOption delimitateByComma() {
        _delimiter = ",";
        return this;
    }

    public LdLineTokenizingOption delimitateByTab() {
        _delimiter = "\t";
        return this;
    }

    public LdLineTokenizingOption trimDoubleQuotation() {
        _trimDoubleQuotation = true;
        return this;
    }

    public LdLineTokenizingOption handleEmtpyAsNull() {
        _handleEmtpyAsNull = true;
        return this;
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    public String getDelimiter() {
        return _delimiter;
    }

    public void setDelimiter(String delimiter) {
        _delimiter = delimiter;
    }

    public boolean isTrimDoubleQuotation() {
        return _trimDoubleQuotation;
    }

    public boolean isHandleEmtpyAsNull() {
        return _handleEmtpyAsNull;
    }
}
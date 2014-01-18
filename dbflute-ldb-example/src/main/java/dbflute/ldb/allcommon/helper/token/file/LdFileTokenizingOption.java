/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.helper.token.file;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdFileTokenizingOption {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    protected String _encoding;

    protected String _delimiter;

    protected boolean _beginFirstLine;

    protected boolean _handleEmptyAsNull;

    // =====================================================================================
    //                                                                           Easy-to-Use
    //                                                                           ===========
    public LdFileTokenizingOption delimitateByComma() {
        _delimiter = ",";
        return this;
    }

    public LdFileTokenizingOption delimitateByTab() {
        _delimiter = "\t";
        return this;
    }

    public LdFileTokenizingOption encodeAsUTF8() {
        _encoding = "UTF-8";
        return this;
    }

    public LdFileTokenizingOption encodeAsWindows31J() {
        _encoding = "Windows-31J";
        return this;
    }

    public LdFileTokenizingOption beginFirstLine() {
        _beginFirstLine = true;
        return this;
    }

    public LdFileTokenizingOption handleEmptyAsNull() {
        _handleEmptyAsNull = true;
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

    public String getEncoding() {
        return _encoding;
    }

    public void setEncoding(String encoding) {
        _encoding = encoding;
    }

    public boolean isBeginFirstLine() {
        return _beginFirstLine;
    }

    public boolean isHandleEmptyAsNull() {
        return _handleEmptyAsNull;
    }
}
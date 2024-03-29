package com.example.dbflute.teeda.dbflute.allcommon.helper.token.file;

/**
 * @author DBFlute(AutoGenerator)
 */
public class FileTokenizingOption {

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
    public FileTokenizingOption delimitateByComma() {
        _delimiter = ",";
        return this;
    }

    public FileTokenizingOption delimitateByTab() {
        _delimiter = "\t";
        return this;
    }

    public FileTokenizingOption encodeAsUTF8() {
        _encoding = "UTF-8";
        return this;
    }

    public FileTokenizingOption encodeAsWindows31J() {
        _encoding = "Windows-31J";
        return this;
    }

    public FileTokenizingOption beginFirstLine() {
        _beginFirstLine = true;
        return this;
    }

    public FileTokenizingOption handleEmptyAsNull() {
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
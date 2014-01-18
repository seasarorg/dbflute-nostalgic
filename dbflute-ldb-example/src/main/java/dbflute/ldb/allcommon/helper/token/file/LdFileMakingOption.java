/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.helper.token.file;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdFileMakingOption {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** Encoding. (Required) */
    protected String _encoding;

    /** Delimiter. (Required) */
    protected String _delimiter;

    /** Line separator. (NotRequired) */
    protected String _lineSeparator;

    /** Good bye double quotation. (NotRequired) */
    protected boolean _goodByeDoubleQuotation;

    /** File-making header information. (NotRequired) */
    protected LdFileMakingHeaderInfo _fileMakingHeaderInfo;

    // =====================================================================================
    //                                                                           Easy-to-Use
    //                                                                           ===========
    public LdFileMakingOption delimitateByComma() {
        _delimiter = ",";
        return this;
    }

    public LdFileMakingOption delimitateByTab() {
        _delimiter = "\t";
        return this;
    }

    public LdFileMakingOption encodeAsUTF8() {
        _encoding = "UTF-8";
        return this;
    }

    public LdFileMakingOption encodeAsWindows31J() {
        _encoding = "Windows-31J";
        return this;
    }

    public LdFileMakingOption separateCrLf() {
        _lineSeparator = "\r\n";
        return this;
    }

    public LdFileMakingOption separateLf() {
        _lineSeparator = "\n";
        return this;
    }

    public LdFileMakingOption goodByeDoubleQuotation() {
        _goodByeDoubleQuotation = true;
        return this;
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    public String getEncoding() {
        return _encoding;
    }

    public void setEncoding(String encoding) {
        _encoding = encoding;
    }

    public String getDelimiter() {
        return _delimiter;
    }

    public void setDelimiter(String delimiter) {
        _delimiter = delimiter;
    }

    public String getLineSeparator() {
        return _lineSeparator;
    }

    public void setLineSeparator(String lineSeparator) {
        _lineSeparator = lineSeparator;
    }

    public boolean isGoodByeDoubleQuotation() {
        return _goodByeDoubleQuotation;
    }

    public LdFileMakingHeaderInfo getFileMakingHeaderInfo() {
        return _fileMakingHeaderInfo;
    }

    public void setFileMakingHeaderInfo(LdFileMakingHeaderInfo fileMakingHeaderInfo) {
        _fileMakingHeaderInfo = fileMakingHeaderInfo;
    }

}
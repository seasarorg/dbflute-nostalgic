/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.batch;

import dbflute.ldb.allcommon.helper.token.file.LdFileMakingOption;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdTokenFileOutputOption {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    protected LdFileMakingOption _fileMakingOption = new LdFileMakingOption();

    // =====================================================================================
    //                                                                           Easy-to-Use
    //                                                                           ===========
    public LdTokenFileOutputOption delimitateByComma() {
        _fileMakingOption.delimitateByComma();
        return this;
    }

    public LdTokenFileOutputOption delimitateByTab() {
        _fileMakingOption.delimitateByTab();
        return this;
    }

    public LdTokenFileOutputOption encodeAsUTF8() {
        _fileMakingOption.encodeAsUTF8();
        return this;
    }

    public LdTokenFileOutputOption encodeAsWindows31J() {
        _fileMakingOption.encodeAsWindows31J();
        return this;
    }

    public LdTokenFileOutputOption separateCrLf() {
        _fileMakingOption.separateCrLf();
        return this;
    }

    public LdTokenFileOutputOption separateLf() {
        _fileMakingOption.separateLf();
        return this;
    }

    public LdTokenFileOutputOption goodByeDoubleQuotation() {
        _fileMakingOption.goodByeDoubleQuotation();
        return this;
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    public String getEncoding() {
        return _fileMakingOption.getEncoding();
    }

    public void setEncoding(String encoding) {
        _fileMakingOption.setDelimiter(encoding);
    }

    public String getDelimiter() {
        return _fileMakingOption.getDelimiter();
    }

    public void setDelimiter(String delimiter) {
        _fileMakingOption.setDelimiter(delimiter);
    }

    public String getLineSeparator() {
        return _fileMakingOption.getLineSeparator();
    }

    public void setLineSeparator(String lineSeparator) {
        _fileMakingOption.setLineSeparator(lineSeparator);
    }

    public boolean isGoodByeDoubleQuotation() {
        return _fileMakingOption.isGoodByeDoubleQuotation();
    }

    public LdFileMakingOption getFileMakingOption() {
        return _fileMakingOption;
    }
}

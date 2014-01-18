/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.batch;

import dbflute.ldb.allcommon.helper.token.file.LdFileTokenizingOption;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdTokenFileReflectionOption {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    protected boolean _interruptIfError;

    protected LdFileTokenizingOption _fileTokenizingOption = new LdFileTokenizingOption();

    // =====================================================================================
    //                                                                           Easy-to-Use
    //                                                                           ===========
    public LdTokenFileReflectionOption delimitateByComma() {
        _fileTokenizingOption.delimitateByComma();
        return this;
    }

    public LdTokenFileReflectionOption delimitateByTab() {
        _fileTokenizingOption.delimitateByTab();
        return this;
    }

    public LdTokenFileReflectionOption encodeAsUTF8() {
        _fileTokenizingOption.encodeAsUTF8();
        return this;
    }

    public LdTokenFileReflectionOption encodeAsWindows31J() {
        _fileTokenizingOption.encodeAsWindows31J();
        return this;
    }

    public LdTokenFileReflectionOption handleEmptyAsNull() {
        _fileTokenizingOption.handleEmptyAsNull();
        return this;
    }

    public LdTokenFileReflectionOption interruptIfError() {
        _interruptIfError = true;
        return this;
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    public String getDelimiter() {
        return _fileTokenizingOption.getDelimiter();
    }

    public void setDelimiter(String delimiter) {
        _fileTokenizingOption.setDelimiter(delimiter);
    }

    public String getEncoding() {
        return _fileTokenizingOption.getEncoding();
    }

    public void setEncoding(String encoding) {
        _fileTokenizingOption.setDelimiter(encoding);
    }

    public boolean isHandleEmptyAsNull() {
        return _fileTokenizingOption.isHandleEmptyAsNull();
    }

    public boolean isInterruptIfError() {
        return _interruptIfError;
    }
}

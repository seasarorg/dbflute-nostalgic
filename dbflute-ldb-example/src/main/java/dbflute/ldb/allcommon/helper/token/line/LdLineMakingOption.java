/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.helper.token.line;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdLineMakingOption {

    protected String _delimiter;

    protected boolean _quoteByDoubleQuotation;

    protected boolean _trimSpace;

    public LdLineMakingOption delimitateByComma() {
        _delimiter = ",";
        return this;
    }

    public LdLineMakingOption delimitateByTab() {
        _delimiter = "\t";
        return this;
    }

    public String getDelimiter() {
        return _delimiter;
    }

    public void setDelimiter(String delimiter) {
        _delimiter = delimiter;
    }

    public LdLineMakingOption quoteByDoubleQuotation() {
        _quoteByDoubleQuotation = true;
        return this;
    }

    public boolean isQuoteByDoubleQuotation() {
        return _quoteByDoubleQuotation;
    }

    public LdLineMakingOption trimSpace() {
        _trimSpace = true;
        return this;
    }

    public boolean isTrimSpace() {
        return _trimSpace;
    }
}
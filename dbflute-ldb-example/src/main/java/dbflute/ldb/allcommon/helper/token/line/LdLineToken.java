/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.helper.token.line;

/**
 * @author DBFlute(AutoGenerator)
 */
public interface LdLineToken {

    public java.util.List<String> tokenize(String lineString, LdLineTokenizingOption lineTokenizingOption);

    public String make(java.util.List<String> valueList, LdLineMakingOption lineMakingOption);
}
/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.helper.stacktrace;

/**
 * @author DBFlute(AutoGenerator)
 */
public interface LdInvokeNameExtractor {

    /**
     * @param resource the call-back resource for invoke-name-extracting. (NotNull)
     * @return The result of invoke name. (NotNull: If not found, returns empty string.)
     */
    public LdInvokeNameResult extractInvokeName(LdInvokeNameExtractingResource resource);
}
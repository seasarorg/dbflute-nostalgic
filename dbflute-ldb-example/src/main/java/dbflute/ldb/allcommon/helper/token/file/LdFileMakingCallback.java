/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.helper.token.file;

/**
 * @author DBFlute(AutoGenerator)
 */
public interface LdFileMakingCallback {

    /**
     * Get file-making header information.
     * <pre>
     * You should return your row resource for file-making.
     * It continues invoking until this method returns null.
     * </pre>
     * @return File-making header information. (Nullable)
     */
    public LdFileMakingRowResource getRowResource();
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean;

/**
 * The select-resource as marker-interface.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface LdSelectResource {

    /**
     * Check safety result.
     * 
     * @param safetyMaxResultSize Safety max result size. (If zero or minus, ignore checking)
     */
    public void checkSafetyResult(int safetyMaxResultSize);
}

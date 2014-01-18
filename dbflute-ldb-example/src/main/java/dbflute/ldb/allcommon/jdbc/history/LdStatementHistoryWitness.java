/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.jdbc.history;

/**
 * The interface of statement history witness.
 * 
 * @author DBFlute(AutoGenerator)
 * @deprecated Please use SqlLogRegistry
 */
public interface LdStatementHistoryWitness {

    /**
     * Witness the history.
     * 
     * @param statementHistory Statement history. (NotNull)
     */
    public void witnessTheHistory(LdStatementHistory statementHistory);
}

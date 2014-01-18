/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

import java.sql.SQLException;

/**
 * The exception of when the SQL failed to execute.
 * @author DBFlute(AutoGenerator)
 */
public class LdSQLFailureException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    protected SQLException sqlEx;

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     * @param cause SQLException. (NotNull)
     */
    public LdSQLFailureException(String msg, SQLException cause) {
        super(msg, cause);
        sqlEx = cause;
    }
	
    public SQLException getSQLException() {
        return sqlEx;
    }
}

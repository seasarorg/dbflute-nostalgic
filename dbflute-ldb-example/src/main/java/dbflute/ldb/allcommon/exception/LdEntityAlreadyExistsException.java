/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

import java.sql.SQLException;

/**
 * The exception of when the entity already exists on the database.
 * @author DBFlute(AutoGenerator)
 */
public class LdEntityAlreadyExistsException extends LdSQLFailureException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     * @param cause SQLException. (NotNull)
     */
    public LdEntityAlreadyExistsException(String msg, SQLException cause) {
        super(msg, cause);
        sqlEx = cause;
    }
}

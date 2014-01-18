/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception of when the outside-sql is not found.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdOutsideSqlNotFoundException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * 
     * @param msg Exception message.
     */
    public LdOutsideSqlNotFoundException(String msg) {
        super(msg);
    }

    /**
     * Constructor.
     * 
     * @param msg Exception message.
     * @param cause Throwable.
     */
    public LdOutsideSqlNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

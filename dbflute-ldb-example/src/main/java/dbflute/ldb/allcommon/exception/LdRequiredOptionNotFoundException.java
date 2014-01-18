/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception of when the required option is not found.
 * @author DBFlute(AutoGenerator)
 */
public class LdRequiredOptionNotFoundException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param msg Exception message.
     */
    public LdRequiredOptionNotFoundException(String msg) {
        super(msg);
    }

    /**
     * Constructor.
     * @param msg Exception message.
     * @param cause Throwable.
     */
    public LdRequiredOptionNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

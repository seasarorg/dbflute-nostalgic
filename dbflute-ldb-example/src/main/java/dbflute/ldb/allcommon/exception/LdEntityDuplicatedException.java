/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception of when the entity has been duplicated.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdEntityDuplicatedException extends LdRecordHasOverlappedException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param msg Exception message.
     */
    public LdEntityDuplicatedException(String msg) {
        super(msg);
    }

    /**
     * Constructor.
     * @param msg Exception message.
     * @param cause Throwable.
     */
    public LdEntityDuplicatedException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

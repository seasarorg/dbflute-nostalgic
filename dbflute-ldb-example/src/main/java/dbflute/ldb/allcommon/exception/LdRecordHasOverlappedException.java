/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception when the record has overlapped.
 * This class is old.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdRecordHasOverlappedException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * 
     * @param msg Exception message.
     */
    public LdRecordHasOverlappedException(String msg) {
        super(msg);
    }

    /**
     * Constructor.
     * 
     * @param msg Exception message.
     * @param cause Throwable.
     */
    public LdRecordHasOverlappedException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

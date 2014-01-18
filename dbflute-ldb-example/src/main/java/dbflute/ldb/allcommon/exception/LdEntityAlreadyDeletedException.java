/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception of when the entity has already been deleted by other thread.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdEntityAlreadyDeletedException extends LdRecordHasAlreadyBeenDeletedException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * 
     * @param msg Exception message.
     */
    public LdEntityAlreadyDeletedException(String msg) {
        super(msg);
    }
}

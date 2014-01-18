/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception of when the DB meta is not found.
 * @author DBFlute(AutoGenerator)
 */
public class LdDBMetaNotFoundException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     */
    public LdDBMetaNotFoundException(String msg) {
        super(msg);
    }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception of when the end comment is not found about outsideSql.
 * @author DBFlute(AutoGenerator)
 */
public class LdEndCommentNotFoundException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     */
    public LdEndCommentNotFoundException(String msg) {
        super(msg);
    }
}

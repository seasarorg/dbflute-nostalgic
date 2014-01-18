/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception of when the IF comment has a wrong expression about outsideSql.
 * @author DBFlute(AutoGenerator)
 */
public class LdIfCommentWrongExpressionException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     */
    public LdIfCommentWrongExpressionException(String msg) {
        super(msg);
    }

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     * @param cause Throwable.
     */
    public LdIfCommentWrongExpressionException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

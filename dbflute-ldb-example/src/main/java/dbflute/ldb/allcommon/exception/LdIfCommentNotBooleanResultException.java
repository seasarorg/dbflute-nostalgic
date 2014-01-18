/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception of when the result of IF comment is not boolean about outsideSql.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdIfCommentNotBooleanResultException extends LdIfCommentWrongExpressionException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * 
     * @param msg Exception message. (NotNull)
     */
    public LdIfCommentNotBooleanResultException(String msg) {
        super(msg);
    }

    /**
     * Constructor.
     * 
     * @param msg Exception message. (NotNull)
     * @param cause Throwable.
     */
    public LdIfCommentNotBooleanResultException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

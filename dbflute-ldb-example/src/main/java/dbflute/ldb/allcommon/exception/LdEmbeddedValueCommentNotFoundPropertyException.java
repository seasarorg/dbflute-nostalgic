/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception of when the property on embedded value comment is not found about outsideSql.
 * @author DBFlute(AutoGenerator)
 */
public class LdEmbeddedValueCommentNotFoundPropertyException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     */
    public LdEmbeddedValueCommentNotFoundPropertyException(String msg) {
        super(msg);
    }

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     * @param cause Throwable.
     */
    public LdEmbeddedValueCommentNotFoundPropertyException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

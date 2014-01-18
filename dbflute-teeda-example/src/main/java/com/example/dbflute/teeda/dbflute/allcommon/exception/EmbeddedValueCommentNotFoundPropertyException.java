package com.example.dbflute.teeda.dbflute.allcommon.exception;

/**
 * The exception of when the property on embedded value comment is not found about outsideSql.
 * @author DBFlute(AutoGenerator)
 */
public class EmbeddedValueCommentNotFoundPropertyException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     */
    public EmbeddedValueCommentNotFoundPropertyException(String msg) {
        super(msg);
    }

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     * @param cause Throwable.
     */
    public EmbeddedValueCommentNotFoundPropertyException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

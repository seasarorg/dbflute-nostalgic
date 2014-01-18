/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception of when the property on bind variable comment is not found about outsideSql.
 * @author DBFlute(AutoGenerator)
 */
public class LdBindVariableCommentNotFoundPropertyException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     */
    public LdBindVariableCommentNotFoundPropertyException(String msg) {
        super(msg);
    }

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     * @param cause Throwable.
     */
    public LdBindVariableCommentNotFoundPropertyException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

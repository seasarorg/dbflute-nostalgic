/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception of when the condition of IF comment is not found about outsideSql.
 * @author DBFlute(AutoGenerator)
 */
public class LdIfCommentConditionNotFoundException extends LdIfCommentWrongExpressionException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     */
    public LdIfCommentConditionNotFoundException(String msg) {
        super(msg);
    }
}

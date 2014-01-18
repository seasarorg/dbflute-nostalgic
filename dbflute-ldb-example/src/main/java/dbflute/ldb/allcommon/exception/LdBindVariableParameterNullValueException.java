/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception of when the value of bind variable is null about outsideSql.
 * @author DBFlute(AutoGenerator)
 */
public class LdBindVariableParameterNullValueException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     */
    public LdBindVariableParameterNullValueException(String msg) {
        super(msg);
    }
}

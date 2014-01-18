/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception of when the value of embedded value is null about outsideSql.
 * @author DBFlute(AutoGenerator)
 */
public class LdEmbeddedValueParameterNullValueException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * @param msg Exception message. (NotNull)
     */
    public LdEmbeddedValueParameterNullValueException(String msg) {
        super(msg);
    }
}

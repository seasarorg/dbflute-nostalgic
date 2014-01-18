package dbflute.ldb.allcommon.exception;

/**
 * The exception when the record has overlapped.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdRecordHasOverlappedException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * 
     * @param msg Exception message.
     */
    public LdRecordHasOverlappedException(String msg) {
        super(msg);
    }
}

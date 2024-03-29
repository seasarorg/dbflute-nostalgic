package dbflute.ldb.allcommon.exception;

/**
 * The exception when the record has already been deleted (by other thread).
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdRecordHasAlreadyBeenDeletedException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor.
     * 
     * @param msg Exception message.
     */
    public LdRecordHasAlreadyBeenDeletedException(String msg) {
        super(msg);
    }
}

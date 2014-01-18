/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception when selected count exceeds max count.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdSelectedCountExceedMaxCountException extends RuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** Selected count. */
    protected int _selectedCount;

    /** Max count. */
    protected int _maxCount;

    /**
     * Constructor.
     * 
     * @param msg Exception message.
     * @param maxCount Max count.
     * @param selectedCount Selected count.
     */
    public LdSelectedCountExceedMaxCountException(String msg, int selectedCount, int maxCount) {
        super(msg);
        _selectedCount = selectedCount;
        _maxCount = maxCount;
    }

    /**
     * Get selected count.
     * 
     * @return Selected count.
     */
    public int getSelectedCount() {
        return _selectedCount;
    }

    /**
     * Get max count.
     * 
     * @return Max count.
     */
    public int getMaxCount() {
        return _maxCount;
    }
}

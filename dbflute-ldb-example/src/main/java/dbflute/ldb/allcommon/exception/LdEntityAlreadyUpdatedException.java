/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

import org.seasar.dao.NotSingleRowUpdatedRuntimeException;

/**
 * The exception of when the entity has already been updated by other thread.
 * @author DBFlute(AutoGenerator)
 */
public class LdEntityAlreadyUpdatedException extends NotSingleRowUpdatedRuntimeException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * @param bean Bean. (NotNull)
     * @param rows Rows.
     */
    public LdEntityAlreadyUpdatedException(Object bean, int rows) {
        super(bean, rows);
    }

    /**
     * Constructor.
     * @param e NotSingleRowUpdatedRuntimeException. (NotNull)
     */
    public LdEntityAlreadyUpdatedException(NotSingleRowUpdatedRuntimeException e) {
        super(e.getBean(), e.getRows());
    }
}

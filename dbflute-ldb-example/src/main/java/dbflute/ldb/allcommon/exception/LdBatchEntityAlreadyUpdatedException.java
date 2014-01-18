/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.exception;

/**
 * The exception of when the entity has already been updated by other thread in batch update.
 * @author DBFlute(AutoGenerator)
 */
public class LdBatchEntityAlreadyUpdatedException extends LdEntityAlreadyUpdatedException {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    
    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Integer _batchUpdateCount;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * @param bean Bean. (NotNull)
     * @param rows Rows(Update count per One entity).
     * @param batchUpdateCount Batch update count(Total).
     */
    public LdBatchEntityAlreadyUpdatedException(Object bean, int rows, Integer batchUpdateCount) {
        super(bean, rows);
        _batchUpdateCount = batchUpdateCount;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getBatchUpdateCount() {
        return _batchUpdateCount;
    }
}

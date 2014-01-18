/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.interceptor;

import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;

/**
 * CommonColumn-Setup-before-Delete Interceptor.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdCommonColumnSetupBeforeDeleteInterceptor extends LdCommonColumnSetupAbstractInterceptor {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;


    /**
     * Set up the entity.
     * 
     * @param entity Entity. (Nullable)
     */
    protected void setupEntity(LdEntityDefinedCommonColumn entity) {
        throw new UnsupportedOperationException("Common column intercepting is supported on behavior filter! Not here!");
    }
}
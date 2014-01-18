/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon;

import dbflute.ldb.allcommon.LdEntity;

/**
 * The auto set-upper of common column.
 * @author DBFlute(AutoGenerator)
 */
public interface LdCommonColumnAutoSetupper {

    /**
     * Handle common columns of insert if it needs.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    public void handleCommonColumnOfInsertIfNeeds(LdEntity targetEntity);

    /**
     * Handle common columns of update if it needs.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    public void handleCommonColumnOfUpdateIfNeeds(LdEntity targetEntity);
}

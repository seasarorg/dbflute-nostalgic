package com.example.dbflute.teeda.dbflute.allcommon;

import com.example.dbflute.teeda.dbflute.allcommon.Entity;

/**
 * The auto set-upper of common column.
 * @author DBFlute(AutoGenerator)
 */
public interface CommonColumnAutoSetupper {

    /**
     * Handle common columns of insert if it needs.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    public void handleCommonColumnOfInsertIfNeeds(Entity targetEntity);

    /**
     * Handle common columns of update if it needs.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    public void handleCommonColumnOfUpdateIfNeeds(Entity targetEntity);
}

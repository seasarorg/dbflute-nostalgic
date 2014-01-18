/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.setup;

import java.util.List;

import dbflute.ldb.allcommon.LdEntity;

/**
 * The interface of entity list setupper.
 * @param <ENTITY> The type of entity.
 * @author DBFlute(AutoGenerator)
 */
public interface LdEntityListSetupper<ENTITY extends LdEntity> {

    /**
     * Set up the list of entity.
     * @param entityList The list of entity. (NotNull)
     */
    public void setup(List<ENTITY> entityList);
}

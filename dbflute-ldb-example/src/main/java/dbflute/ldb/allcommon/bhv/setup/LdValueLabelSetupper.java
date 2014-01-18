/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.setup;

import dbflute.ldb.allcommon.LdEntity;

/**
 * The interface of Value-Label Setupper.
 * @param <ENTITY> The type of entity.
 * @author DBFlute(AutoGenerator)
 */
public interface LdValueLabelSetupper<ENTITY extends LdEntity> {

    /**
     * Set up value-label.
     * @param box Value-label box. (NotNull)
     * @param entity Entity. (NotNull)
     */
    public void setup(LdValueLabelBox box, ENTITY entity);
}

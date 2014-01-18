/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.setup;

import dbflute.ldb.allcommon.cbean.LdConditionBean;

/**
 * The interface of condition-bean setupper.
 * @param <CONDITION_BEAN> The type of condition-bean.
 * @author DBFlute(AutoGenerator)
 */
public interface LdConditionBeanSetupper<CONDITION_BEAN extends LdConditionBean> {

    /**
     * Set up condition.
     * @param cb Condition-bean. (NotNull)
     */
    public void setup(CONDITION_BEAN cb);
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.load;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.bhv.setup.LdConditionBeanSetupper;
import dbflute.ldb.allcommon.bhv.setup.LdEntityListSetupper;
import dbflute.ldb.allcommon.cbean.LdConditionBean;

/**
 * The class of load referrer option.
 * 
 * @param <REFERRER_CONDITION_BEAN> The type of referrer condition-bean.
 * @param <REFERRER_ENTITY> The type of referrer entity.
 * @author DBFlute(AutoGenerator)
 */
public class LdLoadRefererOption<REFERRER_CONDITION_BEAN extends LdConditionBean, REFERRER_ENTITY extends LdEntity> extends LdLoadReferrerOption<REFERRER_CONDITION_BEAN, REFERRER_ENTITY> {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdLoadRefererOption() {
    }

    public LdLoadRefererOption(LdConditionBeanSetupper<REFERRER_CONDITION_BEAN> conditionBeanSetupper) {
        super(conditionBeanSetupper);
    }

    public LdLoadRefererOption(LdConditionBeanSetupper<REFERRER_CONDITION_BEAN> conditionBeanSetupper, LdEntityListSetupper<REFERRER_ENTITY> entityListSetupper) {
        super(conditionBeanSetupper, entityListSetupper);
    }

    public LdLoadRefererOption(LdLoadReferrerOption<REFERRER_CONDITION_BEAN, REFERRER_ENTITY> option) {
        super(option);
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * @return The condition-bean of referrer.
     * @deprecated Sorry! This methid have typo! Please use getRefererConditionBean().
     */
    public REFERRER_CONDITION_BEAN getReffererConditionBean() {
        return super.getReferrerConditionBean();
    }

    /**
     * @param referrerConditionBean The condition-bean of referrer.
     * @deprecated Sorry! This methid have typo! Please use setReferrerConditionBean().
     */
    public void setReffererConditionBean(REFERRER_CONDITION_BEAN referrerConditionBean) {
        super.setReferrerConditionBean(referrerConditionBean);
    }

    /**
     * @return The condition-bean of referrer.
     */
    public REFERRER_CONDITION_BEAN getRefererConditionBean() {
        return super.getReferrerConditionBean();
    }

    /**
     * @param referrerConditionBean The condition-bean of referrer.
     */
    public void setRefererConditionBean(REFERRER_CONDITION_BEAN referrerConditionBean) {
        super.setReferrerConditionBean(referrerConditionBean);
    }
}

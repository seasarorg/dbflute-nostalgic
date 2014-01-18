package com.example.dbflute.basic.dbflute.allcommon.bhv.load;

import com.example.dbflute.basic.dbflute.allcommon.Entity;
import com.example.dbflute.basic.dbflute.allcommon.bhv.setup.ConditionBeanSetupper;
import com.example.dbflute.basic.dbflute.allcommon.bhv.setup.EntityListSetupper;
import com.example.dbflute.basic.dbflute.allcommon.cbean.ConditionBean;

/**
 * The class of load referrer option.
 * 
 * @param <REFERRER_CONDITION_BEAN> The type of referrer condition-bean.
 * @param <REFERRER_ENTITY> The type of referrer entity.
 * @author DBFlute(AutoGenerator)
 */
public class LoadRefererOption<REFERRER_CONDITION_BEAN extends ConditionBean, REFERRER_ENTITY extends Entity> extends LoadReferrerOption<REFERRER_CONDITION_BEAN, REFERRER_ENTITY> {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LoadRefererOption() {
    }

    public LoadRefererOption(ConditionBeanSetupper<REFERRER_CONDITION_BEAN> conditionBeanSetupper) {
        super(conditionBeanSetupper);
    }

    public LoadRefererOption(ConditionBeanSetupper<REFERRER_CONDITION_BEAN> conditionBeanSetupper, EntityListSetupper<REFERRER_ENTITY> entityListSetupper) {
        super(conditionBeanSetupper, entityListSetupper);
    }

    public LoadRefererOption(LoadReferrerOption<REFERRER_CONDITION_BEAN, REFERRER_ENTITY> option) {
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

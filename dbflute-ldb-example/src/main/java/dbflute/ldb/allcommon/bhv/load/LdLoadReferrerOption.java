/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.load;

import java.util.List;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.bhv.setup.LdConditionBeanSetupper;
import dbflute.ldb.allcommon.bhv.setup.LdEntityListSetupper;
import dbflute.ldb.allcommon.cbean.LdConditionBean;

/**
 * The class of load referrer option.
 * @param <REFERRER_CONDITION_BEAN> The type of referrer condition-bean.
 * @param <REFERRER_ENTITY> The type of referrer entity.
 * @author DBFlute(AutoGenerator)
 */
public class LdLoadReferrerOption<REFERRER_CONDITION_BEAN extends LdConditionBean, REFERRER_ENTITY extends LdEntity> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdConditionBeanSetupper<REFERRER_CONDITION_BEAN> _conditionBeanSetupper;

    protected LdEntityListSetupper<REFERRER_ENTITY> _entityListSetupper;

    protected REFERRER_CONDITION_BEAN _referrerConditionBean;

    protected boolean _toLastKeyCondition;

    protected boolean _stopOrderByKey;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdLoadReferrerOption() {
    }

    public LdLoadReferrerOption(LdConditionBeanSetupper<REFERRER_CONDITION_BEAN> conditionBeanSetupper) {
        this._conditionBeanSetupper = conditionBeanSetupper;
    }

    public LdLoadReferrerOption(LdConditionBeanSetupper<REFERRER_CONDITION_BEAN> conditionBeanSetupper, LdEntityListSetupper<REFERRER_ENTITY> entityListSetupper) {
        this._conditionBeanSetupper = conditionBeanSetupper;
        this._entityListSetupper = entityListSetupper;
    }

    public LdLoadReferrerOption(LdLoadReferrerOption<REFERRER_CONDITION_BEAN, REFERRER_ENTITY> option) {
        this._conditionBeanSetupper = option._conditionBeanSetupper;
        this._entityListSetupper = option._entityListSetupper;
        this._referrerConditionBean = option._referrerConditionBean;
        this._toLastKeyCondition = option._toLastKeyCondition;
        this._stopOrderByKey = option._stopOrderByKey;
    }

    // ===================================================================================
    //                                                                         Easy-to-Use
    //                                                                         ===========
    /**
     * Specify that the key condition is added as last condition. <br />
     * This method is valid only after you use reffererConditionBean and add your original condition to it.
     * @return this. (NotNull)
     */
    public LdLoadReferrerOption<REFERRER_CONDITION_BEAN, REFERRER_ENTITY> toLastKeyCondition() {
        _toLastKeyCondition = true;
        return this;
    }

    /**
     * Specify that it stops adding order-by of the key. <br />
     * This method is valid only after you use reffererConditionBean and add your original order-by to it.
     * @return this. (NotNull)
     */
    public LdLoadReferrerOption<REFERRER_CONDITION_BEAN, REFERRER_ENTITY> stopOrderByKey() {
        _stopOrderByKey = true;
        return this;
    }

    public void delegateKeyConditionExchangingFirstWhereClauseForLastOne(REFERRER_CONDITION_BEAN cb) {// Internal
        if (!_toLastKeyCondition) {
            cb.getSqlClause().exchangeFirstWhereClauseForLastOne();
        }
    }

    public void delegateConditionBeanSettingUp(REFERRER_CONDITION_BEAN cb) {// Internal
        if (_conditionBeanSetupper != null) {
            _conditionBeanSetupper.setup(cb);
        }
    }

    public void delegateEntitySettingUp(List<REFERRER_ENTITY> entityList) {// Internal
        if (_entityListSetupper != null) {
            _entityListSetupper.setup(entityList);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public LdConditionBeanSetupper<REFERRER_CONDITION_BEAN> getConditionBeanSetupper() {
        return _conditionBeanSetupper;
    }

    public void setConditionBeanSetupper(LdConditionBeanSetupper<REFERRER_CONDITION_BEAN> conditionBeanSetupper) {
        this._conditionBeanSetupper = conditionBeanSetupper;
    }

    public LdEntityListSetupper<REFERRER_ENTITY> getEntityListSetupper() {
        return _entityListSetupper;
    }

    public void setEntityListSetupper(LdEntityListSetupper<REFERRER_ENTITY> entityListSetupper) {
        this._entityListSetupper = entityListSetupper;
    }

    public REFERRER_CONDITION_BEAN getReferrerConditionBean() {
        return _referrerConditionBean;
    }

    public void setReferrerConditionBean(REFERRER_CONDITION_BEAN referrerConditionBean) {
        this._referrerConditionBean = referrerConditionBean;
    }

    public boolean isToLastKeyCondition() {
        return _toLastKeyCondition;
    }

    public boolean isStopOrderByKey() {
        return _stopOrderByKey;
    }
}

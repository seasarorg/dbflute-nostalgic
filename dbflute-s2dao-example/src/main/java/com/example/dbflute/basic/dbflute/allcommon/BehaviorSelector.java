package com.example.dbflute.basic.dbflute.allcommon;

import com.example.dbflute.basic.dbflute.allcommon.bhv.BehaviorReadable;

/**
 * The interface of behavior-selector.
 * @author DBFlute(AutoGenerator)
 */
public interface BehaviorSelector {

    /**
     * Initialize condition-bean meta data. <br />
     */
    public void initializeConditionBeanMetaData();
	
    /**
     * Select behavior.
	 * @param <BEHAVIOR> The type of behavior.
     * @param behaviorType Behavior type. (NotNull)
     * @return Behavior. (NotNull)
     */
    public <BEHAVIOR extends BehaviorReadable> BEHAVIOR select(Class<BEHAVIOR> behaviorType);

    /**
     * Select behavior-readable.
     * @param tableFlexibleName Table flexible-name. (NotNull)
     * @return Behavior-readable. (NotNull)
     */
    public BehaviorReadable byName(String tableFlexibleName);
}

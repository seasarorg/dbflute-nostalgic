/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon;

import dbflute.ldb.allcommon.bhv.LdBehaviorReadable;

/**
 * The interface of behavior-selector.
 * @author DBFlute(AutoGenerator)
 */
public interface LdBehaviorSelector {

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
    public <BEHAVIOR extends LdBehaviorReadable> BEHAVIOR select(Class<BEHAVIOR> behaviorType);

    /**
     * Select behavior-readable.
     * @param tableFlexibleName Table flexible-name. (NotNull)
     * @return Behavior-readable. (NotNull)
     */
    public LdBehaviorReadable byName(String tableFlexibleName);
}

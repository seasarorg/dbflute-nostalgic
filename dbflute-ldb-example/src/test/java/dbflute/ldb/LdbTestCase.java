package dbflute.ldb;

import dbflute.ContainerTestCase;
import dbflute.ldb.allcommon.LdBehaviorSelector;

/**
 * @author jflute
 * @since 0.1.0 (2006/12/20)
 */
public abstract class LdbTestCase extends ContainerTestCase {

    // ===================================================================================
    //                                                                            Override
    //                                                                            ========
    @Override
    protected String getTestDiconPath() {
        return "test-ldb.dicon";
    }

    // ===================================================================================
    //                                                                   Behavior Selector
    //                                                                   =================
    protected LdBehaviorSelector _behaviorSelector;

    protected void setBehaviorSelector(LdBehaviorSelector value) {
        _behaviorSelector = value;
    }

    protected LdBehaviorSelector getBehaviorSelector() {
        return _behaviorSelector;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected void sleep_a_little() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {
            log(ignored.getMessage());
        }
    }
}

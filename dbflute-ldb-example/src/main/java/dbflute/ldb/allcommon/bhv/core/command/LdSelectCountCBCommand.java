/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import org.seasar.extension.jdbc.ResultSetHandler;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecutionCreator;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionBeanContext;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdSelectCountCBCommand extends LdAbstractSelectCBCommand<Integer> {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "selectCount";
    }

    public Class<?> getCommandReturnType() {
        return Integer.class;
    }

    // ===================================================================================
    //                                                                    Process Callback
    //                                                                    ================
    public void beforeGettingSqlExecution() {
        assertStatus("beforeGettingSqlExecution");
        final LdConditionBean cb = _conditionBean;
        cb.xsetupSelectCountIgnoreFetchScope(); // *Point!
        LdConditionBeanContext.setConditionBeanOnThread(cb);
    }

    public void afterExecuting() {
        assertStatus("afterExecuting");
        final LdConditionBean cb = _conditionBean;
        cb.xafterCareSelectCountIgnoreFetchScope();
    }

    // ===================================================================================
    //                                                                  Detail Information
    //                                                                  ==================
    public boolean isSelectCount() {
        return true;
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public LdSqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new LdSqlExecutionCreator() {
            public LdSqlExecution createSqlExecution() {
                ResultSetHandler handler = createObjectResultSetHandler(getCommandReturnType());
                return createSelectCBExecution(_conditionBeanType, handler);
            }
        };
    }
}

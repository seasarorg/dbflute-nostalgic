/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecutionCreator;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionBeanContext;
import dbflute.ldb.allcommon.cbean.LdFetchNarrowingBeanContext;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlOption;
import dbflute.ldb.allcommon.s2dao.internal.sqlcommand.LdInternalDeleteQueryAutoDynamicCommand;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdQueryDeleteCBCommand extends LdAbstractBehaviorCommand<Integer> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The type of condition-bean. (Derived from conditionBean) */
    protected Class<? extends LdConditionBean> _conditionBeanType;

    /** The instance of condition-bean. (Required) */
    protected LdConditionBean _conditionBean;

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "queryDelete";
    }

    public Class<?> getCommandReturnType() {
        return int.class;
    }

    // ===================================================================================
    //                                                                  Detail Information
    //                                                                  ==================
    public boolean isConditionBean() {
        return true;
    }

    public boolean isOutsideSql() {
        return false;
    }

    public boolean isProcedure() {
        return false;
    }

    public boolean isSelect() {
        return false;
    }

    public boolean isSelectCount() {
        return false;
    }

    // ===================================================================================
    //                                                                    Process Callback
    //                                                                    ================
    public void beforeGettingSqlExecution() {
        assertStatus("beforeGettingSqlExecution");
        final LdConditionBean cb = _conditionBean;
        LdFetchNarrowingBeanContext.setFetchNarrowingBeanOnThread(cb);
        LdConditionBeanContext.setConditionBeanOnThread(cb);
    }

    public void afterExecuting() {
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public String buildSqlExecutionKey() {
        assertStatus("buildSqlExecutionKey");
        return _tableDbName + ":" + getCommandName() + "(" + _conditionBeanType.getSimpleName() + ")";
    }

    public LdSqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new LdSqlExecutionCreator() {
            public LdSqlExecution createSqlExecution() {
                return createQueryDeleteCBExecution(_conditionBeanType);
            }
        };
    }

    protected LdSqlExecution createQueryDeleteCBExecution(Class<? extends LdConditionBean> cbType) {
        return new LdInternalDeleteQueryAutoDynamicCommand(_dataSource, _statementFactory);
    }

    public Object[] getSqlExecutionArgument() {
        assertStatus("getSqlExecutionArgument");
        return new Object[] { _conditionBean };
    }

    // ===================================================================================
    //                                                                Argument Information
    //                                                                ====================
    public LdConditionBean getConditionBean() {
        return _conditionBean;
    }

    public String getOutsideSqlPath() {
        return null;
    }

    public LdOutsideSqlOption getOutsideSqlOption() {
        return null;
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void assertStatus(String methodName) {
        assertBasicProperty(methodName);
        assertComponentProperty(methodName);
        if (_conditionBeanType == null) {
            throw new IllegalStateException(buildAssertMessage("_conditionBeanType", methodName));
        }
        if (_conditionBean == null) {
            throw new IllegalStateException(buildAssertMessage("_conditionBean", methodName));
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setConditionBeanType(Class<? extends LdConditionBean> conditionBeanType) {
        _conditionBeanType = conditionBeanType;
    }

    public void setConditionBean(LdConditionBean conditionBean) {
        _conditionBean = conditionBean;
    }
}

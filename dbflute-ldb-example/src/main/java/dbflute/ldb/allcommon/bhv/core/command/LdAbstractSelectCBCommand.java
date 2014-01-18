/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import org.seasar.extension.jdbc.ResultSetHandler;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.execution.LdSelectCBExecution;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlOption;

/**
 * @author DBFlute(AutoGenerator)
 * @param <RESULT> The type of result.
 */
public abstract class LdAbstractSelectCBCommand<RESULT> extends LdAbstractBehaviorCommand<RESULT> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The type of condition-bean. (Derived from conditionBean) */
    protected Class<? extends LdConditionBean> _conditionBeanType;

    /** The instance of condition-bean. (Required) */
    protected LdConditionBean _conditionBean;

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
        return true;
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public String buildSqlExecutionKey() {
        assertStatus("buildSqlExecutionKey");
        return _tableDbName + ":" + getCommandName() + "(" + _conditionBeanType.getSimpleName() + ")";
    }

    protected LdSqlExecution createSelectCBExecution(Class<? extends LdConditionBean> cbType, ResultSetHandler handler) {
        return createSelectCBExecution(handler, new String[] { "dto" }, new Class<?>[] { cbType });
    }

    protected LdSelectCBExecution createSelectCBExecution(ResultSetHandler handler, String[] argNames, Class<?>[] argTypes) {
        final LdSelectCBExecution cmd = new LdSelectCBExecution(_dataSource, _statementFactory, handler);
        cmd.setArgNames(argNames);
        cmd.setArgTypes(argTypes);
        return cmd;
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

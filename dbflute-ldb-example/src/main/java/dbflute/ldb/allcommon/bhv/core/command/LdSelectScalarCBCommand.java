/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import org.seasar.extension.jdbc.ResultSetHandler;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecutionCreator;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionBeanContext;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;

/**
 * @author DBFlute(AutoGenerator)
 * @param <RESULT> The type of result.
 */
public class LdSelectScalarCBCommand<RESULT> extends LdAbstractSelectCBCommand<RESULT> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The type of result. (NotNull) */
    protected Class<RESULT> _resultType;

    /** The type of select clause. (NotNull) */
    protected LdSqlClause.SelectClauseType _selectClauseType;

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        assertStatus("getCommandName");
        final String resultTypeName = _resultType.getSimpleName();
        final String scalarMethodName = _selectClauseType.toString().toLowerCase();
        return "scalarSelect(" + resultTypeName + ")." + scalarMethodName;
    }

    public Class<?> getCommandReturnType() {
        assertStatus("getCommandReturnType");
        return _resultType;
    }

    // ===================================================================================
    //                                                                  Detail Information
    //                                                                  ==================
    public boolean isSelectCount() {
        return false;
    }

    // ===================================================================================
    //                                                                    Process Callback
    //                                                                    ================
    public void beforeGettingSqlExecution() {
        assertStatus("beforeGettingSqlExecution");
        final LdConditionBean cb = _conditionBean;
        LdConditionBeanContext.setConditionBeanOnThread(cb);
        cb.getSqlClause().classifySelectClauseType(_selectClauseType); // *Point!
    }

    public void afterExecuting() {
        assertStatus("afterExecuting");
        final LdConditionBean cb = _conditionBean;
        cb.getSqlClause().rollbackSelectClauseType();
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

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    @Override
    protected void assertStatus(String methodName) {
        super.assertStatus(methodName);
        if (_resultType == null) {
            throw new IllegalStateException(buildAssertMessage("_resultType", methodName));
        }
        if (_selectClauseType == null) {
            throw new IllegalStateException(buildAssertMessage("_selectClauseType", methodName));
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setResultType(Class<RESULT> resultType) {
        _resultType = resultType;
    }

    public void setSelectClauseType(LdSqlClause.SelectClauseType selectClauseType) {
        _selectClauseType = selectClauseType;
    }
}

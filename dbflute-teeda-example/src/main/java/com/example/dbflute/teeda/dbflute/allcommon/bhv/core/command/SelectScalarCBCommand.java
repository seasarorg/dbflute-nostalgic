package com.example.dbflute.teeda.dbflute.allcommon.bhv.core.command;

import org.seasar.extension.jdbc.ResultSetHandler;

import com.example.dbflute.teeda.dbflute.allcommon.bhv.core.SqlExecution;
import com.example.dbflute.teeda.dbflute.allcommon.bhv.core.SqlExecutionCreator;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.ConditionBean;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.ConditionBeanContext;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.sqlclause.SqlClause;

/**
 * @author DBFlute(AutoGenerator)
 * @param <RESULT> The type of result.
 */
public class SelectScalarCBCommand<RESULT> extends AbstractSelectCBCommand<RESULT> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The type of result. (NotNull) */
    protected Class<RESULT> _resultType;

    /** The type of select clause. (NotNull) */
    protected SqlClause.SelectClauseType _selectClauseType;

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
        final ConditionBean cb = _conditionBean;
        ConditionBeanContext.setConditionBeanOnThread(cb);
        cb.getSqlClause().classifySelectClauseType(_selectClauseType); // *Point!
    }

    public void afterExecuting() {
        assertStatus("afterExecuting");
        final ConditionBean cb = _conditionBean;
        cb.getSqlClause().rollbackSelectClauseType();
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public SqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new SqlExecutionCreator() {
            public SqlExecution createSqlExecution() {
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

    public void setSelectClauseType(SqlClause.SelectClauseType selectClauseType) {
        _selectClauseType = selectClauseType;
    }
}

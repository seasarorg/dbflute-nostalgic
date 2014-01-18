/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import org.seasar.extension.jdbc.ResultSetHandler;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecutionCreator;
import dbflute.ldb.allcommon.bhv.core.execution.LdBasicSelectExecution;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlOption;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;

/**
 * @author DBFlute(AutoGenerator)
 * @param <RESULT> The type of result.
 */
public class LdSelectNextValCommand<RESULT> extends LdAbstractBehaviorCommand<RESULT> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The type of result. (NotNull) */
    protected Class<RESULT> _resultType;
    
    /** The provider of DB meta. (NotNull) */
    protected LdDBMeta _dbmeta;

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "selectNextVal";
    }

    public Class<?> getCommandReturnType() {
        return _resultType;
    }

    // ===================================================================================
    //                                                                  Detail Information
    //                                                                  ==================
    public boolean isConditionBean() {
        return false;
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

    public boolean isSelectCount() {
        return false;
    }

    // ===================================================================================
    //                                                                    Process Callback
    //                                                                    ================
    public void beforeGettingSqlExecution() {
    }

    public void afterExecuting() {
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public String buildSqlExecutionKey() {
        assertStatus("buildSqlExecutionKey");
        return _tableDbName + ":" + getCommandName() + "()";
    }

    public LdSqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new LdSqlExecutionCreator() {
            public LdSqlExecution createSqlExecution() {
                ResultSetHandler handler = createObjectResultSetHandler(_resultType);
                return createSelectNextValExecution(handler);
            }
        };
    }

    protected LdSqlExecution createSelectNextValExecution(ResultSetHandler handler) {
        assertStatus("createSelectNextValExecution");
        final LdDBMeta dbmeta = findDBMeta();
        if (!dbmeta.hasSequence()) {
            String msg = "If the method 'selectNextVal()' exists, DBMeta.hasSequence() should return true:";
            msg = msg + " dbmeta.hasSequence()=" + dbmeta.hasSequence();
            throw new IllegalStateException(msg);
        }
        final String nextValSql = dbmeta.getSequenceNextValSql();
        if (nextValSql == null) {
            String msg = "If the method 'selectNextVal()' exists, DBMeta.getSequenceNextValSql() should not return null:";
            msg = msg + " dbmeta.getSequenceNextValSql()=" + dbmeta.getSequenceNextValSql();
            throw new IllegalStateException(msg);
        }
        return createBasicSelectExecution(handler, new String[]{}, new Class<?>[]{}, nextValSql);
    }

    protected LdBasicSelectExecution createBasicSelectExecution(ResultSetHandler handler, String[] argNames, Class<?>[] argTypes, String sql) {
        final LdBasicSelectExecution cmd = new LdBasicSelectExecution(_dataSource, _statementFactory, handler);
        cmd.setArgNames(argNames);
        cmd.setArgTypes(argTypes);
        cmd.setSql(sql);
        return cmd;
    }

    protected LdDBMeta findDBMeta() {
        return _dbmeta;
    }

    public Object[] getSqlExecutionArgument() {
        assertStatus("getSqlExecutionArgument");
        return new Object[]{};
    }

    // ===================================================================================
    //                                                                Argument Information
    //                                                                ====================
    public LdConditionBean getConditionBean() {
        return null;
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
        if (_dbmeta == null) {
            throw new IllegalStateException(buildAssertMessage("_dbmeta", methodName));
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setResultType(Class<RESULT> resultType) {
        _resultType = resultType;
    }

    public void setDBMeta(LdDBMeta dbmeta) {
        _dbmeta = dbmeta;
    }
}

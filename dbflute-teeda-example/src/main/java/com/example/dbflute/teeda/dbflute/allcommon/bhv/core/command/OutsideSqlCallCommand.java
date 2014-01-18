package com.example.dbflute.teeda.dbflute.allcommon.bhv.core.command;

import org.seasar.extension.jdbc.ResultSetHandler;

import com.example.dbflute.teeda.dbflute.allcommon.bhv.core.SqlExecution;
import com.example.dbflute.teeda.dbflute.allcommon.bhv.core.SqlExecutionCreator;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.outsidesql.OutsideSqlContext;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.outsidesql.OutsideSqlOption;
import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlcommand.InternalProcedureCommand;
import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.various.InternalProcedureMetaData;
import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.various.InternalProcedureMetaDataFactory;

/**
 * The behavior command for OutsideSql.execute().
 * @author DBFlute(AutoGenerator)
 */
public class OutsideSqlCallCommand extends AbstractOutsideSqlCommand<Void> {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "call";
    }

    public Class<?> getCommandReturnType() {
        return void.class;
    }

    // ===================================================================================
    //                                                                  Detail Information
    //                                                                  ==================
    public boolean isProcedure() {
        return true;
    }

    public boolean isSelect() {
        return false;
    }

    // ===================================================================================
    //                                                                    Process Callback
    //                                                                    ================
    public void beforeGettingSqlExecution() {
        assertStatus("beforeGettingSqlExecution");
        final String path = _outsideSqlPath;
        final Object pmb = _parameterBean;
        final OutsideSqlOption option = _outsideSqlOption;
        final OutsideSqlContext outsideSqlContext = createOutsideSqlContext();
        outsideSqlContext.setDynamicBinding(option.isDynamicBinding());
        outsideSqlContext.setOffsetByCursorForcedly(option.isAutoPaging());
        outsideSqlContext.setLimitByCursorForcedly(option.isAutoPaging());
        outsideSqlContext.setOutsideSqlPath(path);
        outsideSqlContext.setParameterBean(pmb);
        outsideSqlContext.setMethodName(getCommandName());
        outsideSqlContext.setStatementConfig(option.getStatementConfig());
        outsideSqlContext.setTableDbName(option.getTableDbName());
		outsideSqlContext.setupBehaviorQueryPathIfNeeds();
        OutsideSqlContext.setOutsideSqlContextOnThread(outsideSqlContext);
    }

    public void afterExecuting() {
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public String buildSqlExecutionKey() {
        assertStatus("buildSqlExecutionKey");
        return generateSpecifiedOutsideSqlUniqueKey();
    }

    protected String generateSpecifiedOutsideSqlUniqueKey() {
        final String methodName = getCommandName();
        final String path = _outsideSqlPath;
        final Object pmb = _parameterBean;
        final OutsideSqlOption option = _outsideSqlOption;
        return OutsideSqlContext.generateSpecifiedOutsideSqlUniqueKey(methodName, path, pmb, option, null);
    }

    public SqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new SqlExecutionCreator() {
            public SqlExecution createSqlExecution() {
                final OutsideSqlContext outsideSqlContext = OutsideSqlContext.getOutsideSqlContextOnThread();
                return createOutsideSqlCallCommand(outsideSqlContext);
            }
        };
    }

    protected SqlExecution createOutsideSqlCallCommand(OutsideSqlContext outsideSqlContext) {
        // - - - - - - - - - - - - - - - - - - - - - - -
        // The attribute of Specified-OutsideSqlContext.
        // - - - - - - - - - - - - - - - - - - - - - - -
        final Object pmb = outsideSqlContext.getParameterBean();
        final String procedureName = outsideSqlContext.getOutsideSqlPath();

        // - - - - - - - - - - - - - - -
        // The attribute of SqlCommand.
        // - - - - - - - - - - - - - - -
        final InternalProcedureMetaDataFactory factory = createProcedureMetaDataFactory();
        factory.setValueTypeFactory(_valueTypeFactory);
        final Class<?> pmbType = (pmb != null ? pmb.getClass() : null);
        final InternalProcedureMetaData metaData = factory.createProcedureMetaData(procedureName, pmbType);
        return createProcedureCommand(metaData);
    }

    protected InternalProcedureMetaDataFactory createProcedureMetaDataFactory() {
        return new InternalProcedureMetaDataFactory();
    }

    protected InternalProcedureCommand createProcedureCommand(InternalProcedureMetaData metaData) {
        // Because a procedure command does not use result set handler.
        final ResultSetHandler resultSetHandler = new InternalNullResultSetHandler(); 
        return new InternalProcedureCommand(_dataSource, resultSetHandler, _statementFactory, metaData);
    }

    // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // InternalProcedureCommand switches argument so this is unnecessary actually!
    // - - - - - - - - - -/
    public Object[] getSqlExecutionArgument() {
        return new Object[] { _parameterBean };
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void assertStatus(String methodName) {
        assertBasicProperty(methodName);
        assertComponentProperty(methodName);
        assertOutsideSqlBasic(methodName);
        if (_parameterBean == null) {
            String msg = "The property 'parameterBean' should not be null";
            msg = msg + " when you call " + methodName + "().";
            throw new IllegalStateException(msg);
        }
    }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import org.seasar.extension.jdbc.ResultSetHandler;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecutionCreator;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlContext;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlOption;
import dbflute.ldb.allcommon.s2dao.internal.sqlcommand.LdInternalProcedureCommand;
import dbflute.ldb.allcommon.s2dao.internal.various.LdInternalProcedureMetaData;
import dbflute.ldb.allcommon.s2dao.internal.various.LdInternalProcedureMetaDataFactory;

/**
 * The behavior command for OutsideSql.execute().
 * @author DBFlute(AutoGenerator)
 */
public class LdOutsideSqlCallCommand extends LdAbstractOutsideSqlCommand<Void> {

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
        final LdOutsideSqlOption option = _outsideSqlOption;
        final LdOutsideSqlContext outsideSqlContext = createOutsideSqlContext();
        outsideSqlContext.setDynamicBinding(option.isDynamicBinding());
        outsideSqlContext.setOffsetByCursorForcedly(option.isAutoPaging());
        outsideSqlContext.setLimitByCursorForcedly(option.isAutoPaging());
        outsideSqlContext.setOutsideSqlPath(path);
        outsideSqlContext.setParameterBean(pmb);
        outsideSqlContext.setMethodName(getCommandName());
        outsideSqlContext.setStatementConfig(option.getStatementConfig());
        outsideSqlContext.setTableDbName(option.getTableDbName());
		outsideSqlContext.setupBehaviorQueryPathIfNeeds();
        LdOutsideSqlContext.setOutsideSqlContextOnThread(outsideSqlContext);
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
        final LdOutsideSqlOption option = _outsideSqlOption;
        return LdOutsideSqlContext.generateSpecifiedOutsideSqlUniqueKey(methodName, path, pmb, option, null);
    }

    public LdSqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new LdSqlExecutionCreator() {
            public LdSqlExecution createSqlExecution() {
                final LdOutsideSqlContext outsideSqlContext = LdOutsideSqlContext.getOutsideSqlContextOnThread();
                return createOutsideSqlCallCommand(outsideSqlContext);
            }
        };
    }

    protected LdSqlExecution createOutsideSqlCallCommand(LdOutsideSqlContext outsideSqlContext) {
        // - - - - - - - - - - - - - - - - - - - - - - -
        // The attribute of Specified-OutsideSqlContext.
        // - - - - - - - - - - - - - - - - - - - - - - -
        final Object pmb = outsideSqlContext.getParameterBean();
        final String procedureName = outsideSqlContext.getOutsideSqlPath();

        // - - - - - - - - - - - - - - -
        // The attribute of SqlCommand.
        // - - - - - - - - - - - - - - -
        final LdInternalProcedureMetaDataFactory factory = createProcedureMetaDataFactory();
        factory.setValueTypeFactory(_valueTypeFactory);
        final Class<?> pmbType = (pmb != null ? pmb.getClass() : null);
        final LdInternalProcedureMetaData metaData = factory.createProcedureMetaData(procedureName, pmbType);
        return createProcedureCommand(metaData);
    }

    protected LdInternalProcedureMetaDataFactory createProcedureMetaDataFactory() {
        return new LdInternalProcedureMetaDataFactory();
    }

    protected LdInternalProcedureCommand createProcedureCommand(LdInternalProcedureMetaData metaData) {
        // Because a procedure command does not use result set handler.
        final ResultSetHandler resultSetHandler = new InternalNullResultSetHandler(); 
        return new LdInternalProcedureCommand(_dataSource, resultSetHandler, _statementFactory, metaData);
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

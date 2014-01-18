/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import org.seasar.extension.jdbc.ResultSetHandler;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecutionCreator;
import dbflute.ldb.allcommon.bhv.core.execution.LdOutsideSqlSelectExecution;
import dbflute.ldb.allcommon.cbean.LdFetchNarrowingBeanContext;
import dbflute.ldb.allcommon.cbean.LdFetchNarrowingBean;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlContext;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlOption;

/**
 * The abstract command for OutsideSql.selectSomething().
 * @author DBFlute(AutoGenerator)
 * @param <RESULT> The type of result.
 */
public abstract class LdAbstractOutsideSqlSelectCommand<RESULT> extends LdAbstractOutsideSqlCommand<RESULT> {

    // ===================================================================================
    //                                                                  Detail Information
    //                                                                  ==================
    public boolean isProcedure() {
        return false;
    }

    public boolean isSelect() {
        return true;
    }

    // ===================================================================================
    //                                                                    Process Callback
    //                                                                    ================
    public void beforeGettingSqlExecution() {
        assertStatus("beforeGettingSqlExecution");
        final LdOutsideSqlContext outsideSqlContext = createOutsideSqlContext();
        setupOutsideSqlContext(outsideSqlContext);
        LdOutsideSqlContext.setOutsideSqlContextOnThread(outsideSqlContext);

        // Set up fetchNarrowingBean.
        final Object pmb = _parameterBean;
        final LdOutsideSqlOption option = _outsideSqlOption;
        setupOutsideSqlFetchNarrowingBean(pmb, option);
    }

    protected void setupOutsideSqlContext(LdOutsideSqlContext outsideSqlContext) {
        final String path = _outsideSqlPath;
        final Object pmb = _parameterBean;
        final LdOutsideSqlOption option = _outsideSqlOption;
        final Object resultTypeSpecification = getResultTypeSpecification();
        final boolean autoPagingLogging = (option.isAutoPaging() || option.isSourcePagingRequestTypeAuto());
        outsideSqlContext.setOutsideSqlPath(path);
        outsideSqlContext.setParameterBean(pmb);
        outsideSqlContext.setResultTypeSpecification(resultTypeSpecification);
        outsideSqlContext.setMethodName(getCommandName());
        outsideSqlContext.setStatementConfig(option.getStatementConfig());
        outsideSqlContext.setTableDbName(option.getTableDbName());
        outsideSqlContext.setDynamicBinding(option.isDynamicBinding());
        outsideSqlContext.setOffsetByCursorForcedly(option.isAutoPaging());
        outsideSqlContext.setLimitByCursorForcedly(option.isAutoPaging());
        outsideSqlContext.setAutoPagingLogging(autoPagingLogging); // for logging
        outsideSqlContext.setupBehaviorQueryPathIfNeeds();
    }

    protected void setupOutsideSqlFetchNarrowingBean(Object pmb, LdOutsideSqlOption option) {
        if (pmb == null || !LdFetchNarrowingBeanContext.isTheTypeFetchNarrowingBean(pmb.getClass())) {
            return;
        }
        final LdFetchNarrowingBean fetchNarrowingBean = (LdFetchNarrowingBean)pmb;
        if (option.isManualPaging()) {
            fetchNarrowingBean.ignoreFetchNarrowing();
        }
        LdFetchNarrowingBeanContext.setFetchNarrowingBeanOnThread(fetchNarrowingBean);
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
        final Object resultTypeSpecification = getResultTypeSpecification();
        return LdOutsideSqlContext.generateSpecifiedOutsideSqlUniqueKey(methodName, path, pmb, option, resultTypeSpecification);
    }

    public LdSqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new LdSqlExecutionCreator() {
            public LdSqlExecution createSqlExecution() {
                final LdOutsideSqlContext outsideSqlContext = LdOutsideSqlContext.getOutsideSqlContextOnThread();
                return createOutsideSqlSelectExecution(outsideSqlContext);
            }
        };
    }

    protected LdSqlExecution createOutsideSqlSelectExecution(LdOutsideSqlContext outsideSqlContext) {
        // - - - - - - - - - - - - - - - - - - - - - - -
        // The attribute of Specified-OutsideSqlContext.
        // - - - - - - - - - - - - - - - - - - - - - - -
        final String suffix = buildDbmsSuffix();
        final String sql = outsideSqlContext.readFilteredOutsideSql(_sqlFileEncoding, suffix);
        final Object pmb = outsideSqlContext.getParameterBean();

        // - - - - - - - - - - - - - - -
        // The attribute of SqlCommand.
        // - - - - - - - - - - - - - - -
        final String[] argNames = (pmb != null ? new String[] {"pmb"} : new String[]{});
        final Class<?>[] argTypes = (pmb != null ? new Class<?>[] {pmb.getClass()} : new Class<?>[]{});

        // - - - - - - - - - - - - -
        // Create ResultSetHandler.
        // - - - - - - - - - - - - -
        final ResultSetHandler handler = createOutsideSqlSelectResultSetHandler();

        // - - - - - - - - - - -
        // Create SqlExecution.
        // - - - - - - - - - - -
        return createOutsideSqlSelectExecution(handler, argNames, argTypes, sql);
    }

    protected LdOutsideSqlSelectExecution createOutsideSqlSelectExecution(ResultSetHandler handler, String[] argNames, Class<?>[] argTypes, String sql) {
        final LdOutsideSqlSelectExecution cmd = new LdOutsideSqlSelectExecution(_dataSource, _statementFactory, handler);
        cmd.setArgNames(argNames);
        cmd.setArgTypes(argTypes);
        cmd.setSql(sql);
        return cmd;
    }

    public Object[] getSqlExecutionArgument() {
        assertStatus("getSqlExecutionArgument");
        return new Object[] { _parameterBean };
    }

    // ===================================================================================
    //                                                                     Extension Point
    //                                                                     ===============
    protected abstract ResultSetHandler createOutsideSqlSelectResultSetHandler();

    protected abstract Object getResultTypeSpecification();

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void assertStatus(String methodName) {
        assertBasicProperty(methodName);
        assertComponentProperty(methodName);
        assertOutsideSqlBasic(methodName);
    }
}

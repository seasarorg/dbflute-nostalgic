package com.example.dbflute.teeda.dbflute.allcommon.bhv.core.command;

import org.seasar.extension.jdbc.ResultSetHandler;

import com.example.dbflute.teeda.dbflute.allcommon.bhv.core.SqlExecution;
import com.example.dbflute.teeda.dbflute.allcommon.bhv.core.SqlExecutionCreator;
import com.example.dbflute.teeda.dbflute.allcommon.bhv.core.execution.OutsideSqlSelectExecution;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.FetchNarrowingBeanContext;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.FetchNarrowingBean;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.outsidesql.OutsideSqlContext;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.outsidesql.OutsideSqlOption;

/**
 * The abstract command for OutsideSql.selectSomething().
 * @author DBFlute(AutoGenerator)
 * @param <RESULT> The type of result.
 */
public abstract class AbstractOutsideSqlSelectCommand<RESULT> extends AbstractOutsideSqlCommand<RESULT> {

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
        final OutsideSqlContext outsideSqlContext = createOutsideSqlContext();
        setupOutsideSqlContext(outsideSqlContext);
        OutsideSqlContext.setOutsideSqlContextOnThread(outsideSqlContext);

        // Set up fetchNarrowingBean.
        final Object pmb = _parameterBean;
        final OutsideSqlOption option = _outsideSqlOption;
        setupOutsideSqlFetchNarrowingBean(pmb, option);
    }

    protected void setupOutsideSqlContext(OutsideSqlContext outsideSqlContext) {
        final String path = _outsideSqlPath;
        final Object pmb = _parameterBean;
        final OutsideSqlOption option = _outsideSqlOption;
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

    protected void setupOutsideSqlFetchNarrowingBean(Object pmb, OutsideSqlOption option) {
        if (pmb == null || !FetchNarrowingBeanContext.isTheTypeFetchNarrowingBean(pmb.getClass())) {
            return;
        }
        final FetchNarrowingBean fetchNarrowingBean = (FetchNarrowingBean)pmb;
        if (option.isManualPaging()) {
            fetchNarrowingBean.ignoreFetchNarrowing();
        }
        FetchNarrowingBeanContext.setFetchNarrowingBeanOnThread(fetchNarrowingBean);
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
        final Object resultTypeSpecification = getResultTypeSpecification();
        return OutsideSqlContext.generateSpecifiedOutsideSqlUniqueKey(methodName, path, pmb, option, resultTypeSpecification);
    }

    public SqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new SqlExecutionCreator() {
            public SqlExecution createSqlExecution() {
                final OutsideSqlContext outsideSqlContext = OutsideSqlContext.getOutsideSqlContextOnThread();
                return createOutsideSqlSelectExecution(outsideSqlContext);
            }
        };
    }

    protected SqlExecution createOutsideSqlSelectExecution(OutsideSqlContext outsideSqlContext) {
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

    protected OutsideSqlSelectExecution createOutsideSqlSelectExecution(ResultSetHandler handler, String[] argNames, Class<?>[] argTypes, String sql) {
        final OutsideSqlSelectExecution cmd = new OutsideSqlSelectExecution(_dataSource, _statementFactory, handler);
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

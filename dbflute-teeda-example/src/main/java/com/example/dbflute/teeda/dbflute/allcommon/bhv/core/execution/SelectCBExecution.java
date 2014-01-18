package com.example.dbflute.teeda.dbflute.allcommon.bhv.core.execution;

import java.util.List;
import java.util.ArrayList;
import javax.sql.DataSource;

import org.seasar.dao.CommandContext;
import org.seasar.extension.jdbc.ResultSetHandler;
import org.seasar.extension.jdbc.StatementFactory;

import com.example.dbflute.teeda.dbflute.allcommon.cbean.ConditionBean;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.ConditionBeanContext;
import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlcommand.InternalAbstractDynamicCommand;
import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlhandler.InternalBasicSelectHandler;
import com.example.dbflute.teeda.dbflute.allcommon.util.SimpleStringUtil;
import com.example.dbflute.teeda.dbflute.allcommon.util.SimpleSystemUtil;

/**
 * @author DBFlute(AutoGenerator)
 */
public class SelectCBExecution extends InternalAbstractDynamicCommand {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The handler of resultSet. */
    protected ResultSetHandler resultSetHandler;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * @param dataSource Data source.
     * @param statementFactory The factory of statement.
     * @param resultSetHandler The handler of resultSet.
     */
    public SelectCBExecution(DataSource dataSource, StatementFactory statementFactory, ResultSetHandler resultSetHandler) {
        super(dataSource, statementFactory);
        this.resultSetHandler = resultSetHandler;
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    /**
     * @param args The array of argument. (NotNull, The first element should be the instance of CB)
     * @return The object of execution result. (Nullable)
     */
    public Object execute(Object[] args) {
        final List<Object> bindVariableList = new ArrayList<Object>();
        final List<Class<?>> bindVariableTypeList = new ArrayList<Class<?>>();

        final String finalClause = setupRealClause(args, bindVariableList, bindVariableTypeList);
        final InternalBasicSelectHandler selectHandler = createBasicSelectHandler(finalClause, this.resultSetHandler);
        final Object[] bindVariableArray = bindVariableList.toArray();
        selectHandler.setLoggingMessageSqlArgs(bindVariableArray);
        return selectHandler.execute(bindVariableArray, toClassArray(bindVariableTypeList));
    }

    // -----------------------------------------------------
    //                                          Setup Clause
    //                                          ------------
    protected String setupRealClause(Object[] args, List<Object> bindVariableList, List<Class<?>> bindVariableTypeList) {
        final ConditionBean cb = ConditionBeanContext.getConditionBeanOnThread();
        final String realClause;
        {
            final SelectCBExecution dynamicSqlFactory = createDynamicSqlFactory();
            dynamicSqlFactory.setArgNames(getArgNames());
            dynamicSqlFactory.setArgTypes(getArgTypes());
            dynamicSqlFactory.setSql(cb.getSqlClause().getClause());
            final CommandContext ctx = dynamicSqlFactory.apply(args);
            realClause = ctx.getSql();
            addBindVariableInfo(ctx, bindVariableList, bindVariableTypeList);
        }
        return realClause;
    }

    // ===================================================================================
    //                                                                 Dynamic SQL Factory
    //                                                                 ===================
    protected SelectCBExecution createDynamicSqlFactory() {
        return new SelectCBExecution(getDataSource(), getStatementFactory(), resultSetHandler);
    }

    // ===================================================================================
    //                                                                      Select Handler
    //                                                                      ==============
    protected InternalBasicSelectHandler createBasicSelectHandler(String realSql, ResultSetHandler rsh) {
        return new InternalBasicSelectHandler(getDataSource(), realSql, rsh, getStatementFactory());
    }

    // ===================================================================================
    //                                                                       Parser Option
    //                                                                       =============
    @Override
    protected boolean isBlockNullParameter() {
        return true; // Because the SQL is select.
    }

    // ===================================================================================
    //                                                                        Setup Helper
    //                                                                        ============
    protected Class<?>[] toClassArray(List<Class<?>> bindVariableTypeList) {
        final Class<?>[] bindVariableTypesArray = new Class<?>[bindVariableTypeList.size()];
        for (int i = 0; i < bindVariableTypeList.size(); i++) {
            final Class<?> bindVariableType = (Class<?>) bindVariableTypeList.get(i);
            bindVariableTypesArray[i] = bindVariableType;
        }
        return bindVariableTypesArray;
    }

    protected void addBindVariableInfo(CommandContext ctx, List<Object> bindVariableList, List<Class<?>> bindVariableTypeList) {
        final Object[] bindVariables = ctx.getBindVariables();
        addBindVariableList(bindVariableList, bindVariables);
        final Class<?>[] bindVariableTypes = ctx.getBindVariableTypes();
        addBindVariableTypeList(bindVariableTypeList, bindVariableTypes);
    }

    protected void addBindVariableList(List<Object> bindVariableList, Object[] bindVariables) {
        for (int i=0; i < bindVariables.length; i++) {
            bindVariableList.add(bindVariables[i]);
        }
    }

    protected void addBindVariableTypeList(List<Class<?>> bindVariableTypeList, Class<?>[] bindVariableTypes) {
        for (int i=0; i < bindVariableTypes.length; i++) {
            bindVariableTypeList.add(bindVariableTypes[i]);
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected final String replaceString(String text, String fromText, String toText) {
        return SimpleStringUtil.replace(text, fromText, toText);
    }

    protected String getLineSeparator() {
        return SimpleSystemUtil.getLineSeparator();
    }
}

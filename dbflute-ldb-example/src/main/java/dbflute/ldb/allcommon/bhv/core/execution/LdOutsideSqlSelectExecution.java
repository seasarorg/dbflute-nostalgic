/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.execution;

import java.util.List;
import java.util.ArrayList;
import javax.sql.DataSource;

import org.seasar.framework.beans.BeanDesc;
import org.seasar.framework.beans.PropertyDesc;
import org.seasar.framework.beans.factory.BeanDescFactory;
import org.seasar.extension.jdbc.ResultSetHandler;
import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.CommandContext;


import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlContext;
import dbflute.ldb.allcommon.s2dao.internal.sqlcommand.LdInternalAbstractDynamicCommand;
import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalBasicSelectHandler;
import dbflute.ldb.allcommon.util.LdSimpleStringUtil;
import dbflute.ldb.allcommon.util.LdSimpleSystemUtil;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdOutsideSqlSelectExecution extends LdInternalAbstractDynamicCommand {

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
    public LdOutsideSqlSelectExecution(DataSource dataSource, StatementFactory statementFactory, ResultSetHandler resultSetHandler) {
        super(dataSource, statementFactory);
        this.resultSetHandler = resultSetHandler;
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    /**
     * @param args The array of argument. (NotNull, The first element should be the instance of Pmb)
     * @return The object of execution result. (Nullable)
     */
    public Object execute(Object[] args) {
        final LdOutsideSqlContext outsideSqlContext = LdOutsideSqlContext.getOutsideSqlContextOnThread();
        if (outsideSqlContext.isDynamicBinding()) {
            return executeOutsideSqlAsDynamic(args, outsideSqlContext);
        } else {
            return executeOutsideSqlAsStatic(args, outsideSqlContext);
        }
    }

    // -----------------------------------------------------
    //                                    OutsideSql Execute
    //                                    ------------------
    /**
     * Execute outside-SQL as Dynamic.
     * @param args The array of argument. (NotNull, The first element should be the instance of Pmb)
     * @param outsideSqlContext The context of outside-SQL. (NotNull)
     * @return Result. (Nullable)
     */
    protected Object executeOutsideSqlAsDynamic(Object[] args, LdOutsideSqlContext outsideSqlContext) {
        final Object firstArg = args[0];
        String staticSql = getSql();
        if (firstArg != null) {
            final BeanDesc beanDesc = BeanDescFactory.getBeanDesc(firstArg.getClass());

            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
            // Resolve embedded comment for parsing bind variable comment in embedded comment.
            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
            for (int i = 0; i < beanDesc.getPropertyDescSize(); i++) {
                final PropertyDesc propertyDesc = beanDesc.getPropertyDesc(i);
                final Class<?> propertyType = propertyDesc.getPropertyType();
                if (!propertyType.equals(String.class)) {
                    continue;
                }
                final String outsideSqlPiece = (String) propertyDesc.getValue(firstArg);
                if (outsideSqlPiece == null) {
                    continue;
                }
                final String embeddedComment = "/*$pmb." + propertyDesc.getPropertyName() + "*/";
                staticSql = replaceString(staticSql, embeddedComment, outsideSqlPiece);
            }
        }

        final LdOutsideSqlSelectExecution outsideSqlCommand = createDynamicSqlFactory();
        outsideSqlCommand.setArgNames(getArgNames());
        outsideSqlCommand.setArgTypes(getArgTypes());
        outsideSqlCommand.setSql(staticSql);

        final CommandContext ctx = outsideSqlCommand.apply(args);
        final List<Object> bindVariableList = new ArrayList<Object>();
        final List<Class<?>> bindVariableTypeList = new ArrayList<Class<?>>();
        addBindVariableInfo(ctx, bindVariableList, bindVariableTypeList);
        final LdInternalBasicSelectHandler selectHandler = createBasicSelectHandler(ctx.getSql(), this.resultSetHandler);
        final Object[] bindVariableArray = bindVariableList.toArray();
        selectHandler.setLoggingMessageSqlArgs(bindVariableArray);
        return selectHandler.execute(bindVariableArray, toClassArray(bindVariableTypeList));
    }

    /**
     * Execute outside-SQL as static.
     * @param args The array of argument. (NotNull, The first element should be the instance of Pmb)
     * @param outsideSqlContext The context of outside-SQL. (NotNull)
     * @return Result. (Nullable)
     */
    protected Object executeOutsideSqlAsStatic(Object[] args, LdOutsideSqlContext outsideSqlContext) {
        final CommandContext ctx = apply(args);
        final LdInternalBasicSelectHandler selectHandler = createBasicSelectHandler(ctx.getSql(), this.resultSetHandler);
        final Object[] bindVariableArray = ctx.getBindVariables();
        selectHandler.setLoggingMessageSqlArgs(bindVariableArray);
        return selectHandler.execute(bindVariableArray, ctx.getBindVariableTypes());
    }

    // ===================================================================================
    //                                                                 Dynamic SQL Factory
    //                                                                 ===================
    protected LdOutsideSqlSelectExecution createDynamicSqlFactory() {
        return new LdOutsideSqlSelectExecution(getDataSource(), getStatementFactory(), resultSetHandler);
    }

    // ===================================================================================
    //                                                                      Select Handler
    //                                                                      ==============
    protected LdInternalBasicSelectHandler createBasicSelectHandler(String realSql, ResultSetHandler rsh) {
        return new LdInternalBasicSelectHandler(getDataSource(), realSql, rsh, getStatementFactory());
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
        return LdSimpleStringUtil.replace(text, fromText, toText);
    }

    protected String getLineSeparator() {
        return LdSimpleSystemUtil.getLineSeparator();
    }
}
package com.example.dbflute.teeda.dbflute.allcommon.bhv.core.execution;

import javax.sql.DataSource;

import org.seasar.dao.CommandContext;
import org.seasar.extension.jdbc.ResultSetHandler;
import org.seasar.extension.jdbc.StatementFactory;

import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlcommand.InternalAbstractDynamicCommand;
import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlhandler.InternalBasicSelectHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class BasicSelectExecution extends InternalAbstractDynamicCommand {

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
    public BasicSelectExecution(DataSource dataSource, StatementFactory statementFactory, ResultSetHandler resultSetHandler) {
        super(dataSource, statementFactory);
        this.resultSetHandler = resultSetHandler;
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    /**
     * @param args The array of argument. (Nullable)
     * @return The object of execution result. (Nullable)
     */
    public Object execute(Object[] args) {
        final CommandContext ctx = apply(args);
        final InternalBasicSelectHandler selectHandler = createBasicSelectHandler(ctx.getSql(), this.resultSetHandler);
        final Object[] bindVariableArray = ctx.getBindVariables();
        selectHandler.setLoggingMessageSqlArgs(bindVariableArray);
        return selectHandler.execute(bindVariableArray, ctx.getBindVariableTypes());
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
}

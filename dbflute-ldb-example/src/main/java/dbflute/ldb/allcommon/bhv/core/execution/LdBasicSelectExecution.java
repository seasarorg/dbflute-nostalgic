/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.execution;

import javax.sql.DataSource;

import org.seasar.dao.CommandContext;
import org.seasar.extension.jdbc.ResultSetHandler;
import org.seasar.extension.jdbc.StatementFactory;

import dbflute.ldb.allcommon.s2dao.internal.sqlcommand.LdInternalAbstractDynamicCommand;
import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalBasicSelectHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdBasicSelectExecution extends LdInternalAbstractDynamicCommand {

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
    public LdBasicSelectExecution(DataSource dataSource, StatementFactory statementFactory, ResultSetHandler resultSetHandler) {
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
        final LdInternalBasicSelectHandler selectHandler = createBasicSelectHandler(ctx.getSql(), this.resultSetHandler);
        final Object[] bindVariableArray = ctx.getBindVariables();
        selectHandler.setLoggingMessageSqlArgs(bindVariableArray);
        return selectHandler.execute(bindVariableArray, ctx.getBindVariableTypes());
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
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;
import org.seasar.dao.CommandContext;
import org.seasar.extension.jdbc.StatementFactory;

import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalBasicUpdateHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalUpdateDynamicCommand extends LdInternalAbstractDynamicCommand {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalUpdateDynamicCommand(DataSource dataSource, StatementFactory statementFactory) {
        super(dataSource, statementFactory);
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public Object execute(Object args[]) {
        final CommandContext ctx = apply(args);
        final LdInternalBasicUpdateHandler updateHandler = createBasicUpdateHandler(ctx);
        final Object[] bindVariables = ctx.getBindVariables();
        updateHandler.setLoggingMessageSqlArgs(bindVariables);
        return new Integer(updateHandler.execute(bindVariables, ctx.getBindVariableTypes()));
    }
    
    protected LdInternalBasicUpdateHandler createBasicUpdateHandler(CommandContext ctx) {
        return new LdInternalBasicUpdateHandler(getDataSource(), ctx.getSql(), getStatementFactory());
    }
}

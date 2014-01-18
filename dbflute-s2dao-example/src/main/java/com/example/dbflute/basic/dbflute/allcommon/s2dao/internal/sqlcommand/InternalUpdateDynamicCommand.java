package com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;
import org.seasar.dao.CommandContext;
import org.seasar.extension.jdbc.StatementFactory;

import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqlhandler.InternalBasicUpdateHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalUpdateDynamicCommand extends InternalAbstractDynamicCommand {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalUpdateDynamicCommand(DataSource dataSource, StatementFactory statementFactory) {
        super(dataSource, statementFactory);
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public Object execute(Object args[]) {
        final CommandContext ctx = apply(args);
        final InternalBasicUpdateHandler updateHandler = createBasicUpdateHandler(ctx);
        final Object[] bindVariables = ctx.getBindVariables();
        updateHandler.setLoggingMessageSqlArgs(bindVariables);
        return new Integer(updateHandler.execute(bindVariables, ctx.getBindVariableTypes()));
    }
    
    protected InternalBasicUpdateHandler createBasicUpdateHandler(CommandContext ctx) {
        return new InternalBasicUpdateHandler(getDataSource(), ctx.getSql(), getStatementFactory());
    }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.CommandContext;
import org.seasar.dao.Node;
import org.seasar.dao.SqlCommand;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalCommandContextHandler;
import dbflute.ldb.allcommon.s2dao.internal.sqlparser.LdInternalCommandContextCreator;
import dbflute.ldb.allcommon.s2dao.internal.sqlparser.LdInternalSqlParser;
import dbflute.ldb.allcommon.util.LdSimpleSystemUtil;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalDeleteQueryAutoDynamicCommand implements SqlCommand, LdSqlExecution {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DataSource dataSource;
    protected StatementFactory statementFactory;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalDeleteQueryAutoDynamicCommand(DataSource dataSource, StatementFactory statementFactory) {
        this.dataSource = dataSource;
        this.statementFactory = statementFactory;
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public Object execute(Object[] args) {
        LdConditionBean cb = extractConditionBeanWithCheck(args);
        String[] argNames = new String[]{"dto"};
        Class<?>[] argTypes = new Class<?>[]{cb.getClass()};
        String twoWaySql = buildQueryDeleteTwoWaySql(cb);
        CommandContext context = createCommandContext(twoWaySql, argNames, argTypes, args);
        LdInternalCommandContextHandler handler = createCommandContextHandler(context);
        handler.setLoggingMessageSqlArgs(context.getBindVariables());
        int rows = handler.execute(args);
        return new Integer(rows);
    }
    
    protected LdConditionBean extractConditionBeanWithCheck(Object[] args) {
        if (args == null || args.length == 0) {
            String msg = "The arguments should have one argument! But:";
            msg = msg + " args=" + (args != null ? args.length : null);
            throw new IllegalArgumentException(msg);
        }
        Object fisrtArg = args[0];
        if (!(fisrtArg instanceof LdConditionBean)) {
            String msg = "The type of argument should be " + LdConditionBean.class + "! But:";
            msg = msg + " type=" + fisrtArg.getClass();
            throw new IllegalArgumentException(msg);
        }
        return (LdConditionBean) fisrtArg;
    }
    
    protected LdInternalCommandContextHandler createCommandContextHandler(CommandContext context) {
        return new LdInternalCommandContextHandler(dataSource, statementFactory, context);
    }

    protected String buildQueryDeleteTwoWaySql(LdConditionBean cb) {
        return cb.getSqlClause().getClauseQueryDelete();
    }
    
    protected CommandContext createCommandContext(String twoWaySql, String[] argNames, Class<?>[] argTypes, Object[] args) {
        CommandContext context;
        {
            LdInternalSqlParser parser = new LdInternalSqlParser(twoWaySql, true);
            Node node = parser.parse();
            LdInternalCommandContextCreator creator = new LdInternalCommandContextCreator(argNames, argTypes);
            context = creator.createCommandContext(args);
            node.accept(context);
        }
        return context;
    }
	
    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected String getLineSeparator() {
        return LdSimpleSystemUtil.getLineSeparator();
    }
}

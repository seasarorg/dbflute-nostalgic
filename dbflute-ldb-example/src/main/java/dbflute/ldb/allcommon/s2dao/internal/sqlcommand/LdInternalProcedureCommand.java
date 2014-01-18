/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.dao.SqlCommand;
import org.seasar.extension.jdbc.ResultSetHandler;
import org.seasar.extension.jdbc.StatementFactory;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlContext;
import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalProcedureHandler;
import dbflute.ldb.allcommon.s2dao.internal.various.LdInternalProcedureMetaData;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalProcedureCommand implements SqlCommand, LdSqlExecution {

	// ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DataSource dataSource;
    protected ResultSetHandler resultSetHandler;
    protected StatementFactory statementFactory;
    protected LdInternalProcedureMetaData procedureMetaData;

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalProcedureCommand(DataSource dataSource, ResultSetHandler resultSetHandler,
            StatementFactory statementFactory, LdInternalProcedureMetaData procedureMetaData) {
        this.dataSource = dataSource;
        this.resultSetHandler = resultSetHandler;
        this.statementFactory = statementFactory;
        this.procedureMetaData = procedureMetaData;
    }

	// ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public Object execute(final Object[] args) {
        final LdInternalProcedureHandler handler = newArgumentDtoProcedureHandler();
        final LdOutsideSqlContext outsideSqlContext = LdOutsideSqlContext.getOutsideSqlContextOnThread();
        final Object pmb = outsideSqlContext.getParameterBean();
        // The logging message SQL of procedure is unnecessary.
        // handler.setLoggingMessageSqlArgs(...);
        return handler.execute(new Object[]{pmb});
    }
    protected LdInternalProcedureHandler newArgumentDtoProcedureHandler() {
        return new LdInternalProcedureHandler(dataSource, createSql(procedureMetaData), resultSetHandler,
                statementFactory, procedureMetaData);
    }
    protected String createSql(final LdInternalProcedureMetaData procedureMetaData) {
        final StringBuilder sb = new StringBuilder();
        sb.append("{");
        int size = procedureMetaData.parameterTypes().size();
        if (procedureMetaData.hasReturnParameterType()) {
            sb.append("? = ");
            size--;
        }
        sb.append("call ").append(procedureMetaData.getProcedureName()).append("(");
        for (int i = 0; i < size; i++) {
            sb.append("?, ");
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append(")}");
        return sb.toString();
    }
}

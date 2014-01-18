/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqlhandler;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.extension.jdbc.ValueType;
import org.seasar.extension.jdbc.types.ValueTypes;

import dbflute.ldb.allcommon.LdCallbackContext;
import dbflute.ldb.allcommon.LdDBDef;
import dbflute.ldb.allcommon.LdInternalMapContext;
import dbflute.ldb.allcommon.LdQLog;
import dbflute.ldb.allcommon.bhv.core.LdResourceContext;
import dbflute.ldb.allcommon.cbean.LdConditionBeanContext;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlContext;
import dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException;
import dbflute.ldb.allcommon.exception.LdSQLFailureException;
import dbflute.ldb.allcommon.s2dao.internal.sqllog.LdInternalSqlLogRegistry;
import dbflute.ldb.allcommon.s2dao.internal.util.LdInternalBindVariableUtil;
import dbflute.ldb.allcommon.jdbc.LdSqlLogHandler;
import dbflute.ldb.allcommon.util.LdSimpleSystemUtil;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalBasicHandler {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private DataSource dataSource;
    private String sql;
    private StatementFactory statementFactory;
    private Object[] loggingMessageSqlArgs;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalBasicHandler(DataSource ds, StatementFactory statementFactory) {
        setDataSource(ds);
        setStatementFactory(statementFactory);
    }

    public LdInternalBasicHandler(DataSource ds, String sql, StatementFactory statementFactory) {
        setDataSource(ds);
        setSql(sql);
        setStatementFactory(statementFactory);
    }

    // ===================================================================================
    //                                                                        Common Logic
    //                                                                        ============
    // -----------------------------------------------------
    //                                         Args Handling
    //                                         -------------
    protected void bindArgs(PreparedStatement ps, Object[] args, Class<?>[] argTypes) {
        if (args == null) {
            return;
        }
        for (int i = 0; i < args.length; ++i) {
            final ValueType valueType = findValueType(args[i], argTypes[i]);
            try {
                valueType.bindValue(ps, i + 1, args[i]);
            } catch (SQLException e) {
                handleSQLException(e, ps);
            }
        }
    }

    protected ValueType findValueType(Object arg, Class<?> argType) {
        ValueType valueType = ValueTypes.getValueType(arg);
        if (valueType != null) {
            return valueType;
        }
        valueType = ValueTypes.getValueType(argType);
        if (valueType != null) {
            return valueType;
        }
        String msg = "Unknown type：argType=" + argType + " args=" + arg;
        throw new IllegalStateException(msg);
    }

    protected Class<?>[] getArgTypes(Object[] args) {
        if (args == null) {
            return null;
        }
        Class<?>[] argTypes = new Class[args.length];
        for (int i = 0; i < args.length; ++i) {
            Object arg = args[i];
            if (arg != null) {
                argTypes[i] = arg.getClass();
            }
        }
        return argTypes;
    }

    // -----------------------------------------------------
    //                                           SQL Logging
    //                                           -----------
    protected void logSql(Object[] args, Class<?>[] argTypes) {
        final LdSqlLogHandler sqlLogHandler = getSqlLogHander();
        final boolean existsSqlLogHandler = sqlLogHandler != null;
        final Object sqlLogRegistry = LdInternalSqlLogRegistry.findContainerSqlLogRegistry();
        final boolean existsSqlLogRegistry = sqlLogRegistry != null;
        if (isLogEnabled() || existsSqlLogHandler || existsSqlLogRegistry) {
            final String completeSql = getCompleteSql(args);
            if (isLogEnabled()) {
                log((isContainsLineSeparatorInSql() ? getLineSeparator() : "") + completeSql);
            }
            if (existsSqlLogHandler) { // DBFlute provides
                sqlLogHandler.handle(getSql(), completeSql, args, argTypes);
            }
            if (existsSqlLogRegistry) { // S2Container provides
                LdInternalSqlLogRegistry.push(getSql(), completeSql, args, argTypes, sqlLogRegistry);
            }
        }
    }

    protected boolean isLogEnabled() {
        return LdQLog.isLogEnabled();
    }

    protected void log(String msg) {
        LdQLog.log(msg);
    }

    protected String getCompleteSql(Object[] args) {
        String logDateFormat = LdResourceContext.getLogDateFormat();
        String logTimestampFormat = LdResourceContext.getLogTimestampFormat();
        return LdInternalBindVariableUtil.getCompleteSql(sql, args, logDateFormat, logTimestampFormat);
    }

    protected LdSqlLogHandler getSqlLogHander() {
        if (!LdCallbackContext.isExistCallbackContextOnThread()) {
            return null;
        }
        return LdCallbackContext.getCallbackContextOnThread().getSqlLogHandler();
    }

    protected boolean isContainsLineSeparatorInSql() {
        return sql != null ? sql.contains(getLineSeparator()) : false;
    }

    // -----------------------------------------------------
    //                                               Various
    //                                               -------
    protected String getBindVariableText(Object bindVariable) {
        String logDateFormat = LdResourceContext.getLogDateFormat();
        String logTimestampFormat = LdResourceContext.getLogTimestampFormat();
        return LdInternalBindVariableUtil.getBindVariableText(bindVariable, logDateFormat, logTimestampFormat);
    }

    // ===================================================================================
    //                                                                   Exception Handler
    //                                                                   =================
    protected void handleSQLException(SQLException e, Statement statement) {
        handleSQLException(e, statement, false);
    }

    protected void handleSQLException(SQLException e, Statement statement, boolean uniqueConstraintValid) {
        String completeSql = buildLoggingMessageSql();
        new SQLExceptionHandler().handleSQLException(e, statement, uniqueConstraintValid, completeSql);
    }

    protected String buildLoggingMessageSql() {
        String completeSql = null;
        if (sql != null && loggingMessageSqlArgs != null) {
            try {
                completeSql = getCompleteSql(loggingMessageSqlArgs);
            } catch (RuntimeException ignored) {
            }
        }
        return completeSql;
    }

    /**
     * The handler of SQLException.
     */
    public static class SQLExceptionHandler {

        /**
         * @param e The instance of SQLException. (NotNull)
         * @param statement The instance of statement. (Nullable)
         */
        public void handleSQLException(SQLException e, Statement statement) {
            handleSQLException(e, statement, false);
        }
        
        public void handleSQLException(SQLException e, Statement statement, boolean uniqueConstraintValid) {
            handleSQLException(e, statement, uniqueConstraintValid, null);
        }
        
        public void handleSQLException(SQLException e, Statement statement, boolean uniqueConstraintValid, String completeSql) {
            if (uniqueConstraintValid && isUniqueConstraintException(e)) {
                throwEntityAlreadyExistsException(e, statement, completeSql);
            }
            throwSQLFailureException(e, statement, completeSql);
        }
    
        protected boolean isUniqueConstraintException(SQLException e) {
            if (!LdResourceContext.isExistResourceContextOnThread()) {
                return false;
            }
            return LdResourceContext.isUniqueConstraintException(extractSQLState(e), e.getErrorCode());
        }

        protected void throwEntityAlreadyExistsException(SQLException e, Statement statement, String completeSql) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The entity already exists on the database!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Please confirm the primary key whether it already exists on the database." + getLineSeparator();
            msg = msg + "And confirm the unique constraint for other columns." + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[SQLState]" + getLineSeparator() + extractSQLState(e) + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[ErrorCode]" + getLineSeparator() + e.getErrorCode() + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[SQLException]" + getLineSeparator() + e.getClass().getName() + getLineSeparator();
            msg = msg + e.getMessage() + getLineSeparator();
            SQLException nextEx = e.getNextException();
            if (nextEx != null) {
                msg = msg + getLineSeparator();
                msg = msg + "[NextException]" + getLineSeparator();
                msg = msg + nextEx.getClass().getName() + getLineSeparator();
                msg = msg + nextEx.getMessage() + getLineSeparator();
                SQLException nextNextEx = nextEx.getNextException();
                if (nextNextEx != null) {
                    msg = msg + getLineSeparator();
                    msg = msg + "[NextNextException]" + getLineSeparator();
                    msg = msg + nextNextEx.getClass().getName() + getLineSeparator();
                    msg = msg + nextNextEx.getMessage() + getLineSeparator();
                }
            }
            Object invokeName = extractBehaviorInvokeName();
            if (invokeName != null) {
                msg = msg + getLineSeparator();
                msg = msg + "[Behavior]" + getLineSeparator();
                msg = msg + invokeName + getLineSeparator();
            }
            if (hasConditionBean()) {
                msg = msg + getLineSeparator();
                msg = msg + "[ConditionBean]" + getLineSeparator();
                msg = msg + getConditionBean().getClass().getName() + getLineSeparator();
            }
            if (hasOutsideSqlContext()) {
                msg = msg + getLineSeparator();
                msg = msg + "[OutsideSql]" + getLineSeparator();
                msg = msg + getOutsideSqlContext().getOutsideSqlPath() + getLineSeparator();
                msg = msg + getLineSeparator();
                msg = msg + "[ParameterBean]" + getLineSeparator();
                Object pmb = getOutsideSqlContext().getParameterBean();
                if (pmb != null) {
                    msg = msg + pmb.getClass().getName() + getLineSeparator();
                    msg = msg + pmb + getLineSeparator();
                } else {
                    msg = msg + pmb + getLineSeparator();
                }
            }
            if (statement != null) {
                msg = msg + getLineSeparator();
                msg = msg + "[Statement]" + getLineSeparator();
                msg = msg + statement.getClass().getName() + getLineSeparator();
            }
            if (completeSql != null) {
                msg = msg + getLineSeparator();
                msg = msg + "[Display SQL]" + getLineSeparator();
                msg = msg + completeSql + getLineSeparator();
            }
            msg = msg + "* * * * * * * * * */";
            throw new LdEntityAlreadyExistsException(msg, e);
        }
    
        protected void throwSQLFailureException(SQLException e, Statement statement, String completeSql) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The SQL failed to execute!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Please confirm the SQLException message." + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[SQLState]" + getLineSeparator() + extractSQLState(e) + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[ErrorCode]" + getLineSeparator() + e.getErrorCode() + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[SQLException]" + getLineSeparator() + e.getClass().getName() + getLineSeparator();
            msg = msg + e.getMessage() + getLineSeparator();
            SQLException nextEx = e.getNextException();
            if (nextEx != null) {
                msg = msg + getLineSeparator();
                msg = msg + "[NextException]" + getLineSeparator();
                msg = msg + nextEx.getClass().getName() + getLineSeparator();
                msg = msg + nextEx.getMessage() + getLineSeparator();
                SQLException nextNextEx = nextEx.getNextException();
                if (nextNextEx != null) {
                    msg = msg + getLineSeparator();
                    msg = msg + "[NextNextException]" + getLineSeparator();
                    msg = msg + nextNextEx.getClass().getName() + getLineSeparator();
                    msg = msg + nextNextEx.getMessage() + getLineSeparator();
                }
            }
            Object invokeName = extractBehaviorInvokeName();
            if (invokeName != null) {
                msg = msg + getLineSeparator();
                msg = msg + "[Behavior]" + getLineSeparator();
                msg = msg + invokeName + getLineSeparator();
            }
            if (hasConditionBean()) {
                msg = msg + getLineSeparator();
                msg = msg + "[ConditionBean]" + getLineSeparator();
                msg = msg + getConditionBean().getClass().getName() + getLineSeparator();
            }
            if (hasOutsideSqlContext()) {
                msg = msg + getLineSeparator();
                msg = msg + "[OutsideSql]" + getLineSeparator();
                msg = msg + getOutsideSqlContext().getOutsideSqlPath() + getLineSeparator();
                msg = msg + getLineSeparator();
                msg = msg + "[ParameterBean]" + getLineSeparator();
                Object pmb = getOutsideSqlContext().getParameterBean();
                if (pmb != null) {
                    msg = msg + pmb.getClass().getName() + getLineSeparator();
                    msg = msg + pmb + getLineSeparator();
                } else {
                    msg = msg + pmb + getLineSeparator();
                }
            }
            if (statement != null) {
                msg = msg + getLineSeparator();
                msg = msg + "[Statement]" + getLineSeparator();
                msg = msg + statement.getClass().getName() + getLineSeparator();
            }
            if (completeSql != null) {
                msg = msg + getLineSeparator();
                msg = msg + "[Display SQL]" + getLineSeparator();
                msg = msg + completeSql + getLineSeparator();
            }
            msg = msg + "* * * * * * * * * */";
            throw new LdSQLFailureException(msg, e);
        }

        protected String extractSQLState(SQLException e) {
            String sqlState = e.getSQLState();
            if (sqlState != null) {
                return sqlState;
            }

            // Next
            SQLException nextEx = e.getNextException();
            if (nextEx == null) {
                return null;
            }
            sqlState = nextEx.getSQLState();
            if (sqlState != null) {
                return sqlState;
            }

            // Next Next
            SQLException nextNextEx = nextEx.getNextException();
            if (nextNextEx == null) {
                return null;
            }
            sqlState = nextNextEx.getSQLState();
            if (sqlState != null) {
                return sqlState;
            }

            // Next Next Next
            SQLException nextNextNextEx = nextNextEx.getNextException();
            if (nextNextNextEx == null) {
                return null;
            }
            sqlState = nextNextNextEx.getSQLState();
            if (sqlState != null) {
                return sqlState;
            }

            // It doesn't use recursive call by design because JDBC is unpredictable fellow.
            return null;
        }

        protected String extractBehaviorInvokeName() {
            final Object behaviorInvokeName = LdInternalMapContext.getObject("df:BehaviorInvokeName");
            if (behaviorInvokeName == null) {
                return null;
            }
            final Object clientInvokeName = LdInternalMapContext.getObject("df:ClientInvokeName");
            final Object byPassInvokeName = LdInternalMapContext.getObject("df:ByPassInvokeName");
            final StringBuilder sb = new StringBuilder();
            boolean existsPath = false;
            if (clientInvokeName != null) {
                existsPath = true;
                sb.append(clientInvokeName);
            }
            if (byPassInvokeName != null) {
                existsPath = true;
                sb.append(byPassInvokeName);
            }
            sb.append(behaviorInvokeName);
            if (existsPath) {
                sb.append("...");
            }
            return sb.toString();
        }

        protected boolean hasConditionBean() {
            return LdConditionBeanContext.isExistConditionBeanOnThread();
        }

        protected LdConditionBean getConditionBean() {
            return LdConditionBeanContext.getConditionBeanOnThread();
        }

        protected boolean hasOutsideSqlContext() {
            return LdOutsideSqlContext.isExistOutsideSqlContextOnThread();
        }

        protected LdOutsideSqlContext getOutsideSqlContext() {
            return LdOutsideSqlContext.getOutsideSqlContextOnThread();
        }

        protected String getLineSeparator() {
            return LdSimpleSystemUtil.getLineSeparator();
        }
    }

    // ===================================================================================
    //                                                                      JDBC Delegator
    //                                                                      ==============
    protected Connection getConnection() {
        if (dataSource == null) {
            throw new IllegalStateException("The dataSource should not be null!");
        }
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            handleSQLException(e, null);
            return null;// Unreachable!
        }
    }

    protected PreparedStatement prepareStatement(Connection conn) {
        if (sql == null) {
            throw new IllegalStateException("The sql should not be null!");
        }
        return statementFactory.createPreparedStatement(conn, sql);
    }

    protected int executeUpdate(PreparedStatement ps) {
        try {
            return ps.executeUpdate();
        } catch (SQLException e) {
            handleSQLException(e, ps, true);
            return 0;// Unreachable!
        }
    }

    protected void setFetchSize(Statement statement, int fetchSize) {
        if (statement == null) {
            return;
        }
        try {
            statement.setFetchSize(fetchSize);
        } catch (SQLException e) {
            handleSQLException(e, statement);
        }
    }

    protected void setMaxRows(Statement statement, int maxRows) {
        if (statement == null) {
            return;
        }
        try {
            statement.setMaxRows(maxRows);
        } catch (SQLException e) {
            handleSQLException(e, statement);
        }
    }

    protected void close(Statement statement) {
        if (statement == null) {
            return;
        }
        try {
            statement.close();
        } catch (SQLException e) {
            handleSQLException(e, statement);
        }
    }

    protected void close(ResultSet resultSet) {
        if (resultSet == null) {
            return;
        }
        try {
            resultSet.close();
        } catch (SQLException e) {
            handleSQLException(e, null);
        }
    }

    protected void close(Connection conn) {
        if (conn == null) {
            return;
        }
        try {
            conn.close();
        } catch (SQLException e) {
            handleSQLException(e, null);
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // It needs this method if the target database does not support line comment.
    protected String removeLineComment(final String sql) { // With removing CR!
        if (sql == null || sql.trim().length() == 0) {
            return sql;
        }
        final StringBuilder sb = new StringBuilder();
        final String[] lines = sql.split("\n");
        for (String line : lines) {
            if (line == null) {
                continue;
            }
            line = line.replaceAll("\r", ""); // Remove CR!
            if (line.startsWith("--")) {
                continue;
            }
            sb.append(line).append("\n");
        }
        final String filteredSql = sb.toString();
        return filteredSql.substring(0, filteredSql.lastIndexOf("\n"));
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected String getLineSeparator() {
        return LdSimpleSystemUtil.getLineSeparator();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        if (isRemoveLineCommentFromSql()) {
            sql = removeLineComment(sql);
        }
        this.sql = sql;
    }

    protected boolean isRemoveLineCommentFromSql() {
        // Because the MS-Access does not support line comments.
        return isCurrentDBDef(LdDBDef.MSAccess);
    }
    
    protected boolean isCurrentDBDef(LdDBDef currentDBDef) {
	    return LdResourceContext.isCurrentDBDef(currentDBDef);
    }

    public StatementFactory getStatementFactory() {
        return statementFactory;
    }

    public void setStatementFactory(StatementFactory statementFactory) {
        this.statementFactory = statementFactory;
    }

    public void setLoggingMessageSqlArgs(Object[] loggingMessageSqlArgs) {
        this.loggingMessageSqlArgs = loggingMessageSqlArgs;
    }
}

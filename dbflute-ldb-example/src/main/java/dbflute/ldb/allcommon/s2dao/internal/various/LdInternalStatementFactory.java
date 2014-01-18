/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.various;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.SQLException;

import org.seasar.extension.jdbc.StatementFactory;

import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionBeanContext;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlContext;
import dbflute.ldb.allcommon.jdbc.LdStatementConfig;
import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalBasicHandler.SQLExceptionHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalStatementFactory implements StatementFactory {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log-instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(LdInternalStatementFactory.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdStatementConfig defaultStatementConfig;
    protected boolean internalDebug;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalStatementFactory() {
    }

    // ===================================================================================
    //                                                                      Implementation
    //                                                                      ==============
    public PreparedStatement createPreparedStatement(Connection conn, String sql) {
        try {
            final LdStatementConfig config = findStatementConfigOnThread();;
            final int resultSetType;
            if (config != null && config.hasResultSetType()) {
                resultSetType = config.getResultSetType();
            } else if (defaultStatementConfig != null && defaultStatementConfig.hasResultSetType()) {
                resultSetType = defaultStatementConfig.getResultSetType();
            } else {
                resultSetType = java.sql.ResultSet.TYPE_FORWARD_ONLY;
            }
            final int resultSetConcurrency = java.sql.ResultSet.CONCUR_READ_ONLY;
            if (internalDebug) {
                _log.debug("...Creating prepareStatement(sql, " + resultSetType + ", " + resultSetConcurrency + ")");
            }
            final PreparedStatement ps = conn.prepareStatement(sql, resultSetType, resultSetConcurrency);
            if (config != null && config.hasStatementOptions()) {
                if (internalDebug) {
                    _log.debug("...Setting statement config as request: " + config);
                }
                reflectStatementOptions(config, ps);
            } else {
                reflectDefaultOptionsToStatementIfNeeds(ps);
            }
            return ps;
        } catch (SQLException e) {
            handleSQLException(e, null);
            return null;// Unreachable!
        }
    }
    public CallableStatement createCallableStatement(Connection conn, String sql) {
        return prepareCall(conn, sql);
    }
    protected LdStatementConfig findStatementConfigOnThread() {
        final LdStatementConfig config;
        if (LdConditionBeanContext.isExistConditionBeanOnThread()) {
            final LdConditionBean cb = LdConditionBeanContext.getConditionBeanOnThread();
            config = cb.getStatementConfig();
        } else if (LdOutsideSqlContext.isExistOutsideSqlContextOnThread()) {
            final LdOutsideSqlContext context = LdOutsideSqlContext.getOutsideSqlContextOnThread();
            config = context.getStatementConfig();
        } else {
            config = null;
        }
        return config;
    }
    protected void reflectDefaultOptionsToStatementIfNeeds(PreparedStatement ps) {
        if (defaultStatementConfig != null && defaultStatementConfig.hasStatementOptions()) {
            if (internalDebug) {
                _log.debug("...Setting statement config as default: " + defaultStatementConfig);
            }
            reflectStatementOptions(defaultStatementConfig, ps);
            return;
        }
    }
    protected void reflectStatementOptions(LdStatementConfig config, PreparedStatement ps) {
        try {
            if (config.hasQueryTimeout()) {
                ps.setQueryTimeout(config.getQueryTimeout());
            }
            if (config.hasFetchSize()) {
                ps.setFetchSize(config.getFetchSize());
            }
            if (config.hasMaxRows()) {
                ps.setMaxRows(config.getMaxRows());
            }
        } catch (SQLException e) {
            handleSQLException(e, ps);
        }
    }
    protected CallableStatement prepareCall(Connection conn, String sql) {
        try {
            return conn.prepareCall(sql);
        } catch (SQLException e) {
            handleSQLException(e, null);
            return null;// Unreachable!
        }
    }
    protected void handleSQLException(SQLException e, Statement statement) {
        new SQLExceptionHandler().handleSQLException(e, statement);
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setDefaultStatementConfig(LdStatementConfig defaultStatementConfig) {
        this.defaultStatementConfig = defaultStatementConfig;
    }

    public void setInternalDebug(boolean internalDebug) {
        this.internalDebug = internalDebug;
    }
}

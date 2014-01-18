/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.dao.SqlCommand;
import org.seasar.extension.jdbc.StatementFactory;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;

/**
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdInternalAbstractSqlCommand implements SqlCommand, LdSqlExecution {

	// ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private DataSource dataSource;
    private StatementFactory statementFactory;
    private String sql;

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalAbstractSqlCommand(DataSource dataSource, StatementFactory statementFactory) {
        this.dataSource = dataSource;
        this.statementFactory = statementFactory;
    }

	// ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public DataSource getDataSource() {
        return dataSource;
    }

    public StatementFactory getStatementFactory() {
        return statementFactory;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}

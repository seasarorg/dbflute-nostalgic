package com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.various;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

import org.seasar.framework.beans.PropertyDesc;
import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.ResultSetHandler;
import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.extension.jdbc.ValueType;
import org.seasar.dao.Dbms;
import org.seasar.dao.IdentifierGenerator;

import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlhandler.InternalBasicSelectHandler;
import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlhandler.InternalBasicHandler.SQLExceptionHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public abstract class InternalIdentifierAbstractGenerator implements IdentifierGenerator {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PropertyType propertyType;
    protected Dbms dbms;
    protected ResultSetHandler resultSetHandler;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalIdentifierAbstractGenerator(PropertyType propertyType, Dbms dbms) {
        this.propertyType = propertyType;
        this.dbms = dbms;
        resultSetHandler = new InternalIdentifierResultSetHandler(propertyType.getValueType());
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected Object executeSql(DataSource ds, String sql, Object[] args) {
        InternalBasicSelectHandler selectHandler = createSelectHandler(ds, sql);
        if (args != null) {
            selectHandler.setLoggingMessageSqlArgs(args);
        }
        return selectHandler.execute(args);
    }

    protected InternalBasicSelectHandler createSelectHandler(DataSource ds, String sql) {
        // Use original statement factory for identifier generator.
        return new InternalBasicSelectHandler(ds, sql, resultSetHandler, createStatementFactory(ds, sql));
    }

    protected StatementFactory createStatementFactory(DataSource ds, String sql) {
        return new InternalIdentifierGeneratorStatementFactory();
    }

    protected void reflectIdentifier(Object bean, Object value) {
        if (propertyType == null) {
            String msg = "The arguement[propertyType] should not be null: value=" + value;
            throw new IllegalArgumentException(msg);
        }
        PropertyDesc pd = propertyType.getPropertyDesc();
        pd.setValue(bean, value);
    }

    // ===================================================================================
    //                                                                  Result Set Handler
    //                                                                  ==================
    protected static class InternalIdentifierResultSetHandler implements ResultSetHandler {
        private ValueType valueType;
        public InternalIdentifierResultSetHandler(ValueType valueType) {
            this.valueType = valueType;
        }
        public Object handle(ResultSet rs) throws SQLException {
            if (rs.next()) {
                return valueType.getValue(rs, 1);
            }
            return null;
        }
    }

    // ===================================================================================
    //                                                                   Statement Factory
    //                                                                   =================
    protected static class InternalIdentifierGeneratorStatementFactory implements StatementFactory {
        public PreparedStatement createPreparedStatement(Connection conn, String sql) {
            try {
                return conn.prepareStatement(sql);
            } catch (SQLException e) {
                handleSQLException(e, null);
                return null; // Unreachable!
            }
        }
        public CallableStatement createCallableStatement(Connection conn, String sql) {
            try {
                return conn.prepareCall(sql);
            } catch (SQLException e) {
                handleSQLException(e, null);
                return null; // Unreachable!
            }
        }

        protected void handleSQLException(SQLException e, Statement statement) {
            new SQLExceptionHandler().handleSQLException(e, statement);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getPropertyName() {
        return propertyType.getPropertyName();
    }

    public Dbms getDbms() {
        return dbms;
    }
}

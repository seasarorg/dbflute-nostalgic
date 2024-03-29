package com.example.dbflute.basic.dbflute.allcommon.bhv.core.command;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.seasar.extension.jdbc.ResultSetHandler;
import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.extension.jdbc.ValueType;
import org.seasar.extension.jdbc.types.ValueTypes;
import org.seasar.dao.BeanMetaData;
import org.seasar.dao.BeanMetaDataFactory;
import org.seasar.dao.ValueTypeFactory;

import com.example.dbflute.basic.dbflute.allcommon.bhv.core.BehaviorCommand;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.BehaviorCommandComponentSetup;
import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.rshandler.InternalBeanListMetaDataResultSetHandler;
import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqlcommand.InternalUpdateDynamicCommand;
import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.various.InternalRowCreator;
import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.various.InternalRelationRowCreator;

/**
 * @author DBFlute(AutoGenerator)
 * @param <RESULT> The type of result.
 */
public abstract class AbstractBehaviorCommand<RESULT> implements BehaviorCommand<RESULT>, BehaviorCommandComponentSetup {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                     Basic Information
    //                                     -----------------
    /** The table DB name. (Required) */
    protected String _tableDbName;

    /** Is it initialize only? (Choice) */
    protected boolean _initializeOnly;

    // -----------------------------------------------------
    //                                   Injection Component
    //                                   -------------------
    protected DataSource _dataSource;
    protected StatementFactory _statementFactory;
    protected BeanMetaDataFactory _beanMetaDataFactory;
    protected ValueTypeFactory _valueTypeFactory;
    protected String _sqlFileEncoding;

    // ===================================================================================
    //                                                                             Factory
    //                                                                             =======
    // -----------------------------------------------------
    //                                   UpdateDynamicCommnd
    //                                   -------------------
    protected InternalUpdateDynamicCommand createUpdateDynamicCommand(String[] argNames, Class<?>[] argTypes, String sql) {
        final InternalUpdateDynamicCommand cmd = new InternalUpdateDynamicCommand(_dataSource, _statementFactory);
        cmd.setArgNames(argNames);
        cmd.setArgTypes(argTypes);
        if (sql != null) {
            cmd.setSql(sql);
        }
        return cmd;
    }

    // -----------------------------------------------------
    //                                      ResultSetHandler
    //                                      ----------------
    protected ResultSetHandler createBeanListMetaDataResultSetHandler(BeanMetaData bmd) {
        final InternalRowCreator rowCreator = createInternalRowCreator(bmd);
        final InternalRelationRowCreator relationRowCreator = createInternalRelationRowCreator(bmd);
        return new InternalBeanListMetaDataResultSetHandler(bmd, rowCreator, relationRowCreator);
    }

    protected ResultSetHandler createObjectResultSetHandler(Class<?> objectType) {
        final ValueType valueType = ValueTypes.getValueType(objectType);
        return new InternalObjectResultSetHandler(valueType);
    }

    protected ResultSetHandler createObjectListResultSetHandler(Class<?> objectType) {
        final ValueType valueType = ValueTypes.getValueType(objectType);
        return createObjectListResultSetHandler(valueType);
    }

    protected ResultSetHandler createObjectListResultSetHandler(ValueType valueType) {
        return new InternalObjectListResultSetHandler(valueType);
    }

    protected static class InternalObjectResultSetHandler implements ResultSetHandler {
        private ValueType valueType;
        public InternalObjectResultSetHandler(ValueType valueType) {
            this.valueType = valueType;
        }
        public Object handle(ResultSet rs) throws SQLException {
            while (rs.next()) {
                return valueType.getValue(rs, 1);
            }
            return null;
        }
    }

    protected static class InternalObjectListResultSetHandler implements ResultSetHandler {
        private ValueType valueType;
        public InternalObjectListResultSetHandler(ValueType valueType) {
            this.valueType = valueType;
        }
        public Object handle(ResultSet rs) throws SQLException {
            final List<Object> ret = new ArrayList<Object>();
            while (rs.next()) {
                ret.add(valueType.getValue(rs, 1));
            }
            return ret;
        }
    }

    protected static class InternalNullResultSetHandler implements ResultSetHandler {
        public Object handle(ResultSet rs) throws SQLException {
            return null;
        }
    }

    protected InternalRowCreator createInternalRowCreator(BeanMetaData bmd) {
        final Class<?> clazz = bmd != null ? bmd.getBeanClass() : null;
        return InternalRowCreator.createInternalRowCreator(clazz);
    }

    protected InternalRelationRowCreator createInternalRelationRowCreator(BeanMetaData bmd) {
        return new InternalRelationRowCreator(); // Not yet implemented about performance tuning!
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void assertBasicProperty(String methodName) {
        if (_tableDbName == null) {
            throw new IllegalStateException(buildAssertMessage("_tableDbName", methodName));
        }
    }

    protected void assertComponentProperty(String methodName) {
        if (_dataSource == null) {
            throw new IllegalStateException(buildAssertMessage("_dataSource", methodName));
        }
        if (_statementFactory == null) {
            throw new IllegalStateException(buildAssertMessage("_statementFactory", methodName));
        }
        if (_beanMetaDataFactory == null) {
            throw new IllegalStateException(buildAssertMessage("_beanMetaDataFactory", methodName));
        }
        if (_valueTypeFactory == null) {
            throw new IllegalStateException(buildAssertMessage("_valueTypeFactory", methodName));
        }
        if (_sqlFileEncoding == null) {
            throw new IllegalStateException(buildAssertMessage("_sqlFileEncoding", methodName));
        }
    }

    protected String buildAssertMessage(String propertyName, String methodName) {
        propertyName = propertyName.startsWith("_") ? propertyName.substring("_".length()) : propertyName;
        String msg = "The property '" + propertyName + "' should not be null";
        msg = msg + " when you call " + methodName + "().";
        throw new IllegalStateException(msg);
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return getClass().getSimpleName() + ":{" + buildSqlExecutionKey() + "}";
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    // -----------------------------------------------------
    //                                     Basic Information
    //                                     -----------------
    public String getTableDbName() {
        return _tableDbName;
    }

    public void setTableDbName(String tableDbName) {
        _tableDbName = tableDbName;
    }

    public void setInitializeOnly(boolean initializeOnly) {
        _initializeOnly = initializeOnly;
    }

    public boolean isInitializeOnly() {
        return _initializeOnly;
    }

    // -----------------------------------------------------
    //                                   Injection Component
    //                                   -------------------
    public void setDataSource(DataSource dataSource) {
        _dataSource = dataSource;
    }

    public void setStatementFactory(StatementFactory statementFactory) {
        _statementFactory = statementFactory;
    }

    public void setBeanMetaDataFactory(BeanMetaDataFactory beanMetaDataFactory) {
        _beanMetaDataFactory = beanMetaDataFactory;
    }

    public void setValueTypeFactory(ValueTypeFactory valueTypeFactory) {
        _valueTypeFactory = valueTypeFactory;
    }

    public void setSqlFileEncoding(String sqlFileEncoding) {
        _sqlFileEncoding = sqlFileEncoding;
    }
}

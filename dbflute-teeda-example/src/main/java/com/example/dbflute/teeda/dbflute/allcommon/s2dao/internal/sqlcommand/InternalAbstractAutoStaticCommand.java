package com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlcommand;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.seasar.dao.BeanMetaData;
import org.seasar.dao.IdentifierGenerator;
import org.seasar.dao.PrimaryKeyNotFoundRuntimeException;
import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.framework.exception.SRuntimeException;

import com.example.dbflute.teeda.dbflute.allcommon.exception.EntityAlreadyUpdatedException;
import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlhandler.InternalAbstractAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public abstract class InternalAbstractAutoStaticCommand extends InternalAbstractStaticCommand {

	// ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private PropertyType[] propertyTypes;
    protected boolean optimisticLockHandling;
    protected boolean versionNoAutoIncrementOnMemory;

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalAbstractAutoStaticCommand(DataSource dataSource
            , StatementFactory statementFactory, BeanMetaData beanMetaData, String[] propertyNames
            , boolean optimisticLockHandling, boolean versionNoAutoIncrementOnMemory) {
        super(dataSource, statementFactory, beanMetaData);
        this.optimisticLockHandling = optimisticLockHandling;
        this.versionNoAutoIncrementOnMemory = versionNoAutoIncrementOnMemory;
        setupPropertyTypes(propertyNames);
        setupSql();
    }

	// ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public Object execute(Object[] args) { // NOT for Batch. Batch should override.
        InternalAbstractAutoHandler handler = createAutoHandler();
        handler.setOptimisticLockHandling(optimisticLockHandling);
        handler.setVersionNoAutoIncrementOnMemory(versionNoAutoIncrementOnMemory);
        handler.setSql(getSql());
        handler.setLoggingMessageSqlArgs(args);
        int rows = handler.execute(args);
        return new Integer(rows);
    }

    protected EntityAlreadyUpdatedException createEntityAlreadyUpdatedException(Object bean, int rows) {
        return new EntityAlreadyUpdatedException(bean, rows);
    }

    protected PropertyType[] getPropertyTypes() {
        return propertyTypes;
    }

    protected void setPropertyTypes(PropertyType[] propertyTypes) {
        this.propertyTypes = propertyTypes;
    }

    protected abstract InternalAbstractAutoHandler createAutoHandler();

    protected abstract void setupPropertyTypes(String[] propertyNames);

    protected void setupInsertPropertyTypes(String[] propertyNames) {
        List<PropertyType> types = new ArrayList<PropertyType>();
        for (int i = 0; i < propertyNames.length; ++i) {
            PropertyType pt = getBeanMetaData().getPropertyType(propertyNames[i]);
            if (isInsertTarget(pt)) {
                types.add(pt);
            }
        }
        propertyTypes = (PropertyType[]) types.toArray(new PropertyType[types.size()]);
    }

    protected boolean isInsertTarget(PropertyType propertyType) {
        if (propertyType.isPrimaryKey()) {
            String name = propertyType.getPropertyName();
            final IdentifierGenerator generator = getBeanMetaData().getIdentifierGenerator(name);
            return generator.isSelfGenerate();
        }
        return true;
    }

    protected void setupUpdatePropertyTypes(String[] propertyNames) {
        List<PropertyType> types = new ArrayList<PropertyType>();
        for (int i = 0; i < propertyNames.length; ++i) {
            PropertyType pt = getBeanMetaData().getPropertyType(propertyNames[i]);
            if (pt.isPrimaryKey()) {
                continue;
            }
            types.add(pt);
        }
        if (types.size() == 0) {
            throw new SRuntimeException("EDAO0020");
        }
        propertyTypes = (PropertyType[]) types.toArray(new PropertyType[types.size()]);
    }

    protected void setupDeletePropertyTypes(String[] propertyNames) {
    }

    protected abstract void setupSql();

    protected void setupInsertSql() {
        BeanMetaData bmd = getBeanMetaData();
        StringBuilder sb = new StringBuilder(100);
        sb.append("insert into ");
        sb.append(bmd.getTableName());
        sb.append(" (");
        for (int i = 0; i < propertyTypes.length; ++i) {
            PropertyType pt = propertyTypes[i];
            if (isInsertTarget(pt)) {
                sb.append(pt.getColumnName());
                sb.append(", ");
            }
        }
        sb.setLength(sb.length() - 2);
        sb.append(") values (");
        for (int i = 0; i < propertyTypes.length; ++i) {
            PropertyType pt = propertyTypes[i];
            if (isInsertTarget(pt)) {
                sb.append("?, ");
            }
        }
        sb.setLength(sb.length() - 2);
        sb.append(")");
        setSql(sb.toString());
    }

    protected void setupUpdateSql() {
        checkPrimaryKey();
        StringBuilder sb = new StringBuilder(100);
        sb.append("update ");
        sb.append(getBeanMetaData().getTableName());
        sb.append(" set ");
        String versionNoPropertyName = getBeanMetaData().getVersionNoPropertyName();
        for (int i = 0; i < propertyTypes.length; ++i) {
            PropertyType pt = propertyTypes[i];
            if (pt.getPropertyName().equalsIgnoreCase(versionNoPropertyName) && !versionNoAutoIncrementOnMemory) {
                sb.append(pt.getColumnName()).append(" = ").append(pt.getColumnName()).append(" + 1, ");
                continue;
            }
            sb.append(pt.getColumnName()).append(" = ?, ");
        }
        sb.setLength(sb.length() - 2);
        setupUpdateWhere(sb);
        setSql(sb.toString());
    }

    protected void setupDeleteSql() {
        checkPrimaryKey();
        final StringBuilder sb = new StringBuilder(100);
        sb.append("delete from ");
        sb.append(getBeanMetaData().getTableName());
        setupUpdateWhere(sb);
        setSql(sb.toString());
    }

    protected void checkPrimaryKey() {
        BeanMetaData bmd = getBeanMetaData();
        if (bmd.getPrimaryKeySize() == 0) {
            throw new PrimaryKeyNotFoundRuntimeException(bmd.getBeanClass());
        }
    }

    protected void setupUpdateWhere(StringBuilder sb) {
        BeanMetaData bmd = getBeanMetaData();
        sb.append(" where ");
        for (int i = 0; i < bmd.getPrimaryKeySize(); ++i) {
            sb.append(bmd.getPrimaryKey(i)).append(" = ? and ");
        }
        sb.setLength(sb.length() - 5);
        if (optimisticLockHandling && bmd.hasVersionNoPropertyType()) {
            PropertyType pt = bmd.getVersionNoPropertyType();
            sb.append(" and ").append(pt.getColumnName()).append(" = ?");
        }
        if (optimisticLockHandling && bmd.hasTimestampPropertyType()) {
            PropertyType pt = bmd.getTimestampPropertyType();
            sb.append(" and ").append(pt.getColumnName()).append(" = ?");
        }
    }
}

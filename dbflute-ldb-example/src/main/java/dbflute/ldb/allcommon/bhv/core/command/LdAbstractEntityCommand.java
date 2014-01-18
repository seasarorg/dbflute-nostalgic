/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import java.util.List;
import java.util.ArrayList;

import org.seasar.extension.jdbc.PropertyType;
import org.seasar.dao.BeanMetaData;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlOption;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;

/**
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractEntityCommand extends LdAbstractBehaviorCommand<Integer> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The type of entity. (Required) */
    protected Class<? extends LdEntity> _entityType;

    /** The instance of condition-bean. (Required) */
    protected LdEntity _entity;

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public Class<?> getCommandReturnType() {
        return Integer.class;
    }

    // ===================================================================================
    //                                                                  Detail Information
    //                                                                  ==================
    public boolean isConditionBean() {
        return false;
    }

    public boolean isOutsideSql() {
        return false;
    }

    public boolean isProcedure() {
        return false;
    }

    public boolean isSelect() {
        return false;
    }

    public boolean isSelectCount() {
        return false;
    }

    // ===================================================================================
    //                                                                             Factory
    //                                                                             =======
    // -----------------------------------------------------
    //                                          BeanMetaData
    //                                          ------------
    protected BeanMetaData createBeanMetaData() {
        return _beanMetaDataFactory.createBeanMetaData(_entityType);
    }

    // ===================================================================================
    //                                                                    Process Callback
    //                                                                    ================
    public void beforeGettingSqlExecution() {
    }

    public void afterExecuting() {
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public String buildSqlExecutionKey() {
        assertStatus("buildSqlExecutionKey");
        return _tableDbName + ":" + getCommandName() + "(" + _entityType.getSimpleName() + ")";
    }

    public Object[] getSqlExecutionArgument() {
        assertStatus("getSqlExecutionArgument");
        return new Object[] { _entity };
    }

    // ===================================================================================
    //                                                                Argument Information
    //                                                                ====================
    public LdConditionBean getConditionBean() {
        return null;
    }

    public String getOutsideSqlPath() {
        return null;
    }

    public LdOutsideSqlOption getOutsideSqlOption() {
        return null;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected LdDBMeta findDBMeta() {
        // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - 
        // Cannot use the handler of DBMeta instance
        // because the customize-entity is contained to find here.
        // - - - - - - - - - -/
        // LdDBMetaInstanceHandler.findDBMeta(_tableDbName);

        final Class<?> beanType = _entityType;
        if (beanType == null) {
            return null;
        }
        if (!LdEntity.class.isAssignableFrom(beanType)) {
            return null;
        }
        final LdEntity entity;
        try {
            entity = (LdEntity)beanType.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
        return entity.getDBMeta();
    }

    protected String[] getPersistentPropertyNames(BeanMetaData bmd) {
        final List<String> nameList = new ArrayList<String>();
        for (int i = 0; i < bmd.getPropertyTypeSize(); ++i) {
            final PropertyType pt = bmd.getPropertyType(i);
            if (pt.isPersistent()) {
                nameList.add(pt.getPropertyName());
            }
        }
        return nameList.toArray(new String[nameList.size()]);
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void assertStatus(String methodName) {
        assertBasicProperty(methodName);
        assertComponentProperty(methodName);
        if (_entityType == null) {
            throw new IllegalStateException(buildAssertMessage("_entityType", methodName));
        }
        if (_entity == null) {
            throw new IllegalStateException(buildAssertMessage("_entity", methodName));
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setEntityType(Class<? extends LdEntity> entityType) {
        _entityType = entityType;
    }

    public void setEntity(LdEntity entity) {
        _entity = entity;
    }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecutionCreator;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionBeanContext;
import dbflute.ldb.allcommon.cbean.LdFetchNarrowingBeanContext;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlOption;
import dbflute.ldb.allcommon.s2dao.internal.sqlcommand.LdInternalUpdateQueryAutoDynamicCommand;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdQueryUpdateEntityCBCommand extends LdAbstractEntityCommand {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The type of condition-bean. (Derived from conditionBean) */
    protected Class<? extends LdConditionBean> _conditionBeanType;

    /** The instance of condition-bean. (Required) */
    protected LdConditionBean _conditionBean;

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "queryUpdate";
    }

    // ===================================================================================
    //                                                                  Detail Information
    //                                                                  ==================
    @Override
    public boolean isConditionBean() {
        return true;
    }

    // ===================================================================================
    //                                                                    Process Callback
    //                                                                    ================
    @Override
    public void beforeGettingSqlExecution() {
        assertStatus("beforeGettingSqlExecution");
        final LdConditionBean cb = _conditionBean;
        LdFetchNarrowingBeanContext.setFetchNarrowingBeanOnThread(cb);
        LdConditionBeanContext.setConditionBeanOnThread(cb);
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public String buildSqlExecutionKey() {
        assertStatus("buildSqlExecutionKey");
        return _tableDbName + ":" + getCommandName() + "(" + _entityType.getSimpleName() + ", " + _conditionBeanType.getSimpleName() + ")";
    }

    public LdSqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new LdSqlExecutionCreator() {
            public LdSqlExecution createSqlExecution() {
                return createQueryUpdateEntityCBExecution(_conditionBeanType);
            }
        };
    }

    protected LdSqlExecution createQueryUpdateEntityCBExecution(Class<? extends LdConditionBean> cbType) {
        return new LdInternalUpdateQueryAutoDynamicCommand(_dataSource, _statementFactory);
    }

    public Object[] getSqlExecutionArgument() {
        assertStatus("getSqlExecutionArgument");
        return new Object[] { _conditionBean, _entity };
    }

    // ===================================================================================
    //                                                                Argument Information
    //                                                                ====================
    public LdConditionBean getConditionBean() {
        return _conditionBean;
    }

    public String getOutsideSqlPath() {
        return null;
    }

    public LdOutsideSqlOption getOutsideSqlOption() {
        return null;
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    @Override
    protected void assertStatus(String methodName) {
        assertBasicProperty(methodName);
        assertComponentProperty(methodName);
        if (_entityType == null) {
            throw new IllegalStateException(buildAssertMessage("_entityType", methodName));
        }
        if (_entity == null) {
            throw new IllegalStateException(buildAssertMessage("_entity", methodName));
        }
        if (_conditionBeanType == null) {
            throw new IllegalStateException(buildAssertMessage("_conditionBeanType", methodName));
        }
        if (_conditionBean == null) {
            throw new IllegalStateException(buildAssertMessage("_conditionBean", methodName));
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setConditionBeanType(Class<? extends LdConditionBean> conditionBeanType) {
        _conditionBeanType = conditionBeanType;
    }

    public void setConditionBean(LdConditionBean conditionBean) {
        _conditionBean = conditionBean;
    }
}

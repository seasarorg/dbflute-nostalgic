/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import java.util.List;

import org.seasar.extension.jdbc.ResultSetHandler;
import org.seasar.dao.BeanMetaData;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecutionCreator;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionBeanContext;
import dbflute.ldb.allcommon.cbean.LdFetchNarrowingBeanContext;

/**
 * @author DBFlute(AutoGenerator)
 * @param <ENTITY> The type of entity.
 */
public class LdSelectListCBCommand<ENTITY extends LdEntity> extends LdAbstractSelectCBCommand<List<ENTITY>> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The type of entity. (Required) */
    protected Class<ENTITY> _entityType;

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "selectList";
    }

    public Class<?> getCommandReturnType() {
        return List.class;
    }

    // ===================================================================================
    //                                                                  Detail Information
    //                                                                  ==================
    public boolean isSelectCount() {
        return false;
    }

    // ===================================================================================
    //                                                                    Process Callback
    //                                                                    ================
    public void beforeGettingSqlExecution() {
        assertStatus("beforeGettingSqlExecution");
        final LdConditionBean cb = _conditionBean;
        LdFetchNarrowingBeanContext.setFetchNarrowingBeanOnThread(cb);
        LdConditionBeanContext.setConditionBeanOnThread(cb);
    }

    public void afterExecuting() {
        assertStatus("afterExecuting");
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public LdSqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new LdSqlExecutionCreator() {
            public LdSqlExecution createSqlExecution() {
                BeanMetaData bmd = createBeanMetaData();
                ResultSetHandler handler = createBeanListMetaDataResultSetHandler(bmd);
                return createSelectCBExecution(_conditionBeanType, handler);
            }
        };
    }

    protected BeanMetaData createBeanMetaData() {
        return _beanMetaDataFactory.createBeanMetaData(_entityType);
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    @Override
    protected void assertStatus(String methodName) {
        super.assertStatus(methodName);
        if (_entityType == null) {
            throw new IllegalStateException(buildAssertMessage("_entityType", methodName));
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setEntityType(Class<ENTITY> entityType) {
        _entityType = entityType;
    }
}

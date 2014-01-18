package com.example.dbflute.basic.dbflute.allcommon.bhv.core.command;

import org.seasar.dao.BeanMetaData;

import com.example.dbflute.basic.dbflute.allcommon.bhv.core.SqlExecution;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.SqlExecutionCreator;
import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqlcommand.InternalUpdateModifiedOnlyCommand;

/**
 * @author DBFlute(AutoGenerator)
 */
public class UpdateEntityCommand extends AbstractEntityCommand {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "update";
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public SqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new SqlExecutionCreator() {
            public SqlExecution createSqlExecution() {
                final BeanMetaData bmd = createBeanMetaData();
                return createUpdateEntitySqlExecution(bmd);
            }
        };
    }

    protected SqlExecution createUpdateEntitySqlExecution(BeanMetaData bmd) {
        final String[] propertyNames = getPersistentPropertyNames(bmd);
        return createUpdateModifiedOnlyCommand(bmd, propertyNames);
    }

    protected InternalUpdateModifiedOnlyCommand createUpdateModifiedOnlyCommand(BeanMetaData bmd, String[] propertyNames) {
        final InternalUpdateModifiedOnlyCommand cmd = new InternalUpdateModifiedOnlyCommand(_dataSource, _statementFactory);
        cmd.setBeanMetaData(bmd);// Extension Point!
        cmd.setPropertyNames(propertyNames);
        cmd.setOptimisticLockHandling(isOptimisticLockHandling());
        cmd.setVersionNoAutoIncrementOnMemory(isOptimisticLockHandling());
        return cmd;
    }
    
    protected boolean isOptimisticLockHandling() {
        return true;
    }
}

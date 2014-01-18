/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import org.seasar.dao.BeanMetaData;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecutionCreator;
import dbflute.ldb.allcommon.s2dao.internal.sqlcommand.LdInternalUpdateModifiedOnlyCommand;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdUpdateEntityCommand extends LdAbstractEntityCommand {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "update";
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public LdSqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new LdSqlExecutionCreator() {
            public LdSqlExecution createSqlExecution() {
                final BeanMetaData bmd = createBeanMetaData();
                return createUpdateEntitySqlExecution(bmd);
            }
        };
    }

    protected LdSqlExecution createUpdateEntitySqlExecution(BeanMetaData bmd) {
        final String[] propertyNames = getPersistentPropertyNames(bmd);
        return createUpdateModifiedOnlyCommand(bmd, propertyNames);
    }

    protected LdInternalUpdateModifiedOnlyCommand createUpdateModifiedOnlyCommand(BeanMetaData bmd, String[] propertyNames) {
        final LdInternalUpdateModifiedOnlyCommand cmd = new LdInternalUpdateModifiedOnlyCommand(_dataSource, _statementFactory);
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

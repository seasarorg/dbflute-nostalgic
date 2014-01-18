/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import org.seasar.dao.BeanMetaData;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecutionCreator;
import dbflute.ldb.allcommon.s2dao.internal.sqlcommand.LdInternalDeleteBatchAutoStaticCommand;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdBatchDeleteEntityCommand extends LdAbstractListEntityCommand {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "batchDelete";
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public LdSqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new LdSqlExecutionCreator() {
            public LdSqlExecution createSqlExecution() {
                final BeanMetaData bmd = createBeanMetaData();
                return createBatchDeleteEntitySqlExecution(bmd);
            }
        };
    }

    protected LdSqlExecution createBatchDeleteEntitySqlExecution(BeanMetaData bmd) {
        final String[] propertyNames = getPersistentPropertyNames(bmd);
        return createDeleteBatchAutoStaticCommand(bmd, propertyNames);
    }

    protected LdInternalDeleteBatchAutoStaticCommand createDeleteBatchAutoStaticCommand(BeanMetaData bmd, String[] propertyNames) {
        boolean opt = isOptimisticLockHandling();
        return new LdInternalDeleteBatchAutoStaticCommand(_dataSource, _statementFactory, bmd, propertyNames, opt);
    }

    protected boolean isOptimisticLockHandling() {
        return true;
    }
}

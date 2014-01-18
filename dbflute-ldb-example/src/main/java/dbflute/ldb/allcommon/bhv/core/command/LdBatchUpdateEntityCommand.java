/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import org.seasar.dao.BeanMetaData;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecutionCreator;
import dbflute.ldb.allcommon.s2dao.internal.sqlcommand.LdInternalUpdateBatchAutoStaticCommand;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdBatchUpdateEntityCommand extends LdAbstractListEntityCommand {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "batchUpdate";
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public LdSqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new LdSqlExecutionCreator() {
            public LdSqlExecution createSqlExecution() {
                final BeanMetaData bmd = createBeanMetaData();
                return createBatchUpdateEntitySqlExecution(bmd);
            }
        };
    }

    protected LdSqlExecution createBatchUpdateEntitySqlExecution(BeanMetaData bmd) {
        final String[] propertyNames = getPersistentPropertyNames(bmd);
        return createUpdateBatchAutoStaticCommand(bmd, propertyNames);
    }

    protected LdInternalUpdateBatchAutoStaticCommand createUpdateBatchAutoStaticCommand(BeanMetaData bmd, String[] propertyNames) {
        boolean opt = isOptimisticLockHandling();
        return new LdInternalUpdateBatchAutoStaticCommand(_dataSource, _statementFactory, bmd, propertyNames, opt, opt);
    }

    protected boolean isOptimisticLockHandling() {
        return true;
    }
}

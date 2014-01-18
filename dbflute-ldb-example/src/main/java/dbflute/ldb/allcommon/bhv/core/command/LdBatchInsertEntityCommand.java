/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import org.seasar.dao.BeanMetaData;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecutionCreator;
import dbflute.ldb.allcommon.s2dao.internal.sqlcommand.LdInternalInsertBatchAutoStaticCommand;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdBatchInsertEntityCommand extends LdAbstractListEntityCommand {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "batchInsert";
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public LdSqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new LdSqlExecutionCreator() {
            public LdSqlExecution createSqlExecution() {
                final BeanMetaData bmd = createBeanMetaData();
                return createBatchInsertEntitySqlExecution(bmd);
            }
        };
    }

    protected LdSqlExecution createBatchInsertEntitySqlExecution(BeanMetaData bmd) {
        final String[] propertyNames = getPersistentPropertyNames(bmd);
        return createInsertBatchAutoStaticCommand(bmd, propertyNames);
    }

    protected LdInternalInsertBatchAutoStaticCommand createInsertBatchAutoStaticCommand(BeanMetaData bmd, String[] propertyNames) {
        return new LdInternalInsertBatchAutoStaticCommand(_dataSource, _statementFactory, bmd, propertyNames);
    }
}

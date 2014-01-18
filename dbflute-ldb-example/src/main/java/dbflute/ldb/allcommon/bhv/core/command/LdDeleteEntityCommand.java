/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import org.seasar.dao.BeanMetaData;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecutionCreator;
import dbflute.ldb.allcommon.s2dao.internal.sqlcommand.LdInternalDeleteAutoStaticCommand;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdDeleteEntityCommand extends LdAbstractEntityCommand {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "delete";
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public LdSqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new LdSqlExecutionCreator() {
            public LdSqlExecution createSqlExecution() {
                final BeanMetaData bmd = createBeanMetaData();
                return createDeleteEntitySqlExecution(bmd);
            }
        };
    }

    protected LdSqlExecution createDeleteEntitySqlExecution(BeanMetaData bmd) {
        final String[] propertyNames = getPersistentPropertyNames(bmd);
        return createDeleteAutoStaticCommand(bmd, propertyNames);
    }

    protected LdInternalDeleteAutoStaticCommand createDeleteAutoStaticCommand(BeanMetaData bmd, String[] propertyNames) {
        return new LdInternalDeleteAutoStaticCommand(_dataSource, _statementFactory, bmd, propertyNames, isOptimisticLockHandling());
    }

    protected boolean isOptimisticLockHandling() {
        return true;
    }
}

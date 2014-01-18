package com.example.dbflute.basic.dbflute.allcommon.bhv.core.command;

import org.seasar.dao.BeanMetaData;

import com.example.dbflute.basic.dbflute.allcommon.bhv.core.SqlExecution;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.SqlExecutionCreator;
import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqlcommand.InternalDeleteBatchAutoStaticCommand;

/**
 * @author DBFlute(AutoGenerator)
 */
public class BatchDeleteEntityCommand extends AbstractListEntityCommand {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "batchDelete";
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public SqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new SqlExecutionCreator() {
            public SqlExecution createSqlExecution() {
                final BeanMetaData bmd = createBeanMetaData();
                return createBatchDeleteEntitySqlExecution(bmd);
            }
        };
    }

    protected SqlExecution createBatchDeleteEntitySqlExecution(BeanMetaData bmd) {
        final String[] propertyNames = getPersistentPropertyNames(bmd);
        return createDeleteBatchAutoStaticCommand(bmd, propertyNames);
    }

    protected InternalDeleteBatchAutoStaticCommand createDeleteBatchAutoStaticCommand(BeanMetaData bmd, String[] propertyNames) {
        boolean opt = isOptimisticLockHandling();
        return new InternalDeleteBatchAutoStaticCommand(_dataSource, _statementFactory, bmd, propertyNames, opt);
    }

    protected boolean isOptimisticLockHandling() {
        return true;
    }
}

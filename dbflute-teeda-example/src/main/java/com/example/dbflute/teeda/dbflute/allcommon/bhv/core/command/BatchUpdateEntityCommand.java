package com.example.dbflute.teeda.dbflute.allcommon.bhv.core.command;

import org.seasar.dao.BeanMetaData;

import com.example.dbflute.teeda.dbflute.allcommon.bhv.core.SqlExecution;
import com.example.dbflute.teeda.dbflute.allcommon.bhv.core.SqlExecutionCreator;
import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlcommand.InternalUpdateBatchAutoStaticCommand;

/**
 * @author DBFlute(AutoGenerator)
 */
public class BatchUpdateEntityCommand extends AbstractListEntityCommand {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "batchUpdate";
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public SqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new SqlExecutionCreator() {
            public SqlExecution createSqlExecution() {
                final BeanMetaData bmd = createBeanMetaData();
                return createBatchUpdateEntitySqlExecution(bmd);
            }
        };
    }

    protected SqlExecution createBatchUpdateEntitySqlExecution(BeanMetaData bmd) {
        final String[] propertyNames = getPersistentPropertyNames(bmd);
        return createUpdateBatchAutoStaticCommand(bmd, propertyNames);
    }

    protected InternalUpdateBatchAutoStaticCommand createUpdateBatchAutoStaticCommand(BeanMetaData bmd, String[] propertyNames) {
        boolean opt = isOptimisticLockHandling();
        return new InternalUpdateBatchAutoStaticCommand(_dataSource, _statementFactory, bmd, propertyNames, opt, opt);
    }

    protected boolean isOptimisticLockHandling() {
        return true;
    }
}

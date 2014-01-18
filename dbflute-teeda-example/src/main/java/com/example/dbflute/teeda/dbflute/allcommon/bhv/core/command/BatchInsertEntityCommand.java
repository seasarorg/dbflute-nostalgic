package com.example.dbflute.teeda.dbflute.allcommon.bhv.core.command;

import org.seasar.dao.BeanMetaData;

import com.example.dbflute.teeda.dbflute.allcommon.bhv.core.SqlExecution;
import com.example.dbflute.teeda.dbflute.allcommon.bhv.core.SqlExecutionCreator;
import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlcommand.InternalInsertBatchAutoStaticCommand;

/**
 * @author DBFlute(AutoGenerator)
 */
public class BatchInsertEntityCommand extends AbstractListEntityCommand {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "batchInsert";
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public SqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new SqlExecutionCreator() {
            public SqlExecution createSqlExecution() {
                final BeanMetaData bmd = createBeanMetaData();
                return createBatchInsertEntitySqlExecution(bmd);
            }
        };
    }

    protected SqlExecution createBatchInsertEntitySqlExecution(BeanMetaData bmd) {
        final String[] propertyNames = getPersistentPropertyNames(bmd);
        return createInsertBatchAutoStaticCommand(bmd, propertyNames);
    }

    protected InternalInsertBatchAutoStaticCommand createInsertBatchAutoStaticCommand(BeanMetaData bmd, String[] propertyNames) {
        return new InternalInsertBatchAutoStaticCommand(_dataSource, _statementFactory, bmd, propertyNames);
    }
}

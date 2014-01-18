package com.example.dbflute.basic.dbflute.allcommon.bhv.core.command;

import org.seasar.dao.BeanMetaData;

import com.example.dbflute.basic.dbflute.allcommon.bhv.core.SqlExecution;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.SqlExecutionCreator;
import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqlcommand.InternalDeleteAutoStaticCommand;

/**
 * @author DBFlute(AutoGenerator)
 */
public class DeleteEntityCommand extends AbstractEntityCommand {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "delete";
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public SqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new SqlExecutionCreator() {
            public SqlExecution createSqlExecution() {
                final BeanMetaData bmd = createBeanMetaData();
                return createDeleteEntitySqlExecution(bmd);
            }
        };
    }

    protected SqlExecution createDeleteEntitySqlExecution(BeanMetaData bmd) {
        final String[] propertyNames = getPersistentPropertyNames(bmd);
        return createDeleteAutoStaticCommand(bmd, propertyNames);
    }

    protected InternalDeleteAutoStaticCommand createDeleteAutoStaticCommand(BeanMetaData bmd, String[] propertyNames) {
        return new InternalDeleteAutoStaticCommand(_dataSource, _statementFactory, bmd, propertyNames, isOptimisticLockHandling());
    }

    protected boolean isOptimisticLockHandling() {
        return true;
    }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import java.util.List;

import org.seasar.dao.BeanMetaData;

import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.info.LdColumnInfo;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.bhv.core.LdSqlExecutionCreator;
import dbflute.ldb.allcommon.s2dao.internal.sqlcommand.LdInternalInsertAutoDynamicCommand;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInsertEntityCommand extends LdAbstractEntityCommand {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "insert";
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    public LdSqlExecutionCreator createSqlExecutionCreator() {
        assertStatus("createSqlExecutionCreator");
        return new LdSqlExecutionCreator() {
            public LdSqlExecution createSqlExecution() {
                final BeanMetaData bmd = createBeanMetaData();
                return createInsertEntitySqlExecution(bmd);
            }
        };
    }

    protected LdSqlExecution createInsertEntitySqlExecution(BeanMetaData bmd) {
        final LdSqlExecution nonPrimaryKeySqlExecution = createNonPrimaryInsertSqlExecution(bmd);
        if (nonPrimaryKeySqlExecution != null) {
            return nonPrimaryKeySqlExecution;
        }
        final String[] propertyNames = getPersistentPropertyNames(bmd);
        return createInsertAutoDynamicCommand(bmd, propertyNames);
    }

    protected LdInternalInsertAutoDynamicCommand createInsertAutoDynamicCommand(BeanMetaData bmd, String[] propertyNames) {
        final LdInternalInsertAutoDynamicCommand cmd = new LdInternalInsertAutoDynamicCommand();
        cmd.setBeanMetaData(bmd);
        cmd.setDataSource(_dataSource);
        cmd.setPropertyNames(propertyNames);
        cmd.setStatementFactory(_statementFactory);
        return cmd;
    }

    /**
     * @param bmd The meta data of bean. (NotNull)
     * @return Whether the method is target. (For example if it has primary key, returns false.)
     */
    protected LdSqlExecution createNonPrimaryInsertSqlExecution(BeanMetaData bmd) {
        final LdDBMeta dbmeta = findDBMeta();
        if (dbmeta.hasPrimaryKey()) {
            return null;
        }
        final List<LdColumnInfo> columnInfoList = dbmeta.getColumnInfoList();
        final StringBuilder columnDefSb = new StringBuilder();
        for (dbflute.ldb.allcommon.dbmeta.info.LdColumnInfo columnInfo : columnInfoList) {
            columnDefSb.append(", ").append(columnInfo.getColumnDbName());
        }
        columnDefSb.delete(0, ", ".length()).insert(0, "(").append(")");
        final StringBuilder columnValuesSb = new StringBuilder();
        for (dbflute.ldb.allcommon.dbmeta.info.LdColumnInfo columnInfo : columnInfoList) {
            columnValuesSb.append(", /*dto.").append(columnInfo.getPropertyName()).append("*/null");
        }
        columnValuesSb.delete(0, ", ".length()).insert(0, "(").append(")");
        final String sql = "insert into " + dbmeta.getTableSqlName() + columnDefSb + " values" + columnValuesSb;
        return createUpdateDynamicCommand(new String[]{"dto"}, new Class<?>[]{ _entityType }, sql);
    }
}

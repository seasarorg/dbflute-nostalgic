/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.outsidesql.executor;

import java.util.List;

import dbflute.ldb.allcommon.LdDBDef;
import dbflute.ldb.allcommon.bhv.core.LdBehaviorCommand;
import dbflute.ldb.allcommon.bhv.core.LdBehaviorCommandInvoker;
import dbflute.ldb.allcommon.bhv.core.command.LdOutsideSqlSelectListCommand;
import dbflute.ldb.allcommon.cbean.LdConditionBeanContext;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlOption;
import dbflute.ldb.allcommon.jdbc.LdStatementConfig;
import dbflute.ldb.allcommon.util.LdSimpleSystemUtil;

/**
 * The cursor executor of outside-SQL.
 * @param <PARAMETER_BEAN> The type of parameter-bean.
 * @author DBFlute(AutoGenerator)
 */
public class LdOutsideSqlEntityExecutor<PARAMETER_BEAN> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The invoker of behavior command. (NotNull) */
    protected final LdBehaviorCommandInvoker _behaviorCommandInvoker;

    /** The option of outside-SQL. (NotNull) */
    protected final LdOutsideSqlOption _outsideSqlOption;

    /** The DB name of table. (NotNull) */
    protected final String _tableDbName;

	/** The current database definition. (NotNull) */
    protected LdDBDef _currentDBDef;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdOutsideSqlEntityExecutor(LdBehaviorCommandInvoker behaviorCommandInvoker
                                  , LdOutsideSqlOption outsideSqlOption
                                  , String tableDbName
                                  , LdDBDef currentDBDef) {
        this._behaviorCommandInvoker = behaviorCommandInvoker;
        this._outsideSqlOption = outsideSqlOption;
        this._tableDbName = tableDbName;
        this._currentDBDef = currentDBDef;
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    /**
     * Select entity.
     * @param <ENTITY> The type of entity.
     * @param path The path of SQL file. (NotNull)
     * @param pmb The parameter-bean. Allowed types are Bean object and Map object. (Nullable)
     * @param entityType The type of entity. (NotNull)
     * @return The selected entity. (Nullable)
     * @exception dbflute.ldb.allcommon.exception.LdOutsideSqlNotFoundException When the outside-SQL is not found.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity is duplicated.
     */
    public <ENTITY> ENTITY selectEntity(String path, PARAMETER_BEAN pmb, Class<ENTITY> entityType) {
        final List<ENTITY> ls = invoke(createSelectListCommand(path, pmb, entityType));
        if (ls.isEmpty()) {
            return null;
        }
        if (ls.size() > 1) {
            throwEntityDuplicatedException(ls.size() + "", buildSearch4LogString(path, pmb, entityType), null);
        }
        return ls.get(0);
    }

    /**
     * Select entity with deleted check.
     * @param <ENTITY> The type of entity.
     * @param path The path of SQL file. (NotNull)
     * @param pmb The parameter-bean. Allowed types are Bean object and Map object. (Nullable)
     * @param entityType The type of entity. (NotNull)
     * @return The selected entity. (Nullable)
     * @exception dbflute.ldb.allcommon.exception.LdOutsideSqlNotFoundException When the outside-SQL is not found.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted(not found).
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity is duplicated.
     */
    public <ENTITY> ENTITY selectEntityWithDeletedCheck(String path, PARAMETER_BEAN pmb, Class<ENTITY> entityType) {
        final List<ENTITY> ls = invoke(createSelectListCommand(path, pmb, entityType));
        if (ls == null || ls.isEmpty()) {
            throwEntityAlreadyDeletedException(buildSearch4LogString(path, pmb, entityType));
        }
        if (ls.size() > 1) {
            throwEntityDuplicatedException(ls.size() + "", buildSearch4LogString(path, pmb, entityType), null);
        }
        return ls.get(0);
    }

    protected <ENTITY> String buildSearch4LogString(String path, PARAMETER_BEAN pmb, Class<ENTITY> entityType) {
        String tmp = "Table  = " + _outsideSqlOption.getTableDbName() + getLineSeparator();
        tmp = tmp + "Path   = " + path + getLineSeparator();
        tmp = tmp + "Pmb    = " + (pmb != null ? pmb.getClass().getSimpleName() : "null") + ":" + pmb + getLineSeparator();
        tmp = tmp + "Entity = " + (entityType != null ? entityType.getSimpleName() : "null")  + getLineSeparator();
        tmp = tmp + "Option = " + _outsideSqlOption;
        return tmp;
    }

    // -----------------------------------------------------
    //                                                Helper
    //                                                ------
    protected void throwEntityAlreadyDeletedException(Object searchKey4Log) {
        LdConditionBeanContext.throwEntityAlreadyDeletedException(searchKey4Log);
    }

    protected void throwEntityDuplicatedException(String resultCountString, Object searchKey4Log, Throwable cause) {
        LdConditionBeanContext.throwEntityDuplicatedException(resultCountString, searchKey4Log, cause);
    }

    // ===================================================================================
    //                                                                    Behavior Command
    //                                                                    ================
    protected <ENTITY> LdBehaviorCommand<List<ENTITY>> createSelectListCommand(String path, PARAMETER_BEAN pmb, Class<ENTITY> entityType) {
        return xsetupCommand(new LdOutsideSqlSelectListCommand<ENTITY>(), path, pmb, entityType);
    }

    private <ENTITY> LdOutsideSqlSelectListCommand<ENTITY> xsetupCommand(LdOutsideSqlSelectListCommand<ENTITY> command, String path, PARAMETER_BEAN pmb, Class<ENTITY> entityType) {
        command.setTableDbName(_tableDbName);
        _behaviorCommandInvoker.injectComponentProperty(command);
        command.setOutsideSqlPath(path);
        command.setParameterBean(pmb);
        command.setOutsideSqlOption(_outsideSqlOption);
        command.setCurrentDBDef(_currentDBDef);
        command.setEntityType(entityType);
        return command;
    }

    /**
     * Invoke the command of behavior.
     * @param <RESULT> The type of result.
     * @param behaviorCommand The command of behavior. (NotNull)
     * @return The instance of result. (Nullable)
     */
    protected <RESULT> RESULT invoke(LdBehaviorCommand<RESULT> behaviorCommand) {
        return _behaviorCommandInvoker.invoke(behaviorCommand);
    }

    // ===================================================================================
    //                                                                              Option
    //                                                                              ======
    public LdOutsideSqlEntityExecutor<PARAMETER_BEAN> configure(LdStatementConfig statementConfig) {
		_outsideSqlOption.setStatementConfig(statementConfig);
        return this;
    }
	
    public LdOutsideSqlEntityExecutor<PARAMETER_BEAN> dynamicBinding() {
        _outsideSqlOption.dynamicBinding();
        return this;
    }

    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    /**
     * Get the value of line separator.
     * @return The value of line separator. (NotNull)
     */
    protected static String getLineSeparator() {
        return LdSimpleSystemUtil.getLineSeparator();
    }
}

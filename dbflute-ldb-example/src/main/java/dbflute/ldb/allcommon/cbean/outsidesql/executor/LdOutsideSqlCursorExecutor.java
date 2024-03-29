/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.outsidesql.executor;

import dbflute.ldb.allcommon.LdDBDef;
import dbflute.ldb.allcommon.bhv.core.LdBehaviorCommand;
import dbflute.ldb.allcommon.bhv.core.LdBehaviorCommandInvoker;
import dbflute.ldb.allcommon.bhv.core.command.LdOutsideSqlSelectCursorCommand;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlOption;
import dbflute.ldb.allcommon.jdbc.LdCursorHandler;
import dbflute.ldb.allcommon.jdbc.LdStatementConfig;

/**
 * The cursor executor of outside-SQL.
 * @param <PARAMETER_BEAN> The type of parameter-bean.
 * @author DBFlute(AutoGenerator)
 */
public class LdOutsideSqlCursorExecutor<PARAMETER_BEAN> {

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
    public LdOutsideSqlCursorExecutor(LdBehaviorCommandInvoker behaviorCommandInvoker
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
     * Select the cursor of the entity.
     * @param path The path of SQL file. (NotNull)
     * @param pmb The parameter-bean. Allowed types are Bean object and Map object. (Nullable)
     * @param handler The handler of cursor. (NotNull)
     * @return The result object that the cursor handler returns. (Nullable)
     * @exception dbflute.ldb.allcommon.exception.LdOutsideSqlNotFoundException When the outside-SQL is not found.
     */
    public Object selectCursor(String path, PARAMETER_BEAN pmb, LdCursorHandler handler) {
        return invoke(createSelectCursorCommand(path, pmb, handler));
    }

    // ===================================================================================
    //                                                                    Behavior Command
    //                                                                    ================
    protected LdBehaviorCommand<Object> createSelectCursorCommand(String path, PARAMETER_BEAN pmb, LdCursorHandler handler) {
        return xsetupCommand(new LdOutsideSqlSelectCursorCommand(), path, pmb, handler);
    }

    private LdOutsideSqlSelectCursorCommand xsetupCommand(LdOutsideSqlSelectCursorCommand command, String path, PARAMETER_BEAN pmb, LdCursorHandler handler) {
        command.setTableDbName(_tableDbName);
        _behaviorCommandInvoker.injectComponentProperty(command);
        command.setOutsideSqlPath(path);
        command.setParameterBean(pmb);
        command.setOutsideSqlOption(_outsideSqlOption);
        command.setCurrentDBDef(_currentDBDef);
        command.setCursorHandler(handler);
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
    public LdOutsideSqlCursorExecutor<PARAMETER_BEAN> dynamicBinding() {
        _outsideSqlOption.dynamicBinding();
        return this;
    }

    public LdOutsideSqlCursorExecutor<PARAMETER_BEAN> configure(LdStatementConfig statementConfig) {
		_outsideSqlOption.setStatementConfig(statementConfig);
        return this;
    }
}

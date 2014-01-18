/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.outsidesql.executor;

import java.util.List;

import dbflute.ldb.allcommon.LdDBDef;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdResultBeanBuilder;
import dbflute.ldb.allcommon.bhv.core.LdBehaviorCommand;
import dbflute.ldb.allcommon.bhv.core.LdBehaviorCommandInvoker;
import dbflute.ldb.allcommon.bhv.core.command.LdAbstractOutsideSqlCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdOutsideSqlSelectListCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdOutsideSqlExecuteCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdOutsideSqlCallCommand;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlOption;
import dbflute.ldb.allcommon.cbean.outsidesql.LdProcedurePmb;
import dbflute.ldb.allcommon.jdbc.LdStatementConfig;

/**
 * The executor of outside-SQL. <br />
 * <pre>
 * {Basic}
 *   o selectList()
 *   o execute()
 *   o call()
 * 
 * {Entity}
 *   o entityHandling().selectEntity()
 *   o entityHandling().selectEntityWithDeletedCheck()
 * 
 * {Cursor}
 *   o cursorHandling().selectCursor()
 * 
 * {Paging}
 *   o autoPaging().selectList()
 *   o autoPaging().selectPage()
 *   o manualPaging().selectList()
 *   o manualPaging().selectPage()
 * 
 * {Option -- Dynamic}
 *   o dynamicBinding().selectList()
 * </pre>
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdOutsideSqlBasicExecutor {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The invoker of behavior command. (NotNull) */
    protected final LdBehaviorCommandInvoker _behaviorCommandInvoker;

    /** Table DB name. (NotNull) */
    protected final String _tableDbName;

	/** The current database definition. (NotNull) */
    protected final LdDBDef _currentDBDef;
	
	/** The default configuration of statement. (Nullable) */
	protected final LdStatementConfig _defaultStatementConfig;

    /** Is it dynamic binding? */
    protected boolean _dynamicBinding;
	
	/** The configuration of statement. (Nullable) */
	protected LdStatementConfig _statementConfig;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdOutsideSqlBasicExecutor(LdBehaviorCommandInvoker behaviorCommandInvoker
                                 , String tableDbName
                                 , LdDBDef currentDBDef
                                 , LdStatementConfig defaultStatementConfig) {
        this._behaviorCommandInvoker = behaviorCommandInvoker;
        this._tableDbName = tableDbName;
        this._currentDBDef = currentDBDef;
        this._defaultStatementConfig = defaultStatementConfig;
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    /**
     * Select the list of the entity.
     * @param <ENTITY> The type of entity for element.
     * @param path The path of SQL file. (NotNull)
     * @param pmb The parameter-bean. Allowed types are Bean object and Map object. (Nullable)
     * @param entityType The element type of entity. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdOutsideSqlNotFoundException When the outside-SQL is not found.
     */
    public <ENTITY> LdListResultBean<ENTITY> selectList(String path, Object pmb, Class<ENTITY> entityType) {
        List<ENTITY> resultList = invoke(createSelectListCommand(path, pmb, entityType));
        return new LdResultBeanBuilder<ENTITY>(_tableDbName).buildListResultBean(resultList);
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    /**
     * Execute. {Insert/Update/Delete/Etc...}
     * @param path The path of SQL file. (NotNull)
     * @param pmb The parameter-bean. Allowed types are Bean object and Map object. (Nullable)
     * @return The count of execution.
     * @exception dbflute.ldb.allcommon.exception.LdOutsideSqlNotFoundException When the outside-SQL is not found.
     */
    public int execute(String path, Object pmb) {
        return invoke(createExecuteCommand(path, pmb));
    }

    // [DBFlute-0.7.5]
    // ===================================================================================
    //                                                                      Procedure Call
    //                                                                      ==============
    /**
     * Call stored procedure.
     * @param pmb The parameter-bean for procedure. (NotNull)
     */
    public void call(LdProcedurePmb pmb) {
        if (pmb == null) { throw new IllegalArgumentException("The argument of call() 'pmb' should not be null!"); }
        invoke(createCallCommand(pmb.getProcedureName(), pmb));
    }

    // ===================================================================================
    //                                                                    Behavior Command
    //                                                                    ================
    protected <ENTITY> LdBehaviorCommand<List<ENTITY>> createSelectListCommand(String path, Object pmb, Class<ENTITY> entityType) {
        final LdOutsideSqlSelectListCommand<ENTITY> cmd = xsetupCommand(new LdOutsideSqlSelectListCommand<ENTITY>(), path, pmb);
        cmd.setEntityType(entityType);
        return cmd;
    }

    protected LdBehaviorCommand<Integer> createExecuteCommand(String path, Object pmb) {
        return xsetupCommand(new LdOutsideSqlExecuteCommand(), path, pmb);
    }

    protected LdBehaviorCommand<Void> createCallCommand(String path, Object pmb) {
        return xsetupCommand(new LdOutsideSqlCallCommand(), path, pmb);
    }

    private <COMMAND extends LdAbstractOutsideSqlCommand<?>> COMMAND xsetupCommand(COMMAND command, String path, Object pmb) {
        command.setTableDbName(_tableDbName);
        _behaviorCommandInvoker.injectComponentProperty(command);
        command.setOutsideSqlPath(path);
        command.setParameterBean(pmb);
        command.setOutsideSqlOption(createOutsideSqlOption());
        command.setCurrentDBDef(_currentDBDef);
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
    // -----------------------------------------------------
    //                                       Result Handling
    //                                       ---------------
    /**
     * Specify cursor handling. <br />
     * <pre>
     * # ex) Your Program
     * #
     * # executor.cursorHandling().selectCursor(path, pmb, handler);
     * #
     * </pre>
     * @return The cursor executor of outside-SQL. (NotNull)
     */
    public LdOutsideSqlCursorExecutor<Object> cursorHandling() {
        return new LdOutsideSqlCursorExecutor<Object>(_behaviorCommandInvoker, createOutsideSqlOption(), _tableDbName, _currentDBDef);
    }

    /**
     * Specify entity handling. <br />
     * <pre>
     * # ex) Your Program
     * #
     * # executor.entityHandling().selectEntityWithDeletedCheck(path, pmb, Xxx.class);
     * #
     * </pre>
     * @return The cursor executor of outside-SQL. (NotNull)
     */
    public LdOutsideSqlEntityExecutor<Object> entityHandling() {
        return new LdOutsideSqlEntityExecutor<Object>(_behaviorCommandInvoker, createOutsideSqlOption(), _tableDbName, _currentDBDef);
    }

    // -----------------------------------------------------
    //                                                Paging
    //                                                ------
    /**
     * Option of autoPaging. <br />
     * If you invoke this, you don't need to write paging condition on your SQL. <br />
     * <pre>
     * # ex) Your SQL {MySQL}
     * #
     * # select member.MEMBER_ID, member...
     * #   from Member member
     * #  where ...
     * #  order by ...
     * # -- limit 40, 20        *Here is unnecessary!
     * #
     * </pre>
     * @return The executor of paging that the paging mode is auto. (NotNull)
     */
    public LdOutsideSqlPagingExecutor autoPaging() {
        final LdOutsideSqlOption option = createOutsideSqlOption();
        option.autoPaging();
        return new LdOutsideSqlPagingExecutor(_behaviorCommandInvoker, option, _tableDbName
                                          , _currentDBDef, _defaultStatementConfig);
    }

    /**
     * Option of manualPaging. <br />
     * If you invoke this, you need to write paging condition on your SQL. <br />
     * <pre>
     * # ex) Your SQL {MySQL}
     * #
     * # select member.MEMBER_ID, member...
     * #   from Member member
     * #  where ...
     * #  order by ...
     * #  limit 40, 20        *Here is necessary!
     * #
     * </pre>
     * @return The executor of paging that the paging mode is manual. (NotNull)
     */
    public LdOutsideSqlPagingExecutor manualPaging() {
        final LdOutsideSqlOption option = createOutsideSqlOption();
        option.manualPaging();
        return new LdOutsideSqlPagingExecutor(_behaviorCommandInvoker, option, _tableDbName
                                          , _currentDBDef, _defaultStatementConfig);
    }

    // -----------------------------------------------------
    //                                       Dynamic Binding
    //                                       ---------------
    public LdOutsideSqlBasicExecutor dynamicBinding() {
        _dynamicBinding = true;
        return this;
    }

    // -----------------------------------------------------
    //                                      Statement Config
    //                                      ----------------
    public LdOutsideSqlBasicExecutor configure(LdStatementConfig statementConfig) {
        _statementConfig = statementConfig;
        return this;
    }
	
    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected LdOutsideSqlOption createOutsideSqlOption() {
        final LdOutsideSqlOption option = new LdOutsideSqlOption();
		option.setStatementConfig(_statementConfig);
        if (_dynamicBinding) {
            option.dynamicBinding();
        }
		option.setTableDbName(_tableDbName);// as information
        return option;
    }
}

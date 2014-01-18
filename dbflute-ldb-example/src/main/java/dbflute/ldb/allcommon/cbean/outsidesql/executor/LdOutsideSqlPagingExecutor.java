/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.outsidesql.executor;

import java.util.List;

import dbflute.ldb.allcommon.LdDBDef;
import dbflute.ldb.allcommon.bhv.core.LdBehaviorCommand;
import dbflute.ldb.allcommon.bhv.core.LdBehaviorCommandInvoker;
import dbflute.ldb.allcommon.bhv.core.command.LdOutsideSqlSelectListCommand;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdResultBeanBuilder;
import dbflute.ldb.allcommon.cbean.LdPagingBean;
import dbflute.ldb.allcommon.cbean.LdPagingHandler;
import dbflute.ldb.allcommon.cbean.LdPagingInvoker;
import dbflute.ldb.allcommon.cbean.LdPagingResultBean;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlOption;
import dbflute.ldb.allcommon.jdbc.LdStatementConfig;

/**
 * The paging executor of outside-SQL.
 * @author DBFlute(AutoGenerator)
 */
public class LdOutsideSqlPagingExecutor {

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
    protected final LdDBDef _currentDBDef;
	
	/** The default configuration of statement. (Nullable) */
	protected final LdStatementConfig _defaultStatementConfig;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdOutsideSqlPagingExecutor(LdBehaviorCommandInvoker behaviorCommandInvoker
                                  , LdOutsideSqlOption outsideSqlOption
                                  , String tableDbName
                                  , LdDBDef currentDBDef
                                  , LdStatementConfig defaultStatementConfig) {
        this._behaviorCommandInvoker = behaviorCommandInvoker;
        this._outsideSqlOption = outsideSqlOption;
        this._tableDbName = tableDbName;
        this._currentDBDef = currentDBDef;
        this._defaultStatementConfig = defaultStatementConfig;
    }

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    /**
     * Select list with paging.
     * <p>
     * The SQL should have Paging without Count. <br />
     * You do not need to use pagingBean's isPaging() method on your 'Parameter Comment'. <br />
     * <pre>
     * - - - - - - - - - - - - - - - - - - - - - - -
     * ex) Your Correct SQL {MySQL and manualPaging}
     * - - - - - - - - - - - - - - - - - - - - - - -
     * # select member.MEMBER_ID
     * #      , member.MEMBER_NAME
     * #      , memberStatus.MEMBER_STATUS_NAME
     * #   from MEMBER member
     * #     left outer join MEMBER_STATUS memberStatus
     * #       on member.MEMBER_STATUS_CODE = memberStatus.MEMBER_STATUS_CODE
     * #  /[*]BEGIN[*]/where
     * #    /[*]IF pmb.memberId != null[*]/member.MEMBER_ID = /[*]pmb.memberId[*]/'123'/[*]END[*]/
     * #    /[*]IF pmb.memberName != null[*]/and member.MEMBER_NAME like /[*]pmb.memberName[*]/'Billy' || '%'/[*]END[*]/
     * #  /[*]END[*]/
     * #  order by member.UPDATE_DATETIME desc
     * #  limit /[*]$pmb.pageStartIndex[*]/80, /[*]$pmb.fetchSize[*]/20
     * # 
     * o [*] is easy escape to Java Doc Comment.
     * o If it's autoPaging, the line of 'limit 80, 20' is unnecessary!
     * </pre>
     * @param <ENTITY> The type of entity.
     * @param path The path of SQL that executes count and paging. (NotNull)
     * @param pmb The bean of paging parameter. (NotNull)
     * @param entityType The type of result entity. (NotNull)
     * @return The result bean of paged list. (NotNull)
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.OutsideSqlNotFoundException When the outside-SQL is not found.
     */
    public <ENTITY> LdListResultBean<ENTITY> selectList(String path, LdPagingBean pmb, Class<ENTITY> entityType) {
        setupScrollableCursorIfNeeds();
        List<ENTITY> resultList = invoke(createSelectListCommand(path, pmb, entityType));
        return new LdResultBeanBuilder<ENTITY>(_tableDbName).buildListResultBean(resultList);
    }

    /**
     * Select page.
     * <p>
     * The SQL should have Count and Paging. <br />
     * You can realize by pagingBean's isPaging() method on your 'Parameter Comment'. For example, 'IF Comment'. <br />
     * It returns false when it executes Count. And it returns true when it executes Paging. <br />
     * <pre>
     * - - - - - - - - - - - - - - - - - - - - - - -
     * ex) Your Correct SQL {MySQL and manualPaging}
     * - - - - - - - - - - - - - - - - - - - - - - -
     * # /[*]IF pmb.isPaging()[*]/
     * # select member.MEMBER_ID
     * #      , member.MEMBER_NAME
     * #      , memberStatus.MEMBER_STATUS_NAME
     * # -- ELSE select count(*)
     * # /[*]END[*]/
     * #   from MEMBER member
     * #     /[*]IF pmb.isPaging()[*]/
     * #     left outer join MEMBER_STATUS memberStatus
     * #       on member.MEMBER_STATUS_CODE = memberStatus.MEMBER_STATUS_CODE
     * #     /[*]END[*]/
     * #  /[*]BEGIN[*]/where
     * #    /[*]IF pmb.memberId != null[*]/member.MEMBER_ID = /[*]pmb.memberId[*]/'123'/[*]END[*]/
     * #    /[*]IF pmb.memberName != null[*]/and member.MEMBER_NAME like /[*]pmb.memberName[*]/'Billy' || '%'/[*]END[*]/
     * #  /[*]END[*]/
     * #  /[*]IF pmb.isPaging()[*]/
     * #  order by member.UPDATE_DATETIME desc
     * #  /[*]END[*]/
     * #  /[*]IF pmb.isPaging()[*]/
     * #  limit /[*]$pmb.pageStartIndex[*]/80, /[*]$pmb.fetchSize[*]/20
     * #  /[*]END[*]/
     * # 
     * o [*] is easy escape to Java Doc Comment.
     * o If it's autoPaging, the line of 'limit 80, 20' is unnecessary!
     * 
     * - - - - - - - - - - - - - - - - - - - - - - - - -
     * ex) Wrong SQL {part 1}
     *     -- Line comment before ELSE comment --
     * - - - - - - - - - - - - - - - - - - - - - - - - -
     * # /[*]IF pmb.isPaging()[*]/
     * # select member.MEMBER_ID
     * #      , member.MEMBER_NAME -- The name of member...    *NG
     * #      -- The status name of member...                  *NG
     * #      , memberStatus.MEMBER_STATUS_NAME
     * # -- ELSE select count(*)
     * # /[*]END[*]/
     * # ...
     * o It's restriction...Sorry
     * </pre>
     * @param <ENTITY> The type of entity.
     * @param path The path of SQL that executes count and paging. (NotNull)
     * @param pmb The bean of paging parameter. (NotNull)
     * @param entityType The type of result entity. (NotNull)
     * @return The result bean of paging. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdOutsideSqlNotFoundException When the outside-SQL is not found.
     */
    public <ENTITY> LdPagingResultBean<ENTITY> selectPage(final String path
                                                      , final LdPagingBean pmb
                                                      , final Class<ENTITY> entityType) {
        final LdOutsideSqlEntityExecutor<LdPagingBean> countExecutor = createCountExecutor();
        final LdPagingHandler<ENTITY> handler = new LdPagingHandler<ENTITY>() {
            public LdPagingBean getPagingBean() {
                return pmb;
            }
            public int count() {
                pmb.xsetPaging(false);
                return countExecutor.selectEntityWithDeletedCheck(path, pmb, Integer.class);
            }
            public List<ENTITY> paging() {
                pmb.xsetPaging(true);
                return selectList(path, pmb, entityType);
            }
        };
        final LdPagingInvoker<ENTITY> invoker = new LdPagingInvoker<ENTITY>(_tableDbName);
        if (pmb.isCountLater()) {
            invoker.countLater();
        }
        return invoker.invokePaging(handler);
    }

    protected LdOutsideSqlEntityExecutor<LdPagingBean> createCountExecutor() {
        final LdOutsideSqlOption countOption = _outsideSqlOption.copyOptionWithoutPaging();
        return new LdOutsideSqlEntityExecutor<LdPagingBean>(_behaviorCommandInvoker, countOption, _tableDbName, _currentDBDef);
    }

    protected void setupScrollableCursorIfNeeds() {
        if (!_outsideSqlOption.isAutoPaging()) {
            return;
        }
        LdStatementConfig statementConfig = _outsideSqlOption.getStatementConfig();
        if (statementConfig != null && statementConfig.hasResultSetType()) {
            return;
        }
        if (_defaultStatementConfig != null && _defaultStatementConfig.hasResultSetType()) {
            return;
        }
        if (statementConfig == null) {
            statementConfig = new LdStatementConfig();
            configure(statementConfig);
        }
        statementConfig.typeScrollInsensitive();
    }

    // ===================================================================================
    //                                                                    Behavior Command
    //                                                                    ================
    protected <ENTITY> LdBehaviorCommand<List<ENTITY>> createSelectListCommand(String path, Object pmb, Class<ENTITY> entityType) {
        return xsetupCommand(new LdOutsideSqlSelectListCommand<ENTITY>(), path, pmb, entityType);
    }

    private <ENTITY> LdOutsideSqlSelectListCommand<ENTITY> xsetupCommand(LdOutsideSqlSelectListCommand<ENTITY> command, String path, Object pmb, Class<ENTITY> entityType) {
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
    public LdOutsideSqlPagingExecutor configure(LdStatementConfig statementConfig) {
		_outsideSqlOption.setStatementConfig(statementConfig);
        return this;
    }

    public LdOutsideSqlPagingExecutor dynamicBinding() {
        _outsideSqlOption.dynamicBinding();
        return this;
    }
}

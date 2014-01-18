/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv;


import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.LinkedHashSet;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

import dbflute.ldb.allcommon.LdDBDef;
import dbflute.ldb.allcommon.LdBehaviorSelector;
import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.bhv.batch.LdTokenFileOutputOption;
import dbflute.ldb.allcommon.bhv.batch.LdTokenFileOutputResult;
import dbflute.ldb.allcommon.bhv.core.LdBehaviorCommand;
import dbflute.ldb.allcommon.bhv.core.LdBehaviorCommandInvoker;
import dbflute.ldb.allcommon.bhv.core.command.LdAbstractBehaviorCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdSelectCountCBCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdSelectListCBCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdSelectNextValCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdSelectScalarCBCommand;
import dbflute.ldb.allcommon.bhv.setup.LdValueLabelSetupper;
import dbflute.ldb.allcommon.bhv.setup.LdValueLabelBox;
import dbflute.ldb.allcommon.bhv.load.LdLoadReferrerOption;
import dbflute.ldb.allcommon.cbean.LdConditionBeanContext;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdPagingHandler;
import dbflute.ldb.allcommon.cbean.LdPagingInvoker;
import dbflute.ldb.allcommon.cbean.LdPagingBean;
import dbflute.ldb.allcommon.cbean.LdPagingResultBean;
import dbflute.ldb.allcommon.cbean.LdScalarQuery;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.allcommon.cbean.outsidesql.executor.LdOutsideSqlBasicExecutor;
import dbflute.ldb.allcommon.dbmeta.info.LdColumnInfo;
import dbflute.ldb.allcommon.helper.token.file.LdFileMakingOption;
import dbflute.ldb.allcommon.helper.token.file.LdFileMakingHeaderInfo;
import dbflute.ldb.allcommon.helper.token.file.LdFileMakingSimpleFacade;
import dbflute.ldb.allcommon.helper.token.file.impl.LdFileMakingSimpleFacadeImpl;
import dbflute.ldb.allcommon.jdbc.LdStatementConfig;
import dbflute.ldb.allcommon.util.LdSimpleSystemUtil;

/**
 * The abstract class of readable behavior.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBehaviorReadable implements LdBehaviorReadable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Behavior-selector instance. It's basically referred at loadReferrer. (Required for loadReferrer) */
    protected LdBehaviorCommandInvoker _behaviorCommandInvoker;

    /** Behavior-selector instance. It's basically referred at loadReferrer. (Required for loadReferrer) */
    protected LdBehaviorSelector _behaviorSelector;

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    protected abstract LdDBDef getCurrentDBDef();

    // ===================================================================================
    //                                                             Default StatementConfig
    //                                                             =======================
    protected abstract LdStatementConfig getDefaultStatementConfig();

    // ===================================================================================
    //                                                                       Basic Get All
    //                                                                       =============
    /**
     * Get count all.
     * @return Count all.
     */
    public int getCountAll() {
        return callGetCountAll();
    }

    // ===================================================================================
    //                                                                          Count Read
    //                                                                          ==========
    /**
     * {@inheritDoc}
     * @param cb Condition-bean. This condition-bean should not be set up about fetch-scope. (NotNull)
     * @return Read count. (NotNull)
     */
    public int readCount(LdConditionBean cb) {
        assertCBNotNull(cb);
        return callReadCount(cb);
    }

    // ===================================================================================
    //                                                                         Entity Read 
    //                                                                         ===========
    /**
     * {@inheritDoc}
     * @param cb Condition-bean. (NotNull)
     * @return Read entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdEntity readEntity(LdConditionBean cb) {
        assertCBNotNull(cb);
        final List<LdEntity> ls = readList(cb);
        if (ls.isEmpty()) {
            return null;
        }
        assertEntitySelectedAsOne(ls, cb);
        return (LdEntity)ls.get(0);
    }

    /**
     * {@inheritDoc}
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Read entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdEntity readEntityWithDeletedCheck(LdConditionBean cb) {
        assertCBNotNull(cb);
        final List<LdEntity> ls = readList(cb);
        assertEntityNotDeleted(ls, cb);
        assertEntitySelectedAsOne(ls, cb);
        return (LdEntity)ls.get(0);
    }

    // ===================================================================================
    //                                                         Entity Read Internal Helper
    //                                                         ===========================
    protected <ENTITY extends LdEntity, CB extends LdConditionBean>
            ENTITY helpSelectEntityInternally(CB cb, InternalSelectEntityCallback<ENTITY, CB> callback) {
        assertCBNotNull(cb);
        cb.checkSafetyResult(1);
        List<ENTITY> ls = null;
        try {
            ls = callback.callbackSelectList(cb);
        } catch (dbflute.ldb.allcommon.exception.LdDangerousResultSizeException e) {
            throwEntityDuplicatedException("{Over safetyMaxResultSize '1'}", cb, e);
        }
        if (ls.isEmpty()) {
            return null;
        }
        assertEntitySelectedAsOne(ls, cb);
        return (ENTITY)ls.get(0);
    }

    protected static interface InternalSelectEntityCallback<ENTITY extends LdEntity, CB extends LdConditionBean> {
        public List<ENTITY> callbackSelectList(CB cb);
    }

    protected <ENTITY extends LdEntity, CB extends LdConditionBean>
            ENTITY helpSelectEntityWithDeletedCheckInternally(CB cb, InternalSelectEntityWithDeletedCheckCallback<ENTITY, CB> callback) {
        assertCBNotNull(cb);
        cb.checkSafetyResult(1);
        List<ENTITY> ls = null;
        try {
            ls = callback.callbackSelectList(cb);
        } catch (dbflute.ldb.allcommon.exception.LdDangerousResultSizeException e) {
            throwEntityDuplicatedException("{Over safetyMaxResultSize '1'}", cb, e);
        }
        assertEntityNotDeleted(ls, cb);
        assertEntitySelectedAsOne(ls, cb);
        return (ENTITY)ls.get(0);
    }

    protected static interface InternalSelectEntityWithDeletedCheckCallback<ENTITY extends LdEntity, CB extends LdConditionBean> {
        public List<ENTITY> callbackSelectList(CB cb);
    }

    // ===================================================================================
    //                                                                           List Read
    //                                                                           =========
    /**
     * {@inheritDoc}
     * @param cb Condition-bean.
     * @return List-result-bean. If the select result is zero, it returns empty list. (NotNull)
     */
    public LdListResultBean<LdEntity> readList(LdConditionBean cb) {
        assertCBNotNull(cb);
        return new dbflute.ldb.allcommon.cbean.LdResultBeanBuilder<LdEntity>(getTableDbName()).buildListResultBean(cb, callReadList(cb));
    }

    /**
     * {@inheritDoc}
     * @param cb Condition-bean. (NotNull)
     * @return Read page. (NotNull)
     */
    public LdPagingResultBean<LdEntity> readPage(final LdConditionBean cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdEntity> invoker = new LdPagingInvoker<LdEntity>(getTableDbName());
        final LdPagingHandler<LdEntity> handler = new LdPagingHandler<LdEntity>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return readCount(cb); }
            public List<LdEntity> paging() { return readList(cb); }
        };
        return invoker.invokePaging(handler);
    }

    /**
     * Assert that the entity is not deleted.
     * @param entity Selected entity. (Nullable)
     * @param searchKey4Log Search-key for Logging.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     */
    protected void assertEntityNotDeleted(LdEntity entity, Object searchKey4Log) {
        if (entity == null) {
            throwEntityAlreadyDeletedException(searchKey4Log);
        }
    }

    /**
     * Assert that the entity is not deleted.
     * @param ls Selected list. (Nullable)
     * @param searchKey4Log Search-key for Logging. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException
     */
    protected void assertEntityNotDeleted(List<? extends LdEntity> ls, Object searchKey4Log) {
        if (ls == null || ls.isEmpty()) {
            throwEntityAlreadyDeletedException(searchKey4Log);
        }
    }

    /**
     * Assert that the entity is selected as one.
     * @param ls Selected list. (NotNull)
     * @param searchKey4Log Search-key for Logging. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException
     */
    protected void assertEntitySelectedAsOne(List<? extends LdEntity> ls, Object searchKey4Log) {
        if (ls == null || ls.isEmpty()) {
            throwEntityAlreadyDeletedException(searchKey4Log);
        }
        if (ls.size() > 1) {
            throwEntityDuplicatedException(ls.size() + "", searchKey4Log, null);
        }
    }

    private void throwEntityAlreadyDeletedException(Object searchKey4Log) {
        LdConditionBeanContext.throwEntityAlreadyDeletedException(searchKey4Log);
    }

    private void throwEntityDuplicatedException(String resultCountString, Object searchKey4Log, Throwable cause) {
        LdConditionBeanContext.throwEntityDuplicatedException(resultCountString, searchKey4Log, cause);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * The scalar function. <br />
     * This is not static class because this uses the method 'invoke(BehaviorCommand)'
     * @param <CB> The type of condition-bean.
     * @param <RESULT> The type of result.
     */
    public class SLFunction<CB extends LdConditionBean, RESULT> { // SL: ScaLar

        /** The condition-bean for scalar select. (NotNull) */
        protected CB _conditionBean;

        /** The condition-bean for scalar select. (NotNull) */
        protected Class<RESULT> _resultType;

        /**
         * @param conditionBean The condition-bean initialized only for scalar select. (NotNull)
         * @param resultType The type os result. (NotNull)
         */
        public SLFunction(CB conditionBean, Class<RESULT> resultType) {
            _conditionBean = conditionBean;
            _resultType = resultType;
        }

        /**
         * Select the maximum value. <br />
         * <pre>
         * memberBhv.scalarSelect(Date.class).max(new ScalarQuery(MemberCB cb) {
         *     cb.specify().columnMemberBirthday(); // the required specification of target column
         *     cb.query().setMemberStatusCode_Equal_Formalized(); // query as you like it
         * });
         * </pre>
         * @param scalarQuery The query for scalar. (NotNull)
         * @return The maximum value. (Nullable)
         */
        public RESULT max(LdScalarQuery<CB> scalarQuery) {
            assertObjectNotNull("scalarQuery", scalarQuery);
            return exec(scalarQuery, LdSqlClause.SelectClauseType.MAX);
        }

        /**
         * Select the minimum value. <br />
         * <pre>
         * memberBhv.scalarSelect(Date.class).min(new ScalarQuery(MemberCB cb) {
         *     cb.specify().columnMemberBirthday(); // the required specification of target column
         *     cb.query().setMemberStatusCode_Equal_Formalized(); // query as you like it
         * });
         * </pre>
         * @param scalarQuery The query for scalar. (NotNull)
         * @return The minimum value. (Nullable)
         */
        public RESULT min(LdScalarQuery<CB> scalarQuery) {
            assertObjectNotNull("scalarQuery", scalarQuery);
            return exec(scalarQuery, LdSqlClause.SelectClauseType.MIN);
        }

        /**
         * Select the summary value. <br />
         * <pre>
         * purchaseBhv.scalarSelect(Integer.class).sum(new ScalarQuery(PurchaseCB cb) {
         *     cb.specify().columnPurchaseCount(); // the required specification of target column
         *     cb.query().setPurchaseDatetime_GreaterEqual(date); // query as you like it
         * });
         * </pre>
         * @param scalarQuery The query for scalar. (NotNull)
         * @return The summary value. (Nullable)
         */
        public RESULT sum(LdScalarQuery<CB> scalarQuery) {
            assertObjectNotNull("scalarQuery", scalarQuery);
            return exec(scalarQuery, LdSqlClause.SelectClauseType.SUM);
        }

        /**
         * Select the average value. <br />
         * <pre>
         * purchaseBhv.scalarSelect(Integer.class).avg(new ScalarQuery(PurchaseCB cb) {
         *     cb.specify().columnPurchaseCount(); // the required specification of target column
         *     cb.query().setPurchaseDatetime_GreaterEqual(date); // query as you like it
         * });
         * </pre>
         * @param scalarQuery The query for scalar. (NotNull)
         * @return The average value. (Nullable)
         */
        public RESULT avg(LdScalarQuery<CB> scalarQuery) {
            assertObjectNotNull("scalarQuery", scalarQuery);
            return exec(scalarQuery, LdSqlClause.SelectClauseType.AVG);
        }

        protected RESULT exec(LdScalarQuery<CB> scalarQuery, LdSqlClause.SelectClauseType selectClauseType) {
            assertObjectNotNull("scalarQuery", scalarQuery);
            assertObjectNotNull("selectClauseType", selectClauseType);
            assertObjectNotNull("conditionBean", _conditionBean);
            assertObjectNotNull("resultType", _resultType);
            scalarQuery.query(_conditionBean);
            assertScalarSelectRequiredSpecifyColumn();
            return invoke(createSelectScalarCBCommand(_conditionBean, _resultType, selectClauseType));
        }

        protected void assertScalarSelectRequiredSpecifyColumn() {
            final String columnName = _conditionBean.getSqlClause().getSpecifiedColumnNameAsOne();
            if (columnName == null) {
                throwScalarSelectInvalidColumnSpecificationException();
            }
        }

        protected void throwScalarSelectInvalidColumnSpecificationException() {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The specified column for scalar select was Invalid!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + " You should call specify().column[TargetColumn]() only once." + getLineSeparator();
            msg = msg + "  For example:" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Wrong]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    memberBhv.scalarSelect(Date.class).max(new ScalarQuery<MemberCB>() {" + getLineSeparator();
            msg = msg + "        public void query(MemberCB cb) {" + getLineSeparator();
            msg = msg + "            // *No! It's empty!" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    });" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Wrong]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    memberBhv.scalarSelect(Date.class).max(new ScalarQuery<MemberCB>() {" + getLineSeparator();
            msg = msg + "        public void query(MemberCB cb) {" + getLineSeparator();
            msg = msg + "            cb.specify().columnMemberBirthday();" + getLineSeparator();
            msg = msg + "            cb.specify().columnRegisterDatetime(); // *No! It's duplicated!" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    });" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Good!]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    memberBhv.scalarSelect(Date.class).max(new ScalarQuery<MemberCB>() {" + getLineSeparator();
            msg = msg + "        public void query(MemberCB cb) {" + getLineSeparator();
            msg = msg + "            cb.specify().columnMemberBirthday(); // *Point!" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    });" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[ConditionBean Type]" + getLineSeparator() + _conditionBean.getClass().getName() + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Result Type]" + getLineSeparator() + _resultType.getName() + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new ScalarSelectInvalidColumnSpecificationException(msg);
        }
    }

    public static class ScalarSelectInvalidColumnSpecificationException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public ScalarSelectInvalidColumnSpecificationException(String msg) {
            super(msg);
        }
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Get the basic executor of outside-SQL. <br />
     * The invoker of behavior command should be not null when you call this method.
     * <pre>
     * You can use the methods for outside-SQL are as follows:
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
     * @return The basic executor of outside-SQL. (NotNull) 
     */
    public LdOutsideSqlBasicExecutor outsideSql() {
        assertBehaviorCommandInvoker("outsideSql");
        return new LdOutsideSqlBasicExecutor(_behaviorCommandInvoker, getTableDbName()
                                         , getCurrentDBDef(), getDefaultStatementConfig());
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Create the list of value-label.
     * @param <ENTITY> The type of entity.
     * @param entityList The list of entity. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     */
    public <ENTITY extends LdEntity> List<Map<String, Object>> createValueLabelList(List<ENTITY> entityList, LdValueLabelSetupper<ENTITY> valueLabelSetupper) {
        final List<Map<String, Object>> valueLabelList = new ArrayList<Map<String, Object>>();
        final LdValueLabelBox box = new LdValueLabelBox();
        for (ENTITY entity : entityList) {
            final Map<String, Object> valueLabel = new HashMap<String, Object>();
            valueLabelSetupper.setup(box, entity);
            valueLabel.put("value", box.getValue());
            valueLabel.put("label", box.getLabel());
            valueLabelList.add(valueLabel);
        }
        return valueLabelList;
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    /**
     * {@inheritDoc}
     * @return The value of sequence. (NotNull)
     */
    public java.math.BigDecimal readNextVal() {
        try {
            final Method method = getClass().getMethod("selectNextVal", new Class[]{});
            Object sequenceObject = method.invoke(this, new Object[] {});
            if (sequenceObject instanceof java.math.BigDecimal) {
                return (java.math.BigDecimal)sequenceObject;
            }
            return (java.math.BigDecimal)helpConvertingSequenceObject(java.math.BigDecimal.class, sequenceObject);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("The table does not have sequence: " + getTableDbName(), e);
        } catch (Exception e) {
            throw new RuntimeException("The selectNextVal() of the table threw the exception: " + getTableDbName(), e);
        }
    }

    protected Object helpConvertingSequenceObject(Class<?> resultClass, Object sequenceObject) {
        try {
            final Constructor<?> constructor = resultClass.getConstructor(new Class[]{String.class});
            return constructor.newInstance(new Object[]{sequenceObject.toString()});
        } catch (NoSuchMethodException e) {
        } catch (Exception e) {
            throw new RuntimeException("The readNextVal() of the table threw the exception: " + getTableDbName(), e);
        }
        try {
            final Method method = resultClass.getMethod("valueOf", new Class[]{long.class});
            return method.invoke(null, new Object[]{Long.valueOf(sequenceObject.toString())});
        } catch (NoSuchMethodException e) {
        } catch (Exception e) {
            throw new RuntimeException("The readNextVal() of the table threw the exception: " + getTableDbName(), e);
        }
        String msg = "Cannot convert sequenceObject to resultClass:";
        msg = msg + " resultClass=" + resultClass + " sequenceObjectType=" + sequenceObject.getClass();
        throw new IllegalStateException(msg);
    }

    // ===================================================================================
    //                                                       Load Referrer Internal Helper
    //                                                       =============================
    /**
     * Help load referrer internally.
     * About internal policy, the value of primary key(and others too) is treated as CaseInsensitive.
     * @param <LOCAL_ENTITY> The type of base entity.
     * @param <PK> The type of primary key.
     * @param <REFERRER_CB> The type of referrer condition-bean.
     * @param <REFERRER_ENTITY> The type of referrer entity.
     * @param localEntityList The list of local entity. (NotNull)
     * @param loadReferrerOption The option of loadReferrer. (NotNull)
     * @param callback The internal call-back of loadReferrer. (NotNull) 
     */
    protected <LOCAL_ENTITY extends LdEntity
             , PK
             , REFERRER_CB extends LdConditionBean
             , REFERRER_ENTITY extends LdEntity>
            void helpLoadReferrerInternally(List<LOCAL_ENTITY> localEntityList
                                         , LdLoadReferrerOption<REFERRER_CB, REFERRER_ENTITY> loadReferrerOption
                                         , InternalLoadReferrerCallback<LOCAL_ENTITY, PK, REFERRER_CB, REFERRER_ENTITY> callback) {
        doHelpLoadReferrerInternally(localEntityList, loadReferrerOption, callback);
    }

    /**
     * Do help load referrer internally.
     * About internal policy, the value of primary key(and others too) is treated as CaseInsensitive.
     * @param <LOCAL_ENTITY> The type of base entity.
     * @param <PK> The type of primary key.
     * @param <REFERRER_CB> The type of referrer condition-bean.
     * @param <REFERRER_ENTITY> The type of referrer entity.
     * @param localEntityList The list of local entity. (NotNull)
     * @param loadReferrerOption The option of loadReferrer. (NotNull)
     * @param callback The internal call-back of loadReferrer. (NotNull) 
     */
    protected <LOCAL_ENTITY extends LdEntity
             , PK
             , REFERRER_CB extends LdConditionBean
             , REFERRER_ENTITY extends LdEntity>
            void doHelpLoadReferrerInternally(List<LOCAL_ENTITY> localEntityList
                                         , LdLoadReferrerOption<REFERRER_CB, REFERRER_ENTITY> loadReferrerOption
                                         , InternalLoadReferrerCallback<LOCAL_ENTITY, PK, REFERRER_CB, REFERRER_ENTITY> callback) {

        // - - - - - - - - - - -
        // Assert pre-condition
        // - - - - - - - - - - -
        assertBehaviorSelectorNotNull("loadReferrer");
        assertObjectNotNull("localEntityList", localEntityList);
        assertObjectNotNull("loadReferrerOption", loadReferrerOption);
        if (localEntityList.isEmpty()) {
            return;
        }

        // - - - - - - - - - - - - - -
        // Prepare temporary container
        // - - - - - - - - - - - - - -
        final Map<PK, LOCAL_ENTITY> pkLocalEntityMap = new LinkedHashMap<PK, LOCAL_ENTITY>();
        final List<PK> pkList = new ArrayList<PK>();
        for (LOCAL_ENTITY localEntity : localEntityList) {
            final PK primaryKeyValue = callback.callbackBase_getPrimaryKeyValue(localEntity);
            pkList.add(callback.callbackBase_getPrimaryKeyValue(localEntity));
            pkLocalEntityMap.put(toLowerCasePrimaryKeyIfString(primaryKeyValue), localEntity);
        }

        // - - - - - - - - - - - - - - - -
        // Prepare referrer condition bean
        // - - - - - - - - - - - - - - - -
        final REFERRER_CB cb;
        if (loadReferrerOption.getReferrerConditionBean() != null) {
            cb = loadReferrerOption.getReferrerConditionBean();
        } else {
            cb = callback.callbackReferrer_newMyConditionBean();
        }

        // - - - - - - - - - - - - - -
        // Select the list of referrer
        // - - - - - - - - - - - - - -
        callback.callbackReferrer_queryForeignKeyInScope(cb, pkList);
        loadReferrerOption.delegateKeyConditionExchangingFirstWhereClauseForLastOne(cb);
        if (!loadReferrerOption.isStopOrderByKey()) {
            callback.callbackReferrer_queryAddOrderByForeignKeyAsc(cb);
            cb.getSqlComponentOfOrderByClause().exchangeFirstOrderByElementForLastOne();
        }
        loadReferrerOption.delegateConditionBeanSettingUp(cb);
        final List<REFERRER_ENTITY> referrerList = callback.callbackReferrer_selectList(cb);
        loadReferrerOption.delegateEntitySettingUp(referrerList);

        // - - - - - - - - - - - - - - - - - - - - - - - -
        // Create the map of {primary key / referrer list}
        // - - - - - - - - - - - - - - - - - - - - - - - -
        final Map<PK, List<REFERRER_ENTITY>> pkReferrerListMap = new LinkedHashMap<PK, List<REFERRER_ENTITY>>();
        for (REFERRER_ENTITY referrerEntity : referrerList) {
            final PK referrerListKey;
            {
                final PK foreignKeyValue = callback.callbackReferrer_getForeignKeyValue(referrerEntity);
                referrerListKey = toLowerCasePrimaryKeyIfString(foreignKeyValue);
            }
            if (!pkReferrerListMap.containsKey(referrerListKey)) {
                pkReferrerListMap.put(referrerListKey, new ArrayList<REFERRER_ENTITY>());
            }
            (pkReferrerListMap.get(referrerListKey)).add(referrerEntity);

            // for Reverse Reference.
            final LOCAL_ENTITY localEntity = pkLocalEntityMap.get(referrerListKey);
            callback.callbackReferrer_setForeignEntity(referrerEntity, localEntity);
        }

        // - - - - - - - - - - - - - - - - - -
        // Relate referrer list to base entity
        // - - - - - - - - - - - - - - - - - -
        for (LOCAL_ENTITY localEntity : localEntityList) {
            final PK referrerListKey;
            {
                final PK primaryKey = callback.callbackBase_getPrimaryKeyValue(localEntity);
                referrerListKey = toLowerCasePrimaryKeyIfString(primaryKey);
            }
            if (pkReferrerListMap.containsKey(referrerListKey)) {
                callback.callbackBase_setReferrerList(localEntity, pkReferrerListMap.get(referrerListKey));
            } else {
                callback.callbackBase_setReferrerList(localEntity, new ArrayList<REFERRER_ENTITY>());
            }
        }
    }

    /**
     * To lower case for primary key if the value is string.
     * @param <PK> The type of primary key.
     * @param value The value of primary key. (Nullable)
     * @return The value of primary key. (Nullable)
     */
    @SuppressWarnings("unchecked")
    protected <PK> PK toLowerCasePrimaryKeyIfString(PK value) {
        return (PK)toLowerCaseIfString(value);
    }

    /**
     * @param <LOCAL_ENTITY> The type of base entity.
     * @param <PK> The type of primary key.
     * @param <REFERRER_CB> The type of referrer conditionBean.
     * @param <REFERRER_ENTITY> The type of referrer entity.
     */
    protected static interface InternalLoadReferrerCallback<LOCAL_ENTITY extends LdEntity
                                                          , PK
                                                          , REFERRER_CB extends LdConditionBean
                                                          , REFERRER_ENTITY extends LdEntity> {
        // For Base
        public PK callbackBase_getPrimaryKeyValue(LOCAL_ENTITY entity);
        public void callbackBase_setReferrerList(LOCAL_ENTITY entity, List<REFERRER_ENTITY> referrerList);

        // For Referrer
        public REFERRER_CB callbackReferrer_newMyConditionBean();
        public void callbackReferrer_queryForeignKeyInScope(REFERRER_CB cb, List<PK> pkList);
        public void callbackReferrer_queryAddOrderByForeignKeyAsc(REFERRER_CB cb);
        public List<REFERRER_ENTITY> callbackReferrer_selectList(REFERRER_CB cb);
        public PK callbackReferrer_getForeignKeyValue(REFERRER_ENTITY entity);
        public void callbackReferrer_setForeignEntity(REFERRER_ENTITY referrerEntity, LOCAL_ENTITY localEntity);
    }

    protected LdBehaviorSelector xgetBSFLR() { // getBehaviorSelectorForLoadReferrer() as Internal
        assertBehaviorSelectorNotNull("loadReferrer");
        return getBehaviorSelector();
    }

    private void assertBehaviorSelectorNotNull(String methodName) {
        if (_behaviorSelector == null) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "Not found the selector of behavior as behavior's attribute!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Please confirm the definition of the selector at your component configuration of DBFlute." + getLineSeparator();
            msg = msg + "It is precondition that '" + methodName + "()' needs the selector instance." + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Your Behavior's Attributes]" + getLineSeparator();
            msg = msg + "  _behaviorCommandInvoker : " + _behaviorCommandInvoker + getLineSeparator();
            msg = msg + "  _behaviorSelector       : " + _behaviorSelector + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new IllegalStateException(msg);
        }
    }

    // ===================================================================================
    //                                                             Pullout Internal Helper
    //                                                             =======================
    protected <LOCAL_ENTITY extends LdEntity, FOREIGN_ENTITY extends LdEntity>
            List<FOREIGN_ENTITY> helpPulloutInternally(List<LOCAL_ENTITY> localEntityList, InternalPulloutCallback<LOCAL_ENTITY, FOREIGN_ENTITY> callback) {
        assertObjectNotNull("localEntityList", localEntityList);
        final Set<FOREIGN_ENTITY> foreignSet = new LinkedHashSet<FOREIGN_ENTITY>();
        for (LOCAL_ENTITY entity : localEntityList) {
            final FOREIGN_ENTITY foreignEntity = callback.callbackGetForeignEntity(entity);
            if (foreignEntity == null || foreignSet.contains(foreignEntity)) {
                continue;
            }
            foreignSet.add(foreignEntity);
        }
        return new ArrayList<FOREIGN_ENTITY>(foreignSet);
    }

    protected static interface InternalPulloutCallback<LOCAL_ENTITY extends LdEntity, FOREIGN_ENTITY extends LdEntity> {
        public FOREIGN_ENTITY callbackGetForeignEntity(LOCAL_ENTITY entity);
    }

    // ===================================================================================
    //                                                                          Token File
    //                                                                          ==========
    /**
     * Get the executor of token file output.
     * @return The executor of token file output. (NotNull)
     */
    public TokenFileOutputExecutor tokenFileOutput() {
        return new TokenFileOutputExecutor();
    }

    /**
     * The executor of token file output.
     */
    public class TokenFileOutputExecutor {

        /**
         * Output token file from the table records. <br />
         * The supported column types are String, Number and Date. <br />
         * The search result is on memory temporarily so don't use this method if you have enormous records.
         * @param cb The condition-bean. (NotNull: The setupSelect_Xxx() is ignored.)
         * @param filename The name of the file. (NotNull and NotEmpty)
         * @param tokenFileOutputOption The option of token file output. (NotNull and Required{delimiter and encoding})
         * @return The result of token file output. (NotNull)
         * @throws java.io.FileNotFoundException The file is not found.
         * @throws java.io.IOException The IO exception occurred.
         */
        public LdTokenFileOutputResult outputTokenFile(LdConditionBean cb, String filename, LdTokenFileOutputOption tokenFileOutputOption) throws java.io.FileNotFoundException, java.io.IOException {
            assertCBNotNull(cb);
            assertStringNotNullAndNotTrimmedEmpty("filename", filename);
            assertObjectNotNull("tokenFileOutputOption", tokenFileOutputOption);

            final List<LdEntity> ls = readList(cb);
            List<List<String>> rowList = new ArrayList<List<String>>();
            for (java.util.Iterator<LdEntity> ite = ls.iterator(); ite.hasNext(); ) {
                final LdEntity entity = ite.next();
                final List<String> valueList = getDBMeta().convertToColumnStringValueList(entity);
                rowList.add(valueList);
            }
            final LdFileMakingSimpleFacade fileMakingSimpleFacade = new LdFileMakingSimpleFacadeImpl();
            final LdFileMakingOption fileMakingOption = tokenFileOutputOption.getFileMakingOption();
            final LdFileMakingHeaderInfo fileMakingHeaderInfo = new LdFileMakingHeaderInfo();
            final List<String> columnDbNameList = new ArrayList<String>();
            for (final java.util.Iterator<LdColumnInfo> ite = getDBMeta().getColumnInfoList().iterator(); ite.hasNext(); ) {
                final LdColumnInfo columnInfo = ite.next();
                columnDbNameList.add(columnInfo.getColumnDbName());
            }
            fileMakingHeaderInfo.setColumnNameList(columnDbNameList);
            fileMakingOption.setFileMakingHeaderInfo(fileMakingHeaderInfo);
            fileMakingSimpleFacade.makeFromRowList(filename, rowList, fileMakingOption);
            final LdTokenFileOutputResult tokeFileOutputResult = new LdTokenFileOutputResult();
            tokeFileOutputResult.setSelectedList(ls);
            return tokeFileOutputResult;
        }
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    /**
     * @return All count.
     */
    protected int callGetCountAll() {
        return callReadCount(newConditionBean());
    }

    /**
     * @return All list. (NotNull)
     */
    protected List<LdEntity> callGetListAll() {
        return callReadList(newConditionBean());
    }

    /**
     * @param cb Condition-bean that the type is condition-bean-interface. (NotNull)
     * @return Read count. (NotNull)
     */
    protected int callReadCount(LdConditionBean cb) {
        assertCBNotNull(cb);
        return doCallReadCount(cb);
    }
    protected abstract int doCallReadCount(LdConditionBean cb);

    /**
     * @param cb Condition-bean that the type is condition-bean-interface. (NotNull)
     * @return Read list. If the select result is zero, it returns empty list. (NotNull)
     */
    protected List<LdEntity> callReadList(LdConditionBean cb) {
        assertCBNotNull(cb);
        return doCallReadList(cb);
    }
    protected abstract List<LdEntity> doCallReadList(LdConditionBean cb);

    /**
     * Filter the entity of insert.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void filterEntityOfInsert(LdEntity targetEntity) { // for isAvailableNonPrimaryKeyWritable
    }

    // ===================================================================================
    //                                                                    Behavior Command
    //                                                                    ================
    public void warmUpCommand() {
        {
            LdSelectCountCBCommand cmd = createSelectCountCBCommand(newConditionBean());
            cmd.setInitializeOnly(true); invoke(cmd);
        }
        {
            LdSelectListCBCommand<? extends LdEntity> cmd
                    = createSelectListCBCommand(newConditionBean(), getDBMeta().getEntityType());
            cmd.setInitializeOnly(true); invoke(cmd);
        }
    }

    protected LdSelectCountCBCommand createSelectCountCBCommand(LdConditionBean cb) {
        assertBehaviorCommandInvoker("createSelectCountCBCommand");
        final LdSelectCountCBCommand command = xsetupSelectCommand(new LdSelectCountCBCommand());
        command.setConditionBeanType(cb.getClass());
        command.setConditionBean(cb);
        return command;
    }

    protected <ENTITY extends LdEntity> LdSelectListCBCommand<ENTITY> createSelectListCBCommand(LdConditionBean cb, Class<ENTITY> entityType) {
        assertBehaviorCommandInvoker("createSelectListCBCommand");
        final LdSelectListCBCommand<ENTITY> command = xsetupSelectCommand(new LdSelectListCBCommand<ENTITY>());
        command.setConditionBeanType(cb.getClass());
        command.setConditionBean(cb);
        command.setEntityType(entityType);
        return command;
    }

    protected <RESULT> LdSelectNextValCommand<RESULT> createSelectNextValCommand(Class<RESULT> resultType) {
        assertBehaviorCommandInvoker("createSelectNextValCommand");
        final LdSelectNextValCommand<RESULT> command = xsetupSelectCommand(new LdSelectNextValCommand<RESULT>());
        command.setResultType(resultType);
        command.setDBMeta(getDBMeta());
        return command;
    }

    protected <RESULT> LdSelectScalarCBCommand<RESULT> createSelectScalarCBCommand(LdConditionBean cb
                                                                              , Class<RESULT> resultType
                                                                              , LdSqlClause.SelectClauseType selectClauseType) {
        assertBehaviorCommandInvoker("createSelectScalarCBCommand");
        final LdSelectScalarCBCommand<RESULT> command = xsetupSelectCommand(new LdSelectScalarCBCommand<RESULT>());
        command.setConditionBeanType(cb.getClass());
        command.setConditionBean(cb);
        command.setResultType(resultType);
        command.setSelectClauseType(selectClauseType);
        return command;
    }

    private <COMMAND extends LdAbstractBehaviorCommand<?>> COMMAND xsetupSelectCommand(COMMAND command) {
        command.setTableDbName(getTableDbName());
        _behaviorCommandInvoker.injectComponentProperty(command);
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

    protected void assertBehaviorCommandInvoker(String methodName) {
        if (_behaviorCommandInvoker == null) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "Not found the invoker of behavior command as behavior's attributed!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Please confirm the definition of the invoker at your 'dbflute.dicon'." + getLineSeparator();
            msg = msg + "It is precondition that '" + methodName + "()' needs the invoker instance." + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Your Behavior's Attributes]" + getLineSeparator();
            msg = msg + "  _behaviorCommandInvoker : " + _behaviorCommandInvoker + getLineSeparator();
            msg = msg + "  _behaviorSelector       : " + _behaviorSelector + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new IllegalStateException(msg);
        }
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    protected abstract boolean hasVersionNoValue(LdEntity entity);
    protected abstract boolean hasUpdateDateValue(LdEntity entity);

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    /**
     * To lower case if the type is String.
     * @param obj Object. (Nullable)
     * @return Lower object. (Nullable)
     */
    protected Object toLowerCaseIfString(Object obj) {
        if (obj != null && obj instanceof String) {
            return ((String)obj).toLowerCase();
        }
        return obj;
    }

    /**
     * Get the value of line separator.
     * @return The value of line separator. (NotNull)
     */
    protected String getLineSeparator() {
        return LdSimpleSystemUtil.getLineSeparator();
    }

    @SuppressWarnings("unchecked")
    protected <ENTITY extends LdEntity> ENTITY helpDowncastInternally(LdEntity entity, Class<ENTITY> clazz) {
        assertObjectNotNull("entity", entity);
        assertObjectNotNull("clazz", clazz);
        try {
            return (ENTITY)entity;
        } catch (ClassCastException e) {
            String msg = "The entity should be " + clazz.getSimpleName() + " but it was: " + entity.getClass();
            throw new RuntimeException(msg, e);
        }
    }

    // ----------------------------------------------------------------
    //                                                    Assert Object
    //                                                    -------------
    /**
     * Assert that the object is not null.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     * @exception IllegalArgumentException
     */
    protected void assertObjectNotNull(String variableName, Object value) {
        if (variableName == null) {
            String msg = "The value should not be null: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            String msg = "The value should not be null: variableName=" + variableName;
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * Assert that the entity is not null.
     * @param entity Entity. (NotNull)
     */
    protected void assertEntityNotNull(LdEntity entity) {
        assertObjectNotNull("entity", entity);
    }

    /**
     * Assert that the condition-bean is not null.
     * @param cb Condition-bean. (NotNull)
     */
    protected void assertConditionBeanNotNull(LdConditionBean cb) {
        assertCBNotNull(cb);
    }

    /**
     * Assert that the condition-bean is not null.
     * @param cb Condition-bean. (NotNull)
     */
    protected void assertCBNotNull(LdConditionBean cb) {
        assertObjectNotNull("cb", cb);
    }

    /**
     * Assert that the entity has primary-key value.
     * @param entity Entity. (NotNull)
     */
    protected void assertEntityNotNullAndHasPrimaryKeyValue(LdEntity entity) {
        assertEntityNotNull(entity);
        if (!entity.hasPrimaryKeyValue()) {
            String msg = "The entity must should primary-key: entity=" + entity;
            throw new IllegalArgumentException(msg + entity);
        }
    }

    // ----------------------------------------------------------------
    //                                                    Assert String
    //                                                    -------------
    /**
     * Assert that the entity is not null and not trimmed empty.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     */
    protected void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        assertObjectNotNull("variableName", variableName);
        assertObjectNotNull(variableName, value);
        if (value.trim().length() ==0) {
            String msg = "The value should not be empty: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
    }

    // ----------------------------------------------------------------
    //                                                      Assert List
    //                                                      -----------
    /**
     * Assert that the list is empty.
     * @param ls List. (NotNull)
     */
    protected void assertListNotNullAndEmpty(List<?> ls) {
        assertObjectNotNull("ls", ls);
        if (!ls.isEmpty()) {
            String msg = "The list should be empty: ls=" + ls.toString();
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * Assert that the list is not empty.
     * @param ls List. (NotNull)
     */
    protected void assertListNotNullAndNotEmpty(List<?> ls) {
        assertObjectNotNull("ls", ls);
        if (ls.isEmpty()) {
            String msg = "The list should not be empty: ls=" + ls.toString();
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * Assert that the list having only one.
     * @param ls List. (NotNull)
     */
    protected void assertListNotNullAndHasOnlyOne(List<?> ls) {
        assertObjectNotNull("ls", ls);
        if (ls.size() != 1) {
            String msg = "The list should contain only one object: ls=" + ls.toString();
            throw new IllegalArgumentException(msg);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get the invoker of behavior command.
     * @return The invoker of behavior command. (Nullable: But normally NotNull)
     */
    protected LdBehaviorCommandInvoker getBehaviorCommandInvoker() {
        return _behaviorCommandInvoker;
    }

    /**
     * Set the invoker of behavior command.
     * @param behaviorCommandInvoker The invoker of behavior command. (NotNull)
     */
    public void setBehaviorCommandInvoker(LdBehaviorCommandInvoker behaviorCommandInvoker) {
        this._behaviorCommandInvoker = behaviorCommandInvoker;
    }

    /**
     * Get the selector of behavior.
     * @return The select of behavior. (Nullable: But normally NotNull)
     */
    protected LdBehaviorSelector getBehaviorSelector() {
        return _behaviorSelector;
    }

    /**
     * Set the selector of behavior.
     * @param behaviorSelector The selector of behavior. (NotNull)
     */
    public void setBehaviorSelector(LdBehaviorSelector behaviorSelector) {
        this._behaviorSelector = behaviorSelector;
    }
}

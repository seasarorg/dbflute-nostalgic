package com.example.dbflute.buri.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.buri.dbflute.exbhv.*;
import com.example.dbflute.buri.dbflute.exentity.*;
import com.example.dbflute.buri.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.buri.dbflute.cbean.*;

/**
 * The behavior of BURI_ALL_ROUND_STATE as VIEW. <br />
 * <pre>
 * [primary key]
 *     
 * 
 * [column]
 *     INTERNAL_STATE_ID, STATUS_UPDATE_DATETIME, PARTICIPANT_NAME, PARTICIPANT_TYPE, INTERNAL_PATH_ID, STATUS_PATH_NAME, INTERNAL_DATA_ID, INTERNAL_PK_VALUE, INTERNAL_DATA_TYPE, INTERNAL_USER_ID, STATUS_UPDATE_USER
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     DOCUMENT
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     document
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriAllRoundStateBhv extends AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BURI_ALL_ROUND_STATE"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return BuriAllRoundStateDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BuriAllRoundStateDbm getMyDBMeta() { return BuriAllRoundStateDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BuriAllRoundState newMyEntity() { return new BuriAllRoundState(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BuriAllRoundStateCB newMyConditionBean() { return new BuriAllRoundStateCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BuriAllRoundStateCB cb = new BuriAllRoundStateCB();
     * cb.query().setFoo...(value);
     * int count = buriAllRoundStateBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BuriAllRoundState. (NotNull)
     * @return The selected count.
     */
    public int selectCount(BuriAllRoundStateCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(BuriAllRoundStateCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(BuriAllRoundStateCB cb) { // called by selectPage(cb)
        assertCBStateValid(cb);
        return delegateSelectCountPlainly(cb);
    }

    @Override
    protected int doReadCount(ConditionBean cb) {
        return selectCount(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * BuriAllRoundStateCB cb = new BuriAllRoundStateCB();
     * cb.query().setFoo...(value);
     * buriAllRoundStateBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;BuriAllRoundState&gt;() {
     *     public void handle(BuriAllRoundState entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of BuriAllRoundState. (NotNull)
     * @param entityRowHandler The handler of entity row of BuriAllRoundState. (NotNull)
     */
    public void selectCursor(BuriAllRoundStateCB cb, EntityRowHandler<BuriAllRoundState> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, BuriAllRoundState.class);
    }

    protected <ENTITY extends BuriAllRoundState> void doSelectCursor(BuriAllRoundStateCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<BuriAllRoundState>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * BuriAllRoundStateCB cb = new BuriAllRoundStateCB();
     * cb.query().setFoo...(value);
     * BuriAllRoundState buriAllRoundState = buriAllRoundStateBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (buriAllRoundState != null) {
     *     ... = buriAllRoundState.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BuriAllRoundState. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriAllRoundState selectEntity(BuriAllRoundStateCB cb) {
        return doSelectEntity(cb, BuriAllRoundState.class);
    }

    protected <ENTITY extends BuriAllRoundState> ENTITY doSelectEntity(final BuriAllRoundStateCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, BuriAllRoundStateCB>() {
            public List<ENTITY> callbackSelectList(BuriAllRoundStateCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * BuriAllRoundStateCB cb = new BuriAllRoundStateCB();
     * cb.query().setFoo...(value);
     * BuriAllRoundState buriAllRoundState = buriAllRoundStateBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = buriAllRoundState.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BuriAllRoundState. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriAllRoundState selectEntityWithDeletedCheck(BuriAllRoundStateCB cb) {
        return doSelectEntityWithDeletedCheck(cb, BuriAllRoundState.class);
    }

    protected <ENTITY extends BuriAllRoundState> ENTITY doSelectEntityWithDeletedCheck(final BuriAllRoundStateCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, BuriAllRoundStateCB>() {
            public List<ENTITY> callbackSelectList(BuriAllRoundStateCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BuriAllRoundStateCB cb = new BuriAllRoundStateCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;BuriAllRoundState&gt; buriAllRoundStateList = buriAllRoundStateBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (BuriAllRoundState buriAllRoundState : buriAllRoundStateList) {
     *     ... = buriAllRoundState.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriAllRoundState. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BuriAllRoundState> selectList(BuriAllRoundStateCB cb) {
        return doSelectList(cb, BuriAllRoundState.class);
    }

    protected <ENTITY extends BuriAllRoundState> ListResultBean<ENTITY> doSelectList(BuriAllRoundStateCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, BuriAllRoundStateCB>() {
            public List<ENTITY> callbackSelectList(BuriAllRoundStateCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
    }

    @Override
    protected ListResultBean<? extends Entity> doReadList(ConditionBean cb) {
        return selectList(downcast(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br />
     * (both count-select and paging-select are executed)
     * <pre>
     * BuriAllRoundStateCB cb = new BuriAllRoundStateCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BuriAllRoundState&gt; page = buriAllRoundStateBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (BuriAllRoundState buriAllRoundState : page) {
     *     ... = buriAllRoundState.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriAllRoundState. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BuriAllRoundState> selectPage(BuriAllRoundStateCB cb) {
        return doSelectPage(cb, BuriAllRoundState.class);
    }

    protected <ENTITY extends BuriAllRoundState> PagingResultBean<ENTITY> doSelectPage(BuriAllRoundStateCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, BuriAllRoundStateCB>() {
            public int callbackSelectCount(BuriAllRoundStateCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(BuriAllRoundStateCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
        });
    }

    @Override
    protected PagingResultBean<? extends Entity> doReadPage(ConditionBean cb) {
        return selectPage(downcast(cb));
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br />
     * You should call a function method after this method called like as follows:
     * <pre>
     * buriAllRoundStateBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(BuriAllRoundStateCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<BuriAllRoundStateCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends BuriAllRoundStateCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'Document'.
     * @param buriAllRoundStateList The list of buriAllRoundState. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<Document> pulloutDocument(List<BuriAllRoundState> buriAllRoundStateList) {
        return helpPulloutInternally(buriAllRoundStateList, new InternalPulloutCallback<BuriAllRoundState, Document>() {
            public Document getFr(BuriAllRoundState e) { return e.getDocument(); }
            public boolean hasRf() { return true; }
            public void setRfLs(Document e, List<BuriAllRoundState> ls)
            { e.setBuriAllRoundStateList(ls); }
        });
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the basic executor of outside-SQL to execute it. <br />
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
     * {Paging}
     *   o autoPaging().selectList()
     *   o autoPaging().selectPage()
     *   o manualPaging().selectList()
     *   o manualPaging().selectPage()
     * 
     * {Cursor}
     *   o cursorHandling().selectCursor()
     * 
     * {Option}
     *   o dynamicBinding().selectList()
     *   o removeBlockComment().selectList()
     *   o removeLineComment().selectList()
     *   o formatSql().selectList()
     * </pre>
     * @return The basic executor of outside-SQL. (NotNull) 
     */
    public OutsideSqlBasicExecutor<BuriAllRoundStateBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(BuriAllRoundStateCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(BuriAllRoundStateCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends BuriAllRoundState> void delegateSelectCursor(BuriAllRoundStateCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends BuriAllRoundState> List<ENTITY> delegateSelectList(BuriAllRoundStateCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                     Downcast Helper
    //                                                                     ===============
    protected BuriAllRoundState downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, BuriAllRoundState.class);
    }

    protected BuriAllRoundStateCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, BuriAllRoundStateCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<BuriAllRoundState> downcast(List<? extends Entity> entityList) {
        return (List<BuriAllRoundState>)entityList;
    }
}

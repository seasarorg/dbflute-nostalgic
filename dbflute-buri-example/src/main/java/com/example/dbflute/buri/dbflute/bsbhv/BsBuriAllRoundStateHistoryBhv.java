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
 * The behavior of BURI_ALL_ROUND_STATE_HISTORY as VIEW. <br />
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
 *     DOCUMENT(_文書管理_文書公開)
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     document_文書管理_文書公開
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriAllRoundStateHistoryBhv extends AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BURI_ALL_ROUND_STATE_HISTORY"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return BuriAllRoundStateHistoryDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BuriAllRoundStateHistoryDbm getMyDBMeta() { return BuriAllRoundStateHistoryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BuriAllRoundStateHistory newMyEntity() { return new BuriAllRoundStateHistory(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BuriAllRoundStateHistoryCB newMyConditionBean() { return new BuriAllRoundStateHistoryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BuriAllRoundStateHistoryCB cb = new BuriAllRoundStateHistoryCB();
     * cb.query().setFoo...(value);
     * int count = buriAllRoundStateHistoryBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BuriAllRoundStateHistory. (NotNull)
     * @return The selected count.
     */
    public int selectCount(BuriAllRoundStateHistoryCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(BuriAllRoundStateHistoryCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(BuriAllRoundStateHistoryCB cb) { // called by selectPage(cb)
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
     * BuriAllRoundStateHistoryCB cb = new BuriAllRoundStateHistoryCB();
     * cb.query().setFoo...(value);
     * buriAllRoundStateHistoryBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;BuriAllRoundStateHistory&gt;() {
     *     public void handle(BuriAllRoundStateHistory entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of BuriAllRoundStateHistory. (NotNull)
     * @param entityRowHandler The handler of entity row of BuriAllRoundStateHistory. (NotNull)
     */
    public void selectCursor(BuriAllRoundStateHistoryCB cb, EntityRowHandler<BuriAllRoundStateHistory> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, BuriAllRoundStateHistory.class);
    }

    protected <ENTITY extends BuriAllRoundStateHistory> void doSelectCursor(BuriAllRoundStateHistoryCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<BuriAllRoundStateHistory>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * BuriAllRoundStateHistoryCB cb = new BuriAllRoundStateHistoryCB();
     * cb.query().setFoo...(value);
     * BuriAllRoundStateHistory buriAllRoundStateHistory = buriAllRoundStateHistoryBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (buriAllRoundStateHistory != null) {
     *     ... = buriAllRoundStateHistory.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BuriAllRoundStateHistory. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriAllRoundStateHistory selectEntity(BuriAllRoundStateHistoryCB cb) {
        return doSelectEntity(cb, BuriAllRoundStateHistory.class);
    }

    protected <ENTITY extends BuriAllRoundStateHistory> ENTITY doSelectEntity(final BuriAllRoundStateHistoryCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, BuriAllRoundStateHistoryCB>() {
            public List<ENTITY> callbackSelectList(BuriAllRoundStateHistoryCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * BuriAllRoundStateHistoryCB cb = new BuriAllRoundStateHistoryCB();
     * cb.query().setFoo...(value);
     * BuriAllRoundStateHistory buriAllRoundStateHistory = buriAllRoundStateHistoryBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = buriAllRoundStateHistory.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BuriAllRoundStateHistory. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriAllRoundStateHistory selectEntityWithDeletedCheck(BuriAllRoundStateHistoryCB cb) {
        return doSelectEntityWithDeletedCheck(cb, BuriAllRoundStateHistory.class);
    }

    protected <ENTITY extends BuriAllRoundStateHistory> ENTITY doSelectEntityWithDeletedCheck(final BuriAllRoundStateHistoryCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, BuriAllRoundStateHistoryCB>() {
            public List<ENTITY> callbackSelectList(BuriAllRoundStateHistoryCB cb) { return doSelectList(cb, entityType); } });
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
     * BuriAllRoundStateHistoryCB cb = new BuriAllRoundStateHistoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;BuriAllRoundStateHistory&gt; buriAllRoundStateHistoryList = buriAllRoundStateHistoryBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (BuriAllRoundStateHistory buriAllRoundStateHistory : buriAllRoundStateHistoryList) {
     *     ... = buriAllRoundStateHistory.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriAllRoundStateHistory. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BuriAllRoundStateHistory> selectList(BuriAllRoundStateHistoryCB cb) {
        return doSelectList(cb, BuriAllRoundStateHistory.class);
    }

    protected <ENTITY extends BuriAllRoundStateHistory> ListResultBean<ENTITY> doSelectList(BuriAllRoundStateHistoryCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, BuriAllRoundStateHistoryCB>() {
            public List<ENTITY> callbackSelectList(BuriAllRoundStateHistoryCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * BuriAllRoundStateHistoryCB cb = new BuriAllRoundStateHistoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BuriAllRoundStateHistory&gt; page = buriAllRoundStateHistoryBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (BuriAllRoundStateHistory buriAllRoundStateHistory : page) {
     *     ... = buriAllRoundStateHistory.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriAllRoundStateHistory. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BuriAllRoundStateHistory> selectPage(BuriAllRoundStateHistoryCB cb) {
        return doSelectPage(cb, BuriAllRoundStateHistory.class);
    }

    protected <ENTITY extends BuriAllRoundStateHistory> PagingResultBean<ENTITY> doSelectPage(BuriAllRoundStateHistoryCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, BuriAllRoundStateHistoryCB>() {
            public int callbackSelectCount(BuriAllRoundStateHistoryCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(BuriAllRoundStateHistoryCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * buriAllRoundStateHistoryBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(BuriAllRoundStateHistoryCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<BuriAllRoundStateHistoryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends BuriAllRoundStateHistoryCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param buriAllRoundStateHistoryList The list of buriAllRoundStateHistory. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<Document> pulloutDocument_文書管理_文書公開(List<BuriAllRoundStateHistory> buriAllRoundStateHistoryList) {
        return helpPulloutInternally(buriAllRoundStateHistoryList, new InternalPulloutCallback<BuriAllRoundStateHistory, Document>() {
            public Document getFr(BuriAllRoundStateHistory e) { return e.getDocument_文書管理_文書公開(); }
            public boolean hasRf() { return false; }
            public void setRfLs(Document e, List<BuriAllRoundStateHistory> ls)
            { throw new UnsupportedOperationException(); }
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
    public OutsideSqlBasicExecutor<BuriAllRoundStateHistoryBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(BuriAllRoundStateHistoryCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(BuriAllRoundStateHistoryCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends BuriAllRoundStateHistory> void delegateSelectCursor(BuriAllRoundStateHistoryCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends BuriAllRoundStateHistory> List<ENTITY> delegateSelectList(BuriAllRoundStateHistoryCB cb, Class<ENTITY> et)
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
    protected BuriAllRoundStateHistory downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, BuriAllRoundStateHistory.class);
    }

    protected BuriAllRoundStateHistoryCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, BuriAllRoundStateHistoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<BuriAllRoundStateHistory> downcast(List<? extends Entity> entityList) {
        return (List<BuriAllRoundStateHistory>)entityList;
    }
}

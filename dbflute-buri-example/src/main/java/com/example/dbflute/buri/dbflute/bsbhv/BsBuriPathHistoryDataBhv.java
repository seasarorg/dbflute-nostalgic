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
 * The behavior of BURIPATHHISTORYDATA as VIEW. <br />
 * {Buri Internal}
 * <pre>
 * [primary key]
 *     
 * 
 * [column]
 *     PATHID, PATHNAME, REALPATHNAME, PATHTYPE, PKEYNUM, PKEYVAL, DATATYPE, TABLENAME, DATAID, STATEID, AUTORUNTIME, INSERTDATE, PROCESSDATE, ABORTDATE, PARTICIPANTNAME, PARTICIPANTTYPE
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
 *     
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriPathHistoryDataBhv extends AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BURIPATHHISTORYDATA"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return BuriPathHistoryDataDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BuriPathHistoryDataDbm getMyDBMeta() { return BuriPathHistoryDataDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BuriPathHistoryData newMyEntity() { return new BuriPathHistoryData(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BuriPathHistoryDataCB newMyConditionBean() { return new BuriPathHistoryDataCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BuriPathHistoryDataCB cb = new BuriPathHistoryDataCB();
     * cb.query().setFoo...(value);
     * int count = buriPathHistoryDataBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BuriPathHistoryData. (NotNull)
     * @return The selected count.
     */
    public int selectCount(BuriPathHistoryDataCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(BuriPathHistoryDataCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(BuriPathHistoryDataCB cb) { // called by selectPage(cb)
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
     * BuriPathHistoryDataCB cb = new BuriPathHistoryDataCB();
     * cb.query().setFoo...(value);
     * buriPathHistoryDataBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;BuriPathHistoryData&gt;() {
     *     public void handle(BuriPathHistoryData entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of BuriPathHistoryData. (NotNull)
     * @param entityRowHandler The handler of entity row of BuriPathHistoryData. (NotNull)
     */
    public void selectCursor(BuriPathHistoryDataCB cb, EntityRowHandler<BuriPathHistoryData> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, BuriPathHistoryData.class);
    }

    protected <ENTITY extends BuriPathHistoryData> void doSelectCursor(BuriPathHistoryDataCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<BuriPathHistoryData>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * BuriPathHistoryDataCB cb = new BuriPathHistoryDataCB();
     * cb.query().setFoo...(value);
     * BuriPathHistoryData buriPathHistoryData = buriPathHistoryDataBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (buriPathHistoryData != null) {
     *     ... = buriPathHistoryData.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BuriPathHistoryData. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriPathHistoryData selectEntity(BuriPathHistoryDataCB cb) {
        return doSelectEntity(cb, BuriPathHistoryData.class);
    }

    protected <ENTITY extends BuriPathHistoryData> ENTITY doSelectEntity(final BuriPathHistoryDataCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, BuriPathHistoryDataCB>() {
            public List<ENTITY> callbackSelectList(BuriPathHistoryDataCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * BuriPathHistoryDataCB cb = new BuriPathHistoryDataCB();
     * cb.query().setFoo...(value);
     * BuriPathHistoryData buriPathHistoryData = buriPathHistoryDataBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = buriPathHistoryData.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BuriPathHistoryData. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriPathHistoryData selectEntityWithDeletedCheck(BuriPathHistoryDataCB cb) {
        return doSelectEntityWithDeletedCheck(cb, BuriPathHistoryData.class);
    }

    protected <ENTITY extends BuriPathHistoryData> ENTITY doSelectEntityWithDeletedCheck(final BuriPathHistoryDataCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, BuriPathHistoryDataCB>() {
            public List<ENTITY> callbackSelectList(BuriPathHistoryDataCB cb) { return doSelectList(cb, entityType); } });
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
     * BuriPathHistoryDataCB cb = new BuriPathHistoryDataCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;BuriPathHistoryData&gt; buriPathHistoryDataList = buriPathHistoryDataBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (BuriPathHistoryData buriPathHistoryData : buriPathHistoryDataList) {
     *     ... = buriPathHistoryData.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriPathHistoryData. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BuriPathHistoryData> selectList(BuriPathHistoryDataCB cb) {
        return doSelectList(cb, BuriPathHistoryData.class);
    }

    protected <ENTITY extends BuriPathHistoryData> ListResultBean<ENTITY> doSelectList(BuriPathHistoryDataCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, BuriPathHistoryDataCB>() {
            public List<ENTITY> callbackSelectList(BuriPathHistoryDataCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * BuriPathHistoryDataCB cb = new BuriPathHistoryDataCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BuriPathHistoryData&gt; page = buriPathHistoryDataBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (BuriPathHistoryData buriPathHistoryData : page) {
     *     ... = buriPathHistoryData.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriPathHistoryData. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BuriPathHistoryData> selectPage(BuriPathHistoryDataCB cb) {
        return doSelectPage(cb, BuriPathHistoryData.class);
    }

    protected <ENTITY extends BuriPathHistoryData> PagingResultBean<ENTITY> doSelectPage(BuriPathHistoryDataCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, BuriPathHistoryDataCB>() {
            public int callbackSelectCount(BuriPathHistoryDataCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(BuriPathHistoryDataCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * buriPathHistoryDataBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(BuriPathHistoryDataCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<BuriPathHistoryDataCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends BuriPathHistoryDataCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
    public OutsideSqlBasicExecutor<BuriPathHistoryDataBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(BuriPathHistoryDataCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(BuriPathHistoryDataCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends BuriPathHistoryData> void delegateSelectCursor(BuriPathHistoryDataCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends BuriPathHistoryData> List<ENTITY> delegateSelectList(BuriPathHistoryDataCB cb, Class<ENTITY> et)
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
    protected BuriPathHistoryData downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, BuriPathHistoryData.class);
    }

    protected BuriPathHistoryDataCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, BuriPathHistoryDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<BuriPathHistoryData> downcast(List<? extends Entity> entityList) {
        return (List<BuriPathHistoryData>)entityList;
    }
}

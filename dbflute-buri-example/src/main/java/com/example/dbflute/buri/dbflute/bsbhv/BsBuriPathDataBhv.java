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
 * The behavior of BURIPATHDATA as VIEW. <br />
 * {Buri Internal}
 * <pre>
 * [primary key]
 *     
 * 
 * [column]
 *     PATHID, PATHNAME, REALPATHNAME, PATHTYPE, PKEYNUM, PKEYVAL, DATATYPE, TABLENAME, DATAID, STATEID, AUTORUNTIME, PARTICIPANTNAME, PARTICIPANTTYPE
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
public abstract class BsBuriPathDataBhv extends AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BURIPATHDATA"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return BuriPathDataDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BuriPathDataDbm getMyDBMeta() { return BuriPathDataDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BuriPathData newMyEntity() { return new BuriPathData(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BuriPathDataCB newMyConditionBean() { return new BuriPathDataCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BuriPathDataCB cb = new BuriPathDataCB();
     * cb.query().setFoo...(value);
     * int count = buriPathDataBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BuriPathData. (NotNull)
     * @return The selected count.
     */
    public int selectCount(BuriPathDataCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(BuriPathDataCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(BuriPathDataCB cb) { // called by selectPage(cb)
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
     * BuriPathDataCB cb = new BuriPathDataCB();
     * cb.query().setFoo...(value);
     * buriPathDataBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;BuriPathData&gt;() {
     *     public void handle(BuriPathData entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of BuriPathData. (NotNull)
     * @param entityRowHandler The handler of entity row of BuriPathData. (NotNull)
     */
    public void selectCursor(BuriPathDataCB cb, EntityRowHandler<BuriPathData> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, BuriPathData.class);
    }

    protected <ENTITY extends BuriPathData> void doSelectCursor(BuriPathDataCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<BuriPathData>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * BuriPathDataCB cb = new BuriPathDataCB();
     * cb.query().setFoo...(value);
     * BuriPathData buriPathData = buriPathDataBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (buriPathData != null) {
     *     ... = buriPathData.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BuriPathData. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriPathData selectEntity(BuriPathDataCB cb) {
        return doSelectEntity(cb, BuriPathData.class);
    }

    protected <ENTITY extends BuriPathData> ENTITY doSelectEntity(final BuriPathDataCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, BuriPathDataCB>() {
            public List<ENTITY> callbackSelectList(BuriPathDataCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * BuriPathDataCB cb = new BuriPathDataCB();
     * cb.query().setFoo...(value);
     * BuriPathData buriPathData = buriPathDataBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = buriPathData.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BuriPathData. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriPathData selectEntityWithDeletedCheck(BuriPathDataCB cb) {
        return doSelectEntityWithDeletedCheck(cb, BuriPathData.class);
    }

    protected <ENTITY extends BuriPathData> ENTITY doSelectEntityWithDeletedCheck(final BuriPathDataCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, BuriPathDataCB>() {
            public List<ENTITY> callbackSelectList(BuriPathDataCB cb) { return doSelectList(cb, entityType); } });
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
     * BuriPathDataCB cb = new BuriPathDataCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;BuriPathData&gt; buriPathDataList = buriPathDataBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (BuriPathData buriPathData : buriPathDataList) {
     *     ... = buriPathData.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriPathData. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BuriPathData> selectList(BuriPathDataCB cb) {
        return doSelectList(cb, BuriPathData.class);
    }

    protected <ENTITY extends BuriPathData> ListResultBean<ENTITY> doSelectList(BuriPathDataCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, BuriPathDataCB>() {
            public List<ENTITY> callbackSelectList(BuriPathDataCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * BuriPathDataCB cb = new BuriPathDataCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BuriPathData&gt; page = buriPathDataBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (BuriPathData buriPathData : page) {
     *     ... = buriPathData.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriPathData. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BuriPathData> selectPage(BuriPathDataCB cb) {
        return doSelectPage(cb, BuriPathData.class);
    }

    protected <ENTITY extends BuriPathData> PagingResultBean<ENTITY> doSelectPage(BuriPathDataCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, BuriPathDataCB>() {
            public int callbackSelectCount(BuriPathDataCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(BuriPathDataCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * buriPathDataBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(BuriPathDataCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<BuriPathDataCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends BuriPathDataCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
    public OutsideSqlBasicExecutor<BuriPathDataBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(BuriPathDataCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(BuriPathDataCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends BuriPathData> void delegateSelectCursor(BuriPathDataCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends BuriPathData> List<ENTITY> delegateSelectList(BuriPathDataCB cb, Class<ENTITY> et)
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
    protected BuriPathData downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, BuriPathData.class);
    }

    protected BuriPathDataCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, BuriPathDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<BuriPathData> downcast(List<? extends Entity> entityList) {
        return (List<BuriPathData>)entityList;
    }
}

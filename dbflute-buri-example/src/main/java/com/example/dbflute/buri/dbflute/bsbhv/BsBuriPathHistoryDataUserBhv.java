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
 * The behavior of BURIPATHHISTORYDATAUSER as VIEW. <br />
 * {Buri Internal}
 * <pre>
 * [primary key]
 *     
 * 
 * [column]
 *     PATHID, PATHNAME, REALPATHNAME, PATHTYPE, PKEYNUM, PKEYVAL, DATATYPE, TABLENAME, DATAID, STATEID, AUTORUNTIME, INSERTDATE, PROCESSDATE, ABORTDATE, PARTICIPANTNAME, PARTICIPANTTYPE, BURIUSERID, USERIDVAL, USERIDNUM
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
public abstract class BsBuriPathHistoryDataUserBhv extends AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BURIPATHHISTORYDATAUSER"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return BuriPathHistoryDataUserDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BuriPathHistoryDataUserDbm getMyDBMeta() { return BuriPathHistoryDataUserDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BuriPathHistoryDataUser newMyEntity() { return new BuriPathHistoryDataUser(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BuriPathHistoryDataUserCB newMyConditionBean() { return new BuriPathHistoryDataUserCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BuriPathHistoryDataUserCB cb = new BuriPathHistoryDataUserCB();
     * cb.query().setFoo...(value);
     * int count = buriPathHistoryDataUserBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BuriPathHistoryDataUser. (NotNull)
     * @return The selected count.
     */
    public int selectCount(BuriPathHistoryDataUserCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(BuriPathHistoryDataUserCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(BuriPathHistoryDataUserCB cb) { // called by selectPage(cb)
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
     * BuriPathHistoryDataUserCB cb = new BuriPathHistoryDataUserCB();
     * cb.query().setFoo...(value);
     * buriPathHistoryDataUserBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;BuriPathHistoryDataUser&gt;() {
     *     public void handle(BuriPathHistoryDataUser entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of BuriPathHistoryDataUser. (NotNull)
     * @param entityRowHandler The handler of entity row of BuriPathHistoryDataUser. (NotNull)
     */
    public void selectCursor(BuriPathHistoryDataUserCB cb, EntityRowHandler<BuriPathHistoryDataUser> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, BuriPathHistoryDataUser.class);
    }

    protected <ENTITY extends BuriPathHistoryDataUser> void doSelectCursor(BuriPathHistoryDataUserCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<BuriPathHistoryDataUser>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * BuriPathHistoryDataUserCB cb = new BuriPathHistoryDataUserCB();
     * cb.query().setFoo...(value);
     * BuriPathHistoryDataUser buriPathHistoryDataUser = buriPathHistoryDataUserBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (buriPathHistoryDataUser != null) {
     *     ... = buriPathHistoryDataUser.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BuriPathHistoryDataUser. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriPathHistoryDataUser selectEntity(BuriPathHistoryDataUserCB cb) {
        return doSelectEntity(cb, BuriPathHistoryDataUser.class);
    }

    protected <ENTITY extends BuriPathHistoryDataUser> ENTITY doSelectEntity(final BuriPathHistoryDataUserCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, BuriPathHistoryDataUserCB>() {
            public List<ENTITY> callbackSelectList(BuriPathHistoryDataUserCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * BuriPathHistoryDataUserCB cb = new BuriPathHistoryDataUserCB();
     * cb.query().setFoo...(value);
     * BuriPathHistoryDataUser buriPathHistoryDataUser = buriPathHistoryDataUserBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = buriPathHistoryDataUser.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BuriPathHistoryDataUser. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriPathHistoryDataUser selectEntityWithDeletedCheck(BuriPathHistoryDataUserCB cb) {
        return doSelectEntityWithDeletedCheck(cb, BuriPathHistoryDataUser.class);
    }

    protected <ENTITY extends BuriPathHistoryDataUser> ENTITY doSelectEntityWithDeletedCheck(final BuriPathHistoryDataUserCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, BuriPathHistoryDataUserCB>() {
            public List<ENTITY> callbackSelectList(BuriPathHistoryDataUserCB cb) { return doSelectList(cb, entityType); } });
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
     * BuriPathHistoryDataUserCB cb = new BuriPathHistoryDataUserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;BuriPathHistoryDataUser&gt; buriPathHistoryDataUserList = buriPathHistoryDataUserBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (BuriPathHistoryDataUser buriPathHistoryDataUser : buriPathHistoryDataUserList) {
     *     ... = buriPathHistoryDataUser.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriPathHistoryDataUser. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BuriPathHistoryDataUser> selectList(BuriPathHistoryDataUserCB cb) {
        return doSelectList(cb, BuriPathHistoryDataUser.class);
    }

    protected <ENTITY extends BuriPathHistoryDataUser> ListResultBean<ENTITY> doSelectList(BuriPathHistoryDataUserCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, BuriPathHistoryDataUserCB>() {
            public List<ENTITY> callbackSelectList(BuriPathHistoryDataUserCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * BuriPathHistoryDataUserCB cb = new BuriPathHistoryDataUserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BuriPathHistoryDataUser&gt; page = buriPathHistoryDataUserBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (BuriPathHistoryDataUser buriPathHistoryDataUser : page) {
     *     ... = buriPathHistoryDataUser.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriPathHistoryDataUser. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BuriPathHistoryDataUser> selectPage(BuriPathHistoryDataUserCB cb) {
        return doSelectPage(cb, BuriPathHistoryDataUser.class);
    }

    protected <ENTITY extends BuriPathHistoryDataUser> PagingResultBean<ENTITY> doSelectPage(BuriPathHistoryDataUserCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, BuriPathHistoryDataUserCB>() {
            public int callbackSelectCount(BuriPathHistoryDataUserCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(BuriPathHistoryDataUserCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * buriPathHistoryDataUserBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(BuriPathHistoryDataUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<BuriPathHistoryDataUserCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends BuriPathHistoryDataUserCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
    public OutsideSqlBasicExecutor<BuriPathHistoryDataUserBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(BuriPathHistoryDataUserCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(BuriPathHistoryDataUserCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends BuriPathHistoryDataUser> void delegateSelectCursor(BuriPathHistoryDataUserCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends BuriPathHistoryDataUser> List<ENTITY> delegateSelectList(BuriPathHistoryDataUserCB cb, Class<ENTITY> et)
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
    protected BuriPathHistoryDataUser downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, BuriPathHistoryDataUser.class);
    }

    protected BuriPathHistoryDataUserCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, BuriPathHistoryDataUserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<BuriPathHistoryDataUser> downcast(List<? extends Entity> entityList) {
        return (List<BuriPathHistoryDataUser>)entityList;
    }
}

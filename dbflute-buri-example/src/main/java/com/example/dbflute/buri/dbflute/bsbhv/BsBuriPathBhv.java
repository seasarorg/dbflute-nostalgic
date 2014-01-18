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
 * The behavior of BURIPATH as TABLE. <br />
 * {Buri Internal}
 * <pre>
 * [primary key]
 *     PATHID
 * 
 * [column]
 *     PATHID, PATHNAME, REALPATHNAME, PATHTYPE
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
 *     BURISTATE, BURIBRANCH
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     buriStateList, buriBranchList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriPathBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BURIPATH"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return BuriPathDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BuriPathDbm getMyDBMeta() { return BuriPathDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BuriPath newMyEntity() { return new BuriPath(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BuriPathCB newMyConditionBean() { return new BuriPathCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BuriPathCB cb = new BuriPathCB();
     * cb.query().setFoo...(value);
     * int count = buriPathBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BuriPath. (NotNull)
     * @return The selected count.
     */
    public int selectCount(BuriPathCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(BuriPathCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(BuriPathCB cb) { // called by selectPage(cb)
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
     * BuriPathCB cb = new BuriPathCB();
     * cb.query().setFoo...(value);
     * buriPathBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;BuriPath&gt;() {
     *     public void handle(BuriPath entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of BuriPath. (NotNull)
     * @param entityRowHandler The handler of entity row of BuriPath. (NotNull)
     */
    public void selectCursor(BuriPathCB cb, EntityRowHandler<BuriPath> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, BuriPath.class);
    }

    protected <ENTITY extends BuriPath> void doSelectCursor(BuriPathCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<BuriPath>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * BuriPathCB cb = new BuriPathCB();
     * cb.query().setFoo...(value);
     * BuriPath buriPath = buriPathBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (buriPath != null) {
     *     ... = buriPath.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BuriPath. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriPath selectEntity(BuriPathCB cb) {
        return doSelectEntity(cb, BuriPath.class);
    }

    protected <ENTITY extends BuriPath> ENTITY doSelectEntity(final BuriPathCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, BuriPathCB>() {
            public List<ENTITY> callbackSelectList(BuriPathCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * BuriPathCB cb = new BuriPathCB();
     * cb.query().setFoo...(value);
     * BuriPath buriPath = buriPathBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = buriPath.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BuriPath. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriPath selectEntityWithDeletedCheck(BuriPathCB cb) {
        return doSelectEntityWithDeletedCheck(cb, BuriPath.class);
    }

    protected <ENTITY extends BuriPath> ENTITY doSelectEntityWithDeletedCheck(final BuriPathCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, BuriPathCB>() {
            public List<ENTITY> callbackSelectList(BuriPathCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param pathId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriPath selectByPKValue(Long pathId) {
        return doSelectByPKValue(pathId, BuriPath.class);
    }

    protected <ENTITY extends BuriPath> ENTITY doSelectByPKValue(Long pathId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(pathId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param pathId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriPath selectByPKValueWithDeletedCheck(Long pathId) {
        return doSelectByPKValueWithDeletedCheck(pathId, BuriPath.class);
    }

    protected <ENTITY extends BuriPath> ENTITY doSelectByPKValueWithDeletedCheck(Long pathId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(pathId), entityType);
    }

    private BuriPathCB buildPKCB(Long pathId) {
        assertObjectNotNull("pathId", pathId);
        BuriPathCB cb = newMyConditionBean();
        cb.query().setPathId_Equal(pathId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BuriPathCB cb = new BuriPathCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;BuriPath&gt; buriPathList = buriPathBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (BuriPath buriPath : buriPathList) {
     *     ... = buriPath.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriPath. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BuriPath> selectList(BuriPathCB cb) {
        return doSelectList(cb, BuriPath.class);
    }

    protected <ENTITY extends BuriPath> ListResultBean<ENTITY> doSelectList(BuriPathCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, BuriPathCB>() {
            public List<ENTITY> callbackSelectList(BuriPathCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * BuriPathCB cb = new BuriPathCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BuriPath&gt; page = buriPathBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (BuriPath buriPath : page) {
     *     ... = buriPath.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriPath. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BuriPath> selectPage(BuriPathCB cb) {
        return doSelectPage(cb, BuriPath.class);
    }

    protected <ENTITY extends BuriPath> PagingResultBean<ENTITY> doSelectPage(BuriPathCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, BuriPathCB>() {
            public int callbackSelectCount(BuriPathCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(BuriPathCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * buriPathBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(BuriPathCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<BuriPathCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends BuriPathCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param buriPath The entity of buriPath. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriStateList(BuriPath buriPath, ConditionBeanSetupper<BuriStateCB> conditionBeanSetupper) {
        xassLRArg(buriPath, conditionBeanSetupper);
        loadBuriStateList(xnewLRLs(buriPath), conditionBeanSetupper);
    }
    /**
     * Load referrer of buriStateList with the set-upper for condition-bean of referrer. <br />
     * BURISTATE by your PATHID, named 'buriStateList'.
     * <pre>
     * buriPathBhv.<span style="color: #FD4747">loadBuriStateList</span>(buriPathList, new ConditionBeanSetupper&lt;BuriStateCB&gt;() {
     *     public void setup(BuriStateCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (BuriPath buriPath : buriPathList) {
     *     ... = buriPath.<span style="color: #FD4747">getBuriStateList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setPathId_InScope(pkList);
     * cb.query().addOrderBy_PathId_Asc();
     * </pre>
     * @param buriPathList The entity list of buriPath. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriStateList(List<BuriPath> buriPathList, ConditionBeanSetupper<BuriStateCB> conditionBeanSetupper) {
        xassLRArg(buriPathList, conditionBeanSetupper);
        loadBuriStateList(buriPathList, new LoadReferrerOption<BuriStateCB, BuriState>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param buriPath The entity of buriPath. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriStateList(BuriPath buriPath, LoadReferrerOption<BuriStateCB, BuriState> loadReferrerOption) {
        xassLRArg(buriPath, loadReferrerOption);
        loadBuriStateList(xnewLRLs(buriPath), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param buriPathList The entity list of buriPath. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriStateList(List<BuriPath> buriPathList, LoadReferrerOption<BuriStateCB, BuriState> loadReferrerOption) {
        xassLRArg(buriPathList, loadReferrerOption);
        if (buriPathList.isEmpty()) { return; }
        final BuriStateBhv referrerBhv = xgetBSFLR().select(BuriStateBhv.class);
        helpLoadReferrerInternally(buriPathList, loadReferrerOption, new InternalLoadReferrerCallback<BuriPath, Long, BuriStateCB, BuriState>() {
            public Long getPKVal(BuriPath e)
            { return e.getPathId(); }
            public void setRfLs(BuriPath e, List<BuriState> ls)
            { e.setBuriStateList(ls); }
            public BuriStateCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(BuriStateCB cb, List<Long> ls)
            { cb.query().setPathId_InScope(ls); }
            public void qyOdFKAsc(BuriStateCB cb) { cb.query().addOrderBy_PathId_Asc(); }
            public void spFKCol(BuriStateCB cb) { cb.specify().columnPathId(); }
            public List<BuriState> selRfLs(BuriStateCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(BuriState e) { return e.getPathId(); }
            public void setlcEt(BuriState re, BuriPath le)
            { re.setBuriPath(le); }
            public String getRfPrNm() { return "buriStateList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param buriPath The entity of buriPath. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriBranchList(BuriPath buriPath, ConditionBeanSetupper<BuriBranchCB> conditionBeanSetupper) {
        xassLRArg(buriPath, conditionBeanSetupper);
        loadBuriBranchList(xnewLRLs(buriPath), conditionBeanSetupper);
    }
    /**
     * Load referrer of buriBranchList with the set-upper for condition-bean of referrer. <br />
     * BURIBRANCH by your PATHID, named 'buriBranchList'.
     * <pre>
     * buriPathBhv.<span style="color: #FD4747">loadBuriBranchList</span>(buriPathList, new ConditionBeanSetupper&lt;BuriBranchCB&gt;() {
     *     public void setup(BuriBranchCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (BuriPath buriPath : buriPathList) {
     *     ... = buriPath.<span style="color: #FD4747">getBuriBranchList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setPathId_InScope(pkList);
     * cb.query().addOrderBy_PathId_Asc();
     * </pre>
     * @param buriPathList The entity list of buriPath. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriBranchList(List<BuriPath> buriPathList, ConditionBeanSetupper<BuriBranchCB> conditionBeanSetupper) {
        xassLRArg(buriPathList, conditionBeanSetupper);
        loadBuriBranchList(buriPathList, new LoadReferrerOption<BuriBranchCB, BuriBranch>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param buriPath The entity of buriPath. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriBranchList(BuriPath buriPath, LoadReferrerOption<BuriBranchCB, BuriBranch> loadReferrerOption) {
        xassLRArg(buriPath, loadReferrerOption);
        loadBuriBranchList(xnewLRLs(buriPath), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param buriPathList The entity list of buriPath. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriBranchList(List<BuriPath> buriPathList, LoadReferrerOption<BuriBranchCB, BuriBranch> loadReferrerOption) {
        xassLRArg(buriPathList, loadReferrerOption);
        if (buriPathList.isEmpty()) { return; }
        final BuriBranchBhv referrerBhv = xgetBSFLR().select(BuriBranchBhv.class);
        helpLoadReferrerInternally(buriPathList, loadReferrerOption, new InternalLoadReferrerCallback<BuriPath, Long, BuriBranchCB, BuriBranch>() {
            public Long getPKVal(BuriPath e)
            { return e.getPathId(); }
            public void setRfLs(BuriPath e, List<BuriBranch> ls)
            { e.setBuriBranchList(ls); }
            public BuriBranchCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(BuriBranchCB cb, List<Long> ls)
            { cb.query().setPathId_InScope(ls); }
            public void qyOdFKAsc(BuriBranchCB cb) { cb.query().addOrderBy_PathId_Asc(); }
            public void spFKCol(BuriBranchCB cb) { cb.specify().columnPathId(); }
            public List<BuriBranch> selRfLs(BuriBranchCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(BuriBranch e) { return e.getPathId(); }
            public void setlcEt(BuriBranch re, BuriPath le)
            { re.setBuriPath(le); }
            public String getRfPrNm() { return "buriBranchList"; }
        });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * BuriPath buriPath = new BuriPath();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriPath.setFoo...(value);
     * buriPath.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriPath.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriPath.set...;</span>
     * buriPathBhv.<span style="color: #FD4747">insert</span>(buriPath);
     * ... = buriPath.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriPath The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(BuriPath buriPath) {
        doInsert(buriPath, null);
    }

    protected void doInsert(BuriPath buriPath, InsertOption<BuriPathCB> option) {
        assertObjectNotNull("buriPath", buriPath);
        prepareInsertOption(option);
        delegateInsert(buriPath, option);
    }

    protected void prepareInsertOption(InsertOption<BuriPathCB> option) {
        if (option == null) { return; }
        assertInsertOptionStatus(option);
    }

    @Override
    protected void doCreate(Entity entity, InsertOption<? extends ConditionBean> option) {
        if (option == null) { insert(downcast(entity)); }
        else { varyingInsert(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity modified-only. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * BuriPath buriPath = new BuriPath();
     * buriPath.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriPath.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriPath.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriPath.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriPath.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriPathBhv.<span style="color: #FD4747">update</span>(buriPath);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriPath The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final BuriPath buriPath) {
        doUpdate(buriPath, null);
    }

    protected void doUpdate(BuriPath buriPath, final UpdateOption<BuriPathCB> option) {
        assertObjectNotNull("buriPath", buriPath);
        prepareUpdateOption(option);
        helpUpdateInternally(buriPath, new InternalUpdateCallback<BuriPath>() {
            public int callbackDelegateUpdate(BuriPath entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<BuriPathCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected BuriPathCB createCBForVaryingUpdate() {
        BuriPathCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected BuriPathCB createCBForSpecifiedUpdate() {
        BuriPathCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        doModify(entity, option);
    }

    /**
     * Insert or update the entity modified-only. {ExclusiveControl(when update)}
     * @param buriPath The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(BuriPath buriPath) {
        doInesrtOrUpdate(buriPath, null, null);
    }

    protected void doInesrtOrUpdate(BuriPath buriPath, final InsertOption<BuriPathCB> insertOption, final UpdateOption<BuriPathCB> updateOption) {
        helpInsertOrUpdateInternally(buriPath, new InternalInsertOrUpdateCallback<BuriPath, BuriPathCB>() {
            public void callbackInsert(BuriPath entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(BuriPath entity) { doUpdate(entity, updateOption); }
            public BuriPathCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(BuriPathCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<BuriPathCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<BuriPathCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        doCreateOrModify(entity, insertOption, updateOption);
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * BuriPath buriPath = new BuriPath();
     * buriPath.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriPath.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriPathBhv.<span style="color: #FD4747">delete</span>(buriPath);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriPath The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BuriPath buriPath) {
        doDelete(buriPath, null);
    }

    protected void doDelete(BuriPath buriPath, final DeleteOption<BuriPathCB> option) {
        assertObjectNotNull("buriPath", buriPath);
        prepareDeleteOption(option);
        helpDeleteInternally(buriPath, new InternalDeleteCallback<BuriPath>() {
            public int callbackDelegateDelete(BuriPath entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<BuriPathCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        doRemove(entity, option);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are insert target. (so default constraints are not available) <br />
     * And if the table has an identity, entities after the process do not have incremented values.
     * (When you use the (normal) insert(), an entity after the process has an incremented value)
     * @param buriPathList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<BuriPath> buriPathList) {
        return doBatchInsert(buriPathList, null);
    }

    protected int[] doBatchInsert(List<BuriPath> buriPathList, InsertOption<BuriPathCB> option) {
        assertObjectNotNull("buriPathList", buriPathList);
        prepareInsertOption(option);
        return delegateBatchInsert(buriPathList, option);
    }

    @Override
    protected int[] doLumpCreate(List<Entity> ls, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return batchInsert(downcast(ls)); }
        else { return varyingBatchInsert(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are update target. {NOT modified only}
     * @param buriPathList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<BuriPath> buriPathList) {
        return doBatchUpdate(buriPathList, null);
    }

    protected int[] doBatchUpdate(List<BuriPath> buriPathList, UpdateOption<BuriPathCB> option) {
        assertObjectNotNull("buriPathList", buriPathList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(buriPathList, option);
    }

    @Override
    protected int[] doLumpModify(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdate(downcast(ls)); }
        else { return varyingBatchUpdate(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-update the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistick lock column because they are specified implicitly.
     * @param buriPathList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<BuriPath> buriPathList, SpecifyQuery<BuriPathCB> updateColumnSpec) {
        return doBatchUpdate(buriPathList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param buriPathList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<BuriPath> buriPathList) {
        return doBatchDelete(buriPathList, null);
    }

    protected int[] doBatchDelete(List<BuriPath> buriPathList, DeleteOption<BuriPathCB> option) {
        assertObjectNotNull("buriPathList", buriPathList);
        prepareDeleteOption(option);
        return delegateBatchDelete(buriPathList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        return doLumpRemove(ls, option);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * buriPathBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;BuriPath, BuriPathCB&gt;() {
     *     public ConditionBean setup(buriPath entity, BuriPathCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     * 
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     * 
     *         return cb;
     *     }
     * });
     * </pre>
     * @param setupper The setup-per of query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<BuriPath, BuriPathCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<BuriPath, BuriPathCB> setupper, InsertOption<BuriPathCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        BuriPath entity = new BuriPath();
        BuriPathCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected BuriPathCB createCBForQueryInsert() {
        BuriPathCB cb = newMyConditionBean();
        cb.xsetupForQueryInsert();
        return cb;
    }

    @Override
    protected int doRangeCreate(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> setupper, InsertOption<? extends ConditionBean> option) {
        if (option == null) { return queryInsert(downcast(setupper)); }
        else { return varyingQueryInsert(downcast(setupper), downcast(option)); }
    }

    /**
     * Update the several entities by query non-strictly modified-only. {NonExclusiveControl}
     * <pre>
     * BuriPath buriPath = new BuriPath();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriPath.setPK...(value);</span>
     * buriPath.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriPath.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriPath.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriPath.setVersionNo(value);</span>
     * BuriPathCB cb = new BuriPathCB();
     * cb.query().setFoo...(value);
     * buriPathBhv.<span style="color: #FD4747">queryUpdate</span>(buriPath, cb);
     * </pre>
     * @param buriPath The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BuriPath. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BuriPath buriPath, BuriPathCB cb) {
        return doQueryUpdate(buriPath, cb, null);
    }

    protected int doQueryUpdate(BuriPath buriPath, BuriPathCB cb, UpdateOption<BuriPathCB> option) {
        assertObjectNotNull("buriPath", buriPath); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(buriPath, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (BuriPathCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (BuriPathCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * BuriPathCB cb = new BuriPathCB();
     * cb.query().setFoo...(value);
     * buriPathBhv.<span style="color: #FD4747">queryDelete</span>(buriPath, cb);
     * </pre>
     * @param cb The condition-bean of BuriPath. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BuriPathCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(BuriPathCB cb, DeleteOption<BuriPathCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((BuriPathCB)cb); }
        else { return varyingQueryDelete((BuriPathCB)cb, downcast(option)); }
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as insert(entity).
     * <pre>
     * BuriPath buriPath = new BuriPath();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriPath.setFoo...(value);
     * buriPath.setBar...(value);
     * InsertOption<BuriPathCB> option = new InsertOption<BuriPathCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * buriPathBhv.<span style="color: #FD4747">varyingInsert</span>(buriPath, option);
     * ... = buriPath.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriPath The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(BuriPath buriPath, InsertOption<BuriPathCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(buriPath, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * BuriPath buriPath = new BuriPath();
     * buriPath.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriPath.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriPath.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;BuriPathCB&gt; option = new UpdateOption&lt;BuriPathCB&gt;();
     *     option.self(new SpecifyQuery&lt;BuriPathCB&gt;() {
     *         public void specify(BuriPathCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     buriPathBhv.<span style="color: #FD4747">varyingUpdate</span>(buriPath, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param buriPath The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(BuriPath buriPath, UpdateOption<BuriPathCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(buriPath, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param buriPath The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(BuriPath buriPath, InsertOption<BuriPathCB> insertOption, UpdateOption<BuriPathCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(buriPath, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param buriPath The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BuriPath buriPath, DeleteOption<BuriPathCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(buriPath, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param buriPathList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<BuriPath> buriPathList, InsertOption<BuriPathCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(buriPathList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param buriPathList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<BuriPath> buriPathList, UpdateOption<BuriPathCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(buriPathList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param buriPathList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<BuriPath> buriPathList, DeleteOption<BuriPathCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(buriPathList, option);
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br />
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br />
     * Other specifications are same as queryInsert(entity, setupper). 
     * @param setupper The setup-per of query-insert. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<BuriPath, BuriPathCB> setupper, InsertOption<BuriPathCB> option) {
        assertInsertOptionNotNull(option);
        return doQueryInsert(setupper, option);
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br />
     * Other specifications are same as queryUpdate(entity, cb). 
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BuriPath buriPath = new BuriPath();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriPath.setPK...(value);</span>
     * buriPath.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriPath.setVersionNo(value);</span>
     * BuriPathCB cb = new BuriPathCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;BuriPathCB&gt; option = new UpdateOption&lt;BuriPathCB&gt;();
     * option.self(new SpecifyQuery&lt;BuriPathCB&gt;() {
     *     public void specify(BuriPathCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * buriPathBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(buriPath, cb, option);
     * </pre>
     * @param buriPath The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BuriPath. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BuriPath buriPath, BuriPathCB cb, UpdateOption<BuriPathCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(buriPath, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of BuriPath. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BuriPathCB cb, DeleteOption<BuriPathCB> option) {
        assertDeleteOptionNotNull(option);
        return doQueryDelete(cb, option);
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
    public OutsideSqlBasicExecutor<BuriPathBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(BuriPathCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(BuriPathCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends BuriPath> void delegateSelectCursor(BuriPathCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends BuriPath> List<ENTITY> delegateSelectList(BuriPathCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(BuriPath e, InsertOption<BuriPathCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(BuriPath e, UpdateOption<BuriPathCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(BuriPath e, UpdateOption<BuriPathCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(BuriPath e, DeleteOption<BuriPathCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(BuriPath e, DeleteOption<BuriPathCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<BuriPath> ls, InsertOption<BuriPathCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<BuriPath> ls, UpdateOption<BuriPathCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<BuriPath> ls, UpdateOption<BuriPathCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<BuriPath> ls, DeleteOption<BuriPathCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<BuriPath> ls, DeleteOption<BuriPathCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(BuriPath e, BuriPathCB inCB, ConditionBean resCB, InsertOption<BuriPathCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(BuriPath e, BuriPathCB cb, UpdateOption<BuriPathCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(BuriPathCB cb, DeleteOption<BuriPathCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

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
    protected BuriPath downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, BuriPath.class);
    }

    protected BuriPathCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, BuriPathCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<BuriPath> downcast(List<? extends Entity> entityList) {
        return (List<BuriPath>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<BuriPathCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<BuriPathCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<BuriPathCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<BuriPathCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<BuriPathCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<BuriPathCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<BuriPath, BuriPathCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<BuriPath, BuriPathCB>)option;
    }
}

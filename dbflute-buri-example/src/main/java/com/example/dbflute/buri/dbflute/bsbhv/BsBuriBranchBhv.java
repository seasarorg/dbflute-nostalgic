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
 * The behavior of BURIBRANCH as TABLE. <br />
 * {Buri Internal}
 * <pre>
 * [primary key]
 *     BRANCHID
 * 
 * [column]
 *     BRANCHID, PARENTBRANCHID, PATHID, DATAID, PROCESSDATE, BTID, VERSIONNO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     VERSIONNO
 * 
 * [foreign table]
 *     BURIDATA, BURIPATH
 * 
 * [referrer table]
 *     BURISTATE
 * 
 * [foreign property]
 *     buriData, buriPath
 * 
 * [referrer property]
 *     buriStateList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriBranchBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BURIBRANCH"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return BuriBranchDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BuriBranchDbm getMyDBMeta() { return BuriBranchDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BuriBranch newMyEntity() { return new BuriBranch(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BuriBranchCB newMyConditionBean() { return new BuriBranchCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BuriBranchCB cb = new BuriBranchCB();
     * cb.query().setFoo...(value);
     * int count = buriBranchBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BuriBranch. (NotNull)
     * @return The selected count.
     */
    public int selectCount(BuriBranchCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(BuriBranchCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(BuriBranchCB cb) { // called by selectPage(cb)
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
     * BuriBranchCB cb = new BuriBranchCB();
     * cb.query().setFoo...(value);
     * buriBranchBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;BuriBranch&gt;() {
     *     public void handle(BuriBranch entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of BuriBranch. (NotNull)
     * @param entityRowHandler The handler of entity row of BuriBranch. (NotNull)
     */
    public void selectCursor(BuriBranchCB cb, EntityRowHandler<BuriBranch> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, BuriBranch.class);
    }

    protected <ENTITY extends BuriBranch> void doSelectCursor(BuriBranchCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<BuriBranch>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * BuriBranchCB cb = new BuriBranchCB();
     * cb.query().setFoo...(value);
     * BuriBranch buriBranch = buriBranchBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (buriBranch != null) {
     *     ... = buriBranch.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BuriBranch. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriBranch selectEntity(BuriBranchCB cb) {
        return doSelectEntity(cb, BuriBranch.class);
    }

    protected <ENTITY extends BuriBranch> ENTITY doSelectEntity(final BuriBranchCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, BuriBranchCB>() {
            public List<ENTITY> callbackSelectList(BuriBranchCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * BuriBranchCB cb = new BuriBranchCB();
     * cb.query().setFoo...(value);
     * BuriBranch buriBranch = buriBranchBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = buriBranch.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BuriBranch. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriBranch selectEntityWithDeletedCheck(BuriBranchCB cb) {
        return doSelectEntityWithDeletedCheck(cb, BuriBranch.class);
    }

    protected <ENTITY extends BuriBranch> ENTITY doSelectEntityWithDeletedCheck(final BuriBranchCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, BuriBranchCB>() {
            public List<ENTITY> callbackSelectList(BuriBranchCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param branchId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriBranch selectByPKValue(Long branchId) {
        return doSelectByPKValue(branchId, BuriBranch.class);
    }

    protected <ENTITY extends BuriBranch> ENTITY doSelectByPKValue(Long branchId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(branchId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param branchId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriBranch selectByPKValueWithDeletedCheck(Long branchId) {
        return doSelectByPKValueWithDeletedCheck(branchId, BuriBranch.class);
    }

    protected <ENTITY extends BuriBranch> ENTITY doSelectByPKValueWithDeletedCheck(Long branchId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(branchId), entityType);
    }

    private BuriBranchCB buildPKCB(Long branchId) {
        assertObjectNotNull("branchId", branchId);
        BuriBranchCB cb = newMyConditionBean();
        cb.query().setBranchId_Equal(branchId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BuriBranchCB cb = new BuriBranchCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;BuriBranch&gt; buriBranchList = buriBranchBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (BuriBranch buriBranch : buriBranchList) {
     *     ... = buriBranch.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriBranch. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BuriBranch> selectList(BuriBranchCB cb) {
        return doSelectList(cb, BuriBranch.class);
    }

    protected <ENTITY extends BuriBranch> ListResultBean<ENTITY> doSelectList(BuriBranchCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, BuriBranchCB>() {
            public List<ENTITY> callbackSelectList(BuriBranchCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * BuriBranchCB cb = new BuriBranchCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BuriBranch&gt; page = buriBranchBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (BuriBranch buriBranch : page) {
     *     ... = buriBranch.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriBranch. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BuriBranch> selectPage(BuriBranchCB cb) {
        return doSelectPage(cb, BuriBranch.class);
    }

    protected <ENTITY extends BuriBranch> PagingResultBean<ENTITY> doSelectPage(BuriBranchCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, BuriBranchCB>() {
            public int callbackSelectCount(BuriBranchCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(BuriBranchCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * buriBranchBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(BuriBranchCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<BuriBranchCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends BuriBranchCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param buriBranch The entity of buriBranch. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriStateList(BuriBranch buriBranch, ConditionBeanSetupper<BuriStateCB> conditionBeanSetupper) {
        xassLRArg(buriBranch, conditionBeanSetupper);
        loadBuriStateList(xnewLRLs(buriBranch), conditionBeanSetupper);
    }
    /**
     * Load referrer of buriStateList with the set-upper for condition-bean of referrer. <br />
     * BURISTATE by your BRANCHID, named 'buriStateList'.
     * <pre>
     * buriBranchBhv.<span style="color: #FD4747">loadBuriStateList</span>(buriBranchList, new ConditionBeanSetupper&lt;BuriStateCB&gt;() {
     *     public void setup(BuriStateCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (BuriBranch buriBranch : buriBranchList) {
     *     ... = buriBranch.<span style="color: #FD4747">getBuriStateList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setBranchId_InScope(pkList);
     * cb.query().addOrderBy_BranchId_Asc();
     * </pre>
     * @param buriBranchList The entity list of buriBranch. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriStateList(List<BuriBranch> buriBranchList, ConditionBeanSetupper<BuriStateCB> conditionBeanSetupper) {
        xassLRArg(buriBranchList, conditionBeanSetupper);
        loadBuriStateList(buriBranchList, new LoadReferrerOption<BuriStateCB, BuriState>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param buriBranch The entity of buriBranch. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriStateList(BuriBranch buriBranch, LoadReferrerOption<BuriStateCB, BuriState> loadReferrerOption) {
        xassLRArg(buriBranch, loadReferrerOption);
        loadBuriStateList(xnewLRLs(buriBranch), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param buriBranchList The entity list of buriBranch. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriStateList(List<BuriBranch> buriBranchList, LoadReferrerOption<BuriStateCB, BuriState> loadReferrerOption) {
        xassLRArg(buriBranchList, loadReferrerOption);
        if (buriBranchList.isEmpty()) { return; }
        final BuriStateBhv referrerBhv = xgetBSFLR().select(BuriStateBhv.class);
        helpLoadReferrerInternally(buriBranchList, loadReferrerOption, new InternalLoadReferrerCallback<BuriBranch, Long, BuriStateCB, BuriState>() {
            public Long getPKVal(BuriBranch e)
            { return e.getBranchId(); }
            public void setRfLs(BuriBranch e, List<BuriState> ls)
            { e.setBuriStateList(ls); }
            public BuriStateCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(BuriStateCB cb, List<Long> ls)
            { cb.query().setBranchId_InScope(ls); }
            public void qyOdFKAsc(BuriStateCB cb) { cb.query().addOrderBy_BranchId_Asc(); }
            public void spFKCol(BuriStateCB cb) { cb.specify().columnBranchId(); }
            public List<BuriState> selRfLs(BuriStateCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(BuriState e) { return e.getBranchId(); }
            public void setlcEt(BuriState re, BuriBranch le)
            { re.setBuriBranch(le); }
            public String getRfPrNm() { return "buriStateList"; }
        });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'BuriData'.
     * @param buriBranchList The list of buriBranch. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<BuriData> pulloutBuriData(List<BuriBranch> buriBranchList) {
        return helpPulloutInternally(buriBranchList, new InternalPulloutCallback<BuriBranch, BuriData>() {
            public BuriData getFr(BuriBranch e) { return e.getBuriData(); }
            public boolean hasRf() { return true; }
            public void setRfLs(BuriData e, List<BuriBranch> ls)
            { e.setBuriBranchList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'BuriPath'.
     * @param buriBranchList The list of buriBranch. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<BuriPath> pulloutBuriPath(List<BuriBranch> buriBranchList) {
        return helpPulloutInternally(buriBranchList, new InternalPulloutCallback<BuriBranch, BuriPath>() {
            public BuriPath getFr(BuriBranch e) { return e.getBuriPath(); }
            public boolean hasRf() { return true; }
            public void setRfLs(BuriPath e, List<BuriBranch> ls)
            { e.setBuriBranchList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * BuriBranch buriBranch = new BuriBranch();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriBranch.setFoo...(value);
     * buriBranch.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriBranch.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriBranch.set...;</span>
     * buriBranchBhv.<span style="color: #FD4747">insert</span>(buriBranch);
     * ... = buriBranch.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriBranch The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(BuriBranch buriBranch) {
        doInsert(buriBranch, null);
    }

    protected void doInsert(BuriBranch buriBranch, InsertOption<BuriBranchCB> option) {
        assertObjectNotNull("buriBranch", buriBranch);
        prepareInsertOption(option);
        delegateInsert(buriBranch, option);
    }

    protected void prepareInsertOption(InsertOption<BuriBranchCB> option) {
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
     * BuriBranch buriBranch = new BuriBranch();
     * buriBranch.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriBranch.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriBranch.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriBranch.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriBranch.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriBranchBhv.<span style="color: #FD4747">update</span>(buriBranch);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriBranch The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final BuriBranch buriBranch) {
        doUpdate(buriBranch, null);
    }

    protected void doUpdate(BuriBranch buriBranch, final UpdateOption<BuriBranchCB> option) {
        assertObjectNotNull("buriBranch", buriBranch);
        prepareUpdateOption(option);
        helpUpdateInternally(buriBranch, new InternalUpdateCallback<BuriBranch>() {
            public int callbackDelegateUpdate(BuriBranch entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<BuriBranchCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected BuriBranchCB createCBForVaryingUpdate() {
        BuriBranchCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected BuriBranchCB createCBForSpecifiedUpdate() {
        BuriBranchCB cb = newMyConditionBean();
        cb.xsetupForSpecifiedUpdate();
        return cb;
    }

    @Override
    protected void doModify(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { update(downcast(entity)); }
        else { varyingUpdate(downcast(entity), downcast(option)); }
    }

    /**
     * Update the entity non-strictly modified-only. {UpdateCountZeroException, NonExclusiveControl}
     * <pre>
     * BuriBranch buriBranch = new BuriBranch();
     * buriBranch.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriBranch.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriBranch.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriBranch.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriBranch.setVersionNo(value);</span>
     * buriBranchBhv.<span style="color: #FD4747">updateNonstrict</span>(buriBranch);
     * </pre>
     * @param buriBranch The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final BuriBranch buriBranch) {
        doUpdateNonstrict(buriBranch, null);
    }

    protected void doUpdateNonstrict(BuriBranch buriBranch, final UpdateOption<BuriBranchCB> option) {
        assertObjectNotNull("buriBranch", buriBranch);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(buriBranch, new InternalUpdateNonstrictCallback<BuriBranch>() {
            public int callbackDelegateUpdateNonstrict(BuriBranch entity) { return delegateUpdateNonstrict(entity, option); } });
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { updateNonstrict(downcast(entity)); }
        else { varyingUpdateNonstrict(downcast(entity), downcast(option)); }
    }

    /**
     * Insert or update the entity modified-only. {ExclusiveControl(when update)}
     * @param buriBranch The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(BuriBranch buriBranch) {
        doInesrtOrUpdate(buriBranch, null, null);
    }

    protected void doInesrtOrUpdate(BuriBranch buriBranch, final InsertOption<BuriBranchCB> insertOption, final UpdateOption<BuriBranchCB> updateOption) {
        helpInsertOrUpdateInternally(buriBranch, new InternalInsertOrUpdateCallback<BuriBranch, BuriBranchCB>() {
            public void callbackInsert(BuriBranch entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(BuriBranch entity) { doUpdate(entity, updateOption); }
            public BuriBranchCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(BuriBranchCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<BuriBranchCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<BuriBranchCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonExclusiveControl(when update)}
     * @param buriBranch The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(BuriBranch buriBranch) {
        doInesrtOrUpdateNonstrict(buriBranch, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(BuriBranch buriBranch, final InsertOption<BuriBranchCB> insertOption, final UpdateOption<BuriBranchCB> updateOption) {
        helpInsertOrUpdateInternally(buriBranch, new InternalInsertOrUpdateNonstrictCallback<BuriBranch>() {
            public void callbackInsert(BuriBranch entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(BuriBranch entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<BuriBranchCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<BuriBranchCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * BuriBranch buriBranch = new BuriBranch();
     * buriBranch.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriBranch.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriBranchBhv.<span style="color: #FD4747">delete</span>(buriBranch);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriBranch The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BuriBranch buriBranch) {
        doDelete(buriBranch, null);
    }

    protected void doDelete(BuriBranch buriBranch, final DeleteOption<BuriBranchCB> option) {
        assertObjectNotNull("buriBranch", buriBranch);
        prepareDeleteOption(option);
        helpDeleteInternally(buriBranch, new InternalDeleteCallback<BuriBranch>() {
            public int callbackDelegateDelete(BuriBranch entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<BuriBranchCB> option) {
        if (option == null) { return; }
        assertDeleteOptionStatus(option);
    }

    @Override
    protected void doRemove(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { delete(downcast(entity)); }
        else { varyingDelete(downcast(entity), downcast(option)); }
    }

    /**
     * Delete the entity non-strictly. {UpdateCountZeroException, NonExclusiveControl}
     * <pre>
     * BuriBranch buriBranch = new BuriBranch();
     * buriBranch.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriBranch.setVersionNo(value);</span>
     * buriBranchBhv.<span style="color: #FD4747">deleteNonstrict</span>(buriBranch);
     * </pre>
     * @param buriBranch The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BuriBranch buriBranch) {
        doDeleteNonstrict(buriBranch, null);
    }

    protected void doDeleteNonstrict(BuriBranch buriBranch, final DeleteOption<BuriBranchCB> option) {
        assertObjectNotNull("buriBranch", buriBranch);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(buriBranch, new InternalDeleteNonstrictCallback<BuriBranch>() {
            public int callbackDelegateDeleteNonstrict(BuriBranch entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonExclusiveControl}
     * <pre>
     * BuriBranch buriBranch = new BuriBranch();
     * buriBranch.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriBranch.setVersionNo(value);</span>
     * buriBranchBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(buriBranch);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param buriBranch The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BuriBranch buriBranch) {
        doDeleteNonstrictIgnoreDeleted(buriBranch, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BuriBranch buriBranch, final DeleteOption<BuriBranchCB> option) {
        assertObjectNotNull("buriBranch", buriBranch);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(buriBranch, new InternalDeleteNonstrictIgnoreDeletedCallback<BuriBranch>() {
            public int callbackDelegateDeleteNonstrict(BuriBranch entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    @Override
    protected void doRemoveNonstrict(Entity entity, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { deleteNonstrict(downcast(entity)); }
        else { varyingDeleteNonstrict(downcast(entity), downcast(option)); }
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
     * @param buriBranchList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<BuriBranch> buriBranchList) {
        return doBatchInsert(buriBranchList, null);
    }

    protected int[] doBatchInsert(List<BuriBranch> buriBranchList, InsertOption<BuriBranchCB> option) {
        assertObjectNotNull("buriBranchList", buriBranchList);
        prepareInsertOption(option);
        return delegateBatchInsert(buriBranchList, option);
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
     * @param buriBranchList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BuriBranch> buriBranchList) {
        return doBatchUpdate(buriBranchList, null);
    }

    protected int[] doBatchUpdate(List<BuriBranch> buriBranchList, UpdateOption<BuriBranchCB> option) {
        assertObjectNotNull("buriBranchList", buriBranchList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(buriBranchList, option);
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
     * @param buriBranchList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BuriBranch> buriBranchList, SpecifyQuery<BuriBranchCB> updateColumnSpec) {
        return doBatchUpdate(buriBranchList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are update target. {NOT modified only}
     * @param buriBranchList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<BuriBranch> buriBranchList) {
        return doBatchUpdateNonstrict(buriBranchList, null);
    }

    protected int[] doBatchUpdateNonstrict(List<BuriBranch> buriBranchList, UpdateOption<BuriBranchCB> option) {
        assertObjectNotNull("buriBranchList", buriBranchList);
        prepareUpdateOption(option);
        return delegateBatchUpdateNonstrict(buriBranchList, option);
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistick lock column because they are specified implicitly.
     * @param buriBranchList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<BuriBranch> buriBranchList, SpecifyQuery<BuriBranchCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(buriBranchList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param buriBranchList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BuriBranch> buriBranchList) {
        return doBatchDelete(buriBranchList, null);
    }

    protected int[] doBatchDelete(List<BuriBranch> buriBranchList, DeleteOption<BuriBranchCB> option) {
        assertObjectNotNull("buriBranchList", buriBranchList);
        prepareDeleteOption(option);
        return delegateBatchDelete(buriBranchList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param buriBranchList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<BuriBranch> buriBranchList) {
        return doBatchDeleteNonstrict(buriBranchList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<BuriBranch> buriBranchList, DeleteOption<BuriBranchCB> option) {
        assertObjectNotNull("buriBranchList", buriBranchList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(buriBranchList, option);
    }

    @Override
    protected int[] doLumpRemoveNonstrict(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDeleteNonstrict(downcast(ls)); }
        else { return varyingBatchDeleteNonstrict(downcast(ls), downcast(option)); }
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * buriBranchBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;BuriBranch, BuriBranchCB&gt;() {
     *     public ConditionBean setup(buriBranch entity, BuriBranchCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BuriBranch, BuriBranchCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<BuriBranch, BuriBranchCB> setupper, InsertOption<BuriBranchCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        BuriBranch entity = new BuriBranch();
        BuriBranchCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected BuriBranchCB createCBForQueryInsert() {
        BuriBranchCB cb = newMyConditionBean();
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
     * BuriBranch buriBranch = new BuriBranch();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriBranch.setPK...(value);</span>
     * buriBranch.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriBranch.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriBranch.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriBranch.setVersionNo(value);</span>
     * BuriBranchCB cb = new BuriBranchCB();
     * cb.query().setFoo...(value);
     * buriBranchBhv.<span style="color: #FD4747">queryUpdate</span>(buriBranch, cb);
     * </pre>
     * @param buriBranch The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BuriBranch. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BuriBranch buriBranch, BuriBranchCB cb) {
        return doQueryUpdate(buriBranch, cb, null);
    }

    protected int doQueryUpdate(BuriBranch buriBranch, BuriBranchCB cb, UpdateOption<BuriBranchCB> option) {
        assertObjectNotNull("buriBranch", buriBranch); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(buriBranch, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (BuriBranchCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (BuriBranchCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * BuriBranchCB cb = new BuriBranchCB();
     * cb.query().setFoo...(value);
     * buriBranchBhv.<span style="color: #FD4747">queryDelete</span>(buriBranch, cb);
     * </pre>
     * @param cb The condition-bean of BuriBranch. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BuriBranchCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(BuriBranchCB cb, DeleteOption<BuriBranchCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((BuriBranchCB)cb); }
        else { return varyingQueryDelete((BuriBranchCB)cb, downcast(option)); }
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
     * BuriBranch buriBranch = new BuriBranch();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriBranch.setFoo...(value);
     * buriBranch.setBar...(value);
     * InsertOption<BuriBranchCB> option = new InsertOption<BuriBranchCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * buriBranchBhv.<span style="color: #FD4747">varyingInsert</span>(buriBranch, option);
     * ... = buriBranch.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriBranch The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(BuriBranch buriBranch, InsertOption<BuriBranchCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(buriBranch, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * BuriBranch buriBranch = new BuriBranch();
     * buriBranch.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriBranch.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriBranch.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;BuriBranchCB&gt; option = new UpdateOption&lt;BuriBranchCB&gt;();
     *     option.self(new SpecifyQuery&lt;BuriBranchCB&gt;() {
     *         public void specify(BuriBranchCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     buriBranchBhv.<span style="color: #FD4747">varyingUpdate</span>(buriBranch, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param buriBranch The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(BuriBranch buriBranch, UpdateOption<BuriBranchCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(buriBranch, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. {UpdateCountZeroException, NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BuriBranch buriBranch = new BuriBranch();
     * buriBranch.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriBranch.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriBranch.setVersionNo(value);</span>
     * UpdateOption&lt;BuriBranchCB&gt; option = new UpdateOption&lt;BuriBranchCB&gt;();
     * option.self(new SpecifyQuery&lt;BuriBranchCB&gt;() {
     *     public void specify(BuriBranchCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * buriBranchBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(buriBranch, option);
     * </pre>
     * @param buriBranch The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdateNonstrict(BuriBranch buriBranch, UpdateOption<BuriBranchCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(buriBranch, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param buriBranch The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(BuriBranch buriBranch, InsertOption<BuriBranchCB> insertOption, UpdateOption<BuriBranchCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(buriBranch, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. {NonExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param buriBranch The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdateNonstrict(BuriBranch buriBranch, InsertOption<BuriBranchCB> insertOption, UpdateOption<BuriBranchCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(buriBranch, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param buriBranch The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BuriBranch buriBranch, DeleteOption<BuriBranchCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(buriBranch, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. {UpdateCountZeroException, NonExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param buriBranch The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BuriBranch buriBranch, DeleteOption<BuriBranchCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(buriBranch, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param buriBranchList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<BuriBranch> buriBranchList, InsertOption<BuriBranchCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(buriBranchList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param buriBranchList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<BuriBranch> buriBranchList, UpdateOption<BuriBranchCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(buriBranchList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param buriBranchList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdateNonstrict(List<BuriBranch> buriBranchList, UpdateOption<BuriBranchCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(buriBranchList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param buriBranchList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<BuriBranch> buriBranchList, DeleteOption<BuriBranchCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(buriBranchList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param buriBranchList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDeleteNonstrict(List<BuriBranch> buriBranchList, DeleteOption<BuriBranchCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(buriBranchList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<BuriBranch, BuriBranchCB> setupper, InsertOption<BuriBranchCB> option) {
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
     * BuriBranch buriBranch = new BuriBranch();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriBranch.setPK...(value);</span>
     * buriBranch.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriBranch.setVersionNo(value);</span>
     * BuriBranchCB cb = new BuriBranchCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;BuriBranchCB&gt; option = new UpdateOption&lt;BuriBranchCB&gt;();
     * option.self(new SpecifyQuery&lt;BuriBranchCB&gt;() {
     *     public void specify(BuriBranchCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * buriBranchBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(buriBranch, cb, option);
     * </pre>
     * @param buriBranch The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BuriBranch. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BuriBranch buriBranch, BuriBranchCB cb, UpdateOption<BuriBranchCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(buriBranch, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of BuriBranch. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BuriBranchCB cb, DeleteOption<BuriBranchCB> option) {
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
    public OutsideSqlBasicExecutor<BuriBranchBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(BuriBranchCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(BuriBranchCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends BuriBranch> void delegateSelectCursor(BuriBranchCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends BuriBranch> List<ENTITY> delegateSelectList(BuriBranchCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(BuriBranch e, InsertOption<BuriBranchCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(BuriBranch e, UpdateOption<BuriBranchCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(BuriBranch e, UpdateOption<BuriBranchCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(BuriBranch e, DeleteOption<BuriBranchCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(BuriBranch e, DeleteOption<BuriBranchCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<BuriBranch> ls, InsertOption<BuriBranchCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<BuriBranch> ls, UpdateOption<BuriBranchCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<BuriBranch> ls, UpdateOption<BuriBranchCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<BuriBranch> ls, DeleteOption<BuriBranchCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<BuriBranch> ls, DeleteOption<BuriBranchCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(BuriBranch e, BuriBranchCB inCB, ConditionBean resCB, InsertOption<BuriBranchCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(BuriBranch e, BuriBranchCB cb, UpdateOption<BuriBranchCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(BuriBranchCB cb, DeleteOption<BuriBranchCB> op)
    { if (!processBeforeQueryDelete(cb, op)) { return 0; } return invoke(createQueryDeleteCBCommand(cb, op));  }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return !(downcast(entity).getVersionNo() + "").equals("null");// For primitive type
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
    protected BuriBranch downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, BuriBranch.class);
    }

    protected BuriBranchCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, BuriBranchCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<BuriBranch> downcast(List<? extends Entity> entityList) {
        return (List<BuriBranch>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<BuriBranchCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<BuriBranchCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<BuriBranchCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<BuriBranchCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<BuriBranchCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<BuriBranchCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<BuriBranch, BuriBranchCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<BuriBranch, BuriBranchCB>)option;
    }
}

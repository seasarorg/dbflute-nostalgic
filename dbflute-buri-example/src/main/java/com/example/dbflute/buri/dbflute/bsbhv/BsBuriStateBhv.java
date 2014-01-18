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
 * The behavior of BURISTATE as TABLE. <br />
 * {Buri Internal}
 * <pre>
 * [primary key]
 *     STATEID
 * 
 * [column]
 *     STATEID, PATHID, DATAID, BRANCHID, USERIDVAL, USERIDNUM, PARTICIPANTNAME, PARTICIPANTTYPE, BTID, INSERTDATE, AUTORUNTIME, PROCESSDATE, ABORTDATE, VERSIONNO
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
 *     BURIPATH, BURIDATA, BURIBRANCH
 * 
 * [referrer table]
 *     BURISTATEUSER
 * 
 * [foreign property]
 *     buriPath, buriData, buriBranch
 * 
 * [referrer property]
 *     buriStateUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriStateBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BURISTATE"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return BuriStateDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BuriStateDbm getMyDBMeta() { return BuriStateDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BuriState newMyEntity() { return new BuriState(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BuriStateCB newMyConditionBean() { return new BuriStateCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BuriStateCB cb = new BuriStateCB();
     * cb.query().setFoo...(value);
     * int count = buriStateBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BuriState. (NotNull)
     * @return The selected count.
     */
    public int selectCount(BuriStateCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(BuriStateCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(BuriStateCB cb) { // called by selectPage(cb)
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
     * BuriStateCB cb = new BuriStateCB();
     * cb.query().setFoo...(value);
     * buriStateBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;BuriState&gt;() {
     *     public void handle(BuriState entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of BuriState. (NotNull)
     * @param entityRowHandler The handler of entity row of BuriState. (NotNull)
     */
    public void selectCursor(BuriStateCB cb, EntityRowHandler<BuriState> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, BuriState.class);
    }

    protected <ENTITY extends BuriState> void doSelectCursor(BuriStateCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<BuriState>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * BuriStateCB cb = new BuriStateCB();
     * cb.query().setFoo...(value);
     * BuriState buriState = buriStateBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (buriState != null) {
     *     ... = buriState.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BuriState. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriState selectEntity(BuriStateCB cb) {
        return doSelectEntity(cb, BuriState.class);
    }

    protected <ENTITY extends BuriState> ENTITY doSelectEntity(final BuriStateCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, BuriStateCB>() {
            public List<ENTITY> callbackSelectList(BuriStateCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * BuriStateCB cb = new BuriStateCB();
     * cb.query().setFoo...(value);
     * BuriState buriState = buriStateBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = buriState.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BuriState. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriState selectEntityWithDeletedCheck(BuriStateCB cb) {
        return doSelectEntityWithDeletedCheck(cb, BuriState.class);
    }

    protected <ENTITY extends BuriState> ENTITY doSelectEntityWithDeletedCheck(final BuriStateCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, BuriStateCB>() {
            public List<ENTITY> callbackSelectList(BuriStateCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param stateId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriState selectByPKValue(Long stateId) {
        return doSelectByPKValue(stateId, BuriState.class);
    }

    protected <ENTITY extends BuriState> ENTITY doSelectByPKValue(Long stateId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(stateId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param stateId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriState selectByPKValueWithDeletedCheck(Long stateId) {
        return doSelectByPKValueWithDeletedCheck(stateId, BuriState.class);
    }

    protected <ENTITY extends BuriState> ENTITY doSelectByPKValueWithDeletedCheck(Long stateId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(stateId), entityType);
    }

    private BuriStateCB buildPKCB(Long stateId) {
        assertObjectNotNull("stateId", stateId);
        BuriStateCB cb = newMyConditionBean();
        cb.query().setStateId_Equal(stateId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BuriStateCB cb = new BuriStateCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;BuriState&gt; buriStateList = buriStateBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (BuriState buriState : buriStateList) {
     *     ... = buriState.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriState. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BuriState> selectList(BuriStateCB cb) {
        return doSelectList(cb, BuriState.class);
    }

    protected <ENTITY extends BuriState> ListResultBean<ENTITY> doSelectList(BuriStateCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, BuriStateCB>() {
            public List<ENTITY> callbackSelectList(BuriStateCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * BuriStateCB cb = new BuriStateCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BuriState&gt; page = buriStateBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (BuriState buriState : page) {
     *     ... = buriState.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriState. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BuriState> selectPage(BuriStateCB cb) {
        return doSelectPage(cb, BuriState.class);
    }

    protected <ENTITY extends BuriState> PagingResultBean<ENTITY> doSelectPage(BuriStateCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, BuriStateCB>() {
            public int callbackSelectCount(BuriStateCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(BuriStateCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * buriStateBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(BuriStateCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<BuriStateCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends BuriStateCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param buriState The entity of buriState. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriStateUserList(BuriState buriState, ConditionBeanSetupper<BuriStateUserCB> conditionBeanSetupper) {
        xassLRArg(buriState, conditionBeanSetupper);
        loadBuriStateUserList(xnewLRLs(buriState), conditionBeanSetupper);
    }
    /**
     * Load referrer of buriStateUserList with the set-upper for condition-bean of referrer. <br />
     * BURISTATEUSER by your STATEID, named 'buriStateUserList'.
     * <pre>
     * buriStateBhv.<span style="color: #FD4747">loadBuriStateUserList</span>(buriStateList, new ConditionBeanSetupper&lt;BuriStateUserCB&gt;() {
     *     public void setup(BuriStateUserCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (BuriState buriState : buriStateList) {
     *     ... = buriState.<span style="color: #FD4747">getBuriStateUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setStateId_InScope(pkList);
     * cb.query().addOrderBy_StateId_Asc();
     * </pre>
     * @param buriStateList The entity list of buriState. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriStateUserList(List<BuriState> buriStateList, ConditionBeanSetupper<BuriStateUserCB> conditionBeanSetupper) {
        xassLRArg(buriStateList, conditionBeanSetupper);
        loadBuriStateUserList(buriStateList, new LoadReferrerOption<BuriStateUserCB, BuriStateUser>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param buriState The entity of buriState. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriStateUserList(BuriState buriState, LoadReferrerOption<BuriStateUserCB, BuriStateUser> loadReferrerOption) {
        xassLRArg(buriState, loadReferrerOption);
        loadBuriStateUserList(xnewLRLs(buriState), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param buriStateList The entity list of buriState. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriStateUserList(List<BuriState> buriStateList, LoadReferrerOption<BuriStateUserCB, BuriStateUser> loadReferrerOption) {
        xassLRArg(buriStateList, loadReferrerOption);
        if (buriStateList.isEmpty()) { return; }
        final BuriStateUserBhv referrerBhv = xgetBSFLR().select(BuriStateUserBhv.class);
        helpLoadReferrerInternally(buriStateList, loadReferrerOption, new InternalLoadReferrerCallback<BuriState, Long, BuriStateUserCB, BuriStateUser>() {
            public Long getPKVal(BuriState e)
            { return e.getStateId(); }
            public void setRfLs(BuriState e, List<BuriStateUser> ls)
            { e.setBuriStateUserList(ls); }
            public BuriStateUserCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(BuriStateUserCB cb, List<Long> ls)
            { cb.query().setStateId_InScope(ls); }
            public void qyOdFKAsc(BuriStateUserCB cb) { cb.query().addOrderBy_StateId_Asc(); }
            public void spFKCol(BuriStateUserCB cb) { cb.specify().columnStateId(); }
            public List<BuriStateUser> selRfLs(BuriStateUserCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(BuriStateUser e) { return e.getStateId(); }
            public void setlcEt(BuriStateUser re, BuriState le)
            { re.setBuriState(le); }
            public String getRfPrNm() { return "buriStateUserList"; }
        });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'BuriPath'.
     * @param buriStateList The list of buriState. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<BuriPath> pulloutBuriPath(List<BuriState> buriStateList) {
        return helpPulloutInternally(buriStateList, new InternalPulloutCallback<BuriState, BuriPath>() {
            public BuriPath getFr(BuriState e) { return e.getBuriPath(); }
            public boolean hasRf() { return true; }
            public void setRfLs(BuriPath e, List<BuriState> ls)
            { e.setBuriStateList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'BuriData'.
     * @param buriStateList The list of buriState. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<BuriData> pulloutBuriData(List<BuriState> buriStateList) {
        return helpPulloutInternally(buriStateList, new InternalPulloutCallback<BuriState, BuriData>() {
            public BuriData getFr(BuriState e) { return e.getBuriData(); }
            public boolean hasRf() { return true; }
            public void setRfLs(BuriData e, List<BuriState> ls)
            { e.setBuriStateList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'BuriBranch'.
     * @param buriStateList The list of buriState. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<BuriBranch> pulloutBuriBranch(List<BuriState> buriStateList) {
        return helpPulloutInternally(buriStateList, new InternalPulloutCallback<BuriState, BuriBranch>() {
            public BuriBranch getFr(BuriState e) { return e.getBuriBranch(); }
            public boolean hasRf() { return true; }
            public void setRfLs(BuriBranch e, List<BuriState> ls)
            { e.setBuriStateList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * BuriState buriState = new BuriState();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriState.setFoo...(value);
     * buriState.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriState.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriState.set...;</span>
     * buriStateBhv.<span style="color: #FD4747">insert</span>(buriState);
     * ... = buriState.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriState The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(BuriState buriState) {
        doInsert(buriState, null);
    }

    protected void doInsert(BuriState buriState, InsertOption<BuriStateCB> option) {
        assertObjectNotNull("buriState", buriState);
        prepareInsertOption(option);
        delegateInsert(buriState, option);
    }

    protected void prepareInsertOption(InsertOption<BuriStateCB> option) {
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
     * BuriState buriState = new BuriState();
     * buriState.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriState.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriState.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriState.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriState.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriStateBhv.<span style="color: #FD4747">update</span>(buriState);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriState The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final BuriState buriState) {
        doUpdate(buriState, null);
    }

    protected void doUpdate(BuriState buriState, final UpdateOption<BuriStateCB> option) {
        assertObjectNotNull("buriState", buriState);
        prepareUpdateOption(option);
        helpUpdateInternally(buriState, new InternalUpdateCallback<BuriState>() {
            public int callbackDelegateUpdate(BuriState entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<BuriStateCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected BuriStateCB createCBForVaryingUpdate() {
        BuriStateCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected BuriStateCB createCBForSpecifiedUpdate() {
        BuriStateCB cb = newMyConditionBean();
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
     * BuriState buriState = new BuriState();
     * buriState.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriState.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriState.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriState.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriState.setVersionNo(value);</span>
     * buriStateBhv.<span style="color: #FD4747">updateNonstrict</span>(buriState);
     * </pre>
     * @param buriState The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final BuriState buriState) {
        doUpdateNonstrict(buriState, null);
    }

    protected void doUpdateNonstrict(BuriState buriState, final UpdateOption<BuriStateCB> option) {
        assertObjectNotNull("buriState", buriState);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(buriState, new InternalUpdateNonstrictCallback<BuriState>() {
            public int callbackDelegateUpdateNonstrict(BuriState entity) { return delegateUpdateNonstrict(entity, option); } });
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { updateNonstrict(downcast(entity)); }
        else { varyingUpdateNonstrict(downcast(entity), downcast(option)); }
    }

    /**
     * Insert or update the entity modified-only. {ExclusiveControl(when update)}
     * @param buriState The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(BuriState buriState) {
        doInesrtOrUpdate(buriState, null, null);
    }

    protected void doInesrtOrUpdate(BuriState buriState, final InsertOption<BuriStateCB> insertOption, final UpdateOption<BuriStateCB> updateOption) {
        helpInsertOrUpdateInternally(buriState, new InternalInsertOrUpdateCallback<BuriState, BuriStateCB>() {
            public void callbackInsert(BuriState entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(BuriState entity) { doUpdate(entity, updateOption); }
            public BuriStateCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(BuriStateCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<BuriStateCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<BuriStateCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonExclusiveControl(when update)}
     * @param buriState The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(BuriState buriState) {
        doInesrtOrUpdateNonstrict(buriState, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(BuriState buriState, final InsertOption<BuriStateCB> insertOption, final UpdateOption<BuriStateCB> updateOption) {
        helpInsertOrUpdateInternally(buriState, new InternalInsertOrUpdateNonstrictCallback<BuriState>() {
            public void callbackInsert(BuriState entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(BuriState entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<BuriStateCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<BuriStateCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * BuriState buriState = new BuriState();
     * buriState.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriState.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriStateBhv.<span style="color: #FD4747">delete</span>(buriState);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriState The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BuriState buriState) {
        doDelete(buriState, null);
    }

    protected void doDelete(BuriState buriState, final DeleteOption<BuriStateCB> option) {
        assertObjectNotNull("buriState", buriState);
        prepareDeleteOption(option);
        helpDeleteInternally(buriState, new InternalDeleteCallback<BuriState>() {
            public int callbackDelegateDelete(BuriState entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<BuriStateCB> option) {
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
     * BuriState buriState = new BuriState();
     * buriState.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriState.setVersionNo(value);</span>
     * buriStateBhv.<span style="color: #FD4747">deleteNonstrict</span>(buriState);
     * </pre>
     * @param buriState The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BuriState buriState) {
        doDeleteNonstrict(buriState, null);
    }

    protected void doDeleteNonstrict(BuriState buriState, final DeleteOption<BuriStateCB> option) {
        assertObjectNotNull("buriState", buriState);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(buriState, new InternalDeleteNonstrictCallback<BuriState>() {
            public int callbackDelegateDeleteNonstrict(BuriState entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonExclusiveControl}
     * <pre>
     * BuriState buriState = new BuriState();
     * buriState.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriState.setVersionNo(value);</span>
     * buriStateBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(buriState);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param buriState The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BuriState buriState) {
        doDeleteNonstrictIgnoreDeleted(buriState, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BuriState buriState, final DeleteOption<BuriStateCB> option) {
        assertObjectNotNull("buriState", buriState);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(buriState, new InternalDeleteNonstrictIgnoreDeletedCallback<BuriState>() {
            public int callbackDelegateDeleteNonstrict(BuriState entity) { return delegateDeleteNonstrict(entity, option); } });
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
     * @param buriStateList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<BuriState> buriStateList) {
        return doBatchInsert(buriStateList, null);
    }

    protected int[] doBatchInsert(List<BuriState> buriStateList, InsertOption<BuriStateCB> option) {
        assertObjectNotNull("buriStateList", buriStateList);
        prepareInsertOption(option);
        return delegateBatchInsert(buriStateList, option);
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
     * @param buriStateList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BuriState> buriStateList) {
        return doBatchUpdate(buriStateList, null);
    }

    protected int[] doBatchUpdate(List<BuriState> buriStateList, UpdateOption<BuriStateCB> option) {
        assertObjectNotNull("buriStateList", buriStateList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(buriStateList, option);
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
     * @param buriStateList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BuriState> buriStateList, SpecifyQuery<BuriStateCB> updateColumnSpec) {
        return doBatchUpdate(buriStateList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are update target. {NOT modified only}
     * @param buriStateList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<BuriState> buriStateList) {
        return doBatchUpdateNonstrict(buriStateList, null);
    }

    protected int[] doBatchUpdateNonstrict(List<BuriState> buriStateList, UpdateOption<BuriStateCB> option) {
        assertObjectNotNull("buriStateList", buriStateList);
        prepareUpdateOption(option);
        return delegateBatchUpdateNonstrict(buriStateList, option);
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistick lock column because they are specified implicitly.
     * @param buriStateList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<BuriState> buriStateList, SpecifyQuery<BuriStateCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(buriStateList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param buriStateList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BuriState> buriStateList) {
        return doBatchDelete(buriStateList, null);
    }

    protected int[] doBatchDelete(List<BuriState> buriStateList, DeleteOption<BuriStateCB> option) {
        assertObjectNotNull("buriStateList", buriStateList);
        prepareDeleteOption(option);
        return delegateBatchDelete(buriStateList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param buriStateList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<BuriState> buriStateList) {
        return doBatchDeleteNonstrict(buriStateList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<BuriState> buriStateList, DeleteOption<BuriStateCB> option) {
        assertObjectNotNull("buriStateList", buriStateList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(buriStateList, option);
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
     * buriStateBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;BuriState, BuriStateCB&gt;() {
     *     public ConditionBean setup(buriState entity, BuriStateCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BuriState, BuriStateCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<BuriState, BuriStateCB> setupper, InsertOption<BuriStateCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        BuriState entity = new BuriState();
        BuriStateCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected BuriStateCB createCBForQueryInsert() {
        BuriStateCB cb = newMyConditionBean();
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
     * BuriState buriState = new BuriState();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriState.setPK...(value);</span>
     * buriState.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriState.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriState.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriState.setVersionNo(value);</span>
     * BuriStateCB cb = new BuriStateCB();
     * cb.query().setFoo...(value);
     * buriStateBhv.<span style="color: #FD4747">queryUpdate</span>(buriState, cb);
     * </pre>
     * @param buriState The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BuriState. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BuriState buriState, BuriStateCB cb) {
        return doQueryUpdate(buriState, cb, null);
    }

    protected int doQueryUpdate(BuriState buriState, BuriStateCB cb, UpdateOption<BuriStateCB> option) {
        assertObjectNotNull("buriState", buriState); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(buriState, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (BuriStateCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (BuriStateCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * BuriStateCB cb = new BuriStateCB();
     * cb.query().setFoo...(value);
     * buriStateBhv.<span style="color: #FD4747">queryDelete</span>(buriState, cb);
     * </pre>
     * @param cb The condition-bean of BuriState. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BuriStateCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(BuriStateCB cb, DeleteOption<BuriStateCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((BuriStateCB)cb); }
        else { return varyingQueryDelete((BuriStateCB)cb, downcast(option)); }
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
     * BuriState buriState = new BuriState();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriState.setFoo...(value);
     * buriState.setBar...(value);
     * InsertOption<BuriStateCB> option = new InsertOption<BuriStateCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * buriStateBhv.<span style="color: #FD4747">varyingInsert</span>(buriState, option);
     * ... = buriState.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriState The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(BuriState buriState, InsertOption<BuriStateCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(buriState, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * BuriState buriState = new BuriState();
     * buriState.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriState.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriState.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;BuriStateCB&gt; option = new UpdateOption&lt;BuriStateCB&gt;();
     *     option.self(new SpecifyQuery&lt;BuriStateCB&gt;() {
     *         public void specify(BuriStateCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     buriStateBhv.<span style="color: #FD4747">varyingUpdate</span>(buriState, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param buriState The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(BuriState buriState, UpdateOption<BuriStateCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(buriState, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. {UpdateCountZeroException, NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BuriState buriState = new BuriState();
     * buriState.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriState.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriState.setVersionNo(value);</span>
     * UpdateOption&lt;BuriStateCB&gt; option = new UpdateOption&lt;BuriStateCB&gt;();
     * option.self(new SpecifyQuery&lt;BuriStateCB&gt;() {
     *     public void specify(BuriStateCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * buriStateBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(buriState, option);
     * </pre>
     * @param buriState The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdateNonstrict(BuriState buriState, UpdateOption<BuriStateCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(buriState, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param buriState The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(BuriState buriState, InsertOption<BuriStateCB> insertOption, UpdateOption<BuriStateCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(buriState, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. {NonExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param buriState The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdateNonstrict(BuriState buriState, InsertOption<BuriStateCB> insertOption, UpdateOption<BuriStateCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(buriState, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param buriState The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BuriState buriState, DeleteOption<BuriStateCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(buriState, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. {UpdateCountZeroException, NonExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param buriState The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BuriState buriState, DeleteOption<BuriStateCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(buriState, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param buriStateList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<BuriState> buriStateList, InsertOption<BuriStateCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(buriStateList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param buriStateList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<BuriState> buriStateList, UpdateOption<BuriStateCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(buriStateList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param buriStateList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdateNonstrict(List<BuriState> buriStateList, UpdateOption<BuriStateCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(buriStateList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param buriStateList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<BuriState> buriStateList, DeleteOption<BuriStateCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(buriStateList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param buriStateList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDeleteNonstrict(List<BuriState> buriStateList, DeleteOption<BuriStateCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(buriStateList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<BuriState, BuriStateCB> setupper, InsertOption<BuriStateCB> option) {
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
     * BuriState buriState = new BuriState();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriState.setPK...(value);</span>
     * buriState.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriState.setVersionNo(value);</span>
     * BuriStateCB cb = new BuriStateCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;BuriStateCB&gt; option = new UpdateOption&lt;BuriStateCB&gt;();
     * option.self(new SpecifyQuery&lt;BuriStateCB&gt;() {
     *     public void specify(BuriStateCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * buriStateBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(buriState, cb, option);
     * </pre>
     * @param buriState The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BuriState. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BuriState buriState, BuriStateCB cb, UpdateOption<BuriStateCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(buriState, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of BuriState. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BuriStateCB cb, DeleteOption<BuriStateCB> option) {
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
    public OutsideSqlBasicExecutor<BuriStateBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(BuriStateCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(BuriStateCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends BuriState> void delegateSelectCursor(BuriStateCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends BuriState> List<ENTITY> delegateSelectList(BuriStateCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(BuriState e, InsertOption<BuriStateCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(BuriState e, UpdateOption<BuriStateCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(BuriState e, UpdateOption<BuriStateCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(BuriState e, DeleteOption<BuriStateCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(BuriState e, DeleteOption<BuriStateCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<BuriState> ls, InsertOption<BuriStateCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<BuriState> ls, UpdateOption<BuriStateCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<BuriState> ls, UpdateOption<BuriStateCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<BuriState> ls, DeleteOption<BuriStateCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<BuriState> ls, DeleteOption<BuriStateCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(BuriState e, BuriStateCB inCB, ConditionBean resCB, InsertOption<BuriStateCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(BuriState e, BuriStateCB cb, UpdateOption<BuriStateCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(BuriStateCB cb, DeleteOption<BuriStateCB> op)
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
    protected BuriState downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, BuriState.class);
    }

    protected BuriStateCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, BuriStateCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<BuriState> downcast(List<? extends Entity> entityList) {
        return (List<BuriState>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<BuriStateCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<BuriStateCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<BuriStateCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<BuriStateCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<BuriStateCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<BuriStateCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<BuriState, BuriStateCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<BuriState, BuriStateCB>)option;
    }
}

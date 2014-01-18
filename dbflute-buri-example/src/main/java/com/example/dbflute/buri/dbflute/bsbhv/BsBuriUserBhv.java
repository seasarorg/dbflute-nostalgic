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
 * The behavior of BURIUSER as TABLE. <br />
 * {Buri Internal}
 * <pre>
 * [primary key]
 *     BURIUSERID
 * 
 * [column]
 *     BURIUSERID, USERIDVAL, USERIDNUM
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
 *     BURISTATEUSER
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     buriStateUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriUserBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BURIUSER"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return BuriUserDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BuriUserDbm getMyDBMeta() { return BuriUserDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BuriUser newMyEntity() { return new BuriUser(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BuriUserCB newMyConditionBean() { return new BuriUserCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BuriUserCB cb = new BuriUserCB();
     * cb.query().setFoo...(value);
     * int count = buriUserBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BuriUser. (NotNull)
     * @return The selected count.
     */
    public int selectCount(BuriUserCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(BuriUserCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(BuriUserCB cb) { // called by selectPage(cb)
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
     * BuriUserCB cb = new BuriUserCB();
     * cb.query().setFoo...(value);
     * buriUserBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;BuriUser&gt;() {
     *     public void handle(BuriUser entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of BuriUser. (NotNull)
     * @param entityRowHandler The handler of entity row of BuriUser. (NotNull)
     */
    public void selectCursor(BuriUserCB cb, EntityRowHandler<BuriUser> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, BuriUser.class);
    }

    protected <ENTITY extends BuriUser> void doSelectCursor(BuriUserCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<BuriUser>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * BuriUserCB cb = new BuriUserCB();
     * cb.query().setFoo...(value);
     * BuriUser buriUser = buriUserBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (buriUser != null) {
     *     ... = buriUser.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BuriUser. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriUser selectEntity(BuriUserCB cb) {
        return doSelectEntity(cb, BuriUser.class);
    }

    protected <ENTITY extends BuriUser> ENTITY doSelectEntity(final BuriUserCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, BuriUserCB>() {
            public List<ENTITY> callbackSelectList(BuriUserCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * BuriUserCB cb = new BuriUserCB();
     * cb.query().setFoo...(value);
     * BuriUser buriUser = buriUserBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = buriUser.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BuriUser. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriUser selectEntityWithDeletedCheck(BuriUserCB cb) {
        return doSelectEntityWithDeletedCheck(cb, BuriUser.class);
    }

    protected <ENTITY extends BuriUser> ENTITY doSelectEntityWithDeletedCheck(final BuriUserCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, BuriUserCB>() {
            public List<ENTITY> callbackSelectList(BuriUserCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param buriUserId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriUser selectByPKValue(Long buriUserId) {
        return doSelectByPKValue(buriUserId, BuriUser.class);
    }

    protected <ENTITY extends BuriUser> ENTITY doSelectByPKValue(Long buriUserId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(buriUserId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param buriUserId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriUser selectByPKValueWithDeletedCheck(Long buriUserId) {
        return doSelectByPKValueWithDeletedCheck(buriUserId, BuriUser.class);
    }

    protected <ENTITY extends BuriUser> ENTITY doSelectByPKValueWithDeletedCheck(Long buriUserId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(buriUserId), entityType);
    }

    private BuriUserCB buildPKCB(Long buriUserId) {
        assertObjectNotNull("buriUserId", buriUserId);
        BuriUserCB cb = newMyConditionBean();
        cb.query().setBuriUserId_Equal(buriUserId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BuriUserCB cb = new BuriUserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;BuriUser&gt; buriUserList = buriUserBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (BuriUser buriUser : buriUserList) {
     *     ... = buriUser.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriUser. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BuriUser> selectList(BuriUserCB cb) {
        return doSelectList(cb, BuriUser.class);
    }

    protected <ENTITY extends BuriUser> ListResultBean<ENTITY> doSelectList(BuriUserCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, BuriUserCB>() {
            public List<ENTITY> callbackSelectList(BuriUserCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * BuriUserCB cb = new BuriUserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BuriUser&gt; page = buriUserBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (BuriUser buriUser : page) {
     *     ... = buriUser.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriUser. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BuriUser> selectPage(BuriUserCB cb) {
        return doSelectPage(cb, BuriUser.class);
    }

    protected <ENTITY extends BuriUser> PagingResultBean<ENTITY> doSelectPage(BuriUserCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, BuriUserCB>() {
            public int callbackSelectCount(BuriUserCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(BuriUserCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * buriUserBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(BuriUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<BuriUserCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends BuriUserCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param buriUser The entity of buriUser. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriStateUserList(BuriUser buriUser, ConditionBeanSetupper<BuriStateUserCB> conditionBeanSetupper) {
        xassLRArg(buriUser, conditionBeanSetupper);
        loadBuriStateUserList(xnewLRLs(buriUser), conditionBeanSetupper);
    }
    /**
     * Load referrer of buriStateUserList with the set-upper for condition-bean of referrer. <br />
     * BURISTATEUSER by your BURIUSERID, named 'buriStateUserList'.
     * <pre>
     * buriUserBhv.<span style="color: #FD4747">loadBuriStateUserList</span>(buriUserList, new ConditionBeanSetupper&lt;BuriStateUserCB&gt;() {
     *     public void setup(BuriStateUserCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (BuriUser buriUser : buriUserList) {
     *     ... = buriUser.<span style="color: #FD4747">getBuriStateUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setBuriUserId_InScope(pkList);
     * cb.query().addOrderBy_BuriUserId_Asc();
     * </pre>
     * @param buriUserList The entity list of buriUser. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriStateUserList(List<BuriUser> buriUserList, ConditionBeanSetupper<BuriStateUserCB> conditionBeanSetupper) {
        xassLRArg(buriUserList, conditionBeanSetupper);
        loadBuriStateUserList(buriUserList, new LoadReferrerOption<BuriStateUserCB, BuriStateUser>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param buriUser The entity of buriUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriStateUserList(BuriUser buriUser, LoadReferrerOption<BuriStateUserCB, BuriStateUser> loadReferrerOption) {
        xassLRArg(buriUser, loadReferrerOption);
        loadBuriStateUserList(xnewLRLs(buriUser), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param buriUserList The entity list of buriUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriStateUserList(List<BuriUser> buriUserList, LoadReferrerOption<BuriStateUserCB, BuriStateUser> loadReferrerOption) {
        xassLRArg(buriUserList, loadReferrerOption);
        if (buriUserList.isEmpty()) { return; }
        final BuriStateUserBhv referrerBhv = xgetBSFLR().select(BuriStateUserBhv.class);
        helpLoadReferrerInternally(buriUserList, loadReferrerOption, new InternalLoadReferrerCallback<BuriUser, Long, BuriStateUserCB, BuriStateUser>() {
            public Long getPKVal(BuriUser e)
            { return e.getBuriUserId(); }
            public void setRfLs(BuriUser e, List<BuriStateUser> ls)
            { e.setBuriStateUserList(ls); }
            public BuriStateUserCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(BuriStateUserCB cb, List<Long> ls)
            { cb.query().setBuriUserId_InScope(ls); }
            public void qyOdFKAsc(BuriStateUserCB cb) { cb.query().addOrderBy_BuriUserId_Asc(); }
            public void spFKCol(BuriStateUserCB cb) { cb.specify().columnBuriUserId(); }
            public List<BuriStateUser> selRfLs(BuriStateUserCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(BuriStateUser e) { return e.getBuriUserId(); }
            public void setlcEt(BuriStateUser re, BuriUser le)
            { re.setBuriUser(le); }
            public String getRfPrNm() { return "buriStateUserList"; }
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
     * BuriUser buriUser = new BuriUser();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriUser.setFoo...(value);
     * buriUser.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriUser.set...;</span>
     * buriUserBhv.<span style="color: #FD4747">insert</span>(buriUser);
     * ... = buriUser.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriUser The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(BuriUser buriUser) {
        doInsert(buriUser, null);
    }

    protected void doInsert(BuriUser buriUser, InsertOption<BuriUserCB> option) {
        assertObjectNotNull("buriUser", buriUser);
        prepareInsertOption(option);
        delegateInsert(buriUser, option);
    }

    protected void prepareInsertOption(InsertOption<BuriUserCB> option) {
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
     * BuriUser buriUser = new BuriUser();
     * buriUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriUser.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriUserBhv.<span style="color: #FD4747">update</span>(buriUser);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriUser The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final BuriUser buriUser) {
        doUpdate(buriUser, null);
    }

    protected void doUpdate(BuriUser buriUser, final UpdateOption<BuriUserCB> option) {
        assertObjectNotNull("buriUser", buriUser);
        prepareUpdateOption(option);
        helpUpdateInternally(buriUser, new InternalUpdateCallback<BuriUser>() {
            public int callbackDelegateUpdate(BuriUser entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<BuriUserCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected BuriUserCB createCBForVaryingUpdate() {
        BuriUserCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected BuriUserCB createCBForSpecifiedUpdate() {
        BuriUserCB cb = newMyConditionBean();
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
     * @param buriUser The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(BuriUser buriUser) {
        doInesrtOrUpdate(buriUser, null, null);
    }

    protected void doInesrtOrUpdate(BuriUser buriUser, final InsertOption<BuriUserCB> insertOption, final UpdateOption<BuriUserCB> updateOption) {
        helpInsertOrUpdateInternally(buriUser, new InternalInsertOrUpdateCallback<BuriUser, BuriUserCB>() {
            public void callbackInsert(BuriUser entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(BuriUser entity) { doUpdate(entity, updateOption); }
            public BuriUserCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(BuriUserCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<BuriUserCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<BuriUserCB>() : updateOption;
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
     * BuriUser buriUser = new BuriUser();
     * buriUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriUserBhv.<span style="color: #FD4747">delete</span>(buriUser);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriUser The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BuriUser buriUser) {
        doDelete(buriUser, null);
    }

    protected void doDelete(BuriUser buriUser, final DeleteOption<BuriUserCB> option) {
        assertObjectNotNull("buriUser", buriUser);
        prepareDeleteOption(option);
        helpDeleteInternally(buriUser, new InternalDeleteCallback<BuriUser>() {
            public int callbackDelegateDelete(BuriUser entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<BuriUserCB> option) {
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
     * @param buriUserList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<BuriUser> buriUserList) {
        return doBatchInsert(buriUserList, null);
    }

    protected int[] doBatchInsert(List<BuriUser> buriUserList, InsertOption<BuriUserCB> option) {
        assertObjectNotNull("buriUserList", buriUserList);
        prepareInsertOption(option);
        return delegateBatchInsert(buriUserList, option);
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
     * @param buriUserList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<BuriUser> buriUserList) {
        return doBatchUpdate(buriUserList, null);
    }

    protected int[] doBatchUpdate(List<BuriUser> buriUserList, UpdateOption<BuriUserCB> option) {
        assertObjectNotNull("buriUserList", buriUserList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(buriUserList, option);
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
     * @param buriUserList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<BuriUser> buriUserList, SpecifyQuery<BuriUserCB> updateColumnSpec) {
        return doBatchUpdate(buriUserList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param buriUserList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<BuriUser> buriUserList) {
        return doBatchDelete(buriUserList, null);
    }

    protected int[] doBatchDelete(List<BuriUser> buriUserList, DeleteOption<BuriUserCB> option) {
        assertObjectNotNull("buriUserList", buriUserList);
        prepareDeleteOption(option);
        return delegateBatchDelete(buriUserList, option);
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
     * buriUserBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;BuriUser, BuriUserCB&gt;() {
     *     public ConditionBean setup(buriUser entity, BuriUserCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BuriUser, BuriUserCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<BuriUser, BuriUserCB> setupper, InsertOption<BuriUserCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        BuriUser entity = new BuriUser();
        BuriUserCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected BuriUserCB createCBForQueryInsert() {
        BuriUserCB cb = newMyConditionBean();
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
     * BuriUser buriUser = new BuriUser();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriUser.setPK...(value);</span>
     * buriUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriUser.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriUser.setVersionNo(value);</span>
     * BuriUserCB cb = new BuriUserCB();
     * cb.query().setFoo...(value);
     * buriUserBhv.<span style="color: #FD4747">queryUpdate</span>(buriUser, cb);
     * </pre>
     * @param buriUser The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BuriUser. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BuriUser buriUser, BuriUserCB cb) {
        return doQueryUpdate(buriUser, cb, null);
    }

    protected int doQueryUpdate(BuriUser buriUser, BuriUserCB cb, UpdateOption<BuriUserCB> option) {
        assertObjectNotNull("buriUser", buriUser); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(buriUser, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (BuriUserCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (BuriUserCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * BuriUserCB cb = new BuriUserCB();
     * cb.query().setFoo...(value);
     * buriUserBhv.<span style="color: #FD4747">queryDelete</span>(buriUser, cb);
     * </pre>
     * @param cb The condition-bean of BuriUser. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BuriUserCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(BuriUserCB cb, DeleteOption<BuriUserCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((BuriUserCB)cb); }
        else { return varyingQueryDelete((BuriUserCB)cb, downcast(option)); }
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
     * BuriUser buriUser = new BuriUser();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriUser.setFoo...(value);
     * buriUser.setBar...(value);
     * InsertOption<BuriUserCB> option = new InsertOption<BuriUserCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * buriUserBhv.<span style="color: #FD4747">varyingInsert</span>(buriUser, option);
     * ... = buriUser.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriUser The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(BuriUser buriUser, InsertOption<BuriUserCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(buriUser, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * BuriUser buriUser = new BuriUser();
     * buriUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;BuriUserCB&gt; option = new UpdateOption&lt;BuriUserCB&gt;();
     *     option.self(new SpecifyQuery&lt;BuriUserCB&gt;() {
     *         public void specify(BuriUserCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     buriUserBhv.<span style="color: #FD4747">varyingUpdate</span>(buriUser, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param buriUser The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(BuriUser buriUser, UpdateOption<BuriUserCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(buriUser, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param buriUser The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(BuriUser buriUser, InsertOption<BuriUserCB> insertOption, UpdateOption<BuriUserCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(buriUser, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param buriUser The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BuriUser buriUser, DeleteOption<BuriUserCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(buriUser, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param buriUserList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<BuriUser> buriUserList, InsertOption<BuriUserCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(buriUserList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param buriUserList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<BuriUser> buriUserList, UpdateOption<BuriUserCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(buriUserList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param buriUserList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<BuriUser> buriUserList, DeleteOption<BuriUserCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(buriUserList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<BuriUser, BuriUserCB> setupper, InsertOption<BuriUserCB> option) {
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
     * BuriUser buriUser = new BuriUser();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriUser.setPK...(value);</span>
     * buriUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriUser.setVersionNo(value);</span>
     * BuriUserCB cb = new BuriUserCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;BuriUserCB&gt; option = new UpdateOption&lt;BuriUserCB&gt;();
     * option.self(new SpecifyQuery&lt;BuriUserCB&gt;() {
     *     public void specify(BuriUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * buriUserBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(buriUser, cb, option);
     * </pre>
     * @param buriUser The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BuriUser. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BuriUser buriUser, BuriUserCB cb, UpdateOption<BuriUserCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(buriUser, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of BuriUser. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BuriUserCB cb, DeleteOption<BuriUserCB> option) {
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
    public OutsideSqlBasicExecutor<BuriUserBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(BuriUserCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(BuriUserCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends BuriUser> void delegateSelectCursor(BuriUserCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends BuriUser> List<ENTITY> delegateSelectList(BuriUserCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(BuriUser e, InsertOption<BuriUserCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(BuriUser e, UpdateOption<BuriUserCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(BuriUser e, UpdateOption<BuriUserCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(BuriUser e, DeleteOption<BuriUserCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(BuriUser e, DeleteOption<BuriUserCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<BuriUser> ls, InsertOption<BuriUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<BuriUser> ls, UpdateOption<BuriUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<BuriUser> ls, UpdateOption<BuriUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<BuriUser> ls, DeleteOption<BuriUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<BuriUser> ls, DeleteOption<BuriUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(BuriUser e, BuriUserCB inCB, ConditionBean resCB, InsertOption<BuriUserCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(BuriUser e, BuriUserCB cb, UpdateOption<BuriUserCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(BuriUserCB cb, DeleteOption<BuriUserCB> op)
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
    protected BuriUser downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, BuriUser.class);
    }

    protected BuriUserCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, BuriUserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<BuriUser> downcast(List<? extends Entity> entityList) {
        return (List<BuriUser>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<BuriUserCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<BuriUserCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<BuriUserCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<BuriUserCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<BuriUserCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<BuriUserCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<BuriUser, BuriUserCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<BuriUser, BuriUserCB>)option;
    }
}

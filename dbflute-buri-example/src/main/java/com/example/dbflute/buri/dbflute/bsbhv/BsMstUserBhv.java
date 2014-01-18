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
 * The behavior of MST_USER as TABLE. <br />
 * <pre>
 * [primary key]
 *     USER_ID
 * 
 * [column]
 *     USER_ID, USER_CODE, USER_NAME, REGISTER_USER, REGISTER_DATETIME, UPDATE_USER, UPDATE_DATETIME, VERSION_NO
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     VERSION_NO
 * 
 * [foreign table]
 *     
 * 
 * [referrer table]
 *     MST_USER_ROLE
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     mstUserRoleList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMstUserBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "MST_USER"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return MstUserDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MstUserDbm getMyDBMeta() { return MstUserDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MstUser newMyEntity() { return new MstUser(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MstUserCB newMyConditionBean() { return new MstUserCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MstUserCB cb = new MstUserCB();
     * cb.query().setFoo...(value);
     * int count = mstUserBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MstUser. (NotNull)
     * @return The selected count.
     */
    public int selectCount(MstUserCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(MstUserCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(MstUserCB cb) { // called by selectPage(cb)
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
     * MstUserCB cb = new MstUserCB();
     * cb.query().setFoo...(value);
     * mstUserBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MstUser&gt;() {
     *     public void handle(MstUser entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MstUser. (NotNull)
     * @param entityRowHandler The handler of entity row of MstUser. (NotNull)
     */
    public void selectCursor(MstUserCB cb, EntityRowHandler<MstUser> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, MstUser.class);
    }

    protected <ENTITY extends MstUser> void doSelectCursor(MstUserCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<MstUser>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * MstUserCB cb = new MstUserCB();
     * cb.query().setFoo...(value);
     * MstUser mstUser = mstUserBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (mstUser != null) {
     *     ... = mstUser.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MstUser. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MstUser selectEntity(MstUserCB cb) {
        return doSelectEntity(cb, MstUser.class);
    }

    protected <ENTITY extends MstUser> ENTITY doSelectEntity(final MstUserCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, MstUserCB>() {
            public List<ENTITY> callbackSelectList(MstUserCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * MstUserCB cb = new MstUserCB();
     * cb.query().setFoo...(value);
     * MstUser mstUser = mstUserBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mstUser.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MstUser. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MstUser selectEntityWithDeletedCheck(MstUserCB cb) {
        return doSelectEntityWithDeletedCheck(cb, MstUser.class);
    }

    protected <ENTITY extends MstUser> ENTITY doSelectEntityWithDeletedCheck(final MstUserCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, MstUserCB>() {
            public List<ENTITY> callbackSelectList(MstUserCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param userId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MstUser selectByPKValue(Integer userId) {
        return doSelectByPKValue(userId, MstUser.class);
    }

    protected <ENTITY extends MstUser> ENTITY doSelectByPKValue(Integer userId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(userId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param userId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MstUser selectByPKValueWithDeletedCheck(Integer userId) {
        return doSelectByPKValueWithDeletedCheck(userId, MstUser.class);
    }

    protected <ENTITY extends MstUser> ENTITY doSelectByPKValueWithDeletedCheck(Integer userId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(userId), entityType);
    }

    private MstUserCB buildPKCB(Integer userId) {
        assertObjectNotNull("userId", userId);
        MstUserCB cb = newMyConditionBean();
        cb.query().setUserId_Equal(userId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MstUserCB cb = new MstUserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MstUser&gt; mstUserList = mstUserBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (MstUser mstUser : mstUserList) {
     *     ... = mstUser.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MstUser. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MstUser> selectList(MstUserCB cb) {
        return doSelectList(cb, MstUser.class);
    }

    protected <ENTITY extends MstUser> ListResultBean<ENTITY> doSelectList(MstUserCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, MstUserCB>() {
            public List<ENTITY> callbackSelectList(MstUserCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * MstUserCB cb = new MstUserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MstUser&gt; page = mstUserBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MstUser mstUser : page) {
     *     ... = mstUser.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MstUser. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MstUser> selectPage(MstUserCB cb) {
        return doSelectPage(cb, MstUser.class);
    }

    protected <ENTITY extends MstUser> PagingResultBean<ENTITY> doSelectPage(MstUserCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, MstUserCB>() {
            public int callbackSelectCount(MstUserCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(MstUserCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * mstUserBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MstUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<MstUserCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends MstUserCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param mstUser The entity of mstUser. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadMstUserRoleList(MstUser mstUser, ConditionBeanSetupper<MstUserRoleCB> conditionBeanSetupper) {
        xassLRArg(mstUser, conditionBeanSetupper);
        loadMstUserRoleList(xnewLRLs(mstUser), conditionBeanSetupper);
    }
    /**
     * Load referrer of mstUserRoleList with the set-upper for condition-bean of referrer. <br />
     * MST_USER_ROLE by your USER_ID, named 'mstUserRoleList'.
     * <pre>
     * mstUserBhv.<span style="color: #FD4747">loadMstUserRoleList</span>(mstUserList, new ConditionBeanSetupper&lt;MstUserRoleCB&gt;() {
     *     public void setup(MstUserRoleCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (MstUser mstUser : mstUserList) {
     *     ... = mstUser.<span style="color: #FD4747">getMstUserRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param mstUserList The entity list of mstUser. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadMstUserRoleList(List<MstUser> mstUserList, ConditionBeanSetupper<MstUserRoleCB> conditionBeanSetupper) {
        xassLRArg(mstUserList, conditionBeanSetupper);
        loadMstUserRoleList(mstUserList, new LoadReferrerOption<MstUserRoleCB, MstUserRole>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param mstUser The entity of mstUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadMstUserRoleList(MstUser mstUser, LoadReferrerOption<MstUserRoleCB, MstUserRole> loadReferrerOption) {
        xassLRArg(mstUser, loadReferrerOption);
        loadMstUserRoleList(xnewLRLs(mstUser), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param mstUserList The entity list of mstUser. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadMstUserRoleList(List<MstUser> mstUserList, LoadReferrerOption<MstUserRoleCB, MstUserRole> loadReferrerOption) {
        xassLRArg(mstUserList, loadReferrerOption);
        if (mstUserList.isEmpty()) { return; }
        final MstUserRoleBhv referrerBhv = xgetBSFLR().select(MstUserRoleBhv.class);
        helpLoadReferrerInternally(mstUserList, loadReferrerOption, new InternalLoadReferrerCallback<MstUser, Integer, MstUserRoleCB, MstUserRole>() {
            public Integer getPKVal(MstUser e)
            { return e.getUserId(); }
            public void setRfLs(MstUser e, List<MstUserRole> ls)
            { e.setMstUserRoleList(ls); }
            public MstUserRoleCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(MstUserRoleCB cb, List<Integer> ls)
            { cb.query().setUserId_InScope(ls); }
            public void qyOdFKAsc(MstUserRoleCB cb) { cb.query().addOrderBy_UserId_Asc(); }
            public void spFKCol(MstUserRoleCB cb) { cb.specify().columnUserId(); }
            public List<MstUserRole> selRfLs(MstUserRoleCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(MstUserRole e) { return e.getUserId(); }
            public void setlcEt(MstUserRole re, MstUser le)
            { re.setMstUser(le); }
            public String getRfPrNm() { return "mstUserRoleList"; }
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
     * MstUser mstUser = new MstUser();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mstUser.setFoo...(value);
     * mstUser.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mstUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mstUser.set...;</span>
     * mstUserBhv.<span style="color: #FD4747">insert</span>(mstUser);
     * ... = mstUser.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mstUser The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(MstUser mstUser) {
        doInsert(mstUser, null);
    }

    protected void doInsert(MstUser mstUser, InsertOption<MstUserCB> option) {
        assertObjectNotNull("mstUser", mstUser);
        prepareInsertOption(option);
        delegateInsert(mstUser, option);
    }

    protected void prepareInsertOption(InsertOption<MstUserCB> option) {
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
     * MstUser mstUser = new MstUser();
     * mstUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mstUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mstUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mstUser.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * mstUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     mstUserBhv.<span style="color: #FD4747">update</span>(mstUser);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param mstUser The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final MstUser mstUser) {
        doUpdate(mstUser, null);
    }

    protected void doUpdate(MstUser mstUser, final UpdateOption<MstUserCB> option) {
        assertObjectNotNull("mstUser", mstUser);
        prepareUpdateOption(option);
        helpUpdateInternally(mstUser, new InternalUpdateCallback<MstUser>() {
            public int callbackDelegateUpdate(MstUser entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<MstUserCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected MstUserCB createCBForVaryingUpdate() {
        MstUserCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected MstUserCB createCBForSpecifiedUpdate() {
        MstUserCB cb = newMyConditionBean();
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
     * MstUser mstUser = new MstUser();
     * mstUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mstUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mstUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mstUser.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstUser.setVersionNo(value);</span>
     * mstUserBhv.<span style="color: #FD4747">updateNonstrict</span>(mstUser);
     * </pre>
     * @param mstUser The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final MstUser mstUser) {
        doUpdateNonstrict(mstUser, null);
    }

    protected void doUpdateNonstrict(MstUser mstUser, final UpdateOption<MstUserCB> option) {
        assertObjectNotNull("mstUser", mstUser);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(mstUser, new InternalUpdateNonstrictCallback<MstUser>() {
            public int callbackDelegateUpdateNonstrict(MstUser entity) { return delegateUpdateNonstrict(entity, option); } });
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { updateNonstrict(downcast(entity)); }
        else { varyingUpdateNonstrict(downcast(entity), downcast(option)); }
    }

    /**
     * Insert or update the entity modified-only. {ExclusiveControl(when update)}
     * @param mstUser The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(MstUser mstUser) {
        doInesrtOrUpdate(mstUser, null, null);
    }

    protected void doInesrtOrUpdate(MstUser mstUser, final InsertOption<MstUserCB> insertOption, final UpdateOption<MstUserCB> updateOption) {
        helpInsertOrUpdateInternally(mstUser, new InternalInsertOrUpdateCallback<MstUser, MstUserCB>() {
            public void callbackInsert(MstUser entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(MstUser entity) { doUpdate(entity, updateOption); }
            public MstUserCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(MstUserCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<MstUserCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<MstUserCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonExclusiveControl(when update)}
     * @param mstUser The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(MstUser mstUser) {
        doInesrtOrUpdateNonstrict(mstUser, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(MstUser mstUser, final InsertOption<MstUserCB> insertOption, final UpdateOption<MstUserCB> updateOption) {
        helpInsertOrUpdateInternally(mstUser, new InternalInsertOrUpdateNonstrictCallback<MstUser>() {
            public void callbackInsert(MstUser entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(MstUser entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<MstUserCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<MstUserCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * MstUser mstUser = new MstUser();
     * mstUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * mstUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     mstUserBhv.<span style="color: #FD4747">delete</span>(mstUser);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param mstUser The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MstUser mstUser) {
        doDelete(mstUser, null);
    }

    protected void doDelete(MstUser mstUser, final DeleteOption<MstUserCB> option) {
        assertObjectNotNull("mstUser", mstUser);
        prepareDeleteOption(option);
        helpDeleteInternally(mstUser, new InternalDeleteCallback<MstUser>() {
            public int callbackDelegateDelete(MstUser entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<MstUserCB> option) {
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
     * MstUser mstUser = new MstUser();
     * mstUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstUser.setVersionNo(value);</span>
     * mstUserBhv.<span style="color: #FD4747">deleteNonstrict</span>(mstUser);
     * </pre>
     * @param mstUser The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MstUser mstUser) {
        doDeleteNonstrict(mstUser, null);
    }

    protected void doDeleteNonstrict(MstUser mstUser, final DeleteOption<MstUserCB> option) {
        assertObjectNotNull("mstUser", mstUser);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(mstUser, new InternalDeleteNonstrictCallback<MstUser>() {
            public int callbackDelegateDeleteNonstrict(MstUser entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonExclusiveControl}
     * <pre>
     * MstUser mstUser = new MstUser();
     * mstUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstUser.setVersionNo(value);</span>
     * mstUserBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(mstUser);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mstUser The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MstUser mstUser) {
        doDeleteNonstrictIgnoreDeleted(mstUser, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MstUser mstUser, final DeleteOption<MstUserCB> option) {
        assertObjectNotNull("mstUser", mstUser);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(mstUser, new InternalDeleteNonstrictIgnoreDeletedCallback<MstUser>() {
            public int callbackDelegateDeleteNonstrict(MstUser entity) { return delegateDeleteNonstrict(entity, option); } });
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
     * @param mstUserList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<MstUser> mstUserList) {
        return doBatchInsert(mstUserList, null);
    }

    protected int[] doBatchInsert(List<MstUser> mstUserList, InsertOption<MstUserCB> option) {
        assertObjectNotNull("mstUserList", mstUserList);
        prepareInsertOption(option);
        return delegateBatchInsert(mstUserList, option);
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
     * @param mstUserList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MstUser> mstUserList) {
        return doBatchUpdate(mstUserList, null);
    }

    protected int[] doBatchUpdate(List<MstUser> mstUserList, UpdateOption<MstUserCB> option) {
        assertObjectNotNull("mstUserList", mstUserList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(mstUserList, option);
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
     * @param mstUserList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MstUser> mstUserList, SpecifyQuery<MstUserCB> updateColumnSpec) {
        return doBatchUpdate(mstUserList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are update target. {NOT modified only}
     * @param mstUserList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<MstUser> mstUserList) {
        return doBatchUpdateNonstrict(mstUserList, null);
    }

    protected int[] doBatchUpdateNonstrict(List<MstUser> mstUserList, UpdateOption<MstUserCB> option) {
        assertObjectNotNull("mstUserList", mstUserList);
        prepareUpdateOption(option);
        return delegateBatchUpdateNonstrict(mstUserList, option);
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistick lock column because they are specified implicitly.
     * @param mstUserList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<MstUser> mstUserList, SpecifyQuery<MstUserCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(mstUserList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param mstUserList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MstUser> mstUserList) {
        return doBatchDelete(mstUserList, null);
    }

    protected int[] doBatchDelete(List<MstUser> mstUserList, DeleteOption<MstUserCB> option) {
        assertObjectNotNull("mstUserList", mstUserList);
        prepareDeleteOption(option);
        return delegateBatchDelete(mstUserList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param mstUserList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<MstUser> mstUserList) {
        return doBatchDeleteNonstrict(mstUserList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<MstUser> mstUserList, DeleteOption<MstUserCB> option) {
        assertObjectNotNull("mstUserList", mstUserList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(mstUserList, option);
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
     * mstUserBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;MstUser, MstUserCB&gt;() {
     *     public ConditionBean setup(mstUser entity, MstUserCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MstUser, MstUserCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<MstUser, MstUserCB> setupper, InsertOption<MstUserCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        MstUser entity = new MstUser();
        MstUserCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected MstUserCB createCBForQueryInsert() {
        MstUserCB cb = newMyConditionBean();
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
     * MstUser mstUser = new MstUser();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mstUser.setPK...(value);</span>
     * mstUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mstUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mstUser.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstUser.setVersionNo(value);</span>
     * MstUserCB cb = new MstUserCB();
     * cb.query().setFoo...(value);
     * mstUserBhv.<span style="color: #FD4747">queryUpdate</span>(mstUser, cb);
     * </pre>
     * @param mstUser The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MstUser. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MstUser mstUser, MstUserCB cb) {
        return doQueryUpdate(mstUser, cb, null);
    }

    protected int doQueryUpdate(MstUser mstUser, MstUserCB cb, UpdateOption<MstUserCB> option) {
        assertObjectNotNull("mstUser", mstUser); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(mstUser, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (MstUserCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (MstUserCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * MstUserCB cb = new MstUserCB();
     * cb.query().setFoo...(value);
     * mstUserBhv.<span style="color: #FD4747">queryDelete</span>(mstUser, cb);
     * </pre>
     * @param cb The condition-bean of MstUser. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MstUserCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(MstUserCB cb, DeleteOption<MstUserCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((MstUserCB)cb); }
        else { return varyingQueryDelete((MstUserCB)cb, downcast(option)); }
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
     * MstUser mstUser = new MstUser();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mstUser.setFoo...(value);
     * mstUser.setBar...(value);
     * InsertOption<MstUserCB> option = new InsertOption<MstUserCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * mstUserBhv.<span style="color: #FD4747">varyingInsert</span>(mstUser, option);
     * ... = mstUser.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mstUser The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(MstUser mstUser, InsertOption<MstUserCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(mstUser, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MstUser mstUser = new MstUser();
     * mstUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mstUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * mstUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MstUserCB&gt; option = new UpdateOption&lt;MstUserCB&gt;();
     *     option.self(new SpecifyQuery&lt;MstUserCB&gt;() {
     *         public void specify(MstUserCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     mstUserBhv.<span style="color: #FD4747">varyingUpdate</span>(mstUser, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mstUser The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(MstUser mstUser, UpdateOption<MstUserCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(mstUser, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. {UpdateCountZeroException, NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MstUser mstUser = new MstUser();
     * mstUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mstUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstUser.setVersionNo(value);</span>
     * UpdateOption&lt;MstUserCB&gt; option = new UpdateOption&lt;MstUserCB&gt;();
     * option.self(new SpecifyQuery&lt;MstUserCB&gt;() {
     *     public void specify(MstUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * mstUserBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(mstUser, option);
     * </pre>
     * @param mstUser The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdateNonstrict(MstUser mstUser, UpdateOption<MstUserCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(mstUser, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param mstUser The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(MstUser mstUser, InsertOption<MstUserCB> insertOption, UpdateOption<MstUserCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(mstUser, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. {NonExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mstUser The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdateNonstrict(MstUser mstUser, InsertOption<MstUserCB> insertOption, UpdateOption<MstUserCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(mstUser, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param mstUser The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MstUser mstUser, DeleteOption<MstUserCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(mstUser, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. {UpdateCountZeroException, NonExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param mstUser The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MstUser mstUser, DeleteOption<MstUserCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(mstUser, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param mstUserList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<MstUser> mstUserList, InsertOption<MstUserCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(mstUserList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param mstUserList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<MstUser> mstUserList, UpdateOption<MstUserCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(mstUserList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mstUserList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdateNonstrict(List<MstUser> mstUserList, UpdateOption<MstUserCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(mstUserList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param mstUserList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<MstUser> mstUserList, DeleteOption<MstUserCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(mstUserList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mstUserList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDeleteNonstrict(List<MstUser> mstUserList, DeleteOption<MstUserCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(mstUserList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<MstUser, MstUserCB> setupper, InsertOption<MstUserCB> option) {
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
     * MstUser mstUser = new MstUser();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mstUser.setPK...(value);</span>
     * mstUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstUser.setVersionNo(value);</span>
     * MstUserCB cb = new MstUserCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MstUserCB&gt; option = new UpdateOption&lt;MstUserCB&gt;();
     * option.self(new SpecifyQuery&lt;MstUserCB&gt;() {
     *     public void specify(MstUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * mstUserBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(mstUser, cb, option);
     * </pre>
     * @param mstUser The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MstUser. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MstUser mstUser, MstUserCB cb, UpdateOption<MstUserCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(mstUser, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MstUser. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MstUserCB cb, DeleteOption<MstUserCB> option) {
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
    public OutsideSqlBasicExecutor<MstUserBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(MstUserCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(MstUserCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends MstUser> void delegateSelectCursor(MstUserCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends MstUser> List<ENTITY> delegateSelectList(MstUserCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(MstUser e, InsertOption<MstUserCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(MstUser e, UpdateOption<MstUserCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(MstUser e, UpdateOption<MstUserCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(MstUser e, DeleteOption<MstUserCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(MstUser e, DeleteOption<MstUserCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<MstUser> ls, InsertOption<MstUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<MstUser> ls, UpdateOption<MstUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<MstUser> ls, UpdateOption<MstUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<MstUser> ls, DeleteOption<MstUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<MstUser> ls, DeleteOption<MstUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(MstUser e, MstUserCB inCB, ConditionBean resCB, InsertOption<MstUserCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(MstUser e, MstUserCB cb, UpdateOption<MstUserCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(MstUserCB cb, DeleteOption<MstUserCB> op)
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
    protected MstUser downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, MstUser.class);
    }

    protected MstUserCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, MstUserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<MstUser> downcast(List<? extends Entity> entityList) {
        return (List<MstUser>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<MstUserCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<MstUserCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<MstUserCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<MstUserCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<MstUserCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<MstUserCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<MstUser, MstUserCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<MstUser, MstUserCB>)option;
    }
}

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
 * The behavior of MST_ROLE as TABLE. <br />
 * <pre>
 * [primary key]
 *     ROLE_ID
 * 
 * [column]
 *     ROLE_ID, ROLE_NAME, REGISTER_USER, REGISTER_DATETIME, UPDATE_USER, UPDATE_DATETIME, VERSION_NO
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
public abstract class BsMstRoleBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "MST_ROLE"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return MstRoleDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MstRoleDbm getMyDBMeta() { return MstRoleDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MstRole newMyEntity() { return new MstRole(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MstRoleCB newMyConditionBean() { return new MstRoleCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MstRoleCB cb = new MstRoleCB();
     * cb.query().setFoo...(value);
     * int count = mstRoleBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MstRole. (NotNull)
     * @return The selected count.
     */
    public int selectCount(MstRoleCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(MstRoleCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(MstRoleCB cb) { // called by selectPage(cb)
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
     * MstRoleCB cb = new MstRoleCB();
     * cb.query().setFoo...(value);
     * mstRoleBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MstRole&gt;() {
     *     public void handle(MstRole entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MstRole. (NotNull)
     * @param entityRowHandler The handler of entity row of MstRole. (NotNull)
     */
    public void selectCursor(MstRoleCB cb, EntityRowHandler<MstRole> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, MstRole.class);
    }

    protected <ENTITY extends MstRole> void doSelectCursor(MstRoleCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<MstRole>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * MstRoleCB cb = new MstRoleCB();
     * cb.query().setFoo...(value);
     * MstRole mstRole = mstRoleBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (mstRole != null) {
     *     ... = mstRole.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MstRole. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MstRole selectEntity(MstRoleCB cb) {
        return doSelectEntity(cb, MstRole.class);
    }

    protected <ENTITY extends MstRole> ENTITY doSelectEntity(final MstRoleCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, MstRoleCB>() {
            public List<ENTITY> callbackSelectList(MstRoleCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * MstRoleCB cb = new MstRoleCB();
     * cb.query().setFoo...(value);
     * MstRole mstRole = mstRoleBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mstRole.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MstRole. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MstRole selectEntityWithDeletedCheck(MstRoleCB cb) {
        return doSelectEntityWithDeletedCheck(cb, MstRole.class);
    }

    protected <ENTITY extends MstRole> ENTITY doSelectEntityWithDeletedCheck(final MstRoleCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, MstRoleCB>() {
            public List<ENTITY> callbackSelectList(MstRoleCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param roleId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MstRole selectByPKValue(Integer roleId) {
        return doSelectByPKValue(roleId, MstRole.class);
    }

    protected <ENTITY extends MstRole> ENTITY doSelectByPKValue(Integer roleId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(roleId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param roleId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MstRole selectByPKValueWithDeletedCheck(Integer roleId) {
        return doSelectByPKValueWithDeletedCheck(roleId, MstRole.class);
    }

    protected <ENTITY extends MstRole> ENTITY doSelectByPKValueWithDeletedCheck(Integer roleId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(roleId), entityType);
    }

    private MstRoleCB buildPKCB(Integer roleId) {
        assertObjectNotNull("roleId", roleId);
        MstRoleCB cb = newMyConditionBean();
        cb.query().setRoleId_Equal(roleId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MstRoleCB cb = new MstRoleCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MstRole&gt; mstRoleList = mstRoleBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (MstRole mstRole : mstRoleList) {
     *     ... = mstRole.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MstRole. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MstRole> selectList(MstRoleCB cb) {
        return doSelectList(cb, MstRole.class);
    }

    protected <ENTITY extends MstRole> ListResultBean<ENTITY> doSelectList(MstRoleCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, MstRoleCB>() {
            public List<ENTITY> callbackSelectList(MstRoleCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * MstRoleCB cb = new MstRoleCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MstRole&gt; page = mstRoleBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MstRole mstRole : page) {
     *     ... = mstRole.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MstRole. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MstRole> selectPage(MstRoleCB cb) {
        return doSelectPage(cb, MstRole.class);
    }

    protected <ENTITY extends MstRole> PagingResultBean<ENTITY> doSelectPage(MstRoleCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, MstRoleCB>() {
            public int callbackSelectCount(MstRoleCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(MstRoleCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * mstRoleBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MstRoleCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<MstRoleCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends MstRoleCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param mstRole The entity of mstRole. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadMstUserRoleList(MstRole mstRole, ConditionBeanSetupper<MstUserRoleCB> conditionBeanSetupper) {
        xassLRArg(mstRole, conditionBeanSetupper);
        loadMstUserRoleList(xnewLRLs(mstRole), conditionBeanSetupper);
    }
    /**
     * Load referrer of mstUserRoleList with the set-upper for condition-bean of referrer. <br />
     * MST_USER_ROLE by your ROLE_ID, named 'mstUserRoleList'.
     * <pre>
     * mstRoleBhv.<span style="color: #FD4747">loadMstUserRoleList</span>(mstRoleList, new ConditionBeanSetupper&lt;MstUserRoleCB&gt;() {
     *     public void setup(MstUserRoleCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (MstRole mstRole : mstRoleList) {
     *     ... = mstRole.<span style="color: #FD4747">getMstUserRoleList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setRoleId_InScope(pkList);
     * cb.query().addOrderBy_RoleId_Asc();
     * </pre>
     * @param mstRoleList The entity list of mstRole. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadMstUserRoleList(List<MstRole> mstRoleList, ConditionBeanSetupper<MstUserRoleCB> conditionBeanSetupper) {
        xassLRArg(mstRoleList, conditionBeanSetupper);
        loadMstUserRoleList(mstRoleList, new LoadReferrerOption<MstUserRoleCB, MstUserRole>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param mstRole The entity of mstRole. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadMstUserRoleList(MstRole mstRole, LoadReferrerOption<MstUserRoleCB, MstUserRole> loadReferrerOption) {
        xassLRArg(mstRole, loadReferrerOption);
        loadMstUserRoleList(xnewLRLs(mstRole), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param mstRoleList The entity list of mstRole. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadMstUserRoleList(List<MstRole> mstRoleList, LoadReferrerOption<MstUserRoleCB, MstUserRole> loadReferrerOption) {
        xassLRArg(mstRoleList, loadReferrerOption);
        if (mstRoleList.isEmpty()) { return; }
        final MstUserRoleBhv referrerBhv = xgetBSFLR().select(MstUserRoleBhv.class);
        helpLoadReferrerInternally(mstRoleList, loadReferrerOption, new InternalLoadReferrerCallback<MstRole, Integer, MstUserRoleCB, MstUserRole>() {
            public Integer getPKVal(MstRole e)
            { return e.getRoleId(); }
            public void setRfLs(MstRole e, List<MstUserRole> ls)
            { e.setMstUserRoleList(ls); }
            public MstUserRoleCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(MstUserRoleCB cb, List<Integer> ls)
            { cb.query().setRoleId_InScope(ls); }
            public void qyOdFKAsc(MstUserRoleCB cb) { cb.query().addOrderBy_RoleId_Asc(); }
            public void spFKCol(MstUserRoleCB cb) { cb.specify().columnRoleId(); }
            public List<MstUserRole> selRfLs(MstUserRoleCB cb) { return referrerBhv.selectList(cb); }
            public Integer getFKVal(MstUserRole e) { return e.getRoleId(); }
            public void setlcEt(MstUserRole re, MstRole le)
            { re.setMstRole(le); }
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
     * MstRole mstRole = new MstRole();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mstRole.setFoo...(value);
     * mstRole.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mstRole.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mstRole.set...;</span>
     * mstRoleBhv.<span style="color: #FD4747">insert</span>(mstRole);
     * ... = mstRole.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mstRole The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(MstRole mstRole) {
        doInsert(mstRole, null);
    }

    protected void doInsert(MstRole mstRole, InsertOption<MstRoleCB> option) {
        assertObjectNotNull("mstRole", mstRole);
        prepareInsertOption(option);
        delegateInsert(mstRole, option);
    }

    protected void prepareInsertOption(InsertOption<MstRoleCB> option) {
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
     * MstRole mstRole = new MstRole();
     * mstRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mstRole.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mstRole.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mstRole.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * mstRole.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     mstRoleBhv.<span style="color: #FD4747">update</span>(mstRole);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param mstRole The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final MstRole mstRole) {
        doUpdate(mstRole, null);
    }

    protected void doUpdate(MstRole mstRole, final UpdateOption<MstRoleCB> option) {
        assertObjectNotNull("mstRole", mstRole);
        prepareUpdateOption(option);
        helpUpdateInternally(mstRole, new InternalUpdateCallback<MstRole>() {
            public int callbackDelegateUpdate(MstRole entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<MstRoleCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected MstRoleCB createCBForVaryingUpdate() {
        MstRoleCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected MstRoleCB createCBForSpecifiedUpdate() {
        MstRoleCB cb = newMyConditionBean();
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
     * MstRole mstRole = new MstRole();
     * mstRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mstRole.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mstRole.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mstRole.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstRole.setVersionNo(value);</span>
     * mstRoleBhv.<span style="color: #FD4747">updateNonstrict</span>(mstRole);
     * </pre>
     * @param mstRole The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final MstRole mstRole) {
        doUpdateNonstrict(mstRole, null);
    }

    protected void doUpdateNonstrict(MstRole mstRole, final UpdateOption<MstRoleCB> option) {
        assertObjectNotNull("mstRole", mstRole);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(mstRole, new InternalUpdateNonstrictCallback<MstRole>() {
            public int callbackDelegateUpdateNonstrict(MstRole entity) { return delegateUpdateNonstrict(entity, option); } });
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { updateNonstrict(downcast(entity)); }
        else { varyingUpdateNonstrict(downcast(entity), downcast(option)); }
    }

    /**
     * Insert or update the entity modified-only. {ExclusiveControl(when update)}
     * @param mstRole The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(MstRole mstRole) {
        doInesrtOrUpdate(mstRole, null, null);
    }

    protected void doInesrtOrUpdate(MstRole mstRole, final InsertOption<MstRoleCB> insertOption, final UpdateOption<MstRoleCB> updateOption) {
        helpInsertOrUpdateInternally(mstRole, new InternalInsertOrUpdateCallback<MstRole, MstRoleCB>() {
            public void callbackInsert(MstRole entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(MstRole entity) { doUpdate(entity, updateOption); }
            public MstRoleCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(MstRoleCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<MstRoleCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<MstRoleCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonExclusiveControl(when update)}
     * @param mstRole The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(MstRole mstRole) {
        doInesrtOrUpdateNonstrict(mstRole, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(MstRole mstRole, final InsertOption<MstRoleCB> insertOption, final UpdateOption<MstRoleCB> updateOption) {
        helpInsertOrUpdateInternally(mstRole, new InternalInsertOrUpdateNonstrictCallback<MstRole>() {
            public void callbackInsert(MstRole entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(MstRole entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<MstRoleCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<MstRoleCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * MstRole mstRole = new MstRole();
     * mstRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * mstRole.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     mstRoleBhv.<span style="color: #FD4747">delete</span>(mstRole);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param mstRole The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MstRole mstRole) {
        doDelete(mstRole, null);
    }

    protected void doDelete(MstRole mstRole, final DeleteOption<MstRoleCB> option) {
        assertObjectNotNull("mstRole", mstRole);
        prepareDeleteOption(option);
        helpDeleteInternally(mstRole, new InternalDeleteCallback<MstRole>() {
            public int callbackDelegateDelete(MstRole entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<MstRoleCB> option) {
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
     * MstRole mstRole = new MstRole();
     * mstRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstRole.setVersionNo(value);</span>
     * mstRoleBhv.<span style="color: #FD4747">deleteNonstrict</span>(mstRole);
     * </pre>
     * @param mstRole The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MstRole mstRole) {
        doDeleteNonstrict(mstRole, null);
    }

    protected void doDeleteNonstrict(MstRole mstRole, final DeleteOption<MstRoleCB> option) {
        assertObjectNotNull("mstRole", mstRole);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(mstRole, new InternalDeleteNonstrictCallback<MstRole>() {
            public int callbackDelegateDeleteNonstrict(MstRole entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonExclusiveControl}
     * <pre>
     * MstRole mstRole = new MstRole();
     * mstRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstRole.setVersionNo(value);</span>
     * mstRoleBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(mstRole);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mstRole The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MstRole mstRole) {
        doDeleteNonstrictIgnoreDeleted(mstRole, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MstRole mstRole, final DeleteOption<MstRoleCB> option) {
        assertObjectNotNull("mstRole", mstRole);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(mstRole, new InternalDeleteNonstrictIgnoreDeletedCallback<MstRole>() {
            public int callbackDelegateDeleteNonstrict(MstRole entity) { return delegateDeleteNonstrict(entity, option); } });
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
     * @param mstRoleList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<MstRole> mstRoleList) {
        return doBatchInsert(mstRoleList, null);
    }

    protected int[] doBatchInsert(List<MstRole> mstRoleList, InsertOption<MstRoleCB> option) {
        assertObjectNotNull("mstRoleList", mstRoleList);
        prepareInsertOption(option);
        return delegateBatchInsert(mstRoleList, option);
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
     * @param mstRoleList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MstRole> mstRoleList) {
        return doBatchUpdate(mstRoleList, null);
    }

    protected int[] doBatchUpdate(List<MstRole> mstRoleList, UpdateOption<MstRoleCB> option) {
        assertObjectNotNull("mstRoleList", mstRoleList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(mstRoleList, option);
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
     * @param mstRoleList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MstRole> mstRoleList, SpecifyQuery<MstRoleCB> updateColumnSpec) {
        return doBatchUpdate(mstRoleList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are update target. {NOT modified only}
     * @param mstRoleList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<MstRole> mstRoleList) {
        return doBatchUpdateNonstrict(mstRoleList, null);
    }

    protected int[] doBatchUpdateNonstrict(List<MstRole> mstRoleList, UpdateOption<MstRoleCB> option) {
        assertObjectNotNull("mstRoleList", mstRoleList);
        prepareUpdateOption(option);
        return delegateBatchUpdateNonstrict(mstRoleList, option);
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistick lock column because they are specified implicitly.
     * @param mstRoleList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<MstRole> mstRoleList, SpecifyQuery<MstRoleCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(mstRoleList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param mstRoleList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MstRole> mstRoleList) {
        return doBatchDelete(mstRoleList, null);
    }

    protected int[] doBatchDelete(List<MstRole> mstRoleList, DeleteOption<MstRoleCB> option) {
        assertObjectNotNull("mstRoleList", mstRoleList);
        prepareDeleteOption(option);
        return delegateBatchDelete(mstRoleList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param mstRoleList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<MstRole> mstRoleList) {
        return doBatchDeleteNonstrict(mstRoleList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<MstRole> mstRoleList, DeleteOption<MstRoleCB> option) {
        assertObjectNotNull("mstRoleList", mstRoleList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(mstRoleList, option);
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
     * mstRoleBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;MstRole, MstRoleCB&gt;() {
     *     public ConditionBean setup(mstRole entity, MstRoleCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MstRole, MstRoleCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<MstRole, MstRoleCB> setupper, InsertOption<MstRoleCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        MstRole entity = new MstRole();
        MstRoleCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected MstRoleCB createCBForQueryInsert() {
        MstRoleCB cb = newMyConditionBean();
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
     * MstRole mstRole = new MstRole();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mstRole.setPK...(value);</span>
     * mstRole.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mstRole.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mstRole.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstRole.setVersionNo(value);</span>
     * MstRoleCB cb = new MstRoleCB();
     * cb.query().setFoo...(value);
     * mstRoleBhv.<span style="color: #FD4747">queryUpdate</span>(mstRole, cb);
     * </pre>
     * @param mstRole The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MstRole. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MstRole mstRole, MstRoleCB cb) {
        return doQueryUpdate(mstRole, cb, null);
    }

    protected int doQueryUpdate(MstRole mstRole, MstRoleCB cb, UpdateOption<MstRoleCB> option) {
        assertObjectNotNull("mstRole", mstRole); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(mstRole, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (MstRoleCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (MstRoleCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * MstRoleCB cb = new MstRoleCB();
     * cb.query().setFoo...(value);
     * mstRoleBhv.<span style="color: #FD4747">queryDelete</span>(mstRole, cb);
     * </pre>
     * @param cb The condition-bean of MstRole. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MstRoleCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(MstRoleCB cb, DeleteOption<MstRoleCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((MstRoleCB)cb); }
        else { return varyingQueryDelete((MstRoleCB)cb, downcast(option)); }
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
     * MstRole mstRole = new MstRole();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mstRole.setFoo...(value);
     * mstRole.setBar...(value);
     * InsertOption<MstRoleCB> option = new InsertOption<MstRoleCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * mstRoleBhv.<span style="color: #FD4747">varyingInsert</span>(mstRole, option);
     * ... = mstRole.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mstRole The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(MstRole mstRole, InsertOption<MstRoleCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(mstRole, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MstRole mstRole = new MstRole();
     * mstRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mstRole.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * mstRole.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MstRoleCB&gt; option = new UpdateOption&lt;MstRoleCB&gt;();
     *     option.self(new SpecifyQuery&lt;MstRoleCB&gt;() {
     *         public void specify(MstRoleCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     mstRoleBhv.<span style="color: #FD4747">varyingUpdate</span>(mstRole, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mstRole The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(MstRole mstRole, UpdateOption<MstRoleCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(mstRole, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. {UpdateCountZeroException, NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MstRole mstRole = new MstRole();
     * mstRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mstRole.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstRole.setVersionNo(value);</span>
     * UpdateOption&lt;MstRoleCB&gt; option = new UpdateOption&lt;MstRoleCB&gt;();
     * option.self(new SpecifyQuery&lt;MstRoleCB&gt;() {
     *     public void specify(MstRoleCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * mstRoleBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(mstRole, option);
     * </pre>
     * @param mstRole The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdateNonstrict(MstRole mstRole, UpdateOption<MstRoleCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(mstRole, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param mstRole The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(MstRole mstRole, InsertOption<MstRoleCB> insertOption, UpdateOption<MstRoleCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(mstRole, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. {NonExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mstRole The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdateNonstrict(MstRole mstRole, InsertOption<MstRoleCB> insertOption, UpdateOption<MstRoleCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(mstRole, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param mstRole The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MstRole mstRole, DeleteOption<MstRoleCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(mstRole, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. {UpdateCountZeroException, NonExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param mstRole The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MstRole mstRole, DeleteOption<MstRoleCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(mstRole, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param mstRoleList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<MstRole> mstRoleList, InsertOption<MstRoleCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(mstRoleList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param mstRoleList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<MstRole> mstRoleList, UpdateOption<MstRoleCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(mstRoleList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mstRoleList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdateNonstrict(List<MstRole> mstRoleList, UpdateOption<MstRoleCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(mstRoleList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param mstRoleList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<MstRole> mstRoleList, DeleteOption<MstRoleCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(mstRoleList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mstRoleList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDeleteNonstrict(List<MstRole> mstRoleList, DeleteOption<MstRoleCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(mstRoleList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<MstRole, MstRoleCB> setupper, InsertOption<MstRoleCB> option) {
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
     * MstRole mstRole = new MstRole();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mstRole.setPK...(value);</span>
     * mstRole.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstRole.setVersionNo(value);</span>
     * MstRoleCB cb = new MstRoleCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MstRoleCB&gt; option = new UpdateOption&lt;MstRoleCB&gt;();
     * option.self(new SpecifyQuery&lt;MstRoleCB&gt;() {
     *     public void specify(MstRoleCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * mstRoleBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(mstRole, cb, option);
     * </pre>
     * @param mstRole The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MstRole. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MstRole mstRole, MstRoleCB cb, UpdateOption<MstRoleCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(mstRole, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MstRole. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MstRoleCB cb, DeleteOption<MstRoleCB> option) {
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
    public OutsideSqlBasicExecutor<MstRoleBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(MstRoleCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(MstRoleCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends MstRole> void delegateSelectCursor(MstRoleCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends MstRole> List<ENTITY> delegateSelectList(MstRoleCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(MstRole e, InsertOption<MstRoleCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(MstRole e, UpdateOption<MstRoleCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(MstRole e, UpdateOption<MstRoleCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(MstRole e, DeleteOption<MstRoleCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(MstRole e, DeleteOption<MstRoleCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<MstRole> ls, InsertOption<MstRoleCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<MstRole> ls, UpdateOption<MstRoleCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<MstRole> ls, UpdateOption<MstRoleCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<MstRole> ls, DeleteOption<MstRoleCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<MstRole> ls, DeleteOption<MstRoleCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(MstRole e, MstRoleCB inCB, ConditionBean resCB, InsertOption<MstRoleCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(MstRole e, MstRoleCB cb, UpdateOption<MstRoleCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(MstRoleCB cb, DeleteOption<MstRoleCB> op)
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
    protected MstRole downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, MstRole.class);
    }

    protected MstRoleCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, MstRoleCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<MstRole> downcast(List<? extends Entity> entityList) {
        return (List<MstRole>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<MstRoleCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<MstRoleCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<MstRoleCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<MstRoleCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<MstRoleCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<MstRoleCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<MstRole, MstRoleCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<MstRole, MstRoleCB>)option;
    }
}

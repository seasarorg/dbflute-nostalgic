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
 * The behavior of MST_USER_ROLE as TABLE. <br />
 * <pre>
 * [primary key]
 *     USER_ROLE_ID
 * 
 * [column]
 *     USER_ROLE_ID, USER_ID, ROLE_ID, REGISTER_USER, REGISTER_DATETIME, UPDATE_USER, UPDATE_DATETIME, VERSION_NO
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
 *     MST_ROLE, MST_USER
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     mstRole, mstUser
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMstUserRoleBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "MST_USER_ROLE"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return MstUserRoleDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MstUserRoleDbm getMyDBMeta() { return MstUserRoleDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MstUserRole newMyEntity() { return new MstUserRole(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MstUserRoleCB newMyConditionBean() { return new MstUserRoleCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MstUserRoleCB cb = new MstUserRoleCB();
     * cb.query().setFoo...(value);
     * int count = mstUserRoleBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MstUserRole. (NotNull)
     * @return The selected count.
     */
    public int selectCount(MstUserRoleCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(MstUserRoleCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(MstUserRoleCB cb) { // called by selectPage(cb)
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
     * MstUserRoleCB cb = new MstUserRoleCB();
     * cb.query().setFoo...(value);
     * mstUserRoleBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MstUserRole&gt;() {
     *     public void handle(MstUserRole entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MstUserRole. (NotNull)
     * @param entityRowHandler The handler of entity row of MstUserRole. (NotNull)
     */
    public void selectCursor(MstUserRoleCB cb, EntityRowHandler<MstUserRole> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, MstUserRole.class);
    }

    protected <ENTITY extends MstUserRole> void doSelectCursor(MstUserRoleCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<MstUserRole>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * MstUserRoleCB cb = new MstUserRoleCB();
     * cb.query().setFoo...(value);
     * MstUserRole mstUserRole = mstUserRoleBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (mstUserRole != null) {
     *     ... = mstUserRole.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MstUserRole. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MstUserRole selectEntity(MstUserRoleCB cb) {
        return doSelectEntity(cb, MstUserRole.class);
    }

    protected <ENTITY extends MstUserRole> ENTITY doSelectEntity(final MstUserRoleCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, MstUserRoleCB>() {
            public List<ENTITY> callbackSelectList(MstUserRoleCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * MstUserRoleCB cb = new MstUserRoleCB();
     * cb.query().setFoo...(value);
     * MstUserRole mstUserRole = mstUserRoleBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mstUserRole.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MstUserRole. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MstUserRole selectEntityWithDeletedCheck(MstUserRoleCB cb) {
        return doSelectEntityWithDeletedCheck(cb, MstUserRole.class);
    }

    protected <ENTITY extends MstUserRole> ENTITY doSelectEntityWithDeletedCheck(final MstUserRoleCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, MstUserRoleCB>() {
            public List<ENTITY> callbackSelectList(MstUserRoleCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param userRoleId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MstUserRole selectByPKValue(Integer userRoleId) {
        return doSelectByPKValue(userRoleId, MstUserRole.class);
    }

    protected <ENTITY extends MstUserRole> ENTITY doSelectByPKValue(Integer userRoleId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(userRoleId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param userRoleId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MstUserRole selectByPKValueWithDeletedCheck(Integer userRoleId) {
        return doSelectByPKValueWithDeletedCheck(userRoleId, MstUserRole.class);
    }

    protected <ENTITY extends MstUserRole> ENTITY doSelectByPKValueWithDeletedCheck(Integer userRoleId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(userRoleId), entityType);
    }

    private MstUserRoleCB buildPKCB(Integer userRoleId) {
        assertObjectNotNull("userRoleId", userRoleId);
        MstUserRoleCB cb = newMyConditionBean();
        cb.query().setUserRoleId_Equal(userRoleId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MstUserRoleCB cb = new MstUserRoleCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MstUserRole&gt; mstUserRoleList = mstUserRoleBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (MstUserRole mstUserRole : mstUserRoleList) {
     *     ... = mstUserRole.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MstUserRole. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MstUserRole> selectList(MstUserRoleCB cb) {
        return doSelectList(cb, MstUserRole.class);
    }

    protected <ENTITY extends MstUserRole> ListResultBean<ENTITY> doSelectList(MstUserRoleCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, MstUserRoleCB>() {
            public List<ENTITY> callbackSelectList(MstUserRoleCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * MstUserRoleCB cb = new MstUserRoleCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MstUserRole&gt; page = mstUserRoleBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MstUserRole mstUserRole : page) {
     *     ... = mstUserRole.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MstUserRole. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MstUserRole> selectPage(MstUserRoleCB cb) {
        return doSelectPage(cb, MstUserRole.class);
    }

    protected <ENTITY extends MstUserRole> PagingResultBean<ENTITY> doSelectPage(MstUserRoleCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, MstUserRoleCB>() {
            public int callbackSelectCount(MstUserRoleCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(MstUserRoleCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * mstUserRoleBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MstUserRoleCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<MstUserRoleCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends MstUserRoleCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * Pull out the list of foreign table 'MstRole'.
     * @param mstUserRoleList The list of mstUserRole. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<MstRole> pulloutMstRole(List<MstUserRole> mstUserRoleList) {
        return helpPulloutInternally(mstUserRoleList, new InternalPulloutCallback<MstUserRole, MstRole>() {
            public MstRole getFr(MstUserRole e) { return e.getMstRole(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MstRole e, List<MstUserRole> ls)
            { e.setMstUserRoleList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'MstUser'.
     * @param mstUserRoleList The list of mstUserRole. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<MstUser> pulloutMstUser(List<MstUserRole> mstUserRoleList) {
        return helpPulloutInternally(mstUserRoleList, new InternalPulloutCallback<MstUserRole, MstUser>() {
            public MstUser getFr(MstUserRole e) { return e.getMstUser(); }
            public boolean hasRf() { return true; }
            public void setRfLs(MstUser e, List<MstUserRole> ls)
            { e.setMstUserRoleList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * MstUserRole mstUserRole = new MstUserRole();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mstUserRole.setFoo...(value);
     * mstUserRole.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mstUserRole.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mstUserRole.set...;</span>
     * mstUserRoleBhv.<span style="color: #FD4747">insert</span>(mstUserRole);
     * ... = mstUserRole.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mstUserRole The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(MstUserRole mstUserRole) {
        doInsert(mstUserRole, null);
    }

    protected void doInsert(MstUserRole mstUserRole, InsertOption<MstUserRoleCB> option) {
        assertObjectNotNull("mstUserRole", mstUserRole);
        prepareInsertOption(option);
        delegateInsert(mstUserRole, option);
    }

    protected void prepareInsertOption(InsertOption<MstUserRoleCB> option) {
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
     * MstUserRole mstUserRole = new MstUserRole();
     * mstUserRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mstUserRole.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mstUserRole.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mstUserRole.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * mstUserRole.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     mstUserRoleBhv.<span style="color: #FD4747">update</span>(mstUserRole);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param mstUserRole The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final MstUserRole mstUserRole) {
        doUpdate(mstUserRole, null);
    }

    protected void doUpdate(MstUserRole mstUserRole, final UpdateOption<MstUserRoleCB> option) {
        assertObjectNotNull("mstUserRole", mstUserRole);
        prepareUpdateOption(option);
        helpUpdateInternally(mstUserRole, new InternalUpdateCallback<MstUserRole>() {
            public int callbackDelegateUpdate(MstUserRole entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<MstUserRoleCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected MstUserRoleCB createCBForVaryingUpdate() {
        MstUserRoleCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected MstUserRoleCB createCBForSpecifiedUpdate() {
        MstUserRoleCB cb = newMyConditionBean();
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
     * MstUserRole mstUserRole = new MstUserRole();
     * mstUserRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mstUserRole.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mstUserRole.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mstUserRole.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstUserRole.setVersionNo(value);</span>
     * mstUserRoleBhv.<span style="color: #FD4747">updateNonstrict</span>(mstUserRole);
     * </pre>
     * @param mstUserRole The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final MstUserRole mstUserRole) {
        doUpdateNonstrict(mstUserRole, null);
    }

    protected void doUpdateNonstrict(MstUserRole mstUserRole, final UpdateOption<MstUserRoleCB> option) {
        assertObjectNotNull("mstUserRole", mstUserRole);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(mstUserRole, new InternalUpdateNonstrictCallback<MstUserRole>() {
            public int callbackDelegateUpdateNonstrict(MstUserRole entity) { return delegateUpdateNonstrict(entity, option); } });
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { updateNonstrict(downcast(entity)); }
        else { varyingUpdateNonstrict(downcast(entity), downcast(option)); }
    }

    /**
     * Insert or update the entity modified-only. {ExclusiveControl(when update)}
     * @param mstUserRole The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(MstUserRole mstUserRole) {
        doInesrtOrUpdate(mstUserRole, null, null);
    }

    protected void doInesrtOrUpdate(MstUserRole mstUserRole, final InsertOption<MstUserRoleCB> insertOption, final UpdateOption<MstUserRoleCB> updateOption) {
        helpInsertOrUpdateInternally(mstUserRole, new InternalInsertOrUpdateCallback<MstUserRole, MstUserRoleCB>() {
            public void callbackInsert(MstUserRole entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(MstUserRole entity) { doUpdate(entity, updateOption); }
            public MstUserRoleCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(MstUserRoleCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<MstUserRoleCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<MstUserRoleCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonExclusiveControl(when update)}
     * @param mstUserRole The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(MstUserRole mstUserRole) {
        doInesrtOrUpdateNonstrict(mstUserRole, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(MstUserRole mstUserRole, final InsertOption<MstUserRoleCB> insertOption, final UpdateOption<MstUserRoleCB> updateOption) {
        helpInsertOrUpdateInternally(mstUserRole, new InternalInsertOrUpdateNonstrictCallback<MstUserRole>() {
            public void callbackInsert(MstUserRole entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(MstUserRole entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<MstUserRoleCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<MstUserRoleCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * MstUserRole mstUserRole = new MstUserRole();
     * mstUserRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * mstUserRole.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     mstUserRoleBhv.<span style="color: #FD4747">delete</span>(mstUserRole);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param mstUserRole The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MstUserRole mstUserRole) {
        doDelete(mstUserRole, null);
    }

    protected void doDelete(MstUserRole mstUserRole, final DeleteOption<MstUserRoleCB> option) {
        assertObjectNotNull("mstUserRole", mstUserRole);
        prepareDeleteOption(option);
        helpDeleteInternally(mstUserRole, new InternalDeleteCallback<MstUserRole>() {
            public int callbackDelegateDelete(MstUserRole entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<MstUserRoleCB> option) {
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
     * MstUserRole mstUserRole = new MstUserRole();
     * mstUserRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstUserRole.setVersionNo(value);</span>
     * mstUserRoleBhv.<span style="color: #FD4747">deleteNonstrict</span>(mstUserRole);
     * </pre>
     * @param mstUserRole The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MstUserRole mstUserRole) {
        doDeleteNonstrict(mstUserRole, null);
    }

    protected void doDeleteNonstrict(MstUserRole mstUserRole, final DeleteOption<MstUserRoleCB> option) {
        assertObjectNotNull("mstUserRole", mstUserRole);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(mstUserRole, new InternalDeleteNonstrictCallback<MstUserRole>() {
            public int callbackDelegateDeleteNonstrict(MstUserRole entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonExclusiveControl}
     * <pre>
     * MstUserRole mstUserRole = new MstUserRole();
     * mstUserRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstUserRole.setVersionNo(value);</span>
     * mstUserRoleBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(mstUserRole);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mstUserRole The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MstUserRole mstUserRole) {
        doDeleteNonstrictIgnoreDeleted(mstUserRole, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MstUserRole mstUserRole, final DeleteOption<MstUserRoleCB> option) {
        assertObjectNotNull("mstUserRole", mstUserRole);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(mstUserRole, new InternalDeleteNonstrictIgnoreDeletedCallback<MstUserRole>() {
            public int callbackDelegateDeleteNonstrict(MstUserRole entity) { return delegateDeleteNonstrict(entity, option); } });
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
     * @param mstUserRoleList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<MstUserRole> mstUserRoleList) {
        return doBatchInsert(mstUserRoleList, null);
    }

    protected int[] doBatchInsert(List<MstUserRole> mstUserRoleList, InsertOption<MstUserRoleCB> option) {
        assertObjectNotNull("mstUserRoleList", mstUserRoleList);
        prepareInsertOption(option);
        return delegateBatchInsert(mstUserRoleList, option);
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
     * @param mstUserRoleList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MstUserRole> mstUserRoleList) {
        return doBatchUpdate(mstUserRoleList, null);
    }

    protected int[] doBatchUpdate(List<MstUserRole> mstUserRoleList, UpdateOption<MstUserRoleCB> option) {
        assertObjectNotNull("mstUserRoleList", mstUserRoleList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(mstUserRoleList, option);
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
     * @param mstUserRoleList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MstUserRole> mstUserRoleList, SpecifyQuery<MstUserRoleCB> updateColumnSpec) {
        return doBatchUpdate(mstUserRoleList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are update target. {NOT modified only}
     * @param mstUserRoleList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<MstUserRole> mstUserRoleList) {
        return doBatchUpdateNonstrict(mstUserRoleList, null);
    }

    protected int[] doBatchUpdateNonstrict(List<MstUserRole> mstUserRoleList, UpdateOption<MstUserRoleCB> option) {
        assertObjectNotNull("mstUserRoleList", mstUserRoleList);
        prepareUpdateOption(option);
        return delegateBatchUpdateNonstrict(mstUserRoleList, option);
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistick lock column because they are specified implicitly.
     * @param mstUserRoleList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<MstUserRole> mstUserRoleList, SpecifyQuery<MstUserRoleCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(mstUserRoleList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param mstUserRoleList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MstUserRole> mstUserRoleList) {
        return doBatchDelete(mstUserRoleList, null);
    }

    protected int[] doBatchDelete(List<MstUserRole> mstUserRoleList, DeleteOption<MstUserRoleCB> option) {
        assertObjectNotNull("mstUserRoleList", mstUserRoleList);
        prepareDeleteOption(option);
        return delegateBatchDelete(mstUserRoleList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param mstUserRoleList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<MstUserRole> mstUserRoleList) {
        return doBatchDeleteNonstrict(mstUserRoleList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<MstUserRole> mstUserRoleList, DeleteOption<MstUserRoleCB> option) {
        assertObjectNotNull("mstUserRoleList", mstUserRoleList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(mstUserRoleList, option);
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
     * mstUserRoleBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;MstUserRole, MstUserRoleCB&gt;() {
     *     public ConditionBean setup(mstUserRole entity, MstUserRoleCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MstUserRole, MstUserRoleCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<MstUserRole, MstUserRoleCB> setupper, InsertOption<MstUserRoleCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        MstUserRole entity = new MstUserRole();
        MstUserRoleCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected MstUserRoleCB createCBForQueryInsert() {
        MstUserRoleCB cb = newMyConditionBean();
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
     * MstUserRole mstUserRole = new MstUserRole();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mstUserRole.setPK...(value);</span>
     * mstUserRole.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mstUserRole.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mstUserRole.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstUserRole.setVersionNo(value);</span>
     * MstUserRoleCB cb = new MstUserRoleCB();
     * cb.query().setFoo...(value);
     * mstUserRoleBhv.<span style="color: #FD4747">queryUpdate</span>(mstUserRole, cb);
     * </pre>
     * @param mstUserRole The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MstUserRole. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MstUserRole mstUserRole, MstUserRoleCB cb) {
        return doQueryUpdate(mstUserRole, cb, null);
    }

    protected int doQueryUpdate(MstUserRole mstUserRole, MstUserRoleCB cb, UpdateOption<MstUserRoleCB> option) {
        assertObjectNotNull("mstUserRole", mstUserRole); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(mstUserRole, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (MstUserRoleCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (MstUserRoleCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * MstUserRoleCB cb = new MstUserRoleCB();
     * cb.query().setFoo...(value);
     * mstUserRoleBhv.<span style="color: #FD4747">queryDelete</span>(mstUserRole, cb);
     * </pre>
     * @param cb The condition-bean of MstUserRole. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MstUserRoleCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(MstUserRoleCB cb, DeleteOption<MstUserRoleCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((MstUserRoleCB)cb); }
        else { return varyingQueryDelete((MstUserRoleCB)cb, downcast(option)); }
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
     * MstUserRole mstUserRole = new MstUserRole();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mstUserRole.setFoo...(value);
     * mstUserRole.setBar...(value);
     * InsertOption<MstUserRoleCB> option = new InsertOption<MstUserRoleCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * mstUserRoleBhv.<span style="color: #FD4747">varyingInsert</span>(mstUserRole, option);
     * ... = mstUserRole.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mstUserRole The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(MstUserRole mstUserRole, InsertOption<MstUserRoleCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(mstUserRole, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MstUserRole mstUserRole = new MstUserRole();
     * mstUserRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mstUserRole.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * mstUserRole.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MstUserRoleCB&gt; option = new UpdateOption&lt;MstUserRoleCB&gt;();
     *     option.self(new SpecifyQuery&lt;MstUserRoleCB&gt;() {
     *         public void specify(MstUserRoleCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     mstUserRoleBhv.<span style="color: #FD4747">varyingUpdate</span>(mstUserRole, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mstUserRole The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(MstUserRole mstUserRole, UpdateOption<MstUserRoleCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(mstUserRole, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. {UpdateCountZeroException, NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MstUserRole mstUserRole = new MstUserRole();
     * mstUserRole.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mstUserRole.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstUserRole.setVersionNo(value);</span>
     * UpdateOption&lt;MstUserRoleCB&gt; option = new UpdateOption&lt;MstUserRoleCB&gt;();
     * option.self(new SpecifyQuery&lt;MstUserRoleCB&gt;() {
     *     public void specify(MstUserRoleCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * mstUserRoleBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(mstUserRole, option);
     * </pre>
     * @param mstUserRole The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdateNonstrict(MstUserRole mstUserRole, UpdateOption<MstUserRoleCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(mstUserRole, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param mstUserRole The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(MstUserRole mstUserRole, InsertOption<MstUserRoleCB> insertOption, UpdateOption<MstUserRoleCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(mstUserRole, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. {NonExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mstUserRole The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdateNonstrict(MstUserRole mstUserRole, InsertOption<MstUserRoleCB> insertOption, UpdateOption<MstUserRoleCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(mstUserRole, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param mstUserRole The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MstUserRole mstUserRole, DeleteOption<MstUserRoleCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(mstUserRole, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. {UpdateCountZeroException, NonExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param mstUserRole The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MstUserRole mstUserRole, DeleteOption<MstUserRoleCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(mstUserRole, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param mstUserRoleList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<MstUserRole> mstUserRoleList, InsertOption<MstUserRoleCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(mstUserRoleList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param mstUserRoleList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<MstUserRole> mstUserRoleList, UpdateOption<MstUserRoleCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(mstUserRoleList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mstUserRoleList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdateNonstrict(List<MstUserRole> mstUserRoleList, UpdateOption<MstUserRoleCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(mstUserRoleList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param mstUserRoleList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<MstUserRole> mstUserRoleList, DeleteOption<MstUserRoleCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(mstUserRoleList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mstUserRoleList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDeleteNonstrict(List<MstUserRole> mstUserRoleList, DeleteOption<MstUserRoleCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(mstUserRoleList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<MstUserRole, MstUserRoleCB> setupper, InsertOption<MstUserRoleCB> option) {
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
     * MstUserRole mstUserRole = new MstUserRole();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mstUserRole.setPK...(value);</span>
     * mstUserRole.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mstUserRole.setVersionNo(value);</span>
     * MstUserRoleCB cb = new MstUserRoleCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MstUserRoleCB&gt; option = new UpdateOption&lt;MstUserRoleCB&gt;();
     * option.self(new SpecifyQuery&lt;MstUserRoleCB&gt;() {
     *     public void specify(MstUserRoleCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * mstUserRoleBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(mstUserRole, cb, option);
     * </pre>
     * @param mstUserRole The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MstUserRole. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MstUserRole mstUserRole, MstUserRoleCB cb, UpdateOption<MstUserRoleCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(mstUserRole, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MstUserRole. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MstUserRoleCB cb, DeleteOption<MstUserRoleCB> option) {
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
    public OutsideSqlBasicExecutor<MstUserRoleBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(MstUserRoleCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(MstUserRoleCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends MstUserRole> void delegateSelectCursor(MstUserRoleCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends MstUserRole> List<ENTITY> delegateSelectList(MstUserRoleCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(MstUserRole e, InsertOption<MstUserRoleCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(MstUserRole e, UpdateOption<MstUserRoleCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(MstUserRole e, UpdateOption<MstUserRoleCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(MstUserRole e, DeleteOption<MstUserRoleCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(MstUserRole e, DeleteOption<MstUserRoleCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<MstUserRole> ls, InsertOption<MstUserRoleCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<MstUserRole> ls, UpdateOption<MstUserRoleCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<MstUserRole> ls, UpdateOption<MstUserRoleCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<MstUserRole> ls, DeleteOption<MstUserRoleCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<MstUserRole> ls, DeleteOption<MstUserRoleCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(MstUserRole e, MstUserRoleCB inCB, ConditionBean resCB, InsertOption<MstUserRoleCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(MstUserRole e, MstUserRoleCB cb, UpdateOption<MstUserRoleCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(MstUserRoleCB cb, DeleteOption<MstUserRoleCB> op)
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
    protected MstUserRole downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, MstUserRole.class);
    }

    protected MstUserRoleCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, MstUserRoleCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<MstUserRole> downcast(List<? extends Entity> entityList) {
        return (List<MstUserRole>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<MstUserRoleCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<MstUserRoleCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<MstUserRoleCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<MstUserRoleCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<MstUserRoleCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<MstUserRoleCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<MstUserRole, MstUserRoleCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<MstUserRole, MstUserRoleCB>)option;
    }
}

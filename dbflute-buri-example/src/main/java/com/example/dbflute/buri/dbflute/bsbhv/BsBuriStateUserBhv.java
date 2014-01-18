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
 * The behavior of BURISTATEUSER as TABLE. <br />
 * {Buri Internal}
 * <pre>
 * [primary key]
 *     STATEUSERID
 * 
 * [column]
 *     STATEUSERID, STATEID, BURIUSERID, INSERTDATE, DELETEDATE
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
 *     BURISTATE, BURIUSER
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     buriState, buriUser
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriStateUserBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BURISTATEUSER"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return BuriStateUserDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BuriStateUserDbm getMyDBMeta() { return BuriStateUserDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BuriStateUser newMyEntity() { return new BuriStateUser(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BuriStateUserCB newMyConditionBean() { return new BuriStateUserCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BuriStateUserCB cb = new BuriStateUserCB();
     * cb.query().setFoo...(value);
     * int count = buriStateUserBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BuriStateUser. (NotNull)
     * @return The selected count.
     */
    public int selectCount(BuriStateUserCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(BuriStateUserCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(BuriStateUserCB cb) { // called by selectPage(cb)
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
     * BuriStateUserCB cb = new BuriStateUserCB();
     * cb.query().setFoo...(value);
     * buriStateUserBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;BuriStateUser&gt;() {
     *     public void handle(BuriStateUser entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of BuriStateUser. (NotNull)
     * @param entityRowHandler The handler of entity row of BuriStateUser. (NotNull)
     */
    public void selectCursor(BuriStateUserCB cb, EntityRowHandler<BuriStateUser> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, BuriStateUser.class);
    }

    protected <ENTITY extends BuriStateUser> void doSelectCursor(BuriStateUserCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<BuriStateUser>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * BuriStateUserCB cb = new BuriStateUserCB();
     * cb.query().setFoo...(value);
     * BuriStateUser buriStateUser = buriStateUserBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (buriStateUser != null) {
     *     ... = buriStateUser.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BuriStateUser. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriStateUser selectEntity(BuriStateUserCB cb) {
        return doSelectEntity(cb, BuriStateUser.class);
    }

    protected <ENTITY extends BuriStateUser> ENTITY doSelectEntity(final BuriStateUserCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, BuriStateUserCB>() {
            public List<ENTITY> callbackSelectList(BuriStateUserCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * BuriStateUserCB cb = new BuriStateUserCB();
     * cb.query().setFoo...(value);
     * BuriStateUser buriStateUser = buriStateUserBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = buriStateUser.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BuriStateUser. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriStateUser selectEntityWithDeletedCheck(BuriStateUserCB cb) {
        return doSelectEntityWithDeletedCheck(cb, BuriStateUser.class);
    }

    protected <ENTITY extends BuriStateUser> ENTITY doSelectEntityWithDeletedCheck(final BuriStateUserCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, BuriStateUserCB>() {
            public List<ENTITY> callbackSelectList(BuriStateUserCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param stateUserId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriStateUser selectByPKValue(Long stateUserId) {
        return doSelectByPKValue(stateUserId, BuriStateUser.class);
    }

    protected <ENTITY extends BuriStateUser> ENTITY doSelectByPKValue(Long stateUserId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(stateUserId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param stateUserId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriStateUser selectByPKValueWithDeletedCheck(Long stateUserId) {
        return doSelectByPKValueWithDeletedCheck(stateUserId, BuriStateUser.class);
    }

    protected <ENTITY extends BuriStateUser> ENTITY doSelectByPKValueWithDeletedCheck(Long stateUserId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(stateUserId), entityType);
    }

    private BuriStateUserCB buildPKCB(Long stateUserId) {
        assertObjectNotNull("stateUserId", stateUserId);
        BuriStateUserCB cb = newMyConditionBean();
        cb.query().setStateUserId_Equal(stateUserId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BuriStateUserCB cb = new BuriStateUserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;BuriStateUser&gt; buriStateUserList = buriStateUserBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (BuriStateUser buriStateUser : buriStateUserList) {
     *     ... = buriStateUser.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriStateUser. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BuriStateUser> selectList(BuriStateUserCB cb) {
        return doSelectList(cb, BuriStateUser.class);
    }

    protected <ENTITY extends BuriStateUser> ListResultBean<ENTITY> doSelectList(BuriStateUserCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, BuriStateUserCB>() {
            public List<ENTITY> callbackSelectList(BuriStateUserCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * BuriStateUserCB cb = new BuriStateUserCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BuriStateUser&gt; page = buriStateUserBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (BuriStateUser buriStateUser : page) {
     *     ... = buriStateUser.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriStateUser. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BuriStateUser> selectPage(BuriStateUserCB cb) {
        return doSelectPage(cb, BuriStateUser.class);
    }

    protected <ENTITY extends BuriStateUser> PagingResultBean<ENTITY> doSelectPage(BuriStateUserCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, BuriStateUserCB>() {
            public int callbackSelectCount(BuriStateUserCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(BuriStateUserCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * buriStateUserBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(BuriStateUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<BuriStateUserCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends BuriStateUserCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * Pull out the list of foreign table 'BuriState'.
     * @param buriStateUserList The list of buriStateUser. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<BuriState> pulloutBuriState(List<BuriStateUser> buriStateUserList) {
        return helpPulloutInternally(buriStateUserList, new InternalPulloutCallback<BuriStateUser, BuriState>() {
            public BuriState getFr(BuriStateUser e) { return e.getBuriState(); }
            public boolean hasRf() { return true; }
            public void setRfLs(BuriState e, List<BuriStateUser> ls)
            { e.setBuriStateUserList(ls); }
        });
    }
    /**
     * Pull out the list of foreign table 'BuriUser'.
     * @param buriStateUserList The list of buriStateUser. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<BuriUser> pulloutBuriUser(List<BuriStateUser> buriStateUserList) {
        return helpPulloutInternally(buriStateUserList, new InternalPulloutCallback<BuriStateUser, BuriUser>() {
            public BuriUser getFr(BuriStateUser e) { return e.getBuriUser(); }
            public boolean hasRf() { return true; }
            public void setRfLs(BuriUser e, List<BuriStateUser> ls)
            { e.setBuriStateUserList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * BuriStateUser buriStateUser = new BuriStateUser();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriStateUser.setFoo...(value);
     * buriStateUser.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriStateUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriStateUser.set...;</span>
     * buriStateUserBhv.<span style="color: #FD4747">insert</span>(buriStateUser);
     * ... = buriStateUser.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriStateUser The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(BuriStateUser buriStateUser) {
        doInsert(buriStateUser, null);
    }

    protected void doInsert(BuriStateUser buriStateUser, InsertOption<BuriStateUserCB> option) {
        assertObjectNotNull("buriStateUser", buriStateUser);
        prepareInsertOption(option);
        delegateInsert(buriStateUser, option);
    }

    protected void prepareInsertOption(InsertOption<BuriStateUserCB> option) {
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
     * BuriStateUser buriStateUser = new BuriStateUser();
     * buriStateUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriStateUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriStateUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriStateUser.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriStateUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriStateUserBhv.<span style="color: #FD4747">update</span>(buriStateUser);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriStateUser The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final BuriStateUser buriStateUser) {
        doUpdate(buriStateUser, null);
    }

    protected void doUpdate(BuriStateUser buriStateUser, final UpdateOption<BuriStateUserCB> option) {
        assertObjectNotNull("buriStateUser", buriStateUser);
        prepareUpdateOption(option);
        helpUpdateInternally(buriStateUser, new InternalUpdateCallback<BuriStateUser>() {
            public int callbackDelegateUpdate(BuriStateUser entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<BuriStateUserCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected BuriStateUserCB createCBForVaryingUpdate() {
        BuriStateUserCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected BuriStateUserCB createCBForSpecifiedUpdate() {
        BuriStateUserCB cb = newMyConditionBean();
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
     * @param buriStateUser The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(BuriStateUser buriStateUser) {
        doInesrtOrUpdate(buriStateUser, null, null);
    }

    protected void doInesrtOrUpdate(BuriStateUser buriStateUser, final InsertOption<BuriStateUserCB> insertOption, final UpdateOption<BuriStateUserCB> updateOption) {
        helpInsertOrUpdateInternally(buriStateUser, new InternalInsertOrUpdateCallback<BuriStateUser, BuriStateUserCB>() {
            public void callbackInsert(BuriStateUser entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(BuriStateUser entity) { doUpdate(entity, updateOption); }
            public BuriStateUserCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(BuriStateUserCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<BuriStateUserCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<BuriStateUserCB>() : updateOption;
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
     * BuriStateUser buriStateUser = new BuriStateUser();
     * buriStateUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriStateUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriStateUserBhv.<span style="color: #FD4747">delete</span>(buriStateUser);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriStateUser The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BuriStateUser buriStateUser) {
        doDelete(buriStateUser, null);
    }

    protected void doDelete(BuriStateUser buriStateUser, final DeleteOption<BuriStateUserCB> option) {
        assertObjectNotNull("buriStateUser", buriStateUser);
        prepareDeleteOption(option);
        helpDeleteInternally(buriStateUser, new InternalDeleteCallback<BuriStateUser>() {
            public int callbackDelegateDelete(BuriStateUser entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<BuriStateUserCB> option) {
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
     * @param buriStateUserList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<BuriStateUser> buriStateUserList) {
        return doBatchInsert(buriStateUserList, null);
    }

    protected int[] doBatchInsert(List<BuriStateUser> buriStateUserList, InsertOption<BuriStateUserCB> option) {
        assertObjectNotNull("buriStateUserList", buriStateUserList);
        prepareInsertOption(option);
        return delegateBatchInsert(buriStateUserList, option);
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
     * @param buriStateUserList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<BuriStateUser> buriStateUserList) {
        return doBatchUpdate(buriStateUserList, null);
    }

    protected int[] doBatchUpdate(List<BuriStateUser> buriStateUserList, UpdateOption<BuriStateUserCB> option) {
        assertObjectNotNull("buriStateUserList", buriStateUserList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(buriStateUserList, option);
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
     * @param buriStateUserList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<BuriStateUser> buriStateUserList, SpecifyQuery<BuriStateUserCB> updateColumnSpec) {
        return doBatchUpdate(buriStateUserList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param buriStateUserList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<BuriStateUser> buriStateUserList) {
        return doBatchDelete(buriStateUserList, null);
    }

    protected int[] doBatchDelete(List<BuriStateUser> buriStateUserList, DeleteOption<BuriStateUserCB> option) {
        assertObjectNotNull("buriStateUserList", buriStateUserList);
        prepareDeleteOption(option);
        return delegateBatchDelete(buriStateUserList, option);
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
     * buriStateUserBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;BuriStateUser, BuriStateUserCB&gt;() {
     *     public ConditionBean setup(buriStateUser entity, BuriStateUserCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BuriStateUser, BuriStateUserCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<BuriStateUser, BuriStateUserCB> setupper, InsertOption<BuriStateUserCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        BuriStateUser entity = new BuriStateUser();
        BuriStateUserCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected BuriStateUserCB createCBForQueryInsert() {
        BuriStateUserCB cb = newMyConditionBean();
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
     * BuriStateUser buriStateUser = new BuriStateUser();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriStateUser.setPK...(value);</span>
     * buriStateUser.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriStateUser.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriStateUser.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriStateUser.setVersionNo(value);</span>
     * BuriStateUserCB cb = new BuriStateUserCB();
     * cb.query().setFoo...(value);
     * buriStateUserBhv.<span style="color: #FD4747">queryUpdate</span>(buriStateUser, cb);
     * </pre>
     * @param buriStateUser The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BuriStateUser. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BuriStateUser buriStateUser, BuriStateUserCB cb) {
        return doQueryUpdate(buriStateUser, cb, null);
    }

    protected int doQueryUpdate(BuriStateUser buriStateUser, BuriStateUserCB cb, UpdateOption<BuriStateUserCB> option) {
        assertObjectNotNull("buriStateUser", buriStateUser); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(buriStateUser, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (BuriStateUserCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (BuriStateUserCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * BuriStateUserCB cb = new BuriStateUserCB();
     * cb.query().setFoo...(value);
     * buriStateUserBhv.<span style="color: #FD4747">queryDelete</span>(buriStateUser, cb);
     * </pre>
     * @param cb The condition-bean of BuriStateUser. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BuriStateUserCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(BuriStateUserCB cb, DeleteOption<BuriStateUserCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((BuriStateUserCB)cb); }
        else { return varyingQueryDelete((BuriStateUserCB)cb, downcast(option)); }
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
     * BuriStateUser buriStateUser = new BuriStateUser();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriStateUser.setFoo...(value);
     * buriStateUser.setBar...(value);
     * InsertOption<BuriStateUserCB> option = new InsertOption<BuriStateUserCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * buriStateUserBhv.<span style="color: #FD4747">varyingInsert</span>(buriStateUser, option);
     * ... = buriStateUser.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriStateUser The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(BuriStateUser buriStateUser, InsertOption<BuriStateUserCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(buriStateUser, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * BuriStateUser buriStateUser = new BuriStateUser();
     * buriStateUser.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriStateUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriStateUser.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;BuriStateUserCB&gt; option = new UpdateOption&lt;BuriStateUserCB&gt;();
     *     option.self(new SpecifyQuery&lt;BuriStateUserCB&gt;() {
     *         public void specify(BuriStateUserCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     buriStateUserBhv.<span style="color: #FD4747">varyingUpdate</span>(buriStateUser, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param buriStateUser The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(BuriStateUser buriStateUser, UpdateOption<BuriStateUserCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(buriStateUser, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param buriStateUser The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(BuriStateUser buriStateUser, InsertOption<BuriStateUserCB> insertOption, UpdateOption<BuriStateUserCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(buriStateUser, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param buriStateUser The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BuriStateUser buriStateUser, DeleteOption<BuriStateUserCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(buriStateUser, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param buriStateUserList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<BuriStateUser> buriStateUserList, InsertOption<BuriStateUserCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(buriStateUserList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param buriStateUserList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<BuriStateUser> buriStateUserList, UpdateOption<BuriStateUserCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(buriStateUserList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param buriStateUserList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<BuriStateUser> buriStateUserList, DeleteOption<BuriStateUserCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(buriStateUserList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<BuriStateUser, BuriStateUserCB> setupper, InsertOption<BuriStateUserCB> option) {
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
     * BuriStateUser buriStateUser = new BuriStateUser();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriStateUser.setPK...(value);</span>
     * buriStateUser.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriStateUser.setVersionNo(value);</span>
     * BuriStateUserCB cb = new BuriStateUserCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;BuriStateUserCB&gt; option = new UpdateOption&lt;BuriStateUserCB&gt;();
     * option.self(new SpecifyQuery&lt;BuriStateUserCB&gt;() {
     *     public void specify(BuriStateUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * buriStateUserBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(buriStateUser, cb, option);
     * </pre>
     * @param buriStateUser The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BuriStateUser. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BuriStateUser buriStateUser, BuriStateUserCB cb, UpdateOption<BuriStateUserCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(buriStateUser, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of BuriStateUser. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BuriStateUserCB cb, DeleteOption<BuriStateUserCB> option) {
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
    public OutsideSqlBasicExecutor<BuriStateUserBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(BuriStateUserCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(BuriStateUserCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends BuriStateUser> void delegateSelectCursor(BuriStateUserCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends BuriStateUser> List<ENTITY> delegateSelectList(BuriStateUserCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(BuriStateUser e, InsertOption<BuriStateUserCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(BuriStateUser e, UpdateOption<BuriStateUserCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(BuriStateUser e, UpdateOption<BuriStateUserCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(BuriStateUser e, DeleteOption<BuriStateUserCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(BuriStateUser e, DeleteOption<BuriStateUserCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<BuriStateUser> ls, InsertOption<BuriStateUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<BuriStateUser> ls, UpdateOption<BuriStateUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<BuriStateUser> ls, UpdateOption<BuriStateUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<BuriStateUser> ls, DeleteOption<BuriStateUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<BuriStateUser> ls, DeleteOption<BuriStateUserCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(BuriStateUser e, BuriStateUserCB inCB, ConditionBean resCB, InsertOption<BuriStateUserCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(BuriStateUser e, BuriStateUserCB cb, UpdateOption<BuriStateUserCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(BuriStateUserCB cb, DeleteOption<BuriStateUserCB> op)
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
    protected BuriStateUser downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, BuriStateUser.class);
    }

    protected BuriStateUserCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, BuriStateUserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<BuriStateUser> downcast(List<? extends Entity> entityList) {
        return (List<BuriStateUser>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<BuriStateUserCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<BuriStateUserCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<BuriStateUserCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<BuriStateUserCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<BuriStateUserCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<BuriStateUserCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<BuriStateUser, BuriStateUserCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<BuriStateUser, BuriStateUserCB>)option;
    }
}

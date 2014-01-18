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
 * The behavior of BURITRANSACTION as TABLE. <br />
 * {Buri Internal}
 * <pre>
 * [primary key]
 *     BTID
 * 
 * [column]
 *     BTID, INSERTDATE, VERSIONNO
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
public abstract class BsBuriTransactionBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BURITRANSACTION"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return BuriTransactionDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BuriTransactionDbm getMyDBMeta() { return BuriTransactionDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BuriTransaction newMyEntity() { return new BuriTransaction(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BuriTransactionCB newMyConditionBean() { return new BuriTransactionCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BuriTransactionCB cb = new BuriTransactionCB();
     * cb.query().setFoo...(value);
     * int count = buriTransactionBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BuriTransaction. (NotNull)
     * @return The selected count.
     */
    public int selectCount(BuriTransactionCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(BuriTransactionCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(BuriTransactionCB cb) { // called by selectPage(cb)
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
     * BuriTransactionCB cb = new BuriTransactionCB();
     * cb.query().setFoo...(value);
     * buriTransactionBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;BuriTransaction&gt;() {
     *     public void handle(BuriTransaction entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of BuriTransaction. (NotNull)
     * @param entityRowHandler The handler of entity row of BuriTransaction. (NotNull)
     */
    public void selectCursor(BuriTransactionCB cb, EntityRowHandler<BuriTransaction> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, BuriTransaction.class);
    }

    protected <ENTITY extends BuriTransaction> void doSelectCursor(BuriTransactionCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<BuriTransaction>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * BuriTransactionCB cb = new BuriTransactionCB();
     * cb.query().setFoo...(value);
     * BuriTransaction buriTransaction = buriTransactionBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (buriTransaction != null) {
     *     ... = buriTransaction.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BuriTransaction. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriTransaction selectEntity(BuriTransactionCB cb) {
        return doSelectEntity(cb, BuriTransaction.class);
    }

    protected <ENTITY extends BuriTransaction> ENTITY doSelectEntity(final BuriTransactionCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, BuriTransactionCB>() {
            public List<ENTITY> callbackSelectList(BuriTransactionCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * BuriTransactionCB cb = new BuriTransactionCB();
     * cb.query().setFoo...(value);
     * BuriTransaction buriTransaction = buriTransactionBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = buriTransaction.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BuriTransaction. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriTransaction selectEntityWithDeletedCheck(BuriTransactionCB cb) {
        return doSelectEntityWithDeletedCheck(cb, BuriTransaction.class);
    }

    protected <ENTITY extends BuriTransaction> ENTITY doSelectEntityWithDeletedCheck(final BuriTransactionCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, BuriTransactionCB>() {
            public List<ENTITY> callbackSelectList(BuriTransactionCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param btid The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriTransaction selectByPKValue(Long btid) {
        return doSelectByPKValue(btid, BuriTransaction.class);
    }

    protected <ENTITY extends BuriTransaction> ENTITY doSelectByPKValue(Long btid, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(btid), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param btid The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriTransaction selectByPKValueWithDeletedCheck(Long btid) {
        return doSelectByPKValueWithDeletedCheck(btid, BuriTransaction.class);
    }

    protected <ENTITY extends BuriTransaction> ENTITY doSelectByPKValueWithDeletedCheck(Long btid, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(btid), entityType);
    }

    private BuriTransactionCB buildPKCB(Long btid) {
        assertObjectNotNull("btid", btid);
        BuriTransactionCB cb = newMyConditionBean();
        cb.query().setBtid_Equal(btid);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BuriTransactionCB cb = new BuriTransactionCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;BuriTransaction&gt; buriTransactionList = buriTransactionBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (BuriTransaction buriTransaction : buriTransactionList) {
     *     ... = buriTransaction.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriTransaction. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BuriTransaction> selectList(BuriTransactionCB cb) {
        return doSelectList(cb, BuriTransaction.class);
    }

    protected <ENTITY extends BuriTransaction> ListResultBean<ENTITY> doSelectList(BuriTransactionCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, BuriTransactionCB>() {
            public List<ENTITY> callbackSelectList(BuriTransactionCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * BuriTransactionCB cb = new BuriTransactionCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BuriTransaction&gt; page = buriTransactionBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (BuriTransaction buriTransaction : page) {
     *     ... = buriTransaction.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriTransaction. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BuriTransaction> selectPage(BuriTransactionCB cb) {
        return doSelectPage(cb, BuriTransaction.class);
    }

    protected <ENTITY extends BuriTransaction> PagingResultBean<ENTITY> doSelectPage(BuriTransactionCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, BuriTransactionCB>() {
            public int callbackSelectCount(BuriTransactionCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(BuriTransactionCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * buriTransactionBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(BuriTransactionCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<BuriTransactionCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends BuriTransactionCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * BuriTransaction buriTransaction = new BuriTransaction();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriTransaction.setFoo...(value);
     * buriTransaction.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriTransaction.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriTransaction.set...;</span>
     * buriTransactionBhv.<span style="color: #FD4747">insert</span>(buriTransaction);
     * ... = buriTransaction.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriTransaction The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(BuriTransaction buriTransaction) {
        doInsert(buriTransaction, null);
    }

    protected void doInsert(BuriTransaction buriTransaction, InsertOption<BuriTransactionCB> option) {
        assertObjectNotNull("buriTransaction", buriTransaction);
        prepareInsertOption(option);
        delegateInsert(buriTransaction, option);
    }

    protected void prepareInsertOption(InsertOption<BuriTransactionCB> option) {
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
     * BuriTransaction buriTransaction = new BuriTransaction();
     * buriTransaction.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriTransaction.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriTransaction.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriTransaction.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriTransaction.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriTransactionBhv.<span style="color: #FD4747">update</span>(buriTransaction);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriTransaction The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final BuriTransaction buriTransaction) {
        doUpdate(buriTransaction, null);
    }

    protected void doUpdate(BuriTransaction buriTransaction, final UpdateOption<BuriTransactionCB> option) {
        assertObjectNotNull("buriTransaction", buriTransaction);
        prepareUpdateOption(option);
        helpUpdateInternally(buriTransaction, new InternalUpdateCallback<BuriTransaction>() {
            public int callbackDelegateUpdate(BuriTransaction entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<BuriTransactionCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected BuriTransactionCB createCBForVaryingUpdate() {
        BuriTransactionCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected BuriTransactionCB createCBForSpecifiedUpdate() {
        BuriTransactionCB cb = newMyConditionBean();
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
     * BuriTransaction buriTransaction = new BuriTransaction();
     * buriTransaction.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriTransaction.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriTransaction.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriTransaction.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriTransaction.setVersionNo(value);</span>
     * buriTransactionBhv.<span style="color: #FD4747">updateNonstrict</span>(buriTransaction);
     * </pre>
     * @param buriTransaction The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final BuriTransaction buriTransaction) {
        doUpdateNonstrict(buriTransaction, null);
    }

    protected void doUpdateNonstrict(BuriTransaction buriTransaction, final UpdateOption<BuriTransactionCB> option) {
        assertObjectNotNull("buriTransaction", buriTransaction);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(buriTransaction, new InternalUpdateNonstrictCallback<BuriTransaction>() {
            public int callbackDelegateUpdateNonstrict(BuriTransaction entity) { return delegateUpdateNonstrict(entity, option); } });
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { updateNonstrict(downcast(entity)); }
        else { varyingUpdateNonstrict(downcast(entity), downcast(option)); }
    }

    /**
     * Insert or update the entity modified-only. {ExclusiveControl(when update)}
     * @param buriTransaction The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(BuriTransaction buriTransaction) {
        doInesrtOrUpdate(buriTransaction, null, null);
    }

    protected void doInesrtOrUpdate(BuriTransaction buriTransaction, final InsertOption<BuriTransactionCB> insertOption, final UpdateOption<BuriTransactionCB> updateOption) {
        helpInsertOrUpdateInternally(buriTransaction, new InternalInsertOrUpdateCallback<BuriTransaction, BuriTransactionCB>() {
            public void callbackInsert(BuriTransaction entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(BuriTransaction entity) { doUpdate(entity, updateOption); }
            public BuriTransactionCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(BuriTransactionCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<BuriTransactionCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<BuriTransactionCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonExclusiveControl(when update)}
     * @param buriTransaction The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(BuriTransaction buriTransaction) {
        doInesrtOrUpdateNonstrict(buriTransaction, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(BuriTransaction buriTransaction, final InsertOption<BuriTransactionCB> insertOption, final UpdateOption<BuriTransactionCB> updateOption) {
        helpInsertOrUpdateInternally(buriTransaction, new InternalInsertOrUpdateNonstrictCallback<BuriTransaction>() {
            public void callbackInsert(BuriTransaction entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(BuriTransaction entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<BuriTransactionCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<BuriTransactionCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * BuriTransaction buriTransaction = new BuriTransaction();
     * buriTransaction.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriTransaction.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriTransactionBhv.<span style="color: #FD4747">delete</span>(buriTransaction);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriTransaction The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BuriTransaction buriTransaction) {
        doDelete(buriTransaction, null);
    }

    protected void doDelete(BuriTransaction buriTransaction, final DeleteOption<BuriTransactionCB> option) {
        assertObjectNotNull("buriTransaction", buriTransaction);
        prepareDeleteOption(option);
        helpDeleteInternally(buriTransaction, new InternalDeleteCallback<BuriTransaction>() {
            public int callbackDelegateDelete(BuriTransaction entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<BuriTransactionCB> option) {
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
     * BuriTransaction buriTransaction = new BuriTransaction();
     * buriTransaction.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriTransaction.setVersionNo(value);</span>
     * buriTransactionBhv.<span style="color: #FD4747">deleteNonstrict</span>(buriTransaction);
     * </pre>
     * @param buriTransaction The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BuriTransaction buriTransaction) {
        doDeleteNonstrict(buriTransaction, null);
    }

    protected void doDeleteNonstrict(BuriTransaction buriTransaction, final DeleteOption<BuriTransactionCB> option) {
        assertObjectNotNull("buriTransaction", buriTransaction);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(buriTransaction, new InternalDeleteNonstrictCallback<BuriTransaction>() {
            public int callbackDelegateDeleteNonstrict(BuriTransaction entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonExclusiveControl}
     * <pre>
     * BuriTransaction buriTransaction = new BuriTransaction();
     * buriTransaction.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriTransaction.setVersionNo(value);</span>
     * buriTransactionBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(buriTransaction);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param buriTransaction The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BuriTransaction buriTransaction) {
        doDeleteNonstrictIgnoreDeleted(buriTransaction, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BuriTransaction buriTransaction, final DeleteOption<BuriTransactionCB> option) {
        assertObjectNotNull("buriTransaction", buriTransaction);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(buriTransaction, new InternalDeleteNonstrictIgnoreDeletedCallback<BuriTransaction>() {
            public int callbackDelegateDeleteNonstrict(BuriTransaction entity) { return delegateDeleteNonstrict(entity, option); } });
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
     * @param buriTransactionList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<BuriTransaction> buriTransactionList) {
        return doBatchInsert(buriTransactionList, null);
    }

    protected int[] doBatchInsert(List<BuriTransaction> buriTransactionList, InsertOption<BuriTransactionCB> option) {
        assertObjectNotNull("buriTransactionList", buriTransactionList);
        prepareInsertOption(option);
        return delegateBatchInsert(buriTransactionList, option);
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
     * @param buriTransactionList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BuriTransaction> buriTransactionList) {
        return doBatchUpdate(buriTransactionList, null);
    }

    protected int[] doBatchUpdate(List<BuriTransaction> buriTransactionList, UpdateOption<BuriTransactionCB> option) {
        assertObjectNotNull("buriTransactionList", buriTransactionList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(buriTransactionList, option);
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
     * @param buriTransactionList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BuriTransaction> buriTransactionList, SpecifyQuery<BuriTransactionCB> updateColumnSpec) {
        return doBatchUpdate(buriTransactionList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are update target. {NOT modified only}
     * @param buriTransactionList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<BuriTransaction> buriTransactionList) {
        return doBatchUpdateNonstrict(buriTransactionList, null);
    }

    protected int[] doBatchUpdateNonstrict(List<BuriTransaction> buriTransactionList, UpdateOption<BuriTransactionCB> option) {
        assertObjectNotNull("buriTransactionList", buriTransactionList);
        prepareUpdateOption(option);
        return delegateBatchUpdateNonstrict(buriTransactionList, option);
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistick lock column because they are specified implicitly.
     * @param buriTransactionList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<BuriTransaction> buriTransactionList, SpecifyQuery<BuriTransactionCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(buriTransactionList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param buriTransactionList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BuriTransaction> buriTransactionList) {
        return doBatchDelete(buriTransactionList, null);
    }

    protected int[] doBatchDelete(List<BuriTransaction> buriTransactionList, DeleteOption<BuriTransactionCB> option) {
        assertObjectNotNull("buriTransactionList", buriTransactionList);
        prepareDeleteOption(option);
        return delegateBatchDelete(buriTransactionList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param buriTransactionList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<BuriTransaction> buriTransactionList) {
        return doBatchDeleteNonstrict(buriTransactionList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<BuriTransaction> buriTransactionList, DeleteOption<BuriTransactionCB> option) {
        assertObjectNotNull("buriTransactionList", buriTransactionList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(buriTransactionList, option);
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
     * buriTransactionBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;BuriTransaction, BuriTransactionCB&gt;() {
     *     public ConditionBean setup(buriTransaction entity, BuriTransactionCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BuriTransaction, BuriTransactionCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<BuriTransaction, BuriTransactionCB> setupper, InsertOption<BuriTransactionCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        BuriTransaction entity = new BuriTransaction();
        BuriTransactionCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected BuriTransactionCB createCBForQueryInsert() {
        BuriTransactionCB cb = newMyConditionBean();
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
     * BuriTransaction buriTransaction = new BuriTransaction();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriTransaction.setPK...(value);</span>
     * buriTransaction.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriTransaction.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriTransaction.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriTransaction.setVersionNo(value);</span>
     * BuriTransactionCB cb = new BuriTransactionCB();
     * cb.query().setFoo...(value);
     * buriTransactionBhv.<span style="color: #FD4747">queryUpdate</span>(buriTransaction, cb);
     * </pre>
     * @param buriTransaction The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BuriTransaction. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BuriTransaction buriTransaction, BuriTransactionCB cb) {
        return doQueryUpdate(buriTransaction, cb, null);
    }

    protected int doQueryUpdate(BuriTransaction buriTransaction, BuriTransactionCB cb, UpdateOption<BuriTransactionCB> option) {
        assertObjectNotNull("buriTransaction", buriTransaction); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(buriTransaction, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (BuriTransactionCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (BuriTransactionCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * BuriTransactionCB cb = new BuriTransactionCB();
     * cb.query().setFoo...(value);
     * buriTransactionBhv.<span style="color: #FD4747">queryDelete</span>(buriTransaction, cb);
     * </pre>
     * @param cb The condition-bean of BuriTransaction. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BuriTransactionCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(BuriTransactionCB cb, DeleteOption<BuriTransactionCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((BuriTransactionCB)cb); }
        else { return varyingQueryDelete((BuriTransactionCB)cb, downcast(option)); }
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
     * BuriTransaction buriTransaction = new BuriTransaction();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriTransaction.setFoo...(value);
     * buriTransaction.setBar...(value);
     * InsertOption<BuriTransactionCB> option = new InsertOption<BuriTransactionCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * buriTransactionBhv.<span style="color: #FD4747">varyingInsert</span>(buriTransaction, option);
     * ... = buriTransaction.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriTransaction The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(BuriTransaction buriTransaction, InsertOption<BuriTransactionCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(buriTransaction, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * BuriTransaction buriTransaction = new BuriTransaction();
     * buriTransaction.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriTransaction.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriTransaction.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;BuriTransactionCB&gt; option = new UpdateOption&lt;BuriTransactionCB&gt;();
     *     option.self(new SpecifyQuery&lt;BuriTransactionCB&gt;() {
     *         public void specify(BuriTransactionCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     buriTransactionBhv.<span style="color: #FD4747">varyingUpdate</span>(buriTransaction, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param buriTransaction The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(BuriTransaction buriTransaction, UpdateOption<BuriTransactionCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(buriTransaction, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. {UpdateCountZeroException, NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BuriTransaction buriTransaction = new BuriTransaction();
     * buriTransaction.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriTransaction.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriTransaction.setVersionNo(value);</span>
     * UpdateOption&lt;BuriTransactionCB&gt; option = new UpdateOption&lt;BuriTransactionCB&gt;();
     * option.self(new SpecifyQuery&lt;BuriTransactionCB&gt;() {
     *     public void specify(BuriTransactionCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * buriTransactionBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(buriTransaction, option);
     * </pre>
     * @param buriTransaction The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdateNonstrict(BuriTransaction buriTransaction, UpdateOption<BuriTransactionCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(buriTransaction, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param buriTransaction The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(BuriTransaction buriTransaction, InsertOption<BuriTransactionCB> insertOption, UpdateOption<BuriTransactionCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(buriTransaction, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. {NonExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param buriTransaction The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdateNonstrict(BuriTransaction buriTransaction, InsertOption<BuriTransactionCB> insertOption, UpdateOption<BuriTransactionCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(buriTransaction, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param buriTransaction The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BuriTransaction buriTransaction, DeleteOption<BuriTransactionCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(buriTransaction, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. {UpdateCountZeroException, NonExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param buriTransaction The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BuriTransaction buriTransaction, DeleteOption<BuriTransactionCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(buriTransaction, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param buriTransactionList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<BuriTransaction> buriTransactionList, InsertOption<BuriTransactionCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(buriTransactionList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param buriTransactionList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<BuriTransaction> buriTransactionList, UpdateOption<BuriTransactionCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(buriTransactionList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param buriTransactionList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdateNonstrict(List<BuriTransaction> buriTransactionList, UpdateOption<BuriTransactionCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(buriTransactionList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param buriTransactionList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<BuriTransaction> buriTransactionList, DeleteOption<BuriTransactionCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(buriTransactionList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param buriTransactionList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDeleteNonstrict(List<BuriTransaction> buriTransactionList, DeleteOption<BuriTransactionCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(buriTransactionList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<BuriTransaction, BuriTransactionCB> setupper, InsertOption<BuriTransactionCB> option) {
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
     * BuriTransaction buriTransaction = new BuriTransaction();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriTransaction.setPK...(value);</span>
     * buriTransaction.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriTransaction.setVersionNo(value);</span>
     * BuriTransactionCB cb = new BuriTransactionCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;BuriTransactionCB&gt; option = new UpdateOption&lt;BuriTransactionCB&gt;();
     * option.self(new SpecifyQuery&lt;BuriTransactionCB&gt;() {
     *     public void specify(BuriTransactionCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * buriTransactionBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(buriTransaction, cb, option);
     * </pre>
     * @param buriTransaction The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BuriTransaction. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BuriTransaction buriTransaction, BuriTransactionCB cb, UpdateOption<BuriTransactionCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(buriTransaction, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of BuriTransaction. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BuriTransactionCB cb, DeleteOption<BuriTransactionCB> option) {
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
    public OutsideSqlBasicExecutor<BuriTransactionBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(BuriTransactionCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(BuriTransactionCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends BuriTransaction> void delegateSelectCursor(BuriTransactionCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends BuriTransaction> List<ENTITY> delegateSelectList(BuriTransactionCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(BuriTransaction e, InsertOption<BuriTransactionCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(BuriTransaction e, UpdateOption<BuriTransactionCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(BuriTransaction e, UpdateOption<BuriTransactionCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(BuriTransaction e, DeleteOption<BuriTransactionCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(BuriTransaction e, DeleteOption<BuriTransactionCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<BuriTransaction> ls, InsertOption<BuriTransactionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<BuriTransaction> ls, UpdateOption<BuriTransactionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<BuriTransaction> ls, UpdateOption<BuriTransactionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<BuriTransaction> ls, DeleteOption<BuriTransactionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<BuriTransaction> ls, DeleteOption<BuriTransactionCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(BuriTransaction e, BuriTransactionCB inCB, ConditionBean resCB, InsertOption<BuriTransactionCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(BuriTransaction e, BuriTransactionCB cb, UpdateOption<BuriTransactionCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(BuriTransactionCB cb, DeleteOption<BuriTransactionCB> op)
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
    protected BuriTransaction downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, BuriTransaction.class);
    }

    protected BuriTransactionCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, BuriTransactionCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<BuriTransaction> downcast(List<? extends Entity> entityList) {
        return (List<BuriTransaction>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<BuriTransactionCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<BuriTransactionCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<BuriTransactionCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<BuriTransactionCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<BuriTransactionCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<BuriTransactionCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<BuriTransaction, BuriTransactionCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<BuriTransaction, BuriTransactionCB>)option;
    }
}

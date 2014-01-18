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
 * The behavior of BURIDATAPATHHISTORY as TABLE. <br />
 * {Buri Internal}
 * <pre>
 * [primary key]
 *     HISTORYID
 * 
 * [column]
 *     HISTORYID, PATHID, PATHNAME, DATAID, ACTION, BURIUSERID, BTID, INSERTDATE
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
public abstract class BsBuriDataPathHistoryBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BURIDATAPATHHISTORY"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return BuriDataPathHistoryDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BuriDataPathHistoryDbm getMyDBMeta() { return BuriDataPathHistoryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BuriDataPathHistory newMyEntity() { return new BuriDataPathHistory(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BuriDataPathHistoryCB newMyConditionBean() { return new BuriDataPathHistoryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB();
     * cb.query().setFoo...(value);
     * int count = buriDataPathHistoryBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BuriDataPathHistory. (NotNull)
     * @return The selected count.
     */
    public int selectCount(BuriDataPathHistoryCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(BuriDataPathHistoryCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(BuriDataPathHistoryCB cb) { // called by selectPage(cb)
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
     * BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB();
     * cb.query().setFoo...(value);
     * buriDataPathHistoryBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;BuriDataPathHistory&gt;() {
     *     public void handle(BuriDataPathHistory entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of BuriDataPathHistory. (NotNull)
     * @param entityRowHandler The handler of entity row of BuriDataPathHistory. (NotNull)
     */
    public void selectCursor(BuriDataPathHistoryCB cb, EntityRowHandler<BuriDataPathHistory> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, BuriDataPathHistory.class);
    }

    protected <ENTITY extends BuriDataPathHistory> void doSelectCursor(BuriDataPathHistoryCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<BuriDataPathHistory>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB();
     * cb.query().setFoo...(value);
     * BuriDataPathHistory buriDataPathHistory = buriDataPathHistoryBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (buriDataPathHistory != null) {
     *     ... = buriDataPathHistory.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BuriDataPathHistory. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriDataPathHistory selectEntity(BuriDataPathHistoryCB cb) {
        return doSelectEntity(cb, BuriDataPathHistory.class);
    }

    protected <ENTITY extends BuriDataPathHistory> ENTITY doSelectEntity(final BuriDataPathHistoryCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, BuriDataPathHistoryCB>() {
            public List<ENTITY> callbackSelectList(BuriDataPathHistoryCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB();
     * cb.query().setFoo...(value);
     * BuriDataPathHistory buriDataPathHistory = buriDataPathHistoryBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = buriDataPathHistory.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BuriDataPathHistory. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriDataPathHistory selectEntityWithDeletedCheck(BuriDataPathHistoryCB cb) {
        return doSelectEntityWithDeletedCheck(cb, BuriDataPathHistory.class);
    }

    protected <ENTITY extends BuriDataPathHistory> ENTITY doSelectEntityWithDeletedCheck(final BuriDataPathHistoryCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, BuriDataPathHistoryCB>() {
            public List<ENTITY> callbackSelectList(BuriDataPathHistoryCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param historyId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriDataPathHistory selectByPKValue(Long historyId) {
        return doSelectByPKValue(historyId, BuriDataPathHistory.class);
    }

    protected <ENTITY extends BuriDataPathHistory> ENTITY doSelectByPKValue(Long historyId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(historyId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param historyId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriDataPathHistory selectByPKValueWithDeletedCheck(Long historyId) {
        return doSelectByPKValueWithDeletedCheck(historyId, BuriDataPathHistory.class);
    }

    protected <ENTITY extends BuriDataPathHistory> ENTITY doSelectByPKValueWithDeletedCheck(Long historyId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(historyId), entityType);
    }

    private BuriDataPathHistoryCB buildPKCB(Long historyId) {
        assertObjectNotNull("historyId", historyId);
        BuriDataPathHistoryCB cb = newMyConditionBean();
        cb.query().setHistoryId_Equal(historyId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;BuriDataPathHistory&gt; buriDataPathHistoryList = buriDataPathHistoryBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (BuriDataPathHistory buriDataPathHistory : buriDataPathHistoryList) {
     *     ... = buriDataPathHistory.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriDataPathHistory. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BuriDataPathHistory> selectList(BuriDataPathHistoryCB cb) {
        return doSelectList(cb, BuriDataPathHistory.class);
    }

    protected <ENTITY extends BuriDataPathHistory> ListResultBean<ENTITY> doSelectList(BuriDataPathHistoryCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, BuriDataPathHistoryCB>() {
            public List<ENTITY> callbackSelectList(BuriDataPathHistoryCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BuriDataPathHistory&gt; page = buriDataPathHistoryBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (BuriDataPathHistory buriDataPathHistory : page) {
     *     ... = buriDataPathHistory.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriDataPathHistory. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BuriDataPathHistory> selectPage(BuriDataPathHistoryCB cb) {
        return doSelectPage(cb, BuriDataPathHistory.class);
    }

    protected <ENTITY extends BuriDataPathHistory> PagingResultBean<ENTITY> doSelectPage(BuriDataPathHistoryCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, BuriDataPathHistoryCB>() {
            public int callbackSelectCount(BuriDataPathHistoryCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(BuriDataPathHistoryCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * buriDataPathHistoryBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(BuriDataPathHistoryCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<BuriDataPathHistoryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends BuriDataPathHistoryCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * BuriDataPathHistory buriDataPathHistory = new BuriDataPathHistory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriDataPathHistory.setFoo...(value);
     * buriDataPathHistory.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriDataPathHistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriDataPathHistory.set...;</span>
     * buriDataPathHistoryBhv.<span style="color: #FD4747">insert</span>(buriDataPathHistory);
     * ... = buriDataPathHistory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriDataPathHistory The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(BuriDataPathHistory buriDataPathHistory) {
        doInsert(buriDataPathHistory, null);
    }

    protected void doInsert(BuriDataPathHistory buriDataPathHistory, InsertOption<BuriDataPathHistoryCB> option) {
        assertObjectNotNull("buriDataPathHistory", buriDataPathHistory);
        prepareInsertOption(option);
        delegateInsert(buriDataPathHistory, option);
    }

    protected void prepareInsertOption(InsertOption<BuriDataPathHistoryCB> option) {
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
     * BuriDataPathHistory buriDataPathHistory = new BuriDataPathHistory();
     * buriDataPathHistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriDataPathHistory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriDataPathHistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriDataPathHistory.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriDataPathHistory.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriDataPathHistoryBhv.<span style="color: #FD4747">update</span>(buriDataPathHistory);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriDataPathHistory The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final BuriDataPathHistory buriDataPathHistory) {
        doUpdate(buriDataPathHistory, null);
    }

    protected void doUpdate(BuriDataPathHistory buriDataPathHistory, final UpdateOption<BuriDataPathHistoryCB> option) {
        assertObjectNotNull("buriDataPathHistory", buriDataPathHistory);
        prepareUpdateOption(option);
        helpUpdateInternally(buriDataPathHistory, new InternalUpdateCallback<BuriDataPathHistory>() {
            public int callbackDelegateUpdate(BuriDataPathHistory entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<BuriDataPathHistoryCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected BuriDataPathHistoryCB createCBForVaryingUpdate() {
        BuriDataPathHistoryCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected BuriDataPathHistoryCB createCBForSpecifiedUpdate() {
        BuriDataPathHistoryCB cb = newMyConditionBean();
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
     * @param buriDataPathHistory The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(BuriDataPathHistory buriDataPathHistory) {
        doInesrtOrUpdate(buriDataPathHistory, null, null);
    }

    protected void doInesrtOrUpdate(BuriDataPathHistory buriDataPathHistory, final InsertOption<BuriDataPathHistoryCB> insertOption, final UpdateOption<BuriDataPathHistoryCB> updateOption) {
        helpInsertOrUpdateInternally(buriDataPathHistory, new InternalInsertOrUpdateCallback<BuriDataPathHistory, BuriDataPathHistoryCB>() {
            public void callbackInsert(BuriDataPathHistory entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(BuriDataPathHistory entity) { doUpdate(entity, updateOption); }
            public BuriDataPathHistoryCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(BuriDataPathHistoryCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<BuriDataPathHistoryCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<BuriDataPathHistoryCB>() : updateOption;
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
     * BuriDataPathHistory buriDataPathHistory = new BuriDataPathHistory();
     * buriDataPathHistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriDataPathHistory.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriDataPathHistoryBhv.<span style="color: #FD4747">delete</span>(buriDataPathHistory);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriDataPathHistory The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BuriDataPathHistory buriDataPathHistory) {
        doDelete(buriDataPathHistory, null);
    }

    protected void doDelete(BuriDataPathHistory buriDataPathHistory, final DeleteOption<BuriDataPathHistoryCB> option) {
        assertObjectNotNull("buriDataPathHistory", buriDataPathHistory);
        prepareDeleteOption(option);
        helpDeleteInternally(buriDataPathHistory, new InternalDeleteCallback<BuriDataPathHistory>() {
            public int callbackDelegateDelete(BuriDataPathHistory entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<BuriDataPathHistoryCB> option) {
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
     * @param buriDataPathHistoryList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<BuriDataPathHistory> buriDataPathHistoryList) {
        return doBatchInsert(buriDataPathHistoryList, null);
    }

    protected int[] doBatchInsert(List<BuriDataPathHistory> buriDataPathHistoryList, InsertOption<BuriDataPathHistoryCB> option) {
        assertObjectNotNull("buriDataPathHistoryList", buriDataPathHistoryList);
        prepareInsertOption(option);
        return delegateBatchInsert(buriDataPathHistoryList, option);
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
     * @param buriDataPathHistoryList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<BuriDataPathHistory> buriDataPathHistoryList) {
        return doBatchUpdate(buriDataPathHistoryList, null);
    }

    protected int[] doBatchUpdate(List<BuriDataPathHistory> buriDataPathHistoryList, UpdateOption<BuriDataPathHistoryCB> option) {
        assertObjectNotNull("buriDataPathHistoryList", buriDataPathHistoryList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(buriDataPathHistoryList, option);
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
     * @param buriDataPathHistoryList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<BuriDataPathHistory> buriDataPathHistoryList, SpecifyQuery<BuriDataPathHistoryCB> updateColumnSpec) {
        return doBatchUpdate(buriDataPathHistoryList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param buriDataPathHistoryList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<BuriDataPathHistory> buriDataPathHistoryList) {
        return doBatchDelete(buriDataPathHistoryList, null);
    }

    protected int[] doBatchDelete(List<BuriDataPathHistory> buriDataPathHistoryList, DeleteOption<BuriDataPathHistoryCB> option) {
        assertObjectNotNull("buriDataPathHistoryList", buriDataPathHistoryList);
        prepareDeleteOption(option);
        return delegateBatchDelete(buriDataPathHistoryList, option);
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
     * buriDataPathHistoryBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;BuriDataPathHistory, BuriDataPathHistoryCB&gt;() {
     *     public ConditionBean setup(buriDataPathHistory entity, BuriDataPathHistoryCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BuriDataPathHistory, BuriDataPathHistoryCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<BuriDataPathHistory, BuriDataPathHistoryCB> setupper, InsertOption<BuriDataPathHistoryCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        BuriDataPathHistory entity = new BuriDataPathHistory();
        BuriDataPathHistoryCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected BuriDataPathHistoryCB createCBForQueryInsert() {
        BuriDataPathHistoryCB cb = newMyConditionBean();
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
     * BuriDataPathHistory buriDataPathHistory = new BuriDataPathHistory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriDataPathHistory.setPK...(value);</span>
     * buriDataPathHistory.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriDataPathHistory.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriDataPathHistory.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriDataPathHistory.setVersionNo(value);</span>
     * BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB();
     * cb.query().setFoo...(value);
     * buriDataPathHistoryBhv.<span style="color: #FD4747">queryUpdate</span>(buriDataPathHistory, cb);
     * </pre>
     * @param buriDataPathHistory The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BuriDataPathHistory. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BuriDataPathHistory buriDataPathHistory, BuriDataPathHistoryCB cb) {
        return doQueryUpdate(buriDataPathHistory, cb, null);
    }

    protected int doQueryUpdate(BuriDataPathHistory buriDataPathHistory, BuriDataPathHistoryCB cb, UpdateOption<BuriDataPathHistoryCB> option) {
        assertObjectNotNull("buriDataPathHistory", buriDataPathHistory); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(buriDataPathHistory, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (BuriDataPathHistoryCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (BuriDataPathHistoryCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB();
     * cb.query().setFoo...(value);
     * buriDataPathHistoryBhv.<span style="color: #FD4747">queryDelete</span>(buriDataPathHistory, cb);
     * </pre>
     * @param cb The condition-bean of BuriDataPathHistory. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BuriDataPathHistoryCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(BuriDataPathHistoryCB cb, DeleteOption<BuriDataPathHistoryCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((BuriDataPathHistoryCB)cb); }
        else { return varyingQueryDelete((BuriDataPathHistoryCB)cb, downcast(option)); }
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
     * BuriDataPathHistory buriDataPathHistory = new BuriDataPathHistory();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriDataPathHistory.setFoo...(value);
     * buriDataPathHistory.setBar...(value);
     * InsertOption<BuriDataPathHistoryCB> option = new InsertOption<BuriDataPathHistoryCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * buriDataPathHistoryBhv.<span style="color: #FD4747">varyingInsert</span>(buriDataPathHistory, option);
     * ... = buriDataPathHistory.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriDataPathHistory The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(BuriDataPathHistory buriDataPathHistory, InsertOption<BuriDataPathHistoryCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(buriDataPathHistory, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * BuriDataPathHistory buriDataPathHistory = new BuriDataPathHistory();
     * buriDataPathHistory.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriDataPathHistory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriDataPathHistory.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;BuriDataPathHistoryCB&gt; option = new UpdateOption&lt;BuriDataPathHistoryCB&gt;();
     *     option.self(new SpecifyQuery&lt;BuriDataPathHistoryCB&gt;() {
     *         public void specify(BuriDataPathHistoryCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     buriDataPathHistoryBhv.<span style="color: #FD4747">varyingUpdate</span>(buriDataPathHistory, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param buriDataPathHistory The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(BuriDataPathHistory buriDataPathHistory, UpdateOption<BuriDataPathHistoryCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(buriDataPathHistory, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param buriDataPathHistory The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(BuriDataPathHistory buriDataPathHistory, InsertOption<BuriDataPathHistoryCB> insertOption, UpdateOption<BuriDataPathHistoryCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(buriDataPathHistory, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param buriDataPathHistory The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BuriDataPathHistory buriDataPathHistory, DeleteOption<BuriDataPathHistoryCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(buriDataPathHistory, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param buriDataPathHistoryList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<BuriDataPathHistory> buriDataPathHistoryList, InsertOption<BuriDataPathHistoryCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(buriDataPathHistoryList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param buriDataPathHistoryList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<BuriDataPathHistory> buriDataPathHistoryList, UpdateOption<BuriDataPathHistoryCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(buriDataPathHistoryList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param buriDataPathHistoryList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<BuriDataPathHistory> buriDataPathHistoryList, DeleteOption<BuriDataPathHistoryCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(buriDataPathHistoryList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<BuriDataPathHistory, BuriDataPathHistoryCB> setupper, InsertOption<BuriDataPathHistoryCB> option) {
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
     * BuriDataPathHistory buriDataPathHistory = new BuriDataPathHistory();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriDataPathHistory.setPK...(value);</span>
     * buriDataPathHistory.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriDataPathHistory.setVersionNo(value);</span>
     * BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;BuriDataPathHistoryCB&gt; option = new UpdateOption&lt;BuriDataPathHistoryCB&gt;();
     * option.self(new SpecifyQuery&lt;BuriDataPathHistoryCB&gt;() {
     *     public void specify(BuriDataPathHistoryCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * buriDataPathHistoryBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(buriDataPathHistory, cb, option);
     * </pre>
     * @param buriDataPathHistory The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BuriDataPathHistory. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BuriDataPathHistory buriDataPathHistory, BuriDataPathHistoryCB cb, UpdateOption<BuriDataPathHistoryCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(buriDataPathHistory, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of BuriDataPathHistory. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BuriDataPathHistoryCB cb, DeleteOption<BuriDataPathHistoryCB> option) {
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
    public OutsideSqlBasicExecutor<BuriDataPathHistoryBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(BuriDataPathHistoryCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(BuriDataPathHistoryCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends BuriDataPathHistory> void delegateSelectCursor(BuriDataPathHistoryCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends BuriDataPathHistory> List<ENTITY> delegateSelectList(BuriDataPathHistoryCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(BuriDataPathHistory e, InsertOption<BuriDataPathHistoryCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(BuriDataPathHistory e, UpdateOption<BuriDataPathHistoryCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(BuriDataPathHistory e, UpdateOption<BuriDataPathHistoryCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(BuriDataPathHistory e, DeleteOption<BuriDataPathHistoryCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(BuriDataPathHistory e, DeleteOption<BuriDataPathHistoryCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<BuriDataPathHistory> ls, InsertOption<BuriDataPathHistoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<BuriDataPathHistory> ls, UpdateOption<BuriDataPathHistoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<BuriDataPathHistory> ls, UpdateOption<BuriDataPathHistoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<BuriDataPathHistory> ls, DeleteOption<BuriDataPathHistoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<BuriDataPathHistory> ls, DeleteOption<BuriDataPathHistoryCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(BuriDataPathHistory e, BuriDataPathHistoryCB inCB, ConditionBean resCB, InsertOption<BuriDataPathHistoryCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(BuriDataPathHistory e, BuriDataPathHistoryCB cb, UpdateOption<BuriDataPathHistoryCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(BuriDataPathHistoryCB cb, DeleteOption<BuriDataPathHistoryCB> op)
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
    protected BuriDataPathHistory downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, BuriDataPathHistory.class);
    }

    protected BuriDataPathHistoryCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, BuriDataPathHistoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<BuriDataPathHistory> downcast(List<? extends Entity> entityList) {
        return (List<BuriDataPathHistory>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<BuriDataPathHistoryCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<BuriDataPathHistoryCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<BuriDataPathHistoryCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<BuriDataPathHistoryCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<BuriDataPathHistoryCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<BuriDataPathHistoryCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<BuriDataPathHistory, BuriDataPathHistoryCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<BuriDataPathHistory, BuriDataPathHistoryCB>)option;
    }
}

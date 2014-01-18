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
 * The behavior of BURISTATEUNDOLOG as TABLE. <br />
 * {Buri Internal}
 * <pre>
 * [primary key]
 *     STATEUNDOLOGID
 * 
 * [column]
 *     STATEUNDOLOGID, STATEID, BRANCHID, PATHID, DATAID, USERIDVAL, AUTORUNTIME, USERIDNUM, INSERTDATE, BTID, PROCESSDATE, ABORTDATE, VERSIONNO, CREATEBTID
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
public abstract class BsBuriStateUndoLogBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BURISTATEUNDOLOG"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return BuriStateUndoLogDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BuriStateUndoLogDbm getMyDBMeta() { return BuriStateUndoLogDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BuriStateUndoLog newMyEntity() { return new BuriStateUndoLog(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BuriStateUndoLogCB newMyConditionBean() { return new BuriStateUndoLogCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BuriStateUndoLogCB cb = new BuriStateUndoLogCB();
     * cb.query().setFoo...(value);
     * int count = buriStateUndoLogBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BuriStateUndoLog. (NotNull)
     * @return The selected count.
     */
    public int selectCount(BuriStateUndoLogCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(BuriStateUndoLogCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(BuriStateUndoLogCB cb) { // called by selectPage(cb)
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
     * BuriStateUndoLogCB cb = new BuriStateUndoLogCB();
     * cb.query().setFoo...(value);
     * buriStateUndoLogBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;BuriStateUndoLog&gt;() {
     *     public void handle(BuriStateUndoLog entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of BuriStateUndoLog. (NotNull)
     * @param entityRowHandler The handler of entity row of BuriStateUndoLog. (NotNull)
     */
    public void selectCursor(BuriStateUndoLogCB cb, EntityRowHandler<BuriStateUndoLog> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, BuriStateUndoLog.class);
    }

    protected <ENTITY extends BuriStateUndoLog> void doSelectCursor(BuriStateUndoLogCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<BuriStateUndoLog>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * BuriStateUndoLogCB cb = new BuriStateUndoLogCB();
     * cb.query().setFoo...(value);
     * BuriStateUndoLog buriStateUndoLog = buriStateUndoLogBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (buriStateUndoLog != null) {
     *     ... = buriStateUndoLog.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BuriStateUndoLog. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriStateUndoLog selectEntity(BuriStateUndoLogCB cb) {
        return doSelectEntity(cb, BuriStateUndoLog.class);
    }

    protected <ENTITY extends BuriStateUndoLog> ENTITY doSelectEntity(final BuriStateUndoLogCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, BuriStateUndoLogCB>() {
            public List<ENTITY> callbackSelectList(BuriStateUndoLogCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * BuriStateUndoLogCB cb = new BuriStateUndoLogCB();
     * cb.query().setFoo...(value);
     * BuriStateUndoLog buriStateUndoLog = buriStateUndoLogBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = buriStateUndoLog.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BuriStateUndoLog. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriStateUndoLog selectEntityWithDeletedCheck(BuriStateUndoLogCB cb) {
        return doSelectEntityWithDeletedCheck(cb, BuriStateUndoLog.class);
    }

    protected <ENTITY extends BuriStateUndoLog> ENTITY doSelectEntityWithDeletedCheck(final BuriStateUndoLogCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, BuriStateUndoLogCB>() {
            public List<ENTITY> callbackSelectList(BuriStateUndoLogCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param stateUndoLogId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriStateUndoLog selectByPKValue(Long stateUndoLogId) {
        return doSelectByPKValue(stateUndoLogId, BuriStateUndoLog.class);
    }

    protected <ENTITY extends BuriStateUndoLog> ENTITY doSelectByPKValue(Long stateUndoLogId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(stateUndoLogId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param stateUndoLogId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriStateUndoLog selectByPKValueWithDeletedCheck(Long stateUndoLogId) {
        return doSelectByPKValueWithDeletedCheck(stateUndoLogId, BuriStateUndoLog.class);
    }

    protected <ENTITY extends BuriStateUndoLog> ENTITY doSelectByPKValueWithDeletedCheck(Long stateUndoLogId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(stateUndoLogId), entityType);
    }

    private BuriStateUndoLogCB buildPKCB(Long stateUndoLogId) {
        assertObjectNotNull("stateUndoLogId", stateUndoLogId);
        BuriStateUndoLogCB cb = newMyConditionBean();
        cb.query().setStateUndoLogId_Equal(stateUndoLogId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BuriStateUndoLogCB cb = new BuriStateUndoLogCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;BuriStateUndoLog&gt; buriStateUndoLogList = buriStateUndoLogBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (BuriStateUndoLog buriStateUndoLog : buriStateUndoLogList) {
     *     ... = buriStateUndoLog.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriStateUndoLog. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BuriStateUndoLog> selectList(BuriStateUndoLogCB cb) {
        return doSelectList(cb, BuriStateUndoLog.class);
    }

    protected <ENTITY extends BuriStateUndoLog> ListResultBean<ENTITY> doSelectList(BuriStateUndoLogCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, BuriStateUndoLogCB>() {
            public List<ENTITY> callbackSelectList(BuriStateUndoLogCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * BuriStateUndoLogCB cb = new BuriStateUndoLogCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BuriStateUndoLog&gt; page = buriStateUndoLogBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (BuriStateUndoLog buriStateUndoLog : page) {
     *     ... = buriStateUndoLog.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriStateUndoLog. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BuriStateUndoLog> selectPage(BuriStateUndoLogCB cb) {
        return doSelectPage(cb, BuriStateUndoLog.class);
    }

    protected <ENTITY extends BuriStateUndoLog> PagingResultBean<ENTITY> doSelectPage(BuriStateUndoLogCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, BuriStateUndoLogCB>() {
            public int callbackSelectCount(BuriStateUndoLogCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(BuriStateUndoLogCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * buriStateUndoLogBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(BuriStateUndoLogCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<BuriStateUndoLogCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends BuriStateUndoLogCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * BuriStateUndoLog buriStateUndoLog = new BuriStateUndoLog();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriStateUndoLog.setFoo...(value);
     * buriStateUndoLog.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.set...;</span>
     * buriStateUndoLogBhv.<span style="color: #FD4747">insert</span>(buriStateUndoLog);
     * ... = buriStateUndoLog.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriStateUndoLog The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(BuriStateUndoLog buriStateUndoLog) {
        doInsert(buriStateUndoLog, null);
    }

    protected void doInsert(BuriStateUndoLog buriStateUndoLog, InsertOption<BuriStateUndoLogCB> option) {
        assertObjectNotNull("buriStateUndoLog", buriStateUndoLog);
        prepareInsertOption(option);
        delegateInsert(buriStateUndoLog, option);
    }

    protected void prepareInsertOption(InsertOption<BuriStateUndoLogCB> option) {
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
     * BuriStateUndoLog buriStateUndoLog = new BuriStateUndoLog();
     * buriStateUndoLog.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriStateUndoLog.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriStateUndoLog.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriStateUndoLogBhv.<span style="color: #FD4747">update</span>(buriStateUndoLog);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriStateUndoLog The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final BuriStateUndoLog buriStateUndoLog) {
        doUpdate(buriStateUndoLog, null);
    }

    protected void doUpdate(BuriStateUndoLog buriStateUndoLog, final UpdateOption<BuriStateUndoLogCB> option) {
        assertObjectNotNull("buriStateUndoLog", buriStateUndoLog);
        prepareUpdateOption(option);
        helpUpdateInternally(buriStateUndoLog, new InternalUpdateCallback<BuriStateUndoLog>() {
            public int callbackDelegateUpdate(BuriStateUndoLog entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<BuriStateUndoLogCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected BuriStateUndoLogCB createCBForVaryingUpdate() {
        BuriStateUndoLogCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected BuriStateUndoLogCB createCBForSpecifiedUpdate() {
        BuriStateUndoLogCB cb = newMyConditionBean();
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
     * BuriStateUndoLog buriStateUndoLog = new BuriStateUndoLog();
     * buriStateUndoLog.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriStateUndoLog.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.setVersionNo(value);</span>
     * buriStateUndoLogBhv.<span style="color: #FD4747">updateNonstrict</span>(buriStateUndoLog);
     * </pre>
     * @param buriStateUndoLog The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final BuriStateUndoLog buriStateUndoLog) {
        doUpdateNonstrict(buriStateUndoLog, null);
    }

    protected void doUpdateNonstrict(BuriStateUndoLog buriStateUndoLog, final UpdateOption<BuriStateUndoLogCB> option) {
        assertObjectNotNull("buriStateUndoLog", buriStateUndoLog);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(buriStateUndoLog, new InternalUpdateNonstrictCallback<BuriStateUndoLog>() {
            public int callbackDelegateUpdateNonstrict(BuriStateUndoLog entity) { return delegateUpdateNonstrict(entity, option); } });
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { updateNonstrict(downcast(entity)); }
        else { varyingUpdateNonstrict(downcast(entity), downcast(option)); }
    }

    /**
     * Insert or update the entity modified-only. {ExclusiveControl(when update)}
     * @param buriStateUndoLog The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(BuriStateUndoLog buriStateUndoLog) {
        doInesrtOrUpdate(buriStateUndoLog, null, null);
    }

    protected void doInesrtOrUpdate(BuriStateUndoLog buriStateUndoLog, final InsertOption<BuriStateUndoLogCB> insertOption, final UpdateOption<BuriStateUndoLogCB> updateOption) {
        helpInsertOrUpdateInternally(buriStateUndoLog, new InternalInsertOrUpdateCallback<BuriStateUndoLog, BuriStateUndoLogCB>() {
            public void callbackInsert(BuriStateUndoLog entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(BuriStateUndoLog entity) { doUpdate(entity, updateOption); }
            public BuriStateUndoLogCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(BuriStateUndoLogCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<BuriStateUndoLogCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<BuriStateUndoLogCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonExclusiveControl(when update)}
     * @param buriStateUndoLog The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(BuriStateUndoLog buriStateUndoLog) {
        doInesrtOrUpdateNonstrict(buriStateUndoLog, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(BuriStateUndoLog buriStateUndoLog, final InsertOption<BuriStateUndoLogCB> insertOption, final UpdateOption<BuriStateUndoLogCB> updateOption) {
        helpInsertOrUpdateInternally(buriStateUndoLog, new InternalInsertOrUpdateNonstrictCallback<BuriStateUndoLog>() {
            public void callbackInsert(BuriStateUndoLog entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(BuriStateUndoLog entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<BuriStateUndoLogCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<BuriStateUndoLogCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * BuriStateUndoLog buriStateUndoLog = new BuriStateUndoLog();
     * buriStateUndoLog.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriStateUndoLog.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriStateUndoLogBhv.<span style="color: #FD4747">delete</span>(buriStateUndoLog);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriStateUndoLog The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BuriStateUndoLog buriStateUndoLog) {
        doDelete(buriStateUndoLog, null);
    }

    protected void doDelete(BuriStateUndoLog buriStateUndoLog, final DeleteOption<BuriStateUndoLogCB> option) {
        assertObjectNotNull("buriStateUndoLog", buriStateUndoLog);
        prepareDeleteOption(option);
        helpDeleteInternally(buriStateUndoLog, new InternalDeleteCallback<BuriStateUndoLog>() {
            public int callbackDelegateDelete(BuriStateUndoLog entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<BuriStateUndoLogCB> option) {
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
     * BuriStateUndoLog buriStateUndoLog = new BuriStateUndoLog();
     * buriStateUndoLog.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.setVersionNo(value);</span>
     * buriStateUndoLogBhv.<span style="color: #FD4747">deleteNonstrict</span>(buriStateUndoLog);
     * </pre>
     * @param buriStateUndoLog The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(BuriStateUndoLog buriStateUndoLog) {
        doDeleteNonstrict(buriStateUndoLog, null);
    }

    protected void doDeleteNonstrict(BuriStateUndoLog buriStateUndoLog, final DeleteOption<BuriStateUndoLogCB> option) {
        assertObjectNotNull("buriStateUndoLog", buriStateUndoLog);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(buriStateUndoLog, new InternalDeleteNonstrictCallback<BuriStateUndoLog>() {
            public int callbackDelegateDeleteNonstrict(BuriStateUndoLog entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonExclusiveControl}
     * <pre>
     * BuriStateUndoLog buriStateUndoLog = new BuriStateUndoLog();
     * buriStateUndoLog.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.setVersionNo(value);</span>
     * buriStateUndoLogBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(buriStateUndoLog);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param buriStateUndoLog The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(BuriStateUndoLog buriStateUndoLog) {
        doDeleteNonstrictIgnoreDeleted(buriStateUndoLog, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(BuriStateUndoLog buriStateUndoLog, final DeleteOption<BuriStateUndoLogCB> option) {
        assertObjectNotNull("buriStateUndoLog", buriStateUndoLog);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(buriStateUndoLog, new InternalDeleteNonstrictIgnoreDeletedCallback<BuriStateUndoLog>() {
            public int callbackDelegateDeleteNonstrict(BuriStateUndoLog entity) { return delegateDeleteNonstrict(entity, option); } });
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
     * @param buriStateUndoLogList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<BuriStateUndoLog> buriStateUndoLogList) {
        return doBatchInsert(buriStateUndoLogList, null);
    }

    protected int[] doBatchInsert(List<BuriStateUndoLog> buriStateUndoLogList, InsertOption<BuriStateUndoLogCB> option) {
        assertObjectNotNull("buriStateUndoLogList", buriStateUndoLogList);
        prepareInsertOption(option);
        return delegateBatchInsert(buriStateUndoLogList, option);
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
     * @param buriStateUndoLogList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BuriStateUndoLog> buriStateUndoLogList) {
        return doBatchUpdate(buriStateUndoLogList, null);
    }

    protected int[] doBatchUpdate(List<BuriStateUndoLog> buriStateUndoLogList, UpdateOption<BuriStateUndoLogCB> option) {
        assertObjectNotNull("buriStateUndoLogList", buriStateUndoLogList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(buriStateUndoLogList, option);
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
     * @param buriStateUndoLogList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<BuriStateUndoLog> buriStateUndoLogList, SpecifyQuery<BuriStateUndoLogCB> updateColumnSpec) {
        return doBatchUpdate(buriStateUndoLogList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are update target. {NOT modified only}
     * @param buriStateUndoLogList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<BuriStateUndoLog> buriStateUndoLogList) {
        return doBatchUpdateNonstrict(buriStateUndoLogList, null);
    }

    protected int[] doBatchUpdateNonstrict(List<BuriStateUndoLog> buriStateUndoLogList, UpdateOption<BuriStateUndoLogCB> option) {
        assertObjectNotNull("buriStateUndoLogList", buriStateUndoLogList);
        prepareUpdateOption(option);
        return delegateBatchUpdateNonstrict(buriStateUndoLogList, option);
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistick lock column because they are specified implicitly.
     * @param buriStateUndoLogList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<BuriStateUndoLog> buriStateUndoLogList, SpecifyQuery<BuriStateUndoLogCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(buriStateUndoLogList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param buriStateUndoLogList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<BuriStateUndoLog> buriStateUndoLogList) {
        return doBatchDelete(buriStateUndoLogList, null);
    }

    protected int[] doBatchDelete(List<BuriStateUndoLog> buriStateUndoLogList, DeleteOption<BuriStateUndoLogCB> option) {
        assertObjectNotNull("buriStateUndoLogList", buriStateUndoLogList);
        prepareDeleteOption(option);
        return delegateBatchDelete(buriStateUndoLogList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param buriStateUndoLogList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<BuriStateUndoLog> buriStateUndoLogList) {
        return doBatchDeleteNonstrict(buriStateUndoLogList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<BuriStateUndoLog> buriStateUndoLogList, DeleteOption<BuriStateUndoLogCB> option) {
        assertObjectNotNull("buriStateUndoLogList", buriStateUndoLogList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(buriStateUndoLogList, option);
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
     * buriStateUndoLogBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;BuriStateUndoLog, BuriStateUndoLogCB&gt;() {
     *     public ConditionBean setup(buriStateUndoLog entity, BuriStateUndoLogCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BuriStateUndoLog, BuriStateUndoLogCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<BuriStateUndoLog, BuriStateUndoLogCB> setupper, InsertOption<BuriStateUndoLogCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        BuriStateUndoLog entity = new BuriStateUndoLog();
        BuriStateUndoLogCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected BuriStateUndoLogCB createCBForQueryInsert() {
        BuriStateUndoLogCB cb = newMyConditionBean();
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
     * BuriStateUndoLog buriStateUndoLog = new BuriStateUndoLog();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.setPK...(value);</span>
     * buriStateUndoLog.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.setVersionNo(value);</span>
     * BuriStateUndoLogCB cb = new BuriStateUndoLogCB();
     * cb.query().setFoo...(value);
     * buriStateUndoLogBhv.<span style="color: #FD4747">queryUpdate</span>(buriStateUndoLog, cb);
     * </pre>
     * @param buriStateUndoLog The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BuriStateUndoLog. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BuriStateUndoLog buriStateUndoLog, BuriStateUndoLogCB cb) {
        return doQueryUpdate(buriStateUndoLog, cb, null);
    }

    protected int doQueryUpdate(BuriStateUndoLog buriStateUndoLog, BuriStateUndoLogCB cb, UpdateOption<BuriStateUndoLogCB> option) {
        assertObjectNotNull("buriStateUndoLog", buriStateUndoLog); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(buriStateUndoLog, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (BuriStateUndoLogCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (BuriStateUndoLogCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * BuriStateUndoLogCB cb = new BuriStateUndoLogCB();
     * cb.query().setFoo...(value);
     * buriStateUndoLogBhv.<span style="color: #FD4747">queryDelete</span>(buriStateUndoLog, cb);
     * </pre>
     * @param cb The condition-bean of BuriStateUndoLog. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BuriStateUndoLogCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(BuriStateUndoLogCB cb, DeleteOption<BuriStateUndoLogCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((BuriStateUndoLogCB)cb); }
        else { return varyingQueryDelete((BuriStateUndoLogCB)cb, downcast(option)); }
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
     * BuriStateUndoLog buriStateUndoLog = new BuriStateUndoLog();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriStateUndoLog.setFoo...(value);
     * buriStateUndoLog.setBar...(value);
     * InsertOption<BuriStateUndoLogCB> option = new InsertOption<BuriStateUndoLogCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * buriStateUndoLogBhv.<span style="color: #FD4747">varyingInsert</span>(buriStateUndoLog, option);
     * ... = buriStateUndoLog.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriStateUndoLog The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(BuriStateUndoLog buriStateUndoLog, InsertOption<BuriStateUndoLogCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(buriStateUndoLog, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * BuriStateUndoLog buriStateUndoLog = new BuriStateUndoLog();
     * buriStateUndoLog.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriStateUndoLog.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriStateUndoLog.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;BuriStateUndoLogCB&gt; option = new UpdateOption&lt;BuriStateUndoLogCB&gt;();
     *     option.self(new SpecifyQuery&lt;BuriStateUndoLogCB&gt;() {
     *         public void specify(BuriStateUndoLogCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     buriStateUndoLogBhv.<span style="color: #FD4747">varyingUpdate</span>(buriStateUndoLog, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param buriStateUndoLog The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(BuriStateUndoLog buriStateUndoLog, UpdateOption<BuriStateUndoLogCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(buriStateUndoLog, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. {UpdateCountZeroException, NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * BuriStateUndoLog buriStateUndoLog = new BuriStateUndoLog();
     * buriStateUndoLog.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriStateUndoLog.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.setVersionNo(value);</span>
     * UpdateOption&lt;BuriStateUndoLogCB&gt; option = new UpdateOption&lt;BuriStateUndoLogCB&gt;();
     * option.self(new SpecifyQuery&lt;BuriStateUndoLogCB&gt;() {
     *     public void specify(BuriStateUndoLogCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * buriStateUndoLogBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(buriStateUndoLog, option);
     * </pre>
     * @param buriStateUndoLog The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdateNonstrict(BuriStateUndoLog buriStateUndoLog, UpdateOption<BuriStateUndoLogCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(buriStateUndoLog, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param buriStateUndoLog The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(BuriStateUndoLog buriStateUndoLog, InsertOption<BuriStateUndoLogCB> insertOption, UpdateOption<BuriStateUndoLogCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(buriStateUndoLog, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. {NonExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param buriStateUndoLog The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdateNonstrict(BuriStateUndoLog buriStateUndoLog, InsertOption<BuriStateUndoLogCB> insertOption, UpdateOption<BuriStateUndoLogCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(buriStateUndoLog, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param buriStateUndoLog The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BuriStateUndoLog buriStateUndoLog, DeleteOption<BuriStateUndoLogCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(buriStateUndoLog, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. {UpdateCountZeroException, NonExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param buriStateUndoLog The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(BuriStateUndoLog buriStateUndoLog, DeleteOption<BuriStateUndoLogCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(buriStateUndoLog, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param buriStateUndoLogList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<BuriStateUndoLog> buriStateUndoLogList, InsertOption<BuriStateUndoLogCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(buriStateUndoLogList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param buriStateUndoLogList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<BuriStateUndoLog> buriStateUndoLogList, UpdateOption<BuriStateUndoLogCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(buriStateUndoLogList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param buriStateUndoLogList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdateNonstrict(List<BuriStateUndoLog> buriStateUndoLogList, UpdateOption<BuriStateUndoLogCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(buriStateUndoLogList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param buriStateUndoLogList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<BuriStateUndoLog> buriStateUndoLogList, DeleteOption<BuriStateUndoLogCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(buriStateUndoLogList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param buriStateUndoLogList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDeleteNonstrict(List<BuriStateUndoLog> buriStateUndoLogList, DeleteOption<BuriStateUndoLogCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(buriStateUndoLogList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<BuriStateUndoLog, BuriStateUndoLogCB> setupper, InsertOption<BuriStateUndoLogCB> option) {
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
     * BuriStateUndoLog buriStateUndoLog = new BuriStateUndoLog();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.setPK...(value);</span>
     * buriStateUndoLog.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriStateUndoLog.setVersionNo(value);</span>
     * BuriStateUndoLogCB cb = new BuriStateUndoLogCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;BuriStateUndoLogCB&gt; option = new UpdateOption&lt;BuriStateUndoLogCB&gt;();
     * option.self(new SpecifyQuery&lt;BuriStateUndoLogCB&gt;() {
     *     public void specify(BuriStateUndoLogCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * buriStateUndoLogBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(buriStateUndoLog, cb, option);
     * </pre>
     * @param buriStateUndoLog The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BuriStateUndoLog. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BuriStateUndoLog buriStateUndoLog, BuriStateUndoLogCB cb, UpdateOption<BuriStateUndoLogCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(buriStateUndoLog, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of BuriStateUndoLog. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BuriStateUndoLogCB cb, DeleteOption<BuriStateUndoLogCB> option) {
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
    public OutsideSqlBasicExecutor<BuriStateUndoLogBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(BuriStateUndoLogCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(BuriStateUndoLogCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends BuriStateUndoLog> void delegateSelectCursor(BuriStateUndoLogCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends BuriStateUndoLog> List<ENTITY> delegateSelectList(BuriStateUndoLogCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(BuriStateUndoLog e, InsertOption<BuriStateUndoLogCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(BuriStateUndoLog e, UpdateOption<BuriStateUndoLogCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(BuriStateUndoLog e, UpdateOption<BuriStateUndoLogCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(BuriStateUndoLog e, DeleteOption<BuriStateUndoLogCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(BuriStateUndoLog e, DeleteOption<BuriStateUndoLogCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<BuriStateUndoLog> ls, InsertOption<BuriStateUndoLogCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<BuriStateUndoLog> ls, UpdateOption<BuriStateUndoLogCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<BuriStateUndoLog> ls, UpdateOption<BuriStateUndoLogCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<BuriStateUndoLog> ls, DeleteOption<BuriStateUndoLogCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<BuriStateUndoLog> ls, DeleteOption<BuriStateUndoLogCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(BuriStateUndoLog e, BuriStateUndoLogCB inCB, ConditionBean resCB, InsertOption<BuriStateUndoLogCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(BuriStateUndoLog e, BuriStateUndoLogCB cb, UpdateOption<BuriStateUndoLogCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(BuriStateUndoLogCB cb, DeleteOption<BuriStateUndoLogCB> op)
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
    protected BuriStateUndoLog downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, BuriStateUndoLog.class);
    }

    protected BuriStateUndoLogCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, BuriStateUndoLogCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<BuriStateUndoLog> downcast(List<? extends Entity> entityList) {
        return (List<BuriStateUndoLog>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<BuriStateUndoLogCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<BuriStateUndoLogCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<BuriStateUndoLogCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<BuriStateUndoLogCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<BuriStateUndoLogCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<BuriStateUndoLogCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<BuriStateUndoLog, BuriStateUndoLogCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<BuriStateUndoLog, BuriStateUndoLogCB>)option;
    }
}

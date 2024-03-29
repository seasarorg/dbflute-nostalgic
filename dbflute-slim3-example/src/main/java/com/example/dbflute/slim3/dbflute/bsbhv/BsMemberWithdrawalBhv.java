package com.example.dbflute.slim3.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.slim3.dbflute.exbhv.*;
import com.example.dbflute.slim3.dbflute.exentity.*;
import com.example.dbflute.slim3.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.slim3.dbflute.cbean.*;

/**
 * The behavior of MEMBER_WITHDRAWAL as TABLE. <br />
 * <pre>
 * [primary key]
 *     MEMBER_ID
 * 
 * [column]
 *     MEMBER_ID, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, REGISTER_DATETIME, REGISTER_PROCESS, REGISTER_USER, UPDATE_DATETIME, UPDATE_PROCESS, UPDATE_USER, VERSION_NO
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
 *     MEMBER, WITHDRAWAL_REASON
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     member, withdrawalReason
 * 
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMemberWithdrawalBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "MEMBER_WITHDRAWAL"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return MemberWithdrawalDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MemberWithdrawalDbm getMyDBMeta() { return MemberWithdrawalDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MemberWithdrawal newMyEntity() { return new MemberWithdrawal(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MemberWithdrawalCB newMyConditionBean() { return new MemberWithdrawalCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * int count = memberWithdrawalBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MemberWithdrawal. (NotNull)
     * @return The selected count.
     */
    public int selectCount(MemberWithdrawalCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(MemberWithdrawalCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(MemberWithdrawalCB cb) { // called by selectPage(cb)
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
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * memberWithdrawalBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;MemberWithdrawal&gt;() {
     *     public void handle(MemberWithdrawal entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of MemberWithdrawal. (NotNull)
     * @param entityRowHandler The handler of entity row of MemberWithdrawal. (NotNull)
     */
    public void selectCursor(MemberWithdrawalCB cb, EntityRowHandler<MemberWithdrawal> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, MemberWithdrawal.class);
    }

    protected <ENTITY extends MemberWithdrawal> void doSelectCursor(MemberWithdrawalCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<MemberWithdrawal>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * MemberWithdrawal memberWithdrawal = memberWithdrawalBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (memberWithdrawal != null) {
     *     ... = memberWithdrawal.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MemberWithdrawal. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MemberWithdrawal selectEntity(MemberWithdrawalCB cb) {
        return doSelectEntity(cb, MemberWithdrawal.class);
    }

    protected <ENTITY extends MemberWithdrawal> ENTITY doSelectEntity(final MemberWithdrawalCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, MemberWithdrawalCB>() {
            public List<ENTITY> callbackSelectList(MemberWithdrawalCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * MemberWithdrawal memberWithdrawal = memberWithdrawalBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = memberWithdrawal.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MemberWithdrawal. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MemberWithdrawal selectEntityWithDeletedCheck(MemberWithdrawalCB cb) {
        return doSelectEntityWithDeletedCheck(cb, MemberWithdrawal.class);
    }

    protected <ENTITY extends MemberWithdrawal> ENTITY doSelectEntityWithDeletedCheck(final MemberWithdrawalCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, MemberWithdrawalCB>() {
            public List<ENTITY> callbackSelectList(MemberWithdrawalCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param memberId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MemberWithdrawal selectByPKValue(Integer memberId) {
        return doSelectByPKValue(memberId, MemberWithdrawal.class);
    }

    protected <ENTITY extends MemberWithdrawal> ENTITY doSelectByPKValue(Integer memberId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(memberId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param memberId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MemberWithdrawal selectByPKValueWithDeletedCheck(Integer memberId) {
        return doSelectByPKValueWithDeletedCheck(memberId, MemberWithdrawal.class);
    }

    protected <ENTITY extends MemberWithdrawal> ENTITY doSelectByPKValueWithDeletedCheck(Integer memberId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(memberId), entityType);
    }

    private MemberWithdrawalCB buildPKCB(Integer memberId) {
        assertObjectNotNull("memberId", memberId);
        MemberWithdrawalCB cb = newMyConditionBean();
        cb.query().setMemberId_Equal(memberId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;MemberWithdrawal&gt; memberWithdrawalList = memberWithdrawalBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (MemberWithdrawal memberWithdrawal : memberWithdrawalList) {
     *     ... = memberWithdrawal.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MemberWithdrawal. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MemberWithdrawal> selectList(MemberWithdrawalCB cb) {
        return doSelectList(cb, MemberWithdrawal.class);
    }

    protected <ENTITY extends MemberWithdrawal> ListResultBean<ENTITY> doSelectList(MemberWithdrawalCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, MemberWithdrawalCB>() {
            public List<ENTITY> callbackSelectList(MemberWithdrawalCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MemberWithdrawal&gt; page = memberWithdrawalBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (MemberWithdrawal memberWithdrawal : page) {
     *     ... = memberWithdrawal.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MemberWithdrawal. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MemberWithdrawal> selectPage(MemberWithdrawalCB cb) {
        return doSelectPage(cb, MemberWithdrawal.class);
    }

    protected <ENTITY extends MemberWithdrawal> PagingResultBean<ENTITY> doSelectPage(MemberWithdrawalCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, MemberWithdrawalCB>() {
            public int callbackSelectCount(MemberWithdrawalCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(MemberWithdrawalCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * memberWithdrawalBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(MemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<MemberWithdrawalCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends MemberWithdrawalCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * Pull out the list of foreign table 'Member'.
     * @param memberWithdrawalList The list of memberWithdrawal. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<Member> pulloutMember(List<MemberWithdrawal> memberWithdrawalList) {
        return helpPulloutInternally(memberWithdrawalList, new InternalPulloutCallback<MemberWithdrawal, Member>() {
            public Member getFr(MemberWithdrawal e) { return e.getMember(); }
            public boolean hasRf() { return true; }
            public void setRfLs(Member e, List<MemberWithdrawal> ls)
            { if (!ls.isEmpty()) { e.setMemberWithdrawalAsOne(ls.get(0)); } }
        });
    }
    /**
     * Pull out the list of foreign table 'WithdrawalReason'.
     * @param memberWithdrawalList The list of memberWithdrawal. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<WithdrawalReason> pulloutWithdrawalReason(List<MemberWithdrawal> memberWithdrawalList) {
        return helpPulloutInternally(memberWithdrawalList, new InternalPulloutCallback<MemberWithdrawal, WithdrawalReason>() {
            public WithdrawalReason getFr(MemberWithdrawal e) { return e.getWithdrawalReason(); }
            public boolean hasRf() { return true; }
            public void setRfLs(WithdrawalReason e, List<MemberWithdrawal> ls)
            { e.setMemberWithdrawalList(ls); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * MemberWithdrawal memberWithdrawal = new MemberWithdrawal();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberWithdrawal.setFoo...(value);
     * memberWithdrawal.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.set...;</span>
     * memberWithdrawalBhv.<span style="color: #FD4747">insert</span>(memberWithdrawal);
     * ... = memberWithdrawal.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param memberWithdrawal The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(MemberWithdrawal memberWithdrawal) {
        doInsert(memberWithdrawal, null);
    }

    protected void doInsert(MemberWithdrawal memberWithdrawal, InsertOption<MemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawal", memberWithdrawal);
        prepareInsertOption(option);
        delegateInsert(memberWithdrawal, option);
    }

    protected void prepareInsertOption(InsertOption<MemberWithdrawalCB> option) {
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
     * MemberWithdrawal memberWithdrawal = new MemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberWithdrawal.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     memberWithdrawalBhv.<span style="color: #FD4747">update</span>(memberWithdrawal);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param memberWithdrawal The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final MemberWithdrawal memberWithdrawal) {
        doUpdate(memberWithdrawal, null);
    }

    protected void doUpdate(MemberWithdrawal memberWithdrawal, final UpdateOption<MemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawal", memberWithdrawal);
        prepareUpdateOption(option);
        helpUpdateInternally(memberWithdrawal, new InternalUpdateCallback<MemberWithdrawal>() {
            public int callbackDelegateUpdate(MemberWithdrawal entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<MemberWithdrawalCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected MemberWithdrawalCB createCBForVaryingUpdate() {
        MemberWithdrawalCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected MemberWithdrawalCB createCBForSpecifiedUpdate() {
        MemberWithdrawalCB cb = newMyConditionBean();
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
     * MemberWithdrawal memberWithdrawal = new MemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * memberWithdrawalBhv.<span style="color: #FD4747">updateNonstrict</span>(memberWithdrawal);
     * </pre>
     * @param memberWithdrawal The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void updateNonstrict(final MemberWithdrawal memberWithdrawal) {
        doUpdateNonstrict(memberWithdrawal, null);
    }

    protected void doUpdateNonstrict(MemberWithdrawal memberWithdrawal, final UpdateOption<MemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawal", memberWithdrawal);
        prepareUpdateOption(option);
        helpUpdateNonstrictInternally(memberWithdrawal, new InternalUpdateNonstrictCallback<MemberWithdrawal>() {
            public int callbackDelegateUpdateNonstrict(MemberWithdrawal entity) { return delegateUpdateNonstrict(entity, option); } });
    }

    @Override
    protected void doModifyNonstrict(Entity entity, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { updateNonstrict(downcast(entity)); }
        else { varyingUpdateNonstrict(downcast(entity), downcast(option)); }
    }

    /**
     * Insert or update the entity modified-only. {ExclusiveControl(when update)}
     * @param memberWithdrawal The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(MemberWithdrawal memberWithdrawal) {
        doInesrtOrUpdate(memberWithdrawal, null, null);
    }

    protected void doInesrtOrUpdate(MemberWithdrawal memberWithdrawal, final InsertOption<MemberWithdrawalCB> insertOption, final UpdateOption<MemberWithdrawalCB> updateOption) {
        helpInsertOrUpdateInternally(memberWithdrawal, new InternalInsertOrUpdateCallback<MemberWithdrawal, MemberWithdrawalCB>() {
            public void callbackInsert(MemberWithdrawal entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(MemberWithdrawal entity) { doUpdate(entity, updateOption); }
            public MemberWithdrawalCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(MemberWithdrawalCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<MemberWithdrawalCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<MemberWithdrawalCB>() : updateOption;
            varyingInsertOrUpdate(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Insert or update the entity non-strictly modified-only. {NonExclusiveControl(when update)}
     * @param memberWithdrawal The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdateNonstrict(MemberWithdrawal memberWithdrawal) {
        doInesrtOrUpdateNonstrict(memberWithdrawal, null, null);
    }

    protected void doInesrtOrUpdateNonstrict(MemberWithdrawal memberWithdrawal, final InsertOption<MemberWithdrawalCB> insertOption, final UpdateOption<MemberWithdrawalCB> updateOption) {
        helpInsertOrUpdateInternally(memberWithdrawal, new InternalInsertOrUpdateNonstrictCallback<MemberWithdrawal>() {
            public void callbackInsert(MemberWithdrawal entity) { doInsert(entity, insertOption); }
            public void callbackUpdateNonstrict(MemberWithdrawal entity) { doUpdateNonstrict(entity, updateOption); }
        });
    }

    @Override
    protected void doCreateOrModifyNonstrict(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdateNonstrict(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<MemberWithdrawalCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<MemberWithdrawalCB>() : updateOption;
            varyingInsertOrUpdateNonstrict(downcast(entity), downcast(insertOption), downcast(updateOption));
        }
    }

    /**
     * Delete the entity. {UpdateCountZeroException, ExclusiveControl}
     * <pre>
     * MemberWithdrawal memberWithdrawal = new MemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberWithdrawal.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     memberWithdrawalBhv.<span style="color: #FD4747">delete</span>(memberWithdrawal);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param memberWithdrawal The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MemberWithdrawal memberWithdrawal) {
        doDelete(memberWithdrawal, null);
    }

    protected void doDelete(MemberWithdrawal memberWithdrawal, final DeleteOption<MemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawal", memberWithdrawal);
        prepareDeleteOption(option);
        helpDeleteInternally(memberWithdrawal, new InternalDeleteCallback<MemberWithdrawal>() {
            public int callbackDelegateDelete(MemberWithdrawal entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<MemberWithdrawalCB> option) {
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
     * MemberWithdrawal memberWithdrawal = new MemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * memberWithdrawalBhv.<span style="color: #FD4747">deleteNonstrict</span>(memberWithdrawal);
     * </pre>
     * @param memberWithdrawal The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MemberWithdrawal memberWithdrawal) {
        doDeleteNonstrict(memberWithdrawal, null);
    }

    protected void doDeleteNonstrict(MemberWithdrawal memberWithdrawal, final DeleteOption<MemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawal", memberWithdrawal);
        prepareDeleteOption(option);
        helpDeleteNonstrictInternally(memberWithdrawal, new InternalDeleteNonstrictCallback<MemberWithdrawal>() {
            public int callbackDelegateDeleteNonstrict(MemberWithdrawal entity) { return delegateDeleteNonstrict(entity, option); } });
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {UpdateCountZeroException, NonExclusiveControl}
     * <pre>
     * MemberWithdrawal memberWithdrawal = new MemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * memberWithdrawalBhv.<span style="color: #FD4747">deleteNonstrictIgnoreDeleted</span>(memberWithdrawal);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param memberWithdrawal The entity of delete target. (NotNull) {PrimaryKeyRequired}
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MemberWithdrawal memberWithdrawal) {
        doDeleteNonstrictIgnoreDeleted(memberWithdrawal, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MemberWithdrawal memberWithdrawal, final DeleteOption<MemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawal", memberWithdrawal);
        prepareDeleteOption(option);
        helpDeleteNonstrictIgnoreDeletedInternally(memberWithdrawal, new InternalDeleteNonstrictIgnoreDeletedCallback<MemberWithdrawal>() {
            public int callbackDelegateDeleteNonstrict(MemberWithdrawal entity) { return delegateDeleteNonstrict(entity, option); } });
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
     * @param memberWithdrawalList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<MemberWithdrawal> memberWithdrawalList) {
        return doBatchInsert(memberWithdrawalList, null);
    }

    protected int[] doBatchInsert(List<MemberWithdrawal> memberWithdrawalList, InsertOption<MemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawalList", memberWithdrawalList);
        prepareInsertOption(option);
        return delegateBatchInsert(memberWithdrawalList, option);
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
     * @param memberWithdrawalList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MemberWithdrawal> memberWithdrawalList) {
        return doBatchUpdate(memberWithdrawalList, null);
    }

    protected int[] doBatchUpdate(List<MemberWithdrawal> memberWithdrawalList, UpdateOption<MemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawalList", memberWithdrawalList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(memberWithdrawalList, option);
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
     * @param memberWithdrawalList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MemberWithdrawal> memberWithdrawalList, SpecifyQuery<MemberWithdrawalCB> updateColumnSpec) {
        return doBatchUpdate(memberWithdrawalList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * All columns are update target. {NOT modified only}
     * @param memberWithdrawalList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<MemberWithdrawal> memberWithdrawalList) {
        return doBatchUpdateNonstrict(memberWithdrawalList, null);
    }

    protected int[] doBatchUpdateNonstrict(List<MemberWithdrawal> memberWithdrawalList, UpdateOption<MemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawalList", memberWithdrawalList);
        prepareUpdateOption(option);
        return delegateBatchUpdateNonstrict(memberWithdrawalList, option);
    }

    /**
     * Batch-update the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement. <br />
     * You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistick lock column because they are specified implicitly.
     * @param memberWithdrawalList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdateNonstrict(List<MemberWithdrawal> memberWithdrawalList, SpecifyQuery<MemberWithdrawalCB> updateColumnSpec) {
        return doBatchUpdateNonstrict(memberWithdrawalList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return batchUpdateNonstrict(downcast(ls)); }
        else { return varyingBatchUpdateNonstrict(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param memberWithdrawalList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MemberWithdrawal> memberWithdrawalList) {
        return doBatchDelete(memberWithdrawalList, null);
    }

    protected int[] doBatchDelete(List<MemberWithdrawal> memberWithdrawalList, DeleteOption<MemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawalList", memberWithdrawalList);
        prepareDeleteOption(option);
        return delegateBatchDelete(memberWithdrawalList, option);
    }

    @Override
    protected int[] doLumpRemove(List<Entity> ls, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return batchDelete(downcast(ls)); }
        else { return varyingBatchDelete(downcast(ls), downcast(option)); }
    }

    /**
     * Batch-delete the list non-strictly. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param memberWithdrawalList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDeleteNonstrict(List<MemberWithdrawal> memberWithdrawalList) {
        return doBatchDeleteNonstrict(memberWithdrawalList, null);
    }

    protected int[] doBatchDeleteNonstrict(List<MemberWithdrawal> memberWithdrawalList, DeleteOption<MemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawalList", memberWithdrawalList);
        prepareDeleteOption(option);
        return delegateBatchDeleteNonstrict(memberWithdrawalList, option);
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
     * memberWithdrawalBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;MemberWithdrawal, MemberWithdrawalCB&gt;() {
     *     public ConditionBean setup(memberWithdrawal entity, MemberWithdrawalCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MemberWithdrawal, MemberWithdrawalCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<MemberWithdrawal, MemberWithdrawalCB> setupper, InsertOption<MemberWithdrawalCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        MemberWithdrawal entity = new MemberWithdrawal();
        MemberWithdrawalCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected MemberWithdrawalCB createCBForQueryInsert() {
        MemberWithdrawalCB cb = newMyConditionBean();
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
     * MemberWithdrawal memberWithdrawal = new MemberWithdrawal();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setPK...(value);</span>
     * memberWithdrawal.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * memberWithdrawalBhv.<span style="color: #FD4747">queryUpdate</span>(memberWithdrawal, cb);
     * </pre>
     * @param memberWithdrawal The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MemberWithdrawal. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MemberWithdrawal memberWithdrawal, MemberWithdrawalCB cb) {
        return doQueryUpdate(memberWithdrawal, cb, null);
    }

    protected int doQueryUpdate(MemberWithdrawal memberWithdrawal, MemberWithdrawalCB cb, UpdateOption<MemberWithdrawalCB> option) {
        assertObjectNotNull("memberWithdrawal", memberWithdrawal); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(memberWithdrawal, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (MemberWithdrawalCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (MemberWithdrawalCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * memberWithdrawalBhv.<span style="color: #FD4747">queryDelete</span>(memberWithdrawal, cb);
     * </pre>
     * @param cb The condition-bean of MemberWithdrawal. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MemberWithdrawalCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(MemberWithdrawalCB cb, DeleteOption<MemberWithdrawalCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((MemberWithdrawalCB)cb); }
        else { return varyingQueryDelete((MemberWithdrawalCB)cb, downcast(option)); }
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
     * MemberWithdrawal memberWithdrawal = new MemberWithdrawal();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * memberWithdrawal.setFoo...(value);
     * memberWithdrawal.setBar...(value);
     * InsertOption<MemberWithdrawalCB> option = new InsertOption<MemberWithdrawalCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * memberWithdrawalBhv.<span style="color: #FD4747">varyingInsert</span>(memberWithdrawal, option);
     * ... = memberWithdrawal.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param memberWithdrawal The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(MemberWithdrawal memberWithdrawal, InsertOption<MemberWithdrawalCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(memberWithdrawal, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * MemberWithdrawal memberWithdrawal = new MemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberWithdrawal.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * memberWithdrawal.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;MemberWithdrawalCB&gt; option = new UpdateOption&lt;MemberWithdrawalCB&gt;();
     *     option.self(new SpecifyQuery&lt;MemberWithdrawalCB&gt;() {
     *         public void specify(MemberWithdrawalCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     memberWithdrawalBhv.<span style="color: #FD4747">varyingUpdate</span>(memberWithdrawal, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param memberWithdrawal The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(MemberWithdrawal memberWithdrawal, UpdateOption<MemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(memberWithdrawal, option);
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. {UpdateCountZeroException, NonExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MemberWithdrawal memberWithdrawal = new MemberWithdrawal();
     * memberWithdrawal.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * memberWithdrawal.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * UpdateOption&lt;MemberWithdrawalCB&gt; option = new UpdateOption&lt;MemberWithdrawalCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void specify(MemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberWithdrawalBhv.<span style="color: #FD4747">varyingUpdateNonstrict</span>(memberWithdrawal, option);
     * </pre>
     * @param memberWithdrawal The entity of update target. (NotNull) {PrimaryKeyRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdateNonstrict(MemberWithdrawal memberWithdrawal, UpdateOption<MemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdateNonstrict(memberWithdrawal, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param memberWithdrawal The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(MemberWithdrawal memberWithdrawal, InsertOption<MemberWithdrawalCB> insertOption, UpdateOption<MemberWithdrawalCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(memberWithdrawal, insertOption, updateOption);
    }

    /**
     * Insert or update the entity with varying requests non-strictly. {NonExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param memberWithdrawal The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdateNonstrict(MemberWithdrawal memberWithdrawal, InsertOption<MemberWithdrawalCB> insertOption, UpdateOption<MemberWithdrawalCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdateNonstrict(memberWithdrawal, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param memberWithdrawal The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MemberWithdrawal memberWithdrawal, DeleteOption<MemberWithdrawalCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(memberWithdrawal, option);
    }

    /**
     * Delete the entity with varying requests non-strictly. {UpdateCountZeroException, NonExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as deleteNonstrict(entity).
     * @param memberWithdrawal The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MemberWithdrawal memberWithdrawal, DeleteOption<MemberWithdrawalCB> option) {
        assertDeleteOptionNotNull(option);
        doDeleteNonstrict(memberWithdrawal, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param memberWithdrawalList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<MemberWithdrawal> memberWithdrawalList, InsertOption<MemberWithdrawalCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(memberWithdrawalList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param memberWithdrawalList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<MemberWithdrawal> memberWithdrawalList, UpdateOption<MemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(memberWithdrawalList, option);
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param memberWithdrawalList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdateNonstrict(List<MemberWithdrawal> memberWithdrawalList, UpdateOption<MemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdateNonstrict(memberWithdrawalList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param memberWithdrawalList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<MemberWithdrawal> memberWithdrawalList, DeleteOption<MemberWithdrawalCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(memberWithdrawalList, option);
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param memberWithdrawalList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDeleteNonstrict(List<MemberWithdrawal> memberWithdrawalList, DeleteOption<MemberWithdrawalCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDeleteNonstrict(memberWithdrawalList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<MemberWithdrawal, MemberWithdrawalCB> setupper, InsertOption<MemberWithdrawalCB> option) {
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
     * MemberWithdrawal memberWithdrawal = new MemberWithdrawal();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setPK...(value);</span>
     * memberWithdrawal.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//memberWithdrawal.setVersionNo(value);</span>
     * MemberWithdrawalCB cb = new MemberWithdrawalCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;MemberWithdrawalCB&gt; option = new UpdateOption&lt;MemberWithdrawalCB&gt;();
     * option.self(new SpecifyQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void specify(MemberWithdrawalCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * memberWithdrawalBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(memberWithdrawal, cb, option);
     * </pre>
     * @param memberWithdrawal The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MemberWithdrawal. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MemberWithdrawal memberWithdrawal, MemberWithdrawalCB cb, UpdateOption<MemberWithdrawalCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(memberWithdrawal, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of MemberWithdrawal. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MemberWithdrawalCB cb, DeleteOption<MemberWithdrawalCB> option) {
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
    public OutsideSqlBasicExecutor<MemberWithdrawalBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(MemberWithdrawalCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(MemberWithdrawalCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends MemberWithdrawal> void delegateSelectCursor(MemberWithdrawalCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends MemberWithdrawal> List<ENTITY> delegateSelectList(MemberWithdrawalCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(MemberWithdrawal e, InsertOption<MemberWithdrawalCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(MemberWithdrawal e, UpdateOption<MemberWithdrawalCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateEntityCommand(e, op)); }
    protected int delegateUpdateNonstrict(MemberWithdrawal e, UpdateOption<MemberWithdrawalCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(MemberWithdrawal e, DeleteOption<MemberWithdrawalCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteEntityCommand(e, op)); }
    protected int delegateDeleteNonstrict(MemberWithdrawal e, DeleteOption<MemberWithdrawalCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<MemberWithdrawal> ls, InsertOption<MemberWithdrawalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<MemberWithdrawal> ls, UpdateOption<MemberWithdrawalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchUpdateNonstrict(List<MemberWithdrawal> ls, UpdateOption<MemberWithdrawalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<MemberWithdrawal> ls, DeleteOption<MemberWithdrawalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteCommand(processBatchInternally(ls, op, false), op)); }
    protected int[] delegateBatchDeleteNonstrict(List<MemberWithdrawal> ls, DeleteOption<MemberWithdrawalCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(MemberWithdrawal e, MemberWithdrawalCB inCB, ConditionBean resCB, InsertOption<MemberWithdrawalCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(MemberWithdrawal e, MemberWithdrawalCB cb, UpdateOption<MemberWithdrawalCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(MemberWithdrawalCB cb, DeleteOption<MemberWithdrawalCB> op)
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
    protected MemberWithdrawal downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, MemberWithdrawal.class);
    }

    protected MemberWithdrawalCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, MemberWithdrawalCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<MemberWithdrawal> downcast(List<? extends Entity> entityList) {
        return (List<MemberWithdrawal>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<MemberWithdrawalCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<MemberWithdrawalCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<MemberWithdrawalCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<MemberWithdrawalCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<MemberWithdrawalCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<MemberWithdrawalCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<MemberWithdrawal, MemberWithdrawalCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<MemberWithdrawal, MemberWithdrawalCB>)option;
    }
}

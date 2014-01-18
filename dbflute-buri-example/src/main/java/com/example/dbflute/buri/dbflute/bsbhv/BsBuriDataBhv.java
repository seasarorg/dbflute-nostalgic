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
 * The behavior of BURIDATA as TABLE. <br />
 * {Buri Internal}
 * <pre>
 * [primary key]
 *     DATAID
 * 
 * [column]
 *     DATAID, PKEYVAL, PKEYNUM, DATATYPE, TABLENAME, INSERTUSERID
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
 *     BURISTATE, BURIBRANCH
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     buriStateList, buriBranchList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsBuriDataBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "BURIDATA"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return BuriDataDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public BuriDataDbm getMyDBMeta() { return BuriDataDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public BuriData newMyEntity() { return new BuriData(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public BuriDataCB newMyConditionBean() { return new BuriDataCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * BuriDataCB cb = new BuriDataCB();
     * cb.query().setFoo...(value);
     * int count = buriDataBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of BuriData. (NotNull)
     * @return The selected count.
     */
    public int selectCount(BuriDataCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(BuriDataCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(BuriDataCB cb) { // called by selectPage(cb)
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
     * BuriDataCB cb = new BuriDataCB();
     * cb.query().setFoo...(value);
     * buriDataBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;BuriData&gt;() {
     *     public void handle(BuriData entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of BuriData. (NotNull)
     * @param entityRowHandler The handler of entity row of BuriData. (NotNull)
     */
    public void selectCursor(BuriDataCB cb, EntityRowHandler<BuriData> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, BuriData.class);
    }

    protected <ENTITY extends BuriData> void doSelectCursor(BuriDataCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<BuriData>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * BuriDataCB cb = new BuriDataCB();
     * cb.query().setFoo...(value);
     * BuriData buriData = buriDataBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (buriData != null) {
     *     ... = buriData.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of BuriData. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriData selectEntity(BuriDataCB cb) {
        return doSelectEntity(cb, BuriData.class);
    }

    protected <ENTITY extends BuriData> ENTITY doSelectEntity(final BuriDataCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, BuriDataCB>() {
            public List<ENTITY> callbackSelectList(BuriDataCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * BuriDataCB cb = new BuriDataCB();
     * cb.query().setFoo...(value);
     * BuriData buriData = buriDataBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = buriData.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of BuriData. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriData selectEntityWithDeletedCheck(BuriDataCB cb) {
        return doSelectEntityWithDeletedCheck(cb, BuriData.class);
    }

    protected <ENTITY extends BuriData> ENTITY doSelectEntityWithDeletedCheck(final BuriDataCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, BuriDataCB>() {
            public List<ENTITY> callbackSelectList(BuriDataCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param dataId The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriData selectByPKValue(Long dataId) {
        return doSelectByPKValue(dataId, BuriData.class);
    }

    protected <ENTITY extends BuriData> ENTITY doSelectByPKValue(Long dataId, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(dataId), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param dataId The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public BuriData selectByPKValueWithDeletedCheck(Long dataId) {
        return doSelectByPKValueWithDeletedCheck(dataId, BuriData.class);
    }

    protected <ENTITY extends BuriData> ENTITY doSelectByPKValueWithDeletedCheck(Long dataId, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(dataId), entityType);
    }

    private BuriDataCB buildPKCB(Long dataId) {
        assertObjectNotNull("dataId", dataId);
        BuriDataCB cb = newMyConditionBean();
        cb.query().setDataId_Equal(dataId);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * BuriDataCB cb = new BuriDataCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;BuriData&gt; buriDataList = buriDataBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (BuriData buriData : buriDataList) {
     *     ... = buriData.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriData. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<BuriData> selectList(BuriDataCB cb) {
        return doSelectList(cb, BuriData.class);
    }

    protected <ENTITY extends BuriData> ListResultBean<ENTITY> doSelectList(BuriDataCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, BuriDataCB>() {
            public List<ENTITY> callbackSelectList(BuriDataCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * BuriDataCB cb = new BuriDataCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;BuriData&gt; page = buriDataBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (BuriData buriData : page) {
     *     ... = buriData.get...();
     * }
     * </pre>
     * @param cb The condition-bean of BuriData. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<BuriData> selectPage(BuriDataCB cb) {
        return doSelectPage(cb, BuriData.class);
    }

    protected <ENTITY extends BuriData> PagingResultBean<ENTITY> doSelectPage(BuriDataCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, BuriDataCB>() {
            public int callbackSelectCount(BuriDataCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(BuriDataCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * buriDataBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(BuriDataCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<BuriDataCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends BuriDataCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
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
     * @param buriData The entity of buriData. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriStateList(BuriData buriData, ConditionBeanSetupper<BuriStateCB> conditionBeanSetupper) {
        xassLRArg(buriData, conditionBeanSetupper);
        loadBuriStateList(xnewLRLs(buriData), conditionBeanSetupper);
    }
    /**
     * Load referrer of buriStateList with the set-upper for condition-bean of referrer. <br />
     * BURISTATE by your DATAID, named 'buriStateList'.
     * <pre>
     * buriDataBhv.<span style="color: #FD4747">loadBuriStateList</span>(buriDataList, new ConditionBeanSetupper&lt;BuriStateCB&gt;() {
     *     public void setup(BuriStateCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (BuriData buriData : buriDataList) {
     *     ... = buriData.<span style="color: #FD4747">getBuriStateList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setDataId_InScope(pkList);
     * cb.query().addOrderBy_DataId_Asc();
     * </pre>
     * @param buriDataList The entity list of buriData. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriStateList(List<BuriData> buriDataList, ConditionBeanSetupper<BuriStateCB> conditionBeanSetupper) {
        xassLRArg(buriDataList, conditionBeanSetupper);
        loadBuriStateList(buriDataList, new LoadReferrerOption<BuriStateCB, BuriState>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param buriData The entity of buriData. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriStateList(BuriData buriData, LoadReferrerOption<BuriStateCB, BuriState> loadReferrerOption) {
        xassLRArg(buriData, loadReferrerOption);
        loadBuriStateList(xnewLRLs(buriData), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param buriDataList The entity list of buriData. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriStateList(List<BuriData> buriDataList, LoadReferrerOption<BuriStateCB, BuriState> loadReferrerOption) {
        xassLRArg(buriDataList, loadReferrerOption);
        if (buriDataList.isEmpty()) { return; }
        final BuriStateBhv referrerBhv = xgetBSFLR().select(BuriStateBhv.class);
        helpLoadReferrerInternally(buriDataList, loadReferrerOption, new InternalLoadReferrerCallback<BuriData, Long, BuriStateCB, BuriState>() {
            public Long getPKVal(BuriData e)
            { return e.getDataId(); }
            public void setRfLs(BuriData e, List<BuriState> ls)
            { e.setBuriStateList(ls); }
            public BuriStateCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(BuriStateCB cb, List<Long> ls)
            { cb.query().setDataId_InScope(ls); }
            public void qyOdFKAsc(BuriStateCB cb) { cb.query().addOrderBy_DataId_Asc(); }
            public void spFKCol(BuriStateCB cb) { cb.specify().columnDataId(); }
            public List<BuriState> selRfLs(BuriStateCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(BuriState e) { return e.getDataId(); }
            public void setlcEt(BuriState re, BuriData le)
            { re.setBuriData(le); }
            public String getRfPrNm() { return "buriStateList"; }
        });
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param buriData The entity of buriData. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriBranchList(BuriData buriData, ConditionBeanSetupper<BuriBranchCB> conditionBeanSetupper) {
        xassLRArg(buriData, conditionBeanSetupper);
        loadBuriBranchList(xnewLRLs(buriData), conditionBeanSetupper);
    }
    /**
     * Load referrer of buriBranchList with the set-upper for condition-bean of referrer. <br />
     * BURIBRANCH by your DATAID, named 'buriBranchList'.
     * <pre>
     * buriDataBhv.<span style="color: #FD4747">loadBuriBranchList</span>(buriDataList, new ConditionBeanSetupper&lt;BuriBranchCB&gt;() {
     *     public void setup(BuriBranchCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (BuriData buriData : buriDataList) {
     *     ... = buriData.<span style="color: #FD4747">getBuriBranchList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setDataId_InScope(pkList);
     * cb.query().addOrderBy_DataId_Asc();
     * </pre>
     * @param buriDataList The entity list of buriData. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriBranchList(List<BuriData> buriDataList, ConditionBeanSetupper<BuriBranchCB> conditionBeanSetupper) {
        xassLRArg(buriDataList, conditionBeanSetupper);
        loadBuriBranchList(buriDataList, new LoadReferrerOption<BuriBranchCB, BuriBranch>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param buriData The entity of buriData. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriBranchList(BuriData buriData, LoadReferrerOption<BuriBranchCB, BuriBranch> loadReferrerOption) {
        xassLRArg(buriData, loadReferrerOption);
        loadBuriBranchList(xnewLRLs(buriData), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param buriDataList The entity list of buriData. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriBranchList(List<BuriData> buriDataList, LoadReferrerOption<BuriBranchCB, BuriBranch> loadReferrerOption) {
        xassLRArg(buriDataList, loadReferrerOption);
        if (buriDataList.isEmpty()) { return; }
        final BuriBranchBhv referrerBhv = xgetBSFLR().select(BuriBranchBhv.class);
        helpLoadReferrerInternally(buriDataList, loadReferrerOption, new InternalLoadReferrerCallback<BuriData, Long, BuriBranchCB, BuriBranch>() {
            public Long getPKVal(BuriData e)
            { return e.getDataId(); }
            public void setRfLs(BuriData e, List<BuriBranch> ls)
            { e.setBuriBranchList(ls); }
            public BuriBranchCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(BuriBranchCB cb, List<Long> ls)
            { cb.query().setDataId_InScope(ls); }
            public void qyOdFKAsc(BuriBranchCB cb) { cb.query().addOrderBy_DataId_Asc(); }
            public void spFKCol(BuriBranchCB cb) { cb.specify().columnDataId(); }
            public List<BuriBranch> selRfLs(BuriBranchCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(BuriBranch e) { return e.getDataId(); }
            public void setlcEt(BuriBranch re, BuriData le)
            { re.setBuriData(le); }
            public String getRfPrNm() { return "buriBranchList"; }
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
     * BuriData buriData = new BuriData();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriData.setFoo...(value);
     * buriData.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriData.set...;</span>
     * buriDataBhv.<span style="color: #FD4747">insert</span>(buriData);
     * ... = buriData.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriData The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(BuriData buriData) {
        doInsert(buriData, null);
    }

    protected void doInsert(BuriData buriData, InsertOption<BuriDataCB> option) {
        assertObjectNotNull("buriData", buriData);
        prepareInsertOption(option);
        delegateInsert(buriData, option);
    }

    protected void prepareInsertOption(InsertOption<BuriDataCB> option) {
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
     * BuriData buriData = new BuriData();
     * buriData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriData.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriData.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriData.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriDataBhv.<span style="color: #FD4747">update</span>(buriData);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriData The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final BuriData buriData) {
        doUpdate(buriData, null);
    }

    protected void doUpdate(BuriData buriData, final UpdateOption<BuriDataCB> option) {
        assertObjectNotNull("buriData", buriData);
        prepareUpdateOption(option);
        helpUpdateInternally(buriData, new InternalUpdateCallback<BuriData>() {
            public int callbackDelegateUpdate(BuriData entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<BuriDataCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected BuriDataCB createCBForVaryingUpdate() {
        BuriDataCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected BuriDataCB createCBForSpecifiedUpdate() {
        BuriDataCB cb = newMyConditionBean();
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
     * @param buriData The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(BuriData buriData) {
        doInesrtOrUpdate(buriData, null, null);
    }

    protected void doInesrtOrUpdate(BuriData buriData, final InsertOption<BuriDataCB> insertOption, final UpdateOption<BuriDataCB> updateOption) {
        helpInsertOrUpdateInternally(buriData, new InternalInsertOrUpdateCallback<BuriData, BuriDataCB>() {
            public void callbackInsert(BuriData entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(BuriData entity) { doUpdate(entity, updateOption); }
            public BuriDataCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(BuriDataCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<BuriDataCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<BuriDataCB>() : updateOption;
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
     * BuriData buriData = new BuriData();
     * buriData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriData.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     buriDataBhv.<span style="color: #FD4747">delete</span>(buriData);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param buriData The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(BuriData buriData) {
        doDelete(buriData, null);
    }

    protected void doDelete(BuriData buriData, final DeleteOption<BuriDataCB> option) {
        assertObjectNotNull("buriData", buriData);
        prepareDeleteOption(option);
        helpDeleteInternally(buriData, new InternalDeleteCallback<BuriData>() {
            public int callbackDelegateDelete(BuriData entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<BuriDataCB> option) {
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
     * @param buriDataList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<BuriData> buriDataList) {
        return doBatchInsert(buriDataList, null);
    }

    protected int[] doBatchInsert(List<BuriData> buriDataList, InsertOption<BuriDataCB> option) {
        assertObjectNotNull("buriDataList", buriDataList);
        prepareInsertOption(option);
        return delegateBatchInsert(buriDataList, option);
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
     * @param buriDataList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<BuriData> buriDataList) {
        return doBatchUpdate(buriDataList, null);
    }

    protected int[] doBatchUpdate(List<BuriData> buriDataList, UpdateOption<BuriDataCB> option) {
        assertObjectNotNull("buriDataList", buriDataList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(buriDataList, option);
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
     * @param buriDataList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<BuriData> buriDataList, SpecifyQuery<BuriDataCB> updateColumnSpec) {
        return doBatchUpdate(buriDataList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param buriDataList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<BuriData> buriDataList) {
        return doBatchDelete(buriDataList, null);
    }

    protected int[] doBatchDelete(List<BuriData> buriDataList, DeleteOption<BuriDataCB> option) {
        assertObjectNotNull("buriDataList", buriDataList);
        prepareDeleteOption(option);
        return delegateBatchDelete(buriDataList, option);
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
     * buriDataBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;BuriData, BuriDataCB&gt;() {
     *     public ConditionBean setup(buriData entity, BuriDataCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<BuriData, BuriDataCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<BuriData, BuriDataCB> setupper, InsertOption<BuriDataCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        BuriData entity = new BuriData();
        BuriDataCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected BuriDataCB createCBForQueryInsert() {
        BuriDataCB cb = newMyConditionBean();
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
     * BuriData buriData = new BuriData();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriData.setPK...(value);</span>
     * buriData.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//buriData.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//buriData.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriData.setVersionNo(value);</span>
     * BuriDataCB cb = new BuriDataCB();
     * cb.query().setFoo...(value);
     * buriDataBhv.<span style="color: #FD4747">queryUpdate</span>(buriData, cb);
     * </pre>
     * @param buriData The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of BuriData. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(BuriData buriData, BuriDataCB cb) {
        return doQueryUpdate(buriData, cb, null);
    }

    protected int doQueryUpdate(BuriData buriData, BuriDataCB cb, UpdateOption<BuriDataCB> option) {
        assertObjectNotNull("buriData", buriData); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(buriData, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (BuriDataCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (BuriDataCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * BuriDataCB cb = new BuriDataCB();
     * cb.query().setFoo...(value);
     * buriDataBhv.<span style="color: #FD4747">queryDelete</span>(buriData, cb);
     * </pre>
     * @param cb The condition-bean of BuriData. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(BuriDataCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(BuriDataCB cb, DeleteOption<BuriDataCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((BuriDataCB)cb); }
        else { return varyingQueryDelete((BuriDataCB)cb, downcast(option)); }
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
     * BuriData buriData = new BuriData();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * buriData.setFoo...(value);
     * buriData.setBar...(value);
     * InsertOption<BuriDataCB> option = new InsertOption<BuriDataCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * buriDataBhv.<span style="color: #FD4747">varyingInsert</span>(buriData, option);
     * ... = buriData.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param buriData The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(BuriData buriData, InsertOption<BuriDataCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(buriData, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * BuriData buriData = new BuriData();
     * buriData.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * buriData.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * buriData.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;BuriDataCB&gt; option = new UpdateOption&lt;BuriDataCB&gt;();
     *     option.self(new SpecifyQuery&lt;BuriDataCB&gt;() {
     *         public void specify(BuriDataCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     buriDataBhv.<span style="color: #FD4747">varyingUpdate</span>(buriData, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param buriData The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(BuriData buriData, UpdateOption<BuriDataCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(buriData, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param buriData The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(BuriData buriData, InsertOption<BuriDataCB> insertOption, UpdateOption<BuriDataCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(buriData, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param buriData The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(BuriData buriData, DeleteOption<BuriDataCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(buriData, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param buriDataList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<BuriData> buriDataList, InsertOption<BuriDataCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(buriDataList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param buriDataList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<BuriData> buriDataList, UpdateOption<BuriDataCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(buriDataList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param buriDataList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<BuriData> buriDataList, DeleteOption<BuriDataCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(buriDataList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<BuriData, BuriDataCB> setupper, InsertOption<BuriDataCB> option) {
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
     * BuriData buriData = new BuriData();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//buriData.setPK...(value);</span>
     * buriData.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//buriData.setVersionNo(value);</span>
     * BuriDataCB cb = new BuriDataCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;BuriDataCB&gt; option = new UpdateOption&lt;BuriDataCB&gt;();
     * option.self(new SpecifyQuery&lt;BuriDataCB&gt;() {
     *     public void specify(BuriDataCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * buriDataBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(buriData, cb, option);
     * </pre>
     * @param buriData The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of BuriData. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(BuriData buriData, BuriDataCB cb, UpdateOption<BuriDataCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(buriData, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of BuriData. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(BuriDataCB cb, DeleteOption<BuriDataCB> option) {
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
    public OutsideSqlBasicExecutor<BuriDataBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(BuriDataCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(BuriDataCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends BuriData> void delegateSelectCursor(BuriDataCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends BuriData> List<ENTITY> delegateSelectList(BuriDataCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(BuriData e, InsertOption<BuriDataCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(BuriData e, UpdateOption<BuriDataCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(BuriData e, UpdateOption<BuriDataCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(BuriData e, DeleteOption<BuriDataCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(BuriData e, DeleteOption<BuriDataCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<BuriData> ls, InsertOption<BuriDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<BuriData> ls, UpdateOption<BuriDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<BuriData> ls, UpdateOption<BuriDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<BuriData> ls, DeleteOption<BuriDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<BuriData> ls, DeleteOption<BuriDataCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(BuriData e, BuriDataCB inCB, ConditionBean resCB, InsertOption<BuriDataCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(BuriData e, BuriDataCB cb, UpdateOption<BuriDataCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(BuriDataCB cb, DeleteOption<BuriDataCB> op)
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
    protected BuriData downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, BuriData.class);
    }

    protected BuriDataCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, BuriDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<BuriData> downcast(List<? extends Entity> entityList) {
        return (List<BuriData>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<BuriDataCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<BuriDataCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<BuriDataCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<BuriDataCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<BuriDataCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<BuriDataCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<BuriData, BuriDataCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<BuriData, BuriDataCB>)option;
    }
}

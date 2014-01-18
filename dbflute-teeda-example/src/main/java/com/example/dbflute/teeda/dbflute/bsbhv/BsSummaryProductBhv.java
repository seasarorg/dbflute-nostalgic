package com.example.dbflute.teeda.dbflute.bsbhv;

import java.util.List;
import java.util.Map;

import com.example.dbflute.teeda.dbflute.allcommon.*;
import com.example.dbflute.teeda.dbflute.allcommon.bhv.setup.ValueLabelSetupper;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.ConditionBean;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.ListResultBean;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.ResultBeanBuilder;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.PagingHandler;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.PagingInvoker;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.PagingBean;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.PagingResultBean;
import com.example.dbflute.teeda.dbflute.allcommon.dbmeta.DBMeta;
import com.example.dbflute.teeda.dbflute.allcommon.jdbc.StatementConfig;
import com.example.dbflute.teeda.dbflute.exentity.*;
import com.example.dbflute.teeda.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.teeda.dbflute.cbean.*;

/**
 * The behavior of SUMMARY_PRODUCT that the type is VIEW. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PRODUCT_ID, PRODUCT_NAME, PRODUCT_STATUS_CODE, LATEST_PURCHASE_DATETIME
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
 * [foreign-table]
 *     
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSummaryProductBhv extends com.example.dbflute.teeda.dbflute.allcommon.bhv.AbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "SUMMARY_PRODUCT"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return SummaryProductDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public SummaryProductDbm getMyDBMeta() { return SummaryProductDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public Entity newEntity() { return newMyEntity(); }
    public ConditionBean newConditionBean() { return newMyConditionBean(); }
    public SummaryProduct newMyEntity() { return new SummaryProduct(); }
    public SummaryProductCB newMyConditionBean() { return new SummaryProductCB(); }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    @Override
    protected DBDef getCurrentDBDef() {
        return DBCurrent.getInstance().currentDBDef();
    }

    // ===================================================================================
    //                                                             Default StatementConfig
    //                                                             =======================
    @Override
    protected StatementConfig getDefaultStatementConfig() {
        return DBFluteConfig.getInstance().getDefaultStatementConfig();
    }
    
    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of the condition-bean. {IgnorePagingCondition}
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @return The selected count.
     */
    public int selectCount(SummaryProductCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception com.example.dbflute.teeda.dbflute.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public SummaryProduct selectEntity(final SummaryProductCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<SummaryProduct, SummaryProductCB>() {
            public List<SummaryProduct> callbackSelectList(SummaryProductCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception com.example.dbflute.teeda.dbflute.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception com.example.dbflute.teeda.dbflute.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public SummaryProduct selectEntityWithDeletedCheck(final SummaryProductCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<SummaryProduct, SummaryProductCB>() {
            public List<SummaryProduct> callbackSelectList(SummaryProductCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public ListResultBean<SummaryProduct> selectList(SummaryProductCB cb) {
        assertCBNotNull(cb);
        return new ResultBeanBuilder<SummaryProduct>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public PagingResultBean<SummaryProduct> selectPage(final SummaryProductCB cb) {
        assertCBNotNull(cb);
        final PagingInvoker<SummaryProduct> invoker = new PagingInvoker<SummaryProduct>(getTableDbName());
        final PagingHandler<SummaryProduct> handler = new PagingHandler<SummaryProduct>() {
            public PagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<SummaryProduct> paging() { return selectList(cb); }
        };
        return invoker.invokePaging(handler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function. <br />
     * Call a function method after this method called like as follows:
     * <pre>
     * summaryProductBhv.scalarSelect(Date.class).max(new ScalarQuery(SummaryProductCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<SummaryProductCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        SummaryProductCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<SummaryProductCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of SummaryProduct. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(SummaryProductCB cb, ValueLabelSetupper<SummaryProduct> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    
    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCount(SummaryProductCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(ConditionBean cb) { return delegateSelectCount((SummaryProductCB)cb); }
    protected List<SummaryProduct> delegateSelectList(SummaryProductCB cb) {
        return invoke(createSelectListCBCommand(cb, SummaryProduct.class));
    }
    @SuppressWarnings("unchecked")
    protected List<Entity> doCallReadList(ConditionBean cb) { return (List)delegateSelectList((SummaryProductCB)cb); }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity entity) {
        return false;
    }

    @Override
    protected boolean hasUpdateDateValue(Entity entity) {
        return false;
    }

    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    protected SummaryProduct downcast(Entity entity) {
        return helpDowncastInternally(entity, SummaryProduct.class);
    }
}

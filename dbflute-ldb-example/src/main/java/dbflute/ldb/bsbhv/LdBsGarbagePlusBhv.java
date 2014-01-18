/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsbhv;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.*;
import dbflute.ldb.allcommon.bhv.core.command.LdInsertEntityCommand;
import dbflute.ldb.allcommon.bhv.setup.LdValueLabelSetupper;
import dbflute.ldb.allcommon.dbmeta.hierarchy.LdHierarchyArranger;
import dbflute.ldb.allcommon.dbmeta.hierarchy.LdHierarchyBasicRequest;
import dbflute.ldb.allcommon.dbmeta.hierarchy.LdHierarchyRequest;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.cbean.LdResultBeanBuilder;
import dbflute.ldb.allcommon.cbean.LdPagingHandler;
import dbflute.ldb.allcommon.cbean.LdPagingInvoker;
import dbflute.ldb.allcommon.cbean.LdPagingBean;
import dbflute.ldb.allcommon.cbean.LdPagingResultBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.jdbc.LdStatementConfig;
import dbflute.ldb.exentity.*;
import dbflute.ldb.bsentity.dbmeta.*;
import dbflute.ldb.cbean.*;

/**
 * The behavior of GARBAGE_PLUS that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     GARBAGE_MEMO, GARBAGE_TIME, GARBAGE_COUNT, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
public abstract class LdBsGarbagePlusBhv extends dbflute.ldb.allcommon.bhv.LdAbstractBehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:BehaviorQueryPathBegin*/
    /*df:BehaviorQueryPathEnd*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "GARBAGE_PLUS"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public LdDBMeta getDBMeta() { return LdGarbagePlusDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public LdGarbagePlusDbm getMyDBMeta() { return LdGarbagePlusDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdConditionBean newConditionBean() { return newMyConditionBean(); }
    public LdGarbagePlus newMyEntity() { return new LdGarbagePlus(); }
    public LdGarbagePlusCB newMyConditionBean() { return new LdGarbagePlusCB(); }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    @Override
    protected LdDBDef getCurrentDBDef() {
        return LdDBCurrent.getInstance().currentDBDef();
    }

    // ===================================================================================
    //                                                             Default StatementConfig
    //                                                             =======================
    @Override
    protected LdStatementConfig getDefaultStatementConfig() {
        return LdDBFluteConfig.getInstance().getDefaultStatementConfig();
    }
    
    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of the condition-bean. {IgnorePagingCondition}
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The selected count.
     */
    public int selectCount(LdGarbagePlusCB cb) {
        assertCBNotNull(cb);
        return delegateSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The selected entity. (Nullalble)
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdGarbagePlus selectEntity(final LdGarbagePlusCB cb) {
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<LdGarbagePlus, LdGarbagePlusCB>() {
            public List<LdGarbagePlus> callbackSelectList(LdGarbagePlusCB cb) { return selectList(cb); } });
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public LdGarbagePlus selectEntityWithDeletedCheck(final LdGarbagePlusCB cb) {
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<LdGarbagePlus, LdGarbagePlusCB>() {
            public List<LdGarbagePlus> callbackSelectList(LdGarbagePlusCB cb) { return selectList(cb); } });
    }


    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The result bean of selected list. (NotNull)
     */
    public LdListResultBean<LdGarbagePlus> selectList(LdGarbagePlusCB cb) {
        assertCBNotNull(cb);
        return new LdResultBeanBuilder<LdGarbagePlus>(getTableDbName()).buildListResultBean(cb, delegateSelectList(cb));
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean.
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @return The result bean of selected page. (NotNull)
     */
    public LdPagingResultBean<LdGarbagePlus> selectPage(final LdGarbagePlusCB cb) {
        assertCBNotNull(cb);
        final LdPagingInvoker<LdGarbagePlus> invoker = new LdPagingInvoker<LdGarbagePlus>(getTableDbName());
        final LdPagingHandler<LdGarbagePlus> handler = new LdPagingHandler<LdGarbagePlus>() {
            public LdPagingBean getPagingBean() { return cb; }
            public int count() { return selectCount(cb); }
            public List<LdGarbagePlus> paging() { return selectList(cb); }
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
     * garbagePlusBhv.scalarSelect(Date.class).max(new ScalarQuery(LdGarbagePlusCB cb) {
     *     cb.specify().columnXxxDatetime(); // the required specification of target column
     *     cb.query().setXxxName_PrefixSearch("S"); // query as you like it
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (Nullable)
     */
    public <RESULT> SLFunction<LdGarbagePlusCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        LdGarbagePlusCB cb = newMyConditionBean();
        cb.xsetupForScalarSelect();
        return new SLFunction<LdGarbagePlusCB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                      Various Select
    //                                                                      ==============
    /**
     * Select the list of value-label.
     * @param cb The condition-bean of LdGarbagePlus. (NotNull)
     * @param valueLabelSetupper The setupper of value-label. (NotNull)
     * @return The list of value-label. (NotNull)
     * @deprecated Sorry! This method will be deleted at the future.
     */
    public List<Map<String, Object>> selectValueLabelList(LdGarbagePlusCB cb, LdValueLabelSetupper<LdGarbagePlus> valueLabelSetupper) {
        return createValueLabelList(selectList(cb), valueLabelSetupper);
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert.
     * @param garbagePlus Entity. (NotNull)
     */
    public void insert(LdGarbagePlus garbagePlus) {
        assertEntityNotNull(garbagePlus);
        delegateInsert(garbagePlus);
    }
    
    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCount(LdGarbagePlusCB cb) {
        return invoke(createSelectCountCBCommand(cb));
    }
    protected int doCallReadCount(LdConditionBean cb) { return delegateSelectCount((LdGarbagePlusCB)cb); }
    protected List<LdGarbagePlus> delegateSelectList(LdGarbagePlusCB cb) {
        return invoke(createSelectListCBCommand(cb, LdGarbagePlus.class));
    }
    @SuppressWarnings("unchecked")
    protected List<LdEntity> doCallReadList(LdConditionBean cb) { return (List)delegateSelectList((LdGarbagePlusCB)cb); }
    protected int delegateInsert(LdGarbagePlus e) {
        assertEntityNotNull(e); // If this table use identity, the entity does not have primary-key.
        filterEntityOfInsert(e);
        return invoke(createInsertEntityCommand(e));
    }
    protected LdInsertEntityCommand createInsertEntityCommand(LdEntity entity) {
        assertBehaviorCommandInvoker("createInsertEntityCommand");
        final LdInsertEntityCommand cmd = new LdInsertEntityCommand();
        cmd.setTableDbName(getTableDbName());
        _behaviorCommandInvoker.injectComponentProperty(cmd);
        cmd.setEntityType(entity.getClass());
        cmd.setEntity(entity);
        return cmd;
    }

    // ===================================================================================
    //                                                                     Filter Override
    //                                                                     ===============
    @Override
    protected void filterEntityOfInsert(LdEntity targetEntity) {
        super.filterEntityOfInsert(targetEntity);
        LdGarbagePlus entity = downcast(targetEntity);
        entity.setGarbageTime(dbflute.ldb.allcommon.LdAccessContext.getAccessTimestampOnThread());
        entity.setRUser(dbflute.ldb.allcommon.LdAccessContext.getAccessUserOnThread());
        entity.setRTimestamp(dbflute.ldb.allcommon.LdAccessContext.getAccessTimestampOnThread());
    }

    // ===================================================================================
    //                                                                           Hierarchy
    //                                                                           =========
    /**
     * Create the basic request of hierarchy of LdGarbagePlus..
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source.
     * @return Hierarchy request of LdGarbagePlus. (NotNull)
     */
    public <SOURCE> LdHierarchyBasicRequest<LdGarbagePlus, LdGarbagePlusDbm.GarbagePlusRelationTrace> createHierarchyBasicRequest(List<SOURCE> sourceList) {
        final LdHierarchyBasicRequest<LdGarbagePlus, LdGarbagePlusDbm.GarbagePlusRelationTrace> request = new LdHierarchyBasicRequest<LdGarbagePlus, LdGarbagePlusDbm.GarbagePlusRelationTrace>(LdGarbagePlus.class);
        request.registerSourceList(sourceList);
        return request;
    }

    /**
     * Arrange hierarchy.
     * @param request Hierarchy request of LdGarbagePlus. (NotNull)
     * @return The list of LdGarbagePlus. (NotNull)
     */
    public List<LdGarbagePlus> arrangeHierarchy(LdHierarchyRequest<LdGarbagePlus> request) {
        return new LdHierarchyArranger<LdGarbagePlus>().arrangeHierarchy(request);
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(LdEntity entity) {
        return false;
    }

    @Override
    protected boolean hasUpdateDateValue(LdEntity entity) {
        return downcast(entity).getUTimestamp() != null;
    }

    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    protected LdGarbagePlus downcast(LdEntity entity) {
        return helpDowncastInternally(entity, LdGarbagePlus.class);
    }
}

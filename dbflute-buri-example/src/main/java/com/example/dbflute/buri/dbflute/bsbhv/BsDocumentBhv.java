package com.example.dbflute.buri.dbflute.bsbhv;

import java.util.List;

import org.seasar.dbflute.*;
import org.seasar.dbflute.bhv.*;
import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.outsidesql.executor.*;
import com.example.dbflute.buri.dbflute.allcommon.plugin.buri.BuriDef;
import com.example.dbflute.buri.dbflute.exbhv.*;
import com.example.dbflute.buri.dbflute.exentity.*;
import com.example.dbflute.buri.dbflute.bsentity.dbmeta.*;
import com.example.dbflute.buri.dbflute.cbean.*;

/**
 * The behavior of DOCUMENT as TABLE. <br />
 * <pre>
 * [primary key]
 *     ID
 * 
 * [column]
 *     ID, TITLE, CONTENT
 * 
 * [sequence]
 *     SEQ_DOCUMENT_ID
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     BURI_ALL_ROUND_STATE(_文書管理_文書公開)
 * 
 * [referrer table]
 *     BURI_ALL_ROUND_STATE
 * 
 * [foreign property]
 *     buriAllRoundState_文書管理_文書公開
 * 
 * [referrer property]
 *     buriAllRoundStateList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsDocumentBhv extends AbstractBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /** @return The name on database of table. (NotNull) */
    public String getTableDbName() { return "DOCUMENT"; }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** @return The instance of DBMeta. (NotNull) */
    public DBMeta getDBMeta() { return DocumentDbm.getInstance(); }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public DocumentDbm getMyDBMeta() { return DocumentDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public Entity newEntity() { return newMyEntity(); }

    /** {@inheritDoc} */
    public ConditionBean newConditionBean() { return newMyConditionBean(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public Document newMyEntity() { return new Document(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public DocumentCB newMyConditionBean() { return new DocumentCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br />
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * DocumentCB cb = new DocumentCB();
     * cb.query().setFoo...(value);
     * int count = documentBhv.<span style="color: #FD4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of Document. (NotNull)
     * @return The selected count.
     */
    public int selectCount(DocumentCB cb) {
        return doSelectCountUniquely(cb);
    }

    protected int doSelectCountUniquely(DocumentCB cb) { // called by selectCount(cb) 
        assertCBStateValid(cb);
        return delegateSelectCountUniquely(cb);
    }

    protected int doSelectCountPlainly(DocumentCB cb) { // called by selectPage(cb)
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
     * DocumentCB cb = new DocumentCB();
     * cb.query().setFoo...(value);
     * documentBhv.<span style="color: #FD4747">selectCursor</span>(cb, new EntityRowHandler&lt;Document&gt;() {
     *     public void handle(Document entity) {
     *         ... = entity.getFoo...();
     *     }
     * });
     * </pre>
     * @param cb The condition-bean of Document. (NotNull)
     * @param entityRowHandler The handler of entity row of Document. (NotNull)
     */
    public void selectCursor(DocumentCB cb, EntityRowHandler<Document> entityRowHandler) {
        doSelectCursor(cb, entityRowHandler, Document.class);
    }

    protected <ENTITY extends Document> void doSelectCursor(DocumentCB cb, EntityRowHandler<ENTITY> entityRowHandler, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityRowHandler<Document>", entityRowHandler); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        delegateSelectCursor(cb, entityRowHandler, entityType);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean.
     * <pre>
     * DocumentCB cb = new DocumentCB();
     * cb.query().setFoo...(value);
     * Document document = documentBhv.<span style="color: #FD4747">selectEntity</span>(cb);
     * if (document != null) {
     *     ... = document.get...();
     * } else {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of Document. (NotNull)
     * @return The selected entity. (NullAllowed: If the condition has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Document selectEntity(DocumentCB cb) {
        return doSelectEntity(cb, Document.class);
    }

    protected <ENTITY extends Document> ENTITY doSelectEntity(final DocumentCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityInternally(cb, new InternalSelectEntityCallback<ENTITY, DocumentCB>() {
            public List<ENTITY> callbackSelectList(DocumentCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntity(ConditionBean cb) {
        return selectEntity(downcast(cb));
    }

    /**
     * Select the entity by the condition-bean with deleted check.
     * <pre>
     * DocumentCB cb = new DocumentCB();
     * cb.query().setFoo...(value);
     * Document document = documentBhv.<span style="color: #FD4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = document.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of Document. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Document selectEntityWithDeletedCheck(DocumentCB cb) {
        return doSelectEntityWithDeletedCheck(cb, Document.class);
    }

    protected <ENTITY extends Document> ENTITY doSelectEntityWithDeletedCheck(final DocumentCB cb, final Class<ENTITY> entityType) {
        assertCBStateValid(cb);
        return helpSelectEntityWithDeletedCheckInternally(cb, new InternalSelectEntityWithDeletedCheckCallback<ENTITY, DocumentCB>() {
            public List<ENTITY> callbackSelectList(DocumentCB cb) { return doSelectList(cb, entityType); } });
    }

    @Override
    protected Entity doReadEntityWithDeletedCheck(ConditionBean cb) {
        return selectEntityWithDeletedCheck(downcast(cb));
    }

    /**
     * Select the entity by the primary-key value.
     * @param id The one of primary key. (NotNull)
     * @return The selected entity. (NullAllowed: If the primary-key value has no data, it returns null)
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Document selectByPKValue(Long id) {
        return doSelectByPKValue(id, Document.class);
    }

    protected <ENTITY extends Document> ENTITY doSelectByPKValue(Long id, Class<ENTITY> entityType) {
        return doSelectEntity(buildPKCB(id), entityType);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param id The one of primary key. (NotNull)
     * @return The selected entity. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public Document selectByPKValueWithDeletedCheck(Long id) {
        return doSelectByPKValueWithDeletedCheck(id, Document.class);
    }

    protected <ENTITY extends Document> ENTITY doSelectByPKValueWithDeletedCheck(Long id, Class<ENTITY> entityType) {
        return doSelectEntityWithDeletedCheck(buildPKCB(id), entityType);
    }

    private DocumentCB buildPKCB(Long id) {
        assertObjectNotNull("id", id);
        DocumentCB cb = newMyConditionBean();
        cb.query().setId_Equal(id);
        return cb;
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * DocumentCB cb = new DocumentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * ListResultBean&lt;Document&gt; documentList = documentBhv.<span style="color: #FD4747">selectList</span>(cb);
     * for (Document document : documentList) {
     *     ... = document.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Document. (NotNull)
     * @return The result bean of selected list. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<Document> selectList(DocumentCB cb) {
        return doSelectList(cb, Document.class);
    }

    protected <ENTITY extends Document> ListResultBean<ENTITY> doSelectList(DocumentCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        assertSpecifyDerivedReferrerEntityProperty(cb, entityType);
        return helpSelectListInternally(cb, entityType, new InternalSelectListCallback<ENTITY, DocumentCB>() {
            public List<ENTITY> callbackSelectList(DocumentCB cb, Class<ENTITY> entityType) { return delegateSelectList(cb, entityType); } });
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
     * DocumentCB cb = new DocumentCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #FD4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;Document&gt; page = documentBhv.<span style="color: #FD4747">selectPage</span>(cb);
     * int allRecordCount = page.getAllRecordCount();
     * int allPageCount = page.getAllPageCount();
     * boolean isExistPrePage = page.isExistPrePage();
     * boolean isExistNextPage = page.isExistNextPage();
     * ...
     * for (Document document : page) {
     *     ... = document.get...();
     * }
     * </pre>
     * @param cb The condition-bean of Document. (NotNull)
     * @return The result bean of selected page. (NotNull)
     * @exception org.seasar.dbflute.exception.DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<Document> selectPage(DocumentCB cb) {
        return doSelectPage(cb, Document.class);
    }

    protected <ENTITY extends Document> PagingResultBean<ENTITY> doSelectPage(DocumentCB cb, Class<ENTITY> entityType) {
        assertCBStateValid(cb); assertObjectNotNull("entityType", entityType);
        return helpSelectPageInternally(cb, entityType, new InternalSelectPageCallback<ENTITY, DocumentCB>() {
            public int callbackSelectCount(DocumentCB cb) { return doSelectCountPlainly(cb); }
            public List<ENTITY> callbackSelectList(DocumentCB cb, Class<ENTITY> entityType) { return doSelectList(cb, entityType); }
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
     * documentBhv.<span style="color: #FD4747">scalarSelect</span>(Date.class).max(new ScalarQuery() {
     *     public void query(DocumentCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooDatetime()</span>; <span style="color: #3F7E5E">// required for a function</span>
     *         cb.query().setBarName_PrefixSearch("S");
     *     }
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar value derived by a function. (NullAllowed)
     */
    public <RESULT> SLFunction<DocumentCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return doScalarSelect(resultType, newMyConditionBean());
    }

    protected <RESULT, CB extends DocumentCB> SLFunction<CB, RESULT> doScalarSelect(Class<RESULT> resultType, CB cb) {
        assertObjectNotNull("resultType", resultType); assertCBStateValid(cb);
        cb.xsetupForScalarSelect(); cb.getSqlClause().disableSelectIndex(); // for when you use union
        return new SLFunction<CB, RESULT>(cb, resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    /**
     * Select the next value as sequence. <br />
     * This method is called when insert() and set to primary-key automatically.
     * So you don't need to call this as long as you need to get next value before insert().  
     * @return The next value. (NotNull)
     */
    public Long selectNextVal() {
        return doSelectNextVal(Long.class);
    }

    protected <RESULT> RESULT doSelectNextVal(Class<RESULT> resultType) {
        return delegateSelectNextVal(resultType);
    }

    @Override
    protected Number doReadNextVal() {
        return selectNextVal();
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param document The entity of document. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriAllRoundStateList(Document document, ConditionBeanSetupper<BuriAllRoundStateCB> conditionBeanSetupper) {
        xassLRArg(document, conditionBeanSetupper);
        loadBuriAllRoundStateList(xnewLRLs(document), conditionBeanSetupper);
    }
    /**
     * Load referrer of buriAllRoundStateList with the set-upper for condition-bean of referrer. <br />
     * BURI_ALL_ROUND_STATE by your INTERNAL_PK_VALUE, named 'buriAllRoundStateList'. <br />
         * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * documentBhv.<span style="color: #FD4747">loadBuriAllRoundStateList</span>(documentList, new ConditionBeanSetupper&lt;BuriAllRoundStateCB&gt;() {
     *     public void setup(BuriAllRoundStateCB cb) {
     *         cb.setupSelect...();
     *         cb.query().setFoo...(value);
     *         cb.query().addOrderBy_Bar...(); <span style="color: #3F7E5E">// basically you should order referrer list</span>
     *     }
     * });
     * for (Document document : documentList) {
     *     ... = document.<span style="color: #FD4747">getBuriAllRoundStateList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key(and others too) is treated as case-insensitive. <br />
     * The condition-bean that the set-upper provides have settings before you touch it. It is as follows:
     * <pre>
     * cb.query().setInternalPkValue_InScope(pkList);
     * cb.query().addOrderBy_InternalPkValue_Asc();
     * </pre>
     * @param documentList The entity list of document. (NotNull)
     * @param conditionBeanSetupper The instance of referrer condition-bean set-upper for registering referrer condition. (NotNull)
     */
    public void loadBuriAllRoundStateList(List<Document> documentList, ConditionBeanSetupper<BuriAllRoundStateCB> conditionBeanSetupper) {
        xassLRArg(documentList, conditionBeanSetupper);
        loadBuriAllRoundStateList(documentList, new LoadReferrerOption<BuriAllRoundStateCB, BuriAllRoundState>().xinit(conditionBeanSetupper));
    }
    /**
     * {Refer to overload method that has an argument of the list of entity.}
     * @param document The entity of document. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriAllRoundStateList(Document document, LoadReferrerOption<BuriAllRoundStateCB, BuriAllRoundState> loadReferrerOption) {
        xassLRArg(document, loadReferrerOption);
        loadBuriAllRoundStateList(xnewLRLs(document), loadReferrerOption);
    }
    /**
     * {Refer to overload method that has an argument of condition-bean setupper.}
     * @param documentList The entity list of document. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     */
    public void loadBuriAllRoundStateList(List<Document> documentList, LoadReferrerOption<BuriAllRoundStateCB, BuriAllRoundState> loadReferrerOption) {
        xassLRArg(documentList, loadReferrerOption);
        if (documentList.isEmpty()) { return; }
        final BuriAllRoundStateBhv referrerBhv = xgetBSFLR().select(BuriAllRoundStateBhv.class);
        helpLoadReferrerInternally(documentList, loadReferrerOption, new InternalLoadReferrerCallback<Document, Long, BuriAllRoundStateCB, BuriAllRoundState>() {
            public Long getPKVal(Document e)
            { return e.getId(); }
            public void setRfLs(Document e, List<BuriAllRoundState> ls)
            { e.setBuriAllRoundStateList(ls); }
            public BuriAllRoundStateCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(BuriAllRoundStateCB cb, List<Long> ls)
            { cb.query().setInternalPkValue_InScope(ls); }
            public void qyOdFKAsc(BuriAllRoundStateCB cb) { cb.query().addOrderBy_InternalPkValue_Asc(); }
            public void spFKCol(BuriAllRoundStateCB cb) { cb.specify().columnInternalPkValue(); }
            public List<BuriAllRoundState> selRfLs(BuriAllRoundStateCB cb) { return referrerBhv.selectList(cb); }
            public Long getFKVal(BuriAllRoundState e) { return e.getInternalPkValue(); }
            public void setlcEt(BuriAllRoundState re, Document le)
            { re.setDocument(le); }
            public String getRfPrNm() { return "buriAllRoundStateList"; }
        });
    }

    public void loadBuriAllRoundStateHistory_文書管理_文書公開List(Document document, org.seasar.dbflute.bhv.ConditionBeanSetupper<BuriAllRoundStateHistoryCB> conditionBeanSetupper) {
        xassLRArg(document, conditionBeanSetupper);
        loadBuriAllRoundStateHistory_文書管理_文書公開List(xnewLRLs(document), conditionBeanSetupper);
    }
    public void loadBuriAllRoundStateHistory_文書管理_文書公開List(List<Document> documentList, org.seasar.dbflute.bhv.ConditionBeanSetupper<BuriAllRoundStateHistoryCB> conditionBeanSetupper) {
        xassLRArg(documentList, conditionBeanSetupper);
        loadBuriAllRoundStateHistory_文書管理_文書公開List(documentList, new org.seasar.dbflute.bhv.LoadReferrerOption<BuriAllRoundStateHistoryCB, BuriAllRoundStateHistory>().xinit(conditionBeanSetupper));
    }
    public void loadBuriAllRoundStateHistory_文書管理_文書公開List(Document document, org.seasar.dbflute.bhv.LoadReferrerOption<BuriAllRoundStateHistoryCB, BuriAllRoundStateHistory> loadReferrerOption) {
        xassLRArg(document, loadReferrerOption);
        loadBuriAllRoundStateHistory_文書管理_文書公開List(xnewLRLs(document), loadReferrerOption);
    }
    public void loadBuriAllRoundStateHistory_文書管理_文書公開List(List<Document> documentList, org.seasar.dbflute.bhv.LoadReferrerOption<BuriAllRoundStateHistoryCB, BuriAllRoundStateHistory> loadReferrerOption) {
        xassLRArg(documentList, loadReferrerOption);
        if (documentList.isEmpty()) { return; }
        final com.example.dbflute.buri.dbflute.exbhv.BuriAllRoundStateHistoryBhv referrerBhv = xgetBSFLR().select(com.example.dbflute.buri.dbflute.exbhv.BuriAllRoundStateHistoryBhv.class);
        helpLoadReferrerInternally(documentList, loadReferrerOption, new InternalLoadReferrerCallback<Document, Long, BuriAllRoundStateHistoryCB, BuriAllRoundStateHistory>() {
            public Long getPKVal(Document entity)
            { return entity.getId(); }
            public void setRfLs(Document entity, List<BuriAllRoundStateHistory> referrerList)
            { entity.setBuriAllRoundStateHistory_文書管理_文書公開List(referrerList); }
            public BuriAllRoundStateHistoryCB newMyCB() { return referrerBhv.newMyConditionBean(); }
            public void qyFKIn(BuriAllRoundStateHistoryCB cb, List<Long> pkList) {
                java.util.List<Long> internalPkValueList = new java.util.ArrayList<Long>();
                for (Long pk : pkList) {
                    internalPkValueList.add(Long.valueOf(pk.toString()));
                }
                cb.query().setInternalPkValue_InScope(internalPkValueList);
                cb.query().setInternalDataType_Equal("com.example.dbflute.buri.dbflute.exentity.Document"); // is a fixed condition!
            }
            public void qyOdFKAsc(BuriAllRoundStateHistoryCB cb)
            { cb.query().addOrderBy_InternalPkValue_Asc(); }
            public void spFKCol(BuriAllRoundStateHistoryCB cb) { cb.specify().columnInternalPkValue(); }
            public List<BuriAllRoundStateHistory> selRfLs(BuriAllRoundStateHistoryCB cb)
            { return referrerBhv.selectList(cb); }
            public Long getFKVal(BuriAllRoundStateHistory entity)
            { return Long.valueOf(entity.getInternalPkValue().toString()); }
            public void setlcEt(BuriAllRoundStateHistory referrerEntity, Document localEntity)
            { referrerEntity.setDocument_文書管理_文書公開(localEntity); }
            public String getRfPrNm() { return "${referrer.referrerPropertyName}"; }
        });
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    /**
     * Pull out the list of foreign table 'BuriAllRoundState'.
     * @param documentList The list of document. (NotNull)
     * @return The list of foreign table. (NotNull)
     */
    public List<BuriAllRoundState> pulloutBuriAllRoundState_文書管理_文書公開(List<Document> documentList) {
        return helpPulloutInternally(documentList, new InternalPulloutCallback<Document, BuriAllRoundState>() {
            public BuriAllRoundState getFr(Document e) { return e.getBuriAllRoundState_文書管理_文書公開(); }
            public boolean hasRf() { return false; }
            public void setRfLs(BuriAllRoundState e, List<Document> ls)
            { throw new UnsupportedOperationException(); }
        });
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity.
     * <pre>
     * Document document = new Document();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * document.setFoo...(value);
     * document.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//document.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//document.set...;</span>
     * documentBhv.<span style="color: #FD4747">insert</span>(document);
     * ... = document.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param document The entity of insert target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insert(Document document) {
        doInsert(document, null);
    }

    protected void doInsert(Document document, InsertOption<DocumentCB> option) {
        assertObjectNotNull("document", document);
        prepareInsertOption(option);
        delegateInsert(document, option);
    }

    protected void prepareInsertOption(InsertOption<DocumentCB> option) {
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
     * Document document = new Document();
     * document.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * document.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//document.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//document.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * document.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     documentBhv.<span style="color: #FD4747">update</span>(document);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param document The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void update(final Document document) {
        doUpdate(document, null);
    }

    protected void doUpdate(Document document, final UpdateOption<DocumentCB> option) {
        assertObjectNotNull("document", document);
        prepareUpdateOption(option);
        helpUpdateInternally(document, new InternalUpdateCallback<Document>() {
            public int callbackDelegateUpdate(Document entity) { return delegateUpdate(entity, option); } });
    }

    protected void prepareUpdateOption(UpdateOption<DocumentCB> option) {
        if (option == null) { return; }
        assertUpdateOptionStatus(option);
        if (option.hasSelfSpecification()) {
            option.resolveSelfSpecification(createCBForVaryingUpdate());
        }
        if (option.hasSpecifiedUpdateColumn()) {
            option.resolveUpdateColumnSpecification(createCBForSpecifiedUpdate());
        }
    }

    protected DocumentCB createCBForVaryingUpdate() {
        DocumentCB cb = newMyConditionBean();
        cb.xsetupForVaryingUpdate();
        return cb;
    }

    protected DocumentCB createCBForSpecifiedUpdate() {
        DocumentCB cb = newMyConditionBean();
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
     * @param document The entity of insert or update target. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void insertOrUpdate(Document document) {
        doInesrtOrUpdate(document, null, null);
    }

    protected void doInesrtOrUpdate(Document document, final InsertOption<DocumentCB> insertOption, final UpdateOption<DocumentCB> updateOption) {
        helpInsertOrUpdateInternally(document, new InternalInsertOrUpdateCallback<Document, DocumentCB>() {
            public void callbackInsert(Document entity) { doInsert(entity, insertOption); }
            public void callbackUpdate(Document entity) { doUpdate(entity, updateOption); }
            public DocumentCB callbackNewMyConditionBean() { return newMyConditionBean(); }
            public int callbackSelectCount(DocumentCB cb) { return selectCount(cb); }
        });
    }

    @Override
    protected void doCreateOrModify(Entity entity, InsertOption<? extends ConditionBean> insertOption,
            UpdateOption<? extends ConditionBean> updateOption) {
        if (insertOption == null && updateOption == null) { insertOrUpdate(downcast(entity)); }
        else {
            insertOption = insertOption == null ? new InsertOption<DocumentCB>() : insertOption;
            updateOption = updateOption == null ? new UpdateOption<DocumentCB>() : updateOption;
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
     * Document document = new Document();
     * document.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * document.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     documentBhv.<span style="color: #FD4747">delete</span>(document);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * } 
     * </pre>
     * @param document The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(Document document) {
        doDelete(document, null);
    }

    protected void doDelete(Document document, final DeleteOption<DocumentCB> option) {
        assertObjectNotNull("document", document);
        prepareDeleteOption(option);
        helpDeleteInternally(document, new InternalDeleteCallback<Document>() {
            public int callbackDelegateDelete(Document entity) { return delegateDelete(entity, option); } });
    }

    protected void prepareDeleteOption(DeleteOption<DocumentCB> option) {
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
     * @param documentList The list of the entity. (NotNull)
     * @return The array of inserted count.
     */
    public int[] batchInsert(List<Document> documentList) {
        return doBatchInsert(documentList, null);
    }

    protected int[] doBatchInsert(List<Document> documentList, InsertOption<DocumentCB> option) {
        assertObjectNotNull("documentList", documentList);
        prepareInsertOption(option);
        return delegateBatchInsert(documentList, option);
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
     * @param documentList The list of the entity. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<Document> documentList) {
        return doBatchUpdate(documentList, null);
    }

    protected int[] doBatchUpdate(List<Document> documentList, UpdateOption<DocumentCB> option) {
        assertObjectNotNull("documentList", documentList);
        prepareUpdateOption(option);
        return delegateBatchUpdate(documentList, option);
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
     * @param documentList The list of the entity. (NotNull)
     * @param updateColumnSpec The specification of update columns. (NotNull)
     * @return The array of updated count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchUpdate(List<Document> documentList, SpecifyQuery<DocumentCB> updateColumnSpec) {
        return doBatchUpdate(documentList, createSpecifiedUpdateOption(updateColumnSpec));
    }

    @Override
    protected int[] doLumpModifyNonstrict(List<Entity> ls, UpdateOption<? extends ConditionBean> option) {
        return doLumpModify(ls, option);
    }

    /**
     * Batch-delete the list. <br />
     * This method uses 'Batch Update' of java.sql.PreparedStatement.
     * @param documentList The list of the entity. (NotNull)
     * @return The array of deleted count.
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     */
    public int[] batchDelete(List<Document> documentList) {
        return doBatchDelete(documentList, null);
    }

    protected int[] doBatchDelete(List<Document> documentList, DeleteOption<DocumentCB> option) {
        assertObjectNotNull("documentList", documentList);
        prepareDeleteOption(option);
        return delegateBatchDelete(documentList, option);
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
     * documentBhv.<span style="color: #FD4747">queryInsert</span>(new QueryInsertSetupper&lt;Document, DocumentCB&gt;() {
     *     public ConditionBean setup(document entity, DocumentCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<Document, DocumentCB> setupper) {
        return doQueryInsert(setupper, null);
    }

    protected int doQueryInsert(QueryInsertSetupper<Document, DocumentCB> setupper, InsertOption<DocumentCB> option) {
        assertObjectNotNull("setupper", setupper);
        prepareInsertOption(option);
        Document entity = new Document();
        DocumentCB intoCB = createCBForQueryInsert();
        ConditionBean resourceCB = setupper.setup(entity, intoCB);
        return delegateQueryInsert(entity, intoCB, resourceCB, option);
    }

    protected DocumentCB createCBForQueryInsert() {
        DocumentCB cb = newMyConditionBean();
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
     * Document document = new Document();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//document.setPK...(value);</span>
     * document.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//document.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//document.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//document.setVersionNo(value);</span>
     * DocumentCB cb = new DocumentCB();
     * cb.query().setFoo...(value);
     * documentBhv.<span style="color: #FD4747">queryUpdate</span>(document, cb);
     * </pre>
     * @param document The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of Document. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(Document document, DocumentCB cb) {
        return doQueryUpdate(document, cb, null);
    }

    protected int doQueryUpdate(Document document, DocumentCB cb, UpdateOption<DocumentCB> option) {
        assertObjectNotNull("document", document); assertCBStateValid(cb);
        prepareUpdateOption(option);
        return delegateQueryUpdate(document, cb, option);
    }

    @Override
    protected int doRangeModify(Entity entity, ConditionBean cb, UpdateOption<? extends ConditionBean> option) {
        if (option == null) { return queryUpdate(downcast(entity), (DocumentCB)cb); }
        else { return varyingQueryUpdate(downcast(entity), (DocumentCB)cb, downcast(option)); }
    }

    /**
     * Delete the several entities by query. {NonExclusiveControl}
     * <pre>
     * DocumentCB cb = new DocumentCB();
     * cb.query().setFoo...(value);
     * documentBhv.<span style="color: #FD4747">queryDelete</span>(document, cb);
     * </pre>
     * @param cb The condition-bean of Document. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(DocumentCB cb) {
        return doQueryDelete(cb, null);
    }

    protected int doQueryDelete(DocumentCB cb, DeleteOption<DocumentCB> option) {
        assertCBStateValid(cb);
        prepareDeleteOption(option);
        return delegateQueryDelete(cb, option);
    }

    @Override
    protected int doRangeRemove(ConditionBean cb, DeleteOption<? extends ConditionBean> option) {
        if (option == null) { return queryDelete((DocumentCB)cb); }
        else { return varyingQueryDelete((DocumentCB)cb, downcast(option)); }
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
     * Document document = new Document();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * document.setFoo...(value);
     * document.setBar...(value);
     * InsertOption<DocumentCB> option = new InsertOption<DocumentCB>();
     * <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     * option.disableCommonColumnAutoSetup();
     * documentBhv.<span style="color: #FD4747">varyingInsert</span>(document, option);
     * ... = document.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param document The entity of insert target. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsert(Document document, InsertOption<DocumentCB> option) {
        assertInsertOptionNotNull(option);
        doInsert(document, option);
    }

    /**
     * Update the entity with varying requests modified-only. {UpdateCountZeroException, ExclusiveControl} <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br />
     * Other specifications are same as update(entity).
     * <pre>
     * Document document = new Document();
     * document.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * document.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of exclusive control column is required</span>
     * document.<span style="color: #FD4747">setVersionNo</span>(value);
     * try {
     *     <span style="color: #3F7E5E">// you can update by self calculation values</span>
     *     UpdateOption&lt;DocumentCB&gt; option = new UpdateOption&lt;DocumentCB&gt;();
     *     option.self(new SpecifyQuery&lt;DocumentCB&gt;() {
     *         public void specify(DocumentCB cb) {
     *             cb.specify().<span style="color: #FD4747">columnXxxCount()</span>;
     *         }
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     *     documentBhv.<span style="color: #FD4747">varyingUpdate</span>(document, option);
     * } catch (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param document The entity of update target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingUpdate(Document document, UpdateOption<DocumentCB> option) {
        assertUpdateOptionNotNull(option);
        doUpdate(document, option);
    }

    /**
     * Insert or update the entity with varying requests. {ExclusiveControl(when update)}<br />
     * Other specifications are same as insertOrUpdate(entity).
     * @param document The entity of insert or update target. (NotNull)
     * @param insertOption The option of insert for varying requests. (NotNull)
     * @param updateOption The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception org.seasar.dbflute.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void varyingInsertOrUpdate(Document document, InsertOption<DocumentCB> insertOption, UpdateOption<DocumentCB> updateOption) {
        assertInsertOptionNotNull(insertOption); assertUpdateOptionNotNull(updateOption);
        doInesrtOrUpdate(document, insertOption, updateOption);
    }

    /**
     * Delete the entity with varying requests. {UpdateCountZeroException, ExclusiveControl} <br />
     * Now a valid option does not exist. <br />
     * Other specifications are same as delete(entity).
     * @param document The entity of delete target. (NotNull) {PrimaryKeyRequired, ConcurrencyColumnRequired}
     * @param option The option of update for varying requests. (NotNull)
     * @exception org.seasar.dbflute.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception org.seasar.dbflute.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(Document document, DeleteOption<DocumentCB> option) {
        assertDeleteOptionNotNull(option);
        doDelete(document, option);
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br />
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br />
     * Other specifications are same as batchInsert(entityList).
     * @param documentList The list of the entity. (NotNull)
     * @param option The option of insert for varying requests. (NotNull)
     * @return The array of inserted count.
     */
    public int[] varyingBatchInsert(List<Document> documentList, InsertOption<DocumentCB> option) {
        assertInsertOptionNotNull(option);
        return doBatchInsert(documentList, option);
    }

    /**
     * Batch-update the list with varying requests. <br />
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br />
     * Other specifications are same as batchUpdate(entityList).
     * @param documentList The list of the entity. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The array of updated count.
     */
    public int[] varyingBatchUpdate(List<Document> documentList, UpdateOption<DocumentCB> option) {
        assertUpdateOptionNotNull(option);
        return doBatchUpdate(documentList, option);
    }

    /**
     * Batch-delete the list with varying requests. <br />
     * For example, limitBatchDeleteLogging(). <br />
     * Other specifications are same as batchDelete(entityList).
     * @param documentList The list of the entity. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The array of deleted count.
     */
    public int[] varyingBatchDelete(List<Document> documentList, DeleteOption<DocumentCB> option) {
        assertDeleteOptionNotNull(option);
        return doBatchDelete(documentList, option);
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
    public int varyingQueryInsert(QueryInsertSetupper<Document, DocumentCB> setupper, InsertOption<DocumentCB> option) {
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
     * Document document = new Document();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//document.setPK...(value);</span>
     * document.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of exclusive control column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//document.setVersionNo(value);</span>
     * DocumentCB cb = new DocumentCB();
     * cb.query().setFoo...(value);
     * UpdateOption&lt;DocumentCB&gt; option = new UpdateOption&lt;DocumentCB&gt;();
     * option.self(new SpecifyQuery&lt;DocumentCB&gt;() {
     *     public void specify(DocumentCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFooCount()</span>;
     *     }
     * }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * documentBhv.<span style="color: #FD4747">varyingQueryUpdate</span>(document, cb, option);
     * </pre>
     * @param document The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of Document. (NotNull)
     * @param option The option of update for varying requests. (NotNull)
     * @return The updated count.
     * @exception org.seasar.dbflute.exception.NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(Document document, DocumentCB cb, UpdateOption<DocumentCB> option) {
        assertUpdateOptionNotNull(option);
        return doQueryUpdate(document, cb, option);
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br />
     * For example, allowNonQueryDelete(). <br />
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param cb The condition-bean of Document. (NotNull)
     * @param option The option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @exception org.seasar.dbflute.exception.NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(DocumentCB cb, DeleteOption<DocumentCB> option) {
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
    public OutsideSqlBasicExecutor<DocumentBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                      Buri Interface
    //                                                                      ==============
    public Document xgetEntityForBuri(Long id) { // For Buri
        Document entity = new Document();
        entity.setId(id);
        DocumentCB cb = newMyConditionBean();
        cb.acceptPrimaryKeyMap(getDBMeta().extractPrimaryKeyMap(entity));
        return selectEntity(cb);
    }

    public List<Document> xgetEntitiesForBuri(List<Long> ids) { // For Buri
        DocumentCB cb = newMyConditionBean();
        cb.query().setId_InScope(ids);
        return selectList(cb);
    }

    protected org.escafe.buri.engine.processor.BuriAutoSelectProcessor _buriAutoSelectProcessor;
    public void setBuriAutoSelectProcessor(org.escafe.buri.engine.processor.BuriAutoSelectProcessor buriAutoSelectProcessor) {
        _buriAutoSelectProcessor = buriAutoSelectProcessor;
    }

    protected void toNextStatusAction(String processPath, Object entity, Object userData, String action) {
        try {
            _buriAutoSelectProcessor.toNextStatusAction(processPath, entity, userData, action);
        } catch (org.seasar.coffee.script.exception.ScriptExecuteException e) {
            if (e.getCause() instanceof ognl.MethodFailedException) {
                ognl.MethodFailedException fail = (ognl.MethodFailedException) e.getCause();
                Throwable reason = fail.getReason();
                if (reason instanceof org.seasar.dbflute.exception.EntityAlreadyExistsException) {
                    throw (org.seasar.dbflute.exception.EntityAlreadyExistsException)reason;
                } else if (reason instanceof org.seasar.dbflute.exception.EntityAlreadyDeletedException) {
                    throw (org.seasar.dbflute.exception.EntityAlreadyDeletedException)reason;
                } else if (reason instanceof org.seasar.dbflute.exception.EntityAlreadyUpdatedException) {
                    throw (org.seasar.dbflute.exception.EntityAlreadyUpdatedException)reason;
                }
            }
            throw e;
        }
    }

    protected BuriDef.BuriUserDataProvider _buriUserDataProvider;
    public void setBuriUserDataProvider(BuriDef.BuriUserDataProvider buriUserDataProvider) {
        _buriUserDataProvider = buriUserDataProvider;
    }

    public void toNextStatus_文書管理_文書公開(Document document, BuriDef.文書管理_文書公開_Action action) {
        assertEntityNotNull(document);
        String processPath = BuriDef.BuriProcess.文書管理_文書公開.path();
        Object userData = getUserData_文書管理_文書公開(document, action);
        toNextStatusAction(processPath, document, userData, action.code());
    }

    protected Object getUserData_文書管理_文書公開(Document document, BuriDef.文書管理_文書公開_Action action) {
        if (_buriUserDataProvider == null) { return null; }
        return _buriUserDataProvider.provide(BuriDef.BuriProcess.文書管理_文書公開, document, action);
    }

    public BuriDef.文書管理_文書公開_Status getStatus_文書管理_文書公開(Document document) {
        assertEntityNotNullAndHasPrimaryKeyValue(document);
        java.util.List<BuriAllRoundState> buriAllRoundStateList = xgetCurrentStateList(document, BuriDef.BuriProcess.文書管理_文書公開);
        java.util.List<BuriDef.文書管理_文書公開_Status> statusList = new java.util.ArrayList<BuriDef.文書管理_文書公開_Status>();
        if (buriAllRoundStateList.isEmpty()) { return null; }
        for (BuriAllRoundState buriAllRoundState : buriAllRoundStateList) {
            BuriDef.文書管理_文書公開_Status status = BuriDef.文書管理_文書公開_Status.codeOf(buriAllRoundState.getStatusPathName());
            if (status != null) { statusList.add(status); }
        }
        if (statusList.size() > 1) {
            String msg = "This method does not support duplicate status: " + statusList;
            throw new IllegalStateException(msg);
        }
        return !statusList.isEmpty() ? statusList.get(0) : null;
    }

    public java.util.List<Document> getEntities(org.seasar.dbflute.bhv.ConditionBeanSetupper<DocumentCB> conditionBeanSetupper
            , BuriDef.文書管理_文書公開_Status... statuses) {
        assertObjectNotNull("statuses", statuses);
        DocumentCB cb = newMyConditionBean();
        cb.setupSelect_BuriAllRoundState_文書管理_文書公開();
        conditionBeanSetupper.setup(cb);
        java.util.List<String> pathNameList = new java.util.ArrayList<String>();
        for (BuriDef.文書管理_文書公開_Status status : statuses) {
            pathNameList.add(status.path());
        }
        cb.query().queryBuriAllRoundState_文書管理_文書公開().setStatusPathName_InScope(pathNameList);
        return selectList(cb);
    }

    private List<BuriAllRoundState> xgetCurrentStateList(Document document, BuriDef.BuriProcess process) {
        com.example.dbflute.buri.dbflute.exbhv.BuriAllRoundStateBhv bhv = xgetBuriAllRoundStateBhv();
        BuriAllRoundStateCB cb = bhv.newMyConditionBean();
        cb.specify().columnStatusPathName();
        cb.query().setStatusPathName_LikeSearch(process.path() + ".", new org.seasar.dbflute.cbean.coption.LikeSearchOption().likePrefix());
        cb.query().setInternalPkValue_Equal(new Long(document.getId()));
        cb.query().setInternalDataType_Equal(Document.class.getName());
        return bhv.selectList(cb);
    }

    private com.example.dbflute.buri.dbflute.exbhv.BuriAllRoundStateBhv xgetBuriAllRoundStateBhv() {
        return getBehaviorSelector().select(com.example.dbflute.buri.dbflute.exbhv.BuriAllRoundStateBhv.class);
    }

    // ===================================================================================
    //                                                                     Delegate Method
    //                                                                     ===============
    // [Behavior Command]
    // -----------------------------------------------------
    //                                                Select
    //                                                ------
    protected int delegateSelectCountUniquely(DocumentCB cb) { return invoke(createSelectCountCBCommand(cb, true)); }
    protected int delegateSelectCountPlainly(DocumentCB cb) { return invoke(createSelectCountCBCommand(cb, false)); }
    protected <ENTITY extends Document> void delegateSelectCursor(DocumentCB cb, EntityRowHandler<ENTITY> erh, Class<ENTITY> et)
    { invoke(createSelectCursorCBCommand(cb, erh, et)); }
    protected <ENTITY extends Document> List<ENTITY> delegateSelectList(DocumentCB cb, Class<ENTITY> et)
    { return invoke(createSelectListCBCommand(cb, et)); }
    protected <RESULT> RESULT delegateSelectNextVal(Class<RESULT> rt) { return invoke(createSelectNextValCommand(rt)); }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected int delegateInsert(Document e, InsertOption<DocumentCB> op)
    { if (!processBeforeInsert(e, op)) { return 0; }
      return invoke(createInsertEntityCommand(e, op)); }
    protected int delegateUpdate(Document e, UpdateOption<DocumentCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return delegateUpdateNonstrict(e, op); }
    protected int delegateUpdateNonstrict(Document e, UpdateOption<DocumentCB> op)
    { if (!processBeforeUpdate(e, op)) { return 0; }
      return invoke(createUpdateNonstrictEntityCommand(e, op)); }
    protected int delegateDelete(Document e, DeleteOption<DocumentCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return delegateDeleteNonstrict(e, op); }
    protected int delegateDeleteNonstrict(Document e, DeleteOption<DocumentCB> op)
    { if (!processBeforeDelete(e, op)) { return 0; }
      return invoke(createDeleteNonstrictEntityCommand(e, op)); }

    protected int[] delegateBatchInsert(List<Document> ls, InsertOption<DocumentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchInsertCommand(processBatchInternally(ls, op), op)); }
    protected int[] delegateBatchUpdate(List<Document> ls, UpdateOption<DocumentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchUpdateNonstrict(ls, op); }
    protected int[] delegateBatchUpdateNonstrict(List<Document> ls, UpdateOption<DocumentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchUpdateNonstrictCommand(processBatchInternally(ls, op, true), op)); }
    protected int[] delegateBatchDelete(List<Document> ls, DeleteOption<DocumentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return delegateBatchDeleteNonstrict(ls, op); }
    protected int[] delegateBatchDeleteNonstrict(List<Document> ls, DeleteOption<DocumentCB> op)
    { if (ls.isEmpty()) { return new int[]{}; }
      return invoke(createBatchDeleteNonstrictCommand(processBatchInternally(ls, op, true), op)); }

    protected int delegateQueryInsert(Document e, DocumentCB inCB, ConditionBean resCB, InsertOption<DocumentCB> op)
    { if (!processBeforeQueryInsert(e, inCB, resCB, op)) { return 0; } return invoke(createQueryInsertCBCommand(e, inCB, resCB, op));  }
    protected int delegateQueryUpdate(Document e, DocumentCB cb, UpdateOption<DocumentCB> op)
    { if (!processBeforeQueryUpdate(e, cb, op)) { return 0; } return invoke(createQueryUpdateCBCommand(e, cb, op));  }
    protected int delegateQueryDelete(DocumentCB cb, DeleteOption<DocumentCB> op)
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
    protected Document downcast(Entity entity) {
        return helpEntityDowncastInternally(entity, Document.class);
    }

    protected DocumentCB downcast(ConditionBean cb) {
        return helpConditionBeanDowncastInternally(cb, DocumentCB.class);
    }

    @SuppressWarnings("unchecked")
    protected List<Document> downcast(List<? extends Entity> entityList) {
        return (List<Document>)entityList;
    }

    @SuppressWarnings("unchecked")
    protected InsertOption<DocumentCB> downcast(InsertOption<? extends ConditionBean> option) {
        return (InsertOption<DocumentCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected UpdateOption<DocumentCB> downcast(UpdateOption<? extends ConditionBean> option) {
        return (UpdateOption<DocumentCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected DeleteOption<DocumentCB> downcast(DeleteOption<? extends ConditionBean> option) {
        return (DeleteOption<DocumentCB>)option;
    }

    @SuppressWarnings("unchecked")
    protected QueryInsertSetupper<Document, DocumentCB> downcast(QueryInsertSetupper<? extends Entity, ? extends ConditionBean> option) {
        return (QueryInsertSetupper<Document, DocumentCB>)option;
    }
}

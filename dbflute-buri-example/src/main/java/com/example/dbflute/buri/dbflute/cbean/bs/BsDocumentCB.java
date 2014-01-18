package com.example.dbflute.buri.dbflute.cbean.bs;

import org.seasar.dbflute.cbean.AbstractConditionBean;
import org.seasar.dbflute.cbean.AndQuery;
import org.seasar.dbflute.cbean.ConditionBean;
import org.seasar.dbflute.cbean.ConditionQuery;
import org.seasar.dbflute.cbean.OrQuery;
import org.seasar.dbflute.cbean.SpecifyQuery;
import org.seasar.dbflute.cbean.SubQuery;
import org.seasar.dbflute.cbean.UnionQuery;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import org.seasar.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import com.example.dbflute.buri.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.buri.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.buri.dbflute.allcommon.ImplementedInvokerAssistant;
import com.example.dbflute.buri.dbflute.allcommon.ImplementedSqlClauseCreator;
import com.example.dbflute.buri.dbflute.cbean.*;
import com.example.dbflute.buri.dbflute.cbean.cq.*;
import com.example.dbflute.buri.dbflute.cbean.nss.*;

/**
 * The base condition-bean of DOCUMENT.
 * @author DBFlute(AutoGenerator)
 */
public class BsDocumentCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DocumentCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsDocumentCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "DOCUMENT";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Long id) {
        assertObjectNotNull("id", id);
        BsDocumentCB cb = this;
        cb.query().setId_Equal(id);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_Id_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_Id_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br />
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * cb.query().setMemberName_PrefixSearch(value);   <span style="color: #3F7E5E">// like 'a%' escape '|'</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_DateFromTo(fromDate, toDate);
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     * 
     * <span style="color: #3F7E5E">// ExistsReferrer: (co-related sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchaseList(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * });
     * cb.query().notExistsPurchaseList...
     * 
     * <span style="color: #3F7E5E">// InScopeRelation: (sub-query)</span>
     * <span style="color: #3F7E5E">// {where MEMBER_STATUS_CODE in (select MEMBER_STATUS_CODE from MEMBER_STATUS where ...)}</span>
     * cb.query().inScopeMemberStatus(new SubQuery&lt;MemberStatusCB&gt;() {
     *     public void query(MemberStatusCB subCB) {
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// relation sub-query condition</span>
     *     }
     * });
     * cb.query().notInScopeMemberStatus...
     * 
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (co-related sub-query)</span>
     * cb.query().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     *     }
     * }).greaterEqual(value);
     * 
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(new SubQuery&lt;MemberCB&gt;() {
     *     public void query(MemberCB subCB) {
     *         subCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setXxx... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     *     }
     * });
     * 
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(valueList);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     * 
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public DocumentCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public DocumentCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected DocumentCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected DocumentCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        DocumentCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected DocumentCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new DocumentCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    public ConditionQuery localCQ() {
        return getConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;DocumentCB&gt;() {
     *     public void query(DocumentCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<DocumentCB> unionQuery) {
        final DocumentCB cb = new DocumentCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final DocumentCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;DocumentCB&gt;() {
     *     public void query(DocumentCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<DocumentCB> unionQuery) {
        final DocumentCB cb = new DocumentCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final DocumentCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected BuriAllRoundStateNss _nssBuriAllRoundState_文書管理_文書公開;
    public BuriAllRoundStateNss getNssBuriAllRoundState_文書管理_文書公開() {
        if (_nssBuriAllRoundState_文書管理_文書公開 == null) { _nssBuriAllRoundState_文書管理_文書公開 = new BuriAllRoundStateNss(null); }
        return _nssBuriAllRoundState_文書管理_文書公開;
    }
    /**
     * Set up relation columns to select clause. <br />
     * BURI_ALL_ROUND_STATE by my ID, named 'buriAllRoundState_文書管理_文書公開'.
     * <pre>
     * DocumentCB cb = new DocumentCB();
     * cb.<span style="color: #FD4747">setupSelect_BuriAllRoundState_文書管理_文書公開()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * Document document = documentBhv.selectEntityWithDeletedCheck(cb);
     * ... = document.<span style="color: #FD4747">getBuriAllRoundState_文書管理_文書公開()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BuriAllRoundStateNss setupSelect_BuriAllRoundState_文書管理_文書公開() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryBuriAllRoundState_文書管理_文書公開(); } });
        if (_nssBuriAllRoundState_文書管理_文書公開 == null || !_nssBuriAllRoundState_文書管理_文書公開.hasConditionQuery())
        { _nssBuriAllRoundState_文書管理_文書公開 = new BuriAllRoundStateNss(query().queryBuriAllRoundState_文書管理_文書公開()); }
        return _nssBuriAllRoundState_文書管理_文書公開;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br />
     * This method should be called after SetupSelect.
     * <pre>
     * cb.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     * cb.specify().columnMemberName();
     * cb.specify().specifyMemberStatus().columnMemberStatusName();
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *         subCB.query().set...
     *     }
     * }, aliasName);
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , new HpSpQyCall<DocumentCQ>() {
                public boolean has() { return true; }
                public DocumentCQ qy() { return getConditionQuery(); }
            }
            , _purpose, getDBMetaProvider()); }
        return _specification;
    }

    protected boolean hasSpecifiedColumn() {
        return _specification != null && _specification.isAlreadySpecifiedRequiredColumn();
    }

    protected HpAbstractSpecification<? extends ConditionQuery> localSp() {
        return specify();
    }

    public static class HpSpecification extends HpAbstractSpecification<DocumentCQ> {
        protected BuriAllRoundStateCB.HpSpecification _buriAllRoundState_文書管理_文書公開;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<DocumentCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnId() { return doColumn("ID"); }
        /**
         * TITLE: {NotNull, VARCHAR2(64)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnTitle() { return doColumn("TITLE"); }
        /**
         * CONTENT: {NotNull, VARCHAR2(1024)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnContent() { return doColumn("CONTENT"); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnId(); // PK
        }
        @Override
        protected String getTableDbName() { return "DOCUMENT"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * BURI_ALL_ROUND_STATE by my ID, named 'buriAllRoundState_文書管理_文書公開'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BuriAllRoundStateCB.HpSpecification specifyBuriAllRoundState_文書管理_文書公開() {
            assertRelation("buriAllRoundState_文書管理_文書公開");
            if (_buriAllRoundState_文書管理_文書公開 == null) {
                _buriAllRoundState_文書管理_文書公開 = new BuriAllRoundStateCB.HpSpecification(_baseCB, new HpSpQyCall<BuriAllRoundStateCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryBuriAllRoundState_文書管理_文書公開(); }
                    public BuriAllRoundStateCQ qy() { return _qyCall.qy().queryBuriAllRoundState_文書管理_文書公開(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _buriAllRoundState_文書管理_文書公開.xsetSyncQyCall(new HpSpQyCall<BuriAllRoundStateCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBuriAllRoundState_文書管理_文書公開(); }
                        public BuriAllRoundStateCQ qy() { return xsyncQyCall().qy().queryBuriAllRoundState_文書管理_文書公開(); }
                    });
                }
            }
            return _buriAllRoundState_文書管理_文書公開;
        }
        /**
         * Prepare for (Specify)DerivedReferrer. <br />
         * {select max(FOO) from BURI_ALL_ROUND_STATE where ...) as FOO_MAX} <br />
         * BURI_ALL_ROUND_STATE by your INTERNAL_PK_VALUE, named 'buriAllRoundStateList'. <br />
         * This relation is auto-detected as implicit reverse FK.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedBuriAllRoundStateList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;BuriAllRoundStateCB&gt;() {
         *     public void query(BuriAllRoundStateCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, BuriAllRoundState.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<BuriAllRoundStateCB, DocumentCQ> derivedBuriAllRoundStateList() {
            assertDerived("buriAllRoundStateList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<BuriAllRoundStateCB, DocumentCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<BuriAllRoundStateCB, DocumentCQ>() {
                public void setup(String function, SubQuery<BuriAllRoundStateCB> subQuery, DocumentCQ cq, String aliasName, DerivedReferrerOption option) {
                    cq.xsderiveBuriAllRoundStateList(function, subQuery, aliasName, option); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<DocumentCB, DocumentCQ> myselfDerived() {
            assertDerived("buriAllRoundStateList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<DocumentCB, DocumentCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<DocumentCB, DocumentCQ>() {
                public void setup(String function, SubQuery<DocumentCB> subQuery, DocumentCQ cq, String aliasName, DerivedReferrerOption option) {
                    cq.xsmyselfDerive(function, subQuery, aliasName, option); } }, _dbmetaProvider);
        }
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                         ColumnQuery
    //                                                                         ===========
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;DocumentCB&gt;() {
     *     public void query(DocumentCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;DocumentCB&gt;() {
     *     public void query(DocumentCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<DocumentCB> columnQuery(final SpecifyQuery<DocumentCB> leftSpecifyQuery) {
        return new HpColQyOperand<DocumentCB>(new HpColQyHandler<DocumentCB>() {
            public HpCalculator handle(SpecifyQuery<DocumentCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected DocumentCB xcreateColumnQueryCB() {
        DocumentCB cb = new DocumentCB();
        cb.xsetupForColumnQuery((DocumentCB)this);
        return cb;
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br />
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public DocumentCB dreamCruiseCB() {
        DocumentCB cb = new DocumentCB();
        cb.xsetupForDreamCruise((DocumentCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                        OrScopeQuery
    //                                                                        ============
    /**
     * Set up the query for or-scope. <br />
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;DocumentCB&gt;() {
     *     public void query(DocumentCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<DocumentCB> orQuery) {
        xorSQ((DocumentCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;DocumentCB&gt;() {
     *     public void query(DocumentCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;DocumentCB&gt;() {
     *             public void query(DocumentCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<DocumentCB> andQuery) {
        xorSQAP((DocumentCB)this, andQuery);
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getLogDateFormat() { return DBFluteConfig.getInstance().getLogDateFormat(); }
    @Override
    protected String getLogTimestampFormat() { return DBFluteConfig.getInstance().getLogTimestampFormat(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final DocumentCB cb;
        if (mainCB != null) {
            cb = (DocumentCB)mainCB;
        } else {
            cb = new DocumentCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<DocumentCQ>() {
            public boolean has() { return true; }
            public DocumentCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return DocumentCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return DocumentCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}

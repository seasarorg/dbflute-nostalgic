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
 * The base condition-bean of BURI_ALL_ROUND_STATE.
 * @author DBFlute(AutoGenerator)
 */
public class BsBuriAllRoundStateCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriAllRoundStateCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBuriAllRoundStateCB() {
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
        return "BURI_ALL_ROUND_STATE";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public ConditionBean addOrderBy_PK_Asc() {
        String msg = "The table has no primary-keys: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    public ConditionBean addOrderBy_PK_Desc() {
        String msg = "The table has no primary-keys: " + getTableDbName();
        throw new UnsupportedOperationException(msg);
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
    public BuriAllRoundStateCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public BuriAllRoundStateCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected BuriAllRoundStateCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected BuriAllRoundStateCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        BuriAllRoundStateCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected BuriAllRoundStateCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new BuriAllRoundStateCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;BuriAllRoundStateCB&gt;() {
     *     public void query(BuriAllRoundStateCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<BuriAllRoundStateCB> unionQuery) {
        final BuriAllRoundStateCB cb = new BuriAllRoundStateCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final BuriAllRoundStateCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;BuriAllRoundStateCB&gt;() {
     *     public void query(BuriAllRoundStateCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<BuriAllRoundStateCB> unionQuery) {
        final BuriAllRoundStateCB cb = new BuriAllRoundStateCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final BuriAllRoundStateCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected DocumentNss _nssDocument;
    public DocumentNss getNssDocument() {
        if (_nssDocument == null) { _nssDocument = new DocumentNss(null); }
        return _nssDocument;
    }
    /**
     * Set up relation columns to select clause. <br />
     * DOCUMENT by my INTERNAL_PK_VALUE, named 'document'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * BuriAllRoundStateCB cb = new BuriAllRoundStateCB();
     * cb.<span style="color: #FD4747">setupSelect_Document()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * BuriAllRoundState buriAllRoundState = buriAllRoundStateBhv.selectEntityWithDeletedCheck(cb);
     * ... = buriAllRoundState.<span style="color: #FD4747">getDocument()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public DocumentNss setupSelect_Document() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnInternalPkValue();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryDocument(); } });
        if (_nssDocument == null || !_nssDocument.hasConditionQuery())
        { _nssDocument = new DocumentNss(query().queryDocument()); }
        return _nssDocument;
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
            , new HpSpQyCall<BuriAllRoundStateCQ>() {
                public boolean has() { return true; }
                public BuriAllRoundStateCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<BuriAllRoundStateCQ> {
        protected DocumentCB.HpSpecification _document;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<BuriAllRoundStateCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * INTERNAL_STATE_ID: {NotNull, NUMBER(18)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnInternalStateId() { return doColumn("INTERNAL_STATE_ID"); }
        /**
         * STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnStatusUpdateDatetime() { return doColumn("STATUS_UPDATE_DATETIME"); }
        /**
         * PARTICIPANT_NAME: {VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnParticipantName() { return doColumn("PARTICIPANT_NAME"); }
        /**
         * PARTICIPANT_TYPE: {VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnParticipantType() { return doColumn("PARTICIPANT_TYPE"); }
        /**
         * INTERNAL_PATH_ID: {NotNull, NUMBER(18)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnInternalPathId() { return doColumn("INTERNAL_PATH_ID"); }
        /**
         * STATUS_PATH_NAME: {NotNull, VARCHAR2(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnStatusPathName() { return doColumn("STATUS_PATH_NAME"); }
        /**
         * INTERNAL_DATA_ID: {NotNull, NUMBER(18)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnInternalDataId() { return doColumn("INTERNAL_DATA_ID"); }
        /**
         * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnInternalPkValue() { return doColumn("INTERNAL_PK_VALUE"); }
        /**
         * INTERNAL_DATA_TYPE: {NotNull, VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnInternalDataType() { return doColumn("INTERNAL_DATA_TYPE"); }
        /**
         * INTERNAL_USER_ID: {NUMBER(18)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnInternalUserId() { return doColumn("INTERNAL_USER_ID"); }
        /**
         * STATUS_UPDATE_USER: {VARCHAR2(100)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnStatusUpdateUser() { return doColumn("STATUS_UPDATE_USER"); }
        @Override
        protected void doSpecifyRequiredColumn() {
            if (qyCall().qy().hasConditionQueryDocument()
                    || qyCall().qy().xgetReferrerQuery() instanceof DocumentCQ) {
                columnInternalPkValue(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "BURI_ALL_ROUND_STATE"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * DOCUMENT by my INTERNAL_PK_VALUE, named 'document'. <br />
         * This relation is auto-detected as implicit reverse FK.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public DocumentCB.HpSpecification specifyDocument() {
            assertRelation("document");
            if (_document == null) {
                _document = new DocumentCB.HpSpecification(_baseCB, new HpSpQyCall<DocumentCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryDocument(); }
                    public DocumentCQ qy() { return _qyCall.qy().queryDocument(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _document.xsetSyncQyCall(new HpSpQyCall<DocumentCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryDocument(); }
                        public DocumentCQ qy() { return xsyncQyCall().qy().queryDocument(); }
                    });
                }
            }
            return _document;
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;BuriAllRoundStateCB&gt;() {
     *     public void query(BuriAllRoundStateCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;BuriAllRoundStateCB&gt;() {
     *     public void query(BuriAllRoundStateCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<BuriAllRoundStateCB> columnQuery(final SpecifyQuery<BuriAllRoundStateCB> leftSpecifyQuery) {
        return new HpColQyOperand<BuriAllRoundStateCB>(new HpColQyHandler<BuriAllRoundStateCB>() {
            public HpCalculator handle(SpecifyQuery<BuriAllRoundStateCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected BuriAllRoundStateCB xcreateColumnQueryCB() {
        BuriAllRoundStateCB cb = new BuriAllRoundStateCB();
        cb.xsetupForColumnQuery((BuriAllRoundStateCB)this);
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
    public BuriAllRoundStateCB dreamCruiseCB() {
        BuriAllRoundStateCB cb = new BuriAllRoundStateCB();
        cb.xsetupForDreamCruise((BuriAllRoundStateCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;BuriAllRoundStateCB&gt;() {
     *     public void query(BuriAllRoundStateCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<BuriAllRoundStateCB> orQuery) {
        xorSQ((BuriAllRoundStateCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;BuriAllRoundStateCB&gt;() {
     *     public void query(BuriAllRoundStateCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;BuriAllRoundStateCB&gt;() {
     *             public void query(BuriAllRoundStateCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<BuriAllRoundStateCB> andQuery) {
        xorSQAP((BuriAllRoundStateCB)this, andQuery);
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
        final BuriAllRoundStateCB cb;
        if (mainCB != null) {
            cb = (BuriAllRoundStateCB)mainCB;
        } else {
            cb = new BuriAllRoundStateCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<BuriAllRoundStateCQ>() {
            public boolean has() { return true; }
            public BuriAllRoundStateCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return BuriAllRoundStateCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return BuriAllRoundStateCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}

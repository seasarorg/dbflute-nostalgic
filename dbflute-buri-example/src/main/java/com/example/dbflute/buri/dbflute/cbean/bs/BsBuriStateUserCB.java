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
 * The base condition-bean of BURISTATEUSER.
 * @author DBFlute(AutoGenerator)
 */
public class BsBuriStateUserCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriStateUserCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBuriStateUserCB() {
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
        return "BURISTATEUSER";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Long stateUserId) {
        assertObjectNotNull("stateUserId", stateUserId);
        BsBuriStateUserCB cb = this;
        cb.query().setStateUserId_Equal(stateUserId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_StateUserId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_StateUserId_Desc();
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
    public BuriStateUserCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public BuriStateUserCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected BuriStateUserCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected BuriStateUserCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        BuriStateUserCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected BuriStateUserCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new BuriStateUserCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriStateUserCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<BuriStateUserCB> unionQuery) {
        final BuriStateUserCB cb = new BuriStateUserCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final BuriStateUserCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriStateUserCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<BuriStateUserCB> unionQuery) {
        final BuriStateUserCB cb = new BuriStateUserCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final BuriStateUserCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected BuriStateNss _nssBuriState;
    public BuriStateNss getNssBuriState() {
        if (_nssBuriState == null) { _nssBuriState = new BuriStateNss(null); }
        return _nssBuriState;
    }
    /**
     * Set up relation columns to select clause. <br />
     * BURISTATE by my STATEID, named 'buriState'.
     * <pre>
     * BuriStateUserCB cb = new BuriStateUserCB();
     * cb.<span style="color: #FD4747">setupSelect_BuriState()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * BuriStateUser buriStateUser = buriStateUserBhv.selectEntityWithDeletedCheck(cb);
     * ... = buriStateUser.<span style="color: #FD4747">getBuriState()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BuriStateNss setupSelect_BuriState() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnStateId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryBuriState(); } });
        if (_nssBuriState == null || !_nssBuriState.hasConditionQuery())
        { _nssBuriState = new BuriStateNss(query().queryBuriState()); }
        return _nssBuriState;
    }
    protected BuriUserNss _nssBuriUser;
    public BuriUserNss getNssBuriUser() {
        if (_nssBuriUser == null) { _nssBuriUser = new BuriUserNss(null); }
        return _nssBuriUser;
    }
    /**
     * Set up relation columns to select clause. <br />
     * BURIUSER by my BURIUSERID, named 'buriUser'.
     * <pre>
     * BuriStateUserCB cb = new BuriStateUserCB();
     * cb.<span style="color: #FD4747">setupSelect_BuriUser()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * BuriStateUser buriStateUser = buriStateUserBhv.selectEntityWithDeletedCheck(cb);
     * ... = buriStateUser.<span style="color: #FD4747">getBuriUser()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BuriUserNss setupSelect_BuriUser() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnBuriUserId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryBuriUser(); } });
        if (_nssBuriUser == null || !_nssBuriUser.hasConditionQuery())
        { _nssBuriUser = new BuriUserNss(query().queryBuriUser()); }
        return _nssBuriUser;
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
            , new HpSpQyCall<BuriStateUserCQ>() {
                public boolean has() { return true; }
                public BuriStateUserCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<BuriStateUserCQ> {
        protected BuriStateCB.HpSpecification _buriState;
        protected BuriUserCB.HpSpecification _buriUser;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<BuriStateUserCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * STATEUSERID: {PK, NotNull, NUMBER(18)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnStateUserId() { return doColumn("STATEUSERID"); }
        /**
         * STATEID: {IX, NUMBER(18), FK to BURISTATE}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnStateId() { return doColumn("STATEID"); }
        /**
         * BURIUSERID: {IX, NUMBER(18), FK to BURIUSER}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnBuriUserId() { return doColumn("BURIUSERID"); }
        /**
         * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnInsertDate() { return doColumn("INSERTDATE"); }
        /**
         * DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnDeleteDate() { return doColumn("DELETEDATE"); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnStateUserId(); // PK
            if (qyCall().qy().hasConditionQueryBuriState()
                    || qyCall().qy().xgetReferrerQuery() instanceof BuriStateCQ) {
                columnStateId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBuriUser()
                    || qyCall().qy().xgetReferrerQuery() instanceof BuriUserCQ) {
                columnBuriUserId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "BURISTATEUSER"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * BURISTATE by my STATEID, named 'buriState'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BuriStateCB.HpSpecification specifyBuriState() {
            assertRelation("buriState");
            if (_buriState == null) {
                _buriState = new BuriStateCB.HpSpecification(_baseCB, new HpSpQyCall<BuriStateCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryBuriState(); }
                    public BuriStateCQ qy() { return _qyCall.qy().queryBuriState(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _buriState.xsetSyncQyCall(new HpSpQyCall<BuriStateCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBuriState(); }
                        public BuriStateCQ qy() { return xsyncQyCall().qy().queryBuriState(); }
                    });
                }
            }
            return _buriState;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * BURIUSER by my BURIUSERID, named 'buriUser'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BuriUserCB.HpSpecification specifyBuriUser() {
            assertRelation("buriUser");
            if (_buriUser == null) {
                _buriUser = new BuriUserCB.HpSpecification(_baseCB, new HpSpQyCall<BuriUserCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryBuriUser(); }
                    public BuriUserCQ qy() { return _qyCall.qy().queryBuriUser(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _buriUser.xsetSyncQyCall(new HpSpQyCall<BuriUserCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBuriUser(); }
                        public BuriUserCQ qy() { return xsyncQyCall().qy().queryBuriUser(); }
                    });
                }
            }
            return _buriUser;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<BuriStateUserCB, BuriStateUserCQ> myselfDerived() {
            assertDerived("buriUser"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<BuriStateUserCB, BuriStateUserCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<BuriStateUserCB, BuriStateUserCQ>() {
                public void setup(String function, SubQuery<BuriStateUserCB> subQuery, BuriStateUserCQ cq, String aliasName, DerivedReferrerOption option) {
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriStateUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriStateUserCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<BuriStateUserCB> columnQuery(final SpecifyQuery<BuriStateUserCB> leftSpecifyQuery) {
        return new HpColQyOperand<BuriStateUserCB>(new HpColQyHandler<BuriStateUserCB>() {
            public HpCalculator handle(SpecifyQuery<BuriStateUserCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected BuriStateUserCB xcreateColumnQueryCB() {
        BuriStateUserCB cb = new BuriStateUserCB();
        cb.xsetupForColumnQuery((BuriStateUserCB)this);
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
    public BuriStateUserCB dreamCruiseCB() {
        BuriStateUserCB cb = new BuriStateUserCB();
        cb.xsetupForDreamCruise((BuriStateUserCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriStateUserCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<BuriStateUserCB> orQuery) {
        xorSQ((BuriStateUserCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriStateUserCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;BuriStateUserCB&gt;() {
     *             public void query(BuriStateUserCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<BuriStateUserCB> andQuery) {
        xorSQAP((BuriStateUserCB)this, andQuery);
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
        final BuriStateUserCB cb;
        if (mainCB != null) {
            cb = (BuriStateUserCB)mainCB;
        } else {
            cb = new BuriStateUserCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<BuriStateUserCQ>() {
            public boolean has() { return true; }
            public BuriStateUserCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return BuriStateUserCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return BuriStateUserCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}

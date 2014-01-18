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
 * The base condition-bean of BURISTATE.
 * @author DBFlute(AutoGenerator)
 */
public class BsBuriStateCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BuriStateCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsBuriStateCB() {
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
        return "BURISTATE";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Long stateId) {
        assertObjectNotNull("stateId", stateId);
        BsBuriStateCB cb = this;
        cb.query().setStateId_Equal(stateId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_StateId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_StateId_Desc();
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
    public BuriStateCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public BuriStateCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected BuriStateCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected BuriStateCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        BuriStateCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected BuriStateCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new BuriStateCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriStateCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<BuriStateCB> unionQuery) {
        final BuriStateCB cb = new BuriStateCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final BuriStateCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriStateCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<BuriStateCB> unionQuery) {
        final BuriStateCB cb = new BuriStateCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final BuriStateCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected BuriPathNss _nssBuriPath;
    public BuriPathNss getNssBuriPath() {
        if (_nssBuriPath == null) { _nssBuriPath = new BuriPathNss(null); }
        return _nssBuriPath;
    }
    /**
     * Set up relation columns to select clause. <br />
     * BURIPATH by my PATHID, named 'buriPath'.
     * <pre>
     * BuriStateCB cb = new BuriStateCB();
     * cb.<span style="color: #FD4747">setupSelect_BuriPath()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * BuriState buriState = buriStateBhv.selectEntityWithDeletedCheck(cb);
     * ... = buriState.<span style="color: #FD4747">getBuriPath()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BuriPathNss setupSelect_BuriPath() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnPathId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryBuriPath(); } });
        if (_nssBuriPath == null || !_nssBuriPath.hasConditionQuery())
        { _nssBuriPath = new BuriPathNss(query().queryBuriPath()); }
        return _nssBuriPath;
    }
    protected BuriDataNss _nssBuriData;
    public BuriDataNss getNssBuriData() {
        if (_nssBuriData == null) { _nssBuriData = new BuriDataNss(null); }
        return _nssBuriData;
    }
    /**
     * Set up relation columns to select clause. <br />
     * BURIDATA by my DATAID, named 'buriData'.
     * <pre>
     * BuriStateCB cb = new BuriStateCB();
     * cb.<span style="color: #FD4747">setupSelect_BuriData()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * BuriState buriState = buriStateBhv.selectEntityWithDeletedCheck(cb);
     * ... = buriState.<span style="color: #FD4747">getBuriData()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BuriDataNss setupSelect_BuriData() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnDataId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryBuriData(); } });
        if (_nssBuriData == null || !_nssBuriData.hasConditionQuery())
        { _nssBuriData = new BuriDataNss(query().queryBuriData()); }
        return _nssBuriData;
    }
    protected BuriBranchNss _nssBuriBranch;
    public BuriBranchNss getNssBuriBranch() {
        if (_nssBuriBranch == null) { _nssBuriBranch = new BuriBranchNss(null); }
        return _nssBuriBranch;
    }
    /**
     * Set up relation columns to select clause. <br />
     * BURIBRANCH by my BRANCHID, named 'buriBranch'.
     * <pre>
     * BuriStateCB cb = new BuriStateCB();
     * cb.<span style="color: #FD4747">setupSelect_BuriBranch()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * BuriState buriState = buriStateBhv.selectEntityWithDeletedCheck(cb);
     * ... = buriState.<span style="color: #FD4747">getBuriBranch()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BuriBranchNss setupSelect_BuriBranch() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnBranchId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryBuriBranch(); } });
        if (_nssBuriBranch == null || !_nssBuriBranch.hasConditionQuery())
        { _nssBuriBranch = new BuriBranchNss(query().queryBuriBranch()); }
        return _nssBuriBranch;
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
            , new HpSpQyCall<BuriStateCQ>() {
                public boolean has() { return true; }
                public BuriStateCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<BuriStateCQ> {
        protected BuriPathCB.HpSpecification _buriPath;
        protected BuriDataCB.HpSpecification _buriData;
        protected BuriBranchCB.HpSpecification _buriBranch;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<BuriStateCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * STATEID: {PK, NotNull, NUMBER(18)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnStateId() { return doColumn("STATEID"); }
        /**
         * PATHID: {IX, NUMBER(18), FK to BURIPATH}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnPathId() { return doColumn("PATHID"); }
        /**
         * DATAID: {IX, NUMBER(18), FK to BURIDATA}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnDataId() { return doColumn("DATAID"); }
        /**
         * BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnBranchId() { return doColumn("BRANCHID"); }
        /**
         * USERIDVAL: {VARCHAR2(20)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUserIdVal() { return doColumn("USERIDVAL"); }
        /**
         * USERIDNUM: {NUMBER(18)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUserIdNum() { return doColumn("USERIDNUM"); }
        /**
         * PARTICIPANTNAME: {VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnParticipantName() { return doColumn("PARTICIPANTNAME"); }
        /**
         * PARTICIPANTTYPE: {VARCHAR2(200)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnParticipantType() { return doColumn("PARTICIPANTTYPE"); }
        /**
         * BTID: {NotNull, NUMBER(18)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnBtid() { return doColumn("BTID"); }
        /**
         * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnInsertDate() { return doColumn("INSERTDATE"); }
        /**
         * AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnAutoRunTime() { return doColumn("AUTORUNTIME"); }
        /**
         * PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnProcessDate() { return doColumn("PROCESSDATE"); }
        /**
         * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnAbortDate() { return doColumn("ABORTDATE"); }
        /**
         * VERSIONNO: {NotNull, NUMBER(22)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnVersionNo() { return doColumn("VERSIONNO"); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnStateId(); // PK
            if (qyCall().qy().hasConditionQueryBuriPath()
                    || qyCall().qy().xgetReferrerQuery() instanceof BuriPathCQ) {
                columnPathId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBuriData()
                    || qyCall().qy().xgetReferrerQuery() instanceof BuriDataCQ) {
                columnDataId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBuriBranch()
                    || qyCall().qy().xgetReferrerQuery() instanceof BuriBranchCQ) {
                columnBranchId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "BURISTATE"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * BURIPATH by my PATHID, named 'buriPath'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BuriPathCB.HpSpecification specifyBuriPath() {
            assertRelation("buriPath");
            if (_buriPath == null) {
                _buriPath = new BuriPathCB.HpSpecification(_baseCB, new HpSpQyCall<BuriPathCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryBuriPath(); }
                    public BuriPathCQ qy() { return _qyCall.qy().queryBuriPath(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _buriPath.xsetSyncQyCall(new HpSpQyCall<BuriPathCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBuriPath(); }
                        public BuriPathCQ qy() { return xsyncQyCall().qy().queryBuriPath(); }
                    });
                }
            }
            return _buriPath;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * BURIDATA by my DATAID, named 'buriData'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BuriDataCB.HpSpecification specifyBuriData() {
            assertRelation("buriData");
            if (_buriData == null) {
                _buriData = new BuriDataCB.HpSpecification(_baseCB, new HpSpQyCall<BuriDataCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryBuriData(); }
                    public BuriDataCQ qy() { return _qyCall.qy().queryBuriData(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _buriData.xsetSyncQyCall(new HpSpQyCall<BuriDataCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBuriData(); }
                        public BuriDataCQ qy() { return xsyncQyCall().qy().queryBuriData(); }
                    });
                }
            }
            return _buriData;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * BURIBRANCH by my BRANCHID, named 'buriBranch'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BuriBranchCB.HpSpecification specifyBuriBranch() {
            assertRelation("buriBranch");
            if (_buriBranch == null) {
                _buriBranch = new BuriBranchCB.HpSpecification(_baseCB, new HpSpQyCall<BuriBranchCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryBuriBranch(); }
                    public BuriBranchCQ qy() { return _qyCall.qy().queryBuriBranch(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _buriBranch.xsetSyncQyCall(new HpSpQyCall<BuriBranchCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBuriBranch(); }
                        public BuriBranchCQ qy() { return xsyncQyCall().qy().queryBuriBranch(); }
                    });
                }
            }
            return _buriBranch;
        }
        /**
         * Prepare for (Specify)DerivedReferrer. <br />
         * {select max(FOO) from BURISTATEUSER where ...) as FOO_MAX} <br />
         * BURISTATEUSER by your STATEID, named 'buriStateUserList'.
         * <pre>
         * cb.specify().<span style="color: #FD4747">derivedBuriStateUserList()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;BuriStateUserCB&gt;() {
         *     public void query(BuriStateUserCB subCB) {
         *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
         *     }
         * }, BuriStateUser.<span style="color: #FD4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<BuriStateUserCB, BuriStateCQ> derivedBuriStateUserList() {
            assertDerived("buriStateUserList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<BuriStateUserCB, BuriStateCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<BuriStateUserCB, BuriStateCQ>() {
                public void setup(String function, SubQuery<BuriStateUserCB> subQuery, BuriStateCQ cq, String aliasName, DerivedReferrerOption option) {
                    cq.xsderiveBuriStateUserList(function, subQuery, aliasName, option); } }, _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<BuriStateCB, BuriStateCQ> myselfDerived() {
            assertDerived("buriStateUserList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<BuriStateCB, BuriStateCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<BuriStateCB, BuriStateCQ>() {
                public void setup(String function, SubQuery<BuriStateCB> subQuery, BuriStateCQ cq, String aliasName, DerivedReferrerOption option) {
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriStateCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriStateCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<BuriStateCB> columnQuery(final SpecifyQuery<BuriStateCB> leftSpecifyQuery) {
        return new HpColQyOperand<BuriStateCB>(new HpColQyHandler<BuriStateCB>() {
            public HpCalculator handle(SpecifyQuery<BuriStateCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected BuriStateCB xcreateColumnQueryCB() {
        BuriStateCB cb = new BuriStateCB();
        cb.xsetupForColumnQuery((BuriStateCB)this);
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
    public BuriStateCB dreamCruiseCB() {
        BuriStateCB cb = new BuriStateCB();
        cb.xsetupForDreamCruise((BuriStateCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriStateCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<BuriStateCB> orQuery) {
        xorSQ((BuriStateCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriStateCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;BuriStateCB&gt;() {
     *             public void query(BuriStateCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<BuriStateCB> andQuery) {
        xorSQAP((BuriStateCB)this, andQuery);
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
        final BuriStateCB cb;
        if (mainCB != null) {
            cb = (BuriStateCB)mainCB;
        } else {
            cb = new BuriStateCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<BuriStateCQ>() {
            public boolean has() { return true; }
            public BuriStateCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return BuriStateCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return BuriStateCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}

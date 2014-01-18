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
 * The base condition-bean of MST_USER_ROLE.
 * @author DBFlute(AutoGenerator)
 */
public class BsMstUserRoleCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MstUserRoleCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMstUserRoleCB() {
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
        return "MST_USER_ROLE";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    public void acceptPrimaryKey(Integer userRoleId) {
        assertObjectNotNull("userRoleId", userRoleId);
        BsMstUserRoleCB cb = this;
        cb.query().setUserRoleId_Equal(userRoleId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_UserRoleId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_UserRoleId_Desc();
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
    public MstUserRoleCQ query() {
        assertQueryPurpose(); // assert only when user-public query 
        return getConditionQuery();
    }

    public MstUserRoleCQ getConditionQuery() { // public for parameter comment and internal
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MstUserRoleCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MstUserRoleCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MstUserRoleCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MstUserRoleCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MstUserRoleCQ(childQuery, sqlClause, aliasName, nestLevel);
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
     * cb.query().<span style="color: #FD4747">union</span>(new UnionQuery&lt;MstUserRoleCB&gt;() {
     *     public void query(MstUserRoleCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<MstUserRoleCB> unionQuery) {
        final MstUserRoleCB cb = new MstUserRoleCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final MstUserRoleCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br />
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #FD4747">unionAll</span>(new UnionQuery&lt;MstUserRoleCB&gt;() {
     *     public void query(MstUserRoleCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<MstUserRoleCB> unionQuery) {
        final MstUserRoleCB cb = new MstUserRoleCB();
        cb.xsetupForUnion(this); xsyncUQ(cb); unionQuery.query(cb); xsaveUCB(cb);
        final MstUserRoleCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MstRoleNss _nssMstRole;
    public MstRoleNss getNssMstRole() {
        if (_nssMstRole == null) { _nssMstRole = new MstRoleNss(null); }
        return _nssMstRole;
    }
    /**
     * Set up relation columns to select clause. <br />
     * MST_ROLE by my ROLE_ID, named 'mstRole'.
     * <pre>
     * MstUserRoleCB cb = new MstUserRoleCB();
     * cb.<span style="color: #FD4747">setupSelect_MstRole()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * MstUserRole mstUserRole = mstUserRoleBhv.selectEntityWithDeletedCheck(cb);
     * ... = mstUserRole.<span style="color: #FD4747">getMstRole()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MstRoleNss setupSelect_MstRole() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnRoleId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMstRole(); } });
        if (_nssMstRole == null || !_nssMstRole.hasConditionQuery())
        { _nssMstRole = new MstRoleNss(query().queryMstRole()); }
        return _nssMstRole;
    }
    protected MstUserNss _nssMstUser;
    public MstUserNss getNssMstUser() {
        if (_nssMstUser == null) { _nssMstUser = new MstUserNss(null); }
        return _nssMstUser;
    }
    /**
     * Set up relation columns to select clause. <br />
     * MST_USER by my USER_ID, named 'mstUser'.
     * <pre>
     * MstUserRoleCB cb = new MstUserRoleCB();
     * cb.<span style="color: #FD4747">setupSelect_MstUser()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     * cb.query().setFoo...(value);
     * MstUserRole mstUserRole = mstUserRoleBhv.selectEntityWithDeletedCheck(cb);
     * ... = mstUserRole.<span style="color: #FD4747">getMstUser()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MstUserNss setupSelect_MstUser() {
        if (hasSpecifiedColumn()) { // if reverse call
            specify().columnUserId();
        }
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryMstUser(); } });
        if (_nssMstUser == null || !_nssMstUser.hasConditionQuery())
        { _nssMstUser = new MstUserNss(query().queryMstUser()); }
        return _nssMstUser;
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
            , new HpSpQyCall<MstUserRoleCQ>() {
                public boolean has() { return true; }
                public MstUserRoleCQ qy() { return getConditionQuery(); }
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

    public static class HpSpecification extends HpAbstractSpecification<MstUserRoleCQ> {
        protected MstRoleCB.HpSpecification _mstRole;
        protected MstUserCB.HpSpecification _mstUser;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MstUserRoleCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, purpose, dbmetaProvider); }
        /**
         * USER_ROLE_ID: {PK, NotNull, NUMBER(9)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUserRoleId() { return doColumn("USER_ROLE_ID"); }
        /**
         * USER_ID: {NotNull, NUMBER(9), FK to MST_USER}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUserId() { return doColumn("USER_ID"); }
        /**
         * ROLE_ID: {NotNull, NUMBER(9), FK to MST_ROLE}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRoleId() { return doColumn("ROLE_ID"); }
        /**
         * REGISTER_USER: {NotNull, VARCHAR2(20)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegisterUser() { return doColumn("REGISTER_USER"); }
        /**
         * REGISTER_DATETIME: {NotNull, DATE(7)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnRegisterDatetime() { return doColumn("REGISTER_DATETIME"); }
        /**
         * UPDATE_USER: {NotNull, VARCHAR2(20)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUpdateUser() { return doColumn("UPDATE_USER"); }
        /**
         * UPDATE_DATETIME: {NotNull, DATE(7)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnUpdateDatetime() { return doColumn("UPDATE_DATETIME"); }
        /**
         * VERSION_NO: {NotNull, NUMBER(8)}
         * @return The information object of specified column. (NotNull)
         */
        public HpSpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnUserRoleId(); // PK
            if (qyCall().qy().hasConditionQueryMstRole()
                    || qyCall().qy().xgetReferrerQuery() instanceof MstRoleCQ) {
                columnRoleId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMstUser()
                    || qyCall().qy().xgetReferrerQuery() instanceof MstUserCQ) {
                columnUserId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "MST_USER_ROLE"; }
        /**
         * Prepare to specify functions about relation table. <br />
         * MST_ROLE by my ROLE_ID, named 'mstRole'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MstRoleCB.HpSpecification specifyMstRole() {
            assertRelation("mstRole");
            if (_mstRole == null) {
                _mstRole = new MstRoleCB.HpSpecification(_baseCB, new HpSpQyCall<MstRoleCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMstRole(); }
                    public MstRoleCQ qy() { return _qyCall.qy().queryMstRole(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _mstRole.xsetSyncQyCall(new HpSpQyCall<MstRoleCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMstRole(); }
                        public MstRoleCQ qy() { return xsyncQyCall().qy().queryMstRole(); }
                    });
                }
            }
            return _mstRole;
        }
        /**
         * Prepare to specify functions about relation table. <br />
         * MST_USER by my USER_ID, named 'mstUser'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MstUserCB.HpSpecification specifyMstUser() {
            assertRelation("mstUser");
            if (_mstUser == null) {
                _mstUser = new MstUserCB.HpSpecification(_baseCB, new HpSpQyCall<MstUserCQ>() {
                    public boolean has() { return _qyCall.has() && _qyCall.qy().hasConditionQueryMstUser(); }
                    public MstUserCQ qy() { return _qyCall.qy().queryMstUser(); } }
                    , _purpose, _dbmetaProvider);
                if (xhasSyncQyCall()) { // inherits it
                    _mstUser.xsetSyncQyCall(new HpSpQyCall<MstUserCQ>() {
                        public boolean has() { return xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMstUser(); }
                        public MstUserCQ qy() { return xsyncQyCall().qy().queryMstUser(); }
                    });
                }
            }
            return _mstUser;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MstUserRoleCB, MstUserRoleCQ> myselfDerived() {
            assertDerived("mstUser"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return new HpSDRFunction<MstUserRoleCB, MstUserRoleCQ>(_baseCB, _qyCall.qy(), new HpSDRSetupper<MstUserRoleCB, MstUserRoleCQ>() {
                public void setup(String function, SubQuery<MstUserRoleCB> subQuery, MstUserRoleCQ cq, String aliasName, DerivedReferrerOption option) {
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
     * cb.<span style="color: #FD4747">columnQuery</span>(new SpecifyQuery&lt;MstUserRoleCB&gt;() {
     *     public void query(MstUserRoleCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     *     }
     * }).lessThan(new SpecifyQuery&lt;MstUserRoleCB&gt;() {
     *     public void query(MstUserRoleCB cb) {
     *         cb.specify().<span style="color: #FD4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     *     }
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param leftSpecifyQuery The specify-query for left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<MstUserRoleCB> columnQuery(final SpecifyQuery<MstUserRoleCB> leftSpecifyQuery) {
        return new HpColQyOperand<MstUserRoleCB>(new HpColQyHandler<MstUserRoleCB>() {
            public HpCalculator handle(SpecifyQuery<MstUserRoleCB> rightSp, String operand) {
                return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), leftSpecifyQuery, rightSp, operand);
            }
        });
    }

    protected MstUserRoleCB xcreateColumnQueryCB() {
        MstUserRoleCB cb = new MstUserRoleCB();
        cb.xsetupForColumnQuery((MstUserRoleCB)this);
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
    public MstUserRoleCB dreamCruiseCB() {
        MstUserRoleCB cb = new MstUserRoleCB();
        cb.xsetupForDreamCruise((MstUserRoleCB) this);
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
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;MstUserRoleCB&gt;() {
     *     public void query(MstUserRoleCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.query().setBAR_Equal...
     *     }
     * });
     * </pre>
     * @param orQuery The query for or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<MstUserRoleCB> orQuery) {
        xorSQ((MstUserRoleCB)this, orQuery);
    }

    /**
     * Set up the and-part of or-scope. <br />
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #FD4747">orScopeQuery</span>(new OrQuery&lt;MstUserRoleCB&gt;() {
     *     public void query(MstUserRoleCB orCB) {
     *         orCB.query().setFOO_Equal...
     *         orCB.<span style="color: #FD4747">orScopeQueryAndPart</span>(new AndQuery&lt;MstUserRoleCB&gt;() {
     *             public void query(MstUserRoleCB andCB) {
     *                 andCB.query().setBar_...
     *                 andCB.query().setQux_...
     *             }
     *         });
     *     }
     * });
     * </pre>
     * @param andQuery The query for and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<MstUserRoleCB> andQuery) {
        xorSQAP((MstUserRoleCB)this, andQuery);
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
        final MstUserRoleCB cb;
        if (mainCB != null) {
            cb = (MstUserRoleCB)mainCB;
        } else {
            cb = new MstUserRoleCB();
        }
        specify().xsetSyncQyCall(new HpSpQyCall<MstUserRoleCQ>() {
            public boolean has() { return true; }
            public MstUserRoleCQ qy() { return cb.query(); }
        });
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return MstUserRoleCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return MstUserRoleCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String getConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}

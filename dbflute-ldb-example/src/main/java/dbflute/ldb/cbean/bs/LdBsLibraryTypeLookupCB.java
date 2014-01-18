/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.cbean.bs;

import java.util.Map;

import dbflute.ldb.allcommon.LdDBFluteConfig;
import dbflute.ldb.allcommon.LdImplementedSqlClauseCreator;
import dbflute.ldb.allcommon.cbean.LdAbstractConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionQuery;
import dbflute.ldb.allcommon.cbean.LdSubQuery;
import dbflute.ldb.allcommon.cbean.LdUnionQuery;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaProvider;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClause;
import dbflute.ldb.cbean.*;
import dbflute.ldb.cbean.cq.*;

/**
 * The base condition-bean of LIBRARY_TYPE_LOOKUP.
 * @author DBFlute(AutoGenerator)
 */
public class LdBsLibraryTypeLookupCB extends LdAbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final LdDBMetaProvider _dbmetaProvider = new LdDBMetaInstanceHandler();
    protected LdLibraryTypeLookupCQ _conditionQuery;

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected LdSqlClause createSqlClause() {
        return new LdImplementedSqlClauseCreator().createSqlClause(this);
    }
    
    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected LdDBMetaProvider getDBMetaProvider() {
        return _dbmetaProvider;
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "LIBRARY_TYPE_LOOKUP";
    }

    public String getTableSqlName() {
        return "LIBRARY_TYPE_LOOKUP";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        assertPrimaryKeyMap(primaryKeyMap);
        {
            Object obj = primaryKeyMap.get("LIBRARY_TYPE_CODE");
            if (obj instanceof String) {
                query().setLibraryTypeCode_Equal((String)obj);
            } else {
                checkTypeString(obj, "libraryTypeCode", "String");
                query().setLibraryTypeCode_Equal((String)obj);
            }
        }

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public LdConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_LibraryTypeCode_Asc();
        return this;
    }

    public LdConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_LibraryTypeCode_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public LdLibraryTypeLookupCQ query() {
        return getConditionQuery();
    }

    public LdLibraryTypeLookupCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new LdLibraryTypeLookupCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
        }
        return _conditionQuery;
    }

    /**
     * {@inheritDoc}
     * @return The conditionQuery of the local table as interface. (NotNull)
     */
    public LdConditionQuery localCQ() {
        return getConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union'.
     * <pre>
     * cb.query().union(new LdUnionQuery&lt;LdLibraryTypeLookupCB&gt;() {
     *     public void query(LdLibraryTypeLookupCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(LdUnionQuery<LdLibraryTypeLookupCB> unionQuery) {
        final LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdLibraryTypeLookupCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new LdUnionQuery&lt;LdLibraryTypeLookupCB&gt;() {
     *     public void query(LdLibraryTypeLookupCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(LdUnionQuery<LdLibraryTypeLookupCB> unionQuery) {
        final LdLibraryTypeLookupCB cb = new LdLibraryTypeLookupCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final LdLibraryTypeLookupCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<LdLibraryTypeLookupCQ>() {
            public boolean has() { return true; } public LdLibraryTypeLookupCQ qy() { return query(); } }, _forDerivedReferrer, _forScalarSelect, _forScalarSubQuery, getDBMetaProvider()); }
        return _specification;
    }

    public static class Specification extends AbstractSpecification<LdLibraryTypeLookupCQ> {
        protected SpQyCall<LdLibraryTypeLookupCQ> _myQyCall;
        public Specification(LdConditionBean baseCB, SpQyCall<LdLibraryTypeLookupCQ> qyCall
                           , boolean forDeriveReferrer, boolean forScalarSelect, boolean forScalarSubQuery
                           , LdDBMetaProvider dbmetaProvider)
        { super(baseCB, qyCall, forDeriveReferrer, forScalarSelect, forScalarSubQuery, dbmetaProvider); _myQyCall = qyCall; }
        public void columnLibraryTypeCode() { doColumn("LIBRARY_TYPE_CODE"); }
        public void columnLibraryTypeName() { doColumn("LIBRARY_TYPE_NAME"); }
        public void columnRUser() { doColumn("R_USER"); }
        public void columnRModule() { doColumn("R_MODULE"); }
        public void columnRTimestamp() { doColumn("R_TIMESTAMP"); }
        public void columnUUser() { doColumn("U_USER"); }
        public void columnUModule() { doColumn("U_MODULE"); }
        public void columnUTimestamp() { doColumn("U_TIMESTAMP"); }
        protected void doSpecifyRequiredColumn() {
            columnLibraryTypeCode();// PK
        }
        protected String getTableDbName() { return "LIBRARY_TYPE_LOOKUP"; }
        public RAFunction<LdLibraryCB, LdLibraryTypeLookupCQ> derivedLibraryList() {
            return new RAFunction<LdLibraryCB, LdLibraryTypeLookupCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<LdLibraryCB, LdLibraryTypeLookupCQ>() {
                public void setup(String function, LdSubQuery<LdLibraryCB> subQuery, LdLibraryTypeLookupCQ cq, String aliasName) {
                    cq.xsderiveLibraryList(function, subQuery, aliasName); } }, _dbmetaProvider);
        }
    }

    // ===================================================================================
    //                                                                         Display SQL
    //                                                                         ===========
    @Override
    protected String getLogDateFormat() { return LdDBFluteConfig.getInstance().getLogDateFormat(); }
    @Override
    protected String getLogTimestampFormat() { return LdDBFluteConfig.getInstance().getLogTimestampFormat(); }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return LdLibraryTypeLookupCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return LdLibraryTypeLookupCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return LdSubQuery.class.getName(); }
}

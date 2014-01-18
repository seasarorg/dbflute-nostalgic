package com.example.dbflute.buri.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.buri.dbflute.allcommon.*;
import com.example.dbflute.buri.dbflute.cbean.*;
import com.example.dbflute.buri.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of BURISTATE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBuriStateCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBuriStateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "BURISTATE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {PK, NotNull, NUMBER(18)}
     * @param stateId The value of stateId as equal.
     */
    public void setStateId_Equal(Long stateId) {
        doSetStateId_Equal(stateId);
    }

    protected void doSetStateId_Equal(Long stateId) {
        regStateId(CK_EQ, stateId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {PK, NotNull, NUMBER(18)}
     * @param stateId The value of stateId as greaterThan.
     */
    public void setStateId_GreaterThan(Long stateId) {
        regStateId(CK_GT, stateId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {PK, NotNull, NUMBER(18)}
     * @param stateId The value of stateId as lessThan.
     */
    public void setStateId_LessThan(Long stateId) {
        regStateId(CK_LT, stateId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {PK, NotNull, NUMBER(18)}
     * @param stateId The value of stateId as greaterEqual.
     */
    public void setStateId_GreaterEqual(Long stateId) {
        regStateId(CK_GE, stateId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {PK, NotNull, NUMBER(18)}
     * @param stateId The value of stateId as lessEqual.
     */
    public void setStateId_LessEqual(Long stateId) {
        regStateId(CK_LE, stateId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {PK, NotNull, NUMBER(18)}
     * @param minNumber The min number of stateId. (NullAllowed)
     * @param maxNumber The max number of stateId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStateId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueStateId(), "STATEID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * STATEID: {PK, NotNull, NUMBER(18)}
     * @param stateIdList The collection of stateId as inScope.
     */
    public void setStateId_InScope(Collection<Long> stateIdList) {
        doSetStateId_InScope(stateIdList);
    }

    protected void doSetStateId_InScope(Collection<Long> stateIdList) {
        regINS(CK_INS, cTL(stateIdList), getCValueStateId(), "STATEID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * STATEID: {PK, NotNull, NUMBER(18)}
     * @param stateIdList The collection of stateId as notInScope.
     */
    public void setStateId_NotInScope(Collection<Long> stateIdList) {
        doSetStateId_NotInScope(stateIdList);
    }

    protected void doSetStateId_NotInScope(Collection<Long> stateIdList) {
        regINS(CK_NINS, cTL(stateIdList), getCValueStateId(), "STATEID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select STATEID from BURISTATEUSER where ...)} <br />
     * BURISTATEUSER by your STATEID, named 'buriStateUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsBuriStateUserList</span>(new SubQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriStateCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BuriStateUserList for 'exists'. (NotNull)
     */
    public void existsBuriStateUserList(SubQuery<BuriStateUserCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStateId_ExistsReferrer_BuriStateUserList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "STATEID", "STATEID", subQueryPropertyName, "buriStateUserList");
    }
    public abstract String keepStateId_ExistsReferrer_BuriStateUserList(BuriStateUserCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select STATEID from BURISTATEUSER where ...)} <br />
     * BURISTATEUSER by your STATEID, named 'buriStateUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsBuriStateUserList</span>(new SubQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriStateCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of StateId_NotExistsReferrer_BuriStateUserList for 'not exists'. (NotNull)
     */
    public void notExistsBuriStateUserList(SubQuery<BuriStateUserCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStateId_NotExistsReferrer_BuriStateUserList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "STATEID", "STATEID", subQueryPropertyName, "buriStateUserList");
    }
    public abstract String keepStateId_NotExistsReferrer_BuriStateUserList(BuriStateUserCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STATEID from BURISTATEUSER where ...)} <br />
     * BURISTATEUSER by your STATEID, named 'buriStateUserAsOne'.
     * @param subQuery The sub-query of BuriStateUserList for 'in-scope'. (NotNull)
     */
    public void inScopeBuriStateUserList(SubQuery<BuriStateUserCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepStateId_InScopeRelation_BuriStateUserList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "STATEID", "STATEID", subQueryPropertyName, "buriStateUserList");
    }
    public abstract String keepStateId_InScopeRelation_BuriStateUserList(BuriStateUserCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STATEID from BURISTATEUSER where ...)} <br />
     * BURISTATEUSER by your STATEID, named 'buriStateUserAsOne'.
     * @param subQuery The sub-query of BuriStateUserList for 'not in-scope'. (NotNull)
     */
    public void notInScopeBuriStateUserList(SubQuery<BuriStateUserCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepStateId_NotInScopeRelation_BuriStateUserList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "STATEID", "STATEID", subQueryPropertyName, "buriStateUserList");
    }
    public abstract String keepStateId_NotInScopeRelation_BuriStateUserList(BuriStateUserCQ subQuery);

    public void xsderiveBuriStateUserList(String function, SubQuery<BuriStateUserCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStateId_SpecifyDerivedReferrer_BuriStateUserList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "STATEID", "STATEID", subQueryPropertyName, "buriStateUserList", aliasName, option);
    }
    public abstract String keepStateId_SpecifyDerivedReferrer_BuriStateUserList(BuriStateUserCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from BURISTATEUSER where ...)} <br />
     * BURISTATEUSER by your STATEID, named 'buriStateUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">derived${tmpPropertyNameInitCap}()</span>.<span style="color: #FD4747">max</span>(new SubQuery&lt;${tmpCBClassName}&gt;() {
     *     public void query(${tmpCBClassName} subCB) {
     *         subCB.specify().<span style="color: #FD4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *         subCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     *     }
     * }).<span style="color: #FD4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BuriStateUserCB> derivedBuriStateUserList() {
        return xcreateQDRFunctionBuriStateUserList();
    }
    protected HpQDRFunction<BuriStateUserCB> xcreateQDRFunctionBuriStateUserList() {
        return new HpQDRFunction<BuriStateUserCB>(new HpQDRSetupper<BuriStateUserCB>() {
            public void setup(String function, SubQuery<BuriStateUserCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveBuriStateUserList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveBuriStateUserList(String function, SubQuery<BuriStateUserCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepStateId_QueryDerivedReferrer_BuriStateUserList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepStateId_QueryDerivedReferrer_BuriStateUserListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "STATEID", "STATEID", subQueryPropertyName, "buriStateUserList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepStateId_QueryDerivedReferrer_BuriStateUserList(BuriStateUserCQ subQuery);
    public abstract String keepStateId_QueryDerivedReferrer_BuriStateUserListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * STATEID: {PK, NotNull, NUMBER(18)}
     */
    public void setStateId_IsNull() { regStateId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * STATEID: {PK, NotNull, NUMBER(18)}
     */
    public void setStateId_IsNotNull() { regStateId(CK_ISNN, DOBJ); }

    protected void regStateId(ConditionKey k, Object v) { regQ(k, v, getCValueStateId(), "STATEID"); }
    abstract protected ConditionValue getCValueStateId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18), FK to BURIPATH}
     * @param pathId The value of pathId as equal.
     */
    public void setPathId_Equal(Long pathId) {
        doSetPathId_Equal(pathId);
    }

    protected void doSetPathId_Equal(Long pathId) {
        regPathId(CK_EQ, pathId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18), FK to BURIPATH}
     * @param pathId The value of pathId as greaterThan.
     */
    public void setPathId_GreaterThan(Long pathId) {
        regPathId(CK_GT, pathId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18), FK to BURIPATH}
     * @param pathId The value of pathId as lessThan.
     */
    public void setPathId_LessThan(Long pathId) {
        regPathId(CK_LT, pathId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18), FK to BURIPATH}
     * @param pathId The value of pathId as greaterEqual.
     */
    public void setPathId_GreaterEqual(Long pathId) {
        regPathId(CK_GE, pathId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18), FK to BURIPATH}
     * @param pathId The value of pathId as lessEqual.
     */
    public void setPathId_LessEqual(Long pathId) {
        regPathId(CK_LE, pathId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18), FK to BURIPATH}
     * @param minNumber The min number of pathId. (NullAllowed)
     * @param maxNumber The max number of pathId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPathId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePathId(), "PATHID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PATHID: {IX, NUMBER(18), FK to BURIPATH}
     * @param pathIdList The collection of pathId as inScope.
     */
    public void setPathId_InScope(Collection<Long> pathIdList) {
        doSetPathId_InScope(pathIdList);
    }

    protected void doSetPathId_InScope(Collection<Long> pathIdList) {
        regINS(CK_INS, cTL(pathIdList), getCValuePathId(), "PATHID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PATHID: {IX, NUMBER(18), FK to BURIPATH}
     * @param pathIdList The collection of pathId as notInScope.
     */
    public void setPathId_NotInScope(Collection<Long> pathIdList) {
        doSetPathId_NotInScope(pathIdList);
    }

    protected void doSetPathId_NotInScope(Collection<Long> pathIdList) {
        regINS(CK_NINS, cTL(pathIdList), getCValuePathId(), "PATHID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PATHID from BURIPATH where ...)} <br />
     * BURIPATH by my PATHID, named 'buriPath'.
     * @param subQuery The sub-query of BuriPath for 'in-scope'. (NotNull)
     */
    public void inScopeBuriPath(SubQuery<BuriPathCB> subQuery) {
        assertObjectNotNull("subQuery<BuriPathCB>", subQuery);
        BuriPathCB cb = new BuriPathCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepPathId_InScopeRelation_BuriPath(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PATHID", "PATHID", subQueryPropertyName, "buriPath");
    }
    public abstract String keepPathId_InScopeRelation_BuriPath(BuriPathCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PATHID from BURIPATH where ...)} <br />
     * BURIPATH by my PATHID, named 'buriPath'.
     * @param subQuery The sub-query of BuriPath for 'not in-scope'. (NotNull)
     */
    public void notInScopeBuriPath(SubQuery<BuriPathCB> subQuery) {
        assertObjectNotNull("subQuery<BuriPathCB>", subQuery);
        BuriPathCB cb = new BuriPathCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepPathId_NotInScopeRelation_BuriPath(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PATHID", "PATHID", subQueryPropertyName, "buriPath");
    }
    public abstract String keepPathId_NotInScopeRelation_BuriPath(BuriPathCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18), FK to BURIPATH}
     */
    public void setPathId_IsNull() { regPathId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18), FK to BURIPATH}
     */
    public void setPathId_IsNotNull() { regPathId(CK_ISNN, DOBJ); }

    protected void regPathId(ConditionKey k, Object v) { regQ(k, v, getCValuePathId(), "PATHID"); }
    abstract protected ConditionValue getCValuePathId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18), FK to BURIDATA}
     * @param dataId The value of dataId as equal.
     */
    public void setDataId_Equal(Long dataId) {
        doSetDataId_Equal(dataId);
    }

    protected void doSetDataId_Equal(Long dataId) {
        regDataId(CK_EQ, dataId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18), FK to BURIDATA}
     * @param dataId The value of dataId as greaterThan.
     */
    public void setDataId_GreaterThan(Long dataId) {
        regDataId(CK_GT, dataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18), FK to BURIDATA}
     * @param dataId The value of dataId as lessThan.
     */
    public void setDataId_LessThan(Long dataId) {
        regDataId(CK_LT, dataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18), FK to BURIDATA}
     * @param dataId The value of dataId as greaterEqual.
     */
    public void setDataId_GreaterEqual(Long dataId) {
        regDataId(CK_GE, dataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18), FK to BURIDATA}
     * @param dataId The value of dataId as lessEqual.
     */
    public void setDataId_LessEqual(Long dataId) {
        regDataId(CK_LE, dataId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18), FK to BURIDATA}
     * @param minNumber The min number of dataId. (NullAllowed)
     * @param maxNumber The max number of dataId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDataId(), "DATAID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DATAID: {IX, NUMBER(18), FK to BURIDATA}
     * @param dataIdList The collection of dataId as inScope.
     */
    public void setDataId_InScope(Collection<Long> dataIdList) {
        doSetDataId_InScope(dataIdList);
    }

    protected void doSetDataId_InScope(Collection<Long> dataIdList) {
        regINS(CK_INS, cTL(dataIdList), getCValueDataId(), "DATAID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DATAID: {IX, NUMBER(18), FK to BURIDATA}
     * @param dataIdList The collection of dataId as notInScope.
     */
    public void setDataId_NotInScope(Collection<Long> dataIdList) {
        doSetDataId_NotInScope(dataIdList);
    }

    protected void doSetDataId_NotInScope(Collection<Long> dataIdList) {
        regINS(CK_NINS, cTL(dataIdList), getCValueDataId(), "DATAID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DATAID from BURIDATA where ...)} <br />
     * BURIDATA by my DATAID, named 'buriData'.
     * @param subQuery The sub-query of BuriData for 'in-scope'. (NotNull)
     */
    public void inScopeBuriData(SubQuery<BuriDataCB> subQuery) {
        assertObjectNotNull("subQuery<BuriDataCB>", subQuery);
        BuriDataCB cb = new BuriDataCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepDataId_InScopeRelation_BuriData(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "DATAID", "DATAID", subQueryPropertyName, "buriData");
    }
    public abstract String keepDataId_InScopeRelation_BuriData(BuriDataCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DATAID from BURIDATA where ...)} <br />
     * BURIDATA by my DATAID, named 'buriData'.
     * @param subQuery The sub-query of BuriData for 'not in-scope'. (NotNull)
     */
    public void notInScopeBuriData(SubQuery<BuriDataCB> subQuery) {
        assertObjectNotNull("subQuery<BuriDataCB>", subQuery);
        BuriDataCB cb = new BuriDataCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepDataId_NotInScopeRelation_BuriData(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "DATAID", "DATAID", subQueryPropertyName, "buriData");
    }
    public abstract String keepDataId_NotInScopeRelation_BuriData(BuriDataCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18), FK to BURIDATA}
     */
    public void setDataId_IsNull() { regDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18), FK to BURIDATA}
     */
    public void setDataId_IsNotNull() { regDataId(CK_ISNN, DOBJ); }

    protected void regDataId(ConditionKey k, Object v) { regQ(k, v, getCValueDataId(), "DATAID"); }
    abstract protected ConditionValue getCValueDataId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH}
     * @param branchId The value of branchId as equal.
     */
    public void setBranchId_Equal(Long branchId) {
        doSetBranchId_Equal(branchId);
    }

    protected void doSetBranchId_Equal(Long branchId) {
        regBranchId(CK_EQ, branchId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH}
     * @param branchId The value of branchId as greaterThan.
     */
    public void setBranchId_GreaterThan(Long branchId) {
        regBranchId(CK_GT, branchId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH}
     * @param branchId The value of branchId as lessThan.
     */
    public void setBranchId_LessThan(Long branchId) {
        regBranchId(CK_LT, branchId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH}
     * @param branchId The value of branchId as greaterEqual.
     */
    public void setBranchId_GreaterEqual(Long branchId) {
        regBranchId(CK_GE, branchId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH}
     * @param branchId The value of branchId as lessEqual.
     */
    public void setBranchId_LessEqual(Long branchId) {
        regBranchId(CK_LE, branchId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH}
     * @param minNumber The min number of branchId. (NullAllowed)
     * @param maxNumber The max number of branchId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBranchId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBranchId(), "BRANCHID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH}
     * @param branchIdList The collection of branchId as inScope.
     */
    public void setBranchId_InScope(Collection<Long> branchIdList) {
        doSetBranchId_InScope(branchIdList);
    }

    protected void doSetBranchId_InScope(Collection<Long> branchIdList) {
        regINS(CK_INS, cTL(branchIdList), getCValueBranchId(), "BRANCHID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH}
     * @param branchIdList The collection of branchId as notInScope.
     */
    public void setBranchId_NotInScope(Collection<Long> branchIdList) {
        doSetBranchId_NotInScope(branchIdList);
    }

    protected void doSetBranchId_NotInScope(Collection<Long> branchIdList) {
        regINS(CK_NINS, cTL(branchIdList), getCValueBranchId(), "BRANCHID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BRANCHID from BURIBRANCH where ...)} <br />
     * BURIBRANCH by my BRANCHID, named 'buriBranch'.
     * @param subQuery The sub-query of BuriBranch for 'in-scope'. (NotNull)
     */
    public void inScopeBuriBranch(SubQuery<BuriBranchCB> subQuery) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBranchId_InScopeRelation_BuriBranch(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "BRANCHID", "BRANCHID", subQueryPropertyName, "buriBranch");
    }
    public abstract String keepBranchId_InScopeRelation_BuriBranch(BuriBranchCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BRANCHID from BURIBRANCH where ...)} <br />
     * BURIBRANCH by my BRANCHID, named 'buriBranch'.
     * @param subQuery The sub-query of BuriBranch for 'not in-scope'. (NotNull)
     */
    public void notInScopeBuriBranch(SubQuery<BuriBranchCB> subQuery) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBranchId_NotInScopeRelation_BuriBranch(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "BRANCHID", "BRANCHID", subQueryPropertyName, "buriBranch");
    }
    public abstract String keepBranchId_NotInScopeRelation_BuriBranch(BuriBranchCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH}
     */
    public void setBranchId_IsNull() { regBranchId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BRANCHID: {IX, NUMBER(18), FK to BURIBRANCH}
     */
    public void setBranchId_IsNotNull() { regBranchId(CK_ISNN, DOBJ); }

    protected void regBranchId(ConditionKey k, Object v) { regQ(k, v, getCValueBranchId(), "BRANCHID"); }
    abstract protected ConditionValue getCValueBranchId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * USERIDVAL: {VARCHAR2(20)}
     * @param userIdVal The value of userIdVal as equal.
     */
    public void setUserIdVal_Equal(String userIdVal) {
        doSetUserIdVal_Equal(fRES(userIdVal));
    }

    protected void doSetUserIdVal_Equal(String userIdVal) {
        regUserIdVal(CK_EQ, userIdVal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * USERIDVAL: {VARCHAR2(20)}
     * @param userIdVal The value of userIdVal as notEqual.
     */
    public void setUserIdVal_NotEqual(String userIdVal) {
        doSetUserIdVal_NotEqual(fRES(userIdVal));
    }

    protected void doSetUserIdVal_NotEqual(String userIdVal) {
        regUserIdVal(CK_NES, userIdVal);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * USERIDVAL: {VARCHAR2(20)}
     * @param userIdValList The collection of userIdVal as inScope.
     */
    public void setUserIdVal_InScope(Collection<String> userIdValList) {
        doSetUserIdVal_InScope(userIdValList);
    }

    public void doSetUserIdVal_InScope(Collection<String> userIdValList) {
        regINS(CK_INS, cTL(userIdValList), getCValueUserIdVal(), "USERIDVAL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * USERIDVAL: {VARCHAR2(20)}
     * @param userIdValList The collection of userIdVal as notInScope.
     */
    public void setUserIdVal_NotInScope(Collection<String> userIdValList) {
        doSetUserIdVal_NotInScope(userIdValList);
    }

    public void doSetUserIdVal_NotInScope(Collection<String> userIdValList) {
        regINS(CK_NINS, cTL(userIdValList), getCValueUserIdVal(), "USERIDVAL");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * USERIDVAL: {VARCHAR2(20)}
     * @param userIdVal The value of userIdVal as prefixSearch.
     */
    public void setUserIdVal_PrefixSearch(String userIdVal) {
        setUserIdVal_LikeSearch(userIdVal, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * USERIDVAL: {VARCHAR2(20)}
     * @param userIdVal The value of userIdVal as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserIdVal_LikeSearch(String userIdVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userIdVal), getCValueUserIdVal(), "USERIDVAL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * USERIDVAL: {VARCHAR2(20)}
     * @param userIdVal The value of userIdVal as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserIdVal_NotLikeSearch(String userIdVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userIdVal), getCValueUserIdVal(), "USERIDVAL", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * USERIDVAL: {VARCHAR2(20)}
     */
    public void setUserIdVal_IsNull() { regUserIdVal(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * USERIDVAL: {VARCHAR2(20)}
     */
    public void setUserIdVal_IsNullOrEmpty() { regUserIdVal(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * USERIDVAL: {VARCHAR2(20)}
     */
    public void setUserIdVal_IsNotNull() { regUserIdVal(CK_ISNN, DOBJ); }

    protected void regUserIdVal(ConditionKey k, Object v) { regQ(k, v, getCValueUserIdVal(), "USERIDVAL"); }
    abstract protected ConditionValue getCValueUserIdVal();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * USERIDNUM: {NUMBER(18)}
     * @param userIdNum The value of userIdNum as equal.
     */
    public void setUserIdNum_Equal(Long userIdNum) {
        doSetUserIdNum_Equal(userIdNum);
    }

    protected void doSetUserIdNum_Equal(Long userIdNum) {
        regUserIdNum(CK_EQ, userIdNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * USERIDNUM: {NUMBER(18)}
     * @param userIdNum The value of userIdNum as greaterThan.
     */
    public void setUserIdNum_GreaterThan(Long userIdNum) {
        regUserIdNum(CK_GT, userIdNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * USERIDNUM: {NUMBER(18)}
     * @param userIdNum The value of userIdNum as lessThan.
     */
    public void setUserIdNum_LessThan(Long userIdNum) {
        regUserIdNum(CK_LT, userIdNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * USERIDNUM: {NUMBER(18)}
     * @param userIdNum The value of userIdNum as greaterEqual.
     */
    public void setUserIdNum_GreaterEqual(Long userIdNum) {
        regUserIdNum(CK_GE, userIdNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * USERIDNUM: {NUMBER(18)}
     * @param userIdNum The value of userIdNum as lessEqual.
     */
    public void setUserIdNum_LessEqual(Long userIdNum) {
        regUserIdNum(CK_LE, userIdNum);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * USERIDNUM: {NUMBER(18)}
     * @param minNumber The min number of userIdNum. (NullAllowed)
     * @param maxNumber The max number of userIdNum. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUserIdNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueUserIdNum(), "USERIDNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * USERIDNUM: {NUMBER(18)}
     * @param userIdNumList The collection of userIdNum as inScope.
     */
    public void setUserIdNum_InScope(Collection<Long> userIdNumList) {
        doSetUserIdNum_InScope(userIdNumList);
    }

    protected void doSetUserIdNum_InScope(Collection<Long> userIdNumList) {
        regINS(CK_INS, cTL(userIdNumList), getCValueUserIdNum(), "USERIDNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * USERIDNUM: {NUMBER(18)}
     * @param userIdNumList The collection of userIdNum as notInScope.
     */
    public void setUserIdNum_NotInScope(Collection<Long> userIdNumList) {
        doSetUserIdNum_NotInScope(userIdNumList);
    }

    protected void doSetUserIdNum_NotInScope(Collection<Long> userIdNumList) {
        regINS(CK_NINS, cTL(userIdNumList), getCValueUserIdNum(), "USERIDNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * USERIDNUM: {NUMBER(18)}
     */
    public void setUserIdNum_IsNull() { regUserIdNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * USERIDNUM: {NUMBER(18)}
     */
    public void setUserIdNum_IsNotNull() { regUserIdNum(CK_ISNN, DOBJ); }

    protected void regUserIdNum(ConditionKey k, Object v) { regQ(k, v, getCValueUserIdNum(), "USERIDNUM"); }
    abstract protected ConditionValue getCValueUserIdNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @param participantName The value of participantName as equal.
     */
    public void setParticipantName_Equal(String participantName) {
        doSetParticipantName_Equal(fRES(participantName));
    }

    protected void doSetParticipantName_Equal(String participantName) {
        regParticipantName(CK_EQ, participantName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @param participantName The value of participantName as notEqual.
     */
    public void setParticipantName_NotEqual(String participantName) {
        doSetParticipantName_NotEqual(fRES(participantName));
    }

    protected void doSetParticipantName_NotEqual(String participantName) {
        regParticipantName(CK_NES, participantName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @param participantNameList The collection of participantName as inScope.
     */
    public void setParticipantName_InScope(Collection<String> participantNameList) {
        doSetParticipantName_InScope(participantNameList);
    }

    public void doSetParticipantName_InScope(Collection<String> participantNameList) {
        regINS(CK_INS, cTL(participantNameList), getCValueParticipantName(), "PARTICIPANTNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @param participantNameList The collection of participantName as notInScope.
     */
    public void setParticipantName_NotInScope(Collection<String> participantNameList) {
        doSetParticipantName_NotInScope(participantNameList);
    }

    public void doSetParticipantName_NotInScope(Collection<String> participantNameList) {
        regINS(CK_NINS, cTL(participantNameList), getCValueParticipantName(), "PARTICIPANTNAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @param participantName The value of participantName as prefixSearch.
     */
    public void setParticipantName_PrefixSearch(String participantName) {
        setParticipantName_LikeSearch(participantName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @param participantName The value of participantName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setParticipantName_LikeSearch(String participantName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(participantName), getCValueParticipantName(), "PARTICIPANTNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @param participantName The value of participantName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setParticipantName_NotLikeSearch(String participantName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(participantName), getCValueParticipantName(), "PARTICIPANTNAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     */
    public void setParticipantName_IsNull() { regParticipantName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     */
    public void setParticipantName_IsNullOrEmpty() { regParticipantName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     */
    public void setParticipantName_IsNotNull() { regParticipantName(CK_ISNN, DOBJ); }

    protected void regParticipantName(ConditionKey k, Object v) { regQ(k, v, getCValueParticipantName(), "PARTICIPANTNAME"); }
    abstract protected ConditionValue getCValueParticipantName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @param participantType The value of participantType as equal.
     */
    public void setParticipantType_Equal(String participantType) {
        doSetParticipantType_Equal(fRES(participantType));
    }

    protected void doSetParticipantType_Equal(String participantType) {
        regParticipantType(CK_EQ, participantType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @param participantType The value of participantType as notEqual.
     */
    public void setParticipantType_NotEqual(String participantType) {
        doSetParticipantType_NotEqual(fRES(participantType));
    }

    protected void doSetParticipantType_NotEqual(String participantType) {
        regParticipantType(CK_NES, participantType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @param participantTypeList The collection of participantType as inScope.
     */
    public void setParticipantType_InScope(Collection<String> participantTypeList) {
        doSetParticipantType_InScope(participantTypeList);
    }

    public void doSetParticipantType_InScope(Collection<String> participantTypeList) {
        regINS(CK_INS, cTL(participantTypeList), getCValueParticipantType(), "PARTICIPANTTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @param participantTypeList The collection of participantType as notInScope.
     */
    public void setParticipantType_NotInScope(Collection<String> participantTypeList) {
        doSetParticipantType_NotInScope(participantTypeList);
    }

    public void doSetParticipantType_NotInScope(Collection<String> participantTypeList) {
        regINS(CK_NINS, cTL(participantTypeList), getCValueParticipantType(), "PARTICIPANTTYPE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @param participantType The value of participantType as prefixSearch.
     */
    public void setParticipantType_PrefixSearch(String participantType) {
        setParticipantType_LikeSearch(participantType, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @param participantType The value of participantType as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setParticipantType_LikeSearch(String participantType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(participantType), getCValueParticipantType(), "PARTICIPANTTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @param participantType The value of participantType as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setParticipantType_NotLikeSearch(String participantType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(participantType), getCValueParticipantType(), "PARTICIPANTTYPE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     */
    public void setParticipantType_IsNull() { regParticipantType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     */
    public void setParticipantType_IsNullOrEmpty() { regParticipantType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     */
    public void setParticipantType_IsNotNull() { regParticipantType(CK_ISNN, DOBJ); }

    protected void regParticipantType(ConditionKey k, Object v) { regQ(k, v, getCValueParticipantType(), "PARTICIPANTTYPE"); }
    abstract protected ConditionValue getCValueParticipantType();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @param btid The value of btid as equal.
     */
    public void setBtid_Equal(Long btid) {
        doSetBtid_Equal(btid);
    }

    protected void doSetBtid_Equal(Long btid) {
        regBtid(CK_EQ, btid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @param btid The value of btid as greaterThan.
     */
    public void setBtid_GreaterThan(Long btid) {
        regBtid(CK_GT, btid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @param btid The value of btid as lessThan.
     */
    public void setBtid_LessThan(Long btid) {
        regBtid(CK_LT, btid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @param btid The value of btid as greaterEqual.
     */
    public void setBtid_GreaterEqual(Long btid) {
        regBtid(CK_GE, btid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @param btid The value of btid as lessEqual.
     */
    public void setBtid_LessEqual(Long btid) {
        regBtid(CK_LE, btid);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @param minNumber The min number of btid. (NullAllowed)
     * @param maxNumber The max number of btid. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBtid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBtid(), "BTID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @param btidList The collection of btid as inScope.
     */
    public void setBtid_InScope(Collection<Long> btidList) {
        doSetBtid_InScope(btidList);
    }

    protected void doSetBtid_InScope(Collection<Long> btidList) {
        regINS(CK_INS, cTL(btidList), getCValueBtid(), "BTID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @param btidList The collection of btid as notInScope.
     */
    public void setBtid_NotInScope(Collection<Long> btidList) {
        doSetBtid_NotInScope(btidList);
    }

    protected void doSetBtid_NotInScope(Collection<Long> btidList) {
        regINS(CK_NINS, cTL(btidList), getCValueBtid(), "BTID");
    }

    protected void regBtid(ConditionKey k, Object v) { regQ(k, v, getCValueBtid(), "BTID"); }
    abstract protected ConditionValue getCValueBtid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param insertDate The value of insertDate as equal.
     */
    public void setInsertDate_Equal(java.sql.Timestamp insertDate) {
        regInsertDate(CK_EQ,  insertDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param insertDate The value of insertDate as greaterThan.
     */
    public void setInsertDate_GreaterThan(java.sql.Timestamp insertDate) {
        regInsertDate(CK_GT,  insertDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param insertDate The value of insertDate as lessThan.
     */
    public void setInsertDate_LessThan(java.sql.Timestamp insertDate) {
        regInsertDate(CK_LT,  insertDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param insertDate The value of insertDate as greaterEqual.
     */
    public void setInsertDate_GreaterEqual(java.sql.Timestamp insertDate) {
        regInsertDate(CK_GE,  insertDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param insertDate The value of insertDate as lessEqual.
     */
    public void setInsertDate_LessEqual(java.sql.Timestamp insertDate) {
        regInsertDate(CK_LE, insertDate);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of insertDate. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of insertDate. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setInsertDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueInsertDate(), "INSERTDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of insertDate. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of insertDate. (NullAllowed)
     */
    public void setInsertDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setInsertDate_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param insertDateList The collection of insertDate as inScope.
     */
    public void setInsertDate_InScope(Collection<java.sql.Timestamp> insertDateList) {
        doSetInsertDate_InScope(insertDateList);
    }

    protected void doSetInsertDate_InScope(Collection<java.sql.Timestamp> insertDateList) {
        regINS(CK_INS, cTL(insertDateList), getCValueInsertDate(), "INSERTDATE");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INSERTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param insertDateList The collection of insertDate as notInScope.
     */
    public void setInsertDate_NotInScope(Collection<java.sql.Timestamp> insertDateList) {
        doSetInsertDate_NotInScope(insertDateList);
    }

    protected void doSetInsertDate_NotInScope(Collection<java.sql.Timestamp> insertDateList) {
        regINS(CK_NINS, cTL(insertDateList), getCValueInsertDate(), "INSERTDATE");
    }

    protected void regInsertDate(ConditionKey k, Object v) { regQ(k, v, getCValueInsertDate(), "INSERTDATE"); }
    abstract protected ConditionValue getCValueInsertDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param autoRunTime The value of autoRunTime as equal.
     */
    public void setAutoRunTime_Equal(java.sql.Timestamp autoRunTime) {
        regAutoRunTime(CK_EQ,  autoRunTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param autoRunTime The value of autoRunTime as greaterThan.
     */
    public void setAutoRunTime_GreaterThan(java.sql.Timestamp autoRunTime) {
        regAutoRunTime(CK_GT,  autoRunTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param autoRunTime The value of autoRunTime as lessThan.
     */
    public void setAutoRunTime_LessThan(java.sql.Timestamp autoRunTime) {
        regAutoRunTime(CK_LT,  autoRunTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param autoRunTime The value of autoRunTime as greaterEqual.
     */
    public void setAutoRunTime_GreaterEqual(java.sql.Timestamp autoRunTime) {
        regAutoRunTime(CK_GE,  autoRunTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param autoRunTime The value of autoRunTime as lessEqual.
     */
    public void setAutoRunTime_LessEqual(java.sql.Timestamp autoRunTime) {
        regAutoRunTime(CK_LE, autoRunTime);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of autoRunTime. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of autoRunTime. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setAutoRunTime_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueAutoRunTime(), "AUTORUNTIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of autoRunTime. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of autoRunTime. (NullAllowed)
     */
    public void setAutoRunTime_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setAutoRunTime_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param autoRunTimeList The collection of autoRunTime as inScope.
     */
    public void setAutoRunTime_InScope(Collection<java.sql.Timestamp> autoRunTimeList) {
        doSetAutoRunTime_InScope(autoRunTimeList);
    }

    protected void doSetAutoRunTime_InScope(Collection<java.sql.Timestamp> autoRunTimeList) {
        regINS(CK_INS, cTL(autoRunTimeList), getCValueAutoRunTime(), "AUTORUNTIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * AUTORUNTIME: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param autoRunTimeList The collection of autoRunTime as notInScope.
     */
    public void setAutoRunTime_NotInScope(Collection<java.sql.Timestamp> autoRunTimeList) {
        doSetAutoRunTime_NotInScope(autoRunTimeList);
    }

    protected void doSetAutoRunTime_NotInScope(Collection<java.sql.Timestamp> autoRunTimeList) {
        regINS(CK_NINS, cTL(autoRunTimeList), getCValueAutoRunTime(), "AUTORUNTIME");
    }

    protected void regAutoRunTime(ConditionKey k, Object v) { regQ(k, v, getCValueAutoRunTime(), "AUTORUNTIME"); }
    abstract protected ConditionValue getCValueAutoRunTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as equal.
     */
    public void setProcessDate_Equal(java.sql.Timestamp processDate) {
        regProcessDate(CK_EQ,  processDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as greaterThan.
     */
    public void setProcessDate_GreaterThan(java.sql.Timestamp processDate) {
        regProcessDate(CK_GT,  processDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as lessThan.
     */
    public void setProcessDate_LessThan(java.sql.Timestamp processDate) {
        regProcessDate(CK_LT,  processDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as greaterEqual.
     */
    public void setProcessDate_GreaterEqual(java.sql.Timestamp processDate) {
        regProcessDate(CK_GE,  processDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as lessEqual.
     */
    public void setProcessDate_LessEqual(java.sql.Timestamp processDate) {
        regProcessDate(CK_LE, processDate);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of processDate. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of processDate. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setProcessDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueProcessDate(), "PROCESSDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of processDate. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of processDate. (NullAllowed)
     */
    public void setProcessDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setProcessDate_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param processDateList The collection of processDate as inScope.
     */
    public void setProcessDate_InScope(Collection<java.sql.Timestamp> processDateList) {
        doSetProcessDate_InScope(processDateList);
    }

    protected void doSetProcessDate_InScope(Collection<java.sql.Timestamp> processDateList) {
        regINS(CK_INS, cTL(processDateList), getCValueProcessDate(), "PROCESSDATE");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PROCESSDATE: {IX, NotNull, TIMESTAMP(6)(11, 6)}
     * @param processDateList The collection of processDate as notInScope.
     */
    public void setProcessDate_NotInScope(Collection<java.sql.Timestamp> processDateList) {
        doSetProcessDate_NotInScope(processDateList);
    }

    protected void doSetProcessDate_NotInScope(Collection<java.sql.Timestamp> processDateList) {
        regINS(CK_NINS, cTL(processDateList), getCValueProcessDate(), "PROCESSDATE");
    }

    protected void regProcessDate(ConditionKey k, Object v) { regQ(k, v, getCValueProcessDate(), "PROCESSDATE"); }
    abstract protected ConditionValue getCValueProcessDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param abortDate The value of abortDate as equal.
     */
    public void setAbortDate_Equal(java.sql.Timestamp abortDate) {
        regAbortDate(CK_EQ,  abortDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param abortDate The value of abortDate as greaterThan.
     */
    public void setAbortDate_GreaterThan(java.sql.Timestamp abortDate) {
        regAbortDate(CK_GT,  abortDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param abortDate The value of abortDate as lessThan.
     */
    public void setAbortDate_LessThan(java.sql.Timestamp abortDate) {
        regAbortDate(CK_LT,  abortDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param abortDate The value of abortDate as greaterEqual.
     */
    public void setAbortDate_GreaterEqual(java.sql.Timestamp abortDate) {
        regAbortDate(CK_GE,  abortDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param abortDate The value of abortDate as lessEqual.
     */
    public void setAbortDate_LessEqual(java.sql.Timestamp abortDate) {
        regAbortDate(CK_LE, abortDate);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of abortDate. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of abortDate. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setAbortDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueAbortDate(), "ABORTDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of abortDate. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of abortDate. (NullAllowed)
     */
    public void setAbortDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setAbortDate_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param abortDateList The collection of abortDate as inScope.
     */
    public void setAbortDate_InScope(Collection<java.sql.Timestamp> abortDateList) {
        doSetAbortDate_InScope(abortDateList);
    }

    protected void doSetAbortDate_InScope(Collection<java.sql.Timestamp> abortDateList) {
        regINS(CK_INS, cTL(abortDateList), getCValueAbortDate(), "ABORTDATE");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param abortDateList The collection of abortDate as notInScope.
     */
    public void setAbortDate_NotInScope(Collection<java.sql.Timestamp> abortDateList) {
        doSetAbortDate_NotInScope(abortDateList);
    }

    protected void doSetAbortDate_NotInScope(Collection<java.sql.Timestamp> abortDateList) {
        regINS(CK_NINS, cTL(abortDateList), getCValueAbortDate(), "ABORTDATE");
    }

    protected void regAbortDate(ConditionKey k, Object v) { regQ(k, v, getCValueAbortDate(), "ABORTDATE"); }
    abstract protected ConditionValue getCValueAbortDate();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSIONNO: {NotNull, NUMBER(22)}
     * @param versionNo The value of versionNo as equal.
     */
    public void setVersionNo_Equal(java.math.BigDecimal versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(java.math.BigDecimal versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSIONNO: {NotNull, NUMBER(22)}
     * @param versionNo The value of versionNo as greaterThan.
     */
    public void setVersionNo_GreaterThan(java.math.BigDecimal versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSIONNO: {NotNull, NUMBER(22)}
     * @param versionNo The value of versionNo as lessThan.
     */
    public void setVersionNo_LessThan(java.math.BigDecimal versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSIONNO: {NotNull, NUMBER(22)}
     * @param versionNo The value of versionNo as greaterEqual.
     */
    public void setVersionNo_GreaterEqual(java.math.BigDecimal versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSIONNO: {NotNull, NUMBER(22)}
     * @param versionNo The value of versionNo as lessEqual.
     */
    public void setVersionNo_LessEqual(java.math.BigDecimal versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VERSIONNO: {NotNull, NUMBER(22)}
     * @param minNumber The min number of versionNo. (NullAllowed)
     * @param maxNumber The max number of versionNo. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSIONNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VERSIONNO: {NotNull, NUMBER(22)}
     * @param versionNoList The collection of versionNo as inScope.
     */
    public void setVersionNo_InScope(Collection<java.math.BigDecimal> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<java.math.BigDecimal> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), getCValueVersionNo(), "VERSIONNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VERSIONNO: {NotNull, NUMBER(22)}
     * @param versionNoList The collection of versionNo as notInScope.
     */
    public void setVersionNo_NotInScope(Collection<java.math.BigDecimal> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<java.math.BigDecimal> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), getCValueVersionNo(), "VERSIONNO");
    }

    protected void regVersionNo(ConditionKey k, Object v) { regQ(k, v, getCValueVersionNo(), "VERSIONNO"); }
    abstract protected ConditionValue getCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriStateCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriStateCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriStateCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriStateCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriStateCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriStateCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriStateCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriStateCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriStateCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriStateCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriStateCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriStateCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<BuriStateCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<BuriStateCB>(new HpSSQSetupper<BuriStateCB>() {
            public void setup(String function, SubQuery<BuriStateCB> subQuery, HpSSQOption<BuriStateCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<BuriStateCB> subQuery, String operand, HpSSQOption<BuriStateCB> option) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(BuriStateCQ subQuery);

    protected BuriStateCB xcreateScalarConditionCB() {
        BuriStateCB cb = new BuriStateCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected BuriStateCB xcreateScalarConditionPartitionByCB() {
        BuriStateCB cb = new BuriStateCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<BuriStateCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "STATEID", "STATEID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(BuriStateCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BuriStateCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<BuriStateCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<BuriStateCB>(new HpQDRSetupper<BuriStateCB>() {
            public void setup(String function, SubQuery<BuriStateCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<BuriStateCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "STATEID", "STATEID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(BuriStateCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(BuriStateCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(BuriStateCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return BuriStateCB.class.getName(); }
    protected String xabCQ() { return BuriStateCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}

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
 * The abstract condition-query of BURIBRANCH.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBuriBranchCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBuriBranchCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BURIBRANCH";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BRANCHID: {PK, NotNull, NUMBER(18)}
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
     * BRANCHID: {PK, NotNull, NUMBER(18)}
     * @param branchId The value of branchId as greaterThan.
     */
    public void setBranchId_GreaterThan(Long branchId) {
        regBranchId(CK_GT, branchId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BRANCHID: {PK, NotNull, NUMBER(18)}
     * @param branchId The value of branchId as lessThan.
     */
    public void setBranchId_LessThan(Long branchId) {
        regBranchId(CK_LT, branchId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BRANCHID: {PK, NotNull, NUMBER(18)}
     * @param branchId The value of branchId as greaterEqual.
     */
    public void setBranchId_GreaterEqual(Long branchId) {
        regBranchId(CK_GE, branchId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BRANCHID: {PK, NotNull, NUMBER(18)}
     * @param branchId The value of branchId as lessEqual.
     */
    public void setBranchId_LessEqual(Long branchId) {
        regBranchId(CK_LE, branchId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BRANCHID: {PK, NotNull, NUMBER(18)}
     * @param minNumber The min number of branchId. (NullAllowed)
     * @param maxNumber The max number of branchId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBranchId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBranchId(), "BRANCHID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BRANCHID: {PK, NotNull, NUMBER(18)}
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
     * BRANCHID: {PK, NotNull, NUMBER(18)}
     * @param branchIdList The collection of branchId as notInScope.
     */
    public void setBranchId_NotInScope(Collection<Long> branchIdList) {
        doSetBranchId_NotInScope(branchIdList);
    }

    protected void doSetBranchId_NotInScope(Collection<Long> branchIdList) {
        regINS(CK_NINS, cTL(branchIdList), getCValueBranchId(), "BRANCHID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select BRANCHID from BURISTATE where ...)} <br />
     * BURISTATE by your BRANCHID, named 'buriStateAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsBuriStateList</span>(new SubQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriBranchCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BuriStateList for 'exists'. (NotNull)
     */
    public void existsBuriStateList(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBranchId_ExistsReferrer_BuriStateList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "BRANCHID", "BRANCHID", subQueryPropertyName, "buriStateList");
    }
    public abstract String keepBranchId_ExistsReferrer_BuriStateList(BuriStateCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select BRANCHID from BURISTATE where ...)} <br />
     * BURISTATE by your BRANCHID, named 'buriStateAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsBuriStateList</span>(new SubQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriBranchCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BranchId_NotExistsReferrer_BuriStateList for 'not exists'. (NotNull)
     */
    public void notExistsBuriStateList(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBranchId_NotExistsReferrer_BuriStateList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "BRANCHID", "BRANCHID", subQueryPropertyName, "buriStateList");
    }
    public abstract String keepBranchId_NotExistsReferrer_BuriStateList(BuriStateCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BRANCHID from BURISTATE where ...)} <br />
     * BURISTATE by your BRANCHID, named 'buriStateAsOne'.
     * @param subQuery The sub-query of BuriStateList for 'in-scope'. (NotNull)
     */
    public void inScopeBuriStateList(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBranchId_InScopeRelation_BuriStateList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "BRANCHID", "BRANCHID", subQueryPropertyName, "buriStateList");
    }
    public abstract String keepBranchId_InScopeRelation_BuriStateList(BuriStateCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BRANCHID from BURISTATE where ...)} <br />
     * BURISTATE by your BRANCHID, named 'buriStateAsOne'.
     * @param subQuery The sub-query of BuriStateList for 'not in-scope'. (NotNull)
     */
    public void notInScopeBuriStateList(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBranchId_NotInScopeRelation_BuriStateList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "BRANCHID", "BRANCHID", subQueryPropertyName, "buriStateList");
    }
    public abstract String keepBranchId_NotInScopeRelation_BuriStateList(BuriStateCQ subQuery);

    public void xsderiveBuriStateList(String function, SubQuery<BuriStateCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBranchId_SpecifyDerivedReferrer_BuriStateList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "BRANCHID", "BRANCHID", subQueryPropertyName, "buriStateList", aliasName, option);
    }
    public abstract String keepBranchId_SpecifyDerivedReferrer_BuriStateList(BuriStateCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from BURISTATE where ...)} <br />
     * BURISTATE by your BRANCHID, named 'buriStateAsOne'.
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
    public HpQDRFunction<BuriStateCB> derivedBuriStateList() {
        return xcreateQDRFunctionBuriStateList();
    }
    protected HpQDRFunction<BuriStateCB> xcreateQDRFunctionBuriStateList() {
        return new HpQDRFunction<BuriStateCB>(new HpQDRSetupper<BuriStateCB>() {
            public void setup(String function, SubQuery<BuriStateCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveBuriStateList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveBuriStateList(String function, SubQuery<BuriStateCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBranchId_QueryDerivedReferrer_BuriStateList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepBranchId_QueryDerivedReferrer_BuriStateListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "BRANCHID", "BRANCHID", subQueryPropertyName, "buriStateList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepBranchId_QueryDerivedReferrer_BuriStateList(BuriStateCQ subQuery);
    public abstract String keepBranchId_QueryDerivedReferrer_BuriStateListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BRANCHID: {PK, NotNull, NUMBER(18)}
     */
    public void setBranchId_IsNull() { regBranchId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BRANCHID: {PK, NotNull, NUMBER(18)}
     */
    public void setBranchId_IsNotNull() { regBranchId(CK_ISNN, DOBJ); }

    protected void regBranchId(ConditionKey k, Object v) { regQ(k, v, getCValueBranchId(), "BRANCHID"); }
    abstract protected ConditionValue getCValueBranchId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PARENTBRANCHID: {IX, NUMBER(18)}
     * @param parentBranchId The value of parentBranchId as equal.
     */
    public void setParentBranchId_Equal(Long parentBranchId) {
        doSetParentBranchId_Equal(parentBranchId);
    }

    protected void doSetParentBranchId_Equal(Long parentBranchId) {
        regParentBranchId(CK_EQ, parentBranchId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PARENTBRANCHID: {IX, NUMBER(18)}
     * @param parentBranchId The value of parentBranchId as greaterThan.
     */
    public void setParentBranchId_GreaterThan(Long parentBranchId) {
        regParentBranchId(CK_GT, parentBranchId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PARENTBRANCHID: {IX, NUMBER(18)}
     * @param parentBranchId The value of parentBranchId as lessThan.
     */
    public void setParentBranchId_LessThan(Long parentBranchId) {
        regParentBranchId(CK_LT, parentBranchId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PARENTBRANCHID: {IX, NUMBER(18)}
     * @param parentBranchId The value of parentBranchId as greaterEqual.
     */
    public void setParentBranchId_GreaterEqual(Long parentBranchId) {
        regParentBranchId(CK_GE, parentBranchId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PARENTBRANCHID: {IX, NUMBER(18)}
     * @param parentBranchId The value of parentBranchId as lessEqual.
     */
    public void setParentBranchId_LessEqual(Long parentBranchId) {
        regParentBranchId(CK_LE, parentBranchId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PARENTBRANCHID: {IX, NUMBER(18)}
     * @param minNumber The min number of parentBranchId. (NullAllowed)
     * @param maxNumber The max number of parentBranchId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setParentBranchId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueParentBranchId(), "PARENTBRANCHID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PARENTBRANCHID: {IX, NUMBER(18)}
     * @param parentBranchIdList The collection of parentBranchId as inScope.
     */
    public void setParentBranchId_InScope(Collection<Long> parentBranchIdList) {
        doSetParentBranchId_InScope(parentBranchIdList);
    }

    protected void doSetParentBranchId_InScope(Collection<Long> parentBranchIdList) {
        regINS(CK_INS, cTL(parentBranchIdList), getCValueParentBranchId(), "PARENTBRANCHID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PARENTBRANCHID: {IX, NUMBER(18)}
     * @param parentBranchIdList The collection of parentBranchId as notInScope.
     */
    public void setParentBranchId_NotInScope(Collection<Long> parentBranchIdList) {
        doSetParentBranchId_NotInScope(parentBranchIdList);
    }

    protected void doSetParentBranchId_NotInScope(Collection<Long> parentBranchIdList) {
        regINS(CK_NINS, cTL(parentBranchIdList), getCValueParentBranchId(), "PARENTBRANCHID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PARENTBRANCHID: {IX, NUMBER(18)}
     */
    public void setParentBranchId_IsNull() { regParentBranchId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PARENTBRANCHID: {IX, NUMBER(18)}
     */
    public void setParentBranchId_IsNotNull() { regParentBranchId(CK_ISNN, DOBJ); }

    protected void regParentBranchId(ConditionKey k, Object v) { regQ(k, v, getCValueParentBranchId(), "PARENTBRANCHID"); }
    abstract protected ConditionValue getCValueParentBranchId();
    
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
     * PROCESSDATE: {TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as equal.
     */
    public void setProcessDate_Equal(java.sql.Timestamp processDate) {
        regProcessDate(CK_EQ,  processDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as greaterThan.
     */
    public void setProcessDate_GreaterThan(java.sql.Timestamp processDate) {
        regProcessDate(CK_GT,  processDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as lessThan.
     */
    public void setProcessDate_LessThan(java.sql.Timestamp processDate) {
        regProcessDate(CK_LT,  processDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as greaterEqual.
     */
    public void setProcessDate_GreaterEqual(java.sql.Timestamp processDate) {
        regProcessDate(CK_GE,  processDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as lessEqual.
     */
    public void setProcessDate_LessEqual(java.sql.Timestamp processDate) {
        regProcessDate(CK_LE, processDate);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {TIMESTAMP(6)(11, 6)}
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
     * PROCESSDATE: {TIMESTAMP(6)(11, 6)}
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
     * PROCESSDATE: {TIMESTAMP(6)(11, 6)}
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
     * PROCESSDATE: {TIMESTAMP(6)(11, 6)}
     * @param processDateList The collection of processDate as notInScope.
     */
    public void setProcessDate_NotInScope(Collection<java.sql.Timestamp> processDateList) {
        doSetProcessDate_NotInScope(processDateList);
    }

    protected void doSetProcessDate_NotInScope(Collection<java.sql.Timestamp> processDateList) {
        regINS(CK_NINS, cTL(processDateList), getCValueProcessDate(), "PROCESSDATE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PROCESSDATE: {TIMESTAMP(6)(11, 6)}
     */
    public void setProcessDate_IsNull() { regProcessDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PROCESSDATE: {TIMESTAMP(6)(11, 6)}
     */
    public void setProcessDate_IsNotNull() { regProcessDate(CK_ISNN, DOBJ); }

    protected void regProcessDate(ConditionKey k, Object v) { regQ(k, v, getCValueProcessDate(), "PROCESSDATE"); }
    abstract protected ConditionValue getCValueProcessDate();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(22)}
     * @param btid The value of btid as equal.
     */
    public void setBtid_Equal(java.math.BigDecimal btid) {
        doSetBtid_Equal(btid);
    }

    protected void doSetBtid_Equal(java.math.BigDecimal btid) {
        regBtid(CK_EQ, btid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(22)}
     * @param btid The value of btid as greaterThan.
     */
    public void setBtid_GreaterThan(java.math.BigDecimal btid) {
        regBtid(CK_GT, btid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(22)}
     * @param btid The value of btid as lessThan.
     */
    public void setBtid_LessThan(java.math.BigDecimal btid) {
        regBtid(CK_LT, btid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(22)}
     * @param btid The value of btid as greaterEqual.
     */
    public void setBtid_GreaterEqual(java.math.BigDecimal btid) {
        regBtid(CK_GE, btid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(22)}
     * @param btid The value of btid as lessEqual.
     */
    public void setBtid_LessEqual(java.math.BigDecimal btid) {
        regBtid(CK_LE, btid);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(22)}
     * @param minNumber The min number of btid. (NullAllowed)
     * @param maxNumber The max number of btid. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBtid_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBtid(), "BTID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BTID: {NotNull, NUMBER(22)}
     * @param btidList The collection of btid as inScope.
     */
    public void setBtid_InScope(Collection<java.math.BigDecimal> btidList) {
        doSetBtid_InScope(btidList);
    }

    protected void doSetBtid_InScope(Collection<java.math.BigDecimal> btidList) {
        regINS(CK_INS, cTL(btidList), getCValueBtid(), "BTID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BTID: {NotNull, NUMBER(22)}
     * @param btidList The collection of btid as notInScope.
     */
    public void setBtid_NotInScope(Collection<java.math.BigDecimal> btidList) {
        doSetBtid_NotInScope(btidList);
    }

    protected void doSetBtid_NotInScope(Collection<java.math.BigDecimal> btidList) {
        regINS(CK_NINS, cTL(btidList), getCValueBtid(), "BTID");
    }

    protected void regBtid(ConditionKey k, Object v) { regQ(k, v, getCValueBtid(), "BTID"); }
    abstract protected ConditionValue getCValueBtid();
    
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
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;BuriBranchCB&gt;() {
     *     public void query(BuriBranchCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriBranchCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;BuriBranchCB&gt;() {
     *     public void query(BuriBranchCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriBranchCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;BuriBranchCB&gt;() {
     *     public void query(BuriBranchCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriBranchCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;BuriBranchCB&gt;() {
     *     public void query(BuriBranchCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriBranchCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;BuriBranchCB&gt;() {
     *     public void query(BuriBranchCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriBranchCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BuriBranchCB&gt;() {
     *     public void query(BuriBranchCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriBranchCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<BuriBranchCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<BuriBranchCB>(new HpSSQSetupper<BuriBranchCB>() {
            public void setup(String function, SubQuery<BuriBranchCB> subQuery, HpSSQOption<BuriBranchCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<BuriBranchCB> subQuery, String operand, HpSSQOption<BuriBranchCB> option) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(BuriBranchCQ subQuery);

    protected BuriBranchCB xcreateScalarConditionCB() {
        BuriBranchCB cb = new BuriBranchCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected BuriBranchCB xcreateScalarConditionPartitionByCB() {
        BuriBranchCB cb = new BuriBranchCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<BuriBranchCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "BRANCHID", "BRANCHID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(BuriBranchCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BuriBranchCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<BuriBranchCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<BuriBranchCB>(new HpQDRSetupper<BuriBranchCB>() {
            public void setup(String function, SubQuery<BuriBranchCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<BuriBranchCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "BRANCHID", "BRANCHID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(BuriBranchCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<BuriBranchCB> subQuery) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(BuriBranchCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<BuriBranchCB> subQuery) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(BuriBranchCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return BuriBranchCB.class.getName(); }
    protected String xabCQ() { return BuriBranchCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}

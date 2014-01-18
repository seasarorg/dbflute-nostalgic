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
 * The abstract condition-query of BURIDATA.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBuriDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBuriDataCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BURIDATA";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {PK, NotNull, NUMBER(18)}
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
     * DATAID: {PK, NotNull, NUMBER(18)}
     * @param dataId The value of dataId as greaterThan.
     */
    public void setDataId_GreaterThan(Long dataId) {
        regDataId(CK_GT, dataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {PK, NotNull, NUMBER(18)}
     * @param dataId The value of dataId as lessThan.
     */
    public void setDataId_LessThan(Long dataId) {
        regDataId(CK_LT, dataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {PK, NotNull, NUMBER(18)}
     * @param dataId The value of dataId as greaterEqual.
     */
    public void setDataId_GreaterEqual(Long dataId) {
        regDataId(CK_GE, dataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {PK, NotNull, NUMBER(18)}
     * @param dataId The value of dataId as lessEqual.
     */
    public void setDataId_LessEqual(Long dataId) {
        regDataId(CK_LE, dataId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {PK, NotNull, NUMBER(18)}
     * @param minNumber The min number of dataId. (NullAllowed)
     * @param maxNumber The max number of dataId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDataId(), "DATAID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DATAID: {PK, NotNull, NUMBER(18)}
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
     * DATAID: {PK, NotNull, NUMBER(18)}
     * @param dataIdList The collection of dataId as notInScope.
     */
    public void setDataId_NotInScope(Collection<Long> dataIdList) {
        doSetDataId_NotInScope(dataIdList);
    }

    protected void doSetDataId_NotInScope(Collection<Long> dataIdList) {
        regINS(CK_NINS, cTL(dataIdList), getCValueDataId(), "DATAID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select DATAID from BURISTATE where ...)} <br />
     * BURISTATE by your DATAID, named 'buriStateAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsBuriStateList</span>(new SubQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriDataCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BuriStateList for 'exists'. (NotNull)
     */
    public void existsBuriStateList(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepDataId_ExistsReferrer_BuriStateList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "DATAID", "DATAID", subQueryPropertyName, "buriStateList");
    }
    public abstract String keepDataId_ExistsReferrer_BuriStateList(BuriStateCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select DATAID from BURIBRANCH where ...)} <br />
     * BURIBRANCH by your DATAID, named 'buriBranchAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsBuriBranchList</span>(new SubQuery&lt;BuriBranchCB&gt;() {
     *     public void query(BuriDataCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BuriBranchList for 'exists'. (NotNull)
     */
    public void existsBuriBranchList(SubQuery<BuriBranchCB> subQuery) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepDataId_ExistsReferrer_BuriBranchList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "DATAID", "DATAID", subQueryPropertyName, "buriBranchList");
    }
    public abstract String keepDataId_ExistsReferrer_BuriBranchList(BuriBranchCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select DATAID from BURISTATE where ...)} <br />
     * BURISTATE by your DATAID, named 'buriStateAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsBuriStateList</span>(new SubQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriDataCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of DataId_NotExistsReferrer_BuriStateList for 'not exists'. (NotNull)
     */
    public void notExistsBuriStateList(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepDataId_NotExistsReferrer_BuriStateList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "DATAID", "DATAID", subQueryPropertyName, "buriStateList");
    }
    public abstract String keepDataId_NotExistsReferrer_BuriStateList(BuriStateCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select DATAID from BURIBRANCH where ...)} <br />
     * BURIBRANCH by your DATAID, named 'buriBranchAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsBuriBranchList</span>(new SubQuery&lt;BuriBranchCB&gt;() {
     *     public void query(BuriDataCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of DataId_NotExistsReferrer_BuriBranchList for 'not exists'. (NotNull)
     */
    public void notExistsBuriBranchList(SubQuery<BuriBranchCB> subQuery) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepDataId_NotExistsReferrer_BuriBranchList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "DATAID", "DATAID", subQueryPropertyName, "buriBranchList");
    }
    public abstract String keepDataId_NotExistsReferrer_BuriBranchList(BuriBranchCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DATAID from BURISTATE where ...)} <br />
     * BURISTATE by your DATAID, named 'buriStateAsOne'.
     * @param subQuery The sub-query of BuriStateList for 'in-scope'. (NotNull)
     */
    public void inScopeBuriStateList(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepDataId_InScopeRelation_BuriStateList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "DATAID", "DATAID", subQueryPropertyName, "buriStateList");
    }
    public abstract String keepDataId_InScopeRelation_BuriStateList(BuriStateCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DATAID from BURIBRANCH where ...)} <br />
     * BURIBRANCH by your DATAID, named 'buriBranchAsOne'.
     * @param subQuery The sub-query of BuriBranchList for 'in-scope'. (NotNull)
     */
    public void inScopeBuriBranchList(SubQuery<BuriBranchCB> subQuery) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepDataId_InScopeRelation_BuriBranchList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "DATAID", "DATAID", subQueryPropertyName, "buriBranchList");
    }
    public abstract String keepDataId_InScopeRelation_BuriBranchList(BuriBranchCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DATAID from BURISTATE where ...)} <br />
     * BURISTATE by your DATAID, named 'buriStateAsOne'.
     * @param subQuery The sub-query of BuriStateList for 'not in-scope'. (NotNull)
     */
    public void notInScopeBuriStateList(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepDataId_NotInScopeRelation_BuriStateList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "DATAID", "DATAID", subQueryPropertyName, "buriStateList");
    }
    public abstract String keepDataId_NotInScopeRelation_BuriStateList(BuriStateCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DATAID from BURIBRANCH where ...)} <br />
     * BURIBRANCH by your DATAID, named 'buriBranchAsOne'.
     * @param subQuery The sub-query of BuriBranchList for 'not in-scope'. (NotNull)
     */
    public void notInScopeBuriBranchList(SubQuery<BuriBranchCB> subQuery) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepDataId_NotInScopeRelation_BuriBranchList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "DATAID", "DATAID", subQueryPropertyName, "buriBranchList");
    }
    public abstract String keepDataId_NotInScopeRelation_BuriBranchList(BuriBranchCQ subQuery);

    public void xsderiveBuriStateList(String function, SubQuery<BuriStateCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepDataId_SpecifyDerivedReferrer_BuriStateList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "DATAID", "DATAID", subQueryPropertyName, "buriStateList", aliasName, option);
    }
    public abstract String keepDataId_SpecifyDerivedReferrer_BuriStateList(BuriStateCQ subQuery);

    public void xsderiveBuriBranchList(String function, SubQuery<BuriBranchCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepDataId_SpecifyDerivedReferrer_BuriBranchList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "DATAID", "DATAID", subQueryPropertyName, "buriBranchList", aliasName, option);
    }
    public abstract String keepDataId_SpecifyDerivedReferrer_BuriBranchList(BuriBranchCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from BURISTATE where ...)} <br />
     * BURISTATE by your DATAID, named 'buriStateAsOne'.
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
        String subQueryPropertyName = keepDataId_QueryDerivedReferrer_BuriStateList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepDataId_QueryDerivedReferrer_BuriStateListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "DATAID", "DATAID", subQueryPropertyName, "buriStateList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepDataId_QueryDerivedReferrer_BuriStateList(BuriStateCQ subQuery);
    public abstract String keepDataId_QueryDerivedReferrer_BuriStateListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from BURIBRANCH where ...)} <br />
     * BURIBRANCH by your DATAID, named 'buriBranchAsOne'.
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
    public HpQDRFunction<BuriBranchCB> derivedBuriBranchList() {
        return xcreateQDRFunctionBuriBranchList();
    }
    protected HpQDRFunction<BuriBranchCB> xcreateQDRFunctionBuriBranchList() {
        return new HpQDRFunction<BuriBranchCB>(new HpQDRSetupper<BuriBranchCB>() {
            public void setup(String function, SubQuery<BuriBranchCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveBuriBranchList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveBuriBranchList(String function, SubQuery<BuriBranchCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepDataId_QueryDerivedReferrer_BuriBranchList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepDataId_QueryDerivedReferrer_BuriBranchListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "DATAID", "DATAID", subQueryPropertyName, "buriBranchList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepDataId_QueryDerivedReferrer_BuriBranchList(BuriBranchCQ subQuery);
    public abstract String keepDataId_QueryDerivedReferrer_BuriBranchListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * DATAID: {PK, NotNull, NUMBER(18)}
     */
    public void setDataId_IsNull() { regDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * DATAID: {PK, NotNull, NUMBER(18)}
     */
    public void setDataId_IsNotNull() { regDataId(CK_ISNN, DOBJ); }

    protected void regDataId(ConditionKey k, Object v) { regQ(k, v, getCValueDataId(), "DATAID"); }
    abstract protected ConditionValue getCValueDataId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PKEYVAL: {IX, VARCHAR2(250)}
     * @param pkeyVal The value of pkeyVal as equal.
     */
    public void setPkeyVal_Equal(String pkeyVal) {
        doSetPkeyVal_Equal(fRES(pkeyVal));
    }

    protected void doSetPkeyVal_Equal(String pkeyVal) {
        regPkeyVal(CK_EQ, pkeyVal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PKEYVAL: {IX, VARCHAR2(250)}
     * @param pkeyVal The value of pkeyVal as notEqual.
     */
    public void setPkeyVal_NotEqual(String pkeyVal) {
        doSetPkeyVal_NotEqual(fRES(pkeyVal));
    }

    protected void doSetPkeyVal_NotEqual(String pkeyVal) {
        regPkeyVal(CK_NES, pkeyVal);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PKEYVAL: {IX, VARCHAR2(250)}
     * @param pkeyValList The collection of pkeyVal as inScope.
     */
    public void setPkeyVal_InScope(Collection<String> pkeyValList) {
        doSetPkeyVal_InScope(pkeyValList);
    }

    public void doSetPkeyVal_InScope(Collection<String> pkeyValList) {
        regINS(CK_INS, cTL(pkeyValList), getCValuePkeyVal(), "PKEYVAL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PKEYVAL: {IX, VARCHAR2(250)}
     * @param pkeyValList The collection of pkeyVal as notInScope.
     */
    public void setPkeyVal_NotInScope(Collection<String> pkeyValList) {
        doSetPkeyVal_NotInScope(pkeyValList);
    }

    public void doSetPkeyVal_NotInScope(Collection<String> pkeyValList) {
        regINS(CK_NINS, cTL(pkeyValList), getCValuePkeyVal(), "PKEYVAL");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PKEYVAL: {IX, VARCHAR2(250)}
     * @param pkeyVal The value of pkeyVal as prefixSearch.
     */
    public void setPkeyVal_PrefixSearch(String pkeyVal) {
        setPkeyVal_LikeSearch(pkeyVal, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PKEYVAL: {IX, VARCHAR2(250)}
     * @param pkeyVal The value of pkeyVal as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPkeyVal_LikeSearch(String pkeyVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pkeyVal), getCValuePkeyVal(), "PKEYVAL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PKEYVAL: {IX, VARCHAR2(250)}
     * @param pkeyVal The value of pkeyVal as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPkeyVal_NotLikeSearch(String pkeyVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pkeyVal), getCValuePkeyVal(), "PKEYVAL", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PKEYVAL: {IX, VARCHAR2(250)}
     */
    public void setPkeyVal_IsNull() { regPkeyVal(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * PKEYVAL: {IX, VARCHAR2(250)}
     */
    public void setPkeyVal_IsNullOrEmpty() { regPkeyVal(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PKEYVAL: {IX, VARCHAR2(250)}
     */
    public void setPkeyVal_IsNotNull() { regPkeyVal(CK_ISNN, DOBJ); }

    protected void regPkeyVal(ConditionKey k, Object v) { regQ(k, v, getCValuePkeyVal(), "PKEYVAL"); }
    abstract protected ConditionValue getCValuePkeyVal();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PKEYNUM: {IX, NUMBER(18)}
     * @param pkeyNum The value of pkeyNum as equal.
     */
    public void setPkeyNum_Equal(Long pkeyNum) {
        doSetPkeyNum_Equal(pkeyNum);
    }

    protected void doSetPkeyNum_Equal(Long pkeyNum) {
        regPkeyNum(CK_EQ, pkeyNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PKEYNUM: {IX, NUMBER(18)}
     * @param pkeyNum The value of pkeyNum as greaterThan.
     */
    public void setPkeyNum_GreaterThan(Long pkeyNum) {
        regPkeyNum(CK_GT, pkeyNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PKEYNUM: {IX, NUMBER(18)}
     * @param pkeyNum The value of pkeyNum as lessThan.
     */
    public void setPkeyNum_LessThan(Long pkeyNum) {
        regPkeyNum(CK_LT, pkeyNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PKEYNUM: {IX, NUMBER(18)}
     * @param pkeyNum The value of pkeyNum as greaterEqual.
     */
    public void setPkeyNum_GreaterEqual(Long pkeyNum) {
        regPkeyNum(CK_GE, pkeyNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PKEYNUM: {IX, NUMBER(18)}
     * @param pkeyNum The value of pkeyNum as lessEqual.
     */
    public void setPkeyNum_LessEqual(Long pkeyNum) {
        regPkeyNum(CK_LE, pkeyNum);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PKEYNUM: {IX, NUMBER(18)}
     * @param minNumber The min number of pkeyNum. (NullAllowed)
     * @param maxNumber The max number of pkeyNum. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPkeyNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePkeyNum(), "PKEYNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PKEYNUM: {IX, NUMBER(18)}
     * @param pkeyNumList The collection of pkeyNum as inScope.
     */
    public void setPkeyNum_InScope(Collection<Long> pkeyNumList) {
        doSetPkeyNum_InScope(pkeyNumList);
    }

    protected void doSetPkeyNum_InScope(Collection<Long> pkeyNumList) {
        regINS(CK_INS, cTL(pkeyNumList), getCValuePkeyNum(), "PKEYNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PKEYNUM: {IX, NUMBER(18)}
     * @param pkeyNumList The collection of pkeyNum as notInScope.
     */
    public void setPkeyNum_NotInScope(Collection<Long> pkeyNumList) {
        doSetPkeyNum_NotInScope(pkeyNumList);
    }

    protected void doSetPkeyNum_NotInScope(Collection<Long> pkeyNumList) {
        regINS(CK_NINS, cTL(pkeyNumList), getCValuePkeyNum(), "PKEYNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PKEYNUM: {IX, NUMBER(18)}
     */
    public void setPkeyNum_IsNull() { regPkeyNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PKEYNUM: {IX, NUMBER(18)}
     */
    public void setPkeyNum_IsNotNull() { regPkeyNum(CK_ISNN, DOBJ); }

    protected void regPkeyNum(ConditionKey k, Object v) { regQ(k, v, getCValuePkeyNum(), "PKEYNUM"); }
    abstract protected ConditionValue getCValuePkeyNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DATATYPE: {IX+, NotNull, VARCHAR2(200)}
     * @param dataType The value of dataType as equal.
     */
    public void setDataType_Equal(String dataType) {
        doSetDataType_Equal(fRES(dataType));
    }

    protected void doSetDataType_Equal(String dataType) {
        regDataType(CK_EQ, dataType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DATATYPE: {IX+, NotNull, VARCHAR2(200)}
     * @param dataType The value of dataType as notEqual.
     */
    public void setDataType_NotEqual(String dataType) {
        doSetDataType_NotEqual(fRES(dataType));
    }

    protected void doSetDataType_NotEqual(String dataType) {
        regDataType(CK_NES, dataType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DATATYPE: {IX+, NotNull, VARCHAR2(200)}
     * @param dataTypeList The collection of dataType as inScope.
     */
    public void setDataType_InScope(Collection<String> dataTypeList) {
        doSetDataType_InScope(dataTypeList);
    }

    public void doSetDataType_InScope(Collection<String> dataTypeList) {
        regINS(CK_INS, cTL(dataTypeList), getCValueDataType(), "DATATYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * DATATYPE: {IX+, NotNull, VARCHAR2(200)}
     * @param dataTypeList The collection of dataType as notInScope.
     */
    public void setDataType_NotInScope(Collection<String> dataTypeList) {
        doSetDataType_NotInScope(dataTypeList);
    }

    public void doSetDataType_NotInScope(Collection<String> dataTypeList) {
        regINS(CK_NINS, cTL(dataTypeList), getCValueDataType(), "DATATYPE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DATATYPE: {IX+, NotNull, VARCHAR2(200)}
     * @param dataType The value of dataType as prefixSearch.
     */
    public void setDataType_PrefixSearch(String dataType) {
        setDataType_LikeSearch(dataType, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DATATYPE: {IX+, NotNull, VARCHAR2(200)}
     * @param dataType The value of dataType as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataType_LikeSearch(String dataType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataType), getCValueDataType(), "DATATYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DATATYPE: {IX+, NotNull, VARCHAR2(200)}
     * @param dataType The value of dataType as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataType_NotLikeSearch(String dataType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataType), getCValueDataType(), "DATATYPE", likeSearchOption);
    }

    protected void regDataType(ConditionKey k, Object v) { regQ(k, v, getCValueDataType(), "DATATYPE"); }
    abstract protected ConditionValue getCValueDataType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TABLENAME: {VARCHAR2(200)}
     * @param tableName The value of tableName as equal.
     */
    public void setTableName_Equal(String tableName) {
        doSetTableName_Equal(fRES(tableName));
    }

    protected void doSetTableName_Equal(String tableName) {
        regTableName(CK_EQ, tableName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TABLENAME: {VARCHAR2(200)}
     * @param tableName The value of tableName as notEqual.
     */
    public void setTableName_NotEqual(String tableName) {
        doSetTableName_NotEqual(fRES(tableName));
    }

    protected void doSetTableName_NotEqual(String tableName) {
        regTableName(CK_NES, tableName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TABLENAME: {VARCHAR2(200)}
     * @param tableNameList The collection of tableName as inScope.
     */
    public void setTableName_InScope(Collection<String> tableNameList) {
        doSetTableName_InScope(tableNameList);
    }

    public void doSetTableName_InScope(Collection<String> tableNameList) {
        regINS(CK_INS, cTL(tableNameList), getCValueTableName(), "TABLENAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TABLENAME: {VARCHAR2(200)}
     * @param tableNameList The collection of tableName as notInScope.
     */
    public void setTableName_NotInScope(Collection<String> tableNameList) {
        doSetTableName_NotInScope(tableNameList);
    }

    public void doSetTableName_NotInScope(Collection<String> tableNameList) {
        regINS(CK_NINS, cTL(tableNameList), getCValueTableName(), "TABLENAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TABLENAME: {VARCHAR2(200)}
     * @param tableName The value of tableName as prefixSearch.
     */
    public void setTableName_PrefixSearch(String tableName) {
        setTableName_LikeSearch(tableName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TABLENAME: {VARCHAR2(200)}
     * @param tableName The value of tableName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTableName_LikeSearch(String tableName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tableName), getCValueTableName(), "TABLENAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TABLENAME: {VARCHAR2(200)}
     * @param tableName The value of tableName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTableName_NotLikeSearch(String tableName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tableName), getCValueTableName(), "TABLENAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TABLENAME: {VARCHAR2(200)}
     */
    public void setTableName_IsNull() { regTableName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TABLENAME: {VARCHAR2(200)}
     */
    public void setTableName_IsNullOrEmpty() { regTableName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TABLENAME: {VARCHAR2(200)}
     */
    public void setTableName_IsNotNull() { regTableName(CK_ISNN, DOBJ); }

    protected void regTableName(ConditionKey k, Object v) { regQ(k, v, getCValueTableName(), "TABLENAME"); }
    abstract protected ConditionValue getCValueTableName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INSERTUSERID: {IX, NUMBER(18)}
     * @param insertUserId The value of insertUserId as equal.
     */
    public void setInsertUserId_Equal(Long insertUserId) {
        doSetInsertUserId_Equal(insertUserId);
    }

    protected void doSetInsertUserId_Equal(Long insertUserId) {
        regInsertUserId(CK_EQ, insertUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INSERTUSERID: {IX, NUMBER(18)}
     * @param insertUserId The value of insertUserId as greaterThan.
     */
    public void setInsertUserId_GreaterThan(Long insertUserId) {
        regInsertUserId(CK_GT, insertUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INSERTUSERID: {IX, NUMBER(18)}
     * @param insertUserId The value of insertUserId as lessThan.
     */
    public void setInsertUserId_LessThan(Long insertUserId) {
        regInsertUserId(CK_LT, insertUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INSERTUSERID: {IX, NUMBER(18)}
     * @param insertUserId The value of insertUserId as greaterEqual.
     */
    public void setInsertUserId_GreaterEqual(Long insertUserId) {
        regInsertUserId(CK_GE, insertUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INSERTUSERID: {IX, NUMBER(18)}
     * @param insertUserId The value of insertUserId as lessEqual.
     */
    public void setInsertUserId_LessEqual(Long insertUserId) {
        regInsertUserId(CK_LE, insertUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INSERTUSERID: {IX, NUMBER(18)}
     * @param minNumber The min number of insertUserId. (NullAllowed)
     * @param maxNumber The max number of insertUserId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInsertUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueInsertUserId(), "INSERTUSERID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INSERTUSERID: {IX, NUMBER(18)}
     * @param insertUserIdList The collection of insertUserId as inScope.
     */
    public void setInsertUserId_InScope(Collection<Long> insertUserIdList) {
        doSetInsertUserId_InScope(insertUserIdList);
    }

    protected void doSetInsertUserId_InScope(Collection<Long> insertUserIdList) {
        regINS(CK_INS, cTL(insertUserIdList), getCValueInsertUserId(), "INSERTUSERID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INSERTUSERID: {IX, NUMBER(18)}
     * @param insertUserIdList The collection of insertUserId as notInScope.
     */
    public void setInsertUserId_NotInScope(Collection<Long> insertUserIdList) {
        doSetInsertUserId_NotInScope(insertUserIdList);
    }

    protected void doSetInsertUserId_NotInScope(Collection<Long> insertUserIdList) {
        regINS(CK_NINS, cTL(insertUserIdList), getCValueInsertUserId(), "INSERTUSERID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * INSERTUSERID: {IX, NUMBER(18)}
     */
    public void setInsertUserId_IsNull() { regInsertUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * INSERTUSERID: {IX, NUMBER(18)}
     */
    public void setInsertUserId_IsNotNull() { regInsertUserId(CK_ISNN, DOBJ); }

    protected void regInsertUserId(ConditionKey k, Object v) { regQ(k, v, getCValueInsertUserId(), "INSERTUSERID"); }
    abstract protected ConditionValue getCValueInsertUserId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;BuriDataCB&gt;() {
     *     public void query(BuriDataCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriDataCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;BuriDataCB&gt;() {
     *     public void query(BuriDataCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriDataCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;BuriDataCB&gt;() {
     *     public void query(BuriDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriDataCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;BuriDataCB&gt;() {
     *     public void query(BuriDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriDataCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;BuriDataCB&gt;() {
     *     public void query(BuriDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriDataCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BuriDataCB&gt;() {
     *     public void query(BuriDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriDataCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<BuriDataCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<BuriDataCB>(new HpSSQSetupper<BuriDataCB>() {
            public void setup(String function, SubQuery<BuriDataCB> subQuery, HpSSQOption<BuriDataCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<BuriDataCB> subQuery, String operand, HpSSQOption<BuriDataCB> option) {
        assertObjectNotNull("subQuery<BuriDataCB>", subQuery);
        BuriDataCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(BuriDataCQ subQuery);

    protected BuriDataCB xcreateScalarConditionCB() {
        BuriDataCB cb = new BuriDataCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected BuriDataCB xcreateScalarConditionPartitionByCB() {
        BuriDataCB cb = new BuriDataCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<BuriDataCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriDataCB>", subQuery);
        BuriDataCB cb = new BuriDataCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "DATAID", "DATAID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(BuriDataCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BuriDataCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<BuriDataCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<BuriDataCB>(new HpQDRSetupper<BuriDataCB>() {
            public void setup(String function, SubQuery<BuriDataCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<BuriDataCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriDataCB>", subQuery);
        BuriDataCB cb = new BuriDataCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "DATAID", "DATAID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(BuriDataCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<BuriDataCB> subQuery) {
        assertObjectNotNull("subQuery<BuriDataCB>", subQuery);
        BuriDataCB cb = new BuriDataCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(BuriDataCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<BuriDataCB> subQuery) {
        assertObjectNotNull("subQuery<BuriDataCB>", subQuery);
        BuriDataCB cb = new BuriDataCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(BuriDataCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return BuriDataCB.class.getName(); }
    protected String xabCQ() { return BuriDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}

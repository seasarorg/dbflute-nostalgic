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
 * The abstract condition-query of BURIPATH.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBuriPathCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBuriPathCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BURIPATH";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {PK, NotNull, NUMBER(18)}
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
     * PATHID: {PK, NotNull, NUMBER(18)}
     * @param pathId The value of pathId as greaterThan.
     */
    public void setPathId_GreaterThan(Long pathId) {
        regPathId(CK_GT, pathId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {PK, NotNull, NUMBER(18)}
     * @param pathId The value of pathId as lessThan.
     */
    public void setPathId_LessThan(Long pathId) {
        regPathId(CK_LT, pathId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {PK, NotNull, NUMBER(18)}
     * @param pathId The value of pathId as greaterEqual.
     */
    public void setPathId_GreaterEqual(Long pathId) {
        regPathId(CK_GE, pathId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {PK, NotNull, NUMBER(18)}
     * @param pathId The value of pathId as lessEqual.
     */
    public void setPathId_LessEqual(Long pathId) {
        regPathId(CK_LE, pathId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {PK, NotNull, NUMBER(18)}
     * @param minNumber The min number of pathId. (NullAllowed)
     * @param maxNumber The max number of pathId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPathId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePathId(), "PATHID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PATHID: {PK, NotNull, NUMBER(18)}
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
     * PATHID: {PK, NotNull, NUMBER(18)}
     * @param pathIdList The collection of pathId as notInScope.
     */
    public void setPathId_NotInScope(Collection<Long> pathIdList) {
        doSetPathId_NotInScope(pathIdList);
    }

    protected void doSetPathId_NotInScope(Collection<Long> pathIdList) {
        regINS(CK_NINS, cTL(pathIdList), getCValuePathId(), "PATHID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select PATHID from BURISTATE where ...)} <br />
     * BURISTATE by your PATHID, named 'buriStateAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsBuriStateList</span>(new SubQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriPathCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BuriStateList for 'exists'. (NotNull)
     */
    public void existsBuriStateList(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepPathId_ExistsReferrer_BuriStateList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "PATHID", "PATHID", subQueryPropertyName, "buriStateList");
    }
    public abstract String keepPathId_ExistsReferrer_BuriStateList(BuriStateCQ subQuery);

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select PATHID from BURIBRANCH where ...)} <br />
     * BURIBRANCH by your PATHID, named 'buriBranchAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsBuriBranchList</span>(new SubQuery&lt;BuriBranchCB&gt;() {
     *     public void query(BuriPathCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BuriBranchList for 'exists'. (NotNull)
     */
    public void existsBuriBranchList(SubQuery<BuriBranchCB> subQuery) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepPathId_ExistsReferrer_BuriBranchList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "PATHID", "PATHID", subQueryPropertyName, "buriBranchList");
    }
    public abstract String keepPathId_ExistsReferrer_BuriBranchList(BuriBranchCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select PATHID from BURISTATE where ...)} <br />
     * BURISTATE by your PATHID, named 'buriStateAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsBuriStateList</span>(new SubQuery&lt;BuriStateCB&gt;() {
     *     public void query(BuriPathCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of PathId_NotExistsReferrer_BuriStateList for 'not exists'. (NotNull)
     */
    public void notExistsBuriStateList(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepPathId_NotExistsReferrer_BuriStateList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "PATHID", "PATHID", subQueryPropertyName, "buriStateList");
    }
    public abstract String keepPathId_NotExistsReferrer_BuriStateList(BuriStateCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select PATHID from BURIBRANCH where ...)} <br />
     * BURIBRANCH by your PATHID, named 'buriBranchAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsBuriBranchList</span>(new SubQuery&lt;BuriBranchCB&gt;() {
     *     public void query(BuriPathCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of PathId_NotExistsReferrer_BuriBranchList for 'not exists'. (NotNull)
     */
    public void notExistsBuriBranchList(SubQuery<BuriBranchCB> subQuery) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepPathId_NotExistsReferrer_BuriBranchList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "PATHID", "PATHID", subQueryPropertyName, "buriBranchList");
    }
    public abstract String keepPathId_NotExistsReferrer_BuriBranchList(BuriBranchCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PATHID from BURISTATE where ...)} <br />
     * BURISTATE by your PATHID, named 'buriStateAsOne'.
     * @param subQuery The sub-query of BuriStateList for 'in-scope'. (NotNull)
     */
    public void inScopeBuriStateList(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepPathId_InScopeRelation_BuriStateList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PATHID", "PATHID", subQueryPropertyName, "buriStateList");
    }
    public abstract String keepPathId_InScopeRelation_BuriStateList(BuriStateCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PATHID from BURIBRANCH where ...)} <br />
     * BURIBRANCH by your PATHID, named 'buriBranchAsOne'.
     * @param subQuery The sub-query of BuriBranchList for 'in-scope'. (NotNull)
     */
    public void inScopeBuriBranchList(SubQuery<BuriBranchCB> subQuery) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepPathId_InScopeRelation_BuriBranchList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "PATHID", "PATHID", subQueryPropertyName, "buriBranchList");
    }
    public abstract String keepPathId_InScopeRelation_BuriBranchList(BuriBranchCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PATHID from BURISTATE where ...)} <br />
     * BURISTATE by your PATHID, named 'buriStateAsOne'.
     * @param subQuery The sub-query of BuriStateList for 'not in-scope'. (NotNull)
     */
    public void notInScopeBuriStateList(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepPathId_NotInScopeRelation_BuriStateList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PATHID", "PATHID", subQueryPropertyName, "buriStateList");
    }
    public abstract String keepPathId_NotInScopeRelation_BuriStateList(BuriStateCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PATHID from BURIBRANCH where ...)} <br />
     * BURIBRANCH by your PATHID, named 'buriBranchAsOne'.
     * @param subQuery The sub-query of BuriBranchList for 'not in-scope'. (NotNull)
     */
    public void notInScopeBuriBranchList(SubQuery<BuriBranchCB> subQuery) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepPathId_NotInScopeRelation_BuriBranchList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "PATHID", "PATHID", subQueryPropertyName, "buriBranchList");
    }
    public abstract String keepPathId_NotInScopeRelation_BuriBranchList(BuriBranchCQ subQuery);

    public void xsderiveBuriStateList(String function, SubQuery<BuriStateCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepPathId_SpecifyDerivedReferrer_BuriStateList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "PATHID", "PATHID", subQueryPropertyName, "buriStateList", aliasName, option);
    }
    public abstract String keepPathId_SpecifyDerivedReferrer_BuriStateList(BuriStateCQ subQuery);

    public void xsderiveBuriBranchList(String function, SubQuery<BuriBranchCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriBranchCB>", subQuery);
        BuriBranchCB cb = new BuriBranchCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepPathId_SpecifyDerivedReferrer_BuriBranchList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "PATHID", "PATHID", subQueryPropertyName, "buriBranchList", aliasName, option);
    }
    public abstract String keepPathId_SpecifyDerivedReferrer_BuriBranchList(BuriBranchCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from BURISTATE where ...)} <br />
     * BURISTATE by your PATHID, named 'buriStateAsOne'.
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
        String subQueryPropertyName = keepPathId_QueryDerivedReferrer_BuriStateList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepPathId_QueryDerivedReferrer_BuriStateListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "PATHID", "PATHID", subQueryPropertyName, "buriStateList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepPathId_QueryDerivedReferrer_BuriStateList(BuriStateCQ subQuery);
    public abstract String keepPathId_QueryDerivedReferrer_BuriStateListParameter(Object parameterValue);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from BURIBRANCH where ...)} <br />
     * BURIBRANCH by your PATHID, named 'buriBranchAsOne'.
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
        String subQueryPropertyName = keepPathId_QueryDerivedReferrer_BuriBranchList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepPathId_QueryDerivedReferrer_BuriBranchListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "PATHID", "PATHID", subQueryPropertyName, "buriBranchList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepPathId_QueryDerivedReferrer_BuriBranchList(BuriBranchCQ subQuery);
    public abstract String keepPathId_QueryDerivedReferrer_BuriBranchListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PATHID: {PK, NotNull, NUMBER(18)}
     */
    public void setPathId_IsNull() { regPathId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PATHID: {PK, NotNull, NUMBER(18)}
     */
    public void setPathId_IsNotNull() { regPathId(CK_ISNN, DOBJ); }

    protected void regPathId(ConditionKey k, Object v) { regQ(k, v, getCValuePathId(), "PATHID"); }
    abstract protected ConditionValue getCValuePathId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @param pathName The value of pathName as equal.
     */
    public void setPathName_Equal(String pathName) {
        doSetPathName_Equal(fRES(pathName));
    }

    protected void doSetPathName_Equal(String pathName) {
        regPathName(CK_EQ, pathName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @param pathName The value of pathName as notEqual.
     */
    public void setPathName_NotEqual(String pathName) {
        doSetPathName_NotEqual(fRES(pathName));
    }

    protected void doSetPathName_NotEqual(String pathName) {
        regPathName(CK_NES, pathName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @param pathNameList The collection of pathName as inScope.
     */
    public void setPathName_InScope(Collection<String> pathNameList) {
        doSetPathName_InScope(pathNameList);
    }

    public void doSetPathName_InScope(Collection<String> pathNameList) {
        regINS(CK_INS, cTL(pathNameList), getCValuePathName(), "PATHNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @param pathNameList The collection of pathName as notInScope.
     */
    public void setPathName_NotInScope(Collection<String> pathNameList) {
        doSetPathName_NotInScope(pathNameList);
    }

    public void doSetPathName_NotInScope(Collection<String> pathNameList) {
        regINS(CK_NINS, cTL(pathNameList), getCValuePathName(), "PATHNAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @param pathName The value of pathName as prefixSearch.
     */
    public void setPathName_PrefixSearch(String pathName) {
        setPathName_LikeSearch(pathName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @param pathName The value of pathName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPathName_LikeSearch(String pathName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pathName), getCValuePathName(), "PATHNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @param pathName The value of pathName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPathName_NotLikeSearch(String pathName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pathName), getCValuePathName(), "PATHNAME", likeSearchOption);
    }

    protected void regPathName(ConditionKey k, Object v) { regQ(k, v, getCValuePathName(), "PATHNAME"); }
    abstract protected ConditionValue getCValuePathName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REALPATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @param realPathName The value of realPathName as equal.
     */
    public void setRealPathName_Equal(String realPathName) {
        doSetRealPathName_Equal(fRES(realPathName));
    }

    protected void doSetRealPathName_Equal(String realPathName) {
        regRealPathName(CK_EQ, realPathName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REALPATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @param realPathName The value of realPathName as notEqual.
     */
    public void setRealPathName_NotEqual(String realPathName) {
        doSetRealPathName_NotEqual(fRES(realPathName));
    }

    protected void doSetRealPathName_NotEqual(String realPathName) {
        regRealPathName(CK_NES, realPathName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REALPATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @param realPathNameList The collection of realPathName as inScope.
     */
    public void setRealPathName_InScope(Collection<String> realPathNameList) {
        doSetRealPathName_InScope(realPathNameList);
    }

    public void doSetRealPathName_InScope(Collection<String> realPathNameList) {
        regINS(CK_INS, cTL(realPathNameList), getCValueRealPathName(), "REALPATHNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REALPATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @param realPathNameList The collection of realPathName as notInScope.
     */
    public void setRealPathName_NotInScope(Collection<String> realPathNameList) {
        doSetRealPathName_NotInScope(realPathNameList);
    }

    public void doSetRealPathName_NotInScope(Collection<String> realPathNameList) {
        regINS(CK_NINS, cTL(realPathNameList), getCValueRealPathName(), "REALPATHNAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REALPATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @param realPathName The value of realPathName as prefixSearch.
     */
    public void setRealPathName_PrefixSearch(String realPathName) {
        setRealPathName_LikeSearch(realPathName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REALPATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @param realPathName The value of realPathName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRealPathName_LikeSearch(String realPathName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(realPathName), getCValueRealPathName(), "REALPATHNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REALPATHNAME: {IX, NotNull, VARCHAR2(100)}
     * @param realPathName The value of realPathName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRealPathName_NotLikeSearch(String realPathName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(realPathName), getCValueRealPathName(), "REALPATHNAME", likeSearchOption);
    }

    protected void regRealPathName(ConditionKey k, Object v) { regQ(k, v, getCValueRealPathName(), "REALPATHNAME"); }
    abstract protected ConditionValue getCValueRealPathName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHTYPE: {IX, NUMBER(22)}
     * @param pathType The value of pathType as equal.
     */
    public void setPathType_Equal(java.math.BigDecimal pathType) {
        doSetPathType_Equal(pathType);
    }

    protected void doSetPathType_Equal(java.math.BigDecimal pathType) {
        regPathType(CK_EQ, pathType);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHTYPE: {IX, NUMBER(22)}
     * @param pathType The value of pathType as greaterThan.
     */
    public void setPathType_GreaterThan(java.math.BigDecimal pathType) {
        regPathType(CK_GT, pathType);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHTYPE: {IX, NUMBER(22)}
     * @param pathType The value of pathType as lessThan.
     */
    public void setPathType_LessThan(java.math.BigDecimal pathType) {
        regPathType(CK_LT, pathType);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHTYPE: {IX, NUMBER(22)}
     * @param pathType The value of pathType as greaterEqual.
     */
    public void setPathType_GreaterEqual(java.math.BigDecimal pathType) {
        regPathType(CK_GE, pathType);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHTYPE: {IX, NUMBER(22)}
     * @param pathType The value of pathType as lessEqual.
     */
    public void setPathType_LessEqual(java.math.BigDecimal pathType) {
        regPathType(CK_LE, pathType);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PATHTYPE: {IX, NUMBER(22)}
     * @param minNumber The min number of pathType. (NullAllowed)
     * @param maxNumber The max number of pathType. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPathType_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePathType(), "PATHTYPE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PATHTYPE: {IX, NUMBER(22)}
     * @param pathTypeList The collection of pathType as inScope.
     */
    public void setPathType_InScope(Collection<java.math.BigDecimal> pathTypeList) {
        doSetPathType_InScope(pathTypeList);
    }

    protected void doSetPathType_InScope(Collection<java.math.BigDecimal> pathTypeList) {
        regINS(CK_INS, cTL(pathTypeList), getCValuePathType(), "PATHTYPE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PATHTYPE: {IX, NUMBER(22)}
     * @param pathTypeList The collection of pathType as notInScope.
     */
    public void setPathType_NotInScope(Collection<java.math.BigDecimal> pathTypeList) {
        doSetPathType_NotInScope(pathTypeList);
    }

    protected void doSetPathType_NotInScope(Collection<java.math.BigDecimal> pathTypeList) {
        regINS(CK_NINS, cTL(pathTypeList), getCValuePathType(), "PATHTYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PATHTYPE: {IX, NUMBER(22)}
     */
    public void setPathType_IsNull() { regPathType(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PATHTYPE: {IX, NUMBER(22)}
     */
    public void setPathType_IsNotNull() { regPathType(CK_ISNN, DOBJ); }

    protected void regPathType(ConditionKey k, Object v) { regQ(k, v, getCValuePathType(), "PATHTYPE"); }
    abstract protected ConditionValue getCValuePathType();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;BuriPathCB&gt;() {
     *     public void query(BuriPathCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriPathCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;BuriPathCB&gt;() {
     *     public void query(BuriPathCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriPathCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;BuriPathCB&gt;() {
     *     public void query(BuriPathCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriPathCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;BuriPathCB&gt;() {
     *     public void query(BuriPathCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriPathCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;BuriPathCB&gt;() {
     *     public void query(BuriPathCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriPathCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BuriPathCB&gt;() {
     *     public void query(BuriPathCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriPathCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<BuriPathCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<BuriPathCB>(new HpSSQSetupper<BuriPathCB>() {
            public void setup(String function, SubQuery<BuriPathCB> subQuery, HpSSQOption<BuriPathCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<BuriPathCB> subQuery, String operand, HpSSQOption<BuriPathCB> option) {
        assertObjectNotNull("subQuery<BuriPathCB>", subQuery);
        BuriPathCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(BuriPathCQ subQuery);

    protected BuriPathCB xcreateScalarConditionCB() {
        BuriPathCB cb = new BuriPathCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected BuriPathCB xcreateScalarConditionPartitionByCB() {
        BuriPathCB cb = new BuriPathCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<BuriPathCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriPathCB>", subQuery);
        BuriPathCB cb = new BuriPathCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "PATHID", "PATHID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(BuriPathCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BuriPathCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<BuriPathCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<BuriPathCB>(new HpQDRSetupper<BuriPathCB>() {
            public void setup(String function, SubQuery<BuriPathCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<BuriPathCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriPathCB>", subQuery);
        BuriPathCB cb = new BuriPathCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "PATHID", "PATHID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(BuriPathCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<BuriPathCB> subQuery) {
        assertObjectNotNull("subQuery<BuriPathCB>", subQuery);
        BuriPathCB cb = new BuriPathCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(BuriPathCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<BuriPathCB> subQuery) {
        assertObjectNotNull("subQuery<BuriPathCB>", subQuery);
        BuriPathCB cb = new BuriPathCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(BuriPathCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return BuriPathCB.class.getName(); }
    protected String xabCQ() { return BuriPathCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}

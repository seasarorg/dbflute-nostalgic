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
 * The abstract condition-query of BURIUSER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBuriUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBuriUserCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BURIUSER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {PK, NotNull, NUMBER(18)}
     * @param buriUserId The value of buriUserId as equal.
     */
    public void setBuriUserId_Equal(Long buriUserId) {
        doSetBuriUserId_Equal(buriUserId);
    }

    protected void doSetBuriUserId_Equal(Long buriUserId) {
        regBuriUserId(CK_EQ, buriUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {PK, NotNull, NUMBER(18)}
     * @param buriUserId The value of buriUserId as greaterThan.
     */
    public void setBuriUserId_GreaterThan(Long buriUserId) {
        regBuriUserId(CK_GT, buriUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {PK, NotNull, NUMBER(18)}
     * @param buriUserId The value of buriUserId as lessThan.
     */
    public void setBuriUserId_LessThan(Long buriUserId) {
        regBuriUserId(CK_LT, buriUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {PK, NotNull, NUMBER(18)}
     * @param buriUserId The value of buriUserId as greaterEqual.
     */
    public void setBuriUserId_GreaterEqual(Long buriUserId) {
        regBuriUserId(CK_GE, buriUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {PK, NotNull, NUMBER(18)}
     * @param buriUserId The value of buriUserId as lessEqual.
     */
    public void setBuriUserId_LessEqual(Long buriUserId) {
        regBuriUserId(CK_LE, buriUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {PK, NotNull, NUMBER(18)}
     * @param minNumber The min number of buriUserId. (NullAllowed)
     * @param maxNumber The max number of buriUserId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBuriUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBuriUserId(), "BURIUSERID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BURIUSERID: {PK, NotNull, NUMBER(18)}
     * @param buriUserIdList The collection of buriUserId as inScope.
     */
    public void setBuriUserId_InScope(Collection<Long> buriUserIdList) {
        doSetBuriUserId_InScope(buriUserIdList);
    }

    protected void doSetBuriUserId_InScope(Collection<Long> buriUserIdList) {
        regINS(CK_INS, cTL(buriUserIdList), getCValueBuriUserId(), "BURIUSERID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BURIUSERID: {PK, NotNull, NUMBER(18)}
     * @param buriUserIdList The collection of buriUserId as notInScope.
     */
    public void setBuriUserId_NotInScope(Collection<Long> buriUserIdList) {
        doSetBuriUserId_NotInScope(buriUserIdList);
    }

    protected void doSetBuriUserId_NotInScope(Collection<Long> buriUserIdList) {
        regINS(CK_NINS, cTL(buriUserIdList), getCValueBuriUserId(), "BURIUSERID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select BURIUSERID from BURISTATEUSER where ...)} <br />
     * BURISTATEUSER by your BURIUSERID, named 'buriStateUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsBuriStateUserList</span>(new SubQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriUserCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BuriStateUserList for 'exists'. (NotNull)
     */
    public void existsBuriStateUserList(SubQuery<BuriStateUserCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBuriUserId_ExistsReferrer_BuriStateUserList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "BURIUSERID", "BURIUSERID", subQueryPropertyName, "buriStateUserList");
    }
    public abstract String keepBuriUserId_ExistsReferrer_BuriStateUserList(BuriStateUserCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select BURIUSERID from BURISTATEUSER where ...)} <br />
     * BURISTATEUSER by your BURIUSERID, named 'buriStateUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsBuriStateUserList</span>(new SubQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriUserCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BuriUserId_NotExistsReferrer_BuriStateUserList for 'not exists'. (NotNull)
     */
    public void notExistsBuriStateUserList(SubQuery<BuriStateUserCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBuriUserId_NotExistsReferrer_BuriStateUserList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "BURIUSERID", "BURIUSERID", subQueryPropertyName, "buriStateUserList");
    }
    public abstract String keepBuriUserId_NotExistsReferrer_BuriStateUserList(BuriStateUserCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BURIUSERID from BURISTATEUSER where ...)} <br />
     * BURISTATEUSER by your BURIUSERID, named 'buriStateUserAsOne'.
     * @param subQuery The sub-query of BuriStateUserList for 'in-scope'. (NotNull)
     */
    public void inScopeBuriStateUserList(SubQuery<BuriStateUserCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBuriUserId_InScopeRelation_BuriStateUserList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "BURIUSERID", "BURIUSERID", subQueryPropertyName, "buriStateUserList");
    }
    public abstract String keepBuriUserId_InScopeRelation_BuriStateUserList(BuriStateUserCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BURIUSERID from BURISTATEUSER where ...)} <br />
     * BURISTATEUSER by your BURIUSERID, named 'buriStateUserAsOne'.
     * @param subQuery The sub-query of BuriStateUserList for 'not in-scope'. (NotNull)
     */
    public void notInScopeBuriStateUserList(SubQuery<BuriStateUserCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBuriUserId_NotInScopeRelation_BuriStateUserList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "BURIUSERID", "BURIUSERID", subQueryPropertyName, "buriStateUserList");
    }
    public abstract String keepBuriUserId_NotInScopeRelation_BuriStateUserList(BuriStateUserCQ subQuery);

    public void xsderiveBuriStateUserList(String function, SubQuery<BuriStateUserCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepBuriUserId_SpecifyDerivedReferrer_BuriStateUserList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "BURIUSERID", "BURIUSERID", subQueryPropertyName, "buriStateUserList", aliasName, option);
    }
    public abstract String keepBuriUserId_SpecifyDerivedReferrer_BuriStateUserList(BuriStateUserCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from BURISTATEUSER where ...)} <br />
     * BURISTATEUSER by your BURIUSERID, named 'buriStateUserAsOne'.
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
        String subQueryPropertyName = keepBuriUserId_QueryDerivedReferrer_BuriStateUserList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepBuriUserId_QueryDerivedReferrer_BuriStateUserListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "BURIUSERID", "BURIUSERID", subQueryPropertyName, "buriStateUserList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepBuriUserId_QueryDerivedReferrer_BuriStateUserList(BuriStateUserCQ subQuery);
    public abstract String keepBuriUserId_QueryDerivedReferrer_BuriStateUserListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BURIUSERID: {PK, NotNull, NUMBER(18)}
     */
    public void setBuriUserId_IsNull() { regBuriUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BURIUSERID: {PK, NotNull, NUMBER(18)}
     */
    public void setBuriUserId_IsNotNull() { regBuriUserId(CK_ISNN, DOBJ); }

    protected void regBuriUserId(ConditionKey k, Object v) { regQ(k, v, getCValueBuriUserId(), "BURIUSERID"); }
    abstract protected ConditionValue getCValueBuriUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * USERIDVAL: {IX, VARCHAR2(100)}
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
     * USERIDVAL: {IX, VARCHAR2(100)}
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
     * USERIDVAL: {IX, VARCHAR2(100)}
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
     * USERIDVAL: {IX, VARCHAR2(100)}
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
     * USERIDVAL: {IX, VARCHAR2(100)}
     * @param userIdVal The value of userIdVal as prefixSearch.
     */
    public void setUserIdVal_PrefixSearch(String userIdVal) {
        setUserIdVal_LikeSearch(userIdVal, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * USERIDVAL: {IX, VARCHAR2(100)}
     * @param userIdVal The value of userIdVal as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserIdVal_LikeSearch(String userIdVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userIdVal), getCValueUserIdVal(), "USERIDVAL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * USERIDVAL: {IX, VARCHAR2(100)}
     * @param userIdVal The value of userIdVal as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserIdVal_NotLikeSearch(String userIdVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userIdVal), getCValueUserIdVal(), "USERIDVAL", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * USERIDVAL: {IX, VARCHAR2(100)}
     */
    public void setUserIdVal_IsNull() { regUserIdVal(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * USERIDVAL: {IX, VARCHAR2(100)}
     */
    public void setUserIdVal_IsNullOrEmpty() { regUserIdVal(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * USERIDVAL: {IX, VARCHAR2(100)}
     */
    public void setUserIdVal_IsNotNull() { regUserIdVal(CK_ISNN, DOBJ); }

    protected void regUserIdVal(ConditionKey k, Object v) { regQ(k, v, getCValueUserIdVal(), "USERIDVAL"); }
    abstract protected ConditionValue getCValueUserIdVal();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * USERIDNUM: {IX+, NUMBER(18)}
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
     * USERIDNUM: {IX+, NUMBER(18)}
     * @param userIdNum The value of userIdNum as greaterThan.
     */
    public void setUserIdNum_GreaterThan(Long userIdNum) {
        regUserIdNum(CK_GT, userIdNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * USERIDNUM: {IX+, NUMBER(18)}
     * @param userIdNum The value of userIdNum as lessThan.
     */
    public void setUserIdNum_LessThan(Long userIdNum) {
        regUserIdNum(CK_LT, userIdNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * USERIDNUM: {IX+, NUMBER(18)}
     * @param userIdNum The value of userIdNum as greaterEqual.
     */
    public void setUserIdNum_GreaterEqual(Long userIdNum) {
        regUserIdNum(CK_GE, userIdNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * USERIDNUM: {IX+, NUMBER(18)}
     * @param userIdNum The value of userIdNum as lessEqual.
     */
    public void setUserIdNum_LessEqual(Long userIdNum) {
        regUserIdNum(CK_LE, userIdNum);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * USERIDNUM: {IX+, NUMBER(18)}
     * @param minNumber The min number of userIdNum. (NullAllowed)
     * @param maxNumber The max number of userIdNum. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUserIdNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueUserIdNum(), "USERIDNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * USERIDNUM: {IX+, NUMBER(18)}
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
     * USERIDNUM: {IX+, NUMBER(18)}
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
     * USERIDNUM: {IX+, NUMBER(18)}
     */
    public void setUserIdNum_IsNull() { regUserIdNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * USERIDNUM: {IX+, NUMBER(18)}
     */
    public void setUserIdNum_IsNotNull() { regUserIdNum(CK_ISNN, DOBJ); }

    protected void regUserIdNum(ConditionKey k, Object v) { regQ(k, v, getCValueUserIdNum(), "USERIDNUM"); }
    abstract protected ConditionValue getCValueUserIdNum();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;BuriUserCB&gt;() {
     *     public void query(BuriUserCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriUserCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;BuriUserCB&gt;() {
     *     public void query(BuriUserCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriUserCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;BuriUserCB&gt;() {
     *     public void query(BuriUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriUserCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;BuriUserCB&gt;() {
     *     public void query(BuriUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriUserCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;BuriUserCB&gt;() {
     *     public void query(BuriUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriUserCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BuriUserCB&gt;() {
     *     public void query(BuriUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriUserCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<BuriUserCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<BuriUserCB>(new HpSSQSetupper<BuriUserCB>() {
            public void setup(String function, SubQuery<BuriUserCB> subQuery, HpSSQOption<BuriUserCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<BuriUserCB> subQuery, String operand, HpSSQOption<BuriUserCB> option) {
        assertObjectNotNull("subQuery<BuriUserCB>", subQuery);
        BuriUserCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(BuriUserCQ subQuery);

    protected BuriUserCB xcreateScalarConditionCB() {
        BuriUserCB cb = new BuriUserCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected BuriUserCB xcreateScalarConditionPartitionByCB() {
        BuriUserCB cb = new BuriUserCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<BuriUserCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriUserCB>", subQuery);
        BuriUserCB cb = new BuriUserCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "BURIUSERID", "BURIUSERID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(BuriUserCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BuriUserCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<BuriUserCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<BuriUserCB>(new HpQDRSetupper<BuriUserCB>() {
            public void setup(String function, SubQuery<BuriUserCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<BuriUserCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriUserCB>", subQuery);
        BuriUserCB cb = new BuriUserCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "BURIUSERID", "BURIUSERID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(BuriUserCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<BuriUserCB> subQuery) {
        assertObjectNotNull("subQuery<BuriUserCB>", subQuery);
        BuriUserCB cb = new BuriUserCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(BuriUserCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<BuriUserCB> subQuery) {
        assertObjectNotNull("subQuery<BuriUserCB>", subQuery);
        BuriUserCB cb = new BuriUserCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(BuriUserCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return BuriUserCB.class.getName(); }
    protected String xabCQ() { return BuriUserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}

package com.example.dbflute.slim3.dbflute.cbean.cq.bs;

import java.util.*;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.chelper.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import com.example.dbflute.slim3.dbflute.allcommon.*;
import com.example.dbflute.slim3.dbflute.cbean.*;
import com.example.dbflute.slim3.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of WITHDRAWAL_REASON.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWithdrawalReasonCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWithdrawalReasonCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WITHDRAWAL_REASON";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as equal.
     */
    public void setWithdrawalReasonCode_Equal(String withdrawalReasonCode) {
        doSetWithdrawalReasonCode_Equal(fRES(withdrawalReasonCode));
    }

    protected void doSetWithdrawalReasonCode_Equal(String withdrawalReasonCode) {
        regWithdrawalReasonCode(CK_EQ, withdrawalReasonCode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as notEqual.
     */
    public void setWithdrawalReasonCode_NotEqual(String withdrawalReasonCode) {
        doSetWithdrawalReasonCode_NotEqual(fRES(withdrawalReasonCode));
    }

    protected void doSetWithdrawalReasonCode_NotEqual(String withdrawalReasonCode) {
        regWithdrawalReasonCode(CK_NES, withdrawalReasonCode);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)}
     * @param withdrawalReasonCodeList The collection of withdrawalReasonCode as inScope.
     */
    public void setWithdrawalReasonCode_InScope(Collection<String> withdrawalReasonCodeList) {
        doSetWithdrawalReasonCode_InScope(withdrawalReasonCodeList);
    }

    public void doSetWithdrawalReasonCode_InScope(Collection<String> withdrawalReasonCodeList) {
        regINS(CK_INS, cTL(withdrawalReasonCodeList), getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)}
     * @param withdrawalReasonCodeList The collection of withdrawalReasonCode as notInScope.
     */
    public void setWithdrawalReasonCode_NotInScope(Collection<String> withdrawalReasonCodeList) {
        doSetWithdrawalReasonCode_NotInScope(withdrawalReasonCodeList);
    }

    public void doSetWithdrawalReasonCode_NotInScope(Collection<String> withdrawalReasonCodeList) {
        regINS(CK_NINS, cTL(withdrawalReasonCodeList), getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as prefixSearch.
     */
    public void setWithdrawalReasonCode_PrefixSearch(String withdrawalReasonCode) {
        setWithdrawalReasonCode_LikeSearch(withdrawalReasonCode, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWithdrawalReasonCode_LikeSearch(String withdrawalReasonCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(withdrawalReasonCode), getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)}
     * @param withdrawalReasonCode The value of withdrawalReasonCode as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWithdrawalReasonCode_NotLikeSearch(String withdrawalReasonCode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(withdrawalReasonCode), getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE", likeSearchOption);
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select WITHDRAWAL_REASON_CODE from MEMBER_WITHDRAWAL where ...)} <br />
     * MEMBER_WITHDRAWAL by your WITHDRAWAL_REASON_CODE, named 'memberWithdrawalAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMemberWithdrawalList</span>(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(WithdrawalReasonCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MemberWithdrawalList for 'exists'. (NotNull)
     */
    public void existsMemberWithdrawalList(SubQuery<MemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery<MemberWithdrawalCB>", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", subQueryPropertyName, "memberWithdrawalList");
    }
    public abstract String keepWithdrawalReasonCode_ExistsReferrer_MemberWithdrawalList(MemberWithdrawalCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select WITHDRAWAL_REASON_CODE from MEMBER_WITHDRAWAL where ...)} <br />
     * MEMBER_WITHDRAWAL by your WITHDRAWAL_REASON_CODE, named 'memberWithdrawalAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMemberWithdrawalList</span>(new SubQuery&lt;MemberWithdrawalCB&gt;() {
     *     public void query(WithdrawalReasonCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of WithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList for 'not exists'. (NotNull)
     */
    public void notExistsMemberWithdrawalList(SubQuery<MemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery<MemberWithdrawalCB>", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", subQueryPropertyName, "memberWithdrawalList");
    }
    public abstract String keepWithdrawalReasonCode_NotExistsReferrer_MemberWithdrawalList(MemberWithdrawalCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select WITHDRAWAL_REASON_CODE from MEMBER_WITHDRAWAL where ...)} <br />
     * MEMBER_WITHDRAWAL by your WITHDRAWAL_REASON_CODE, named 'memberWithdrawalAsOne'.
     * @param subQuery The sub-query of MemberWithdrawalList for 'in-scope'. (NotNull)
     */
    public void inScopeMemberWithdrawalList(SubQuery<MemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery<MemberWithdrawalCB>", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", subQueryPropertyName, "memberWithdrawalList");
    }
    public abstract String keepWithdrawalReasonCode_InScopeRelation_MemberWithdrawalList(MemberWithdrawalCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select WITHDRAWAL_REASON_CODE from MEMBER_WITHDRAWAL where ...)} <br />
     * MEMBER_WITHDRAWAL by your WITHDRAWAL_REASON_CODE, named 'memberWithdrawalAsOne'.
     * @param subQuery The sub-query of MemberWithdrawalList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMemberWithdrawalList(SubQuery<MemberWithdrawalCB> subQuery) {
        assertObjectNotNull("subQuery<MemberWithdrawalCB>", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", subQueryPropertyName, "memberWithdrawalList");
    }
    public abstract String keepWithdrawalReasonCode_NotInScopeRelation_MemberWithdrawalList(MemberWithdrawalCQ subQuery);

    public void xsderiveMemberWithdrawalList(String function, SubQuery<MemberWithdrawalCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberWithdrawalCB>", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", subQueryPropertyName, "memberWithdrawalList", aliasName, option);
    }
    public abstract String keepWithdrawalReasonCode_SpecifyDerivedReferrer_MemberWithdrawalList(MemberWithdrawalCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from MEMBER_WITHDRAWAL where ...)} <br />
     * MEMBER_WITHDRAWAL by your WITHDRAWAL_REASON_CODE, named 'memberWithdrawalAsOne'.
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
    public HpQDRFunction<MemberWithdrawalCB> derivedMemberWithdrawalList() {
        return xcreateQDRFunctionMemberWithdrawalList();
    }
    protected HpQDRFunction<MemberWithdrawalCB> xcreateQDRFunctionMemberWithdrawalList() {
        return new HpQDRFunction<MemberWithdrawalCB>(new HpQDRSetupper<MemberWithdrawalCB>() {
            public void setup(String function, SubQuery<MemberWithdrawalCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMemberWithdrawalList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMemberWithdrawalList(String function, SubQuery<MemberWithdrawalCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MemberWithdrawalCB>", subQuery);
        MemberWithdrawalCB cb = new MemberWithdrawalCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", subQueryPropertyName, "memberWithdrawalList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalList(MemberWithdrawalCQ subQuery);
    public abstract String keepWithdrawalReasonCode_QueryDerivedReferrer_MemberWithdrawalListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setWithdrawalReasonCode_IsNull() { regWithdrawalReasonCode(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_CODE: {PK, NotNull, CHAR(3)}
     */
    public void setWithdrawalReasonCode_IsNotNull() { regWithdrawalReasonCode(CK_ISNN, DOBJ); }

    protected void regWithdrawalReasonCode(ConditionKey k, Object v) { regQ(k, v, getCValueWithdrawalReasonCode(), "WITHDRAWAL_REASON_CODE"); }
    abstract protected ConditionValue getCValueWithdrawalReasonCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as equal.
     */
    public void setWithdrawalReasonText_Equal(String withdrawalReasonText) {
        doSetWithdrawalReasonText_Equal(fRES(withdrawalReasonText));
    }

    protected void doSetWithdrawalReasonText_Equal(String withdrawalReasonText) {
        regWithdrawalReasonText(CK_EQ, withdrawalReasonText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as notEqual.
     */
    public void setWithdrawalReasonText_NotEqual(String withdrawalReasonText) {
        doSetWithdrawalReasonText_NotEqual(fRES(withdrawalReasonText));
    }

    protected void doSetWithdrawalReasonText_NotEqual(String withdrawalReasonText) {
        regWithdrawalReasonText(CK_NES, withdrawalReasonText);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @param withdrawalReasonTextList The collection of withdrawalReasonText as inScope.
     */
    public void setWithdrawalReasonText_InScope(Collection<String> withdrawalReasonTextList) {
        doSetWithdrawalReasonText_InScope(withdrawalReasonTextList);
    }

    public void doSetWithdrawalReasonText_InScope(Collection<String> withdrawalReasonTextList) {
        regINS(CK_INS, cTL(withdrawalReasonTextList), getCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @param withdrawalReasonTextList The collection of withdrawalReasonText as notInScope.
     */
    public void setWithdrawalReasonText_NotInScope(Collection<String> withdrawalReasonTextList) {
        doSetWithdrawalReasonText_NotInScope(withdrawalReasonTextList);
    }

    public void doSetWithdrawalReasonText_NotInScope(Collection<String> withdrawalReasonTextList) {
        regINS(CK_NINS, cTL(withdrawalReasonTextList), getCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as prefixSearch.
     */
    public void setWithdrawalReasonText_PrefixSearch(String withdrawalReasonText) {
        setWithdrawalReasonText_LikeSearch(withdrawalReasonText, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWithdrawalReasonText_LikeSearch(String withdrawalReasonText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(withdrawalReasonText), getCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * WITHDRAWAL_REASON_TEXT: {NotNull, CLOB(2147483647)}
     * @param withdrawalReasonText The value of withdrawalReasonText as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWithdrawalReasonText_NotLikeSearch(String withdrawalReasonText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(withdrawalReasonText), getCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT", likeSearchOption);
    }

    protected void regWithdrawalReasonText(ConditionKey k, Object v) { regQ(k, v, getCValueWithdrawalReasonText(), "WITHDRAWAL_REASON_TEXT"); }
    abstract protected ConditionValue getCValueWithdrawalReasonText();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrder The value of displayOrder as equal.
     */
    public void setDisplayOrder_Equal(Integer displayOrder) {
        doSetDisplayOrder_Equal(displayOrder);
    }

    protected void doSetDisplayOrder_Equal(Integer displayOrder) {
        regDisplayOrder(CK_EQ, displayOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrder The value of displayOrder as greaterThan.
     */
    public void setDisplayOrder_GreaterThan(Integer displayOrder) {
        regDisplayOrder(CK_GT, displayOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrder The value of displayOrder as lessThan.
     */
    public void setDisplayOrder_LessThan(Integer displayOrder) {
        regDisplayOrder(CK_LT, displayOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrder The value of displayOrder as greaterEqual.
     */
    public void setDisplayOrder_GreaterEqual(Integer displayOrder) {
        regDisplayOrder(CK_GE, displayOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrder The value of displayOrder as lessEqual.
     */
    public void setDisplayOrder_LessEqual(Integer displayOrder) {
        regDisplayOrder(CK_LE, displayOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param minNumber The min number of displayOrder. (NullAllowed)
     * @param maxNumber The max number of displayOrder. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDisplayOrder_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDisplayOrder(), "DISPLAY_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrderList The collection of displayOrder as inScope.
     */
    public void setDisplayOrder_InScope(Collection<Integer> displayOrderList) {
        doSetDisplayOrder_InScope(displayOrderList);
    }

    protected void doSetDisplayOrder_InScope(Collection<Integer> displayOrderList) {
        regINS(CK_INS, cTL(displayOrderList), getCValueDisplayOrder(), "DISPLAY_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DISPLAY_ORDER: {UQ, NotNull, INTEGER(10)}
     * @param displayOrderList The collection of displayOrder as notInScope.
     */
    public void setDisplayOrder_NotInScope(Collection<Integer> displayOrderList) {
        doSetDisplayOrder_NotInScope(displayOrderList);
    }

    protected void doSetDisplayOrder_NotInScope(Collection<Integer> displayOrderList) {
        regINS(CK_NINS, cTL(displayOrderList), getCValueDisplayOrder(), "DISPLAY_ORDER");
    }

    protected void regDisplayOrder(ConditionKey k, Object v) { regQ(k, v, getCValueDisplayOrder(), "DISPLAY_ORDER"); }
    abstract protected ConditionValue getCValueDisplayOrder();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void query(WithdrawalReasonCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WithdrawalReasonCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void query(WithdrawalReasonCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WithdrawalReasonCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void query(WithdrawalReasonCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WithdrawalReasonCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void query(WithdrawalReasonCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WithdrawalReasonCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void query(WithdrawalReasonCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WithdrawalReasonCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WithdrawalReasonCB&gt;() {
     *     public void query(WithdrawalReasonCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WithdrawalReasonCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<WithdrawalReasonCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<WithdrawalReasonCB>(new HpSSQSetupper<WithdrawalReasonCB>() {
            public void setup(String function, SubQuery<WithdrawalReasonCB> subQuery, HpSSQOption<WithdrawalReasonCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<WithdrawalReasonCB> subQuery, String operand, HpSSQOption<WithdrawalReasonCB> option) {
        assertObjectNotNull("subQuery<WithdrawalReasonCB>", subQuery);
        WithdrawalReasonCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(WithdrawalReasonCQ subQuery);

    protected WithdrawalReasonCB xcreateScalarConditionCB() {
        WithdrawalReasonCB cb = new WithdrawalReasonCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected WithdrawalReasonCB xcreateScalarConditionPartitionByCB() {
        WithdrawalReasonCB cb = new WithdrawalReasonCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<WithdrawalReasonCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WithdrawalReasonCB>", subQuery);
        WithdrawalReasonCB cb = new WithdrawalReasonCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(WithdrawalReasonCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WithdrawalReasonCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<WithdrawalReasonCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<WithdrawalReasonCB>(new HpQDRSetupper<WithdrawalReasonCB>() {
            public void setup(String function, SubQuery<WithdrawalReasonCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<WithdrawalReasonCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<WithdrawalReasonCB>", subQuery);
        WithdrawalReasonCB cb = new WithdrawalReasonCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "WITHDRAWAL_REASON_CODE", "WITHDRAWAL_REASON_CODE", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(WithdrawalReasonCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<WithdrawalReasonCB> subQuery) {
        assertObjectNotNull("subQuery<WithdrawalReasonCB>", subQuery);
        WithdrawalReasonCB cb = new WithdrawalReasonCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(WithdrawalReasonCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<WithdrawalReasonCB> subQuery) {
        assertObjectNotNull("subQuery<WithdrawalReasonCB>", subQuery);
        WithdrawalReasonCB cb = new WithdrawalReasonCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(WithdrawalReasonCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return WithdrawalReasonCB.class.getName(); }
    protected String xabCQ() { return WithdrawalReasonCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}

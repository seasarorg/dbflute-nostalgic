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
 * The abstract condition-query of DOCUMENT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsDocumentCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsDocumentCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "DOCUMENT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE}
     * @param id The value of id as equal.
     */
    public void setId_Equal(Long id) {
        doSetId_Equal(id);
    }

    protected void doSetId_Equal(Long id) {
        regId(CK_EQ, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE}
     * @param id The value of id as greaterThan.
     */
    public void setId_GreaterThan(Long id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE}
     * @param id The value of id as lessThan.
     */
    public void setId_LessThan(Long id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE}
     * @param id The value of id as greaterEqual.
     */
    public void setId_GreaterEqual(Long id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE}
     * @param id The value of id as lessEqual.
     */
    public void setId_LessEqual(Long id) {
        regId(CK_LE, id);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE}
     * @param minNumber The min number of id. (NullAllowed)
     * @param maxNumber The max number of id. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueId(), "ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE}
     * @param idList The collection of id as inScope.
     */
    public void setId_InScope(Collection<Long> idList) {
        doSetId_InScope(idList);
    }

    protected void doSetId_InScope(Collection<Long> idList) {
        regINS(CK_INS, cTL(idList), getCValueId(), "ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE}
     * @param idList The collection of id as notInScope.
     */
    public void setId_NotInScope(Collection<Long> idList) {
        doSetId_NotInScope(idList);
    }

    protected void doSetId_NotInScope(Collection<Long> idList) {
        regINS(CK_NINS, cTL(idList), getCValueId(), "ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select INTERNAL_PK_VALUE from BURI_ALL_ROUND_STATE where ...)} <br />
     * BURI_ALL_ROUND_STATE by your INTERNAL_PK_VALUE, named 'buriAllRoundStateAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsBuriAllRoundStateList</span>(new SubQuery&lt;BuriAllRoundStateCB&gt;() {
     *     public void query(DocumentCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of BuriAllRoundStateList for 'exists'. (NotNull)
     */
    public void existsBuriAllRoundStateList(SubQuery<BuriAllRoundStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriAllRoundStateCB>", subQuery);
        BuriAllRoundStateCB cb = new BuriAllRoundStateCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_ExistsReferrer_BuriAllRoundStateList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "ID", "INTERNAL_PK_VALUE", subQueryPropertyName, "buriAllRoundStateList");
    }
    public abstract String keepId_ExistsReferrer_BuriAllRoundStateList(BuriAllRoundStateCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select INTERNAL_PK_VALUE from BURI_ALL_ROUND_STATE where ...)} <br />
     * BURI_ALL_ROUND_STATE by your INTERNAL_PK_VALUE, named 'buriAllRoundStateAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsBuriAllRoundStateList</span>(new SubQuery&lt;BuriAllRoundStateCB&gt;() {
     *     public void query(DocumentCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of Id_NotExistsReferrer_BuriAllRoundStateList for 'not exists'. (NotNull)
     */
    public void notExistsBuriAllRoundStateList(SubQuery<BuriAllRoundStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriAllRoundStateCB>", subQuery);
        BuriAllRoundStateCB cb = new BuriAllRoundStateCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_NotExistsReferrer_BuriAllRoundStateList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "ID", "INTERNAL_PK_VALUE", subQueryPropertyName, "buriAllRoundStateList");
    }
    public abstract String keepId_NotExistsReferrer_BuriAllRoundStateList(BuriAllRoundStateCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select INTERNAL_PK_VALUE from BURI_ALL_ROUND_STATE where ...)} <br />
     * BURI_ALL_ROUND_STATE by your INTERNAL_PK_VALUE, named 'buriAllRoundStateAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @param subQuery The sub-query of BuriAllRoundStateList for 'in-scope'. (NotNull)
     */
    public void inScopeBuriAllRoundStateList(SubQuery<BuriAllRoundStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriAllRoundStateCB>", subQuery);
        BuriAllRoundStateCB cb = new BuriAllRoundStateCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_InScopeRelation_BuriAllRoundStateList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "ID", "INTERNAL_PK_VALUE", subQueryPropertyName, "buriAllRoundStateList");
    }
    public abstract String keepId_InScopeRelation_BuriAllRoundStateList(BuriAllRoundStateCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select INTERNAL_PK_VALUE from BURI_ALL_ROUND_STATE where ...)} <br />
     * BURI_ALL_ROUND_STATE by your INTERNAL_PK_VALUE, named 'buriAllRoundStateAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
     * @param subQuery The sub-query of BuriAllRoundStateList for 'not in-scope'. (NotNull)
     */
    public void notInScopeBuriAllRoundStateList(SubQuery<BuriAllRoundStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriAllRoundStateCB>", subQuery);
        BuriAllRoundStateCB cb = new BuriAllRoundStateCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_NotInScopeRelation_BuriAllRoundStateList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "ID", "INTERNAL_PK_VALUE", subQueryPropertyName, "buriAllRoundStateList");
    }
    public abstract String keepId_NotInScopeRelation_BuriAllRoundStateList(BuriAllRoundStateCQ subQuery);

    public void xsderiveBuriAllRoundStateList(String function, SubQuery<BuriAllRoundStateCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriAllRoundStateCB>", subQuery);
        BuriAllRoundStateCB cb = new BuriAllRoundStateCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_SpecifyDerivedReferrer_BuriAllRoundStateList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "ID", "INTERNAL_PK_VALUE", subQueryPropertyName, "buriAllRoundStateList", aliasName, option);
    }
    public abstract String keepId_SpecifyDerivedReferrer_BuriAllRoundStateList(BuriAllRoundStateCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from BURI_ALL_ROUND_STATE where ...)} <br />
     * BURI_ALL_ROUND_STATE by your INTERNAL_PK_VALUE, named 'buriAllRoundStateAsOne'. <br />
     * This relation is auto-detected as implicit reverse FK.
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
    public HpQDRFunction<BuriAllRoundStateCB> derivedBuriAllRoundStateList() {
        return xcreateQDRFunctionBuriAllRoundStateList();
    }
    protected HpQDRFunction<BuriAllRoundStateCB> xcreateQDRFunctionBuriAllRoundStateList() {
        return new HpQDRFunction<BuriAllRoundStateCB>(new HpQDRSetupper<BuriAllRoundStateCB>() {
            public void setup(String function, SubQuery<BuriAllRoundStateCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveBuriAllRoundStateList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveBuriAllRoundStateList(String function, SubQuery<BuriAllRoundStateCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriAllRoundStateCB>", subQuery);
        BuriAllRoundStateCB cb = new BuriAllRoundStateCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepId_QueryDerivedReferrer_BuriAllRoundStateList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepId_QueryDerivedReferrer_BuriAllRoundStateListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "ID", "INTERNAL_PK_VALUE", subQueryPropertyName, "buriAllRoundStateList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepId_QueryDerivedReferrer_BuriAllRoundStateList(BuriAllRoundStateCQ subQuery);
    public abstract String keepId_QueryDerivedReferrer_BuriAllRoundStateListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE}
     */
    public void setId_IsNull() { regId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ID: {PK, NotNull, NUMBER(18), FK to BURI_ALL_ROUND_STATE}
     */
    public void setId_IsNotNull() { regId(CK_ISNN, DOBJ); }

    protected void regId(ConditionKey k, Object v) { regQ(k, v, getCValueId(), "ID"); }
    abstract protected ConditionValue getCValueId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TITLE: {NotNull, VARCHAR2(64)}
     * @param title The value of title as equal.
     */
    public void setTitle_Equal(String title) {
        doSetTitle_Equal(fRES(title));
    }

    protected void doSetTitle_Equal(String title) {
        regTitle(CK_EQ, title);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TITLE: {NotNull, VARCHAR2(64)}
     * @param title The value of title as notEqual.
     */
    public void setTitle_NotEqual(String title) {
        doSetTitle_NotEqual(fRES(title));
    }

    protected void doSetTitle_NotEqual(String title) {
        regTitle(CK_NES, title);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TITLE: {NotNull, VARCHAR2(64)}
     * @param titleList The collection of title as inScope.
     */
    public void setTitle_InScope(Collection<String> titleList) {
        doSetTitle_InScope(titleList);
    }

    public void doSetTitle_InScope(Collection<String> titleList) {
        regINS(CK_INS, cTL(titleList), getCValueTitle(), "TITLE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TITLE: {NotNull, VARCHAR2(64)}
     * @param titleList The collection of title as notInScope.
     */
    public void setTitle_NotInScope(Collection<String> titleList) {
        doSetTitle_NotInScope(titleList);
    }

    public void doSetTitle_NotInScope(Collection<String> titleList) {
        regINS(CK_NINS, cTL(titleList), getCValueTitle(), "TITLE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TITLE: {NotNull, VARCHAR2(64)}
     * @param title The value of title as prefixSearch.
     */
    public void setTitle_PrefixSearch(String title) {
        setTitle_LikeSearch(title, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TITLE: {NotNull, VARCHAR2(64)}
     * @param title The value of title as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTitle_LikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(title), getCValueTitle(), "TITLE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TITLE: {NotNull, VARCHAR2(64)}
     * @param title The value of title as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTitle_NotLikeSearch(String title, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(title), getCValueTitle(), "TITLE", likeSearchOption);
    }

    protected void regTitle(ConditionKey k, Object v) { regQ(k, v, getCValueTitle(), "TITLE"); }
    abstract protected ConditionValue getCValueTitle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONTENT: {NotNull, VARCHAR2(1024)}
     * @param content The value of content as equal.
     */
    public void setContent_Equal(String content) {
        doSetContent_Equal(fRES(content));
    }

    protected void doSetContent_Equal(String content) {
        regContent(CK_EQ, content);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * CONTENT: {NotNull, VARCHAR2(1024)}
     * @param content The value of content as notEqual.
     */
    public void setContent_NotEqual(String content) {
        doSetContent_NotEqual(fRES(content));
    }

    protected void doSetContent_NotEqual(String content) {
        regContent(CK_NES, content);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CONTENT: {NotNull, VARCHAR2(1024)}
     * @param contentList The collection of content as inScope.
     */
    public void setContent_InScope(Collection<String> contentList) {
        doSetContent_InScope(contentList);
    }

    public void doSetContent_InScope(Collection<String> contentList) {
        regINS(CK_INS, cTL(contentList), getCValueContent(), "CONTENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * CONTENT: {NotNull, VARCHAR2(1024)}
     * @param contentList The collection of content as notInScope.
     */
    public void setContent_NotInScope(Collection<String> contentList) {
        doSetContent_NotInScope(contentList);
    }

    public void doSetContent_NotInScope(Collection<String> contentList) {
        regINS(CK_NINS, cTL(contentList), getCValueContent(), "CONTENT");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONTENT: {NotNull, VARCHAR2(1024)}
     * @param content The value of content as prefixSearch.
     */
    public void setContent_PrefixSearch(String content) {
        setContent_LikeSearch(content, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONTENT: {NotNull, VARCHAR2(1024)}
     * @param content The value of content as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setContent_LikeSearch(String content, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(content), getCValueContent(), "CONTENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * CONTENT: {NotNull, VARCHAR2(1024)}
     * @param content The value of content as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setContent_NotLikeSearch(String content, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(content), getCValueContent(), "CONTENT", likeSearchOption);
    }

    protected void regContent(ConditionKey k, Object v) { regQ(k, v, getCValueContent(), "CONTENT"); }
    abstract protected ConditionValue getCValueContent();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;DocumentCB&gt;() {
     *     public void query(DocumentCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DocumentCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;DocumentCB&gt;() {
     *     public void query(DocumentCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DocumentCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;DocumentCB&gt;() {
     *     public void query(DocumentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DocumentCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;DocumentCB&gt;() {
     *     public void query(DocumentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DocumentCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;DocumentCB&gt;() {
     *     public void query(DocumentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DocumentCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;DocumentCB&gt;() {
     *     public void query(DocumentCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<DocumentCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<DocumentCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<DocumentCB>(new HpSSQSetupper<DocumentCB>() {
            public void setup(String function, SubQuery<DocumentCB> subQuery, HpSSQOption<DocumentCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<DocumentCB> subQuery, String operand, HpSSQOption<DocumentCB> option) {
        assertObjectNotNull("subQuery<DocumentCB>", subQuery);
        DocumentCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(DocumentCQ subQuery);

    protected DocumentCB xcreateScalarConditionCB() {
        DocumentCB cb = new DocumentCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected DocumentCB xcreateScalarConditionPartitionByCB() {
        DocumentCB cb = new DocumentCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<DocumentCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<DocumentCB>", subQuery);
        DocumentCB cb = new DocumentCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "ID", "ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(DocumentCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<DocumentCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<DocumentCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<DocumentCB>(new HpQDRSetupper<DocumentCB>() {
            public void setup(String function, SubQuery<DocumentCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<DocumentCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<DocumentCB>", subQuery);
        DocumentCB cb = new DocumentCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "ID", "ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(DocumentCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<DocumentCB> subQuery) {
        assertObjectNotNull("subQuery<DocumentCB>", subQuery);
        DocumentCB cb = new DocumentCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(DocumentCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<DocumentCB> subQuery) {
        assertObjectNotNull("subQuery<DocumentCB>", subQuery);
        DocumentCB cb = new DocumentCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(DocumentCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return DocumentCB.class.getName(); }
    protected String xabCQ() { return DocumentCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}

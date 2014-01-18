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
 * The abstract condition-query of VENDOR_CHECK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorCheckCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorCheckCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "VENDOR_CHECK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as equal.
     */
    public void setVendorCheckId_Equal(Long vendorCheckId) {
        doSetVendorCheckId_Equal(vendorCheckId);
    }

    protected void doSetVendorCheckId_Equal(Long vendorCheckId) {
        regVendorCheckId(CK_EQ, vendorCheckId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterThan.
     */
    public void setVendorCheckId_GreaterThan(Long vendorCheckId) {
        regVendorCheckId(CK_GT, vendorCheckId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as lessThan.
     */
    public void setVendorCheckId_LessThan(Long vendorCheckId) {
        regVendorCheckId(CK_LT, vendorCheckId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as greaterEqual.
     */
    public void setVendorCheckId_GreaterEqual(Long vendorCheckId) {
        regVendorCheckId(CK_GE, vendorCheckId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckId The value of vendorCheckId as lessEqual.
     */
    public void setVendorCheckId_LessEqual(Long vendorCheckId) {
        regVendorCheckId(CK_LE, vendorCheckId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of vendorCheckId. (NullAllowed)
     * @param maxNumber The max number of vendorCheckId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVendorCheckId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVendorCheckId(), "VENDOR_CHECK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as inScope.
     */
    public void setVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_InScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_InScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_INS, cTL(vendorCheckIdList), getCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     * @param vendorCheckIdList The collection of vendorCheckId as notInScope.
     */
    public void setVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        doSetVendorCheckId_NotInScope(vendorCheckIdList);
    }

    protected void doSetVendorCheckId_NotInScope(Collection<Long> vendorCheckIdList) {
        regINS(CK_NINS, cTL(vendorCheckIdList), getCValueVendorCheckId(), "VENDOR_CHECK_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setVendorCheckId_IsNull() { regVendorCheckId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * VENDOR_CHECK_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setVendorCheckId_IsNotNull() { regVendorCheckId(CK_ISNN, DOBJ); }

    protected void regVendorCheckId(ConditionKey k, Object v) { regQ(k, v, getCValueVendorCheckId(), "VENDOR_CHECK_ID"); }
    abstract protected ConditionValue getCValueVendorCheckId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DECIMAL_DIGIT: {NotNull, DECIMAL(5, 3)}
     * @param decimalDigit The value of decimalDigit as equal.
     */
    public void setDecimalDigit_Equal(java.math.BigDecimal decimalDigit) {
        doSetDecimalDigit_Equal(decimalDigit);
    }

    protected void doSetDecimalDigit_Equal(java.math.BigDecimal decimalDigit) {
        regDecimalDigit(CK_EQ, decimalDigit);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DECIMAL_DIGIT: {NotNull, DECIMAL(5, 3)}
     * @param decimalDigit The value of decimalDigit as greaterThan.
     */
    public void setDecimalDigit_GreaterThan(java.math.BigDecimal decimalDigit) {
        regDecimalDigit(CK_GT, decimalDigit);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DECIMAL_DIGIT: {NotNull, DECIMAL(5, 3)}
     * @param decimalDigit The value of decimalDigit as lessThan.
     */
    public void setDecimalDigit_LessThan(java.math.BigDecimal decimalDigit) {
        regDecimalDigit(CK_LT, decimalDigit);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DECIMAL_DIGIT: {NotNull, DECIMAL(5, 3)}
     * @param decimalDigit The value of decimalDigit as greaterEqual.
     */
    public void setDecimalDigit_GreaterEqual(java.math.BigDecimal decimalDigit) {
        regDecimalDigit(CK_GE, decimalDigit);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DECIMAL_DIGIT: {NotNull, DECIMAL(5, 3)}
     * @param decimalDigit The value of decimalDigit as lessEqual.
     */
    public void setDecimalDigit_LessEqual(java.math.BigDecimal decimalDigit) {
        regDecimalDigit(CK_LE, decimalDigit);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DECIMAL_DIGIT: {NotNull, DECIMAL(5, 3)}
     * @param minNumber The min number of decimalDigit. (NullAllowed)
     * @param maxNumber The max number of decimalDigit. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDecimalDigit_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDecimalDigit(), "DECIMAL_DIGIT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DECIMAL_DIGIT: {NotNull, DECIMAL(5, 3)}
     * @param decimalDigitList The collection of decimalDigit as inScope.
     */
    public void setDecimalDigit_InScope(Collection<java.math.BigDecimal> decimalDigitList) {
        doSetDecimalDigit_InScope(decimalDigitList);
    }

    protected void doSetDecimalDigit_InScope(Collection<java.math.BigDecimal> decimalDigitList) {
        regINS(CK_INS, cTL(decimalDigitList), getCValueDecimalDigit(), "DECIMAL_DIGIT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DECIMAL_DIGIT: {NotNull, DECIMAL(5, 3)}
     * @param decimalDigitList The collection of decimalDigit as notInScope.
     */
    public void setDecimalDigit_NotInScope(Collection<java.math.BigDecimal> decimalDigitList) {
        doSetDecimalDigit_NotInScope(decimalDigitList);
    }

    protected void doSetDecimalDigit_NotInScope(Collection<java.math.BigDecimal> decimalDigitList) {
        regINS(CK_NINS, cTL(decimalDigitList), getCValueDecimalDigit(), "DECIMAL_DIGIT");
    }

    protected void regDecimalDigit(ConditionKey k, Object v) { regQ(k, v, getCValueDecimalDigit(), "DECIMAL_DIGIT"); }
    abstract protected ConditionValue getCValueDecimalDigit();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTEGER_NON_DIGIT: {NotNull, DECIMAL(5)}
     * @param integerNonDigit The value of integerNonDigit as equal.
     */
    public void setIntegerNonDigit_Equal(Integer integerNonDigit) {
        doSetIntegerNonDigit_Equal(integerNonDigit);
    }

    protected void doSetIntegerNonDigit_Equal(Integer integerNonDigit) {
        regIntegerNonDigit(CK_EQ, integerNonDigit);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTEGER_NON_DIGIT: {NotNull, DECIMAL(5)}
     * @param integerNonDigit The value of integerNonDigit as greaterThan.
     */
    public void setIntegerNonDigit_GreaterThan(Integer integerNonDigit) {
        regIntegerNonDigit(CK_GT, integerNonDigit);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTEGER_NON_DIGIT: {NotNull, DECIMAL(5)}
     * @param integerNonDigit The value of integerNonDigit as lessThan.
     */
    public void setIntegerNonDigit_LessThan(Integer integerNonDigit) {
        regIntegerNonDigit(CK_LT, integerNonDigit);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTEGER_NON_DIGIT: {NotNull, DECIMAL(5)}
     * @param integerNonDigit The value of integerNonDigit as greaterEqual.
     */
    public void setIntegerNonDigit_GreaterEqual(Integer integerNonDigit) {
        regIntegerNonDigit(CK_GE, integerNonDigit);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTEGER_NON_DIGIT: {NotNull, DECIMAL(5)}
     * @param integerNonDigit The value of integerNonDigit as lessEqual.
     */
    public void setIntegerNonDigit_LessEqual(Integer integerNonDigit) {
        regIntegerNonDigit(CK_LE, integerNonDigit);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INTEGER_NON_DIGIT: {NotNull, DECIMAL(5)}
     * @param minNumber The min number of integerNonDigit. (NullAllowed)
     * @param maxNumber The max number of integerNonDigit. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setIntegerNonDigit_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueIntegerNonDigit(), "INTEGER_NON_DIGIT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTEGER_NON_DIGIT: {NotNull, DECIMAL(5)}
     * @param integerNonDigitList The collection of integerNonDigit as inScope.
     */
    public void setIntegerNonDigit_InScope(Collection<Integer> integerNonDigitList) {
        doSetIntegerNonDigit_InScope(integerNonDigitList);
    }

    protected void doSetIntegerNonDigit_InScope(Collection<Integer> integerNonDigitList) {
        regINS(CK_INS, cTL(integerNonDigitList), getCValueIntegerNonDigit(), "INTEGER_NON_DIGIT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTEGER_NON_DIGIT: {NotNull, DECIMAL(5)}
     * @param integerNonDigitList The collection of integerNonDigit as notInScope.
     */
    public void setIntegerNonDigit_NotInScope(Collection<Integer> integerNonDigitList) {
        doSetIntegerNonDigit_NotInScope(integerNonDigitList);
    }

    protected void doSetIntegerNonDigit_NotInScope(Collection<Integer> integerNonDigitList) {
        regINS(CK_NINS, cTL(integerNonDigitList), getCValueIntegerNonDigit(), "INTEGER_NON_DIGIT");
    }

    protected void regIntegerNonDigit(ConditionKey k, Object v) { regQ(k, v, getCValueIntegerNonDigit(), "INTEGER_NON_DIGIT"); }
    abstract protected ConditionValue getCValueIntegerNonDigit();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_BOOLEAN: {NotNull, BOOLEAN(1)}
     * @param typeOfBoolean The value of typeOfBoolean as equal.
     */
    public void setTypeOfBoolean_Equal(Boolean typeOfBoolean) {
        regTypeOfBoolean(CK_EQ, typeOfBoolean);
    }

    protected void regTypeOfBoolean(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfBoolean(), "TYPE_OF_BOOLEAN"); }
    abstract protected ConditionValue getCValueTypeOfBoolean();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     * @param typeOfText The value of typeOfText as equal.
     */
    public void setTypeOfText_Equal(String typeOfText) {
        doSetTypeOfText_Equal(fRES(typeOfText));
    }

    protected void doSetTypeOfText_Equal(String typeOfText) {
        regTypeOfText(CK_EQ, typeOfText);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     * @param typeOfText The value of typeOfText as notEqual.
     */
    public void setTypeOfText_NotEqual(String typeOfText) {
        doSetTypeOfText_NotEqual(fRES(typeOfText));
    }

    protected void doSetTypeOfText_NotEqual(String typeOfText) {
        regTypeOfText(CK_NES, typeOfText);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     * @param typeOfTextList The collection of typeOfText as inScope.
     */
    public void setTypeOfText_InScope(Collection<String> typeOfTextList) {
        doSetTypeOfText_InScope(typeOfTextList);
    }

    public void doSetTypeOfText_InScope(Collection<String> typeOfTextList) {
        regINS(CK_INS, cTL(typeOfTextList), getCValueTypeOfText(), "TYPE_OF_TEXT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     * @param typeOfTextList The collection of typeOfText as notInScope.
     */
    public void setTypeOfText_NotInScope(Collection<String> typeOfTextList) {
        doSetTypeOfText_NotInScope(typeOfTextList);
    }

    public void doSetTypeOfText_NotInScope(Collection<String> typeOfTextList) {
        regINS(CK_NINS, cTL(typeOfTextList), getCValueTypeOfText(), "TYPE_OF_TEXT");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     * @param typeOfText The value of typeOfText as prefixSearch.
     */
    public void setTypeOfText_PrefixSearch(String typeOfText) {
        setTypeOfText_LikeSearch(typeOfText, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     * @param typeOfText The value of typeOfText as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTypeOfText_LikeSearch(String typeOfText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(typeOfText), getCValueTypeOfText(), "TYPE_OF_TEXT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     * @param typeOfText The value of typeOfText as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTypeOfText_NotLikeSearch(String typeOfText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(typeOfText), getCValueTypeOfText(), "TYPE_OF_TEXT", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     */
    public void setTypeOfText_IsNull() { regTypeOfText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     */
    public void setTypeOfText_IsNullOrEmpty() { regTypeOfText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * TYPE_OF_TEXT: {CLOB(2147483647)}
     */
    public void setTypeOfText_IsNotNull() { regTypeOfText(CK_ISNN, DOBJ); }

    protected void regTypeOfText(ConditionKey k, Object v) { regQ(k, v, getCValueTypeOfText(), "TYPE_OF_TEXT"); }
    abstract protected ConditionValue getCValueTypeOfText();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorCheckCB&gt;() {
     *     public void query(VendorCheckCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<VendorCheckCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<VendorCheckCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<VendorCheckCB>(new HpSSQSetupper<VendorCheckCB>() {
            public void setup(String function, SubQuery<VendorCheckCB> subQuery, HpSSQOption<VendorCheckCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<VendorCheckCB> subQuery, String operand, HpSSQOption<VendorCheckCB> option) {
        assertObjectNotNull("subQuery<VendorCheckCB>", subQuery);
        VendorCheckCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(VendorCheckCQ subQuery);

    protected VendorCheckCB xcreateScalarConditionCB() {
        VendorCheckCB cb = new VendorCheckCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected VendorCheckCB xcreateScalarConditionPartitionByCB() {
        VendorCheckCB cb = new VendorCheckCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<VendorCheckCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorCheckCB>", subQuery);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "VENDOR_CHECK_ID", "VENDOR_CHECK_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(VendorCheckCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorCheckCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<VendorCheckCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<VendorCheckCB>(new HpQDRSetupper<VendorCheckCB>() {
            public void setup(String function, SubQuery<VendorCheckCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<VendorCheckCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<VendorCheckCB>", subQuery);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "VENDOR_CHECK_ID", "VENDOR_CHECK_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(VendorCheckCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorCheckCB> subQuery) {
        assertObjectNotNull("subQuery<VendorCheckCB>", subQuery);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(VendorCheckCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<VendorCheckCB> subQuery) {
        assertObjectNotNull("subQuery<VendorCheckCB>", subQuery);
        VendorCheckCB cb = new VendorCheckCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(VendorCheckCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return VendorCheckCB.class.getName(); }
    protected String xabCQ() { return VendorCheckCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}

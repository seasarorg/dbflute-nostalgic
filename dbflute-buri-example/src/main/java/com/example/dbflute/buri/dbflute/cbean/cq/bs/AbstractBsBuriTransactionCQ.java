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
 * The abstract condition-query of BURITRANSACTION.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBuriTransactionCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBuriTransactionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BURITRANSACTION";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {PK, NotNull, NUMBER(18)}
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
     * BTID: {PK, NotNull, NUMBER(18)}
     * @param btid The value of btid as greaterThan.
     */
    public void setBtid_GreaterThan(Long btid) {
        regBtid(CK_GT, btid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {PK, NotNull, NUMBER(18)}
     * @param btid The value of btid as lessThan.
     */
    public void setBtid_LessThan(Long btid) {
        regBtid(CK_LT, btid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {PK, NotNull, NUMBER(18)}
     * @param btid The value of btid as greaterEqual.
     */
    public void setBtid_GreaterEqual(Long btid) {
        regBtid(CK_GE, btid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {PK, NotNull, NUMBER(18)}
     * @param btid The value of btid as lessEqual.
     */
    public void setBtid_LessEqual(Long btid) {
        regBtid(CK_LE, btid);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {PK, NotNull, NUMBER(18)}
     * @param minNumber The min number of btid. (NullAllowed)
     * @param maxNumber The max number of btid. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBtid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBtid(), "BTID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BTID: {PK, NotNull, NUMBER(18)}
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
     * BTID: {PK, NotNull, NUMBER(18)}
     * @param btidList The collection of btid as notInScope.
     */
    public void setBtid_NotInScope(Collection<Long> btidList) {
        doSetBtid_NotInScope(btidList);
    }

    protected void doSetBtid_NotInScope(Collection<Long> btidList) {
        regINS(CK_NINS, cTL(btidList), getCValueBtid(), "BTID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BTID: {PK, NotNull, NUMBER(18)}
     */
    public void setBtid_IsNull() { regBtid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BTID: {PK, NotNull, NUMBER(18)}
     */
    public void setBtid_IsNotNull() { regBtid(CK_ISNN, DOBJ); }

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
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;BuriTransactionCB&gt;() {
     *     public void query(BuriTransactionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriTransactionCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;BuriTransactionCB&gt;() {
     *     public void query(BuriTransactionCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriTransactionCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;BuriTransactionCB&gt;() {
     *     public void query(BuriTransactionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriTransactionCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;BuriTransactionCB&gt;() {
     *     public void query(BuriTransactionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriTransactionCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;BuriTransactionCB&gt;() {
     *     public void query(BuriTransactionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriTransactionCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BuriTransactionCB&gt;() {
     *     public void query(BuriTransactionCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriTransactionCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<BuriTransactionCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<BuriTransactionCB>(new HpSSQSetupper<BuriTransactionCB>() {
            public void setup(String function, SubQuery<BuriTransactionCB> subQuery, HpSSQOption<BuriTransactionCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<BuriTransactionCB> subQuery, String operand, HpSSQOption<BuriTransactionCB> option) {
        assertObjectNotNull("subQuery<BuriTransactionCB>", subQuery);
        BuriTransactionCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(BuriTransactionCQ subQuery);

    protected BuriTransactionCB xcreateScalarConditionCB() {
        BuriTransactionCB cb = new BuriTransactionCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected BuriTransactionCB xcreateScalarConditionPartitionByCB() {
        BuriTransactionCB cb = new BuriTransactionCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<BuriTransactionCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriTransactionCB>", subQuery);
        BuriTransactionCB cb = new BuriTransactionCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "BTID", "BTID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(BuriTransactionCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BuriTransactionCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<BuriTransactionCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<BuriTransactionCB>(new HpQDRSetupper<BuriTransactionCB>() {
            public void setup(String function, SubQuery<BuriTransactionCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<BuriTransactionCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriTransactionCB>", subQuery);
        BuriTransactionCB cb = new BuriTransactionCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "BTID", "BTID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(BuriTransactionCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<BuriTransactionCB> subQuery) {
        assertObjectNotNull("subQuery<BuriTransactionCB>", subQuery);
        BuriTransactionCB cb = new BuriTransactionCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(BuriTransactionCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<BuriTransactionCB> subQuery) {
        assertObjectNotNull("subQuery<BuriTransactionCB>", subQuery);
        BuriTransactionCB cb = new BuriTransactionCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(BuriTransactionCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return BuriTransactionCB.class.getName(); }
    protected String xabCQ() { return BuriTransactionCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}

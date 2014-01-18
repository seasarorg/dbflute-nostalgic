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
 * The abstract condition-query of BURISTATEUSER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBuriStateUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBuriStateUserCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BURISTATEUSER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEUSERID: {PK, NotNull, NUMBER(18)}
     * @param stateUserId The value of stateUserId as equal.
     */
    public void setStateUserId_Equal(Long stateUserId) {
        doSetStateUserId_Equal(stateUserId);
    }

    protected void doSetStateUserId_Equal(Long stateUserId) {
        regStateUserId(CK_EQ, stateUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEUSERID: {PK, NotNull, NUMBER(18)}
     * @param stateUserId The value of stateUserId as greaterThan.
     */
    public void setStateUserId_GreaterThan(Long stateUserId) {
        regStateUserId(CK_GT, stateUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEUSERID: {PK, NotNull, NUMBER(18)}
     * @param stateUserId The value of stateUserId as lessThan.
     */
    public void setStateUserId_LessThan(Long stateUserId) {
        regStateUserId(CK_LT, stateUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEUSERID: {PK, NotNull, NUMBER(18)}
     * @param stateUserId The value of stateUserId as greaterEqual.
     */
    public void setStateUserId_GreaterEqual(Long stateUserId) {
        regStateUserId(CK_GE, stateUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEUSERID: {PK, NotNull, NUMBER(18)}
     * @param stateUserId The value of stateUserId as lessEqual.
     */
    public void setStateUserId_LessEqual(Long stateUserId) {
        regStateUserId(CK_LE, stateUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * STATEUSERID: {PK, NotNull, NUMBER(18)}
     * @param minNumber The min number of stateUserId. (NullAllowed)
     * @param maxNumber The max number of stateUserId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStateUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueStateUserId(), "STATEUSERID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * STATEUSERID: {PK, NotNull, NUMBER(18)}
     * @param stateUserIdList The collection of stateUserId as inScope.
     */
    public void setStateUserId_InScope(Collection<Long> stateUserIdList) {
        doSetStateUserId_InScope(stateUserIdList);
    }

    protected void doSetStateUserId_InScope(Collection<Long> stateUserIdList) {
        regINS(CK_INS, cTL(stateUserIdList), getCValueStateUserId(), "STATEUSERID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * STATEUSERID: {PK, NotNull, NUMBER(18)}
     * @param stateUserIdList The collection of stateUserId as notInScope.
     */
    public void setStateUserId_NotInScope(Collection<Long> stateUserIdList) {
        doSetStateUserId_NotInScope(stateUserIdList);
    }

    protected void doSetStateUserId_NotInScope(Collection<Long> stateUserIdList) {
        regINS(CK_NINS, cTL(stateUserIdList), getCValueStateUserId(), "STATEUSERID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * STATEUSERID: {PK, NotNull, NUMBER(18)}
     */
    public void setStateUserId_IsNull() { regStateUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * STATEUSERID: {PK, NotNull, NUMBER(18)}
     */
    public void setStateUserId_IsNotNull() { regStateUserId(CK_ISNN, DOBJ); }

    protected void regStateUserId(ConditionKey k, Object v) { regQ(k, v, getCValueStateUserId(), "STATEUSERID"); }
    abstract protected ConditionValue getCValueStateUserId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {IX, NUMBER(18), FK to BURISTATE}
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
     * STATEID: {IX, NUMBER(18), FK to BURISTATE}
     * @param stateId The value of stateId as greaterThan.
     */
    public void setStateId_GreaterThan(Long stateId) {
        regStateId(CK_GT, stateId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {IX, NUMBER(18), FK to BURISTATE}
     * @param stateId The value of stateId as lessThan.
     */
    public void setStateId_LessThan(Long stateId) {
        regStateId(CK_LT, stateId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {IX, NUMBER(18), FK to BURISTATE}
     * @param stateId The value of stateId as greaterEqual.
     */
    public void setStateId_GreaterEqual(Long stateId) {
        regStateId(CK_GE, stateId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {IX, NUMBER(18), FK to BURISTATE}
     * @param stateId The value of stateId as lessEqual.
     */
    public void setStateId_LessEqual(Long stateId) {
        regStateId(CK_LE, stateId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {IX, NUMBER(18), FK to BURISTATE}
     * @param minNumber The min number of stateId. (NullAllowed)
     * @param maxNumber The max number of stateId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStateId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueStateId(), "STATEID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * STATEID: {IX, NUMBER(18), FK to BURISTATE}
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
     * STATEID: {IX, NUMBER(18), FK to BURISTATE}
     * @param stateIdList The collection of stateId as notInScope.
     */
    public void setStateId_NotInScope(Collection<Long> stateIdList) {
        doSetStateId_NotInScope(stateIdList);
    }

    protected void doSetStateId_NotInScope(Collection<Long> stateIdList) {
        regINS(CK_NINS, cTL(stateIdList), getCValueStateId(), "STATEID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STATEID from BURISTATE where ...)} <br />
     * BURISTATE by my STATEID, named 'buriState'.
     * @param subQuery The sub-query of BuriState for 'in-scope'. (NotNull)
     */
    public void inScopeBuriState(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepStateId_InScopeRelation_BuriState(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "STATEID", "STATEID", subQueryPropertyName, "buriState");
    }
    public abstract String keepStateId_InScopeRelation_BuriState(BuriStateCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STATEID from BURISTATE where ...)} <br />
     * BURISTATE by my STATEID, named 'buriState'.
     * @param subQuery The sub-query of BuriState for 'not in-scope'. (NotNull)
     */
    public void notInScopeBuriState(SubQuery<BuriStateCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateCB>", subQuery);
        BuriStateCB cb = new BuriStateCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepStateId_NotInScopeRelation_BuriState(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "STATEID", "STATEID", subQueryPropertyName, "buriState");
    }
    public abstract String keepStateId_NotInScopeRelation_BuriState(BuriStateCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * STATEID: {IX, NUMBER(18), FK to BURISTATE}
     */
    public void setStateId_IsNull() { regStateId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * STATEID: {IX, NUMBER(18), FK to BURISTATE}
     */
    public void setStateId_IsNotNull() { regStateId(CK_ISNN, DOBJ); }

    protected void regStateId(ConditionKey k, Object v) { regQ(k, v, getCValueStateId(), "STATEID"); }
    abstract protected ConditionValue getCValueStateId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {IX, NUMBER(18), FK to BURIUSER}
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
     * BURIUSERID: {IX, NUMBER(18), FK to BURIUSER}
     * @param buriUserId The value of buriUserId as greaterThan.
     */
    public void setBuriUserId_GreaterThan(Long buriUserId) {
        regBuriUserId(CK_GT, buriUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {IX, NUMBER(18), FK to BURIUSER}
     * @param buriUserId The value of buriUserId as lessThan.
     */
    public void setBuriUserId_LessThan(Long buriUserId) {
        regBuriUserId(CK_LT, buriUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {IX, NUMBER(18), FK to BURIUSER}
     * @param buriUserId The value of buriUserId as greaterEqual.
     */
    public void setBuriUserId_GreaterEqual(Long buriUserId) {
        regBuriUserId(CK_GE, buriUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {IX, NUMBER(18), FK to BURIUSER}
     * @param buriUserId The value of buriUserId as lessEqual.
     */
    public void setBuriUserId_LessEqual(Long buriUserId) {
        regBuriUserId(CK_LE, buriUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {IX, NUMBER(18), FK to BURIUSER}
     * @param minNumber The min number of buriUserId. (NullAllowed)
     * @param maxNumber The max number of buriUserId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBuriUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBuriUserId(), "BURIUSERID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BURIUSERID: {IX, NUMBER(18), FK to BURIUSER}
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
     * BURIUSERID: {IX, NUMBER(18), FK to BURIUSER}
     * @param buriUserIdList The collection of buriUserId as notInScope.
     */
    public void setBuriUserId_NotInScope(Collection<Long> buriUserIdList) {
        doSetBuriUserId_NotInScope(buriUserIdList);
    }

    protected void doSetBuriUserId_NotInScope(Collection<Long> buriUserIdList) {
        regINS(CK_NINS, cTL(buriUserIdList), getCValueBuriUserId(), "BURIUSERID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BURIUSERID from BURIUSER where ...)} <br />
     * BURIUSER by my BURIUSERID, named 'buriUser'.
     * @param subQuery The sub-query of BuriUser for 'in-scope'. (NotNull)
     */
    public void inScopeBuriUser(SubQuery<BuriUserCB> subQuery) {
        assertObjectNotNull("subQuery<BuriUserCB>", subQuery);
        BuriUserCB cb = new BuriUserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBuriUserId_InScopeRelation_BuriUser(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "BURIUSERID", "BURIUSERID", subQueryPropertyName, "buriUser");
    }
    public abstract String keepBuriUserId_InScopeRelation_BuriUser(BuriUserCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BURIUSERID from BURIUSER where ...)} <br />
     * BURIUSER by my BURIUSERID, named 'buriUser'.
     * @param subQuery The sub-query of BuriUser for 'not in-scope'. (NotNull)
     */
    public void notInScopeBuriUser(SubQuery<BuriUserCB> subQuery) {
        assertObjectNotNull("subQuery<BuriUserCB>", subQuery);
        BuriUserCB cb = new BuriUserCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepBuriUserId_NotInScopeRelation_BuriUser(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "BURIUSERID", "BURIUSERID", subQueryPropertyName, "buriUser");
    }
    public abstract String keepBuriUserId_NotInScopeRelation_BuriUser(BuriUserCQ subQuery);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BURIUSERID: {IX, NUMBER(18), FK to BURIUSER}
     */
    public void setBuriUserId_IsNull() { regBuriUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BURIUSERID: {IX, NUMBER(18), FK to BURIUSER}
     */
    public void setBuriUserId_IsNotNull() { regBuriUserId(CK_ISNN, DOBJ); }

    protected void regBuriUserId(ConditionKey k, Object v) { regQ(k, v, getCValueBuriUserId(), "BURIUSERID"); }
    abstract protected ConditionValue getCValueBuriUserId();

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
     * DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param deleteDate The value of deleteDate as equal.
     */
    public void setDeleteDate_Equal(java.sql.Timestamp deleteDate) {
        regDeleteDate(CK_EQ,  deleteDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param deleteDate The value of deleteDate as greaterThan.
     */
    public void setDeleteDate_GreaterThan(java.sql.Timestamp deleteDate) {
        regDeleteDate(CK_GT,  deleteDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param deleteDate The value of deleteDate as lessThan.
     */
    public void setDeleteDate_LessThan(java.sql.Timestamp deleteDate) {
        regDeleteDate(CK_LT,  deleteDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param deleteDate The value of deleteDate as greaterEqual.
     */
    public void setDeleteDate_GreaterEqual(java.sql.Timestamp deleteDate) {
        regDeleteDate(CK_GE,  deleteDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param deleteDate The value of deleteDate as lessEqual.
     */
    public void setDeleteDate_LessEqual(java.sql.Timestamp deleteDate) {
        regDeleteDate(CK_LE, deleteDate);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deleteDate. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of deleteDate. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDeleteDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueDeleteDate(), "DELETEDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of deleteDate. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of deleteDate. (NullAllowed)
     */
    public void setDeleteDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setDeleteDate_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param deleteDateList The collection of deleteDate as inScope.
     */
    public void setDeleteDate_InScope(Collection<java.sql.Timestamp> deleteDateList) {
        doSetDeleteDate_InScope(deleteDateList);
    }

    protected void doSetDeleteDate_InScope(Collection<java.sql.Timestamp> deleteDateList) {
        regINS(CK_INS, cTL(deleteDateList), getCValueDeleteDate(), "DELETEDATE");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DELETEDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param deleteDateList The collection of deleteDate as notInScope.
     */
    public void setDeleteDate_NotInScope(Collection<java.sql.Timestamp> deleteDateList) {
        doSetDeleteDate_NotInScope(deleteDateList);
    }

    protected void doSetDeleteDate_NotInScope(Collection<java.sql.Timestamp> deleteDateList) {
        regINS(CK_NINS, cTL(deleteDateList), getCValueDeleteDate(), "DELETEDATE");
    }

    protected void regDeleteDate(ConditionKey k, Object v) { regQ(k, v, getCValueDeleteDate(), "DELETEDATE"); }
    abstract protected ConditionValue getCValueDeleteDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriStateUserCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriStateUserCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriStateUserCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriStateUserCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriStateUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriStateUserCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriStateUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriStateUserCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriStateUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriStateUserCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BuriStateUserCB&gt;() {
     *     public void query(BuriStateUserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriStateUserCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<BuriStateUserCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<BuriStateUserCB>(new HpSSQSetupper<BuriStateUserCB>() {
            public void setup(String function, SubQuery<BuriStateUserCB> subQuery, HpSSQOption<BuriStateUserCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<BuriStateUserCB> subQuery, String operand, HpSSQOption<BuriStateUserCB> option) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(BuriStateUserCQ subQuery);

    protected BuriStateUserCB xcreateScalarConditionCB() {
        BuriStateUserCB cb = new BuriStateUserCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected BuriStateUserCB xcreateScalarConditionPartitionByCB() {
        BuriStateUserCB cb = new BuriStateUserCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<BuriStateUserCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "STATEUSERID", "STATEUSERID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(BuriStateUserCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BuriStateUserCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<BuriStateUserCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<BuriStateUserCB>(new HpQDRSetupper<BuriStateUserCB>() {
            public void setup(String function, SubQuery<BuriStateUserCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<BuriStateUserCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "STATEUSERID", "STATEUSERID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(BuriStateUserCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<BuriStateUserCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(BuriStateUserCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<BuriStateUserCB> subQuery) {
        assertObjectNotNull("subQuery<BuriStateUserCB>", subQuery);
        BuriStateUserCB cb = new BuriStateUserCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(BuriStateUserCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return BuriStateUserCB.class.getName(); }
    protected String xabCQ() { return BuriStateUserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}

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
 * The abstract condition-query of BURI_ALL_ROUND_STATE_HISTORY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBuriAllRoundStateHistoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBuriAllRoundStateHistoryCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BURI_ALL_ROUND_STATE_HISTORY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_STATE_ID: {NotNull, NUMBER(18)}
     * @param internalStateId The value of internalStateId as equal.
     */
    public void setInternalStateId_Equal(Long internalStateId) {
        doSetInternalStateId_Equal(internalStateId);
    }

    protected void doSetInternalStateId_Equal(Long internalStateId) {
        regInternalStateId(CK_EQ, internalStateId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_STATE_ID: {NotNull, NUMBER(18)}
     * @param internalStateId The value of internalStateId as greaterThan.
     */
    public void setInternalStateId_GreaterThan(Long internalStateId) {
        regInternalStateId(CK_GT, internalStateId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_STATE_ID: {NotNull, NUMBER(18)}
     * @param internalStateId The value of internalStateId as lessThan.
     */
    public void setInternalStateId_LessThan(Long internalStateId) {
        regInternalStateId(CK_LT, internalStateId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_STATE_ID: {NotNull, NUMBER(18)}
     * @param internalStateId The value of internalStateId as greaterEqual.
     */
    public void setInternalStateId_GreaterEqual(Long internalStateId) {
        regInternalStateId(CK_GE, internalStateId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_STATE_ID: {NotNull, NUMBER(18)}
     * @param internalStateId The value of internalStateId as lessEqual.
     */
    public void setInternalStateId_LessEqual(Long internalStateId) {
        regInternalStateId(CK_LE, internalStateId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_STATE_ID: {NotNull, NUMBER(18)}
     * @param minNumber The min number of internalStateId. (NullAllowed)
     * @param maxNumber The max number of internalStateId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInternalStateId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueInternalStateId(), "INTERNAL_STATE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTERNAL_STATE_ID: {NotNull, NUMBER(18)}
     * @param internalStateIdList The collection of internalStateId as inScope.
     */
    public void setInternalStateId_InScope(Collection<Long> internalStateIdList) {
        doSetInternalStateId_InScope(internalStateIdList);
    }

    protected void doSetInternalStateId_InScope(Collection<Long> internalStateIdList) {
        regINS(CK_INS, cTL(internalStateIdList), getCValueInternalStateId(), "INTERNAL_STATE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTERNAL_STATE_ID: {NotNull, NUMBER(18)}
     * @param internalStateIdList The collection of internalStateId as notInScope.
     */
    public void setInternalStateId_NotInScope(Collection<Long> internalStateIdList) {
        doSetInternalStateId_NotInScope(internalStateIdList);
    }

    protected void doSetInternalStateId_NotInScope(Collection<Long> internalStateIdList) {
        regINS(CK_NINS, cTL(internalStateIdList), getCValueInternalStateId(), "INTERNAL_STATE_ID");
    }

    protected void regInternalStateId(ConditionKey k, Object v) { regQ(k, v, getCValueInternalStateId(), "INTERNAL_STATE_ID"); }
    abstract protected ConditionValue getCValueInternalStateId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param statusUpdateDatetime The value of statusUpdateDatetime as equal.
     */
    public void setStatusUpdateDatetime_Equal(java.sql.Timestamp statusUpdateDatetime) {
        regStatusUpdateDatetime(CK_EQ,  statusUpdateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param statusUpdateDatetime The value of statusUpdateDatetime as greaterThan.
     */
    public void setStatusUpdateDatetime_GreaterThan(java.sql.Timestamp statusUpdateDatetime) {
        regStatusUpdateDatetime(CK_GT,  statusUpdateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param statusUpdateDatetime The value of statusUpdateDatetime as lessThan.
     */
    public void setStatusUpdateDatetime_LessThan(java.sql.Timestamp statusUpdateDatetime) {
        regStatusUpdateDatetime(CK_LT,  statusUpdateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param statusUpdateDatetime The value of statusUpdateDatetime as greaterEqual.
     */
    public void setStatusUpdateDatetime_GreaterEqual(java.sql.Timestamp statusUpdateDatetime) {
        regStatusUpdateDatetime(CK_GE,  statusUpdateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param statusUpdateDatetime The value of statusUpdateDatetime as lessEqual.
     */
    public void setStatusUpdateDatetime_LessEqual(java.sql.Timestamp statusUpdateDatetime) {
        regStatusUpdateDatetime(CK_LE, statusUpdateDatetime);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of statusUpdateDatetime. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of statusUpdateDatetime. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setStatusUpdateDatetime_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueStatusUpdateDatetime(), "STATUS_UPDATE_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of statusUpdateDatetime. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of statusUpdateDatetime. (NullAllowed)
     */
    public void setStatusUpdateDatetime_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setStatusUpdateDatetime_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param statusUpdateDatetimeList The collection of statusUpdateDatetime as inScope.
     */
    public void setStatusUpdateDatetime_InScope(Collection<java.sql.Timestamp> statusUpdateDatetimeList) {
        doSetStatusUpdateDatetime_InScope(statusUpdateDatetimeList);
    }

    protected void doSetStatusUpdateDatetime_InScope(Collection<java.sql.Timestamp> statusUpdateDatetimeList) {
        regINS(CK_INS, cTL(statusUpdateDatetimeList), getCValueStatusUpdateDatetime(), "STATUS_UPDATE_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * STATUS_UPDATE_DATETIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param statusUpdateDatetimeList The collection of statusUpdateDatetime as notInScope.
     */
    public void setStatusUpdateDatetime_NotInScope(Collection<java.sql.Timestamp> statusUpdateDatetimeList) {
        doSetStatusUpdateDatetime_NotInScope(statusUpdateDatetimeList);
    }

    protected void doSetStatusUpdateDatetime_NotInScope(Collection<java.sql.Timestamp> statusUpdateDatetimeList) {
        regINS(CK_NINS, cTL(statusUpdateDatetimeList), getCValueStatusUpdateDatetime(), "STATUS_UPDATE_DATETIME");
    }

    protected void regStatusUpdateDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueStatusUpdateDatetime(), "STATUS_UPDATE_DATETIME"); }
    abstract protected ConditionValue getCValueStatusUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARTICIPANT_NAME: {VARCHAR2(200)}
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
     * PARTICIPANT_NAME: {VARCHAR2(200)}
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
     * PARTICIPANT_NAME: {VARCHAR2(200)}
     * @param participantNameList The collection of participantName as inScope.
     */
    public void setParticipantName_InScope(Collection<String> participantNameList) {
        doSetParticipantName_InScope(participantNameList);
    }

    public void doSetParticipantName_InScope(Collection<String> participantNameList) {
        regINS(CK_INS, cTL(participantNameList), getCValueParticipantName(), "PARTICIPANT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PARTICIPANT_NAME: {VARCHAR2(200)}
     * @param participantNameList The collection of participantName as notInScope.
     */
    public void setParticipantName_NotInScope(Collection<String> participantNameList) {
        doSetParticipantName_NotInScope(participantNameList);
    }

    public void doSetParticipantName_NotInScope(Collection<String> participantNameList) {
        regINS(CK_NINS, cTL(participantNameList), getCValueParticipantName(), "PARTICIPANT_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANT_NAME: {VARCHAR2(200)}
     * @param participantName The value of participantName as prefixSearch.
     */
    public void setParticipantName_PrefixSearch(String participantName) {
        setParticipantName_LikeSearch(participantName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANT_NAME: {VARCHAR2(200)}
     * @param participantName The value of participantName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setParticipantName_LikeSearch(String participantName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(participantName), getCValueParticipantName(), "PARTICIPANT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANT_NAME: {VARCHAR2(200)}
     * @param participantName The value of participantName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setParticipantName_NotLikeSearch(String participantName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(participantName), getCValueParticipantName(), "PARTICIPANT_NAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PARTICIPANT_NAME: {VARCHAR2(200)}
     */
    public void setParticipantName_IsNull() { regParticipantName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * PARTICIPANT_NAME: {VARCHAR2(200)}
     */
    public void setParticipantName_IsNullOrEmpty() { regParticipantName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PARTICIPANT_NAME: {VARCHAR2(200)}
     */
    public void setParticipantName_IsNotNull() { regParticipantName(CK_ISNN, DOBJ); }

    protected void regParticipantName(ConditionKey k, Object v) { regQ(k, v, getCValueParticipantName(), "PARTICIPANT_NAME"); }
    abstract protected ConditionValue getCValueParticipantName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARTICIPANT_TYPE: {VARCHAR2(200)}
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
     * PARTICIPANT_TYPE: {VARCHAR2(200)}
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
     * PARTICIPANT_TYPE: {VARCHAR2(200)}
     * @param participantTypeList The collection of participantType as inScope.
     */
    public void setParticipantType_InScope(Collection<String> participantTypeList) {
        doSetParticipantType_InScope(participantTypeList);
    }

    public void doSetParticipantType_InScope(Collection<String> participantTypeList) {
        regINS(CK_INS, cTL(participantTypeList), getCValueParticipantType(), "PARTICIPANT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PARTICIPANT_TYPE: {VARCHAR2(200)}
     * @param participantTypeList The collection of participantType as notInScope.
     */
    public void setParticipantType_NotInScope(Collection<String> participantTypeList) {
        doSetParticipantType_NotInScope(participantTypeList);
    }

    public void doSetParticipantType_NotInScope(Collection<String> participantTypeList) {
        regINS(CK_NINS, cTL(participantTypeList), getCValueParticipantType(), "PARTICIPANT_TYPE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANT_TYPE: {VARCHAR2(200)}
     * @param participantType The value of participantType as prefixSearch.
     */
    public void setParticipantType_PrefixSearch(String participantType) {
        setParticipantType_LikeSearch(participantType, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANT_TYPE: {VARCHAR2(200)}
     * @param participantType The value of participantType as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setParticipantType_LikeSearch(String participantType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(participantType), getCValueParticipantType(), "PARTICIPANT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANT_TYPE: {VARCHAR2(200)}
     * @param participantType The value of participantType as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setParticipantType_NotLikeSearch(String participantType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(participantType), getCValueParticipantType(), "PARTICIPANT_TYPE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PARTICIPANT_TYPE: {VARCHAR2(200)}
     */
    public void setParticipantType_IsNull() { regParticipantType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * PARTICIPANT_TYPE: {VARCHAR2(200)}
     */
    public void setParticipantType_IsNullOrEmpty() { regParticipantType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PARTICIPANT_TYPE: {VARCHAR2(200)}
     */
    public void setParticipantType_IsNotNull() { regParticipantType(CK_ISNN, DOBJ); }

    protected void regParticipantType(ConditionKey k, Object v) { regQ(k, v, getCValueParticipantType(), "PARTICIPANT_TYPE"); }
    abstract protected ConditionValue getCValueParticipantType();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_PATH_ID: {NotNull, NUMBER(18)}
     * @param internalPathId The value of internalPathId as equal.
     */
    public void setInternalPathId_Equal(Long internalPathId) {
        doSetInternalPathId_Equal(internalPathId);
    }

    protected void doSetInternalPathId_Equal(Long internalPathId) {
        regInternalPathId(CK_EQ, internalPathId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_PATH_ID: {NotNull, NUMBER(18)}
     * @param internalPathId The value of internalPathId as greaterThan.
     */
    public void setInternalPathId_GreaterThan(Long internalPathId) {
        regInternalPathId(CK_GT, internalPathId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_PATH_ID: {NotNull, NUMBER(18)}
     * @param internalPathId The value of internalPathId as lessThan.
     */
    public void setInternalPathId_LessThan(Long internalPathId) {
        regInternalPathId(CK_LT, internalPathId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_PATH_ID: {NotNull, NUMBER(18)}
     * @param internalPathId The value of internalPathId as greaterEqual.
     */
    public void setInternalPathId_GreaterEqual(Long internalPathId) {
        regInternalPathId(CK_GE, internalPathId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_PATH_ID: {NotNull, NUMBER(18)}
     * @param internalPathId The value of internalPathId as lessEqual.
     */
    public void setInternalPathId_LessEqual(Long internalPathId) {
        regInternalPathId(CK_LE, internalPathId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_PATH_ID: {NotNull, NUMBER(18)}
     * @param minNumber The min number of internalPathId. (NullAllowed)
     * @param maxNumber The max number of internalPathId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInternalPathId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueInternalPathId(), "INTERNAL_PATH_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTERNAL_PATH_ID: {NotNull, NUMBER(18)}
     * @param internalPathIdList The collection of internalPathId as inScope.
     */
    public void setInternalPathId_InScope(Collection<Long> internalPathIdList) {
        doSetInternalPathId_InScope(internalPathIdList);
    }

    protected void doSetInternalPathId_InScope(Collection<Long> internalPathIdList) {
        regINS(CK_INS, cTL(internalPathIdList), getCValueInternalPathId(), "INTERNAL_PATH_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTERNAL_PATH_ID: {NotNull, NUMBER(18)}
     * @param internalPathIdList The collection of internalPathId as notInScope.
     */
    public void setInternalPathId_NotInScope(Collection<Long> internalPathIdList) {
        doSetInternalPathId_NotInScope(internalPathIdList);
    }

    protected void doSetInternalPathId_NotInScope(Collection<Long> internalPathIdList) {
        regINS(CK_NINS, cTL(internalPathIdList), getCValueInternalPathId(), "INTERNAL_PATH_ID");
    }

    protected void regInternalPathId(ConditionKey k, Object v) { regQ(k, v, getCValueInternalPathId(), "INTERNAL_PATH_ID"); }
    abstract protected ConditionValue getCValueInternalPathId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STATUS_PATH_NAME: {NotNull, VARCHAR2(100)}
     * @param statusPathName The value of statusPathName as equal.
     */
    public void setStatusPathName_Equal(String statusPathName) {
        doSetStatusPathName_Equal(fRES(statusPathName));
    }

    protected void doSetStatusPathName_Equal(String statusPathName) {
        regStatusPathName(CK_EQ, statusPathName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STATUS_PATH_NAME: {NotNull, VARCHAR2(100)}
     * @param statusPathName The value of statusPathName as notEqual.
     */
    public void setStatusPathName_NotEqual(String statusPathName) {
        doSetStatusPathName_NotEqual(fRES(statusPathName));
    }

    protected void doSetStatusPathName_NotEqual(String statusPathName) {
        regStatusPathName(CK_NES, statusPathName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STATUS_PATH_NAME: {NotNull, VARCHAR2(100)}
     * @param statusPathNameList The collection of statusPathName as inScope.
     */
    public void setStatusPathName_InScope(Collection<String> statusPathNameList) {
        doSetStatusPathName_InScope(statusPathNameList);
    }

    public void doSetStatusPathName_InScope(Collection<String> statusPathNameList) {
        regINS(CK_INS, cTL(statusPathNameList), getCValueStatusPathName(), "STATUS_PATH_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STATUS_PATH_NAME: {NotNull, VARCHAR2(100)}
     * @param statusPathNameList The collection of statusPathName as notInScope.
     */
    public void setStatusPathName_NotInScope(Collection<String> statusPathNameList) {
        doSetStatusPathName_NotInScope(statusPathNameList);
    }

    public void doSetStatusPathName_NotInScope(Collection<String> statusPathNameList) {
        regINS(CK_NINS, cTL(statusPathNameList), getCValueStatusPathName(), "STATUS_PATH_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STATUS_PATH_NAME: {NotNull, VARCHAR2(100)}
     * @param statusPathName The value of statusPathName as prefixSearch.
     */
    public void setStatusPathName_PrefixSearch(String statusPathName) {
        setStatusPathName_LikeSearch(statusPathName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STATUS_PATH_NAME: {NotNull, VARCHAR2(100)}
     * @param statusPathName The value of statusPathName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatusPathName_LikeSearch(String statusPathName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(statusPathName), getCValueStatusPathName(), "STATUS_PATH_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STATUS_PATH_NAME: {NotNull, VARCHAR2(100)}
     * @param statusPathName The value of statusPathName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStatusPathName_NotLikeSearch(String statusPathName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(statusPathName), getCValueStatusPathName(), "STATUS_PATH_NAME", likeSearchOption);
    }

    protected void regStatusPathName(ConditionKey k, Object v) { regQ(k, v, getCValueStatusPathName(), "STATUS_PATH_NAME"); }
    abstract protected ConditionValue getCValueStatusPathName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_DATA_ID: {NotNull, NUMBER(18)}
     * @param internalDataId The value of internalDataId as equal.
     */
    public void setInternalDataId_Equal(Long internalDataId) {
        doSetInternalDataId_Equal(internalDataId);
    }

    protected void doSetInternalDataId_Equal(Long internalDataId) {
        regInternalDataId(CK_EQ, internalDataId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_DATA_ID: {NotNull, NUMBER(18)}
     * @param internalDataId The value of internalDataId as greaterThan.
     */
    public void setInternalDataId_GreaterThan(Long internalDataId) {
        regInternalDataId(CK_GT, internalDataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_DATA_ID: {NotNull, NUMBER(18)}
     * @param internalDataId The value of internalDataId as lessThan.
     */
    public void setInternalDataId_LessThan(Long internalDataId) {
        regInternalDataId(CK_LT, internalDataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_DATA_ID: {NotNull, NUMBER(18)}
     * @param internalDataId The value of internalDataId as greaterEqual.
     */
    public void setInternalDataId_GreaterEqual(Long internalDataId) {
        regInternalDataId(CK_GE, internalDataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_DATA_ID: {NotNull, NUMBER(18)}
     * @param internalDataId The value of internalDataId as lessEqual.
     */
    public void setInternalDataId_LessEqual(Long internalDataId) {
        regInternalDataId(CK_LE, internalDataId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_DATA_ID: {NotNull, NUMBER(18)}
     * @param minNumber The min number of internalDataId. (NullAllowed)
     * @param maxNumber The max number of internalDataId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInternalDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueInternalDataId(), "INTERNAL_DATA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTERNAL_DATA_ID: {NotNull, NUMBER(18)}
     * @param internalDataIdList The collection of internalDataId as inScope.
     */
    public void setInternalDataId_InScope(Collection<Long> internalDataIdList) {
        doSetInternalDataId_InScope(internalDataIdList);
    }

    protected void doSetInternalDataId_InScope(Collection<Long> internalDataIdList) {
        regINS(CK_INS, cTL(internalDataIdList), getCValueInternalDataId(), "INTERNAL_DATA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTERNAL_DATA_ID: {NotNull, NUMBER(18)}
     * @param internalDataIdList The collection of internalDataId as notInScope.
     */
    public void setInternalDataId_NotInScope(Collection<Long> internalDataIdList) {
        doSetInternalDataId_NotInScope(internalDataIdList);
    }

    protected void doSetInternalDataId_NotInScope(Collection<Long> internalDataIdList) {
        regINS(CK_NINS, cTL(internalDataIdList), getCValueInternalDataId(), "INTERNAL_DATA_ID");
    }

    protected void regInternalDataId(ConditionKey k, Object v) { regQ(k, v, getCValueInternalDataId(), "INTERNAL_DATA_ID"); }
    abstract protected ConditionValue getCValueInternalDataId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
     * @param internalPkValue The value of internalPkValue as equal.
     */
    public void setInternalPkValue_Equal(Long internalPkValue) {
        doSetInternalPkValue_Equal(internalPkValue);
    }

    protected void doSetInternalPkValue_Equal(Long internalPkValue) {
        regInternalPkValue(CK_EQ, internalPkValue);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
     * @param internalPkValue The value of internalPkValue as greaterThan.
     */
    public void setInternalPkValue_GreaterThan(Long internalPkValue) {
        regInternalPkValue(CK_GT, internalPkValue);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
     * @param internalPkValue The value of internalPkValue as lessThan.
     */
    public void setInternalPkValue_LessThan(Long internalPkValue) {
        regInternalPkValue(CK_LT, internalPkValue);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
     * @param internalPkValue The value of internalPkValue as greaterEqual.
     */
    public void setInternalPkValue_GreaterEqual(Long internalPkValue) {
        regInternalPkValue(CK_GE, internalPkValue);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
     * @param internalPkValue The value of internalPkValue as lessEqual.
     */
    public void setInternalPkValue_LessEqual(Long internalPkValue) {
        regInternalPkValue(CK_LE, internalPkValue);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
     * @param minNumber The min number of internalPkValue. (NullAllowed)
     * @param maxNumber The max number of internalPkValue. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInternalPkValue_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueInternalPkValue(), "INTERNAL_PK_VALUE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
     * @param internalPkValueList The collection of internalPkValue as inScope.
     */
    public void setInternalPkValue_InScope(Collection<Long> internalPkValueList) {
        doSetInternalPkValue_InScope(internalPkValueList);
    }

    protected void doSetInternalPkValue_InScope(Collection<Long> internalPkValueList) {
        regINS(CK_INS, cTL(internalPkValueList), getCValueInternalPkValue(), "INTERNAL_PK_VALUE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
     * @param internalPkValueList The collection of internalPkValue as notInScope.
     */
    public void setInternalPkValue_NotInScope(Collection<Long> internalPkValueList) {
        doSetInternalPkValue_NotInScope(internalPkValueList);
    }

    protected void doSetInternalPkValue_NotInScope(Collection<Long> internalPkValueList) {
        regINS(CK_NINS, cTL(internalPkValueList), getCValueInternalPkValue(), "INTERNAL_PK_VALUE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
     */
    public void setInternalPkValue_IsNull() { regInternalPkValue(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * INTERNAL_PK_VALUE: {NUMBER(18), FK to DOCUMENT}
     */
    public void setInternalPkValue_IsNotNull() { regInternalPkValue(CK_ISNN, DOBJ); }

    protected void regInternalPkValue(ConditionKey k, Object v) { regQ(k, v, getCValueInternalPkValue(), "INTERNAL_PK_VALUE"); }
    abstract protected ConditionValue getCValueInternalPkValue();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_DATA_TYPE: {NotNull, VARCHAR2(200)}
     * @param internalDataType The value of internalDataType as equal.
     */
    public void setInternalDataType_Equal(String internalDataType) {
        doSetInternalDataType_Equal(fRES(internalDataType));
    }

    protected void doSetInternalDataType_Equal(String internalDataType) {
        regInternalDataType(CK_EQ, internalDataType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_DATA_TYPE: {NotNull, VARCHAR2(200)}
     * @param internalDataType The value of internalDataType as notEqual.
     */
    public void setInternalDataType_NotEqual(String internalDataType) {
        doSetInternalDataType_NotEqual(fRES(internalDataType));
    }

    protected void doSetInternalDataType_NotEqual(String internalDataType) {
        regInternalDataType(CK_NES, internalDataType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * INTERNAL_DATA_TYPE: {NotNull, VARCHAR2(200)}
     * @param internalDataTypeList The collection of internalDataType as inScope.
     */
    public void setInternalDataType_InScope(Collection<String> internalDataTypeList) {
        doSetInternalDataType_InScope(internalDataTypeList);
    }

    public void doSetInternalDataType_InScope(Collection<String> internalDataTypeList) {
        regINS(CK_INS, cTL(internalDataTypeList), getCValueInternalDataType(), "INTERNAL_DATA_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * INTERNAL_DATA_TYPE: {NotNull, VARCHAR2(200)}
     * @param internalDataTypeList The collection of internalDataType as notInScope.
     */
    public void setInternalDataType_NotInScope(Collection<String> internalDataTypeList) {
        doSetInternalDataType_NotInScope(internalDataTypeList);
    }

    public void doSetInternalDataType_NotInScope(Collection<String> internalDataTypeList) {
        regINS(CK_NINS, cTL(internalDataTypeList), getCValueInternalDataType(), "INTERNAL_DATA_TYPE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * INTERNAL_DATA_TYPE: {NotNull, VARCHAR2(200)}
     * @param internalDataType The value of internalDataType as prefixSearch.
     */
    public void setInternalDataType_PrefixSearch(String internalDataType) {
        setInternalDataType_LikeSearch(internalDataType, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * INTERNAL_DATA_TYPE: {NotNull, VARCHAR2(200)}
     * @param internalDataType The value of internalDataType as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInternalDataType_LikeSearch(String internalDataType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(internalDataType), getCValueInternalDataType(), "INTERNAL_DATA_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * INTERNAL_DATA_TYPE: {NotNull, VARCHAR2(200)}
     * @param internalDataType The value of internalDataType as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInternalDataType_NotLikeSearch(String internalDataType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(internalDataType), getCValueInternalDataType(), "INTERNAL_DATA_TYPE", likeSearchOption);
    }

    protected void regInternalDataType(ConditionKey k, Object v) { regQ(k, v, getCValueInternalDataType(), "INTERNAL_DATA_TYPE"); }
    abstract protected ConditionValue getCValueInternalDataType();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_USER_ID: {NUMBER(18)}
     * @param internalUserId The value of internalUserId as equal.
     */
    public void setInternalUserId_Equal(Long internalUserId) {
        doSetInternalUserId_Equal(internalUserId);
    }

    protected void doSetInternalUserId_Equal(Long internalUserId) {
        regInternalUserId(CK_EQ, internalUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_USER_ID: {NUMBER(18)}
     * @param internalUserId The value of internalUserId as greaterThan.
     */
    public void setInternalUserId_GreaterThan(Long internalUserId) {
        regInternalUserId(CK_GT, internalUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_USER_ID: {NUMBER(18)}
     * @param internalUserId The value of internalUserId as lessThan.
     */
    public void setInternalUserId_LessThan(Long internalUserId) {
        regInternalUserId(CK_LT, internalUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_USER_ID: {NUMBER(18)}
     * @param internalUserId The value of internalUserId as greaterEqual.
     */
    public void setInternalUserId_GreaterEqual(Long internalUserId) {
        regInternalUserId(CK_GE, internalUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_USER_ID: {NUMBER(18)}
     * @param internalUserId The value of internalUserId as lessEqual.
     */
    public void setInternalUserId_LessEqual(Long internalUserId) {
        regInternalUserId(CK_LE, internalUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * INTERNAL_USER_ID: {NUMBER(18)}
     * @param minNumber The min number of internalUserId. (NullAllowed)
     * @param maxNumber The max number of internalUserId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInternalUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueInternalUserId(), "INTERNAL_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTERNAL_USER_ID: {NUMBER(18)}
     * @param internalUserIdList The collection of internalUserId as inScope.
     */
    public void setInternalUserId_InScope(Collection<Long> internalUserIdList) {
        doSetInternalUserId_InScope(internalUserIdList);
    }

    protected void doSetInternalUserId_InScope(Collection<Long> internalUserIdList) {
        regINS(CK_INS, cTL(internalUserIdList), getCValueInternalUserId(), "INTERNAL_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * INTERNAL_USER_ID: {NUMBER(18)}
     * @param internalUserIdList The collection of internalUserId as notInScope.
     */
    public void setInternalUserId_NotInScope(Collection<Long> internalUserIdList) {
        doSetInternalUserId_NotInScope(internalUserIdList);
    }

    protected void doSetInternalUserId_NotInScope(Collection<Long> internalUserIdList) {
        regINS(CK_NINS, cTL(internalUserIdList), getCValueInternalUserId(), "INTERNAL_USER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * INTERNAL_USER_ID: {NUMBER(18)}
     */
    public void setInternalUserId_IsNull() { regInternalUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * INTERNAL_USER_ID: {NUMBER(18)}
     */
    public void setInternalUserId_IsNotNull() { regInternalUserId(CK_ISNN, DOBJ); }

    protected void regInternalUserId(ConditionKey k, Object v) { regQ(k, v, getCValueInternalUserId(), "INTERNAL_USER_ID"); }
    abstract protected ConditionValue getCValueInternalUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STATUS_UPDATE_USER: {VARCHAR2(100)}
     * @param statusUpdateUser The value of statusUpdateUser as equal.
     */
    public void setStatusUpdateUser_Equal(String statusUpdateUser) {
        doSetStatusUpdateUser_Equal(fRES(statusUpdateUser));
    }

    protected void doSetStatusUpdateUser_Equal(String statusUpdateUser) {
        regStatusUpdateUser(CK_EQ, statusUpdateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * STATUS_UPDATE_USER: {VARCHAR2(100)}
     * @param statusUpdateUser The value of statusUpdateUser as notEqual.
     */
    public void setStatusUpdateUser_NotEqual(String statusUpdateUser) {
        doSetStatusUpdateUser_NotEqual(fRES(statusUpdateUser));
    }

    protected void doSetStatusUpdateUser_NotEqual(String statusUpdateUser) {
        regStatusUpdateUser(CK_NES, statusUpdateUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STATUS_UPDATE_USER: {VARCHAR2(100)}
     * @param statusUpdateUserList The collection of statusUpdateUser as inScope.
     */
    public void setStatusUpdateUser_InScope(Collection<String> statusUpdateUserList) {
        doSetStatusUpdateUser_InScope(statusUpdateUserList);
    }

    public void doSetStatusUpdateUser_InScope(Collection<String> statusUpdateUserList) {
        regINS(CK_INS, cTL(statusUpdateUserList), getCValueStatusUpdateUser(), "STATUS_UPDATE_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * STATUS_UPDATE_USER: {VARCHAR2(100)}
     * @param statusUpdateUserList The collection of statusUpdateUser as notInScope.
     */
    public void setStatusUpdateUser_NotInScope(Collection<String> statusUpdateUserList) {
        doSetStatusUpdateUser_NotInScope(statusUpdateUserList);
    }

    public void doSetStatusUpdateUser_NotInScope(Collection<String> statusUpdateUserList) {
        regINS(CK_NINS, cTL(statusUpdateUserList), getCValueStatusUpdateUser(), "STATUS_UPDATE_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STATUS_UPDATE_USER: {VARCHAR2(100)}
     * @param statusUpdateUser The value of statusUpdateUser as prefixSearch.
     */
    public void setStatusUpdateUser_PrefixSearch(String statusUpdateUser) {
        setStatusUpdateUser_LikeSearch(statusUpdateUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STATUS_UPDATE_USER: {VARCHAR2(100)}
     * @param statusUpdateUser The value of statusUpdateUser as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStatusUpdateUser_LikeSearch(String statusUpdateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(statusUpdateUser), getCValueStatusUpdateUser(), "STATUS_UPDATE_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * STATUS_UPDATE_USER: {VARCHAR2(100)}
     * @param statusUpdateUser The value of statusUpdateUser as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStatusUpdateUser_NotLikeSearch(String statusUpdateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(statusUpdateUser), getCValueStatusUpdateUser(), "STATUS_UPDATE_USER", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * STATUS_UPDATE_USER: {VARCHAR2(100)}
     */
    public void setStatusUpdateUser_IsNull() { regStatusUpdateUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * STATUS_UPDATE_USER: {VARCHAR2(100)}
     */
    public void setStatusUpdateUser_IsNullOrEmpty() { regStatusUpdateUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * STATUS_UPDATE_USER: {VARCHAR2(100)}
     */
    public void setStatusUpdateUser_IsNotNull() { regStatusUpdateUser(CK_ISNN, DOBJ); }

    protected void regStatusUpdateUser(ConditionKey k, Object v) { regQ(k, v, getCValueStatusUpdateUser(), "STATUS_UPDATE_USER"); }
    abstract protected ConditionValue getCValueStatusUpdateUser();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return BuriAllRoundStateHistoryCB.class.getName(); }
    protected String xabCQ() { return BuriAllRoundStateHistoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}

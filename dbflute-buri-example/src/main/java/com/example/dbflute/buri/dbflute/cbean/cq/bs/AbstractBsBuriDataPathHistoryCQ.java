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
 * The abstract condition-query of BURIDATAPATHHISTORY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBuriDataPathHistoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBuriDataPathHistoryCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BURIDATAPATHHISTORY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * HISTORYID: {PK, NotNull, NUMBER(18)}
     * @param historyId The value of historyId as equal.
     */
    public void setHistoryId_Equal(Long historyId) {
        doSetHistoryId_Equal(historyId);
    }

    protected void doSetHistoryId_Equal(Long historyId) {
        regHistoryId(CK_EQ, historyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * HISTORYID: {PK, NotNull, NUMBER(18)}
     * @param historyId The value of historyId as greaterThan.
     */
    public void setHistoryId_GreaterThan(Long historyId) {
        regHistoryId(CK_GT, historyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * HISTORYID: {PK, NotNull, NUMBER(18)}
     * @param historyId The value of historyId as lessThan.
     */
    public void setHistoryId_LessThan(Long historyId) {
        regHistoryId(CK_LT, historyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * HISTORYID: {PK, NotNull, NUMBER(18)}
     * @param historyId The value of historyId as greaterEqual.
     */
    public void setHistoryId_GreaterEqual(Long historyId) {
        regHistoryId(CK_GE, historyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * HISTORYID: {PK, NotNull, NUMBER(18)}
     * @param historyId The value of historyId as lessEqual.
     */
    public void setHistoryId_LessEqual(Long historyId) {
        regHistoryId(CK_LE, historyId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * HISTORYID: {PK, NotNull, NUMBER(18)}
     * @param minNumber The min number of historyId. (NullAllowed)
     * @param maxNumber The max number of historyId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHistoryId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueHistoryId(), "HISTORYID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * HISTORYID: {PK, NotNull, NUMBER(18)}
     * @param historyIdList The collection of historyId as inScope.
     */
    public void setHistoryId_InScope(Collection<Long> historyIdList) {
        doSetHistoryId_InScope(historyIdList);
    }

    protected void doSetHistoryId_InScope(Collection<Long> historyIdList) {
        regINS(CK_INS, cTL(historyIdList), getCValueHistoryId(), "HISTORYID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * HISTORYID: {PK, NotNull, NUMBER(18)}
     * @param historyIdList The collection of historyId as notInScope.
     */
    public void setHistoryId_NotInScope(Collection<Long> historyIdList) {
        doSetHistoryId_NotInScope(historyIdList);
    }

    protected void doSetHistoryId_NotInScope(Collection<Long> historyIdList) {
        regINS(CK_NINS, cTL(historyIdList), getCValueHistoryId(), "HISTORYID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * HISTORYID: {PK, NotNull, NUMBER(18)}
     */
    public void setHistoryId_IsNull() { regHistoryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * HISTORYID: {PK, NotNull, NUMBER(18)}
     */
    public void setHistoryId_IsNotNull() { regHistoryId(CK_ISNN, DOBJ); }

    protected void regHistoryId(ConditionKey k, Object v) { regQ(k, v, getCValueHistoryId(), "HISTORYID"); }
    abstract protected ConditionValue getCValueHistoryId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18)}
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
     * PATHID: {IX, NUMBER(18)}
     * @param pathId The value of pathId as greaterThan.
     */
    public void setPathId_GreaterThan(Long pathId) {
        regPathId(CK_GT, pathId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18)}
     * @param pathId The value of pathId as lessThan.
     */
    public void setPathId_LessThan(Long pathId) {
        regPathId(CK_LT, pathId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18)}
     * @param pathId The value of pathId as greaterEqual.
     */
    public void setPathId_GreaterEqual(Long pathId) {
        regPathId(CK_GE, pathId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18)}
     * @param pathId The value of pathId as lessEqual.
     */
    public void setPathId_LessEqual(Long pathId) {
        regPathId(CK_LE, pathId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18)}
     * @param minNumber The min number of pathId. (NullAllowed)
     * @param maxNumber The max number of pathId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPathId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePathId(), "PATHID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PATHID: {IX, NUMBER(18)}
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
     * PATHID: {IX, NUMBER(18)}
     * @param pathIdList The collection of pathId as notInScope.
     */
    public void setPathId_NotInScope(Collection<Long> pathIdList) {
        doSetPathId_NotInScope(pathIdList);
    }

    protected void doSetPathId_NotInScope(Collection<Long> pathIdList) {
        regINS(CK_NINS, cTL(pathIdList), getCValuePathId(), "PATHID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18)}
     */
    public void setPathId_IsNull() { regPathId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PATHID: {IX, NUMBER(18)}
     */
    public void setPathId_IsNotNull() { regPathId(CK_ISNN, DOBJ); }

    protected void regPathId(ConditionKey k, Object v) { regQ(k, v, getCValuePathId(), "PATHID"); }
    abstract protected ConditionValue getCValuePathId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PATHNAME: {VARCHAR2(200)}
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
     * PATHNAME: {VARCHAR2(200)}
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
     * PATHNAME: {VARCHAR2(200)}
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
     * PATHNAME: {VARCHAR2(200)}
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
     * PATHNAME: {VARCHAR2(200)}
     * @param pathName The value of pathName as prefixSearch.
     */
    public void setPathName_PrefixSearch(String pathName) {
        setPathName_LikeSearch(pathName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PATHNAME: {VARCHAR2(200)}
     * @param pathName The value of pathName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPathName_LikeSearch(String pathName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pathName), getCValuePathName(), "PATHNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PATHNAME: {VARCHAR2(200)}
     * @param pathName The value of pathName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPathName_NotLikeSearch(String pathName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pathName), getCValuePathName(), "PATHNAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PATHNAME: {VARCHAR2(200)}
     */
    public void setPathName_IsNull() { regPathName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * PATHNAME: {VARCHAR2(200)}
     */
    public void setPathName_IsNullOrEmpty() { regPathName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PATHNAME: {VARCHAR2(200)}
     */
    public void setPathName_IsNotNull() { regPathName(CK_ISNN, DOBJ); }

    protected void regPathName(ConditionKey k, Object v) { regQ(k, v, getCValuePathName(), "PATHNAME"); }
    abstract protected ConditionValue getCValuePathName();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18)}
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
     * DATAID: {IX, NUMBER(18)}
     * @param dataId The value of dataId as greaterThan.
     */
    public void setDataId_GreaterThan(Long dataId) {
        regDataId(CK_GT, dataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18)}
     * @param dataId The value of dataId as lessThan.
     */
    public void setDataId_LessThan(Long dataId) {
        regDataId(CK_LT, dataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18)}
     * @param dataId The value of dataId as greaterEqual.
     */
    public void setDataId_GreaterEqual(Long dataId) {
        regDataId(CK_GE, dataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18)}
     * @param dataId The value of dataId as lessEqual.
     */
    public void setDataId_LessEqual(Long dataId) {
        regDataId(CK_LE, dataId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18)}
     * @param minNumber The min number of dataId. (NullAllowed)
     * @param maxNumber The max number of dataId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDataId(), "DATAID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DATAID: {IX, NUMBER(18)}
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
     * DATAID: {IX, NUMBER(18)}
     * @param dataIdList The collection of dataId as notInScope.
     */
    public void setDataId_NotInScope(Collection<Long> dataIdList) {
        doSetDataId_NotInScope(dataIdList);
    }

    protected void doSetDataId_NotInScope(Collection<Long> dataIdList) {
        regINS(CK_NINS, cTL(dataIdList), getCValueDataId(), "DATAID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18)}
     */
    public void setDataId_IsNull() { regDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * DATAID: {IX, NUMBER(18)}
     */
    public void setDataId_IsNotNull() { regDataId(CK_ISNN, DOBJ); }

    protected void regDataId(ConditionKey k, Object v) { regQ(k, v, getCValueDataId(), "DATAID"); }
    abstract protected ConditionValue getCValueDataId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ACTION: {VARCHAR2(50)}
     * @param action The value of action as equal.
     */
    public void setAction_Equal(String action) {
        doSetAction_Equal(fRES(action));
    }

    protected void doSetAction_Equal(String action) {
        regAction(CK_EQ, action);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ACTION: {VARCHAR2(50)}
     * @param action The value of action as notEqual.
     */
    public void setAction_NotEqual(String action) {
        doSetAction_NotEqual(fRES(action));
    }

    protected void doSetAction_NotEqual(String action) {
        regAction(CK_NES, action);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ACTION: {VARCHAR2(50)}
     * @param actionList The collection of action as inScope.
     */
    public void setAction_InScope(Collection<String> actionList) {
        doSetAction_InScope(actionList);
    }

    public void doSetAction_InScope(Collection<String> actionList) {
        regINS(CK_INS, cTL(actionList), getCValueAction(), "ACTION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ACTION: {VARCHAR2(50)}
     * @param actionList The collection of action as notInScope.
     */
    public void setAction_NotInScope(Collection<String> actionList) {
        doSetAction_NotInScope(actionList);
    }

    public void doSetAction_NotInScope(Collection<String> actionList) {
        regINS(CK_NINS, cTL(actionList), getCValueAction(), "ACTION");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ACTION: {VARCHAR2(50)}
     * @param action The value of action as prefixSearch.
     */
    public void setAction_PrefixSearch(String action) {
        setAction_LikeSearch(action, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ACTION: {VARCHAR2(50)}
     * @param action The value of action as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAction_LikeSearch(String action, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(action), getCValueAction(), "ACTION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ACTION: {VARCHAR2(50)}
     * @param action The value of action as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAction_NotLikeSearch(String action, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(action), getCValueAction(), "ACTION", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ACTION: {VARCHAR2(50)}
     */
    public void setAction_IsNull() { regAction(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * ACTION: {VARCHAR2(50)}
     */
    public void setAction_IsNullOrEmpty() { regAction(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ACTION: {VARCHAR2(50)}
     */
    public void setAction_IsNotNull() { regAction(CK_ISNN, DOBJ); }

    protected void regAction(ConditionKey k, Object v) { regQ(k, v, getCValueAction(), "ACTION"); }
    abstract protected ConditionValue getCValueAction();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {NUMBER(18)}
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
     * BURIUSERID: {NUMBER(18)}
     * @param buriUserId The value of buriUserId as greaterThan.
     */
    public void setBuriUserId_GreaterThan(Long buriUserId) {
        regBuriUserId(CK_GT, buriUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {NUMBER(18)}
     * @param buriUserId The value of buriUserId as lessThan.
     */
    public void setBuriUserId_LessThan(Long buriUserId) {
        regBuriUserId(CK_LT, buriUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {NUMBER(18)}
     * @param buriUserId The value of buriUserId as greaterEqual.
     */
    public void setBuriUserId_GreaterEqual(Long buriUserId) {
        regBuriUserId(CK_GE, buriUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {NUMBER(18)}
     * @param buriUserId The value of buriUserId as lessEqual.
     */
    public void setBuriUserId_LessEqual(Long buriUserId) {
        regBuriUserId(CK_LE, buriUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BURIUSERID: {NUMBER(18)}
     * @param minNumber The min number of buriUserId. (NullAllowed)
     * @param maxNumber The max number of buriUserId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBuriUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBuriUserId(), "BURIUSERID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BURIUSERID: {NUMBER(18)}
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
     * BURIUSERID: {NUMBER(18)}
     * @param buriUserIdList The collection of buriUserId as notInScope.
     */
    public void setBuriUserId_NotInScope(Collection<Long> buriUserIdList) {
        doSetBuriUserId_NotInScope(buriUserIdList);
    }

    protected void doSetBuriUserId_NotInScope(Collection<Long> buriUserIdList) {
        regINS(CK_NINS, cTL(buriUserIdList), getCValueBuriUserId(), "BURIUSERID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * BURIUSERID: {NUMBER(18)}
     */
    public void setBuriUserId_IsNull() { regBuriUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * BURIUSERID: {NUMBER(18)}
     */
    public void setBuriUserId_IsNotNull() { regBuriUserId(CK_ISNN, DOBJ); }

    protected void regBuriUserId(ConditionKey k, Object v) { regQ(k, v, getCValueBuriUserId(), "BURIUSERID"); }
    abstract protected ConditionValue getCValueBuriUserId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(18)}
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
     * BTID: {NotNull, NUMBER(18)}
     * @param btid The value of btid as greaterThan.
     */
    public void setBtid_GreaterThan(Long btid) {
        regBtid(CK_GT, btid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @param btid The value of btid as lessThan.
     */
    public void setBtid_LessThan(Long btid) {
        regBtid(CK_LT, btid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @param btid The value of btid as greaterEqual.
     */
    public void setBtid_GreaterEqual(Long btid) {
        regBtid(CK_GE, btid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @param btid The value of btid as lessEqual.
     */
    public void setBtid_LessEqual(Long btid) {
        regBtid(CK_LE, btid);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * BTID: {NotNull, NUMBER(18)}
     * @param minNumber The min number of btid. (NullAllowed)
     * @param maxNumber The max number of btid. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBtid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueBtid(), "BTID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * BTID: {NotNull, NUMBER(18)}
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
     * BTID: {NotNull, NUMBER(18)}
     * @param btidList The collection of btid as notInScope.
     */
    public void setBtid_NotInScope(Collection<Long> btidList) {
        doSetBtid_NotInScope(btidList);
    }

    protected void doSetBtid_NotInScope(Collection<Long> btidList) {
        regINS(CK_NINS, cTL(btidList), getCValueBtid(), "BTID");
    }

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

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;BuriDataPathHistoryCB&gt;() {
     *     public void query(BuriDataPathHistoryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriDataPathHistoryCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;BuriDataPathHistoryCB&gt;() {
     *     public void query(BuriDataPathHistoryCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriDataPathHistoryCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;BuriDataPathHistoryCB&gt;() {
     *     public void query(BuriDataPathHistoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriDataPathHistoryCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;BuriDataPathHistoryCB&gt;() {
     *     public void query(BuriDataPathHistoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriDataPathHistoryCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;BuriDataPathHistoryCB&gt;() {
     *     public void query(BuriDataPathHistoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriDataPathHistoryCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BuriDataPathHistoryCB&gt;() {
     *     public void query(BuriDataPathHistoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<BuriDataPathHistoryCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<BuriDataPathHistoryCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<BuriDataPathHistoryCB>(new HpSSQSetupper<BuriDataPathHistoryCB>() {
            public void setup(String function, SubQuery<BuriDataPathHistoryCB> subQuery, HpSSQOption<BuriDataPathHistoryCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<BuriDataPathHistoryCB> subQuery, String operand, HpSSQOption<BuriDataPathHistoryCB> option) {
        assertObjectNotNull("subQuery<BuriDataPathHistoryCB>", subQuery);
        BuriDataPathHistoryCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(BuriDataPathHistoryCQ subQuery);

    protected BuriDataPathHistoryCB xcreateScalarConditionCB() {
        BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected BuriDataPathHistoryCB xcreateScalarConditionPartitionByCB() {
        BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<BuriDataPathHistoryCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriDataPathHistoryCB>", subQuery);
        BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "HISTORYID", "HISTORYID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(BuriDataPathHistoryCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BuriDataPathHistoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<BuriDataPathHistoryCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<BuriDataPathHistoryCB>(new HpQDRSetupper<BuriDataPathHistoryCB>() {
            public void setup(String function, SubQuery<BuriDataPathHistoryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<BuriDataPathHistoryCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<BuriDataPathHistoryCB>", subQuery);
        BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "HISTORYID", "HISTORYID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(BuriDataPathHistoryCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<BuriDataPathHistoryCB> subQuery) {
        assertObjectNotNull("subQuery<BuriDataPathHistoryCB>", subQuery);
        BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(BuriDataPathHistoryCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<BuriDataPathHistoryCB> subQuery) {
        assertObjectNotNull("subQuery<BuriDataPathHistoryCB>", subQuery);
        BuriDataPathHistoryCB cb = new BuriDataPathHistoryCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(BuriDataPathHistoryCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return BuriDataPathHistoryCB.class.getName(); }
    protected String xabCQ() { return BuriDataPathHistoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}

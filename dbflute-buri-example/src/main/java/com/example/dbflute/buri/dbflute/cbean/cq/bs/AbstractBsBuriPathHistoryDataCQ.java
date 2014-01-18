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
 * The abstract condition-query of BURIPATHHISTORYDATA.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBuriPathHistoryDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBuriPathHistoryDataCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "BURIPATHHISTORYDATA";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {NotNull, NUMBER(18)}
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
     * PATHID: {NotNull, NUMBER(18)}
     * @param pathId The value of pathId as greaterThan.
     */
    public void setPathId_GreaterThan(Long pathId) {
        regPathId(CK_GT, pathId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {NotNull, NUMBER(18)}
     * @param pathId The value of pathId as lessThan.
     */
    public void setPathId_LessThan(Long pathId) {
        regPathId(CK_LT, pathId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {NotNull, NUMBER(18)}
     * @param pathId The value of pathId as greaterEqual.
     */
    public void setPathId_GreaterEqual(Long pathId) {
        regPathId(CK_GE, pathId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {NotNull, NUMBER(18)}
     * @param pathId The value of pathId as lessEqual.
     */
    public void setPathId_LessEqual(Long pathId) {
        regPathId(CK_LE, pathId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PATHID: {NotNull, NUMBER(18)}
     * @param minNumber The min number of pathId. (NullAllowed)
     * @param maxNumber The max number of pathId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPathId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePathId(), "PATHID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PATHID: {NotNull, NUMBER(18)}
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
     * PATHID: {NotNull, NUMBER(18)}
     * @param pathIdList The collection of pathId as notInScope.
     */
    public void setPathId_NotInScope(Collection<Long> pathIdList) {
        doSetPathId_NotInScope(pathIdList);
    }

    protected void doSetPathId_NotInScope(Collection<Long> pathIdList) {
        regINS(CK_NINS, cTL(pathIdList), getCValuePathId(), "PATHID");
    }

    protected void regPathId(ConditionKey k, Object v) { regQ(k, v, getCValuePathId(), "PATHID"); }
    abstract protected ConditionValue getCValuePathId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PATHNAME: {NotNull, VARCHAR2(100)}
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
     * PATHNAME: {NotNull, VARCHAR2(100)}
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
     * PATHNAME: {NotNull, VARCHAR2(100)}
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
     * PATHNAME: {NotNull, VARCHAR2(100)}
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
     * PATHNAME: {NotNull, VARCHAR2(100)}
     * @param pathName The value of pathName as prefixSearch.
     */
    public void setPathName_PrefixSearch(String pathName) {
        setPathName_LikeSearch(pathName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PATHNAME: {NotNull, VARCHAR2(100)}
     * @param pathName The value of pathName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPathName_LikeSearch(String pathName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pathName), getCValuePathName(), "PATHNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PATHNAME: {NotNull, VARCHAR2(100)}
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
     * REALPATHNAME: {NotNull, VARCHAR2(100)}
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
     * REALPATHNAME: {NotNull, VARCHAR2(100)}
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
     * REALPATHNAME: {NotNull, VARCHAR2(100)}
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
     * REALPATHNAME: {NotNull, VARCHAR2(100)}
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
     * REALPATHNAME: {NotNull, VARCHAR2(100)}
     * @param realPathName The value of realPathName as prefixSearch.
     */
    public void setRealPathName_PrefixSearch(String realPathName) {
        setRealPathName_LikeSearch(realPathName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REALPATHNAME: {NotNull, VARCHAR2(100)}
     * @param realPathName The value of realPathName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRealPathName_LikeSearch(String realPathName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(realPathName), getCValueRealPathName(), "REALPATHNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REALPATHNAME: {NotNull, VARCHAR2(100)}
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
     * PATHTYPE: {NUMBER(22)}
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
     * PATHTYPE: {NUMBER(22)}
     * @param pathType The value of pathType as greaterThan.
     */
    public void setPathType_GreaterThan(java.math.BigDecimal pathType) {
        regPathType(CK_GT, pathType);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHTYPE: {NUMBER(22)}
     * @param pathType The value of pathType as lessThan.
     */
    public void setPathType_LessThan(java.math.BigDecimal pathType) {
        regPathType(CK_LT, pathType);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHTYPE: {NUMBER(22)}
     * @param pathType The value of pathType as greaterEqual.
     */
    public void setPathType_GreaterEqual(java.math.BigDecimal pathType) {
        regPathType(CK_GE, pathType);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PATHTYPE: {NUMBER(22)}
     * @param pathType The value of pathType as lessEqual.
     */
    public void setPathType_LessEqual(java.math.BigDecimal pathType) {
        regPathType(CK_LE, pathType);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PATHTYPE: {NUMBER(22)}
     * @param minNumber The min number of pathType. (NullAllowed)
     * @param maxNumber The max number of pathType. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPathType_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePathType(), "PATHTYPE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PATHTYPE: {NUMBER(22)}
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
     * PATHTYPE: {NUMBER(22)}
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
     * PATHTYPE: {NUMBER(22)}
     */
    public void setPathType_IsNull() { regPathType(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PATHTYPE: {NUMBER(22)}
     */
    public void setPathType_IsNotNull() { regPathType(CK_ISNN, DOBJ); }

    protected void regPathType(ConditionKey k, Object v) { regQ(k, v, getCValuePathType(), "PATHTYPE"); }
    abstract protected ConditionValue getCValuePathType();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * PKEYNUM: {NUMBER(18)}
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
     * PKEYNUM: {NUMBER(18)}
     * @param pkeyNum The value of pkeyNum as greaterThan.
     */
    public void setPkeyNum_GreaterThan(Long pkeyNum) {
        regPkeyNum(CK_GT, pkeyNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PKEYNUM: {NUMBER(18)}
     * @param pkeyNum The value of pkeyNum as lessThan.
     */
    public void setPkeyNum_LessThan(Long pkeyNum) {
        regPkeyNum(CK_LT, pkeyNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PKEYNUM: {NUMBER(18)}
     * @param pkeyNum The value of pkeyNum as greaterEqual.
     */
    public void setPkeyNum_GreaterEqual(Long pkeyNum) {
        regPkeyNum(CK_GE, pkeyNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PKEYNUM: {NUMBER(18)}
     * @param pkeyNum The value of pkeyNum as lessEqual.
     */
    public void setPkeyNum_LessEqual(Long pkeyNum) {
        regPkeyNum(CK_LE, pkeyNum);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PKEYNUM: {NUMBER(18)}
     * @param minNumber The min number of pkeyNum. (NullAllowed)
     * @param maxNumber The max number of pkeyNum. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPkeyNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValuePkeyNum(), "PKEYNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PKEYNUM: {NUMBER(18)}
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
     * PKEYNUM: {NUMBER(18)}
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
     * PKEYNUM: {NUMBER(18)}
     */
    public void setPkeyNum_IsNull() { regPkeyNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PKEYNUM: {NUMBER(18)}
     */
    public void setPkeyNum_IsNotNull() { regPkeyNum(CK_ISNN, DOBJ); }

    protected void regPkeyNum(ConditionKey k, Object v) { regQ(k, v, getCValuePkeyNum(), "PKEYNUM"); }
    abstract protected ConditionValue getCValuePkeyNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PKEYVAL: {VARCHAR2(250)}
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
     * PKEYVAL: {VARCHAR2(250)}
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
     * PKEYVAL: {VARCHAR2(250)}
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
     * PKEYVAL: {VARCHAR2(250)}
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
     * PKEYVAL: {VARCHAR2(250)}
     * @param pkeyVal The value of pkeyVal as prefixSearch.
     */
    public void setPkeyVal_PrefixSearch(String pkeyVal) {
        setPkeyVal_LikeSearch(pkeyVal, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PKEYVAL: {VARCHAR2(250)}
     * @param pkeyVal The value of pkeyVal as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPkeyVal_LikeSearch(String pkeyVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pkeyVal), getCValuePkeyVal(), "PKEYVAL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PKEYVAL: {VARCHAR2(250)}
     * @param pkeyVal The value of pkeyVal as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPkeyVal_NotLikeSearch(String pkeyVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pkeyVal), getCValuePkeyVal(), "PKEYVAL", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PKEYVAL: {VARCHAR2(250)}
     */
    public void setPkeyVal_IsNull() { regPkeyVal(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * PKEYVAL: {VARCHAR2(250)}
     */
    public void setPkeyVal_IsNullOrEmpty() { regPkeyVal(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PKEYVAL: {VARCHAR2(250)}
     */
    public void setPkeyVal_IsNotNull() { regPkeyVal(CK_ISNN, DOBJ); }

    protected void regPkeyVal(ConditionKey k, Object v) { regQ(k, v, getCValuePkeyVal(), "PKEYVAL"); }
    abstract protected ConditionValue getCValuePkeyVal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * DATATYPE: {NotNull, VARCHAR2(200)}
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
     * DATATYPE: {NotNull, VARCHAR2(200)}
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
     * DATATYPE: {NotNull, VARCHAR2(200)}
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
     * DATATYPE: {NotNull, VARCHAR2(200)}
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
     * DATATYPE: {NotNull, VARCHAR2(200)}
     * @param dataType The value of dataType as prefixSearch.
     */
    public void setDataType_PrefixSearch(String dataType) {
        setDataType_LikeSearch(dataType, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DATATYPE: {NotNull, VARCHAR2(200)}
     * @param dataType The value of dataType as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataType_LikeSearch(String dataType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataType), getCValueDataType(), "DATATYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * DATATYPE: {NotNull, VARCHAR2(200)}
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
     * DATAID: {NotNull, NUMBER(18)}
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
     * DATAID: {NotNull, NUMBER(18)}
     * @param dataId The value of dataId as greaterThan.
     */
    public void setDataId_GreaterThan(Long dataId) {
        regDataId(CK_GT, dataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {NotNull, NUMBER(18)}
     * @param dataId The value of dataId as lessThan.
     */
    public void setDataId_LessThan(Long dataId) {
        regDataId(CK_LT, dataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {NotNull, NUMBER(18)}
     * @param dataId The value of dataId as greaterEqual.
     */
    public void setDataId_GreaterEqual(Long dataId) {
        regDataId(CK_GE, dataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {NotNull, NUMBER(18)}
     * @param dataId The value of dataId as lessEqual.
     */
    public void setDataId_LessEqual(Long dataId) {
        regDataId(CK_LE, dataId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * DATAID: {NotNull, NUMBER(18)}
     * @param minNumber The min number of dataId. (NullAllowed)
     * @param maxNumber The max number of dataId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueDataId(), "DATAID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * DATAID: {NotNull, NUMBER(18)}
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
     * DATAID: {NotNull, NUMBER(18)}
     * @param dataIdList The collection of dataId as notInScope.
     */
    public void setDataId_NotInScope(Collection<Long> dataIdList) {
        doSetDataId_NotInScope(dataIdList);
    }

    protected void doSetDataId_NotInScope(Collection<Long> dataIdList) {
        regINS(CK_NINS, cTL(dataIdList), getCValueDataId(), "DATAID");
    }

    protected void regDataId(ConditionKey k, Object v) { regQ(k, v, getCValueDataId(), "DATAID"); }
    abstract protected ConditionValue getCValueDataId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {NotNull, NUMBER(18)}
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
     * STATEID: {NotNull, NUMBER(18)}
     * @param stateId The value of stateId as greaterThan.
     */
    public void setStateId_GreaterThan(Long stateId) {
        regStateId(CK_GT, stateId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {NotNull, NUMBER(18)}
     * @param stateId The value of stateId as lessThan.
     */
    public void setStateId_LessThan(Long stateId) {
        regStateId(CK_LT, stateId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {NotNull, NUMBER(18)}
     * @param stateId The value of stateId as greaterEqual.
     */
    public void setStateId_GreaterEqual(Long stateId) {
        regStateId(CK_GE, stateId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {NotNull, NUMBER(18)}
     * @param stateId The value of stateId as lessEqual.
     */
    public void setStateId_LessEqual(Long stateId) {
        regStateId(CK_LE, stateId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * STATEID: {NotNull, NUMBER(18)}
     * @param minNumber The min number of stateId. (NullAllowed)
     * @param maxNumber The max number of stateId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStateId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueStateId(), "STATEID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * STATEID: {NotNull, NUMBER(18)}
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
     * STATEID: {NotNull, NUMBER(18)}
     * @param stateIdList The collection of stateId as notInScope.
     */
    public void setStateId_NotInScope(Collection<Long> stateIdList) {
        doSetStateId_NotInScope(stateIdList);
    }

    protected void doSetStateId_NotInScope(Collection<Long> stateIdList) {
        regINS(CK_NINS, cTL(stateIdList), getCValueStateId(), "STATEID");
    }

    protected void regStateId(ConditionKey k, Object v) { regQ(k, v, getCValueStateId(), "STATEID"); }
    abstract protected ConditionValue getCValueStateId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTORUNTIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param autoRunTime The value of autoRunTime as equal.
     */
    public void setAutoRunTime_Equal(java.sql.Timestamp autoRunTime) {
        regAutoRunTime(CK_EQ,  autoRunTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTORUNTIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param autoRunTime The value of autoRunTime as greaterThan.
     */
    public void setAutoRunTime_GreaterThan(java.sql.Timestamp autoRunTime) {
        regAutoRunTime(CK_GT,  autoRunTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTORUNTIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param autoRunTime The value of autoRunTime as lessThan.
     */
    public void setAutoRunTime_LessThan(java.sql.Timestamp autoRunTime) {
        regAutoRunTime(CK_LT,  autoRunTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTORUNTIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param autoRunTime The value of autoRunTime as greaterEqual.
     */
    public void setAutoRunTime_GreaterEqual(java.sql.Timestamp autoRunTime) {
        regAutoRunTime(CK_GE,  autoRunTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * AUTORUNTIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param autoRunTime The value of autoRunTime as lessEqual.
     */
    public void setAutoRunTime_LessEqual(java.sql.Timestamp autoRunTime) {
        regAutoRunTime(CK_LE, autoRunTime);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * AUTORUNTIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of autoRunTime. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of autoRunTime. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setAutoRunTime_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueAutoRunTime(), "AUTORUNTIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * AUTORUNTIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of autoRunTime. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of autoRunTime. (NullAllowed)
     */
    public void setAutoRunTime_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setAutoRunTime_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * AUTORUNTIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param autoRunTimeList The collection of autoRunTime as inScope.
     */
    public void setAutoRunTime_InScope(Collection<java.sql.Timestamp> autoRunTimeList) {
        doSetAutoRunTime_InScope(autoRunTimeList);
    }

    protected void doSetAutoRunTime_InScope(Collection<java.sql.Timestamp> autoRunTimeList) {
        regINS(CK_INS, cTL(autoRunTimeList), getCValueAutoRunTime(), "AUTORUNTIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * AUTORUNTIME: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param autoRunTimeList The collection of autoRunTime as notInScope.
     */
    public void setAutoRunTime_NotInScope(Collection<java.sql.Timestamp> autoRunTimeList) {
        doSetAutoRunTime_NotInScope(autoRunTimeList);
    }

    protected void doSetAutoRunTime_NotInScope(Collection<java.sql.Timestamp> autoRunTimeList) {
        regINS(CK_NINS, cTL(autoRunTimeList), getCValueAutoRunTime(), "AUTORUNTIME");
    }

    protected void regAutoRunTime(ConditionKey k, Object v) { regQ(k, v, getCValueAutoRunTime(), "AUTORUNTIME"); }
    abstract protected ConditionValue getCValueAutoRunTime();

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
     * PROCESSDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as equal.
     */
    public void setProcessDate_Equal(java.sql.Timestamp processDate) {
        regProcessDate(CK_EQ,  processDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as greaterThan.
     */
    public void setProcessDate_GreaterThan(java.sql.Timestamp processDate) {
        regProcessDate(CK_GT,  processDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as lessThan.
     */
    public void setProcessDate_LessThan(java.sql.Timestamp processDate) {
        regProcessDate(CK_LT,  processDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as greaterEqual.
     */
    public void setProcessDate_GreaterEqual(java.sql.Timestamp processDate) {
        regProcessDate(CK_GE,  processDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param processDate The value of processDate as lessEqual.
     */
    public void setProcessDate_LessEqual(java.sql.Timestamp processDate) {
        regProcessDate(CK_LE, processDate);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of processDate. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of processDate. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setProcessDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueProcessDate(), "PROCESSDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * PROCESSDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of processDate. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of processDate. (NullAllowed)
     */
    public void setProcessDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setProcessDate_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PROCESSDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param processDateList The collection of processDate as inScope.
     */
    public void setProcessDate_InScope(Collection<java.sql.Timestamp> processDateList) {
        doSetProcessDate_InScope(processDateList);
    }

    protected void doSetProcessDate_InScope(Collection<java.sql.Timestamp> processDateList) {
        regINS(CK_INS, cTL(processDateList), getCValueProcessDate(), "PROCESSDATE");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * PROCESSDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param processDateList The collection of processDate as notInScope.
     */
    public void setProcessDate_NotInScope(Collection<java.sql.Timestamp> processDateList) {
        doSetProcessDate_NotInScope(processDateList);
    }

    protected void doSetProcessDate_NotInScope(Collection<java.sql.Timestamp> processDateList) {
        regINS(CK_NINS, cTL(processDateList), getCValueProcessDate(), "PROCESSDATE");
    }

    protected void regProcessDate(ConditionKey k, Object v) { regQ(k, v, getCValueProcessDate(), "PROCESSDATE"); }
    abstract protected ConditionValue getCValueProcessDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param abortDate The value of abortDate as equal.
     */
    public void setAbortDate_Equal(java.sql.Timestamp abortDate) {
        regAbortDate(CK_EQ,  abortDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param abortDate The value of abortDate as greaterThan.
     */
    public void setAbortDate_GreaterThan(java.sql.Timestamp abortDate) {
        regAbortDate(CK_GT,  abortDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param abortDate The value of abortDate as lessThan.
     */
    public void setAbortDate_LessThan(java.sql.Timestamp abortDate) {
        regAbortDate(CK_LT,  abortDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param abortDate The value of abortDate as greaterEqual.
     */
    public void setAbortDate_GreaterEqual(java.sql.Timestamp abortDate) {
        regAbortDate(CK_GE,  abortDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param abortDate The value of abortDate as lessEqual.
     */
    public void setAbortDate_LessEqual(java.sql.Timestamp abortDate) {
        regAbortDate(CK_LE, abortDate);
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of abortDate. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of abortDate. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setAbortDate_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), getCValueAbortDate(), "ABORTDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of abortDate. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of abortDate. (NullAllowed)
     */
    public void setAbortDate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setAbortDate_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param abortDateList The collection of abortDate as inScope.
     */
    public void setAbortDate_InScope(Collection<java.sql.Timestamp> abortDateList) {
        doSetAbortDate_InScope(abortDateList);
    }

    protected void doSetAbortDate_InScope(Collection<java.sql.Timestamp> abortDateList) {
        regINS(CK_INS, cTL(abortDateList), getCValueAbortDate(), "ABORTDATE");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ABORTDATE: {NotNull, TIMESTAMP(6)(11, 6)}
     * @param abortDateList The collection of abortDate as notInScope.
     */
    public void setAbortDate_NotInScope(Collection<java.sql.Timestamp> abortDateList) {
        doSetAbortDate_NotInScope(abortDateList);
    }

    protected void doSetAbortDate_NotInScope(Collection<java.sql.Timestamp> abortDateList) {
        regINS(CK_NINS, cTL(abortDateList), getCValueAbortDate(), "ABORTDATE");
    }

    protected void regAbortDate(ConditionKey k, Object v) { regQ(k, v, getCValueAbortDate(), "ABORTDATE"); }
    abstract protected ConditionValue getCValueAbortDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
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
     * PARTICIPANTNAME: {VARCHAR2(200)}
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
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @param participantNameList The collection of participantName as inScope.
     */
    public void setParticipantName_InScope(Collection<String> participantNameList) {
        doSetParticipantName_InScope(participantNameList);
    }

    public void doSetParticipantName_InScope(Collection<String> participantNameList) {
        regINS(CK_INS, cTL(participantNameList), getCValueParticipantName(), "PARTICIPANTNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @param participantNameList The collection of participantName as notInScope.
     */
    public void setParticipantName_NotInScope(Collection<String> participantNameList) {
        doSetParticipantName_NotInScope(participantNameList);
    }

    public void doSetParticipantName_NotInScope(Collection<String> participantNameList) {
        regINS(CK_NINS, cTL(participantNameList), getCValueParticipantName(), "PARTICIPANTNAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @param participantName The value of participantName as prefixSearch.
     */
    public void setParticipantName_PrefixSearch(String participantName) {
        setParticipantName_LikeSearch(participantName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @param participantName The value of participantName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setParticipantName_LikeSearch(String participantName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(participantName), getCValueParticipantName(), "PARTICIPANTNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     * @param participantName The value of participantName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setParticipantName_NotLikeSearch(String participantName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(participantName), getCValueParticipantName(), "PARTICIPANTNAME", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     */
    public void setParticipantName_IsNull() { regParticipantName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     */
    public void setParticipantName_IsNullOrEmpty() { regParticipantName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PARTICIPANTNAME: {VARCHAR2(200)}
     */
    public void setParticipantName_IsNotNull() { regParticipantName(CK_ISNN, DOBJ); }

    protected void regParticipantName(ConditionKey k, Object v) { regQ(k, v, getCValueParticipantName(), "PARTICIPANTNAME"); }
    abstract protected ConditionValue getCValueParticipantName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
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
     * PARTICIPANTTYPE: {VARCHAR2(200)}
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
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @param participantTypeList The collection of participantType as inScope.
     */
    public void setParticipantType_InScope(Collection<String> participantTypeList) {
        doSetParticipantType_InScope(participantTypeList);
    }

    public void doSetParticipantType_InScope(Collection<String> participantTypeList) {
        regINS(CK_INS, cTL(participantTypeList), getCValueParticipantType(), "PARTICIPANTTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @param participantTypeList The collection of participantType as notInScope.
     */
    public void setParticipantType_NotInScope(Collection<String> participantTypeList) {
        doSetParticipantType_NotInScope(participantTypeList);
    }

    public void doSetParticipantType_NotInScope(Collection<String> participantTypeList) {
        regINS(CK_NINS, cTL(participantTypeList), getCValueParticipantType(), "PARTICIPANTTYPE");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @param participantType The value of participantType as prefixSearch.
     */
    public void setParticipantType_PrefixSearch(String participantType) {
        setParticipantType_LikeSearch(participantType, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @param participantType The value of participantType as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setParticipantType_LikeSearch(String participantType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(participantType), getCValueParticipantType(), "PARTICIPANTTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     * @param participantType The value of participantType as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setParticipantType_NotLikeSearch(String participantType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(participantType), getCValueParticipantType(), "PARTICIPANTTYPE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     */
    public void setParticipantType_IsNull() { regParticipantType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     */
    public void setParticipantType_IsNullOrEmpty() { regParticipantType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * PARTICIPANTTYPE: {VARCHAR2(200)}
     */
    public void setParticipantType_IsNotNull() { regParticipantType(CK_ISNN, DOBJ); }

    protected void regParticipantType(ConditionKey k, Object v) { regQ(k, v, getCValueParticipantType(), "PARTICIPANTTYPE"); }
    abstract protected ConditionValue getCValueParticipantType();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return BuriPathHistoryDataCB.class.getName(); }
    protected String xabCQ() { return BuriPathHistoryDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}

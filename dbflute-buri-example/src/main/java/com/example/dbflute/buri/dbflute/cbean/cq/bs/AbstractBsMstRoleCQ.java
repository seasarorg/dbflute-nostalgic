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
 * The abstract condition-query of MST_ROLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMstRoleCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMstRoleCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "MST_ROLE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * ROLE_ID: {PK, NotNull, NUMBER(9)}
     * @param roleId The value of roleId as equal.
     */
    public void setRoleId_Equal(Integer roleId) {
        doSetRoleId_Equal(roleId);
    }

    protected void doSetRoleId_Equal(Integer roleId) {
        regRoleId(CK_EQ, roleId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ROLE_ID: {PK, NotNull, NUMBER(9)}
     * @param roleId The value of roleId as greaterThan.
     */
    public void setRoleId_GreaterThan(Integer roleId) {
        regRoleId(CK_GT, roleId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * ROLE_ID: {PK, NotNull, NUMBER(9)}
     * @param roleId The value of roleId as lessThan.
     */
    public void setRoleId_LessThan(Integer roleId) {
        regRoleId(CK_LT, roleId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ROLE_ID: {PK, NotNull, NUMBER(9)}
     * @param roleId The value of roleId as greaterEqual.
     */
    public void setRoleId_GreaterEqual(Integer roleId) {
        regRoleId(CK_GE, roleId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * ROLE_ID: {PK, NotNull, NUMBER(9)}
     * @param roleId The value of roleId as lessEqual.
     */
    public void setRoleId_LessEqual(Integer roleId) {
        regRoleId(CK_LE, roleId);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * ROLE_ID: {PK, NotNull, NUMBER(9)}
     * @param minNumber The min number of roleId. (NullAllowed)
     * @param maxNumber The max number of roleId. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRoleId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueRoleId(), "ROLE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ROLE_ID: {PK, NotNull, NUMBER(9)}
     * @param roleIdList The collection of roleId as inScope.
     */
    public void setRoleId_InScope(Collection<Integer> roleIdList) {
        doSetRoleId_InScope(roleIdList);
    }

    protected void doSetRoleId_InScope(Collection<Integer> roleIdList) {
        regINS(CK_INS, cTL(roleIdList), getCValueRoleId(), "ROLE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * ROLE_ID: {PK, NotNull, NUMBER(9)}
     * @param roleIdList The collection of roleId as notInScope.
     */
    public void setRoleId_NotInScope(Collection<Integer> roleIdList) {
        doSetRoleId_NotInScope(roleIdList);
    }

    protected void doSetRoleId_NotInScope(Collection<Integer> roleIdList) {
        regINS(CK_NINS, cTL(roleIdList), getCValueRoleId(), "ROLE_ID");
    }

    /**
     * Set up ExistsReferrer (co-related sub-query). <br />
     * {exists (select ROLE_ID from MST_USER_ROLE where ...)} <br />
     * MST_USER_ROLE by your ROLE_ID, named 'mstUserRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">existsMstUserRoleList</span>(new SubQuery&lt;MstUserRoleCB&gt;() {
     *     public void query(MstRoleCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of MstUserRoleList for 'exists'. (NotNull)
     */
    public void existsMstUserRoleList(SubQuery<MstUserRoleCB> subQuery) {
        assertObjectNotNull("subQuery<MstUserRoleCB>", subQuery);
        MstUserRoleCB cb = new MstUserRoleCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepRoleId_ExistsReferrer_MstUserRoleList(cb.query()); // for saving query-value.
        registerExistsReferrer(cb.query(), "ROLE_ID", "ROLE_ID", subQueryPropertyName, "mstUserRoleList");
    }
    public abstract String keepRoleId_ExistsReferrer_MstUserRoleList(MstUserRoleCQ subQuery);

    /**
     * Set up NotExistsReferrer (co-related sub-query). <br />
     * {not exists (select ROLE_ID from MST_USER_ROLE where ...)} <br />
     * MST_USER_ROLE by your ROLE_ID, named 'mstUserRoleAsOne'.
     * <pre>
     * cb.query().<span style="color: #FD4747">notExistsMstUserRoleList</span>(new SubQuery&lt;MstUserRoleCB&gt;() {
     *     public void query(MstRoleCB subCB) {
     *         subCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param subQuery The sub-query of RoleId_NotExistsReferrer_MstUserRoleList for 'not exists'. (NotNull)
     */
    public void notExistsMstUserRoleList(SubQuery<MstUserRoleCB> subQuery) {
        assertObjectNotNull("subQuery<MstUserRoleCB>", subQuery);
        MstUserRoleCB cb = new MstUserRoleCB(); cb.xsetupForExistsReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepRoleId_NotExistsReferrer_MstUserRoleList(cb.query()); // for saving query-value.
        registerNotExistsReferrer(cb.query(), "ROLE_ID", "ROLE_ID", subQueryPropertyName, "mstUserRoleList");
    }
    public abstract String keepRoleId_NotExistsReferrer_MstUserRoleList(MstUserRoleCQ subQuery);

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ROLE_ID from MST_USER_ROLE where ...)} <br />
     * MST_USER_ROLE by your ROLE_ID, named 'mstUserRoleAsOne'.
     * @param subQuery The sub-query of MstUserRoleList for 'in-scope'. (NotNull)
     */
    public void inScopeMstUserRoleList(SubQuery<MstUserRoleCB> subQuery) {
        assertObjectNotNull("subQuery<MstUserRoleCB>", subQuery);
        MstUserRoleCB cb = new MstUserRoleCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepRoleId_InScopeRelation_MstUserRoleList(cb.query()); // for saving query-value.
        registerInScopeRelation(cb.query(), "ROLE_ID", "ROLE_ID", subQueryPropertyName, "mstUserRoleList");
    }
    public abstract String keepRoleId_InScopeRelation_MstUserRoleList(MstUserRoleCQ subQuery);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ROLE_ID from MST_USER_ROLE where ...)} <br />
     * MST_USER_ROLE by your ROLE_ID, named 'mstUserRoleAsOne'.
     * @param subQuery The sub-query of MstUserRoleList for 'not in-scope'. (NotNull)
     */
    public void notInScopeMstUserRoleList(SubQuery<MstUserRoleCB> subQuery) {
        assertObjectNotNull("subQuery<MstUserRoleCB>", subQuery);
        MstUserRoleCB cb = new MstUserRoleCB(); cb.xsetupForInScopeRelation(this); subQuery.query(cb);
        String subQueryPropertyName = keepRoleId_NotInScopeRelation_MstUserRoleList(cb.query()); // for saving query-value.
        registerNotInScopeRelation(cb.query(), "ROLE_ID", "ROLE_ID", subQueryPropertyName, "mstUserRoleList");
    }
    public abstract String keepRoleId_NotInScopeRelation_MstUserRoleList(MstUserRoleCQ subQuery);

    public void xsderiveMstUserRoleList(String function, SubQuery<MstUserRoleCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MstUserRoleCB>", subQuery);
        MstUserRoleCB cb = new MstUserRoleCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepRoleId_SpecifyDerivedReferrer_MstUserRoleList(cb.query()); // for saving query-value.
        registerSpecifyDerivedReferrer(function, cb.query(), "ROLE_ID", "ROLE_ID", subQueryPropertyName, "mstUserRoleList", aliasName, option);
    }
    public abstract String keepRoleId_SpecifyDerivedReferrer_MstUserRoleList(MstUserRoleCQ subQuery);

    /**
     * Prepare for (Query)DerivedReferrer. <br />
     * {FOO &lt;= (select max(BAR) from MST_USER_ROLE where ...)} <br />
     * MST_USER_ROLE by your ROLE_ID, named 'mstUserRoleAsOne'.
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
    public HpQDRFunction<MstUserRoleCB> derivedMstUserRoleList() {
        return xcreateQDRFunctionMstUserRoleList();
    }
    protected HpQDRFunction<MstUserRoleCB> xcreateQDRFunctionMstUserRoleList() {
        return new HpQDRFunction<MstUserRoleCB>(new HpQDRSetupper<MstUserRoleCB>() {
            public void setup(String function, SubQuery<MstUserRoleCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMstUserRoleList(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMstUserRoleList(String function, SubQuery<MstUserRoleCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MstUserRoleCB>", subQuery);
        MstUserRoleCB cb = new MstUserRoleCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepRoleId_QueryDerivedReferrer_MstUserRoleList(cb.query()); // for saving query-value.
        String parameterPropertyName = keepRoleId_QueryDerivedReferrer_MstUserRoleListParameter(value);
        registerQueryDerivedReferrer(function, cb.query(), "ROLE_ID", "ROLE_ID", subQueryPropertyName, "mstUserRoleList", operand, value, parameterPropertyName, option);
    }
    public abstract String keepRoleId_QueryDerivedReferrer_MstUserRoleList(MstUserRoleCQ subQuery);
    public abstract String keepRoleId_QueryDerivedReferrer_MstUserRoleListParameter(Object parameterValue);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br />
     * ROLE_ID: {PK, NotNull, NUMBER(9)}
     */
    public void setRoleId_IsNull() { regRoleId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br />
     * ROLE_ID: {PK, NotNull, NUMBER(9)}
     */
    public void setRoleId_IsNotNull() { regRoleId(CK_ISNN, DOBJ); }

    protected void regRoleId(ConditionKey k, Object v) { regQ(k, v, getCValueRoleId(), "ROLE_ID"); }
    abstract protected ConditionValue getCValueRoleId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ROLE_NAME: {NotNull, VARCHAR2(200)}
     * @param roleName The value of roleName as equal.
     */
    public void setRoleName_Equal(String roleName) {
        doSetRoleName_Equal(fRES(roleName));
    }

    protected void doSetRoleName_Equal(String roleName) {
        regRoleName(CK_EQ, roleName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * ROLE_NAME: {NotNull, VARCHAR2(200)}
     * @param roleName The value of roleName as notEqual.
     */
    public void setRoleName_NotEqual(String roleName) {
        doSetRoleName_NotEqual(fRES(roleName));
    }

    protected void doSetRoleName_NotEqual(String roleName) {
        regRoleName(CK_NES, roleName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ROLE_NAME: {NotNull, VARCHAR2(200)}
     * @param roleNameList The collection of roleName as inScope.
     */
    public void setRoleName_InScope(Collection<String> roleNameList) {
        doSetRoleName_InScope(roleNameList);
    }

    public void doSetRoleName_InScope(Collection<String> roleNameList) {
        regINS(CK_INS, cTL(roleNameList), getCValueRoleName(), "ROLE_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * ROLE_NAME: {NotNull, VARCHAR2(200)}
     * @param roleNameList The collection of roleName as notInScope.
     */
    public void setRoleName_NotInScope(Collection<String> roleNameList) {
        doSetRoleName_NotInScope(roleNameList);
    }

    public void doSetRoleName_NotInScope(Collection<String> roleNameList) {
        regINS(CK_NINS, cTL(roleNameList), getCValueRoleName(), "ROLE_NAME");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ROLE_NAME: {NotNull, VARCHAR2(200)}
     * @param roleName The value of roleName as prefixSearch.
     */
    public void setRoleName_PrefixSearch(String roleName) {
        setRoleName_LikeSearch(roleName, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ROLE_NAME: {NotNull, VARCHAR2(200)}
     * @param roleName The value of roleName as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRoleName_LikeSearch(String roleName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(roleName), getCValueRoleName(), "ROLE_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * ROLE_NAME: {NotNull, VARCHAR2(200)}
     * @param roleName The value of roleName as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRoleName_NotLikeSearch(String roleName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(roleName), getCValueRoleName(), "ROLE_NAME", likeSearchOption);
    }

    protected void regRoleName(ConditionKey k, Object v) { regQ(k, v, getCValueRoleName(), "ROLE_NAME"); }
    abstract protected ConditionValue getCValueRoleName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(20)}
     * @param registerUser The value of registerUser as equal.
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(20)}
     * @param registerUser The value of registerUser as notEqual.
     */
    public void setRegisterUser_NotEqual(String registerUser) {
        doSetRegisterUser_NotEqual(fRES(registerUser));
    }

    protected void doSetRegisterUser_NotEqual(String registerUser) {
        regRegisterUser(CK_NES, registerUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(20)}
     * @param registerUserList The collection of registerUser as inScope.
     */
    public void setRegisterUser_InScope(Collection<String> registerUserList) {
        doSetRegisterUser_InScope(registerUserList);
    }

    public void doSetRegisterUser_InScope(Collection<String> registerUserList) {
        regINS(CK_INS, cTL(registerUserList), getCValueRegisterUser(), "REGISTER_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(20)}
     * @param registerUserList The collection of registerUser as notInScope.
     */
    public void setRegisterUser_NotInScope(Collection<String> registerUserList) {
        doSetRegisterUser_NotInScope(registerUserList);
    }

    public void doSetRegisterUser_NotInScope(Collection<String> registerUserList) {
        regINS(CK_NINS, cTL(registerUserList), getCValueRegisterUser(), "REGISTER_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(20)}
     * @param registerUser The value of registerUser as prefixSearch.
     */
    public void setRegisterUser_PrefixSearch(String registerUser) {
        setRegisterUser_LikeSearch(registerUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(20)}
     * @param registerUser The value of registerUser as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), getCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * REGISTER_USER: {NotNull, VARCHAR2(20)}
     * @param registerUser The value of registerUser as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRegisterUser_NotLikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerUser), getCValueRegisterUser(), "REGISTER_USER", likeSearchOption);
    }

    protected void regRegisterUser(ConditionKey k, Object v) { regQ(k, v, getCValueRegisterUser(), "REGISTER_USER"); }
    abstract protected ConditionValue getCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @param registerDatetime The value of registerDatetime as equal.
     */
    public void setRegisterDatetime_Equal(java.util.Date registerDatetime) {
        regRegisterDatetime(CK_EQ,  fCTPD(registerDatetime));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @param registerDatetime The value of registerDatetime as greaterThan.
     */
    public void setRegisterDatetime_GreaterThan(java.util.Date registerDatetime) {
        regRegisterDatetime(CK_GT,  fCTPD(registerDatetime));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @param registerDatetime The value of registerDatetime as lessThan.
     */
    public void setRegisterDatetime_LessThan(java.util.Date registerDatetime) {
        regRegisterDatetime(CK_LT,  fCTPD(registerDatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @param registerDatetime The value of registerDatetime as greaterEqual.
     */
    public void setRegisterDatetime_GreaterEqual(java.util.Date registerDatetime) {
        regRegisterDatetime(CK_GE,  fCTPD(registerDatetime));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @param registerDatetime The value of registerDatetime as lessEqual.
     */
    public void setRegisterDatetime_LessEqual(java.util.Date registerDatetime) {
        regRegisterDatetime(CK_LE, fCTPD(registerDatetime));
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueRegisterDatetime(), "REGISTER_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of registerDatetime. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of registerDatetime. (NullAllowed)
     */
    public void setRegisterDatetime_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setRegisterDatetime_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @param registerDatetimeList The collection of registerDatetime as inScope.
     */
    public void setRegisterDatetime_InScope(Collection<java.util.Date> registerDatetimeList) {
        doSetRegisterDatetime_InScope(registerDatetimeList);
    }

    protected void doSetRegisterDatetime_InScope(Collection<java.util.Date> registerDatetimeList) {
        regINS(CK_INS, cTL(registerDatetimeList), getCValueRegisterDatetime(), "REGISTER_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * REGISTER_DATETIME: {NotNull, DATE(7)}
     * @param registerDatetimeList The collection of registerDatetime as notInScope.
     */
    public void setRegisterDatetime_NotInScope(Collection<java.util.Date> registerDatetimeList) {
        doSetRegisterDatetime_NotInScope(registerDatetimeList);
    }

    protected void doSetRegisterDatetime_NotInScope(Collection<java.util.Date> registerDatetimeList) {
        regINS(CK_NINS, cTL(registerDatetimeList), getCValueRegisterDatetime(), "REGISTER_DATETIME");
    }

    protected void regRegisterDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    abstract protected ConditionValue getCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(20)}
     * @param updateUser The value of updateUser as equal.
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(20)}
     * @param updateUser The value of updateUser as notEqual.
     */
    public void setUpdateUser_NotEqual(String updateUser) {
        doSetUpdateUser_NotEqual(fRES(updateUser));
    }

    protected void doSetUpdateUser_NotEqual(String updateUser) {
        regUpdateUser(CK_NES, updateUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(20)}
     * @param updateUserList The collection of updateUser as inScope.
     */
    public void setUpdateUser_InScope(Collection<String> updateUserList) {
        doSetUpdateUser_InScope(updateUserList);
    }

    public void doSetUpdateUser_InScope(Collection<String> updateUserList) {
        regINS(CK_INS, cTL(updateUserList), getCValueUpdateUser(), "UPDATE_USER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(20)}
     * @param updateUserList The collection of updateUser as notInScope.
     */
    public void setUpdateUser_NotInScope(Collection<String> updateUserList) {
        doSetUpdateUser_NotInScope(updateUserList);
    }

    public void doSetUpdateUser_NotInScope(Collection<String> updateUserList) {
        regINS(CK_NINS, cTL(updateUserList), getCValueUpdateUser(), "UPDATE_USER");
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(20)}
     * @param updateUser The value of updateUser as prefixSearch.
     */
    public void setUpdateUser_PrefixSearch(String updateUser) {
        setUpdateUser_LikeSearch(updateUser, cLSOP());
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(20)}
     * @param updateUser The value of updateUser as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), getCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br />
     * And NullOrEmptyIgnored, SeveralRegistered. <br />
     * UPDATE_USER: {NotNull, VARCHAR2(20)}
     * @param updateUser The value of updateUser as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpdateUser_NotLikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateUser), getCValueUpdateUser(), "UPDATE_USER", likeSearchOption);
    }

    protected void regUpdateUser(ConditionKey k, Object v) { regQ(k, v, getCValueUpdateUser(), "UPDATE_USER"); }
    abstract protected ConditionValue getCValueUpdateUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @param updateDatetime The value of updateDatetime as equal.
     */
    public void setUpdateDatetime_Equal(java.util.Date updateDatetime) {
        regUpdateDatetime(CK_EQ,  fCTPD(updateDatetime));
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @param updateDatetime The value of updateDatetime as greaterThan.
     */
    public void setUpdateDatetime_GreaterThan(java.util.Date updateDatetime) {
        regUpdateDatetime(CK_GT,  fCTPD(updateDatetime));
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @param updateDatetime The value of updateDatetime as lessThan.
     */
    public void setUpdateDatetime_LessThan(java.util.Date updateDatetime) {
        regUpdateDatetime(CK_LT,  fCTPD(updateDatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @param updateDatetime The value of updateDatetime as greaterEqual.
     */
    public void setUpdateDatetime_GreaterEqual(java.util.Date updateDatetime) {
        regUpdateDatetime(CK_GE,  fCTPD(updateDatetime));
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @param updateDatetime The value of updateDatetime as lessEqual.
     */
    public void setUpdateDatetime_LessEqual(java.util.Date updateDatetime) {
        regUpdateDatetime(CK_LE, fCTPD(updateDatetime));
    }

    /**
     * FromTo with various options. (versatile) <br />
     * {(default) fromDatetime &lt;= column &lt;= toDatetime} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (NullAllowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.util.Date fromDatetime, java.util.Date toDatetime, FromToOption fromToOption) {
        regFTQ(fCTPD(fromDatetime), fCTPD(toDatetime), getCValueUpdateDatetime(), "UPDATE_DATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) <br />
     * {fromDate &lt;= column &lt; toDate + 1 day} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  --&gt; column &gt;= '2007/04/10 00:00:00'
     *  and column <span style="color: #FD4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of updateDatetime. (NullAllowed)
     * @param toDate The to-date(yyyy/MM/dd) of updateDatetime. (NullAllowed)
     */
    public void setUpdateDatetime_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setUpdateDatetime_FromTo(fromDate, toDate, new DateFromToOption());
    }

    /**
     * InScope {in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @param updateDatetimeList The collection of updateDatetime as inScope.
     */
    public void setUpdateDatetime_InScope(Collection<java.util.Date> updateDatetimeList) {
        doSetUpdateDatetime_InScope(updateDatetimeList);
    }

    protected void doSetUpdateDatetime_InScope(Collection<java.util.Date> updateDatetimeList) {
        regINS(CK_INS, cTL(updateDatetimeList), getCValueUpdateDatetime(), "UPDATE_DATETIME");
    }

    /**
     * NotInScope {not in ('1965-03-03', '1966-09-15')}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * UPDATE_DATETIME: {NotNull, DATE(7)}
     * @param updateDatetimeList The collection of updateDatetime as notInScope.
     */
    public void setUpdateDatetime_NotInScope(Collection<java.util.Date> updateDatetimeList) {
        doSetUpdateDatetime_NotInScope(updateDatetimeList);
    }

    protected void doSetUpdateDatetime_NotInScope(Collection<java.util.Date> updateDatetimeList) {
        regINS(CK_NINS, cTL(updateDatetimeList), getCValueUpdateDatetime(), "UPDATE_DATETIME");
    }

    protected void regUpdateDatetime(ConditionKey k, Object v) { regQ(k, v, getCValueUpdateDatetime(), "UPDATE_DATETIME"); }
    abstract protected ConditionValue getCValueUpdateDatetime();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, NUMBER(8)}
     * @param versionNo The value of versionNo as equal.
     */
    public void setVersionNo_Equal(Integer versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Integer versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, NUMBER(8)}
     * @param versionNo The value of versionNo as greaterThan.
     */
    public void setVersionNo_GreaterThan(Integer versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, NUMBER(8)}
     * @param versionNo The value of versionNo as lessThan.
     */
    public void setVersionNo_LessThan(Integer versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, NUMBER(8)}
     * @param versionNo The value of versionNo as greaterEqual.
     */
    public void setVersionNo_GreaterEqual(Integer versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, NUMBER(8)}
     * @param versionNo The value of versionNo as lessEqual.
     */
    public void setVersionNo_LessEqual(Integer versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br />
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br />
     * And NullIgnored, OnlyOnceRegistered. <br />
     * VERSION_NO: {NotNull, NUMBER(8)}
     * @param minNumber The min number of versionNo. (NullAllowed)
     * @param maxNumber The max number of versionNo. (NullAllowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, getCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VERSION_NO: {NotNull, NUMBER(8)}
     * @param versionNoList The collection of versionNo as inScope.
     */
    public void setVersionNo_InScope(Collection<Integer> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Integer> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), getCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br />
     * VERSION_NO: {NotNull, NUMBER(8)}
     * @param versionNoList The collection of versionNo as notInScope.
     */
    public void setVersionNo_NotInScope(Collection<Integer> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Integer> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), getCValueVersionNo(), "VERSION_NO");
    }

    protected void regVersionNo(ConditionKey k, Object v) { regQ(k, v, getCValueVersionNo(), "VERSION_NO"); }
    abstract protected ConditionValue getCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_Equal()</span>.max(new SubQuery&lt;MstRoleCB&gt;() {
     *     public void query(MstRoleCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MstRoleCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ.getOperand());
    }

    /**
     * Prepare ScalarCondition as equal. <br />
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_NotEqual()</span>.max(new SubQuery&lt;MstRoleCB&gt;() {
     *     public void query(MstRoleCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MstRoleCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br />
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;MstRoleCB&gt;() {
     *     public void query(MstRoleCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MstRoleCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessThan. <br />
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessThan()</span>.max(new SubQuery&lt;MstRoleCB&gt;() {
     *     public void query(MstRoleCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MstRoleCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT.getOperand());
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br />
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;MstRoleCB&gt;() {
     *     public void query(MstRoleCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MstRoleCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE.getOperand());
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br />
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #FD4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MstRoleCB&gt;() {
     *     public void query(MstRoleCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<MstRoleCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE.getOperand());
    }

    protected HpSSQFunction<MstRoleCB> xcreateSSQFunction(final String operand) {
        return new HpSSQFunction<MstRoleCB>(new HpSSQSetupper<MstRoleCB>() {
            public void setup(String function, SubQuery<MstRoleCB> subQuery, HpSSQOption<MstRoleCB> option) {
                xscalarCondition(function, subQuery, operand, option);
            }
        });
    }

    protected void xscalarCondition(String function, SubQuery<MstRoleCB> subQuery, String operand, HpSSQOption<MstRoleCB> option) {
        assertObjectNotNull("subQuery<MstRoleCB>", subQuery);
        MstRoleCB cb = xcreateScalarConditionCB(); subQuery.query(cb);
        String subQueryPropertyName = keepScalarCondition(cb.query()); // for saving query-value
        option.setPartitionByCBean(xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(function, cb.query(), subQueryPropertyName, operand, option);
    }
    public abstract String keepScalarCondition(MstRoleCQ subQuery);

    protected MstRoleCB xcreateScalarConditionCB() {
        MstRoleCB cb = new MstRoleCB();
        cb.xsetupForScalarCondition(this);
        return cb;
    }

    protected MstRoleCB xcreateScalarConditionPartitionByCB() {
        MstRoleCB cb = new MstRoleCB();
        cb.xsetupForScalarConditionPartitionBy(this);
        return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String function, SubQuery<MstRoleCB> subQuery, String aliasName, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MstRoleCB>", subQuery);
        MstRoleCB cb = new MstRoleCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepSpecifyMyselfDerived(cb.query()); // for saving query-value.
        registerSpecifyMyselfDerived(function, cb.query(), "ROLE_ID", "ROLE_ID", subQueryPropertyName, "myselfDerived", aliasName, option);
    }
    public abstract String keepSpecifyMyselfDerived(MstRoleCQ subQuery);

    /**
     * Prepare for (Query)MyselfDerived (SubQuery).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MstRoleCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived();
    }
    protected HpQDRFunction<MstRoleCB> xcreateQDRFunctionMyselfDerived() {
        return new HpQDRFunction<MstRoleCB>(new HpQDRSetupper<MstRoleCB>() {
            public void setup(String function, SubQuery<MstRoleCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
                xqderiveMyselfDerived(function, subQuery, operand, value, option);
            }
        });
    }
    public void xqderiveMyselfDerived(String function, SubQuery<MstRoleCB> subQuery, String operand, Object value, DerivedReferrerOption option) {
        assertObjectNotNull("subQuery<MstRoleCB>", subQuery);
        MstRoleCB cb = new MstRoleCB(); cb.xsetupForDerivedReferrer(this); subQuery.query(cb);
        String subQueryPropertyName = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String parameterPropertyName = keepQueryMyselfDerivedParameter(value);
        registerQueryMyselfDerived(function, cb.query(), "ROLE_ID", "ROLE_ID", subQueryPropertyName, "myselfDerived", operand, value, parameterPropertyName, option);
    }
    public abstract String keepQueryMyselfDerived(MstRoleCQ subQuery);
    public abstract String keepQueryMyselfDerivedParameter(Object parameterValue);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfExists(SubQuery<MstRoleCB> subQuery) {
        assertObjectNotNull("subQuery<MstRoleCB>", subQuery);
        MstRoleCB cb = new MstRoleCB(); cb.xsetupForMyselfExists(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfExists(cb.query()); // for saving query-value.
        registerMyselfExists(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfExists(MstRoleCQ subQuery);

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    /**
     * Prepare for MyselfInScope (SubQuery).
     * @param subQuery The implementation of sub query. (NotNull)
     */
    public void myselfInScope(SubQuery<MstRoleCB> subQuery) {
        assertObjectNotNull("subQuery<MstRoleCB>", subQuery);
        MstRoleCB cb = new MstRoleCB(); cb.xsetupForMyselfInScope(this); subQuery.query(cb);
        String subQueryPropertyName = keepMyselfInScope(cb.query()); // for saving query-value.
        registerMyselfInScope(cb.query(), subQueryPropertyName);
    }
    public abstract String keepMyselfInScope(MstRoleCQ subQuery);

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabCB() { return MstRoleCB.class.getName(); }
    protected String xabCQ() { return MstRoleCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
}

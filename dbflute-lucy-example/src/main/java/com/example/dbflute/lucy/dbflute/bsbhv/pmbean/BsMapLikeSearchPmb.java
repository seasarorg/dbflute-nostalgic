package com.example.dbflute.lucy.dbflute.bsbhv.pmbean;

import java.util.*;

import org.seasar.dbflute.outsidesql.typed.*;
import org.seasar.dbflute.jdbc.*;
import org.seasar.dbflute.jdbc.ParameterUtil.ShortCharHandlingMode;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.dbflute.util.DfCollectionUtil;
import org.seasar.dbflute.exception.*;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.lucy.dbflute.allcommon.*;
import com.example.dbflute.lucy.dbflute.exbhv.*;

/**
 * The base class for typed parameter-bean of MapLikeSearch. <br />
 * This is related to "<span style="color: #AD4747">various:pmbcheck:selectMapLikeSearch</span>" on MemberBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsMapLikeSearchPmb implements ExecuteHandlingPmb<MemberBhv>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of conditionMap:like. */
    protected Map<String, Object> _conditionMap;

    /** The option of like-search for conditionMap. */
    protected LikeSearchOption _conditionMapInternalLikeSearchOption;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of MapLikeSearch. <br />
     * This is related to "<span style="color: #AD4747">various:pmbcheck:selectMapLikeSearch</span>" on MemberBhv.
     */
    public BsMapLikeSearchPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() {
        return "various:pmbcheck:selectMapLikeSearch";
    }

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected String filterStringParameter(String value) {
        if (isEmptyStringParameterAllowed()) {
            return value;
        }
        return convertEmptyToNull(value);
    }

    protected boolean isEmptyStringParameterAllowed() {
	    return DBFluteConfig.getInstance().isEmptyStringParameterAllowed();
    }

    protected String convertEmptyToNull(String value) {
	    return ParameterUtil.convertEmptyToNull(value);
    }

    protected String handleShortChar(String propertyName, String value, Integer size) {
        ShortCharHandlingMode mode = getShortCharHandlingMode(propertyName, value, size);
        return ParameterUtil.handleShortChar(propertyName, value, size, mode);
    }

    protected ShortCharHandlingMode getShortCharHandlingMode(String propertyName, String value, Integer size) {
        return ShortCharHandlingMode.NONE;
    }

    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) {
        Object obj = DfCollectionUtil.newArrayList(elements);
        return (ArrayList<ELEMENT>)obj; // to avoid the warning between JDK6 and JDK7
    }

    @SuppressWarnings("unchecked")
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) {
        return (NUMBER)DfTypeUtil.toNumber(obj, type);
    }

    protected Boolean toBoolean(Object obj) {
        return DfTypeUtil.toBoolean(obj);
    }

    protected Date toUtilDate(Date date) {
        return DfTypeUtil.toDate(date); // if sub class, re-create as pure date
    }

    protected String formatUtilDate(Date date) {
        String pattern = "yyyy-MM-dd";
        return DfTypeUtil.toString(date, pattern);
    }

    protected String formatByteArray(byte[] bytes) {
        return "byte[" + (bytes != null ? String.valueOf(bytes.length) : "null") + "]";
    }

    protected void assertLikeSearchOptionValid(String name, LikeSearchOption option) {
        if (option == null) {
            String msg = "The like-search option is required!";
            throw new RequiredOptionNotFoundException(msg);
        }
        if (option.isSplit()) {
            String msg = "The split of like-search is NOT available on parameter-bean.";
            msg = msg + " Don't use splitByXxx(): " + option;
            throw new IllegalOutsideSqlOperationException(msg);
        }
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    private String xbuildColumnString() {
        final String c = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(c).append(_conditionMap);
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] conditionMap:like <br />
     * @return The value of conditionMap. (Nullable, NotEmptyString(when String): if empty string, returns null)
     */
    public Map<String, Object> getConditionMap() {
        return _conditionMap;
    }

    /**
     * [set as likeSearch] conditionMap:like <br />
     * @param conditionMap The value of conditionMap. (NullAllowed)
     * @param conditionMapOption The option of likeSearch for conditionMap which is NOT split mode. (NotNull)
     */
    public void setConditionMap(Map<String, Object> conditionMap, LikeSearchOption conditionMapOption) {
        assertLikeSearchOptionValid("conditionMapOption", conditionMapOption);
        _conditionMap = conditionMap;
        _conditionMapInternalLikeSearchOption = conditionMapOption;
    }

    /**
     * Get the internal option of likeSearch for conditionMap. {Internal Method: Don't invoke this}
     * @return The internal option of likeSearch for conditionMap. (NullAllowed)
     */
    public LikeSearchOption getConditionMapInternalLikeSearchOption() {
        return _conditionMapInternalLikeSearchOption;
    }

}

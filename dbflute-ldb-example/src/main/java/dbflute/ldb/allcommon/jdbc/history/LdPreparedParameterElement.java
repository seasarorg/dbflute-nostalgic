/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.jdbc.history;

/**
 * The element of prepared parameters.
 * 
 * @author DBFlute(AutoGenerator)
 * @deprecated Please use SqlLogRegistry
 */
public class LdPreparedParameterElement {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    protected int settingIndex;

    /** JDBC type. (java.sql.Types) */
    protected int jdbcType;

    protected Object parameterValue;

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    public int getSettingIndex() {
        return settingIndex;
    }

    public void setSettingIndex(int settingIndex) {
        this.settingIndex = settingIndex;
    }

    public int getJdbcType() {
        return jdbcType;
    }

    public void setJdbcType(int jdbcType) {
        this.jdbcType = jdbcType;
    }

    public Object getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(Object parameterValue) {
        this.parameterValue = parameterValue;
    }
}

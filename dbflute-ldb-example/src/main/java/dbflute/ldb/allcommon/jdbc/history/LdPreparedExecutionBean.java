/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.jdbc.history;

/**
 * The bean of prepared execution.
 * 
 * @author DBFlute(AutoGenerator)
 * @deprecated Please use SqlLogRegistry
 */
public class LdPreparedExecutionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected java.util.List<LdPreparedParameterElement> preparedParameterElementList = new java.util.ArrayList<LdPreparedParameterElement>();

    protected String displaySql;

    // ===================================================================================
    //                                                                         Easy-to-Use
    //                                                                         ===========
    public void addParameterElement(LdPreparedParameterElement parameterElement) {
        this.preparedParameterElementList.add(parameterElement);
    }

    public boolean isEmpty() {
        return preparedParameterElementList.isEmpty();
    }

    public int size() {
        return preparedParameterElementList.size();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public java.util.List<LdPreparedParameterElement> getPreparedParameterElementList() {
        return preparedParameterElementList;
    }

    public String getDisplaySql() {
        return displaySql;
    }

    public void setDisplaySql(String displaySql) {
        this.displaySql = displaySql;
    }
}

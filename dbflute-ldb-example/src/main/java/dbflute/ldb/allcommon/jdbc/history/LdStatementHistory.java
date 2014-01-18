/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.jdbc.history;

/**
 * The history of statement.
 * 
 * @author DBFlute(AutoGenerator)
 * @deprecated Please use SqlLogRegistry
 */
public class LdStatementHistory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected java.util.List<LdPreparedExecutionBean> preparedExecutionBeanList = new java.util.ArrayList<LdPreparedExecutionBean>();

    // ===================================================================================
    //                                                                         Easy-to-Use
    //                                                                         ===========
    public void addExecutionBean(LdPreparedExecutionBean parameterBean) {
        this.preparedExecutionBeanList.add(parameterBean);
    }

    public LdPreparedExecutionBean current() {
        if (preparedExecutionBeanList.isEmpty()) {
            preparedExecutionBeanList.add(new LdPreparedExecutionBean());
        }
        return preparedExecutionBeanList.get(preparedExecutionBeanList.size() - 1);
    }

    public LdPreparedExecutionBean next() {
        preparedExecutionBeanList.add(new LdPreparedExecutionBean());
        return current();
    }

    public LdPreparedExecutionBean removeLast() {
        return preparedExecutionBeanList.remove(preparedExecutionBeanList.size() - 1);
    }

    public int size() {
        return preparedExecutionBeanList.size();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public java.util.List<LdPreparedExecutionBean> getPreparedExecutionBeanList() {
        return preparedExecutionBeanList;
    }
}

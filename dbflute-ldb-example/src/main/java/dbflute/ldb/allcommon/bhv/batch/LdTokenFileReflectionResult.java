/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.batch;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdTokenFileReflectionResult {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    protected java.util.List<String> _columnNameList;
    protected int _successCount;
    protected java.util.List<LdTokenFileReflectionFailure> _failureList;

    // =====================================================================================
    //                                                                           Easy-to-Use
    //                                                                           ===========
    public void incrementSuccessCount() {
        ++_successCount;
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    public java.util.List<String> getColumnNameList() {
        return _columnNameList;
    }

    public void setColumnNameList(java.util.List<String> columnNameList) {
        this._columnNameList = columnNameList;
    }

    public int getSuccessCount() {
        return _successCount;
    }

    public void setSuccessCount(int successCount) {
        _successCount = successCount;
    }

    public java.util.List<LdTokenFileReflectionFailure> getFailureList() {
        return _failureList;
    }

    public void setFailureList(java.util.List<LdTokenFileReflectionFailure> failureList) {
        this._failureList = failureList;
    }
}

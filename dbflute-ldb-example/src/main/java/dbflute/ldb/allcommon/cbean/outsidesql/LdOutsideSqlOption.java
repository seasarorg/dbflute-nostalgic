/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.outsidesql;

import dbflute.ldb.allcommon.jdbc.LdStatementConfig;

/**
 * The option of outside-SQL. It contains various information about execution.
 * @author DBFlute(AutoGenerator)
 */
public class LdOutsideSqlOption {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Option
    //                                                ------
    /** The request type of paging. */
    protected String _pagingRequestType = "non";

    protected boolean _dynamicBinding;

    /** The configuration of statement. (Nullable) */
    protected LdStatementConfig _statementConfig;
    
    protected String _sourcePagingRequestType = "non";

    // -----------------------------------------------------
    //                                           Information
    //                                           -----------
    /** The DB name of table. It is not related with the options of outside-SQL. */
    protected String _tableDbName;

    // ===================================================================================
    //                                                                         Easy-to-Use
    //                                                                         ===========
    public void autoPaging() {
        _pagingRequestType = "auto";
    }

    public void manualPaging() {
        _pagingRequestType = "manual";
    }

    public void dynamicBinding() {
        _dynamicBinding = true;
    }

    // ===================================================================================
    //                                                                          Unique Key
    //                                                                          ==========
    public String generateUniqueKey() {
        return "{" + _pagingRequestType + "/" + _dynamicBinding + "}";
    }

    // ===================================================================================
    //                                                                                Copy
    //                                                                                ====
    public LdOutsideSqlOption copyOptionWithoutPaging() {
        final LdOutsideSqlOption copyOption = new LdOutsideSqlOption();
        copyOption.setPagingSourceRequestType(_pagingRequestType);
        if (isDynamicBinding()) {
            copyOption.dynamicBinding();
        }
        copyOption.setTableDbName(_tableDbName);
        return copyOption;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return "{paging=" + _pagingRequestType + ", dynamic=" + _dynamicBinding + "}";
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    // -----------------------------------------------------
    //                                                Option
    //                                                ------
    public boolean isAutoPaging() {
        return "auto".equals(_pagingRequestType);
    }

    public boolean isManualPaging() {
        return "manual".equals(_pagingRequestType);
    }

    public boolean isDynamicBinding() {
        return _dynamicBinding;
    }

    public LdStatementConfig getStatementConfig() {
        return _statementConfig;
    }

    public void setStatementConfig(LdStatementConfig statementConfig) {
        _statementConfig = statementConfig;
    }

    protected void setPagingSourceRequestType(String sourcePagingRequestType) { // Very Internal
        _sourcePagingRequestType = sourcePagingRequestType;
    }

    public boolean isSourcePagingRequestTypeAuto() { // Very Internal
        return "auto".equals(_sourcePagingRequestType);
    }

    // -----------------------------------------------------
    //                                           Information
    //                                           -----------
    public String getTableDbName() {
        return _tableDbName;
    }

    public void setTableDbName(String tableDbName) {
        _tableDbName = tableDbName;
    }
}

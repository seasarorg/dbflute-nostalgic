/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import dbflute.ldb.allcommon.LdDBDef;
import dbflute.ldb.allcommon.bhv.core.LdResourceContext;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlContext;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlOption;

/**
 * @author DBFlute(AutoGenerator)
 * @param <RESULT> The type of result.
 */
public abstract class LdAbstractOutsideSqlCommand<RESULT> extends LdAbstractBehaviorCommand<RESULT> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                     Basic Information
    //                                     -----------------
    /** The path of outside-SQL. (Required) */
    protected String _outsideSqlPath;

    /** The parameter-bean. (Required to set, but Nullable) */
    protected Object _parameterBean;

    /** The option of outside-SQL. (Required) */
    protected LdOutsideSqlOption _outsideSqlOption;

    /** The current database definition. (Required) */
    protected LdDBDef _currentDBDef;

    // ===================================================================================
    //                                                                  Detail Information
    //                                                                  ==================
    public boolean isConditionBean() {
        return false; // When the command is for outside-SQL, it always be false.
    }

    public boolean isOutsideSql() {
        return true;
    }

    public boolean isSelectCount() {
        return false; // When the command is for outside-SQL, it always be false.
    }

    // ===================================================================================
    //                                                                Argument Information
    //                                                                ====================
    public LdConditionBean getConditionBean() {
        return null;
    }

    public String getOutsideSqlPath() {
        return _outsideSqlPath;
    }

    public LdOutsideSqlOption getOutsideSqlOption() {
        return _outsideSqlOption;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected LdOutsideSqlContext createOutsideSqlContext() {
        return new LdOutsideSqlContext(LdResourceContext.dbmetaProvider(), LdResourceContext.getOutsideSqlPackage());
    }

    protected String buildDbmsSuffix() {
        assertOutsideSqlBasic("buildDbmsSuffix");
        final String productName = _currentDBDef.code();
        return (productName != null ? "_" + productName.toLowerCase() : "");
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void assertOutsideSqlBasic(String methodName) {
        if (_outsideSqlPath == null) {
            throw new IllegalStateException(buildAssertMessage("_outsideSqlPath", methodName));
        }
        if (_outsideSqlOption == null) {
            throw new IllegalStateException(buildAssertMessage("_outsideSqlOption", methodName));
        }
        if (_currentDBDef == null) {
            throw new IllegalStateException(buildAssertMessage("_currentDBDef", methodName));
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setOutsideSqlPath(String outsideSqlPath) {
        _outsideSqlPath = outsideSqlPath;
    }

    public void setParameterBean(Object parameterBean) {
        _parameterBean = parameterBean;
    }

    public void setOutsideSqlOption(LdOutsideSqlOption outsideSqlOption) {
        _outsideSqlOption = outsideSqlOption;
    }

    public void setCurrentDBDef(LdDBDef currentDBDef) {
        _currentDBDef = currentDBDef;
    }
}

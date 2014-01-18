/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqllog;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalSqlLog {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private String rawSql;
    private String completeSql;
    private Object[] bindArgs;
    private Class<?>[] bindArgTypes;
	
	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalSqlLog(String rawSql, String completeSql, Object[] bindArgs, Class<?>[] bindArgTypes) {
        this.rawSql = rawSql;
        this.completeSql = completeSql;
        this.bindArgs = bindArgs;
        this.bindArgTypes = bindArgTypes;
    }

	// ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Object[] getBindArgs() {
        return bindArgs;
    }

    public Class<?>[] getBindArgTypes() {
        return bindArgTypes;
    }

    public String getCompleteSql() {
        return completeSql;
    }

    public String getRawSql() {
        return rawSql;
    }

    public String toString() {
        return rawSql;
    }
}

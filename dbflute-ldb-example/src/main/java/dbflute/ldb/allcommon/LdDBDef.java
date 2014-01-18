/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon;

import java.util.Map;
import java.util.HashMap;

/**
 * The definition of database.
 * @author DBFlute(AutoGenerator)
 */
public enum LdDBDef {

    // ===================================================================================
    //                                                                                ENUM
    //                                                                                ====
    MySQL("mysql", null)
    , PostgreSQL("postgresql", "postgre")
    , Oracle("oracle", null)
    , DB2("db2", null)
    , SQLServer("sqlserver", "mssql")
    , FireBird("firebird", null)
    , H2("h2", null)
    , Derby("derby", null)
    , MSAccess("msaccess", null)
    , Unknown("unknown", null);

    // ===================================================================================
    //                                                                    Static Reference
    //                                                                    ================
    // -----------------------------------------------------
    //                                            Code Value
    //                                            ----------
    private static final Map<String, LdDBDef> _codeValueMap = new HashMap<String, LdDBDef>();
    static {
        for (LdDBDef value : values()) {
            _codeValueMap.put(value.code().toLowerCase(), value);
        }
    }
    private static final Map<String, LdDBDef> _codeAliasValueMap = new HashMap<String, LdDBDef>();
    static {
        for (LdDBDef value : values()) {
            if (value.codeAlias() != null) {
                _codeAliasValueMap.put(value.codeAlias().toLowerCase(), value);
            }
        }
    }

    /**
     * @param code The code of the DB. (Nullable: If the code is null, it returns null)
     * @return The instance that has the code. (Nullable)
     */
    public static LdDBDef codeOf(String code) {
        if (code == null) {
            return null;
        }
        final String lowerCaseCode = code.toLowerCase();
        LdDBDef def = _codeValueMap.get(lowerCaseCode);
        if (def == null) {
            def = _codeAliasValueMap.get(lowerCaseCode);
        }
        return def;
    }

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The code of the DB. (NotNull) */
    private String _code;

    /** The code alias of the DB. (Nullable) */
    private String _codeAlias;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * @param code The code of the DB. (NotNull)
     * @param codeAlias The code alias of the DB. (Nullable)
     */
    private LdDBDef(String code, String codeAlias) {
        _code = code;
        _codeAlias = codeAlias;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * @return The code of the DB. (NotNull)
     */
    public String code() {
        return _code;
    }

    /**
     * @return The code alias of the DB. (Nullable)
     */
    private String codeAlias() {
        return _codeAlias;
    }
}

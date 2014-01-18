/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core;

import dbflute.ldb.allcommon.LdDBDef;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaProvider;
import dbflute.ldb.allcommon.jdbc.LdStatementConfig;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClauseCreator;

/**
 * @author DBFlute(AutoGenerator)
 */
public interface LdInvokerAssistant {

    /**
     * @return The current database definition. (NotNull)
     */
    public LdDBDef assistCurrentDBDef();

    /**
     * @return The provider of DB meta. (NotNull)
     */
    public LdDBMetaProvider assistDBMetaProvider();

    /**
     * @return The create of SQL clause. (NotNull)
     */
    public LdSqlClauseCreator assistSqlClauseCreator();

    /**
     * @return The parameter of resource. (NotNull)
     */
    public LdResourceParameter assistResourceParameter();

    /**
     * @return The encoding of SQL files. (NotNull)
     */
    public String assistSqlFileEncoding();

    /**
     * @return The default configure of statement. (NotNull)
     */
    public LdStatementConfig assistDefaultStatementConfig();

    /**
     * @return Is the internal debug valid? (NotNull)
     */
    public boolean assistInternalDebug();

    /**
     * To be disposable.
     */
    public void toBeDisposable();
}

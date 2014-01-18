package com.example.dbflute.teeda.dbflute.allcommon.bhv.core;

import com.example.dbflute.teeda.dbflute.allcommon.DBDef;
import com.example.dbflute.teeda.dbflute.allcommon.dbmeta.DBMetaProvider;
import com.example.dbflute.teeda.dbflute.allcommon.jdbc.StatementConfig;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.sqlclause.SqlClauseCreator;

/**
 * @author DBFlute(AutoGenerator)
 */
public interface InvokerAssistant {

    /**
     * @return The current database definition. (NotNull)
     */
    public DBDef assistCurrentDBDef();

    /**
     * @return The provider of DB meta. (NotNull)
     */
    public DBMetaProvider assistDBMetaProvider();

    /**
     * @return The create of SQL clause. (NotNull)
     */
    public SqlClauseCreator assistSqlClauseCreator();

    /**
     * @return The parameter of resource. (NotNull)
     */
    public ResourceParameter assistResourceParameter();

    /**
     * @return The encoding of SQL files. (NotNull)
     */
    public String assistSqlFileEncoding();

    /**
     * @return The default configure of statement. (NotNull)
     */
    public StatementConfig assistDefaultStatementConfig();

    /**
     * @return Is the internal debug valid? (NotNull)
     */
    public boolean assistInternalDebug();

    /**
     * To be disposable.
     */
    public void toBeDisposable();
}

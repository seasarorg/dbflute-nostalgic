/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon;

import org.seasar.framework.util.Disposable;
import org.seasar.framework.util.DisposableUtil;

import dbflute.ldb.allcommon.bhv.core.LdBehaviorCommandInvoker;
import dbflute.ldb.allcommon.bhv.core.LdInvokerAssistant;
import dbflute.ldb.allcommon.bhv.core.LdResourceParameter;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaProvider;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.allcommon.jdbc.LdStatementConfig;
import dbflute.ldb.allcommon.cbean.sqlclause.LdSqlClauseCreator;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdImplementedInvokerAssistant implements LdInvokerAssistant, Disposable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LdDBMetaProvider _dbmetaProvider = createDBMetaProvider();
    protected final LdSqlClauseCreator _sqlClauseCreator = createSqlClauseCreator();
    protected LdBehaviorCommandInvoker _behaviorCommandInvoker;
    protected boolean _disposable;

    // ===================================================================================
    //                                                                            Creation
    //                                                                            ========
    protected LdSqlClauseCreator createSqlClauseCreator() {
        return new LdImplementedSqlClauseCreator();
    }

    protected LdDBMetaProvider createDBMetaProvider() {
        return new LdDBMetaInstanceHandler();
    }

    // ===================================================================================
    //                                                                 Assistant Main Work
    //                                                                 ===================
    public LdDBDef assistCurrentDBDef() {
        return LdDBCurrent.getInstance().currentDBDef();
    }

    public LdDBMetaProvider assistDBMetaProvider() {
        return _dbmetaProvider;
    }

    public LdSqlClauseCreator assistSqlClauseCreator() {
        return _sqlClauseCreator;
    }

    public LdResourceParameter assistResourceParameter() {
        LdResourceParameter resourceParameter = new LdResourceParameter();
        resourceParameter.setOutsideSqlPackage(LdDBFluteConfig.getInstance().getOutsideSqlPackage());
        resourceParameter.setLogDateFormat(LdDBFluteConfig.getInstance().getLogDateFormat());
        resourceParameter.setLogTimestampFormat(LdDBFluteConfig.getInstance().getLogTimestampFormat());
        return resourceParameter;
    }

    public String assistSqlFileEncoding() {
        return "UTF-8";
    }

    public LdStatementConfig assistDefaultStatementConfig() {
        return LdDBFluteConfig.getInstance().getDefaultStatementConfig();
    }
    
    public boolean assistInternalDebug() {
        return LdDBFluteConfig.getInstance().isInternalDebug();
    }

    // ===================================================================================
    //                                                                             Dispose
    //                                                                             =======
    public void toBeDisposable() { // for HotDeploy
        if (!_disposable) {
            synchronized (this) {
                if (!_disposable) {
                    DisposableUtil.add(this);
                    _disposable = true;
                }
            }
        }
    }

    public void dispose() {
        assertBehaviorCommandInvoker();
        _behaviorCommandInvoker.clearExecutionCache();
        _disposable = false;
    }

    public boolean isDisposable() {
        return _disposable;
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void assertBehaviorCommandInvoker() {
        if (_behaviorCommandInvoker == null) {
            String msg = "The attribute 'behaviorCommandInvoker' should not be null!";
            throw new IllegalStateException(msg);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setBehaviorCommandInvoker(LdBehaviorCommandInvoker behaviorCommandInvoker) {
        _behaviorCommandInvoker = behaviorCommandInvoker;
    }
}

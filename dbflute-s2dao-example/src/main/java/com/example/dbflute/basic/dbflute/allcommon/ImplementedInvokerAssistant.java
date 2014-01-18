package com.example.dbflute.basic.dbflute.allcommon;

import org.seasar.framework.util.Disposable;
import org.seasar.framework.util.DisposableUtil;

import com.example.dbflute.basic.dbflute.allcommon.bhv.core.BehaviorCommandInvoker;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.InvokerAssistant;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.ResourceParameter;
import com.example.dbflute.basic.dbflute.allcommon.dbmeta.DBMetaProvider;
import com.example.dbflute.basic.dbflute.allcommon.dbmeta.DBMetaInstanceHandler;
import com.example.dbflute.basic.dbflute.allcommon.jdbc.StatementConfig;
import com.example.dbflute.basic.dbflute.allcommon.cbean.sqlclause.SqlClauseCreator;

/**
 * @author DBFlute(AutoGenerator)
 */
public class ImplementedInvokerAssistant implements InvokerAssistant, Disposable {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = createDBMetaProvider();
    protected final SqlClauseCreator _sqlClauseCreator = createSqlClauseCreator();
    protected BehaviorCommandInvoker _behaviorCommandInvoker;
    protected boolean _disposable;

    // ===================================================================================
    //                                                                            Creation
    //                                                                            ========
    protected SqlClauseCreator createSqlClauseCreator() {
        return new ImplementedSqlClauseCreator();
    }

    protected DBMetaProvider createDBMetaProvider() {
        return new DBMetaInstanceHandler();
    }

    // ===================================================================================
    //                                                                 Assistant Main Work
    //                                                                 ===================
    public DBDef assistCurrentDBDef() {
        return DBCurrent.getInstance().currentDBDef();
    }

    public DBMetaProvider assistDBMetaProvider() {
        return _dbmetaProvider;
    }

    public SqlClauseCreator assistSqlClauseCreator() {
        return _sqlClauseCreator;
    }

    public ResourceParameter assistResourceParameter() {
        ResourceParameter resourceParameter = new ResourceParameter();
        resourceParameter.setOutsideSqlPackage(DBFluteConfig.getInstance().getOutsideSqlPackage());
        resourceParameter.setLogDateFormat(DBFluteConfig.getInstance().getLogDateFormat());
        resourceParameter.setLogTimestampFormat(DBFluteConfig.getInstance().getLogTimestampFormat());
        return resourceParameter;
    }

    public String assistSqlFileEncoding() {
        return "UTF-8";
    }

    public StatementConfig assistDefaultStatementConfig() {
        return DBFluteConfig.getInstance().getDefaultStatementConfig();
    }
    
    public boolean assistInternalDebug() {
        return DBFluteConfig.getInstance().isInternalDebug();
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
    public void setBehaviorCommandInvoker(BehaviorCommandInvoker behaviorCommandInvoker) {
        _behaviorCommandInvoker = behaviorCommandInvoker;
    }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core.command;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.extension.jdbc.ResultSetHandler;

import dbflute.ldb.allcommon.jdbc.LdCursorHandler;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlContext;

/**
 * The behavior command for OutsideSql.selectList().
 * @author DBFlute(AutoGenerator)
 */
public class LdOutsideSqlSelectCursorCommand extends LdAbstractOutsideSqlSelectCommand<Object> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The handler of cursor. (Required) */
    protected LdCursorHandler _cursorHandler;

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    public String getCommandName() {
        return "selectCursor";
    }

    public Class<?> getCommandReturnType() {
        return Object.class;
    }

    // ===================================================================================
    //                                                                    Process Callback
    //                                                                    ================
    @Override
    protected void setupOutsideSqlContext(LdOutsideSqlContext outsideSqlContext) {
        super.setupOutsideSqlContext(outsideSqlContext);
        outsideSqlContext.setCursorHandler(_cursorHandler);
    }
    
    // ===================================================================================
    //                                                                     Extension Point
    //                                                                     ===============
    @Override
    protected ResultSetHandler createOutsideSqlSelectResultSetHandler() {
        return new ResultSetHandler() {
            public Object handle(ResultSet rs) throws SQLException {
                if (!LdOutsideSqlContext.isExistOutsideSqlContextOnThread()) {
                    String msg = "The context of outside SQL should be required here!";
                    throw new IllegalStateException(msg);
                }
                LdOutsideSqlContext context = LdOutsideSqlContext.getOutsideSqlContextOnThread();
                LdCursorHandler cursorHandler = context.getCursorHandler();
                return cursorHandler.handle(rs);
            }
        };
    }

    @Override
    protected Object getResultTypeSpecification() {
        return _cursorHandler.getClass();
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    @Override
    protected void assertStatus(String methodName) {
        assertBasicProperty(methodName);
        assertComponentProperty(methodName);
        assertOutsideSqlBasic(methodName);
        if (_cursorHandler == null) {
            throw new IllegalStateException(buildAssertMessage("_cursorHandler", methodName));
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setCursorHandler(LdCursorHandler cursorHandler) {
        _cursorHandler = cursorHandler;
    }
}

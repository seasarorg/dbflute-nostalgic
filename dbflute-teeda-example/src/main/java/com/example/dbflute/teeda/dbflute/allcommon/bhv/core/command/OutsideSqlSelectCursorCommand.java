package com.example.dbflute.teeda.dbflute.allcommon.bhv.core.command;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.extension.jdbc.ResultSetHandler;

import com.example.dbflute.teeda.dbflute.allcommon.jdbc.CursorHandler;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.outsidesql.OutsideSqlContext;

/**
 * The behavior command for OutsideSql.selectList().
 * @author DBFlute(AutoGenerator)
 */
public class OutsideSqlSelectCursorCommand extends AbstractOutsideSqlSelectCommand<Object> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The handler of cursor. (Required) */
    protected CursorHandler _cursorHandler;

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
    protected void setupOutsideSqlContext(OutsideSqlContext outsideSqlContext) {
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
                if (!OutsideSqlContext.isExistOutsideSqlContextOnThread()) {
                    String msg = "The context of outside SQL should be required here!";
                    throw new IllegalStateException(msg);
                }
                OutsideSqlContext context = OutsideSqlContext.getOutsideSqlContextOnThread();
                CursorHandler cursorHandler = context.getCursorHandler();
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
    public void setCursorHandler(CursorHandler cursorHandler) {
        _cursorHandler = cursorHandler;
    }
}

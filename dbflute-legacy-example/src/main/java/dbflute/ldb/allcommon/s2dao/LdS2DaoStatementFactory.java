package dbflute.ldb.allcommon.s2dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.extension.jdbc.impl.BasicStatementFactory;
import org.seasar.framework.exception.SQLRuntimeException;


/**
 * Statement factory.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdS2DaoStatementFactory extends BasicStatementFactory {

    /** Log-instance. */
    private static final Log _log = LogFactory.getLog(LdS2DaoStatementFactory.class);

    public PreparedStatement createPreparedStatement(Connection con, String sql) {
        try {
            if (_log.isDebugEnabled()) {
                _log.debug("@StatementFactory: con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);");
            }
            return con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            throw new SQLRuntimeException(e);
        }
    }

}

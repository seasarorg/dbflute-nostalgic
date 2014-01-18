package dbflute.ldb.allcommon.s2dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.seasar.extension.jdbc.ResultSetFactory;
import org.seasar.framework.util.PreparedStatementUtil;

import dbflute.ldb.allcommon.cbean.LdFetchNarrowingBean;
import dbflute.ldb.allcommon.cbean.LdFetchNarrowingBeanContext;

/**
 * Fetch page result set factory.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdFetchNarrowingResultSetFactory implements ResultSetFactory {

    /** Log-instance. */
    private static final Log _log = LogFactory.getLog(LdFetchNarrowingResultSetFactory.class);

    /** Is internal-debug enabled? */
    private boolean _isInternalDebugEnabled = false;

    /**
     * Constructor.
     */
    public LdFetchNarrowingResultSetFactory() {
    }

    /**
     * Create result set.
     * 
     * @param ps Prepared statement.
     * @return Result set. (NotNull)
     */
    public ResultSet createResultSet(PreparedStatement ps) {
        if (_isInternalDebugEnabled) {
            if (_log.isDebugEnabled()) {
                _log.debug("executeQuery(ps) ps=" + ps);
            }
        }
        final ResultSet resultSet = PreparedStatementUtil.executeQuery(ps);

        if (!LdFetchNarrowingBeanContext.isExistFetchNarrowingBeanOnThread()) {
            return resultSet;
        }

        final LdFetchNarrowingBean cb = LdFetchNarrowingBeanContext.getFetchNarrowingBeanOnThread();
        if (!cb.isFetchNarrowingEffective()) {
            return resultSet;// It is not necessary to control.
        }
        if (!cb.isFetchNarrowingSkipStartIndexEffective() && !cb.isFetchNarrowingLoopCountEffective()) {
            return resultSet;// It is not necessary to control. The sql already have been controlled.
        }

        if (_isInternalDebugEnabled) {
            if (_log.isDebugEnabled()) {
                _log.debug("Necessary to control fetch-narrowing! cb=" + cb);
            }
        }
        return new LdFetchNarrowingResultSetWrapper(resultSet, cb);
    }
}

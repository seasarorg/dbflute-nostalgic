package dbflute.ldb.allcommon.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;

/**
 * CommonColumn-Setup-before-Delete Interceptor.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdCommonColumnSetupBeforeDeleteInterceptor extends LdCommonColumnSetupAbstractInterceptor {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** Log-instance. */
    private static final Log _log = LogFactory.getLog(LdCommonColumnSetupBeforeDeleteInterceptor.class);

    /**
     * Set up the entity.
     * 
     * @param entity Entity. (Nullable)
     */
    protected void setupEntity(LdEntityDefinedCommonColumn entity) {
        if (_log.isDebugEnabled()) {
            _log.debug("  before setup : " + entity.extractCommonColumnValueMapString());
        }
        
        if (_log.isDebugEnabled()) {
            _log.debug("  after setup  : " + entity.extractCommonColumnValueMapString());
        }
    }
}
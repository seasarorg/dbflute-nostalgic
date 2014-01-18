package dbflute.ldb.allcommon.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;

/**
 * CommonColumn-Setup-before-Update Interceptor.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdCommonColumnSetupBeforeUpdateInterceptor extends LdCommonColumnSetupAbstractInterceptor {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** Log-instance. */
    private static final Log _log = LogFactory.getLog(LdCommonColumnSetupBeforeUpdateInterceptor.class);

    /**
     * Set up the entity.
     * 
     * @param entity Entity. (Nullable)
     */
    protected void setupEntity(LdEntityDefinedCommonColumn entity) {
        if (_log.isDebugEnabled()) {
            _log.debug("  before setup : " + entity.extractCommonColumnValueMapString());
        }
            
        final String uStaff = "update-interceptor";
        entity.setUStaff(uStaff);
        if (_log.isDebugEnabled()) {
            _log.debug("    U_STAFF has been set up: value=" + uStaff);
        }
      
        if (_log.isDebugEnabled()) {
            _log.debug("  after setup  : " + entity.extractCommonColumnValueMapString());
        }
    }
}
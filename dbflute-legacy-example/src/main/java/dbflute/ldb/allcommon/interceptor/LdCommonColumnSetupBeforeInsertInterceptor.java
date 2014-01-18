package dbflute.ldb.allcommon.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;

/**
 * CommonColumn-Setup-before-Insert Interceptor.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdCommonColumnSetupBeforeInsertInterceptor extends LdCommonColumnSetupAbstractInterceptor {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** Log-instance. */
    private static final Log _log = LogFactory.getLog(LdCommonColumnSetupBeforeInsertInterceptor.class);

    /**
     * Set up the entity.
     * 
     * @param entity Entity. (Nullable)
     */
    protected void setupEntity(LdEntityDefinedCommonColumn entity) {
        if (_log.isDebugEnabled()) {
            _log.debug("  before setup : " + entity.extractCommonColumnValueMapString());
        }
      
        final java.sql.Timestamp rTime = new java.sql.Timestamp(System.currentTimeMillis());
        entity.setRTime(rTime);
        if (_log.isDebugEnabled()) {
            _log.debug("    R_TIME has been set up: value=" + rTime);
        }
              
        entity.classifyRStaffAdministrator();
        if (_log.isDebugEnabled()) {
            _log.debug("    R_STAFF has been set up: invoking=entity.classifyRStaffAdministrator();");
        }
            
        final String uStaff = entity.getRStaff();
        entity.setUStaff(uStaff);
        if (_log.isDebugEnabled()) {
            _log.debug("    U_STAFF has been set up: value=" + uStaff);
        }
      
        if (_log.isDebugEnabled()) {
            _log.debug("  after setup  : " + entity.extractCommonColumnValueMapString());
        }
    }
}
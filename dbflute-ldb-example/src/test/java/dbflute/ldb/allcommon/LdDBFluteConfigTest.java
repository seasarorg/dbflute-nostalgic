package dbflute.ldb.allcommon;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.jdbc.LdStatementConfig;

public class LdDBFluteConfigTest extends TestCase {

    /** Log instance for sub class. */
    protected static final Log _log = LogFactory.getLog(LdDBFluteConfigTest.class);

    public void test_setDefaultStatementConfig() throws Exception {
        // ## Arrange ##
        LdDBFluteConfig.getInstance().unlock();
        final LdStatementConfig expected = new LdStatementConfig();
        
        // ## Act ##
        LdDBFluteConfig.getInstance().setDefaultStatementConfig(expected);
        
        // ## Assert ##
        final LdStatementConfig actual = LdDBFluteConfig.getInstance().getDefaultStatementConfig();
        assertEquals(expected, actual);
        LdDBFluteConfig.getInstance().clear();
    }
    
    public void test_setInternalDebug() throws Exception {
        // ## Arrange ##
        LdDBFluteConfig.getInstance().unlock();
        final boolean expected = true;
        
        // ## Act ##
        LdDBFluteConfig.getInstance().setInternalDebug(expected);
        
        // ## Assert ##
        final boolean actual = LdDBFluteConfig.getInstance().isInternalDebug();
        assertEquals(expected, actual);
        LdDBFluteConfig.getInstance().clear();
    }
}

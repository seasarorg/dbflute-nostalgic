package dbflute.ldb.allcommon;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.LdGenMetaData;

import junit.framework.TestCase;

/**
 * Test of BsBookDao
 * 
 * @author kubo
 */
public class LdGenMetaDataTest extends TestCase {

    /** Log instance. */
    public static final Log _log = LogFactory.getLog(LdGenMetaDataTest.class);
    
    /** Gen meta data. */
    public static final LdGenMetaData _meta = LdGenMetaData.getInstance();

    /**
     * Test the property of commonColumnSetupBeforeInsertInterceptorLogicMap.
     */
    public void test_commonColumnSetupBeforeInsertInterceptorLogicMap() {
//        final Map map = _meta.getCommonColumnSetupBeforeInsertInterceptorLogicMap();
//        assertNotNull(map);
//        _log.debug(" map=" + map);
    }
}

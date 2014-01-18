package dbflute.ldb.exentity;

import java.util.Set;

import junit.framework.TestCase;
import dbflute.ldb.exentity.LdBlackAction;

/**
 * Test of BsBookDao
 * 
 * @author kubo
 */
public class LdBlackActionEntityPlainTest extends TestCase {

    // ==========================================================================================
    //                                                                                     Entity
    //                                                                                     ======

    public void test_ModifiedPropertyNamesExtension() throws Exception {
        final LdBlackAction entity = new LdBlackAction();
        entity.setBlackActionCode("aaa");
        final Set<String> modifiedPropertyNames = entity.getModifiedPropertyNames();
        assertNotSame(1, modifiedPropertyNames);
        assertFalse(entity.isCallbackModifiedPropertyNamesExtension());
        modifiedPropertyNames.clear();
        assertTrue(entity.isCallbackModifiedPropertyNamesExtension());
    }
}

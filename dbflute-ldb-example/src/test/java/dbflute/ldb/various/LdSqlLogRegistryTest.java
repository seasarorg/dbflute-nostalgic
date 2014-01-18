package dbflute.ldb.various;

import dbflute.ldb.LdbTestCase;
import dbflute.ldb.allcommon.s2dao.internal.sqllog.LdInternalSqlLogRegistry;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.exbhv.LdBookBhv;

public class LdSqlLogRegistryTest extends LdbTestCase {

    protected LdBookBhv ldBookBhv;

    public void test_SqlLogRegistry_NotFound_as_Default_Tx() throws Exception {
        {
            final Object registry = LdInternalSqlLogRegistry.findContainerSqlLogRegistry();
            assertNull(registry);
        }
        final LdBookCB cb = new LdBookCB();
        ldBookBhv.selectList(cb);
        {
            final Object registry = LdInternalSqlLogRegistry.findContainerSqlLogRegistry();
            assertNull(registry);
        }
    }

    // TODO: @jflute -- Seasar-2.4.11問題が解決するまでテストできない。。。
    //    public void test_SqlLogRegistry_Exist_after_Setting_Tx() throws Exception {
    //        final Object registry = LdInternalSqlLogRegistry.findContainerSqlLogRegistry();
    //        assertNotNull(registry);
    //    }
}

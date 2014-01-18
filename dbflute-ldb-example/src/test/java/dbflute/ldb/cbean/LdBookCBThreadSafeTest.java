package dbflute.ldb.cbean;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookCBThreadSafeTest extends LdBookAllDbTestCase {

    // そもそもDerbyが組み込みなので、マルチスレッドの検証が厳密じゃないかもしれないので、
    // 他のDBのExampleにてテストすること
    public void test_selectList_ThreadSafe_DaoInitializing_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Map<String, Exception> exceptionMap = new HashMap<String, Exception>();
        final Runnable tranOne = new Runnable() {
            public void run() {
                try {
                    final LdBookCB cb = new LdBookCB();
                    _log.debug("tranOne: selectList()");
                    getMyBhv().selectList(cb);
                } catch (Exception e) {
                    _log.warn("tranOne", e);
                    exceptionMap.put("tranOne", e);
                }
            }
        };
        final Runnable tranTwo = new Runnable() {
            public void run() {
                try {
                    final LdBookCB cb = new LdBookCB();
                    _log.debug("tranTwo: selectList()");
                    getMyBhv().selectList(cb);
                } catch (Exception e) {
                    _log.warn("tranTwo", e);
                    exceptionMap.put("tranTwo", e);
                }
            }
        };
        final Runnable tranThree = new Runnable() {
            public void run() {
                try {
                    final LdBookCB cb = new LdBookCB();
                    _log.debug("tranThree: selectList()");
                    getMyBhv().selectList(cb);
                } catch (Exception e) {
                    _log.warn("tranThree", e);
                    exceptionMap.put("tranThree", e);
                }
            }
        };
        final Thread threadOne = new Thread(tranOne);
        final Thread threadTwo = new Thread(tranTwo);
        final Thread threadThree = new Thread(tranThree);

        ExecutorService es = Executors.newCachedThreadPool();
        es.submit(threadOne);
        es.submit(threadTwo);
        es.submit(threadThree);
        final LdBookCB cb = new LdBookCB();
        _log.debug("main: selectList()");
        getMyBhv().selectList(cb);
        
        // Derbyの組み込みだと、これを入れないと例外になってしまう。
        // 詳細な原因は不明。
        sleep(3000);
        
        Set<String> keySet = exceptionMap.keySet();
        for (String key : keySet) {
            Exception exception = exceptionMap.get(key);
            _log.debug(key + ":", exception);
        }
    }

    protected void sleep(int count) {
        try {
            Thread.sleep(count);
        } catch (InterruptedException ignored) {
            ignored.printStackTrace();
        }
    }
}

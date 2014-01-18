package com.example.dbflute.buri.unit;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.dbflute.AccessContext;
import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.DeleteOption;
import org.seasar.dbflute.cbean.PagingResultBean;
import org.seasar.extension.unit.S2TestCase;

import com.example.dbflute.buri.dbflute.cbean.DocumentCB;
import com.example.dbflute.buri.dbflute.exbhv.DocumentBhv;

/**
 * The test base of application for Basic Example.
 * 
 * @author jflute
 * @since 0.5.9 (2007/12/2 Thursday)
 */
public abstract class ContainerTestCase extends S2TestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance for sub class. */
    private static final Log _log = LogFactory.getLog(ContainerTestCase.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // protected Timestamp accessTimestamp;
    protected Date accessDate;

    protected String accessUser;

    protected String accessProcess;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() {
        initializeAccessContext();
        include("app.dicon");
    }

    protected void initializeAccessContext() {
        // accessTimestamp = currentTimestamp();
        accessDate = currentTimestamp();
        accessUser = "testUser";
        accessProcess = getClass().getSimpleName();
        AccessContext context = new AccessContext();
        // context.setAccessTimestamp(accessTimestamp);
        context.setAccessDate(accessDate);
        context.setAccessUser(accessUser);
        context.setAccessProcess(accessProcess);
        AccessContext.setAccessContextOnThread(context);
    }

    @Override
    public void tearDown() {
        destroyAccessContext();
    }

    protected void destroyAccessContext() {
        AccessContext.clearAccessContextOnThread();
    }

    @Override
    protected boolean needTransaction() {
        return true; // all executions are in transaction
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    private BehaviorSelector _behaviorSelector;

    protected void deleteAllDocument() {
        DocumentBhv bhv = _behaviorSelector.select(DocumentBhv.class);
        bhv.varyingQueryDelete(bhv.newMyConditionBean(), new DeleteOption<DocumentCB>().allowNonQueryDelete());
    }

    protected void showPage(PagingResultBean<? extends Object>... pages) {
        for (PagingResultBean<? extends Object> page : pages) {
            log(page);
        }
        int count = 1;
        for (PagingResultBean<? extends Object> page : pages) {
            log("[page" + count + "]");
            for (Object entity : page) {
                log("  " + entity);
            }
            ++count;
        }
    }

    protected void showList(List<? extends Object>... lss) {
        for (List<? extends Object> ls : lss) {
            log(ls);
        }
        int count = 1;
        for (List<? extends Object> ls : lss) {
            log("[page" + count + "]");
            for (Object entity : ls) {
                log("  " + entity);
            }
            ++count;
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected void log(Object msg) {
        _log.debug(msg);
    }

    protected Date currentDate() {
        return new Date(System.currentTimeMillis());
    }

    protected Timestamp currentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }

    protected static String getLineSeparator() {
        return System.getProperty("line.separator");
    }
}

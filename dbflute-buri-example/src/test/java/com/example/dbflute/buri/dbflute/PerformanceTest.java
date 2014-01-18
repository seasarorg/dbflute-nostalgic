package com.example.dbflute.buri.dbflute;

import org.seasar.dbflute.util.DfTraceViewUtil;

import com.example.dbflute.buri.dbflute.allcommon.plugin.buri.BuriDef;
import com.example.dbflute.buri.dbflute.exbhv.BuriStateBhv;
import com.example.dbflute.buri.dbflute.exbhv.DocumentBhv;
import com.example.dbflute.buri.dbflute.exentity.Document;
import com.example.dbflute.buri.unit.ContainerTestCase;

/**
 * @author jflute
 */
public class PerformanceTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DocumentBhv _documentBhv;
    protected BuriStateBhv _buriStateBhv;

    // ===================================================================================
    //                                                                         Performance
    //                                                                         ===========
    public void test_toNextStatus_Performance_Tx() {
        // ## Arrange ##
        deleteAllDocument();
        Document document = new Document("Test", "It's test!");

        // ## Act ##
        long before = 0;
        long after = 0;
        log(" ");
        log(" ");
        log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
        log("                                                              * First toNextStatus() *");
        log("                                                              * * * * * * * * * * * **");
        before = System.currentTimeMillis();
        _documentBhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.Next);
        after = System.currentTimeMillis();
        log("* * * * * * * * * */: [" + DfTraceViewUtil.convertToPerformanceView(after - before) + "]");
        log(" ");

        // ## Assert ##
        BuriDef.文書管理_文書公開_Status firstStatus = _documentBhv.getStatus_文書管理_文書公開(document);
        assertEquals(BuriDef.文書管理_文書公開_Status.レビュー待ち, firstStatus);

        // ## Act ##
        log(" ");
        log(" ");
        log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
        log("                                                             * Second toNextStatus() *");
        log("                                                             * * * * * * * * * * * * *");
        before = System.currentTimeMillis();
        _documentBhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.問題なし);
        after = System.currentTimeMillis();
        log("* * * * * * * * * */: [" + DfTraceViewUtil.convertToPerformanceView(after - before) + "]");
        log(" ");

        // ## Assert ##
        BuriDef.文書管理_文書公開_Status secondStatus = _documentBhv.getStatus_文書管理_文書公開(document);
        assertEquals(BuriDef.文書管理_文書公開_Status.公開待ち, secondStatus);

        // ## Act ##
        log(" ");
        log(" ");
        log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
        log("                                                              * Third toNextStatus() *");
        log("                                                              * * * * * * * * * * * **");
        before = System.currentTimeMillis();
        _documentBhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.Next);
        after = System.currentTimeMillis();
        log("* * * * * * * * * */: [" + DfTraceViewUtil.convertToPerformanceView(after - before) + "]");
        log(" ");

        // ## Assert ##
        BuriDef.文書管理_文書公開_Status thirdStatus = _documentBhv.getStatus_文書管理_文書公開(document);
        assertEquals(BuriDef.文書管理_文書公開_Status.公開中, thirdStatus);
    }
}

package com.example.dbflute.buri.dbflute;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.AccessContext;
import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.buri.dbflute.allcommon.plugin.buri.BuriDef;
import com.example.dbflute.buri.dbflute.allcommon.plugin.buri.BuriDef.文書管理_文書公開_Status;
import com.example.dbflute.buri.dbflute.cbean.BuriAllRoundStateHistoryCB;
import com.example.dbflute.buri.dbflute.cbean.BuriStateCB;
import com.example.dbflute.buri.dbflute.exbhv.BuriAllRoundStateBhv;
import com.example.dbflute.buri.dbflute.exbhv.BuriAllRoundStateHistoryBhv;
import com.example.dbflute.buri.dbflute.exbhv.BuriStateBhv;
import com.example.dbflute.buri.dbflute.exbhv.DocumentBhv;
import com.example.dbflute.buri.dbflute.exentity.BuriAllRoundStateHistory;
import com.example.dbflute.buri.dbflute.exentity.BuriPath;
import com.example.dbflute.buri.dbflute.exentity.BuriState;
import com.example.dbflute.buri.dbflute.exentity.Document;
import com.example.dbflute.buri.unit.ContainerTestCase;

/**
 * BehaviorのBuri対応メソッドのExample.
 * @author jflute
 */
public class VariousTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DocumentBhv _documentBhv;
    protected BuriStateBhv _buriStateBhv;
    protected BuriAllRoundStateBhv _buriAllRoundStateBhv;
    protected BuriAllRoundStateHistoryBhv _buriAllRoundStateHistoryBhv;

    // ===================================================================================
    //                                                                      toNextStatus()
    //                                                                      ==============
    /**
     * The example of toNextStatus().
     * <pre>
     * First  : レビュー待ち (through 文書作成)
     * Second : 差し戻し    (Action is 手直し必要)
     * Third  : レビュー待ち (through 文書作成)
     * Fourth : 公開待ち    (Action is 問題なし, through レビュー通し)
     * Fifth  : 公開中      (through 公開)
     * Sixth  : 公開終了    (The End)
     * </pre>
     */
    public void test_toNextStatus_basic_Tx() {
        // ## Arrange ##
        deleteAllDocument();
        Document document = new Document("Test", "It's test!");
        assertNull(document.getId());

        // ## Act ##
        log(" ");
        log(" ");
        log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
        log("                                                              * First toNextStatus() *");
        log("                                                              * * * * * * * * * * * **");
        _documentBhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.Next);
        log("* * * * * * * * * */");
        log(" ");

        // ## Assert ##
        assertEquals(BuriDef.文書管理_文書公開_Status.レビュー待ち, _documentBhv.getStatus_文書管理_文書公開(document));
        assertNotNull(document.getId());
        log("document=" + document + " status=" + _documentBhv.getStatus_文書管理_文書公開(document));

        // ## Act ##
        log(" ");
        log(" ");
        log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
        log("                                                             * Second toNextStatus() *");
        log("                                                             * * * * * * * * * * * * *");
        switchAccessUser("secondUser");
        _documentBhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.手直し必要);
        log("* * * * * * * * * */");
        log(" ");

        // ## Assert ##
        assertEquals(BuriDef.文書管理_文書公開_Status.差し戻し, _documentBhv.getStatus_文書管理_文書公開(document));

        // ## Act ##
        log(" ");
        log(" ");
        log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
        log("                                                              * Third toNextStatus() *");
        log("                                                              * * * * * * * * * * * **");
        switchAccessUser("thirdUser");
        _documentBhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.Next);
        log("* * * * * * * * * */");
        log(" ");

        // ## Assert ##
        assertEquals(BuriDef.文書管理_文書公開_Status.レビュー待ち, _documentBhv.getStatus_文書管理_文書公開(document));

        // ## Act ##
        log(" ");
        log(" ");
        log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
        log("                                                             * Fourth toNextStatus() *");
        log("                                                             * * * * * * * * * * * * *");
        switchAccessUser("fourthUser");
        _documentBhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.問題なし);
        log("* * * * * * * * * */");
        log(" ");

        // ## Assert ##
        assertEquals(BuriDef.文書管理_文書公開_Status.公開待ち, _documentBhv.getStatus_文書管理_文書公開(document));
        assertNotNull(document.getId());

        // ## Act ##
        log(" ");
        log(" ");
        log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
        log("                                                              * Fifth toNextStatus() *");
        log("                                                              * * * * * * * * * * * **");
        switchAccessUser("fifthUser");
        _documentBhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.Next);
        log("* * * * * * * * * */");
        log(" ");

        // ## Assert ##
        assertEquals(BuriDef.文書管理_文書公開_Status.公開中, _documentBhv.getStatus_文書管理_文書公開(document));
        assertNotNull(document.getId());

        // ## Act ##
        _documentBhv.loadBuriAllRoundStateHistory_文書管理_文書公開List(document,
                new ConditionBeanSetupper<BuriAllRoundStateHistoryCB>() {
                    public void setup(BuriAllRoundStateHistoryCB cb) {
                        cb.query().addOrderBy_StatusUpdateDatetime_Asc();
                    }
                });

        // ## Assert ##
        showAllStateHistory();
        showStateHistory(document);
    }

    protected void showAllStateHistory() {
        BuriAllRoundStateHistoryCB historyCB = new BuriAllRoundStateHistoryCB();
        historyCB.setupSelect_Document_文書管理_文書公開().withBuriAllRoundState_文書管理_文書公開();
        historyCB.query().addOrderBy_StatusUpdateDatetime_Asc();
        ListResultBean<BuriAllRoundStateHistory> hisotryList = _buriAllRoundStateHistoryBhv.selectList(historyCB);
        assertNotSame(0, hisotryList.size());
        StringBuilder sb = new StringBuilder();
        sb.append(getLineSeparator()).append("[BuriAllRoundStateHistory as All List]");
        for (BuriAllRoundStateHistory history : hisotryList) {
            Document document_文書管理_文書公開 = history.getDocument_文書管理_文書公開();
            文書管理_文書公開_Status currentStatus = document_文書管理_文書公開.getStatus_文書管理_文書公開();
            assertNotNull(currentStatus); // because the status is not end.
            Long pkValue = history.getInternalPkValue();
            String statusPathName = history.getStatusPathName();
            String statusUpdateUser = history.getStatusUpdateUser();
            Timestamp statusUpdateDatetime = history.getStatusUpdateDatetime();
            sb.append(getLineSeparator()).append("  ");
            sb.append(pkValue).append(", ").append(statusPathName).append(", ").append(statusUpdateUser);
            sb.append(", {").append(statusUpdateDatetime).append("}");
            sb.append(", current=").append(document_文書管理_文書公開).append(":").append(currentStatus.code());
        }
        log(sb.toString());
    }

    protected void showStateHistory(Document document) {
        List<BuriAllRoundStateHistory> historyList = document.getBuriAllRoundStateHistory_文書管理_文書公開List();
        StringBuilder sb = new StringBuilder();
        sb.append(getLineSeparator()).append("[BuriAllRoundStateHistory as Loaded Referrer]");
        for (BuriAllRoundStateHistory history : historyList) {
            Long pkValue = history.getInternalPkValue();
            String statusPathName = history.getStatusPathName();
            String statusUpdateUser = history.getStatusUpdateUser();
            Timestamp statusUpdateDatetime = history.getStatusUpdateDatetime();
            sb.append(getLineSeparator()).append("  ");
            sb.append(pkValue).append(", ").append(statusPathName).append(", ").append(statusUpdateUser);
            sb.append(", {").append(statusUpdateDatetime).append("}");
        }
        log(sb.toString());
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected String switchAccessUser(String accessUser) {
        AccessContext.getAccessContextOnThread().setAccessUser(accessUser);
        return accessUser;
    }

    protected List<BuriState> selectStatusList(Document document) {
        if (document.getId() == null) {
            return new ArrayList<BuriState>();
        }
        BuriStateCB cb = new BuriStateCB();
        cb.setupSelect_BuriData();
        cb.setupSelect_BuriBranch().withBuriPath();
        cb.setupSelect_BuriBranch().withBuriData();
        cb.setupSelect_BuriPath();
        cb.query().queryBuriData().setPkeyNum_Equal(new Long(document.getId()));
        cb.query().queryBuriData().setDataType_Equal(document.getClass().getName());
        cb.query().queryBuriData().setTableName_Equal(document.getTableDbName());
        // Comment out because I want to show all records. 
        //cb.query().setProcessDate_GreaterThan(currentTimestamp());
        return _buriStateBhv.selectList(cb);
    }

    protected void showStatusList(List<BuriState> afterStatusList) {
        String line = "= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ";
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd");
        log(line + line);
        for (BuriState buristate : afterStatusList) {
            String participantName = buristate.getParticipantName();
            String processDate = fmt.format(buristate.getProcessDate());
            BuriPath buripath = buristate.getBuriPath();
            String pathName = buripath.getPathName();
            String realPathName = buripath.getRealPathName();
            log(participantName + ", " + processDate + ", " + pathName + ", " + realPathName);
        }
        log(line + line);
    }
}

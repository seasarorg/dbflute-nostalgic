package com.example.dbflute.buri.dbflute;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.AccessContext;
import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.cbean.SubQuery;

import com.example.dbflute.buri.dbflute.allcommon.plugin.buri.BuriDef;
import com.example.dbflute.buri.dbflute.allcommon.plugin.buri.BuriDef.文書管理_文書公開_Status;
import com.example.dbflute.buri.dbflute.cbean.BuriAllRoundStateHistoryCB;
import com.example.dbflute.buri.dbflute.cbean.BuriStateCB;
import com.example.dbflute.buri.dbflute.cbean.DocumentCB;
import com.example.dbflute.buri.dbflute.exbhv.BuriStateBhv;
import com.example.dbflute.buri.dbflute.exbhv.DocumentBhv;
import com.example.dbflute.buri.dbflute.exentity.BuriAllRoundState;
import com.example.dbflute.buri.dbflute.exentity.BuriAllRoundStateHistory;
import com.example.dbflute.buri.dbflute.exentity.BuriPath;
import com.example.dbflute.buri.dbflute.exentity.BuriState;
import com.example.dbflute.buri.dbflute.exentity.Document;
import com.example.dbflute.buri.unit.ContainerTestCase;

/**
 * BehaviorのBuri対応メソッドのExample.
 * @author jflute
 */
public class BuriMethodTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DocumentBhv _documentBhv;
    protected BuriStateBhv _buriStateBhv;

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
        _documentBhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.Next);
        log("* * * * * * * * * */");
        log(" ");

        // ## Assert ##
        assertEquals(BuriDef.文書管理_文書公開_Status.公開中, _documentBhv.getStatus_文書管理_文書公開(document));

        // ## Act ##
        log(" ");
        log(" ");
        log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
        log("                                                              * Sixth toNextStatus() *");
        log("                                                              * * * * * * * * * * * **");
        _documentBhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.Next);
        log("* * * * * * * * * */");
        log(" ");

        // ## Assert ##
        // Because the finish mode is Automatic
        BuriDef.文書管理_文書公開_Status thirdStatuses = _documentBhv.getStatus_文書管理_文書公開(document);
        assertNull(thirdStatuses);
        List<Document> bothList = _documentBhv.getEntities(new ConditionBeanSetupper<DocumentCB>() {
            public void setup(DocumentCB cb) {
                cb.query().addOrderBy_Id_Desc();
            }
        }, BuriDef.文書管理_文書公開_Status.公開待ち, BuriDef.文書管理_文書公開_Status.公開中);
        assertTrue(bothList.size() == 0);
    }

    // ===================================================================================
    //                                                                       getEntities()
    //                                                                       =============
    /**
     * Get entities of the specified statuses.
     */
    public void test_getEntities_basic_Tx() {
        // ## Arrange ##
        deleteAllDocument();

        // - - - - - - - - - - - - -
        // To review-waiting status
        // - - - - - - - - - - - - -
        Document document = new Document("Test", "It's test!");
        _documentBhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.Next);

        {
            // ## Act ##
            log(" ");
            log(" ");
            log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
            log("                                                               * First getEntities() *");
            log("                                                               ** * * * * * * * * * **");
            List<Document> reviewWaitingList = _documentBhv.getEntities(new ConditionBeanSetupper<DocumentCB>() {
                public void setup(DocumentCB cb) {
                    cb.query().addOrderBy_Id_Desc();
                }
            }, BuriDef.文書管理_文書公開_Status.レビュー待ち);
            log("* * * * * * * * * */");
            log(" ");

            log(" ");
            log(" ");
            log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
            log("                                                              * Second getEntities() *");
            log("                                                              * * * * * * * * * * * **");
            List<Document> releaseWaitingList = _documentBhv.getEntities(new ConditionBeanSetupper<DocumentCB>() {
                public void setup(DocumentCB cb) {
                    cb.query().addOrderBy_Id_Desc();
                }
            }, BuriDef.文書管理_文書公開_Status.公開待ち);
            log("* * * * * * * * * */");
            log(" ");

            // ## Assert ##
            log(reviewWaitingList);
            log(releaseWaitingList);
            assertTrue(reviewWaitingList.size() == 1);
            assertTrue(releaseWaitingList.size() == 0);

            // ## Act ##
            log(" ");
            log(" ");
            log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
            log("                                                               * Third getEntities() *");
            log("                                                               ** * * * * * * * * * **");
            List<Document> bothList = _documentBhv.getEntities(new ConditionBeanSetupper<DocumentCB>() {
                public void setup(DocumentCB cb) {
                    cb.query().addOrderBy_Id_Desc();
                }
            }, BuriDef.文書管理_文書公開_Status.レビュー待ち, BuriDef.文書管理_文書公開_Status.公開待ち);
            log("* * * * * * * * * */");
            log(" ");

            // ## Assert ##
            assertEquals(1, bothList.size());
            assertEquals(reviewWaitingList, bothList);
            assertNotNull(bothList.get(0).getStatus_文書管理_文書公開());
            assertEquals(BuriDef.文書管理_文書公開_Status.レビュー待ち, bothList.get(0).getStatus_文書管理_文書公開());
        }

        // ## Arrange ##
        // - - - - - - - - - - - - -
        // To release-waiting status
        // - - - - - - - - - - - - -
        _documentBhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.問題なし);

        {
            // ## Act ##
            log(" ");
            log(" ");
            log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
            log("                                                              * Fourth getEntities() *");
            log("                                                              * * * * * * * * * * * **");
            List<Document> reviewWaitingList = _documentBhv.getEntities(new ConditionBeanSetupper<DocumentCB>() {
                public void setup(DocumentCB cb) {
                    cb.query().addOrderBy_Id_Desc();
                }
            }, BuriDef.文書管理_文書公開_Status.レビュー待ち);
            log("* * * * * * * * * */");
            log(" ");

            log(" ");
            log(" ");
            log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
            log("                                                               * Fifth getEntities() *");
            log("                                                               ** * * * * * * * * * **");
            List<Document> releaseWaitingList = _documentBhv.getEntities(new ConditionBeanSetupper<DocumentCB>() {
                public void setup(DocumentCB cb) {
                    cb.query().addOrderBy_Id_Desc();
                }
            }, BuriDef.文書管理_文書公開_Status.公開待ち);
            log("* * * * * * * * * */");
            log(" ");

            // ## Assert ##
            log(reviewWaitingList);
            log(releaseWaitingList);
            assertTrue(reviewWaitingList.size() == 0);
            assertTrue(releaseWaitingList.size() == 1);

            // ## Act ##
            log(" ");
            log(" ");
            log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
            log("                                                               * Sixth getEntities() *");
            log("                                                               ** * * * * * * * * * **");
            List<Document> bothList = _documentBhv.getEntities(new ConditionBeanSetupper<DocumentCB>() {
                public void setup(DocumentCB cb) {
                    cb.query().addOrderBy_Id_Desc();
                }
            }, BuriDef.文書管理_文書公開_Status.レビュー待ち, BuriDef.文書管理_文書公開_Status.公開待ち);
            log("* * * * * * * * * */");
            log(" ");

            // ## Assert ##
            assertEquals(1, bothList.size());
            assertEquals(releaseWaitingList, bothList);
            assertNotNull(bothList.get(0).getStatus_文書管理_文書公開());
            assertEquals(BuriDef.文書管理_文書公開_Status.公開待ち, bothList.get(0).getStatus_文書管理_文書公開());
        }
    }

    public void test_getEntities_gettingValues_with_gettingHistories_Tx() {
        // ## Arrange ##
        deleteAllDocument();

        BuriDef.文書管理_文書公開_Status lastStatus = BuriDef.文書管理_文書公開_Status.公開中;
        Document document = new Document("Test", "It's test!");
        List<GettingValuesAssertResource> assertList = new ArrayList<GettingValuesAssertResource>();

        {
            // ## Act ##
            // - - - - - - - - - - - - -
            // To review-waiting status
            // - - - - - - - - - - - - -
            String expectedUpdateUser = switchAccessUser("review-waiting-user");
            log("...Processing toNextStatus(): " + document);
            _documentBhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.Next);
            BuriDef.文書管理_文書公開_Status expectedStatus = BuriDef.文書管理_文書公開_Status.レビュー待ち;
            log(" ");
            log(" ");
            log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
            log("                                                               * First getEntities() *");
            log("                                                               ** * * * * * * * * * **");
            List<Document> documentList = _documentBhv.getEntities(new ConditionBeanSetupper<DocumentCB>() {
                public void setup(DocumentCB cb) {
                    cb.query().addOrderBy_Id_Desc();
                }
            }, expectedStatus);
            log("* * * * * * * * * */");
            log(" ");
            assertList.add(createGettingValuesAssertResource(documentList, expectedStatus, expectedUpdateUser));
        }
        waitSeveralTimes();
        {
            // ## Act ##
            // - - - - - - - - - - - - -
            // To release-waiting status
            // - - - - - - - - - - - - -
            String expectedUpdateUser = switchAccessUser("release-waiting-user");
            log("...Processing toNextStatus(): " + document);
            _documentBhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.問題なし);
            BuriDef.文書管理_文書公開_Status expectedStatus = BuriDef.文書管理_文書公開_Status.公開待ち;
            log(" ");
            log(" ");
            log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
            log("                                                              * Second getEntities() *");
            log("                                                              * * * * * * * * * * * **");
            List<Document> documentList = _documentBhv.getEntities(new ConditionBeanSetupper<DocumentCB>() {
                public void setup(DocumentCB cb) {
                    cb.query().addOrderBy_Id_Desc();
                }
            }, expectedStatus);
            log("* * * * * * * * * */");
            log(" ");
            assertList.add(createGettingValuesAssertResource(documentList, expectedStatus, expectedUpdateUser));
        }
        waitSeveralTimes();
        {
            // ## Act ##
            // - - - - - - - - - - - - -
            // To being-released status
            // - - - - - - - - - - - - -
            String expectedUpdateUser = switchAccessUser("being-released-user");
            Document updateDocument = new Document();
            updateDocument.setId(document.getId());
            updateDocument.setContent("with updating entity");
            log("...Processing toNextStatus(): " + document);
            _documentBhv.toNextStatus_文書管理_文書公開(updateDocument, BuriDef.文書管理_文書公開_Action.Next);
            BuriDef.文書管理_文書公開_Status expectedStatus = BuriDef.文書管理_文書公開_Status.公開中;
            log(" ");
            log(" ");
            log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
            log("                                                               * Third getEntities() *");
            log("                                                               ** * * * * * * * * * **");
            List<Document> documentList = _documentBhv.getEntities(new ConditionBeanSetupper<DocumentCB>() {
                public void setup(DocumentCB cb) {
                    cb.query().addOrderBy_Id_Desc();
                }
            }, expectedStatus);
            log("* * * * * * * * * */");
            log(" ");
            assertEquals(1, documentList.size());
            assertEquals("with updating entity", documentList.get(0).getContent());
            assertList.add(createGettingValuesAssertResource(documentList, expectedStatus, expectedUpdateUser));
        }
        waitSeveralTimes();
        {
            // ## Act ##
            // - - - - - - - - - - - - - - -
            // Save the status, update only
            // - - - - - - - - - - - - - - -
            String preAccessUser = AccessContext.getAccessUserOnThread();
            switchAccessUser("update-user");
            document.setContent("update only");
            log("...Updating: " + document);
            _documentBhv.update(document);
            BuriDef.文書管理_文書公開_Status expectedStatus = BuriDef.文書管理_文書公開_Status.公開中;
            log(" ");
            log(" ");
            log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
            log("                                                              * Fourth getEntities() *");
            log("                                                              * * * * * * * * * * * **");
            List<Document> documentList = _documentBhv.getEntities(new ConditionBeanSetupper<DocumentCB>() {
                public void setup(DocumentCB cb) {
                    cb.query().addOrderBy_Id_Desc();
                }
            }, expectedStatus);
            log("* * * * * * * * * */");
            log(" ");
            assertEquals(1, documentList.size());
            assertEquals("update only", documentList.get(0).getContent());
            assertList.add(createGettingValuesAssertResource(documentList, expectedStatus, preAccessUser));
        }

        // ## Act ##
        log(" ");
        log(" ");
        log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
        log("                                                               * Exists History List *");
        log("                                                               * * * * * * * * * * * *");
        {
            List<Document> documentList = _documentBhv.getEntities(new ConditionBeanSetupper<DocumentCB>() {
                public void setup(DocumentCB cb) {
                    cb.query().existsBuriAllRoundStateHistory_文書管理_文書公開(new SubQuery<BuriAllRoundStateHistoryCB>() {
                        public void query(BuriAllRoundStateHistoryCB subCB) {
                            subCB.query().setStatus_Equal(BuriDef.文書管理_文書公開_Status.レビュー待ち);
                        }
                    });
                    cb.query().addOrderBy_Id_Desc();
                }
            }, lastStatus);
            assertEquals(1, documentList.size());
        }
        {
            List<Document> documentList = _documentBhv.getEntities(new ConditionBeanSetupper<DocumentCB>() {
                public void setup(DocumentCB cb) {
                    cb.query().existsBuriAllRoundStateHistory_文書管理_文書公開(new SubQuery<BuriAllRoundStateHistoryCB>() {
                        public void query(BuriAllRoundStateHistoryCB subCB) {
                            subCB.query().setStatus_Equal(BuriDef.文書管理_文書公開_Status.差し戻し);
                        }
                    });
                    cb.query().addOrderBy_Id_Desc();
                }
            }, lastStatus);
            assertEquals(0, documentList.size());
        }
        log("* * * * * * * * * */");
        log(" ");

        log(" ");
        log(" ");
        log("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * **");
        log("                                                                 * Load History List *");
        log("                                                                 * * * * * * * * * * *");
        _documentBhv.loadBuriAllRoundStateHistory_文書管理_文書公開List(document,
                new ConditionBeanSetupper<BuriAllRoundStateHistoryCB>() {
                    public void setup(BuriAllRoundStateHistoryCB cb) {
                        cb.query().addOrderBy_StatusUpdateDatetime_Asc();
                    }
                });
        log("* * * * * * * * * */");
        log(" ");

        // ## Assert ##
        // Assert saved resources
        Long preInternalPkValue = null;
        Timestamp preUpdateDatetime = null;
        for (GettingValuesAssertResource resource : assertList) {
            doAssertGettingValues(resource);
            BuriAllRoundState buriAllRoundState = resource.getDocument().getBuriAllRoundState_文書管理_文書公開();

            Timestamp updateDatetime = buriAllRoundState.getStatusUpdateDatetime();
            if (preUpdateDatetime != null) {
                assertNotSame(preUpdateDatetime.getTime(), updateDatetime.getTime());
            }
            preUpdateDatetime = updateDatetime;

            Long pkeyNum = buriAllRoundState.getInternalPkValue();
            if (preInternalPkValue != null) {
                assertEquals(preInternalPkValue, pkeyNum);
            }
            preInternalPkValue = pkeyNum;
        }

        // Assert loaded histories
        assertStateHistory(document);
    }

    private void doAssertGettingValues(GettingValuesAssertResource resource) {
        Document document = resource.getDocument();
        文書管理_文書公開_Status expectedStatus = resource.getExpectedStatus();
        String expectedUpdateUser = resource.getExpectedUpdateUser();

        log("");
        log("/= = = = = = = = = = = = = = = = = = = =: " + expectedStatus);
        log(document);
        assertEquals(expectedStatus, document.getStatus_文書管理_文書公開());
        BuriAllRoundState buriAllRoundState = document.getBuriAllRoundState_文書管理_文書公開();

        // The important columns for your application
        Timestamp statusUpdateDatetime = buriAllRoundState.getStatusUpdateDatetime();
        String statusUpdateUser = buriAllRoundState.getStatusUpdateUser();
        log("statusUpdateDatetime = " + statusUpdateDatetime);
        log("statusUpdateUser     = " + statusUpdateUser);
        assertNotNull(statusUpdateDatetime);
        assertEquals(expectedUpdateUser, statusUpdateUser);

        assertEquals("DummyParticipant", buriAllRoundState.getParticipantName());
        assertEquals("ROLE", buriAllRoundState.getParticipantType());
        assertEquals(document.getId(), Long.valueOf(buriAllRoundState.getInternalPkValue().toString()));
        log("= = = = = = = = = =/");
    }

    private GettingValuesAssertResource createGettingValuesAssertResource(List<Document> documentList,
            BuriDef.文書管理_文書公開_Status expectedStatus, String expectedUpdateUser) {
        assertEquals(1, documentList.size());
        GettingValuesAssertResource resource = new GettingValuesAssertResource();
        resource.setDocument(documentList.get(0));
        resource.setExpectedStatus(expectedStatus);
        resource.setExpectedUpdateUser(expectedUpdateUser);
        return resource;
    }

    private class GettingValuesAssertResource {
        private Document document;
        private BuriDef.文書管理_文書公開_Status expectedStatus;
        private String expectedUpdateUser;

        public Document getDocument() {
            return document;
        }

        public void setDocument(Document document) {
            this.document = document;
        }

        public BuriDef.文書管理_文書公開_Status getExpectedStatus() {
            return expectedStatus;
        }

        public void setExpectedStatus(BuriDef.文書管理_文書公開_Status expectedStatus) {
            this.expectedStatus = expectedStatus;
        }

        public String getExpectedUpdateUser() {
            return expectedUpdateUser;
        }

        public void setExpectedUpdateUser(String expectedUpdateUser) {
            this.expectedUpdateUser = expectedUpdateUser;
        }
    }

    private void waitSeveralTimes() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    private String switchAccessUser(String accessUser) {
        AccessContext.getAccessContextOnThread().setAccessUser(accessUser);
        return accessUser;
    }

    private void assertStateHistory(Document document) {
        List<BuriAllRoundStateHistory> historyList = document.getBuriAllRoundStateHistory_文書管理_文書公開List();
        StringBuilder sb = new StringBuilder();
        sb.append(getLineSeparator()).append("[BuriAllRoundStateHistory as Loaded Referrer]");
        for (BuriAllRoundStateHistory history : historyList) {
            Long pkValue = history.getInternalPkValue();

            String statusPathName = history.getStatusPathName();
            文書管理_文書公開_Status status = BuriDef.文書管理_文書公開_Status.codeOf(statusPathName);

            String statusUpdateUser = history.getStatusUpdateUser();
            Timestamp statusUpdateDatetime = history.getStatusUpdateDatetime();

            sb.append(getLineSeparator()).append("  ");
            sb.append(pkValue).append(", ").append(status.path()).append(", ").append(statusUpdateUser);
            sb.append(", {").append(statusUpdateDatetime).append("}");
        }
        log(sb.toString());
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
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

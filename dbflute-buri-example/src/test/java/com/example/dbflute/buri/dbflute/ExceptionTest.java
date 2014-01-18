package com.example.dbflute.buri.dbflute;

import java.sql.SQLException;

import ognl.MethodFailedException;

import org.escafe.buri.engine.processor.impl.BuriAutoSelectProcessorImpl;
import org.seasar.coffee.script.exception.ScriptExecuteException;
import org.seasar.dbflute.exception.EntityAlreadyDeletedException;
import org.seasar.dbflute.exception.EntityAlreadyExistsException;
import org.seasar.dbflute.exception.EntityAlreadyUpdatedException;

import com.example.dbflute.buri.dbflute.allcommon.plugin.buri.BuriDef;
import com.example.dbflute.buri.dbflute.exbhv.DocumentBhv;
import com.example.dbflute.buri.dbflute.exentity.Document;
import com.example.dbflute.buri.unit.ContainerTestCase;

/**
 * @author jflute
 */
public class ExceptionTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Exception
    //                                                                           =========
    public void test_toNextStatus_ExceptionExchanging_Tx() {
        // ## Arrange ##
        {
            DocumentBhv bhv = new DocumentBhv();
            bhv.setBuriAutoSelectProcessor(new BuriAutoSelectProcessorImpl() {
                @Override
                public void toNextStatusAction(String path, Object data, Object userData, Object action) {
                    SQLException sqlex = new SQLException();
                    EntityAlreadyExistsException dfex = new EntityAlreadyExistsException("fooMessage", sqlex);
                    MethodFailedException ognlex = new MethodFailedException("obj", "name", dfex);
                    ScriptExecuteException buriex = new ScriptExecuteException("barMessage", ognlex);
                    throw buriex;
                }
            });
            Document document = new Document("Test", "It's test!");

            // ## Act ##
            try {
                bhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.Next);

                // ## Assert ##
                fail();
            } catch (EntityAlreadyExistsException e) {
                // OK
                log(e.getMessage());
                assertEquals("fooMessage", e.getMessage());
            }
        }
        {
            DocumentBhv bhv = new DocumentBhv();
            bhv.setBuriAutoSelectProcessor(new BuriAutoSelectProcessorImpl() {
                @Override
                public void toNextStatusAction(String path, Object data, Object userData, Object action) {
                    EntityAlreadyDeletedException dfex = new EntityAlreadyDeletedException("fooMessage");
                    MethodFailedException ognlex = new MethodFailedException("obj", "name", dfex);
                    ScriptExecuteException buriex = new ScriptExecuteException("barMessage", ognlex);
                    throw buriex;
                }
            });
            Document document = new Document("Test", "It's test!");

            // ## Act ##
            try {
                bhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.Next);

                // ## Assert ##
                fail();
            } catch (EntityAlreadyDeletedException e) {
                // OK
                log(e.getMessage());
                assertEquals("fooMessage", e.getMessage());
            }
        }
        {
            DocumentBhv bhv = new DocumentBhv();
            bhv.setBuriAutoSelectProcessor(new BuriAutoSelectProcessorImpl() {
                @Override
                public void toNextStatusAction(String path, Object data, Object userData, Object action) {
                    EntityAlreadyUpdatedException dfex = new EntityAlreadyUpdatedException("fooObj", 1);
                    MethodFailedException ognlex = new MethodFailedException("obj", "name", dfex);
                    ScriptExecuteException buriex = new ScriptExecuteException("barMessage", ognlex);
                    throw buriex;
                }
            });
            Document document = new Document("Test", "It's test!");

            // ## Act ##
            try {
                bhv.toNextStatus_文書管理_文書公開(document, BuriDef.文書管理_文書公開_Action.Next);

                // ## Assert ##
                fail();
            } catch (EntityAlreadyUpdatedException e) {
                // OK
                log(e.getMessage());
                assertEquals("fooObj", e.getBean());
                assertEquals(1, e.getRows());
            }
        }
    }
}
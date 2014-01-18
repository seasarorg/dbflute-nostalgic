package com.example.dbflute.teeda.appcore;

import javax.servlet.ServletContextEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.teeda.core.webapp.TeedaConfigureListener;

/**
 * @author jflute
 */
public class AppListener extends TeedaConfigureListener {

    private static final Log log = LogFactory.getLog(AppListener.class);

    /**
     * Override for catching the errors and logging them. 
     * @param event The event of servlet context. (NotNull)
     */
    public void contextInitialized(ServletContextEvent event) {
        log.info(this.getClass().getSimpleName() + "#contextInitialized() Start!");
        try {
            super.contextInitialized(event);
        } catch (Throwable e) {
            log.error("contextInitialized(event) threw the exception!", e);
            throw new RuntimeException(e);
        } finally {
            log.info(this.getClass().getSimpleName() + "#contextInitialized() End!");
        }
    }

}

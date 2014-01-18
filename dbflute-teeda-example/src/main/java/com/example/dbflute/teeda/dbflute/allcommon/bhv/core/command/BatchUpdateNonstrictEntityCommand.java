package com.example.dbflute.teeda.dbflute.allcommon.bhv.core.command;

/**
 * @author DBFlute(AutoGenerator)
 */
public class BatchUpdateNonstrictEntityCommand extends BatchUpdateEntityCommand {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    @Override
    public String getCommandName() {
        return "batchUpdateNonstrict";
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    @Override
    protected boolean isOptimisticLockHandling() {
        return false;
    }
}

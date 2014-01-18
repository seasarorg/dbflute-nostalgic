package com.example.dbflute.basic.dbflute.allcommon.bhv.core.command;

/**
 * @author DBFlute(AutoGenerator)
 */
public class BatchDeleteNonstrictEntityCommand extends BatchDeleteEntityCommand {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    @Override
    public String getCommandName() {
        return "batchDeleteNonstrict";
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    @Override
    protected boolean isOptimisticLockHandling() {
        return false;
    }
}

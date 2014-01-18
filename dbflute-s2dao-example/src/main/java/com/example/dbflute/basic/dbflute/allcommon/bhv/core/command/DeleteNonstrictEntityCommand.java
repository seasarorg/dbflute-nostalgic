package com.example.dbflute.basic.dbflute.allcommon.bhv.core.command;

/**
 * @author DBFlute(AutoGenerator)
 */
public class DeleteNonstrictEntityCommand extends DeleteEntityCommand {

    // ===================================================================================
    //                                                                   Basic Information
    //                                                                   =================
    @Override
    public String getCommandName() {
        return "deleteNonstrict";
    }

    // ===================================================================================
    //                                                               SqlExecution Handling
    //                                                               =====================
    @Override
    protected boolean isOptimisticLockHandling() {
        return false;
    }
}

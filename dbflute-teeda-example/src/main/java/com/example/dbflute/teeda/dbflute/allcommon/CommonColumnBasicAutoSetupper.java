package com.example.dbflute.teeda.dbflute.allcommon;

import com.example.dbflute.teeda.dbflute.allcommon.Entity;
import com.example.dbflute.teeda.dbflute.allcommon.EntityDefinedCommonColumn;

/**
 * The basic implementation of the auto set-upper of common column.
 * @author DBFlute(AutoGenerator)
 */
public class CommonColumnBasicAutoSetupper implements CommonColumnAutoSetupper {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(CommonColumnAutoSetupper.class);

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========

    // =====================================================================================
    //                                                                                Set up
    //                                                                                ======
    /**
     * Handle common columns of insert if it needs.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    public void handleCommonColumnOfInsertIfNeeds(Entity targetEntity) {
        if (!(targetEntity instanceof EntityDefinedCommonColumn)) {
            return;
        }
        final EntityDefinedCommonColumn entity = (EntityDefinedCommonColumn)targetEntity;
        if (!entity.canCommonColumnAutoSetup()) {
            return;
        }
        if (_log.isDebugEnabled()) {
            String msg = "...Filtering entity of INSERT about the column columns of " + entity.getTableDbName();
            msg = msg + ": entity=" + entity.getDBMeta().extractPrimaryKeyMapString(entity, "{", "}", ", ", "=");
            _log.debug(msg);
        }

        final java.sql.Timestamp registerDatetime = com.example.dbflute.teeda.dbflute.allcommon.AccessContext.getAccessTimestampOnThread();
        entity.setRegisterDatetime(registerDatetime);

        final String registerUser = com.example.dbflute.teeda.dbflute.allcommon.AccessContext.getAccessUserOnThread();
        entity.setRegisterUser(registerUser);

        final String registerProcess = com.example.dbflute.teeda.dbflute.allcommon.AccessContext.getAccessProcessOnThread();
        entity.setRegisterProcess(registerProcess);

        final java.sql.Timestamp updateDatetime = entity.getRegisterDatetime();
        entity.setUpdateDatetime(updateDatetime);

        final String updateUser = entity.getRegisterUser();
        entity.setUpdateUser(updateUser);

        final String updateProcess = entity.getRegisterProcess();
        entity.setUpdateProcess(updateProcess);
    }

    /**
     * Handle common columns of update if it needs.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    public void handleCommonColumnOfUpdateIfNeeds(Entity targetEntity) {
        if (!(targetEntity instanceof EntityDefinedCommonColumn)) {
            return;
        }
        final EntityDefinedCommonColumn entity = (EntityDefinedCommonColumn)targetEntity;
        if (!entity.canCommonColumnAutoSetup()) {
            return;
        }
        if (_log.isDebugEnabled()) {
            String msg = "...Filtering entity of UPDATE about the column columns of " + entity.getTableDbName();
            msg = msg + ": entity=" + entity.getDBMeta().extractPrimaryKeyMapString(entity, "{", "}", ", ", "=");
            _log.debug(msg);
        }

        final java.sql.Timestamp updateDatetime = com.example.dbflute.teeda.dbflute.allcommon.AccessContext.getAccessTimestampOnThread();
        entity.setUpdateDatetime(updateDatetime);

        final String updateUser = com.example.dbflute.teeda.dbflute.allcommon.AccessContext.getAccessUserOnThread();
        entity.setUpdateUser(updateUser);

        final String updateProcess = com.example.dbflute.teeda.dbflute.allcommon.AccessContext.getAccessProcessOnThread();
        entity.setUpdateProcess(updateProcess);
    }
}

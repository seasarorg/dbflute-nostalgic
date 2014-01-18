/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.LdEntityDefinedCommonColumn;

/**
 * The basic implementation of the auto set-upper of common column.
 * @author DBFlute(AutoGenerator)
 */
public class LdCommonColumnBasicAutoSetupper implements LdCommonColumnAutoSetupper {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(LdCommonColumnAutoSetupper.class);

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
    public void handleCommonColumnOfInsertIfNeeds(LdEntity targetEntity) {
        if (!(targetEntity instanceof LdEntityDefinedCommonColumn)) {
            return;
        }
        final LdEntityDefinedCommonColumn entity = (LdEntityDefinedCommonColumn)targetEntity;
        if (!entity.canCommonColumnAutoSetup()) {
            return;
        }
        if (_log.isDebugEnabled()) {
            String msg = "...Filtering entity of INSERT about the column columns of " + entity.getTableDbName();
            msg = msg + ": entity=" + entity.getDBMeta().extractPrimaryKeyMapString(entity, "{", "}", ", ", "=");
            _log.debug(msg);
        }

        final String rUser = entity.getTableDbName() + "-" + dbflute.ldb.allcommon.LdAccessContext.getAccessUserOnThread();
        entity.setRUser(rUser);

        final String rModule = entity.getTableDbName() + "-" + dbflute.ldb.allcommon.LdAccessContext.getAccessModuleOnThread();
        entity.setRModule(rModule);

        final java.sql.Timestamp rTimestamp = dbflute.ldb.allcommon.LdAccessContext.getAccessTimestampOnThread();
        entity.setRTimestamp(rTimestamp);

        final String uUser = entity.getRUser();
        entity.setUUser(uUser);

        final String uModule = entity.getRUser();
        entity.setUModule(uModule);
    }

    /**
     * Handle common columns of update if it needs.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    public void handleCommonColumnOfUpdateIfNeeds(LdEntity targetEntity) {
        if (!(targetEntity instanceof LdEntityDefinedCommonColumn)) {
            return;
        }
        final LdEntityDefinedCommonColumn entity = (LdEntityDefinedCommonColumn)targetEntity;
        if (!entity.canCommonColumnAutoSetup()) {
            return;
        }
        if (_log.isDebugEnabled()) {
            String msg = "...Filtering entity of UPDATE about the column columns of " + entity.getTableDbName();
            msg = msg + ": entity=" + entity.getDBMeta().extractPrimaryKeyMapString(entity, "{", "}", ", ", "=");
            _log.debug(msg);
        }

        final String uUser = dbflute.ldb.allcommon.LdAccessContext.getAccessUserOnThread();
        entity.setUUser(uUser);

        final String uModule = dbflute.ldb.allcommon.LdAccessContext.getAccessModuleOnThread();
        entity.setUModule(uModule);
    }
}

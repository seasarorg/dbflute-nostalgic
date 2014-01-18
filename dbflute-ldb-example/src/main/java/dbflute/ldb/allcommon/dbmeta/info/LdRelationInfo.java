/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.dbmeta.info;

import java.util.Map;

import dbflute.ldb.allcommon.dbmeta.LdDBMeta;

/**
 * The class of referrer information.
 * @author DBFlute(AutoGenerator)
 */
public interface LdRelationInfo {

    public String getRelationPropertyName();

    public LdDBMeta getLocalDBMeta();

    public LdDBMeta getTargetDBMeta();

    public Map<LdColumnInfo, LdColumnInfo> getLocalTargetColumnInfoMap();

    public boolean isOneToOne();

    public boolean isReferrer();
}

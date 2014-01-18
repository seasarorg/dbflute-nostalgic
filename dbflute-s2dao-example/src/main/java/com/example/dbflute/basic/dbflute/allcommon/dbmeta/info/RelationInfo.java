package com.example.dbflute.basic.dbflute.allcommon.dbmeta.info;

import java.util.Map;

import com.example.dbflute.basic.dbflute.allcommon.dbmeta.DBMeta;

/**
 * The class of referrer information.
 * @author DBFlute(AutoGenerator)
 */
public interface RelationInfo {

    public String getRelationPropertyName();

    public DBMeta getLocalDBMeta();

    public DBMeta getTargetDBMeta();

    public Map<ColumnInfo, ColumnInfo> getLocalTargetColumnInfoMap();

    public boolean isOneToOne();

    public boolean isReferrer();
}

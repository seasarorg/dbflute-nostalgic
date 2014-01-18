package com.example.dbflute.teeda.dbflute.allcommon.dbmeta.hierarchy.basic;


import com.example.dbflute.teeda.dbflute.allcommon.dbmeta.hierarchy.HierarchySourceColumn;
import com.example.dbflute.teeda.dbflute.allcommon.dbmeta.info.ColumnInfo;

/**
 * @author DBFlute(AutoGenerator)
 */
public class HierarchySourceEntityColumn implements HierarchySourceColumn {

    protected ColumnInfo columnInfo;

    public HierarchySourceEntityColumn(ColumnInfo columnInfo) {
        this.columnInfo = columnInfo;
    }

    public String getColumnName() {
        return columnInfo.getColumnDbName();
    }

    public java.lang.reflect.Method findGetter() {
        return columnInfo.findGetter();
    }
}
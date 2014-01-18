/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.dbmeta.info;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import dbflute.ldb.allcommon.dbmeta.LdDBMeta;

/**
 * The information of unique constraint.
 * @author DBFlute(AutoGenerator)
 */
public class LdUniqueInfo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LdDBMeta dbmeta;
    protected final List<LdColumnInfo> uniqueColumnList;
    protected final boolean primary;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdUniqueInfo(LdDBMeta dbmeta, List<LdColumnInfo> uniqueColumnList, boolean primary) {
        assertObjectNotNull("dbmeta", dbmeta);
        assertObjectNotNull("uniqueColumnList", uniqueColumnList);
        this.dbmeta = dbmeta;
        this.uniqueColumnList = uniqueColumnList;
        this.primary = primary;
    }

    // ===================================================================================
    //                                                                         Easy-to-Use
    //                                                                         ===========
    public boolean containsColumn(LdColumnInfo columnInfo) {
        return containsColumn(columnInfo.getColumnDbName());
    }

    protected boolean containsColumn(String columnName) {
        for (final Iterator<LdColumnInfo> ite = uniqueColumnList.iterator(); ite.hasNext(); ) {
            final LdColumnInfo columnInfo = ite.next();
            if (columnInfo.getColumnDbName().equals(columnName)) {
                return true;
            }
        }
        return false;
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    /**
     * Assert that the object is not null.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     * @exception IllegalArgumentException
     */
    protected void assertObjectNotNull(String variableName, Object value) {
        if (variableName == null) {
            String msg = "The value should not be null: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            String msg = "The value should not be null: variableName=" + variableName;
            throw new IllegalArgumentException(msg);
        }
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public int hashCode() {
        return dbmeta.hashCode() + uniqueColumnList.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof LdUniqueInfo)) {
            return false;
        }
        final LdUniqueInfo target = (LdUniqueInfo)obj;
        if (!this.dbmeta.equals(target.getDBMeta())) {
            return false;
        }
        if (!this.uniqueColumnList.equals(target.getUniqueColumnList())) {
            return false;
        }
        return true;
    }

    public String toString() {
        return dbmeta.getTableDbName() + "." + uniqueColumnList;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public LdDBMeta getDBMeta() {
        return dbmeta;
    }

    /**
     * Get the list of unique column.
     * @return The list of unique column. (NotNull)
     */
    public List<LdColumnInfo> getUniqueColumnList() {
        return new ArrayList<LdColumnInfo>(uniqueColumnList); // as snapshot
    }

    /**
     * Get the column information of the first in primary columns.
     * @return The column information of the first in primary columns. (NotNull)
     */
    public LdColumnInfo getFirstColumn() {
        return this.uniqueColumnList.get(0);
    }

    public boolean isTwoOrMore() {
        return this.uniqueColumnList.size() > 1;
    }

    public boolean isPrimary() {
        return this.primary;
    }
}

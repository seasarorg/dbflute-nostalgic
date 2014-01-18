/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.dbmeta.hierarchy;


import java.util.List;

import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.info.LdColumnInfo;
import dbflute.ldb.allcommon.dbmeta.info.LdRelationInfo;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdHierarchyRequestElement {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Top key. */
    public static final String TOP_KEY = "$top$";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The column of source. */
    protected LdHierarchySourceColumn sourceColumn;

    /** The dbmeta of destination. */
    protected LdDBMeta destinationDBMeta;

    /** The column info of destination. */
    protected LdColumnInfo destinationColumnInfo;

    /** The list of relation info. */
    protected java.util.List<LdRelationInfo> relationInfoList = new java.util.ArrayList<LdRelationInfo>();

    /** the list of relation property name. */
    protected java.util.List<String> relationPropertyNameList = new java.util.ArrayList<String>();

    /** Relation property key. Default value is TOP_KEY. */
    protected String relationPropertyKey = TOP_KEY;

    // ===================================================================================
    //                                                                         Easy-to-Use
    //                                                                         ===========
    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /**
     * Make mapping between the source column and the destination one.
     * 
     * @param sourceColumn The column of source. (NotNull)
     * @param destinationColumnInfo The column info of destination. (NotNull)
     */
    public void mapping(LdHierarchySourceColumn sourceColumn, LdColumnInfo destinationColumnInfo) {
        this.sourceColumn = sourceColumn;
        this.destinationColumnInfo = destinationColumnInfo;
    }

    /**
     * Make relatetion by relation info.
     * 
     * @param relationInfo Relation info. (NotNull)
     */
    public void relation(LdRelationInfo relationInfo) {
        addRelationInfoList(relationInfo);
    }

    protected void addRelationInfoList(LdRelationInfo relationInfo) {
        relationInfoList.add(relationInfo);
        addRelationPropertyNameList(relationInfo.getRelationPropertyName());
    }

    protected void addRelationPropertyNameList(String relationPropertyName) {
        relationPropertyNameList.add(relationPropertyName);
        setupRelationPropertyKey();
    }

    protected void setupRelationPropertyKey() {
        final StringBuilder sb = new StringBuilder();
        for (String relationPropertyName : relationPropertyNameList) {
            if (sb.length() > 0) {
                sb.append("_");
            }
            sb.append(relationPropertyName);
        }
        this.relationPropertyKey = sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public LdHierarchySourceColumn getSourceColumnInfo() {
        return sourceColumn;
    }

    public void setSourceColumnInfo(LdHierarchySourceColumn sourceColumn) {
        this.sourceColumn = sourceColumn;
    }

    public void setDestinationDBMeta(LdDBMeta destinationDBMeta) {
        this.destinationDBMeta = destinationDBMeta;
    }

    public LdDBMeta getDestinationDBMeta() {
        return destinationDBMeta;
    }

    public LdColumnInfo getDestinationColumnInfo() {
        return destinationColumnInfo;
    }

    public java.util.List<LdRelationInfo> getRelationInfoList() {
        return relationInfoList;
    }

    public List<String> getRelationPropertyNameList() {
        return relationPropertyNameList;
    }

    public String getRelationPropertyKey() {
        return relationPropertyKey;
    }

    public String toString() {
        return sourceColumn + "," + destinationColumnInfo;
    }
}

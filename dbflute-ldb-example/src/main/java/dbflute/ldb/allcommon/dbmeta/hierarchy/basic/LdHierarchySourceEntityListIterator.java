/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.dbmeta.hierarchy.basic;


/**
 * @author DBFlute(AutoGenerator)
 * @param <SOURCE_ROW> The type of source.
 */
public class LdHierarchySourceEntityListIterator<SOURCE_ROW> extends LdHierarchySourceListIterator<SOURCE_ROW> {

    /**
     * Constructor.
     * 
     * @param sourceRowList The list of source row. (NotNull)
     */
    public LdHierarchySourceEntityListIterator(java.util.List<SOURCE_ROW> sourceRowList) {
        super(sourceRowList, new LdHierarchySourceRowSetupper<SOURCE_ROW>() {
            public dbflute.ldb.allcommon.dbmeta.hierarchy.LdHierarchySourceRow setup(SOURCE_ROW source) {
                return new LdHierarchySourceEntityRow(source);
            }
        });
    }
}
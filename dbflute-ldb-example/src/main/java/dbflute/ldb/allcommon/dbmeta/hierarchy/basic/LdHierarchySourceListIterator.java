/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.dbmeta.hierarchy.basic;


/**
 * @author DBFlute(AutoGenerator)
 * @param <SOURCE_ROW> The type of source.
 */
public class LdHierarchySourceListIterator<SOURCE_ROW> implements dbflute.ldb.allcommon.dbmeta.hierarchy.LdHierarchySourceIterator {

    protected java.util.List<? extends Object> sourceRowList;

    protected LdHierarchySourceRowSetupper<SOURCE_ROW> sourceRowSetupper;

    protected java.util.Iterator<SOURCE_ROW> sourceBeanListIterator;

    protected dbflute.ldb.allcommon.dbmeta.hierarchy.LdHierarchySourceRow currentSourceEntity;

    public LdHierarchySourceListIterator(java.util.List<SOURCE_ROW> sourceRowList,
            LdHierarchySourceRowSetupper<SOURCE_ROW> sourceRowSetupper) {
        this.sourceRowList = sourceRowList;
        this.sourceRowSetupper = sourceRowSetupper;
        this.sourceBeanListIterator = sourceRowList.iterator();
    }

    public boolean hasNext() {
        return this.sourceBeanListIterator.hasNext();
    }

    public dbflute.ldb.allcommon.dbmeta.hierarchy.LdHierarchySourceRow next() {
        this.currentSourceEntity = this.sourceRowSetupper.setup(this.sourceBeanListIterator.next());
        return this.currentSourceEntity;
    }

    public dbflute.ldb.allcommon.dbmeta.hierarchy.LdHierarchySourceRow current() {
        return this.currentSourceEntity;
    }
}
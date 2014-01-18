/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.dbmeta.hierarchy;


/**
 * @author DBFlute(AutoGenerator)
 */
public interface LdHierarchySourceIterator {

    public boolean hasNext();

    public LdHierarchySourceRow next();

    public LdHierarchySourceRow current();
}
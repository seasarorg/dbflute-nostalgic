/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.grouping;

/**
 * The class of option for grouping.
 * @param  <ENTITY> The type of entity.
 * @author DBFlute(AutoGenerator)
 */
public class LdGroupingOption<ENTITY> {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    protected int _elementCount;

    protected LdGroupingRowEndDeterminer<ENTITY> _groupingRowEndDeterminer;

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor. You should set the determiner of grouping row end after you create the instance.
     */
    public LdGroupingOption() {
    }

    /**
     * Constructor.
     * @param elementCount The count of row element in a group.
     */
    public LdGroupingOption(int elementCount) {
        _elementCount = elementCount;
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    public int getElementCount() {
        return this._elementCount;
    }

    public LdGroupingRowEndDeterminer<ENTITY> getGroupingRowEndDeterminer() {
        return this._groupingRowEndDeterminer;
    }

    public void setGroupingRowEndDeterminer(LdGroupingRowEndDeterminer<ENTITY> groupingRowEndDeterminer) {
        this._groupingRowEndDeterminer = groupingRowEndDeterminer;
    }
}

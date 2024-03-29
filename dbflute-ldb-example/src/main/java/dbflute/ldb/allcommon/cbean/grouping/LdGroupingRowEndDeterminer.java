/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.grouping;

/**
 * The interface of grouping end(switch point) determiner.
 * @param <ENTITY> The type of entity.
 * @author DBFlute(AutoGenerator)
 */
public interface LdGroupingRowEndDeterminer<ENTITY> {

    /**
     * Determine whether the grouping row is end.
     * @param rowResource The resource of grouping row. (NotNull and the property 'groupingRowList' is not empty and the property 'currentEntity' is not null)
     * @param nextEntity The entity of next element. (NotNull and the rowResource does not contain yet)
     * @return Whether the grouping row is end. (If the value is true, break grouping row and the nextEntity is registered to next row)
     */
    public boolean determine(LdGroupingRowResource<ENTITY> rowResource, ENTITY nextEntity);
}

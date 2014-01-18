/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.grouping;

/**
 * The setupper of grouping row.
 * @param <ROW> The type of row.
 * @param <ENTITY> The type of entity.
 * @author DBFlute(AutoGenerator)
 */
public interface LdGroupingRowSetupper<ROW, ENTITY> {

    /**
     * Set up the instance of grouping row.
     * @param groupingRowResource Grouping row resource. (NotNull)
     * @return The instance of grouping row. (NotNull)
     */
    public ROW setup(LdGroupingRowResource<ENTITY> groupingRowResource);
}

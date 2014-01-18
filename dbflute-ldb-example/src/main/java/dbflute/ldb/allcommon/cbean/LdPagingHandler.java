/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean;

import java.util.List;

/**
 * The handler of paging.
 * @param <ENTITY> The type of entity.
 * @author DBFlute(AutoGenerator)
 */
public interface LdPagingHandler<ENTITY> {

    /**
     * Get the bean of paging.
     * @return The bean of paging. (NotNull)
     */
    public LdPagingBean getPagingBean();

    /**
     * Execute SQL for count.
     * @return The count of execution.
     */
    public int count();

    /**
     * Execute SQL for paging.
     * @return The list of entity. (NotNull)
     */
    public List<ENTITY> paging();
}

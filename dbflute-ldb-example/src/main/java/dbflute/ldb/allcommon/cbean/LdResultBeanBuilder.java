/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean;

import java.util.List;

/**
 * The builder of result bean.
 * @param <ENTITY> The type of entity.
 * @author DBFlute(AutoGenerator)
 */
public class LdResultBeanBuilder<ENTITY> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected String _tableDbName;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdResultBeanBuilder(String tableDbName) {
        _tableDbName = tableDbName;
    }

    // ===================================================================================
    //                                                                             Builder
    //                                                                             =======
    /**
     * Build the result bean of list without order-by clause. {for Various}
     * @param selectedList Selected list. (NotNull)
     * @return The result bean of list. (NotNull)
     */
    public LdListResultBean<ENTITY> buildListResultBean(List<ENTITY> selectedList) {
        LdListResultBean<ENTITY> rb = new LdListResultBean<ENTITY>();
        rb.setTableDbName(_tableDbName);
        rb.setAllRecordCount(selectedList.size());
        rb.setSelectedList(selectedList);
        return rb;
    }

    /**
     * Build the result bean of list. {for CB}
     * @param cb The condition-bean. (NotNull)
     * @param selectedList Selected list. (NotNull)
     * @return The result bean of list. (NotNull)
     */
    public LdListResultBean<ENTITY> buildListResultBean(LdConditionBean cb, List<ENTITY> selectedList) {
        LdListResultBean<ENTITY> rb = new LdListResultBean<ENTITY>();
        rb.setTableDbName(_tableDbName);
        rb.setAllRecordCount(selectedList.size());
        rb.setSelectedList(selectedList);
        rb.setOrderByClause(cb.getSqlComponentOfOrderByClause());
        return rb;
    }

    /**
     * Build the result bean of paging. {for Paging}
     * @param pb The bean of paging. (NotNull)
     * @param allRecordCount All record count.
     * @param selectedList The list of selected entity. (NotNull)
     * @return The result bean of paging. (NotNull)
     */
    public LdPagingResultBean<ENTITY> buildPagingResultBean(LdPagingBean pb, int allRecordCount, List<ENTITY> selectedList) {
        LdPagingResultBean<ENTITY> rb = new LdPagingResultBean<ENTITY>();
        rb.setTableDbName(_tableDbName);
        rb.setAllRecordCount(allRecordCount);
        rb.setSelectedList(selectedList);
        rb.setOrderByClause(pb.getSqlComponentOfOrderByClause());
        rb.setPageSize(pb.getFetchSize());
        rb.setCurrentPageNumber(pb.getFetchPageNumber());
        return rb;
    }
}

package com.example.dbflute.lucy.dbflute.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import com.example.dbflute.lucy.dbflute.cbean.cq.ProductCQ;

/**
 * The nest select set-upper of PRODUCT.
 * @author DBFlute(AutoGenerator)
 */
public class ProductNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ProductCQ _query;
    public ProductNss(ProductCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br />
     * PRODUCT_STATUS by my PRODUCT_STATUS_CODE, named 'productStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public ProductStatusNss withProductStatus() {
        _query.doNss(new ProductCQ.NssCall() { public ConditionQuery qf() { return _query.queryProductStatus(); }});
        return new ProductStatusNss(_query.queryProductStatus());
    }

}

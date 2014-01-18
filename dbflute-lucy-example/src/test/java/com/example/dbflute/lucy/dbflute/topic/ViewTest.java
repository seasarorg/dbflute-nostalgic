package com.example.dbflute.lucy.dbflute.topic;

import java.util.List;

import org.seasar.dbflute.bhv.ConditionBeanSetupper;
import org.seasar.dbflute.cbean.ListResultBean;

import com.example.dbflute.lucy.dbflute.cbean.ProductStatusCB;
import com.example.dbflute.lucy.dbflute.cbean.SummaryProductCB;
import com.example.dbflute.lucy.dbflute.exbhv.ProductStatusBhv;
import com.example.dbflute.lucy.dbflute.exbhv.SummaryProductBhv;
import com.example.dbflute.lucy.dbflute.exentity.ProductStatus;
import com.example.dbflute.lucy.dbflute.exentity.SummaryProduct;
import com.example.dbflute.lucy.unit.ContainerTestCase;

/**
 * @author jflute
 * @since 0.7.7 (2008/07/23 Wednesday)
 */
public class ViewTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private SummaryProductBhv summaryProductBhv;
    private ProductStatusBhv productStatusBhv;

    // ===================================================================================
    //                                                                       Relation Test
    //                                                                       =============
    public void test_setupSelect_Tx() {
        // ## Arrange ##
        SummaryProductCB cb = new SummaryProductCB();
        cb.setupSelect_ProductStatus();

        // ## Act ##
        ListResultBean<SummaryProduct> productList = summaryProductBhv.selectList(cb);
        
        // ## Assert ##
        for (SummaryProduct product : productList) {
            assertNotNull(product.getProductStatus());
        }
    }
    
    public void test_foreign_loadReferrer_Tx() {
        // ## Arrange ##
        ProductStatusCB cb = new ProductStatusCB();
        ListResultBean<ProductStatus> productStatusList = productStatusBhv.selectList(cb);
        
        // ## Act ##
        productStatusBhv.loadSummaryProductList(productStatusList, new ConditionBeanSetupper<SummaryProductCB>() {
            public void setup(SummaryProductCB cb) {
                cb.query().addOrderBy_LatestPurchaseDatetime_Desc();
            }
        });
        
        // ## Assert ##
        boolean existsSummaryProduct = false;
        for (ProductStatus productStatus : productStatusList) {
            log(productStatus);
            List<SummaryProduct> summaryProductList = productStatus.getSummaryProductList();
            for (SummaryProduct summaryProduct : summaryProductList) {
                log("    " + summaryProduct.toString());
                existsSummaryProduct = true;
            }
        }
        assertTrue(existsSummaryProduct);
    }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.helper.collection.order;

import java.util.List;

/**
 * @author DBFlute(AutoGenerator)
 * @param <ELEMENT_TYPE> The type of element.
 * @param <ID_TYPE> The type of ID.
 */
public class LdAccordingToOrderOption<ELEMENT_TYPE, ID_TYPE> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ID_TYPE> _orderedUniqueIdList;

    protected LdAccordingToOrderIdExtractor<ELEMENT_TYPE, ID_TYPE> _idExtractor;

    // ===================================================================================
    //                                                                         Easy-to-Use
    //                                                                         ===========
    public void setupOrderedResource(List<ID_TYPE> orderedUniqueIdList, LdAccordingToOrderIdExtractor<ELEMENT_TYPE, ID_TYPE> idExtractor) {
        setOrderedUniqueIdList(orderedUniqueIdList);
        setIdExtractor(idExtractor);
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ID_TYPE> getOrderedUniqueIdList() {
        return _orderedUniqueIdList;
    }

    public void setOrderedUniqueIdList(List<ID_TYPE> orderedUniqueIdList) {
        this._orderedUniqueIdList = orderedUniqueIdList;
    }

    public LdAccordingToOrderIdExtractor<ELEMENT_TYPE, ID_TYPE> getIdExtractor() {
        return _idExtractor;
    }

    public void setIdExtractor(LdAccordingToOrderIdExtractor<ELEMENT_TYPE, ID_TYPE> idExtractor) {
        _idExtractor = idExtractor;
    }
}

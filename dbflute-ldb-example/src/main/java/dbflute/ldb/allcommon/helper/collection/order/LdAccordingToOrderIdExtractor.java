/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.helper.collection.order;

/**
 * @author DBFlute(AutoGenerator)
 * @param <ELEMENT_TYPE> The type of element.
 * @param <ID_TYPE> The type of ID.
 */
public interface LdAccordingToOrderIdExtractor<ELEMENT_TYPE, ID_TYPE> {

    /**
     * Extract ID from the element instance.
     * 
     * @param element Element instance. (NotNull)
     * @return Extracted ID. (NotNull)
     */
    ID_TYPE extractId(ELEMENT_TYPE element);
}

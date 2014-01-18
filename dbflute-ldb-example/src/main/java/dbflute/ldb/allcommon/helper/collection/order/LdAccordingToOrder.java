/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.helper.collection.order;

import java.util.List;

/**
 * @author DBFlute(AutoGenerator)
 */
public interface LdAccordingToOrder {

    /**
     * Order the unordered list.
     * 
     * @param option The option of according-to-order. (NotNull)
     * @param unorderedList The unordered list. (NotNull)
     * @param <ELEMENT_TYPE> The type of element.
     * @param <ID_TYPE> The type of ID.
     */
    <ELEMENT_TYPE, ID_TYPE> void order(List<ELEMENT_TYPE> unorderedList, LdAccordingToOrderOption<ELEMENT_TYPE, ID_TYPE> option);
}

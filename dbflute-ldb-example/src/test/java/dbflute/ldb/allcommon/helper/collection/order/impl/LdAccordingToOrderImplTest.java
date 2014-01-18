package dbflute.ldb.allcommon.helper.collection.order.impl;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.helper.collection.order.LdAccordingToOrderIdExtractor;
import dbflute.ldb.allcommon.helper.collection.order.LdAccordingToOrderOption;

public class LdAccordingToOrderImplTest extends TestCase {

    /** Log instance. */
    private static final Log _log = LogFactory.getLog(LdAccordingToOrderImplTest.class);

    // ===================================================================================
    //                                                                                Test
    //                                                                                ====
    public void test_order_NormalSuccess() throws Exception {
        // ## Arrange ##
        final LdAccordingToOrderImpl orderImpl = new LdAccordingToOrderImpl();

        final List<ElementDto> unorderedList = new ArrayList<ElementDto>();
        unorderedList.add(new ElementDto(1L, "First"));
        unorderedList.add(new ElementDto(2L, "Second"));
        unorderedList.add(new ElementDto(3L, "Third"));
        unorderedList.add(new ElementDto(4L, "Fourty"));
        unorderedList.add(new ElementDto(5L, "Fifty"));
        unorderedList.add(new ElementDto(6L, "Sixty"));
        unorderedList.add(new ElementDto(7L, "Seventy"));
        unorderedList.add(new ElementDto(8L, "Eighty"));
        unorderedList.add(new ElementDto(9L, "Ninety"));

        final LdAccordingToOrderOption<ElementDto, Long> option = new LdAccordingToOrderOption<ElementDto, Long>();
        final List<Long> orderedUniqueIdList = new ArrayList<Long>();
        orderedUniqueIdList.add(6L);
        orderedUniqueIdList.add(3L);
        orderedUniqueIdList.add(8L);
        orderedUniqueIdList.add(4L);
        orderedUniqueIdList.add(9L);
        orderedUniqueIdList.add(5L);
        orderedUniqueIdList.add(1L);
        // orderedUniqueIdList.add(7L); Remove 7 for null test
        orderedUniqueIdList.add(2L);
        final LdAccordingToOrderIdExtractor<ElementDto, Long> idExtractor = new LdAccordingToOrderIdExtractor<ElementDto, Long>() {
            public Long extractId(ElementDto element) {
                return element.getUniqueId();
            }
        };
        option.setupOrderedResource(orderedUniqueIdList, idExtractor);

        // Pre-Check
        assertEquals(new Long(1L), unorderedList.get(0).getUniqueId());
        assertEquals(new Long(2L), unorderedList.get(1).getUniqueId());
        assertEquals(new Long(3L), unorderedList.get(2).getUniqueId());
        assertEquals(new Long(4L), unorderedList.get(3).getUniqueId());
        assertEquals(new Long(5L), unorderedList.get(4).getUniqueId());
        assertEquals(new Long(6L), unorderedList.get(5).getUniqueId());
        assertEquals(new Long(7L), unorderedList.get(6).getUniqueId());
        assertEquals(new Long(8L), unorderedList.get(7).getUniqueId());
        assertEquals(new Long(9L), unorderedList.get(8).getUniqueId());
        
        // ## Act ##
        orderImpl.order(unorderedList, option);

        // ## Assert ##
        assertEquals(9, unorderedList.size());
        assertEquals(new Long(6L), unorderedList.get(0).getUniqueId());
        assertEquals(new Long(3L), unorderedList.get(1).getUniqueId());
        assertEquals(new Long(8L), unorderedList.get(2).getUniqueId());
        assertEquals(new Long(4L), unorderedList.get(3).getUniqueId());
        assertEquals(new Long(9L), unorderedList.get(4).getUniqueId());
        assertEquals(new Long(5L), unorderedList.get(5).getUniqueId());
        assertEquals(new Long(1L), unorderedList.get(6).getUniqueId());
        assertEquals(new Long(2L), unorderedList.get(7).getUniqueId());
        assertEquals(new Long(7L), unorderedList.get(8).getUniqueId());
    }

    public void test_order_DuplicateCheck() throws Exception {
        // ## Arrange ##
        final LdAccordingToOrderImpl orderImpl = new LdAccordingToOrderImpl();

        final List<ElementDto> unorderedList = new ArrayList<ElementDto>();
        unorderedList.add(new ElementDto(1L, "First"));
        unorderedList.add(new ElementDto(2L, "Second"));
        unorderedList.add(new ElementDto(3L, "Third"));
        unorderedList.add(new ElementDto(4L, "Fourty"));
        unorderedList.add(new ElementDto(5L, "Fifty"));
        unorderedList.add(new ElementDto(6L, "Sixty"));
        unorderedList.add(new ElementDto(7L, "Seventy"));
        unorderedList.add(new ElementDto(8L, "Eighty"));
        unorderedList.add(new ElementDto(9L, "Ninety"));

        final LdAccordingToOrderOption<ElementDto, Long> option = new LdAccordingToOrderOption<ElementDto, Long>();
        final List<Long> orderedUniqueIdList = new ArrayList<Long>();
        orderedUniqueIdList.add(6L);
        orderedUniqueIdList.add(3L);
        orderedUniqueIdList.add(8L);
        orderedUniqueIdList.add(4L);
        orderedUniqueIdList.add(6L);
        orderedUniqueIdList.add(5L);
        orderedUniqueIdList.add(1L);
        // orderedUniqueIdList.add(7L); Remove 7 for null test
        orderedUniqueIdList.add(2L);
        final LdAccordingToOrderIdExtractor<ElementDto, Long> idExtractor = new LdAccordingToOrderIdExtractor<ElementDto, Long>() {
            public Long extractId(ElementDto element) {
                return element.getUniqueId();
            }
        };
        option.setupOrderedResource(orderedUniqueIdList, idExtractor);

        // ## Act & Assert ##
        try {
            orderImpl.order(unorderedList, option);
            fail();
        } catch (IllegalStateException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                       Helper Object
    //                                                                       =============
    protected static class ElementDto {
        protected Long uniqueId;

        protected String elementName;

        public ElementDto(Long uniqueId, String elementName) {
            this.uniqueId = uniqueId;
            this.elementName = elementName;
        }

        public String getElementName() {
            return elementName;
        }

        public void setElementName(String elementName) {
            this.elementName = elementName;
        }

        public Long getUniqueId() {
            return uniqueId;
        }

        public void setUniqueId(Long uniqueId) {
            this.uniqueId = uniqueId;
        }
    }
}

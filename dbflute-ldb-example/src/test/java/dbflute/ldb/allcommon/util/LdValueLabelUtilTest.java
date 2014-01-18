package dbflute.ldb.allcommon.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

/**
 * @author jflute
 * @since 0.5.6 (2007/09/09 Sunday)
 */
@SuppressWarnings("deprecation")
public class LdValueLabelUtilTest extends TestCase {

    public void test_ValueLabelUtil_findLabel() throws Exception {
        final List<Map<String, Object>> valueLabelList = new ArrayList<Map<String, Object>>();
        {
            final Map<String, Object> map = new HashMap<String, Object>();
            map.put("value", 1);
            map.put("label", "ichi");
            valueLabelList.add(map);
        }
        {
            final Map<String, Object> map = new HashMap<String, Object>();
            map.put("value", 2);
            map.put("label", "ni");
            valueLabelList.add(map);
        }
        {
            final Map<String, Object> map = new HashMap<String, Object>();
            map.put("value", 3);
            map.put("label", "San");
            valueLabelList.add(map);
        }
        assertEquals("ichi", LdValueLabelUtil.findLabel(valueLabelList, 1));
        assertEquals("ni", LdValueLabelUtil.findLabel(valueLabelList, 2));
        assertEquals("San", LdValueLabelUtil.findLabel(valueLabelList, 3));
    }
    
    public void test_ValueLabelUtil_createValueLabelMap() throws Exception {
        // ## Arrange ##
        final List<Map<String, Object>> valueLabelList = new ArrayList<Map<String, Object>>();
        {
            final Map<String, Object> map = new HashMap<String, Object>();
            map.put("value", 1);
            map.put("label", "ichi");
            valueLabelList.add(map);
        }
        {
            final Map<String, Object> map = new HashMap<String, Object>();
            map.put("value", 2);
            map.put("label", "ni");
            valueLabelList.add(map);
        }
        {
            final Map<String, Object> map = new HashMap<String, Object>();
            map.put("value", 3);
            map.put("label", "San");
            valueLabelList.add(map);
        }
        
        // ## Act ##
        final Map<Object, String> valueLabelMap = LdValueLabelUtil.createValueLabelMap(valueLabelList);
        
        // ## Assert ##
        assertEquals("ichi", valueLabelMap.get(1));
        assertEquals("ni", valueLabelMap.get(2));
        assertEquals("San", valueLabelMap.get(3));
    }
    
    public void test_ValueLabelUtil_createLabelValueMap() throws Exception {
        // ## Arrange ##
        final List<Map<String, Object>> valueLabelList = new ArrayList<Map<String, Object>>();
        {
            final Map<String, Object> map = new HashMap<String, Object>();
            map.put("value", 1);
            map.put("label", "ichi");
            valueLabelList.add(map);
        }
        {
            final Map<String, Object> map = new HashMap<String, Object>();
            map.put("value", 2);
            map.put("label", "ni");
            valueLabelList.add(map);
        }
        {
            final Map<String, Object> map = new HashMap<String, Object>();
            map.put("value", 3);
            map.put("label", "San");
            valueLabelList.add(map);
        }
        
        // ## Act ##
        final Map<String, Object> labelValueMap = LdValueLabelUtil.createLabelValueMap(valueLabelList);
        
        // ## Assert ##
        assertEquals(1, labelValueMap.get("ichi"));
        assertEquals(2, labelValueMap.get("ni"));
        assertEquals(3, labelValueMap.get("San"));
    }
}

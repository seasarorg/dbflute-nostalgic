package dbflute.ldb.allcommon.s2dao.internal.various;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import junit.framework.TestCase;

/**
 * 
 * @author jflute
 * @since 0.8.1 (2008/10/01)
 */
public class LdInternalProcedureMetaDataTest extends TestCase {

    public void test_Order_all_parameter_index_is_null_Normal() {
        // ## Arrange ##
        LdInternalProcedureMetaData metaData = new LdInternalProcedureMetaData("name");

        // ## Act ##
        metaData.addParameterType(createParameterType("bbb"));
        metaData.addParameterType(createParameterType("aaa"));
        metaData.addParameterType(createParameterType("ddd"));
        metaData.addParameterType(createParameterType("eee"));
        metaData.addParameterType(createParameterType("ccc"));

        // ## Assert ##
        Collection<LdInternalProcedureParameterType> parameterTypes = metaData.parameterTypes();
        assertEquals(5, parameterTypes.size());
        logParameterTypes(parameterTypes);
        List<LdInternalProcedureParameterType> list = new ArrayList<LdInternalProcedureParameterType>(parameterTypes);
        assertEquals("bbb", list.get(0).getParameterName());
        assertEquals("aaa", list.get(1).getParameterName());
        assertEquals("ddd", list.get(2).getParameterName());
        assertEquals("eee", list.get(3).getParameterName());
        assertEquals("ccc", list.get(4).getParameterName());
    }

    public void test_Order_all_parameter_index_is_null_contains_returnType() {
        // ## Arrange ##
        LdInternalProcedureMetaData metaData = new LdInternalProcedureMetaData("name");

        // ## Act ##
        metaData.addParameterType(createParameterType("bbb"));
        metaData.addParameterType(createParameterType("aaa"));
        metaData.addParameterType(createParameterType("ddd"));
        metaData.addParameterType(createParameterTypeContainsReturnType("eee"));
        metaData.addParameterType(createParameterType("ccc"));

        // ## Assert ##
        Collection<LdInternalProcedureParameterType> parameterTypes = metaData.parameterTypes();
        assertEquals(5, parameterTypes.size());
        logParameterTypes(parameterTypes);
        List<LdInternalProcedureParameterType> list = new ArrayList<LdInternalProcedureParameterType>(parameterTypes);
        assertEquals("eee", list.get(0).getParameterName());
        assertEquals("bbb", list.get(1).getParameterName());
        assertEquals("aaa", list.get(2).getParameterName());
        assertEquals("ddd", list.get(3).getParameterName());
        assertEquals("ccc", list.get(4).getParameterName());
    }

    public void test_Orderparameter_index_is_not_null_contains_returnType() {
        // ## Arrange ##
        LdInternalProcedureMetaData metaData = new LdInternalProcedureMetaData("name");

        // ## Act ##
        metaData.addParameterType(createParameterType("bbb", 2));
        metaData.addParameterType(createParameterType("aaa", 1));
        metaData.addParameterType(createParameterType("ddd", 3));
        metaData.addParameterType(createParameterTypeContainsReturnType("eee"));
        metaData.addParameterType(createParameterType("ccc", 0));

        // ## Assert ##
        Collection<LdInternalProcedureParameterType> parameterTypes = metaData.parameterTypes();
        assertEquals(5, parameterTypes.size());
        logParameterTypes(parameterTypes);
        List<LdInternalProcedureParameterType> list = new ArrayList<LdInternalProcedureParameterType>(parameterTypes);
        assertEquals("eee", list.get(0).getParameterName());
        assertEquals("ccc", list.get(1).getParameterName());
        assertEquals("aaa", list.get(2).getParameterName());
        assertEquals("bbb", list.get(3).getParameterName());
        assertEquals("ddd", list.get(4).getParameterName());
    }
    
    public void test_Orderparameter_index_is_null_or_not_null_contains_returnType() {
        // ## Arrange ##
        LdInternalProcedureMetaData metaData = new LdInternalProcedureMetaData("name");
        
        // ## Act ##
        metaData.addParameterType(createParameterType("bbb", 3));
        metaData.addParameterType(createParameterType("aaa"));
        metaData.addParameterType(createParameterType("ddd", 4));
        metaData.addParameterType(createParameterTypeContainsReturnType("eee"));
        metaData.addParameterType(createParameterType("ccc", 1));
        
        // ## Assert ##
        Collection<LdInternalProcedureParameterType> parameterTypes = metaData.parameterTypes();
        assertEquals(5, parameterTypes.size());
        logParameterTypes(parameterTypes);
        List<LdInternalProcedureParameterType> list = new ArrayList<LdInternalProcedureParameterType>(parameterTypes);
        assertEquals("eee", list.get(0).getParameterName());
        assertEquals("ccc", list.get(1).getParameterName());
        assertEquals("bbb", list.get(2).getParameterName());
        assertEquals("ddd", list.get(3).getParameterName());
        assertEquals("aaa", list.get(4).getParameterName());
    }

    protected void logParameterTypes(Collection<LdInternalProcedureParameterType> parameterTypes) {
        for (LdInternalProcedureParameterType parameterType : parameterTypes) {
            System.out.println("name=" + parameterType.getParameterName() + ", index="
                    + parameterType.getParameterIndex() + " returnType=" + parameterType.isReturnType());
        }
    }

    protected LdInternalProcedureParameterType createParameterType(String name) {
        Field field = null;
        try {
            field = DummyPmb.class.getDeclaredField(name);
        } catch (SecurityException e) {
            throw new IllegalStateException(e);
        } catch (NoSuchFieldException e) {
            throw new IllegalStateException(e);
        }
        return new LdInternalProcedureParameterType(field);
    }

    protected LdInternalProcedureParameterType createParameterType(String name, Integer index) {
        LdInternalProcedureParameterType parameterType = createParameterType(name);
        parameterType.setParameterIndex(index);
        return parameterType;
    }

    protected LdInternalProcedureParameterType createParameterTypeContainsReturnType(String name) {
        LdInternalProcedureParameterType parameterType = createParameterType(name);
        parameterType.setReturnType(true);
        return parameterType;
    }

    protected static class DummyPmb {
        protected String aaa;
        protected String bbb;
        protected String ccc;
        protected String ddd;
        protected String eee;
    }
}

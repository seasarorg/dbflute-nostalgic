/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.various;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalProcedureMetaData {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private String procedureName;
    private Map<String, LdInternalProcedureParameterType> unorderedMap = createUnorderedMap();
    private Map<String, LdInternalProcedureParameterType> parameterTypes = createParameterTypes();
    private boolean returnType;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalProcedureMetaData(final String procedureName) {
        this.procedureName = procedureName;
    }

    // ===================================================================================
    //                                                                             Factory
    //                                                                             =======
    protected Map<String, LdInternalProcedureParameterType> createUnorderedMap() {
        return new HashMap<String, LdInternalProcedureParameterType>();
    }

    protected Map<String, LdInternalProcedureParameterType> createParameterTypes() {
        return new TreeMap<String, LdInternalProcedureParameterType>(new ParameterComparator());
    }

    protected class ParameterComparator implements Comparator<String> {
        public int compare(String o1, String o2) {
            final int oneGreaterThanTwo = 1;
            final int twoGreaterThanOne = -1;
            final LdInternalProcedureParameterType parameterType1 = unorderedMap.get(o1);
            final LdInternalProcedureParameterType parameterType2 = unorderedMap.get(o2);
            if (parameterType1.isReturnType()) {
                return twoGreaterThanOne; // Return type is prior
            }
            if (parameterType2.isReturnType()) {
                return oneGreaterThanTwo; // Return type is prior
            }
            final Integer parameterIndex1 = parameterType1.getParameterIndex();
            final Integer parameterIndex2 = parameterType2.getParameterIndex();
            if (parameterIndex1 == null && parameterIndex2 == null) {
                return oneGreaterThanTwo; // No changes
            }
            if (parameterIndex1 != null && parameterIndex2 == null) {
                return twoGreaterThanOne; // Not null is prior
            }
            if (parameterIndex1 == null && parameterIndex2 != null) {
                return oneGreaterThanTwo; // Not null is prior
            }
            return parameterIndex1.compareTo(parameterIndex2);
        }
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getProcedureName() {
        return procedureName;
    }

    public Collection<LdInternalProcedureParameterType> parameterTypes() {
        return parameterTypes.values();
    }

    public void addParameterType(final LdInternalProcedureParameterType parameterType) {
        final String name = parameterType.getParameterName();
        unorderedMap.put(name, parameterType);
        parameterTypes.put(name, parameterType);
        if (parameterType.isReturnType()) {
            returnType = true;
        }
    }

    public boolean hasReturnParameterType() {
        return returnType;
    }
}

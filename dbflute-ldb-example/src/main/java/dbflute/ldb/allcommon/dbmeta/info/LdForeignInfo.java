/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.dbmeta.info;

import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;

import dbflute.ldb.allcommon.dbmeta.LdDBMeta;

/**
 * The information of foreign relation.
 * @author DBFlute(AutoGenerator)
 */
public class LdForeignInfo implements LdRelationInfo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final String foreignPropertyName;
    protected final LdDBMeta localDBMeta;
    protected final LdDBMeta foreignDBMeta;
    protected final Map<LdColumnInfo, LdColumnInfo> localForeignColumnInfoMap;
    protected final Map<LdColumnInfo, LdColumnInfo> foreignLocalColumnInfoMap;
    protected final int relationNo;
    protected final boolean oneToOne;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdForeignInfo(String foreignPropertyName, LdDBMeta localDBMeta, LdDBMeta foreignDBMeta
                     , Map<LdColumnInfo, LdColumnInfo> localForeignColumnInfoMap
                     , int relationNo, boolean oneToOne) {
        assertObjectNotNull("foreignPropertyName", foreignPropertyName);
        assertObjectNotNull("localDBMeta", localDBMeta);
        assertObjectNotNull("foreignDBMeta", foreignDBMeta);
        assertObjectNotNull("localForeignColumnInfoMap", localForeignColumnInfoMap);
        this.foreignPropertyName = foreignPropertyName;
        this.localDBMeta = localDBMeta;
        this.foreignDBMeta = foreignDBMeta;
        this.localForeignColumnInfoMap = localForeignColumnInfoMap;
        final Set<LdColumnInfo> keySet = localForeignColumnInfoMap.keySet();
        foreignLocalColumnInfoMap = new LinkedHashMap<LdColumnInfo, LdColumnInfo>();
        for (final Iterator<LdColumnInfo> ite = keySet.iterator(); ite.hasNext(); ) {
            final LdColumnInfo key = ite.next();
            final LdColumnInfo value = localForeignColumnInfoMap.get(key);
            foreignLocalColumnInfoMap.put(value, key);
        }
        this.relationNo = relationNo;
        this.oneToOne = oneToOne;
    }

    // ===================================================================================
    //                                                                              Finder
    //                                                                              ======
    public LdColumnInfo findLocalByForeign(String foreignColumnDbName) {
        final LdColumnInfo keyColumnInfo = foreignDBMeta.findColumnInfo(foreignColumnDbName);
        final LdColumnInfo resultColumnInfo = (LdColumnInfo)foreignLocalColumnInfoMap.get(keyColumnInfo);
        if (resultColumnInfo == null) {
            String msg = "Not found by foreignColumnDbName in foreignLocalColumnInfoMap:";
            msg = msg + " foreignColumnDbName=" + foreignColumnDbName + " foreignLocalColumnInfoMap=" + foreignLocalColumnInfoMap;
            throw new IllegalArgumentException(msg);
        }
        return resultColumnInfo;
    }

    // ===================================================================================
    //                                                                              Finder
    //                                                                              ======
    public java.lang.reflect.Method findSetter() {
        return findMethod(localDBMeta.getEntityType(), "set" + buildInitCapPropertyName(), new Class[] { java.util.List.class });
    }

    public java.lang.reflect.Method findGetter() {
        return findMethod(localDBMeta.getEntityType(), "get" + buildInitCapPropertyName(), new Class[] {});
    }

    protected String buildInitCapPropertyName() {
        return initCap(this.foreignPropertyName);
    }

    // ===================================================================================
    //                                                                           Implement
    //                                                                           =========
    public String getRelationPropertyName() {
        return getForeignPropertyName();
    }

    public LdDBMeta getTargetDBMeta() {
        return getForeignDBMeta();
    }

    public Map<LdColumnInfo, LdColumnInfo> getLocalTargetColumnInfoMap() {
        return getLocalForeignColumnInfoMap();
    }

    public boolean isReferrer() {
        return false;
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected String initCap(final String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    protected java.lang.reflect.Method findMethod(Class<?> clazz, String methodName, Class<?>[] argTypes) {
        try {
            return clazz.getMethod(methodName, argTypes);
        } catch (NoSuchMethodException ex) {
            String msg = "class=" + clazz + " method=" + methodName + "-" + Arrays.asList(argTypes);
            throw new RuntimeException(msg, ex);
        }
    }

    /**
     * Assert that the object is not null.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     * @exception IllegalArgumentException
     */
    protected void assertObjectNotNull(String variableName, Object value) {
        if (variableName == null) {
            String msg = "The value should not be null: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            String msg = "The value should not be null: variableName=" + variableName;
            throw new IllegalArgumentException(msg);
        }
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public int hashCode() {
        return foreignPropertyName.hashCode() + localDBMeta.hashCode() + foreignDBMeta.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof LdForeignInfo)) {
            return false;
        }
        final LdForeignInfo target = (LdForeignInfo)obj;
        if (!this.foreignPropertyName.equals(target.getForeignPropertyName())) {
            return false;
        }
        if (!this.localDBMeta.equals(target.getLocalDBMeta())) {
            return false;
        }
        if (!this.foreignDBMeta.equals(target.getForeignDBMeta())) {
            return false;
        }
        return true;
    }

    public String toString() {
        return localDBMeta.getTableDbName() + "." + foreignPropertyName + "->" + foreignDBMeta.getTableDbName();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getForeignPropertyName() {
        return foreignPropertyName;
    }

    public LdDBMeta getLocalDBMeta() {
        return localDBMeta;
    }

    public LdDBMeta getForeignDBMeta() {
        return foreignDBMeta;
    }

    public Map<LdColumnInfo, LdColumnInfo> getLocalForeignColumnInfoMap() {
        return new LinkedHashMap<LdColumnInfo, LdColumnInfo>(localForeignColumnInfoMap); // as snapshot
    }

    public Map<LdColumnInfo, LdColumnInfo> getForeignLocalColumnInfoMap() {
        return new LinkedHashMap<LdColumnInfo, LdColumnInfo>(foreignLocalColumnInfoMap); // as snapshot
    }

    public int getRelationNo() {
        return relationNo;
    }

    public boolean isOneToOne() {
        return oneToOne;
    }
}

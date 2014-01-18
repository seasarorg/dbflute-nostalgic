package com.example.dbflute.basic.dbflute.allcommon.dbmeta.info;

import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;

import com.example.dbflute.basic.dbflute.allcommon.dbmeta.DBMeta;

/**
 * The information of foreign relation.
 * @author DBFlute(AutoGenerator)
 */
public class ForeignInfo implements RelationInfo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final String foreignPropertyName;
    protected final DBMeta localDBMeta;
    protected final DBMeta foreignDBMeta;
    protected final Map<ColumnInfo, ColumnInfo> localForeignColumnInfoMap;
    protected final Map<ColumnInfo, ColumnInfo> foreignLocalColumnInfoMap;
    protected final int relationNo;
    protected final boolean oneToOne;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ForeignInfo(String foreignPropertyName, DBMeta localDBMeta, DBMeta foreignDBMeta
                     , Map<ColumnInfo, ColumnInfo> localForeignColumnInfoMap
                     , int relationNo, boolean oneToOne) {
        assertObjectNotNull("foreignPropertyName", foreignPropertyName);
        assertObjectNotNull("localDBMeta", localDBMeta);
        assertObjectNotNull("foreignDBMeta", foreignDBMeta);
        assertObjectNotNull("localForeignColumnInfoMap", localForeignColumnInfoMap);
        this.foreignPropertyName = foreignPropertyName;
        this.localDBMeta = localDBMeta;
        this.foreignDBMeta = foreignDBMeta;
        this.localForeignColumnInfoMap = localForeignColumnInfoMap;
        final Set<ColumnInfo> keySet = localForeignColumnInfoMap.keySet();
        foreignLocalColumnInfoMap = new LinkedHashMap<ColumnInfo, ColumnInfo>();
        for (final Iterator<ColumnInfo> ite = keySet.iterator(); ite.hasNext(); ) {
            final ColumnInfo key = ite.next();
            final ColumnInfo value = localForeignColumnInfoMap.get(key);
            foreignLocalColumnInfoMap.put(value, key);
        }
        this.relationNo = relationNo;
        this.oneToOne = oneToOne;
    }

    // ===================================================================================
    //                                                                              Finder
    //                                                                              ======
    public ColumnInfo findLocalByForeign(String foreignColumnDbName) {
        final ColumnInfo keyColumnInfo = foreignDBMeta.findColumnInfo(foreignColumnDbName);
        final ColumnInfo resultColumnInfo = (ColumnInfo)foreignLocalColumnInfoMap.get(keyColumnInfo);
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

    public DBMeta getTargetDBMeta() {
        return getForeignDBMeta();
    }

    public Map<ColumnInfo, ColumnInfo> getLocalTargetColumnInfoMap() {
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
        if (obj == null || !(obj instanceof ForeignInfo)) {
            return false;
        }
        final ForeignInfo target = (ForeignInfo)obj;
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

    public DBMeta getLocalDBMeta() {
        return localDBMeta;
    }

    public DBMeta getForeignDBMeta() {
        return foreignDBMeta;
    }

    public Map<ColumnInfo, ColumnInfo> getLocalForeignColumnInfoMap() {
        return new LinkedHashMap<ColumnInfo, ColumnInfo>(localForeignColumnInfoMap); // as snapshot
    }

    public Map<ColumnInfo, ColumnInfo> getForeignLocalColumnInfoMap() {
        return new LinkedHashMap<ColumnInfo, ColumnInfo>(foreignLocalColumnInfoMap); // as snapshot
    }

    public int getRelationNo() {
        return relationNo;
    }

    public boolean isOneToOne() {
        return oneToOne;
    }
}

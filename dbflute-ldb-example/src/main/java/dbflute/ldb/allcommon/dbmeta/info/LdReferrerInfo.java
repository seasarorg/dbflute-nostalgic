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
 * The information of referrer relation.
 * @author DBFlute(AutoGenerator)
 */
public class LdReferrerInfo implements LdRelationInfo {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final String referrerPropertyName;
    protected final LdDBMeta localDBMeta;
    protected final LdDBMeta referrerDBMeta;
    protected final Map<LdColumnInfo, LdColumnInfo> localReferrerColumnInfoMap;
    protected final Map<LdColumnInfo, LdColumnInfo> referrerLocalColumnInfoMap;
    protected final boolean oneToOne;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdReferrerInfo(String referrerPropertyName, LdDBMeta localDBMeta, LdDBMeta referrerDBMeta
                      , Map<LdColumnInfo, LdColumnInfo> localReferrerColumnInfoMap
                      , boolean oneToOne) {
        assertObjectNotNull("referrerPropertyName", referrerPropertyName);
        assertObjectNotNull("localDBMeta", localDBMeta);
        assertObjectNotNull("referrerDBMeta", referrerDBMeta);
        assertObjectNotNull("localReferrerColumnInfoMap", localReferrerColumnInfoMap);
        this.referrerPropertyName = referrerPropertyName;
        this.localDBMeta = localDBMeta;
        this.referrerDBMeta = referrerDBMeta;
        this.localReferrerColumnInfoMap = localReferrerColumnInfoMap;
        final Set<LdColumnInfo> keySet = localReferrerColumnInfoMap.keySet();
        referrerLocalColumnInfoMap = new LinkedHashMap<LdColumnInfo, LdColumnInfo>();
        for (final Iterator<LdColumnInfo> ite = keySet.iterator(); ite.hasNext(); ) {
            final LdColumnInfo key = ite.next();
            final LdColumnInfo value = localReferrerColumnInfoMap.get(key);
            referrerLocalColumnInfoMap.put(value, key);
        }
        this.oneToOne = oneToOne;
    }
    
    // ===================================================================================
    //                                                                              Finder
    //                                                                              ======
    public LdColumnInfo findLocalByReferrer(String referrerColumnDbName) {
        final LdColumnInfo keyColumnInfo = referrerDBMeta.findColumnInfo(referrerColumnDbName);
        final LdColumnInfo resultColumnInfo = (LdColumnInfo)referrerLocalColumnInfoMap.get(keyColumnInfo);
        if (resultColumnInfo == null) {
            String msg = "Not found by referrerColumnDbName in referrerLocalColumnInfoMap:";
            msg = msg + " referrerColumnDbName=" + referrerColumnDbName + " referrerLocalColumnInfoMap=" + referrerLocalColumnInfoMap;
            throw new IllegalArgumentException(msg);
        }
        return resultColumnInfo;
    }

    public LdColumnInfo findReferrerByLocal(String localColumnDbName) {
        final LdColumnInfo keyColumnInfo = localDBMeta.findColumnInfo(localColumnDbName);
        final LdColumnInfo resultColumnInfo = (LdColumnInfo)localReferrerColumnInfoMap.get(keyColumnInfo);
        if (resultColumnInfo == null) {
            String msg = "Not found by localColumnDbName in localReferrerColumnInfoMap:";
            msg = msg + " localColumnDbName=" + localColumnDbName + " localReferrerColumnInfoMap=" + localReferrerColumnInfoMap;
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
        return initCap(this.referrerPropertyName);
    }

    // ===================================================================================
    //                                                                           Implement
    //                                                                           =========
    public String getRelationPropertyName() {
        return getReferrerPropertyName();
    }

    public LdDBMeta getTargetDBMeta() {
        return getReferrerDBMeta();
    }

    public Map<LdColumnInfo, LdColumnInfo> getLocalTargetColumnInfoMap() {
        return getLocalReferrerColumnInfoMap();
    }

    public boolean isReferrer() {
        return true;
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
        return referrerPropertyName.hashCode() + localDBMeta.hashCode() + referrerDBMeta.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof LdReferrerInfo)) {
            return false;
        }
        final LdReferrerInfo target = (LdReferrerInfo)obj;
        if (!this.referrerPropertyName.equals(target.getReferrerPropertyName())) {
            return false;
        }
        if (!this.localDBMeta.equals(target.getLocalDBMeta())) {
            return false;
        }
        if (!this.referrerDBMeta.equals(target.getReferrerDBMeta())) {
            return false;
        }
        return true;
    }

    public String toString() {
        return localDBMeta.getTableDbName() + "." + referrerPropertyName + "<-" + referrerDBMeta.getTableDbName();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getReferrerPropertyName() {
        return referrerPropertyName;
    }

    public LdDBMeta getLocalDBMeta() {
        return localDBMeta;
    }

    public LdDBMeta getReferrerDBMeta() {
        return referrerDBMeta;
    }

    public Map<LdColumnInfo, LdColumnInfo> getLocalReferrerColumnInfoMap() {
        return new LinkedHashMap<LdColumnInfo, LdColumnInfo>(localReferrerColumnInfoMap); // as snapshot
    }

    public Map<LdColumnInfo, LdColumnInfo> getReferrerLocalColumnInfoMap() {
        return new LinkedHashMap<LdColumnInfo, LdColumnInfo>(referrerLocalColumnInfoMap); // as snapshot
    }

    public boolean isOneToOne() {
        return oneToOne;
    }
}

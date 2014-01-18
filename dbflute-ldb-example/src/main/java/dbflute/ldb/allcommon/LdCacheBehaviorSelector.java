/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import dbflute.ldb.allcommon.bhv.LdBehaviorReadable;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.allcommon.util.LdTraceViewUtil;

/**
 * The implementation of behavior-selector.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class LdCacheBehaviorSelector extends LdCacheAbstractSelector implements LdBehaviorSelector {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log-instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(LdCacheBehaviorSelector.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The cache of behavior. (It's the generic hell!) */
    protected Map<Class<? extends LdBehaviorReadable>, LdBehaviorReadable> _behaviorCache
            = new ConcurrentHashMap<Class<? extends LdBehaviorReadable>, LdBehaviorReadable>();

    // ===================================================================================
    //                                                                          Initialize
    //                                                                          ==========
    /**
     * Initialize condition-bean meta data. <br />
     */
    public void initializeConditionBeanMetaData() {
        final Map<String, LdDBMeta> dbmetaMap = LdDBMetaInstanceHandler.getDBMetaMap();
        final Collection<LdDBMeta> dbmetas = dbmetaMap.values();
        long before = 0;
	    if (_log.isInfoEnabled()) {
		    before = System.currentTimeMillis();
		    _log.info("/= = = = = = = = = = = = = = = = = initializeConditionBeanMetaData()");
		}
        for (LdDBMeta dbmeta : dbmetas) {
		    final LdBehaviorReadable bhv = byName(dbmeta.getTableDbName());
            bhv.warmUpCommand();
        }
	    if (_log.isInfoEnabled()) {
		    long after = System.currentTimeMillis();
		    _log.info("Initialized Count: " + dbmetas.size());
		    _log.info("= = = = = = = = = =/ [" + LdTraceViewUtil.convertToPerformanceView(after - before) + "]");
		}
	}
	
    // ===================================================================================
    //                                                                            Selector
    //                                                                            ========
    /**
     * Select behavior.
     * @param <BEHAVIOR> The type of behavior.
     * @param behaviorType Behavior type. (NotNull)
     * @return Behavior. (NotNull)
     */
    public <BEHAVIOR extends LdBehaviorReadable> BEHAVIOR select(Class<BEHAVIOR> behaviorType) {
        if (_behaviorCache.containsKey(behaviorType)) {
            return (BEHAVIOR)_behaviorCache.get(behaviorType);
        }
        synchronized (_behaviorCache) {
            if (_behaviorCache.containsKey(behaviorType)) {
                return (BEHAVIOR)_behaviorCache.get(behaviorType);
            }
            final BEHAVIOR bhv = (BEHAVIOR)getComponent(behaviorType);
            _behaviorCache.put(behaviorType, bhv);
            return bhv;
        }
    }

    /**
     * Select behavior-readable by name.
     * @param tableFlexibleName Table flexible-name. (NotNull)
     * @return Behavior-readable. (NotNull)
     */
    public LdBehaviorReadable byName(String tableFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("tableFlexibleName", tableFlexibleName);
        final LdDBMeta dbmeta = LdDBMetaInstanceHandler.findDBMeta(tableFlexibleName);
        return select(getBehaviorType(dbmeta));
    }

    /**
     * Get behavior-type by dbmeta.
     * @param dbmeta Dbmeta. (NotNull)
     * @return Behavior-type. (NotNull)
     */
    protected Class<LdBehaviorReadable> getBehaviorType(LdDBMeta dbmeta) {
        final String behaviorTypeName = dbmeta.getBehaviorTypeName();
        if (behaviorTypeName == null) {
            String msg = "The dbmeta.getBehaviorTypeName() should not return null: dbmeta=" + dbmeta;
            throw new IllegalStateException(msg);
        }
        final Class<LdBehaviorReadable> behaviorType;
        try {
            behaviorType = (Class<LdBehaviorReadable>)Class.forName(behaviorTypeName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("The class does not exist: " + behaviorTypeName, e);
        }
        return behaviorType;
    }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.dbmeta.hierarchy;


import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.info.LdColumnInfo;

/**
 * The basic request of hierarchy.
 * 
 * @author DBFlute(AutoGenerator)
 * @param <LOCAL_ENTITY> The type of local entity.
 * @param <LOCAL_RELATION_TRACE> The type of local relation trace.
 */
@SuppressWarnings("unchecked")
public class LdHierarchyBasicRequest<LOCAL_ENTITY extends LdEntity, LOCAL_RELATION_TRACE extends LdDBMeta.RelationTrace> extends LdHierarchyRequest<LOCAL_ENTITY> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdColumnInfo _currentSourceColumnInfo;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * 
     * @param localEntityType The type of local entity. (NotNull)
     */
    public LdHierarchyBasicRequest(Class<LOCAL_ENTITY> localEntityType) {
        super(localEntityType);
    }

    // ===================================================================================
    //                                                                         Easy-to-Use
    //                                                                         ===========
    // -----------------------------------------------------
    //                                                public
    //                                                ------
    /**
     * Set up source.
     * 
     * @param sourceColumnInfo The column info of source. (NotNull)
     * @return Destination relation trace. (NotNull)
     */
    public DestinationRelationTrace<LOCAL_RELATION_TRACE> src(LdColumnInfo sourceColumnInfo) {
        this._currentSourceColumnInfo = sourceColumnInfo;
        final LdHierarchyBasicRequest<LOCAL_ENTITY, LOCAL_RELATION_TRACE> outer = this;
        return new DestinationRelationTrace<LOCAL_RELATION_TRACE>() {
            public LOCAL_RELATION_TRACE dst() {
                return outer.dst();
            }
        };
    }

    /**
     * Set up destination.
     * 
     * @return Local relation trace. (NotNull)
     */
    public LOCAL_RELATION_TRACE dst() {
        final LdDBMeta.RelationTraceFixHandler handler = new LdDBMeta.RelationTraceFixHandler() {
            public void handleFixedTrace(LdDBMeta.RelationTrace relationTrace) {
                mapping(_currentSourceColumnInfo, relationTrace);
            }
        };
        final Object target = destinationDBMeta;
        java.lang.reflect.Method method = null;
        try {
            method = target.getClass().getMethod("createRelationTrace", new Class[]{LdDBMeta.RelationTraceFixHandler.class});
        } catch (NoSuchMethodException e) {
            String msg = "Not found method: method=createRelationTrace(LdDBMeta.RelationTraceFixHandler)";
            throw new IllegalStateException(msg, e);
        }
        try {
            return (LOCAL_RELATION_TRACE)method.invoke(target, new Object[]{handler});
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw new IllegalStateException(e.getCause());
        }
    }

    public static interface DestinationRelationTrace<LOCAL_RELATION_TRACE> {
        public LOCAL_RELATION_TRACE dst();
    }
}

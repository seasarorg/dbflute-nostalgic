/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdCollectionStatus;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of COLLECTION_STATUS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionStatusDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdCollectionStatusDbm _instance = new LdCollectionStatusDbm();
    private LdCollectionStatusDbm() {}
    public static LdCollectionStatusDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "COLLECTION_STATUS"; }
    public String getTablePropertyName() { return "collectionStatus"; }
    public String getTableSqlName() { return "COLLECTION_STATUS"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnCollectionId = cci("COLLECTION_ID", null, "collectionId", Integer.class, true, null, null);
    protected LdColumnInfo _columnCollectionStatusCode = cci("COLLECTION_STATUS_CODE", null, "collectionStatusCode", String.class, false, 3, 0);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnCollectionId() { return _columnCollectionId; }
    public LdColumnInfo columnCollectionStatusCode() { return _columnCollectionStatusCode; }
    public LdColumnInfo columnRUser() { return _columnRUser; }
    public LdColumnInfo columnRModule() { return _columnRModule; }
    public LdColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public LdColumnInfo columnUUser() { return _columnUUser; }
    public LdColumnInfo columnUModule() { return _columnUModule; }
    public LdColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public LdUniqueInfo getPrimaryUniqueInfo() { return cpui(columnCollectionId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasTwoOrMorePrimaryKeys() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public LdForeignInfo foreignCollection() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnCollectionId(), LdCollectionDbm.getInstance().columnCollectionId());
        return cfi("collection", this, LdCollectionDbm.getInstance(), map, 0, true);
    }
    public LdForeignInfo foreignCollectionStatusLookup() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnCollectionStatusCode(), LdCollectionStatusLookupDbm.getInstance().columnCollectionStatusCode());
        return cfi("collectionStatusLookup", this, LdCollectionStatusLookupDbm.getInstance(), map, 1, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public CollectionStatusRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new CollectionStatusRelationTrace(relationTraceFixHandler);
    }

    public CollectionStatusRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new CollectionStatusRelationTrace(relationList, relationTraceList);
    }

    public static class CollectionStatusRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public CollectionStatusRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public CollectionStatusRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdCollectionDbm.CollectionRelationTrace foreignCollection() {
            _relationList.add(LdCollectionStatusDbm.getInstance().foreignCollection());
            return LdCollectionDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdCollectionStatusLookupDbm.CollectionStatusLookupRelationTrace foreignCollectionStatusLookup() {
            _relationList.add(LdCollectionStatusDbm.getInstance().foreignCollectionStatusLookup());
            return LdCollectionStatusLookupDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnCollectionId() { return fixTrace(_relationList, LdCollectionStatusDbm.getInstance().columnCollectionId()); }
        public RelationTrace columnCollectionStatusCode() { return fixTrace(_relationList, LdCollectionStatusDbm.getInstance().columnCollectionStatusCode()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdCollectionStatusDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdCollectionStatusDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdCollectionStatusDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdCollectionStatusDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdCollectionStatusDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdCollectionStatusDbm.getInstance().columnUTimestamp()); }
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasUpdateDate() { return true; }
    public LdColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }
    public boolean hasCommonColumn() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdCollectionStatus"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdCollectionStatusCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdCollectionStatusDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdCollectionStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdCollectionStatus> getEntityType() { return LdCollectionStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdCollectionStatus newMyEntity() { return new LdCollectionStatus(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdCollectionStatus)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdCollectionStatus)entity, columnValueMap, _epsMap);
    }

    public void acceptColumnValueMapString(LdEntity entity, String columnValueMapString) {
        MapStringUtil.acceptColumnValueMapString(columnValueMapString, entity);
    }

    // -----------------------------------------------------
    //                                               Extract
    //                                               -------
    public String extractPrimaryKeyMapString(LdEntity entity) { return MapStringUtil.extractPrimaryKeyMapString(entity); }
    public String extractPrimaryKeyMapString(LdEntity entity, String startBrace, String endBrace, String delimiter, String equal) {
        return doExtractPrimaryKeyMapString(entity, startBrace, endBrace, delimiter, equal);
    }
    public String extractColumnValueMapString(LdEntity entity) { return MapStringUtil.extractColumnValueMapString(entity); }
    public String extractColumnValueMapString(LdEntity entity, String startBrace, String endBrace, String delimiter, String equal) {
        return doExtractColumnValueMapString(entity, startBrace, endBrace, delimiter, equal);
    }

    // -----------------------------------------------------
    //                                               Convert
    //                                               -------
    public List<Object> convertToColumnValueList(LdEntity entity) { return newArrayList(convertToColumnValueMap(entity).values()); }
    public Map<String, Object> convertToColumnValueMap(LdEntity entity) { return doConvertToColumnValueMap(entity); }
    public List<String> convertToColumnStringValueList(LdEntity entity) { return newArrayList(convertToColumnStringValueMap(entity).values()); }
    public Map<String, String> convertToColumnStringValueMap(LdEntity entity) { return doConvertToColumnStringValueMap(entity); }

    // ===================================================================================
    //                                                               Entity Property Setup
    //                                                               =====================
    // It's very INTERNAL!
    protected Map<String, Eps<LdCollectionStatus>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsCollectionId(), columnCollectionId());
        setupEps(_epsMap, new EpsCollectionStatusCode(), columnCollectionStatusCode());
        setupEps(_epsMap, new EpsRUser(), columnRUser());
        setupEps(_epsMap, new EpsRModule(), columnRModule());
        setupEps(_epsMap, new EpsRTimestamp(), columnRTimestamp());
        setupEps(_epsMap, new EpsUUser(), columnUUser());
        setupEps(_epsMap, new EpsUModule(), columnUModule());
        setupEps(_epsMap, new EpsUTimestamp(), columnUTimestamp());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((LdCollectionStatus)entity, value);
    }
    
    public static class EpsCollectionId implements Eps<LdCollectionStatus> {
        public void setup(LdCollectionStatus e, Object v) { e.setCollectionId((Integer)v); }
    }
    public static class EpsCollectionStatusCode implements Eps<LdCollectionStatus> {
        public void setup(LdCollectionStatus e, Object v) { e.setCollectionStatusCode((String)v); }
    }
    public static class EpsRUser implements Eps<LdCollectionStatus> {
        public void setup(LdCollectionStatus e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdCollectionStatus> {
        public void setup(LdCollectionStatus e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdCollectionStatus> {
        public void setup(LdCollectionStatus e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdCollectionStatus> {
        public void setup(LdCollectionStatus e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdCollectionStatus> {
        public void setup(LdCollectionStatus e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdCollectionStatus> {
        public void setup(LdCollectionStatus e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}

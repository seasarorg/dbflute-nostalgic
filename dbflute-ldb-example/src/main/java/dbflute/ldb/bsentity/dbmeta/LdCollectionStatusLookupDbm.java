/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdCollectionStatusLookup;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of COLLECTION_STATUS_LOOKUP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionStatusLookupDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdCollectionStatusLookupDbm _instance = new LdCollectionStatusLookupDbm();
    private LdCollectionStatusLookupDbm() {}
    public static LdCollectionStatusLookupDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "COLLECTION_STATUS_LOOKUP"; }
    public String getTablePropertyName() { return "collectionStatusLookup"; }
    public String getTableSqlName() { return "COLLECTION_STATUS_LOOKUP"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnCollectionStatusCode = cci("COLLECTION_STATUS_CODE", null, "collectionStatusCode", String.class, true, 3, 0);
    protected LdColumnInfo _columnCollectionStatusName = cci("COLLECTION_STATUS_NAME", null, "collectionStatusName", String.class, false, 80, 0);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnCollectionStatusCode() { return _columnCollectionStatusCode; }
    public LdColumnInfo columnCollectionStatusName() { return _columnCollectionStatusName; }
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
    public LdUniqueInfo getPrimaryUniqueInfo() { return cpui(columnCollectionStatusCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasTwoOrMorePrimaryKeys() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public LdReferrerInfo referrerCollectionStatusList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnCollectionStatusCode(), LdCollectionStatusDbm.getInstance().columnCollectionStatusCode());
        return cri("collectionStatusList", this, LdCollectionStatusDbm.getInstance(), map, false);
    }

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public CollectionStatusLookupRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new CollectionStatusLookupRelationTrace(relationTraceFixHandler);
    }

    public CollectionStatusLookupRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new CollectionStatusLookupRelationTrace(relationList, relationTraceList);
    }

    public static class CollectionStatusLookupRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public CollectionStatusLookupRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public CollectionStatusLookupRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdCollectionStatusDbm.CollectionStatusRelationTrace referrerCollectionStatusList() {
            _relationList.add(LdCollectionStatusLookupDbm.getInstance().referrerCollectionStatusList());
            return LdCollectionStatusDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnCollectionStatusCode() { return fixTrace(_relationList, LdCollectionStatusLookupDbm.getInstance().columnCollectionStatusCode()); }
        public RelationTrace columnCollectionStatusName() { return fixTrace(_relationList, LdCollectionStatusLookupDbm.getInstance().columnCollectionStatusName()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdCollectionStatusLookupDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdCollectionStatusLookupDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdCollectionStatusLookupDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdCollectionStatusLookupDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdCollectionStatusLookupDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdCollectionStatusLookupDbm.getInstance().columnUTimestamp()); }
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceNextValSql() { return "Unsupported"; }
    public boolean hasUpdateDate() { return true; }
    public LdColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }
    public boolean hasCommonColumn() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdCollectionStatusLookup"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdCollectionStatusLookupCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdCollectionStatusLookupDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdCollectionStatusLookupBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdCollectionStatusLookup> getEntityType() { return LdCollectionStatusLookup.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdCollectionStatusLookup newMyEntity() { return new LdCollectionStatusLookup(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdCollectionStatusLookup)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdCollectionStatusLookup)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdCollectionStatusLookup>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsCollectionStatusCode(), columnCollectionStatusCode());
        setupEps(_epsMap, new EpsCollectionStatusName(), columnCollectionStatusName());
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
        findEps(_epsMap, propertyName).setup((LdCollectionStatusLookup)entity, value);
    }
    
    public static class EpsCollectionStatusCode implements Eps<LdCollectionStatusLookup> {
        public void setup(LdCollectionStatusLookup e, Object v) { e.setCollectionStatusCode((String)v); }
    }
    public static class EpsCollectionStatusName implements Eps<LdCollectionStatusLookup> {
        public void setup(LdCollectionStatusLookup e, Object v) { e.setCollectionStatusName((String)v); }
    }
    public static class EpsRUser implements Eps<LdCollectionStatusLookup> {
        public void setup(LdCollectionStatusLookup e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdCollectionStatusLookup> {
        public void setup(LdCollectionStatusLookup e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdCollectionStatusLookup> {
        public void setup(LdCollectionStatusLookup e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdCollectionStatusLookup> {
        public void setup(LdCollectionStatusLookup e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdCollectionStatusLookup> {
        public void setup(LdCollectionStatusLookup e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdCollectionStatusLookup> {
        public void setup(LdCollectionStatusLookup e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}

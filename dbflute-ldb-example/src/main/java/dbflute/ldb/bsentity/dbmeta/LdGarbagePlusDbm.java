/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdGarbagePlus;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of GARBAGE_PLUS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdGarbagePlusDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdGarbagePlusDbm _instance = new LdGarbagePlusDbm();
    private LdGarbagePlusDbm() {}
    public static LdGarbagePlusDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "GARBAGE_PLUS"; }
    public String getTablePropertyName() { return "garbagePlus"; }
    public String getTableSqlName() { return "GARBAGE_PLUS"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnGarbageMemo = cci("GARBAGE_MEMO", null, "garbageMemo", String.class, false, 50, 0);
    protected LdColumnInfo _columnGarbageTime = cci("GARBAGE_TIME", null, "garbageTime", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnGarbageCount = cci("GARBAGE_COUNT", null, "garbageCount", Integer.class, false, null, null);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnGarbageMemo() { return _columnGarbageMemo; }
    public LdColumnInfo columnGarbageTime() { return _columnGarbageTime; }
    public LdColumnInfo columnGarbageCount() { return _columnGarbageCount; }
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
    public LdUniqueInfo getPrimaryUniqueInfo() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
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

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public GarbagePlusRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new GarbagePlusRelationTrace(relationTraceFixHandler);
    }

    public GarbagePlusRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new GarbagePlusRelationTrace(relationList, relationTraceList);
    }

    public static class GarbagePlusRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public GarbagePlusRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public GarbagePlusRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }


        public RelationTrace columnGarbageMemo() { return fixTrace(_relationList, LdGarbagePlusDbm.getInstance().columnGarbageMemo()); }
        public RelationTrace columnGarbageTime() { return fixTrace(_relationList, LdGarbagePlusDbm.getInstance().columnGarbageTime()); }
        public RelationTrace columnGarbageCount() { return fixTrace(_relationList, LdGarbagePlusDbm.getInstance().columnGarbageCount()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdGarbagePlusDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdGarbagePlusDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdGarbagePlusDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdGarbagePlusDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdGarbagePlusDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdGarbagePlusDbm.getInstance().columnUTimestamp()); }
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasUpdateDate() { return true; }
    public LdColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdGarbagePlus"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdGarbagePlusCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdGarbagePlusDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdGarbagePlusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdGarbagePlus> getEntityType() { return LdGarbagePlus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdGarbagePlus newMyEntity() { return new LdGarbagePlus(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdGarbagePlus)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdGarbagePlus)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdGarbagePlus>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsGarbageMemo(), columnGarbageMemo());
        setupEps(_epsMap, new EpsGarbageTime(), columnGarbageTime());
        setupEps(_epsMap, new EpsGarbageCount(), columnGarbageCount());
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
        findEps(_epsMap, propertyName).setup((LdGarbagePlus)entity, value);
    }
    
    public static class EpsGarbageMemo implements Eps<LdGarbagePlus> {
        public void setup(LdGarbagePlus e, Object v) { e.setGarbageMemo((String)v); }
    }
    public static class EpsGarbageTime implements Eps<LdGarbagePlus> {
        public void setup(LdGarbagePlus e, Object v) { e.setGarbageTime((java.sql.Timestamp)v); }
    }
    public static class EpsGarbageCount implements Eps<LdGarbagePlus> {
        public void setup(LdGarbagePlus e, Object v) { e.setGarbageCount((Integer)v); }
    }
    public static class EpsRUser implements Eps<LdGarbagePlus> {
        public void setup(LdGarbagePlus e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdGarbagePlus> {
        public void setup(LdGarbagePlus e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdGarbagePlus> {
        public void setup(LdGarbagePlus e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdGarbagePlus> {
        public void setup(LdGarbagePlus e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdGarbagePlus> {
        public void setup(LdGarbagePlus e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdGarbagePlus> {
        public void setup(LdGarbagePlus e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}

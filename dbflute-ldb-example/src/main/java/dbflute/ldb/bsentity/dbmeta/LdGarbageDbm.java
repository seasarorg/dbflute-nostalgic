/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdGarbage;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of GARBAGE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdGarbageDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdGarbageDbm _instance = new LdGarbageDbm();
    private LdGarbageDbm() {}
    public static LdGarbageDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "GARBAGE"; }
    public String getTablePropertyName() { return "garbage"; }
    public String getTableSqlName() { return "GARBAGE"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnGarbageMemo = cci("GARBAGE_MEMO", null, "garbageMemo", String.class, false, 50, 0);
    protected LdColumnInfo _columnGarbageTime = cci("GARBAGE_TIME", null, "garbageTime", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnGarbageCount = cci("GARBAGE_COUNT", null, "garbageCount", Integer.class, false, null, null);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnGarbageMemo() { return _columnGarbageMemo; }
    public LdColumnInfo columnGarbageTime() { return _columnGarbageTime; }
    public LdColumnInfo columnGarbageCount() { return _columnGarbageCount; }
    public LdColumnInfo columnRUser() { return _columnRUser; }
    public LdColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public LdColumnInfo columnUUser() { return _columnUUser; }
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
    public GarbageRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new GarbageRelationTrace(relationTraceFixHandler);
    }

    public GarbageRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new GarbageRelationTrace(relationList, relationTraceList);
    }

    public static class GarbageRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public GarbageRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public GarbageRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }


        public RelationTrace columnGarbageMemo() { return fixTrace(_relationList, LdGarbageDbm.getInstance().columnGarbageMemo()); }
        public RelationTrace columnGarbageTime() { return fixTrace(_relationList, LdGarbageDbm.getInstance().columnGarbageTime()); }
        public RelationTrace columnGarbageCount() { return fixTrace(_relationList, LdGarbageDbm.getInstance().columnGarbageCount()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdGarbageDbm.getInstance().columnRUser()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdGarbageDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdGarbageDbm.getInstance().columnUUser()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdGarbageDbm.getInstance().columnUTimestamp()); }
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasUpdateDate() { return true; }
    public LdColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdGarbage"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdGarbageCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdGarbageDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdGarbageBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdGarbage> getEntityType() { return LdGarbage.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdGarbage newMyEntity() { return new LdGarbage(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdGarbage)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdGarbage)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdGarbage>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsGarbageMemo(), columnGarbageMemo());
        setupEps(_epsMap, new EpsGarbageTime(), columnGarbageTime());
        setupEps(_epsMap, new EpsGarbageCount(), columnGarbageCount());
        setupEps(_epsMap, new EpsRUser(), columnRUser());
        setupEps(_epsMap, new EpsRTimestamp(), columnRTimestamp());
        setupEps(_epsMap, new EpsUUser(), columnUUser());
        setupEps(_epsMap, new EpsUTimestamp(), columnUTimestamp());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((LdGarbage)entity, value);
    }
    
    public static class EpsGarbageMemo implements Eps<LdGarbage> {
        public void setup(LdGarbage e, Object v) { e.setGarbageMemo((String)v); }
    }
    public static class EpsGarbageTime implements Eps<LdGarbage> {
        public void setup(LdGarbage e, Object v) { e.setGarbageTime((java.sql.Timestamp)v); }
    }
    public static class EpsGarbageCount implements Eps<LdGarbage> {
        public void setup(LdGarbage e, Object v) { e.setGarbageCount((Integer)v); }
    }
    public static class EpsRUser implements Eps<LdGarbage> {
        public void setup(LdGarbage e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdGarbage> {
        public void setup(LdGarbage e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdGarbage> {
        public void setup(LdGarbage e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdGarbage> {
        public void setup(LdGarbage e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdNextLibrary;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of NEXT_LIBRARY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdNextLibraryDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdNextLibraryDbm _instance = new LdNextLibraryDbm();
    private LdNextLibraryDbm() {}
    public static LdNextLibraryDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "NEXT_LIBRARY"; }
    public String getTablePropertyName() { return "nextLibrary"; }
    public String getTableSqlName() { return "NEXT_LIBRARY"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnLibraryId = cci("LIBRARY_ID", null, "libraryId", Integer.class, true, null, null);
    protected LdColumnInfo _columnNextLibraryId = cci("NEXT_LIBRARY_ID", null, "nextLibraryId", Integer.class, true, null, null);
    protected LdColumnInfo _columnDistanceKm = cci("DISTANCE_KM", null, "distanceKm", java.math.BigDecimal.class, false, 4, 2);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnLibraryId() { return _columnLibraryId; }
    public LdColumnInfo columnNextLibraryId() { return _columnNextLibraryId; }
    public LdColumnInfo columnDistanceKm() { return _columnDistanceKm; }
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
        List<LdColumnInfo> ls = newArrayList();
        ls.add(columnLibraryId());
        ls.add(columnNextLibraryId());
        return cpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasTwoOrMorePrimaryKeys() { return true; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public LdForeignInfo foreignLibraryByNextId() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnNextLibraryId(), LdLibraryDbm.getInstance().columnLibraryId());
        return cfi("libraryByNextId", this, LdLibraryDbm.getInstance(), map, 0, false);
    }
    public LdForeignInfo foreignLibraryByBaseId() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLibraryId(), LdLibraryDbm.getInstance().columnLibraryId());
        return cfi("libraryByBaseId", this, LdLibraryDbm.getInstance(), map, 1, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public NextLibraryRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new NextLibraryRelationTrace(relationTraceFixHandler);
    }

    public NextLibraryRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new NextLibraryRelationTrace(relationList, relationTraceList);
    }

    public static class NextLibraryRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public NextLibraryRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public NextLibraryRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdLibraryDbm.LibraryRelationTrace foreignLibraryByNextId() {
            _relationList.add(LdNextLibraryDbm.getInstance().foreignLibraryByNextId());
            return LdLibraryDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdLibraryDbm.LibraryRelationTrace foreignLibraryByBaseId() {
            _relationList.add(LdNextLibraryDbm.getInstance().foreignLibraryByBaseId());
            return LdLibraryDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnLibraryId() { return fixTrace(_relationList, LdNextLibraryDbm.getInstance().columnLibraryId()); }
        public RelationTrace columnNextLibraryId() { return fixTrace(_relationList, LdNextLibraryDbm.getInstance().columnNextLibraryId()); }
        public RelationTrace columnDistanceKm() { return fixTrace(_relationList, LdNextLibraryDbm.getInstance().columnDistanceKm()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdNextLibraryDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdNextLibraryDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdNextLibraryDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdNextLibraryDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdNextLibraryDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdNextLibraryDbm.getInstance().columnUTimestamp()); }
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
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdNextLibrary"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdNextLibraryCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdNextLibraryDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdNextLibraryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdNextLibrary> getEntityType() { return LdNextLibrary.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdNextLibrary newMyEntity() { return new LdNextLibrary(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdNextLibrary)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdNextLibrary)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdNextLibrary>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsLibraryId(), columnLibraryId());
        setupEps(_epsMap, new EpsNextLibraryId(), columnNextLibraryId());
        setupEps(_epsMap, new EpsDistanceKm(), columnDistanceKm());
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
        findEps(_epsMap, propertyName).setup((LdNextLibrary)entity, value);
    }
    
    public static class EpsLibraryId implements Eps<LdNextLibrary> {
        public void setup(LdNextLibrary e, Object v) { e.setLibraryId((Integer)v); }
    }
    public static class EpsNextLibraryId implements Eps<LdNextLibrary> {
        public void setup(LdNextLibrary e, Object v) { e.setNextLibraryId((Integer)v); }
    }
    public static class EpsDistanceKm implements Eps<LdNextLibrary> {
        public void setup(LdNextLibrary e, Object v) { e.setDistanceKm((java.math.BigDecimal)v); }
    }
    public static class EpsRUser implements Eps<LdNextLibrary> {
        public void setup(LdNextLibrary e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdNextLibrary> {
        public void setup(LdNextLibrary e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdNextLibrary> {
        public void setup(LdNextLibrary e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdNextLibrary> {
        public void setup(LdNextLibrary e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdNextLibrary> {
        public void setup(LdNextLibrary e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdNextLibrary> {
        public void setup(LdNextLibrary e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}

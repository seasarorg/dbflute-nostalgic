/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdLibraryTypeLookup;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of LIBRARY_TYPE_LOOKUP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdLibraryTypeLookupDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdLibraryTypeLookupDbm _instance = new LdLibraryTypeLookupDbm();
    private LdLibraryTypeLookupDbm() {}
    public static LdLibraryTypeLookupDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "LIBRARY_TYPE_LOOKUP"; }
    public String getTablePropertyName() { return "libraryTypeLookup"; }
    public String getTableSqlName() { return "LIBRARY_TYPE_LOOKUP"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnLibraryTypeCode = cci("LIBRARY_TYPE_CODE", null, "libraryTypeCode", String.class, true, 3, 0);
    protected LdColumnInfo _columnLibraryTypeName = cci("LIBRARY_TYPE_NAME", null, "libraryTypeName", String.class, false, 80, 0);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnLibraryTypeCode() { return _columnLibraryTypeCode; }
    public LdColumnInfo columnLibraryTypeName() { return _columnLibraryTypeName; }
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
    public LdUniqueInfo getPrimaryUniqueInfo() { return cpui(columnLibraryTypeCode()); }
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
    public LdReferrerInfo referrerLibraryList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLibraryTypeCode(), LdLibraryDbm.getInstance().columnLibraryTypeCode());
        return cri("libraryList", this, LdLibraryDbm.getInstance(), map, false);
    }

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public LibraryTypeLookupRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new LibraryTypeLookupRelationTrace(relationTraceFixHandler);
    }

    public LibraryTypeLookupRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new LibraryTypeLookupRelationTrace(relationList, relationTraceList);
    }

    public static class LibraryTypeLookupRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public LibraryTypeLookupRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public LibraryTypeLookupRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdLibraryDbm.LibraryRelationTrace referrerLibraryList() {
            _relationList.add(LdLibraryTypeLookupDbm.getInstance().referrerLibraryList());
            return LdLibraryDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnLibraryTypeCode() { return fixTrace(_relationList, LdLibraryTypeLookupDbm.getInstance().columnLibraryTypeCode()); }
        public RelationTrace columnLibraryTypeName() { return fixTrace(_relationList, LdLibraryTypeLookupDbm.getInstance().columnLibraryTypeName()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdLibraryTypeLookupDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdLibraryTypeLookupDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdLibraryTypeLookupDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdLibraryTypeLookupDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdLibraryTypeLookupDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdLibraryTypeLookupDbm.getInstance().columnUTimestamp()); }
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
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdLibraryTypeLookup"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdLibraryTypeLookupCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdLibraryTypeLookupDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdLibraryTypeLookupBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdLibraryTypeLookup> getEntityType() { return LdLibraryTypeLookup.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdLibraryTypeLookup newMyEntity() { return new LdLibraryTypeLookup(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdLibraryTypeLookup)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdLibraryTypeLookup)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdLibraryTypeLookup>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsLibraryTypeCode(), columnLibraryTypeCode());
        setupEps(_epsMap, new EpsLibraryTypeName(), columnLibraryTypeName());
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
        findEps(_epsMap, propertyName).setup((LdLibraryTypeLookup)entity, value);
    }
    
    public static class EpsLibraryTypeCode implements Eps<LdLibraryTypeLookup> {
        public void setup(LdLibraryTypeLookup e, Object v) { e.setLibraryTypeCode((String)v); }
    }
    public static class EpsLibraryTypeName implements Eps<LdLibraryTypeLookup> {
        public void setup(LdLibraryTypeLookup e, Object v) { e.setLibraryTypeName((String)v); }
    }
    public static class EpsRUser implements Eps<LdLibraryTypeLookup> {
        public void setup(LdLibraryTypeLookup e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdLibraryTypeLookup> {
        public void setup(LdLibraryTypeLookup e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdLibraryTypeLookup> {
        public void setup(LdLibraryTypeLookup e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdLibraryTypeLookup> {
        public void setup(LdLibraryTypeLookup e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdLibraryTypeLookup> {
        public void setup(LdLibraryTypeLookup e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdLibraryTypeLookup> {
        public void setup(LdLibraryTypeLookup e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}

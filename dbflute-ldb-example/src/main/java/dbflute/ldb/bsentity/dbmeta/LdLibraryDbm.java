/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdLibrary;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of LIBRARY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdLibraryDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdLibraryDbm _instance = new LdLibraryDbm();
    private LdLibraryDbm() {}
    public static LdLibraryDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "LIBRARY"; }
    public String getTablePropertyName() { return "library"; }
    public String getTableSqlName() { return "LIBRARY"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnLibraryId = cci("LIBRARY_ID", null, "libraryId", Integer.class, true, null, null);
    protected LdColumnInfo _columnLibraryName = cci("LIBRARY_NAME", null, "libraryName", String.class, false, 80, 0);
    protected LdColumnInfo _columnLibraryTypeCode = cci("LIBRARY_TYPE_CODE", null, "libraryTypeCode", String.class, false, 3, 0);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnLibraryId() { return _columnLibraryId; }
    public LdColumnInfo columnLibraryName() { return _columnLibraryName; }
    public LdColumnInfo columnLibraryTypeCode() { return _columnLibraryTypeCode; }
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
    public LdUniqueInfo getPrimaryUniqueInfo() { return cpui(columnLibraryId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasTwoOrMorePrimaryKeys() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public LdForeignInfo foreignLibraryTypeLookup() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLibraryTypeCode(), LdLibraryTypeLookupDbm.getInstance().columnLibraryTypeCode());
        return cfi("libraryTypeLookup", this, LdLibraryTypeLookupDbm.getInstance(), map, 0, false);
    }
    public LdForeignInfo foreignNextLibraryAsNext() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLibraryId(), LdNextLibraryDbm.getInstance().columnLibraryId());
        return cfi("nextLibraryAsNext", this, LdNextLibraryDbm.getInstance(), map, 1, true);
    }
    public LdForeignInfo foreignLibraryUserAsUser() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLibraryId(), LdLibraryUserDbm.getInstance().columnLibraryId());
        return cfi("libraryUserAsUser", this, LdLibraryUserDbm.getInstance(), map, 2, true);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public LdReferrerInfo referrerCollectionList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLibraryId(), LdCollectionDbm.getInstance().columnLibraryId());
        return cri("collectionList", this, LdCollectionDbm.getInstance(), map, false);
    }
    public LdReferrerInfo referrerLibraryUserList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLibraryId(), LdLibraryUserDbm.getInstance().columnLibraryId());
        return cri("libraryUserList", this, LdLibraryUserDbm.getInstance(), map, false);
    }
    public LdReferrerInfo referrerNextLibraryByNextIdList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLibraryId(), LdNextLibraryDbm.getInstance().columnNextLibraryId());
        return cri("nextLibraryByNextIdList", this, LdNextLibraryDbm.getInstance(), map, false);
    }
    public LdReferrerInfo referrerNextLibraryByBaseIdList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLibraryId(), LdNextLibraryDbm.getInstance().columnLibraryId());
        return cri("nextLibraryByBaseIdList", this, LdNextLibraryDbm.getInstance(), map, false);
    }

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public LibraryRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new LibraryRelationTrace(relationTraceFixHandler);
    }

    public LibraryRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new LibraryRelationTrace(relationList, relationTraceList);
    }

    public static class LibraryRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public LibraryRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public LibraryRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdLibraryTypeLookupDbm.LibraryTypeLookupRelationTrace foreignLibraryTypeLookup() {
            _relationList.add(LdLibraryDbm.getInstance().foreignLibraryTypeLookup());
            return LdLibraryTypeLookupDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdNextLibraryDbm.NextLibraryRelationTrace foreignNextLibraryAsNext() {
            _relationList.add(LdLibraryDbm.getInstance().foreignNextLibraryAsNext());
            return LdNextLibraryDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdLibraryUserDbm.LibraryUserRelationTrace foreignLibraryUserAsUser() {
            _relationList.add(LdLibraryDbm.getInstance().foreignLibraryUserAsUser());
            return LdLibraryUserDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdCollectionDbm.CollectionRelationTrace referrerCollectionList() {
            _relationList.add(LdLibraryDbm.getInstance().referrerCollectionList());
            return LdCollectionDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdLibraryUserDbm.LibraryUserRelationTrace referrerLibraryUserList() {
            _relationList.add(LdLibraryDbm.getInstance().referrerLibraryUserList());
            return LdLibraryUserDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdNextLibraryDbm.NextLibraryRelationTrace referrerNextLibraryByNextIdList() {
            _relationList.add(LdLibraryDbm.getInstance().referrerNextLibraryByNextIdList());
            return LdNextLibraryDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdNextLibraryDbm.NextLibraryRelationTrace referrerNextLibraryByBaseIdList() {
            _relationList.add(LdLibraryDbm.getInstance().referrerNextLibraryByBaseIdList());
            return LdNextLibraryDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnLibraryId() { return fixTrace(_relationList, LdLibraryDbm.getInstance().columnLibraryId()); }
        public RelationTrace columnLibraryName() { return fixTrace(_relationList, LdLibraryDbm.getInstance().columnLibraryName()); }
        public RelationTrace columnLibraryTypeCode() { return fixTrace(_relationList, LdLibraryDbm.getInstance().columnLibraryTypeCode()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdLibraryDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdLibraryDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdLibraryDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdLibraryDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdLibraryDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdLibraryDbm.getInstance().columnUTimestamp()); }
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasUpdateDate() { return true; }
    public LdColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }
    public boolean hasCommonColumn() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdLibrary"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdLibraryCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdLibraryDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdLibraryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdLibrary> getEntityType() { return LdLibrary.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdLibrary newMyEntity() { return new LdLibrary(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdLibrary)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdLibrary)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdLibrary>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsLibraryId(), columnLibraryId());
        setupEps(_epsMap, new EpsLibraryName(), columnLibraryName());
        setupEps(_epsMap, new EpsLibraryTypeCode(), columnLibraryTypeCode());
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
        findEps(_epsMap, propertyName).setup((LdLibrary)entity, value);
    }
    
    public static class EpsLibraryId implements Eps<LdLibrary> {
        public void setup(LdLibrary e, Object v) { e.setLibraryId((Integer)v); }
    }
    public static class EpsLibraryName implements Eps<LdLibrary> {
        public void setup(LdLibrary e, Object v) { e.setLibraryName((String)v); }
    }
    public static class EpsLibraryTypeCode implements Eps<LdLibrary> {
        public void setup(LdLibrary e, Object v) { e.setLibraryTypeCode((String)v); }
    }
    public static class EpsRUser implements Eps<LdLibrary> {
        public void setup(LdLibrary e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdLibrary> {
        public void setup(LdLibrary e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdLibrary> {
        public void setup(LdLibrary e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdLibrary> {
        public void setup(LdLibrary e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdLibrary> {
        public void setup(LdLibrary e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdLibrary> {
        public void setup(LdLibrary e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}

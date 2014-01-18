/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdCollection;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of COLLECTION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdCollectionDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdCollectionDbm _instance = new LdCollectionDbm();
    private LdCollectionDbm() {}
    public static LdCollectionDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "COLLECTION"; }
    public String getTablePropertyName() { return "collection"; }
    public String getTableSqlName() { return "COLLECTION"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnCollectionId = cci("COLLECTION_ID", null, "collectionId", Integer.class, true, null, null);
    protected LdColumnInfo _columnLibraryId = cci("LIBRARY_ID", null, "libraryId", Integer.class, false, null, null);
    protected LdColumnInfo _columnBookId = cci("BOOK_ID", null, "bookId", Integer.class, false, null, null);
    protected LdColumnInfo _columnArrivalDate = cci("ARRIVAL_DATE", null, "arrivalDate", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnCollectionId() { return _columnCollectionId; }
    public LdColumnInfo columnLibraryId() { return _columnLibraryId; }
    public LdColumnInfo columnBookId() { return _columnBookId; }
    public LdColumnInfo columnArrivalDate() { return _columnArrivalDate; }
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
    public LdForeignInfo foreignBook() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnBookId(), LdBookDbm.getInstance().columnBookId());
        return cfi("book", this, LdBookDbm.getInstance(), map, 0, false);
    }
    public LdForeignInfo foreignLibrary() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLibraryId(), LdLibraryDbm.getInstance().columnLibraryId());
        return cfi("library", this, LdLibraryDbm.getInstance(), map, 1, false);
    }
    public LdForeignInfo foreignCollectionStatusAsOne() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnCollectionId(), LdCollectionStatusDbm.getInstance().columnCollectionId());
        return cfi("collectionStatusAsOne", this, LdCollectionStatusDbm.getInstance(), map, 2, true);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public LdReferrerInfo referrerLendingCollectionList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnCollectionId(), LdLendingCollectionDbm.getInstance().columnCollectionId());
        return cri("lendingCollectionList", this, LdLendingCollectionDbm.getInstance(), map, false);
    }

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public CollectionRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new CollectionRelationTrace(relationTraceFixHandler);
    }

    public CollectionRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new CollectionRelationTrace(relationList, relationTraceList);
    }

    public static class CollectionRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public CollectionRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public CollectionRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdBookDbm.BookRelationTrace foreignBook() {
            _relationList.add(LdCollectionDbm.getInstance().foreignBook());
            return LdBookDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdLibraryDbm.LibraryRelationTrace foreignLibrary() {
            _relationList.add(LdCollectionDbm.getInstance().foreignLibrary());
            return LdLibraryDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdCollectionStatusDbm.CollectionStatusRelationTrace foreignCollectionStatusAsOne() {
            _relationList.add(LdCollectionDbm.getInstance().foreignCollectionStatusAsOne());
            return LdCollectionStatusDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdLendingCollectionDbm.LendingCollectionRelationTrace referrerLendingCollectionList() {
            _relationList.add(LdCollectionDbm.getInstance().referrerLendingCollectionList());
            return LdLendingCollectionDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnCollectionId() { return fixTrace(_relationList, LdCollectionDbm.getInstance().columnCollectionId()); }
        public RelationTrace columnLibraryId() { return fixTrace(_relationList, LdCollectionDbm.getInstance().columnLibraryId()); }
        public RelationTrace columnBookId() { return fixTrace(_relationList, LdCollectionDbm.getInstance().columnBookId()); }
        public RelationTrace columnArrivalDate() { return fixTrace(_relationList, LdCollectionDbm.getInstance().columnArrivalDate()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdCollectionDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdCollectionDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdCollectionDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdCollectionDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdCollectionDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdCollectionDbm.getInstance().columnUTimestamp()); }
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
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdCollection"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdCollectionCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdCollectionDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdCollectionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdCollection> getEntityType() { return LdCollection.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdCollection newMyEntity() { return new LdCollection(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdCollection)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdCollection)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdCollection>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsCollectionId(), columnCollectionId());
        setupEps(_epsMap, new EpsLibraryId(), columnLibraryId());
        setupEps(_epsMap, new EpsBookId(), columnBookId());
        setupEps(_epsMap, new EpsArrivalDate(), columnArrivalDate());
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
        findEps(_epsMap, propertyName).setup((LdCollection)entity, value);
    }
    
    public static class EpsCollectionId implements Eps<LdCollection> {
        public void setup(LdCollection e, Object v) { e.setCollectionId((Integer)v); }
    }
    public static class EpsLibraryId implements Eps<LdCollection> {
        public void setup(LdCollection e, Object v) { e.setLibraryId((Integer)v); }
    }
    public static class EpsBookId implements Eps<LdCollection> {
        public void setup(LdCollection e, Object v) { e.setBookId((Integer)v); }
    }
    public static class EpsArrivalDate implements Eps<LdCollection> {
        public void setup(LdCollection e, Object v) { e.setArrivalDate((java.sql.Timestamp)v); }
    }
    public static class EpsRUser implements Eps<LdCollection> {
        public void setup(LdCollection e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdCollection> {
        public void setup(LdCollection e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdCollection> {
        public void setup(LdCollection e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdCollection> {
        public void setup(LdCollection e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdCollection> {
        public void setup(LdCollection e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdCollection> {
        public void setup(LdCollection e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}

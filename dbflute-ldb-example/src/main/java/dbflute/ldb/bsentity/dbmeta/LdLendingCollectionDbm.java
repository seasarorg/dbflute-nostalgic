/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdLendingCollection;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of LENDING_COLLECTION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdLendingCollectionDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdLendingCollectionDbm _instance = new LdLendingCollectionDbm();
    private LdLendingCollectionDbm() {}
    public static LdLendingCollectionDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "LENDING_COLLECTION"; }
    public String getTablePropertyName() { return "lendingCollection"; }
    public String getTableSqlName() { return "LENDING_COLLECTION"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnLibraryId = cci("LIBRARY_ID", null, "libraryId", Integer.class, true, null, null);
    protected LdColumnInfo _columnLbUserId = cci("LB_USER_ID", null, "lbUserId", Integer.class, true, null, null);
    protected LdColumnInfo _columnLendingDate = cci("LENDING_DATE", null, "lendingDate", java.sql.Timestamp.class, true, null, null);
    protected LdColumnInfo _columnCollectionId = cci("COLLECTION_ID", null, "collectionId", Integer.class, true, null, null);
    protected LdColumnInfo _columnReturnLimitDate = cci("RETURN_LIMIT_DATE", null, "returnLimitDate", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnLibraryId() { return _columnLibraryId; }
    public LdColumnInfo columnLbUserId() { return _columnLbUserId; }
    public LdColumnInfo columnLendingDate() { return _columnLendingDate; }
    public LdColumnInfo columnCollectionId() { return _columnCollectionId; }
    public LdColumnInfo columnReturnLimitDate() { return _columnReturnLimitDate; }
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
        ls.add(columnLbUserId());
        ls.add(columnLendingDate());
        ls.add(columnCollectionId());
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
    public LdForeignInfo foreignCollection() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnCollectionId(), LdCollectionDbm.getInstance().columnCollectionId());
        return cfi("collection", this, LdCollectionDbm.getInstance(), map, 0, false);
    }
    public LdForeignInfo foreignLending() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap();
        map.put(columnLibraryId(), LdLendingDbm.getInstance().columnLibraryId());
        map.put(columnLbUserId(), LdLendingDbm.getInstance().columnLbUserId());
        map.put(columnLendingDate(), LdLendingDbm.getInstance().columnLendingDate());
        return cfi("lending", this, LdLendingDbm.getInstance(), map, 1, false);
    }
    public LdForeignInfo foreignLibraryUser() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap();
        map.put(columnLibraryId(), LdLibraryUserDbm.getInstance().columnLibraryId());
        map.put(columnLbUserId(), LdLibraryUserDbm.getInstance().columnLbUserId());
        return cfi("libraryUser", this, LdLibraryUserDbm.getInstance(), map, 2, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public LendingCollectionRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new LendingCollectionRelationTrace(relationTraceFixHandler);
    }

    public LendingCollectionRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new LendingCollectionRelationTrace(relationList, relationTraceList);
    }

    public static class LendingCollectionRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public LendingCollectionRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public LendingCollectionRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdCollectionDbm.CollectionRelationTrace foreignCollection() {
            _relationList.add(LdLendingCollectionDbm.getInstance().foreignCollection());
            return LdCollectionDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdLendingDbm.LendingRelationTrace foreignLending() {
            _relationList.add(LdLendingCollectionDbm.getInstance().foreignLending());
            return LdLendingDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdLibraryUserDbm.LibraryUserRelationTrace foreignLibraryUser() {
            _relationList.add(LdLendingCollectionDbm.getInstance().foreignLibraryUser());
            return LdLibraryUserDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnLibraryId() { return fixTrace(_relationList, LdLendingCollectionDbm.getInstance().columnLibraryId()); }
        public RelationTrace columnLbUserId() { return fixTrace(_relationList, LdLendingCollectionDbm.getInstance().columnLbUserId()); }
        public RelationTrace columnLendingDate() { return fixTrace(_relationList, LdLendingCollectionDbm.getInstance().columnLendingDate()); }
        public RelationTrace columnCollectionId() { return fixTrace(_relationList, LdLendingCollectionDbm.getInstance().columnCollectionId()); }
        public RelationTrace columnReturnLimitDate() { return fixTrace(_relationList, LdLendingCollectionDbm.getInstance().columnReturnLimitDate()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdLendingCollectionDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdLendingCollectionDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdLendingCollectionDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdLendingCollectionDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdLendingCollectionDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdLendingCollectionDbm.getInstance().columnUTimestamp()); }
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
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdLendingCollection"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdLendingCollectionCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdLendingCollectionDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdLendingCollectionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdLendingCollection> getEntityType() { return LdLendingCollection.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdLendingCollection newMyEntity() { return new LdLendingCollection(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdLendingCollection)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdLendingCollection)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdLendingCollection>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsLibraryId(), columnLibraryId());
        setupEps(_epsMap, new EpsLbUserId(), columnLbUserId());
        setupEps(_epsMap, new EpsLendingDate(), columnLendingDate());
        setupEps(_epsMap, new EpsCollectionId(), columnCollectionId());
        setupEps(_epsMap, new EpsReturnLimitDate(), columnReturnLimitDate());
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
        findEps(_epsMap, propertyName).setup((LdLendingCollection)entity, value);
    }
    
    public static class EpsLibraryId implements Eps<LdLendingCollection> {
        public void setup(LdLendingCollection e, Object v) { e.setLibraryId((Integer)v); }
    }
    public static class EpsLbUserId implements Eps<LdLendingCollection> {
        public void setup(LdLendingCollection e, Object v) { e.setLbUserId((Integer)v); }
    }
    public static class EpsLendingDate implements Eps<LdLendingCollection> {
        public void setup(LdLendingCollection e, Object v) { e.setLendingDate((java.sql.Timestamp)v); }
    }
    public static class EpsCollectionId implements Eps<LdLendingCollection> {
        public void setup(LdLendingCollection e, Object v) { e.setCollectionId((Integer)v); }
    }
    public static class EpsReturnLimitDate implements Eps<LdLendingCollection> {
        public void setup(LdLendingCollection e, Object v) { e.setReturnLimitDate((java.sql.Timestamp)v); }
    }
    public static class EpsRUser implements Eps<LdLendingCollection> {
        public void setup(LdLendingCollection e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdLendingCollection> {
        public void setup(LdLendingCollection e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdLendingCollection> {
        public void setup(LdLendingCollection e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdLendingCollection> {
        public void setup(LdLendingCollection e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdLendingCollection> {
        public void setup(LdLendingCollection e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdLendingCollection> {
        public void setup(LdLendingCollection e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}

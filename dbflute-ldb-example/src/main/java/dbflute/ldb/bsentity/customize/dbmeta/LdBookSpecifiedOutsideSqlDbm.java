/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.customize.LdBookSpecifiedOutsideSql;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of BookSpecifiedOutsideSql. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdBookSpecifiedOutsideSqlDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdBookSpecifiedOutsideSqlDbm _instance = new LdBookSpecifiedOutsideSqlDbm();
    private LdBookSpecifiedOutsideSqlDbm() {}
    public static LdBookSpecifiedOutsideSqlDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "BookSpecifiedOutsideSql"; }
    public String getTablePropertyName() { return "bookSpecifiedOutsideSql"; }
    public String getTableSqlName() { return "BookSpecifiedOutsideSql"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnBookId = cci("BOOK_ID", null, "bookId", Integer.class, true, 10, 0);
    protected LdColumnInfo _columnBookName = cci("BOOK_NAME", null, "bookName", String.class, false, 80, 0);
    protected LdColumnInfo _columnCollectionCount = cci("COLLECTION_COUNT", null, "collectionCount", Integer.class, false, 10, 0);
    protected LdColumnInfo _columnOutOfUserSelectYn = cci("OUT_OF_USER_SELECT_YN", null, "outOfUserSelectYn", String.class, false, 1, 0);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, 26, 6);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, 26, 6, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnBookId() { return _columnBookId; }
    public LdColumnInfo columnBookName() { return _columnBookName; }
    public LdColumnInfo columnCollectionCount() { return _columnCollectionCount; }
    public LdColumnInfo columnOutOfUserSelectYn() { return _columnOutOfUserSelectYn; }
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
    public LdUniqueInfo getPrimaryUniqueInfo() { return cpui(columnBookId()); }
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

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public BookSpecifiedOutsideSqlRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new BookSpecifiedOutsideSqlRelationTrace(relationTraceFixHandler);
    }

    public BookSpecifiedOutsideSqlRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new BookSpecifiedOutsideSqlRelationTrace(relationList, relationTraceList);
    }

    public static class BookSpecifiedOutsideSqlRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public BookSpecifiedOutsideSqlRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public BookSpecifiedOutsideSqlRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }


        public RelationTrace columnBookId() { return fixTrace(_relationList, LdBookSpecifiedOutsideSqlDbm.getInstance().columnBookId()); }
        public RelationTrace columnBookName() { return fixTrace(_relationList, LdBookSpecifiedOutsideSqlDbm.getInstance().columnBookName()); }
        public RelationTrace columnCollectionCount() { return fixTrace(_relationList, LdBookSpecifiedOutsideSqlDbm.getInstance().columnCollectionCount()); }
        public RelationTrace columnOutOfUserSelectYn() { return fixTrace(_relationList, LdBookSpecifiedOutsideSqlDbm.getInstance().columnOutOfUserSelectYn()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdBookSpecifiedOutsideSqlDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdBookSpecifiedOutsideSqlDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdBookSpecifiedOutsideSqlDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdBookSpecifiedOutsideSqlDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdBookSpecifiedOutsideSqlDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdBookSpecifiedOutsideSqlDbm.getInstance().columnUTimestamp()); }
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
    public String getEntityTypeName() { return "dbflute.ldb.exentity.customize.LdBookSpecifiedOutsideSql"; }
    public String getConditionBeanTypeName() { return null; }
    public String getDaoTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdBookSpecifiedOutsideSql> getEntityType() { return LdBookSpecifiedOutsideSql.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdBookSpecifiedOutsideSql newMyEntity() { return new LdBookSpecifiedOutsideSql(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdBookSpecifiedOutsideSql)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdBookSpecifiedOutsideSql)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdBookSpecifiedOutsideSql>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsBookId(), columnBookId());
        setupEps(_epsMap, new EpsBookName(), columnBookName());
        setupEps(_epsMap, new EpsCollectionCount(), columnCollectionCount());
        setupEps(_epsMap, new EpsOutOfUserSelectYn(), columnOutOfUserSelectYn());
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
        findEps(_epsMap, propertyName).setup((LdBookSpecifiedOutsideSql)entity, value);
    }
    
    public static class EpsBookId implements Eps<LdBookSpecifiedOutsideSql> {
        public void setup(LdBookSpecifiedOutsideSql e, Object v) { e.setBookId((Integer)v); }
    }
    public static class EpsBookName implements Eps<LdBookSpecifiedOutsideSql> {
        public void setup(LdBookSpecifiedOutsideSql e, Object v) { e.setBookName((String)v); }
    }
    public static class EpsCollectionCount implements Eps<LdBookSpecifiedOutsideSql> {
        public void setup(LdBookSpecifiedOutsideSql e, Object v) { e.setCollectionCount((Integer)v); }
    }
    public static class EpsOutOfUserSelectYn implements Eps<LdBookSpecifiedOutsideSql> {
        public void setup(LdBookSpecifiedOutsideSql e, Object v) { e.setOutOfUserSelectYn((String)v); }
    }
    public static class EpsRUser implements Eps<LdBookSpecifiedOutsideSql> {
        public void setup(LdBookSpecifiedOutsideSql e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdBookSpecifiedOutsideSql> {
        public void setup(LdBookSpecifiedOutsideSql e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdBookSpecifiedOutsideSql> {
        public void setup(LdBookSpecifiedOutsideSql e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdBookSpecifiedOutsideSql> {
        public void setup(LdBookSpecifiedOutsideSql e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdBookSpecifiedOutsideSql> {
        public void setup(LdBookSpecifiedOutsideSql e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdBookSpecifiedOutsideSql> {
        public void setup(LdBookSpecifiedOutsideSql e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}

/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.customize.LdBookContainsDoubleByte;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of BookContainsDoubleByte. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdBookContainsDoubleByteDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdBookContainsDoubleByteDbm _instance = new LdBookContainsDoubleByteDbm();
    private LdBookContainsDoubleByteDbm() {}
    public static LdBookContainsDoubleByteDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "BookContainsDoubleByte"; }
    public String getTablePropertyName() { return "bookContainsDoubleByte"; }
    public String getTableSqlName() { return "BookContainsDoubleByte"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnBookId = cci("BOOK_ID", null, "bookId", Integer.class, false, 10, 0);
    protected LdColumnInfo _columnBookNameWithSpace = cci("BOOK_NAME_WITH_SPACE", null, "bookNameWithSpace", String.class, false, 81, 0);
    protected LdColumnInfo _columnCollectionCount = cci("COLLECTION_COUNT", null, "collectionCount", Integer.class, false, 10, 0);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, 26, 6);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, 26, 6, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnBookId() { return _columnBookId; }
    public LdColumnInfo columnBookNameWithSpace() { return _columnBookNameWithSpace; }
    public LdColumnInfo columnCollectionCount() { return _columnCollectionCount; }
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
    public BookContainsDoubleByteRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new BookContainsDoubleByteRelationTrace(relationTraceFixHandler);
    }

    public BookContainsDoubleByteRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new BookContainsDoubleByteRelationTrace(relationList, relationTraceList);
    }

    public static class BookContainsDoubleByteRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public BookContainsDoubleByteRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public BookContainsDoubleByteRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }


        public RelationTrace columnBookId() { return fixTrace(_relationList, LdBookContainsDoubleByteDbm.getInstance().columnBookId()); }
        public RelationTrace columnBookNameWithSpace() { return fixTrace(_relationList, LdBookContainsDoubleByteDbm.getInstance().columnBookNameWithSpace()); }
        public RelationTrace columnCollectionCount() { return fixTrace(_relationList, LdBookContainsDoubleByteDbm.getInstance().columnCollectionCount()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdBookContainsDoubleByteDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdBookContainsDoubleByteDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdBookContainsDoubleByteDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdBookContainsDoubleByteDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdBookContainsDoubleByteDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdBookContainsDoubleByteDbm.getInstance().columnUTimestamp()); }
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasUpdateDate() { return true; }
    public LdColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "dbflute.ldb.exentity.customize.LdBookContainsDoubleByte"; }
    public String getConditionBeanTypeName() { return null; }
    public String getDaoTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdBookContainsDoubleByte> getEntityType() { return LdBookContainsDoubleByte.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdBookContainsDoubleByte newMyEntity() { return new LdBookContainsDoubleByte(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdBookContainsDoubleByte)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdBookContainsDoubleByte)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdBookContainsDoubleByte>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsBookId(), columnBookId());
        setupEps(_epsMap, new EpsBookNameWithSpace(), columnBookNameWithSpace());
        setupEps(_epsMap, new EpsCollectionCount(), columnCollectionCount());
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
        findEps(_epsMap, propertyName).setup((LdBookContainsDoubleByte)entity, value);
    }
    
    public static class EpsBookId implements Eps<LdBookContainsDoubleByte> {
        public void setup(LdBookContainsDoubleByte e, Object v) { e.setBookId((Integer)v); }
    }
    public static class EpsBookNameWithSpace implements Eps<LdBookContainsDoubleByte> {
        public void setup(LdBookContainsDoubleByte e, Object v) { e.setBookNameWithSpace((String)v); }
    }
    public static class EpsCollectionCount implements Eps<LdBookContainsDoubleByte> {
        public void setup(LdBookContainsDoubleByte e, Object v) { e.setCollectionCount((Integer)v); }
    }
    public static class EpsRUser implements Eps<LdBookContainsDoubleByte> {
        public void setup(LdBookContainsDoubleByte e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdBookContainsDoubleByte> {
        public void setup(LdBookContainsDoubleByte e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdBookContainsDoubleByte> {
        public void setup(LdBookContainsDoubleByte e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdBookContainsDoubleByte> {
        public void setup(LdBookContainsDoubleByte e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdBookContainsDoubleByte> {
        public void setup(LdBookContainsDoubleByte e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdBookContainsDoubleByte> {
        public void setup(LdBookContainsDoubleByte e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}
